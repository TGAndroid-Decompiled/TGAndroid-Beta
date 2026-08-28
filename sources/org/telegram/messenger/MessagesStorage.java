package org.telegram.messenger;

import android.appwidget.AppWidgetManager;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import j$.util.Objects;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Timer;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public class MessagesStorage extends BaseController {
    public static final String[] DATABASE_TABLES;
    public static final int FORUM_TYPE_BOT = 8;
    public static final int FORUM_TYPE_CHAT = 1;
    public static final int FORUM_TYPE_CHAT_TABS = 2;
    public static final int FORUM_TYPE_DIRECT = 4;
    public static final int LAST_DB_VERSION = 177;
    public static final int SENT_FILE_TYPE_AUDIO = 1;
    public static final int SENT_FILE_TYPE_AUDIO_ENCRYPTED = 4;
    public static final int SENT_FILE_TYPE_PHOTO = 0;
    public static final int SENT_FILE_TYPE_PHOTO_ENCRYPTED = 3;
    public static final int SENT_FILE_TYPE_PHOTO_HIGH_QUALITY = 6;
    public static final int SENT_FILE_TYPE_PHOTO_HIGH_QUALITY_ENCRYPTED = 7;
    public static final int SENT_FILE_TYPE_VIDEO = 2;
    public static final int SENT_FILE_TYPE_VIDEO_ENCRYPTED = 5;
    public static final int SENT_FILE_TYPE_VIDEO_HIGH_QUALITY = 8;
    private int archiveUnreadCount;
    private int[][] bots;
    private File cacheFile;
    private int[][] channels;
    private int[][] communities;
    private int[][] contacts;
    private SQLiteDatabase database;
    private boolean databaseCreated;
    private boolean databaseMigrationInProgress;
    private final ArrayList<MessagesController.DialogFilter> dialogFilters;
    private final SparseArray<MessagesController.DialogFilter> dialogFiltersMap;
    private final LongSparseIntArray dialogIsForumTyped;
    private a0.h dialogsWithMentions;
    private a0.h dialogsWithUnread;
    private final ff.w ephemeralWelcomeAnchorsState;
    private int[][] groups;
    private int lastDateValue;
    private int lastPtsValue;
    private int lastQtsValue;
    private int lastSavedDate;
    private int lastSavedPts;
    private int lastSavedQts;
    private int lastSavedSeq;
    private int lastSecretVersion;
    private int lastSeqValue;
    private final AtomicLong lastTaskId;
    private int mainUnreadCount;
    private int[] mentionChannels;
    private int[] mentionGroups;
    private int[][] nonContacts;
    private final CountDownLatch openSync;
    private volatile int pendingArchiveUnreadCount;
    private volatile int pendingMainUnreadCount;
    private int secretG;
    private byte[] secretPBytes;
    private File shmCacheFile;
    public boolean showClearDatabaseAlert;
    private DispatchQueue storageQueue;
    private final SparseArray<ArrayList<Runnable>> tasks;
    boolean tryRecover;
    private final a0.h unknownDialogsIds;
    private File walCacheFile;
    private static volatile MessagesStorage[] Instance = new MessagesStorage[4];
    private static final Object[] lockObjects = new Object[4];

    public interface BooleanCallback {
        void run(boolean z10);
    }

    public interface IntCallback {
        void run(int i9);
    }

    public interface LongCallback {
        void run(long j10);
    }

    public static class ReadDialog {
        public int date;
        public int lastMid;
        public int unreadCount;

        private ReadDialog() {
        }
    }

    public class SavedReactionsUpdate {
        TLRPC.TL_messageReactions last;
        TLRPC.TL_messageReactions old;
        long topic_id;

        public SavedReactionsUpdate(long j10, TLRPC.Message message, TLRPC.Message message2) {
            MessagesStorage.this = r1;
            this.topic_id = MessageObject.getSavedDialogId(j10, message2);
            this.old = message.reactions;
            this.last = message2.reactions;
        }
    }

    public interface StringCallback {
        void run(String str);
    }

    public static class TopicKey {
        public long dialogId;
        public long topicId;

        public static TopicKey of(long j10, long j11) {
            TopicKey topicKey = new TopicKey();
            topicKey.dialogId = j10;
            topicKey.topicId = j11;
            return topicKey;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                TopicKey topicKey = (TopicKey) obj;
                if (this.dialogId == topicKey.dialogId && this.topicId == topicKey.topicId) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.dialogId), Long.valueOf(this.topicId));
        }

        public String toString() {
            return "TopicKey{dialogId=" + this.dialogId + ", topicId=" + this.topicId + '}';
        }
    }

    static {
        for (int i9 = 0; i9 < 4; i9++) {
            lockObjects[i9] = new Object();
        }
        DATABASE_TABLES = new String[]{"messages_holes", "media_holes_v2", "scheduled_messages_v2", "quick_replies", "messages_v2", "download_queue", "user_contacts_v7", "user_phones_v7", "dialogs", "dialog_filter", "dialog_filter_ep", "dialog_filter_pin_v2", "randoms_v2", "enc_tasks_v4", "messages_seq", "params", "media_v4", "bot_keyboard", "bot_keyboard_topics", "chat_settings_v2", "user_settings", "chat_pinned_v2", "chat_pinned_count", "chat_hints", "botcache", "users_data", "users", "chats", "enc_chats", "channel_users_v2", "channel_admins_v3", "contacts", "dialog_photos", "dialog_settings", "web_recent_v3", "stickers_v2", "stickers_featured", "stickers_dice", "stickersets", "hashtag_recent_v2", "webpage_pending_v2", "sent_files_v2", "search_recent", "media_counts_v2", "keyvalue", "bot_info_v2", "pending_tasks", "requested_holes", "sharing_locations", "shortcut_widget", "emoji_keywords_v2", "emoji_keywords_info_v2", "wallpapers2", "unread_push_messages", "polls_v2", "reactions", "reaction_mentions", "downloading_documents", "animated_emoji", "attach_menu_bots", "premium_promo", "emoji_statuses", "messages_holes_topics", "messages_topics", "saved_dialogs", "media_topics", "media_holes_topics", "topics", "media_counts_topics", "reaction_mentions_topics", "emoji_groups", "poll_votes_mentions", "poll_votes_mentions_topics", "ephemeral_messages"};
    }

    public MessagesStorage(int i9) {
        super(i9);
        this.lastTaskId = new AtomicLong(System.currentTimeMillis());
        this.tasks = new SparseArray<>();
        this.lastDateValue = 0;
        this.lastPtsValue = 0;
        this.lastQtsValue = 0;
        this.lastSeqValue = 0;
        this.lastSecretVersion = 0;
        this.secretPBytes = null;
        this.secretG = 0;
        this.lastSavedSeq = 0;
        this.lastSavedPts = 0;
        this.lastSavedDate = 0;
        this.lastSavedQts = 0;
        this.dialogFilters = new ArrayList<>();
        this.dialogFiltersMap = new SparseArray<>();
        this.unknownDialogsIds = new a0.h();
        this.openSync = new CountDownLatch(1);
        this.dialogIsForumTyped = new LongSparseIntArray();
        this.contacts = new int[][]{new int[2], new int[2]};
        this.nonContacts = new int[][]{new int[2], new int[2]};
        this.bots = new int[][]{new int[2], new int[2]};
        this.channels = new int[][]{new int[2], new int[2]};
        this.groups = new int[][]{new int[2], new int[2]};
        this.communities = new int[][]{new int[2], new int[2]};
        this.mentionChannels = new int[2];
        this.mentionGroups = new int[2];
        this.dialogsWithMentions = new a0.h();
        this.dialogsWithUnread = new a0.h();
        this.ephemeralWelcomeAnchorsState = new ff.w();
        DispatchQueue dispatchQueue = new DispatchQueue(j3.r0.l(i9, "storageQueue_"));
        this.storageQueue = dispatchQueue;
        dispatchQueue.setPriority(8);
        this.storageQueue.postRunnable(new f2(this, 13));
    }

    private boolean addFilesToDelete(org.telegram.tgnet.TLRPC.Message r10, java.util.ArrayList<java.io.File> r11, java.util.ArrayList<android.util.Pair<java.lang.Long, java.lang.Integer>> r12, java.util.ArrayList<java.lang.String> r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.addFilesToDelete(org.telegram.tgnet.TLRPC$Message, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, boolean):boolean");
    }

    public static void addLoadPeerInfo(TLRPC.Peer peer, ArrayList<Long> arrayList, ArrayList<Long> arrayList2) {
        if (peer instanceof TLRPC.TL_peerUser) {
            if (!arrayList.contains(Long.valueOf(peer.user_id))) {
                arrayList.add(Long.valueOf(peer.user_id));
            }
        } else if (peer instanceof TLRPC.TL_peerChannel) {
            if (!arrayList2.contains(Long.valueOf(peer.channel_id))) {
                arrayList2.add(Long.valueOf(peer.channel_id));
            }
        } else if ((peer instanceof TLRPC.TL_peerChat) && !arrayList2.contains(Long.valueOf(peer.chat_id))) {
            arrayList2.add(Long.valueOf(peer.chat_id));
        }
    }

    public static void addReplyMessages(TLRPC.Message message, a0.h hVar, a0.h hVar2) {
        long replyToDialogId;
        int i9 = message.reply_to.reply_to_msg_id;
        if ((message.flags & 1073741824) != 0) {
            replyToDialogId = message.quick_reply_shortcut_id;
        } else {
            replyToDialogId = MessageObject.getReplyToDialogId(message);
        }
        SparseArray sparseArray = (SparseArray) hVar.f(replyToDialogId);
        ArrayList arrayList = (ArrayList) hVar2.f(replyToDialogId);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            hVar.k(sparseArray, replyToDialogId);
        }
        if (arrayList == null) {
            arrayList = l0.j(replyToDialogId, hVar2);
        }
        ArrayList arrayList2 = (ArrayList) sparseArray.get(message.reply_to.reply_to_msg_id);
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
            sparseArray.put(message.reply_to.reply_to_msg_id, arrayList2);
            if (!arrayList.contains(Integer.valueOf(message.reply_to.reply_to_msg_id))) {
                arrayList.add(Integer.valueOf(message.reply_to.reply_to_msg_id));
            }
        }
        arrayList2.add(message);
    }

    public static void addUsersAndChatsFromMessage(TLRPC.Message message, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, ArrayList<Long> arrayList3) {
        TLRPC.Peer peer;
        TLRPC.Peer peer2;
        String str;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer3;
        TLRPC.Peer peer4;
        TLRPC.WebPage webPage;
        TLRPC.Peer peer5;
        TL_stories.StoryFwdHeader storyFwdHeader;
        TL_stories.StoryItem storyItem;
        TLRPC.Peer peer6;
        TLRPC.Peer peer7;
        long fromChatId = MessageObject.getFromChatId(message);
        if (DialogObject.isUserDialog(fromChatId)) {
            if (!arrayList.contains(Long.valueOf(fromChatId))) {
                arrayList.add(Long.valueOf(fromChatId));
            }
        } else if (DialogObject.isChatDialog(fromChatId)) {
            long j10 = -fromChatId;
            if (!arrayList2.contains(Long.valueOf(j10))) {
                arrayList2.add(Long.valueOf(j10));
            }
        }
        long j11 = message.via_bot_id;
        if (j11 != 0 && !arrayList.contains(Long.valueOf(j11))) {
            arrayList.add(Long.valueOf(message.via_bot_id));
        }
        TLRPC.Peer peer8 = message.guestchat_via_from;
        if (peer8 != null) {
            addLoadPeerInfo(peer8, arrayList, arrayList2);
        }
        TLRPC.MessageAction messageAction = message.action;
        if (messageAction != null) {
            long j12 = messageAction.user_id;
            if (j12 != 0 && !arrayList.contains(Long.valueOf(j12))) {
                arrayList.add(Long.valueOf(message.action.user_id));
            }
            long j13 = message.action.channel_id;
            if (j13 != 0 && !arrayList2.contains(Long.valueOf(j13))) {
                arrayList2.add(Long.valueOf(message.action.channel_id));
            }
            long j14 = message.action.chat_id;
            if (j14 != 0 && !arrayList2.contains(Long.valueOf(j14))) {
                arrayList2.add(Long.valueOf(message.action.chat_id));
            }
            TLRPC.MessageAction messageAction2 = message.action;
            if (messageAction2 instanceof TLRPC.TL_messageActionGiftCode) {
                addLoadPeerInfo(((TLRPC.TL_messageActionGiftCode) messageAction2).boost_peer, arrayList, arrayList2);
            }
            TLRPC.MessageAction messageAction3 = message.action;
            if (messageAction3 instanceof TLRPC.TL_messageActionGeoProximityReached) {
                TLRPC.TL_messageActionGeoProximityReached tL_messageActionGeoProximityReached = (TLRPC.TL_messageActionGeoProximityReached) messageAction3;
                addLoadPeerInfo(tL_messageActionGeoProximityReached.from_id, arrayList, arrayList2);
                addLoadPeerInfo(tL_messageActionGeoProximityReached.to_id, arrayList, arrayList2);
            }
            TLRPC.MessageAction messageAction4 = message.action;
            if (messageAction4 instanceof TLRPC.TL_messageActionManagedBotCreated) {
                arrayList.add(Long.valueOf(((TLRPC.TL_messageActionManagedBotCreated) messageAction4).bot_id));
            }
            TLRPC.MessageAction messageAction5 = message.action;
            if (messageAction5 instanceof TLRPC.TL_messageActionChangeCommunity) {
                long j15 = ((TLRPC.TL_messageActionChangeCommunity) messageAction5).community_id;
                if (j15 > 0) {
                    arrayList2.add(Long.valueOf(j15));
                }
            }
            if (!message.action.users.isEmpty()) {
                for (int i9 = 0; i9 < message.action.users.size(); i9++) {
                    Long l10 = message.action.users.get(i9);
                    if (!arrayList.contains(l10)) {
                        arrayList.add(l10);
                    }
                }
            }
        }
        if (!message.entities.isEmpty()) {
            for (int i10 = 0; i10 < message.entities.size(); i10++) {
                TLRPC.MessageEntity messageEntity = message.entities.get(i10);
                if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                    arrayList.add(Long.valueOf(((TLRPC.TL_messageEntityMentionName) messageEntity).user_id));
                } else if (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) {
                    arrayList.add(Long.valueOf(((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id));
                } else if (arrayList3 != null && (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji)) {
                    arrayList3.add(Long.valueOf(((TLRPC.TL_messageEntityCustomEmoji) messageEntity).document_id));
                }
            }
        }
        TLRPC.MessageAction messageAction6 = message.action;
        if (messageAction6 instanceof TLRPC.TL_messageActionStarGift) {
            TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGift) messageAction6).gift;
            if (starGift != null && (peer7 = starGift.released_by) != null) {
                addLoadPeerInfo(peer7, arrayList, arrayList2);
            }
        } else if (messageAction6 instanceof TLRPC.TL_messageActionStarGiftUnique) {
            TL_stars.StarGift starGift2 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction6).gift;
            if (starGift2 != null && (peer = starGift2.released_by) != null) {
                addLoadPeerInfo(peer, arrayList, arrayList2);
            }
        } else if (messageAction6 instanceof TLRPC.TL_messageActionRequestedPeer) {
            TLRPC.TL_messageActionRequestedPeer tL_messageActionRequestedPeer = (TLRPC.TL_messageActionRequestedPeer) messageAction6;
            for (int i11 = 0; i11 < tL_messageActionRequestedPeer.peers.size(); i11++) {
                addLoadPeerInfo(tL_messageActionRequestedPeer.peers.get(i11), arrayList, arrayList2);
            }
        }
        TLRPC.MessageMedia messageMedia = message.media;
        if (messageMedia != null) {
            long j16 = messageMedia.user_id;
            if (j16 != 0 && !arrayList.contains(Long.valueOf(j16))) {
                arrayList.add(Long.valueOf(message.media.user_id));
            }
            TLRPC.MessageMedia messageMedia2 = message.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaGiveaway) {
                ArrayList<Long> arrayList4 = ((TLRPC.TL_messageMediaGiveaway) messageMedia2).channels;
                int size = arrayList4.size();
                int i12 = 0;
                while (i12 < size) {
                    Long l11 = arrayList4.get(i12);
                    i12++;
                    Long l12 = l11;
                    if (!arrayList2.contains(l12)) {
                        arrayList2.add(l12);
                    }
                }
            }
            TLRPC.MessageMedia messageMedia3 = message.media;
            if (messageMedia3 instanceof TLRPC.TL_messageMediaGiveawayResults) {
                ArrayList<Long> arrayList5 = ((TLRPC.TL_messageMediaGiveawayResults) messageMedia3).winners;
                int size2 = arrayList5.size();
                int i13 = 0;
                while (i13 < size2) {
                    Long l13 = arrayList5.get(i13);
                    i13++;
                    Long l14 = l13;
                    if (!arrayList.contains(l14)) {
                        arrayList.add(l14);
                    }
                }
            }
            TLRPC.MessageMedia messageMedia4 = message.media;
            if (messageMedia4 instanceof TLRPC.TL_messageMediaPoll) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia4;
                if (!tL_messageMediaPoll.poll.answers.isEmpty()) {
                    for (int i14 = 0; i14 < tL_messageMediaPoll.poll.answers.size(); i14++) {
                        TLRPC.Peer peer9 = tL_messageMediaPoll.poll.answers.get(i14).added_by;
                        if (peer9 != null) {
                            addLoadPeerInfo(peer9, arrayList, arrayList2);
                        }
                    }
                }
                TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
                if (pollResults != null) {
                    ArrayList<TLRPC.Peer> arrayList6 = pollResults.recent_voters;
                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                        for (int i15 = 0; i15 < tL_messageMediaPoll.results.recent_voters.size(); i15++) {
                            addLoadPeerInfo(tL_messageMediaPoll.results.recent_voters.get(i15), arrayList, arrayList2);
                        }
                    }
                    if (!tL_messageMediaPoll.results.results.isEmpty()) {
                        ArrayList<TLRPC.PollAnswerVoters> arrayList7 = tL_messageMediaPoll.results.results;
                        int size3 = arrayList7.size();
                        int i16 = 0;
                        while (i16 < size3) {
                            TLRPC.PollAnswerVoters pollAnswerVoters = arrayList7.get(i16);
                            i16++;
                            TLRPC.PollAnswerVoters pollAnswerVoters2 = pollAnswerVoters;
                            ArrayList<TLRPC.Peer> arrayList8 = pollAnswerVoters2.recent_voters;
                            if (arrayList8 != null && !arrayList8.isEmpty()) {
                                ArrayList<TLRPC.Peer> arrayList9 = pollAnswerVoters2.recent_voters;
                                int size4 = arrayList9.size();
                                int i17 = 0;
                                while (i17 < size4) {
                                    TLRPC.Peer peer10 = arrayList9.get(i17);
                                    i17++;
                                    addLoadPeerInfo(peer10, arrayList, arrayList2);
                                }
                            }
                        }
                    }
                }
            }
            TLRPC.MessageMedia messageMedia5 = message.media;
            if ((messageMedia5 instanceof TLRPC.TL_messageMediaStory) && (storyItem = messageMedia5.storyItem) != null) {
                TL_stories.StoryFwdHeader storyFwdHeader2 = storyItem.fwd_from;
                if (storyFwdHeader2 != null) {
                    addLoadPeerInfo(storyFwdHeader2.from, arrayList, arrayList2);
                }
                TL_stories.StoryItem storyItem2 = message.media.storyItem;
                if (storyItem2 != null && storyItem2.media_areas != null) {
                    for (int i18 = 0; i18 < message.media.storyItem.media_areas.size(); i18++) {
                        if (message.media.storyItem.media_areas.get(i18) instanceof TL_stories.TL_mediaAreaChannelPost) {
                            long j17 = ((TL_stories.TL_mediaAreaChannelPost) message.media.storyItem.media_areas.get(i18)).channel_id;
                            if (!arrayList2.contains(Long.valueOf(j17))) {
                                arrayList2.add(Long.valueOf(j17));
                            }
                        }
                    }
                }
                TL_stories.StoryItem storyItem3 = message.media.storyItem;
                if (storyItem3 != null && (peer6 = storyItem3.from_id) != null) {
                    addLoadPeerInfo(peer6, arrayList, arrayList2);
                }
            }
            TLRPC.MessageMedia messageMedia6 = message.media;
            if ((messageMedia6 instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia6.webpage) != null && webPage.attributes != null) {
                for (int i19 = 0; i19 < message.media.webpage.attributes.size(); i19++) {
                    if (message.media.webpage.attributes.get(i19) instanceof TLRPC.TL_webPageAttributeStory) {
                        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) message.media.webpage.attributes.get(i19);
                        TL_stories.StoryItem storyItem4 = tL_webPageAttributeStory.storyItem;
                        if (storyItem4 != null && (storyFwdHeader = storyItem4.fwd_from) != null) {
                            addLoadPeerInfo(storyFwdHeader.from, arrayList, arrayList2);
                        }
                        TL_stories.StoryItem storyItem5 = tL_webPageAttributeStory.storyItem;
                        if (storyItem5 != null && storyItem5.media_areas != null) {
                            for (int i20 = 0; i20 < tL_webPageAttributeStory.storyItem.media_areas.size(); i20++) {
                                if (tL_webPageAttributeStory.storyItem.media_areas.get(i20) instanceof TL_stories.TL_mediaAreaChannelPost) {
                                    long j18 = ((TL_stories.TL_mediaAreaChannelPost) tL_webPageAttributeStory.storyItem.media_areas.get(i20)).channel_id;
                                    if (!arrayList2.contains(Long.valueOf(j18))) {
                                        arrayList2.add(Long.valueOf(j18));
                                    }
                                }
                            }
                        }
                        TL_stories.StoryItem storyItem6 = tL_webPageAttributeStory.storyItem;
                        if (storyItem6 != null && (peer5 = storyItem6.from_id) != null) {
                            addLoadPeerInfo(peer5, arrayList, arrayList2);
                        }
                    }
                }
            }
            TLRPC.Peer peer11 = message.media.peer;
            if (peer11 != null) {
                addLoadPeerInfo(peer11, arrayList, arrayList2);
            }
        }
        TLRPC.MessageReplies messageReplies = message.replies;
        if (messageReplies != null) {
            int size5 = messageReplies.recent_repliers.size();
            for (int i21 = 0; i21 < size5; i21++) {
                addLoadPeerInfo(message.replies.recent_repliers.get(i21), arrayList, arrayList2);
            }
        }
        TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
        if (messageReplyHeader != null && (peer4 = messageReplyHeader.reply_to_peer_id) != null) {
            addLoadPeerInfo(peer4, arrayList, arrayList2);
        }
        TLRPC.MessageFwdHeader messageFwdHeader2 = message.fwd_from;
        if (messageFwdHeader2 != null) {
            addLoadPeerInfo(messageFwdHeader2.from_id, arrayList, arrayList2);
            addLoadPeerInfo(message.fwd_from.saved_from_peer, arrayList, arrayList2);
        }
        TLRPC.MessageReplyHeader messageReplyHeader2 = message.reply_to;
        if (messageReplyHeader2 != null && (messageFwdHeader = messageReplyHeader2.reply_from) != null && (peer3 = messageFwdHeader.from_id) != null) {
            addLoadPeerInfo(peer3, arrayList, arrayList2);
        }
        HashMap<String, String> hashMap = message.params;
        if (hashMap != null && (str = hashMap.get("fwd_peer")) != null) {
            long longValue = Utilities.parseLong(str).longValue();
            if (longValue < 0) {
                long j19 = -longValue;
                if (!arrayList2.contains(Long.valueOf(j19))) {
                    arrayList2.add(Long.valueOf(j19));
                }
            }
        }
        TLRPC.TL_messageReactions tL_messageReactions = message.reactions;
        if (tL_messageReactions != null && tL_messageReactions.top_reactors != null) {
            for (int i22 = 0; i22 < message.reactions.top_reactors.size(); i22++) {
                TLRPC.MessageReactor messageReactor = message.reactions.top_reactors.get(i22);
                if (messageReactor != null && (peer2 = messageReactor.peer_id) != null) {
                    addLoadPeerInfo(peer2, arrayList, arrayList2);
                }
            }
        }
    }

    private void bindMessageTags(SQLitePreparedStatement sQLitePreparedStatement, TLRPC.Message message) {
        ArrayList<TLRPC.ReactionCount> arrayList;
        long j10;
        String str;
        long clientUserId = getUserConfig().getClientUserId();
        TLRPC.TL_messageReactions tL_messageReactions = message.reactions;
        if (tL_messageReactions != null && tL_messageReactions.reactions_as_tags && (arrayList = tL_messageReactions.results) != null && !arrayList.isEmpty()) {
            LocaleController localeController = LocaleController.getInstance();
            String str2 = message.message;
            if (str2 == null) {
                str2 = "";
            }
            String translitString = localeController.getTranslitString(str2);
            ArrayList<TLRPC.ReactionCount> arrayList2 = message.reactions.results;
            int size = arrayList2.size();
            int i9 = 0;
            while (i9 < size) {
                TLRPC.ReactionCount reactionCount = arrayList2.get(i9);
                i9++;
                TLRPC.ReactionCount reactionCount2 = reactionCount;
                TLRPC.Reaction reaction = reactionCount2.reaction;
                if ((reaction instanceof TLRPC.TL_reactionEmoji) || (reaction instanceof TLRPC.TL_reactionCustomEmoji)) {
                    sQLitePreparedStatement.requery();
                    sQLitePreparedStatement.bindLong(1, message.f22401id);
                    sQLitePreparedStatement.bindLong(2, MessageObject.getSavedDialogId(clientUserId, message));
                    TLRPC.Reaction reaction2 = reactionCount2.reaction;
                    if (reaction2 instanceof TLRPC.TL_reactionEmoji) {
                        j10 = ((TLRPC.TL_reactionEmoji) reaction2).emoticon.hashCode();
                    } else if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                        j10 = ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id;
                    } else {
                        j10 = 0;
                    }
                    sQLitePreparedStatement.bindLong(3, j10);
                    if (translitString == null) {
                        str = "";
                    } else {
                        str = translitString;
                    }
                    sQLitePreparedStatement.bindString(4, str);
                    sQLitePreparedStatement.step();
                }
            }
        }
    }

    private void broadcastQuickRepliesMessagesChange(Long l10, long j10) {
        AndroidUtilities.runOnUIThread(new f2(this, 27));
    }

    private void broadcastScheduledMessagesChange(Long l10) {
        int i9;
        SQLiteCursor queryFinalized;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = this.database;
                Locale locale = Locale.US;
                i9 = 0;
                queryFinalized = sQLiteDatabase.queryFinalized("SELECT COUNT(mid) FROM scheduled_messages_v2 WHERE uid = " + l10, new Object[0]);
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (queryFinalized.next()) {
                i9 = queryFinalized.intValue(0);
            }
            queryFinalized.dispose();
            AndroidUtilities.runOnUIThread(new p4(this, l10, i9, 17));
        } catch (Exception e11) {
            e = e11;
            sQLiteCursor = queryFinalized;
            checkSQLException(e);
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteCursor = queryFinalized;
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    private void calcUnreadCounters(boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.calcUnreadCounters(boolean):void");
    }

    public void lambda$checkIfFolderEmpty$246(int i9) {
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                boolean z10 = false;
                sQLiteCursor = this.database.queryFinalized("SELECT did FROM dialogs WHERE folder_id = ?", Integer.valueOf(i9));
                while (true) {
                    if (sQLiteCursor.next()) {
                        long longValue = sQLiteCursor.longValue(0);
                        if (!DialogObject.isUserDialog(longValue) && !DialogObject.isEncryptedDialog(longValue)) {
                            TLRPC.Chat chat = getChat(-longValue);
                            if (!ChatObject.isNotInChat(chat) && chat.migrated_to == null) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                sQLiteCursor.dispose();
                if (z10) {
                    AndroidUtilities.runOnUIThread(new df(this, i9, 1));
                    SQLiteDatabase sQLiteDatabase = this.database;
                    sQLiteDatabase.executeFast("DELETE FROM dialogs WHERE did = " + DialogObject.makeFolderDialogId(i9)).stepThis().dispose();
                }
                sQLiteCursor.dispose();
            } catch (Exception e10) {
                checkSQLException(e10);
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
            }
        } catch (Throwable th) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    private void cleanupInternal(boolean z10) {
        if (z10) {
            reset();
        } else {
            clearDatabaseValues();
        }
        SQLiteDatabase sQLiteDatabase = this.database;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
            this.database = null;
        }
        if (z10) {
            File file = this.cacheFile;
            if (file != null) {
                file.delete();
                this.cacheFile = null;
            }
            File file2 = this.walCacheFile;
            if (file2 != null) {
                file2.delete();
                this.walCacheFile = null;
            }
            File file3 = this.shmCacheFile;
            if (file3 != null) {
                file3.delete();
                this.shmCacheFile = null;
            }
        }
    }

    private void clearLoadingDialogsOffsets() {
        for (int i9 = 0; i9 < 2; i9++) {
            getUserConfig().setDialogsLoadOffset(i9, 0, 0, 0L, 0L, 0L, 0L);
            getUserConfig().setTotalDialogsCount(i9, 0);
        }
        getUserConfig().saveConfig(false);
    }

    private void closeHolesInTable(String str, long j10, int i9, int i10, long j11) {
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        char c10;
        char c11;
        SQLiteCursor queryFinalized;
        int i11;
        ArrayList arrayList;
        SQLitePreparedStatement executeFast;
        long j12;
        int i12;
        int i13;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        int i14 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        try {
            try {
                try {
                    if (i14 != 0) {
                        c10 = 2;
                        c11 = 3;
                        queryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT start, end FROM " + str + " WHERE uid = %d AND topic_id = %d AND ((end >= %d AND end <= %d) OR (start >= %d AND start <= %d) OR (start >= %d AND end <= %d) OR (start <= %d AND end >= %d))", Long.valueOf(j10), Long.valueOf(j11), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i9), Integer.valueOf(i10)), new Object[0]);
                    } else {
                        c10 = 2;
                        c11 = 3;
                        queryFinalized = this.database.queryFinalized(String.format(Locale.US, "SELECT start, end FROM " + str + " WHERE uid = %d AND ((end >= %d AND end <= %d) OR (start >= %d AND start <= %d) OR (start >= %d AND end <= %d) OR (start <= %d AND end >= %d))", Long.valueOf(j10), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i9), Integer.valueOf(i10)), new Object[0]);
                    }
                    sQLiteCursor2 = queryFinalized;
                    ArrayList arrayList2 = null;
                    while (sQLiteCursor2.next()) {
                        try {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            int intValue = sQLiteCursor2.intValue(0);
                            int intValue2 = sQLiteCursor2.intValue(1);
                            if (intValue != intValue2 || intValue != 1) {
                                arrayList2.add(new Hole(intValue, intValue2));
                            }
                        } catch (Exception e10) {
                            e = e10;
                        }
                    }
                    sQLiteCursor2.dispose();
                    if (arrayList2 != null) {
                        int i15 = 0;
                        while (i15 < arrayList2.size()) {
                            Hole hole = (Hole) arrayList2.get(i15);
                            int i16 = hole.end;
                            if (i10 >= i16 - 1 && i9 <= hole.start + 1) {
                                if (i14 != 0) {
                                    Long valueOf = Long.valueOf(j10);
                                    Long valueOf2 = Long.valueOf(j11);
                                    i11 = i15;
                                    Integer valueOf3 = Integer.valueOf(hole.start);
                                    Integer valueOf4 = Integer.valueOf(hole.end);
                                    arrayList = arrayList2;
                                    Object[] objArr = new Object[4];
                                    objArr[0] = valueOf;
                                    objArr[1] = valueOf2;
                                    objArr[c10] = valueOf3;
                                    objArr[c11] = valueOf4;
                                    this.database.executeFast(String.format(Locale.US, "DELETE FROM " + str + " WHERE uid = %d AND topic_id = %d AND start = %d AND end = %d", objArr)).stepThis().dispose();
                                } else {
                                    i11 = i15;
                                    arrayList = arrayList2;
                                    Long valueOf5 = Long.valueOf(j10);
                                    Integer valueOf6 = Integer.valueOf(hole.start);
                                    Integer valueOf7 = Integer.valueOf(hole.end);
                                    Object[] objArr2 = new Object[3];
                                    objArr2[0] = valueOf5;
                                    objArr2[1] = valueOf6;
                                    objArr2[c10] = valueOf7;
                                    this.database.executeFast(String.format(Locale.US, "DELETE FROM " + str + " WHERE uid = %d AND start = %d AND end = %d", objArr2)).stepThis().dispose();
                                }
                            } else {
                                i11 = i15;
                                arrayList = arrayList2;
                                if (i10 >= i16 - 1) {
                                    if (i16 != i9) {
                                        if (i14 != 0) {
                                            try {
                                                SQLiteDatabase sQLiteDatabase = this.database;
                                                Locale locale = Locale.US;
                                                Long valueOf8 = Long.valueOf(j10);
                                                Long valueOf9 = Long.valueOf(j11);
                                                Integer valueOf10 = Integer.valueOf(hole.start);
                                                Integer valueOf11 = Integer.valueOf(hole.end);
                                                Object[] objArr3 = new Object[4];
                                                objArr3[0] = valueOf8;
                                                objArr3[1] = valueOf9;
                                                objArr3[c10] = valueOf10;
                                                objArr3[3] = valueOf11;
                                                sQLiteDatabase.executeFast(String.format(locale, "DELETE FROM " + str + " WHERE uid = %d AND topic_id = %d AND start = %d AND end = %d", objArr3)).stepThis().dispose();
                                                Long valueOf12 = Long.valueOf(j10);
                                                Long valueOf13 = Long.valueOf(j11);
                                                Integer valueOf14 = Integer.valueOf(hole.start);
                                                Integer valueOf15 = Integer.valueOf(i9);
                                                Object[] objArr4 = new Object[4];
                                                objArr4[0] = valueOf12;
                                                objArr4[1] = valueOf13;
                                                objArr4[c10] = valueOf14;
                                                objArr4[3] = valueOf15;
                                                this.database.executeFast(String.format(locale, "REPLACE INTO " + str + " VALUES(%d, %d, %d, %d)", objArr4)).stepThis().dispose();
                                            } catch (Exception e11) {
                                                checkSQLException(e11, false);
                                            }
                                        } else {
                                            SQLiteDatabase sQLiteDatabase2 = this.database;
                                            Locale locale2 = Locale.US;
                                            Long valueOf16 = Long.valueOf(j10);
                                            Integer valueOf17 = Integer.valueOf(hole.start);
                                            Integer valueOf18 = Integer.valueOf(hole.end);
                                            Object[] objArr5 = new Object[3];
                                            objArr5[0] = valueOf16;
                                            objArr5[1] = valueOf17;
                                            objArr5[c10] = valueOf18;
                                            sQLiteDatabase2.executeFast(String.format(locale2, "DELETE FROM " + str + " WHERE uid = %d AND start = %d AND end = %d", objArr5)).stepThis().dispose();
                                            Long valueOf19 = Long.valueOf(j10);
                                            Integer valueOf20 = Integer.valueOf(hole.start);
                                            Integer valueOf21 = Integer.valueOf(i9);
                                            Object[] objArr6 = new Object[3];
                                            objArr6[0] = valueOf19;
                                            objArr6[1] = valueOf20;
                                            objArr6[c10] = valueOf21;
                                            this.database.executeFast(String.format(locale2, "REPLACE INTO " + str + " VALUES(%d, %d, %d)", objArr6)).stepThis().dispose();
                                        }
                                    }
                                } else {
                                    int i17 = hole.start;
                                    if (i9 <= i17 + 1) {
                                        if (i17 != i10) {
                                            if (i14 != 0) {
                                                try {
                                                    SQLiteDatabase sQLiteDatabase3 = this.database;
                                                    Locale locale3 = Locale.US;
                                                    Long valueOf22 = Long.valueOf(j10);
                                                    Long valueOf23 = Long.valueOf(j11);
                                                    Integer valueOf24 = Integer.valueOf(hole.start);
                                                    Integer valueOf25 = Integer.valueOf(hole.end);
                                                    Object[] objArr7 = new Object[4];
                                                    objArr7[0] = valueOf22;
                                                    objArr7[1] = valueOf23;
                                                    objArr7[c10] = valueOf24;
                                                    objArr7[3] = valueOf25;
                                                    sQLiteDatabase3.executeFast(String.format(locale3, "DELETE FROM " + str + " WHERE uid = %d AND topic_id = %d AND start = %d AND end = %d", objArr7)).stepThis().dispose();
                                                    Long valueOf26 = Long.valueOf(j10);
                                                    Long valueOf27 = Long.valueOf(j11);
                                                    Integer valueOf28 = Integer.valueOf(i10);
                                                    Integer valueOf29 = Integer.valueOf(hole.end);
                                                    Object[] objArr8 = new Object[4];
                                                    objArr8[0] = valueOf26;
                                                    objArr8[1] = valueOf27;
                                                    objArr8[c10] = valueOf28;
                                                    objArr8[3] = valueOf29;
                                                    this.database.executeFast(String.format(locale3, "REPLACE INTO " + str + " VALUES(%d, %d, %d, %d)", objArr8)).stepThis().dispose();
                                                } catch (Exception e12) {
                                                    checkSQLException(e12, false);
                                                }
                                            } else {
                                                SQLiteDatabase sQLiteDatabase4 = this.database;
                                                Locale locale4 = Locale.US;
                                                Long valueOf30 = Long.valueOf(j10);
                                                Integer valueOf31 = Integer.valueOf(hole.start);
                                                Integer valueOf32 = Integer.valueOf(hole.end);
                                                Object[] objArr9 = new Object[3];
                                                objArr9[0] = valueOf30;
                                                objArr9[1] = valueOf31;
                                                objArr9[c10] = valueOf32;
                                                sQLiteDatabase4.executeFast(String.format(locale4, "DELETE FROM " + str + " WHERE uid = %d AND start = %d AND end = %d", objArr9)).stepThis().dispose();
                                                Long valueOf33 = Long.valueOf(j10);
                                                Integer valueOf34 = Integer.valueOf(i10);
                                                Integer valueOf35 = Integer.valueOf(hole.end);
                                                Object[] objArr10 = new Object[3];
                                                objArr10[0] = valueOf33;
                                                objArr10[1] = valueOf34;
                                                objArr10[c10] = valueOf35;
                                                this.database.executeFast(String.format(locale4, "REPLACE INTO " + str + " VALUES(%d, %d, %d)", objArr10)).stepThis().dispose();
                                            }
                                        }
                                    } else {
                                        if (i14 != 0) {
                                            Long valueOf36 = Long.valueOf(j10);
                                            Long valueOf37 = Long.valueOf(j11);
                                            Integer valueOf38 = Integer.valueOf(hole.start);
                                            Integer valueOf39 = Integer.valueOf(hole.end);
                                            Object[] objArr11 = new Object[4];
                                            objArr11[0] = valueOf36;
                                            objArr11[1] = valueOf37;
                                            objArr11[c10] = valueOf38;
                                            objArr11[3] = valueOf39;
                                            this.database.executeFast(String.format(Locale.US, "DELETE FROM " + str + " WHERE uid = %d AND topic_id = %d AND start = %d AND end = %d", objArr11)).stepThis().dispose();
                                            executeFast = this.database.executeFast("REPLACE INTO " + str + " VALUES(?, ?, ?, ?)");
                                        } else {
                                            Long valueOf40 = Long.valueOf(j10);
                                            Integer valueOf41 = Integer.valueOf(hole.start);
                                            Integer valueOf42 = Integer.valueOf(hole.end);
                                            Object[] objArr12 = new Object[3];
                                            objArr12[0] = valueOf40;
                                            objArr12[1] = valueOf41;
                                            objArr12[c10] = valueOf42;
                                            this.database.executeFast(String.format(Locale.US, "DELETE FROM " + str + " WHERE uid = %d AND start = %d AND end = %d", objArr12)).stepThis().dispose();
                                            executeFast = this.database.executeFast("REPLACE INTO " + str + " VALUES(?, ?, ?)");
                                        }
                                        try {
                                            executeFast.requery();
                                            executeFast.bindLong(1, j10);
                                            if (i14 != 0) {
                                                j12 = j11;
                                                executeFast.bindLong(2, j12);
                                                i12 = 3;
                                            } else {
                                                j12 = j11;
                                                i12 = 2;
                                            }
                                            executeFast.bindInteger(i12, hole.start);
                                            executeFast.bindInteger(i12 + 1, i9);
                                            executeFast.step();
                                            executeFast.requery();
                                            executeFast.bindLong(1, j10);
                                            if (i14 != 0) {
                                                executeFast.bindLong(2, j12);
                                                i13 = 3;
                                            } else {
                                                i13 = 2;
                                            }
                                            executeFast.bindInteger(i13, i10);
                                            executeFast.bindInteger(i13 + 1, hole.end);
                                            executeFast.step();
                                            executeFast.dispose();
                                            i15 = i11 + 1;
                                            arrayList2 = arrayList;
                                            c10 = 2;
                                            c11 = 3;
                                        } catch (Exception e13) {
                                            e = e13;
                                            sQLiteCursor2 = null;
                                            sQLitePreparedStatement = executeFast;
                                            checkSQLException(e);
                                            if (sQLitePreparedStatement != null) {
                                                sQLitePreparedStatement.dispose();
                                            }
                                            if (sQLiteCursor2 != null) {
                                                sQLiteCursor2.dispose();
                                                return;
                                            }
                                            return;
                                        } catch (Throwable th) {
                                            th = th;
                                            sQLiteCursor = null;
                                            sQLitePreparedStatement = executeFast;
                                            if (sQLitePreparedStatement != null) {
                                                sQLitePreparedStatement.dispose();
                                            }
                                            if (sQLiteCursor != null) {
                                                sQLiteCursor.dispose();
                                            }
                                            throw th;
                                        }
                                    }
                                }
                            }
                            i15 = i11 + 1;
                            arrayList2 = arrayList;
                            c10 = 2;
                            c11 = 3;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e14) {
                e = e14;
                sQLiteCursor2 = null;
            }
        } catch (Throwable th3) {
            th = th3;
            sQLiteCursor = null;
        }
    }

    public static void createFirstHoles(long j10, SQLitePreparedStatement sQLitePreparedStatement, SQLitePreparedStatement sQLitePreparedStatement2, int i9, long j11) {
        int i10;
        int i11;
        int i12;
        int i13;
        sQLitePreparedStatement.requery();
        sQLitePreparedStatement.bindLong(1, j10);
        int i14 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        if (i14 != 0) {
            sQLitePreparedStatement.bindLong(2, j11);
            i10 = 3;
        } else {
            i10 = 2;
        }
        int i15 = i10 + 1;
        if (i9 == 1) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        sQLitePreparedStatement.bindInteger(i10, i11);
        sQLitePreparedStatement.bindInteger(i15, i9);
        sQLitePreparedStatement.step();
        for (int i16 = 0; i16 < 9; i16++) {
            sQLitePreparedStatement2.requery();
            sQLitePreparedStatement2.bindLong(1, j10);
            if (i14 != 0) {
                sQLitePreparedStatement2.bindLong(2, j11);
                i12 = 3;
            } else {
                i12 = 2;
            }
            int i17 = i12 + 1;
            sQLitePreparedStatement2.bindInteger(i12, i16);
            int i18 = i12 + 2;
            if (i9 == 1) {
                i13 = 1;
            } else {
                i13 = 0;
            }
            sQLitePreparedStatement2.bindInteger(i17, i13);
            sQLitePreparedStatement2.bindInteger(i18, i9);
            sQLitePreparedStatement2.step();
        }
    }

    private void createOrEditTopic(long j10, TLRPC.Message message) {
        TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
        tL_forumTopic.topicStartMessage = message;
        tL_forumTopic.top_message = message.f22401id;
        tL_forumTopic.topMessage = message;
        tL_forumTopic.from_id = message.from_id;
        tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
        int i9 = 0;
        tL_forumTopic.unread_count = 0;
        TLRPC.MessageAction messageAction = message.action;
        if (messageAction instanceof TLRPC.TL_messageActionTopicCreate) {
            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = (TLRPC.TL_messageActionTopicCreate) messageAction;
            tL_forumTopic.f22432id = message.f22401id;
            long j11 = tL_messageActionTopicCreate.icon_emoji_id;
            tL_forumTopic.icon_emoji_id = j11;
            tL_forumTopic.title = tL_messageActionTopicCreate.title;
            tL_forumTopic.icon_color = tL_messageActionTopicCreate.icon_color;
            if (j11 != 0) {
                tL_forumTopic.flags |= 1;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(tL_forumTopic);
            saveTopics(j10, arrayList, false, false, message.date);
            AndroidUtilities.runOnUIThread(new a4(this, j10, tL_forumTopic, 20));
        } else if (messageAction instanceof TLRPC.TL_messageActionTopicEdit) {
            TLRPC.TL_messageActionTopicEdit tL_messageActionTopicEdit = (TLRPC.TL_messageActionTopicEdit) messageAction;
            tL_forumTopic.f22432id = (int) MessageObject.getTopicId(this.currentAccount, message, true);
            tL_forumTopic.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
            tL_forumTopic.title = tL_messageActionTopicEdit.title;
            tL_forumTopic.closed = tL_messageActionTopicEdit.closed;
            tL_forumTopic.hidden = tL_messageActionTopicEdit.hidden;
            int i10 = tL_messageActionTopicEdit.flags;
            if ((i10 & 1) != 0) {
                i9 = 1;
            }
            if ((i10 & 2) != 0) {
                i9 += 2;
            }
            if ((i10 & 4) != 0) {
                i9 += 8;
            }
            if ((i10 & 8) != 0) {
                i9 += 32;
            }
            updateTopicData(j10, tL_forumTopic, i9, message.date);
        }
    }

    public static void createTables(SQLiteDatabase sQLiteDatabase) {
        l0.u(sQLiteDatabase, "CREATE TABLE messages_holes(uid INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, start));", "CREATE INDEX IF NOT EXISTS uid_end_messages_holes_4_dialogs ON messages_holes(uid, end);", "CREATE TABLE media_holes_v2(uid INTEGER, type INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, type, start));", "CREATE INDEX IF NOT EXISTS uid_end_media_holes_v2 ON media_holes_v2(uid, type, end);");
        l0.u(sQLiteDatabase, "CREATE TABLE scheduled_messages_v2(mid INTEGER, uid INTEGER, send_state INTEGER, date INTEGER, data BLOB, ttl INTEGER, replydata BLOB, reply_to_message_id INTEGER, PRIMARY KEY(mid, uid))", "CREATE INDEX IF NOT EXISTS send_state_idx_scheduled_messages_v2 ON scheduled_messages_v2(mid, send_state, date);", "CREATE INDEX IF NOT EXISTS uid_date_idx_scheduled_messages_v2 ON scheduled_messages_v2(uid, date);", "CREATE INDEX IF NOT EXISTS reply_to_idx_scheduled_messages_v2 ON scheduled_messages_v2(mid, reply_to_message_id);");
        l0.u(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS idx_to_reply_scheduled_messages_v2 ON scheduled_messages_v2(reply_to_message_id, mid);", "CREATE TABLE messages_v2(mid INTEGER, uid INTEGER, read_state INTEGER, send_state INTEGER, date INTEGER, data BLOB, out INTEGER, ttl INTEGER, media INTEGER, replydata BLOB, imp INTEGER, mention INTEGER, forwards INTEGER, replies_data BLOB, thread_reply_id INTEGER, is_channel INTEGER, reply_to_message_id INTEGER, custom_params BLOB, group_id INTEGER, reply_to_story_id INTEGER, PRIMARY KEY(mid, uid))", "CREATE INDEX IF NOT EXISTS uid_mid_read_out_idx_messages_v2 ON messages_v2(uid, mid, read_state, out);", "CREATE INDEX IF NOT EXISTS uid_date_mid_idx_messages_v2 ON messages_v2(uid, date, mid);");
        l0.u(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS mid_out_idx_messages_v2 ON messages_v2(mid, out);", "CREATE INDEX IF NOT EXISTS task_idx_messages_v2 ON messages_v2(uid, out, read_state, ttl, date, send_state);", "CREATE INDEX IF NOT EXISTS send_state_idx_messages_v2 ON messages_v2(mid, send_state, date);", "CREATE INDEX IF NOT EXISTS uid_mention_idx_messages_v2 ON messages_v2(uid, mention, read_state);");
        l0.u(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS is_channel_idx_messages_v2 ON messages_v2(mid, is_channel);", "CREATE INDEX IF NOT EXISTS reply_to_idx_messages_v2 ON messages_v2(mid, reply_to_message_id);", "CREATE INDEX IF NOT EXISTS idx_to_reply_messages_v2 ON messages_v2(reply_to_message_id, mid);", "CREATE INDEX IF NOT EXISTS uid_mid_groupid_messages_v2 ON messages_v2(uid, mid, group_id);");
        l0.u(sQLiteDatabase, "CREATE TABLE saved_dialogs(did INTEGER, date INTEGER, last_mid INTEGER, pinned INTEGER, flags INTEGER, folder_id INTEGER, last_mid_group INTEGER, count INTEGER, forumChatId INTEGER, unread_count INTEGER, max_read_id INTEGER, read_outbox INTEGER, PRIMARY KEY (did, forumChatId))", "CREATE INDEX IF NOT EXISTS date_idx_4_saved_dialogs ON saved_dialogs(date);", "CREATE INDEX IF NOT EXISTS last_mid_idx_4_saved_dialogs ON saved_dialogs(last_mid);", "CREATE INDEX IF NOT EXISTS folder_id_idx_4_saved_dialogs ON saved_dialogs(folder_id);");
        l0.u(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS flags_idx_4_saved_dialogs ON saved_dialogs(flags);", "CREATE INDEX IF NOT EXISTS forum_idx_dialogs ON saved_dialogs(forumChatId);", "CREATE TABLE download_queue(uid INTEGER, type INTEGER, date INTEGER, data BLOB, parent TEXT, PRIMARY KEY (uid, type));", "CREATE INDEX IF NOT EXISTS type_date_idx_download_queue ON download_queue(type, date);");
        l0.u(sQLiteDatabase, "CREATE TABLE user_contacts_v7(key TEXT PRIMARY KEY, uid INTEGER, fname TEXT, sname TEXT, imported INTEGER)", "CREATE TABLE user_phones_v7(key TEXT, phone TEXT, sphone TEXT, deleted INTEGER, PRIMARY KEY (key, phone))", "CREATE INDEX IF NOT EXISTS sphone_deleted_idx_user_phones ON user_phones_v7(sphone, deleted);", "CREATE TABLE dialogs(did INTEGER PRIMARY KEY, date INTEGER, unread_count INTEGER, last_mid INTEGER, inbox_max INTEGER, outbox_max INTEGER, last_mid_i INTEGER, unread_count_i INTEGER, pts INTEGER, date_i INTEGER, pinned INTEGER, flags INTEGER, folder_id INTEGER, data BLOB, unread_reactions INTEGER, last_mid_group INTEGER, ttl_period INTEGER, unread_poll_votes INTEGER)");
        l0.u(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS date_idx_4_dialogs ON dialogs(date);", "CREATE INDEX IF NOT EXISTS last_mid_idx_4_dialogs ON dialogs(last_mid);", "CREATE INDEX IF NOT EXISTS unread_count_idx_dialogs ON dialogs(unread_count);", "CREATE INDEX IF NOT EXISTS last_mid_i_idx_dialogs ON dialogs(last_mid_i);");
        l0.u(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS unread_count_i_idx_dialogs ON dialogs(unread_count_i);", "CREATE INDEX IF NOT EXISTS folder_id_idx_4_dialogs ON dialogs(folder_id);", "CREATE INDEX IF NOT EXISTS flags_idx_4_dialogs ON dialogs(flags);", "CREATE TABLE dialog_filter(id INTEGER PRIMARY KEY, ord INTEGER, unread_count INTEGER, flags INTEGER, title TEXT, color INTEGER DEFAULT -1, entities BLOB, noanimate INTEGER)");
        l0.u(sQLiteDatabase, "CREATE TABLE dialog_filter_ep(id INTEGER, peer INTEGER, PRIMARY KEY (id, peer))", "CREATE TABLE dialog_filter_pin_v2(id INTEGER, peer INTEGER, pin INTEGER, PRIMARY KEY (id, peer))", "CREATE TABLE randoms_v2(random_id INTEGER, mid INTEGER, uid INTEGER, PRIMARY KEY (random_id, mid, uid))", "CREATE INDEX IF NOT EXISTS mid_idx_randoms_v2 ON randoms_v2(mid, uid);");
        l0.u(sQLiteDatabase, "CREATE TABLE enc_tasks_v4(mid INTEGER, uid INTEGER, date INTEGER, media INTEGER, PRIMARY KEY(mid, uid, media))", "CREATE INDEX IF NOT EXISTS date_idx_enc_tasks_v4 ON enc_tasks_v4(date);", "CREATE TABLE messages_seq(mid INTEGER PRIMARY KEY, seq_in INTEGER, seq_out INTEGER);", "CREATE INDEX IF NOT EXISTS seq_idx_messages_seq ON messages_seq(seq_in, seq_out);");
        l0.u(sQLiteDatabase, "CREATE TABLE params(id INTEGER PRIMARY KEY, seq INTEGER, pts INTEGER, date INTEGER, qts INTEGER, lsv INTEGER, sg INTEGER, pbytes BLOB)", "INSERT INTO params VALUES(1, 0, 0, 0, 0, 0, 0, NULL)", "CREATE TABLE media_v4(mid INTEGER, uid INTEGER, date INTEGER, type INTEGER, data BLOB, PRIMARY KEY(mid, uid, type))", "CREATE INDEX IF NOT EXISTS uid_mid_type_date_idx_media_v4 ON media_v4(uid, mid, type, date);");
        l0.u(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS uid_type_date_mid_idx_media_v4 ON media_v4(uid, type, date DESC, mid DESC);", "CREATE TABLE bot_keyboard(uid INTEGER PRIMARY KEY, mid INTEGER, info BLOB)", "CREATE INDEX IF NOT EXISTS bot_keyboard_idx_mid_v2 ON bot_keyboard(mid, uid);", "CREATE TABLE bot_keyboard_topics(uid INTEGER, tid INTEGER, mid INTEGER, info BLOB, PRIMARY KEY(uid, tid))");
        l0.u(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS bot_keyboard_topics_idx_mid_v2 ON bot_keyboard_topics(mid, uid, tid);", "CREATE TABLE chat_settings_v2(uid INTEGER PRIMARY KEY, info BLOB, pinned INTEGER, online INTEGER, inviter INTEGER, links INTEGER, participants_count INTEGER)", "CREATE INDEX IF NOT EXISTS chat_settings_pinned_idx ON chat_settings_v2(uid, pinned) WHERE pinned != 0;", "CREATE TABLE user_settings(uid INTEGER PRIMARY KEY, info BLOB, pinned INTEGER)");
        l0.u(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS user_settings_pinned_idx ON user_settings(uid, pinned) WHERE pinned != 0;", "CREATE TABLE chat_pinned_v2(uid INTEGER, mid INTEGER, data BLOB, PRIMARY KEY (uid, mid));", "CREATE TABLE chat_pinned_count(uid INTEGER PRIMARY KEY, count INTEGER, end INTEGER);", "CREATE TABLE chat_hints(did INTEGER, type INTEGER, rating REAL, date INTEGER, PRIMARY KEY(did, type))");
        l0.u(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS chat_hints_rating_idx ON chat_hints(rating);", "CREATE TABLE botcache(id TEXT PRIMARY KEY, date INTEGER, data BLOB)", "CREATE INDEX IF NOT EXISTS botcache_date_idx ON botcache(date);", "CREATE TABLE users_data(uid INTEGER PRIMARY KEY, about TEXT)");
        l0.u(sQLiteDatabase, "CREATE TABLE users(uid INTEGER PRIMARY KEY, name TEXT, status INTEGER, data BLOB)", "CREATE TABLE chats(uid INTEGER PRIMARY KEY, name TEXT, data BLOB)", "CREATE TABLE enc_chats(uid INTEGER PRIMARY KEY, user INTEGER, name TEXT, data BLOB, g BLOB, authkey BLOB, ttl INTEGER, layer INTEGER, seq_in INTEGER, seq_out INTEGER, use_count INTEGER, exchange_id INTEGER, key_date INTEGER, fprint INTEGER, fauthkey BLOB, khash BLOB, in_seq_no INTEGER, admin_id INTEGER, mtproto_seq INTEGER)", "CREATE TABLE channel_users_v2(did INTEGER, uid INTEGER, date INTEGER, data BLOB, PRIMARY KEY(did, uid))");
        l0.u(sQLiteDatabase, "CREATE TABLE channel_admins_v3(did INTEGER, uid INTEGER, data BLOB, PRIMARY KEY(did, uid))", "CREATE TABLE contacts(uid INTEGER PRIMARY KEY, mutual INTEGER)", "CREATE TABLE dialog_photos(uid INTEGER, id INTEGER, num INTEGER, data BLOB, PRIMARY KEY (uid, id))", "CREATE TABLE dialog_photos_count(uid INTEGER PRIMARY KEY, count INTEGER)");
        l0.u(sQLiteDatabase, "CREATE TABLE dialog_settings(did INTEGER PRIMARY KEY, flags INTEGER);", "CREATE TABLE web_recent_v3(id TEXT, type INTEGER, image_url TEXT, thumb_url TEXT, local_url TEXT, width INTEGER, height INTEGER, size INTEGER, date INTEGER, document BLOB, PRIMARY KEY (id, type));", "CREATE TABLE stickers_v2(id INTEGER PRIMARY KEY, data BLOB, date INTEGER, hash INTEGER);", "CREATE TABLE stickers_featured(id INTEGER PRIMARY KEY, data BLOB, unread BLOB, date INTEGER, hash INTEGER, premium INTEGER, emoji INTEGER);");
        l0.u(sQLiteDatabase, "CREATE TABLE stickers_dice(emoji TEXT PRIMARY KEY, data BLOB, date INTEGER);", "CREATE TABLE hashtag_recent_v2(id TEXT PRIMARY KEY, date INTEGER);", "CREATE TABLE webpage_pending_v2(id INTEGER, mid INTEGER, uid INTEGER, PRIMARY KEY (id, mid, uid));", "CREATE TABLE sent_files_v2(uid TEXT, type INTEGER, data BLOB, parent TEXT, PRIMARY KEY (uid, type))");
        l0.u(sQLiteDatabase, "CREATE TABLE search_recent(did INTEGER PRIMARY KEY, date INTEGER);", "CREATE TABLE media_counts_v2(uid INTEGER, type INTEGER, count INTEGER, old INTEGER, PRIMARY KEY(uid, type))", "CREATE TABLE keyvalue(id TEXT PRIMARY KEY, value TEXT)", "CREATE TABLE bot_info_v2(uid INTEGER, dialogId INTEGER, info BLOB, PRIMARY KEY(uid, dialogId))");
        l0.u(sQLiteDatabase, "CREATE TABLE pending_tasks(id INTEGER PRIMARY KEY, data BLOB);", "CREATE TABLE requested_holes(uid INTEGER, seq_out_start INTEGER, seq_out_end INTEGER, PRIMARY KEY (uid, seq_out_start, seq_out_end));", "CREATE TABLE sharing_locations(uid INTEGER PRIMARY KEY, mid INTEGER, date INTEGER, period INTEGER, message BLOB, proximity INTEGER);", "CREATE TABLE stickersets2(id INTEGER PRIMATE KEY, data BLOB, hash INTEGER, date INTEGER, short_name TEXT);");
        l0.u(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS stickersets2_id_index ON stickersets2(id);", "CREATE INDEX IF NOT EXISTS stickersets2_id_short_name ON stickersets2(id, short_name);", "CREATE INDEX IF NOT EXISTS stickers_featured_emoji_index ON stickers_featured(emoji);", "CREATE TABLE shortcut_widget(id INTEGER, did INTEGER, ord INTEGER, PRIMARY KEY (id, did));");
        l0.u(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS shortcut_widget_did ON shortcut_widget(did);", "CREATE TABLE emoji_keywords_v2(lang TEXT, keyword TEXT, emoji TEXT, PRIMARY KEY(lang, keyword, emoji));", "CREATE INDEX IF NOT EXISTS emoji_keywords_v2_keyword ON emoji_keywords_v2(keyword);", "CREATE TABLE emoji_keywords_info_v2(lang TEXT PRIMARY KEY, alias TEXT, version INTEGER, date INTEGER);");
        l0.u(sQLiteDatabase, "CREATE TABLE wallpapers2(uid INTEGER PRIMARY KEY, data BLOB, num INTEGER)", "CREATE INDEX IF NOT EXISTS wallpapers_num ON wallpapers2(num);", "CREATE TABLE unread_push_messages(uid INTEGER, mid INTEGER, random INTEGER, date INTEGER, data BLOB, fm TEXT, name TEXT, uname TEXT, flags INTEGER, topicId INTEGER, is_reaction INTEGER, PRIMARY KEY(uid, mid))", "CREATE INDEX IF NOT EXISTS unread_push_messages_idx_date ON unread_push_messages(date);");
        l0.u(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS unread_push_messages_idx_random ON unread_push_messages(random);", "CREATE TABLE polls_v2(mid INTEGER, uid INTEGER, id INTEGER, PRIMARY KEY (mid, uid));", "CREATE INDEX IF NOT EXISTS polls_id_v2 ON polls_v2(id);", "CREATE TABLE reactions(data BLOB, hash INTEGER, date INTEGER);");
        l0.u(sQLiteDatabase, "CREATE TABLE reaction_mentions(message_id INTEGER, state INTEGER, dialog_id INTEGER, PRIMARY KEY(message_id, dialog_id))", "CREATE INDEX IF NOT EXISTS reaction_mentions_did ON reaction_mentions(dialog_id);", "CREATE TABLE downloading_documents(data BLOB, hash INTEGER, id INTEGER, state INTEGER, date INTEGER, PRIMARY KEY(hash, id));", "CREATE TABLE animated_emoji(document_id INTEGER PRIMARY KEY, data BLOB);");
        l0.u(sQLiteDatabase, "CREATE TABLE attach_menu_bots(data BLOB, hash INTEGER, date INTEGER);", "CREATE TABLE premium_promo(data BLOB, date INTEGER);", "CREATE TABLE emoji_statuses(data BLOB, type INTEGER);", "CREATE TABLE messages_holes_topics(uid INTEGER, topic_id INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, topic_id, start));");
        l0.u(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS uid_end_messages_holes_4_topics ON messages_holes_topics(uid, topic_id, end);", "CREATE TABLE messages_topics(mid INTEGER, uid INTEGER, topic_id INTEGER, read_state INTEGER, send_state INTEGER, date INTEGER, data BLOB, out INTEGER, ttl INTEGER, media INTEGER, replydata BLOB, imp INTEGER, mention INTEGER, forwards INTEGER, replies_data BLOB, thread_reply_id INTEGER, is_channel INTEGER, reply_to_message_id INTEGER, custom_params BLOB, reply_to_story_id INTEGER, PRIMARY KEY(mid, topic_id, uid))", "CREATE INDEX IF NOT EXISTS uid_date_mid_idx_messages_topics ON messages_topics(uid, date, mid);", "CREATE INDEX IF NOT EXISTS mid_out_idx_messages_topics ON messages_topics(mid, out);");
        l0.u(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS task_idx_messages_topics ON messages_topics(uid, out, read_state, ttl, date, send_state);", "CREATE INDEX IF NOT EXISTS send_state_idx_messages_topics ON messages_topics(mid, send_state, date);", "CREATE INDEX IF NOT EXISTS is_channel_idx_messages_topics ON messages_topics(mid, is_channel);", "CREATE INDEX IF NOT EXISTS reply_to_idx_messages_topics ON messages_topics(mid, reply_to_message_id);");
        l0.u(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS idx_to_reply_messages_topics ON messages_topics(reply_to_message_id, mid);", "CREATE INDEX IF NOT EXISTS mid_uid_messages_topics ON messages_topics(mid, uid);", "CREATE INDEX IF NOT EXISTS uid_mid_read_out_idx_messages_topics ON messages_topics(uid, topic_id, mid, read_state, out);", "CREATE INDEX IF NOT EXISTS uid_mention_idx_messages_topics ON messages_topics(uid, topic_id, mention, read_state);");
        l0.u(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS uid_topic_id_messages_topics ON messages_topics(uid, topic_id);", "CREATE INDEX IF NOT EXISTS uid_topic_id_date_mid_messages_topics ON messages_topics(uid, topic_id, date, mid);", "CREATE INDEX IF NOT EXISTS uid_topic_id_mid_messages_topics ON messages_topics(uid, topic_id, mid);", "CREATE TABLE media_topics(mid INTEGER, uid INTEGER, topic_id INTEGER, date INTEGER, type INTEGER, data BLOB, PRIMARY KEY(mid, uid, topic_id, type))");
        l0.u(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS uid_mid_type_date_idx_media_topics ON media_topics(uid, topic_id, mid, type, date);", "CREATE TABLE media_holes_topics(uid INTEGER, topic_id INTEGER, type INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, topic_id, type, start));", "CREATE INDEX IF NOT EXISTS uid_end_media_holes_topics ON media_holes_topics(uid, topic_id, type, end);", "CREATE TABLE topics(did INTEGER, topic_id INTEGER, data BLOB, top_message INTEGER, topic_message BLOB, unread_count INTEGER, max_read_id INTEGER, unread_mentions INTEGER, unread_reactions INTEGER, read_outbox INTEGER, pinned INTEGER, total_messages_count INTEGER, hidden INTEGER, edit_date INTEGER, nopaid_messages_exception INTEGER, unread_poll_votes INTEGER, PRIMARY KEY(did, topic_id));");
        l0.u(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS did_top_message_topics ON topics(did, top_message);", "CREATE INDEX IF NOT EXISTS did_topics ON topics(did);", "CREATE TABLE media_counts_topics(uid INTEGER, topic_id INTEGER, type INTEGER, count INTEGER, old INTEGER, PRIMARY KEY(uid, topic_id, type))", "CREATE TABLE reaction_mentions_topics(message_id INTEGER, state INTEGER, dialog_id INTEGER, topic_id INTEGER, PRIMARY KEY(message_id, dialog_id, topic_id))");
        l0.u(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS reaction_mentions_topics_did ON reaction_mentions_topics(dialog_id, topic_id);", "CREATE TABLE emoji_groups(type INTEGER PRIMARY KEY, data BLOB)", "CREATE TABLE app_config(data BLOB)", "CREATE TABLE web_browser_settings(data BLOB)");
        l0.u(sQLiteDatabase, "CREATE TABLE effects(data BLOB)", "CREATE TABLE stories (dialog_id INTEGER, story_id INTEGER, data BLOB, custom_params BLOB, PRIMARY KEY (dialog_id, story_id));", "CREATE TABLE stories_counter (dialog_id INTEGER PRIMARY KEY, count INTEGER, max_read INTEGER);", "CREATE TABLE profile_stories (dialog_id INTEGER, story_id INTEGER, data BLOB, type INTEGER, seen INTEGER, pin INTEGER, PRIMARY KEY(dialog_id, story_id, type));");
        l0.u(sQLiteDatabase, "CREATE TABLE profile_stories_albums (dialog_id INTEGER, album_id INTEGER, order_index INTEGER, data BLOB, PRIMARY KEY(dialog_id, album_id));", "CREATE TABLE profile_stories_albums_links (dialog_id INTEGER, album_id INTEGER, story_id INTEGER, order_index INTEGER, PRIMARY KEY (dialog_id, album_id, story_id));", "CREATE TABLE story_drafts (id INTEGER PRIMARY KEY, date INTEGER, data BLOB, type INTEGER);", "CREATE TABLE story_pushes (uid INTEGER, sid INTEGER, date INTEGER, localName TEXT, flags INTEGER, expire_date INTEGER, live INTEGER, PRIMARY KEY(uid, sid));");
        l0.u(sQLiteDatabase, "CREATE TABLE unconfirmed_auth (data BLOB);", "CREATE TABLE saved_reaction_tags (topic_id INTEGER PRIMARY KEY, data BLOB);", "CREATE TABLE tag_message_id(mid INTEGER, topic_id INTEGER, tag INTEGER, text TEXT);", "CREATE INDEX IF NOT EXISTS tag_idx_tag_message_id ON tag_message_id(tag);");
        l0.u(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS tag_text_idx_tag_message_id ON tag_message_id(tag, text COLLATE NOCASE);", "CREATE INDEX IF NOT EXISTS tag_topic_idx_tag_message_id ON tag_message_id(topic_id, tag);", "CREATE INDEX IF NOT EXISTS tag_topic_text_idx_tag_message_id ON tag_message_id(topic_id, tag, text COLLATE NOCASE);", "CREATE TABLE business_replies(topic_id INTEGER PRIMARY KEY, name TEXT, order_value INTEGER, count INTEGER);");
        l0.u(sQLiteDatabase, "CREATE TABLE quick_replies_messages(mid INTEGER, topic_id INTEGER, send_state INTEGER, date INTEGER, data BLOB, ttl INTEGER, replydata BLOB, reply_to_message_id INTEGER, PRIMARY KEY(mid, topic_id))", "CREATE INDEX IF NOT EXISTS send_state_idx_quick_replies_messages ON quick_replies_messages(mid, send_state, date);", "CREATE INDEX IF NOT EXISTS topic_date_idx_quick_replies_messages ON quick_replies_messages(topic_id, date);", "CREATE INDEX IF NOT EXISTS reply_to_idx_quick_replies_messages ON quick_replies_messages(mid, reply_to_message_id);");
        l0.u(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS idx_to_reply_quick_replies_messages ON quick_replies_messages(reply_to_message_id, mid);", "CREATE TABLE welcome_messages(mid INTEGER, dialog_id INTEGER, send_state INTEGER, date INTEGER, data BLOB, ttl INTEGER, replydata BLOB, reply_to_message_id INTEGER, PRIMARY KEY(mid, dialog_id))", "CREATE INDEX IF NOT EXISTS send_state_idx_welcome_messages ON welcome_messages(mid, send_state, date);", "CREATE INDEX IF NOT EXISTS dialog_date_idx_welcome_messages ON welcome_messages(dialog_id, date);");
        l0.u(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS reply_to_idx_welcome_messages ON welcome_messages(mid, reply_to_message_id);", "CREATE INDEX IF NOT EXISTS idx_to_reply_welcome_messages ON welcome_messages(reply_to_message_id, mid);", "CREATE TABLE business_links(data BLOB, order_value INTEGER);", "CREATE TABLE fact_checks(hash INTEGER PRIMARY KEY, data BLOB, expires INTEGER);");
        l0.u(sQLiteDatabase, "CREATE TABLE popular_bots(uid INTEGER PRIMARY KEY, time INTEGER, offset TEXT, pos INTEGER);", "CREATE TABLE star_gifts2(id INTEGER PRIMARY KEY, data BLOB, hash INTEGER, time INTEGER, pos INTEGER);", "CREATE TABLE gift_themes (slug TEXT PRIMARY KEY, data BLOB);", "CREATE TABLE poll_votes_mentions(message_id INTEGER, state INTEGER, dialog_id INTEGER, PRIMARY KEY(message_id, dialog_id))");
        l0.u(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS poll_votes_mentions_did ON poll_votes_mentions(dialog_id);", "CREATE TABLE poll_votes_mentions_topics(message_id INTEGER, state INTEGER, dialog_id INTEGER, topic_id INTEGER, PRIMARY KEY(message_id, dialog_id, topic_id))", "CREATE INDEX IF NOT EXISTS poll_votes_mentions_topics_did ON poll_votes_mentions_topics(dialog_id, topic_id);", "CREATE TABLE ephemeral_messages (id INTEGER, dialog_id INTEGER, topic_id INTEGER, date INTEGER, data BLOB, PRIMARY KEY(dialog_id, id));");
        l0.s(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS ephemeral_messages_date_idx ON ephemeral_messages(date);", "PRAGMA user_version = 177");
    }

    private void createTaskForSecretMedia(long j10, SparseArray<ArrayList<Integer>> sparseArray) {
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                ArrayList arrayList = new ArrayList();
                if (sparseArray.size() != 0) {
                    this.database.beginTransaction();
                    SQLitePreparedStatement executeFast = this.database.executeFast("REPLACE INTO enc_tasks_v4 VALUES(?, ?, ?, ?)");
                    int i9 = Integer.MAX_VALUE;
                    for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                        try {
                            int keyAt = sparseArray.keyAt(i10);
                            ArrayList<Integer> arrayList2 = sparseArray.get(keyAt);
                            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                                int intValue = arrayList2.get(i11).intValue();
                                executeFast.requery();
                                executeFast.bindInteger(1, intValue);
                                executeFast.bindLong(2, j10);
                                executeFast.bindInteger(3, keyAt);
                                executeFast.bindInteger(4, 1);
                                i9 = Math.min(i9, intValue);
                                executeFast.step();
                                arrayList.add(arrayList2.get(i11));
                            }
                        } catch (Exception e10) {
                            e = e10;
                            sQLitePreparedStatement = executeFast;
                            checkSQLException(e);
                            SQLiteDatabase sQLiteDatabase = this.database;
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.commitTransaction();
                            }
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            th = th;
                            sQLitePreparedStatement = executeFast;
                            SQLiteDatabase sQLiteDatabase2 = this.database;
                            if (sQLiteDatabase2 != null) {
                                sQLiteDatabase2.commitTransaction();
                            }
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                            }
                            throw th;
                        }
                    }
                    executeFast.dispose();
                    this.database.commitTransaction();
                    SQLiteDatabase sQLiteDatabase3 = this.database;
                    Locale locale = Locale.US;
                    String join = TextUtils.join(", ", arrayList);
                    sQLiteDatabase3.executeFast("UPDATE messages_v2 SET ttl = 0 WHERE uid = " + j10 + " AND mid IN(" + join + ")").stepThis().dispose();
                    getMessagesController().didAddedNewTask(i9, j10, sparseArray);
                }
                SQLiteDatabase sQLiteDatabase4 = this.database;
                if (sQLiteDatabase4 != null) {
                    sQLiteDatabase4.commitTransaction();
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public void lambda$deleteDialogFilter$72(MessagesController.DialogFilter dialogFilter) {
        try {
            this.dialogFilters.remove(dialogFilter);
            this.dialogFiltersMap.remove(dialogFilter.f19649id);
            SQLiteDatabase sQLiteDatabase = this.database;
            sQLiteDatabase.executeFast("DELETE FROM dialog_filter WHERE id = " + dialogFilter.f19649id).stepThis().dispose();
            SQLiteDatabase sQLiteDatabase2 = this.database;
            sQLiteDatabase2.executeFast("DELETE FROM dialog_filter_ep WHERE id = " + dialogFilter.f19649id).stepThis().dispose();
            SQLiteDatabase sQLiteDatabase3 = this.database;
            sQLiteDatabase3.executeFast("DELETE FROM dialog_filter_pin_v2 WHERE id = " + dialogFilter.f19649id).stepThis().dispose();
        } catch (Exception e10) {
            checkSQLException(e10);
        }
    }

    private a0.h deleteEphemeralMessagesInternal(a0.h r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.deleteEphemeralMessagesInternal(a0.h, boolean):a0.h");
    }

    private void deleteFromDownloadQueue(java.util.ArrayList<android.util.Pair<java.lang.Long, java.lang.Integer>> r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.deleteFromDownloadQueue(java.util.ArrayList, boolean):void");
    }

    private void doneHolesInTable(String str, long j10, int i9, long j11) {
        SQLitePreparedStatement executeFast;
        int i10 = 2;
        int i11 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        if (i11 != 0) {
            if (i9 == 0) {
                this.database.executeFast(String.format(Locale.US, aa.d.o("DELETE FROM ", str, " WHERE uid = %d AND topic_id = %d"), Long.valueOf(j10), Long.valueOf(j11))).stepThis().dispose();
            } else {
                this.database.executeFast(String.format(Locale.US, aa.d.o("DELETE FROM ", str, " WHERE uid = %d AND topic_id = %d AND start = 0"), Long.valueOf(j10), Long.valueOf(j11))).stepThis().dispose();
            }
        } else if (i9 == 0) {
            this.database.executeFast(String.format(Locale.US, aa.d.o("DELETE FROM ", str, " WHERE uid = %d"), Long.valueOf(j10))).stepThis().dispose();
        } else {
            this.database.executeFast(String.format(Locale.US, aa.d.o("DELETE FROM ", str, " WHERE uid = %d AND start = 0"), Long.valueOf(j10))).stepThis().dispose();
        }
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                if (i11 != 0) {
                    SQLiteDatabase sQLiteDatabase = this.database;
                    executeFast = sQLiteDatabase.executeFast("REPLACE INTO " + str + " VALUES(?, ?, ?, ?)");
                } else {
                    SQLiteDatabase sQLiteDatabase2 = this.database;
                    executeFast = sQLiteDatabase2.executeFast("REPLACE INTO " + str + " VALUES(?, ?, ?)");
                }
                sQLitePreparedStatement = executeFast;
                sQLitePreparedStatement.requery();
                sQLitePreparedStatement.bindLong(1, j10);
                if (i11 != 0) {
                    sQLitePreparedStatement.bindLong(2, j11);
                    i10 = 3;
                }
                sQLitePreparedStatement.bindInteger(i10, 1);
                sQLitePreparedStatement.bindInteger(i10 + 1, 1);
                sQLitePreparedStatement.step();
                sQLitePreparedStatement.dispose();
            } catch (Exception e10) {
                throw e10;
            }
        } catch (Throwable th) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    private void ensureOpened() {
        try {
            this.openSync.await();
        } catch (Throwable unused) {
        }
    }

    private void executeInStorageQueue(Runnable runnable) {
        if (this.storageQueue.getHandler().getLooper() != Looper.myLooper()) {
            this.storageQueue.postRunnable(runnable);
        } else {
            runnable.run();
        }
    }

    private void fixUnsupportedMedia(TLRPC.Message message) {
        if (message != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaUnsupported_old) {
                if (messageMedia.bytes.length == 0) {
                    messageMedia.bytes = Utilities.intToBytes(229);
                }
            } else if (messageMedia instanceof TLRPC.TL_messageMediaUnsupported) {
                TLRPC.TL_messageMediaUnsupported_old tL_messageMediaUnsupported_old = new TLRPC.TL_messageMediaUnsupported_old();
                message.media = tL_messageMediaUnsupported_old;
                tL_messageMediaUnsupported_old.bytes = Utilities.intToBytes(229);
                message.flags |= 512;
            }
        }
    }

    private String formatUserSearchName(TLRPC.User user) {
        StringBuilder sb2 = new StringBuilder();
        String str = user.first_name;
        if (str != null && str.length() > 0) {
            sb2.append(user.first_name);
        }
        String str2 = user.last_name;
        if (str2 != null && str2.length() > 0) {
            if (sb2.length() > 0) {
                sb2.append(" ");
            }
            sb2.append(user.last_name);
        }
        sb2.append(";;;");
        String str3 = user.username;
        if (str3 != null && str3.length() > 0) {
            sb2.append(user.username);
        } else {
            ArrayList<TLRPC.TL_username> arrayList = user.usernames;
            if (arrayList != null && arrayList.size() > 0) {
                for (int i9 = 0; i9 < user.usernames.size(); i9++) {
                    TLRPC.TL_username tL_username = user.usernames.get(i9);
                    if (tL_username != null && tL_username.active) {
                        sb2.append(tL_username.username);
                        sb2.append(";;");
                    }
                }
            }
        }
        return sb2.toString().toLowerCase();
    }

    private int getDialogFolderIdInternal(long j10) {
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                int i9 = -1;
                if (this.unknownDialogsIds.f(j10) == null) {
                    sQLiteCursor = this.database.queryFinalized("SELECT folder_id FROM dialogs WHERE did = ?", Long.valueOf(j10));
                    if (sQLiteCursor.next()) {
                        i9 = sQLiteCursor.intValue(0);
                    }
                    sQLiteCursor.dispose();
                }
                return i9;
            } catch (Exception e10) {
                checkSQLException(e10);
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
                return 0;
            }
        } finally {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
        }
    }

    private org.telegram.tgnet.tl.TL_ephemeral.EphemeralMessage getEphemeralMessageInternal(long r5, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.getEphemeralMessageInternal(long, int):org.telegram.tgnet.tl.TL_ephemeral$EphemeralMessage");
    }

    private ArrayList<TL_ephemeral.EphemeralMessage> getEphemeralMessagesInternal(long j10, long j11) {
        ArrayList<TL_ephemeral.EphemeralMessage> arrayList = new ArrayList<>();
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                sQLiteCursor = this.database.queryFinalized("SELECT data FROM ephemeral_messages WHERE dialog_id = ? AND topic_id = ? AND date >= ? ORDER BY date DESC LIMIT 30", Long.valueOf(j10), Long.valueOf(j11), Integer.valueOf(getConnectionsManager().getCurrentTime() - 172800));
                while (sQLiteCursor.next()) {
                    TL_ephemeral.EphemeralMessage ephemeralMessage = (TL_ephemeral.EphemeralMessage) sQLiteCursor.tlObjectValue(0, new b(29), false);
                    if (ephemeralMessage != null && ephemeralMessage.anchor_msg_id == 0) {
                        arrayList.add(ephemeralMessage);
                    }
                }
                sQLiteCursor.dispose();
                return arrayList;
            } catch (Exception e10) {
                checkSQLException(e10);
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
                return arrayList;
            }
        } catch (Throwable th) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    public static MessagesStorage getInstance(int i9) {
        MessagesStorage messagesStorage;
        MessagesStorage messagesStorage2 = Instance[i9];
        if (messagesStorage2 == null) {
            synchronized (lockObjects[i9]) {
                try {
                    messagesStorage = Instance[i9];
                    if (messagesStorage == null) {
                        MessagesStorage[] messagesStorageArr = Instance;
                        MessagesStorage messagesStorage3 = new MessagesStorage(i9);
                        messagesStorageArr[i9] = messagesStorage3;
                        messagesStorage = messagesStorage3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return messagesStorage;
        }
        return messagesStorage2;
    }

    private TLRPC.Message getMessageInternal(long j10, long j11) {
        TLRPC.Message message;
        SQLiteCursor sQLiteCursor = null;
        TLRPC.Message message2 = null;
        SQLiteCursor sQLiteCursor2 = null;
        try {
            try {
                SQLiteCursor queryFinalized = this.database.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j10 + " AND mid = " + j11 + " LIMIT 1", new Object[0]);
                while (queryFinalized.next()) {
                    try {
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                        if (byteBufferValue != null) {
                            TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            if (TLdeserialize != null) {
                                TLdeserialize.readAttachPath(byteBufferValue, getUserConfig().clientUserId);
                            }
                            byteBufferValue.reuse();
                            message2 = TLdeserialize;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        TLRPC.Message message3 = message2;
                        sQLiteCursor = queryFinalized;
                        message = message3;
                        checkSQLException(e);
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        return message;
                    } catch (Throwable th) {
                        th = th;
                        sQLiteCursor2 = queryFinalized;
                        if (sQLiteCursor2 != null) {
                            sQLiteCursor2.dispose();
                        }
                        throw th;
                    }
                }
                queryFinalized.dispose();
                return message2;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e11) {
            e = e11;
            message = null;
        }
    }

    private boolean isChatCollapsedInCommunity(a0.h hVar, TLRPC.Chat chat) {
        long j10 = chat.linked_community_id;
        if (j10 != 0) {
            TLRPC.Chat chat2 = (TLRPC.Chat) hVar.f(j10);
            if (chat2 == null) {
                chat2 = getChat(chat.linked_community_id);
                hVar.k(chat2, chat.linked_community_id);
            }
            if (chat2 != null && chat2.collapsed_in_dialogs) {
                return true;
            }
        }
        return false;
    }

    private static boolean isEmpty(SparseArray<?> sparseArray) {
        return sparseArray == null || sparseArray.size() == 0;
    }

    private void isForumCacheInvalidate(long j10) {
        this.dialogIsForumTyped.delete(j10);
    }

    private static boolean isMessageActionTypeWithReply(TLRPC.MessageAction messageAction) {
        if (!(messageAction instanceof TLRPC.TL_messageActionPinMessage) && !(messageAction instanceof TLRPC.TL_messageActionPaymentSent) && !(messageAction instanceof TLRPC.TL_messageActionGameScore) && !(messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) && !(messageAction instanceof TLRPC.TL_messageActionPollAppendAnswer) && !(messageAction instanceof TLRPC.TL_messageActionPollDeleteAnswer)) {
            return false;
        }
        return true;
    }

    private boolean isUserCollapsedInCommunity(a0.h hVar, TLRPC.User user) {
        long j10 = user.linked_community_id;
        if (j10 != 0) {
            TLRPC.Chat chat = (TLRPC.Chat) hVar.f(j10);
            if (chat == null) {
                chat = getChat(user.linked_community_id);
                hVar.k(chat, user.linked_community_id);
            }
            if (chat != null && chat.collapsed_in_dialogs) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValidKeyboardToSave(TLRPC.Message message) {
        TLRPC.ReplyMarkup replyMarkup = message.reply_markup;
        if (replyMarkup != null && !(replyMarkup instanceof TLRPC.TL_replyInlineMarkup)) {
            if (!replyMarkup.selective || message.mentioned) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void lambda$addRecentLocalFile$82(TLRPC.Document document, String str, String str2) {
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                if (document != null) {
                    sQLitePreparedStatement = this.database.executeFast("UPDATE web_recent_v3 SET document = ? WHERE image_url = ?");
                    sQLitePreparedStatement.requery();
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(document.getObjectSize());
                    document.serializeToStream(nativeByteBuffer);
                    sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer);
                    sQLitePreparedStatement.bindString(2, str);
                    sQLitePreparedStatement.step();
                    sQLitePreparedStatement.dispose();
                    nativeByteBuffer.reuse();
                } else {
                    sQLitePreparedStatement = this.database.executeFast("UPDATE web_recent_v3 SET local_url = ? WHERE image_url = ?");
                    sQLitePreparedStatement.requery();
                    sQLitePreparedStatement.bindString(1, str2);
                    sQLitePreparedStatement.bindString(2, str);
                    sQLitePreparedStatement.step();
                    sQLitePreparedStatement.dispose();
                }
                sQLitePreparedStatement.dispose();
            } catch (Exception e10) {
                checkSQLException(e10);
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
            }
        } catch (Throwable th) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    public void lambda$applyPhoneBookUpdates$148(String str, String str2) {
        try {
            if (str.length() != 0) {
                SQLiteDatabase sQLiteDatabase = this.database;
                Locale locale = Locale.US;
                sQLiteDatabase.executeFast("UPDATE user_phones_v7 SET deleted = 0 WHERE sphone IN(" + str + ")").stepThis().dispose();
            }
            if (str2.length() != 0) {
                SQLiteDatabase sQLiteDatabase2 = this.database;
                Locale locale2 = Locale.US;
                sQLiteDatabase2.executeFast("UPDATE user_phones_v7 SET deleted = 1 WHERE sphone IN(" + str2 + ")").stepThis().dispose();
            }
        } catch (Exception e10) {
            checkSQLException(e10);
        }
    }

    public void lambda$broadcastQuickRepliesMessagesChange$223() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
    }

    public void lambda$broadcastScheduledMessagesChange$222(Long l10, int i9) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.scheduledMessagesUpdated, l10, Integer.valueOf(i9), Boolean.TRUE);
    }

    public void lambda$checkIfFolderEmptyInternal$245(int i9) {
        getMessagesController().onFolderEmpty(i9);
    }

    public static int lambda$checkLoadedRemoteFilters$68(LongSparseIntArray longSparseIntArray, Long l10, Long l11) {
        int i9 = longSparseIntArray.get(l10.longValue());
        int i10 = longSparseIntArray.get(l11.longValue());
        if (i9 > i10) {
            return 1;
        }
        if (i9 < i10) {
            return -1;
        }
        return 0;
    }

    public void lambda$checkLoadedRemoteFilters$69(java.util.ArrayList r34, java.lang.Runnable r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$checkLoadedRemoteFilters$69(java.util.ArrayList, java.lang.Runnable):void");
    }

    public void lambda$checkMessageByRandomId$153(long r5, boolean[] r7, java.util.concurrent.CountDownLatch r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$checkMessageByRandomId$153(long, boolean[], java.util.concurrent.CountDownLatch):void");
    }

    public void lambda$checkMessageId$154(long r5, int r7, boolean[] r8, java.util.concurrent.CountDownLatch r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$checkMessageId$154(long, int, boolean[], java.util.concurrent.CountDownLatch):void");
    }

    public void lambda$checkSQLException$8() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onDatabaseReset, new Object[0]);
    }

    public void lambda$cleanup$5() {
        getMessagesController().getDifference();
    }

    public void lambda$cleanup$6(boolean z10) {
        cleanupInternal(true);
        openDatabase(1);
        if (z10) {
            Utilities.stageQueue.postRunnable(new f2(this, 24));
        }
    }

    public void lambda$clearDownloadQueue$184(int i9) {
        try {
            if (i9 == 0) {
                this.database.executeFast("DELETE FROM download_queue WHERE 1").stepThis().dispose();
                return;
            }
            SQLiteDatabase sQLiteDatabase = this.database;
            Locale locale = Locale.US;
            sQLiteDatabase.executeFast("DELETE FROM download_queue WHERE type = " + i9).stepThis().dispose();
        } catch (Exception e10) {
            checkSQLException(e10);
        }
    }

    public void lambda$clearLocalDatabase$43() {
        getMessagesController().getSavedMessagesController().cleanup();
    }

    public void lambda$clearLocalDatabase$44() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$clearLocalDatabase$44():void");
    }

    public void lambda$clearSentMedia$163() {
        try {
            this.database.executeFast("DELETE FROM sent_files_v2 WHERE 1").stepThis().dispose();
        } catch (Exception e10) {
            checkSQLException(e10);
        }
    }

    public void lambda$clearUserPhoto$93(long j10, long j11) {
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            sQLiteDatabase.executeFast("DELETE FROM dialog_photos WHERE uid = " + j10 + " AND id = " + j11).stepThis().dispose();
            SQLiteDatabase sQLiteDatabase2 = this.database;
            sQLiteDatabase2.executeFast("UPDATE dialog_photos_count SET count = count - 1 WHERE uid = " + j10 + " AND count > 0").stepThis().dispose();
        } catch (Exception e10) {
            checkSQLException(e10);
        }
    }

    public void lambda$clearUserPhotos$92(long j10) {
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            sQLiteDatabase.executeFast("DELETE FROM dialog_photos WHERE uid = " + j10).stepThis().dispose();
            SQLiteDatabase sQLiteDatabase2 = this.database;
            sQLiteDatabase2.executeFast("DELETE FROM dialog_photos_count WHERE uid = " + j10).stepThis().dispose();
        } catch (Exception e10) {
            checkSQLException(e10);
        }
    }

    public void lambda$clearWidgetDialogs$167(int i9) {
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            sQLiteDatabase.executeFast("DELETE FROM shortcut_widget WHERE id = " + i9).stepThis().dispose();
        } catch (Exception e10) {
            checkSQLException(e10);
        }
    }

    public void lambda$containsLocalDialog$179(long r5, java.lang.Boolean[] r7, java.util.concurrent.CountDownLatch r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$containsLocalDialog$179(long, java.lang.Boolean[], java.util.concurrent.CountDownLatch):void");
    }

    public void lambda$createOrEditTopic$199(long j10, TLRPC.TL_forumTopic tL_forumTopic) {
        getMessagesController().getTopicsController().onTopicCreated(j10, tL_forumTopic, false);
    }

    public void lambda$createPendingTask$10(long j10, NativeByteBuffer nativeByteBuffer) {
        try {
            SQLitePreparedStatement executeFast = this.database.executeFast("REPLACE INTO pending_tasks VALUES(?, ?)");
            executeFast.bindLong(1, j10);
            executeFast.bindByteBuffer(2, nativeByteBuffer);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e10) {
            checkSQLException(e10);
        } finally {
            nativeByteBuffer.reuse();
        }
    }

    public void lambda$createTaskForMid$115(boolean z10, long j10, ArrayList arrayList) {
        long j11;
        ArrayList arrayList2;
        if (!z10) {
            j11 = j10;
            arrayList2 = arrayList;
            markMessagesContentAsRead(j11, arrayList2, 0, 0);
        } else {
            j11 = j10;
            arrayList2 = arrayList;
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesReadContent, Long.valueOf(j11), arrayList2);
    }

    public void lambda$createTaskForMid$116(int i9, int i10, int i11, int i12, boolean z10, long j10) {
        Throwable th;
        Exception exc;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                int max = Math.max(i9, i10) + i11;
                SparseArray<ArrayList<Integer>> sparseArray = new SparseArray<>();
                ArrayList<Integer> arrayList = new ArrayList<>();
                arrayList.add(Integer.valueOf(i12));
                sparseArray.put(max, arrayList);
                AndroidUtilities.runOnUIThread(new q8(this, z10, j10, arrayList, 5));
                SQLitePreparedStatement executeFast = this.database.executeFast("REPLACE INTO enc_tasks_v4 VALUES(?, ?, ?, ?)");
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    try {
                        int keyAt = sparseArray.keyAt(i13);
                        ArrayList<Integer> arrayList2 = sparseArray.get(keyAt);
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            executeFast.requery();
                            executeFast.bindInteger(1, arrayList2.get(i14).intValue());
                            executeFast.bindLong(2, j10);
                            executeFast.bindInteger(3, keyAt);
                            executeFast.bindInteger(4, 1);
                            executeFast.step();
                        }
                    } catch (Exception e10) {
                        exc = e10;
                        sQLitePreparedStatement = executeFast;
                        checkSQLException(exc);
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        sQLitePreparedStatement = executeFast;
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th;
                    }
                }
                executeFast.dispose();
                SQLiteDatabase sQLiteDatabase = this.database;
                Locale locale = Locale.US;
                sQLiteDatabase.executeFast("UPDATE messages_v2 SET ttl = 0 WHERE mid = " + i12 + " AND uid = " + j10).stepThis().dispose();
                getMessagesController().didAddedNewTask(max, j10, sparseArray);
            } catch (Exception e11) {
                exc = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public void lambda$createTaskForSecretChat$117(long j10, ArrayList arrayList) {
        markMessagesContentAsRead(j10, arrayList, 0, 0);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesReadContent, Long.valueOf(j10), arrayList);
    }

    public void lambda$createTaskForSecretChat$118(int i9, ArrayList arrayList, int i10, int i11, int i12) {
        SQLiteCursor sQLiteCursor;
        long j10;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            long makeEncryptedDialogId = DialogObject.makeEncryptedDialogId(i9);
            SparseArray<ArrayList<Integer>> sparseArray = new SparseArray<>();
            ArrayList arrayList2 = new ArrayList();
            StringBuilder sb2 = new StringBuilder();
            int i13 = Integer.MAX_VALUE;
            if (arrayList == null) {
                SQLiteDatabase sQLiteDatabase = this.database;
                Locale locale = Locale.US;
                sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT mid, ttl FROM messages_v2 WHERE uid = " + makeEncryptedDialogId + " AND out = " + i10 + " AND read_state > 0 AND ttl > 0 AND date <= " + i11 + " AND send_state = 0 AND media != 1", new Object[0]);
            } else {
                String join = TextUtils.join(",", arrayList);
                SQLiteDatabase sQLiteDatabase2 = this.database;
                Locale locale2 = Locale.US;
                sQLiteCursor = sQLiteDatabase2.queryFinalized("SELECT m.mid, m.ttl FROM messages_v2 as m INNER JOIN randoms_v2 as r ON m.mid = r.mid AND m.uid = r.uid WHERE r.random_id IN (" + join + ")", new Object[0]);
            }
            while (sQLiteCursor.next()) {
                try {
                    try {
                        int intValue = sQLiteCursor.intValue(1);
                        int intValue2 = sQLiteCursor.intValue(0);
                        if (arrayList != null) {
                            arrayList2.add(Integer.valueOf(intValue2));
                        }
                        if (intValue > 0) {
                            int max = Math.max(i11, i12) + intValue;
                            i13 = Math.min(i13, max);
                            ArrayList<Integer> arrayList3 = sparseArray.get(max);
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList<>();
                                sparseArray.put(max, arrayList3);
                            }
                            if (sb2.length() != 0) {
                                sb2.append(",");
                            }
                            sb2.append(intValue2);
                            arrayList3.add(Integer.valueOf(intValue2));
                        }
                    } catch (Exception e10) {
                        e = e10;
                    }
                } catch (Throwable th) {
                    th = th;
                }
            }
            sQLiteCursor.dispose();
            if (arrayList != null) {
                j10 = makeEncryptedDialogId;
                AndroidUtilities.runOnUIThread(new ne(this, j10, arrayList2, 7));
            } else {
                j10 = makeEncryptedDialogId;
            }
            if (sparseArray.size() != 0) {
                this.database.beginTransaction();
                SQLitePreparedStatement executeFast = this.database.executeFast("REPLACE INTO enc_tasks_v4 VALUES(?, ?, ?, ?)");
                for (int i14 = 0; i14 < sparseArray.size(); i14++) {
                    try {
                        int keyAt = sparseArray.keyAt(i14);
                        ArrayList<Integer> arrayList4 = sparseArray.get(keyAt);
                        for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                            executeFast.requery();
                            executeFast.bindInteger(1, arrayList4.get(i15).intValue());
                            executeFast.bindLong(2, j10);
                            executeFast.bindInteger(3, keyAt);
                            executeFast.bindInteger(4, 0);
                            executeFast.step();
                        }
                    } catch (Exception e11) {
                        e = e11;
                        sQLiteCursor = null;
                        sQLitePreparedStatement = executeFast;
                        checkSQLException(e);
                        SQLiteDatabase sQLiteDatabase3 = this.database;
                        if (sQLiteDatabase3 != null) {
                            sQLiteDatabase3.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteCursor = null;
                        sQLitePreparedStatement = executeFast;
                        SQLiteDatabase sQLiteDatabase4 = this.database;
                        if (sQLiteDatabase4 != null) {
                            sQLiteDatabase4.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th;
                    }
                }
                executeFast.dispose();
                this.database.commitTransaction();
                SQLiteDatabase sQLiteDatabase5 = this.database;
                Locale locale3 = Locale.US;
                sQLiteDatabase5.executeFast("UPDATE messages_v2 SET ttl = 0 WHERE mid IN(" + sb2.toString() + ") AND uid = " + j10).stepThis().dispose();
                getMessagesController().didAddedNewTask(i13, j10, sparseArray);
            }
            SQLiteDatabase sQLiteDatabase6 = this.database;
            if (sQLiteDatabase6 != null) {
                sQLiteDatabase6.commitTransaction();
            }
        } catch (Exception e12) {
            e = e12;
            sQLiteCursor = null;
        } catch (Throwable th3) {
            th = th3;
            sQLiteCursor = null;
        }
    }

    public void lambda$deleteAllReactionsFromChat$83(SparseArray sparseArray, long j10) {
        if (sparseArray.size() != 0) {
            int min = Math.min(sparseArray.size(), 100);
            for (int i9 = 0; i9 < min; i9++) {
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(j10), Integer.valueOf(sparseArray.keyAt(i9)), (TLRPC.TL_messageReactions) sparseArray.valueAt(i9));
            }
        }
    }

    public void lambda$deleteAllReactionsFromChat$84(int r20, long r21, long r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$deleteAllReactionsFromChat$84(int, long, long):void");
    }

    public void lambda$deleteAllStoryPushMessages$40() {
        try {
            this.database.executeFast("DELETE FROM story_pushes").stepThis().dispose();
        } catch (Exception e10) {
            checkSQLException(e10);
        }
    }

    public void lambda$deleteAllStoryReactionPushMessages$41() {
        try {
            this.database.executeFast("DELETE FROM unread_push_messages WHERE is_reaction = 2").stepThis().dispose();
        } catch (Exception e10) {
            checkSQLException(e10);
        }
    }

    public void lambda$deleteContacts$147(ArrayList arrayList) {
        try {
            String join = TextUtils.join(",", arrayList);
            SQLiteDatabase sQLiteDatabase = this.database;
            sQLiteDatabase.executeFast("DELETE FROM contacts WHERE uid IN(" + join + ")").stepThis().dispose();
        } catch (Exception e10) {
            checkSQLException(e10);
        }
    }

    public void lambda$deleteDialog$88(ArrayList arrayList) {
        getFileLoader().cancelLoadFiles(arrayList);
    }

    public void lambda$deleteDialog$89() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needReloadRecentDialogsSearch, new Object[0]);
    }

    public void lambda$deleteDialog$90(int r26, long r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$deleteDialog$90(int, long):void");
    }

    public void lambda$deleteEphemeralMessages$205(a0.h hVar) {
        int m10 = hVar.m();
        for (int i9 = 0; i9 < m10; i9++) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.replaceMessagesObjects, Long.valueOf(hVar.j(i9)), hVar.n(i9));
        }
    }

    public void lambda$deleteEphemeralMessages$206(a0.h hVar, boolean z10) {
        TLRPC.Message messageInternal;
        a0.h deleteEphemeralMessagesInternal = deleteEphemeralMessagesInternal(hVar, z10);
        a0.h hVar2 = new a0.h();
        for (int i9 = 0; i9 < deleteEphemeralMessagesInternal.m(); i9++) {
            long j10 = deleteEphemeralMessagesInternal.j(i9);
            ArrayList arrayList = (ArrayList) deleteEphemeralMessagesInternal.n(i9);
            int size = arrayList.size();
            ArrayList arrayList2 = null;
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                TL_ephemeral.EphemeralMessage ephemeralMessage = (TL_ephemeral.EphemeralMessage) obj;
                int i11 = ephemeralMessage.anchor_msg_id;
                if (i11 != 0) {
                    ff.w wVar = this.ephemeralWelcomeAnchorsState;
                    int i12 = ephemeralMessage.f22593id;
                    a0.h hVar3 = wVar.f6270a;
                    SparseIntArray sparseIntArray = (SparseIntArray) hVar3.f(j10);
                    if (sparseIntArray != null && sparseIntArray.get(i11, -1) == i12) {
                        sparseIntArray.delete(i11);
                        if (sparseIntArray.size() == 0) {
                            hVar3.l(j10);
                        }
                    }
                }
                int i13 = ephemeralMessage.anchor_msg_id;
                if (i13 != 0 && (messageInternal = getMessageInternal(j10, i13)) != null) {
                    if (arrayList2 == null) {
                        arrayList2 = l0.j(j10, hVar2);
                    }
                    arrayList2.add(new MessageObject(this.currentAccount, messageInternal, true, true));
                }
            }
        }
        if (!hVar2.i()) {
            AndroidUtilities.runOnUIThread(new jf(this, hVar2, 3));
        }
    }

    public void lambda$deleteFromDownloadQueue$183(ArrayList arrayList) {
        getDownloadController().cancelDownloading(arrayList);
    }

    public void lambda$deleteSavedDialog$54(long j10, ArrayList arrayList) {
        getMessagesController().markDialogMessageAsDeleted(j10, arrayList);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesDeleted, arrayList, 0L, Boolean.FALSE);
    }

    public void lambda$deleteSavedDialog$55(long r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$deleteSavedDialog$55(long):void");
    }

    public void lambda$deleteStoryPushMessage$39(long j10) {
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            sQLiteDatabase.executeFast("DELETE FROM story_pushes WHERE uid = " + j10).stepThis().dispose();
        } catch (Exception e10) {
            checkSQLException(e10);
        }
    }

    public void lambda$deleteUserChatHistory$85(ArrayList arrayList, long j10, ArrayList arrayList2) {
        getFileLoader().cancelLoadFiles(arrayList);
        getMessagesController().markDialogMessageAsDeleted(j10, arrayList2);
    }

    public void lambda$deleteUserChatHistory$86(ArrayList arrayList, long j10) {
        long j11;
        NotificationCenter notificationCenter = getNotificationCenter();
        int i9 = NotificationCenter.messagesDeleted;
        if (DialogObject.isChatDialog(j10)) {
            j11 = -j10;
        } else {
            j11 = 0;
        }
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i9, arrayList, Long.valueOf(j11), Boolean.FALSE);
    }

    public void lambda$deleteUserChatHistory$87(long r18, long r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$deleteUserChatHistory$87(long, long):void");
    }

    public void lambda$deleteWallpaper$79(long j10) {
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            sQLiteDatabase.executeFast("DELETE FROM wallpapers2 WHERE uid = " + j10).stepThis().dispose();
        } catch (Exception e10) {
            checkSQLException(e10);
        }
    }

    public void lambda$emptyMessagesMedia$96(ArrayList arrayList) {
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateMessageMedia, arrayList.get(i9));
        }
    }

    public void lambda$emptyMessagesMedia$97(ArrayList arrayList) {
        getFileLoader().cancelLoadFiles(arrayList);
    }

    private void lambda$emptyMessagesMedia$98(ArrayList arrayList) {
        if (getMessagesController().getSavedMessagesController().updateSavedDialogs(arrayList)) {
            getMessagesController().getSavedMessagesController().update();
        }
    }

    public void lambda$emptyMessagesMedia$99(java.util.ArrayList r18, long r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$emptyMessagesMedia$99(java.util.ArrayList, long):void");
    }

    public void lambda$fixNotificationSettings$9() {
        try {
            a0.h hVar = new a0.h();
            Map<String, ?> all = MessagesController.getNotificationsSettings(this.currentAccount).getAll();
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                String key = entry.getKey();
                if (key.startsWith("notify2_")) {
                    Integer num = (Integer) entry.getValue();
                    if (num.intValue() != 2 && num.intValue() != 3) {
                    }
                    String replace = key.replace("notify2_", "");
                    long j10 = 1;
                    if (num.intValue() != 2) {
                        Integer num2 = (Integer) all.get("notifyuntil_" + replace);
                        if (num2 != null) {
                            j10 = 1 | (num2.intValue() << 32);
                        }
                    }
                    try {
                        hVar.k(Long.valueOf(j10), Long.parseLong(replace));
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
            }
            try {
                this.database.beginTransaction();
                SQLitePreparedStatement executeFast = this.database.executeFast("REPLACE INTO dialog_settings VALUES(?, ?)");
                for (int i9 = 0; i9 < hVar.m(); i9++) {
                    executeFast.requery();
                    executeFast.bindLong(1, hVar.j(i9));
                    executeFast.bindLong(2, ((Long) hVar.n(i9)).longValue());
                    executeFast.step();
                }
                executeFast.dispose();
                this.database.commitTransaction();
            } catch (Exception e11) {
                checkSQLException(e11);
            }
        } catch (Throwable th) {
            checkSQLException(th);
        }
    }

    public void lambda$fullReset$62() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onDatabaseReset, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didClearDatabase, new Object[0]);
        getMessagesController().getSavedMessagesController().cleanup();
    }

    public void lambda$fullReset$63() {
        cleanupInternal(true);
        clearLoadingDialogsOffsets();
        openDatabase(1);
        AndroidUtilities.runOnUIThread(new f2(this, 12));
    }

    public void lambda$getBotCache$127(int r5, java.lang.String r6, org.telegram.tgnet.RequestDelegate r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$getBotCache$127(int, java.lang.String, org.telegram.tgnet.RequestDelegate):void");
    }

    public void lambda$getCachedPhoneBook$150(boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$getCachedPhoneBook$150(boolean):void");
    }

    public void lambda$getChannelPtsSync$257(long r5, java.lang.Integer[] r7, java.util.concurrent.CountDownLatch r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$getChannelPtsSync$257(long, java.lang.Integer[], java.util.concurrent.CountDownLatch):void");
    }

    public void lambda$getChatSync$259(TLRPC.Chat[] chatArr, long j10, CountDownLatch countDownLatch) {
        chatArr[0] = getChat(j10);
        countDownLatch.countDown();
    }

    public void lambda$getContacts$151() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$getContacts$151():void");
    }

    public void lambda$getDialogFolderId$243(long j10, IntCallback intCallback) {
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                int i9 = -1;
                if (this.unknownDialogsIds.f(j10) == null) {
                    sQLiteCursor = this.database.queryFinalized("SELECT folder_id FROM dialogs WHERE did = ?", Long.valueOf(j10));
                    if (sQLiteCursor.next()) {
                        i9 = sQLiteCursor.intValue(0);
                    }
                    sQLiteCursor.dispose();
                }
                AndroidUtilities.runOnUIThread(new oe(intCallback, i9, 1));
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
            } catch (Exception e10) {
                checkSQLException(e10);
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
            }
        } catch (Throwable th) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    public static void lambda$getDialogMaxMessageId$254(IntCallback intCallback, int[] iArr) {
        intCallback.run(iArr[0]);
    }

    public void lambda$getDialogMaxMessageId$255(long r6, org.telegram.messenger.MessagesStorage.IntCallback r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$getDialogMaxMessageId$255(long, org.telegram.messenger.MessagesStorage$IntCallback):void");
    }

    public void lambda$getDialogReadMax$256(boolean r5, long r6, java.lang.Integer[] r8, java.util.concurrent.CountDownLatch r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$getDialogReadMax$256(boolean, long, java.lang.Integer[], java.util.concurrent.CountDownLatch):void");
    }

    public void lambda$getDialogs$239(a0.h hVar) {
        MediaDataController mediaDataController = getMediaDataController();
        mediaDataController.clearDraftsFolderIds();
        if (hVar != null) {
            int m10 = hVar.m();
            for (int i9 = 0; i9 < m10; i9++) {
                mediaDataController.setDraftFolderId(hVar.j(i9), ((Integer) hVar.n(i9)).intValue());
            }
        }
    }

    public void lambda$getDialogs$240(int r29, int r30, int r31, long[] r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$getDialogs$240(int, int, int, long[]):void");
    }

    public void lambda$getDownloadQueue$185(int i9, ArrayList arrayList) {
        getDownloadController().processDownloadObjects(i9, arrayList);
    }

    public void lambda$getDownloadQueue$186(int i9) {
        boolean z10;
        boolean z11;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                ArrayList arrayList = new ArrayList();
                SQLiteDatabase sQLiteDatabase = this.database;
                Locale locale = Locale.US;
                SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT uid, type, data, parent FROM download_queue WHERE type = " + i9 + " ORDER BY date DESC LIMIT 3", new Object[0]);
                while (queryFinalized.next()) {
                    try {
                        DownloadObject downloadObject = new DownloadObject();
                        boolean z12 = true;
                        downloadObject.type = queryFinalized.intValue(1);
                        downloadObject.f19638id = queryFinalized.longValue(0);
                        downloadObject.parent = queryFinalized.stringValue(3);
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(2);
                        if (byteBufferValue != null) {
                            TLRPC.MessageMedia TLdeserialize = TLRPC.MessageMedia.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            byteBufferValue.reuse();
                            TLRPC.Document document = TLdeserialize.document;
                            if (document != null) {
                                downloadObject.object = document;
                                if (!MessageObject.isVideoDocument(document)) {
                                    if (!MessageObject.isVoiceDocument(TLdeserialize.document)) {
                                        if (MessageObject.isRoundVideoDocument(TLdeserialize.document)) {
                                        }
                                        z11 = false;
                                        downloadObject.secret = z11;
                                    }
                                }
                                int i10 = TLdeserialize.ttl_seconds;
                                if ((i10 > 0 && i10 <= 60) || i10 == Integer.MAX_VALUE) {
                                    z11 = true;
                                    downloadObject.secret = z11;
                                }
                                z11 = false;
                                downloadObject.secret = z11;
                            } else {
                                TLRPC.Photo photo = TLdeserialize.photo;
                                if (photo != null) {
                                    downloadObject.object = photo;
                                    int i11 = TLdeserialize.ttl_seconds;
                                    if ((i11 > 0 && i11 <= 60) || i11 == Integer.MAX_VALUE) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    downloadObject.secret = z10;
                                }
                            }
                            if ((TLdeserialize.flags & Integer.MIN_VALUE) == 0) {
                                z12 = false;
                            }
                            downloadObject.forceCache = z12;
                        }
                        arrayList.add(downloadObject);
                    } catch (Exception e10) {
                        e = e10;
                        sQLiteCursor = queryFinalized;
                        checkSQLException(e);
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        sQLiteCursor = queryFinalized;
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th;
                    }
                }
                queryFinalized.dispose();
                AndroidUtilities.runOnUIThread(new qf(this, i9, arrayList, 2));
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void lambda$getEncryptedChat$177(long j10, ArrayList arrayList, CountDownLatch countDownLatch) {
        try {
            ArrayList<Long> arrayList2 = new ArrayList<>();
            ArrayList<TLRPC.EncryptedChat> arrayList3 = new ArrayList<>();
            getEncryptedChatsInternal("" + j10, arrayList3, arrayList2);
            if (!arrayList3.isEmpty() && !arrayList2.isEmpty()) {
                ArrayList<TLRPC.User> arrayList4 = new ArrayList<>();
                getUsersInternal(arrayList2, arrayList4);
                if (!arrayList4.isEmpty()) {
                    arrayList.add(arrayList3.get(0));
                    arrayList.add(arrayList4.get(0));
                }
            }
        } catch (Exception e10) {
            checkSQLException(e10);
        } finally {
            countDownLatch.countDown();
        }
    }

    public void lambda$getEphemeralMessages$207(Utilities.Callback callback, long j10, long j11) {
        callback.run(getEphemeralMessagesInternal(j10, j11));
    }

    public void lambda$getEphemeralMessages$208(Utilities.Callback callback, long j10, long j11) {
        AndroidUtilities.runOnUIThread(new ue(this, callback, j10, j11, 1));
    }

    public void lambda$getMessage$142(long j10, long j11, AtomicReference atomicReference, CountDownLatch countDownLatch) {
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = this.database;
                sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j10 + " AND mid = " + j11 + " LIMIT 1", new Object[0]);
                while (sQLiteCursor.next()) {
                    NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                    if (byteBufferValue != null) {
                        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        byteBufferValue.reuse();
                        atomicReference.set(TLdeserialize);
                    }
                }
                sQLiteCursor.dispose();
                countDownLatch.countDown();
            } catch (Exception e10) {
                checkSQLException(e10);
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
                countDownLatch.countDown();
            }
        } catch (Throwable th) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            countDownLatch.countDown();
            throw th;
        }
    }

    public static void lambda$getMessages$161(Timer.Task task, Runnable runnable) {
        Timer.done(task);
        runnable.run();
    }

    public void lambda$getMessages$162(Timer.Task task, Timer timer, long j10, long j11, int i9, int i10, int i11, int i12, int i13, int i14, int i15, long j12, int i16, boolean z10, boolean z11) {
        Timer.done(task);
        Timer.Task start = Timer.start(timer, "MessagesStorage.getMessages");
        Runnable messagesInternal = getMessagesInternal(j10, j11, i9, i10, i11, i12, i13, i14, i15, j12, i16, z10, z11, timer);
        Timer.done(start);
        Utilities.stageQueue.postRunnable(new yb(22, Timer.start(timer, "MessagesStorage.getMessages: stageQueue.postRunnable"), messagesInternal));
    }

    public void lambda$getMessagesCount$158(long j10, IntCallback intCallback) {
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = this.database;
                Locale locale = Locale.US;
                int i9 = 0;
                sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT COUNT(mid) FROM messages_v2 WHERE uid = " + j10, new Object[0]);
                if (sQLiteCursor.next()) {
                    i9 = sQLiteCursor.intValue(0);
                }
                sQLiteCursor.dispose();
                AndroidUtilities.runOnUIThread(new oe(intCallback, i9, 0));
                sQLiteCursor.dispose();
            } catch (Exception e10) {
                checkSQLException(e10);
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
            }
        } catch (Throwable th) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    public static int lambda$getMessagesInternal$159(TLRPC.Message message, TLRPC.Message message2) {
        int i9;
        int i10;
        int i11;
        int i12;
        if (!MessageObject.isEphemeralMessageId(message.f22401id) && !MessageObject.isEphemeralMessageId(message2.f22401id)) {
            int i13 = message.f22401id;
            if (i13 > 0 && (i12 = message2.f22401id) > 0) {
                if (i13 > i12) {
                    return -1;
                }
                if (i13 < i12) {
                    return 1;
                }
            } else if (i13 < 0 && (i11 = message2.f22401id) < 0) {
                if (i13 < i11) {
                    return -1;
                }
                if (i13 > i11) {
                    return 1;
                }
            } else {
                int i14 = message.date;
                int i15 = message2.date;
                if (i14 > i15) {
                    return -1;
                }
                if (i14 < i15) {
                    return 1;
                }
            }
            return 0;
        }
        int i16 = message.date;
        int i17 = message2.date;
        if (i16 > i17) {
            return -1;
        }
        if (i16 < i17) {
            return 1;
        }
        if (MessageObject.isEphemeralMessageId(message.f22401id) && !MessageObject.isEphemeralMessageId(message2.f22401id)) {
            return -1;
        }
        if ((!MessageObject.isEphemeralMessageId(message.f22401id) && MessageObject.isEphemeralMessageId(message2.f22401id)) || (i9 = message.f22401id) > (i10 = message2.f22401id)) {
            return 1;
        }
        if (i9 >= i10) {
            return 0;
        }
        return -1;
    }

    public void lambda$getMessagesInternal$160(TLRPC.TL_messages_messages tL_messages_messages, int i9, long j10, long j11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, boolean z10, int i19, long j12, int i20, boolean z11, int i21, boolean z12, boolean z13, Timer timer) {
        getMessagesController().processLoadedMessages(tL_messages_messages, i9, j10, j11, i10, i11, i12, true, i13, i14, i15, i16, i17, i18, z10, i19, j12, i20, z11, i21, z12, z13, timer);
    }

    public void lambda$getNewTask$111(a0.h r13, a0.h r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$getNewTask$111(a0.h, a0.h):void");
    }

    public static void lambda$getSavedDialogMaxMessageId$52(IntCallback intCallback, int[] iArr) {
        intCallback.run(iArr[0]);
    }

    public void lambda$getSavedDialogMaxMessageId$53(long r8, org.telegram.messenger.MessagesStorage.IntCallback r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$getSavedDialogMaxMessageId$53(long, org.telegram.messenger.MessagesStorage$IntCallback):void");
    }

    public void lambda$getSentFile$164(String str, int i9, Object[] objArr, CountDownLatch countDownLatch) {
        NativeByteBuffer byteBufferValue;
        try {
            try {
                String MD5 = Utilities.MD5(str);
                if (MD5 != null) {
                    SQLiteDatabase sQLiteDatabase = this.database;
                    Locale locale = Locale.US;
                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data, parent FROM sent_files_v2 WHERE uid = '" + MD5 + "' AND type = " + i9, new Object[0]);
                    if (queryFinalized.next() && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                        TLRPC.MessageMedia TLdeserialize = TLRPC.MessageMedia.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        byteBufferValue.reuse();
                        if (TLdeserialize instanceof TLRPC.TL_messageMediaDocument) {
                            objArr[0] = ((TLRPC.TL_messageMediaDocument) TLdeserialize).document;
                        } else if (TLdeserialize instanceof TLRPC.TL_messageMediaPhoto) {
                            objArr[0] = ((TLRPC.TL_messageMediaPhoto) TLdeserialize).photo;
                        }
                        if (objArr[0] != null) {
                            objArr[1] = queryFinalized.stringValue(1);
                        }
                    }
                    queryFinalized.dispose();
                }
                countDownLatch.countDown();
            } catch (Exception e10) {
                checkSQLException(e10);
                countDownLatch.countDown();
            }
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
    }

    public void lambda$getUnreadMention$156(long j10, long j11, IntCallback intCallback) {
        SQLiteCursor queryFinalized;
        int i9 = 0;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                if (j10 != 0) {
                    SQLiteDatabase sQLiteDatabase = this.database;
                    Locale locale = Locale.US;
                    queryFinalized = sQLiteDatabase.queryFinalized("SELECT MIN(mid) FROM messages_topics WHERE uid = " + j11 + " AND topic_id = " + j10 + " AND mention = 1 AND read_state IN(0, 1)", new Object[0]);
                } else {
                    SQLiteDatabase sQLiteDatabase2 = this.database;
                    Locale locale2 = Locale.US;
                    queryFinalized = sQLiteDatabase2.queryFinalized("SELECT MIN(mid) FROM messages_v2 WHERE uid = " + j11 + " AND mention = 1 AND read_state IN(0, 1)", new Object[0]);
                }
                sQLiteCursor = queryFinalized;
                if (sQLiteCursor.next()) {
                    i9 = sQLiteCursor.intValue(0);
                }
                sQLiteCursor.dispose();
                AndroidUtilities.runOnUIThread(new oe(intCallback, i9, 2));
                sQLiteCursor.dispose();
            } catch (Exception e10) {
                checkSQLException(e10);
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
            }
        } catch (Throwable th) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    public void lambda$getUnsentMessages$152(int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$getUnsentMessages$152(int):void");
    }

    public void lambda$getUserSync$258(TLRPC.User[] userArr, long j10, CountDownLatch countDownLatch) {
        userArr[0] = getUser(j10);
        countDownLatch.countDown();
    }

    public static void lambda$getWallpapers$80(ArrayList arrayList) {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.wallpapersDidLoad, arrayList);
    }

    public void lambda$getWallpapers$81() {
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                sQLiteCursor = this.database.queryFinalized("SELECT data FROM wallpapers2 WHERE 1 ORDER BY num ASC", new Object[0]);
                ArrayList arrayList = new ArrayList();
                while (sQLiteCursor.next()) {
                    NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                    if (byteBufferValue != null) {
                        TLRPC.WallPaper TLdeserialize = TLRPC.WallPaper.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        byteBufferValue.reuse();
                        if (TLdeserialize != null) {
                            arrayList.add(TLdeserialize);
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new e(arrayList, 4));
                sQLiteCursor.dispose();
            } catch (Exception e10) {
                checkSQLException(e10);
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
            }
        } catch (Throwable th) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    public void lambda$getWidgetDialogIds$168(int i9, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, CountDownLatch countDownLatch) {
        Exception exc;
        Throwable th;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                ArrayList<Long> arrayList4 = new ArrayList<>();
                ArrayList arrayList5 = new ArrayList();
                SQLiteDatabase sQLiteDatabase = this.database;
                Locale locale = Locale.US;
                try {
                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT did FROM shortcut_widget WHERE id = " + i9 + " ORDER BY ord ASC", new Object[0]);
                    while (queryFinalized.next()) {
                        try {
                            long longValue = queryFinalized.longValue(0);
                            if (longValue != -1) {
                                arrayList.add(Long.valueOf(longValue));
                                if (arrayList2 != null && arrayList3 != null) {
                                    if (DialogObject.isUserDialog(longValue)) {
                                        arrayList4.add(Long.valueOf(longValue));
                                    } else {
                                        arrayList5.add(Long.valueOf(-longValue));
                                    }
                                }
                            }
                        } catch (Exception e10) {
                            exc = e10;
                            sQLiteCursor = queryFinalized;
                            checkSQLException(exc);
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            countDownLatch.countDown();
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            sQLiteCursor = queryFinalized;
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            countDownLatch.countDown();
                            throw th;
                        }
                    }
                    queryFinalized.dispose();
                    if (!z10 && arrayList.isEmpty()) {
                        if (i10 == 0) {
                            SQLiteCursor queryFinalized2 = this.database.queryFinalized("SELECT did FROM dialogs WHERE folder_id = 0 ORDER BY pinned DESC, date DESC LIMIT 0,10", new Object[0]);
                            while (queryFinalized2.next()) {
                                long longValue2 = queryFinalized2.longValue(0);
                                if (!DialogObject.isFolderDialogId(longValue2)) {
                                    arrayList.add(Long.valueOf(longValue2));
                                    if (arrayList2 != null && arrayList3 != null) {
                                        if (DialogObject.isUserDialog(longValue2)) {
                                            arrayList4.add(Long.valueOf(longValue2));
                                        } else {
                                            arrayList5.add(Long.valueOf(-longValue2));
                                        }
                                    }
                                }
                            }
                            queryFinalized2.dispose();
                        } else {
                            SQLiteCursor queryFinalized3 = getMessagesStorage().getDatabase().queryFinalized("SELECT did FROM chat_hints WHERE type = 0 ORDER BY rating DESC LIMIT 4", new Object[0]);
                            while (queryFinalized3.next()) {
                                long longValue3 = queryFinalized3.longValue(0);
                                arrayList.add(Long.valueOf(longValue3));
                                if (arrayList2 != null && arrayList3 != null) {
                                    if (DialogObject.isUserDialog(longValue3)) {
                                        arrayList4.add(Long.valueOf(longValue3));
                                    } else {
                                        arrayList5.add(Long.valueOf(-longValue3));
                                    }
                                }
                            }
                            queryFinalized3.dispose();
                        }
                    }
                    if (arrayList2 != null && arrayList3 != null) {
                        if (!arrayList5.isEmpty()) {
                            getChatsInternal(TextUtils.join(",", arrayList5), arrayList3);
                        }
                        if (!arrayList4.isEmpty()) {
                            getUsersInternal(arrayList4, arrayList2);
                        }
                    }
                    countDownLatch.countDown();
                } catch (Exception e11) {
                    exc = e11;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Exception e12) {
            exc = e12;
        }
    }

    public void lambda$getWidgetDialogs$169(int i9, ArrayList arrayList, int i10, a0.h hVar, a0.h hVar2, ArrayList arrayList2, ArrayList arrayList3, CountDownLatch countDownLatch) {
        SQLiteCursor queryFinalized;
        boolean z10;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                ArrayList<Long> arrayList4 = new ArrayList<>();
                ArrayList arrayList5 = new ArrayList();
                SQLiteDatabase sQLiteDatabase = this.database;
                Locale locale = Locale.US;
                SQLiteCursor queryFinalized2 = sQLiteDatabase.queryFinalized("SELECT did FROM shortcut_widget WHERE id = " + i9 + " ORDER BY ord ASC", new Object[0]);
                while (queryFinalized2.next()) {
                    try {
                        long longValue = queryFinalized2.longValue(0);
                        if (longValue != -1) {
                            arrayList.add(Long.valueOf(longValue));
                            if (DialogObject.isUserDialog(longValue)) {
                                arrayList4.add(Long.valueOf(longValue));
                            } else {
                                arrayList5.add(Long.valueOf(-longValue));
                            }
                        }
                    } catch (Exception e10) {
                        e = e10;
                        sQLiteCursor = queryFinalized;
                        checkSQLException(e);
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        countDownLatch.countDown();
                        return;
                    } catch (Throwable th) {
                        th = th;
                        sQLiteCursor = queryFinalized;
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        countDownLatch.countDown();
                        throw th;
                    }
                }
                queryFinalized2.dispose();
                if (arrayList.isEmpty() && i10 == 1) {
                    SQLiteCursor queryFinalized3 = getMessagesStorage().getDatabase().queryFinalized("SELECT did FROM chat_hints WHERE type = 0 ORDER BY rating DESC LIMIT 4", new Object[0]);
                    while (queryFinalized3.next()) {
                        long longValue2 = queryFinalized3.longValue(0);
                        arrayList.add(Long.valueOf(longValue2));
                        if (DialogObject.isUserDialog(longValue2)) {
                            arrayList4.add(Long.valueOf(longValue2));
                        } else {
                            arrayList5.add(Long.valueOf(-longValue2));
                        }
                    }
                    queryFinalized3.dispose();
                }
                if (arrayList.isEmpty()) {
                    queryFinalized = this.database.queryFinalized("SELECT d.did, d.last_mid, d.unread_count, d.date, m.data, m.read_state, m.mid, m.send_state, m.date FROM dialogs as d LEFT JOIN messages_v2 as m ON d.last_mid = m.mid AND d.did = m.uid WHERE d.folder_id = 0 ORDER BY d.pinned DESC, d.date DESC LIMIT 0,10", new Object[0]);
                    z10 = true;
                } else {
                    SQLiteDatabase sQLiteDatabase2 = this.database;
                    Locale locale2 = Locale.US;
                    queryFinalized = sQLiteDatabase2.queryFinalized("SELECT d.did, d.last_mid, d.unread_count, d.date, m.data, m.read_state, m.mid, m.send_state, m.date FROM dialogs as d LEFT JOIN messages_v2 as m ON d.last_mid = m.mid AND d.did = m.uid WHERE d.did IN(" + TextUtils.join(",", arrayList) + ")", new Object[0]);
                    z10 = false;
                }
                while (queryFinalized.next()) {
                    long longValue3 = queryFinalized.longValue(0);
                    if (!DialogObject.isFolderDialogId(longValue3)) {
                        if (z10) {
                            arrayList.add(Long.valueOf(longValue3));
                        }
                        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                        tL_dialog.f22384id = longValue3;
                        tL_dialog.top_message = queryFinalized.intValue(1);
                        tL_dialog.unread_count = queryFinalized.intValue(2);
                        tL_dialog.last_message_date = queryFinalized.intValue(3);
                        hVar.k(tL_dialog, tL_dialog.f22384id);
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(4);
                        if (byteBufferValue != null) {
                            TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            TLdeserialize.readAttachPath(byteBufferValue, getUserConfig().clientUserId);
                            byteBufferValue.reuse();
                            MessageObject.setUnreadFlags(TLdeserialize, queryFinalized.intValue(5));
                            TLdeserialize.f22401id = queryFinalized.intValue(6);
                            TLdeserialize.send_state = queryFinalized.intValue(7);
                            int intValue = queryFinalized.intValue(8);
                            if (intValue != 0) {
                                tL_dialog.last_message_date = intValue;
                            }
                            long j10 = tL_dialog.f22384id;
                            TLdeserialize.dialog_id = j10;
                            hVar2.k(TLdeserialize, j10);
                            addUsersAndChatsFromMessage(TLdeserialize, arrayList4, arrayList5, null);
                        }
                    }
                }
                queryFinalized.dispose();
                if (!z10 && arrayList.size() > hVar.m()) {
                    int size = arrayList.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        Long l10 = (Long) arrayList.get(i11);
                        long longValue4 = l10.longValue();
                        if (hVar.f(((Long) arrayList.get(i11)).longValue()) == null) {
                            TLRPC.TL_dialog tL_dialog2 = new TLRPC.TL_dialog();
                            tL_dialog2.f22384id = longValue4;
                            hVar.k(tL_dialog2, longValue4);
                            if (DialogObject.isChatDialog(longValue4)) {
                                long j11 = -longValue4;
                                if (arrayList5.contains(Long.valueOf(j11))) {
                                    arrayList5.add(Long.valueOf(j11));
                                }
                            } else if (arrayList4.contains(l10)) {
                                arrayList4.add(l10);
                            }
                        }
                    }
                }
                if (!arrayList5.isEmpty()) {
                    getChatsInternal(TextUtils.join(",", arrayList5), arrayList2);
                }
                if (!arrayList4.isEmpty()) {
                    getUsersInternal(arrayList4, arrayList3);
                }
                countDownLatch.countDown();
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public void lambda$hasAuthMessage$176(int i9, boolean[] zArr, CountDownLatch countDownLatch) {
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = this.database;
                Locale locale = Locale.US;
                sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT mid FROM messages_v2 WHERE uid = 777000 AND date = " + i9 + " AND mid < 0 LIMIT 1", new Object[0]);
                zArr[0] = sQLiteCursor.next();
                sQLiteCursor.dispose();
                countDownLatch.countDown();
            } catch (Exception e10) {
                checkSQLException(e10);
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
                countDownLatch.countDown();
            }
        } catch (Throwable th) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            countDownLatch.countDown();
            throw th;
        }
    }

    public void lambda$hasInviteMeMessage$143(long j10, boolean[] zArr, CountDownLatch countDownLatch) {
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                long clientUserId = getUserConfig().getClientUserId();
                SQLiteDatabase sQLiteDatabase = this.database;
                sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + (-j10) + " AND out = 0 ORDER BY mid DESC LIMIT 100", new Object[0]);
                while (true) {
                    if (!sQLiteCursor.next()) {
                        break;
                    }
                    NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                    if (byteBufferValue != null) {
                        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        byteBufferValue.reuse();
                        TLRPC.MessageAction messageAction = TLdeserialize.action;
                        if ((messageAction instanceof TLRPC.TL_messageActionChatAddUser) && messageAction.users.contains(Long.valueOf(clientUserId))) {
                            zArr[0] = true;
                            break;
                        }
                    }
                }
                sQLiteCursor.dispose();
                countDownLatch.countDown();
            } catch (Exception e10) {
                checkSQLException(e10);
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
                countDownLatch.countDown();
            }
        } catch (Throwable th) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            countDownLatch.countDown();
            throw th;
        }
    }

    public void lambda$isDialogHasTopMessage$175(long r6, java.lang.Runnable r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$isDialogHasTopMessage$175(long, java.lang.Runnable):void");
    }

    public void lambda$isMigratedChat$141(long j10, boolean[] zArr, CountDownLatch countDownLatch) {
        SQLiteCursor queryFinalized;
        TLRPC.ChatFull chatFull;
        boolean z10;
        NativeByteBuffer byteBufferValue;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                queryFinalized = this.database.queryFinalized("SELECT info FROM chat_settings_v2 WHERE uid = " + j10, new Object[0]);
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            new ArrayList();
            if (queryFinalized.next() && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                chatFull = TLRPC.ChatFull.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                byteBufferValue.reuse();
            } else {
                chatFull = null;
            }
            queryFinalized.dispose();
            if ((chatFull instanceof TLRPC.TL_channelFull) && chatFull.migrated_from_chat_id != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            zArr[0] = z10;
            countDownLatch.countDown();
            countDownLatch.countDown();
        } catch (Exception e11) {
            e = e11;
            sQLiteCursor = queryFinalized;
            checkSQLException(e);
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            countDownLatch.countDown();
        } catch (Throwable th2) {
            th = th2;
            sQLiteCursor = queryFinalized;
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            countDownLatch.countDown();
            throw th;
        }
    }

    public void lambda$loadChannelAdmins$123(long j10) {
        SQLiteCursor queryFinalized;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = this.database;
                queryFinalized = sQLiteDatabase.queryFinalized("SELECT uid, data FROM channel_admins_v3 WHERE did = " + j10, new Object[0]);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e10) {
            e = e10;
        }
        try {
            a0.h hVar = new a0.h();
            while (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(1);
                if (byteBufferValue != null) {
                    TLRPC.ChannelParticipant TLdeserialize = TLRPC.ChannelParticipant.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    byteBufferValue.reuse();
                    if (TLdeserialize != null) {
                        hVar.k(TLdeserialize, queryFinalized.longValue(0));
                    }
                }
            }
            queryFinalized.dispose();
            getMessagesController().processLoadedChannelAdmins(hVar, j10, true);
        } catch (Exception e11) {
            e = e11;
            sQLiteCursor = queryFinalized;
            checkSQLException(e);
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteCursor = queryFinalized;
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    public void lambda$loadChatInfo$144(TLRPC.ChatFull[] chatFullArr, long j10, boolean z10, boolean z11, boolean z12, int i9, CountDownLatch countDownLatch) {
        chatFullArr[0] = loadChatInfoInternal(j10, z10, z11, z12, i9);
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public static int lambda$loadDialogFilters$66(MessagesController.DialogFilter dialogFilter, MessagesController.DialogFilter dialogFilter2) {
        int i9 = dialogFilter.order;
        int i10 = dialogFilter2.order;
        if (i9 > i10) {
            return 1;
        }
        if (i9 < i10) {
            return -1;
        }
        return 0;
    }

    public void lambda$loadDialogFilters$67() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$loadDialogFilters$67():void");
    }

    public void lambda$loadGiftChatTheme$268(org.telegram.messenger.Utilities.Callback r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$loadGiftChatTheme$268(org.telegram.messenger.Utilities$Callback):void");
    }

    public void lambda$loadMessageAttachPaths$235(ArrayList arrayList, Runnable runnable) {
        NativeByteBuffer byteBufferValue;
        long clientUserId = getUserConfig().getClientUserId();
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            MessageObject messageObject = (MessageObject) obj;
            if (!messageObject.scheduled && !messageObject.isQuickReply()) {
                SQLiteCursor sQLiteCursor = null;
                try {
                    try {
                        sQLiteCursor = this.database.queryFinalized("SELECT data FROM messages_v2 WHERE uid = ? AND mid = ?", Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()));
                        if (sQLiteCursor.next() && (byteBufferValue = sQLiteCursor.byteBufferValue(0)) != null) {
                            TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            TLdeserialize.readAttachPath(byteBufferValue, clientUserId);
                            byteBufferValue.reuse();
                            messageObject.messageOwner.attachPath = TLdeserialize.attachPath;
                            messageObject.checkMediaExistance();
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        if (sQLiteCursor != null) {
                        }
                    }
                    sQLiteCursor.dispose();
                } catch (Throwable th) {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th;
                }
            }
        }
        AndroidUtilities.runOnUIThread(runnable);
    }

    public void lambda$loadPendingTasks$12(TLRPC.Chat chat, long j10) {
        getMessagesController().loadUnknownChannel(chat, j10);
    }

    public void lambda$loadPendingTasks$13(long j10, int i9, long j11) {
        getMessagesController().getChannelDifference(j10, i9, j11, null);
    }

    public void lambda$loadPendingTasks$14(TLRPC.Dialog dialog, TLRPC.InputPeer inputPeer, long j10) {
        getMessagesController().checkLastDialogMessage(dialog, inputPeer, j10);
    }

    public void lambda$loadPendingTasks$15(long j10, boolean z10, TLRPC.InputPeer inputPeer, long j11) {
        getMessagesController().pinDialog(j10, z10, inputPeer, j11);
    }

    public void lambda$loadPendingTasks$16(long j10, int i9, long j11, TLRPC.InputChannel inputChannel) {
        getMessagesController().getChannelDifference(j10, i9, j11, inputChannel);
    }

    public void lambda$loadPendingTasks$17(long j10, int i9, long j11, TLRPC.InputChannel inputChannel) {
        getMessagesController().getChannelDifference(j10, i9, j11, inputChannel);
    }

    public void lambda$loadPendingTasks$18(long j10, long j11, TLObject tLObject) {
        getMessagesController().deleteMessages(null, null, null, -j10, true, 0, false, j11, tLObject, 0);
    }

    public void lambda$loadPendingTasks$19(long j10, long j11, TLObject tLObject) {
        getMessagesController().deleteMessages(null, null, null, j10, true, 0, false, j11, tLObject, 0);
    }

    public void lambda$loadPendingTasks$20(long j10, long j11, TLObject tLObject, int i9) {
        getMessagesController().deleteMessages(null, null, null, j10, true, 0, false, j11, tLObject, i9);
    }

    public void lambda$loadPendingTasks$21(long j10, TLRPC.InputPeer inputPeer, long j11) {
        getMessagesController().markDialogAsUnread(j10, inputPeer, j11);
    }

    public void lambda$loadPendingTasks$22(long j10, int i9, TLRPC.InputChannel inputChannel, int i10, long j11) {
        getMessagesController().markMessageAsRead2(-j10, i9, inputChannel, i10, j11);
    }

    public void lambda$loadPendingTasks$23(long j10, int i9, TLRPC.InputChannel inputChannel, int i10, long j11, int i11) {
        boolean z10;
        MessagesController messagesController = getMessagesController();
        if (i11 == 23) {
            z10 = true;
        } else {
            z10 = false;
        }
        messagesController.markMessageAsRead2(j10, i9, inputChannel, i10, j11, z10);
    }

    public void lambda$loadPendingTasks$24(org.telegram.ui.ActionBar.y5 y5Var, boolean z10, long j10) {
        getMessagesController().saveWallpaperToServer(null, y5Var, z10, j10);
    }

    public void lambda$loadPendingTasks$25(long j10, boolean z10, int i9, int i10, boolean z11, TLRPC.InputPeer inputPeer, long j11) {
        getMessagesController().deleteDialog(j10, z10 ? 1 : 0, i9, i10, z11, inputPeer, j11);
    }

    public void lambda$loadPendingTasks$26(TLRPC.InputPeer inputPeer, long j10) {
        getMessagesController().loadUnknownDialog(inputPeer, j10);
    }

    public void lambda$loadPendingTasks$27(int i9, ArrayList arrayList, long j10) {
        getMessagesController().reorderPinnedDialogs(i9, arrayList, j10);
    }

    public void lambda$loadPendingTasks$28(int i9, ArrayList arrayList, long j10) {
        getMessagesController().addDialogToFolder(null, i9, -1, arrayList, j10);
    }

    public void lambda$loadPendingTasks$29(long j10, long j11, TLObject tLObject) {
        getMessagesController().deleteMessages(null, null, null, j10, true, 1, false, j11, tLObject, 0);
    }

    public void lambda$loadPendingTasks$30(TLRPC.InputPeer inputPeer, long j10) {
        getMessagesController().reloadMentionsCountForChannel(inputPeer, j10);
    }

    public void lambda$loadPendingTasks$31(int i9, boolean z10, long j10) {
        getSecretChatHelper().declineSecretChat(i9, z10, j10);
    }

    public void lambda$loadPendingTasks$32(long j10, long j11, int i9) {
        getMessagesController().lambda$checkDeletingTask$84(j10, j11, i9);
    }

    public void lambda$loadPendingTasks$33() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$loadPendingTasks$33():void");
    }

    public void lambda$loadStoryAlbumsCache$270(long r6, java.util.function.Consumer r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$loadStoryAlbumsCache$270(long, java.util.function.Consumer):void");
    }

    public void lambda$loadTopics$50(ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList.isEmpty()) {
            getMessagesController().putUsers(arrayList, true);
        }
        if (!arrayList2.isEmpty()) {
            getMessagesController().putChats(arrayList2, true);
        }
    }

    public void lambda$loadTopics$51(long r23, java.util.function.Consumer r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$loadTopics$51(long, java.util.function.Consumer):void");
    }

    public void lambda$loadUnreadMessages$76(a0.h hVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, HashMap hashMap) {
        getNotificationsController().processLoadedUnreadMessages(hVar, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, hashMap.values());
    }

    public void lambda$loadUnreadMessages$77() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$loadUnreadMessages$77():void");
    }

    public void lambda$loadUserInfo$128(ArrayList arrayList) {
        getMessagesController().putChats(arrayList, true);
    }

    public void lambda$loadUserInfo$129(org.telegram.tgnet.TLRPC.User r19, boolean r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$loadUserInfo$129(org.telegram.tgnet.TLRPC$User, boolean, int):void");
    }

    public static int lambda$localSearch$260(of.a0 a0Var, of.a0 a0Var2) {
        int i9 = a0Var.f19239b;
        int i10 = a0Var2.f19239b;
        if (i9 < i10) {
            return 1;
        }
        if (i9 > i10) {
            return -1;
        }
        return 0;
    }

    public void lambda$markMentionMessageAsRead$112(int r18, long r19, long r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$markMentionMessageAsRead$112(int, long, long):void");
    }

    public void lambda$markMessageAsMention$113(int i9, long j10) {
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            Locale locale = Locale.US;
            sQLiteDatabase.executeFast("UPDATE messages_v2 SET mention = 1, read_state = read_state & ~2 WHERE mid = " + i9 + " AND uid = " + j10).stepThis().dispose();
        } catch (Exception e10) {
            checkSQLException(e10);
        }
    }

    public void lambda$markMessageAsSendError$209(int i9, TLRPC.Message message) {
        try {
            long j10 = message.f22401id;
            if (MessageObject.isQuickReply(message)) {
                i9 = 5;
            } else if (MessageObject.isWelcomeMessage(message)) {
                i9 = 9;
            }
            if (i9 == 9) {
                SQLiteDatabase sQLiteDatabase = this.database;
                Locale locale = Locale.US;
                sQLiteDatabase.executeFast("UPDATE welcome_messages SET send_state = 2 WHERE mid = " + j10 + " AND dialog_id = " + MessageObject.getDialogId(message)).stepThis().dispose();
            } else if (i9 == 5) {
                SQLiteDatabase sQLiteDatabase2 = this.database;
                Locale locale2 = Locale.US;
                sQLiteDatabase2.executeFast("UPDATE quick_replies_messages SET send_state = 2 WHERE mid = " + j10 + " AND topic_id = " + MessageObject.getQuickReplyId(this.currentAccount, message)).stepThis().dispose();
            } else if (i9 == 1) {
                SQLiteDatabase sQLiteDatabase3 = this.database;
                Locale locale3 = Locale.US;
                sQLiteDatabase3.executeFast("UPDATE scheduled_messages_v2 SET send_state = 2 WHERE mid = " + j10 + " AND uid = " + MessageObject.getDialogId(message)).stepThis().dispose();
            } else {
                SQLiteDatabase sQLiteDatabase4 = this.database;
                Locale locale4 = Locale.US;
                sQLiteDatabase4.executeFast("UPDATE messages_v2 SET send_state = 2 WHERE mid = " + j10 + " AND uid = " + MessageObject.getDialogId(message)).stepThis().dispose();
                this.database.executeFast("UPDATE messages_topics SET send_state = 2 WHERE mid = " + j10 + " AND uid = " + MessageObject.getDialogId(message)).stepThis().dispose();
            }
        } catch (Exception e10) {
            checkSQLException(e10);
        }
    }

    public void lambda$markMessageAsSendErrorWithParams$210(TLRPC.Message message, long j10) {
        String str;
        long j11;
        char c10;
        SQLiteDatabase sQLiteDatabase;
        String str2;
        Long valueOf;
        Long valueOf2;
        NativeByteBuffer byteBufferValue;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                long j12 = message.f22401id;
                long dialogId = MessageObject.getDialogId(message);
                int i9 = 0;
                int i10 = 0;
                while (i10 < 2) {
                    if (i10 == 0) {
                        str = "messages_v2";
                    } else {
                        str = "messages_topics";
                    }
                    SQLiteDatabase sQLiteDatabase2 = this.database;
                    Locale locale = Locale.US;
                    sQLiteCursor = sQLiteDatabase2.queryFinalized("SELECT data FROM messages_v2 WHERE mid = " + j12 + " AND uid = " + dialogId + " LIMIT 1", new Object[i9]);
                    try {
                        if (sQLiteCursor.next() && (byteBufferValue = sQLiteCursor.byteBufferValue(i9)) != null) {
                            j11 = j12;
                            c10 = 0;
                            TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(i9), i9).readAttachPath(byteBufferValue, j10);
                            byteBufferValue.reuse();
                        } else {
                            j11 = j12;
                            c10 = 0;
                        }
                        sQLiteDatabase = this.database;
                        str2 = "UPDATE " + str + " SET send_state = 2 WHERE mid = %d AND uid = %d";
                        valueOf = Long.valueOf(j11);
                        valueOf2 = Long.valueOf(dialogId);
                    } catch (Exception e10) {
                        e = e10;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        Object[] objArr = new Object[2];
                        objArr[c10] = valueOf;
                        objArr[1] = valueOf2;
                        sQLiteDatabase.executeFast(String.format(locale, str2, objArr)).stepThis().dispose();
                        SQLiteDatabase sQLiteDatabase3 = this.database;
                        String str3 = "UPDATE " + str + " SET send_state = 2 WHERE mid = %d AND uid = %d";
                        Long valueOf3 = Long.valueOf(j11);
                        Long valueOf4 = Long.valueOf(dialogId);
                        Object[] objArr2 = new Object[2];
                        objArr2[c10] = valueOf3;
                        objArr2[1] = valueOf4;
                        sQLiteDatabase3.executeFast(String.format(locale, str3, objArr2)).stepThis().dispose();
                        i10++;
                        j12 = j11;
                        sQLiteCursor = sQLiteCursor;
                        i9 = 0;
                    } catch (Exception e11) {
                        e = e11;
                        sQLiteCursor = sQLiteCursor;
                        checkSQLException(e);
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteCursor = sQLiteCursor;
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th;
                    }
                }
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
            } catch (Exception e12) {
                e = e12;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public void lambda$markMessagePollVotesAsRead$263(long j10, long j11, int i9) {
        markMessageReactionsAsReadInternal("poll_votes_mentions", "poll_votes_mentions_topics", j10, j11, i9, false);
    }

    public void lambda$markMessageReactionsAsRead$262(long j10, long j11, int i9) {
        markMessageReactionsAsReadInternal("reaction_mentions", "reaction_mentions_topics", j10, j11, i9, true);
    }

    public void lambda$markMessagesAsDeletedByRandoms$220(ArrayList arrayList) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesDeleted, arrayList, 0L, Boolean.FALSE);
    }

    public void lambda$markMessagesAsDeletedByRandoms$221(java.util.ArrayList r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$markMessagesAsDeletedByRandoms$221(java.util.ArrayList):void");
    }

    public void lambda$markMessagesAsDeletedInternal$224(ArrayList arrayList) {
        getFileLoader().cancelLoadFiles(arrayList);
    }

    public void lambda$markMessagesAsDeletedInternal$225(a0.h hVar) {
        getMessagesController().getSavedMessagesController().updateDeleted(hVar);
    }

    public void lambda$markMessagesAsDeletedInternal$226(ArrayList arrayList, long j10) {
        HashSet<Long> hashSet = new HashSet<>();
        int size = arrayList.size();
        boolean z10 = false;
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            TLRPC.Message message = (TLRPC.Message) obj;
            if (getMessagesController().processDeletedReactionTags(message)) {
                hashSet.add(Long.valueOf(MessageObject.getSavedDialogId(j10, message)));
                z10 = true;
            }
        }
        if (z10) {
            getMessagesController().updateSavedReactionTags(hashSet);
        }
    }

    public void lambda$markMessagesAsDeletedInternal$227(ArrayList arrayList) {
        HashSet<Long> hashSet = new HashSet<>();
        long[] jArr = new long[1];
        boolean z10 = false;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            if (getMediaDataController().processDeletedMessage(((Integer) arrayList.get(i9)).intValue(), jArr)) {
                hashSet.add(Long.valueOf(jArr[0]));
                z10 = true;
            }
        }
        if (z10) {
            getMessagesController().updateSavedReactionTags(hashSet);
        }
    }

    public void lambda$markMessagesAsDeletedInternal$230(ArrayList arrayList) {
        getFileLoader().cancelLoadFiles(arrayList);
    }

    public void lambda$markMessagesContentAsRead$218(long r8, java.util.ArrayList r10, int r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$markMessagesContentAsRead$218(long, java.util.ArrayList, int, int):void");
    }

    public void lambda$markVoiceMessageContentAsRead$216(ArrayList arrayList) {
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            getMessagesController().markMessageContentAsRead((MessageObject) obj);
        }
    }

    public void lambda$markVoiceMessageContentAsRead$217(ArrayList arrayList, long j10) {
        ArrayList arrayList2 = new ArrayList();
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                String join = TextUtils.join(",", arrayList);
                SQLiteDatabase sQLiteDatabase = this.database;
                Locale locale = Locale.US;
                SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j10 + " AND mid IN (" + join + ")", new Object[0]);
                while (queryFinalized.next()) {
                    NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                    if (byteBufferValue != null) {
                        try {
                            TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            if (TLdeserialize != null) {
                                TLdeserialize.readAttachPath(byteBufferValue, getUserConfig().clientUserId);
                                if (!TLdeserialize.out && TLdeserialize.media_unread && MessageObject.isVoiceMessage(TLdeserialize)) {
                                    arrayList2.add(new MessageObject(this.currentAccount, TLdeserialize, false, false));
                                }
                            }
                        } finally {
                            byteBufferValue.reuse();
                        }
                    }
                }
                queryFinalized.dispose();
            } catch (Exception e10) {
                checkSQLException(e10);
                if (0 != 0) {
                    sQLiteCursor.dispose();
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            AndroidUtilities.runOnUIThread(new ke(1, arrayList2, this));
        } catch (Throwable th) {
            if (0 != 0) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    public void lambda$new$0() {
        openDatabase(1);
    }

    public void lambda$onDeleteQueryComplete$91(long j10) {
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            sQLiteDatabase.executeFast("DELETE FROM media_counts_v2 WHERE uid = " + j10).stepThis().dispose();
        } catch (Exception e10) {
            checkSQLException(e10);
        }
    }

    public void lambda$onReactionsUpdate$105(ArrayList arrayList) {
        HashSet<Long> hashSet = new HashSet<>();
        a0.h hVar = new a0.h();
        a0.h hVar2 = new a0.h();
        boolean z10 = false;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            SavedReactionsUpdate savedReactionsUpdate = (SavedReactionsUpdate) arrayList.get(i9);
            TLRPC.TL_messageReactions tL_messageReactions = savedReactionsUpdate.old;
            TLRPC.TL_messageReactions tL_messageReactions2 = savedReactionsUpdate.last;
            hVar.b();
            hVar2.b();
            if (tL_messageReactions != null && tL_messageReactions.results != null && tL_messageReactions.reactions_as_tags) {
                for (int i10 = 0; i10 < tL_messageReactions.results.size(); i10++) {
                    hg.r0 d = hg.r0.d(tL_messageReactions.results.get(i10).reaction);
                    hVar.k(d, d.h);
                }
            }
            if (tL_messageReactions2 != null && tL_messageReactions2.results != null && tL_messageReactions2.reactions_as_tags) {
                for (int i11 = 0; i11 < tL_messageReactions2.results.size(); i11++) {
                    hg.r0 d9 = hg.r0.d(tL_messageReactions2.results.get(i11).reaction);
                    hVar2.k(d9, d9.h);
                }
            }
            for (int i12 = 0; i12 < hVar.m(); i12++) {
                long j10 = hVar.j(i12);
                hg.r0 r0Var = (hg.r0) hVar.n(i12);
                if (!hVar2.d(j10) && getMessagesController().updateSavedReactionTags(savedReactionsUpdate.topic_id, r0Var, false, false)) {
                    hashSet.add(Long.valueOf(savedReactionsUpdate.topic_id));
                    z10 = true;
                }
            }
            for (int i13 = 0; i13 < hVar2.m(); i13++) {
                long j11 = hVar2.j(i13);
                hg.r0 r0Var2 = (hg.r0) hVar2.n(i13);
                if (!hVar.d(j11) && getMessagesController().updateSavedReactionTags(savedReactionsUpdate.topic_id, r0Var2, true, false)) {
                    hashSet.add(Long.valueOf(savedReactionsUpdate.topic_id));
                    z10 = true;
                }
            }
        }
        if (z10 && !hashSet.isEmpty()) {
            getMessagesController().updateSavedReactionTags(hashSet);
        }
    }

    public void lambda$onReactionsUpdate$106(TLRPC.TL_messageReactions tL_messageReactions, TLRPC.TL_messageReactions tL_messageReactions2, long j10) {
        a0.h hVar = new a0.h();
        a0.h hVar2 = new a0.h();
        if (tL_messageReactions != null && tL_messageReactions.results != null && tL_messageReactions.reactions_as_tags) {
            for (int i9 = 0; i9 < tL_messageReactions.results.size(); i9++) {
                hg.r0 d = hg.r0.d(tL_messageReactions.results.get(i9).reaction);
                hVar.k(d, d.h);
            }
        }
        if (tL_messageReactions2 != null && tL_messageReactions2.results != null && tL_messageReactions2.reactions_as_tags) {
            for (int i10 = 0; i10 < tL_messageReactions2.results.size(); i10++) {
                hg.r0 d9 = hg.r0.d(tL_messageReactions2.results.get(i10).reaction);
                hVar2.k(d9, d9.h);
            }
        }
        boolean z10 = false;
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            long j11 = hVar.j(i11);
            hg.r0 r0Var = (hg.r0) hVar.n(i11);
            if (!hVar2.d(j11)) {
                if (!getMessagesController().updateSavedReactionTags(j10, r0Var, false, false) && !z10) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            }
        }
        for (int i12 = 0; i12 < hVar2.m(); i12++) {
            long j12 = hVar2.j(i12);
            hg.r0 r0Var2 = (hg.r0) hVar2.n(i12);
            if (!hVar.d(j12)) {
                if (!getMessagesController().updateSavedReactionTags(j10, r0Var2, true, false) && !z10) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            }
        }
        if (z10) {
            if (j10 != 0) {
                getMessagesController().updateSavedReactionTags(0L);
            }
            getMessagesController().updateSavedReactionTags(j10);
        }
    }

    public void lambda$openDatabase$1() {
        if (this.databaseMigrationInProgress) {
            this.databaseMigrationInProgress = false;
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onDatabaseMigration, Boolean.FALSE);
        }
    }

    public void lambda$openDatabase$2() {
        this.showClearDatabaseAlert = false;
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onDatabaseOpened, new Object[0]);
    }

    public void lambda$overwriteChannel$189(long j10, TLRPC.TL_updates_channelDifferenceTooLong tL_updates_channelDifferenceTooLong) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.removeAllMessagesFromDialog, Long.valueOf(j10), Boolean.TRUE, tL_updates_channelDifferenceTooLong);
    }

    public void lambda$overwriteChannel$190(long r25, int r27, org.telegram.tgnet.TLRPC.TL_updates_channelDifferenceTooLong r28, java.lang.Runnable r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$overwriteChannel$190(long, int, org.telegram.tgnet.TLRPC$TL_updates_channelDifferenceTooLong, java.lang.Runnable):void");
    }

    public void lambda$processAnchoredEphemeralMessages$203(ArrayList arrayList, Runnable runnable) {
        processAnchoredEphemeralMessagesInternal(arrayList);
        runnable.run();
    }

    public void lambda$processEphemeralEditedMessages$202(ArrayList arrayList, Runnable runnable) {
        processEphemeralEditedMessagesInternal(arrayList);
        runnable.run();
    }

    public void lambda$processEphemeralMessages$201(ArrayList arrayList, Runnable runnable) {
        processEphemeralMessagesInternal(arrayList);
        runnable.run();
    }

    public static int lambda$processLoadedFilterPeersInternal$70(MessagesController.DialogFilter dialogFilter, MessagesController.DialogFilter dialogFilter2) {
        int i9 = dialogFilter.order;
        int i10 = dialogFilter2.order;
        if (i9 > i10) {
            return 1;
        }
        if (i9 < i10) {
            return -1;
        }
        return 0;
    }

    public void lambda$processPendingRead$145(long r18, int r20, int r21, int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$processPendingRead$145(long, int, int, int, int):void");
    }

    public void lambda$putCachedPhoneBook$149(java.util.HashMap r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$putCachedPhoneBook$149(java.util.HashMap, boolean):void");
    }

    public void lambda$putChannelAdmins$124(long j10, a0.h hVar) {
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = this.database;
                sQLiteDatabase.executeFast("DELETE FROM channel_admins_v3 WHERE did = " + j10).stepThis().dispose();
                this.database.beginTransaction();
                SQLitePreparedStatement executeFast = this.database.executeFast("REPLACE INTO channel_admins_v3 VALUES(?, ?, ?)");
                for (int i9 = 0; i9 < hVar.m(); i9++) {
                    try {
                        executeFast.requery();
                        executeFast.bindLong(1, j10);
                        executeFast.bindLong(2, hVar.j(i9));
                        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) hVar.n(i9);
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(channelParticipant.getObjectSize());
                        channelParticipant.serializeToStream(nativeByteBuffer);
                        executeFast.bindByteBuffer(3, nativeByteBuffer);
                        executeFast.step();
                        nativeByteBuffer.reuse();
                    } catch (Exception e10) {
                        e = e10;
                        sQLitePreparedStatement = executeFast;
                        checkSQLException(e);
                        SQLiteDatabase sQLiteDatabase2 = this.database;
                        if (sQLiteDatabase2 != null) {
                            sQLiteDatabase2.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        sQLitePreparedStatement = executeFast;
                        SQLiteDatabase sQLiteDatabase3 = this.database;
                        if (sQLiteDatabase3 != null) {
                            sQLiteDatabase3.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th;
                    }
                }
                executeFast.dispose();
                this.database.commitTransaction();
                SQLiteDatabase sQLiteDatabase4 = this.database;
                if (sQLiteDatabase4 != null) {
                    sQLiteDatabase4.commitTransaction();
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public void lambda$putChannelViews$191(a0.h r23, a0.h r24, a0.h r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$putChannelViews$191(a0.h, a0.h, a0.h, boolean):void");
    }

    public void lambda$putContacts$146(boolean r7, java.util.ArrayList r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$putContacts$146(boolean, java.util.ArrayList):void");
    }

    public void lambda$putDialogs$253(TLRPC.messages_Dialogs messages_dialogs, int i9) {
        putDialogsInternal(messages_dialogs, i9);
        try {
            loadUnreadMessages();
        } catch (Exception e10) {
            checkSQLException(e10);
        }
    }

    public void lambda$putEncryptedChat$178(org.telegram.tgnet.TLRPC.EncryptedChat r17, org.telegram.tgnet.TLRPC.User r18, org.telegram.tgnet.TLRPC.Dialog r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$putEncryptedChat$178(org.telegram.tgnet.TLRPC$EncryptedChat, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Dialog):void");
    }

    public void lambda$putGiftChatThemes$265(List list) {
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                try {
                    sQLitePreparedStatement = this.database.executeFast("REPLACE INTO gift_themes VALUES(?, ?)");
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        TLRPC.ChatTheme chatTheme = (TLRPC.ChatTheme) it.next();
                        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = (TLRPC.TL_chatThemeUniqueGift) chatTheme;
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindString(1, tL_chatThemeUniqueGift.gift.slug);
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_chatThemeUniqueGift.getObjectSize());
                            tL_chatThemeUniqueGift.serializeToStream(nativeByteBuffer);
                            sQLitePreparedStatement.bindByteBuffer(2, nativeByteBuffer);
                            nativeByteBuffer.reuse();
                            sQLitePreparedStatement.step();
                        }
                    }
                    sQLitePreparedStatement.dispose();
                } catch (Exception e10) {
                    FileLog.e(e10);
                    if (sQLitePreparedStatement == null) {
                        return;
                    }
                    sQLitePreparedStatement.dispose();
                }
            } catch (SQLiteException e11) {
                checkSQLException(e11);
                if (sQLitePreparedStatement == null) {
                    return;
                }
                sQLitePreparedStatement.dispose();
            }
        } catch (Throwable th) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    public void lambda$putMessages$236(ArrayList arrayList) {
        getFileLoader().cancelLoadFiles(arrayList);
    }

    public void lambda$putMessages$237(ArrayList arrayList) {
        if (getMessagesController().getSavedMessagesController().updateSavedDialogs(arrayList)) {
            getMessagesController().getSavedMessagesController().update();
        }
    }

    public void lambda$putMessages$238(int r50, org.telegram.tgnet.TLRPC.messages_Messages r51, long r52, long r54, int r56, int r57, boolean r58) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$putMessages$238(int, org.telegram.tgnet.TLRPC$messages_Messages, long, long, int, int, boolean):void");
    }

    public void lambda$putMessagesInternal$196(int i9) {
        getDownloadController().newDownloadObjectsAvailable(i9);
    }

    public void lambda$putMessagesInternal$197(ArrayList arrayList) {
        if (getMessagesController().getSavedMessagesController().updateSavedDialogs(arrayList)) {
            getMessagesController().getSavedMessagesController().update();
        }
    }

    public void lambda$putMessagesInternal$198(ArrayList arrayList) {
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            Pair pair = (Pair) obj;
            getMessagesController().reportMessageDelivery(((Long) pair.first).longValue(), ((Integer) pair.second).intValue(), false);
        }
    }

    public void lambda$putPushMessage$42(MessageObject messageObject) {
        int i9;
        try {
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(messageObject.messageOwner.getObjectSize());
            messageObject.messageOwner.serializeToStream(nativeByteBuffer);
            if (messageObject.localType == 2) {
                i9 = 1;
            } else {
                i9 = 0;
            }
            if (messageObject.localChannel) {
                i9 |= 2;
            }
            SQLitePreparedStatement executeFast = this.database.executeFast("REPLACE INTO unread_push_messages VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            executeFast.requery();
            executeFast.bindLong(1, messageObject.getDialogId());
            executeFast.bindInteger(2, messageObject.getId());
            executeFast.bindLong(3, messageObject.messageOwner.random_id);
            executeFast.bindInteger(4, messageObject.messageOwner.date);
            executeFast.bindByteBuffer(5, nativeByteBuffer);
            CharSequence charSequence = messageObject.messageText;
            if (charSequence == null) {
                executeFast.bindNull(6);
            } else {
                executeFast.bindString(6, charSequence.toString());
            }
            String str = messageObject.localName;
            if (str == null) {
                executeFast.bindNull(7);
            } else {
                executeFast.bindString(7, str);
            }
            String str2 = messageObject.localUserName;
            if (str2 == null) {
                executeFast.bindNull(8);
            } else {
                executeFast.bindString(8, str2);
            }
            executeFast.bindInteger(9, i9);
            executeFast.bindLong(10, MessageObject.getTopicId(this.currentAccount, messageObject.messageOwner, false));
            executeFast.bindInteger(11, (messageObject.isReactionPush ? 1 : 0) + (messageObject.isStoryReactionPush ? 1 : 0));
            executeFast.step();
            nativeByteBuffer.reuse();
            executeFast.dispose();
        } catch (Exception e10) {
            checkSQLException(e10);
        }
    }

    public void lambda$putSentFile$170(String str, TLObject tLObject, int i9, String str2) {
        TLRPC.MessageMedia messageMedia;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                String MD5 = Utilities.MD5(str);
                if (MD5 != null) {
                    if (tLObject instanceof TLRPC.Photo) {
                        messageMedia = new TLRPC.TL_messageMediaPhoto();
                        messageMedia.photo = (TLRPC.Photo) tLObject;
                        messageMedia.flags |= 1;
                    } else if (tLObject instanceof TLRPC.Document) {
                        messageMedia = new TLRPC.TL_messageMediaDocument();
                        messageMedia.document = (TLRPC.Document) tLObject;
                        messageMedia.flags |= 1;
                    } else {
                        messageMedia = null;
                    }
                    if (messageMedia != null) {
                        sQLitePreparedStatement = this.database.executeFast("REPLACE INTO sent_files_v2 VALUES(?, ?, ?, ?)");
                        sQLitePreparedStatement.requery();
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(messageMedia.getObjectSize());
                        messageMedia.serializeToStream(nativeByteBuffer);
                        sQLitePreparedStatement.bindString(1, MD5);
                        sQLitePreparedStatement.bindInteger(2, i9);
                        sQLitePreparedStatement.bindByteBuffer(3, nativeByteBuffer);
                        sQLitePreparedStatement.bindString(4, str2);
                        sQLitePreparedStatement.step();
                        nativeByteBuffer.reuse();
                    } else {
                        return;
                    }
                }
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
            } catch (Exception e10) {
                checkSQLException(e10);
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
            }
        } catch (Throwable th) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    public void lambda$putStoryPushMessage$38(NotificationsController.StoryNotification storyNotification) {
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            sQLiteDatabase.executeFast("DELETE FROM story_pushes WHERE uid = " + storyNotification.dialogId).stepThis().dispose();
            SQLitePreparedStatement executeFast = this.database.executeFast("REPLACE INTO story_pushes VALUES(?, ?, ?, ?, ?, ?)");
            for (Map.Entry<Integer, Pair<Long, Long>> entry : storyNotification.dateByIds.entrySet()) {
                int intValue = entry.getKey().intValue();
                long longValue = ((Long) entry.getValue().first).longValue();
                long longValue2 = ((Long) entry.getValue().second).longValue();
                executeFast.requery();
                executeFast.bindLong(1, storyNotification.dialogId);
                executeFast.bindInteger(2, intValue);
                executeFast.bindLong(3, longValue);
                if (storyNotification.localName == null) {
                    storyNotification.localName = "";
                }
                executeFast.bindString(4, storyNotification.localName);
                executeFast.bindInteger(5, storyNotification.hidden ? 1 : 0);
                executeFast.bindLong(6, longValue2);
                executeFast.step();
            }
            executeFast.dispose();
        } catch (Exception e10) {
            checkSQLException(e10);
        }
    }

    public void lambda$putWallpapers$78(int r11, java.util.ArrayList r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$putWallpapers$78(int, java.util.ArrayList):void");
    }

    public void lambda$putWebPages$187(ArrayList arrayList) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didReceivedWebpages, arrayList);
    }

    public void lambda$putWebPages$188(a0.h r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$putWebPages$188(a0.h):void");
    }

    public void lambda$putWidgetDialogs$166(int i9, ArrayList arrayList) {
        try {
            this.database.beginTransaction();
            SQLiteDatabase sQLiteDatabase = this.database;
            sQLiteDatabase.executeFast("DELETE FROM shortcut_widget WHERE id = " + i9).stepThis().dispose();
            SQLitePreparedStatement executeFast = this.database.executeFast("REPLACE INTO shortcut_widget VALUES(?, ?, ?)");
            if (arrayList.isEmpty()) {
                executeFast.requery();
                executeFast.bindInteger(1, i9);
                executeFast.bindLong(2, -1L);
                executeFast.bindInteger(3, 0);
                executeFast.step();
            } else {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    long j10 = ((TopicKey) arrayList.get(i10)).dialogId;
                    executeFast.requery();
                    executeFast.bindInteger(1, i9);
                    executeFast.bindLong(2, j10);
                    executeFast.bindInteger(3, i10);
                    executeFast.step();
                }
            }
            executeFast.dispose();
            this.database.commitTransaction();
        } catch (Exception e10) {
            checkSQLException(e10);
        }
    }

    public void lambda$readAllDialogs$64(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, a0.h hVar) {
        MessagesStorage messagesStorage;
        getMessagesController().putUsers(arrayList, true);
        getMessagesController().putChats(arrayList2, true);
        getMessagesController().putEncryptedChats(arrayList3, true);
        for (int i9 = 0; i9 < hVar.m(); i9++) {
            long j10 = hVar.j(i9);
            ReadDialog readDialog = (ReadDialog) hVar.n(i9);
            if (!getMessagesController().isForum(j10)) {
                messagesStorage = this;
                if (!messagesStorage.isForum(j10, 8) && !messagesStorage.getMessagesController().isMonoForumWithManageRights(j10)) {
                    MessagesController messagesController = messagesStorage.getMessagesController();
                    int i10 = readDialog.lastMid;
                    messagesController.markDialogAsRead(j10, i10, i10, readDialog.date, false, 0L, readDialog.unreadCount, true, 0);
                }
            } else {
                messagesStorage = this;
            }
            messagesStorage.getMessagesController().markAllTopicsAsRead(j10);
            MessagesController messagesController2 = messagesStorage.getMessagesController();
            int i102 = readDialog.lastMid;
            messagesController2.markDialogAsRead(j10, i102, i102, readDialog.date, false, 0L, readDialog.unreadCount, true, 0);
        }
    }

    public void lambda$readAllDialogs$65(int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$readAllDialogs$65(int):void");
    }

    public void lambda$removeAllTopics$56(long j10) {
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            Locale locale = Locale.US;
            sQLiteDatabase.executeFast("DELETE FROM topics WHERE did = " + j10).stepThis().dispose();
        } catch (SQLiteException e10) {
            e10.printStackTrace();
        }
    }

    public void lambda$removeFromDownloadQueue$182(boolean z10, int i9, long j10) {
        Throwable th;
        Exception e10;
        int i10;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                try {
                    if (z10) {
                        SQLiteDatabase sQLiteDatabase = this.database;
                        Locale locale = Locale.US;
                        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT min(date) FROM download_queue WHERE type = " + i9, new Object[0]);
                        try {
                            if (queryFinalized.next()) {
                                i10 = queryFinalized.intValue(0);
                            } else {
                                i10 = -1;
                            }
                            queryFinalized.dispose();
                            if (i10 != -1) {
                                this.database.executeFast("UPDATE download_queue SET date = " + (i10 - 1) + " WHERE uid = " + j10 + " AND type = " + i9).stepThis().dispose();
                                return;
                            }
                            return;
                        } catch (Exception e11) {
                            e10 = e11;
                            sQLiteCursor = queryFinalized;
                            checkSQLException(e10);
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                                return;
                            }
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            sQLiteCursor = queryFinalized;
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            throw th;
                        }
                    }
                    SQLiteDatabase sQLiteDatabase2 = this.database;
                    Locale locale2 = Locale.US;
                    sQLiteDatabase2.executeFast("DELETE FROM download_queue WHERE uid = " + j10 + " AND type = " + i9).stepThis().dispose();
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception e12) {
                e10 = e12;
            }
        } catch (Exception e13) {
            e10 = e13;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public void lambda$removePendingTask$11(long j10) {
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            sQLiteDatabase.executeFast("DELETE FROM pending_tasks WHERE id = " + j10).stepThis().dispose();
        } catch (Exception e10) {
            checkSQLException(e10);
        }
    }

    public void lambda$removeTopic$57(long j10, long j11) {
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            Locale locale = Locale.US;
            sQLiteDatabase.executeFast("DELETE FROM topics WHERE did = " + j10 + " AND topic_id = " + j11).stepThis().dispose();
            SQLiteDatabase sQLiteDatabase2 = this.database;
            sQLiteDatabase2.executeFast("DELETE FROM messages_v2 WHERE uid = " + j10 + " AND mid IN (SELECT mid FROM messages_topics WHERE uid = " + j10 + " AND topic_id = " + j11 + ")").stepThis().dispose();
            SQLiteDatabase sQLiteDatabase3 = this.database;
            StringBuilder sb2 = new StringBuilder("DELETE FROM messages_topics WHERE uid = ");
            sb2.append(j10);
            sb2.append(" AND topic_id = ");
            sb2.append(j11);
            sQLiteDatabase3.executeFast(sb2.toString()).stepThis().dispose();
        } catch (SQLiteException e10) {
            e10.printStackTrace();
        }
    }

    public void lambda$removeTopics$58(ArrayList arrayList, long j10) {
        try {
            String join = TextUtils.join(", ", arrayList);
            SQLiteDatabase sQLiteDatabase = this.database;
            Locale locale = Locale.US;
            sQLiteDatabase.executeFast("DELETE FROM topics WHERE did = " + j10 + " AND topic_id IN (" + join + ")").stepThis().dispose();
            try {
                SQLiteDatabase sQLiteDatabase2 = this.database;
                sQLiteDatabase2.executeFast("DELETE FROM messages_v2 WHERE uid = " + j10 + " AND mid IN (SELECT mid FROM messages_topics WHERE uid = " + j10 + " AND topic_id IN (" + join + "))").stepThis().dispose();
            } catch (SQLiteException e10) {
                e10.printStackTrace();
            }
            SQLiteDatabase sQLiteDatabase3 = this.database;
            Locale locale2 = Locale.US;
            sQLiteDatabase3.executeFast("DELETE FROM messages_topics WHERE uid = " + j10 + " AND topic_id IN (" + join + ")").stepThis().dispose();
        } catch (SQLiteException e11) {
            e11.printStackTrace();
        }
    }

    public void lambda$replaceMessageIfExists$232(MessageObject messageObject, ArrayList arrayList) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.replaceMessagesObjects, Long.valueOf(messageObject.getDialogId()), arrayList);
    }

    public void lambda$replaceMessageIfExists$233(ArrayList arrayList) {
        if (getMessagesController().getSavedMessagesController().updateSavedDialogs(arrayList)) {
            getMessagesController().getSavedMessagesController().update();
        }
    }

    public void lambda$replaceMessageIfExists$234(org.telegram.tgnet.TLRPC.Message r27, boolean r28, java.util.ArrayList r29, java.util.ArrayList r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$replaceMessageIfExists$234(org.telegram.tgnet.TLRPC$Message, boolean, java.util.ArrayList, java.util.ArrayList):void");
    }

    public void lambda$reset$61() {
        for (int i9 = 0; i9 < 2; i9++) {
            getUserConfig().setDialogsLoadOffset(i9, 0, 0, 0L, 0L, 0L, 0L);
            getUserConfig().setTotalDialogsCount(i9, 0);
        }
        getUserConfig().clearFilters();
        getUserConfig().clearPinnedDialogsLoaded();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didClearDatabase, new Object[0]);
        getMediaDataController().loadAttachMenuBots(false, true);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onDatabaseReset, new Object[0]);
        getMessagesController().getStoriesController().q();
    }

    public void lambda$resetAllUnreadCounters$250() {
        ArrayList<MessagesController.DialogFilter> arrayList = getMessagesController().dialogFilters;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            arrayList.get(i9).unreadCount = arrayList.get(i9).pendingUnreadCount;
        }
        this.mainUnreadCount = this.pendingMainUnreadCount;
        this.archiveUnreadCount = this.pendingArchiveUnreadCount;
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE));
    }

    public static int lambda$resetDialogs$94(LongSparseIntArray longSparseIntArray, Long l10, Long l11) {
        int i9 = longSparseIntArray.get(l10.longValue());
        int i10 = longSparseIntArray.get(l11.longValue());
        if (i9 < i10) {
            return 1;
        }
        if (i9 > i10) {
            return -1;
        }
        return 0;
    }

    public void lambda$resetDialogs$95(org.telegram.tgnet.TLRPC.messages_Dialogs r31, int r32, int r33, int r34, int r35, int r36, org.telegram.tgnet.TLRPC.Message r37, int r38, a0.h r39, a0.h r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$resetDialogs$95(org.telegram.tgnet.TLRPC$messages_Dialogs, int, int, int, int, int, org.telegram.tgnet.TLRPC$Message, int, a0.h, a0.h):void");
    }

    public void lambda$resetMentionsCount$114(long j10, long j11, int i9) {
        Throwable th;
        Exception e10;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                try {
                    if (j10 == 0) {
                        SQLiteDatabase sQLiteDatabase = this.database;
                        int i10 = 0;
                        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT unread_count_i FROM dialogs WHERE did = " + j11, new Object[0]);
                        try {
                            if (queryFinalized.next()) {
                                i10 = queryFinalized.intValue(0);
                            }
                            queryFinalized.dispose();
                            if (i10 != 0 || i9 != 0) {
                                if (i9 == 0) {
                                    SQLiteDatabase sQLiteDatabase2 = this.database;
                                    Locale locale = Locale.US;
                                    sQLiteDatabase2.executeFast("UPDATE messages_v2 SET read_state = read_state | 2 WHERE uid = " + j11 + " AND mention = 1 AND read_state IN(0, 1)").stepThis().dispose();
                                }
                                SQLiteDatabase sQLiteDatabase3 = this.database;
                                Locale locale2 = Locale.US;
                                sQLiteDatabase3.executeFast("UPDATE dialogs SET unread_count_i = " + i9 + " WHERE did = " + j11).stepThis().dispose();
                                LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                                longSparseIntArray.put(j11, i9);
                                getMessagesController().processDialogsUpdateRead(null, longSparseIntArray);
                                if (i9 == 0) {
                                    updateFiltersReadCounter(null, longSparseIntArray, true);
                                    return;
                                }
                                return;
                            }
                            return;
                        } catch (Exception e11) {
                            e10 = e11;
                            sQLiteCursor = queryFinalized;
                            checkSQLException(e10);
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                                return;
                            }
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            sQLiteCursor = queryFinalized;
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            throw th;
                        }
                    }
                    SQLiteDatabase sQLiteDatabase4 = this.database;
                    Locale locale3 = Locale.US;
                    sQLiteDatabase4.executeFast("UPDATE topics SET unread_mentions = " + i9 + " WHERE did = " + j11 + " AND topic_id = " + j10).stepThis().dispose();
                    TopicsController.TopicUpdate topicUpdate = new TopicsController.TopicUpdate();
                    topicUpdate.dialogId = j11;
                    topicUpdate.topicId = j10;
                    topicUpdate.onlyCounters = true;
                    topicUpdate.unreadMentions = i9;
                    topicUpdate.unreadCount = -1;
                    getMessagesController().getTopicsController().processUpdate(Collections.singletonList(topicUpdate));
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception e12) {
                e10 = e12;
            }
        } catch (Exception e13) {
            e10 = e13;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public void lambda$saveBotCache$126(TLObject tLObject, String str) {
        int currentTime;
        int i9;
        SQLitePreparedStatement executeFast;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                currentTime = getConnectionsManager().getCurrentTime();
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e10) {
            e = e10;
        }
        try {
            if (tLObject instanceof TLRPC.TL_messages_botCallbackAnswer) {
                i9 = ((TLRPC.TL_messages_botCallbackAnswer) tLObject).cache_time;
            } else {
                if (tLObject instanceof TLRPC.TL_messages_botResults) {
                    i9 = ((TLRPC.TL_messages_botResults) tLObject).cache_time;
                }
                executeFast = this.database.executeFast("REPLACE INTO botcache VALUES(?, ?, ?)");
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLObject.getObjectSize());
                tLObject.serializeToStream(nativeByteBuffer);
                executeFast.bindString(1, str);
                executeFast.bindInteger(2, currentTime);
                executeFast.bindByteBuffer(3, nativeByteBuffer);
                executeFast.step();
                executeFast.dispose();
                nativeByteBuffer.reuse();
                return;
            }
            NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(tLObject.getObjectSize());
            tLObject.serializeToStream(nativeByteBuffer2);
            executeFast.bindString(1, str);
            executeFast.bindInteger(2, currentTime);
            executeFast.bindByteBuffer(3, nativeByteBuffer2);
            executeFast.step();
            executeFast.dispose();
            nativeByteBuffer2.reuse();
            return;
        } catch (Exception e11) {
            e = e11;
            sQLitePreparedStatement = executeFast;
            checkSQLException(e);
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
                return;
            }
            return;
        } catch (Throwable th2) {
            th = th2;
            sQLitePreparedStatement = executeFast;
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
        currentTime += i9;
        executeFast = this.database.executeFast("REPLACE INTO botcache VALUES(?, ?, ?)");
    }

    public void lambda$saveChannelPts$34(int i9, long j10) {
        try {
            SQLitePreparedStatement executeFast = this.database.executeFast("UPDATE dialogs SET pts = ? WHERE did = ?");
            executeFast.bindInteger(1, i9);
            executeFast.bindLong(2, -j10);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e10) {
            checkSQLException(e10);
        }
    }

    public void lambda$saveChatInviter$132(long j10, long j11) {
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = this.database.executeFast("UPDATE chat_settings_v2 SET inviter = ? WHERE uid = ?");
                sQLitePreparedStatement.requery();
                sQLitePreparedStatement.bindLong(1, j10);
                sQLitePreparedStatement.bindLong(2, j11);
                sQLitePreparedStatement.step();
                sQLitePreparedStatement.dispose();
                sQLitePreparedStatement.dispose();
            } catch (Exception e10) {
                checkSQLException(e10);
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
            }
        } catch (Throwable th) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    public void lambda$saveChatLinksCount$133(int i9, long j10) {
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = this.database.executeFast("UPDATE chat_settings_v2 SET links = ? WHERE uid = ?");
                sQLitePreparedStatement.requery();
                sQLitePreparedStatement.bindInteger(1, i9);
                sQLitePreparedStatement.bindLong(2, j10);
                sQLitePreparedStatement.step();
                sQLitePreparedStatement.dispose();
            } catch (Exception e10) {
                checkSQLException(e10);
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
            }
        } catch (Throwable th) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    public void lambda$saveDialogFilter$73() {
        ArrayList<MessagesController.DialogFilter> arrayList = getMessagesController().dialogFilters;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            arrayList.get(i9).unreadCount = arrayList.get(i9).pendingUnreadCount;
        }
        this.mainUnreadCount = this.pendingMainUnreadCount;
        this.archiveUnreadCount = this.pendingArchiveUnreadCount;
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE));
    }

    public void lambda$saveDialogFilter$74(MessagesController.DialogFilter dialogFilter, boolean z10, boolean z11) {
        saveDialogFilterInternal(dialogFilter, z10, z11);
        calcUnreadCounters(false);
        AndroidUtilities.runOnUIThread(new f2(this, 1));
    }

    public void lambda$saveDialogFiltersOrder$75(ArrayList arrayList) {
        this.dialogFilters.clear();
        this.dialogFiltersMap.clear();
        this.dialogFilters.addAll(arrayList);
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            ((MessagesController.DialogFilter) arrayList.get(i9)).order = i9;
            this.dialogFiltersMap.put(((MessagesController.DialogFilter) arrayList.get(i9)).f19649id, (MessagesController.DialogFilter) arrayList.get(i9));
        }
        saveDialogFiltersOrderInternal();
    }

    public void lambda$saveSecretParams$7(int i9, int i10, byte[] bArr) {
        try {
            SQLitePreparedStatement executeFast = this.database.executeFast("UPDATE params SET lsv = ?, sg = ?, pbytes = ? WHERE id = 1");
            int i11 = 1;
            executeFast.bindInteger(1, i9);
            executeFast.bindInteger(2, i10);
            if (bArr != null) {
                i11 = bArr.length;
            }
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(i11);
            if (bArr != null) {
                nativeByteBuffer.writeBytes(bArr);
            }
            executeFast.bindByteBuffer(3, nativeByteBuffer);
            executeFast.step();
            executeFast.dispose();
            nativeByteBuffer.reuse();
        } catch (Exception e10) {
            checkSQLException(e10);
        }
    }

    public void lambda$saveTopics$47(long j10, List list, boolean z10, int i9) {
        saveTopicsInternal(j10, list, z10, true, i9);
    }

    public void lambda$searchSavedByTag$103(java.lang.String r36, long r37, org.telegram.tgnet.TLRPC.Reaction r39, int r40, int r41, boolean r42, org.telegram.messenger.Utilities.Callback4 r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$searchSavedByTag$103(java.lang.String, long, org.telegram.tgnet.TLRPC$Reaction, int, int, boolean, org.telegram.messenger.Utilities$Callback4):void");
    }

    public void lambda$setDialogFlags$37(long j10, long j11) {
        try {
            int i9 = 0;
            SQLiteCursor queryFinalized = this.database.queryFinalized("SELECT flags FROM dialog_settings WHERE did = " + j10, new Object[0]);
            if (queryFinalized.next()) {
                i9 = queryFinalized.intValue(0);
            }
            queryFinalized.dispose();
            if (j11 == i9) {
                return;
            }
            SQLiteDatabase sQLiteDatabase = this.database;
            Locale locale = Locale.US;
            sQLiteDatabase.executeFast("REPLACE INTO dialog_settings VALUES(" + j10 + ", " + j11 + ")").stepThis().dispose();
            resetAllUnreadCounters(true);
        } catch (Exception e10) {
            checkSQLException(e10);
        }
    }

    public void lambda$setDialogPinned$251(int i9, long j10) {
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = this.database.executeFast("UPDATE dialogs SET pinned = ? WHERE did = ?");
                sQLitePreparedStatement.bindInteger(1, i9);
                sQLitePreparedStatement.bindLong(2, j10);
                sQLitePreparedStatement.step();
                sQLitePreparedStatement.dispose();
            } catch (Exception e10) {
                checkSQLException(e10);
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
            }
        } catch (Throwable th) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    public void lambda$setDialogTtl$60(int i9, long j10) {
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            Locale locale = Locale.US;
            sQLiteDatabase.executeFast("UPDATE dialogs SET ttl_period = " + i9 + " WHERE did = " + j10).stepThis().dispose();
        } catch (SQLiteException e10) {
            checkSQLException(e10);
        }
    }

    public void lambda$setDialogUnread$248(long r6, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$setDialogUnread$248(long, boolean):void");
    }

    public void lambda$setDialogViewThreadAsMessages$249(long r6, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$setDialogViewThreadAsMessages$249(long, boolean):void");
    }

    public void lambda$setDialogsFolderId$244(ArrayList arrayList, ArrayList arrayList2, int i9, long j10) {
        SQLitePreparedStatement executeFast;
        boolean z10;
        boolean z11;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                this.database.beginTransaction();
                executeFast = this.database.executeFast("UPDATE dialogs SET folder_id = ?, pinned = ? WHERE did = ?");
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e10) {
            e = e10;
        }
        try {
            if (arrayList != null) {
                int size = arrayList.size();
                z11 = false;
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.TL_folderPeer tL_folderPeer = (TLRPC.TL_folderPeer) arrayList.get(i10);
                    long peerDialogId = DialogObject.getPeerDialogId(tL_folderPeer.peer);
                    executeFast.requery();
                    executeFast.bindInteger(1, tL_folderPeer.folder_id);
                    if (tL_folderPeer.folder_id == 1) {
                        z11 = true;
                    }
                    executeFast.bindInteger(2, 0);
                    executeFast.bindLong(3, peerDialogId);
                    executeFast.step();
                    this.unknownDialogsIds.l(peerDialogId);
                }
            } else if (arrayList2 != null) {
                int size2 = arrayList2.size();
                z11 = false;
                for (int i11 = 0; i11 < size2; i11++) {
                    TLRPC.TL_inputFolderPeer tL_inputFolderPeer = (TLRPC.TL_inputFolderPeer) arrayList2.get(i11);
                    long peerDialogId2 = DialogObject.getPeerDialogId(tL_inputFolderPeer.peer);
                    executeFast.requery();
                    executeFast.bindInteger(1, tL_inputFolderPeer.folder_id);
                    if (tL_inputFolderPeer.folder_id == 1) {
                        z11 = true;
                    }
                    executeFast.bindInteger(2, 0);
                    executeFast.bindLong(3, peerDialogId2);
                    executeFast.step();
                    this.unknownDialogsIds.l(peerDialogId2);
                }
            } else {
                executeFast.requery();
                executeFast.bindInteger(1, i9);
                if (i9 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                executeFast.bindInteger(2, 0);
                executeFast.bindLong(3, j10);
                executeFast.step();
                z11 = z10;
            }
            executeFast.dispose();
            this.database.commitTransaction();
            if (!z11) {
                lambda$checkIfFolderEmpty$246(1);
            }
            resetAllUnreadCounters(false);
            SQLiteDatabase sQLiteDatabase = this.database;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.commitTransaction();
            }
        } catch (Exception e11) {
            e = e11;
            sQLitePreparedStatement = executeFast;
            checkSQLException(e);
            SQLiteDatabase sQLiteDatabase2 = this.database;
            if (sQLiteDatabase2 != null) {
                sQLiteDatabase2.commitTransaction();
            }
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
        } catch (Throwable th2) {
            th = th2;
            sQLitePreparedStatement = executeFast;
            SQLiteDatabase sQLiteDatabase3 = this.database;
            if (sQLiteDatabase3 != null) {
                sQLiteDatabase3.commitTransaction();
            }
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    public void lambda$setDialogsPinned$252(ArrayList arrayList, ArrayList arrayList2) {
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = this.database.executeFast("UPDATE dialogs SET pinned = ? WHERE did = ?");
                int size = arrayList.size();
                for (int i9 = 0; i9 < size; i9++) {
                    sQLitePreparedStatement.requery();
                    sQLitePreparedStatement.bindInteger(1, ((Integer) arrayList2.get(i9)).intValue());
                    sQLitePreparedStatement.bindLong(2, ((Long) arrayList.get(i9)).longValue());
                    sQLitePreparedStatement.step();
                }
                sQLitePreparedStatement.dispose();
            } catch (Exception e10) {
                checkSQLException(e10);
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
            }
        } catch (Throwable th) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    public void lambda$setMessageSeq$211(int i9, int i10, int i11) {
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = this.database.executeFast("REPLACE INTO messages_seq VALUES(?, ?, ?)");
                sQLitePreparedStatement.requery();
                sQLitePreparedStatement.bindInteger(1, i9);
                sQLitePreparedStatement.bindInteger(2, i10);
                sQLitePreparedStatement.bindInteger(3, i11);
                sQLitePreparedStatement.step();
                sQLitePreparedStatement.dispose();
            } catch (Exception e10) {
                checkSQLException(e10);
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
            }
        } catch (Throwable th) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    public void lambda$toggleTodo$100(long r28, int r30, long r31, long r33, int r35, boolean r36, int r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$toggleTodo$100(long, int, long, long, int, boolean, int):void");
    }

    public void lambda$unpinAllDialogsExceptNew$247(java.util.ArrayList r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$unpinAllDialogsExceptNew$247(java.util.ArrayList, int):void");
    }

    public void lambda$updateChannelUsers$125(long r12, java.util.ArrayList r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$updateChannelUsers$125(long, java.util.ArrayList):void");
    }

    public void lambda$updateChatDefaultBannedRights$180(long r6, int r8, org.telegram.tgnet.TLRPC.TL_chatBannedRights r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$updateChatDefaultBannedRights$180(long, int, org.telegram.tgnet.TLRPC$TL_chatBannedRights):void");
    }

    public void lambda$updateChatInfo$134(org.telegram.tgnet.TLRPC.ChatFull r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$updateChatInfo$134(org.telegram.tgnet.TLRPC$ChatFull, boolean):void");
    }

    public void lambda$updateChatInfo$139(TLRPC.ChatFull chatFull) {
        NotificationCenter notificationCenter = getNotificationCenter();
        int i9 = NotificationCenter.chatInfoDidLoad;
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i9, chatFull, 0, bool, bool);
    }

    public void lambda$updateChatInfo$140(long r18, int r20, long r21, long r23, int r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$updateChatInfo$140(long, int, long, long, int):void");
    }

    public void lambda$updateChatOnlineCount$135(int i9, long j10) {
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = this.database.executeFast("UPDATE chat_settings_v2 SET online = ? WHERE uid = ?");
                sQLitePreparedStatement.requery();
                sQLitePreparedStatement.bindInteger(1, i9);
                sQLitePreparedStatement.bindLong(2, j10);
                sQLitePreparedStatement.step();
                sQLitePreparedStatement.dispose();
            } catch (Exception e10) {
                checkSQLException(e10);
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
            }
        } catch (Throwable th) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    public void lambda$updateChatParticipants$121(TLRPC.ChatFull chatFull) {
        NotificationCenter notificationCenter = getNotificationCenter();
        int i9 = NotificationCenter.chatInfoDidLoad;
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i9, chatFull, 0, bool, bool);
    }

    public void lambda$updateChatParticipants$122(TLRPC.ChatParticipants chatParticipants) {
        SQLiteCursor queryFinalized;
        TLRPC.ChatFull chatFull;
        NativeByteBuffer byteBufferValue;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                queryFinalized = this.database.queryFinalized("SELECT info, pinned, online, inviter FROM chat_settings_v2 WHERE uid = " + chatParticipants.chat_id, new Object[0]);
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            new ArrayList();
            if (queryFinalized.next() && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                TLRPC.ChatFull TLdeserialize = TLRPC.ChatFull.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                byteBufferValue.reuse();
                TLdeserialize.pinned_msg_id = queryFinalized.intValue(1);
                TLdeserialize.online_count = queryFinalized.intValue(2);
                TLdeserialize.inviterId = queryFinalized.longValue(3);
                chatFull = TLdeserialize;
            } else {
                chatFull = null;
            }
            queryFinalized.dispose();
            if (chatFull instanceof TLRPC.TL_chatFull) {
                chatFull.participants = chatParticipants;
                AndroidUtilities.runOnUIThread(new cf(this, chatFull, 0));
                SQLitePreparedStatement executeFast = this.database.executeFast("REPLACE INTO chat_settings_v2 VALUES(?, ?, ?, ?, ?, ?, ?)");
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(chatFull.getObjectSize());
                chatFull.serializeToStream(nativeByteBuffer);
                executeFast.bindLong(1, chatFull.f22381id);
                executeFast.bindByteBuffer(2, nativeByteBuffer);
                executeFast.bindInteger(3, chatFull.pinned_msg_id);
                executeFast.bindInteger(4, chatFull.online_count);
                executeFast.bindLong(5, chatFull.inviterId);
                executeFast.bindInteger(6, chatFull.invitesCount);
                executeFast.bindInteger(7, chatFull.participants_count);
                executeFast.step();
                executeFast.dispose();
                nativeByteBuffer.reuse();
            }
        } catch (Exception e11) {
            e = e11;
            sQLiteCursor = queryFinalized;
            checkSQLException(e);
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteCursor = queryFinalized;
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    public void lambda$updateDbToLastVersion$3() {
        this.databaseMigrationInProgress = true;
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onDatabaseMigration, Boolean.TRUE);
    }

    public void lambda$updateDbToLastVersion$4() {
        this.databaseMigrationInProgress = false;
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onDatabaseMigration, Boolean.FALSE);
    }

    public void lambda$updateDialogData$241(org.telegram.tgnet.TLRPC.Dialog r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$updateDialogData$241(org.telegram.tgnet.TLRPC$Dialog):void");
    }

    public void lambda$updateDialogUnreadReactionsInternal$264(boolean r18, java.lang.String r19, long r20, int r22, long r23, java.lang.String r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$updateDialogUnreadReactionsInternal$264(boolean, java.lang.String, long, int, long, java.lang.String):void");
    }

    public void lambda$updateDialogsWithReadMessages$120(LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, a0.h hVar, LongSparseIntArray longSparseIntArray3) {
        updateDialogsWithReadMessagesInternal(null, longSparseIntArray, longSparseIntArray2, hVar, longSparseIntArray3);
    }

    public void lambda$updateEncryptedChat$174(org.telegram.tgnet.TLRPC.EncryptedChat r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$updateEncryptedChat$174(org.telegram.tgnet.TLRPC$EncryptedChat):void");
    }

    public void lambda$updateEncryptedChatLayer$173(TLRPC.EncryptedChat encryptedChat) {
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = this.database.executeFast("UPDATE enc_chats SET layer = ? WHERE uid = ?");
                sQLitePreparedStatement.bindInteger(1, encryptedChat.layer);
                sQLitePreparedStatement.bindInteger(2, encryptedChat.f22388id);
                sQLitePreparedStatement.step();
                sQLitePreparedStatement.dispose();
            } catch (Exception e10) {
                checkSQLException(e10);
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
            }
        } catch (Throwable th) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    public void lambda$updateEncryptedChatSeq$171(TLRPC.EncryptedChat encryptedChat, boolean z10) {
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = this.database.executeFast("UPDATE enc_chats SET seq_in = ?, seq_out = ?, use_count = ?, in_seq_no = ?, mtproto_seq = ? WHERE uid = ?");
                sQLitePreparedStatement.bindInteger(1, encryptedChat.seq_in);
                sQLitePreparedStatement.bindInteger(2, encryptedChat.seq_out);
                sQLitePreparedStatement.bindInteger(3, (encryptedChat.key_use_count_in << 16) | encryptedChat.key_use_count_out);
                sQLitePreparedStatement.bindInteger(4, encryptedChat.in_seq_no);
                sQLitePreparedStatement.bindInteger(5, encryptedChat.mtproto_seq);
                sQLitePreparedStatement.bindInteger(6, encryptedChat.f22388id);
                sQLitePreparedStatement.step();
                if (z10 && encryptedChat.in_seq_no != 0) {
                    long encryptedChatId = DialogObject.getEncryptedChatId(encryptedChat.f22388id);
                    SQLiteDatabase sQLiteDatabase = this.database;
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM messages_v2 WHERE mid IN (SELECT m.mid FROM messages_v2 as m LEFT JOIN messages_seq as s ON m.mid = s.mid WHERE m.uid = " + encryptedChatId + " AND m.date = 0 AND m.mid < 0 AND s.seq_out <= " + encryptedChat.in_seq_no + ") AND uid = " + encryptedChatId).stepThis().dispose();
                }
                sQLitePreparedStatement.dispose();
            } catch (Exception e10) {
                checkSQLException(e10);
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
            }
        } catch (Throwable th) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    public void lambda$updateEncryptedChatTTL$172(TLRPC.EncryptedChat encryptedChat) {
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = this.database.executeFast("UPDATE enc_chats SET ttl = ? WHERE uid = ?");
                sQLitePreparedStatement.bindInteger(1, encryptedChat.ttl);
                sQLitePreparedStatement.bindInteger(2, encryptedChat.f22388id);
                sQLitePreparedStatement.step();
                sQLitePreparedStatement.dispose();
            } catch (Exception e10) {
                checkSQLException(e10);
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
            }
        } catch (Throwable th) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    public void lambda$updateFiltersReadCounter$119() {
        ArrayList<MessagesController.DialogFilter> arrayList = getMessagesController().dialogFilters;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            arrayList.get(i9).unreadCount = arrayList.get(i9).pendingUnreadCount;
        }
        this.mainUnreadCount = this.pendingMainUnreadCount;
        this.archiveUnreadCount = this.pendingArchiveUnreadCount;
    }

    public void lambda$updateMessageCustomParams$110(TLRPC.Message message, long j10) {
        SQLitePreparedStatement executeFast;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                this.database.beginTransaction();
                TLRPC.Message messageWithCustomParamsOnlyInternal = getMessageWithCustomParamsOnlyInternal(message.f22401id, j10);
                MessageCustomParamsHelper.copyParams(message, messageWithCustomParamsOnlyInternal);
                for (int i9 = 0; i9 < 2; i9++) {
                    if (i9 == 0) {
                        executeFast = this.database.executeFast("UPDATE messages_v2 SET custom_params = ? WHERE mid = ? AND uid = ?");
                    } else {
                        executeFast = this.database.executeFast("UPDATE messages_topics SET custom_params = ? WHERE mid = ? AND uid = ?");
                    }
                    try {
                        executeFast.requery();
                        NativeByteBuffer writeLocalParams = MessageCustomParamsHelper.writeLocalParams(messageWithCustomParamsOnlyInternal);
                        if (writeLocalParams != null) {
                            executeFast.bindByteBuffer(1, writeLocalParams);
                        } else {
                            executeFast.bindNull(1);
                        }
                        executeFast.bindInteger(2, message.f22401id);
                        executeFast.bindLong(3, j10);
                        executeFast.step();
                        executeFast.dispose();
                        if (writeLocalParams != null) {
                            writeLocalParams.reuse();
                        }
                    } catch (Exception e10) {
                        e = e10;
                        sQLitePreparedStatement = executeFast;
                        checkSQLException(e);
                        SQLiteDatabase sQLiteDatabase = this.database;
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        sQLitePreparedStatement = executeFast;
                        SQLiteDatabase sQLiteDatabase2 = this.database;
                        if (sQLiteDatabase2 != null) {
                            sQLiteDatabase2.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th;
                    }
                }
                this.database.commitTransaction();
                SQLiteDatabase sQLiteDatabase3 = this.database;
                if (sQLiteDatabase3 != null) {
                    sQLiteDatabase3.commitTransaction();
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void lambda$updateMessagePollResults$101(long r27, org.telegram.tgnet.TLRPC.Poll r29, org.telegram.tgnet.TLRPC.PollResults r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$updateMessagePollResults$101(long, org.telegram.tgnet.TLRPC$Poll, org.telegram.tgnet.TLRPC$PollResults):void");
    }

    public void lambda$updateMessageReactions$104(int r20, long r21, org.telegram.tgnet.TLRPC.TL_messageReactions r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$updateMessageReactions$104(int, long, org.telegram.tgnet.TLRPC$TL_messageReactions):void");
    }

    public void lambda$updateMessageStateAndIdInternal$212(TLRPC.TL_updates tL_updates) {
        getMessagesController().processUpdates(tL_updates, false);
    }

    public void lambda$updateMessageTopicId$214(int i9, long j10, long j11) {
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = this.database.executeFast("UPDATE messages_topics SET topic_id = ? WHERE uid = ? AND mid = ?");
                sQLitePreparedStatement.requery();
                sQLitePreparedStatement.bindLong(1, i9);
                sQLitePreparedStatement.bindLong(2, j10);
                sQLitePreparedStatement.bindLong(3, j11);
                sQLitePreparedStatement.step();
                sQLitePreparedStatement.dispose();
            } catch (Exception e10) {
                checkSQLException(e10);
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
            }
        } catch (Throwable th) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    public void lambda$updateMessageVerifyFlags$195(ArrayList arrayList) {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        int i9;
        boolean z10 = false;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                this.database.beginTransaction();
                try {
                    SQLitePreparedStatement executeFast = this.database.executeFast("UPDATE messages_v2 SET imp = ? WHERE mid = ? AND uid = ?");
                    try {
                        int size = arrayList.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            TLRPC.Message message = (TLRPC.Message) arrayList.get(i10);
                            executeFast.requery();
                            int i11 = message.stickerVerified;
                            if (i11 == 0) {
                                i9 = 1;
                            } else if (i11 == 2) {
                                i9 = 2;
                            } else {
                                i9 = 0;
                            }
                            executeFast.bindInteger(1, i9);
                            executeFast.bindInteger(2, message.f22401id);
                            executeFast.bindLong(3, MessageObject.getDialogId(message));
                            executeFast.step();
                        }
                        executeFast.dispose();
                        this.database.commitTransaction();
                    } catch (Exception e10) {
                        e = e10;
                        sQLitePreparedStatement = executeFast;
                        z10 = true;
                        checkSQLException(e);
                        if (z10 && (sQLiteDatabase2 = this.database) != null) {
                            sQLiteDatabase2.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                    } catch (Throwable th) {
                        th = th;
                        sQLitePreparedStatement = executeFast;
                        z10 = true;
                        if (z10 && (sQLiteDatabase = this.database) != null) {
                            sQLiteDatabase.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e11) {
                    e = e11;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e12) {
                e = e12;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public void lambda$updateMessageVoiceTranscription$108(int i9, long j10, boolean z10, long j11, String str) {
        TLRPC.Message messageWithCustomParamsOnlyInternal;
        SQLitePreparedStatement executeFast;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                this.database.beginTransaction();
                messageWithCustomParamsOnlyInternal = getMessageWithCustomParamsOnlyInternal(i9, j10);
                messageWithCustomParamsOnlyInternal.voiceTranscriptionFinal = z10;
                messageWithCustomParamsOnlyInternal.voiceTranscriptionId = j11;
                messageWithCustomParamsOnlyInternal.voiceTranscription = str;
                executeFast = this.database.executeFast("UPDATE messages_v2 SET custom_params = ? WHERE mid = ? AND uid = ?");
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            executeFast.requery();
            NativeByteBuffer writeLocalParams = MessageCustomParamsHelper.writeLocalParams(messageWithCustomParamsOnlyInternal);
            if (writeLocalParams != null) {
                executeFast.bindByteBuffer(1, writeLocalParams);
            } else {
                executeFast.bindNull(1);
            }
            executeFast.bindInteger(2, i9);
            executeFast.bindLong(3, j10);
            executeFast.step();
            executeFast.dispose();
            this.database.commitTransaction();
            if (writeLocalParams != null) {
                writeLocalParams.reuse();
            }
            SQLiteDatabase sQLiteDatabase = this.database;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.commitTransaction();
            }
        } catch (Exception e11) {
            e = e11;
            sQLitePreparedStatement = executeFast;
            checkSQLException(e);
            SQLiteDatabase sQLiteDatabase2 = this.database;
            if (sQLiteDatabase2 != null) {
                sQLiteDatabase2.commitTransaction();
            }
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
        } catch (Throwable th2) {
            th = th2;
            sQLitePreparedStatement = executeFast;
            SQLiteDatabase sQLiteDatabase3 = this.database;
            if (sQLiteDatabase3 != null) {
                sQLiteDatabase3.commitTransaction();
            }
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    public void lambda$updateMessageVoiceTranscription$109(int i9, long j10, TLRPC.Message message, String str) {
        SQLitePreparedStatement executeFast;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                this.database.beginTransaction();
                TLRPC.Message messageWithCustomParamsOnlyInternal = getMessageWithCustomParamsOnlyInternal(i9, j10);
                messageWithCustomParamsOnlyInternal.voiceTranscriptionOpen = message.voiceTranscriptionOpen;
                messageWithCustomParamsOnlyInternal.voiceTranscriptionRated = message.voiceTranscriptionRated;
                messageWithCustomParamsOnlyInternal.voiceTranscriptionFinal = message.voiceTranscriptionFinal;
                messageWithCustomParamsOnlyInternal.voiceTranscriptionForce = message.voiceTranscriptionForce;
                messageWithCustomParamsOnlyInternal.voiceTranscriptionId = message.voiceTranscriptionId;
                messageWithCustomParamsOnlyInternal.voiceTranscription = str;
                for (int i10 = 0; i10 < 2; i10++) {
                    if (i10 == 0) {
                        executeFast = this.database.executeFast("UPDATE messages_v2 SET custom_params = ? WHERE mid = ? AND uid = ?");
                    } else {
                        executeFast = this.database.executeFast("UPDATE messages_topics SET custom_params = ? WHERE mid = ? AND uid = ?");
                    }
                    try {
                        executeFast.requery();
                        NativeByteBuffer writeLocalParams = MessageCustomParamsHelper.writeLocalParams(messageWithCustomParamsOnlyInternal);
                        if (writeLocalParams != null) {
                            executeFast.bindByteBuffer(1, writeLocalParams);
                        } else {
                            executeFast.bindNull(1);
                        }
                        executeFast.bindInteger(2, i9);
                        executeFast.bindLong(3, j10);
                        executeFast.step();
                        executeFast.dispose();
                        this.database.commitTransaction();
                        if (writeLocalParams != null) {
                            writeLocalParams.reuse();
                        }
                    } catch (Exception e10) {
                        e = e10;
                        sQLitePreparedStatement = executeFast;
                        checkSQLException(e);
                        SQLiteDatabase sQLiteDatabase = this.database;
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        sQLitePreparedStatement = executeFast;
                        SQLiteDatabase sQLiteDatabase2 = this.database;
                        if (sQLiteDatabase2 != null) {
                            sQLiteDatabase2.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th;
                    }
                }
                SQLiteDatabase sQLiteDatabase3 = this.database;
                if (sQLiteDatabase3 != null) {
                    sQLiteDatabase3.commitTransaction();
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void lambda$updateMessageVoiceTranscriptionOpen$107(int i9, long j10, TLRPC.Message message) {
        SQLitePreparedStatement executeFast;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                this.database.beginTransaction();
                TLRPC.Message messageWithCustomParamsOnlyInternal = getMessageWithCustomParamsOnlyInternal(i9, j10);
                messageWithCustomParamsOnlyInternal.voiceTranscriptionOpen = message.voiceTranscriptionOpen;
                messageWithCustomParamsOnlyInternal.voiceTranscriptionRated = message.voiceTranscriptionRated;
                messageWithCustomParamsOnlyInternal.voiceTranscriptionFinal = message.voiceTranscriptionFinal;
                messageWithCustomParamsOnlyInternal.voiceTranscriptionForce = message.voiceTranscriptionForce;
                messageWithCustomParamsOnlyInternal.voiceTranscriptionId = message.voiceTranscriptionId;
                for (int i10 = 0; i10 < 2; i10++) {
                    if (i10 == 0) {
                        executeFast = this.database.executeFast("UPDATE messages_v2 SET custom_params = ? WHERE mid = ? AND uid = ?");
                    } else {
                        executeFast = this.database.executeFast("UPDATE messages_topics SET custom_params = ? WHERE mid = ? AND uid = ?");
                    }
                    try {
                        executeFast.requery();
                        NativeByteBuffer writeLocalParams = MessageCustomParamsHelper.writeLocalParams(messageWithCustomParamsOnlyInternal);
                        if (writeLocalParams != null) {
                            executeFast.bindByteBuffer(1, writeLocalParams);
                        } else {
                            executeFast.bindNull(1);
                        }
                        executeFast.bindInteger(2, i9);
                        executeFast.bindLong(3, j10);
                        executeFast.step();
                        executeFast.dispose();
                        if (writeLocalParams != null) {
                            writeLocalParams.reuse();
                        }
                    } catch (Exception e10) {
                        e = e10;
                        sQLitePreparedStatement = executeFast;
                        checkSQLException(e);
                        SQLiteDatabase sQLiteDatabase = this.database;
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        sQLitePreparedStatement = executeFast;
                        SQLiteDatabase sQLiteDatabase2 = this.database;
                        if (sQLiteDatabase2 != null) {
                            sQLiteDatabase2.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th;
                    }
                }
                this.database.commitTransaction();
                SQLiteDatabase sQLiteDatabase3 = this.database;
                if (sQLiteDatabase3 != null) {
                    sQLiteDatabase3.commitTransaction();
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void lambda$updateMutedDialogsFiltersCounters$36() {
        resetAllUnreadCounters(true);
    }

    public void lambda$updatePinnedMessages$136(long j10, ArrayList arrayList, HashMap hashMap, int i9, int i10, boolean z10) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(j10), arrayList, Boolean.TRUE, 0, hashMap, Integer.valueOf(i9), Integer.valueOf(i10), Boolean.valueOf(z10));
    }

    public void lambda$updatePinnedMessages$137(long j10, ArrayList arrayList, HashMap hashMap, int i9, int i10, boolean z10) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(j10), arrayList, Boolean.FALSE, 0, hashMap, Integer.valueOf(i9), Integer.valueOf(i10), Boolean.valueOf(z10));
    }

    public void lambda$updatePinnedMessages$138(boolean r18, final java.util.HashMap r19, final int r20, final long r21, final java.util.ArrayList r23, int r24, boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$updatePinnedMessages$138(boolean, java.util.HashMap, int, long, java.util.ArrayList, int, boolean):void");
    }

    public void lambda$updateRanksInLastMessages$45(long j10, long j11, String str) {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, 0);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updatedChatRanks, Long.valueOf(-j10), Long.valueOf(j11), str);
    }

    public void lambda$updateRanksInLastMessages$46(long r10, long r12, java.lang.String r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$updateRanksInLastMessages$46(long, long, java.lang.String):void");
    }

    public void lambda$updateRepliesCount$194(int r7, long r8, int r10, java.util.ArrayList r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$updateRepliesCount$194(int, long, int, java.util.ArrayList, int):void");
    }

    public void lambda$updateRepliesMaxReadId$193(long j10, long j11, int i9, int i10) {
        updateRepliesMaxReadIdInternal(-j10, j11, i9, i10);
    }

    public void lambda$updateRepliesMaxReadIdInternal$192(long j10, long j11, int i9, int i10, int i11) {
        getMessagesController().getTopicsController().updateMaxReadId(-j10, j11, i9, i10, i11);
    }

    public void lambda$updateTopicData$48(long j10, TLRPC.TL_forumTopic tL_forumTopic, int i9) {
        getMessagesController().getTopicsController().updateTopicInUi(j10, tL_forumTopic, i9);
    }

    public void lambda$updateTopicData$49(int r17, org.telegram.tgnet.TLRPC.TL_forumTopic r18, long r19, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$updateTopicData$49(int, org.telegram.tgnet.TLRPC$TL_forumTopic, long, int):void");
    }

    public void lambda$updateTopicsWithReadMessages$59(HashMap hashMap) {
        for (TopicKey topicKey : hashMap.keySet()) {
            Integer num = (Integer) hashMap.get(topicKey);
            num.intValue();
            try {
                SQLiteDatabase sQLiteDatabase = this.database;
                Locale locale = Locale.US;
                long j10 = topicKey.dialogId;
                long j11 = topicKey.topicId;
                long j12 = topicKey.dialogId;
                long j13 = topicKey.topicId;
                sQLiteDatabase.executeFast("UPDATE topics SET read_outbox = max((SELECT read_outbox FROM topics WHERE did = " + j10 + " AND topic_id = " + j11 + "), " + num + ") WHERE did = " + j12 + " AND topic_id = " + j13).stepThis().dispose();
            } catch (SQLiteException e10) {
                checkSQLException(e10);
            }
        }
    }

    public void lambda$updateUnreadReactionsCountInternal$261(long r19, boolean r21, java.lang.String r22, long r23, int r25, java.lang.String r26, java.lang.String r27, java.lang.String r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$updateUnreadReactionsCountInternal$261(long, boolean, java.lang.String, long, int, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public void lambda$updateUserInfo$130(org.telegram.tgnet.TLRPC.UserFull r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$updateUserInfo$130(org.telegram.tgnet.TLRPC$UserFull, boolean):void");
    }

    public void lambda$updateUserInfoContactBlocked$131(long j10, TL_account.RequirementToContact requirementToContact) {
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        TLRPC.UserFull userFull;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLiteCursor2 = this.database.queryFinalized("SELECT uid, info, pinned FROM user_settings WHERE uid = " + j10, new Object[0]);
                try {
                    boolean next = sQLiteCursor2.next();
                    if (next) {
                        NativeByteBuffer byteBufferValue = sQLiteCursor2.byteBufferValue(1);
                        userFull = TLRPC.UserFull.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true);
                        if (userFull != null) {
                            userFull.pinned_msg_id = sQLiteCursor2.intValue(2);
                        }
                        byteBufferValue.reuse();
                    } else {
                        userFull = null;
                    }
                    sQLiteCursor2.dispose();
                    if (next && userFull != null && UserObject.applyRequirementToContact(userFull, requirementToContact)) {
                        SQLitePreparedStatement executeFast = this.database.executeFast("REPLACE INTO user_settings VALUES(?, ?, ?)");
                        try {
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(userFull.getObjectSize());
                            userFull.serializeToStream(nativeByteBuffer);
                            executeFast.bindLong(1, j10);
                            executeFast.bindByteBuffer(2, nativeByteBuffer);
                            executeFast.bindInteger(3, userFull.pinned_msg_id);
                            executeFast.step();
                            executeFast.dispose();
                            nativeByteBuffer.reuse();
                        } catch (Exception e10) {
                            e = e10;
                            sQLiteCursor2 = null;
                            sQLitePreparedStatement = executeFast;
                            checkSQLException(e);
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                            }
                            if (sQLiteCursor2 != null) {
                                sQLiteCursor2.dispose();
                            }
                        } catch (Throwable th) {
                            th = th;
                            sQLiteCursor = 0;
                            sQLitePreparedStatement = executeFast;
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                            }
                            if (sQLiteCursor != 0) {
                                sQLiteCursor.dispose();
                            }
                            throw th;
                        }
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Throwable th2) {
                th = th2;
                sQLiteCursor = "SELECT uid, info, pinned FROM user_settings WHERE uid = ";
            }
        } catch (Exception e12) {
            e = e12;
            sQLiteCursor2 = null;
        } catch (Throwable th3) {
            th = th3;
            sQLiteCursor = 0;
        }
    }

    public static void lambda$updateWidgets$165(ArrayList arrayList) {
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(ApplicationLoader.applicationContext);
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            appWidgetManager.notifyAppWidgetViewDataChanged(((Integer) arrayList.get(i9)).intValue(), R.id.list_view);
        }
    }

    private org.telegram.tgnet.TLRPC.ChatFull loadChatInfoInternal(long r25, boolean r27, boolean r28, boolean r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.loadChatInfoInternal(long, boolean, boolean, boolean, int):org.telegram.tgnet.TLRPC$ChatFull");
    }

    private void loadDialogFilters() {
        this.storageQueue.postRunnable(new f2(this, 19));
    }

    private org.telegram.tgnet.TLRPC.messages_Dialogs loadDialogsByIds(java.lang.String r21, java.util.ArrayList<java.lang.Long> r22, java.util.ArrayList<java.lang.Long> r23, java.util.ArrayList<java.lang.Integer> r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.loadDialogsByIds(java.lang.String, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList):org.telegram.tgnet.TLRPC$messages_Dialogs");
    }

    private void loadPendingTasks() {
        this.storageQueue.postRunnable(new f2(this, 22));
    }

    private void markMessageReactionsAsReadInternal(java.lang.String r19, java.lang.String r20, long r21, long r23, int r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.markMessageReactionsAsReadInternal(java.lang.String, java.lang.String, long, long, int, boolean):void");
    }

    public java.util.ArrayList<java.lang.Long> lambda$markMessagesAsDeleted$229(long r46, java.util.ArrayList<java.lang.Integer> r48, boolean r49, int r50, int r51) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$markMessagesAsDeleted$229(long, java.util.ArrayList, boolean, int, int):java.util.ArrayList");
    }

    public void lambda$markMessagesAsRead$219(org.telegram.messenger.support.LongSparseIntArray r18, org.telegram.messenger.support.LongSparseIntArray r19, android.util.SparseIntArray r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$markMessagesAsRead$219(org.telegram.messenger.support.LongSparseIntArray, org.telegram.messenger.support.LongSparseIntArray, android.util.SparseIntArray):void");
    }

    private void markMessagesContentAsReadInternal(long j10, ArrayList<Integer> arrayList, int i9) {
        SQLiteCursor sQLiteCursor = null;
        ArrayList<Integer> arrayList2 = null;
        sQLiteCursor = null;
        try {
            try {
                String join = TextUtils.join(",", arrayList);
                SQLiteDatabase sQLiteDatabase = this.database;
                Locale locale = Locale.US;
                sQLiteDatabase.executeFast("UPDATE messages_v2 SET read_state = read_state | 2 WHERE mid IN (" + join + ") AND uid = " + j10).stepThis().dispose();
                if (i9 != 0) {
                    SQLiteDatabase sQLiteDatabase2 = this.database;
                    SQLiteCursor queryFinalized = sQLiteDatabase2.queryFinalized("SELECT mid, ttl FROM messages_v2 WHERE mid IN (" + join + ") AND uid = " + j10 + " AND ttl > 0", new Object[0]);
                    while (queryFinalized.next()) {
                        try {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList<>();
                            }
                            arrayList2.add(Integer.valueOf(queryFinalized.intValue(0)));
                        } catch (Exception e10) {
                            e = e10;
                            sQLiteCursor = queryFinalized;
                            checkSQLException(e);
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            th = th;
                            sQLiteCursor = queryFinalized;
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            throw th;
                        }
                    }
                    if (arrayList2 != null) {
                        emptyMessagesMedia(j10, arrayList2);
                    }
                    queryFinalized.dispose();
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void onReactionsUpdate(ArrayList<SavedReactionsUpdate> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new ke(15, arrayList, this));
    }

    private void processAnchoredEphemeralMessagesInternal(ArrayList<TL_ephemeral.EphemeralMessage> arrayList) {
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            TL_ephemeral.EphemeralMessage ephemeralMessage = arrayList.get(i9);
            i9++;
            TL_ephemeral.EphemeralMessage ephemeralMessage2 = ephemeralMessage;
            long peerDialogId = DialogObject.getPeerDialogId(ephemeralMessage2.peer_id);
            long peerDialogId2 = DialogObject.getPeerDialogId(ephemeralMessage2.from_id);
            int i10 = ephemeralMessage2.anchor_msg_id;
            ff.w wVar = this.ephemeralWelcomeAnchorsState;
            int i11 = ephemeralMessage2.f22593id;
            a0.h hVar = wVar.f6270a;
            SparseIntArray sparseIntArray = (SparseIntArray) hVar.f(peerDialogId);
            if (sparseIntArray == null) {
                sparseIntArray = new SparseIntArray();
                hVar.k(sparseIntArray, peerDialogId);
            }
            sparseIntArray.put(i10, i11);
            TLRPC.Message messageInternal = getMessageInternal(peerDialogId, i10);
            if (messageInternal != null) {
                ephemeralMessage2.peer_id = messageInternal.peer_id;
                ephemeralMessage2.from_id = messageInternal.from_id;
                ephemeralMessage2.out = messageInternal.out;
                if (peerDialogId2 > 0) {
                    ephemeralMessage2.via_bot_id = peerDialogId2;
                }
            }
        }
        lambda$putEphemeralMessages$204(arrayList, true);
    }

    private void processEphemeralEditedMessagesInternal(ArrayList<TL_ephemeral.EphemeralMessage> arrayList) {
        TL_ephemeral.EphemeralMessage ephemeralMessageInternal;
        int i9;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TL_ephemeral.EphemeralMessage ephemeralMessage = arrayList.get(i10);
            i10++;
            TL_ephemeral.EphemeralMessage ephemeralMessage2 = ephemeralMessage;
            if (ephemeralMessage2.top_msg_id == 0 && (ephemeralMessageInternal = getEphemeralMessageInternal(DialogObject.getPeerDialogId(ephemeralMessage2.peer_id), ephemeralMessage2.f22593id)) != null && (i9 = ephemeralMessageInternal.top_msg_id) != 0) {
                ephemeralMessage2.top_msg_id = i9;
                TLRPC.MessageReplyHeader messageReplyHeader = ephemeralMessage2.reply_to;
                if (messageReplyHeader != null) {
                    messageReplyHeader.forum_topic = true;
                }
                ephemeralMessage2.flags |= 2;
            }
        }
        lambda$putEphemeralMessages$204(arrayList, true);
    }

    private void processEphemeralMessagesInternal(ArrayList<TL_ephemeral.EphemeralMessage> arrayList) {
        int i9;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TL_ephemeral.EphemeralMessage ephemeralMessage = arrayList.get(i10);
            i10++;
            TL_ephemeral.EphemeralMessage ephemeralMessage2 = ephemeralMessage;
            if (ephemeralMessage2.top_msg_id == 0) {
                TLRPC.MessageReplyHeader messageReplyHeader = ephemeralMessage2.reply_to;
                if (messageReplyHeader instanceof TLRPC.TL_messageReplyHeader) {
                    int i11 = messageReplyHeader.reply_to_top_id;
                    if (i11 != 0) {
                        messageReplyHeader.forum_topic = true;
                        ephemeralMessage2.top_msg_id = i11;
                        ephemeralMessage2.flags |= 2;
                    } else if (messageReplyHeader.reply_to_msg_id != 0) {
                        long peerDialogId = DialogObject.getPeerDialogId(ephemeralMessage2.peer_id);
                        TLRPC.MessageReplyHeader messageReplyHeader2 = ephemeralMessage2.reply_to;
                        if (messageReplyHeader2.reply_to_ephemeral) {
                            TL_ephemeral.EphemeralMessage ephemeralMessageInternal = getEphemeralMessageInternal(peerDialogId, messageReplyHeader2.reply_to_msg_id);
                            if (ephemeralMessageInternal != null && (i9 = ephemeralMessageInternal.top_msg_id) != 0) {
                                ephemeralMessage2.reply_to.forum_topic = true;
                                ephemeralMessage2.top_msg_id = i9;
                                ephemeralMessage2.flags |= 2;
                            }
                        } else {
                            TLRPC.Message messageInternal = getMessageInternal(peerDialogId, messageReplyHeader2.reply_to_msg_id);
                            if (messageInternal != null) {
                                int topicId = (int) MessageObject.getTopicId(this.currentAccount, messageInternal, getForumTypeFlags(peerDialogId));
                                ephemeralMessage2.top_msg_id = topicId;
                                if (topicId != 0) {
                                    ephemeralMessage2.reply_to.forum_topic = true;
                                    ephemeralMessage2.flags |= 2;
                                }
                            }
                        }
                    }
                }
            }
        }
        lambda$putEphemeralMessages$204(arrayList, true);
    }

    public void lambda$processLoadedFilterPeers$71(TLRPC.messages_Dialogs messages_dialogs, TLRPC.messages_Dialogs messages_dialogs2, ArrayList<TLRPC.User> arrayList, ArrayList<TLRPC.Chat> arrayList2, ArrayList<MessagesController.DialogFilter> arrayList3, SparseArray<MessagesController.DialogFilter> sparseArray, ArrayList<Integer> arrayList4, HashMap<Integer, HashSet<Long>> hashMap, HashSet<Integer> hashSet, Runnable runnable) {
        int i9;
        putUsersAndChats(arrayList, arrayList2, true, false);
        int size = sparseArray.size();
        int i10 = 0;
        boolean z10 = false;
        while (i10 < size) {
            lambda$deleteDialogFilter$72(sparseArray.valueAt(i10));
            i10++;
            z10 = true;
        }
        Iterator<Integer> it = hashSet.iterator();
        while (it.hasNext()) {
            MessagesController.DialogFilter dialogFilter = this.dialogFiltersMap.get(it.next().intValue());
            if (dialogFilter != null) {
                dialogFilter.pendingUnreadCount = -1;
            }
        }
        for (Map.Entry<Integer, HashSet<Long>> entry : hashMap.entrySet()) {
            MessagesController.DialogFilter dialogFilter2 = this.dialogFiltersMap.get(entry.getKey().intValue());
            if (dialogFilter2 != null) {
                Iterator<Long> it2 = entry.getValue().iterator();
                while (it2.hasNext()) {
                    dialogFilter2.pinnedDialogs.delete(it2.next().longValue());
                }
                z10 = true;
            }
        }
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            saveDialogFilterInternal(arrayList3.get(i11), false, true);
            i11++;
            z10 = true;
        }
        int size3 = this.dialogFilters.size();
        boolean z11 = false;
        for (int i12 = 0; i12 < size3; i12++) {
            MessagesController.DialogFilter dialogFilter3 = this.dialogFilters.get(i12);
            int indexOf = arrayList4.indexOf(Integer.valueOf(dialogFilter3.f19649id));
            if (dialogFilter3.order != indexOf) {
                dialogFilter3.order = indexOf;
                z11 = true;
                z10 = true;
            }
        }
        if (z11) {
            Collections.sort(this.dialogFilters, new q(24));
            saveDialogFiltersOrderInternal();
        }
        if (z10) {
            i9 = 1;
        } else {
            i9 = 2;
        }
        calcUnreadCounters(true);
        getMessagesController().processLoadedDialogFilters(new ArrayList<>(this.dialogFilters), messages_dialogs, messages_dialogs2, arrayList, arrayList2, null, i9, runnable);
    }

    private void putChatsInternal(List<TLRPC.Chat> list) {
        if (list != null && !list.isEmpty()) {
            SQLitePreparedStatement executeFast = this.database.executeFast("REPLACE INTO chats VALUES(?, ?, ?)");
            for (int i9 = 0; i9 < list.size(); i9++) {
                TLRPC.Chat chat = list.get(i9);
                if (chat.min) {
                    SQLiteDatabase sQLiteDatabase = this.database;
                    Locale locale = Locale.US;
                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(aa.d.m(chat.f22380id, "SELECT data FROM chats WHERE uid = "), new Object[0]);
                    if (queryFinalized.next()) {
                        try {
                            NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                            if (byteBufferValue != null) {
                                TLRPC.Chat TLdeserialize = TLRPC.Chat.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                byteBufferValue.reuse();
                                if (TLdeserialize != null) {
                                    TLdeserialize.title = chat.title;
                                    TLdeserialize.photo = chat.photo;
                                    TLdeserialize.broadcast = chat.broadcast;
                                    TLdeserialize.verified = chat.verified;
                                    TLdeserialize.megagroup = chat.megagroup;
                                    TLdeserialize.call_not_empty = chat.call_not_empty;
                                    TLdeserialize.call_active = chat.call_active;
                                    TLdeserialize.monoforum = chat.monoforum;
                                    TLdeserialize.broadcast_messages_allowed = chat.broadcast_messages_allowed;
                                    if ((chat.flags2 & 262144) != 0) {
                                        TLdeserialize.linked_monoforum_id = chat.linked_monoforum_id;
                                        TLdeserialize.flags2 |= 262144;
                                    }
                                    if (g7.z7.a(chat.flags2, 1048576)) {
                                        TLdeserialize.linked_community_id = chat.linked_community_id;
                                        TLdeserialize.flags2 |= 1048576;
                                    }
                                    TLRPC.TL_chatBannedRights tL_chatBannedRights = chat.default_banned_rights;
                                    if (tL_chatBannedRights != null) {
                                        TLdeserialize.default_banned_rights = tL_chatBannedRights;
                                        TLdeserialize.flags |= 262144;
                                    }
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = chat.admin_rights;
                                    if (tL_chatAdminRights != null) {
                                        TLdeserialize.admin_rights = tL_chatAdminRights;
                                        TLdeserialize.flags |= 16384;
                                    }
                                    TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.banned_rights;
                                    if (tL_chatBannedRights2 != null) {
                                        TLdeserialize.banned_rights = tL_chatBannedRights2;
                                        TLdeserialize.flags |= 32768;
                                    }
                                    String str = chat.username;
                                    if (str != null) {
                                        TLdeserialize.username = str;
                                        TLdeserialize.flags |= 64;
                                    } else {
                                        TLdeserialize.username = null;
                                        TLdeserialize.flags &= -65;
                                    }
                                    int i10 = chat.participants_count;
                                    if (i10 > 0) {
                                        TLdeserialize.participants_count = i10;
                                    }
                                    chat = TLdeserialize;
                                }
                            }
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                    }
                    queryFinalized.dispose();
                }
                executeFast.requery();
                chat.flags |= 131072;
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(chat.getObjectSize());
                chat.serializeToStream(nativeByteBuffer);
                executeFast.bindLong(1, chat.f22380id);
                String str2 = chat.title;
                if (str2 != null) {
                    executeFast.bindString(2, str2.toLowerCase());
                } else {
                    executeFast.bindString(2, "");
                }
                executeFast.bindByteBuffer(3, nativeByteBuffer);
                executeFast.step();
                nativeByteBuffer.reuse();
                isForumCacheInvalidate(-chat.f22380id);
            }
            executeFast.dispose();
        }
    }

    private void putDialogsInternal(org.telegram.tgnet.TLRPC.messages_Dialogs r31, int r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.putDialogsInternal(org.telegram.tgnet.TLRPC$messages_Dialogs, int):void");
    }

    public void lambda$putEphemeralMessages$204(ArrayList<TL_ephemeral.EphemeralMessage> arrayList, boolean z10) {
        SQLitePreparedStatement sQLitePreparedStatement = 0;
        if (z10) {
            try {
                try {
                    this.database.beginTransaction();
                } catch (Exception e10) {
                    checkSQLException(e10);
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
                throw th;
            }
        }
        sQLitePreparedStatement = this.database.executeFast("INSERT OR REPLACE INTO ephemeral_messages (dialog_id, id, topic_id, date, data) VALUES (?, ?, ?, ?, ?);");
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            TL_ephemeral.EphemeralMessage ephemeralMessage = arrayList.get(i9);
            i9++;
            TL_ephemeral.EphemeralMessage ephemeralMessage2 = ephemeralMessage;
            if (!ephemeralMessage2.welcome) {
                sQLitePreparedStatement.requery();
                sQLitePreparedStatement.bindLong(1, DialogObject.getPeerDialogId(ephemeralMessage2.peer_id));
                sQLitePreparedStatement.bindInteger(2, ephemeralMessage2.f22593id);
                sQLitePreparedStatement.bindInteger(3, ephemeralMessage2.top_msg_id);
                sQLitePreparedStatement.bindInteger(4, ephemeralMessage2.date);
                sQLitePreparedStatement.bindTlObject(5, ephemeralMessage2);
                sQLitePreparedStatement.step();
            }
        }
        if (z10) {
            this.database.commitTransaction();
        }
        if (sQLitePreparedStatement != null) {
            sQLitePreparedStatement.dispose();
        }
    }

    public void lambda$putMessages$200(java.util.ArrayList<org.telegram.tgnet.TLRPC.Message> r63, boolean r64, boolean r65, int r66, boolean r67, int r68, long r69) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$putMessages$200(java.util.ArrayList, boolean, boolean, int, boolean, int, long):void");
    }

    public void lambda$putUsersAndChats$181(List<TLRPC.User> list, List<TLRPC.Chat> list2, boolean z10) {
        if (z10) {
            try {
                try {
                    this.database.beginTransaction();
                } catch (Exception e10) {
                    checkSQLException(e10);
                    SQLiteDatabase sQLiteDatabase = this.database;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.commitTransaction();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                SQLiteDatabase sQLiteDatabase2 = this.database;
                if (sQLiteDatabase2 != null) {
                    sQLiteDatabase2.commitTransaction();
                }
                throw th;
            }
        }
        putUsersInternal(list);
        putChatsInternal(list2);
        SQLiteDatabase sQLiteDatabase3 = this.database;
        if (sQLiteDatabase3 != null) {
            sQLiteDatabase3.commitTransaction();
        }
    }

    private void putUsersInternal(List<TLRPC.User> list) {
        int i9;
        int i10;
        int i11;
        if (list != null && !list.isEmpty()) {
            SQLitePreparedStatement executeFast = this.database.executeFast("REPLACE INTO users VALUES(?, ?, ?, ?)");
            for (int i12 = 0; i12 < list.size(); i12++) {
                TLRPC.User user = list.get(i12);
                if (user != null) {
                    if (user.min) {
                        SQLiteDatabase sQLiteDatabase = this.database;
                        Locale locale = Locale.US;
                        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(aa.d.m(user.f22527id, "SELECT data FROM users WHERE uid = "), new Object[0]);
                        if (queryFinalized.next()) {
                            try {
                                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                                if (byteBufferValue != null) {
                                    TLRPC.User TLdeserialize = TLRPC.User.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                    byteBufferValue.reuse();
                                    if (TLdeserialize != null) {
                                        String str = user.username;
                                        if (str != null) {
                                            TLdeserialize.username = str;
                                            TLdeserialize.flags |= 8;
                                        } else {
                                            TLdeserialize.username = null;
                                            TLdeserialize.flags &= -9;
                                        }
                                        if (user.apply_min_photo) {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                                            if (userProfilePhoto != null) {
                                                TLdeserialize.photo = userProfilePhoto;
                                                TLdeserialize.flags |= 32;
                                            } else {
                                                TLdeserialize.photo = null;
                                                TLdeserialize.flags &= -33;
                                            }
                                        }
                                        user = TLdeserialize;
                                    }
                                }
                            } catch (Exception e10) {
                                checkSQLException(e10);
                            }
                        }
                        queryFinalized.dispose();
                    }
                    executeFast.requery();
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(user.getObjectSize());
                    user.serializeToStream(nativeByteBuffer);
                    executeFast.bindLong(1, user.f22527id);
                    executeFast.bindString(2, formatUserSearchName(user));
                    TLRPC.UserStatus userStatus = user.status;
                    if (userStatus != null) {
                        if (userStatus instanceof TLRPC.TL_userStatusRecently) {
                            if (userStatus.by_me) {
                                i11 = -1000;
                            } else {
                                i11 = -100;
                            }
                            userStatus.expires = i11;
                        } else if (userStatus instanceof TLRPC.TL_userStatusLastWeek) {
                            if (userStatus.by_me) {
                                i10 = -1001;
                            } else {
                                i10 = -101;
                            }
                            userStatus.expires = i10;
                        } else if (userStatus instanceof TLRPC.TL_userStatusLastMonth) {
                            if (userStatus.by_me) {
                                i9 = -1002;
                            } else {
                                i9 = -102;
                            }
                            userStatus.expires = i9;
                        }
                        executeFast.bindInteger(3, userStatus.expires);
                    } else {
                        executeFast.bindInteger(3, 0);
                    }
                    executeFast.bindByteBuffer(4, nativeByteBuffer);
                    executeFast.step();
                    nativeByteBuffer.reuse();
                    isForumCacheInvalidate(user.f22527id);
                }
            }
            executeFast.dispose();
        }
    }

    private boolean recoverDatabase() {
        this.database.close();
        boolean recoverDatabase = DatabaseMigrationHelper.recoverDatabase(this.cacheFile, this.walCacheFile, this.shmCacheFile, this.currentAccount);
        FileLog.e("Database restored = " + recoverDatabase);
        if (recoverDatabase) {
            try {
                SQLiteDatabase sQLiteDatabase = new SQLiteDatabase(this.cacheFile.getPath());
                this.database = sQLiteDatabase;
                sQLiteDatabase.executeFast("PRAGMA secure_delete = ON").stepThis().dispose();
                this.database.executeFast("PRAGMA temp_store = MEMORY").stepThis().dispose();
                this.database.executeFast("PRAGMA journal_mode = WAL").stepThis().dispose();
                this.database.executeFast("PRAGMA journal_size_limit = 10485760").stepThis().dispose();
            } catch (SQLiteException e10) {
                FileLog.e(new Exception(e10));
                recoverDatabase = false;
            }
        }
        if (!recoverDatabase) {
            cleanupInternal(true);
            openDatabase(1);
            recoverDatabase = this.databaseCreated;
            FileLog.e("Try create new database = " + recoverDatabase);
        }
        if (recoverDatabase) {
            reset();
        }
        return recoverDatabase;
    }

    private void resetForumBadgeIfNeed(long j10) {
        LongSparseIntArray longSparseIntArray;
        SQLiteCursor sQLiteCursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            Locale locale = Locale.ENGLISH;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT topic_id FROM topics WHERE did = " + j10 + " AND unread_count > 0", new Object[0]);
            try {
                if (!queryFinalized.next()) {
                    longSparseIntArray = new LongSparseIntArray();
                    longSparseIntArray.put(j10, 0);
                } else {
                    longSparseIntArray = null;
                }
                queryFinalized.dispose();
                if (longSparseIntArray != null) {
                    this.database.executeFast("UPDATE dialogs SET unread_count = 0, unread_count_i = 0 WHERE did = " + j10).stepThis().dispose();
                }
                updateFiltersReadCounter(longSparseIntArray, null, true);
                getMessagesController().processDialogsUpdateRead(longSparseIntArray, null);
            } catch (Throwable th) {
                th = th;
                sQLiteCursor = queryFinalized;
                try {
                    checkSQLException(th);
                } finally {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void saveDialogFilterInternal(MessagesController.DialogFilter dialogFilter, boolean z10, boolean z11) {
        int i9;
        SQLitePreparedStatement executeFast;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement sQLitePreparedStatement2;
        String str;
        SQLitePreparedStatement sQLitePreparedStatement3 = null;
        try {
            try {
                if (!this.dialogFilters.contains(dialogFilter)) {
                    if (z10) {
                        if (this.dialogFilters.get(0).isDefault()) {
                            this.dialogFilters.add(1, dialogFilter);
                        } else {
                            this.dialogFilters.add(0, dialogFilter);
                        }
                    } else {
                        this.dialogFilters.add(dialogFilter);
                    }
                    this.dialogFiltersMap.put(dialogFilter.f19649id, dialogFilter);
                }
                executeFast = this.database.executeFast("REPLACE INTO dialog_filter VALUES(?, ?, ?, ?, ?, ?, ?, ?)");
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e10) {
            e = e10;
        }
        try {
            executeFast.bindInteger(1, dialogFilter.f19649id);
            executeFast.bindInteger(2, dialogFilter.order);
            executeFast.bindInteger(3, dialogFilter.unreadCount);
            executeFast.bindInteger(4, dialogFilter.flags);
            if (dialogFilter.f19649id == 0) {
                str = "ALL_CHATS";
            } else {
                str = dialogFilter.name;
            }
            executeFast.bindString(5, str);
            executeFast.bindInteger(6, dialogFilter.color);
            Vector vector = new Vector(new b(28));
            vector.objects.addAll(dialogFilter.entities);
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(vector.getObjectSize());
            vector.serializeToStream(nativeByteBuffer);
            executeFast.bindByteBuffer(7, nativeByteBuffer);
            executeFast.bindInteger(8, dialogFilter.title_noanimate ? 1 : 0);
            executeFast.step();
            executeFast.dispose();
            nativeByteBuffer.reuse();
            if (z11) {
                SQLiteDatabase sQLiteDatabase = this.database;
                sQLiteDatabase.executeFast("DELETE FROM dialog_filter_ep WHERE id = " + dialogFilter.f19649id).stepThis().dispose();
                SQLiteDatabase sQLiteDatabase2 = this.database;
                sQLiteDatabase2.executeFast("DELETE FROM dialog_filter_pin_v2 WHERE id = " + dialogFilter.f19649id).stepThis().dispose();
                this.database.beginTransaction();
                SQLitePreparedStatement executeFast2 = this.database.executeFast("REPLACE INTO dialog_filter_pin_v2 VALUES(?, ?, ?)");
                int size = dialogFilter.alwaysShow.size();
                for (int i10 = 0; i10 < size; i10++) {
                    long longValue = dialogFilter.alwaysShow.get(i10).longValue();
                    executeFast2.requery();
                    executeFast2.bindInteger(1, dialogFilter.f19649id);
                    executeFast2.bindLong(2, longValue);
                    executeFast2.bindInteger(3, dialogFilter.pinnedDialogs.get(longValue, Integer.MIN_VALUE));
                    executeFast2.step();
                }
                int size2 = dialogFilter.pinnedDialogs.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    long keyAt = dialogFilter.pinnedDialogs.keyAt(i11);
                    if (DialogObject.isEncryptedDialog(keyAt)) {
                        executeFast2.requery();
                        executeFast2.bindInteger(1, dialogFilter.f19649id);
                        executeFast2.bindLong(2, keyAt);
                        executeFast2.bindInteger(3, dialogFilter.pinnedDialogs.valueAt(i11));
                        executeFast2.step();
                    }
                }
                executeFast2.dispose();
                SQLitePreparedStatement executeFast3 = this.database.executeFast("REPLACE INTO dialog_filter_ep VALUES(?, ?)");
                int size3 = dialogFilter.neverShow.size();
                for (i9 = 0; i9 < size3; i9++) {
                    executeFast3.requery();
                    executeFast3.bindInteger(1, dialogFilter.f19649id);
                    executeFast3.bindLong(2, dialogFilter.neverShow.get(i9).longValue());
                    executeFast3.step();
                }
                executeFast3.dispose();
                this.database.commitTransaction();
            }
            SQLiteDatabase sQLiteDatabase3 = this.database;
            if (sQLiteDatabase3 != null) {
                sQLiteDatabase3.commitTransaction();
            }
        } catch (Exception e11) {
            e = e11;
            sQLitePreparedStatement3 = sQLitePreparedStatement2;
            checkSQLException(e);
            SQLiteDatabase sQLiteDatabase4 = this.database;
            if (sQLiteDatabase4 != null) {
                sQLiteDatabase4.commitTransaction();
            }
            if (sQLitePreparedStatement3 != null) {
                sQLitePreparedStatement3.dispose();
            }
        } catch (Throwable th2) {
            th = th2;
            sQLitePreparedStatement3 = sQLitePreparedStatement;
            SQLiteDatabase sQLiteDatabase5 = this.database;
            if (sQLiteDatabase5 != null) {
                sQLiteDatabase5.commitTransaction();
            }
            if (sQLitePreparedStatement3 != null) {
                sQLitePreparedStatement3.dispose();
            }
            throw th;
        }
    }

    public void lambda$saveDiffParams$35(int i9, int i10, int i11, int i12) {
        try {
            if (this.lastSavedSeq == i9 && this.lastSavedPts == i10 && this.lastSavedDate == i11 && this.lastQtsValue == i12) {
                return;
            }
            SQLitePreparedStatement executeFast = this.database.executeFast("UPDATE params SET seq = ?, pts = ?, date = ?, qts = ? WHERE id = 1");
            executeFast.bindInteger(1, i9);
            executeFast.bindInteger(2, i10);
            executeFast.bindInteger(3, i11);
            executeFast.bindInteger(4, i12);
            executeFast.step();
            executeFast.dispose();
            this.lastSavedSeq = i9;
            this.lastSavedPts = i10;
            this.lastSavedDate = i11;
            this.lastSavedQts = i12;
        } catch (Exception e10) {
            checkSQLException(e10);
        }
    }

    public void lambda$saveStoryAlbumsCache$269(long r6, java.util.List<ih.o6> r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$saveStoryAlbumsCache$269(long, java.util.List):void");
    }

    private void saveTopicsInternal(long r20, java.util.List<org.telegram.tgnet.TLRPC.TL_forumTopic> r22, boolean r23, boolean r24, int r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.saveTopicsInternal(long, java.util.List, boolean, boolean, int):void");
    }

    private ArrayList<Long> toPeerIds(ArrayList<TLRPC.InputPeer> arrayList) {
        ArrayList<Long> arrayList2 = new ArrayList<>();
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                TLRPC.InputPeer inputPeer = arrayList.get(i9);
                if (inputPeer != null) {
                    long j10 = inputPeer.user_id;
                    if (j10 == 0) {
                        long j11 = inputPeer.chat_id;
                        if (j11 == 0) {
                            j11 = inputPeer.channel_id;
                        }
                        j10 = -j11;
                    }
                    arrayList2.add(Long.valueOf(j10));
                }
            }
        }
        return arrayList2;
    }

    private void updateDbToLastVersion(int i9) {
        AndroidUtilities.runOnUIThread(new f2(this, 16));
        FileLog.d("MessagesStorage start db migration from " + i9 + " to 177");
        int migrate = DatabaseMigrationHelper.migrate(this, i9);
        FileLog.d("MessagesStorage db migration finished to varsion " + migrate);
        AndroidUtilities.runOnUIThread(new f2(this, 17));
    }

    private void updateDialogUnreadReactionsInternal(final long j10, final long j11, final int i9, final boolean z10, boolean z11) {
        final String str;
        final String str2;
        if (!z11) {
            str = "unread_poll_votes";
        } else {
            str = "unread_reactions";
        }
        if (!z11) {
            str2 = "unread_poll_votes";
        } else {
            str2 = "unread_reactions";
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$updateDialogUnreadReactionsInternal$264(z10, str, j10, i9, j11, str2);
            }
        });
    }

    public void lambda$updateDialogsWithDeletedMessages$228(long r23, long r25, java.util.ArrayList<java.lang.Integer> r27, java.util.ArrayList<java.lang.Long> r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$updateDialogsWithDeletedMessages$228(long, long, java.util.ArrayList, java.util.ArrayList):void");
    }

    private void updateDialogsWithReadMessagesInternal(java.util.ArrayList<java.lang.Integer> r24, org.telegram.messenger.support.LongSparseIntArray r25, org.telegram.messenger.support.LongSparseIntArray r26, a0.h r27, org.telegram.messenger.support.LongSparseIntArray r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.updateDialogsWithReadMessagesInternal(java.util.ArrayList, org.telegram.messenger.support.LongSparseIntArray, org.telegram.messenger.support.LongSparseIntArray, a0.h, org.telegram.messenger.support.LongSparseIntArray):void");
    }

    private void updateFiltersReadCounter(org.telegram.messenger.support.LongSparseIntArray r32, org.telegram.messenger.support.LongSparseIntArray r33, boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.updateFiltersReadCounter(org.telegram.messenger.support.LongSparseIntArray, org.telegram.messenger.support.LongSparseIntArray, boolean):void");
    }

    public long[] lambda$updateMessageStateAndId$213(long r35, long r37, java.lang.Integer r39, int r40, int r41, int r42, int r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$updateMessageStateAndId$213(long, long, java.lang.Integer, int, int, int, int):long[]");
    }

    private void updateRepliesMaxReadIdInternal(final long r25, final long r27, final int r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.updateRepliesMaxReadIdInternal(long, long, int, int):void");
    }

    private void updateTopicsWithReadFromAllInternal(long r10, long r12, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.updateTopicsWithReadFromAllInternal(long, long, long):void");
    }

    private void updateUnreadReactionsCountInternal(String str, String str2, String str3, String str4, long j10, long j11, int i9, boolean z10) {
        this.storageQueue.postRunnable(new gh.h7(this, j11, z10, str4, j10, i9, str2, str3, str));
    }

    public void lambda$updateUsers$215(ArrayList<TLRPC.User> arrayList, boolean z10, boolean z11) {
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                if (z10) {
                    if (z11) {
                        this.database.beginTransaction();
                    }
                    SQLitePreparedStatement executeFast = this.database.executeFast("UPDATE users SET status = ? WHERE uid = ?");
                    try {
                        int size = arrayList.size();
                        for (int i9 = 0; i9 < size; i9++) {
                            TLRPC.User user = arrayList.get(i9);
                            executeFast.requery();
                            TLRPC.UserStatus userStatus = user.status;
                            if (userStatus != null) {
                                executeFast.bindInteger(1, userStatus.expires);
                            } else {
                                executeFast.bindInteger(1, 0);
                            }
                            executeFast.bindLong(2, user.f22527id);
                            executeFast.step();
                        }
                        executeFast.dispose();
                        if (z11) {
                            this.database.commitTransaction();
                        }
                    } catch (Exception e10) {
                        e = e10;
                        sQLitePreparedStatement = executeFast;
                        checkSQLException(e);
                        SQLiteDatabase sQLiteDatabase = this.database;
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        sQLitePreparedStatement = executeFast;
                        SQLiteDatabase sQLiteDatabase2 = this.database;
                        if (sQLiteDatabase2 != null) {
                            sQLiteDatabase2.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th;
                    }
                } else {
                    ArrayList<Long> arrayList2 = new ArrayList<>();
                    a0.h hVar = new a0.h();
                    int size2 = arrayList.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        TLRPC.User user2 = arrayList.get(i10);
                        arrayList2.add(Long.valueOf(user2.f22527id));
                        hVar.k(user2, user2.f22527id);
                    }
                    ArrayList<TLRPC.User> arrayList3 = new ArrayList<>();
                    getUsersInternal(arrayList2, arrayList3);
                    int size3 = arrayList3.size();
                    for (int i11 = 0; i11 < size3; i11++) {
                        TLRPC.User user3 = arrayList3.get(i11);
                        TLRPC.User user4 = (TLRPC.User) hVar.f(user3.f22527id);
                        if (user4 != null) {
                            if (user4.first_name != null && user4.last_name != null) {
                                if (!UserObject.isContact(user3)) {
                                    user3.first_name = user4.first_name;
                                    user3.last_name = user4.last_name;
                                }
                                user3.username = user4.username;
                            } else {
                                TLRPC.UserProfilePhoto userProfilePhoto = user4.photo;
                                if (userProfilePhoto != null) {
                                    user3.photo = userProfilePhoto;
                                } else {
                                    String str = user4.phone;
                                    if (str != null) {
                                        user3.phone = str;
                                    }
                                }
                            }
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        if (z11) {
                            this.database.beginTransaction();
                        }
                        putUsersInternal(arrayList3);
                        if (z11) {
                            this.database.commitTransaction();
                        }
                    }
                }
                SQLiteDatabase sQLiteDatabase3 = this.database;
                if (sQLiteDatabase3 != null) {
                    sQLiteDatabase3.commitTransaction();
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void updateWidgets(long j10) {
        ArrayList<Long> arrayList = new ArrayList<>();
        arrayList.add(Long.valueOf(j10));
        updateWidgets(arrayList);
    }

    public void addRecentLocalFile(String str, String str2, TLRPC.Document document) {
        if (str != null && str.length() != 0) {
            if ((str2 != null && str2.length() != 0) || document != null) {
                this.storageQueue.postRunnable(new gk(this, document, str, str2, 27));
            }
        }
    }

    public void applyPhoneBookUpdates(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.storageQueue.postRunnable(new x8(this, str, str2, 17));
    }

    public void bindTaskToGuid(Runnable runnable, int i9) {
        ArrayList<Runnable> arrayList = this.tasks.get(i9);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.tasks.put(i9, arrayList);
        }
        arrayList.add(runnable);
    }

    public void cancelTasksForGuid(int i9) {
        ArrayList<Runnable> arrayList = this.tasks.get(i9);
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.storageQueue.cancelRunnable(arrayList.get(i10));
        }
        this.tasks.remove(i9);
    }

    public void checkIfFolderEmpty(int i9) {
        this.storageQueue.postRunnable(new df(this, i9, 6));
    }

    public void checkLoadedRemoteFilters(ArrayList<TLRPC.DialogFilter> arrayList, Runnable runnable) {
        this.storageQueue.postRunnable(new gf(this, arrayList, runnable, 3));
    }

    public boolean checkMessageByRandomId(long j10) {
        boolean[] zArr = new boolean[1];
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.storageQueue.postRunnable(new pf(0, j10, countDownLatch, this, zArr));
        try {
            countDownLatch.await();
        } catch (Exception e10) {
            checkSQLException(e10);
        }
        return zArr[0];
    }

    public boolean checkMessageId(long j10, int i9) {
        boolean[] zArr = new boolean[1];
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.storageQueue.postRunnable(new fh.c0(this, j10, i9, zArr, countDownLatch, 6));
        try {
            countDownLatch.await();
        } catch (Exception e10) {
            checkSQLException(e10);
        }
        return zArr[0];
    }

    public void checkSQLException(Throwable th) {
        checkSQLException(th, true);
    }

    public void cleanup(boolean z10) {
        this.storageQueue.postRunnable(new ef(this, z10, 1));
    }

    public void clearDatabaseValues() {
        this.lastDateValue = 0;
        this.lastSeqValue = 0;
        this.lastPtsValue = 0;
        this.lastQtsValue = 0;
        this.lastSecretVersion = 0;
        this.mainUnreadCount = 0;
        this.archiveUnreadCount = 0;
        this.pendingMainUnreadCount = 0;
        this.pendingArchiveUnreadCount = 0;
        this.dialogFilters.clear();
        this.dialogFiltersMap.clear();
        this.unknownDialogsIds.b();
        this.lastSavedSeq = 0;
        this.lastSavedPts = 0;
        this.lastSavedDate = 0;
        this.lastSavedQts = 0;
        this.secretPBytes = null;
        this.secretG = 0;
    }

    public void clearDownloadQueue(int i9) {
        this.storageQueue.postRunnable(new df(this, i9, 2));
    }

    public void clearLocalDatabase() {
        this.storageQueue.postRunnable(new f2(this, 10));
    }

    public void clearSentMedia() {
        this.storageQueue.postRunnable(new f2(this, 20));
    }

    public void clearUserPhoto(long j10, long j11) {
        this.storageQueue.postRunnable(new qe(0, j10, j11, this));
    }

    public void clearUserPhotos(long j10) {
        this.storageQueue.postRunnable(new ff(1, j10, this));
    }

    public void clearWidgetDialogs(int i9) {
        this.storageQueue.postRunnable(new df(this, i9, 7));
    }

    public void closeHolesInMedia(long r24, int r26, int r27, int r28, long r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.closeHolesInMedia(long, int, int, int, long):void");
    }

    public void completeTaskForGuid(Runnable runnable, int i9) {
        ArrayList<Runnable> arrayList = this.tasks.get(i9);
        if (arrayList != null) {
            arrayList.remove(runnable);
            if (arrayList.isEmpty()) {
                this.tasks.remove(i9);
            }
        }
    }

    public boolean containsLocalDialog(long j10) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Boolean[] boolArr = {Boolean.FALSE};
        this.storageQueue.postRunnable(new gh.e2(this, j10, boolArr, countDownLatch, 26));
        try {
            countDownLatch.await();
        } catch (Exception e10) {
            checkSQLException(e10);
        }
        return boolArr[0].booleanValue();
    }

    public SQLiteCursor createLoadStoriesCursor(long j10, int i9, int i10) {
        SQLiteDatabase sQLiteDatabase = this.database;
        Locale locale = Locale.US;
        StringBuilder s10 = aa.d.s(j10, "SELECT data, seen, pin FROM profile_stories JOIN profile_stories_albums_links ON profile_stories.story_id = profile_stories_albums_links.story_id WHERE profile_stories.dialog_id = ", " AND profile_stories_albums_links.dialog_id = ");
        s10.append(j10);
        s10.append("  AND profile_stories_albums_links.album_id = ");
        s10.append(i9);
        s10.append(" AND profile_stories.type = ");
        s10.append(i10);
        s10.append(" ORDER BY profile_stories_albums_links.order_index ASC;");
        return sQLiteDatabase.queryFinalized(s10.toString(), new Object[0]);
    }

    public long createPendingTask(NativeByteBuffer nativeByteBuffer) {
        if (nativeByteBuffer == null) {
            return 0L;
        }
        long andAdd = this.lastTaskId.getAndAdd(1L);
        this.storageQueue.postRunnable(new a4(this, andAdd, nativeByteBuffer, 21));
        return andAdd;
    }

    public void createTaskForMid(final long j10, final int i9, final int i10, final int i11, final int i12, final boolean z10) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$createTaskForMid$116(i10, i11, i12, i9, z10, j10);
            }
        });
    }

    public void createTaskForSecretChat(final int i9, final int i10, final int i11, final int i12, final ArrayList<Long> arrayList) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$createTaskForSecretChat$118(i9, arrayList, i12, i10, i11);
            }
        });
    }

    public void deleteAllReactionsFromChat(long j10, long j11, int i9) {
        executeInStorageQueue(new re(this, i9, j10, j11, 0));
    }

    public void deleteAllStoryPushMessages() {
        this.storageQueue.postRunnable(new f2(this, 23));
    }

    public void deleteAllStoryReactionPushMessages() {
        this.storageQueue.postRunnable(new f2(this, 25));
    }

    public void deleteContacts(ArrayList<Long> arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            this.storageQueue.postRunnable(new ke(8, arrayList, this));
        }
    }

    public void deleteDialog(long j10, int i9) {
        this.storageQueue.postRunnable(new kf(this, i9, j10, 4));
    }

    public void deleteDialogFilter(MessagesController.DialogFilter dialogFilter) {
        this.storageQueue.postRunnable(new yb(24, this, dialogFilter));
    }

    public void deleteEphemeralMessages(long j10, int i9) {
        a0.h hVar = new a0.h(1);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(i9));
        hVar.k(arrayList, j10);
        deleteEphemeralMessages(hVar, false);
    }

    public void deletePushMessages(long j10, ArrayList<Integer> arrayList) {
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            Locale locale = Locale.US;
            String join = TextUtils.join(",", arrayList);
            sQLiteDatabase.executeFast("DELETE FROM unread_push_messages WHERE uid = " + j10 + " AND mid IN(" + join + ")").stepThis().dispose();
        } catch (Exception e10) {
            checkSQLException(e10);
        }
    }

    public void deleteSavedDialog(long j10) {
        this.storageQueue.postRunnable(new ff(4, j10, this));
    }

    public void deleteStoryPushMessage(long j10) {
        this.storageQueue.postRunnable(new ff(0, j10, this));
    }

    public void deleteUserChatHistory(long j10, long j11) {
        this.storageQueue.postRunnable(new qe(4, j10, j11, this));
    }

    public void deleteWallpaper(long j10) {
        this.storageQueue.postRunnable(new ff(3, j10, this));
    }

    public void doneHolesInMedia(long r19, int r21, int r22, long r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.doneHolesInMedia(long, int, int, long):void");
    }

    public void emptyMessagesMedia(long j10, ArrayList<Integer> arrayList) {
        this.storageQueue.postRunnable(new ne(this, arrayList, j10, 1));
    }

    public void fixNotificationSettings() {
        this.storageQueue.postRunnable(new f2(this, 3));
    }

    public void fullReset() {
        this.storageQueue.postRunnable(new f2(this, 21));
    }

    public void getAnimatedEmoji(String str, ArrayList<TLRPC.Document> arrayList) {
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = this.database;
                Locale locale = Locale.US;
                sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT data FROM animated_emoji WHERE document_id IN (" + str + ")", new Object[0]);
                while (sQLiteCursor.next()) {
                    NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                    try {
                        TLRPC.Document TLdeserialize = TLRPC.Document.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true);
                        if (TLdeserialize != null && TLdeserialize.f22386id != 0) {
                            arrayList.add(TLdeserialize);
                        }
                    } catch (Exception e10) {
                        checkSQLException(e10);
                    }
                    if (byteBufferValue != null) {
                        byteBufferValue.reuse();
                    }
                }
            } catch (SQLiteException e11) {
                e11.printStackTrace();
                if (sQLiteCursor == null) {
                    return;
                }
            }
            sQLiteCursor.dispose();
        } catch (Throwable th) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    public int getArchiveUnreadCount() {
        return this.archiveUnreadCount;
    }

    public void getBotCache(String str, RequestDelegate requestDelegate) {
        if (str != null && requestDelegate != null) {
            this.storageQueue.postRunnable(new h0(this, getConnectionsManager().getCurrentTime(), str, requestDelegate, 16));
        }
    }

    public java.util.ArrayList<java.lang.Integer> getCachedMessagesInRange(long r6, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.getCachedMessagesInRange(long, int, int):java.util.ArrayList");
    }

    public void getCachedPhoneBook(boolean z10) {
        this.storageQueue.postRunnable(new ef(this, z10, 0));
    }

    public int getChannelPtsSync(long j10) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Integer[] numArr = {0};
        this.storageQueue.postRunnable(new gh.e2(this, j10, numArr, countDownLatch, 27));
        try {
            countDownLatch.await();
        } catch (Exception e10) {
            checkSQLException(e10);
        }
        return numArr[0].intValue();
    }

    public TLRPC.Chat getChat(long j10) {
        try {
            ArrayList<TLRPC.Chat> arrayList = new ArrayList<>();
            getChatsInternal("" + j10, arrayList);
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList.get(0);
        } catch (Exception e10) {
            checkSQLException(e10);
            return null;
        }
    }

    public TLRPC.Chat getChatSync(long j10) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        TLRPC.Chat[] chatArr = new TLRPC.Chat[1];
        this.storageQueue.postRunnable(new gh.e2(this, chatArr, j10, countDownLatch, 28));
        try {
            countDownLatch.await();
        } catch (Exception e10) {
            checkSQLException(e10);
        }
        return chatArr[0];
    }

    public ArrayList<TLRPC.Chat> getChats(ArrayList<Long> arrayList) {
        ArrayList<TLRPC.Chat> arrayList2 = new ArrayList<>();
        try {
            getChatsInternal(TextUtils.join(",", arrayList), arrayList2);
            return arrayList2;
        } catch (Exception e10) {
            arrayList2.clear();
            checkSQLException(e10);
            return arrayList2;
        }
    }

    public void getChatsInternal(String str, ArrayList<TLRPC.Chat> arrayList) {
        getChatsInternal(str, arrayList, true);
    }

    public void getContacts() {
        this.storageQueue.postRunnable(new f2(this, 26));
    }

    public SQLiteDatabase getDatabase() {
        return this.database;
    }

    public ArrayList<File> getDatabaseFiles() {
        ArrayList<File> arrayList = new ArrayList<>();
        arrayList.add(this.cacheFile);
        arrayList.add(this.walCacheFile);
        arrayList.add(this.shmCacheFile);
        return arrayList;
    }

    public long getDatabaseSize() {
        long j10;
        File file = this.cacheFile;
        if (file != null) {
            j10 = file.length();
        } else {
            j10 = 0;
        }
        File file2 = this.shmCacheFile;
        if (file2 != null) {
            return file2.length() + j10;
        }
        return j10;
    }

    public void getDialogFolderId(long j10, IntCallback intCallback) {
        this.storageQueue.postRunnable(new bf(this, j10, intCallback, 1));
    }

    public void getDialogMaxMessageId(long j10, IntCallback intCallback) {
        this.storageQueue.postRunnable(new bf(this, j10, intCallback, 0));
    }

    public int getDialogReadMax(final boolean z10, final long j10) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Integer[] numArr = {0};
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$getDialogReadMax$256(z10, j10, numArr, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e10) {
            checkSQLException(e10);
        }
        return numArr[0].intValue();
    }

    public int getDialogReadMaxSync(boolean z10, long j10) {
        int i9 = 0;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                if (z10) {
                    SQLiteDatabase sQLiteDatabase = this.database;
                    sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT outbox_max FROM dialogs WHERE did = " + j10, new Object[0]);
                    if (sQLiteCursor.next()) {
                        i9 = sQLiteCursor.intValue(0);
                    }
                } else {
                    SQLiteDatabase sQLiteDatabase2 = this.database;
                    sQLiteCursor = sQLiteDatabase2.queryFinalized("SELECT last_mid, inbox_max FROM dialogs WHERE did = " + j10, new Object[0]);
                    if (sQLiteCursor.next()) {
                        int intValue = sQLiteCursor.intValue(0);
                        int intValue2 = sQLiteCursor.intValue(1);
                        if (intValue2 <= intValue) {
                            i9 = intValue2;
                        }
                    }
                }
                sQLiteCursor.dispose();
                return i9;
            } catch (Exception e10) {
                checkSQLException(e10);
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
                return i9;
            }
        } catch (Throwable th) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    public void getDialogs(int i9, int i10, int i11, boolean z10) {
        a0.h drafts;
        int m10;
        long[] jArr = null;
        if (z10 && (m10 = (drafts = getMediaDataController().getDrafts()).m()) > 0) {
            jArr = new long[m10];
            for (int i12 = 0; i12 < m10; i12++) {
                if (((a0.h) drafts.n(i12)).f(0L) != null) {
                    jArr[i12] = drafts.j(i12);
                }
            }
        }
        this.storageQueue.postRunnable(new kh.n6(this, i9, i10, i11, jArr));
    }

    public void getDownloadQueue(int i9) {
        this.storageQueue.postRunnable(new df(this, i9, 4));
    }

    public void getEncryptedChat(long j10, CountDownLatch countDownLatch, ArrayList<TLObject> arrayList) {
        if (countDownLatch == null || arrayList == null) {
            return;
        }
        this.storageQueue.postRunnable(new lg(this, j10, arrayList, countDownLatch, 0));
    }

    public void getEncryptedChatsInternal(String str, ArrayList<TLRPC.EncryptedChat> arrayList, ArrayList<Long> arrayList2) {
        if (str != null && str.length() != 0 && arrayList != null) {
            SQLiteDatabase sQLiteDatabase = this.database;
            Locale locale = Locale.US;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(aa.d.o("SELECT data, user, g, authkey, ttl, layer, seq_in, seq_out, use_count, exchange_id, key_date, fprint, fauthkey, khash, in_seq_no, admin_id, mtproto_seq FROM enc_chats WHERE uid IN(", str, ")"), new Object[0]);
            while (queryFinalized.next()) {
                try {
                    NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                    if (byteBufferValue != null) {
                        TLRPC.EncryptedChat TLdeserialize = TLRPC.EncryptedChat.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        byteBufferValue.reuse();
                        if (TLdeserialize != null) {
                            long longValue = queryFinalized.longValue(1);
                            TLdeserialize.user_id = longValue;
                            if (arrayList2 != null && !arrayList2.contains(Long.valueOf(longValue))) {
                                arrayList2.add(Long.valueOf(TLdeserialize.user_id));
                            }
                            TLdeserialize.a_or_b = queryFinalized.byteArrayValue(2);
                            TLdeserialize.auth_key = queryFinalized.byteArrayValue(3);
                            TLdeserialize.ttl = queryFinalized.intValue(4);
                            TLdeserialize.layer = queryFinalized.intValue(5);
                            TLdeserialize.seq_in = queryFinalized.intValue(6);
                            TLdeserialize.seq_out = queryFinalized.intValue(7);
                            int intValue = queryFinalized.intValue(8);
                            TLdeserialize.key_use_count_in = (short) (intValue >> 16);
                            TLdeserialize.key_use_count_out = (short) intValue;
                            TLdeserialize.exchange_id = queryFinalized.longValue(9);
                            TLdeserialize.key_create_date = queryFinalized.intValue(10);
                            TLdeserialize.future_key_fingerprint = queryFinalized.longValue(11);
                            TLdeserialize.future_auth_key = queryFinalized.byteArrayValue(12);
                            TLdeserialize.key_hash = queryFinalized.byteArrayValue(13);
                            TLdeserialize.in_seq_no = queryFinalized.intValue(14);
                            long longValue2 = queryFinalized.longValue(15);
                            if (longValue2 != 0) {
                                TLdeserialize.admin_id = longValue2;
                            }
                            TLdeserialize.mtproto_seq = queryFinalized.intValue(16);
                            arrayList.add(TLdeserialize);
                        }
                    }
                } catch (Exception e10) {
                    checkSQLException(e10);
                }
            }
            queryFinalized.dispose();
        }
    }

    public void getEphemeralMessages(long j10, long j11, Utilities.Callback<ArrayList<TL_ephemeral.EphemeralMessage>> callback) {
        executeInStorageQueue(new ue(this, callback, j10, j11, 0));
    }

    public int getForumTypeFlags(long j10) {
        int i9 = this.dialogIsForumTyped.get(j10, -1);
        if (i9 == -1) {
            int i10 = 0;
            if (j10 < 0) {
                TLRPC.Chat chat = getChat(-j10);
                if (chat != null && chat.forum) {
                    i10 = chat.forum_tabs ? 3 : 1;
                }
                if (chat != null && chat.monoforum) {
                    i10 |= 4;
                }
            } else {
                TLRPC.User user = getUser(j10);
                if (user != null && user.bot_forum_view) {
                    i10 = 8;
                }
            }
            this.dialogIsForumTyped.put(j10, i10);
            return i10;
        }
        return i9;
    }

    public int getLastDateValue() {
        ensureOpened();
        return this.lastDateValue;
    }

    public int getLastPtsValue() {
        ensureOpened();
        return this.lastPtsValue;
    }

    public int getLastQtsValue() {
        ensureOpened();
        return this.lastQtsValue;
    }

    public int getLastSecretVersion() {
        ensureOpened();
        return this.lastSecretVersion;
    }

    public int getLastSeqValue() {
        ensureOpened();
        return this.lastSeqValue;
    }

    public int getMainUnreadCount() {
        return this.mainUnreadCount;
    }

    public TLRPC.Message getMessage(long j10, long j11) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        this.storageQueue.postRunnable(new bg.x0(this, j10, j11, atomicReference, countDownLatch, 4));
        try {
            countDownLatch.await();
        } catch (Exception e10) {
            checkSQLException(e10);
        }
        return (TLRPC.Message) atomicReference.get();
    }

    public int getMessageMediaType(TLRPC.Message message) {
        if (message instanceof TLRPC.TL_message_secret) {
            if ((message.media instanceof TLRPC.TL_messageMediaPhoto) || MessageObject.isGifMessage(message) || MessageObject.isVoiceMessage(message) || MessageObject.isVideoMessage(message) || MessageObject.isRoundVideoMessage(message)) {
                int i9 = message.ttl;
                if (i9 <= 0 || i9 > 60) {
                    return 0;
                }
                return 1;
            }
            return -1;
        }
        if (message instanceof TLRPC.TL_message) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (((messageMedia instanceof TLRPC.TL_messageMediaPhoto) || (messageMedia instanceof TLRPC.TL_messageMediaDocument)) && messageMedia.ttl_seconds != 0) {
                return 1;
            }
        }
        if ((message.media instanceof TLRPC.TL_messageMediaPhoto) || MessageObject.isVideoMessage(message)) {
            return 0;
        }
        return -1;
    }

    public TLRPC.Message getMessageWithCustomParamsOnlyInternal(int i9, long j10) {
        SQLiteCursor queryFinalized;
        boolean z10;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                queryFinalized = this.database.queryFinalized("SELECT custom_params FROM messages_v2 WHERE mid = ? AND uid = ?", Integer.valueOf(i9), Long.valueOf(j10));
            } catch (SQLiteException e10) {
                e = e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (queryFinalized.next()) {
                MessageCustomParamsHelper.readLocalParams(tL_message, queryFinalized.byteBufferValue(0));
                z10 = true;
            } else {
                z10 = false;
            }
            queryFinalized.dispose();
            if (!z10) {
                sQLiteCursor = this.database.queryFinalized("SELECT custom_params FROM messages_topics WHERE mid = ? AND uid = ?", Integer.valueOf(i9), Long.valueOf(j10));
                if (sQLiteCursor.next()) {
                    MessageCustomParamsHelper.readLocalParams(tL_message, sQLiteCursor.byteBufferValue(0));
                }
                sQLiteCursor.dispose();
                return tL_message;
            }
        } catch (SQLiteException e11) {
            e = e11;
            sQLiteCursor = queryFinalized;
            checkSQLException(e);
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            return tL_message;
        } catch (Throwable th2) {
            th = th2;
            sQLiteCursor = queryFinalized;
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
        return tL_message;
    }

    public void getMessages(final long j10, final long j11, boolean z10, final int i9, final int i10, final int i11, final int i12, final int i13, final int i14, final int i15, final long j12, final int i16, final boolean z11, final boolean z12, final Timer timer) {
        final Timer.Task start = Timer.start(timer, "MessagesStorage.getMessages: storageQueue.postRunnable");
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$getMessages$162(start, timer, j10, j11, i9, i10, i11, i12, i13, i14, i15, j12, i16, z11, z12);
            }
        });
    }

    public void getMessagesCount(long j10, IntCallback intCallback) {
        this.storageQueue.postRunnable(new bf(this, j10, intCallback, 2));
    }

    public java.lang.Runnable getMessagesInternal(long r83, long r85, int r87, int r88, int r89, int r90, int r91, int r92, int r93, long r94, int r96, boolean r97, boolean r98, org.telegram.messenger.Timer r99) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.getMessagesInternal(long, long, int, int, int, int, int, int, int, long, int, boolean, boolean, org.telegram.messenger.Timer):java.lang.Runnable");
    }

    public void getNewTask(a0.h hVar, a0.h hVar2) {
        this.storageQueue.postRunnable(new x8(this, hVar, hVar2, 19));
    }

    public void getSavedDialogMaxMessageId(long j10, IntCallback intCallback) {
        this.storageQueue.postRunnable(new bf(this, j10, intCallback, 3));
    }

    public int getSecretG() {
        ensureOpened();
        return this.secretG;
    }

    public byte[] getSecretPBytes() {
        ensureOpened();
        return this.secretPBytes;
    }

    public Object[] getSentFile(String str, int i9) {
        if (str == null || str.toLowerCase().endsWith("attheme")) {
            return null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Object[] objArr = new Object[2];
        this.storageQueue.postRunnable(new fh.g1(this, str, i9, objArr, countDownLatch, 9));
        try {
            countDownLatch.await();
        } catch (Exception e10) {
            checkSQLException(e10);
        }
        if (objArr[0] == null) {
            return null;
        }
        return objArr;
    }

    public HashMap<Long, Integer> getSmallGroupsParticipantsCount() {
        HashMap<Long, Integer> hashMap = new HashMap<>();
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                sQLiteCursor = this.database.queryFinalized("SELECT uid, info, participants_count FROM chat_settings_v2 WHERE participants_count > 1", new Object[0]);
                while (sQLiteCursor.next()) {
                    long longValue = sQLiteCursor.longValue(0);
                    NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(1);
                    int intValue = sQLiteCursor.intValue(2);
                    if (byteBufferValue != null) {
                        TLRPC.ChatFull TLdeserialize = TLRPC.ChatFull.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        byteBufferValue.reuse();
                        if (TLdeserialize instanceof TLRPC.TL_channelFull) {
                            hashMap.put(Long.valueOf(longValue), Integer.valueOf(intValue));
                        }
                    }
                }
                sQLiteCursor.dispose();
                return hashMap;
            } catch (Exception e10) {
                checkSQLException(e10);
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
                return hashMap;
            }
        } catch (Throwable th) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    public DispatchQueue getStorageQueue() {
        return this.storageQueue;
    }

    public void getUnreadMention(long j10, long j11, IntCallback intCallback) {
        this.storageQueue.postRunnable(new e5.y(this, j11, j10, intCallback, 9));
    }

    public void getUnsentMessages(int i9) {
        this.storageQueue.postRunnable(new df(this, i9, 5));
    }

    public TLRPC.User getUser(long j10) {
        try {
            ArrayList<TLRPC.User> arrayList = new ArrayList<>();
            ArrayList<Long> arrayList2 = new ArrayList<>();
            arrayList2.add(Long.valueOf(j10));
            getUsersInternal(arrayList2, arrayList);
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList.get(0);
        } catch (Exception e10) {
            checkSQLException(e10);
            return null;
        }
    }

    public TLRPC.User getUserSync(long j10) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        TLRPC.User[] userArr = new TLRPC.User[1];
        this.storageQueue.postRunnable(new gh.e2(this, userArr, j10, countDownLatch, 25));
        try {
            countDownLatch.await();
        } catch (Exception e10) {
            checkSQLException(e10);
        }
        return userArr[0];
    }

    public ArrayList<TLRPC.User> getUsers(ArrayList<Long> arrayList) {
        ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
        try {
            getUsersInternal(arrayList, arrayList2);
            return arrayList2;
        } catch (Exception e10) {
            arrayList2.clear();
            checkSQLException(e10);
            return arrayList2;
        }
    }

    public void getUsersInternal(ArrayList<Long> arrayList, ArrayList<TLRPC.User> arrayList2) {
        getUsersInternal(arrayList, arrayList2, false);
    }

    public void getWallpapers() {
        this.storageQueue.postRunnable(new f2(this, 4));
    }

    public void getWidgetDialogIds(final int i9, final int i10, final ArrayList<Long> arrayList, final ArrayList<TLRPC.User> arrayList2, final ArrayList<TLRPC.Chat> arrayList3, final boolean z10) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$getWidgetDialogIds$168(i9, arrayList, arrayList2, arrayList3, z10, i10, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e10) {
            checkSQLException(e10);
        }
    }

    public void getWidgetDialogs(int i9, int i10, ArrayList<Long> arrayList, a0.h hVar, a0.h hVar2, ArrayList<TLRPC.User> arrayList2, ArrayList<TLRPC.Chat> arrayList3) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.storageQueue.postRunnable(new ff.c(this, i9, arrayList, i10, hVar, hVar2, arrayList3, arrayList2, countDownLatch));
        try {
            countDownLatch.await();
        } catch (Exception e10) {
            checkSQLException(e10);
        }
    }

    public boolean hasAuthMessage(int i9) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        boolean[] zArr = new boolean[1];
        this.storageQueue.postRunnable(new h0(this, i9, zArr, countDownLatch, 15));
        try {
            countDownLatch.await();
        } catch (Exception e10) {
            checkSQLException(e10);
        }
        return zArr[0];
    }

    public boolean hasInviteMeMessage(long j10) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        boolean[] zArr = new boolean[1];
        this.storageQueue.postRunnable(new pf(2, j10, countDownLatch, this, zArr));
        try {
            countDownLatch.await();
        } catch (Exception e10) {
            checkSQLException(e10);
        }
        return zArr[0];
    }

    public boolean isDatabaseMigrationInProgress() {
        return this.databaseMigrationInProgress;
    }

    public void isDialogHasTopMessage(long j10, Runnable runnable) {
        this.storageQueue.postRunnable(new a4(this, j10, runnable, 16));
    }

    public boolean isForum(long j10, int i9) {
        if ((getForumTypeFlags(j10) & i9) != 0) {
            return true;
        }
        return false;
    }

    public boolean isMigratedChat(long j10) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        boolean[] zArr = new boolean[1];
        this.storageQueue.postRunnable(new pf(1, j10, countDownLatch, this, zArr));
        try {
            countDownLatch.await();
        } catch (Exception e10) {
            checkSQLException(e10);
        }
        return zArr[0];
    }

    public boolean isMonoForum(long j10) {
        return isForum(j10, 4);
    }

    public void loadChannelAdmins(long j10) {
        this.storageQueue.postRunnable(new ff(7, j10, this));
    }

    public TLRPC.ChatFull loadChatInfo(long j10, boolean z10, CountDownLatch countDownLatch, boolean z11, boolean z12) {
        return loadChatInfo(j10, z10, countDownLatch, z11, z12, 0);
    }

    public TLRPC.ChatFull loadChatInfoInQueue(long j10, boolean z10, boolean z11, boolean z12, int i9) {
        return loadChatInfoInternal(j10, z10, z11, z12, i9);
    }

    public void loadGiftChatTheme(Utilities.Callback<List<TLRPC.TL_chatThemeUniqueGift>> callback) {
        executeInStorageQueue(new yb(25, this, callback));
    }

    public void loadGroupedMessagesForTopicUpdates(ArrayList<TopicsController.TopicUpdate> arrayList) {
        if (arrayList != null) {
            try {
                a0.h hVar = new a0.h();
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    if (!arrayList.get(i9).reloadTopic && !arrayList.get(i9).onlyCounters && arrayList.get(i9).topMessage != null) {
                        long j10 = arrayList.get(i9).topMessage.grouped_id;
                        if (j10 != 0) {
                            ArrayList arrayList2 = (ArrayList) hVar.f(j10);
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                                hVar.k(arrayList2, j10);
                            }
                            arrayList2.add(arrayList.get(i9));
                        }
                    }
                }
                for (int i10 = 0; i10 < hVar.m(); i10++) {
                    long j11 = hVar.j(i10);
                    ArrayList arrayList3 = (ArrayList) hVar.n(i10);
                    SQLiteDatabase sQLiteDatabase = this.database;
                    Locale locale = Locale.US;
                    long j12 = ((TopicsController.TopicUpdate) arrayList3.get(0)).dialogId;
                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j12 + " AND group_id = " + j11 + " ORDER BY date DESC", new Object[0]);
                    ArrayList<MessageObject> arrayList4 = null;
                    while (queryFinalized.next()) {
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        if (TLdeserialize != null) {
                            TLdeserialize.readAttachPath(byteBufferValue, UserConfig.getInstance(this.currentAccount).clientUserId);
                        }
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList<>();
                        }
                        arrayList4.add(new MessageObject(this.currentAccount, TLdeserialize, false, false));
                    }
                    queryFinalized.dispose();
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        ((TopicsController.TopicUpdate) arrayList3.get(i11)).groupedMessages = arrayList4;
                    }
                }
            } catch (Throwable th) {
                checkSQLException(th);
            }
        }
    }

    public void loadGroupedMessagesForTopics(long j10, ArrayList<TLRPC.TL_forumTopic> arrayList) {
        if (arrayList != null) {
            try {
                a0.h hVar = new a0.h();
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    if (arrayList.get(i9).topMessage != null) {
                        long j11 = arrayList.get(i9).topMessage.grouped_id;
                        if (j11 != 0) {
                            ArrayList arrayList2 = (ArrayList) hVar.f(j11);
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                                hVar.k(arrayList2, j11);
                            }
                            arrayList2.add(arrayList.get(i9));
                        }
                    }
                }
                for (int i10 = 0; i10 < hVar.m(); i10++) {
                    long j12 = hVar.j(i10);
                    ArrayList arrayList3 = (ArrayList) hVar.n(i10);
                    SQLiteDatabase sQLiteDatabase = this.database;
                    Locale locale = Locale.US;
                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j10 + " AND group_id = " + j12 + " ORDER BY date DESC", new Object[0]);
                    ArrayList<MessageObject> arrayList4 = null;
                    while (queryFinalized.next()) {
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        if (TLdeserialize != null) {
                            TLdeserialize.readAttachPath(byteBufferValue, UserConfig.getInstance(this.currentAccount).clientUserId);
                        }
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList<>();
                        }
                        arrayList4.add(new MessageObject(this.currentAccount, TLdeserialize, false, false));
                    }
                    queryFinalized.dispose();
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        ((TLRPC.TL_forumTopic) arrayList3.get(i11)).groupedMessages = arrayList4;
                    }
                }
            } catch (Throwable th) {
                checkSQLException(th);
            }
        }
    }

    public void loadMessageAttachPaths(ArrayList<MessageObject> arrayList, Runnable runnable) {
        this.storageQueue.postRunnable(new gf(this, arrayList, runnable, 0));
    }

    public void loadReplyMessages(a0.h r22, a0.h r23, java.util.ArrayList<java.lang.Long> r24, java.util.ArrayList<java.lang.Long> r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.loadReplyMessages(a0.h, a0.h, java.util.ArrayList, java.util.ArrayList, int):void");
    }

    public void loadStoryAlbumsCache(long j10, Consumer<List<ih.o6>> consumer) {
        this.storageQueue.postRunnable(new jg(this, j10, consumer, 0));
    }

    public void loadTopics(long j10, Consumer<ArrayList<TLRPC.TL_forumTopic>> consumer) {
        this.storageQueue.postRunnable(new jg(this, j10, consumer, 1));
    }

    public void loadUnreadMessages() {
        this.storageQueue.postRunnable(new f2(this, 5));
    }

    public void loadUserInfo(TLRPC.User user, boolean z10, int i9, int i10) {
        if (user == null) {
            return;
        }
        this.storageQueue.postRunnable(new t4(i9, 3, this, user, z10));
    }

    public ArrayList<TLRPC.UserFull> loadUserInfos(HashSet<Long> hashSet) {
        ArrayList<TLRPC.UserFull> arrayList = new ArrayList<>();
        try {
            String join = TextUtils.join(",", hashSet);
            SQLiteDatabase sQLiteDatabase = this.database;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT info, pinned FROM user_settings WHERE uid IN(" + join + ")", new Object[0]);
            while (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                if (byteBufferValue != null) {
                    TLRPC.UserFull TLdeserialize = TLRPC.UserFull.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    TLdeserialize.pinned_msg_id = queryFinalized.intValue(1);
                    arrayList.add(TLdeserialize);
                    byteBufferValue.reuse();
                }
            }
            queryFinalized.dispose();
            return arrayList;
        } catch (Exception e10) {
            checkSQLException(e10);
            return arrayList;
        }
    }

    public void localSearch(int r32, java.lang.String r33, java.util.ArrayList<java.lang.Object> r34, java.util.ArrayList<java.lang.CharSequence> r35, java.util.ArrayList<org.telegram.tgnet.TLRPC.User> r36, java.util.ArrayList<java.lang.Long> r37, int r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.localSearch(int, java.lang.String, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, int):void");
    }

    public void markMentionMessageAsRead(long j10, int i9, long j11) {
        this.storageQueue.postRunnable(new re(this, i9, j10, j11, 6));
    }

    public void markMessageAsMention(long j10, int i9) {
        this.storageQueue.postRunnable(new kf(this, i9, j10, 1));
    }

    public void markMessageAsSendError(TLRPC.Message message, int i9) {
        this.storageQueue.postRunnable(new p4(this, i9, message, 16));
    }

    public void markMessageAsSendErrorWithParams(TLRPC.Message message, long j10, long j11) {
        this.storageQueue.postRunnable(new pe(1, getUserConfig().getClientUserId(), this, message));
    }

    public void markMessagePollVotesAsRead(long j10, long j11, int i9) {
        executeInStorageQueue(new re(this, j10, j11, i9, 2));
    }

    public void markMessageReactionsAsRead(long j10, long j11, int i9) {
        executeInStorageQueue(new re(this, j10, j11, i9, 3));
    }

    public ArrayList<Long> markMessagesAsDeleted(long j10, ArrayList<Integer> arrayList, boolean z10, boolean z11, int i9, int i10) {
        if (arrayList.isEmpty()) {
            return null;
        }
        if (z10) {
            this.storageQueue.postRunnable(new lf(this, j10, arrayList, z11, i9, i10));
            return null;
        }
        return lambda$markMessagesAsDeleted$229(j10, arrayList, z11, i9, i10);
    }

    public void markMessagesAsDeletedByRandoms(ArrayList<Long> arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        this.storageQueue.postRunnable(new ke(12, arrayList, this));
    }

    public void markMessagesAsRead(LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, boolean z10) {
        if (z10) {
            this.storageQueue.postRunnable(new gk(this, longSparseIntArray, longSparseIntArray2, sparseIntArray, 28));
        } else {
            lambda$markMessagesAsRead$219(longSparseIntArray, longSparseIntArray2, sparseIntArray);
        }
    }

    public void markMessagesContentAsRead(long j10, ArrayList<Integer> arrayList, int i9, int i10) {
        if (isEmpty(arrayList)) {
            return;
        }
        this.storageQueue.postRunnable(new t(i10, i9, j10, arrayList, this));
    }

    public void markVoiceMessageContentAsRead(long j10, ArrayList<Integer> arrayList) {
        if (isEmpty(arrayList)) {
            return;
        }
        this.storageQueue.postRunnable(new ne(this, arrayList, j10, 4));
    }

    public void onDeleteQueryComplete(long j10) {
        this.storageQueue.postRunnable(new ff(5, j10, this));
    }

    public void openDatabase(int i9) {
        if (!NativeLoader.loaded()) {
            int i10 = 0;
            while (!NativeLoader.loaded()) {
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e10) {
                    e10.printStackTrace();
                }
                i10++;
                if (i10 > 5) {
                    break;
                }
            }
        }
        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
        if (this.currentAccount != 0) {
            File file = new File(filesDirFixed, aa.d.l(this.currentAccount, "/", new StringBuilder("account")));
            file.mkdirs();
            filesDirFixed = file;
        }
        this.cacheFile = new File(filesDirFixed, "cache4.db");
        this.walCacheFile = new File(filesDirFixed, "cache4.db-wal");
        this.shmCacheFile = new File(filesDirFixed, "cache4.db-shm");
        this.databaseCreated = false;
        boolean exists = this.cacheFile.exists();
        int i11 = 3;
        try {
            SQLiteDatabase sQLiteDatabase = new SQLiteDatabase(this.cacheFile.getPath());
            this.database = sQLiteDatabase;
            sQLiteDatabase.executeFast("PRAGMA secure_delete = ON").stepThis().dispose();
            this.database.executeFast("PRAGMA temp_store = MEMORY").stepThis().dispose();
            this.database.executeFast("PRAGMA journal_mode = WAL").stepThis().dispose();
            this.database.executeFast("PRAGMA journal_size_limit = 10485760").stepThis().dispose();
            if (!exists) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("create new database");
                }
                createTables(this.database);
            } else {
                int intValue = this.database.executeInt("PRAGMA user_version", new Object[0]).intValue();
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("current db version = " + intValue);
                }
                if (intValue != 0) {
                    try {
                        SQLiteCursor queryFinalized = this.database.queryFinalized("SELECT seq, pts, date, qts, lsv, sg, pbytes FROM params WHERE id = 1", new Object[0]);
                        if (queryFinalized.next()) {
                            this.lastSeqValue = queryFinalized.intValue(0);
                            this.lastPtsValue = queryFinalized.intValue(1);
                            this.lastDateValue = queryFinalized.intValue(2);
                            this.lastQtsValue = queryFinalized.intValue(3);
                            this.lastSecretVersion = queryFinalized.intValue(4);
                            this.secretG = queryFinalized.intValue(5);
                            if (queryFinalized.isNull(6)) {
                                this.secretPBytes = null;
                            } else {
                                byte[] byteArrayValue = queryFinalized.byteArrayValue(6);
                                this.secretPBytes = byteArrayValue;
                                if (byteArrayValue != null && byteArrayValue.length == 1) {
                                    this.secretPBytes = null;
                                }
                            }
                        }
                        queryFinalized.dispose();
                    } catch (Exception e11) {
                        FileLog.e(e11);
                        if (e11.getMessage() != null && e11.getMessage().contains("malformed")) {
                            throw new RuntimeException("malformed");
                        }
                        try {
                            this.database.executeFast("CREATE TABLE IF NOT EXISTS params(id INTEGER PRIMARY KEY, seq INTEGER, pts INTEGER, date INTEGER, qts INTEGER, lsv INTEGER, sg INTEGER, pbytes BLOB)").stepThis().dispose();
                            this.database.executeFast("INSERT INTO params VALUES(1, 0, 0, 0, 0, 0, 0, NULL)").stepThis().dispose();
                        } catch (Exception e12) {
                            FileLog.e(e12);
                        }
                    }
                    if (intValue < 177) {
                        try {
                            updateDbToLastVersion(intValue);
                        } catch (Exception e13) {
                            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                                throw e13;
                            }
                            FileLog.e(e13);
                            throw new RuntimeException("malformed");
                        }
                    }
                } else {
                    throw new Exception("malformed");
                }
            }
            this.databaseCreated = true;
        } catch (Exception e14) {
            FileLog.e(e14);
            if (i9 < 3 && e14.getMessage() != null && e14.getMessage().contains("malformed")) {
                if (i9 == 2) {
                    cleanupInternal(true);
                    clearLoadingDialogsOffsets();
                } else {
                    cleanupInternal(false);
                }
                if (i9 == 1) {
                    i11 = 2;
                }
                openDatabase(i11);
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new f2(this, 7));
        loadDialogFilters();
        loadUnreadMessages();
        loadPendingTasks();
        try {
            this.openSync.countDown();
        } catch (Throwable unused) {
        }
        AndroidUtilities.runOnUIThread(new f2(this, 8));
    }

    public void overwriteChannel(long j10, TLRPC.TL_updates_channelDifferenceTooLong tL_updates_channelDifferenceTooLong, int i9, Runnable runnable) {
        this.storageQueue.postRunnable(new fh.c0(this, j10, i9, tL_updates_channelDifferenceTooLong, runnable, 7));
    }

    public void processAnchoredEphemeralMessages(ArrayList<TL_ephemeral.EphemeralMessage> arrayList, Runnable runnable) {
        if (arrayList != null && !arrayList.isEmpty()) {
            executeInStorageQueue(new gf(this, arrayList, runnable, 1));
        }
    }

    public void processEphemeralEditedMessages(ArrayList<TL_ephemeral.EphemeralMessage> arrayList, Runnable runnable) {
        if (arrayList != null && !arrayList.isEmpty()) {
            executeInStorageQueue(new gf(this, arrayList, runnable, 4));
        }
    }

    public void processEphemeralMessages(ArrayList<TL_ephemeral.EphemeralMessage> arrayList, Runnable runnable) {
        if (arrayList != null && !arrayList.isEmpty()) {
            executeInStorageQueue(new gf(this, arrayList, runnable, 2));
        }
    }

    public void processLoadedFilterPeers(final TLRPC.messages_Dialogs messages_dialogs, final TLRPC.messages_Dialogs messages_dialogs2, final ArrayList<TLRPC.User> arrayList, final ArrayList<TLRPC.Chat> arrayList2, final ArrayList<MessagesController.DialogFilter> arrayList3, final SparseArray<MessagesController.DialogFilter> sparseArray, final ArrayList<Integer> arrayList4, final HashMap<Integer, HashSet<Long>> hashMap, final HashSet<Integer> hashSet, final Runnable runnable) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$processLoadedFilterPeers$71(messages_dialogs, messages_dialogs2, arrayList, arrayList2, arrayList3, sparseArray, arrayList4, hashMap, hashSet, runnable);
            }
        });
    }

    public void processPendingRead(final long j10, final int i9, final int i10, final int i11) {
        final int i12 = this.lastSavedDate;
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$processPendingRead$145(j10, i9, i11, i12, i10);
            }
        });
    }

    public void putCachedPhoneBook(HashMap<String, ContactsController.Contact> hashMap, boolean z10, boolean z11) {
        if (hashMap != null) {
            if (!hashMap.isEmpty() || z10 || z11) {
                this.storageQueue.postRunnable(new l6(this, hashMap, z10, 7));
            }
        }
    }

    public void putChannelAdmins(long j10, a0.h hVar) {
        this.storageQueue.postRunnable(new a4(this, j10, hVar, 22));
    }

    public void putChannelViews(a0.h hVar, a0.h hVar2, a0.h hVar3, boolean z10) {
        if (isEmpty(hVar) && isEmpty(hVar2) && isEmpty(hVar3)) {
            return;
        }
        this.storageQueue.postRunnable(new bg.m(this, hVar, hVar2, hVar3, z10, 6));
    }

    public void putContacts(ArrayList<TLRPC.TL_contact> arrayList, boolean z10) {
        if (arrayList.isEmpty() && !z10) {
            return;
        }
        this.storageQueue.postRunnable(new le(this, z10, new ArrayList(arrayList)));
    }

    public void putDialogs(TLRPC.messages_Dialogs messages_dialogs, int i9) {
        if (messages_dialogs.dialogs.isEmpty()) {
            return;
        }
        this.storageQueue.postRunnable(new p4(this, messages_dialogs, i9, 18));
    }

    public void putEncryptedChat(TLRPC.EncryptedChat encryptedChat, TLRPC.User user, TLRPC.Dialog dialog) {
        if (encryptedChat == null) {
            return;
        }
        this.storageQueue.postRunnable(new gk(this, encryptedChat, user, dialog, 26));
    }

    public void putEphemeralMessages(ArrayList<TL_ephemeral.EphemeralMessage> arrayList, boolean z10) {
        if (arrayList != null && !arrayList.isEmpty()) {
            executeInStorageQueue(new le(this, arrayList, z10));
        }
    }

    public void putGiftChatTheme(TLRPC.ChatTheme chatTheme) {
        putGiftChatThemes(Collections.singletonList(chatTheme));
    }

    public void putGiftChatThemes(List<TLRPC.ChatTheme> list) {
        executeInStorageQueue(new yb(20, this, list));
    }

    public void putMessages(ArrayList<TLRPC.Message> arrayList, boolean z10, boolean z11, boolean z12, int i9, int i10, long j10) {
        putMessages(arrayList, z10, z11, z12, i9, false, i10, j10);
    }

    public void putPushMessage(MessageObject messageObject) {
        this.storageQueue.postRunnable(new yb(21, this, messageObject));
    }

    public void putSentFile(String str, TLObject tLObject, int i9, String str2) {
        if (str != null && tLObject != null && str2 != null) {
            this.storageQueue.postRunnable(new fh.g1(this, str, tLObject, i9, str2, 10));
        }
    }

    public void putStoryPushMessage(NotificationsController.StoryNotification storyNotification) {
        this.storageQueue.postRunnable(new yb(26, this, storyNotification));
    }

    public void putUsersAndChats(List<TLRPC.User> list, List<TLRPC.Chat> list2, boolean z10, boolean z11) {
        if (list != null && list.isEmpty() && list2 != null && list2.isEmpty()) {
            return;
        }
        if (z11) {
            this.storageQueue.postRunnable(new mj(this, list, list2, z10, 13));
        } else {
            lambda$putUsersAndChats$181(list, list2, z10);
        }
    }

    public void putWallpapers(ArrayList<TLRPC.WallPaper> arrayList, int i9) {
        this.storageQueue.postRunnable(new qf(this, i9, arrayList, 0));
    }

    public void putWebPages(a0.h hVar) {
        if (isEmpty(hVar)) {
            return;
        }
        this.storageQueue.postRunnable(new jf(this, hVar, 2));
    }

    public void putWidgetDialogs(int i9, ArrayList<TopicKey> arrayList) {
        this.storageQueue.postRunnable(new qf(this, i9, arrayList, 3));
    }

    public void readAllDialogs(int i9) {
        this.storageQueue.postRunnable(new df(this, i9, 0));
    }

    public void removeAllTopics(long j10) {
        executeInStorageQueue(new ff(2, j10, this));
    }

    public void removeFromDownloadQueue(long j10, int i9, boolean z10) {
        this.storageQueue.postRunnable(new ve(this, z10, i9, j10));
    }

    public void removePendingTask(long j10) {
        this.storageQueue.postRunnable(new ff(6, j10, this));
    }

    public void removeTopic(long j10, long j11) {
        this.storageQueue.postRunnable(new qe(3, j10, j11, this));
    }

    public void removeTopics(long j10, ArrayList<Long> arrayList) {
        this.storageQueue.postRunnable(new ne(this, arrayList, j10, 6));
    }

    public void replaceMessageIfExists(TLRPC.Message message, ArrayList<TLRPC.User> arrayList, ArrayList<TLRPC.Chat> arrayList2, boolean z10) {
        if (message == null || (message instanceof TLRPC.TL_messageEmpty)) {
            return;
        }
        this.storageQueue.postRunnable(new bg.m(this, message, z10, arrayList, arrayList2, 7));
    }

    public void reset() {
        clearDatabaseValues();
        AndroidUtilities.runOnUIThread(new f2(this, 15));
    }

    public void resetAllUnreadCounters(boolean z10) {
        int size = this.dialogFilters.size();
        for (int i9 = 0; i9 < size; i9++) {
            MessagesController.DialogFilter dialogFilter = this.dialogFilters.get(i9);
            if (z10) {
                if ((dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) != 0) {
                    dialogFilter.pendingUnreadCount = -1;
                }
            } else {
                dialogFilter.pendingUnreadCount = -1;
            }
        }
        calcUnreadCounters(false);
        AndroidUtilities.runOnUIThread(new f2(this, 14));
    }

    public void resetDialogs(final TLRPC.messages_Dialogs messages_dialogs, final int i9, final int i10, final int i11, final int i12, final int i13, final a0.h hVar, final a0.h hVar2, final TLRPC.Message message, final int i14) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$resetDialogs$95(messages_dialogs, i14, i10, i11, i12, i13, message, i9, hVar, hVar2);
            }
        });
    }

    public void resetMentionsCount(long j10, long j11, int i9) {
        this.storageQueue.postRunnable(new re(this, j11, j10, i9, 7));
    }

    public void saveBotCache(String str, TLObject tLObject) {
        if (tLObject != null && !TextUtils.isEmpty(str)) {
            this.storageQueue.postRunnable(new x8(16, this, tLObject, str));
        }
    }

    public void saveChannelPts(long j10, int i9) {
        this.storageQueue.postRunnable(new kf(this, i9, j10, 0));
    }

    public void saveChatInviter(long j10, long j11) {
        this.storageQueue.postRunnable(new qe(1, j11, j10, this));
    }

    public void saveChatLinksCount(long j10, int i9) {
        this.storageQueue.postRunnable(new kf(this, i9, j10, 6));
    }

    public void saveDialogFilter(MessagesController.DialogFilter dialogFilter, boolean z10, boolean z11) {
        this.storageQueue.postRunnable(new a3(this, dialogFilter, z10, z11, 1));
    }

    public void saveDialogFiltersOrder() {
        this.storageQueue.postRunnable(new ke(17, new ArrayList(getMessagesController().dialogFilters), this));
    }

    public void saveDialogFiltersOrderInternal() {
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = this.database.executeFast("UPDATE dialog_filter SET ord = ?, flags = ? WHERE id = ?");
                int size = this.dialogFilters.size();
                for (int i9 = 0; i9 < size; i9++) {
                    MessagesController.DialogFilter dialogFilter = this.dialogFilters.get(i9);
                    sQLitePreparedStatement.requery();
                    sQLitePreparedStatement.bindInteger(1, dialogFilter.order);
                    sQLitePreparedStatement.bindInteger(2, dialogFilter.flags);
                    sQLitePreparedStatement.bindInteger(3, dialogFilter.f19649id);
                    sQLitePreparedStatement.step();
                }
                sQLitePreparedStatement.dispose();
            } catch (Exception e10) {
                checkSQLException(e10);
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
            }
        } catch (Throwable th) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    public void saveDiffParams(int i9, int i10, int i11, int i12) {
        this.storageQueue.postRunnable(new af(this, i9, i10, i11, i12, 0));
    }

    public void saveSecretParams(int i9, int i10, byte[] bArr) {
        this.storageQueue.postRunnable(new w4((Object) this, i9, i10, (Serializable) bArr, 7));
    }

    public void saveStoryAlbumsCache(long j10, List<ih.o6> list) {
        this.storageQueue.postRunnable(new a4(this, j10, list, 18));
    }

    public void saveTopics(long j10, List<TLRPC.TL_forumTopic> list, boolean z10, boolean z11, int i9) {
        if (z11) {
            this.storageQueue.postRunnable(new yf(this, j10, list, z10, i9, 0));
        } else {
            saveTopicsInternal(j10, list, z10, false, i9);
        }
    }

    public void searchSavedByTag(final TLRPC.Reaction reaction, final long j10, final String str, final int i9, final int i10, final Utilities.Callback4<ArrayList<MessageObject>, ArrayList<TLRPC.User>, ArrayList<TLRPC.Chat>, ArrayList<TLRPC.Document>> callback4, final boolean z10) {
        if (callback4 == null) {
            return;
        }
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$searchSavedByTag$103(str, j10, reaction, i9, i10, z10, callback4);
            }
        });
    }

    public void setDialogFlags(long j10, long j11) {
        this.storageQueue.postRunnable(new qe(2, j10, j11, this));
    }

    public void setDialogPinned(long j10, int i9) {
        this.storageQueue.postRunnable(new kf(this, i9, j10, 2));
    }

    public void setDialogTtl(long j10, int i9) {
        this.storageQueue.postRunnable(new kf(this, i9, j10, 3));
    }

    public void setDialogUnread(long j10, boolean z10) {
        this.storageQueue.postRunnable(new zf(this, 0, z10, j10));
    }

    public void setDialogViewThreadAsMessages(long j10, boolean z10) {
        this.storageQueue.postRunnable(new zf(this, 1, z10, j10));
    }

    public void setDialogsFolderId(ArrayList<TLRPC.TL_folderPeer> arrayList, ArrayList<TLRPC.TL_inputFolderPeer> arrayList2, long j10, int i9) {
        if (arrayList == null && arrayList2 == null && j10 == 0) {
            return;
        }
        this.storageQueue.postRunnable(new fh.c0(this, arrayList, arrayList2, i9, j10));
    }

    public void setDialogsPinned(ArrayList<Long> arrayList, ArrayList<Integer> arrayList2) {
        this.storageQueue.postRunnable(new wf(this, arrayList, arrayList2, 0));
    }

    public void setLastDateValue(int i9) {
        ensureOpened();
        this.lastDateValue = i9;
    }

    public void setLastPtsValue(int i9) {
        ensureOpened();
        this.lastPtsValue = i9;
    }

    public void setLastQtsValue(int i9) {
        ensureOpened();
        this.lastQtsValue = i9;
    }

    public void setLastSecretVersion(int i9) {
        ensureOpened();
        this.lastSecretVersion = i9;
    }

    public void setLastSeqValue(int i9) {
        ensureOpened();
        this.lastSeqValue = i9;
    }

    public void setMessageSeq(int i9, int i10, int i11) {
        this.storageQueue.postRunnable(new kh.c0(this, i9, i10, i11, 1));
    }

    public void setSecretG(int i9) {
        ensureOpened();
        this.secretG = i9;
    }

    public void setSecretPBytes(byte[] bArr) {
        ensureOpened();
        this.secretPBytes = bArr;
    }

    public void toggleTodo(final long j10, final int i9, final int i10, final boolean z10, final long j11) {
        final long clientUserId = getUserConfig().getClientUserId();
        final int currentTime = getConnectionsManager().getCurrentTime();
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$toggleTodo$100(j10, i9, clientUserId, j11, i10, z10, currentTime);
            }
        });
    }

    public void unpinAllDialogsExceptNew(ArrayList<Long> arrayList, int i9) {
        this.storageQueue.postRunnable(new qf(i9, arrayList, this));
    }

    public void updateChannelUsers(long j10, ArrayList<TLRPC.ChannelParticipant> arrayList) {
        this.storageQueue.postRunnable(new ne(this, j10, arrayList, 3));
    }

    public void updateChatDefaultBannedRights(long j10, TLRPC.TL_chatBannedRights tL_chatBannedRights, int i9) {
        if (tL_chatBannedRights != null && j10 != 0) {
            this.storageQueue.postRunnable(new gh.c9(this, j10, i9, tL_chatBannedRights, 9));
        }
    }

    public void updateChatInfo(TLRPC.ChatFull chatFull, boolean z10) {
        this.storageQueue.postRunnable(new l6(this, chatFull, z10, 9));
    }

    public void updateChatOnlineCount(long j10, int i9) {
        this.storageQueue.postRunnable(new kf(this, i9, j10, 5));
    }

    public void updateChatParticipants(TLRPC.ChatParticipants chatParticipants) {
        if (chatParticipants == null) {
            return;
        }
        this.storageQueue.postRunnable(new yb(23, this, chatParticipants));
    }

    public void updateDialogData(TLRPC.Dialog dialog) {
        if (dialog == null) {
            return;
        }
        this.storageQueue.postRunnable(new yb(28, this, dialog));
    }

    public void updateDialogUnreadPollVotes(long j10, long j11, int i9, boolean z10) {
        updateDialogUnreadReactionsInternal(j10, j11, i9, z10, false);
    }

    public void updateDialogUnreadReactions(long j10, long j11, int i9, boolean z10) {
        updateDialogUnreadReactionsInternal(j10, j11, i9, z10, true);
    }

    public void updateDialogsWithDeletedMessages(long j10, long j11, ArrayList<Integer> arrayList, ArrayList<Long> arrayList2) {
        executeInStorageQueue(new bg.x0(this, j10, j11, arrayList, arrayList2, 5));
    }

    public void updateDialogsWithReadMessages(LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, a0.h hVar, LongSparseIntArray longSparseIntArray3, boolean z10) {
        if (isEmpty(longSparseIntArray) && isEmpty(longSparseIntArray2) && isEmpty(hVar) && isEmpty(longSparseIntArray3)) {
            return;
        }
        if (z10) {
            this.storageQueue.postRunnable(new a5(this, longSparseIntArray, longSparseIntArray2, hVar, longSparseIntArray3, 12));
        } else {
            updateDialogsWithReadMessagesInternal(null, longSparseIntArray, longSparseIntArray2, hVar, longSparseIntArray3);
        }
    }

    public void updateEncryptedChat(TLRPC.EncryptedChat encryptedChat) {
        if (encryptedChat == null) {
            return;
        }
        this.storageQueue.postRunnable(new nf(this, encryptedChat, 0));
    }

    public void updateEncryptedChatLayer(TLRPC.EncryptedChat encryptedChat) {
        if (encryptedChat == null) {
            return;
        }
        this.storageQueue.postRunnable(new nf(this, encryptedChat, 1));
    }

    public void updateEncryptedChatSeq(TLRPC.EncryptedChat encryptedChat, boolean z10) {
        if (encryptedChat == null) {
            return;
        }
        this.storageQueue.postRunnable(new l6(this, encryptedChat, z10, 8));
    }

    public void updateEncryptedChatTTL(TLRPC.EncryptedChat encryptedChat) {
        if (encryptedChat == null) {
            return;
        }
        this.storageQueue.postRunnable(new nf(this, encryptedChat, 2));
    }

    public void updateMessageCustomParams(long j10, TLRPC.Message message) {
        this.storageQueue.postRunnable(new pe(0, j10, this, message));
    }

    public void updateMessagePollResults(long j10, TLRPC.Poll poll, TLRPC.PollResults pollResults) {
        this.storageQueue.postRunnable(new gh.e2(this, j10, poll, pollResults, 23));
    }

    public void updateMessageReactions(long j10, int i9, TLRPC.TL_messageReactions tL_messageReactions) {
        this.storageQueue.postRunnable(new gh.c9(this, i9, j10, tL_messageReactions, 8));
    }

    public long[] updateMessageStateAndId(final long j10, final long j11, final Integer num, final int i9, final int i10, boolean z10, final int i11, final int i12) {
        if (z10) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$updateMessageStateAndId$213(j10, j11, num, i9, i10, i11, i12);
                }
            });
            return null;
        }
        return lambda$updateMessageStateAndId$213(j10, j11, num, i9, i10, i11, i12);
    }

    public void updateMessageTopicId(long j10, long j11, int i9) {
        executeInStorageQueue(new re(this, i9, j10, j11, 1));
    }

    public void updateMessageVerifyFlags(ArrayList<TLRPC.Message> arrayList) {
        Utilities.stageQueue.postRunnable(new ke(9, arrayList, this));
    }

    public void updateMessageVoiceTranscription(final long j10, final int i9, final String str, final long j11, final boolean z10) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$updateMessageVoiceTranscription$108(i9, j10, z10, j11, str);
            }
        });
    }

    public void updateMessageVoiceTranscriptionOpen(long j10, int i9, TLRPC.Message message) {
        this.storageQueue.postRunnable(new gh.c9(this, i9, j10, message, 7));
    }

    public void updateMutedDialogsFiltersCounters() {
        this.storageQueue.postRunnable(new f2(this, 6));
    }

    public void updatePinnedMessages(long j10, ArrayList<Integer> arrayList, boolean z10, int i9, int i10, boolean z11, HashMap<Integer, MessageObject> hashMap) {
        this.storageQueue.postRunnable(new j6(this, z10, hashMap, i10, j10, arrayList, i9, z11));
    }

    public void updateRanksInLastMessages(long j10, long j11, String str) {
        this.storageQueue.postRunnable(new me(this, j10, j11, str, 1));
    }

    public void updateRepliesCount(long j10, int i9, ArrayList<TLRPC.Peer> arrayList, int i10, int i11) {
        this.storageQueue.postRunnable(new g3(this, i9, j10, i11, arrayList, i10));
    }

    public void updateRepliesMaxReadId(long j10, long j11, int i9, int i10, boolean z10) {
        if (z10) {
            this.storageQueue.postRunnable(new g8(this, j10, j11, i9, i10, 2));
        } else {
            updateRepliesMaxReadIdInternal(-j10, j11, i9, i10);
        }
    }

    public void updateTopicData(long j10, TLRPC.TL_forumTopic tL_forumTopic, int i9) {
        updateTopicData(j10, tL_forumTopic, i9, getConnectionsManager().getCurrentTime());
    }

    public void updateTopicsWithReadMessages(HashMap<TopicKey, Integer> hashMap) {
        this.storageQueue.postRunnable(new yb(19, this, hashMap));
    }

    public void updateUnreadPollVotesCount(long j10, long j11, int i9) {
        updateUnreadPollVotesCount(j10, j11, i9, false);
    }

    public void updateUnreadReactionsCount(long j10, long j11, int i9) {
        updateUnreadReactionsCount(j10, j11, i9, false);
    }

    public void updateUserInfo(TLRPC.UserFull userFull, boolean z10) {
        this.storageQueue.postRunnable(new l6(this, userFull, z10, 6));
    }

    public void updateUserInfoContactBlocked(long j10, TL_account.RequirementToContact requirementToContact) {
        this.storageQueue.postRunnable(new a4(this, j10, requirementToContact, 15));
    }

    public void updateUsers(ArrayList<TLRPC.User> arrayList, boolean z10, boolean z11, boolean z12) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (z12) {
                this.storageQueue.postRunnable(new a3(this, arrayList, z10, z11, 2));
            } else {
                lambda$updateUsers$215(arrayList, z10, z11);
            }
        }
    }

    private void checkSQLException(Throwable th, boolean z10) {
        if ((th instanceof SQLiteException) && th.getMessage() != null && th.getMessage().contains("is malformed") && !this.tryRecover) {
            this.tryRecover = true;
            FileLog.e("disk image malformed detected, try recover");
            if (recoverDatabase()) {
                this.tryRecover = false;
                clearLoadingDialogsOffsets();
                AndroidUtilities.runOnUIThread(new f2(this, 11));
                FileLog.e(new Exception("database restored!!"));
                return;
            }
            FileLog.e(new Exception(th), z10);
            return;
        }
        FileLog.e(th, z10);
    }

    private static boolean isEmpty(LongSparseIntArray longSparseIntArray) {
        return longSparseIntArray == null || longSparseIntArray.size() == 0;
    }

    public void getChatsInternal(String str, ArrayList<TLRPC.Chat> arrayList, boolean z10) {
        if (str == null || str.length() == 0 || arrayList == null) {
            return;
        }
        SQLiteDatabase sQLiteDatabase = this.database;
        Locale locale = Locale.US;
        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(aa.d.o("SELECT data FROM chats WHERE uid IN(", str, ")"), new Object[0]);
        ArrayList arrayList2 = null;
        while (queryFinalized.next()) {
            try {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                if (byteBufferValue != null) {
                    TLRPC.Chat TLdeserialize = TLRPC.Chat.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false, z10);
                    byteBufferValue.reuse();
                    if (TLdeserialize != null) {
                        arrayList.add(TLdeserialize);
                        if (TLdeserialize.linked_monoforum_id != 0) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(Long.valueOf(TLdeserialize.linked_monoforum_id));
                        }
                        if (TLdeserialize.linked_community_id != 0) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(Long.valueOf(TLdeserialize.linked_community_id));
                        }
                    }
                }
            } catch (Exception e10) {
                checkSQLException(e10);
            }
        }
        queryFinalized.dispose();
        if (arrayList2 != null) {
            SQLiteDatabase sQLiteDatabase2 = this.database;
            Locale locale2 = Locale.US;
            SQLiteCursor queryFinalized2 = sQLiteDatabase2.queryFinalized(aa.d.o("SELECT data FROM chats WHERE uid IN(", TextUtils.join(", ", arrayList2), ")"), new Object[0]);
            while (queryFinalized2.next()) {
                try {
                    NativeByteBuffer byteBufferValue2 = queryFinalized2.byteBufferValue(0);
                    if (byteBufferValue2 != null) {
                        TLRPC.Chat TLdeserialize2 = TLRPC.Chat.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false, z10);
                        byteBufferValue2.reuse();
                        if (TLdeserialize2 != null) {
                            arrayList.add(TLdeserialize2);
                        }
                    }
                } catch (Exception e11) {
                    checkSQLException(e11);
                }
            }
            queryFinalized2.dispose();
        }
    }

    public TLRPC.EncryptedChat getEncryptedChat(long j10) {
        try {
            ArrayList<TLRPC.EncryptedChat> arrayList = new ArrayList<>();
            getEncryptedChatsInternal("" + j10, arrayList, null);
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList.get(0);
        } catch (Exception e10) {
            checkSQLException(e10);
            return null;
        }
    }

    public void getUsersInternal(ArrayList<Long> arrayList, ArrayList<TLRPC.User> arrayList2, boolean z10) {
        if (arrayList == null || arrayList.isEmpty() || arrayList2 == null) {
            return;
        }
        if (arrayList.size() > 50) {
            int i9 = 0;
            while (i9 < arrayList.size()) {
                Long l10 = arrayList.get(i9);
                l10.longValue();
                TLRPC.User user = getMessagesController().getUser(l10);
                if (user != null) {
                    arrayList2.add(user);
                    arrayList.remove(i9);
                    i9--;
                }
                i9++;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        SQLiteDatabase sQLiteDatabase = this.database;
        Locale locale = Locale.US;
        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(aa.d.o("SELECT data, status FROM users WHERE uid IN(", TextUtils.join(",", arrayList), ")"), new Object[0]);
        while (queryFinalized.next()) {
            try {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                if (byteBufferValue != null) {
                    TLRPC.User TLdeserialize = TLRPC.User.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    byteBufferValue.reuse();
                    if (TLdeserialize != null) {
                        TLRPC.UserStatus userStatus = TLdeserialize.status;
                        if (userStatus != null) {
                            userStatus.expires = queryFinalized.intValue(1);
                        }
                        arrayList2.add(TLdeserialize);
                        if (arrayList.size() > 50 && z10) {
                            getMessagesController().putUser(TLdeserialize, true, false);
                        }
                    }
                }
            } catch (Exception e10) {
                checkSQLException(e10);
            }
        }
        queryFinalized.dispose();
    }

    public TLRPC.ChatFull loadChatInfo(long j10, boolean z10, CountDownLatch countDownLatch, boolean z11, boolean z12, int i9) {
        TLRPC.ChatFull[] chatFullArr = new TLRPC.ChatFull[1];
        this.storageQueue.postRunnable(new y8(this, chatFullArr, j10, z10, z11, z12, i9, countDownLatch));
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (Throwable unused) {
            }
        }
        return chatFullArr[0];
    }

    public void putMessages(final ArrayList<TLRPC.Message> arrayList, final boolean z10, boolean z11, final boolean z12, final int i9, final boolean z13, final int i10, final long j10) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (z11) {
            this.storageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesStorage.this.lambda$putMessages$200(arrayList, z10, z12, i9, z13, i10, j10);
                }
            });
        } else {
            lambda$putMessages$200(arrayList, z10, z12, i9, z13, i10, j10);
        }
    }

    public void updateChatInfo(final long j10, final long j11, final int i9, final long j12, final int i10) {
        this.storageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesStorage.this.lambda$updateChatInfo$140(j10, i9, j11, j12, i10);
            }
        });
    }

    public void updateMessageVoiceTranscription(long j10, int i9, String str, TLRPC.Message message) {
        this.storageQueue.postRunnable(new fh.c0(this, i9, j10, message, str));
    }

    public void updateTopicData(long j10, TLRPC.TL_forumTopic tL_forumTopic, int i9, int i10) {
        if (tL_forumTopic == null) {
            return;
        }
        this.storageQueue.postRunnable(new t(this, i9, tL_forumTopic, j10, i10));
    }

    public void updateUnreadPollVotesCount(long j10, long j11, int i9, boolean z10) {
        updateUnreadReactionsCountInternal("poll_votes_mentions", "poll_votes_mentions_topics", "unread_poll_votes", "unread_poll_votes", j10, j11, i9, z10);
    }

    public void updateUnreadReactionsCount(long j10, long j11, int i9, boolean z10) {
        updateUnreadReactionsCountInternal("reaction_mentions", "reaction_mentions_topics", "unread_reactions", "unread_reactions", j10, j11, i9, z10);
    }

    public static class Hole {
        public int end;
        public int start;
        public int type;

        public Hole(int i9, int i10) {
            this.start = i9;
            this.end = i10;
        }

        public Hole(int i9, int i10, int i11) {
            this.type = i9;
            this.start = i10;
            this.end = i11;
        }
    }

    private static boolean isEmpty(List<?> list) {
        return list == null || list.isEmpty();
    }

    private void onReactionsUpdate(long j10, TLRPC.TL_messageReactions tL_messageReactions, TLRPC.TL_messageReactions tL_messageReactions2) {
        ArrayList<TLRPC.ReactionCount> arrayList;
        if (tL_messageReactions == null || (arrayList = tL_messageReactions.results) == null) {
            return;
        }
        if (arrayList.isEmpty() && tL_messageReactions2 != null && tL_messageReactions2.results.isEmpty()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new gh.e2(this, tL_messageReactions, tL_messageReactions2, j10, 24));
    }

    private static boolean isEmpty(SparseIntArray sparseIntArray) {
        return sparseIntArray == null || sparseIntArray.size() == 0;
    }

    private void updateWidgets(ArrayList<Long> arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        try {
            SQLiteDatabase sQLiteDatabase = this.database;
            Locale locale = Locale.US;
            String join = TextUtils.join(",", arrayList);
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT DISTINCT id FROM shortcut_widget WHERE did IN(" + join + ",-1)", new Object[0]);
            ArrayList arrayList2 = null;
            while (queryFinalized.next()) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(Integer.valueOf(queryFinalized.intValue(0)));
            }
            queryFinalized.dispose();
            if (arrayList2 != null) {
                AndroidUtilities.runOnUIThread(new e(arrayList2, 5));
            }
        } catch (Exception e10) {
            checkSQLException(e10);
        }
    }

    public ArrayList<Long> markMessagesAsDeleted(long j10, int i9, boolean z10, boolean z11) {
        if (z10) {
            this.storageQueue.postRunnable(new ve(this, j10, i9, z11));
            return null;
        }
        return lambda$markMessagesAsDeleted$231(j10, i9, z11);
    }

    private static boolean isEmpty(a0.h hVar) {
        return hVar == null || hVar.m() == 0;
    }

    public void putMessages(TLRPC.messages_Messages messages_messages, long j10, int i9, int i10, boolean z10, int i11, long j11) {
        this.storageQueue.postRunnable(new v8(this, i11, messages_messages, j10, j11, i9, i10, z10));
    }

    public void deleteEphemeralMessages(a0.h hVar, boolean z10) {
        executeInStorageQueue(new l6(this, hVar, z10, 10));
    }

    public ArrayList<TL_ephemeral.EphemeralMessage> getEphemeralMessagesInternal(long j10, ArrayList<Integer> arrayList) {
        ArrayList<TL_ephemeral.EphemeralMessage> arrayList2 = new ArrayList<>();
        if (arrayList != null && !arrayList.isEmpty()) {
            SQLiteCursor sQLiteCursor = null;
            try {
                try {
                    SQLiteDatabase sQLiteDatabase = this.database;
                    Locale locale = Locale.US;
                    String join = TextUtils.join(",", arrayList);
                    sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT data FROM ephemeral_messages WHERE dialog_id = " + j10 + " AND id IN (" + join + ")", new Object[0]);
                    while (sQLiteCursor.next()) {
                        NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                        if (byteBufferValue != null) {
                            TL_ephemeral.EphemeralMessage TLdeserialize = TL_ephemeral.EphemeralMessage.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            byteBufferValue.reuse();
                            if (TLdeserialize != null) {
                                arrayList2.add(TLdeserialize);
                            }
                        }
                    }
                    sQLiteCursor.dispose();
                    return arrayList2;
                } catch (Exception e10) {
                    checkSQLException(e10);
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                }
            } catch (Throwable th) {
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
                throw th;
            }
        }
        return arrayList2;
    }

    public void getUsersInternal(HashSet<Long> hashSet, ArrayList<TLRPC.User> arrayList) {
        if (hashSet == null || hashSet.isEmpty() || arrayList == null) {
            return;
        }
        if (hashSet.size() > 50) {
            Iterator<Long> it = hashSet.iterator();
            while (it.hasNext()) {
                TLRPC.User user = getMessagesController().getUser(it.next());
                if (user != null) {
                    arrayList.add(user);
                    it.remove();
                }
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        SQLiteDatabase sQLiteDatabase = this.database;
        Locale locale = Locale.US;
        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(aa.d.o("SELECT data, status FROM users WHERE uid IN(", TextUtils.join(",", hashSet), ")"), new Object[0]);
        while (queryFinalized.next()) {
            try {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                if (byteBufferValue != null) {
                    TLRPC.User TLdeserialize = TLRPC.User.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    byteBufferValue.reuse();
                    if (TLdeserialize != null) {
                        TLRPC.UserStatus userStatus = TLdeserialize.status;
                        if (userStatus != null) {
                            userStatus.expires = queryFinalized.intValue(1);
                        }
                        arrayList.add(TLdeserialize);
                    }
                }
            } catch (Exception e10) {
                checkSQLException(e10);
            }
        }
        queryFinalized.dispose();
    }

    public java.util.ArrayList<java.lang.Long> lambda$markMessagesAsDeleted$231(long r25, int r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesStorage.lambda$markMessagesAsDeleted$231(long, int, boolean):java.util.ArrayList");
    }
}
