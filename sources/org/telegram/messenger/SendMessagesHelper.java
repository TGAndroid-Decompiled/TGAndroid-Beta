package org.telegram.messenger;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Spannable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.webkit.MimeTypeMap;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import j$.util.Objects;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.QuickAckDelegate;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.eo;
import org.telegram.ui.kl0;
import org.telegram.ui.mh1;
import org.telegram.ui.tn;
import org.telegram.ui.wo0;
public class SendMessagesHelper extends BaseController implements NotificationCenter.NotificationCenterDelegate {
    private static final int ERROR_TYPE_FILE_TOO_LARGE = 2;
    private static final int ERROR_TYPE_UNSUPPORTED = 1;
    private static volatile SendMessagesHelper[] Instance = null;
    public static final int MEDIA_TYPE_DICE = 11;
    public static final int MEDIA_TYPE_RICH = 13;
    public static final int MEDIA_TYPE_STORY = 12;
    private static DispatchQueue mediaSendQueue = new DispatchQueue("mediaSendQueue");
    private static ThreadPoolExecutor mediaSendThreadPool;
    private final HashMap<String, ArrayList<DelayedMessage>> delayedMessages;
    private final SparseArray<TLRPC.Message> editingMessages;
    private final HashMap<String, ImportingHistory> importingHistoryFiles;
    private final a0.i importingHistoryMap;
    private final HashMap<String, ImportingStickers> importingStickersFiles;
    private final HashMap<String, ImportingStickers> importingStickersMap;
    private LocationProvider locationProvider;
    private final SparseArray<TLRPC.Message> sendingMessages;
    private final a0.i sendingMessagesIdDialogs;
    private final SparseArray<MessageObject> unsentMessages;
    private final SparseArray<TLRPC.Message> uploadMessages;
    private final a0.i uploadingMessagesIdDialogs;
    private final a0.i voteSendTime;
    private final HashMap<String, Boolean> waitingForCallback;
    private final HashMap<String, List<String>> waitingForCallbackMap;
    private final HashMap<String, MessageObject> waitingForLocation;
    private final HashMap<Integer, Boolean> waitingForTodoUpdate;
    private final HashMap<String, byte[]> waitingForVote;

    public class DelayedMessageSendAfterRequest {
        public DelayedMessage delayedMessage;
        public MessageObject msgObj;
        public ArrayList<MessageObject> msgObjs;
        public String originalPath;
        public ArrayList<String> originalPaths;
        public Object parentObject;
        public ArrayList<Object> parentObjects;
        public TLObject request;
        public boolean scheduled;

        public DelayedMessageSendAfterRequest() {
            SendMessagesHelper.this = r1;
        }
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

        public class AnonymousClass1 implements RequestDelegate {
            final TLRPC.TL_messages_initHistoryImport val$req;

            public AnonymousClass1(TLRPC.TL_messages_initHistoryImport tL_messages_initHistoryImport) {
                ImportingHistory.this = r1;
                this.val$req = tL_messages_initHistoryImport;
            }

            public void lambda$run$0(TLObject tLObject, TLRPC.TL_messages_initHistoryImport tL_messages_initHistoryImport, TLRPC.TL_error tL_error) {
                if (tLObject instanceof TLRPC.TL_messages_historyImport) {
                    ImportingHistory importingHistory = ImportingHistory.this;
                    importingHistory.importId = ((TLRPC.TL_messages_historyImport) tLObject).f17296id;
                    importingHistory.uploadSet.remove(importingHistory.historyPath);
                    SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(ImportingHistory.this.dialogId));
                    if (ImportingHistory.this.uploadSet.isEmpty()) {
                        ImportingHistory.this.startImport();
                    }
                    ImportingHistory.this.lastUploadTime = SystemClock.elapsedRealtime();
                    int size = ImportingHistory.this.uploadMedia.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        SendMessagesHelper.this.getFileLoader().uploadFile(ImportingHistory.this.uploadMedia.get(i10), false, true, 67108864);
                    }
                    return;
                }
                SendMessagesHelper.this.importingHistoryMap.l(ImportingHistory.this.dialogId);
                SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(ImportingHistory.this.dialogId), tL_messages_initHistoryImport, tL_error);
            }

            @Override
            public void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new yk(this, tLObject, this.val$req, tL_error, 0));
            }
        }

        public class AnonymousClass2 implements RequestDelegate {
            final String val$path;

            public AnonymousClass2(String str) {
                ImportingHistory.this = r1;
                this.val$path = str;
            }

            public void lambda$run$0(String str) {
                ImportingHistory.this.uploadSet.remove(str);
                SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(ImportingHistory.this.dialogId));
                if (ImportingHistory.this.uploadSet.isEmpty()) {
                    ImportingHistory.this.startImport();
                }
            }

            @Override
            public void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new i3(10, this, this.val$path));
            }
        }

        public class AnonymousClass3 implements RequestDelegate {
            final TLRPC.TL_messages_startHistoryImport val$req;

            public AnonymousClass3(TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport) {
                ImportingHistory.this = r1;
                this.val$req = tL_messages_startHistoryImport;
            }

            public void lambda$run$0(TLRPC.TL_error tL_error, TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport) {
                SendMessagesHelper.this.importingHistoryMap.l(ImportingHistory.this.dialogId);
                if (tL_error == null) {
                    SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(ImportingHistory.this.dialogId));
                } else {
                    SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(ImportingHistory.this.dialogId), tL_messages_startHistoryImport, tL_error);
                }
            }

            @Override
            public void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new f0(this, tL_error, this.val$req, 3));
            }
        }

        public ImportingHistory() {
            SendMessagesHelper.this = r1;
        }

        public void addUploadProgress(String str, long j3, float f7) {
            this.uploadProgresses.put(str, Float.valueOf(f7));
            this.uploadSize.put(str, Long.valueOf(j3));
            this.uploadedSize = 0L;
            for (Map.Entry<String, Long> entry : this.uploadSize.entrySet()) {
                this.uploadedSize = entry.getValue().longValue() + this.uploadedSize;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (!str.equals(this.historyPath)) {
                long j10 = this.uploadedSize;
                long j11 = this.lastUploadSize;
                if (j10 != j11) {
                    long j12 = this.lastUploadTime;
                    if (elapsedRealtime != j12) {
                        double d = (j10 - j11) / ((elapsedRealtime - j12) / 1000.0d);
                        double d10 = this.estimatedUploadSpeed;
                        if (d10 == 0.0d) {
                            this.estimatedUploadSpeed = d;
                        } else {
                            this.estimatedUploadSpeed = (0.99d * d10) + (d * 0.01d);
                        }
                        this.timeUntilFinish = (int) (((this.totalSize - j10) * 1000) / this.estimatedUploadSpeed);
                        this.lastUploadSize = j10;
                        this.lastUploadTime = elapsedRealtime;
                    }
                }
            }
            int uploadedCount = (int) ((((float) getUploadedCount()) / ((float) getTotalCount())) * 100.0f);
            if (this.uploadProgress != uploadedCount) {
                this.uploadProgress = uploadedCount;
                SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(this.dialogId));
            }
        }

        public void initImport(TLRPC.InputFile inputFile) {
            TLRPC.TL_messages_initHistoryImport tL_messages_initHistoryImport = new TLRPC.TL_messages_initHistoryImport();
            tL_messages_initHistoryImport.file = inputFile;
            tL_messages_initHistoryImport.media_count = this.mediaPaths.size();
            tL_messages_initHistoryImport.peer = this.peer;
            SendMessagesHelper.this.getConnectionsManager().sendRequest(tL_messages_initHistoryImport, new AnonymousClass1(tL_messages_initHistoryImport), 2);
        }

        public void onFileFailedToUpload(String str) {
            if (str.equals(this.historyPath)) {
                SendMessagesHelper.this.importingHistoryMap.l(this.dialogId);
                TLRPC.TL_error tL_error = new TLRPC.TL_error();
                tL_error.code = 400;
                tL_error.text = "IMPORT_UPLOAD_FAILED";
                SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(this.dialogId), new TLRPC.TL_messages_initHistoryImport(), tL_error);
                return;
            }
            this.uploadSet.remove(str);
        }

        public void onMediaImport(String str, long j3, TLRPC.InputFile inputFile) {
            String str2;
            addUploadProgress(str, j3, 1.0f);
            TLRPC.TL_messages_uploadImportedMedia tL_messages_uploadImportedMedia = new TLRPC.TL_messages_uploadImportedMedia();
            tL_messages_uploadImportedMedia.peer = this.peer;
            tL_messages_uploadImportedMedia.import_id = this.importId;
            tL_messages_uploadImportedMedia.file_name = new File(str).getName();
            MimeTypeMap singleton = MimeTypeMap.getSingleton();
            int lastIndexOf = tL_messages_uploadImportedMedia.file_name.lastIndexOf(46);
            if (lastIndexOf != -1) {
                str2 = tL_messages_uploadImportedMedia.file_name.substring(lastIndexOf + 1).toLowerCase();
            } else {
                str2 = "txt";
            }
            String mimeTypeFromExtension = singleton.getMimeTypeFromExtension(str2);
            if (mimeTypeFromExtension == null) {
                if ("opus".equals(str2)) {
                    mimeTypeFromExtension = "audio/opus";
                } else if ("webp".equals(str2)) {
                    mimeTypeFromExtension = "image/webp";
                } else {
                    mimeTypeFromExtension = "text/plain";
                }
            }
            if (!mimeTypeFromExtension.equals("image/jpg") && !mimeTypeFromExtension.equals("image/jpeg")) {
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                tL_inputMediaUploadedDocument.file = inputFile;
                tL_inputMediaUploadedDocument.mime_type = mimeTypeFromExtension;
                tL_messages_uploadImportedMedia.media = tL_inputMediaUploadedDocument;
            } else {
                TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                tL_inputMediaUploadedPhoto.file = inputFile;
                tL_messages_uploadImportedMedia.media = tL_inputMediaUploadedPhoto;
            }
            SendMessagesHelper.this.getConnectionsManager().sendRequest(tL_messages_uploadImportedMedia, new AnonymousClass2(str), 2);
        }

        public void startImport() {
            TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport = new TLRPC.TL_messages_startHistoryImport();
            tL_messages_startHistoryImport.peer = this.peer;
            tL_messages_startHistoryImport.import_id = this.importId;
            SendMessagesHelper.this.getConnectionsManager().sendRequest(tL_messages_startHistoryImport, new AnonymousClass3(tL_messages_startHistoryImport));
        }

        public long getTotalCount() {
            return this.totalSize;
        }

        public long getUploadedCount() {
            return this.uploadedSize;
        }

        public void setImportProgress(int i10) {
            if (i10 == 100) {
                SendMessagesHelper.this.importingHistoryMap.l(this.dialogId);
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

        public class AnonymousClass1 implements RequestDelegate {
            final Runnable val$onFinish;

            public AnonymousClass1(Runnable runnable) {
                ImportingSticker.this = r1;
                this.val$onFinish = runnable;
            }

            public void lambda$run$0(TLObject tLObject, Runnable runnable) {
                if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
                    ImportingSticker.this.item = new TLRPC.TL_inputStickerSetItem();
                    ImportingSticker.this.item.document = new TLRPC.TL_inputDocument();
                    ImportingSticker importingSticker = ImportingSticker.this;
                    TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem = importingSticker.item;
                    TLRPC.InputDocument inputDocument = tL_inputStickerSetItem.document;
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject).document;
                    inputDocument.f17207id = document.f17201id;
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

            @Override
            public void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new f0(this, tLObject, this.val$onFinish, 4));
            }
        }

        public void uploadMedia(int i10, TLRPC.InputFile inputFile, Runnable runnable) {
            TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
            tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
            TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
            tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
            tL_inputMediaUploadedDocument.file = inputFile;
            tL_inputMediaUploadedDocument.mime_type = this.mimeType;
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_uploadMedia, new AnonymousClass1(runnable), 2);
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

        public class AnonymousClass1 implements RequestDelegate {
            final TLRPC.TL_stickers_createStickerSet val$req;

            public AnonymousClass1(TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet) {
                ImportingStickers.this = r1;
                this.val$req = tL_stickers_createStickerSet;
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
                    int i10 = NotificationCenter.stickersImportComplete;
                    if (notificationCenter.hasObservers(i10)) {
                        SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, tLObject);
                    } else {
                        SendMessagesHelper.this.getMediaDataController().toggleStickerSet(null, tLObject, 2, null, false, false);
                    }
                }
            }

            @Override
            public void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new yk(this, tL_error, this.val$req, tLObject));
            }
        }

        public ImportingStickers() {
            SendMessagesHelper.this = r1;
        }

        public void addUploadProgress(String str, long j3, float f7) {
            this.uploadProgresses.put(str, Float.valueOf(f7));
            this.uploadSize.put(str, Long.valueOf(j3));
            this.uploadedSize = 0L;
            for (Map.Entry<String, Long> entry : this.uploadSize.entrySet()) {
                this.uploadedSize = entry.getValue().longValue() + this.uploadedSize;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = this.uploadedSize;
            long j11 = this.lastUploadSize;
            if (j10 != j11) {
                long j12 = this.lastUploadTime;
                if (elapsedRealtime != j12) {
                    double d = (j10 - j11) / ((elapsedRealtime - j12) / 1000.0d);
                    double d10 = this.estimatedUploadSpeed;
                    if (d10 == 0.0d) {
                        this.estimatedUploadSpeed = d;
                    } else {
                        this.estimatedUploadSpeed = (0.99d * d10) + (d * 0.01d);
                    }
                    this.timeUntilFinish = (int) (((this.totalSize - j10) * 1000) / this.estimatedUploadSpeed);
                    this.lastUploadSize = j10;
                    this.lastUploadTime = elapsedRealtime;
                }
            }
            int uploadedCount = (int) ((((float) getUploadedCount()) / ((float) getTotalCount())) * 100.0f);
            if (this.uploadProgress != uploadedCount) {
                this.uploadProgress = uploadedCount;
                SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersImportProgressChanged, this.shortName);
            }
        }

        public void initImport() {
            SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersImportProgressChanged, this.shortName);
            this.lastUploadTime = SystemClock.elapsedRealtime();
            int size = this.uploadMedia.size();
            for (int i10 = 0; i10 < size; i10++) {
                SendMessagesHelper.this.getFileLoader().uploadFile(this.uploadMedia.get(i10).path, false, true, 67108864);
            }
        }

        public void lambda$onMediaImport$0(String str) {
            this.uploadSet.remove(str);
            SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersImportProgressChanged, this.shortName);
            if (this.uploadSet.isEmpty()) {
                startImport();
            }
        }

        public void onFileFailedToUpload(String str) {
            ImportingSticker remove = this.uploadSet.remove(str);
            if (remove != null) {
                this.uploadMedia.remove(remove);
            }
        }

        public void onMediaImport(String str, long j3, TLRPC.InputFile inputFile) {
            addUploadProgress(str, j3, 1.0f);
            ImportingSticker importingSticker = this.uploadSet.get(str);
            if (importingSticker == null) {
                return;
            }
            importingSticker.uploadMedia(SendMessagesHelper.this.currentAccount, inputFile, new eh(10, this, str));
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
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem = this.uploadMedia.get(i10).item;
                if (tL_inputStickerSetItem != null) {
                    tL_stickers_createStickerSet.stickers.add(tL_inputStickerSetItem);
                }
            }
            SendMessagesHelper.this.getConnectionsManager().sendRequest(tL_stickers_createStickerSet, new AnonymousClass1(tL_stickers_createStickerSet));
        }

        public long getTotalCount() {
            return this.totalSize;
        }

        public long getUploadedCount() {
            return this.uploadedSize;
        }

        public void setImportProgress(int i10) {
            if (i10 == 100) {
                SendMessagesHelper.this.importingStickersMap.remove(this.shortName);
            }
            SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersImportProgressChanged, this.shortName);
        }
    }

    public static class MediaSendPrepareWorker {
        public volatile String parentObject;
        public volatile TLRPC.TL_photo photo;
        public CountDownLatch sync;

        private MediaSendPrepareWorker() {
        }
    }

    public static class SendMessageParams {
        public String caption;
        public TLRPC.PhotoSize cover;
        public long dice_stake;
        public TLRPC.TL_document document;
        public long effect_id;
        public ArrayList<TLRPC.MessageEntity> entities;
        public long ephemeralReceiverBotId;
        public TLRPC.TL_game game;
        public boolean hasMediaSpoilers;
        public boolean invert_media;
        public TLRPC.TL_messageMediaInvoice invoice;
        public boolean isLivePhoto;
        public long livePhotoTimestamp;
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
        public int pollIndex;
        public ph.h pollSendParams;
        @Deprecated
        public String quick_reply_shortcut;
        @Deprecated
        public int quick_reply_shortcut_id;
        public TLRPC.ReplyMarkup replyMarkup;
        public tn replyQuote;
        public MessageObject replyToMsg;
        public TL_stories.StoryItem replyToStoryItem;
        public MessageObject replyToTopMsg;
        public MessageObject retryMessageObject;
        public TL_iv.RichMessage richMessage;
        public ArrayList<TLRPC.InputUser> richMessageInputUsers;
        public int scheduleDate;
        public int scheduleRepeatPeriod;
        public boolean searchLinks = true;
        public MessageObject.SendAnimationData sendAnimationData;
        public SendMessageChatArguments sendMessageChatArguments;
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

        public static SendMessageParams of(String str, long j3) {
            return of(str, null, null, null, null, null, null, null, null, null, j3, null, null, null, null, true, null, null, null, null, false, 0, 0, 0, null, null, false);
        }

        public static SendMessageParams ofRichMessage(TL_iv.RichMessage richMessage, long j3, MessageObject messageObject, MessageObject messageObject2, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> hashMap, boolean z10, int i10, int i11) {
            SendMessageParams of2 = of(null, null, null, null, null, null, null, null, null, null, j3, null, messageObject, messageObject2, null, true, null, null, replyMarkup, hashMap, z10, i10, i11, 0, null, null, false);
            of2.richMessage = richMessage;
            return of2;
        }

        public static SendMessageParams of(MessageObject messageObject) {
            long dialogId = messageObject.getDialogId();
            TLRPC.Message message = messageObject.messageOwner;
            SendMessageParams of2 = of(null, null, null, null, null, null, null, null, null, null, dialogId, message.attachPath, null, null, null, true, messageObject, null, message.reply_markup, message.params, !message.silent, messageObject.scheduled ? message.date : 0, 0, 0, null, null, false);
            TLRPC.Message message2 = messageObject.messageOwner;
            if (message2 != null) {
                TLRPC.InputQuickReplyShortcut inputQuickReplyShortcut = message2.quick_reply_shortcut;
                if (inputQuickReplyShortcut instanceof TLRPC.TL_inputQuickReplyShortcut) {
                    of2.quick_reply_shortcut = ((TLRPC.TL_inputQuickReplyShortcut) inputQuickReplyShortcut).shortcut;
                }
                of2.quick_reply_shortcut_id = messageObject.getQuickReplyId();
                of2.payStars = messageObject.messageOwner.paid_message_stars;
            }
            of2.ephemeralReceiverBotId = messageObject.getEphemeralReceiverBotId();
            return of2;
        }

        public static SendMessageParams of(TLRPC.User user, long j3, MessageObject messageObject, MessageObject messageObject2, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> hashMap, boolean z10, int i10, int i11) {
            return of(null, null, null, null, null, user, null, null, null, null, j3, null, messageObject, messageObject2, null, true, null, null, replyMarkup, hashMap, z10, i10, i11, 0, null, null, false);
        }

        public static SendMessageParams of(TLRPC.TL_messageMediaInvoice tL_messageMediaInvoice, long j3, MessageObject messageObject, MessageObject messageObject2, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> hashMap, boolean z10, int i10, int i11) {
            return of(null, null, null, null, null, null, null, null, null, tL_messageMediaInvoice, j3, null, messageObject, messageObject2, null, true, null, null, replyMarkup, hashMap, z10, i10, i11, 0, null, null, false);
        }

        public static SendMessageParams of(TLRPC.TL_document tL_document, VideoEditedInfo videoEditedInfo, String str, long j3, MessageObject messageObject, MessageObject messageObject2, String str2, ArrayList<TLRPC.MessageEntity> arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> hashMap, boolean z10, int i10, int i11, int i12, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z11) {
            return of(null, str2, null, null, videoEditedInfo, null, tL_document, null, null, null, j3, str, messageObject, messageObject2, null, true, null, arrayList, replyMarkup, hashMap, z10, i10, i11, i12, obj, sendAnimationData, z11);
        }

        public static SendMessageParams of(TLRPC.TL_document tL_document, VideoEditedInfo videoEditedInfo, String str, long j3, MessageObject messageObject, MessageObject messageObject2, String str2, ArrayList<TLRPC.MessageEntity> arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> hashMap, boolean z10, int i10, int i11, int i12, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z11, boolean z12) {
            return of(null, str2, null, null, videoEditedInfo, null, tL_document, null, null, null, j3, str, messageObject, messageObject2, null, true, null, arrayList, replyMarkup, hashMap, z10, i10, i11, i12, obj, sendAnimationData, z11, z12);
        }

        public static SendMessageParams of(String str, long j3, MessageObject messageObject, MessageObject messageObject2, TLRPC.WebPage webPage, boolean z10, ArrayList<TLRPC.MessageEntity> arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> hashMap, boolean z11, int i10, int i11, MessageObject.SendAnimationData sendAnimationData, boolean z12) {
            return of(str, null, null, null, null, null, null, null, null, null, j3, null, messageObject, messageObject2, webPage, z10, null, arrayList, replyMarkup, hashMap, z11, i10, i11, 0, null, sendAnimationData, z12);
        }

        public static SendMessageParams of(TLRPC.MessageMedia messageMedia, long j3, MessageObject messageObject, MessageObject messageObject2, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> hashMap, boolean z10, int i10, int i11) {
            return of(null, null, messageMedia, null, null, null, null, null, null, null, j3, null, messageObject, messageObject2, null, true, null, null, replyMarkup, hashMap, z10, i10, i11, 0, null, null, false);
        }

        public static SendMessageParams of(TLRPC.TL_messageMediaPoll tL_messageMediaPoll, long j3, MessageObject messageObject, MessageObject messageObject2, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> hashMap, boolean z10, int i10, int i11) {
            return of(null, null, null, null, null, null, null, null, tL_messageMediaPoll, null, j3, null, messageObject, messageObject2, null, true, null, null, replyMarkup, hashMap, z10, i10, i11, 0, null, null, false);
        }

        public static SendMessageParams of(TLRPC.TL_game tL_game, long j3, MessageObject messageObject, MessageObject messageObject2, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> hashMap, boolean z10, int i10, int i11) {
            return of(null, null, null, null, null, null, null, tL_game, null, null, j3, null, messageObject, messageObject2, null, true, null, null, replyMarkup, hashMap, z10, i10, i11, 0, null, null, false);
        }

        public static SendMessageParams of(TLRPC.TL_photo tL_photo, String str, long j3, MessageObject messageObject, MessageObject messageObject2, String str2, ArrayList<TLRPC.MessageEntity> arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> hashMap, boolean z10, int i10, int i11, int i12, Object obj, boolean z11, boolean z12) {
            return of(null, str2, null, tL_photo, null, null, null, null, null, null, j3, str, messageObject, messageObject2, null, true, null, arrayList, replyMarkup, hashMap, z10, i10, i11, i12, obj, null, z11, z12);
        }

        public static SendMessageParams of(TLRPC.TL_photo tL_photo, String str, long j3, MessageObject messageObject, MessageObject messageObject2, String str2, ArrayList<TLRPC.MessageEntity> arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> hashMap, boolean z10, int i10, int i11, int i12, Object obj, boolean z11) {
            return of(null, str2, null, tL_photo, null, null, null, null, null, null, j3, str, messageObject, messageObject2, null, true, null, arrayList, replyMarkup, hashMap, z10, i10, i11, i12, obj, null, z11);
        }

        private static SendMessageParams of(String str, String str2, TLRPC.MessageMedia messageMedia, TLRPC.TL_photo tL_photo, VideoEditedInfo videoEditedInfo, TLRPC.User user, TLRPC.TL_document tL_document, TLRPC.TL_game tL_game, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.TL_messageMediaInvoice tL_messageMediaInvoice, long j3, String str3, MessageObject messageObject, MessageObject messageObject2, TLRPC.WebPage webPage, boolean z10, MessageObject messageObject3, ArrayList<TLRPC.MessageEntity> arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> hashMap, boolean z11, int i10, int i11, int i12, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z12) {
            return of(str, str2, messageMedia, tL_photo, videoEditedInfo, user, tL_document, tL_game, tL_messageMediaPoll, tL_messageMediaInvoice, j3, str3, messageObject, messageObject2, webPage, z10, messageObject3, arrayList, replyMarkup, hashMap, z11, i10, i11, i12, obj, sendAnimationData, z12, false);
        }

        public static SendMessageParams of(String str, String str2, TLRPC.MessageMedia messageMedia, TLRPC.TL_photo tL_photo, VideoEditedInfo videoEditedInfo, TLRPC.User user, TLRPC.TL_document tL_document, TLRPC.TL_game tL_game, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.TL_messageMediaInvoice tL_messageMediaInvoice, long j3, String str3, MessageObject messageObject, MessageObject messageObject2, TLRPC.WebPage webPage, boolean z10, MessageObject messageObject3, ArrayList<TLRPC.MessageEntity> arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap<String, String> hashMap, boolean z11, int i10, int i11, int i12, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z12, boolean z13) {
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
            sendMessageParams.peer = j3;
            sendMessageParams.path = str3;
            sendMessageParams.replyToMsg = messageObject;
            sendMessageParams.replyToTopMsg = messageObject2;
            sendMessageParams.webPage = webPage;
            sendMessageParams.searchLinks = z10;
            sendMessageParams.retryMessageObject = messageObject3;
            sendMessageParams.entities = arrayList;
            sendMessageParams.replyMarkup = replyMarkup;
            sendMessageParams.params = hashMap;
            sendMessageParams.notify = z11;
            sendMessageParams.scheduleDate = i10;
            sendMessageParams.scheduleRepeatPeriod = i11;
            sendMessageParams.ttl = i12;
            sendMessageParams.parentObject = obj;
            sendMessageParams.sendAnimationData = sendAnimationData;
            sendMessageParams.updateStickersOrder = z12;
            sendMessageParams.hasMediaSpoilers = z13;
            return sendMessageParams;
        }
    }

    public static class SendingMediaInfo {
        public boolean canDeleteAfter;
        public String caption;
        public String coverPath;
        public TLRPC.Photo coverPhoto;
        public boolean discardLivePhoto;
        public TLRPC.VideoSize emojiMarkup;
        public ArrayList<TLRPC.MessageEntity> entities;
        public boolean forceImage;
        public boolean hasMediaSpoilers;
        public boolean highQuality;
        public String imagePath;
        public TLRPC.BotInlineResult inlineResult;
        public boolean isLivePhoto;
        public boolean isVideo;
        public long livePhotoTimestampUs;
        public long livePhotoVideoOffset;
        public ArrayList<TLRPC.InputDocument> masks;
        public MediaController.PhotoEntry originalPhotoEntry;
        public String paintPath;
        public HashMap<String, String> params;
        public String path;
        public int pollIndex;
        public MediaController.SearchImage searchImage;
        public long stars;
        public String thumbPath;
        public int ttl;
        public boolean updateStickersOrder;
        public Uri uri;
        public VideoEditedInfo videoEditedInfo;
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        mediaSendThreadPool = new ThreadPoolExecutor(availableProcessors, availableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        Instance = new SendMessagesHelper[4];
    }

    public SendMessagesHelper(int i10) {
        super(i10);
        this.delayedMessages = new HashMap<>();
        this.unsentMessages = new SparseArray<>();
        this.sendingMessages = new SparseArray<>();
        this.editingMessages = new SparseArray<>();
        this.uploadMessages = new SparseArray<>();
        this.sendingMessagesIdDialogs = new a0.i();
        this.uploadingMessagesIdDialogs = new a0.i();
        this.waitingForLocation = new HashMap<>();
        this.waitingForCallback = new HashMap<>();
        this.waitingForCallbackMap = new HashMap<>();
        this.waitingForVote = new HashMap<>();
        this.voteSendTime = new a0.i();
        this.importingHistoryFiles = new HashMap<>();
        this.importingHistoryMap = new a0.i();
        this.importingStickersFiles = new HashMap<>();
        this.importingStickersMap = new HashMap<>();
        this.locationProvider = new LocationProvider(new LocationProvider.LocationProviderDelegate() {
            {
                SendMessagesHelper.this = this;
            }

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
        AndroidUtilities.runOnUIThread(new dh(this, 12));
    }

    private void applyMonoForumPeerId(TLRPC.TL_messages_sendInlineBotResult tL_messages_sendInlineBotResult, long j3) {
        if (j3 != 0) {
            TLRPC.InputPeer inputPeer = getMessagesController().getInputPeer(j3);
            TLRPC.InputReplyTo inputReplyTo = tL_messages_sendInlineBotResult.reply_to;
            if (inputReplyTo != null) {
                if (inputReplyTo instanceof TLRPC.TL_inputReplyToMessage) {
                    inputReplyTo.monoforum_peer_id = inputPeer;
                    inputReplyTo.flags |= 32;
                    return;
                }
                return;
            }
            TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
            tL_messages_sendInlineBotResult.reply_to = tL_inputReplyToMonoForum;
            tL_inputReplyToMonoForum.monoforum_peer_id = inputPeer;
            tL_messages_sendInlineBotResult.flags |= 1;
        }
    }

    public static int canSendMessageToChat(TLRPC.Chat chat, MessageObject messageObject) {
        boolean z10;
        boolean canSendStickers = ChatObject.canSendStickers(chat);
        boolean canSendPhoto = ChatObject.canSendPhoto(chat);
        boolean canSendVideo = ChatObject.canSendVideo(chat);
        boolean canSendDocument = ChatObject.canSendDocument(chat);
        ChatObject.canSendEmbed(chat);
        boolean canSendPolls = ChatObject.canSendPolls(chat);
        boolean canSendRoundVideo = ChatObject.canSendRoundVideo(chat);
        boolean canSendVoice = ChatObject.canSendVoice(chat);
        boolean canSendMusic = ChatObject.canSendMusic(chat);
        if (!messageObject.isSticker() && !messageObject.isAnimatedSticker() && !messageObject.isGif() && !messageObject.isGame()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!canSendStickers && z10) {
            if (!ChatObject.isActionBannedByDefault(chat, 8)) {
                return 1;
            }
            return 4;
        } else if (!canSendPhoto && (messageObject.messageOwner.media instanceof TLRPC.TL_messageMediaPhoto) && !messageObject.isVideo() && !z10) {
            if (ChatObject.isActionBannedByDefault(chat, 16)) {
                return 10;
            }
            return 12;
        } else if (!canSendMusic && messageObject.isMusic()) {
            if (!ChatObject.isActionBannedByDefault(chat, 18)) {
                return 20;
            }
            return 19;
        } else if (!canSendVideo && messageObject.isVideo() && !z10) {
            if (ChatObject.isActionBannedByDefault(chat, 17)) {
                return 9;
            }
            return 11;
        } else if (!canSendPolls && (messageObject.messageOwner.media instanceof TLRPC.TL_messageMediaPoll)) {
            if (ChatObject.isActionBannedByDefault(chat, 10)) {
                return 6;
            }
            return 3;
        } else if (!canSendPolls && (messageObject.messageOwner.media instanceof TLRPC.TL_messageMediaToDo)) {
            if (ChatObject.isActionBannedByDefault(chat, 10)) {
                return 21;
            }
            return 22;
        } else if (!canSendVoice && MessageObject.isVoiceMessage(messageObject.messageOwner)) {
            if (ChatObject.isActionBannedByDefault(chat, 20)) {
                return 13;
            }
            return 14;
        } else if (!canSendRoundVideo && MessageObject.isRoundVideoMessage(messageObject.messageOwner)) {
            if (!ChatObject.isActionBannedByDefault(chat, 21)) {
                return 16;
            }
            return 15;
        } else if (canSendDocument || !(messageObject.messageOwner.media instanceof TLRPC.TL_messageMediaDocument) || z10) {
            return 0;
        } else {
            if (!ChatObject.isActionBannedByDefault(chat, 19)) {
                return 18;
            }
            return 17;
        }
    }

    private static boolean checkFileSize(AccountInstance accountInstance, Uri uri) {
        long j3 = 0;
        try {
            AssetFileDescriptor openAssetFileDescriptor = ApplicationLoader.applicationContext.getContentResolver().openAssetFileDescriptor(uri, "r", null);
            if (openAssetFileDescriptor != null) {
                openAssetFileDescriptor.getLength();
            }
            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(uri, new String[]{"_size"}, null, null, null);
            int columnIndex = query.getColumnIndex("_size");
            query.moveToFirst();
            j3 = query.getLong(columnIndex);
            query.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (!FileLoader.checkUploadFileSize(accountInstance.getCurrentAccount(), j3)) {
            return true;
        }
        return false;
    }

    public static boolean checkUpdateStickersOrder(CharSequence charSequence) {
        if (charSequence instanceof Spannable) {
            for (org.telegram.ui.Components.y5 y5Var : (org.telegram.ui.Components.y5[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.y5.class)) {
                if (y5Var.fromEmojiKeyboard) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void clearRichTextParents(TL_iv.RichText richText) {
        if (richText != null) {
            richText.parentRichText = null;
            TL_iv.RichText richText2 = richText.text;
            if (richText2 != null) {
                clearRichTextParents(richText2);
            }
            ArrayList<TL_iv.RichText> arrayList = richText.texts;
            if (arrayList != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    TL_iv.RichText richText3 = arrayList.get(i10);
                    i10++;
                    clearRichTextParents(richText3);
                }
            }
        }
    }

    private static void clearRichTextParentsInBlock(TL_iv.PageBlock pageBlock, IdentityHashMap<Object, Boolean> identityHashMap) {
        Field[] fields;
        Field[] fields2;
        if (pageBlock != null && identityHashMap.put(pageBlock, Boolean.TRUE) == null) {
            for (Field field : pageBlock.getClass().getFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    try {
                        Object obj = field.get(pageBlock);
                        if (obj instanceof TL_iv.RichText) {
                            clearRichTextParents((TL_iv.RichText) obj);
                        } else if (obj instanceof TL_iv.PageBlock) {
                            clearRichTextParentsInBlock((TL_iv.PageBlock) obj, identityHashMap);
                        } else if (obj instanceof TL_iv.PageCaption) {
                            clearRichTextParents(((TL_iv.PageCaption) obj).text);
                            clearRichTextParents(((TL_iv.PageCaption) obj).credit);
                        } else if (obj instanceof List) {
                            for (Object obj2 : (List) obj) {
                                if (obj2 instanceof TL_iv.PageBlock) {
                                    clearRichTextParentsInBlock((TL_iv.PageBlock) obj2, identityHashMap);
                                } else if (obj2 instanceof TL_iv.RichText) {
                                    clearRichTextParents((TL_iv.RichText) obj2);
                                } else if ((obj2 instanceof TL_iv.PageListItem) || (obj2 instanceof TL_iv.PageListOrderedItem)) {
                                    for (Field field2 : obj2.getClass().getFields()) {
                                        if (!Modifier.isStatic(field2.getModifiers())) {
                                            try {
                                                Object obj3 = field2.get(obj2);
                                                if (obj3 instanceof TL_iv.RichText) {
                                                    clearRichTextParents((TL_iv.RichText) obj3);
                                                } else if (obj3 instanceof List) {
                                                    for (Object obj4 : (List) obj3) {
                                                        if (obj4 instanceof TL_iv.PageBlock) {
                                                            clearRichTextParentsInBlock((TL_iv.PageBlock) obj4, identityHashMap);
                                                        }
                                                    }
                                                }
                                            } catch (IllegalAccessException unused) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (IllegalAccessException unused2) {
                    }
                }
            }
        }
    }

    private ArrayList<TLRPC.DocumentAttribute> copyAttributesForSecretChat(ArrayList<TLRPC.DocumentAttribute> arrayList) {
        ArrayList<TLRPC.DocumentAttribute> arrayList2 = new ArrayList<>();
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i10);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    TLRPC.TL_documentAttributeVideo_layer159 tL_documentAttributeVideo_layer159 = new TLRPC.TL_documentAttributeVideo_layer159();
                    tL_documentAttributeVideo_layer159.flags = documentAttribute.flags;
                    tL_documentAttributeVideo_layer159.round_message = documentAttribute.round_message;
                    tL_documentAttributeVideo_layer159.supports_streaming = documentAttribute.supports_streaming;
                    tL_documentAttributeVideo_layer159.duration = documentAttribute.duration;
                    tL_documentAttributeVideo_layer159.f17202w = documentAttribute.f17202w;
                    tL_documentAttributeVideo_layer159.h = documentAttribute.h;
                    arrayList2.add(tL_documentAttributeVideo_layer159);
                } else {
                    arrayList2.add(documentAttribute);
                }
            }
        }
        return arrayList2;
    }

    private static void copyRange(File file, long j3, long j10, File file2) {
        FileChannel channel = new FileInputStream(file).getChannel();
        try {
            FileChannel channel2 = new FileOutputStream(file2).getChannel();
            channel.position(j3);
            ByteBuffer allocate = ByteBuffer.allocate(262144);
            while (j10 > 0) {
                allocate.clear();
                allocate.limit((int) Math.min(allocate.capacity(), j10));
                int read = channel.read(allocate);
                if (read <= 0) {
                    break;
                }
                allocate.flip();
                channel2.write(allocate);
                j10 -= read;
            }
            channel2.force(true);
            channel2.close();
            channel.close();
        } catch (Throwable th2) {
            if (channel != null) {
                try {
                    channel.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    private static VideoEditedInfo createCompressionSettings(String str, long j3) {
        int i10;
        float f7;
        int[] iArr = new int[11];
        AnimatedFileNative.d(str, iArr, j3);
        if (iArr[0] == 0) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("video hasn't avc1 atom");
                return null;
            }
            return null;
        }
        long length = new File(str).length();
        int videoBitrate = MediaController.getVideoBitrate(str);
        if (videoBitrate == -1) {
            videoBitrate = iArr[3];
        }
        float f10 = iArr[4];
        long j10 = iArr[5];
        int i11 = iArr[7];
        VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
        videoEditedInfo.startTime = -1L;
        videoEditedInfo.endTime = -1L;
        videoEditedInfo.bitrate = videoBitrate;
        videoEditedInfo.originalPath = str;
        videoEditedInfo.videoOffset = j3;
        videoEditedInfo.framerate = i11;
        videoEditedInfo.estimatedDuration = (long) Math.ceil(f10);
        boolean z10 = true;
        int i12 = iArr[1];
        videoEditedInfo.originalWidth = i12;
        videoEditedInfo.resultWidth = i12;
        int i13 = iArr[2];
        videoEditedInfo.originalHeight = i13;
        videoEditedInfo.resultHeight = i13;
        videoEditedInfo.rotationValue = iArr[8];
        videoEditedInfo.originalDuration = f10 * 1000.0f;
        float max = Math.max(i12, i13);
        float f11 = 640.0f;
        if (max > 1280.0f) {
            i10 = 4;
        } else if (max > 854.0f) {
            i10 = 3;
        } else if (max > 640.0f) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        int round = Math.round(DownloadController.getInstance(UserConfig.selectedAccount).getMaxVideoBitrate() / (100.0f / i10));
        if (round > i10) {
            round = i10;
        }
        if (new File(str).length() < 1048576000) {
            if (round == i10 && Math.max(videoEditedInfo.originalWidth, videoEditedInfo.originalHeight) <= 1280) {
                z10 = false;
            } else {
                if (round != 1) {
                    if (round != 2) {
                        if (round != 3) {
                            f11 = 1280.0f;
                        } else {
                            f11 = 848.0f;
                        }
                    }
                } else {
                    f11 = 432.0f;
                }
                int i14 = videoEditedInfo.originalWidth;
                int i15 = videoEditedInfo.originalHeight;
                if (i14 > i15) {
                    f7 = i14;
                } else {
                    f7 = i15;
                }
                float f12 = f11 / f7;
                videoEditedInfo.resultWidth = Math.round((i14 * f12) / 2.0f) * 2;
                videoEditedInfo.resultHeight = Math.round((videoEditedInfo.originalHeight * f12) / 2.0f) * 2;
            }
            videoBitrate = MediaController.makeVideoBitrate(videoEditedInfo.originalHeight, videoEditedInfo.originalWidth, videoBitrate, videoEditedInfo.resultHeight, videoEditedInfo.resultWidth);
        } else {
            z10 = false;
        }
        if (!z10) {
            videoEditedInfo.resultWidth = videoEditedInfo.originalWidth;
            videoEditedInfo.resultHeight = videoEditedInfo.originalHeight;
            videoEditedInfo.bitrate = videoBitrate;
            videoEditedInfo.estimatedSize = length;
        } else {
            videoEditedInfo.bitrate = videoBitrate;
            videoEditedInfo.estimatedSize = a4.a.A(f10 / 1000.0f, MediaController.extractRealEncoderBitrate(videoEditedInfo.resultWidth, videoEditedInfo.resultHeight, videoBitrate, false), 8.0f, (float) j10);
        }
        if (videoEditedInfo.estimatedSize == 0) {
            videoEditedInfo.estimatedSize = 1L;
        }
        return videoEditedInfo;
    }

    public static Bitmap createVideoThumbnail(String str, int i10) {
        float f7;
        if (i10 == 2) {
            f7 = 1920.0f;
        } else if (i10 == 3) {
            f7 = 96.0f;
        } else {
            f7 = 512.0f;
        }
        Bitmap createVideoThumbnailAtTime = createVideoThumbnailAtTime(str, 0L);
        if (createVideoThumbnailAtTime != null) {
            int width = createVideoThumbnailAtTime.getWidth();
            int height = createVideoThumbnailAtTime.getHeight();
            float f10 = width;
            if (f10 > f7 || height > f7) {
                float max = Math.max(width, height) / f7;
                return Bitmap.createScaledBitmap(createVideoThumbnailAtTime, (int) (f10 / max), (int) (height / max), true);
            }
            return createVideoThumbnailAtTime;
        }
        return createVideoThumbnailAtTime;
    }

    public static Bitmap createVideoThumbnailAtTime(String str, long j3) {
        return createVideoThumbnailAtTime(str, j3, null, false);
    }

    public static void ensureMediaThumbExists(AccountInstance accountInstance, boolean z10, TLObject tLObject, String str, Uri uri, long j3) {
        ensureMediaThumbExists(accountInstance, z10, tLObject, str, uri, j3, false);
    }

    public static void fillVideoAttribute(String str, TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo, VideoEditedInfo videoEditedInfo) {
        MediaMetadataRetriever mediaMetadataRetriever;
        MediaMetadataRetriever mediaMetadataRetriever2 = 0;
        try {
            try {
                mediaMetadataRetriever = new MediaMetadataRetriever();
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            mediaMetadataRetriever.setDataSource(str);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
            if (extractMetadata != null) {
                tL_documentAttributeVideo.f17202w = Integer.parseInt(extractMetadata);
            }
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
            if (extractMetadata2 != null) {
                tL_documentAttributeVideo.h = Integer.parseInt(extractMetadata2);
            }
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(9);
            if (extractMetadata3 != null) {
                tL_documentAttributeVideo.duration = Long.parseLong(extractMetadata3) / 1000.0d;
            }
            String extractMetadata4 = mediaMetadataRetriever.extractMetadata(24);
            if (extractMetadata4 != null) {
                int intValue = Utilities.parseInt((CharSequence) extractMetadata4).intValue();
                if (videoEditedInfo != null) {
                    videoEditedInfo.rotationValue = intValue;
                } else if (intValue == 90 || intValue == 270) {
                    int i10 = tL_documentAttributeVideo.f17202w;
                    tL_documentAttributeVideo.f17202w = tL_documentAttributeVideo.h;
                    tL_documentAttributeVideo.h = i10;
                }
            }
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        } catch (Exception e10) {
            e = e10;
            mediaMetadataRetriever2 = mediaMetadataRetriever;
            FileLog.e(e);
            if (mediaMetadataRetriever2 != 0) {
                try {
                    mediaMetadataRetriever2.release();
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
            }
            try {
                MediaPlayer create = MediaPlayer.create(ApplicationLoader.applicationContext, Uri.fromFile(new File(str)));
                if (create != null) {
                    mediaMetadataRetriever2 = create.getDuration() / 1000.0d;
                    tL_documentAttributeVideo.duration = mediaMetadataRetriever2;
                    tL_documentAttributeVideo.f17202w = create.getVideoWidth();
                    tL_documentAttributeVideo.h = create.getVideoHeight();
                    create.release();
                }
            } catch (Exception e12) {
                FileLog.e(e12);
            }
        } catch (Throwable th3) {
            th = th3;
            mediaMetadataRetriever2 = mediaMetadataRetriever;
            if (mediaMetadataRetriever2 != null) {
                try {
                    mediaMetadataRetriever2.release();
                } catch (Exception e13) {
                    FileLog.e(e13);
                }
            }
            throw th;
        }
    }

    private DelayedMessage findMaxDelayedMessageForMessageId(int i10, long j3) {
        int i11;
        DelayedMessage delayedMessage = null;
        int i12 = Integer.MIN_VALUE;
        for (Map.Entry<String, ArrayList<DelayedMessage>> entry : this.delayedMessages.entrySet()) {
            ArrayList<DelayedMessage> value = entry.getValue();
            int size = value.size();
            for (int i13 = 0; i13 < size; i13++) {
                DelayedMessage delayedMessage2 = value.get(i13);
                int i14 = delayedMessage2.type;
                if ((i14 == 4 || i14 == 0) && delayedMessage2.peer == j3) {
                    MessageObject messageObject = delayedMessage2.obj;
                    if (messageObject != null) {
                        i11 = messageObject.getId();
                    } else {
                        ArrayList<MessageObject> arrayList = delayedMessage2.messageObjects;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            i11 = ((MessageObject) hc.b.i(1, delayedMessage2.messageObjects)).getId();
                        } else {
                            i11 = 0;
                        }
                    }
                    if (i11 != 0 && i11 > i10 && delayedMessage == null && i12 < i11) {
                        delayedMessage = delayedMessage2;
                        i12 = i11;
                    }
                }
            }
        }
        return delayedMessage;
    }

    private static void finishGroup(AccountInstance accountInstance, long j3, int i10) {
        AndroidUtilities.runOnUIThread(new t5(accountInstance, j3, i10, 4));
    }

    public static SendMessagesHelper getInstance(int i10) {
        SendMessagesHelper sendMessagesHelper;
        SendMessagesHelper sendMessagesHelper2 = Instance[i10];
        if (sendMessagesHelper2 == null) {
            synchronized (SendMessagesHelper.class) {
                try {
                    sendMessagesHelper = Instance[i10];
                    if (sendMessagesHelper == null) {
                        SendMessagesHelper[] sendMessagesHelperArr = Instance;
                        SendMessagesHelper sendMessagesHelper3 = new SendMessagesHelper(i10);
                        sendMessagesHelperArr[i10] = sendMessagesHelper3;
                        sendMessagesHelper = sendMessagesHelper3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return sendMessagesHelper;
        }
        return sendMessagesHelper2;
    }

    public static String getKeyForPhotoSize(AccountInstance accountInstance, TLRPC.PhotoSize photoSize, Bitmap[] bitmapArr, boolean z10, boolean z11) {
        String str;
        if (photoSize == null || photoSize.location == null) {
            return null;
        }
        PointF C2 = org.telegram.ui.Cells.t1.C2(photoSize.f17220w, photoSize.h, 0, 0);
        if (bitmapArr != null) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                File pathToAttach = FileLoader.getInstance(accountInstance.getCurrentAccount()).getPathToAttach(photoSize, z11);
                FileInputStream fileInputStream = new FileInputStream(pathToAttach);
                BitmapFactory.decodeStream(fileInputStream, null, options);
                fileInputStream.close();
                float max = Math.max(options.outWidth / C2.x, options.outHeight / C2.y);
                if (max < 1.0f) {
                    max = 1.0f;
                }
                options.inJustDecodeBounds = false;
                options.inSampleSize = (int) max;
                options.inPreferredConfig = Bitmap.Config.RGB_565;
                FileInputStream fileInputStream2 = new FileInputStream(pathToAttach);
                bitmapArr[0] = BitmapFactory.decodeStream(fileInputStream2, null, options);
                fileInputStream2.close();
            } catch (Throwable unused) {
            }
        }
        Locale locale = Locale.US;
        if (z10) {
            str = "%d_%d@%d_%d_b";
        } else {
            str = "%d_%d@%d_%d";
        }
        return String.format(locale, str, Long.valueOf(photoSize.location.volume_id), Integer.valueOf(photoSize.location.local_id), Integer.valueOf((int) (C2.x / AndroidUtilities.density)), Integer.valueOf((int) (C2.y / AndroidUtilities.density)));
    }

    private TLRPC.PhotoSize getThumbForSecretChat(ArrayList<TLRPC.PhotoSize> arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.PhotoSize photoSize = arrayList.get(i10);
                if (photoSize != null && !(photoSize instanceof TLRPC.TL_photoPathSize) && !(photoSize instanceof TLRPC.TL_photoSizeEmpty) && photoSize.location != null) {
                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                        return photoSize;
                    }
                    TLRPC.TL_photoSize_layer127 tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
                    tL_photoSize_layer127.type = photoSize.type;
                    tL_photoSize_layer127.f17220w = photoSize.f17220w;
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

    public static String getTrimmedString(String str) {
        String trim = str.trim();
        if (trim.length() == 0) {
            return trim;
        }
        while (str.startsWith("\n")) {
            str = str.substring(1);
        }
        while (str.endsWith("\n")) {
            str = com.google.android.gms.internal.vision.e2.h(1, 0, str);
        }
        return str;
    }

    private static void handleError(int i10, AccountInstance accountInstance) {
        if (i10 != 0) {
            AndroidUtilities.runOnUIThread(new u6(i10, accountInstance, 10));
        }
    }

    public void lambda$deletePollOption$27(TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates != null) {
            getMessagesController().processUpdates(updates, false);
        }
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
            delayedMessage.photoSize = (TLRPC.PhotoSize) hc.b.i(1, tL_photo.sizes);
            delayedMessage.locationParent = tL_photo;
            delayedMessage.httpLocation = null;
            if (delayedMessage.type == 4) {
                delayedMessage.performMediaUpload = true;
                performSendDelayedMessage(delayedMessage, delayedMessage.messageObjects.indexOf(messageObject));
                return;
            }
            performSendDelayedMessage(delayedMessage);
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder v = a4.a.v("can't load image ", str, " to file ");
            v.append(file.toString());
            FileLog.e(v.toString());
        }
        delayedMessage.markAsError();
    }

    public void lambda$didReceivedNotification$2(File file, MessageObject messageObject, DelayedMessage delayedMessage, String str) {
        AndroidUtilities.runOnUIThread(new a0(this, generatePhotoSizes(file.toString(), null), messageObject, file, delayedMessage, str, 11));
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

    public void lambda$didReceivedNotification$4(DelayedMessage delayedMessage, File file, MessageObject messageObject) {
        TLRPC.Document document = delayedMessage.obj.getDocument();
        boolean z10 = false;
        if (document.thumbs.isEmpty() || (document.thumbs.get(0).location instanceof TLRPC.TL_fileLocationUnavailable)) {
            try {
                Bitmap loadBitmap = ImageLoader.loadBitmap(file.getAbsolutePath(), null, 90.0f, 90.0f, true);
                if (loadBitmap != null) {
                    document.thumbs.clear();
                    ArrayList<TLRPC.PhotoSize> arrayList = document.thumbs;
                    if (delayedMessage.sendEncryptedRequest != null) {
                        z10 = true;
                    }
                    arrayList.add(ImageLoader.scaleAndSaveImage(loadBitmap, 90.0f, 90.0f, 55, z10));
                    loadBitmap.recycle();
                }
            } catch (Exception e) {
                document.thumbs.clear();
                FileLog.e(e);
            }
        }
        AndroidUtilities.runOnUIThread(new g5(this, delayedMessage, file, document, messageObject, 17));
    }

    public void lambda$editMessage$20(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.p2 p2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage) {
        org.telegram.ui.Components.d5.f0(this.currentAccount, tL_error, p2Var, tL_messages_editMessage, new Object[0]);
    }

    public void lambda$editMessage$21(org.telegram.ui.ActionBar.p2 p2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
        } else {
            AndroidUtilities.runOnUIThread(new zi(this, tL_error, p2Var, tL_messages_editMessage, 1));
        }
    }

    public static void lambda$finishGroup$117(AccountInstance accountInstance, long j3, int i10) {
        int i11;
        SendMessagesHelper sendMessagesHelper = accountInstance.getSendMessagesHelper();
        HashMap<String, ArrayList<DelayedMessage>> hashMap = sendMessagesHelper.delayedMessages;
        ArrayList<DelayedMessage> arrayList = hashMap.get("group_" + j3);
        if (arrayList != null && !arrayList.isEmpty()) {
            DelayedMessage delayedMessage = arrayList.get(0);
            MessageObject messageObject = (MessageObject) hc.b.i(1, delayedMessage.messageObjects);
            delayedMessage.finalGroupMessage = messageObject.getId();
            messageObject.messageOwner.params.put("final", "1");
            TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
            tL_messages_messages.messages.add(messageObject.messageOwner);
            if (!delayedMessage.paidMedia && !delayedMessage.pollMedia) {
                MessagesStorage messagesStorage = accountInstance.getMessagesStorage();
                long j10 = delayedMessage.peer;
                if (i10 != 0) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                messagesStorage.putMessages((TLRPC.messages_Messages) tL_messages_messages, j10, -2, 0, false, i11, 0L);
            }
            sendMessagesHelper.sendReadyToSendGroup(delayedMessage, true, true);
        }
    }

    public static void lambda$handleError$119(int i10, AccountInstance accountInstance) {
        try {
            if (i10 == 1) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.UnsupportedAttachment));
            } else if (i10 == 2) {
                NotificationCenter.getInstance(accountInstance.getCurrentAccount()).lambda$postNotificationNameOnUIThread$1(NotificationCenter.currentUserShowLimitReachedDialog, 6);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
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

    public void lambda$performSendDelayedMessage$49(TLObject tLObject, DelayedMessage delayedMessage) {
        if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
            tL_inputMediaUploadedPhoto.live_photo = true;
            tL_inputMediaUploadedPhoto.file = delayedMessage.coverFile;
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_inputMediaUploadedPhoto.video = tL_inputDocument;
            TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject).document;
            tL_inputDocument.f17207id = document.f17201id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            TLObject tLObject2 = delayedMessage.sendRequest;
            if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
                ((TLRPC.TL_messages_sendMedia) tLObject2).media = tL_inputMediaUploadedPhoto;
            } else if (tLObject2 instanceof TL_ephemeral.TL_sendMessage) {
                ((TL_ephemeral.TL_sendMessage) tLObject2).media = tL_inputMediaUploadedPhoto;
            } else if (tLObject2 instanceof TLRPC.TL_messages_addPollAnswer) {
                ((TLRPC.TL_messages_addPollAnswer) tLObject2).answer.input_media = tL_inputMediaUploadedPhoto;
            } else {
                ((TLRPC.TL_messages_editMessage) tLObject2).media = tL_inputMediaUploadedPhoto;
            }
            performSendMessageRequest(tLObject2, delayedMessage.obj, delayedMessage.originalPath, delayedMessage, delayedMessage.parentObject, null, delayedMessage.scheduled);
            return;
        }
        delayedMessage.markAsError();
    }

    public void lambda$performSendDelayedMessage$50(DelayedMessage delayedMessage, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new g9(this, tLObject, delayedMessage, 24));
    }

    public void lambda$performSendDelayedMessage$51(TLObject tLObject, TLRPC.InputMedia inputMedia, DelayedMessage delayedMessage) {
        TLRPC.PhotoSize photoSize;
        MessageObject messageObject;
        VideoEditedInfo videoEditedInfo;
        if (tLObject instanceof TLRPC.TL_messageMediaPhoto) {
            TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) tLObject).photo;
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputPhoto.f17214id = photo.f17219id;
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

    public void lambda$performSendDelayedMessage$52(TLRPC.InputMedia inputMedia, DelayedMessage delayedMessage, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new xj(this, tLObject, inputMedia, delayedMessage, 1));
    }

    public void lambda$performSendDelayedMessage$53(TLObject tLObject, TLRPC.InputFile inputFile, TLRPC.InputMedia inputMedia, DelayedMessage delayedMessage, int i10, String str) {
        if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
            tL_inputMediaUploadedPhoto.live_photo = true;
            tL_inputMediaUploadedPhoto.file = inputFile;
            tL_inputMediaUploadedPhoto.spoiler = inputMedia.spoiler;
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_inputMediaUploadedPhoto.video = tL_inputDocument;
            TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject).document;
            tL_inputDocument.f17207id = document.f17201id;
            tL_inputDocument.access_hash = document.access_hash;
            byte[] bArr = document.file_reference;
            tL_inputDocument.file_reference = bArr;
            if (bArr == null) {
                tL_inputDocument.file_reference = new byte[0];
            }
            TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) delayedMessage.sendRequest;
            if (i10 >= 0 && i10 < tL_messages_sendMultiMedia.multi_media.size()) {
                tL_messages_sendMultiMedia.multi_media.get(i10).media = tL_inputMediaUploadedPhoto;
            }
            ArrayList<TLRPC.InputMedia> arrayList = delayedMessage.inputMedias;
            if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
                delayedMessage.inputMedias.set(i10, tL_inputMediaUploadedPhoto);
            }
            delayedMessage.coverFile = null;
            delayedMessage.coverPhotoSize = null;
            HashMap<Object, Object> hashMap = delayedMessage.extraHashMap;
            if (hashMap != null) {
                hashMap.remove(str + "_ct");
            }
            uploadMultiMedia(delayedMessage, tL_inputMediaUploadedPhoto, null, str);
            return;
        }
        delayedMessage.markAsError();
    }

    public void lambda$performSendDelayedMessage$54(TLRPC.InputFile inputFile, TLRPC.InputMedia inputMedia, DelayedMessage delayedMessage, int i10, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new fg.f1(this, tLObject, inputFile, inputMedia, delayedMessage, i10, str));
    }

    public void lambda$performSendDelayedMessage$55(TLObject tLObject, TLRPC.InputMedia inputMedia, DelayedMessage delayedMessage, String str, MessageObject messageObject) {
        if (tLObject instanceof TLRPC.TL_messageMediaPhoto) {
            TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) tLObject).photo;
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputPhoto.f17214id = photo.f17219id;
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
            HashMap<Object, Object> hashMap = delayedMessage.extraHashMap;
            if (hashMap != null) {
                hashMap.remove(str + "_ct");
            }
            int indexOf = delayedMessage.messageObjects.indexOf(messageObject);
            ArrayList<TLRPC.InputMedia> arrayList = delayedMessage.inputMedias;
            if (arrayList != null && indexOf >= 0 && indexOf < arrayList.size()) {
                TLRPC.InputMedia inputMedia2 = delayedMessage.inputMedias.get(indexOf);
                if (inputMedia2 instanceof TLRPC.TL_inputMediaUploadedDocument) {
                    inputMedia2.flags |= 64;
                    inputMedia2.video_cover = tL_inputPhoto;
                }
            }
            HashMap<Object, Object> hashMap2 = delayedMessage.extraHashMap;
            if (hashMap2 != null) {
                if (hashMap2.containsKey(str + "_t")) {
                    photoSize = (TLRPC.PhotoSize) delayedMessage.extraHashMap.get(str + "_t");
                }
            }
            delayedMessage.photoSize = photoSize;
            if (inputMedia.thumb == null && photoSize != null && photoSize.location != null) {
                delayedMessage.performMediaUpload = true;
                performSendDelayedMessage(delayedMessage, indexOf);
                return;
            }
            sendReadyToSendGroup(delayedMessage, false, true);
            return;
        }
        delayedMessage.markAsError();
    }

    public void lambda$performSendDelayedMessage$56(TLRPC.InputMedia inputMedia, DelayedMessage delayedMessage, String str, MessageObject messageObject, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new a0(this, tLObject, inputMedia, delayedMessage, str, messageObject, 9));
    }

    public void lambda$performSendDelayedMessage$57(TLObject tLObject, DelayedMessage delayedMessage, String str) {
        boolean z10;
        if (tLObject != null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            getMediaDataController().storeTempStickerSet(tL_messages_stickerSet);
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            ((TLRPC.TL_documentAttributeSticker_layer55) delayedMessage.locationParent).stickerset = tL_inputStickerSetShortName;
            tL_inputStickerSetShortName.short_name = tL_messages_stickerSet.set.short_name;
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList<DelayedMessage> remove = this.delayedMessages.remove(str);
        if (remove != null && !remove.isEmpty()) {
            if (z10) {
                getMessagesStorage().replaceMessageIfExists(remove.get(0).obj.messageOwner, null, null, false);
            }
            MessageObject messageObject = delayedMessage.obj;
            getSecretChatHelper().performSendEncryptedRequest((TLRPC.DecryptedMessage) delayedMessage.sendEncryptedRequest, messageObject.messageOwner, delayedMessage.encryptedChat, null, null, messageObject);
        }
    }

    public void lambda$performSendDelayedMessage$58(DelayedMessage delayedMessage, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ii(this, tLObject, delayedMessage, str, 1));
    }

    public void lambda$performSendMessageRequest$100(boolean z10, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, HashMap hashMap, String str, TLObject tLObject2) {
        SendMessagesHelper sendMessagesHelper;
        ?? r22;
        MessageObject messageObject2;
        TLObject tLObject3;
        String str2;
        char c10;
        int i10;
        ArrayList arrayList;
        long j3;
        boolean z11;
        int i11;
        ?? r62;
        int i12;
        int i13;
        ArrayList<TL_ephemeral.EphemeralMessage> arrayList2;
        ArrayList<TLRPC.Update> arrayList3;
        TLRPC.MessageReplyHeader messageReplyHeader;
        ArrayList<TLRPC.Update> arrayList4;
        a0.i iVar;
        boolean z12;
        TLRPC.Message message2 = message;
        int i14 = 0;
        if (tL_error == null) {
            int i15 = message2.f17216id;
            ArrayList arrayList5 = new ArrayList();
            boolean z13 = message2.date == 2147483646;
            if (tLObject instanceof TLRPC.TL_updateShortSentMessage) {
                TLRPC.TL_updateShortSentMessage tL_updateShortSentMessage = (TLRPC.TL_updateShortSentMessage) tLObject;
                i10 = i15;
                j3 = 0;
                arrayList = arrayList5;
                c10 = 2;
                updateMediaPaths(messageObject, null, tL_updateShortSentMessage.f17341id, null, false, hashMap);
                sendMessagesHelper = this;
                int mediaExistanceFlags = messageObject.getMediaExistanceFlags();
                int i16 = tL_updateShortSentMessage.f17341id;
                message2.f17216id = i16;
                message2.local_id = i16;
                message2.date = tL_updateShortSentMessage.date;
                message2.entities = tL_updateShortSentMessage.entities;
                message2.out = tL_updateShortSentMessage.out;
                if ((tL_updateShortSentMessage.flags & 33554432) != 0) {
                    message2.ttl_period = tL_updateShortSentMessage.ttl_period;
                    message2.flags |= 33554432;
                }
                TLRPC.MessageMedia messageMedia = tL_updateShortSentMessage.media;
                if (messageMedia != null) {
                    message2.media = messageMedia;
                    message2.flags |= 512;
                    ImageLoader.saveMessageThumbs(message2);
                }
                TLRPC.MessageMedia messageMedia2 = tL_updateShortSentMessage.media;
                if (((messageMedia2 instanceof TLRPC.TL_messageMediaGame) || (messageMedia2 instanceof TLRPC.TL_messageMediaInvoice)) && !TextUtils.isEmpty(tL_updateShortSentMessage.message)) {
                    message2.message = tL_updateShortSentMessage.message;
                }
                if (!message2.entities.isEmpty()) {
                    message2.flags |= 128;
                }
                Integer num = sendMessagesHelper.getMessagesController().dialogs_read_outbox_max.get(Long.valueOf(message2.dialog_id));
                if (num == null) {
                    num = Integer.valueOf(sendMessagesHelper.getMessagesStorage().getDialogReadMax(message2.out, message2.dialog_id));
                    sendMessagesHelper.getMessagesController().dialogs_read_outbox_max.put(Long.valueOf(message2.dialog_id), num);
                }
                message2.unread = num.intValue() < message2.f17216id;
                Utilities.stageQueue.postRunnable(new eh(8, sendMessagesHelper, tL_updateShortSentMessage));
                arrayList.add(message2);
                messageObject2 = messageObject;
                i11 = mediaExistanceFlags;
                z11 = false;
            } else {
                c10 = 2;
                i10 = i15;
                arrayList = arrayList5;
                j3 = 0;
                sendMessagesHelper = this;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList<TLRPC.Update> arrayList6 = updates.updates;
                    ArrayList<TL_ephemeral.EphemeralMessage> arrayList7 = new ArrayList<>();
                    boolean z14 = z10;
                    int i17 = 0;
                    TLRPC.Message message3 = null;
                    a0.i iVar2 = null;
                    while (i17 < arrayList6.size()) {
                        TLRPC.Update update = arrayList6.get(i17);
                        if (update instanceof TL_update.TL_updateNewMessage) {
                            TL_update.TL_updateNewMessage tL_updateNewMessage = (TL_update.TL_updateNewMessage) update;
                            TLRPC.Message message4 = tL_updateNewMessage.message;
                            if (message4.action == null) {
                                arrayList.add(message4);
                                Utilities.stageQueue.postRunnable(new gj(sendMessagesHelper, tL_updateNewMessage, i14));
                                arrayList6.remove(i17);
                                i17--;
                                arrayList2 = arrayList7;
                                message3 = message4;
                                arrayList3 = arrayList6;
                                i17++;
                                i14 = 0;
                                sendMessagesHelper = this;
                                arrayList6 = arrayList3;
                                arrayList7 = arrayList2;
                            }
                        } else if (update instanceof TL_update.TL_updateNewEphemeralMessage) {
                            TL_update.TL_updateNewEphemeralMessage tL_updateNewEphemeralMessage = (TL_update.TL_updateNewEphemeralMessage) update;
                            message3 = xf.u.b(tL_updateNewEphemeralMessage.message);
                            arrayList.add(message3);
                            arrayList7.add(tL_updateNewEphemeralMessage.message);
                            arrayList6.remove(i17);
                            i17--;
                        } else {
                            if (update instanceof TL_update.TL_updateNewChannelMessage) {
                                TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage = (TL_update.TL_updateNewChannelMessage) update;
                                long updateChannelId = MessagesController.getUpdateChannelId(tL_updateNewChannelMessage);
                                TLRPC.Chat chat = sendMessagesHelper.getMessagesController().getChat(Long.valueOf(updateChannelId));
                                if ((chat == null || chat.megagroup) && (messageReplyHeader = tL_updateNewChannelMessage.message.reply_to) != null && (messageReplyHeader.reply_to_top_id != 0 || messageReplyHeader.reply_to_msg_id != 0)) {
                                    if (iVar2 == null) {
                                        iVar2 = new a0.i();
                                    }
                                    long dialogId = MessageObject.getDialogId(tL_updateNewChannelMessage.message);
                                    SparseArray sparseArray = (SparseArray) iVar2.f(dialogId);
                                    if (sparseArray == null) {
                                        sparseArray = new SparseArray();
                                        iVar2.k(sparseArray, dialogId);
                                    }
                                    TLRPC.MessageReplyHeader messageReplyHeader2 = tL_updateNewChannelMessage.message.reply_to;
                                    int i18 = messageReplyHeader2.reply_to_top_id;
                                    if (i18 == 0) {
                                        i18 = messageReplyHeader2.reply_to_msg_id;
                                    }
                                    TLRPC.MessageReplies messageReplies = (TLRPC.MessageReplies) sparseArray.get(i18);
                                    if (messageReplies == null) {
                                        messageReplies = new TLRPC.TL_messageReplies();
                                        sparseArray.put(i18, messageReplies);
                                    }
                                    TLRPC.Peer peer = tL_updateNewChannelMessage.message.from_id;
                                    if (peer != null) {
                                        messageReplies.recent_repliers.add(i14, peer);
                                    }
                                    messageReplies.replies++;
                                }
                                a0.i iVar3 = iVar2;
                                TLRPC.Message message5 = tL_updateNewChannelMessage.message;
                                arrayList.add(message5);
                                Utilities.stageQueue.postRunnable(new hj(sendMessagesHelper, tL_updateNewChannelMessage, i14));
                                arrayList6.remove(i17);
                                int i19 = i17 - 1;
                                if (tL_updateNewChannelMessage.message.pinned) {
                                    arrayList2 = arrayList7;
                                    iVar = iVar3;
                                    arrayList4 = arrayList6;
                                    Utilities.stageQueue.postRunnable(new ij(sendMessagesHelper, tL_updateNewChannelMessage, updateChannelId, 0));
                                } else {
                                    arrayList4 = arrayList6;
                                    arrayList2 = arrayList7;
                                    iVar = iVar3;
                                }
                                message3 = message5;
                                arrayList3 = arrayList4;
                                i17 = i19;
                                iVar2 = iVar;
                            } else {
                                arrayList2 = arrayList7;
                                arrayList3 = arrayList6;
                                if (update instanceof TL_update.TL_updateNewScheduledMessage) {
                                    TL_update.TL_updateNewScheduledMessage tL_updateNewScheduledMessage = (TL_update.TL_updateNewScheduledMessage) update;
                                    int i20 = 0;
                                    while (true) {
                                        if (i20 >= arrayList.size()) {
                                            break;
                                        } else if (((TLRPC.Message) arrayList.get(i20)).f17216id == tL_updateNewScheduledMessage.message.f17216id) {
                                            arrayList.remove(i20);
                                            break;
                                        } else {
                                            i20++;
                                        }
                                    }
                                    message3 = tL_updateNewScheduledMessage.message;
                                    arrayList.add(message3);
                                    arrayList3.remove(i17);
                                    i17--;
                                    z14 = true;
                                } else if (update instanceof TL_update.TL_updateQuickReplyMessage) {
                                    gg.k2.f(sendMessagesHelper.currentAccount).j(update, messageObject.getQuickReplyName(), messageObject.getQuickReplyId());
                                    message3 = ((TL_update.TL_updateQuickReplyMessage) update).message;
                                    arrayList.add(message3);
                                    arrayList3.remove(i17);
                                    i17--;
                                } else if (update instanceof TL_update.TL_updateDeleteScheduledMessages) {
                                    TL_update.TL_updateDeleteScheduledMessages tL_updateDeleteScheduledMessages = (TL_update.TL_updateDeleteScheduledMessages) update;
                                    if (messageObject.getDialogId() == DialogObject.getPeerDialogId(tL_updateDeleteScheduledMessages.peer)) {
                                        ArrayList<Integer> arrayList8 = tL_updateDeleteScheduledMessages.messages;
                                        int size = arrayList8.size();
                                        int i21 = 0;
                                        while (i21 < size) {
                                            Integer num2 = arrayList8.get(i21);
                                            i21++;
                                            int intValue = num2.intValue();
                                            int i22 = 0;
                                            while (true) {
                                                if (i22 >= arrayList.size()) {
                                                    break;
                                                } else if (((TLRPC.Message) arrayList.get(i22)).f17216id == intValue) {
                                                    arrayList.remove(i22);
                                                    break;
                                                } else {
                                                    i22++;
                                                }
                                            }
                                        }
                                        arrayList3.remove(i17);
                                        i17--;
                                    }
                                }
                                i17++;
                                i14 = 0;
                                sendMessagesHelper = this;
                                arrayList6 = arrayList3;
                                arrayList7 = arrayList2;
                            }
                            z14 = false;
                            i17++;
                            i14 = 0;
                            sendMessagesHelper = this;
                            arrayList6 = arrayList3;
                            arrayList7 = arrayList2;
                        }
                        arrayList2 = arrayList7;
                        arrayList3 = arrayList6;
                        i17++;
                        i14 = 0;
                        sendMessagesHelper = this;
                        arrayList6 = arrayList3;
                        arrayList7 = arrayList2;
                    }
                    ArrayList<TL_ephemeral.EphemeralMessage> arrayList9 = arrayList7;
                    ArrayList<TLRPC.Update> arrayList10 = arrayList6;
                    if (arrayList9.isEmpty()) {
                        r62 = 1;
                    } else {
                        r62 = 1;
                        getMessagesStorage().putEphemeralMessages(arrayList9, true);
                    }
                    if (iVar2 != null) {
                        getMessagesStorage().putChannelViews(null, null, iVar2, r62);
                        NotificationCenter notificationCenter = getNotificationCenter();
                        int i23 = NotificationCenter.didUpdateMessagesViews;
                        Object[] objArr = new Object[4];
                        objArr[0] = null;
                        objArr[r62] = null;
                        objArr[2] = iVar2;
                        objArr[3] = Boolean.TRUE;
                        notificationCenter.lambda$postNotificationNameOnUIThread$1(i23, objArr);
                    }
                    if (message3 != null) {
                        MessageObject.getDialogId(message3);
                        if (z13 && message3.date != 2147483646) {
                            z14 = false;
                        }
                        ImageLoader.saveMessageThumbs(message3);
                        if (!z14) {
                            Integer num3 = getMessagesController().dialogs_read_outbox_max.get(Long.valueOf(message3.dialog_id));
                            if (num3 == null) {
                                num3 = Integer.valueOf(getMessagesStorage().getDialogReadMax(message3.out, message3.dialog_id));
                                getMessagesController().dialogs_read_outbox_max.put(Long.valueOf(message3.dialog_id), num3);
                            }
                            message3.unread = num3.intValue() < message3.f17216id;
                        }
                        TLRPC.Message message6 = messageObject.messageOwner;
                        message6.post_author = message3.post_author;
                        if ((message3.flags & 33554432) != 0) {
                            message6.ttl_period = message3.ttl_period;
                            message6.flags |= 33554432;
                        }
                        message6.entities = message3.entities;
                        int i24 = message3.quick_reply_shortcut_id;
                        message6.quick_reply_shortcut_id = i24;
                        if (i24 != 0) {
                            message6.flags |= 1073741824;
                        }
                        TLRPC.Message message7 = message3;
                        updateMediaPaths(messageObject, message7, message3.f17216id, str, false, hashMap);
                        messageObject2 = messageObject;
                        sendMessagesHelper = this;
                        i12 = messageObject2.getMediaExistanceFlags();
                        message2.f17216id = message7.f17216id;
                        i13 = 0;
                    } else {
                        sendMessagesHelper = this;
                        messageObject2 = messageObject;
                        if (BuildVars.LOGS_ENABLED) {
                            StringBuilder sb2 = new StringBuilder();
                            for (int i25 = 0; i25 < arrayList10.size(); i25++) {
                                sb2.append(arrayList10.get(i25).getClass().getSimpleName());
                                sb2.append(", ");
                            }
                            FileLog.d("can't find message in updates " + ((Object) sb2));
                        }
                        i12 = 0;
                        i13 = 1;
                    }
                    Utilities.stageQueue.postRunnable(new jj(sendMessagesHelper, updates, 0));
                    i11 = i12;
                    i14 = i13;
                    z11 = z14;
                } else {
                    messageObject2 = messageObject;
                    z11 = z10;
                    i11 = 0;
                    i14 = 0;
                }
            }
            if (MessageObject.isLiveLocationMessage(message2) && message2.via_bot_id == j3 && TextUtils.isEmpty(message2.via_bot_name)) {
                sendMessagesHelper.getLocationController().addSharingLocation(message2);
            }
            if (i14 == 0) {
                sendMessagesHelper.getStatsController().incrementSentItemsCount(ApplicationLoader.getCurrentNetworkType(), 1, 1);
                message2.send_state = 0;
                long j10 = j3;
                message2.errorNewPriceStars = j10;
                message2.errorAllowedPriceStars = j10;
                if (z10 != z11) {
                    ArrayList arrayList11 = new ArrayList();
                    arrayList11.add(Integer.valueOf(i10));
                    ArrayList arrayList12 = new ArrayList();
                    arrayList12.add(new MessageObject(messageObject2.currentAccount, messageObject2.messageOwner, true, true));
                    DispatchQueue storageQueue = sendMessagesHelper.getMessagesStorage().getStorageQueue();
                    kj kjVar = new kj(sendMessagesHelper, arrayList, z10, z11, message2, arrayList11, arrayList12, i10);
                    message2 = message2;
                    storageQueue.postRunnable(kjVar);
                    sendMessagesHelper = this;
                } else {
                    NotificationCenter notificationCenter2 = getNotificationCenter();
                    int i26 = NotificationCenter.messageReceivedByServer;
                    Integer valueOf = Integer.valueOf(i10);
                    Integer valueOf2 = Integer.valueOf(message2.f17216id);
                    Long valueOf3 = Long.valueOf(message2.dialog_id);
                    Integer valueOf4 = Integer.valueOf(i11);
                    Boolean valueOf5 = Boolean.valueOf(z10);
                    Object[] objArr2 = new Object[7];
                    objArr2[0] = valueOf;
                    objArr2[1] = valueOf2;
                    objArr2[c10] = message2;
                    objArr2[3] = valueOf3;
                    objArr2[4] = 0L;
                    objArr2[5] = valueOf4;
                    objArr2[6] = valueOf5;
                    notificationCenter2.lambda$postNotificationNameOnUIThread$1(i26, objArr2);
                    NotificationCenter notificationCenter3 = getNotificationCenter();
                    int i27 = NotificationCenter.messageReceivedByServer2;
                    Integer valueOf6 = Integer.valueOf(i10);
                    Integer valueOf7 = Integer.valueOf(message2.f17216id);
                    Long valueOf8 = Long.valueOf(message2.dialog_id);
                    Integer valueOf9 = Integer.valueOf(i11);
                    Boolean valueOf10 = Boolean.valueOf(z10);
                    Object[] objArr3 = new Object[7];
                    objArr3[0] = valueOf6;
                    objArr3[1] = valueOf7;
                    objArr3[c10] = message2;
                    objArr3[3] = valueOf8;
                    objArr3[4] = 0L;
                    objArr3[5] = valueOf9;
                    objArr3[6] = valueOf10;
                    notificationCenter3.lambda$postNotificationNameOnUIThread$1(i27, objArr3);
                    sendMessagesHelper = this;
                    boolean z15 = z10;
                    getMessagesStorage().getStorageQueue().postRunnable(new e8(sendMessagesHelper, z15, message2, i10, arrayList, i11));
                    z12 = z15;
                    tLObject3 = tLObject2;
                    r22 = z12;
                }
            }
            z12 = z10;
            tLObject3 = tLObject2;
            r22 = z12;
        } else {
            sendMessagesHelper = this;
            r22 = z10;
            messageObject2 = messageObject;
            tLObject3 = tLObject2;
            org.telegram.ui.Components.d5.f0(sendMessagesHelper.currentAccount, tL_error, null, tLObject3, new Object[0]);
            i14 = 1;
        }
        if (i14 != 0) {
            sendMessagesHelper.getMessagesStorage().markMessageAsSendError(message2, r22);
            message2.send_state = 2;
            if (tL_error != null && (str2 = tL_error.text) != null && str2.startsWith("ALLOW_PAYMENT_REQUIRED_")) {
                xh.v5.y(sendMessagesHelper.currentAccount, false);
                message2.errorAllowedPriceStars = xh.v5.o(tLObject3);
                message2.errorNewPriceStars = Long.parseLong(tL_error.text.substring(23));
                xh.v5.y(sendMessagesHelper.currentAccount, false).f0(Arrays.asList(messageObject2));
                sendMessagesHelper.getMessagesStorage().updateMessageCustomParams(MessageObject.getDialogId(message2), message2);
            }
            sendMessagesHelper.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageSendError, Integer.valueOf(message2.f17216id));
            sendMessagesHelper.processSentMessage(message2.f17216id);
            sendMessagesHelper.removeFromSendingMessages(message2.f17216id, r22);
        }
    }

    public void lambda$performSendMessageRequest$101(TLObject tLObject, final MessageObject messageObject, final String str, final DelayedMessage delayedMessage, final boolean z10, final DelayedMessage delayedMessage2, final Object obj, final HashMap hashMap, final boolean z11, TLRPC.Message message, TLObject tLObject2, TLRPC.TL_error tL_error) {
        if (tL_error != null && (((tLObject instanceof TLRPC.TL_messages_sendMedia) || (tLObject instanceof TL_ephemeral.TL_sendMessage) || (tLObject instanceof TLRPC.TL_messages_editMessage) || (tLObject instanceof TLRPC.TL_messages_addPollAnswer)) && FileRefController.isFileRefError(tL_error.text))) {
            if (FileRefController.isFileRefErrorCover(tL_error.text)) {
                if (removeCoverFromRequest(tLObject)) {
                    lambda$performSendMessageRequest$82(tLObject, messageObject, str, delayedMessage, z10, delayedMessage2, obj, hashMap, z11);
                    return;
                }
            } else if (obj != null) {
                getFileRefController().requestReference(obj, tLObject, messageObject, str, delayedMessage, Boolean.valueOf(z10), delayedMessage2, Boolean.valueOf(z11));
                return;
            } else if (delayedMessage2 != null) {
                AndroidUtilities.runOnUIThread(new bi.e2((NotificationCenter.NotificationCenterDelegate) this, (TLObject) message, z11, tLObject, (Object) delayedMessage2, 10));
                return;
            }
        }
        if (tL_error != null && (tLObject instanceof TLRPC.TL_messages_sendMedia)) {
            final TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
            if (tL_messages_sendMedia.media instanceof TLRPC.TL_inputMediaStakeDice) {
                if ("GAME_HASH_INVALID".equalsIgnoreCase(tL_error.text)) {
                    getConnectionsManager().sendRequestTyped(new TLRPC.TL_messages_getEmojiGameInfo(), new Object(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj2, Object obj3) {
                            SendMessagesHelper.this.lambda$performSendMessageRequest$81(tL_messages_sendMedia, messageObject, str, delayedMessage, z10, delayedMessage2, obj, hashMap, z11, (TLRPC.EmojiGameInfo) obj2, (TLRPC.TL_error) obj3);
                        }
                    });
                    return;
                } else if ("BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                    TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice = (TLRPC.TL_inputMediaStakeDice) tL_messages_sendMedia.media;
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    if (U != null) {
                        AndroidUtilities.runOnUIThread(new qj(this, U, tL_inputMediaStakeDice, tL_messages_sendMedia, messageObject, str, delayedMessage, z10, delayedMessage2, obj, hashMap, z11));
                        return;
                    }
                }
            }
        }
        if (tLObject instanceof TLRPC.TL_messages_addPollAnswer) {
            AndroidUtilities.runOnUIThread(new sk(this, tL_error, message, tLObject2, messageObject, str, hashMap, z11, (TLRPC.TL_messages_addPollAnswer) tLObject, 0));
        } else if (tLObject instanceof TLRPC.TL_messages_editMessage) {
            AndroidUtilities.runOnUIThread(new sk(this, tL_error, message, tLObject2, messageObject, str, hashMap, z11, (TLRPC.TL_messages_editMessage) tLObject, 1));
        } else {
            AndroidUtilities.runOnUIThread(new sk(this, z11, tL_error, message, tLObject2, messageObject, hashMap, str, tLObject));
        }
    }

    public void lambda$performSendMessageRequest$102(TLRPC.Message message, int i10) {
        message.send_state = 0;
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageReceivedByAck, Integer.valueOf(i10));
    }

    public void lambda$performSendMessageRequest$103(TLRPC.Message message) {
        AndroidUtilities.runOnUIThread(new aj(this, message, message.f17216id, 0));
    }

    public void lambda$performSendMessageRequest$75(TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, MessageObject messageObject, String str, DelayedMessage delayedMessage, boolean z10, DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject).document;
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_inputDocument.f17207id = document.f17201id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
            tL_inputMediaDocument.f17256id = tL_inputDocument;
            tL_messages_addPollAnswer.answer.input_media = tL_inputMediaDocument;
            lambda$performSendMessageRequest$82(tLObject2, messageObject, str, delayedMessage, z10, delayedMessage2, obj, hashMap, z11);
        } else if (tLObject instanceof TLRPC.TL_messageMediaPhoto) {
            TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) tLObject).photo;
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputPhoto.f17214id = photo.f17219id;
            tL_inputPhoto.access_hash = photo.access_hash;
            tL_inputPhoto.file_reference = photo.file_reference;
            TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = new TLRPC.TL_inputMediaPhoto();
            tL_inputMediaPhoto.f17258id = tL_inputPhoto;
            tL_messages_addPollAnswer.answer.input_media = tL_inputMediaPhoto;
            lambda$performSendMessageRequest$82(tLObject2, messageObject, str, delayedMessage, z10, delayedMessage2, obj, hashMap, z11);
        } else if (delayedMessage2 != null) {
            delayedMessage2.markAsError();
        }
    }

    public void lambda$performSendMessageRequest$76(TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject, MessageObject messageObject, String str, DelayedMessage delayedMessage, boolean z10, DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, TLObject tLObject2, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new qj(this, tLObject2, tL_messages_addPollAnswer, tLObject, messageObject, str, delayedMessage, z10, delayedMessage2, obj, hashMap, z11));
    }

    public void lambda$performSendMessageRequest$80(TLRPC.Message message, boolean z10, TLObject tLObject, DelayedMessage delayedMessage) {
        removeFromSendingMessages(message.f17216id, z10);
        if (tLObject instanceof TLRPC.TL_messages_addPollAnswer) {
            TLRPC.PollAnswer pollAnswer = ((TLRPC.TL_messages_addPollAnswer) tLObject).answer;
            TLRPC.InputMedia inputMedia = pollAnswer.input_media;
            if (inputMedia instanceof TLRPC.TL_inputMediaPhoto) {
                pollAnswer.input_media = delayedMessage.inputUploadMedia;
            } else if (inputMedia instanceof TLRPC.TL_inputMediaDocument) {
                pollAnswer.input_media = delayedMessage.inputUploadMedia;
            }
        } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
            TLRPC.InputMedia inputMedia2 = tL_messages_sendMedia.media;
            if (inputMedia2 instanceof TLRPC.TL_inputMediaPhoto) {
                tL_messages_sendMedia.media = delayedMessage.inputUploadMedia;
            } else if (inputMedia2 instanceof TLRPC.TL_inputMediaDocument) {
                tL_messages_sendMedia.media = delayedMessage.inputUploadMedia;
            }
        } else if (tLObject instanceof TL_ephemeral.TL_sendMessage) {
            TLObject tLObject2 = delayedMessage.sendRequest;
            if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
                TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject2;
                TLRPC.InputMedia inputMedia3 = tL_messages_sendMedia2.media;
                if (inputMedia3 instanceof TLRPC.TL_inputMediaPhoto) {
                    tL_messages_sendMedia2.media = delayedMessage.inputUploadMedia;
                } else if (inputMedia3 instanceof TLRPC.TL_inputMediaDocument) {
                    tL_messages_sendMedia2.media = delayedMessage.inputUploadMedia;
                }
            }
            TL_ephemeral.TL_sendMessage tL_sendMessage = (TL_ephemeral.TL_sendMessage) tLObject;
            TLRPC.InputMedia inputMedia4 = tL_sendMessage.media;
            if (inputMedia4 instanceof TLRPC.TL_inputMediaPhoto) {
                tL_sendMessage.media = delayedMessage.inputUploadMedia;
            } else if (inputMedia4 instanceof TLRPC.TL_inputMediaDocument) {
                tL_sendMessage.media = delayedMessage.inputUploadMedia;
            }
        } else if (tLObject instanceof TLRPC.TL_messages_editMessage) {
            TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) tLObject;
            TLRPC.InputMedia inputMedia5 = tL_messages_editMessage.media;
            if (inputMedia5 instanceof TLRPC.TL_inputMediaPhoto) {
                tL_messages_editMessage.media = delayedMessage.inputUploadMedia;
            } else if (inputMedia5 instanceof TLRPC.TL_inputMediaDocument) {
                tL_messages_editMessage.media = delayedMessage.inputUploadMedia;
            }
        }
        delayedMessage.performMediaUpload = true;
        performSendDelayedMessage(delayedMessage);
    }

    public void lambda$performSendMessageRequest$81(TLObject tLObject, MessageObject messageObject, String str, DelayedMessage delayedMessage, boolean z10, DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11, TLRPC.EmojiGameInfo emojiGameInfo, TLRPC.TL_error tL_error) {
        if (emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo) {
            String str2 = ((TLRPC.TL_emojiGameDiceInfo) emojiGameInfo).game_hash;
            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
            TLRPC.InputMedia inputMedia = tL_messages_sendMedia.media;
            if (inputMedia instanceof TLRPC.TL_inputMediaStakeDice) {
                ((TLRPC.TL_inputMediaStakeDice) inputMedia).game_hash = str2;
            }
            lambda$performSendMessageRequest$82(tL_messages_sendMedia, messageObject, str, delayedMessage, z10, delayedMessage2, obj, hashMap, z11);
        }
    }

    public void lambda$performSendMessageRequest$83(org.telegram.ui.ActionBar.p2 p2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLObject tLObject, MessageObject messageObject, String str, DelayedMessage delayedMessage, boolean z10, DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z11) {
        new ci.i(p2Var.getContext(), p2Var.getResourceProvider(), yf.a.i(tL_inputMediaStakeDice.ton_amount, yf.b.f46929b), false, new ti(this, tLObject, messageObject, str, delayedMessage, z10, delayedMessage2, obj, hashMap, z11, 2)).show();
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        arrayList.add(messageObject);
        cancelSendingMessage(arrayList);
    }

    public void lambda$performSendMessageRequest$84(TLRPC.Message message, boolean z10) {
        processSentMessage(message.f17216id);
        removeFromSendingMessages(message.f17216id, z10);
    }

    public void lambda$performSendMessageRequest$85(TLRPC.Updates updates, TLRPC.Message message, boolean z10) {
        getMessagesController().processUpdates(updates, false);
        AndroidUtilities.runOnUIThread(new lj(this, message, z10, 1));
    }

    public void lambda$performSendMessageRequest$86(TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, String str, HashMap hashMap, boolean z10, TLObject tLObject2) {
        if (tL_error == null) {
            String str2 = message.attachPath;
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            ArrayList<TLRPC.Update> arrayList = updates.updates;
            message.send_state = 0;
            ArrayList<TLRPC.Message> arrayList2 = new ArrayList<>();
            arrayList2.add(message);
            getMessagesStorage().putMessages(arrayList2, false, true, false, 0, 0, 0L);
            getMessagesController().getTopicsController().processEditedMessage(message);
            Utilities.stageQueue.postRunnable(new ri(this, updates, message, z10, 1));
            return;
        }
        org.telegram.ui.Components.d5.f0(this.currentAccount, tL_error, null, tLObject2, new Object[0]);
        removeFromSendingMessages(message.f17216id, z10);
        revertEditingMessageObject(messageObject);
    }

    public void lambda$performSendMessageRequest$87(TLRPC.Message message, boolean z10) {
        processSentMessage(message.f17216id);
        removeFromSendingMessages(message.f17216id, z10);
    }

    public void lambda$performSendMessageRequest$88(TLRPC.Updates updates, TLRPC.Message message, boolean z10) {
        getMessagesController().processUpdates(updates, false);
        AndroidUtilities.runOnUIThread(new lj(this, message, z10, 2));
    }

    public void lambda$performSendMessageRequest$89(TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, String str, HashMap hashMap, boolean z10, TLObject tLObject2) {
        int i10 = 0;
        TLRPC.Message message2 = null;
        if (tL_error == null) {
            String str2 = message.attachPath;
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            ArrayList<TLRPC.Update> arrayList = updates.updates;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                TLRPC.Update update = arrayList.get(i10);
                if (update instanceof TL_update.TL_updateEditMessage) {
                    message2 = ((TL_update.TL_updateEditMessage) update).message;
                    break;
                } else if (update instanceof TL_update.TL_updateEditChannelMessage) {
                    message2 = ((TL_update.TL_updateEditChannelMessage) update).message;
                    break;
                } else if (update instanceof TL_update.TL_updateNewScheduledMessage) {
                    message2 = ((TL_update.TL_updateNewScheduledMessage) update).message;
                    break;
                } else if (update instanceof TL_update.TL_updateQuickReplyMessage) {
                    gg.k2.f(this.currentAccount).j(update, MessageObject.getQuickReplyName(message), MessageObject.getQuickReplyId(message));
                    message2 = ((TL_update.TL_updateQuickReplyMessage) update).message;
                    break;
                } else {
                    i10++;
                }
            }
            TLRPC.Message message3 = message2;
            if (message3 != null) {
                ImageLoader.saveMessageThumbs(message3);
                updateMediaPaths(messageObject, message3, message3.f17216id, str, false, hashMap);
            }
            Utilities.stageQueue.postRunnable(new ri(this, updates, message, z10, 0));
            return;
        }
        org.telegram.ui.Components.d5.f0(this.currentAccount, tL_error, null, tLObject2, new Object[0]);
        removeFromSendingMessages(message.f17216id, z10);
        revertEditingMessageObject(messageObject);
    }

    public void lambda$performSendMessageRequest$90(TLRPC.TL_updateShortSentMessage tL_updateShortSentMessage) {
        getMessagesController().processNewDifferenceParams(-1, tL_updateShortSentMessage.pts, tL_updateShortSentMessage.date, tL_updateShortSentMessage.pts_count);
    }

    public void lambda$performSendMessageRequest$91(TL_update.TL_updateNewMessage tL_updateNewMessage) {
        getMessagesController().processNewDifferenceParams(-1, tL_updateNewMessage.pts, -1, tL_updateNewMessage.pts_count);
    }

    public void lambda$performSendMessageRequest$92(TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage) {
        getMessagesController().processNewChannelDifferenceParams(tL_updateNewChannelMessage.pts, tL_updateNewChannelMessage.pts_count, tL_updateNewChannelMessage.message.peer_id.channel_id);
    }

    public void lambda$performSendMessageRequest$93(TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j3) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(tL_updateNewChannelMessage.message.f17216id));
        getMessagesStorage().updatePinnedMessages(-j3, arrayList, true, -1, 0, false, null);
    }

    public void lambda$performSendMessageRequest$94(TLRPC.Updates updates) {
        getMessagesController().processUpdates(updates, false);
    }

    public void lambda$performSendMessageRequest$95(boolean z10, TLRPC.Message message, ArrayList arrayList, boolean z11, ArrayList arrayList2, int i10) {
        int i11;
        boolean z12;
        if (z10 && message != null) {
            i11 = message.f17216id;
        } else {
            i11 = 0;
        }
        MessagesController messagesController = getMessagesController();
        long j3 = message.dialog_id;
        if (!z11 && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        messagesController.deleteMessages(arrayList, null, null, j3, false, z11 ? 1 : 0, false, 0L, null, 0, z12, i11);
        getMessagesController().updateInterfaceWithMessages(message.dialog_id, arrayList2, z10 ? 1 : 0);
        getMediaDataController().increasePeerRaiting(message.dialog_id);
        processSentMessage(i10);
        removeFromSendingMessages(i10, z11);
    }

    public void lambda$performSendMessageRequest$96(ArrayList arrayList, boolean z10, boolean z11, TLRPC.Message message, ArrayList arrayList2, ArrayList arrayList3, int i10) {
        getMessagesStorage().putMessages(arrayList, true, false, false, 0, false, !z10 ? 1 : 0, 0L);
        AndroidUtilities.runOnUIThread(new pj(this, z11, message, arrayList2, z10, arrayList3, i10));
    }

    public void lambda$performSendMessageRequest$97(long j3, ArrayList arrayList) {
        getMessagesController().markDialogMessageAsDeleted(j3, arrayList);
    }

    public void lambda$performSendMessageRequest$98(TLRPC.Message message, int i10, int i11, boolean z10) {
        getMediaDataController().increasePeerRaiting(message.dialog_id);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageReceivedByServer, Integer.valueOf(i10), Integer.valueOf(message.f17216id), message, Long.valueOf(message.dialog_id), 0L, Integer.valueOf(i11), Boolean.valueOf(z10));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageReceivedByServer2, Integer.valueOf(i10), Integer.valueOf(message.f17216id), message, Long.valueOf(message.dialog_id), 0L, Integer.valueOf(i11), Boolean.valueOf(z10));
        processSentMessage(i10);
        removeFromSendingMessages(i10, z10);
    }

    public void lambda$performSendMessageRequest$99(boolean z10, TLRPC.Message message, int i10, ArrayList arrayList, int i11) {
        int i12;
        if (MessageObject.isWelcomeMessage(message)) {
            i12 = 9;
        } else if (message.quick_reply_shortcut_id == 0 && message.quick_reply_shortcut == null) {
            i12 = z10 ? 1 : 0;
        } else {
            i12 = 5;
        }
        getMessagesStorage().updateMessageStateAndId(message.random_id, MessageObject.getPeerId(message.peer_id), Integer.valueOf(i10), message.f17216id, 0, false, z10 ? 1 : 0, message.quick_reply_shortcut_id);
        getMessagesStorage().putMessages((ArrayList<TLRPC.Message>) arrayList, true, false, false, 0, i12, message.quick_reply_shortcut_id);
        if (MessageObject.isEphemeralAndNotWelcome(message)) {
            long peerId = MessageObject.getPeerId(message.peer_id);
            ArrayList<Integer> arrayList2 = new ArrayList<>(1);
            arrayList2.add(Integer.valueOf(message.f17216id));
            getMessagesStorage().markMessagesAsDeleted(peerId, arrayList2, false, false, i12, (int) MessageObject.getTopicId(this.currentAccount, message, 0));
            getMessagesStorage().updateDialogsWithDeletedMessages(peerId, -peerId, arrayList2, null);
            AndroidUtilities.runOnUIThread(new bj(this, peerId, arrayList2, 2));
        }
        AndroidUtilities.runOnUIThread(new ak(this, message, i10, i11, z10));
    }

    public void lambda$performSendMessageRequestMulti$65(org.telegram.tgnet.TLObject r9, int r10, org.telegram.messenger.SendMessagesHelper.DelayedMessage r11, java.util.ArrayList r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.lambda$performSendMessageRequestMulti$65(org.telegram.tgnet.TLObject, int, org.telegram.messenger.SendMessagesHelper$DelayedMessage, java.util.ArrayList, boolean):void");
    }

    public void lambda$performSendMessageRequestMulti$66(TL_update.TL_updateNewMessage tL_updateNewMessage) {
        getMessagesController().processNewDifferenceParams(-1, tL_updateNewMessage.pts, -1, tL_updateNewMessage.pts_count);
    }

    public void lambda$performSendMessageRequestMulti$67(TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage) {
        getMessagesController().processNewChannelDifferenceParams(tL_updateNewChannelMessage.pts, tL_updateNewChannelMessage.pts_count, tL_updateNewChannelMessage.message.peer_id.channel_id);
    }

    public void lambda$performSendMessageRequestMulti$68(TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage, long j3) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(tL_updateNewChannelMessage.message.f17216id));
        getMessagesStorage().updatePinnedMessages(-j3, arrayList, true, -1, 0, false, null);
    }

    public void lambda$performSendMessageRequestMulti$69(long j3, ArrayList arrayList) {
        getMessagesController().markDialogMessageAsDeleted(j3, arrayList);
    }

    public void lambda$performSendMessageRequestMulti$70(int[] iArr, int[] iArr2, boolean z10, boolean z11, MessageObject messageObject, SparseArray sparseArray, ArrayList arrayList, TLRPC.Message message, int i10, long j3, int i11) {
        TLRPC.Message message2;
        char c10;
        char c11;
        int i12;
        boolean z12;
        int i13 = iArr[0] + 1;
        iArr[0] = i13;
        if (i13 == iArr2[0] && z10 != z11) {
            long dialogId = messageObject.getDialogId();
            if (z11 && sparseArray.size() > 1) {
                i12 = sparseArray.keyAt(0);
            } else {
                i12 = 0;
            }
            MessagesController messagesController = getMessagesController();
            if (z11 && !z10) {
                z12 = true;
            } else {
                z12 = false;
            }
            message2 = message;
            c10 = 0;
            c11 = 1;
            messagesController.deleteMessages(arrayList, null, null, dialogId, false, z10 ? 1 : 0, false, 0L, null, 0, z12, i12);
        } else {
            message2 = message;
            c10 = 0;
            c11 = 1;
        }
        getMediaDataController().increasePeerRaiting(message2.dialog_id);
        NotificationCenter notificationCenter = getNotificationCenter();
        int i14 = NotificationCenter.messageReceivedByServer;
        Integer valueOf = Integer.valueOf(i10);
        Integer valueOf2 = Integer.valueOf(message2.f17216id);
        Long valueOf3 = Long.valueOf(message2.dialog_id);
        Long valueOf4 = Long.valueOf(j3);
        Integer valueOf5 = Integer.valueOf(i11);
        Boolean valueOf6 = Boolean.valueOf(z11);
        Object[] objArr = new Object[7];
        objArr[c10] = valueOf;
        objArr[c11] = valueOf2;
        objArr[2] = message2;
        objArr[3] = valueOf3;
        objArr[4] = valueOf4;
        objArr[5] = valueOf5;
        objArr[6] = valueOf6;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i14, objArr);
        NotificationCenter notificationCenter2 = getNotificationCenter();
        int i15 = NotificationCenter.messageReceivedByServer2;
        Integer valueOf7 = Integer.valueOf(i10);
        Integer valueOf8 = Integer.valueOf(message2.f17216id);
        Long valueOf9 = Long.valueOf(message2.dialog_id);
        Long valueOf10 = Long.valueOf(j3);
        Integer valueOf11 = Integer.valueOf(i11);
        Boolean valueOf12 = Boolean.valueOf(z11);
        Object[] objArr2 = new Object[7];
        objArr2[c10] = valueOf7;
        objArr2[c11] = valueOf8;
        objArr2[2] = message2;
        objArr2[3] = valueOf9;
        objArr2[4] = valueOf10;
        objArr2[5] = valueOf11;
        objArr2[6] = valueOf12;
        notificationCenter2.lambda$postNotificationNameOnUIThread$1(i15, objArr2);
        processSentMessage(i10);
        removeFromSendingMessages(i10, z10);
    }

    public void lambda$performSendMessageRequestMulti$71(final boolean z10, final TLRPC.Message message, final int i10, ArrayList arrayList, final int[] iArr, final int[] iArr2, final boolean z11, final MessageObject messageObject, final SparseArray sparseArray, final ArrayList arrayList2, final long j3, final int i11) {
        int i12;
        if (MessageObject.isWelcomeMessage(message)) {
            i12 = 9;
        } else if (message.quick_reply_shortcut_id == 0 && message.quick_reply_shortcut == null) {
            i12 = z10 ? 1 : 0;
        } else {
            i12 = 5;
        }
        getMessagesStorage().updateMessageStateAndId(message.random_id, MessageObject.getPeerId(message.peer_id), Integer.valueOf(i10), message.f17216id, 0, false, i12, message.quick_reply_shortcut_id);
        getMessagesStorage().putMessages((ArrayList<TLRPC.Message>) arrayList, true, false, false, 0, i12, message.quick_reply_shortcut_id);
        if (MessageObject.isEphemeralAndNotWelcome(message)) {
            long peerId = MessageObject.getPeerId(message.peer_id);
            ArrayList<Integer> arrayList3 = new ArrayList<>(1);
            arrayList3.add(Integer.valueOf(message.f17216id));
            getMessagesStorage().markMessagesAsDeleted(peerId, arrayList3, false, false, i12, (int) MessageObject.getTopicId(this.currentAccount, message, 0));
            getMessagesStorage().updateDialogsWithDeletedMessages(peerId, -peerId, arrayList3, null);
            AndroidUtilities.runOnUIThread(new bj(this, peerId, arrayList3, 1));
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SendMessagesHelper.this.lambda$performSendMessageRequestMulti$70(iArr, iArr2, z11, z10, messageObject, sparseArray, arrayList2, message, i10, j3, i11);
            }
        });
    }

    public void lambda$performSendMessageRequestMulti$72(TLRPC.Updates updates) {
        getMessagesController().processUpdates(updates, false);
    }

    public void lambda$performSendMessageRequestMulti$73(TLRPC.TL_error tL_error, TLObject tLObject, final boolean z10, ArrayList arrayList, ArrayList arrayList2, TLObject tLObject2) {
        ?? r82;
        int i10;
        ?? r22;
        TLRPC.TL_error tL_error2;
        TLObject tLObject3;
        boolean z11;
        String str;
        int i11;
        boolean z12;
        TLRPC.Message message;
        MessageObject messageObject;
        TLRPC.Updates updates;
        TLRPC.Message message2;
        TLRPC.Message message3;
        int i12;
        ArrayList arrayList3;
        boolean z13;
        TLRPC.Updates updates2;
        ArrayList<TLRPC.Update> arrayList4;
        ArrayList<TL_ephemeral.EphemeralMessage> arrayList5;
        int i13;
        String quickReplyName;
        Integer valueOf;
        int i14;
        TLRPC.MessageReplyHeader messageReplyHeader;
        ArrayList<TL_ephemeral.EphemeralMessage> arrayList6;
        SendMessagesHelper sendMessagesHelper = this;
        ArrayList arrayList7 = arrayList;
        TLObject tLObject4 = tLObject2;
        int i15 = 1;
        if (tL_error == null) {
            final SparseArray sparseArray = new SparseArray();
            a0.i iVar = new a0.i();
            TLRPC.Updates updates3 = (TLRPC.Updates) tLObject;
            ArrayList<TLRPC.Update> arrayList8 = updates3.updates;
            ArrayList<TL_ephemeral.EphemeralMessage> arrayList9 = new ArrayList<>();
            boolean z14 = z10;
            int i16 = 0;
            a0.i iVar2 = null;
            while (i16 < arrayList8.size()) {
                TLRPC.Update update = arrayList8.get(i16);
                if (update instanceof TL_update.TL_updateMessageID) {
                    TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) update;
                    updates2 = updates3;
                    iVar.k(Integer.valueOf(tL_updateMessageID.f17453id), tL_updateMessageID.random_id);
                    arrayList8.remove(i16);
                } else {
                    updates2 = updates3;
                    if (update instanceof TL_update.TL_updateNewMessage) {
                        TL_update.TL_updateNewMessage tL_updateNewMessage = (TL_update.TL_updateNewMessage) update;
                        TLRPC.Message message4 = tL_updateNewMessage.message;
                        sparseArray.put(message4.f17216id, message4);
                        Utilities.stageQueue.postRunnable(new gj(sendMessagesHelper, tL_updateNewMessage, i15));
                        arrayList8.remove(i16);
                        i16--;
                        arrayList4 = arrayList8;
                        arrayList5 = arrayList9;
                    } else if (update instanceof TL_update.TL_updateNewEphemeralMessage) {
                        TL_update.TL_updateNewEphemeralMessage tL_updateNewEphemeralMessage = (TL_update.TL_updateNewEphemeralMessage) update;
                        TLRPC.TL_message b10 = xf.u.b(tL_updateNewEphemeralMessage.message);
                        sparseArray.put(b10.f17216id, b10);
                        arrayList9.add(tL_updateNewEphemeralMessage.message);
                        arrayList8.remove(i16);
                    } else {
                        if (update instanceof TL_update.TL_updateNewChannelMessage) {
                            TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage = (TL_update.TL_updateNewChannelMessage) update;
                            long updateChannelId = MessagesController.getUpdateChannelId(tL_updateNewChannelMessage);
                            TLRPC.Chat chat = sendMessagesHelper.getMessagesController().getChat(Long.valueOf(updateChannelId));
                            if ((chat != null && !chat.megagroup) || (messageReplyHeader = tL_updateNewChannelMessage.message.reply_to) == null || (messageReplyHeader.reply_to_top_id == 0 && messageReplyHeader.reply_to_msg_id == 0)) {
                                arrayList6 = arrayList9;
                            } else {
                                if (iVar2 == null) {
                                    iVar2 = new a0.i();
                                }
                                long dialogId = MessageObject.getDialogId(tL_updateNewChannelMessage.message);
                                SparseArray sparseArray2 = (SparseArray) iVar2.f(dialogId);
                                if (sparseArray2 == null) {
                                    sparseArray2 = new SparseArray();
                                    iVar2.k(sparseArray2, dialogId);
                                }
                                TLRPC.MessageReplyHeader messageReplyHeader2 = tL_updateNewChannelMessage.message.reply_to;
                                int i17 = messageReplyHeader2.reply_to_top_id;
                                if (i17 == 0) {
                                    i17 = messageReplyHeader2.reply_to_msg_id;
                                }
                                TLRPC.MessageReplies messageReplies = (TLRPC.MessageReplies) sparseArray2.get(i17);
                                if (messageReplies == null) {
                                    messageReplies = new TLRPC.TL_messageReplies();
                                    sparseArray2.put(i17, messageReplies);
                                }
                                TLRPC.Peer peer = tL_updateNewChannelMessage.message.from_id;
                                if (peer != null) {
                                    arrayList6 = arrayList9;
                                    messageReplies.recent_repliers.add(0, peer);
                                } else {
                                    arrayList6 = arrayList9;
                                }
                                messageReplies.replies++;
                            }
                            a0.i iVar3 = iVar2;
                            TLRPC.Message message5 = tL_updateNewChannelMessage.message;
                            sparseArray.put(message5.f17216id, message5);
                            Utilities.stageQueue.postRunnable(new hj(sendMessagesHelper, tL_updateNewChannelMessage, 1));
                            arrayList8.remove(i16);
                            int i18 = i16 - 1;
                            if (tL_updateNewChannelMessage.message.pinned) {
                                arrayList5 = arrayList6;
                                arrayList4 = arrayList8;
                                sendMessagesHelper = this;
                                Utilities.stageQueue.postRunnable(new ij(this, tL_updateNewChannelMessage, updateChannelId, 1));
                            } else {
                                arrayList4 = arrayList8;
                                arrayList5 = arrayList6;
                            }
                            iVar2 = iVar3;
                            i16 = i18;
                        } else {
                            arrayList4 = arrayList8;
                            arrayList5 = arrayList9;
                            if (update instanceof TL_update.TL_updateNewScheduledMessage) {
                                TLRPC.Message message6 = ((TL_update.TL_updateNewScheduledMessage) update).message;
                                sparseArray.put(message6.f17216id, message6);
                                arrayList4.remove(i16);
                                i16--;
                                i14 = 1;
                                z14 = true;
                                i16 += i14;
                                arrayList8 = arrayList4;
                                arrayList9 = arrayList5;
                                i15 = 1;
                                updates3 = updates2;
                            } else if (update instanceof TL_update.TL_updateQuickReplyMessage) {
                                gg.k2 f7 = gg.k2.f(sendMessagesHelper.currentAccount);
                                if (arrayList7.isEmpty()) {
                                    i13 = 0;
                                    quickReplyName = null;
                                } else {
                                    i13 = 0;
                                    quickReplyName = ((MessageObject) arrayList7.get(0)).getQuickReplyName();
                                }
                                if (arrayList7.isEmpty()) {
                                    valueOf = null;
                                } else {
                                    valueOf = Integer.valueOf(((MessageObject) arrayList7.get(i13)).getQuickReplyId());
                                }
                                f7.j(update, quickReplyName, valueOf.intValue());
                                TLRPC.Message message7 = ((TL_update.TL_updateQuickReplyMessage) update).message;
                                sparseArray.put(message7.f17216id, message7);
                                arrayList4.remove(i16);
                                i16--;
                            }
                        }
                        i14 = 1;
                        i16 += i14;
                        arrayList8 = arrayList4;
                        arrayList9 = arrayList5;
                        i15 = 1;
                        updates3 = updates2;
                    }
                    i14 = 1;
                    z14 = false;
                    i16 += i14;
                    arrayList8 = arrayList4;
                    arrayList9 = arrayList5;
                    i15 = 1;
                    updates3 = updates2;
                }
                i16--;
                arrayList4 = arrayList8;
                arrayList5 = arrayList9;
                i14 = 1;
                i16 += i14;
                arrayList8 = arrayList4;
                arrayList9 = arrayList5;
                i15 = 1;
                updates3 = updates2;
            }
            TLRPC.Updates updates4 = updates3;
            char c10 = 2;
            ArrayList<TL_ephemeral.EphemeralMessage> arrayList10 = arrayList9;
            if (!arrayList10.isEmpty()) {
                sendMessagesHelper.getMessagesStorage().putEphemeralMessages(arrayList10, true);
            }
            if (iVar2 != null) {
                sendMessagesHelper.getMessagesStorage().putChannelViews(null, null, iVar2, true);
                i11 = 0;
                sendMessagesHelper.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateMessagesViews, null, null, iVar2, Boolean.TRUE);
            } else {
                i11 = 0;
            }
            int[] iArr = new int[1];
            iArr[i11] = i11;
            int[] iArr2 = {i11};
            final ArrayList arrayList11 = new ArrayList();
            int i19 = 0;
            while (i19 < arrayList7.size()) {
                MessageObject messageObject2 = (MessageObject) arrayList7.get(i19);
                String str2 = (String) arrayList2.get(i19);
                TLRPC.Message message8 = messageObject2.messageOwner;
                int i20 = message8.f17216id;
                ArrayList arrayList12 = new ArrayList();
                int i21 = i19;
                Integer num = (Integer) iVar.f(message8.random_id);
                if (num != null && (message = (TLRPC.Message) sparseArray.get(num.intValue())) != null) {
                    MessageObject.getDialogId(message);
                    arrayList12.add(message);
                    if ((message.flags & 33554432) != 0) {
                        TLRPC.Message message9 = messageObject2.messageOwner;
                        messageObject = messageObject2;
                        message9.ttl_period = message.ttl_period;
                        message9.flags |= 33554432;
                    } else {
                        messageObject = messageObject2;
                    }
                    if (tLObject4 instanceof TLRPC.TL_messages_sendMedia) {
                        updates = updates4;
                        message3 = message8;
                        arrayList3 = arrayList12;
                        i12 = i20;
                        message2 = message;
                        updateMediaPaths((MessageObject) arrayList7.get(0), message2, message.f17216id, arrayList2, false, -1, message.params);
                    } else {
                        updates = updates4;
                        message2 = message;
                        message3 = message8;
                        i12 = i20;
                        arrayList3 = arrayList12;
                        updateMediaPaths(messageObject, message2, message2.f17216id, str2, false, message2.params);
                    }
                    a0.i iVar4 = iVar;
                    final int mediaExistanceFlags = messageObject.getMediaExistanceFlags();
                    message3.f17216id = message2.f17216id;
                    int i22 = message2.quick_reply_shortcut_id;
                    message3.quick_reply_shortcut_id = i22;
                    if (i22 != 0) {
                        message3.flags |= 1073741824;
                    }
                    final int[] iArr3 = iArr2;
                    final int[] iArr4 = iArr;
                    final long j3 = message2.grouped_id;
                    if (!z10) {
                        Integer num2 = getMessagesController().dialogs_read_outbox_max.get(Long.valueOf(message2.dialog_id));
                        if (num2 == null) {
                            num2 = Integer.valueOf(getMessagesStorage().getDialogReadMax(message2.out, message2.dialog_id));
                            getMessagesController().dialogs_read_outbox_max.put(Long.valueOf(message2.dialog_id), num2);
                        }
                        if (num2.intValue() < message2.f17216id) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        message2.unread = z13;
                    }
                    iArr4[0] = iArr4[0] + 1;
                    arrayList11.add(Integer.valueOf(i12));
                    getStatsController().incrementSentItemsCount(ApplicationLoader.getCurrentNetworkType(), 1, 1);
                    message3.send_state = 0;
                    message3.errorAllowedPriceStars = 0L;
                    message3.errorNewPriceStars = 0L;
                    NotificationCenter notificationCenter = getNotificationCenter();
                    int i23 = NotificationCenter.messageReceivedByServer;
                    Integer valueOf2 = Integer.valueOf(i12);
                    Integer valueOf3 = Integer.valueOf(message3.f17216id);
                    Long valueOf4 = Long.valueOf(message3.dialog_id);
                    Long valueOf5 = Long.valueOf(j3);
                    Integer valueOf6 = Integer.valueOf(mediaExistanceFlags);
                    Boolean valueOf7 = Boolean.valueOf(z14);
                    Object[] objArr = new Object[7];
                    objArr[0] = valueOf2;
                    objArr[1] = valueOf3;
                    objArr[c10] = message3;
                    objArr[3] = valueOf4;
                    objArr[4] = valueOf5;
                    objArr[5] = valueOf6;
                    objArr[6] = valueOf7;
                    notificationCenter.lambda$postNotificationNameOnUIThread$1(i23, objArr);
                    NotificationCenter notificationCenter2 = getNotificationCenter();
                    int i24 = NotificationCenter.messageReceivedByServer2;
                    Integer valueOf8 = Integer.valueOf(i12);
                    Integer valueOf9 = Integer.valueOf(message3.f17216id);
                    Long valueOf10 = Long.valueOf(message3.dialog_id);
                    Long valueOf11 = Long.valueOf(j3);
                    Integer valueOf12 = Integer.valueOf(mediaExistanceFlags);
                    Boolean valueOf13 = Boolean.valueOf(z14);
                    Object[] objArr2 = new Object[7];
                    objArr2[0] = valueOf8;
                    objArr2[1] = valueOf9;
                    objArr2[c10] = message3;
                    objArr2[3] = valueOf10;
                    objArr2[4] = valueOf11;
                    objArr2[5] = valueOf12;
                    objArr2[6] = valueOf13;
                    notificationCenter2.lambda$postNotificationNameOnUIThread$1(i24, objArr2);
                    final TLRPC.Message message10 = message3;
                    updates4 = updates;
                    final boolean z15 = z14;
                    final int i25 = i12;
                    final MessageObject messageObject3 = messageObject;
                    final ArrayList arrayList13 = arrayList3;
                    sendMessagesHelper = this;
                    getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                        @Override
                        public final void run() {
                            SendMessagesHelper.this.lambda$performSendMessageRequestMulti$71(z15, message10, i25, arrayList13, iArr3, iArr4, z10, messageObject3, sparseArray, arrayList11, j3, mediaExistanceFlags);
                        }
                    });
                    i19 = i21 + 1;
                    arrayList7 = arrayList;
                    tLObject4 = tLObject2;
                    iArr2 = iArr3;
                    iArr = iArr4;
                    iVar = iVar4;
                    c10 = 2;
                } else {
                    sendMessagesHelper = this;
                    z12 = z10;
                    z11 = true;
                    break;
                }
            }
            z12 = z10;
            z11 = false;
            i10 = 1;
            Utilities.stageQueue.postRunnable(new jj(sendMessagesHelper, updates4, 1));
            tL_error2 = tL_error;
            tLObject3 = tLObject2;
            r22 = 0;
            r82 = z12;
        } else {
            r82 = z10;
            i10 = 1;
            r22 = 0;
            tL_error2 = tL_error;
            tLObject3 = tLObject2;
            org.telegram.ui.Components.d5.f0(sendMessagesHelper.currentAccount, tL_error2, null, tLObject3, new Object[0]);
            z11 = true;
        }
        if (z11) {
            for (int i26 = 0; i26 < arrayList.size(); i26++) {
                MessageObject messageObject4 = (MessageObject) arrayList.get(i26);
                TLRPC.Message message11 = messageObject4.messageOwner;
                sendMessagesHelper.getMessagesStorage().markMessageAsSendError(message11, r82);
                message11.send_state = 2;
                if (r82 == 0 && tL_error2 != null && (str = tL_error2.text) != null && str.startsWith("ALLOW_PAYMENT_REQUIRED_")) {
                    xh.v5.y(sendMessagesHelper.currentAccount, r22);
                    message11.errorAllowedPriceStars = xh.v5.o(tLObject3);
                    message11.errorNewPriceStars = Long.parseLong(tL_error2.text.substring(23));
                    xh.v5 y3 = xh.v5.y(sendMessagesHelper.currentAccount, r22);
                    MessageObject[] messageObjectArr = new MessageObject[i10];
                    messageObjectArr[r22] = messageObject4;
                    y3.f0(Arrays.asList(messageObjectArr));
                    sendMessagesHelper.getMessagesStorage().updateMessageCustomParams(MessageObject.getDialogId(message11), message11);
                }
                NotificationCenter notificationCenter3 = sendMessagesHelper.getNotificationCenter();
                int i27 = NotificationCenter.messageSendError;
                Object[] objArr3 = new Object[i10];
                objArr3[r22] = Integer.valueOf(message11.f17216id);
                notificationCenter3.lambda$postNotificationNameOnUIThread$1(i27, objArr3);
                sendMessagesHelper.processSentMessage(message11.f17216id);
                sendMessagesHelper.removeFromSendingMessages(message11.f17216id, r82);
            }
        }
    }

    public void lambda$performSendMessageRequestMulti$74(ArrayList arrayList, TLObject tLObject, ArrayList arrayList2, ArrayList arrayList3, DelayedMessage delayedMessage, boolean z10, TLObject tLObject2, TLRPC.TL_error tL_error) {
        Object obj;
        if (tL_error != null && FileRefController.isFileRefError(tL_error.text)) {
            int fileRefErrorIndex = FileRefController.getFileRefErrorIndex(tL_error.text);
            if (arrayList != null) {
                ArrayList arrayList4 = new ArrayList(arrayList);
                if (fileRefErrorIndex >= 0) {
                    for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                        if (fileRefErrorIndex == i10) {
                            obj = arrayList4.get(i10);
                        } else {
                            obj = null;
                        }
                        arrayList4.set(i10, obj);
                    }
                }
                getFileRefController().requestReference(arrayList4, tLObject, arrayList2, arrayList3, arrayList4, delayedMessage, Boolean.valueOf(z10));
                return;
            } else if (delayedMessage != null && !delayedMessage.getRetriedToSend(fileRefErrorIndex)) {
                delayedMessage.setRetriedToSend(fileRefErrorIndex, true);
                AndroidUtilities.runOnUIThread(new hi.u2(this, tLObject, fileRefErrorIndex, delayedMessage, arrayList2, z10, 2));
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new gg.v0(this, tL_error, tLObject2, z10, arrayList2, arrayList3, tLObject));
    }

    public void lambda$prepareImportHistory$105(Uri uri, ArrayList arrayList, MessagesStorage.LongCallback longCallback, long j3) {
        if (j3 != 0) {
            prepareImportHistory(-j3, uri, arrayList, longCallback);
        } else {
            longCallback.run(0L);
        }
    }

    public static void lambda$prepareImportHistory$108(MessagesStorage.LongCallback longCallback) {
        Toast.makeText(ApplicationLoader.applicationContext, LocaleController.getString(R.string.ImportFileTooLarge), 0).show();
        longCallback.run(0L);
    }

    public void lambda$prepareImportHistory$109(HashMap hashMap, long j3, ImportingHistory importingHistory, MessagesStorage.LongCallback longCallback) {
        this.importingHistoryFiles.putAll(hashMap);
        this.importingHistoryMap.k(importingHistory, j3);
        getFileLoader().uploadFile(importingHistory.historyPath, false, true, 0L, 67108864, true);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(j3));
        longCallback.run(j3);
        try {
            ApplicationLoader.applicationContext.startService(new Intent(ApplicationLoader.applicationContext, ImportingService.class));
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    public void lambda$prepareImportHistory$110(ArrayList arrayList, long j3, Uri uri, final MessagesStorage.LongCallback longCallback) {
        ArrayList arrayList2;
        Uri uri2;
        String str;
        ZipInputStream zipInputStream;
        if (arrayList != null) {
            arrayList2 = arrayList;
        } else {
            arrayList2 = new ArrayList();
        }
        ImportingHistory importingHistory = new ImportingHistory();
        importingHistory.mediaPaths = arrayList2;
        importingHistory.dialogId = j3;
        importingHistory.peer = getMessagesController().getInputPeer(j3);
        HashMap hashMap = new HashMap();
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size + 1; i10++) {
            if (i10 == 0) {
                uri2 = uri;
            } else {
                uri2 = (Uri) arrayList2.get(i10 - 1);
            }
            if (uri2 != null && !AndroidUtilities.isInternalUri(uri2)) {
                String fixFileName = FileLoader.fixFileName(MediaController.getFileName(uri));
                if (fixFileName != null && fixFileName.endsWith(".zip")) {
                    str = "zip";
                } else {
                    str = "txt";
                }
                String copyFileToCache = MediaController.copyFileToCache(uri2, str);
                if ("zip".equals(str)) {
                    File file = new File(copyFileToCache);
                    try {
                        try {
                            zipInputStream = new ZipInputStream(new FileInputStream(file));
                        } catch (IOException e) {
                            FileLog.e(e);
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    try {
                        ZipEntry nextEntry = zipInputStream.getNextEntry();
                        while (true) {
                            if (nextEntry == null) {
                                break;
                            }
                            String name = nextEntry.getName();
                            if (name == null) {
                                nextEntry = zipInputStream.getNextEntry();
                            } else {
                                int lastIndexOf = name.lastIndexOf("/");
                                if (lastIndexOf >= 0) {
                                    name = name.substring(lastIndexOf + 1);
                                }
                                if (name.endsWith(".txt")) {
                                    File createFileInCache = MediaController.createFileInCache(name, "txt");
                                    copyFileToCache = createFileInCache.getAbsolutePath();
                                    FileOutputStream fileOutputStream = new FileOutputStream(createFileInCache);
                                    byte[] bArr = new byte[1024];
                                    while (true) {
                                        int read = zipInputStream.read(bArr);
                                        if (read <= 0) {
                                            break;
                                        }
                                        fileOutputStream.write(bArr, 0, read);
                                    }
                                    fileOutputStream.close();
                                } else {
                                    nextEntry = zipInputStream.getNextEntry();
                                }
                            }
                        }
                        zipInputStream.closeEntry();
                        zipInputStream.close();
                        try {
                            file.delete();
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                    } catch (Throwable th2) {
                        try {
                            zipInputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                        break;
                    }
                }
                if (copyFileToCache == null) {
                    continue;
                } else {
                    File file2 = new File(copyFileToCache);
                    if (file2.exists()) {
                        long length = file2.length();
                        if (length != 0) {
                            importingHistory.totalSize += length;
                            if (i10 == 0) {
                                if (length > 33554432) {
                                    file2.delete();
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r2) {
                                                case 0:
                                                    longCallback.run(0L);
                                                    return;
                                                case 1:
                                                    longCallback.run(0L);
                                                    return;
                                                default:
                                                    SendMessagesHelper.lambda$prepareImportHistory$108(longCallback);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                importingHistory.historyPath = copyFileToCache;
                            } else {
                                importingHistory.uploadMedia.add(copyFileToCache);
                            }
                            importingHistory.uploadSet.add(copyFileToCache);
                            hashMap.put(copyFileToCache, importingHistory);
                        }
                    }
                    if (i10 == 0) {
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        longCallback.run(0L);
                                        return;
                                    case 1:
                                        longCallback.run(0L);
                                        return;
                                    default:
                                        SendMessagesHelper.lambda$prepareImportHistory$108(longCallback);
                                        return;
                                }
                            }
                        });
                        return;
                    }
                }
            } else if (i10 == 0) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                longCallback.run(0L);
                                return;
                            case 1:
                                longCallback.run(0L);
                                return;
                            default:
                                SendMessagesHelper.lambda$prepareImportHistory$108(longCallback);
                                return;
                        }
                    }
                });
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new kl(this, hashMap, j3, importingHistory, longCallback, 5));
    }

    public void lambda$prepareImportStickers$112(ImportingStickers importingStickers, HashMap hashMap, String str, MessagesStorage.StringCallback stringCallback) {
        if (importingStickers.uploadMedia.get(0).item != null) {
            importingStickers.startImport();
        } else {
            this.importingStickersFiles.putAll(hashMap);
            this.importingStickersMap.put(str, importingStickers);
            importingStickers.initImport();
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, str);
            stringCallback.run(str);
        }
        try {
            ApplicationLoader.applicationContext.startService(new Intent(ApplicationLoader.applicationContext, ImportingService.class));
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    public void lambda$prepareImportStickers$113(String str, String str2, String str3, ArrayList arrayList, MessagesStorage.StringCallback stringCallback) {
        ImportingStickers importingStickers = new ImportingStickers();
        importingStickers.title = str;
        importingStickers.shortName = str2;
        importingStickers.software = str3;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ImportingSticker importingSticker = (ImportingSticker) arrayList.get(i10);
            File file = new File(importingSticker.path);
            if (file.exists()) {
                long length = file.length();
                if (length != 0) {
                    importingStickers.totalSize += length;
                    importingStickers.uploadMedia.add(importingSticker);
                    importingStickers.uploadSet.put(importingSticker.path, importingSticker);
                    hashMap.put(importingSticker.path, importingStickers);
                }
            }
            if (i10 == 0) {
                AndroidUtilities.runOnUIThread(new dh(stringCallback, 13));
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new g5(this, importingStickers, hashMap, str2, stringCallback));
    }

    public static void lambda$prepareSendingAudioDocuments$115(MessageObject messageObject, AccountInstance accountInstance, TLRPC.TL_document tL_document, MessageObject messageObject2, HashMap hashMap, String str, long j3, MessageObject messageObject3, MessageObject messageObject4, String str2, ArrayList arrayList, boolean z10, int i10, int i11, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments, long j10, boolean z11, long j11, ph.h hVar, int i12) {
        if (messageObject != null) {
            accountInstance.getSendMessagesHelper().editMessage(messageObject, null, null, tL_document, messageObject2.messageOwner.attachPath, null, hashMap, false, false, str);
            return;
        }
        SendMessageParams of2 = SendMessageParams.of(tL_document, null, messageObject2.messageOwner.attachPath, j3, messageObject3, messageObject4, str2, arrayList, null, hashMap, z10, i10, i11, 0, str, null, false, false);
        of2.replyToStoryItem = storyItem;
        of2.sendMessageChatArguments = sendMessageChatArguments;
        of2.effect_id = j10;
        of2.invert_media = z11;
        of2.payStars = j11;
        of2.pollSendParams = hVar;
        of2.pollIndex = i12;
        accountInstance.getSendMessagesHelper().sendMessage(of2);
    }

    public static void lambda$prepareSendingAudioDocuments$116(final ph.h r33, java.util.ArrayList r34, final long r35, final org.telegram.messenger.AccountInstance r37, java.lang.CharSequence r38, boolean r39, java.util.ArrayList r40, final org.telegram.messenger.MessageObject r41, final org.telegram.messenger.MessageObject r42, final org.telegram.messenger.MessageObject r43, final boolean r44, final int r45, final int r46, final org.telegram.tgnet.tl.TL_stories.StoryItem r47, final org.telegram.messenger.SendMessageChatArguments r48, final long r49, final boolean r51, final long r52, java.lang.Runnable r54) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.lambda$prepareSendingAudioDocuments$116(ph.h, java.util.ArrayList, long, org.telegram.messenger.AccountInstance, java.lang.CharSequence, boolean, java.util.ArrayList, org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject, boolean, int, int, org.telegram.tgnet.tl.TL_stories$StoryItem, org.telegram.messenger.SendMessageChatArguments, long, boolean, long, java.lang.Runnable):void");
    }

    public static void lambda$prepareSendingBotContextResult$122(TLRPC.TL_document tL_document, Bitmap[] bitmapArr, String[] strArr, String str, long j3, MessageObject messageObject, MessageObject messageObject2, TLRPC.BotInlineResult botInlineResult, HashMap hashMap, boolean z10, int i10, int i11, TLRPC.TL_photo tL_photo, TLRPC.TL_game tL_game, SendMessageChatArguments sendMessageChatArguments, TL_stories.StoryItem storyItem, tn tnVar, long j10, long j11, AccountInstance accountInstance) {
        SendMessageParams sendMessageParams;
        if (tL_document != null) {
            if (bitmapArr[0] != null && strArr[0] != null) {
                ImageLoader.getInstance().putImageToCache(new BitmapDrawable(bitmapArr[0]), strArr[0], false);
            }
            TLRPC.BotInlineMessage botInlineMessage = botInlineResult.send_message;
            sendMessageParams = SendMessageParams.of(tL_document, null, str, j3, messageObject, messageObject2, botInlineMessage.message, botInlineMessage.entities, botInlineMessage.reply_markup, hashMap, z10, i10, i11, 0, botInlineResult, null, false);
        } else {
            sendMessageParams = null;
            String str2 = null;
            if (tL_photo != null) {
                TLRPC.WebDocument webDocument = botInlineResult.content;
                if (webDocument != null) {
                    str2 = webDocument.url;
                }
                String str3 = str2;
                TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult.send_message;
                sendMessageParams = SendMessageParams.of(tL_photo, str3, j3, messageObject, messageObject2, botInlineMessage2.message, botInlineMessage2.entities, botInlineMessage2.reply_markup, hashMap, z10, i10, i11, 0, botInlineResult, false);
            } else if (tL_game != null) {
                sendMessageParams = SendMessageParams.of(tL_game, j3, messageObject, messageObject2, botInlineResult.send_message.reply_markup, hashMap, z10, i10, i11);
            }
        }
        if (sendMessageParams != null) {
            sendMessageParams.sendMessageChatArguments = sendMessageChatArguments;
            sendMessageParams.replyToStoryItem = storyItem;
            sendMessageParams.replyQuote = tnVar;
            sendMessageParams.payStars = j10;
            sendMessageParams.monoForumPeer = j11;
            accountInstance.getSendMessagesHelper().sendMessage(sendMessageParams);
        }
    }

    public static void lambda$prepareSendingBotContextResult$123(long r27, final org.telegram.tgnet.TLRPC.BotInlineResult r29, org.telegram.messenger.AccountInstance r30, final java.util.HashMap r31, org.telegram.ui.ActionBar.p2 r32, final org.telegram.messenger.MessageObject r33, final org.telegram.messenger.MessageObject r34, final boolean r35, final int r36, final int r37, final org.telegram.messenger.SendMessageChatArguments r38, final org.telegram.tgnet.tl.TL_stories.StoryItem r39, final org.telegram.ui.tn r40, final long r41, final long r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.lambda$prepareSendingBotContextResult$123(long, org.telegram.tgnet.TLRPC$BotInlineResult, org.telegram.messenger.AccountInstance, java.util.HashMap, org.telegram.ui.ActionBar.p2, org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject, boolean, int, int, org.telegram.messenger.SendMessageChatArguments, org.telegram.tgnet.tl.TL_stories$StoryItem, org.telegram.ui.tn, long, long):void");
    }

    public static void lambda$prepareSendingDocumentInternal$114(MessageObject messageObject, AccountInstance accountInstance, TLRPC.TL_document tL_document, String str, HashMap hashMap, String str2, long j3, MessageObject messageObject2, MessageObject messageObject3, String str3, ArrayList arrayList, boolean z10, int i10, int i11, TL_stories.StoryItem storyItem, tn tnVar, SendMessageChatArguments sendMessageChatArguments, long j10, boolean z11, long j11, long j12, MessageSuggestionParams messageSuggestionParams, int i12, ph.h hVar) {
        if (messageObject != null) {
            accountInstance.getSendMessagesHelper().editMessage(messageObject, null, null, tL_document, str, null, hashMap, false, false, str2);
            return;
        }
        SendMessageParams of2 = SendMessageParams.of(tL_document, null, str, j3, messageObject2, messageObject3, str3, arrayList, null, hashMap, z10, i10, i11, 0, str2, null, false);
        of2.replyToStoryItem = storyItem;
        of2.replyQuote = tnVar;
        of2.sendMessageChatArguments = sendMessageChatArguments;
        of2.effect_id = j10;
        of2.invert_media = z11;
        of2.payStars = j11;
        of2.monoForumPeer = j12;
        of2.suggestionParams = messageSuggestionParams;
        of2.pollIndex = i12;
        of2.pollSendParams = hVar;
        accountInstance.getSendMessagesHelper().sendMessage(of2);
    }

    public static void lambda$prepareSendingDocuments$118(long j3, ArrayList arrayList, String str, ph.h hVar, AccountInstance accountInstance, int i10, ArrayList arrayList2, String str2, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, tn tnVar, ArrayList arrayList3, MessageObject messageObject3, boolean z10, boolean z11, int i11, t0.i iVar, SendMessageChatArguments sendMessageChatArguments, long j10, boolean z12, long j11, long j12, MessageSuggestionParams messageSuggestionParams, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6) {
        boolean z13;
        int i12;
        ArrayList arrayList7 = arrayList;
        int i13 = i10;
        ArrayList arrayList8 = arrayList4;
        int i14 = 1;
        long[] jArr = new long[1];
        Integer[] numArr = new Integer[1];
        boolean isEncryptedDialog = DialogObject.isEncryptedDialog(j3);
        int i15 = 10;
        if (arrayList7 != null) {
            int size = arrayList7.size();
            int i16 = 0;
            i12 = 0;
            int i17 = 0;
            boolean z14 = true;
            while (i16 < size) {
                String str3 = i16 == 0 ? str : null;
                if (!isEncryptedDialog && size > i14 && i17 % 10 == 0 && hVar == null) {
                    long j13 = jArr[0];
                    if (j13 != 0) {
                        finishGroup(accountInstance, j13, i13);
                    }
                    jArr[0] = Utilities.random.nextLong();
                    i17 = 0;
                }
                int i18 = i17 + 1;
                long j14 = jArr[0];
                int i19 = i13;
                Integer[] numArr2 = numArr;
                int i20 = size;
                int i21 = i16;
                int prepareSendingDocumentInternal = prepareSendingDocumentInternal(accountInstance, (String) arrayList7.get(i16), (String) arrayList2.get(i16), null, str2, j3, messageObject, messageObject2, storyItem, tnVar, i16 == 0 ? arrayList3 : null, messageObject3, jArr, !z10 && ((hVar == null && i18 == i15) || i16 == size + (-1)), str3, z11, i19, i11, numArr2, iVar == null, sendMessageChatArguments, z14 ? j10 : 0L, z12, j11, j12, messageSuggestionParams, hVar, arrayList8 != null ? ((Integer) arrayList8.get(i16)).intValue() : -1);
                long j15 = jArr[0];
                i17 = (j14 != j15 || j15 == -1) ? 1 : i18;
                i16 = i21 + 1;
                arrayList7 = arrayList;
                i12 = prepareSendingDocumentInternal;
                i13 = i19;
                numArr = numArr2;
                size = i20;
                i14 = 1;
                i15 = 10;
                z14 = false;
                arrayList8 = arrayList4;
            }
            z13 = z14;
        } else {
            z13 = true;
            i12 = 0;
        }
        ArrayList arrayList9 = arrayList5;
        int i22 = i13;
        Integer[] numArr3 = numArr;
        if (arrayList9 != null) {
            jArr[0] = 0;
            int size2 = arrayList9.size();
            int i23 = 0;
            int i24 = 0;
            while (i23 < arrayList9.size()) {
                String str4 = (i23 == 0 && (arrayList == null || arrayList.size() == 0)) ? str : null;
                ArrayList arrayList10 = (i23 == 0 && (arrayList == null || arrayList.size() == 0)) ? arrayList3 : null;
                if (!isEncryptedDialog && size2 > 1 && i24 % 10 == 0 && hVar == null) {
                    long j16 = jArr[0];
                    if (j16 != 0) {
                        finishGroup(accountInstance, j16, i22);
                    }
                    jArr[0] = Utilities.random.nextLong();
                    i24 = 0;
                }
                int i25 = i24 + 1;
                long j17 = jArr[0];
                int i26 = size2;
                int i27 = i23;
                int prepareSendingDocumentInternal2 = prepareSendingDocumentInternal(accountInstance, null, null, (Uri) arrayList9.get(i23), str2, j3, messageObject, messageObject2, storyItem, tnVar, arrayList10, messageObject3, jArr, !z10 && ((hVar == null && i25 == 10) || i23 == size2 + (-1)), str4, z11, i10, i11, numArr3, iVar == null, sendMessageChatArguments, z13 ? j10 : 0L, z12, j11, j12, messageSuggestionParams, hVar, arrayList6 != null ? ((Integer) arrayList6.get(i23)).intValue() : -1);
                long j18 = jArr[0];
                i24 = (j17 != j18 || j18 == -1) ? 1 : i25;
                i23 = i27 + 1;
                i22 = i10;
                arrayList9 = arrayList5;
                i12 = prepareSendingDocumentInternal2;
                size2 = i26;
                z13 = false;
            }
        }
        if (iVar != null) {
            iVar.f42070a.n();
        }
        handleError(i12, accountInstance);
    }

    public static void lambda$prepareSendingMedia$127(MediaSendPrepareWorker mediaSendPrepareWorker, AccountInstance accountInstance, SendingMediaInfo sendingMediaInfo, boolean z10) {
        mediaSendPrepareWorker.photo = accountInstance.getSendMessagesHelper().generatePhotoSizes(null, sendingMediaInfo.path, sendingMediaInfo.uri, sendingMediaInfo.highQuality);
        if (z10 && sendingMediaInfo.canDeleteAfter) {
            new File(sendingMediaInfo.path).delete();
        }
        mediaSendPrepareWorker.sync.countDown();
    }

    public static void lambda$prepareSendingMedia$128(MessageObject messageObject, TLRPC.TL_inputPollAnswer tL_inputPollAnswer, AccountInstance accountInstance, TLRPC.TL_document tL_document, String str, HashMap hashMap, SendingMediaInfo sendingMediaInfo, String str2, long j3, MessageObject messageObject2, MessageObject messageObject3, boolean z10, int i10, int i11, TL_stories.StoryItem storyItem, tn tnVar, SendMessageChatArguments sendMessageChatArguments, boolean z11, long j10, boolean z12, long j11, long j12, MessageSuggestionParams messageSuggestionParams, ph.h hVar) {
        if (messageObject == null && tL_inputPollAnswer == null) {
            SendMessageParams of2 = SendMessageParams.of(tL_document, null, str, j3, messageObject2, messageObject3, sendingMediaInfo.caption, sendingMediaInfo.entities, null, hashMap, z10, i10, i11, 0, str2, null, false, sendingMediaInfo.hasMediaSpoilers);
            of2.replyToStoryItem = storyItem;
            of2.replyQuote = tnVar;
            of2.sendMessageChatArguments = sendMessageChatArguments;
            if (z11) {
                of2.effect_id = j10;
            }
            of2.invert_media = z12;
            of2.payStars = j11;
            of2.monoForumPeer = j12;
            of2.suggestionParams = messageSuggestionParams;
            of2.pollIndex = sendingMediaInfo.pollIndex;
            of2.pollSendParams = hVar;
            accountInstance.getSendMessagesHelper().sendMessage(of2);
            return;
        }
        accountInstance.getSendMessagesHelper().editMessage(messageObject, tL_inputPollAnswer, null, null, tL_document, str, null, hashMap, false, sendingMediaInfo.hasMediaSpoilers, str2);
    }

    public static void lambda$prepareSendingMedia$129(MessageObject messageObject, TLRPC.TL_inputPollAnswer tL_inputPollAnswer, AccountInstance accountInstance, TLRPC.TL_photo tL_photo, boolean z10, SendingMediaInfo sendingMediaInfo, HashMap hashMap, String str, long j3, MessageObject messageObject2, MessageObject messageObject3, boolean z11, int i10, int i11, TL_stories.StoryItem storyItem, tn tnVar, SendMessageChatArguments sendMessageChatArguments, long j10, boolean z12, long j11, long j12, MessageSuggestionParams messageSuggestionParams, ph.h hVar) {
        String str2 = null;
        if (messageObject == null && tL_inputPollAnswer == null) {
            if (z10) {
                str2 = sendingMediaInfo.searchImage.imageUrl;
            }
            SendMessageParams of2 = SendMessageParams.of(tL_photo, str2, j3, messageObject2, messageObject3, sendingMediaInfo.caption, sendingMediaInfo.entities, null, hashMap, z11, i10, i11, sendingMediaInfo.ttl, str, false, sendingMediaInfo.hasMediaSpoilers);
            of2.replyToStoryItem = storyItem;
            of2.replyQuote = tnVar;
            of2.sendMessageChatArguments = sendMessageChatArguments;
            of2.effect_id = j10;
            of2.invert_media = z12;
            of2.payStars = j11;
            of2.monoForumPeer = j12;
            of2.suggestionParams = messageSuggestionParams;
            of2.pollIndex = sendingMediaInfo.pollIndex;
            of2.pollSendParams = hVar;
            accountInstance.getSendMessagesHelper().sendMessage(of2);
            return;
        }
        SendMessagesHelper sendMessagesHelper = accountInstance.getSendMessagesHelper();
        if (z10) {
            str2 = sendingMediaInfo.searchImage.imageUrl;
        }
        sendMessagesHelper.editMessage(messageObject, tL_inputPollAnswer, tL_photo, null, null, str2, null, hashMap, false, sendingMediaInfo.hasMediaSpoilers, str);
    }

    public static void lambda$prepareSendingMedia$130(Bitmap bitmap, String str, MessageObject messageObject, TLRPC.TL_inputPollAnswer tL_inputPollAnswer, AccountInstance accountInstance, VideoEditedInfo videoEditedInfo, TLRPC.TL_document tL_document, String str2, HashMap hashMap, SendingMediaInfo sendingMediaInfo, String str3, long j3, MessageObject messageObject2, MessageObject messageObject3, boolean z10, int i10, int i11, TL_stories.StoryItem storyItem, tn tnVar, SendMessageChatArguments sendMessageChatArguments, long j10, boolean z11, TLRPC.PhotoSize photoSize, long j11, long j12, MessageSuggestionParams messageSuggestionParams, ph.h hVar) {
        if (bitmap != null && str != null) {
            ImageLoader.getInstance().putImageToCache(new BitmapDrawable(bitmap), str, false);
        }
        if (messageObject == null && tL_inputPollAnswer == null) {
            SendMessageParams of2 = SendMessageParams.of(tL_document, videoEditedInfo, str2, j3, messageObject2, messageObject3, sendingMediaInfo.caption, sendingMediaInfo.entities, null, hashMap, z10, i10, i11, sendingMediaInfo.ttl, str3, null, false, sendingMediaInfo.hasMediaSpoilers);
            of2.replyToStoryItem = storyItem;
            of2.replyQuote = tnVar;
            of2.sendMessageChatArguments = sendMessageChatArguments;
            of2.effect_id = j10;
            of2.invert_media = z11;
            of2.stars = sendingMediaInfo.stars;
            of2.pollIndex = sendingMediaInfo.pollIndex;
            of2.cover = photoSize;
            of2.payStars = j11;
            of2.monoForumPeer = j12;
            of2.suggestionParams = messageSuggestionParams;
            of2.isLivePhoto = sendingMediaInfo.isLivePhoto;
            of2.livePhotoTimestamp = sendingMediaInfo.livePhotoTimestampUs / 1000;
            of2.pollSendParams = hVar;
            accountInstance.getSendMessagesHelper().sendMessage(of2);
            return;
        }
        accountInstance.getSendMessagesHelper().editMessage(messageObject, tL_inputPollAnswer, null, videoEditedInfo, tL_document, str2, null, hashMap, false, sendingMediaInfo.hasMediaSpoilers, str3);
    }

    public static void lambda$prepareSendingMedia$131(Bitmap[] bitmapArr, String[] strArr, MessageObject messageObject, TLRPC.TL_inputPollAnswer tL_inputPollAnswer, AccountInstance accountInstance, TLRPC.TL_photo tL_photo, HashMap hashMap, SendingMediaInfo sendingMediaInfo, String str, long j3, MessageObject messageObject2, MessageObject messageObject3, boolean z10, int i10, int i11, boolean z11, TL_stories.StoryItem storyItem, tn tnVar, SendMessageChatArguments sendMessageChatArguments, long j10, boolean z12, long j11, long j12, MessageSuggestionParams messageSuggestionParams, boolean z13, ph.h hVar) {
        if (bitmapArr[0] != null && strArr[0] != null) {
            ImageLoader.getInstance().putImageToCache(new BitmapDrawable(bitmapArr[0]), strArr[0], false);
        }
        if (messageObject == null && tL_inputPollAnswer == null) {
            SendMessageParams of2 = SendMessageParams.of(tL_photo, null, j3, messageObject2, messageObject3, sendingMediaInfo.caption, sendingMediaInfo.entities, null, hashMap, z10, i10, i11, sendingMediaInfo.ttl, str, z11, sendingMediaInfo.hasMediaSpoilers);
            of2.replyToStoryItem = storyItem;
            of2.replyQuote = tnVar;
            of2.sendMessageChatArguments = sendMessageChatArguments;
            of2.effect_id = j10;
            of2.invert_media = z12;
            of2.stars = sendingMediaInfo.stars;
            of2.pollIndex = sendingMediaInfo.pollIndex;
            of2.payStars = j11;
            of2.monoForumPeer = j12;
            of2.suggestionParams = messageSuggestionParams;
            of2.sendingHighQuality = z13;
            of2.pollSendParams = hVar;
            accountInstance.getSendMessagesHelper().sendMessage(of2);
            return;
        }
        accountInstance.getSendMessagesHelper().editMessage(messageObject, tL_inputPollAnswer, tL_photo, null, null, null, null, hashMap, false, sendingMediaInfo.hasMediaSpoilers, str);
    }

    public static void lambda$prepareSendingMedia$132(java.util.ArrayList r88, final long r89, boolean r91, boolean r92, boolean r93, final org.telegram.messenger.AccountInstance r94, long r95, final org.telegram.messenger.MessageObject r97, final org.telegram.tgnet.TLRPC.TL_inputPollAnswer r98, final org.telegram.messenger.MessageObject r99, final org.telegram.messenger.MessageObject r100, final boolean r101, final int r102, final int r103, final org.telegram.tgnet.tl.TL_stories.StoryItem r104, final org.telegram.ui.tn r105, final org.telegram.messenger.SendMessageChatArguments r106, final long r107, final boolean r109, final long r110, final long r112, final org.telegram.messenger.MessageSuggestionParams r114, final ph.h r115, boolean r116, t0.i r117, final boolean r118) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.lambda$prepareSendingMedia$132(java.util.ArrayList, long, boolean, boolean, boolean, org.telegram.messenger.AccountInstance, long, org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$TL_inputPollAnswer, org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject, boolean, int, int, org.telegram.tgnet.tl.TL_stories$StoryItem, org.telegram.ui.tn, org.telegram.messenger.SendMessageChatArguments, long, boolean, long, long, org.telegram.messenger.MessageSuggestionParams, ph.h, boolean, t0.i, boolean):void");
    }

    public static void lambda$prepareSendingPoll$133(ArrayList arrayList, ArrayList arrayList2, AccountInstance accountInstance, ArrayList arrayList3, long j3, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, tn tnVar, boolean z10, int i10, SendMessageChatArguments sendMessageChatArguments, long j10, long j11, MessageSuggestionParams messageSuggestionParams, ph.h hVar, ArrayList arrayList4, ArrayList arrayList5) {
        if (arrayList.isEmpty() && arrayList2.isEmpty()) {
            return;
        }
        prepareSendingDocuments(accountInstance, arrayList, arrayList3, arrayList2, null, null, null, j3, messageObject, messageObject2, storyItem, tnVar, null, z10, i10, 0, null, sendMessageChatArguments, 0L, false, j10, j11, messageSuggestionParams, hVar, arrayList4, arrayList5, false);
    }

    public static void lambda$prepareSendingPoll$135(ArrayList arrayList, int[] iArr, AccountInstance accountInstance, long j3, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, tn tnVar, boolean z10, int i10, SendMessageChatArguments sendMessageChatArguments, long j10, long j11, MessageSuggestionParams messageSuggestionParams, ph.h hVar, Runnable runnable) {
        boolean z11;
        if (!arrayList.isEmpty()) {
            int i11 = iArr[0] - 1;
            iArr[0] = i11;
            if (i11 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            prepareSendingMedia(accountInstance, arrayList, j3, messageObject, messageObject2, storyItem, tnVar, false, true, null, null, z10, i10, 0, 0, false, null, sendMessageChatArguments, 0L, false, j10, j11, messageSuggestionParams, hVar, z11);
            mediaSendQueue.postRunnable(new za(2, runnable));
            return;
        }
        runnable.run();
    }

    public static void lambda$prepareSendingText$124(java.lang.CharSequence r24, org.telegram.messenger.AccountInstance r25, long r26, long r28, boolean r30, int r31, int r32, long r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.lambda$prepareSendingText$124(java.lang.CharSequence, org.telegram.messenger.AccountInstance, long, long, boolean, int, int, long):void");
    }

    public static void lambda$prepareSendingText$125(CharSequence charSequence, AccountInstance accountInstance, long j3, long j10, boolean z10, int i10, int i11, long j11) {
        AndroidUtilities.runOnUIThread(new xi(charSequence, accountInstance, j3, j10, z10, i10, i11, j11, 1));
    }

    public static void lambda$prepareSendingText$126(CharSequence charSequence, AccountInstance accountInstance, long j3, long j10, boolean z10, int i10, int i11, long j11) {
        Utilities.stageQueue.postRunnable(new xi(charSequence, accountInstance, j3, j10, z10, i10, i11, j11, 2));
    }

    public static void lambda$prepareSendingVideo$136(Bitmap bitmap, String str, MessageObject messageObject, AccountInstance accountInstance, VideoEditedInfo videoEditedInfo, TLRPC.TL_document tL_document, String str2, TLRPC.PhotoSize photoSize, HashMap hashMap, boolean z10, String str3, long j3, MessageObject messageObject2, MessageObject messageObject3, String str4, ArrayList arrayList, boolean z11, int i10, int i11, int i12, TL_stories.StoryItem storyItem, tn tnVar, SendMessageChatArguments sendMessageChatArguments, long j10, long j11, long j12, MessageSuggestionParams messageSuggestionParams, boolean z12) {
        if (bitmap != null && str != null) {
            ImageLoader.getInstance().putImageToCache(new BitmapDrawable(bitmap), str, false);
        }
        if (messageObject != null) {
            accountInstance.getSendMessagesHelper().editMessage(messageObject, null, videoEditedInfo, tL_document, str2, photoSize, hashMap, false, z10, str3);
            return;
        }
        SendMessageParams of2 = SendMessageParams.of(tL_document, videoEditedInfo, str2, j3, messageObject2, messageObject3, str4, arrayList, null, hashMap, z11, i10, i11, i12, str3, null, false, z10);
        of2.replyToStoryItem = storyItem;
        of2.replyQuote = tnVar;
        of2.sendMessageChatArguments = sendMessageChatArguments;
        of2.effect_id = j10;
        of2.cover = photoSize;
        of2.payStars = j11;
        of2.monoForumPeer = j12;
        of2.suggestionParams = messageSuggestionParams;
        of2.invert_media = z12;
        accountInstance.getSendMessagesHelper().sendMessage(of2);
    }

    public static void lambda$prepareSendingVideo$137(org.telegram.messenger.VideoEditedInfo r37, java.lang.String r38, final long r39, final int r41, final org.telegram.messenger.AccountInstance r42, java.lang.String r43, org.telegram.tgnet.TLRPC.Photo r44, java.lang.CharSequence r45, final org.telegram.messenger.MessageObject r46, final boolean r47, final org.telegram.messenger.MessageObject r48, final org.telegram.messenger.MessageObject r49, final java.util.ArrayList r50, final boolean r51, final int r52, final int r53, final org.telegram.tgnet.tl.TL_stories.StoryItem r54, final org.telegram.ui.tn r55, final org.telegram.messenger.SendMessageChatArguments r56, final long r57, final long r59, final long r61, final org.telegram.messenger.MessageSuggestionParams r63, final boolean r64, boolean r65) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.lambda$prepareSendingVideo$137(org.telegram.messenger.VideoEditedInfo, java.lang.String, long, int, org.telegram.messenger.AccountInstance, java.lang.String, org.telegram.tgnet.TLRPC$Photo, java.lang.CharSequence, org.telegram.messenger.MessageObject, boolean, org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject, java.util.ArrayList, boolean, int, int, org.telegram.tgnet.tl.TL_stories$StoryItem, org.telegram.ui.tn, org.telegram.messenger.SendMessageChatArguments, long, long, long, org.telegram.messenger.MessageSuggestionParams, boolean, boolean):void");
    }

    public void lambda$processUnsentMessages$104(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        HashMap<String, String> hashMap;
        getMessagesController().putUsers(arrayList, true);
        getMessagesController().putChats(arrayList2, true);
        getMessagesController().putEncryptedChats(arrayList3, true);
        int size = arrayList4.size();
        for (int i10 = 0; i10 < size; i10++) {
            MessageObject messageObject = new MessageObject(this.currentAccount, (TLRPC.Message) arrayList4.get(i10), false, true);
            long groupId = messageObject.getGroupId();
            if (groupId != 0 && (hashMap = messageObject.messageOwner.params) != null && !hashMap.containsKey("final") && (i10 == size - 1 || ((TLRPC.Message) arrayList4.get(i10 + 1)).grouped_id != groupId)) {
                messageObject.messageOwner.params.put("final", "1");
            }
            retrySendMessage(messageObject, true, 0L);
        }
        if (arrayList5 != null) {
            for (int i11 = 0; i11 < arrayList5.size(); i11++) {
                MessageObject messageObject2 = new MessageObject(this.currentAccount, (TLRPC.Message) arrayList5.get(i11), false, true);
                messageObject2.scheduled = true;
                retrySendMessage(messageObject2, true, 0L);
            }
        }
    }

    public void lambda$putToSendingMessages$61(TLRPC.Message message, boolean z10) {
        putToSendingMessages(message, z10, true);
    }

    public void lambda$requestUrlAuth$36(TLObject tLObject, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, eo eoVar, String str, boolean z10) {
        if (tLObject != null) {
            if (tLObject instanceof TLRPC.TL_urlAuthResultRequest) {
                kl0.b(false, this.currentAccount, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject, null, null, null, false, null);
                return;
            } else if (tLObject instanceof TLRPC.TL_urlAuthResultAccepted) {
                kl0.b(false, this.currentAccount, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject, null, null, null, false, null);
                return;
            } else if (tLObject instanceof TLRPC.TL_urlAuthResultDefault) {
                org.telegram.ui.Components.d5.q0(eoVar, str, false, z10);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Components.d5.q0(eoVar, str, false, z10);
    }

    public void lambda$requestUrlAuth$37(TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, eo eoVar, String str, boolean z10, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new i2.a1(this, tLObject, tL_messages_requestUrlAuth, eoVar, str, z10, 4));
    }

    public void lambda$sendCallback$38(String str, List list) {
        this.waitingForCallback.remove(str);
        list.remove(str);
    }

    public void lambda$sendCallback$41(boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, eo eoVar, org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        tj tjVar = new tj(messageObject, this, keyboardButtonProto, eoVar, twoStepVerificationActivity, z10);
        twoStepVerificationActivity.Z = 0;
        twoStepVerificationActivity.f30703b0 = tjVar;
        eoVar.presentFragment(twoStepVerificationActivity);
    }

    public static void lambda$sendCallback$42(eo eoVar, org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        eoVar.presentFragment(new mh1(6, null));
    }

    public void lambda$sendCallback$43(TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, eo eoVar) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.I = password;
            TwoStepVerificationActivity.m0(password);
            lambda$sendCallback$40(z10, messageObject, keyboardButtonProto, twoStepVerificationActivity.l0(), twoStepVerificationActivity, eoVar);
        }
    }

    public void lambda$sendCallback$44(TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, eo eoVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new fg.y0(messageObject, this, tLObject, tL_error, keyboardButtonProto, eoVar, twoStepVerificationActivity, z10));
    }

    public void lambda$sendCallback$45(String str, List list, boolean z10, TLObject tLObject, final MessageObject messageObject, final TL_keyboard.KeyboardButtonProto keyboardButtonProto, final eo eoVar, final TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, final boolean z11) {
        int i10;
        int i11;
        int dp;
        int i12;
        int i13;
        int dp2;
        int i14;
        int i15;
        String str2;
        boolean z12;
        eo eoVar2;
        boolean z13;
        org.telegram.ui.Components.fh fhVar;
        this.waitingForCallback.remove(str);
        list.remove(str);
        if (z10 && tLObject == null) {
            sendCallback(false, messageObject, keyboardButtonProto, eoVar);
            return;
        }
        TLRPC.TL_game tL_game = null;
        if (tLObject != null) {
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.o0();
                twoStepVerificationActivity.finishFragment();
            }
            long fromChatId = messageObject.getFromChatId();
            long j3 = messageObject.messageOwner.via_bot_id;
            if (j3 != 0) {
                fromChatId = j3;
            }
            if (fromChatId > 0) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(fromChatId));
                if (user != null) {
                    str2 = ContactsController.formatName(user.first_name, user.last_name);
                }
                str2 = null;
            } else {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-fromChatId));
                if (chat != null) {
                    str2 = chat.title;
                }
                str2 = null;
            }
            if (str2 == null) {
                str2 = "bot";
            }
            TL_keyboard.TL_inlineButtonTypeUrlAuth tL_inlineButtonTypeUrlAuth = (TL_keyboard.TL_inlineButtonTypeUrlAuth) yf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class);
            if (tL_inlineButtonTypeUrlAuth != null) {
                if (tLObject instanceof TLRPC.TL_urlAuthResultRequest) {
                    kl0.b(false, this.currentAccount, (TLRPC.TL_messages_requestUrlAuth) tLObjectArr[0], (TLRPC.TL_urlAuthResultRequest) tLObject, tL_inlineButtonTypeUrlAuth.url, null, null, false, null);
                } else if (tLObject instanceof TLRPC.TL_urlAuthResultAccepted) {
                    kl0.b(false, this.currentAccount, (TLRPC.TL_messages_requestUrlAuth) tLObjectArr[0], (TLRPC.TL_urlAuthResultAccepted) tLObject, tL_inlineButtonTypeUrlAuth.url, null, null, false, null);
                } else if (tLObject instanceof TLRPC.TL_urlAuthResultDefault) {
                    org.telegram.ui.Components.d5.q0(eoVar, tL_inlineButtonTypeUrlAuth.url, false, true);
                }
            } else if (yf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
                    xh.v5.y(this.currentAccount, false).Y(messageObject, ((TLRPC.TL_payments_getPaymentForm) tLObjectArr[0]).invoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new bk(this, str, list, 1), new Object());
                } else if (tLObject instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
                    getMessagesController().putUsers(paymentForm.users, false);
                    eoVar.presentFragment(new wo0(paymentForm, messageObject, null, eoVar));
                } else if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
                    Context context = LaunchActivity.G1;
                    if (context == null) {
                        context = ApplicationLoader.applicationContext;
                    }
                    xh.z7.j1(context, this.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, null);
                } else if (tLObject instanceof TLRPC.PaymentReceipt) {
                    eoVar.presentFragment(new wo0((TLRPC.PaymentReceipt) tLObject));
                }
            } else {
                TLRPC.TL_messages_botCallbackAnswer tL_messages_botCallbackAnswer = (TLRPC.TL_messages_botCallbackAnswer) tLObject;
                TL_keyboard.TL_inlineButtonTypeCallback tL_inlineButtonTypeCallback = (TL_keyboard.TL_inlineButtonTypeCallback) yf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class);
                if (!z10 && tL_messages_botCallbackAnswer.cache_time != 0 && (tL_inlineButtonTypeCallback == null || !tL_inlineButtonTypeCallback.requires_password)) {
                    getMessagesStorage().saveBotCache(str, tL_messages_botCallbackAnswer);
                }
                String str3 = tL_messages_botCallbackAnswer.message;
                if (str3 != null) {
                    if (tL_messages_botCallbackAnswer.alert) {
                        if (eoVar.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eoVar.getParentActivity());
                            alertDialog$Builder.f17528a.R = str2;
                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                            String str4 = tL_messages_botCallbackAnswer.message;
                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                            d2Var.T = str4;
                            eoVar.showDialog(d2Var);
                            return;
                        }
                        return;
                    }
                    if (eoVar.N2 == null && eoVar.M0 != null && eoVar.getParentActivity() != null) {
                        FrameLayout frameLayout = new FrameLayout(eoVar.getParentActivity());
                        eoVar.N2 = frameLayout;
                        eoVar.M0.addView(frameLayout, w7.a6.n(-1, 48));
                        eoVar.M0.h(11, eoVar.N2);
                        eoVar.M0.g(eoVar.N2);
                        TextView textView = new TextView(eoVar.getParentActivity());
                        eoVar.P2 = textView;
                        textView.setTextSize(1, 14.0f);
                        eoVar.P2.setTextColor(eoVar.getThemedColor(org.telegram.ui.ActionBar.j6.fe));
                        eoVar.P2.setTypeface(AndroidUtilities.bold());
                        eoVar.P2.setSingleLine(true);
                        TextView textView2 = eoVar.P2;
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        textView2.setEllipsize(truncateAt);
                        eoVar.P2.setMaxLines(1);
                        eoVar.N2.addView(eoVar.P2, w7.a6.d(-2, -2.0f, 51, 8.0f, 5.0f, 8.0f, 0.0f));
                        TextView textView3 = new TextView(eoVar.getParentActivity());
                        eoVar.Q2 = textView3;
                        textView3.setTextSize(1, 14.0f);
                        eoVar.Q2.setTextColor(eoVar.getThemedColor(org.telegram.ui.ActionBar.j6.f17988ge));
                        eoVar.Q2.setSingleLine(true);
                        eoVar.Q2.setEllipsize(truncateAt);
                        eoVar.Q2.setMaxLines(1);
                        eoVar.N2.addView(eoVar.Q2, w7.a6.d(-2, -2.0f, 51, 8.0f, 23.0f, 8.0f, 0.0f));
                    }
                    FrameLayout frameLayout2 = eoVar.N2;
                    if (frameLayout2 != null && (fhVar = eoVar.M0) != null) {
                        fhVar.i(frameLayout2, true, true);
                        eoVar.P2.setText(str2);
                        eoVar.Q2.setText(Emoji.replaceEmoji(str3.replace('\n', ' '), eoVar.Q2.getPaint().getFontMetricsInt(), false));
                        org.telegram.ui.pk pkVar = eoVar.O2;
                        if (pkVar != null) {
                            AndroidUtilities.cancelRunOnUIThread(pkVar);
                        }
                        org.telegram.ui.pk pkVar2 = new org.telegram.ui.pk(eoVar, 1);
                        eoVar.O2 = pkVar2;
                        AndroidUtilities.runOnUIThread(pkVar2, 3000L);
                    }
                } else if (tL_messages_botCallbackAnswer.url != null && eoVar.getParentActivity() != null) {
                    TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(fromChatId));
                    if (user2 != null && user2.verified) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (yf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                        TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                            tL_game = messageMedia.game;
                        }
                        TLRPC.TL_game tL_game2 = tL_game;
                        if (tL_game2 != null) {
                            String str5 = tL_messages_botCallbackAnswer.url;
                            if (!z12 && a2.v("askgame_", fromChatId, MessagesController.getNotificationsSettings(this.currentAccount), true)) {
                                eoVar2 = eoVar;
                                z13 = true;
                            } else {
                                eoVar2 = eoVar;
                                z13 = false;
                            }
                            eoVar2.Mb(tL_game2, messageObject, str5, z13, fromChatId);
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Components.d5.q0(eoVar, tL_messages_botCallbackAnswer.url, false, false);
                }
            }
        } else if (tL_error != null && eoVar.getParentActivity() != null) {
            if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
                if (inputCheckPasswordSRP == null) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(eoVar.getParentActivity());
                    alertDialog$Builder2.f17528a.R = LocaleController.getString(R.string.BotOwnershipTransfer);
                    alertDialog$Builder2.f17528a.T = AndroidUtilities.replaceTags(LocaleController.formatString("BotOwnershipTransferReadyAlertText", R.string.BotOwnershipTransferReadyAlertText, new Object[0]));
                    alertDialog$Builder2.k(LocaleController.getString(R.string.BotOwnershipTransferChangeOwner), new jk(this, z11, messageObject, keyboardButtonProto, eoVar));
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    eoVar.showDialog(alertDialog$Builder2.f17528a);
                }
            } else if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                if ("SRP_ID_INVALID".equals(tL_error.text)) {
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                            TL_keyboard.KeyboardButtonProto keyboardButtonProto2 = keyboardButtonProto;
                            eo eoVar3 = eoVar;
                            this.lambda$sendCallback$44(twoStepVerificationActivity, z11, messageObject, keyboardButtonProto2, eoVar3, tLObject2, tL_error2);
                        }
                    }, 8);
                } else if (twoStepVerificationActivity != null) {
                    twoStepVerificationActivity.o0();
                    twoStepVerificationActivity.finishFragment();
                }
            } else {
                if (twoStepVerificationActivity != null) {
                    twoStepVerificationActivity.o0();
                }
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(eoVar.getParentActivity());
                alertDialog$Builder3.f17528a.R = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
                LinearLayout linearLayout = new LinearLayout(eoVar.getParentActivity());
                linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
                linearLayout.setOrientation(1);
                alertDialog$Builder3.n(linearLayout);
                TextView textView4 = new TextView(eoVar.getParentActivity());
                int i16 = org.telegram.ui.ActionBar.j6.f18034j5;
                textView4.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
                textView4.setTextSize(1, 16.0f);
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView4.setGravity(i10 | 48);
                textView4.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BotOwnershipTransferAlertText", R.string.BotOwnershipTransferAlertText, new Object[0])));
                linearLayout.addView(textView4, w7.a6.n(-1, -2));
                LinearLayout linearLayout2 = new LinearLayout(eoVar.getParentActivity());
                linearLayout2.setOrientation(0);
                linearLayout.addView(linearLayout2, w7.a6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                ImageView imageView = new ImageView(eoVar.getParentActivity());
                imageView.setImageResource(R.drawable.list_circle);
                if (LocaleController.isRTL) {
                    i11 = AndroidUtilities.dp(11.0f);
                } else {
                    i11 = 0;
                }
                int dp3 = AndroidUtilities.dp(9.0f);
                if (LocaleController.isRTL) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(11.0f);
                }
                imageView.setPadding(i11, dp3, dp, 0);
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, i16, false);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
                TextView textView5 = new TextView(eoVar.getParentActivity());
                textView5.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
                textView5.setTextSize(1, 16.0f);
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                textView5.setGravity(i12 | 48);
                a2.n(R.string.EditAdminTransferAlertText1, textView5);
                if (LocaleController.isRTL) {
                    linearLayout2.addView(textView5, w7.a6.n(-1, -2));
                    linearLayout2.addView(imageView, w7.a6.q(-2, -2, 5));
                } else {
                    linearLayout2.addView(imageView, w7.a6.n(-2, -2));
                    linearLayout2.addView(textView5, w7.a6.n(-1, -2));
                }
                LinearLayout linearLayout3 = new LinearLayout(eoVar.getParentActivity());
                linearLayout3.setOrientation(0);
                linearLayout.addView(linearLayout3, w7.a6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                ImageView imageView2 = new ImageView(eoVar.getParentActivity());
                imageView2.setImageResource(R.drawable.list_circle);
                if (LocaleController.isRTL) {
                    i13 = AndroidUtilities.dp(11.0f);
                } else {
                    i13 = 0;
                }
                int dp4 = AndroidUtilities.dp(9.0f);
                if (LocaleController.isRTL) {
                    dp2 = 0;
                } else {
                    dp2 = AndroidUtilities.dp(11.0f);
                }
                imageView2.setPadding(i13, dp4, dp2, 0);
                imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i16, false), mode));
                TextView textView6 = new TextView(eoVar.getParentActivity());
                textView6.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
                textView6.setTextSize(1, 16.0f);
                if (LocaleController.isRTL) {
                    i14 = 5;
                } else {
                    i14 = 3;
                }
                textView6.setGravity(i14 | 48);
                a2.n(R.string.EditAdminTransferAlertText2, textView6);
                if (LocaleController.isRTL) {
                    linearLayout3.addView(textView6, w7.a6.n(-1, -2));
                    linearLayout3.addView(imageView2, w7.a6.q(-2, -2, 5));
                } else {
                    linearLayout3.addView(imageView2, w7.a6.n(-2, -2));
                    linearLayout3.addView(textView6, w7.a6.n(-1, -2));
                }
                if ("PASSWORD_MISSING".equals(tL_error.text)) {
                    alertDialog$Builder3.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new c0(eoVar, 13));
                    alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                } else {
                    TextView textView7 = new TextView(eoVar.getParentActivity());
                    textView7.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
                    textView7.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i15 = 5;
                    } else {
                        i15 = 3;
                    }
                    textView7.setGravity(i15 | 48);
                    textView7.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                    linearLayout.addView(textView7, w7.a6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    alertDialog$Builder3.h(LocaleController.getString(R.string.OK), null);
                }
                eoVar.showDialog(alertDialog$Builder3.f17528a);
            }
        }
    }

    public void lambda$sendCallback$46(final String str, final List list, final boolean z10, final MessageObject messageObject, final TL_keyboard.KeyboardButtonProto keyboardButtonProto, final eo eoVar, final TwoStepVerificationActivity twoStepVerificationActivity, final TLObject[] tLObjectArr, final TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, final boolean z11, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP2 = inputCheckPasswordSRP;
                boolean z12 = z11;
                String str2 = str;
                List list2 = list;
                MessageObject messageObject2 = messageObject;
                SendMessagesHelper sendMessagesHelper = this;
                TLObject tLObject2 = tLObject;
                TLRPC.TL_error tL_error2 = tL_error;
                sendMessagesHelper.lambda$sendCallback$45(str2, list2, z10, tLObject2, messageObject2, keyboardButtonProto, eoVar, twoStepVerificationActivity, tLObjectArr, tL_error2, inputCheckPasswordSRP2, z12);
            }
        });
    }

    public void lambda$sendEditRichMessageRequest$22(MessageObject messageObject) {
        onRichEditFinished(messageObject, false);
    }

    public void lambda$sendEditRichMessageRequest$24(MessageObject messageObject) {
        onRichEditFinished(messageObject, true);
    }

    public void lambda$sendEditRichMessageRequest$25(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.p2 p2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage) {
        org.telegram.ui.Components.d5.f0(this.currentAccount, tL_error, p2Var, tL_messages_editMessage, new Object[0]);
    }

    public void lambda$sendEditRichMessageRequest$26(boolean z10, final MessageObject messageObject, TLRPC.TL_messages_editMessage tL_messages_editMessage, org.telegram.ui.ActionBar.p2 p2Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            if (z10 && messageObject != null) {
                messageObject.richCheckboxEcho = true;
            }
            getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final SendMessagesHelper f17087b;

                {
                    this.f17087b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            this.f17087b.lambda$sendEditRichMessageRequest$22(messageObject);
                            return;
                        default:
                            this.f17087b.lambda$sendEditRichMessageRequest$24(messageObject);
                            return;
                    }
                }
            });
        } else if (!FileRefController.isFileRefError(tL_error.text) || !requestRichMessageFileReference(messageObject, tL_messages_editMessage, tL_error.text, new bi.e2(this, tL_messages_editMessage, messageObject, p2Var, z10, 9))) {
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final SendMessagesHelper f17087b;

                {
                    this.f17087b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            this.f17087b.lambda$sendEditRichMessageRequest$22(messageObject);
                            return;
                        default:
                            this.f17087b.lambda$sendEditRichMessageRequest$24(messageObject);
                            return;
                    }
                }
            });
            if (p2Var != null) {
                AndroidUtilities.runOnUIThread(new zi(this, tL_error, p2Var, tL_messages_editMessage, 0));
            }
        }
    }

    public void lambda$sendGame$47(long j3, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
        }
        if (j3 != 0) {
            getMessagesStorage().removePendingTask(j3);
        }
    }

    public void lambda$sendMessage$10(ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13) {
        getMessagesStorage().getStorageQueue().postRunnable(new vj(this, arrayList, i10, i11, message, i12, message2, messageObject, i13, 0));
    }

    public void lambda$sendMessage$11(long j3, ArrayList arrayList) {
        getMessagesController().markDialogMessageAsDeleted(j3, arrayList);
    }

    public void lambda$sendMessage$12(TLRPC.Message message, long j3, int i10, TLRPC.Message message2, int i11, int i12) {
        boolean z10;
        boolean z11;
        boolean z12;
        message.send_state = 0;
        getMediaDataController().increasePeerRaiting(j3);
        NotificationCenter notificationCenter = getNotificationCenter();
        int i13 = NotificationCenter.messageReceivedByServer;
        Integer valueOf = Integer.valueOf(i10);
        Integer valueOf2 = Integer.valueOf(message2.f17216id);
        Long valueOf3 = Long.valueOf(j3);
        Integer valueOf4 = Integer.valueOf(i11);
        if (i12 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i13, valueOf, valueOf2, message2, valueOf3, 0L, valueOf4, Boolean.valueOf(z10));
        NotificationCenter notificationCenter2 = getNotificationCenter();
        int i14 = NotificationCenter.messageReceivedByServer2;
        Integer valueOf5 = Integer.valueOf(i10);
        Integer valueOf6 = Integer.valueOf(message2.f17216id);
        Long valueOf7 = Long.valueOf(j3);
        Integer valueOf8 = Integer.valueOf(i11);
        if (i12 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        notificationCenter2.lambda$postNotificationNameOnUIThread$1(i14, valueOf5, valueOf6, message2, valueOf7, 0L, valueOf8, Boolean.valueOf(z11));
        processSentMessage(i10);
        if (i12 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        removeFromSendingMessages(i10, z12);
    }

    public void lambda$sendMessage$13(final int i10, final TLRPC.Message message, final TLRPC.Message message2, TLRPC.Peer peer, final int i11, ArrayList arrayList, final long j3, final int i12) {
        int i13;
        int i14;
        int i15;
        if (i10 != 0) {
            i13 = 1;
        } else {
            i13 = 0;
        }
        if (MessageObject.isWelcomeMessage(message)) {
            i14 = 9;
        } else if (message.quick_reply_shortcut_id == 0 && message.quick_reply_shortcut == null) {
            i14 = i13;
        } else {
            i14 = 5;
        }
        MessagesStorage messagesStorage = getMessagesStorage();
        long j10 = message2.random_id;
        long peerId = MessageObject.getPeerId(peer);
        Integer valueOf = Integer.valueOf(i11);
        int i16 = message2.f17216id;
        if (i10 != 0) {
            i15 = 1;
        } else {
            i15 = 0;
        }
        messagesStorage.updateMessageStateAndId(j10, peerId, valueOf, i16, 0, false, i15, message.quick_reply_shortcut_id);
        getMessagesStorage().putMessages((ArrayList<TLRPC.Message>) arrayList, true, false, false, 0, i14, message.quick_reply_shortcut_id);
        if (MessageObject.isEphemeralAndNotWelcome(message2)) {
            long peerId2 = MessageObject.getPeerId(message2.peer_id);
            ArrayList<Integer> arrayList2 = new ArrayList<>(1);
            arrayList2.add(Integer.valueOf(message2.f17216id));
            getMessagesStorage().markMessagesAsDeleted(peerId2, arrayList2, false, false, i14, (int) MessageObject.getTopicId(this.currentAccount, message2, 0));
            getMessagesStorage().updateDialogsWithDeletedMessages(peerId2, -peerId2, arrayList2, null);
            AndroidUtilities.runOnUIThread(new bj(this, peerId2, arrayList2, 0));
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SendMessagesHelper.this.lambda$sendMessage$12(message2, j3, i11, message, i12, i10);
            }
        });
    }

    public void lambda$sendMessage$14(TLRPC.TL_error tL_error, TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages) {
        org.telegram.ui.Components.d5.f0(this.currentAccount, tL_error, null, tL_messages_forwardMessages, new Object[0]);
    }

    public void lambda$sendMessage$15(TLRPC.Message message, int i10) {
        message.send_state = 2;
        boolean z10 = true;
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageSendError, Integer.valueOf(message.f17216id));
        processSentMessage(message.f17216id);
        int i11 = message.f17216id;
        if (i10 == 0) {
            z10 = false;
        }
        removeFromSendingMessages(i11, z10);
    }

    public void lambda$sendMessage$16(ArrayList arrayList) {
        xh.v5.y(this.currentAccount, false).f0(arrayList);
    }

    public void lambda$sendMessage$17(final long r24, final int r26, boolean r27, boolean r28, a0.i r29, java.util.ArrayList r30, java.util.ArrayList r31, org.telegram.messenger.MessageObject r32, final org.telegram.tgnet.TLRPC.Peer r33, org.telegram.tgnet.TLRPC.TL_messages_forwardMessages r34, org.telegram.tgnet.TLObject r35, org.telegram.tgnet.TLRPC.TL_error r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.lambda$sendMessage$17(long, int, boolean, boolean, a0.i, java.util.ArrayList, java.util.ArrayList, org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$Peer, org.telegram.tgnet.TLRPC$TL_messages_forwardMessages, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    public void lambda$sendMessage$18(final TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages, final long j3, final int i10, final boolean z10, final boolean z11, final a0.i iVar, final ArrayList arrayList, final ArrayList arrayList2, final MessageObject messageObject, final TLRPC.Peer peer) {
        getConnectionsManager().sendRequest(tL_messages_forwardMessages, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.lambda$sendMessage$17(j3, i10, z10, z11, iVar, arrayList, arrayList2, messageObject, peer, tL_messages_forwardMessages, tLObject, tL_error);
            }
        }, 68);
    }

    public void lambda$sendMessage$19(TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages, ArrayList arrayList, Runnable runnable) {
        if (BotForumHelper.getInstance(this.currentAccount).beforeSendingFinalRequest(tL_messages_forwardMessages, arrayList, runnable)) {
            runnable.run();
        }
    }

    public void lambda$sendMessage$48(SendMessageParams sendMessageParams, Long l4) {
        sendMessageParams.payStars = l4.longValue();
        sendMessage(sendMessageParams);
    }

    public void lambda$sendMessage$7(ArrayList arrayList, long j3, boolean z10, boolean z11, boolean z12, int i10, int i11, MessageObject messageObject, int i12, long j10, MessageSuggestionParams messageSuggestionParams, Long l4) {
        sendMessage(arrayList, j3, z10, z11, z12, i10, i11, messageObject, i12, l4.longValue(), j10, messageSuggestionParams);
    }

    public void lambda$sendMessage$8(int i10, TLRPC.Message message, int i11, int i12, TLRPC.Message message2, MessageObject messageObject, int i13) {
        boolean z10;
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(i10));
        MessagesController messagesController = getMessagesController();
        long j3 = message.dialog_id;
        if (i12 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = true;
        messagesController.deleteMessages(arrayList, null, null, j3, false, i11, false, 0L, null, 0, z10, message2.f17216id);
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        arrayList2.add(new MessageObject(messageObject.currentAccount, messageObject.messageOwner, true, true));
        getMessagesController().updateInterfaceWithMessages(message.dialog_id, arrayList2, i12);
        getMediaDataController().increasePeerRaiting(message.dialog_id);
        processSentMessage(i10);
        if (i13 == 0) {
            z11 = false;
        }
        removeFromSendingMessages(i10, z11);
    }

    public void lambda$sendMessage$9(ArrayList arrayList, final int i10, final int i11, final TLRPC.Message message, final int i12, final TLRPC.Message message2, final MessageObject messageObject, final int i13) {
        getMessagesStorage().putMessages((ArrayList<TLRPC.Message>) arrayList, true, false, false, 0, i10, 0L);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SendMessagesHelper.this.lambda$sendMessage$8(i11, message, i12, i10, message2, messageObject, i13);
            }
        });
    }

    public void lambda$sendNotificationCallback$28(String str, List list) {
        this.waitingForCallback.remove(str);
        list.remove(str);
    }

    public void lambda$sendNotificationCallback$29(String str, List list, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new bk(this, str, list, 0));
    }

    public void lambda$sendNotificationCallback$30(long j3, int i10, byte[] bArr) {
        TLRPC.Chat chatSync;
        TLRPC.User userSync;
        String str = j3 + "_" + i10 + "_" + Utilities.bytesToHex(bArr) + "_0";
        this.waitingForCallback.put(str, Boolean.TRUE);
        List<String> list = this.waitingForCallbackMap.get(j3 + "_" + i10);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.waitingForCallbackMap.put(j3 + "_" + i10, arrayList);
            list = arrayList;
        }
        list.add(str);
        if (DialogObject.isUserDialog(j3)) {
            if (getMessagesController().getUser(Long.valueOf(j3)) == null && (userSync = getMessagesStorage().getUserSync(j3)) != null) {
                getMessagesController().putUser(userSync, true);
            }
        } else {
            long j10 = -j3;
            if (getMessagesController().getChat(Long.valueOf(j10)) == null && (chatSync = getMessagesStorage().getChatSync(j10)) != null) {
                getMessagesController().putChat(chatSync, true);
            }
        }
        TLRPC.TL_messages_getBotCallbackAnswer tL_messages_getBotCallbackAnswer = new TLRPC.TL_messages_getBotCallbackAnswer();
        tL_messages_getBotCallbackAnswer.peer = getMessagesController().getInputPeer(j3);
        tL_messages_getBotCallbackAnswer.msg_id = i10;
        tL_messages_getBotCallbackAnswer.game = false;
        if (bArr != null) {
            tL_messages_getBotCallbackAnswer.flags = 1 | tL_messages_getBotCallbackAnswer.flags;
            tL_messages_getBotCallbackAnswer.data = bArr;
        }
        getConnectionsManager().sendRequest(tL_messages_getBotCallbackAnswer, new b8(this, str, list, 11), 2);
        getMessagesController().markDialogAsRead(j3, i10, i10, 0, false, 0L, 0, true, 0);
    }

    public void lambda$sendReaction$35(Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
            }
        }
    }

    public void lambda$sendSticker$5(Bitmap[] bitmapArr, String[] strArr, TLRPC.Document document, VideoEditedInfo videoEditedInfo, long j3, MessageObject messageObject, MessageObject messageObject2, boolean z10, int i10, int i11, Object obj, MessageObject.SendAnimationData sendAnimationData, TL_stories.StoryItem storyItem, tn tnVar, SendMessageChatArguments sendMessageChatArguments, long j10, long j11, MessageSuggestionParams messageSuggestionParams, CharSequence charSequence, boolean z11) {
        String str;
        if (bitmapArr[0] != null && strArr[0] != null) {
            ImageLoader.getInstance().putImageToCache(new BitmapDrawable(bitmapArr[0]), strArr[0], false);
        }
        SendMessageParams of2 = SendMessageParams.of((TLRPC.TL_document) document, videoEditedInfo, null, j3, messageObject, messageObject2, null, null, null, null, z10, i10, i11, 0, obj, sendAnimationData, false);
        of2.replyToStoryItem = storyItem;
        of2.replyQuote = tnVar;
        of2.sendMessageChatArguments = sendMessageChatArguments;
        of2.payStars = j10;
        of2.monoForumPeer = j11;
        of2.suggestionParams = messageSuggestionParams;
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = null;
        }
        of2.caption = str;
        of2.invert_media = z11;
        sendMessage(of2);
    }

    public void lambda$sendSticker$6(final TLRPC.Document document, final VideoEditedInfo videoEditedInfo, final long j3, final MessageObject messageObject, final MessageObject messageObject2, final boolean z10, final int i10, final int i11, final Object obj, final MessageObject.SendAnimationData sendAnimationData, final TL_stories.StoryItem storyItem, final tn tnVar, final SendMessageChatArguments sendMessageChatArguments, final long j10, final long j11, final MessageSuggestionParams messageSuggestionParams, final CharSequence charSequence, final boolean z11) {
        String str;
        final Bitmap[] bitmapArr = new Bitmap[1];
        String key = ImageLocation.getForDocument(document).getKey(null, null, false);
        if ("video/mp4".equals(document.mime_type)) {
            str = ".mp4";
        } else if ("video/x-matroska".equals(document.mime_type)) {
            str = ".mkv";
        } else {
            str = "";
        }
        File file = new File(FileLoader.getDirectory(3), org.telegram.ui.Cells.r6.t(key, str));
        if (!file.exists()) {
            file = new File(FileLoader.getDirectory(2), org.telegram.ui.Cells.r6.t(key, str));
        }
        ensureMediaThumbExists(getAccountInstance(), false, document, file.getAbsolutePath(), null, 0L);
        final String[] strArr = {getKeyForPhotoSize(getAccountInstance(), FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320), bitmapArr, true, true)};
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SendMessagesHelper.this.lambda$sendSticker$5(bitmapArr, strArr, document, videoEditedInfo, j3, messageObject, messageObject2, z10, i10, i11, obj, sendAnimationData, storyItem, tnVar, sendMessageChatArguments, j10, j11, messageSuggestionParams, charSequence, z11);
            }
        });
    }

    public void lambda$sendVote$31(String str, Runnable runnable) {
        this.waitingForVote.remove(str);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$sendVote$32(MessageObject messageObject, String str, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            this.voteSendTime.k(0L, messageObject.getPollId());
            getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
            this.voteSendTime.k(Long.valueOf(SystemClock.elapsedRealtime()), messageObject.getPollId());
        }
        AndroidUtilities.runOnUIThread(new g9(this, str, runnable, 23));
    }

    public void lambda$toggleTodo$33(int i10, boolean z10, Runnable runnable) {
        Boolean bool = this.waitingForTodoUpdate.get(Integer.valueOf(i10));
        if (bool != null && bool.booleanValue() == z10) {
            this.waitingForTodoUpdate.remove(Integer.valueOf(i10));
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$toggleTodo$34(MessageObject messageObject, TLRPC.TodoItem todoItem, boolean z10, long j3, int i10, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            getMessagesStorage().toggleTodo(messageObject.getDialogId(), messageObject.getId(), todoItem.f17340id, z10, j3);
            getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
        }
        AndroidUtilities.runOnUIThread(new z4(this, i10, z10, runnable, 4));
    }

    public void lambda$uploadMultiMedia$59(org.telegram.tgnet.TLObject r7, org.telegram.tgnet.TLRPC.InputMedia r8, org.telegram.messenger.SendMessagesHelper.DelayedMessage r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.lambda$uploadMultiMedia$59(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$InputMedia, org.telegram.messenger.SendMessagesHelper$DelayedMessage):void");
    }

    public void lambda$uploadMultiMedia$60(TLRPC.InputMedia inputMedia, DelayedMessage delayedMessage, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new xj(this, tLObject, inputMedia, delayedMessage, 0));
    }

    private void notifyRichMessageEditing(MessageObject messageObject) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.replaceMessagesObjects, Long.valueOf(messageObject.getDialogId()), a2.l(messageObject));
    }

    private void onRichEditFinished(MessageObject messageObject, boolean z10) {
        TLRPC.Message message;
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            message.reqId = 0;
            if (z10 && message.send_state == 3) {
                message.send_state = 0;
                notifyRichMessageEditing(messageObject);
            }
        }
    }

    private void performSendDelayedMessage(DelayedMessage delayedMessage) {
        performSendDelayedMessage(delayedMessage, -1);
    }

    public void performSendMessageRequest(TLObject tLObject, MessageObject messageObject, String str, DelayedMessage delayedMessage, Object obj, HashMap<String, String> hashMap, boolean z10) {
        lambda$performSendMessageRequest$82(tLObject, messageObject, str, null, false, delayedMessage, obj, hashMap, z10);
    }

    public static void prepareEditingArticle(AccountInstance accountInstance, MessageObject messageObject, ArrayList<TL_iv.PageBlock> arrayList, ArrayList<TLRPC.Photo> arrayList2, ArrayList<TLRPC.Document> arrayList3, ArrayList<TLRPC.InputUser> arrayList4, boolean z10, org.telegram.ui.ActionBar.p2 p2Var) {
        if (messageObject != null && arrayList != null && !arrayList.isEmpty()) {
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            richMessage.rtl = z10;
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                TL_iv.PageBlock pageBlock = arrayList.get(i11);
                i11++;
                TL_iv.PageBlock pageBlock2 = pageBlock;
                if (pageBlock2 != null) {
                    richMessage.blocks.add(pageBlock2);
                }
            }
            if (!richMessage.blocks.isEmpty()) {
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    richMessage.photos.addAll(arrayList2);
                }
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    richMessage.documents.addAll(arrayList3);
                }
                IdentityHashMap identityHashMap = new IdentityHashMap();
                ArrayList<TL_iv.PageBlock> arrayList5 = richMessage.blocks;
                int size2 = arrayList5.size();
                while (i10 < size2) {
                    TL_iv.PageBlock pageBlock3 = arrayList5.get(i10);
                    i10++;
                    clearRichTextParentsInBlock(pageBlock3, identityHashMap);
                }
                accountInstance.getSendMessagesHelper().editRichMessage(messageObject, richMessage, arrayList4, p2Var, false);
            }
        }
    }

    public static void prepareSendingArticle(AccountInstance accountInstance, ArrayList<TL_iv.PageBlock> arrayList, boolean z10, long j3, MessageObject messageObject, MessageObject messageObject2, boolean z11, int i10, int i11, SendMessageChatArguments sendMessageChatArguments, long j10, long j11, long j12) {
        prepareSendingArticle(accountInstance, arrayList, null, null, null, z10, j3, messageObject, messageObject2, z11, i10, i11, sendMessageChatArguments, j10, j11, j12);
    }

    public static void prepareSendingAudioDocuments(AccountInstance accountInstance, ArrayList<MessageObject> arrayList, CharSequence charSequence, long j3, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, boolean z10, int i10, int i11, MessageObject messageObject3, SendMessageChatArguments sendMessageChatArguments, long j10, boolean z11, long j11) {
        prepareSendingAudioDocuments(accountInstance, arrayList, charSequence, j3, messageObject, messageObject2, storyItem, z10, i10, i11, messageObject3, sendMessageChatArguments, j10, z11, j11, null, null, false, null);
    }

    public static void prepareSendingBotContextResult(org.telegram.ui.ActionBar.p2 p2Var, AccountInstance accountInstance, TLRPC.BotInlineResult botInlineResult, HashMap<String, String> hashMap, long j3, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, tn tnVar, boolean z10, int i10, int i11, SendMessageChatArguments sendMessageChatArguments, long j10) {
        prepareSendingBotContextResult(p2Var, accountInstance, botInlineResult, hashMap, j3, messageObject, messageObject2, storyItem, tnVar, z10, i10, i11, sendMessageChatArguments, j10, 0L);
    }

    public static void prepareSendingDocument(AccountInstance accountInstance, String str, String str2, Uri uri, String str3, String str4, long j3, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, tn tnVar, MessageObject messageObject3, boolean z10, int i10, t0.i iVar, SendMessageChatArguments sendMessageChatArguments, boolean z11) {
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
        prepareSendingDocuments(accountInstance, (ArrayList<String>) arrayList2, (ArrayList<String>) arrayList3, (ArrayList<Uri>) arrayList, str3, str4, j3, messageObject, messageObject2, storyItem, tnVar, messageObject3, z10, i10, iVar, sendMessageChatArguments, 0L, z11, 0L);
    }

    private static int prepareSendingDocumentInternal(org.telegram.messenger.AccountInstance r36, java.lang.String r37, java.lang.String r38, android.net.Uri r39, java.lang.String r40, final long r41, final org.telegram.messenger.MessageObject r43, final org.telegram.messenger.MessageObject r44, final org.telegram.tgnet.tl.TL_stories.StoryItem r45, final org.telegram.ui.tn r46, final java.util.ArrayList<org.telegram.tgnet.TLRPC.MessageEntity> r47, final org.telegram.messenger.MessageObject r48, long[] r49, boolean r50, java.lang.CharSequence r51, final boolean r52, int r53, final int r54, java.lang.Integer[] r55, boolean r56, final org.telegram.messenger.SendMessageChatArguments r57, final long r58, final boolean r60, final long r61, final long r63, final org.telegram.messenger.MessageSuggestionParams r65, final ph.h r66, final int r67) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.prepareSendingDocumentInternal(org.telegram.messenger.AccountInstance, java.lang.String, java.lang.String, android.net.Uri, java.lang.String, long, org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject, org.telegram.tgnet.tl.TL_stories$StoryItem, org.telegram.ui.tn, java.util.ArrayList, org.telegram.messenger.MessageObject, long[], boolean, java.lang.CharSequence, boolean, int, int, java.lang.Integer[], boolean, org.telegram.messenger.SendMessageChatArguments, long, boolean, long, long, org.telegram.messenger.MessageSuggestionParams, ph.h, int):int");
    }

    public static void prepareSendingDocuments(AccountInstance accountInstance, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<Uri> arrayList3, String str, String str2, long j3, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, tn tnVar, MessageObject messageObject3, boolean z10, int i10, t0.i iVar, SendMessageChatArguments sendMessageChatArguments, long j10, boolean z11, long j11) {
        prepareSendingDocuments(accountInstance, arrayList, arrayList2, arrayList3, str, null, str2, j3, messageObject, messageObject2, storyItem, tnVar, messageObject3, z10, i10, 0, iVar, sendMessageChatArguments, j10, z11, j11, 0L, null);
    }

    public static void prepareSendingMedia(AccountInstance accountInstance, ArrayList<SendingMediaInfo> arrayList, long j3, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, tn tnVar, boolean z10, boolean z11, MessageObject messageObject3, boolean z12, int i10, int i11, int i12, boolean z13, t0.i iVar, SendMessageChatArguments sendMessageChatArguments, long j10, boolean z14, long j11, long j12, MessageSuggestionParams messageSuggestionParams) {
        prepareSendingMedia(accountInstance, arrayList, j3, messageObject, messageObject2, storyItem, tnVar, z10, z11, messageObject3, null, z12, i10, i11, i12, z13, iVar, sendMessageChatArguments, j10, z14, j11, j12, messageSuggestionParams);
    }

    public static void prepareSendingPhoto(AccountInstance accountInstance, String str, Uri uri, long j3, MessageObject messageObject, MessageObject messageObject2, tn tnVar, CharSequence charSequence, ArrayList<TLRPC.MessageEntity> arrayList, ArrayList<TLRPC.InputDocument> arrayList2, t0.i iVar, int i10, MessageObject messageObject3, boolean z10, int i11, int i12, SendMessageChatArguments sendMessageChatArguments) {
        prepareSendingPhoto(accountInstance, str, null, uri, j3, messageObject, messageObject2, null, null, arrayList, arrayList2, iVar, i10, messageObject3, null, z10, i11, 0, i12, false, charSequence, sendMessageChatArguments, 0L, 0L, 0L, null);
    }

    public static void prepareSendingPoll(final AccountInstance accountInstance, final ph.h hVar, final long j3, final MessageObject messageObject, final MessageObject messageObject2, final TL_stories.StoryItem storyItem, final tn tnVar, final boolean z10, final int i10, final SendMessageChatArguments sendMessageChatArguments, final long j10, final long j11, final MessageSuggestionParams messageSuggestionParams) {
        ph.h hVar2;
        boolean z11;
        boolean z12;
        boolean z13;
        ph.f fVar = hVar.f40427a;
        if (fVar != null) {
            final ArrayList arrayList = new ArrayList();
            final ArrayList arrayList2 = new ArrayList();
            final ArrayList arrayList3 = new ArrayList();
            final ArrayList arrayList4 = new ArrayList();
            final ArrayList arrayList5 = new ArrayList();
            final ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            ArrayList arrayList8 = new ArrayList();
            final int[] iArr = new int[1];
            SparseArray sparseArray = fVar.f40409a;
            SparseArray sparseArray2 = fVar.f40409a;
            int size = sparseArray.size();
            for (int i11 = 0; i11 < size; i11++) {
                ph.e eVar = (ph.e) sparseArray2.valueAt(i11);
                int keyAt = sparseArray2.keyAt(i11);
                if (eVar instanceof qh.g) {
                    arrayList7.add(((qh.g) eVar).f41024b);
                    arrayList8.add(Integer.valueOf(keyAt));
                } else if (eVar instanceof qh.d) {
                    SendingMediaInfo sendingMediaInfo = ((qh.d) eVar).f41016c;
                    sendingMediaInfo.pollIndex = keyAt;
                    arrayList.add(sendingMediaInfo);
                } else if (eVar instanceof qh.c) {
                    qh.c cVar = (qh.c) eVar;
                    String str = cVar.f41011b;
                    if (!TextUtils.isEmpty(str)) {
                        arrayList2.add(str);
                        arrayList3.add(str);
                        arrayList4.add(Integer.valueOf(keyAt));
                    } else {
                        Uri uri = cVar.f41012c;
                        if (uri != null) {
                            arrayList5.add(uri);
                            arrayList6.add(Integer.valueOf(keyAt));
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                iArr[0] = iArr[0] + 1;
                z11 = true;
            } else {
                z11 = false;
            }
            if (!arrayList2.isEmpty() || !arrayList5.isEmpty()) {
                iArr[0] = iArr[0] + 1;
                z11 = true;
            }
            if (!arrayList7.isEmpty()) {
                iArr[0] = iArr[0] + 1;
                z12 = true;
            } else {
                z12 = z11;
            }
            final ?? r19 = new Runnable() {
                @Override
                public final void run() {
                    SendMessagesHelper.lambda$prepareSendingPoll$133(arrayList2, arrayList5, accountInstance, arrayList3, j3, messageObject, messageObject2, storyItem, tnVar, z10, i10, sendMessageChatArguments, j10, j11, messageSuggestionParams, hVar, arrayList4, arrayList6);
                }
            };
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    SendMessagesHelper.lambda$prepareSendingPoll$135(arrayList, iArr, accountInstance, j3, messageObject, messageObject2, storyItem, tnVar, z10, i10, sendMessageChatArguments, j10, j11, messageSuggestionParams, hVar, r19);
                }
            };
            if (!arrayList7.isEmpty()) {
                int i12 = iArr[0] - 1;
                iArr[0] = i12;
                if (i12 > 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                prepareSendingAudioDocuments(accountInstance, arrayList7, "", j3, messageObject, messageObject2, storyItem, z10, i10, 0, null, sendMessageChatArguments, 0L, false, j10, hVar, arrayList8, z13, runnable);
                hVar2 = hVar;
            } else {
                hVar2 = hVar;
                runnable.run();
            }
            if (z12) {
                return;
            }
        } else {
            hVar2 = hVar;
        }
        SendMessageParams of2 = SendMessageParams.of(hVar2.f40428b, j3, messageObject, messageObject2, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
        of2.caption = hVar2.e;
        of2.invert_media = true;
        of2.entities = hVar2.f40430f;
        of2.sendMessageChatArguments = sendMessageChatArguments;
        of2.payStars = j10;
        of2.monoForumPeer = j11;
        of2.suggestionParams = messageSuggestionParams;
        of2.pollSendParams = hVar2;
        accountInstance.getSendMessagesHelper().sendMessage(of2);
    }

    public static void prepareSendingText(AccountInstance accountInstance, CharSequence charSequence, long j3, boolean z10, int i10, int i11, long j10) {
        prepareSendingText(accountInstance, charSequence, j3, 0L, z10, i10, i11, j10);
    }

    public static void prepareSendingVideo(AccountInstance accountInstance, String str, VideoEditedInfo videoEditedInfo, String str2, TLRPC.Photo photo, long j3, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, tn tnVar, ArrayList<TLRPC.MessageEntity> arrayList, int i10, MessageObject messageObject3, boolean z10, int i11, int i12, boolean z11, boolean z12, CharSequence charSequence, SendMessageChatArguments sendMessageChatArguments, long j10, long j11) {
        prepareSendingVideo(accountInstance, str, videoEditedInfo, str2, photo, j3, messageObject, messageObject2, storyItem, tnVar, arrayList, i10, messageObject3, z10, i11, i12, z11, z12, charSequence, sendMessageChatArguments, j10, j11, 0L, null);
    }

    private void putToDelayedMessages(String str, DelayedMessage delayedMessage) {
        ArrayList<DelayedMessage> arrayList = this.delayedMessages.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.delayedMessages.put(str, arrayList);
        }
        arrayList.add(delayedMessage);
    }

    private boolean removeCoverFromRequest(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
            TLRPC.InputMedia inputMedia = ((TLRPC.TL_messages_sendMedia) tLObject).media;
            if (inputMedia instanceof TLRPC.TL_inputMediaUploadedDocument) {
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = (TLRPC.TL_inputMediaUploadedDocument) inputMedia;
                tL_inputMediaUploadedDocument.video_cover = null;
                tL_inputMediaUploadedDocument.flags &= -65;
                return true;
            } else if (inputMedia instanceof TLRPC.TL_inputMediaDocument) {
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument = (TLRPC.TL_inputMediaDocument) inputMedia;
                tL_inputMediaDocument.video_cover = null;
                tL_inputMediaDocument.flags &= -9;
                return true;
            } else if (inputMedia instanceof TLRPC.TL_inputMediaDocumentExternal) {
                TLRPC.TL_inputMediaDocumentExternal tL_inputMediaDocumentExternal = (TLRPC.TL_inputMediaDocumentExternal) inputMedia;
                tL_inputMediaDocumentExternal.video_cover = null;
                tL_inputMediaDocumentExternal.flags &= -5;
                return true;
            } else {
                return false;
            }
        } else if (tLObject instanceof TL_ephemeral.TL_sendMessage) {
            TLRPC.InputMedia inputMedia2 = ((TL_ephemeral.TL_sendMessage) tLObject).media;
            if (inputMedia2 instanceof TLRPC.TL_inputMediaUploadedDocument) {
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument2 = (TLRPC.TL_inputMediaUploadedDocument) inputMedia2;
                tL_inputMediaUploadedDocument2.video_cover = null;
                tL_inputMediaUploadedDocument2.flags &= -65;
                return true;
            } else if (inputMedia2 instanceof TLRPC.TL_inputMediaDocument) {
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument2 = (TLRPC.TL_inputMediaDocument) inputMedia2;
                tL_inputMediaDocument2.video_cover = null;
                tL_inputMediaDocument2.flags &= -9;
                return true;
            } else if (inputMedia2 instanceof TLRPC.TL_inputMediaDocumentExternal) {
                TLRPC.TL_inputMediaDocumentExternal tL_inputMediaDocumentExternal2 = (TLRPC.TL_inputMediaDocumentExternal) inputMedia2;
                tL_inputMediaDocumentExternal2.video_cover = null;
                tL_inputMediaDocumentExternal2.flags &= -5;
                return true;
            } else {
                return false;
            }
        } else if (tLObject instanceof TLRPC.TL_messages_editMessage) {
            TLRPC.InputMedia inputMedia3 = ((TLRPC.TL_messages_editMessage) tLObject).media;
            if (inputMedia3 instanceof TLRPC.TL_inputMediaUploadedDocument) {
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument3 = (TLRPC.TL_inputMediaUploadedDocument) inputMedia3;
                tL_inputMediaUploadedDocument3.video_cover = null;
                tL_inputMediaUploadedDocument3.flags &= -65;
                return true;
            } else if (inputMedia3 instanceof TLRPC.TL_inputMediaDocument) {
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument3 = (TLRPC.TL_inputMediaDocument) inputMedia3;
                tL_inputMediaDocument3.video_cover = null;
                tL_inputMediaDocument3.flags &= -9;
                return true;
            } else if (inputMedia3 instanceof TLRPC.TL_inputMediaDocumentExternal) {
                TLRPC.TL_inputMediaDocumentExternal tL_inputMediaDocumentExternal3 = (TLRPC.TL_inputMediaDocumentExternal) inputMedia3;
                tL_inputMediaDocumentExternal3.video_cover = null;
                tL_inputMediaDocumentExternal3.flags &= -5;
                return true;
            } else {
                return false;
            }
        } else if (tLObject instanceof TLRPC.TL_messages_addPollAnswer) {
            TLRPC.InputMedia inputMedia4 = ((TLRPC.TL_messages_addPollAnswer) tLObject).answer.input_media;
            if (inputMedia4 instanceof TLRPC.TL_inputMediaUploadedDocument) {
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument4 = (TLRPC.TL_inputMediaUploadedDocument) inputMedia4;
                tL_inputMediaUploadedDocument4.video_cover = null;
                tL_inputMediaUploadedDocument4.flags &= -65;
                return true;
            } else if (inputMedia4 instanceof TLRPC.TL_inputMediaDocument) {
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument4 = (TLRPC.TL_inputMediaDocument) inputMedia4;
                tL_inputMediaDocument4.video_cover = null;
                tL_inputMediaDocument4.flags &= -9;
                return true;
            } else if (inputMedia4 instanceof TLRPC.TL_inputMediaDocumentExternal) {
                TLRPC.TL_inputMediaDocumentExternal tL_inputMediaDocumentExternal4 = (TLRPC.TL_inputMediaDocumentExternal) inputMedia4;
                tL_inputMediaDocumentExternal4.video_cover = null;
                tL_inputMediaDocumentExternal4.flags &= -5;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    private boolean requestRichMessageFileReference(MessageObject messageObject, TLRPC.TL_messages_editMessage tL_messages_editMessage, String str, Runnable runnable) {
        TL_iv.TL_inputRichMessage tL_inputRichMessage;
        if (messageObject != null && (tL_inputRichMessage = tL_messages_editMessage.rich_message) != null) {
            ArrayList arrayList = new ArrayList(tL_inputRichMessage.documents.size() + tL_inputRichMessage.photos.size());
            arrayList.addAll(tL_inputRichMessage.photos);
            arrayList.addAll(tL_inputRichMessage.documents);
            if (!arrayList.isEmpty()) {
                int fileRefErrorIndex = FileRefController.getFileRefErrorIndex(str);
                getFileRefController().requestReference(messageObject, arrayList.get((fileRefErrorIndex < 0 || fileRefErrorIndex >= arrayList.size()) ? 0 : 0), runnable);
                return true;
            }
        }
        return false;
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
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.replaceMessagesObjects, Long.valueOf(messageObject.getDialogId()), a2.l(messageObject));
    }

    private static TL_iv.TL_inputRichMessage richMessageToInputRichMessage(TL_iv.RichMessage richMessage, ArrayList<TLRPC.InputUser> arrayList) {
        TL_iv.TL_inputRichMessage tL_inputRichMessage = new TL_iv.TL_inputRichMessage();
        if (richMessage != null) {
            tL_inputRichMessage.rtl = richMessage.rtl;
            tL_inputRichMessage.blocks = new ArrayList<>(richMessage.blocks.size());
            for (int i10 = 0; i10 < richMessage.blocks.size(); i10++) {
                tL_inputRichMessage.blocks.add(toInputPageBlock(richMessage.blocks.get(i10)));
            }
            ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                tL_inputRichMessage.flags |= 4;
                ArrayList<TLRPC.Photo> arrayList3 = richMessage.photos;
                int size = arrayList3.size();
                int i11 = 0;
                while (i11 < size) {
                    TLRPC.Photo photo = arrayList3.get(i11);
                    i11++;
                    TLRPC.Photo photo2 = photo;
                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                    tL_inputPhoto.f17214id = photo2.f17219id;
                    tL_inputPhoto.access_hash = photo2.access_hash;
                    byte[] bArr = photo2.file_reference;
                    if (bArr == null) {
                        bArr = new byte[0];
                    }
                    tL_inputPhoto.file_reference = bArr;
                    tL_inputRichMessage.photos.add(tL_inputPhoto);
                }
            }
            ArrayList<TLRPC.Document> arrayList4 = richMessage.documents;
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                tL_inputRichMessage.flags |= 8;
                ArrayList<TLRPC.Document> arrayList5 = richMessage.documents;
                int size2 = arrayList5.size();
                int i12 = 0;
                while (i12 < size2) {
                    TLRPC.Document document = arrayList5.get(i12);
                    i12++;
                    TLRPC.Document document2 = document;
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputDocument.f17207id = document2.f17201id;
                    tL_inputDocument.access_hash = document2.access_hash;
                    byte[] bArr2 = document2.file_reference;
                    if (bArr2 == null) {
                        bArr2 = new byte[0];
                    }
                    tL_inputDocument.file_reference = bArr2;
                    tL_inputRichMessage.documents.add(tL_inputDocument);
                }
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                tL_inputRichMessage.flags |= 16;
                tL_inputRichMessage.users.addAll(arrayList);
            }
        }
        return tL_inputRichMessage;
    }

    public int lambda$sendEditRichMessageRequest$23(TLRPC.TL_messages_editMessage tL_messages_editMessage, MessageObject messageObject, org.telegram.ui.ActionBar.p2 p2Var, boolean z10) {
        TLRPC.Message message;
        int sendRequest = getConnectionsManager().sendRequest(tL_messages_editMessage, new gg.s0(this, messageObject, tL_messages_editMessage, p2Var, z10, 3));
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            message.reqId = sendRequest;
        }
        return sendRequest;
    }

    public void sendLocation(Location location) {
        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeo.geo = tL_geoPoint;
        tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(location.getLatitude());
        tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(location.getLongitude());
        for (Map.Entry<String, MessageObject> entry : this.waitingForLocation.entrySet()) {
            MessageObject value = entry.getValue();
            sendMessage(SendMessageParams.of((TLRPC.MessageMedia) tL_messageMediaGeo, value.getDialogId(), value, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
        }
    }

    private void sendReadyToSendGroup(DelayedMessage delayedMessage, boolean z10, boolean z11) {
        DelayedMessage findMaxDelayedMessageForMessageId;
        DelayedMessage findMaxDelayedMessageForMessageId2;
        DelayedMessage delayedMessage2;
        DelayedMessage findMaxDelayedMessageForMessageId3;
        ArrayList<MessageObject> arrayList;
        int i10;
        DelayedMessage delayedMessage3 = delayedMessage;
        if (delayedMessage3.messageObjects.isEmpty()) {
            delayedMessage3.markAsError();
            return;
        }
        String str = "group_" + delayedMessage3.groupId;
        if (delayedMessage3.finalGroupMessage != ((MessageObject) hc.b.i(1, delayedMessage3.messageObjects)).getId()) {
            if (z10) {
                if (BuildVars.DEBUG_VERSION) {
                    FileLog.d("final message not added, add");
                }
                putToDelayedMessages(str, delayedMessage3);
                return;
            } else if (BuildVars.DEBUG_VERSION) {
                FileLog.d("final message not added");
                return;
            } else {
                return;
            }
        }
        int i11 = 0;
        if (z10) {
            this.delayedMessages.remove(str);
            MessageObject messageObject = delayedMessage3.obj;
            if (messageObject != null && messageObject.isWelcomeMessage()) {
                i10 = 9;
            } else if (delayedMessage3.scheduled) {
                i10 = 1;
            } else {
                MessageObject messageObject2 = delayedMessage3.obj;
                if ((messageObject2 != null && messageObject2.isQuickReply()) || ((arrayList = delayedMessage3.messageObjects) != null && !arrayList.isEmpty() && delayedMessage3.messageObjects.get(0).isQuickReply())) {
                    i10 = 5;
                } else {
                    i10 = 0;
                }
            }
            if (!delayedMessage3.paidMedia && !delayedMessage3.pollMedia) {
                getMessagesStorage().putMessages(delayedMessage3.messages, false, true, false, 0, i10, 0L);
                getMessagesController().updateInterfaceWithMessages(delayedMessage3.peer, delayedMessage3.messageObjects, i10);
            } else {
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                arrayList2.add(delayedMessage3.messageObjects.get(0));
                ArrayList<TLRPC.Message> arrayList3 = new ArrayList<>();
                arrayList3.add(delayedMessage3.messages.get(0));
                getMessagesStorage().putMessages(arrayList3, false, true, false, 0, i10, 0L);
                getMessagesController().updateInterfaceWithMessages(delayedMessage3.peer, arrayList2, i10);
            }
            if (!delayedMessage3.scheduled) {
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
            }
            if (BuildVars.DEBUG_VERSION) {
                FileLog.d("add message");
            }
        }
        TLObject tLObject = delayedMessage3.sendRequest;
        if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
            TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) tLObject;
            while (i11 < tL_messages_sendMultiMedia.multi_media.size()) {
                TLRPC.InputMedia inputMedia = tL_messages_sendMultiMedia.multi_media.get(i11).media;
                if (!(inputMedia instanceof TLRPC.TL_inputMediaUploadedPhoto) && !(inputMedia instanceof TLRPC.TL_inputMediaUploadedDocument)) {
                    if ((inputMedia instanceof TLRPC.TL_inputMediaDocument) && i11 < delayedMessage3.messageObjects.size()) {
                        MessageObject messageObject3 = delayedMessage3.messageObjects.get(i11);
                        String str2 = messageObject3.messageOwner.attachPath;
                        if (str2 == null) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(FileLoader.getDirectory(4));
                            sb2.append("/");
                            str2 = a4.a.r(sb2, messageObject3.getDocument().f17201id, ".mp4");
                        }
                        if (delayedMessage3.extraHashMap.containsKey(str2 + "_ct") && inputMedia.video_cover == null) {
                            if (BuildVars.DEBUG_VERSION) {
                                FileLog.d("cover media not ready");
                                return;
                            }
                            return;
                        }
                    }
                    i11++;
                } else if (BuildVars.DEBUG_VERSION) {
                    FileLog.d("multi media not ready");
                    return;
                } else {
                    return;
                }
            }
            if (z11 && (findMaxDelayedMessageForMessageId3 = findMaxDelayedMessageForMessageId(delayedMessage3.finalGroupMessage, delayedMessage3.peer)) != null) {
                findMaxDelayedMessageForMessageId3.addDelayedRequest(delayedMessage3.sendRequest, delayedMessage3.messageObjects, delayedMessage3.originalPaths, delayedMessage3.parentObjects, delayedMessage3, delayedMessage3.scheduled);
                ArrayList<DelayedMessageSendAfterRequest> arrayList4 = delayedMessage3.requests;
                if (arrayList4 != null) {
                    findMaxDelayedMessageForMessageId3.requests.addAll(arrayList4);
                }
                if (BuildVars.DEBUG_VERSION) {
                    FileLog.d("has maxDelayedMessage, delay");
                    return;
                }
                return;
            }
        } else if ((tLObject instanceof TLRPC.TL_messages_sendMedia) && (((TLRPC.TL_messages_sendMedia) tLObject).media instanceof TLRPC.TL_inputMediaPoll)) {
            TLRPC.TL_inputMediaPoll tL_inputMediaPoll = (TLRPC.TL_inputMediaPoll) ((TLRPC.TL_messages_sendMedia) tLObject).media;
            TLRPC.InputMedia inputMedia2 = tL_inputMediaPoll.attached_media;
            if (!(inputMedia2 instanceof TLRPC.TL_inputMediaUploadedPhoto) && !(inputMedia2 instanceof TLRPC.TL_inputMediaUploadedDocument)) {
                TLRPC.InputMedia inputMedia3 = tL_inputMediaPoll.solution_media;
                if (!(inputMedia3 instanceof TLRPC.TL_inputMediaUploadedPhoto) && !(inputMedia3 instanceof TLRPC.TL_inputMediaUploadedDocument)) {
                    int size = tL_inputMediaPoll.poll.answers.size();
                    while (i11 < size) {
                        TLRPC.InputMedia e = ph.f.e(tL_inputMediaPoll, i11);
                        if (!(e instanceof TLRPC.TL_inputMediaUploadedPhoto) && !(e instanceof TLRPC.TL_inputMediaUploadedDocument)) {
                            i11++;
                        }
                    }
                    if (z11 && (findMaxDelayedMessageForMessageId2 = findMaxDelayedMessageForMessageId(delayedMessage3.finalGroupMessage, delayedMessage3.peer)) != null) {
                        findMaxDelayedMessageForMessageId2.addDelayedRequest(delayedMessage3.sendRequest, delayedMessage3.messageObjects, delayedMessage3.originalPaths, delayedMessage3.parentObjects, delayedMessage3, delayedMessage3.scheduled);
                        ArrayList<DelayedMessageSendAfterRequest> arrayList5 = delayedMessage3.requests;
                        if (arrayList5 != null) {
                            findMaxDelayedMessageForMessageId2.requests.addAll(arrayList5);
                        }
                        if (BuildVars.DEBUG_VERSION) {
                            FileLog.d("has maxDelayedMessage, delay");
                            return;
                        }
                        return;
                    }
                }
            }
            if (BuildVars.DEBUG_VERSION) {
                FileLog.d("multi media not ready");
                return;
            }
            return;
        } else if ((tLObject instanceof TLRPC.TL_messages_sendMedia) && (((TLRPC.TL_messages_sendMedia) tLObject).media instanceof TLRPC.TL_inputMediaPaidMedia)) {
            TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = (TLRPC.TL_inputMediaPaidMedia) ((TLRPC.TL_messages_sendMedia) tLObject).media;
            while (i11 < tL_inputMediaPaidMedia.extended_media.size()) {
                TLRPC.InputMedia inputMedia4 = tL_inputMediaPaidMedia.extended_media.get(i11);
                if (!(inputMedia4 instanceof TLRPC.TL_inputMediaUploadedPhoto) && !(inputMedia4 instanceof TLRPC.TL_inputMediaUploadedDocument)) {
                    i11++;
                } else if (BuildVars.DEBUG_VERSION) {
                    FileLog.d("multi media not ready");
                    return;
                } else {
                    return;
                }
            }
            if (z11 && (findMaxDelayedMessageForMessageId = findMaxDelayedMessageForMessageId(delayedMessage3.finalGroupMessage, delayedMessage3.peer)) != null) {
                findMaxDelayedMessageForMessageId.addDelayedRequest(delayedMessage3.sendRequest, delayedMessage3.messageObjects, delayedMessage3.originalPaths, delayedMessage3.parentObjects, delayedMessage3, delayedMessage3.scheduled);
                ArrayList<DelayedMessageSendAfterRequest> arrayList6 = delayedMessage3.requests;
                if (arrayList6 != null) {
                    findMaxDelayedMessageForMessageId.requests.addAll(arrayList6);
                }
                if (BuildVars.DEBUG_VERSION) {
                    FileLog.d("has maxDelayedMessage, delay");
                    return;
                }
                return;
            }
        } else {
            TLRPC.TL_messages_sendEncryptedMultiMedia tL_messages_sendEncryptedMultiMedia = (TLRPC.TL_messages_sendEncryptedMultiMedia) delayedMessage3.sendEncryptedRequest;
            while (i11 < tL_messages_sendEncryptedMultiMedia.files.size()) {
                if (tL_messages_sendEncryptedMultiMedia.files.get(i11) instanceof TLRPC.TL_inputEncryptedFile) {
                    return;
                }
                i11++;
            }
        }
        TLObject tLObject2 = delayedMessage3.sendRequest;
        if (tLObject2 instanceof TLRPC.TL_messages_sendMultiMedia) {
            delayedMessage2 = delayedMessage3;
            lambda$performSendMessageRequestMulti$64((TLRPC.TL_messages_sendMultiMedia) tLObject2, delayedMessage3.messageObjects, delayedMessage3.originalPaths, delayedMessage3.parentObjects, delayedMessage2, delayedMessage2.scheduled);
        } else if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
            delayedMessage2 = delayedMessage3;
            lambda$performSendMessageRequestMulti$64((TLRPC.TL_messages_sendMedia) tLObject2, delayedMessage3.messageObjects, delayedMessage3.originalPaths, delayedMessage3.parentObjects, delayedMessage2, delayedMessage2.scheduled);
        } else {
            getSecretChatHelper().performSendEncryptedRequest((TLRPC.TL_messages_sendEncryptedMultiMedia) delayedMessage3.sendEncryptedRequest, delayedMessage3);
            delayedMessage3.sendDelayedRequests();
        }
        delayedMessage3 = delayedMessage2;
        delayedMessage3.sendDelayedRequests();
    }

    public static boolean shouldSendWebPAsSticker(String str, Uri uri) {
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
                InputStream openInputStream = ApplicationLoader.applicationContext.getContentResolver().openInputStream(uri);
                BitmapFactory.decodeStream(openInputStream, null, options);
                if (openInputStream != null) {
                    openInputStream.close();
                }
            } catch (Exception unused) {
            }
        }
        if (options.outWidth < 800 && options.outHeight < 800) {
            return true;
        }
        return false;
    }

    private static TLRPC.InputGeoPoint toInputGeoPoint(TLRPC.GeoPoint geoPoint) {
        if (!(geoPoint instanceof TLRPC.TL_geoPoint)) {
            return new TLRPC.TL_inputGeoPointEmpty();
        }
        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
        tL_inputGeoPoint.lat = geoPoint.lat;
        tL_inputGeoPoint._long = geoPoint._long;
        int i10 = geoPoint.accuracy_radius;
        if (i10 != 0) {
            tL_inputGeoPoint.flags |= 1;
            tL_inputGeoPoint.accuracy_radius = i10;
        }
        return tL_inputGeoPoint;
    }

    public static TL_iv.PageBlock toInputPageBlock(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockMap) {
            TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock;
            TL_iv.inputPageBlockMap inputpageblockmap = new TL_iv.inputPageBlockMap();
            inputpageblockmap.geo = toInputGeoPoint(pageblockmap.geo);
            inputpageblockmap.zoom = pageblockmap.zoom;
            inputpageblockmap.f17419w = pageblockmap.f17421w;
            inputpageblockmap.h = pageblockmap.h;
            inputpageblockmap.caption = pageblockmap.caption;
            return inputpageblockmap;
        }
        return pageBlock;
    }

    private static Integer tryParseInt(String str) {
        if (str == null) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private void updateMediaPaths(MessageObject messageObject, TLRPC.Message message, int i10, String str, boolean z10, HashMap<String, String> hashMap) {
        updateMediaPaths(messageObject, message, i10, Collections.singletonList(str), z10, -1, hashMap);
    }

    private void uploadMultiMedia(DelayedMessage delayedMessage, TLRPC.InputMedia inputMedia, TLRPC.InputEncryptedFile inputEncryptedFile, String str) {
        if (inputMedia != null) {
            TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
            tL_messages_uploadMedia.media = inputMedia;
            TLObject tLObject = delayedMessage.sendRequest;
            if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) tLObject;
                tL_messages_uploadMedia.peer = tL_messages_sendMultiMedia.peer;
                int i10 = 0;
                while (true) {
                    if (i10 >= tL_messages_sendMultiMedia.multi_media.size()) {
                        break;
                    } else if (tL_messages_sendMultiMedia.multi_media.get(i10).media == inputMedia) {
                        putToSendingMessages(delayedMessage.messages.get(i10), delayedMessage.scheduled);
                        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileUploadProgressChanged, str, -1L, -1L, Boolean.FALSE);
                        break;
                    } else {
                        i10++;
                    }
                }
            } else {
                boolean z10 = tLObject instanceof TLRPC.TL_messages_sendMedia;
                if (z10) {
                    TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
                    TLRPC.InputMedia inputMedia2 = tL_messages_sendMedia.media;
                    if (inputMedia2 instanceof TLRPC.TL_inputMediaPaidMedia) {
                        tL_messages_uploadMedia.peer = tL_messages_sendMedia.peer;
                        TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = (TLRPC.TL_inputMediaPaidMedia) inputMedia2;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= tL_inputMediaPaidMedia.extended_media.size()) {
                                break;
                            } else if (tL_inputMediaPaidMedia.extended_media.get(i11) == inputMedia) {
                                putToSendingMessages(delayedMessage.messages.get(i11), delayedMessage.scheduled);
                                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileUploadProgressChanged, str, -1L, -1L, Boolean.FALSE);
                                break;
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                if (z10) {
                    TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject;
                    TLRPC.InputMedia inputMedia3 = tL_messages_sendMedia2.media;
                    if (inputMedia3 instanceof TLRPC.TL_inputMediaPoll) {
                        tL_messages_uploadMedia.peer = tL_messages_sendMedia2.peer;
                        int a2 = ph.f.a((TLRPC.TL_inputMediaPoll) inputMedia3, inputMedia);
                        int i12 = 0;
                        while (true) {
                            if (i12 >= delayedMessage.pollIndexes.size()) {
                                break;
                            } else if (delayedMessage.pollIndexes.get(i12).intValue() == a2) {
                                putToSendingMessages(delayedMessage.messages.get(i12), delayedMessage.scheduled);
                                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileUploadProgressChanged, str, -1L, -1L, Boolean.FALSE);
                                break;
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                boolean z11 = tLObject instanceof TL_ephemeral.TL_sendMessage;
                if (z11) {
                    TL_ephemeral.TL_sendMessage tL_sendMessage = (TL_ephemeral.TL_sendMessage) tLObject;
                    TLRPC.InputMedia inputMedia4 = tL_sendMessage.media;
                    if (inputMedia4 instanceof TLRPC.TL_inputMediaPaidMedia) {
                        tL_messages_uploadMedia.peer = tL_sendMessage.peer;
                        TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia2 = (TLRPC.TL_inputMediaPaidMedia) inputMedia4;
                        int i13 = 0;
                        while (true) {
                            if (i13 >= tL_inputMediaPaidMedia2.extended_media.size()) {
                                break;
                            } else if (tL_inputMediaPaidMedia2.extended_media.get(i13) == inputMedia) {
                                putToSendingMessages(delayedMessage.messages.get(i13), delayedMessage.scheduled);
                                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileUploadProgressChanged, str, -1L, -1L, Boolean.FALSE);
                                break;
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                if (z11) {
                    TL_ephemeral.TL_sendMessage tL_sendMessage2 = (TL_ephemeral.TL_sendMessage) tLObject;
                    TLRPC.InputMedia inputMedia5 = tL_sendMessage2.media;
                    if (inputMedia5 instanceof TLRPC.TL_inputMediaPoll) {
                        tL_messages_uploadMedia.peer = tL_sendMessage2.peer;
                        int a10 = ph.f.a((TLRPC.TL_inputMediaPoll) inputMedia5, inputMedia);
                        int i14 = 0;
                        while (true) {
                            if (i14 >= delayedMessage.pollIndexes.size()) {
                                break;
                            } else if (delayedMessage.pollIndexes.get(i14).intValue() == a10) {
                                putToSendingMessages(delayedMessage.messages.get(i14), delayedMessage.scheduled);
                                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileUploadProgressChanged, str, -1L, -1L, Boolean.FALSE);
                                break;
                            } else {
                                i14++;
                            }
                        }
                    }
                }
            }
            getConnectionsManager().sendRequest(tL_messages_uploadMedia, new nk(this, inputMedia, delayedMessage, 0));
        } else if (inputEncryptedFile != null) {
            TLRPC.TL_messages_sendEncryptedMultiMedia tL_messages_sendEncryptedMultiMedia = (TLRPC.TL_messages_sendEncryptedMultiMedia) delayedMessage.sendEncryptedRequest;
            int i15 = 0;
            while (true) {
                if (i15 >= tL_messages_sendEncryptedMultiMedia.files.size()) {
                    break;
                } else if (tL_messages_sendEncryptedMultiMedia.files.get(i15) == inputEncryptedFile) {
                    putToSendingMessages(delayedMessage.messages.get(i15), delayedMessage.scheduled);
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileUploadProgressChanged, str, -1L, -1L, Boolean.FALSE);
                    break;
                } else {
                    i15++;
                }
            }
            sendReadyToSendGroup(delayedMessage, false, true);
        }
    }

    private void writePreviousMessageData(TLRPC.Message message, SerializedData serializedData) {
        TLRPC.MessageMedia messageMedia = message.media;
        if (messageMedia == null) {
            new TLRPC.TL_messageMediaEmpty().serializeToStream(serializedData);
        } else {
            messageMedia.serializeToStream(serializedData);
        }
        String str = message.message;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        serializedData.writeString(str);
        String str3 = message.attachPath;
        if (str3 != null) {
            str2 = str3;
        }
        serializedData.writeString(str2);
        int size = message.entities.size();
        serializedData.writeInt32(size);
        for (int i10 = 0; i10 < size; i10++) {
            message.entities.get(i10).serializeToStream(serializedData);
        }
    }

    public void addPollOption(MessageObject messageObject, CharSequence charSequence, ph.e eVar) {
        if (messageObject != null) {
            TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
            if (!(media instanceof TLRPC.TL_messageMediaPoll)) {
                return;
            }
            long dialogId = messageObject.getDialogId();
            messageObject.getId();
            TLRPC.TL_inputPollAnswer tL_inputPollAnswer = new TLRPC.TL_inputPollAnswer();
            tL_inputPollAnswer.text = new TLRPC.TL_textWithEntities();
            tL_inputPollAnswer.option = r3;
            byte[] bArr = {(byte) (((TLRPC.TL_messageMediaPoll) media).poll.answers.size() + 48)};
            if (charSequence != null) {
                CharSequence[] charSequenceArr = {charSequence};
                tL_inputPollAnswer.text.entities = getMediaDataController().getEntities(charSequenceArr, true);
                tL_inputPollAnswer.text.text = charSequenceArr[0].toString();
            }
            if (eVar instanceof qh.d) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(((qh.d) eVar).f41016c);
                prepareSendingMedia(getAccountInstance(), arrayList, dialogId, null, null, null, null, false, false, messageObject, tL_inputPollAnswer, false, 0, 0, 0, false, null, null, 0L, false, 0L, 0L, null);
            } else if (eVar instanceof qh.h) {
                qh.h hVar = (qh.h) eVar;
                editMessage(messageObject, tL_inputPollAnswer, null, null, (TLRPC.TL_document) hVar.f41026b, null, null, null, false, false, hVar.f41027c);
            } else if (eVar instanceof qh.f) {
                tL_inputPollAnswer.input_media = yf.d.h(((qh.f) eVar).f41023b);
                editMessage(messageObject, tL_inputPollAnswer, null, null, null, null, null, null, false, false, null);
            } else if (eVar instanceof qh.e) {
                TLRPC.TL_inputMediaWebPage tL_inputMediaWebPage = new TLRPC.TL_inputMediaWebPage();
                tL_inputMediaWebPage.url = ((qh.e) eVar).f41017b;
                tL_inputMediaWebPage.optional = true;
                tL_inputPollAnswer.input_media = tL_inputMediaWebPage;
                editMessage(messageObject, tL_inputPollAnswer, null, null, null, null, null, null, false, false, null);
            } else {
                editMessage(messageObject, tL_inputPollAnswer, null, null, null, null, null, null, false, false, null);
            }
        }
    }

    public void cancelSendingMessage(MessageObject messageObject) {
        ArrayList<MessageObject> l4 = a2.l(messageObject);
        if (messageObject != null && messageObject.type == 29) {
            DelayedMessage delayedMessage = null;
            for (Map.Entry<String, ArrayList<DelayedMessage>> entry : this.delayedMessages.entrySet()) {
                ArrayList<DelayedMessage> value = entry.getValue();
                for (int i10 = 0; i10 < value.size(); i10++) {
                    DelayedMessage delayedMessage2 = value.get(i10);
                    if (delayedMessage2.type == 4) {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= delayedMessage2.messageObjects.size()) {
                                break;
                            } else if (delayedMessage2.messageObjects.get(i11).getId() == messageObject.getId()) {
                                delayedMessage = delayedMessage2;
                                break;
                            } else {
                                i11++;
                            }
                        }
                    }
                    if (delayedMessage != null) {
                        break;
                    }
                }
            }
            if (delayedMessage != null) {
                l4.clear();
                l4.addAll(delayedMessage.messageObjects);
            }
        }
        cancelSendingMessage(l4);
    }

    public void checkUnsentMessages() {
        getMessagesStorage().getUnsentMessages(1000);
    }

    public void cleanup() {
        this.delayedMessages.clear();
        this.unsentMessages.clear();
        this.sendingMessages.clear();
        this.editingMessages.clear();
        this.sendingMessagesIdDialogs.b();
        this.uploadMessages.clear();
        this.uploadingMessagesIdDialogs.b();
        this.waitingForLocation.clear();
        this.waitingForCallback.clear();
        this.waitingForVote.clear();
        this.importingHistoryFiles.clear();
        this.importingHistoryMap.b();
        this.importingStickersFiles.clear();
        this.importingStickersMap.clear();
        this.locationProvider.stop();
    }

    public TLRPC.InputReplyTo createReplyInput(TL_stories.StoryItem storyItem) {
        TLRPC.TL_inputReplyToStory tL_inputReplyToStory = new TLRPC.TL_inputReplyToStory();
        tL_inputReplyToStory.story_id = storyItem.f17435id;
        tL_inputReplyToStory.peer = getMessagesController().getInputPeer(storyItem.dialogId);
        return tL_inputReplyToStory;
    }

    public void deletePollOption(MessageObject messageObject, byte[] bArr) {
        if (messageObject == null || !(MessageObject.getMedia(messageObject) instanceof TLRPC.TL_messageMediaPoll)) {
            return;
        }
        long dialogId = messageObject.getDialogId();
        int id2 = messageObject.getId();
        TLRPC.TL_messages_deletePollAnswer tL_messages_deletePollAnswer = new TLRPC.TL_messages_deletePollAnswer();
        tL_messages_deletePollAnswer.peer = getMessagesController().getInputPeer(dialogId);
        tL_messages_deletePollAnswer.msg_id = id2;
        tL_messages_deletePollAnswer.option = bArr;
        ConnectionsManager connectionsManager = getConnectionsManager();
        DispatchQueue dispatchQueue = Utilities.stageQueue;
        Objects.requireNonNull(dispatchQueue);
        connectionsManager.sendRequestTyped(tL_messages_deletePollAnswer, new e1(dispatchQueue), new ue(this, 7));
    }

    @Override
    public void didReceivedNotification(int r31, int r32, java.lang.Object... r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public void editMessage(MessageObject messageObject, TLRPC.TL_photo tL_photo, VideoEditedInfo videoEditedInfo, TLRPC.TL_document tL_document, String str, TLRPC.PhotoSize photoSize, HashMap<String, String> hashMap, boolean z10, boolean z11, Object obj) {
        editMessage(messageObject, null, tL_photo, videoEditedInfo, tL_document, str, photoSize, hashMap, z10, z11, obj);
    }

    public int editRichMessage(MessageObject messageObject, TL_iv.RichMessage richMessage, ArrayList<TLRPC.InputUser> arrayList, org.telegram.ui.ActionBar.p2 p2Var, boolean z10) {
        TL_ephemeral.TL_editMessage tL_editMessage;
        if (messageObject == null || richMessage == null || messageObject.messageOwner == null) {
            return 0;
        }
        if (messageObject.isEditing() && messageObject.messageOwner.reqId != 0) {
            getConnectionsManager().cancelRequest(messageObject.messageOwner.reqId, true);
            messageObject.messageOwner.reqId = 0;
        }
        if (messageObject.isEphemeral()) {
            TL_ephemeral.TL_editMessage tL_editMessage2 = new TL_ephemeral.TL_editMessage();
            tL_editMessage2.f17278id = MessageObject.ephemeralMessageIdUnpack(messageObject.getId());
            tL_editMessage2.receiver_id = new TLRPC.TL_inputUserEmpty();
            tL_editMessage2.welcome = true;
            tL_editMessage = tL_editMessage2;
        } else {
            TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
            tL_messages_editMessage.f17278id = messageObject.getId();
            tL_editMessage = tL_messages_editMessage;
        }
        tL_editMessage.peer = getMessagesController().getInputPeer(messageObject.getDialogId());
        tL_editMessage.rich_message = richMessageToInputRichMessage(richMessage, arrayList);
        int i10 = tL_editMessage.flags;
        tL_editMessage.flags = 8388608 | i10;
        if (messageObject.scheduled) {
            tL_editMessage.schedule_date = messageObject.messageOwner.date;
            tL_editMessage.flags = i10 | 8421376;
        }
        TLRPC.Message message = messageObject.messageOwner;
        if ((message.flags & 1073741824) != 0) {
            tL_editMessage.quick_reply_shortcut_id = message.quick_reply_shortcut_id;
            tL_editMessage.flags |= 131072;
        }
        message.rich_message = richMessage;
        message.send_state = 3;
        int lambda$sendEditRichMessageRequest$23 = lambda$sendEditRichMessageRequest$23(tL_editMessage, messageObject, p2Var, z10);
        notifyRichMessageEditing(messageObject);
        return lambda$sendEditRichMessageRequest$23;
    }

    public TLRPC.TL_photo generatePhotoSizes(String str, Uri uri) {
        return generatePhotoSizes(null, str, uri, false);
    }

    public ArrayList<DelayedMessage> getDelayedMessages(String str) {
        return this.delayedMessages.get(str);
    }

    public ImportingHistory getImportingHistory(long j3) {
        return (ImportingHistory) this.importingHistoryMap.f(j3);
    }

    public ImportingStickers getImportingStickers(String str) {
        return this.importingStickersMap.get(str);
    }

    public long getNextRandomId() {
        long j3 = 0;
        while (j3 == 0) {
            j3 = Utilities.random.nextLong();
        }
        return j3;
    }

    public int getSendingMessageId(long j3) {
        for (int i10 = 0; i10 < this.sendingMessages.size(); i10++) {
            TLRPC.Message valueAt = this.sendingMessages.valueAt(i10);
            if (valueAt.dialog_id == j3) {
                return valueAt.f17216id;
            }
        }
        for (int i11 = 0; i11 < this.uploadMessages.size(); i11++) {
            TLRPC.Message valueAt2 = this.uploadMessages.valueAt(i11);
            if (valueAt2.dialog_id == j3) {
                return valueAt2.f17216id;
            }
        }
        return 0;
    }

    public Boolean getSendingTodoValue(MessageObject messageObject, TLRPC.TodoItem todoItem) {
        return this.waitingForTodoUpdate.get(Integer.valueOf(Objects.hash(Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), Integer.valueOf(todoItem.f17340id))));
    }

    public long getVoteSendTime(long j3) {
        return ((Long) this.voteSendTime.g(0L, j3)).longValue();
    }

    public boolean isImportingHistory() {
        if (this.importingHistoryMap.m() != 0) {
            return true;
        }
        return false;
    }

    public boolean isImportingStickers() {
        if (this.importingStickersMap.size() != 0) {
            return true;
        }
        return false;
    }

    public boolean isSendingCallback(MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = 0;
        if (messageObject == null || keyboardButtonProto == null) {
            return false;
        }
        if (yf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
            i10 = 3;
        } else if (yf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class)) {
            i10 = 1;
        } else if (yf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
            i10 = 2;
        }
        return this.waitingForCallback.containsKey(messageObject.getDialogId() + "_" + messageObject.getId() + "_" + Utilities.bytesToHex(keyboardButtonProto.getData()) + "_" + i10);
    }

    public boolean isSendingCurrentLocation(MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        String str;
        if (messageObject != null && keyboardButtonProto != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(messageObject.getDialogId());
            sb2.append("_");
            sb2.append(messageObject.getId());
            sb2.append("_");
            sb2.append(Utilities.bytesToHex(keyboardButtonProto.getData()));
            sb2.append("_");
            if (yf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                str = "1";
            } else {
                str = "0";
            }
            sb2.append(str);
            return this.waitingForLocation.containsKey(sb2.toString());
        }
        return false;
    }

    public boolean isSendingMessage(int i10) {
        if (this.sendingMessages.indexOfKey(i10) < 0 && this.editingMessages.indexOfKey(i10) < 0) {
            return false;
        }
        return true;
    }

    public boolean isSendingMessageIdDialog(long j3) {
        if (((Integer) this.sendingMessagesIdDialogs.g(0, j3)).intValue() <= 0) {
            return false;
        }
        return true;
    }

    public boolean isSendingPaidMessage(int i10, int i11) {
        HashMap<String, ArrayList<DelayedMessage>> hashMap = this.delayedMessages;
        DelayedMessage delayedMessage = null;
        if (hashMap != null) {
            for (ArrayList<DelayedMessage> arrayList : hashMap.values()) {
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i12 = 0;
                    while (i12 < size) {
                        DelayedMessage delayedMessage2 = arrayList.get(i12);
                        i12++;
                        DelayedMessage delayedMessage3 = delayedMessage2;
                        ArrayList<TLRPC.Message> arrayList2 = delayedMessage3.messages;
                        if (arrayList2 != null) {
                            int size2 = arrayList2.size();
                            int i13 = 0;
                            while (true) {
                                if (i13 >= size2) {
                                    break;
                                }
                                TLRPC.Message message = arrayList2.get(i13);
                                i13++;
                                TLRPC.Message message2 = message;
                                if (message2 != null && message2.f17216id == i10) {
                                    delayedMessage = delayedMessage3;
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
        if (delayedMessage != null && i11 >= 0 && i11 < delayedMessage.messages.size()) {
            i10 = delayedMessage.messages.get(i11).f17216id;
        }
        if (this.sendingMessages.indexOfKey(i10) < 0 && this.editingMessages.indexOfKey(i10) < 0) {
            return false;
        }
        return true;
    }

    public byte[] isSendingVote(MessageObject messageObject) {
        if (messageObject == null) {
            return null;
        }
        return this.waitingForVote.get("poll_" + messageObject.getPollId());
    }

    public boolean isUploadingMessageIdDialog(long j3) {
        if (((Integer) this.uploadingMessagesIdDialogs.g(0, j3)).intValue() <= 0) {
            return false;
        }
        return true;
    }

    public void onMessageEdited(TLRPC.Message message) {
        if (message != null && message.reply_markup != null) {
            HashMap<String, List<String>> hashMap = this.waitingForCallbackMap;
            List<String> remove = hashMap.remove(message.dialog_id + "_" + message.f17216id);
            if (remove != null) {
                for (String str : remove) {
                    this.waitingForCallback.remove(str);
                }
            }
        }
    }

    public void lambda$performSendMessageRequestMulti$64(final TLObject tLObject, final ArrayList<MessageObject> arrayList, final ArrayList<String> arrayList2, final ArrayList<Object> arrayList3, final DelayedMessage delayedMessage, final boolean z10) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            putToSendingMessages(arrayList.get(i10).messageOwner, z10);
        }
        if (!xh.v5.y(this.currentAccount, false).c(tLObject, arrayList, new Runnable(this) {
            public final SendMessagesHelper f16537b;

            {
                this.f16537b = this;
            }

            @Override
            public final void run() {
                switch (r8) {
                    case 0:
                        SendMessagesHelper.DelayedMessage delayedMessage2 = delayedMessage;
                        boolean z11 = z10;
                        this.f16537b.lambda$performSendMessageRequestMulti$62(tLObject, arrayList, arrayList2, arrayList3, delayedMessage2, z11);
                        return;
                    default:
                        SendMessagesHelper.DelayedMessage delayedMessage3 = delayedMessage;
                        boolean z12 = z10;
                        this.f16537b.lambda$performSendMessageRequestMulti$63(tLObject, arrayList, arrayList2, arrayList3, delayedMessage3, z12);
                        return;
                }
            }
        }) || !BotForumHelper.getInstance(this.currentAccount).beforeSendingFinalRequest(tLObject, arrayList, new Runnable(this) {
            public final SendMessagesHelper f16537b;

            {
                this.f16537b = this;
            }

            @Override
            public final void run() {
                switch (r8) {
                    case 0:
                        SendMessagesHelper.DelayedMessage delayedMessage2 = delayedMessage;
                        boolean z11 = z10;
                        this.f16537b.lambda$performSendMessageRequestMulti$62(tLObject, arrayList, arrayList2, arrayList3, delayedMessage2, z11);
                        return;
                    default:
                        SendMessagesHelper.DelayedMessage delayedMessage3 = delayedMessage;
                        boolean z12 = z10;
                        this.f16537b.lambda$performSendMessageRequestMulti$63(tLObject, arrayList, arrayList2, arrayList3, delayedMessage3, z12);
                        return;
                }
            }
        }) || !xf.u.g(this.currentAccount).a(tLObject, arrayList, new vk(this, arrayList, arrayList2, arrayList3, delayedMessage, z10))) {
            return;
        }
        getConnectionsManager().sendRequest(tLObject, new fg.x0(arrayList3, arrayList, arrayList2, delayedMessage, this, tLObject, z10), (QuickAckDelegate) null, 68);
    }

    public void prepareImportHistory(long j3, Uri uri, ArrayList<Uri> arrayList, MessagesStorage.LongCallback longCallback) {
        if (this.importingHistoryMap.f(j3) != null) {
            longCallback.run(0L);
            return;
        }
        if (DialogObject.isChatDialog(j3)) {
            long j10 = -j3;
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j10));
            if (chat != null && !chat.megagroup) {
                getMessagesController().convertToMegaGroup(null, j10, null, new h8(this, uri, arrayList, longCallback));
                return;
            }
        }
        new Thread(new kl(this, arrayList, j3, uri, longCallback, 6)).start();
    }

    public void prepareImportStickers(String str, String str2, String str3, ArrayList<ImportingSticker> arrayList, MessagesStorage.StringCallback stringCallback) {
        if (this.importingStickersMap.get(str2) != null) {
            stringCallback.run(null);
        } else {
            new Thread(new a0(this, str, str2, str3, arrayList, stringCallback, 10)).start();
        }
    }

    public void processForwardFromMyName(MessageObject messageObject, long j3, long j10, long j11, MessageSuggestionParams messageSuggestionParams) {
        TLRPC.WebPage webPage;
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            TLRPC.MessageMedia messageMedia = message.media;
            ArrayList arrayList = null;
            r3 = null;
            r3 = null;
            HashMap hashMap = null;
            arrayList = null;
            if (messageMedia != null && !(messageMedia instanceof TLRPC.TL_messageMediaEmpty) && !(messageMedia instanceof TLRPC.TL_messageMediaWebPage) && !(messageMedia instanceof TLRPC.TL_messageMediaGame) && !(messageMedia instanceof TLRPC.TL_messageMediaInvoice)) {
                if (DialogObject.isEncryptedDialog(j3)) {
                    TLRPC.Message message2 = messageObject.messageOwner;
                    if (message2.peer_id != null) {
                        TLRPC.MessageMedia messageMedia2 = message2.media;
                        if ((messageMedia2.photo instanceof TLRPC.TL_photo) || (messageMedia2.document instanceof TLRPC.TL_document)) {
                            hashMap = new HashMap();
                            hashMap.put("parentObject", "sent_" + messageObject.messageOwner.peer_id.channel_id + "_" + messageObject.getId() + "_" + messageObject.getDialogId() + "_" + messageObject.type + "_" + messageObject.getSize());
                        }
                    }
                }
                HashMap hashMap2 = hashMap;
                TLRPC.Message message3 = messageObject.messageOwner;
                TLRPC.MessageMedia messageMedia3 = message3.media;
                TLRPC.Photo photo = messageMedia3.photo;
                if (photo instanceof TLRPC.TL_photo) {
                    SendMessageParams of2 = SendMessageParams.of((TLRPC.TL_photo) photo, null, j3, messageObject.replyMessageObject, null, message3.message, message3.entities, null, hashMap2, true, 0, 0, messageMedia3.ttl_seconds, messageObject, false);
                    of2.payStars = j10;
                    of2.monoForumPeer = j11;
                    of2.suggestionParams = messageSuggestionParams;
                    sendMessage(of2);
                    return;
                }
                TLRPC.Document document = messageMedia3.document;
                if (document instanceof TLRPC.TL_document) {
                    SendMessageParams of3 = SendMessageParams.of((TLRPC.TL_document) document, null, message3.attachPath, j3, messageObject.replyMessageObject, null, message3.message, message3.entities, null, hashMap2, true, 0, 0, messageMedia3.ttl_seconds, messageObject, null, false);
                    of3.payStars = j10;
                    of3.monoForumPeer = j11;
                    of3.suggestionParams = messageSuggestionParams;
                    sendMessage(of3);
                } else if (!(messageMedia3 instanceof TLRPC.TL_messageMediaVenue) && !(messageMedia3 instanceof TLRPC.TL_messageMediaGeo)) {
                    if (messageMedia3.phone_number != null) {
                        TLRPC.TL_userContact_old2 tL_userContact_old2 = new TLRPC.TL_userContact_old2();
                        TLRPC.MessageMedia messageMedia4 = messageObject.messageOwner.media;
                        tL_userContact_old2.phone = messageMedia4.phone_number;
                        tL_userContact_old2.first_name = messageMedia4.first_name;
                        tL_userContact_old2.last_name = messageMedia4.last_name;
                        tL_userContact_old2.f17342id = messageMedia4.user_id;
                        SendMessageParams of4 = SendMessageParams.of((TLRPC.User) tL_userContact_old2, j3, messageObject.replyMessageObject, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0);
                        of4.monoForumPeer = j11;
                        of4.suggestionParams = messageSuggestionParams;
                        of4.payStars = j10;
                        sendMessage(of4);
                    } else if (!DialogObject.isEncryptedDialog(j3)) {
                        sendMessage(a2.l(messageObject), j3, true, false, true, 0, 0, null, -1, j10, j11, messageSuggestionParams);
                    }
                } else {
                    SendMessageParams of5 = SendMessageParams.of(messageMedia3, j3, messageObject.replyMessageObject, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0);
                    of5.payStars = j10;
                    of5.monoForumPeer = j11;
                    of5.suggestionParams = messageSuggestionParams;
                    sendMessage(of5);
                }
            } else if (message.message != null) {
                if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                    webPage = messageMedia.webpage;
                } else {
                    webPage = null;
                }
                ArrayList<TLRPC.MessageEntity> arrayList2 = message.entities;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList = new ArrayList();
                    for (int i10 = 0; i10 < messageObject.messageOwner.entities.size(); i10++) {
                        TLRPC.MessageEntity messageEntity = messageObject.messageOwner.entities.get(i10);
                        if ((messageEntity instanceof TLRPC.TL_messageEntityBold) || (messageEntity instanceof TLRPC.TL_messageEntityItalic) || (messageEntity instanceof TLRPC.TL_messageEntityPre) || (messageEntity instanceof TLRPC.TL_messageEntityCode) || (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) || (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) || (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji)) {
                            arrayList.add(messageEntity);
                        }
                    }
                }
                SendMessageParams of6 = SendMessageParams.of(messageObject.messageOwner.message, j3, messageObject.replyMessageObject, null, webPage, true, arrayList, null, null, true, 0, 0, null, false);
                of6.payStars = j10;
                of6.monoForumPeer = j11;
                of6.suggestionParams = messageSuggestionParams;
                sendMessage(of6);
            } else if (DialogObject.isEncryptedDialog(j3)) {
                sendMessage(a2.l(messageObject), j3, true, false, true, 0, 0, null, -1, j10, j11, messageSuggestionParams);
            }
        }
    }

    public void processSentMessage(int i10) {
        int size = this.unsentMessages.size();
        this.unsentMessages.remove(i10);
        if (size != 0 && this.unsentMessages.size() == 0) {
            checkUnsentMessages();
        }
    }

    public void processUnsentMessages(ArrayList<TLRPC.Message> arrayList, ArrayList<TLRPC.Message> arrayList2, ArrayList<TLRPC.User> arrayList3, ArrayList<TLRPC.Chat> arrayList4, ArrayList<TLRPC.EncryptedChat> arrayList5) {
        AndroidUtilities.runOnUIThread(new a0(this, arrayList3, arrayList4, arrayList5, arrayList, arrayList2, 8));
    }

    public void putToSendingMessages(TLRPC.Message message, boolean z10) {
        if (Thread.currentThread() != ApplicationLoader.applicationHandler.getLooper().getThread()) {
            AndroidUtilities.runOnUIThread(new lj(this, message, z10, 0));
        } else {
            putToSendingMessages(message, z10, true);
        }
    }

    public void putToUploadingMessages(MessageObject messageObject) {
        boolean z10;
        if (messageObject != null && messageObject.getId() <= 0 && !messageObject.scheduled) {
            TLRPC.Message message = messageObject.messageOwner;
            if (this.uploadMessages.indexOfKey(message.f17216id) >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.uploadMessages.put(message.f17216id, message);
            if (!z10 && !MessageObject.isEphemeral(message)) {
                long dialogId = MessageObject.getDialogId(message);
                a0.i iVar = this.uploadingMessagesIdDialogs;
                iVar.k(Integer.valueOf(((Integer) iVar.g(0, dialogId)).intValue() + 1), dialogId);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.sendingMessagesChanged, new Object[0]);
            }
        }
    }

    public TLRPC.Message removeFromSendingMessages(int i10, boolean z10) {
        if (i10 > 0) {
            TLRPC.Message message = this.editingMessages.get(i10);
            if (message != null) {
                this.editingMessages.remove(i10);
            }
            return message;
        }
        TLRPC.Message message2 = this.sendingMessages.get(i10);
        if (message2 != null) {
            this.sendingMessages.remove(i10);
            if (!z10) {
                long dialogId = MessageObject.getDialogId(message2);
                Integer num = (Integer) this.sendingMessagesIdDialogs.f(dialogId);
                if (num != null) {
                    int intValue = num.intValue() - 1;
                    if (intValue <= 0) {
                        this.sendingMessagesIdDialogs.l(dialogId);
                    } else {
                        this.sendingMessagesIdDialogs.k(Integer.valueOf(intValue), dialogId);
                    }
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.sendingMessagesChanged, new Object[0]);
                }
            }
        }
        return message2;
    }

    public void removeFromUploadingMessages(int i10, boolean z10) {
        TLRPC.Message message;
        if (i10 <= 0 && !z10 && (message = this.uploadMessages.get(i10)) != null) {
            this.uploadMessages.remove(i10);
            long dialogId = MessageObject.getDialogId(message);
            Integer num = (Integer) this.uploadingMessagesIdDialogs.f(dialogId);
            if (num != null) {
                int intValue = num.intValue() - 1;
                if (intValue <= 0) {
                    this.uploadingMessagesIdDialogs.l(dialogId);
                } else {
                    this.uploadingMessagesIdDialogs.k(Integer.valueOf(intValue), dialogId);
                }
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.sendingMessagesChanged, new Object[0]);
            }
        }
    }

    public void requestUrlAuth(String str, eo eoVar, boolean z10) {
        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
        tL_messages_requestUrlAuth.url = str;
        tL_messages_requestUrlAuth.flags |= 4;
        getConnectionsManager().sendRequest(tL_messages_requestUrlAuth, new gg.s0(this, tL_messages_requestUrlAuth, eoVar, str, z10), 2);
    }

    public boolean retrySendMessage(MessageObject messageObject, boolean z10, long j3) {
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
        if (z10) {
            this.unsentMessages.put(messageObject.getId(), messageObject);
        }
        SendMessageParams of2 = SendMessageParams.of(messageObject);
        of2.payStars = j3;
        sendMessage(of2);
        return true;
    }

    public void sendCallback(boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, eo eoVar) {
        lambda$sendCallback$40(z10, messageObject, keyboardButtonProto, null, null, eoVar);
    }

    public void sendCurrentLocation(MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        String str;
        if (messageObject != null && keyboardButtonProto != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(messageObject.getDialogId());
            sb2.append("_");
            sb2.append(messageObject.getId());
            sb2.append("_");
            sb2.append(Utilities.bytesToHex(keyboardButtonProto.getData()));
            sb2.append("_");
            if (yf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                str = "1";
            } else {
                str = "0";
            }
            sb2.append(str);
            this.waitingForLocation.put(sb2.toString(), messageObject);
            this.locationProvider.start();
        }
    }

    public void sendGame(TLRPC.InputPeer inputPeer, TLRPC.TL_inputMediaGame tL_inputMediaGame, long j3, long j10) {
        long nextRandomId;
        NativeByteBuffer nativeByteBuffer;
        if (inputPeer != null && tL_inputMediaGame != null) {
            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = new TLRPC.TL_messages_sendMedia();
            tL_messages_sendMedia.peer = inputPeer;
            if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                tL_messages_sendMedia.silent = MessagesController.getNotificationsSettings(this.currentAccount).getBoolean("silent_" + (-inputPeer.channel_id), false);
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                tL_messages_sendMedia.silent = MessagesController.getNotificationsSettings(this.currentAccount).getBoolean("silent_" + (-inputPeer.chat_id), false);
            } else {
                tL_messages_sendMedia.silent = MessagesController.getNotificationsSettings(this.currentAccount).getBoolean("silent_" + inputPeer.user_id, false);
            }
            if (j3 != 0) {
                nextRandomId = j3;
            } else {
                nextRandomId = getNextRandomId();
            }
            tL_messages_sendMedia.random_id = nextRandomId;
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
            if (j10 == 0) {
                NativeByteBuffer nativeByteBuffer2 = null;
                try {
                    nativeByteBuffer = new NativeByteBuffer(inputPeer.getObjectSize() + tL_inputMediaGame.getObjectSize() + 12);
                } catch (Exception e) {
                    e = e;
                }
                try {
                    nativeByteBuffer.writeInt32(3);
                    nativeByteBuffer.writeInt64(j3);
                    inputPeer.serializeToStream(nativeByteBuffer);
                    tL_inputMediaGame.serializeToStream(nativeByteBuffer);
                } catch (Exception e7) {
                    e = e7;
                    nativeByteBuffer2 = nativeByteBuffer;
                    FileLog.e(e);
                    nativeByteBuffer = nativeByteBuffer2;
                    j10 = getMessagesStorage().createPendingTask(nativeByteBuffer);
                    getConnectionsManager().sendRequest(tL_messages_sendMedia, new p1(this, j10, 4));
                }
                j10 = getMessagesStorage().createPendingTask(nativeByteBuffer);
            }
            getConnectionsManager().sendRequest(tL_messages_sendMedia, new p1(this, j10, 4));
        }
    }

    public int sendMessage(ArrayList<MessageObject> arrayList, long j3, boolean z10, boolean z11, boolean z12, int i10, long j10) {
        return sendMessage(arrayList, j3, z10, z11, z12, i10, null, -1, j10);
    }

    public void sendNotificationCallback(long j3, int i10, byte[] bArr) {
        AndroidUtilities.runOnUIThread(new p7(this, j3, i10, bArr, 9));
    }

    public void sendReaction(MessageObject messageObject, ArrayList<yg.p0> arrayList, yg.p0 p0Var, boolean z10, boolean z11, org.telegram.ui.ActionBar.p2 p2Var, Runnable runnable) {
        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji;
        if (messageObject != null && p2Var != null) {
            TLRPC.TL_messages_sendReaction tL_messages_sendReaction = new TLRPC.TL_messages_sendReaction();
            TLRPC.Message message = messageObject.messageOwner;
            if (message.isThreadMessage && message.fwd_from != null) {
                tL_messages_sendReaction.peer = getMessagesController().getInputPeer(messageObject.getFromChatId());
                tL_messages_sendReaction.msg_id = messageObject.messageOwner.fwd_from.saved_from_msg_id;
            } else {
                tL_messages_sendReaction.peer = getMessagesController().getInputPeer(messageObject.getDialogId());
                tL_messages_sendReaction.msg_id = messageObject.getId();
            }
            tL_messages_sendReaction.add_to_recent = z11;
            if (z11 && p0Var != null) {
                ArrayList<TLRPC.Reaction> arrayList2 = MediaDataController.getInstance(this.currentAccount).recentReactions;
                if (p0Var.f47101f != null) {
                    TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                    tL_reactionEmoji.emoticon = p0Var.f47101f;
                    tL_reactionCustomEmoji = tL_reactionEmoji;
                } else {
                    TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji2 = new TLRPC.TL_reactionCustomEmoji();
                    tL_reactionCustomEmoji2.document_id = p0Var.f47102g;
                    tL_reactionCustomEmoji = tL_reactionCustomEmoji2;
                }
                arrayList2.add(0, tL_reactionCustomEmoji);
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    yg.p0 p0Var2 = arrayList.get(i10);
                    if (p0Var2.f47102g != 0) {
                        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji3 = new TLRPC.TL_reactionCustomEmoji();
                        tL_reactionCustomEmoji3.document_id = p0Var2.f47102g;
                        tL_messages_sendReaction.reaction.add(tL_reactionCustomEmoji3);
                        tL_messages_sendReaction.flags |= 1;
                    } else if (p0Var2.f47101f != null) {
                        TLRPC.TL_reactionEmoji tL_reactionEmoji2 = new TLRPC.TL_reactionEmoji();
                        tL_reactionEmoji2.emoticon = p0Var2.f47101f;
                        tL_messages_sendReaction.reaction.add(tL_reactionEmoji2);
                        tL_messages_sendReaction.flags |= 1;
                    }
                }
            }
            if (z10) {
                tL_messages_sendReaction.flags |= 2;
                tL_messages_sendReaction.big = true;
            }
            getConnectionsManager().sendRequest(tL_messages_sendReaction, new v1(9, this, runnable));
        }
    }

    public void sendScreenshotMessage(TLRPC.User user, int i10, TLRPC.Message message) {
        TLRPC.Message message2 = message;
        if (user != null && i10 != 0 && user.f17342id != getUserConfig().getClientUserId()) {
            TLRPC.TL_messages_sendScreenshotNotification tL_messages_sendScreenshotNotification = new TLRPC.TL_messages_sendScreenshotNotification();
            TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
            tL_messages_sendScreenshotNotification.peer = tL_inputPeerUser;
            tL_inputPeerUser.access_hash = user.access_hash;
            tL_inputPeerUser.user_id = user.f17342id;
            if (message2 != null) {
                tL_messages_sendScreenshotNotification.reply_to = createReplyInput(i10);
                tL_messages_sendScreenshotNotification.random_id = message2.random_id;
            } else {
                message2 = new TLRPC.TL_messageService();
                message2.random_id = getNextRandomId();
                message2.dialog_id = user.f17342id;
                message2.unread = true;
                message2.out = true;
                int newMessageId = getUserConfig().getNewMessageId();
                message2.f17216id = newMessageId;
                message2.local_id = newMessageId;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                message2.from_id = tL_peerUser;
                tL_peerUser.user_id = getUserConfig().getClientUserId();
                message2.flags |= 264;
                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                message2.reply_to = tL_messageReplyHeader;
                tL_messageReplyHeader.flags |= 16;
                tL_messageReplyHeader.reply_to_msg_id = i10;
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                message2.peer_id = tL_peerUser2;
                tL_peerUser2.user_id = user.f17342id;
                message2.date = getConnectionsManager().getCurrentTime();
                message2.action = new TLRPC.TL_messageActionScreenshotTaken();
                getUserConfig().saveConfig(false);
            }
            tL_messages_sendScreenshotNotification.random_id = message2.random_id;
            MessageObject messageObject = new MessageObject(this.currentAccount, message2, false, true);
            messageObject.messageOwner.send_state = 1;
            messageObject.wasJustSent = true;
            getMessagesController().updateInterfaceWithMessages(message2.dialog_id, a2.l(messageObject), 0);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
            ArrayList<TLRPC.Message> arrayList = new ArrayList<>();
            arrayList.add(message2);
            getMessagesStorage().putMessages(arrayList, false, true, false, 0, false, 0, 0L);
            performSendMessageRequest(tL_messages_sendScreenshotNotification, messageObject, null, null, null, null, false);
        }
    }

    public void sendSticker(TLRPC.Document document, String str, long j3, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, tn tnVar, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, boolean z11, Object obj, SendMessageChatArguments sendMessageChatArguments, long j10, long j11, MessageSuggestionParams messageSuggestionParams) {
        sendSticker(document, str, j3, null, null, messageObject, messageObject2, storyItem, tnVar, sendAnimationData, z10, i10, i11, z11, obj, sendMessageChatArguments, j10, j11, messageSuggestionParams);
    }

    public int sendVote(MessageObject messageObject, ArrayList<TLRPC.PollAnswer> arrayList, Runnable runnable) {
        byte[] bArr;
        if (messageObject != null) {
            String str = "poll_" + messageObject.getPollId();
            if (!this.waitingForCallback.containsKey(str)) {
                TLRPC.TL_messages_sendVote tL_messages_sendVote = new TLRPC.TL_messages_sendVote();
                tL_messages_sendVote.msg_id = messageObject.getId();
                tL_messages_sendVote.peer = getMessagesController().getInputPeer(messageObject.getDialogId());
                if (arrayList != null) {
                    bArr = new byte[arrayList.size()];
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        TLRPC.PollAnswer pollAnswer = arrayList.get(i10);
                        if (pollAnswer != null) {
                            tL_messages_sendVote.options.add(pollAnswer.option);
                            bArr[i10] = pollAnswer.option[0];
                        }
                    }
                } else {
                    bArr = new byte[0];
                }
                this.waitingForVote.put(str, bArr);
                return getConnectionsManager().sendRequest(tL_messages_sendVote, new l2(this, messageObject, str, runnable, 5));
            }
        }
        return 0;
    }

    public int toggleTodo(final long j3, final MessageObject messageObject, final TLRPC.TodoItem todoItem, final boolean z10, final Runnable runnable) {
        if (messageObject == null) {
            return 0;
        }
        final int hash = Objects.hash(Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()), Integer.valueOf(todoItem.f17340id));
        this.waitingForTodoUpdate.put(Integer.valueOf(hash), Boolean.valueOf(z10));
        TLRPC.TL_messages_toggleTodoCompleted tL_messages_toggleTodoCompleted = new TLRPC.TL_messages_toggleTodoCompleted();
        tL_messages_toggleTodoCompleted.msg_id = messageObject.getId();
        tL_messages_toggleTodoCompleted.peer = getMessagesController().getInputPeer(messageObject.getDialogId());
        if (z10) {
            tL_messages_toggleTodoCompleted.completed.add(Integer.valueOf(todoItem.f17340id));
        } else {
            tL_messages_toggleTodoCompleted.incompleted.add(Integer.valueOf(todoItem.f17340id));
        }
        return getConnectionsManager().sendRequest(tL_messages_toggleTodoCompleted, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                SendMessagesHelper.this.lambda$toggleTodo$34(messageObject, todoItem, z10, j3, hash, runnable, tLObject, tL_error);
            }
        });
    }

    public static Bitmap createVideoThumbnailAtTime(String str, long j3, int[] iArr, boolean z10) {
        if (z10) {
            org.telegram.ui.Components.c6 c6Var = new org.telegram.ui.Components.c6(new File(str), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
            Bitmap q6 = c6Var.q(j3, z10);
            if (iArr != null) {
                iArr[0] = c6Var.d[2];
            }
            c6Var.u();
            return q6 == null ? createVideoThumbnailAtTime(str, j3, iArr, false) : q6;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        Bitmap bitmap = null;
        try {
            mediaMetadataRetriever.setDataSource(str);
            bitmap = mediaMetadataRetriever.getFrameAtTime(j3, 1);
            if (bitmap == null) {
                bitmap = mediaMetadataRetriever.getFrameAtTime(j3, 3);
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            try {
                mediaMetadataRetriever.release();
            } catch (Throwable unused2) {
            }
            throw th2;
        }
        try {
            mediaMetadataRetriever.release();
        } catch (Throwable unused3) {
            return bitmap;
        }
    }

    public static void ensureMediaThumbExists(AccountInstance accountInstance, boolean z10, TLObject tLObject, String str, Uri uri, long j3, boolean z11) {
        TLRPC.PhotoSize scaleAndSaveImage;
        TLRPC.PhotoSize scaleAndSaveImage2;
        if (tLObject instanceof TLRPC.TL_photo) {
            TLRPC.TL_photo tL_photo = (TLRPC.TL_photo) tLObject;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tL_photo.sizes, 90);
            boolean exists = ((closestPhotoSizeWithSize instanceof TLRPC.TL_photoStrippedSize) || (closestPhotoSizeWithSize instanceof TLRPC.TL_photoPathSize)) ? true : FileLoader.getInstance(accountInstance.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize, true).exists();
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(tL_photo.sizes, AndroidUtilities.getPhotoSize(z11));
            boolean exists2 = FileLoader.getInstance(accountInstance.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize2, false).exists();
            if (exists && exists2) {
                return;
            }
            Bitmap loadBitmap = ImageLoader.loadBitmap(str, uri, AndroidUtilities.getPhotoSize(), AndroidUtilities.getPhotoSize(), true);
            if (loadBitmap == null) {
                loadBitmap = ImageLoader.loadBitmap(str, uri, 800.0f, 800.0f, true);
            }
            Bitmap bitmap = loadBitmap;
            if (!exists2 && (scaleAndSaveImage2 = ImageLoader.scaleAndSaveImage(closestPhotoSizeWithSize2, bitmap, Bitmap.CompressFormat.JPEG, true, AndroidUtilities.getPhotoSize(), AndroidUtilities.getPhotoSize(), 80, false, 101, 101, false)) != closestPhotoSizeWithSize2) {
                tL_photo.sizes.add(0, scaleAndSaveImage2);
            }
            if (!exists && (scaleAndSaveImage = ImageLoader.scaleAndSaveImage(closestPhotoSizeWithSize, bitmap, 90.0f, 90.0f, 55, true, false)) != closestPhotoSizeWithSize) {
                tL_photo.sizes.add(0, scaleAndSaveImage);
            }
            if (bitmap != null) {
                bitmap.recycle();
            }
        } else if (tLObject instanceof TLRPC.TL_document) {
            TLRPC.TL_document tL_document = (TLRPC.TL_document) tLObject;
            if ((MessageObject.isVideoDocument(tL_document) || MessageObject.isNewGifDocument(tL_document)) && MessageObject.isDocumentHasThumb(tL_document)) {
                TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(tL_document.thumbs, 320);
                if ((closestPhotoSizeWithSize3 instanceof TLRPC.TL_photoStrippedSize) || (closestPhotoSizeWithSize3 instanceof TLRPC.TL_photoPathSize) || FileLoader.getInstance(accountInstance.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize3, true).exists()) {
                    return;
                }
                Bitmap createVideoThumbnailAtTime = createVideoThumbnailAtTime(str, j3);
                if (createVideoThumbnailAtTime == null) {
                    createVideoThumbnailAtTime = createVideoThumbnail(str, 1);
                }
                int i10 = z10 ? 90 : 320;
                float f7 = i10;
                tL_document.thumbs.set(0, ImageLoader.scaleAndSaveImage(closestPhotoSizeWithSize3, createVideoThumbnailAtTime, f7, f7, i10 > 90 ? 80 : 55, false, true));
            }
        }
    }

    private void performSendDelayedMessage(DelayedMessage delayedMessage, int i10) {
        boolean z10;
        TLRPC.InputEncryptedFile inputEncryptedFile;
        boolean z11;
        TLRPC.InputFile inputFile;
        boolean z12;
        String str;
        TLRPC.InputMedia inputMedia;
        TLRPC.InputPeer inputPeer;
        ArrayList<Boolean> arrayList;
        TLRPC.InputMedia inputMedia2;
        TLRPC.InputMedia inputMedia3;
        TLRPC.PhotoSize photoSize;
        int i11;
        TLRPC.InputMedia inputMedia4;
        TLRPC.InputPeer inputPeer2;
        String str2;
        VideoEditedInfo videoEditedInfo;
        TLRPC.InputMedia d;
        TLRPC.InputMedia inputMedia5;
        TLRPC.PhotoSize photoSize2;
        SendMessagesHelper sendMessagesHelper = this;
        DelayedMessage delayedMessage2 = delayedMessage;
        int i12 = delayedMessage2.type;
        if (i12 == 0) {
            String str3 = delayedMessage2.httpLocation;
            if (str3 != null) {
                sendMessagesHelper.putToDelayedMessages(str3, delayedMessage2);
                ImageLoader.getInstance().loadHttpFile(delayedMessage2.httpLocation, "file", sendMessagesHelper.currentAccount);
            } else if (delayedMessage2.sendRequest != null) {
                String file = FileLoader.getInstance(sendMessagesHelper.currentAccount).getPathToAttach(delayedMessage2.photoSize).toString();
                sendMessagesHelper.putToDelayedMessages(file, delayedMessage2);
                sendMessagesHelper.getFileLoader().uploadFile(file, false, true, 16777216);
                sendMessagesHelper.putToUploadingMessages(delayedMessage2.obj);
            } else {
                String file2 = FileLoader.getInstance(sendMessagesHelper.currentAccount).getPathToAttach(delayedMessage2.photoSize).toString();
                if (delayedMessage2.sendEncryptedRequest != null && (photoSize2 = delayedMessage2.photoSize) != null && photoSize2.location.dc_id != 0) {
                    File file3 = new File(file2);
                    if (!file3.exists()) {
                        file2 = FileLoader.getInstance(sendMessagesHelper.currentAccount).getPathToAttach(delayedMessage2.photoSize, true).toString();
                        file3 = new File(file2);
                    }
                    if (!file3.exists()) {
                        sendMessagesHelper.putToDelayedMessages(FileLoader.getAttachFileName(delayedMessage2.photoSize), delayedMessage2);
                        sendMessagesHelper.getFileLoader().loadFile(ImageLocation.getForObject(delayedMessage2.photoSize, delayedMessage2.locationParent), delayedMessage2.parentObject, "jpg", 3, 0);
                        return;
                    }
                }
                sendMessagesHelper.putToDelayedMessages(file2, delayedMessage2);
                sendMessagesHelper.getFileLoader().uploadFile(file2, true, true, 16777216);
                sendMessagesHelper.putToUploadingMessages(delayedMessage2.obj);
            }
        } else if (i12 == 1) {
            VideoEditedInfo videoEditedInfo2 = delayedMessage2.videoEditedInfo;
            if (videoEditedInfo2 != null && videoEditedInfo2.needConvert() && delayedMessage2.performMediaUpload) {
                MessageObject messageObject = delayedMessage2.obj;
                String str4 = messageObject.messageOwner.attachPath;
                TLRPC.Document document = messageObject.getDocument();
                if (str4 == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(FileLoader.getDirectory(4));
                    sb2.append("/");
                    sb2.append(document.f17201id);
                    sb2.append(".");
                    sb2.append(delayedMessage2.videoEditedInfo.isSticker ? "webm" : "mp4");
                    str4 = sb2.toString();
                }
                sendMessagesHelper.putToDelayedMessages(str4, delayedMessage2);
                if (!delayedMessage2.videoEditedInfo.alreadyScheduledConverting) {
                    MediaController.getInstance().scheduleVideoConvert(delayedMessage2.obj);
                }
                sendMessagesHelper.putToUploadingMessages(delayedMessage2.obj);
                return;
            }
            VideoEditedInfo videoEditedInfo3 = delayedMessage2.videoEditedInfo;
            if (videoEditedInfo3 != null) {
                TLRPC.InputFile inputFile2 = videoEditedInfo3.file;
                if (inputFile2 != null) {
                    i11 = 4;
                    TLObject tLObject = delayedMessage2.sendRequest;
                    if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
                        inputMedia5 = ((TLRPC.TL_messages_sendMedia) tLObject).media;
                    } else if (tLObject instanceof TL_ephemeral.TL_sendMessage) {
                        inputMedia5 = ((TL_ephemeral.TL_sendMessage) tLObject).media;
                    } else if (tLObject instanceof TLRPC.TL_messages_addPollAnswer) {
                        inputMedia5 = ((TLRPC.TL_messages_addPollAnswer) tLObject).answer.input_media;
                    } else {
                        inputMedia5 = ((TLRPC.TL_messages_editMessage) tLObject).media;
                    }
                    inputMedia5.file = inputFile2;
                    videoEditedInfo3.file = null;
                } else {
                    i11 = 4;
                    if (videoEditedInfo3.encryptedFile != null) {
                        TLRPC.TL_decryptedMessage tL_decryptedMessage = (TLRPC.TL_decryptedMessage) delayedMessage2.sendEncryptedRequest;
                        TLRPC.DecryptedMessageMedia decryptedMessageMedia = tL_decryptedMessage.media;
                        decryptedMessageMedia.size = videoEditedInfo3.estimatedSize;
                        decryptedMessageMedia.key = videoEditedInfo3.key;
                        decryptedMessageMedia.iv = videoEditedInfo3.iv;
                        SecretChatHelper secretChatHelper = sendMessagesHelper.getSecretChatHelper();
                        MessageObject messageObject2 = delayedMessage2.obj;
                        secretChatHelper.performSendEncryptedRequest(tL_decryptedMessage, messageObject2.messageOwner, delayedMessage2.encryptedChat, delayedMessage2.videoEditedInfo.encryptedFile, delayedMessage2.originalPath, messageObject2);
                        delayedMessage2.videoEditedInfo.encryptedFile = null;
                        return;
                    }
                }
            } else {
                i11 = 4;
            }
            TLObject tLObject2 = delayedMessage2.sendRequest;
            if (tLObject2 != null) {
                if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
                    TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject2;
                    inputMedia4 = tL_messages_sendMedia.media;
                    inputPeer2 = tL_messages_sendMedia.peer;
                } else if (tLObject2 instanceof TL_ephemeral.TL_sendMessage) {
                    TL_ephemeral.TL_sendMessage tL_sendMessage = (TL_ephemeral.TL_sendMessage) tLObject2;
                    inputMedia4 = tL_sendMessage.media;
                    inputPeer2 = tL_sendMessage.peer;
                } else if (tLObject2 instanceof TLRPC.TL_messages_addPollAnswer) {
                    TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer = (TLRPC.TL_messages_addPollAnswer) tLObject2;
                    inputMedia4 = tL_messages_addPollAnswer.answer.input_media;
                    inputPeer2 = tL_messages_addPollAnswer.peer;
                } else {
                    TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) tLObject2;
                    inputMedia4 = tL_messages_editMessage.media;
                    inputPeer2 = tL_messages_editMessage.peer;
                }
                if (inputMedia4 instanceof TLRPC.TL_inputMediaPaidMedia) {
                    TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = (TLRPC.TL_inputMediaPaidMedia) inputMedia4;
                    if (!tL_inputMediaPaidMedia.extended_media.isEmpty()) {
                        inputMedia4 = tL_inputMediaPaidMedia.extended_media.get(0);
                    }
                }
                if ((inputMedia4 instanceof TLRPC.TL_inputMediaPoll) && (d = ph.f.d((TLRPC.TL_inputMediaPoll) inputMedia4)) != null) {
                    inputMedia4 = d;
                }
                TLRPC.InputFile inputFile3 = inputMedia4.file;
                if (inputFile3 == null && !(inputMedia4 instanceof TLRPC.TL_inputMediaDocument) && delayedMessage2.performMediaUpload) {
                    MessageObject messageObject3 = delayedMessage2.obj;
                    String str5 = messageObject3.messageOwner.attachPath;
                    TLRPC.Document document2 = messageObject3.getDocument();
                    TLRPC.Document document3 = delayedMessage2.obj.documentToPollAddOption;
                    if (document3 != null) {
                        document2 = document3;
                    }
                    if (str5 == null) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(FileLoader.getDirectory(i11));
                        sb3.append("/");
                        str5 = a4.a.r(sb3, document2.f17201id, ".mp4");
                    }
                    String str6 = str5;
                    sendMessagesHelper.putToDelayedMessages(str6, delayedMessage2);
                    VideoEditedInfo videoEditedInfo4 = delayedMessage2.obj.videoEditedInfo;
                    if (videoEditedInfo4 == null || !videoEditedInfo4.notReadyYet) {
                        if (videoEditedInfo4 != null && videoEditedInfo4.needConvert()) {
                            sendMessagesHelper.getFileLoader().uploadFile(str6, false, false, document2.size, 33554432, false);
                        } else {
                            sendMessagesHelper.getFileLoader().uploadFile(str6, false, false, 33554432);
                        }
                    }
                    sendMessagesHelper.putToUploadingMessages(delayedMessage2.obj);
                    return;
                }
                TLRPC.InputPhoto inputPhoto = inputMedia4.video_cover;
                if (inputPhoto == null && delayedMessage2.coverFile == null && delayedMessage2.coverPhotoSize != null && delayedMessage2.performCoverUpload) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(FileLoader.getDirectory(i11));
                    sb4.append("/");
                    sb4.append(delayedMessage2.coverPhotoSize.location.volume_id);
                    sb4.append("_");
                    String n10 = a4.a.n(delayedMessage2.coverPhotoSize.location.local_id, ".jpg", sb4);
                    sendMessagesHelper.putToDelayedMessages(n10, delayedMessage2);
                    sendMessagesHelper.getFileLoader().uploadFile(n10, false, true, 16777216);
                    sendMessagesHelper.putToUploadingMessages(delayedMessage2.obj);
                    return;
                } else if (delayedMessage2.isLivePhoto && (inputMedia4 instanceof TLRPC.TL_inputMediaUploadedDocument) && inputFile3 != null && delayedMessage2.coverFile != null) {
                    TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
                    tL_messages_uploadMedia.peer = inputPeer2;
                    inputMedia4.flags &= -65;
                    inputMedia4.video_cover = null;
                    tL_messages_uploadMedia.media = inputMedia4;
                    sendMessagesHelper.getConnectionsManager().sendRequest(tL_messages_uploadMedia, new v1(10, sendMessagesHelper, delayedMessage2));
                    return;
                } else if (inputPhoto == null && delayedMessage2.coverFile != null && delayedMessage2.performCoverUpload) {
                    TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia2 = new TLRPC.TL_messages_uploadMedia();
                    tL_messages_uploadMedia2.peer = inputPeer2;
                    TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                    tL_inputMediaUploadedPhoto.file = delayedMessage2.coverFile;
                    tL_messages_uploadMedia2.media = tL_inputMediaUploadedPhoto;
                    sendMessagesHelper.getConnectionsManager().sendRequest(tL_messages_uploadMedia2, new nk(sendMessagesHelper, inputMedia4, delayedMessage2, 1));
                    return;
                } else {
                    MessageObject messageObject4 = delayedMessage2.obj;
                    if (messageObject4 != null && (videoEditedInfo = messageObject4.videoEditedInfo) != null && videoEditedInfo.isSticker) {
                        str2 = "webp";
                    } else {
                        str2 = "jpg";
                    }
                    String str7 = FileLoader.getDirectory(i11) + "/" + delayedMessage2.photoSize.location.volume_id + "_" + delayedMessage2.photoSize.location.local_id + "." + str2;
                    sendMessagesHelper.putToDelayedMessages(str7, delayedMessage2);
                    sendMessagesHelper.getFileLoader().uploadFile(str7, false, true, 16777216);
                    sendMessagesHelper.putToUploadingMessages(delayedMessage2.obj);
                    return;
                }
            }
            MessageObject messageObject5 = delayedMessage2.obj;
            String str8 = messageObject5.messageOwner.attachPath;
            TLRPC.Document document4 = messageObject5.getDocument();
            if (str8 == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(FileLoader.getDirectory(i11));
                sb5.append("/");
                str8 = a4.a.r(sb5, document4.f17201id, ".mp4");
            }
            if (delayedMessage2.sendEncryptedRequest != null && document4.dc_id != 0) {
                File file4 = new File(str8);
                if (!file4.exists() && (file4 = sendMessagesHelper.getFileLoader().getPathToMessage(delayedMessage2.obj.messageOwner)) != null && file4.exists()) {
                    TLRPC.Message message = delayedMessage2.obj.messageOwner;
                    String absolutePath = file4.getAbsolutePath();
                    message.attachPath = absolutePath;
                    delayedMessage2.obj.attachPathExists = true;
                    str8 = absolutePath;
                }
                if ((file4 == null || (!file4.exists() && delayedMessage2.obj.getDocument() != null)) && (file4 = sendMessagesHelper.getFileLoader().getPathToAttach(delayedMessage2.obj.getDocument(), false)) != null && file4.exists()) {
                    TLRPC.Message message2 = delayedMessage2.obj.messageOwner;
                    String absolutePath2 = file4.getAbsolutePath();
                    message2.attachPath = absolutePath2;
                    delayedMessage2.obj.attachPathExists = true;
                    str8 = absolutePath2;
                }
                if (file4 == null || !file4.exists()) {
                    sendMessagesHelper.putToDelayedMessages(FileLoader.getAttachFileName(document4), delayedMessage2);
                    sendMessagesHelper.getFileLoader().loadFile(document4, delayedMessage2.parentObject, 3, 0);
                    return;
                }
            }
            String str9 = str8;
            sendMessagesHelper.putToDelayedMessages(str9, delayedMessage2);
            VideoEditedInfo videoEditedInfo5 = delayedMessage2.obj.videoEditedInfo;
            if (videoEditedInfo5 == null || !videoEditedInfo5.notReadyYet) {
                if (videoEditedInfo5 != null && videoEditedInfo5.needConvert()) {
                    sendMessagesHelper.getFileLoader().uploadFile(str9, true, false, document4.size, 33554432, false);
                } else {
                    sendMessagesHelper.getFileLoader().uploadFile(str9, true, false, 33554432);
                }
            }
            sendMessagesHelper.putToUploadingMessages(delayedMessage2.obj);
        } else if (i12 == 2) {
            String str10 = delayedMessage2.httpLocation;
            if (str10 != null) {
                sendMessagesHelper.putToDelayedMessages(str10, delayedMessage2);
                ImageLoader.getInstance().loadHttpFile(delayedMessage2.httpLocation, "gif", sendMessagesHelper.currentAccount);
                return;
            }
            TLObject tLObject3 = delayedMessage2.sendRequest;
            if (tLObject3 != null) {
                if (tLObject3 instanceof TLRPC.TL_messages_sendMedia) {
                    inputMedia3 = ((TLRPC.TL_messages_sendMedia) tLObject3).media;
                } else if (tLObject3 instanceof TL_ephemeral.TL_sendMessage) {
                    inputMedia3 = ((TL_ephemeral.TL_sendMessage) tLObject3).media;
                } else if (tLObject3 instanceof TLRPC.TL_messages_addPollAnswer) {
                    inputMedia3 = ((TLRPC.TL_messages_addPollAnswer) tLObject3).answer.input_media;
                } else {
                    inputMedia3 = ((TLRPC.TL_messages_editMessage) tLObject3).media;
                }
                if (inputMedia3.file == null) {
                    String str11 = delayedMessage2.obj.messageOwner.attachPath;
                    sendMessagesHelper.putToDelayedMessages(str11, delayedMessage2);
                    sendMessagesHelper.getFileLoader().uploadFile(str11, delayedMessage2.sendRequest == null, false, 67108864);
                    sendMessagesHelper.putToUploadingMessages(delayedMessage2.obj);
                    return;
                } else if (inputMedia3.thumb != null || (photoSize = delayedMessage2.photoSize) == null || (photoSize instanceof TLRPC.TL_photoStrippedSize)) {
                    return;
                } else {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(FileLoader.getDirectory(4));
                    sb6.append("/");
                    sb6.append(delayedMessage2.photoSize.location.volume_id);
                    sb6.append("_");
                    String n11 = a4.a.n(delayedMessage2.photoSize.location.local_id, ".jpg", sb6);
                    sendMessagesHelper.putToDelayedMessages(n11, delayedMessage2);
                    sendMessagesHelper.getFileLoader().uploadFile(n11, false, true, 16777216);
                    sendMessagesHelper.putToUploadingMessages(delayedMessage2.obj);
                    return;
                }
            }
            MessageObject messageObject6 = delayedMessage2.obj;
            String str12 = messageObject6.messageOwner.attachPath;
            TLRPC.Document document5 = messageObject6.getDocument();
            if (delayedMessage2.sendEncryptedRequest != null && document5.dc_id != 0) {
                File file5 = new File(str12);
                if (!file5.exists() && (file5 = sendMessagesHelper.getFileLoader().getPathToMessage(delayedMessage2.obj.messageOwner)) != null && file5.exists()) {
                    TLRPC.Message message3 = delayedMessage2.obj.messageOwner;
                    String absolutePath3 = file5.getAbsolutePath();
                    message3.attachPath = absolutePath3;
                    delayedMessage2.obj.attachPathExists = true;
                    str12 = absolutePath3;
                }
                if ((file5 == null || (!file5.exists() && delayedMessage2.obj.getDocument() != null)) && (file5 = sendMessagesHelper.getFileLoader().getPathToAttach(delayedMessage2.obj.getDocument(), false)) != null && file5.exists()) {
                    TLRPC.Message message4 = delayedMessage2.obj.messageOwner;
                    String absolutePath4 = file5.getAbsolutePath();
                    message4.attachPath = absolutePath4;
                    delayedMessage2.obj.attachPathExists = true;
                    str12 = absolutePath4;
                }
                if (file5 == null || !file5.exists()) {
                    sendMessagesHelper.putToDelayedMessages(FileLoader.getAttachFileName(document5), delayedMessage2);
                    sendMessagesHelper.getFileLoader().loadFile(document5, delayedMessage2.parentObject, 3, 0);
                    return;
                }
            }
            sendMessagesHelper.putToDelayedMessages(str12, delayedMessage2);
            sendMessagesHelper.getFileLoader().uploadFile(str12, true, false, 67108864);
            sendMessagesHelper.putToUploadingMessages(delayedMessage2.obj);
        } else if (i12 == 3) {
            String str13 = delayedMessage2.obj.messageOwner.attachPath;
            sendMessagesHelper.putToDelayedMessages(str13, delayedMessage2);
            sendMessagesHelper.getFileLoader().uploadFile(str13, delayedMessage2.sendRequest == null, true, 50331648);
            sendMessagesHelper.putToUploadingMessages(delayedMessage2.obj);
        } else if (i12 != 4) {
            if (i12 == 5) {
                String str14 = "stickerset_" + delayedMessage2.obj.getId();
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                tL_messages_getStickerSet.stickerset = (TLRPC.InputStickerSet) delayedMessage2.parentObject;
                sendMessagesHelper.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new b8(sendMessagesHelper, delayedMessage2, str14, 10));
                sendMessagesHelper.putToDelayedMessages(str14, delayedMessage2);
            }
        } else {
            boolean z13 = i10 < 0;
            if (!delayedMessage2.performMediaUpload && !delayedMessage2.performCoverUpload) {
                if (!delayedMessage2.messageObjects.isEmpty()) {
                    sendMessagesHelper.putToSendingMessages(((MessageObject) hc.b.i(1, delayedMessage2.messageObjects)).messageOwner, delayedMessage2.finalGroupMessage != 0);
                }
                z12 = z13;
                z11 = true;
            } else {
                int size = i10 < 0 ? delayedMessage2.messageObjects.size() - 1 : i10;
                MessageObject messageObject7 = delayedMessage2.messageObjects.get(size);
                TLRPC.Document document6 = messageObject7.getDocument();
                if (document6 == null && (MessageObject.getMedia(messageObject7) instanceof TLRPC.TL_messageMediaPaidMedia)) {
                    TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) MessageObject.getMedia(messageObject7);
                    TLRPC.MessageExtendedMedia messageExtendedMedia = size >= tL_messageMediaPaidMedia.extended_media.size() ? null : tL_messageMediaPaidMedia.extended_media.get(size);
                    TLRPC.MessageMedia messageMedia = messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia ? ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media : null;
                    document6 = messageMedia == null ? null : messageMedia.document;
                }
                if (document6 == null && (MessageObject.getMedia(messageObject7) instanceof TLRPC.TL_messageMediaPoll)) {
                    TLRPC.MessageMedia f7 = ph.f.f((TLRPC.TL_messageMediaPoll) MessageObject.getMedia(messageObject7), delayedMessage2.pollIndexes.get(size).intValue());
                    document6 = f7 == null ? null : f7.document;
                }
                if (document6 != null) {
                    VideoEditedInfo videoEditedInfo6 = delayedMessage2.videoEditedInfo;
                    if (videoEditedInfo6 != null && videoEditedInfo6.needConvert() && delayedMessage2.performMediaUpload) {
                        String str15 = messageObject7.messageOwner.attachPath;
                        if (str15 == null) {
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append(FileLoader.getDirectory(4));
                            sb7.append("/");
                            str15 = a4.a.r(sb7, document6.f17201id, ".mp4");
                        }
                        sendMessagesHelper.putToDelayedMessages(str15, delayedMessage2);
                        delayedMessage2.extraHashMap.put(messageObject7, str15);
                        delayedMessage2.extraHashMap.put(str15 + "_i", messageObject7);
                        TLRPC.PhotoSize photoSize3 = delayedMessage2.photoSize;
                        if (photoSize3 != null && photoSize3.location != null) {
                            delayedMessage2.extraHashMap.put(org.telegram.ui.Cells.r6.t(str15, "_t"), delayedMessage2.photoSize);
                        }
                        TLRPC.PhotoSize photoSize4 = delayedMessage2.coverPhotoSize;
                        if (photoSize4 != null && photoSize4.location != null) {
                            delayedMessage2.extraHashMap.put(org.telegram.ui.Cells.r6.t(str15, "_ct"), delayedMessage2.coverPhotoSize);
                        }
                        if (!delayedMessage2.videoEditedInfo.alreadyScheduledConverting) {
                            MediaController.getInstance().scheduleVideoConvert(messageObject7);
                        }
                        delayedMessage2.obj = messageObject7;
                        sendMessagesHelper.putToUploadingMessages(messageObject7);
                        z10 = z13;
                    } else {
                        String str16 = messageObject7.messageOwner.attachPath;
                        if (str16 == null) {
                            StringBuilder sb8 = new StringBuilder();
                            sb8.append(FileLoader.getDirectory(4));
                            sb8.append("/");
                            str = "_i";
                            str16 = a4.a.r(sb8, document6.f17201id, ".mp4");
                        } else {
                            str = "_i";
                        }
                        String str17 = str16;
                        TLObject tLObject4 = delayedMessage2.sendRequest;
                        if (tLObject4 != null) {
                            if (tLObject4 instanceof TLRPC.TL_messages_sendMultiMedia) {
                                TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) tLObject4;
                                inputPeer = tL_messages_sendMultiMedia.peer;
                                inputMedia = tL_messages_sendMultiMedia.multi_media.get(size).media;
                            } else {
                                if (tLObject4 instanceof TLRPC.TL_messages_sendMedia) {
                                    TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject4;
                                    inputPeer = tL_messages_sendMedia2.peer;
                                    TLRPC.InputMedia inputMedia6 = tL_messages_sendMedia2.media;
                                    if (inputMedia6 instanceof TLRPC.TL_inputMediaPaidMedia) {
                                        inputMedia = ((TLRPC.TL_inputMediaPaidMedia) inputMedia6).extended_media.get(size);
                                    } else {
                                        if (inputMedia6 instanceof TLRPC.TL_inputMediaPoll) {
                                            inputMedia = ph.f.e((TLRPC.TL_inputMediaPoll) inputMedia6, delayedMessage2.pollIndexes.get(size).intValue());
                                        }
                                        inputMedia = null;
                                    }
                                } else if (tLObject4 instanceof TL_ephemeral.TL_sendMessage) {
                                    TL_ephemeral.TL_sendMessage tL_sendMessage2 = (TL_ephemeral.TL_sendMessage) tLObject4;
                                    inputPeer = tL_sendMessage2.peer;
                                    TLRPC.InputMedia inputMedia7 = tL_sendMessage2.media;
                                    if (inputMedia7 instanceof TLRPC.TL_inputMediaPaidMedia) {
                                        inputMedia = ((TLRPC.TL_inputMediaPaidMedia) inputMedia7).extended_media.get(size);
                                    } else {
                                        if (inputMedia7 instanceof TLRPC.TL_inputMediaPoll) {
                                            inputMedia = ph.f.e((TLRPC.TL_inputMediaPoll) inputMedia7, delayedMessage2.pollIndexes.get(size).intValue());
                                        }
                                        inputMedia = null;
                                    }
                                } else {
                                    inputMedia = null;
                                    inputPeer = null;
                                }
                                delayedMessage2.coverFile = inputFile;
                                delayedMessage2.performMediaUpload = false;
                                delayedMessage2.performCoverUpload = false;
                                z12 = z10;
                            }
                            if (inputMedia != null && inputMedia.file == null && !(inputMedia instanceof TLRPC.TL_inputMediaDocument) && delayedMessage2.performMediaUpload) {
                                sendMessagesHelper.putToDelayedMessages(str17, delayedMessage2);
                                delayedMessage2.extraHashMap.put(messageObject7, str17);
                                delayedMessage2.extraHashMap.put(str17, inputMedia);
                                delayedMessage2.extraHashMap.put(str17 + str, messageObject7);
                                TLRPC.PhotoSize photoSize5 = delayedMessage2.photoSize;
                                if (photoSize5 != null && photoSize5.location != null) {
                                    delayedMessage2.extraHashMap.put(org.telegram.ui.Cells.r6.t(str17, "_t"), delayedMessage2.photoSize);
                                }
                                TLRPC.PhotoSize photoSize6 = delayedMessage2.coverPhotoSize;
                                if (photoSize6 == null || photoSize6.location == null) {
                                    z10 = z13;
                                } else {
                                    StringBuilder sb9 = new StringBuilder();
                                    sb9.append(FileLoader.getDirectory(4));
                                    sb9.append("/");
                                    z10 = z13;
                                    sb9.append(delayedMessage2.coverPhotoSize.location.volume_id);
                                    sb9.append("_");
                                    String n12 = a4.a.n(delayedMessage2.coverPhotoSize.location.local_id, ".jpg", sb9);
                                    delayedMessage2.extraHashMap.put(org.telegram.ui.Cells.r6.t(str17, "_ct"), delayedMessage2.coverPhotoSize);
                                    delayedMessage2.extraHashMap.put(n12 + "_doc", str17);
                                }
                                VideoEditedInfo videoEditedInfo7 = messageObject7.videoEditedInfo;
                                if (videoEditedInfo7 != null && videoEditedInfo7.needConvert()) {
                                    sendMessagesHelper.getFileLoader().uploadFile(str17, false, false, document6.size, 33554432, false);
                                } else {
                                    sendMessagesHelper.getFileLoader().uploadFile(str17, false, false, 33554432);
                                }
                                sendMessagesHelper.putToUploadingMessages(messageObject7);
                            } else {
                                String str18 = str;
                                z10 = z13;
                                TLRPC.PhotoSize photoSize7 = delayedMessage2.coverPhotoSize;
                                if (photoSize7 != null && delayedMessage2.coverFile == null && inputMedia != null && inputMedia.video_cover == null) {
                                    StringBuilder sb10 = new StringBuilder();
                                    sb10.append(FileLoader.getDirectory(4));
                                    sb10.append("/");
                                    sb10.append(delayedMessage2.coverPhotoSize.location.volume_id);
                                    sb10.append("_");
                                    String n13 = a4.a.n(delayedMessage2.coverPhotoSize.location.local_id, ".jpg", sb10);
                                    sendMessagesHelper.putToDelayedMessages(n13, delayedMessage2);
                                    TLRPC.PhotoSize photoSize8 = delayedMessage2.coverPhotoSize;
                                    if (photoSize8 == null || photoSize8.location == null) {
                                        inputMedia2 = inputMedia;
                                    } else {
                                        StringBuilder sb11 = new StringBuilder();
                                        sb11.append(FileLoader.getDirectory(4));
                                        sb11.append("/");
                                        inputMedia2 = inputMedia;
                                        sb11.append(delayedMessage2.coverPhotoSize.location.volume_id);
                                        sb11.append("_");
                                        String n14 = a4.a.n(delayedMessage2.coverPhotoSize.location.local_id, ".jpg", sb11);
                                        delayedMessage2.extraHashMap.put(org.telegram.ui.Cells.r6.t(str17, "_ct"), delayedMessage2.coverPhotoSize);
                                        delayedMessage2.extraHashMap.put(n14 + "_doc", str17);
                                    }
                                    delayedMessage2.extraHashMap.put(n13 + "_o", str17);
                                    delayedMessage2.extraHashMap.put(str17 + str18, messageObject7);
                                    delayedMessage2.extraHashMap.put(messageObject7, n13);
                                    delayedMessage2.extraHashMap.put(n13, inputMedia2);
                                    getFileLoader().uploadFile(n13, false, true, 16777216);
                                    sendMessagesHelper = this;
                                    sendMessagesHelper.putToUploadingMessages(messageObject7);
                                } else if (photoSize7 != null && delayedMessage2.coverFile != null && inputMedia != null && inputMedia.video_cover == null && (inputMedia instanceof TLRPC.TL_inputMediaUploadedDocument) && inputMedia.file != null && (delayedMessage2.sendRequest instanceof TLRPC.TL_messages_sendMultiMedia) && (arrayList = delayedMessage2.livePhotoIndexes) != null && size >= 0 && size < arrayList.size() && Boolean.TRUE.equals(delayedMessage2.livePhotoIndexes.get(size))) {
                                    TLRPC.InputFile inputFile4 = delayedMessage2.coverFile;
                                    inputMedia.flags &= -65;
                                    inputMedia.video_cover = null;
                                    TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia3 = new TLRPC.TL_messages_uploadMedia();
                                    tL_messages_uploadMedia3.peer = inputPeer;
                                    tL_messages_uploadMedia3.media = inputMedia;
                                    ConnectionsManager connectionsManager = sendMessagesHelper.getConnectionsManager();
                                    qi qiVar = new qi(size, 0, this, inputMedia, delayedMessage2, str17, inputFile4);
                                    delayedMessage2 = delayedMessage2;
                                    connectionsManager.sendRequest(tL_messages_uploadMedia3, qiVar);
                                    sendMessagesHelper = this;
                                } else if (delayedMessage2.coverPhotoSize != null && delayedMessage2.coverFile != null && inputMedia != null && inputMedia.video_cover == null) {
                                    TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia4 = new TLRPC.TL_messages_uploadMedia();
                                    tL_messages_uploadMedia4.peer = inputPeer;
                                    TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto2 = new TLRPC.TL_inputMediaUploadedPhoto();
                                    tL_inputMediaUploadedPhoto2.file = delayedMessage2.coverFile;
                                    tL_messages_uploadMedia4.media = tL_inputMediaUploadedPhoto2;
                                    sendMessagesHelper = this;
                                    getConnectionsManager().sendRequest(tL_messages_uploadMedia4, new aa(sendMessagesHelper, inputMedia, delayedMessage2, str17, messageObject7, 3));
                                } else {
                                    sendMessagesHelper = this;
                                    if (delayedMessage2.photoSize != null) {
                                        StringBuilder sb12 = new StringBuilder();
                                        sb12.append(FileLoader.getDirectory(4));
                                        sb12.append("/");
                                        sb12.append(delayedMessage2.photoSize.location.volume_id);
                                        sb12.append("_");
                                        String n15 = a4.a.n(delayedMessage2.photoSize.location.local_id, ".jpg", sb12);
                                        sendMessagesHelper.putToDelayedMessages(n15, delayedMessage2);
                                        delayedMessage2.extraHashMap.put(n15 + "_o", str17);
                                        delayedMessage2.extraHashMap.put(messageObject7, n15);
                                        delayedMessage2.extraHashMap.put(n15, inputMedia);
                                        sendMessagesHelper.getFileLoader().uploadFile(n15, false, true, 16777216);
                                        sendMessagesHelper.putToUploadingMessages(messageObject7);
                                    }
                                }
                            }
                        } else {
                            z10 = z13;
                            sendMessagesHelper.putToDelayedMessages(str17, delayedMessage2);
                            delayedMessage2.extraHashMap.put(messageObject7, str17);
                            delayedMessage2.extraHashMap.put(str17, ((TLRPC.TL_messages_sendEncryptedMultiMedia) delayedMessage2.sendEncryptedRequest).files.get(size));
                            delayedMessage2.extraHashMap.put(str17 + str, messageObject7);
                            TLRPC.PhotoSize photoSize9 = delayedMessage2.photoSize;
                            if (photoSize9 != null && photoSize9.location != null) {
                                delayedMessage2.extraHashMap.put(org.telegram.ui.Cells.r6.t(str17, "_t"), delayedMessage2.photoSize);
                            }
                            VideoEditedInfo videoEditedInfo8 = messageObject7.videoEditedInfo;
                            if (videoEditedInfo8 != null && videoEditedInfo8.needConvert()) {
                                sendMessagesHelper.getFileLoader().uploadFile(str17, true, false, document6.size, 33554432, false);
                            } else {
                                sendMessagesHelper.getFileLoader().uploadFile(str17, true, false, 33554432);
                            }
                            sendMessagesHelper.putToUploadingMessages(messageObject7);
                        }
                    }
                    inputFile = null;
                    delayedMessage2.videoEditedInfo = null;
                    delayedMessage2.photoSize = null;
                    delayedMessage2.coverPhotoSize = null;
                } else {
                    z10 = z13;
                    String str19 = delayedMessage2.httpLocation;
                    if (str19 != null) {
                        sendMessagesHelper.putToDelayedMessages(str19, delayedMessage2);
                        delayedMessage2.extraHashMap.put(messageObject7, delayedMessage2.httpLocation);
                        delayedMessage2.extraHashMap.put(delayedMessage2.httpLocation, messageObject7);
                        ImageLoader.getInstance().loadHttpFile(delayedMessage2.httpLocation, "file", sendMessagesHelper.currentAccount);
                        inputFile = null;
                        delayedMessage2.httpLocation = null;
                    } else {
                        TLObject tLObject5 = delayedMessage2.sendRequest;
                        if (tLObject5 instanceof TLRPC.TL_messages_sendMultiMedia) {
                            inputEncryptedFile = ((TLRPC.TL_messages_sendMultiMedia) tLObject5).multi_media.get(size).media;
                        } else {
                            boolean z14 = tLObject5 instanceof TLRPC.TL_messages_sendMedia;
                            if (z14) {
                                TLRPC.InputMedia inputMedia8 = ((TLRPC.TL_messages_sendMedia) tLObject5).media;
                                if (inputMedia8 instanceof TLRPC.TL_inputMediaPaidMedia) {
                                    inputEncryptedFile = ((TLRPC.TL_inputMediaPaidMedia) inputMedia8).extended_media.get(size);
                                }
                            }
                            if (z14) {
                                TLRPC.InputMedia inputMedia9 = ((TLRPC.TL_messages_sendMedia) tLObject5).media;
                                if (inputMedia9 instanceof TLRPC.TL_inputMediaPoll) {
                                    inputEncryptedFile = ph.f.e((TLRPC.TL_inputMediaPoll) inputMedia9, delayedMessage2.pollIndexes.get(size).intValue());
                                }
                            }
                            boolean z15 = tLObject5 instanceof TL_ephemeral.TL_sendMessage;
                            if (z15) {
                                TLRPC.InputMedia inputMedia10 = ((TL_ephemeral.TL_sendMessage) tLObject5).media;
                                if (inputMedia10 instanceof TLRPC.TL_inputMediaPaidMedia) {
                                    inputEncryptedFile = ((TLRPC.TL_inputMediaPaidMedia) inputMedia10).extended_media.get(size);
                                }
                            }
                            if (z15) {
                                TLRPC.InputMedia inputMedia11 = ((TL_ephemeral.TL_sendMessage) tLObject5).media;
                                if (inputMedia11 instanceof TLRPC.TL_inputMediaPoll) {
                                    inputEncryptedFile = ph.f.e((TLRPC.TL_inputMediaPoll) inputMedia11, delayedMessage2.pollIndexes.get(size).intValue());
                                }
                            }
                            inputEncryptedFile = ((TLRPC.TL_messages_sendEncryptedMultiMedia) delayedMessage2.sendEncryptedRequest).files.get(size);
                        }
                        String file6 = FileLoader.getInstance(sendMessagesHelper.currentAccount).getPathToAttach(delayedMessage2.photoSize).toString();
                        sendMessagesHelper.putToDelayedMessages(file6, delayedMessage2);
                        delayedMessage2.extraHashMap.put(file6, inputEncryptedFile);
                        delayedMessage2.extraHashMap.put(messageObject7, file6);
                        z11 = true;
                        sendMessagesHelper.getFileLoader().uploadFile(file6, delayedMessage2.sendEncryptedRequest != null, true, 16777216);
                        sendMessagesHelper.putToUploadingMessages(messageObject7);
                        inputFile = null;
                        delayedMessage2.photoSize = null;
                        delayedMessage2.coverFile = inputFile;
                        delayedMessage2.performMediaUpload = false;
                        delayedMessage2.performCoverUpload = false;
                        z12 = z10;
                    }
                }
                z11 = true;
                delayedMessage2.coverFile = inputFile;
                delayedMessage2.performMediaUpload = false;
                delayedMessage2.performCoverUpload = false;
                z12 = z10;
            }
            sendMessagesHelper.sendReadyToSendGroup(delayedMessage2, z12, z11);
        }
    }

    public static void prepareSendingArticle(AccountInstance accountInstance, ArrayList<TL_iv.PageBlock> arrayList, ArrayList<TLRPC.Photo> arrayList2, ArrayList<TLRPC.Document> arrayList3, ArrayList<TLRPC.InputUser> arrayList4, boolean z10, long j3, MessageObject messageObject, MessageObject messageObject2, boolean z11, int i10, int i11, SendMessageChatArguments sendMessageChatArguments, long j10, long j11, long j12) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
        richMessage.rtl = z10;
        int size = arrayList.size();
        int i12 = 0;
        int i13 = 0;
        while (i13 < size) {
            TL_iv.PageBlock pageBlock = arrayList.get(i13);
            i13++;
            TL_iv.PageBlock pageBlock2 = pageBlock;
            if (pageBlock2 != null) {
                richMessage.blocks.add(pageBlock2);
            }
        }
        if (richMessage.blocks.isEmpty()) {
            return;
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            richMessage.photos.addAll(arrayList2);
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            richMessage.documents.addAll(arrayList3);
        }
        IdentityHashMap identityHashMap = new IdentityHashMap();
        ArrayList<TL_iv.PageBlock> arrayList5 = richMessage.blocks;
        int size2 = arrayList5.size();
        while (i12 < size2) {
            TL_iv.PageBlock pageBlock3 = arrayList5.get(i12);
            i12++;
            clearRichTextParentsInBlock(pageBlock3, identityHashMap);
        }
        SendMessageParams ofRichMessage = SendMessageParams.ofRichMessage(richMessage, j3, messageObject, messageObject2, null, null, z11, i10, i11);
        ofRichMessage.richMessageInputUsers = arrayList4;
        ofRichMessage.sendMessageChatArguments = sendMessageChatArguments;
        ofRichMessage.effect_id = j10;
        ofRichMessage.monoForumPeer = j11;
        ofRichMessage.payStars = j12;
        accountInstance.getSendMessagesHelper().sendMessage(ofRichMessage);
    }

    public static void prepareSendingAudioDocuments(final AccountInstance accountInstance, final ArrayList<MessageObject> arrayList, final CharSequence charSequence, final long j3, final MessageObject messageObject, final MessageObject messageObject2, final TL_stories.StoryItem storyItem, final boolean z10, final int i10, final int i11, final MessageObject messageObject3, final SendMessageChatArguments sendMessageChatArguments, final long j10, final boolean z11, final long j11, final ph.h hVar, final ArrayList<Integer> arrayList2, final boolean z12, final Runnable runnable) {
        new Thread(new Runnable() {
            @Override
            public final void run() {
                SendMessagesHelper.lambda$prepareSendingAudioDocuments$116(ph.h.this, arrayList, j3, accountInstance, charSequence, z12, arrayList2, messageObject3, messageObject, messageObject2, z10, i10, i11, storyItem, sendMessageChatArguments, j10, z11, j11, runnable);
            }
        }).start();
    }

    public static void prepareSendingBotContextResult(final org.telegram.ui.ActionBar.p2 p2Var, final AccountInstance accountInstance, final TLRPC.BotInlineResult botInlineResult, final HashMap<String, String> hashMap, final long j3, final MessageObject messageObject, final MessageObject messageObject2, final TL_stories.StoryItem storyItem, final tn tnVar, final boolean z10, final int i10, final int i11, final SendMessageChatArguments sendMessageChatArguments, final long j10, final long j11) {
        SendMessageParams of2;
        TLRPC.TL_webPagePending tL_webPagePending;
        if (botInlineResult == null) {
            return;
        }
        TLRPC.BotInlineMessage botInlineMessage = botInlineResult.send_message;
        if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaAuto) {
            new Thread(new Runnable() {
                @Override
                public final void run() {
                    SendMessagesHelper.lambda$prepareSendingBotContextResult$123(j3, botInlineResult, accountInstance, hashMap, p2Var, messageObject, messageObject2, z10, i10, i11, sendMessageChatArguments, storyItem, tnVar, j10, j11);
                }
            }).run();
        } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageText) {
            if (DialogObject.isEncryptedDialog(j3)) {
                for (int i12 = 0; i12 < botInlineResult.send_message.entities.size(); i12++) {
                    TLRPC.MessageEntity messageEntity = botInlineResult.send_message.entities.get(i12);
                    if (messageEntity instanceof TLRPC.TL_messageEntityUrl) {
                        tL_webPagePending = new TLRPC.TL_webPagePending();
                        String str = botInlineResult.send_message.message;
                        int i13 = messageEntity.offset;
                        tL_webPagePending.url = str.substring(i13, messageEntity.length + i13);
                        break;
                    }
                }
            }
            tL_webPagePending = null;
            TLRPC.TL_webPagePending tL_webPagePending2 = tL_webPagePending;
            TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult.send_message;
            SendMessageParams of3 = SendMessageParams.of(botInlineMessage2.message, j3, messageObject, messageObject2, tL_webPagePending2, !botInlineMessage2.no_webpage, botInlineMessage2.entities, botInlineMessage2.reply_markup, hashMap, z10, i10, i11, null, false);
            of3.sendMessageChatArguments = sendMessageChatArguments;
            of3.replyQuote = tnVar;
            of3.payStars = j10;
            of3.monoForumPeer = j11;
            accountInstance.getSendMessagesHelper().sendMessage(of3);
        } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageRichMessage) {
            SendMessageParams ofRichMessage = SendMessageParams.ofRichMessage(botInlineMessage.rich_message, j3, messageObject, messageObject2, botInlineMessage.reply_markup, hashMap, z10, i10, i11);
            ofRichMessage.sendMessageChatArguments = sendMessageChatArguments;
            ofRichMessage.replyQuote = tnVar;
            ofRichMessage.payStars = j10;
            ofRichMessage.monoForumPeer = j11;
            accountInstance.getSendMessagesHelper().sendMessage(ofRichMessage);
        } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue) {
            TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
            TLRPC.BotInlineMessage botInlineMessage3 = botInlineResult.send_message;
            tL_messageMediaVenue.geo = botInlineMessage3.geo;
            tL_messageMediaVenue.address = botInlineMessage3.address;
            tL_messageMediaVenue.title = botInlineMessage3.title;
            tL_messageMediaVenue.provider = botInlineMessage3.provider;
            String str2 = botInlineMessage3.venue_type;
            tL_messageMediaVenue.venue_id = str2;
            tL_messageMediaVenue.venue_type = str2;
            if (str2 == null) {
                tL_messageMediaVenue.venue_type = "";
            }
            SendMessageParams of4 = SendMessageParams.of(tL_messageMediaVenue, j3, messageObject, messageObject2, botInlineMessage3.reply_markup, hashMap, z10, i10, i11);
            of4.sendMessageChatArguments = sendMessageChatArguments;
            of4.replyQuote = tnVar;
            of4.payStars = j10;
            of4.monoForumPeer = j11;
            accountInstance.getSendMessagesHelper().sendMessage(of4);
        } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaGeo) {
            if (botInlineMessage.period == 0 && botInlineMessage.proximity_notification_radius == 0) {
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.BotInlineMessage botInlineMessage4 = botInlineResult.send_message;
                tL_messageMediaGeo.geo = botInlineMessage4.geo;
                tL_messageMediaGeo.heading = botInlineMessage4.heading;
                of2 = SendMessageParams.of(tL_messageMediaGeo, j3, messageObject, messageObject2, botInlineMessage4.reply_markup, hashMap, z10, i10, i11);
            } else {
                TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
                TLRPC.BotInlineMessage botInlineMessage5 = botInlineResult.send_message;
                int i14 = botInlineMessage5.period;
                if (i14 == 0) {
                    i14 = 900;
                }
                tL_messageMediaGeoLive.period = i14;
                tL_messageMediaGeoLive.geo = botInlineMessage5.geo;
                tL_messageMediaGeoLive.heading = botInlineMessage5.heading;
                tL_messageMediaGeoLive.proximity_notification_radius = botInlineMessage5.proximity_notification_radius;
                of2 = SendMessageParams.of(tL_messageMediaGeoLive, j3, messageObject, messageObject2, botInlineMessage5.reply_markup, hashMap, z10, i10, i11);
            }
            of2.sendMessageChatArguments = sendMessageChatArguments;
            of2.replyQuote = tnVar;
            of2.payStars = j10;
            of2.monoForumPeer = j11;
            accountInstance.getSendMessagesHelper().sendMessage(of2);
        } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaContact) {
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
            SendMessageParams of5 = SendMessageParams.of(tL_user, j3, messageObject, messageObject2, botInlineResult.send_message.reply_markup, hashMap, z10, i10, i11);
            of5.sendMessageChatArguments = sendMessageChatArguments;
            of5.replyQuote = tnVar;
            of5.payStars = j10;
            of5.monoForumPeer = j11;
            accountInstance.getSendMessagesHelper().sendMessage(of5);
        } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaInvoice) {
            if (DialogObject.isEncryptedDialog(j3)) {
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
            SendMessageParams of6 = SendMessageParams.of(tL_messageMediaInvoice, j3, messageObject, messageObject2, botInlineResult.send_message.reply_markup, hashMap, z10, i10, i11);
            of6.sendMessageChatArguments = sendMessageChatArguments;
            of6.replyQuote = tnVar;
            of6.payStars = j10;
            of6.monoForumPeer = j11;
            accountInstance.getSendMessagesHelper().sendMessage(of6);
        } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaWebPage) {
            TLRPC.TL_webPagePending tL_webPagePending3 = new TLRPC.TL_webPagePending();
            tL_webPagePending3.url = ((TLRPC.TL_botInlineMessageMediaWebPage) botInlineMessage).url;
            TLRPC.BotInlineMessage botInlineMessage7 = botInlineResult.send_message;
            SendMessageParams of7 = SendMessageParams.of(botInlineMessage7.message, j3, messageObject, messageObject2, tL_webPagePending3, !botInlineMessage7.no_webpage, botInlineMessage7.entities, botInlineMessage7.reply_markup, hashMap, z10, i10, i11, null, false);
            of7.sendMessageChatArguments = sendMessageChatArguments;
            of7.replyQuote = tnVar;
            of7.payStars = j10;
            of7.monoForumPeer = j11;
            of7.invert_media = botInlineResult.send_message.invert_media;
            accountInstance.getSendMessagesHelper().sendMessage(of7);
        }
    }

    public static void prepareSendingDocuments(AccountInstance accountInstance, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<Uri> arrayList3, CharSequence charSequence, String str, long j3, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, tn tnVar, MessageObject messageObject3, boolean z10, int i10, t0.i iVar, SendMessageChatArguments sendMessageChatArguments, long j10, boolean z11, long j11) {
        CharSequence charSequence2;
        ArrayList<TLRPC.MessageEntity> arrayList4;
        if (charSequence != null) {
            CharSequence[] charSequenceArr = {charSequence};
            ArrayList<TLRPC.MessageEntity> entities = accountInstance.getMediaDataController().getEntities(charSequenceArr, true);
            charSequence2 = charSequenceArr[0];
            arrayList4 = entities;
        } else {
            charSequence2 = charSequence;
            arrayList4 = null;
        }
        prepareSendingDocuments(accountInstance, arrayList, arrayList2, arrayList3, charSequence2 != null ? charSequence2.toString() : null, arrayList4, str, j3, messageObject, messageObject2, storyItem, tnVar, messageObject3, z10, i10, 0, iVar, sendMessageChatArguments, j10, z11, j11, 0L, null);
    }

    public static void prepareSendingMedia(AccountInstance accountInstance, ArrayList<SendingMediaInfo> arrayList, long j3, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, tn tnVar, boolean z10, boolean z11, MessageObject messageObject3, TLRPC.TL_inputPollAnswer tL_inputPollAnswer, boolean z12, int i10, int i11, int i12, boolean z13, t0.i iVar, SendMessageChatArguments sendMessageChatArguments, long j10, boolean z14, long j11, long j12, MessageSuggestionParams messageSuggestionParams) {
        prepareSendingMedia(accountInstance, arrayList, j3, messageObject, messageObject2, storyItem, tnVar, z10, z11, messageObject3, tL_inputPollAnswer, z12, i10, i11, i12, z13, iVar, sendMessageChatArguments, j10, z14, j11, j12, messageSuggestionParams, null, false);
    }

    public static void prepareSendingPhoto(AccountInstance accountInstance, String str, String str2, Uri uri, long j3, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, tn tnVar, ArrayList<TLRPC.MessageEntity> arrayList, ArrayList<TLRPC.InputDocument> arrayList2, t0.i iVar, int i10, MessageObject messageObject3, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11, CharSequence charSequence, SendMessageChatArguments sendMessageChatArguments, long j10, long j11) {
        prepareSendingPhoto(accountInstance, str, str2, uri, j3, messageObject, messageObject2, storyItem, tnVar, arrayList, arrayList2, iVar, i10, messageObject3, videoEditedInfo, z10, i11, 0, i12, z11, charSequence, sendMessageChatArguments, j10, j11, 0L, null);
    }

    public static void prepareSendingText(AccountInstance accountInstance, CharSequence charSequence, long j3, long j10, boolean z10, int i10, int i11, long j11) {
        accountInstance.getMessagesStorage().getStorageQueue().postRunnable(new xi(charSequence, accountInstance, j10, j3, z10, i10, i11, j11, 0));
    }

    public static void prepareSendingVideo(AccountInstance accountInstance, String str, VideoEditedInfo videoEditedInfo, String str2, TLRPC.Photo photo, long j3, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, tn tnVar, ArrayList<TLRPC.MessageEntity> arrayList, int i10, MessageObject messageObject3, boolean z10, int i11, int i12, boolean z11, boolean z12, CharSequence charSequence, SendMessageChatArguments sendMessageChatArguments, long j10, long j11, long j12, MessageSuggestionParams messageSuggestionParams) {
        prepareSendingVideo(accountInstance, str, videoEditedInfo, str2, photo, j3, messageObject, messageObject2, storyItem, tnVar, arrayList, i10, messageObject3, z10, i11, i12, z11, z12, charSequence, sendMessageChatArguments, j10, j11, j12, messageSuggestionParams, false);
    }

    private void updateMediaPaths(org.telegram.messenger.MessageObject r27, org.telegram.tgnet.TLRPC.Message r28, int r29, java.util.List<java.lang.String> r30, boolean r31, int r32, java.util.HashMap<java.lang.String, java.lang.String> r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.updateMediaPaths(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$Message, int, java.util.List, boolean, int, java.util.HashMap):void");
    }

    public void editMessage(org.telegram.messenger.MessageObject r34, org.telegram.tgnet.TLRPC.TL_inputPollAnswer r35, org.telegram.tgnet.TLRPC.TL_photo r36, org.telegram.messenger.VideoEditedInfo r37, org.telegram.tgnet.TLRPC.TL_document r38, java.lang.String r39, org.telegram.tgnet.TLRPC.PhotoSize r40, java.util.HashMap<java.lang.String, java.lang.String> r41, boolean r42, boolean r43, java.lang.Object r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.editMessage(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$TL_inputPollAnswer, org.telegram.tgnet.TLRPC$TL_photo, org.telegram.messenger.VideoEditedInfo, org.telegram.tgnet.TLRPC$TL_document, java.lang.String, org.telegram.tgnet.TLRPC$PhotoSize, java.util.HashMap, boolean, boolean, java.lang.Object):void");
    }

    public TLRPC.TL_photo generatePhotoSizes(TLRPC.TL_photo tL_photo, String str, Uri uri, boolean z10) {
        TLRPC.PhotoSize scaleAndSaveImage;
        Bitmap bitmap;
        Bitmap loadBitmap = ImageLoader.loadBitmap(str, uri, AndroidUtilities.getPhotoSize(z10), AndroidUtilities.getPhotoSize(z10), true);
        if (loadBitmap == null) {
            loadBitmap = ImageLoader.loadBitmap(str, uri, 800.0f, 800.0f, true);
        }
        Bitmap bitmap2 = loadBitmap;
        ArrayList<TLRPC.PhotoSize> arrayList = new ArrayList<>();
        TLRPC.PhotoSize scaleAndSaveImage2 = ImageLoader.scaleAndSaveImage(bitmap2, 90.0f, 90.0f, 55, true);
        if (scaleAndSaveImage2 != null) {
            arrayList.add(scaleAndSaveImage2);
        }
        if (z10) {
            bitmap = bitmap2;
            scaleAndSaveImage = ImageLoader.scaleAndSaveImage(null, bitmap, Bitmap.CompressFormat.JPEG, true, AndroidUtilities.getPhotoSize(z10), AndroidUtilities.getPhotoSize(z10), 99, false, 101, 101, false);
        } else {
            scaleAndSaveImage = ImageLoader.scaleAndSaveImage(bitmap2, AndroidUtilities.getPhotoSize(z10), AndroidUtilities.getPhotoSize(z10), true, 80, false, 101, 101);
            bitmap = bitmap2;
        }
        if (scaleAndSaveImage != null) {
            arrayList.add(scaleAndSaveImage);
        }
        if (bitmap != null) {
            bitmap.recycle();
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

    public void lambda$performSendMessageRequest$82(TLObject tLObject, final MessageObject messageObject, final String str, final DelayedMessage delayedMessage, final boolean z10, final DelayedMessage delayedMessage2, final Object obj, final HashMap<String, String> hashMap, final boolean z11) {
        DelayedMessage findMaxDelayedMessageForMessageId;
        ArrayList<DelayedMessageSendAfterRequest> arrayList;
        if (tLObject instanceof TLRPC.TL_messages_addPollAnswer) {
            TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer = (TLRPC.TL_messages_addPollAnswer) tLObject;
            TLRPC.InputMedia inputMedia = tL_messages_addPollAnswer.answer.input_media;
            if ((inputMedia instanceof TLRPC.TL_inputMediaUploadedDocument) || (inputMedia instanceof TLRPC.TL_inputMediaUploadedPhoto)) {
                TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
                tL_messages_uploadMedia.peer = tL_messages_addPollAnswer.peer;
                tL_messages_uploadMedia.media = tL_messages_addPollAnswer.answer.input_media;
                getConnectionsManager().sendRequest(tL_messages_uploadMedia, new si(this, tL_messages_addPollAnswer, tL_messages_addPollAnswer, messageObject, str, delayedMessage, z10, delayedMessage2, obj, hashMap, z11));
                return;
            }
        }
        if (!(tLObject instanceof TLRPC.TL_messages_editMessage) && z10 && (findMaxDelayedMessageForMessageId = findMaxDelayedMessageForMessageId(messageObject.getId(), messageObject.getDialogId())) != null) {
            findMaxDelayedMessageForMessageId.addDelayedRequest(tLObject, messageObject, str, obj, delayedMessage2, delayedMessage != null ? delayedMessage.scheduled : false);
            if (delayedMessage == null || (arrayList = delayedMessage.requests) == null) {
                return;
            }
            findMaxDelayedMessageForMessageId.requests.addAll(arrayList);
            return;
        }
        TLRPC.Message message = messageObject.messageOwner;
        putToSendingMessages(message, z11);
        xh.v5 y3 = xh.v5.y(this.currentAccount, false);
        ti tiVar = new ti(this, tLObject, messageObject, str, delayedMessage, z10, delayedMessage2, obj, hashMap, z11, 0);
        if (messageObject.messageOwner != null) {
            int id2 = messageObject.getId();
            if (xh.v5.o(tLObject) > 0 && y3.Q.remove(Integer.valueOf(id2))) {
                y3.R.put(Integer.valueOf(id2), tiVar);
                return;
            }
        }
        if (BotForumHelper.getInstance(this.currentAccount).beforeSendingFinalRequest(tLObject, messageObject, new ti(this, tLObject, messageObject, str, delayedMessage, z10, delayedMessage2, obj, hashMap, z11, 1))) {
            if (xf.u.g(this.currentAccount).a(tLObject, Collections.singletonList(messageObject), new Utilities.Callback() {
                @Override
                public final void run(Object obj2) {
                    Object obj3 = obj;
                    String str2 = str;
                    HashMap hashMap2 = hashMap;
                    MessageObject messageObject2 = messageObject;
                    SendMessagesHelper.DelayedMessage delayedMessage3 = delayedMessage;
                    SendMessagesHelper.DelayedMessage delayedMessage4 = delayedMessage2;
                    SendMessagesHelper.this.lambda$performSendMessageRequest$79(messageObject2, str2, delayedMessage3, z10, delayedMessage4, obj3, hashMap2, z11, (TLObject) obj2);
                }
            })) {
                message.reqId = getConnectionsManager().sendRequest(tLObject, new si(this, tLObject, messageObject, str, delayedMessage, z10, delayedMessage2, obj, hashMap, z11, message), new d(6, this, message), (tLObject instanceof TLRPC.TL_messages_sendMessage ? 128 : 0) | 68);
                if (delayedMessage != null) {
                    delayedMessage.sendDelayedRequests();
                }
            }
        }
    }

    public void lambda$sendCallback$40(boolean r19, org.telegram.messenger.MessageObject r20, org.telegram.tgnet.tl.TL_keyboard.KeyboardButtonProto r21, org.telegram.tgnet.TLRPC.InputCheckPasswordSRP r22, org.telegram.ui.TwoStepVerificationActivity r23, org.telegram.ui.eo r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.lambda$sendCallback$40(boolean, org.telegram.messenger.MessageObject, org.telegram.tgnet.tl.TL_keyboard$KeyboardButtonProto, org.telegram.tgnet.TLRPC$InputCheckPasswordSRP, org.telegram.ui.TwoStepVerificationActivity, org.telegram.ui.eo):void");
    }

    public int sendMessage(ArrayList<MessageObject> arrayList, long j3, boolean z10, boolean z11, boolean z12, int i10, MessageObject messageObject, int i11, long j10) {
        return sendMessage(arrayList, j3, z10, z11, z12, i10, 0, messageObject, i11, j10, 0L, null);
    }

    public void sendSticker(TLRPC.Document document, String str, long j3, CharSequence charSequence, VideoEditedInfo videoEditedInfo, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, tn tnVar, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, boolean z11, Object obj, SendMessageChatArguments sendMessageChatArguments, long j10, long j11, MessageSuggestionParams messageSuggestionParams) {
        sendSticker(document, str, j3, charSequence, videoEditedInfo, messageObject, messageObject2, storyItem, tnVar, sendAnimationData, z10, i10, i11, z11, obj, sendMessageChatArguments, j10, j11, messageSuggestionParams, false);
    }

    public static class LocationProvider {
        private LocationProviderDelegate delegate;
        private Location lastKnownLocation;
        private LocationManager locationManager;
        private Runnable locationQueryCancelRunnable;
        private GpsLocationListener gpsLocationListener = new GpsLocationListener();
        private GpsLocationListener networkLocationListener = new GpsLocationListener();

        public interface LocationProviderDelegate {
            void onLocationAcquired(Location location);

            void onUnableLocationAcquire();
        }

        public LocationProvider() {
        }

        public void cleanup() {
            this.locationManager.removeUpdates(this.gpsLocationListener);
            this.locationManager.removeUpdates(this.networkLocationListener);
            this.lastKnownLocation = null;
            this.locationQueryCancelRunnable = null;
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

        public void setDelegate(LocationProviderDelegate locationProviderDelegate) {
            this.delegate = locationProviderDelegate;
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
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            try {
                Location lastKnownLocation = this.locationManager.getLastKnownLocation("gps");
                this.lastKnownLocation = lastKnownLocation;
                if (lastKnownLocation == null) {
                    this.lastKnownLocation = this.locationManager.getLastKnownLocation("network");
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            Runnable runnable = this.locationQueryCancelRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
            }
            dh dhVar = new dh(this, 14);
            this.locationQueryCancelRunnable = dhVar;
            AndroidUtilities.runOnUIThread(dhVar, 5000L);
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

        public LocationProvider(LocationProviderDelegate locationProviderDelegate) {
            this.delegate = locationProviderDelegate;
        }

        public class GpsLocationListener implements LocationListener {
            private GpsLocationListener() {
                LocationProvider.this = r1;
            }

            @Override
            public void onLocationChanged(Location location) {
                if (location != null && LocationProvider.this.locationQueryCancelRunnable != null) {
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

            @Override
            public void onProviderDisabled(String str) {
            }

            @Override
            public void onProviderEnabled(String str) {
            }

            @Override
            public void onStatusChanged(String str, int i10, Bundle bundle) {
            }
        }
    }

    public static void prepareSendingMedia(final AccountInstance accountInstance, final ArrayList<SendingMediaInfo> arrayList, final long j3, final MessageObject messageObject, final MessageObject messageObject2, final TL_stories.StoryItem storyItem, final tn tnVar, final boolean z10, boolean z11, final MessageObject messageObject3, final TLRPC.TL_inputPollAnswer tL_inputPollAnswer, final boolean z12, final int i10, final int i11, int i12, final boolean z13, final t0.i iVar, final SendMessageChatArguments sendMessageChatArguments, final long j10, final boolean z14, final long j11, final long j12, final MessageSuggestionParams messageSuggestionParams, final ph.h hVar, final boolean z15) {
        final boolean z16;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                z16 = z11;
                break;
            } else if (arrayList.get(i13).ttl > 0) {
                z16 = false;
                break;
            } else {
                i13++;
            }
        }
        final long j13 = hVar != null ? hVar.d : 0L;
        final boolean z17 = j13 != 0;
        mediaSendQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                SendMessagesHelper.lambda$prepareSendingMedia$132(arrayList, j3, z10, z16, z17, accountInstance, j13, messageObject3, tL_inputPollAnswer, messageObject, messageObject2, z12, i10, i11, storyItem, tnVar, sendMessageChatArguments, j10, z14, j11, j12, messageSuggestionParams, hVar, z15, iVar, z13);
            }
        });
    }

    public static void prepareSendingPhoto(AccountInstance accountInstance, String str, String str2, Uri uri, long j3, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, tn tnVar, ArrayList<TLRPC.MessageEntity> arrayList, ArrayList<TLRPC.InputDocument> arrayList2, t0.i iVar, int i10, MessageObject messageObject3, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, int i13, boolean z11, CharSequence charSequence, SendMessageChatArguments sendMessageChatArguments, long j10, long j11, long j12, MessageSuggestionParams messageSuggestionParams) {
        SendingMediaInfo sendingMediaInfo = new SendingMediaInfo();
        sendingMediaInfo.path = str;
        sendingMediaInfo.thumbPath = str2;
        sendingMediaInfo.uri = uri;
        if (charSequence != null) {
            sendingMediaInfo.caption = charSequence.toString();
        }
        sendingMediaInfo.entities = arrayList;
        sendingMediaInfo.ttl = i10;
        if (arrayList2 != null) {
            sendingMediaInfo.masks = new ArrayList<>(arrayList2);
        }
        sendingMediaInfo.videoEditedInfo = videoEditedInfo;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(sendingMediaInfo);
        prepareSendingMedia(accountInstance, arrayList3, j3, messageObject, messageObject2, null, tnVar, z11, false, messageObject3, z10, i11, 0, i13, false, iVar, sendMessageChatArguments, j10, false, j11, j12, messageSuggestionParams);
    }

    public static void prepareSendingVideo(final AccountInstance accountInstance, final String str, final VideoEditedInfo videoEditedInfo, final String str2, final TLRPC.Photo photo, final long j3, final MessageObject messageObject, final MessageObject messageObject2, final TL_stories.StoryItem storyItem, final tn tnVar, final ArrayList<TLRPC.MessageEntity> arrayList, final int i10, final MessageObject messageObject3, final boolean z10, final int i11, final int i12, final boolean z11, final boolean z12, final CharSequence charSequence, final SendMessageChatArguments sendMessageChatArguments, final long j10, final long j11, final long j12, final MessageSuggestionParams messageSuggestionParams, final boolean z13) {
        if (str == null || str.length() == 0) {
            return;
        }
        new Thread(new Runnable() {
            @Override
            public final void run() {
                SendMessagesHelper.lambda$prepareSendingVideo$137(VideoEditedInfo.this, str, j3, i10, accountInstance, str2, photo, charSequence, messageObject3, z12, messageObject, messageObject2, arrayList, z10, i11, i12, storyItem, tnVar, sendMessageChatArguments, j10, j11, j12, messageSuggestionParams, z13, z11);
            }
        }).start();
    }

    public int sendMessage(final java.util.ArrayList<org.telegram.messenger.MessageObject> r60, final long r61, final boolean r63, final boolean r64, final boolean r65, final int r66, final int r67, final org.telegram.messenger.MessageObject r68, final int r69, long r70, final long r72, final org.telegram.messenger.MessageSuggestionParams r74) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.sendMessage(java.util.ArrayList, long, boolean, boolean, boolean, int, int, org.telegram.messenger.MessageObject, int, long, long, org.telegram.messenger.MessageSuggestionParams):int");
    }

    public void sendSticker(TLRPC.Document document, String str, final long j3, final CharSequence charSequence, final VideoEditedInfo videoEditedInfo, final MessageObject messageObject, final MessageObject messageObject2, final TL_stories.StoryItem storyItem, final tn tnVar, final MessageObject.SendAnimationData sendAnimationData, final boolean z10, final int i10, final int i11, boolean z11, final Object obj, final SendMessageChatArguments sendMessageChatArguments, final long j10, final long j11, final MessageSuggestionParams messageSuggestionParams, final boolean z12) {
        final TLRPC.Document document2;
        HashMap hashMap;
        TLRPC.PhotoSize photoSize;
        byte[] bArr;
        if (document == null) {
            return;
        }
        if (DialogObject.isEncryptedDialog(j3)) {
            if (getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(j3))) == null) {
                return;
            }
            document2 = new TLRPC.TL_document_layer82();
            document2.f17201id = document.f17201id;
            document2.access_hash = document.access_hash;
            document2.date = document.date;
            document2.mime_type = document.mime_type;
            byte[] bArr2 = document.file_reference;
            document2.file_reference = bArr2;
            if (bArr2 == null) {
                document2.file_reference = new byte[0];
            }
            document2.size = document.size;
            document2.dc_id = document.dc_id;
            document2.attributes = new ArrayList<>();
            for (int i12 = 0; i12 < document.attributes.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i12);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    TLRPC.TL_documentAttributeVideo_layer159 tL_documentAttributeVideo_layer159 = new TLRPC.TL_documentAttributeVideo_layer159();
                    tL_documentAttributeVideo_layer159.flags = documentAttribute.flags;
                    tL_documentAttributeVideo_layer159.round_message = documentAttribute.round_message;
                    tL_documentAttributeVideo_layer159.supports_streaming = documentAttribute.supports_streaming;
                    tL_documentAttributeVideo_layer159.duration = documentAttribute.duration;
                    tL_documentAttributeVideo_layer159.f17202w = documentAttribute.f17202w;
                    tL_documentAttributeVideo_layer159.h = documentAttribute.h;
                    document2.attributes.add(tL_documentAttributeVideo_layer159);
                } else {
                    document2.attributes.add(documentAttribute);
                }
            }
            if (document2.mime_type == null) {
                document2.mime_type = "";
            }
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 10);
            if ((closestPhotoSizeWithSize instanceof TLRPC.TL_photoSize) || (closestPhotoSizeWithSize instanceof TLRPC.TL_photoSizeProgressive) || (closestPhotoSizeWithSize instanceof TLRPC.TL_photoStrippedSize)) {
                File pathToAttach = FileLoader.getInstance(this.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true);
                if ((closestPhotoSizeWithSize instanceof TLRPC.TL_photoStrippedSize) || pathToAttach.exists()) {
                    try {
                        if (closestPhotoSizeWithSize instanceof TLRPC.TL_photoStrippedSize) {
                            photoSize = new TLRPC.TL_photoStrippedSize();
                            bArr = closestPhotoSizeWithSize.bytes;
                        } else {
                            TLRPC.TL_photoCachedSize tL_photoCachedSize = new TLRPC.TL_photoCachedSize();
                            pathToAttach.length();
                            byte[] bArr3 = new byte[(int) pathToAttach.length()];
                            new RandomAccessFile(pathToAttach, "r").readFully(bArr3);
                            photoSize = tL_photoCachedSize;
                            bArr = bArr3;
                        }
                        TLRPC.TL_fileLocation_layer82 tL_fileLocation_layer82 = new TLRPC.TL_fileLocation_layer82();
                        TLRPC.FileLocation fileLocation = closestPhotoSizeWithSize.location;
                        tL_fileLocation_layer82.dc_id = fileLocation.dc_id;
                        tL_fileLocation_layer82.volume_id = fileLocation.volume_id;
                        tL_fileLocation_layer82.local_id = fileLocation.local_id;
                        tL_fileLocation_layer82.secret = fileLocation.secret;
                        photoSize.location = tL_fileLocation_layer82;
                        photoSize.size = closestPhotoSizeWithSize.size;
                        photoSize.f17220w = closestPhotoSizeWithSize.f17220w;
                        photoSize.h = closestPhotoSizeWithSize.h;
                        photoSize.type = closestPhotoSizeWithSize.type;
                        photoSize.bytes = bArr;
                        document2.thumbs.add(photoSize);
                        document2.flags |= 1;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
            }
            if (document2.thumbs.isEmpty()) {
                TLRPC.TL_photoSizeEmpty tL_photoSizeEmpty = new TLRPC.TL_photoSizeEmpty();
                tL_photoSizeEmpty.type = "s";
                document2.thumbs.add(tL_photoSizeEmpty);
            }
        } else {
            document2 = document;
        }
        if (MessageObject.isGifDocument(document2)) {
            mediaSendQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    SendMessagesHelper.this.lambda$sendSticker$6(document2, videoEditedInfo, j3, messageObject, messageObject2, z10, i10, i11, obj, sendAnimationData, storyItem, tnVar, sendMessageChatArguments, j10, j11, messageSuggestionParams, charSequence, z12);
                }
            });
            return;
        }
        if (TextUtils.isEmpty(str)) {
            hashMap = null;
        } else {
            hashMap = new HashMap();
            hashMap.put("query", str);
        }
        SendMessageParams of2 = SendMessageParams.of((TLRPC.TL_document) document2, null, null, j3, messageObject, messageObject2, null, null, null, hashMap, z10, i10, i11, 0, obj, sendAnimationData, z11);
        of2.replyToStoryItem = storyItem;
        of2.replyQuote = tnVar;
        of2.sendMessageChatArguments = sendMessageChatArguments;
        of2.payStars = j10;
        of2.monoForumPeer = j11;
        of2.suggestionParams = messageSuggestionParams;
        of2.invert_media = z12;
        sendMessage(of2);
    }

    public TLRPC.InputReplyTo createReplyInput(int i10) {
        return createReplyInput(null, i10, 0, null);
    }

    public void putToSendingMessages(TLRPC.Message message, boolean z10, boolean z11) {
        if (message == null) {
            return;
        }
        int i10 = message.f17216id;
        if (i10 > 0) {
            this.editingMessages.put(i10, message);
            return;
        }
        boolean z12 = this.sendingMessages.indexOfKey(i10) >= 0;
        removeFromUploadingMessages(message.f17216id, z10);
        this.sendingMessages.put(message.f17216id, message);
        if (z10 || z12 || MessageObject.isEphemeral(message)) {
            return;
        }
        long dialogId = MessageObject.getDialogId(message);
        a0.i iVar = this.sendingMessagesIdDialogs;
        iVar.k(Integer.valueOf(((Integer) iVar.g(0, dialogId)).intValue() + 1), dialogId);
        if (z11) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.sendingMessagesChanged, new Object[0]);
        }
    }

    public TLRPC.InputReplyTo createReplyInput(TLRPC.InputPeer inputPeer, int i10, int i11, tn tnVar) {
        TLRPC.TodoItem todoItem;
        MessageObject messageObject;
        TLRPC.PollAnswer pollAnswer;
        TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
        tL_inputReplyToMessage.reply_to_msg_id = i10;
        if (i11 != 0) {
            tL_inputReplyToMessage.flags |= 1;
            tL_inputReplyToMessage.top_msg_id = i11;
        }
        if (tnVar != null && tnVar.h && (pollAnswer = tnVar.f36975l) != null) {
            tL_inputReplyToMessage.poll_option = pollAnswer.option;
        } else if (tnVar != null && tnVar.f36971g && (todoItem = tnVar.f36974k) != null) {
            tL_inputReplyToMessage.flags |= 64;
            tL_inputReplyToMessage.todo_item_id = todoItem.f17340id;
        } else if (tnVar != null && !tnVar.f36971g && !tnVar.h) {
            String str = tnVar.f36972i;
            tL_inputReplyToMessage.quote_text = str;
            if (!TextUtils.isEmpty(str)) {
                tL_inputReplyToMessage.flags |= 4;
                ArrayList<TLRPC.MessageEntity> arrayList = tnVar.f36973j;
                tL_inputReplyToMessage.quote_entities = arrayList;
                if (arrayList != null && !arrayList.isEmpty()) {
                    tL_inputReplyToMessage.quote_entities = new ArrayList<>(tL_inputReplyToMessage.quote_entities);
                    tL_inputReplyToMessage.flags |= 8;
                }
                tL_inputReplyToMessage.flags |= 16;
                tL_inputReplyToMessage.quote_offset = tnVar.f36968b;
            }
        }
        if (tnVar != null && (messageObject = tnVar.f36967a) != null) {
            TLRPC.InputPeer inputPeer2 = getMessagesController().getInputPeer(messageObject.getDialogId());
            if (inputPeer2 != null && !MessageObject.peersEqual(inputPeer2, inputPeer)) {
                tL_inputReplyToMessage.flags |= 2;
                tL_inputReplyToMessage.reply_to_peer_id = inputPeer2;
            }
        }
        return tL_inputReplyToMessage;
    }

    public static void prepareSendingDocuments(AccountInstance accountInstance, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<Uri> arrayList3, String str, ArrayList<TLRPC.MessageEntity> arrayList4, String str2, long j3, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, tn tnVar, MessageObject messageObject3, boolean z10, int i10, int i11, t0.i iVar, SendMessageChatArguments sendMessageChatArguments, long j10, boolean z11, long j11, long j12, MessageSuggestionParams messageSuggestionParams) {
        prepareSendingDocuments(accountInstance, arrayList, arrayList2, arrayList3, str, arrayList4, str2, j3, messageObject, messageObject2, storyItem, tnVar, messageObject3, z10, i10, i11, iVar, sendMessageChatArguments, j10, z11, j11, j12, messageSuggestionParams, null, null, null, false);
    }

    public static void prepareSendingDocuments(final AccountInstance accountInstance, final ArrayList<String> arrayList, final ArrayList<String> arrayList2, final ArrayList<Uri> arrayList3, final String str, final ArrayList<TLRPC.MessageEntity> arrayList4, final String str2, final long j3, final MessageObject messageObject, final MessageObject messageObject2, final TL_stories.StoryItem storyItem, final tn tnVar, final MessageObject messageObject3, final boolean z10, final int i10, final int i11, final t0.i iVar, final SendMessageChatArguments sendMessageChatArguments, final long j10, final boolean z11, final long j11, final long j12, final MessageSuggestionParams messageSuggestionParams, final ph.h hVar, final ArrayList<Integer> arrayList5, final ArrayList<Integer> arrayList6, final boolean z12) {
        if (arrayList == null && arrayList2 == null && arrayList3 == null) {
            return;
        }
        if (arrayList == null || arrayList2 == null || arrayList.size() == arrayList2.size()) {
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    SendMessagesHelper.lambda$prepareSendingDocuments$118(j3, arrayList, str, hVar, accountInstance, i10, arrayList2, str2, messageObject, messageObject2, storyItem, tnVar, arrayList4, messageObject3, z12, z10, i11, iVar, sendMessageChatArguments, j10, z11, j11, j12, messageSuggestionParams, arrayList5, arrayList3, arrayList6);
                }
            });
        }
    }

    private void applyMonoForumPeerId(TLRPC.TL_messages_sendMessage tL_messages_sendMessage, long j3) {
        if (j3 != 0) {
            TLRPC.InputPeer inputPeer = getMessagesController().getInputPeer(j3);
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

    public static CharSequence getTrimmedString(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        CharSequence trimmedString = AndroidUtilities.getTrimmedString(charSequence);
        if (trimmedString.length() == 0) {
            return trimmedString;
        }
        while (charSequence.length() > 0 && charSequence.charAt(0) == '\n') {
            charSequence = charSequence.subSequence(1, charSequence.length());
        }
        while (charSequence.length() > 0 && charSequence.charAt(charSequence.length() - 1) == '\n') {
            charSequence = charSequence.subSequence(0, charSequence.length() - 1);
        }
        return charSequence;
    }

    public class DelayedMessage {
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
        public boolean isLivePhoto;
        public ArrayList<Boolean> livePhotoIndexes;
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
        public ArrayList<Integer> pollIndexes;
        public boolean pollMedia;
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

        public DelayedMessage(long j3) {
            SendMessagesHelper.this = r1;
            this.peer = j3;
        }

        public void addDelayedRequest(TLObject tLObject, MessageObject messageObject, String str, Object obj, DelayedMessage delayedMessage, boolean z10) {
            DelayedMessageSendAfterRequest delayedMessageSendAfterRequest = new DelayedMessageSendAfterRequest();
            delayedMessageSendAfterRequest.request = tLObject;
            delayedMessageSendAfterRequest.msgObj = messageObject;
            delayedMessageSendAfterRequest.originalPath = str;
            delayedMessageSendAfterRequest.delayedMessage = delayedMessage;
            delayedMessageSendAfterRequest.parentObject = obj;
            delayedMessageSendAfterRequest.scheduled = z10;
            if (this.requests == null) {
                this.requests = new ArrayList<>();
            }
            this.requests.add(delayedMessageSendAfterRequest);
        }

        public boolean getRetriedToSend(int i10) {
            boolean[] zArr;
            if (i10 >= 0 && (zArr = this.retriedToSendArray) != null && i10 < zArr.length) {
                return zArr[i10];
            }
            return this.retriedToSend;
        }

        public void initForGroup(long j3) {
            this.type = 4;
            this.groupId = j3;
            this.messageObjects = new ArrayList<>();
            this.messages = new ArrayList<>();
            this.inputMedias = new ArrayList<>();
            this.originalPaths = new ArrayList<>();
            this.parentObjects = new ArrayList<>();
            this.extraHashMap = new HashMap<>();
            this.locations = new ArrayList<>();
            this.httpLocations = new ArrayList<>();
            this.videoEditedInfos = new ArrayList<>();
            this.pollIndexes = new ArrayList<>();
            this.livePhotoIndexes = new ArrayList<>();
        }

        public void markAsError() {
            if (this.type == 4) {
                for (int i10 = 0; i10 < this.messageObjects.size(); i10++) {
                    MessageObject messageObject = this.messageObjects.get(i10);
                    SendMessagesHelper.this.getMessagesStorage().markMessageAsSendError(messageObject.messageOwner, messageObject.scheduled ? 1 : 0);
                    TLRPC.Message message = messageObject.messageOwner;
                    message.send_state = 2;
                    message.errorAllowedPriceStars = 0L;
                    message.errorNewPriceStars = 0L;
                    SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageSendError, Integer.valueOf(messageObject.getId()));
                    SendMessagesHelper.this.processSentMessage(messageObject.getId());
                    SendMessagesHelper.this.removeFromUploadingMessages(messageObject.getId(), this.scheduled);
                }
                HashMap hashMap = SendMessagesHelper.this.delayedMessages;
                hashMap.remove("group_" + this.groupId);
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

        public void sendDelayedRequests() {
            ArrayList<DelayedMessageSendAfterRequest> arrayList = this.requests;
            if (arrayList != null) {
                int i10 = this.type;
                if (i10 == 4 || i10 == 0) {
                    int size = arrayList.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        DelayedMessageSendAfterRequest delayedMessageSendAfterRequest = this.requests.get(i11);
                        TLObject tLObject = delayedMessageSendAfterRequest.request;
                        if (tLObject instanceof TLRPC.TL_messages_sendEncryptedMultiMedia) {
                            SendMessagesHelper.this.getSecretChatHelper().performSendEncryptedRequest((TLRPC.TL_messages_sendEncryptedMultiMedia) delayedMessageSendAfterRequest.request, this);
                        } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                            SendMessagesHelper.this.lambda$performSendMessageRequestMulti$64((TLRPC.TL_messages_sendMultiMedia) tLObject, delayedMessageSendAfterRequest.msgObjs, delayedMessageSendAfterRequest.originalPaths, delayedMessageSendAfterRequest.parentObjects, delayedMessageSendAfterRequest.delayedMessage, delayedMessageSendAfterRequest.scheduled);
                        } else if ((tLObject instanceof TLRPC.TL_messages_sendMedia) && (((TLRPC.TL_messages_sendMedia) tLObject).media instanceof TLRPC.TL_inputMediaPaidMedia)) {
                            SendMessagesHelper.this.lambda$performSendMessageRequestMulti$64((TLRPC.TL_messages_sendMedia) tLObject, delayedMessageSendAfterRequest.msgObjs, delayedMessageSendAfterRequest.originalPaths, delayedMessageSendAfterRequest.parentObjects, delayedMessageSendAfterRequest.delayedMessage, delayedMessageSendAfterRequest.scheduled);
                        } else if (!(tLObject instanceof TLRPC.TL_messages_sendMedia) || !(((TLRPC.TL_messages_sendMedia) tLObject).media instanceof TLRPC.TL_inputMediaPoll)) {
                            SendMessagesHelper.this.performSendMessageRequest(tLObject, delayedMessageSendAfterRequest.msgObj, delayedMessageSendAfterRequest.originalPath, delayedMessageSendAfterRequest.delayedMessage, delayedMessageSendAfterRequest.parentObject, null, delayedMessageSendAfterRequest.scheduled);
                        } else {
                            SendMessagesHelper.this.lambda$performSendMessageRequestMulti$64((TLRPC.TL_messages_sendMedia) tLObject, delayedMessageSendAfterRequest.msgObjs, delayedMessageSendAfterRequest.originalPaths, delayedMessageSendAfterRequest.parentObjects, delayedMessageSendAfterRequest.delayedMessage, delayedMessageSendAfterRequest.scheduled);
                        }
                    }
                    this.requests = null;
                }
            }
        }

        public void setRetriedToSend(int i10, boolean z10) {
            if (i10 < 0) {
                this.retriedToSend = z10;
                return;
            }
            if (this.retriedToSendArray == null) {
                this.retriedToSendArray = new boolean[this.messageObjects.size()];
            }
            this.retriedToSendArray[i10] = z10;
        }

        public void addDelayedRequest(TLObject tLObject, ArrayList<MessageObject> arrayList, ArrayList<String> arrayList2, ArrayList<Object> arrayList3, DelayedMessage delayedMessage, boolean z10) {
            DelayedMessageSendAfterRequest delayedMessageSendAfterRequest = new DelayedMessageSendAfterRequest();
            delayedMessageSendAfterRequest.request = tLObject;
            delayedMessageSendAfterRequest.msgObjs = arrayList;
            delayedMessageSendAfterRequest.originalPaths = arrayList2;
            delayedMessageSendAfterRequest.delayedMessage = delayedMessage;
            delayedMessageSendAfterRequest.parentObjects = arrayList3;
            delayedMessageSendAfterRequest.scheduled = z10;
            if (this.requests == null) {
                this.requests = new ArrayList<>();
            }
            this.requests.add(delayedMessageSendAfterRequest);
        }
    }

    private void applyMonoForumPeerId(TLRPC.TL_messages_sendMedia tL_messages_sendMedia, long j3) {
        if (j3 != 0) {
            TLRPC.InputPeer inputPeer = getMessagesController().getInputPeer(j3);
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

    public void cancelSendingMessage(java.util.ArrayList<org.telegram.messenger.MessageObject> r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.cancelSendingMessage(java.util.ArrayList):void");
    }

    private void applyMonoForumPeerId(TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, long j3) {
        if (j3 != 0) {
            TLRPC.InputPeer inputPeer = getMessagesController().getInputPeer(j3);
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

    public static void lambda$sendCallback$39(String str) {
    }

    public TLRPC.InputReplyTo createReplyInput(TLRPC.TL_messageReplyHeader tL_messageReplyHeader) {
        TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
        tL_inputReplyToMessage.reply_to_msg_id = tL_messageReplyHeader.reply_to_msg_id;
        int i10 = tL_messageReplyHeader.flags;
        if ((i10 & 2) != 0) {
            tL_inputReplyToMessage.flags |= 1;
            tL_inputReplyToMessage.top_msg_id = tL_messageReplyHeader.reply_to_top_id;
        }
        if ((i10 & 1) != 0) {
            tL_inputReplyToMessage.flags |= 2;
            tL_inputReplyToMessage.reply_to_peer_id = MessagesController.getInstance(this.currentAccount).getInputPeer(tL_messageReplyHeader.reply_to_peer_id);
        }
        if (tL_messageReplyHeader.quote) {
            int i11 = tL_messageReplyHeader.flags;
            if ((i11 & 64) != 0) {
                tL_inputReplyToMessage.flags |= 4;
                tL_inputReplyToMessage.quote_text = tL_messageReplyHeader.quote_text;
            }
            if ((i11 & 128) != 0) {
                tL_inputReplyToMessage.flags |= 8;
                tL_inputReplyToMessage.quote_entities = tL_messageReplyHeader.quote_entities;
            }
            if ((i11 & 1024) != 0) {
                tL_inputReplyToMessage.flags |= 16;
                tL_inputReplyToMessage.quote_offset = tL_messageReplyHeader.quote_offset;
            }
        }
        if ((tL_messageReplyHeader.flags & 2048) != 0) {
            tL_inputReplyToMessage.flags |= 64;
            tL_inputReplyToMessage.todo_item_id = tL_messageReplyHeader.todo_item_id;
        }
        byte[] bArr = tL_messageReplyHeader.poll_option;
        if (bArr != null) {
            tL_inputReplyToMessage.poll_option = bArr;
        }
        return tL_inputReplyToMessage;
    }

    private void applyMonoForumPeerId(TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages, long j3) {
        if (j3 != 0) {
            TLRPC.InputPeer inputPeer = getMessagesController().getInputPeer(j3);
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

    public int editMessage(MessageObject messageObject, String str, boolean z10, org.telegram.ui.ActionBar.p2 p2Var, ArrayList<TLRPC.MessageEntity> arrayList, int i10, int i11) {
        TL_ephemeral.TL_editMessage tL_editMessage;
        if (p2Var == null || p2Var.getParentActivity() == null) {
            return 0;
        }
        if (messageObject.isEphemeral()) {
            TL_ephemeral.TL_editMessage tL_editMessage2 = new TL_ephemeral.TL_editMessage();
            tL_editMessage2.f17278id = MessageObject.ephemeralMessageIdUnpack(messageObject.getId());
            tL_editMessage2.receiver_id = new TLRPC.TL_inputUserEmpty();
            tL_editMessage2.welcome = true;
            tL_editMessage = tL_editMessage2;
        } else {
            TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
            tL_messages_editMessage.f17278id = messageObject.getId();
            tL_editMessage = tL_messages_editMessage;
        }
        tL_editMessage.peer = getMessagesController().getInputPeer(messageObject.getDialogId());
        if (str != null) {
            tL_editMessage.message = str;
            tL_editMessage.flags |= 2048;
            tL_editMessage.no_webpage = !z10;
        }
        TLRPC.Message message = messageObject.messageOwner;
        if (message != null && (message.flags & 1073741824) != 0) {
            tL_editMessage.quick_reply_shortcut_id = message.quick_reply_shortcut_id;
            tL_editMessage.flags |= 131072;
        }
        if (arrayList != null) {
            tL_editMessage.entities = arrayList;
            tL_editMessage.flags |= 8;
        }
        if (i10 != 0) {
            tL_editMessage.schedule_date = i10;
            int i12 = tL_editMessage.flags;
            tL_editMessage.flags = 32768 | i12;
            if (i11 != 0) {
                tL_editMessage.schedule_repeat_period = i11;
                tL_editMessage.flags = i12 | 294912;
            }
        }
        return getConnectionsManager().sendRequest(tL_editMessage, new b8(this, p2Var, tL_editMessage, 12));
    }

    public void sendMessage(org.telegram.messenger.SendMessagesHelper.SendMessageParams r109) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.sendMessage(org.telegram.messenger.SendMessagesHelper$SendMessageParams):void");
    }
}
