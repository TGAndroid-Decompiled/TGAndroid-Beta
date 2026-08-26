package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.collection.LongSparseArray;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.gms.internal.mlkit_language_id_common.zziq;
import com.google.android.gms.internal.mlkit_language_id_common.zzjj;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda39;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda286;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda114;
import org.telegram.ui.MessageSeenView$$ExternalSyntheticLambda1;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda132;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda162;

public class TopicsController extends BaseController {
    public static final int LOAD_TYPE_HASH_CHECK = 3;
    public static final int LOAD_TYPE_LOAD_NEXT = 1;
    public static final int LOAD_TYPE_LOAD_UNKNOWN = 2;
    public static final int LOAD_TYPE_PRELOAD = 0;
    private static final int MAX_PRELOAD_COUNT = 20;
    public static final int TOPIC_FLAG_CLOSE = 8;
    public static final int TOPIC_FLAG_HIDE = 32;
    public static final int TOPIC_FLAG_ICON = 2;
    public static final int TOPIC_FLAG_PIN = 4;
    public static final int TOPIC_FLAG_TITLE = 1;
    public static final int TOPIC_FLAG_TOTAL_MESSAGES_COUNT = 16;
    private static final int[] countsTmp = new int[5];
    LongSparseIntArray currentOpenTopicsCounter;
    LongSparseIntArray endIsReached;
    LongSparseArray offsets;
    LongSparseIntArray openedTopicsByChatId;
    LongSparseArray topicsByChatId;
    LongSparseArray topicsByTopMsgId;
    LongSparseIntArray topicsIsLoading;
    LongSparseArray topicsMapByChatId;

    public static class TopicUpdate {
        boolean checkForDelete;
        long dialogId;
        ArrayList<MessageObject> groupedMessages;
        boolean onlyCounters;
        boolean reloadTopic;
        TLRPC.Message topMessage;
        int topMessageId;
        long topicId;
        public int totalMessagesCount = -1;
        int unreadCount;
        int unreadMentions;
    }

    public class TopicsLoadOffset {
        int lastMessageDate;
        int lastMessageId;
        long lastTopicId;

        private TopicsLoadOffset() {
        }
    }

    public TopicsController(int i) {
        super(i);
        this.topicsByChatId = new LongSparseArray();
        this.topicsMapByChatId = new LongSparseArray();
        this.topicsIsLoading = new LongSparseIntArray();
        this.endIsReached = new LongSparseIntArray();
        this.topicsByTopMsgId = new LongSparseArray();
        this.currentOpenTopicsCounter = new LongSparseIntArray();
        this.openedTopicsByChatId = new LongSparseIntArray();
        this.offsets = new LongSparseArray();
    }

    public static long calculateHashSavedDialogs(ArrayList<TLRPC.TL_forumTopic> arrayList, int i, int i2) {
        int i3;
        if (arrayList == null || arrayList.size() < (i3 = i2 + i)) {
            return 0L;
        }
        long jCalcHash = 0;
        while (i < i3) {
            TLRPC.TL_forumTopic tL_forumTopic = arrayList.get(i);
            TLRPC.Message message = tL_forumTopic.topMessage;
            if (message == null || message.id != tL_forumTopic.top_message) {
                return 0L;
            }
            jCalcHash = MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(jCalcHash, tL_forumTopic.pinned ? 1L : 0L), Math.abs(DialogObject.getPeerDialogId(tL_forumTopic.from_id))), tL_forumTopic.top_message), (message.flags & 32768) != 0 ? message.edit_date : message.date);
            i++;
        }
        return jCalcHash;
    }

    public void deleteTopic(final long j, final int i, int i2) {
        TL_forum.TL_messages_deleteTopicHistory tL_messages_deleteTopicHistory = new TL_forum.TL_messages_deleteTopicHistory();
        long j2 = -j;
        tL_messages_deleteTopicHistory.peer = getMessagesController().getInputPeer(j2);
        tL_messages_deleteTopicHistory.top_msg_id = i;
        if (i2 == 0) {
            getMessagesStorage().removeTopic(j2, i);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_deleteTopicHistory, new RequestDelegate() {
            @Override
            public void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    TopicsController.this.getMessagesController().processNewChannelDifferenceParams(tL_messages_affectedHistory.pts, tL_messages_affectedHistory.pts_count, j);
                    int i3 = tL_messages_affectedHistory.offset;
                    if (i3 > 0) {
                        TopicsController.this.deleteTopic(j, i, i3);
                    }
                }
            }
        });
    }

    public void lambda$applyPinnedOrder$17() {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_SELECT_DIALOG));
    }

    public void lambda$databaseCleared$25() {
        this.topicsByChatId.clear();
        this.topicsMapByChatId.clear();
        this.endIsReached.clear();
        SharedPreferences.Editor editorEdit = getUserConfig().getPreferences().edit();
        for (String str : getUserConfig().getPreferences().getAll().keySet()) {
            if (str.startsWith("topics_load_offset_message_id_")) {
                editorEdit.remove(str);
            }
            if (str.startsWith("topics_load_offset_date_")) {
                editorEdit.remove(str);
            }
            if (str.startsWith("topics_load_offset_topic_id_")) {
                editorEdit.remove(str);
            }
            if (str.startsWith("topics_end_reached_")) {
                editorEdit.remove(str);
            }
        }
        editorEdit.apply();
    }

    public void lambda$getTopicRepliesCount$29(TLObject tLObject, TLRPC.TL_forumTopic tL_forumTopic, long j, long j2) {
        if (tLObject != null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            tL_forumTopic.totalMessagesCount = messages_messages.count;
            getMessagesStorage().updateTopicData(j, tL_forumTopic, 16);
            if (messages_messages.count == 0 && getMessagesController().isMonoForum(j)) {
                getMessagesStorage().removeTopic(j, j2);
                onTopicsDeletedServerSide(-j, j2);
            }
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.topicsDidLoaded, Long.valueOf(-j), Boolean.TRUE);
        }
    }

    public void lambda$getTopicRepliesCount$30(TLRPC.TL_forumTopic tL_forumTopic, long j, long j2, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new MediaController$$ExternalSyntheticLambda8(this, tLObject, tL_forumTopic, j, j2, 5));
    }

    public void lambda$loadTopic$27(long j, ArrayList arrayList, long j2, Runnable runnable) {
        if (BuildVars.LOGS_ENABLED) {
            ChatObject$Call$$ExternalSyntheticOutline0.m(AacUtil.m(j, "loaded from cache ", " topics_count="), arrayList == null ? 0 : arrayList.size());
        }
        processTopics(j, arrayList, null, true, 0, -1);
        sortTopics(j);
        if (findTopic(j, j2) != null) {
            runnable.run();
            return;
        }
        ArrayList<TLRPC.TL_forumTopic> arrayList2 = new ArrayList<>();
        new TLRPC.TL_forumTopic().id = (int) j2;
        reloadTopics(j, arrayList2, runnable);
    }

    public void lambda$loadTopic$28(long j, long j2, Runnable runnable, ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new MediaController$$ExternalSyntheticLambda8(j, j2, runnable, arrayList, this));
    }

    public void lambda$loadTopics$0(long j, ArrayList arrayList, boolean z, int i) {
        if (BuildVars.LOGS_ENABLED) {
            ChatObject$Call$$ExternalSyntheticOutline0.m(AacUtil.m(j, "loaded from cache ", " topics_count="), arrayList == null ? 0 : arrayList.size());
        }
        this.topicsIsLoading.put(j, 0);
        processTopics(j, arrayList, null, z, i, -1);
        sortTopics(j);
    }

    public void lambda$loadTopics$1(long j, boolean z, int i, ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new LaunchActivity$$ExternalSyntheticLambda114(this, j, arrayList, z, i, 2));
    }

    public void lambda$loadTopics$2(TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j, LongSparseArray longSparseArray, int i) throws Throwable {
        getMessagesStorage().putUsersAndChats(tL_messages_savedDialogs.users, tL_messages_savedDialogs.chats, true, true);
        getMessagesController().putUsers(tL_messages_savedDialogs.users, false);
        getMessagesController().putChats(tL_messages_savedDialogs.chats, false);
        this.topicsIsLoading.put(j, 0);
        processTopics(j, ForumUtilities.monoForumTopicToTopic(tL_messages_savedDialogs.dialogs), longSparseArray, false, i, tL_messages_savedDialogs.dialogs.size());
        sortTopics(j);
        getMessagesStorage().saveTopics(-j, (List) this.topicsByChatId.get(j), true, true, getConnectionsManager().getCurrentTime());
        getMessagesStorage().putMessages(tL_messages_savedDialogs.messages, false, true, false, 0, false, 0, 0L);
        if (!tL_messages_savedDialogs.dialogs.isEmpty() && i == 1) {
            TLRPC.TL_monoForumDialog tL_monoForumDialog = (TLRPC.TL_monoForumDialog) zziq.m(1, tL_messages_savedDialogs.dialogs);
            TLRPC.Message message = (TLRPC.Message) longSparseArray.get(tL_monoForumDialog.top_message);
            saveLoadOffset(j, tL_monoForumDialog.top_message, message == null ? 0 : message.date, DialogObject.getPeerDialogId(tL_monoForumDialog.peer));
        } else if (getTopics(j) == null || getTopics(j).size() < tL_messages_savedDialogs.dialogs.size()) {
            clearLoadingOffset(j);
            loadTopics(j);
        }
    }

    public void lambda$loadTopics$3(TLRPC.TL_messages_savedDialogsSlice tL_messages_savedDialogsSlice, long j, LongSparseArray longSparseArray, int i) throws Throwable {
        getMessagesStorage().putUsersAndChats(tL_messages_savedDialogsSlice.users, tL_messages_savedDialogsSlice.chats, true, true);
        getMessagesController().putUsers(tL_messages_savedDialogsSlice.users, false);
        getMessagesController().putChats(tL_messages_savedDialogsSlice.chats, false);
        this.topicsIsLoading.put(j, 0);
        processTopics(j, ForumUtilities.monoForumTopicToTopic(tL_messages_savedDialogsSlice.dialogs), longSparseArray, false, i, tL_messages_savedDialogsSlice.count);
        sortTopics(j);
        getMessagesStorage().saveTopics(-j, (List) this.topicsByChatId.get(j), true, true, getConnectionsManager().getCurrentTime());
        getMessagesStorage().putMessages(tL_messages_savedDialogsSlice.messages, false, true, false, 0, false, 0, 0L);
        if (!tL_messages_savedDialogsSlice.dialogs.isEmpty() && i == 1) {
            TLRPC.TL_monoForumDialog tL_monoForumDialog = (TLRPC.TL_monoForumDialog) zziq.m(1, tL_messages_savedDialogsSlice.dialogs);
            TLRPC.Message message = (TLRPC.Message) longSparseArray.get(tL_monoForumDialog.top_message);
            saveLoadOffset(j, tL_monoForumDialog.top_message, message == null ? 0 : message.date, DialogObject.getPeerDialogId(tL_monoForumDialog.peer));
        } else if (getTopics(j) == null || getTopics(j).size() < tL_messages_savedDialogsSlice.count) {
            clearLoadingOffset(j);
            loadTopics(j);
        }
    }

    public void lambda$loadTopics$4(long j, TLRPC.TL_messages_savedDialogsNotModified tL_messages_savedDialogsNotModified) {
        this.topicsIsLoading.put(j, 0);
        ArrayList<TLRPC.TL_forumTopic> topics = getTopics(j);
        if ((topics != null ? topics.size() : 0L) >= tL_messages_savedDialogsNotModified.count) {
            this.endIsReached.put(j, 1);
            getUserConfig().getPreferences().edit().putBoolean("topics_end_reached_" + j, true).apply();
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.topicsDidLoaded, Long.valueOf(j), Boolean.FALSE);
    }

    public void lambda$loadTopics$5(TLObject tLObject, long j, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, LongSparseArray longSparseArray, int i) throws Throwable {
        TLRPC.TL_messages_forumTopics tL_messages_forumTopics2 = (TLRPC.TL_messages_forumTopics) tLObject;
        getMessagesStorage().putUsersAndChats(tL_messages_forumTopics2.users, tL_messages_forumTopics2.chats, true, true);
        getMessagesController().putUsers(tL_messages_forumTopics2.users, false);
        getMessagesController().putChats(tL_messages_forumTopics2.chats, false);
        this.topicsIsLoading.put(j, 0);
        processTopics(j, tL_messages_forumTopics.topics, longSparseArray, false, i, tL_messages_forumTopics2.count);
        sortTopics(j);
        getMessagesStorage().saveTopics(-j, (List) this.topicsByChatId.get(j), true, true, getConnectionsManager().getCurrentTime());
        getMessagesStorage().putMessages(tL_messages_forumTopics.messages, false, true, false, 0, false, 0, 0L);
        if (!tL_messages_forumTopics.topics.isEmpty() && i == 1) {
            TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) zziq.m(1, tL_messages_forumTopics.topics);
            TLRPC.Message message = (TLRPC.Message) longSparseArray.get(tL_forumTopic.top_message);
            saveLoadOffset(j, tL_forumTopic.top_message, message == null ? 0 : message.date, tL_forumTopic.id);
        } else if (getTopics(j) == null || getTopics(j).size() < tL_messages_forumTopics.count) {
            clearLoadingOffset(j);
            loadTopics(j);
        }
    }

    public void lambda$loadTopics$6(long j) {
        this.topicsIsLoading.put(j, 0);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.topicsDidLoaded, Long.valueOf(j), Boolean.FALSE);
    }

    public void lambda$loadTopics$7(long j, int i, TLObject tLObject, TLRPC.TL_error tL_error) {
        LongSparseArray longSparseArray = new LongSparseArray();
        if (tLObject instanceof TLRPC.TL_messages_savedDialogs) {
            TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject;
            for (int i2 = 0; i2 < tL_messages_savedDialogs.messages.size(); i2++) {
                longSparseArray.put(tL_messages_savedDialogs.messages.get(i2), tL_messages_savedDialogs.messages.get(i2).id);
            }
            AndroidUtilities.runOnUIThread(new BotForumHelper$$ExternalSyntheticLambda2(this, tL_messages_savedDialogs, j, longSparseArray, i, 6));
            return;
        }
        int i3 = 0;
        if (tLObject instanceof TLRPC.TL_messages_savedDialogsSlice) {
            TLRPC.TL_messages_savedDialogsSlice tL_messages_savedDialogsSlice = (TLRPC.TL_messages_savedDialogsSlice) tLObject;
            while (i3 < tL_messages_savedDialogsSlice.messages.size()) {
                longSparseArray.put(tL_messages_savedDialogsSlice.messages.get(i3), tL_messages_savedDialogsSlice.messages.get(i3).id);
                i3++;
            }
            AndroidUtilities.runOnUIThread(new BotForumHelper$$ExternalSyntheticLambda2(this, tL_messages_savedDialogsSlice, j, longSparseArray, i, 7));
            return;
        }
        if (tLObject instanceof TLRPC.TL_messages_savedDialogsNotModified) {
            AndroidUtilities.runOnUIThread(new MessagesStorage$$ExternalSyntheticLambda11(this, j, (TLRPC.TL_messages_savedDialogsNotModified) tLObject, 27));
            return;
        }
        if (!(tLObject instanceof TLRPC.TL_messages_forumTopics)) {
            AndroidUtilities.runOnUIThread(new TopicsController$$ExternalSyntheticLambda15(this, j, 0));
            return;
        }
        TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject;
        while (i3 < tL_messages_forumTopics.messages.size()) {
            longSparseArray.put(tL_messages_forumTopics.messages.get(i3), tL_messages_forumTopics.messages.get(i3).id);
            i3++;
        }
        AndroidUtilities.runOnUIThread(new MessageSeenView$$ExternalSyntheticLambda1(this, (TLRPC.TL_messages_forumTopics) tLObject, j, tL_messages_forumTopics, longSparseArray, i));
    }

    public void lambda$onTopicsDeletedServerSide$23(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < arrayList.size(); i++) {
            MessagesStorage.TopicKey topicKey = (MessagesStorage.TopicKey) arrayList.get(i);
            long j = -topicKey.dialogId;
            LongSparseArray longSparseArray = (LongSparseArray) this.topicsMapByChatId.get(j);
            if (longSparseArray != null) {
                longSparseArray.remove(topicKey.topicId);
            }
            ArrayList arrayList2 = (ArrayList) this.topicsByChatId.get(j);
            if (arrayList2 != null) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if ((getMessagesController().isMonoForum(topicKey.dialogId) ? DialogObject.getPeerDialogId(((TLRPC.TL_forumTopic) arrayList2.get(i2)).from_id) : ((TLRPC.TL_forumTopic) arrayList2.get(i2)).id) == topicKey.topicId) {
                        arrayList2.remove(i2);
                        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogDeleted, Long.valueOf(-j), Long.valueOf(topicKey.topicId));
                        hashSet.add(Long.valueOf(j));
                        break;
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            sortTopics(((Long) it.next()).longValue(), true);
        }
    }

    public void lambda$pinTopic$19(BaseFragment baseFragment) {
        AlertDialog.Builder builder = new AlertDialog.Builder(baseFragment.getContext(), 0, null);
        String string = LocaleController.getString(R.string.LimitReached);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        alertDialog.message = LocaleController.formatString(R.string.LimitReachedPinnedTopics, Integer.valueOf(MessagesController.getInstance(this.currentAccount).topicsPinnedLimit));
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        baseFragment.showDialog(alertDialog);
    }

    public void lambda$pinTopic$20(BaseFragment baseFragment, long j, ArrayList arrayList, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            if (!"PINNED_TOO_MUCH".equals(tL_error.text)) {
                if ("PINNED_TOPIC_NOT_MODIFIED".equals(tL_error.text)) {
                    reloadTopics(j, false);
                }
            } else {
                if (baseFragment == null) {
                    return;
                }
                applyPinnedOrder(j, arrayList);
                AndroidUtilities.runOnUIThread(new UserConfig$$ExternalSyntheticLambda3(13, this, baseFragment));
            }
        }
    }

    public void lambda$processTopics$8(long j) {
        loadTopics(j, false, 0);
    }

    public void lambda$processUpdate$22(List list) {
        HashSet hashSet = new HashSet();
        LongSparseArray longSparseArray = null;
        for (int i = 0; i < list.size(); i++) {
            TopicUpdate topicUpdate = (TopicUpdate) list.get(i);
            if (topicUpdate.reloadTopic) {
                if (longSparseArray == null) {
                    longSparseArray = new LongSparseArray();
                }
                ArrayList arrayList = (ArrayList) longSparseArray.get(topicUpdate.dialogId);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    longSparseArray.put(arrayList, topicUpdate.dialogId);
                }
                TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                if (ChatObject.isMonoForum(this.currentAccount, topicUpdate.dialogId)) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_forumTopic.from_id = tL_peerUser;
                    tL_peerUser.user_id = topicUpdate.topicId;
                } else {
                    tL_forumTopic.id = (int) topicUpdate.topicId;
                }
                arrayList.add(tL_forumTopic);
            } else {
                TLRPC.TL_forumTopic tL_forumTopicFindTopic = findTopic(-topicUpdate.dialogId, topicUpdate.topicId);
                if (tL_forumTopicFindTopic != null) {
                    if (topicUpdate.onlyCounters) {
                        int i2 = topicUpdate.unreadCount;
                        if (i2 >= 0) {
                            tL_forumTopicFindTopic.unread_count = i2;
                        }
                        int i3 = topicUpdate.unreadMentions;
                        if (i3 >= 0) {
                            tL_forumTopicFindTopic.unread_mentions_count = i3;
                        }
                    } else {
                        this.topicsByTopMsgId.remove(messageHash(tL_forumTopicFindTopic.top_message, -topicUpdate.dialogId));
                        tL_forumTopicFindTopic.topMessage = topicUpdate.topMessage;
                        tL_forumTopicFindTopic.groupedMessages = topicUpdate.groupedMessages;
                        int i4 = topicUpdate.topMessageId;
                        tL_forumTopicFindTopic.top_message = i4;
                        tL_forumTopicFindTopic.unread_count = topicUpdate.unreadCount;
                        tL_forumTopicFindTopic.unread_mentions_count = topicUpdate.unreadMentions;
                        this.topicsByTopMsgId.put(tL_forumTopicFindTopic, messageHash(i4, -topicUpdate.dialogId));
                    }
                    int i5 = topicUpdate.totalMessagesCount;
                    if (i5 > 0) {
                        tL_forumTopicFindTopic.totalMessagesCount = i5;
                    }
                    hashSet.add(Long.valueOf(-topicUpdate.dialogId));
                }
                if (tL_forumTopicFindTopic != null && topicUpdate.checkForDelete) {
                    tL_forumTopicFindTopic.totalMessagesCount = 0;
                    getTopicRepliesCount(topicUpdate.dialogId, topicUpdate.topicId);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            sortTopics(((Long) it.next()).longValue(), true);
        }
        if (longSparseArray != null) {
            for (int i6 = 0; i6 < longSparseArray.size(); i6++) {
                reloadTopics(-longSparseArray.keyAt(i6), (ArrayList) longSparseArray.valueAt(i6), null);
            }
        }
    }

    public void lambda$reloadTopics$13(TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j, ArrayList arrayList, LongSparseArray longSparseArray, HashSet hashSet, Runnable runnable) throws Throwable {
        int i = 0;
        getMessagesController().putUsers(tL_messages_savedDialogs.users, false);
        getMessagesController().putChats(tL_messages_savedDialogs.chats, false);
        processTopics(j, arrayList, longSparseArray, false, 2, -1);
        long j2 = -j;
        getMessagesStorage().saveTopics(j2, (List) this.topicsByChatId.get(j), true, true, getConnectionsManager().getCurrentTime());
        getMessagesStorage().putMessages(tL_messages_savedDialogs.messages, false, true, false, 0, false, 0, 0L);
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            hashSet.remove(Long.valueOf(DialogObject.getPeerDialogId(((TLRPC.TL_forumTopic) obj).from_id)));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Long) it.next()).longValue();
            getMessagesStorage().removeTopic(j2, jLongValue);
            onTopicsDeletedServerSide(j, jLongValue);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$reloadTopics$14(TLObject tLObject, long j, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, LongSparseArray longSparseArray, Runnable runnable) throws Throwable {
        TLRPC.TL_messages_forumTopics tL_messages_forumTopics2 = (TLRPC.TL_messages_forumTopics) tLObject;
        getMessagesController().putUsers(tL_messages_forumTopics2.users, false);
        getMessagesController().putChats(tL_messages_forumTopics2.chats, false);
        processTopics(j, tL_messages_forumTopics.topics, longSparseArray, false, 2, -1);
        getMessagesStorage().saveTopics(-j, (List) this.topicsByChatId.get(j), true, true, getConnectionsManager().getCurrentTime());
        getMessagesStorage().putMessages(tL_messages_forumTopics.messages, false, true, false, 0, false, 0, 0L);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$reloadTopics$15(TLObject tLObject, boolean z, long j, HashSet hashSet, Runnable runnable) {
        int i = 0;
        if (tLObject != null && z) {
            LongSparseArray longSparseArray = new LongSparseArray();
            TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject;
            ArrayList arrayListMonoForumTopicToTopic = ForumUtilities.monoForumTopicToTopic(tL_messages_savedDialogs.dialogs);
            while (i < tL_messages_savedDialogs.messages.size()) {
                longSparseArray.put(tL_messages_savedDialogs.messages.get(i), tL_messages_savedDialogs.messages.get(i).id);
                i++;
            }
            AndroidUtilities.runOnUIThread(new TopicsController$$ExternalSyntheticLambda22(this, tL_messages_savedDialogs, j, arrayListMonoForumTopicToTopic, longSparseArray, hashSet, runnable));
            return;
        }
        if (tLObject != null) {
            LongSparseArray longSparseArray2 = new LongSparseArray();
            TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject;
            while (i < tL_messages_forumTopics.messages.size()) {
                longSparseArray2.put(tL_messages_forumTopics.messages.get(i), tL_messages_forumTopics.messages.get(i).id);
                i++;
            }
            AndroidUtilities.runOnUIThread(new TopicsController$$ExternalSyntheticLambda23(this, tLObject, j, tL_messages_forumTopics, longSparseArray2, runnable));
        }
    }

    public void lambda$reloadTopics$16(boolean z, long j, HashSet hashSet, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new TopicsController$$ExternalSyntheticLambda17(this, tLObject, z, j, hashSet, runnable));
    }

    public void lambda$reloadTopics$24(long j, boolean z) {
        getUserConfig().getPreferences().edit().remove("topics_end_reached_" + j).apply();
        this.topicsByChatId.remove(j);
        this.topicsMapByChatId.remove(j);
        this.endIsReached.delete(j);
        clearLoadingOffset(j);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j));
        if (chat != null && (chat.forum || chat.monoforum)) {
            loadTopics(j, z, 0);
        }
        sortTopics(j);
    }

    public static int lambda$sortTopics$9(TLRPC.TL_forumTopic tL_forumTopic, TLRPC.TL_forumTopic tL_forumTopic2) {
        boolean z = tL_forumTopic.hidden;
        if (z != tL_forumTopic2.hidden) {
            return z ? -1 : 1;
        }
        boolean z2 = tL_forumTopic.pinned;
        boolean z3 = tL_forumTopic2.pinned;
        if (z2 != z3) {
            return z2 ? -1 : 1;
        }
        if (z2 && z3) {
            return tL_forumTopic.pinnedOrder - tL_forumTopic2.pinnedOrder;
        }
        TLRPC.Message message = tL_forumTopic2.topMessage;
        int i = message != null ? message.date : 0;
        TLRPC.Message message2 = tL_forumTopic.topMessage;
        return i - (message2 != null ? message2.date : 0);
    }

    public void lambda$toggleViewForumAsMessages$18(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public void lambda$updateMentionsUnread$21(long j, long j2, int i) {
        long j3 = -j;
        TLRPC.TL_forumTopic tL_forumTopicFindTopic = findTopic(j3, j2);
        if (tL_forumTopicFindTopic != null) {
            tL_forumTopicFindTopic.unread_mentions_count = i;
            sortTopics(j3, true);
        }
    }

    public void lambda$updateReadOutbox$26(HashMap map) {
        HashSet hashSet = new HashSet();
        for (MessagesStorage.TopicKey topicKey : map.keySet()) {
            int iIntValue = ((Integer) map.get(topicKey)).intValue();
            TLRPC.TL_forumTopic tL_forumTopicFindTopic = findTopic(-topicKey.dialogId, topicKey.topicId);
            if (tL_forumTopicFindTopic != null) {
                tL_forumTopicFindTopic.read_outbox_max_id = Math.max(tL_forumTopicFindTopic.read_outbox_max_id, iIntValue);
                hashSet.add(Long.valueOf(-topicKey.dialogId));
                TLRPC.Message message = tL_forumTopicFindTopic.topMessage;
                if (message != null && tL_forumTopicFindTopic.read_outbox_max_id >= message.id) {
                    message.unread = false;
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.topicsDidLoaded, (Long) it.next(), Boolean.TRUE);
        }
    }

    public void lambda$updateTopicsWithDeletedMessages$10(ArrayList arrayList, long j) {
        ArrayList<TLRPC.TL_forumTopic> arrayList2 = null;
        boolean z = false;
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) arrayList.get(i);
            LongSparseArray longSparseArray = (LongSparseArray) this.topicsMapByChatId.get(j);
            if (longSparseArray != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) longSparseArray.get(tL_forumTopic.id);
                if (tL_forumTopic2 != null && tL_forumTopic.top_message != -1 && tL_forumTopic.topMessage != null) {
                    this.topicsByTopMsgId.remove(messageHash(tL_forumTopic2.top_message, j));
                    TLRPC.Message message = tL_forumTopic.topMessage;
                    int i2 = message.id;
                    tL_forumTopic2.top_message = i2;
                    tL_forumTopic2.topMessage = message;
                    tL_forumTopic2.groupedMessages = tL_forumTopic.groupedMessages;
                    this.topicsByTopMsgId.put(tL_forumTopic2, messageHash(i2, j));
                    z = true;
                } else if (tL_forumTopic.top_message == -1 || tL_forumTopic.topMessage == null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    arrayList2.add(tL_forumTopic);
                }
            }
        }
        if (z) {
            sortTopics(j);
        }
        if (arrayList2 != null) {
            reloadTopics(j, arrayList2, null);
        }
    }

    public void lambda$updateTopicsWithDeletedMessages$11(long j, ArrayList arrayList, boolean z, long j2) {
        Exception exc;
        ArrayList<TLRPC.TL_forumTopic> arrayList2;
        NativeByteBuffer nativeByteBufferByteBufferValue;
        ArrayList<TLRPC.TL_forumTopic> arrayList3 = null;
        try {
            SQLiteDatabase database = getMessagesStorage().getDatabase();
            Locale locale = Locale.US;
            SQLiteCursor sQLiteCursorQueryFinalized = database.queryFinalized("SELECT topic_id, top_message FROM topics WHERE did = " + j + " AND top_message IN (" + TextUtils.join(",", arrayList) + ")", new Object[0]);
            ArrayList<TLRPC.TL_forumTopic> arrayList4 = null;
            while (sQLiteCursorQueryFinalized.next()) {
                try {
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList<>();
                    }
                    TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                    tL_forumTopic.id = sQLiteCursorQueryFinalized.intValue(0);
                    tL_forumTopic.top_message = sQLiteCursorQueryFinalized.intValue(1);
                    if (z) {
                        tL_forumTopic.from_id = getMessagesController().getPeer(tL_forumTopic.id);
                    } else {
                        tL_forumTopic.from_id = getMessagesController().getPeer(getUserConfig().getClientUserId());
                    }
                    tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                    arrayList4.add(tL_forumTopic);
                } catch (Exception e) {
                    exc = e;
                    arrayList3 = arrayList4;
                    exc.printStackTrace();
                    arrayList2 = arrayList3;
                }
            }
            sQLiteCursorQueryFinalized.dispose();
            if (arrayList4 != null) {
                for (int i = 0; i < arrayList4.size(); i++) {
                    TLRPC.TL_forumTopic tL_forumTopic2 = arrayList4.get(i);
                    SQLiteDatabase database2 = getMessagesStorage().getDatabase();
                    Locale locale2 = Locale.US;
                    SQLiteCursor sQLiteCursorQueryFinalized2 = database2.queryFinalized("SELECT mid, data FROM messages_topics WHERE uid = " + j + " AND topic_id = " + tL_forumTopic2.id + " ORDER BY mid DESC LIMIT 1", new Object[0]);
                    if (sQLiteCursorQueryFinalized2.next() && (nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized2.byteBufferValue(1)) != null) {
                        TLRPC.Message messageTLdeserialize = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                        messageTLdeserialize.readAttachPath(nativeByteBufferByteBufferValue, getUserConfig().clientUserId);
                        nativeByteBufferByteBufferValue.reuse();
                        this.topicsByTopMsgId.remove(messageHash(tL_forumTopic2.top_message, j2));
                        int i2 = messageTLdeserialize.id;
                        tL_forumTopic2.top_message = i2;
                        tL_forumTopic2.topMessage = messageTLdeserialize;
                        tL_forumTopic2.groupedMessages = null;
                        this.topicsByTopMsgId.put(tL_forumTopic2, messageHash(i2, j2));
                    }
                    sQLiteCursorQueryFinalized2.dispose();
                }
                for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                    SQLiteDatabase database3 = getMessagesStorage().getDatabase();
                    Locale locale3 = Locale.US;
                    database3.executeFast("UPDATE topics SET top_message = " + arrayList4.get(i3).top_message + " WHERE did = " + j + " AND topic_id = " + arrayList4.get(i3).id).stepThis().dispose();
                }
            }
            arrayList2 = arrayList4;
        } catch (Exception e2) {
            exc = e2;
        }
        getMessagesStorage().loadGroupedMessagesForTopics(j, arrayList2);
        if (arrayList2 != null) {
            AndroidUtilities.runOnUIThread(new MessagesStorage$$ExternalSyntheticLambda11(this, arrayList2, j2, 28));
        }
    }

    public void lambda$updateTopicsWithDeletedMessages$12(long j, ArrayList arrayList, boolean z, long j2) {
        getMessagesStorage().getStorageQueue().postRunnable(new TopicsController$$ExternalSyntheticLambda4(this, j, arrayList, z, j2, 1));
    }

    private long messageHash(int i, long j) {
        return j + (((long) i) << 12);
    }

    private void sortTopics(long j) {
        sortTopics(j, true);
    }

    public void applyPinnedOrder(long j, ArrayList<Integer> arrayList) {
        applyPinnedOrder(j, arrayList, true);
    }

    public void clearLoadingOffset(long j) {
        this.offsets.remove(j);
    }

    public void databaseCleared() {
        AndroidUtilities.runOnUIThread(new TopicsController$$ExternalSyntheticLambda1(this, 1));
    }

    public void deleteTopics(long j, ArrayList<Integer> arrayList) {
        ArrayList arrayList2 = (ArrayList) this.topicsByChatId.get(j);
        LongSparseArray longSparseArray = (LongSparseArray) this.topicsMapByChatId.get(j);
        if (longSparseArray != null && arrayList2 != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                long jIntValue = arrayList.get(i).intValue();
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) longSparseArray.get(jIntValue);
                longSparseArray.remove(jIntValue);
                if (tL_forumTopic != null) {
                    this.topicsByTopMsgId.remove(messageHash(tL_forumTopic.top_message, j));
                    arrayList2.remove(tL_forumTopic);
                }
            }
            sortTopics(j);
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            deleteTopic(j, arrayList.get(i2).intValue(), 0);
        }
    }

    public boolean endIsReached(long j) {
        return this.endIsReached.get(j, 0) == 1;
    }

    public TLRPC.TL_forumTopic findTopic(long j, long j2) {
        LongSparseArray longSparseArray = (LongSparseArray) this.topicsMapByChatId.get(j);
        if (longSparseArray == null) {
            return null;
        }
        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) longSparseArray.get(j2);
        if (tL_forumTopic != null || !getMessagesController().isMonoForum(-j)) {
            return tL_forumTopic;
        }
        int i = ForumUtilities.$r8$clinit;
        return (TLRPC.TL_forumTopic) longSparseArray.get((int) ((j2 >>> 32) ^ j2));
    }

    public ArrayList<Integer> getCurrentPinnedOrder(long j) {
        ArrayList<TLRPC.TL_forumTopic> topics = getTopics(j);
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (topics != null) {
            for (int i = 0; i < topics.size(); i++) {
                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i);
                if (tL_forumTopic != null && tL_forumTopic.pinned) {
                    arrayList.add(Integer.valueOf(tL_forumTopic.id));
                }
            }
        }
        return arrayList;
    }

    public int[] getForumUnreadCount(long j) {
        ArrayList arrayList = (ArrayList) this.topicsByChatId.get(j);
        Arrays.fill(countsTmp, 0);
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) arrayList.get(i);
                int[] iArr = countsTmp;
                iArr[0] = iArr[0] + (tL_forumTopic.unread_count > 0 ? 1 : 0);
                iArr[1] = iArr[1] + (tL_forumTopic.unread_mentions_count > 0 ? 1 : 0);
                iArr[2] = iArr[2] + (tL_forumTopic.unread_reactions_count <= 0 ? 0 : 1);
                if (!getMessagesController().isDialogMuted(-j, tL_forumTopic.id)) {
                    iArr[3] = iArr[3] + tL_forumTopic.unread_count;
                }
                iArr[4] = iArr[4] + tL_forumTopic.unread_poll_votes_count;
            }
        }
        return countsTmp;
    }

    public TopicsLoadOffset getLoadOffset(long j) {
        TopicsLoadOffset topicsLoadOffset = (TopicsLoadOffset) this.offsets.get(j);
        return topicsLoadOffset != null ? topicsLoadOffset : new TopicsLoadOffset();
    }

    public CharSequence getTopicIconName(TLRPC.Chat chat, MessageObject messageObject, TextPaint textPaint) {
        return getTopicIconName(chat, messageObject, textPaint, null);
    }

    public String getTopicName(TLRPC.Chat chat, MessageObject messageObject) {
        TLRPC.TL_forumTopic tL_forumTopicFindTopic;
        TLRPC.MessageReplyHeader messageReplyHeader = messageObject.messageOwner.reply_to;
        if (messageReplyHeader == null) {
            return null;
        }
        int i = messageReplyHeader.reply_to_top_id;
        if (i == 0) {
            i = messageReplyHeader.reply_to_msg_id;
        }
        return (i == 0 || (tL_forumTopicFindTopic = findTopic(chat.id, (long) i)) == null) ? "" : tL_forumTopicFindTopic.title;
    }

    public void getTopicRepliesCount(long j, long j2) {
        TLObject tLObject;
        TLRPC.TL_forumTopic tL_forumTopicFindTopic = findTopic(-j, j2);
        if (tL_forumTopicFindTopic == null || tL_forumTopicFindTopic.totalMessagesCount != 0) {
            return;
        }
        if (getMessagesController().isMonoForum(j)) {
            TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = new TLRPC.TL_messages_getSavedHistory();
            tL_messages_getSavedHistory.peer = getMessagesController().getInputPeer(j2);
            tL_messages_getSavedHistory.parent_peer = getMessagesController().getInputPeer(j);
            tL_messages_getSavedHistory.limit = 1;
            tLObject = tL_messages_getSavedHistory;
        } else {
            TLRPC.TL_messages_getReplies tL_messages_getReplies = new TLRPC.TL_messages_getReplies();
            tL_messages_getReplies.peer = getMessagesController().getInputPeer(j);
            tL_messages_getReplies.msg_id = (int) j2;
            tL_messages_getReplies.limit = 1;
            tLObject = tL_messages_getReplies;
        }
        getConnectionsManager().sendRequest(tLObject, new StarGiftSheet$$ExternalSyntheticLambda132(4, j, j2, this, tL_forumTopicFindTopic));
    }

    public ArrayList<TLRPC.TL_forumTopic> getTopics(long j) {
        return (ArrayList) this.topicsByChatId.get(j);
    }

    public int getTopicsCount(long j) {
        ArrayList<TLRPC.TL_forumTopic> topics;
        if (!endIsReached(j) || (topics = getTopics(j)) == null) {
            return 0;
        }
        return topics.size();
    }

    public boolean isLoading(long j) {
        return this.topicsIsLoading.get(j, 0) == 1 && (this.topicsByChatId.get(j) == null || ((ArrayList) this.topicsByChatId.get(j)).isEmpty());
    }

    public void loadTopic(final long j, final long j2, final Runnable runnable) {
        getMessagesStorage().loadTopics(-j, new Consumer() {
            @Override
            public final void s(Object obj) {
                this.f$0.lambda$loadTopic$28(j, j2, runnable, (ArrayList) obj);
            }

            public final Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public void loadTopics(long j) {
        loadTopics(j, false, 1);
    }

    public void markAllPollVotesAsRead(long j, long j2) {
        TLRPC.TL_forumTopic tL_forumTopicFindTopic = findTopic(j, j2);
        if (tL_forumTopicFindTopic == null || tL_forumTopicFindTopic.unread_poll_votes_count <= 0) {
            return;
        }
        tL_forumTopicFindTopic.unread_poll_votes_count = 0;
        sortTopics(j);
    }

    public void markAllReactionsAsRead(long j, long j2) {
        TLRPC.TL_forumTopic tL_forumTopicFindTopic = findTopic(j, j2);
        if (tL_forumTopicFindTopic == null || tL_forumTopicFindTopic.unread_reactions_count <= 0) {
            return;
        }
        tL_forumTopicFindTopic.unread_reactions_count = 0;
        sortTopics(j);
    }

    public void onTopicCreated(long j, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        long j2 = -j;
        LongSparseArray longSparseArray = (LongSparseArray) this.topicsMapByChatId.get(j2);
        if (findTopic(j2, tL_forumTopic.id) != null) {
            return;
        }
        if (longSparseArray == null) {
            longSparseArray = new LongSparseArray();
            this.topicsMapByChatId.put(longSparseArray, j2);
        }
        ArrayList arrayList = (ArrayList) this.topicsByChatId.get(j2);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.topicsByChatId.put(arrayList, j2);
        }
        longSparseArray.put(tL_forumTopic, tL_forumTopic.id);
        arrayList.add(tL_forumTopic);
        if (z) {
            getMessagesStorage().saveTopics(j, Collections.singletonList(tL_forumTopic), false, true, getConnectionsManager().getCurrentTime());
        }
        sortTopics(j2, true);
    }

    public void onTopicEdited(long j, TLRPC.TL_forumTopic tL_forumTopic) {
        getMessagesStorage().updateTopicData(j, tL_forumTopic, 35);
        sortTopics(-j);
    }

    public void onTopicFragmentPause(long j) {
        int i = this.openedTopicsByChatId.get(j, 0) - 1;
        this.openedTopicsByChatId.put(j, i >= 0 ? i : 0);
    }

    public void onTopicFragmentResume(long j) {
        this.openedTopicsByChatId.put(j, this.openedTopicsByChatId.get(j, 0) + 1);
        sortTopics(j);
    }

    public void onTopicsDeletedServerSide(long j, long j2) {
        ArrayList<MessagesStorage.TopicKey> arrayList = new ArrayList<>(1);
        arrayList.add(MessagesStorage.TopicKey.of(-j, j2));
        onTopicsDeletedServerSide(arrayList);
    }

    public void pinTopic(long j, int i, boolean z, BaseFragment baseFragment) {
        TL_forum.TL_messages_updatePinnedForumTopic tL_messages_updatePinnedForumTopic = new TL_forum.TL_messages_updatePinnedForumTopic();
        tL_messages_updatePinnedForumTopic.peer = getMessagesController().getInputPeer(-j);
        tL_messages_updatePinnedForumTopic.topic_id = i;
        tL_messages_updatePinnedForumTopic.pinned = z;
        ArrayList<Integer> currentPinnedOrder = getCurrentPinnedOrder(j);
        ArrayList<Integer> arrayList = new ArrayList<>(currentPinnedOrder);
        arrayList.remove(Integer.valueOf(i));
        if (z) {
            arrayList.add(0, Integer.valueOf(i));
        }
        applyPinnedOrder(j, arrayList);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_updatePinnedForumTopic, new StarGiftSheet$$ExternalSyntheticLambda162(this, baseFragment, j, currentPinnedOrder, 4));
    }

    public void preloadTopics(long j) {
        loadTopics(j, true, 0);
    }

    public void processEditedMessage(TLRPC.Message message) {
        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.topicsByTopMsgId.get(messageHash(message.id, -message.dialog_id));
        if (tL_forumTopic != null) {
            tL_forumTopic.topMessage = message;
            sortTopics(-message.dialog_id, true);
        }
    }

    public void processEditedMessages(LongSparseArray longSparseArray) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < longSparseArray.size(); i++) {
            ArrayList arrayList = (ArrayList) longSparseArray.valueAt(i);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.topicsByTopMsgId.get(messageHash(((MessageObject) arrayList.get(i2)).getId(), -((MessageObject) arrayList.get(i2)).getDialogId()));
                if (tL_forumTopic != null) {
                    tL_forumTopic.topMessage = ((MessageObject) arrayList.get(i2)).messageOwner;
                    hashSet.add(Long.valueOf(-((MessageObject) arrayList.get(i2)).getDialogId()));
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            sortTopics(((Long) it.next()).longValue(), true);
        }
    }

    public void processTopics(long j, ArrayList<TLRPC.TL_forumTopic> arrayList, LongSparseArray longSparseArray, boolean z, int i, int i2) {
        ArrayList<Long> arrayList2;
        ArrayList<TLRPC.TL_forumTopic> arrayList3;
        boolean z2;
        LongSparseArray longSparseArray2;
        ?? r3;
        LongSparseArray longSparseArray3;
        int i3;
        TLRPC.TL_forumTopic tL_forumTopic;
        ArrayList<TLRPC.TL_forumTopic> arrayList4 = arrayList;
        if (i == 3 && getMessagesController().isMonoForum(-j)) {
            getUserConfig().getPreferences().edit().remove("topics_end_reached_" + j).apply();
            this.topicsByChatId.remove(j);
            this.topicsMapByChatId.remove(j);
            this.endIsReached.delete(j);
            clearLoadingOffset(j);
        }
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb = new StringBuilder("processTopics=new_topics_size=");
            sb.append(arrayList4 == null ? 0 : arrayList4.size());
            sb.append(" fromCache=");
            sb.append(z);
            sb.append(" load_type=");
            sb.append(i);
            sb.append(" totalCount=");
            sb.append(i2);
            FileLog.d(sb.toString());
        }
        ArrayList arrayList5 = (ArrayList) this.topicsByChatId.get(j);
        LongSparseArray longSparseArray4 = (LongSparseArray) this.topicsMapByChatId.get(j);
        if (arrayList5 == null) {
            arrayList5 = new ArrayList();
            this.topicsByChatId.put(arrayList5, j);
        }
        if (longSparseArray4 == null) {
            longSparseArray4 = new LongSparseArray();
            this.topicsMapByChatId.put(longSparseArray4, j);
        }
        if (arrayList4 != null) {
            int i4 = 0;
            ArrayList<Long> arrayList6 = null;
            ArrayList<TLRPC.TL_forumTopic> arrayList7 = null;
            z2 = false;
            while (i4 < arrayList4.size()) {
                TLRPC.TL_forumTopic tL_forumTopic2 = arrayList4.get(i4);
                if (tL_forumTopic2 instanceof TLRPC.TL_forumTopicDeleted) {
                    if (arrayList6 == null) {
                        arrayList6 = new ArrayList<>();
                    }
                    ArrayList<Long> arrayList8 = arrayList6;
                    i3 = i4;
                    arrayList8.add(Long.valueOf(tL_forumTopic2.id));
                    arrayList6 = arrayList8;
                } else {
                    i3 = i4;
                    if (!longSparseArray4.containsKey(tL_forumTopic2.id)) {
                        if (longSparseArray != 0) {
                            tL_forumTopic2.topMessage = (TLRPC.Message) longSparseArray.get(tL_forumTopic2.top_message);
                            tL_forumTopic2.topicStartMessage = (TLRPC.Message) longSparseArray.get(tL_forumTopic2.id);
                        }
                        if (tL_forumTopic2.topMessage == null && !tL_forumTopic2.isShort) {
                            if (arrayList7 == null) {
                                arrayList7 = new ArrayList<>();
                            }
                            ArrayList<TLRPC.TL_forumTopic> arrayList9 = arrayList7;
                            arrayList9.add(tL_forumTopic2);
                            arrayList7 = arrayList9;
                        }
                        if (tL_forumTopic2.topicStartMessage == null) {
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_forumTopic2.topicStartMessage = tL_message;
                            tL_message.message = "";
                            tL_message.id = tL_forumTopic2.id;
                            tL_message.peer_id = getMessagesController().getPeer(-j);
                            tL_forumTopic2.topicStartMessage.action = new TLRPC.TL_messageActionTopicCreate();
                            tL_forumTopic2.topicStartMessage.action.title = tL_forumTopic2.title;
                        }
                        arrayList5.add(tL_forumTopic2);
                        longSparseArray4.put(tL_forumTopic2, tL_forumTopic2.id);
                        this.topicsByTopMsgId.put(tL_forumTopic2, messageHash(tL_forumTopic2.top_message, j));
                    } else if (!tL_forumTopic2.isShort && (tL_forumTopic = (TLRPC.TL_forumTopic) longSparseArray4.get(tL_forumTopic2.id)) != null) {
                        boolean z3 = tL_forumTopic.closed;
                        boolean z4 = tL_forumTopic2.closed;
                        if (z3 != z4) {
                            tL_forumTopic.closed = z4;
                            getMessagesStorage().updateTopicData(-j, tL_forumTopic2, 8);
                        }
                    }
                    z2 = true;
                }
                i4 = i3 + 1;
                arrayList4 = arrayList;
            }
            arrayList2 = arrayList6;
            arrayList3 = arrayList7;
        } else {
            arrayList2 = null;
            arrayList3 = null;
            z2 = false;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < arrayList5.size(); i6++) {
            TLRPC.TL_forumTopic tL_forumTopic3 = (TLRPC.TL_forumTopic) arrayList5.get(i6);
            if (tL_forumTopic3 != null && tL_forumTopic3.pinned) {
                int i7 = i5 + 1;
                if (tL_forumTopic3.pinnedOrder != i5) {
                    tL_forumTopic3.pinnedOrder = i5;
                    i5 = i7;
                    z2 = true;
                } else {
                    i5 = i7;
                }
            }
        }
        if (arrayList2 == null || i != 2) {
            longSparseArray2 = longSparseArray4;
        } else {
            int i8 = 0;
            while (i8 < arrayList2.size()) {
                int i9 = 0;
                while (true) {
                    if (i9 >= arrayList5.size()) {
                        longSparseArray3 = longSparseArray4;
                        break;
                    }
                    longSparseArray3 = longSparseArray4;
                    if (((TLRPC.TL_forumTopic) arrayList5.get(i9)).id == arrayList2.get(i8).longValue()) {
                        arrayList5.remove(i9);
                        break;
                    } else {
                        i9++;
                        longSparseArray4 = longSparseArray3;
                    }
                }
                i8++;
                longSparseArray4 = longSparseArray3;
            }
            longSparseArray2 = longSparseArray4;
            getMessagesStorage().removeTopics(j, arrayList2);
        }
        if (arrayList3 == null || i == 2) {
            if (i != 0 || z) {
                r3 = 1;
                r3 = 1;
                if (i == 1 || i == 3) {
                }
            } else {
                r3 = 1;
            }
            if (arrayList5.size() >= i2 && i2 >= 0 && !endIsReached(j)) {
                this.endIsReached.put(j, r3);
                getUserConfig().getPreferences().edit().putBoolean("topics_end_reached_" + j, r3).apply();
                z2 = true;
            }
        } else {
            reloadTopics(j, arrayList3, null);
        }
        if (longSparseArray2.size() > arrayList5.size()) {
            FileLog.e("[TopicsController]: cache desynchronization");
            HashSet hashSet = new HashSet(longSparseArray2.size());
            for (int i10 = 0; i10 < longSparseArray2.size(); i10++) {
                hashSet.add(Long.valueOf(longSparseArray2.keyAt(i10)));
            }
            int size = arrayList5.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList5.get(i11);
                i11++;
                TLRPC.TL_forumTopic tL_forumTopic4 = (TLRPC.TL_forumTopic) obj;
                if (tL_forumTopic4 != null) {
                    hashSet.remove(Long.valueOf(tL_forumTopic4.id));
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                longSparseArray2.remove(((Long) it.next()).longValue());
            }
            z2 = true;
        }
        if (z2) {
            sortTopics(j, false);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.topicsDidLoaded, Long.valueOf(j), Boolean.TRUE);
        if ((i == 0 || (i == 0 && !z)) && z && ((ArrayList) this.topicsByChatId.get(j)).isEmpty()) {
            AndroidUtilities.runOnUIThread(new TopicsController$$ExternalSyntheticLambda15(this, j, 1));
        }
    }

    public void processUpdate(List<TopicUpdate> list) {
        AndroidUtilities.runOnUIThread(new UserConfig$$ExternalSyntheticLambda3(12, this, list));
    }

    public void reloadTopics(long j, ArrayList<TLRPC.TL_forumTopic> arrayList, Runnable runnable) {
        TLObject tLObject;
        long j2 = -j;
        boolean zIsMonoForum = getMessagesController().isMonoForum(j2);
        HashSet hashSet = new HashSet();
        int iM = 0;
        if (zIsMonoForum) {
            TLRPC.TL_messages_getSavedDialogsByID tL_messages_getSavedDialogsByID = new TLRPC.TL_messages_getSavedDialogsByID();
            while (iM < arrayList.size()) {
                long peerDialogId = DialogObject.getPeerDialogId(arrayList.get(iM).from_id);
                hashSet.add(Long.valueOf(peerDialogId));
                tL_messages_getSavedDialogsByID.ids.add(getMessagesController().getInputPeer(peerDialogId));
                iM++;
            }
            tL_messages_getSavedDialogsByID.parent_peer = getMessagesController().getInputPeer(j2);
            tLObject = tL_messages_getSavedDialogsByID;
        } else {
            TL_forum.TL_messages_getForumTopicsByID tL_messages_getForumTopicsByID = new TL_forum.TL_messages_getForumTopicsByID();
            while (iM < arrayList.size()) {
                iM = LocationController$$ExternalSyntheticOutline0.m(arrayList.get(iM).id, iM, 1, tL_messages_getForumTopicsByID.topics);
            }
            tL_messages_getForumTopicsByID.peer = getMessagesController().getInputPeer(j2);
            tLObject = tL_messages_getForumTopicsByID;
        }
        getConnectionsManager().sendRequest(tLObject, new TopicsController$$ExternalSyntheticLambda7(this, zIsMonoForum, j, hashSet, runnable));
    }

    public void reorderPinnedTopics(long j, ArrayList<Integer> arrayList) {
        TL_forum.TL_messages_reorderPinnedForumTopics tL_messages_reorderPinnedForumTopics = new TL_forum.TL_messages_reorderPinnedForumTopics();
        tL_messages_reorderPinnedForumTopics.peer = getMessagesController().getInputPeer(-j);
        if (arrayList != null) {
            tL_messages_reorderPinnedForumTopics.order.addAll(arrayList);
        }
        tL_messages_reorderPinnedForumTopics.force = true;
        applyPinnedOrder(j, arrayList, false);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reorderPinnedForumTopics, null);
    }

    public void saveLoadOffset(long j, int i, int i2, long j2) {
        TopicsLoadOffset topicsLoadOffset = new TopicsLoadOffset();
        topicsLoadOffset.lastMessageId = i;
        topicsLoadOffset.lastMessageDate = i2;
        topicsLoadOffset.lastTopicId = j2;
        this.offsets.put(topicsLoadOffset, j);
    }

    public void saveTopics(long j) {
        if (((ArrayList) this.topicsByChatId.get(j)) != null) {
            getMessagesStorage().saveTopics(-j, (List) this.topicsByChatId.get(j), true, true, getConnectionsManager().getCurrentTime());
        }
    }

    public void toggleCloseTopic(long j, int i, boolean z) {
        TLRPC.TL_forumTopic tL_forumTopic;
        TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
        long j2 = -j;
        tL_messages_editForumTopic.peer = getMessagesController().getInputPeer(j2);
        tL_messages_editForumTopic.topic_id = i;
        tL_messages_editForumTopic.flags |= 4;
        tL_messages_editForumTopic.closed = z;
        LongSparseArray longSparseArray = (LongSparseArray) this.topicsMapByChatId.get(j);
        if (longSparseArray != null && (tL_forumTopic = (TLRPC.TL_forumTopic) longSparseArray.get(i)) != null) {
            tL_forumTopic.closed = z;
            getMessagesStorage().updateTopicData(j2, tL_forumTopic, 8);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_editForumTopic, new RequestDelegate() {
            @Override
            public void run(TLObject tLObject, TLRPC.TL_error tL_error) {
            }
        });
    }

    public void toggleShowTopic(long j, int i, boolean z) {
        TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
        long j2 = -j;
        tL_messages_editForumTopic.peer = getMessagesController().getInputPeer(j2);
        tL_messages_editForumTopic.topic_id = i;
        tL_messages_editForumTopic.flags = 8;
        tL_messages_editForumTopic.hidden = !z;
        TLRPC.TL_forumTopic tL_forumTopicFindTopic = findTopic(j, i);
        if (tL_forumTopicFindTopic != null) {
            boolean z2 = tL_messages_editForumTopic.hidden;
            tL_forumTopicFindTopic.hidden = z2;
            if (z2) {
                tL_forumTopicFindTopic.closed = true;
            }
            updateTopicInUi(j2, tL_forumTopicFindTopic, 44);
            getMessagesStorage().updateTopicData(j2, tL_forumTopicFindTopic, 44);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_editForumTopic, null);
    }

    public void toggleViewForumAsMessages(long j, boolean z) {
        TLRPC.TL_channels_toggleViewForumAsMessages tL_channels_toggleViewForumAsMessages = new TLRPC.TL_channels_toggleViewForumAsMessages();
        tL_channels_toggleViewForumAsMessages.channel_id = getMessagesController().getInputChannel(j);
        tL_channels_toggleViewForumAsMessages.enabled = z;
        getConnectionsManager().sendRequest(tL_channels_toggleViewForumAsMessages, new UserConfig$$ExternalSyntheticLambda0(this, 10));
    }

    public void updateMaxReadId(long j, long j2, int i, int i2, int i3) {
        TLRPC.TL_forumTopic tL_forumTopicFindTopic = findTopic(j, j2);
        if (tL_forumTopicFindTopic != null) {
            tL_forumTopicFindTopic.read_inbox_max_id = i;
            tL_forumTopicFindTopic.unread_count = i2;
            if (i3 >= 0) {
                tL_forumTopicFindTopic.unread_mentions_count = i3;
            }
            sortTopics(j);
        }
    }

    public void updateMentionsUnread(long j, long j2, int i) {
        AndroidUtilities.runOnUIThread(new TopicsController$$ExternalSyntheticLambda2(this, j, j2, i, 0));
    }

    public int updatePollVotesUnread(long j, long j2, int i, boolean z) {
        long j3 = -j;
        TLRPC.TL_forumTopic tL_forumTopicFindTopic = findTopic(j3, j2);
        if (tL_forumTopicFindTopic == null) {
            return -1;
        }
        if (z) {
            int i2 = tL_forumTopicFindTopic.unread_poll_votes_count + i;
            tL_forumTopicFindTopic.unread_poll_votes_count = i2;
            if (i2 < 0) {
                tL_forumTopicFindTopic.unread_poll_votes_count = 0;
            }
        } else {
            tL_forumTopicFindTopic.unread_poll_votes_count = i;
        }
        int i3 = tL_forumTopicFindTopic.unread_poll_votes_count;
        sortTopics(j3, true);
        return i3;
    }

    public int updateReactionsUnread(long j, long j2, int i, boolean z) {
        long j3 = -j;
        TLRPC.TL_forumTopic tL_forumTopicFindTopic = findTopic(j3, j2);
        if (tL_forumTopicFindTopic == null) {
            return -1;
        }
        if (z) {
            int i2 = tL_forumTopicFindTopic.unread_reactions_count + i;
            tL_forumTopicFindTopic.unread_reactions_count = i2;
            if (i2 < 0) {
                tL_forumTopicFindTopic.unread_reactions_count = 0;
            }
        } else {
            tL_forumTopicFindTopic.unread_reactions_count = i;
        }
        int i3 = tL_forumTopicFindTopic.unread_reactions_count;
        sortTopics(j3, true);
        return i3;
    }

    public void updateReadOutbox(HashMap<MessagesStorage.TopicKey, Integer> map) {
        AndroidUtilities.runOnUIThread(new UserConfig$$ExternalSyntheticLambda3(15, this, map));
    }

    public void updateTopicInUi(long j, TLRPC.TL_forumTopic tL_forumTopic, int i) {
        long j2 = -j;
        TLRPC.TL_forumTopic tL_forumTopicFindTopic = findTopic(j2, tL_forumTopic.id);
        if (tL_forumTopicFindTopic != null) {
            if ((i & 1) != 0) {
                tL_forumTopicFindTopic.title = tL_forumTopic.title;
            }
            if ((i & 2) != 0) {
                tL_forumTopicFindTopic.icon_emoji_id = tL_forumTopic.icon_emoji_id;
            }
            if ((i & 8) != 0) {
                tL_forumTopicFindTopic.closed = tL_forumTopic.closed;
            }
            if ((i & 4) != 0) {
                tL_forumTopicFindTopic.pinned = tL_forumTopic.pinned;
            }
            if ((i & 32) != 0) {
                tL_forumTopicFindTopic.hidden = tL_forumTopic.hidden;
            }
            sortTopics(j2);
        }
    }

    public void updateTopicsWithDeletedMessages(long j, ArrayList<Integer> arrayList) {
        if (j > 0) {
            return;
        }
        long j2 = -j;
        AndroidUtilities.runOnUIThread(new TopicsController$$ExternalSyntheticLambda4(this, j, arrayList, ChatObject.isMonoForum(getMessagesController().getChat(Long.valueOf(j2))), j2, 0));
    }

    public void applyPinnedOrder(long j, ArrayList<Integer> arrayList, boolean z) {
        if (arrayList == null) {
            return;
        }
        ArrayList<TLRPC.TL_forumTopic> topics = getTopics(j);
        boolean z2 = true;
        if (topics != null) {
            boolean z3 = false;
            for (int i = 0; i < topics.size(); i++) {
                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i);
                if (tL_forumTopic != null) {
                    int iIndexOf = arrayList.indexOf(Integer.valueOf(tL_forumTopic.id));
                    boolean z4 = iIndexOf >= 0;
                    if (tL_forumTopic.pinned != z4 || (z4 && tL_forumTopic.pinnedOrder != iIndexOf)) {
                        tL_forumTopic.pinned = z4;
                        tL_forumTopic.pinnedOrder = iIndexOf;
                        getMessagesStorage().updateTopicData(j, tL_forumTopic, 4);
                        z3 = true;
                    }
                }
            }
            z2 = z3;
        }
        if (z && z2) {
            AndroidUtilities.runOnUIThread(new TopicsController$$ExternalSyntheticLambda1(this, 0));
        }
    }

    public CharSequence getTopicIconName(TLRPC.Chat chat, MessageObject messageObject, TextPaint textPaint, Drawable[] drawableArr) {
        TLRPC.TL_forumTopic tL_forumTopicFindTopic;
        TLRPC.MessageReplyHeader messageReplyHeader = messageObject.messageOwner.reply_to;
        if (messageReplyHeader == null) {
            return null;
        }
        int i = messageReplyHeader.reply_to_top_id;
        if (i == 0) {
            i = messageReplyHeader.reply_to_msg_id;
        }
        if (i == 0 || (tL_forumTopicFindTopic = findTopic(chat.id, i)) == null) {
            return null;
        }
        return ForumUtilities.getTopicSpannedName(tL_forumTopicFindTopic, textPaint, drawableArr);
    }

    public void loadTopics(final long j, final boolean z, final int i) {
        ?? tL_messages_getForumTopics;
        long j2;
        if (this.topicsIsLoading.get(j, 0) != 0) {
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("load topics " + j + " fromCache=" + z + " loadType=" + i);
        }
        this.topicsIsLoading.put(j, 1);
        if (z) {
            getMessagesStorage().loadTopics(-j, new Consumer() {
                @Override
                public final void s(Object obj) {
                    this.f$0.lambda$loadTopics$1(j, z, i, (ArrayList) obj);
                }

                public final Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return;
        }
        long j3 = -j;
        if (getMessagesController().isMonoForum(j3)) {
            tL_messages_getForumTopics = new TLRPC.TL_messages_getSavedDialogs();
            tL_messages_getForumTopics.parent_peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j3);
            tL_messages_getForumTopics.flags |= 2;
            TopicsLoadOffset loadOffset = getLoadOffset(j);
            if (i == 0 || i == 3) {
                j2 = 0;
            } else {
                if (i != 1) {
                    j2 = 0;
                    if (loadOffset.lastTopicId == 0) {
                    }
                }
                if (i == 1) {
                    tL_messages_getForumTopics.limit = 100;
                    tL_messages_getForumTopics.offset_date = loadOffset.lastMessageDate;
                    tL_messages_getForumTopics.offset_id = loadOffset.lastMessageId;
                    tL_messages_getForumTopics.offset_peer = MessagesController.getInstance(this.currentAccount).getInputPeer(loadOffset.lastTopicId);
                    if (BuildVars.LOGS_ENABLED) {
                        StringBuilder sb = new StringBuilder("offset_date=");
                        sb.append(loadOffset.lastMessageDate);
                        sb.append(" offset_id=");
                        sb.append(loadOffset.lastMessageId);
                        sb.append(" offset_topic=");
                        zzjj.m(sb, loadOffset.lastTopicId);
                    }
                }
            }
            ArrayList<TLRPC.TL_forumTopic> topics = getTopics(j);
            tL_messages_getForumTopics.limit = 20;
            tL_messages_getForumTopics.offset_id = Integer.MAX_VALUE;
            tL_messages_getForumTopics.offset_date = 0;
            tL_messages_getForumTopics.offset_peer = new TLRPC.TL_inputPeerEmpty();
            tL_messages_getForumTopics.hash = topics != null ? calculateHashSavedDialogs(topics, 0, Math.min(topics.size(), 20)) : j2;
        } else {
            tL_messages_getForumTopics = new TL_forum.TL_messages_getForumTopics();
            tL_messages_getForumTopics.peer = getMessagesController().getInputPeer(j3);
            if (i == 0) {
                tL_messages_getForumTopics.limit = 20;
            } else if (i == 1) {
                tL_messages_getForumTopics.limit = 100;
                TopicsLoadOffset loadOffset2 = getLoadOffset(j);
                tL_messages_getForumTopics.offset_date = loadOffset2.lastMessageDate;
                tL_messages_getForumTopics.offset_id = loadOffset2.lastMessageId;
                tL_messages_getForumTopics.offset_topic = (int) loadOffset2.lastTopicId;
                if (BuildVars.LOGS_ENABLED) {
                    StringBuilder sb2 = new StringBuilder("offset_date=");
                    sb2.append(loadOffset2.lastMessageDate);
                    sb2.append(" offset_id=");
                    sb2.append(loadOffset2.lastMessageId);
                    sb2.append(" offset_topic=");
                    zzjj.m(sb2, loadOffset2.lastTopicId);
                }
            }
        }
        getConnectionsManager().sendRequest(tL_messages_getForumTopics, new ArticleViewer$$ExternalSyntheticLambda39(this, j, i, 2));
    }

    public void sortTopics(long j, boolean z) {
        ArrayList arrayList = (ArrayList) this.topicsByChatId.get(j);
        if (arrayList != null) {
            if (this.openedTopicsByChatId.get(j, 0) > 0) {
                Collections.sort(arrayList, new SharedConfig$$ExternalSyntheticLambda3(4));
            }
            if (z) {
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.topicsDidLoaded, Long.valueOf(j), Boolean.TRUE);
            }
        }
    }

    public void onTopicsDeletedServerSide(ArrayList<MessagesStorage.TopicKey> arrayList) {
        AndroidUtilities.runOnUIThread(new UserConfig$$ExternalSyntheticLambda3(14, this, arrayList));
    }

    public void markAllPollVotesAsRead(long j) {
        ArrayList<TLRPC.TL_forumTopic> topics = getTopics(j);
        if (topics != null) {
            for (int i = 0; i < topics.size(); i++) {
                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i);
                if (tL_forumTopic != null) {
                    tL_forumTopic.unread_poll_votes_count = 0;
                }
            }
            sortTopics(j);
        }
    }

    public void markAllReactionsAsRead(long j) {
        ArrayList<TLRPC.TL_forumTopic> topics = getTopics(j);
        if (topics != null) {
            for (int i = 0; i < topics.size(); i++) {
                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i);
                if (tL_forumTopic != null) {
                    tL_forumTopic.unread_reactions_count = 0;
                }
            }
            sortTopics(j);
        }
    }

    public void reloadTopics(long j) {
        reloadTopics(j, true);
    }

    public void reloadTopics(long j, boolean z) {
        AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda286(this, j, z, 3));
    }
}
