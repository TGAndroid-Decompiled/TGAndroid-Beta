package org.telegram.messenger;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.media.MediaCodecInfo;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Spannable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.collection.LongSparseArray;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
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
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.QuickAckDelegate;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$BotInlineMessage;
import org.telegram.tgnet.TLRPC$BotInlineResult;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$DecryptedMessage;
import org.telegram.tgnet.TLRPC$DecryptedMessageAction;
import org.telegram.tgnet.TLRPC$DecryptedMessageMedia;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$DocumentAttribute;
import org.telegram.tgnet.TLRPC$EncryptedChat;
import org.telegram.tgnet.TLRPC$FileLocation;
import org.telegram.tgnet.TLRPC$InputCheckPasswordSRP;
import org.telegram.tgnet.TLRPC$InputDocument;
import org.telegram.tgnet.TLRPC$InputEncryptedFile;
import org.telegram.tgnet.TLRPC$InputFile;
import org.telegram.tgnet.TLRPC$InputMedia;
import org.telegram.tgnet.TLRPC$InputPeer;
import org.telegram.tgnet.TLRPC$InputQuickReplyShortcut;
import org.telegram.tgnet.TLRPC$InputReplyTo;
import org.telegram.tgnet.TLRPC$InputStickerSet;
import org.telegram.tgnet.TLRPC$KeyboardButton;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$MessageAction;
import org.telegram.tgnet.TLRPC$MessageEntity;
import org.telegram.tgnet.TLRPC$MessageExtendedMedia;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$MessageReplies;
import org.telegram.tgnet.TLRPC$MessageReplyHeader;
import org.telegram.tgnet.TLRPC$PaymentForm;
import org.telegram.tgnet.TLRPC$PaymentReceipt;
import org.telegram.tgnet.TLRPC$Peer;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$PollAnswer;
import org.telegram.tgnet.TLRPC$ReplyMarkup;
import org.telegram.tgnet.TLRPC$TL_account_getPassword;
import org.telegram.tgnet.TLRPC$TL_botInlineMessageMediaAuto;
import org.telegram.tgnet.TLRPC$TL_botInlineMessageMediaContact;
import org.telegram.tgnet.TLRPC$TL_botInlineMessageMediaGeo;
import org.telegram.tgnet.TLRPC$TL_botInlineMessageMediaInvoice;
import org.telegram.tgnet.TLRPC$TL_botInlineMessageMediaVenue;
import org.telegram.tgnet.TLRPC$TL_botInlineMessageMediaWebPage;
import org.telegram.tgnet.TLRPC$TL_botInlineMessageText;
import org.telegram.tgnet.TLRPC$TL_decryptedMessage;
import org.telegram.tgnet.TLRPC$TL_decryptedMessageActionAbortKey;
import org.telegram.tgnet.TLRPC$TL_decryptedMessageActionAcceptKey;
import org.telegram.tgnet.TLRPC$TL_decryptedMessageActionCommitKey;
import org.telegram.tgnet.TLRPC$TL_decryptedMessageActionDeleteMessages;
import org.telegram.tgnet.TLRPC$TL_decryptedMessageActionFlushHistory;
import org.telegram.tgnet.TLRPC$TL_decryptedMessageActionNoop;
import org.telegram.tgnet.TLRPC$TL_decryptedMessageActionNotifyLayer;
import org.telegram.tgnet.TLRPC$TL_decryptedMessageActionReadMessages;
import org.telegram.tgnet.TLRPC$TL_decryptedMessageActionRequestKey;
import org.telegram.tgnet.TLRPC$TL_decryptedMessageActionResend;
import org.telegram.tgnet.TLRPC$TL_decryptedMessageActionScreenshotMessages;
import org.telegram.tgnet.TLRPC$TL_decryptedMessageActionSetMessageTTL;
import org.telegram.tgnet.TLRPC$TL_decryptedMessageActionTyping;
import org.telegram.tgnet.TLRPC$TL_decryptedMessageMediaDocument;
import org.telegram.tgnet.TLRPC$TL_decryptedMessageMediaPhoto;
import org.telegram.tgnet.TLRPC$TL_decryptedMessageMediaVideo;
import org.telegram.tgnet.TLRPC$TL_document;
import org.telegram.tgnet.TLRPC$TL_documentAttributeSticker_layer55;
import org.telegram.tgnet.TLRPC$TL_documentAttributeVideo;
import org.telegram.tgnet.TLRPC$TL_documentAttributeVideo_layer159;
import org.telegram.tgnet.TLRPC$TL_document_layer82;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_fileLocationUnavailable;
import org.telegram.tgnet.TLRPC$TL_fileLocation_layer82;
import org.telegram.tgnet.TLRPC$TL_forumTopic;
import org.telegram.tgnet.TLRPC$TL_game;
import org.telegram.tgnet.TLRPC$TL_geoPoint;
import org.telegram.tgnet.TLRPC$TL_inputDocument;
import org.telegram.tgnet.TLRPC$TL_inputEncryptedFile;
import org.telegram.tgnet.TLRPC$TL_inputMediaDocument;
import org.telegram.tgnet.TLRPC$TL_inputMediaGame;
import org.telegram.tgnet.TLRPC$TL_inputMediaPaidMedia;
import org.telegram.tgnet.TLRPC$TL_inputMediaPhoto;
import org.telegram.tgnet.TLRPC$TL_inputMediaUploadedDocument;
import org.telegram.tgnet.TLRPC$TL_inputMediaUploadedPhoto;
import org.telegram.tgnet.TLRPC$TL_inputPeerChannel;
import org.telegram.tgnet.TLRPC$TL_inputPeerChat;
import org.telegram.tgnet.TLRPC$TL_inputPeerSelf;
import org.telegram.tgnet.TLRPC$TL_inputPeerUser;
import org.telegram.tgnet.TLRPC$TL_inputQuickReplyShortcut;
import org.telegram.tgnet.TLRPC$TL_inputReplyToMessage;
import org.telegram.tgnet.TLRPC$TL_inputReplyToStory;
import org.telegram.tgnet.TLRPC$TL_inputStickerSetItem;
import org.telegram.tgnet.TLRPC$TL_inputStickerSetShortName;
import org.telegram.tgnet.TLRPC$TL_inputUserSelf;
import org.telegram.tgnet.TLRPC$TL_keyboardButtonBuy;
import org.telegram.tgnet.TLRPC$TL_keyboardButtonGame;
import org.telegram.tgnet.TLRPC$TL_keyboardButtonUrlAuth;
import org.telegram.tgnet.TLRPC$TL_messageActionScreenshotTaken;
import org.telegram.tgnet.TLRPC$TL_messageEncryptedAction;
import org.telegram.tgnet.TLRPC$TL_messageEntityUrl;
import org.telegram.tgnet.TLRPC$TL_messageExtendedMedia;
import org.telegram.tgnet.TLRPC$TL_messageMediaDocument;
import org.telegram.tgnet.TLRPC$TL_messageMediaEmpty;
import org.telegram.tgnet.TLRPC$TL_messageMediaGame;
import org.telegram.tgnet.TLRPC$TL_messageMediaGeo;
import org.telegram.tgnet.TLRPC$TL_messageMediaGeoLive;
import org.telegram.tgnet.TLRPC$TL_messageMediaInvoice;
import org.telegram.tgnet.TLRPC$TL_messageMediaPaidMedia;
import org.telegram.tgnet.TLRPC$TL_messageMediaPhoto;
import org.telegram.tgnet.TLRPC$TL_messageMediaPoll;
import org.telegram.tgnet.TLRPC$TL_messageMediaVenue;
import org.telegram.tgnet.TLRPC$TL_messageMediaWebPage;
import org.telegram.tgnet.TLRPC$TL_messageReplies;
import org.telegram.tgnet.TLRPC$TL_messageReplyHeader;
import org.telegram.tgnet.TLRPC$TL_messageService;
import org.telegram.tgnet.TLRPC$TL_messages_botCallbackAnswer;
import org.telegram.tgnet.TLRPC$TL_messages_editMessage;
import org.telegram.tgnet.TLRPC$TL_messages_forwardMessages;
import org.telegram.tgnet.TLRPC$TL_messages_getBotCallbackAnswer;
import org.telegram.tgnet.TLRPC$TL_messages_getStickerSet;
import org.telegram.tgnet.TLRPC$TL_messages_historyImport;
import org.telegram.tgnet.TLRPC$TL_messages_initHistoryImport;
import org.telegram.tgnet.TLRPC$TL_messages_messages;
import org.telegram.tgnet.TLRPC$TL_messages_requestUrlAuth;
import org.telegram.tgnet.TLRPC$TL_messages_sendEncryptedMultiMedia;
import org.telegram.tgnet.TLRPC$TL_messages_sendMedia;
import org.telegram.tgnet.TLRPC$TL_messages_sendMessage;
import org.telegram.tgnet.TLRPC$TL_messages_sendMultiMedia;
import org.telegram.tgnet.TLRPC$TL_messages_sendReaction;
import org.telegram.tgnet.TLRPC$TL_messages_sendScreenshotNotification;
import org.telegram.tgnet.TLRPC$TL_messages_sendVote;
import org.telegram.tgnet.TLRPC$TL_messages_startHistoryImport;
import org.telegram.tgnet.TLRPC$TL_messages_stickerSet;
import org.telegram.tgnet.TLRPC$TL_messages_uploadImportedMedia;
import org.telegram.tgnet.TLRPC$TL_messages_uploadMedia;
import org.telegram.tgnet.TLRPC$TL_payments_getPaymentForm;
import org.telegram.tgnet.TLRPC$TL_payments_paymentFormStars;
import org.telegram.tgnet.TLRPC$TL_payments_paymentReceiptStars;
import org.telegram.tgnet.TLRPC$TL_peerUser;
import org.telegram.tgnet.TLRPC$TL_photo;
import org.telegram.tgnet.TLRPC$TL_photoCachedSize;
import org.telegram.tgnet.TLRPC$TL_photoPathSize;
import org.telegram.tgnet.TLRPC$TL_photoSize;
import org.telegram.tgnet.TLRPC$TL_photoSizeEmpty;
import org.telegram.tgnet.TLRPC$TL_photoSizeProgressive;
import org.telegram.tgnet.TLRPC$TL_photoSize_layer127;
import org.telegram.tgnet.TLRPC$TL_photoStrippedSize;
import org.telegram.tgnet.TLRPC$TL_reactionCustomEmoji;
import org.telegram.tgnet.TLRPC$TL_reactionEmoji;
import org.telegram.tgnet.TLRPC$TL_restrictionReason;
import org.telegram.tgnet.TLRPC$TL_stickers_createStickerSet;
import org.telegram.tgnet.TLRPC$TL_updateEditChannelMessage;
import org.telegram.tgnet.TLRPC$TL_updateEditMessage;
import org.telegram.tgnet.TLRPC$TL_updateMessageID;
import org.telegram.tgnet.TLRPC$TL_updateNewChannelMessage;
import org.telegram.tgnet.TLRPC$TL_updateNewMessage;
import org.telegram.tgnet.TLRPC$TL_updateNewScheduledMessage;
import org.telegram.tgnet.TLRPC$TL_updateQuickReplyMessage;
import org.telegram.tgnet.TLRPC$TL_updateShortSentMessage;
import org.telegram.tgnet.TLRPC$TL_urlAuthResultAccepted;
import org.telegram.tgnet.TLRPC$TL_urlAuthResultDefault;
import org.telegram.tgnet.TLRPC$TL_urlAuthResultRequest;
import org.telegram.tgnet.TLRPC$TL_user;
import org.telegram.tgnet.TLRPC$TL_webPagePending;
import org.telegram.tgnet.TLRPC$Update;
import org.telegram.tgnet.TLRPC$Updates;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$VideoSize;
import org.telegram.tgnet.TLRPC$WebDocument;
import org.telegram.tgnet.TLRPC$WebPage;
import org.telegram.tgnet.TLRPC$account_Password;
import org.telegram.tgnet.TLRPC$messages_Messages;
import org.telegram.tgnet.tl.TL_stories$StoryItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFileDrawable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Point;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.Reactions.ReactionsUtils;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PaymentFormActivity;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
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
    private HashMap<String, ArrayList<DelayedMessage>> delayedMessages;
    private SparseArray<TLRPC$Message> editingMessages;
    private HashMap<String, ImportingHistory> importingHistoryFiles;
    private LongSparseArray<ImportingHistory> importingHistoryMap;
    private HashMap<String, ImportingStickers> importingStickersFiles;
    private HashMap<String, ImportingStickers> importingStickersMap;
    private LocationProvider locationProvider;
    private SparseArray<TLRPC$Message> sendingMessages;
    private LongSparseArray<Integer> sendingMessagesIdDialogs;
    private SparseArray<MessageObject> unsentMessages;
    private SparseArray<TLRPC$Message> uploadMessages;
    private LongSparseArray<Integer> uploadingMessagesIdDialogs;
    private LongSparseArray<Long> voteSendTime;
    private HashMap<String, Boolean> waitingForCallback;
    private HashMap<String, List<String>> waitingForCallbackMap;
    private HashMap<String, MessageObject> waitingForLocation;
    private HashMap<String, byte[]> waitingForVote;

    public static class SendingMediaInfo {
        public boolean canDeleteAfter;
        public String caption;
        public TLRPC$VideoSize emojiMarkup;
        public ArrayList<TLRPC$MessageEntity> entities;
        public boolean forceImage;
        public boolean hasMediaSpoilers;
        public TLRPC$BotInlineResult inlineResult;
        public boolean isVideo;
        public ArrayList<TLRPC$InputDocument> masks;
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

    public static void lambda$sendCallback$26(String str) {
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

    public TLRPC$InputReplyTo createReplyInput(TL_stories$StoryItem tL_stories$StoryItem) {
        TLRPC$TL_inputReplyToStory tLRPC$TL_inputReplyToStory = new TLRPC$TL_inputReplyToStory();
        tLRPC$TL_inputReplyToStory.story_id = tL_stories$StoryItem.id;
        tLRPC$TL_inputReplyToStory.peer = getMessagesController().getInputPeer(tL_stories$StoryItem.dialogId);
        return tLRPC$TL_inputReplyToStory;
    }

    public TLRPC$InputReplyTo createReplyInput(int i) {
        return createReplyInput(null, i, 0, null);
    }

    public TLRPC$InputReplyTo createReplyInput(TLRPC$InputPeer tLRPC$InputPeer, int i, int i2, ChatActivity.ReplyQuote replyQuote) {
        MessageObject messageObject;
        TLRPC$TL_inputReplyToMessage tLRPC$TL_inputReplyToMessage = new TLRPC$TL_inputReplyToMessage();
        tLRPC$TL_inputReplyToMessage.reply_to_msg_id = i;
        if (i2 != 0) {
            tLRPC$TL_inputReplyToMessage.flags |= 1;
            tLRPC$TL_inputReplyToMessage.top_msg_id = i2;
        }
        if (replyQuote != null) {
            String text = replyQuote.getText();
            tLRPC$TL_inputReplyToMessage.quote_text = text;
            if (!TextUtils.isEmpty(text)) {
                tLRPC$TL_inputReplyToMessage.flags |= 4;
                ArrayList<TLRPC$MessageEntity> entities = replyQuote.getEntities();
                tLRPC$TL_inputReplyToMessage.quote_entities = entities;
                if (entities != null && !entities.isEmpty()) {
                    tLRPC$TL_inputReplyToMessage.quote_entities = new ArrayList<>(tLRPC$TL_inputReplyToMessage.quote_entities);
                    tLRPC$TL_inputReplyToMessage.flags |= 8;
                }
                tLRPC$TL_inputReplyToMessage.flags |= 16;
                tLRPC$TL_inputReplyToMessage.quote_offset = replyQuote.start;
            }
        }
        if (replyQuote != null && (messageObject = replyQuote.message) != null) {
            TLRPC$InputPeer inputPeer = getMessagesController().getInputPeer(messageObject.getDialogId());
            if (inputPeer != null && !MessageObject.peersEqual(inputPeer, tLRPC$InputPeer)) {
                tLRPC$TL_inputReplyToMessage.flags |= 2;
                tLRPC$TL_inputReplyToMessage.reply_to_peer_id = inputPeer;
            }
        }
        return tLRPC$TL_inputReplyToMessage;
    }

    public TLRPC$InputReplyTo createReplyInput(TLRPC$TL_messageReplyHeader tLRPC$TL_messageReplyHeader) {
        TLRPC$TL_inputReplyToMessage tLRPC$TL_inputReplyToMessage = new TLRPC$TL_inputReplyToMessage();
        tLRPC$TL_inputReplyToMessage.reply_to_msg_id = tLRPC$TL_messageReplyHeader.reply_to_msg_id;
        int i = tLRPC$TL_messageReplyHeader.flags;
        if ((i & 2) != 0) {
            tLRPC$TL_inputReplyToMessage.flags |= 1;
            tLRPC$TL_inputReplyToMessage.top_msg_id = tLRPC$TL_messageReplyHeader.reply_to_top_id;
        }
        if ((i & 1) != 0) {
            tLRPC$TL_inputReplyToMessage.flags |= 2;
            tLRPC$TL_inputReplyToMessage.reply_to_peer_id = MessagesController.getInstance(this.currentAccount).getInputPeer(tLRPC$TL_messageReplyHeader.reply_to_peer_id);
        }
        if (tLRPC$TL_messageReplyHeader.quote) {
            int i2 = tLRPC$TL_messageReplyHeader.flags;
            if ((i2 & 64) != 0) {
                tLRPC$TL_inputReplyToMessage.flags |= 4;
                tLRPC$TL_inputReplyToMessage.quote_text = tLRPC$TL_messageReplyHeader.quote_text;
            }
            if ((i2 & 128) != 0) {
                tLRPC$TL_inputReplyToMessage.flags |= 8;
                tLRPC$TL_inputReplyToMessage.quote_entities = tLRPC$TL_messageReplyHeader.quote_entities;
            }
            if ((i2 & 1024) != 0) {
                tLRPC$TL_inputReplyToMessage.flags |= 16;
                tLRPC$TL_inputReplyToMessage.quote_offset = tLRPC$TL_messageReplyHeader.quote_offset;
            }
        }
        return tLRPC$TL_inputReplyToMessage;
    }

    public class ImportingHistory {
        public long dialogId;
        public double estimatedUploadSpeed;
        public String historyPath;
        public long importId;
        private long lastUploadSize;
        private long lastUploadTime;
        public TLRPC$InputPeer peer;
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

        public void initImport(TLRPC$InputFile tLRPC$InputFile) {
            TLRPC$TL_messages_initHistoryImport tLRPC$TL_messages_initHistoryImport = new TLRPC$TL_messages_initHistoryImport();
            tLRPC$TL_messages_initHistoryImport.file = tLRPC$InputFile;
            tLRPC$TL_messages_initHistoryImport.media_count = this.mediaPaths.size();
            tLRPC$TL_messages_initHistoryImport.peer = this.peer;
            SendMessagesHelper.this.getConnectionsManager().sendRequest(tLRPC$TL_messages_initHistoryImport, new AnonymousClass1(tLRPC$TL_messages_initHistoryImport), 2);
        }

        public class AnonymousClass1 implements RequestDelegate {
            final TLRPC$TL_messages_initHistoryImport val$req;

            AnonymousClass1(TLRPC$TL_messages_initHistoryImport tLRPC$TL_messages_initHistoryImport) {
                this.val$req = tLRPC$TL_messages_initHistoryImport;
            }

            @Override
            public void run(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
                final TLRPC$TL_messages_initHistoryImport tLRPC$TL_messages_initHistoryImport = this.val$req;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        SendMessagesHelper.ImportingHistory.AnonymousClass1.this.lambda$run$0(tLObject, tLRPC$TL_messages_initHistoryImport, tLRPC$TL_error);
                    }
                });
            }

            public void lambda$run$0(TLObject tLObject, TLRPC$TL_messages_initHistoryImport tLRPC$TL_messages_initHistoryImport, TLRPC$TL_error tLRPC$TL_error) {
                if (!(tLObject instanceof TLRPC$TL_messages_historyImport)) {
                    SendMessagesHelper.this.importingHistoryMap.remove(ImportingHistory.this.dialogId);
                    SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(ImportingHistory.this.dialogId), tLRPC$TL_messages_initHistoryImport, tLRPC$TL_error);
                    return;
                }
                ImportingHistory importingHistory = ImportingHistory.this;
                importingHistory.importId = ((TLRPC$TL_messages_historyImport) tLObject).id;
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
                TLRPC$TL_error tLRPC$TL_error = new TLRPC$TL_error();
                tLRPC$TL_error.code = 400;
                tLRPC$TL_error.text = "IMPORT_UPLOAD_FAILED";
                SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(this.dialogId), new TLRPC$TL_messages_initHistoryImport(), tLRPC$TL_error);
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
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (!str.equals(this.historyPath)) {
                long j2 = this.uploadedSize;
                long j3 = this.lastUploadSize;
                if (j2 != j3) {
                    long j4 = this.lastUploadTime;
                    if (elapsedRealtime != j4) {
                        double d = elapsedRealtime - j4;
                        Double.isNaN(d);
                        double d2 = j2 - j3;
                        Double.isNaN(d2);
                        double d3 = d2 / (d / 1000.0d);
                        double d4 = this.estimatedUploadSpeed;
                        if (d4 == 0.0d) {
                            this.estimatedUploadSpeed = d3;
                        } else {
                            this.estimatedUploadSpeed = (d3 * 0.01d) + (0.99d * d4);
                        }
                        double d5 = (this.totalSize - j2) * 1000;
                        double d6 = this.estimatedUploadSpeed;
                        Double.isNaN(d5);
                        this.timeUntilFinish = (int) (d5 / d6);
                        this.lastUploadSize = j2;
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

        public void onMediaImport(String str, long j, TLRPC$InputFile tLRPC$InputFile) {
            addUploadProgress(str, j, 1.0f);
            TLRPC$TL_messages_uploadImportedMedia tLRPC$TL_messages_uploadImportedMedia = new TLRPC$TL_messages_uploadImportedMedia();
            tLRPC$TL_messages_uploadImportedMedia.peer = this.peer;
            tLRPC$TL_messages_uploadImportedMedia.import_id = this.importId;
            tLRPC$TL_messages_uploadImportedMedia.file_name = new File(str).getName();
            MimeTypeMap singleton = MimeTypeMap.getSingleton();
            int lastIndexOf = tLRPC$TL_messages_uploadImportedMedia.file_name.lastIndexOf(46);
            String lowerCase = lastIndexOf != -1 ? tLRPC$TL_messages_uploadImportedMedia.file_name.substring(lastIndexOf + 1).toLowerCase() : "txt";
            String mimeTypeFromExtension = singleton.getMimeTypeFromExtension(lowerCase);
            if (mimeTypeFromExtension == null) {
                if ("opus".equals(lowerCase)) {
                    mimeTypeFromExtension = "audio/opus";
                } else {
                    mimeTypeFromExtension = "webp".equals(lowerCase) ? "image/webp" : "text/plain";
                }
            }
            if (mimeTypeFromExtension.equals("image/jpg") || mimeTypeFromExtension.equals("image/jpeg")) {
                TLRPC$TL_inputMediaUploadedPhoto tLRPC$TL_inputMediaUploadedPhoto = new TLRPC$TL_inputMediaUploadedPhoto();
                tLRPC$TL_inputMediaUploadedPhoto.file = tLRPC$InputFile;
                tLRPC$TL_messages_uploadImportedMedia.media = tLRPC$TL_inputMediaUploadedPhoto;
            } else {
                TLRPC$TL_inputMediaUploadedDocument tLRPC$TL_inputMediaUploadedDocument = new TLRPC$TL_inputMediaUploadedDocument();
                tLRPC$TL_inputMediaUploadedDocument.file = tLRPC$InputFile;
                tLRPC$TL_inputMediaUploadedDocument.mime_type = mimeTypeFromExtension;
                tLRPC$TL_messages_uploadImportedMedia.media = tLRPC$TL_inputMediaUploadedDocument;
            }
            SendMessagesHelper.this.getConnectionsManager().sendRequest(tLRPC$TL_messages_uploadImportedMedia, new AnonymousClass2(str), 2);
        }

        public class AnonymousClass2 implements RequestDelegate {
            final String val$path;

            AnonymousClass2(String str) {
                this.val$path = str;
            }

            @Override
            public void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                final String str = this.val$path;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        SendMessagesHelper.ImportingHistory.AnonymousClass2.this.lambda$run$0(str);
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
            TLRPC$TL_messages_startHistoryImport tLRPC$TL_messages_startHistoryImport = new TLRPC$TL_messages_startHistoryImport();
            tLRPC$TL_messages_startHistoryImport.peer = this.peer;
            tLRPC$TL_messages_startHistoryImport.import_id = this.importId;
            SendMessagesHelper.this.getConnectionsManager().sendRequest(tLRPC$TL_messages_startHistoryImport, new AnonymousClass3(tLRPC$TL_messages_startHistoryImport));
        }

        public class AnonymousClass3 implements RequestDelegate {
            final TLRPC$TL_messages_startHistoryImport val$req;

            AnonymousClass3(TLRPC$TL_messages_startHistoryImport tLRPC$TL_messages_startHistoryImport) {
                this.val$req = tLRPC$TL_messages_startHistoryImport;
            }

            @Override
            public void run(TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
                final TLRPC$TL_messages_startHistoryImport tLRPC$TL_messages_startHistoryImport = this.val$req;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        SendMessagesHelper.ImportingHistory.AnonymousClass3.this.lambda$run$0(tLRPC$TL_error, tLRPC$TL_messages_startHistoryImport);
                    }
                });
            }

            public void lambda$run$0(TLRPC$TL_error tLRPC$TL_error, TLRPC$TL_messages_startHistoryImport tLRPC$TL_messages_startHistoryImport) {
                SendMessagesHelper.this.importingHistoryMap.remove(ImportingHistory.this.dialogId);
                if (tLRPC$TL_error == null) {
                    SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(ImportingHistory.this.dialogId));
                } else {
                    SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(ImportingHistory.this.dialogId), tLRPC$TL_messages_startHistoryImport, tLRPC$TL_error);
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
        public TLRPC$TL_inputStickerSetItem item;
        public String mimeType;
        public String path;
        public boolean validated;
        public VideoEditedInfo videoEditedInfo;

        public void uploadMedia(int i, TLRPC$InputFile tLRPC$InputFile, Runnable runnable) {
            TLRPC$TL_messages_uploadMedia tLRPC$TL_messages_uploadMedia = new TLRPC$TL_messages_uploadMedia();
            tLRPC$TL_messages_uploadMedia.peer = new TLRPC$TL_inputPeerSelf();
            TLRPC$TL_inputMediaUploadedDocument tLRPC$TL_inputMediaUploadedDocument = new TLRPC$TL_inputMediaUploadedDocument();
            tLRPC$TL_messages_uploadMedia.media = tLRPC$TL_inputMediaUploadedDocument;
            tLRPC$TL_inputMediaUploadedDocument.file = tLRPC$InputFile;
            tLRPC$TL_inputMediaUploadedDocument.mime_type = this.mimeType;
            ConnectionsManager.getInstance(i).sendRequest(tLRPC$TL_messages_uploadMedia, new AnonymousClass1(runnable), 2);
        }

        public class AnonymousClass1 implements RequestDelegate {
            final Runnable val$onFinish;

            AnonymousClass1(Runnable runnable) {
                this.val$onFinish = runnable;
            }

            @Override
            public void run(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                final Runnable runnable = this.val$onFinish;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        SendMessagesHelper.ImportingSticker.AnonymousClass1.this.lambda$run$0(tLObject, runnable);
                    }
                });
            }

            public void lambda$run$0(TLObject tLObject, Runnable runnable) {
                if (tLObject instanceof TLRPC$TL_messageMediaDocument) {
                    ImportingSticker.this.item = new TLRPC$TL_inputStickerSetItem();
                    ImportingSticker.this.item.document = new TLRPC$TL_inputDocument();
                    ImportingSticker importingSticker = ImportingSticker.this;
                    TLRPC$TL_inputStickerSetItem tLRPC$TL_inputStickerSetItem = importingSticker.item;
                    TLRPC$InputDocument tLRPC$InputDocument = tLRPC$TL_inputStickerSetItem.document;
                    TLRPC$Document tLRPC$Document = ((TLRPC$TL_messageMediaDocument) tLObject).document;
                    tLRPC$InputDocument.id = tLRPC$Document.id;
                    tLRPC$InputDocument.access_hash = tLRPC$Document.access_hash;
                    tLRPC$InputDocument.file_reference = tLRPC$Document.file_reference;
                    String str = importingSticker.emoji;
                    if (str == null) {
                        str = "";
                    }
                    tLRPC$TL_inputStickerSetItem.emoji = str;
                    importingSticker.mimeType = tLRPC$Document.mime_type;
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
            ImportingSticker remove = this.uploadSet.remove(str);
            if (remove != null) {
                this.uploadMedia.remove(remove);
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
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = this.uploadedSize;
            long j3 = this.lastUploadSize;
            if (j2 != j3) {
                long j4 = this.lastUploadTime;
                if (elapsedRealtime != j4) {
                    double d = elapsedRealtime - j4;
                    Double.isNaN(d);
                    double d2 = j2 - j3;
                    Double.isNaN(d2);
                    double d3 = d2 / (d / 1000.0d);
                    double d4 = this.estimatedUploadSpeed;
                    if (d4 == 0.0d) {
                        this.estimatedUploadSpeed = d3;
                    } else {
                        this.estimatedUploadSpeed = (d3 * 0.01d) + (0.99d * d4);
                    }
                    double d5 = (this.totalSize - j2) * 1000;
                    double d6 = this.estimatedUploadSpeed;
                    Double.isNaN(d5);
                    this.timeUntilFinish = (int) (d5 / d6);
                    this.lastUploadSize = j2;
                    this.lastUploadTime = elapsedRealtime;
                }
            }
            int uploadedCount = (int) ((((float) getUploadedCount()) / ((float) getTotalCount())) * 100.0f);
            if (this.uploadProgress != uploadedCount) {
                this.uploadProgress = uploadedCount;
                SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersImportProgressChanged, this.shortName);
            }
        }

        public void onMediaImport(final String str, long j, TLRPC$InputFile tLRPC$InputFile) {
            addUploadProgress(str, j, 1.0f);
            ImportingSticker importingSticker = this.uploadSet.get(str);
            if (importingSticker == null) {
                return;
            }
            importingSticker.uploadMedia(SendMessagesHelper.this.currentAccount, tLRPC$InputFile, new Runnable() {
                @Override
                public final void run() {
                    SendMessagesHelper.ImportingStickers.this.lambda$onMediaImport$0(str);
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
            TLRPC$TL_stickers_createStickerSet tLRPC$TL_stickers_createStickerSet = new TLRPC$TL_stickers_createStickerSet();
            tLRPC$TL_stickers_createStickerSet.user_id = new TLRPC$TL_inputUserSelf();
            tLRPC$TL_stickers_createStickerSet.title = this.title;
            tLRPC$TL_stickers_createStickerSet.short_name = this.shortName;
            String str = this.software;
            if (str != null) {
                tLRPC$TL_stickers_createStickerSet.software = str;
                tLRPC$TL_stickers_createStickerSet.flags |= 8;
            }
            int size = this.uploadMedia.size();
            for (int i = 0; i < size; i++) {
                TLRPC$TL_inputStickerSetItem tLRPC$TL_inputStickerSetItem = this.uploadMedia.get(i).item;
                if (tLRPC$TL_inputStickerSetItem != null) {
                    tLRPC$TL_stickers_createStickerSet.stickers.add(tLRPC$TL_inputStickerSetItem);
                }
            }
            SendMessagesHelper.this.getConnectionsManager().sendRequest(tLRPC$TL_stickers_createStickerSet, new AnonymousClass1(tLRPC$TL_stickers_createStickerSet));
        }

        public class AnonymousClass1 implements RequestDelegate {
            final TLRPC$TL_stickers_createStickerSet val$req;

            AnonymousClass1(TLRPC$TL_stickers_createStickerSet tLRPC$TL_stickers_createStickerSet) {
                this.val$req = tLRPC$TL_stickers_createStickerSet;
            }

            @Override
            public void run(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
                final TLRPC$TL_stickers_createStickerSet tLRPC$TL_stickers_createStickerSet = this.val$req;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        SendMessagesHelper.ImportingStickers.AnonymousClass1.this.lambda$run$0(tLRPC$TL_error, tLRPC$TL_stickers_createStickerSet, tLObject);
                    }
                });
            }

            public void lambda$run$0(TLRPC$TL_error tLRPC$TL_error, TLRPC$TL_stickers_createStickerSet tLRPC$TL_stickers_createStickerSet, TLObject tLObject) {
                SendMessagesHelper.this.importingStickersMap.remove(ImportingStickers.this.shortName);
                if (tLRPC$TL_error == null) {
                    SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersImportProgressChanged, ImportingStickers.this.shortName);
                } else {
                    SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersImportProgressChanged, ImportingStickers.this.shortName, tLRPC$TL_stickers_createStickerSet, tLRPC$TL_error);
                }
                if (tLObject instanceof TLRPC$TL_messages_stickerSet) {
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
        int availableProcessors = Build.VERSION.SDK_INT >= 17 ? Runtime.getRuntime().availableProcessors() : 2;
        mediaSendThreadPool = new ThreadPoolExecutor(availableProcessors, availableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        Instance = new SendMessagesHelper[4];
    }

    public static class MediaSendPrepareWorker {
        public volatile String parentObject;
        public volatile TLRPC$TL_photo photo;
        public CountDownLatch sync;

        private MediaSendPrepareWorker() {
        }
    }

    @SuppressLint({"MissingPermission"})
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

        public class GpsLocationListener implements LocationListener {
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
                    SendMessagesHelper.LocationProvider.this.lambda$start$0();
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

        protected DelayedMessageSendAfterRequest() {
        }
    }

    public class DelayedMessage {
        public TLRPC$EncryptedChat encryptedChat;
        public HashMap<Object, Object> extraHashMap;
        public int finalGroupMessage;
        public long groupId;
        public String httpLocation;
        public ArrayList<String> httpLocations;
        public ArrayList<TLRPC$InputMedia> inputMedias;
        public TLRPC$InputMedia inputUploadMedia;
        public TLObject locationParent;
        public ArrayList<TLRPC$PhotoSize> locations;
        public ArrayList<MessageObject> messageObjects;
        public ArrayList<TLRPC$Message> messages;
        public MessageObject obj;
        public String originalPath;
        public ArrayList<String> originalPaths;
        public boolean paidMedia;
        public Object parentObject;
        public ArrayList<Object> parentObjects;
        public long peer;
        public boolean performMediaUpload;
        public TLRPC$PhotoSize photoSize;
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
            DelayedMessageSendAfterRequest delayedMessageSendAfterRequest = new DelayedMessageSendAfterRequest();
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
            DelayedMessageSendAfterRequest delayedMessageSendAfterRequest = new DelayedMessageSendAfterRequest();
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
            ArrayList<DelayedMessageSendAfterRequest> arrayList = this.requests;
            if (arrayList != null) {
                int i = this.type;
                if (i == 4 || i == 0) {
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        DelayedMessageSendAfterRequest delayedMessageSendAfterRequest = this.requests.get(i2);
                        TLObject tLObject = delayedMessageSendAfterRequest.request;
                        if (tLObject instanceof TLRPC$TL_messages_sendEncryptedMultiMedia) {
                            SendMessagesHelper.this.getSecretChatHelper().performSendEncryptedRequest((TLRPC$TL_messages_sendEncryptedMultiMedia) delayedMessageSendAfterRequest.request, this);
                        } else if (tLObject instanceof TLRPC$TL_messages_sendMultiMedia) {
                            SendMessagesHelper.this.performSendMessageRequestMulti((TLRPC$TL_messages_sendMultiMedia) tLObject, delayedMessageSendAfterRequest.msgObjs, delayedMessageSendAfterRequest.originalPaths, delayedMessageSendAfterRequest.parentObjects, delayedMessageSendAfterRequest.delayedMessage, delayedMessageSendAfterRequest.scheduled);
                        } else if (!(tLObject instanceof TLRPC$TL_messages_sendMedia) || !(((TLRPC$TL_messages_sendMedia) tLObject).media instanceof TLRPC$TL_inputMediaPaidMedia)) {
                            SendMessagesHelper.this.performSendMessageRequest(tLObject, delayedMessageSendAfterRequest.msgObj, delayedMessageSendAfterRequest.originalPath, delayedMessageSendAfterRequest.delayedMessage, delayedMessageSendAfterRequest.parentObject, null, delayedMessageSendAfterRequest.scheduled);
                        } else {
                            SendMessagesHelper.this.performSendMessageRequestMulti((TLRPC$TL_messages_sendMedia) tLObject, delayedMessageSendAfterRequest.msgObjs, delayedMessageSendAfterRequest.originalPaths, delayedMessageSendAfterRequest.parentObjects, delayedMessageSendAfterRequest.delayedMessage, delayedMessageSendAfterRequest.scheduled);
                        }
                    }
                    this.requests = null;
                }
            }
        }

        public void markAsError() {
            if (this.type == 4) {
                for (int i = 0; i < this.messageObjects.size(); i++) {
                    MessageObject messageObject = this.messageObjects.get(i);
                    SendMessagesHelper.this.getMessagesStorage().markMessageAsSendError(messageObject.messageOwner, messageObject.scheduled ? 1 : 0);
                    messageObject.messageOwner.send_state = 2;
                    SendMessagesHelper.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageSendError, Integer.valueOf(messageObject.getId()));
                    SendMessagesHelper.this.processSentMessage(messageObject.getId());
                    SendMessagesHelper.this.removeFromUploadingMessages(messageObject.getId(), this.scheduled);
                }
                SendMessagesHelper.this.delayedMessages.remove("group_" + this.groupId);
            } else {
                MessagesStorage messagesStorage = SendMessagesHelper.this.getMessagesStorage();
                MessageObject messageObject2 = this.obj;
                messagesStorage.markMessageAsSendError(messageObject2.messageOwner, messageObject2.scheduled ? 1 : 0);
                this.obj.messageOwner.send_state = 2;
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
                sendMessagesHelper = Instance[i];
                if (sendMessagesHelper == null) {
                    SendMessagesHelper[] sendMessagesHelperArr = Instance;
                    SendMessagesHelper sendMessagesHelper2 = new SendMessagesHelper(i);
                    sendMessagesHelperArr[i] = sendMessagesHelper2;
                    sendMessagesHelper = sendMessagesHelper2;
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
        this.sendingMessagesIdDialogs = new LongSparseArray<>();
        this.uploadingMessagesIdDialogs = new LongSparseArray<>();
        this.waitingForLocation = new HashMap<>();
        this.waitingForCallback = new HashMap<>();
        this.waitingForCallbackMap = new HashMap<>();
        this.waitingForVote = new HashMap<>();
        this.voteSendTime = new LongSparseArray<>();
        this.importingHistoryFiles = new HashMap<>();
        this.importingHistoryMap = new LongSparseArray<>();
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
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SendMessagesHelper.this.lambda$new$0();
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
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        String str;
        ArrayList<DelayedMessage> arrayList;
        char c;
        final MessageObject messageObject;
        MessageObject messageObject2;
        String str2;
        ArrayList<DelayedMessage> arrayList2;
        ArrayList<DelayedMessage> arrayList3;
        int i3;
        int i4;
        int i5;
        int i6;
        TLRPC$InputMedia tLRPC$InputMedia;
        ArrayList<DelayedMessage> arrayList4;
        TLRPC$InputFile tLRPC$InputFile;
        String str3;
        TLRPC$InputEncryptedFile tLRPC$InputEncryptedFile;
        int i7;
        TLObject tLObject;
        TLRPC$TL_decryptedMessage tLRPC$TL_decryptedMessage;
        TLRPC$TL_decryptedMessage tLRPC$TL_decryptedMessage2;
        int i8;
        ArrayList<DelayedMessage> arrayList5;
        TLRPC$InputEncryptedFile tLRPC$InputEncryptedFile2;
        String str4;
        int i9;
        TLRPC$PhotoSize tLRPC$PhotoSize;
        TLRPC$PhotoSize tLRPC$PhotoSize2;
        MessageObject messageObject3;
        VideoEditedInfo videoEditedInfo;
        int i10 = 0;
        if (i == NotificationCenter.fileUploadProgressChanged) {
            String str5 = (String) objArr[0];
            ImportingHistory importingHistory = this.importingHistoryFiles.get(str5);
            if (importingHistory != null) {
                Long l = (Long) objArr[1];
                importingHistory.addUploadProgress(str5, l.longValue(), ((float) l.longValue()) / ((float) ((Long) objArr[2]).longValue()));
            }
            ImportingStickers importingStickers = this.importingStickersFiles.get(str5);
            if (importingStickers != null) {
                Long l2 = (Long) objArr[1];
                importingStickers.addUploadProgress(str5, l2.longValue(), ((float) l2.longValue()) / ((float) ((Long) objArr[2]).longValue()));
                return;
            }
            return;
        }
        if (i == NotificationCenter.fileUploaded) {
            String str6 = (String) objArr[0];
            TLRPC$InputFile tLRPC$InputFile2 = (TLRPC$InputFile) objArr[1];
            TLRPC$InputEncryptedFile tLRPC$InputEncryptedFile3 = (TLRPC$InputEncryptedFile) objArr[2];
            ImportingHistory importingHistory2 = this.importingHistoryFiles.get(str6);
            if (importingHistory2 != null) {
                if (str6.equals(importingHistory2.historyPath)) {
                    importingHistory2.initImport(tLRPC$InputFile2);
                } else {
                    importingHistory2.onMediaImport(str6, ((Long) objArr[5]).longValue(), tLRPC$InputFile2);
                }
            }
            ImportingStickers importingStickers2 = this.importingStickersFiles.get(str6);
            if (importingStickers2 != null) {
                importingStickers2.onMediaImport(str6, ((Long) objArr[5]).longValue(), tLRPC$InputFile2);
            }
            ArrayList<DelayedMessage> arrayList6 = this.delayedMessages.get(str6);
            if (arrayList6 != null) {
                int i11 = 0;
                while (i11 < arrayList6.size()) {
                    DelayedMessage delayedMessage = arrayList6.get(i11);
                    TLObject tLObject2 = delayedMessage.sendRequest;
                    if (tLObject2 instanceof TLRPC$TL_messages_sendMedia) {
                        tLRPC$InputMedia = ((TLRPC$TL_messages_sendMedia) tLObject2).media;
                        if (tLRPC$InputMedia instanceof TLRPC$TL_inputMediaPaidMedia) {
                            HashMap<Object, Object> hashMap = delayedMessage.extraHashMap;
                            if (hashMap == null) {
                                tLRPC$InputMedia = ((TLRPC$TL_inputMediaPaidMedia) tLRPC$InputMedia).extended_media.get(i10);
                            } else {
                                tLRPC$InputMedia = (TLRPC$InputMedia) hashMap.get(str6);
                            }
                        }
                    } else if (tLObject2 instanceof TLRPC$TL_messages_editMessage) {
                        tLRPC$InputMedia = ((TLRPC$TL_messages_editMessage) tLObject2).media;
                    } else {
                        tLRPC$InputMedia = tLObject2 instanceof TLRPC$TL_messages_sendMultiMedia ? (TLRPC$InputMedia) delayedMessage.extraHashMap.get(str6) : null;
                    }
                    if (tLRPC$InputFile2 == null || tLRPC$InputMedia == null) {
                        int i12 = i11;
                        arrayList4 = arrayList6;
                        tLRPC$InputFile = tLRPC$InputFile2;
                        str3 = str6;
                        tLRPC$InputEncryptedFile = tLRPC$InputEncryptedFile3;
                        if (tLRPC$InputEncryptedFile == null || (tLObject = delayedMessage.sendEncryptedRequest) == null) {
                            i7 = i12;
                        } else {
                            if (delayedMessage.type == 4) {
                                TLRPC$TL_messages_sendEncryptedMultiMedia tLRPC$TL_messages_sendEncryptedMultiMedia = (TLRPC$TL_messages_sendEncryptedMultiMedia) tLObject;
                                TLRPC$InputEncryptedFile tLRPC$InputEncryptedFile4 = (TLRPC$InputEncryptedFile) delayedMessage.extraHashMap.get(str3);
                                int indexOf = tLRPC$TL_messages_sendEncryptedMultiMedia.files.indexOf(tLRPC$InputEncryptedFile4);
                                if (indexOf >= 0) {
                                    tLRPC$TL_messages_sendEncryptedMultiMedia.files.set(indexOf, tLRPC$InputEncryptedFile);
                                    if (tLRPC$InputEncryptedFile4.id == 1) {
                                        delayedMessage.photoSize = (TLRPC$PhotoSize) delayedMessage.extraHashMap.get(str3 + "_t");
                                    }
                                    tLRPC$TL_decryptedMessage2 = tLRPC$TL_messages_sendEncryptedMultiMedia.messages.get(indexOf);
                                } else {
                                    tLRPC$TL_decryptedMessage2 = null;
                                }
                                tLRPC$TL_decryptedMessage = tLRPC$TL_decryptedMessage2;
                            } else {
                                tLRPC$TL_decryptedMessage = (TLRPC$TL_decryptedMessage) tLObject;
                            }
                            if (tLRPC$TL_decryptedMessage != null) {
                                TLRPC$DecryptedMessageMedia tLRPC$DecryptedMessageMedia = tLRPC$TL_decryptedMessage.media;
                                if ((tLRPC$DecryptedMessageMedia instanceof TLRPC$TL_decryptedMessageMediaVideo) || (tLRPC$DecryptedMessageMedia instanceof TLRPC$TL_decryptedMessageMediaPhoto) || (tLRPC$DecryptedMessageMedia instanceof TLRPC$TL_decryptedMessageMediaDocument)) {
                                    tLRPC$TL_decryptedMessage.media.size = ((Long) objArr[5]).longValue();
                                }
                                TLRPC$DecryptedMessageMedia tLRPC$DecryptedMessageMedia2 = tLRPC$TL_decryptedMessage.media;
                                tLRPC$DecryptedMessageMedia2.key = (byte[]) objArr[3];
                                tLRPC$DecryptedMessageMedia2.iv = (byte[]) objArr[4];
                                if (delayedMessage.type == 4) {
                                    uploadMultiMedia(delayedMessage, null, tLRPC$InputEncryptedFile, str3);
                                } else {
                                    SecretChatHelper secretChatHelper = getSecretChatHelper();
                                    MessageObject messageObject4 = delayedMessage.obj;
                                    secretChatHelper.performSendEncryptedRequest(tLRPC$TL_decryptedMessage, messageObject4.messageOwner, delayedMessage.encryptedChat, tLRPC$InputEncryptedFile, delayedMessage.originalPath, messageObject4);
                                }
                            }
                            arrayList4.remove(i12);
                            i7 = i12 - 1;
                        }
                    } else {
                        int i13 = delayedMessage.type;
                        if (i13 == 0) {
                            tLRPC$InputMedia.file = tLRPC$InputFile2;
                            i8 = i11;
                            tLRPC$InputEncryptedFile2 = tLRPC$InputEncryptedFile3;
                            tLRPC$InputFile = tLRPC$InputFile2;
                            str4 = str6;
                            arrayList5 = arrayList6;
                            performSendMessageRequest(delayedMessage.sendRequest, delayedMessage.obj, delayedMessage.originalPath, delayedMessage, true, null, delayedMessage.parentObject, null, delayedMessage.scheduled);
                        } else {
                            i8 = i11;
                            arrayList5 = arrayList6;
                            tLRPC$InputEncryptedFile2 = tLRPC$InputEncryptedFile3;
                            tLRPC$InputFile = tLRPC$InputFile2;
                            str4 = str6;
                            if (i13 == 1) {
                                if (tLRPC$InputMedia.file == null) {
                                    tLRPC$InputMedia.file = tLRPC$InputFile;
                                    if (tLRPC$InputMedia.thumb == null && (tLRPC$PhotoSize2 = delayedMessage.photoSize) != null && tLRPC$PhotoSize2.location != null && ((messageObject3 = delayedMessage.obj) == null || (videoEditedInfo = messageObject3.videoEditedInfo) == null || !videoEditedInfo.isSticker)) {
                                        performSendDelayedMessage(delayedMessage);
                                    } else {
                                        performSendMessageRequest(delayedMessage.sendRequest, delayedMessage.obj, delayedMessage.originalPath, null, delayedMessage.parentObject, null, delayedMessage.scheduled);
                                    }
                                } else {
                                    tLRPC$InputMedia.thumb = tLRPC$InputFile;
                                    tLRPC$InputMedia.flags |= 4;
                                    performSendMessageRequest(delayedMessage.sendRequest, delayedMessage.obj, delayedMessage.originalPath, null, delayedMessage.parentObject, null, delayedMessage.scheduled);
                                }
                            } else if (i13 == 2) {
                                if (tLRPC$InputMedia.file == null) {
                                    tLRPC$InputMedia.file = tLRPC$InputFile;
                                    if (tLRPC$InputMedia.thumb == null && (tLRPC$PhotoSize = delayedMessage.photoSize) != null && tLRPC$PhotoSize.location != null) {
                                        performSendDelayedMessage(delayedMessage);
                                    } else {
                                        performSendMessageRequest(delayedMessage.sendRequest, delayedMessage.obj, delayedMessage.originalPath, null, delayedMessage.parentObject, null, delayedMessage.scheduled);
                                    }
                                } else {
                                    tLRPC$InputMedia.thumb = tLRPC$InputFile;
                                    tLRPC$InputMedia.flags |= 4;
                                    performSendMessageRequest(delayedMessage.sendRequest, delayedMessage.obj, delayedMessage.originalPath, null, delayedMessage.parentObject, null, delayedMessage.scheduled);
                                }
                            } else if (i13 == 3) {
                                tLRPC$InputMedia.file = tLRPC$InputFile;
                                performSendMessageRequest(delayedMessage.sendRequest, delayedMessage.obj, delayedMessage.originalPath, null, delayedMessage.parentObject, null, delayedMessage.scheduled);
                            } else {
                                if (i13 == 4) {
                                    if (tLRPC$InputMedia instanceof TLRPC$TL_inputMediaUploadedDocument) {
                                        if (tLRPC$InputMedia.file == null) {
                                            tLRPC$InputMedia.file = tLRPC$InputFile;
                                            HashMap<Object, Object> hashMap2 = delayedMessage.extraHashMap;
                                            StringBuilder sb = new StringBuilder();
                                            str3 = str4;
                                            sb.append(str3);
                                            sb.append("_i");
                                            int indexOf2 = delayedMessage.messageObjects.indexOf((MessageObject) hashMap2.get(sb.toString()));
                                            TLRPC$PhotoSize tLRPC$PhotoSize3 = (TLRPC$PhotoSize) delayedMessage.extraHashMap.get(str3 + "_t");
                                            delayedMessage.photoSize = tLRPC$PhotoSize3;
                                            if (tLRPC$InputMedia.thumb == null && tLRPC$PhotoSize3 != null && tLRPC$PhotoSize3.location != null) {
                                                delayedMessage.performMediaUpload = true;
                                                performSendDelayedMessage(delayedMessage, indexOf2);
                                            } else {
                                                uploadMultiMedia(delayedMessage, tLRPC$InputMedia, null, str3);
                                            }
                                        } else {
                                            str3 = str4;
                                            tLRPC$InputMedia.thumb = tLRPC$InputFile;
                                            tLRPC$InputMedia.flags |= 4;
                                            uploadMultiMedia(delayedMessage, tLRPC$InputMedia, null, (String) delayedMessage.extraHashMap.get(str3 + "_o"));
                                        }
                                    } else {
                                        str3 = str4;
                                        tLRPC$InputMedia.file = tLRPC$InputFile;
                                        uploadMultiMedia(delayedMessage, tLRPC$InputMedia, null, str3);
                                    }
                                    i9 = i8;
                                    arrayList4 = arrayList5;
                                    arrayList4.remove(i9);
                                    i7 = i9 - 1;
                                    tLRPC$InputEncryptedFile = tLRPC$InputEncryptedFile2;
                                } else {
                                    str3 = str4;
                                }
                                i9 = i8;
                                arrayList4 = arrayList5;
                                arrayList4.remove(i9);
                                i7 = i9 - 1;
                                tLRPC$InputEncryptedFile = tLRPC$InputEncryptedFile2;
                            }
                        }
                        i9 = i8;
                        str3 = str4;
                        arrayList4 = arrayList5;
                        arrayList4.remove(i9);
                        i7 = i9 - 1;
                        tLRPC$InputEncryptedFile = tLRPC$InputEncryptedFile2;
                    }
                    i11 = i7 + 1;
                    tLRPC$InputEncryptedFile3 = tLRPC$InputEncryptedFile;
                    str6 = str3;
                    tLRPC$InputFile2 = tLRPC$InputFile;
                    i10 = 0;
                    arrayList6 = arrayList4;
                }
                ArrayList<DelayedMessage> arrayList7 = arrayList6;
                String str7 = str6;
                if (arrayList7.isEmpty()) {
                    this.delayedMessages.remove(str7);
                    return;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.fileUploadFailed) {
            String str8 = (String) objArr[0];
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            ImportingHistory importingHistory3 = this.importingHistoryFiles.get(str8);
            if (importingHistory3 != null) {
                importingHistory3.onFileFailedToUpload(str8);
            }
            ImportingStickers importingStickers3 = this.importingStickersFiles.get(str8);
            if (importingStickers3 != null) {
                importingStickers3.onFileFailedToUpload(str8);
            }
            ArrayList<DelayedMessage> arrayList8 = this.delayedMessages.get(str8);
            if (arrayList8 != null) {
                int i14 = 0;
                while (i14 < arrayList8.size()) {
                    DelayedMessage delayedMessage2 = arrayList8.get(i14);
                    if ((booleanValue && delayedMessage2.sendEncryptedRequest != null) || (!booleanValue && delayedMessage2.sendRequest != null)) {
                        delayedMessage2.markAsError();
                        arrayList8.remove(i14);
                        i14--;
                    }
                    i14++;
                }
                if (arrayList8.isEmpty()) {
                    this.delayedMessages.remove(str8);
                    return;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.filePreparingStarted) {
            MessageObject messageObject5 = (MessageObject) objArr[0];
            if (messageObject5.getId() == 0) {
                return;
            }
            ArrayList<DelayedMessage> arrayList9 = this.delayedMessages.get(messageObject5.messageOwner.attachPath);
            if (arrayList9 != null) {
                int i15 = 0;
                while (true) {
                    if (i15 >= arrayList9.size()) {
                        break;
                    }
                    DelayedMessage delayedMessage3 = arrayList9.get(i15);
                    if (delayedMessage3.type == 4) {
                        int indexOf3 = delayedMessage3.messageObjects.indexOf(messageObject5);
                        delayedMessage3.photoSize = (TLRPC$PhotoSize) delayedMessage3.extraHashMap.get(messageObject5.messageOwner.attachPath + "_t");
                        delayedMessage3.performMediaUpload = true;
                        performSendDelayedMessage(delayedMessage3, indexOf3);
                        arrayList9.remove(i15);
                        break;
                    }
                    if (delayedMessage3.obj == messageObject5) {
                        delayedMessage3.videoEditedInfo = null;
                        performSendDelayedMessage(delayedMessage3);
                        arrayList9.remove(i15);
                        break;
                    }
                    i15++;
                }
                if (arrayList9.isEmpty()) {
                    this.delayedMessages.remove(messageObject5.messageOwner.attachPath);
                    return;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.fileNewChunkAvailable) {
            MessageObject messageObject6 = (MessageObject) objArr[0];
            if (messageObject6.getId() == 0) {
                return;
            }
            String str9 = (String) objArr[1];
            long longValue = ((Long) objArr[2]).longValue();
            long longValue2 = ((Long) objArr[3]).longValue();
            getFileLoader().checkUploadNewDataAvailable(str9, DialogObject.isEncryptedDialog(messageObject6.getDialogId()), longValue, longValue2, (Float) objArr[4]);
            if (longValue2 == 0 || (arrayList3 = this.delayedMessages.get(messageObject6.messageOwner.attachPath)) == null) {
                return;
            }
            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                DelayedMessage delayedMessage4 = arrayList3.get(i16);
                if (delayedMessage4.type == 4) {
                    int i17 = 0;
                    while (true) {
                        if (i17 >= delayedMessage4.messageObjects.size()) {
                            break;
                        }
                        MessageObject messageObject7 = delayedMessage4.messageObjects.get(i17);
                        if (messageObject7 == messageObject6) {
                            delayedMessage4.obj.shouldRemoveVideoEditedInfo = true;
                            messageObject7.messageOwner.params.remove("ve");
                            TLRPC$Document document = delayedMessage4.obj.getDocument();
                            if (document != null) {
                                document.size = longValue2;
                            }
                            ArrayList<TLRPC$Message> arrayList10 = new ArrayList<>();
                            arrayList10.add(messageObject7.messageOwner);
                            if (messageObject7.isQuickReply()) {
                                i5 = messageObject7.getQuickReplyId();
                                i6 = 5;
                            } else if (messageObject7.scheduled) {
                                i5 = 0;
                                i6 = 1;
                            } else {
                                i5 = 0;
                                i6 = 0;
                            }
                            if (!delayedMessage4.paidMedia || i17 == 0) {
                                getMessagesStorage().putMessages(arrayList10, false, true, false, 0, i6, i5);
                            }
                        } else {
                            i17++;
                        }
                    }
                } else {
                    MessageObject messageObject8 = delayedMessage4.obj;
                    if (messageObject8 == messageObject6) {
                        messageObject8.shouldRemoveVideoEditedInfo = true;
                        messageObject8.messageOwner.params.remove("ve");
                        TLRPC$Document document2 = delayedMessage4.obj.getDocument();
                        if (document2 != null) {
                            document2.size = longValue2;
                        }
                        ArrayList<TLRPC$Message> arrayList11 = new ArrayList<>();
                        arrayList11.add(delayedMessage4.obj.messageOwner);
                        if (delayedMessage4.obj.isQuickReply()) {
                            i3 = delayedMessage4.obj.getQuickReplyId();
                            i4 = 5;
                        } else {
                            i3 = 0;
                            i4 = delayedMessage4.obj.scheduled ? 1 : 0;
                        }
                        getMessagesStorage().putMessages(arrayList11, false, true, false, 0, i4, i3);
                        return;
                    }
                }
            }
            return;
        }
        if (i == NotificationCenter.filePreparingFailed) {
            MessageObject messageObject9 = (MessageObject) objArr[0];
            if (messageObject9.getId() == 0 || (arrayList2 = this.delayedMessages.get((str2 = (String) objArr[1]))) == null) {
                return;
            }
            int i18 = 0;
            while (i18 < arrayList2.size()) {
                DelayedMessage delayedMessage5 = arrayList2.get(i18);
                if (delayedMessage5.type == 4) {
                    for (int i19 = 0; i19 < delayedMessage5.messages.size(); i19++) {
                        if (delayedMessage5.messageObjects.get(i19) == messageObject9) {
                            delayedMessage5.markAsError();
                            arrayList2.remove(i18);
                            i18--;
                            break;
                        }
                    }
                    i18++;
                } else if (delayedMessage5.obj == messageObject9) {
                    delayedMessage5.markAsError();
                    arrayList2.remove(i18);
                    i18--;
                    break;
                    i18++;
                } else {
                    i18++;
                }
            }
            if (arrayList2.isEmpty()) {
                this.delayedMessages.remove(str2);
                return;
            }
            return;
        }
        if (i == NotificationCenter.httpFileDidLoad) {
            final String str10 = (String) objArr[0];
            ArrayList<DelayedMessage> arrayList12 = this.delayedMessages.get(str10);
            if (arrayList12 != null) {
                for (int i20 = 0; i20 < arrayList12.size(); i20++) {
                    final DelayedMessage delayedMessage6 = arrayList12.get(i20);
                    int i21 = delayedMessage6.type;
                    if (i21 == 0) {
                        messageObject = delayedMessage6.obj;
                        c = 0;
                    } else {
                        if (i21 == 2) {
                            messageObject2 = delayedMessage6.obj;
                        } else if (i21 == 4) {
                            messageObject2 = (MessageObject) delayedMessage6.extraHashMap.get(str10);
                            if (messageObject2.getDocument() == null) {
                                messageObject = messageObject2;
                                c = 0;
                            }
                        } else {
                            c = 65535;
                            messageObject = null;
                        }
                        messageObject = messageObject2;
                        c = 1;
                    }
                    if (c == 0) {
                        final File file = new File(FileLoader.getDirectory(4), Utilities.MD5(str10) + "." + ImageLoader.getHttpUrlExtension(str10, "file"));
                        Utilities.globalQueue.postRunnable(new Runnable() {
                            @Override
                            public final void run() {
                                SendMessagesHelper.this.lambda$didReceivedNotification$2(file, messageObject, delayedMessage6, str10);
                            }
                        });
                    } else if (c == 1) {
                        final File file2 = new File(FileLoader.getDirectory(4), Utilities.MD5(str10) + ".gif");
                        Utilities.globalQueue.postRunnable(new Runnable() {
                            @Override
                            public final void run() {
                                SendMessagesHelper.this.lambda$didReceivedNotification$4(delayedMessage6, file2, messageObject);
                            }
                        });
                    }
                }
                this.delayedMessages.remove(str10);
                return;
            }
            return;
        }
        if (i == NotificationCenter.fileLoaded) {
            String str11 = (String) objArr[0];
            ArrayList<DelayedMessage> arrayList13 = this.delayedMessages.get(str11);
            if (arrayList13 != null) {
                for (int i22 = 0; i22 < arrayList13.size(); i22++) {
                    performSendDelayedMessage(arrayList13.get(i22));
                }
                this.delayedMessages.remove(str11);
                return;
            }
            return;
        }
        if ((i == NotificationCenter.httpFileDidFailedLoad || i == NotificationCenter.fileLoadFailed) && (arrayList = this.delayedMessages.get((str = (String) objArr[0]))) != null) {
            for (int i23 = 0; i23 < arrayList.size(); i23++) {
                arrayList.get(i23).markAsError();
            }
            this.delayedMessages.remove(str);
        }
    }

    public void lambda$didReceivedNotification$2(final File file, final MessageObject messageObject, final DelayedMessage delayedMessage, final String str) {
        final TLRPC$TL_photo generatePhotoSizes = generatePhotoSizes(file.toString(), null);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SendMessagesHelper.this.lambda$didReceivedNotification$1(generatePhotoSizes, messageObject, file, delayedMessage, str);
            }
        });
    }

    public void lambda$didReceivedNotification$1(TLRPC$TL_photo tLRPC$TL_photo, MessageObject messageObject, File file, DelayedMessage delayedMessage, String str) {
        if (tLRPC$TL_photo != null) {
            TLRPC$Message tLRPC$Message = messageObject.messageOwner;
            tLRPC$Message.media.photo = tLRPC$TL_photo;
            tLRPC$Message.attachPath = file.toString();
            ArrayList<TLRPC$Message> arrayList = new ArrayList<>();
            arrayList.add(messageObject.messageOwner);
            getMessagesStorage().putMessages(arrayList, false, true, false, 0, messageObject.scheduled ? 1 : 0, 0L);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateMessageMedia, messageObject.messageOwner);
            ArrayList<TLRPC$PhotoSize> arrayList2 = tLRPC$TL_photo.sizes;
            delayedMessage.photoSize = arrayList2.get(arrayList2.size() - 1);
            delayedMessage.locationParent = tLRPC$TL_photo;
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
        final TLRPC$Document document = delayedMessage.obj.getDocument();
        if (document.thumbs.isEmpty() || (document.thumbs.get(0).location instanceof TLRPC$TL_fileLocationUnavailable)) {
            try {
                Bitmap loadBitmap = ImageLoader.loadBitmap(file.getAbsolutePath(), null, 90.0f, 90.0f, true);
                if (loadBitmap != null) {
                    document.thumbs.clear();
                    document.thumbs.add(ImageLoader.scaleAndSaveImage(loadBitmap, 90.0f, 90.0f, 55, delayedMessage.sendEncryptedRequest != null));
                    loadBitmap.recycle();
                }
            } catch (Exception e) {
                document.thumbs.clear();
                FileLog.e(e);
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SendMessagesHelper.this.lambda$didReceivedNotification$3(delayedMessage, file, document, messageObject);
            }
        });
    }

    public void lambda$didReceivedNotification$3(DelayedMessage delayedMessage, File file, TLRPC$Document tLRPC$Document, MessageObject messageObject) {
        delayedMessage.httpLocation = null;
        delayedMessage.obj.messageOwner.attachPath = file.toString();
        if (!tLRPC$Document.thumbs.isEmpty()) {
            TLRPC$PhotoSize tLRPC$PhotoSize = tLRPC$Document.thumbs.get(0);
            if (!(tLRPC$PhotoSize instanceof TLRPC$TL_photoStrippedSize)) {
                delayedMessage.photoSize = tLRPC$PhotoSize;
                delayedMessage.locationParent = tLRPC$Document;
            }
        }
        ArrayList<TLRPC$Message> arrayList = new ArrayList<>();
        arrayList.add(messageObject.messageOwner);
        getMessagesStorage().putMessages(arrayList, false, true, false, 0, messageObject.scheduled ? 1 : 0, 0L);
        delayedMessage.performMediaUpload = true;
        performSendDelayedMessage(delayedMessage);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateMessageMedia, delayedMessage.obj.messageOwner);
    }

    private void revertEditingMessageObject(MessageObject messageObject) {
        messageObject.cancelEditing = true;
        TLRPC$Message tLRPC$Message = messageObject.messageOwner;
        tLRPC$Message.media = messageObject.previousMedia;
        tLRPC$Message.message = messageObject.previousMessage;
        ArrayList<TLRPC$MessageEntity> arrayList = messageObject.previousMessageEntities;
        tLRPC$Message.entities = arrayList;
        tLRPC$Message.attachPath = messageObject.previousAttachPath;
        tLRPC$Message.send_state = 0;
        if (arrayList != null) {
            tLRPC$Message.flags |= 128;
        } else {
            tLRPC$Message.flags &= -129;
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
        ArrayList<TLRPC$Message> arrayList2 = new ArrayList<>();
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
            DelayedMessage delayedMessage = null;
            Iterator<Map.Entry<String, ArrayList<DelayedMessage>>> it = this.delayedMessages.entrySet().iterator();
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

    public void cancelSendingMessage(ArrayList<MessageObject> arrayList) {
        boolean z;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList<Integer> arrayList4 = new ArrayList<>();
        long j = 0;
        int i = 0;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        while (i < arrayList.size()) {
            MessageObject messageObject = arrayList.get(i);
            if (messageObject.scheduled) {
                i3 = 1;
            }
            long dialogId = messageObject.getDialogId();
            arrayList4.add(Integer.valueOf(messageObject.getId()));
            if (messageObject.isQuickReply()) {
                i2 = messageObject.getQuickReplyId();
            }
            TLRPC$Message removeFromSendingMessages = removeFromSendingMessages(messageObject.getId(), messageObject.scheduled);
            if (removeFromSendingMessages != null) {
                getConnectionsManager().cancelRequest(removeFromSendingMessages.reqId, true);
            }
            for (Map.Entry<String, ArrayList<DelayedMessage>> entry : this.delayedMessages.entrySet()) {
                ArrayList<DelayedMessage> value = entry.getValue();
                int i4 = 0;
                while (true) {
                    if (i4 >= value.size()) {
                        z = z2;
                        break;
                    }
                    DelayedMessage delayedMessage = value.get(i4);
                    z = z2;
                    if (delayedMessage.type == 4) {
                        int i5 = -1;
                        MessageObject messageObject2 = null;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= delayedMessage.messageObjects.size()) {
                                break;
                            }
                            messageObject2 = delayedMessage.messageObjects.get(i6);
                            if (messageObject2.getId() == messageObject.getId()) {
                                removeFromUploadingMessages(messageObject.getId(), messageObject.scheduled);
                                i5 = i6;
                                break;
                            }
                            i6++;
                        }
                        if (i5 >= 0) {
                            delayedMessage.messageObjects.remove(i5);
                            delayedMessage.messages.remove(i5);
                            delayedMessage.originalPaths.remove(i5);
                            if (!delayedMessage.parentObjects.isEmpty()) {
                                delayedMessage.parentObjects.remove(i5);
                            }
                            TLObject tLObject = delayedMessage.sendRequest;
                            if (tLObject instanceof TLRPC$TL_messages_sendMultiMedia) {
                                ((TLRPC$TL_messages_sendMultiMedia) tLObject).multi_media.remove(i5);
                            } else if ((tLObject instanceof TLRPC$TL_messages_sendMedia) && (((TLRPC$TL_messages_sendMedia) tLObject).media instanceof TLRPC$TL_inputMediaPaidMedia)) {
                                ((TLRPC$TL_inputMediaPaidMedia) ((TLRPC$TL_messages_sendMedia) tLObject).media).extended_media.remove(i5);
                            } else {
                                TLRPC$TL_messages_sendEncryptedMultiMedia tLRPC$TL_messages_sendEncryptedMultiMedia = (TLRPC$TL_messages_sendEncryptedMultiMedia) delayedMessage.sendEncryptedRequest;
                                tLRPC$TL_messages_sendEncryptedMultiMedia.messages.remove(i5);
                                tLRPC$TL_messages_sendEncryptedMultiMedia.files.remove(i5);
                            }
                            MediaController.getInstance().cancelVideoConvert(messageObject);
                            String str = (String) delayedMessage.extraHashMap.get(messageObject2);
                            if (str != null) {
                                arrayList2.add(str);
                            }
                            if (delayedMessage.messageObjects.isEmpty()) {
                                delayedMessage.sendDelayedRequests();
                            } else {
                                if (delayedMessage.finalGroupMessage == messageObject.getId()) {
                                    ArrayList<MessageObject> arrayList5 = delayedMessage.messageObjects;
                                    MessageObject messageObject3 = arrayList5.get(arrayList5.size() - 1);
                                    delayedMessage.finalGroupMessage = messageObject3.getId();
                                    messageObject3.messageOwner.params.put("final", "1");
                                    TLRPC$TL_messages_messages tLRPC$TL_messages_messages = new TLRPC$TL_messages_messages();
                                    tLRPC$TL_messages_messages.messages.add(messageObject3.messageOwner);
                                    getMessagesStorage().putMessages((TLRPC$messages_Messages) tLRPC$TL_messages_messages, delayedMessage.peer, -2, 0, false, i3, 0L);
                                }
                                if (!arrayList3.contains(delayedMessage)) {
                                    arrayList3.add(delayedMessage);
                                }
                            }
                        }
                    } else if (delayedMessage.obj.getId() == messageObject.getId()) {
                        removeFromUploadingMessages(messageObject.getId(), messageObject.scheduled);
                        value.remove(i4);
                        delayedMessage.sendDelayedRequests();
                        MediaController.getInstance().cancelVideoConvert(delayedMessage.obj);
                        if (value.size() == 0) {
                            arrayList2.add(entry.getKey());
                            if (delayedMessage.sendEncryptedRequest != null) {
                                z2 = true;
                            }
                        }
                    } else {
                        i4++;
                        z2 = z;
                    }
                }
                z2 = z;
            }
            i++;
            j = dialogId;
        }
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            String str2 = (String) arrayList2.get(i7);
            if (str2.startsWith("http")) {
                ImageLoader.getInstance().cancelLoadHttpFile(str2);
            } else {
                getFileLoader().cancelFileUpload(str2, z2);
            }
            this.delayedMessages.remove(str2);
        }
        int size = arrayList3.size();
        for (int i8 = 0; i8 < size; i8++) {
            sendReadyToSendGroup((DelayedMessage) arrayList3.get(i8), false, true);
        }
        int i9 = 0;
        if (arrayList.size() == 1 && arrayList.get(0).isEditing() && arrayList.get(0).previousMedia != null) {
            revertEditingMessageObject(arrayList.get(0));
            return;
        }
        if (!arrayList.isEmpty() && arrayList.get(0).isQuickReply()) {
            i9 = 5;
        } else if (i3 != 0) {
            i9 = 1;
        }
        getMessagesController().deleteMessages(arrayList4, null, null, j, i2, false, i9);
    }

    public boolean retrySendMessage(MessageObject messageObject, boolean z) {
        if (messageObject.getId() >= 0) {
            if (messageObject.isEditing()) {
                editMessage(messageObject, null, null, null, null, null, true, messageObject.hasMediaSpoilers(), messageObject);
            }
            return false;
        }
        TLRPC$MessageAction tLRPC$MessageAction = messageObject.messageOwner.action;
        if (tLRPC$MessageAction instanceof TLRPC$TL_messageEncryptedAction) {
            TLRPC$EncryptedChat encryptedChat = getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(messageObject.getDialogId())));
            if (encryptedChat == null) {
                getMessagesStorage().markMessageAsSendError(messageObject.messageOwner, messageObject.scheduled ? 1 : 0);
                messageObject.messageOwner.send_state = 2;
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageSendError, Integer.valueOf(messageObject.getId()));
                processSentMessage(messageObject.getId());
                return false;
            }
            TLRPC$Message tLRPC$Message = messageObject.messageOwner;
            if (tLRPC$Message.random_id == 0) {
                tLRPC$Message.random_id = getNextRandomId();
            }
            TLRPC$DecryptedMessageAction tLRPC$DecryptedMessageAction = messageObject.messageOwner.action.encryptedAction;
            if (tLRPC$DecryptedMessageAction instanceof TLRPC$TL_decryptedMessageActionSetMessageTTL) {
                getSecretChatHelper().sendTTLMessage(encryptedChat, messageObject.messageOwner);
            } else if (tLRPC$DecryptedMessageAction instanceof TLRPC$TL_decryptedMessageActionDeleteMessages) {
                getSecretChatHelper().sendMessagesDeleteMessage(encryptedChat, null, messageObject.messageOwner);
            } else if (tLRPC$DecryptedMessageAction instanceof TLRPC$TL_decryptedMessageActionFlushHistory) {
                getSecretChatHelper().sendClearHistoryMessage(encryptedChat, messageObject.messageOwner);
            } else if (tLRPC$DecryptedMessageAction instanceof TLRPC$TL_decryptedMessageActionNotifyLayer) {
                getSecretChatHelper().sendNotifyLayerMessage(encryptedChat, messageObject.messageOwner);
            } else if (tLRPC$DecryptedMessageAction instanceof TLRPC$TL_decryptedMessageActionReadMessages) {
                getSecretChatHelper().sendMessagesReadMessage(encryptedChat, null, messageObject.messageOwner);
            } else if (tLRPC$DecryptedMessageAction instanceof TLRPC$TL_decryptedMessageActionScreenshotMessages) {
                getSecretChatHelper().sendScreenshotMessage(encryptedChat, null, messageObject.messageOwner);
            } else if (!(tLRPC$DecryptedMessageAction instanceof TLRPC$TL_decryptedMessageActionTyping)) {
                if (tLRPC$DecryptedMessageAction instanceof TLRPC$TL_decryptedMessageActionResend) {
                    getSecretChatHelper().sendResendMessage(encryptedChat, 0, 0, messageObject.messageOwner);
                } else if (tLRPC$DecryptedMessageAction instanceof TLRPC$TL_decryptedMessageActionCommitKey) {
                    getSecretChatHelper().sendCommitKeyMessage(encryptedChat, messageObject.messageOwner);
                } else if (tLRPC$DecryptedMessageAction instanceof TLRPC$TL_decryptedMessageActionAbortKey) {
                    getSecretChatHelper().sendAbortKeyMessage(encryptedChat, messageObject.messageOwner, 0L);
                } else if (tLRPC$DecryptedMessageAction instanceof TLRPC$TL_decryptedMessageActionRequestKey) {
                    getSecretChatHelper().sendRequestKeyMessage(encryptedChat, messageObject.messageOwner);
                } else if (tLRPC$DecryptedMessageAction instanceof TLRPC$TL_decryptedMessageActionAcceptKey) {
                    getSecretChatHelper().sendAcceptKeyMessage(encryptedChat, messageObject.messageOwner);
                } else if (tLRPC$DecryptedMessageAction instanceof TLRPC$TL_decryptedMessageActionNoop) {
                    getSecretChatHelper().sendNoopMessage(encryptedChat, messageObject.messageOwner);
                }
            }
            return true;
        }
        if (tLRPC$MessageAction instanceof TLRPC$TL_messageActionScreenshotTaken) {
            sendScreenshotMessage(getMessagesController().getUser(Long.valueOf(messageObject.getDialogId())), messageObject.getReplyMsgId(), messageObject.messageOwner);
        }
        if (z) {
            this.unsentMessages.put(messageObject.getId(), messageObject);
        }
        sendMessage(SendMessageParams.of(messageObject));
        return true;
    }

    public void processSentMessage(int i) {
        int size = this.unsentMessages.size();
        this.unsentMessages.remove(i);
        if (size == 0 || this.unsentMessages.size() != 0) {
            return;
        }
        checkUnsentMessages();
    }

    public void processForwardFromMyName(org.telegram.messenger.MessageObject r27, long r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.processForwardFromMyName(org.telegram.messenger.MessageObject, long):void");
    }

    public void sendScreenshotMessage(TLRPC$User tLRPC$User, int i, TLRPC$Message tLRPC$Message) {
        TLRPC$Message tLRPC$Message2 = tLRPC$Message;
        if (tLRPC$User == null || i == 0 || tLRPC$User.id == getUserConfig().getClientUserId()) {
            return;
        }
        TLRPC$TL_messages_sendScreenshotNotification tLRPC$TL_messages_sendScreenshotNotification = new TLRPC$TL_messages_sendScreenshotNotification();
        TLRPC$TL_inputPeerUser tLRPC$TL_inputPeerUser = new TLRPC$TL_inputPeerUser();
        tLRPC$TL_messages_sendScreenshotNotification.peer = tLRPC$TL_inputPeerUser;
        tLRPC$TL_inputPeerUser.access_hash = tLRPC$User.access_hash;
        tLRPC$TL_inputPeerUser.user_id = tLRPC$User.id;
        if (tLRPC$Message2 != null) {
            tLRPC$TL_messages_sendScreenshotNotification.reply_to = createReplyInput(i);
            tLRPC$TL_messages_sendScreenshotNotification.random_id = tLRPC$Message2.random_id;
        } else {
            tLRPC$Message2 = new TLRPC$TL_messageService();
            tLRPC$Message2.random_id = getNextRandomId();
            tLRPC$Message2.dialog_id = tLRPC$User.id;
            tLRPC$Message2.unread = true;
            tLRPC$Message2.out = true;
            int newMessageId = getUserConfig().getNewMessageId();
            tLRPC$Message2.id = newMessageId;
            tLRPC$Message2.local_id = newMessageId;
            TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
            tLRPC$Message2.from_id = tLRPC$TL_peerUser;
            tLRPC$TL_peerUser.user_id = getUserConfig().getClientUserId();
            int i2 = tLRPC$Message2.flags | 256;
            tLRPC$Message2.flags = i2;
            tLRPC$Message2.flags = i2 | 8;
            TLRPC$TL_messageReplyHeader tLRPC$TL_messageReplyHeader = new TLRPC$TL_messageReplyHeader();
            tLRPC$Message2.reply_to = tLRPC$TL_messageReplyHeader;
            tLRPC$TL_messageReplyHeader.flags |= 16;
            tLRPC$TL_messageReplyHeader.reply_to_msg_id = i;
            TLRPC$TL_peerUser tLRPC$TL_peerUser2 = new TLRPC$TL_peerUser();
            tLRPC$Message2.peer_id = tLRPC$TL_peerUser2;
            tLRPC$TL_peerUser2.user_id = tLRPC$User.id;
            tLRPC$Message2.date = getConnectionsManager().getCurrentTime();
            tLRPC$Message2.action = new TLRPC$TL_messageActionScreenshotTaken();
            getUserConfig().saveConfig(false);
        }
        tLRPC$TL_messages_sendScreenshotNotification.random_id = tLRPC$Message2.random_id;
        MessageObject messageObject = new MessageObject(this.currentAccount, tLRPC$Message2, false, true);
        messageObject.messageOwner.send_state = 1;
        messageObject.wasJustSent = true;
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        arrayList.add(messageObject);
        getMessagesController().updateInterfaceWithMessages(tLRPC$Message2.dialog_id, arrayList, 0);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
        ArrayList<TLRPC$Message> arrayList2 = new ArrayList<>();
        arrayList2.add(tLRPC$Message2);
        getMessagesStorage().putMessages(arrayList2, false, true, false, 0, false, 0, 0L);
        performSendMessageRequest(tLRPC$TL_messages_sendScreenshotNotification, messageObject, null, null, null, null, false);
    }

    public void sendSticker(TLRPC$Document tLRPC$Document, String str, final long j, final MessageObject messageObject, final MessageObject messageObject2, final TL_stories$StoryItem tL_stories$StoryItem, final ChatActivity.ReplyQuote replyQuote, final MessageObject.SendAnimationData sendAnimationData, final boolean z, final int i, boolean z2, final Object obj, final String str2, final int i2) {
        final TLRPC$Document tLRPC$Document2;
        HashMap hashMap;
        TLRPC$PhotoSize tLRPC$PhotoSize;
        byte[] bArr;
        if (tLRPC$Document == null) {
            return;
        }
        if (DialogObject.isEncryptedDialog(j)) {
            if (getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(j))) == null) {
                return;
            }
            TLRPC$TL_document_layer82 tLRPC$TL_document_layer82 = new TLRPC$TL_document_layer82();
            tLRPC$TL_document_layer82.id = tLRPC$Document.id;
            tLRPC$TL_document_layer82.access_hash = tLRPC$Document.access_hash;
            tLRPC$TL_document_layer82.date = tLRPC$Document.date;
            tLRPC$TL_document_layer82.mime_type = tLRPC$Document.mime_type;
            byte[] bArr2 = tLRPC$Document.file_reference;
            tLRPC$TL_document_layer82.file_reference = bArr2;
            if (bArr2 == null) {
                tLRPC$TL_document_layer82.file_reference = new byte[0];
            }
            tLRPC$TL_document_layer82.size = tLRPC$Document.size;
            tLRPC$TL_document_layer82.dc_id = tLRPC$Document.dc_id;
            tLRPC$TL_document_layer82.attributes = new ArrayList<>();
            for (int i3 = 0; i3 < tLRPC$Document.attributes.size(); i3++) {
                TLRPC$DocumentAttribute tLRPC$DocumentAttribute = tLRPC$Document.attributes.get(i3);
                if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeVideo) {
                    TLRPC$TL_documentAttributeVideo_layer159 tLRPC$TL_documentAttributeVideo_layer159 = new TLRPC$TL_documentAttributeVideo_layer159();
                    tLRPC$TL_documentAttributeVideo_layer159.flags = tLRPC$DocumentAttribute.flags;
                    tLRPC$TL_documentAttributeVideo_layer159.round_message = tLRPC$DocumentAttribute.round_message;
                    tLRPC$TL_documentAttributeVideo_layer159.supports_streaming = tLRPC$DocumentAttribute.supports_streaming;
                    tLRPC$TL_documentAttributeVideo_layer159.duration = tLRPC$DocumentAttribute.duration;
                    tLRPC$TL_documentAttributeVideo_layer159.w = tLRPC$DocumentAttribute.w;
                    tLRPC$TL_documentAttributeVideo_layer159.h = tLRPC$DocumentAttribute.h;
                    tLRPC$TL_document_layer82.attributes.add(tLRPC$TL_documentAttributeVideo_layer159);
                } else {
                    tLRPC$TL_document_layer82.attributes.add(tLRPC$DocumentAttribute);
                }
            }
            if (tLRPC$TL_document_layer82.mime_type == null) {
                tLRPC$TL_document_layer82.mime_type = "";
            }
            TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tLRPC$Document.thumbs, 10);
            if ((closestPhotoSizeWithSize instanceof TLRPC$TL_photoSize) || (closestPhotoSizeWithSize instanceof TLRPC$TL_photoSizeProgressive) || (closestPhotoSizeWithSize instanceof TLRPC$TL_photoStrippedSize)) {
                File pathToAttach = FileLoader.getInstance(this.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true);
                if ((closestPhotoSizeWithSize instanceof TLRPC$TL_photoStrippedSize) || pathToAttach.exists()) {
                    try {
                        if (closestPhotoSizeWithSize instanceof TLRPC$TL_photoStrippedSize) {
                            tLRPC$PhotoSize = new TLRPC$TL_photoStrippedSize();
                            bArr = closestPhotoSizeWithSize.bytes;
                        } else {
                            TLRPC$TL_photoCachedSize tLRPC$TL_photoCachedSize = new TLRPC$TL_photoCachedSize();
                            pathToAttach.length();
                            byte[] bArr3 = new byte[(int) pathToAttach.length()];
                            new RandomAccessFile(pathToAttach, "r").readFully(bArr3);
                            tLRPC$PhotoSize = tLRPC$TL_photoCachedSize;
                            bArr = bArr3;
                        }
                        TLRPC$TL_fileLocation_layer82 tLRPC$TL_fileLocation_layer82 = new TLRPC$TL_fileLocation_layer82();
                        TLRPC$FileLocation tLRPC$FileLocation = closestPhotoSizeWithSize.location;
                        tLRPC$TL_fileLocation_layer82.dc_id = tLRPC$FileLocation.dc_id;
                        tLRPC$TL_fileLocation_layer82.volume_id = tLRPC$FileLocation.volume_id;
                        tLRPC$TL_fileLocation_layer82.local_id = tLRPC$FileLocation.local_id;
                        tLRPC$TL_fileLocation_layer82.secret = tLRPC$FileLocation.secret;
                        tLRPC$PhotoSize.location = tLRPC$TL_fileLocation_layer82;
                        tLRPC$PhotoSize.size = closestPhotoSizeWithSize.size;
                        tLRPC$PhotoSize.w = closestPhotoSizeWithSize.w;
                        tLRPC$PhotoSize.h = closestPhotoSizeWithSize.h;
                        tLRPC$PhotoSize.type = closestPhotoSizeWithSize.type;
                        tLRPC$PhotoSize.bytes = bArr;
                        tLRPC$TL_document_layer82.thumbs.add(tLRPC$PhotoSize);
                        tLRPC$TL_document_layer82.flags |= 1;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
            }
            if (tLRPC$TL_document_layer82.thumbs.isEmpty()) {
                TLRPC$TL_photoSizeEmpty tLRPC$TL_photoSizeEmpty = new TLRPC$TL_photoSizeEmpty();
                tLRPC$TL_photoSizeEmpty.type = "s";
                tLRPC$TL_document_layer82.thumbs.add(tLRPC$TL_photoSizeEmpty);
            }
            tLRPC$Document2 = tLRPC$TL_document_layer82;
        } else {
            tLRPC$Document2 = tLRPC$Document;
        }
        if (MessageObject.isGifDocument(tLRPC$Document2)) {
            mediaSendQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    SendMessagesHelper.this.lambda$sendSticker$6(tLRPC$Document2, j, messageObject, messageObject2, z, i, obj, sendAnimationData, tL_stories$StoryItem, replyQuote, str2, i2);
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
        SendMessageParams of = SendMessageParams.of((TLRPC$TL_document) tLRPC$Document2, null, null, j, messageObject, messageObject2, null, null, null, hashMap, z, i, 0, obj, sendAnimationData, z2);
        of.replyToStoryItem = tL_stories$StoryItem;
        of.replyQuote = replyQuote;
        of.quick_reply_shortcut = str2;
        of.quick_reply_shortcut_id = i2;
        sendMessage(of);
    }

    public void lambda$sendSticker$6(final TLRPC$Document tLRPC$Document, final long j, final MessageObject messageObject, final MessageObject messageObject2, final boolean z, final int i, final Object obj, final MessageObject.SendAnimationData sendAnimationData, final TL_stories$StoryItem tL_stories$StoryItem, final ChatActivity.ReplyQuote replyQuote, final String str, final int i2) {
        String str2;
        final Bitmap[] bitmapArr = new Bitmap[1];
        final String[] strArr = new String[1];
        String key = ImageLocation.getForDocument(tLRPC$Document).getKey(null, null, false);
        if ("video/mp4".equals(tLRPC$Document.mime_type)) {
            str2 = ".mp4";
        } else {
            str2 = "video/x-matroska".equals(tLRPC$Document.mime_type) ? ".mkv" : "";
        }
        File file = new File(FileLoader.getDirectory(3), key + str2);
        if (!file.exists()) {
            file = new File(FileLoader.getDirectory(2), key + str2);
        }
        ensureMediaThumbExists(getAccountInstance(), false, tLRPC$Document, file.getAbsolutePath(), null, 0L);
        strArr[0] = getKeyForPhotoSize(getAccountInstance(), FileLoader.getClosestPhotoSizeWithSize(tLRPC$Document.thumbs, 320), bitmapArr, true, true);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SendMessagesHelper.this.lambda$sendSticker$5(bitmapArr, strArr, tLRPC$Document, j, messageObject, messageObject2, z, i, obj, sendAnimationData, tL_stories$StoryItem, replyQuote, str, i2);
            }
        });
    }

    public void lambda$sendSticker$5(Bitmap[] bitmapArr, String[] strArr, TLRPC$Document tLRPC$Document, long j, MessageObject messageObject, MessageObject messageObject2, boolean z, int i, Object obj, MessageObject.SendAnimationData sendAnimationData, TL_stories$StoryItem tL_stories$StoryItem, ChatActivity.ReplyQuote replyQuote, String str, int i2) {
        if (bitmapArr[0] != null && strArr[0] != null) {
            ImageLoader.getInstance().putImageToCache(new BitmapDrawable(bitmapArr[0]), strArr[0], false);
        }
        SendMessageParams of = SendMessageParams.of((TLRPC$TL_document) tLRPC$Document, null, null, j, messageObject, messageObject2, null, null, null, null, z, i, 0, obj, sendAnimationData, false);
        of.replyToStoryItem = tL_stories$StoryItem;
        of.replyQuote = replyQuote;
        of.quick_reply_shortcut = str;
        of.quick_reply_shortcut_id = i2;
        sendMessage(of);
    }

    public int sendMessage(ArrayList<MessageObject> arrayList, long j, boolean z, boolean z2, boolean z3, int i) {
        return sendMessage(arrayList, j, z, z2, z3, i, null);
    }

    public int sendMessage(java.util.ArrayList<org.telegram.messenger.MessageObject> r65, final long r66, boolean r68, boolean r69, boolean r70, final int r71, org.telegram.messenger.MessageObject r72) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.sendMessage(java.util.ArrayList, long, boolean, boolean, boolean, int, org.telegram.messenger.MessageObject):int");
    }

    public void lambda$sendMessage$14(final long r25, final int r27, boolean r28, boolean r29, androidx.collection.LongSparseArray r30, java.util.ArrayList r31, java.util.ArrayList r32, final org.telegram.messenger.MessageObject r33, final org.telegram.tgnet.TLRPC$Peer r34, final org.telegram.tgnet.TLRPC$TL_messages_forwardMessages r35, org.telegram.tgnet.TLObject r36, final org.telegram.tgnet.TLRPC$TL_error r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.lambda$sendMessage$14(long, int, boolean, boolean, androidx.collection.LongSparseArray, java.util.ArrayList, java.util.ArrayList, org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$Peer, org.telegram.tgnet.TLRPC$TL_messages_forwardMessages, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    public void lambda$sendMessage$9(final int i, final TLRPC$Message tLRPC$Message, final ArrayList arrayList, final MessageObject messageObject, final int i2) {
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(Integer.valueOf(i));
        getMessagesController().deleteMessages(arrayList2, null, null, tLRPC$Message.dialog_id, tLRPC$Message.quick_reply_shortcut_id, false, 1);
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                SendMessagesHelper.this.lambda$sendMessage$8(arrayList, messageObject, tLRPC$Message, i, i2);
            }
        });
    }

    public void lambda$sendMessage$8(ArrayList arrayList, final MessageObject messageObject, final TLRPC$Message tLRPC$Message, final int i, final int i2) {
        getMessagesStorage().putMessages((ArrayList<TLRPC$Message>) arrayList, true, false, false, 0, 0, 0L);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SendMessagesHelper.this.lambda$sendMessage$7(messageObject, tLRPC$Message, i, i2);
            }
        });
    }

    public void lambda$sendMessage$7(MessageObject messageObject, TLRPC$Message tLRPC$Message, int i, int i2) {
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        arrayList.add(new MessageObject(messageObject.currentAccount, messageObject.messageOwner, true, true));
        getMessagesController().updateInterfaceWithMessages(tLRPC$Message.dialog_id, arrayList, 0);
        getMediaDataController().increasePeerRaiting(tLRPC$Message.dialog_id);
        processSentMessage(i);
        removeFromSendingMessages(i, i2 != 0);
    }

    public void lambda$sendMessage$11(final int i, final TLRPC$Message tLRPC$Message, final TLRPC$Message tLRPC$Message2, TLRPC$Peer tLRPC$Peer, final int i2, ArrayList arrayList, final long j, final int i3) {
        int i4 = (tLRPC$Message.quick_reply_shortcut_id == 0 && tLRPC$Message.quick_reply_shortcut == null) ? i != 0 ? 1 : 0 : 5;
        getMessagesStorage().updateMessageStateAndId(tLRPC$Message2.random_id, MessageObject.getPeerId(tLRPC$Peer), Integer.valueOf(i2), tLRPC$Message2.id, 0, false, i != 0 ? 1 : 0, tLRPC$Message.quick_reply_shortcut_id);
        getMessagesStorage().putMessages((ArrayList<TLRPC$Message>) arrayList, true, false, false, 0, i4, tLRPC$Message.quick_reply_shortcut_id);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SendMessagesHelper.this.lambda$sendMessage$10(tLRPC$Message2, j, i2, tLRPC$Message, i3, i);
            }
        });
    }

    public void lambda$sendMessage$10(TLRPC$Message tLRPC$Message, long j, int i, TLRPC$Message tLRPC$Message2, int i2, int i3) {
        tLRPC$Message.send_state = 0;
        getMediaDataController().increasePeerRaiting(j);
        NotificationCenter notificationCenter = getNotificationCenter();
        int i4 = NotificationCenter.messageReceivedByServer;
        Object[] objArr = new Object[7];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(tLRPC$Message2.id);
        objArr[2] = tLRPC$Message2;
        objArr[3] = Long.valueOf(j);
        objArr[4] = 0L;
        objArr[5] = Integer.valueOf(i2);
        objArr[6] = Boolean.valueOf(i3 != 0);
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i4, objArr);
        NotificationCenter notificationCenter2 = getNotificationCenter();
        int i5 = NotificationCenter.messageReceivedByServer2;
        Object[] objArr2 = new Object[7];
        objArr2[0] = Integer.valueOf(i);
        objArr2[1] = Integer.valueOf(tLRPC$Message2.id);
        objArr2[2] = tLRPC$Message2;
        objArr2[3] = Long.valueOf(j);
        objArr2[4] = 0L;
        objArr2[5] = Integer.valueOf(i2);
        objArr2[6] = Boolean.valueOf(i3 != 0);
        notificationCenter2.lambda$postNotificationNameOnUIThread$1(i5, objArr2);
        processSentMessage(i);
        removeFromSendingMessages(i, i3 != 0);
    }

    public void lambda$sendMessage$12(TLRPC$TL_error tLRPC$TL_error, TLRPC$TL_messages_forwardMessages tLRPC$TL_messages_forwardMessages) {
        AlertsCreator.processError(this.currentAccount, tLRPC$TL_error, null, tLRPC$TL_messages_forwardMessages, new Object[0]);
    }

    public void lambda$sendMessage$13(TLRPC$Message tLRPC$Message, int i) {
        tLRPC$Message.send_state = 2;
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageSendError, Integer.valueOf(tLRPC$Message.id));
        processSentMessage(tLRPC$Message.id);
        removeFromSendingMessages(tLRPC$Message.id, i != 0);
    }

    public static int canSendMessageToChat(TLRPC$Chat tLRPC$Chat, MessageObject messageObject) {
        boolean canSendStickers = ChatObject.canSendStickers(tLRPC$Chat);
        boolean canSendPhoto = ChatObject.canSendPhoto(tLRPC$Chat);
        boolean canSendVideo = ChatObject.canSendVideo(tLRPC$Chat);
        boolean canSendDocument = ChatObject.canSendDocument(tLRPC$Chat);
        ChatObject.canSendEmbed(tLRPC$Chat);
        boolean canSendPolls = ChatObject.canSendPolls(tLRPC$Chat);
        boolean canSendRoundVideo = ChatObject.canSendRoundVideo(tLRPC$Chat);
        boolean canSendVoice = ChatObject.canSendVoice(tLRPC$Chat);
        boolean canSendMusic = ChatObject.canSendMusic(tLRPC$Chat);
        boolean z = messageObject.isSticker() || messageObject.isAnimatedSticker() || messageObject.isGif() || messageObject.isGame();
        if (!canSendStickers && z) {
            return ChatObject.isActionBannedByDefault(tLRPC$Chat, 8) ? 4 : 1;
        }
        if (!canSendPhoto && (messageObject.messageOwner.media instanceof TLRPC$TL_messageMediaPhoto) && !messageObject.isVideo() && !z) {
            return ChatObject.isActionBannedByDefault(tLRPC$Chat, 16) ? 10 : 12;
        }
        if (!canSendMusic && messageObject.isMusic()) {
            return ChatObject.isActionBannedByDefault(tLRPC$Chat, 18) ? 19 : 20;
        }
        if (!canSendVideo && messageObject.isVideo() && !z) {
            return ChatObject.isActionBannedByDefault(tLRPC$Chat, 17) ? 9 : 11;
        }
        if (!canSendPolls && (messageObject.messageOwner.media instanceof TLRPC$TL_messageMediaPoll)) {
            return ChatObject.isActionBannedByDefault(tLRPC$Chat, 10) ? 6 : 3;
        }
        if (!canSendVoice && MessageObject.isVoiceMessage(messageObject.messageOwner)) {
            return ChatObject.isActionBannedByDefault(tLRPC$Chat, 20) ? 13 : 14;
        }
        if (!canSendRoundVideo && MessageObject.isRoundVideoMessage(messageObject.messageOwner)) {
            return ChatObject.isActionBannedByDefault(tLRPC$Chat, 21) ? 15 : 16;
        }
        if (canSendDocument || !(messageObject.messageOwner.media instanceof TLRPC$TL_messageMediaDocument) || z) {
            return 0;
        }
        return ChatObject.isActionBannedByDefault(tLRPC$Chat, 19) ? 17 : 18;
    }

    private void writePreviousMessageData(TLRPC$Message tLRPC$Message, SerializedData serializedData) {
        TLRPC$MessageMedia tLRPC$MessageMedia = tLRPC$Message.media;
        if (tLRPC$MessageMedia == null) {
            new TLRPC$TL_messageMediaEmpty().serializeToStream(serializedData);
        } else {
            tLRPC$MessageMedia.serializeToStream(serializedData);
        }
        String str = tLRPC$Message.message;
        if (str == null) {
            str = "";
        }
        serializedData.writeString(str);
        String str2 = tLRPC$Message.attachPath;
        serializedData.writeString(str2 != null ? str2 : "");
        int size = tLRPC$Message.entities.size();
        serializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            tLRPC$Message.entities.get(i).serializeToStream(serializedData);
        }
    }

    public void editMessage(org.telegram.messenger.MessageObject r30, org.telegram.tgnet.TLRPC$TL_photo r31, org.telegram.messenger.VideoEditedInfo r32, org.telegram.tgnet.TLRPC$TL_document r33, java.lang.String r34, java.util.HashMap<java.lang.String, java.lang.String> r35, boolean r36, boolean r37, java.lang.Object r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.editMessage(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$TL_photo, org.telegram.messenger.VideoEditedInfo, org.telegram.tgnet.TLRPC$TL_document, java.lang.String, java.util.HashMap, boolean, boolean, java.lang.Object):void");
    }

    public int editMessage(MessageObject messageObject, String str, boolean z, final BaseFragment baseFragment, ArrayList<TLRPC$MessageEntity> arrayList, int i) {
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return 0;
        }
        final TLRPC$TL_messages_editMessage tLRPC$TL_messages_editMessage = new TLRPC$TL_messages_editMessage();
        tLRPC$TL_messages_editMessage.peer = getMessagesController().getInputPeer(messageObject.getDialogId());
        if (str != null) {
            tLRPC$TL_messages_editMessage.message = str;
            tLRPC$TL_messages_editMessage.flags |= 2048;
            tLRPC$TL_messages_editMessage.no_webpage = !z;
        }
        tLRPC$TL_messages_editMessage.id = messageObject.getId();
        TLRPC$Message tLRPC$Message = messageObject.messageOwner;
        if (tLRPC$Message != null && (tLRPC$Message.flags & 1073741824) != 0) {
            tLRPC$TL_messages_editMessage.quick_reply_shortcut_id = tLRPC$Message.quick_reply_shortcut_id;
            tLRPC$TL_messages_editMessage.flags |= 131072;
        }
        if (arrayList != null) {
            tLRPC$TL_messages_editMessage.entities = arrayList;
            tLRPC$TL_messages_editMessage.flags |= 8;
        }
        if (i != 0) {
            tLRPC$TL_messages_editMessage.schedule_date = i;
            tLRPC$TL_messages_editMessage.flags |= 32768;
        }
        return getConnectionsManager().sendRequest(tLRPC$TL_messages_editMessage, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                SendMessagesHelper.this.lambda$editMessage$16(baseFragment, tLRPC$TL_messages_editMessage, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$editMessage$16(final BaseFragment baseFragment, final TLRPC$TL_messages_editMessage tLRPC$TL_messages_editMessage, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            getMessagesController().processUpdates((TLRPC$Updates) tLObject, false);
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    SendMessagesHelper.this.lambda$editMessage$15(tLRPC$TL_error, baseFragment, tLRPC$TL_messages_editMessage);
                }
            });
        }
    }

    public void lambda$editMessage$15(TLRPC$TL_error tLRPC$TL_error, BaseFragment baseFragment, TLRPC$TL_messages_editMessage tLRPC$TL_messages_editMessage) {
        AlertsCreator.processError(this.currentAccount, tLRPC$TL_error, baseFragment, tLRPC$TL_messages_editMessage, new Object[0]);
    }

    public void sendLocation(Location location) {
        TLRPC$TL_messageMediaGeo tLRPC$TL_messageMediaGeo = new TLRPC$TL_messageMediaGeo();
        TLRPC$TL_geoPoint tLRPC$TL_geoPoint = new TLRPC$TL_geoPoint();
        tLRPC$TL_messageMediaGeo.geo = tLRPC$TL_geoPoint;
        tLRPC$TL_geoPoint.lat = AndroidUtilities.fixLocationCoord(location.getLatitude());
        tLRPC$TL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(location.getLongitude());
        Iterator<Map.Entry<String, MessageObject>> it = this.waitingForLocation.entrySet().iterator();
        while (it.hasNext()) {
            MessageObject value = it.next().getValue();
            sendMessage(SendMessageParams.of((TLRPC$MessageMedia) tLRPC$TL_messageMediaGeo, value.getDialogId(), value, (MessageObject) null, (TLRPC$ReplyMarkup) null, (HashMap<String, String>) null, true, 0));
        }
    }

    public void sendCurrentLocation(MessageObject messageObject, TLRPC$KeyboardButton tLRPC$KeyboardButton) {
        if (messageObject == null || tLRPC$KeyboardButton == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(messageObject.getDialogId());
        sb.append("_");
        sb.append(messageObject.getId());
        sb.append("_");
        sb.append(Utilities.bytesToHex(tLRPC$KeyboardButton.data));
        sb.append("_");
        sb.append(tLRPC$KeyboardButton instanceof TLRPC$TL_keyboardButtonGame ? "1" : "0");
        this.waitingForLocation.put(sb.toString(), messageObject);
        this.locationProvider.start();
    }

    public boolean isSendingCurrentLocation(MessageObject messageObject, TLRPC$KeyboardButton tLRPC$KeyboardButton) {
        if (messageObject == null || tLRPC$KeyboardButton == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(messageObject.getDialogId());
        sb.append("_");
        sb.append(messageObject.getId());
        sb.append("_");
        sb.append(Utilities.bytesToHex(tLRPC$KeyboardButton.data));
        sb.append("_");
        sb.append(tLRPC$KeyboardButton instanceof TLRPC$TL_keyboardButtonGame ? "1" : "0");
        return this.waitingForLocation.containsKey(sb.toString());
    }

    public void sendNotificationCallback(final long j, final int i, final byte[] bArr) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SendMessagesHelper.this.lambda$sendNotificationCallback$19(j, i, bArr);
            }
        });
    }

    public void lambda$sendNotificationCallback$19(long j, int i, byte[] bArr) {
        TLRPC$Chat chatSync;
        TLRPC$User userSync;
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
        TLRPC$TL_messages_getBotCallbackAnswer tLRPC$TL_messages_getBotCallbackAnswer = new TLRPC$TL_messages_getBotCallbackAnswer();
        tLRPC$TL_messages_getBotCallbackAnswer.peer = getMessagesController().getInputPeer(j);
        tLRPC$TL_messages_getBotCallbackAnswer.msg_id = i;
        tLRPC$TL_messages_getBotCallbackAnswer.game = false;
        if (bArr != null) {
            tLRPC$TL_messages_getBotCallbackAnswer.flags |= 1;
            tLRPC$TL_messages_getBotCallbackAnswer.data = bArr;
        }
        getConnectionsManager().sendRequest(tLRPC$TL_messages_getBotCallbackAnswer, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                SendMessagesHelper.this.lambda$sendNotificationCallback$18(str, list, tLObject, tLRPC$TL_error);
            }
        }, 2);
        getMessagesController().markDialogAsRead(j, i, i, 0, false, 0L, 0, true, 0);
    }

    public void lambda$sendNotificationCallback$18(final String str, final List list, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SendMessagesHelper.this.lambda$sendNotificationCallback$17(str, list);
            }
        });
    }

    public void lambda$sendNotificationCallback$17(String str, List list) {
        this.waitingForCallback.remove(str);
        list.remove(str);
    }

    public void onMessageEdited(TLRPC$Message tLRPC$Message) {
        if (tLRPC$Message == null || tLRPC$Message.reply_markup == null) {
            return;
        }
        List<String> remove = this.waitingForCallbackMap.remove(tLRPC$Message.dialog_id + "_" + tLRPC$Message.id);
        if (remove != null) {
            Iterator<String> it = remove.iterator();
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

    public int sendVote(final MessageObject messageObject, ArrayList<TLRPC$PollAnswer> arrayList, final Runnable runnable) {
        byte[] bArr;
        if (messageObject == null) {
            return 0;
        }
        final String str = "poll_" + messageObject.getPollId();
        if (this.waitingForCallback.containsKey(str)) {
            return 0;
        }
        TLRPC$TL_messages_sendVote tLRPC$TL_messages_sendVote = new TLRPC$TL_messages_sendVote();
        tLRPC$TL_messages_sendVote.msg_id = messageObject.getId();
        tLRPC$TL_messages_sendVote.peer = getMessagesController().getInputPeer(messageObject.getDialogId());
        if (arrayList != null) {
            bArr = new byte[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC$PollAnswer tLRPC$PollAnswer = arrayList.get(i);
                tLRPC$TL_messages_sendVote.options.add(tLRPC$PollAnswer.option);
                bArr[i] = tLRPC$PollAnswer.option[0];
            }
        } else {
            bArr = new byte[0];
        }
        this.waitingForVote.put(str, bArr);
        return getConnectionsManager().sendRequest(tLRPC$TL_messages_sendVote, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                SendMessagesHelper.this.lambda$sendVote$21(messageObject, str, runnable, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$sendVote$21(MessageObject messageObject, final String str, final Runnable runnable, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            this.voteSendTime.put(messageObject.getPollId(), 0L);
            getMessagesController().processUpdates((TLRPC$Updates) tLObject, false);
            this.voteSendTime.put(messageObject.getPollId(), Long.valueOf(SystemClock.elapsedRealtime()));
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SendMessagesHelper.this.lambda$sendVote$20(str, runnable);
            }
        });
    }

    public void lambda$sendVote$20(String str, Runnable runnable) {
        this.waitingForVote.remove(str);
        if (runnable != null) {
            runnable.run();
        }
    }

    public long getVoteSendTime(long j) {
        return this.voteSendTime.get(j, 0L).longValue();
    }

    public void sendReaction(MessageObject messageObject, ArrayList<ReactionsLayoutInBubble.VisibleReaction> arrayList, ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z, boolean z2, BaseFragment baseFragment, final Runnable runnable) {
        if (messageObject == null || baseFragment == null) {
            return;
        }
        TLRPC$TL_messages_sendReaction tLRPC$TL_messages_sendReaction = new TLRPC$TL_messages_sendReaction();
        TLRPC$Message tLRPC$Message = messageObject.messageOwner;
        if (tLRPC$Message.isThreadMessage && tLRPC$Message.fwd_from != null) {
            tLRPC$TL_messages_sendReaction.peer = getMessagesController().getInputPeer(messageObject.getFromChatId());
            tLRPC$TL_messages_sendReaction.msg_id = messageObject.messageOwner.fwd_from.saved_from_msg_id;
        } else {
            tLRPC$TL_messages_sendReaction.peer = getMessagesController().getInputPeer(messageObject.getDialogId());
            tLRPC$TL_messages_sendReaction.msg_id = messageObject.getId();
        }
        tLRPC$TL_messages_sendReaction.add_to_recent = z2;
        if (z2 && visibleReaction != null) {
            MediaDataController.getInstance(this.currentAccount).recentReactions.add(0, ReactionsUtils.toTLReaction(visibleReaction));
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i = 0; i < arrayList.size(); i++) {
                ReactionsLayoutInBubble.VisibleReaction visibleReaction2 = arrayList.get(i);
                if (visibleReaction2.documentId != 0) {
                    TLRPC$TL_reactionCustomEmoji tLRPC$TL_reactionCustomEmoji = new TLRPC$TL_reactionCustomEmoji();
                    tLRPC$TL_reactionCustomEmoji.document_id = visibleReaction2.documentId;
                    tLRPC$TL_messages_sendReaction.reaction.add(tLRPC$TL_reactionCustomEmoji);
                    tLRPC$TL_messages_sendReaction.flags |= 1;
                } else if (visibleReaction2.emojicon != null) {
                    TLRPC$TL_reactionEmoji tLRPC$TL_reactionEmoji = new TLRPC$TL_reactionEmoji();
                    tLRPC$TL_reactionEmoji.emoticon = visibleReaction2.emojicon;
                    tLRPC$TL_messages_sendReaction.reaction.add(tLRPC$TL_reactionEmoji);
                    tLRPC$TL_messages_sendReaction.flags |= 1;
                }
            }
        }
        if (z) {
            tLRPC$TL_messages_sendReaction.flags |= 2;
            tLRPC$TL_messages_sendReaction.big = true;
        }
        getConnectionsManager().sendRequest(tLRPC$TL_messages_sendReaction, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                SendMessagesHelper.this.lambda$sendReaction$22(runnable, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$sendReaction$22(Runnable runnable, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            getMessagesController().processUpdates((TLRPC$Updates) tLObject, false);
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
            }
        }
    }

    public void requestUrlAuth(final String str, final ChatActivity chatActivity, final boolean z) {
        final TLRPC$TL_messages_requestUrlAuth tLRPC$TL_messages_requestUrlAuth = new TLRPC$TL_messages_requestUrlAuth();
        tLRPC$TL_messages_requestUrlAuth.url = str;
        tLRPC$TL_messages_requestUrlAuth.flags |= 4;
        getConnectionsManager().sendRequest(tLRPC$TL_messages_requestUrlAuth, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                SendMessagesHelper.lambda$requestUrlAuth$24(ChatActivity.this, tLRPC$TL_messages_requestUrlAuth, str, z, tLObject, tLRPC$TL_error);
            }
        }, 2);
    }

    public static void lambda$requestUrlAuth$24(final ChatActivity chatActivity, final TLRPC$TL_messages_requestUrlAuth tLRPC$TL_messages_requestUrlAuth, final String str, final boolean z, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SendMessagesHelper.lambda$requestUrlAuth$23(TLObject.this, chatActivity, tLRPC$TL_messages_requestUrlAuth, str, z);
            }
        });
    }

    public static void lambda$requestUrlAuth$23(TLObject tLObject, ChatActivity chatActivity, TLRPC$TL_messages_requestUrlAuth tLRPC$TL_messages_requestUrlAuth, String str, boolean z) {
        if (tLObject != null) {
            if (tLObject instanceof TLRPC$TL_urlAuthResultRequest) {
                chatActivity.showRequestUrlAlert((TLRPC$TL_urlAuthResultRequest) tLObject, tLRPC$TL_messages_requestUrlAuth, str, z);
                return;
            } else if (tLObject instanceof TLRPC$TL_urlAuthResultAccepted) {
                AlertsCreator.showOpenUrlAlert(chatActivity, ((TLRPC$TL_urlAuthResultAccepted) tLObject).url, false, false);
                return;
            } else {
                if (tLObject instanceof TLRPC$TL_urlAuthResultDefault) {
                    AlertsCreator.showOpenUrlAlert(chatActivity, str, false, z);
                    return;
                }
                return;
            }
        }
        AlertsCreator.showOpenUrlAlert(chatActivity, str, false, z);
    }

    public void sendCallback(boolean z, MessageObject messageObject, TLRPC$KeyboardButton tLRPC$KeyboardButton, ChatActivity chatActivity) {
        lambda$sendCallback$27(z, messageObject, tLRPC$KeyboardButton, null, null, chatActivity);
    }

    public void lambda$sendCallback$27(final boolean r21, final org.telegram.messenger.MessageObject r22, final org.telegram.tgnet.TLRPC$KeyboardButton r23, final org.telegram.tgnet.TLRPC$InputCheckPasswordSRP r24, final org.telegram.ui.TwoStepVerificationActivity r25, final org.telegram.ui.ChatActivity r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.lambda$sendCallback$27(boolean, org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$KeyboardButton, org.telegram.tgnet.TLRPC$InputCheckPasswordSRP, org.telegram.ui.TwoStepVerificationActivity, org.telegram.ui.ChatActivity):void");
    }

    public void lambda$sendCallback$33(final String str, final List list, final boolean z, final MessageObject messageObject, final TLRPC$KeyboardButton tLRPC$KeyboardButton, final ChatActivity chatActivity, final TwoStepVerificationActivity twoStepVerificationActivity, final TLObject[] tLObjectArr, final TLRPC$InputCheckPasswordSRP tLRPC$InputCheckPasswordSRP, final boolean z2, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SendMessagesHelper.this.lambda$sendCallback$32(str, list, z, tLObject, messageObject, tLRPC$KeyboardButton, chatActivity, twoStepVerificationActivity, tLObjectArr, tLRPC$TL_error, tLRPC$InputCheckPasswordSRP, z2);
            }
        });
    }

    public void lambda$sendCallback$32(final String str, final List list, boolean z, TLObject tLObject, final MessageObject messageObject, final TLRPC$KeyboardButton tLRPC$KeyboardButton, final ChatActivity chatActivity, final TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC$TL_error tLRPC$TL_error, TLRPC$InputCheckPasswordSRP tLRPC$InputCheckPasswordSRP, final boolean z2) {
        String str2;
        this.waitingForCallback.remove(str);
        list.remove(str);
        boolean z3 = false;
        if (z && tLObject == null) {
            sendCallback(false, messageObject, tLRPC$KeyboardButton, chatActivity);
            return;
        }
        if (tLObject != null) {
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.needHideProgress();
                twoStepVerificationActivity.lambda$onBackPressed$306();
            }
            long fromChatId = messageObject.getFromChatId();
            long j = messageObject.messageOwner.via_bot_id;
            if (j != 0) {
                fromChatId = j;
            }
            if (fromChatId > 0) {
                TLRPC$User user = getMessagesController().getUser(Long.valueOf(fromChatId));
                if (user != null) {
                    str2 = ContactsController.formatName(user.first_name, user.last_name);
                }
                str2 = null;
            } else {
                TLRPC$Chat chat = getMessagesController().getChat(Long.valueOf(-fromChatId));
                if (chat != null) {
                    str2 = chat.title;
                }
                str2 = null;
            }
            if (str2 == null) {
                str2 = "bot";
            }
            if (tLRPC$KeyboardButton instanceof TLRPC$TL_keyboardButtonUrlAuth) {
                if (tLObject instanceof TLRPC$TL_urlAuthResultRequest) {
                    chatActivity.showRequestUrlAlert((TLRPC$TL_urlAuthResultRequest) tLObject, (TLRPC$TL_messages_requestUrlAuth) tLObjectArr[0], tLRPC$KeyboardButton.url, false);
                    return;
                }
                if (tLObject instanceof TLRPC$TL_urlAuthResultAccepted) {
                    AlertsCreator.showOpenUrlAlert(chatActivity, ((TLRPC$TL_urlAuthResultAccepted) tLObject).url, false, false);
                    return;
                } else {
                    if (tLObject instanceof TLRPC$TL_urlAuthResultDefault) {
                        AlertsCreator.showOpenUrlAlert(chatActivity, tLRPC$KeyboardButton.url, false, true);
                        return;
                    }
                    return;
                }
            }
            if (tLRPC$KeyboardButton instanceof TLRPC$TL_keyboardButtonBuy) {
                if (tLObject instanceof TLRPC$TL_payments_paymentFormStars) {
                    StarsController.getInstance(this.currentAccount).openPaymentForm(messageObject, ((TLRPC$TL_payments_getPaymentForm) tLObjectArr[0]).invoice, (TLRPC$TL_payments_paymentFormStars) tLObject, new Runnable() {
                        @Override
                        public final void run() {
                            SendMessagesHelper.this.lambda$sendCallback$25(str, list);
                        }
                    }, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            SendMessagesHelper.lambda$sendCallback$26((String) obj);
                        }
                    });
                    return;
                }
                if (tLObject instanceof TLRPC$PaymentForm) {
                    TLRPC$PaymentForm tLRPC$PaymentForm = (TLRPC$PaymentForm) tLObject;
                    getMessagesController().putUsers(tLRPC$PaymentForm.users, false);
                    chatActivity.presentFragment(new PaymentFormActivity(tLRPC$PaymentForm, messageObject, chatActivity));
                    return;
                } else {
                    if (tLObject instanceof TLRPC$TL_payments_paymentReceiptStars) {
                        Context context = LaunchActivity.instance;
                        if (context == null) {
                            context = ApplicationLoader.applicationContext;
                        }
                        StarsIntroActivity.showTransactionSheet(context, false, this.currentAccount, (TLRPC$TL_payments_paymentReceiptStars) tLObject, (Theme.ResourcesProvider) null);
                        return;
                    }
                    if (tLObject instanceof TLRPC$PaymentReceipt) {
                        chatActivity.presentFragment(new PaymentFormActivity((TLRPC$PaymentReceipt) tLObject));
                        return;
                    }
                    return;
                }
            }
            TLRPC$TL_messages_botCallbackAnswer tLRPC$TL_messages_botCallbackAnswer = (TLRPC$TL_messages_botCallbackAnswer) tLObject;
            if (!z && tLRPC$TL_messages_botCallbackAnswer.cache_time != 0 && !tLRPC$KeyboardButton.requires_password) {
                getMessagesStorage().saveBotCache(str, tLRPC$TL_messages_botCallbackAnswer);
            }
            String str3 = tLRPC$TL_messages_botCallbackAnswer.message;
            if (str3 != null) {
                if (tLRPC$TL_messages_botCallbackAnswer.alert) {
                    if (chatActivity.getParentActivity() == null) {
                        return;
                    }
                    AlertDialog.Builder builder = new AlertDialog.Builder(chatActivity.getParentActivity());
                    builder.setTitle(str2);
                    builder.setPositiveButton(LocaleController.getString("OK", R.string.OK), null);
                    builder.setMessage(tLRPC$TL_messages_botCallbackAnswer.message);
                    chatActivity.showDialog(builder.create());
                    return;
                }
                chatActivity.showAlert(str2, str3);
                return;
            }
            if (tLRPC$TL_messages_botCallbackAnswer.url == null || chatActivity.getParentActivity() == null) {
                return;
            }
            TLRPC$User user2 = getMessagesController().getUser(Long.valueOf(fromChatId));
            boolean z4 = user2 != null && user2.verified;
            if (tLRPC$KeyboardButton instanceof TLRPC$TL_keyboardButtonGame) {
                TLRPC$MessageMedia tLRPC$MessageMedia = messageObject.messageOwner.media;
                TLRPC$TL_game tLRPC$TL_game = tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaGame ? tLRPC$MessageMedia.game : null;
                if (tLRPC$TL_game == null) {
                    return;
                }
                String str4 = tLRPC$TL_messages_botCallbackAnswer.url;
                if (!z4) {
                    if (MessagesController.getNotificationsSettings(this.currentAccount).getBoolean("askgame_" + fromChatId, true)) {
                        z3 = true;
                    }
                }
                chatActivity.showOpenGameAlert(tLRPC$TL_game, messageObject, str4, z3, fromChatId);
                return;
            }
            AlertsCreator.showOpenUrlAlert(chatActivity, tLRPC$TL_messages_botCallbackAnswer.url, false, false);
            return;
        }
        if (tLRPC$TL_error == null || chatActivity.getParentActivity() == null) {
            return;
        }
        if ("PASSWORD_HASH_INVALID".equals(tLRPC$TL_error.text)) {
            if (tLRPC$InputCheckPasswordSRP == null) {
                AlertDialog.Builder builder2 = new AlertDialog.Builder(chatActivity.getParentActivity());
                builder2.setTitle(LocaleController.getString("BotOwnershipTransfer", R.string.BotOwnershipTransfer));
                builder2.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("BotOwnershipTransferReadyAlertText", R.string.BotOwnershipTransferReadyAlertText, new Object[0])));
                builder2.setPositiveButton(LocaleController.getString("BotOwnershipTransferChangeOwner", R.string.BotOwnershipTransferChangeOwner), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        SendMessagesHelper.this.lambda$sendCallback$28(z2, messageObject, tLRPC$KeyboardButton, chatActivity, dialogInterface, i);
                    }
                });
                builder2.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                chatActivity.showDialog(builder2.create());
                return;
            }
            return;
        }
        if ("PASSWORD_MISSING".equals(tLRPC$TL_error.text) || tLRPC$TL_error.text.startsWith("PASSWORD_TOO_FRESH_") || tLRPC$TL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.needHideProgress();
            }
            AlertDialog.Builder builder3 = new AlertDialog.Builder(chatActivity.getParentActivity());
            builder3.setTitle(LocaleController.getString("EditAdminTransferAlertTitle", R.string.EditAdminTransferAlertTitle));
            LinearLayout linearLayout = new LinearLayout(chatActivity.getParentActivity());
            linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
            linearLayout.setOrientation(1);
            builder3.setView(linearLayout);
            TextView textView = new TextView(chatActivity.getParentActivity());
            int i = Theme.key_dialogTextBlack;
            textView.setTextColor(Theme.getColor(i));
            textView.setTextSize(1, 16.0f);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BotOwnershipTransferAlertText", R.string.BotOwnershipTransferAlertText, new Object[0])));
            linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2));
            LinearLayout linearLayout2 = new LinearLayout(chatActivity.getParentActivity());
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 0.0f, 11.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(chatActivity.getParentActivity());
            int i2 = R.drawable.list_circle;
            imageView.setImageResource(i2);
            imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i), PorterDuff.Mode.MULTIPLY));
            TextView textView2 = new TextView(chatActivity.getParentActivity());
            textView2.setTextColor(Theme.getColor(i));
            textView2.setTextSize(1, 16.0f);
            textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString("EditAdminTransferAlertText1", R.string.EditAdminTransferAlertText1)));
            if (LocaleController.isRTL) {
                linearLayout2.addView(textView2, LayoutHelper.createLinear(-1, -2));
                linearLayout2.addView(imageView, LayoutHelper.createLinear(-2, -2, 5));
            } else {
                linearLayout2.addView(imageView, LayoutHelper.createLinear(-2, -2));
                linearLayout2.addView(textView2, LayoutHelper.createLinear(-1, -2));
            }
            LinearLayout linearLayout3 = new LinearLayout(chatActivity.getParentActivity());
            linearLayout3.setOrientation(0);
            linearLayout.addView(linearLayout3, LayoutHelper.createLinear(-1, -2, 0.0f, 11.0f, 0.0f, 0.0f));
            ImageView imageView2 = new ImageView(chatActivity.getParentActivity());
            imageView2.setImageResource(i2);
            imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
            imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i), PorterDuff.Mode.MULTIPLY));
            TextView textView3 = new TextView(chatActivity.getParentActivity());
            textView3.setTextColor(Theme.getColor(i));
            textView3.setTextSize(1, 16.0f);
            textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            textView3.setText(AndroidUtilities.replaceTags(LocaleController.getString("EditAdminTransferAlertText2", R.string.EditAdminTransferAlertText2)));
            if (LocaleController.isRTL) {
                linearLayout3.addView(textView3, LayoutHelper.createLinear(-1, -2));
                linearLayout3.addView(imageView2, LayoutHelper.createLinear(-2, -2, 5));
            } else {
                linearLayout3.addView(imageView2, LayoutHelper.createLinear(-2, -2));
                linearLayout3.addView(textView3, LayoutHelper.createLinear(-1, -2));
            }
            if ("PASSWORD_MISSING".equals(tLRPC$TL_error.text)) {
                builder3.setPositiveButton(LocaleController.getString("EditAdminTransferSetPassword", R.string.EditAdminTransferSetPassword), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        SendMessagesHelper.lambda$sendCallback$29(ChatActivity.this, dialogInterface, i3);
                    }
                });
                builder3.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
            } else {
                TextView textView4 = new TextView(chatActivity.getParentActivity());
                textView4.setTextColor(Theme.getColor(i));
                textView4.setTextSize(1, 16.0f);
                textView4.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                textView4.setText(LocaleController.getString("EditAdminTransferAlertText3", R.string.EditAdminTransferAlertText3));
                linearLayout.addView(textView4, LayoutHelper.createLinear(-1, -2, 0.0f, 11.0f, 0.0f, 0.0f));
                builder3.setNegativeButton(LocaleController.getString("OK", R.string.OK), null);
            }
            chatActivity.showDialog(builder3.create());
            return;
        }
        if ("SRP_ID_INVALID".equals(tLRPC$TL_error.text)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC$TL_account_getPassword(), new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error2) {
                    SendMessagesHelper.this.lambda$sendCallback$31(twoStepVerificationActivity, z2, messageObject, tLRPC$KeyboardButton, chatActivity, tLObject2, tLRPC$TL_error2);
                }
            }, 8);
        } else if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.needHideProgress();
            twoStepVerificationActivity.lambda$onBackPressed$306();
        }
    }

    public void lambda$sendCallback$25(String str, List list) {
        this.waitingForCallback.remove(str);
        list.remove(str);
    }

    public void lambda$sendCallback$28(final boolean z, final MessageObject messageObject, final TLRPC$KeyboardButton tLRPC$KeyboardButton, final ChatActivity chatActivity, DialogInterface dialogInterface, int i) {
        final TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        twoStepVerificationActivity.setDelegate(0, new TwoStepVerificationActivity.TwoStepVerificationActivityDelegate() {
            @Override
            public final void didEnterPassword(TLRPC$InputCheckPasswordSRP tLRPC$InputCheckPasswordSRP) {
                SendMessagesHelper.this.lambda$sendCallback$27(z, messageObject, tLRPC$KeyboardButton, twoStepVerificationActivity, chatActivity, tLRPC$InputCheckPasswordSRP);
            }
        });
        chatActivity.presentFragment(twoStepVerificationActivity);
    }

    public static void lambda$sendCallback$29(ChatActivity chatActivity, DialogInterface dialogInterface, int i) {
        chatActivity.presentFragment(new TwoStepVerificationSetupActivity(6, null));
    }

    public void lambda$sendCallback$31(final TwoStepVerificationActivity twoStepVerificationActivity, final boolean z, final MessageObject messageObject, final TLRPC$KeyboardButton tLRPC$KeyboardButton, final ChatActivity chatActivity, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SendMessagesHelper.this.lambda$sendCallback$30(tLRPC$TL_error, tLObject, twoStepVerificationActivity, z, messageObject, tLRPC$KeyboardButton, chatActivity);
            }
        });
    }

    public void lambda$sendCallback$30(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z, MessageObject messageObject, TLRPC$KeyboardButton tLRPC$KeyboardButton, ChatActivity chatActivity) {
        if (tLRPC$TL_error == null) {
            TLRPC$account_Password tLRPC$account_Password = (TLRPC$account_Password) tLObject;
            twoStepVerificationActivity.setCurrentPasswordInfo(null, tLRPC$account_Password);
            TwoStepVerificationActivity.initPasswordNewAlgo(tLRPC$account_Password);
            lambda$sendCallback$27(z, messageObject, tLRPC$KeyboardButton, twoStepVerificationActivity.getNewSrpPassword(), twoStepVerificationActivity, chatActivity);
        }
    }

    public boolean isSendingCallback(MessageObject messageObject, TLRPC$KeyboardButton tLRPC$KeyboardButton) {
        int i = 0;
        if (messageObject == null || tLRPC$KeyboardButton == null) {
            return false;
        }
        if (tLRPC$KeyboardButton instanceof TLRPC$TL_keyboardButtonUrlAuth) {
            i = 3;
        } else if (tLRPC$KeyboardButton instanceof TLRPC$TL_keyboardButtonGame) {
            i = 1;
        } else if (tLRPC$KeyboardButton instanceof TLRPC$TL_keyboardButtonBuy) {
            i = 2;
        }
        return this.waitingForCallback.containsKey(messageObject.getDialogId() + "_" + messageObject.getId() + "_" + Utilities.bytesToHex(tLRPC$KeyboardButton.data) + "_" + i);
    }

    public void sendGame(TLRPC$InputPeer tLRPC$InputPeer, TLRPC$TL_inputMediaGame tLRPC$TL_inputMediaGame, long j, final long j2) {
        NativeByteBuffer nativeByteBuffer;
        if (tLRPC$InputPeer == null || tLRPC$TL_inputMediaGame == null) {
            return;
        }
        TLRPC$TL_messages_sendMedia tLRPC$TL_messages_sendMedia = new TLRPC$TL_messages_sendMedia();
        tLRPC$TL_messages_sendMedia.peer = tLRPC$InputPeer;
        if (tLRPC$InputPeer instanceof TLRPC$TL_inputPeerChannel) {
            tLRPC$TL_messages_sendMedia.silent = MessagesController.getNotificationsSettings(this.currentAccount).getBoolean("silent_" + (-tLRPC$InputPeer.channel_id), false);
        } else if (tLRPC$InputPeer instanceof TLRPC$TL_inputPeerChat) {
            tLRPC$TL_messages_sendMedia.silent = MessagesController.getNotificationsSettings(this.currentAccount).getBoolean("silent_" + (-tLRPC$InputPeer.chat_id), false);
        } else {
            tLRPC$TL_messages_sendMedia.silent = MessagesController.getNotificationsSettings(this.currentAccount).getBoolean("silent_" + tLRPC$InputPeer.user_id, false);
        }
        tLRPC$TL_messages_sendMedia.random_id = j != 0 ? j : getNextRandomId();
        tLRPC$TL_messages_sendMedia.message = "";
        tLRPC$TL_messages_sendMedia.media = tLRPC$TL_inputMediaGame;
        long sendAsPeerId = ChatObject.getSendAsPeerId(getMessagesController().getChat(Long.valueOf(tLRPC$InputPeer.chat_id)), getMessagesController().getChatFull(tLRPC$InputPeer.chat_id));
        if (sendAsPeerId != UserConfig.getInstance(this.currentAccount).getClientUserId()) {
            tLRPC$TL_messages_sendMedia.send_as = getMessagesController().getInputPeer(sendAsPeerId);
        }
        if (j2 == 0) {
            NativeByteBuffer nativeByteBuffer2 = null;
            try {
                nativeByteBuffer = new NativeByteBuffer(tLRPC$InputPeer.getObjectSize() + tLRPC$TL_inputMediaGame.getObjectSize() + 4 + 8);
                try {
                    nativeByteBuffer.writeInt32(3);
                    nativeByteBuffer.writeInt64(j);
                    tLRPC$InputPeer.serializeToStream(nativeByteBuffer);
                    tLRPC$TL_inputMediaGame.serializeToStream(nativeByteBuffer);
                } catch (Exception e) {
                    e = e;
                    nativeByteBuffer2 = nativeByteBuffer;
                    FileLog.e(e);
                    nativeByteBuffer = nativeByteBuffer2;
                    j2 = getMessagesStorage().createPendingTask(nativeByteBuffer);
                    getConnectionsManager().sendRequest(tLRPC$TL_messages_sendMedia, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            SendMessagesHelper.this.lambda$sendGame$34(j2, tLObject, tLRPC$TL_error);
                        }
                    });
                }
            } catch (Exception e2) {
                e = e2;
            }
            j2 = getMessagesStorage().createPendingTask(nativeByteBuffer);
        }
        getConnectionsManager().sendRequest(tLRPC$TL_messages_sendMedia, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                SendMessagesHelper.this.lambda$sendGame$34(j2, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$sendGame$34(long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            getMessagesController().processUpdates((TLRPC$Updates) tLObject, false);
        }
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
    }

    public void sendMessage(org.telegram.messenger.SendMessagesHelper.SendMessageParams r87) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.sendMessage(org.telegram.messenger.SendMessagesHelper$SendMessageParams):void");
    }

    private void performSendDelayedMessage(DelayedMessage delayedMessage) {
        performSendDelayedMessage(delayedMessage, -1);
    }

    private TLRPC$PhotoSize getThumbForSecretChat(ArrayList<TLRPC$PhotoSize> arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                TLRPC$PhotoSize tLRPC$PhotoSize = arrayList.get(i);
                if (tLRPC$PhotoSize != null && !(tLRPC$PhotoSize instanceof TLRPC$TL_photoPathSize) && !(tLRPC$PhotoSize instanceof TLRPC$TL_photoSizeEmpty) && tLRPC$PhotoSize.location != null) {
                    if (tLRPC$PhotoSize instanceof TLRPC$TL_photoStrippedSize) {
                        return tLRPC$PhotoSize;
                    }
                    TLRPC$TL_photoSize_layer127 tLRPC$TL_photoSize_layer127 = new TLRPC$TL_photoSize_layer127();
                    tLRPC$TL_photoSize_layer127.type = tLRPC$PhotoSize.type;
                    tLRPC$TL_photoSize_layer127.w = tLRPC$PhotoSize.w;
                    tLRPC$TL_photoSize_layer127.h = tLRPC$PhotoSize.h;
                    tLRPC$TL_photoSize_layer127.size = tLRPC$PhotoSize.size;
                    byte[] bArr = tLRPC$PhotoSize.bytes;
                    tLRPC$TL_photoSize_layer127.bytes = bArr;
                    if (bArr == null) {
                        tLRPC$TL_photoSize_layer127.bytes = new byte[0];
                    }
                    TLRPC$TL_fileLocation_layer82 tLRPC$TL_fileLocation_layer82 = new TLRPC$TL_fileLocation_layer82();
                    tLRPC$TL_photoSize_layer127.location = tLRPC$TL_fileLocation_layer82;
                    TLRPC$FileLocation tLRPC$FileLocation = tLRPC$PhotoSize.location;
                    tLRPC$TL_fileLocation_layer82.dc_id = tLRPC$FileLocation.dc_id;
                    tLRPC$TL_fileLocation_layer82.volume_id = tLRPC$FileLocation.volume_id;
                    tLRPC$TL_fileLocation_layer82.local_id = tLRPC$FileLocation.local_id;
                    tLRPC$TL_fileLocation_layer82.secret = tLRPC$FileLocation.secret;
                    return tLRPC$TL_photoSize_layer127;
                }
            }
        }
        return null;
    }

    private void performSendDelayedMessage(final DelayedMessage delayedMessage, int i) {
        boolean z;
        TLRPC$InputEncryptedFile tLRPC$InputEncryptedFile;
        boolean z2;
        String str;
        TLRPC$InputMedia tLRPC$InputMedia;
        TLRPC$InputMedia tLRPC$InputMedia2;
        TLRPC$PhotoSize tLRPC$PhotoSize;
        TLRPC$InputMedia tLRPC$InputMedia3;
        VideoEditedInfo videoEditedInfo;
        TLRPC$InputMedia tLRPC$InputMedia4;
        int i2 = delayedMessage.type;
        if (i2 == 0) {
            String str2 = delayedMessage.httpLocation;
            if (str2 != null) {
                putToDelayedMessages(str2, delayedMessage);
                ImageLoader.getInstance().loadHttpFile(delayedMessage.httpLocation, "file", this.currentAccount);
                return;
            }
            if (delayedMessage.sendRequest != null) {
                String file = FileLoader.getInstance(this.currentAccount).getPathToAttach(delayedMessage.photoSize).toString();
                putToDelayedMessages(file, delayedMessage);
                getFileLoader().uploadFile(file, false, true, 16777216);
                putToUploadingMessages(delayedMessage.obj);
                return;
            }
            String file2 = FileLoader.getInstance(this.currentAccount).getPathToAttach(delayedMessage.photoSize).toString();
            if (delayedMessage.sendEncryptedRequest != null && delayedMessage.photoSize.location.dc_id != 0) {
                File file3 = new File(file2);
                if (!file3.exists()) {
                    file2 = FileLoader.getInstance(this.currentAccount).getPathToAttach(delayedMessage.photoSize, true).toString();
                    file3 = new File(file2);
                }
                if (!file3.exists()) {
                    putToDelayedMessages(FileLoader.getAttachFileName(delayedMessage.photoSize), delayedMessage);
                    getFileLoader().loadFile(ImageLocation.getForObject(delayedMessage.photoSize, delayedMessage.locationParent), delayedMessage.parentObject, "jpg", 3, 0);
                    return;
                }
            }
            putToDelayedMessages(file2, delayedMessage);
            getFileLoader().uploadFile(file2, true, true, 16777216);
            putToUploadingMessages(delayedMessage.obj);
            return;
        }
        if (i2 == 1) {
            VideoEditedInfo videoEditedInfo2 = delayedMessage.videoEditedInfo;
            if (videoEditedInfo2 != null && videoEditedInfo2.needConvert()) {
                MessageObject messageObject = delayedMessage.obj;
                String str3 = messageObject.messageOwner.attachPath;
                TLRPC$Document document = messageObject.getDocument();
                if (str3 == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(FileLoader.getDirectory(4));
                    sb.append("/");
                    sb.append(document.id);
                    sb.append(".");
                    sb.append(delayedMessage.videoEditedInfo.isSticker ? "webm" : "mp4");
                    str3 = sb.toString();
                }
                putToDelayedMessages(str3, delayedMessage);
                if (!delayedMessage.videoEditedInfo.alreadyScheduledConverting) {
                    MediaController.getInstance().scheduleVideoConvert(delayedMessage.obj);
                }
                putToUploadingMessages(delayedMessage.obj);
                return;
            }
            VideoEditedInfo videoEditedInfo3 = delayedMessage.videoEditedInfo;
            if (videoEditedInfo3 != null) {
                TLRPC$InputFile tLRPC$InputFile = videoEditedInfo3.file;
                if (tLRPC$InputFile != null) {
                    TLObject tLObject = delayedMessage.sendRequest;
                    if (tLObject instanceof TLRPC$TL_messages_sendMedia) {
                        tLRPC$InputMedia4 = ((TLRPC$TL_messages_sendMedia) tLObject).media;
                    } else {
                        tLRPC$InputMedia4 = ((TLRPC$TL_messages_editMessage) tLObject).media;
                    }
                    tLRPC$InputMedia4.file = tLRPC$InputFile;
                    videoEditedInfo3.file = null;
                } else if (videoEditedInfo3.encryptedFile != null) {
                    TLRPC$TL_decryptedMessage tLRPC$TL_decryptedMessage = (TLRPC$TL_decryptedMessage) delayedMessage.sendEncryptedRequest;
                    TLRPC$DecryptedMessageMedia tLRPC$DecryptedMessageMedia = tLRPC$TL_decryptedMessage.media;
                    tLRPC$DecryptedMessageMedia.size = videoEditedInfo3.estimatedSize;
                    tLRPC$DecryptedMessageMedia.key = videoEditedInfo3.key;
                    tLRPC$DecryptedMessageMedia.iv = videoEditedInfo3.iv;
                    SecretChatHelper secretChatHelper = getSecretChatHelper();
                    MessageObject messageObject2 = delayedMessage.obj;
                    secretChatHelper.performSendEncryptedRequest(tLRPC$TL_decryptedMessage, messageObject2.messageOwner, delayedMessage.encryptedChat, delayedMessage.videoEditedInfo.encryptedFile, delayedMessage.originalPath, messageObject2);
                    delayedMessage.videoEditedInfo.encryptedFile = null;
                    return;
                }
            }
            TLObject tLObject2 = delayedMessage.sendRequest;
            if (tLObject2 != null) {
                if (tLObject2 instanceof TLRPC$TL_messages_sendMedia) {
                    tLRPC$InputMedia3 = ((TLRPC$TL_messages_sendMedia) tLObject2).media;
                } else {
                    tLRPC$InputMedia3 = ((TLRPC$TL_messages_editMessage) tLObject2).media;
                }
                if (tLRPC$InputMedia3 instanceof TLRPC$TL_inputMediaPaidMedia) {
                    TLRPC$TL_inputMediaPaidMedia tLRPC$TL_inputMediaPaidMedia = (TLRPC$TL_inputMediaPaidMedia) tLRPC$InputMedia3;
                    if (!tLRPC$TL_inputMediaPaidMedia.extended_media.isEmpty()) {
                        tLRPC$InputMedia3 = tLRPC$TL_inputMediaPaidMedia.extended_media.get(0);
                    }
                }
                if (tLRPC$InputMedia3.file == null) {
                    MessageObject messageObject3 = delayedMessage.obj;
                    String str4 = messageObject3.messageOwner.attachPath;
                    TLRPC$Document document2 = messageObject3.getDocument();
                    if (str4 == null) {
                        str4 = FileLoader.getDirectory(4) + "/" + document2.id + ".mp4";
                    }
                    String str5 = str4;
                    putToDelayedMessages(str5, delayedMessage);
                    VideoEditedInfo videoEditedInfo4 = delayedMessage.obj.videoEditedInfo;
                    if (videoEditedInfo4 == null || !videoEditedInfo4.notReadyYet) {
                        if (videoEditedInfo4 != null && videoEditedInfo4.needConvert()) {
                            getFileLoader().uploadFile(str5, false, false, document2.size, 33554432, false);
                        } else {
                            getFileLoader().uploadFile(str5, false, false, 33554432);
                        }
                    }
                    putToUploadingMessages(delayedMessage.obj);
                    return;
                }
                MessageObject messageObject4 = delayedMessage.obj;
                String str6 = FileLoader.getDirectory(4) + "/" + delayedMessage.photoSize.location.volume_id + "_" + delayedMessage.photoSize.location.local_id + "." + ((messageObject4 == null || (videoEditedInfo = messageObject4.videoEditedInfo) == null || !videoEditedInfo.isSticker) ? "jpg" : "webp");
                putToDelayedMessages(str6, delayedMessage);
                getFileLoader().uploadFile(str6, false, true, 16777216);
                putToUploadingMessages(delayedMessage.obj);
                return;
            }
            MessageObject messageObject5 = delayedMessage.obj;
            String str7 = messageObject5.messageOwner.attachPath;
            TLRPC$Document document3 = messageObject5.getDocument();
            if (str7 == null) {
                str7 = FileLoader.getDirectory(4) + "/" + document3.id + ".mp4";
            }
            if (delayedMessage.sendEncryptedRequest != null && document3.dc_id != 0) {
                File file4 = new File(str7);
                if (!file4.exists() && (file4 = getFileLoader().getPathToMessage(delayedMessage.obj.messageOwner)) != null && file4.exists()) {
                    TLRPC$Message tLRPC$Message = delayedMessage.obj.messageOwner;
                    String absolutePath = file4.getAbsolutePath();
                    tLRPC$Message.attachPath = absolutePath;
                    delayedMessage.obj.attachPathExists = true;
                    str7 = absolutePath;
                }
                if ((file4 == null || (!file4.exists() && delayedMessage.obj.getDocument() != null)) && (file4 = getFileLoader().getPathToAttach(delayedMessage.obj.getDocument(), false)) != null && file4.exists()) {
                    TLRPC$Message tLRPC$Message2 = delayedMessage.obj.messageOwner;
                    String absolutePath2 = file4.getAbsolutePath();
                    tLRPC$Message2.attachPath = absolutePath2;
                    delayedMessage.obj.attachPathExists = true;
                    str7 = absolutePath2;
                }
                if (file4 == null || !file4.exists()) {
                    putToDelayedMessages(FileLoader.getAttachFileName(document3), delayedMessage);
                    getFileLoader().loadFile(document3, delayedMessage.parentObject, 3, 0);
                    return;
                }
            }
            String str8 = str7;
            putToDelayedMessages(str8, delayedMessage);
            VideoEditedInfo videoEditedInfo5 = delayedMessage.obj.videoEditedInfo;
            if (videoEditedInfo5 == null || !videoEditedInfo5.notReadyYet) {
                if (videoEditedInfo5 != null && videoEditedInfo5.needConvert()) {
                    getFileLoader().uploadFile(str8, true, false, document3.size, 33554432, false);
                } else {
                    getFileLoader().uploadFile(str8, true, false, 33554432);
                }
            }
            putToUploadingMessages(delayedMessage.obj);
            return;
        }
        if (i2 == 2) {
            String str9 = delayedMessage.httpLocation;
            if (str9 != null) {
                putToDelayedMessages(str9, delayedMessage);
                ImageLoader.getInstance().loadHttpFile(delayedMessage.httpLocation, "gif", this.currentAccount);
                return;
            }
            TLObject tLObject3 = delayedMessage.sendRequest;
            if (tLObject3 != null) {
                if (tLObject3 instanceof TLRPC$TL_messages_sendMedia) {
                    tLRPC$InputMedia2 = ((TLRPC$TL_messages_sendMedia) tLObject3).media;
                } else {
                    tLRPC$InputMedia2 = ((TLRPC$TL_messages_editMessage) tLObject3).media;
                }
                if (tLRPC$InputMedia2.file == null) {
                    String str10 = delayedMessage.obj.messageOwner.attachPath;
                    putToDelayedMessages(str10, delayedMessage);
                    getFileLoader().uploadFile(str10, delayedMessage.sendRequest == null, false, 67108864);
                    putToUploadingMessages(delayedMessage.obj);
                    return;
                }
                if (tLRPC$InputMedia2.thumb != null || (tLRPC$PhotoSize = delayedMessage.photoSize) == null || (tLRPC$PhotoSize instanceof TLRPC$TL_photoStrippedSize)) {
                    return;
                }
                String str11 = FileLoader.getDirectory(4) + "/" + delayedMessage.photoSize.location.volume_id + "_" + delayedMessage.photoSize.location.local_id + ".jpg";
                putToDelayedMessages(str11, delayedMessage);
                getFileLoader().uploadFile(str11, false, true, 16777216);
                putToUploadingMessages(delayedMessage.obj);
                return;
            }
            MessageObject messageObject6 = delayedMessage.obj;
            String str12 = messageObject6.messageOwner.attachPath;
            TLRPC$Document document4 = messageObject6.getDocument();
            if (delayedMessage.sendEncryptedRequest != null && document4.dc_id != 0) {
                File file5 = new File(str12);
                if (!file5.exists() && (file5 = getFileLoader().getPathToMessage(delayedMessage.obj.messageOwner)) != null && file5.exists()) {
                    TLRPC$Message tLRPC$Message3 = delayedMessage.obj.messageOwner;
                    String absolutePath3 = file5.getAbsolutePath();
                    tLRPC$Message3.attachPath = absolutePath3;
                    delayedMessage.obj.attachPathExists = true;
                    str12 = absolutePath3;
                }
                if ((file5 == null || (!file5.exists() && delayedMessage.obj.getDocument() != null)) && (file5 = getFileLoader().getPathToAttach(delayedMessage.obj.getDocument(), false)) != null && file5.exists()) {
                    TLRPC$Message tLRPC$Message4 = delayedMessage.obj.messageOwner;
                    String absolutePath4 = file5.getAbsolutePath();
                    tLRPC$Message4.attachPath = absolutePath4;
                    delayedMessage.obj.attachPathExists = true;
                    str12 = absolutePath4;
                }
                if (file5 == null || !file5.exists()) {
                    putToDelayedMessages(FileLoader.getAttachFileName(document4), delayedMessage);
                    getFileLoader().loadFile(document4, delayedMessage.parentObject, 3, 0);
                    return;
                }
            }
            putToDelayedMessages(str12, delayedMessage);
            getFileLoader().uploadFile(str12, true, false, 67108864);
            putToUploadingMessages(delayedMessage.obj);
            return;
        }
        if (i2 == 3) {
            String str13 = delayedMessage.obj.messageOwner.attachPath;
            putToDelayedMessages(str13, delayedMessage);
            getFileLoader().uploadFile(str13, delayedMessage.sendRequest == null, true, 50331648);
            putToUploadingMessages(delayedMessage.obj);
            return;
        }
        if (i2 != 4) {
            if (i2 == 5) {
                final String str14 = "stickerset_" + delayedMessage.obj.getId();
                TLRPC$TL_messages_getStickerSet tLRPC$TL_messages_getStickerSet = new TLRPC$TL_messages_getStickerSet();
                tLRPC$TL_messages_getStickerSet.stickerset = (TLRPC$InputStickerSet) delayedMessage.parentObject;
                getConnectionsManager().sendRequest(tLRPC$TL_messages_getStickerSet, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject4, TLRPC$TL_error tLRPC$TL_error) {
                        SendMessagesHelper.this.lambda$performSendDelayedMessage$36(delayedMessage, str14, tLObject4, tLRPC$TL_error);
                    }
                });
                putToDelayedMessages(str14, delayedMessage);
                return;
            }
            return;
        }
        boolean z3 = i < 0;
        if (delayedMessage.performMediaUpload) {
            int size = i < 0 ? delayedMessage.messageObjects.size() - 1 : i;
            MessageObject messageObject7 = delayedMessage.messageObjects.get(size);
            TLRPC$Document document5 = messageObject7.getDocument();
            if (document5 == null && (MessageObject.getMedia(messageObject7) instanceof TLRPC$TL_messageMediaPaidMedia)) {
                TLRPC$TL_messageMediaPaidMedia tLRPC$TL_messageMediaPaidMedia = (TLRPC$TL_messageMediaPaidMedia) MessageObject.getMedia(messageObject7);
                TLRPC$MessageExtendedMedia tLRPC$MessageExtendedMedia = size >= tLRPC$TL_messageMediaPaidMedia.extended_media.size() ? null : tLRPC$TL_messageMediaPaidMedia.extended_media.get(size);
                TLRPC$MessageMedia tLRPC$MessageMedia = tLRPC$MessageExtendedMedia instanceof TLRPC$TL_messageExtendedMedia ? ((TLRPC$TL_messageExtendedMedia) tLRPC$MessageExtendedMedia).media : null;
                document5 = tLRPC$MessageMedia == null ? null : tLRPC$MessageMedia.document;
            }
            TLRPC$Document tLRPC$Document = document5;
            if (tLRPC$Document != null) {
                if (delayedMessage.videoEditedInfo != null) {
                    String str15 = messageObject7.messageOwner.attachPath;
                    if (str15 == null) {
                        str15 = FileLoader.getDirectory(4) + "/" + tLRPC$Document.id + ".mp4";
                    }
                    putToDelayedMessages(str15, delayedMessage);
                    delayedMessage.extraHashMap.put(messageObject7, str15);
                    delayedMessage.extraHashMap.put(str15 + "_i", messageObject7);
                    TLRPC$PhotoSize tLRPC$PhotoSize2 = delayedMessage.photoSize;
                    if (tLRPC$PhotoSize2 != null && tLRPC$PhotoSize2.location != null) {
                        delayedMessage.extraHashMap.put(str15 + "_t", delayedMessage.photoSize);
                    }
                    if (!delayedMessage.videoEditedInfo.alreadyScheduledConverting) {
                        MediaController.getInstance().scheduleVideoConvert(messageObject7);
                    }
                    delayedMessage.obj = messageObject7;
                    putToUploadingMessages(messageObject7);
                } else {
                    String str16 = messageObject7.messageOwner.attachPath;
                    if (str16 == null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(FileLoader.getDirectory(4));
                        sb2.append("/");
                        str = "_t";
                        sb2.append(tLRPC$Document.id);
                        sb2.append(".mp4");
                        str16 = sb2.toString();
                    } else {
                        str = "_t";
                    }
                    TLObject tLObject4 = delayedMessage.sendRequest;
                    if (tLObject4 != null) {
                        if (tLObject4 instanceof TLRPC$TL_messages_sendMultiMedia) {
                            tLRPC$InputMedia = ((TLRPC$TL_messages_sendMultiMedia) tLObject4).multi_media.get(size).media;
                        } else {
                            if (tLObject4 instanceof TLRPC$TL_messages_sendMedia) {
                                TLRPC$InputMedia tLRPC$InputMedia5 = ((TLRPC$TL_messages_sendMedia) tLObject4).media;
                                if (tLRPC$InputMedia5 instanceof TLRPC$TL_inputMediaPaidMedia) {
                                    tLRPC$InputMedia = ((TLRPC$TL_inputMediaPaidMedia) tLRPC$InputMedia5).extended_media.get(size);
                                }
                            }
                            tLRPC$InputMedia = null;
                        }
                        if (tLRPC$InputMedia != null && tLRPC$InputMedia.file == null) {
                            putToDelayedMessages(str16, delayedMessage);
                            delayedMessage.extraHashMap.put(messageObject7, str16);
                            delayedMessage.extraHashMap.put(str16, tLRPC$InputMedia);
                            delayedMessage.extraHashMap.put(str16 + "_i", messageObject7);
                            TLRPC$PhotoSize tLRPC$PhotoSize3 = delayedMessage.photoSize;
                            if (tLRPC$PhotoSize3 != null && tLRPC$PhotoSize3.location != null) {
                                delayedMessage.extraHashMap.put(str16 + str, delayedMessage.photoSize);
                            }
                            VideoEditedInfo videoEditedInfo6 = messageObject7.videoEditedInfo;
                            if (videoEditedInfo6 != null && videoEditedInfo6.needConvert()) {
                                getFileLoader().uploadFile(str16, false, false, tLRPC$Document.size, 33554432, false);
                            } else {
                                getFileLoader().uploadFile(str16, false, false, 33554432);
                            }
                            putToUploadingMessages(messageObject7);
                        } else if (delayedMessage.photoSize != null) {
                            String str17 = FileLoader.getDirectory(4) + "/" + delayedMessage.photoSize.location.volume_id + "_" + delayedMessage.photoSize.location.local_id + ".jpg";
                            putToDelayedMessages(str17, delayedMessage);
                            delayedMessage.extraHashMap.put(str17 + "_o", str16);
                            delayedMessage.extraHashMap.put(messageObject7, str17);
                            delayedMessage.extraHashMap.put(str17, tLRPC$InputMedia);
                            getFileLoader().uploadFile(str17, false, true, 16777216);
                            putToUploadingMessages(messageObject7);
                        }
                    } else {
                        String str18 = str;
                        TLRPC$TL_messages_sendEncryptedMultiMedia tLRPC$TL_messages_sendEncryptedMultiMedia = (TLRPC$TL_messages_sendEncryptedMultiMedia) delayedMessage.sendEncryptedRequest;
                        putToDelayedMessages(str16, delayedMessage);
                        delayedMessage.extraHashMap.put(messageObject7, str16);
                        delayedMessage.extraHashMap.put(str16, tLRPC$TL_messages_sendEncryptedMultiMedia.files.get(size));
                        delayedMessage.extraHashMap.put(str16 + "_i", messageObject7);
                        TLRPC$PhotoSize tLRPC$PhotoSize4 = delayedMessage.photoSize;
                        if (tLRPC$PhotoSize4 != null && tLRPC$PhotoSize4.location != null) {
                            delayedMessage.extraHashMap.put(str16 + str18, delayedMessage.photoSize);
                        }
                        VideoEditedInfo videoEditedInfo7 = messageObject7.videoEditedInfo;
                        if (videoEditedInfo7 != null && videoEditedInfo7.needConvert()) {
                            getFileLoader().uploadFile(str16, true, false, tLRPC$Document.size, 33554432, false);
                        } else {
                            getFileLoader().uploadFile(str16, true, false, 33554432);
                        }
                        putToUploadingMessages(messageObject7);
                    }
                }
                delayedMessage.videoEditedInfo = null;
                delayedMessage.photoSize = null;
            } else {
                String str19 = delayedMessage.httpLocation;
                if (str19 != null) {
                    putToDelayedMessages(str19, delayedMessage);
                    delayedMessage.extraHashMap.put(messageObject7, delayedMessage.httpLocation);
                    delayedMessage.extraHashMap.put(delayedMessage.httpLocation, messageObject7);
                    ImageLoader.getInstance().loadHttpFile(delayedMessage.httpLocation, "file", this.currentAccount);
                    delayedMessage.httpLocation = null;
                } else {
                    TLObject tLObject5 = delayedMessage.sendRequest;
                    if (tLObject5 instanceof TLRPC$TL_messages_sendMultiMedia) {
                        tLRPC$InputEncryptedFile = ((TLRPC$TL_messages_sendMultiMedia) tLObject5).multi_media.get(size).media;
                    } else if ((tLObject5 instanceof TLRPC$TL_messages_sendMedia) && (((TLRPC$TL_messages_sendMedia) tLObject5).media instanceof TLRPC$TL_inputMediaPaidMedia)) {
                        tLRPC$InputEncryptedFile = ((TLRPC$TL_inputMediaPaidMedia) ((TLRPC$TL_messages_sendMedia) tLObject5).media).extended_media.get(size);
                    } else {
                        tLRPC$InputEncryptedFile = ((TLRPC$TL_messages_sendEncryptedMultiMedia) delayedMessage.sendEncryptedRequest).files.get(size);
                    }
                    String file6 = FileLoader.getInstance(this.currentAccount).getPathToAttach(delayedMessage.photoSize).toString();
                    putToDelayedMessages(file6, delayedMessage);
                    delayedMessage.extraHashMap.put(file6, tLRPC$InputEncryptedFile);
                    delayedMessage.extraHashMap.put(messageObject7, file6);
                    z = true;
                    getFileLoader().uploadFile(file6, delayedMessage.sendEncryptedRequest != null, true, 16777216);
                    putToUploadingMessages(messageObject7);
                    delayedMessage.photoSize = null;
                    z2 = false;
                    delayedMessage.performMediaUpload = z2;
                }
            }
            z2 = false;
            z = true;
            delayedMessage.performMediaUpload = z2;
        } else {
            z = true;
            if (!delayedMessage.messageObjects.isEmpty()) {
                ArrayList<MessageObject> arrayList = delayedMessage.messageObjects;
                putToSendingMessages(arrayList.get(arrayList.size() - 1).messageOwner, delayedMessage.finalGroupMessage != 0);
            }
        }
        sendReadyToSendGroup(delayedMessage, z3, z);
    }

    public void lambda$performSendDelayedMessage$36(final DelayedMessage delayedMessage, final String str, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SendMessagesHelper.this.lambda$performSendDelayedMessage$35(tLObject, delayedMessage, str);
            }
        });
    }

    public void lambda$performSendDelayedMessage$35(TLObject tLObject, DelayedMessage delayedMessage, String str) {
        boolean z;
        if (tLObject != null) {
            TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = (TLRPC$TL_messages_stickerSet) tLObject;
            getMediaDataController().storeTempStickerSet(tLRPC$TL_messages_stickerSet);
            TLRPC$TL_documentAttributeSticker_layer55 tLRPC$TL_documentAttributeSticker_layer55 = (TLRPC$TL_documentAttributeSticker_layer55) delayedMessage.locationParent;
            TLRPC$TL_inputStickerSetShortName tLRPC$TL_inputStickerSetShortName = new TLRPC$TL_inputStickerSetShortName();
            tLRPC$TL_documentAttributeSticker_layer55.stickerset = tLRPC$TL_inputStickerSetShortName;
            tLRPC$TL_inputStickerSetShortName.short_name = tLRPC$TL_messages_stickerSet.set.short_name;
            z = true;
        } else {
            z = false;
        }
        ArrayList<DelayedMessage> remove = this.delayedMessages.remove(str);
        if (remove == null || remove.isEmpty()) {
            return;
        }
        if (z) {
            getMessagesStorage().replaceMessageIfExists(remove.get(0).obj.messageOwner, null, null, false);
        }
        SecretChatHelper secretChatHelper = getSecretChatHelper();
        TLRPC$DecryptedMessage tLRPC$DecryptedMessage = (TLRPC$DecryptedMessage) delayedMessage.sendEncryptedRequest;
        MessageObject messageObject = delayedMessage.obj;
        secretChatHelper.performSendEncryptedRequest(tLRPC$DecryptedMessage, messageObject.messageOwner, delayedMessage.encryptedChat, null, null, messageObject);
    }

    public void lambda$uploadMultiMedia$38(final TLRPC$InputMedia tLRPC$InputMedia, final DelayedMessage delayedMessage, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SendMessagesHelper.this.lambda$uploadMultiMedia$37(tLObject, tLRPC$InputMedia, delayedMessage);
            }
        });
    }

    public void lambda$uploadMultiMedia$37(org.telegram.tgnet.TLObject r6, org.telegram.tgnet.TLRPC$InputMedia r7, org.telegram.messenger.SendMessagesHelper.DelayedMessage r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.lambda$uploadMultiMedia$37(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$InputMedia, org.telegram.messenger.SendMessagesHelper$DelayedMessage):void");
    }

    private void uploadMultiMedia(final DelayedMessage delayedMessage, final TLRPC$InputMedia tLRPC$InputMedia, TLRPC$InputEncryptedFile tLRPC$InputEncryptedFile, String str) {
        if (tLRPC$InputMedia == null) {
            if (tLRPC$InputEncryptedFile != null) {
                TLRPC$TL_messages_sendEncryptedMultiMedia tLRPC$TL_messages_sendEncryptedMultiMedia = (TLRPC$TL_messages_sendEncryptedMultiMedia) delayedMessage.sendEncryptedRequest;
                int i = 0;
                while (true) {
                    if (i >= tLRPC$TL_messages_sendEncryptedMultiMedia.files.size()) {
                        break;
                    }
                    if (tLRPC$TL_messages_sendEncryptedMultiMedia.files.get(i) == tLRPC$InputEncryptedFile) {
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
        TLRPC$TL_messages_uploadMedia tLRPC$TL_messages_uploadMedia = new TLRPC$TL_messages_uploadMedia();
        tLRPC$TL_messages_uploadMedia.media = tLRPC$InputMedia;
        TLObject tLObject = delayedMessage.sendRequest;
        if (tLObject instanceof TLRPC$TL_messages_sendMultiMedia) {
            TLRPC$TL_messages_sendMultiMedia tLRPC$TL_messages_sendMultiMedia = (TLRPC$TL_messages_sendMultiMedia) tLObject;
            tLRPC$TL_messages_uploadMedia.peer = tLRPC$TL_messages_sendMultiMedia.peer;
            int i2 = 0;
            while (true) {
                if (i2 >= tLRPC$TL_messages_sendMultiMedia.multi_media.size()) {
                    break;
                }
                if (tLRPC$TL_messages_sendMultiMedia.multi_media.get(i2).media == tLRPC$InputMedia) {
                    putToSendingMessages(delayedMessage.messages.get(i2), delayedMessage.scheduled);
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileUploadProgressChanged, str, -1L, -1L, Boolean.FALSE);
                    break;
                }
                i2++;
            }
        } else if ((tLObject instanceof TLRPC$TL_messages_sendMedia) && (((TLRPC$TL_messages_sendMedia) tLObject).media instanceof TLRPC$TL_inputMediaPaidMedia)) {
            TLRPC$TL_messages_sendMedia tLRPC$TL_messages_sendMedia = (TLRPC$TL_messages_sendMedia) tLObject;
            tLRPC$TL_messages_uploadMedia.peer = tLRPC$TL_messages_sendMedia.peer;
            TLRPC$TL_inputMediaPaidMedia tLRPC$TL_inputMediaPaidMedia = (TLRPC$TL_inputMediaPaidMedia) tLRPC$TL_messages_sendMedia.media;
            int i3 = 0;
            while (true) {
                if (i3 >= tLRPC$TL_inputMediaPaidMedia.extended_media.size()) {
                    break;
                }
                if (tLRPC$TL_inputMediaPaidMedia.extended_media.get(i3) == tLRPC$InputMedia) {
                    putToSendingMessages(delayedMessage.messages.get(i3), delayedMessage.scheduled);
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileUploadProgressChanged, str, -1L, -1L, Boolean.FALSE);
                    break;
                }
                i3++;
            }
        }
        getConnectionsManager().sendRequest(tLRPC$TL_messages_uploadMedia, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error) {
                SendMessagesHelper.this.lambda$uploadMultiMedia$38(tLRPC$InputMedia, delayedMessage, tLObject2, tLRPC$TL_error);
            }
        });
    }

    private void sendReadyToSendGroup(DelayedMessage delayedMessage, boolean z, boolean z2) {
        DelayedMessage findMaxDelayedMessageForMessageId;
        DelayedMessage findMaxDelayedMessageForMessageId2;
        ArrayList<MessageObject> arrayList;
        if (delayedMessage.messageObjects.isEmpty()) {
            delayedMessage.markAsError();
            return;
        }
        String str = "group_" + delayedMessage.groupId;
        int i = delayedMessage.finalGroupMessage;
        ArrayList<MessageObject> arrayList2 = delayedMessage.messageObjects;
        int i2 = 1;
        if (i != arrayList2.get(arrayList2.size() - 1).getId()) {
            if (z) {
                if (BuildVars.DEBUG_VERSION) {
                    FileLog.d("final message not added, add");
                }
                putToDelayedMessages(str, delayedMessage);
                return;
            } else {
                if (BuildVars.DEBUG_VERSION) {
                    FileLog.d("final message not added");
                    return;
                }
                return;
            }
        }
        int i3 = 0;
        if (z) {
            this.delayedMessages.remove(str);
            if (!delayedMessage.scheduled) {
                MessageObject messageObject = delayedMessage.obj;
                i2 = ((messageObject == null || !messageObject.isQuickReply()) && ((arrayList = delayedMessage.messageObjects) == null || arrayList.isEmpty() || !delayedMessage.messageObjects.get(0).isQuickReply())) ? 0 : 5;
            }
            if (delayedMessage.paidMedia) {
                ArrayList<MessageObject> arrayList3 = new ArrayList<>();
                arrayList3.add(delayedMessage.messageObjects.get(0));
                ArrayList<TLRPC$Message> arrayList4 = new ArrayList<>();
                arrayList4.add(delayedMessage.messages.get(0));
                getMessagesStorage().putMessages(arrayList4, false, true, false, 0, i2, 0L);
                getMessagesController().updateInterfaceWithMessages(delayedMessage.peer, arrayList3, i2);
            } else {
                getMessagesStorage().putMessages(delayedMessage.messages, false, true, false, 0, i2, 0L);
                getMessagesController().updateInterfaceWithMessages(delayedMessage.peer, delayedMessage.messageObjects, i2);
            }
            if (!delayedMessage.scheduled) {
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
            }
            if (BuildVars.DEBUG_VERSION) {
                FileLog.d("add message");
            }
        }
        TLObject tLObject = delayedMessage.sendRequest;
        if (tLObject instanceof TLRPC$TL_messages_sendMultiMedia) {
            TLRPC$TL_messages_sendMultiMedia tLRPC$TL_messages_sendMultiMedia = (TLRPC$TL_messages_sendMultiMedia) tLObject;
            while (i3 < tLRPC$TL_messages_sendMultiMedia.multi_media.size()) {
                TLRPC$InputMedia tLRPC$InputMedia = tLRPC$TL_messages_sendMultiMedia.multi_media.get(i3).media;
                if ((tLRPC$InputMedia instanceof TLRPC$TL_inputMediaUploadedPhoto) || (tLRPC$InputMedia instanceof TLRPC$TL_inputMediaUploadedDocument)) {
                    if (BuildVars.DEBUG_VERSION) {
                        FileLog.d("multi media not ready");
                        return;
                    }
                    return;
                }
                i3++;
            }
            if (z2 && (findMaxDelayedMessageForMessageId2 = findMaxDelayedMessageForMessageId(delayedMessage.finalGroupMessage, delayedMessage.peer)) != null) {
                findMaxDelayedMessageForMessageId2.addDelayedRequest(delayedMessage.sendRequest, delayedMessage.messageObjects, delayedMessage.originalPaths, delayedMessage.parentObjects, delayedMessage, delayedMessage.scheduled);
                ArrayList<DelayedMessageSendAfterRequest> arrayList5 = delayedMessage.requests;
                if (arrayList5 != null) {
                    findMaxDelayedMessageForMessageId2.requests.addAll(arrayList5);
                }
                if (BuildVars.DEBUG_VERSION) {
                    FileLog.d("has maxDelayedMessage, delay");
                    return;
                }
                return;
            }
        } else if ((tLObject instanceof TLRPC$TL_messages_sendMedia) && (((TLRPC$TL_messages_sendMedia) tLObject).media instanceof TLRPC$TL_inputMediaPaidMedia)) {
            TLRPC$TL_inputMediaPaidMedia tLRPC$TL_inputMediaPaidMedia = (TLRPC$TL_inputMediaPaidMedia) ((TLRPC$TL_messages_sendMedia) tLObject).media;
            while (i3 < tLRPC$TL_inputMediaPaidMedia.extended_media.size()) {
                TLRPC$InputMedia tLRPC$InputMedia2 = tLRPC$TL_inputMediaPaidMedia.extended_media.get(i3);
                if ((tLRPC$InputMedia2 instanceof TLRPC$TL_inputMediaUploadedPhoto) || (tLRPC$InputMedia2 instanceof TLRPC$TL_inputMediaUploadedDocument)) {
                    if (BuildVars.DEBUG_VERSION) {
                        FileLog.d("multi media not ready");
                        return;
                    }
                    return;
                }
                i3++;
            }
            if (z2 && (findMaxDelayedMessageForMessageId = findMaxDelayedMessageForMessageId(delayedMessage.finalGroupMessage, delayedMessage.peer)) != null) {
                findMaxDelayedMessageForMessageId.addDelayedRequest(delayedMessage.sendRequest, delayedMessage.messageObjects, delayedMessage.originalPaths, delayedMessage.parentObjects, delayedMessage, delayedMessage.scheduled);
                ArrayList<DelayedMessageSendAfterRequest> arrayList6 = delayedMessage.requests;
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
            TLRPC$TL_messages_sendEncryptedMultiMedia tLRPC$TL_messages_sendEncryptedMultiMedia = (TLRPC$TL_messages_sendEncryptedMultiMedia) delayedMessage.sendEncryptedRequest;
            while (i3 < tLRPC$TL_messages_sendEncryptedMultiMedia.files.size()) {
                if (tLRPC$TL_messages_sendEncryptedMultiMedia.files.get(i3) instanceof TLRPC$TL_inputEncryptedFile) {
                    return;
                } else {
                    i3++;
                }
            }
        }
        TLObject tLObject2 = delayedMessage.sendRequest;
        if (tLObject2 instanceof TLRPC$TL_messages_sendMultiMedia) {
            performSendMessageRequestMulti((TLRPC$TL_messages_sendMultiMedia) tLObject2, delayedMessage.messageObjects, delayedMessage.originalPaths, delayedMessage.parentObjects, delayedMessage, delayedMessage.scheduled);
        } else if (tLObject2 instanceof TLRPC$TL_messages_sendMedia) {
            performSendMessageRequestMulti((TLRPC$TL_messages_sendMedia) tLObject2, delayedMessage.messageObjects, delayedMessage.originalPaths, delayedMessage.parentObjects, delayedMessage, delayedMessage.scheduled);
        } else {
            getSecretChatHelper().performSendEncryptedRequest((TLRPC$TL_messages_sendEncryptedMultiMedia) delayedMessage.sendEncryptedRequest, delayedMessage);
        }
        delayedMessage.sendDelayedRequests();
    }

    public void putToSendingMessages(final TLRPC$Message tLRPC$Message, final boolean z) {
        if (Thread.currentThread() != ApplicationLoader.applicationHandler.getLooper().getThread()) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    SendMessagesHelper.this.lambda$putToSendingMessages$39(tLRPC$Message, z);
                }
            });
        } else {
            putToSendingMessages(tLRPC$Message, z, true);
        }
    }

    public void lambda$putToSendingMessages$39(TLRPC$Message tLRPC$Message, boolean z) {
        putToSendingMessages(tLRPC$Message, z, true);
    }

    protected void putToSendingMessages(TLRPC$Message tLRPC$Message, boolean z, boolean z2) {
        if (tLRPC$Message == null) {
            return;
        }
        int i = tLRPC$Message.id;
        if (i > 0) {
            this.editingMessages.put(i, tLRPC$Message);
            return;
        }
        boolean z3 = this.sendingMessages.indexOfKey(i) >= 0;
        removeFromUploadingMessages(tLRPC$Message.id, z);
        this.sendingMessages.put(tLRPC$Message.id, tLRPC$Message);
        if (z || z3) {
            return;
        }
        long dialogId = MessageObject.getDialogId(tLRPC$Message);
        LongSparseArray<Integer> longSparseArray = this.sendingMessagesIdDialogs;
        longSparseArray.put(dialogId, Integer.valueOf(longSparseArray.get(dialogId, 0).intValue() + 1));
        if (z2) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.sendingMessagesChanged, new Object[0]);
        }
    }

    public TLRPC$Message removeFromSendingMessages(int i, boolean z) {
        long dialogId;
        Integer num;
        if (i > 0) {
            TLRPC$Message tLRPC$Message = this.editingMessages.get(i);
            if (tLRPC$Message == null) {
                return tLRPC$Message;
            }
            this.editingMessages.remove(i);
            return tLRPC$Message;
        }
        TLRPC$Message tLRPC$Message2 = this.sendingMessages.get(i);
        if (tLRPC$Message2 != null) {
            this.sendingMessages.remove(i);
            if (!z && (num = this.sendingMessagesIdDialogs.get((dialogId = MessageObject.getDialogId(tLRPC$Message2)))) != null) {
                int intValue = num.intValue() - 1;
                if (intValue <= 0) {
                    this.sendingMessagesIdDialogs.remove(dialogId);
                } else {
                    this.sendingMessagesIdDialogs.put(dialogId, Integer.valueOf(intValue));
                }
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.sendingMessagesChanged, new Object[0]);
            }
        }
        return tLRPC$Message2;
    }

    public int getSendingMessageId(long j) {
        for (int i = 0; i < this.sendingMessages.size(); i++) {
            TLRPC$Message valueAt = this.sendingMessages.valueAt(i);
            if (valueAt.dialog_id == j) {
                return valueAt.id;
            }
        }
        for (int i2 = 0; i2 < this.uploadMessages.size(); i2++) {
            TLRPC$Message valueAt2 = this.uploadMessages.valueAt(i2);
            if (valueAt2.dialog_id == j) {
                return valueAt2.id;
            }
        }
        return 0;
    }

    protected void putToUploadingMessages(MessageObject messageObject) {
        if (messageObject == null || messageObject.getId() > 0 || messageObject.scheduled) {
            return;
        }
        TLRPC$Message tLRPC$Message = messageObject.messageOwner;
        boolean z = this.uploadMessages.indexOfKey(tLRPC$Message.id) >= 0;
        this.uploadMessages.put(tLRPC$Message.id, tLRPC$Message);
        if (z) {
            return;
        }
        long dialogId = MessageObject.getDialogId(tLRPC$Message);
        LongSparseArray<Integer> longSparseArray = this.uploadingMessagesIdDialogs;
        longSparseArray.put(dialogId, Integer.valueOf(longSparseArray.get(dialogId, 0).intValue() + 1));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.sendingMessagesChanged, new Object[0]);
    }

    protected void removeFromUploadingMessages(int i, boolean z) {
        TLRPC$Message tLRPC$Message;
        if (i > 0 || z || (tLRPC$Message = this.uploadMessages.get(i)) == null) {
            return;
        }
        this.uploadMessages.remove(i);
        long dialogId = MessageObject.getDialogId(tLRPC$Message);
        Integer num = this.uploadingMessagesIdDialogs.get(dialogId);
        if (num != null) {
            int intValue = num.intValue() - 1;
            if (intValue <= 0) {
                this.uploadingMessagesIdDialogs.remove(dialogId);
            } else {
                this.uploadingMessagesIdDialogs.put(dialogId, Integer.valueOf(intValue));
            }
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.sendingMessagesChanged, new Object[0]);
        }
    }

    public boolean isSendingMessage(int i) {
        return this.sendingMessages.indexOfKey(i) >= 0 || this.editingMessages.indexOfKey(i) >= 0;
    }

    public boolean isSendingPaidMessage(int i, int i2) {
        HashMap<String, ArrayList<DelayedMessage>> hashMap = this.delayedMessages;
        DelayedMessage delayedMessage = null;
        if (hashMap != null) {
            for (ArrayList<DelayedMessage> arrayList : hashMap.values()) {
                if (arrayList != null) {
                    Iterator<DelayedMessage> it = arrayList.iterator();
                    while (it.hasNext()) {
                        DelayedMessage next = it.next();
                        ArrayList<TLRPC$Message> arrayList2 = next.messages;
                        if (arrayList2 != null) {
                            Iterator<TLRPC$Message> it2 = arrayList2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                TLRPC$Message next2 = it2.next();
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
        return this.sendingMessagesIdDialogs.get(j, 0).intValue() > 0;
    }

    public boolean isUploadingMessageIdDialog(long j) {
        return this.uploadingMessagesIdDialogs.get(j, 0).intValue() > 0;
    }

    public void performSendMessageRequestMulti(final TLObject tLObject, final ArrayList<MessageObject> arrayList, final ArrayList<String> arrayList2, final ArrayList<Object> arrayList3, final DelayedMessage delayedMessage, final boolean z) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            putToSendingMessages(arrayList.get(i).messageOwner, z);
        }
        getConnectionsManager().sendRequest(tLObject, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error) {
                SendMessagesHelper.this.lambda$performSendMessageRequestMulti$48(arrayList3, tLObject, arrayList, arrayList2, delayedMessage, z, tLObject2, tLRPC$TL_error);
            }
        }, (QuickAckDelegate) null, 68);
    }

    public void lambda$performSendMessageRequestMulti$48(ArrayList arrayList, final TLObject tLObject, final ArrayList arrayList2, final ArrayList arrayList3, final DelayedMessage delayedMessage, final boolean z, final TLObject tLObject2, final TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null && FileRefController.isFileRefError(tLRPC$TL_error.text)) {
            final int fileRefErrorIndex = FileRefController.getFileRefErrorIndex(tLRPC$TL_error.text);
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
                        SendMessagesHelper.this.lambda$performSendMessageRequestMulti$40(tLObject, fileRefErrorIndex, delayedMessage, arrayList2, z);
                    }
                });
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SendMessagesHelper.this.lambda$performSendMessageRequestMulti$47(tLRPC$TL_error, tLObject2, arrayList2, arrayList3, tLObject, z);
            }
        });
    }

    public void lambda$performSendMessageRequestMulti$40(org.telegram.tgnet.TLObject r9, int r10, org.telegram.messenger.SendMessagesHelper.DelayedMessage r11, java.util.ArrayList r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.lambda$performSendMessageRequestMulti$40(org.telegram.tgnet.TLObject, int, org.telegram.messenger.SendMessagesHelper$DelayedMessage, java.util.ArrayList, boolean):void");
    }

    public void lambda$performSendMessageRequestMulti$47(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, TLObject tLObject2, final boolean z) {
        boolean z2;
        final TLRPC$Updates tLRPC$Updates;
        TLRPC$Message tLRPC$Message;
        TLRPC$Updates tLRPC$Updates2;
        ArrayList arrayList3;
        int i;
        TLRPC$Message tLRPC$Message2;
        MessageObject messageObject;
        int i2;
        LongSparseArray longSparseArray;
        SparseArray sparseArray;
        TLRPC$Updates tLRPC$Updates3;
        TLRPC$MessageReplyHeader tLRPC$MessageReplyHeader;
        ArrayList arrayList4 = arrayList;
        Object[] objArr = z ? 1 : 0;
        if (tLRPC$TL_error == null) {
            SparseArray sparseArray2 = new SparseArray();
            LongSparseArray longSparseArray2 = new LongSparseArray();
            TLRPC$Updates tLRPC$Updates4 = (TLRPC$Updates) tLObject;
            ArrayList<TLRPC$Update> arrayList5 = tLRPC$Updates4.updates;
            int i3 = 0;
            LongSparseArray<SparseArray<TLRPC$MessageReplies>> longSparseArray3 = null;
            while (i3 < arrayList5.size()) {
                TLRPC$Update tLRPC$Update = arrayList5.get(i3);
                if (tLRPC$Update instanceof TLRPC$TL_updateMessageID) {
                    TLRPC$TL_updateMessageID tLRPC$TL_updateMessageID = (TLRPC$TL_updateMessageID) tLRPC$Update;
                    longSparseArray2.put(tLRPC$TL_updateMessageID.random_id, Integer.valueOf(tLRPC$TL_updateMessageID.id));
                    arrayList5.remove(i3);
                } else if (tLRPC$Update instanceof TLRPC$TL_updateNewMessage) {
                    final TLRPC$TL_updateNewMessage tLRPC$TL_updateNewMessage = (TLRPC$TL_updateNewMessage) tLRPC$Update;
                    TLRPC$Message tLRPC$Message3 = tLRPC$TL_updateNewMessage.message;
                    sparseArray2.put(tLRPC$Message3.id, tLRPC$Message3);
                    Utilities.stageQueue.postRunnable(new Runnable() {
                        @Override
                        public final void run() {
                            SendMessagesHelper.this.lambda$performSendMessageRequestMulti$41(tLRPC$TL_updateNewMessage);
                        }
                    });
                    arrayList5.remove(i3);
                } else {
                    if (tLRPC$Update instanceof TLRPC$TL_updateNewChannelMessage) {
                        final TLRPC$TL_updateNewChannelMessage tLRPC$TL_updateNewChannelMessage = (TLRPC$TL_updateNewChannelMessage) tLRPC$Update;
                        final long updateChannelId = MessagesController.getUpdateChannelId(tLRPC$TL_updateNewChannelMessage);
                        TLRPC$Chat chat = getMessagesController().getChat(Long.valueOf(updateChannelId));
                        if (!(chat == null || chat.megagroup) || (tLRPC$MessageReplyHeader = tLRPC$TL_updateNewChannelMessage.message.reply_to) == null || (tLRPC$MessageReplyHeader.reply_to_top_id == 0 && tLRPC$MessageReplyHeader.reply_to_msg_id == 0)) {
                            tLRPC$Updates3 = tLRPC$Updates4;
                        } else {
                            if (longSparseArray3 == null) {
                                longSparseArray3 = new LongSparseArray<>();
                            }
                            tLRPC$Updates3 = tLRPC$Updates4;
                            long dialogId = MessageObject.getDialogId(tLRPC$TL_updateNewChannelMessage.message);
                            SparseArray<TLRPC$MessageReplies> sparseArray3 = longSparseArray3.get(dialogId);
                            if (sparseArray3 == null) {
                                sparseArray3 = new SparseArray<>();
                                longSparseArray3.put(dialogId, sparseArray3);
                            }
                            TLRPC$MessageReplyHeader tLRPC$MessageReplyHeader2 = tLRPC$TL_updateNewChannelMessage.message.reply_to;
                            int i4 = tLRPC$MessageReplyHeader2.reply_to_top_id;
                            if (i4 == 0) {
                                i4 = tLRPC$MessageReplyHeader2.reply_to_msg_id;
                            }
                            TLRPC$MessageReplies tLRPC$MessageReplies = sparseArray3.get(i4);
                            if (tLRPC$MessageReplies == null) {
                                tLRPC$MessageReplies = new TLRPC$TL_messageReplies();
                                sparseArray3.put(i4, tLRPC$MessageReplies);
                            }
                            TLRPC$Peer tLRPC$Peer = tLRPC$TL_updateNewChannelMessage.message.from_id;
                            if (tLRPC$Peer != null) {
                                tLRPC$MessageReplies.recent_repliers.add(0, tLRPC$Peer);
                            }
                            tLRPC$MessageReplies.replies++;
                        }
                        TLRPC$Message tLRPC$Message4 = tLRPC$TL_updateNewChannelMessage.message;
                        sparseArray2.put(tLRPC$Message4.id, tLRPC$Message4);
                        Utilities.stageQueue.postRunnable(new Runnable() {
                            @Override
                            public final void run() {
                                SendMessagesHelper.this.lambda$performSendMessageRequestMulti$42(tLRPC$TL_updateNewChannelMessage);
                            }
                        });
                        arrayList5.remove(i3);
                        i3--;
                        if (tLRPC$TL_updateNewChannelMessage.message.pinned) {
                            Utilities.stageQueue.postRunnable(new Runnable() {
                                @Override
                                public final void run() {
                                    SendMessagesHelper.this.lambda$performSendMessageRequestMulti$43(tLRPC$TL_updateNewChannelMessage, updateChannelId);
                                }
                            });
                        }
                    } else {
                        tLRPC$Updates3 = tLRPC$Updates4;
                        if (tLRPC$Update instanceof TLRPC$TL_updateNewScheduledMessage) {
                            TLRPC$Message tLRPC$Message5 = ((TLRPC$TL_updateNewScheduledMessage) tLRPC$Update).message;
                            sparseArray2.put(tLRPC$Message5.id, tLRPC$Message5);
                            arrayList5.remove(i3);
                        } else if (tLRPC$Update instanceof TLRPC$TL_updateQuickReplyMessage) {
                            QuickRepliesController.getInstance(this.currentAccount).processUpdate(tLRPC$Update, arrayList.isEmpty() ? null : ((MessageObject) arrayList4.get(0)).getQuickReplyName(), (arrayList.isEmpty() ? null : Integer.valueOf(((MessageObject) arrayList4.get(0)).getQuickReplyId())).intValue());
                            TLRPC$Message tLRPC$Message6 = ((TLRPC$TL_updateQuickReplyMessage) tLRPC$Update).message;
                            sparseArray2.put(tLRPC$Message6.id, tLRPC$Message6);
                            arrayList5.remove(i3);
                        }
                        i3--;
                    }
                    i3++;
                    tLRPC$Updates4 = tLRPC$Updates3;
                }
                i3--;
                tLRPC$Updates3 = tLRPC$Updates4;
                i3++;
                tLRPC$Updates4 = tLRPC$Updates3;
            }
            TLRPC$Updates tLRPC$Updates5 = tLRPC$Updates4;
            if (longSparseArray3 != null) {
                getMessagesStorage().putChannelViews(null, null, longSparseArray3, true);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateMessagesViews, null, null, longSparseArray3, Boolean.TRUE);
            }
            int i5 = 0;
            while (i5 < arrayList.size()) {
                MessageObject messageObject2 = (MessageObject) arrayList4.get(i5);
                String str = (String) arrayList2.get(i5);
                TLRPC$Message tLRPC$Message7 = messageObject2.messageOwner;
                int i6 = tLRPC$Message7.id;
                ArrayList arrayList6 = new ArrayList();
                Integer num = (Integer) longSparseArray2.get(tLRPC$Message7.random_id);
                if (num == null || (tLRPC$Message = (TLRPC$Message) sparseArray2.get(num.intValue())) == null) {
                    tLRPC$Updates = tLRPC$Updates5;
                    z2 = true;
                    break;
                }
                MessageObject.getDialogId(tLRPC$Message);
                arrayList6.add(tLRPC$Message);
                if ((tLRPC$Message.flags & 33554432) != 0) {
                    TLRPC$Message tLRPC$Message8 = messageObject2.messageOwner;
                    tLRPC$Message8.ttl_period = tLRPC$Message.ttl_period;
                    tLRPC$Message8.flags = 33554432 | tLRPC$Message8.flags;
                }
                if (tLObject2 instanceof TLRPC$TL_messages_sendMedia) {
                    arrayList3 = arrayList6;
                    i = i6;
                    tLRPC$Message2 = tLRPC$Message7;
                    messageObject = messageObject2;
                    tLRPC$Updates2 = tLRPC$Updates5;
                    i2 = i5;
                    updateMediaPaths((MessageObject) arrayList4.get(0), tLRPC$Message, tLRPC$Message.id, arrayList2, false, -1);
                } else {
                    tLRPC$Updates2 = tLRPC$Updates5;
                    arrayList3 = arrayList6;
                    i = i6;
                    tLRPC$Message2 = tLRPC$Message7;
                    messageObject = messageObject2;
                    i2 = i5;
                    updateMediaPaths(messageObject, tLRPC$Message, tLRPC$Message.id, str, false);
                }
                final int mediaExistanceFlags = messageObject.getMediaExistanceFlags();
                final TLRPC$Message tLRPC$Message9 = tLRPC$Message2;
                tLRPC$Message9.id = tLRPC$Message.id;
                int i7 = tLRPC$Message.quick_reply_shortcut_id;
                tLRPC$Message9.quick_reply_shortcut_id = i7;
                if (i7 != 0) {
                    tLRPC$Message9.flags |= 1073741824;
                }
                final long j = tLRPC$Message.grouped_id;
                if (objArr == true) {
                    longSparseArray = longSparseArray2;
                    sparseArray = sparseArray2;
                } else {
                    Integer num2 = getMessagesController().dialogs_read_outbox_max.get(Long.valueOf(tLRPC$Message.dialog_id));
                    if (num2 == null) {
                        longSparseArray = longSparseArray2;
                        sparseArray = sparseArray2;
                        num2 = Integer.valueOf(getMessagesStorage().getDialogReadMax(tLRPC$Message.out, tLRPC$Message.dialog_id));
                        getMessagesController().dialogs_read_outbox_max.put(Long.valueOf(tLRPC$Message.dialog_id), num2);
                    } else {
                        longSparseArray = longSparseArray2;
                        sparseArray = sparseArray2;
                    }
                    tLRPC$Message.unread = num2.intValue() < tLRPC$Message.id;
                }
                getStatsController().incrementSentItemsCount(ApplicationLoader.getCurrentNetworkType(), 1, 1);
                tLRPC$Message9.send_state = 0;
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageReceivedByServer, Integer.valueOf(i), Integer.valueOf(tLRPC$Message9.id), tLRPC$Message9, Long.valueOf(tLRPC$Message9.dialog_id), Long.valueOf(j), Integer.valueOf(mediaExistanceFlags), Boolean.valueOf(z));
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageReceivedByServer2, Integer.valueOf(i), Integer.valueOf(tLRPC$Message9.id), tLRPC$Message9, Long.valueOf(tLRPC$Message9.dialog_id), Long.valueOf(j), Integer.valueOf(mediaExistanceFlags), Boolean.valueOf(z));
                final int i8 = i;
                final ArrayList arrayList7 = arrayList3;
                LongSparseArray longSparseArray4 = longSparseArray;
                SparseArray sparseArray4 = sparseArray;
                getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        SendMessagesHelper.this.lambda$performSendMessageRequestMulti$45(z, tLRPC$Message9, i8, arrayList7, j, mediaExistanceFlags);
                    }
                });
                i5 = i2 + 1;
                objArr = z ? 1 : 0;
                tLRPC$Updates5 = tLRPC$Updates2;
                longSparseArray2 = longSparseArray4;
                sparseArray2 = sparseArray4;
                arrayList4 = arrayList;
            }
            tLRPC$Updates = tLRPC$Updates5;
            z2 = false;
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    SendMessagesHelper.this.lambda$performSendMessageRequestMulti$46(tLRPC$Updates);
                }
            });
        } else {
            AlertsCreator.processError(this.currentAccount, tLRPC$TL_error, null, tLObject2, new Object[0]);
            z2 = true;
        }
        if (z2) {
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                TLRPC$Message tLRPC$Message10 = ((MessageObject) arrayList.get(i9)).messageOwner;
                getMessagesStorage().markMessageAsSendError(tLRPC$Message10, z ? 1 : 0);
                tLRPC$Message10.send_state = 2;
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageSendError, Integer.valueOf(tLRPC$Message10.id));
                processSentMessage(tLRPC$Message10.id);
                removeFromSendingMessages(tLRPC$Message10.id, z);
            }
        }
    }

    public void lambda$performSendMessageRequestMulti$41(TLRPC$TL_updateNewMessage tLRPC$TL_updateNewMessage) {
        getMessagesController().processNewDifferenceParams(-1, tLRPC$TL_updateNewMessage.pts, -1, tLRPC$TL_updateNewMessage.pts_count);
    }

    public void lambda$performSendMessageRequestMulti$42(TLRPC$TL_updateNewChannelMessage tLRPC$TL_updateNewChannelMessage) {
        getMessagesController().processNewChannelDifferenceParams(tLRPC$TL_updateNewChannelMessage.pts, tLRPC$TL_updateNewChannelMessage.pts_count, tLRPC$TL_updateNewChannelMessage.message.peer_id.channel_id);
    }

    public void lambda$performSendMessageRequestMulti$43(TLRPC$TL_updateNewChannelMessage tLRPC$TL_updateNewChannelMessage, long j) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(tLRPC$TL_updateNewChannelMessage.message.id));
        getMessagesStorage().updatePinnedMessages(-j, arrayList, true, -1, 0, false, null);
    }

    public void lambda$performSendMessageRequestMulti$45(final boolean z, final TLRPC$Message tLRPC$Message, final int i, ArrayList arrayList, final long j, final int i2) {
        int i3 = (tLRPC$Message.quick_reply_shortcut_id == 0 && tLRPC$Message.quick_reply_shortcut == null) ? z ? 1 : 0 : 5;
        getMessagesStorage().updateMessageStateAndId(tLRPC$Message.random_id, MessageObject.getPeerId(tLRPC$Message.peer_id), Integer.valueOf(i), tLRPC$Message.id, 0, false, z ? 1 : 0, tLRPC$Message.quick_reply_shortcut_id);
        getMessagesStorage().putMessages((ArrayList<TLRPC$Message>) arrayList, true, false, false, 0, i3, tLRPC$Message.quick_reply_shortcut_id);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SendMessagesHelper.this.lambda$performSendMessageRequestMulti$44(tLRPC$Message, i, j, i2, z);
            }
        });
    }

    public void lambda$performSendMessageRequestMulti$44(TLRPC$Message tLRPC$Message, int i, long j, int i2, boolean z) {
        getMediaDataController().increasePeerRaiting(tLRPC$Message.dialog_id);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageReceivedByServer, Integer.valueOf(i), Integer.valueOf(tLRPC$Message.id), tLRPC$Message, Long.valueOf(tLRPC$Message.dialog_id), Long.valueOf(j), Integer.valueOf(i2), Boolean.valueOf(z));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageReceivedByServer2, Integer.valueOf(i), Integer.valueOf(tLRPC$Message.id), tLRPC$Message, Long.valueOf(tLRPC$Message.dialog_id), Long.valueOf(j), Integer.valueOf(i2), Boolean.valueOf(z));
        processSentMessage(i);
        removeFromSendingMessages(i, z);
    }

    public void lambda$performSendMessageRequestMulti$46(TLRPC$Updates tLRPC$Updates) {
        getMessagesController().processUpdates(tLRPC$Updates, false);
    }

    public void performSendMessageRequest(TLObject tLObject, MessageObject messageObject, String str, DelayedMessage delayedMessage, Object obj, HashMap<String, String> hashMap, boolean z) {
        performSendMessageRequest(tLObject, messageObject, str, null, false, delayedMessage, obj, hashMap, z);
    }

    private org.telegram.messenger.SendMessagesHelper.DelayedMessage findMaxDelayedMessageForMessageId(int r12, long r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.findMaxDelayedMessageForMessageId(int, long):org.telegram.messenger.SendMessagesHelper$DelayedMessage");
    }

    public void performSendMessageRequest(final TLObject tLObject, final MessageObject messageObject, final String str, final DelayedMessage delayedMessage, final boolean z, final DelayedMessage delayedMessage2, final Object obj, HashMap<String, String> hashMap, final boolean z2) {
        DelayedMessage findMaxDelayedMessageForMessageId;
        ArrayList<DelayedMessageSendAfterRequest> arrayList;
        if (!(tLObject instanceof TLRPC$TL_messages_editMessage) && z && (findMaxDelayedMessageForMessageId = findMaxDelayedMessageForMessageId(messageObject.getId(), messageObject.getDialogId())) != null) {
            findMaxDelayedMessageForMessageId.addDelayedRequest(tLObject, messageObject, str, obj, delayedMessage2, delayedMessage != null ? delayedMessage.scheduled : false);
            if (delayedMessage == null || (arrayList = delayedMessage.requests) == null) {
                return;
            }
            findMaxDelayedMessageForMessageId.requests.addAll(arrayList);
            return;
        }
        final TLRPC$Message tLRPC$Message = messageObject.messageOwner;
        putToSendingMessages(tLRPC$Message, z2);
        tLRPC$Message.reqId = getConnectionsManager().sendRequest(tLObject, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error) {
                SendMessagesHelper.this.lambda$performSendMessageRequest$63(tLObject, obj, messageObject, str, delayedMessage, z, delayedMessage2, z2, tLRPC$Message, tLObject2, tLRPC$TL_error);
            }
        }, new QuickAckDelegate() {
            @Override
            public final void run() {
                SendMessagesHelper.this.lambda$performSendMessageRequest$65(tLRPC$Message);
            }
        }, (tLObject instanceof TLRPC$TL_messages_sendMessage ? 128 : 0) | 68);
        if (delayedMessage != null) {
            delayedMessage.sendDelayedRequests();
        }
    }

    public void lambda$performSendMessageRequest$63(final TLObject tLObject, Object obj, final MessageObject messageObject, final String str, DelayedMessage delayedMessage, boolean z, final DelayedMessage delayedMessage2, final boolean z2, final TLRPC$Message tLRPC$Message, final TLObject tLObject2, final TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null && (((tLObject instanceof TLRPC$TL_messages_sendMedia) || (tLObject instanceof TLRPC$TL_messages_editMessage)) && FileRefController.isFileRefError(tLRPC$TL_error.text))) {
            if (obj != null) {
                getFileRefController().requestReference(obj, tLObject, messageObject, str, delayedMessage, Boolean.valueOf(z), delayedMessage2, Boolean.valueOf(z2));
                return;
            } else if (delayedMessage2 != null) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        SendMessagesHelper.this.lambda$performSendMessageRequest$49(tLRPC$Message, z2, tLObject, delayedMessage2);
                    }
                });
                return;
            }
        }
        if (tLObject instanceof TLRPC$TL_messages_editMessage) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    SendMessagesHelper.this.lambda$performSendMessageRequest$52(tLRPC$TL_error, tLRPC$Message, tLObject2, messageObject, str, z2, tLObject);
                }
            });
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    SendMessagesHelper.this.lambda$performSendMessageRequest$62(z2, tLRPC$TL_error, tLRPC$Message, tLObject2, messageObject, str, tLObject);
                }
            });
        }
    }

    public void lambda$performSendMessageRequest$49(TLRPC$Message tLRPC$Message, boolean z, TLObject tLObject, DelayedMessage delayedMessage) {
        removeFromSendingMessages(tLRPC$Message.id, z);
        if (tLObject instanceof TLRPC$TL_messages_sendMedia) {
            TLRPC$TL_messages_sendMedia tLRPC$TL_messages_sendMedia = (TLRPC$TL_messages_sendMedia) tLObject;
            TLRPC$InputMedia tLRPC$InputMedia = tLRPC$TL_messages_sendMedia.media;
            if (tLRPC$InputMedia instanceof TLRPC$TL_inputMediaPhoto) {
                tLRPC$TL_messages_sendMedia.media = delayedMessage.inputUploadMedia;
            } else if (tLRPC$InputMedia instanceof TLRPC$TL_inputMediaDocument) {
                tLRPC$TL_messages_sendMedia.media = delayedMessage.inputUploadMedia;
            }
        } else if (tLObject instanceof TLRPC$TL_messages_editMessage) {
            TLRPC$TL_messages_editMessage tLRPC$TL_messages_editMessage = (TLRPC$TL_messages_editMessage) tLObject;
            TLRPC$InputMedia tLRPC$InputMedia2 = tLRPC$TL_messages_editMessage.media;
            if (tLRPC$InputMedia2 instanceof TLRPC$TL_inputMediaPhoto) {
                tLRPC$TL_messages_editMessage.media = delayedMessage.inputUploadMedia;
            } else if (tLRPC$InputMedia2 instanceof TLRPC$TL_inputMediaDocument) {
                tLRPC$TL_messages_editMessage.media = delayedMessage.inputUploadMedia;
            }
        }
        delayedMessage.performMediaUpload = true;
        performSendDelayedMessage(delayedMessage);
    }

    public void lambda$performSendMessageRequest$52(TLRPC$TL_error tLRPC$TL_error, final TLRPC$Message tLRPC$Message, TLObject tLObject, MessageObject messageObject, String str, final boolean z, TLObject tLObject2) {
        int i = 0;
        TLRPC$Message tLRPC$Message2 = null;
        if (tLRPC$TL_error == null) {
            String str2 = tLRPC$Message.attachPath;
            final TLRPC$Updates tLRPC$Updates = (TLRPC$Updates) tLObject;
            ArrayList<TLRPC$Update> arrayList = tLRPC$Updates.updates;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                TLRPC$Update tLRPC$Update = arrayList.get(i);
                if (tLRPC$Update instanceof TLRPC$TL_updateEditMessage) {
                    tLRPC$Message2 = ((TLRPC$TL_updateEditMessage) tLRPC$Update).message;
                    break;
                }
                if (tLRPC$Update instanceof TLRPC$TL_updateEditChannelMessage) {
                    tLRPC$Message2 = ((TLRPC$TL_updateEditChannelMessage) tLRPC$Update).message;
                    break;
                }
                if (tLRPC$Update instanceof TLRPC$TL_updateNewScheduledMessage) {
                    tLRPC$Message2 = ((TLRPC$TL_updateNewScheduledMessage) tLRPC$Update).message;
                    break;
                } else {
                    if (tLRPC$Update instanceof TLRPC$TL_updateQuickReplyMessage) {
                        QuickRepliesController.getInstance(this.currentAccount).processUpdate(tLRPC$Update, MessageObject.getQuickReplyName(tLRPC$Message), MessageObject.getQuickReplyId(tLRPC$Message));
                        tLRPC$Message2 = ((TLRPC$TL_updateQuickReplyMessage) tLRPC$Update).message;
                        break;
                    }
                    i++;
                }
            }
            TLRPC$Message tLRPC$Message3 = tLRPC$Message2;
            if (tLRPC$Message3 != null) {
                ImageLoader.saveMessageThumbs(tLRPC$Message3);
                updateMediaPaths(messageObject, tLRPC$Message3, tLRPC$Message3.id, str, false);
            }
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    SendMessagesHelper.this.lambda$performSendMessageRequest$51(tLRPC$Updates, tLRPC$Message, z);
                }
            });
            return;
        }
        AlertsCreator.processError(this.currentAccount, tLRPC$TL_error, null, tLObject2, new Object[0]);
        removeFromSendingMessages(tLRPC$Message.id, z);
        revertEditingMessageObject(messageObject);
    }

    public void lambda$performSendMessageRequest$51(TLRPC$Updates tLRPC$Updates, final TLRPC$Message tLRPC$Message, final boolean z) {
        getMessagesController().processUpdates(tLRPC$Updates, false);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SendMessagesHelper.this.lambda$performSendMessageRequest$50(tLRPC$Message, z);
            }
        });
    }

    public void lambda$performSendMessageRequest$50(TLRPC$Message tLRPC$Message, boolean z) {
        processSentMessage(tLRPC$Message.id);
        removeFromSendingMessages(tLRPC$Message.id, z);
    }

    public void lambda$performSendMessageRequest$62(final boolean r28, org.telegram.tgnet.TLRPC$TL_error r29, final org.telegram.tgnet.TLRPC$Message r30, org.telegram.tgnet.TLObject r31, final org.telegram.messenger.MessageObject r32, java.lang.String r33, org.telegram.tgnet.TLObject r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.lambda$performSendMessageRequest$62(boolean, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLRPC$Message, org.telegram.tgnet.TLObject, org.telegram.messenger.MessageObject, java.lang.String, org.telegram.tgnet.TLObject):void");
    }

    public void lambda$performSendMessageRequest$53(TLRPC$TL_updateShortSentMessage tLRPC$TL_updateShortSentMessage) {
        getMessagesController().processNewDifferenceParams(-1, tLRPC$TL_updateShortSentMessage.pts, tLRPC$TL_updateShortSentMessage.date, tLRPC$TL_updateShortSentMessage.pts_count);
    }

    public void lambda$performSendMessageRequest$54(TLRPC$TL_updateNewMessage tLRPC$TL_updateNewMessage) {
        getMessagesController().processNewDifferenceParams(-1, tLRPC$TL_updateNewMessage.pts, -1, tLRPC$TL_updateNewMessage.pts_count);
    }

    public void lambda$performSendMessageRequest$55(TLRPC$TL_updateNewChannelMessage tLRPC$TL_updateNewChannelMessage) {
        getMessagesController().processNewChannelDifferenceParams(tLRPC$TL_updateNewChannelMessage.pts, tLRPC$TL_updateNewChannelMessage.pts_count, tLRPC$TL_updateNewChannelMessage.message.peer_id.channel_id);
    }

    public void lambda$performSendMessageRequest$56(TLRPC$TL_updateNewChannelMessage tLRPC$TL_updateNewChannelMessage, long j) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(tLRPC$TL_updateNewChannelMessage.message.id));
        getMessagesStorage().updatePinnedMessages(-j, arrayList, true, -1, 0, false, null);
    }

    public void lambda$performSendMessageRequest$57(TLRPC$Updates tLRPC$Updates) {
        getMessagesController().processUpdates(tLRPC$Updates, false);
    }

    public void lambda$performSendMessageRequest$59(ArrayList arrayList, final MessageObject messageObject, final TLRPC$Message tLRPC$Message, final int i, final boolean z) {
        getMessagesStorage().putMessages(arrayList, true, false, false, 0, false, 0, 0L);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SendMessagesHelper.this.lambda$performSendMessageRequest$58(messageObject, tLRPC$Message, i, z);
            }
        });
    }

    public void lambda$performSendMessageRequest$58(MessageObject messageObject, TLRPC$Message tLRPC$Message, int i, boolean z) {
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        arrayList.add(new MessageObject(messageObject.currentAccount, messageObject.messageOwner, true, true));
        getMessagesController().updateInterfaceWithMessages(tLRPC$Message.dialog_id, arrayList, 0);
        getMediaDataController().increasePeerRaiting(tLRPC$Message.dialog_id);
        processSentMessage(i);
        removeFromSendingMessages(i, z);
    }

    public void lambda$performSendMessageRequest$61(final boolean z, final TLRPC$Message tLRPC$Message, final int i, ArrayList arrayList, final int i2) {
        int i3 = (tLRPC$Message.quick_reply_shortcut_id == 0 && tLRPC$Message.quick_reply_shortcut == null) ? z ? 1 : 0 : 5;
        getMessagesStorage().updateMessageStateAndId(tLRPC$Message.random_id, MessageObject.getPeerId(tLRPC$Message.peer_id), Integer.valueOf(i), tLRPC$Message.id, 0, false, z ? 1 : 0, tLRPC$Message.quick_reply_shortcut_id);
        getMessagesStorage().putMessages((ArrayList<TLRPC$Message>) arrayList, true, false, false, 0, i3, tLRPC$Message.quick_reply_shortcut_id);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SendMessagesHelper.this.lambda$performSendMessageRequest$60(tLRPC$Message, i, i2, z);
            }
        });
    }

    public void lambda$performSendMessageRequest$60(TLRPC$Message tLRPC$Message, int i, int i2, boolean z) {
        getMediaDataController().increasePeerRaiting(tLRPC$Message.dialog_id);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageReceivedByServer, Integer.valueOf(i), Integer.valueOf(tLRPC$Message.id), tLRPC$Message, Long.valueOf(tLRPC$Message.dialog_id), 0L, Integer.valueOf(i2), Boolean.valueOf(z));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageReceivedByServer2, Integer.valueOf(i), Integer.valueOf(tLRPC$Message.id), tLRPC$Message, Long.valueOf(tLRPC$Message.dialog_id), 0L, Integer.valueOf(i2), Boolean.valueOf(z));
        processSentMessage(i);
        removeFromSendingMessages(i, z);
    }

    public void lambda$performSendMessageRequest$65(final TLRPC$Message tLRPC$Message) {
        final int i = tLRPC$Message.id;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SendMessagesHelper.this.lambda$performSendMessageRequest$64(tLRPC$Message, i);
            }
        });
    }

    public void lambda$performSendMessageRequest$64(TLRPC$Message tLRPC$Message, int i) {
        tLRPC$Message.send_state = 0;
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageReceivedByAck, Integer.valueOf(i));
    }

    private void updateMediaPaths(MessageObject messageObject, TLRPC$Message tLRPC$Message, int i, String str, boolean z) {
        updateMediaPaths(messageObject, tLRPC$Message, i, Collections.singletonList(str), z, -1);
    }

    private void updateMediaPaths(org.telegram.messenger.MessageObject r22, org.telegram.tgnet.TLRPC$Message r23, int r24, java.util.List<java.lang.String> r25, boolean r26, int r27) {
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

    public ArrayList<DelayedMessage> getDelayedMessages(String str) {
        return this.delayedMessages.get(str);
    }

    public long getNextRandomId() {
        long j = 0;
        while (j == 0) {
            j = Utilities.random.nextLong();
        }
        return j;
    }

    public void checkUnsentMessages() {
        getMessagesStorage().getUnsentMessages(1000);
    }

    public void processUnsentMessages(final ArrayList<TLRPC$Message> arrayList, final ArrayList<TLRPC$Message> arrayList2, final ArrayList<TLRPC$User> arrayList3, final ArrayList<TLRPC$Chat> arrayList4, final ArrayList<TLRPC$EncryptedChat> arrayList5) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SendMessagesHelper.this.lambda$processUnsentMessages$66(arrayList3, arrayList4, arrayList5, arrayList, arrayList2);
            }
        });
    }

    public void lambda$processUnsentMessages$66(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        HashMap<String, String> hashMap;
        getMessagesController().putUsers(arrayList, true);
        getMessagesController().putChats(arrayList2, true);
        getMessagesController().putEncryptedChats(arrayList3, true);
        int size = arrayList4.size();
        for (int i = 0; i < size; i++) {
            MessageObject messageObject = new MessageObject(this.currentAccount, (TLRPC$Message) arrayList4.get(i), false, true);
            long groupId = messageObject.getGroupId();
            if (groupId != 0 && (hashMap = messageObject.messageOwner.params) != null && !hashMap.containsKey("final") && (i == size - 1 || ((TLRPC$Message) arrayList4.get(i + 1)).grouped_id != groupId)) {
                messageObject.messageOwner.params.put("final", "1");
            }
            retrySendMessage(messageObject, true);
        }
        if (arrayList5 != null) {
            for (int i2 = 0; i2 < arrayList5.size(); i2++) {
                MessageObject messageObject2 = new MessageObject(this.currentAccount, (TLRPC$Message) arrayList5.get(i2), false, true);
                messageObject2.scheduled = true;
                retrySendMessage(messageObject2, true);
            }
        }
    }

    public ImportingStickers getImportingStickers(String str) {
        return this.importingStickersMap.get(str);
    }

    public ImportingHistory getImportingHistory(long j) {
        return this.importingHistoryMap.get(j);
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
            TLRPC$Chat chat = getMessagesController().getChat(Long.valueOf(j2));
            if (chat != null && !chat.megagroup) {
                getMessagesController().convertToMegaGroup(null, j2, null, new MessagesStorage.LongCallback() {
                    @Override
                    public final void run(long j3) {
                        SendMessagesHelper.this.lambda$prepareImportHistory$67(uri, arrayList, longCallback, j3);
                    }
                });
                return;
            }
        }
        new Thread(new Runnable() {
            @Override
            public final void run() {
                SendMessagesHelper.this.lambda$prepareImportHistory$72(arrayList, j, uri, longCallback);
            }
        }).start();
    }

    public void lambda$prepareImportHistory$67(Uri uri, ArrayList arrayList, MessagesStorage.LongCallback longCallback, long j) {
        if (j != 0) {
            prepareImportHistory(-j, uri, arrayList, longCallback);
        } else {
            longCallback.run(0L);
        }
    }

    public void lambda$prepareImportHistory$72(java.util.ArrayList r19, final long r20, android.net.Uri r22, final org.telegram.messenger.MessagesStorage.LongCallback r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.lambda$prepareImportHistory$72(java.util.ArrayList, long, android.net.Uri, org.telegram.messenger.MessagesStorage$LongCallback):void");
    }

    public static void lambda$prepareImportHistory$70(MessagesStorage.LongCallback longCallback) {
        Toast.makeText(ApplicationLoader.applicationContext, LocaleController.getString("ImportFileTooLarge", R.string.ImportFileTooLarge), 0).show();
        longCallback.run(0L);
    }

    public void lambda$prepareImportHistory$71(HashMap hashMap, long j, ImportingHistory importingHistory, MessagesStorage.LongCallback longCallback) {
        this.importingHistoryFiles.putAll(hashMap);
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
                    SendMessagesHelper.this.lambda$prepareImportStickers$75(str, str2, str3, arrayList, stringCallback);
                }
            }).start();
        }
    }

    public void lambda$prepareImportStickers$75(String str, final String str2, String str3, ArrayList arrayList, final MessagesStorage.StringCallback stringCallback) {
        final ImportingStickers importingStickers = new ImportingStickers();
        importingStickers.title = str;
        importingStickers.shortName = str2;
        importingStickers.software = str3;
        final HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ImportingSticker importingSticker = (ImportingSticker) arrayList.get(i);
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
            if (i == 0) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesStorage.StringCallback.this.run(null);
                    }
                });
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SendMessagesHelper.this.lambda$prepareImportStickers$74(importingStickers, hashMap, str2, stringCallback);
            }
        });
    }

    public void lambda$prepareImportStickers$74(ImportingStickers importingStickers, HashMap hashMap, String str, MessagesStorage.StringCallback stringCallback) {
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
            ApplicationLoader.applicationContext.startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) ImportingService.class));
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public TLRPC$TL_photo generatePhotoSizes(String str, Uri uri) {
        return generatePhotoSizes(null, str, uri);
    }

    public TLRPC$TL_photo generatePhotoSizes(TLRPC$TL_photo tLRPC$TL_photo, String str, Uri uri) {
        Bitmap loadBitmap = ImageLoader.loadBitmap(str, uri, AndroidUtilities.getPhotoSize(), AndroidUtilities.getPhotoSize(), true);
        if (loadBitmap == null) {
            loadBitmap = ImageLoader.loadBitmap(str, uri, 800.0f, 800.0f, true);
        }
        ArrayList<TLRPC$PhotoSize> arrayList = new ArrayList<>();
        TLRPC$PhotoSize scaleAndSaveImage = ImageLoader.scaleAndSaveImage(loadBitmap, 90.0f, 90.0f, 55, true);
        if (scaleAndSaveImage != null) {
            arrayList.add(scaleAndSaveImage);
        }
        TLRPC$PhotoSize scaleAndSaveImage2 = ImageLoader.scaleAndSaveImage(loadBitmap, AndroidUtilities.getPhotoSize(), AndroidUtilities.getPhotoSize(), true, 80, false, 101, 101);
        if (scaleAndSaveImage2 != null) {
            arrayList.add(scaleAndSaveImage2);
        }
        if (loadBitmap != null) {
            loadBitmap.recycle();
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        getUserConfig().saveConfig(false);
        if (tLRPC$TL_photo == null) {
            tLRPC$TL_photo = new TLRPC$TL_photo();
        }
        tLRPC$TL_photo.date = getConnectionsManager().getCurrentTime();
        tLRPC$TL_photo.sizes = arrayList;
        tLRPC$TL_photo.file_reference = new byte[0];
        return tLRPC$TL_photo;
    }

    private static int prepareSendingDocumentInternal(final org.telegram.messenger.AccountInstance r32, java.lang.String r33, java.lang.String r34, android.net.Uri r35, java.lang.String r36, final long r37, final org.telegram.messenger.MessageObject r39, final org.telegram.messenger.MessageObject r40, final org.telegram.tgnet.tl.TL_stories$StoryItem r41, final org.telegram.ui.ChatActivity.ReplyQuote r42, final java.util.ArrayList<org.telegram.tgnet.TLRPC$MessageEntity> r43, final org.telegram.messenger.MessageObject r44, long[] r45, boolean r46, java.lang.CharSequence r47, final boolean r48, final int r49, java.lang.Integer[] r50, boolean r51, final java.lang.String r52, final int r53, final long r54, final boolean r56) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.prepareSendingDocumentInternal(org.telegram.messenger.AccountInstance, java.lang.String, java.lang.String, android.net.Uri, java.lang.String, long, org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject, org.telegram.tgnet.tl.TL_stories$StoryItem, org.telegram.ui.ChatActivity$ReplyQuote, java.util.ArrayList, org.telegram.messenger.MessageObject, long[], boolean, java.lang.CharSequence, boolean, int, java.lang.Integer[], boolean, java.lang.String, int, long, boolean):int");
    }

    public static void lambda$prepareSendingDocumentInternal$76(MessageObject messageObject, AccountInstance accountInstance, TLRPC$TL_document tLRPC$TL_document, String str, HashMap hashMap, String str2, long j, MessageObject messageObject2, MessageObject messageObject3, String str3, ArrayList arrayList, boolean z, int i, TL_stories$StoryItem tL_stories$StoryItem, ChatActivity.ReplyQuote replyQuote, String str4, int i2, long j2, boolean z2) {
        if (messageObject != null) {
            accountInstance.getSendMessagesHelper().editMessage(messageObject, null, null, tLRPC$TL_document, str, hashMap, false, false, str2);
            return;
        }
        SendMessageParams of = SendMessageParams.of(tLRPC$TL_document, null, str, j, messageObject2, messageObject3, str3, arrayList, null, hashMap, z, i, 0, str2, null, false);
        of.replyToStoryItem = tL_stories$StoryItem;
        of.replyQuote = replyQuote;
        of.quick_reply_shortcut = str4;
        of.quick_reply_shortcut_id = i2;
        of.effect_id = j2;
        of.invert_media = z2;
        accountInstance.getSendMessagesHelper().sendMessage(of);
    }

    private static boolean checkFileSize(AccountInstance accountInstance, Uri uri) {
        long j = 0;
        if (Build.VERSION.SDK_INT >= 19) {
            try {
                AssetFileDescriptor openAssetFileDescriptor = ApplicationLoader.applicationContext.getContentResolver().openAssetFileDescriptor(uri, "r", null);
                if (openAssetFileDescriptor != null) {
                    openAssetFileDescriptor.getLength();
                }
                Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(uri, new String[]{"_size"}, null, null, null);
                int columnIndex = query.getColumnIndex("_size");
                query.moveToFirst();
                j = query.getLong(columnIndex);
                query.close();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return !FileLoader.checkUploadFileSize(accountInstance.getCurrentAccount(), j);
    }

    public static void prepareSendingDocument(AccountInstance accountInstance, String str, String str2, Uri uri, String str3, String str4, long j, MessageObject messageObject, MessageObject messageObject2, TL_stories$StoryItem tL_stories$StoryItem, ChatActivity.ReplyQuote replyQuote, MessageObject messageObject3, boolean z, int i, InputContentInfoCompat inputContentInfoCompat, String str5, int i2, boolean z2) {
        if ((str == null || str2 == null) && uri == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = null;
        if (uri != null) {
            arrayList3 = new ArrayList();
            arrayList3.add(uri);
        }
        if (str != null) {
            arrayList.add(str);
            arrayList2.add(str2);
        }
        prepareSendingDocuments(accountInstance, arrayList, arrayList2, arrayList3, str3, str4, j, messageObject, messageObject2, tL_stories$StoryItem, replyQuote, messageObject3, z, i, inputContentInfoCompat, str5, i2, 0L, z2);
    }

    public static void prepareSendingAudioDocuments(final AccountInstance accountInstance, final ArrayList<MessageObject> arrayList, final CharSequence charSequence, final long j, final MessageObject messageObject, final MessageObject messageObject2, final TL_stories$StoryItem tL_stories$StoryItem, final boolean z, final int i, final MessageObject messageObject3, final String str, final int i2, final long j2, final boolean z2) {
        new Thread(new Runnable() {
            @Override
            public final void run() {
                SendMessagesHelper.lambda$prepareSendingAudioDocuments$78(arrayList, j, accountInstance, charSequence, messageObject3, messageObject, messageObject2, z, i, tL_stories$StoryItem, str, i2, j2, z2);
            }
        }).start();
    }

    public static void lambda$prepareSendingAudioDocuments$78(java.util.ArrayList r29, final long r30, final org.telegram.messenger.AccountInstance r32, java.lang.CharSequence r33, final org.telegram.messenger.MessageObject r34, final org.telegram.messenger.MessageObject r35, final org.telegram.messenger.MessageObject r36, final boolean r37, final int r38, final org.telegram.tgnet.tl.TL_stories$StoryItem r39, final java.lang.String r40, final int r41, final long r42, final boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.lambda$prepareSendingAudioDocuments$78(java.util.ArrayList, long, org.telegram.messenger.AccountInstance, java.lang.CharSequence, org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject, boolean, int, org.telegram.tgnet.tl.TL_stories$StoryItem, java.lang.String, int, long, boolean):void");
    }

    public static void lambda$prepareSendingAudioDocuments$77(MessageObject messageObject, AccountInstance accountInstance, TLRPC$TL_document tLRPC$TL_document, MessageObject messageObject2, HashMap hashMap, String str, long j, MessageObject messageObject3, MessageObject messageObject4, String str2, ArrayList arrayList, boolean z, int i, TL_stories$StoryItem tL_stories$StoryItem, String str3, int i2, long j2, boolean z2) {
        if (messageObject != null) {
            accountInstance.getSendMessagesHelper().editMessage(messageObject, null, null, tLRPC$TL_document, messageObject2.messageOwner.attachPath, hashMap, false, false, str);
            return;
        }
        SendMessageParams of = SendMessageParams.of(tLRPC$TL_document, null, messageObject2.messageOwner.attachPath, j, messageObject3, messageObject4, str2, arrayList, null, hashMap, z, i, 0, str, null, false, false);
        of.replyToStoryItem = tL_stories$StoryItem;
        of.quick_reply_shortcut = str3;
        of.quick_reply_shortcut_id = i2;
        of.effect_id = j2;
        of.invert_media = z2;
        accountInstance.getSendMessagesHelper().sendMessage(of);
    }

    private static void finishGroup(final AccountInstance accountInstance, final long j, final int i) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SendMessagesHelper.lambda$finishGroup$79(AccountInstance.this, j, i);
            }
        });
    }

    public static void lambda$finishGroup$79(AccountInstance accountInstance, long j, int i) {
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
        TLRPC$TL_messages_messages tLRPC$TL_messages_messages = new TLRPC$TL_messages_messages();
        tLRPC$TL_messages_messages.messages.add(messageObject.messageOwner);
        if (!delayedMessage.paidMedia) {
            accountInstance.getMessagesStorage().putMessages((TLRPC$messages_Messages) tLRPC$TL_messages_messages, delayedMessage.peer, -2, 0, false, i != 0 ? 1 : 0, 0L);
        }
        sendMessagesHelper.sendReadyToSendGroup(delayedMessage, true, true);
    }

    public static void prepareSendingDocuments(final AccountInstance accountInstance, final ArrayList<String> arrayList, final ArrayList<String> arrayList2, final ArrayList<Uri> arrayList3, final String str, final String str2, final long j, final MessageObject messageObject, final MessageObject messageObject2, final TL_stories$StoryItem tL_stories$StoryItem, final ChatActivity.ReplyQuote replyQuote, final MessageObject messageObject3, final boolean z, final int i, final InputContentInfoCompat inputContentInfoCompat, final String str3, final int i2, final long j2, final boolean z2) {
        if (arrayList == null && arrayList2 == null && arrayList3 == null) {
            return;
        }
        if (arrayList == null || arrayList2 == null || arrayList.size() == arrayList2.size()) {
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    SendMessagesHelper.lambda$prepareSendingDocuments$80(j, arrayList, str, accountInstance, i, arrayList2, str2, messageObject, messageObject2, tL_stories$StoryItem, replyQuote, messageObject3, z, inputContentInfoCompat, str3, i2, j2, z2, arrayList3);
                }
            });
        }
    }

    public static void lambda$prepareSendingDocuments$80(long j, ArrayList arrayList, String str, AccountInstance accountInstance, int i, ArrayList arrayList2, String str2, MessageObject messageObject, MessageObject messageObject2, TL_stories$StoryItem tL_stories$StoryItem, ChatActivity.ReplyQuote replyQuote, MessageObject messageObject3, boolean z, InputContentInfoCompat inputContentInfoCompat, String str3, int i2, long j2, boolean z2, ArrayList arrayList3) {
        Integer[] numArr;
        long[] jArr;
        ArrayList arrayList4;
        int i3;
        boolean z3;
        AccountInstance accountInstance2;
        AccountInstance accountInstance3 = accountInstance;
        int i4 = i;
        int i5 = 1;
        long[] jArr2 = new long[1];
        Integer[] numArr2 = new Integer[1];
        boolean isEncryptedDialog = DialogObject.isEncryptedDialog(j);
        int i6 = 10;
        if (arrayList != null) {
            int size = arrayList.size();
            i3 = 0;
            int i7 = 0;
            boolean z4 = true;
            int i8 = 0;
            while (i8 < size) {
                String str4 = i8 == 0 ? str : null;
                if (!isEncryptedDialog && size > i5 && i7 % 10 == 0) {
                    if (jArr2[0] != 0) {
                        finishGroup(accountInstance3, jArr2[0], i4);
                    }
                    jArr2[0] = Utilities.random.nextLong();
                    i7 = 0;
                }
                int i9 = i7 + 1;
                long j3 = jArr2[0];
                int i10 = i8;
                int i11 = size;
                Integer[] numArr3 = numArr2;
                long[] jArr3 = jArr2;
                i3 = prepareSendingDocumentInternal(accountInstance, (String) arrayList.get(i8), (String) arrayList2.get(i8), null, str2, j, messageObject, messageObject2, tL_stories$StoryItem, replyQuote, null, messageObject3, jArr3, i9 == i6 || i8 == size + (-1), str4, z, i, numArr3, inputContentInfoCompat == null, str3, i2, z4 ? j2 : 0L, z2);
                i7 = (j3 != jArr3[0] || jArr3[0] == -1) ? 1 : i9;
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
            arrayList4 = arrayList3;
            z3 = z4;
        } else {
            numArr = numArr2;
            jArr = jArr2;
            arrayList4 = arrayList3;
            i3 = 0;
            z3 = true;
        }
        if (arrayList4 != null) {
            jArr[0] = 0;
            int size2 = arrayList3.size();
            int i12 = 0;
            int i13 = 0;
            while (i13 < arrayList3.size()) {
                String str5 = (i13 == 0 && (arrayList == null || arrayList.size() == 0)) ? str : null;
                if (isEncryptedDialog) {
                    accountInstance2 = accountInstance;
                } else if (size2 <= 1 || i12 % 10 != 0) {
                    accountInstance2 = accountInstance;
                } else {
                    if (jArr[0] != 0) {
                        accountInstance2 = accountInstance;
                        finishGroup(accountInstance2, jArr[0], i);
                    } else {
                        accountInstance2 = accountInstance;
                    }
                    jArr[0] = Utilities.random.nextLong();
                    i12 = 0;
                }
                int i14 = i12 + 1;
                long j4 = jArr[0];
                int i15 = i13;
                int i16 = size2;
                i3 = prepareSendingDocumentInternal(accountInstance, null, null, (Uri) arrayList4.get(i13), str2, j, messageObject, messageObject2, tL_stories$StoryItem, replyQuote, null, messageObject3, jArr, i14 == 10 || i13 == size2 + (-1), str5, z, i, numArr, inputContentInfoCompat == null, str3, i2, z3 ? j2 : 0L, z2);
                i12 = (j4 != jArr[0] || jArr[0] == -1) ? 1 : i14;
                i13 = i15 + 1;
                arrayList4 = arrayList3;
                size2 = i16;
                z3 = false;
            }
        }
        if (inputContentInfoCompat != null) {
            inputContentInfoCompat.releasePermission();
        }
        handleError(i3, accountInstance);
    }

    private static void handleError(final int i, final AccountInstance accountInstance) {
        if (i != 0) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    SendMessagesHelper.lambda$handleError$81(i, accountInstance);
                }
            });
        }
    }

    public static void lambda$handleError$81(int i, AccountInstance accountInstance) {
        try {
            if (i == 1) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString("UnsupportedAttachment", R.string.UnsupportedAttachment));
            } else if (i != 2) {
            } else {
                NotificationCenter.getInstance(accountInstance.getCurrentAccount()).lambda$postNotificationNameOnUIThread$1(NotificationCenter.currentUserShowLimitReachedDialog, 6);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void prepareSendingPhoto(AccountInstance accountInstance, String str, Uri uri, long j, MessageObject messageObject, MessageObject messageObject2, ChatActivity.ReplyQuote replyQuote, CharSequence charSequence, ArrayList<TLRPC$MessageEntity> arrayList, ArrayList<TLRPC$InputDocument> arrayList2, InputContentInfoCompat inputContentInfoCompat, int i, MessageObject messageObject3, boolean z, int i2, int i3, String str2, int i4) {
        prepareSendingPhoto(accountInstance, str, null, uri, j, messageObject, messageObject2, null, null, arrayList, arrayList2, inputContentInfoCompat, i, messageObject3, null, z, i2, i3, false, charSequence, str2, i4, 0L);
    }

    public static void prepareSendingPhoto(AccountInstance accountInstance, String str, String str2, Uri uri, long j, MessageObject messageObject, MessageObject messageObject2, TL_stories$StoryItem tL_stories$StoryItem, ChatActivity.ReplyQuote replyQuote, ArrayList<TLRPC$MessageEntity> arrayList, ArrayList<TLRPC$InputDocument> arrayList2, InputContentInfoCompat inputContentInfoCompat, int i, MessageObject messageObject3, VideoEditedInfo videoEditedInfo, boolean z, int i2, int i3, boolean z2, CharSequence charSequence, String str3, int i4, long j2) {
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
        prepareSendingMedia(accountInstance, arrayList3, j, messageObject, messageObject2, null, replyQuote, z2, false, messageObject3, z, i2, i3, false, inputContentInfoCompat, str3, i4, j2, false);
    }

    public static void prepareSendingBotContextResult(final BaseFragment baseFragment, final AccountInstance accountInstance, final TLRPC$BotInlineResult tLRPC$BotInlineResult, final HashMap<String, String> hashMap, final long j, final MessageObject messageObject, final MessageObject messageObject2, final TL_stories$StoryItem tL_stories$StoryItem, final ChatActivity.ReplyQuote replyQuote, final boolean z, final int i, final String str, final int i2) {
        SendMessageParams of;
        if (tLRPC$BotInlineResult == null) {
            return;
        }
        TLRPC$BotInlineMessage tLRPC$BotInlineMessage = tLRPC$BotInlineResult.send_message;
        if (tLRPC$BotInlineMessage instanceof TLRPC$TL_botInlineMessageMediaAuto) {
            new Thread(new Runnable() {
                @Override
                public final void run() {
                    SendMessagesHelper.lambda$prepareSendingBotContextResult$85(j, tLRPC$BotInlineResult, accountInstance, hashMap, baseFragment, messageObject, messageObject2, z, i, str, i2, tL_stories$StoryItem, replyQuote);
                }
            }).run();
            return;
        }
        if (tLRPC$BotInlineMessage instanceof TLRPC$TL_botInlineMessageText) {
            TLRPC$TL_webPagePending tLRPC$TL_webPagePending = null;
            if (DialogObject.isEncryptedDialog(j)) {
                int i3 = 0;
                while (true) {
                    if (i3 >= tLRPC$BotInlineResult.send_message.entities.size()) {
                        break;
                    }
                    TLRPC$MessageEntity tLRPC$MessageEntity = tLRPC$BotInlineResult.send_message.entities.get(i3);
                    if (tLRPC$MessageEntity instanceof TLRPC$TL_messageEntityUrl) {
                        tLRPC$TL_webPagePending = new TLRPC$TL_webPagePending();
                        String str2 = tLRPC$BotInlineResult.send_message.message;
                        int i4 = tLRPC$MessageEntity.offset;
                        tLRPC$TL_webPagePending.url = str2.substring(i4, tLRPC$MessageEntity.length + i4);
                        break;
                    }
                    i3++;
                }
            }
            TLRPC$TL_webPagePending tLRPC$TL_webPagePending2 = tLRPC$TL_webPagePending;
            TLRPC$BotInlineMessage tLRPC$BotInlineMessage2 = tLRPC$BotInlineResult.send_message;
            SendMessageParams of2 = SendMessageParams.of(tLRPC$BotInlineMessage2.message, j, messageObject, messageObject2, tLRPC$TL_webPagePending2, !tLRPC$BotInlineMessage2.no_webpage, tLRPC$BotInlineMessage2.entities, tLRPC$BotInlineMessage2.reply_markup, hashMap, z, i, null, false);
            of2.quick_reply_shortcut = str;
            of2.quick_reply_shortcut_id = i2;
            accountInstance.getSendMessagesHelper().sendMessage(of2);
            return;
        }
        if (tLRPC$BotInlineMessage instanceof TLRPC$TL_botInlineMessageMediaVenue) {
            TLRPC$TL_messageMediaVenue tLRPC$TL_messageMediaVenue = new TLRPC$TL_messageMediaVenue();
            TLRPC$BotInlineMessage tLRPC$BotInlineMessage3 = tLRPC$BotInlineResult.send_message;
            tLRPC$TL_messageMediaVenue.geo = tLRPC$BotInlineMessage3.geo;
            tLRPC$TL_messageMediaVenue.address = tLRPC$BotInlineMessage3.address;
            tLRPC$TL_messageMediaVenue.title = tLRPC$BotInlineMessage3.title;
            tLRPC$TL_messageMediaVenue.provider = tLRPC$BotInlineMessage3.provider;
            tLRPC$TL_messageMediaVenue.venue_id = tLRPC$BotInlineMessage3.venue_id;
            String str3 = tLRPC$BotInlineMessage3.venue_type;
            tLRPC$TL_messageMediaVenue.venue_id = str3;
            tLRPC$TL_messageMediaVenue.venue_type = str3;
            if (str3 == null) {
                tLRPC$TL_messageMediaVenue.venue_type = "";
            }
            SendMessageParams of3 = SendMessageParams.of(tLRPC$TL_messageMediaVenue, j, messageObject, messageObject2, tLRPC$BotInlineMessage3.reply_markup, hashMap, z, i);
            of3.quick_reply_shortcut = str;
            of3.quick_reply_shortcut_id = i2;
            accountInstance.getSendMessagesHelper().sendMessage(of3);
            return;
        }
        if (tLRPC$BotInlineMessage instanceof TLRPC$TL_botInlineMessageMediaGeo) {
            if (tLRPC$BotInlineMessage.period != 0 || tLRPC$BotInlineMessage.proximity_notification_radius != 0) {
                TLRPC$TL_messageMediaGeoLive tLRPC$TL_messageMediaGeoLive = new TLRPC$TL_messageMediaGeoLive();
                TLRPC$BotInlineMessage tLRPC$BotInlineMessage4 = tLRPC$BotInlineResult.send_message;
                int i5 = tLRPC$BotInlineMessage4.period;
                if (i5 == 0) {
                    i5 = 900;
                }
                tLRPC$TL_messageMediaGeoLive.period = i5;
                tLRPC$TL_messageMediaGeoLive.geo = tLRPC$BotInlineMessage4.geo;
                tLRPC$TL_messageMediaGeoLive.heading = tLRPC$BotInlineMessage4.heading;
                tLRPC$TL_messageMediaGeoLive.proximity_notification_radius = tLRPC$BotInlineMessage4.proximity_notification_radius;
                of = SendMessageParams.of(tLRPC$TL_messageMediaGeoLive, j, messageObject, messageObject2, tLRPC$BotInlineMessage4.reply_markup, hashMap, z, i);
            } else {
                TLRPC$TL_messageMediaGeo tLRPC$TL_messageMediaGeo = new TLRPC$TL_messageMediaGeo();
                TLRPC$BotInlineMessage tLRPC$BotInlineMessage5 = tLRPC$BotInlineResult.send_message;
                tLRPC$TL_messageMediaGeo.geo = tLRPC$BotInlineMessage5.geo;
                tLRPC$TL_messageMediaGeo.heading = tLRPC$BotInlineMessage5.heading;
                of = SendMessageParams.of(tLRPC$TL_messageMediaGeo, j, messageObject, messageObject2, tLRPC$BotInlineMessage5.reply_markup, hashMap, z, i);
            }
            of.quick_reply_shortcut = str;
            of.quick_reply_shortcut_id = i2;
            accountInstance.getSendMessagesHelper().sendMessage(of);
            return;
        }
        if (tLRPC$BotInlineMessage instanceof TLRPC$TL_botInlineMessageMediaContact) {
            TLRPC$TL_user tLRPC$TL_user = new TLRPC$TL_user();
            TLRPC$BotInlineMessage tLRPC$BotInlineMessage6 = tLRPC$BotInlineResult.send_message;
            tLRPC$TL_user.phone = tLRPC$BotInlineMessage6.phone_number;
            tLRPC$TL_user.first_name = tLRPC$BotInlineMessage6.first_name;
            tLRPC$TL_user.last_name = tLRPC$BotInlineMessage6.last_name;
            TLRPC$TL_restrictionReason tLRPC$TL_restrictionReason = new TLRPC$TL_restrictionReason();
            tLRPC$TL_restrictionReason.text = tLRPC$BotInlineResult.send_message.vcard;
            tLRPC$TL_restrictionReason.platform = "";
            tLRPC$TL_restrictionReason.reason = "";
            tLRPC$TL_user.restriction_reason.add(tLRPC$TL_restrictionReason);
            SendMessageParams of4 = SendMessageParams.of(tLRPC$TL_user, j, messageObject, messageObject2, tLRPC$BotInlineResult.send_message.reply_markup, hashMap, z, i);
            of4.quick_reply_shortcut = str;
            of4.quick_reply_shortcut_id = i2;
            accountInstance.getSendMessagesHelper().sendMessage(of4);
            return;
        }
        if (tLRPC$BotInlineMessage instanceof TLRPC$TL_botInlineMessageMediaInvoice) {
            if (DialogObject.isEncryptedDialog(j)) {
                return;
            }
            TLRPC$TL_botInlineMessageMediaInvoice tLRPC$TL_botInlineMessageMediaInvoice = (TLRPC$TL_botInlineMessageMediaInvoice) tLRPC$BotInlineResult.send_message;
            TLRPC$TL_messageMediaInvoice tLRPC$TL_messageMediaInvoice = new TLRPC$TL_messageMediaInvoice();
            tLRPC$TL_messageMediaInvoice.shipping_address_requested = tLRPC$TL_botInlineMessageMediaInvoice.shipping_address_requested;
            tLRPC$TL_messageMediaInvoice.test = tLRPC$TL_botInlineMessageMediaInvoice.test;
            tLRPC$TL_messageMediaInvoice.title = tLRPC$TL_botInlineMessageMediaInvoice.title;
            tLRPC$TL_messageMediaInvoice.description = tLRPC$TL_botInlineMessageMediaInvoice.description;
            TLRPC$WebDocument tLRPC$WebDocument = tLRPC$TL_botInlineMessageMediaInvoice.photo;
            if (tLRPC$WebDocument != null) {
                tLRPC$TL_messageMediaInvoice.webPhoto = tLRPC$WebDocument;
                tLRPC$TL_messageMediaInvoice.flags |= 1;
            }
            tLRPC$TL_messageMediaInvoice.currency = tLRPC$TL_botInlineMessageMediaInvoice.currency;
            tLRPC$TL_messageMediaInvoice.total_amount = tLRPC$TL_botInlineMessageMediaInvoice.total_amount;
            tLRPC$TL_messageMediaInvoice.start_param = "";
            SendMessageParams of5 = SendMessageParams.of(tLRPC$TL_messageMediaInvoice, j, messageObject, messageObject2, tLRPC$BotInlineResult.send_message.reply_markup, hashMap, z, i);
            of5.quick_reply_shortcut = str;
            of5.quick_reply_shortcut_id = i2;
            accountInstance.getSendMessagesHelper().sendMessage(of5);
            return;
        }
        if (tLRPC$BotInlineMessage instanceof TLRPC$TL_botInlineMessageMediaWebPage) {
            TLRPC$TL_webPagePending tLRPC$TL_webPagePending3 = new TLRPC$TL_webPagePending();
            tLRPC$TL_webPagePending3.url = ((TLRPC$TL_botInlineMessageMediaWebPage) tLRPC$BotInlineMessage).url;
            TLRPC$BotInlineMessage tLRPC$BotInlineMessage7 = tLRPC$BotInlineResult.send_message;
            SendMessageParams of6 = SendMessageParams.of(tLRPC$BotInlineMessage7.message, j, messageObject, messageObject2, tLRPC$TL_webPagePending3, !tLRPC$BotInlineMessage7.no_webpage, tLRPC$BotInlineMessage7.entities, tLRPC$BotInlineMessage7.reply_markup, hashMap, z, i, null, false);
            of6.quick_reply_shortcut = str;
            of6.quick_reply_shortcut_id = i2;
            accountInstance.getSendMessagesHelper().sendMessage(of6);
        }
    }

    public static void lambda$prepareSendingBotContextResult$85(final long r24, final org.telegram.tgnet.TLRPC$BotInlineResult r26, final org.telegram.messenger.AccountInstance r27, final java.util.HashMap r28, final org.telegram.ui.ActionBar.BaseFragment r29, final org.telegram.messenger.MessageObject r30, final org.telegram.messenger.MessageObject r31, final boolean r32, final int r33, final java.lang.String r34, final int r35, final org.telegram.tgnet.tl.TL_stories$StoryItem r36, final org.telegram.ui.ChatActivity.ReplyQuote r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.lambda$prepareSendingBotContextResult$85(long, org.telegram.tgnet.TLRPC$BotInlineResult, org.telegram.messenger.AccountInstance, java.util.HashMap, org.telegram.ui.ActionBar.BaseFragment, org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject, boolean, int, java.lang.String, int, org.telegram.tgnet.tl.TL_stories$StoryItem, org.telegram.ui.ChatActivity$ReplyQuote):void");
    }

    public static void lambda$prepareSendingBotContextResult$84(TLRPC$TL_document tLRPC$TL_document, Bitmap[] bitmapArr, String[] strArr, String str, long j, MessageObject messageObject, MessageObject messageObject2, TLRPC$BotInlineResult tLRPC$BotInlineResult, HashMap hashMap, boolean z, int i, TLRPC$TL_photo tLRPC$TL_photo, TLRPC$TL_game tLRPC$TL_game, String str2, int i2, TL_stories$StoryItem tL_stories$StoryItem, ChatActivity.ReplyQuote replyQuote, AccountInstance accountInstance) {
        SendMessageParams sendMessageParams = null;
        if (tLRPC$TL_document != null) {
            if (bitmapArr[0] != null && strArr[0] != null) {
                ImageLoader.getInstance().putImageToCache(new BitmapDrawable(bitmapArr[0]), strArr[0], false);
            }
            TLRPC$BotInlineMessage tLRPC$BotInlineMessage = tLRPC$BotInlineResult.send_message;
            sendMessageParams = SendMessageParams.of(tLRPC$TL_document, null, str, j, messageObject, messageObject2, tLRPC$BotInlineMessage.message, tLRPC$BotInlineMessage.entities, tLRPC$BotInlineMessage.reply_markup, hashMap, z, i, 0, tLRPC$BotInlineResult, null, false);
        } else if (tLRPC$TL_photo != null) {
            TLRPC$WebDocument tLRPC$WebDocument = tLRPC$BotInlineResult.content;
            String str3 = tLRPC$WebDocument != null ? tLRPC$WebDocument.url : null;
            TLRPC$BotInlineMessage tLRPC$BotInlineMessage2 = tLRPC$BotInlineResult.send_message;
            sendMessageParams = SendMessageParams.of(tLRPC$TL_photo, str3, j, messageObject, messageObject2, tLRPC$BotInlineMessage2.message, tLRPC$BotInlineMessage2.entities, tLRPC$BotInlineMessage2.reply_markup, hashMap, z, i, 0, tLRPC$BotInlineResult, false);
        } else if (tLRPC$TL_game != null) {
            sendMessageParams = SendMessageParams.of(tLRPC$TL_game, j, messageObject, messageObject2, tLRPC$BotInlineResult.send_message.reply_markup, (HashMap<String, String>) hashMap, z, i);
        }
        if (sendMessageParams != null) {
            sendMessageParams.quick_reply_shortcut = str2;
            sendMessageParams.quick_reply_shortcut_id = i2;
            sendMessageParams.replyToStoryItem = tL_stories$StoryItem;
            sendMessageParams.replyQuote = replyQuote;
            accountInstance.getSendMessagesHelper().sendMessage(sendMessageParams);
        }
    }

    private static String getTrimmedString(String str) {
        String trim = str.trim();
        if (trim.length() == 0) {
            return trim;
        }
        while (str.startsWith("\n")) {
            str = str.substring(1);
        }
        while (str.endsWith("\n")) {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }

    public static void prepareSendingText(AccountInstance accountInstance, String str, long j, boolean z, int i, long j2) {
        prepareSendingText(accountInstance, str, j, 0L, z, i, j2);
    }

    public static void lambda$prepareSendingText$87(final String str, final long j, final AccountInstance accountInstance, final long j2, final boolean z, final int i, final long j3) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SendMessagesHelper.lambda$prepareSendingText$86(str, j, accountInstance, j2, z, i, j3);
            }
        });
    }

    public static void lambda$prepareSendingText$88(final String str, final long j, final AccountInstance accountInstance, final long j2, final boolean z, final int i, final long j3) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                SendMessagesHelper.lambda$prepareSendingText$87(str, j, accountInstance, j2, z, i, j3);
            }
        });
    }

    public static void prepareSendingText(final AccountInstance accountInstance, final String str, final long j, final long j2, final boolean z, final int i, final long j3) {
        accountInstance.getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                SendMessagesHelper.lambda$prepareSendingText$88(str, j2, accountInstance, j, z, i, j3);
            }
        });
    }

    public static void lambda$prepareSendingText$86(String str, long j, AccountInstance accountInstance, long j2, boolean z, int i, long j3) {
        TLRPC$TL_forumTopic findTopic;
        String trimmedString = getTrimmedString(str);
        if (trimmedString.length() != 0) {
            int ceil = (int) Math.ceil(trimmedString.length() / 4096.0f);
            MessageObject messageObject = null;
            int i2 = 0;
            if (j != 0 && (findTopic = accountInstance.getMessagesController().getTopicsController().findTopic(-j2, j)) != null && findTopic.topicStartMessage != null) {
                messageObject = new MessageObject(accountInstance.getCurrentAccount(), findTopic.topicStartMessage, false, false);
                messageObject.isTopicMainMessage = true;
            }
            while (i2 < ceil) {
                int i3 = i2 + 1;
                SendMessageParams of = SendMessageParams.of(trimmedString.substring(i2 * 4096, Math.min(i3 * 4096, trimmedString.length())), j2, messageObject, messageObject, null, true, null, null, null, z, i, null, false);
                if (i2 == 0) {
                    of.effect_id = j3;
                }
                accountInstance.getSendMessagesHelper().sendMessage(of);
                i2 = i3;
            }
        }
    }

    public static void ensureMediaThumbExists(AccountInstance accountInstance, boolean z, TLObject tLObject, String str, Uri uri, long j) {
        TLRPC$PhotoSize scaleAndSaveImage;
        TLRPC$PhotoSize scaleAndSaveImage2;
        if (tLObject instanceof TLRPC$TL_photo) {
            TLRPC$TL_photo tLRPC$TL_photo = (TLRPC$TL_photo) tLObject;
            TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tLRPC$TL_photo.sizes, 90);
            boolean exists = ((closestPhotoSizeWithSize instanceof TLRPC$TL_photoStrippedSize) || (closestPhotoSizeWithSize instanceof TLRPC$TL_photoPathSize)) ? true : FileLoader.getInstance(accountInstance.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize, true).exists();
            TLRPC$PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(tLRPC$TL_photo.sizes, AndroidUtilities.getPhotoSize());
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
                tLRPC$TL_photo.sizes.add(0, scaleAndSaveImage2);
            }
            if (!exists && (scaleAndSaveImage = ImageLoader.scaleAndSaveImage(closestPhotoSizeWithSize, bitmap, 90.0f, 90.0f, 55, true, false)) != closestPhotoSizeWithSize) {
                tLRPC$TL_photo.sizes.add(0, scaleAndSaveImage);
            }
            if (bitmap != null) {
                bitmap.recycle();
                return;
            }
            return;
        }
        if (tLObject instanceof TLRPC$TL_document) {
            TLRPC$TL_document tLRPC$TL_document = (TLRPC$TL_document) tLObject;
            if ((MessageObject.isVideoDocument(tLRPC$TL_document) || MessageObject.isNewGifDocument(tLRPC$TL_document)) && MessageObject.isDocumentHasThumb(tLRPC$TL_document)) {
                TLRPC$PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(tLRPC$TL_document.thumbs, 320);
                if ((closestPhotoSizeWithSize3 instanceof TLRPC$TL_photoStrippedSize) || (closestPhotoSizeWithSize3 instanceof TLRPC$TL_photoPathSize) || FileLoader.getInstance(accountInstance.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize3, true).exists()) {
                    return;
                }
                Bitmap createVideoThumbnailAtTime = createVideoThumbnailAtTime(str, j);
                Bitmap createVideoThumbnail = createVideoThumbnailAtTime == null ? createVideoThumbnail(str, 1) : createVideoThumbnailAtTime;
                int i = z ? 90 : 320;
                float f = i;
                tLRPC$TL_document.thumbs.set(0, ImageLoader.scaleAndSaveImage(closestPhotoSizeWithSize3, createVideoThumbnail, f, f, i > 90 ? 80 : 55, false, true));
            }
        }
    }

    public static String getKeyForPhotoSize(AccountInstance accountInstance, TLRPC$PhotoSize tLRPC$PhotoSize, Bitmap[] bitmapArr, boolean z, boolean z2) {
        if (tLRPC$PhotoSize == null || tLRPC$PhotoSize.location == null) {
            return null;
        }
        Point messageSize = ChatMessageCell.getMessageSize(tLRPC$PhotoSize.w, tLRPC$PhotoSize.h);
        if (bitmapArr != null) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                File pathToAttach = FileLoader.getInstance(accountInstance.getCurrentAccount()).getPathToAttach(tLRPC$PhotoSize, z2);
                FileInputStream fileInputStream = new FileInputStream(pathToAttach);
                BitmapFactory.decodeStream(fileInputStream, null, options);
                fileInputStream.close();
                float max = Math.max(options.outWidth / messageSize.x, options.outHeight / messageSize.y);
                if (max < 1.0f) {
                    max = 1.0f;
                }
                options.inJustDecodeBounds = false;
                options.inSampleSize = (int) max;
                options.inPreferredConfig = Bitmap.Config.RGB_565;
                if (Build.VERSION.SDK_INT >= 21) {
                    FileInputStream fileInputStream2 = new FileInputStream(pathToAttach);
                    bitmapArr[0] = BitmapFactory.decodeStream(fileInputStream2, null, options);
                    fileInputStream2.close();
                }
            } catch (Throwable unused) {
            }
        }
        return String.format(Locale.US, z ? "%d_%d@%d_%d_b" : "%d_%d@%d_%d", Long.valueOf(tLRPC$PhotoSize.location.volume_id), Integer.valueOf(tLRPC$PhotoSize.location.local_id), Integer.valueOf((int) (messageSize.x / AndroidUtilities.density)), Integer.valueOf((int) (messageSize.y / AndroidUtilities.density)));
    }

    public static boolean shouldSendWebPAsSticker(String str, Uri uri) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        if (str != null) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
                MappedByteBuffer map = randomAccessFile.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, str.length());
                Utilities.loadWebpImage(null, map, map.limit(), options, true);
                randomAccessFile.close();
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else {
            try {
                InputStream openInputStream = ApplicationLoader.applicationContext.getContentResolver().openInputStream(uri);
                try {
                    BitmapFactory.decodeStream(openInputStream, null, options);
                    if (openInputStream != null) {
                        openInputStream.close();
                    }
                } finally {
                }
            } catch (Exception unused) {
            }
        }
        return options.outWidth < 800 && options.outHeight < 800;
    }

    public static void prepareSendingMedia(final AccountInstance accountInstance, final ArrayList<SendingMediaInfo> arrayList, final long j, final MessageObject messageObject, final MessageObject messageObject2, final TL_stories$StoryItem tL_stories$StoryItem, final ChatActivity.ReplyQuote replyQuote, final boolean z, boolean z2, final MessageObject messageObject3, final boolean z3, final int i, int i2, final boolean z4, final InputContentInfoCompat inputContentInfoCompat, final String str, final int i3, final long j2, final boolean z5) {
        final boolean z6;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                z6 = z2;
                break;
            } else {
                if (arrayList.get(i4).ttl > 0) {
                    z6 = false;
                    break;
                }
                i4++;
            }
        }
        mediaSendQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                SendMessagesHelper.lambda$prepareSendingMedia$94(arrayList, j, z, z6, accountInstance, messageObject3, messageObject, messageObject2, z3, i, tL_stories$StoryItem, replyQuote, str, i3, j2, z5, inputContentInfoCompat, z4);
            }
        });
    }

    public static void lambda$prepareSendingMedia$94(java.util.ArrayList r72, final long r73, boolean r75, boolean r76, final org.telegram.messenger.AccountInstance r77, final org.telegram.messenger.MessageObject r78, final org.telegram.messenger.MessageObject r79, final org.telegram.messenger.MessageObject r80, final boolean r81, final int r82, final org.telegram.tgnet.tl.TL_stories$StoryItem r83, final org.telegram.ui.ChatActivity.ReplyQuote r84, final java.lang.String r85, final int r86, final long r87, final boolean r89, androidx.core.view.inputmethod.InputContentInfoCompat r90, final boolean r91) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.lambda$prepareSendingMedia$94(java.util.ArrayList, long, boolean, boolean, org.telegram.messenger.AccountInstance, org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject, boolean, int, org.telegram.tgnet.tl.TL_stories$StoryItem, org.telegram.ui.ChatActivity$ReplyQuote, java.lang.String, int, long, boolean, androidx.core.view.inputmethod.InputContentInfoCompat, boolean):void");
    }

    public static void lambda$prepareSendingMedia$89(MediaSendPrepareWorker mediaSendPrepareWorker, AccountInstance accountInstance, SendingMediaInfo sendingMediaInfo, boolean z) {
        mediaSendPrepareWorker.photo = accountInstance.getSendMessagesHelper().generatePhotoSizes(sendingMediaInfo.path, sendingMediaInfo.uri);
        if (z && sendingMediaInfo.canDeleteAfter) {
            new File(sendingMediaInfo.path).delete();
        }
        mediaSendPrepareWorker.sync.countDown();
    }

    public static void lambda$prepareSendingMedia$90(MessageObject messageObject, AccountInstance accountInstance, TLRPC$TL_document tLRPC$TL_document, String str, HashMap hashMap, SendingMediaInfo sendingMediaInfo, String str2, long j, MessageObject messageObject2, MessageObject messageObject3, boolean z, int i, TL_stories$StoryItem tL_stories$StoryItem, ChatActivity.ReplyQuote replyQuote, String str3, int i2, boolean z2, long j2, boolean z3) {
        if (messageObject != null) {
            accountInstance.getSendMessagesHelper().editMessage(messageObject, null, null, tLRPC$TL_document, str, hashMap, false, sendingMediaInfo.hasMediaSpoilers, str2);
            return;
        }
        SendMessageParams of = SendMessageParams.of(tLRPC$TL_document, null, str, j, messageObject2, messageObject3, sendingMediaInfo.caption, sendingMediaInfo.entities, null, hashMap, z, i, 0, str2, null, false, sendingMediaInfo.hasMediaSpoilers);
        of.replyToStoryItem = tL_stories$StoryItem;
        of.replyQuote = replyQuote;
        of.quick_reply_shortcut = str3;
        of.quick_reply_shortcut_id = i2;
        if (z2) {
            of.effect_id = j2;
        }
        of.invert_media = z3;
        accountInstance.getSendMessagesHelper().sendMessage(of);
    }

    public static void lambda$prepareSendingMedia$91(MessageObject messageObject, AccountInstance accountInstance, TLRPC$TL_photo tLRPC$TL_photo, boolean z, SendingMediaInfo sendingMediaInfo, HashMap hashMap, String str, long j, MessageObject messageObject2, MessageObject messageObject3, boolean z2, int i, TL_stories$StoryItem tL_stories$StoryItem, ChatActivity.ReplyQuote replyQuote, int i2, String str2, long j2, boolean z3) {
        if (messageObject != null) {
            accountInstance.getSendMessagesHelper().editMessage(messageObject, tLRPC$TL_photo, null, null, z ? sendingMediaInfo.searchImage.imageUrl : null, hashMap, false, sendingMediaInfo.hasMediaSpoilers, str);
            return;
        }
        SendMessageParams of = SendMessageParams.of(tLRPC$TL_photo, z ? sendingMediaInfo.searchImage.imageUrl : null, j, messageObject2, messageObject3, sendingMediaInfo.caption, sendingMediaInfo.entities, null, hashMap, z2, i, sendingMediaInfo.ttl, str, false, sendingMediaInfo.hasMediaSpoilers);
        of.replyToStoryItem = tL_stories$StoryItem;
        of.replyQuote = replyQuote;
        of.quick_reply_shortcut_id = i2;
        of.quick_reply_shortcut = str2;
        of.effect_id = j2;
        of.invert_media = z3;
        accountInstance.getSendMessagesHelper().sendMessage(of);
    }

    public static void lambda$prepareSendingMedia$92(Bitmap bitmap, String str, MessageObject messageObject, AccountInstance accountInstance, VideoEditedInfo videoEditedInfo, TLRPC$TL_document tLRPC$TL_document, String str2, HashMap hashMap, SendingMediaInfo sendingMediaInfo, String str3, long j, MessageObject messageObject2, MessageObject messageObject3, boolean z, int i, TL_stories$StoryItem tL_stories$StoryItem, ChatActivity.ReplyQuote replyQuote, String str4, int i2, long j2, boolean z2) {
        if (bitmap != null && str != null) {
            ImageLoader.getInstance().putImageToCache(new BitmapDrawable(bitmap), str, false);
        }
        if (messageObject != null) {
            accountInstance.getSendMessagesHelper().editMessage(messageObject, null, videoEditedInfo, tLRPC$TL_document, str2, hashMap, false, sendingMediaInfo.hasMediaSpoilers, str3);
            return;
        }
        SendMessageParams of = SendMessageParams.of(tLRPC$TL_document, videoEditedInfo, str2, j, messageObject2, messageObject3, sendingMediaInfo.caption, sendingMediaInfo.entities, null, hashMap, z, i, sendingMediaInfo.ttl, str3, null, false, sendingMediaInfo.hasMediaSpoilers);
        of.replyToStoryItem = tL_stories$StoryItem;
        of.replyQuote = replyQuote;
        of.quick_reply_shortcut = str4;
        of.quick_reply_shortcut_id = i2;
        of.effect_id = j2;
        of.invert_media = z2;
        of.stars = sendingMediaInfo.stars;
        accountInstance.getSendMessagesHelper().sendMessage(of);
    }

    public static void lambda$prepareSendingMedia$93(Bitmap[] bitmapArr, String[] strArr, MessageObject messageObject, AccountInstance accountInstance, TLRPC$TL_photo tLRPC$TL_photo, HashMap hashMap, SendingMediaInfo sendingMediaInfo, String str, long j, MessageObject messageObject2, MessageObject messageObject3, boolean z, int i, boolean z2, TL_stories$StoryItem tL_stories$StoryItem, ChatActivity.ReplyQuote replyQuote, String str2, int i2, long j2, boolean z3) {
        if (bitmapArr[0] != null && strArr[0] != null) {
            ImageLoader.getInstance().putImageToCache(new BitmapDrawable(bitmapArr[0]), strArr[0], false);
        }
        if (messageObject != null) {
            accountInstance.getSendMessagesHelper().editMessage(messageObject, tLRPC$TL_photo, null, null, null, hashMap, false, sendingMediaInfo.hasMediaSpoilers, str);
            return;
        }
        SendMessageParams of = SendMessageParams.of(tLRPC$TL_photo, null, j, messageObject2, messageObject3, sendingMediaInfo.caption, sendingMediaInfo.entities, null, hashMap, z, i, sendingMediaInfo.ttl, str, z2, sendingMediaInfo.hasMediaSpoilers);
        of.replyToStoryItem = tL_stories$StoryItem;
        of.replyQuote = replyQuote;
        of.quick_reply_shortcut = str2;
        of.quick_reply_shortcut_id = i2;
        of.effect_id = j2;
        of.invert_media = z3;
        of.stars = sendingMediaInfo.stars;
        accountInstance.getSendMessagesHelper().sendMessage(of);
    }

    public static void fillVideoAttribute(java.lang.String r6, org.telegram.tgnet.TLRPC$TL_documentAttributeVideo r7, org.telegram.messenger.VideoEditedInfo r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.fillVideoAttribute(java.lang.String, org.telegram.tgnet.TLRPC$TL_documentAttributeVideo, org.telegram.messenger.VideoEditedInfo):void");
    }

    public static Bitmap createVideoThumbnail(String str, int i) {
        float f = i == 2 ? 1920.0f : i == 3 ? 96.0f : 512.0f;
        Bitmap createVideoThumbnailAtTime = createVideoThumbnailAtTime(str, 0L);
        if (createVideoThumbnailAtTime == null) {
            return createVideoThumbnailAtTime;
        }
        int width = createVideoThumbnailAtTime.getWidth();
        int height = createVideoThumbnailAtTime.getHeight();
        float f2 = width;
        if (f2 <= f && height <= f) {
            return createVideoThumbnailAtTime;
        }
        float max = Math.max(width, height) / f;
        return Bitmap.createScaledBitmap(createVideoThumbnailAtTime, (int) (f2 / max), (int) (height / max), true);
    }

    public static Bitmap createVideoThumbnailAtTime(String str, long j) {
        return createVideoThumbnailAtTime(str, j, null, false);
    }

    public static Bitmap createVideoThumbnailAtTime(String str, long j, int[] iArr, boolean z) {
        Bitmap bitmap;
        if (z) {
            AnimatedFileDrawable animatedFileDrawable = new AnimatedFileDrawable(new File(str), true, 0L, 0, null, null, null, 0L, 0, true, null);
            bitmap = animatedFileDrawable.getFrameAtTime(j, z);
            if (iArr != null) {
                iArr[0] = animatedFileDrawable.getOrientation();
            }
            animatedFileDrawable.recycle();
            if (bitmap == null) {
                return createVideoThumbnailAtTime(str, j, iArr, false);
            }
        } else {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            bitmap = null;
            try {
                try {
                    mediaMetadataRetriever.setDataSource(str);
                    Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(j, 1);
                    if (frameAtTime == null) {
                        try {
                            frameAtTime = mediaMetadataRetriever.getFrameAtTime(j, 3);
                        } catch (Exception unused) {
                        }
                    }
                    bitmap = frameAtTime;
                } finally {
                    try {
                        mediaMetadataRetriever.release();
                    } catch (Throwable unused2) {
                    }
                }
            } catch (Exception unused3) {
            }
        }
        return bitmap;
    }

    private static VideoEditedInfo createCompressionSettings(String str) {
        MediaCodecInfo selectCodec;
        int[] iArr = new int[11];
        AnimatedFileDrawable.getVideoInfo(str, iArr);
        if (iArr[0] == 0) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("video hasn't avc1 atom");
            }
            return null;
        }
        long length = new File(str).length();
        int videoBitrate = MediaController.getVideoBitrate(str);
        if (videoBitrate == -1) {
            videoBitrate = iArr[3];
        }
        float f = iArr[4];
        int i = iArr[6];
        long j = iArr[5];
        int i2 = iArr[7];
        if (Build.VERSION.SDK_INT < 18) {
            try {
                selectCodec = MediaController.selectCodec("video/avc");
            } catch (Exception unused) {
            }
            if (selectCodec == null) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("no codec info for video/avc");
                }
                return null;
            }
            String name = selectCodec.getName();
            if (!name.equals("OMX.google.h264.encoder") && !name.equals("OMX.ST.VFM.H264Enc") && !name.equals("OMX.Exynos.avc.enc") && !name.equals("OMX.MARVELL.VIDEO.HW.CODA7542ENCODER") && !name.equals("OMX.MARVELL.VIDEO.H264ENCODER") && !name.equals("OMX.k3.video.encoder.avc") && !name.equals("OMX.TI.DUCATI1.VIDEO.H264E")) {
                if (MediaController.selectColorFormat(selectCodec, "video/avc") == 0) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("no color format for video/avc");
                    }
                    return null;
                }
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("unsupported encoder = " + name);
            }
            return null;
        }
        VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
        videoEditedInfo.startTime = -1L;
        videoEditedInfo.endTime = -1L;
        videoEditedInfo.bitrate = videoBitrate;
        videoEditedInfo.originalPath = str;
        videoEditedInfo.framerate = i2;
        videoEditedInfo.estimatedDuration = (long) Math.ceil(f);
        boolean z = true;
        int i3 = iArr[1];
        videoEditedInfo.originalWidth = i3;
        videoEditedInfo.resultWidth = i3;
        int i4 = iArr[2];
        videoEditedInfo.originalHeight = i4;
        videoEditedInfo.resultHeight = i4;
        videoEditedInfo.rotationValue = iArr[8];
        videoEditedInfo.originalDuration = f * 1000.0f;
        float max = Math.max(i3, i4);
        int i5 = max > 1280.0f ? 4 : max > 854.0f ? 3 : max > 640.0f ? 2 : 1;
        int round = Math.round(DownloadController.getInstance(UserConfig.selectedAccount).getMaxVideoBitrate() / (100.0f / i5));
        if (round > i5) {
            round = i5;
        }
        if (new File(str).length() < 1048576000) {
            if (round != i5 || Math.max(videoEditedInfo.originalWidth, videoEditedInfo.originalHeight) > 1280) {
                float f2 = round != 1 ? round != 2 ? round != 3 ? 1280.0f : 848.0f : 640.0f : 432.0f;
                int i6 = videoEditedInfo.originalWidth;
                int i7 = videoEditedInfo.originalHeight;
                float f3 = f2 / (i6 > i7 ? i6 : i7);
                videoEditedInfo.resultWidth = Math.round((i6 * f3) / 2.0f) * 2;
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
            videoEditedInfo.estimatedSize = ((float) j) + (((f / 1000.0f) * MediaController.extractRealEncoderBitrate(videoEditedInfo.resultWidth, videoEditedInfo.resultHeight, videoBitrate, false)) / 8.0f);
        }
        if (videoEditedInfo.estimatedSize == 0) {
            videoEditedInfo.estimatedSize = 1L;
        }
        return videoEditedInfo;
    }

    public static void prepareSendingVideo(final AccountInstance accountInstance, final String str, final VideoEditedInfo videoEditedInfo, final long j, final MessageObject messageObject, final MessageObject messageObject2, final TL_stories$StoryItem tL_stories$StoryItem, final ChatActivity.ReplyQuote replyQuote, final ArrayList<TLRPC$MessageEntity> arrayList, final int i, final MessageObject messageObject3, final boolean z, final int i2, final boolean z2, final boolean z3, final CharSequence charSequence, final String str2, final int i3, final long j2) {
        if (str == null || str.length() == 0) {
            return;
        }
        new Thread(new Runnable() {
            @Override
            public final void run() {
                SendMessagesHelper.lambda$prepareSendingVideo$96(VideoEditedInfo.this, str, j, i, accountInstance, charSequence, messageObject3, z3, messageObject, messageObject2, arrayList, z, i2, tL_stories$StoryItem, replyQuote, i3, str2, j2, z2);
            }
        }).start();
    }

    public static void lambda$prepareSendingVideo$96(org.telegram.messenger.VideoEditedInfo r28, java.lang.String r29, final long r30, final int r32, final org.telegram.messenger.AccountInstance r33, java.lang.CharSequence r34, final org.telegram.messenger.MessageObject r35, final boolean r36, final org.telegram.messenger.MessageObject r37, final org.telegram.messenger.MessageObject r38, final java.util.ArrayList r39, final boolean r40, final int r41, final org.telegram.tgnet.tl.TL_stories$StoryItem r42, final org.telegram.ui.ChatActivity.ReplyQuote r43, final int r44, final java.lang.String r45, final long r46, boolean r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SendMessagesHelper.lambda$prepareSendingVideo$96(org.telegram.messenger.VideoEditedInfo, java.lang.String, long, int, org.telegram.messenger.AccountInstance, java.lang.CharSequence, org.telegram.messenger.MessageObject, boolean, org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject, java.util.ArrayList, boolean, int, org.telegram.tgnet.tl.TL_stories$StoryItem, org.telegram.ui.ChatActivity$ReplyQuote, int, java.lang.String, long, boolean):void");
    }

    public static void lambda$prepareSendingVideo$95(Bitmap bitmap, String str, MessageObject messageObject, AccountInstance accountInstance, VideoEditedInfo videoEditedInfo, TLRPC$TL_document tLRPC$TL_document, String str2, HashMap hashMap, boolean z, String str3, long j, MessageObject messageObject2, MessageObject messageObject3, String str4, ArrayList arrayList, boolean z2, int i, int i2, TL_stories$StoryItem tL_stories$StoryItem, ChatActivity.ReplyQuote replyQuote, int i3, String str5, long j2) {
        if (bitmap != null && str != null) {
            ImageLoader.getInstance().putImageToCache(new BitmapDrawable(bitmap), str, false);
        }
        if (messageObject != null) {
            accountInstance.getSendMessagesHelper().editMessage(messageObject, null, videoEditedInfo, tLRPC$TL_document, str2, hashMap, false, z, str3);
            return;
        }
        SendMessageParams of = SendMessageParams.of(tLRPC$TL_document, videoEditedInfo, str2, j, messageObject2, messageObject3, str4, arrayList, null, hashMap, z2, i, i2, str3, null, false, z);
        of.replyToStoryItem = tL_stories$StoryItem;
        of.replyQuote = replyQuote;
        of.quick_reply_shortcut_id = i3;
        of.quick_reply_shortcut = str5;
        of.effect_id = j2;
        accountInstance.getSendMessagesHelper().sendMessage(of);
    }

    public static class SendMessageParams {
        public String caption;
        public TLRPC$TL_document document;
        public long effect_id;
        public ArrayList<TLRPC$MessageEntity> entities;
        public TLRPC$TL_game game;
        public boolean hasMediaSpoilers;
        public boolean invert_media;
        public TLRPC$TL_messageMediaInvoice invoice;
        public TLRPC$MessageMedia location;
        public TLRPC$TL_messageMediaWebPage mediaWebPage;
        public String message;
        public boolean notify;
        public HashMap<String, String> params;
        public Object parentObject;
        public String path;
        public long peer;
        public TLRPC$TL_photo photo;
        public TLRPC$TL_messageMediaPoll poll;
        public String quick_reply_shortcut;
        public int quick_reply_shortcut_id;
        public TLRPC$ReplyMarkup replyMarkup;
        public ChatActivity.ReplyQuote replyQuote;
        public MessageObject replyToMsg;
        public TL_stories$StoryItem replyToStoryItem;
        public MessageObject replyToTopMsg;
        public MessageObject retryMessageObject;
        public int scheduleDate;
        public boolean searchLinks = true;
        public MessageObject.SendAnimationData sendAnimationData;
        public TL_stories$StoryItem sendingStory;
        public long stars;
        public int ttl;
        public boolean updateStickersOrder;
        public TLRPC$User user;
        public VideoEditedInfo videoEditedInfo;
        public TLRPC$WebPage webPage;

        public static SendMessageParams of(String str, long j) {
            return of(str, null, null, null, null, null, null, null, null, null, j, null, null, null, null, true, null, null, null, null, false, 0, 0, null, null, false);
        }

        public static SendMessageParams of(MessageObject messageObject) {
            long dialogId = messageObject.getDialogId();
            TLRPC$Message tLRPC$Message = messageObject.messageOwner;
            SendMessageParams of = of(null, null, null, null, null, null, null, null, null, null, dialogId, tLRPC$Message.attachPath, null, null, null, true, messageObject, null, tLRPC$Message.reply_markup, tLRPC$Message.params, !tLRPC$Message.silent, messageObject.scheduled ? tLRPC$Message.date : 0, 0, null, null, false);
            TLRPC$Message tLRPC$Message2 = messageObject.messageOwner;
            if (tLRPC$Message2 != null) {
                TLRPC$InputQuickReplyShortcut tLRPC$InputQuickReplyShortcut = tLRPC$Message2.quick_reply_shortcut;
                if (tLRPC$InputQuickReplyShortcut instanceof TLRPC$TL_inputQuickReplyShortcut) {
                    of.quick_reply_shortcut = ((TLRPC$TL_inputQuickReplyShortcut) tLRPC$InputQuickReplyShortcut).shortcut;
                }
                of.quick_reply_shortcut_id = messageObject.getQuickReplyId();
            }
            return of;
        }

        public static SendMessageParams of(TLRPC$User tLRPC$User, long j, MessageObject messageObject, MessageObject messageObject2, TLRPC$ReplyMarkup tLRPC$ReplyMarkup, HashMap<String, String> hashMap, boolean z, int i) {
            return of(null, null, null, null, null, tLRPC$User, null, null, null, null, j, null, messageObject, messageObject2, null, true, null, null, tLRPC$ReplyMarkup, hashMap, z, i, 0, null, null, false);
        }

        public static SendMessageParams of(TLRPC$TL_messageMediaInvoice tLRPC$TL_messageMediaInvoice, long j, MessageObject messageObject, MessageObject messageObject2, TLRPC$ReplyMarkup tLRPC$ReplyMarkup, HashMap<String, String> hashMap, boolean z, int i) {
            return of(null, null, null, null, null, null, null, null, null, tLRPC$TL_messageMediaInvoice, j, null, messageObject, messageObject2, null, true, null, null, tLRPC$ReplyMarkup, hashMap, z, i, 0, null, null, false);
        }

        public static SendMessageParams of(TLRPC$TL_document tLRPC$TL_document, VideoEditedInfo videoEditedInfo, String str, long j, MessageObject messageObject, MessageObject messageObject2, String str2, ArrayList<TLRPC$MessageEntity> arrayList, TLRPC$ReplyMarkup tLRPC$ReplyMarkup, HashMap<String, String> hashMap, boolean z, int i, int i2, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z2) {
            return of(null, str2, null, null, videoEditedInfo, null, tLRPC$TL_document, null, null, null, j, str, messageObject, messageObject2, null, true, null, arrayList, tLRPC$ReplyMarkup, hashMap, z, i, i2, obj, sendAnimationData, z2);
        }

        public static SendMessageParams of(TLRPC$TL_document tLRPC$TL_document, VideoEditedInfo videoEditedInfo, String str, long j, MessageObject messageObject, MessageObject messageObject2, String str2, ArrayList<TLRPC$MessageEntity> arrayList, TLRPC$ReplyMarkup tLRPC$ReplyMarkup, HashMap<String, String> hashMap, boolean z, int i, int i2, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z2, boolean z3) {
            return of(null, str2, null, null, videoEditedInfo, null, tLRPC$TL_document, null, null, null, j, str, messageObject, messageObject2, null, true, null, arrayList, tLRPC$ReplyMarkup, hashMap, z, i, i2, obj, sendAnimationData, z2, z3);
        }

        public static SendMessageParams of(String str, long j, MessageObject messageObject, MessageObject messageObject2, TLRPC$WebPage tLRPC$WebPage, boolean z, ArrayList<TLRPC$MessageEntity> arrayList, TLRPC$ReplyMarkup tLRPC$ReplyMarkup, HashMap<String, String> hashMap, boolean z2, int i, MessageObject.SendAnimationData sendAnimationData, boolean z3) {
            return of(str, null, null, null, null, null, null, null, null, null, j, null, messageObject, messageObject2, tLRPC$WebPage, z, null, arrayList, tLRPC$ReplyMarkup, hashMap, z2, i, 0, null, sendAnimationData, z3);
        }

        public static SendMessageParams of(TLRPC$MessageMedia tLRPC$MessageMedia, long j, MessageObject messageObject, MessageObject messageObject2, TLRPC$ReplyMarkup tLRPC$ReplyMarkup, HashMap<String, String> hashMap, boolean z, int i) {
            return of(null, null, tLRPC$MessageMedia, null, null, null, null, null, null, null, j, null, messageObject, messageObject2, null, true, null, null, tLRPC$ReplyMarkup, hashMap, z, i, 0, null, null, false);
        }

        public static SendMessageParams of(TLRPC$TL_messageMediaPoll tLRPC$TL_messageMediaPoll, long j, MessageObject messageObject, MessageObject messageObject2, TLRPC$ReplyMarkup tLRPC$ReplyMarkup, HashMap<String, String> hashMap, boolean z, int i) {
            return of(null, null, null, null, null, null, null, null, tLRPC$TL_messageMediaPoll, null, j, null, messageObject, messageObject2, null, true, null, null, tLRPC$ReplyMarkup, hashMap, z, i, 0, null, null, false);
        }

        public static SendMessageParams of(TLRPC$TL_game tLRPC$TL_game, long j, MessageObject messageObject, MessageObject messageObject2, TLRPC$ReplyMarkup tLRPC$ReplyMarkup, HashMap<String, String> hashMap, boolean z, int i) {
            return of(null, null, null, null, null, null, null, tLRPC$TL_game, null, null, j, null, messageObject, messageObject2, null, true, null, null, tLRPC$ReplyMarkup, hashMap, z, i, 0, null, null, false);
        }

        public static SendMessageParams of(TLRPC$TL_photo tLRPC$TL_photo, String str, long j, MessageObject messageObject, MessageObject messageObject2, String str2, ArrayList<TLRPC$MessageEntity> arrayList, TLRPC$ReplyMarkup tLRPC$ReplyMarkup, HashMap<String, String> hashMap, boolean z, int i, int i2, Object obj, boolean z2, boolean z3) {
            return of(null, str2, null, tLRPC$TL_photo, null, null, null, null, null, null, j, str, messageObject, messageObject2, null, true, null, arrayList, tLRPC$ReplyMarkup, hashMap, z, i, i2, obj, null, z2, z3);
        }

        public static SendMessageParams of(TLRPC$TL_photo tLRPC$TL_photo, String str, long j, MessageObject messageObject, MessageObject messageObject2, String str2, ArrayList<TLRPC$MessageEntity> arrayList, TLRPC$ReplyMarkup tLRPC$ReplyMarkup, HashMap<String, String> hashMap, boolean z, int i, int i2, Object obj, boolean z2) {
            return of(null, str2, null, tLRPC$TL_photo, null, null, null, null, null, null, j, str, messageObject, messageObject2, null, true, null, arrayList, tLRPC$ReplyMarkup, hashMap, z, i, i2, obj, null, z2);
        }

        private static SendMessageParams of(String str, String str2, TLRPC$MessageMedia tLRPC$MessageMedia, TLRPC$TL_photo tLRPC$TL_photo, VideoEditedInfo videoEditedInfo, TLRPC$User tLRPC$User, TLRPC$TL_document tLRPC$TL_document, TLRPC$TL_game tLRPC$TL_game, TLRPC$TL_messageMediaPoll tLRPC$TL_messageMediaPoll, TLRPC$TL_messageMediaInvoice tLRPC$TL_messageMediaInvoice, long j, String str3, MessageObject messageObject, MessageObject messageObject2, TLRPC$WebPage tLRPC$WebPage, boolean z, MessageObject messageObject3, ArrayList<TLRPC$MessageEntity> arrayList, TLRPC$ReplyMarkup tLRPC$ReplyMarkup, HashMap<String, String> hashMap, boolean z2, int i, int i2, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z3) {
            return of(str, str2, tLRPC$MessageMedia, tLRPC$TL_photo, videoEditedInfo, tLRPC$User, tLRPC$TL_document, tLRPC$TL_game, tLRPC$TL_messageMediaPoll, tLRPC$TL_messageMediaInvoice, j, str3, messageObject, messageObject2, tLRPC$WebPage, z, messageObject3, arrayList, tLRPC$ReplyMarkup, hashMap, z2, i, i2, obj, sendAnimationData, z3, false);
        }

        public static SendMessageParams of(String str, String str2, TLRPC$MessageMedia tLRPC$MessageMedia, TLRPC$TL_photo tLRPC$TL_photo, VideoEditedInfo videoEditedInfo, TLRPC$User tLRPC$User, TLRPC$TL_document tLRPC$TL_document, TLRPC$TL_game tLRPC$TL_game, TLRPC$TL_messageMediaPoll tLRPC$TL_messageMediaPoll, TLRPC$TL_messageMediaInvoice tLRPC$TL_messageMediaInvoice, long j, String str3, MessageObject messageObject, MessageObject messageObject2, TLRPC$WebPage tLRPC$WebPage, boolean z, MessageObject messageObject3, ArrayList<TLRPC$MessageEntity> arrayList, TLRPC$ReplyMarkup tLRPC$ReplyMarkup, HashMap<String, String> hashMap, boolean z2, int i, int i2, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z3, boolean z4) {
            SendMessageParams sendMessageParams = new SendMessageParams();
            sendMessageParams.message = str;
            sendMessageParams.caption = str2;
            sendMessageParams.location = tLRPC$MessageMedia;
            sendMessageParams.photo = tLRPC$TL_photo;
            sendMessageParams.videoEditedInfo = videoEditedInfo;
            sendMessageParams.user = tLRPC$User;
            sendMessageParams.document = tLRPC$TL_document;
            sendMessageParams.game = tLRPC$TL_game;
            sendMessageParams.poll = tLRPC$TL_messageMediaPoll;
            sendMessageParams.invoice = tLRPC$TL_messageMediaInvoice;
            sendMessageParams.peer = j;
            sendMessageParams.path = str3;
            sendMessageParams.replyToMsg = messageObject;
            sendMessageParams.replyToTopMsg = messageObject2;
            sendMessageParams.webPage = tLRPC$WebPage;
            sendMessageParams.searchLinks = z;
            sendMessageParams.retryMessageObject = messageObject3;
            sendMessageParams.entities = arrayList;
            sendMessageParams.replyMarkup = tLRPC$ReplyMarkup;
            sendMessageParams.params = hashMap;
            sendMessageParams.notify = z2;
            sendMessageParams.scheduleDate = i;
            sendMessageParams.ttl = i2;
            sendMessageParams.parentObject = obj;
            sendMessageParams.sendAnimationData = sendAnimationData;
            sendMessageParams.updateStickersOrder = z3;
            sendMessageParams.hasMediaSpoilers = z4;
            return sendMessageParams;
        }
    }
}
