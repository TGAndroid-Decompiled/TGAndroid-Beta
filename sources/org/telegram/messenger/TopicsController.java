package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
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
    a0.i offsets;
    LongSparseIntArray openedTopicsByChatId;
    a0.i topicsByChatId;
    a0.i topicsByTopMsgId;
    LongSparseIntArray topicsIsLoading;
    a0.i topicsMapByChatId;

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
            TopicsController.this = r1;
        }
    }

    public TopicsController(int i10) {
        super(i10);
        this.topicsByChatId = new a0.i();
        this.topicsMapByChatId = new a0.i();
        this.topicsIsLoading = new LongSparseIntArray();
        this.endIsReached = new LongSparseIntArray();
        this.topicsByTopMsgId = new a0.i();
        this.currentOpenTopicsCounter = new LongSparseIntArray();
        this.openedTopicsByChatId = new LongSparseIntArray();
        this.offsets = new a0.i();
    }

    public static long calculateHashSavedDialogs(ArrayList<TLRPC.TL_forumTopic> arrayList, int i10, int i11) {
        int i12;
        int i13;
        long j3;
        if (arrayList == null || arrayList.size() < (i12 = i11 + i10)) {
            return 0L;
        }
        long j10 = 0;
        while (i10 < i12) {
            TLRPC.TL_forumTopic tL_forumTopic = arrayList.get(i10);
            TLRPC.Message message = tL_forumTopic.topMessage;
            if (message == null || message.f19917id != tL_forumTopic.top_message) {
                return 0L;
            }
            if ((message.flags & 32768) != 0) {
                i13 = message.edit_date;
            } else {
                i13 = message.date;
            }
            long j11 = i13;
            if (tL_forumTopic.pinned) {
                j3 = 1;
            } else {
                j3 = 0;
            }
            j10 = MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(j10, j3), Math.abs(DialogObject.getPeerDialogId(tL_forumTopic.from_id))), tL_forumTopic.top_message), j11);
            i10++;
        }
        return j10;
    }

    public void deleteTopic(final long j3, final int i10, int i11) {
        TL_forum.TL_messages_deleteTopicHistory tL_messages_deleteTopicHistory = new TL_forum.TL_messages_deleteTopicHistory();
        long j10 = -j3;
        tL_messages_deleteTopicHistory.peer = getMessagesController().getInputPeer(j10);
        tL_messages_deleteTopicHistory.top_msg_id = i10;
        if (i11 == 0) {
            getMessagesStorage().removeTopic(j10, i10);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_deleteTopicHistory, new RequestDelegate() {
            {
                TopicsController.this = this;
            }

            @Override
            public void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    TopicsController.this.getMessagesController().processNewChannelDifferenceParams(tL_messages_affectedHistory.pts, tL_messages_affectedHistory.pts_count, j3);
                    int i12 = tL_messages_affectedHistory.offset;
                    if (i12 > 0) {
                        TopicsController.this.deleteTopic(j3, i10, i12);
                    }
                }
            }
        });
    }

    public void lambda$applyPinnedOrder$17() {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_SELECT_DIALOG));
    }

    public void lambda$databaseCleared$25() {
        this.topicsByChatId.b();
        this.topicsMapByChatId.b();
        this.endIsReached.clear();
        SharedPreferences.Editor edit = getUserConfig().getPreferences().edit();
        for (String str : getUserConfig().getPreferences().getAll().keySet()) {
            if (str.startsWith("topics_load_offset_message_id_")) {
                edit.remove(str);
            }
            if (str.startsWith("topics_load_offset_date_")) {
                edit.remove(str);
            }
            if (str.startsWith("topics_load_offset_topic_id_")) {
                edit.remove(str);
            }
            if (str.startsWith("topics_end_reached_")) {
                edit.remove(str);
            }
        }
        edit.apply();
    }

    public void lambda$getTopicRepliesCount$29(TLObject tLObject, TLRPC.TL_forumTopic tL_forumTopic, long j3, long j10) {
        if (tLObject != null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            tL_forumTopic.totalMessagesCount = messages_messages.count;
            getMessagesStorage().updateTopicData(j3, tL_forumTopic, 16);
            if (messages_messages.count == 0 && getMessagesController().isMonoForum(j3)) {
                getMessagesStorage().removeTopic(j3, j10);
                onTopicsDeletedServerSide(-j3, j10);
            }
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.topicsDidLoaded, Long.valueOf(-j3), Boolean.TRUE);
        }
    }

    public void lambda$getTopicRepliesCount$30(TLRPC.TL_forumTopic tL_forumTopic, long j3, long j10, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new t2(this, tLObject, tL_forumTopic, j3, j10, 5));
    }

    public void lambda$loadTopic$27(long j3, ArrayList arrayList, long j10, Runnable runnable) {
        int size;
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder t10 = a4.a.t(j3, "loaded from cache ", " topics_count=");
            if (arrayList == null) {
                size = 0;
            } else {
                size = arrayList.size();
            }
            i2.g.o(size, t10);
        }
        processTopics(j3, arrayList, null, true, 0, -1);
        sortTopics(j3);
        if (findTopic(j3, j10) != null) {
            runnable.run();
            return;
        }
        ArrayList<TLRPC.TL_forumTopic> arrayList2 = new ArrayList<>();
        new TLRPC.TL_forumTopic().f19948id = (int) j10;
        reloadTopics(j3, arrayList2, runnable);
    }

    public void lambda$loadTopic$28(long j3, long j10, Runnable runnable, ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new t2(j3, j10, runnable, arrayList, this));
    }

    public void lambda$loadTopics$0(long j3, ArrayList arrayList, boolean z10, int i10) {
        int size;
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder t10 = a4.a.t(j3, "loaded from cache ", " topics_count=");
            if (arrayList == null) {
                size = 0;
            } else {
                size = arrayList.size();
            }
            i2.g.o(size, t10);
        }
        this.topicsIsLoading.put(j3, 0);
        processTopics(j3, arrayList, null, z10, i10, -1);
        sortTopics(j3);
    }

    public void lambda$loadTopics$1(long j3, boolean z10, int i10, ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new gg(this, j3, arrayList, z10, i10, 1));
    }

    public void lambda$loadTopics$2(TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j3, a0.i iVar, int i10) {
        int i11;
        getMessagesStorage().putUsersAndChats(tL_messages_savedDialogs.users, tL_messages_savedDialogs.chats, true, true);
        getMessagesController().putUsers(tL_messages_savedDialogs.users, false);
        getMessagesController().putChats(tL_messages_savedDialogs.chats, false);
        this.topicsIsLoading.put(j3, 0);
        processTopics(j3, og.d.l(tL_messages_savedDialogs.dialogs), iVar, false, i10, tL_messages_savedDialogs.dialogs.size());
        sortTopics(j3);
        getMessagesStorage().saveTopics(-j3, (List) this.topicsByChatId.f(j3), true, true, getConnectionsManager().getCurrentTime());
        getMessagesStorage().putMessages(tL_messages_savedDialogs.messages, false, true, false, 0, false, 0, 0L);
        if (!tL_messages_savedDialogs.dialogs.isEmpty() && i10 == 1) {
            TLRPC.TL_monoForumDialog tL_monoForumDialog = (TLRPC.TL_monoForumDialog) i2.g.h(1, tL_messages_savedDialogs.dialogs);
            TLRPC.Message message = (TLRPC.Message) iVar.f(tL_monoForumDialog.top_message);
            int i12 = tL_monoForumDialog.top_message;
            if (message == null) {
                i11 = 0;
            } else {
                i11 = message.date;
            }
            saveLoadOffset(j3, i12, i11, DialogObject.getPeerDialogId(tL_monoForumDialog.peer));
        } else if (getTopics(j3) != null && getTopics(j3).size() >= tL_messages_savedDialogs.dialogs.size()) {
        } else {
            clearLoadingOffset(j3);
            loadTopics(j3);
        }
    }

    public void lambda$loadTopics$3(TLRPC.TL_messages_savedDialogsSlice tL_messages_savedDialogsSlice, long j3, a0.i iVar, int i10) {
        int i11;
        getMessagesStorage().putUsersAndChats(tL_messages_savedDialogsSlice.users, tL_messages_savedDialogsSlice.chats, true, true);
        getMessagesController().putUsers(tL_messages_savedDialogsSlice.users, false);
        getMessagesController().putChats(tL_messages_savedDialogsSlice.chats, false);
        this.topicsIsLoading.put(j3, 0);
        processTopics(j3, og.d.l(tL_messages_savedDialogsSlice.dialogs), iVar, false, i10, tL_messages_savedDialogsSlice.count);
        sortTopics(j3);
        getMessagesStorage().saveTopics(-j3, (List) this.topicsByChatId.f(j3), true, true, getConnectionsManager().getCurrentTime());
        getMessagesStorage().putMessages(tL_messages_savedDialogsSlice.messages, false, true, false, 0, false, 0, 0L);
        if (!tL_messages_savedDialogsSlice.dialogs.isEmpty() && i10 == 1) {
            TLRPC.TL_monoForumDialog tL_monoForumDialog = (TLRPC.TL_monoForumDialog) i2.g.h(1, tL_messages_savedDialogsSlice.dialogs);
            TLRPC.Message message = (TLRPC.Message) iVar.f(tL_monoForumDialog.top_message);
            int i12 = tL_monoForumDialog.top_message;
            if (message == null) {
                i11 = 0;
            } else {
                i11 = message.date;
            }
            saveLoadOffset(j3, i12, i11, DialogObject.getPeerDialogId(tL_monoForumDialog.peer));
        } else if (getTopics(j3) != null && getTopics(j3).size() >= tL_messages_savedDialogsSlice.count) {
        } else {
            clearLoadingOffset(j3);
            loadTopics(j3);
        }
    }

    public void lambda$loadTopics$4(long j3, TLRPC.TL_messages_savedDialogsNotModified tL_messages_savedDialogsNotModified) {
        long j10;
        this.topicsIsLoading.put(j3, 0);
        ArrayList<TLRPC.TL_forumTopic> topics = getTopics(j3);
        if (topics != null) {
            j10 = topics.size();
        } else {
            j10 = 0;
        }
        if (j10 >= tL_messages_savedDialogsNotModified.count) {
            this.endIsReached.put(j3, 1);
            getUserConfig().getPreferences().edit().putBoolean("topics_end_reached_" + j3, true).apply();
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.topicsDidLoaded, Long.valueOf(j3), Boolean.FALSE);
    }

    public void lambda$loadTopics$5(TLObject tLObject, long j3, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.i iVar, int i10) {
        int i11;
        TLRPC.TL_messages_forumTopics tL_messages_forumTopics2 = (TLRPC.TL_messages_forumTopics) tLObject;
        getMessagesStorage().putUsersAndChats(tL_messages_forumTopics2.users, tL_messages_forumTopics2.chats, true, true);
        getMessagesController().putUsers(tL_messages_forumTopics2.users, false);
        getMessagesController().putChats(tL_messages_forumTopics2.chats, false);
        this.topicsIsLoading.put(j3, 0);
        processTopics(j3, tL_messages_forumTopics.topics, iVar, false, i10, tL_messages_forumTopics2.count);
        sortTopics(j3);
        getMessagesStorage().saveTopics(-j3, (List) this.topicsByChatId.f(j3), true, true, getConnectionsManager().getCurrentTime());
        getMessagesStorage().putMessages(tL_messages_forumTopics.messages, false, true, false, 0, false, 0, 0L);
        if (!tL_messages_forumTopics.topics.isEmpty() && i10 == 1) {
            TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) i2.g.h(1, tL_messages_forumTopics.topics);
            TLRPC.Message message = (TLRPC.Message) iVar.f(tL_forumTopic.top_message);
            int i12 = tL_forumTopic.top_message;
            if (message == null) {
                i11 = 0;
            } else {
                i11 = message.date;
            }
            saveLoadOffset(j3, i12, i11, tL_forumTopic.f19948id);
        } else if (getTopics(j3) != null && getTopics(j3).size() >= tL_messages_forumTopics.count) {
        } else {
            clearLoadingOffset(j3);
            loadTopics(j3);
        }
    }

    public void lambda$loadTopics$6(long j3) {
        this.topicsIsLoading.put(j3, 0);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.topicsDidLoaded, Long.valueOf(j3), Boolean.FALSE);
    }

    public void lambda$loadTopics$7(long j3, int i10, TLObject tLObject, TLRPC.TL_error tL_error) {
        a0.i iVar = new a0.i();
        if (tLObject instanceof TLRPC.TL_messages_savedDialogs) {
            TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject;
            for (int i11 = 0; i11 < tL_messages_savedDialogs.messages.size(); i11++) {
                iVar.k(tL_messages_savedDialogs.messages.get(i11), tL_messages_savedDialogs.messages.get(i11).f19917id);
            }
            AndroidUtilities.runOnUIThread(new bi.u7(this, tL_messages_savedDialogs, j3, iVar, i10, 7));
            return;
        }
        int i12 = 0;
        if (tLObject instanceof TLRPC.TL_messages_savedDialogsSlice) {
            TLRPC.TL_messages_savedDialogsSlice tL_messages_savedDialogsSlice = (TLRPC.TL_messages_savedDialogsSlice) tLObject;
            while (i12 < tL_messages_savedDialogsSlice.messages.size()) {
                iVar.k(tL_messages_savedDialogsSlice.messages.get(i12), tL_messages_savedDialogsSlice.messages.get(i12).f19917id);
                i12++;
            }
            AndroidUtilities.runOnUIThread(new bi.u7(this, tL_messages_savedDialogsSlice, j3, iVar, i10, 8));
        } else if (tLObject instanceof TLRPC.TL_messages_savedDialogsNotModified) {
            AndroidUtilities.runOnUIThread(new b4(this, j3, (TLRPC.TL_messages_savedDialogsNotModified) tLObject, 28));
        } else if (tLObject instanceof TLRPC.TL_messages_forumTopics) {
            TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject;
            while (i12 < tL_messages_forumTopics.messages.size()) {
                iVar.k(tL_messages_forumTopics.messages.get(i12), tL_messages_forumTopics.messages.get(i12).f19917id);
                i12++;
            }
            AndroidUtilities.runOnUIThread(new fi.p3(this, tL_messages_forumTopics, j3, tL_messages_forumTopics, iVar, i10));
        } else {
            AndroidUtilities.runOnUIThread(new tk(this, j3, 0));
        }
    }

    public void lambda$onTopicsDeletedServerSide$23(ArrayList arrayList) {
        long j3;
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            MessagesStorage.TopicKey topicKey = (MessagesStorage.TopicKey) arrayList.get(i10);
            long j10 = -topicKey.dialogId;
            a0.i iVar = (a0.i) this.topicsMapByChatId.f(j10);
            if (iVar != null) {
                iVar.l(topicKey.topicId);
            }
            ArrayList arrayList2 = (ArrayList) this.topicsByChatId.f(j10);
            if (arrayList2 != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList2.size()) {
                        break;
                    }
                    if (getMessagesController().isMonoForum(topicKey.dialogId)) {
                        j3 = DialogObject.getPeerDialogId(((TLRPC.TL_forumTopic) arrayList2.get(i11)).from_id);
                    } else {
                        j3 = ((TLRPC.TL_forumTopic) arrayList2.get(i11)).f19948id;
                    }
                    if (j3 == topicKey.topicId) {
                        arrayList2.remove(i11);
                        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogDeleted, Long.valueOf(-j10), Long.valueOf(topicKey.topicId));
                        hashSet.add(Long.valueOf(j10));
                        break;
                    }
                    i11++;
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            sortTopics(((Long) it.next()).longValue(), true);
        }
    }

    public void lambda$pinTopic$19(org.telegram.ui.ActionBar.n2 n2Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getContext());
        String string = LocaleController.getString(R.string.LimitReached);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
        b2Var.R = string;
        b2Var.T = LocaleController.formatString(R.string.LimitReachedPinnedTopics, Integer.valueOf(MessagesController.getInstance(this.currentAccount).topicsPinnedLimit));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        n2Var.showDialog(b2Var);
    }

    public void lambda$pinTopic$20(org.telegram.ui.ActionBar.n2 n2Var, long j3, ArrayList arrayList, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            if ("PINNED_TOO_MUCH".equals(tL_error.text)) {
                if (n2Var != null) {
                    applyPinnedOrder(j3, arrayList);
                    AndroidUtilities.runOnUIThread(new wg(12, this, n2Var));
                }
            } else if ("PINNED_TOPIC_NOT_MODIFIED".equals(tL_error.text)) {
                reloadTopics(j3, false);
            }
        }
    }

    public void lambda$processTopics$8(long j3) {
        loadTopics(j3, false, 0);
    }

    public void lambda$processUpdate$22(List list) {
        HashSet hashSet = new HashSet();
        a0.i iVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            TopicUpdate topicUpdate = (TopicUpdate) list.get(i10);
            if (topicUpdate.reloadTopic) {
                if (iVar == null) {
                    iVar = new a0.i();
                }
                ArrayList arrayList = (ArrayList) iVar.f(topicUpdate.dialogId);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    iVar.k(arrayList, topicUpdate.dialogId);
                }
                TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                if (ChatObject.isMonoForum(this.currentAccount, topicUpdate.dialogId)) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_forumTopic.from_id = tL_peerUser;
                    tL_peerUser.user_id = topicUpdate.topicId;
                } else {
                    tL_forumTopic.f19948id = (int) topicUpdate.topicId;
                }
                arrayList.add(tL_forumTopic);
            } else {
                TLRPC.TL_forumTopic findTopic = findTopic(-topicUpdate.dialogId, topicUpdate.topicId);
                if (findTopic != null) {
                    if (topicUpdate.onlyCounters) {
                        int i11 = topicUpdate.unreadCount;
                        if (i11 >= 0) {
                            findTopic.unread_count = i11;
                        }
                        int i12 = topicUpdate.unreadMentions;
                        if (i12 >= 0) {
                            findTopic.unread_mentions_count = i12;
                        }
                    } else {
                        this.topicsByTopMsgId.l(messageHash(findTopic.top_message, -topicUpdate.dialogId));
                        findTopic.topMessage = topicUpdate.topMessage;
                        findTopic.groupedMessages = topicUpdate.groupedMessages;
                        int i13 = topicUpdate.topMessageId;
                        findTopic.top_message = i13;
                        findTopic.unread_count = topicUpdate.unreadCount;
                        findTopic.unread_mentions_count = topicUpdate.unreadMentions;
                        this.topicsByTopMsgId.k(findTopic, messageHash(i13, -topicUpdate.dialogId));
                    }
                    int i14 = topicUpdate.totalMessagesCount;
                    if (i14 > 0) {
                        findTopic.totalMessagesCount = i14;
                    }
                    hashSet.add(Long.valueOf(-topicUpdate.dialogId));
                }
                if (findTopic != null && topicUpdate.checkForDelete) {
                    findTopic.totalMessagesCount = 0;
                    getTopicRepliesCount(topicUpdate.dialogId, topicUpdate.topicId);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            sortTopics(((Long) it.next()).longValue(), true);
        }
        if (iVar != null) {
            for (int i15 = 0; i15 < iVar.m(); i15++) {
                reloadTopics(-iVar.j(i15), (ArrayList) iVar.n(i15), null);
            }
        }
    }

    public void lambda$reloadTopics$13(TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j3, ArrayList arrayList, a0.i iVar, HashSet hashSet, Runnable runnable) {
        int i10 = 0;
        getMessagesController().putUsers(tL_messages_savedDialogs.users, false);
        getMessagesController().putChats(tL_messages_savedDialogs.chats, false);
        processTopics(j3, arrayList, iVar, false, 2, -1);
        long j10 = -j3;
        getMessagesStorage().saveTopics(j10, (List) this.topicsByChatId.f(j3), true, true, getConnectionsManager().getCurrentTime());
        getMessagesStorage().putMessages(tL_messages_savedDialogs.messages, false, true, false, 0, false, 0, 0L);
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            hashSet.remove(Long.valueOf(DialogObject.getPeerDialogId(((TLRPC.TL_forumTopic) obj).from_id)));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            long longValue = ((Long) it.next()).longValue();
            getMessagesStorage().removeTopic(j10, longValue);
            onTopicsDeletedServerSide(j3, longValue);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$reloadTopics$14(TLObject tLObject, long j3, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.i iVar, Runnable runnable) {
        TLRPC.TL_messages_forumTopics tL_messages_forumTopics2 = (TLRPC.TL_messages_forumTopics) tLObject;
        getMessagesController().putUsers(tL_messages_forumTopics2.users, false);
        getMessagesController().putChats(tL_messages_forumTopics2.chats, false);
        processTopics(j3, tL_messages_forumTopics.topics, iVar, false, 2, -1);
        getMessagesStorage().saveTopics(-j3, (List) this.topicsByChatId.f(j3), true, true, getConnectionsManager().getCurrentTime());
        getMessagesStorage().putMessages(tL_messages_forumTopics.messages, false, true, false, 0, false, 0, 0L);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$reloadTopics$15(TLObject tLObject, boolean z10, long j3, HashSet hashSet, Runnable runnable) {
        int i10 = 0;
        if (tLObject != null && z10) {
            a0.i iVar = new a0.i();
            TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject;
            ArrayList l4 = og.d.l(tL_messages_savedDialogs.dialogs);
            while (i10 < tL_messages_savedDialogs.messages.size()) {
                iVar.k(tL_messages_savedDialogs.messages.get(i10), tL_messages_savedDialogs.messages.get(i10).f19917id);
                i10++;
            }
            AndroidUtilities.runOnUIThread(new l8(this, tL_messages_savedDialogs, j3, l4, iVar, hashSet, runnable));
        } else if (tLObject != null) {
            a0.i iVar2 = new a0.i();
            TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject;
            while (i10 < tL_messages_forumTopics.messages.size()) {
                iVar2.k(tL_messages_forumTopics.messages.get(i10), tL_messages_forumTopics.messages.get(i10).f19917id);
                i10++;
            }
            AndroidUtilities.runOnUIThread(new el(this, tLObject, j3, tL_messages_forumTopics, iVar2, runnable));
        }
    }

    public void lambda$reloadTopics$16(boolean z10, long j3, HashSet hashSet, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new kd(this, tLObject, z10, j3, hashSet, runnable));
    }

    public void lambda$reloadTopics$24(long j3, boolean z10) {
        SharedPreferences.Editor edit = getUserConfig().getPreferences().edit();
        edit.remove("topics_end_reached_" + j3).apply();
        this.topicsByChatId.l(j3);
        this.topicsMapByChatId.l(j3);
        this.endIsReached.delete(j3);
        clearLoadingOffset(j3);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j3));
        if (chat != null && (chat.forum || chat.monoforum)) {
            loadTopics(j3, z10, 0);
        }
        sortTopics(j3);
    }

    public static int lambda$sortTopics$9(TLRPC.TL_forumTopic tL_forumTopic, TLRPC.TL_forumTopic tL_forumTopic2) {
        int i10;
        boolean z10 = tL_forumTopic.hidden;
        if (z10 != tL_forumTopic2.hidden) {
            if (!z10) {
                return 1;
            }
            return -1;
        }
        boolean z11 = tL_forumTopic.pinned;
        boolean z12 = tL_forumTopic2.pinned;
        if (z11 != z12) {
            if (!z11) {
                return 1;
            }
            return -1;
        } else if (z11 && z12) {
            return tL_forumTopic.pinnedOrder - tL_forumTopic2.pinnedOrder;
        } else {
            TLRPC.Message message = tL_forumTopic2.topMessage;
            int i11 = 0;
            if (message != null) {
                i10 = message.date;
            } else {
                i10 = 0;
            }
            TLRPC.Message message2 = tL_forumTopic.topMessage;
            if (message2 != null) {
                i11 = message2.date;
            }
            return i10 - i11;
        }
    }

    public void lambda$toggleViewForumAsMessages$18(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public void lambda$updateMentionsUnread$21(long j3, long j10, int i10) {
        long j11 = -j3;
        TLRPC.TL_forumTopic findTopic = findTopic(j11, j10);
        if (findTopic != null) {
            findTopic.unread_mentions_count = i10;
            sortTopics(j11, true);
        }
    }

    public void lambda$updateReadOutbox$26(HashMap hashMap) {
        HashSet hashSet = new HashSet();
        for (MessagesStorage.TopicKey topicKey : hashMap.keySet()) {
            int intValue = ((Integer) hashMap.get(topicKey)).intValue();
            TLRPC.TL_forumTopic findTopic = findTopic(-topicKey.dialogId, topicKey.topicId);
            if (findTopic != null) {
                findTopic.read_outbox_max_id = Math.max(findTopic.read_outbox_max_id, intValue);
                hashSet.add(Long.valueOf(-topicKey.dialogId));
                TLRPC.Message message = findTopic.topMessage;
                if (message != null && findTopic.read_outbox_max_id >= message.f19917id) {
                    message.unread = false;
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.topicsDidLoaded, (Long) it.next(), Boolean.TRUE);
        }
    }

    public void lambda$updateTopicsWithDeletedMessages$10(ArrayList arrayList, long j3) {
        ArrayList<TLRPC.TL_forumTopic> arrayList2 = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) arrayList.get(i10);
            a0.i iVar = (a0.i) this.topicsMapByChatId.f(j3);
            if (iVar != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) iVar.f(tL_forumTopic.f19948id);
                if (tL_forumTopic2 != null && tL_forumTopic.top_message != -1 && tL_forumTopic.topMessage != null) {
                    this.topicsByTopMsgId.l(messageHash(tL_forumTopic2.top_message, j3));
                    TLRPC.Message message = tL_forumTopic.topMessage;
                    int i11 = message.f19917id;
                    tL_forumTopic2.top_message = i11;
                    tL_forumTopic2.topMessage = message;
                    tL_forumTopic2.groupedMessages = tL_forumTopic.groupedMessages;
                    this.topicsByTopMsgId.k(tL_forumTopic2, messageHash(i11, j3));
                    z10 = true;
                } else if (tL_forumTopic.top_message == -1 || tL_forumTopic.topMessage == null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    arrayList2.add(tL_forumTopic);
                }
            }
        }
        if (z10) {
            sortTopics(j3);
        }
        if (arrayList2 != null) {
            reloadTopics(j3, arrayList2, null);
        }
    }

    public void lambda$updateTopicsWithDeletedMessages$11(long r10, java.util.ArrayList r12, boolean r13, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.TopicsController.lambda$updateTopicsWithDeletedMessages$11(long, java.util.ArrayList, boolean, long):void");
    }

    public void lambda$updateTopicsWithDeletedMessages$12(long j3, ArrayList arrayList, boolean z10, long j10) {
        getMessagesStorage().getStorageQueue().postRunnable(new sk(this, j3, arrayList, z10, j10, 0));
    }

    private long messageHash(int i10, long j3) {
        return j3 + (i10 << 12);
    }

    private void sortTopics(long j3) {
        sortTopics(j3, true);
    }

    public void applyPinnedOrder(long j3, ArrayList<Integer> arrayList) {
        applyPinnedOrder(j3, arrayList, true);
    }

    public void clearLoadingOffset(long j3) {
        this.offsets.l(j3);
    }

    public void databaseCleared() {
        AndroidUtilities.runOnUIThread(new uk(this, 1));
    }

    public void deleteTopics(long j3, ArrayList<Integer> arrayList) {
        ArrayList arrayList2 = (ArrayList) this.topicsByChatId.f(j3);
        a0.i iVar = (a0.i) this.topicsMapByChatId.f(j3);
        if (iVar != null && arrayList2 != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                long intValue = arrayList.get(i10).intValue();
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) iVar.f(intValue);
                iVar.l(intValue);
                if (tL_forumTopic != null) {
                    this.topicsByTopMsgId.l(messageHash(tL_forumTopic.top_message, j3));
                    arrayList2.remove(tL_forumTopic);
                }
            }
            sortTopics(j3);
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            deleteTopic(j3, arrayList.get(i11).intValue(), 0);
        }
    }

    public boolean endIsReached(long j3) {
        if (this.endIsReached.get(j3, 0) != 1) {
            return false;
        }
        return true;
    }

    public TLRPC.TL_forumTopic findTopic(long j3, long j10) {
        a0.i iVar = (a0.i) this.topicsMapByChatId.f(j3);
        if (iVar != null) {
            TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) iVar.f(j10);
            if (tL_forumTopic == null && getMessagesController().isMonoForum(-j3)) {
                int i10 = og.d.f17053a;
                return (TLRPC.TL_forumTopic) iVar.f((int) ((j10 >>> 32) ^ j10));
            }
            return tL_forumTopic;
        }
        return null;
    }

    public ArrayList<Integer> getCurrentPinnedOrder(long j3) {
        ArrayList<TLRPC.TL_forumTopic> topics = getTopics(j3);
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (topics != null) {
            for (int i10 = 0; i10 < topics.size(); i10++) {
                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i10);
                if (tL_forumTopic != null && tL_forumTopic.pinned) {
                    arrayList.add(Integer.valueOf(tL_forumTopic.f19948id));
                }
            }
        }
        return arrayList;
    }

    public int[] getForumUnreadCount(long j3) {
        int i10;
        int i11;
        ArrayList arrayList = (ArrayList) this.topicsByChatId.f(j3);
        Arrays.fill(countsTmp, 0);
        if (arrayList != null) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) arrayList.get(i12);
                int[] iArr = countsTmp;
                int i13 = iArr[0];
                int i14 = 1;
                if (tL_forumTopic.unread_count > 0) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                iArr[0] = i13 + i10;
                int i15 = iArr[1];
                if (tL_forumTopic.unread_mentions_count > 0) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                iArr[1] = i15 + i11;
                int i16 = iArr[2];
                if (tL_forumTopic.unread_reactions_count <= 0) {
                    i14 = 0;
                }
                iArr[2] = i16 + i14;
                if (!getMessagesController().isDialogMuted(-j3, tL_forumTopic.f19948id)) {
                    iArr[3] = iArr[3] + tL_forumTopic.unread_count;
                }
                iArr[4] = iArr[4] + tL_forumTopic.unread_poll_votes_count;
            }
        }
        return countsTmp;
    }

    public TopicsLoadOffset getLoadOffset(long j3) {
        TopicsLoadOffset topicsLoadOffset = (TopicsLoadOffset) this.offsets.f(j3);
        if (topicsLoadOffset != null) {
            return topicsLoadOffset;
        }
        return new TopicsLoadOffset();
    }

    public CharSequence getTopicIconName(TLRPC.Chat chat, MessageObject messageObject, TextPaint textPaint) {
        return getTopicIconName(chat, messageObject, textPaint, null);
    }

    public String getTopicName(TLRPC.Chat chat, MessageObject messageObject) {
        TLRPC.TL_forumTopic findTopic;
        TLRPC.MessageReplyHeader messageReplyHeader = messageObject.messageOwner.reply_to;
        if (messageReplyHeader == null) {
            return null;
        }
        int i10 = messageReplyHeader.reply_to_top_id;
        if (i10 == 0) {
            i10 = messageReplyHeader.reply_to_msg_id;
        }
        if (i10 != 0 && (findTopic = findTopic(chat.f19896id, i10)) != null) {
            return findTopic.title;
        }
        return "";
    }

    public void getTopicRepliesCount(long j3, long j10) {
        TLRPC.TL_messages_getReplies tL_messages_getReplies;
        TLRPC.TL_forumTopic findTopic = findTopic(-j3, j10);
        if (findTopic != null && findTopic.totalMessagesCount == 0) {
            if (getMessagesController().isMonoForum(j3)) {
                TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = new TLRPC.TL_messages_getSavedHistory();
                tL_messages_getSavedHistory.peer = getMessagesController().getInputPeer(j10);
                tL_messages_getSavedHistory.parent_peer = getMessagesController().getInputPeer(j3);
                tL_messages_getSavedHistory.limit = 1;
                tL_messages_getReplies = tL_messages_getSavedHistory;
            } else {
                TLRPC.TL_messages_getReplies tL_messages_getReplies2 = new TLRPC.TL_messages_getReplies();
                tL_messages_getReplies2.peer = getMessagesController().getInputPeer(j3);
                tL_messages_getReplies2.msg_id = (int) j10;
                tL_messages_getReplies2.limit = 1;
                tL_messages_getReplies = tL_messages_getReplies2;
            }
            getConnectionsManager().sendRequest(tL_messages_getReplies, new z6(this, findTopic, j3, j10, 3));
        }
    }

    public ArrayList<TLRPC.TL_forumTopic> getTopics(long j3) {
        return (ArrayList) this.topicsByChatId.f(j3);
    }

    public int getTopicsCount(long j3) {
        ArrayList<TLRPC.TL_forumTopic> topics;
        if (!endIsReached(j3) || (topics = getTopics(j3)) == null) {
            return 0;
        }
        return topics.size();
    }

    public boolean isLoading(long j3) {
        if (this.topicsIsLoading.get(j3, 0) != 1 || (this.topicsByChatId.f(j3) != null && !((ArrayList) this.topicsByChatId.f(j3)).isEmpty())) {
            return false;
        }
        return true;
    }

    public void loadTopic(final long j3, final long j10, final Runnable runnable) {
        getMessagesStorage().loadTopics(-j3, new Consumer() {
            @Override
            public final void accept(Object obj) {
                long j11 = j3;
                long j12 = j10;
                TopicsController.this.lambda$loadTopic$28(j11, j12, runnable, (ArrayList) obj);
            }

            public Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public void loadTopics(long j3) {
        loadTopics(j3, false, 1);
    }

    public void markAllPollVotesAsRead(long j3, long j10) {
        TLRPC.TL_forumTopic findTopic = findTopic(j3, j10);
        if (findTopic == null || findTopic.unread_poll_votes_count <= 0) {
            return;
        }
        findTopic.unread_poll_votes_count = 0;
        sortTopics(j3);
    }

    public void markAllReactionsAsRead(long j3, long j10) {
        TLRPC.TL_forumTopic findTopic = findTopic(j3, j10);
        if (findTopic == null || findTopic.unread_reactions_count <= 0) {
            return;
        }
        findTopic.unread_reactions_count = 0;
        sortTopics(j3);
    }

    public void onTopicCreated(long j3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        long j10 = -j3;
        a0.i iVar = (a0.i) this.topicsMapByChatId.f(j10);
        if (findTopic(j10, tL_forumTopic.f19948id) != null) {
            return;
        }
        if (iVar == null) {
            iVar = new a0.i();
            this.topicsMapByChatId.k(iVar, j10);
        }
        ArrayList arrayList = (ArrayList) this.topicsByChatId.f(j10);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.topicsByChatId.k(arrayList, j10);
        }
        iVar.k(tL_forumTopic, tL_forumTopic.f19948id);
        arrayList.add(tL_forumTopic);
        if (z10) {
            getMessagesStorage().saveTopics(j3, Collections.singletonList(tL_forumTopic), false, true, getConnectionsManager().getCurrentTime());
        }
        sortTopics(j10, true);
    }

    public void onTopicEdited(long j3, TLRPC.TL_forumTopic tL_forumTopic) {
        getMessagesStorage().updateTopicData(j3, tL_forumTopic, 35);
        sortTopics(-j3);
    }

    public void onTopicFragmentPause(long j3) {
        int i10 = 0;
        int i11 = this.openedTopicsByChatId.get(j3, 0) - 1;
        if (i11 >= 0) {
            i10 = i11;
        }
        this.openedTopicsByChatId.put(j3, i10);
    }

    public void onTopicFragmentResume(long j3) {
        this.openedTopicsByChatId.put(j3, this.openedTopicsByChatId.get(j3, 0) + 1);
        sortTopics(j3);
    }

    public void onTopicsDeletedServerSide(long j3, long j10) {
        ArrayList<MessagesStorage.TopicKey> arrayList = new ArrayList<>(1);
        arrayList.add(MessagesStorage.TopicKey.of(-j3, j10));
        onTopicsDeletedServerSide(arrayList);
    }

    public void pinTopic(long j3, int i10, boolean z10, org.telegram.ui.ActionBar.n2 n2Var) {
        TL_forum.TL_messages_updatePinnedForumTopic tL_messages_updatePinnedForumTopic = new TL_forum.TL_messages_updatePinnedForumTopic();
        tL_messages_updatePinnedForumTopic.peer = getMessagesController().getInputPeer(-j3);
        tL_messages_updatePinnedForumTopic.topic_id = i10;
        tL_messages_updatePinnedForumTopic.pinned = z10;
        ArrayList<Integer> currentPinnedOrder = getCurrentPinnedOrder(j3);
        ArrayList<Integer> arrayList = new ArrayList<>(currentPinnedOrder);
        arrayList.remove(Integer.valueOf(i10));
        if (z10) {
            arrayList.add(0, Integer.valueOf(i10));
        }
        applyPinnedOrder(j3, arrayList);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_updatePinnedForumTopic, new ja(this, n2Var, j3, currentPinnedOrder, 3));
    }

    public void preloadTopics(long j3) {
        loadTopics(j3, true, 0);
    }

    public void processEditedMessage(TLRPC.Message message) {
        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.topicsByTopMsgId.f(messageHash(message.f19917id, -message.dialog_id));
        if (tL_forumTopic != null) {
            tL_forumTopic.topMessage = message;
            sortTopics(-message.dialog_id, true);
        }
    }

    public void processEditedMessages(a0.i iVar) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < iVar.m(); i10++) {
            ArrayList arrayList = (ArrayList) iVar.n(i10);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.topicsByTopMsgId.f(messageHash(((MessageObject) arrayList.get(i11)).getId(), -((MessageObject) arrayList.get(i11)).getDialogId()));
                if (tL_forumTopic != null) {
                    tL_forumTopic.topMessage = ((MessageObject) arrayList.get(i11)).messageOwner;
                    hashSet.add(Long.valueOf(-((MessageObject) arrayList.get(i11)).getDialogId()));
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            sortTopics(((Long) it.next()).longValue(), true);
        }
    }

    public void processTopics(long r23, java.util.ArrayList<org.telegram.tgnet.TLRPC.TL_forumTopic> r25, a0.i r26, boolean r27, int r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.TopicsController.processTopics(long, java.util.ArrayList, a0.i, boolean, int, int):void");
    }

    public void processUpdate(List<TopicUpdate> list) {
        AndroidUtilities.runOnUIThread(new wg(11, this, list));
    }

    public void reloadTopics(long j3, ArrayList<TLRPC.TL_forumTopic> arrayList, Runnable runnable) {
        TL_forum.TL_messages_getForumTopicsByID tL_messages_getForumTopicsByID;
        long j10 = -j3;
        boolean isMonoForum = getMessagesController().isMonoForum(j10);
        HashSet hashSet = new HashSet();
        int i10 = 0;
        if (isMonoForum) {
            TLRPC.TL_messages_getSavedDialogsByID tL_messages_getSavedDialogsByID = new TLRPC.TL_messages_getSavedDialogsByID();
            while (i10 < arrayList.size()) {
                long peerDialogId = DialogObject.getPeerDialogId(arrayList.get(i10).from_id);
                hashSet.add(Long.valueOf(peerDialogId));
                tL_messages_getSavedDialogsByID.ids.add(getMessagesController().getInputPeer(peerDialogId));
                i10++;
            }
            tL_messages_getSavedDialogsByID.parent_peer = getMessagesController().getInputPeer(j10);
            tL_messages_getForumTopicsByID = tL_messages_getSavedDialogsByID;
        } else {
            TL_forum.TL_messages_getForumTopicsByID tL_messages_getForumTopicsByID2 = new TL_forum.TL_messages_getForumTopicsByID();
            while (i10 < arrayList.size()) {
                i10 = com.google.android.gms.internal.vision.e2.e(arrayList.get(i10).f19948id, i10, 1, tL_messages_getForumTopicsByID2.topics);
            }
            tL_messages_getForumTopicsByID2.peer = getMessagesController().getInputPeer(j10);
            tL_messages_getForumTopicsByID = tL_messages_getForumTopicsByID2;
        }
        getConnectionsManager().sendRequest(tL_messages_getForumTopicsByID, new oa(this, isMonoForum, j3, hashSet, runnable));
    }

    public void reorderPinnedTopics(long j3, ArrayList<Integer> arrayList) {
        TL_forum.TL_messages_reorderPinnedForumTopics tL_messages_reorderPinnedForumTopics = new TL_forum.TL_messages_reorderPinnedForumTopics();
        tL_messages_reorderPinnedForumTopics.peer = getMessagesController().getInputPeer(-j3);
        if (arrayList != null) {
            tL_messages_reorderPinnedForumTopics.order.addAll(arrayList);
        }
        tL_messages_reorderPinnedForumTopics.force = true;
        applyPinnedOrder(j3, arrayList, false);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reorderPinnedForumTopics, null);
    }

    public void saveLoadOffset(long j3, int i10, int i11, long j10) {
        TopicsLoadOffset topicsLoadOffset = new TopicsLoadOffset();
        topicsLoadOffset.lastMessageId = i10;
        topicsLoadOffset.lastMessageDate = i11;
        topicsLoadOffset.lastTopicId = j10;
        this.offsets.k(topicsLoadOffset, j3);
    }

    public void saveTopics(long j3) {
        if (((ArrayList) this.topicsByChatId.f(j3)) != null) {
            getMessagesStorage().saveTopics(-j3, (List) this.topicsByChatId.f(j3), true, true, getConnectionsManager().getCurrentTime());
        }
    }

    public void toggleCloseTopic(long j3, int i10, boolean z10) {
        TLRPC.TL_forumTopic tL_forumTopic;
        TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
        long j10 = -j3;
        tL_messages_editForumTopic.peer = getMessagesController().getInputPeer(j10);
        tL_messages_editForumTopic.topic_id = i10;
        tL_messages_editForumTopic.flags |= 4;
        tL_messages_editForumTopic.closed = z10;
        a0.i iVar = (a0.i) this.topicsMapByChatId.f(j3);
        if (iVar != null && (tL_forumTopic = (TLRPC.TL_forumTopic) iVar.f(i10)) != null) {
            tL_forumTopic.closed = z10;
            getMessagesStorage().updateTopicData(j10, tL_forumTopic, 8);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_editForumTopic, new RequestDelegate() {
            {
                TopicsController.this = this;
            }

            @Override
            public void run(TLObject tLObject, TLRPC.TL_error tL_error) {
            }
        });
    }

    public void toggleShowTopic(long j3, int i10, boolean z10) {
        TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
        long j10 = -j3;
        tL_messages_editForumTopic.peer = getMessagesController().getInputPeer(j10);
        tL_messages_editForumTopic.topic_id = i10;
        tL_messages_editForumTopic.flags = 8;
        tL_messages_editForumTopic.hidden = !z10;
        TLRPC.TL_forumTopic findTopic = findTopic(j3, i10);
        if (findTopic != null) {
            boolean z11 = tL_messages_editForumTopic.hidden;
            findTopic.hidden = z11;
            if (z11) {
                findTopic.closed = true;
            }
            updateTopicInUi(j10, findTopic, 44);
            getMessagesStorage().updateTopicData(j10, findTopic, 44);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_editForumTopic, null);
    }

    public void toggleViewForumAsMessages(long j3, boolean z10) {
        TLRPC.TL_channels_toggleViewForumAsMessages tL_channels_toggleViewForumAsMessages = new TLRPC.TL_channels_toggleViewForumAsMessages();
        tL_channels_toggleViewForumAsMessages.channel_id = getMessagesController().getInputChannel(j3);
        tL_channels_toggleViewForumAsMessages.enabled = z10;
        getConnectionsManager().sendRequest(tL_channels_toggleViewForumAsMessages, new g0(this, 9));
    }

    public void updateMaxReadId(long j3, long j10, int i10, int i11, int i12) {
        TLRPC.TL_forumTopic findTopic = findTopic(j3, j10);
        if (findTopic != null) {
            findTopic.read_inbox_max_id = i10;
            findTopic.unread_count = i11;
            if (i12 >= 0) {
                findTopic.unread_mentions_count = i12;
            }
            sortTopics(j3);
        }
    }

    public void updateMentionsUnread(long j3, long j10, int i10) {
        AndroidUtilities.runOnUIThread(new t7(this, j3, j10, i10, 2));
    }

    public int updatePollVotesUnread(long j3, long j10, int i10, boolean z10) {
        long j11 = -j3;
        TLRPC.TL_forumTopic findTopic = findTopic(j11, j10);
        if (findTopic != null) {
            if (z10) {
                int i11 = findTopic.unread_poll_votes_count + i10;
                findTopic.unread_poll_votes_count = i11;
                if (i11 < 0) {
                    findTopic.unread_poll_votes_count = 0;
                }
            } else {
                findTopic.unread_poll_votes_count = i10;
            }
            int i12 = findTopic.unread_poll_votes_count;
            sortTopics(j11, true);
            return i12;
        }
        return -1;
    }

    public int updateReactionsUnread(long j3, long j10, int i10, boolean z10) {
        long j11 = -j3;
        TLRPC.TL_forumTopic findTopic = findTopic(j11, j10);
        if (findTopic != null) {
            if (z10) {
                int i11 = findTopic.unread_reactions_count + i10;
                findTopic.unread_reactions_count = i11;
                if (i11 < 0) {
                    findTopic.unread_reactions_count = 0;
                }
            } else {
                findTopic.unread_reactions_count = i10;
            }
            int i12 = findTopic.unread_reactions_count;
            sortTopics(j11, true);
            return i12;
        }
        return -1;
    }

    public void updateReadOutbox(HashMap<MessagesStorage.TopicKey, Integer> hashMap) {
        AndroidUtilities.runOnUIThread(new wg(14, this, hashMap));
    }

    public void updateTopicInUi(long j3, TLRPC.TL_forumTopic tL_forumTopic, int i10) {
        long j10 = -j3;
        TLRPC.TL_forumTopic findTopic = findTopic(j10, tL_forumTopic.f19948id);
        if (findTopic != null) {
            if ((i10 & 1) != 0) {
                findTopic.title = tL_forumTopic.title;
            }
            if ((i10 & 2) != 0) {
                findTopic.icon_emoji_id = tL_forumTopic.icon_emoji_id;
            }
            if ((i10 & 8) != 0) {
                findTopic.closed = tL_forumTopic.closed;
            }
            if ((i10 & 4) != 0) {
                findTopic.pinned = tL_forumTopic.pinned;
            }
            if ((i10 & 32) != 0) {
                findTopic.hidden = tL_forumTopic.hidden;
            }
            sortTopics(j10);
        }
    }

    public void updateTopicsWithDeletedMessages(long j3, ArrayList<Integer> arrayList) {
        if (j3 > 0) {
            return;
        }
        long j10 = -j3;
        AndroidUtilities.runOnUIThread(new sk(this, j3, arrayList, ChatObject.isMonoForum(getMessagesController().getChat(Long.valueOf(j10))), j10, 1));
    }

    public void applyPinnedOrder(long j3, ArrayList<Integer> arrayList, boolean z10) {
        if (arrayList == null) {
            return;
        }
        ArrayList<TLRPC.TL_forumTopic> topics = getTopics(j3);
        boolean z11 = true;
        if (topics != null) {
            boolean z12 = false;
            for (int i10 = 0; i10 < topics.size(); i10++) {
                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i10);
                if (tL_forumTopic != null) {
                    int indexOf = arrayList.indexOf(Integer.valueOf(tL_forumTopic.f19948id));
                    boolean z13 = indexOf >= 0;
                    if (tL_forumTopic.pinned != z13 || (z13 && tL_forumTopic.pinnedOrder != indexOf)) {
                        tL_forumTopic.pinned = z13;
                        tL_forumTopic.pinnedOrder = indexOf;
                        getMessagesStorage().updateTopicData(j3, tL_forumTopic, 4);
                        z12 = true;
                    }
                }
            }
            z11 = z12;
        }
        if (z10 && z11) {
            AndroidUtilities.runOnUIThread(new uk(this, 0));
        }
    }

    public CharSequence getTopicIconName(TLRPC.Chat chat, MessageObject messageObject, TextPaint textPaint, Drawable[] drawableArr) {
        TLRPC.TL_forumTopic findTopic;
        TLRPC.MessageReplyHeader messageReplyHeader = messageObject.messageOwner.reply_to;
        if (messageReplyHeader == null) {
            return null;
        }
        int i10 = messageReplyHeader.reply_to_top_id;
        if (i10 == 0) {
            i10 = messageReplyHeader.reply_to_msg_id;
        }
        if (i10 == 0 || (findTopic = findTopic(chat.f19896id, i10)) == null) {
            return null;
        }
        return og.d.j(findTopic, textPaint, drawableArr);
    }

    public void loadTopics(final long r19, final boolean r21, final int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.TopicsController.loadTopics(long, boolean, int):void");
    }

    public void sortTopics(long j3, boolean z10) {
        ArrayList arrayList = (ArrayList) this.topicsByChatId.f(j3);
        if (arrayList != null) {
            if (this.openedTopicsByChatId.get(j3, 0) > 0) {
                Collections.sort(arrayList, new bi(4));
            }
            if (z10) {
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.topicsDidLoaded, Long.valueOf(j3), Boolean.TRUE);
            }
        }
    }

    public void onTopicsDeletedServerSide(ArrayList<MessagesStorage.TopicKey> arrayList) {
        AndroidUtilities.runOnUIThread(new wg(13, this, arrayList));
    }

    public void markAllPollVotesAsRead(long j3) {
        ArrayList<TLRPC.TL_forumTopic> topics = getTopics(j3);
        if (topics != null) {
            for (int i10 = 0; i10 < topics.size(); i10++) {
                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i10);
                if (tL_forumTopic != null) {
                    tL_forumTopic.unread_poll_votes_count = 0;
                }
            }
            sortTopics(j3);
        }
    }

    public void markAllReactionsAsRead(long j3) {
        ArrayList<TLRPC.TL_forumTopic> topics = getTopics(j3);
        if (topics != null) {
            for (int i10 = 0; i10 < topics.size(); i10++) {
                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i10);
                if (tL_forumTopic != null) {
                    tL_forumTopic.unread_reactions_count = 0;
                }
            }
            sortTopics(j3);
        }
    }

    public void reloadTopics(long j3) {
        reloadTopics(j3, true);
    }

    public void reloadTopics(long j3, boolean z10) {
        AndroidUtilities.runOnUIThread(new di.q9(this, j3, z10, 4));
    }
}
