package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.SparseArray;
import androidx.collection.LongSparseArray;
import j$.util.function.Consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$TL_channels_deleteTopicHistory;
import org.telegram.tgnet.TLRPC$TL_channels_editForumTopic;
import org.telegram.tgnet.TLRPC$TL_channels_getForumTopics;
import org.telegram.tgnet.TLRPC$TL_channels_getForumTopicsByID;
import org.telegram.tgnet.TLRPC$TL_channels_reorderPinnedForumTopics;
import org.telegram.tgnet.TLRPC$TL_channels_updatePinnedForumTopic;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_forumTopic;
import org.telegram.tgnet.TLRPC$TL_messageReplyHeader;
import org.telegram.tgnet.TLRPC$TL_messages_affectedHistory;
import org.telegram.tgnet.TLRPC$TL_messages_forumTopics;
import org.telegram.tgnet.TLRPC$TL_messages_getReplies;
import org.telegram.tgnet.TLRPC$messages_Messages;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.Forum.ForumUtilities;
public class TopicsController extends BaseController {
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
    LongSparseArray<TopicsLoadOffset> offsets;
    LongSparseIntArray openedTopicsBuChatId;
    LongSparseArray<ArrayList<TLRPC$TL_forumTopic>> topicsByChatId;
    LongSparseArray<TLRPC$TL_forumTopic> topicsByTopMsgId;
    LongSparseIntArray topicsIsLoading;
    LongSparseArray<LongSparseArray<TLRPC$TL_forumTopic>> topicsMapByChatId;

    public static class TopicUpdate {
        long dialogId;
        ArrayList<MessageObject> groupedMessages;
        boolean onlyCounters;
        boolean reloadTopic;
        TLRPC$Message topMessage;
        int topMessageId;
        int topicId;
        public int totalMessagesCount = -1;
        int unreadCount;
        int unreadMentions;
    }

    public static void lambda$toggleShowTopic$14(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    private long messageHash(int i, long j) {
        return j + (i << 12);
    }

    public TopicsController(int i) {
        super(i);
        this.topicsByChatId = new LongSparseArray<>();
        this.topicsMapByChatId = new LongSparseArray<>();
        this.topicsIsLoading = new LongSparseIntArray();
        this.endIsReached = new LongSparseIntArray();
        this.topicsByTopMsgId = new LongSparseArray<>();
        this.currentOpenTopicsCounter = new LongSparseIntArray();
        this.openedTopicsBuChatId = new LongSparseIntArray();
        this.offsets = new LongSparseArray<>();
    }

    public void preloadTopics(long j) {
        loadTopics(j, true, 0);
    }

    public void loadTopics(long j) {
        loadTopics(j, false, 1);
    }

    public void loadTopics(final long j, final boolean z, final int i) {
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
                public final void accept(Object obj) {
                    TopicsController.this.lambda$loadTopics$1(j, z, i, (ArrayList) obj);
                }

                @Override
                public Consumer andThen(Consumer consumer) {
                    return Objects.requireNonNull(consumer);
                }
            });
            return;
        }
        TLRPC$TL_channels_getForumTopics tLRPC$TL_channels_getForumTopics = new TLRPC$TL_channels_getForumTopics();
        tLRPC$TL_channels_getForumTopics.channel = getMessagesController().getInputChannel(j);
        if (i == 0) {
            tLRPC$TL_channels_getForumTopics.limit = 20;
        } else if (i == 1) {
            tLRPC$TL_channels_getForumTopics.limit = 100;
            TopicsLoadOffset loadOffset = getLoadOffset(j);
            tLRPC$TL_channels_getForumTopics.offset_date = loadOffset.lastMessageDate;
            tLRPC$TL_channels_getForumTopics.offset_id = loadOffset.lastMessageId;
            tLRPC$TL_channels_getForumTopics.offset_topic = loadOffset.lastTopicId;
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("offset_date=" + loadOffset.lastMessageDate + " offset_id=" + loadOffset.lastMessageId + " offset_topic=" + loadOffset.lastTopicId);
            }
        }
        getConnectionsManager().sendRequest(tLRPC$TL_channels_getForumTopics, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                TopicsController.this.lambda$loadTopics$4(j, i, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadTopics$1(final long j, final boolean z, final int i, final ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TopicsController.this.lambda$loadTopics$0(j, arrayList, z, i);
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

    public void lambda$loadTopics$4(final long j, final int i, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            final SparseArray sparseArray = new SparseArray();
            final TLRPC$TL_messages_forumTopics tLRPC$TL_messages_forumTopics = (TLRPC$TL_messages_forumTopics) tLObject;
            for (int i2 = 0; i2 < tLRPC$TL_messages_forumTopics.messages.size(); i2++) {
                sparseArray.put(tLRPC$TL_messages_forumTopics.messages.get(i2).id, tLRPC$TL_messages_forumTopics.messages.get(i2));
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    TopicsController.this.lambda$loadTopics$2(tLObject, j, tLRPC$TL_messages_forumTopics, sparseArray, i);
                }
            });
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TopicsController.this.lambda$loadTopics$3(j);
            }
        });
    }

    public void lambda$loadTopics$2(TLObject tLObject, long j, TLRPC$TL_messages_forumTopics tLRPC$TL_messages_forumTopics, SparseArray sparseArray, int i) {
        TLRPC$TL_messages_forumTopics tLRPC$TL_messages_forumTopics2 = (TLRPC$TL_messages_forumTopics) tLObject;
        getMessagesStorage().putUsersAndChats(tLRPC$TL_messages_forumTopics2.users, tLRPC$TL_messages_forumTopics2.chats, true, true);
        getMessagesController().putUsers(tLRPC$TL_messages_forumTopics2.users, false);
        getMessagesController().putChats(tLRPC$TL_messages_forumTopics2.chats, false);
        this.topicsIsLoading.put(j, 0);
        processTopics(j, tLRPC$TL_messages_forumTopics.topics, sparseArray, false, i, tLRPC$TL_messages_forumTopics2.count);
        getMessagesStorage().putMessages(tLRPC$TL_messages_forumTopics.messages, false, true, false, 0, false, 0);
        sortTopics(j);
        getMessagesStorage().saveTopics(-j, this.topicsByChatId.get(j), true, true);
        if (!tLRPC$TL_messages_forumTopics.topics.isEmpty() && i == 1) {
            ArrayList<TLRPC$TL_forumTopic> arrayList = tLRPC$TL_messages_forumTopics.topics;
            TLRPC$TL_forumTopic tLRPC$TL_forumTopic = arrayList.get(arrayList.size() - 1);
            TLRPC$Message tLRPC$Message = (TLRPC$Message) sparseArray.get(tLRPC$TL_forumTopic.top_message);
            saveLoadOffset(j, tLRPC$TL_forumTopic.top_message, tLRPC$Message == null ? 0 : tLRPC$Message.date, tLRPC$TL_forumTopic.id);
        } else if (getTopics(j) == null || getTopics(j).size() < tLRPC$TL_messages_forumTopics.count) {
            clearLoadingOffset(j);
            loadTopics(j);
        }
    }

    public void lambda$loadTopics$3(long j) {
        this.topicsIsLoading.put(j, 0);
        getNotificationCenter().postNotificationName(NotificationCenter.topicsDidLoaded, Long.valueOf(j), Boolean.FALSE);
    }

    public void processTopics(final long r18, java.util.ArrayList<org.telegram.tgnet.TLRPC$TL_forumTopic> r20, android.util.SparseArray<org.telegram.tgnet.TLRPC$Message> r21, boolean r22, int r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.TopicsController.processTopics(long, java.util.ArrayList, android.util.SparseArray, boolean, int, int):void");
    }

    public void lambda$processTopics$5(long j) {
        loadTopics(j, false, 0);
    }

    public ArrayList<TLRPC$TL_forumTopic> getTopics(long j) {
        return this.topicsByChatId.get(j);
    }

    private void sortTopics(long j) {
        sortTopics(j, true);
    }

    public void sortTopics(long j, boolean z) {
        ArrayList<TLRPC$TL_forumTopic> arrayList = this.topicsByChatId.get(j);
        if (arrayList != null) {
            if (this.openedTopicsBuChatId.get(j, 0) > 0) {
                Collections.sort(arrayList, TopicsController$$ExternalSyntheticLambda19.INSTANCE);
            }
            if (z) {
                getNotificationCenter().postNotificationName(NotificationCenter.topicsDidLoaded, Long.valueOf(j), Boolean.TRUE);
            }
        }
    }

    public static int lambda$sortTopics$6(TLRPC$TL_forumTopic tLRPC$TL_forumTopic, TLRPC$TL_forumTopic tLRPC$TL_forumTopic2) {
        boolean z = tLRPC$TL_forumTopic.hidden;
        if (z != tLRPC$TL_forumTopic2.hidden) {
            return z ? -1 : 1;
        }
        boolean z2 = tLRPC$TL_forumTopic.pinned;
        boolean z3 = tLRPC$TL_forumTopic2.pinned;
        if (z2 != z3) {
            return z2 ? -1 : 1;
        } else if (z2 && z3) {
            return tLRPC$TL_forumTopic.pinnedOrder - tLRPC$TL_forumTopic2.pinnedOrder;
        } else {
            TLRPC$Message tLRPC$Message = tLRPC$TL_forumTopic2.topMessage;
            int i = tLRPC$Message != null ? tLRPC$Message.date : 0;
            TLRPC$Message tLRPC$Message2 = tLRPC$TL_forumTopic.topMessage;
            return i - (tLRPC$Message2 != null ? tLRPC$Message2.date : 0);
        }
    }

    public void updateTopicsWithDeletedMessages(final long j, final ArrayList<Integer> arrayList) {
        if (j > 0) {
            return;
        }
        final long j2 = -j;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TopicsController.this.lambda$updateTopicsWithDeletedMessages$9(j, arrayList, j2);
            }
        });
    }

    public void lambda$updateTopicsWithDeletedMessages$9(final long j, final ArrayList arrayList, final long j2) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                TopicsController.this.lambda$updateTopicsWithDeletedMessages$8(j, arrayList, j2);
            }
        });
    }

    public void lambda$updateTopicsWithDeletedMessages$8(long r16, java.util.ArrayList r18, final long r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.TopicsController.lambda$updateTopicsWithDeletedMessages$8(long, java.util.ArrayList, long):void");
    }

    public void lambda$updateTopicsWithDeletedMessages$7(ArrayList arrayList, long j) {
        ArrayList<TLRPC$TL_forumTopic> arrayList2 = null;
        boolean z = false;
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC$TL_forumTopic tLRPC$TL_forumTopic = (TLRPC$TL_forumTopic) arrayList.get(i);
            LongSparseArray<TLRPC$TL_forumTopic> longSparseArray = this.topicsMapByChatId.get(j);
            if (longSparseArray != null) {
                TLRPC$TL_forumTopic tLRPC$TL_forumTopic2 = longSparseArray.get(tLRPC$TL_forumTopic.id);
                if (tLRPC$TL_forumTopic2 != null && tLRPC$TL_forumTopic.top_message != -1 && tLRPC$TL_forumTopic.topMessage != null) {
                    this.topicsByTopMsgId.remove(messageHash(tLRPC$TL_forumTopic2.top_message, j));
                    TLRPC$Message tLRPC$Message = tLRPC$TL_forumTopic.topMessage;
                    int i2 = tLRPC$Message.id;
                    tLRPC$TL_forumTopic2.top_message = i2;
                    tLRPC$TL_forumTopic2.topMessage = tLRPC$Message;
                    tLRPC$TL_forumTopic2.groupedMessages = tLRPC$TL_forumTopic.groupedMessages;
                    this.topicsByTopMsgId.put(messageHash(i2, j), tLRPC$TL_forumTopic2);
                    z = true;
                } else if (tLRPC$TL_forumTopic.top_message == -1 || tLRPC$TL_forumTopic.topMessage == null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    arrayList2.add(tLRPC$TL_forumTopic);
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

    public void reloadTopics(final long j, ArrayList<TLRPC$TL_forumTopic> arrayList, final Runnable runnable) {
        TLRPC$TL_channels_getForumTopicsByID tLRPC$TL_channels_getForumTopicsByID = new TLRPC$TL_channels_getForumTopicsByID();
        for (int i = 0; i < arrayList.size(); i++) {
            tLRPC$TL_channels_getForumTopicsByID.topics.add(Integer.valueOf(arrayList.get(i).id));
        }
        tLRPC$TL_channels_getForumTopicsByID.channel = getMessagesController().getInputChannel(j);
        getConnectionsManager().sendRequest(tLRPC$TL_channels_getForumTopicsByID, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                TopicsController.this.lambda$reloadTopics$12(j, runnable, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$reloadTopics$12(final long j, final Runnable runnable, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TopicsController.this.lambda$reloadTopics$11(tLObject, j, runnable);
            }
        });
    }

    public void lambda$reloadTopics$11(final TLObject tLObject, final long j, final Runnable runnable) {
        if (tLObject != null) {
            final SparseArray sparseArray = new SparseArray();
            final TLRPC$TL_messages_forumTopics tLRPC$TL_messages_forumTopics = (TLRPC$TL_messages_forumTopics) tLObject;
            for (int i = 0; i < tLRPC$TL_messages_forumTopics.messages.size(); i++) {
                sparseArray.put(tLRPC$TL_messages_forumTopics.messages.get(i).id, tLRPC$TL_messages_forumTopics.messages.get(i));
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    TopicsController.this.lambda$reloadTopics$10(tLObject, j, tLRPC$TL_messages_forumTopics, sparseArray, runnable);
                }
            });
        }
    }

    public void lambda$reloadTopics$10(TLObject tLObject, long j, TLRPC$TL_messages_forumTopics tLRPC$TL_messages_forumTopics, SparseArray sparseArray, Runnable runnable) {
        TLRPC$TL_messages_forumTopics tLRPC$TL_messages_forumTopics2 = (TLRPC$TL_messages_forumTopics) tLObject;
        getMessagesController().putUsers(tLRPC$TL_messages_forumTopics2.users, false);
        getMessagesController().putChats(tLRPC$TL_messages_forumTopics2.chats, false);
        processTopics(j, tLRPC$TL_messages_forumTopics.topics, sparseArray, false, 2, -1);
        getMessagesStorage().putMessages(tLRPC$TL_messages_forumTopics.messages, false, true, false, 0, false, 0);
        getMessagesStorage().saveTopics(-j, this.topicsByChatId.get(j), true, true);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void updateMaxReadId(long j, int i, int i2, int i3, int i4) {
        TLRPC$TL_forumTopic findTopic = findTopic(j, i);
        if (findTopic != null) {
            findTopic.read_inbox_max_id = i2;
            findTopic.unread_count = i3;
            if (i4 >= 0) {
                findTopic.unread_mentions_count = i4;
            }
            sortTopics(j);
        }
    }

    public TLRPC$TL_forumTopic findTopic(long j, int i) {
        LongSparseArray<TLRPC$TL_forumTopic> longSparseArray = this.topicsMapByChatId.get(j);
        if (longSparseArray != null) {
            return longSparseArray.get(i);
        }
        return null;
    }

    public String getTopicName(TLRPC$Chat tLRPC$Chat, MessageObject messageObject) {
        TLRPC$TL_forumTopic findTopic;
        TLRPC$TL_messageReplyHeader tLRPC$TL_messageReplyHeader = messageObject.messageOwner.reply_to;
        if (tLRPC$TL_messageReplyHeader == null) {
            return null;
        }
        int i = tLRPC$TL_messageReplyHeader.reply_to_top_id;
        if (i == 0) {
            i = tLRPC$TL_messageReplyHeader.reply_to_msg_id;
        }
        return (i == 0 || (findTopic = findTopic(tLRPC$Chat.id, i)) == null) ? "" : findTopic.title;
    }

    public CharSequence getTopicIconName(TLRPC$Chat tLRPC$Chat, MessageObject messageObject, TextPaint textPaint) {
        return getTopicIconName(tLRPC$Chat, messageObject, textPaint, null);
    }

    public CharSequence getTopicIconName(TLRPC$Chat tLRPC$Chat, MessageObject messageObject, TextPaint textPaint, Drawable[] drawableArr) {
        TLRPC$TL_forumTopic findTopic;
        TLRPC$TL_messageReplyHeader tLRPC$TL_messageReplyHeader = messageObject.messageOwner.reply_to;
        if (tLRPC$TL_messageReplyHeader == null) {
            return null;
        }
        int i = tLRPC$TL_messageReplyHeader.reply_to_top_id;
        if (i == 0) {
            i = tLRPC$TL_messageReplyHeader.reply_to_msg_id;
        }
        if (i == 0 || (findTopic = findTopic(tLRPC$Chat.id, i)) == null) {
            return null;
        }
        return ForumUtilities.getTopicSpannedName(findTopic, textPaint, drawableArr);
    }

    public int[] getForumUnreadCount(long j) {
        ArrayList<TLRPC$TL_forumTopic> arrayList = this.topicsByChatId.get(j);
        Arrays.fill(countsTmp, 0);
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC$TL_forumTopic tLRPC$TL_forumTopic = arrayList.get(i);
                int[] iArr = countsTmp;
                iArr[0] = iArr[0] + (tLRPC$TL_forumTopic.unread_count > 0 ? 1 : 0);
                iArr[1] = iArr[1] + (tLRPC$TL_forumTopic.unread_mentions_count > 0 ? 1 : 0);
                iArr[2] = iArr[2] + (tLRPC$TL_forumTopic.unread_reactions_count <= 0 ? 0 : 1);
                if (!getMessagesController().isDialogMuted(-j, tLRPC$TL_forumTopic.id)) {
                    iArr[3] = iArr[3] + tLRPC$TL_forumTopic.unread_count;
                }
            }
        }
        return countsTmp;
    }

    public void onTopicCreated(long j, TLRPC$TL_forumTopic tLRPC$TL_forumTopic, boolean z) {
        long j2 = -j;
        LongSparseArray<TLRPC$TL_forumTopic> longSparseArray = this.topicsMapByChatId.get(j2);
        if (findTopic(j2, tLRPC$TL_forumTopic.id) != null) {
            return;
        }
        if (longSparseArray == null) {
            longSparseArray = new LongSparseArray<>();
            this.topicsMapByChatId.put(j2, longSparseArray);
        }
        ArrayList<TLRPC$TL_forumTopic> arrayList = this.topicsByChatId.get(j2);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.topicsByChatId.put(j2, arrayList);
        }
        longSparseArray.put(tLRPC$TL_forumTopic.id, tLRPC$TL_forumTopic);
        arrayList.add(tLRPC$TL_forumTopic);
        if (z) {
            getMessagesStorage().saveTopics(j, Collections.singletonList(tLRPC$TL_forumTopic), false, true);
        }
        sortTopics(j2, true);
    }

    public void onTopicEdited(long j, TLRPC$TL_forumTopic tLRPC$TL_forumTopic) {
        getMessagesStorage().updateTopicData(j, tLRPC$TL_forumTopic, 35);
        sortTopics(-j);
    }

    public void deleteTopics(long j, ArrayList<Integer> arrayList) {
        ArrayList<TLRPC$TL_forumTopic> arrayList2 = this.topicsByChatId.get(j);
        LongSparseArray<TLRPC$TL_forumTopic> longSparseArray = this.topicsMapByChatId.get(j);
        if (longSparseArray != null && arrayList2 != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                long intValue = arrayList.get(i).intValue();
                TLRPC$TL_forumTopic tLRPC$TL_forumTopic = longSparseArray.get(intValue);
                longSparseArray.remove(intValue);
                if (tLRPC$TL_forumTopic != null) {
                    this.topicsByTopMsgId.remove(messageHash(tLRPC$TL_forumTopic.top_message, j));
                    arrayList2.remove(tLRPC$TL_forumTopic);
                }
            }
            sortTopics(j);
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            deleteTopic(j, arrayList.get(i2).intValue(), 0);
        }
    }

    public void deleteTopic(final long j, final int i, int i2) {
        TLRPC$TL_channels_deleteTopicHistory tLRPC$TL_channels_deleteTopicHistory = new TLRPC$TL_channels_deleteTopicHistory();
        tLRPC$TL_channels_deleteTopicHistory.channel = getMessagesController().getInputChannel(j);
        tLRPC$TL_channels_deleteTopicHistory.top_msg_id = i;
        if (i2 == 0) {
            getMessagesStorage().removeTopic(-j, i);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_channels_deleteTopicHistory, new RequestDelegate() {
            @Override
            public void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                if (tLRPC$TL_error == null) {
                    TLRPC$TL_messages_affectedHistory tLRPC$TL_messages_affectedHistory = (TLRPC$TL_messages_affectedHistory) tLObject;
                    TopicsController.this.getMessagesController().processNewChannelDifferenceParams(tLRPC$TL_messages_affectedHistory.pts, tLRPC$TL_messages_affectedHistory.pts_count, j);
                    int i3 = tLRPC$TL_messages_affectedHistory.offset;
                    if (i3 > 0) {
                        TopicsController.this.deleteTopic(j, i, i3);
                    }
                }
            }
        });
    }

    public void toggleCloseTopic(long j, int i, boolean z) {
        TLRPC$TL_forumTopic tLRPC$TL_forumTopic;
        TLRPC$TL_channels_editForumTopic tLRPC$TL_channels_editForumTopic = new TLRPC$TL_channels_editForumTopic();
        tLRPC$TL_channels_editForumTopic.channel = getMessagesController().getInputChannel(j);
        tLRPC$TL_channels_editForumTopic.topic_id = i;
        tLRPC$TL_channels_editForumTopic.flags |= 4;
        tLRPC$TL_channels_editForumTopic.closed = z;
        LongSparseArray<TLRPC$TL_forumTopic> longSparseArray = this.topicsMapByChatId.get(j);
        if (longSparseArray != null && (tLRPC$TL_forumTopic = longSparseArray.get(i)) != null) {
            tLRPC$TL_forumTopic.closed = z;
            getMessagesStorage().updateTopicData(-j, tLRPC$TL_forumTopic, 8);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_channels_editForumTopic, new RequestDelegate() {
            @Override
            public void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            }
        });
    }

    public ArrayList<Integer> getCurrentPinnedOrder(long j) {
        ArrayList<TLRPC$TL_forumTopic> topics = getTopics(j);
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (topics != null) {
            for (int i = 0; i < topics.size(); i++) {
                TLRPC$TL_forumTopic tLRPC$TL_forumTopic = topics.get(i);
                if (tLRPC$TL_forumTopic != null && tLRPC$TL_forumTopic.pinned) {
                    arrayList.add(Integer.valueOf(tLRPC$TL_forumTopic.id));
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
        ArrayList<TLRPC$TL_forumTopic> topics = getTopics(j);
        boolean z2 = true;
        if (topics != null) {
            boolean z3 = false;
            for (int i = 0; i < topics.size(); i++) {
                TLRPC$TL_forumTopic tLRPC$TL_forumTopic = topics.get(i);
                if (tLRPC$TL_forumTopic != null) {
                    int indexOf = arrayList.indexOf(Integer.valueOf(tLRPC$TL_forumTopic.id));
                    boolean z4 = indexOf >= 0;
                    if (tLRPC$TL_forumTopic.pinned != z4 || (z4 && tLRPC$TL_forumTopic.pinnedOrder != indexOf)) {
                        tLRPC$TL_forumTopic.pinned = z4;
                        tLRPC$TL_forumTopic.pinnedOrder = indexOf;
                        getMessagesStorage().updateTopicData(j, tLRPC$TL_forumTopic, 4);
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
                    TopicsController.this.lambda$applyPinnedOrder$13();
                }
            });
        }
    }

    public void lambda$applyPinnedOrder$13() {
        NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_SELECT_DIALOG));
    }

    public void toggleShowTopic(long j, int i, boolean z) {
        TLRPC$TL_channels_editForumTopic tLRPC$TL_channels_editForumTopic = new TLRPC$TL_channels_editForumTopic();
        tLRPC$TL_channels_editForumTopic.channel = getMessagesController().getInputChannel(j);
        tLRPC$TL_channels_editForumTopic.topic_id = i;
        tLRPC$TL_channels_editForumTopic.flags = 8;
        tLRPC$TL_channels_editForumTopic.hidden = !z;
        TLRPC$TL_forumTopic findTopic = findTopic(j, i);
        if (findTopic != null) {
            boolean z2 = tLRPC$TL_channels_editForumTopic.hidden;
            findTopic.hidden = z2;
            if (z2) {
                findTopic.closed = true;
            }
            long j2 = -j;
            updateTopicInUi(j2, findTopic, 44);
            getMessagesStorage().updateTopicData(j2, findTopic, 44);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_channels_editForumTopic, TopicsController$$ExternalSyntheticLambda26.INSTANCE);
    }

    public void pinTopic(final long j, int i, boolean z, final BaseFragment baseFragment) {
        TLRPC$TL_channels_updatePinnedForumTopic tLRPC$TL_channels_updatePinnedForumTopic = new TLRPC$TL_channels_updatePinnedForumTopic();
        tLRPC$TL_channels_updatePinnedForumTopic.channel = getMessagesController().getInputChannel(j);
        tLRPC$TL_channels_updatePinnedForumTopic.topic_id = i;
        tLRPC$TL_channels_updatePinnedForumTopic.pinned = z;
        final ArrayList<Integer> currentPinnedOrder = getCurrentPinnedOrder(j);
        ArrayList<Integer> arrayList = new ArrayList<>(currentPinnedOrder);
        arrayList.remove(Integer.valueOf(i));
        if (z) {
            arrayList.add(0, Integer.valueOf(i));
        }
        applyPinnedOrder(j, arrayList);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_channels_updatePinnedForumTopic, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                TopicsController.this.lambda$pinTopic$16(baseFragment, j, currentPinnedOrder, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$pinTopic$16(final BaseFragment baseFragment, long j, ArrayList arrayList, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null) {
            if (!"PINNED_TOO_MUCH".equals(tLRPC$TL_error.text)) {
                if ("PINNED_TOPIC_NOT_MODIFIED".equals(tLRPC$TL_error.text)) {
                    reloadTopics(j, false);
                }
            } else if (baseFragment == null) {
            } else {
                applyPinnedOrder(j, arrayList);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        TopicsController.this.lambda$pinTopic$15(baseFragment);
                    }
                });
            }
        }
    }

    public void lambda$pinTopic$15(BaseFragment baseFragment) {
        baseFragment.showDialog(new AlertDialog.Builder(baseFragment.getContext()).setTitle(LocaleController.getString("LimitReached", R.string.LimitReached)).setMessage(LocaleController.formatString("LimitReachedPinnedTopics", R.string.LimitReachedPinnedTopics, Integer.valueOf(MessagesController.getInstance(this.currentAccount).topicsPinnedLimit))).setPositiveButton(LocaleController.getString("OK", R.string.OK), null).create());
    }

    public void reorderPinnedTopics(long j, ArrayList<Integer> arrayList) {
        TLRPC$TL_channels_reorderPinnedForumTopics tLRPC$TL_channels_reorderPinnedForumTopics = new TLRPC$TL_channels_reorderPinnedForumTopics();
        tLRPC$TL_channels_reorderPinnedForumTopics.channel = getMessagesController().getInputChannel(j);
        if (arrayList != null) {
            tLRPC$TL_channels_reorderPinnedForumTopics.order.addAll(arrayList);
        }
        tLRPC$TL_channels_reorderPinnedForumTopics.force = true;
        applyPinnedOrder(j, arrayList, false);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_channels_reorderPinnedForumTopics, null);
    }

    public void updateMentionsUnread(final long j, final int i, final int i2) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TopicsController.this.lambda$updateMentionsUnread$17(j, i, i2);
            }
        });
    }

    public void lambda$updateMentionsUnread$17(long j, int i, int i2) {
        long j2 = -j;
        TLRPC$TL_forumTopic findTopic = findTopic(j2, i);
        if (findTopic != null) {
            findTopic.unread_mentions_count = i2;
            sortTopics(j2, true);
        }
    }

    public int updateReactionsUnread(long j, int i, int i2, boolean z) {
        long j2 = -j;
        TLRPC$TL_forumTopic findTopic = findTopic(j2, i);
        if (findTopic != null) {
            if (z) {
                int i3 = findTopic.unread_reactions_count + i2;
                findTopic.unread_reactions_count = i3;
                if (i3 < 0) {
                    findTopic.unread_reactions_count = 0;
                }
            } else {
                findTopic.unread_reactions_count = i2;
            }
            int i4 = findTopic.unread_reactions_count;
            sortTopics(j2, true);
            return i4;
        }
        return -1;
    }

    public void markAllReactionsAsRead(long j, int i) {
        TLRPC$TL_forumTopic findTopic = findTopic(j, i);
        if (findTopic == null || findTopic.unread_reactions_count <= 0) {
            return;
        }
        findTopic.unread_reactions_count = 0;
        sortTopics(j);
    }

    public TopicsLoadOffset getLoadOffset(long j) {
        TopicsLoadOffset topicsLoadOffset = this.offsets.get(j);
        return topicsLoadOffset != null ? topicsLoadOffset : new TopicsLoadOffset();
    }

    public void saveLoadOffset(long j, int i, int i2, int i3) {
        TopicsLoadOffset topicsLoadOffset = new TopicsLoadOffset();
        topicsLoadOffset.lastMessageId = i;
        topicsLoadOffset.lastMessageDate = i2;
        topicsLoadOffset.lastTopicId = i3;
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
                TopicsController.this.lambda$processUpdate$18(list);
            }
        });
    }

    public void lambda$processUpdate$18(List list) {
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
                TLRPC$TL_forumTopic tLRPC$TL_forumTopic = new TLRPC$TL_forumTopic();
                tLRPC$TL_forumTopic.id = topicUpdate.topicId;
                arrayList.add(tLRPC$TL_forumTopic);
            } else {
                TLRPC$TL_forumTopic findTopic = findTopic(-topicUpdate.dialogId, topicUpdate.topicId);
                if (findTopic != null) {
                    if (topicUpdate.onlyCounters) {
                        int i2 = topicUpdate.unreadCount;
                        if (i2 >= 0) {
                            findTopic.unread_count = i2;
                        }
                        int i3 = topicUpdate.unreadMentions;
                        if (i3 >= 0) {
                            findTopic.unread_mentions_count = i3;
                        }
                    } else {
                        this.topicsByTopMsgId.remove(messageHash(findTopic.top_message, -topicUpdate.dialogId));
                        findTopic.topMessage = topicUpdate.topMessage;
                        findTopic.groupedMessages = topicUpdate.groupedMessages;
                        int i4 = topicUpdate.topMessageId;
                        findTopic.top_message = i4;
                        findTopic.unread_count = topicUpdate.unreadCount;
                        findTopic.unread_mentions_count = topicUpdate.unreadMentions;
                        this.topicsByTopMsgId.put(messageHash(i4, -topicUpdate.dialogId), findTopic);
                    }
                    int i5 = topicUpdate.totalMessagesCount;
                    if (i5 > 0) {
                        findTopic.totalMessagesCount = i5;
                    }
                    hashSet.add(Long.valueOf(-topicUpdate.dialogId));
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
            return this.topicsByChatId.get(j) == null || this.topicsByChatId.get(j).isEmpty();
        }
        return false;
    }

    public void onTopicsDeletedServerSide(final ArrayList<MessagesStorage.TopicKey> arrayList) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TopicsController.this.lambda$onTopicsDeletedServerSide$19(arrayList);
            }
        });
    }

    public void lambda$onTopicsDeletedServerSide$19(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < arrayList.size(); i++) {
            MessagesStorage.TopicKey topicKey = (MessagesStorage.TopicKey) arrayList.get(i);
            long j = -topicKey.dialogId;
            LongSparseArray<TLRPC$TL_forumTopic> longSparseArray = this.topicsMapByChatId.get(j);
            if (longSparseArray != null) {
                longSparseArray.remove(topicKey.topicId);
            }
            ArrayList<TLRPC$TL_forumTopic> arrayList2 = this.topicsByChatId.get(j);
            if (arrayList2 != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= arrayList2.size()) {
                        break;
                    } else if (arrayList2.get(i2).id == topicKey.topicId) {
                        arrayList2.remove(i2);
                        getNotificationCenter().postNotificationName(NotificationCenter.dialogDeleted, Long.valueOf(-j), Integer.valueOf(topicKey.topicId));
                        hashSet.add(Long.valueOf(j));
                        break;
                    } else {
                        i2++;
                    }
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
                TopicsController.this.lambda$reloadTopics$20(j, z);
            }
        });
    }

    public void lambda$reloadTopics$20(long j, boolean z) {
        SharedPreferences.Editor edit = getUserConfig().getPreferences().edit();
        edit.remove("topics_end_reached_" + j).apply();
        this.topicsByChatId.remove(j);
        this.topicsMapByChatId.remove(j);
        this.endIsReached.delete(j);
        clearLoadingOffset(j);
        TLRPC$Chat chat = getMessagesController().getChat(Long.valueOf(j));
        if (chat != null && chat.forum) {
            loadTopics(j, z, 0);
        }
        sortTopics(j);
    }

    public void databaseCleared() {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TopicsController.this.lambda$databaseCleared$21();
            }
        });
    }

    public void lambda$databaseCleared$21() {
        this.topicsByChatId.clear();
        this.topicsMapByChatId.clear();
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

    public void updateReadOutbox(final HashMap<MessagesStorage.TopicKey, Integer> hashMap) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TopicsController.this.lambda$updateReadOutbox$22(hashMap);
            }
        });
    }

    public void lambda$updateReadOutbox$22(HashMap hashMap) {
        HashSet hashSet = new HashSet();
        for (MessagesStorage.TopicKey topicKey : hashMap.keySet()) {
            int intValue = ((Integer) hashMap.get(topicKey)).intValue();
            TLRPC$TL_forumTopic findTopic = findTopic(-topicKey.dialogId, topicKey.topicId);
            if (findTopic != null) {
                findTopic.read_outbox_max_id = Math.max(findTopic.read_outbox_max_id, intValue);
                hashSet.add(Long.valueOf(-topicKey.dialogId));
                TLRPC$Message tLRPC$Message = findTopic.topMessage;
                if (tLRPC$Message != null && findTopic.read_outbox_max_id >= tLRPC$Message.id) {
                    tLRPC$Message.unread = false;
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.topicsDidLoaded, (Long) it.next(), Boolean.TRUE);
        }
    }

    public void updateTopicInUi(long j, TLRPC$TL_forumTopic tLRPC$TL_forumTopic, int i) {
        long j2 = -j;
        TLRPC$TL_forumTopic findTopic = findTopic(j2, tLRPC$TL_forumTopic.id);
        if (findTopic != null) {
            if ((i & 1) != 0) {
                findTopic.title = tLRPC$TL_forumTopic.title;
            }
            if ((i & 2) != 0) {
                findTopic.icon_emoji_id = tLRPC$TL_forumTopic.icon_emoji_id;
            }
            if ((i & 8) != 0) {
                findTopic.closed = tLRPC$TL_forumTopic.closed;
            }
            if ((i & 4) != 0) {
                findTopic.pinned = tLRPC$TL_forumTopic.pinned;
            }
            if ((i & 32) != 0) {
                findTopic.hidden = tLRPC$TL_forumTopic.hidden;
            }
            sortTopics(j2);
        }
    }

    public void processEditedMessages(LongSparseArray<ArrayList<MessageObject>> longSparseArray) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < longSparseArray.size(); i++) {
            ArrayList<MessageObject> valueAt = longSparseArray.valueAt(i);
            for (int i2 = 0; i2 < valueAt.size(); i2++) {
                TLRPC$TL_forumTopic tLRPC$TL_forumTopic = this.topicsByTopMsgId.get(messageHash(valueAt.get(i2).getId(), -valueAt.get(i2).getDialogId()));
                if (tLRPC$TL_forumTopic != null) {
                    tLRPC$TL_forumTopic.topMessage = valueAt.get(i2).messageOwner;
                    hashSet.add(Long.valueOf(-valueAt.get(i2).getDialogId()));
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            sortTopics(((Long) it.next()).longValue(), true);
        }
    }

    public void processEditedMessage(TLRPC$Message tLRPC$Message) {
        TLRPC$TL_forumTopic tLRPC$TL_forumTopic = this.topicsByTopMsgId.get(messageHash(tLRPC$Message.id, -tLRPC$Message.dialog_id));
        if (tLRPC$TL_forumTopic != null) {
            tLRPC$TL_forumTopic.topMessage = tLRPC$Message;
            sortTopics(-tLRPC$Message.dialog_id, true);
        }
    }

    public void loadTopic(final long j, final int i, final Runnable runnable) {
        getMessagesStorage().loadTopics(-j, new Consumer() {
            @Override
            public final void accept(Object obj) {
                TopicsController.this.lambda$loadTopic$24(j, i, runnable, (ArrayList) obj);
            }

            @Override
            public Consumer andThen(Consumer consumer) {
                return Objects.requireNonNull(consumer);
            }
        });
    }

    public void lambda$loadTopic$24(final long j, final int i, final Runnable runnable, final ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TopicsController.this.lambda$loadTopic$23(j, arrayList, i, runnable);
            }
        });
    }

    public void lambda$loadTopic$23(long j, ArrayList arrayList, int i, Runnable runnable) {
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
        if (findTopic(j, i) != null) {
            runnable.run();
            return;
        }
        ArrayList<TLRPC$TL_forumTopic> arrayList2 = new ArrayList<>();
        new TLRPC$TL_forumTopic().id = i;
        reloadTopics(j, arrayList2, runnable);
    }

    public class TopicsLoadOffset {
        int lastMessageDate;
        int lastMessageId;
        int lastTopicId;

        private TopicsLoadOffset() {
        }
    }

    public void onTopicFragmentResume(long j) {
        this.openedTopicsBuChatId.put(j, this.openedTopicsBuChatId.get(j, 0) + 1);
        sortTopics(j);
    }

    public void onTopicFragmentPause(long j) {
        int i = this.openedTopicsBuChatId.get(j, 0) - 1;
        this.openedTopicsBuChatId.put(j, i >= 0 ? i : 0);
    }

    public void getTopicRepliesCount(final long j, int i) {
        final TLRPC$TL_forumTopic findTopic = findTopic(-j, i);
        if (findTopic == null || findTopic.totalMessagesCount != 0) {
            return;
        }
        TLRPC$TL_messages_getReplies tLRPC$TL_messages_getReplies = new TLRPC$TL_messages_getReplies();
        tLRPC$TL_messages_getReplies.peer = getMessagesController().getInputPeer(j);
        tLRPC$TL_messages_getReplies.msg_id = i;
        tLRPC$TL_messages_getReplies.limit = 1;
        getConnectionsManager().sendRequest(tLRPC$TL_messages_getReplies, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                TopicsController.this.lambda$getTopicRepliesCount$26(findTopic, j, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$getTopicRepliesCount$26(final TLRPC$TL_forumTopic tLRPC$TL_forumTopic, final long j, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TopicsController.this.lambda$getTopicRepliesCount$25(tLObject, tLRPC$TL_forumTopic, j);
            }
        });
    }

    public void lambda$getTopicRepliesCount$25(TLObject tLObject, TLRPC$TL_forumTopic tLRPC$TL_forumTopic, long j) {
        if (tLObject != null) {
            tLRPC$TL_forumTopic.totalMessagesCount = ((TLRPC$messages_Messages) tLObject).count;
            getMessagesStorage().updateTopicData(j, tLRPC$TL_forumTopic, 16);
            NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.topicsDidLoaded, Long.valueOf(-j), Boolean.TRUE);
        }
    }
}
