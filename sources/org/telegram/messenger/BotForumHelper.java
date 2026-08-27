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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_forum;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.l41;
import org.telegram.ui.gj0;

public class BotForumHelper extends BaseController {
    private static volatile BotForumHelper[] Instance = new BotForumHelper[4];
    private final DialogTopicIdKeyMap<BotDraftMessage> botTextDraftsByRandomIds;
    private final DialogTopicIdKeyMap<Object> botTextDraftsByRandomIdsBlocklist;
    private final LongSparseArray<List<MessagesStorage.IntCallback>> pendingBotTopics;
    private final SharedPreferences preferences;

    public static class BotDraftAnimationsPool {
        private final DialogTopicIdKeyMap<gj0> animators = new DialogTopicIdKeyMap<>();
        private final SparseIntArray ids = new SparseIntArray();

        public void bind(int i10, int i11) {
            this.ids.put(i11, i10);
        }

        public gj0 getAnimator(long j10, int i10, boolean z10) {
            if (i10 > 0) {
                i10 = this.ids.get(i10, 0);
            }
            if (i10 == 0) {
                return null;
            }
            long j11 = i10;
            gj0 gj0Var = this.animators.get(j10, 0L, j11);
            if (gj0Var != null || !z10) {
                return gj0Var;
            }
            gj0 gj0Var2 = new gj0();
            this.animators.put(j10, 0L, j11, gj0Var2);
            return gj0Var2;
        }

        public void removeAnimator(long j10, int i10) {
            if (i10 > 0) {
                i10 = this.ids.get(i10, 0);
            }
            if (i10 == 0) {
                return;
            }
            this.animators.remove(j10, 0L, i10);
        }
    }

    public static class BotDraftMessage {
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

        private BotDraftMessage(long j10, int i10, long j11, int i11) {
            this.userId = j10;
            this.topicId = i10;
            this.randomId = j11;
            this.localMessageId = i11;
        }
    }

    public static class BotForumTextDraftDeleteNotification {
        public final long botTopicId;
        public final long botUserId;
        public final int messageId;

        public BotForumTextDraftDeleteNotification(long j10, long j11, int i10) {
            this.botUserId = j10;
            this.botTopicId = j11;
            this.messageId = i10;
        }
    }

    public static class BotForumTextDraftUpdateNotification {
        public final long botTopicId;
        public final long botUserId;
        public final boolean isNew;
        public final MessageObject messageObject;

        public BotForumTextDraftUpdateNotification(long j10, long j11, MessageObject messageObject, boolean z10) {
            this.botUserId = j10;
            this.botTopicId = j11;
            this.messageObject = messageObject;
            this.isNew = z10;
        }
    }

    public static class BotForumTopicCreateNotification {
        public final long dialogId;
        public final int topicId;

        public BotForumTopicCreateNotification(long j10, int i10) {
            this.dialogId = j10;
            this.topicId = i10;
        }
    }

    public enum SteamingSendButtonState {
        NO_STREAMING,
        BLOCKING,
        STOP
    }

    public static class TypingBotSpan extends cq {
        public TypingBotSpan(l41 l41Var, int i10) {
            super(i10, l41Var);
        }
    }

    private BotForumHelper(int i10) {
        super(i10);
        this.botTextDraftsByRandomIds = new DialogTopicIdKeyMap<>();
        this.botTextDraftsByRandomIdsBlocklist = new DialogTopicIdKeyMap<>();
        this.pendingBotTopics = new LongSparseArray<>();
        this.preferences = ApplicationLoader.applicationContext.getSharedPreferences("bot_drafts" + i10, 0);
    }

    public static CharSequence applyTypingAnimationSpan(CharSequence charSequence) {
        TypingBotSpan[] typingBotSpanArr;
        if ((charSequence instanceof Spannable) && (typingBotSpanArr = (TypingBotSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), TypingBotSpan.class)) != null && typingBotSpanArr.length > 0) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(charSequence);
        l41 l41Var = new l41(true);
        l41Var.b(-1);
        l41Var.d();
        TypingBotSpan typingBotSpan = new TypingBotSpan(l41Var, 1);
        typingBotSpan.setColorKey(org.telegram.ui.ActionBar.g6.f23077ec);
        typingBotSpan.setTopOffset(-AndroidUtilities.dp(10.0f));
        spannableStringBuilder.append((CharSequence) " _");
        spannableStringBuilder.setSpan(typingBotSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    private MessageObject createDraftMessage(long j10, int i10, long j11, int i11, TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.dialog_id = j10;
        tL_message.peer_id = getMessagesController().getPeer(j10);
        tL_message.from_id = getMessagesController().getPeer(j10);
        tL_message.local_id = i11;
        tL_message.f22401id = i11;
        tL_message.random_id = j11;
        tL_message.message = tL_textWithEntities.text;
        tL_message.entities = tL_textWithEntities.entities;
        tL_message.flags |= 128;
        tL_message.date = getConnectionsManager().getCurrentTime();
        TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
        tL_message.reply_to = tL_messageReplyHeader;
        tL_message.flags |= 16;
        tL_messageReplyHeader.forum_topic = true;
        tL_messageReplyHeader.reply_to_top_id = i10;
        tL_messageReplyHeader.flags |= 2;
        tL_message.media = new TLRPC.TL_messageMediaEmpty();
        tL_message.flags |= 512;
        MessageObject messageObject = new MessageObject(this.currentAccount, tL_message, false, true);
        messageObject.isBotPendingDraft = true;
        messageObject.resetLayout();
        return messageObject;
    }

    public static BotForumHelper getInstance(int i10) {
        BotForumHelper botForumHelper;
        BotForumHelper botForumHelper2 = Instance[i10];
        if (botForumHelper2 != null) {
            return botForumHelper2;
        }
        synchronized (BotForumHelper.class) {
            try {
                botForumHelper = Instance[i10];
                if (botForumHelper == null) {
                    BotForumHelper[] botForumHelperArr = Instance;
                    BotForumHelper botForumHelper3 = new BotForumHelper(i10);
                    botForumHelperArr[i10] = botForumHelper3;
                    botForumHelper = botForumHelper3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return botForumHelper;
    }

    public static boolean isBotForum(int i10, long j10) {
        if (j10 > 0) {
            return UserObject.isBotForum(MessagesController.getInstance(i10).getUser(Long.valueOf(j10)));
        }
        MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        return false;
    }

    public void lambda$beforeSendingFinalRequest$3(long[] jArr, long j10, int i10, Runnable runnable) {
        for (long j11 : jArr) {
            getMessagesStorage().updateMessageTopicId(j10, j11, i10);
        }
        AndroidUtilities.runOnUIThread(runnable);
    }

    public void lambda$beforeSendingFinalRequest$4(TLObject tLObject, long[] jArr, long j10, Runnable runnable, int i10) {
        boolean z10 = tLObject instanceof TLRPC.TL_messages_forwardMessages;
        if (z10) {
            TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages = (TLRPC.TL_messages_forwardMessages) tLObject;
            tL_messages_forwardMessages.top_msg_id = i10;
            tL_messages_forwardMessages.flags |= 512;
        } else {
            TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
            tL_inputReplyToMessage.reply_to_msg_id = i10;
            if (tLObject instanceof TLRPC.TL_messages_sendMessage) {
                TLRPC.TL_messages_sendMessage tL_messages_sendMessage = (TLRPC.TL_messages_sendMessage) tLObject;
                tL_messages_sendMessage.reply_to = tL_inputReplyToMessage;
                tL_messages_sendMessage.flags |= 1;
            } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
                TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
                tL_messages_sendMedia.reply_to = tL_inputReplyToMessage;
                tL_messages_sendMedia.flags |= 1;
            } else if (tLObject instanceof TL_ephemeral.TL_sendMessage) {
                TL_ephemeral.TL_sendMessage tL_sendMessage = (TL_ephemeral.TL_sendMessage) tLObject;
                tL_sendMessage.reply_to = tL_inputReplyToMessage;
                tL_sendMessage.flags |= 32;
            } else if (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) {
                TLRPC.TL_messages_sendInlineBotResult tL_messages_sendInlineBotResult = (TLRPC.TL_messages_sendInlineBotResult) tLObject;
                tL_messages_sendInlineBotResult.reply_to = tL_inputReplyToMessage;
                tL_messages_sendInlineBotResult.flags |= 1;
            } else if (z10) {
                TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages2 = (TLRPC.TL_messages_forwardMessages) tLObject;
                tL_messages_forwardMessages2.reply_to = tL_inputReplyToMessage;
                tL_messages_forwardMessages2.flags |= 1;
            } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) tLObject;
                tL_messages_sendMultiMedia.reply_to = tL_inputReplyToMessage;
                tL_messages_sendMultiMedia.flags |= 1;
            }
        }
        getMessagesStorage().getStorageQueue().postRunnable(new gh.a0(this, jArr, j10, i10, runnable));
    }

    public void lambda$performSendBotTopicCreate$5(long j10, String str, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        TL_update.TL_updateMessageID tL_updateMessageID;
        if (updates == null) {
            performSendBotTopicCreateComplete(j10, -1);
            return;
        }
        getMessagesController().processUpdates(updates, false);
        ArrayList<TLRPC.Update> arrayList = updates.updates;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                tL_updateMessageID = null;
                break;
            }
            TLRPC.Update update = arrayList.get(i10);
            i10++;
            TLRPC.Update update2 = update;
            if (update2 instanceof TL_update.TL_updateMessageID) {
                tL_updateMessageID = (TL_update.TL_updateMessageID) update2;
                break;
            }
        }
        if (tL_updateMessageID == null) {
            performSendBotTopicCreateComplete(j10, -1);
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
        tL_messageActionTopicCreate.title = str;
        tL_messageService.action = tL_messageActionTopicCreate;
        tL_messageService.peer_id = getMessagesController().getPeer(j10);
        tL_messageService.dialog_id = j10;
        tL_messageService.f22401id = tL_updateMessageID.f22635id;
        tL_messageService.date = (int) (System.currentTimeMillis() / 1000);
        int i11 = tL_updateMessageID.f22635id;
        tL_forumTopic.f22432id = i11;
        tL_forumTopic.my = true;
        tL_forumTopic.flags |= 2;
        tL_forumTopic.topicStartMessage = tL_messageService;
        tL_forumTopic.title = str;
        tL_forumTopic.top_message = i11;
        tL_forumTopic.topMessage = tL_messageService;
        tL_forumTopic.from_id = getMessagesController().getPeer(getUserConfig().clientUserId);
        tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
        tL_forumTopic.icon_color = 0;
        tL_forumTopic.title_missing = true;
        getMessagesController().getTopicsController().onTopicCreated(j10, tL_forumTopic, true);
        performSendBotTopicCreateComplete(j10, tL_updateMessageID.f22635id);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botForumTopicDidCreate, new BotForumTopicCreateNotification(j10, tL_updateMessageID.f22635id));
    }

    public void lambda$onBotForumDraftUpdate$1(long j10, int i10, long j11) {
        long j12 = i10;
        BotDraftMessage botDraftMessageRemove = this.botTextDraftsByRandomIds.remove(j10, j12, j11);
        if (botDraftMessageRemove == null) {
            return;
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botForumDraftDelete, new BotForumTextDraftDeleteNotification(j10, j12, botDraftMessageRemove.localMessageId));
    }

    private void performSendBotTopicCreate(TLRPC.InputPeer inputPeer, String str, long j10, MessagesStorage.IntCallback intCallback) {
        long peerDialogId = DialogObject.getPeerDialogId(inputPeer);
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
        tL_messages_createForumTopic.random_id = j10;
        getConnectionsManager().sendRequestTyped(tL_messages_createForumTopic, new a(), new lh(this, peerDialogId, str));
    }

    private void performSendBotTopicCreateComplete(long j10, int i10) {
        List<MessagesStorage.IntCallback> list = this.pendingBotTopics.get(j10);
        if (list != null) {
            this.pendingBotTopics.remove(j10);
            Iterator<MessagesStorage.IntCallback> it = list.iterator();
            while (it.hasNext()) {
                it.next().run(i10);
            }
        }
    }

    public boolean beforeSendingFinalRequest(TLObject tLObject, MessageObject messageObject, Runnable runnable) {
        return beforeSendingFinalRequest(tLObject, Collections.singletonList(messageObject), runnable);
    }

    public SteamingSendButtonState getStreamingSendButtonState(long j10, int i10) {
        LongSparseArray<BotDraftMessage> longSparseArray = this.botTextDraftsByRandomIds.get(j10, i10);
        if (longSparseArray == null || longSparseArray.size() <= 0) {
            return SteamingSendButtonState.NO_STREAMING;
        }
        int size = longSparseArray.size();
        BotDraftMessage botDraftMessageValueAt = null;
        for (int i11 = 0; i11 < size; i11++) {
            botDraftMessageValueAt = longSparseArray.valueAt(i11);
            if (!botDraftMessageValueAt.removed) {
                break;
            }
        }
        if (botDraftMessageValueAt == null || botDraftMessageValueAt.removed) {
            return SteamingSendButtonState.NO_STREAMING;
        }
        return botDraftMessageValueAt.canStop ? SteamingSendButtonState.STOP : SteamingSendButtonState.BLOCKING;
    }

    public boolean hasBotForumDrafts(long j10, int i10) {
        LongSparseArray<BotDraftMessage> longSparseArray = this.botTextDraftsByRandomIds.get(j10, i10);
        if (longSparseArray != null && longSparseArray.size() > 0) {
            int size = longSparseArray.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (!longSparseArray.valueAt(i11).removed) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isStreamingTopic(long j10, long j11) {
        return this.preferences.getBoolean(j10 + "_" + j11, false);
    }

    public MessageObject onBotForumDraftCheckNewMessages(long j10, int i10, int i11, String str) {
        BotDraftMessage botDraftMessage;
        removeAllMarkedAsRemovedMessages(j10, i10);
        long j11 = i10;
        LongSparseArray<BotDraftMessage> longSparseArray = this.botTextDraftsByRandomIds.get(j10, j11);
        if (longSparseArray == null) {
            return null;
        }
        int i12 = 0;
        BotDraftMessage botDraftMessage2 = null;
        while (true) {
            if (i12 >= longSparseArray.size()) {
                botDraftMessage = botDraftMessage2;
                break;
            }
            BotDraftMessage botDraftMessageValueAt = longSparseArray.valueAt(i12);
            if (botDraftMessage2 == null) {
                botDraftMessage2 = botDraftMessageValueAt;
            }
            if (str != null && botDraftMessageValueAt.text != null && str.startsWith(botDraftMessageValueAt.text.text)) {
                botDraftMessage = botDraftMessageValueAt;
                break;
            }
            i12++;
        }
        if (botDraftMessage == null) {
            return null;
        }
        if (botDraftMessage.selfDestruct != null) {
            AndroidUtilities.cancelRunOnUIThread(botDraftMessage.selfDestruct);
        }
        this.botTextDraftsByRandomIds.remove(j10, j11, botDraftMessage.randomId);
        FileLog.d("[BotForum] onDraftNewMessage " + j10 + " " + i10);
        return botDraftMessage.messageObject;
    }

    public void onBotForumDraftUpdate(long j10, int i10, TLRPC.TL_sendMessageTextDraftAction tL_sendMessageTextDraftAction) {
        onBotForumDraftUpdate(j10, i10, tL_sendMessageTextDraftAction.random_id, tL_sendMessageTextDraftAction.text, tL_sendMessageTextDraftAction.can_stop, tL_sendMessageTextDraftAction.keep_on_stop);
    }

    public void removeAllMarkedAsRemovedMessages(long j10, int i10) {
        long j11 = i10;
        long j12 = j10;
        LongSparseArray<BotDraftMessage> longSparseArray = this.botTextDraftsByRandomIds.get(j12, j11);
        if (longSparseArray == null) {
            return;
        }
        int size = longSparseArray.size();
        int i11 = 0;
        while (i11 < size) {
            BotDraftMessage botDraftMessageValueAt = longSparseArray.valueAt(i11);
            if (botDraftMessageValueAt.removed) {
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botForumDraftDelete, new BotForumTextDraftDeleteNotification(j12, j11, botDraftMessageValueAt.localMessageId));
                this.botTextDraftsByRandomIds.remove(j10, j11, botDraftMessageValueAt.randomId);
                i11--;
                size--;
            }
            i11++;
            j12 = j10;
        }
    }

    public void saveIsStreamingTopic(long j10, long j11, boolean z10) {
        this.preferences.edit().putBoolean(j10 + "_" + j11, z10).apply();
    }

    public void stopStreaming(long j10, long j11) {
        long j12;
        long j13;
        LongSparseArray<BotDraftMessage> longSparseArray = this.botTextDraftsByRandomIds.get(j10, j11);
        if (longSparseArray == null || longSparseArray.size() <= 0) {
            return;
        }
        int size = longSparseArray.size();
        int i10 = 0;
        BotDraftMessage botDraftMessageValueAt = null;
        long jKeyAt = 0;
        for (int i11 = 0; i11 < size; i11++) {
            jKeyAt = longSparseArray.keyAt(i11);
            botDraftMessageValueAt = longSparseArray.valueAt(i11);
            if (!botDraftMessageValueAt.removed) {
                break;
            }
        }
        long j14 = jKeyAt;
        BotDraftMessage botDraftMessage = botDraftMessageValueAt;
        if (botDraftMessage == null || botDraftMessage.removed) {
            return;
        }
        if (botDraftMessage.selfDestruct != null) {
            AndroidUtilities.cancelRunOnUIThread(botDraftMessage.selfDestruct);
        }
        this.botTextDraftsByRandomIdsBlocklist.put(j10, j11, j14, new Object());
        if (botDraftMessage.keepOnStop) {
            botDraftMessage.removed = true;
            j12 = j10;
            j13 = j11;
        } else {
            j12 = j10;
            j13 = j11;
            this.botTextDraftsByRandomIds.remove(j12, j13, j14);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botForumDraftDelete, new BotForumTextDraftDeleteNotification(j12, j13, botDraftMessage.localMessageId));
        }
        TLRPC.TL_sendMessageStopDraftAction tL_sendMessageStopDraftAction = new TLRPC.TL_sendMessageStopDraftAction();
        tL_sendMessageStopDraftAction.random_id = j14;
        TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
        tL_messages_setTyping.peer = getMessagesController().getInputPeer(j12);
        tL_messages_setTyping.action = tL_sendMessageStopDraftAction;
        if (j13 != 0) {
            tL_messages_setTyping.flags |= 1;
            tL_messages_setTyping.top_msg_id = (int) j13;
        }
        getConnectionsManager().sendRequestTyped(tL_messages_setTyping, new k0(i10));
    }

    public static class DialogTopicIdKeyMap<T> {
        private final LongSparseArray<LongSparseArray<LongSparseArray<T>>> map = new LongSparseArray<>();

        public LongSparseArray<T> get(long j10, long j11) {
            LongSparseArray<LongSparseArray<T>> longSparseArray = this.map.get(j10);
            if (longSparseArray == null) {
                return null;
            }
            return longSparseArray.get(j11);
        }

        public T put(long j10, long j11, long j12, T t10) {
            LongSparseArray<LongSparseArray<T>> longSparseArray = this.map.get(j10);
            if (longSparseArray == null) {
                longSparseArray = new LongSparseArray<>();
                this.map.put(j10, longSparseArray);
            }
            LongSparseArray<T> longSparseArray2 = longSparseArray.get(j11);
            if (longSparseArray2 == null) {
                longSparseArray2 = new LongSparseArray<>();
                longSparseArray.put(j11, longSparseArray2);
            }
            T t11 = longSparseArray2.get(j12);
            longSparseArray2.put(j12, t10);
            return t11;
        }

        public T remove(long j10, long j11, long j12) {
            LongSparseArray<T> longSparseArray;
            LongSparseArray<LongSparseArray<T>> longSparseArray2 = this.map.get(j10);
            if (longSparseArray2 == null || (longSparseArray = longSparseArray2.get(j11)) == null) {
                return null;
            }
            T t10 = longSparseArray.get(j12);
            longSparseArray.remove(j12);
            return t10;
        }

        public LongSparseArray<T> removeAll(long j10, long j11) {
            LongSparseArray<LongSparseArray<T>> longSparseArray = this.map.get(j10);
            if (longSparseArray == null) {
                return null;
            }
            LongSparseArray<T> longSparseArray2 = longSparseArray.get(j11);
            longSparseArray.remove(j11);
            return longSparseArray2;
        }

        public T get(long j10, long j11, long j12) {
            LongSparseArray<T> longSparseArray = get(j10, j11);
            if (longSparseArray == null) {
                return null;
            }
            return longSparseArray.get(j12);
        }
    }

    public boolean beforeSendingFinalRequest(final TLObject tLObject, List<MessageObject> list, final Runnable runnable) {
        TLRPC.InputPeer inputPeer;
        TLRPC.InputPeer inputPeer2;
        long j10;
        long jCalcHash;
        TLRPC.InputReplyTo inputReplyTo;
        String string;
        ArrayList<TLRPC.TL_inputSingleMedia> arrayList;
        int size;
        int i10;
        TLRPC.TL_inputSingleMedia tL_inputSingleMedia;
        long nextRandomId;
        if (list == null || list.isEmpty()) {
            return true;
        }
        boolean z10 = tLObject instanceof TLRPC.TL_messages_sendMessage;
        if (z10) {
            inputPeer2 = ((TLRPC.TL_messages_sendMessage) tLObject).peer;
        } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
            inputPeer2 = ((TLRPC.TL_messages_sendMedia) tLObject).peer;
        } else if (tLObject instanceof TL_ephemeral.TL_sendMessage) {
            inputPeer2 = ((TL_ephemeral.TL_sendMessage) tLObject).peer;
        } else if (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) {
            inputPeer2 = ((TLRPC.TL_messages_sendInlineBotResult) tLObject).peer;
        } else {
            if (!(tLObject instanceof TLRPC.TL_messages_forwardMessages)) {
                if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                    inputPeer2 = ((TLRPC.TL_messages_sendMultiMedia) tLObject).peer;
                } else {
                    inputPeer = null;
                }
                long peerDialogId = DialogObject.getPeerDialogId(inputPeer);
                if (inputPeer != null || peerDialogId <= 0 || !UserObject.isBotForumWithEditableTopics(getMessagesController().getUser(Long.valueOf(peerDialogId)))) {
                    return true;
                }
                final long[] jArr = new long[list.size()];
                for (int i11 = 0; i11 < list.size(); i11++) {
                    jArr[i11] = list.get(i11).getId();
                }
                if (z10) {
                    jCalcHash = ((TLRPC.TL_messages_sendMessage) tLObject).random_id;
                } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
                    jCalcHash = ((TLRPC.TL_messages_sendMedia) tLObject).random_id;
                } else if (tLObject instanceof TL_ephemeral.TL_sendMessage) {
                    jCalcHash = ((TL_ephemeral.TL_sendMessage) tLObject).random_id;
                } else {
                    if (!(tLObject instanceof TLRPC.TL_messages_sendInlineBotResult)) {
                        if (tLObject instanceof TLRPC.TL_messages_forwardMessages) {
                            ArrayList<Long> arrayList2 = ((TLRPC.TL_messages_forwardMessages) tLObject).random_id;
                            int size2 = arrayList2.size();
                            jCalcHash = 0;
                            int i12 = 0;
                            while (i12 < size2) {
                                Long l10 = arrayList2.get(i12);
                                i12++;
                                jCalcHash = MediaDataController.calcHash(jCalcHash, l10.longValue());
                                peerDialogId = peerDialogId;
                            }
                        } else {
                            j10 = peerDialogId;
                            if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                                ArrayList<TLRPC.TL_inputSingleMedia> arrayList3 = ((TLRPC.TL_messages_sendMultiMedia) tLObject).multi_media;
                                int size3 = arrayList3.size();
                                jCalcHash = 0;
                                int i13 = 0;
                                while (i13 < size3) {
                                    TLRPC.TL_inputSingleMedia tL_inputSingleMedia2 = arrayList3.get(i13);
                                    i13++;
                                    jCalcHash = MediaDataController.calcHash(jCalcHash, tL_inputSingleMedia2.random_id);
                                }
                            } else {
                                jCalcHash = 0;
                            }
                        }
                        if (z10) {
                            inputReplyTo = ((TLRPC.TL_messages_sendMessage) tLObject).reply_to;
                        } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
                            inputReplyTo = ((TLRPC.TL_messages_sendMedia) tLObject).reply_to;
                        } else if (tLObject instanceof TL_ephemeral.TL_sendMessage) {
                            inputReplyTo = ((TL_ephemeral.TL_sendMessage) tLObject).reply_to;
                        } else if (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) {
                            inputReplyTo = ((TLRPC.TL_messages_sendInlineBotResult) tLObject).reply_to;
                        } else if (tLObject instanceof TLRPC.TL_messages_forwardMessages) {
                            inputReplyTo = ((TLRPC.TL_messages_forwardMessages) tLObject).reply_to;
                        } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                            inputReplyTo = ((TLRPC.TL_messages_sendMultiMedia) tLObject).reply_to;
                        } else {
                            inputReplyTo = null;
                        }
                        if (inputReplyTo instanceof TLRPC.TL_inputReplyToMessage) {
                            return true;
                        }
                        if (!(tLObject instanceof TLRPC.TL_messages_forwardMessages) && ((TLRPC.TL_messages_forwardMessages) tLObject).top_msg_id != 0) {
                            return true;
                        }
                        if (z10) {
                            string = ((TLRPC.TL_messages_sendMessage) tLObject).message;
                        } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
                            string = ((TLRPC.TL_messages_sendMedia) tLObject).message;
                        } else if (tLObject instanceof TL_ephemeral.TL_sendMessage) {
                            if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                                string = null;
                                break;
                            }
                            arrayList = ((TLRPC.TL_messages_sendMultiMedia) tLObject).multi_media;
                            size = arrayList.size();
                            i10 = 0;
                            while (true) {
                                if (i10 < size) {
                                    string = null;
                                    break;
                                }
                                TLRPC.TL_inputSingleMedia tL_inputSingleMedia3 = arrayList.get(i10);
                                i10++;
                                tL_inputSingleMedia = tL_inputSingleMedia3;
                                if (!TextUtils.isEmpty(tL_inputSingleMedia.message)) {
                                    string = tL_inputSingleMedia.message;
                                    break;
                                }
                            }
                        } else {
                            string = ((TL_ephemeral.TL_sendMessage) tLObject).message;
                        }
                        if (jCalcHash != 0) {
                            nextRandomId = ~jCalcHash;
                        } else {
                            nextRandomId = getSendMessagesHelper().getNextRandomId();
                        }
                        long j11 = nextRandomId;
                        if (!TextUtils.isEmpty(string)) {
                            string = LocaleController.getString(R.string.TopicsTitleMedia);
                        } else if (string.length() > 16) {
                            string = string.substring(0, 16) + "...";
                        }
                        final long j12 = j10;
                        performSendBotTopicCreate(inputPeer, string, j11, new MessagesStorage.IntCallback() {
                            @Override
                            public final void run(int i14) {
                                this.f20535a.lambda$beforeSendingFinalRequest$4(tLObject, jArr, j12, runnable, i14);
                            }
                        });
                        return false;
                    }
                    jCalcHash = ((TLRPC.TL_messages_sendInlineBotResult) tLObject).random_id;
                }
                j10 = peerDialogId;
                if (z10) {
                    inputReplyTo = ((TLRPC.TL_messages_sendMessage) tLObject).reply_to;
                } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
                    inputReplyTo = ((TLRPC.TL_messages_sendMedia) tLObject).reply_to;
                } else if (tLObject instanceof TL_ephemeral.TL_sendMessage) {
                    inputReplyTo = ((TL_ephemeral.TL_sendMessage) tLObject).reply_to;
                } else if (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) {
                    inputReplyTo = ((TLRPC.TL_messages_sendInlineBotResult) tLObject).reply_to;
                } else if (tLObject instanceof TLRPC.TL_messages_forwardMessages) {
                    inputReplyTo = ((TLRPC.TL_messages_forwardMessages) tLObject).reply_to;
                } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                    inputReplyTo = ((TLRPC.TL_messages_sendMultiMedia) tLObject).reply_to;
                } else {
                    inputReplyTo = null;
                }
                if (inputReplyTo instanceof TLRPC.TL_inputReplyToMessage) {
                    return true;
                }
                if (!(tLObject instanceof TLRPC.TL_messages_forwardMessages)) {
                }
                if (z10) {
                    string = ((TLRPC.TL_messages_sendMessage) tLObject).message;
                } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
                    string = ((TLRPC.TL_messages_sendMedia) tLObject).message;
                } else if (tLObject instanceof TL_ephemeral.TL_sendMessage) {
                    if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                        string = null;
                        break;
                    }
                    arrayList = ((TLRPC.TL_messages_sendMultiMedia) tLObject).multi_media;
                    size = arrayList.size();
                    i10 = 0;
                    while (true) {
                        if (i10 < size) {
                            string = null;
                            break;
                        }
                        TLRPC.TL_inputSingleMedia tL_inputSingleMedia4 = arrayList.get(i10);
                        i10++;
                        tL_inputSingleMedia = tL_inputSingleMedia4;
                        if (!TextUtils.isEmpty(tL_inputSingleMedia.message)) {
                            string = tL_inputSingleMedia.message;
                            break;
                        }
                    }
                } else {
                    string = ((TL_ephemeral.TL_sendMessage) tLObject).message;
                }
                if (jCalcHash != 0) {
                    nextRandomId = ~jCalcHash;
                } else {
                    nextRandomId = getSendMessagesHelper().getNextRandomId();
                }
                long j13 = nextRandomId;
                if (!TextUtils.isEmpty(string)) {
                    string = LocaleController.getString(R.string.TopicsTitleMedia);
                } else if (string.length() > 16) {
                    string = string.substring(0, 16) + "...";
                }
                final long j14 = j10;
                performSendBotTopicCreate(inputPeer, string, j13, new MessagesStorage.IntCallback() {
                    @Override
                    public final void run(int i14) {
                        this.f20535a.lambda$beforeSendingFinalRequest$4(tLObject, jArr, j14, runnable, i14);
                    }
                });
                return false;
            }
            inputPeer2 = ((TLRPC.TL_messages_forwardMessages) tLObject).to_peer;
        }
        inputPeer = inputPeer2;
        long peerDialogId2 = DialogObject.getPeerDialogId(inputPeer);
        return inputPeer != null ? true : true;
    }

    public void onBotForumDraftUpdate(long j10, int i10, TLRPC.TL_sendMessageRichMessageDraftAction tL_sendMessageRichMessageDraftAction) {
        onBotForumDraftUpdate(j10, i10, tL_sendMessageRichMessageDraftAction.random_id, tL_sendMessageRichMessageDraftAction.rich_message, tL_sendMessageRichMessageDraftAction.can_stop, tL_sendMessageRichMessageDraftAction.keep_on_stop);
    }

    private void onBotForumDraftUpdate(long j10, int i10, long j11, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, boolean z11) {
        long[] jArr;
        BotDraftMessage botDraftMessage;
        FileLog.d("[BotForum] onDraftNewDraft " + j10 + " " + i10 + " " + j11);
        long j12 = (long) i10;
        if (this.botTextDraftsByRandomIdsBlocklist.get(j10, j12, j11) != null) {
            FileLog.d("[BotForum] onDraftNewDraft ignore " + j10 + " " + i10 + " " + j11);
            return;
        }
        LongSparseArray<BotDraftMessage> longSparseArray = this.botTextDraftsByRandomIds.get(j10, j12);
        if (longSparseArray == null || longSparseArray.size() <= 0) {
            jArr = null;
        } else {
            jArr = new long[longSparseArray.size()];
            int size = longSparseArray.size();
            for (int i11 = 0; i11 < size; i11++) {
                jArr[i11] = longSparseArray.keyAt(i11);
            }
        }
        long[] jArr2 = jArr;
        BotDraftMessage botDraftMessage2 = this.botTextDraftsByRandomIds.get(j10, j12, j11);
        if (botDraftMessage2 == null) {
            BotDraftMessage botDraftMessage3 = new BotDraftMessage(j10, i10, j11, getUserConfig().getNewMessageId());
            this.botTextDraftsByRandomIds.put(j10, j12, j11, botDraftMessage3);
            botDraftMessage = botDraftMessage3;
        } else {
            botDraftMessage = botDraftMessage2;
        }
        botDraftMessage.keepOnStop = z11;
        botDraftMessage.canStop = z10;
        if (jArr2 != null) {
            for (long j13 : jArr2) {
                if (j13 != j11) {
                    BotDraftMessage botDraftMessage4 = longSparseArray.get(j13);
                    if (botDraftMessage4.selfDestruct != null) {
                        AndroidUtilities.cancelRunOnUIThread(botDraftMessage4.selfDestruct);
                    }
                    lambda$onBotForumDraftUpdate$1(j10, i10, j13);
                }
            }
        }
        boolean z12 = botDraftMessage.messageObject == null;
        if (botDraftMessage.selfDestruct != null) {
            AndroidUtilities.cancelRunOnUIThread(botDraftMessage.selfDestruct);
        }
        botDraftMessage.selfDestruct = new j0(this, j10, i10, j11, 1);
        botDraftMessage.text = tL_textWithEntities;
        botDraftMessage.messageObject = createDraftMessage(j10, i10, j11, botDraftMessage.localMessageId, tL_textWithEntities);
        AndroidUtilities.runOnUIThread(botDraftMessage.selfDestruct, getAppGlobalConfig().messageTypingDraftTtl.get(TimeUnit.MILLISECONDS));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botForumDraftUpdate, new BotForumTextDraftUpdateNotification(j10, j12, botDraftMessage.messageObject, z12));
    }

    private MessageObject createDraftMessage(long j10, int i10, long j11, int i11, TL_iv.RichMessage richMessage) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.dialog_id = j10;
        tL_message.peer_id = getMessagesController().getPeer(j10);
        tL_message.from_id = getMessagesController().getPeer(j10);
        tL_message.local_id = i11;
        tL_message.f22401id = i11;
        tL_message.random_id = j11;
        tL_message.message = "";
        tL_message.flags |= 8192;
        tL_message.rich_message = richMessage;
        tL_message.date = getConnectionsManager().getCurrentTime();
        TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
        tL_message.reply_to = tL_messageReplyHeader;
        tL_message.flags |= 16;
        tL_messageReplyHeader.forum_topic = true;
        tL_messageReplyHeader.reply_to_top_id = i10;
        tL_messageReplyHeader.flags |= 2;
        tL_message.media = new TLRPC.TL_messageMediaEmpty();
        tL_message.flags |= 512;
        MessageObject messageObject = new MessageObject(this.currentAccount, tL_message, false, true);
        messageObject.isBotPendingDraft = true;
        messageObject.resetLayout();
        return messageObject;
    }

    private void onBotForumDraftUpdate(long j10, int i10, long j11, TL_iv.RichMessage richMessage, boolean z10, boolean z11) {
        long[] jArr;
        BotDraftMessage botDraftMessage;
        FileLog.d("[BotForum] onDraftNewDraft (rich_message) " + j10 + " " + i10 + " " + j11);
        long j12 = (long) i10;
        if (this.botTextDraftsByRandomIdsBlocklist.get(j10, j12, j11) != null) {
            FileLog.d("[BotForum] onDraftNewDraft (rich_message) ignore " + j10 + " " + i10 + " " + j11);
            return;
        }
        LongSparseArray<BotDraftMessage> longSparseArray = this.botTextDraftsByRandomIds.get(j10, j12);
        if (longSparseArray == null || longSparseArray.size() <= 0) {
            jArr = null;
        } else {
            jArr = new long[longSparseArray.size()];
            int size = longSparseArray.size();
            for (int i11 = 0; i11 < size; i11++) {
                jArr[i11] = longSparseArray.keyAt(i11);
            }
        }
        long[] jArr2 = jArr;
        BotDraftMessage botDraftMessage2 = this.botTextDraftsByRandomIds.get(j10, j12, j11);
        if (botDraftMessage2 == null) {
            BotDraftMessage botDraftMessage3 = new BotDraftMessage(j10, i10, j11, getUserConfig().getNewMessageId());
            this.botTextDraftsByRandomIds.put(j10, j12, j11, botDraftMessage3);
            botDraftMessage = botDraftMessage3;
        } else {
            botDraftMessage = botDraftMessage2;
        }
        botDraftMessage.keepOnStop = z11;
        botDraftMessage.canStop = z10;
        if (jArr2 != null) {
            for (long j13 : jArr2) {
                if (j13 != j11) {
                    BotDraftMessage botDraftMessage4 = longSparseArray.get(j13);
                    if (botDraftMessage4.selfDestruct != null) {
                        AndroidUtilities.cancelRunOnUIThread(botDraftMessage4.selfDestruct);
                    }
                    lambda$onBotForumDraftUpdate$1(j10, i10, j13);
                }
            }
        }
        boolean z12 = botDraftMessage.messageObject == null;
        if (botDraftMessage.selfDestruct != null) {
            AndroidUtilities.cancelRunOnUIThread(botDraftMessage.selfDestruct);
        }
        botDraftMessage.selfDestruct = new j0(this, j10, i10, j11, 0);
        botDraftMessage.richMessage = richMessage;
        botDraftMessage.messageObject = createDraftMessage(j10, i10, j11, botDraftMessage.localMessageId, richMessage);
        AndroidUtilities.runOnUIThread(botDraftMessage.selfDestruct, getAppGlobalConfig().messageTypingDraftTtl.get(TimeUnit.MILLISECONDS));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botForumDraftUpdate, new BotForumTextDraftUpdateNotification(j10, j12, botDraftMessage.messageObject, z12));
    }

    public static void lambda$stopStreaming$2(TLRPC.Bool bool, TLRPC.TL_error tL_error) {
    }
}
