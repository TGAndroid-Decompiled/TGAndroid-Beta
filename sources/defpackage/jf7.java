package defpackage;

import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.io.File;
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
import java.util.regex.Pattern;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class jf7 extends rf0 {
    public static volatile jf7[] f0 = new jf7[4];
    public static final Object[] g0 = new Object[4];
    public static final String[] h0;
    public int E;
    public int F;
    public int G;
    public int H;
    public final ArrayList I;
    public final SparseArray J;
    public final zh6 K;
    public int L;
    public int M;
    public volatile int N;
    public volatile int O;
    public boolean P;
    public final CountDownLatch Q;
    public boolean R;
    public final LongSparseIntArray S;
    public boolean T;
    public final int[][] U;
    public final int[][] V;
    public final int[][] W;
    public final int[][] X;
    public final int[][] Y;
    public final int[][] Z;
    public final to3 a;
    public final int[] a0;
    public SQLiteDatabase b;
    public final int[] b0;
    public File c;
    public final zh6 c0;
    public File d;
    public final zh6 d0;
    public File e;
    public final wz4 e0;
    public final AtomicLong f;
    public final SparseArray h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;
    public byte[] y;

    static {
        for (int i = 0; i < 4; i++) {
            g0[i] = new Object();
        }
        h0 = new String[]{"messages_holes", "media_holes_v2", "scheduled_messages_v2", "quick_replies", "messages_v2", "download_queue", "user_contacts_v7", "user_phones_v7", "dialogs", "dialog_filter", "dialog_filter_ep", "dialog_filter_pin_v2", "randoms_v2", "enc_tasks_v4", "messages_seq", "params", "media_v4", "bot_keyboard", "bot_keyboard_topics", "chat_settings_v2", "user_settings", "chat_pinned_v2", "chat_pinned_count", "chat_hints", "botcache", "users_data", "users", "chats", "enc_chats", "channel_users_v2", "channel_admins_v3", "contacts", "dialog_photos", "dialog_settings", "web_recent_v3", "stickers_v2", "stickers_featured", "stickers_dice", "stickersets", "hashtag_recent_v2", "webpage_pending_v2", "sent_files_v2", "search_recent", "media_counts_v2", "keyvalue", "bot_info_v2", "pending_tasks", "requested_holes", "sharing_locations", "shortcut_widget", "emoji_keywords_v2", "emoji_keywords_info_v2", "wallpapers2", "unread_push_messages", "polls_v2", "reactions", "reaction_mentions", "downloading_documents", "animated_emoji", "attach_menu_bots", "premium_promo", "emoji_statuses", "messages_holes_topics", "messages_topics", "saved_dialogs", "media_topics", "media_holes_topics", "topics", "media_counts_topics", "reaction_mentions_topics", "emoji_groups", "poll_votes_mentions", "poll_votes_mentions_topics", "ephemeral_messages", "widget_state", "widget_heights"};
    }

    public jf7(int i) {
        super(i);
        this.f = new AtomicLong(System.currentTimeMillis());
        this.h = new SparseArray();
        this.n = 0;
        this.r = 0;
        this.s = 0;
        this.w = 0;
        this.x = 0;
        this.y = null;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = new ArrayList();
        this.J = new SparseArray();
        this.K = new zh6();
        this.Q = new CountDownLatch(1);
        this.S = new LongSparseIntArray();
        this.U = new int[][]{new int[2], new int[2]};
        this.V = new int[][]{new int[2], new int[2]};
        this.W = new int[][]{new int[2], new int[2]};
        this.X = new int[][]{new int[2], new int[2]};
        this.Y = new int[][]{new int[2], new int[2]};
        this.Z = new int[][]{new int[2], new int[2]};
        this.a0 = new int[2];
        this.b0 = new int[2];
        this.c0 = new zh6();
        this.d0 = new zh6();
        this.e0 = new wz4((byte) 28);
        to3 to3Var = new to3(uh9.k(i, "storageQueue_"));
        this.a = to3Var;
        to3Var.setPriority(8);
        to3Var.c(new be7(this, (byte) 29));
    }

    public static void I(TLRPC.Message message) {
        if (message != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaUnsupported_old) {
                if (messageMedia.bytes.length == 0) {
                    Pattern pattern = Utilities.a;
                    messageMedia.bytes = new byte[]{0, 0, 0, -21};
                }
            } else if (messageMedia instanceof TLRPC.TL_messageMediaUnsupported) {
                TLRPC.TL_messageMediaUnsupported_old tL_messageMediaUnsupported_old = new TLRPC.TL_messageMediaUnsupported_old();
                message.media = tL_messageMediaUnsupported_old;
                Pattern pattern2 = Utilities.a;
                tL_messageMediaUnsupported_old.bytes = new byte[]{0, 0, 0, -21};
                message.flags |= 512;
            }
        }
    }

    public static ArrayList I1(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) arrayList.get(i);
                if (inputPeer != null) {
                    long j = inputPeer.user_id;
                    if (j == 0) {
                        long j2 = inputPeer.chat_id;
                        if (j2 == 0) {
                            j2 = inputPeer.channel_id;
                        }
                        j = -j2;
                    }
                    arrayList2.add(Long.valueOf(j));
                }
            }
        }
        return arrayList2;
    }

    public static String J(TLRPC.User user) {
        StringBuilder sb = new StringBuilder();
        String str = user.first_name;
        if (str != null && str.length() > 0) {
            sb.append(user.first_name);
        }
        String str2 = user.last_name;
        if (str2 != null && str2.length() > 0) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(user.last_name);
        }
        sb.append(";;;");
        String str3 = user.username;
        if (str3 != null && str3.length() > 0) {
            sb.append(user.username);
        } else {
            ArrayList<TLRPC.TL_username> arrayList = user.usernames;
            if (arrayList != null && arrayList.size() > 0) {
                for (int i = 0; i < user.usernames.size(); i++) {
                    TLRPC.TL_username tL_username = user.usernames.get(i);
                    if (tL_username != null && tL_username.active) {
                        sb.append(tL_username.username);
                        sb.append(";;");
                    }
                }
            }
        }
        return sb.toString().toLowerCase();
    }

    public static jf7 Y(int i) {
        jf7 jf7Var;
        jf7 jf7Var2 = f0[i];
        if (jf7Var2 == null) {
            synchronized (g0[i]) {
                jf7Var = f0[i];
                if (jf7Var == null) {
                    jf7[] jf7VarArr = f0;
                    jf7 jf7Var3 = new jf7(i);
                    jf7VarArr[i] = jf7Var3;
                    jf7Var = jf7Var3;
                }
            }
            return jf7Var;
        }
        return jf7Var2;
    }

    public static void b(TLRPC.Peer peer, ArrayList arrayList, ArrayList arrayList2) {
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

    public static int b0(TLRPC.Message message) {
        if (message instanceof TLRPC.TL_message_secret) {
            if ((message.media instanceof TLRPC.TL_messageMediaPhoto) || r47.t3(message) || r47.Q4(message) || r47.K4(message) || r47.i4(message)) {
                int i = message.ttl;
                if (i > 0 && i <= 60) {
                    return 1;
                }
                return 0;
            }
            return -1;
        }
        if (message instanceof TLRPC.TL_message) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (((messageMedia instanceof TLRPC.TL_messageMediaPhoto) || (messageMedia instanceof TLRPC.TL_messageMediaDocument)) && messageMedia.ttl_seconds != 0) {
                return 1;
            }
        }
        if (!(message.media instanceof TLRPC.TL_messageMediaPhoto) && !r47.K4(message)) {
            return -1;
        }
        return 0;
    }

    public static void c(TLRPC.Message message, zh6 zh6Var, zh6 zh6Var2) {
        long B0;
        TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
        int i = messageReplyHeader.reply_to_msg_id;
        if ((message.flags & 1073741824) != 0) {
            B0 = message.quick_reply_shortcut_id;
        } else {
            TLRPC.Peer peer = messageReplyHeader.reply_to_peer_id;
            if (peer != null) {
                B0 = r47.B1(peer);
            } else {
                B0 = r47.B0(message);
            }
        }
        SparseArray sparseArray = (SparseArray) zh6Var.f(B0);
        ArrayList arrayList = (ArrayList) zh6Var2.f(B0);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            zh6Var.k(B0, sparseArray);
        }
        if (arrayList == null) {
            arrayList = qd4.s(zh6Var2, B0);
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

    public static void d(TLRPC.Message message, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
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
        long B1 = r47.B1(message.from_id);
        if (wf3.D(B1)) {
            if (!arrayList.contains(Long.valueOf(B1))) {
                arrayList.add(Long.valueOf(B1));
            }
        } else if (wf3.y(B1)) {
            long j = -B1;
            if (!arrayList2.contains(Long.valueOf(j))) {
                arrayList2.add(Long.valueOf(j));
            }
        }
        long j2 = message.via_bot_id;
        if (j2 != 0 && !arrayList.contains(Long.valueOf(j2))) {
            arrayList.add(Long.valueOf(message.via_bot_id));
        }
        TLRPC.Peer peer8 = message.guestchat_via_from;
        if (peer8 != null) {
            b(peer8, arrayList, arrayList2);
        }
        TLRPC.MessageAction messageAction = message.action;
        if (messageAction != null) {
            long j3 = messageAction.user_id;
            if (j3 != 0 && !arrayList.contains(Long.valueOf(j3))) {
                arrayList.add(Long.valueOf(message.action.user_id));
            }
            long j4 = message.action.channel_id;
            if (j4 != 0 && !arrayList2.contains(Long.valueOf(j4))) {
                arrayList2.add(Long.valueOf(message.action.channel_id));
            }
            long j5 = message.action.chat_id;
            if (j5 != 0 && !arrayList2.contains(Long.valueOf(j5))) {
                arrayList2.add(Long.valueOf(message.action.chat_id));
            }
            TLRPC.MessageAction messageAction2 = message.action;
            if (messageAction2 instanceof TLRPC.TL_messageActionGiftCode) {
                b(((TLRPC.TL_messageActionGiftCode) messageAction2).boost_peer, arrayList, arrayList2);
            }
            TLRPC.MessageAction messageAction3 = message.action;
            if (messageAction3 instanceof TLRPC.TL_messageActionGeoProximityReached) {
                TLRPC.TL_messageActionGeoProximityReached tL_messageActionGeoProximityReached = (TLRPC.TL_messageActionGeoProximityReached) messageAction3;
                b(tL_messageActionGeoProximityReached.from_id, arrayList, arrayList2);
                b(tL_messageActionGeoProximityReached.to_id, arrayList, arrayList2);
            }
            TLRPC.MessageAction messageAction4 = message.action;
            if (messageAction4 instanceof TLRPC.TL_messageActionManagedBotCreated) {
                arrayList.add(Long.valueOf(((TLRPC.TL_messageActionManagedBotCreated) messageAction4).bot_id));
            }
            TLRPC.MessageAction messageAction5 = message.action;
            if (messageAction5 instanceof TLRPC.TL_messageActionBotInvite) {
                TLRPC.TL_messageActionBotInvite tL_messageActionBotInvite = (TLRPC.TL_messageActionBotInvite) messageAction5;
                long j6 = tL_messageActionBotInvite.inviter_id;
                if (j6 != 0 && !arrayList.contains(Long.valueOf(j6))) {
                    arrayList.add(Long.valueOf(tL_messageActionBotInvite.inviter_id));
                }
            }
            TLRPC.MessageAction messageAction6 = message.action;
            if (messageAction6 instanceof TLRPC.TL_messageActionChangeCommunity) {
                long j7 = ((TLRPC.TL_messageActionChangeCommunity) messageAction6).community_id;
                if (j7 > 0) {
                    arrayList2.add(Long.valueOf(j7));
                }
            }
            if (!message.action.users.isEmpty()) {
                for (int i = 0; i < message.action.users.size(); i++) {
                    Long l = message.action.users.get(i);
                    if (!arrayList.contains(l)) {
                        arrayList.add(l);
                    }
                }
            }
        }
        if (!message.entities.isEmpty()) {
            for (int i2 = 0; i2 < message.entities.size(); i2++) {
                TLRPC.MessageEntity messageEntity = message.entities.get(i2);
                if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                    arrayList.add(Long.valueOf(((TLRPC.TL_messageEntityMentionName) messageEntity).user_id));
                } else if (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) {
                    arrayList.add(Long.valueOf(((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id));
                } else if (arrayList3 != null && (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji)) {
                    arrayList3.add(Long.valueOf(((TLRPC.TL_messageEntityCustomEmoji) messageEntity).document_id));
                }
            }
        }
        TLRPC.MessageAction messageAction7 = message.action;
        if (messageAction7 instanceof TLRPC.TL_messageActionStarGift) {
            TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGift) messageAction7).gift;
            if (starGift != null && (peer7 = starGift.released_by) != null) {
                b(peer7, arrayList, arrayList2);
            }
        } else if (messageAction7 instanceof TLRPC.TL_messageActionStarGiftUnique) {
            TL_stars.StarGift starGift2 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction7).gift;
            if (starGift2 != null && (peer = starGift2.released_by) != null) {
                b(peer, arrayList, arrayList2);
            }
        } else if (messageAction7 instanceof TLRPC.TL_messageActionRequestedPeer) {
            TLRPC.TL_messageActionRequestedPeer tL_messageActionRequestedPeer = (TLRPC.TL_messageActionRequestedPeer) messageAction7;
            for (int i3 = 0; i3 < tL_messageActionRequestedPeer.peers.size(); i3++) {
                b(tL_messageActionRequestedPeer.peers.get(i3), arrayList, arrayList2);
            }
        }
        TLRPC.MessageMedia messageMedia = message.media;
        if (messageMedia != null) {
            long j8 = messageMedia.user_id;
            if (j8 != 0 && !arrayList.contains(Long.valueOf(j8))) {
                arrayList.add(Long.valueOf(message.media.user_id));
            }
            TLRPC.MessageMedia messageMedia2 = message.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaGiveaway) {
                ArrayList<Long> arrayList4 = ((TLRPC.TL_messageMediaGiveaway) messageMedia2).channels;
                int size = arrayList4.size();
                int i4 = 0;
                while (i4 < size) {
                    Long l2 = arrayList4.get(i4);
                    i4++;
                    Long l3 = l2;
                    if (!arrayList2.contains(l3)) {
                        arrayList2.add(l3);
                    }
                }
            }
            TLRPC.MessageMedia messageMedia3 = message.media;
            if (messageMedia3 instanceof TLRPC.TL_messageMediaGiveawayResults) {
                ArrayList<Long> arrayList5 = ((TLRPC.TL_messageMediaGiveawayResults) messageMedia3).winners;
                int size2 = arrayList5.size();
                int i5 = 0;
                while (i5 < size2) {
                    Long l4 = arrayList5.get(i5);
                    i5++;
                    Long l5 = l4;
                    if (!arrayList.contains(l5)) {
                        arrayList.add(l5);
                    }
                }
            }
            TLRPC.MessageMedia messageMedia4 = message.media;
            if (messageMedia4 instanceof TLRPC.TL_messageMediaPoll) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia4;
                if (!tL_messageMediaPoll.poll.answers.isEmpty()) {
                    for (int i6 = 0; i6 < tL_messageMediaPoll.poll.answers.size(); i6++) {
                        TLRPC.Peer peer9 = tL_messageMediaPoll.poll.answers.get(i6).added_by;
                        if (peer9 != null) {
                            b(peer9, arrayList, arrayList2);
                        }
                    }
                }
                TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
                if (pollResults != null) {
                    ArrayList<TLRPC.Peer> arrayList6 = pollResults.recent_voters;
                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                        for (int i7 = 0; i7 < tL_messageMediaPoll.results.recent_voters.size(); i7++) {
                            b(tL_messageMediaPoll.results.recent_voters.get(i7), arrayList, arrayList2);
                        }
                    }
                    if (!tL_messageMediaPoll.results.results.isEmpty()) {
                        ArrayList<TLRPC.PollAnswerVoters> arrayList7 = tL_messageMediaPoll.results.results;
                        int size3 = arrayList7.size();
                        int i8 = 0;
                        while (i8 < size3) {
                            TLRPC.PollAnswerVoters pollAnswerVoters = arrayList7.get(i8);
                            i8++;
                            TLRPC.PollAnswerVoters pollAnswerVoters2 = pollAnswerVoters;
                            ArrayList<TLRPC.Peer> arrayList8 = pollAnswerVoters2.recent_voters;
                            if (arrayList8 != null && !arrayList8.isEmpty()) {
                                ArrayList<TLRPC.Peer> arrayList9 = pollAnswerVoters2.recent_voters;
                                int size4 = arrayList9.size();
                                int i9 = 0;
                                while (i9 < size4) {
                                    TLRPC.Peer peer10 = arrayList9.get(i9);
                                    i9++;
                                    b(peer10, arrayList, arrayList2);
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
                    b(storyFwdHeader2.from, arrayList, arrayList2);
                }
                TL_stories.StoryItem storyItem2 = message.media.storyItem;
                if (storyItem2 != null && storyItem2.media_areas != null) {
                    for (int i10 = 0; i10 < message.media.storyItem.media_areas.size(); i10++) {
                        if (message.media.storyItem.media_areas.get(i10) instanceof TL_stories.TL_mediaAreaChannelPost) {
                            long j9 = ((TL_stories.TL_mediaAreaChannelPost) message.media.storyItem.media_areas.get(i10)).channel_id;
                            if (!arrayList2.contains(Long.valueOf(j9))) {
                                arrayList2.add(Long.valueOf(j9));
                            }
                        }
                    }
                }
                TL_stories.StoryItem storyItem3 = message.media.storyItem;
                if (storyItem3 != null && (peer6 = storyItem3.from_id) != null) {
                    b(peer6, arrayList, arrayList2);
                }
            }
            TLRPC.MessageMedia messageMedia6 = message.media;
            if ((messageMedia6 instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia6.webpage) != null && webPage.attributes != null) {
                for (int i11 = 0; i11 < message.media.webpage.attributes.size(); i11++) {
                    if (message.media.webpage.attributes.get(i11) instanceof TLRPC.TL_webPageAttributeStory) {
                        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) message.media.webpage.attributes.get(i11);
                        TL_stories.StoryItem storyItem4 = tL_webPageAttributeStory.storyItem;
                        if (storyItem4 != null && (storyFwdHeader = storyItem4.fwd_from) != null) {
                            b(storyFwdHeader.from, arrayList, arrayList2);
                        }
                        TL_stories.StoryItem storyItem5 = tL_webPageAttributeStory.storyItem;
                        if (storyItem5 != null && storyItem5.media_areas != null) {
                            for (int i12 = 0; i12 < tL_webPageAttributeStory.storyItem.media_areas.size(); i12++) {
                                if (tL_webPageAttributeStory.storyItem.media_areas.get(i12) instanceof TL_stories.TL_mediaAreaChannelPost) {
                                    long j10 = ((TL_stories.TL_mediaAreaChannelPost) tL_webPageAttributeStory.storyItem.media_areas.get(i12)).channel_id;
                                    if (!arrayList2.contains(Long.valueOf(j10))) {
                                        arrayList2.add(Long.valueOf(j10));
                                    }
                                }
                            }
                        }
                        TL_stories.StoryItem storyItem6 = tL_webPageAttributeStory.storyItem;
                        if (storyItem6 != null && (peer5 = storyItem6.from_id) != null) {
                            b(peer5, arrayList, arrayList2);
                        }
                    }
                }
            }
            TLRPC.Peer peer11 = message.media.peer;
            if (peer11 != null) {
                b(peer11, arrayList, arrayList2);
            }
        }
        TLRPC.MessageReplies messageReplies = message.replies;
        if (messageReplies != null) {
            int size5 = messageReplies.recent_repliers.size();
            for (int i13 = 0; i13 < size5; i13++) {
                b(message.replies.recent_repliers.get(i13), arrayList, arrayList2);
            }
        }
        TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
        if (messageReplyHeader != null && (peer4 = messageReplyHeader.reply_to_peer_id) != null) {
            b(peer4, arrayList, arrayList2);
        }
        TLRPC.MessageFwdHeader messageFwdHeader2 = message.fwd_from;
        if (messageFwdHeader2 != null) {
            b(messageFwdHeader2.from_id, arrayList, arrayList2);
            b(message.fwd_from.saved_from_peer, arrayList, arrayList2);
        }
        TLRPC.MessageReplyHeader messageReplyHeader2 = message.reply_to;
        if (messageReplyHeader2 != null && (messageFwdHeader = messageReplyHeader2.reply_from) != null && (peer3 = messageFwdHeader.from_id) != null) {
            b(peer3, arrayList, arrayList2);
        }
        HashMap<String, String> hashMap = message.params;
        if (hashMap != null && (str = hashMap.get("fwd_peer")) != null) {
            long longValue = Utilities.A(str).longValue();
            if (longValue < 0) {
                long j11 = -longValue;
                if (!arrayList2.contains(Long.valueOf(j11))) {
                    arrayList2.add(Long.valueOf(j11));
                }
            }
        }
        TLRPC.TL_messageReactions tL_messageReactions = message.reactions;
        if (tL_messageReactions != null && tL_messageReactions.top_reactors != null) {
            for (int i14 = 0; i14 < message.reactions.top_reactors.size(); i14++) {
                TLRPC.MessageReactor messageReactor = message.reactions.top_reactors.get(i14);
                if (messageReactor != null && (peer2 = messageReactor.peer_id) != null) {
                    b(peer2, arrayList, arrayList2);
                }
            }
        }
    }

    public static boolean p0(zh6 zh6Var) {
        if (zh6Var != null && zh6Var.m() != 0) {
            return false;
        }
        return true;
    }

    public static boolean q0(LongSparseIntArray longSparseIntArray) {
        if (longSparseIntArray != null && longSparseIntArray.size() != 0) {
            return false;
        }
        return true;
    }

    public static boolean s0(TLRPC.MessageAction messageAction) {
        if (!(messageAction instanceof TLRPC.TL_messageActionPinMessage) && !(messageAction instanceof TLRPC.TL_messageActionPaymentSent) && !(messageAction instanceof TLRPC.TL_messageActionGameScore) && !(messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) && !(messageAction instanceof TLRPC.TL_messageActionPollAppendAnswer) && !(messageAction instanceof TLRPC.TL_messageActionPollDeleteAnswer)) {
            return false;
        }
        return true;
    }

    public static void v(long j, SQLitePreparedStatement sQLitePreparedStatement, SQLitePreparedStatement sQLitePreparedStatement2, int i, long j2) {
        int i2;
        int i3;
        int i4;
        int i5;
        sQLitePreparedStatement.requery();
        sQLitePreparedStatement.bindLong(1, j);
        int i6 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i6 != 0) {
            sQLitePreparedStatement.bindLong(2, j2);
            i2 = 3;
        } else {
            i2 = 2;
        }
        int i7 = i2 + 1;
        if (i == 1) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        sQLitePreparedStatement.bindInteger(i2, i3);
        sQLitePreparedStatement.bindInteger(i7, i);
        sQLitePreparedStatement.step();
        for (int i8 = 0; i8 < 9; i8++) {
            sQLitePreparedStatement2.requery();
            sQLitePreparedStatement2.bindLong(1, j);
            if (i6 != 0) {
                sQLitePreparedStatement2.bindLong(2, j2);
                i4 = 3;
            } else {
                i4 = 2;
            }
            int i9 = i4 + 1;
            sQLitePreparedStatement2.bindInteger(i4, i8);
            int i10 = i4 + 2;
            if (i == 1) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            sQLitePreparedStatement2.bindInteger(i9, i5);
            sQLitePreparedStatement2.bindInteger(i10, i);
            sQLitePreparedStatement2.step();
        }
    }

    public static boolean v0(TLRPC.Message message) {
        TLRPC.ReplyMarkup replyMarkup = message.reply_markup;
        if (replyMarkup != null && !(replyMarkup instanceof TLRPC.TL_replyInlineMarkup)) {
            if (!replyMarkup.selective || message.mentioned) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void z(SQLiteDatabase sQLiteDatabase) {
        bs2.B(sQLiteDatabase, "CREATE TABLE messages_holes(uid INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, start));", "CREATE INDEX IF NOT EXISTS uid_end_messages_holes_4_dialogs ON messages_holes(uid, end);", "CREATE TABLE media_holes_v2(uid INTEGER, type INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, type, start));", "CREATE INDEX IF NOT EXISTS uid_end_media_holes_v2 ON media_holes_v2(uid, type, end);");
        bs2.B(sQLiteDatabase, "CREATE TABLE scheduled_messages_v2(mid INTEGER, uid INTEGER, send_state INTEGER, date INTEGER, data BLOB, ttl INTEGER, replydata BLOB, reply_to_message_id INTEGER, PRIMARY KEY(mid, uid))", "CREATE INDEX IF NOT EXISTS send_state_idx_scheduled_messages_v2 ON scheduled_messages_v2(mid, send_state, date);", "CREATE INDEX IF NOT EXISTS uid_date_idx_scheduled_messages_v2 ON scheduled_messages_v2(uid, date);", "CREATE INDEX IF NOT EXISTS reply_to_idx_scheduled_messages_v2 ON scheduled_messages_v2(mid, reply_to_message_id);");
        bs2.B(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS idx_to_reply_scheduled_messages_v2 ON scheduled_messages_v2(reply_to_message_id, mid);", "CREATE TABLE messages_v2(mid INTEGER, uid INTEGER, read_state INTEGER, send_state INTEGER, date INTEGER, data BLOB, out INTEGER, ttl INTEGER, media INTEGER, replydata BLOB, imp INTEGER, mention INTEGER, forwards INTEGER, replies_data BLOB, thread_reply_id INTEGER, is_channel INTEGER, reply_to_message_id INTEGER, custom_params BLOB, group_id INTEGER, reply_to_story_id INTEGER, PRIMARY KEY(mid, uid))", "CREATE INDEX IF NOT EXISTS uid_mid_read_out_idx_messages_v2 ON messages_v2(uid, mid, read_state, out);", "CREATE INDEX IF NOT EXISTS uid_date_mid_idx_messages_v2 ON messages_v2(uid, date, mid);");
        bs2.B(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS mid_out_idx_messages_v2 ON messages_v2(mid, out);", "CREATE INDEX IF NOT EXISTS task_idx_messages_v2 ON messages_v2(uid, out, read_state, ttl, date, send_state);", "CREATE INDEX IF NOT EXISTS send_state_idx_messages_v2 ON messages_v2(mid, send_state, date);", "CREATE INDEX IF NOT EXISTS uid_mention_idx_messages_v2 ON messages_v2(uid, mention, read_state);");
        bs2.B(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS is_channel_idx_messages_v2 ON messages_v2(mid, is_channel);", "CREATE INDEX IF NOT EXISTS reply_to_idx_messages_v2 ON messages_v2(mid, reply_to_message_id);", "CREATE INDEX IF NOT EXISTS idx_to_reply_messages_v2 ON messages_v2(reply_to_message_id, mid);", "CREATE INDEX IF NOT EXISTS uid_mid_groupid_messages_v2 ON messages_v2(uid, mid, group_id);");
        bs2.B(sQLiteDatabase, "CREATE TABLE saved_dialogs(did INTEGER, date INTEGER, last_mid INTEGER, pinned INTEGER, flags INTEGER, folder_id INTEGER, last_mid_group INTEGER, count INTEGER, forumChatId INTEGER, unread_count INTEGER, max_read_id INTEGER, read_outbox INTEGER, PRIMARY KEY (did, forumChatId))", "CREATE INDEX IF NOT EXISTS date_idx_4_saved_dialogs ON saved_dialogs(date);", "CREATE INDEX IF NOT EXISTS last_mid_idx_4_saved_dialogs ON saved_dialogs(last_mid);", "CREATE INDEX IF NOT EXISTS folder_id_idx_4_saved_dialogs ON saved_dialogs(folder_id);");
        bs2.B(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS flags_idx_4_saved_dialogs ON saved_dialogs(flags);", "CREATE INDEX IF NOT EXISTS forum_idx_dialogs ON saved_dialogs(forumChatId);", "CREATE TABLE download_queue(uid INTEGER, type INTEGER, date INTEGER, data BLOB, parent TEXT, PRIMARY KEY (uid, type));", "CREATE INDEX IF NOT EXISTS type_date_idx_download_queue ON download_queue(type, date);");
        bs2.B(sQLiteDatabase, "CREATE TABLE user_contacts_v7(key TEXT PRIMARY KEY, uid INTEGER, fname TEXT, sname TEXT, imported INTEGER)", "CREATE TABLE user_phones_v7(key TEXT, phone TEXT, sphone TEXT, deleted INTEGER, PRIMARY KEY (key, phone))", "CREATE INDEX IF NOT EXISTS sphone_deleted_idx_user_phones ON user_phones_v7(sphone, deleted);", "CREATE TABLE dialogs(did INTEGER PRIMARY KEY, date INTEGER, unread_count INTEGER, last_mid INTEGER, inbox_max INTEGER, outbox_max INTEGER, last_mid_i INTEGER, unread_count_i INTEGER, pts INTEGER, date_i INTEGER, pinned INTEGER, flags INTEGER, folder_id INTEGER, data BLOB, unread_reactions INTEGER, last_mid_group INTEGER, ttl_period INTEGER, unread_poll_votes INTEGER)");
        bs2.B(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS date_idx_4_dialogs ON dialogs(date);", "CREATE INDEX IF NOT EXISTS last_mid_idx_4_dialogs ON dialogs(last_mid);", "CREATE INDEX IF NOT EXISTS unread_count_idx_dialogs ON dialogs(unread_count);", "CREATE INDEX IF NOT EXISTS last_mid_i_idx_dialogs ON dialogs(last_mid_i);");
        bs2.B(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS unread_count_i_idx_dialogs ON dialogs(unread_count_i);", "CREATE INDEX IF NOT EXISTS folder_id_idx_4_dialogs ON dialogs(folder_id);", "CREATE INDEX IF NOT EXISTS flags_idx_4_dialogs ON dialogs(flags);", "CREATE TABLE dialog_filter(id INTEGER PRIMARY KEY, ord INTEGER, unread_count INTEGER, flags INTEGER, title TEXT, color INTEGER DEFAULT -1, entities BLOB, noanimate INTEGER)");
        bs2.B(sQLiteDatabase, "CREATE TABLE dialog_filter_ep(id INTEGER, peer INTEGER, PRIMARY KEY (id, peer))", "CREATE TABLE dialog_filter_pin_v2(id INTEGER, peer INTEGER, pin INTEGER, PRIMARY KEY (id, peer))", "CREATE TABLE randoms_v2(random_id INTEGER, mid INTEGER, uid INTEGER, PRIMARY KEY (random_id, mid, uid))", "CREATE INDEX IF NOT EXISTS mid_idx_randoms_v2 ON randoms_v2(mid, uid);");
        bs2.B(sQLiteDatabase, "CREATE TABLE enc_tasks_v4(mid INTEGER, uid INTEGER, date INTEGER, media INTEGER, PRIMARY KEY(mid, uid, media))", "CREATE INDEX IF NOT EXISTS date_idx_enc_tasks_v4 ON enc_tasks_v4(date);", "CREATE TABLE messages_seq(mid INTEGER PRIMARY KEY, seq_in INTEGER, seq_out INTEGER);", "CREATE INDEX IF NOT EXISTS seq_idx_messages_seq ON messages_seq(seq_in, seq_out);");
        bs2.B(sQLiteDatabase, "CREATE TABLE params(id INTEGER PRIMARY KEY, seq INTEGER, pts INTEGER, date INTEGER, qts INTEGER, lsv INTEGER, sg INTEGER, pbytes BLOB)", "INSERT INTO params VALUES(1, 0, 0, 0, 0, 0, 0, NULL)", "CREATE TABLE media_v4(mid INTEGER, uid INTEGER, date INTEGER, type INTEGER, data BLOB, PRIMARY KEY(mid, uid, type))", "CREATE INDEX IF NOT EXISTS uid_mid_type_date_idx_media_v4 ON media_v4(uid, mid, type, date);");
        bs2.B(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS uid_type_date_mid_idx_media_v4 ON media_v4(uid, type, date DESC, mid DESC);", "CREATE INDEX IF NOT EXISTS media_v4_music_browse_idx ON media_v4(uid, date DESC, mid DESC) WHERE type = 4 AND mid > 0 AND uid != 0;", "CREATE TABLE bot_keyboard(uid INTEGER PRIMARY KEY, mid INTEGER, info BLOB)", "CREATE INDEX IF NOT EXISTS bot_keyboard_idx_mid_v2 ON bot_keyboard(mid, uid);");
        bs2.B(sQLiteDatabase, "CREATE TABLE bot_keyboard_topics(uid INTEGER, tid INTEGER, mid INTEGER, info BLOB, PRIMARY KEY(uid, tid))", "CREATE INDEX IF NOT EXISTS bot_keyboard_topics_idx_mid_v2 ON bot_keyboard_topics(mid, uid, tid);", "CREATE TABLE chat_settings_v2(uid INTEGER PRIMARY KEY, info BLOB, pinned INTEGER, online INTEGER, inviter INTEGER, links INTEGER, participants_count INTEGER)", "CREATE INDEX IF NOT EXISTS chat_settings_pinned_idx ON chat_settings_v2(uid, pinned) WHERE pinned != 0;");
        bs2.B(sQLiteDatabase, "CREATE TABLE user_settings(uid INTEGER PRIMARY KEY, info BLOB, pinned INTEGER)", "CREATE INDEX IF NOT EXISTS user_settings_pinned_idx ON user_settings(uid, pinned) WHERE pinned != 0;", "CREATE TABLE chat_pinned_v2(uid INTEGER, mid INTEGER, data BLOB, PRIMARY KEY (uid, mid));", "CREATE TABLE chat_pinned_count(uid INTEGER PRIMARY KEY, count INTEGER, end INTEGER);");
        bs2.B(sQLiteDatabase, "CREATE TABLE chat_hints(did INTEGER, type INTEGER, rating REAL, date INTEGER, PRIMARY KEY(did, type))", "CREATE INDEX IF NOT EXISTS chat_hints_rating_idx ON chat_hints(rating);", "CREATE TABLE botcache(id TEXT PRIMARY KEY, date INTEGER, data BLOB)", "CREATE INDEX IF NOT EXISTS botcache_date_idx ON botcache(date);");
        bs2.B(sQLiteDatabase, "CREATE TABLE users_data(uid INTEGER PRIMARY KEY, about TEXT)", "CREATE TABLE users(uid INTEGER PRIMARY KEY, name TEXT, status INTEGER, data BLOB)", "CREATE TABLE chats(uid INTEGER PRIMARY KEY, name TEXT, data BLOB)", "CREATE TABLE enc_chats(uid INTEGER PRIMARY KEY, user INTEGER, name TEXT, data BLOB, g BLOB, authkey BLOB, ttl INTEGER, layer INTEGER, seq_in INTEGER, seq_out INTEGER, use_count INTEGER, exchange_id INTEGER, key_date INTEGER, fprint INTEGER, fauthkey BLOB, khash BLOB, in_seq_no INTEGER, admin_id INTEGER, mtproto_seq INTEGER)");
        bs2.B(sQLiteDatabase, "CREATE TABLE channel_users_v2(did INTEGER, uid INTEGER, date INTEGER, data BLOB, PRIMARY KEY(did, uid))", "CREATE TABLE channel_admins_v3(did INTEGER, uid INTEGER, data BLOB, PRIMARY KEY(did, uid))", "CREATE TABLE contacts(uid INTEGER PRIMARY KEY, mutual INTEGER)", "CREATE TABLE dialog_photos(uid INTEGER, id INTEGER, num INTEGER, data BLOB, PRIMARY KEY (uid, id))");
        bs2.B(sQLiteDatabase, "CREATE TABLE dialog_photos_count(uid INTEGER PRIMARY KEY, count INTEGER)", "CREATE TABLE dialog_settings(did INTEGER PRIMARY KEY, flags INTEGER);", "CREATE TABLE web_recent_v3(id TEXT, type INTEGER, image_url TEXT, thumb_url TEXT, local_url TEXT, width INTEGER, height INTEGER, size INTEGER, date INTEGER, document BLOB, PRIMARY KEY (id, type));", "CREATE TABLE stickers_v2(id INTEGER PRIMARY KEY, data BLOB, date INTEGER, hash INTEGER);");
        bs2.B(sQLiteDatabase, "CREATE TABLE stickers_featured(id INTEGER PRIMARY KEY, data BLOB, unread BLOB, date INTEGER, hash INTEGER, premium INTEGER, emoji INTEGER);", "CREATE TABLE stickers_dice(emoji TEXT PRIMARY KEY, data BLOB, date INTEGER);", "CREATE TABLE hashtag_recent_v2(id TEXT PRIMARY KEY, date INTEGER);", "CREATE TABLE webpage_pending_v2(id INTEGER, mid INTEGER, uid INTEGER, PRIMARY KEY (id, mid, uid));");
        bs2.B(sQLiteDatabase, "CREATE TABLE sent_files_v2(uid TEXT, type INTEGER, data BLOB, parent TEXT, PRIMARY KEY (uid, type))", "CREATE TABLE search_recent(did INTEGER PRIMARY KEY, date INTEGER);", "CREATE TABLE media_counts_v2(uid INTEGER, type INTEGER, count INTEGER, old INTEGER, PRIMARY KEY(uid, type))", "CREATE TABLE keyvalue(id TEXT PRIMARY KEY, value TEXT)");
        bs2.B(sQLiteDatabase, "CREATE TABLE bot_info_v2(uid INTEGER, dialogId INTEGER, info BLOB, PRIMARY KEY(uid, dialogId))", "CREATE TABLE pending_tasks(id INTEGER PRIMARY KEY, data BLOB);", "CREATE TABLE requested_holes(uid INTEGER, seq_out_start INTEGER, seq_out_end INTEGER, PRIMARY KEY (uid, seq_out_start, seq_out_end));", "CREATE TABLE sharing_locations(uid INTEGER PRIMARY KEY, mid INTEGER, date INTEGER, period INTEGER, message BLOB, proximity INTEGER);");
        bs2.B(sQLiteDatabase, "CREATE TABLE stickersets2(id INTEGER PRIMATE KEY, data BLOB, hash INTEGER, date INTEGER, short_name TEXT);", "CREATE INDEX IF NOT EXISTS stickersets2_id_index ON stickersets2(id);", "CREATE INDEX IF NOT EXISTS stickersets2_id_short_name ON stickersets2(id, short_name);", "CREATE INDEX IF NOT EXISTS stickers_featured_emoji_index ON stickers_featured(emoji);");
        bs2.B(sQLiteDatabase, "CREATE TABLE shortcut_widget(id INTEGER, did INTEGER, ord INTEGER, PRIMARY KEY (id, did));", "CREATE INDEX IF NOT EXISTS shortcut_widget_did ON shortcut_widget(did);", "CREATE TABLE emoji_keywords_v2(lang TEXT, keyword TEXT, emoji TEXT, PRIMARY KEY(lang, keyword, emoji));", "CREATE INDEX IF NOT EXISTS emoji_keywords_v2_keyword ON emoji_keywords_v2(keyword);");
        bs2.B(sQLiteDatabase, "CREATE TABLE emoji_keywords_info_v2(lang TEXT PRIMARY KEY, alias TEXT, version INTEGER, date INTEGER);", "CREATE TABLE wallpapers2(uid INTEGER PRIMARY KEY, data BLOB, num INTEGER)", "CREATE INDEX IF NOT EXISTS wallpapers_num ON wallpapers2(num);", "CREATE TABLE unread_push_messages(uid INTEGER, mid INTEGER, random INTEGER, date INTEGER, data BLOB, fm TEXT, name TEXT, uname TEXT, flags INTEGER, topicId INTEGER, is_reaction INTEGER, PRIMARY KEY(uid, mid))");
        bs2.B(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS unread_push_messages_idx_date ON unread_push_messages(date);", "CREATE INDEX IF NOT EXISTS unread_push_messages_idx_random ON unread_push_messages(random);", "CREATE TABLE polls_v2(mid INTEGER, uid INTEGER, id INTEGER, PRIMARY KEY (mid, uid));", "CREATE INDEX IF NOT EXISTS polls_id_v2 ON polls_v2(id);");
        bs2.B(sQLiteDatabase, "CREATE TABLE reactions(data BLOB, hash INTEGER, date INTEGER);", "CREATE TABLE reaction_mentions(message_id INTEGER, state INTEGER, dialog_id INTEGER, PRIMARY KEY(message_id, dialog_id))", "CREATE INDEX IF NOT EXISTS reaction_mentions_did ON reaction_mentions(dialog_id);", "CREATE TABLE downloading_documents(data BLOB, hash INTEGER, id INTEGER, state INTEGER, date INTEGER, PRIMARY KEY(hash, id));");
        bs2.B(sQLiteDatabase, "CREATE TABLE animated_emoji(document_id INTEGER PRIMARY KEY, data BLOB);", "CREATE TABLE attach_menu_bots(data BLOB, hash INTEGER, date INTEGER);", "CREATE TABLE premium_promo(data BLOB, date INTEGER);", "CREATE TABLE emoji_statuses(data BLOB, type INTEGER);");
        bs2.B(sQLiteDatabase, "CREATE TABLE messages_holes_topics(uid INTEGER, topic_id INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, topic_id, start));", "CREATE INDEX IF NOT EXISTS uid_end_messages_holes_4_topics ON messages_holes_topics(uid, topic_id, end);", "CREATE TABLE messages_topics(mid INTEGER, uid INTEGER, topic_id INTEGER, read_state INTEGER, send_state INTEGER, date INTEGER, data BLOB, out INTEGER, ttl INTEGER, media INTEGER, replydata BLOB, imp INTEGER, mention INTEGER, forwards INTEGER, replies_data BLOB, thread_reply_id INTEGER, is_channel INTEGER, reply_to_message_id INTEGER, custom_params BLOB, reply_to_story_id INTEGER, PRIMARY KEY(mid, topic_id, uid))", "CREATE INDEX IF NOT EXISTS uid_date_mid_idx_messages_topics ON messages_topics(uid, date, mid);");
        bs2.B(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS mid_out_idx_messages_topics ON messages_topics(mid, out);", "CREATE INDEX IF NOT EXISTS task_idx_messages_topics ON messages_topics(uid, out, read_state, ttl, date, send_state);", "CREATE INDEX IF NOT EXISTS send_state_idx_messages_topics ON messages_topics(mid, send_state, date);", "CREATE INDEX IF NOT EXISTS is_channel_idx_messages_topics ON messages_topics(mid, is_channel);");
        bs2.B(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS reply_to_idx_messages_topics ON messages_topics(mid, reply_to_message_id);", "CREATE INDEX IF NOT EXISTS idx_to_reply_messages_topics ON messages_topics(reply_to_message_id, mid);", "CREATE INDEX IF NOT EXISTS mid_uid_messages_topics ON messages_topics(mid, uid);", "CREATE INDEX IF NOT EXISTS uid_mid_read_out_idx_messages_topics ON messages_topics(uid, topic_id, mid, read_state, out);");
        bs2.B(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS uid_mention_idx_messages_topics ON messages_topics(uid, topic_id, mention, read_state);", "CREATE INDEX IF NOT EXISTS uid_topic_id_messages_topics ON messages_topics(uid, topic_id);", "CREATE INDEX IF NOT EXISTS uid_topic_id_date_mid_messages_topics ON messages_topics(uid, topic_id, date, mid);", "CREATE INDEX IF NOT EXISTS uid_topic_id_mid_messages_topics ON messages_topics(uid, topic_id, mid);");
        bs2.B(sQLiteDatabase, "CREATE TABLE media_topics(mid INTEGER, uid INTEGER, topic_id INTEGER, date INTEGER, type INTEGER, data BLOB, PRIMARY KEY(mid, uid, topic_id, type))", "CREATE INDEX IF NOT EXISTS uid_mid_type_date_idx_media_topics ON media_topics(uid, topic_id, mid, type, date);", "CREATE TABLE media_holes_topics(uid INTEGER, topic_id INTEGER, type INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, topic_id, type, start));", "CREATE INDEX IF NOT EXISTS uid_end_media_holes_topics ON media_holes_topics(uid, topic_id, type, end);");
        bs2.B(sQLiteDatabase, "CREATE TABLE topics(did INTEGER, topic_id INTEGER, data BLOB, top_message INTEGER, topic_message BLOB, unread_count INTEGER, max_read_id INTEGER, unread_mentions INTEGER, unread_reactions INTEGER, read_outbox INTEGER, pinned INTEGER, total_messages_count INTEGER, hidden INTEGER, edit_date INTEGER, nopaid_messages_exception INTEGER, unread_poll_votes INTEGER, PRIMARY KEY(did, topic_id));", "CREATE INDEX IF NOT EXISTS did_top_message_topics ON topics(did, top_message);", "CREATE INDEX IF NOT EXISTS did_topics ON topics(did);", "CREATE TABLE media_counts_topics(uid INTEGER, topic_id INTEGER, type INTEGER, count INTEGER, old INTEGER, PRIMARY KEY(uid, topic_id, type))");
        bs2.B(sQLiteDatabase, "CREATE TABLE reaction_mentions_topics(message_id INTEGER, state INTEGER, dialog_id INTEGER, topic_id INTEGER, PRIMARY KEY(message_id, dialog_id, topic_id))", "CREATE INDEX IF NOT EXISTS reaction_mentions_topics_did ON reaction_mentions_topics(dialog_id, topic_id);", "CREATE TABLE emoji_groups(type INTEGER PRIMARY KEY, data BLOB)", "CREATE TABLE app_config(data BLOB)");
        bs2.B(sQLiteDatabase, "CREATE TABLE web_browser_settings(data BLOB)", "CREATE TABLE effects(data BLOB)", "CREATE TABLE stories (dialog_id INTEGER, story_id INTEGER, data BLOB, custom_params BLOB, PRIMARY KEY (dialog_id, story_id));", "CREATE TABLE stories_counter (dialog_id INTEGER PRIMARY KEY, count INTEGER, max_read INTEGER);");
        bs2.B(sQLiteDatabase, "CREATE TABLE profile_stories (dialog_id INTEGER, story_id INTEGER, data BLOB, type INTEGER, seen INTEGER, pin INTEGER, PRIMARY KEY(dialog_id, story_id, type));", "CREATE TABLE profile_stories_albums (dialog_id INTEGER, album_id INTEGER, order_index INTEGER, data BLOB, PRIMARY KEY(dialog_id, album_id));", "CREATE TABLE profile_stories_albums_links (dialog_id INTEGER, album_id INTEGER, story_id INTEGER, order_index INTEGER, PRIMARY KEY (dialog_id, album_id, story_id));", "CREATE TABLE story_drafts (id INTEGER PRIMARY KEY, date INTEGER, data BLOB, type INTEGER);");
        bs2.B(sQLiteDatabase, "CREATE TABLE story_pushes (uid INTEGER, sid INTEGER, date INTEGER, localName TEXT, flags INTEGER, expire_date INTEGER, live INTEGER, PRIMARY KEY(uid, sid));", "CREATE TABLE unconfirmed_auth (data BLOB);", "CREATE TABLE saved_reaction_tags (topic_id INTEGER PRIMARY KEY, data BLOB);", "CREATE TABLE tag_message_id(mid INTEGER, topic_id INTEGER, tag INTEGER, text TEXT);");
        bs2.B(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS tag_idx_tag_message_id ON tag_message_id(tag);", "CREATE INDEX IF NOT EXISTS tag_text_idx_tag_message_id ON tag_message_id(tag, text COLLATE NOCASE);", "CREATE INDEX IF NOT EXISTS tag_topic_idx_tag_message_id ON tag_message_id(topic_id, tag);", "CREATE INDEX IF NOT EXISTS tag_topic_text_idx_tag_message_id ON tag_message_id(topic_id, tag, text COLLATE NOCASE);");
        bs2.B(sQLiteDatabase, "CREATE TABLE business_replies(topic_id INTEGER PRIMARY KEY, name TEXT, order_value INTEGER, count INTEGER);", "CREATE TABLE quick_replies_messages(mid INTEGER, topic_id INTEGER, send_state INTEGER, date INTEGER, data BLOB, ttl INTEGER, replydata BLOB, reply_to_message_id INTEGER, PRIMARY KEY(mid, topic_id))", "CREATE INDEX IF NOT EXISTS send_state_idx_quick_replies_messages ON quick_replies_messages(mid, send_state, date);", "CREATE INDEX IF NOT EXISTS topic_date_idx_quick_replies_messages ON quick_replies_messages(topic_id, date);");
        bs2.B(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS reply_to_idx_quick_replies_messages ON quick_replies_messages(mid, reply_to_message_id);", "CREATE INDEX IF NOT EXISTS idx_to_reply_quick_replies_messages ON quick_replies_messages(reply_to_message_id, mid);", "CREATE TABLE welcome_messages(mid INTEGER, dialog_id INTEGER, send_state INTEGER, date INTEGER, data BLOB, ttl INTEGER, replydata BLOB, reply_to_message_id INTEGER, PRIMARY KEY(mid, dialog_id))", "CREATE INDEX IF NOT EXISTS send_state_idx_welcome_messages ON welcome_messages(mid, send_state, date);");
        bs2.B(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS dialog_date_idx_welcome_messages ON welcome_messages(dialog_id, date);", "CREATE INDEX IF NOT EXISTS reply_to_idx_welcome_messages ON welcome_messages(mid, reply_to_message_id);", "CREATE INDEX IF NOT EXISTS idx_to_reply_welcome_messages ON welcome_messages(reply_to_message_id, mid);", "CREATE TABLE business_links(data BLOB, order_value INTEGER);");
        bs2.B(sQLiteDatabase, "CREATE TABLE fact_checks(hash INTEGER PRIMARY KEY, data BLOB, expires INTEGER);", "CREATE TABLE popular_bots(uid INTEGER PRIMARY KEY, time INTEGER, offset TEXT, pos INTEGER);", "CREATE TABLE star_gifts2(id INTEGER PRIMARY KEY, data BLOB, hash INTEGER, time INTEGER, pos INTEGER);", "CREATE TABLE gift_themes (slug TEXT PRIMARY KEY, data BLOB);");
        bs2.B(sQLiteDatabase, "CREATE TABLE poll_votes_mentions(message_id INTEGER, state INTEGER, dialog_id INTEGER, PRIMARY KEY(message_id, dialog_id))", "CREATE INDEX IF NOT EXISTS poll_votes_mentions_did ON poll_votes_mentions(dialog_id);", "CREATE TABLE poll_votes_mentions_topics(message_id INTEGER, state INTEGER, dialog_id INTEGER, topic_id INTEGER, PRIMARY KEY(message_id, dialog_id, topic_id))", "CREATE INDEX IF NOT EXISTS poll_votes_mentions_topics_did ON poll_votes_mentions_topics(dialog_id, topic_id);");
        bs2.B(sQLiteDatabase, "CREATE TABLE ephemeral_messages (id INTEGER, dialog_id INTEGER, topic_id INTEGER, date INTEGER, data BLOB, PRIMARY KEY(dialog_id, id));", "CREATE INDEX IF NOT EXISTS ephemeral_messages_date_idx ON ephemeral_messages(date);", "CREATE TABLE widget_state(uid INTEGER, mid INTEGER, local TEXT, PRIMARY KEY(uid, mid));", "CREATE TABLE widget_heights(uid INTEGER, mid INTEGER, width INTEGER, height INTEGER, date INTEGER, anchor INTEGER default 0, PRIMARY KEY(uid, mid, width));");
        bs2.z(sQLiteDatabase, "CREATE TABLE onchain_offer_intents(slug TEXT, amount INTEGER, duration INTEGER, random_id INTEGER, used_at INTEGER, PRIMARY KEY(slug, amount, duration));", "PRAGMA user_version = 182");
    }

    public final void A(long j, SparseArray sparseArray) {
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                ArrayList arrayList = new ArrayList();
                if (sparseArray.size() != 0) {
                    this.b.beginTransaction();
                    SQLitePreparedStatement executeFast = this.b.executeFast("REPLACE INTO enc_tasks_v4 VALUES(?, ?, ?, ?)");
                    int i = Integer.MAX_VALUE;
                    for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                        try {
                            int keyAt = sparseArray.keyAt(i2);
                            ArrayList arrayList2 = (ArrayList) sparseArray.get(keyAt);
                            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                                int intValue = ((Integer) arrayList2.get(i3)).intValue();
                                executeFast.requery();
                                executeFast.bindInteger(1, intValue);
                                executeFast.bindLong(2, j);
                                executeFast.bindInteger(3, keyAt);
                                executeFast.bindInteger(4, 1);
                                i = Math.min(i, intValue);
                                executeFast.step();
                                arrayList.add((Integer) arrayList2.get(i3));
                            }
                        } catch (Exception e) {
                            e = e;
                            sQLitePreparedStatement = executeFast;
                            n(e, true);
                            SQLiteDatabase sQLiteDatabase = this.b;
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
                            SQLiteDatabase sQLiteDatabase2 = this.b;
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
                    this.b.commitTransaction();
                    SQLiteDatabase sQLiteDatabase3 = this.b;
                    Locale locale = Locale.US;
                    sQLiteDatabase3.executeFast("UPDATE messages_v2 SET ttl = 0 WHERE uid = " + j + " AND mid IN(" + TextUtils.join(", ", arrayList) + ")").stepThis().dispose();
                    getMessagesController().m0(i, j, sparseArray);
                }
                SQLiteDatabase sQLiteDatabase4 = this.b;
                if (sQLiteDatabase4 != null) {
                    sQLiteDatabase4.commitTransaction();
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void A0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf7.A0():void");
    }

    public final void A1(long r21, java.util.List r23, boolean r24, boolean r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf7.A1(long, java.util.List, boolean, boolean, int):void");
    }

    public final void B(ac7 ac7Var) {
        try {
            this.I.remove(ac7Var);
            this.J.remove(ac7Var.a);
            SQLiteDatabase sQLiteDatabase = this.b;
            sQLiteDatabase.executeFast("DELETE FROM dialog_filter WHERE id = " + ac7Var.a).stepThis().dispose();
            SQLiteDatabase sQLiteDatabase2 = this.b;
            sQLiteDatabase2.executeFast("DELETE FROM dialog_filter_ep WHERE id = " + ac7Var.a).stepThis().dispose();
            SQLiteDatabase sQLiteDatabase3 = this.b;
            sQLiteDatabase3.executeFast("DELETE FROM dialog_filter_pin_v2 WHERE id = " + ac7Var.a).stepThis().dispose();
        } catch (Exception e) {
            n(e, true);
        }
    }

    public final void B0(int r49, int r50, int r51, long r52, long r54, org.telegram.tgnet.TLRPC.messages_Messages r56, boolean r57) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf7.B0(int, int, int, long, long, org.telegram.tgnet.TLRPC$messages_Messages, boolean):void");
    }

    public final void B1(long j, long j2) {
        this.a.c(new xd7(this, j, j2, (byte) 4));
    }

    public final void C(java.util.ArrayList r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf7.C(java.util.ArrayList, boolean):void");
    }

    public final TLRPC.ChatFull C0(final long j, final boolean z, final CountDownLatch countDownLatch, final boolean z2, final boolean z3, final int i) {
        final TLRPC.ChatFull[] chatFullArr = new TLRPC.ChatFull[1];
        this.a.c(new Runnable(chatFullArr, j, z, z2, z3, i, countDownLatch) {
            public final TLRPC.ChatFull[] b;
            public final long c;
            public final boolean d;
            public final boolean e;
            public final boolean f;
            public final CountDownLatch h;

            {
                this.h = countDownLatch;
            }

            @Override
            public final void run() {
                this.b[0] = jf7.this.D0(this.c, this.d, this.e, this.f);
                CountDownLatch countDownLatch2 = this.h;
                if (countDownLatch2 != null) {
                    countDownLatch2.countDown();
                }
            }
        });
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (Throwable unused) {
            }
        }
        return chatFullArr[0];
    }

    public final void C1(long j, boolean z) {
        this.a.c(new ge7(this, j, z, (byte) 0));
    }

    public final void D(ArrayList arrayList, long j) {
        try {
            SQLiteDatabase sQLiteDatabase = this.b;
            Locale locale = Locale.US;
            String join = TextUtils.join(",", arrayList);
            sQLiteDatabase.executeFast("DELETE FROM unread_push_messages WHERE uid = " + j + " AND mid IN(" + join + ")").stepThis().dispose();
        } catch (Exception e) {
            n(e, true);
        }
    }

    public final org.telegram.tgnet.TLRPC.ChatFull D0(final long r27, boolean r29, final boolean r30, final boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf7.D0(long, boolean, boolean, boolean):org.telegram.tgnet.TLRPC$ChatFull");
    }

    public final void D1(ArrayList arrayList, ArrayList arrayList2, long j, int i) {
        if (arrayList == null && arrayList2 == null && j == 0) {
            return;
        }
        this.a.c(new wy(this, arrayList, arrayList2, i, j, (byte) 8));
    }

    public final void E(int r19, int r20, long r21, long r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf7.E(int, int, long, long):void");
    }

    public final org.telegram.tgnet.TLRPC.TL_messages_dialogs E0(java.util.ArrayList r22, java.util.ArrayList r23, java.util.ArrayList r24, java.lang.String r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf7.E0(java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.lang.String):org.telegram.tgnet.TLRPC$TL_messages_dialogs");
    }

    public final void E1(int i) {
        G();
        this.n = i;
    }

    public final void F(int i, long j, long j2, String str) {
        SQLitePreparedStatement executeFast;
        int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        SQLiteDatabase sQLiteDatabase = this.b;
        int i3 = 2;
        if (i2 != 0) {
            if (i == 0) {
                sQLiteDatabase.executeFast(String.format(Locale.US, qd4.y("DELETE FROM ", str, " WHERE uid = %d AND topic_id = %d"), Long.valueOf(j), Long.valueOf(j2))).stepThis().dispose();
            } else {
                sQLiteDatabase.executeFast(String.format(Locale.US, qd4.y("DELETE FROM ", str, " WHERE uid = %d AND topic_id = %d AND start = 0"), Long.valueOf(j), Long.valueOf(j2))).stepThis().dispose();
            }
        } else if (i == 0) {
            sQLiteDatabase.executeFast(String.format(Locale.US, qd4.y("DELETE FROM ", str, " WHERE uid = %d"), Long.valueOf(j))).stepThis().dispose();
        } else {
            sQLiteDatabase.executeFast(String.format(Locale.US, qd4.y("DELETE FROM ", str, " WHERE uid = %d AND start = 0"), Long.valueOf(j))).stepThis().dispose();
        }
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase2 = this.b;
                if (i2 != 0) {
                    executeFast = sQLiteDatabase2.executeFast("REPLACE INTO " + str + " VALUES(?, ?, ?, ?)");
                } else {
                    executeFast = sQLiteDatabase2.executeFast("REPLACE INTO " + str + " VALUES(?, ?, ?)");
                }
                sQLitePreparedStatement = executeFast;
                sQLitePreparedStatement.requery();
                sQLitePreparedStatement.bindLong(1, j);
                if (i2 != 0) {
                    sQLitePreparedStatement.bindLong(2, j2);
                    i3 = 3;
                }
                sQLitePreparedStatement.bindInteger(i3, 1);
                sQLitePreparedStatement.bindInteger(i3 + 1, 1);
                sQLitePreparedStatement.step();
                sQLitePreparedStatement.dispose();
            } catch (Exception e) {
                throw e;
            }
        } catch (Throwable th) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    public final void F0(ArrayList arrayList) {
        try {
            zh6 zh6Var = new zh6();
            for (int i = 0; i < arrayList.size(); i++) {
                if (!((nyb) arrayList.get(i)).i && !((nyb) arrayList.get(i)).j && ((nyb) arrayList.get(i)).g != null) {
                    long j = ((nyb) arrayList.get(i)).g.grouped_id;
                    if (j != 0) {
                        ArrayList arrayList2 = (ArrayList) zh6Var.f(j);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            zh6Var.k(j, arrayList2);
                        }
                        arrayList2.add((nyb) arrayList.get(i));
                    }
                }
            }
            for (int i2 = 0; i2 < zh6Var.m(); i2++) {
                long j2 = zh6Var.j(i2);
                ArrayList arrayList3 = (ArrayList) zh6Var.n(i2);
                SQLiteDatabase sQLiteDatabase = this.b;
                Locale locale = Locale.US;
                SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + ((nyb) arrayList3.get(0)).b + " AND group_id = " + j2 + " ORDER BY date DESC", new Object[0]);
                ArrayList arrayList4 = null;
                while (queryFinalized.next()) {
                    NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    if (TLdeserialize != null) {
                        TLdeserialize.readAttachPath(byteBufferValue, yac.h(this.currentAccount).n);
                    }
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList4.add(new r47(this.currentAccount, TLdeserialize, false, false));
                }
                queryFinalized.dispose();
                for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                    ((nyb) arrayList3.get(i3)).h = arrayList4;
                }
            }
        } catch (Throwable th) {
            n(th, true);
        }
    }

    public final void F1(int i) {
        G();
        this.r = i;
    }

    public final void G() {
        try {
            this.Q.await();
        } catch (Throwable unused) {
        }
    }

    public final void G0(ArrayList arrayList, long j) {
        if (arrayList != null) {
            try {
                zh6 zh6Var = new zh6();
                for (int i = 0; i < arrayList.size(); i++) {
                    if (((TLRPC.TL_forumTopic) arrayList.get(i)).topMessage != null) {
                        long j2 = ((TLRPC.TL_forumTopic) arrayList.get(i)).topMessage.grouped_id;
                        if (j2 != 0) {
                            ArrayList arrayList2 = (ArrayList) zh6Var.f(j2);
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                                zh6Var.k(j2, arrayList2);
                            }
                            arrayList2.add((TLRPC.TL_forumTopic) arrayList.get(i));
                        }
                    }
                }
                for (int i2 = 0; i2 < zh6Var.m(); i2++) {
                    long j3 = zh6Var.j(i2);
                    ArrayList arrayList3 = (ArrayList) zh6Var.n(i2);
                    SQLiteDatabase sQLiteDatabase = this.b;
                    Locale locale = Locale.US;
                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j + " AND group_id = " + j3 + " ORDER BY date DESC", new Object[0]);
                    ArrayList<r47> arrayList4 = null;
                    while (queryFinalized.next()) {
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        if (TLdeserialize != null) {
                            TLdeserialize.readAttachPath(byteBufferValue, yac.h(this.currentAccount).n);
                        }
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList<>();
                        }
                        arrayList4.add(new r47(this.currentAccount, TLdeserialize, false, false));
                    }
                    queryFinalized.dispose();
                    for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                        ((TLRPC.TL_forumTopic) arrayList3.get(i3)).groupedMessages = arrayList4;
                    }
                }
            } catch (Throwable th) {
                n(th, true);
            }
        }
    }

    public final void G1(int i) {
        G();
        this.s = i;
    }

    public final void H(Runnable runnable) {
        Thread currentThread = Thread.currentThread();
        to3 to3Var = this.a;
        if (currentThread != to3Var) {
            to3Var.c(runnable);
        } else {
            runnable.run();
        }
    }

    public final void H0(defpackage.zh6 r22, defpackage.zh6 r23, java.util.ArrayList r24, java.util.ArrayList r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf7.H0(zh6, zh6, java.util.ArrayList, java.util.ArrayList, int):void");
    }

    public final void H1(int i) {
        G();
        this.w = i;
    }

    public final ArrayList I0(HashSet hashSet) {
        ArrayList arrayList = new ArrayList();
        try {
            String join = TextUtils.join(",", hashSet);
            SQLiteDatabase sQLiteDatabase = this.b;
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
        } catch (Exception e) {
            n(e, true);
            return arrayList;
        }
    }

    public final void J0(int r32, java.lang.String r33, java.util.ArrayList r34, java.util.ArrayList r35, java.util.ArrayList r36, java.util.ArrayList r37, int r38) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf7.J0(int, java.lang.String, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, int):void");
    }

    public final void J1(long j, TLRPC.TL_chatBannedRights tL_chatBannedRights, int i) {
        if (tL_chatBannedRights != null && j != 0) {
            this.a.c(new r77(this, j, i, tL_chatBannedRights, (byte) 12));
        }
    }

    public final void K(String str, ArrayList arrayList) {
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = this.b;
                Locale locale = Locale.US;
                sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT data FROM animated_emoji WHERE document_id IN (" + str + ")", new Object[0]);
                while (sQLiteCursor.next()) {
                    NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                    try {
                        TLRPC.Document TLdeserialize = TLRPC.Document.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true);
                        if (TLdeserialize != null && TLdeserialize.id != 0) {
                            arrayList.add(TLdeserialize);
                        }
                    } catch (Exception e) {
                        n(e, true);
                    }
                    if (byteBufferValue != null) {
                        byteBufferValue.reuse();
                    }
                }
            } catch (SQLiteException e2) {
                e2.printStackTrace();
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

    public final void K0(int i, TLRPC.Message message) {
        this.a.c(new ze7(this, i, message, (byte) 0));
    }

    public final void K1(TLRPC.ChatFull chatFull, boolean z) {
        this.a.c(new yn6(this, chatFull, z, (byte) 3));
    }

    public final void L(String str, RequestDelegate requestDelegate) {
        this.a.c(new y36(this, getConnectionsManager().getCurrentTime(), str, requestDelegate, (byte) 12));
    }

    public final void L0(java.lang.String r19, java.lang.String r20, long r21, long r23, int r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf7.L0(java.lang.String, java.lang.String, long, long, int, boolean):void");
    }

    public final void L1(TLRPC.ChatParticipants chatParticipants) {
        if (chatParticipants == null) {
            return;
        }
        this.a.c(new t87(this, chatParticipants, (byte) 17));
    }

    public final int M(long j) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Integer[] numArr = {0};
        this.a.c(new ba7(this, j, numArr, countDownLatch, (byte) 24));
        try {
            countDownLatch.await();
        } catch (Exception e) {
            n(e, true);
        }
        return numArr[0].intValue();
    }

    public final ArrayList M0(long j, ArrayList arrayList, boolean z, boolean z2, int i, int i2) {
        if (arrayList.isEmpty()) {
            return null;
        }
        if (z) {
            this.a.c(new uv1(this, j, arrayList, z2, i, i2));
            return null;
        }
        return N0(i, i2, j, arrayList, z2);
    }

    public final void M1(int i) {
        hl.c3(new be7(this, (byte) 4));
        cc4.b("MessagesStorage start db migration from " + i + " to 182");
        int c = b93.c(this, this.b, i);
        cc4.b("MessagesStorage db migration finished to varsion " + c);
        hl.c3(new be7(this, (byte) 5));
    }

    public final TLRPC.Chat N(long j) {
        try {
            ArrayList arrayList = new ArrayList();
            P(String.valueOf(j), arrayList);
            if (arrayList.isEmpty()) {
                return null;
            }
            return (TLRPC.Chat) arrayList.get(0);
        } catch (Exception e) {
            n(e, true);
            return null;
        }
    }

    public final java.util.ArrayList N0(int r47, int r48, long r49, java.util.ArrayList r51, boolean r52) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf7.N0(int, int, long, java.util.ArrayList, boolean):java.util.ArrayList");
    }

    public final void N1(long j, int i, boolean z, boolean z2) {
        String str;
        if (z2) {
            str = "unread_reactions";
        } else {
            str = "unread_poll_votes";
        }
        String str2 = str;
        this.a.c(new kn3(this, z, str2, j, i, str2));
    }

    public final TLRPC.Chat O(long j) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        TLRPC.Chat[] chatArr = new TLRPC.Chat[1];
        this.a.c(new ba7(this, chatArr, j, countDownLatch, (byte) 25));
        try {
            countDownLatch.await();
        } catch (Exception e) {
            n(e, true);
        }
        return chatArr[0];
    }

    public final void O0(LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray) {
        this.a.c(new oy6(this, longSparseIntArray, longSparseIntArray2, sparseIntArray, (byte) 9));
    }

    public final void O1(long j, long j2, ArrayList arrayList, ArrayList arrayList2) {
        H(new hv4(this, j, j2, arrayList, arrayList2, (byte) 8));
    }

    public final void P(String str, ArrayList arrayList) {
        if (str != null && str.length() != 0 && arrayList != null) {
            SQLiteDatabase sQLiteDatabase = this.b;
            Locale locale = Locale.US;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(qd4.y("SELECT data FROM chats WHERE uid IN(", str, ")"), new Object[0]);
            ArrayList arrayList2 = null;
            while (queryFinalized.next()) {
                try {
                    NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                    if (byteBufferValue != null) {
                        TLRPC.Chat TLdeserialize = TLRPC.Chat.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false, true);
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
                } catch (Exception e) {
                    n(e, true);
                }
            }
            queryFinalized.dispose();
            if (arrayList2 != null) {
                SQLiteDatabase sQLiteDatabase2 = this.b;
                Locale locale2 = Locale.US;
                SQLiteCursor queryFinalized2 = sQLiteDatabase2.queryFinalized(qd4.y("SELECT data FROM chats WHERE uid IN(", TextUtils.join(", ", arrayList2), ")"), new Object[0]);
                while (queryFinalized2.next()) {
                    try {
                        NativeByteBuffer byteBufferValue2 = queryFinalized2.byteBufferValue(0);
                        if (byteBufferValue2 != null) {
                            TLRPC.Chat TLdeserialize2 = TLRPC.Chat.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false, true);
                            byteBufferValue2.reuse();
                            if (TLdeserialize2 != null) {
                                arrayList.add(TLdeserialize2);
                            }
                        }
                    } catch (Exception e2) {
                        n(e2, true);
                    }
                }
                queryFinalized2.dispose();
            }
        }
    }

    public final void P0(int i, int i2, long j, ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            this.a.c(new c70(i2, i, j, this, arrayList));
        }
    }

    public final void P1(long r24, long r26, java.util.ArrayList r28, java.util.ArrayList r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf7.P1(long, long, java.util.ArrayList, java.util.ArrayList):void");
    }

    public final long Q() {
        long j;
        File file = this.c;
        if (file != null) {
            j = file.length();
        } else {
            j = 0;
        }
        File file2 = this.e;
        if (file2 != null) {
            return file2.length() + j;
        }
        return j;
    }

    public final void Q0(int r11, long r12, java.util.ArrayList r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf7.Q0(int, long, java.util.ArrayList):void");
    }

    public final void Q1(LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, zh6 zh6Var, LongSparseIntArray longSparseIntArray3) {
        if (q0(longSparseIntArray) && q0(longSparseIntArray2) && p0(zh6Var) && q0(longSparseIntArray3)) {
            return;
        }
        this.a.c(new tw4(this, longSparseIntArray, longSparseIntArray2, zh6Var, longSparseIntArray3, (byte) 28));
    }

    public final int R(long j) {
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                int i = -1;
                if (this.K.f(j) == null) {
                    sQLiteCursor = this.b.queryFinalized("SELECT folder_id FROM dialogs WHERE did = ?", Long.valueOf(j));
                    if (sQLiteCursor.next()) {
                        i = sQLiteCursor.intValue(0);
                    }
                    sQLiteCursor.dispose();
                }
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
                return i;
            } catch (Exception e) {
                n(e, true);
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
                return 0;
            }
        } catch (Throwable th) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    public final void R0(ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            hl.c3(new q41(this, arrayList, (byte) 6));
        }
    }

    public final void R1(java.util.ArrayList r26, org.telegram.messenger.support.LongSparseIntArray r27, org.telegram.messenger.support.LongSparseIntArray r28, defpackage.zh6 r29, org.telegram.messenger.support.LongSparseIntArray r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf7.R1(java.util.ArrayList, org.telegram.messenger.support.LongSparseIntArray, org.telegram.messenger.support.LongSparseIntArray, zh6, org.telegram.messenger.support.LongSparseIntArray):void");
    }

    public final int S(long j, boolean z) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Integer[] numArr = {0};
        this.a.c(new re2(this, z, j, numArr, countDownLatch));
        try {
            countDownLatch.await();
        } catch (Exception e) {
            n(e, true);
        }
        return numArr[0].intValue();
    }

    public final void S0(int i) {
        if (!ok7.a) {
            int i2 = 0;
            while (!ok7.a) {
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i2++;
                if (i2 > 5) {
                    break;
                }
            }
        }
        File h = a.h();
        if (this.currentAccount != 0) {
            File file = new File(h, uh9.l(new StringBuilder("account"), this.currentAccount, "/"));
            file.mkdirs();
            h = file;
        }
        this.c = new File(h, "cache4.db");
        this.d = new File(h, "cache4.db-wal");
        this.e = new File(h, "cache4.db-shm");
        this.P = false;
        boolean exists = this.c.exists();
        int i3 = 3;
        try {
            SQLiteDatabase sQLiteDatabase = new SQLiteDatabase(this.c.getPath());
            this.b = sQLiteDatabase;
            sQLiteDatabase.executeFast("PRAGMA secure_delete = ON").stepThis().dispose();
            this.b.executeFast("PRAGMA temp_store = MEMORY").stepThis().dispose();
            this.b.executeFast("PRAGMA journal_mode = WAL").stepThis().dispose();
            this.b.executeFast("PRAGMA journal_size_limit = 10485760").stepThis().dispose();
            if (!exists) {
                if (f11.a) {
                    cc4.b("create new database");
                }
                z(this.b);
            } else {
                int intValue = this.b.executeInt("PRAGMA user_version", new Object[0]).intValue();
                if (f11.a) {
                    cc4.b("current db version = " + intValue);
                }
                if (intValue != 0) {
                    try {
                        SQLiteCursor queryFinalized = this.b.queryFinalized("SELECT seq, pts, date, qts, lsv, sg, pbytes FROM params WHERE id = 1", new Object[0]);
                        if (queryFinalized.next()) {
                            this.w = queryFinalized.intValue(0);
                            this.r = queryFinalized.intValue(1);
                            this.n = queryFinalized.intValue(2);
                            this.s = queryFinalized.intValue(3);
                            this.x = queryFinalized.intValue(4);
                            this.E = queryFinalized.intValue(5);
                            if (queryFinalized.isNull(6)) {
                                this.y = null;
                            } else {
                                byte[] byteArrayValue = queryFinalized.byteArrayValue(6);
                                this.y = byteArrayValue;
                                if (byteArrayValue != null && byteArrayValue.length == 1) {
                                    this.y = null;
                                }
                            }
                        }
                        queryFinalized.dispose();
                    } catch (Exception e2) {
                        cc4.g(e2, true);
                        if (e2.getMessage() != null && e2.getMessage().contains("malformed")) {
                            throw new RuntimeException("malformed");
                        }
                        try {
                            this.b.executeFast("CREATE TABLE IF NOT EXISTS params(id INTEGER PRIMARY KEY, seq INTEGER, pts INTEGER, date INTEGER, qts INTEGER, lsv INTEGER, sg INTEGER, pbytes BLOB)").stepThis().dispose();
                            this.b.executeFast("INSERT INTO params VALUES(1, 0, 0, 0, 0, 0, 0, NULL)").stepThis().dispose();
                        } catch (Exception e3) {
                            cc4.g(e3, true);
                        }
                    }
                    if (intValue < 182) {
                        try {
                            M1(intValue);
                        } catch (Exception e4) {
                            boolean z = f11.a;
                            cc4.g(e4, true);
                            throw new RuntimeException("malformed");
                        }
                    }
                } else {
                    throw new Exception("malformed");
                }
            }
            this.P = true;
        } catch (Exception e5) {
            cc4.g(e5, true);
            if (i < 3 && e5.getMessage() != null && e5.getMessage().contains("malformed")) {
                if (i == 2) {
                    o(true);
                    r();
                } else {
                    o(false);
                }
                if (i == 1) {
                    i3 = 2;
                }
                S0(i3);
                return;
            }
        }
        hl.c3(new be7(this, (byte) 2));
        this.a.c(new be7(this, (byte) 26));
        this.a.c(new be7(this, (byte) 21));
        this.a.c(new be7(this, (byte) 27));
        try {
            this.Q.countDown();
        } catch (Throwable unused) {
        }
        hl.c3(new be7(this, (byte) 3));
    }

    public final void S1(TLRPC.EncryptedChat encryptedChat) {
        if (encryptedChat == null) {
            return;
        }
        this.a.c(new id7(this, encryptedChat, (byte) 1));
    }

    public final void T(String str, ArrayList arrayList, ArrayList arrayList2) {
        if (str != null && str.length() != 0) {
            SQLiteDatabase sQLiteDatabase = this.b;
            Locale locale = Locale.US;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(qd4.y("SELECT data, user, g, authkey, ttl, layer, seq_in, seq_out, use_count, exchange_id, key_date, fprint, fauthkey, khash, in_seq_no, admin_id, mtproto_seq FROM enc_chats WHERE uid IN(", str, ")"), new Object[0]);
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
                } catch (Exception e) {
                    n(e, true);
                }
            }
            queryFinalized.dispose();
        }
    }

    public final void T0(ArrayList arrayList, m77 m77Var) {
        if (arrayList.isEmpty()) {
            return;
        }
        H(new fd7(this, arrayList, m77Var, (byte) 0));
    }

    public final void T1(org.telegram.messenger.support.LongSparseIntArray r31, org.telegram.messenger.support.LongSparseIntArray r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf7.T1(org.telegram.messenger.support.LongSparseIntArray, org.telegram.messenger.support.LongSparseIntArray, boolean):void");
    }

    public final org.telegram.tgnet.tl.TL_ephemeral.EphemeralMessage U(int r5, long r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf7.U(int, long):org.telegram.tgnet.tl.TL_ephemeral$EphemeralMessage");
    }

    public final void U0(ArrayList arrayList, l77 l77Var) {
        if (arrayList.isEmpty()) {
            return;
        }
        H(new fd7(this, arrayList, l77Var, (byte) 7));
    }

    public final void U1(long j, TLRPC.Message message) {
        this.a.c(new cq6(this, message, j, (byte) 13));
    }

    public final ArrayList V(long j, long j2) {
        ArrayList arrayList = new ArrayList();
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                sQLiteCursor = this.b.queryFinalized("SELECT data FROM ephemeral_messages WHERE dialog_id = ? AND topic_id = ? AND date >= ? ORDER BY date DESC LIMIT 30", Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(getConnectionsManager().getCurrentTime() - 172800));
                while (sQLiteCursor.next()) {
                    TL_ephemeral.EphemeralMessage ephemeralMessage = (TL_ephemeral.EphemeralMessage) sQLiteCursor.tlObjectValue(0, new hz6((byte) 14), false);
                    if (ephemeralMessage != null && ephemeralMessage.anchor_msg_id == 0) {
                        arrayList.add(ephemeralMessage);
                    }
                }
                sQLiteCursor.dispose();
                return arrayList;
            } catch (Exception e) {
                n(e, true);
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

    public final void V0(TLRPC.TL_messages_dialogs tL_messages_dialogs, TLRPC.TL_messages_dialogs tL_messages_dialogs2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SparseArray sparseArray, ArrayList arrayList4, HashMap hashMap, HashSet hashSet, Runnable runnable) {
        int i;
        j1(arrayList, arrayList2, true, false);
        int size = sparseArray.size();
        int i2 = 0;
        boolean z = false;
        while (i2 < size) {
            B((ac7) sparseArray.valueAt(i2));
            i2++;
            z = true;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ac7 ac7Var = (ac7) this.J.get(((Integer) it.next()).intValue());
            if (ac7Var != null) {
                ac7Var.e = -1;
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            ac7 ac7Var2 = (ac7) this.J.get(((Integer) entry.getKey()).intValue());
            if (ac7Var2 != null) {
                Iterator it2 = ((HashSet) entry.getValue()).iterator();
                while (it2.hasNext()) {
                    ac7Var2.j.delete(((Long) it2.next()).longValue());
                }
                z = true;
            }
        }
        int size2 = arrayList3.size();
        int i3 = 0;
        while (i3 < size2) {
            u1((ac7) arrayList3.get(i3), false);
            i3++;
            z = true;
        }
        int size3 = this.I.size();
        boolean z2 = false;
        for (int i4 = 0; i4 < size3; i4++) {
            ac7 ac7Var3 = (ac7) this.I.get(i4);
            int indexOf = arrayList4.indexOf(Integer.valueOf(ac7Var3.a));
            if (ac7Var3.f != indexOf) {
                ac7Var3.f = indexOf;
                z2 = true;
                z = true;
            }
        }
        if (z2) {
            Collections.sort(this.I, new vk6((byte) 25));
            w1();
        }
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        i(true);
        uc7 messagesController = getMessagesController();
        ArrayList arrayList5 = new ArrayList(this.I);
        messagesController.getClass();
        Utilities.d.c(new oa7(messagesController, tL_messages_dialogs, null, tL_messages_dialogs2, i, arrayList5, arrayList, arrayList2, runnable));
    }

    public final void V1(long j, TLRPC.Poll poll, TLRPC.PollResults pollResults) {
        this.a.c(new ba7(this, j, poll, pollResults, (byte) 27));
    }

    public final ArrayList W(ArrayList arrayList, long j) {
        ArrayList arrayList2 = new ArrayList();
        if (!arrayList.isEmpty()) {
            SQLiteCursor sQLiteCursor = null;
            try {
                try {
                    SQLiteDatabase sQLiteDatabase = this.b;
                    Locale locale = Locale.US;
                    String join = TextUtils.join(",", arrayList);
                    sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT data FROM ephemeral_messages WHERE dialog_id = " + j + " AND id IN (" + join + ")", new Object[0]);
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
                } catch (Exception e) {
                    n(e, true);
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

    public final void W0(HashMap hashMap, boolean z, boolean z2) {
        if (hashMap.isEmpty() && !z && !z2) {
            return;
        }
        this.a.c(new ds6(this, hashMap, z, (byte) 2));
    }

    public final void W1(long j, int i, TLRPC.TL_messageReactions tL_messageReactions) {
        this.a.c(new r77(this, i, j, tL_messageReactions, (byte) 13));
    }

    public final int X(long j) {
        LongSparseIntArray longSparseIntArray = this.S;
        int i = longSparseIntArray.get(j, -1);
        if (i == -1) {
            i = 0;
            if (j < 0) {
                TLRPC.Chat N = N(-j);
                if (N != null && N.forum) {
                    i = N.forum_tabs ? 3 : 1;
                }
                if (N != null && N.monoforum) {
                    i |= 4;
                }
            } else {
                TLRPC.User g02 = g0(j);
                if (g02 != null && g02.bot_forum_view) {
                    i = 8;
                }
            }
            longSparseIntArray.put(j, i);
        }
        return i;
    }

    public final void X0(zh6 zh6Var, zh6 zh6Var2, zh6 zh6Var3, boolean z) {
        if (p0(zh6Var) && p0(zh6Var2) && p0(zh6Var3)) {
            return;
        }
        this.a.c(new va7(this, zh6Var, zh6Var2, zh6Var3, z, (byte) 14));
    }

    public final long[] X1(long r35, long r37, java.lang.Integer r39, int r40, int r41, int r42, int r43) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf7.X1(long, long, java.lang.Integer, int, int, int, int):long[]");
    }

    public final void Y0(List list) {
        if (list != null && !list.isEmpty()) {
            SQLitePreparedStatement executeFast = this.b.executeFast("REPLACE INTO chats VALUES(?, ?, ?)");
            for (int i = 0; i < list.size(); i++) {
                TLRPC.Chat chat = (TLRPC.Chat) list.get(i);
                if (chat.min) {
                    SQLiteDatabase sQLiteDatabase = this.b;
                    Locale locale = Locale.US;
                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(qu6.n(chat.id, "SELECT data FROM chats WHERE uid = "), new Object[0]);
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
                                    if (vsd.a(chat.flags2, 1048576)) {
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
                                    int i2 = chat.participants_count;
                                    if (i2 > 0) {
                                        TLdeserialize.participants_count = i2;
                                    }
                                    chat = TLdeserialize;
                                }
                            }
                        } catch (Exception e) {
                            cc4.g(e, true);
                        }
                    }
                    queryFinalized.dispose();
                }
                executeFast.requery();
                chat.flags |= 131072;
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(chat.getObjectSize());
                chat.serializeToStream(nativeByteBuffer);
                executeFast.bindLong(1, chat.id);
                String str2 = chat.title;
                if (str2 != null) {
                    executeFast.bindString(2, str2.toLowerCase());
                } else {
                    executeFast.bindString(2, "");
                }
                executeFast.bindByteBuffer(3, nativeByteBuffer);
                executeFast.step();
                nativeByteBuffer.reuse();
                this.S.delete(-chat.id);
            }
            executeFast.dispose();
        }
    }

    public final void Y1(final int i, final long j, final long j2, final String str, final boolean z) {
        this.a.c(new Runnable() {
            @Override
            public final void run() {
                TLRPC.TL_message c0;
                SQLitePreparedStatement executeFast;
                jf7 jf7Var = jf7.this;
                int i2 = i;
                long j3 = j;
                boolean z2 = z;
                long j4 = j2;
                String str2 = str;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        jf7Var.b.beginTransaction();
                        c0 = jf7Var.c0(i2, j3);
                        c0.voiceTranscriptionFinal = z2;
                        c0.voiceTranscriptionId = j4;
                        c0.voiceTranscription = str2;
                        c0.voiceTranscriptionLocal = false;
                        c0.voiceTranscriptionWords = null;
                        executeFast = jf7Var.b.executeFast("UPDATE messages_v2 SET custom_params = ? WHERE mid = ? AND uid = ?");
                    } catch (Exception e) {
                        e = e;
                    }
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    executeFast.requery();
                    NativeByteBuffer c = s37.c(c0);
                    if (c != null) {
                        executeFast.bindByteBuffer(1, c);
                    } else {
                        executeFast.bindNull(1);
                    }
                    executeFast.bindInteger(2, i2);
                    executeFast.bindLong(3, j3);
                    executeFast.step();
                    executeFast.dispose();
                    jf7Var.b.commitTransaction();
                    if (c != null) {
                        c.reuse();
                    }
                    SQLiteDatabase sQLiteDatabase = jf7Var.b;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.commitTransaction();
                    }
                } catch (Exception e2) {
                    e = e2;
                    sQLitePreparedStatement = executeFast;
                    jf7Var.n(e, true);
                    SQLiteDatabase sQLiteDatabase2 = jf7Var.b;
                    if (sQLiteDatabase2 != null) {
                        sQLiteDatabase2.commitTransaction();
                    }
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    sQLitePreparedStatement = executeFast;
                    SQLiteDatabase sQLiteDatabase3 = jf7Var.b;
                    if (sQLiteDatabase3 != null) {
                        sQLiteDatabase3.commitTransaction();
                    }
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th;
                }
            }
        });
    }

    public final TLRPC.Message Z(long j, long j2) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        this.a.c(new hv4(this, j, j2, atomicReference, countDownLatch, (byte) 7));
        try {
            countDownLatch.await();
        } catch (Exception e) {
            n(e, true);
        }
        return (TLRPC.Message) atomicReference.get();
    }

    public final void Z0(ArrayList arrayList, boolean z) {
        if (arrayList.isEmpty() && !z) {
            return;
        }
        this.a.c(new dd7(this, z, new ArrayList(arrayList)));
    }

    public final void Z1(final long j, final ArrayList arrayList, final boolean z, final int i, final int i2, final boolean z2, final HashMap hashMap) {
        this.a.c(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ye7.run():void");
            }
        });
    }

    public final boolean a(org.telegram.tgnet.TLRPC.Message r11, java.util.ArrayList r12, java.util.ArrayList r13, java.util.ArrayList r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf7.a(org.telegram.tgnet.TLRPC$Message, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, boolean):boolean");
    }

    public final TLRPC.Message a0(long j, long j2) {
        TLRPC.Message message;
        SQLiteCursor sQLiteCursor = null;
        TLRPC.Message message2 = null;
        SQLiteCursor sQLiteCursor2 = null;
        try {
            try {
                SQLiteCursor queryFinalized = this.b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j + " AND mid = " + j2 + " LIMIT 1", new Object[0]);
                while (queryFinalized.next()) {
                    try {
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                        if (byteBufferValue != null) {
                            TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            if (TLdeserialize != null) {
                                TLdeserialize.readAttachPath(byteBufferValue, getUserConfig().n);
                            }
                            byteBufferValue.reuse();
                            message2 = TLdeserialize;
                        }
                    } catch (Exception e) {
                        e = e;
                        TLRPC.Message message3 = message2;
                        sQLiteCursor = queryFinalized;
                        message = message3;
                        n(e, true);
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
        } catch (Exception e2) {
            e = e2;
            message = null;
        }
    }

    public final void a1(TLRPC.messages_Dialogs messages_dialogs, int i) {
        if (messages_dialogs.dialogs.isEmpty()) {
            return;
        }
        this.a.c(new sb4(this, messages_dialogs, i, (byte) 11));
    }

    public final void a2(int i, int i2, long j, long j2) {
        this.a.c(new x15(this, j, j2, i, i2, (byte) 2));
    }

    public final void b1(org.telegram.tgnet.TLRPC.messages_Dialogs r31, int r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf7.b1(org.telegram.tgnet.TLRPC$messages_Dialogs, int):void");
    }

    public final void b2(final int r23, int r24, final long r25, final long r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf7.b2(int, int, long, long):void");
    }

    public final TLRPC.TL_message c0(int i, long j) {
        SQLiteCursor queryFinalized;
        boolean z;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                queryFinalized = this.b.queryFinalized("SELECT custom_params FROM messages_v2 WHERE mid = ? AND uid = ?", Integer.valueOf(i), Long.valueOf(j));
            } catch (SQLiteException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (queryFinalized.next()) {
                s37.b(tL_message, queryFinalized.byteBufferValue(0));
                z = true;
            } else {
                z = false;
            }
            queryFinalized.dispose();
            if (!z) {
                sQLiteCursor = this.b.queryFinalized("SELECT custom_params FROM messages_topics WHERE mid = ? AND uid = ?", Integer.valueOf(i), Long.valueOf(j));
                if (sQLiteCursor.next()) {
                    s37.b(tL_message, sQLiteCursor.byteBufferValue(0));
                }
                sQLiteCursor.dispose();
                return tL_message;
            }
        } catch (SQLiteException e2) {
            e = e2;
            sQLiteCursor = queryFinalized;
            n(e, true);
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

    public final void c1(ArrayList arrayList, boolean z) {
        if (arrayList.isEmpty()) {
            return;
        }
        H(new dd7(this, arrayList, z, (byte) 1));
    }

    public final void c2(long j, TLRPC.TL_forumTopic tL_forumTopic, int i) {
        int currentTime = getConnectionsManager().getCurrentTime();
        if (tL_forumTopic == null) {
            return;
        }
        this.a.c(new c70(this, i, tL_forumTopic, j, currentTime));
    }

    public final defpackage.ne7 d0(long r83, long r85, int r87, int r88, int r89, int r90, int r91, int r92, int r93, long r94, int r96, boolean r97, boolean r98, defpackage.qsb r99) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf7.d0(long, long, int, int, int, int, int, int, int, long, int, boolean, boolean, qsb):ne7");
    }

    public final void d1(ArrayList arrayList, boolean z) {
        SQLitePreparedStatement sQLitePreparedStatement = 0;
        try {
            if (z) {
                try {
                    this.b.beginTransaction();
                } catch (Exception e) {
                    n(e, true);
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                        return;
                    }
                    return;
                }
            }
            sQLitePreparedStatement = this.b.executeFast("INSERT OR REPLACE INTO ephemeral_messages (dialog_id, id, topic_id, date, data) VALUES (?, ?, ?, ?, ?);");
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                TL_ephemeral.EphemeralMessage ephemeralMessage = (TL_ephemeral.EphemeralMessage) obj;
                if (!ephemeralMessage.welcome) {
                    sQLitePreparedStatement.requery();
                    sQLitePreparedStatement.bindLong(1, wf3.n(ephemeralMessage.peer_id));
                    sQLitePreparedStatement.bindInteger(2, ephemeralMessage.id);
                    sQLitePreparedStatement.bindInteger(3, ephemeralMessage.top_msg_id);
                    sQLitePreparedStatement.bindInteger(4, ephemeralMessage.date);
                    sQLitePreparedStatement.bindTlObject(5, ephemeralMessage);
                    sQLitePreparedStatement.step();
                }
            }
            if (z) {
                this.b.commitTransaction();
            }
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
        } catch (Throwable th) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    public final void d2(long j, long j2, long j3) {
        jf7 jf7Var;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = this.b;
                Locale locale = Locale.US;
                sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT topic_id FROM topics WHERE did = " + j + " AND max_read_id < " + j3 + " AND (top_message > " + j2 + " OR unread_count > 0)", new Object[0]);
                while (sQLiteCursor.next()) {
                    jf7Var = this;
                    long j4 = j;
                    try {
                        jf7Var.b2((int) j3, -1, j4, sQLiteCursor.longValue(0));
                        this = jf7Var;
                        j = j4;
                    } catch (Exception e) {
                        e = e;
                        jf7Var.n(e, true);
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                            return;
                        }
                        return;
                    }
                }
                sQLiteCursor.dispose();
            } catch (Exception e2) {
                e = e2;
                jf7Var = this;
            }
        } catch (Throwable th) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    public final void e(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.a.c(new fd7(this, str, str2, (byte) 2));
    }

    public final Object[] e0(int i, String str) {
        if (str == null || str.toLowerCase().endsWith("attheme")) {
            return null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Object[] objArr = new Object[2];
        this.a.c(new fd6(this, str, i, objArr, countDownLatch));
        try {
            countDownLatch.await();
        } catch (Exception e) {
            n(e, true);
        }
        if (objArr[0] == null) {
            return null;
        }
        return objArr;
    }

    public final void e1(int i, int i2, int i3, long j, long j2, TLRPC.messages_Messages messages_messages, boolean z) {
        this.a.c(new xq6(this, i3, messages_messages, j, j2, i, i2, z));
    }

    public final void e2(int i, long j, long j2, boolean z) {
        this.a.c(new af7(this, j2, z, "unread_poll_votes", j, i, "poll_votes_mentions_topics", "unread_poll_votes", "poll_votes_mentions"));
    }

    public final void f(SQLitePreparedStatement sQLitePreparedStatement, TLRPC.Message message) {
        ArrayList<TLRPC.ReactionCount> arrayList;
        long j;
        String str;
        long e = getUserConfig().e();
        TLRPC.TL_messageReactions tL_messageReactions = message.reactions;
        if (tL_messageReactions != null && tL_messageReactions.reactions_as_tags && (arrayList = tL_messageReactions.results) != null && !arrayList.isEmpty()) {
            ob6 D0 = ob6.D0();
            String str2 = message.message;
            if (str2 == null) {
                str2 = "";
            }
            int i = 0;
            String S0 = D0.S0(str2, true, false);
            ArrayList<TLRPC.ReactionCount> arrayList2 = message.reactions.results;
            int size = arrayList2.size();
            while (i < size) {
                TLRPC.ReactionCount reactionCount = arrayList2.get(i);
                i++;
                TLRPC.ReactionCount reactionCount2 = reactionCount;
                TLRPC.Reaction reaction = reactionCount2.reaction;
                if ((reaction instanceof TLRPC.TL_reactionEmoji) || (reaction instanceof TLRPC.TL_reactionCustomEmoji)) {
                    sQLitePreparedStatement.requery();
                    sQLitePreparedStatement.bindLong(1, message.id);
                    sQLitePreparedStatement.bindLong(2, r47.Q1(e, message));
                    TLRPC.Reaction reaction2 = reactionCount2.reaction;
                    if (reaction2 instanceof TLRPC.TL_reactionEmoji) {
                        j = ((TLRPC.TL_reactionEmoji) reaction2).emoticon.hashCode();
                    } else if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                        j = ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id;
                    } else {
                        j = 0;
                    }
                    sQLitePreparedStatement.bindLong(3, j);
                    if (S0 == null) {
                        str = "";
                    } else {
                        str = S0;
                    }
                    sQLitePreparedStatement.bindString(4, str);
                    sQLitePreparedStatement.step();
                }
            }
        }
    }

    public final HashMap f0() {
        HashMap hashMap = new HashMap();
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                sQLiteCursor = this.b.queryFinalized("SELECT uid, info, participants_count FROM chat_settings_v2 WHERE participants_count > 1", new Object[0]);
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
            } catch (Exception e) {
                n(e, true);
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

    public final void f1(int i, int i2, long j, ArrayList arrayList, boolean z) {
        g1(arrayList, z, true, false, i, false, i2, j);
    }

    public final void f2(int i, long j, long j2, boolean z) {
        this.a.c(new af7(this, j2, z, "unread_reactions", j, i, "reaction_mentions_topics", "unread_reactions", "reaction_mentions"));
    }

    public final void g() {
        hl.c3(new be7(this, (byte) 12));
    }

    public final TLRPC.User g0(long j) {
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(j));
            k0(arrayList2, arrayList, false);
            if (arrayList.isEmpty()) {
                return null;
            }
            return (TLRPC.User) arrayList.get(0);
        } catch (Exception e) {
            n(e, true);
            return null;
        }
    }

    public final void g1(final ArrayList arrayList, final boolean z, boolean z2, final boolean z3, final int i, final boolean z4, final int i2, final long j) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (z2) {
                this.a.c(new Runnable() {
                    @Override
                    public final void run() {
                        jf7.this.h1(arrayList, z, z3, i, z4, i2, j);
                    }
                });
                return;
            }
            h1(arrayList, z, z3, i, z4, i2, j);
        }
    }

    public final void g2(TLRPC.UserFull userFull, boolean z) {
        this.a.c(new yn6(this, userFull, z, (byte) 2));
    }

    public final void h(Long l) {
        int i;
        SQLiteCursor queryFinalized;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = this.b;
                Locale locale = Locale.US;
                i = 0;
                queryFinalized = sQLiteDatabase.queryFinalized("SELECT COUNT(mid) FROM scheduled_messages_v2 WHERE uid = " + l, new Object[0]);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            if (queryFinalized.next()) {
                i = queryFinalized.intValue(0);
            }
            queryFinalized.dispose();
            hl.c3(new l65(this, l, i, (byte) 14));
        } catch (Exception e2) {
            e = e2;
            sQLiteCursor = queryFinalized;
            n(e, true);
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

    public final TLRPC.User h0(long j) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        TLRPC.User[] userArr = new TLRPC.User[1];
        this.a.c(new ba7(this, userArr, j, countDownLatch, (byte) 21));
        try {
            countDownLatch.await();
        } catch (Exception e) {
            n(e, true);
        }
        return userArr[0];
    }

    public final void h1(java.util.ArrayList r63, boolean r64, boolean r65, int r66, boolean r67, int r68, long r69) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf7.h1(java.util.ArrayList, boolean, boolean, int, boolean, int, long):void");
    }

    public final void h2(ArrayList arrayList, boolean z) {
        if (arrayList.isEmpty()) {
            return;
        }
        this.a.c(new dd7(this, arrayList, z, (byte) 0));
    }

    public final void i(boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf7.i(boolean):void");
    }

    public final ArrayList i0(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        try {
            k0(arrayList, arrayList2, false);
            return arrayList2;
        } catch (Exception e) {
            arrayList2.clear();
            n(e, true);
            return arrayList2;
        }
    }

    public final void i1(String str, TLObject tLObject, int i, String str2) {
        if (str != null && tLObject != null) {
            this.a.c(new fd6(this, str, tLObject, i, str2, (byte) 3));
        }
    }

    public final void i2(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            try {
                SQLiteDatabase sQLiteDatabase = this.b;
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
                    hl.c3(new se(arrayList2, (byte) 7));
                }
            } catch (Exception e) {
                n(e, true);
            }
        }
    }

    public final void j(int i) {
        SparseArray sparseArray = this.h;
        ArrayList arrayList = (ArrayList) sparseArray.get(i);
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.a.a((Runnable) arrayList.get(i2));
        }
        sparseArray.remove(i);
    }

    public final void j0(ArrayList arrayList, ArrayList arrayList2) {
        k0(arrayList, arrayList2, false);
    }

    public final void j1(List list, List list2, boolean z, boolean z2) {
        if (list != null && list.isEmpty() && list2 != null && list2.isEmpty()) {
            return;
        }
        if (z2) {
            this.a.c(new lb7(this, list, list2, z, (byte) 2));
            return;
        }
        k1(list, list2, z);
    }

    public final void k(int i) {
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                boolean z = false;
                sQLiteCursor = this.b.queryFinalized("SELECT did FROM dialogs WHERE folder_id = ?", Integer.valueOf(i));
                while (true) {
                    if (sQLiteCursor.next()) {
                        long longValue = sQLiteCursor.longValue(0);
                        if (!wf3.D(longValue) && !wf3.B(longValue)) {
                            TLRPC.Chat N = N(-longValue);
                            if (!xc2.r0(N) && N.migrated_to == null) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                sQLiteCursor.dispose();
                if (z) {
                    hl.c3(new ad7(this, i, (byte) 3));
                    this.b.executeFast("DELETE FROM dialogs WHERE did = " + (i | 2305843009213693952L)).stepThis().dispose();
                }
                sQLiteCursor.dispose();
            } catch (Exception e) {
                n(e, true);
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

    public final void k0(ArrayList arrayList, ArrayList arrayList2, boolean z) {
        if (!arrayList.isEmpty() && arrayList2 != null) {
            if (arrayList.size() > 50) {
                int i = 0;
                while (i < arrayList.size()) {
                    Long l = (Long) arrayList.get(i);
                    l.getClass();
                    TLRPC.User X1 = getMessagesController().X1(l);
                    if (X1 != null) {
                        arrayList2.add(X1);
                        arrayList.remove(i);
                        i--;
                    }
                    i++;
                }
            }
            if (!arrayList.isEmpty()) {
                SQLiteDatabase sQLiteDatabase = this.b;
                Locale locale = Locale.US;
                SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(qd4.y("SELECT data, status FROM users WHERE uid IN(", TextUtils.join(",", arrayList), ")"), new Object[0]);
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
                                if (arrayList.size() > 50 && z) {
                                    getMessagesController().i4(TLdeserialize, true, false);
                                }
                            }
                        }
                    } catch (Exception e) {
                        n(e, true);
                    }
                }
                queryFinalized.dispose();
            }
        }
    }

    public final void k1(List list, List list2, boolean z) {
        try {
            if (z) {
                try {
                    this.b.beginTransaction();
                } catch (Exception e) {
                    n(e, true);
                    SQLiteDatabase sQLiteDatabase = this.b;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.commitTransaction();
                        return;
                    }
                    return;
                }
            }
            l1(list);
            Y0(list2);
            SQLiteDatabase sQLiteDatabase2 = this.b;
            if (sQLiteDatabase2 != null) {
                sQLiteDatabase2.commitTransaction();
            }
        } catch (Throwable th) {
            SQLiteDatabase sQLiteDatabase3 = this.b;
            if (sQLiteDatabase3 != null) {
                sQLiteDatabase3.commitTransaction();
            }
            throw th;
        }
    }

    public final boolean l(long j) {
        boolean[] zArr = new boolean[1];
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.a.c(new jd7(this, j, zArr, countDownLatch, (byte) 2));
        try {
            countDownLatch.await();
        } catch (Exception e) {
            n(e, true);
        }
        return zArr[0];
    }

    public final void l0(ArrayList arrayList, HashSet hashSet) {
        if (!hashSet.isEmpty()) {
            if (hashSet.size() > 50) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    TLRPC.User X1 = getMessagesController().X1((Long) it.next());
                    if (X1 != null) {
                        arrayList.add(X1);
                        it.remove();
                    }
                }
            }
            if (!hashSet.isEmpty()) {
                SQLiteDatabase sQLiteDatabase = this.b;
                Locale locale = Locale.US;
                SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(qd4.y("SELECT data, status FROM users WHERE uid IN(", TextUtils.join(",", hashSet), ")"), new Object[0]);
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
                    } catch (Exception e) {
                        n(e, true);
                    }
                }
                queryFinalized.dispose();
            }
        }
    }

    public final void l1(List list) {
        int i;
        int i2;
        int i3;
        int i4;
        if (list != null && !list.isEmpty()) {
            SQLitePreparedStatement executeFast = this.b.executeFast("REPLACE INTO users VALUES(?, ?, ?, ?)");
            for (int i5 = 0; i5 < list.size(); i5++) {
                TLRPC.User user = (TLRPC.User) list.get(i5);
                if (user != null) {
                    if (user.min) {
                        SQLiteDatabase sQLiteDatabase = this.b;
                        Locale locale = Locale.US;
                        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(qu6.n(user.id, "SELECT data FROM users WHERE uid = "), new Object[0]);
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
                                            i4 = TLdeserialize.flags | 8;
                                            TLdeserialize.flags = i4;
                                        } else {
                                            TLdeserialize.username = null;
                                            i4 = TLdeserialize.flags & (-9);
                                            TLdeserialize.flags = i4;
                                        }
                                        if (user.apply_min_photo) {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                                            if (userProfilePhoto != null) {
                                                TLdeserialize.photo = userProfilePhoto;
                                                TLdeserialize.flags = i4 | 32;
                                            } else {
                                                TLdeserialize.photo = null;
                                                TLdeserialize.flags = i4 & (-33);
                                            }
                                        }
                                        user = TLdeserialize;
                                    }
                                }
                            } catch (Exception e) {
                                n(e, true);
                            }
                        }
                        queryFinalized.dispose();
                    }
                    executeFast.requery();
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(user.getObjectSize());
                    user.serializeToStream(nativeByteBuffer);
                    executeFast.bindLong(1, user.id);
                    executeFast.bindString(2, J(user));
                    TLRPC.UserStatus userStatus = user.status;
                    if (userStatus != null) {
                        if (userStatus instanceof TLRPC.TL_userStatusRecently) {
                            if (userStatus.by_me) {
                                i3 = -1000;
                            } else {
                                i3 = -100;
                            }
                            userStatus.expires = i3;
                        } else if (userStatus instanceof TLRPC.TL_userStatusLastWeek) {
                            if (userStatus.by_me) {
                                i2 = -1001;
                            } else {
                                i2 = -101;
                            }
                            userStatus.expires = i2;
                        } else if (userStatus instanceof TLRPC.TL_userStatusLastMonth) {
                            if (userStatus.by_me) {
                                i = -1002;
                            } else {
                                i = -102;
                            }
                            userStatus.expires = i;
                        }
                        executeFast.bindInteger(3, userStatus.expires);
                    } else {
                        executeFast.bindInteger(3, 0);
                    }
                    executeFast.bindByteBuffer(4, nativeByteBuffer);
                    executeFast.step();
                    nativeByteBuffer.reuse();
                    this.S.delete(user.id);
                }
            }
            executeFast.dispose();
        }
    }

    public final void m(Exception exc) {
        n(exc, true);
    }

    public final void m0() {
        this.a.c(new be7(this, (byte) 24));
    }

    public final void m1(int i, ArrayList arrayList) {
        this.a.c(new de7(this, i, arrayList, (byte) 0));
    }

    public final void n(java.lang.Throwable r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf7.n(java.lang.Throwable, boolean):void");
    }

    public final void n0(final int i, final int i2, final ArrayList arrayList, final ArrayList arrayList2, final ArrayList arrayList3, final boolean z) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.a.c(new Runnable() {
            @Override
            public final void run() {
                ArrayList arrayList4;
                ArrayList arrayList5;
                ArrayList arrayList6;
                jf7 jf7Var = jf7.this;
                int i3 = i;
                CountDownLatch countDownLatch2 = countDownLatch;
                SQLiteCursor sQLiteCursor = null;
                try {
                    try {
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = new ArrayList();
                        SQLiteDatabase sQLiteDatabase = jf7Var.b;
                        Locale locale = Locale.US;
                        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT did FROM shortcut_widget WHERE id = " + i3 + " ORDER BY ord ASC", new Object[0]);
                        while (true) {
                            try {
                                boolean next = queryFinalized.next();
                                arrayList4 = arrayList;
                                arrayList5 = arrayList2;
                                arrayList6 = arrayList3;
                                if (!next) {
                                    break;
                                }
                                long longValue = queryFinalized.longValue(0);
                                if (longValue != -1) {
                                    arrayList4.add(Long.valueOf(longValue));
                                    if (arrayList5 != null && arrayList6 != null) {
                                        if (wf3.D(longValue)) {
                                            arrayList7.add(Long.valueOf(longValue));
                                        } else {
                                            arrayList8.add(Long.valueOf(-longValue));
                                        }
                                    }
                                }
                            } catch (Exception e) {
                                e = e;
                                sQLiteCursor = queryFinalized;
                            } catch (Throwable th) {
                                th = th;
                                sQLiteCursor = queryFinalized;
                            }
                        }
                        queryFinalized.dispose();
                        if (!z && arrayList4.isEmpty()) {
                            ?? r15 = i2;
                            try {
                                if (r15 == 0) {
                                    SQLiteCursor queryFinalized2 = jf7Var.b.queryFinalized("SELECT did FROM dialogs WHERE folder_id = 0 ORDER BY pinned DESC, date DESC LIMIT 0,10", new Object[0]);
                                    while (queryFinalized2.next()) {
                                        long longValue2 = queryFinalized2.longValue(0);
                                        if (!wf3.C(longValue2)) {
                                            arrayList4.add(Long.valueOf(longValue2));
                                            if (arrayList5 != null && arrayList6 != null) {
                                                if (wf3.D(longValue2)) {
                                                    arrayList7.add(Long.valueOf(longValue2));
                                                } else {
                                                    arrayList8.add(Long.valueOf(-longValue2));
                                                }
                                            }
                                        }
                                    }
                                    queryFinalized2.dispose();
                                } else {
                                    SQLiteCursor queryFinalized3 = jf7Var.getMessagesStorage().b.queryFinalized("SELECT did FROM chat_hints WHERE type = 0 ORDER BY rating DESC LIMIT 4", new Object[0]);
                                    while (queryFinalized3.next()) {
                                        long longValue3 = queryFinalized3.longValue(0);
                                        arrayList4.add(Long.valueOf(longValue3));
                                        if (arrayList5 != null && arrayList6 != null) {
                                            if (wf3.D(longValue3)) {
                                                arrayList7.add(Long.valueOf(longValue3));
                                            } else {
                                                arrayList8.add(Long.valueOf(-longValue3));
                                            }
                                        }
                                    }
                                    queryFinalized3.dispose();
                                }
                            } catch (Exception e2) {
                                sQLiteCursor = r15;
                                e = e2;
                                jf7Var.n(e, true);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                countDownLatch2.countDown();
                            } catch (Throwable th2) {
                                sQLiteCursor = r15;
                                th = th2;
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                countDownLatch2.countDown();
                                throw th;
                            }
                        }
                        if (arrayList5 != null && arrayList6 != null) {
                            if (!arrayList8.isEmpty()) {
                                jf7Var.P(TextUtils.join(",", arrayList8), arrayList6);
                            }
                            if (!arrayList7.isEmpty()) {
                                jf7Var.k0(arrayList7, arrayList5, false);
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
                countDownLatch2.countDown();
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e) {
            n(e, true);
        }
    }

    public final void n1(long j) {
        this.a.c(new le7(this, j, (byte) 5));
    }

    public final void o(boolean z) {
        if (z) {
            p1();
        } else {
            p();
        }
        SQLiteDatabase sQLiteDatabase = this.b;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
            this.b = null;
        }
        if (z) {
            File file = this.c;
            if (file != null) {
                file.delete();
                this.c = null;
            }
            File file2 = this.d;
            if (file2 != null) {
                file2.delete();
                this.d = null;
            }
            File file3 = this.e;
            if (file3 != null) {
                file3.delete();
                this.e = null;
            }
        }
    }

    public final boolean o0(zh6 zh6Var, TLRPC.Chat chat) {
        long j = chat.linked_community_id;
        if (j != 0) {
            TLRPC.Chat chat2 = (TLRPC.Chat) zh6Var.f(j);
            if (chat2 == null) {
                chat2 = N(chat.linked_community_id);
                zh6Var.k(chat.linked_community_id, chat2);
            }
            if (chat2 != null && chat2.collapsed_in_dialogs) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void o1(TLRPC.Message message, ArrayList arrayList, ArrayList arrayList2, boolean z) {
        if (message != null && !(message instanceof TLRPC.TL_messageEmpty)) {
            this.a.c(new va7(this, message, z, arrayList, arrayList2, (byte) 1));
        }
    }

    public final void p() {
        this.n = 0;
        this.w = 0;
        this.r = 0;
        this.s = 0;
        this.x = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.I.clear();
        this.J.clear();
        this.K.b();
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.y = null;
        this.E = 0;
    }

    public final void p1() {
        p();
        hl.c3(new be7(this, (byte) 9));
    }

    public final void q(int i) {
        this.a.c(new te7(this, i, (byte) 0));
    }

    public final void q1(boolean z) {
        int size = this.I.size();
        for (int i = 0; i < size; i++) {
            ac7 ac7Var = (ac7) this.I.get(i);
            if (z) {
                int i2 = ac7Var.g;
                int i3 = uc7.r5;
                if ((i2 & 32) != 0) {
                    ac7Var.e = -1;
                }
            } else {
                ac7Var.e = -1;
            }
        }
        i(false);
        hl.c3(new be7(this, (byte) 25));
    }

    public final void r() {
        for (int i = 0; i < 2; i++) {
            getUserConfig().w(i, 0, 0, 0L, 0L, 0L, 0L);
            getUserConfig().y(i, 0);
        }
        getUserConfig().u(false);
    }

    public final boolean r0(int i, long j) {
        if ((X(j) & i) != 0) {
            return true;
        }
        return false;
    }

    public final void r1(long j) {
        LongSparseIntArray longSparseIntArray;
        SQLiteCursor sQLiteCursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.b;
            Locale locale = Locale.ENGLISH;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT topic_id FROM topics WHERE did = " + j + " AND unread_count > 0", new Object[0]);
            try {
                if (!queryFinalized.next()) {
                    longSparseIntArray = new LongSparseIntArray();
                    longSparseIntArray.put(j, 0);
                } else {
                    longSparseIntArray = null;
                }
                queryFinalized.dispose();
                if (longSparseIntArray != null) {
                    this.b.executeFast("UPDATE dialogs SET unread_count = 0, unread_count_i = 0 WHERE did = " + j).stepThis().dispose();
                }
                T1(longSparseIntArray, null, true);
                getMessagesController().R3(longSparseIntArray, null);
            } catch (Throwable th) {
                th = th;
                sQLiteCursor = queryFinalized;
                try {
                    n(th, true);
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

    public final void s(long r24, int r26, int r27, int r28, long r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf7.s(long, int, int, int, long):void");
    }

    public final void s1(String str, TLObject tLObject) {
        if (tLObject != null && !TextUtils.isEmpty(str)) {
            this.a.c(new fd7(this, tLObject, str, (byte) 3));
        }
    }

    public final void t(int r35, int r36, long r37, long r39, java.lang.String r41) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf7.t(int, int, long, long, java.lang.String):void");
    }

    public final boolean t0(long j) {
        return r0(4, j);
    }

    public final void t1(int i, long j) {
        this.a.c(new gd7(this, i, j, (byte) 2));
    }

    public final boolean u(long j) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Boolean[] boolArr = {Boolean.FALSE};
        this.a.c(new ba7(this, j, boolArr, countDownLatch, (byte) 23));
        try {
            countDownLatch.await();
        } catch (Exception e) {
            n(e, true);
        }
        return boolArr[0].booleanValue();
    }

    public final boolean u0(zh6 zh6Var, TLRPC.User user) {
        long j = user.linked_community_id;
        if (j != 0) {
            TLRPC.Chat chat = (TLRPC.Chat) zh6Var.f(j);
            if (chat == null) {
                chat = N(user.linked_community_id);
                zh6Var.k(user.linked_community_id, chat);
            }
            if (chat != null && chat.collapsed_in_dialogs) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void u1(ac7 ac7Var, boolean z) {
        int i;
        SQLitePreparedStatement executeFast;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement sQLitePreparedStatement2;
        String str;
        ArrayList arrayList = this.I;
        SQLitePreparedStatement sQLitePreparedStatement3 = null;
        try {
            try {
                if (!arrayList.contains(ac7Var)) {
                    if (z) {
                        if (((ac7) arrayList.get(0)).d()) {
                            arrayList.add(1, ac7Var);
                        } else {
                            arrayList.add(0, ac7Var);
                        }
                    } else {
                        arrayList.add(ac7Var);
                    }
                    this.J.put(ac7Var.a, ac7Var);
                }
                executeFast = this.b.executeFast("REPLACE INTO dialog_filter VALUES(?, ?, ?, ?, ?, ?, ?, ?)");
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            int i2 = ac7Var.a;
            LongSparseIntArray longSparseIntArray = ac7Var.j;
            executeFast.bindInteger(1, i2);
            executeFast.bindInteger(2, ac7Var.f);
            executeFast.bindInteger(3, ac7Var.d);
            executeFast.bindInteger(4, ac7Var.g);
            if (ac7Var.a == 0) {
                str = "ALL_CHATS";
            } else {
                str = ac7Var.b;
            }
            executeFast.bindString(5, str);
            executeFast.bindInteger(6, ac7Var.m);
            Vector vector = new Vector(new hz6((byte) 13));
            vector.objects.addAll(ac7Var.c);
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(vector.getObjectSize());
            vector.serializeToStream(nativeByteBuffer);
            executeFast.bindByteBuffer(7, nativeByteBuffer);
            executeFast.bindInteger(8, ac7Var.n ? 1 : 0);
            executeFast.step();
            executeFast.dispose();
            nativeByteBuffer.reuse();
            this.b.executeFast("DELETE FROM dialog_filter_ep WHERE id = " + ac7Var.a).stepThis().dispose();
            this.b.executeFast("DELETE FROM dialog_filter_pin_v2 WHERE id = " + ac7Var.a).stepThis().dispose();
            this.b.beginTransaction();
            SQLitePreparedStatement executeFast2 = this.b.executeFast("REPLACE INTO dialog_filter_pin_v2 VALUES(?, ?, ?)");
            int size = ac7Var.h.size();
            for (int i3 = 0; i3 < size; i3++) {
                long longValue = ((Long) ac7Var.h.get(i3)).longValue();
                executeFast2.requery();
                executeFast2.bindInteger(1, ac7Var.a);
                executeFast2.bindLong(2, longValue);
                executeFast2.bindInteger(3, longSparseIntArray.get(longValue, Integer.MIN_VALUE));
                executeFast2.step();
            }
            int size2 = longSparseIntArray.size();
            for (int i4 = 0; i4 < size2; i4++) {
                long keyAt = longSparseIntArray.keyAt(i4);
                if (wf3.B(keyAt)) {
                    executeFast2.requery();
                    executeFast2.bindInteger(1, ac7Var.a);
                    executeFast2.bindLong(2, keyAt);
                    executeFast2.bindInteger(3, longSparseIntArray.valueAt(i4));
                    executeFast2.step();
                }
            }
            executeFast2.dispose();
            SQLitePreparedStatement executeFast3 = this.b.executeFast("REPLACE INTO dialog_filter_ep VALUES(?, ?)");
            int size3 = ac7Var.i.size();
            for (i = 0; i < size3; i++) {
                executeFast3.requery();
                executeFast3.bindInteger(1, ac7Var.a);
                executeFast3.bindLong(2, ((Long) ac7Var.i.get(i)).longValue());
                executeFast3.step();
            }
            executeFast3.dispose();
            this.b.commitTransaction();
            SQLiteDatabase sQLiteDatabase = this.b;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.commitTransaction();
            }
        } catch (Exception e2) {
            e = e2;
            sQLitePreparedStatement3 = sQLitePreparedStatement2;
            n(e, true);
            SQLiteDatabase sQLiteDatabase2 = this.b;
            if (sQLiteDatabase2 != null) {
                sQLiteDatabase2.commitTransaction();
            }
            if (sQLitePreparedStatement3 != null) {
                sQLitePreparedStatement3.dispose();
            }
        } catch (Throwable th2) {
            th = th2;
            sQLitePreparedStatement3 = sQLitePreparedStatement;
            SQLiteDatabase sQLiteDatabase3 = this.b;
            if (sQLiteDatabase3 != null) {
                sQLiteDatabase3.commitTransaction();
            }
            if (sQLitePreparedStatement3 != null) {
                sQLitePreparedStatement3.dispose();
            }
            throw th;
        }
    }

    public final void v1() {
        this.a.c(new q41(this, new ArrayList(getMessagesController().G0), (byte) 7));
    }

    public final SQLiteCursor w(int i, int i2, long j) {
        SQLiteDatabase sQLiteDatabase = this.b;
        Locale locale = Locale.US;
        StringBuilder o = ik8.o(j, "SELECT data, seen, pin FROM profile_stories JOIN profile_stories_albums_links ON profile_stories.story_id = profile_stories_albums_links.story_id WHERE profile_stories.dialog_id = ", " AND profile_stories_albums_links.dialog_id = ");
        o.append(j);
        o.append("  AND profile_stories_albums_links.album_id = ");
        o.append(i);
        o.append(" AND profile_stories.type = ");
        o.append(i2);
        o.append(" ORDER BY profile_stories_albums_links.order_index ASC;");
        return sQLiteDatabase.queryFinalized(o.toString(), new Object[0]);
    }

    public final void w0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf7.w0():void");
    }

    public final void w1() {
        ArrayList arrayList = this.I;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = this.b.executeFast("UPDATE dialog_filter SET ord = ?, flags = ? WHERE id = ?");
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ac7 ac7Var = (ac7) arrayList.get(i);
                    sQLitePreparedStatement.requery();
                    sQLitePreparedStatement.bindInteger(1, ac7Var.f);
                    sQLitePreparedStatement.bindInteger(2, ac7Var.g);
                    sQLitePreparedStatement.bindInteger(3, ac7Var.a);
                    sQLitePreparedStatement.step();
                }
                sQLitePreparedStatement.dispose();
            } catch (Exception e) {
                n(e, true);
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

    public final void x(long j, TLRPC.Message message) {
        TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
        tL_forumTopic.topicStartMessage = message;
        tL_forumTopic.top_message = message.id;
        tL_forumTopic.topMessage = message;
        tL_forumTopic.from_id = message.from_id;
        tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
        int i = 0;
        tL_forumTopic.unread_count = 0;
        TLRPC.MessageAction messageAction = message.action;
        if (messageAction instanceof TLRPC.TL_messageActionTopicCreate) {
            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = (TLRPC.TL_messageActionTopicCreate) messageAction;
            tL_forumTopic.id = message.id;
            long j2 = tL_messageActionTopicCreate.icon_emoji_id;
            tL_forumTopic.icon_emoji_id = j2;
            tL_forumTopic.title = tL_messageActionTopicCreate.title;
            tL_forumTopic.icon_color = tL_messageActionTopicCreate.icon_color;
            if (j2 != 0) {
                tL_forumTopic.flags |= 1;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(tL_forumTopic);
            A1(j, arrayList, false, false, message.date);
            hl.c3(new cq6(this, j, tL_forumTopic, (byte) 10));
        } else if (messageAction instanceof TLRPC.TL_messageActionTopicEdit) {
            TLRPC.TL_messageActionTopicEdit tL_messageActionTopicEdit = (TLRPC.TL_messageActionTopicEdit) messageAction;
            tL_forumTopic.id = (int) r47.b2(this.currentAccount, message, true, false);
            tL_forumTopic.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
            tL_forumTopic.title = tL_messageActionTopicEdit.title;
            tL_forumTopic.closed = tL_messageActionTopicEdit.closed;
            tL_forumTopic.hidden = tL_messageActionTopicEdit.hidden;
            int i2 = tL_messageActionTopicEdit.flags;
            if ((i2 & 1) != 0) {
                i = 1;
            }
            if ((i2 & 2) != 0) {
                i += 2;
            }
            if ((i2 & 4) != 0) {
                i += 8;
            }
            if ((i2 & 8) != 0) {
                i += 32;
            }
            this.a.c(new c70(this, i, tL_forumTopic, j, message.date));
        }
    }

    public final void x0(int r29, long r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf7.x0(int, long):void");
    }

    public final void x1(int i, int i2, int i3, int i4) {
        this.a.c(new ie7(this, i, i2, i3, i4, (byte) 0));
    }

    public final long y(NativeByteBuffer nativeByteBuffer) {
        if (nativeByteBuffer == null) {
            return 0L;
        }
        long andAdd = this.f.getAndAdd(1L);
        this.a.c(new cq6(this, andAdd, nativeByteBuffer, (byte) 12));
        return andAdd;
    }

    public final void y0(int r28, int r29, int r30, long[] r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf7.y0(int, int, int, long[]):void");
    }

    public final void y1(int i, int i2, int i3, int i4) {
        try {
            if (this.F == i && this.G == i2 && this.H == i3 && this.s == i4) {
                return;
            }
            SQLitePreparedStatement executeFast = this.b.executeFast("UPDATE params SET seq = ?, pts = ?, date = ?, qts = ? WHERE id = 1");
            executeFast.bindInteger(1, i);
            executeFast.bindInteger(2, i2);
            executeFast.bindInteger(3, i3);
            executeFast.bindInteger(4, i4);
            executeFast.step();
            executeFast.dispose();
            this.F = i;
            this.G = i2;
            this.H = i3;
        } catch (Exception e) {
            n(e, true);
        }
    }

    public final void z0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf7.z0():void");
    }

    public final void z1(int i, long j, List list, boolean z) {
        this.a.c(new kn3(this, j, list, z, i));
    }
}
