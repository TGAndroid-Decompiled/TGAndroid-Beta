package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Paint;
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

    public static class BotDraftAnimationsPool {
        private final DialogTopicIdKeyMap<MultiLayoutTypingAnimator> animators = new DialogTopicIdKeyMap<>();
        private final SparseIntArray ids = new SparseIntArray();

        public void bind(int i, int i2) {
            this.ids.put(i2, i);
        }

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

        private BotDraftMessage(long j, int i, long j2, int i2) {
            this.userId = j;
            this.topicId = i;
            this.randomId = j2;
            this.localMessageId = i2;
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

    public static class BotForumTopicCreateNotification {
        public final long dialogId;
        public final int topicId;

        public BotForumTopicCreateNotification(long j, int i) {
            this.dialogId = j;
            this.topicId = i;
        }
    }

    public enum SteamingSendButtonState {
        NO_STREAMING,
        BLOCKING,
        STOP
    }

    public static class TypingBotSpan extends ColoredImageSpan {
        public TypingBotSpan(TypingDotsDrawable typingDotsDrawable, int i) {
            super(i, typingDotsDrawable);
        }
    }

    private BotForumHelper(int i) {
        super(i);
        this.botTextDraftsByRandomIds = new DialogTopicIdKeyMap<>();
        this.botTextDraftsByRandomIdsBlocklist = new DialogTopicIdKeyMap<>();
        this.pendingBotTopics = new LongSparseArray<>();
        this.preferences = ApplicationLoader.applicationContext.getSharedPreferences("bot_drafts" + i, 0);
    }

    public static CharSequence applyTypingAnimationSpan(CharSequence charSequence) {
        TypingBotSpan[] typingBotSpanArr;
        if ((charSequence instanceof Spannable) && (typingBotSpanArr = (TypingBotSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), TypingBotSpan.class)) != null && typingBotSpanArr.length > 0) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(charSequence);
        TypingDotsDrawable typingDotsDrawable = new TypingDotsDrawable(true);
        Paint paint = typingDotsDrawable.currentPaint;
        if (paint != null) {
            paint.setColor(-1);
        }
        typingDotsDrawable.start();
        TypingBotSpan typingBotSpan = new TypingBotSpan(typingDotsDrawable, 1);
        typingBotSpan.setColorKey(Theme.key_chat_messageTextIn);
        typingBotSpan.setTopOffset(-AndroidUtilities.dp(10.0f));
        spannableStringBuilder.append((CharSequence) " _");
        spannableStringBuilder.setSpan(typingBotSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
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

    public static boolean isBotForum(int i, long j) {
        if (j > 0) {
            return UserObject.isBotForum(MessagesController.getInstance(i).getUser(Long.valueOf(j)));
        }
        MessagesController.getInstance(i).getChat(Long.valueOf(-j));
        return false;
    }

    public void lambda$beforeSendingFinalRequest$3(long[] jArr, long j, int i, Runnable runnable) {
        for (long j2 : jArr) {
            getMessagesStorage().updateMessageTopicId(j, j2, i);
        }
        AndroidUtilities.runOnUIThread(runnable);
    }

    public void lambda$beforeSendingFinalRequest$4(TLObject tLObject, long[] jArr, long j, Runnable runnable, int i) {
        boolean z = tLObject instanceof TLRPC.TL_messages_forwardMessages;
        if (z) {
            TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages = (TLRPC.TL_messages_forwardMessages) tLObject;
            tL_messages_forwardMessages.top_msg_id = i;
            tL_messages_forwardMessages.flags |= 512;
        } else {
            TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
            tL_inputReplyToMessage.reply_to_msg_id = i;
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
            } else if (z) {
                TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages2 = (TLRPC.TL_messages_forwardMessages) tLObject;
                tL_messages_forwardMessages2.reply_to = tL_inputReplyToMessage;
                tL_messages_forwardMessages2.flags |= 1;
            } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) tLObject;
                tL_messages_sendMultiMedia.reply_to = tL_inputReplyToMessage;
                tL_messages_sendMultiMedia.flags |= 1;
            }
        }
        getMessagesStorage().getStorageQueue().postRunnable(new BotForumHelper$$ExternalSyntheticLambda2(this, jArr, j, i, runnable));
    }

    public void lambda$performSendBotTopicCreate$5(long j, String str, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        TL_update.TL_updateMessageID tL_updateMessageID;
        if (updates == null) {
            performSendBotTopicCreateComplete(j, -1);
            return;
        }
        getMessagesController().processUpdates(updates, false);
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
        int i2 = tL_updateMessageID.id;
        tL_forumTopic.id = i2;
        tL_forumTopic.my = true;
        tL_forumTopic.flags |= 2;
        tL_forumTopic.topicStartMessage = tL_messageService;
        tL_forumTopic.title = str;
        tL_forumTopic.top_message = i2;
        tL_forumTopic.topMessage = tL_messageService;
        tL_forumTopic.from_id = getMessagesController().getPeer(getUserConfig().clientUserId);
        tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
        tL_forumTopic.icon_color = 0;
        tL_forumTopic.title_missing = true;
        getMessagesController().getTopicsController().onTopicCreated(j, tL_forumTopic, true);
        performSendBotTopicCreateComplete(j, tL_updateMessageID.id);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botForumTopicDidCreate, new BotForumTopicCreateNotification(j, tL_updateMessageID.id));
    }

    public static void lambda$stopStreaming$2(TLRPC.Bool bool, TLRPC.TL_error tL_error) {
    }

    public void lambda$onBotForumDraftUpdate$1(long j, int i, long j2) {
        long j3 = i;
        BotDraftMessage botDraftMessageRemove = this.botTextDraftsByRandomIds.remove(j, j3, j2);
        if (botDraftMessageRemove == null) {
            return;
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botForumDraftDelete, new BotForumTextDraftDeleteNotification(j, j3, botDraftMessageRemove.localMessageId));
    }

    private void performSendBotTopicCreate(TLRPC.InputPeer inputPeer, String str, long j, MessagesStorage.IntCallback intCallback) {
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
        tL_messages_createForumTopic.random_id = j;
        getConnectionsManager().sendRequestTyped(tL_messages_createForumTopic, new AiTonesController$$ExternalSyntheticLambda0(), new BotForumHelper$$ExternalSyntheticLambda3(this, peerDialogId, str));
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

    public boolean beforeSendingFinalRequest(TLObject tLObject, MessageObject messageObject, Runnable runnable) {
        return beforeSendingFinalRequest(tLObject, Collections.singletonList(messageObject), runnable);
    }

    public SteamingSendButtonState getStreamingSendButtonState(long j, int i) {
        LongSparseArray<BotDraftMessage> longSparseArray = this.botTextDraftsByRandomIds.get(j, i);
        if (longSparseArray == null || longSparseArray.size() <= 0) {
            return SteamingSendButtonState.NO_STREAMING;
        }
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
        return botDraftMessageValueAt.canStop ? SteamingSendButtonState.STOP : SteamingSendButtonState.BLOCKING;
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

    public boolean isStreamingTopic(long j, long j2) {
        return this.preferences.getBoolean(j + "_" + j2, false);
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

    public void onBotForumDraftUpdate(long j, int i, TLRPC.TL_sendMessageTextDraftAction tL_sendMessageTextDraftAction) {
        onBotForumDraftUpdate(j, i, tL_sendMessageTextDraftAction.random_id, tL_sendMessageTextDraftAction.text, tL_sendMessageTextDraftAction.can_stop, tL_sendMessageTextDraftAction.keep_on_stop);
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
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botForumDraftDelete, new BotForumTextDraftDeleteNotification(j3, j2, botDraftMessageValueAt.localMessageId));
                this.botTextDraftsByRandomIds.remove(j, j2, botDraftMessageValueAt.randomId);
                i2--;
                size--;
            }
            i2++;
            j3 = j;
        }
    }

    public void saveIsStreamingTopic(long j, long j2, boolean z) {
        this.preferences.edit().putBoolean(j + "_" + j2, z).apply();
    }

    public void stopStreaming(long j, long j2) {
        long j3;
        long j4;
        int i = 0;
        LongSparseArray<BotDraftMessage> longSparseArray = this.botTextDraftsByRandomIds.get(j, j2);
        if (longSparseArray == null || longSparseArray.size() <= 0) {
            return;
        }
        int size = longSparseArray.size();
        BotDraftMessage botDraftMessageValueAt = null;
        long jKeyAt = 0;
        for (int i2 = 0; i2 < size; i2++) {
            jKeyAt = longSparseArray.keyAt(i2);
            botDraftMessageValueAt = longSparseArray.valueAt(i2);
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
        if (botDraftMessage.keepOnStop) {
            botDraftMessage.removed = true;
            j3 = j;
            j4 = j2;
        } else {
            j3 = j;
            j4 = j2;
            this.botTextDraftsByRandomIds.remove(j3, j4, j5);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botForumDraftDelete, new BotForumTextDraftDeleteNotification(j3, j4, botDraftMessage.localMessageId));
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
        getConnectionsManager().sendRequestTyped(tL_messages_setTyping, new BotForumHelper$$ExternalSyntheticLambda5(i));
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

        public LongSparseArray<T> removeAll(long j, long j2) {
            LongSparseArray<LongSparseArray<T>> longSparseArray = this.map.get(j);
            if (longSparseArray == null) {
                return null;
            }
            LongSparseArray<T> longSparseArray2 = longSparseArray.get(j2);
            longSparseArray.remove(j2);
            return longSparseArray2;
        }

        public T get(long j, long j2, long j3) {
            LongSparseArray<T> longSparseArray = get(j, j2);
            if (longSparseArray == null) {
                return null;
            }
            return longSparseArray.get(j3);
        }
    }

    public boolean beforeSendingFinalRequest(final TLObject tLObject, List<MessageObject> list, final Runnable runnable) {
        TLRPC.InputPeer inputPeer;
        TLRPC.InputPeer inputPeer2;
        long j;
        long jCalcHash;
        TLRPC.InputReplyTo inputReplyTo;
        String string;
        ArrayList<TLRPC.TL_inputSingleMedia> arrayList;
        int size;
        int i;
        TLRPC.TL_inputSingleMedia tL_inputSingleMedia;
        long nextRandomId;
        if (list == null || list.isEmpty()) {
            return true;
        }
        boolean z = tLObject instanceof TLRPC.TL_messages_sendMessage;
        if (z) {
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
                for (int i2 = 0; i2 < list.size(); i2++) {
                    jArr[i2] = list.get(i2).getId();
                }
                if (z) {
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
                            int i3 = 0;
                            while (i3 < size2) {
                                Long l = arrayList2.get(i3);
                                i3++;
                                jCalcHash = MediaDataController.calcHash(jCalcHash, l.longValue());
                                peerDialogId = peerDialogId;
                            }
                        } else {
                            j = peerDialogId;
                            if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                                ArrayList<TLRPC.TL_inputSingleMedia> arrayList3 = ((TLRPC.TL_messages_sendMultiMedia) tLObject).multi_media;
                                int size3 = arrayList3.size();
                                jCalcHash = 0;
                                int i4 = 0;
                                while (i4 < size3) {
                                    TLRPC.TL_inputSingleMedia tL_inputSingleMedia2 = arrayList3.get(i4);
                                    i4++;
                                    jCalcHash = MediaDataController.calcHash(jCalcHash, tL_inputSingleMedia2.random_id);
                                }
                            } else {
                                jCalcHash = 0;
                            }
                        }
                        if (z) {
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
                        if (z) {
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
                            i = 0;
                            while (true) {
                                if (i < size) {
                                    string = null;
                                    break;
                                }
                                TLRPC.TL_inputSingleMedia tL_inputSingleMedia3 = arrayList.get(i);
                                i++;
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
                        long j2 = nextRandomId;
                        if (!TextUtils.isEmpty(string)) {
                            string = LocaleController.getString(R.string.TopicsTitleMedia);
                        } else if (string.length() > 16) {
                            string = string.substring(0, 16) + "...";
                        }
                        final long j3 = j;
                        performSendBotTopicCreate(inputPeer, string, j2, new MessagesStorage.IntCallback() {
                            @Override
                            public final void run(int i5) {
                                this.f$0.lambda$beforeSendingFinalRequest$4(tLObject, jArr, j3, runnable, i5);
                            }
                        });
                        return false;
                    }
                    jCalcHash = ((TLRPC.TL_messages_sendInlineBotResult) tLObject).random_id;
                }
                j = peerDialogId;
                if (z) {
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
                if (z) {
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
                    i = 0;
                    while (true) {
                        if (i < size) {
                            string = null;
                            break;
                        }
                        TLRPC.TL_inputSingleMedia tL_inputSingleMedia4 = arrayList.get(i);
                        i++;
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
                long j4 = nextRandomId;
                if (!TextUtils.isEmpty(string)) {
                    string = LocaleController.getString(R.string.TopicsTitleMedia);
                } else if (string.length() > 16) {
                    string = string.substring(0, 16) + "...";
                }
                final long j5 = j;
                performSendBotTopicCreate(inputPeer, string, j4, new MessagesStorage.IntCallback() {
                    @Override
                    public final void run(int i5) {
                        this.f$0.lambda$beforeSendingFinalRequest$4(tLObject, jArr, j5, runnable, i5);
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

    public void onBotForumDraftUpdate(long j, int i, TLRPC.TL_sendMessageRichMessageDraftAction tL_sendMessageRichMessageDraftAction) {
        onBotForumDraftUpdate(j, i, tL_sendMessageRichMessageDraftAction.random_id, tL_sendMessageRichMessageDraftAction.rich_message, tL_sendMessageRichMessageDraftAction.can_stop, tL_sendMessageRichMessageDraftAction.keep_on_stop);
    }

    private void onBotForumDraftUpdate(long j, int i, long j2, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z, boolean z2) {
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
                    botForumHelper.lambda$onBotForumDraftUpdate$1(j, i, j4);
                }
                i3++;
                botForumHelper = this;
            }
        }
        boolean z3 = botDraftMessage.messageObject == null;
        if (botDraftMessage.selfDestruct != null) {
            AndroidUtilities.cancelRunOnUIThread(botDraftMessage.selfDestruct);
        }
        botDraftMessage.selfDestruct = new BotForumHelper$$ExternalSyntheticLambda1(this, j, i, j2, 1);
        botDraftMessage.text = tL_textWithEntities;
        botDraftMessage.messageObject = createDraftMessage(j, i, j2, botDraftMessage.localMessageId, tL_textWithEntities);
        AndroidUtilities.runOnUIThread(botDraftMessage.selfDestruct, getAppGlobalConfig().messageTypingDraftTtl.get(TimeUnit.MILLISECONDS));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botForumDraftUpdate, new BotForumTextDraftUpdateNotification(j, j3, botDraftMessage.messageObject, z3));
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

    private void onBotForumDraftUpdate(long j, int i, long j2, TL_iv.RichMessage richMessage, boolean z, boolean z2) {
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
                    botForumHelper.lambda$onBotForumDraftUpdate$1(j, i, j4);
                }
                i3++;
                botForumHelper = this;
            }
        }
        boolean z3 = botDraftMessage.messageObject == null;
        if (botDraftMessage.selfDestruct != null) {
            AndroidUtilities.cancelRunOnUIThread(botDraftMessage.selfDestruct);
        }
        botDraftMessage.selfDestruct = new BotForumHelper$$ExternalSyntheticLambda1(this, j, i, j2, 0);
        botDraftMessage.richMessage = richMessage;
        botDraftMessage.messageObject = createDraftMessage(j, i, j2, botDraftMessage.localMessageId, richMessage);
        AndroidUtilities.runOnUIThread(botDraftMessage.selfDestruct, getAppGlobalConfig().messageTypingDraftTtl.get(TimeUnit.MILLISECONDS));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botForumDraftUpdate, new BotForumTextDraftUpdateNotification(j, j3, botDraftMessage.messageObject, z3));
    }
}
