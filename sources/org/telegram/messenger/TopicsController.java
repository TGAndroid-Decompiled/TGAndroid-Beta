package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import androidx.collection.LongSparseArray;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.Forum.ForumUtilities;

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
    private static final int[] countsTmp = new int[4];
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

    private long messageHash(int i, long j) {
        return j + (i << 12);
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

    public void preloadTopics(long j) {
        loadTopics(j, true, 0);
    }

    public void loadTopics(long j) {
        loadTopics(j, false, 1);
    }

    public void loadTopics(final long j, final boolean z, final int i) {
        ?? tL_messages_getForumTopics;
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
                public final void p(Object obj) {
                    this.f$0.lambda$loadTopics$1(j, z, i, (ArrayList) obj);
                }

                public Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return;
        }
        long j2 = -j;
        if (getMessagesController().isMonoForum(j2)) {
            tL_messages_getForumTopics = new TLRPC.TL_messages_getSavedDialogs();
            tL_messages_getForumTopics.parent_peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j2);
            tL_messages_getForumTopics.flags |= 2;
            TopicsLoadOffset loadOffset = getLoadOffset(j);
            if (i == 0 || i == 3 || (i != 1 && loadOffset.lastTopicId == 0)) {
                ArrayList<TLRPC.TL_forumTopic> topics = getTopics(j);
                tL_messages_getForumTopics.limit = 20;
                tL_messages_getForumTopics.offset_id = Integer.MAX_VALUE;
                tL_messages_getForumTopics.offset_date = 0;
                tL_messages_getForumTopics.offset_peer = new TLRPC.TL_inputPeerEmpty();
                tL_messages_getForumTopics.hash = topics != null ? calculateHashSavedDialogs(topics, 0, Math.min(topics.size(), 20)) : 0L;
            } else if (i == 1) {
                tL_messages_getForumTopics.limit = 100;
                tL_messages_getForumTopics.offset_date = loadOffset.lastMessageDate;
                tL_messages_getForumTopics.offset_id = loadOffset.lastMessageId;
                tL_messages_getForumTopics.offset_peer = MessagesController.getInstance(this.currentAccount).getInputPeer(loadOffset.lastTopicId);
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("offset_date=" + loadOffset.lastMessageDate + " offset_id=" + loadOffset.lastMessageId + " offset_topic=" + loadOffset.lastTopicId);
                }
            }
        } else {
            tL_messages_getForumTopics = new TL_forum.TL_messages_getForumTopics();
            tL_messages_getForumTopics.peer = getMessagesController().getInputPeer(j2);
            if (i == 0) {
                tL_messages_getForumTopics.limit = 20;
            } else if (i == 1) {
                tL_messages_getForumTopics.limit = 100;
                TopicsLoadOffset loadOffset2 = getLoadOffset(j);
                tL_messages_getForumTopics.offset_date = loadOffset2.lastMessageDate;
                tL_messages_getForumTopics.offset_id = loadOffset2.lastMessageId;
                tL_messages_getForumTopics.offset_topic = (int) loadOffset2.lastTopicId;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("offset_date=" + loadOffset2.lastMessageDate + " offset_id=" + loadOffset2.lastMessageId + " offset_topic=" + loadOffset2.lastTopicId);
                }
            }
        }
        getConnectionsManager().sendRequest(tL_messages_getForumTopics, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$loadTopics$7(j, i, tLObject, tL_error);
            }
        });
    }

    public void lambda$loadTopics$1(final long j, final boolean z, final int i, final ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$loadTopics$0(j, arrayList, z, i);
            }
        });
    }

    public void lambda$loadTopics$0(long j, ArrayList arrayList, boolean z, int i) {
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb = new StringBuilder();
            sb.append("loaded from cache ");
            sb.append(j);
            sb.append(" topics_count=");
            sb.append(arrayList == null ? 0 : arrayList.size());
            FileLog.d(sb.toString());
        }
        this.topicsIsLoading.put(j, 0);
        processTopics(j, arrayList, null, z, i, -1);
        sortTopics(j);
    }

    public void lambda$loadTopics$7(final long j, final int i, final TLObject tLObject, TLRPC.TL_error tL_error) {
        final LongSparseArray longSparseArray = new LongSparseArray();
        int i2 = 0;
        if (tLObject instanceof TLRPC.TL_messages_savedDialogs) {
            final TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject;
            while (i2 < tL_messages_savedDialogs.messages.size()) {
                longSparseArray.put(tL_messages_savedDialogs.messages.get(i2).id, tL_messages_savedDialogs.messages.get(i2));
                i2++;
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() throws Throwable {
                    this.f$0.lambda$loadTopics$2(tL_messages_savedDialogs, j, longSparseArray, i);
                }
            });
            return;
        }
        if (tLObject instanceof TLRPC.TL_messages_savedDialogsSlice) {
            final TLRPC.TL_messages_savedDialogsSlice tL_messages_savedDialogsSlice = (TLRPC.TL_messages_savedDialogsSlice) tLObject;
            while (i2 < tL_messages_savedDialogsSlice.messages.size()) {
                longSparseArray.put(tL_messages_savedDialogsSlice.messages.get(i2).id, tL_messages_savedDialogsSlice.messages.get(i2));
                i2++;
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() throws Throwable {
                    this.f$0.lambda$loadTopics$3(tL_messages_savedDialogsSlice, j, longSparseArray, i);
                }
            });
            return;
        }
        if (tLObject instanceof TLRPC.TL_messages_savedDialogsNotModified) {
            final TLRPC.TL_messages_savedDialogsNotModified tL_messages_savedDialogsNotModified = (TLRPC.TL_messages_savedDialogsNotModified) tLObject;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$loadTopics$4(j, tL_messages_savedDialogsNotModified);
                }
            });
        } else {
            if (tLObject instanceof TLRPC.TL_messages_forumTopics) {
                final TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject;
                while (i2 < tL_messages_forumTopics.messages.size()) {
                    longSparseArray.put(tL_messages_forumTopics.messages.get(i2).id, tL_messages_forumTopics.messages.get(i2));
                    i2++;
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() throws Throwable {
                        this.f$0.lambda$loadTopics$5(tLObject, j, tL_messages_forumTopics, longSparseArray, i);
                    }
                });
                return;
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$loadTopics$6(j);
                }
            });
        }
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
            ArrayList<TLRPC.savedDialog> arrayList = tL_messages_savedDialogs.dialogs;
            TLRPC.TL_monoForumDialog tL_monoForumDialog = (TLRPC.TL_monoForumDialog) arrayList.get(arrayList.size() - 1);
            TLRPC.Message message = (TLRPC.Message) longSparseArray.get(tL_monoForumDialog.top_message);
            saveLoadOffset(j, tL_monoForumDialog.top_message, message == null ? 0 : message.date, DialogObject.getPeerDialogId(tL_monoForumDialog.peer));
            return;
        }
        if (getTopics(j) == null || getTopics(j).size() < tL_messages_savedDialogs.dialogs.size()) {
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
            ArrayList<TLRPC.savedDialog> arrayList = tL_messages_savedDialogsSlice.dialogs;
            TLRPC.TL_monoForumDialog tL_monoForumDialog = (TLRPC.TL_monoForumDialog) arrayList.get(arrayList.size() - 1);
            TLRPC.Message message = (TLRPC.Message) longSparseArray.get(tL_monoForumDialog.top_message);
            saveLoadOffset(j, tL_monoForumDialog.top_message, message == null ? 0 : message.date, DialogObject.getPeerDialogId(tL_monoForumDialog.peer));
            return;
        }
        if (getTopics(j) == null || getTopics(j).size() < tL_messages_savedDialogsSlice.count) {
            clearLoadingOffset(j);
            loadTopics(j);
        }
    }

    public void lambda$loadTopics$4(long j, TLRPC.TL_messages_savedDialogsNotModified tL_messages_savedDialogsNotModified) {
        this.topicsIsLoading.put(j, 0);
        if ((getTopics(j) != null ? r1.size() : 0L) >= tL_messages_savedDialogsNotModified.count) {
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
            ArrayList<TLRPC.TL_forumTopic> arrayList = tL_messages_forumTopics.topics;
            TLRPC.TL_forumTopic tL_forumTopic = arrayList.get(arrayList.size() - 1);
            TLRPC.Message message = (TLRPC.Message) longSparseArray.get(tL_forumTopic.top_message);
            saveLoadOffset(j, tL_forumTopic.top_message, message == null ? 0 : message.date, tL_forumTopic.id);
            return;
        }
        if (getTopics(j) == null || getTopics(j).size() < tL_messages_forumTopics.count) {
            clearLoadingOffset(j);
            loadTopics(j);
        }
    }

    public void lambda$loadTopics$6(long j) {
        this.topicsIsLoading.put(j, 0);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.topicsDidLoaded, Long.valueOf(j), Boolean.FALSE);
    }

    public void processTopics(final long r22, java.util.ArrayList<org.telegram.tgnet.TLRPC.TL_forumTopic> r24, androidx.collection.LongSparseArray r25, boolean r26, int r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.TopicsController.processTopics(long, java.util.ArrayList, androidx.collection.LongSparseArray, boolean, int, int):void");
    }

    public void lambda$processTopics$8(long j) {
        loadTopics(j, false, 0);
    }

    public ArrayList<TLRPC.TL_forumTopic> getTopics(long j) {
        return (ArrayList) this.topicsByChatId.get(j);
    }

    private void sortTopics(long j) {
        sortTopics(j, true);
    }

    public void sortTopics(long j, boolean z) {
        ArrayList arrayList = (ArrayList) this.topicsByChatId.get(j);
        if (arrayList != null) {
            if (this.openedTopicsByChatId.get(j, 0) > 0) {
                Collections.sort(arrayList, new Comparator() {
                    @Override
                    public final int compare(Object obj, Object obj2) {
                        return TopicsController.lambda$sortTopics$9((TLRPC.TL_forumTopic) obj, (TLRPC.TL_forumTopic) obj2);
                    }
                });
            }
            if (z) {
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.topicsDidLoaded, Long.valueOf(j), Boolean.TRUE);
            }
        }
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

    public void updateTopicsWithDeletedMessages(final long j, final ArrayList<Integer> arrayList) {
        if (j > 0) {
            return;
        }
        final long j2 = -j;
        final boolean zIsMonoForum = ChatObject.isMonoForum(getMessagesController().getChat(Long.valueOf(j2)));
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$updateTopicsWithDeletedMessages$12(j, arrayList, zIsMonoForum, j2);
            }
        });
    }

    public void lambda$updateTopicsWithDeletedMessages$12(final long j, final ArrayList arrayList, final boolean z, final long j2) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$updateTopicsWithDeletedMessages$11(j, arrayList, z, j2);
            }
        });
    }

    public void lambda$updateTopicsWithDeletedMessages$11(long r17, java.util.ArrayList r19, boolean r20, final long r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.TopicsController.lambda$updateTopicsWithDeletedMessages$11(long, java.util.ArrayList, boolean, long):void");
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
                    this.topicsByTopMsgId.put(messageHash(i2, j), tL_forumTopic2);
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

    public void reloadTopics(final long j, ArrayList<TLRPC.TL_forumTopic> arrayList, final Runnable runnable) {
        TL_forum.TL_messages_getForumTopicsByID tL_messages_getForumTopicsByID;
        long j2 = -j;
        final boolean zIsMonoForum = getMessagesController().isMonoForum(j2);
        final HashSet hashSet = new HashSet();
        int i = 0;
        if (zIsMonoForum) {
            TLRPC.TL_messages_getSavedDialogsByID tL_messages_getSavedDialogsByID = new TLRPC.TL_messages_getSavedDialogsByID();
            while (i < arrayList.size()) {
                long peerDialogId = DialogObject.getPeerDialogId(arrayList.get(i).from_id);
                hashSet.add(Long.valueOf(peerDialogId));
                tL_messages_getSavedDialogsByID.ids.add(getMessagesController().getInputPeer(peerDialogId));
                i++;
            }
            tL_messages_getSavedDialogsByID.parent_peer = getMessagesController().getInputPeer(j2);
            tL_messages_getForumTopicsByID = tL_messages_getSavedDialogsByID;
        } else {
            TL_forum.TL_messages_getForumTopicsByID tL_messages_getForumTopicsByID2 = new TL_forum.TL_messages_getForumTopicsByID();
            while (i < arrayList.size()) {
                tL_messages_getForumTopicsByID2.topics.add(Integer.valueOf(arrayList.get(i).id));
                i++;
            }
            tL_messages_getForumTopicsByID2.peer = getMessagesController().getInputPeer(j2);
            tL_messages_getForumTopicsByID = tL_messages_getForumTopicsByID2;
        }
        getConnectionsManager().sendRequest(tL_messages_getForumTopicsByID, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$reloadTopics$16(zIsMonoForum, j, hashSet, runnable, tLObject, tL_error);
            }
        });
    }

    public void lambda$reloadTopics$16(final boolean z, final long j, final HashSet hashSet, final Runnable runnable, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$reloadTopics$15(tLObject, z, j, hashSet, runnable);
            }
        });
    }

    public void lambda$reloadTopics$15(final TLObject tLObject, boolean z, final long j, final HashSet hashSet, final Runnable runnable) {
        int i = 0;
        if (tLObject != null && z) {
            final LongSparseArray longSparseArray = new LongSparseArray();
            final TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject;
            final ArrayList arrayListMonoForumTopicToTopic = ForumUtilities.monoForumTopicToTopic(tL_messages_savedDialogs.dialogs);
            while (i < tL_messages_savedDialogs.messages.size()) {
                longSparseArray.put(tL_messages_savedDialogs.messages.get(i).id, tL_messages_savedDialogs.messages.get(i));
                i++;
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() throws Throwable {
                    this.f$0.lambda$reloadTopics$13(tL_messages_savedDialogs, j, arrayListMonoForumTopicToTopic, longSparseArray, hashSet, runnable);
                }
            });
            return;
        }
        if (tLObject != null) {
            final LongSparseArray longSparseArray2 = new LongSparseArray();
            final TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject;
            while (i < tL_messages_forumTopics.messages.size()) {
                longSparseArray2.put(tL_messages_forumTopics.messages.get(i).id, tL_messages_forumTopics.messages.get(i));
                i++;
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() throws Throwable {
                    this.f$0.lambda$reloadTopics$14(tLObject, j, tL_messages_forumTopics, longSparseArray2, runnable);
                }
            });
        }
    }

    public void lambda$reloadTopics$13(TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j, ArrayList arrayList, LongSparseArray longSparseArray, HashSet hashSet, Runnable runnable) throws Throwable {
        getMessagesController().putUsers(tL_messages_savedDialogs.users, false);
        getMessagesController().putChats(tL_messages_savedDialogs.chats, false);
        processTopics(j, arrayList, longSparseArray, false, 2, -1);
        long j2 = -j;
        getMessagesStorage().saveTopics(j2, (List) this.topicsByChatId.get(j), true, true, getConnectionsManager().getCurrentTime());
        getMessagesStorage().putMessages(tL_messages_savedDialogs.messages, false, true, false, 0, false, 0, 0L);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashSet.remove(Long.valueOf(DialogObject.getPeerDialogId(((TLRPC.TL_forumTopic) it.next()).from_id)));
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            long jLongValue = ((Long) it2.next()).longValue();
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

    public TLRPC.TL_forumTopic findTopic(long j, long j2) {
        LongSparseArray longSparseArray = (LongSparseArray) this.topicsMapByChatId.get(j);
        if (longSparseArray == null) {
            return null;
        }
        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) longSparseArray.get(j2);
        return (tL_forumTopic == null && getMessagesController().isMonoForum(-j)) ? (TLRPC.TL_forumTopic) longSparseArray.get(ForumUtilities.monoForumTopicIdToTopicId(j2)) : tL_forumTopic;
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
        if (i != 0 && (tL_forumTopicFindTopic = findTopic(chat.id, i)) != null) {
            return tL_forumTopicFindTopic.title;
        }
        return "";
    }

    public CharSequence getTopicIconName(TLRPC.Chat chat, MessageObject messageObject, TextPaint textPaint) {
        return getTopicIconName(chat, messageObject, textPaint, null);
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
        return ForumUtilities.getTopicSpannedName(tL_forumTopicFindTopic, textPaint, drawableArr, false);
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
            }
        }
        return countsTmp;
    }

    public void onTopicCreated(long j, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        long j2 = -j;
        LongSparseArray longSparseArray = (LongSparseArray) this.topicsMapByChatId.get(j2);
        if (findTopic(j2, tL_forumTopic.id) != null) {
            return;
        }
        if (longSparseArray == null) {
            longSparseArray = new LongSparseArray();
            this.topicsMapByChatId.put(j2, longSparseArray);
        }
        ArrayList arrayList = (ArrayList) this.topicsByChatId.get(j2);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.topicsByChatId.put(j2, arrayList);
        }
        longSparseArray.put(tL_forumTopic.id, tL_forumTopic);
        arrayList.add(tL_forumTopic);
        if (z) {
            getMessagesStorage().saveTopics(j, Collections.singletonList(tL_forumTopic), false, true, getConnectionsManager().getCurrentTime());
        }
        sortTopics(j2, true);
    }

    public void saveTopics(long j) throws Throwable {
        if (((ArrayList) this.topicsByChatId.get(j)) != null) {
            getMessagesStorage().saveTopics(-j, (List) this.topicsByChatId.get(j), true, true, getConnectionsManager().getCurrentTime());
        }
    }

    public void onTopicEdited(long j, TLRPC.TL_forumTopic tL_forumTopic) {
        getMessagesStorage().updateTopicData(j, tL_forumTopic, 35);
        sortTopics(-j);
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

    public void applyPinnedOrder(long j, ArrayList<Integer> arrayList) {
        applyPinnedOrder(j, arrayList, true);
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
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$applyPinnedOrder$17();
                }
            });
        }
    }

    public void lambda$applyPinnedOrder$17() {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_SELECT_DIALOG));
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
        getConnectionsManager().sendRequest(tL_channels_toggleViewForumAsMessages, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException {
                this.f$0.lambda$toggleViewForumAsMessages$18(tLObject, tL_error);
            }
        });
    }

    public void lambda$toggleViewForumAsMessages$18(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException {
        if (tLObject != null) {
            getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public void pinTopic(final long j, int i, boolean z, final BaseFragment baseFragment) {
        TL_forum.TL_messages_updatePinnedForumTopic tL_messages_updatePinnedForumTopic = new TL_forum.TL_messages_updatePinnedForumTopic();
        tL_messages_updatePinnedForumTopic.peer = getMessagesController().getInputPeer(-j);
        tL_messages_updatePinnedForumTopic.topic_id = i;
        tL_messages_updatePinnedForumTopic.pinned = z;
        final ArrayList<Integer> currentPinnedOrder = getCurrentPinnedOrder(j);
        ArrayList<Integer> arrayList = new ArrayList<>(currentPinnedOrder);
        arrayList.remove(Integer.valueOf(i));
        if (z) {
            arrayList.add(0, Integer.valueOf(i));
        }
        applyPinnedOrder(j, arrayList);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_updatePinnedForumTopic, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$pinTopic$20(baseFragment, j, currentPinnedOrder, tLObject, tL_error);
            }
        });
    }

    public void lambda$pinTopic$20(final BaseFragment baseFragment, long j, ArrayList arrayList, TLObject tLObject, TLRPC.TL_error tL_error) {
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
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$pinTopic$19(baseFragment);
                    }
                });
            }
        }
    }

    public void lambda$pinTopic$19(BaseFragment baseFragment) {
        baseFragment.showDialog(new AlertDialog.Builder(baseFragment.getContext()).setTitle(LocaleController.getString(R.string.LimitReached)).setMessage(LocaleController.formatString("LimitReachedPinnedTopics", R.string.LimitReachedPinnedTopics, Integer.valueOf(MessagesController.getInstance(this.currentAccount).topicsPinnedLimit))).setPositiveButton(LocaleController.getString(R.string.OK), null).create());
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

    public void updateMentionsUnread(final long j, final long j2, final int i) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$updateMentionsUnread$21(j, j2, i);
            }
        });
    }

    public void lambda$updateMentionsUnread$21(long j, long j2, int i) {
        long j3 = -j;
        TLRPC.TL_forumTopic tL_forumTopicFindTopic = findTopic(j3, j2);
        if (tL_forumTopicFindTopic != null) {
            tL_forumTopicFindTopic.unread_mentions_count = i;
            sortTopics(j3, true);
        }
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

    public void markAllReactionsAsRead(long j, long j2) {
        TLRPC.TL_forumTopic tL_forumTopicFindTopic = findTopic(j, j2);
        if (tL_forumTopicFindTopic == null || tL_forumTopicFindTopic.unread_reactions_count <= 0) {
            return;
        }
        tL_forumTopicFindTopic.unread_reactions_count = 0;
        sortTopics(j);
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

    public TopicsLoadOffset getLoadOffset(long j) {
        TopicsLoadOffset topicsLoadOffset = (TopicsLoadOffset) this.offsets.get(j);
        return topicsLoadOffset != null ? topicsLoadOffset : new TopicsLoadOffset();
    }

    public void saveLoadOffset(long j, int i, int i2, long j2) {
        TopicsLoadOffset topicsLoadOffset = new TopicsLoadOffset();
        topicsLoadOffset.lastMessageId = i;
        topicsLoadOffset.lastMessageDate = i2;
        topicsLoadOffset.lastTopicId = j2;
        this.offsets.put(j, topicsLoadOffset);
    }

    public void clearLoadingOffset(long j) {
        this.offsets.remove(j);
    }

    public boolean endIsReached(long j) {
        return this.endIsReached.get(j, 0) == 1;
    }

    public void processUpdate(final List<TopicUpdate> list) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$processUpdate$22(list);
            }
        });
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
                    longSparseArray.put(topicUpdate.dialogId, arrayList);
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
                        this.topicsByTopMsgId.put(messageHash(i4, -topicUpdate.dialogId), tL_forumTopicFindTopic);
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

    public boolean isLoading(long j) {
        if (this.topicsIsLoading.get(j, 0) == 1) {
            return this.topicsByChatId.get(j) == null || ((ArrayList) this.topicsByChatId.get(j)).isEmpty();
        }
        return false;
    }

    public void onTopicsDeletedServerSide(long j, long j2) {
        ArrayList<MessagesStorage.TopicKey> arrayList = new ArrayList<>(1);
        arrayList.add(MessagesStorage.TopicKey.of(-j, j2));
        onTopicsDeletedServerSide(arrayList);
    }

    public void onTopicsDeletedServerSide(final ArrayList<MessagesStorage.TopicKey> arrayList) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onTopicsDeletedServerSide$23(arrayList);
            }
        });
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
                int i2 = 0;
                while (true) {
                    if (i2 >= arrayList2.size()) {
                        break;
                    }
                    if ((getMessagesController().isMonoForum(topicKey.dialogId) ? DialogObject.getPeerDialogId(((TLRPC.TL_forumTopic) arrayList2.get(i2)).from_id) : ((TLRPC.TL_forumTopic) arrayList2.get(i2)).id) == topicKey.topicId) {
                        arrayList2.remove(i2);
                        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogDeleted, Long.valueOf(-j), Long.valueOf(topicKey.topicId));
                        hashSet.add(Long.valueOf(j));
                        break;
                    }
                    i2++;
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            sortTopics(((Long) it.next()).longValue(), true);
        }
    }

    public void reloadTopics(long j) {
        reloadTopics(j, true);
    }

    public void reloadTopics(final long j, final boolean z) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$reloadTopics$24(j, z);
            }
        });
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

    public void databaseCleared() {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$databaseCleared$25();
            }
        });
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

    public void updateReadOutbox(final HashMap<MessagesStorage.TopicKey, Integer> map) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$updateReadOutbox$26(map);
            }
        });
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

    public void processEditedMessage(TLRPC.Message message) {
        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.topicsByTopMsgId.get(messageHash(message.id, -message.dialog_id));
        if (tL_forumTopic != null) {
            tL_forumTopic.topMessage = message;
            sortTopics(-message.dialog_id, true);
        }
    }

    public void loadTopic(final long j, final long j2, final Runnable runnable) {
        getMessagesStorage().loadTopics(-j, new Consumer() {
            @Override
            public final void p(Object obj) {
                this.f$0.lambda$loadTopic$28(j, j2, runnable, (ArrayList) obj);
            }

            public Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public void lambda$loadTopic$28(final long j, final long j2, final Runnable runnable, final ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$loadTopic$27(j, arrayList, j2, runnable);
            }
        });
    }

    public void lambda$loadTopic$27(long j, ArrayList arrayList, long j2, Runnable runnable) {
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb = new StringBuilder();
            sb.append("loaded from cache ");
            sb.append(j);
            sb.append(" topics_count=");
            sb.append(arrayList == null ? 0 : arrayList.size());
            FileLog.d(sb.toString());
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

    private class TopicsLoadOffset {
        int lastMessageDate;
        int lastMessageId;
        long lastTopicId;

        private TopicsLoadOffset() {
        }
    }

    public void onTopicFragmentResume(long j) {
        this.openedTopicsByChatId.put(j, this.openedTopicsByChatId.get(j, 0) + 1);
        sortTopics(j);
    }

    public void onTopicFragmentPause(long j) {
        int i = this.openedTopicsByChatId.get(j, 0) - 1;
        this.openedTopicsByChatId.put(j, i >= 0 ? i : 0);
    }

    public void getTopicRepliesCount(final long j, final long j2) {
        TLRPC.TL_messages_getReplies tL_messages_getReplies;
        final TLRPC.TL_forumTopic tL_forumTopicFindTopic = findTopic(-j, j2);
        if (tL_forumTopicFindTopic == null || tL_forumTopicFindTopic.totalMessagesCount != 0) {
            return;
        }
        if (getMessagesController().isMonoForum(j)) {
            TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = new TLRPC.TL_messages_getSavedHistory();
            tL_messages_getSavedHistory.peer = getMessagesController().getInputPeer(j2);
            tL_messages_getSavedHistory.parent_peer = getMessagesController().getInputPeer(j);
            tL_messages_getSavedHistory.limit = 1;
            tL_messages_getReplies = tL_messages_getSavedHistory;
        } else {
            TLRPC.TL_messages_getReplies tL_messages_getReplies2 = new TLRPC.TL_messages_getReplies();
            tL_messages_getReplies2.peer = getMessagesController().getInputPeer(j);
            tL_messages_getReplies2.msg_id = (int) j2;
            tL_messages_getReplies2.limit = 1;
            tL_messages_getReplies = tL_messages_getReplies2;
        }
        getConnectionsManager().sendRequest(tL_messages_getReplies, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$getTopicRepliesCount$30(tL_forumTopicFindTopic, j, j2, tLObject, tL_error);
            }
        });
    }

    public void lambda$getTopicRepliesCount$30(final TLRPC.TL_forumTopic tL_forumTopic, final long j, final long j2, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$getTopicRepliesCount$29(tLObject, tL_forumTopic, j, j2);
            }
        });
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

    public int getTopicsCount(long j) {
        ArrayList<TLRPC.TL_forumTopic> topics;
        if (!endIsReached(j) || (topics = getTopics(j)) == null) {
            return 0;
        }
        return topics.size();
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
}
