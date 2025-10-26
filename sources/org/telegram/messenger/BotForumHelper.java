package org.telegram.messenger;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.tlutils.TlUtils;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;
import org.telegram.ui.MultiLayoutTypingAnimator;

public class BotForumHelper extends BaseController {
    private static volatile BotForumHelper[] Instance = new BotForumHelper[4];
    private final DialogTopicIdKeyMap<BotDraftMessage> botTextDraftsByRandomIds;
    private final LongSparseArray<List<MessagesStorage.IntCallback>> pendingBotTopics;

    public boolean isThinking(long j, int i) {
        LongSparseArray<BotDraftMessage> longSparseArray = this.botTextDraftsByRandomIds.get(j, i);
        return longSparseArray != null && longSparseArray.size() > 0;
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
        MessageObject messageObject = new MessageObject(this.currentAccount, tL_message, true, true);
        messageObject.isBotPendingDraft = true;
        messageObject.resetLayout();
        return messageObject;
    }

    public void onBotForumDraftUpdate(final long j, final int i, final long j2, TLRPC.TL_textWithEntities tL_textWithEntities) {
        long j3;
        BotDraftMessage botDraftMessage;
        FileLog.d("[BotForum] onDraftNewDraft " + j + " " + i + " " + j2);
        long j4 = (long) i;
        BotDraftMessage botDraftMessage2 = this.botTextDraftsByRandomIds.get(j, j4, j2);
        if (botDraftMessage2 == null) {
            j3 = j4;
            BotDraftMessage botDraftMessage3 = new BotDraftMessage(j, i, j2, getUserConfig().getNewMessageId());
            this.botTextDraftsByRandomIds.put(j, j3, j2, botDraftMessage3);
            botDraftMessage = botDraftMessage3;
        } else {
            j3 = j4;
            botDraftMessage = botDraftMessage2;
        }
        boolean z = botDraftMessage.messageObject == null;
        if (botDraftMessage.selfDestruct != null) {
            AndroidUtilities.cancelRunOnUIThread(botDraftMessage.selfDestruct);
        }
        botDraftMessage.selfDestruct = new Runnable() {
            @Override
            public final void run() {
                BotForumHelper.this.lambda$onBotForumDraftUpdate$0(j, i, j2);
            }
        };
        botDraftMessage.text = tL_textWithEntities;
        botDraftMessage.messageObject = createDraftMessage(j, i, j2, botDraftMessage.localMessageId, tL_textWithEntities);
        AndroidUtilities.runOnUIThread(botDraftMessage.selfDestruct, getAppGlobalConfig().messageTypingDraftTtl.get(TimeUnit.MILLISECONDS));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botForumDraftUpdate, new BotForumTextDraftUpdateNotification(j, j3, botDraftMessage.messageObject, z));
    }

    public MessageObject onBotForumDraftCheckNewMessages(long j, int i, int i2, String str) {
        long j2 = i;
        LongSparseArray<BotDraftMessage> longSparseArray = this.botTextDraftsByRandomIds.get(j, j2);
        if (longSparseArray == null) {
            return null;
        }
        for (int i3 = 0; i3 < longSparseArray.size(); i3++) {
            BotDraftMessage valueAt = longSparseArray.valueAt(i3);
            if (str.startsWith(valueAt.text.text)) {
                if (valueAt.selfDestruct != null) {
                    AndroidUtilities.cancelRunOnUIThread(valueAt.selfDestruct);
                }
                this.botTextDraftsByRandomIds.remove(j, j2, valueAt.randomId);
                FileLog.d("[BotForum] onDraftNewMessage " + j + " " + i);
                return valueAt.messageObject;
            }
        }
        return null;
    }

    public void lambda$onBotForumDraftUpdate$0(long j, int i, long j2) {
        long j3 = i;
        BotDraftMessage remove = this.botTextDraftsByRandomIds.remove(j, j3, j2);
        if (remove == null) {
            return;
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botForumDraftDelete, new BotForumTextDraftDeleteNotification(j, j3, remove.localMessageId));
    }

    public static class BotDraftMessage {
        public final int localMessageId;
        private MessageObject messageObject;
        public final long randomId;
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
            if (inputPeerFromSendMessageRequest == null || peerDialogId <= 0 || !UserObject.isBotForum(getMessagesController().getUser(Long.valueOf(peerDialogId)))) {
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
                    BotForumHelper.this.lambda$beforeSendingFinalRequest$2(tLObject, jArr, peerDialogId, runnable, i2);
                }
            });
            return false;
        }
        return true;
    }

    public void lambda$beforeSendingFinalRequest$2(TLObject tLObject, final long[] jArr, final long j, final Runnable runnable, final int i) {
        if (tLObject instanceof TLRPC.TL_messages_forwardMessages) {
            TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages = (TLRPC.TL_messages_forwardMessages) tLObject;
            tL_messages_forwardMessages.top_msg_id = i;
            tL_messages_forwardMessages.flags |= 512;
        } else {
            TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
            tL_inputReplyToMessage.reply_to_msg_id = i;
            TlUtils.setInputReplyToFromSendMessageRequest(tLObject, tL_inputReplyToMessage);
        }
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                BotForumHelper.this.lambda$beforeSendingFinalRequest$1(jArr, j, i, runnable);
            }
        });
    }

    public void lambda$beforeSendingFinalRequest$1(long[] jArr, long j, int i, Runnable runnable) {
        for (long j2 : jArr) {
            getMessagesStorage().updateMessageTopicId(j, j2, i);
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
        getConnectionsManager().sendRequestTyped(tL_messages_createForumTopic, new BotForumHelper$$ExternalSyntheticLambda2(), new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                BotForumHelper.this.lambda$performSendBotTopicCreate$3(peerDialogId, str, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    public void lambda$performSendBotTopicCreate$3(long j, String str, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        TLRPC.TL_updateMessageID tL_updateMessageID;
        if (updates == null) {
            performSendBotTopicCreateComplete(j, -1);
            return;
        }
        getMessagesController().processUpdates(updates, false);
        Iterator<TLRPC.Update> it = updates.updates.iterator();
        while (true) {
            if (!it.hasNext()) {
                tL_updateMessageID = null;
                break;
            }
            TLRPC.Update next = it.next();
            if (next instanceof TLRPC.TL_updateMessageID) {
                tL_updateMessageID = (TLRPC.TL_updateMessageID) next;
                break;
            }
        }
        if (tL_updateMessageID == null) {
            performSendBotTopicCreateComplete(j, -1);
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
        tL_messageActionTopicCreate.title = str;
        tL_messageService.action = tL_messageActionTopicCreate;
        tL_messageService.peer_id = getMessagesController().getPeer(j);
        tL_messageService.dialog_id = j;
        tL_messageService.id = tL_updateMessageID.id;
        tL_messageService.date = (int) (System.currentTimeMillis() / 1000);
        int i = tL_updateMessageID.id;
        tL_forumTopic.id = i;
        tL_forumTopic.my = true;
        tL_forumTopic.flags |= 2;
        tL_forumTopic.topicStartMessage = tL_messageService;
        tL_forumTopic.title = str;
        tL_forumTopic.top_message = i;
        tL_forumTopic.topMessage = tL_messageService;
        tL_forumTopic.from_id = getMessagesController().getPeer(getUserConfig().clientUserId);
        tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
        tL_forumTopic.icon_color = 0;
        tL_forumTopic.title_missing = true;
        getMessagesController().getTopicsController().onTopicCreated(j, tL_forumTopic, true);
        performSendBotTopicCreateComplete(j, tL_updateMessageID.id);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botForumTopicDidCreate, new BotForumTopicCreateNotification(j, tL_updateMessageID.id));
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

    private BotForumHelper(int i) {
        super(i);
        this.botTextDraftsByRandomIds = new DialogTopicIdKeyMap<>();
        this.pendingBotTopics = new LongSparseArray<>();
    }

    public static BotForumHelper getInstance(int i) {
        BotForumHelper botForumHelper = Instance[i];
        if (botForumHelper == null) {
            synchronized (BotForumHelper.class) {
                try {
                    botForumHelper = Instance[i];
                    if (botForumHelper == null) {
                        BotForumHelper[] botForumHelperArr = Instance;
                        BotForumHelper botForumHelper2 = new BotForumHelper(i);
                        botForumHelperArr[i] = botForumHelper2;
                        botForumHelper = botForumHelper2;
                    }
                } finally {
                }
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
}
