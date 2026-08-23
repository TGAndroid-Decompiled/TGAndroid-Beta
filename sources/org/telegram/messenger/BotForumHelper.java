package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.utils.tlutils.TlUtils;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.TypingDotsDrawable;
import org.telegram.ui.MultiLayoutTypingAnimator;

public class BotForumHelper extends BaseController {
    private static volatile BotForumHelper[] Instance = new BotForumHelper[4];
    private final DialogTopicIdKeyMap<BotDraftMessage> botTextDraftsByRandomIds;
    private final DialogTopicIdKeyMap<Object> botTextDraftsByRandomIdsBlocklist;
    private final LongSparseArray<List<MessagesStorage.IntCallback>> pendingBotTopics;
    private final SharedPreferences preferences;

    public enum SteamingSendButtonState {
        NO_STREAMING,
        BLOCKING,
        STOP
    }

    public static void $r8$lambda$CUr1I72kng9ZLBLRHOP8WOL6_aM(TLRPC.Bool bool, TLRPC.TL_error tL_error) {
    }

    private MessageObject createDraftMessage(long j, int i, long j2, int i2, TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.dialog_id = j;
        tL_message.peer_id = getMessagesController().getPeer(j);
        tL_message.from_id = getMessagesController().getPeer(j);
        tL_message.local_id = i2;
        tL_message.id = i2;
        tL_message.random_id = j2;
        tL_message.message = tL_textWithEntities.text;
        tL_message.entities = tL_textWithEntities.entities;
        tL_message.flags |= 128;
        tL_message.date = getConnectionsManager().getCurrentTime();
        TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
        tL_message.reply_to = tL_messageReplyHeader;
        tL_message.flags |= 16;
        tL_messageReplyHeader.forum_topic = true;
        tL_messageReplyHeader.reply_to_top_id = i;
        tL_messageReplyHeader.flags |= 2;
        tL_message.media = new TLRPC.TL_messageMediaEmpty();
        tL_message.flags |= 512;
        MessageObject messageObject = new MessageObject(this.currentAccount, tL_message, false, true);
        messageObject.isBotPendingDraft = true;
        messageObject.resetLayout();
        return messageObject;
    }

    private MessageObject createDraftMessage(long j, int i, long j2, int i2, TL_iv.RichMessage richMessage) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.dialog_id = j;
        tL_message.peer_id = getMessagesController().getPeer(j);
        tL_message.from_id = getMessagesController().getPeer(j);
        tL_message.local_id = i2;
        tL_message.id = i2;
        tL_message.random_id = j2;
        tL_message.message = "";
        tL_message.flags |= 8192;
        tL_message.rich_message = richMessage;
        tL_message.date = getConnectionsManager().getCurrentTime();
        TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
        tL_message.reply_to = tL_messageReplyHeader;
        tL_message.flags |= 16;
        tL_messageReplyHeader.forum_topic = true;
        tL_messageReplyHeader.reply_to_top_id = i;
        tL_messageReplyHeader.flags |= 2;
        tL_message.media = new TLRPC.TL_messageMediaEmpty();
        tL_message.flags |= 512;
        MessageObject messageObject = new MessageObject(this.currentAccount, tL_message, false, true);
        messageObject.isBotPendingDraft = true;
        messageObject.resetLayout();
        return messageObject;
    }

    public void onBotForumDraftUpdate(long j, int i, TLRPC.TL_sendMessageTextDraftAction tL_sendMessageTextDraftAction) {
        onBotForumDraftUpdate(j, i, tL_sendMessageTextDraftAction.random_id, tL_sendMessageTextDraftAction.text, tL_sendMessageTextDraftAction.can_stop, tL_sendMessageTextDraftAction.keep_on_stop);
    }

    public void onBotForumDraftUpdate(long j, int i, TLRPC.TL_sendMessageRichMessageDraftAction tL_sendMessageRichMessageDraftAction) {
        onBotForumDraftUpdate(j, i, tL_sendMessageRichMessageDraftAction.random_id, tL_sendMessageRichMessageDraftAction.rich_message, tL_sendMessageRichMessageDraftAction.can_stop, tL_sendMessageRichMessageDraftAction.keep_on_stop);
    }

    private void onBotForumDraftUpdate(final long j, final int i, final long j2, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z, boolean z2) {
        long[] jArr;
        BotDraftMessage botDraftMessage;
        BotForumHelper botForumHelper = this;
        FileLog.d("[BotForum] onDraftNewDraft " + j + " " + i + " " + j2);
        long j3 = (long) i;
        if (botForumHelper.botTextDraftsByRandomIdsBlocklist.get(j, j3, j2) != null) {
            FileLog.d("[BotForum] onDraftNewDraft ignore " + j + " " + i + " " + j2);
            return;
        }
        LongSparseArray<BotDraftMessage> longSparseArray = botForumHelper.botTextDraftsByRandomIds.get(j, j3);
        if (longSparseArray == null || longSparseArray.size() <= 0) {
            jArr = null;
        } else {
            jArr = new long[longSparseArray.size()];
            int size = longSparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                jArr[i2] = longSparseArray.keyAt(i2);
            }
        }
        long[] jArr2 = jArr;
        BotDraftMessage botDraftMessage2 = botForumHelper.botTextDraftsByRandomIds.get(j, j3, j2);
        if (botDraftMessage2 == null) {
            botDraftMessage = new BotDraftMessage(j, i, j2, botForumHelper.getUserConfig().getNewMessageId());
            botForumHelper.botTextDraftsByRandomIds.put(j, j3, j2, botDraftMessage);
        } else {
            botDraftMessage = botDraftMessage2;
        }
        botDraftMessage.keepOnStop = z2;
        botDraftMessage.canStop = z;
        if (jArr2 != null) {
            int length = jArr2.length;
            int i3 = 0;
            while (i3 < length) {
                long j4 = jArr2[i3];
                if (j4 != j2) {
                    BotDraftMessage botDraftMessage3 = longSparseArray.get(j4);
                    if (botDraftMessage3.selfDestruct != null) {
                        AndroidUtilities.cancelRunOnUIThread(botDraftMessage3.selfDestruct);
                    }
                    botForumHelper.onBotForumDraftTimeout(j, i, j4);
                }
                i3++;
                botForumHelper = this;
            }
        }
        boolean z3 = botDraftMessage.messageObject == null;
        if (botDraftMessage.selfDestruct != null) {
            AndroidUtilities.cancelRunOnUIThread(botDraftMessage.selfDestruct);
        }
        botDraftMessage.selfDestruct = new Runnable() {
            @Override
            public final void run() {
                this.f$0.onBotForumDraftTimeout(j, i, j2);
            }
        };
        botDraftMessage.text = tL_textWithEntities;
        botDraftMessage.messageObject = createDraftMessage(j, i, j2, botDraftMessage.localMessageId, tL_textWithEntities);
        AndroidUtilities.runOnUIThread(botDraftMessage.selfDestruct, getAppGlobalConfig().messageTypingDraftTtl.get(TimeUnit.MILLISECONDS));
        getNotificationCenter().postNotificationName(NotificationCenter.botForumDraftUpdate, new BotForumTextDraftUpdateNotification(j, j3, botDraftMessage.messageObject, z3));
    }

    private void onBotForumDraftUpdate(final long j, final int i, final long j2, TL_iv.RichMessage richMessage, boolean z, boolean z2) {
        long[] jArr;
        BotDraftMessage botDraftMessage;
        BotForumHelper botForumHelper = this;
        FileLog.d("[BotForum] onDraftNewDraft (rich_message) " + j + " " + i + " " + j2);
        long j3 = (long) i;
        if (botForumHelper.botTextDraftsByRandomIdsBlocklist.get(j, j3, j2) != null) {
            FileLog.d("[BotForum] onDraftNewDraft (rich_message) ignore " + j + " " + i + " " + j2);
            return;
        }
        LongSparseArray<BotDraftMessage> longSparseArray = botForumHelper.botTextDraftsByRandomIds.get(j, j3);
        if (longSparseArray == null || longSparseArray.size() <= 0) {
            jArr = null;
        } else {
            jArr = new long[longSparseArray.size()];
            int size = longSparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                jArr[i2] = longSparseArray.keyAt(i2);
            }
        }
        long[] jArr2 = jArr;
        BotDraftMessage botDraftMessage2 = botForumHelper.botTextDraftsByRandomIds.get(j, j3, j2);
        if (botDraftMessage2 == null) {
            botDraftMessage = new BotDraftMessage(j, i, j2, botForumHelper.getUserConfig().getNewMessageId());
            botForumHelper.botTextDraftsByRandomIds.put(j, j3, j2, botDraftMessage);
        } else {
            botDraftMessage = botDraftMessage2;
        }
        botDraftMessage.keepOnStop = z2;
        botDraftMessage.canStop = z;
        if (jArr2 != null) {
            int length = jArr2.length;
            int i3 = 0;
            while (i3 < length) {
                long j4 = jArr2[i3];
                if (j4 != j2) {
                    BotDraftMessage botDraftMessage3 = longSparseArray.get(j4);
                    if (botDraftMessage3.selfDestruct != null) {
                        AndroidUtilities.cancelRunOnUIThread(botDraftMessage3.selfDestruct);
                    }
                    botForumHelper.onBotForumDraftTimeout(j, i, j4);
                }
                i3++;
                botForumHelper = this;
            }
        }
        boolean z3 = botDraftMessage.messageObject == null;
        if (botDraftMessage.selfDestruct != null) {
            AndroidUtilities.cancelRunOnUIThread(botDraftMessage.selfDestruct);
        }
        botDraftMessage.selfDestruct = new Runnable() {
            @Override
            public final void run() {
                this.f$0.onBotForumDraftTimeout(j, i, j2);
            }
        };
        botDraftMessage.richMessage = richMessage;
        botDraftMessage.messageObject = createDraftMessage(j, i, j2, botDraftMessage.localMessageId, richMessage);
        AndroidUtilities.runOnUIThread(botDraftMessage.selfDestruct, getAppGlobalConfig().messageTypingDraftTtl.get(TimeUnit.MILLISECONDS));
        getNotificationCenter().postNotificationName(NotificationCenter.botForumDraftUpdate, new BotForumTextDraftUpdateNotification(j, j3, botDraftMessage.messageObject, z3));
    }

    public SteamingSendButtonState getStreamingSendButtonState(long j, int i) {
        LongSparseArray<BotDraftMessage> longSparseArray = this.botTextDraftsByRandomIds.get(j, i);
        if (longSparseArray != null && longSparseArray.size() > 0) {
            int size = longSparseArray.size();
            BotDraftMessage botDraftMessageValueAt = null;
            for (int i2 = 0; i2 < size; i2++) {
                botDraftMessageValueAt = longSparseArray.valueAt(i2);
                if (!botDraftMessageValueAt.removed) {
                    break;
                }
            }
            if (botDraftMessageValueAt == null || botDraftMessageValueAt.removed) {
                return SteamingSendButtonState.NO_STREAMING;
            }
            if (botDraftMessageValueAt.canStop) {
                return SteamingSendButtonState.STOP;
            }
            return SteamingSendButtonState.BLOCKING;
        }
        return SteamingSendButtonState.NO_STREAMING;
    }

    public void stopStreaming(long j, long j2) {
        long j3;
        long j4;
        LongSparseArray<BotDraftMessage> longSparseArray = this.botTextDraftsByRandomIds.get(j, j2);
        if (longSparseArray == null || longSparseArray.size() <= 0) {
            return;
        }
        int size = longSparseArray.size();
        BotDraftMessage botDraftMessageValueAt = null;
        long jKeyAt = 0;
        for (int i = 0; i < size; i++) {
            jKeyAt = longSparseArray.keyAt(i);
            botDraftMessageValueAt = longSparseArray.valueAt(i);
            if (!botDraftMessageValueAt.removed) {
                break;
            }
        }
        long j5 = jKeyAt;
        BotDraftMessage botDraftMessage = botDraftMessageValueAt;
        if (botDraftMessage == null || botDraftMessage.removed) {
            return;
        }
        if (botDraftMessage.selfDestruct != null) {
            AndroidUtilities.cancelRunOnUIThread(botDraftMessage.selfDestruct);
        }
        this.botTextDraftsByRandomIdsBlocklist.put(j, j2, j5, new Object());
        if (!botDraftMessage.keepOnStop) {
            j3 = j;
            j4 = j2;
            this.botTextDraftsByRandomIds.remove(j3, j4, j5);
            getNotificationCenter().postNotificationName(NotificationCenter.botForumDraftDelete, new BotForumTextDraftDeleteNotification(j3, j4, botDraftMessage.localMessageId));
        } else {
            botDraftMessage.removed = true;
            j3 = j;
            j4 = j2;
        }
        TLRPC.TL_sendMessageStopDraftAction tL_sendMessageStopDraftAction = new TLRPC.TL_sendMessageStopDraftAction();
        tL_sendMessageStopDraftAction.random_id = j5;
        TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
        tL_messages_setTyping.peer = getMessagesController().getInputPeer(j3);
        tL_messages_setTyping.action = tL_sendMessageStopDraftAction;
        if (j4 != 0) {
            tL_messages_setTyping.flags |= 1;
            tL_messages_setTyping.top_msg_id = (int) j4;
        }
        getConnectionsManager().sendRequestTyped(tL_messages_setTyping, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                BotForumHelper.$r8$lambda$CUr1I72kng9ZLBLRHOP8WOL6_aM((TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    public boolean hasBotForumDrafts(long j, int i) {
        LongSparseArray<BotDraftMessage> longSparseArray = this.botTextDraftsByRandomIds.get(j, i);
        if (longSparseArray != null && longSparseArray.size() > 0) {
            int size = longSparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (!longSparseArray.valueAt(i2).removed) {
                    return true;
                }
            }
        }
        return false;
    }

    public void removeAllMarkedAsRemovedMessages(long j, int i) {
        long j2 = i;
        long j3 = j;
        LongSparseArray<BotDraftMessage> longSparseArray = this.botTextDraftsByRandomIds.get(j3, j2);
        if (longSparseArray == null) {
            return;
        }
        int size = longSparseArray.size();
        int i2 = 0;
        while (i2 < size) {
            BotDraftMessage botDraftMessageValueAt = longSparseArray.valueAt(i2);
            if (botDraftMessageValueAt.removed) {
                getNotificationCenter().postNotificationName(NotificationCenter.botForumDraftDelete, new BotForumTextDraftDeleteNotification(j3, j2, botDraftMessageValueAt.localMessageId));
                this.botTextDraftsByRandomIds.remove(j, j2, botDraftMessageValueAt.randomId);
                i2--;
                size--;
            }
            i2++;
            j3 = j;
        }
    }

    public MessageObject onBotForumDraftCheckNewMessages(long j, int i, int i2, String str) {
        BotDraftMessage botDraftMessage;
        removeAllMarkedAsRemovedMessages(j, i);
        long j2 = i;
        LongSparseArray<BotDraftMessage> longSparseArray = this.botTextDraftsByRandomIds.get(j, j2);
        if (longSparseArray == null) {
            return null;
        }
        int i3 = 0;
        BotDraftMessage botDraftMessage2 = null;
        while (true) {
            if (i3 >= longSparseArray.size()) {
                botDraftMessage = botDraftMessage2;
                break;
            }
            BotDraftMessage botDraftMessageValueAt = longSparseArray.valueAt(i3);
            if (botDraftMessage2 == null) {
                botDraftMessage2 = botDraftMessageValueAt;
            }
            if (str != null && botDraftMessageValueAt.text != null && str.startsWith(botDraftMessageValueAt.text.text)) {
                botDraftMessage = botDraftMessageValueAt;
                break;
            }
            i3++;
        }
        if (botDraftMessage == null) {
            return null;
        }
        if (botDraftMessage.selfDestruct != null) {
            AndroidUtilities.cancelRunOnUIThread(botDraftMessage.selfDestruct);
        }
        this.botTextDraftsByRandomIds.remove(j, j2, botDraftMessage.randomId);
        FileLog.d("[BotForum] onDraftNewMessage " + j + " " + i);
        return botDraftMessage.messageObject;
    }

    public void onBotForumDraftTimeout(long j, int i, long j2) {
        long j3 = i;
        BotDraftMessage botDraftMessageRemove = this.botTextDraftsByRandomIds.remove(j, j3, j2);
        if (botDraftMessageRemove == null) {
            return;
        }
        getNotificationCenter().postNotificationName(NotificationCenter.botForumDraftDelete, new BotForumTextDraftDeleteNotification(j, j3, botDraftMessageRemove.localMessageId));
    }

    private static class BotDraftMessage {
        private boolean canStop;
        private boolean keepOnStop;
        public final int localMessageId;
        private MessageObject messageObject;
        public final long randomId;
        private boolean removed;
        private TL_iv.RichMessage richMessage;
        private Runnable selfDestruct;
        private TLRPC.TL_textWithEntities text;
        public final int topicId;
        public final long userId;

        private BotDraftMessage(long j, int i, long j2, int i2) {
            this.userId = j;
            this.topicId = i;
            this.randomId = j2;
            this.localMessageId = i2;
        }
    }

    public boolean beforeSendingFinalRequest(TLObject tLObject, MessageObject messageObject, Runnable runnable) {
        return beforeSendingFinalRequest(tLObject, Collections.singletonList(messageObject), runnable);
    }

    public boolean beforeSendingFinalRequest(final TLObject tLObject, List<MessageObject> list, final Runnable runnable) {
        if (list != null && !list.isEmpty()) {
            TLRPC.InputPeer inputPeerFromSendMessageRequest = TlUtils.getInputPeerFromSendMessageRequest(tLObject);
            final long peerDialogId = DialogObject.getPeerDialogId(inputPeerFromSendMessageRequest);
            if (inputPeerFromSendMessageRequest == null || peerDialogId <= 0 || !UserObject.isBotForumWithEditableTopics(getMessagesController().getUser(Long.valueOf(peerDialogId)))) {
                return true;
            }
            final long[] jArr = new long[list.size()];
            for (int i = 0; i < list.size(); i++) {
                jArr[i] = list.get(i).getId();
            }
            long orCalculateRandomIdFromSendMessageRequest = TlUtils.getOrCalculateRandomIdFromSendMessageRequest(tLObject);
            if (TlUtils.getInputReplyToFromSendMessageRequest(tLObject) instanceof TLRPC.TL_inputReplyToMessage) {
                return true;
            }
            if ((tLObject instanceof TLRPC.TL_messages_forwardMessages) && ((TLRPC.TL_messages_forwardMessages) tLObject).top_msg_id != 0) {
                return true;
            }
            String messageFromSendMessageRequest = TlUtils.getMessageFromSendMessageRequest(tLObject);
            long nextRandomId = orCalculateRandomIdFromSendMessageRequest != 0 ? ~orCalculateRandomIdFromSendMessageRequest : getSendMessagesHelper().getNextRandomId();
            if (!TextUtils.isEmpty(messageFromSendMessageRequest)) {
                if (messageFromSendMessageRequest.length() > 16) {
                    messageFromSendMessageRequest = messageFromSendMessageRequest.substring(0, 16) + "...";
                }
            } else {
                messageFromSendMessageRequest = LocaleController.getString(R.string.TopicsTitleMedia);
            }
            performSendBotTopicCreate(inputPeerFromSendMessageRequest, messageFromSendMessageRequest, nextRandomId, new MessagesStorage.IntCallback() {
                @Override
                public final void run(int i2) {
                    BotForumHelper.$r8$lambda$fjBjvuf9e0_7lKAB3FWVihLzUtk(this.f$0, tLObject, jArr, peerDialogId, runnable, i2);
                }
            });
            return false;
        }
        return true;
    }

    public static void $r8$lambda$fjBjvuf9e0_7lKAB3FWVihLzUtk(final BotForumHelper botForumHelper, TLObject tLObject, final long[] jArr, final long j, final Runnable runnable, final int i) {
        botForumHelper.getClass();
        if (tLObject instanceof TLRPC.TL_messages_forwardMessages) {
            TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages = (TLRPC.TL_messages_forwardMessages) tLObject;
            tL_messages_forwardMessages.top_msg_id = i;
            tL_messages_forwardMessages.flags |= 512;
        } else {
            TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
            tL_inputReplyToMessage.reply_to_msg_id = i;
            TlUtils.setInputReplyToFromSendMessageRequest(tLObject, tL_inputReplyToMessage);
        }
        botForumHelper.getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                BotForumHelper.$r8$lambda$dcG75N4I2jK59bkB2xEoaTCZl3o(this.f$0, jArr, j, i, runnable);
            }
        });
    }

    public static void $r8$lambda$dcG75N4I2jK59bkB2xEoaTCZl3o(BotForumHelper botForumHelper, long[] jArr, long j, int i, Runnable runnable) {
        botForumHelper.getClass();
        for (long j2 : jArr) {
            botForumHelper.getMessagesStorage().updateMessageTopicId(j, j2, i);
        }
        AndroidUtilities.runOnUIThread(runnable);
    }

    private void performSendBotTopicCreate(TLRPC.InputPeer inputPeer, final String str, long j, MessagesStorage.IntCallback intCallback) {
        final long peerDialogId = DialogObject.getPeerDialogId(inputPeer);
        List<MessagesStorage.IntCallback> list = this.pendingBotTopics.get(peerDialogId);
        if (list != null) {
            list.add(intCallback);
            return;
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(intCallback);
        this.pendingBotTopics.put(peerDialogId, arrayList);
        TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
        tL_messages_createForumTopic.title = TextUtils.isEmpty(str) ? "#New Chat" : str;
        tL_messages_createForumTopic.title_missing = true;
        tL_messages_createForumTopic.peer = inputPeer;
        tL_messages_createForumTopic.random_id = j;
        getConnectionsManager().sendRequestTyped(tL_messages_createForumTopic, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                BotForumHelper.$r8$lambda$BNFiiZDUX9EcxYRrHTTH6ljSovk(this.f$0, peerDialogId, str, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    public static void $r8$lambda$BNFiiZDUX9EcxYRrHTTH6ljSovk(BotForumHelper botForumHelper, long j, String str, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        TL_update.TL_updateMessageID tL_updateMessageID;
        if (updates == null) {
            botForumHelper.performSendBotTopicCreateComplete(j, -1);
            return;
        }
        botForumHelper.getMessagesController().processUpdates(updates, false);
        ArrayList<TLRPC.Update> arrayList = updates.updates;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                tL_updateMessageID = null;
                break;
            }
            TLRPC.Update update = arrayList.get(i);
            i++;
            TLRPC.Update update2 = update;
            if (update2 instanceof TL_update.TL_updateMessageID) {
                tL_updateMessageID = (TL_update.TL_updateMessageID) update2;
                break;
            }
        }
        if (tL_updateMessageID == null) {
            botForumHelper.performSendBotTopicCreateComplete(j, -1);
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
        tL_messageActionTopicCreate.title = str;
        tL_messageService.action = tL_messageActionTopicCreate;
        tL_messageService.peer_id = botForumHelper.getMessagesController().getPeer(j);
        tL_messageService.dialog_id = j;
        tL_messageService.id = tL_updateMessageID.id;
        tL_messageService.date = (int) (System.currentTimeMillis() / 1000);
        int i2 = tL_updateMessageID.id;
        tL_forumTopic.id = i2;
        tL_forumTopic.my = true;
        tL_forumTopic.flags |= 2;
        tL_forumTopic.topicStartMessage = tL_messageService;
        tL_forumTopic.title = str;
        tL_forumTopic.top_message = i2;
        tL_forumTopic.topMessage = tL_messageService;
        tL_forumTopic.from_id = botForumHelper.getMessagesController().getPeer(botForumHelper.getUserConfig().clientUserId);
        tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
        tL_forumTopic.icon_color = 0;
        tL_forumTopic.title_missing = true;
        botForumHelper.getMessagesController().getTopicsController().onTopicCreated(j, tL_forumTopic, true);
        botForumHelper.performSendBotTopicCreateComplete(j, tL_updateMessageID.id);
        botForumHelper.getNotificationCenter().postNotificationName(NotificationCenter.botForumTopicDidCreate, new BotForumTopicCreateNotification(j, tL_updateMessageID.id));
    }

    private void performSendBotTopicCreateComplete(long j, int i) {
        List<MessagesStorage.IntCallback> list = this.pendingBotTopics.get(j);
        if (list != null) {
            this.pendingBotTopics.remove(j);
            Iterator<MessagesStorage.IntCallback> it = list.iterator();
            while (it.hasNext()) {
                it.next().run(i);
            }
        }
    }

    public static class BotForumTopicCreateNotification {
        public final long dialogId;
        public final int topicId;

        public BotForumTopicCreateNotification(long j, int i) {
            this.dialogId = j;
            this.topicId = i;
        }
    }

    public static class BotForumTextDraftUpdateNotification {
        public final long botTopicId;
        public final long botUserId;
        public final boolean isNew;
        public final MessageObject messageObject;

        public BotForumTextDraftUpdateNotification(long j, long j2, MessageObject messageObject, boolean z) {
            this.botUserId = j;
            this.botTopicId = j2;
            this.messageObject = messageObject;
            this.isNew = z;
        }
    }

    public static class BotForumTextDraftDeleteNotification {
        public final long botTopicId;
        public final long botUserId;
        public final int messageId;

        public BotForumTextDraftDeleteNotification(long j, long j2, int i) {
            this.botUserId = j;
            this.botTopicId = j2;
            this.messageId = i;
        }
    }

    public static boolean isBotForum(int i, long j) {
        if (j > 0) {
            return UserObject.isBotForum(MessagesController.getInstance(i).getUser(Long.valueOf(j)));
        }
        MessagesController.getInstance(i).getChat(Long.valueOf(-j));
        return false;
    }

    public void saveIsStreamingTopic(long j, long j2, boolean z) {
        this.preferences.edit().putBoolean(j + "_" + j2, z).apply();
    }

    public boolean isStreamingTopic(long j, long j2) {
        return this.preferences.getBoolean(j + "_" + j2, false);
    }

    private BotForumHelper(int i) {
        super(i);
        this.botTextDraftsByRandomIds = new DialogTopicIdKeyMap<>();
        this.botTextDraftsByRandomIdsBlocklist = new DialogTopicIdKeyMap<>();
        this.pendingBotTopics = new LongSparseArray<>();
        this.preferences = ApplicationLoader.applicationContext.getSharedPreferences("bot_drafts" + i, 0);
    }

    public static BotForumHelper getInstance(int i) {
        BotForumHelper botForumHelper;
        BotForumHelper botForumHelper2 = Instance[i];
        if (botForumHelper2 != null) {
            return botForumHelper2;
        }
        synchronized (BotForumHelper.class) {
            try {
                botForumHelper = Instance[i];
                if (botForumHelper == null) {
                    BotForumHelper[] botForumHelperArr = Instance;
                    BotForumHelper botForumHelper3 = new BotForumHelper(i);
                    botForumHelperArr[i] = botForumHelper3;
                    botForumHelper = botForumHelper3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return botForumHelper;
    }

    public static class BotDraftAnimationsPool {
        private final DialogTopicIdKeyMap<MultiLayoutTypingAnimator> animators = new DialogTopicIdKeyMap<>();
        private final SparseIntArray ids = new SparseIntArray();

        public MultiLayoutTypingAnimator getAnimator(long j, int i, boolean z) {
            if (i > 0) {
                i = this.ids.get(i, 0);
            }
            if (i == 0) {
                return null;
            }
            long j2 = i;
            MultiLayoutTypingAnimator multiLayoutTypingAnimator = this.animators.get(j, 0L, j2);
            if (multiLayoutTypingAnimator != null || !z) {
                return multiLayoutTypingAnimator;
            }
            MultiLayoutTypingAnimator multiLayoutTypingAnimator2 = new MultiLayoutTypingAnimator();
            this.animators.put(j, 0L, j2, multiLayoutTypingAnimator2);
            return multiLayoutTypingAnimator2;
        }

        public void bind(int i, int i2) {
            this.ids.put(i2, i);
        }

        public void removeAnimator(long j, int i) {
            if (i > 0) {
                i = this.ids.get(i, 0);
            }
            if (i == 0) {
                return;
            }
            this.animators.remove(j, 0L, i);
        }
    }

    public static class DialogTopicIdKeyMap<T> {
        private final LongSparseArray<LongSparseArray<LongSparseArray<T>>> map = new LongSparseArray<>();

        public LongSparseArray<T> get(long j, long j2) {
            LongSparseArray<LongSparseArray<T>> longSparseArray = this.map.get(j);
            if (longSparseArray == null) {
                return null;
            }
            return longSparseArray.get(j2);
        }

        public T get(long j, long j2, long j3) {
            LongSparseArray<T> longSparseArray = get(j, j2);
            if (longSparseArray == null) {
                return null;
            }
            return longSparseArray.get(j3);
        }

        public T put(long j, long j2, long j3, T t) {
            LongSparseArray<LongSparseArray<T>> longSparseArray = this.map.get(j);
            if (longSparseArray == null) {
                longSparseArray = new LongSparseArray<>();
                this.map.put(j, longSparseArray);
            }
            LongSparseArray<T> longSparseArray2 = longSparseArray.get(j2);
            if (longSparseArray2 == null) {
                longSparseArray2 = new LongSparseArray<>();
                longSparseArray.put(j2, longSparseArray2);
            }
            T t2 = longSparseArray2.get(j3);
            longSparseArray2.put(j3, t);
            return t2;
        }

        public LongSparseArray<T> removeAll(long j, long j2) {
            LongSparseArray<LongSparseArray<T>> longSparseArray = this.map.get(j);
            if (longSparseArray == null) {
                return null;
            }
            LongSparseArray<T> longSparseArray2 = longSparseArray.get(j2);
            longSparseArray.remove(j2);
            return longSparseArray2;
        }

        public T remove(long j, long j2, long j3) {
            LongSparseArray<T> longSparseArray;
            LongSparseArray<LongSparseArray<T>> longSparseArray2 = this.map.get(j);
            if (longSparseArray2 == null || (longSparseArray = longSparseArray2.get(j2)) == null) {
                return null;
            }
            T t = longSparseArray.get(j3);
            longSparseArray.remove(j3);
            return t;
        }
    }

    public static CharSequence applyTypingAnimationSpan(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder;
        TypingBotSpan[] typingBotSpanArr;
        if ((charSequence instanceof Spannable) && (typingBotSpanArr = (TypingBotSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), TypingBotSpan.class)) != null && typingBotSpanArr.length > 0) {
            return charSequence;
        }
        if (charSequence instanceof SpannableStringBuilder) {
            spannableStringBuilder = (SpannableStringBuilder) charSequence;
        } else {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        }
        TypingDotsDrawable typingDotsDrawable = new TypingDotsDrawable(true);
        typingDotsDrawable.setColor(-1);
        typingDotsDrawable.start();
        TypingBotSpan typingBotSpan = new TypingBotSpan(typingDotsDrawable, 1);
        typingBotSpan.setColorKey(Theme.key_chat_messageTextIn);
        typingBotSpan.setTopOffset(-AndroidUtilities.dp(10.0f));
        spannableStringBuilder.append((CharSequence) " _");
        spannableStringBuilder.setSpan(typingBotSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    private static class TypingBotSpan extends ColoredImageSpan {
        public TypingBotSpan(TypingDotsDrawable typingDotsDrawable, int i) {
            super(typingDotsDrawable, i);
        }
    }
}
