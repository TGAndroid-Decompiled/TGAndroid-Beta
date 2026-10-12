package org.telegram.messenger;

import android.os.Looper;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class RecordedAudioTranscriptionRequest implements NotificationCenter.NotificationCenterDelegate {
    private static final long REQUEST_TIMEOUT_MS = 300000;
    private final int account;
    private boolean finished;
    private final Listener listener;
    private final MessageObject message;
    private boolean observing;
    private int requestToken;
    private final Runnable timeoutRunnable = new jh(this, 5);
    private long transcriptionId;

    public enum FailureReason {
        INVALID_MESSAGE,
        REQUEST_FAILED,
        TIMEOUT
    }

    public interface Listener {
        void onCompleted(String str);

        void onError(FailureReason failureReason, TLRPC.TL_error tL_error);

        void onProgress(String str);
    }

    private RecordedAudioTranscriptionRequest(MessageObject messageObject, Listener listener) {
        this.message = messageObject;
        this.listener = listener;
        this.account = messageObject.currentAccount;
    }

    private void complete(String str) {
        if (this.finished) {
            return;
        }
        this.finished = true;
        this.requestToken = 0;
        stopObserving();
        this.listener.onCompleted(str);
    }

    private void fail(FailureReason failureReason, TLRPC.TL_error tL_error) {
        if (this.finished) {
            return;
        }
        this.finished = true;
        int i10 = this.requestToken;
        this.requestToken = 0;
        stopObserving();
        if (i10 != 0) {
            ConnectionsManager.getInstance(this.account).cancelRequest(i10, true);
        }
        this.listener.onError(failureReason, tL_error);
    }

    public void lambda$startInternal$1(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (this.finished) {
            return;
        }
        this.requestToken = 0;
        if (!(tLObject instanceof TLRPC.TL_messages_transcribedAudio)) {
            fail(FailureReason.REQUEST_FAILED, tL_error);
            return;
        }
        TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) tLObject;
        this.transcriptionId = tL_messages_transcribedAudio.transcription_id;
        String str = tL_messages_transcribedAudio.text;
        if (str == null) {
            str = "";
        }
        if (tL_messages_transcribedAudio.pending) {
            this.listener.onProgress(str);
        } else {
            complete(str);
        }
    }

    private boolean isValidMessage() {
        MessageObject messageObject = this.message;
        if (messageObject.messageOwner != null && messageObject.isSent()) {
            MessageObject messageObject2 = this.message;
            TLRPC.Message message = messageObject2.messageOwner;
            if (message.f19824id > 0 && message.peer_id != null) {
                if (messageObject2.isVoice() || this.message.isRoundVideo()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public void lambda$new$0() {
        fail(FailureReason.TIMEOUT, null);
    }

    public void lambda$startInternal$2(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new m8(this, tLObject, tL_error, 22));
    }

    private static void requireMainThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("Transcription requests must use the main thread");
    }

    public static RecordedAudioTranscriptionRequest start(MessageObject messageObject, Listener listener) {
        requireMainThread();
        RecordedAudioTranscriptionRequest recordedAudioTranscriptionRequest = new RecordedAudioTranscriptionRequest(messageObject, listener);
        recordedAudioTranscriptionRequest.startInternal();
        return recordedAudioTranscriptionRequest;
    }

    private void startInternal() {
        if (!isValidMessage()) {
            fail(FailureReason.INVALID_MESSAGE, null);
            return;
        }
        TLRPC.TL_messages_transcribeAudio tL_messages_transcribeAudio = new TLRPC.TL_messages_transcribeAudio();
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(this.account).getInputPeer(this.message.messageOwner.peer_id);
        tL_messages_transcribeAudio.peer = inputPeer;
        tL_messages_transcribeAudio.msg_id = this.message.messageOwner.f19824id;
        if (inputPeer == null) {
            fail(FailureReason.INVALID_MESSAGE, null);
            return;
        }
        NotificationCenter.getInstance(this.account).addObserver(this, NotificationCenter.voiceTranscriptionUpdate);
        this.observing = true;
        AndroidUtilities.runOnUIThread(this.timeoutRunnable, 300000L);
        this.requestToken = ConnectionsManager.getInstance(this.account).sendRequest(tL_messages_transcribeAudio, new i0(this, 7));
    }

    private void stopObserving() {
        AndroidUtilities.cancelRunOnUIThread(this.timeoutRunnable);
        if (!this.observing) {
            return;
        }
        this.observing = false;
        NotificationCenter.getInstance(this.account).removeObserver(this, NotificationCenter.voiceTranscriptionUpdate);
    }

    public void cancel() {
        requireMainThread();
        if (!this.finished) {
            this.finished = true;
            int i10 = this.requestToken;
            this.requestToken = 0;
            stopObserving();
            if (i10 != 0) {
                ConnectionsManager.getInstance(this.account).cancelRequest(i10, true);
            }
        }
    }

    @Override
    public void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        if (!this.finished && i10 == NotificationCenter.voiceTranscriptionUpdate && i11 == this.account && objArr.length >= 5) {
            Object obj = objArr[1];
            if ((obj instanceof Long) && ((Long) obj).longValue() == this.transcriptionId) {
                Object obj2 = objArr[2];
                if (obj2 instanceof String) {
                    str = (String) obj2;
                } else {
                    str = "";
                }
                Object obj3 = objArr[4];
                if ((obj3 instanceof Boolean) && ((Boolean) obj3).booleanValue()) {
                    complete(str);
                } else {
                    this.listener.onProgress(str);
                }
            }
        }
    }

    public boolean isFinished() {
        requireMainThread();
        return this.finished;
    }
}
