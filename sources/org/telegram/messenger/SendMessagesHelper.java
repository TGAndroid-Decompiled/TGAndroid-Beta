package org.telegram.messenger;

import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Spannable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.webkit.MimeTypeMap;
import android.widget.Toast;
import androidx.collection.LongSparseArray;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import j$.util.Objects;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.QuickAckDelegate;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFileDrawable;
import org.telegram.ui.Components.Point;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.Reactions.ReactionsUtils;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.TON.TONIntroActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.TwoStepVerificationSetupActivity;

public class SendMessagesHelper extends BaseController implements NotificationCenter.NotificationCenterDelegate {
    private static final int ERROR_TYPE_FILE_TOO_LARGE = 2;
    private static final int ERROR_TYPE_UNSUPPORTED = 1;
    private static volatile SendMessagesHelper[] Instance = null;
    public static final int MEDIA_TYPE_DICE = 11;
    public static final int MEDIA_TYPE_STORY = 12;
    private static DispatchQueue mediaSendQueue = new DispatchQueue("mediaSendQueue");
    private static ThreadPoolExecutor mediaSendThreadPool;
    private final HashMap<String, ArrayList<DelayedMessage>> delayedMessages;
    private final SparseArray<TLRPC.Message> editingMessages;
    private final HashMap<String, ImportingHistory> importingHistoryFiles;
    private final LongSparseArray importingHistoryMap;
    private final HashMap<String, ImportingStickers> importingStickersFiles;
    private final HashMap<String, ImportingStickers> importingStickersMap;
    private LocationProvider locationProvider;
    private final SparseArray<TLRPC.Message> sendingMessages;
    private final LongSparseArray sendingMessagesIdDialogs;
    private final SparseArray<MessageObject> unsentMessages;
    private final SparseArray<TLRPC.Message> uploadMessages;
    private final LongSparseArray uploadingMessagesIdDialogs;
    private final LongSparseArray voteSendTime;
    private final HashMap<String, Boolean> waitingForCallback;
    private final HashMap<String, List<String>> waitingForCallbackMap;
    private final HashMap<String, MessageObject> waitingForLocation;
    private final HashMap<Integer, Boolean> waitingForTodoUpdate;
    private final HashMap<String, byte[]> waitingForVote;

    public static class SendingMediaInfo {
        public boolean canDeleteAfter;
        public String caption;
        public String coverPath;
        public TLRPC.Photo coverPhoto;
        public TLRPC.VideoSize emojiMarkup;
        public ArrayList<TLRPC.MessageEntity> entities;
        public boolean forceImage;
        public boolean hasMediaSpoilers;
        public boolean highQuality;
        public TLRPC.BotInlineResult inlineResult;
        public boolean isVideo;
        public ArrayList<TLRPC.InputDocument> masks;
        public MediaController.PhotoEntry originalPhotoEntry;
        public String paintPath;
        public HashMap<String, String> params;
        public String path;
        public MediaController.SearchImage searchImage;
        public long stars;
        public String thumbPath;
        public int ttl;
        public boolean updateStickersOrder;
        public Uri uri;
        public VideoEditedInfo videoEditedInfo;
    }

    public static void lambda$sendCallback$32(String str) {
    }

    public static boolean checkUpdateStickersOrder(CharSequence charSequence) {
        if (charSequence instanceof Spannable) {
            for (AnimatedEmojiSpan animatedEmojiSpan : (AnimatedEmojiSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), AnimatedEmojiSpan.class)) {
                if (animatedEmojiSpan.fromEmojiKeyboard) {
                    return true;
                }
            }
        }
        return false;
    }

    public TLRPC.InputReplyTo createReplyInput(TL_stories.StoryItem storyItem) {
        TLRPC.TL_inputReplyToStory tL_inputReplyToStory = new TLRPC.TL_inputReplyToStory();
        tL_inputReplyToStory.story_id = storyItem.id;
        tL_inputReplyToStory.peer = getMessagesController().getInputPeer(storyItem.dialogId);
        return tL_inputReplyToStory;
    }

    public TLRPC.InputReplyTo createReplyInput(int i) {
        return createReplyInput(null, i, 0, null);
    }

    public TLRPC.InputReplyTo createReplyInput(TLRPC.InputPeer inputPeer, int i, int i2, ChatActivity.ReplyQuote replyQuote) {
        MessageObject messageObject;
        TLRPC.TodoItem todoItem;
        TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
        tL_inputReplyToMessage.reply_to_msg_id = i;
        if (i2 != 0) {
            tL_inputReplyToMessage.flags |= 1;
            tL_inputReplyToMessage.top_msg_id = i2;
        }
        if (replyQuote != null && replyQuote.todo && (todoItem = replyQuote.task) != null) {
            tL_inputReplyToMessage.flags |= 64;
            tL_inputReplyToMessage.todo_item_id = todoItem.id;
        } else if (replyQuote != null && !replyQuote.todo) {
            String text = replyQuote.getText();
            tL_inputReplyToMessage.quote_text = text;
            if (!TextUtils.isEmpty(text)) {
                tL_inputReplyToMessage.flags |= 4;
                ArrayList<TLRPC.MessageEntity> entities = replyQuote.getEntities();
                tL_inputReplyToMessage.quote_entities = entities;
                if (entities != null && !entities.isEmpty()) {
                    tL_inputReplyToMessage.quote_entities = new ArrayList<>(tL_inputReplyToMessage.quote_entities);
                    tL_inputReplyToMessage.flags |= 8;
                }
                tL_inputReplyToMessage.flags |= 16;
                tL_inputReplyToMessage.quote_offset = replyQuote.start;
            }
        }
        if (replyQuote != null && (messageObject = replyQuote.message) != null) {
            TLRPC.InputPeer inputPeer2 = getMessagesController().getInputPeer(messageObject.getDialogId());
            if (inputPeer2 != null && !MessageObject.peersEqual(inputPeer2, inputPeer)) {
                tL_inputReplyToMessage.flags |= 2;
                tL_inputReplyToMessage.reply_to_peer_id = inputPeer2;
            }
        }
        return tL_inputReplyToMessage;
    }

    public TLRPC.InputReplyTo createReplyInput(TLRPC.TL_messageReplyHeader tL_messageReplyHeader) {
        TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
        tL_inputReplyToMessage.reply_to_msg_id = tL_messageReplyHeader.reply_to_msg_id;
        int i = tL_messageReplyHeader.flags;
        if ((i & 2) != 0) {
            tL_inputReplyToMessage.flags |= 1;
            tL_inputReplyToMessage.top_msg_id = tL_messageReplyHeader.reply_to_top_id;
        }
        if ((i & 1) != 0) {
            tL_inputReplyToMessage.flags |= 2;
            tL_inputReplyToMessage.reply_to_peer_id = MessagesController.getInstance(this.currentAccount).getInputPeer(tL_messageReplyHeader.reply_to_peer_id);
        }
        if (tL_messageReplyHeader.quote) {
            int i2 = tL_messageReplyHeader.flags;
            if ((i2 & 64) != 0) {
                tL_inputReplyToMessage.flags |= 4;
                tL_inputReplyToMessage.quote_text = tL_messageReplyHeader.quote_text;
            }
            if ((i2 & 128) != 0) {
                tL_inputReplyToMessage.flags |= 8;
                tL_inputReplyToMessage.quote_entities = tL_messageReplyHeader.quote_entities;
            }
            if ((i2 & 1024) != 0) {
                tL_inputReplyToMessage.flags |= 16;
                tL_inputReplyToMessage.quote_offset = tL_messageReplyHeader.quote_offset;
            }
        }
        if ((tL_messageReplyHeader.flags & 2048) != 0) {
            tL_inputReplyToMessage.flags |= 64;
            tL_inputReplyToMessage.todo_item_id = tL_messageReplyHeader.todo_item_id;
        }
        return tL_inputReplyToMessage;
    }

    public class ImportingHistory {
        public long dialogId;
        public double estimatedUploadSpeed;
        public String historyPath;
        public long importId;
        private long lastUploadSize;
        private long lastUploadTime;
        public TLRPC.InputPeer peer;
        public long totalSize;
        public int uploadProgress;
        public long uploadedSize;
        public ArrayList<Uri> mediaPaths = new ArrayList<>();
        public HashSet<String> uploadSet = new HashSet<>();
        public HashMap<String, Float> uploadProgresses = new HashMap<>();
        public HashMap<String, Long> uploadSize = new HashMap<>();
        public ArrayList<String> uploadMedia = new ArrayList<>();
        public int timeUntilFinish = Integer.MAX_VALUE;

        public ImportingHistory() {
        }

        public void initImport(TLRPC.InputFile inputFile) {
            TLRPC.TL_messages_initHistoryImport tL_messages_initHistoryImport = new TLRPC.TL_messages_initHistoryImport();
            tL_messages_initHistoryImport.file = inputFile;
            tL_messages_initHistoryImport.media_count = this.mediaPaths.size();
            tL_messages_initHistoryImport.peer = this.peer;
            SendMessagesHelper.this.getConnectionsManager().sendRequest(tL_messages_initHistoryImport, new AnonymousClass1(tL_messages_initHistoryImport), 2);
        }

        class AnonymousClass1 implements RequestDelegate {
            final TLRPC.TL_messages_initHistoryImport val$req;

            AnonymousClass1(TLRPC.TL_messages_initHistoryImport tL_messages_initHistoryImport) {
                this.val$req = tL_messages_initHistoryImport;
            }

            @Override
            public void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final TLRPC.TL_messages_initHistoryImport tL_messages_initHistoryImport = this.val$req;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$run$0(tLObject, tL_messages_initHistoryImport, tL_error);
                    }
                });
            }

            public void lambda$run$0(TLObject tLObject, TLRPC.TL_messages_initHistoryImport tL_messages_initHistoryImport, TLRPC.TL_error tL_error) {
                if (!(tLObject instanceof TLRPC.TL_messages_historyImport)) {
                    SendMessagesHelper.this.importingHistoryMap.remove(ImportingHistory.this.dialogId);
                    SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(ImportingHistory.this.dialogId), tL_messages_initHistoryImport, tL_error);
                    return;
                }
                ImportingHistory importingHistory = ImportingHistory.this;
                importingHistory.importId = ((TLRPC.TL_messages_historyImport) tLObject).id;
                importingHistory.uploadSet.remove(importingHistory.historyPath);
                SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(ImportingHistory.this.dialogId));
                if (ImportingHistory.this.uploadSet.isEmpty()) {
                    ImportingHistory.this.startImport();
                }
                ImportingHistory.this.lastUploadTime = SystemClock.elapsedRealtime();
                int size = ImportingHistory.this.uploadMedia.size();
                for (int i = 0; i < size; i++) {
                    SendMessagesHelper.this.getFileLoader().uploadFile(ImportingHistory.this.uploadMedia.get(i), false, true, 67108864);
                }
            }
        }

        public long getUploadedCount() {
            return this.uploadedSize;
        }

        public long getTotalCount() {
            return this.totalSize;
        }

        public void onFileFailedToUpload(String str) {
            if (str.equals(this.historyPath)) {
                SendMessagesHelper.this.importingHistoryMap.remove(this.dialogId);
                TLRPC.TL_error tL_error = new TLRPC.TL_error();
                tL_error.code = 400;
                tL_error.text = "IMPORT_UPLOAD_FAILED";
                SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(this.dialogId), new TLRPC.TL_messages_initHistoryImport(), tL_error);
                return;
            }
            this.uploadSet.remove(str);
        }

        public void addUploadProgress(String str, long j, float f) {
            this.uploadProgresses.put(str, Float.valueOf(f));
            this.uploadSize.put(str, Long.valueOf(j));
            this.uploadedSize = 0L;
            Iterator<Map.Entry<String, Long>> it = this.uploadSize.entrySet().iterator();
            while (it.hasNext()) {
                this.uploadedSize += it.next().getValue().longValue();
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (!str.equals(this.historyPath)) {
                long j2 = this.uploadedSize;
                if (j2 != this.lastUploadSize) {
                    if (jElapsedRealtime != this.lastUploadTime) {
                        double d = (j2 - r2) / ((jElapsedRealtime - r4) / 1000.0d);
                        double d2 = this.estimatedUploadSpeed;
                        if (d2 == 0.0d) {
                            this.estimatedUploadSpeed = d;
                        } else {
                            this.estimatedUploadSpeed = (d * 0.01d) + (d2 * 0.99d);
                        }
                        this.timeUntilFinish = (int) (((this.totalSize - j2) * 1000) / this.estimatedUploadSpeed);
                        this.lastUploadSize = j2;
                        this.lastUploadTime = jElapsedRealtime;
                    }
                }
            }
            int uploadedCount = (int) ((getUploadedCount() / getTotalCount()) * 100.0f);
            if (this.uploadProgress != uploadedCount) {
                this.uploadProgress = uploadedCount;
                SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(this.dialogId));
            }
        }

        public void onMediaImport(String str, long j, TLRPC.InputFile inputFile) {
            String lowerCase;
            addUploadProgress(str, j, 1.0f);
            TLRPC.TL_messages_uploadImportedMedia tL_messages_uploadImportedMedia = new TLRPC.TL_messages_uploadImportedMedia();
            tL_messages_uploadImportedMedia.peer = this.peer;
            tL_messages_uploadImportedMedia.import_id = this.importId;
            tL_messages_uploadImportedMedia.file_name = new File(str).getName();
            MimeTypeMap singleton = MimeTypeMap.getSingleton();
            int iLastIndexOf = tL_messages_uploadImportedMedia.file_name.lastIndexOf(46);
            if (iLastIndexOf == -1) {
                lowerCase = "txt";
            } else {
                lowerCase = tL_messages_uploadImportedMedia.file_name.substring(iLastIndexOf + 1).toLowerCase();
            }
            String mimeTypeFromExtension = singleton.getMimeTypeFromExtension(lowerCase);
            if (mimeTypeFromExtension == null) {
                if ("opus".equals(lowerCase)) {
                    mimeTypeFromExtension = "audio/opus";
                } else if ("webp".equals(lowerCase)) {
                    mimeTypeFromExtension = "image/webp";
                } else {
                    mimeTypeFromExtension = "text/plain";
                }
            }
            if (mimeTypeFromExtension.equals("image/jpg") || mimeTypeFromExtension.equals("image/jpeg")) {
                TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                tL_inputMediaUploadedPhoto.file = inputFile;
                tL_messages_uploadImportedMedia.media = tL_inputMediaUploadedPhoto;
            } else {
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                tL_inputMediaUploadedDocument.file = inputFile;
                tL_inputMediaUploadedDocument.mime_type = mimeTypeFromExtension;
                tL_messages_uploadImportedMedia.media = tL_inputMediaUploadedDocument;
            }
            SendMessagesHelper.this.getConnectionsManager().sendRequest(tL_messages_uploadImportedMedia, new AnonymousClass2(str), 2);
        }

        class AnonymousClass2 implements RequestDelegate {
            final String val$path;

            AnonymousClass2(String str) {
                this.val$path = str;
            }

            @Override
            public void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                final String str = this.val$path;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$run$0(str);
                    }
                });
            }

            public void lambda$run$0(String str) {
                ImportingHistory.this.uploadSet.remove(str);
                SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(ImportingHistory.this.dialogId));
                if (ImportingHistory.this.uploadSet.isEmpty()) {
                    ImportingHistory.this.startImport();
                }
            }
        }

        public void startImport() {
            TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport = new TLRPC.TL_messages_startHistoryImport();
            tL_messages_startHistoryImport.peer = this.peer;
            tL_messages_startHistoryImport.import_id = this.importId;
            SendMessagesHelper.this.getConnectionsManager().sendRequest(tL_messages_startHistoryImport, new AnonymousClass3(tL_messages_startHistoryImport));
        }

        class AnonymousClass3 implements RequestDelegate {
            final TLRPC.TL_messages_startHistoryImport val$req;

            AnonymousClass3(TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport) {
                this.val$req = tL_messages_startHistoryImport;
            }

            @Override
            public void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                final TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport = this.val$req;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$run$0(tL_error, tL_messages_startHistoryImport);
                    }
                });
            }

            public void lambda$run$0(TLRPC.TL_error tL_error, TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport) {
                SendMessagesHelper.this.importingHistoryMap.remove(ImportingHistory.this.dialogId);
                if (tL_error == null) {
                    SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(ImportingHistory.this.dialogId));
                } else {
                    SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(ImportingHistory.this.dialogId), tL_messages_startHistoryImport, tL_error);
                }
            }
        }

        public void setImportProgress(int i) {
            if (i == 100) {
                SendMessagesHelper.this.importingHistoryMap.remove(this.dialogId);
            }
            SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(this.dialogId));
        }
    }

    public static class ImportingSticker {
        public boolean animated;
        public String emoji;
        public TLRPC.TL_inputStickerSetItem item;
        public String mimeType;
        public String path;
        public boolean validated;
        public VideoEditedInfo videoEditedInfo;

        public void uploadMedia(int i, TLRPC.InputFile inputFile, Runnable runnable) {
            TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
            tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
            TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
            tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
            tL_inputMediaUploadedDocument.file = inputFile;
            tL_inputMediaUploadedDocument.mime_type = this.mimeType;
            ConnectionsManager.getInstance(i).sendRequest(tL_messages_uploadMedia, new AnonymousClass1(runnable), 2);
        }

        class AnonymousClass1 implements RequestDelegate {
            final Runnable val$onFinish;

            AnonymousClass1(Runnable runnable) {
                this.val$onFinish = runnable;
            }

            @Override
            public void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final Runnable runnable = this.val$onFinish;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$run$0(tLObject, runnable);
                    }
                });
            }

            public void lambda$run$0(TLObject tLObject, Runnable runnable) {
                if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
                    ImportingSticker.this.item = new TLRPC.TL_inputStickerSetItem();
                    ImportingSticker.this.item.document = new TLRPC.TL_inputDocument();
                    ImportingSticker importingSticker = ImportingSticker.this;
                    TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem = importingSticker.item;
                    TLRPC.InputDocument inputDocument = tL_inputStickerSetItem.document;
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject).document;
                    inputDocument.id = document.id;
                    inputDocument.access_hash = document.access_hash;
                    inputDocument.file_reference = document.file_reference;
                    String str = importingSticker.emoji;
                    if (str == null) {
                        str = "";
                    }
                    tL_inputStickerSetItem.emoji = str;
                    importingSticker.mimeType = document.mime_type;
                } else {
                    ImportingSticker importingSticker2 = ImportingSticker.this;
                    if (importingSticker2.animated) {
                        importingSticker2.mimeType = "application/x-bad-tgsticker";
                    }
                }
                runnable.run();
            }
        }
    }

    public class ImportingStickers {
        public double estimatedUploadSpeed;
        private long lastUploadSize;
        private long lastUploadTime;
        public String shortName;
        public String software;
        public String title;
        public long totalSize;
        public int uploadProgress;
        public long uploadedSize;
        public HashMap<String, ImportingSticker> uploadSet = new HashMap<>();
        public HashMap<String, Float> uploadProgresses = new HashMap<>();
        public HashMap<String, Long> uploadSize = new HashMap<>();
        public ArrayList<ImportingSticker> uploadMedia = new ArrayList<>();
        public int timeUntilFinish = Integer.MAX_VALUE;

        public ImportingStickers() {
        }

        public void initImport() {
            SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersImportProgressChanged, this.shortName);
            this.lastUploadTime = SystemClock.elapsedRealtime();
            int size = this.uploadMedia.size();
            for (int i = 0; i < size; i++) {
                SendMessagesHelper.this.getFileLoader().uploadFile(this.uploadMedia.get(i).path, false, true, 67108864);
            }
        }

        public long getUploadedCount() {
            return this.uploadedSize;
        }

        public long getTotalCount() {
            return this.totalSize;
        }

        public void onFileFailedToUpload(String str) {
            ImportingSticker importingStickerRemove = this.uploadSet.remove(str);
            if (importingStickerRemove != null) {
                this.uploadMedia.remove(importingStickerRemove);
            }
        }

        public void addUploadProgress(String str, long j, float f) {
            this.uploadProgresses.put(str, Float.valueOf(f));
            this.uploadSize.put(str, Long.valueOf(j));
            this.uploadedSize = 0L;
            Iterator<Map.Entry<String, Long>> it = this.uploadSize.entrySet().iterator();
            while (it.hasNext()) {
                this.uploadedSize += it.next().getValue().longValue();
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = this.uploadedSize;
            if (j2 != this.lastUploadSize) {
                if (jElapsedRealtime != this.lastUploadTime) {
                    double d = (j2 - r0) / ((jElapsedRealtime - r2) / 1000.0d);
                    double d2 = this.estimatedUploadSpeed;
                    if (d2 == 0.0d) {
                        this.estimatedUploadSpeed = d;
                    } else {
                        this.estimatedUploadSpeed = (d * 0.01d) + (d2 * 0.99d);
                    }
                    this.timeUntilFinish = (int) (((this.totalSize - j2) * 1000) / this.estimatedUploadSpeed);
                    this.lastUploadSize = j2;
                    this.lastUploadTime = jElapsedRealtime;
                }
            }
            int uploadedCount = (int) ((getUploadedCount() / getTotalCount()) * 100.0f);
            if (this.uploadProgress != uploadedCount) {
                this.uploadProgress = uploadedCount;
                SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersImportProgressChanged, this.shortName);
            }
        }

        public void onMediaImport(final String str, long j, TLRPC.InputFile inputFile) {
            addUploadProgress(str, j, 1.0f);
            ImportingSticker importingSticker = this.uploadSet.get(str);
            if (importingSticker == null) {
                return;
            }
            importingSticker.uploadMedia(SendMessagesHelper.this.currentAccount, inputFile, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onMediaImport$0(str);
                }
            });
        }

        public void lambda$onMediaImport$0(String str) {
            this.uploadSet.remove(str);
            SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersImportProgressChanged, this.shortName);
            if (this.uploadSet.isEmpty()) {
                startImport();
            }
        }

        public void startImport() {
            TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = new TLRPC.TL_stickers_createStickerSet();
            tL_stickers_createStickerSet.user_id = new TLRPC.TL_inputUserSelf();
            tL_stickers_createStickerSet.title = this.title;
            tL_stickers_createStickerSet.short_name = this.shortName;
            String str = this.software;
            if (str != null) {
                tL_stickers_createStickerSet.software = str;
                tL_stickers_createStickerSet.flags |= 8;
            }
            int size = this.uploadMedia.size();
            for (int i = 0; i < size; i++) {
                TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem = this.uploadMedia.get(i).item;
                if (tL_inputStickerSetItem != null) {
                    tL_stickers_createStickerSet.stickers.add(tL_inputStickerSetItem);
                }
            }
            SendMessagesHelper.this.getConnectionsManager().sendRequest(tL_stickers_createStickerSet, new AnonymousClass1(tL_stickers_createStickerSet));
        }

        class AnonymousClass1 implements RequestDelegate {
            final TLRPC.TL_stickers_createStickerSet val$req;

            AnonymousClass1(TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet) {
                this.val$req = tL_stickers_createStickerSet;
            }

            @Override
            public void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = this.val$req;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$run$0(tL_error, tL_stickers_createStickerSet, tLObject);
                    }
                });
            }

            public void lambda$run$0(TLRPC.TL_error tL_error, TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet, TLObject tLObject) {
                SendMessagesHelper.this.importingStickersMap.remove(ImportingStickers.this.shortName);
                if (tL_error == null) {
                    SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersImportProgressChanged, ImportingStickers.this.shortName);
                } else {
                    SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersImportProgressChanged, ImportingStickers.this.shortName, tL_stickers_createStickerSet, tL_error);
                }
                if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                    NotificationCenter notificationCenter = SendMessagesHelper.this.getNotificationCenter();
                    int i = NotificationCenter.stickersImportComplete;
                    if (notificationCenter.hasObservers(i)) {
                        SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i, tLObject);
                    } else {
                        SendMessagesHelper.this.getMediaDataController().toggleStickerSet(null, tLObject, 2, null, false, false);
                    }
                }
            }
        }

        public void setImportProgress(int i) {
            if (i == 100) {
                SendMessagesHelper.this.importingStickersMap.remove(this.shortName);
            }
            SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersImportProgressChanged, this.shortName);
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        mediaSendThreadPool = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        Instance = new SendMessagesHelper[4];
    }

    static class MediaSendPrepareWorker {
        public volatile String parentObject;
        public volatile TLRPC.TL_photo photo;
        public CountDownLatch sync;

        private MediaSendPrepareWorker() {
        }
    }

    public static class LocationProvider {
        private LocationProviderDelegate delegate;
        private GpsLocationListener gpsLocationListener;
        private Location lastKnownLocation;
        private LocationManager locationManager;
        private Runnable locationQueryCancelRunnable;
        private GpsLocationListener networkLocationListener;

        public interface LocationProviderDelegate {
            void onLocationAcquired(Location location);

            void onUnableLocationAcquire();
        }

        private class GpsLocationListener implements LocationListener {
            @Override
            public void onProviderDisabled(String str) {
            }

            @Override
            public void onProviderEnabled(String str) {
            }

            @Override
            public void onStatusChanged(String str, int i, Bundle bundle) {
            }

            private GpsLocationListener() {
            }

            @Override
            public void onLocationChanged(Location location) {
                if (location == null || LocationProvider.this.locationQueryCancelRunnable == null) {
                    return;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("found location " + location);
                }
                LocationProvider.this.lastKnownLocation = location;
                if (location.getAccuracy() < 100.0f) {
                    if (LocationProvider.this.delegate != null) {
                        LocationProvider.this.delegate.onLocationAcquired(location);
                    }
                    if (LocationProvider.this.locationQueryCancelRunnable != null) {
                        AndroidUtilities.cancelRunOnUIThread(LocationProvider.this.locationQueryCancelRunnable);
                    }
                    LocationProvider.this.cleanup();
                }
            }
        }

        public LocationProvider() {
            this.gpsLocationListener = new GpsLocationListener();
            this.networkLocationListener = new GpsLocationListener();
        }

        public LocationProvider(LocationProviderDelegate locationProviderDelegate) {
            this.gpsLocationListener = new GpsLocationListener();
            this.networkLocationListener = new GpsLocationListener();
            this.delegate = locationProviderDelegate;
        }

        public void setDelegate(LocationProviderDelegate locationProviderDelegate) {
            this.delegate = locationProviderDelegate;
        }

        public void cleanup() {
            this.locationManager.removeUpdates(this.gpsLocationListener);
            this.locationManager.removeUpdates(this.networkLocationListener);
            this.lastKnownLocation = null;
            this.locationQueryCancelRunnable = null;
        }

        public void start() {
            if (this.locationManager == null) {
                this.locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
            }
            try {
                this.locationManager.requestLocationUpdates("gps", 1L, 0.0f, this.gpsLocationListener);
            } catch (Exception e) {
                FileLog.e(e);
            }
            try {
                this.locationManager.requestLocationUpdates("network", 1L, 0.0f, this.networkLocationListener);
            } catch (Exception e2) {
                FileLog.e(e2);
            }
            try {
                Location lastKnownLocation = this.locationManager.getLastKnownLocation("gps");
                this.lastKnownLocation = lastKnownLocation;
                if (lastKnownLocation == null) {
                    this.lastKnownLocation = this.locationManager.getLastKnownLocation("network");
                }
            } catch (Exception e3) {
                FileLog.e(e3);
            }
            Runnable runnable = this.locationQueryCancelRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
            }
            Runnable runnable2 = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$start$0();
                }
            };
            this.locationQueryCancelRunnable = runnable2;
            AndroidUtilities.runOnUIThread(runnable2, 5000L);
        }

        public void lambda$start$0() {
            LocationProviderDelegate locationProviderDelegate = this.delegate;
            if (locationProviderDelegate != null) {
                Location location = this.lastKnownLocation;
                if (location != null) {
                    locationProviderDelegate.onLocationAcquired(location);
                } else {
                    locationProviderDelegate.onUnableLocationAcquire();
                }
            }
            cleanup();
        }

        public void stop() {
            if (this.locationManager == null) {
                return;
            }
            Runnable runnable = this.locationQueryCancelRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
            }
            cleanup();
        }
    }

    protected class DelayedMessageSendAfterRequest {
        public DelayedMessage delayedMessage;
        public MessageObject msgObj;
        public ArrayList<MessageObject> msgObjs;
        public String originalPath;
        public ArrayList<String> originalPaths;
        public Object parentObject;
        public ArrayList<Object> parentObjects;
        public TLObject request;
        public boolean scheduled;

        protected DelayedMessageSendAfterRequest() {
        }
    }

    protected class DelayedMessage {
        public TLRPC.InputFile coverFile;
        public TLRPC.PhotoSize coverPhotoSize;
        public TLRPC.EncryptedChat encryptedChat;
        public HashMap<Object, Object> extraHashMap;
        public int finalGroupMessage;
        public boolean forceReupload;
        public long groupId;
        public String httpLocation;
        public ArrayList<String> httpLocations;
        public ArrayList<TLRPC.InputMedia> inputMedias;
        public TLRPC.InputMedia inputUploadMedia;
        public TLObject locationParent;
        public ArrayList<TLRPC.PhotoSize> locations;
        public ArrayList<MessageObject> messageObjects;
        public ArrayList<TLRPC.Message> messages;
        public MessageObject obj;
        public String originalPath;
        public ArrayList<String> originalPaths;
        public boolean paidMedia;
        public Object parentObject;
        public ArrayList<Object> parentObjects;
        public long peer;
        public boolean performCoverUpload;
        public boolean performMediaUpload;
        public TLRPC.PhotoSize photoSize;
        ArrayList<DelayedMessageSendAfterRequest> requests;
        private boolean retriedToSend;
        public boolean[] retriedToSendArray;
        public boolean scheduled;
        public TLObject sendEncryptedRequest;
        public TLObject sendRequest;
        public int topMessageId;
        public int type;
        public VideoEditedInfo videoEditedInfo;
        public ArrayList<VideoEditedInfo> videoEditedInfos;

        public boolean getRetriedToSend(int i) {
            boolean[] zArr;
            if (i < 0 || (zArr = this.retriedToSendArray) == null || i >= zArr.length) {
                return this.retriedToSend;
            }
            return zArr[i];
        }

        public void setRetriedToSend(int i, boolean z) {
            if (i < 0) {
                this.retriedToSend = z;
                return;
            }
            if (this.retriedToSendArray == null) {
                this.retriedToSendArray = new boolean[this.messageObjects.size()];
            }
            this.retriedToSendArray[i] = z;
        }

        public DelayedMessage(long j) {
            this.peer = j;
        }

        public void initForGroup(long j) {
            this.type = 4;
            this.groupId = j;
            this.messageObjects = new ArrayList<>();
            this.messages = new ArrayList<>();
            this.inputMedias = new ArrayList<>();
            this.originalPaths = new ArrayList<>();
            this.parentObjects = new ArrayList<>();
            this.extraHashMap = new HashMap<>();
            this.locations = new ArrayList<>();
            this.httpLocations = new ArrayList<>();
            this.videoEditedInfos = new ArrayList<>();
        }

        public void addDelayedRequest(TLObject tLObject, MessageObject messageObject, String str, Object obj, DelayedMessage delayedMessage, boolean z) {
            DelayedMessageSendAfterRequest delayedMessageSendAfterRequest = SendMessagesHelper.this.new DelayedMessageSendAfterRequest();
            delayedMessageSendAfterRequest.request = tLObject;
            delayedMessageSendAfterRequest.msgObj = messageObject;
            delayedMessageSendAfterRequest.originalPath = str;
            delayedMessageSendAfterRequest.delayedMessage = delayedMessage;
            delayedMessageSendAfterRequest.parentObject = obj;
            delayedMessageSendAfterRequest.scheduled = z;
            if (this.requests == null) {
                this.requests = new ArrayList<>();
            }
            this.requests.add(delayedMessageSendAfterRequest);
        }

        public void addDelayedRequest(TLObject tLObject, ArrayList<MessageObject> arrayList, ArrayList<String> arrayList2, ArrayList<Object> arrayList3, DelayedMessage delayedMessage, boolean z) {
            DelayedMessageSendAfterRequest delayedMessageSendAfterRequest = SendMessagesHelper.this.new DelayedMessageSendAfterRequest();
            delayedMessageSendAfterRequest.request = tLObject;
            delayedMessageSendAfterRequest.msgObjs = arrayList;
            delayedMessageSendAfterRequest.originalPaths = arrayList2;
            delayedMessageSendAfterRequest.delayedMessage = delayedMessage;
            delayedMessageSendAfterRequest.parentObjects = arrayList3;
            delayedMessageSendAfterRequest.scheduled = z;
            if (this.requests == null) {
                this.requests = new ArrayList<>();
            }
            this.requests.add(delayedMessageSendAfterRequest);
        }

        public void sendDelayedRequests() {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.DelayedMessage.sendDelayedRequests():void");
        }

        public void markAsError() {
            if (this.type == 4) {
                for (int i = 0; i < this.messageObjects.size(); i++) {
                    MessageObject messageObject = this.messageObjects.get(i);
                    SendMessagesHelper.this.getMessagesStorage().markMessageAsSendError(messageObject.messageOwner, messageObject.scheduled ? 1 : 0);
                    TLRPC.Message message = messageObject.messageOwner;
                    message.send_state = 2;
                    message.errorAllowedPriceStars = 0L;
                    message.errorNewPriceStars = 0L;
                    SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageSendError, Integer.valueOf(messageObject.getId()));
                    SendMessagesHelper.this.processSentMessage(messageObject.getId());
                    SendMessagesHelper.this.removeFromUploadingMessages(messageObject.getId(), this.scheduled);
                }
                SendMessagesHelper.this.delayedMessages.remove("group_" + this.groupId);
            } else {
                MessagesStorage messagesStorage = SendMessagesHelper.this.getMessagesStorage();
                MessageObject messageObject2 = this.obj;
                messagesStorage.markMessageAsSendError(messageObject2.messageOwner, messageObject2.scheduled ? 1 : 0);
                TLRPC.Message message2 = this.obj.messageOwner;
                message2.send_state = 2;
                message2.errorAllowedPriceStars = 0L;
                message2.errorNewPriceStars = 0L;
                SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageSendError, Integer.valueOf(this.obj.getId()));
                SendMessagesHelper.this.processSentMessage(this.obj.getId());
                SendMessagesHelper.this.removeFromUploadingMessages(this.obj.getId(), this.scheduled);
            }
            sendDelayedRequests();
        }
    }

    public static SendMessagesHelper getInstance(int i) {
        SendMessagesHelper sendMessagesHelper = Instance[i];
        if (sendMessagesHelper == null) {
            synchronized (SendMessagesHelper.class) {
                try {
                    sendMessagesHelper = Instance[i];
                    if (sendMessagesHelper == null) {
                        SendMessagesHelper[] sendMessagesHelperArr = Instance;
                        SendMessagesHelper sendMessagesHelper2 = new SendMessagesHelper(i);
                        sendMessagesHelperArr[i] = sendMessagesHelper2;
                        sendMessagesHelper = sendMessagesHelper2;
                    }
                } finally {
                }
            }
        }
        return sendMessagesHelper;
    }

    public SendMessagesHelper(int i) {
        super(i);
        this.delayedMessages = new HashMap<>();
        this.unsentMessages = new SparseArray<>();
        this.sendingMessages = new SparseArray<>();
        this.editingMessages = new SparseArray<>();
        this.uploadMessages = new SparseArray<>();
        this.sendingMessagesIdDialogs = new LongSparseArray();
        this.uploadingMessagesIdDialogs = new LongSparseArray();
        this.waitingForLocation = new HashMap<>();
        this.waitingForCallback = new HashMap<>();
        this.waitingForCallbackMap = new HashMap<>();
        this.waitingForVote = new HashMap<>();
        this.voteSendTime = new LongSparseArray();
        this.importingHistoryFiles = new HashMap<>();
        this.importingHistoryMap = new LongSparseArray();
        this.importingStickersFiles = new HashMap<>();
        this.importingStickersMap = new HashMap<>();
        this.locationProvider = new LocationProvider(new LocationProvider.LocationProviderDelegate() {
            @Override
            public void onLocationAcquired(Location location) {
                SendMessagesHelper.this.sendLocation(location);
                SendMessagesHelper.this.waitingForLocation.clear();
            }

            @Override
            public void onUnableLocationAcquire() {
                SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.wasUnableToFindCurrentLocation, new HashMap(SendMessagesHelper.this.waitingForLocation));
                SendMessagesHelper.this.waitingForLocation.clear();
            }
        });
        this.waitingForTodoUpdate = new HashMap<>();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$0();
            }
        });
    }

    public void lambda$new$0() {
        getNotificationCenter().addObserver(this, NotificationCenter.fileUploaded);
        getNotificationCenter().addObserver(this, NotificationCenter.fileUploadProgressChanged);
        getNotificationCenter().addObserver(this, NotificationCenter.fileUploadFailed);
        getNotificationCenter().addObserver(this, NotificationCenter.filePreparingStarted);
        getNotificationCenter().addObserver(this, NotificationCenter.fileNewChunkAvailable);
        getNotificationCenter().addObserver(this, NotificationCenter.filePreparingFailed);
        getNotificationCenter().addObserver(this, NotificationCenter.httpFileDidFailedLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.httpFileDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.fileLoaded);
        getNotificationCenter().addObserver(this, NotificationCenter.fileLoadFailed);
    }

    public void cleanup() {
        this.delayedMessages.clear();
        this.unsentMessages.clear();
        this.sendingMessages.clear();
        this.editingMessages.clear();
        this.sendingMessagesIdDialogs.clear();
        this.uploadMessages.clear();
        this.uploadingMessagesIdDialogs.clear();
        this.waitingForLocation.clear();
        this.waitingForCallback.clear();
        this.waitingForVote.clear();
        this.importingHistoryFiles.clear();
        this.importingHistoryMap.clear();
        this.importingStickersFiles.clear();
        this.importingStickersMap.clear();
        this.locationProvider.stop();
    }

    @Override
    public void didReceivedNotification(int r30, int r31, java.lang.Object... r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public void lambda$didReceivedNotification$2(final File file, final MessageObject messageObject, final DelayedMessage delayedMessage, final String str) {
        final TLRPC.TL_photo tL_photoGeneratePhotoSizes = generatePhotoSizes(file.toString(), null);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$didReceivedNotification$1(tL_photoGeneratePhotoSizes, messageObject, file, delayedMessage, str);
            }
        });
    }

    public void lambda$didReceivedNotification$1(TLRPC.TL_photo tL_photo, MessageObject messageObject, File file, DelayedMessage delayedMessage, String str) {
        if (tL_photo != null) {
            TLRPC.Message message = messageObject.messageOwner;
            message.media.photo = tL_photo;
            message.attachPath = file.toString();
            ArrayList<TLRPC.Message> arrayList = new ArrayList<>();
            arrayList.add(messageObject.messageOwner);
            getMessagesStorage().putMessages(arrayList, false, true, false, 0, messageObject.scheduled ? 1 : 0, 0L);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateMessageMedia, messageObject.messageOwner);
            ArrayList<TLRPC.PhotoSize> arrayList2 = tL_photo.sizes;
            delayedMessage.photoSize = arrayList2.get(arrayList2.size() - 1);
            delayedMessage.locationParent = tL_photo;
            delayedMessage.httpLocation = null;
            if (delayedMessage.type == 4) {
                delayedMessage.performMediaUpload = true;
                performSendDelayedMessage(delayedMessage, delayedMessage.messageObjects.indexOf(messageObject));
                return;
            } else {
                performSendDelayedMessage(delayedMessage);
                return;
            }
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.e("can't load image " + str + " to file " + file.toString());
        }
        delayedMessage.markAsError();
    }

    public void lambda$didReceivedNotification$4(final DelayedMessage delayedMessage, final File file, final MessageObject messageObject) {
        final TLRPC.Document document = delayedMessage.obj.getDocument();
        if (document.thumbs.isEmpty() || (document.thumbs.get(0).location instanceof TLRPC.TL_fileLocationUnavailable)) {
            try {
                Bitmap bitmapLoadBitmap = ImageLoader.loadBitmap(file.getAbsolutePath(), null, 90.0f, 90.0f, true);
                if (bitmapLoadBitmap != null) {
                    document.thumbs.clear();
                    document.thumbs.add(ImageLoader.scaleAndSaveImage(bitmapLoadBitmap, 90.0f, 90.0f, 55, delayedMessage.sendEncryptedRequest != null));
                    bitmapLoadBitmap.recycle();
                }
            } catch (Exception e) {
                document.thumbs.clear();
                FileLog.e(e);
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$didReceivedNotification$3(delayedMessage, file, document, messageObject);
            }
        });
    }

    public void lambda$didReceivedNotification$3(DelayedMessage delayedMessage, File file, TLRPC.Document document, MessageObject messageObject) {
        delayedMessage.httpLocation = null;
        delayedMessage.obj.messageOwner.attachPath = file.toString();
        if (!document.thumbs.isEmpty()) {
            TLRPC.PhotoSize photoSize = document.thumbs.get(0);
            if (!(photoSize instanceof TLRPC.TL_photoStrippedSize)) {
                delayedMessage.photoSize = photoSize;
                delayedMessage.locationParent = document;
            }
        }
        ArrayList<TLRPC.Message> arrayList = new ArrayList<>();
        arrayList.add(messageObject.messageOwner);
        getMessagesStorage().putMessages(arrayList, false, true, false, 0, messageObject.scheduled ? 1 : 0, 0L);
        delayedMessage.performMediaUpload = true;
        performSendDelayedMessage(delayedMessage);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateMessageMedia, delayedMessage.obj.messageOwner);
    }

    private void revertEditingMessageObject(MessageObject messageObject) {
        messageObject.cancelEditing = true;
        TLRPC.Message message = messageObject.messageOwner;
        message.media = messageObject.previousMedia;
        message.message = messageObject.previousMessage;
        ArrayList<TLRPC.MessageEntity> arrayList = messageObject.previousMessageEntities;
        message.entities = arrayList;
        message.attachPath = messageObject.previousAttachPath;
        message.send_state = 0;
        if (arrayList != null) {
            message.flags |= 128;
        } else {
            message.flags &= -129;
        }
        messageObject.previousMedia = null;
        messageObject.previousMessage = null;
        messageObject.previousMessageEntities = null;
        messageObject.previousAttachPath = null;
        messageObject.videoEditedInfo = null;
        messageObject.type = -1;
        messageObject.setType();
        messageObject.caption = null;
        if (messageObject.type != 0) {
            messageObject.generateCaption();
        } else {
            messageObject.resetLayout();
        }
        ArrayList<TLRPC.Message> arrayList2 = new ArrayList<>();
        arrayList2.add(messageObject.messageOwner);
        getMessagesStorage().putMessages(arrayList2, false, true, false, 0, messageObject.scheduled ? 1 : 0, 0L);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(messageObject);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.replaceMessagesObjects, Long.valueOf(messageObject.getDialogId()), arrayList3);
    }

    public void cancelSendingMessage(MessageObject messageObject) {
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        arrayList.add(messageObject);
        if (messageObject != null && messageObject.type == 29) {
            Iterator<Map.Entry<String, ArrayList<DelayedMessage>>> it = this.delayedMessages.entrySet().iterator();
            DelayedMessage delayedMessage = null;
            while (it.hasNext()) {
                ArrayList<DelayedMessage> value = it.next().getValue();
                for (int i = 0; i < value.size(); i++) {
                    DelayedMessage delayedMessage2 = value.get(i);
                    if (delayedMessage2.type == 4) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= delayedMessage2.messageObjects.size()) {
                                break;
                            }
                            if (delayedMessage2.messageObjects.get(i2).getId() == messageObject.getId()) {
                                delayedMessage = delayedMessage2;
                                break;
                            }
                            i2++;
                        }
                    }
                    if (delayedMessage != null) {
                        break;
                    }
                }
            }
            if (delayedMessage != null) {
                arrayList.clear();
                arrayList.addAll(delayedMessage.messageObjects);
            }
        }
        cancelSendingMessage(arrayList);
    }

    public void cancelSendingMessage(java.util.ArrayList<org.telegram.messenger.MessageObject> r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.cancelSendingMessage(java.util.ArrayList):void");
    }

    public boolean retrySendMessage(MessageObject messageObject, boolean z, long j) {
        if (messageObject.getId() >= 0) {
            if (messageObject.isEditing()) {
                editMessage(messageObject, null, null, null, null, null, null, true, messageObject.hasMediaSpoilers(), messageObject);
            }
            return false;
        }
        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
        if (messageAction instanceof TLRPC.TL_messageEncryptedAction) {
            TLRPC.EncryptedChat encryptedChat = getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(messageObject.getDialogId())));
            if (encryptedChat == null) {
                getMessagesStorage().markMessageAsSendError(messageObject.messageOwner, messageObject.scheduled ? 1 : 0);
                messageObject.messageOwner.send_state = 2;
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageSendError, Integer.valueOf(messageObject.getId()));
                processSentMessage(messageObject.getId());
                return false;
            }
            TLRPC.Message message = messageObject.messageOwner;
            if (message.random_id == 0) {
                message.random_id = getNextRandomId();
            }
            TLRPC.DecryptedMessageAction decryptedMessageAction = messageObject.messageOwner.action.encryptedAction;
            if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) {
                getSecretChatHelper().sendTTLMessage(encryptedChat, messageObject.messageOwner);
            } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionDeleteMessages) {
                getSecretChatHelper().sendMessagesDeleteMessage(encryptedChat, null, messageObject.messageOwner);
            } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionFlushHistory) {
                getSecretChatHelper().sendClearHistoryMessage(encryptedChat, messageObject.messageOwner);
            } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionNotifyLayer) {
                getSecretChatHelper().sendNotifyLayerMessage(encryptedChat, messageObject.messageOwner);
            } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionReadMessages) {
                getSecretChatHelper().sendMessagesReadMessage(encryptedChat, null, messageObject.messageOwner);
            } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionScreenshotMessages) {
                getSecretChatHelper().sendScreenshotMessage(encryptedChat, null, messageObject.messageOwner);
            } else if (!(decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionTyping)) {
                if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionResend) {
                    getSecretChatHelper().sendResendMessage(encryptedChat, 0, 0, messageObject.messageOwner);
                } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionCommitKey) {
                    getSecretChatHelper().sendCommitKeyMessage(encryptedChat, messageObject.messageOwner);
                } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionAbortKey) {
                    getSecretChatHelper().sendAbortKeyMessage(encryptedChat, messageObject.messageOwner, 0L);
                } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionRequestKey) {
                    getSecretChatHelper().sendRequestKeyMessage(encryptedChat, messageObject.messageOwner);
                } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionAcceptKey) {
                    getSecretChatHelper().sendAcceptKeyMessage(encryptedChat, messageObject.messageOwner);
                } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionNoop) {
                    getSecretChatHelper().sendNoopMessage(encryptedChat, messageObject.messageOwner);
                }
            }
            return true;
        }
        if (messageAction instanceof TLRPC.TL_messageActionScreenshotTaken) {
            sendScreenshotMessage(getMessagesController().getUser(Long.valueOf(messageObject.getDialogId())), messageObject.getReplyMsgId(), messageObject.messageOwner);
        }
        if (z) {
            this.unsentMessages.put(messageObject.getId(), messageObject);
        }
        SendMessageParams sendMessageParamsOf = SendMessageParams.of(messageObject);
        sendMessageParamsOf.payStars = j;
        sendMessage(sendMessageParamsOf);
        return true;
    }

    protected void processSentMessage(int i) {
        int size = this.unsentMessages.size();
        this.unsentMessages.remove(i);
        if (size == 0 || this.unsentMessages.size() != 0) {
            return;
        }
        checkUnsentMessages();
    }

    public void processForwardFromMyName(org.telegram.messenger.MessageObject r36, long r37, long r39, long r41, org.telegram.messenger.MessageSuggestionParams r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.processForwardFromMyName(org.telegram.messenger.MessageObject, long, long, long, org.telegram.messenger.MessageSuggestionParams):void");
    }

    public void sendScreenshotMessage(TLRPC.User user, int i, TLRPC.Message message) {
        TLRPC.Message tL_messageService = message;
        if (user == null || i == 0 || user.id == getUserConfig().getClientUserId()) {
            return;
        }
        TLRPC.TL_messages_sendScreenshotNotification tL_messages_sendScreenshotNotification = new TLRPC.TL_messages_sendScreenshotNotification();
        TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
        tL_messages_sendScreenshotNotification.peer = tL_inputPeerUser;
        tL_inputPeerUser.access_hash = user.access_hash;
        tL_inputPeerUser.user_id = user.id;
        if (tL_messageService != null) {
            tL_messages_sendScreenshotNotification.reply_to = createReplyInput(i);
            tL_messages_sendScreenshotNotification.random_id = tL_messageService.random_id;
        } else {
            tL_messageService = new TLRPC.TL_messageService();
            tL_messageService.random_id = getNextRandomId();
            tL_messageService.dialog_id = user.id;
            tL_messageService.unread = true;
            tL_messageService.out = true;
            int newMessageId = getUserConfig().getNewMessageId();
            tL_messageService.id = newMessageId;
            tL_messageService.local_id = newMessageId;
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_messageService.from_id = tL_peerUser;
            tL_peerUser.user_id = getUserConfig().getClientUserId();
            tL_messageService.flags |= 264;
            TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
            tL_messageService.reply_to = tL_messageReplyHeader;
            tL_messageReplyHeader.flags |= 16;
            tL_messageReplyHeader.reply_to_msg_id = i;
            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
            tL_messageService.peer_id = tL_peerUser2;
            tL_peerUser2.user_id = user.id;
            tL_messageService.date = getConnectionsManager().getCurrentTime();
            tL_messageService.action = new TLRPC.TL_messageActionScreenshotTaken();
            getUserConfig().saveConfig(false);
        }
        tL_messages_sendScreenshotNotification.random_id = tL_messageService.random_id;
        MessageObject messageObject = new MessageObject(this.currentAccount, tL_messageService, false, true);
        messageObject.messageOwner.send_state = 1;
        messageObject.wasJustSent = true;
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        arrayList.add(messageObject);
        getMessagesController().updateInterfaceWithMessages(tL_messageService.dialog_id, arrayList, 0);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
        ArrayList<TLRPC.Message> arrayList2 = new ArrayList<>();
        arrayList2.add(tL_messageService);
        getMessagesStorage().putMessages(arrayList2, false, true, false, 0, false, 0, 0L);
        performSendMessageRequest(tL_messages_sendScreenshotNotification, messageObject, null, null, null, null, false);
    }

    public void sendSticker(TLRPC.Document document, String str, final long j, final MessageObject messageObject, final MessageObject messageObject2, final TL_stories.StoryItem storyItem, final ChatActivity.ReplyQuote replyQuote, final MessageObject.SendAnimationData sendAnimationData, final boolean z, final int i, final int i2, boolean z2, final Object obj, final String str2, final int i3, final long j2, final long j3, final MessageSuggestionParams messageSuggestionParams) {
        final TLRPC.Document document2;
        HashMap map;
        TLRPC.PhotoSize tL_photoStrippedSize;
        byte[] bArr;
        if (document == null) {
            return;
        }
        if (DialogObject.isEncryptedDialog(j)) {
            if (getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(j))) == null) {
                return;
            }
            TLRPC.TL_document_layer82 tL_document_layer82 = new TLRPC.TL_document_layer82();
            tL_document_layer82.id = document.id;
            tL_document_layer82.access_hash = document.access_hash;
            tL_document_layer82.date = document.date;
            tL_document_layer82.mime_type = document.mime_type;
            byte[] bArr2 = document.file_reference;
            tL_document_layer82.file_reference = bArr2;
            if (bArr2 == null) {
                tL_document_layer82.file_reference = new byte[0];
            }
            tL_document_layer82.size = document.size;
            tL_document_layer82.dc_id = document.dc_id;
            tL_document_layer82.attributes = new ArrayList<>();
            for (int i4 = 0; i4 < document.attributes.size(); i4++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i4);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    TLRPC.TL_documentAttributeVideo_layer159 tL_documentAttributeVideo_layer159 = new TLRPC.TL_documentAttributeVideo_layer159();
                    tL_documentAttributeVideo_layer159.flags = documentAttribute.flags;
                    tL_documentAttributeVideo_layer159.round_message = documentAttribute.round_message;
                    tL_documentAttributeVideo_layer159.supports_streaming = documentAttribute.supports_streaming;
                    tL_documentAttributeVideo_layer159.duration = documentAttribute.duration;
                    tL_documentAttributeVideo_layer159.w = documentAttribute.w;
                    tL_documentAttributeVideo_layer159.h = documentAttribute.h;
                    tL_document_layer82.attributes.add(tL_documentAttributeVideo_layer159);
                } else {
                    tL_document_layer82.attributes.add(documentAttribute);
                }
            }
            if (tL_document_layer82.mime_type == null) {
                tL_document_layer82.mime_type = "";
            }
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 10);
            if ((closestPhotoSizeWithSize instanceof TLRPC.TL_photoSize) || (closestPhotoSizeWithSize instanceof TLRPC.TL_photoSizeProgressive) || (closestPhotoSizeWithSize instanceof TLRPC.TL_photoStrippedSize)) {
                File pathToAttach = FileLoader.getInstance(this.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true);
                if ((closestPhotoSizeWithSize instanceof TLRPC.TL_photoStrippedSize) || pathToAttach.exists()) {
                    try {
                        if (closestPhotoSizeWithSize instanceof TLRPC.TL_photoStrippedSize) {
                            tL_photoStrippedSize = new TLRPC.TL_photoStrippedSize();
                            bArr = closestPhotoSizeWithSize.bytes;
                        } else {
                            TLRPC.TL_photoCachedSize tL_photoCachedSize = new TLRPC.TL_photoCachedSize();
                            pathToAttach.length();
                            byte[] bArr3 = new byte[(int) pathToAttach.length()];
                            new RandomAccessFile(pathToAttach, "r").readFully(bArr3);
                            tL_photoStrippedSize = tL_photoCachedSize;
                            bArr = bArr3;
                        }
                        TLRPC.TL_fileLocation_layer82 tL_fileLocation_layer82 = new TLRPC.TL_fileLocation_layer82();
                        TLRPC.FileLocation fileLocation = closestPhotoSizeWithSize.location;
                        tL_fileLocation_layer82.dc_id = fileLocation.dc_id;
                        tL_fileLocation_layer82.volume_id = fileLocation.volume_id;
                        tL_fileLocation_layer82.local_id = fileLocation.local_id;
                        tL_fileLocation_layer82.secret = fileLocation.secret;
                        tL_photoStrippedSize.location = tL_fileLocation_layer82;
                        tL_photoStrippedSize.size = closestPhotoSizeWithSize.size;
                        tL_photoStrippedSize.w = closestPhotoSizeWithSize.w;
                        tL_photoStrippedSize.h = closestPhotoSizeWithSize.h;
                        tL_photoStrippedSize.type = closestPhotoSizeWithSize.type;
                        tL_photoStrippedSize.bytes = bArr;
                        tL_document_layer82.thumbs.add(tL_photoStrippedSize);
                        tL_document_layer82.flags |= 1;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
            }
            if (tL_document_layer82.thumbs.isEmpty()) {
                TLRPC.TL_photoSizeEmpty tL_photoSizeEmpty = new TLRPC.TL_photoSizeEmpty();
                tL_photoSizeEmpty.type = "s";
                tL_document_layer82.thumbs.add(tL_photoSizeEmpty);
            }
            document2 = tL_document_layer82;
        } else {
            document2 = document;
        }
        if (MessageObject.isGifDocument(document2)) {
            mediaSendQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$sendSticker$6(document2, j, messageObject, messageObject2, z, i, i2, obj, sendAnimationData, storyItem, replyQuote, str2, i3, j2, j3, messageSuggestionParams);
                }
            });
            return;
        }
        if (TextUtils.isEmpty(str)) {
            map = null;
        } else {
            map = new HashMap();
            map.put("query", str);
        }
        SendMessageParams sendMessageParamsOf = SendMessageParams.of((TLRPC.TL_document) document2, null, null, j, messageObject, messageObject2, null, null, null, map, z, i, i2, 0, obj, sendAnimationData, z2);
        sendMessageParamsOf.replyToStoryItem = storyItem;
        sendMessageParamsOf.replyQuote = replyQuote;
        sendMessageParamsOf.quick_reply_shortcut = str2;
        sendMessageParamsOf.quick_reply_shortcut_id = i3;
        sendMessageParamsOf.payStars = j2;
        sendMessageParamsOf.monoForumPeer = j3;
        sendMessageParamsOf.suggestionParams = messageSuggestionParams;
        sendMessage(sendMessageParamsOf);
    }

    public void lambda$sendSticker$6(final TLRPC.Document document, final long j, final MessageObject messageObject, final MessageObject messageObject2, final boolean z, final int i, final int i2, final Object obj, final MessageObject.SendAnimationData sendAnimationData, final TL_stories.StoryItem storyItem, final ChatActivity.ReplyQuote replyQuote, final String str, final int i3, final long j2, final long j3, final MessageSuggestionParams messageSuggestionParams) {
        String str2;
        final Bitmap[] bitmapArr = new Bitmap[1];
        String key = ImageLocation.getForDocument(document).getKey(null, null, false);
        if ("video/mp4".equals(document.mime_type)) {
            str2 = ".mp4";
        } else if ("video/x-matroska".equals(document.mime_type)) {
            str2 = ".mkv";
        } else {
            str2 = "";
        }
        File file = new File(FileLoader.getDirectory(3), key + str2);
        if (!file.exists()) {
            file = new File(FileLoader.getDirectory(2), key + str2);
        }
        ensureMediaThumbExists(getAccountInstance(), false, document, file.getAbsolutePath(), null, 0L);
        final String[] strArr = {getKeyForPhotoSize(getAccountInstance(), FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320), bitmapArr, true, true)};
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$sendSticker$5(bitmapArr, strArr, document, j, messageObject, messageObject2, z, i, i2, obj, sendAnimationData, storyItem, replyQuote, str, i3, j2, j3, messageSuggestionParams);
            }
        });
    }

    public void lambda$sendSticker$5(Bitmap[] bitmapArr, String[] strArr, TLRPC.Document document, long j, MessageObject messageObject, MessageObject messageObject2, boolean z, int i, int i2, Object obj, MessageObject.SendAnimationData sendAnimationData, TL_stories.StoryItem storyItem, ChatActivity.ReplyQuote replyQuote, String str, int i3, long j2, long j3, MessageSuggestionParams messageSuggestionParams) {
        if (bitmapArr[0] != null && strArr[0] != null) {
            ImageLoader.getInstance().putImageToCache(new BitmapDrawable(bitmapArr[0]), strArr[0], false);
        }
        SendMessageParams sendMessageParamsOf = SendMessageParams.of((TLRPC.TL_document) document, null, null, j, messageObject, messageObject2, null, null, null, null, z, i, i2, 0, obj, sendAnimationData, false);
        sendMessageParamsOf.replyToStoryItem = storyItem;
        sendMessageParamsOf.replyQuote = replyQuote;
        sendMessageParamsOf.quick_reply_shortcut = str;
        sendMessageParamsOf.quick_reply_shortcut_id = i3;
        sendMessageParamsOf.payStars = j2;
        sendMessageParamsOf.monoForumPeer = j3;
        sendMessageParamsOf.suggestionParams = messageSuggestionParams;
        sendMessage(sendMessageParamsOf);
    }

    public int sendMessage(ArrayList<MessageObject> arrayList, long j, boolean z, boolean z2, boolean z3, int i, long j2) {
        return sendMessage(arrayList, j, z, z2, z3, i, null, -1, j2);
    }

    public int sendMessage(ArrayList<MessageObject> arrayList, long j, boolean z, boolean z2, boolean z3, int i, MessageObject messageObject, int i2, long j2) {
        return sendMessage(arrayList, j, z, z2, z3, i, 0, messageObject, i2, j2, 0L, null);
    }

    public int sendMessage(final java.util.ArrayList<org.telegram.messenger.MessageObject> r70, final long r71, final boolean r73, final boolean r74, final boolean r75, final int r76, final int r77, final org.telegram.messenger.MessageObject r78, final int r79, long r80, final long r82, final org.telegram.messenger.MessageSuggestionParams r84) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.sendMessage(java.util.ArrayList, long, boolean, boolean, boolean, int, int, org.telegram.messenger.MessageObject, int, long, long, org.telegram.messenger.MessageSuggestionParams):int");
    }

    public void lambda$sendMessage$7(ArrayList arrayList, long j, boolean z, boolean z2, boolean z3, int i, int i2, MessageObject messageObject, int i3, long j2, MessageSuggestionParams messageSuggestionParams, Long l) {
        sendMessage(arrayList, j, z, z2, z3, i, i2, messageObject, i3, l.longValue(), j2, messageSuggestionParams);
    }

    public void lambda$sendMessage$17(final TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages, final long j, final int i, final boolean z, final boolean z2, final LongSparseArray longSparseArray, final ArrayList arrayList, final ArrayList arrayList2, final MessageObject messageObject, final TLRPC.Peer peer) {
        getConnectionsManager().sendRequest(tL_messages_forwardMessages, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$sendMessage$16(j, i, z, z2, longSparseArray, arrayList, arrayList2, messageObject, peer, tL_messages_forwardMessages, tLObject, tL_error);
            }
        }, 68);
    }

    public void lambda$sendMessage$16(final long r29, final int r31, boolean r32, boolean r33, androidx.collection.LongSparseArray r34, java.util.ArrayList r35, final java.util.ArrayList r36, final org.telegram.messenger.MessageObject r37, final org.telegram.tgnet.TLRPC.Peer r38, final org.telegram.tgnet.TLRPC.TL_messages_forwardMessages r39, org.telegram.tgnet.TLObject r40, org.telegram.tgnet.TLRPC.TL_error r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.lambda$sendMessage$16(long, int, boolean, boolean, androidx.collection.LongSparseArray, java.util.ArrayList, java.util.ArrayList, org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$Peer, org.telegram.tgnet.TLRPC$TL_messages_forwardMessages, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    public void lambda$sendMessage$10(final ArrayList arrayList, final int i, final int i2, final TLRPC.Message message, final int i3, final TLRPC.Message message2, final MessageObject messageObject, final int i4) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$sendMessage$9(arrayList, i, i2, message, i3, message2, messageObject, i4);
            }
        });
    }

    public void lambda$sendMessage$9(ArrayList arrayList, final int i, final int i2, final TLRPC.Message message, final int i3, final TLRPC.Message message2, final MessageObject messageObject, final int i4) {
        getMessagesStorage().putMessages((ArrayList<TLRPC.Message>) arrayList, true, false, false, 0, i, 0L);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$sendMessage$8(i2, message, i3, i, message2, messageObject, i4);
            }
        });
    }

    public void lambda$sendMessage$8(int i, TLRPC.Message message, int i2, int i3, TLRPC.Message message2, MessageObject messageObject, int i4) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(i));
        getMessagesController().deleteMessages(arrayList, null, null, message.dialog_id, false, i2, false, 0L, null, 0, i3 == 1, message2.id);
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        arrayList2.add(new MessageObject(messageObject.currentAccount, messageObject.messageOwner, true, true));
        getMessagesController().updateInterfaceWithMessages(message.dialog_id, arrayList2, i3);
        getMediaDataController().increasePeerRaiting(message.dialog_id);
        processSentMessage(i);
        removeFromSendingMessages(i, i4 != 0);
    }

    public void lambda$sendMessage$12(final int i, final TLRPC.Message message, final TLRPC.Message message2, TLRPC.Peer peer, final int i2, ArrayList arrayList, final long j, final int i3) {
        int i4 = (message.quick_reply_shortcut_id == 0 && message.quick_reply_shortcut == null) ? i != 0 ? 1 : 0 : 5;
        getMessagesStorage().updateMessageStateAndId(message2.random_id, MessageObject.getPeerId(peer), Integer.valueOf(i2), message2.id, 0, false, i != 0 ? 1 : 0, message.quick_reply_shortcut_id);
        getMessagesStorage().putMessages((ArrayList<TLRPC.Message>) arrayList, true, false, false, 0, i4, message.quick_reply_shortcut_id);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$sendMessage$11(message2, j, i2, message, i3, i);
            }
        });
    }

    public void lambda$sendMessage$11(TLRPC.Message message, long j, int i, TLRPC.Message message2, int i2, int i3) {
        message.send_state = 0;
        getMediaDataController().increasePeerRaiting(j);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageReceivedByServer, Integer.valueOf(i), Integer.valueOf(message2.id), message2, Long.valueOf(j), 0L, Integer.valueOf(i2), Boolean.valueOf(i3 != 0));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageReceivedByServer2, Integer.valueOf(i), Integer.valueOf(message2.id), message2, Long.valueOf(j), 0L, Integer.valueOf(i2), Boolean.valueOf(i3 != 0));
        processSentMessage(i);
        removeFromSendingMessages(i, i3 != 0);
    }

    public void lambda$sendMessage$13(TLRPC.TL_error tL_error, TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages) {
        AlertsCreator.processError(this.currentAccount, tL_error, null, tL_messages_forwardMessages, new Object[0]);
    }

    public void lambda$sendMessage$14(TLRPC.Message message, int i) {
        message.send_state = 2;
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageSendError, Integer.valueOf(message.id));
        processSentMessage(message.id);
        removeFromSendingMessages(message.id, i != 0);
    }

    public void lambda$sendMessage$15(ArrayList arrayList) {
        StarsController.getInstance(this.currentAccount).showPriceChangedToast(arrayList);
    }

    public void lambda$sendMessage$18(TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages, ArrayList arrayList, Runnable runnable) {
        if (BotForumHelper.getInstance(this.currentAccount).beforeSendingFinalRequest(tL_messages_forwardMessages, arrayList, runnable)) {
            runnable.run();
        }
    }

    public static int canSendMessageToChat(TLRPC.Chat chat, MessageObject messageObject) {
        boolean zCanSendStickers = ChatObject.canSendStickers(chat);
        boolean zCanSendPhoto = ChatObject.canSendPhoto(chat);
        boolean zCanSendVideo = ChatObject.canSendVideo(chat);
        boolean zCanSendDocument = ChatObject.canSendDocument(chat);
        ChatObject.canSendEmbed(chat);
        boolean zCanSendPolls = ChatObject.canSendPolls(chat);
        boolean zCanSendRoundVideo = ChatObject.canSendRoundVideo(chat);
        boolean zCanSendVoice = ChatObject.canSendVoice(chat);
        boolean zCanSendMusic = ChatObject.canSendMusic(chat);
        boolean z = messageObject.isSticker() || messageObject.isAnimatedSticker() || messageObject.isGif() || messageObject.isGame();
        if (!zCanSendStickers && z) {
            return ChatObject.isActionBannedByDefault(chat, 8) ? 4 : 1;
        }
        if (!zCanSendPhoto && (messageObject.messageOwner.media instanceof TLRPC.TL_messageMediaPhoto) && !messageObject.isVideo() && !z) {
            return ChatObject.isActionBannedByDefault(chat, 16) ? 10 : 12;
        }
        if (!zCanSendMusic && messageObject.isMusic()) {
            return ChatObject.isActionBannedByDefault(chat, 18) ? 19 : 20;
        }
        if (!zCanSendVideo && messageObject.isVideo() && !z) {
            return ChatObject.isActionBannedByDefault(chat, 17) ? 9 : 11;
        }
        if (!zCanSendPolls && (messageObject.messageOwner.media instanceof TLRPC.TL_messageMediaPoll)) {
            return ChatObject.isActionBannedByDefault(chat, 10) ? 6 : 3;
        }
        if (!zCanSendPolls && (messageObject.messageOwner.media instanceof TLRPC.TL_messageMediaToDo)) {
            return ChatObject.isActionBannedByDefault(chat, 10) ? 21 : 22;
        }
        if (!zCanSendVoice && MessageObject.isVoiceMessage(messageObject.messageOwner)) {
            return ChatObject.isActionBannedByDefault(chat, 20) ? 13 : 14;
        }
        if (!zCanSendRoundVideo && MessageObject.isRoundVideoMessage(messageObject.messageOwner)) {
            return ChatObject.isActionBannedByDefault(chat, 21) ? 15 : 16;
        }
        if (zCanSendDocument || !(messageObject.messageOwner.media instanceof TLRPC.TL_messageMediaDocument) || z) {
            return 0;
        }
        return ChatObject.isActionBannedByDefault(chat, 19) ? 17 : 18;
    }

    private void writePreviousMessageData(TLRPC.Message message, SerializedData serializedData) {
        TLRPC.MessageMedia messageMedia = message.media;
        if (messageMedia == null) {
            new TLRPC.TL_messageMediaEmpty().serializeToStream(serializedData);
        } else {
            messageMedia.serializeToStream(serializedData);
        }
        String str = message.message;
        if (str == null) {
            str = "";
        }
        serializedData.writeString(str);
        String str2 = message.attachPath;
        serializedData.writeString(str2 != null ? str2 : "");
        int size = message.entities.size();
        serializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            message.entities.get(i).serializeToStream(serializedData);
        }
    }

    public void editMessage(org.telegram.messenger.MessageObject r33, org.telegram.tgnet.TLRPC.TL_photo r34, org.telegram.messenger.VideoEditedInfo r35, org.telegram.tgnet.TLRPC.TL_document r36, java.lang.String r37, org.telegram.tgnet.TLRPC.PhotoSize r38, java.util.HashMap<java.lang.String, java.lang.String> r39, boolean r40, boolean r41, java.lang.Object r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.editMessage(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$TL_photo, org.telegram.messenger.VideoEditedInfo, org.telegram.tgnet.TLRPC$TL_document, java.lang.String, org.telegram.tgnet.TLRPC$PhotoSize, java.util.HashMap, boolean, boolean, java.lang.Object):void");
    }

    public int editMessage(MessageObject messageObject, String str, boolean z, final BaseFragment baseFragment, ArrayList<TLRPC.MessageEntity> arrayList, int i, int i2) {
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return 0;
        }
        final TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        tL_messages_editMessage.peer = getMessagesController().getInputPeer(messageObject.getDialogId());
        if (str != null) {
            tL_messages_editMessage.message = str;
            tL_messages_editMessage.flags |= 2048;
            tL_messages_editMessage.no_webpage = !z;
        }
        tL_messages_editMessage.id = messageObject.getId();
        TLRPC.Message message = messageObject.messageOwner;
        if (message != null && (message.flags & 1073741824) != 0) {
            tL_messages_editMessage.quick_reply_shortcut_id = message.quick_reply_shortcut_id;
            tL_messages_editMessage.flags |= 131072;
        }
        if (arrayList != null) {
            tL_messages_editMessage.entities = arrayList;
            tL_messages_editMessage.flags |= 8;
        }
        if (i != 0) {
            tL_messages_editMessage.schedule_date = i;
            int i3 = tL_messages_editMessage.flags;
            tL_messages_editMessage.flags = 32768 | i3;
            if (i2 != 0) {
                tL_messages_editMessage.schedule_repeat_period = i2;
                tL_messages_editMessage.flags = i3 | 294912;
            }
        }
        return getConnectionsManager().sendRequest(tL_messages_editMessage, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$editMessage$20(baseFragment, tL_messages_editMessage, tLObject, tL_error);
            }
        });
    }

    public void lambda$editMessage$20(final BaseFragment baseFragment, final TLRPC.TL_messages_editMessage tL_messages_editMessage, TLObject tLObject, final TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$editMessage$19(tL_error, baseFragment, tL_messages_editMessage);
                }
            });
        }
    }

    public void lambda$editMessage$19(TLRPC.TL_error tL_error, BaseFragment baseFragment, TLRPC.TL_messages_editMessage tL_messages_editMessage) {
        AlertsCreator.processError(this.currentAccount, tL_error, baseFragment, tL_messages_editMessage, new Object[0]);
    }

    public void sendLocation(Location location) {
        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeo.geo = tL_geoPoint;
        tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(location.getLatitude());
        tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(location.getLongitude());
        Iterator<Map.Entry<String, MessageObject>> it = this.waitingForLocation.entrySet().iterator();
        while (it.hasNext()) {
            MessageObject value = it.next().getValue();
            sendMessage(SendMessageParams.of((TLRPC.MessageMedia) tL_messageMediaGeo, value.getDialogId(), value, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
        }
    }

    public void sendCurrentLocation(MessageObject messageObject, TLRPC.KeyboardButton keyboardButton) {
        if (messageObject == null || keyboardButton == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(messageObject.getDialogId());
        sb.append("_");
        sb.append(messageObject.getId());
        sb.append("_");
        sb.append(Utilities.bytesToHex(keyboardButton.data));
        sb.append("_");
        sb.append(keyboardButton instanceof TLRPC.TL_keyboardButtonGame ? "1" : "0");
        this.waitingForLocation.put(sb.toString(), messageObject);
        this.locationProvider.start();
    }

    public boolean isSendingCurrentLocation(MessageObject messageObject, TLRPC.KeyboardButton keyboardButton) {
        if (messageObject == null || keyboardButton == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(messageObject.getDialogId());
        sb.append("_");
        sb.append(messageObject.getId());
        sb.append("_");
        sb.append(Utilities.bytesToHex(keyboardButton.data));
        sb.append("_");
        sb.append(keyboardButton instanceof TLRPC.TL_keyboardButtonGame ? "1" : "0");
        return this.waitingForLocation.containsKey(sb.toString());
    }

    public void sendNotificationCallback(final long j, final int i, final byte[] bArr) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$sendNotificationCallback$23(j, i, bArr);
            }
        });
    }

    public void lambda$sendNotificationCallback$23(long j, int i, byte[] bArr) {
        TLRPC.Chat chatSync;
        TLRPC.User userSync;
        final String str = j + "_" + i + "_" + Utilities.bytesToHex(bArr) + "_0";
        this.waitingForCallback.put(str, Boolean.TRUE);
        final List<String> list = this.waitingForCallbackMap.get(j + "_" + i);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.waitingForCallbackMap.put(j + "_" + i, arrayList);
            list = arrayList;
        }
        list.add(str);
        if (DialogObject.isUserDialog(j)) {
            if (getMessagesController().getUser(Long.valueOf(j)) == null && (userSync = getMessagesStorage().getUserSync(j)) != null) {
                getMessagesController().putUser(userSync, true);
            }
        } else {
            long j2 = -j;
            if (getMessagesController().getChat(Long.valueOf(j2)) == null && (chatSync = getMessagesStorage().getChatSync(j2)) != null) {
                getMessagesController().putChat(chatSync, true);
            }
        }
        TLRPC.TL_messages_getBotCallbackAnswer tL_messages_getBotCallbackAnswer = new TLRPC.TL_messages_getBotCallbackAnswer();
        tL_messages_getBotCallbackAnswer.peer = getMessagesController().getInputPeer(j);
        tL_messages_getBotCallbackAnswer.msg_id = i;
        tL_messages_getBotCallbackAnswer.game = false;
        if (bArr != null) {
            tL_messages_getBotCallbackAnswer.flags |= 1;
            tL_messages_getBotCallbackAnswer.data = bArr;
        }
        getConnectionsManager().sendRequest(tL_messages_getBotCallbackAnswer, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$sendNotificationCallback$22(str, list, tLObject, tL_error);
            }
        }, 2);
        getMessagesController().markDialogAsRead(j, i, i, 0, false, 0L, 0, true, 0);
    }

    public void lambda$sendNotificationCallback$22(final String str, final List list, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$sendNotificationCallback$21(str, list);
            }
        });
    }

    public void lambda$sendNotificationCallback$21(String str, List list) {
        this.waitingForCallback.remove(str);
        list.remove(str);
    }

    public void onMessageEdited(TLRPC.Message message) {
        if (message == null || message.reply_markup == null) {
            return;
        }
        List<String> listRemove = this.waitingForCallbackMap.remove(message.dialog_id + "_" + message.id);
        if (listRemove != null) {
            Iterator<String> it = listRemove.iterator();
            while (it.hasNext()) {
                this.waitingForCallback.remove(it.next());
            }
        }
    }

    public byte[] isSendingVote(MessageObject messageObject) {
        if (messageObject == null) {
            return null;
        }
        return this.waitingForVote.get("poll_" + messageObject.getPollId());
    }

    public int sendVote(final MessageObject messageObject, ArrayList<TLRPC.PollAnswer> arrayList, final Runnable runnable) {
        byte[] bArr;
        if (messageObject == null) {
            return 0;
        }
        final String str = "poll_" + messageObject.getPollId();
        if (this.waitingForCallback.containsKey(str)) {
            return 0;
        }
        TLRPC.TL_messages_sendVote tL_messages_sendVote = new TLRPC.TL_messages_sendVote();
        tL_messages_sendVote.msg_id = messageObject.getId();
        tL_messages_sendVote.peer = getMessagesController().getInputPeer(messageObject.getDialogId());
        if (arrayList != null) {
            bArr = new byte[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC.PollAnswer pollAnswer = arrayList.get(i);
                if (pollAnswer != null) {
                    tL_messages_sendVote.options.add(pollAnswer.option);
                    bArr[i] = pollAnswer.option[0];
                }
            }
        } else {
            bArr = new byte[0];
        }
        this.waitingForVote.put(str, bArr);
        return getConnectionsManager().sendRequest(tL_messages_sendVote, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$sendVote$25(messageObject, str, runnable, tLObject, tL_error);
            }
        });
    }

    public void lambda$sendVote$25(MessageObject messageObject, final String str, final Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            this.voteSendTime.put(messageObject.getPollId(), 0L);
            getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
            this.voteSendTime.put(messageObject.getPollId(), Long.valueOf(SystemClock.elapsedRealtime()));
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$sendVote$24(str, runnable);
            }
        });
    }

    public void lambda$sendVote$24(String str, Runnable runnable) {
        this.waitingForVote.remove(str);
        if (runnable != null) {
            runnable.run();
        }
    }

    public Boolean getSendingTodoValue(MessageObject messageObject, TLRPC.TodoItem todoItem) {
        return this.waitingForTodoUpdate.get(Integer.valueOf(Objects.hash(Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), Integer.valueOf(todoItem.id))));
    }

    public int toggleTodo(final long j, final MessageObject messageObject, final TLRPC.TodoItem todoItem, final boolean z, final Runnable runnable) {
        if (messageObject == null) {
            return 0;
        }
        final int iHash = Objects.hash(Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), Integer.valueOf(todoItem.id));
        this.waitingForTodoUpdate.put(Integer.valueOf(iHash), Boolean.valueOf(z));
        TLRPC.TL_messages_toggleTodoCompleted tL_messages_toggleTodoCompleted = new TLRPC.TL_messages_toggleTodoCompleted();
        tL_messages_toggleTodoCompleted.msg_id = messageObject.getId();
        tL_messages_toggleTodoCompleted.peer = getMessagesController().getInputPeer(messageObject.getDialogId());
        if (z) {
            tL_messages_toggleTodoCompleted.completed.add(Integer.valueOf(todoItem.id));
        } else {
            tL_messages_toggleTodoCompleted.incompleted.add(Integer.valueOf(todoItem.id));
        }
        return getConnectionsManager().sendRequest(tL_messages_toggleTodoCompleted, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$toggleTodo$27(messageObject, todoItem, z, j, iHash, runnable, tLObject, tL_error);
            }
        });
    }

    public void lambda$toggleTodo$27(MessageObject messageObject, TLRPC.TodoItem todoItem, final boolean z, long j, final int i, final Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            getMessagesStorage().toggleTodo(messageObject.getDialogId(), messageObject.getId(), todoItem.id, z, j);
            getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$toggleTodo$26(i, z, runnable);
            }
        });
    }

    public void lambda$toggleTodo$26(int i, boolean z, Runnable runnable) {
        Boolean bool = this.waitingForTodoUpdate.get(Integer.valueOf(i));
        if (bool != null && bool.booleanValue() == z) {
            this.waitingForTodoUpdate.remove(Integer.valueOf(i));
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    protected long getVoteSendTime(long j) {
        return ((Long) this.voteSendTime.get(j, 0L)).longValue();
    }

    public void sendReaction(MessageObject messageObject, ArrayList<ReactionsLayoutInBubble.VisibleReaction> arrayList, ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z, boolean z2, BaseFragment baseFragment, final Runnable runnable) {
        if (messageObject == null || baseFragment == null) {
            return;
        }
        TLRPC.TL_messages_sendReaction tL_messages_sendReaction = new TLRPC.TL_messages_sendReaction();
        TLRPC.Message message = messageObject.messageOwner;
        if (message.isThreadMessage && message.fwd_from != null) {
            tL_messages_sendReaction.peer = getMessagesController().getInputPeer(messageObject.getFromChatId());
            tL_messages_sendReaction.msg_id = messageObject.messageOwner.fwd_from.saved_from_msg_id;
        } else {
            tL_messages_sendReaction.peer = getMessagesController().getInputPeer(messageObject.getDialogId());
            tL_messages_sendReaction.msg_id = messageObject.getId();
        }
        tL_messages_sendReaction.add_to_recent = z2;
        if (z2 && visibleReaction != null) {
            MediaDataController.getInstance(this.currentAccount).recentReactions.add(0, ReactionsUtils.toTLReaction(visibleReaction));
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i = 0; i < arrayList.size(); i++) {
                ReactionsLayoutInBubble.VisibleReaction visibleReaction2 = arrayList.get(i);
                if (visibleReaction2.documentId != 0) {
                    TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
                    tL_reactionCustomEmoji.document_id = visibleReaction2.documentId;
                    tL_messages_sendReaction.reaction.add(tL_reactionCustomEmoji);
                    tL_messages_sendReaction.flags |= 1;
                } else if (visibleReaction2.emojicon != null) {
                    TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                    tL_reactionEmoji.emoticon = visibleReaction2.emojicon;
                    tL_messages_sendReaction.reaction.add(tL_reactionEmoji);
                    tL_messages_sendReaction.flags |= 1;
                }
            }
        }
        if (z) {
            tL_messages_sendReaction.flags |= 2;
            tL_messages_sendReaction.big = true;
        }
        getConnectionsManager().sendRequest(tL_messages_sendReaction, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$sendReaction$28(runnable, tLObject, tL_error);
            }
        });
    }

    public void lambda$sendReaction$28(Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
            }
        }
    }

    public void requestUrlAuth(final String str, final ChatActivity chatActivity, final boolean z) {
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
        tL_messages_requestUrlAuth.url = str;
        tL_messages_requestUrlAuth.flags |= 4;
        getConnectionsManager().sendRequest(tL_messages_requestUrlAuth, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                SendMessagesHelper.lambda$requestUrlAuth$30(chatActivity, tL_messages_requestUrlAuth, str, z, tLObject, tL_error);
            }
        }, 2);
    }

    public static void lambda$requestUrlAuth$30(final ChatActivity chatActivity, final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, final String str, final boolean z, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SendMessagesHelper.lambda$requestUrlAuth$29(tLObject, chatActivity, tL_messages_requestUrlAuth, str, z);
            }
        });
    }

    public static void lambda$requestUrlAuth$29(TLObject tLObject, ChatActivity chatActivity, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String str, boolean z) {
        if (tLObject != null) {
            if (tLObject instanceof TLRPC.TL_urlAuthResultRequest) {
                chatActivity.showRequestUrlAlert((TLRPC.TL_urlAuthResultRequest) tLObject, tL_messages_requestUrlAuth, str, z);
                return;
            } else if (tLObject instanceof TLRPC.TL_urlAuthResultAccepted) {
                AlertsCreator.showOpenUrlAlert(chatActivity, ((TLRPC.TL_urlAuthResultAccepted) tLObject).url, false, false);
                return;
            } else {
                if (tLObject instanceof TLRPC.TL_urlAuthResultDefault) {
                    AlertsCreator.showOpenUrlAlert(chatActivity, str, false, z);
                    return;
                }
                return;
            }
        }
        AlertsCreator.showOpenUrlAlert(chatActivity, str, false, z);
    }

    public void sendCallback(boolean z, MessageObject messageObject, TLRPC.KeyboardButton keyboardButton, ChatActivity chatActivity) {
        lambda$sendCallback$33(z, messageObject, keyboardButton, null, null, chatActivity);
    }

    public void lambda$sendCallback$33(final boolean r21, final org.telegram.messenger.MessageObject r22, final org.telegram.tgnet.TLRPC.KeyboardButton r23, final org.telegram.tgnet.TLRPC.InputCheckPasswordSRP r24, final org.telegram.ui.TwoStepVerificationActivity r25, final org.telegram.ui.ChatActivity r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.lambda$sendCallback$33(boolean, org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$KeyboardButton, org.telegram.tgnet.TLRPC$InputCheckPasswordSRP, org.telegram.ui.TwoStepVerificationActivity, org.telegram.ui.ChatActivity):void");
    }

    public void lambda$sendCallback$39(final String str, final List list, final boolean z, final MessageObject messageObject, final TLRPC.KeyboardButton keyboardButton, final ChatActivity chatActivity, final TwoStepVerificationActivity twoStepVerificationActivity, final TLObject[] tLObjectArr, final TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, final boolean z2, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$sendCallback$38(str, list, z, tLObject, messageObject, keyboardButton, chatActivity, twoStepVerificationActivity, tLObjectArr, tL_error, inputCheckPasswordSRP, z2);
            }
        });
    }

    public void lambda$sendCallback$38(final java.lang.String r27, final java.util.List r28, boolean r29, org.telegram.tgnet.TLObject r30, final org.telegram.messenger.MessageObject r31, final org.telegram.tgnet.TLRPC.KeyboardButton r32, final org.telegram.ui.ChatActivity r33, final org.telegram.ui.TwoStepVerificationActivity r34, org.telegram.tgnet.TLObject[] r35, org.telegram.tgnet.TLRPC.TL_error r36, org.telegram.tgnet.TLRPC.InputCheckPasswordSRP r37, final boolean r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.lambda$sendCallback$38(java.lang.String, java.util.List, boolean, org.telegram.tgnet.TLObject, org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$KeyboardButton, org.telegram.ui.ChatActivity, org.telegram.ui.TwoStepVerificationActivity, org.telegram.tgnet.TLObject[], org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLRPC$InputCheckPasswordSRP, boolean):void");
    }

    public void lambda$sendCallback$31(String str, List list) {
        this.waitingForCallback.remove(str);
        list.remove(str);
    }

    public void lambda$sendCallback$34(final boolean z, final MessageObject messageObject, final TLRPC.KeyboardButton keyboardButton, final ChatActivity chatActivity, AlertDialog alertDialog, int i) {
        final TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        twoStepVerificationActivity.setDelegate(0, new TwoStepVerificationActivity.TwoStepVerificationActivityDelegate() {
            @Override
            public final void didEnterPassword(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP) {
                this.f$0.lambda$sendCallback$33(z, messageObject, keyboardButton, twoStepVerificationActivity, chatActivity, inputCheckPasswordSRP);
            }
        });
        chatActivity.presentFragment(twoStepVerificationActivity);
    }

    public static void lambda$sendCallback$35(ChatActivity chatActivity, AlertDialog alertDialog, int i) {
        chatActivity.presentFragment(new TwoStepVerificationSetupActivity(6, null));
    }

    public void lambda$sendCallback$37(final TwoStepVerificationActivity twoStepVerificationActivity, final boolean z, final MessageObject messageObject, final TLRPC.KeyboardButton keyboardButton, final ChatActivity chatActivity, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$sendCallback$36(tL_error, tLObject, twoStepVerificationActivity, z, messageObject, keyboardButton, chatActivity);
            }
        });
    }

    public void lambda$sendCallback$36(TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z, MessageObject messageObject, TLRPC.KeyboardButton keyboardButton, ChatActivity chatActivity) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.setCurrentPasswordInfo(null, password);
            TwoStepVerificationActivity.initPasswordNewAlgo(password);
            lambda$sendCallback$33(z, messageObject, keyboardButton, twoStepVerificationActivity.getNewSrpPassword(), twoStepVerificationActivity, chatActivity);
        }
    }

    public boolean isSendingCallback(MessageObject messageObject, TLRPC.KeyboardButton keyboardButton) {
        int i = 0;
        if (messageObject == null || keyboardButton == null) {
            return false;
        }
        if (keyboardButton instanceof TLRPC.TL_keyboardButtonUrlAuth) {
            i = 3;
        } else if (keyboardButton instanceof TLRPC.TL_keyboardButtonGame) {
            i = 1;
        } else if (keyboardButton instanceof TLRPC.TL_keyboardButtonBuy) {
            i = 2;
        }
        return this.waitingForCallback.containsKey(messageObject.getDialogId() + "_" + messageObject.getId() + "_" + Utilities.bytesToHex(keyboardButton.data) + "_" + i);
    }

    public void sendGame(TLRPC.InputPeer inputPeer, TLRPC.TL_inputMediaGame tL_inputMediaGame, long j, final long j2) {
        NativeByteBuffer nativeByteBuffer;
        if (inputPeer == null || tL_inputMediaGame == null) {
            return;
        }
        TLRPC.TL_messages_sendMedia tL_messages_sendMedia = new TLRPC.TL_messages_sendMedia();
        tL_messages_sendMedia.peer = inputPeer;
        if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
            tL_messages_sendMedia.silent = MessagesController.getNotificationsSettings(this.currentAccount).getBoolean("silent_" + (-inputPeer.channel_id), false);
        } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
            tL_messages_sendMedia.silent = MessagesController.getNotificationsSettings(this.currentAccount).getBoolean("silent_" + (-inputPeer.chat_id), false);
        } else {
            tL_messages_sendMedia.silent = MessagesController.getNotificationsSettings(this.currentAccount).getBoolean("silent_" + inputPeer.user_id, false);
        }
        tL_messages_sendMedia.random_id = j != 0 ? j : getNextRandomId();
        tL_messages_sendMedia.message = "";
        tL_messages_sendMedia.media = tL_inputMediaGame;
        long sendAsPeerId = ChatObject.getSendAsPeerId(getMessagesController().getChat(Long.valueOf(inputPeer.chat_id)), getMessagesController().getChatFull(inputPeer.chat_id));
        if (sendAsPeerId != UserConfig.getInstance(this.currentAccount).getClientUserId()) {
            tL_messages_sendMedia.send_as = getMessagesController().getInputPeer(sendAsPeerId);
        }
        long sendPaidMessagesStars = getMessagesController().getSendPaidMessagesStars(DialogObject.getPeerDialogId(inputPeer));
        if (sendPaidMessagesStars <= 0) {
            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(getMessagesController().isUserContactBlocked(DialogObject.getPeerDialogId(inputPeer)));
        }
        if (sendPaidMessagesStars > 0) {
            tL_messages_sendMedia.flags |= 2097152;
            tL_messages_sendMedia.allow_paid_stars = sendPaidMessagesStars;
        }
        if (j2 == 0) {
            try {
                nativeByteBuffer = new NativeByteBuffer(inputPeer.getObjectSize() + tL_inputMediaGame.getObjectSize() + 12);
            } catch (Exception e) {
                e = e;
                nativeByteBuffer = null;
            }
            try {
                nativeByteBuffer.writeInt32(3);
                nativeByteBuffer.writeInt64(j);
                inputPeer.serializeToStream(nativeByteBuffer);
                tL_inputMediaGame.serializeToStream(nativeByteBuffer);
            } catch (Exception e2) {
                e = e2;
                FileLog.e(e);
                j2 = getMessagesStorage().createPendingTask(nativeByteBuffer);
                getConnectionsManager().sendRequest(tL_messages_sendMedia, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        this.f$0.lambda$sendGame$40(j2, tLObject, tL_error);
                    }
                });
            }
            j2 = getMessagesStorage().createPendingTask(nativeByteBuffer);
        }
        getConnectionsManager().sendRequest(tL_messages_sendMedia, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$sendGame$40(j2, tLObject, tL_error);
            }
        });
    }

    public void lambda$sendGame$40(long j, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
        }
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
    }

    public void sendMessage(org.telegram.messenger.SendMessagesHelper.SendMessageParams r106) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.sendMessage(org.telegram.messenger.SendMessagesHelper$SendMessageParams):void");
    }

    public void lambda$sendMessage$41(SendMessageParams sendMessageParams, Long l) {
        sendMessageParams.payStars = l.longValue();
        sendMessage(sendMessageParams);
    }

    private void performSendDelayedMessage(DelayedMessage delayedMessage) {
        performSendDelayedMessage(delayedMessage, -1);
    }

    private TLRPC.PhotoSize getThumbForSecretChat(ArrayList<TLRPC.PhotoSize> arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                TLRPC.PhotoSize photoSize = arrayList.get(i);
                if (photoSize != null && !(photoSize instanceof TLRPC.TL_photoPathSize) && !(photoSize instanceof TLRPC.TL_photoSizeEmpty) && photoSize.location != null) {
                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                        return photoSize;
                    }
                    TLRPC.TL_photoSize_layer127 tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
                    tL_photoSize_layer127.type = photoSize.type;
                    tL_photoSize_layer127.w = photoSize.w;
                    tL_photoSize_layer127.h = photoSize.h;
                    tL_photoSize_layer127.size = photoSize.size;
                    byte[] bArr = photoSize.bytes;
                    tL_photoSize_layer127.bytes = bArr;
                    if (bArr == null) {
                        tL_photoSize_layer127.bytes = new byte[0];
                    }
                    TLRPC.TL_fileLocation_layer82 tL_fileLocation_layer82 = new TLRPC.TL_fileLocation_layer82();
                    tL_photoSize_layer127.location = tL_fileLocation_layer82;
                    TLRPC.FileLocation fileLocation = photoSize.location;
                    tL_fileLocation_layer82.dc_id = fileLocation.dc_id;
                    tL_fileLocation_layer82.volume_id = fileLocation.volume_id;
                    tL_fileLocation_layer82.local_id = fileLocation.local_id;
                    tL_fileLocation_layer82.secret = fileLocation.secret;
                    return tL_photoSize_layer127;
                }
            }
        }
        return null;
    }

    private void performSendDelayedMessage(final org.telegram.messenger.SendMessagesHelper.DelayedMessage r31, int r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.performSendDelayedMessage(org.telegram.messenger.SendMessagesHelper$DelayedMessage, int):void");
    }

    public void lambda$performSendDelayedMessage$43(final TLRPC.InputMedia inputMedia, final DelayedMessage delayedMessage, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$performSendDelayedMessage$42(tLObject, inputMedia, delayedMessage);
            }
        });
    }

    public void lambda$performSendDelayedMessage$42(TLObject tLObject, TLRPC.InputMedia inputMedia, DelayedMessage delayedMessage) {
        TLRPC.PhotoSize photoSize;
        MessageObject messageObject;
        VideoEditedInfo videoEditedInfo;
        if (tLObject instanceof TLRPC.TL_messageMediaPhoto) {
            TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) tLObject).photo;
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputPhoto.id = photo.id;
            tL_inputPhoto.access_hash = photo.access_hash;
            tL_inputPhoto.file_reference = photo.file_reference;
            if (inputMedia instanceof TLRPC.TL_inputMediaUploadedDocument) {
                inputMedia.flags |= 64;
                inputMedia.video_cover = tL_inputPhoto;
            } else if (inputMedia instanceof TLRPC.TL_inputMediaDocument) {
                inputMedia.flags |= 8;
                inputMedia.video_cover = tL_inputPhoto;
            }
            TLRPC.InputMedia inputMedia2 = delayedMessage.inputUploadMedia;
            if (inputMedia2 instanceof TLRPC.TL_inputMediaUploadedDocument) {
                inputMedia2.flags |= 64;
                inputMedia2.video_cover = tL_inputPhoto;
            }
            if (delayedMessage.performMediaUpload && inputMedia.thumb == null && (photoSize = delayedMessage.photoSize) != null && photoSize.location != null && ((messageObject = delayedMessage.obj) == null || (videoEditedInfo = messageObject.videoEditedInfo) == null || !videoEditedInfo.isSticker)) {
                performSendDelayedMessage(delayedMessage);
                return;
            } else {
                performSendMessageRequest(delayedMessage.sendRequest, delayedMessage.obj, delayedMessage.originalPath, delayedMessage, delayedMessage.parentObject, null, delayedMessage.scheduled);
                return;
            }
        }
        delayedMessage.markAsError();
    }

    public void lambda$performSendDelayedMessage$45(final TLRPC.InputMedia inputMedia, final DelayedMessage delayedMessage, final String str, final MessageObject messageObject, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$performSendDelayedMessage$44(tLObject, inputMedia, delayedMessage, str, messageObject);
            }
        });
    }

    public void lambda$performSendDelayedMessage$44(TLObject tLObject, TLRPC.InputMedia inputMedia, DelayedMessage delayedMessage, String str, MessageObject messageObject) {
        if (tLObject instanceof TLRPC.TL_messageMediaPhoto) {
            TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) tLObject).photo;
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputPhoto.id = photo.id;
            tL_inputPhoto.access_hash = photo.access_hash;
            tL_inputPhoto.file_reference = photo.file_reference;
            if (inputMedia instanceof TLRPC.TL_inputMediaUploadedDocument) {
                inputMedia.flags |= 64;
                inputMedia.video_cover = tL_inputPhoto;
            } else if (inputMedia instanceof TLRPC.TL_inputMediaDocument) {
                inputMedia.flags |= 8;
                inputMedia.video_cover = tL_inputPhoto;
            }
            TLRPC.PhotoSize photoSize = null;
            delayedMessage.coverFile = null;
            delayedMessage.coverPhotoSize = null;
            HashMap<Object, Object> map = delayedMessage.extraHashMap;
            if (map != null) {
                map.remove(str + "_ct");
            }
            int iIndexOf = delayedMessage.messageObjects.indexOf(messageObject);
            ArrayList<TLRPC.InputMedia> arrayList = delayedMessage.inputMedias;
            if (arrayList != null && iIndexOf >= 0 && iIndexOf < arrayList.size()) {
                TLRPC.InputMedia inputMedia2 = delayedMessage.inputMedias.get(iIndexOf);
                if (inputMedia2 instanceof TLRPC.TL_inputMediaUploadedDocument) {
                    inputMedia2.flags |= 64;
                    inputMedia2.video_cover = tL_inputPhoto;
                }
            }
            HashMap<Object, Object> map2 = delayedMessage.extraHashMap;
            if (map2 != null) {
                if (map2.containsKey(str + "_t")) {
                    photoSize = (TLRPC.PhotoSize) delayedMessage.extraHashMap.get(str + "_t");
                }
            }
            delayedMessage.photoSize = photoSize;
            if (inputMedia.thumb == null && photoSize != null && photoSize.location != null) {
                delayedMessage.performMediaUpload = true;
                performSendDelayedMessage(delayedMessage, iIndexOf);
                return;
            } else {
                sendReadyToSendGroup(delayedMessage, false, true);
                return;
            }
        }
        delayedMessage.markAsError();
    }

    public void lambda$performSendDelayedMessage$47(final DelayedMessage delayedMessage, final String str, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$performSendDelayedMessage$46(tLObject, delayedMessage, str);
            }
        });
    }

    public void lambda$performSendDelayedMessage$46(TLObject tLObject, DelayedMessage delayedMessage, String str) {
        boolean z;
        if (tLObject != null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            getMediaDataController().storeTempStickerSet(tL_messages_stickerSet);
            TLRPC.TL_documentAttributeSticker_layer55 tL_documentAttributeSticker_layer55 = (TLRPC.TL_documentAttributeSticker_layer55) delayedMessage.locationParent;
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_documentAttributeSticker_layer55.stickerset = tL_inputStickerSetShortName;
            tL_inputStickerSetShortName.short_name = tL_messages_stickerSet.set.short_name;
            z = true;
        } else {
            z = false;
        }
        ArrayList<DelayedMessage> arrayListRemove = this.delayedMessages.remove(str);
        if (arrayListRemove == null || arrayListRemove.isEmpty()) {
            return;
        }
        if (z) {
            getMessagesStorage().replaceMessageIfExists(arrayListRemove.get(0).obj.messageOwner, null, null, false);
        }
        SecretChatHelper secretChatHelper = getSecretChatHelper();
        TLRPC.DecryptedMessage decryptedMessage = (TLRPC.DecryptedMessage) delayedMessage.sendEncryptedRequest;
        MessageObject messageObject = delayedMessage.obj;
        secretChatHelper.performSendEncryptedRequest(decryptedMessage, messageObject.messageOwner, delayedMessage.encryptedChat, null, null, messageObject);
    }

    private void uploadMultiMedia(final DelayedMessage delayedMessage, final TLRPC.InputMedia inputMedia, TLRPC.InputEncryptedFile inputEncryptedFile, String str) {
        if (inputMedia == null) {
            if (inputEncryptedFile != null) {
                TLRPC.TL_messages_sendEncryptedMultiMedia tL_messages_sendEncryptedMultiMedia = (TLRPC.TL_messages_sendEncryptedMultiMedia) delayedMessage.sendEncryptedRequest;
                int i = 0;
                while (true) {
                    if (i >= tL_messages_sendEncryptedMultiMedia.files.size()) {
                        break;
                    }
                    if (tL_messages_sendEncryptedMultiMedia.files.get(i) == inputEncryptedFile) {
                        putToSendingMessages(delayedMessage.messages.get(i), delayedMessage.scheduled);
                        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileUploadProgressChanged, str, -1L, -1L, Boolean.FALSE);
                        break;
                    }
                    i++;
                }
                sendReadyToSendGroup(delayedMessage, false, true);
                return;
            }
            return;
        }
        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
        tL_messages_uploadMedia.media = inputMedia;
        TLObject tLObject = delayedMessage.sendRequest;
        if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
            TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) tLObject;
            tL_messages_uploadMedia.peer = tL_messages_sendMultiMedia.peer;
            int i2 = 0;
            while (true) {
                if (i2 >= tL_messages_sendMultiMedia.multi_media.size()) {
                    break;
                }
                if (tL_messages_sendMultiMedia.multi_media.get(i2).media == inputMedia) {
                    putToSendingMessages(delayedMessage.messages.get(i2), delayedMessage.scheduled);
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileUploadProgressChanged, str, -1L, -1L, Boolean.FALSE);
                    break;
                }
                i2++;
            }
        } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
            TLRPC.InputMedia inputMedia2 = tL_messages_sendMedia.media;
            if (inputMedia2 instanceof TLRPC.TL_inputMediaPaidMedia) {
                tL_messages_uploadMedia.peer = tL_messages_sendMedia.peer;
                TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = (TLRPC.TL_inputMediaPaidMedia) inputMedia2;
                int i3 = 0;
                while (true) {
                    if (i3 >= tL_inputMediaPaidMedia.extended_media.size()) {
                        break;
                    }
                    if (tL_inputMediaPaidMedia.extended_media.get(i3) == inputMedia) {
                        putToSendingMessages(delayedMessage.messages.get(i3), delayedMessage.scheduled);
                        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileUploadProgressChanged, str, -1L, -1L, Boolean.FALSE);
                        break;
                    }
                    i3++;
                }
            }
        }
        getConnectionsManager().sendRequest(tL_messages_uploadMedia, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                this.f$0.lambda$uploadMultiMedia$49(inputMedia, delayedMessage, tLObject2, tL_error);
            }
        });
    }

    public void lambda$uploadMultiMedia$49(final TLRPC.InputMedia inputMedia, final DelayedMessage delayedMessage, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$uploadMultiMedia$48(tLObject, inputMedia, delayedMessage);
            }
        });
    }

    public void lambda$uploadMultiMedia$48(org.telegram.tgnet.TLObject r6, org.telegram.tgnet.TLRPC.InputMedia r7, org.telegram.messenger.SendMessagesHelper.DelayedMessage r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.lambda$uploadMultiMedia$48(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$InputMedia, org.telegram.messenger.SendMessagesHelper$DelayedMessage):void");
    }

    private void sendReadyToSendGroup(org.telegram.messenger.SendMessagesHelper.DelayedMessage r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.sendReadyToSendGroup(org.telegram.messenger.SendMessagesHelper$DelayedMessage, boolean, boolean):void");
    }

    protected void putToSendingMessages(final TLRPC.Message message, final boolean z) {
        if (Thread.currentThread() != ApplicationLoader.applicationHandler.getLooper().getThread()) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$putToSendingMessages$50(message, z);
                }
            });
        } else {
            putToSendingMessages(message, z, true);
        }
    }

    public void lambda$putToSendingMessages$50(TLRPC.Message message, boolean z) {
        putToSendingMessages(message, z, true);
    }

    protected void putToSendingMessages(TLRPC.Message message, boolean z, boolean z2) {
        if (message == null) {
            return;
        }
        int i = message.id;
        if (i > 0) {
            this.editingMessages.put(i, message);
            return;
        }
        boolean z3 = this.sendingMessages.indexOfKey(i) >= 0;
        removeFromUploadingMessages(message.id, z);
        this.sendingMessages.put(message.id, message);
        if (z || z3) {
            return;
        }
        long dialogId = MessageObject.getDialogId(message);
        LongSparseArray longSparseArray = this.sendingMessagesIdDialogs;
        longSparseArray.put(dialogId, Integer.valueOf(((Integer) longSparseArray.get(dialogId, 0)).intValue() + 1));
        if (z2) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.sendingMessagesChanged, new Object[0]);
        }
    }

    protected TLRPC.Message removeFromSendingMessages(int i, boolean z) {
        if (i > 0) {
            TLRPC.Message message = this.editingMessages.get(i);
            if (message == null) {
                return message;
            }
            this.editingMessages.remove(i);
            return message;
        }
        TLRPC.Message message2 = this.sendingMessages.get(i);
        if (message2 != null) {
            this.sendingMessages.remove(i);
            if (!z) {
                long dialogId = MessageObject.getDialogId(message2);
                Integer num = (Integer) this.sendingMessagesIdDialogs.get(dialogId);
                if (num != null) {
                    int iIntValue = num.intValue() - 1;
                    if (iIntValue <= 0) {
                        this.sendingMessagesIdDialogs.remove(dialogId);
                    } else {
                        this.sendingMessagesIdDialogs.put(dialogId, Integer.valueOf(iIntValue));
                    }
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.sendingMessagesChanged, new Object[0]);
                }
            }
        }
        return message2;
    }

    public int getSendingMessageId(long j) {
        for (int i = 0; i < this.sendingMessages.size(); i++) {
            TLRPC.Message messageValueAt = this.sendingMessages.valueAt(i);
            if (messageValueAt.dialog_id == j) {
                return messageValueAt.id;
            }
        }
        for (int i2 = 0; i2 < this.uploadMessages.size(); i2++) {
            TLRPC.Message messageValueAt2 = this.uploadMessages.valueAt(i2);
            if (messageValueAt2.dialog_id == j) {
                return messageValueAt2.id;
            }
        }
        return 0;
    }

    protected void putToUploadingMessages(MessageObject messageObject) {
        if (messageObject == null || messageObject.getId() > 0 || messageObject.scheduled) {
            return;
        }
        TLRPC.Message message = messageObject.messageOwner;
        boolean z = this.uploadMessages.indexOfKey(message.id) >= 0;
        this.uploadMessages.put(message.id, message);
        if (z) {
            return;
        }
        long dialogId = MessageObject.getDialogId(message);
        LongSparseArray longSparseArray = this.uploadingMessagesIdDialogs;
        longSparseArray.put(dialogId, Integer.valueOf(((Integer) longSparseArray.get(dialogId, 0)).intValue() + 1));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.sendingMessagesChanged, new Object[0]);
    }

    protected void removeFromUploadingMessages(int i, boolean z) {
        TLRPC.Message message;
        if (i > 0 || z || (message = this.uploadMessages.get(i)) == null) {
            return;
        }
        this.uploadMessages.remove(i);
        long dialogId = MessageObject.getDialogId(message);
        Integer num = (Integer) this.uploadingMessagesIdDialogs.get(dialogId);
        if (num != null) {
            int iIntValue = num.intValue() - 1;
            if (iIntValue <= 0) {
                this.uploadingMessagesIdDialogs.remove(dialogId);
            } else {
                this.uploadingMessagesIdDialogs.put(dialogId, Integer.valueOf(iIntValue));
            }
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.sendingMessagesChanged, new Object[0]);
        }
    }

    public boolean isSendingMessage(int i) {
        return this.sendingMessages.indexOfKey(i) >= 0 || this.editingMessages.indexOfKey(i) >= 0;
    }

    public boolean isSendingPaidMessage(int i, int i2) {
        HashMap<String, ArrayList<DelayedMessage>> map = this.delayedMessages;
        DelayedMessage delayedMessage = null;
        if (map != null) {
            for (ArrayList<DelayedMessage> arrayList : map.values()) {
                if (arrayList != null) {
                    Iterator<DelayedMessage> it = arrayList.iterator();
                    while (it.hasNext()) {
                        DelayedMessage next = it.next();
                        ArrayList<TLRPC.Message> arrayList2 = next.messages;
                        if (arrayList2 != null) {
                            Iterator<TLRPC.Message> it2 = arrayList2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                TLRPC.Message next2 = it2.next();
                                if (next2 != null && next2.id == i) {
                                    delayedMessage = next;
                                    break;
                                }
                            }
                            if (delayedMessage != null) {
                                break;
                            }
                        }
                    }
                    if (delayedMessage != null) {
                        break;
                    }
                }
            }
        }
        if (delayedMessage != null && i2 >= 0 && i2 < delayedMessage.messages.size()) {
            i = delayedMessage.messages.get(i2).id;
        }
        return this.sendingMessages.indexOfKey(i) >= 0 || this.editingMessages.indexOfKey(i) >= 0;
    }

    public boolean isSendingMessageIdDialog(long j) {
        return ((Integer) this.sendingMessagesIdDialogs.get(j, 0)).intValue() > 0;
    }

    public boolean isUploadingMessageIdDialog(long j) {
        return ((Integer) this.uploadingMessagesIdDialogs.get(j, 0)).intValue() > 0;
    }

    public void lambda$performSendMessageRequestMulti$52(final TLObject tLObject, final ArrayList<MessageObject> arrayList, final ArrayList<String> arrayList2, final ArrayList<Object> arrayList3, final DelayedMessage delayedMessage, final boolean z) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            putToSendingMessages(arrayList.get(i).messageOwner, z);
        }
        if (StarsController.getInstance(this.currentAccount).beforeSendingFinalRequest(tLObject, arrayList, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$performSendMessageRequestMulti$51(tLObject, arrayList, arrayList2, arrayList3, delayedMessage, z);
            }
        }) && BotForumHelper.getInstance(this.currentAccount).beforeSendingFinalRequest(tLObject, arrayList, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$performSendMessageRequestMulti$52(tLObject, arrayList, arrayList2, arrayList3, delayedMessage, z);
            }
        })) {
            getConnectionsManager().sendRequest(tLObject, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$performSendMessageRequestMulti$61(arrayList3, tLObject, arrayList, arrayList2, delayedMessage, z, tLObject2, tL_error);
                }
            }, (QuickAckDelegate) null, 68);
        }
    }

    public void lambda$performSendMessageRequestMulti$61(ArrayList arrayList, final TLObject tLObject, final ArrayList arrayList2, final ArrayList arrayList3, final DelayedMessage delayedMessage, final boolean z, final TLObject tLObject2, final TLRPC.TL_error tL_error) {
        if (tL_error != null && FileRefController.isFileRefError(tL_error.text)) {
            final int fileRefErrorIndex = FileRefController.getFileRefErrorIndex(tL_error.text);
            if (arrayList != null) {
                ArrayList arrayList4 = new ArrayList(arrayList);
                if (fileRefErrorIndex >= 0) {
                    int i = 0;
                    while (i < arrayList4.size()) {
                        arrayList4.set(i, fileRefErrorIndex == i ? arrayList4.get(i) : null);
                        i++;
                    }
                }
                getFileRefController().requestReference(arrayList4, tLObject, arrayList2, arrayList3, arrayList4, delayedMessage, Boolean.valueOf(z));
                return;
            }
            if (delayedMessage != null && !delayedMessage.getRetriedToSend(fileRefErrorIndex)) {
                delayedMessage.setRetriedToSend(fileRefErrorIndex, true);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$performSendMessageRequestMulti$53(tLObject, fileRefErrorIndex, delayedMessage, arrayList2, z);
                    }
                });
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$performSendMessageRequestMulti$60(tL_error, tLObject2, z, arrayList2, arrayList3, tLObject);
            }
        });
    }

    public void lambda$performSendMessageRequestMulti$53(org.telegram.tgnet.TLObject r9, int r10, org.telegram.messenger.SendMessagesHelper.DelayedMessage r11, java.util.ArrayList r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.lambda$performSendMessageRequestMulti$53(org.telegram.tgnet.TLObject, int, org.telegram.messenger.SendMessagesHelper$DelayedMessage, java.util.ArrayList, boolean):void");
    }

    public void lambda$performSendMessageRequestMulti$60(TLRPC.TL_error tL_error, TLObject tLObject, final boolean z, ArrayList arrayList, ArrayList arrayList2, TLObject tLObject2) {
        final SendMessagesHelper sendMessagesHelper;
        char c;
        TLRPC.TL_error tL_error2;
        boolean z2;
        String str;
        int i;
        TLRPC.Updates updates;
        TLRPC.Message message;
        ArrayList arrayList3;
        int i2;
        TLRPC.Message message2;
        TLRPC.Updates updates2;
        LongSparseArray longSparseArray;
        SparseArray sparseArray;
        ArrayList arrayList4;
        int i3;
        String quickReplyName;
        int i4;
        TLRPC.MessageReplyHeader messageReplyHeader;
        ArrayList arrayList5 = arrayList;
        if (tL_error == null) {
            SparseArray sparseArray2 = new SparseArray();
            LongSparseArray longSparseArray2 = new LongSparseArray();
            TLRPC.Updates updates3 = (TLRPC.Updates) tLObject;
            ArrayList<TLRPC.Update> arrayList6 = updates3.updates;
            boolean z3 = z ? 1 : 0;
            int i5 = 0;
            LongSparseArray longSparseArray3 = null;
            while (i5 < arrayList6.size()) {
                TLRPC.Update update = arrayList6.get(i5);
                if (update instanceof TLRPC.TL_updateMessageID) {
                    TLRPC.TL_updateMessageID tL_updateMessageID = (TLRPC.TL_updateMessageID) update;
                    longSparseArray2.put(tL_updateMessageID.random_id, Integer.valueOf(tL_updateMessageID.id));
                    arrayList6.remove(i5);
                    i5--;
                } else {
                    if (update instanceof TLRPC.TL_updateNewMessage) {
                        final TLRPC.TL_updateNewMessage tL_updateNewMessage = (TLRPC.TL_updateNewMessage) update;
                        TLRPC.Message message3 = tL_updateNewMessage.message;
                        sparseArray2.put(message3.id, message3);
                        Utilities.stageQueue.postRunnable(new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.lambda$performSendMessageRequestMulti$54(tL_updateNewMessage);
                            }
                        });
                        arrayList6.remove(i5);
                    } else if (update instanceof TLRPC.TL_updateNewChannelMessage) {
                        final TLRPC.TL_updateNewChannelMessage tL_updateNewChannelMessage = (TLRPC.TL_updateNewChannelMessage) update;
                        final long updateChannelId = MessagesController.getUpdateChannelId(tL_updateNewChannelMessage);
                        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(updateChannelId));
                        if ((chat == null || chat.megagroup) && (messageReplyHeader = tL_updateNewChannelMessage.message.reply_to) != null && (messageReplyHeader.reply_to_top_id != 0 || messageReplyHeader.reply_to_msg_id != 0)) {
                            if (longSparseArray3 == null) {
                                longSparseArray3 = new LongSparseArray();
                            }
                            long dialogId = MessageObject.getDialogId(tL_updateNewChannelMessage.message);
                            SparseArray sparseArray3 = (SparseArray) longSparseArray3.get(dialogId);
                            if (sparseArray3 == null) {
                                sparseArray3 = new SparseArray();
                                longSparseArray3.put(dialogId, sparseArray3);
                            }
                            TLRPC.MessageReplyHeader messageReplyHeader2 = tL_updateNewChannelMessage.message.reply_to;
                            int i6 = messageReplyHeader2.reply_to_top_id;
                            if (i6 == 0) {
                                i6 = messageReplyHeader2.reply_to_msg_id;
                            }
                            TLRPC.MessageReplies tL_messageReplies = (TLRPC.MessageReplies) sparseArray3.get(i6);
                            if (tL_messageReplies == null) {
                                tL_messageReplies = new TLRPC.TL_messageReplies();
                                sparseArray3.put(i6, tL_messageReplies);
                            }
                            TLRPC.MessageReplies messageReplies = tL_messageReplies;
                            TLRPC.Peer peer = tL_updateNewChannelMessage.message.from_id;
                            if (peer != null) {
                                messageReplies.recent_repliers.add(0, peer);
                            }
                            messageReplies.replies++;
                        }
                        TLRPC.Message message4 = tL_updateNewChannelMessage.message;
                        sparseArray2.put(message4.id, message4);
                        Utilities.stageQueue.postRunnable(new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.lambda$performSendMessageRequestMulti$55(tL_updateNewChannelMessage);
                            }
                        });
                        arrayList6.remove(i5);
                        i5--;
                        if (tL_updateNewChannelMessage.message.pinned) {
                            Utilities.stageQueue.postRunnable(new Runnable() {
                                @Override
                                public final void run() {
                                    this.f$0.lambda$performSendMessageRequestMulti$56(tL_updateNewChannelMessage, updateChannelId);
                                }
                            });
                        }
                    } else if (update instanceof TLRPC.TL_updateNewScheduledMessage) {
                        TLRPC.Message message5 = ((TLRPC.TL_updateNewScheduledMessage) update).message;
                        sparseArray2.put(message5.id, message5);
                        arrayList6.remove(i5);
                        i5--;
                        i4 = 1;
                        z3 = true;
                        i5 += i4;
                    } else if (update instanceof TLRPC.TL_updateQuickReplyMessage) {
                        QuickRepliesController quickRepliesController = QuickRepliesController.getInstance(this.currentAccount);
                        if (arrayList.isEmpty()) {
                            i3 = 0;
                            quickReplyName = null;
                        } else {
                            i3 = 0;
                            quickReplyName = ((MessageObject) arrayList5.get(0)).getQuickReplyName();
                        }
                        quickRepliesController.processUpdate(update, quickReplyName, (arrayList.isEmpty() ? null : Integer.valueOf(((MessageObject) arrayList5.get(i3)).getQuickReplyId())).intValue());
                        TLRPC.Message message6 = ((TLRPC.TL_updateQuickReplyMessage) update).message;
                        sparseArray2.put(message6.id, message6);
                        arrayList6.remove(i5);
                    }
                    i5--;
                    i4 = 1;
                    z3 = false;
                    i5 += i4;
                }
                i4 = 1;
                i5 += i4;
            }
            if (longSparseArray3 != null) {
                getMessagesStorage().putChannelViews(null, null, longSparseArray3, true);
                i = 0;
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateMessagesViews, null, null, longSparseArray3, Boolean.TRUE);
            } else {
                i = 0;
            }
            int[] iArr = new int[1];
            iArr[i] = i;
            final int[] iArr2 = {i};
            final ArrayList arrayList7 = new ArrayList();
            int i7 = 0;
            while (i7 < arrayList.size()) {
                final MessageObject messageObject = (MessageObject) arrayList5.get(i7);
                String str2 = (String) arrayList2.get(i7);
                TLRPC.Message message7 = messageObject.messageOwner;
                int i8 = message7.id;
                ArrayList arrayList8 = new ArrayList();
                int i9 = i7;
                Integer num = (Integer) longSparseArray2.get(message7.random_id);
                if (num == null || (message = (TLRPC.Message) sparseArray2.get(num.intValue())) == null) {
                    updates = updates3;
                    z2 = true;
                    break;
                }
                MessageObject.getDialogId(message);
                arrayList8.add(message);
                if ((message.flags & 33554432) != 0) {
                    TLRPC.Message message8 = messageObject.messageOwner;
                    arrayList3 = arrayList8;
                    message8.ttl_period = message.ttl_period;
                    message8.flags |= 33554432;
                } else {
                    arrayList3 = arrayList8;
                }
                if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
                    arrayList4 = arrayList3;
                    i2 = i8;
                    updates2 = updates3;
                    longSparseArray = longSparseArray2;
                    sparseArray = sparseArray2;
                    message2 = message7;
                    updateMediaPaths((MessageObject) arrayList5.get(0), message, message.id, arrayList2, false, -1);
                } else {
                    i2 = i8;
                    message2 = message7;
                    updates2 = updates3;
                    longSparseArray = longSparseArray2;
                    sparseArray = sparseArray2;
                    arrayList4 = arrayList3;
                    updateMediaPaths(messageObject, message, message.id, str2, false);
                }
                final int mediaExistanceFlags = messageObject.getMediaExistanceFlags();
                message2.id = message.id;
                int i10 = message.quick_reply_shortcut_id;
                message2.quick_reply_shortcut_id = i10;
                if (i10 != 0) {
                    message2.flags |= 1073741824;
                }
                final long j = message.grouped_id;
                if (!z) {
                    Integer numValueOf = getMessagesController().dialogs_read_outbox_max.get(Long.valueOf(message.dialog_id));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(getMessagesStorage().getDialogReadMax(message.out, message.dialog_id));
                        getMessagesController().dialogs_read_outbox_max.put(Long.valueOf(message.dialog_id), numValueOf);
                    }
                    message.unread = numValueOf.intValue() < message.id;
                }
                iArr[0] = iArr[0] + 1;
                arrayList7.add(Integer.valueOf(i2));
                getStatsController().incrementSentItemsCount(ApplicationLoader.getCurrentNetworkType(), 1, 1);
                message2.send_state = 0;
                message2.errorAllowedPriceStars = 0L;
                message2.errorNewPriceStars = 0L;
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageReceivedByServer, Integer.valueOf(i2), Integer.valueOf(message2.id), message2, Long.valueOf(message2.dialog_id), Long.valueOf(j), Integer.valueOf(mediaExistanceFlags), Boolean.valueOf(z3));
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageReceivedByServer2, Integer.valueOf(i2), Integer.valueOf(message2.id), message2, Long.valueOf(message2.dialog_id), Long.valueOf(j), Integer.valueOf(mediaExistanceFlags), Boolean.valueOf(z3));
                final boolean z4 = z3;
                final TLRPC.Message message9 = message2;
                final int i11 = i2;
                final ArrayList arrayList9 = arrayList4;
                final int[] iArr3 = iArr;
                final SparseArray sparseArray4 = sparseArray;
                arrayList7 = arrayList7;
                getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$performSendMessageRequestMulti$58(z4, message9, i11, arrayList9, iArr2, iArr3, z, messageObject, sparseArray4, arrayList7, j, mediaExistanceFlags);
                    }
                });
                i7 = i9 + 1;
                arrayList5 = arrayList;
                longSparseArray2 = longSparseArray;
                iArr = iArr;
                updates3 = updates2;
                sparseArray2 = sparseArray;
            }
            updates = updates3;
            z2 = false;
            c = 0;
            sendMessagesHelper = this;
            final TLRPC.Updates updates4 = updates;
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$performSendMessageRequestMulti$59(updates4);
                }
            });
            tL_error2 = tL_error;
        } else {
            sendMessagesHelper = this;
            c = 0;
            tL_error2 = tL_error;
            AlertsCreator.processError(sendMessagesHelper.currentAccount, tL_error2, null, tLObject2, new Object[0]);
            z2 = true;
        }
        if (z2) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                MessageObject messageObject2 = (MessageObject) arrayList.get(i12);
                TLRPC.Message message10 = messageObject2.messageOwner;
                getMessagesStorage().markMessageAsSendError(message10, z ? 1 : 0);
                message10.send_state = 2;
                if (!z && tL_error2 != null && (str = tL_error2.text) != null && str.startsWith("ALLOW_PAYMENT_REQUIRED_")) {
                    StarsController.getInstance(sendMessagesHelper.currentAccount);
                    message10.errorAllowedPriceStars = StarsController.getAllowedPaidStars(tLObject2);
                    message10.errorNewPriceStars = Long.parseLong(tL_error2.text.substring(23));
                    StarsController starsController = StarsController.getInstance(sendMessagesHelper.currentAccount);
                    MessageObject[] messageObjectArr = new MessageObject[1];
                    messageObjectArr[c] = messageObject2;
                    starsController.showPriceChangedToast(Arrays.asList(messageObjectArr));
                    getMessagesStorage().updateMessageCustomParams(MessageObject.getDialogId(message10), message10);
                }
                NotificationCenter notificationCenter = getNotificationCenter();
                int i13 = NotificationCenter.messageSendError;
                Object[] objArr = new Object[1];
                objArr[c] = Integer.valueOf(message10.id);
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i13, objArr);
                sendMessagesHelper.processSentMessage(message10.id);
                sendMessagesHelper.removeFromSendingMessages(message10.id, z);
            }
        }
    }

    public void lambda$performSendMessageRequestMulti$54(TLRPC.TL_updateNewMessage tL_updateNewMessage) {
        getMessagesController().processNewDifferenceParams(-1, tL_updateNewMessage.pts, -1, tL_updateNewMessage.pts_count);
    }

    public void lambda$performSendMessageRequestMulti$55(TLRPC.TL_updateNewChannelMessage tL_updateNewChannelMessage) {
        getMessagesController().processNewChannelDifferenceParams(tL_updateNewChannelMessage.pts, tL_updateNewChannelMessage.pts_count, tL_updateNewChannelMessage.message.peer_id.channel_id);
    }

    public void lambda$performSendMessageRequestMulti$56(TLRPC.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(tL_updateNewChannelMessage.message.id));
        getMessagesStorage().updatePinnedMessages(-j, arrayList, true, -1, 0, false, null);
    }

    public void lambda$performSendMessageRequestMulti$58(final boolean z, final TLRPC.Message message, final int i, ArrayList arrayList, final int[] iArr, final int[] iArr2, final boolean z2, final MessageObject messageObject, final SparseArray sparseArray, final ArrayList arrayList2, final long j, final int i2) {
        int i3 = (message.quick_reply_shortcut_id == 0 && message.quick_reply_shortcut == null) ? z ? 1 : 0 : 5;
        getMessagesStorage().updateMessageStateAndId(message.random_id, MessageObject.getPeerId(message.peer_id), Integer.valueOf(i), message.id, 0, false, i3, message.quick_reply_shortcut_id);
        getMessagesStorage().putMessages((ArrayList<TLRPC.Message>) arrayList, true, false, false, 0, i3, message.quick_reply_shortcut_id);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$performSendMessageRequestMulti$57(iArr, iArr2, z2, z, messageObject, sparseArray, arrayList2, message, i, j, i2);
            }
        });
    }

    public void lambda$performSendMessageRequestMulti$57(int[] iArr, int[] iArr2, boolean z, boolean z2, MessageObject messageObject, SparseArray sparseArray, ArrayList arrayList, TLRPC.Message message, int i, long j, int i2) {
        char c;
        char c2;
        int i3 = iArr[0] + 1;
        iArr[0] = i3;
        if (i3 != iArr2[0] || z == z2) {
            c = 0;
            c2 = 1;
        } else {
            long dialogId = messageObject.getDialogId();
            int iKeyAt = (!z2 || sparseArray.size() <= 1) ? 0 : sparseArray.keyAt(0);
            c2 = 1;
            c = 0;
            getMessagesController().deleteMessages(arrayList, null, null, dialogId, false, z ? 1 : 0, false, 0L, null, 0, z2 && !z, iKeyAt);
        }
        getMediaDataController().increasePeerRaiting(message.dialog_id);
        NotificationCenter notificationCenter = getNotificationCenter();
        int i4 = NotificationCenter.messageReceivedByServer;
        Integer numValueOf = Integer.valueOf(i);
        Integer numValueOf2 = Integer.valueOf(message.id);
        Long lValueOf = Long.valueOf(message.dialog_id);
        Long lValueOf2 = Long.valueOf(j);
        Integer numValueOf3 = Integer.valueOf(i2);
        Boolean boolValueOf = Boolean.valueOf(z2);
        Object[] objArr = new Object[7];
        objArr[c] = numValueOf;
        objArr[c2] = numValueOf2;
        objArr[2] = message;
        objArr[3] = lValueOf;
        objArr[4] = lValueOf2;
        objArr[5] = numValueOf3;
        objArr[6] = boolValueOf;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i4, objArr);
        NotificationCenter notificationCenter2 = getNotificationCenter();
        int i5 = NotificationCenter.messageReceivedByServer2;
        Integer numValueOf4 = Integer.valueOf(i);
        Integer numValueOf5 = Integer.valueOf(message.id);
        Long lValueOf3 = Long.valueOf(message.dialog_id);
        Long lValueOf4 = Long.valueOf(j);
        Integer numValueOf6 = Integer.valueOf(i2);
        Boolean boolValueOf2 = Boolean.valueOf(z2);
        Object[] objArr2 = new Object[7];
        objArr2[c] = numValueOf4;
        objArr2[c2] = numValueOf5;
        objArr2[2] = message;
        objArr2[3] = lValueOf3;
        objArr2[4] = lValueOf4;
        objArr2[5] = numValueOf6;
        objArr2[6] = boolValueOf2;
        notificationCenter2.lambda$postNotificationNameOnUIThread$1(i5, objArr2);
        processSentMessage(i);
        removeFromSendingMessages(i, z);
    }

    public void lambda$performSendMessageRequestMulti$59(TLRPC.Updates updates) {
        getMessagesController().processUpdates(updates, false);
    }

    public void performSendMessageRequest(TLObject tLObject, MessageObject messageObject, String str, DelayedMessage delayedMessage, Object obj, HashMap<String, String> map, boolean z) {
        lambda$performSendMessageRequest$66(tLObject, messageObject, str, null, false, delayedMessage, obj, map, z);
    }

    private org.telegram.messenger.SendMessagesHelper.DelayedMessage findMaxDelayedMessageForMessageId(int r12, long r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.findMaxDelayedMessageForMessageId(int, long):org.telegram.messenger.SendMessagesHelper$DelayedMessage");
    }

    public void lambda$performSendMessageRequest$66(final TLObject tLObject, final MessageObject messageObject, final String str, final DelayedMessage delayedMessage, final boolean z, final DelayedMessage delayedMessage2, final Object obj, final HashMap<String, String> map, final boolean z2) {
        DelayedMessage delayedMessageFindMaxDelayedMessageForMessageId;
        ArrayList<DelayedMessageSendAfterRequest> arrayList;
        if (!(tLObject instanceof TLRPC.TL_messages_editMessage) && z && (delayedMessageFindMaxDelayedMessageForMessageId = findMaxDelayedMessageForMessageId(messageObject.getId(), messageObject.getDialogId())) != null) {
            delayedMessageFindMaxDelayedMessageForMessageId.addDelayedRequest(tLObject, messageObject, str, obj, delayedMessage2, delayedMessage != null ? delayedMessage.scheduled : false);
            if (delayedMessage == null || (arrayList = delayedMessage.requests) == null) {
                return;
            }
            delayedMessageFindMaxDelayedMessageForMessageId.requests.addAll(arrayList);
            return;
        }
        final TLRPC.Message message = messageObject.messageOwner;
        putToSendingMessages(message, z2);
        if (StarsController.getInstance(this.currentAccount).beforeSendingFinalRequest(tLObject, messageObject, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$performSendMessageRequest$62(tLObject, messageObject, str, delayedMessage, z, delayedMessage2, obj, map, z2);
            }
        }) && BotForumHelper.getInstance(this.currentAccount).beforeSendingFinalRequest(tLObject, messageObject, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$performSendMessageRequest$63(tLObject, messageObject, str, delayedMessage, z, delayedMessage2, obj, map, z2);
            }
        })) {
            message.reqId = getConnectionsManager().sendRequest(tLObject, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$performSendMessageRequest$81(tLObject, messageObject, str, delayedMessage, z, delayedMessage2, obj, map, z2, message, tLObject2, tL_error);
                }
            }, new QuickAckDelegate() {
                @Override
                public final void run() {
                    this.f$0.lambda$performSendMessageRequest$83(message);
                }
            }, (tLObject instanceof TLRPC.TL_messages_sendMessage ? 128 : 0) | 68);
            if (delayedMessage != null) {
                delayedMessage.sendDelayedRequests();
            }
        }
    }

    public void lambda$performSendMessageRequest$81(final TLObject tLObject, final MessageObject messageObject, final String str, final DelayedMessage delayedMessage, final boolean z, final DelayedMessage delayedMessage2, final Object obj, final HashMap map, final boolean z2, final TLRPC.Message message, final TLObject tLObject2, final TLRPC.TL_error tL_error) {
        if (tL_error != null && (((tLObject instanceof TLRPC.TL_messages_sendMedia) || (tLObject instanceof TLRPC.TL_messages_editMessage)) && FileRefController.isFileRefError(tL_error.text))) {
            if (FileRefController.isFileRefErrorCover(tL_error.text)) {
                if (removeCoverFromRequest(tLObject)) {
                    lambda$performSendMessageRequest$66(tLObject, messageObject, str, delayedMessage, z, delayedMessage2, obj, map, z2);
                    return;
                }
            } else if (obj != null) {
                getFileRefController().requestReference(obj, tLObject, messageObject, str, delayedMessage, Boolean.valueOf(z), delayedMessage2, Boolean.valueOf(z2));
                return;
            } else if (delayedMessage2 != null) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$performSendMessageRequest$64(message, z2, tLObject, delayedMessage2);
                    }
                });
                return;
            }
        }
        if (tL_error != null && (tLObject instanceof TLRPC.TL_messages_sendMedia)) {
            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
            if (tL_messages_sendMedia.media instanceof TLRPC.TL_inputMediaStakeDice) {
                if ("GAME_HASH_INVALID".equalsIgnoreCase(tL_error.text)) {
                    getConnectionsManager().sendRequestTyped(new TLRPC.TL_messages_getEmojiGameInfo(), new BotForumHelper$$ExternalSyntheticLambda2(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj2, Object obj3) {
                            this.f$0.lambda$performSendMessageRequest$65(tLObject, messageObject, str, delayedMessage, z, delayedMessage2, obj, map, z2, (TLRPC.EmojiGameInfo) obj2, (TLRPC.TL_error) obj3);
                        }
                    });
                    return;
                } else if ("BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                    final TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice = (TLRPC.TL_inputMediaStakeDice) tL_messages_sendMedia.media;
                    final BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                    if (safeLastFragment != null) {
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.lambda$performSendMessageRequest$67(safeLastFragment, tL_inputMediaStakeDice, tLObject, messageObject, str, delayedMessage, z, delayedMessage2, obj, map, z2);
                            }
                        });
                        return;
                    }
                }
            }
        }
        if (tLObject instanceof TLRPC.TL_messages_editMessage) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$performSendMessageRequest$70(tL_error, message, tLObject2, messageObject, str, z2, tLObject);
                }
            });
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$performSendMessageRequest$80(z2, tL_error, message, tLObject2, messageObject, str, tLObject);
                }
            });
        }
    }

    public void lambda$performSendMessageRequest$64(TLRPC.Message message, boolean z, TLObject tLObject, DelayedMessage delayedMessage) {
        removeFromSendingMessages(message.id, z);
        if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
            TLRPC.InputMedia inputMedia = tL_messages_sendMedia.media;
            if ((inputMedia instanceof TLRPC.TL_inputMediaPhoto) || (inputMedia instanceof TLRPC.TL_inputMediaDocument)) {
                tL_messages_sendMedia.media = delayedMessage.inputUploadMedia;
            }
        } else if (tLObject instanceof TLRPC.TL_messages_editMessage) {
            TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) tLObject;
            TLRPC.InputMedia inputMedia2 = tL_messages_editMessage.media;
            if ((inputMedia2 instanceof TLRPC.TL_inputMediaPhoto) || (inputMedia2 instanceof TLRPC.TL_inputMediaDocument)) {
                tL_messages_editMessage.media = delayedMessage.inputUploadMedia;
            }
        }
        delayedMessage.performMediaUpload = true;
        performSendDelayedMessage(delayedMessage);
    }

    public void lambda$performSendMessageRequest$65(TLObject tLObject, MessageObject messageObject, String str, DelayedMessage delayedMessage, boolean z, DelayedMessage delayedMessage2, Object obj, HashMap map, boolean z2, TLRPC.EmojiGameInfo emojiGameInfo, TLRPC.TL_error tL_error) {
        if (emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo) {
            String str2 = ((TLRPC.TL_emojiGameDiceInfo) emojiGameInfo).game_hash;
            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
            TLRPC.InputMedia inputMedia = tL_messages_sendMedia.media;
            if (inputMedia instanceof TLRPC.TL_inputMediaStakeDice) {
                ((TLRPC.TL_inputMediaStakeDice) inputMedia).game_hash = str2;
            }
            lambda$performSendMessageRequest$66(tL_messages_sendMedia, messageObject, str, delayedMessage, z, delayedMessage2, obj, map, z2);
        }
    }

    public void lambda$performSendMessageRequest$67(BaseFragment baseFragment, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, final TLObject tLObject, final MessageObject messageObject, final String str, final DelayedMessage delayedMessage, final boolean z, final DelayedMessage delayedMessage2, final Object obj, final HashMap map, final boolean z2) {
        new TONIntroActivity.StarsNeededSheet(baseFragment.getContext(), baseFragment.getResourceProvider(), AmountUtils$Amount.fromNano(tL_inputMediaStakeDice.ton_amount, AmountUtils$Currency.TON), false, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$performSendMessageRequest$66(tLObject, messageObject, str, delayedMessage, z, delayedMessage2, obj, map, z2);
            }
        }).show();
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        arrayList.add(messageObject);
        cancelSendingMessage(arrayList);
    }

    public void lambda$performSendMessageRequest$70(TLRPC.TL_error tL_error, final TLRPC.Message message, TLObject tLObject, MessageObject messageObject, String str, final boolean z, TLObject tLObject2) {
        int i = 0;
        TLRPC.Message message2 = null;
        if (tL_error == null) {
            String str2 = message.attachPath;
            final TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            ArrayList<TLRPC.Update> arrayList = updates.updates;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                TLRPC.Update update = arrayList.get(i);
                if (update instanceof TLRPC.TL_updateEditMessage) {
                    message2 = ((TLRPC.TL_updateEditMessage) update).message;
                    break;
                }
                if (update instanceof TLRPC.TL_updateEditChannelMessage) {
                    message2 = ((TLRPC.TL_updateEditChannelMessage) update).message;
                    break;
                }
                if (update instanceof TLRPC.TL_updateNewScheduledMessage) {
                    message2 = ((TLRPC.TL_updateNewScheduledMessage) update).message;
                    break;
                } else {
                    if (update instanceof TLRPC.TL_updateQuickReplyMessage) {
                        QuickRepliesController.getInstance(this.currentAccount).processUpdate(update, MessageObject.getQuickReplyName(message), MessageObject.getQuickReplyId(message));
                        message2 = ((TLRPC.TL_updateQuickReplyMessage) update).message;
                        break;
                    }
                    i++;
                }
            }
            TLRPC.Message message3 = message2;
            if (message3 != null) {
                ImageLoader.saveMessageThumbs(message3);
                updateMediaPaths(messageObject, message3, message3.id, str, false);
            }
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$performSendMessageRequest$69(updates, message, z);
                }
            });
            return;
        }
        AlertsCreator.processError(this.currentAccount, tL_error, null, tLObject2, new Object[0]);
        removeFromSendingMessages(message.id, z);
        revertEditingMessageObject(messageObject);
    }

    public void lambda$performSendMessageRequest$69(TLRPC.Updates updates, final TLRPC.Message message, final boolean z) {
        getMessagesController().processUpdates(updates, false);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$performSendMessageRequest$68(message, z);
            }
        });
    }

    public void lambda$performSendMessageRequest$68(TLRPC.Message message, boolean z) {
        processSentMessage(message.id);
        removeFromSendingMessages(message.id, z);
    }

    public void lambda$performSendMessageRequest$80(final boolean z, TLRPC.TL_error tL_error, final TLRPC.Message message, TLObject tLObject, MessageObject messageObject, String str, TLObject tLObject2) {
        TLRPC.TL_error tL_error2;
        boolean z2;
        ?? r10;
        String str2;
        int i;
        final boolean z3;
        int i2;
        boolean z4;
        boolean z5;
        int mediaExistanceFlags;
        boolean z6;
        int i3;
        boolean z7;
        TLRPC.MessageReplyHeader messageReplyHeader;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11 = z;
        if (tL_error == null) {
            int i4 = message.id;
            final ArrayList arrayList = new ArrayList();
            boolean z12 = message.date == 2147483646;
            if (tLObject instanceof TLRPC.TL_updateShortSentMessage) {
                final TLRPC.TL_updateShortSentMessage tL_updateShortSentMessage = (TLRPC.TL_updateShortSentMessage) tLObject;
                i = i4;
                z4 = false;
                updateMediaPaths(messageObject, null, tL_updateShortSentMessage.id, null, false);
                int mediaExistanceFlags2 = messageObject.getMediaExistanceFlags();
                int i5 = tL_updateShortSentMessage.id;
                message.id = i5;
                message.local_id = i5;
                message.date = tL_updateShortSentMessage.date;
                message.entities = tL_updateShortSentMessage.entities;
                message.out = tL_updateShortSentMessage.out;
                if ((tL_updateShortSentMessage.flags & 33554432) != 0) {
                    message.ttl_period = tL_updateShortSentMessage.ttl_period;
                    message.flags |= 33554432;
                }
                TLRPC.MessageMedia messageMedia = tL_updateShortSentMessage.media;
                if (messageMedia != null) {
                    message.media = messageMedia;
                    message.flags |= 512;
                    ImageLoader.saveMessageThumbs(message);
                }
                TLRPC.MessageMedia messageMedia2 = tL_updateShortSentMessage.media;
                if (((messageMedia2 instanceof TLRPC.TL_messageMediaGame) || (messageMedia2 instanceof TLRPC.TL_messageMediaInvoice)) && !TextUtils.isEmpty(tL_updateShortSentMessage.message)) {
                    message.message = tL_updateShortSentMessage.message;
                }
                if (!message.entities.isEmpty()) {
                    message.flags |= 128;
                }
                Integer numValueOf = getMessagesController().dialogs_read_outbox_max.get(Long.valueOf(message.dialog_id));
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(getMessagesStorage().getDialogReadMax(message.out, message.dialog_id));
                    getMessagesController().dialogs_read_outbox_max.put(Long.valueOf(message.dialog_id), numValueOf);
                }
                message.unread = numValueOf.intValue() < message.id;
                Utilities.stageQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$performSendMessageRequest$71(tL_updateShortSentMessage);
                    }
                });
                arrayList.add(message);
                i2 = mediaExistanceFlags2;
                z3 = false;
            } else {
                i = i4;
                if (tLObject instanceof TLRPC.Updates) {
                    final TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList<TLRPC.Update> arrayList2 = updates.updates;
                    boolean z13 = z11 ? 1 : 0;
                    int i6 = 0;
                    TLRPC.Message message2 = null;
                    LongSparseArray longSparseArray = null;
                    while (i6 < arrayList2.size()) {
                        TLRPC.Update update = arrayList2.get(i6);
                        if (update instanceof TLRPC.TL_updateNewMessage) {
                            final TLRPC.TL_updateNewMessage tL_updateNewMessage = (TLRPC.TL_updateNewMessage) update;
                            TLRPC.Message message3 = tL_updateNewMessage.message;
                            if (message3.action == null) {
                                arrayList.add(message3);
                                Utilities.stageQueue.postRunnable(new Runnable() {
                                    @Override
                                    public final void run() {
                                        this.f$0.lambda$performSendMessageRequest$72(tL_updateNewMessage);
                                    }
                                });
                                arrayList2.remove(i6);
                                i6--;
                                z7 = z13;
                                message2 = message3;
                                i3 = 1;
                            }
                            i3 = 1;
                            z7 = z13;
                        } else {
                            if (update instanceof TLRPC.TL_updateNewChannelMessage) {
                                final TLRPC.TL_updateNewChannelMessage tL_updateNewChannelMessage = (TLRPC.TL_updateNewChannelMessage) update;
                                final long updateChannelId = MessagesController.getUpdateChannelId(tL_updateNewChannelMessage);
                                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(updateChannelId));
                                if ((chat == null || chat.megagroup) && (messageReplyHeader = tL_updateNewChannelMessage.message.reply_to) != null && (messageReplyHeader.reply_to_top_id != 0 || messageReplyHeader.reply_to_msg_id != 0)) {
                                    if (longSparseArray == null) {
                                        longSparseArray = new LongSparseArray();
                                    }
                                    long dialogId = MessageObject.getDialogId(tL_updateNewChannelMessage.message);
                                    SparseArray sparseArray = (SparseArray) longSparseArray.get(dialogId);
                                    if (sparseArray == null) {
                                        sparseArray = new SparseArray();
                                        longSparseArray.put(dialogId, sparseArray);
                                    }
                                    TLRPC.MessageReplyHeader messageReplyHeader2 = tL_updateNewChannelMessage.message.reply_to;
                                    int i7 = messageReplyHeader2.reply_to_top_id;
                                    if (i7 == 0) {
                                        i7 = messageReplyHeader2.reply_to_msg_id;
                                    }
                                    TLRPC.MessageReplies tL_messageReplies = (TLRPC.MessageReplies) sparseArray.get(i7);
                                    if (tL_messageReplies == null) {
                                        tL_messageReplies = new TLRPC.TL_messageReplies();
                                        sparseArray.put(i7, tL_messageReplies);
                                    }
                                    TLRPC.Peer peer = tL_updateNewChannelMessage.message.from_id;
                                    if (peer != null) {
                                        tL_messageReplies.recent_repliers.add(0, peer);
                                    }
                                    tL_messageReplies.replies++;
                                }
                                message2 = tL_updateNewChannelMessage.message;
                                arrayList.add(message2);
                                Utilities.stageQueue.postRunnable(new Runnable() {
                                    @Override
                                    public final void run() {
                                        this.f$0.lambda$performSendMessageRequest$73(tL_updateNewChannelMessage);
                                    }
                                });
                                arrayList2.remove(i6);
                                i6--;
                                if (tL_updateNewChannelMessage.message.pinned) {
                                    Utilities.stageQueue.postRunnable(new Runnable() {
                                        @Override
                                        public final void run() {
                                            this.f$0.lambda$performSendMessageRequest$74(tL_updateNewChannelMessage, updateChannelId);
                                        }
                                    });
                                }
                                i3 = 1;
                            } else if (update instanceof TLRPC.TL_updateNewScheduledMessage) {
                                TLRPC.TL_updateNewScheduledMessage tL_updateNewScheduledMessage = (TLRPC.TL_updateNewScheduledMessage) update;
                                int i8 = 0;
                                while (true) {
                                    if (i8 >= arrayList.size()) {
                                        break;
                                    }
                                    if (((TLRPC.Message) arrayList.get(i8)).id == tL_updateNewScheduledMessage.message.id) {
                                        arrayList.remove(i8);
                                        break;
                                    }
                                    i8++;
                                }
                                message2 = tL_updateNewScheduledMessage.message;
                                arrayList.add(message2);
                                arrayList2.remove(i6);
                                i6--;
                                i3 = 1;
                                z7 = true;
                            } else if (update instanceof TLRPC.TL_updateQuickReplyMessage) {
                                QuickRepliesController.getInstance(this.currentAccount).processUpdate(update, messageObject.getQuickReplyName(), messageObject.getQuickReplyId());
                                message2 = ((TLRPC.TL_updateQuickReplyMessage) update).message;
                                arrayList.add(message2);
                                arrayList2.remove(i6);
                                i6--;
                                z7 = z13;
                                i3 = 1;
                            } else {
                                if (update instanceof TLRPC.TL_updateDeleteScheduledMessages) {
                                    TLRPC.TL_updateDeleteScheduledMessages tL_updateDeleteScheduledMessages = (TLRPC.TL_updateDeleteScheduledMessages) update;
                                    if (messageObject.getDialogId() == DialogObject.getPeerDialogId(tL_updateDeleteScheduledMessages.peer)) {
                                        Iterator<Integer> it = tL_updateDeleteScheduledMessages.messages.iterator();
                                        while (it.hasNext()) {
                                            int iIntValue = it.next().intValue();
                                            int i9 = 0;
                                            while (true) {
                                                if (i9 >= arrayList.size()) {
                                                    break;
                                                }
                                                if (((TLRPC.Message) arrayList.get(i9)).id == iIntValue) {
                                                    arrayList.remove(i9);
                                                    break;
                                                }
                                                i9++;
                                            }
                                        }
                                        i3 = 1;
                                        arrayList2.remove(i6);
                                        i6--;
                                    }
                                }
                                i3 = 1;
                                z7 = z13;
                            }
                            z7 = false;
                        }
                        i6 += i3;
                        z13 = z7;
                    }
                    if (longSparseArray != null) {
                        getMessagesStorage().putChannelViews(null, null, longSparseArray, true);
                        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateMessagesViews, null, null, longSparseArray, Boolean.TRUE);
                    }
                    if (message2 != null) {
                        MessageObject.getDialogId(message2);
                        boolean z14 = (!z12 || message2.date == 2147483646) ? z13 : false;
                        ImageLoader.saveMessageThumbs(message2);
                        if (!z14) {
                            Integer numValueOf2 = getMessagesController().dialogs_read_outbox_max.get(Long.valueOf(message2.dialog_id));
                            if (numValueOf2 == null) {
                                numValueOf2 = Integer.valueOf(getMessagesStorage().getDialogReadMax(message2.out, message2.dialog_id));
                                getMessagesController().dialogs_read_outbox_max.put(Long.valueOf(message2.dialog_id), numValueOf2);
                            }
                            message2.unread = numValueOf2.intValue() < message2.id;
                        }
                        TLRPC.Message message4 = messageObject.messageOwner;
                        message4.post_author = message2.post_author;
                        if ((message2.flags & 33554432) != 0) {
                            message4.ttl_period = message2.ttl_period;
                            message4.flags |= 33554432;
                        }
                        message4.entities = message2.entities;
                        int i10 = message2.quick_reply_shortcut_id;
                        message4.quick_reply_shortcut_id = i10;
                        if (i10 != 0) {
                            message4.flags |= 1073741824;
                        }
                        updateMediaPaths(messageObject, message2, message2.id, str, false);
                        mediaExistanceFlags = messageObject.getMediaExistanceFlags();
                        message.id = message2.id;
                        z5 = z14;
                        z6 = false;
                    } else {
                        if (BuildVars.LOGS_ENABLED) {
                            StringBuilder sb = new StringBuilder();
                            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                                sb.append(arrayList2.get(i11).getClass().getSimpleName());
                                sb.append(", ");
                            }
                            FileLog.d("can't find message in updates " + ((Object) sb));
                        }
                        z5 = z13;
                        mediaExistanceFlags = 0;
                        z6 = true;
                    }
                    Utilities.stageQueue.postRunnable(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$performSendMessageRequest$75(updates);
                        }
                    });
                    i2 = mediaExistanceFlags;
                    z4 = z6;
                    z3 = z5;
                } else {
                    z3 = z;
                    i2 = 0;
                    z4 = false;
                }
            }
            if (MessageObject.isLiveLocationMessage(message) && message.via_bot_id == 0 && TextUtils.isEmpty(message.via_bot_name)) {
                getLocationController().addSharingLocation(message);
            }
            if (z4) {
                z8 = z;
            } else {
                getStatsController().incrementSentItemsCount(ApplicationLoader.getCurrentNetworkType(), 1, 1);
                message.send_state = 0;
                message.errorNewPriceStars = 0L;
                message.errorAllowedPriceStars = 0L;
                boolean z15 = z;
                if (z15 != z3) {
                    final ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(Integer.valueOf(i));
                    final ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(new MessageObject(messageObject.currentAccount, messageObject.messageOwner, true, true));
                    final int i12 = i;
                    getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$performSendMessageRequest$77(arrayList, z, z3, message, arrayList3, arrayList4, i12);
                        }
                    });
                    z8 = z15;
                } else {
                    z9 = z4;
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageReceivedByServer, Integer.valueOf(i), Integer.valueOf(message.id), message, Long.valueOf(message.dialog_id), 0L, Integer.valueOf(i2), Boolean.valueOf(z));
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageReceivedByServer2, Integer.valueOf(i), Integer.valueOf(message.id), message, Long.valueOf(message.dialog_id), 0L, Integer.valueOf(i2), Boolean.valueOf(z));
                    final int i13 = i;
                    final int i14 = i2;
                    getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$performSendMessageRequest$79(z, message, i13, arrayList, i14);
                        }
                    });
                    z10 = z15;
                    tL_error2 = tL_error;
                    z2 = z9;
                    r10 = z10;
                }
            }
            z9 = z4;
            z10 = z8;
            tL_error2 = tL_error;
            z2 = z9;
            r10 = z10;
        } else {
            tL_error2 = tL_error;
            AlertsCreator.processError(this.currentAccount, tL_error2, null, tLObject2, new Object[0]);
            z2 = true;
            r10 = z11;
        }
        if (z2) {
            getMessagesStorage().markMessageAsSendError(message, r10);
            message.send_state = 2;
            if (tL_error2 != null && (str2 = tL_error2.text) != null && str2.startsWith("ALLOW_PAYMENT_REQUIRED_")) {
                StarsController.getInstance(this.currentAccount);
                message.errorAllowedPriceStars = StarsController.getAllowedPaidStars(tLObject2);
                message.errorNewPriceStars = Long.parseLong(tL_error2.text.substring(23));
                StarsController.getInstance(this.currentAccount).showPriceChangedToast(Arrays.asList(messageObject));
                getMessagesStorage().updateMessageCustomParams(MessageObject.getDialogId(message), message);
            }
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageSendError, Integer.valueOf(message.id));
            processSentMessage(message.id);
            removeFromSendingMessages(message.id, r10);
        }
    }

    public void lambda$performSendMessageRequest$71(TLRPC.TL_updateShortSentMessage tL_updateShortSentMessage) {
        getMessagesController().processNewDifferenceParams(-1, tL_updateShortSentMessage.pts, tL_updateShortSentMessage.date, tL_updateShortSentMessage.pts_count);
    }

    public void lambda$performSendMessageRequest$72(TLRPC.TL_updateNewMessage tL_updateNewMessage) {
        getMessagesController().processNewDifferenceParams(-1, tL_updateNewMessage.pts, -1, tL_updateNewMessage.pts_count);
    }

    public void lambda$performSendMessageRequest$73(TLRPC.TL_updateNewChannelMessage tL_updateNewChannelMessage) {
        getMessagesController().processNewChannelDifferenceParams(tL_updateNewChannelMessage.pts, tL_updateNewChannelMessage.pts_count, tL_updateNewChannelMessage.message.peer_id.channel_id);
    }

    public void lambda$performSendMessageRequest$74(TLRPC.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(tL_updateNewChannelMessage.message.id));
        getMessagesStorage().updatePinnedMessages(-j, arrayList, true, -1, 0, false, null);
    }

    public void lambda$performSendMessageRequest$75(TLRPC.Updates updates) {
        getMessagesController().processUpdates(updates, false);
    }

    public void lambda$performSendMessageRequest$77(ArrayList arrayList, final boolean z, final boolean z2, final TLRPC.Message message, final ArrayList arrayList2, final ArrayList arrayList3, final int i) {
        getMessagesStorage().putMessages(arrayList, true, false, false, 0, false, !z ? 1 : 0, 0L);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$performSendMessageRequest$76(z2, message, arrayList2, z, arrayList3, i);
            }
        });
    }

    public void lambda$performSendMessageRequest$76(boolean z, TLRPC.Message message, ArrayList arrayList, boolean z2, ArrayList arrayList2, int i) {
        getMessagesController().deleteMessages(arrayList, null, null, message.dialog_id, false, z2 ? 1 : 0, false, 0L, null, 0, !z2 && z, (!z || message == null) ? 0 : message.id);
        getMessagesController().updateInterfaceWithMessages(message.dialog_id, arrayList2, z ? 1 : 0);
        getMediaDataController().increasePeerRaiting(message.dialog_id);
        processSentMessage(i);
        removeFromSendingMessages(i, z2);
    }

    public void lambda$performSendMessageRequest$79(final boolean z, final TLRPC.Message message, final int i, ArrayList arrayList, final int i2) {
        int i3 = (message.quick_reply_shortcut_id == 0 && message.quick_reply_shortcut == null) ? z ? 1 : 0 : 5;
        getMessagesStorage().updateMessageStateAndId(message.random_id, MessageObject.getPeerId(message.peer_id), Integer.valueOf(i), message.id, 0, false, z ? 1 : 0, message.quick_reply_shortcut_id);
        getMessagesStorage().putMessages((ArrayList<TLRPC.Message>) arrayList, true, false, false, 0, i3, message.quick_reply_shortcut_id);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$performSendMessageRequest$78(message, i, i2, z);
            }
        });
    }

    public void lambda$performSendMessageRequest$78(TLRPC.Message message, int i, int i2, boolean z) {
        getMediaDataController().increasePeerRaiting(message.dialog_id);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageReceivedByServer, Integer.valueOf(i), Integer.valueOf(message.id), message, Long.valueOf(message.dialog_id), 0L, Integer.valueOf(i2), Boolean.valueOf(z));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageReceivedByServer2, Integer.valueOf(i), Integer.valueOf(message.id), message, Long.valueOf(message.dialog_id), 0L, Integer.valueOf(i2), Boolean.valueOf(z));
        processSentMessage(i);
        removeFromSendingMessages(i, z);
    }

    public void lambda$performSendMessageRequest$83(final TLRPC.Message message) {
        final int i = message.id;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$performSendMessageRequest$82(message, i);
            }
        });
    }

    public void lambda$performSendMessageRequest$82(TLRPC.Message message, int i) {
        message.send_state = 0;
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageReceivedByAck, Integer.valueOf(i));
    }

    private boolean removeCoverFromRequest(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
            TLRPC.InputMedia inputMedia = ((TLRPC.TL_messages_sendMedia) tLObject).media;
            if (inputMedia instanceof TLRPC.TL_inputMediaUploadedDocument) {
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = (TLRPC.TL_inputMediaUploadedDocument) inputMedia;
                tL_inputMediaUploadedDocument.video_cover = null;
                tL_inputMediaUploadedDocument.flags &= -65;
                return true;
            }
            if (inputMedia instanceof TLRPC.TL_inputMediaDocument) {
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument = (TLRPC.TL_inputMediaDocument) inputMedia;
                tL_inputMediaDocument.video_cover = null;
                tL_inputMediaDocument.flags &= -9;
                return true;
            }
            if (!(inputMedia instanceof TLRPC.TL_inputMediaDocumentExternal)) {
                return false;
            }
            TLRPC.TL_inputMediaDocumentExternal tL_inputMediaDocumentExternal = (TLRPC.TL_inputMediaDocumentExternal) inputMedia;
            tL_inputMediaDocumentExternal.video_cover = null;
            tL_inputMediaDocumentExternal.flags &= -5;
            return true;
        }
        if (!(tLObject instanceof TLRPC.TL_messages_editMessage)) {
            return false;
        }
        TLRPC.InputMedia inputMedia2 = ((TLRPC.TL_messages_editMessage) tLObject).media;
        if (inputMedia2 instanceof TLRPC.TL_inputMediaUploadedDocument) {
            TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument2 = (TLRPC.TL_inputMediaUploadedDocument) inputMedia2;
            tL_inputMediaUploadedDocument2.video_cover = null;
            tL_inputMediaUploadedDocument2.flags &= -65;
            return true;
        }
        if (inputMedia2 instanceof TLRPC.TL_inputMediaDocument) {
            TLRPC.TL_inputMediaDocument tL_inputMediaDocument2 = (TLRPC.TL_inputMediaDocument) inputMedia2;
            tL_inputMediaDocument2.video_cover = null;
            tL_inputMediaDocument2.flags &= -9;
            return true;
        }
        if (!(inputMedia2 instanceof TLRPC.TL_inputMediaDocumentExternal)) {
            return false;
        }
        TLRPC.TL_inputMediaDocumentExternal tL_inputMediaDocumentExternal2 = (TLRPC.TL_inputMediaDocumentExternal) inputMedia2;
        tL_inputMediaDocumentExternal2.video_cover = null;
        tL_inputMediaDocumentExternal2.flags &= -5;
        return true;
    }

    private void updateMediaPaths(MessageObject messageObject, TLRPC.Message message, int i, String str, boolean z) {
        updateMediaPaths(messageObject, message, i, Collections.singletonList(str), z, -1);
    }

    private void updateMediaPaths(org.telegram.messenger.MessageObject r26, org.telegram.tgnet.TLRPC.Message r27, int r28, java.util.List<java.lang.String> r29, boolean r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.updateMediaPaths(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$Message, int, java.util.List, boolean, int):void");
    }

    private void putToDelayedMessages(String str, DelayedMessage delayedMessage) {
        ArrayList<DelayedMessage> arrayList = this.delayedMessages.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.delayedMessages.put(str, arrayList);
        }
        arrayList.add(delayedMessage);
    }

    protected ArrayList<DelayedMessage> getDelayedMessages(String str) {
        return this.delayedMessages.get(str);
    }

    public long getNextRandomId() {
        long jNextLong = 0;
        while (jNextLong == 0) {
            jNextLong = Utilities.random.nextLong();
        }
        return jNextLong;
    }

    public void checkUnsentMessages() {
        getMessagesStorage().getUnsentMessages(1000);
    }

    protected void processUnsentMessages(final ArrayList<TLRPC.Message> arrayList, final ArrayList<TLRPC.Message> arrayList2, final ArrayList<TLRPC.User> arrayList3, final ArrayList<TLRPC.Chat> arrayList4, final ArrayList<TLRPC.EncryptedChat> arrayList5) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$processUnsentMessages$84(arrayList3, arrayList4, arrayList5, arrayList, arrayList2);
            }
        });
    }

    public void lambda$processUnsentMessages$84(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        HashMap<String, String> map;
        getMessagesController().putUsers(arrayList, true);
        getMessagesController().putChats(arrayList2, true);
        getMessagesController().putEncryptedChats(arrayList3, true);
        int size = arrayList4.size();
        for (int i = 0; i < size; i++) {
            MessageObject messageObject = new MessageObject(this.currentAccount, (TLRPC.Message) arrayList4.get(i), false, true);
            long groupId = messageObject.getGroupId();
            if (groupId != 0 && (map = messageObject.messageOwner.params) != null && !map.containsKey("final") && (i == size - 1 || ((TLRPC.Message) arrayList4.get(i + 1)).grouped_id != groupId)) {
                messageObject.messageOwner.params.put("final", "1");
            }
            retrySendMessage(messageObject, true, 0L);
        }
        if (arrayList5 != null) {
            for (int i2 = 0; i2 < arrayList5.size(); i2++) {
                MessageObject messageObject2 = new MessageObject(this.currentAccount, (TLRPC.Message) arrayList5.get(i2), false, true);
                messageObject2.scheduled = true;
                retrySendMessage(messageObject2, true, 0L);
            }
        }
    }

    public ImportingStickers getImportingStickers(String str) {
        return this.importingStickersMap.get(str);
    }

    public ImportingHistory getImportingHistory(long j) {
        return (ImportingHistory) this.importingHistoryMap.get(j);
    }

    public boolean isImportingStickers() {
        return this.importingStickersMap.size() != 0;
    }

    public boolean isImportingHistory() {
        return this.importingHistoryMap.size() != 0;
    }

    public void prepareImportHistory(final long j, final Uri uri, final ArrayList<Uri> arrayList, final MessagesStorage.LongCallback longCallback) {
        if (this.importingHistoryMap.get(j) != null) {
            longCallback.run(0L);
            return;
        }
        if (DialogObject.isChatDialog(j)) {
            long j2 = -j;
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j2));
            if (chat != null && !chat.megagroup) {
                getMessagesController().convertToMegaGroup(null, j2, null, new MessagesStorage.LongCallback() {
                    @Override
                    public final void run(long j3) {
                        this.f$0.lambda$prepareImportHistory$85(uri, arrayList, longCallback, j3);
                    }
                });
                return;
            }
        }
        new Thread(new Runnable() {
            @Override
            public final void run() throws IOException {
                this.f$0.lambda$prepareImportHistory$90(arrayList, j, uri, longCallback);
            }
        }).start();
    }

    public void lambda$prepareImportHistory$85(Uri uri, ArrayList arrayList, MessagesStorage.LongCallback longCallback, long j) {
        if (j != 0) {
            prepareImportHistory(-j, uri, arrayList, longCallback);
        } else {
            longCallback.run(0L);
        }
    }

    public void lambda$prepareImportHistory$90(java.util.ArrayList r18, final long r19, android.net.Uri r21, final org.telegram.messenger.MessagesStorage.LongCallback r22) throws java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.lambda$prepareImportHistory$90(java.util.ArrayList, long, android.net.Uri, org.telegram.messenger.MessagesStorage$LongCallback):void");
    }

    public static void lambda$prepareImportHistory$88(MessagesStorage.LongCallback longCallback) {
        Toast.makeText(ApplicationLoader.applicationContext, LocaleController.getString(R.string.ImportFileTooLarge), 0).show();
        longCallback.run(0L);
    }

    public void lambda$prepareImportHistory$89(HashMap map, long j, ImportingHistory importingHistory, MessagesStorage.LongCallback longCallback) {
        this.importingHistoryFiles.putAll(map);
        this.importingHistoryMap.put(j, importingHistory);
        getFileLoader().uploadFile(importingHistory.historyPath, false, true, 0L, 67108864, true);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(j));
        longCallback.run(j);
        try {
            ApplicationLoader.applicationContext.startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) ImportingService.class));
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public void prepareImportStickers(final String str, final String str2, final String str3, final ArrayList<ImportingSticker> arrayList, final MessagesStorage.StringCallback stringCallback) {
        if (this.importingStickersMap.get(str2) != null) {
            stringCallback.run(null);
        } else {
            new Thread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$prepareImportStickers$93(str, str2, str3, arrayList, stringCallback);
                }
            }).start();
        }
    }

    public void lambda$prepareImportStickers$93(java.lang.String r9, final java.lang.String r10, java.lang.String r11, java.util.ArrayList r12, final org.telegram.messenger.MessagesStorage.StringCallback r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.lambda$prepareImportStickers$93(java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, org.telegram.messenger.MessagesStorage$StringCallback):void");
    }

    public void lambda$prepareImportStickers$92(ImportingStickers importingStickers, HashMap map, String str, MessagesStorage.StringCallback stringCallback) {
        if (importingStickers.uploadMedia.get(0).item != null) {
            importingStickers.startImport();
        } else {
            this.importingStickersFiles.putAll(map);
            this.importingStickersMap.put(str, importingStickers);
            importingStickers.initImport();
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, str);
            stringCallback.run(str);
        }
        try {
            ApplicationLoader.applicationContext.startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) ImportingService.class));
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public TLRPC.TL_photo generatePhotoSizes(String str, Uri uri) {
        return generatePhotoSizes(null, str, uri, false);
    }

    public TLRPC.TL_photo generatePhotoSizes(TLRPC.TL_photo tL_photo, String str, Uri uri, boolean z) {
        TLRPC.PhotoSize photoSizeScaleAndSaveImage;
        Bitmap bitmapLoadBitmap = ImageLoader.loadBitmap(str, uri, AndroidUtilities.getPhotoSize(z), AndroidUtilities.getPhotoSize(z), true);
        if (bitmapLoadBitmap == null) {
            bitmapLoadBitmap = ImageLoader.loadBitmap(str, uri, 800.0f, 800.0f, true);
        }
        ArrayList<TLRPC.PhotoSize> arrayList = new ArrayList<>();
        TLRPC.PhotoSize photoSizeScaleAndSaveImage2 = ImageLoader.scaleAndSaveImage(bitmapLoadBitmap, 90.0f, 90.0f, 55, true);
        if (photoSizeScaleAndSaveImage2 != null) {
            arrayList.add(photoSizeScaleAndSaveImage2);
        }
        if (z) {
            photoSizeScaleAndSaveImage = ImageLoader.scaleAndSaveImage(null, bitmapLoadBitmap, Bitmap.CompressFormat.JPEG, true, AndroidUtilities.getPhotoSize(z), AndroidUtilities.getPhotoSize(z), 99, false, 101, 101, false);
        } else {
            photoSizeScaleAndSaveImage = ImageLoader.scaleAndSaveImage(bitmapLoadBitmap, AndroidUtilities.getPhotoSize(z), AndroidUtilities.getPhotoSize(z), true, 80, false, 101, 101);
        }
        if (photoSizeScaleAndSaveImage != null) {
            arrayList.add(photoSizeScaleAndSaveImage);
        }
        if (bitmapLoadBitmap != null) {
            bitmapLoadBitmap.recycle();
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        getUserConfig().saveConfig(false);
        TLRPC.TL_photo tL_photo2 = tL_photo == null ? new TLRPC.TL_photo() : tL_photo;
        tL_photo2.date = getConnectionsManager().getCurrentTime();
        tL_photo2.sizes = arrayList;
        tL_photo2.file_reference = new byte[0];
        return tL_photo2;
    }

    private static int prepareSendingDocumentInternal(final org.telegram.messenger.AccountInstance r36, java.lang.String r37, java.lang.String r38, android.net.Uri r39, java.lang.String r40, final long r41, final org.telegram.messenger.MessageObject r43, final org.telegram.messenger.MessageObject r44, final org.telegram.tgnet.tl.TL_stories.StoryItem r45, final org.telegram.ui.ChatActivity.ReplyQuote r46, final java.util.ArrayList<org.telegram.tgnet.TLRPC.MessageEntity> r47, final org.telegram.messenger.MessageObject r48, long[] r49, boolean r50, java.lang.CharSequence r51, final boolean r52, final int r53, final int r54, java.lang.Integer[] r55, boolean r56, final java.lang.String r57, final int r58, final long r59, final boolean r61, final long r62, final long r64, final org.telegram.messenger.MessageSuggestionParams r66) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.prepareSendingDocumentInternal(org.telegram.messenger.AccountInstance, java.lang.String, java.lang.String, android.net.Uri, java.lang.String, long, org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject, org.telegram.tgnet.tl.TL_stories$StoryItem, org.telegram.ui.ChatActivity$ReplyQuote, java.util.ArrayList, org.telegram.messenger.MessageObject, long[], boolean, java.lang.CharSequence, boolean, int, int, java.lang.Integer[], boolean, java.lang.String, int, long, boolean, long, long, org.telegram.messenger.MessageSuggestionParams):int");
    }

    public static void lambda$prepareSendingDocumentInternal$94(MessageObject messageObject, AccountInstance accountInstance, TLRPC.TL_document tL_document, String str, HashMap map, String str2, long j, MessageObject messageObject2, MessageObject messageObject3, String str3, ArrayList arrayList, boolean z, int i, int i2, TL_stories.StoryItem storyItem, ChatActivity.ReplyQuote replyQuote, String str4, int i3, long j2, boolean z2, long j3, long j4, MessageSuggestionParams messageSuggestionParams) {
        if (messageObject != null) {
            accountInstance.getSendMessagesHelper().editMessage(messageObject, null, null, tL_document, str, null, map, false, false, str2);
            return;
        }
        SendMessageParams sendMessageParamsOf = SendMessageParams.of(tL_document, null, str, j, messageObject2, messageObject3, str3, arrayList, null, map, z, i, i2, 0, str2, null, false);
        sendMessageParamsOf.replyToStoryItem = storyItem;
        sendMessageParamsOf.replyQuote = replyQuote;
        sendMessageParamsOf.quick_reply_shortcut = str4;
        sendMessageParamsOf.quick_reply_shortcut_id = i3;
        sendMessageParamsOf.effect_id = j2;
        sendMessageParamsOf.invert_media = z2;
        sendMessageParamsOf.payStars = j3;
        sendMessageParamsOf.monoForumPeer = j4;
        sendMessageParamsOf.suggestionParams = messageSuggestionParams;
        accountInstance.getSendMessagesHelper().sendMessage(sendMessageParamsOf);
    }

    private static boolean checkFileSize(AccountInstance accountInstance, Uri uri) throws FileNotFoundException {
        long j = 0;
        try {
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = ApplicationLoader.applicationContext.getContentResolver().openAssetFileDescriptor(uri, "r", null);
            if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                assetFileDescriptorOpenAssetFileDescriptor.getLength();
            }
            Cursor cursorQuery = ApplicationLoader.applicationContext.getContentResolver().query(uri, new String[]{"_size"}, null, null, null);
            int columnIndex = cursorQuery.getColumnIndex("_size");
            cursorQuery.moveToFirst();
            j = cursorQuery.getLong(columnIndex);
            cursorQuery.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        return !FileLoader.checkUploadFileSize(accountInstance.getCurrentAccount(), j);
    }

    public static void prepareSendingDocument(AccountInstance accountInstance, String str, String str2, Uri uri, String str3, String str4, long j, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, ChatActivity.ReplyQuote replyQuote, MessageObject messageObject3, boolean z, int i, InputContentInfoCompat inputContentInfoCompat, String str5, int i2, boolean z2) {
        ArrayList arrayList;
        if ((str == null || str2 == null) && uri == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (uri != null) {
            arrayList = new ArrayList();
            arrayList.add(uri);
        } else {
            arrayList = null;
        }
        if (str != null) {
            arrayList2.add(str);
            arrayList3.add(str2);
        }
        prepareSendingDocuments(accountInstance, arrayList2, arrayList3, arrayList, str3, str4, j, messageObject, messageObject2, storyItem, replyQuote, messageObject3, z, i, inputContentInfoCompat, str5, i2, 0L, z2, 0L);
    }

    public static void prepareSendingAudioDocuments(final AccountInstance accountInstance, final ArrayList<MessageObject> arrayList, final CharSequence charSequence, final long j, final MessageObject messageObject, final MessageObject messageObject2, final TL_stories.StoryItem storyItem, final boolean z, final int i, final int i2, final MessageObject messageObject3, final String str, final int i3, final long j2, final boolean z2, final long j3) {
        new Thread(new Runnable() {
            @Override
            public final void run() throws InterruptedException {
                SendMessagesHelper.lambda$prepareSendingAudioDocuments$96(arrayList, j, accountInstance, charSequence, messageObject3, messageObject, messageObject2, z, i, i2, storyItem, str, i3, j2, z2, j3);
            }
        }).start();
    }

    public static void lambda$prepareSendingAudioDocuments$96(java.util.ArrayList r34, final long r35, final org.telegram.messenger.AccountInstance r37, java.lang.CharSequence r38, final org.telegram.messenger.MessageObject r39, final org.telegram.messenger.MessageObject r40, final org.telegram.messenger.MessageObject r41, final boolean r42, final int r43, final int r44, final org.telegram.tgnet.tl.TL_stories.StoryItem r45, final java.lang.String r46, final int r47, final long r48, final boolean r50, final long r51) throws java.lang.InterruptedException {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.lambda$prepareSendingAudioDocuments$96(java.util.ArrayList, long, org.telegram.messenger.AccountInstance, java.lang.CharSequence, org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject, boolean, int, int, org.telegram.tgnet.tl.TL_stories$StoryItem, java.lang.String, int, long, boolean, long):void");
    }

    public static void lambda$prepareSendingAudioDocuments$95(MessageObject messageObject, AccountInstance accountInstance, TLRPC.TL_document tL_document, MessageObject messageObject2, HashMap map, String str, long j, MessageObject messageObject3, MessageObject messageObject4, String str2, ArrayList arrayList, boolean z, int i, int i2, TL_stories.StoryItem storyItem, String str3, int i3, long j2, boolean z2, long j3) {
        if (messageObject != null) {
            accountInstance.getSendMessagesHelper().editMessage(messageObject, null, null, tL_document, messageObject2.messageOwner.attachPath, null, map, false, false, str);
            return;
        }
        SendMessageParams sendMessageParamsOf = SendMessageParams.of(tL_document, null, messageObject2.messageOwner.attachPath, j, messageObject3, messageObject4, str2, arrayList, null, map, z, i, i2, 0, str, null, false, false);
        sendMessageParamsOf.replyToStoryItem = storyItem;
        sendMessageParamsOf.quick_reply_shortcut = str3;
        sendMessageParamsOf.quick_reply_shortcut_id = i3;
        sendMessageParamsOf.effect_id = j2;
        sendMessageParamsOf.invert_media = z2;
        sendMessageParamsOf.payStars = j3;
        accountInstance.getSendMessagesHelper().sendMessage(sendMessageParamsOf);
    }

    private static void finishGroup(final AccountInstance accountInstance, final long j, final int i) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SendMessagesHelper.lambda$finishGroup$97(accountInstance, j, i);
            }
        });
    }

    public static void lambda$finishGroup$97(AccountInstance accountInstance, long j, int i) {
        SendMessagesHelper sendMessagesHelper = accountInstance.getSendMessagesHelper();
        ArrayList<DelayedMessage> arrayList = sendMessagesHelper.delayedMessages.get("group_" + j);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        DelayedMessage delayedMessage = arrayList.get(0);
        ArrayList<MessageObject> arrayList2 = delayedMessage.messageObjects;
        MessageObject messageObject = arrayList2.get(arrayList2.size() - 1);
        delayedMessage.finalGroupMessage = messageObject.getId();
        messageObject.messageOwner.params.put("final", "1");
        TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
        tL_messages_messages.messages.add(messageObject.messageOwner);
        if (!delayedMessage.paidMedia) {
            accountInstance.getMessagesStorage().putMessages((TLRPC.messages_Messages) tL_messages_messages, delayedMessage.peer, -2, 0, false, i != 0 ? 1 : 0, 0L);
        }
        sendMessagesHelper.sendReadyToSendGroup(delayedMessage, true, true);
    }

    public static void prepareSendingDocuments(AccountInstance accountInstance, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<Uri> arrayList3, String str, String str2, long j, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, ChatActivity.ReplyQuote replyQuote, MessageObject messageObject3, boolean z, int i, InputContentInfoCompat inputContentInfoCompat, String str3, int i2, long j2, boolean z2, long j3) {
        prepareSendingDocuments(accountInstance, arrayList, arrayList2, arrayList3, str, null, str2, j, messageObject, messageObject2, storyItem, replyQuote, messageObject3, z, i, 0, inputContentInfoCompat, str3, i2, j2, z2, j3, 0L, null);
    }

    public static void prepareSendingDocuments(final AccountInstance accountInstance, final ArrayList<String> arrayList, final ArrayList<String> arrayList2, final ArrayList<Uri> arrayList3, final String str, final ArrayList<TLRPC.MessageEntity> arrayList4, final String str2, final long j, final MessageObject messageObject, final MessageObject messageObject2, final TL_stories.StoryItem storyItem, final ChatActivity.ReplyQuote replyQuote, final MessageObject messageObject3, final boolean z, final int i, final int i2, final InputContentInfoCompat inputContentInfoCompat, final String str3, final int i3, final long j2, final boolean z2, final long j3, final long j4, final MessageSuggestionParams messageSuggestionParams) {
        if (arrayList == null && arrayList2 == null && arrayList3 == null) {
            return;
        }
        if (arrayList == null || arrayList2 == null || arrayList.size() == arrayList2.size()) {
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() throws Throwable {
                    SendMessagesHelper.lambda$prepareSendingDocuments$98(j, arrayList, str, accountInstance, i, arrayList2, str2, messageObject, messageObject2, storyItem, replyQuote, arrayList4, messageObject3, z, i2, inputContentInfoCompat, str3, i3, j2, z2, j3, j4, messageSuggestionParams, arrayList3);
                }
            });
        }
    }

    public static void lambda$prepareSendingDocuments$98(long j, ArrayList arrayList, String str, AccountInstance accountInstance, int i, ArrayList arrayList2, String str2, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, ChatActivity.ReplyQuote replyQuote, ArrayList arrayList3, MessageObject messageObject3, boolean z, int i2, InputContentInfoCompat inputContentInfoCompat, String str3, int i3, long j2, boolean z2, long j3, long j4, MessageSuggestionParams messageSuggestionParams, ArrayList arrayList4) throws Throwable {
        Integer[] numArr;
        long[] jArr;
        ArrayList arrayList5;
        int iPrepareSendingDocumentInternal;
        boolean z3;
        AccountInstance accountInstance2;
        AccountInstance accountInstance3 = accountInstance;
        int i4 = i;
        int i5 = 1;
        long[] jArr2 = new long[1];
        Integer[] numArr2 = new Integer[1];
        boolean zIsEncryptedDialog = DialogObject.isEncryptedDialog(j);
        int i6 = 10;
        if (arrayList != null) {
            int size = arrayList.size();
            iPrepareSendingDocumentInternal = 0;
            int i7 = 0;
            boolean z4 = true;
            int i8 = 0;
            while (i8 < size) {
                String str4 = i8 == 0 ? str : null;
                if (!zIsEncryptedDialog && size > i5 && i7 % 10 == 0) {
                    long j5 = jArr2[0];
                    if (j5 != 0) {
                        finishGroup(accountInstance3, j5, i4);
                    }
                    jArr2[0] = Utilities.random.nextLong();
                    i7 = 0;
                }
                int i9 = i7 + 1;
                long j6 = jArr2[0];
                int i10 = i8;
                int i11 = size;
                Integer[] numArr3 = numArr2;
                long[] jArr3 = jArr2;
                iPrepareSendingDocumentInternal = prepareSendingDocumentInternal(accountInstance, (String) arrayList.get(i8), (String) arrayList2.get(i8), null, str2, j, messageObject, messageObject2, storyItem, replyQuote, i8 == 0 ? arrayList3 : null, messageObject3, jArr3, i9 == i6 || i8 == size + (-1), str4, z, i, i2, numArr3, inputContentInfoCompat == null, str3, i3, z4 ? j2 : 0L, z2, j3, j4, messageSuggestionParams);
                long j7 = jArr3[0];
                i7 = (j6 != j7 || j7 == -1) ? 1 : i9;
                i8 = i10 + 1;
                accountInstance3 = accountInstance;
                i4 = i;
                size = i11;
                numArr2 = numArr3;
                jArr2 = jArr3;
                z4 = false;
                i6 = 10;
                i5 = 1;
            }
            numArr = numArr2;
            jArr = jArr2;
            arrayList5 = arrayList4;
            z3 = z4;
        } else {
            numArr = numArr2;
            jArr = jArr2;
            arrayList5 = arrayList4;
            iPrepareSendingDocumentInternal = 0;
            z3 = true;
        }
        if (arrayList5 != null) {
            jArr[0] = 0;
            int size2 = arrayList4.size();
            int i12 = 0;
            int i13 = 0;
            while (i13 < arrayList4.size()) {
                String str5 = (i13 == 0 && (arrayList == null || arrayList.size() == 0)) ? str : null;
                ArrayList arrayList6 = (i13 == 0 && (arrayList == null || arrayList.size() == 0)) ? arrayList3 : null;
                if (zIsEncryptedDialog || size2 <= 1 || i12 % 10 != 0) {
                    accountInstance2 = accountInstance;
                } else {
                    long j8 = jArr[0];
                    accountInstance2 = accountInstance;
                    if (j8 != 0) {
                        finishGroup(accountInstance2, j8, i);
                    }
                    jArr[0] = Utilities.random.nextLong();
                    i12 = 0;
                }
                int i14 = i12 + 1;
                long j9 = jArr[0];
                int i15 = i13;
                int i16 = size2;
                iPrepareSendingDocumentInternal = prepareSendingDocumentInternal(accountInstance, null, null, (Uri) arrayList5.get(i13), str2, j, messageObject, messageObject2, storyItem, replyQuote, arrayList6, messageObject3, jArr, i14 == 10 || i13 == size2 + (-1), str5, z, i, i2, numArr, inputContentInfoCompat == null, str3, i3, z3 ? j2 : 0L, z2, j3, j4, messageSuggestionParams);
                long j10 = jArr[0];
                i12 = (j9 != j10 || j10 == -1) ? 1 : i14;
                i13 = i15 + 1;
                arrayList5 = arrayList4;
                size2 = i16;
                z3 = false;
            }
        }
        if (inputContentInfoCompat != null) {
            inputContentInfoCompat.releasePermission();
        }
        handleError(iPrepareSendingDocumentInternal, accountInstance);
    }

    private static void handleError(final int i, final AccountInstance accountInstance) {
        if (i != 0) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    SendMessagesHelper.lambda$handleError$99(i, accountInstance);
                }
            });
        }
    }

    public static void lambda$handleError$99(int i, AccountInstance accountInstance) {
        try {
            if (i == 1) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.UnsupportedAttachment));
            } else if (i != 2) {
            } else {
                NotificationCenter.getInstance(accountInstance.getCurrentAccount()).lambda$postNotificationNameOnUIThread$1(NotificationCenter.currentUserShowLimitReachedDialog, 6);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void prepareSendingPhoto(AccountInstance accountInstance, String str, Uri uri, long j, MessageObject messageObject, MessageObject messageObject2, ChatActivity.ReplyQuote replyQuote, CharSequence charSequence, ArrayList<TLRPC.MessageEntity> arrayList, ArrayList<TLRPC.InputDocument> arrayList2, InputContentInfoCompat inputContentInfoCompat, int i, MessageObject messageObject3, boolean z, int i2, int i3, String str2, int i4) {
        prepareSendingPhoto(accountInstance, str, null, uri, j, messageObject, messageObject2, null, null, arrayList, arrayList2, inputContentInfoCompat, i, messageObject3, null, z, i2, 0, i3, false, charSequence, str2, i4, 0L, 0L, 0L, null);
    }

    public static void prepareSendingPhoto(AccountInstance accountInstance, String str, String str2, Uri uri, long j, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, ChatActivity.ReplyQuote replyQuote, ArrayList<TLRPC.MessageEntity> arrayList, ArrayList<TLRPC.InputDocument> arrayList2, InputContentInfoCompat inputContentInfoCompat, int i, MessageObject messageObject3, VideoEditedInfo videoEditedInfo, boolean z, int i2, int i3, boolean z2, CharSequence charSequence, String str3, int i4, long j2, long j3) {
        prepareSendingPhoto(accountInstance, str, str2, uri, j, messageObject, messageObject2, storyItem, replyQuote, arrayList, arrayList2, inputContentInfoCompat, i, messageObject3, videoEditedInfo, z, i2, 0, i3, z2, charSequence, str3, i4, j2, j3, 0L, null);
    }

    public static void prepareSendingPhoto(AccountInstance accountInstance, String str, String str2, Uri uri, long j, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, ChatActivity.ReplyQuote replyQuote, ArrayList<TLRPC.MessageEntity> arrayList, ArrayList<TLRPC.InputDocument> arrayList2, InputContentInfoCompat inputContentInfoCompat, int i, MessageObject messageObject3, VideoEditedInfo videoEditedInfo, boolean z, int i2, int i3, int i4, boolean z2, CharSequence charSequence, String str3, int i5, long j2, long j3, long j4, MessageSuggestionParams messageSuggestionParams) {
        SendingMediaInfo sendingMediaInfo = new SendingMediaInfo();
        sendingMediaInfo.path = str;
        sendingMediaInfo.thumbPath = str2;
        sendingMediaInfo.uri = uri;
        if (charSequence != null) {
            sendingMediaInfo.caption = charSequence.toString();
        }
        sendingMediaInfo.entities = arrayList;
        sendingMediaInfo.ttl = i;
        if (arrayList2 != null) {
            sendingMediaInfo.masks = new ArrayList<>(arrayList2);
        }
        sendingMediaInfo.videoEditedInfo = videoEditedInfo;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(sendingMediaInfo);
        prepareSendingMedia(accountInstance, arrayList3, j, messageObject, messageObject2, null, replyQuote, z2, false, messageObject3, z, i2, 0, i4, false, inputContentInfoCompat, str3, i5, j2, false, j3, j4, messageSuggestionParams);
    }

    public static void prepareSendingBotContextResult(final BaseFragment baseFragment, final AccountInstance accountInstance, final TLRPC.BotInlineResult botInlineResult, final HashMap<String, String> map, final long j, final MessageObject messageObject, final MessageObject messageObject2, final TL_stories.StoryItem storyItem, final ChatActivity.ReplyQuote replyQuote, final boolean z, final int i, final int i2, final String str, final int i3, final long j2) {
        SendMessageParams sendMessageParamsOf;
        TLRPC.TL_webPagePending tL_webPagePending;
        if (botInlineResult == null) {
            return;
        }
        TLRPC.BotInlineMessage botInlineMessage = botInlineResult.send_message;
        if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaAuto) {
            new Thread(new Runnable() {
                @Override
                public final void run() {
                    SendMessagesHelper.lambda$prepareSendingBotContextResult$103(j, botInlineResult, accountInstance, map, baseFragment, messageObject, messageObject2, z, i, i2, str, i3, storyItem, replyQuote, j2);
                }
            }).run();
            return;
        }
        if (botInlineMessage instanceof TLRPC.TL_botInlineMessageText) {
            if (DialogObject.isEncryptedDialog(j)) {
                for (int i4 = 0; i4 < botInlineResult.send_message.entities.size(); i4++) {
                    TLRPC.MessageEntity messageEntity = botInlineResult.send_message.entities.get(i4);
                    if (messageEntity instanceof TLRPC.TL_messageEntityUrl) {
                        tL_webPagePending = new TLRPC.TL_webPagePending();
                        String str2 = botInlineResult.send_message.message;
                        int i5 = messageEntity.offset;
                        tL_webPagePending.url = str2.substring(i5, messageEntity.length + i5);
                        break;
                    }
                }
                tL_webPagePending = null;
            } else {
                tL_webPagePending = null;
            }
            TLRPC.TL_webPagePending tL_webPagePending2 = tL_webPagePending;
            TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult.send_message;
            SendMessageParams sendMessageParamsOf2 = SendMessageParams.of(botInlineMessage2.message, j, messageObject, messageObject2, tL_webPagePending2, !botInlineMessage2.no_webpage, botInlineMessage2.entities, botInlineMessage2.reply_markup, map, z, i, i2, null, false);
            sendMessageParamsOf2.quick_reply_shortcut = str;
            sendMessageParamsOf2.quick_reply_shortcut_id = i3;
            sendMessageParamsOf2.replyQuote = replyQuote;
            sendMessageParamsOf2.payStars = j2;
            accountInstance.getSendMessagesHelper().sendMessage(sendMessageParamsOf2);
            return;
        }
        if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue) {
            TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
            TLRPC.BotInlineMessage botInlineMessage3 = botInlineResult.send_message;
            tL_messageMediaVenue.geo = botInlineMessage3.geo;
            tL_messageMediaVenue.address = botInlineMessage3.address;
            tL_messageMediaVenue.title = botInlineMessage3.title;
            tL_messageMediaVenue.provider = botInlineMessage3.provider;
            String str3 = botInlineMessage3.venue_type;
            tL_messageMediaVenue.venue_id = str3;
            tL_messageMediaVenue.venue_type = str3;
            if (str3 == null) {
                tL_messageMediaVenue.venue_type = "";
            }
            SendMessageParams sendMessageParamsOf3 = SendMessageParams.of(tL_messageMediaVenue, j, messageObject, messageObject2, botInlineMessage3.reply_markup, map, z, i, i2);
            sendMessageParamsOf3.quick_reply_shortcut = str;
            sendMessageParamsOf3.quick_reply_shortcut_id = i3;
            sendMessageParamsOf3.replyQuote = replyQuote;
            sendMessageParamsOf3.payStars = j2;
            accountInstance.getSendMessagesHelper().sendMessage(sendMessageParamsOf3);
            return;
        }
        if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaGeo) {
            if (botInlineMessage.period != 0 || botInlineMessage.proximity_notification_radius != 0) {
                TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
                TLRPC.BotInlineMessage botInlineMessage4 = botInlineResult.send_message;
                int i6 = botInlineMessage4.period;
                if (i6 == 0) {
                    i6 = 900;
                }
                tL_messageMediaGeoLive.period = i6;
                tL_messageMediaGeoLive.geo = botInlineMessage4.geo;
                tL_messageMediaGeoLive.heading = botInlineMessage4.heading;
                tL_messageMediaGeoLive.proximity_notification_radius = botInlineMessage4.proximity_notification_radius;
                sendMessageParamsOf = SendMessageParams.of(tL_messageMediaGeoLive, j, messageObject, messageObject2, botInlineMessage4.reply_markup, map, z, i, i2);
            } else {
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.BotInlineMessage botInlineMessage5 = botInlineResult.send_message;
                tL_messageMediaGeo.geo = botInlineMessage5.geo;
                tL_messageMediaGeo.heading = botInlineMessage5.heading;
                sendMessageParamsOf = SendMessageParams.of(tL_messageMediaGeo, j, messageObject, messageObject2, botInlineMessage5.reply_markup, map, z, i, i2);
            }
            sendMessageParamsOf.quick_reply_shortcut = str;
            sendMessageParamsOf.quick_reply_shortcut_id = i3;
            sendMessageParamsOf.replyQuote = replyQuote;
            sendMessageParamsOf.payStars = j2;
            accountInstance.getSendMessagesHelper().sendMessage(sendMessageParamsOf);
            return;
        }
        if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaContact) {
            TLRPC.TL_user tL_user = new TLRPC.TL_user();
            TLRPC.BotInlineMessage botInlineMessage6 = botInlineResult.send_message;
            tL_user.phone = botInlineMessage6.phone_number;
            tL_user.first_name = botInlineMessage6.first_name;
            tL_user.last_name = botInlineMessage6.last_name;
            TLRPC.RestrictionReason restrictionReason = new TLRPC.RestrictionReason();
            restrictionReason.text = botInlineResult.send_message.vcard;
            restrictionReason.platform = "";
            restrictionReason.reason = "";
            tL_user.restriction_reason.add(restrictionReason);
            SendMessageParams sendMessageParamsOf4 = SendMessageParams.of(tL_user, j, messageObject, messageObject2, botInlineResult.send_message.reply_markup, map, z, i, i2);
            sendMessageParamsOf4.quick_reply_shortcut = str;
            sendMessageParamsOf4.quick_reply_shortcut_id = i3;
            sendMessageParamsOf4.replyQuote = replyQuote;
            sendMessageParamsOf4.payStars = j2;
            accountInstance.getSendMessagesHelper().sendMessage(sendMessageParamsOf4);
            return;
        }
        if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaInvoice) {
            if (DialogObject.isEncryptedDialog(j)) {
                return;
            }
            TLRPC.TL_botInlineMessageMediaInvoice tL_botInlineMessageMediaInvoice = (TLRPC.TL_botInlineMessageMediaInvoice) botInlineResult.send_message;
            TLRPC.TL_messageMediaInvoice tL_messageMediaInvoice = new TLRPC.TL_messageMediaInvoice();
            tL_messageMediaInvoice.shipping_address_requested = tL_botInlineMessageMediaInvoice.shipping_address_requested;
            tL_messageMediaInvoice.test = tL_botInlineMessageMediaInvoice.test;
            tL_messageMediaInvoice.title = tL_botInlineMessageMediaInvoice.title;
            tL_messageMediaInvoice.description = tL_botInlineMessageMediaInvoice.description;
            TLRPC.WebDocument webDocument = tL_botInlineMessageMediaInvoice.photo;
            if (webDocument != null) {
                tL_messageMediaInvoice.webPhoto = webDocument;
                tL_messageMediaInvoice.flags |= 1;
            }
            tL_messageMediaInvoice.currency = tL_botInlineMessageMediaInvoice.currency;
            tL_messageMediaInvoice.total_amount = tL_botInlineMessageMediaInvoice.total_amount;
            tL_messageMediaInvoice.start_param = "";
            SendMessageParams sendMessageParamsOf5 = SendMessageParams.of(tL_messageMediaInvoice, j, messageObject, messageObject2, botInlineResult.send_message.reply_markup, map, z, i, i2);
            sendMessageParamsOf5.quick_reply_shortcut = str;
            sendMessageParamsOf5.quick_reply_shortcut_id = i3;
            sendMessageParamsOf5.replyQuote = replyQuote;
            sendMessageParamsOf5.payStars = j2;
            accountInstance.getSendMessagesHelper().sendMessage(sendMessageParamsOf5);
            return;
        }
        if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaWebPage) {
            TLRPC.TL_webPagePending tL_webPagePending3 = new TLRPC.TL_webPagePending();
            tL_webPagePending3.url = ((TLRPC.TL_botInlineMessageMediaWebPage) botInlineMessage).url;
            TLRPC.BotInlineMessage botInlineMessage7 = botInlineResult.send_message;
            SendMessageParams sendMessageParamsOf6 = SendMessageParams.of(botInlineMessage7.message, j, messageObject, messageObject2, tL_webPagePending3, !botInlineMessage7.no_webpage, botInlineMessage7.entities, botInlineMessage7.reply_markup, map, z, i, i2, null, false);
            sendMessageParamsOf6.quick_reply_shortcut = str;
            sendMessageParamsOf6.quick_reply_shortcut_id = i3;
            sendMessageParamsOf6.replyQuote = replyQuote;
            sendMessageParamsOf6.payStars = j2;
            accountInstance.getSendMessagesHelper().sendMessage(sendMessageParamsOf6);
        }
    }

    public static void lambda$prepareSendingBotContextResult$103(final long r26, final org.telegram.tgnet.TLRPC.BotInlineResult r28, final org.telegram.messenger.AccountInstance r29, final java.util.HashMap r30, final org.telegram.ui.ActionBar.BaseFragment r31, final org.telegram.messenger.MessageObject r32, final org.telegram.messenger.MessageObject r33, final boolean r34, final int r35, final int r36, final java.lang.String r37, final int r38, final org.telegram.tgnet.tl.TL_stories.StoryItem r39, final org.telegram.ui.ChatActivity.ReplyQuote r40, final long r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.lambda$prepareSendingBotContextResult$103(long, org.telegram.tgnet.TLRPC$BotInlineResult, org.telegram.messenger.AccountInstance, java.util.HashMap, org.telegram.ui.ActionBar.BaseFragment, org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject, boolean, int, int, java.lang.String, int, org.telegram.tgnet.tl.TL_stories$StoryItem, org.telegram.ui.ChatActivity$ReplyQuote, long):void");
    }

    public static void lambda$prepareSendingBotContextResult$102(TLRPC.TL_document tL_document, Bitmap[] bitmapArr, String[] strArr, String str, long j, MessageObject messageObject, MessageObject messageObject2, TLRPC.BotInlineResult botInlineResult, HashMap map, boolean z, int i, int i2, TLRPC.TL_photo tL_photo, TLRPC.TL_game tL_game, String str2, int i3, TL_stories.StoryItem storyItem, ChatActivity.ReplyQuote replyQuote, long j2, AccountInstance accountInstance) {
        SendMessageParams sendMessageParamsOf;
        if (tL_document != null) {
            if (bitmapArr[0] != null && strArr[0] != null) {
                ImageLoader.getInstance().putImageToCache(new BitmapDrawable(bitmapArr[0]), strArr[0], false);
            }
            TLRPC.BotInlineMessage botInlineMessage = botInlineResult.send_message;
            sendMessageParamsOf = SendMessageParams.of(tL_document, null, str, j, messageObject, messageObject2, botInlineMessage.message, botInlineMessage.entities, botInlineMessage.reply_markup, map, z, i, i2, 0, botInlineResult, null, false);
        } else {
            sendMessageParamsOf = null;
            if (tL_photo != null) {
                TLRPC.WebDocument webDocument = botInlineResult.content;
                String str3 = webDocument != null ? webDocument.url : null;
                TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult.send_message;
                sendMessageParamsOf = SendMessageParams.of(tL_photo, str3, j, messageObject, messageObject2, botInlineMessage2.message, botInlineMessage2.entities, botInlineMessage2.reply_markup, map, z, i, i2, 0, botInlineResult, false);
            } else if (tL_game != null) {
                sendMessageParamsOf = SendMessageParams.of(tL_game, j, messageObject, messageObject2, botInlineResult.send_message.reply_markup, (HashMap<String, String>) map, z, i, i2);
            }
        }
        if (sendMessageParamsOf != null) {
            sendMessageParamsOf.quick_reply_shortcut = str2;
            sendMessageParamsOf.quick_reply_shortcut_id = i3;
            sendMessageParamsOf.replyToStoryItem = storyItem;
            sendMessageParamsOf.replyQuote = replyQuote;
            sendMessageParamsOf.payStars = j2;
            accountInstance.getSendMessagesHelper().sendMessage(sendMessageParamsOf);
        }
    }

    public static String getTrimmedString(String str) {
        String strTrim = str.trim();
        if (strTrim.length() == 0) {
            return strTrim;
        }
        while (str.startsWith("\n")) {
            str = str.substring(1);
        }
        while (str.endsWith("\n")) {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }

    public static void prepareSendingText(AccountInstance accountInstance, String str, long j, boolean z, int i, int i2, long j2) {
        prepareSendingText(accountInstance, str, j, 0L, z, i, i2, j2);
    }

    public static void lambda$prepareSendingText$105(final String str, final long j, final AccountInstance accountInstance, final long j2, final boolean z, final int i, final int i2, final long j3) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SendMessagesHelper.lambda$prepareSendingText$104(str, j, accountInstance, j2, z, i, i2, j3);
            }
        });
    }

    public static void lambda$prepareSendingText$106(final String str, final long j, final AccountInstance accountInstance, final long j2, final boolean z, final int i, final int i2, final long j3) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                SendMessagesHelper.lambda$prepareSendingText$105(str, j, accountInstance, j2, z, i, i2, j3);
            }
        });
    }

    public static void prepareSendingText(final AccountInstance accountInstance, final String str, final long j, final long j2, final boolean z, final int i, final int i2, final long j3) {
        accountInstance.getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                SendMessagesHelper.lambda$prepareSendingText$106(str, j2, accountInstance, j, z, i, i2, j3);
            }
        });
    }

    public static void lambda$prepareSendingText$104(String str, long j, AccountInstance accountInstance, long j2, boolean z, int i, int i2, long j3) {
        MessageObject messageObject;
        TLRPC.TL_forumTopic tL_forumTopicFindTopic;
        String trimmedString = getTrimmedString(str);
        if (trimmedString.length() != 0) {
            int iCeil = (int) Math.ceil(trimmedString.length() / 4096.0f);
            int i3 = 0;
            if (j == 0 || (tL_forumTopicFindTopic = accountInstance.getMessagesController().getTopicsController().findTopic(-j2, j)) == null || tL_forumTopicFindTopic.topicStartMessage == null) {
                messageObject = null;
            } else {
                messageObject = new MessageObject(accountInstance.getCurrentAccount(), tL_forumTopicFindTopic.topicStartMessage, false, false);
                messageObject.isTopicMainMessage = true;
            }
            while (i3 < iCeil) {
                int i4 = i3 + 1;
                SendMessageParams sendMessageParamsOf = SendMessageParams.of(trimmedString.substring(i3 * 4096, Math.min(i4 * 4096, trimmedString.length())), j2, messageObject, messageObject, null, true, null, null, null, z, i, i2, null, false);
                if (i3 == 0) {
                    sendMessageParamsOf.effect_id = j3;
                }
                accountInstance.getSendMessagesHelper().sendMessage(sendMessageParamsOf);
                i3 = i4;
            }
        }
    }

    public static void ensureMediaThumbExists(AccountInstance accountInstance, boolean z, TLObject tLObject, String str, Uri uri, long j) {
        ensureMediaThumbExists(accountInstance, z, tLObject, str, uri, j, false);
    }

    public static void ensureMediaThumbExists(AccountInstance accountInstance, boolean z, TLObject tLObject, String str, Uri uri, long j, boolean z2) {
        TLRPC.PhotoSize photoSizeScaleAndSaveImage;
        TLRPC.PhotoSize photoSizeScaleAndSaveImage2;
        if (tLObject instanceof TLRPC.TL_photo) {
            TLRPC.TL_photo tL_photo = (TLRPC.TL_photo) tLObject;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tL_photo.sizes, 90);
            boolean zExists = ((closestPhotoSizeWithSize instanceof TLRPC.TL_photoStrippedSize) || (closestPhotoSizeWithSize instanceof TLRPC.TL_photoPathSize)) ? true : FileLoader.getInstance(accountInstance.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize, true).exists();
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(tL_photo.sizes, AndroidUtilities.getPhotoSize(z2));
            boolean zExists2 = FileLoader.getInstance(accountInstance.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize2, false).exists();
            if (zExists && zExists2) {
                return;
            }
            Bitmap bitmapLoadBitmap = ImageLoader.loadBitmap(str, uri, AndroidUtilities.getPhotoSize(), AndroidUtilities.getPhotoSize(), true);
            if (bitmapLoadBitmap == null) {
                bitmapLoadBitmap = ImageLoader.loadBitmap(str, uri, 800.0f, 800.0f, true);
            }
            Bitmap bitmap = bitmapLoadBitmap;
            if (!zExists2 && (photoSizeScaleAndSaveImage2 = ImageLoader.scaleAndSaveImage(closestPhotoSizeWithSize2, bitmap, Bitmap.CompressFormat.JPEG, true, AndroidUtilities.getPhotoSize(), AndroidUtilities.getPhotoSize(), 80, false, 101, 101, false)) != closestPhotoSizeWithSize2) {
                tL_photo.sizes.add(0, photoSizeScaleAndSaveImage2);
            }
            if (!zExists && (photoSizeScaleAndSaveImage = ImageLoader.scaleAndSaveImage(closestPhotoSizeWithSize, bitmap, 90.0f, 90.0f, 55, true, false)) != closestPhotoSizeWithSize) {
                tL_photo.sizes.add(0, photoSizeScaleAndSaveImage);
            }
            if (bitmap != null) {
                bitmap.recycle();
                return;
            }
            return;
        }
        if (tLObject instanceof TLRPC.TL_document) {
            TLRPC.TL_document tL_document = (TLRPC.TL_document) tLObject;
            if ((MessageObject.isVideoDocument(tL_document) || MessageObject.isNewGifDocument(tL_document)) && MessageObject.isDocumentHasThumb(tL_document)) {
                TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(tL_document.thumbs, 320);
                if ((closestPhotoSizeWithSize3 instanceof TLRPC.TL_photoStrippedSize) || (closestPhotoSizeWithSize3 instanceof TLRPC.TL_photoPathSize) || FileLoader.getInstance(accountInstance.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize3, true).exists()) {
                    return;
                }
                Bitmap bitmapCreateVideoThumbnailAtTime = createVideoThumbnailAtTime(str, j);
                Bitmap bitmapCreateVideoThumbnail = bitmapCreateVideoThumbnailAtTime == null ? createVideoThumbnail(str, 1) : bitmapCreateVideoThumbnailAtTime;
                int i = z ? 90 : 320;
                float f = i;
                tL_document.thumbs.set(0, ImageLoader.scaleAndSaveImage(closestPhotoSizeWithSize3, bitmapCreateVideoThumbnail, f, f, i > 90 ? 80 : 55, false, true));
            }
        }
    }

    public static String getKeyForPhotoSize(AccountInstance accountInstance, TLRPC.PhotoSize photoSize, Bitmap[] bitmapArr, boolean z, boolean z2) {
        if (photoSize == null || photoSize.location == null) {
            return null;
        }
        Point messageSize = ChatMessageCell.getMessageSize(photoSize.w, photoSize.h);
        if (bitmapArr != null) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                File pathToAttach = FileLoader.getInstance(accountInstance.getCurrentAccount()).getPathToAttach(photoSize, z2);
                FileInputStream fileInputStream = new FileInputStream(pathToAttach);
                BitmapFactory.decodeStream(fileInputStream, null, options);
                fileInputStream.close();
                float fMax = Math.max(options.outWidth / messageSize.x, options.outHeight / messageSize.y);
                if (fMax < 1.0f) {
                    fMax = 1.0f;
                }
                options.inJustDecodeBounds = false;
                options.inSampleSize = (int) fMax;
                options.inPreferredConfig = Bitmap.Config.RGB_565;
                FileInputStream fileInputStream2 = new FileInputStream(pathToAttach);
                bitmapArr[0] = BitmapFactory.decodeStream(fileInputStream2, null, options);
                fileInputStream2.close();
            } catch (Throwable unused) {
            }
        }
        return String.format(Locale.US, z ? "%d_%d@%d_%d_b" : "%d_%d@%d_%d", Long.valueOf(photoSize.location.volume_id), Integer.valueOf(photoSize.location.local_id), Integer.valueOf((int) (messageSize.x / AndroidUtilities.density)), Integer.valueOf((int) (messageSize.y / AndroidUtilities.density)));
    }

    public static boolean shouldSendWebPAsSticker(String str, Uri uri) throws IOException {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        if (str != null) {
            try {
                BitmapFactory.decodeFile(str, options);
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else {
            try {
                InputStream inputStreamOpenInputStream = ApplicationLoader.applicationContext.getContentResolver().openInputStream(uri);
                try {
                    BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                    if (inputStreamOpenInputStream != null) {
                        inputStreamOpenInputStream.close();
                    }
                } finally {
                }
            } catch (Exception unused) {
            }
        }
        return options.outWidth < 800 && options.outHeight < 800;
    }

    public static void prepareSendingMedia(final AccountInstance accountInstance, final ArrayList<SendingMediaInfo> arrayList, final long j, final MessageObject messageObject, final MessageObject messageObject2, final TL_stories.StoryItem storyItem, final ChatActivity.ReplyQuote replyQuote, final boolean z, boolean z2, final MessageObject messageObject3, final boolean z3, final int i, final int i2, int i3, final boolean z4, final InputContentInfoCompat inputContentInfoCompat, final String str, final int i4, final long j2, final boolean z5, final long j3, final long j4, final MessageSuggestionParams messageSuggestionParams) {
        final boolean z6;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                z6 = z2;
                break;
            } else {
                if (arrayList.get(i5).ttl > 0) {
                    z6 = false;
                    break;
                }
                i5++;
            }
        }
        mediaSendQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws InterruptedException, IOException {
                SendMessagesHelper.lambda$prepareSendingMedia$112(arrayList, j, z, z6, accountInstance, messageObject3, messageObject, messageObject2, z3, i, i2, storyItem, replyQuote, str, i4, j2, z5, j3, j4, messageSuggestionParams, inputContentInfoCompat, z4);
            }
        });
    }

    public static void lambda$prepareSendingMedia$112(java.util.ArrayList r85, final long r86, boolean r88, boolean r89, final org.telegram.messenger.AccountInstance r90, final org.telegram.messenger.MessageObject r91, final org.telegram.messenger.MessageObject r92, final org.telegram.messenger.MessageObject r93, final boolean r94, final int r95, final int r96, final org.telegram.tgnet.tl.TL_stories.StoryItem r97, final org.telegram.ui.ChatActivity.ReplyQuote r98, final java.lang.String r99, final int r100, final long r101, final boolean r103, final long r104, final long r106, final org.telegram.messenger.MessageSuggestionParams r108, androidx.core.view.inputmethod.InputContentInfoCompat r109, final boolean r110) throws java.lang.InterruptedException, java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.lambda$prepareSendingMedia$112(java.util.ArrayList, long, boolean, boolean, org.telegram.messenger.AccountInstance, org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject, boolean, int, int, org.telegram.tgnet.tl.TL_stories$StoryItem, org.telegram.ui.ChatActivity$ReplyQuote, java.lang.String, int, long, boolean, long, long, org.telegram.messenger.MessageSuggestionParams, androidx.core.view.inputmethod.InputContentInfoCompat, boolean):void");
    }

    public static void lambda$prepareSendingMedia$107(MediaSendPrepareWorker mediaSendPrepareWorker, AccountInstance accountInstance, SendingMediaInfo sendingMediaInfo, boolean z) {
        mediaSendPrepareWorker.photo = accountInstance.getSendMessagesHelper().generatePhotoSizes(null, sendingMediaInfo.path, sendingMediaInfo.uri, sendingMediaInfo.highQuality);
        if (z && sendingMediaInfo.canDeleteAfter) {
            new File(sendingMediaInfo.path).delete();
        }
        mediaSendPrepareWorker.sync.countDown();
    }

    public static void lambda$prepareSendingMedia$108(MessageObject messageObject, AccountInstance accountInstance, TLRPC.TL_document tL_document, String str, HashMap map, SendingMediaInfo sendingMediaInfo, String str2, long j, MessageObject messageObject2, MessageObject messageObject3, boolean z, int i, int i2, TL_stories.StoryItem storyItem, ChatActivity.ReplyQuote replyQuote, String str3, int i3, boolean z2, long j2, boolean z3, long j3, long j4, MessageSuggestionParams messageSuggestionParams) {
        if (messageObject != null) {
            accountInstance.getSendMessagesHelper().editMessage(messageObject, null, null, tL_document, str, null, map, false, sendingMediaInfo.hasMediaSpoilers, str2);
            return;
        }
        SendMessageParams sendMessageParamsOf = SendMessageParams.of(tL_document, null, str, j, messageObject2, messageObject3, sendingMediaInfo.caption, sendingMediaInfo.entities, null, map, z, i, i2, 0, str2, null, false, sendingMediaInfo.hasMediaSpoilers);
        sendMessageParamsOf.replyToStoryItem = storyItem;
        sendMessageParamsOf.replyQuote = replyQuote;
        sendMessageParamsOf.quick_reply_shortcut = str3;
        sendMessageParamsOf.quick_reply_shortcut_id = i3;
        if (z2) {
            sendMessageParamsOf.effect_id = j2;
        }
        sendMessageParamsOf.invert_media = z3;
        sendMessageParamsOf.payStars = j3;
        sendMessageParamsOf.monoForumPeer = j4;
        sendMessageParamsOf.suggestionParams = messageSuggestionParams;
        accountInstance.getSendMessagesHelper().sendMessage(sendMessageParamsOf);
    }

    public static void lambda$prepareSendingMedia$109(MessageObject messageObject, AccountInstance accountInstance, TLRPC.TL_photo tL_photo, boolean z, SendingMediaInfo sendingMediaInfo, HashMap map, String str, long j, MessageObject messageObject2, MessageObject messageObject3, boolean z2, int i, int i2, TL_stories.StoryItem storyItem, ChatActivity.ReplyQuote replyQuote, int i3, String str2, long j2, boolean z3, long j3, long j4, MessageSuggestionParams messageSuggestionParams) {
        if (messageObject != null) {
            accountInstance.getSendMessagesHelper().editMessage(messageObject, tL_photo, null, null, z ? sendingMediaInfo.searchImage.imageUrl : null, null, map, false, sendingMediaInfo.hasMediaSpoilers, str);
            return;
        }
        SendMessageParams sendMessageParamsOf = SendMessageParams.of(tL_photo, z ? sendingMediaInfo.searchImage.imageUrl : null, j, messageObject2, messageObject3, sendingMediaInfo.caption, sendingMediaInfo.entities, null, map, z2, i, i2, sendingMediaInfo.ttl, str, false, sendingMediaInfo.hasMediaSpoilers);
        sendMessageParamsOf.replyToStoryItem = storyItem;
        sendMessageParamsOf.replyQuote = replyQuote;
        sendMessageParamsOf.quick_reply_shortcut_id = i3;
        sendMessageParamsOf.quick_reply_shortcut = str2;
        sendMessageParamsOf.effect_id = j2;
        sendMessageParamsOf.invert_media = z3;
        sendMessageParamsOf.payStars = j3;
        sendMessageParamsOf.monoForumPeer = j4;
        sendMessageParamsOf.suggestionParams = messageSuggestionParams;
        accountInstance.getSendMessagesHelper().sendMessage(sendMessageParamsOf);
    }

    public static void lambda$prepareSendingMedia$110(Bitmap bitmap, String str, MessageObject messageObject, AccountInstance accountInstance, VideoEditedInfo videoEditedInfo, TLRPC.TL_document tL_document, String str2, HashMap map, SendingMediaInfo sendingMediaInfo, String str3, long j, MessageObject messageObject2, MessageObject messageObject3, boolean z, int i, int i2, TL_stories.StoryItem storyItem, ChatActivity.ReplyQuote replyQuote, String str4, int i3, long j2, boolean z2, TLRPC.PhotoSize photoSize, long j3, long j4, MessageSuggestionParams messageSuggestionParams) {
        if (bitmap != null && str != null) {
            ImageLoader.getInstance().putImageToCache(new BitmapDrawable(bitmap), str, false);
        }
        if (messageObject != null) {
            accountInstance.getSendMessagesHelper().editMessage(messageObject, null, videoEditedInfo, tL_document, str2, null, map, false, sendingMediaInfo.hasMediaSpoilers, str3);
            return;
        }
        SendMessageParams sendMessageParamsOf = SendMessageParams.of(tL_document, videoEditedInfo, str2, j, messageObject2, messageObject3, sendingMediaInfo.caption, sendingMediaInfo.entities, null, map, z, i, i2, sendingMediaInfo.ttl, str3, null, false, sendingMediaInfo.hasMediaSpoilers);
        sendMessageParamsOf.replyToStoryItem = storyItem;
        sendMessageParamsOf.replyQuote = replyQuote;
        sendMessageParamsOf.quick_reply_shortcut = str4;
        sendMessageParamsOf.quick_reply_shortcut_id = i3;
        sendMessageParamsOf.effect_id = j2;
        sendMessageParamsOf.invert_media = z2;
        sendMessageParamsOf.stars = sendingMediaInfo.stars;
        sendMessageParamsOf.cover = photoSize;
        sendMessageParamsOf.payStars = j3;
        sendMessageParamsOf.monoForumPeer = j4;
        sendMessageParamsOf.suggestionParams = messageSuggestionParams;
        accountInstance.getSendMessagesHelper().sendMessage(sendMessageParamsOf);
    }

    public static void lambda$prepareSendingMedia$111(Bitmap[] bitmapArr, String[] strArr, MessageObject messageObject, AccountInstance accountInstance, TLRPC.TL_photo tL_photo, HashMap map, SendingMediaInfo sendingMediaInfo, String str, long j, MessageObject messageObject2, MessageObject messageObject3, boolean z, int i, int i2, boolean z2, TL_stories.StoryItem storyItem, ChatActivity.ReplyQuote replyQuote, String str2, int i3, long j2, boolean z3, long j3, long j4, MessageSuggestionParams messageSuggestionParams, boolean z4) {
        if (bitmapArr[0] != null && strArr[0] != null) {
            ImageLoader.getInstance().putImageToCache(new BitmapDrawable(bitmapArr[0]), strArr[0], false);
        }
        if (messageObject != null) {
            accountInstance.getSendMessagesHelper().editMessage(messageObject, tL_photo, null, null, null, null, map, false, sendingMediaInfo.hasMediaSpoilers, str);
            return;
        }
        SendMessageParams sendMessageParamsOf = SendMessageParams.of(tL_photo, null, j, messageObject2, messageObject3, sendingMediaInfo.caption, sendingMediaInfo.entities, null, map, z, i, i2, sendingMediaInfo.ttl, str, z2, sendingMediaInfo.hasMediaSpoilers);
        sendMessageParamsOf.replyToStoryItem = storyItem;
        sendMessageParamsOf.replyQuote = replyQuote;
        sendMessageParamsOf.quick_reply_shortcut = str2;
        sendMessageParamsOf.quick_reply_shortcut_id = i3;
        sendMessageParamsOf.effect_id = j2;
        sendMessageParamsOf.invert_media = z3;
        sendMessageParamsOf.stars = sendingMediaInfo.stars;
        sendMessageParamsOf.payStars = j3;
        sendMessageParamsOf.monoForumPeer = j4;
        sendMessageParamsOf.suggestionParams = messageSuggestionParams;
        sendMessageParamsOf.sendingHighQuality = z4;
        accountInstance.getSendMessagesHelper().sendMessage(sendMessageParamsOf);
    }

    public static void fillVideoAttribute(java.lang.String r6, org.telegram.tgnet.TLRPC.TL_documentAttributeVideo r7, org.telegram.messenger.VideoEditedInfo r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.fillVideoAttribute(java.lang.String, org.telegram.tgnet.TLRPC$TL_documentAttributeVideo, org.telegram.messenger.VideoEditedInfo):void");
    }

    public static Bitmap createVideoThumbnail(String str, int i) {
        float f = i == 2 ? 1920.0f : i == 3 ? 96.0f : 512.0f;
        Bitmap bitmapCreateVideoThumbnailAtTime = createVideoThumbnailAtTime(str, 0L);
        if (bitmapCreateVideoThumbnailAtTime == null) {
            return bitmapCreateVideoThumbnailAtTime;
        }
        int width = bitmapCreateVideoThumbnailAtTime.getWidth();
        int height = bitmapCreateVideoThumbnailAtTime.getHeight();
        float f2 = width;
        if (f2 <= f && height <= f) {
            return bitmapCreateVideoThumbnailAtTime;
        }
        float fMax = Math.max(width, height) / f;
        return Bitmap.createScaledBitmap(bitmapCreateVideoThumbnailAtTime, (int) (f2 / fMax), (int) (height / fMax), true);
    }

    public static Bitmap createVideoThumbnailAtTime(String str, long j) {
        return createVideoThumbnailAtTime(str, j, null, false);
    }

    public static Bitmap createVideoThumbnailAtTime(String str, long j, int[] iArr, boolean z) {
        Bitmap frameAtTime;
        Bitmap frameAtTime2;
        if (z) {
            AnimatedFileDrawable animatedFileDrawable = new AnimatedFileDrawable(new File(str), true, 0L, 0, null, null, null, 0L, 0, true, null);
            frameAtTime2 = animatedFileDrawable.getFrameAtTime(j, z);
            if (iArr != null) {
                iArr[0] = animatedFileDrawable.getOrientation();
            }
            animatedFileDrawable.recycle();
            if (frameAtTime2 == null) {
                return createVideoThumbnailAtTime(str, j, iArr, false);
            }
        } else {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    mediaMetadataRetriever.setDataSource(str);
                    frameAtTime = mediaMetadataRetriever.getFrameAtTime(j, 1);
                    if (frameAtTime == null) {
                        try {
                            frameAtTime = mediaMetadataRetriever.getFrameAtTime(j, 3);
                        } catch (Exception unused) {
                        }
                    }
                } catch (Exception unused2) {
                    frameAtTime = null;
                }
                frameAtTime2 = frameAtTime;
            } finally {
                try {
                    mediaMetadataRetriever.release();
                } catch (Throwable unused3) {
                }
            }
        }
        return frameAtTime2;
    }

    private static VideoEditedInfo createCompressionSettings(String str) {
        int[] iArr = new int[11];
        AnimatedFileDrawable.getVideoInfo(str, iArr);
        if (iArr[0] == 0) {
            if (!BuildVars.LOGS_ENABLED) {
                return null;
            }
            FileLog.d("video hasn't avc1 atom");
            return null;
        }
        long length = new File(str).length();
        int videoBitrate = MediaController.getVideoBitrate(str);
        if (videoBitrate == -1) {
            videoBitrate = iArr[3];
        }
        float f = iArr[4];
        long j = iArr[5];
        int i = iArr[7];
        VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
        videoEditedInfo.startTime = -1L;
        videoEditedInfo.endTime = -1L;
        videoEditedInfo.bitrate = videoBitrate;
        videoEditedInfo.originalPath = str;
        videoEditedInfo.framerate = i;
        videoEditedInfo.estimatedDuration = (long) Math.ceil(f);
        boolean z = true;
        int i2 = iArr[1];
        videoEditedInfo.originalWidth = i2;
        videoEditedInfo.resultWidth = i2;
        int i3 = iArr[2];
        videoEditedInfo.originalHeight = i3;
        videoEditedInfo.resultHeight = i3;
        videoEditedInfo.rotationValue = iArr[8];
        videoEditedInfo.originalDuration = (long) (f * 1000.0f);
        float fMax = Math.max(i2, i3);
        float f2 = 640.0f;
        int i4 = fMax > 1280.0f ? 4 : fMax > 854.0f ? 3 : fMax > 640.0f ? 2 : 1;
        int iRound = Math.round(DownloadController.getInstance(UserConfig.selectedAccount).getMaxVideoBitrate() / (100.0f / i4));
        if (iRound > i4) {
            iRound = i4;
        }
        if (new File(str).length() < 1048576000) {
            if (iRound != i4 || Math.max(videoEditedInfo.originalWidth, videoEditedInfo.originalHeight) > 1280) {
                if (iRound == 1) {
                    f2 = 432.0f;
                } else if (iRound != 2) {
                    f2 = iRound != 3 ? 1280.0f : 848.0f;
                }
                int i5 = videoEditedInfo.originalWidth;
                int i6 = videoEditedInfo.originalHeight;
                float f3 = f2 / (i5 > i6 ? i5 : i6);
                videoEditedInfo.resultWidth = Math.round((i5 * f3) / 2.0f) * 2;
                videoEditedInfo.resultHeight = Math.round((videoEditedInfo.originalHeight * f3) / 2.0f) * 2;
            } else {
                z = false;
            }
            videoBitrate = MediaController.makeVideoBitrate(videoEditedInfo.originalHeight, videoEditedInfo.originalWidth, videoBitrate, videoEditedInfo.resultHeight, videoEditedInfo.resultWidth);
        } else {
            z = false;
        }
        if (!z) {
            videoEditedInfo.resultWidth = videoEditedInfo.originalWidth;
            videoEditedInfo.resultHeight = videoEditedInfo.originalHeight;
            videoEditedInfo.bitrate = videoBitrate;
            videoEditedInfo.estimatedSize = length;
        } else {
            videoEditedInfo.bitrate = videoBitrate;
            videoEditedInfo.estimatedSize = (long) (j + (((f / 1000.0f) * MediaController.extractRealEncoderBitrate(videoEditedInfo.resultWidth, videoEditedInfo.resultHeight, videoBitrate, false)) / 8.0f));
        }
        if (videoEditedInfo.estimatedSize == 0) {
            videoEditedInfo.estimatedSize = 1L;
        }
        return videoEditedInfo;
    }

    public static void prepareSendingVideo(AccountInstance accountInstance, String str, VideoEditedInfo videoEditedInfo, String str2, TLRPC.Photo photo, long j, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, ChatActivity.ReplyQuote replyQuote, ArrayList<TLRPC.MessageEntity> arrayList, int i, MessageObject messageObject3, boolean z, int i2, int i3, boolean z2, boolean z3, CharSequence charSequence, String str3, int i4, long j2, long j3) {
        prepareSendingVideo(accountInstance, str, videoEditedInfo, str2, photo, j, messageObject, messageObject2, storyItem, replyQuote, arrayList, i, messageObject3, z, i2, i3, z2, z3, charSequence, str3, i4, j2, j3, 0L, null);
    }

    public static void prepareSendingVideo(final AccountInstance accountInstance, final String str, final VideoEditedInfo videoEditedInfo, final String str2, final TLRPC.Photo photo, final long j, final MessageObject messageObject, final MessageObject messageObject2, final TL_stories.StoryItem storyItem, final ChatActivity.ReplyQuote replyQuote, final ArrayList<TLRPC.MessageEntity> arrayList, final int i, final MessageObject messageObject3, final boolean z, final int i2, final int i3, final boolean z2, final boolean z3, final CharSequence charSequence, final String str3, final int i4, final long j2, final long j3, final long j4, final MessageSuggestionParams messageSuggestionParams) {
        if (str == null || str.length() == 0) {
            return;
        }
        new Thread(new Runnable() {
            @Override
            public final void run() throws Throwable {
                SendMessagesHelper.lambda$prepareSendingVideo$114(videoEditedInfo, str, j, i, accountInstance, str2, photo, charSequence, messageObject3, z3, messageObject, messageObject2, arrayList, z, i2, i3, storyItem, replyQuote, i4, str3, j2, j3, j4, messageSuggestionParams, z2);
            }
        }).start();
    }

    public static void lambda$prepareSendingVideo$114(org.telegram.messenger.VideoEditedInfo r34, java.lang.String r35, final long r36, final int r38, final org.telegram.messenger.AccountInstance r39, java.lang.String r40, org.telegram.tgnet.TLRPC.Photo r41, java.lang.CharSequence r42, final org.telegram.messenger.MessageObject r43, final boolean r44, final org.telegram.messenger.MessageObject r45, final org.telegram.messenger.MessageObject r46, final java.util.ArrayList r47, final boolean r48, final int r49, final int r50, final org.telegram.tgnet.tl.TL_stories.StoryItem r51, final org.telegram.ui.ChatActivity.ReplyQuote r52, final int r53, final java.lang.String r54, final long r55, final long r57, final long r59, final org.telegram.messenger.MessageSuggestionParams r61, boolean r62) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.lambda$prepareSendingVideo$114(org.telegram.messenger.VideoEditedInfo, java.lang.String, long, int, org.telegram.messenger.AccountInstance, java.lang.String, org.telegram.tgnet.TLRPC$Photo, java.lang.CharSequence, org.telegram.messenger.MessageObject, boolean, org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject, java.util.ArrayList, boolean, int, int, org.telegram.tgnet.tl.TL_stories$StoryItem, org.telegram.ui.ChatActivity$ReplyQuote, int, java.lang.String, long, long, long, org.telegram.messenger.MessageSuggestionParams, boolean):void");
    }

    public static void lambda$prepareSendingVideo$113(Bitmap bitmap, String str, MessageObject messageObject, AccountInstance accountInstance, VideoEditedInfo videoEditedInfo, TLRPC.TL_document tL_document, String str2, TLRPC.PhotoSize photoSize, HashMap map, boolean z, String str3, long j, MessageObject messageObject2, MessageObject messageObject3, String str4, ArrayList arrayList, boolean z2, int i, int i2, int i3, TL_stories.StoryItem storyItem, ChatActivity.ReplyQuote replyQuote, int i4, String str5, long j2, long j3, long j4, MessageSuggestionParams messageSuggestionParams) {
        if (bitmap != null && str != null) {
            ImageLoader.getInstance().putImageToCache(new BitmapDrawable(bitmap), str, false);
        }
        if (messageObject != null) {
            accountInstance.getSendMessagesHelper().editMessage(messageObject, null, videoEditedInfo, tL_document, str2, photoSize, map, false, z, str3);
            return;
        }
        SendMessageParams sendMessageParamsOf = SendMessageParams.of(tL_document, videoEditedInfo, str2, j, messageObject2, messageObject3, str4, arrayList, null, map, z2, i, i2, i3, str3, null, false, z);
        sendMessageParamsOf.replyToStoryItem = storyItem;
        sendMessageParamsOf.replyQuote = replyQuote;
        sendMessageParamsOf.quick_reply_shortcut_id = i4;
        sendMessageParamsOf.quick_reply_shortcut = str5;
        sendMessageParamsOf.effect_id = j2;
        sendMessageParamsOf.cover = photoSize;
        sendMessageParamsOf.payStars = j3;
        sendMessageParamsOf.monoForumPeer = j4;
        sendMessageParamsOf.suggestionParams = messageSuggestionParams;
        accountInstance.getSendMessagesHelper().sendMessage(sendMessageParamsOf);
    }

    public static class SendMessageParams {
        public String caption;
        public TLRPC.PhotoSize cover;
        public long dice_stake;
        public TLRPC.TL_document document;
        public long effect_id;
        public ArrayList<TLRPC.MessageEntity> entities;
        public TLRPC.TL_game game;
        public boolean hasMediaSpoilers;
        public boolean invert_media;
        public TLRPC.TL_messageMediaInvoice invoice;
        public TLRPC.MessageMedia location;
        public TLRPC.TL_messageMediaWebPage mediaWebPage;
        public String message;
        public long monoForumPeer;
        public boolean notify;
        public HashMap<String, String> params;
        public Object parentObject;
        public String path;
        public long payStars;
        public long peer;
        public TLRPC.TL_photo photo;
        public TLRPC.TL_messageMediaPoll poll;
        public String quick_reply_shortcut;
        public int quick_reply_shortcut_id;
        public TLRPC.ReplyMarkup replyMarkup;
        public ChatActivity.ReplyQuote replyQuote;
        public MessageObject replyToMsg;
        public TL_stories.StoryItem replyToStoryItem;
        public MessageObject replyToTopMsg;
        public MessageObject retryMessageObject;
        public int scheduleDate;
        public int scheduleRepeatPeriod;
        public boolean searchLinks = true;
        public MessageObject.SendAnimationData sendAnimationData;
        public boolean sendingHighQuality;
        public TL_stories.StoryItem sendingStory;
        public long stars;
        public MessageSuggestionParams suggestionParams;
        public TLRPC.TL_messageMediaToDo todo;
        public int ttl;
        public boolean updateStickersOrder;
        public TLRPC.User user;
        public VideoEditedInfo videoEditedInfo;
        public TLRPC.WebPage webPage;

        public static SendMessageParams of(String str, long j) {
            return of(str, null, null, null, null, null, null, null, null, null, j, null, null, null, null, true, null, null, null, null, false, 0, 0, 0, null, null, false);
        }

        public static SendMessageParams of(MessageObject messageObject) {
            long dialogId = messageObject.getDialogId();
            TLRPC.Message message = messageObject.messageOwner;
            SendMessageParams sendMessageParamsOf = of(null, null, null, null, null, null, null, null, null, null, dialogId, message.attachPath, null, null, null, true, messageObject, null, message.reply_markup, message.params, !message.silent, messageObject.scheduled ? message.date : 0, 0, 0, null, null, false);
            TLRPC.Message message2 = messageObject.messageOwner;
            if (message2 != null) {
                TLRPC.InputQuickReplyShortcut inputQuickReplyShortcut = message2.quick_reply_shortcut;
                if (inputQuickReplyShortcut instanceof TLRPC.TL_inputQuickReplyShortcut) {
                    sendMessageParamsOf.quick_reply_shortcut = ((TLRPC.TL_inputQuickReplyShortcut) inputQuickReplyShortcut).shortcut;
                }
                sendMessageParamsOf.quick_reply_shortcut_id = messageObject.getQuickReplyId();
                sendMessageParamsOf.payStars = messageObject.messageOwner.paid_message_stars;
            }
            return sendMessageParamsOf;
        }

        public static SendMessageParams of(TLRPC.User user, long j, MessageObject messageObject, MessageObject messageObject2, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> map, boolean z, int i, int i2) {
            return of(null, null, null, null, null, user, null, null, null, null, j, null, messageObject, messageObject2, null, true, null, null, replyMarkup, map, z, i, i2, 0, null, null, false);
        }

        public static SendMessageParams of(TLRPC.TL_messageMediaInvoice tL_messageMediaInvoice, long j, MessageObject messageObject, MessageObject messageObject2, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> map, boolean z, int i, int i2) {
            return of(null, null, null, null, null, null, null, null, null, tL_messageMediaInvoice, j, null, messageObject, messageObject2, null, true, null, null, replyMarkup, map, z, i, i2, 0, null, null, false);
        }

        public static SendMessageParams of(TLRPC.TL_document tL_document, VideoEditedInfo videoEditedInfo, String str, long j, MessageObject messageObject, MessageObject messageObject2, String str2, ArrayList<TLRPC.MessageEntity> arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> map, boolean z, int i, int i2, int i3, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z2) {
            return of(null, str2, null, null, videoEditedInfo, null, tL_document, null, null, null, j, str, messageObject, messageObject2, null, true, null, arrayList, replyMarkup, map, z, i, i2, i3, obj, sendAnimationData, z2);
        }

        public static SendMessageParams of(TLRPC.TL_document tL_document, VideoEditedInfo videoEditedInfo, String str, long j, MessageObject messageObject, MessageObject messageObject2, String str2, ArrayList<TLRPC.MessageEntity> arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> map, boolean z, int i, int i2, int i3, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z2, boolean z3) {
            return of(null, str2, null, null, videoEditedInfo, null, tL_document, null, null, null, j, str, messageObject, messageObject2, null, true, null, arrayList, replyMarkup, map, z, i, i2, i3, obj, sendAnimationData, z2, z3);
        }

        public static SendMessageParams of(String str, long j, MessageObject messageObject, MessageObject messageObject2, TLRPC.WebPage webPage, boolean z, ArrayList<TLRPC.MessageEntity> arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> map, boolean z2, int i, int i2, MessageObject.SendAnimationData sendAnimationData, boolean z3) {
            return of(str, null, null, null, null, null, null, null, null, null, j, null, messageObject, messageObject2, webPage, z, null, arrayList, replyMarkup, map, z2, i, i2, 0, null, sendAnimationData, z3);
        }

        public static SendMessageParams of(TLRPC.MessageMedia messageMedia, long j, MessageObject messageObject, MessageObject messageObject2, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> map, boolean z, int i, int i2) {
            return of(null, null, messageMedia, null, null, null, null, null, null, null, j, null, messageObject, messageObject2, null, true, null, null, replyMarkup, map, z, i, i2, 0, null, null, false);
        }

        public static SendMessageParams of(TLRPC.TL_messageMediaPoll tL_messageMediaPoll, long j, MessageObject messageObject, MessageObject messageObject2, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> map, boolean z, int i, int i2) {
            return of(null, null, null, null, null, null, null, null, tL_messageMediaPoll, null, j, null, messageObject, messageObject2, null, true, null, null, replyMarkup, map, z, i, i2, 0, null, null, false);
        }

        public static SendMessageParams of(TLRPC.TL_game tL_game, long j, MessageObject messageObject, MessageObject messageObject2, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> map, boolean z, int i, int i2) {
            return of(null, null, null, null, null, null, null, tL_game, null, null, j, null, messageObject, messageObject2, null, true, null, null, replyMarkup, map, z, i, i2, 0, null, null, false);
        }

        public static SendMessageParams of(TLRPC.TL_photo tL_photo, String str, long j, MessageObject messageObject, MessageObject messageObject2, String str2, ArrayList<TLRPC.MessageEntity> arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> map, boolean z, int i, int i2, int i3, Object obj, boolean z2, boolean z3) {
            return of(null, str2, null, tL_photo, null, null, null, null, null, null, j, str, messageObject, messageObject2, null, true, null, arrayList, replyMarkup, map, z, i, i2, i3, obj, null, z2, z3);
        }

        public static SendMessageParams of(TLRPC.TL_photo tL_photo, String str, long j, MessageObject messageObject, MessageObject messageObject2, String str2, ArrayList<TLRPC.MessageEntity> arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> map, boolean z, int i, int i2, int i3, Object obj, boolean z2) {
            return of(null, str2, null, tL_photo, null, null, null, null, null, null, j, str, messageObject, messageObject2, null, true, null, arrayList, replyMarkup, map, z, i, i2, i3, obj, null, z2);
        }

        private static SendMessageParams of(String str, String str2, TLRPC.MessageMedia messageMedia, TLRPC.TL_photo tL_photo, VideoEditedInfo videoEditedInfo, TLRPC.User user, TLRPC.TL_document tL_document, TLRPC.TL_game tL_game, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.TL_messageMediaInvoice tL_messageMediaInvoice, long j, String str3, MessageObject messageObject, MessageObject messageObject2, TLRPC.WebPage webPage, boolean z, MessageObject messageObject3, ArrayList<TLRPC.MessageEntity> arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> map, boolean z2, int i, int i2, int i3, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z3) {
            return of(str, str2, messageMedia, tL_photo, videoEditedInfo, user, tL_document, tL_game, tL_messageMediaPoll, tL_messageMediaInvoice, j, str3, messageObject, messageObject2, webPage, z, messageObject3, arrayList, replyMarkup, map, z2, i, i2, i3, obj, sendAnimationData, z3, false);
        }

        public static SendMessageParams of(String str, String str2, TLRPC.MessageMedia messageMedia, TLRPC.TL_photo tL_photo, VideoEditedInfo videoEditedInfo, TLRPC.User user, TLRPC.TL_document tL_document, TLRPC.TL_game tL_game, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.TL_messageMediaInvoice tL_messageMediaInvoice, long j, String str3, MessageObject messageObject, MessageObject messageObject2, TLRPC.WebPage webPage, boolean z, MessageObject messageObject3, ArrayList<TLRPC.MessageEntity> arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> map, boolean z2, int i, int i2, int i3, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z3, boolean z4) {
            SendMessageParams sendMessageParams = new SendMessageParams();
            sendMessageParams.message = str;
            sendMessageParams.caption = str2;
            sendMessageParams.location = messageMedia;
            sendMessageParams.photo = tL_photo;
            sendMessageParams.videoEditedInfo = videoEditedInfo;
            sendMessageParams.user = user;
            sendMessageParams.document = tL_document;
            sendMessageParams.game = tL_game;
            sendMessageParams.poll = tL_messageMediaPoll;
            sendMessageParams.invoice = tL_messageMediaInvoice;
            sendMessageParams.peer = j;
            sendMessageParams.path = str3;
            sendMessageParams.replyToMsg = messageObject;
            sendMessageParams.replyToTopMsg = messageObject2;
            sendMessageParams.webPage = webPage;
            sendMessageParams.searchLinks = z;
            sendMessageParams.retryMessageObject = messageObject3;
            sendMessageParams.entities = arrayList;
            sendMessageParams.replyMarkup = replyMarkup;
            sendMessageParams.params = map;
            sendMessageParams.notify = z2;
            sendMessageParams.scheduleDate = i;
            sendMessageParams.scheduleRepeatPeriod = i2;
            sendMessageParams.ttl = i3;
            sendMessageParams.parentObject = obj;
            sendMessageParams.sendAnimationData = sendAnimationData;
            sendMessageParams.updateStickersOrder = z3;
            sendMessageParams.hasMediaSpoilers = z4;
            return sendMessageParams;
        }
    }

    public TLRPC.Message getMessageFromUpdate(TLRPC.Update update) {
        if (update instanceof TLRPC.TL_updateNewMessage) {
            return ((TLRPC.TL_updateNewMessage) update).message;
        }
        if (update instanceof TLRPC.TL_updateNewChannelMessage) {
            return ((TLRPC.TL_updateNewChannelMessage) update).message;
        }
        if (update instanceof TLRPC.TL_updateNewScheduledMessage) {
            return ((TLRPC.TL_updateNewScheduledMessage) update).message;
        }
        if (update instanceof TLRPC.TL_updateQuickReplyMessage) {
            return ((TLRPC.TL_updateQuickReplyMessage) update).message;
        }
        return null;
    }

    private void applyMonoForumPeerId(TLRPC.TL_messages_sendMessage tL_messages_sendMessage, long j) {
        if (j != 0) {
            TLRPC.InputPeer inputPeer = getMessagesController().getInputPeer(j);
            TLRPC.InputReplyTo inputReplyTo = tL_messages_sendMessage.reply_to;
            if (inputReplyTo != null) {
                if (inputReplyTo instanceof TLRPC.TL_inputReplyToMessage) {
                    inputReplyTo.monoforum_peer_id = inputPeer;
                    inputReplyTo.flags |= 32;
                    return;
                }
                return;
            }
            TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
            tL_messages_sendMessage.reply_to = tL_inputReplyToMonoForum;
            tL_inputReplyToMonoForum.monoforum_peer_id = inputPeer;
            tL_messages_sendMessage.flags |= 1;
        }
    }

    private void applyMonoForumPeerId(TLRPC.TL_messages_sendMedia tL_messages_sendMedia, long j) {
        if (j != 0) {
            TLRPC.InputPeer inputPeer = getMessagesController().getInputPeer(j);
            TLRPC.InputReplyTo inputReplyTo = tL_messages_sendMedia.reply_to;
            if (inputReplyTo != null) {
                if (inputReplyTo instanceof TLRPC.TL_inputReplyToMessage) {
                    inputReplyTo.monoforum_peer_id = inputPeer;
                    inputReplyTo.flags |= 32;
                    return;
                }
                return;
            }
            TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
            tL_messages_sendMedia.reply_to = tL_inputReplyToMonoForum;
            tL_inputReplyToMonoForum.monoforum_peer_id = inputPeer;
            tL_messages_sendMedia.flags |= 1;
        }
    }

    private void applyMonoForumPeerId(TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, long j) {
        if (j != 0) {
            TLRPC.InputPeer inputPeer = getMessagesController().getInputPeer(j);
            TLRPC.InputReplyTo inputReplyTo = tL_messages_sendMultiMedia.reply_to;
            if (inputReplyTo != null) {
                if (inputReplyTo instanceof TLRPC.TL_inputReplyToMessage) {
                    inputReplyTo.monoforum_peer_id = inputPeer;
                    inputReplyTo.flags |= 32;
                    return;
                }
                return;
            }
            TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
            tL_messages_sendMultiMedia.reply_to = tL_inputReplyToMonoForum;
            tL_inputReplyToMonoForum.monoforum_peer_id = inputPeer;
            tL_messages_sendMultiMedia.flags |= 1;
        }
    }

    private void applyMonoForumPeerId(TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages, long j) {
        if (j != 0) {
            TLRPC.InputPeer inputPeer = getMessagesController().getInputPeer(j);
            TLRPC.InputReplyTo inputReplyTo = tL_messages_forwardMessages.reply_to;
            if (inputReplyTo != null) {
                if (inputReplyTo instanceof TLRPC.TL_inputReplyToMessage) {
                    inputReplyTo.monoforum_peer_id = inputPeer;
                    inputReplyTo.flags |= 32;
                    return;
                }
                return;
            }
            TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
            tL_messages_forwardMessages.reply_to = tL_inputReplyToMonoForum;
            tL_inputReplyToMonoForum.monoforum_peer_id = inputPeer;
        }
    }
}
