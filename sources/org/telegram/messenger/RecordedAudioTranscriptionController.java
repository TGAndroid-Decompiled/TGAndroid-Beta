package org.telegram.messenger;

import android.os.Looper;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.RecordedAudioTranscriptionRequest;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class RecordedAudioTranscriptionController implements NotificationCenter.NotificationCenterDelegate {
    private static final long DELIVERY_TIMEOUT_MS = 300000;
    private static final String MESSAGE_TAG = "recorded_audio_transcription";
    private final int account;
    private boolean cancelled;
    private boolean finished;
    private final Listener listener;
    private int localMessageId;
    private boolean observing;
    private int savedMessageId;
    private final long selfDialogId;
    private final TLRPC.TL_document sourceDocument;
    private final File sourceFile;
    private RecordedAudioTranscriptionRequest transcriptionRequest;
    private long trimEndMs;
    private long trimStartMs;
    private File uploadFile;
    private final Runnable deliveryTimeoutRunnable = new wh(this, 0);
    private final String requestTag = Long.toHexString(Utilities.random.nextLong());

    public enum FailureReason {
        INVALID_SOURCE,
        COPY_FAILED,
        SEND_FAILED,
        TRANSCRIPTION_FAILED,
        TIMEOUT
    }

    public interface Listener {
        void onCompleted(String str);

        void onError(FailureReason failureReason);

        void onProgress(String str);
    }

    private RecordedAudioTranscriptionController(int i10, File file, TLRPC.TL_document tL_document, Listener listener) {
        this.account = i10;
        this.sourceFile = file;
        this.sourceDocument = tL_document;
        this.listener = listener;
        this.selfDialogId = UserConfig.getInstance(i10).getClientUserId();
    }

    private void cleanup(boolean z10) {
        stopObserving();
        RecordedAudioTranscriptionRequest recordedAudioTranscriptionRequest = this.transcriptionRequest;
        if (recordedAudioTranscriptionRequest != null) {
            recordedAudioTranscriptionRequest.cancel();
            this.transcriptionRequest = null;
        }
        if (z10 && this.savedMessageId > 0) {
            ArrayList<Integer> arrayList = new ArrayList<>(1);
            arrayList.add(Integer.valueOf(this.savedMessageId));
            MessagesController.getInstance(this.account).deleteMessages(arrayList, null, null, this.selfDialogId, 0, true, 0);
        }
        File file = this.uploadFile;
        this.uploadFile = null;
        if (file != null) {
            Utilities.globalQueue.postRunnable(new jh(file, 4));
        }
    }

    public void complete(String str) {
        if (this.finished) {
            return;
        }
        this.finished = true;
        cleanup(true);
        this.listener.onCompleted(str);
    }

    private TLRPC.TL_document copyDocumentForUpload() {
        String str;
        double d;
        byte[] bArr;
        TLRPC.TL_document tL_document = new TLRPC.TL_document();
        tL_document.file_reference = new byte[0];
        tL_document.dc_id = Integer.MIN_VALUE;
        tL_document.f19808id = SharedConfig.getLastLocalId();
        tL_document.user_id = this.selfDialogId;
        tL_document.date = ConnectionsManager.getInstance(this.account).getCurrentTime();
        if (TextUtils.isEmpty(this.sourceDocument.mime_type)) {
            str = "audio/ogg";
        } else {
            str = this.sourceDocument.mime_type;
        }
        tL_document.mime_type = str;
        tL_document.size = (int) Math.min(2147483647L, this.uploadFile.length());
        SharedConfig.saveConfig();
        for (int i10 = 0; i10 < this.sourceDocument.attributes.size(); i10++) {
            TLRPC.DocumentAttribute documentAttribute = this.sourceDocument.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                tL_documentAttributeAudio.voice = true;
                long j3 = this.trimEndMs;
                long j10 = this.trimStartMs;
                if (j3 > j10) {
                    d = (j3 - j10) / 1000.0d;
                } else {
                    d = documentAttribute.duration;
                }
                tL_documentAttributeAudio.duration = d;
                if (j3 <= j10 && (bArr = documentAttribute.waveform) != null && bArr.length > 0) {
                    tL_documentAttributeAudio.waveform = (byte[]) bArr.clone();
                    tL_documentAttributeAudio.flags |= 4;
                }
                tL_document.attributes.add(tL_documentAttributeAudio);
            }
        }
        if (tL_document.attributes.isEmpty()) {
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio2 = new TLRPC.TL_documentAttributeAudio();
            tL_documentAttributeAudio2.voice = true;
            tL_document.attributes.add(tL_documentAttributeAudio2);
        }
        return tL_document;
    }

    public void fail(FailureReason failureReason, boolean z10) {
        if (!this.finished) {
            this.finished = true;
            cleanup(z10);
            if (!this.cancelled) {
                this.listener.onError(failureReason);
            }
        }
    }

    public void finishSilently(boolean z10) {
        if (this.finished) {
            return;
        }
        this.finished = true;
        cleanup(z10);
    }

    public static void lambda$cleanup$3(File file) {
        if (file.exists() && !file.delete() && BuildVars.LOGS_ENABLED) {
            FileLog.d("Unable to delete transcription upload copy: " + file);
        }
    }

    public void lambda$new$0() {
        fail(FailureReason.TIMEOUT, true);
    }

    public void lambda$startInternal$1(boolean z10) {
        if (this.cancelled) {
            finishSilently(false);
        } else if (!z10) {
            fail(FailureReason.COPY_FAILED, false);
        } else {
            sendCopyToSavedMessages();
        }
    }

    public void lambda$startInternal$2() {
        boolean z10;
        boolean z11 = false;
        try {
            if (this.trimEndMs > this.trimStartMs) {
                z10 = MediaController.cropOpusFile(this.sourceFile.getAbsolutePath(), this.uploadFile.getAbsolutePath(), this.trimStartMs, this.trimEndMs);
            } else {
                z10 = AndroidUtilities.copyFile(this.sourceFile, this.uploadFile);
            }
        } catch (Exception e7) {
            FileLog.e("Unable to copy voice recording for transcription", e7);
            z10 = false;
        }
        if (z10 && this.uploadFile.isFile() && this.uploadFile.length() > 0) {
            z11 = true;
        }
        AndroidUtilities.runOnUIThread(new bi.f(12, this, z11));
    }

    private static void requireMainThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("Transcription must be controlled from the main thread");
    }

    private void sendCopyToSavedMessages() {
        TLRPC.TL_document copyDocumentForUpload = copyDocumentForUpload();
        HashMap hashMap = new HashMap(1);
        hashMap.put("recorded_audio_transcription", this.requestTag);
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.account);
        notificationCenter.addObserver(this, NotificationCenter.messageReceivedByServer2);
        notificationCenter.addObserver(this, NotificationCenter.messageSendError);
        this.observing = true;
        AndroidUtilities.runOnUIThread(this.deliveryTimeoutRunnable, 300000L);
        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(copyDocumentForUpload, null, this.uploadFile.getAbsolutePath(), this.selfDialogId, null, null, null, null, null, hashMap, false, 0, 0, 0, null, null, false);
        SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(this.account);
        sendMessagesHelper.sendMessage(of2);
        this.localMessageId = sendMessagesHelper.getSendingMessageId(this.selfDialogId);
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("Recorded audio transcription upload started: localId=" + this.localMessageId + ", bytes=" + this.uploadFile.length());
        }
    }

    public static RecordedAudioTranscriptionController start(int i10, File file, TLRPC.TL_document tL_document, Listener listener) {
        return start(i10, file, tL_document, 0L, 0L, listener);
    }

    private void startInternal() {
        if (this.sourceFile.isFile() && this.sourceFile.length() > 0 && this.selfDialogId != 0) {
            File directory = FileLoader.getDirectory(4);
            StringBuilder sb2 = new StringBuilder("voice_transcription_");
            sb2.append(System.currentTimeMillis());
            sb2.append("_");
            this.uploadFile = new File(directory, a1.g.t(sb2, this.requestTag, ".ogg"));
            Utilities.globalQueue.postRunnable(new wh(this, 1));
            return;
        }
        fail(FailureReason.INVALID_SOURCE, false);
    }

    private void stopObserving() {
        AndroidUtilities.cancelRunOnUIThread(this.deliveryTimeoutRunnable);
        if (!this.observing) {
            return;
        }
        this.observing = false;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.account);
        notificationCenter.removeObserver(this, NotificationCenter.messageReceivedByServer2);
        notificationCenter.removeObserver(this, NotificationCenter.messageSendError);
    }

    public void cancel() {
        requireMainThread();
        if (!this.finished && !this.cancelled) {
            this.cancelled = true;
            RecordedAudioTranscriptionRequest recordedAudioTranscriptionRequest = this.transcriptionRequest;
            if (recordedAudioTranscriptionRequest != null) {
                recordedAudioTranscriptionRequest.cancel();
                this.transcriptionRequest = null;
            }
            if (this.savedMessageId > 0) {
                finishSilently(true);
            }
        }
    }

    @Override
    public void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        boolean z10;
        if (i11 == this.account && !this.finished && this.observing) {
            if (i10 == NotificationCenter.messageSendError) {
                if (objArr.length > 0) {
                    Object obj = objArr[0];
                    if ((obj instanceof Integer) && this.localMessageId != 0 && ((Integer) obj).intValue() == this.localMessageId) {
                        fail(FailureReason.SEND_FAILED, false);
                    }
                }
            } else if (i10 == NotificationCenter.messageReceivedByServer2 && objArr.length >= 4 && (objArr[2] instanceof TLRPC.Message)) {
                Object obj2 = objArr[3];
                if ((obj2 instanceof Long) && ((Long) obj2).longValue() == this.selfDialogId) {
                    TLRPC.Message message = (TLRPC.Message) objArr[2];
                    HashMap<String, String> hashMap = message.params;
                    if (hashMap == null) {
                        str = null;
                    } else {
                        str = hashMap.get("recorded_audio_transcription");
                    }
                    File file = this.uploadFile;
                    if (file != null && file.getAbsolutePath().equals(message.attachPath)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.requestTag.equals(str) || z10) {
                        this.savedMessageId = message.f19823id;
                        stopObserving();
                        if (BuildVars.LOGS_ENABLED) {
                            v0.o(this.savedMessageId, new StringBuilder("Recorded audio transcription upload completed: messageId="));
                        }
                        if (this.cancelled) {
                            finishSilently(true);
                        } else {
                            this.transcriptionRequest = RecordedAudioTranscriptionRequest.start(new MessageObject(this.account, message, false, true), new RecordedAudioTranscriptionRequest.Listener() {
                                {
                                    RecordedAudioTranscriptionController.this = this;
                                }

                                @Override
                                public void onCompleted(String str2) {
                                    if (!RecordedAudioTranscriptionController.this.finished) {
                                        RecordedAudioTranscriptionController.this.transcriptionRequest = null;
                                        if (RecordedAudioTranscriptionController.this.cancelled) {
                                            RecordedAudioTranscriptionController.this.finishSilently(true);
                                        } else {
                                            RecordedAudioTranscriptionController.this.complete(str2);
                                        }
                                    }
                                }

                                @Override
                                public void onError(RecordedAudioTranscriptionRequest.FailureReason failureReason, TLRPC.TL_error tL_error) {
                                    RecordedAudioTranscriptionController.this.transcriptionRequest = null;
                                    if (RecordedAudioTranscriptionController.this.cancelled) {
                                        RecordedAudioTranscriptionController.this.finishSilently(true);
                                    } else {
                                        RecordedAudioTranscriptionController.this.fail(FailureReason.TRANSCRIPTION_FAILED, true);
                                    }
                                }

                                @Override
                                public void onProgress(String str2) {
                                    if (!RecordedAudioTranscriptionController.this.cancelled && !RecordedAudioTranscriptionController.this.finished) {
                                        RecordedAudioTranscriptionController.this.listener.onProgress(str2);
                                    }
                                }
                            });
                        }
                    }
                }
            }
        }
    }

    public boolean isFinished() {
        requireMainThread();
        if (!this.finished && !this.cancelled) {
            return false;
        }
        return true;
    }

    public static RecordedAudioTranscriptionController start(int i10, File file, TLRPC.TL_document tL_document, long j3, long j10, Listener listener) {
        requireMainThread();
        RecordedAudioTranscriptionController recordedAudioTranscriptionController = new RecordedAudioTranscriptionController(i10, file, tL_document, listener);
        recordedAudioTranscriptionController.trimStartMs = Math.max(0L, j3);
        recordedAudioTranscriptionController.trimEndMs = j10;
        recordedAudioTranscriptionController.startInternal();
        return recordedAudioTranscriptionController;
    }
}
