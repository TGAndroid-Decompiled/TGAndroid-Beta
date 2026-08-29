package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.util.Pair;
import android.util.SparseArray;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Timer;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.h01;
import org.telegram.ui.Components.i01;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.ox0;
import org.telegram.ui.Components.qi0;
import org.telegram.ui.Components.sw0;
import org.telegram.ui.Components.xo0;
import org.telegram.ui.jn;
public class MediaDataController extends BaseController {
    public static final String ATTACH_MENU_BOT_ANIMATED_ICON_KEY = "android_animated";
    public static final String ATTACH_MENU_BOT_ANIMATED_ICON_KEY_2 = "android_active_animated";
    public static final String ATTACH_MENU_BOT_COLOR_DARK_ICON = "dark_icon";
    public static final String ATTACH_MENU_BOT_COLOR_DARK_TEXT = "dark_text";
    public static final String ATTACH_MENU_BOT_COLOR_LIGHT_ICON = "light_icon";
    public static final String ATTACH_MENU_BOT_COLOR_LIGHT_TEXT = "light_text";
    public static final String ATTACH_MENU_BOT_PLACEHOLDER_STATIC_KEY = "placeholder_static";
    public static final String ATTACH_MENU_BOT_SIDE_MENU = "android_side_menu_static";
    public static final String ATTACH_MENU_BOT_SIDE_MENU_ICON_KEY = "android_side_menu_static";
    public static final String ATTACH_MENU_BOT_STATIC_ICON_KEY = "default_static";
    public static final int MAX_LINKS_COUNT = 250;
    public static final int MAX_STYLE_RUNS_COUNT = 1000;
    public static final int MEDIA_AUDIO = 2;
    public static final int MEDIA_FILE = 1;
    public static final int MEDIA_GIF = 5;
    public static final int MEDIA_MUSIC = 4;
    public static final int MEDIA_PHOTOS_ONLY = 6;
    public static final int MEDIA_PHOTOVIDEO = 0;
    public static final int MEDIA_POLL = 8;
    public static final int MEDIA_TYPES_COUNT = 9;
    public static final int MEDIA_URL = 3;
    public static final int MEDIA_VIDEOS_ONLY = 7;
    public static int SHORTCUT_TYPE_ATTACHED_BOT = 0;
    public static int SHORTCUT_TYPE_USER_OR_CHAT = 0;
    private static final int TOP_PEER_TYPE_BOT_GUEST = 3;
    private static final int TOP_PEER_TYPE_BOT_INLINE = 1;
    public static final int TYPE_EMOJI = 4;
    public static final int TYPE_EMOJIPACKS = 5;
    public static final int TYPE_FAVE = 2;
    public static final int TYPE_FEATURED = 3;
    public static final int TYPE_FEATURED_EMOJIPACKS = 6;
    public static final int TYPE_GREETINGS = 3;
    public static final int TYPE_IMAGE = 0;
    public static final int TYPE_MASK = 1;
    public static final int TYPE_PREMIUM_STICKERS = 7;
    private static RectF bitmapRect;
    private static Comparator<TLRPC.MessageEntity> entityComparator;
    private static Paint erasePaint;
    private static Paint roundPaint;
    private static Path roundPath;
    private HashMap<String, ArrayList<TLRPC.Document>> allStickers;
    private HashMap<String, ArrayList<TLRPC.Document>> allStickersFeatured;
    private int[] archivedStickersCount;
    private TLRPC.TL_attachMenuBots attachMenuBots;
    private a0.h botDialogKeyboards;
    private HashMap<String, TL_bots.BotInfo> botInfos;
    private HashMap<MessagesStorage.TopicKey, TLRPC.Message> botKeyboards;
    private a0.h botKeyboardsByMids;
    private boolean cleanedupStickerSetCache;
    private HashMap<String, Boolean> currentFetchingEmoji;
    public final ArrayList<fp> defaultEmojiThemes;
    private ArrayList<MessageObject> deletedFromResultMessages;
    private a0.h diceEmojiStickerSetsById;
    private HashMap<String, TLRPC.TL_messages_stickerSet> diceStickerSetsByEmoji;
    private String doubleTapReaction;
    private a0.h draftMessages;
    private SharedPreferences draftPreferences;
    public a0.h draftVoices;
    private boolean draftVoicesLoaded;
    private a0.h drafts;
    private a0.h draftsFolderIds;
    private ArrayList<TLRPC.EmojiStatus>[] emojiStatuses;
    private Long[] emojiStatusesFetchDate;
    private boolean[] emojiStatusesFetching;
    private boolean[] emojiStatusesFromCacheFetched;
    private long[] emojiStatusesHash;
    private List<TLRPC.TL_availableReaction> enabledReactionsList;
    private ArrayList<TLRPC.StickerSetCovered>[] featuredStickerSets;
    private a0.h[] featuredStickerSetsById;
    private boolean[] featuredStickersLoaded;
    private HashSet<String> fetchedEmoji;
    private TLRPC.Document greetingsSticker;
    public TLRPC.TL_emojiList groupAvatarConstructorDefault;
    private a0.h groupStickerSets;
    public ArrayList<TLRPC.TL_topPeer> guestBots;
    public ArrayList<TLRPC.TL_topPeer> hints;
    private boolean inTransaction;
    public ArrayList<TLRPC.TL_topPeer> inlineBots;
    private ArrayList<Long> installedForceStickerSetsById;
    private a0.h installedStickerSetsById;
    private boolean isLoadingMenuBots;
    private boolean isLoadingPremiumPromo;
    private boolean isLoadingReactions;
    private long lastDialogId;
    private int lastGuid;
    private long lastMergeDialogId;
    private kg.q0 lastReaction;
    private long lastReplyMessageId;
    private int lastReqId;
    private int lastReturnedNum;
    private TLRPC.Chat lastSearchChat;
    private String lastSearchQuery;
    private TLRPC.User lastSearchUser;
    private int[] loadDate;
    private int[] loadFeaturedDate;
    private long[] loadFeaturedHash;
    public boolean loadFeaturedPremium;
    private long[] loadHash;
    boolean loaded;
    private boolean loadedPredirectedSearchLocal;
    boolean loadedRecentReactions;
    boolean loadedSavedReactions;
    boolean loading;
    private boolean loadingDefaultTopicIcons;
    private HashSet<String> loadingDiceStickerSets;
    private boolean loadingDrafts;
    private boolean[] loadingFeaturedStickers;
    private boolean loadingGenericAnimations;
    private boolean loadingMoreSearchMessages;
    private a0.h loadingPinnedMessages;
    private boolean loadingPremiumGiftStickers;
    private boolean loadingPremiumTonStickers;
    private boolean loadingRecentGifs;
    boolean loadingRecentReactions;
    private boolean[] loadingRecentStickers;
    boolean loadingSavedReactions;
    private boolean loadingSearchLocal;
    private final HashMap<SearchStickersKey, Integer> loadingSearchStickersKeys;
    private final HashMap<String, ArrayList<Utilities.Callback2<Boolean, TLRPC.TL_messages_stickerSet>>> loadingStickerSets;
    private final HashSet<String> loadingStickerSetsKeys;
    private boolean[] loadingStickers;
    private int menuBotsUpdateDate;
    private long menuBotsUpdateHash;
    private boolean menuBotsUpdatedLocal;
    private int mergeReqId;
    private int messagesLocalSearchCount;
    private int[] messagesSearchCount;
    private boolean[] messagesSearchEndReached;
    public final ArrayList<TLRPC.Document> premiumPreviewStickers;
    private TLRPC.TL_help_premiumPromo premiumPromo;
    private int premiumPromoUpdateDate;
    boolean previewStickersLoading;
    public TLRPC.TL_emojiList profileAvatarConstructorDefault;
    private boolean reactionsCacheGenerated;
    private List<TLRPC.TL_availableReaction> reactionsList;
    private HashMap<String, TLRPC.TL_availableReaction> reactionsMap;
    private int reactionsUpdateDate;
    private int reactionsUpdateHash;
    private ArrayList<Long>[] readingStickerSets;
    private ArrayList<TLRPC.Document> recentGifs;
    private boolean recentGifsLoaded;
    ArrayList<TLRPC.Reaction> recentReactions;
    private ArrayList<TLRPC.Document>[] recentStickers;
    private boolean[] recentStickersLoaded;
    private a0.h removingStickerSetsUndos;
    public TLRPC.TL_emojiList replyIconsDefault;
    private int reqId;
    public TLRPC.TL_emojiList restrictedStatusEmojis;
    public final ef.e ringtoneDataStore;
    public HashMap<String, ef.f> ringtoneUploaderHashMap;
    ArrayList<TLRPC.Reaction> savedReactions;
    private Runnable[] scheduledLoadStickers;
    public ArrayList<MessageObject> searchLocalResultMessages;
    public ArrayList<MessageObject> searchResultMessages;
    public ArrayList<MessageObject> searchServerResultMessages;
    private SparseArray<MessageObject>[] searchServerResultMessagesMap;
    private final android.util.LruCache<SearchStickersKey, SearchStickersResult> searchStickerResults;
    public final HashMap<String, Utilities.Callback<Boolean>> shortcutCallbacks;
    private TLRPC.TL_messages_stickerSet stickerSetDefaultChannelStatuses;
    private TLRPC.TL_messages_stickerSet stickerSetDefaultStatuses;
    private ArrayList<TLRPC.TL_messages_stickerSet>[] stickerSets;
    private a0.h stickerSetsById;
    private ConcurrentHashMap<String, TLRPC.TL_messages_stickerSet> stickerSetsByName;
    private a0.h stickersByEmoji;
    private a0.h[] stickersByIds;
    private boolean[] stickersLoaded;
    ArrayList<TLRPC.Reaction> topReactions;
    private boolean triedLoadingEmojipacks;
    private ArrayList<Long> uninstalledForceStickerSetsById;
    private ArrayList<Long>[] unreadStickerSets;
    private HashMap<String, ArrayList<TLRPC.Message>> verifyingMessages;
    public ArrayList<TLRPC.TL_topPeer> webapps;
    private static Pattern BOLD_PATTERN = Pattern.compile("\\*\\*(.+?)\\*\\*");
    private static Pattern ITALIC_PATTERN = Pattern.compile("__(.+?)__");
    private static Pattern SPOILER_PATTERN = Pattern.compile("\\|\\|(.+?)\\|\\|");
    private static Pattern STRIKE_PATTERN = Pattern.compile("~~(.+?)~~");
    public static String SHORTCUT_CATEGORY = "org.telegram.messenger.SHORTCUT_SHARE";
    private static volatile MediaDataController[] Instance = new MediaDataController[4];
    private static final Object[] lockObjects = new Object[4];

    public class AnonymousClass1 implements Runnable {
        final int val$classGuid;
        final int val$count;
        final int val$fromCache;
        final boolean val$isChannel;
        final int val$max_id;
        final int val$min_id;
        final int val$requestIndex;
        final kg.q0 val$tag;
        final long val$topicId;
        final int val$type;
        final long val$uid;

        public AnonymousClass1(int i10, long j10, int i11, long j11, int i12, kg.q0 q0Var, int i13, int i14, int i15, boolean z10, int i16) {
            MediaDataController.this = r1;
            this.val$count = i10;
            this.val$uid = j10;
            this.val$min_id = i11;
            this.val$topicId = j11;
            this.val$type = i12;
            this.val$tag = q0Var;
            this.val$max_id = i13;
            this.val$classGuid = i14;
            this.val$fromCache = i15;
            this.val$isChannel = z10;
            this.val$requestIndex = i16;
        }

        public void lambda$run$0(Runnable runnable, int i10) {
            MediaDataController.this.getMessagesStorage().completeTaskForGuid(runnable, i10);
        }

        @Override
        public void run() {
            r4 r4Var;
            long j10;
            ArrayList arrayList;
            SQLiteDatabase sQLiteDatabase;
            SQLiteCursor queryFinalized;
            boolean z10;
            boolean z11;
            ArrayList<TLRPC.Message> arrayList2;
            TLRPC.TL_messages_messages tL_messages_messages;
            ArrayList<Long> arrayList3;
            long j11;
            ArrayList arrayList4;
            String str;
            String str2;
            int i10;
            boolean z12;
            String str3;
            AnonymousClass1 anonymousClass1;
            String str4;
            String str5;
            String str6;
            int i11;
            int i12;
            SQLiteCursor queryFinalized2;
            boolean z13;
            String str7;
            String str8;
            String str9;
            int i13;
            SQLiteCursor queryFinalized3;
            int i14;
            AnonymousClass1 anonymousClass12;
            String str10;
            String str11;
            int i15;
            SQLiteCursor queryFinalized4;
            int i16;
            SQLiteDatabase sQLiteDatabase2;
            AnonymousClass1 anonymousClass13;
            long j12;
            int i17;
            SQLiteCursor queryFinalized5;
            int i18;
            int intValue;
            SQLitePreparedStatement executeFast;
            int i19;
            AnonymousClass1 anonymousClass14 = this;
            long clientUserId = MediaDataController.this.getUserConfig().getClientUserId();
            TLRPC.TL_messages_messages tL_messages_messages2 = new TLRPC.TL_messages_messages();
            boolean z14 = false;
            try {
                try {
                    ArrayList<Long> arrayList5 = new ArrayList<>();
                    ArrayList arrayList6 = new ArrayList();
                    int i20 = anonymousClass14.val$count + 1;
                    SQLiteDatabase database = MediaDataController.this.getMessagesStorage().getDatabase();
                    TLRPC.TL_messages_messages tL_messages_messages3 = tL_messages_messages2;
                    try {
                        ArrayList<Long> arrayList7 = arrayList5;
                        if (!DialogObject.isEncryptedDialog(anonymousClass14.val$uid)) {
                            if (anonymousClass14.val$min_id == 0) {
                                j10 = clientUserId;
                                long j13 = anonymousClass14.val$topicId;
                                arrayList = arrayList6;
                                if (j13 != 0) {
                                    Locale locale = Locale.US;
                                    str = "SELECT max(end) FROM media_holes_topics WHERE uid = ";
                                    str2 = "t.tag = ";
                                    i10 = i20;
                                    queryFinalized5 = database.queryFinalized("SELECT start FROM media_holes_topics WHERE uid = " + anonymousClass14.val$uid + " AND topic_id = " + j13 + " AND type = " + anonymousClass14.val$type + " AND start IN (0, 1)", new Object[0]);
                                    i17 = 0;
                                } else {
                                    str = "SELECT max(end) FROM media_holes_topics WHERE uid = ";
                                    str2 = "t.tag = ";
                                    i10 = i20;
                                    Locale locale2 = Locale.US;
                                    i17 = 0;
                                    queryFinalized5 = database.queryFinalized("SELECT start FROM media_holes_v2 WHERE uid = " + anonymousClass14.val$uid + " AND type = " + anonymousClass14.val$type + " AND start IN (0, 1)", new Object[0]);
                                }
                                if (queryFinalized5.next()) {
                                    if (queryFinalized5.intValue(i17) == 1) {
                                        z12 = true;
                                        queryFinalized5.dispose();
                                    }
                                } else {
                                    queryFinalized5.dispose();
                                    long j14 = anonymousClass14.val$topicId;
                                    if (j14 != 0) {
                                        Locale locale3 = Locale.US;
                                        queryFinalized5 = database.queryFinalized("SELECT min(mid) FROM media_topics WHERE uid = " + anonymousClass14.val$uid + " AND topic_id = " + j14 + " AND type = " + anonymousClass14.val$type + " AND mid > 0", new Object[0]);
                                        i18 = 0;
                                    } else {
                                        Locale locale4 = Locale.US;
                                        i18 = 0;
                                        queryFinalized5 = database.queryFinalized("SELECT min(mid) FROM media_v4 WHERE uid = " + anonymousClass14.val$uid + " AND type = " + anonymousClass14.val$type + " AND mid > 0", new Object[0]);
                                    }
                                    if (queryFinalized5.next() && (intValue = queryFinalized5.intValue(i18)) != 0) {
                                        if (anonymousClass14.val$topicId != 0) {
                                            executeFast = database.executeFast("REPLACE INTO media_holes_topics VALUES(?, ?, ?, ?, ?)");
                                        } else {
                                            executeFast = database.executeFast("REPLACE INTO media_holes_v2 VALUES(?, ?, ?, ?)");
                                        }
                                        executeFast.requery();
                                        executeFast.bindLong(1, anonymousClass14.val$uid);
                                        long j15 = anonymousClass14.val$topicId;
                                        if (j15 != 0) {
                                            executeFast.bindLong(2, j15);
                                            i19 = 3;
                                        } else {
                                            i19 = 2;
                                        }
                                        executeFast.bindInteger(i19, anonymousClass14.val$type);
                                        executeFast.bindInteger(i19 + 1, 0);
                                        executeFast.bindInteger(i19 + 2, intValue);
                                        executeFast.step();
                                        executeFast.dispose();
                                    }
                                }
                                z12 = false;
                                queryFinalized5.dispose();
                            } else {
                                str = "SELECT max(end) FROM media_holes_topics WHERE uid = ";
                                str2 = "t.tag = ";
                                j10 = clientUserId;
                                arrayList = arrayList6;
                                i10 = i20;
                                z12 = false;
                            }
                            kg.q0 q0Var = anonymousClass14.val$tag;
                            if (q0Var != null) {
                                if (!TextUtils.isEmpty(q0Var.f13825f)) {
                                    j12 = anonymousClass14.val$tag.f13825f.hashCode();
                                } else {
                                    j12 = anonymousClass14.val$tag.f13826g;
                                }
                                str3 = "INNER JOIN tag_message_id t ON m.mid = t.mid";
                                anonymousClass1 = str2 + j12 + " AND";
                            } else {
                                str3 = "";
                                anonymousClass1 = "";
                            }
                            int i21 = anonymousClass14.val$max_id;
                            z11 = z12;
                            try {
                                try {
                                    if (i21 != 0) {
                                        try {
                                            long j16 = anonymousClass14.val$topicId;
                                            if (j16 != 0) {
                                                Locale locale5 = Locale.US;
                                                str11 = " WHERE ";
                                                str10 = " AND m.topic_id = ";
                                                anonymousClass12 = anonymousClass1;
                                                queryFinalized4 = database.queryFinalized("SELECT start, end FROM media_holes_topics WHERE uid = " + anonymousClass14.val$uid + " AND topic_id = " + j16 + " AND type = " + anonymousClass14.val$type + " AND start <= " + i21 + " ORDER BY end DESC LIMIT 1", new Object[0]);
                                                i15 = 0;
                                            } else {
                                                anonymousClass12 = anonymousClass1;
                                                str10 = " AND m.topic_id = ";
                                                str11 = " WHERE ";
                                                Locale locale6 = Locale.US;
                                                try {
                                                    i15 = 0;
                                                    queryFinalized4 = database.queryFinalized("SELECT start, end FROM media_holes_v2 WHERE uid = " + anonymousClass14.val$uid + " AND type = " + anonymousClass14.val$type + " AND start <= " + i21 + " ORDER BY end DESC LIMIT 1", new Object[0]);
                                                } catch (Exception e10) {
                                                    e = e10;
                                                    anonymousClass1 = anonymousClass14;
                                                    anonymousClass14 = anonymousClass1;
                                                    tL_messages_messages2 = tL_messages_messages3;
                                                    tL_messages_messages2.messages.clear();
                                                    tL_messages_messages2.chats.clear();
                                                    tL_messages_messages2.users.clear();
                                                    FileLog.e(e);
                                                    r4Var = new r4(anonymousClass14, anonymousClass14, anonymousClass14.val$classGuid, 1);
                                                    AndroidUtilities.runOnUIThread(r4Var);
                                                    MediaDataController.this.processLoadedMedia(tL_messages_messages2, anonymousClass14.val$uid, anonymousClass14.val$count, anonymousClass14.val$max_id, anonymousClass14.val$min_id, anonymousClass14.val$type, anonymousClass14.val$topicId, anonymousClass14.val$fromCache, anonymousClass14.val$classGuid, anonymousClass14.val$isChannel, z14, anonymousClass14.val$requestIndex);
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    anonymousClass1 = anonymousClass14;
                                                    anonymousClass14 = anonymousClass1;
                                                    tL_messages_messages2 = tL_messages_messages3;
                                                    AndroidUtilities.runOnUIThread(new r4(anonymousClass14, anonymousClass14, anonymousClass14.val$classGuid, 1));
                                                    MediaDataController.this.processLoadedMedia(tL_messages_messages2, anonymousClass14.val$uid, anonymousClass14.val$count, anonymousClass14.val$max_id, anonymousClass14.val$min_id, anonymousClass14.val$type, anonymousClass14.val$topicId, anonymousClass14.val$fromCache, anonymousClass14.val$classGuid, anonymousClass14.val$isChannel, false, anonymousClass14.val$requestIndex);
                                                    throw th;
                                                }
                                            }
                                            if (queryFinalized4.next()) {
                                                queryFinalized4.intValue(i15);
                                                i16 = queryFinalized4.intValue(1);
                                            } else {
                                                i16 = 0;
                                            }
                                            queryFinalized4.dispose();
                                            long j17 = anonymousClass14.val$topicId;
                                            if (j17 == 0) {
                                                sQLiteDatabase2 = database;
                                                int i22 = i10;
                                                String str12 = str11;
                                                String str13 = anonymousClass12;
                                                if (i16 > 1) {
                                                    Locale locale7 = Locale.US;
                                                    queryFinalized = sQLiteDatabase2.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + str12 + str13 + " m.uid = " + this.val$uid + " AND m.mid > 0 AND m.mid < " + this.val$max_id + " AND m.mid >= " + i16 + " AND m.type = " + this.val$type + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i22, new Object[0]);
                                                    z11 = false;
                                                    anonymousClass13 = this;
                                                    anonymousClass14 = anonymousClass13;
                                                    sQLiteDatabase = sQLiteDatabase2;
                                                } else {
                                                    try {
                                                        Locale locale8 = Locale.US;
                                                        anonymousClass13 = this;
                                                        sQLiteDatabase2 = sQLiteDatabase2;
                                                        queryFinalized = sQLiteDatabase2.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + str12 + str13 + " m.uid = " + anonymousClass13.val$uid + " AND m.mid > 0 AND m.mid < " + anonymousClass13.val$max_id + " AND m.type = " + anonymousClass13.val$type + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i22, new Object[0]);
                                                        anonymousClass14 = anonymousClass13;
                                                        sQLiteDatabase = sQLiteDatabase2;
                                                    } catch (Exception e11) {
                                                        e = e11;
                                                        anonymousClass1 = this;
                                                        anonymousClass14 = anonymousClass1;
                                                        tL_messages_messages2 = tL_messages_messages3;
                                                        tL_messages_messages2.messages.clear();
                                                        tL_messages_messages2.chats.clear();
                                                        tL_messages_messages2.users.clear();
                                                        FileLog.e(e);
                                                        r4Var = new r4(anonymousClass14, anonymousClass14, anonymousClass14.val$classGuid, 1);
                                                        AndroidUtilities.runOnUIThread(r4Var);
                                                        MediaDataController.this.processLoadedMedia(tL_messages_messages2, anonymousClass14.val$uid, anonymousClass14.val$count, anonymousClass14.val$max_id, anonymousClass14.val$min_id, anonymousClass14.val$type, anonymousClass14.val$topicId, anonymousClass14.val$fromCache, anonymousClass14.val$classGuid, anonymousClass14.val$isChannel, z14, anonymousClass14.val$requestIndex);
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        anonymousClass1 = this;
                                                        anonymousClass14 = anonymousClass1;
                                                        tL_messages_messages2 = tL_messages_messages3;
                                                        AndroidUtilities.runOnUIThread(new r4(anonymousClass14, anonymousClass14, anonymousClass14.val$classGuid, 1));
                                                        MediaDataController.this.processLoadedMedia(tL_messages_messages2, anonymousClass14.val$uid, anonymousClass14.val$count, anonymousClass14.val$max_id, anonymousClass14.val$min_id, anonymousClass14.val$type, anonymousClass14.val$topicId, anonymousClass14.val$fromCache, anonymousClass14.val$classGuid, anonymousClass14.val$isChannel, false, anonymousClass14.val$requestIndex);
                                                        throw th;
                                                    }
                                                }
                                            } else if (i16 > 1) {
                                                Locale locale9 = Locale.US;
                                                queryFinalized = database.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + str11 + ((String) anonymousClass12) + " m.uid = " + anonymousClass14.val$uid + str10 + j17 + " AND m.mid > 0 AND m.mid < " + anonymousClass14.val$max_id + " AND m.mid >= " + i16 + " AND m.type = " + anonymousClass14.val$type + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i10, new Object[0]);
                                                anonymousClass13 = anonymousClass14;
                                                sQLiteDatabase2 = database;
                                                z11 = false;
                                                anonymousClass14 = anonymousClass13;
                                                sQLiteDatabase = sQLiteDatabase2;
                                            } else {
                                                String str14 = str11;
                                                String str15 = str10;
                                                String str16 = anonymousClass12;
                                                Locale locale10 = Locale.US;
                                                sQLiteDatabase2 = database;
                                                queryFinalized = sQLiteDatabase2.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + str14 + str16 + " m.uid = " + anonymousClass14.val$uid + str15 + j17 + " AND m.mid > 0 AND m.mid < " + anonymousClass14.val$max_id + " AND m.type = " + anonymousClass14.val$type + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i10, new Object[0]);
                                                anonymousClass13 = this;
                                                anonymousClass14 = anonymousClass13;
                                                sQLiteDatabase = sQLiteDatabase2;
                                            }
                                            z10 = z13;
                                        } catch (Exception e12) {
                                            e = e12;
                                            tL_messages_messages2 = tL_messages_messages3;
                                            tL_messages_messages2.messages.clear();
                                            tL_messages_messages2.chats.clear();
                                            tL_messages_messages2.users.clear();
                                            FileLog.e(e);
                                            r4Var = new r4(anonymousClass14, anonymousClass14, anonymousClass14.val$classGuid, 1);
                                            AndroidUtilities.runOnUIThread(r4Var);
                                            MediaDataController.this.processLoadedMedia(tL_messages_messages2, anonymousClass14.val$uid, anonymousClass14.val$count, anonymousClass14.val$max_id, anonymousClass14.val$min_id, anonymousClass14.val$type, anonymousClass14.val$topicId, anonymousClass14.val$fromCache, anonymousClass14.val$classGuid, anonymousClass14.val$isChannel, z14, anonymousClass14.val$requestIndex);
                                        } catch (Throwable th4) {
                                            th = th4;
                                            tL_messages_messages2 = tL_messages_messages3;
                                            AndroidUtilities.runOnUIThread(new r4(anonymousClass14, anonymousClass14, anonymousClass14.val$classGuid, 1));
                                            MediaDataController.this.processLoadedMedia(tL_messages_messages2, anonymousClass14.val$uid, anonymousClass14.val$count, anonymousClass14.val$max_id, anonymousClass14.val$min_id, anonymousClass14.val$type, anonymousClass14.val$topicId, anonymousClass14.val$fromCache, anonymousClass14.val$classGuid, anonymousClass14.val$isChannel, false, anonymousClass14.val$requestIndex);
                                            throw th;
                                        }
                                    } else {
                                        SQLiteDatabase sQLiteDatabase3 = database;
                                        String str17 = anonymousClass1;
                                        int i23 = i10;
                                        anonymousClass1 = anonymousClass14;
                                        int i24 = anonymousClass1.val$min_id;
                                        if (i24 != 0) {
                                            long j18 = anonymousClass1.val$topicId;
                                            if (j18 != 0) {
                                                Locale locale11 = Locale.US;
                                                str9 = str17;
                                                str7 = " m.uid = ";
                                                str8 = " WHERE ";
                                                queryFinalized3 = sQLiteDatabase3.queryFinalized("SELECT start, end FROM media_holes_topics WHERE uid = " + anonymousClass1.val$uid + " AND topic_id = " + j18 + " AND type = " + anonymousClass1.val$type + " AND end >= " + i24 + " ORDER BY end ASC LIMIT 1", new Object[0]);
                                                i13 = 0;
                                            } else {
                                                str7 = " m.uid = ";
                                                str8 = " WHERE ";
                                                str9 = str17;
                                                Locale locale12 = Locale.US;
                                                try {
                                                    i13 = 0;
                                                    queryFinalized3 = sQLiteDatabase3.queryFinalized("SELECT start, end FROM media_holes_v2 WHERE uid = " + anonymousClass1.val$uid + " AND type = " + anonymousClass1.val$type + " AND end >= " + i24 + " ORDER BY end ASC LIMIT 1", new Object[0]);
                                                } catch (Exception e13) {
                                                    e = e13;
                                                    anonymousClass14 = anonymousClass1;
                                                    tL_messages_messages2 = tL_messages_messages3;
                                                    tL_messages_messages2.messages.clear();
                                                    tL_messages_messages2.chats.clear();
                                                    tL_messages_messages2.users.clear();
                                                    FileLog.e(e);
                                                    r4Var = new r4(anonymousClass14, anonymousClass14, anonymousClass14.val$classGuid, 1);
                                                    AndroidUtilities.runOnUIThread(r4Var);
                                                    MediaDataController.this.processLoadedMedia(tL_messages_messages2, anonymousClass14.val$uid, anonymousClass14.val$count, anonymousClass14.val$max_id, anonymousClass14.val$min_id, anonymousClass14.val$type, anonymousClass14.val$topicId, anonymousClass14.val$fromCache, anonymousClass14.val$classGuid, anonymousClass14.val$isChannel, z14, anonymousClass14.val$requestIndex);
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    anonymousClass14 = anonymousClass1;
                                                    tL_messages_messages2 = tL_messages_messages3;
                                                    AndroidUtilities.runOnUIThread(new r4(anonymousClass14, anonymousClass14, anonymousClass14.val$classGuid, 1));
                                                    MediaDataController.this.processLoadedMedia(tL_messages_messages2, anonymousClass14.val$uid, anonymousClass14.val$count, anonymousClass14.val$max_id, anonymousClass14.val$min_id, anonymousClass14.val$type, anonymousClass14.val$topicId, anonymousClass14.val$fromCache, anonymousClass14.val$classGuid, anonymousClass14.val$isChannel, false, anonymousClass14.val$requestIndex);
                                                    throw th;
                                                }
                                            }
                                            if (queryFinalized3.next()) {
                                                i14 = queryFinalized3.intValue(i13);
                                                queryFinalized3.intValue(1);
                                            } else {
                                                i14 = 0;
                                            }
                                            queryFinalized3.dispose();
                                            long j19 = anonymousClass1.val$topicId;
                                            if (j19 != 0) {
                                                if (i14 > 1) {
                                                    Locale locale13 = Locale.US;
                                                    queryFinalized = sQLiteDatabase3.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + str8 + str9 + str7 + anonymousClass1.val$uid + " AND m.topic_id = " + j19 + " AND m.mid > 0 AND m.mid >= " + anonymousClass1.val$min_id + " AND m.mid <= " + i14 + " AND m.type = " + anonymousClass1.val$type + " ORDER BY m.date ASC, m.mid ASC LIMIT " + i23, new Object[0]);
                                                    anonymousClass14 = anonymousClass1;
                                                } else {
                                                    String str18 = str7;
                                                    String str19 = str8;
                                                    String str20 = str9;
                                                    Locale locale14 = Locale.US;
                                                    sQLiteDatabase3 = sQLiteDatabase3;
                                                    queryFinalized = sQLiteDatabase3.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + str19 + str20 + str18 + anonymousClass1.val$uid + " AND m.topic_id = " + j19 + " AND m.mid > 0 AND m.mid >= " + anonymousClass1.val$min_id + " AND m.type = " + anonymousClass1.val$type + " ORDER BY m.date ASC, m.mid ASC LIMIT " + i23, new Object[0]);
                                                    z11 = true;
                                                    anonymousClass14 = this;
                                                }
                                                sQLiteDatabase = sQLiteDatabase3;
                                            } else {
                                                String str21 = str7;
                                                String str22 = str8;
                                                String str23 = str9;
                                                if (i14 > 1) {
                                                    Locale locale15 = Locale.US;
                                                    sQLiteDatabase = sQLiteDatabase3;
                                                    queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + str22 + str23 + str21 + this.val$uid + " AND m.mid > 0 AND m.mid >= " + this.val$min_id + " AND m.mid <= " + i14 + " AND m.type = " + this.val$type + " ORDER BY m.date ASC, m.mid ASC LIMIT " + i23, new Object[0]);
                                                    anonymousClass14 = this;
                                                } else {
                                                    sQLiteDatabase = sQLiteDatabase3;
                                                    Locale locale16 = Locale.US;
                                                    anonymousClass14 = this;
                                                    queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + str22 + str23 + str21 + anonymousClass14.val$uid + " AND m.mid > 0 AND m.mid >= " + anonymousClass14.val$min_id + " AND m.type = " + anonymousClass14.val$type + " ORDER BY m.date ASC, m.mid ASC LIMIT " + i23, new Object[0]);
                                                    z11 = true;
                                                }
                                            }
                                            z13 = true;
                                        } else {
                                            anonymousClass14 = anonymousClass1;
                                            sQLiteDatabase = sQLiteDatabase3;
                                            long j20 = anonymousClass14.val$topicId;
                                            if (j20 != 0) {
                                                Locale locale17 = Locale.US;
                                                str4 = " m.uid = ";
                                                str5 = "SELECT m.data, m.mid FROM media_v4 m ";
                                                i11 = i23;
                                                str6 = " AND m.type = ";
                                                queryFinalized2 = sQLiteDatabase.queryFinalized(str + anonymousClass14.val$uid + " AND topic_id = " + j20 + " AND type = " + anonymousClass14.val$type, new Object[0]);
                                                i12 = 0;
                                            } else {
                                                str4 = " m.uid = ";
                                                str5 = "SELECT m.data, m.mid FROM media_v4 m ";
                                                str6 = " AND m.type = ";
                                                i11 = i23;
                                                Locale locale18 = Locale.US;
                                                i12 = 0;
                                                queryFinalized2 = sQLiteDatabase.queryFinalized("SELECT max(end) FROM media_holes_v2 WHERE uid = " + anonymousClass14.val$uid + " AND type = " + anonymousClass14.val$type, new Object[0]);
                                            }
                                            int intValue2 = queryFinalized2.next() ? queryFinalized2.intValue(i12) : 0;
                                            queryFinalized2.dispose();
                                            long j21 = anonymousClass14.val$topicId;
                                            if (j21 == 0) {
                                                int i25 = i11;
                                                String str24 = str6;
                                                String str25 = str4;
                                                if (intValue2 > 1) {
                                                    Locale locale19 = Locale.US;
                                                    anonymousClass14 = this;
                                                    queryFinalized = sQLiteDatabase.queryFinalized(str5 + str3 + " WHERE " + str17 + str25 + anonymousClass14.val$uid + " AND m.mid >= " + intValue2 + str24 + anonymousClass14.val$type + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i25, new Object[0]);
                                                } else {
                                                    anonymousClass14 = this;
                                                    Locale locale20 = Locale.US;
                                                    queryFinalized = sQLiteDatabase.queryFinalized(str5 + str3 + " WHERE " + str17 + str25 + anonymousClass14.val$uid + " AND m.mid > 0 AND m.type = " + anonymousClass14.val$type + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i25, new Object[0]);
                                                }
                                            } else if (intValue2 > 1) {
                                                Locale locale21 = Locale.US;
                                                queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + " WHERE " + str17 + str4 + anonymousClass14.val$uid + " AND m.topic_id = " + j21 + " AND m.mid >= " + intValue2 + str6 + anonymousClass14.val$type + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i11, new Object[0]);
                                            } else {
                                                int i26 = i11;
                                                String str26 = str4;
                                                Locale locale22 = Locale.US;
                                                queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + " WHERE " + str17 + str26 + anonymousClass14.val$uid + " AND m.topic_id = " + j21 + " AND m.mid > 0 AND m.type = " + anonymousClass14.val$type + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i26, new Object[0]);
                                                z13 = false;
                                                anonymousClass14 = this;
                                            }
                                        }
                                        z10 = z13;
                                    }
                                    z13 = false;
                                    z10 = z13;
                                } catch (Exception e14) {
                                    e = e14;
                                } catch (Throwable th6) {
                                    th = th6;
                                }
                            } catch (Exception e15) {
                                e = e15;
                                anonymousClass14 = this;
                            } catch (Throwable th7) {
                                th = th7;
                                anonymousClass14 = this;
                            }
                        } else {
                            j10 = clientUserId;
                            arrayList = arrayList6;
                            sQLiteDatabase = database;
                            long j22 = anonymousClass14.val$topicId;
                            if (j22 != 0) {
                                int i27 = anonymousClass14.val$max_id;
                                if (i27 != 0) {
                                    Locale locale23 = Locale.US;
                                    queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_topics as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + anonymousClass14.val$uid + " AND m.topic_id = " + j22 + " AND m.mid > " + i27 + " AND type = " + anonymousClass14.val$type + " ORDER BY m.mid ASC LIMIT " + i20, new Object[0]);
                                } else {
                                    int i28 = anonymousClass14.val$min_id;
                                    if (i28 != 0) {
                                        Locale locale24 = Locale.US;
                                        queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_topics as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + anonymousClass14.val$uid + " AND m.topic_id = " + j22 + " AND m.mid < " + i28 + " AND type = " + anonymousClass14.val$type + " ORDER BY m.mid DESC LIMIT " + i20, new Object[0]);
                                    } else {
                                        Locale locale25 = Locale.US;
                                        queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_topics as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + anonymousClass14.val$uid + " AND m.topic_id = " + j22 + " AND type = " + anonymousClass14.val$type + " ORDER BY m.mid ASC LIMIT " + i20, new Object[0]);
                                    }
                                }
                            } else {
                                int i29 = anonymousClass14.val$max_id;
                                if (i29 != 0) {
                                    Locale locale26 = Locale.US;
                                    queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_v4 as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + anonymousClass14.val$uid + " AND m.mid > " + i29 + " AND type = " + anonymousClass14.val$type + " ORDER BY m.mid ASC LIMIT " + i20, new Object[0]);
                                } else {
                                    int i30 = anonymousClass14.val$min_id;
                                    if (i30 != 0) {
                                        Locale locale27 = Locale.US;
                                        queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_v4 as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + anonymousClass14.val$uid + " AND m.mid < " + i30 + " AND type = " + anonymousClass14.val$type + " ORDER BY m.mid DESC LIMIT " + i20, new Object[0]);
                                    } else {
                                        Locale locale28 = Locale.US;
                                        queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_v4 as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + anonymousClass14.val$uid + " AND type = " + anonymousClass14.val$type + " ORDER BY m.mid ASC LIMIT " + i20, new Object[0]);
                                    }
                                }
                            }
                            z10 = false;
                            z11 = true;
                        }
                        Object obj = null;
                        HashSet hashSet = anonymousClass14.val$tag != null ? new HashSet() : null;
                        while (queryFinalized.next()) {
                            NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                            if (byteBufferValue != null) {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                j11 = j10;
                                TLdeserialize.readAttachPath(byteBufferValue, j11);
                                byteBufferValue.reuse();
                                TLdeserialize.f22413id = queryFinalized.intValue(1);
                                long j23 = anonymousClass14.val$uid;
                                TLdeserialize.dialog_id = j23;
                                if (DialogObject.isEncryptedDialog(j23)) {
                                    TLdeserialize.random_id = queryFinalized.longValue(2);
                                }
                                long j24 = TLdeserialize.grouped_id;
                                if (j24 != 0 && hashSet != null) {
                                    hashSet.add(Long.valueOf(j24));
                                }
                                if (z10) {
                                    tL_messages_messages = tL_messages_messages3;
                                    tL_messages_messages.messages.add(0, TLdeserialize);
                                } else {
                                    tL_messages_messages = tL_messages_messages3;
                                    tL_messages_messages.messages.add(TLdeserialize);
                                }
                                arrayList3 = arrayList7;
                                arrayList4 = arrayList;
                                MessagesStorage.addUsersAndChatsFromMessage(TLdeserialize, arrayList3, arrayList4, null);
                            } else {
                                tL_messages_messages = tL_messages_messages3;
                                arrayList3 = arrayList7;
                                j11 = j10;
                                arrayList4 = arrayList;
                            }
                            arrayList7 = arrayList3;
                            arrayList = arrayList4;
                            j10 = j11;
                            tL_messages_messages3 = tL_messages_messages;
                        }
                        tL_messages_messages2 = tL_messages_messages3;
                        ArrayList<Long> arrayList8 = arrayList7;
                        long j25 = j10;
                        ArrayList arrayList9 = arrayList;
                        queryFinalized.dispose();
                        if (anonymousClass14.val$tag != null && !hashSet.isEmpty()) {
                            Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                Long l10 = (Long) it.next();
                                long longValue = l10.longValue();
                                int i31 = 0;
                                while (true) {
                                    if (i31 >= tL_messages_messages2.messages.size()) {
                                        i31 = -1;
                                        break;
                                    } else if (tL_messages_messages2.messages.get(i31).grouped_id == longValue) {
                                        break;
                                    } else {
                                        i31++;
                                    }
                                }
                                if (i31 >= 0) {
                                    SQLiteCursor queryFinalized6 = sQLiteDatabase.queryFinalized("SELECT data, mid FROM messages_v2 WHERE uid = ? AND group_id = ? ORDER BY mid DESC", Long.valueOf(anonymousClass14.val$uid), l10);
                                    ArrayList arrayList10 = new ArrayList();
                                    while (queryFinalized6.next()) {
                                        int intValue3 = queryFinalized6.intValue(1);
                                        NativeByteBuffer byteBufferValue2 = queryFinalized6.byteBufferValue(0);
                                        if (byteBufferValue2 != null) {
                                            TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                            TLdeserialize2.readAttachPath(byteBufferValue2, j25);
                                            byteBufferValue2.reuse();
                                            TLdeserialize2.f22413id = intValue3;
                                            TLdeserialize2.dialog_id = anonymousClass14.val$uid;
                                            arrayList10.add(TLdeserialize2);
                                            MessagesStorage.addUsersAndChatsFromMessage(TLdeserialize2, arrayList8, arrayList9, null);
                                            obj = null;
                                        }
                                    }
                                    Object obj2 = obj;
                                    if (z10) {
                                        Collections.reverse(arrayList10);
                                    }
                                    tL_messages_messages2.messages.remove(i31);
                                    tL_messages_messages2.messages.addAll(i31, arrayList10);
                                    queryFinalized6.dispose();
                                    obj = obj2;
                                }
                            }
                        }
                        if (!arrayList8.isEmpty()) {
                            MediaDataController.this.getMessagesStorage().getUsersInternal(arrayList8, tL_messages_messages2.users);
                        }
                        if (!arrayList9.isEmpty()) {
                            MediaDataController.this.getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList9), tL_messages_messages2.chats);
                        }
                        if (tL_messages_messages2.messages.size() > anonymousClass14.val$count && anonymousClass14.val$min_id == 0) {
                            tL_messages_messages2.messages.remove(arrayList2.size() - 1);
                        } else {
                            z14 = anonymousClass14.val$min_id != 0 ? false : z11;
                        }
                        r4Var = new r4(anonymousClass14, anonymousClass14, anonymousClass14.val$classGuid, 1);
                    } catch (Exception e16) {
                        e = e16;
                    } catch (Throwable th8) {
                        th = th8;
                    }
                } catch (Throwable th9) {
                    th = th9;
                }
            } catch (Exception e17) {
                e = e17;
            }
            AndroidUtilities.runOnUIThread(r4Var);
            MediaDataController.this.processLoadedMedia(tL_messages_messages2, anonymousClass14.val$uid, anonymousClass14.val$count, anonymousClass14.val$max_id, anonymousClass14.val$min_id, anonymousClass14.val$type, anonymousClass14.val$topicId, anonymousClass14.val$fromCache, anonymousClass14.val$classGuid, anonymousClass14.val$isChannel, z14, anonymousClass14.val$requestIndex);
        }
    }

    public class AnonymousClass2 implements Runnable {
        final ArrayList val$previewItems;

        public AnonymousClass2(ArrayList arrayList) {
            MediaDataController.this = r1;
            this.val$previewItems = arrayList;
        }

        public void lambda$run$0(ArrayList arrayList) {
            MediaDataController.this.defaultEmojiThemes.clear();
            MediaDataController.this.defaultEmojiThemes.addAll(arrayList);
        }

        @Override
        public void run() {
            for (int i10 = 0; i10 < this.val$previewItems.size(); i10++) {
                if (this.val$previewItems.get(i10) != null && ((fp) this.val$previewItems.get(i10)).f28512a != null) {
                    ((fp) this.val$previewItems.get(i10)).f28512a.n(0);
                }
            }
            AndroidUtilities.runOnUIThread(new d3(8, this, this.val$previewItems));
        }
    }

    public class AnonymousClass3 implements Runnable {
        final int val$currentAccount;
        final ArrayList val$previewItems;

        public AnonymousClass3(ArrayList arrayList, int i10) {
            MediaDataController.this = r1;
            this.val$previewItems = arrayList;
            this.val$currentAccount = i10;
        }

        public void lambda$run$0(ArrayList arrayList) {
            MediaDataController.this.defaultEmojiThemes.clear();
            MediaDataController.this.defaultEmojiThemes.addAll(arrayList);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.emojiPreviewThemesChanged, new Object[0]);
        }

        @Override
        public void run() {
            for (int i10 = 0; i10 < this.val$previewItems.size(); i10++) {
                ((fp) this.val$previewItems.get(i10)).f28512a.n(this.val$currentAccount);
            }
            AndroidUtilities.runOnUIThread(new d3(9, this, this.val$previewItems));
        }
    }

    public static class DraftVoice {
        public long f19615id;
        public boolean once;
        public String path;
        public short[] recordSamples;
        public long recordTimeCount;
        public long samplesCount;
        public int writedFrame;
        public float left = 0.0f;
        public float right = 1.0f;

        public static DraftVoice fromString(String str) {
            boolean z10;
            if (str == null) {
                return null;
            }
            try {
                if (!str.startsWith("@")) {
                    return null;
                }
                boolean z11 = true;
                String[] split = str.substring(1).split("\n");
                if (split.length < 6) {
                    return null;
                }
                DraftVoice draftVoice = new DraftVoice();
                int i10 = 0;
                draftVoice.path = split[0];
                draftVoice.samplesCount = Long.parseLong(split[1]);
                draftVoice.writedFrame = Integer.parseInt(split[2]);
                draftVoice.recordTimeCount = Long.parseLong(split[3]);
                if (split[4].contains(";")) {
                    String[] split2 = split[4].split(";");
                    if (Integer.parseInt(split2[0]) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    draftVoice.once = z10;
                    draftVoice.left = Float.parseFloat(split2[1]);
                    draftVoice.right = Float.parseFloat(split2[2]);
                } else {
                    if (Integer.parseInt(split[4]) == 0) {
                        z11 = false;
                    }
                    draftVoice.once = z11;
                    draftVoice.left = 0.0f;
                    draftVoice.right = 1.0f;
                }
                int length = split.length - 5;
                String[] strArr = new String[length];
                for (int i11 = 0; i11 < length; i11++) {
                    strArr[i11] = split[i11 + 5];
                }
                String join = TextUtils.join("\n", strArr);
                draftVoice.recordSamples = new short[join.length()];
                while (true) {
                    short[] sArr = draftVoice.recordSamples;
                    if (i10 < sArr.length) {
                        sArr[i10] = (short) join.charAt(i10);
                        i10++;
                    } else {
                        return draftVoice;
                    }
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                return null;
            }
        }

        public static DraftVoice of(MediaController mediaController, String str, boolean z10, float f9, float f10) {
            if (mediaController.recordingAudio == null) {
                return null;
            }
            DraftVoice draftVoice = new DraftVoice();
            draftVoice.path = str;
            draftVoice.samplesCount = mediaController.samplesCount;
            draftVoice.writedFrame = mediaController.writtenFrame;
            draftVoice.recordTimeCount = mediaController.recordTimeCount;
            draftVoice.f19615id = mediaController.recordingAudio.f22398id;
            draftVoice.recordSamples = mediaController.recordSamples;
            draftVoice.once = z10;
            draftVoice.left = f9;
            draftVoice.right = f10;
            return draftVoice;
        }

        public String toString() {
            char[] cArr = new char[this.recordSamples.length];
            int i10 = 0;
            while (true) {
                short[] sArr = this.recordSamples;
                if (i10 < sArr.length) {
                    cArr[i10] = (char) sArr[i10];
                    i10++;
                } else {
                    return "@" + this.path + "\n" + this.samplesCount + "\n" + this.writedFrame + "\n" + this.recordTimeCount + "\n" + (this.once ? 1 : 0) + ";" + this.left + ";" + this.right + "\n" + new String(cArr);
                }
            }
        }
    }

    public static class KeywordResult {
        public String emoji;
        public String keyword;

        public KeywordResult() {
        }

        public KeywordResult(String str, String str2) {
            this.emoji = str;
            this.keyword = str2;
        }
    }

    public interface KeywordResultCallback {
        void run(ArrayList<KeywordResult> arrayList, String str);
    }

    public static class SearchStickersKey {
        public final boolean emojis;
        public final String lang_code;
        public final String f19616q;

        public SearchStickersKey(boolean z10, String str, String str2) {
            this.emojis = z10;
            this.lang_code = str;
            this.f19616q = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                SearchStickersKey searchStickersKey = (SearchStickersKey) obj;
                if (this.emojis == searchStickersKey.emojis && Objects.equals(this.lang_code, searchStickersKey.lang_code) && Objects.equals(this.f19616q, searchStickersKey.f19616q)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Boolean.valueOf(this.emojis), this.lang_code, this.f19616q);
        }
    }

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            lockObjects[i10] = new Object();
        }
        SHORTCUT_TYPE_USER_OR_CHAT = 0;
        SHORTCUT_TYPE_ATTACHED_BOT = 1;
        entityComparator = new q(8);
    }

    public MediaDataController(int i10) {
        super(i10);
        String key;
        long longValue;
        SerializedData serializedData;
        boolean z10;
        int i11;
        long j10;
        this.attachMenuBots = new TLRPC.TL_attachMenuBots();
        this.reactionsList = new ArrayList();
        this.enabledReactionsList = new ArrayList();
        this.reactionsMap = new HashMap<>();
        this.stickerSets = new ArrayList[]{new ArrayList<>(), new ArrayList<>(), new ArrayList<>(0), new ArrayList<>(), new ArrayList<>(), new ArrayList<>()};
        this.stickersByIds = new a0.h[]{new a0.h(), new a0.h(), new a0.h(), new a0.h(), new a0.h(), new a0.h()};
        this.stickerSetsById = new a0.h();
        this.installedStickerSetsById = new a0.h();
        this.installedForceStickerSetsById = new ArrayList<>();
        this.uninstalledForceStickerSetsById = new ArrayList<>();
        this.groupStickerSets = new a0.h();
        this.stickerSetsByName = new ConcurrentHashMap<>(100, 1.0f, 1);
        this.stickerSetDefaultStatuses = null;
        this.stickerSetDefaultChannelStatuses = null;
        this.diceStickerSetsByEmoji = new HashMap<>();
        this.diceEmojiStickerSetsById = new a0.h();
        this.loadingDiceStickerSets = new HashSet<>();
        this.removingStickerSetsUndos = new a0.h();
        this.scheduledLoadStickers = new Runnable[7];
        this.loadingStickers = new boolean[7];
        this.stickersLoaded = new boolean[7];
        this.loadHash = new long[7];
        this.loadDate = new int[7];
        this.ringtoneUploaderHashMap = new HashMap<>();
        this.verifyingMessages = new HashMap<>();
        this.archivedStickersCount = new int[7];
        this.stickersByEmoji = new a0.h();
        this.allStickers = new HashMap<>();
        this.allStickersFeatured = new HashMap<>();
        this.recentStickers = new ArrayList[]{new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>()};
        this.loadingRecentStickers = new boolean[9];
        this.recentStickersLoaded = new boolean[9];
        this.recentGifs = new ArrayList<>();
        this.loadFeaturedHash = new long[2];
        this.loadFeaturedDate = new int[2];
        this.featuredStickerSets = new ArrayList[]{new ArrayList<>(), new ArrayList<>()};
        this.featuredStickerSetsById = new a0.h[]{new a0.h(), new a0.h()};
        this.unreadStickerSets = new ArrayList[]{new ArrayList<>(), new ArrayList<>()};
        this.readingStickerSets = new ArrayList[]{new ArrayList<>(), new ArrayList<>()};
        this.loadingFeaturedStickers = new boolean[2];
        this.featuredStickersLoaded = new boolean[2];
        this.defaultEmojiThemes = new ArrayList<>();
        this.premiumPreviewStickers = new ArrayList<>();
        this.emojiStatusesHash = new long[4];
        this.emojiStatuses = new ArrayList[4];
        this.emojiStatusesFetchDate = new Long[4];
        this.emojiStatusesFromCacheFetched = new boolean[4];
        this.emojiStatusesFetching = new boolean[4];
        this.loadingStickerSetsKeys = new HashSet<>();
        this.loadingStickerSets = new HashMap<>();
        this.messagesSearchCount = new int[]{0, 0};
        this.messagesSearchEndReached = new boolean[]{false, false};
        this.searchResultMessages = new ArrayList<>();
        this.searchServerResultMessages = new ArrayList<>();
        this.searchLocalResultMessages = new ArrayList<>();
        this.searchServerResultMessagesMap = new SparseArray[]{new SparseArray<>(), new SparseArray<>()};
        this.deletedFromResultMessages = new ArrayList<>();
        this.hints = new ArrayList<>();
        this.inlineBots = new ArrayList<>();
        this.guestBots = new ArrayList<>();
        this.webapps = new ArrayList<>();
        this.shortcutCallbacks = new HashMap<>();
        this.loadingPinnedMessages = new a0.h();
        this.draftsFolderIds = new a0.h();
        this.drafts = new a0.h();
        this.draftMessages = new a0.h();
        this.botInfos = new HashMap<>();
        this.botDialogKeyboards = new a0.h();
        this.botKeyboards = new HashMap<>();
        this.botKeyboardsByMids = new a0.h();
        this.currentFetchingEmoji = new HashMap<>();
        this.fetchedEmoji = new HashSet<>();
        this.triedLoadingEmojipacks = false;
        this.recentReactions = new ArrayList<>();
        this.topReactions = new ArrayList<>();
        this.savedReactions = new ArrayList<>();
        this.draftVoicesLoaded = false;
        this.draftVoices = new a0.h();
        this.loadingSearchStickersKeys = new HashMap<>();
        this.searchStickerResults = new android.util.LruCache<>(25);
        if (this.currentAccount == 0) {
            this.draftPreferences = ApplicationLoader.applicationContext.getSharedPreferences("drafts", 0);
        } else {
            Context context = ApplicationLoader.applicationContext;
            this.draftPreferences = context.getSharedPreferences("drafts" + this.currentAccount, 0);
        }
        ArrayList<TLRPC.Message> arrayList = new ArrayList<>();
        for (Map.Entry<String, ?> entry : this.draftPreferences.getAll().entrySet()) {
            try {
                key = entry.getKey();
                longValue = Utilities.parseLong(key).longValue();
                serializedData = new SerializedData(Utilities.hexToBytes((String) entry.getValue()));
            } catch (Exception unused) {
            }
            if (!key.startsWith("r_")) {
                z10 = key.startsWith("rt_");
                if (!z10) {
                    TLRPC.DraftMessage TLdeserialize = TLRPC.DraftMessage.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                    if (TLdeserialize != null) {
                        a0.h hVar = (a0.h) this.drafts.f(longValue);
                        if (hVar == null) {
                            hVar = new a0.h();
                            this.drafts.k(hVar, longValue);
                        }
                        if (key.startsWith("t_")) {
                            j10 = Utilities.parseLong(key.substring(key.lastIndexOf(95) + 1)).longValue();
                        } else {
                            j10 = 0;
                        }
                        hVar.k(TLdeserialize, j10);
                    }
                    serializedData.cleanup();
                }
            } else {
                z10 = false;
            }
            TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            if (TLdeserialize2 != null) {
                TLdeserialize2.readAttachPath(serializedData, getUserConfig().clientUserId);
                a0.h hVar2 = (a0.h) this.draftMessages.f(longValue);
                if (hVar2 == null) {
                    hVar2 = new a0.h();
                    this.draftMessages.k(hVar2, longValue);
                }
                if (z10) {
                    i11 = Utilities.parseInt((CharSequence) key.substring(key.lastIndexOf(95) + 1)).intValue();
                } else {
                    i11 = 0;
                }
                hVar2.k(TLdeserialize2, i11);
                if (TLdeserialize2.reply_to != null) {
                    arrayList.add(TLdeserialize2);
                }
            }
            serializedData.cleanup();
        }
        loadRepliesOfDraftReplies(arrayList);
        loadStickersByEmojiOrName("tg_placeholders_android", false, true);
        loadEmojiThemes();
        loadRecentAndTopReactions(false);
        loadAvatarConstructor(false);
        loadAvatarConstructor(true);
        this.ringtoneDataStore = new ef.e(this.currentAccount);
        this.menuBotsUpdateDate = getMessagesController().getMainSettings().getInt("menuBotsUpdateDate", 0);
    }

    public static void addAnimatedEmojiSpans(ArrayList<TLRPC.MessageEntity> arrayList, CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt) {
        org.telegram.ui.Components.y5[] y5VarArr;
        org.telegram.ui.Components.y5 y5Var;
        if ((charSequence instanceof Spannable) && arrayList != null) {
            Spannable spannable = (Spannable) charSequence;
            for (org.telegram.ui.Components.y5 y5Var2 : (org.telegram.ui.Components.y5[]) spannable.getSpans(0, spannable.length(), org.telegram.ui.Components.y5.class)) {
                if (y5Var2 != null) {
                    spannable.removeSpan(y5Var2);
                }
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.MessageEntity messageEntity = arrayList.get(i10);
                if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                    int i11 = messageEntity.offset;
                    int i12 = messageEntity.length + i11;
                    if (i11 < i12 && i12 <= spannable.length()) {
                        if (tL_messageEntityCustomEmoji.document != null) {
                            y5Var = new org.telegram.ui.Components.y5(tL_messageEntityCustomEmoji.document, fontMetricsInt);
                        } else {
                            y5Var = new org.telegram.ui.Components.y5(tL_messageEntityCustomEmoji.document_id, fontMetricsInt);
                        }
                        spannable.setSpan(y5Var, i11, i12, 33);
                    }
                }
            }
        }
    }

    public static void addStyleToText(org.telegram.ui.Components.i01 r16, int r17, int r18, android.text.Spannable r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.addStyleToText(org.telegram.ui.Components.i01, int, int, android.text.Spannable, boolean):void");
    }

    public static void addTextStyleRuns(MessageObject messageObject, Spannable spannable) {
        addTextStyleRuns(messageObject.messageOwner.entities, messageObject.messageText, spannable, -1);
    }

    private ArrayList<MessageObject> broadcastPinnedMessage(ArrayList<TLRPC.Message> arrayList, ArrayList<TLRPC.User> arrayList2, ArrayList<TLRPC.Chat> arrayList3, boolean z10, boolean z11) {
        boolean z12;
        if (arrayList.isEmpty()) {
            return null;
        }
        a0.h hVar = new a0.h();
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            TLRPC.User user = arrayList2.get(i10);
            hVar.k(user, user.f22539id);
        }
        a0.h hVar2 = new a0.h();
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            TLRPC.Chat chat = arrayList3.get(i11);
            hVar2.k(chat, chat.f22392id);
        }
        ArrayList<MessageObject> arrayList4 = new ArrayList<>();
        if (z11) {
            AndroidUtilities.runOnUIThread(new tj(this, arrayList2, z10, arrayList3, 9));
            int size = arrayList.size();
            int i12 = 0;
            int i13 = 0;
            while (i13 < size) {
                TLRPC.Message message = arrayList.get(i13);
                if ((MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaDocument) || (MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaPhoto)) {
                    i12++;
                }
                a0.h hVar3 = hVar2;
                int i14 = i12;
                int i15 = this.currentAccount;
                if (i14 < 30) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                arrayList4.add(new MessageObject(i15, message, hVar, hVar3, false, z12));
                i13++;
                hVar2 = hVar3;
                i12 = i14;
            }
            return arrayList4;
        }
        AndroidUtilities.runOnUIThread(new s1(this, arrayList2, z10, arrayList3, arrayList, arrayList4, hVar, hVar2));
        return null;
    }

    private void broadcastReplyMessages(ArrayList<TLRPC.Message> arrayList, a0.h hVar, ArrayList<TLRPC.User> arrayList2, ArrayList<TLRPC.Chat> arrayList3, long j10, boolean z10) {
        a0.h hVar2 = new a0.h();
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            TLRPC.User user = arrayList2.get(i10);
            hVar2.k(user, user.f22539id);
        }
        a0.h hVar3 = new a0.h();
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            TLRPC.Chat chat = arrayList3.get(i11);
            hVar3.k(chat, chat.f22392id);
        }
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList4.add(new MessageObject(this.currentAccount, arrayList.get(i12), hVar2, hVar3, false, false));
        }
        AndroidUtilities.runOnUIThread(new vk(this, arrayList2, z10, arrayList3, arrayList4, hVar, j10));
    }

    public static long calcDocumentsHash(ArrayList<TLRPC.Document> arrayList) {
        return calcDocumentsHash(arrayList, 200);
    }

    private long calcFeaturedStickersHash(boolean z10, ArrayList<TLRPC.StickerSetCovered> arrayList) {
        long j10 = 0;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.StickerSet stickerSet = arrayList.get(i10).set;
                if (!stickerSet.archived) {
                    j10 = calcHash(j10, stickerSet.f22419id);
                    if (this.unreadStickerSets[z10 ? 1 : 0].contains(Long.valueOf(stickerSet.f22419id))) {
                        j10 = calcHash(j10, 1L);
                    }
                }
            }
        }
        return j10;
    }

    public static long calcHash(long j10, long j11) {
        long j12 = j10 ^ (j10 >>> 21);
        long j13 = j12 ^ (j12 << 35);
        return (j13 ^ (j13 >>> 4)) + j11;
    }

    private static long calcStickersHash(ArrayList<TLRPC.TL_messages_stickerSet> arrayList) {
        long j10 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (arrayList.get(i10) != null) {
                TLRPC.StickerSet stickerSet = arrayList.get(i10).set;
                if (!stickerSet.archived) {
                    j10 = calcHash(j10, stickerSet.hash);
                }
            }
        }
        return j10;
    }

    public static boolean canAddMessageToMedia(TLRPC.Message message) {
        boolean z10 = message instanceof TLRPC.TL_message_secret;
        if (z10 && (((MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaPhoto) || MessageObject.isVideoMessage(message) || MessageObject.isGifMessage(message)) && MessageObject.getMedia(message).ttl_seconds != 0 && MessageObject.getMedia(message).ttl_seconds <= 60)) {
            return false;
        }
        if ((!z10 && (message instanceof TLRPC.TL_message) && (((MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaPhoto) || (MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaDocument)) && MessageObject.getMedia(message).ttl_seconds != 0)) || getMediaType(message) == -1) {
            return false;
        }
        return true;
    }

    public static boolean canShowAttachMenuBot(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLObject tLObject) {
        TLRPC.User user;
        TLRPC.Chat chat = null;
        if (tLObject instanceof TLRPC.User) {
            user = (TLRPC.User) tLObject;
        } else {
            user = null;
        }
        if (tLObject instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) tLObject;
        }
        ArrayList<TLRPC.AttachMenuPeerType> arrayList = tL_attachMenuBot.peer_types;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.AttachMenuPeerType attachMenuPeerType = arrayList.get(i10);
            i10++;
            TLRPC.AttachMenuPeerType attachMenuPeerType2 = attachMenuPeerType;
            if (!(attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeSameBotPM) || user == null || !user.bot || user.f22539id != tL_attachMenuBot.bot_id) {
                if (!(attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeBotPM) || user == null || !user.bot || user.f22539id == tL_attachMenuBot.bot_id) {
                    if (!(attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypePM) || user == null || user.bot) {
                        if (!(attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeChat) || chat == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
                            if ((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeBroadcast) && chat != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                                return true;
                            }
                        } else {
                            return true;
                        }
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static boolean canShowAttachMenuBotForTarget(TLRPC.TL_attachMenuBot tL_attachMenuBot, String str) {
        ArrayList<TLRPC.AttachMenuPeerType> arrayList = tL_attachMenuBot.peer_types;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.AttachMenuPeerType attachMenuPeerType = arrayList.get(i10);
            i10++;
            TLRPC.AttachMenuPeerType attachMenuPeerType2 = attachMenuPeerType;
            if ((!(attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeSameBotPM) && !(attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeBotPM)) || !str.equals("bots")) {
                if (!(attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeBroadcast) || !str.equals("channels")) {
                    if (!(attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeChat) || !str.equals("groups")) {
                        if ((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypePM) && str.equals("users")) {
                            return true;
                        }
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    private static boolean checkInclusion(int r5, java.util.List<org.telegram.tgnet.TLRPC.MessageEntity> r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.checkInclusion(int, java.util.List, boolean):boolean");
    }

    private static boolean checkIntersection(int i10, int i11, List<TLRPC.MessageEntity> list) {
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.MessageEntity messageEntity = list.get(i12);
                int i13 = messageEntity.offset;
                if (i13 > i10 && i13 + messageEntity.length <= i11) {
                    return true;
                }
            }
        }
        return false;
    }

    private void cleanupStickerSetCache() {
        if (this.cleanedupStickerSetCache) {
            return;
        }
        this.cleanedupStickerSetCache = true;
        getMessagesStorage().getStorageQueue().postRunnable(new k7(this, 8));
    }

    private Intent createIntrnalAttachedBotShortcutIntent(long j10) {
        if (j10 != 0 && canCreateAttachedMenuBotShortcut(j10)) {
            Intent intent = new Intent(ApplicationLoader.applicationContext, OpenAttachedMenuBotReceiver.class);
            if (DialogObject.isUserDialog(j10)) {
                intent.putExtra("botId", j10);
                intent.putExtra("currentAccount", this.currentAccount);
                intent.setAction(OpenAttachedMenuBotReceiver.ACTION + j10);
                intent.addFlags(67108864);
                return intent;
            }
        }
        return null;
    }

    private Intent createIntrnalShortcutIntent(long j10) {
        Intent intent = new Intent(ApplicationLoader.applicationContext, OpenChatReceiver.class);
        if (DialogObject.isEncryptedDialog(j10)) {
            int encryptedChatId = DialogObject.getEncryptedChatId(j10);
            intent.putExtra("encId", encryptedChatId);
            if (getMessagesController().getEncryptedChat(Integer.valueOf(encryptedChatId)) == null) {
                return null;
            }
        } else if (DialogObject.isUserDialog(j10)) {
            intent.putExtra("userId", j10);
        } else if (!DialogObject.isChatDialog(j10)) {
            return null;
        } else {
            intent.putExtra("chatId", -j10);
        }
        intent.putExtra("currentAccount", this.currentAccount);
        intent.setAction("com.tmessages.openchat" + j10);
        intent.addFlags(67108864);
        return intent;
    }

    private static CharacterStyle createNewSpan(CharacterStyle characterStyle, h01 h01Var, h01 h01Var2, boolean z10) {
        h01 h01Var3 = new h01(h01Var);
        if (h01Var2 != null) {
            if (z10) {
                h01Var3.b(h01Var2);
            } else {
                h01Var3.f29024a = h01Var2.f29024a;
                h01Var3.d = h01Var2.d;
            }
        }
        if (characterStyle instanceof i01) {
            return new i01(h01Var3, 0);
        }
        if (characterStyle instanceof c51) {
            return new c51(((c51) characterStyle).getURL(), h01Var3);
        }
        return null;
    }

    private void deletePeer(long j10, int i10) {
        getMessagesStorage().getStorageQueue().postRunnable(new jh.z8(this, j10, i10, 4));
    }

    public static boolean entitiesEqual(TLRPC.MessageEntity messageEntity, TLRPC.MessageEntity messageEntity2) {
        if (messageEntity.getClass() == messageEntity2.getClass() && messageEntity.offset == messageEntity2.offset && messageEntity.length == messageEntity2.length && TextUtils.equals(messageEntity.url, messageEntity2.url) && TextUtils.equals(messageEntity.language, messageEntity2.language)) {
            if (!(messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) || ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id == ((TLRPC.TL_inputMessageEntityMentionName) messageEntity2).user_id) {
                if (!(messageEntity instanceof TLRPC.TL_messageEntityMentionName) || ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id == ((TLRPC.TL_messageEntityMentionName) messageEntity2).user_id) {
                    return !(messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) || ((TLRPC.TL_messageEntityCustomEmoji) messageEntity).document_id == ((TLRPC.TL_messageEntityCustomEmoji) messageEntity2).document_id;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    private void fetchStickerSetInternal(TLRPC.InputStickerSet inputStickerSet, Utilities.Callback2<Boolean, TLRPC.TL_messages_stickerSet> callback2) {
        if (callback2 == null) {
            return;
        }
        String inputSetKey = inputSetKey(inputStickerSet);
        ArrayList<Utilities.Callback2<Boolean, TLRPC.TL_messages_stickerSet>> arrayList = this.loadingStickerSets.get(inputSetKey);
        if (arrayList != null && arrayList.size() > 0) {
            arrayList.add(callback2);
            return;
        }
        if (arrayList == null) {
            HashMap<String, ArrayList<Utilities.Callback2<Boolean, TLRPC.TL_messages_stickerSet>>> hashMap = this.loadingStickerSets;
            ArrayList<Utilities.Callback2<Boolean, TLRPC.TL_messages_stickerSet>> arrayList2 = new ArrayList<>();
            hashMap.put(inputSetKey, arrayList2);
            arrayList = arrayList2;
        }
        arrayList.add(callback2);
        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
        tL_messages_getStickerSet.stickerset = inputStickerSet;
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new c7(this, inputSetKey, 1));
    }

    public static TLRPC.TL_attachMenuBotIcon getAnimatedAttachMenuBotIcon(TLRPC.TL_attachMenuBot tL_attachMenuBot, boolean z10) {
        String str;
        ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList = tL_attachMenuBot.icons;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon = arrayList.get(i10);
            i10++;
            TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon2 = tL_attachMenuBotIcon;
            String str2 = tL_attachMenuBotIcon2.name;
            if (z10) {
                str = "android_active_animated";
            } else {
                str = "android_animated";
            }
            if (str2.equals(str)) {
                return tL_attachMenuBotIcon2;
            }
        }
        return null;
    }

    private org.telegram.tgnet.TLRPC.TL_messages_stickerSet getCachedStickerSetInternal(long r6, java.lang.Integer r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.getCachedStickerSetInternal(long, java.lang.Integer):org.telegram.tgnet.TLRPC$TL_messages_stickerSet");
    }

    public static TLRPC.InputStickerSet getInputStickerSet(TLRPC.StickerSet stickerSet) {
        if (stickerSet != null) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.f22412id = stickerSet.f22419id;
            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
            return tL_inputStickerSetID;
        }
        return null;
    }

    public static TLRPC.TL_inputStickerSetItem getInputStickerSetItem(TLRPC.Document document, String str) {
        TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem = new TLRPC.TL_inputStickerSetItem();
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_inputStickerSetItem.document = tL_inputDocument;
        tL_inputDocument.f22404id = document.f22398id;
        tL_inputDocument.access_hash = document.access_hash;
        tL_inputDocument.file_reference = document.file_reference;
        tL_inputStickerSetItem.emoji = str;
        return tL_inputStickerSetItem;
    }

    public static MediaDataController getInstance(int i10) {
        MediaDataController mediaDataController;
        MediaDataController mediaDataController2 = Instance[i10];
        if (mediaDataController2 == null) {
            synchronized (lockObjects) {
                try {
                    mediaDataController = Instance[i10];
                    if (mediaDataController == null) {
                        MediaDataController[] mediaDataControllerArr = Instance;
                        MediaDataController mediaDataController3 = new MediaDataController(i10);
                        mediaDataControllerArr[i10] = mediaDataController3;
                        mediaDataController = mediaDataController3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return mediaDataController;
        }
        return mediaDataController2;
    }

    private void getMediaCountDatabase(long j10, long j11, int i10, int i11) {
        getMessagesStorage().getStorageQueue().postRunnable(new l8(this, j11, j10, i10, i11, 0));
    }

    public static int getMediaType(TLRPC.Message message) {
        if (message == null) {
            return -1;
        }
        TLRPC.MessageMedia media = MessageObject.getMedia(message);
        if (media instanceof TLRPC.TL_messageMediaPoll) {
            return 8;
        }
        if (media instanceof TLRPC.TL_messageMediaPhoto) {
            return 0;
        }
        if (media instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.Document document = media.document;
            if (document == null) {
                return -1;
            }
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    z10 = documentAttribute.round_message;
                    z12 = !z10;
                    z11 = z10;
                } else if (documentAttribute instanceof TLRPC.TL_documentAttributeAnimated) {
                    z13 = true;
                } else if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    z10 = documentAttribute.voice;
                    z15 = !z10;
                } else if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                    z14 = true;
                }
            }
            if (!z10 && !z11) {
                if (z12 && !z13 && !z14) {
                    return 0;
                }
                if (z14) {
                    return -1;
                }
                if (z13) {
                    return 5;
                }
                if (!z15) {
                    return 1;
                }
                return 4;
            }
            return 2;
        }
        if (!message.entities.isEmpty()) {
            for (int i11 = 0; i11 < message.entities.size(); i11++) {
                TLRPC.MessageEntity messageEntity = message.entities.get(i11);
                if ((messageEntity instanceof TLRPC.TL_messageEntityUrl) || (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) || (messageEntity instanceof TLRPC.TL_messageEntityEmail)) {
                    return 3;
                }
            }
        }
        return -1;
    }

    public static TLRPC.TL_attachMenuBotIcon getPlaceholderStaticAttachMenuBotIcon(TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList = tL_attachMenuBot.icons;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon = arrayList.get(i10);
            i10++;
            TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon2 = tL_attachMenuBotIcon;
            if (tL_attachMenuBotIcon2.name.equals("placeholder_static")) {
                return tL_attachMenuBotIcon2;
            }
        }
        return null;
    }

    public static TLRPC.TL_attachMenuBotIcon getSideAttachMenuBotIcon(TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList = tL_attachMenuBot.icons;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon = arrayList.get(i10);
            i10++;
            TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon2 = tL_attachMenuBotIcon;
            if (tL_attachMenuBotIcon2.name.equals("android_side_menu_static")) {
                return tL_attachMenuBotIcon2;
            }
        }
        return null;
    }

    public static TLRPC.TL_attachMenuBotIcon getSideMenuBotIcon(TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList = tL_attachMenuBot.icons;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon = arrayList.get(i10);
            i10++;
            TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon2 = tL_attachMenuBotIcon;
            if (tL_attachMenuBotIcon2.name.equals("android_side_menu_static")) {
                return tL_attachMenuBotIcon2;
            }
        }
        return null;
    }

    public static TLRPC.TL_attachMenuBotIcon getStaticAttachMenuBotIcon(TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList = tL_attachMenuBot.icons;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon = arrayList.get(i10);
            i10++;
            TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon2 = tL_attachMenuBotIcon;
            if (tL_attachMenuBotIcon2.name.equals("default_static")) {
                return tL_attachMenuBotIcon2;
            }
        }
        return null;
    }

    public static long getStickerSetId(TLRPC.Document document) {
        if (document == null) {
            return -1L;
        }
        for (int i10 = 0; i10 < document.attributes.size(); i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji)) {
                TLRPC.InputStickerSet inputStickerSet = documentAttribute.stickerset;
                if (!(inputStickerSet instanceof TLRPC.TL_inputStickerSetID)) {
                    return -1L;
                }
                return inputStickerSet.f22412id;
            }
        }
        return -1L;
    }

    public static ArrayList<h01> getTextStyleRuns(ArrayList<TLRPC.MessageEntity> arrayList, CharSequence charSequence, int i10) {
        int i11;
        ArrayList<h01> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList(arrayList);
        Collections.sort(arrayList3, new q(10));
        int size = arrayList3.size();
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList3.get(i12);
            if (messageEntity != null && messageEntity.length > 0 && (i11 = messageEntity.offset) >= 0 && i11 < charSequence.length()) {
                if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                    messageEntity.length = charSequence.length() - messageEntity.offset;
                }
                if (!(messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji)) {
                    ?? obj = new Object();
                    int i13 = messageEntity.offset;
                    obj.f29025b = i13;
                    obj.f29026c = i13 + messageEntity.length;
                    if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                        obj.f29024a = 256;
                    } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                        obj.f29024a = 8;
                    } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                        obj.f29024a = 16;
                    } else if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                        obj.f29024a = 1;
                    } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                        obj.f29024a = 2;
                    } else if (!(messageEntity instanceof TLRPC.TL_messageEntityCode) && !(messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                        if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                            obj.f29024a = 64;
                            obj.d = messageEntity;
                        } else if (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) {
                            obj.f29024a = 64;
                            obj.d = messageEntity;
                        } else {
                            obj.f29024a = 128;
                            obj.d = messageEntity;
                        }
                    } else {
                        obj.f29024a = 4;
                    }
                    if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                        obj.f29024a |= 1024;
                    }
                    obj.f29024a &= i10;
                    int size2 = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        h01 h01Var = arrayList2.get(i14);
                        int i15 = obj.f29025b;
                        int i16 = h01Var.f29025b;
                        if (i15 > i16) {
                            int i17 = h01Var.f29026c;
                            if (i15 < i17) {
                                if (obj.f29026c < i17) {
                                    h01 h01Var2 = new h01(obj);
                                    h01Var2.b(h01Var);
                                    arrayList2.add(i14 + 1, h01Var2);
                                    h01 h01Var3 = new h01(h01Var);
                                    h01Var3.f29025b = obj.f29026c;
                                    i14 += 2;
                                    size2 += 2;
                                    arrayList2.add(i14, h01Var3);
                                } else {
                                    h01 h01Var4 = new h01(obj);
                                    h01Var4.b(h01Var);
                                    h01Var4.f29026c = h01Var.f29026c;
                                    i14++;
                                    size2++;
                                    arrayList2.add(i14, h01Var4);
                                }
                                int i18 = obj.f29025b;
                                obj.f29025b = h01Var.f29026c;
                                h01Var.f29026c = i18;
                            }
                        } else {
                            int i19 = obj.f29026c;
                            if (i16 < i19) {
                                int i20 = h01Var.f29026c;
                                if (i19 == i20) {
                                    h01Var.b(obj);
                                } else if (i19 < i20) {
                                    h01 h01Var5 = new h01(h01Var);
                                    h01Var5.b(obj);
                                    h01Var5.f29026c = obj.f29026c;
                                    i14++;
                                    size2++;
                                    arrayList2.add(i14, h01Var5);
                                    h01Var.f29025b = obj.f29026c;
                                } else {
                                    h01 h01Var6 = new h01(obj);
                                    h01Var6.f29025b = h01Var.f29026c;
                                    i14++;
                                    size2++;
                                    arrayList2.add(i14, h01Var6);
                                    h01Var.b(obj);
                                }
                                obj.f29026c = i16;
                            }
                        }
                        i14++;
                    }
                    if (obj.f29025b < obj.f29026c) {
                        arrayList2.add(obj);
                    }
                }
            }
        }
        return arrayList2;
    }

    public static String inputSetKey(TLRPC.InputStickerSet inputStickerSet) {
        if (inputStickerSet instanceof TLRPC.TL_inputStickerSetID) {
            return "id" + inputStickerSet.f22412id + "access_hash" + inputStickerSet.access_hash;
        } else if (inputStickerSet instanceof TLRPC.TL_inputStickerSetShortName) {
            return "short" + inputStickerSet.short_name;
        } else if (inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty) {
            return "empty";
        } else {
            if (inputStickerSet instanceof TLRPC.TL_inputStickerSetAnimatedEmoji) {
                return "animatedEmoji";
            }
            if (inputStickerSet instanceof TLRPC.TL_inputStickerSetEmojiGenericAnimations) {
                return "emojiGenericAnimations";
            }
            if (inputStickerSet instanceof TLRPC.TL_inputStickerSetEmojiChannelDefaultStatuses) {
                return "emojiChannelDefaultStatuses";
            }
            if (inputStickerSet instanceof TLRPC.TL_inputStickerSetDice) {
                return "dice" + ((TLRPC.TL_inputStickerSetDice) inputStickerSet).emoticon;
            } else if (inputStickerSet instanceof TLRPC.TL_inputStickerSetPremiumGifts) {
                return "premiumGifts";
            } else {
                if (inputStickerSet instanceof TLRPC.TL_inputStickerSetEmojiDefaultTopicIcons) {
                    return "defaultTopicIcons";
                }
                if (inputStickerSet instanceof TLRPC.TL_inputStickerSetEmojiDefaultStatuses) {
                    return "emojiDefaultStatuses";
                }
                if (inputStickerSet instanceof TLRPC.TL_inputStickerSetTonGifts) {
                    return "tonGifts";
                }
                return "null";
            }
        }
    }

    public void lambda$addRecentGif$26(TLRPC.Document document) {
        try {
            SQLiteDatabase database = getMessagesStorage().getDatabase();
            database.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document.f22398id + "' AND type = 2").stepThis().dispose();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public static void lambda$addRecentGif$27(TLRPC.Document document) {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 0, document, 7);
    }

    public void lambda$addRecentSticker$20() {
        getMediaDataController().loadRecents(2, false, false, true);
    }

    public void lambda$addRecentSticker$21(Object obj, TLRPC.TL_messages_faveSticker tL_messages_faveSticker, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && obj != null) {
            getFileRefController().requestReference(obj, tL_messages_faveSticker);
        } else {
            AndroidUtilities.runOnUIThread(new k7(this, 2));
        }
    }

    public void lambda$addRecentSticker$22(Object obj, TLRPC.TL_messages_saveRecentSticker tL_messages_saveRecentSticker, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && obj != null) {
            getFileRefController().requestReference(obj, tL_messages_saveRecentSticker);
        }
    }

    public void lambda$addRecentSticker$23(int i10, TLRPC.Document document) {
        int i11;
        if (i10 == 0) {
            i11 = 3;
        } else if (i10 == 1) {
            i11 = 4;
        } else if (i10 == 5) {
            i11 = 7;
        } else {
            i11 = 5;
        }
        try {
            SQLiteDatabase database = getMessagesStorage().getDatabase();
            database.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document.f22398id + "' AND type = " + i11).stepThis().dispose();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public void lambda$broadcastPinnedMessage$167(ArrayList arrayList, boolean z10, ArrayList arrayList2) {
        getMessagesController().putUsers(arrayList, z10);
        getMessagesController().putChats(arrayList2, z10);
    }

    public void lambda$broadcastPinnedMessage$168(ArrayList arrayList) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(((MessageObject) arrayList.get(0)).getDialogId()), null, Boolean.TRUE, arrayList, 0, 0, -1, Boolean.FALSE);
    }

    public void lambda$broadcastPinnedMessage$169(ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, a0.h hVar, a0.h hVar2) {
        boolean z11;
        getMessagesController().putUsers(arrayList, z10);
        getMessagesController().putChats(arrayList2, z10);
        int size = arrayList3.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            TLRPC.Message message = (TLRPC.Message) arrayList3.get(i11);
            if ((MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaDocument) || (MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaPhoto)) {
                i10++;
            }
            int i12 = this.currentAccount;
            if (i10 < 30) {
                z11 = true;
            } else {
                z11 = false;
            }
            arrayList4.add(new MessageObject(i12, message, hVar, hVar2, false, z11));
        }
        AndroidUtilities.runOnUIThread(new w7(this, arrayList4, 1));
    }

    public void lambda$broadcastReplyMessages$179(ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, a0.h hVar, long j10) {
        ArrayList arrayList4;
        getMessagesController().putUsers(arrayList, z10);
        getMessagesController().putChats(arrayList2, z10);
        int size = arrayList3.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            MessageObject messageObject = (MessageObject) arrayList3.get(i10);
            SparseArray sparseArray = (SparseArray) hVar.f(messageObject.getDialogId());
            if (sparseArray != null && (arrayList4 = (ArrayList) sparseArray.get(messageObject.getId())) != null) {
                for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                    MessageObject messageObject2 = (MessageObject) arrayList4.get(i11);
                    messageObject2.replyMessageObject = messageObject;
                    messageObject2.applyTimestampsHighlightForReplyMsg();
                    TLRPC.MessageAction messageAction = messageObject2.messageOwner.action;
                    if (messageAction instanceof TLRPC.TL_messageActionPinMessage) {
                        messageObject2.generatePinMessageText(null, null);
                    } else if (messageAction instanceof TLRPC.TL_messageActionGameScore) {
                        messageObject2.generateGameMessageText(null);
                    } else if (messageAction instanceof TLRPC.TL_messageActionPaymentSent) {
                        messageObject2.generatePaymentSentMessageText(null, false);
                    } else if (messageAction instanceof TLRPC.TL_messageActionPaymentSentMe) {
                        messageObject2.generatePaymentSentMessageText(null, true);
                    } else if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                        messageObject2.generateSuggestionApprovalMessageText();
                    }
                }
                z11 = true;
            }
        }
        if (z11) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.replyMessagesDidLoad, Long.valueOf(j10), arrayList3, hVar);
        }
    }

    public void lambda$buildShortcuts$143(boolean r25, java.util.ArrayList r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.lambda$buildShortcuts$143(boolean, java.util.ArrayList):void");
    }

    public void lambda$checkDefaultTopicIcons$81(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            getUserConfig().defaultTopicIcons = tL_messages_stickerSet.set.short_name;
            getUserConfig().lastUpdatedDefaultTopicIcons = System.currentTimeMillis();
            getUserConfig().saveConfig(false);
            processLoadedDiceStickers(getUserConfig().defaultTopicIcons, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
        }
    }

    public void lambda$checkDefaultTopicIcons$82(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new g7(this, tLObject, 3));
    }

    public void lambda$checkGenericAnimations$79(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            getUserConfig().genericAnimationsStickerPack = tL_messages_stickerSet.set.short_name;
            getUserConfig().lastUpdatedGenericAnimations = System.currentTimeMillis();
            getUserConfig().saveConfig(false);
            processLoadedDiceStickers(getUserConfig().genericAnimationsStickerPack, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
            for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
                if (this.currentAccount == UserConfig.selectedAccount) {
                    preloadImage(ImageLocation.getForDocument(tL_messages_stickerSet.documents.get(i10)), 0);
                }
            }
        }
    }

    public void lambda$checkGenericAnimations$80(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new g7(this, tLObject, 5));
    }

    public void lambda$checkPremiumGiftStickers$75(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            getUserConfig().premiumGiftsStickerPack = tL_messages_stickerSet.set.short_name;
            getUserConfig().lastUpdatedPremiumGiftsStickerPack = System.currentTimeMillis();
            getUserConfig().saveConfig(false);
            processLoadedDiceStickers(getUserConfig().premiumGiftsStickerPack, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdatePremiumGiftStickers, new Object[0]);
        }
    }

    public void lambda$checkPremiumGiftStickers$76(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new g7(this, tLObject, 0));
    }

    public void lambda$checkTonGiftStickers$77(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            getUserConfig().premiumTonStickerPack = tL_messages_stickerSet.set.short_name;
            getUserConfig().lastUpdatedTonGiftsStickerPack = System.currentTimeMillis();
            getUserConfig().saveConfig(false);
            processLoadedDiceStickers(getUserConfig().premiumTonStickerPack, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateTonGiftStickers, new Object[0]);
        }
    }

    public void lambda$checkTonGiftStickers$78(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new g7(this, tLObject, 2));
    }

    public static void lambda$cleanup$1() {
        try {
            g0.f.n(ApplicationLoader.applicationContext);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public void lambda$cleanup$2() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadHints, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadInlineHints, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadGuestBotHints, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadWebappsHints, new Object[0]);
    }

    public void lambda$cleanupStickerSetCache$39() {
        try {
            SQLiteDatabase database = getMessagesStorage().getDatabase();
            database.executeFast("DELETE FROM stickersets2 WHERE date < " + (System.currentTimeMillis() - 604800000)).stepThis().dispose();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public void lambda$clearBotKeyboard$193(ArrayList arrayList, MessagesStorage.TopicKey topicKey) {
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                int intValue = ((Integer) arrayList.get(i10)).intValue();
                long j10 = intValue;
                MessagesStorage.TopicKey topicKey2 = (MessagesStorage.TopicKey) this.botKeyboardsByMids.f(j10);
                if (topicKey2 != null) {
                    this.botKeyboards.remove(topicKey2);
                    ArrayList arrayList2 = (ArrayList) this.botDialogKeyboards.f(topicKey2.dialogId);
                    if (arrayList2 != null) {
                        int i11 = 0;
                        while (i11 < arrayList2.size()) {
                            TLRPC.Message message = (TLRPC.Message) arrayList2.get(i11);
                            if (message == null || message.f22413id == intValue) {
                                arrayList2.remove(i11);
                                i11--;
                            }
                            i11++;
                        }
                        if (arrayList2.isEmpty()) {
                            this.botDialogKeyboards.l(topicKey2.dialogId);
                        }
                    }
                    this.botKeyboardsByMids.l(j10);
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botKeyboardDidLoad, null, topicKey2);
                }
            }
        } else if (topicKey != null) {
            this.botKeyboards.remove(topicKey);
            this.botDialogKeyboards.l(topicKey.dialogId);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botKeyboardDidLoad, null, topicKey);
        }
    }

    public void lambda$clearBotKeyboard$194(long j10) {
        ArrayList arrayList = (ArrayList) this.botDialogKeyboards.f(j10);
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                int i11 = this.currentAccount;
                MessagesStorage.TopicKey of2 = MessagesStorage.TopicKey.of(j10, MessageObject.getTopicId(i11, (TLRPC.Message) arrayList.get(i10), ChatObject.isForum(i11, j10)));
                this.botKeyboards.remove(of2);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botKeyboardDidLoad, null, of2);
            }
        }
        this.botDialogKeyboards.l(j10);
    }

    public void lambda$clearRecentEmojiStatuses$229() {
        try {
            getMessagesStorage().getDatabase().executeFast("DELETE FROM emoji_statuses WHERE type = 0").stepThis().dispose();
        } catch (Exception unused) {
        }
    }

    public void lambda$clearRecentStickers$17() {
        try {
            getMessagesStorage().getDatabase().executeFast("DELETE FROM web_recent_v3 WHERE type = 3").stepThis().dispose();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public void lambda$clearRecentStickers$18(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            getMessagesStorage().getStorageQueue().postRunnable(new k7(this, 5));
            this.recentStickers[0].clear();
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recentDocumentsDidLoad, Boolean.FALSE, 0);
        }
    }

    public void lambda$clearRecentStickers$19(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new g7(this, tLObject, 4));
    }

    public void lambda$clearTopPeers$149() {
        try {
            getMessagesStorage().getDatabase().executeFast("DELETE FROM chat_hints WHERE 1").stepThis().dispose();
        } catch (Exception unused) {
        }
    }

    public void lambda$deletePeer$159(long j10, int i10) {
        try {
            SQLiteDatabase database = getMessagesStorage().getDatabase();
            Locale locale = Locale.US;
            database.executeFast("DELETE FROM chat_hints WHERE did = " + j10 + " AND type = " + i10).stepThis().dispose();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public void lambda$fetchEmojiStatuses$230() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.recentEmojiStatusesUpdate, new Object[0]);
    }

    public void lambda$fetchEmojiStatuses$231(int r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.lambda$fetchEmojiStatuses$231(int):void");
    }

    public void lambda$fetchEmojiStatuses$232() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.recentEmojiStatusesUpdate, new Object[0]);
    }

    public void lambda$fetchEmojiStatuses$233(int i10, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.emojiStatusesFetchDate[i10] = Long.valueOf(System.currentTimeMillis() / 1000);
        if (tLObject instanceof TL_account.TL_emojiStatusesNotModified) {
            this.emojiStatusesFetching[i10] = false;
        } else if (tLObject instanceof TL_account.TL_emojiStatuses) {
            TL_account.TL_emojiStatuses tL_emojiStatuses = (TL_account.TL_emojiStatuses) tLObject;
            this.emojiStatusesHash[i10] = tL_emojiStatuses.hash;
            this.emojiStatuses[i10] = tL_emojiStatuses.statuses;
            updateEmojiStatuses(i10, tL_emojiStatuses);
            AndroidUtilities.runOnUIThread(new k7(this, 0));
        }
    }

    public void lambda$fetchNewEmojiKeywords$207(String str) {
        this.currentFetchingEmoji.remove(str);
        this.fetchedEmoji.add(str);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.emojiKeywordsLoaded, new Object[0]);
    }

    public void lambda$fetchNewEmojiKeywords$208(String str) {
        this.currentFetchingEmoji.remove(str);
        this.fetchedEmoji.add(str);
        fetchNewEmojiKeywords(new String[]{str});
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.emojiKeywordsLoaded, new Object[0]);
    }

    public void lambda$fetchNewEmojiKeywords$209(String str) {
        try {
            SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("DELETE FROM emoji_keywords_info_v2 WHERE lang = ?");
            executeFast.bindString(1, str);
            executeFast.step();
            executeFast.dispose();
            AndroidUtilities.runOnUIThread(new d8(this, str, 2));
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public void lambda$fetchNewEmojiKeywords$210() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.emojiKeywordsLoaded, new Object[0]);
    }

    public void lambda$fetchNewEmojiKeywords$211(String str) {
        this.currentFetchingEmoji.remove(str);
        this.fetchedEmoji.add(str);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.emojiKeywordsLoaded, new Object[0]);
    }

    public void lambda$fetchNewEmojiKeywords$212(int i10, String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            TLRPC.TL_emojiKeywordsDifference tL_emojiKeywordsDifference = (TLRPC.TL_emojiKeywordsDifference) tLObject;
            if (i10 != -1 && !tL_emojiKeywordsDifference.lang_code.equals(str)) {
                getMessagesStorage().getStorageQueue().postRunnable(new d8(this, str2, 5));
                return;
            }
            putEmojiKeywords(str2, tL_emojiKeywordsDifference);
            AndroidUtilities.runOnUIThread(new k7(this, 18));
            return;
        }
        AndroidUtilities.runOnUIThread(new d8(this, str2, 6));
    }

    public void lambda$fetchNewEmojiKeywords$213(java.lang.String r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.lambda$fetchNewEmojiKeywords$213(java.lang.String):void");
    }

    public void lambda$fetchStickerSetInternal$41(String str, TLObject tLObject) {
        ArrayList<Utilities.Callback2<Boolean, TLRPC.TL_messages_stickerSet>> arrayList = this.loadingStickerSets.get(str);
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (tLObject != null) {
                    arrayList.get(i10).run(Boolean.TRUE, (TLRPC.TL_messages_stickerSet) tLObject);
                } else {
                    arrayList.get(i10).run(Boolean.FALSE, null);
                }
            }
        }
        this.loadingStickerSets.remove(str);
    }

    public void lambda$fetchStickerSetInternal$42(String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new p9(this, str, tLObject, 0));
    }

    public void lambda$fillWithAnimatedEmoji$225(java.lang.Integer r24, java.util.ArrayList r25, boolean r26, boolean r27, java.util.ArrayList[] r28, java.lang.Runnable r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.lambda$fillWithAnimatedEmoji$225(java.lang.Integer, java.util.ArrayList, boolean, boolean, java.util.ArrayList[], java.lang.Runnable):void");
    }

    public static void lambda$fillWithAnimatedEmoji$226(boolean[] zArr, ArrayList[] arrayListArr, Runnable runnable, ArrayList arrayList) {
        if (!zArr[0]) {
            arrayListArr[0] = arrayList;
            runnable.run();
            zArr[0] = true;
        }
    }

    public void lambda$fillWithAnimatedEmoji$227(boolean[] zArr, ArrayList[] arrayListArr, Runnable runnable) {
        loadStickers(5, true, false, false, new g2(zArr, arrayListArr, runnable, 4));
    }

    public static void lambda$fillWithAnimatedEmoji$228(boolean[] zArr, Runnable runnable) {
        if (!zArr[0]) {
            runnable.run();
            zArr[0] = true;
        }
    }

    public void lambda$findStickerSetByNameInCache$29(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Utilities.Callback callback) {
        putStickerSet(tL_messages_stickerSet, false);
        callback.run(tL_messages_stickerSet);
    }

    public void lambda$findStickerSetByNameInCache$30(String str, Utilities.Callback callback) {
        AndroidUtilities.runOnUIThread(new c9(this, getCachedStickerSetInternal(str.toLowerCase(), (Integer) 0), callback, 4));
    }

    public static void lambda$getAnimatedEmojiByKeywords$216(String str, ArrayList arrayList, ArrayList arrayList2, Utilities.Callback callback) {
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        String lowerCase = str.toLowerCase();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((TLRPC.TL_messages_stickerSet) arrayList.get(i10)).keywords != null) {
                ArrayList<TLRPC.TL_stickerKeyword> arrayList5 = ((TLRPC.TL_messages_stickerSet) arrayList.get(i10)).keywords;
                for (int i11 = 0; i11 < arrayList5.size(); i11++) {
                    for (int i12 = 0; i12 < arrayList5.get(i11).keyword.size(); i12++) {
                        String str2 = arrayList5.get(i11).keyword.get(i12);
                        if (lowerCase.equals(str2)) {
                            arrayList3.add(Long.valueOf(arrayList5.get(i11).document_id));
                        } else if (lowerCase.contains(str2) || str2.contains(lowerCase)) {
                            arrayList4.add(Long.valueOf(arrayList5.get(i11).document_id));
                        }
                    }
                }
            }
        }
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            if ((arrayList2.get(i13) instanceof TLRPC.TL_stickerSetFullCovered) && ((TLRPC.TL_stickerSetFullCovered) arrayList2.get(i13)).keywords != null) {
                ArrayList<TLRPC.TL_stickerKeyword> arrayList6 = ((TLRPC.TL_stickerSetFullCovered) arrayList2.get(i13)).keywords;
                for (int i14 = 0; i14 < arrayList6.size(); i14++) {
                    for (int i15 = 0; i15 < arrayList6.get(i14).keyword.size(); i15++) {
                        String str3 = arrayList6.get(i14).keyword.get(i15);
                        if (lowerCase.equals(str3)) {
                            arrayList3.add(Long.valueOf(arrayList6.get(i14).document_id));
                        } else if (lowerCase.contains(str3) || str3.contains(lowerCase)) {
                            arrayList4.add(Long.valueOf(arrayList6.get(i14).document_id));
                        }
                    }
                }
            }
        }
        arrayList3.addAll(arrayList4);
        if (callback != null) {
            callback.run(arrayList3);
        }
    }

    public void lambda$getEmojiNames$218(String[] strArr, String str, Utilities.Callback callback) {
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                Object[] objArr = new Object[strArr.length + 1];
                objArr[0] = str;
                String str2 = "1 = 1";
                int i10 = 0;
                while (i10 < strArr.length) {
                    if (i10 == 0) {
                        str2 = "lang = ?";
                    } else {
                        str2 = str2 + " OR lang = ?";
                    }
                    SQLiteCursor queryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT alias FROM emoji_keywords_info_v2 WHERE lang = ?", strArr[i10]);
                    if (queryFinalized.next()) {
                        strArr[i10] = queryFinalized.stringValue(0);
                    }
                    queryFinalized.dispose();
                    int i11 = i10 + 1;
                    objArr[i11] = strArr[i10];
                    i10 = i11;
                }
                sQLiteCursor = getMessagesStorage().getDatabase().executeFast("SELECT keyword FROM emoji_keywords_v2 WHERE emoji = ? AND (" + str2 + ")").query(objArr);
                ArrayList arrayList = new ArrayList();
                while (sQLiteCursor.next()) {
                    arrayList.add(sQLiteCursor.stringValue(0));
                }
                AndroidUtilities.runOnUIThread(new e2(callback, arrayList, 1));
                sQLiteCursor.dispose();
            } catch (Exception e10) {
                FileLog.e(e10);
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
            }
        } catch (Throwable th2) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th2;
        }
    }

    public void lambda$getEmojiSuggestions$219(String[] strArr, KeywordResultCallback keywordResultCallback, ArrayList arrayList) {
        for (String str : strArr) {
            if (this.currentFetchingEmoji.get(str) != null) {
                return;
            }
        }
        keywordResultCallback.run(arrayList, null);
    }

    public static int lambda$getEmojiSuggestions$220(ArrayList arrayList, KeywordResult keywordResult, KeywordResult keywordResult2) {
        int indexOf = arrayList.indexOf(keywordResult.emoji);
        int i10 = Integer.MAX_VALUE;
        if (indexOf < 0) {
            indexOf = Integer.MAX_VALUE;
        }
        int indexOf2 = arrayList.indexOf(keywordResult2.emoji);
        if (indexOf2 >= 0) {
            i10 = indexOf2;
        }
        if (indexOf < i10) {
            return -1;
        }
        if (indexOf > i10) {
            return 1;
        }
        int length = keywordResult.keyword.length();
        int length2 = keywordResult2.keyword.length();
        if (length < length2) {
            return -1;
        }
        if (length > length2) {
            return 1;
        }
        return 0;
    }

    public static void lambda$getEmojiSuggestions$222(CountDownLatch countDownLatch, KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str) {
        if (countDownLatch != null) {
            keywordResultCallback.run(arrayList, str);
            countDownLatch.countDown();
            return;
        }
        AndroidUtilities.runOnUIThread(new m7(keywordResultCallback, arrayList, str, 1));
    }

    public void lambda$getEmojiSuggestions$224(java.lang.String[] r13, org.telegram.messenger.MediaDataController.KeywordResultCallback r14, boolean r15, java.lang.String r16, boolean r17, java.util.ArrayList r18, boolean r19, java.lang.Integer r20, boolean r21, boolean r22, boolean r23, java.util.concurrent.CountDownLatch r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.lambda$getEmojiSuggestions$224(java.lang.String[], org.telegram.messenger.MediaDataController$KeywordResultCallback, boolean, java.lang.String, boolean, java.util.ArrayList, boolean, java.lang.Integer, boolean, boolean, boolean, java.util.concurrent.CountDownLatch):void");
    }

    public static TLRPC.MessageEntity lambda$getEntities$181(Void r02) {
        return new TLRPC.TL_messageEntityBold();
    }

    public static TLRPC.MessageEntity lambda$getEntities$182(Void r02) {
        return new TLRPC.TL_messageEntityItalic();
    }

    public static TLRPC.MessageEntity lambda$getEntities$183(Void r02) {
        return new TLRPC.TL_messageEntitySpoiler();
    }

    public static TLRPC.MessageEntity lambda$getEntities$184(Void r02) {
        return new TLRPC.TL_messageEntityStrike();
    }

    public void lambda$getMediaCount$132(long j10, long j11, int i10, int i11, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof Vector) {
            Vector vector = (Vector) tLObject;
            if (!vector.objects.isEmpty()) {
                processLoadedMediaCount(((TLRPC.TL_messages_searchCounter) vector.objects.get(0)).count, j10, j11, i10, i11, false, 0);
            }
        }
    }

    public void lambda$getMediaCountDatabase$139(long j10, long j11, int i10, int i11) {
        SQLiteCursor queryFinalized;
        int i12;
        int i13;
        try {
            if (j10 != 0) {
                SQLiteDatabase database = getMessagesStorage().getDatabase();
                Locale locale = Locale.US;
                queryFinalized = database.queryFinalized("SELECT count, old FROM media_counts_topics WHERE uid = " + j11 + " AND topic_id = " + j10 + " AND type = " + i10 + " LIMIT 1", new Object[0]);
            } else {
                SQLiteDatabase database2 = getMessagesStorage().getDatabase();
                Locale locale2 = Locale.US;
                queryFinalized = database2.queryFinalized("SELECT count, old FROM media_counts_v2 WHERE uid = " + j11 + " AND type = " + i10 + " LIMIT 1", new Object[0]);
            }
            if (queryFinalized.next()) {
                i12 = queryFinalized.intValue(0);
                i13 = queryFinalized.intValue(1);
            } else {
                i12 = -1;
                i13 = 0;
            }
            queryFinalized.dispose();
            if (i12 == -1 && DialogObject.isEncryptedDialog(j11)) {
                SQLiteDatabase database3 = getMessagesStorage().getDatabase();
                Locale locale3 = Locale.US;
                SQLiteCursor queryFinalized2 = database3.queryFinalized("SELECT COUNT(mid) FROM media_v4 WHERE uid = " + j11 + " AND type = " + i10 + " LIMIT 1", new Object[0]);
                if (queryFinalized2.next()) {
                    i12 = queryFinalized2.intValue(0);
                }
                queryFinalized2.dispose();
                if (i12 != -1) {
                    putMediaCountDatabase(j11, j10, i10, i12);
                }
            }
            processLoadedMediaCount(i12, j11, j10, i10, i11, true, i13);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public void lambda$getMediaCounts$127(long j10, long j11, int[] iArr) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mediaCountsDidLoad, Long.valueOf(j10), Long.valueOf(j11), iArr);
    }

    public void lambda$getMediaCounts$128(long j10, long j11, int[] iArr) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mediaCountsDidLoad, Long.valueOf(j10), Long.valueOf(j11), iArr);
    }

    public void lambda$getMediaCounts$129(int[] iArr, long j10, long j11, TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (iArr[i11] < 0) {
                iArr[i11] = 0;
            }
        }
        if (tLObject instanceof Vector) {
            Vector vector = (Vector) tLObject;
            int size = vector.objects.size();
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.TL_messages_searchCounter tL_messages_searchCounter = (TLRPC.TL_messages_searchCounter) vector.objects.get(i12);
                TLRPC.MessagesFilter messagesFilter = tL_messages_searchCounter.filter;
                if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterPhotoVideo) {
                    i10 = 0;
                } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterDocument) {
                    i10 = 1;
                } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterRoundVoice) {
                    i10 = 2;
                } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterUrl) {
                    i10 = 3;
                } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterMusic) {
                    i10 = 4;
                } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterGif) {
                    i10 = 5;
                } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterPhotos) {
                    i10 = 6;
                } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterVideo) {
                    i10 = 7;
                } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterPoll) {
                    i10 = 8;
                }
                int i13 = tL_messages_searchCounter.count;
                iArr[i10] = i13;
                putMediaCountDatabase(j10, j11, i10, i13);
            }
        }
        AndroidUtilities.runOnUIThread(new o7(this, j10, j11, iArr, 0));
    }

    public void lambda$getMediaCounts$130(long j10, long j11, int[] iArr) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mediaCountsDidLoad, Long.valueOf(j10), Long.valueOf(j11), iArr);
    }

    public void lambda$getMediaCounts$131(long r26, long r28, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.lambda$getMediaCounts$131(long, long, int):void");
    }

    public void lambda$getStickerSet$32(String str, Utilities.Callback callback, Boolean bool, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.StickerSet stickerSet;
        this.loadingStickerSetsKeys.remove(str);
        if (callback != null) {
            callback.run(tL_messages_stickerSet);
        }
        if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null) {
            this.stickerSetsById.k(tL_messages_stickerSet, stickerSet.f22419id);
            this.stickerSetsByName.put(tL_messages_stickerSet.set.short_name.toLowerCase(), tL_messages_stickerSet);
            saveStickerSetIntoCache(tL_messages_stickerSet);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupStickersDidLoad, Long.valueOf(tL_messages_stickerSet.set.f22419id), tL_messages_stickerSet);
        }
    }

    public void lambda$getStickerSet$33(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z10, TLRPC.InputStickerSet inputStickerSet) {
        if (tL_messages_stickerSet != null) {
            this.loadingStickerSetsKeys.remove(str);
            if (callback != null) {
                callback.run(tL_messages_stickerSet);
            }
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null) {
                this.stickerSetsById.k(tL_messages_stickerSet, stickerSet.f22419id);
                this.stickerSetsByName.put(tL_messages_stickerSet.set.short_name.toLowerCase(), tL_messages_stickerSet);
            }
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupStickersDidLoad, Long.valueOf(tL_messages_stickerSet.set.f22419id), tL_messages_stickerSet);
        } else if (!z10) {
            fetchStickerSetInternal(inputStickerSet, new r7(this, str, callback, 0));
        } else {
            this.loadingStickerSetsKeys.remove(str);
        }
    }

    public void lambda$getStickerSet$34(TLRPC.InputStickerSet inputStickerSet, Integer num, String str, Utilities.Callback callback, boolean z10) {
        AndroidUtilities.runOnUIThread(new r8(this, getCachedStickerSetInternal(inputStickerSet.f22412id, num), str, callback, z10, inputStickerSet, 0));
    }

    public void lambda$getStickerSet$35(String str, Utilities.Callback callback, Boolean bool, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.StickerSet stickerSet;
        this.loadingStickerSetsKeys.remove(str);
        if (callback != null) {
            callback.run(tL_messages_stickerSet);
        }
        if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null) {
            this.stickerSetsById.k(tL_messages_stickerSet, stickerSet.f22419id);
            this.stickerSetsByName.put(tL_messages_stickerSet.set.short_name.toLowerCase(), tL_messages_stickerSet);
            saveStickerSetIntoCache(tL_messages_stickerSet);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupStickersDidLoad, Long.valueOf(tL_messages_stickerSet.set.f22419id), tL_messages_stickerSet);
        }
    }

    public void lambda$getStickerSet$36(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z10, TLRPC.InputStickerSet inputStickerSet) {
        if (tL_messages_stickerSet != null) {
            this.loadingStickerSetsKeys.remove(str);
            if (callback != null) {
                callback.run(tL_messages_stickerSet);
            }
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null) {
                this.stickerSetsById.k(tL_messages_stickerSet, stickerSet.f22419id);
                this.stickerSetsByName.put(tL_messages_stickerSet.set.short_name.toLowerCase(), tL_messages_stickerSet);
            }
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupStickersDidLoad, Long.valueOf(tL_messages_stickerSet.set.f22419id), tL_messages_stickerSet);
        } else if (!z10) {
            fetchStickerSetInternal(inputStickerSet, new r7(this, str, callback, 1));
        } else {
            this.loadingStickerSetsKeys.remove(str);
        }
    }

    public void lambda$getStickerSet$37(TLRPC.InputStickerSet inputStickerSet, Integer num, String str, Utilities.Callback callback, boolean z10) {
        AndroidUtilities.runOnUIThread(new r8(this, getCachedStickerSetInternal(inputStickerSet.short_name.toLowerCase(), num), str, callback, z10, inputStickerSet, 1));
    }

    public void lambda$getStickerSet$38(String str, Utilities.Callback callback, TLRPC.InputStickerSet inputStickerSet, Boolean bool, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.loadingStickerSetsKeys.remove(str);
        if (callback != null) {
            callback.run(tL_messages_stickerSet);
        }
        if (tL_messages_stickerSet != null) {
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null) {
                this.stickerSetsById.k(tL_messages_stickerSet, stickerSet.f22419id);
                this.stickerSetsByName.put(tL_messages_stickerSet.set.short_name.toLowerCase(), tL_messages_stickerSet);
                boolean z10 = inputStickerSet instanceof TLRPC.TL_inputStickerSetEmojiDefaultStatuses;
                if (z10) {
                    this.stickerSetDefaultStatuses = tL_messages_stickerSet;
                }
                if (z10) {
                    this.stickerSetDefaultChannelStatuses = tL_messages_stickerSet;
                }
            }
            saveStickerSetIntoCache(tL_messages_stickerSet);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupStickersDidLoad, Long.valueOf(tL_messages_stickerSet.set.f22419id), tL_messages_stickerSet);
        }
    }

    public static int lambda$getTextStyleRuns$180(TLRPC.MessageEntity messageEntity, TLRPC.MessageEntity messageEntity2) {
        int i10 = messageEntity.offset;
        int i11 = messageEntity2.offset;
        if (i10 > i11) {
            return 1;
        }
        if (i10 < i11) {
            return -1;
        }
        return 0;
    }

    public static int lambda$increaseInlineRating$150(TLRPC.TL_topPeer tL_topPeer, TLRPC.TL_topPeer tL_topPeer2) {
        double d = tL_topPeer.rating;
        double d10 = tL_topPeer2.rating;
        if (d > d10) {
            return -1;
        }
        if (d < d10) {
            return 1;
        }
        return 0;
    }

    public static int lambda$increasePeerRaiting$155(TLRPC.TL_topPeer tL_topPeer, TLRPC.TL_topPeer tL_topPeer2) {
        double d = tL_topPeer.rating;
        double d10 = tL_topPeer2.rating;
        if (d > d10) {
            return -1;
        }
        if (d < d10) {
            return 1;
        }
        return 0;
    }

    public void lambda$increasePeerRaiting$156(long j10, double d) {
        TLRPC.TL_topPeer tL_topPeer;
        int i10 = 0;
        while (true) {
            if (i10 < this.hints.size()) {
                tL_topPeer = this.hints.get(i10);
                if (tL_topPeer.peer.user_id == j10) {
                    break;
                }
                i10++;
            } else {
                tL_topPeer = null;
                break;
            }
        }
        if (tL_topPeer == null) {
            tL_topPeer = new TLRPC.TL_topPeer();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_topPeer.peer = tL_peerUser;
            tL_peerUser.user_id = j10;
            this.hints.add(tL_topPeer);
        }
        tL_topPeer.rating = Math.exp(d / getMessagesController().ratingDecay) + tL_topPeer.rating;
        Collections.sort(this.hints, new q(11));
        savePeer(j10, 0, tL_topPeer.rating);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadHints, new Object[0]);
    }

    public void lambda$increasePeerRaiting$157(final long j10) {
        int i10;
        double d = 0.0d;
        try {
            SQLiteDatabase database = getMessagesStorage().getDatabase();
            Locale locale = Locale.US;
            int i11 = 0;
            SQLiteCursor queryFinalized = database.queryFinalized("SELECT MAX(mid), MAX(date) FROM messages_v2 WHERE uid = " + j10 + " AND out = 1", new Object[0]);
            if (queryFinalized.next()) {
                i11 = queryFinalized.intValue(0);
                i10 = queryFinalized.intValue(1);
            } else {
                i10 = 0;
            }
            queryFinalized.dispose();
            if (i11 > 0 && getUserConfig().ratingLoadTime != 0) {
                d = i10 - getUserConfig().ratingLoadTime;
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        final double d10 = d;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$increasePeerRaiting$156(j10, d10);
            }
        });
    }

    public static int lambda$increaseWebappRating$151(TLRPC.TL_topPeer tL_topPeer, TLRPC.TL_topPeer tL_topPeer2) {
        double d = tL_topPeer.rating;
        double d10 = tL_topPeer2.rating;
        if (d > d10) {
            return -1;
        }
        if (d < d10) {
            return 1;
        }
        return 0;
    }

    public void lambda$loadArchivedStickersCount$71(TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        if (tL_error == null) {
            TLRPC.TL_messages_archivedStickers tL_messages_archivedStickers = (TLRPC.TL_messages_archivedStickers) tLObject;
            this.archivedStickersCount[i10] = tL_messages_archivedStickers.count;
            MessagesController.getNotificationsSettings(this.currentAccount).edit().putInt(j7.l1.k(i10, "archivedStickersCount"), tL_messages_archivedStickers.count).commit();
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.archivedStickersCountDidLoad, Integer.valueOf(i10));
        }
    }

    public void lambda$loadArchivedStickersCount$72(int i10, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new h0(this, tL_error, tLObject, i10, 6));
    }

    public void lambda$loadAttachMenuBots$3() {
        long j10;
        int i10;
        SQLiteCursor sQLiteCursor;
        int i11;
        TLRPC.TL_attachMenuBots tL_attachMenuBots;
        TLRPC.TL_attachMenuBots tL_attachMenuBots2;
        int i12;
        SQLiteCursor sQLiteCursor2 = null;
        long j11 = 0;
        try {
            try {
                SQLiteCursor queryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT data, hash, date FROM attach_menu_bots", new Object[0]);
                try {
                    try {
                        if (queryFinalized.next()) {
                            NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                            if (byteBufferValue != null) {
                                TLRPC.AttachMenuBots TLdeserialize = TLRPC.AttachMenuBots.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), true);
                                if (TLdeserialize instanceof TLRPC.TL_attachMenuBots) {
                                    sQLiteCursor2 = (TLRPC.TL_attachMenuBots) TLdeserialize;
                                }
                                byteBufferValue.reuse();
                            }
                            j11 = queryFinalized.longValue(1);
                            j10 = j11;
                            tL_attachMenuBots2 = sQLiteCursor2;
                            i12 = queryFinalized.intValue(2);
                        } else {
                            j10 = 0;
                            tL_attachMenuBots2 = null;
                            i12 = 0;
                        }
                        if (tL_attachMenuBots2 != null) {
                            try {
                                ArrayList<Long> arrayList = new ArrayList<>();
                                for (int i13 = 0; i13 < tL_attachMenuBots2.bots.size(); i13++) {
                                    arrayList.add(Long.valueOf(tL_attachMenuBots2.bots.get(i13).bot_id));
                                }
                                tL_attachMenuBots2.users.addAll(getMessagesStorage().getUsers(arrayList));
                            } catch (Exception e10) {
                                e = e10;
                                sQLiteCursor = tL_attachMenuBots2;
                                i10 = i12;
                                sQLiteCursor2 = queryFinalized;
                                FileLog.e((Throwable) e, false);
                                if (sQLiteCursor2 != null) {
                                    sQLiteCursor2.dispose();
                                }
                                i11 = i10;
                                tL_attachMenuBots = sQLiteCursor;
                                processLoadedMenuBots(tL_attachMenuBots, j10, i11, true);
                            }
                        }
                        queryFinalized.dispose();
                        i11 = i12;
                        tL_attachMenuBots = tL_attachMenuBots2;
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteCursor2 = queryFinalized;
                        if (sQLiteCursor2 != null) {
                            sQLiteCursor2.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e11) {
                    e = e11;
                    j10 = j11;
                    i10 = 0;
                    sQLiteCursor = sQLiteCursor2;
                }
            } catch (Exception e12) {
                e = e12;
                j10 = 0;
                i10 = 0;
                sQLiteCursor = null;
            }
            processLoadedMenuBots(tL_attachMenuBots, j10, i11, true);
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public void lambda$loadAttachMenuBots$4(Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (tLObject instanceof TLRPC.TL_attachMenuBotsNotModified) {
            processLoadedMenuBots(null, 0L, currentTimeMillis, false);
        } else if (tLObject instanceof TLRPC.TL_attachMenuBots) {
            TLRPC.TL_attachMenuBots tL_attachMenuBots = (TLRPC.TL_attachMenuBots) tLObject;
            processLoadedMenuBots(tL_attachMenuBots, tL_attachMenuBots.hash, currentTimeMillis, false);
        }
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
    }

    public void lambda$loadAvatarConstructor$241(TLObject tLObject, SharedPreferences sharedPreferences, boolean z10) {
        if (tLObject instanceof TLRPC.TL_emojiList) {
            SerializedData serializedData = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            if (z10) {
                this.profileAvatarConstructorDefault = (TLRPC.TL_emojiList) tLObject;
                edit.putString("profile", Utilities.bytesToHex(serializedData.toByteArray()));
                edit.putLong("profile_last_check", System.currentTimeMillis());
            } else {
                this.groupAvatarConstructorDefault = (TLRPC.TL_emojiList) tLObject;
                edit.putString("group", Utilities.bytesToHex(serializedData.toByteArray()));
                edit.putLong("group_last_check", System.currentTimeMillis());
            }
            edit.apply();
        }
    }

    public void lambda$loadAvatarConstructor$242(SharedPreferences sharedPreferences, boolean z10, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new tj(this, tLObject, sharedPreferences, z10, 8));
    }

    public void lambda$loadBotInfo$197(Utilities.Callback callback, TL_bots.BotInfo botInfo, int i10) {
        if (callback != null) {
            callback.run(botInfo);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botInfoDidLoad, botInfo, Integer.valueOf(i10));
    }

    public static void lambda$loadBotInfo$198(Utilities.Callback callback) {
        if (callback != null) {
            callback.run(null);
        }
    }

    public void lambda$loadBotInfo$199(long j10, long j11, Utilities.Callback callback, int i10) {
        try {
            TL_bots.BotInfo loadBotInfoInternal = loadBotInfoInternal(j10, j11);
            if (loadBotInfoInternal != null) {
                AndroidUtilities.runOnUIThread(new h0(this, callback, loadBotInfoInternal, i10, 7));
            } else if (callback != null) {
                AndroidUtilities.runOnUIThread(new t7(2, callback));
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public void lambda$loadBotKeyboard$195(TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botKeyboardDidLoad, message, topicKey);
    }

    public void lambda$loadBotKeyboard$196(MessagesStorage.TopicKey topicKey, boolean z10) {
        SQLiteCursor queryFinalized;
        TLRPC.Message message;
        NativeByteBuffer byteBufferValue;
        try {
            if (topicKey.topicId != 0) {
                SQLiteDatabase database = getMessagesStorage().getDatabase();
                Locale locale = Locale.US;
                long j10 = topicKey.dialogId;
                long j11 = topicKey.topicId;
                queryFinalized = database.queryFinalized("SELECT info FROM bot_keyboard_topics WHERE uid = " + j10 + " AND tid = " + j11, new Object[0]);
            } else {
                SQLiteDatabase database2 = getMessagesStorage().getDatabase();
                Locale locale2 = Locale.US;
                long j12 = topicKey.dialogId;
                queryFinalized = database2.queryFinalized("SELECT info FROM bot_keyboard WHERE uid = " + j12, new Object[0]);
            }
            if (queryFinalized.next() && !queryFinalized.isNull(0) && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                message = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                byteBufferValue.reuse();
            } else {
                message = null;
            }
            queryFinalized.dispose();
            if (message == null && !z10) {
                return;
            }
            AndroidUtilities.runOnUIThread(new y6(this, message, topicKey));
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public void lambda$loadDraftsIfNeed$185() {
        this.loadingDrafts = false;
    }

    public void lambda$loadDraftsIfNeed$186() {
        this.loadingDrafts = false;
        UserConfig userConfig = getUserConfig();
        userConfig.draftsLoaded = true;
        userConfig.saveConfig(false);
    }

    public void lambda$loadDraftsIfNeed$187(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new k7(this, 16));
            return;
        }
        getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
        AndroidUtilities.runOnUIThread(new k7(this, 17));
    }

    public void lambda$loadFeaturedStickers$55(boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.lambda$loadFeaturedStickers$55(boolean):void");
    }

    public void lambda$loadFeaturedStickers$56(boolean z10, int i10) {
        this.loadingFeaturedStickers[z10 ? 1 : 0] = false;
        this.featuredStickersLoaded[z10 ? 1 : 0] = true;
        this.loadFeaturedDate[z10 ? 1 : 0] = i10;
    }

    public void lambda$loadFeaturedStickers$57(TLObject tLObject, boolean z10, long j10) {
        if (tLObject instanceof TLRPC.TL_messages_featuredStickers) {
            TLRPC.TL_messages_featuredStickers tL_messages_featuredStickers = (TLRPC.TL_messages_featuredStickers) tLObject;
            processLoadedFeaturedStickers(z10, tL_messages_featuredStickers.sets, tL_messages_featuredStickers.unread, tL_messages_featuredStickers.premium, false, (int) (System.currentTimeMillis() / 1000), tL_messages_featuredStickers.hash);
        } else if (tLObject instanceof TLRPC.TL_messages_featuredStickersNotModified) {
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            AndroidUtilities.runOnUIThread(new t8(this, z10, currentTimeMillis, 2));
            putFeaturedStickersToCache(z10, null, null, currentTimeMillis, j10, false);
        } else {
            processLoadedFeaturedStickers(z10, null, null, false, false, (int) (System.currentTimeMillis() / 1000), j10);
        }
    }

    public void lambda$loadFeaturedStickers$58(boolean z10, long j10, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new v8(this, tLObject, z10, j10, 0));
    }

    public void lambda$loadGroupStickerSet$43(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.groupStickerSets.k(tL_messages_stickerSet, tL_messages_stickerSet.set.f22419id);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupStickersDidLoad, Long.valueOf(tL_messages_stickerSet.set.f22419id), tL_messages_stickerSet);
    }

    public void lambda$loadGroupStickerSet$44(TLRPC.StickerSet stickerSet) {
        TLRPC.StickerSet stickerSet2;
        NativeByteBuffer byteBufferValue;
        try {
            SQLiteDatabase database = getMessagesStorage().getDatabase();
            SQLiteCursor queryFinalized = database.queryFinalized("SELECT document FROM web_recent_v3 WHERE id = 's_" + stickerSet.f22419id + "'", new Object[0]);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
            if (queryFinalized.next() && !queryFinalized.isNull(0) && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                tL_messages_stickerSet = TLRPC.messages_StickerSet.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                byteBufferValue.reuse();
            }
            queryFinalized.dispose();
            if (tL_messages_stickerSet == null || (stickerSet2 = tL_messages_stickerSet.set) == null || stickerSet2.hash != stickerSet.hash) {
                loadGroupStickerSet(stickerSet, false);
            }
            if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                AndroidUtilities.runOnUIThread(new f7(this, tL_messages_stickerSet, 2));
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    public void lambda$loadGroupStickerSet$45(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.groupStickerSets.k(tL_messages_stickerSet, tL_messages_stickerSet.set.f22419id);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupStickersDidLoad, Long.valueOf(tL_messages_stickerSet.set.f22419id), tL_messages_stickerSet);
    }

    public void lambda$loadGroupStickerSet$46(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            AndroidUtilities.runOnUIThread(new f7(this, (TLRPC.TL_messages_stickerSet) tLObject, 1));
        }
    }

    public void lambda$loadHints$144(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6) {
        getMessagesController().putUsers(arrayList, true);
        getMessagesController().putChats(arrayList2, true);
        this.loading = false;
        this.loaded = true;
        this.hints = arrayList3;
        this.inlineBots = arrayList4;
        this.guestBots = arrayList5;
        this.webapps = arrayList6;
        buildShortcuts();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadHints, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadInlineHints, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadGuestBotHints, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadWebappsHints, new Object[0]);
        if (Math.abs(getUserConfig().lastHintsSyncTime - ((int) (System.currentTimeMillis() / 1000))) < 86400 && !BuildVars.DEBUG_PRIVATE_VERSION) {
            return;
        }
        loadHints(false);
    }

    public void lambda$loadHints$145() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList<TLRPC.User> arrayList5 = new ArrayList<>();
        ArrayList<TLRPC.Chat> arrayList6 = new ArrayList<>();
        long clientUserId = getUserConfig().getClientUserId();
        try {
            ArrayList<Long> arrayList7 = new ArrayList<>();
            ArrayList arrayList8 = new ArrayList();
            int i10 = 0;
            SQLiteCursor queryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT did, type, rating FROM chat_hints WHERE 1 ORDER BY rating DESC", new Object[0]);
            while (queryFinalized.next()) {
                long longValue = queryFinalized.longValue(i10);
                if (longValue != clientUserId) {
                    int intValue = queryFinalized.intValue(1);
                    TLRPC.TL_topPeer tL_topPeer = new TLRPC.TL_topPeer();
                    long j10 = clientUserId;
                    tL_topPeer.rating = queryFinalized.doubleValue(2);
                    if (longValue > 0) {
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_topPeer.peer = tL_peerUser;
                        tL_peerUser.user_id = longValue;
                        arrayList7.add(Long.valueOf(longValue));
                    } else {
                        TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                        tL_topPeer.peer = tL_peerChat;
                        long j11 = -longValue;
                        tL_peerChat.chat_id = j11;
                        arrayList8.add(Long.valueOf(j11));
                    }
                    if (intValue == 0) {
                        arrayList.add(tL_topPeer);
                    } else if (intValue == 1) {
                        arrayList2.add(tL_topPeer);
                    } else if (intValue == 2) {
                        arrayList4.add(tL_topPeer);
                    } else if (intValue == 3) {
                        arrayList3.add(tL_topPeer);
                    }
                    clientUserId = j10;
                    i10 = 0;
                }
            }
            queryFinalized.dispose();
            if (!arrayList7.isEmpty()) {
                getMessagesStorage().getUsersInternal(arrayList7, arrayList5);
            }
            if (!arrayList8.isEmpty()) {
                getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList8), arrayList6);
            }
            AndroidUtilities.runOnUIThread(new ll(this, arrayList5, arrayList6, arrayList, arrayList2, arrayList3, arrayList4, 2));
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public void lambda$loadHints$146() {
        getUserConfig().suggestContacts = true;
        getUserConfig().lastHintsSyncTime = (int) (System.currentTimeMillis() / 1000);
        getUserConfig().saveConfig(false);
    }

    public void lambda$loadHints$147(TLRPC.TL_contacts_topPeers tL_contacts_topPeers) {
        int i10;
        try {
            getMessagesStorage().getDatabase().executeFast("DELETE FROM chat_hints WHERE 1").stepThis().dispose();
            getMessagesStorage().getDatabase().beginTransaction();
            getMessagesStorage().putUsersAndChats(tL_contacts_topPeers.users, tL_contacts_topPeers.chats, false, false);
            SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
            for (int i11 = 0; i11 < tL_contacts_topPeers.categories.size(); i11++) {
                TLRPC.TL_topPeerCategoryPeers tL_topPeerCategoryPeers = tL_contacts_topPeers.categories.get(i11);
                TLRPC.TopPeerCategory topPeerCategory = tL_topPeerCategoryPeers.category;
                if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsInline) {
                    i10 = 1;
                } else if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsApp) {
                    i10 = 2;
                } else if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsGuestChat) {
                    i10 = 3;
                } else {
                    i10 = 0;
                }
                for (int i12 = 0; i12 < tL_topPeerCategoryPeers.peers.size(); i12++) {
                    TLRPC.TL_topPeer tL_topPeer = tL_topPeerCategoryPeers.peers.get(i12);
                    executeFast.requery();
                    executeFast.bindLong(1, MessageObject.getPeerId(tL_topPeer.peer));
                    executeFast.bindInteger(2, i10);
                    executeFast.bindDouble(3, tL_topPeer.rating);
                    executeFast.bindInteger(4, 0);
                    executeFast.step();
                }
            }
            executeFast.dispose();
            getMessagesStorage().getDatabase().commitTransaction();
            AndroidUtilities.runOnUIThread(new k7(this, 14));
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public void lambda$loadHints$148(TLRPC.contacts_TopPeers contacts_toppeers, TLRPC.TL_error tL_error) {
        if (contacts_toppeers instanceof TLRPC.TL_contacts_topPeers) {
            TLRPC.TL_contacts_topPeers tL_contacts_topPeers = (TLRPC.TL_contacts_topPeers) contacts_toppeers;
            getMessagesController().putUsers(tL_contacts_topPeers.users, false);
            getMessagesController().putChats(tL_contacts_topPeers.chats, false);
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            for (int i10 = 0; i10 < tL_contacts_topPeers.categories.size(); i10++) {
                TLRPC.TL_topPeerCategoryPeers tL_topPeerCategoryPeers = tL_contacts_topPeers.categories.get(i10);
                TLRPC.TopPeerCategory topPeerCategory = tL_topPeerCategoryPeers.category;
                if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsInline) {
                    this.inlineBots = tL_topPeerCategoryPeers.peers;
                    getUserConfig().botRatingLoadTime = currentTimeMillis;
                } else if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsApp) {
                    this.webapps = tL_topPeerCategoryPeers.peers;
                    getUserConfig().webappRatingLoadTime = currentTimeMillis;
                } else if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsGuestChat) {
                    this.guestBots = tL_topPeerCategoryPeers.peers;
                    getUserConfig().botGuestRatingLoadTime = currentTimeMillis;
                } else {
                    this.hints = tL_topPeerCategoryPeers.peers;
                    long clientUserId = getUserConfig().getClientUserId();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= this.hints.size()) {
                            break;
                        } else if (this.hints.get(i11).peer.user_id == clientUserId) {
                            this.hints.remove(i11);
                            break;
                        } else {
                            i11++;
                        }
                    }
                    getUserConfig().ratingLoadTime = (int) (System.currentTimeMillis() / 1000);
                }
            }
            getUserConfig().saveConfig(false);
            buildShortcuts();
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadHints, new Object[0]);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadInlineHints, new Object[0]);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadGuestBotHints, new Object[0]);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadWebappsHints, new Object[0]);
            getMessagesStorage().getStorageQueue().postRunnable(new c2(19, this, tL_contacts_topPeers));
        } else if (contacts_toppeers instanceof TLRPC.TL_contacts_topPeersDisabled) {
            getUserConfig().suggestContacts = false;
            getUserConfig().lastHintsSyncTime = (int) (System.currentTimeMillis() / 1000);
            getUserConfig().saveConfig(false);
            clearTopPeers();
        }
    }

    public void lambda$loadMedia$126(long j10, int i10, int i11, int i12, int i13, long j11, int i14, boolean z10, int i15, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            getMessagesController().removeDeletedMessagesFromArray(j10, messages_messages.messages);
            boolean z11 = false;
            if (i10 == 0 ? messages_messages.messages.size() == 0 : messages_messages.messages.size() <= 1) {
                z11 = true;
            }
            processLoadedMedia(messages_messages, j10, i11, i12, i10, i13, j11, 0, i14, z10, z11, i15);
        }
    }

    public void lambda$loadMusic$141(long j10, ArrayList arrayList, ArrayList arrayList2) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.musicDidLoad, Long.valueOf(j10), arrayList, arrayList2);
    }

    public void lambda$loadMusic$142(long r18, long r20, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.lambda$loadMusic$142(long, long, long):void");
    }

    public void lambda$loadPinnedMessageInternal$164(long j10, long j11, TLRPC.TL_channels_getMessages tL_channels_getMessages, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            removeEmptyMessages(messages_messages.messages);
            if (!messages_messages.messages.isEmpty()) {
                getMessagesController().getChat(Long.valueOf(j10));
                ImageLoader.saveMessagesThumbs(messages_messages.messages);
                broadcastPinnedMessage(messages_messages.messages, messages_messages.users, messages_messages.chats, false, false);
                getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                savePinnedMessages(j11, messages_messages.messages);
                return;
            }
        }
        getMessagesStorage().updatePinnedMessages(j11, tL_channels_getMessages.f22430id, false, -1, 0, false, null);
    }

    public void lambda$loadPinnedMessageInternal$165(long j10, TLRPC.TL_messages_getMessages tL_messages_getMessages, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            removeEmptyMessages(messages_messages.messages);
            if (!messages_messages.messages.isEmpty()) {
                ImageLoader.saveMessagesThumbs(messages_messages.messages);
                broadcastPinnedMessage(messages_messages.messages, messages_messages.users, messages_messages.chats, false, false);
                getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                savePinnedMessages(j10, messages_messages.messages);
                return;
            }
        }
        getMessagesStorage().updatePinnedMessages(j10, tL_messages_getMessages.f22486id, false, -1, 0, false, null);
    }

    public void lambda$loadPinnedMessages$161(long j10) {
        this.loadingPinnedMessages.l(j10);
    }

    public void lambda$loadPinnedMessages$162(int i10, TLRPC.TL_messages_search tL_messages_search, long j10, int i11, TLObject tLObject, TLRPC.TL_error tL_error) {
        int i12;
        boolean z10;
        ArrayList<Integer> arrayList = new ArrayList<>();
        HashMap<Integer, MessageObject> hashMap = new HashMap<>();
        int i13 = 1;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            a0.h hVar = new a0.h();
            for (int i14 = 0; i14 < messages_messages.users.size(); i14++) {
                TLRPC.User user = messages_messages.users.get(i14);
                hVar.k(user, user.f22539id);
            }
            a0.h hVar2 = new a0.h();
            for (int i15 = 0; i15 < messages_messages.chats.size(); i15++) {
                TLRPC.Chat chat = messages_messages.chats.get(i15);
                hVar2.k(chat, chat.f22392id);
            }
            getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
            getMessagesController().putUsers(messages_messages.users, false);
            getMessagesController().putChats(messages_messages.chats, false);
            int size = messages_messages.messages.size();
            for (int i16 = 0; i16 < size; i16++) {
                TLRPC.Message message = messages_messages.messages.get(i16);
                if (!(message instanceof TLRPC.TL_messageService) && !(message instanceof TLRPC.TL_messageEmpty)) {
                    arrayList.add(Integer.valueOf(message.f22413id));
                    hashMap.put(Integer.valueOf(message.f22413id), new MessageObject(this.currentAccount, message, hVar, hVar2, false, false));
                }
            }
            if (i10 != 0 && arrayList.isEmpty()) {
                arrayList.add(Integer.valueOf(i10));
            }
            if (messages_messages.messages.size() >= tL_messages_search.limit) {
                i13 = 0;
            }
            i12 = Math.max(messages_messages.count, messages_messages.messages.size());
            z10 = i13;
        } else {
            if (i10 != 0) {
                arrayList.add(Integer.valueOf(i10));
            } else {
                i13 = 0;
            }
            i12 = i13;
            z10 = false;
        }
        getMessagesStorage().updatePinnedMessages(j10, arrayList, true, i12, i11, z10, hashMap);
        AndroidUtilities.runOnUIThread(new e7(this, j10, 0));
    }

    public void lambda$loadPinnedMessages$163(long j10, long j11, ArrayList arrayList) {
        loadPinnedMessageInternal(j10, j11, arrayList, false);
    }

    public void lambda$loadPremiumPromo$7() {
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo;
        SQLiteCursor queryFinalized;
        SQLiteCursor sQLiteCursor = null;
        r1 = null;
        r1 = null;
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo2 = null;
        sQLiteCursor = null;
        int i10 = 0;
        try {
            try {
                queryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT data, date FROM premium_promo", new Object[0]);
            } catch (Exception e10) {
                e = e10;
                tL_help_premiumPromo = null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                if (byteBufferValue != null) {
                    tL_help_premiumPromo2 = TLRPC.TL_help_premiumPromo.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), true);
                    byteBufferValue.reuse();
                }
                i10 = queryFinalized.intValue(1);
            }
            queryFinalized.dispose();
        } catch (Exception e11) {
            e = e11;
            tL_help_premiumPromo = tL_help_premiumPromo2;
            sQLiteCursor = queryFinalized;
            FileLog.e((Throwable) e, false);
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            tL_help_premiumPromo2 = tL_help_premiumPromo;
            processLoadedPremiumPromo(tL_help_premiumPromo2, i10, true);
        } catch (Throwable th3) {
            th = th3;
            sQLiteCursor = queryFinalized;
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
        processLoadedPremiumPromo(tL_help_premiumPromo2, i10, true);
    }

    public void lambda$loadPremiumPromo$8(TLObject tLObject, TLRPC.TL_error tL_error) {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (tLObject instanceof TLRPC.TL_help_premiumPromo) {
            processLoadedPremiumPromo((TLRPC.TL_help_premiumPromo) tLObject, currentTimeMillis, false);
        }
    }

    public void lambda$loadReactions$11(List list, int i10, int i11) {
        processLoadedReactions(list, i10, i11, true);
    }

    public void lambda$loadReactions$12() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.lambda$loadReactions$12():void");
    }

    public void lambda$loadReactions$13(TLObject tLObject) {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (tLObject instanceof TLRPC.TL_messages_availableReactionsNotModified) {
            processLoadedReactions(null, 0, currentTimeMillis, false);
        } else if (tLObject instanceof TLRPC.TL_messages_availableReactions) {
            TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject;
            processLoadedReactions(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
        }
    }

    public void lambda$loadReactions$14(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new g7(this, tLObject, 1));
    }

    public void lambda$loadRecentAndTopReactions$235(TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr) {
        if (tL_error == null && (tLObject instanceof TLRPC.TL_messages_reactions)) {
            TLRPC.TL_messages_reactions tL_messages_reactions = (TLRPC.TL_messages_reactions) tLObject;
            this.recentReactions.clear();
            this.recentReactions.addAll(tL_messages_reactions.reactions);
            saveReactionsToPref(sharedPreferences, tL_messages_reactions.hash, tL_messages_reactions.reactions);
        }
        zArr[0] = true;
        if (zArr[1]) {
            this.loadingRecentReactions = false;
        }
    }

    public void lambda$loadRecentAndTopReactions$236(SharedPreferences sharedPreferences, boolean[] zArr, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new z6(this, tL_error, tLObject, sharedPreferences, zArr, 1));
    }

    public void lambda$loadRecentAndTopReactions$237(TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr) {
        if (tL_error == null && (tLObject instanceof TLRPC.TL_messages_reactions)) {
            TLRPC.TL_messages_reactions tL_messages_reactions = (TLRPC.TL_messages_reactions) tLObject;
            this.topReactions.clear();
            this.topReactions.addAll(tL_messages_reactions.reactions);
            saveReactionsToPref(sharedPreferences, tL_messages_reactions.hash, tL_messages_reactions.reactions);
        }
        zArr[1] = true;
        if (zArr[0]) {
            this.loadingRecentReactions = false;
        }
    }

    public void lambda$loadRecentAndTopReactions$238(SharedPreferences sharedPreferences, boolean[] zArr, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new z6(this, tL_error, tLObject, sharedPreferences, zArr, 0));
    }

    public void lambda$loadRecents$48(boolean z10, ArrayList arrayList, int i10) {
        if (z10) {
            this.recentGifs = arrayList;
            this.loadingRecentGifs = false;
            this.recentGifsLoaded = true;
        } else {
            this.recentStickers[i10] = arrayList;
            this.loadingRecentStickers[i10] = false;
            this.recentStickersLoaded[i10] = true;
        }
        if (i10 == 3) {
            preloadNextGreetingsSticker();
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.recentDocumentsDidLoad, Boolean.valueOf(z10), Integer.valueOf(i10));
        loadRecents(i10, z10, false, false);
    }

    public void lambda$loadRecents$49(boolean z10, int i10) {
        int i11;
        NativeByteBuffer byteBufferValue;
        if (z10) {
            i11 = 2;
        } else {
            i11 = 3;
            if (i10 != 0) {
                if (i10 == 1) {
                    i11 = 4;
                } else if (i10 == 3) {
                    i11 = 6;
                } else {
                    i11 = 7;
                    if (i10 != 5) {
                        if (i10 == 7) {
                            i11 = 8;
                        } else {
                            i11 = 5;
                        }
                    }
                }
            }
        }
        try {
            SQLiteDatabase database = getMessagesStorage().getDatabase();
            SQLiteCursor queryFinalized = database.queryFinalized("SELECT document FROM web_recent_v3 WHERE type = " + i11 + " ORDER BY date DESC", new Object[0]);
            ArrayList arrayList = new ArrayList();
            while (queryFinalized.next()) {
                if (!queryFinalized.isNull(0) && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                    TLRPC.Document TLdeserialize = TLRPC.Document.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    if (TLdeserialize != null) {
                        arrayList.add(TLdeserialize);
                    }
                    byteBufferValue.reuse();
                }
            }
            queryFinalized.dispose();
            AndroidUtilities.runOnUIThread(new m9(this, z10, arrayList, i10));
        } catch (Throwable th2) {
            getMessagesStorage().checkSQLException(th2);
        }
    }

    public void lambda$loadRecents$50(int i10, TLObject tLObject, TLRPC.TL_error tL_error) {
        ArrayList<TLRPC.Document> arrayList;
        if (tLObject instanceof TLRPC.TL_messages_savedGifs) {
            arrayList = ((TLRPC.TL_messages_savedGifs) tLObject).gifs;
        } else {
            arrayList = null;
        }
        processLoadedRecentDocuments(i10, arrayList, true, 0, true);
    }

    public void lambda$loadRecents$51(int i10, TLObject tLObject, TLRPC.TL_error tL_error) {
        ArrayList<TLRPC.Document> arrayList;
        if (i10 != 3 && i10 != 7) {
            if (i10 == 2) {
                if (tLObject instanceof TLRPC.TL_messages_favedStickers) {
                    arrayList = ((TLRPC.TL_messages_favedStickers) tLObject).stickers;
                }
                arrayList = null;
            } else {
                if (tLObject instanceof TLRPC.TL_messages_recentStickers) {
                    arrayList = ((TLRPC.TL_messages_recentStickers) tLObject).stickers;
                }
                arrayList = null;
            }
        } else {
            if (tLObject instanceof TLRPC.TL_messages_stickers) {
                arrayList = ((TLRPC.TL_messages_stickers) tLObject).stickers;
            }
            arrayList = null;
        }
        processLoadedRecentDocuments(i10, arrayList, false, 0, true);
    }

    public void lambda$loadRepliesOfDraftReplies$0(ArrayList arrayList) {
        try {
            ArrayList<Long> arrayList2 = new ArrayList<>();
            ArrayList<Long> arrayList3 = new ArrayList<>();
            a0.h hVar = new a0.h();
            a0.h hVar2 = new a0.h();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                try {
                    MessagesStorage.addReplyMessages((TLRPC.Message) arrayList.get(i10), hVar, hVar2);
                } catch (Exception e10) {
                    getMessagesStorage().checkSQLException(e10);
                }
            }
            getMessagesStorage().loadReplyMessages(hVar, hVar2, arrayList2, arrayList3, 0);
        } catch (Exception e11) {
            FileLog.e(e11);
        }
    }

    public void lambda$loadReplyIcons$243(TLObject tLObject, SharedPreferences sharedPreferences) {
        if (tLObject instanceof TLRPC.TL_emojiList) {
            SerializedData serializedData = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            this.replyIconsDefault = (TLRPC.TL_emojiList) tLObject;
            edit.putString("replyicons", Utilities.bytesToHex(serializedData.toByteArray()));
            edit.putLong("replyicons_last_check", System.currentTimeMillis());
            edit.apply();
        }
    }

    public void lambda$loadReplyIcons$244(SharedPreferences sharedPreferences, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new h8(this, tLObject, sharedPreferences, 1));
    }

    public void lambda$loadReplyMessagesForMessages$170(Timer.Task task, long j10, ArrayList arrayList) {
        Timer.done(task);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.replyMessagesDidLoad, Long.valueOf(j10), arrayList, 0);
    }

    public void lambda$loadReplyMessagesForMessages$171(Timer.Task task, Timer timer, ArrayList arrayList, long j10, a0.h hVar, Runnable runnable) {
        Timer.done(task);
        Timer.Task start = Timer.start(timer, "loadReplyMessagesForMessages: (encrypted) loading those messages from storage");
        try {
            ArrayList arrayList2 = new ArrayList();
            SQLiteDatabase database = getMessagesStorage().getDatabase();
            Locale locale = Locale.US;
            SQLiteCursor queryFinalized = database.queryFinalized("SELECT m.data, m.mid, m.date, r.random_id FROM randoms_v2 as r INNER JOIN messages_v2 as m ON r.mid = m.mid AND r.uid = m.uid WHERE r.random_id IN(" + TextUtils.join(",", arrayList) + ")", new Object[0]);
            while (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                if (byteBufferValue != null) {
                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    TLdeserialize.readAttachPath(byteBufferValue, getUserConfig().clientUserId);
                    byteBufferValue.reuse();
                    TLdeserialize.f22413id = queryFinalized.intValue(1);
                    TLdeserialize.date = queryFinalized.intValue(2);
                    TLdeserialize.dialog_id = j10;
                    long longValue = queryFinalized.longValue(3);
                    ArrayList arrayList3 = (ArrayList) hVar.f(longValue);
                    hVar.l(longValue);
                    if (arrayList3 != null) {
                        MessageObject messageObject = new MessageObject(this.currentAccount, TLdeserialize, false, false);
                        arrayList2.add(messageObject);
                        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                            MessageObject messageObject2 = (MessageObject) arrayList3.get(i10);
                            messageObject2.replyMessageObject = messageObject;
                            messageObject2.applyTimestampsHighlightForReplyMsg();
                            messageObject2.messageOwner.reply_to = new TLRPC.TL_messageReplyHeader();
                            TLRPC.MessageReplyHeader messageReplyHeader = messageObject2.messageOwner.reply_to;
                            messageReplyHeader.flags |= 16;
                            messageReplyHeader.reply_to_msg_id = messageObject.getRealId();
                        }
                    }
                }
            }
            queryFinalized.dispose();
            if (hVar.m() != 0) {
                for (int i11 = 0; i11 < hVar.m(); i11++) {
                    ArrayList arrayList4 = (ArrayList) hVar.n(i11);
                    for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                        TLRPC.MessageReplyHeader messageReplyHeader2 = ((MessageObject) arrayList4.get(i12)).messageOwner.reply_to;
                        if (messageReplyHeader2 != null) {
                            messageReplyHeader2.reply_to_random_id = 0L;
                        }
                    }
                }
            }
            Timer.done(start);
            AndroidUtilities.runOnUIThread(new jh.c2(this, Timer.start(timer, "loadReplyMessagesForMessages (encrypted) runOnUIThread: posting notification"), j10, arrayList2, 14));
            if (runnable != null) {
                runnable.run();
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public static void lambda$loadReplyMessagesForMessages$172(AtomicInteger atomicInteger, Runnable runnable) {
        if (atomicInteger.decrementAndGet() == 0 && runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
    }

    public void lambda$loadReplyMessagesForMessages$173(TLRPC.TL_error tL_error, TLRPC.messages_Messages messages_messages, long j10, long j11, a0.h hVar, boolean z10, TLObject tLObject, TLRPC.TL_error tL_error2) {
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
            messages_messages.messages.addAll(messages_messages2.messages);
            messages_messages.users.addAll(messages_messages2.users);
            messages_messages.chats.addAll(messages_messages2.chats);
            for (int i10 = 0; i10 < messages_messages.messages.size(); i10++) {
                TLRPC.Message message = messages_messages.messages.get(i10);
                if (message.dialog_id == 0) {
                    message.dialog_id = j10;
                }
            }
            MessageObject.fixMessagePeer(messages_messages.messages, j11);
            ImageLoader.saveMessagesThumbs(messages_messages.messages);
            broadcastReplyMessages(messages_messages.messages, hVar, messages_messages.users, messages_messages.chats, j10, false);
            getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
            saveReplyMessages(hVar, messages_messages.messages, z10);
        }
    }

    public void lambda$loadReplyMessagesForMessages$174(Timer.Task task, TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages, final long j10, final long j11, final a0.h hVar, final boolean z10, Timer timer, AtomicInteger atomicInteger, Runnable runnable, TLObject tLObject, final TLRPC.TL_error tL_error) {
        TLRPC.TL_messages_getMessages tL_messages_getMessages;
        Timer.done(task);
        if (tL_error == null) {
            final TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            int i10 = 0;
            while (i10 < messages_messages.messages.size()) {
                if (messages_messages.messages.get(i10) instanceof TLRPC.TL_messageEmpty) {
                    messages_messages.messages.remove(i10);
                    i10--;
                }
                i10++;
            }
            if (messages_messages.messages.size() < tL_messages_getScheduledMessages.f22492id.size()) {
                if (j10 != 0) {
                    TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                    tL_channels_getMessages.channel = getMessagesController().getInputChannel(j10);
                    tL_channels_getMessages.f22430id = tL_messages_getScheduledMessages.f22492id;
                    tL_messages_getMessages = tL_channels_getMessages;
                } else {
                    TLRPC.TL_messages_getMessages tL_messages_getMessages2 = new TLRPC.TL_messages_getMessages();
                    tL_messages_getMessages2.f22486id = tL_messages_getScheduledMessages.f22492id;
                    tL_messages_getMessages = tL_messages_getMessages2;
                }
                getConnectionsManager().sendRequest(tL_messages_getMessages, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                        MediaDataController.this.lambda$loadReplyMessagesForMessages$173(tL_error, messages_messages, j11, j10, hVar, z10, tLObject2, tL_error2);
                    }
                });
            } else {
                for (int i11 = 0; i11 < messages_messages.messages.size(); i11++) {
                    TLRPC.Message message = messages_messages.messages.get(i11);
                    if (message.dialog_id == 0) {
                        message.dialog_id = j11;
                    }
                }
                MessageObject.fixMessagePeer(messages_messages.messages, j10);
                ImageLoader.saveMessagesThumbs(messages_messages.messages);
                broadcastReplyMessages(messages_messages.messages, hVar, messages_messages.users, messages_messages.chats, j11, false);
                getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                saveReplyMessages(hVar, messages_messages.messages, z10);
            }
        } else {
            Timer.log(timer, "getScheduledMessages error: " + tL_error.code + " " + tL_error.text);
        }
        if (atomicInteger.decrementAndGet() == 0 && runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
    }

    public void lambda$loadReplyMessagesForMessages$175(Timer.Task task, long j10, long j11, a0.h hVar, boolean z10, Timer timer, AtomicInteger atomicInteger, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        Timer.done(task);
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            for (int i10 = 0; i10 < messages_messages.messages.size(); i10++) {
                TLRPC.Message message = messages_messages.messages.get(i10);
                if (message.dialog_id == 0) {
                    message.dialog_id = j10;
                }
            }
            MessageObject.fixMessagePeer(messages_messages.messages, j11);
            ImageLoader.saveMessagesThumbs(messages_messages.messages);
            broadcastReplyMessages(messages_messages.messages, hVar, messages_messages.users, messages_messages.chats, j10, false);
            getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
            saveReplyMessages(hVar, messages_messages.messages, z10);
        } else {
            Timer.log(timer, "channels.getMessages error: " + tL_error.code + " " + tL_error.text);
        }
        if (atomicInteger.decrementAndGet() == 0 && runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
    }

    public void lambda$loadReplyMessagesForMessages$176(Timer.Task task, long j10, a0.h hVar, boolean z10, Timer timer, AtomicInteger atomicInteger, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        Timer.done(task);
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            for (int i10 = 0; i10 < messages_messages.messages.size(); i10++) {
                TLRPC.Message message = messages_messages.messages.get(i10);
                if (message.dialog_id == 0) {
                    message.dialog_id = j10;
                }
            }
            ImageLoader.saveMessagesThumbs(messages_messages.messages);
            broadcastReplyMessages(messages_messages.messages, hVar, messages_messages.users, messages_messages.chats, j10, false);
            getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
            saveReplyMessages(hVar, messages_messages.messages, z10);
        } else {
            Timer.log(timer, "messages.getMessages error: " + tL_error.code + " " + tL_error.text);
        }
        if (atomicInteger.decrementAndGet() == 0 && runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
    }

    public void lambda$loadReplyMessagesForMessages$177(org.telegram.messenger.Timer.Task r25, a0.h r26, final java.util.concurrent.atomic.AtomicInteger r27, final java.lang.Runnable r28, int r29, final org.telegram.messenger.Timer r30, final a0.h r31, a0.h r32, final boolean r33, final long r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.lambda$loadReplyMessagesForMessages$177(org.telegram.messenger.Timer$Task, a0.h, java.util.concurrent.atomic.AtomicInteger, java.lang.Runnable, int, org.telegram.messenger.Timer, a0.h, a0.h, boolean, long):void");
    }

    public void lambda$loadRestrictedStatusEmojis$245(TLObject tLObject, SharedPreferences sharedPreferences) {
        if (tLObject instanceof TLRPC.TL_emojiList) {
            SerializedData serializedData = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            this.restrictedStatusEmojis = (TLRPC.TL_emojiList) tLObject;
            edit.putString("restrictedstatuses", Utilities.bytesToHex(serializedData.toByteArray()));
            edit.putLong("restrictedstatuses_last_check", System.currentTimeMillis());
            edit.apply();
        }
    }

    public void lambda$loadRestrictedStatusEmojis$246(SharedPreferences sharedPreferences, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new h8(this, tLObject, sharedPreferences, 0));
    }

    public void lambda$loadSavedReactions$239(TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences) {
        if (tL_error == null && (tLObject instanceof TLRPC.TL_messages_reactions)) {
            TLRPC.TL_messages_reactions tL_messages_reactions = (TLRPC.TL_messages_reactions) tLObject;
            this.savedReactions.clear();
            this.savedReactions.addAll(tL_messages_reactions.reactions);
            saveReactionsToPref(sharedPreferences, tL_messages_reactions.hash, tL_messages_reactions.reactions);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.savedReactionTagsUpdate, 0L);
        }
        this.loadingSavedReactions = false;
    }

    public void lambda$loadSavedReactions$240(SharedPreferences sharedPreferences, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ok((BaseController) this, tL_error, (Object) tLObject, (Object) sharedPreferences, 13));
    }

    public void lambda$loadStickers$100(TLObject tLObject, int i10, Utilities.Callback callback, long j10) {
        if (tLObject instanceof TLRPC.TL_messages_allStickers) {
            processLoadStickersResponse(i10, (TLRPC.TL_messages_allStickers) tLObject, new t7(0, callback));
        } else {
            processLoadedStickers(i10, null, false, (int) (System.currentTimeMillis() / 1000), j10, new t7(1, callback));
        }
    }

    public void lambda$loadStickers$101(int i10, Utilities.Callback callback, long j10, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ih.y(this, tLObject, i10, callback, j10, 5));
    }

    public void lambda$loadStickers$91(int i10, boolean z10, Utilities.Callback callback) {
        loadStickers(i10, false, z10, false, callback);
    }

    public static void lambda$loadStickers$92(Utilities.Callback callback, ArrayList arrayList) {
        if (callback != null) {
            callback.run(arrayList);
        }
    }

    public void lambda$loadStickers$93(int r10, org.telegram.messenger.Utilities.Callback r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.lambda$loadStickers$93(int, org.telegram.messenger.Utilities$Callback):void");
    }

    public static void lambda$loadStickers$94(Utilities.Callback callback) {
        if (callback != null) {
            callback.run(null);
        }
    }

    public static void lambda$loadStickers$95(Utilities.Callback callback) {
        if (callback != null) {
            callback.run(null);
        }
    }

    public static void lambda$loadStickers$96(Utilities.Callback callback) {
        if (callback != null) {
            callback.run(null);
        }
    }

    public void lambda$loadStickers$97(int i10, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
            ArrayList<TLRPC.TL_messages_stickerSet> arrayList = new ArrayList<>();
            arrayList.add((TLRPC.TL_messages_stickerSet) tLObject);
            processLoadedStickers(i10, arrayList, false, (int) (System.currentTimeMillis() / 1000), calcStickersHash(arrayList), new t7(4, callback));
            return;
        }
        processLoadedStickers(i10, null, false, (int) (System.currentTimeMillis() / 1000), 0L, new t7(5, callback));
    }

    public static void lambda$loadStickers$98(Utilities.Callback callback) {
        if (callback != null) {
            callback.run(null);
        }
    }

    public static void lambda$loadStickers$99(Utilities.Callback callback) {
        if (callback != null) {
            callback.run(null);
        }
    }

    public void lambda$loadStickersByEmojiOrName$83(String str, boolean z10) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
        int i10;
        SQLiteCursor queryFinalized;
        SQLiteCursor sQLiteCursor = null;
        r1 = null;
        r1 = null;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = null;
        int i11 = 0;
        try {
            queryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT data, date FROM stickers_dice WHERE emoji = ?", str);
        } catch (Throwable th2) {
            th = th2;
            tL_messages_stickerSet = null;
        }
        try {
            if (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                if (byteBufferValue != null) {
                    tL_messages_stickerSet3 = TLRPC.messages_StickerSet.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    byteBufferValue.reuse();
                }
                i11 = queryFinalized.intValue(1);
            }
            queryFinalized.dispose();
            tL_messages_stickerSet2 = tL_messages_stickerSet3;
            i10 = i11;
        } catch (Throwable th3) {
            th = th3;
            tL_messages_stickerSet = tL_messages_stickerSet3;
            sQLiteCursor = queryFinalized;
            try {
                FileLog.e(th);
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
                tL_messages_stickerSet2 = tL_messages_stickerSet;
                i10 = 0;
                processLoadedDiceStickers(str, z10, tL_messages_stickerSet2, true, i10);
            } catch (Throwable th4) {
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
                throw th4;
            }
        }
        processLoadedDiceStickers(str, z10, tL_messages_stickerSet2, true, i10);
    }

    public void lambda$loadStickersByEmojiOrName$84(TLRPC.TL_error tL_error, TLObject tLObject, String str, boolean z10) {
        if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
            processLoadedDiceStickers(str, z10, (TLRPC.TL_messages_stickerSet) tLObject, false, (int) (System.currentTimeMillis() / 1000));
        } else {
            processLoadedDiceStickers(str, z10, null, false, (int) (System.currentTimeMillis() / 1000));
        }
    }

    public void lambda$loadStickersByEmojiOrName$85(String str, boolean z10, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new eg.j((Object) this, tL_error, tLObject, str, z10, 4));
    }

    public void lambda$markFeaturedStickersByIdAsRead$67(boolean z10, long j10) {
        int i10;
        this.unreadStickerSets[z10 ? 1 : 0].remove(Long.valueOf(j10));
        this.readingStickerSets[z10 ? 1 : 0].remove(Long.valueOf(j10));
        this.loadFeaturedHash[z10 ? 1 : 0] = calcFeaturedStickersHash(z10, this.featuredStickerSets[z10 ? 1 : 0]);
        NotificationCenter notificationCenter = getNotificationCenter();
        if (z10) {
            i10 = NotificationCenter.featuredEmojiDidLoad;
        } else {
            i10 = NotificationCenter.featuredStickersDidLoad;
        }
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        putFeaturedStickersToCache(z10, this.featuredStickerSets[z10 ? 1 : 0], this.unreadStickerSets[z10 ? 1 : 0], this.loadFeaturedDate[z10 ? 1 : 0], this.loadFeaturedHash[z10 ? 1 : 0], this.loadFeaturedPremium);
    }

    public void lambda$preloadPremiumPreviewStickers$205(TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            return;
        }
        this.previewStickersLoading = false;
        this.premiumPreviewStickers.clear();
        this.premiumPreviewStickers.addAll(((TLRPC.TL_messages_stickers) tLObject).stickers);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.premiumStickersPreviewLoaded, new Object[0]);
    }

    public void lambda$preloadPremiumPreviewStickers$206(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new c9(this, tL_error, tLObject, 1));
    }

    public void lambda$processLoadStickersResponse$73(TLObject tLObject, ArrayList arrayList, int i10, a0.h hVar, TLRPC.StickerSet stickerSet, TLRPC.TL_messages_allStickers tL_messages_allStickers, int i11) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
        arrayList.set(i10, tL_messages_stickerSet);
        hVar.k(tL_messages_stickerSet, stickerSet.f22419id);
        if (hVar.m() == tL_messages_allStickers.sets.size()) {
            int i12 = 0;
            while (i12 < arrayList.size()) {
                if (arrayList.get(i12) == null) {
                    arrayList.remove(i12);
                    i12--;
                }
                i12++;
            }
            processLoadedStickers(i11, arrayList, false, (int) (System.currentTimeMillis() / 1000), tL_messages_allStickers.hash2);
        }
    }

    public void lambda$processLoadStickersResponse$74(ArrayList arrayList, int i10, a0.h hVar, TLRPC.StickerSet stickerSet, TLRPC.TL_messages_allStickers tL_messages_allStickers, int i11, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new n7(this, tLObject, arrayList, i10, hVar, stickerSet, tL_messages_allStickers, i11));
    }

    public void lambda$processLoadedDiceStickers$86(String str) {
        this.loadingDiceStickerSets.remove(str);
    }

    public void lambda$processLoadedDiceStickers$87(String str, boolean z10) {
        loadStickersByEmojiOrName(str, z10, false);
    }

    public void lambda$processLoadedDiceStickers$88(String str, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.diceStickerSetsByEmoji.put(str, tL_messages_stickerSet);
        this.diceEmojiStickerSetsById.k(str, tL_messages_stickerSet.set.f22419id);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.diceStickersDidLoad, str);
    }

    public void lambda$processLoadedDiceStickers$89(boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10, String str, boolean z11) {
        if (z10) {
            long j10 = 1000;
            if (tL_messages_stickerSet == null || Math.abs((System.currentTimeMillis() / 1000) - i10) >= 86400) {
                AndroidUtilities.runOnUIThread(new k8(this, str, z11, 0), (tL_messages_stickerSet != null || z10) ? 0L : 0L);
                if (tL_messages_stickerSet == null) {
                    return;
                }
            }
        }
        if (tL_messages_stickerSet != null) {
            if (!z10) {
                putDiceStickersToCache(str, tL_messages_stickerSet, i10);
            }
            AndroidUtilities.runOnUIThread(new f0(this, str, tL_messages_stickerSet, 26));
        } else if (!z10) {
            putDiceStickersToCache(str, null, i10);
        }
    }

    public void lambda$processLoadedFeaturedStickers$59(boolean z10) {
        this.loadingFeaturedStickers[z10 ? 1 : 0] = false;
        this.featuredStickersLoaded[z10 ? 1 : 0] = true;
    }

    public void lambda$processLoadedFeaturedStickers$60(ArrayList arrayList, long j10, boolean z10) {
        if (arrayList != null && j10 != 0) {
            this.loadFeaturedHash[z10 ? 1 : 0] = j10;
        }
        this.loadingFeaturedStickers[z10 ? 1 : 0] = false;
        loadFeaturedStickers(z10, false);
    }

    public void lambda$processLoadedFeaturedStickers$61(boolean z10, ArrayList arrayList, a0.h hVar, ArrayList arrayList2, long j10, int i10, boolean z11) {
        int i11;
        int i12;
        this.unreadStickerSets[z10 ? 1 : 0] = arrayList;
        this.featuredStickerSetsById[z10 ? 1 : 0] = hVar;
        this.featuredStickerSets[z10 ? 1 : 0] = arrayList2;
        this.loadFeaturedHash[z10 ? 1 : 0] = j10;
        this.loadFeaturedDate[z10 ? 1 : 0] = i10;
        this.loadFeaturedPremium = z11;
        if (z10) {
            i11 = 6;
        } else {
            i11 = 3;
        }
        loadStickers(i11, true, false);
        NotificationCenter notificationCenter = getNotificationCenter();
        if (z10) {
            i12 = NotificationCenter.featuredEmojiDidLoad;
        } else {
            i12 = NotificationCenter.featuredStickersDidLoad;
        }
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i12, new Object[0]);
    }

    public void lambda$processLoadedFeaturedStickers$62(boolean z10, int i10) {
        this.loadFeaturedDate[z10 ? 1 : 0] = i10;
    }

    public void lambda$processLoadedFeaturedStickers$63(boolean z10, ArrayList arrayList, final int i10, final long j10, final boolean z11, final ArrayList arrayList2, final boolean z12) {
        long j11 = 0;
        if ((z10 && (arrayList == null || Math.abs((System.currentTimeMillis() / 1000) - i10) >= 3600)) || (!z10 && arrayList == null && j10 == 0)) {
            v8 v8Var = new v8(this, arrayList, j10, z11);
            if (arrayList == null && !z10) {
                j11 = 1000;
            }
            AndroidUtilities.runOnUIThread(v8Var, j11);
            if (arrayList == null) {
                return;
            }
        }
        if (arrayList != null) {
            try {
                final ArrayList<TLRPC.StickerSetCovered> arrayList3 = new ArrayList<>();
                final a0.h hVar = new a0.h();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i11);
                    arrayList3.add(stickerSetCovered);
                    hVar.k(stickerSetCovered, stickerSetCovered.set.f22419id);
                }
                if (!z10) {
                    putFeaturedStickersToCache(z11, arrayList3, arrayList2, i10, j10, z12);
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MediaDataController.this.lambda$processLoadedFeaturedStickers$61(z11, arrayList2, hVar, arrayList3, j10, i10, z12);
                    }
                });
                return;
            } catch (Throwable th2) {
                FileLog.e(th2);
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new t8(this, z11, i10, 1));
        putFeaturedStickersToCache(z11, null, null, i10, 0L, z12);
    }

    public void lambda$processLoadedMedia$133(TLRPC.messages_Messages messages_messages, int i10, long j10, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i15 = messages_messages.count;
        MessagesController messagesController = getMessagesController();
        ArrayList<TLRPC.User> arrayList2 = messages_messages.users;
        if (i10 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        messagesController.putUsers(arrayList2, z11);
        MessagesController messagesController2 = getMessagesController();
        ArrayList<TLRPC.Chat> arrayList3 = messages_messages.chats;
        if (i10 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        messagesController2.putChats(arrayList3, z12);
        NotificationCenter notificationCenter = getNotificationCenter();
        int i16 = NotificationCenter.mediaDidLoad;
        Long valueOf = Long.valueOf(j10);
        Integer valueOf2 = Integer.valueOf(i15);
        Integer valueOf3 = Integer.valueOf(i11);
        Integer valueOf4 = Integer.valueOf(i12);
        Boolean valueOf5 = Boolean.valueOf(z10);
        if (i13 != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i16, valueOf, valueOf2, arrayList, valueOf3, valueOf4, valueOf5, Boolean.valueOf(z13), Integer.valueOf(i14));
    }

    public void lambda$processLoadedMedia$134(TLRPC.messages_Messages messages_messages, int i10, long j10, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14) {
        AndroidUtilities.runOnUIThread(new b7(this, messages_messages, i10, j10, arrayList, i11, i12, z10, i13, i14, 0));
    }

    public void lambda$processLoadedMedia$135(ArrayList arrayList, Runnable runnable) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            TLRPC.Message messageWithCustomParamsOnlyInternal = getMessagesStorage().getMessageWithCustomParamsOnlyInternal(messageObject.getId(), messageObject.getDialogId());
            TLRPC.Message message = messageObject.messageOwner;
            message.translatedToLanguage = messageWithCustomParamsOnlyInternal.translatedToLanguage;
            message.translatedText = messageWithCustomParamsOnlyInternal.translatedText;
            messageObject.updateTranslation();
        }
        runnable.run();
    }

    public void lambda$processLoadedMedia$136(TLRPC.messages_Messages messages_messages, int i10, long j10, int i11, int i12, boolean z10, int i13, int i14) {
        a0.h hVar = new a0.h();
        for (int i15 = 0; i15 < messages_messages.users.size(); i15++) {
            TLRPC.User user = messages_messages.users.get(i15);
            hVar.k(user, user.f22539id);
        }
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        for (int i16 = 0; i16 < messages_messages.messages.size(); i16++) {
            MessageObject messageObject = new MessageObject(this.currentAccount, messages_messages.messages.get(i16), hVar, true, false);
            messageObject.createStrippedThumb();
            arrayList.add(messageObject);
        }
        getFileLoader().checkMediaExistance(arrayList);
        b7 b7Var = new b7(this, messages_messages, i10, j10, arrayList, i11, i12, z10, i13, i14, 1);
        if (getMessagesController().getTranslateController().isFeatureAvailable(j10)) {
            getMessagesStorage().getStorageQueue().postRunnable(new c9(this, arrayList, b7Var, 2));
        } else {
            b7Var.run();
        }
    }

    public void lambda$processLoadedMediaCount$137(long r20, boolean r22, int r23, int r24, int r25, long r26, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.lambda$processLoadedMediaCount$137(long, boolean, int, int, int, long, int):void");
    }

    public void lambda$processLoadedMenuBots$5() {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.attachMenuBotsDidLoad, new Object[0]);
    }

    public void lambda$processLoadedPremiumPromo$9() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.premiumPromoUpdated, new Object[0]);
    }

    public void lambda$processLoadedReactions$15() {
        preloadDefaultReactions();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reactionsDidLoad, new Object[0]);
    }

    public void lambda$processLoadedRecentDocuments$52(boolean z10, int i10, ArrayList arrayList, boolean z11, int i11) {
        int i12;
        int i13;
        int i14;
        try {
            SQLiteDatabase database = getMessagesStorage().getDatabase();
            int i15 = 2;
            if (z10) {
                i12 = getMessagesController().maxRecentGifsCount;
            } else {
                if (i10 != 3 && i10 != 7) {
                    if (i10 == 2) {
                        i12 = getMessagesController().maxFaveStickersCount;
                    } else {
                        i12 = getMessagesController().maxRecentStickersCount;
                    }
                }
                i12 = 200;
            }
            database.beginTransaction();
            SQLitePreparedStatement executeFast = database.executeFast("REPLACE INTO web_recent_v3 VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            int size = arrayList.size();
            if (z10) {
                i13 = 2;
            } else if (i10 == 0) {
                i13 = 3;
            } else if (i10 == 1) {
                i13 = 4;
            } else if (i10 == 3) {
                i13 = 6;
            } else if (i10 == 5) {
                i13 = 7;
            } else if (i10 == 7) {
                i13 = 8;
            } else {
                i13 = 5;
            }
            if (z11) {
                database.executeFast("DELETE FROM web_recent_v3 WHERE type = " + i13).stepThis().dispose();
            }
            int i16 = 0;
            while (i16 < size && i16 != i12) {
                TLRPC.Document document = (TLRPC.Document) arrayList.get(i16);
                executeFast.requery();
                executeFast.bindString(1, "" + document.f22398id);
                executeFast.bindInteger(i15, i13);
                executeFast.bindString(3, "");
                executeFast.bindString(4, "");
                executeFast.bindString(5, "");
                executeFast.bindInteger(6, 0);
                executeFast.bindInteger(7, 0);
                executeFast.bindInteger(8, 0);
                if (i11 != 0) {
                    i14 = i11;
                } else {
                    i14 = size - i16;
                }
                executeFast.bindInteger(9, i14);
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(document.getObjectSize());
                document.serializeToStream(nativeByteBuffer);
                executeFast.bindByteBuffer(10, nativeByteBuffer);
                executeFast.step();
                nativeByteBuffer.reuse();
                i16++;
                i15 = 2;
            }
            executeFast.dispose();
            database.commitTransaction();
            if (!z11 && arrayList.size() >= i12) {
                database.beginTransaction();
                while (i12 < arrayList.size()) {
                    database.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + ((TLRPC.Document) arrayList.get(i12)).f22398id + "' AND type = " + i13).stepThis().dispose();
                    i12++;
                }
                database.commitTransaction();
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public void lambda$processLoadedRecentDocuments$53(boolean z10, int i10, ArrayList arrayList) {
        SharedPreferences.Editor edit = MessagesController.getEmojiSettings(this.currentAccount).edit();
        if (z10) {
            this.loadingRecentGifs = false;
            this.recentGifsLoaded = true;
            edit.putLong("lastGifLoadTime", System.currentTimeMillis()).apply();
        } else {
            this.loadingRecentStickers[i10] = false;
            this.recentStickersLoaded[i10] = true;
            if (i10 == 0) {
                edit.putLong("lastStickersLoadTime", System.currentTimeMillis()).apply();
            } else if (i10 == 1) {
                edit.putLong("lastStickersLoadTimeMask", System.currentTimeMillis()).apply();
            } else if (i10 == 3) {
                edit.putLong("lastStickersLoadTimeGreet", System.currentTimeMillis()).apply();
            } else if (i10 == 5) {
                edit.putLong("lastStickersLoadTimeEmojiPacks", System.currentTimeMillis()).apply();
            } else if (i10 == 7) {
                edit.putLong("lastStickersLoadTimePremiumStickers", System.currentTimeMillis()).apply();
            } else {
                edit.putLong("lastStickersLoadTimeFavs", System.currentTimeMillis()).apply();
            }
        }
        if (arrayList != null) {
            if (z10) {
                this.recentGifs = arrayList;
            } else {
                this.recentStickers[i10] = arrayList;
            }
            if (i10 == 3) {
                preloadNextGreetingsSticker();
            }
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.recentDocumentsDidLoad, Boolean.valueOf(z10), Integer.valueOf(i10));
        }
    }

    public void lambda$processLoadedStickers$103(int i10) {
        this.loadingStickers[i10] = false;
        this.stickersLoaded[i10] = true;
        Runnable runnable = this.scheduledLoadStickers[i10];
        if (runnable != null) {
            runnable.run();
            this.scheduledLoadStickers[i10] = null;
        }
    }

    public void lambda$processLoadedStickers$104(ArrayList arrayList, long j10, int i10) {
        if (arrayList != null && j10 != 0) {
            this.loadHash[i10] = j10;
        }
        loadStickers(i10, false, false);
    }

    public void lambda$processLoadedStickers$105(int i10, a0.h hVar, HashMap hashMap, ArrayList arrayList, long j10, int i11, a0.h hVar2, HashMap hashMap2, a0.h hVar3, Runnable runnable) {
        for (int i12 = 0; i12 < this.stickerSets[i10].size(); i12++) {
            TLRPC.StickerSet stickerSet = this.stickerSets[i10].get(i12).set;
            this.stickerSetsById.l(stickerSet.f22419id);
            this.stickerSetsByName.remove(stickerSet.short_name);
            if (i10 != 3 && i10 != 6 && i10 != 4) {
                this.installedStickerSetsById.l(stickerSet.f22419id);
            }
        }
        for (int i13 = 0; i13 < hVar.m(); i13++) {
            this.stickerSetsById.k((TLRPC.TL_messages_stickerSet) hVar.n(i13), hVar.j(i13));
            if (i10 != 3 && i10 != 6 && i10 != 4) {
                this.installedStickerSetsById.k((TLRPC.TL_messages_stickerSet) hVar.n(i13), hVar.j(i13));
            }
        }
        this.stickerSetsByName.putAll(hashMap);
        this.stickerSets[i10] = arrayList;
        this.loadHash[i10] = j10;
        this.loadDate[i10] = i11;
        this.stickersByIds[i10] = hVar2;
        if (i10 == 0) {
            this.allStickers = hashMap2;
            this.stickersByEmoji = hVar3;
        } else if (i10 == 3) {
            this.allStickersFeatured = hashMap2;
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i10), Boolean.TRUE);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$processLoadedStickers$106(int i10, int i11) {
        this.loadDate[i10] = i11;
    }

    public void lambda$processLoadedStickers$107(boolean z10, ArrayList arrayList, int i10, long j10, int i11, Runnable runnable) {
        MediaDataController mediaDataController;
        ArrayList arrayList2;
        String str;
        long j11 = 0;
        if ((z10 && (arrayList == null || BuildVars.DEBUG_PRIVATE_VERSION || Math.abs((System.currentTimeMillis() / 1000) - i10) >= 3600)) || (!z10 && arrayList == null && j10 == 0)) {
            mediaDataController = this;
            arrayList2 = arrayList;
            jh.x8 x8Var = new jh.x8(mediaDataController, arrayList2, j10, i11, 2);
            if (arrayList2 == null && !z10) {
                j11 = 1000;
            }
            AndroidUtilities.runOnUIThread(x8Var, j11);
            if (arrayList2 == null) {
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
        } else {
            mediaDataController = this;
            arrayList2 = arrayList;
        }
        if (arrayList2 != null) {
            try {
                ArrayList<TLRPC.TL_messages_stickerSet> arrayList3 = new ArrayList<>();
                a0.h hVar = new a0.h();
                HashMap hashMap = new HashMap();
                a0.h hVar2 = new a0.h();
                a0.h hVar3 = new a0.h();
                HashMap hashMap2 = new HashMap();
                int i12 = 0;
                while (i12 < arrayList2.size()) {
                    try {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList2.get(i12);
                        if (tL_messages_stickerSet != null && mediaDataController.removingStickerSetsUndos.h(tL_messages_stickerSet.set.f22419id) < 0) {
                            arrayList3.add(tL_messages_stickerSet);
                            hVar.k(tL_messages_stickerSet, tL_messages_stickerSet.set.f22419id);
                            hashMap.put(tL_messages_stickerSet.set.short_name, tL_messages_stickerSet);
                            for (int i13 = 0; i13 < tL_messages_stickerSet.documents.size(); i13++) {
                                TLRPC.Document document = tL_messages_stickerSet.documents.get(i13);
                                if (document != null && !(document instanceof TLRPC.TL_documentEmpty)) {
                                    hVar3.k(document, document.f22398id);
                                }
                            }
                            if (!tL_messages_stickerSet.set.archived) {
                                int i14 = 0;
                                while (i14 < tL_messages_stickerSet.packs.size()) {
                                    TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i14);
                                    if (tL_stickerPack != null && (str = tL_stickerPack.emoticon) != null) {
                                        String replace = str.replace("️", "");
                                        tL_stickerPack.emoticon = replace;
                                        ArrayList arrayList4 = (ArrayList) hashMap2.get(replace);
                                        if (arrayList4 == null) {
                                            arrayList4 = new ArrayList();
                                            hashMap2.put(tL_stickerPack.emoticon, arrayList4);
                                        }
                                        int i15 = 0;
                                        while (i15 < tL_stickerPack.documents.size()) {
                                            Long l10 = tL_stickerPack.documents.get(i15);
                                            a0.h hVar4 = hVar;
                                            if (hVar2.h(l10.longValue()) < 0) {
                                                hVar2.k(tL_stickerPack.emoticon, l10.longValue());
                                            }
                                            TLRPC.Document document2 = (TLRPC.Document) hVar3.f(l10.longValue());
                                            if (document2 != null) {
                                                arrayList4.add(document2);
                                            }
                                            i15++;
                                            hVar = hVar4;
                                        }
                                    }
                                    i14++;
                                    hVar = hVar;
                                }
                            }
                        }
                        i12++;
                        mediaDataController = this;
                        arrayList2 = arrayList;
                        hVar = hVar;
                    } catch (Throwable th2) {
                        th = th2;
                        FileLog.e(th);
                        if (runnable != null) {
                            runnable.run();
                            return;
                        }
                        return;
                    }
                }
                a0.h hVar5 = hVar;
                if (!z10) {
                    putStickersToCache(i11, arrayList3, i10, j10);
                }
                AndroidUtilities.runOnUIThread(new z2(this, i11, hVar5, hashMap, arrayList3, j10, i10, hVar3, hashMap2, hVar2, runnable));
            } catch (Throwable th3) {
                th = th3;
            }
        } else if (!z10) {
            AndroidUtilities.runOnUIThread(new t6(mediaDataController, i11, i10, 1));
            mediaDataController.putStickersToCache(i11, null, i10, 0L);
            if (runnable != null) {
                runnable.run();
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$putBotInfo$201(TL_bots.BotInfo botInfo, long j10) {
        try {
            SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO bot_info_v2 VALUES(?, ?, ?)");
            executeFast.requery();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(botInfo.getObjectSize());
            botInfo.serializeToStream(nativeByteBuffer);
            executeFast.bindLong(1, botInfo.user_id);
            executeFast.bindLong(2, j10);
            executeFast.bindByteBuffer(3, nativeByteBuffer);
            executeFast.step();
            nativeByteBuffer.reuse();
            executeFast.dispose();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public void lambda$putBotKeyboard$200(MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        TLRPC.Message message2 = this.botKeyboards.get(topicKey);
        this.botKeyboards.put(topicKey, message);
        ArrayList arrayList = (ArrayList) this.botDialogKeyboards.f(topicKey.dialogId);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        arrayList.add(message);
        this.botDialogKeyboards.k(arrayList, topicKey.dialogId);
        if (MessageObject.getChannelId(message) == 0) {
            if (message2 != null) {
                this.botKeyboardsByMids.e(message2.f22413id);
            }
            this.botKeyboardsByMids.k(topicKey, message.f22413id);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botKeyboardDidLoad, message, topicKey);
    }

    public void lambda$putDiceStickersToCache$90(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, int i10) {
        try {
            if (tL_messages_stickerSet != null) {
                SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO stickers_dice VALUES(?, ?, ?)");
                executeFast.requery();
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_messages_stickerSet.getObjectSize());
                tL_messages_stickerSet.serializeToStream(nativeByteBuffer);
                executeFast.bindString(1, str);
                executeFast.bindByteBuffer(2, nativeByteBuffer);
                executeFast.bindInteger(3, i10);
                executeFast.step();
                nativeByteBuffer.reuse();
                executeFast.dispose();
                return;
            }
            SQLitePreparedStatement executeFast2 = getMessagesStorage().getDatabase().executeFast("UPDATE stickers_dice SET date = ?");
            executeFast2.requery();
            executeFast2.bindInteger(1, i10);
            executeFast2.step();
            executeFast2.dispose();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public void lambda$putEmojiKeywords$214(String str) {
        this.currentFetchingEmoji.remove(str);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newEmojiSuggestionsAvailable, str);
    }

    public void lambda$putEmojiKeywords$215(TLRPC.TL_emojiKeywordsDifference tL_emojiKeywordsDifference, String str) {
        try {
            if (!tL_emojiKeywordsDifference.keywords.isEmpty()) {
                SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO emoji_keywords_v2 VALUES(?, ?, ?)");
                SQLitePreparedStatement executeFast2 = getMessagesStorage().getDatabase().executeFast("DELETE FROM emoji_keywords_v2 WHERE lang = ? AND keyword = ? AND emoji = ?");
                getMessagesStorage().getDatabase().beginTransaction();
                int size = tL_emojiKeywordsDifference.keywords.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.EmojiKeyword emojiKeyword = tL_emojiKeywordsDifference.keywords.get(i10);
                    if (emojiKeyword instanceof TLRPC.TL_emojiKeyword) {
                        TLRPC.TL_emojiKeyword tL_emojiKeyword = (TLRPC.TL_emojiKeyword) emojiKeyword;
                        String lowerCase = tL_emojiKeyword.keyword.toLowerCase();
                        int size2 = tL_emojiKeyword.emoticons.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            executeFast.requery();
                            executeFast.bindString(1, tL_emojiKeywordsDifference.lang_code);
                            executeFast.bindString(2, lowerCase);
                            executeFast.bindString(3, tL_emojiKeyword.emoticons.get(i11));
                            executeFast.step();
                        }
                    } else if (emojiKeyword instanceof TLRPC.TL_emojiKeywordDeleted) {
                        TLRPC.TL_emojiKeywordDeleted tL_emojiKeywordDeleted = (TLRPC.TL_emojiKeywordDeleted) emojiKeyword;
                        String lowerCase2 = tL_emojiKeywordDeleted.keyword.toLowerCase();
                        int size3 = tL_emojiKeywordDeleted.emoticons.size();
                        for (int i12 = 0; i12 < size3; i12++) {
                            executeFast2.requery();
                            executeFast2.bindString(1, tL_emojiKeywordsDifference.lang_code);
                            executeFast2.bindString(2, lowerCase2);
                            executeFast2.bindString(3, tL_emojiKeywordDeleted.emoticons.get(i12));
                            executeFast2.step();
                        }
                    }
                }
                getMessagesStorage().getDatabase().commitTransaction();
                executeFast.dispose();
                executeFast2.dispose();
            }
            SQLitePreparedStatement executeFast3 = getMessagesStorage().getDatabase().executeFast("REPLACE INTO emoji_keywords_info_v2 VALUES(?, ?, ?, ?)");
            executeFast3.bindString(1, str);
            executeFast3.bindString(2, tL_emojiKeywordsDifference.lang_code);
            executeFast3.bindInteger(3, tL_emojiKeywordsDifference.version);
            executeFast3.bindLong(4, System.currentTimeMillis());
            executeFast3.step();
            executeFast3.dispose();
            AndroidUtilities.runOnUIThread(new d8(this, str, 1));
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public void lambda$putFeaturedStickersToCache$64(ArrayList arrayList, ArrayList arrayList2, boolean z10, int i10, long j10, boolean z11) {
        int i11;
        int i12 = 1;
        try {
            if (arrayList != null) {
                SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO stickers_featured VALUES(?, ?, ?, ?, ?, ?, ?)");
                executeFast.requery();
                int i13 = 4;
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    i13 += ((TLRPC.StickerSetCovered) arrayList.get(i14)).getObjectSize();
                }
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(i13);
                NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer((arrayList2.size() * 8) + 4);
                nativeByteBuffer.writeInt32(arrayList.size());
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    ((TLRPC.StickerSetCovered) arrayList.get(i15)).serializeToStream(nativeByteBuffer);
                }
                nativeByteBuffer2.writeInt32(arrayList2.size());
                for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                    nativeByteBuffer2.writeInt64(((Long) arrayList2.get(i16)).longValue());
                }
                if (z10) {
                    i11 = 2;
                } else {
                    i11 = 1;
                }
                executeFast.bindInteger(1, i11);
                executeFast.bindByteBuffer(2, nativeByteBuffer);
                executeFast.bindByteBuffer(3, nativeByteBuffer2);
                executeFast.bindInteger(4, i10);
                executeFast.bindLong(5, j10);
                executeFast.bindInteger(6, z11 ? 1 : 0);
                executeFast.bindInteger(7, z10 ? 1 : 0);
                executeFast.step();
                nativeByteBuffer.reuse();
                nativeByteBuffer2.reuse();
                executeFast.dispose();
                return;
            }
            SQLitePreparedStatement executeFast2 = getMessagesStorage().getDatabase().executeFast("UPDATE stickers_featured SET date = ? WHERE id = ? AND emoji = ?");
            executeFast2.requery();
            executeFast2.bindInteger(1, i10);
            if (z10) {
                i12 = 2;
            }
            executeFast2.bindInteger(2, i12);
            executeFast2.bindInteger(3, z10 ? 1 : 0);
            executeFast2.step();
            executeFast2.dispose();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public void lambda$putMediaCountDatabase$138(long j10, long j11, int i10, int i11) {
        SQLitePreparedStatement executeFast;
        int i12;
        int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        try {
            if (i13 != 0) {
                executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO media_counts_topics VALUES(?, ?, ?, ?, ?)");
            } else {
                executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO media_counts_v2 VALUES(?, ?, ?, ?)");
            }
            executeFast.requery();
            executeFast.bindLong(1, j11);
            if (i13 != 0) {
                executeFast.bindLong(2, j10);
                i12 = 3;
            } else {
                i12 = 2;
            }
            executeFast.bindInteger(i12, i10);
            executeFast.bindInteger(i12 + 1, i11);
            executeFast.bindInteger(i12 + 2, 0);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public void lambda$putMediaDatabase$140(int r15, java.util.ArrayList r16, boolean r17, long r18, int r20, int r21, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.lambda$putMediaDatabase$140(int, java.util.ArrayList, boolean, long, int, int, long):void");
    }

    public void lambda$putMenuBotsToCache$6(TLRPC.TL_attachMenuBots tL_attachMenuBots, long j10, int i10) {
        try {
            if (tL_attachMenuBots != null) {
                getMessagesStorage().getDatabase().executeFast("DELETE FROM attach_menu_bots").stepThis().dispose();
                SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO attach_menu_bots VALUES(?, ?, ?)");
                executeFast.requery();
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_attachMenuBots.getObjectSize());
                tL_attachMenuBots.serializeToStream(nativeByteBuffer);
                executeFast.bindByteBuffer(1, nativeByteBuffer);
                executeFast.bindLong(2, j10);
                executeFast.bindInteger(3, i10);
                executeFast.step();
                nativeByteBuffer.reuse();
                executeFast.dispose();
                return;
            }
            SQLitePreparedStatement executeFast2 = getMessagesStorage().getDatabase().executeFast("UPDATE attach_menu_bots SET date = ?");
            executeFast2.requery();
            executeFast2.bindLong(1, i10);
            executeFast2.step();
            executeFast2.dispose();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public void lambda$putPremiumPromoToCache$10(TLRPC.TL_help_premiumPromo tL_help_premiumPromo, int i10) {
        try {
            if (tL_help_premiumPromo != null) {
                getMessagesStorage().getDatabase().executeFast("DELETE FROM premium_promo").stepThis().dispose();
                SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO premium_promo VALUES(?, ?)");
                executeFast.requery();
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_help_premiumPromo.getObjectSize());
                tL_help_premiumPromo.serializeToStream(nativeByteBuffer);
                executeFast.bindByteBuffer(1, nativeByteBuffer);
                executeFast.bindInteger(2, i10);
                executeFast.step();
                nativeByteBuffer.reuse();
                executeFast.dispose();
                return;
            }
            SQLitePreparedStatement executeFast2 = getMessagesStorage().getDatabase().executeFast("UPDATE premium_promo SET date = ?");
            executeFast2.requery();
            executeFast2.bindInteger(1, i10);
            executeFast2.step();
            executeFast2.dispose();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public void lambda$putReactionsToCache$16(ArrayList arrayList, int i10, int i11) {
        try {
            if (arrayList != null) {
                getMessagesStorage().getDatabase().executeFast("DELETE FROM reactions").stepThis().dispose();
                SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO reactions VALUES(?, ?, ?)");
                executeFast.requery();
                int i12 = 4;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    i12 += ((TLRPC.TL_availableReaction) arrayList.get(i13)).getObjectSize();
                }
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(i12);
                nativeByteBuffer.writeInt32(arrayList.size());
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    ((TLRPC.TL_availableReaction) arrayList.get(i14)).serializeToStream(nativeByteBuffer);
                }
                executeFast.bindByteBuffer(1, nativeByteBuffer);
                executeFast.bindInteger(2, i10);
                executeFast.bindInteger(3, i11);
                executeFast.step();
                nativeByteBuffer.reuse();
                executeFast.dispose();
                return;
            }
            SQLitePreparedStatement executeFast2 = getMessagesStorage().getDatabase().executeFast("UPDATE reactions SET date = ?");
            executeFast2.requery();
            executeFast2.bindLong(1, i11);
            executeFast2.step();
            executeFast2.dispose();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public void lambda$putSetToCache$47(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        try {
            SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO web_recent_v3 VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            executeFast.requery();
            executeFast.bindString(1, "s_" + tL_messages_stickerSet.set.f22419id);
            executeFast.bindInteger(2, 6);
            executeFast.bindString(3, "");
            executeFast.bindString(4, "");
            executeFast.bindString(5, "");
            executeFast.bindInteger(6, 0);
            executeFast.bindInteger(7, 0);
            executeFast.bindInteger(8, 0);
            executeFast.bindInteger(9, 0);
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_messages_stickerSet.getObjectSize());
            tL_messages_stickerSet.serializeToStream(nativeByteBuffer);
            executeFast.bindByteBuffer(10, nativeByteBuffer);
            executeFast.step();
            nativeByteBuffer.reuse();
            executeFast.dispose();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public void lambda$putStickersToCache$102(ArrayList arrayList, int i10, int i11, long j10) {
        try {
            if (arrayList != null) {
                SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO stickers_v2 VALUES(?, ?, ?, ?)");
                executeFast.requery();
                int i12 = 4;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    i12 += ((TLRPC.TL_messages_stickerSet) arrayList.get(i13)).getObjectSize();
                }
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(i12);
                nativeByteBuffer.writeInt32(arrayList.size());
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    ((TLRPC.TL_messages_stickerSet) arrayList.get(i14)).serializeToStream(nativeByteBuffer);
                }
                executeFast.bindInteger(1, i10 + 1);
                executeFast.bindByteBuffer(2, nativeByteBuffer);
                executeFast.bindInteger(3, i11);
                executeFast.bindLong(4, j10);
                executeFast.step();
                nativeByteBuffer.reuse();
                executeFast.dispose();
                return;
            }
            SQLitePreparedStatement executeFast2 = getMessagesStorage().getDatabase().executeFast("UPDATE stickers_v2 SET date = ?");
            executeFast2.requery();
            executeFast2.bindLong(1, i11);
            executeFast2.step();
            executeFast2.dispose();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public void lambda$removeMultipleStickerSets$110(boolean[] zArr, ArrayList arrayList, int i10, int[] iArr) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            markSetUninstalling(((TLRPC.TL_messages_stickerSet) arrayList.get(i11)).set.f22419id, false);
            ((TLRPC.TL_messages_stickerSet) arrayList.get(i11)).set.archived = false;
            this.stickerSets[i10].add(iArr[i11], (TLRPC.TL_messages_stickerSet) arrayList.get(i11));
            this.stickerSetsById.k((TLRPC.TL_messages_stickerSet) arrayList.get(i11), ((TLRPC.TL_messages_stickerSet) arrayList.get(i11)).set.f22419id);
            this.installedStickerSetsById.k((TLRPC.TL_messages_stickerSet) arrayList.get(i11), ((TLRPC.TL_messages_stickerSet) arrayList.get(i11)).set.f22419id);
            this.stickerSetsByName.put(((TLRPC.TL_messages_stickerSet) arrayList.get(i11)).set.short_name, (TLRPC.TL_messages_stickerSet) arrayList.get(i11));
            this.removingStickerSetsUndos.l(((TLRPC.TL_messages_stickerSet) arrayList.get(i11)).set.f22419id);
        }
        ArrayList<TLRPC.TL_messages_stickerSet> arrayList2 = this.stickerSets[i10];
        int i12 = this.loadDate[i10];
        long[] jArr = this.loadHash;
        long calcStickersHash = calcStickersHash(arrayList2);
        jArr[i10] = calcStickersHash;
        putStickersToCache(i10, arrayList2, i12, calcStickersHash);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i10), Boolean.TRUE);
    }

    public void lambda$removeMultipleStickerSets$111(boolean[] zArr, ArrayList arrayList, Context context, org.telegram.ui.ActionBar.o2 o2Var, int i10) {
        if (!zArr[0]) {
            zArr[0] = true;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                toggleStickerSetInternal(context, 0, o2Var, null, true, (TLObject) arrayList.get(i11), ((TLRPC.TL_messages_stickerSet) arrayList.get(i11)).set, null, i10, false);
            }
        }
    }

    public void lambda$removeRecentGif$24(TLRPC.TL_messages_saveGif tL_messages_saveGif, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null && FileRefController.isFileRefError(tL_error.text)) {
            getFileRefController().requestReference("gif", tL_messages_saveGif);
        }
    }

    public void lambda$removeRecentGif$25(TLRPC.Document document) {
        try {
            SQLiteDatabase database = getMessagesStorage().getDatabase();
            database.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document.f22398id + "' AND type = 2").stepThis().dispose();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public static int lambda$reorderStickers$54(ArrayList arrayList, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, TLRPC.TL_messages_stickerSet tL_messages_stickerSet2) {
        int indexOf = arrayList.indexOf(Long.valueOf(tL_messages_stickerSet.set.f22419id));
        int indexOf2 = arrayList.indexOf(Long.valueOf(tL_messages_stickerSet2.set.f22419id));
        if (indexOf > indexOf2) {
            return 1;
        }
        if (indexOf < indexOf2) {
            return -1;
        }
        return 0;
    }

    public void lambda$replaceStickerSet$28(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        a0.h stickerByIds = getStickerByIds(4);
        for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
            TLRPC.Document document = tL_messages_stickerSet.documents.get(i10);
            stickerByIds.k(document, document.f22398id);
        }
    }

    public void lambda$saveDraft$189(long j10, long j11, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            if (!messages_messages.messages.isEmpty()) {
                saveDraftReplyMessage(j10, j11, messages_messages.messages.get(0));
            }
        }
    }

    public void lambda$saveDraft$190(long j10, long j11, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            if (!messages_messages.messages.isEmpty()) {
                saveDraftReplyMessage(j10, j11, messages_messages.messages.get(0));
            }
        }
    }

    public void lambda$saveDraft$191(int i10, long j10, long j11, final long j12, final long j13) {
        TLRPC.Message message;
        NativeByteBuffer byteBufferValue;
        try {
            SQLiteDatabase database = getMessagesStorage().getDatabase();
            Locale locale = Locale.US;
            SQLiteCursor queryFinalized = database.queryFinalized("SELECT data, replydata FROM messages_v2 WHERE mid = " + i10 + " and uid = " + j10, new Object[0]);
            TLRPC.Message message2 = null;
            if (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue2 = queryFinalized.byteBufferValue(0);
                if (byteBufferValue2 != null) {
                    message = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                    message.readAttachPath(byteBufferValue2, getUserConfig().clientUserId);
                    byteBufferValue2.reuse();
                } else {
                    message = null;
                }
                if (message != null) {
                    ArrayList<Long> arrayList = new ArrayList<>();
                    ArrayList<Long> arrayList2 = new ArrayList<>();
                    a0.h hVar = new a0.h();
                    a0.h hVar2 = new a0.h();
                    try {
                        TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
                        if (messageReplyHeader != null && messageReplyHeader.reply_to_msg_id != 0) {
                            if (!queryFinalized.isNull(1) && (byteBufferValue = queryFinalized.byteBufferValue(1)) != null) {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                message.replyMessage = TLdeserialize;
                                TLdeserialize.readAttachPath(byteBufferValue, getUserConfig().clientUserId);
                                byteBufferValue.reuse();
                                TLRPC.Message message3 = message.replyMessage;
                                if (message3 != null) {
                                    MessagesStorage.addUsersAndChatsFromMessage(message3, arrayList, arrayList2, null);
                                }
                            }
                            if (message.replyMessage == null) {
                                MessagesStorage.addReplyMessages(message, hVar, hVar2);
                            }
                        }
                    } catch (Exception e10) {
                        getMessagesStorage().checkSQLException(e10);
                    }
                    getMessagesStorage().loadReplyMessages(hVar, hVar2, arrayList, arrayList2, 0);
                }
                message2 = message;
            }
            queryFinalized.dispose();
            if (message2 == null) {
                if (j11 != 0) {
                    TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                    tL_channels_getMessages.channel = getMessagesController().getInputChannel(j11);
                    tL_channels_getMessages.f22430id.add(Integer.valueOf(i10));
                    getConnectionsManager().sendRequest(tL_channels_getMessages, new RequestDelegate(this) {
                        public final MediaDataController f21523b;

                        {
                            this.f21523b = this;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r6) {
                                case 0:
                                    this.f21523b.lambda$saveDraft$189(j12, j13, tLObject, tL_error);
                                    return;
                                default:
                                    this.f21523b.lambda$saveDraft$190(j12, j13, tLObject, tL_error);
                                    return;
                            }
                        }
                    });
                    return;
                }
                TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                tL_messages_getMessages.f22486id.add(Integer.valueOf(i10));
                getConnectionsManager().sendRequest(tL_messages_getMessages, new RequestDelegate(this) {
                    public final MediaDataController f21523b;

                    {
                        this.f21523b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r6) {
                            case 0:
                                this.f21523b.lambda$saveDraft$189(j12, j13, tLObject, tL_error);
                                return;
                            default:
                                this.f21523b.lambda$saveDraft$190(j12, j13, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
            }
            saveDraftReplyMessage(j12, j13, message2);
        } catch (Exception e11) {
            FileLog.e(e11);
        }
    }

    public void lambda$saveDraftReplyMessage$192(long j10, long j11, TLRPC.Message message) {
        TLRPC.DraftMessage draftMessage;
        TLRPC.InputReplyTo inputReplyTo;
        String sb2;
        a0.h hVar = (a0.h) this.drafts.f(j10);
        if (hVar != null) {
            draftMessage = (TLRPC.DraftMessage) hVar.f(j11);
        } else {
            draftMessage = null;
        }
        if (draftMessage != null && (inputReplyTo = draftMessage.reply_to) != null && inputReplyTo.reply_to_msg_id == message.f22413id) {
            a0.h hVar2 = (a0.h) this.draftMessages.f(j10);
            if (hVar2 == null) {
                hVar2 = new a0.h();
                this.draftMessages.k(hVar2, j10);
            }
            hVar2.k(message, j11);
            SerializedData serializedData = new SerializedData(message.getObjectSize());
            message.serializeToStream(serializedData);
            SharedPreferences.Editor edit = this.draftPreferences.edit();
            if (j11 == 0) {
                sb2 = a4.w.m(j10, "r_");
            } else {
                StringBuilder r6 = a4.w.r(j10, "rt_", "_");
                r6.append(j11);
                sb2 = r6.toString();
            }
            edit.putString(sb2, Utilities.bytesToHex(serializedData.toByteArray())).commit();
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newDraftReceived, Long.valueOf(j10));
            serializedData.cleanup();
        }
    }

    public void lambda$savePeer$158(long j10, int i10, double d) {
        try {
            SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
            executeFast.requery();
            executeFast.bindLong(1, j10);
            executeFast.bindInteger(2, i10);
            executeFast.bindDouble(3, d);
            executeFast.bindInteger(4, ((int) System.currentTimeMillis()) / 1000);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public void lambda$savePinnedMessages$166(ArrayList arrayList, long j10) {
        try {
            getMessagesStorage().getDatabase().beginTransaction();
            SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO chat_pinned_v2 VALUES(?, ?, ?)");
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.Message message = (TLRPC.Message) arrayList.get(i10);
                MessageObject.normalizeFlags(message);
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                message.serializeToStream(nativeByteBuffer);
                executeFast.requery();
                executeFast.bindLong(1, j10);
                executeFast.bindInteger(2, message.f22413id);
                executeFast.bindByteBuffer(3, nativeByteBuffer);
                executeFast.step();
                nativeByteBuffer.reuse();
            }
            executeFast.dispose();
            getMessagesStorage().getDatabase().commitTransaction();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public void lambda$saveReplyMessages$178(boolean z10, ArrayList arrayList, a0.h hVar) {
        SQLitePreparedStatement executeFast;
        SQLitePreparedStatement executeFast2;
        ArrayList arrayList2;
        SQLitePreparedStatement sQLitePreparedStatement;
        try {
            getMessagesStorage().getDatabase().beginTransaction();
            if (z10) {
                executeFast = getMessagesStorage().getDatabase().executeFast("UPDATE scheduled_messages_v2 SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                executeFast2 = null;
            } else {
                executeFast = getMessagesStorage().getDatabase().executeFast("UPDATE messages_v2 SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                executeFast2 = getMessagesStorage().getDatabase().executeFast("UPDATE messages_topics SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.Message message = (TLRPC.Message) arrayList.get(i10);
                SparseArray sparseArray = (SparseArray) hVar.f(MessageObject.getDialogId(message));
                if (sparseArray != null && (arrayList2 = (ArrayList) sparseArray.get(message.f22413id)) != null) {
                    MessageObject.normalizeFlags(message);
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                    message.serializeToStream(nativeByteBuffer);
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        MessageObject messageObject = (MessageObject) arrayList2.get(i11);
                        for (int i12 = 0; i12 < 2; i12++) {
                            if (i12 == 0) {
                                sQLitePreparedStatement = executeFast;
                            } else {
                                sQLitePreparedStatement = executeFast2;
                            }
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.requery();
                                sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer);
                                sQLitePreparedStatement.bindInteger(2, message.f22413id);
                                sQLitePreparedStatement.bindInteger(3, messageObject.getId());
                                sQLitePreparedStatement.bindLong(4, messageObject.getDialogId());
                                sQLitePreparedStatement.step();
                            }
                        }
                    }
                    nativeByteBuffer.reuse();
                }
            }
            executeFast.dispose();
            if (executeFast2 != null) {
                executeFast2.dispose();
            }
            getMessagesStorage().getDatabase().commitTransaction();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public void lambda$saveStickerSetIntoCache$40(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        String lowerCase;
        try {
            SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO stickersets2 VALUES(?, ?, ?, ?, ?)");
            executeFast.requery();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_messages_stickerSet.getObjectSize());
            tL_messages_stickerSet.serializeToStream(nativeByteBuffer);
            executeFast.bindLong(1, tL_messages_stickerSet.set.f22419id);
            executeFast.bindByteBuffer(2, nativeByteBuffer);
            executeFast.bindInteger(3, tL_messages_stickerSet.set.hash);
            executeFast.bindLong(4, System.currentTimeMillis());
            String str = tL_messages_stickerSet.set.short_name;
            if (str == null) {
                lowerCase = "";
            } else {
                lowerCase = str.toLowerCase();
            }
            executeFast.bindString(5, lowerCase);
            executeFast.step();
            nativeByteBuffer.reuse();
            executeFast.dispose();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public void lambda$saveToRingtones$203(TLObject tLObject, TLRPC.Document document) {
        if (tLObject != null) {
            if (tLObject instanceof TL_account.TL_savedRingtoneConverted) {
                this.ringtoneDataStore.a(((TL_account.TL_savedRingtoneConverted) tLObject).document);
            } else {
                this.ringtoneDataStore.a(document);
            }
        }
    }

    public void lambda$saveToRingtones$204(TLRPC.Document document, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new c9(this, tLObject, document, 3));
    }

    public void lambda$searchMessagesInChat$120(long j10, TLObject tLObject, TLRPC.TL_messages_search tL_messages_search, long j11, int i10, int i11, long j12, TLRPC.User user, TLRPC.Chat chat, boolean z10, kg.q0 q0Var) {
        int size;
        if (this.lastMergeDialogId == j10) {
            this.mergeReqId = 0;
            if (tLObject != null) {
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                this.messagesSearchEndReached[1] = messages_messages.messages.isEmpty();
                int[] iArr = this.messagesSearchCount;
                if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                    size = messages_messages.count;
                } else {
                    size = messages_messages.messages.size();
                }
                iArr[1] = size;
                searchMessagesInChat(tL_messages_search.f22501q, j11, j10, i10, i11, j12, true, user, chat, z10, q0Var);
                return;
            }
            this.messagesSearchEndReached[1] = true;
            this.messagesSearchCount[1] = 0;
            searchMessagesInChat(tL_messages_search.f22501q, j11, j10, i10, i11, j12, true, user, chat, z10, q0Var);
        }
    }

    public void lambda$searchMessagesInChat$121(final long j10, final TLRPC.TL_messages_search tL_messages_search, final long j11, final int i10, final int i11, final long j12, final TLRPC.User user, final TLRPC.Chat chat, final boolean z10, final kg.q0 q0Var, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$searchMessagesInChat$120(j10, tLObject, tL_messages_search, j11, i10, i11, j12, user, chat, z10, q0Var);
            }
        });
    }

    public void lambda$searchMessagesInChat$122(int i10, int i11, int i12, long j10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        boolean z10;
        if (i10 == this.lastReqId) {
            if (arrayList.size() == i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.loadedPredirectedSearchLocal = z10;
            this.loadingSearchLocal = false;
            getMessagesController().putUsers(arrayList2, true);
            getMessagesController().putChats(arrayList3, true);
            org.telegram.ui.Components.p5.h(this.currentAccount).d(arrayList4);
            this.searchLocalResultMessages = arrayList;
            updateSearchResults();
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatSearchResultsAvailable, Integer.valueOf(i12), 0, Integer.valueOf(getMask()), Long.valueOf(j10), Integer.valueOf(this.lastReturnedNum), Integer.valueOf(getSearchCount()), Boolean.TRUE);
        }
    }

    public void lambda$searchMessagesInChat$123(org.telegram.tgnet.TLRPC.TL_messages_search r21, long r22, long r24, int r26, org.telegram.tgnet.TLRPC.messages_Messages r27, java.util.ArrayList r28, boolean r29, boolean r30, long r31, long r33, org.telegram.tgnet.TLRPC.User r35, org.telegram.tgnet.TLRPC.Chat r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.lambda$searchMessagesInChat$123(org.telegram.tgnet.TLRPC$TL_messages_search, long, long, int, org.telegram.tgnet.TLRPC$messages_Messages, java.util.ArrayList, boolean, boolean, long, long, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat):void");
    }

    public void lambda$searchMessagesInChat$124(int i10, final boolean z10, TLObject tLObject, final TLRPC.TL_messages_search tL_messages_search, final long j10, final long j11, final int i11, final ArrayList arrayList, final boolean z11, final long j12, final long j13, final TLRPC.User user, final TLRPC.Chat chat) {
        if (i10 == this.lastReqId) {
            this.reqId = 0;
            if (!z10) {
                this.loadingMoreSearchMessages = false;
            }
            if (tLObject != null) {
                final TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                int i12 = 0;
                while (i12 < messages_messages.messages.size()) {
                    TLRPC.Message message = messages_messages.messages.get(i12);
                    if ((message instanceof TLRPC.TL_messageEmpty) || (message.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                        messages_messages.messages.remove(i12);
                        i12--;
                    }
                    i12++;
                }
                getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                getMessagesController().putUsers(messages_messages.users, false);
                getMessagesController().putChats(messages_messages.chats, false);
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        MediaDataController.this.lambda$searchMessagesInChat$123(tL_messages_search, j10, j11, i11, messages_messages, arrayList, z10, z11, j12, j13, user, chat);
                    }
                };
                if (z11) {
                    loadReplyMessagesForMessages(arrayList, j11, 0, this.lastReplyMessageId, runnable, i11, null);
                } else {
                    runnable.run();
                }
            }
        }
    }

    public void lambda$searchMessagesInChat$125(TLRPC.TL_messages_search tL_messages_search, final boolean z10, String str, boolean z11, final int i10, final boolean z12, final long j10, final long j11, final int i11, final long j12, final long j13, final TLRPC.User user, final TLRPC.Chat chat, final TLObject tLObject, TLRPC.TL_error tL_error) {
        final TLRPC.TL_messages_search tL_messages_search2;
        final ArrayList arrayList = new ArrayList();
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            tL_messages_search2 = tL_messages_search;
            int min = Math.min(messages_messages.messages.size(), tL_messages_search2.limit - 1);
            for (int i12 = 0; i12 < min; i12++) {
                MessageObject messageObject = new MessageObject(this.currentAccount, messages_messages.messages.get(i12), null, null, null, null, null, true, true, 0L, false, false, z10);
                if (messageObject.hasValidGroupId()) {
                    messageObject.isPrimaryGroupMessage = true;
                }
                messageObject.setQuery(str, !z11);
                arrayList.add(messageObject);
            }
        } else {
            tL_messages_search2 = tL_messages_search;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$searchMessagesInChat$124(i10, z12, tLObject, tL_messages_search2, j10, j11, i11, arrayList, z10, j12, j13, user, chat);
            }
        });
    }

    public static void lambda$searchStickerSets$249(Utilities.Callback callback, TLRPC.messages_FoundStickerSets messages_foundstickersets, TLRPC.TL_error tL_error) {
        if (messages_foundstickersets instanceof TLRPC.TL_messages_foundStickerSets) {
            callback.run(((TLRPC.TL_messages_foundStickerSets) messages_foundstickersets).sets);
        } else {
            callback.run(new ArrayList());
        }
    }

    public void lambda$searchStickers$247(SearchStickersKey searchStickersKey, SearchStickersResult searchStickersResult, Utilities.Callback callback, TLRPC.messages_FoundStickers messages_foundstickers, TLRPC.TL_error tL_error) {
        this.loadingSearchStickersKeys.remove(searchStickersKey);
        if (searchStickersResult == null) {
            searchStickersResult = new SearchStickersResult(null);
        }
        if (messages_foundstickers instanceof TLRPC.TL_messages_foundStickers) {
            searchStickersResult.apply((TLRPC.TL_messages_foundStickers) messages_foundstickers);
        }
        this.searchStickerResults.put(searchStickersKey, searchStickersResult);
        callback.run(searchStickersResult.documents);
    }

    public void lambda$searchStickers$248(SearchStickersKey searchStickersKey, SearchStickersResult searchStickersResult, Utilities.Callback callback, ArrayList arrayList, String str) {
        if (!this.loadingSearchStickersKeys.containsKey(searchStickersKey)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            KeywordResult keywordResult = (KeywordResult) obj;
            if (!TextUtils.isEmpty(keywordResult.emoji) && !keywordResult.emoji.startsWith("animated_")) {
                sb2.append(keywordResult.emoji);
            }
        }
        TLRPC.TL_messages_searchStickers tL_messages_searchStickers = new TLRPC.TL_messages_searchStickers();
        tL_messages_searchStickers.emojis = searchStickersKey.emojis;
        if (!TextUtils.isEmpty(searchStickersKey.lang_code)) {
            tL_messages_searchStickers.lang_code.add(searchStickersKey.lang_code);
        }
        tL_messages_searchStickers.emoticon = sb2.toString();
        tL_messages_searchStickers.f22505q = searchStickersKey.f19616q;
        tL_messages_searchStickers.limit = 100;
        if (searchStickersResult != null) {
            i10 = searchStickersResult.next_offset.intValue();
        }
        tL_messages_searchStickers.offset = i10;
        this.loadingSearchStickersKeys.put(searchStickersKey, Integer.valueOf(getConnectionsManager().sendRequestTyped(tL_messages_searchStickers, new Object(), new a4(this, searchStickersKey, searchStickersResult, callback, 1))));
    }

    public static void lambda$setPlaceholderImage$31(String str, org.telegram.ui.Components.t9 t9Var, String str2, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.Document document;
        if (tL_messages_stickerSet != null) {
            ArrayList<Emoji.EmojiSpanRange> parseEmojis = Emoji.parseEmojis(str);
            for (int i10 = 0; i10 < parseEmojis.size(); i10++) {
                parseEmojis.get(i10).code = Emoji.fixEmoji(parseEmojis.get(i10).code.toString());
            }
            int i11 = 0;
            loop1: while (true) {
                if (i11 < tL_messages_stickerSet.documents.size()) {
                    document = tL_messages_stickerSet.documents.get(i11);
                    int size = parseEmojis.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Emoji.EmojiSpanRange emojiSpanRange = parseEmojis.get(i12);
                        i12++;
                        Emoji.EmojiSpanRange emojiSpanRange2 = emojiSpanRange;
                        for (int i13 = 0; i13 < tL_messages_stickerSet.packs.size(); i13++) {
                            if (!tL_messages_stickerSet.packs.get(i13).documents.contains(Long.valueOf(document.f22398id)) || !TextUtils.equals(Emoji.fixEmoji(tL_messages_stickerSet.packs.get(i13).emoticon), emojiSpanRange2.code)) {
                            }
                        }
                    }
                    break loop1;
                }
                document = null;
                break;
                i11++;
            }
            if (document != null) {
                t9Var.n(ImageLocation.getForDocument(document), str2, DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.g6.f23223m6, 0.2f, 1.0f, null), document);
                t9Var.invalidate();
            }
        }
    }

    public static int lambda$static$160(TLRPC.MessageEntity messageEntity, TLRPC.MessageEntity messageEntity2) {
        int i10 = messageEntity.offset;
        int i11 = messageEntity2.offset;
        if (i10 > i11) {
            return 1;
        }
        if (i10 < i11) {
            return -1;
        }
        return 0;
    }

    public void lambda$toggleStickerSet$108(boolean[] zArr, TLRPC.StickerSet stickerSet, int i10, int i11, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Runnable runnable) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        markSetUninstalling(stickerSet.f22419id, false);
        stickerSet.archived = false;
        this.stickerSets[i10].add(i11, tL_messages_stickerSet);
        this.stickerSetsById.k(tL_messages_stickerSet, stickerSet.f22419id);
        this.installedStickerSetsById.k(tL_messages_stickerSet, stickerSet.f22419id);
        String str = stickerSet.short_name;
        if (str != null) {
            this.stickerSetsByName.put(str.toLowerCase(), tL_messages_stickerSet);
        }
        this.removingStickerSetsUndos.l(stickerSet.f22419id);
        this.loadHash[i10] = calcStickersHash(this.stickerSets[i10]);
        putStickersToCache(i10, this.stickerSets[i10], this.loadDate[i10], this.loadHash[i10]);
        if (runnable != null) {
            runnable.run();
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i10), Boolean.TRUE);
    }

    public void lambda$toggleStickerSet$109(boolean[] zArr, Context context, int i10, org.telegram.ui.ActionBar.o2 o2Var, FrameLayout frameLayout, boolean z10, TLObject tLObject, TLRPC.StickerSet stickerSet, TLRPC.Document document, int i11) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        toggleStickerSetInternal(context, i10, o2Var, frameLayout, z10, tLObject, stickerSet, document, i11, false);
    }

    public void lambda$toggleStickerSetInternal$112(TLRPC.StickerSet stickerSet, ArrayList arrayList) {
        markSetInstalling(stickerSet.f22419id, false);
    }

    public void lambda$toggleStickerSetInternal$113(TLRPC.StickerSet stickerSet, TLObject tLObject, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, int i10, TLRPC.TL_error tL_error, boolean z11, FrameLayout frameLayout, Context context, TLObject tLObject2, TLRPC.Document document) {
        this.removingStickerSetsUndos.l(stickerSet.f22419id);
        if (tLObject instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
            processStickerSetInstallResultArchive(o2Var, z10, i10, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject);
        }
        loadStickers(i10, false, false, true, new n9(this, stickerSet, 1));
        if (tL_error == null && z11) {
            if (frameLayout != null) {
                org.telegram.ui.Components.mc.f(frameLayout, new sw0(context, tLObject2, 1, 2, document, o2Var.getResourceProvider()), 1500).j();
            } else if (o2Var != null) {
                org.telegram.ui.Components.mc.g(o2Var, new sw0(context, tLObject2, 1, 2, document, o2Var.getResourceProvider()), 1500).j();
            }
        }
    }

    public void lambda$toggleStickerSetInternal$114(final TLRPC.StickerSet stickerSet, final org.telegram.ui.ActionBar.o2 o2Var, final boolean z10, final int i10, final boolean z11, final FrameLayout frameLayout, final Context context, final TLObject tLObject, final TLRPC.Document document, final TLObject tLObject2, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TLObject tLObject3 = tLObject;
                TLRPC.Document document2 = document;
                int i11 = i10;
                Context context2 = context;
                FrameLayout frameLayout2 = frameLayout;
                MediaDataController mediaDataController = this;
                TLObject tLObject4 = tLObject2;
                mediaDataController.lambda$toggleStickerSetInternal$113(stickerSet, tLObject4, o2Var, z10, i11, tL_error, z11, frameLayout2, context2, tLObject3, document2);
            }
        });
    }

    public void lambda$toggleStickerSetInternal$115(TLRPC.StickerSet stickerSet, ArrayList arrayList) {
        markSetUninstalling(stickerSet.f22419id, false);
    }

    public void lambda$toggleStickerSetInternal$116(TLRPC.StickerSet stickerSet, int i10) {
        this.removingStickerSetsUndos.l(stickerSet.f22419id);
        loadStickers(i10, false, true, false, new n9(this, stickerSet, 0));
    }

    public void lambda$toggleStickerSetInternal$117(TLRPC.StickerSet stickerSet, int i10, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new r4(this, stickerSet, i10, 9));
    }

    public void lambda$toggleStickerSets$118(int i10, TLObject tLObject, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, int i11) {
        if (i10 != 0) {
            if (tLObject instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                processStickerSetInstallResultArchive(o2Var, z10, i11, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject);
            }
            loadStickers(i11, false, false, true);
            return;
        }
        loadStickers(i11, false, true);
    }

    public void lambda$toggleStickerSets$119(int i10, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, int i11, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new a8(this, i10, tLObject, o2Var, z10, i11));
    }

    public void lambda$updateBotInfo$202(TL_update.TL_updateBotCommands tL_updateBotCommands, long j10) {
        try {
            TL_bots.BotInfo loadBotInfoInternal = loadBotInfoInternal(tL_updateBotCommands.bot_id, j10);
            if (loadBotInfoInternal != null) {
                loadBotInfoInternal.commands = tL_updateBotCommands.commands;
            }
            SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO bot_info_v2 VALUES(?, ?, ?)");
            executeFast.requery();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(loadBotInfoInternal.getObjectSize());
            loadBotInfoInternal.serializeToStream(nativeByteBuffer);
            executeFast.bindLong(1, loadBotInfoInternal.user_id);
            executeFast.bindLong(2, j10);
            executeFast.bindByteBuffer(3, nativeByteBuffer);
            executeFast.step();
            nativeByteBuffer.reuse();
            executeFast.dispose();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public void lambda$updateEmojiStatuses$234(int i10, TL_account.TL_emojiStatuses tL_emojiStatuses) {
        try {
            SQLiteDatabase database = getMessagesStorage().getDatabase();
            database.executeFast("DELETE FROM emoji_statuses WHERE type = " + i10).stepThis().dispose();
            SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("INSERT INTO emoji_statuses VALUES(?, ?)");
            executeFast.requery();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_emojiStatuses.getObjectSize());
            tL_emojiStatuses.serializeToStream(nativeByteBuffer);
            executeFast.bindByteBuffer(1, nativeByteBuffer);
            executeFast.bindInteger(2, i10);
            executeFast.step();
            nativeByteBuffer.reuse();
            executeFast.dispose();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        this.emojiStatusesFetching[i10] = false;
    }

    public void lambda$verifyAnimatedStickerMessageInternal$69(String str, TLObject tLObject) {
        char c3;
        ArrayList<TLRPC.Message> arrayList = this.verifyingMessages.get(str);
        if (tLObject != null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            storeTempStickerSet(tL_messages_stickerSet);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.Message message = arrayList.get(i10);
                TLRPC.Document document = MessageObject.getDocument(message);
                int size2 = tL_messages_stickerSet.documents.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size2) {
                        break;
                    }
                    TLRPC.Document document2 = tL_messages_stickerSet.documents.get(i11);
                    if (document2.f22398id == document.f22398id && document2.dc_id == document.dc_id) {
                        message.stickerVerified = 1;
                        break;
                    }
                    i11++;
                }
                if (message.stickerVerified == 0) {
                    message.stickerVerified = 2;
                }
            }
            c3 = 0;
        } else {
            c3 = 0;
            int size3 = arrayList.size();
            for (int i12 = 0; i12 < size3; i12++) {
                arrayList.get(i12).stickerVerified = 2;
            }
        }
        NotificationCenter notificationCenter = getNotificationCenter();
        int i13 = NotificationCenter.didVerifyMessagesStickers;
        Object[] objArr = new Object[1];
        objArr[c3] = arrayList;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i13, objArr);
        getMessagesStorage().updateMessageVerifyFlags(arrayList);
    }

    public void lambda$verifyAnimatedStickerMessageInternal$70(String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new p9(this, str, tLObject, 1));
    }

    private void loadAvatarConstructor(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.loadAvatarConstructor(boolean):void");
    }

    private TL_bots.BotInfo loadBotInfoInternal(long j10, long j11) {
        TL_bots.BotInfo botInfo;
        NativeByteBuffer byteBufferValue;
        SQLiteDatabase database = getMessagesStorage().getDatabase();
        Locale locale = Locale.US;
        StringBuilder r6 = a4.w.r(j10, "SELECT info FROM bot_info_v2 WHERE uid = ", " AND dialogId = ");
        r6.append(j11);
        SQLiteCursor queryFinalized = database.queryFinalized(r6.toString(), new Object[0]);
        if (queryFinalized.next() && !queryFinalized.isNull(0) && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
            botInfo = TL_bots.BotInfo.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
            byteBufferValue.reuse();
        } else {
            botInfo = null;
        }
        queryFinalized.dispose();
        return botInfo;
    }

    private void loadDraftVoiceMessages() {
        if (this.draftVoicesLoaded) {
            return;
        }
        Context context = ApplicationLoader.applicationContext;
        Set<Map.Entry<String, ?>> entrySet = context.getSharedPreferences("2voicedrafts_" + this.currentAccount, 0).getAll().entrySet();
        this.draftVoices.b();
        for (Map.Entry<String, ?> entry : entrySet) {
            String key = entry.getKey();
            DraftVoice fromString = DraftVoice.fromString((String) entry.getValue());
            if (fromString != null) {
                this.draftVoices.k(fromString, Long.parseLong(key));
            }
        }
        this.draftVoicesLoaded = true;
    }

    private void loadGroupStickerSet(TLRPC.StickerSet stickerSet, boolean z10) {
        if (z10) {
            getMessagesStorage().getStorageQueue().postRunnable(new c2(22, this, stickerSet));
            return;
        }
        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_messages_getStickerSet.stickerset = tL_inputStickerSetID;
        tL_inputStickerSetID.f22412id = stickerSet.f22419id;
        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new p7(this, 8));
    }

    private void loadMediaDatabase(long j10, int i10, int i11, int i12, int i13, long j11, kg.q0 q0Var, int i14, boolean z10, int i15, int i16) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(i10, j10, i12, j11, i13, q0Var, i11, i14, i15, z10, i16);
        MessagesStorage messagesStorage = getMessagesStorage();
        messagesStorage.getStorageQueue().postRunnable(anonymousClass1);
        messagesStorage.bindTaskToGuid(anonymousClass1, i14);
    }

    private ArrayList<MessageObject> loadPinnedMessageInternal(long j10, long j11, ArrayList<Integer> arrayList, boolean z10) {
        ?? join;
        ArrayList<TLRPC.User> arrayList2;
        ArrayList<TLRPC.Chat> arrayList3;
        try {
            ArrayList<Integer> arrayList4 = new ArrayList<>(arrayList);
            int i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
            if (i10 != 0) {
                join = new StringBuilder();
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Integer num = arrayList.get(i11);
                    if (join.length() != 0) {
                        join.append(",");
                    }
                    join.append(num);
                }
            } else {
                join = TextUtils.join(",", arrayList);
            }
            ArrayList arrayList5 = new ArrayList();
            ArrayList<TLRPC.User> arrayList6 = new ArrayList<>();
            ArrayList<TLRPC.Chat> arrayList7 = new ArrayList<>();
            ArrayList<Long> arrayList8 = new ArrayList<>();
            ArrayList arrayList9 = new ArrayList();
            long j12 = getUserConfig().clientUserId;
            int i12 = 1;
            ?? r11 = 0;
            SQLiteCursor queryFinalized = getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT data, mid, date FROM messages_v2 WHERE mid IN (%s) AND uid = %d", join, Long.valueOf(j10)), new Object[0]);
            while (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(r11);
                if (byteBufferValue != null) {
                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r11), r11);
                    if (!(TLdeserialize.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                        TLdeserialize.readAttachPath(byteBufferValue, j12);
                        TLdeserialize.f22413id = queryFinalized.intValue(i12);
                        TLdeserialize.date = queryFinalized.intValue(2);
                        TLdeserialize.dialog_id = j10;
                        MessagesStorage.addUsersAndChatsFromMessage(TLdeserialize, arrayList8, arrayList9, null);
                        arrayList5.add(TLdeserialize);
                        arrayList4.remove(Integer.valueOf(TLdeserialize.f22413id));
                    }
                    byteBufferValue.reuse();
                }
                r11 = 0;
                i12 = 1;
            }
            queryFinalized.dispose();
            if (!arrayList4.isEmpty()) {
                SQLiteDatabase database = getMessagesStorage().getDatabase();
                Locale locale = Locale.US;
                String join2 = TextUtils.join(",", arrayList4);
                SQLiteCursor queryFinalized2 = database.queryFinalized("SELECT data FROM chat_pinned_v2 WHERE uid = " + j10 + " AND mid IN (" + join2 + ")", new Object[0]);
                while (queryFinalized2.next()) {
                    NativeByteBuffer byteBufferValue2 = queryFinalized2.byteBufferValue(0);
                    if (byteBufferValue2 != null) {
                        TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                        if (!(TLdeserialize2.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                            TLdeserialize2.readAttachPath(byteBufferValue2, j12);
                            TLdeserialize2.dialog_id = j10;
                            MessagesStorage.addUsersAndChatsFromMessage(TLdeserialize2, arrayList8, arrayList9, null);
                            arrayList5.add(TLdeserialize2);
                            arrayList4.remove(Integer.valueOf(TLdeserialize2.f22413id));
                        }
                        byteBufferValue2.reuse();
                    }
                }
                queryFinalized2.dispose();
            }
            if (!arrayList4.isEmpty()) {
                if (i10 != 0) {
                    TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                    tL_channels_getMessages.channel = getMessagesController().getInputChannel(j11);
                    tL_channels_getMessages.f22430id = arrayList4;
                    getConnectionsManager().sendRequest(tL_channels_getMessages, new jh.b2(this, j11, j10, tL_channels_getMessages));
                } else {
                    TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                    tL_messages_getMessages.f22486id = arrayList4;
                    getConnectionsManager().sendRequest(tL_messages_getMessages, new xk((BaseController) this, j10, tL_messages_getMessages, 2));
                }
            }
            if (!arrayList5.isEmpty()) {
                try {
                    if (!arrayList8.isEmpty()) {
                        arrayList2 = arrayList6;
                        getMessagesStorage().getUsersInternal(arrayList8, arrayList2);
                    } else {
                        arrayList2 = arrayList6;
                    }
                    if (!arrayList9.isEmpty()) {
                        arrayList3 = arrayList7;
                        getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList9), arrayList3);
                    } else {
                        arrayList3 = arrayList7;
                    }
                    if (z10) {
                        return broadcastPinnedMessage(arrayList5, arrayList2, arrayList3, true, true);
                    }
                    broadcastPinnedMessage(arrayList5, arrayList2, arrayList3, true, false);
                    return null;
                } catch (Exception e10) {
                    e = e10;
                    FileLog.e(e);
                    return null;
                }
            }
            return null;
        } catch (Exception e11) {
            e = e11;
        }
    }

    public static ArrayList<TLRPC.Reaction> loadReactionsFromPref(SharedPreferences sharedPreferences) {
        int i10 = sharedPreferences.getInt("count", 0);
        ArrayList<TLRPC.Reaction> arrayList = new ArrayList<>(i10);
        if (i10 > 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                SerializedData serializedData = new SerializedData(Utilities.hexToBytes(sharedPreferences.getString("object_" + i11, "")));
                try {
                    arrayList.add(TLRPC.Reaction.TLdeserialize(serializedData, serializedData.readInt32(true), true));
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
        }
        return arrayList;
    }

    private void loadRepliesOfDraftReplies(ArrayList<TLRPC.Message> arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            getMessagesStorage().getStorageQueue().postRunnable(new w7(this, arrayList, 0));
        }
    }

    private void loadStickerSetThumbInternal(TLRPC.PhotoSize photoSize, Object obj, TLRPC.Document document, int i10) {
        String str;
        ImageLocation forSticker = ImageLocation.getForSticker(photoSize, document, i10);
        if (forSticker != null) {
            if (forSticker.imageType == 1) {
                str = "tgs";
            } else {
                str = "webp";
            }
            getFileLoader().loadFile(forSticker, obj, str, 3, 1);
        }
    }

    public static void offsetEntities(ArrayList<TLRPC.MessageEntity> arrayList, int i10) {
        if (arrayList != null) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                TLRPC.MessageEntity messageEntity = arrayList.get(i11);
                i11++;
                messageEntity.offset += i10;
            }
        }
    }

    private CharSequence parsePattern(CharSequence charSequence, Pattern pattern, ArrayList<TLRPC.MessageEntity> arrayList, GenericProvider<Void, TLRPC.MessageEntity> genericProvider) {
        URLSpan[] uRLSpanArr;
        Matcher matcher = pattern.matcher(charSequence);
        int i10 = 0;
        while (matcher.find()) {
            boolean z10 = true;
            String group = matcher.group(1);
            if ((charSequence instanceof Spannable) && (uRLSpanArr = (URLSpan[]) ((Spannable) charSequence).getSpans(matcher.start() - i10, matcher.end() - i10, URLSpan.class)) != null && uRLSpanArr.length > 0) {
                z10 = false;
            }
            if (z10) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    }
                    TLRPC.MessageEntity messageEntity = arrayList.get(i11);
                    if ((messageEntity instanceof TLRPC.TL_messageEntityPre) || (messageEntity instanceof TLRPC.TL_messageEntityCode)) {
                        int i12 = messageEntity.offset;
                        if (AndroidUtilities.intersect1d(matcher.start() - i10, matcher.end() - i10, i12, messageEntity.length + i12)) {
                            z10 = false;
                            break;
                        }
                    }
                    i11++;
                }
            }
            if (z10) {
                charSequence = ((Object) charSequence.subSequence(0, matcher.start() - i10)) + group + ((Object) charSequence.subSequence(matcher.end() - i10, charSequence.length()));
                TLRPC.MessageEntity provide = genericProvider.provide(null);
                provide.offset = matcher.start() - i10;
                int length = group.length();
                provide.length = length;
                int i13 = provide.offset;
                removeOffset4After(i13, length + i13, arrayList);
                arrayList.add(provide);
            }
            i10 += (matcher.end() - matcher.start()) - group.length();
        }
        return charSequence;
    }

    private void preloadNextGreetingsSticker() {
        if (this.recentStickers[3].isEmpty()) {
            return;
        }
        ArrayList<TLRPC.Document> arrayList = this.recentStickers[3];
        this.greetingsSticker = arrayList.get(Utilities.random.nextInt(arrayList.size()));
        getFileLoader().loadFile(ImageLocation.getForDocument(this.greetingsSticker), this.greetingsSticker, null, 0, 1);
    }

    private void processLoadStickersResponse(int i10, TLRPC.TL_messages_allStickers tL_messages_allStickers) {
        processLoadStickersResponse(i10, tL_messages_allStickers, null);
    }

    private void processLoadedDiceStickers(String str, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z11, int i10) {
        AndroidUtilities.runOnUIThread(new d8(this, str, 4));
        Utilities.stageQueue.postRunnable(new e9(this, z11, tL_messages_stickerSet, i10, str, z10));
    }

    private void processLoadedFeaturedStickers(boolean z10, ArrayList<TLRPC.StickerSetCovered> arrayList, ArrayList<Long> arrayList2, boolean z11, boolean z12, int i10, long j10) {
        AndroidUtilities.runOnUIThread(new e8(this, z10, 1));
        Utilities.stageQueue.postRunnable(new d9(this, z12, arrayList, i10, j10, z10, arrayList2, z11));
    }

    public void processLoadedMedia(final TLRPC.messages_Messages messages_messages, final long j10, int i10, int i11, final int i12, final int i13, long j11, final int i14, final int i15, boolean z10, final boolean z11, final int i16) {
        long j12;
        int i17;
        int i18;
        long j13;
        boolean z12;
        ArrayList<TLRPC.Message> arrayList;
        int i19;
        ArrayList<TLRPC.Message> arrayList2;
        if (BuildVars.LOGS_ENABLED) {
            if (messages_messages != null && (arrayList2 = messages_messages.messages) != null) {
                i19 = arrayList2.size();
            } else {
                i19 = 0;
            }
            StringBuilder sb2 = new StringBuilder("process load media messagesCount ");
            sb2.append(i19);
            sb2.append(" did ");
            j12 = j10;
            sb2.append(j12);
            sb2.append(" topicId ");
            j13 = j11;
            sb2.append(j13);
            sb2.append(" count = ");
            i17 = i10;
            j7.l1.w(sb2, i17, " max_id=", i11, " min_id=");
            i18 = i13;
            j7.l1.w(sb2, i12, " type = ", i18, " cache = ");
            j7.l1.w(sb2, i14, " classGuid = ", i15, " topReached=");
            z12 = z11;
            sb2.append(z12);
            FileLog.d(sb2.toString());
        } else {
            j12 = j10;
            i17 = i10;
            i18 = i13;
            j13 = j11;
            z12 = z11;
        }
        if (i14 != 0 && messages_messages != null && (arrayList = messages_messages.messages) != null && (((arrayList.isEmpty() && i12 == 0) || (messages_messages.messages.size() <= 1 && i12 != 0)) && !DialogObject.isEncryptedDialog(j12))) {
            if (i14 == 2) {
                return;
            }
            loadMedia(j12, i17, i11, i12, i18, j13, 0, i15, i16, null, null);
            return;
        }
        if (i14 == 0) {
            ImageLoader.saveMessagesThumbs(messages_messages.messages);
            getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
            putMediaDatabase(j10, j11, i13, messages_messages.messages, i11, i12, z12);
        }
        Utilities.searchQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$processLoadedMedia$136(messages_messages, i14, j10, i15, i13, z11, i12, i16);
            }
        });
    }

    private void processLoadedMediaCount(final int i10, final long j10, final long j11, final int i11, final int i12, final boolean z10, final int i13) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$processLoadedMediaCount$137(j10, z10, i10, i11, i13, j11, i12);
            }
        });
    }

    private void processLoadedStickers(int i10, ArrayList<TLRPC.TL_messages_stickerSet> arrayList, boolean z10, int i11, long j10) {
        processLoadedStickers(i10, arrayList, z10, i11, j10, null);
    }

    private void putDiceStickersToCache(String str, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new h0(this, tL_messages_stickerSet, str, i10, 8));
    }

    private void putEmojiKeywords(String str, TLRPC.TL_emojiKeywordsDifference tL_emojiKeywordsDifference) {
        if (tL_emojiKeywordsDifference == null) {
            return;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new f0(this, tL_emojiKeywordsDifference, str, 27));
    }

    private void putFeaturedStickersToCache(final boolean z10, ArrayList<TLRPC.StickerSetCovered> arrayList, final ArrayList<Long> arrayList2, final int i10, final long j10, final boolean z11) {
        ArrayList arrayList3;
        if (arrayList != null) {
            arrayList3 = new ArrayList(arrayList);
        } else {
            arrayList3 = null;
        }
        final ArrayList arrayList4 = arrayList3;
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$putFeaturedStickersToCache$64(arrayList4, arrayList2, z10, i10, j10, z11);
            }
        });
    }

    private void putMediaCountDatabase(long j10, long j11, int i10, int i11) {
        getMessagesStorage().getStorageQueue().postRunnable(new l8(this, j11, j10, i10, i11, 1));
    }

    private void putMediaDatabase(long j10, long j11, int i10, ArrayList<TLRPC.Message> arrayList, int i11, int i12, boolean z10) {
        getMessagesStorage().getStorageQueue().postRunnable(new a9(this, i12, arrayList, z10, j10, i11, i10, j11));
    }

    private void putMenuBotsToCache(TLRPC.TL_attachMenuBots tL_attachMenuBots, long j10, int i10) {
        getMessagesStorage().getStorageQueue().postRunnable(new jh.x8(this, tL_attachMenuBots, j10, i10, 1));
    }

    private void putPremiumPromoToCache(TLRPC.TL_help_premiumPromo tL_help_premiumPromo, int i10) {
        getMessagesStorage().getStorageQueue().postRunnable(new r4(this, tL_help_premiumPromo, i10, 6));
    }

    private void putReactionsToCache(List<TLRPC.TL_availableReaction> list, int i10, int i11) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList(list);
        } else {
            arrayList = null;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new y4(this, arrayList, i10, i11, 3));
    }

    private void putSetToCache(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        getMessagesStorage().getStorageQueue().postRunnable(new f7(this, tL_messages_stickerSet, 3));
    }

    private void putStickersToCache(int i10, ArrayList<TLRPC.TL_messages_stickerSet> arrayList, int i11, long j10) {
        ArrayList arrayList2;
        if (arrayList != null) {
            arrayList2 = new ArrayList(arrayList);
        } else {
            arrayList2 = null;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new t(this, arrayList2, i10, i11, j10));
    }

    private static void removeEmptyMessages(ArrayList<TLRPC.Message> arrayList) {
        int i10 = 0;
        while (i10 < arrayList.size()) {
            TLRPC.Message message = arrayList.get(i10);
            if (message == null || (message instanceof TLRPC.TL_messageEmpty) || (message.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
    }

    private static void removeOffset4After(int i10, int i11, ArrayList<TLRPC.MessageEntity> arrayList) {
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.MessageEntity messageEntity = arrayList.get(i12);
            int i13 = messageEntity.offset;
            if (i13 > i11) {
                messageEntity.offset = i13 - 4;
            } else if (i13 > i10) {
                messageEntity.offset = i13 - 2;
            }
        }
    }

    private static boolean replyToEquals(TLRPC.InputReplyTo inputReplyTo, TLRPC.InputReplyTo inputReplyTo2) {
        if (inputReplyTo == inputReplyTo2) {
            return true;
        }
        boolean z10 = inputReplyTo instanceof TLRPC.TL_inputReplyToMessage;
        if (z10 != (inputReplyTo2 instanceof TLRPC.TL_inputReplyToMessage)) {
            return false;
        }
        if (z10) {
            if (MessageObject.peersEqual(inputReplyTo.reply_to_peer_id, inputReplyTo2.reply_to_peer_id) && TextUtils.equals(inputReplyTo.quote_text, inputReplyTo2.quote_text) && inputReplyTo.reply_to_msg_id == inputReplyTo2.reply_to_msg_id) {
                return true;
            }
            return false;
        } else if (!(inputReplyTo instanceof TLRPC.TL_inputReplyToStory)) {
            return true;
        } else {
            if (MessageObject.peersEqual(inputReplyTo.peer, inputReplyTo2.peer) && inputReplyTo.story_id == inputReplyTo2.story_id) {
                return true;
            }
            return false;
        }
    }

    private static boolean richMessageEquals(TL_iv.RichMessage richMessage, TL_iv.RichMessage richMessage2) {
        boolean z10;
        boolean z11 = true;
        if (richMessage == richMessage2) {
            return true;
        }
        if (richMessage == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (richMessage2 != null) {
            z11 = false;
        }
        if (z10 != z11) {
            return false;
        }
        try {
            SerializedData serializedData = new SerializedData(richMessage.getObjectSize());
            SerializedData serializedData2 = new SerializedData(richMessage2.getObjectSize());
            richMessage.serializeToStream(serializedData);
            richMessage2.serializeToStream(serializedData2);
            return Arrays.equals(serializedData.toByteArray(), serializedData2.toByteArray());
        } catch (Exception e10) {
            FileLog.e(e10);
            return false;
        }
    }

    private void saveDraftReplyMessage(long j10, long j11, TLRPC.Message message) {
        if (message == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new g5.x(this, j10, j11, message, 6));
    }

    private void savePeer(final long j10, final int i10, final double d) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$savePeer$158(j10, i10, d);
            }
        });
    }

    private void savePinnedMessages(long j10, ArrayList<TLRPC.Message> arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new c4(this, arrayList, j10, 7));
    }

    public static void saveReactionsToPref(SharedPreferences sharedPreferences, long j10, ArrayList<? extends TLObject> arrayList) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt("count", arrayList.size());
        edit.putLong("hash", j10);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLObject tLObject = arrayList.get(i10);
            SerializedData serializedData = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData);
            edit.putString("object_" + i10, Utilities.bytesToHex(serializedData.toByteArray()));
        }
        edit.apply();
    }

    private void saveReplyMessages(a0.h hVar, ArrayList<TLRPC.Message> arrayList, boolean z10) {
        getMessagesStorage().getStorageQueue().postRunnable(new tj(this, z10, arrayList, hVar, 7));
    }

    private void saveStickerSetIntoCache(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
            getMessagesStorage().getStorageQueue().postRunnable(new f7(this, tL_messages_stickerSet, 0));
            cleanupStickerSetCache();
        }
    }

    private TLRPC.MessageEntity setEntityStartEnd(TLRPC.MessageEntity messageEntity, int i10, int i11) {
        messageEntity.offset = i10;
        messageEntity.length = i11 - i10;
        return messageEntity;
    }

    public static void sortEntities(ArrayList<TLRPC.MessageEntity> arrayList) {
        Collections.sort(arrayList, entityComparator);
    }

    public static boolean stringsEqual(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null && charSequence2 == null) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || !TextUtils.equals(charSequence, charSequence2)) {
            return false;
        }
        return entitiesEqual(getInstance(UserConfig.selectedAccount).getEntities(new CharSequence[]{new SpannableStringBuilder(charSequence)}, true), getInstance(UserConfig.selectedAccount).getEntities(new CharSequence[]{new SpannableStringBuilder(charSequence2)}, true));
    }

    private static boolean suggestedPostEquals(TLRPC.SuggestedPost suggestedPost, TLRPC.SuggestedPost suggestedPost2) {
        boolean z10;
        boolean z11;
        if (suggestedPost != suggestedPost2) {
            if (suggestedPost == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (suggestedPost2 == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 == z11) {
                TL_stars.StarsAmount starsAmount = suggestedPost.price;
                TL_stars.StarsAmount starsAmount2 = suggestedPost2.price;
                kf.a l10 = kf.a.l(starsAmount);
                kf.a l11 = kf.a.l(starsAmount2);
                if (l10 != l11 && ((l10 == null || l11 == null || l10.f13633a != l11.f13633a || l10.f13634b != l11.f13634b) && suggestedPost.schedule_date == suggestedPost2.schedule_date && suggestedPost.accepted == suggestedPost2.accepted && suggestedPost.rejected == suggestedPost2.rejected)) {
                }
            }
            return false;
        }
        return true;
    }

    private static TLRPC.InputReplyTo toInputReplyTo(int i10, TLRPC.MessageReplyHeader messageReplyHeader) {
        if (messageReplyHeader instanceof TLRPC.TL_messageReplyStoryHeader) {
            TLRPC.TL_inputReplyToStory tL_inputReplyToStory = new TLRPC.TL_inputReplyToStory();
            tL_inputReplyToStory.peer = MessagesController.getInstance(i10).getInputPeer(messageReplyHeader.peer);
            tL_inputReplyToStory.story_id = messageReplyHeader.story_id;
            return tL_inputReplyToStory;
        } else if (messageReplyHeader instanceof TLRPC.TL_messageReplyHeader) {
            TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
            tL_inputReplyToMessage.reply_to_msg_id = messageReplyHeader.reply_to_msg_id;
            if ((messageReplyHeader.flags & 1) != 0) {
                TLRPC.InputPeer inputPeer = MessagesController.getInstance(i10).getInputPeer(messageReplyHeader.reply_to_peer_id);
                tL_inputReplyToMessage.reply_to_peer_id = inputPeer;
                if (inputPeer != null) {
                    tL_inputReplyToMessage.flags |= 2;
                }
            }
            int i11 = messageReplyHeader.flags;
            if ((i11 & 2) != 0) {
                tL_inputReplyToMessage.flags |= 1;
                tL_inputReplyToMessage.top_msg_id = messageReplyHeader.reply_to_top_id;
            }
            if ((i11 & 64) != 0) {
                tL_inputReplyToMessage.flags |= 4;
                tL_inputReplyToMessage.quote_text = messageReplyHeader.quote_text;
            }
            if ((i11 & 128) != 0) {
                tL_inputReplyToMessage.flags |= 8;
                tL_inputReplyToMessage.quote_entities = messageReplyHeader.quote_entities;
            }
            return tL_inputReplyToMessage;
        } else {
            return null;
        }
    }

    private TL_iv.TL_inputRichMessage toInputRichMessage(TL_iv.RichMessage richMessage) {
        TL_iv.TL_inputRichMessage tL_inputRichMessage = new TL_iv.TL_inputRichMessage();
        tL_inputRichMessage.rtl = richMessage.rtl;
        tL_inputRichMessage.blocks = new ArrayList<>(richMessage.blocks.size());
        for (int i10 = 0; i10 < richMessage.blocks.size(); i10++) {
            tL_inputRichMessage.blocks.add(SendMessagesHelper.toInputPageBlock(richMessage.blocks.get(i10)));
        }
        ArrayList<TLRPC.Photo> arrayList = richMessage.photos;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i11 = 0; i11 < richMessage.photos.size(); i11++) {
                TLRPC.Photo photo = richMessage.photos.get(i11);
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                tL_inputPhoto.f22411id = photo.f22416id;
                tL_inputPhoto.access_hash = photo.access_hash;
                byte[] bArr = photo.file_reference;
                if (bArr == null) {
                    bArr = new byte[0];
                }
                tL_inputPhoto.file_reference = bArr;
                tL_inputRichMessage.photos.add(tL_inputPhoto);
            }
            tL_inputRichMessage.flags |= 4;
        }
        ArrayList<TLRPC.Document> arrayList2 = richMessage.documents;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            for (int i12 = 0; i12 < richMessage.documents.size(); i12++) {
                TLRPC.Document document = richMessage.documents.get(i12);
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.f22404id = document.f22398id;
                tL_inputDocument.access_hash = document.access_hash;
                byte[] bArr2 = document.file_reference;
                if (bArr2 == null) {
                    bArr2 = new byte[0];
                }
                tL_inputDocument.file_reference = bArr2;
                tL_inputRichMessage.documents.add(tL_inputDocument);
            }
            tL_inputRichMessage.flags |= 8;
        }
        return tL_inputRichMessage;
    }

    private void toggleStickerSetInternal(final Context context, int i10, final org.telegram.ui.ActionBar.o2 o2Var, final FrameLayout frameLayout, final boolean z10, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final int i11, final boolean z11) {
        boolean z12;
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
        long j10 = stickerSet.f22419id;
        tL_inputStickerSetID.f22412id = j10;
        if (i10 != 0) {
            TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
            tL_messages_installStickerSet.stickerset = tL_inputStickerSetID;
            if (i10 == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            tL_messages_installStickerSet.archived = z12;
            markSetInstalling(stickerSet.f22419id, true);
            getConnectionsManager().sendRequest(tL_messages_installStickerSet, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                    TLObject tLObject3 = tLObject;
                    TLRPC.Document document2 = document;
                    int i12 = i11;
                    Context context2 = context;
                    MediaDataController.this.lambda$toggleStickerSetInternal$114(stickerSet, o2Var, z10, i12, z11, frameLayout, context2, tLObject3, document2, tLObject2, tL_error);
                }
            });
            return;
        }
        markSetUninstalling(j10, true);
        TLRPC.TL_messages_uninstallStickerSet tL_messages_uninstallStickerSet = new TLRPC.TL_messages_uninstallStickerSet();
        tL_messages_uninstallStickerSet.stickerset = tL_inputStickerSetID;
        getConnectionsManager().sendRequest(tL_messages_uninstallStickerSet, new ya(this, stickerSet, i11));
    }

    private void updateEmojiStatuses(int i10, TL_account.TL_emojiStatuses tL_emojiStatuses) {
        getMessagesStorage().getStorageQueue().postRunnable(new r4(this, i10, tL_emojiStatuses, 8));
    }

    private void updateSearchResults() {
        MessageObject messageObject;
        ArrayList arrayList = new ArrayList(this.searchResultMessages);
        this.searchResultMessages.clear();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            MessageObject messageObject2 = null;
            if (i10 >= this.searchServerResultMessages.size()) {
                break;
            }
            MessageObject messageObject3 = this.searchServerResultMessages.get(i10);
            if ((!messageObject3.hasValidGroupId() || messageObject3.isPrimaryGroupMessage) && !hashSet.contains(Integer.valueOf(messageObject3.getId()))) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    } else if (((MessageObject) arrayList.get(i11)).getId() == messageObject3.getId()) {
                        messageObject2 = (MessageObject) arrayList.get(i11);
                        break;
                    } else {
                        i11++;
                    }
                }
                if (messageObject2 != null) {
                    messageObject3.copyStableParams(messageObject2);
                    messageObject3.mediaExists = messageObject2.mediaExists;
                    messageObject3.attachPathExists = messageObject2.attachPathExists;
                }
                messageObject3.isSavedFiltered = true;
                this.searchResultMessages.add(messageObject3);
                hashSet.add(Integer.valueOf(messageObject3.getId()));
            }
            i10++;
        }
        for (int i12 = 0; i12 < this.searchLocalResultMessages.size(); i12++) {
            MessageObject messageObject4 = this.searchLocalResultMessages.get(i12);
            if (!hashSet.contains(Integer.valueOf(messageObject4.getId()))) {
                int i13 = 0;
                while (true) {
                    if (i13 < arrayList.size()) {
                        if (((MessageObject) arrayList.get(i13)).getId() == messageObject4.getId()) {
                            messageObject = (MessageObject) arrayList.get(i13);
                            break;
                        }
                        i13++;
                    } else {
                        messageObject = null;
                        break;
                    }
                }
                if (messageObject != null) {
                    messageObject4.copyStableParams(messageObject);
                    messageObject4.mediaExists = messageObject.mediaExists;
                    messageObject4.attachPathExists = messageObject.attachPathExists;
                }
                messageObject4.isSavedFiltered = true;
                this.searchResultMessages.add(messageObject4);
                hashSet.add(Integer.valueOf(messageObject4.getId()));
            }
        }
    }

    public void lambda$verifyAnimatedStickerMessage$68(TLRPC.Message message, String str) {
        ArrayList<TLRPC.Message> arrayList = this.verifyingMessages.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.verifyingMessages.put(str, arrayList);
        }
        arrayList.add(message);
        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
        tL_messages_getStickerSet.stickerset = MessageObject.getInputStickerSet(message);
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new c7(this, str, 0));
    }

    public void addNewStickerSet(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i10;
        if (this.stickerSetsById.h(tL_messages_stickerSet.set.f22419id) < 0 && !this.stickerSetsByName.containsKey(tL_messages_stickerSet.set.short_name)) {
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet.masks) {
                i10 = 1;
            } else if (stickerSet.emojis) {
                i10 = 5;
            } else {
                i10 = 0;
            }
            this.stickerSets[i10].add(0, tL_messages_stickerSet);
            this.stickerSetsById.k(tL_messages_stickerSet, tL_messages_stickerSet.set.f22419id);
            this.installedStickerSetsById.k(tL_messages_stickerSet, tL_messages_stickerSet.set.f22419id);
            this.stickerSetsByName.put(tL_messages_stickerSet.set.short_name, tL_messages_stickerSet);
            a0.h hVar = new a0.h();
            for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                TLRPC.Document document = tL_messages_stickerSet.documents.get(i11);
                hVar.k(document, document.f22398id);
            }
            for (int i12 = 0; i12 < tL_messages_stickerSet.packs.size(); i12++) {
                TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i12);
                String replace = tL_stickerPack.emoticon.replace("️", "");
                tL_stickerPack.emoticon = replace;
                ArrayList<TLRPC.Document> arrayList = this.allStickers.get(replace);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.allStickers.put(tL_stickerPack.emoticon, arrayList);
                }
                for (int i13 = 0; i13 < tL_stickerPack.documents.size(); i13++) {
                    Long l10 = tL_stickerPack.documents.get(i13);
                    if (this.stickersByEmoji.h(l10.longValue()) < 0) {
                        this.stickersByEmoji.k(tL_stickerPack.emoticon, l10.longValue());
                    }
                    TLRPC.Document document2 = (TLRPC.Document) hVar.f(l10.longValue());
                    if (document2 != null) {
                        arrayList.add(document2);
                    }
                }
            }
            this.loadHash[i10] = calcStickersHash(this.stickerSets[i10]);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i10), Boolean.TRUE);
            loadStickers(i10, false, true);
        }
    }

    public void addRecentGif(TLRPC.Document document, int i10, boolean z10) {
        if (document == null) {
            return;
        }
        int i11 = 0;
        while (true) {
            if (i11 < this.recentGifs.size()) {
                TLRPC.Document document2 = this.recentGifs.get(i11);
                if (document2.f22398id == document.f22398id) {
                    this.recentGifs.remove(i11);
                    this.recentGifs.add(0, document2);
                    break;
                }
                i11++;
            } else {
                this.recentGifs.add(0, document);
                break;
            }
        }
        if ((this.recentGifs.size() > getMessagesController().savedGifsLimitDefault && !UserConfig.getInstance(this.currentAccount).isPremium()) || this.recentGifs.size() > getMessagesController().savedGifsLimitPremium) {
            getMessagesStorage().getStorageQueue().postRunnable(new b8(1, this, (TLRPC.Document) com.google.android.recaptcha.internal.a.j(1, this.recentGifs)));
            if (z10) {
                AndroidUtilities.runOnUIThread(new d1(document, 26));
            }
        }
        ArrayList<TLRPC.Document> arrayList = new ArrayList<>();
        arrayList.add(document);
        processLoadedRecentDocuments(0, arrayList, true, i10, false);
    }

    public void addRecentSticker(int i10, Object obj, TLRPC.Document document, int i11, boolean z10) {
        int i12;
        TLRPC.Document document2;
        boolean z11;
        int i13;
        if (i10 != 3) {
            if (MessageObject.isStickerDocument(document) || MessageObject.isAnimatedStickerDocument(document, true)) {
                int i14 = 0;
                while (true) {
                    if (i14 < this.recentStickers[i10].size()) {
                        TLRPC.Document document3 = this.recentStickers[i10].get(i14);
                        if (document3.f22398id == document.f22398id) {
                            this.recentStickers[i10].remove(i14);
                            if (!z10) {
                                this.recentStickers[i10].add(0, document3);
                            }
                        } else {
                            i14++;
                        }
                    } else if (!z10) {
                        this.recentStickers[i10].add(0, document);
                    }
                }
                if (i10 == 2) {
                    if (z10) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 0, document, 4);
                    } else {
                        if (this.recentStickers[i10].size() > getMessagesController().maxFaveStickersCount) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                        int i15 = NotificationCenter.showBulletin;
                        if (z11) {
                            i13 = 6;
                        } else {
                            i13 = 5;
                        }
                        globalInstance.lambda$postNotificationNameOnUIThread$1(i15, 0, document, Integer.valueOf(i13));
                    }
                    TLRPC.TL_messages_faveSticker tL_messages_faveSticker = new TLRPC.TL_messages_faveSticker();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_messages_faveSticker.f22476id = tL_inputDocument;
                    tL_inputDocument.f22404id = document.f22398id;
                    tL_inputDocument.access_hash = document.access_hash;
                    byte[] bArr = document.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    tL_messages_faveSticker.unfave = z10;
                    getConnectionsManager().sendRequest(tL_messages_faveSticker, new x7(this, obj, tL_messages_faveSticker, 0));
                    i12 = getMessagesController().maxFaveStickersCount;
                } else {
                    if (i10 == 0 && z10) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 0, document, 3);
                        TLRPC.TL_messages_saveRecentSticker tL_messages_saveRecentSticker = new TLRPC.TL_messages_saveRecentSticker();
                        TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                        tL_messages_saveRecentSticker.f22500id = tL_inputDocument2;
                        tL_inputDocument2.f22404id = document.f22398id;
                        tL_inputDocument2.access_hash = document.access_hash;
                        byte[] bArr2 = document.file_reference;
                        tL_inputDocument2.file_reference = bArr2;
                        if (bArr2 == null) {
                            tL_inputDocument2.file_reference = new byte[0];
                        }
                        tL_messages_saveRecentSticker.unsave = true;
                        getConnectionsManager().sendRequest(tL_messages_saveRecentSticker, new x7(this, obj, tL_messages_saveRecentSticker, 1));
                    }
                    i12 = getMessagesController().maxRecentStickersCount;
                }
                if (this.recentStickers[i10].size() > i12 || z10) {
                    if (z10) {
                        document2 = document;
                    } else {
                        document2 = (TLRPC.Document) com.google.android.recaptcha.internal.a.j(1, this.recentStickers[i10]);
                    }
                    getMessagesStorage().getStorageQueue().postRunnable(new r4(this, i10, document2, 7));
                }
                if (!z10) {
                    ArrayList<TLRPC.Document> arrayList = new ArrayList<>();
                    arrayList.add(document);
                    processLoadedRecentDocuments(i10, arrayList, false, i11, false);
                }
                if (i10 == 2 || (i10 == 0 && z10)) {
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.recentDocumentsDidLoad, Boolean.FALSE, Integer.valueOf(i10));
                }
            }
        }
    }

    public void addStyle(int i10, int i11, int i12, ArrayList<TLRPC.MessageEntity> arrayList) {
        if ((i10 & 256) != 0) {
            arrayList.add(setEntityStartEnd(new TLRPC.TL_messageEntitySpoiler(), i11, i12));
        }
        if ((i10 & 1) != 0) {
            arrayList.add(setEntityStartEnd(new TLRPC.TL_messageEntityBold(), i11, i12));
        }
        if ((i10 & 2) != 0) {
            arrayList.add(setEntityStartEnd(new TLRPC.TL_messageEntityItalic(), i11, i12));
        }
        if ((i10 & 4) != 0) {
            arrayList.add(setEntityStartEnd(new TLRPC.TL_messageEntityCode(), i11, i12));
        }
        if ((i10 & 8) != 0) {
            arrayList.add(setEntityStartEnd(new TLRPC.TL_messageEntityStrike(), i11, i12));
        }
        if ((i10 & 16) != 0) {
            arrayList.add(setEntityStartEnd(new TLRPC.TL_messageEntityUnderline(), i11, i12));
        }
    }

    public void applyAttachMenuBot(TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot) {
        this.attachMenuBots.bots.add(tL_attachMenuBotsBot.bot);
        loadAttachMenuBots(false, true);
    }

    public boolean areAllTrendingStickerSetsUnread(boolean z10) {
        int size = this.featuredStickerSets[z10 ? 1 : 0].size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.StickerSetCovered stickerSetCovered = this.featuredStickerSets[z10 ? 1 : 0].get(i10);
            if (!isStickerPackInstalled(stickerSetCovered.set.f22419id) && ((!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) && !this.unreadStickerSets[z10 ? 1 : 0].contains(Long.valueOf(stickerSetCovered.set.f22419id)))) {
                return false;
            }
        }
        return true;
    }

    public boolean areStickersLoaded(int i10) {
        return this.stickersLoaded[i10];
    }

    public void beginTransaction() {
        this.inTransaction = true;
    }

    public boolean botInAttachMenu(long j10) {
        for (int i10 = 0; i10 < this.attachMenuBots.bots.size(); i10++) {
            if (this.attachMenuBots.bots.get(i10).bot_id == j10) {
                return true;
            }
        }
        return false;
    }

    public void buildShortcuts() {
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        int g10 = g0.f.g(ApplicationLoader.applicationContext) - 2;
        if (g10 <= 0) {
            g10 = 5;
        }
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        if (SharedConfig.passcodeHash.length() <= 0) {
            for (int i10 = 0; i10 < this.hints.size(); i10++) {
                arrayList.add(this.hints.get(i10));
                if (arrayList.size() == g10 - 2) {
                    break;
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 30) {
            z10 = true;
        }
        Utilities.globalQueue.postRunnable(new p6(this, z10, arrayList, 4));
    }

    public void calcNewHash(int i10) {
        this.loadHash[i10] = calcStickersHash(this.stickerSets[i10]);
    }

    public boolean canAddStickerToFavorites() {
        if (this.stickersLoaded[0] && this.stickerSets[0].size() < 5 && this.recentStickers[2].isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean canCreateAttachedMenuBotShortcut(long j10) {
        return true;
    }

    public boolean cancelRemovingStickerSet(long j10) {
        Runnable runnable = (Runnable) this.removingStickerSetsUndos.f(j10);
        if (runnable != null) {
            runnable.run();
            return true;
        }
        return false;
    }

    public void cancelSearchStickers(SearchStickersKey searchStickersKey) {
        Integer remove;
        if (searchStickersKey != null && (remove = this.loadingSearchStickersKeys.remove(searchStickersKey)) != null && remove.intValue() != 0) {
            getConnectionsManager().cancelRequest(remove.intValue(), true);
        }
    }

    public void checkAllMedia(boolean z10) {
        if (z10) {
            this.reactionsUpdateDate = 0;
            int[] iArr = this.loadFeaturedDate;
            iArr[0] = 0;
            iArr[1] = 0;
        }
        loadRecents(2, false, true, false);
        loadRecents(3, false, true, false);
        loadRecents(7, false, false, true);
        checkFeaturedStickers();
        checkFeaturedEmoji();
        checkReactions();
        checkMenuBots(true);
        checkPremiumPromo();
        checkPremiumGiftStickers();
        checkTonGiftStickers();
        checkGenericAnimations();
        getMessagesController().getAvailableEffects();
    }

    public void checkDefaultTopicIcons() {
        if (getUserConfig().defaultTopicIcons != null) {
            String str = getUserConfig().defaultTopicIcons;
            TLRPC.TL_messages_stickerSet stickerSetByName = getStickerSetByName(str);
            if (stickerSetByName == null) {
                stickerSetByName = getStickerSetByEmojiOrName(str);
            }
            if (stickerSetByName == null) {
                getInstance(this.currentAccount).loadStickersByEmojiOrName(str, false, true);
            }
        }
        if (!this.loadingDefaultTopicIcons && System.currentTimeMillis() - getUserConfig().lastUpdatedDefaultTopicIcons >= 86400000) {
            this.loadingDefaultTopicIcons = true;
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
            tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetEmojiDefaultTopicIcons();
            getConnectionsManager().sendRequest(tL_messages_getStickerSet, new p7(this, 7));
        }
    }

    public void checkFeaturedEmoji() {
        if (!this.loadingFeaturedStickers[1]) {
            if (!this.featuredStickersLoaded[1] || Math.abs((System.currentTimeMillis() / 1000) - this.loadFeaturedDate[1]) >= 3600) {
                loadFeaturedStickers(true, true);
            }
        }
    }

    public void checkFeaturedStickers() {
        if (!this.loadingFeaturedStickers[0]) {
            if (!this.featuredStickersLoaded[0] || Math.abs((System.currentTimeMillis() / 1000) - this.loadFeaturedDate[0]) >= 3600) {
                loadFeaturedStickers(false, true);
            }
        }
    }

    public void checkGenericAnimations() {
        if (getUserConfig().genericAnimationsStickerPack != null) {
            String str = getUserConfig().genericAnimationsStickerPack;
            TLRPC.TL_messages_stickerSet stickerSetByName = getStickerSetByName(str);
            if (stickerSetByName == null) {
                stickerSetByName = getStickerSetByEmojiOrName(str);
            }
            if (stickerSetByName == null) {
                getInstance(this.currentAccount).loadStickersByEmojiOrName(str, false, true);
            }
        }
        if (!this.loadingGenericAnimations && System.currentTimeMillis() - getUserConfig().lastUpdatedGenericAnimations >= 86400000) {
            this.loadingGenericAnimations = true;
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
            tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetEmojiGenericAnimations();
            getConnectionsManager().sendRequest(tL_messages_getStickerSet, new p7(this, 0));
        }
    }

    public void checkMenuBots(boolean z10) {
        if (!this.isLoadingMenuBots) {
            if ((z10 && !this.menuBotsUpdatedLocal) || Math.abs((System.currentTimeMillis() / 1000) - this.menuBotsUpdateDate) >= 3600) {
                loadAttachMenuBots(true, false);
            }
        }
    }

    public void checkPremiumGiftStickers() {
        if (getUserConfig().premiumGiftsStickerPack != null) {
            String str = getUserConfig().premiumGiftsStickerPack;
            TLRPC.TL_messages_stickerSet stickerSetByName = getStickerSetByName(str);
            if (stickerSetByName == null) {
                stickerSetByName = getStickerSetByEmojiOrName(str);
            }
            if (stickerSetByName == null) {
                getInstance(this.currentAccount).loadStickersByEmojiOrName(str, false, true);
            }
        }
        if (!this.loadingPremiumGiftStickers && System.currentTimeMillis() - getUserConfig().lastUpdatedPremiumGiftsStickerPack >= 86400000) {
            this.loadingPremiumGiftStickers = true;
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
            tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetPremiumGifts();
            getConnectionsManager().sendRequest(tL_messages_getStickerSet, new p7(this, 5));
        }
    }

    public void checkPremiumPromo() {
        if (!this.isLoadingPremiumPromo) {
            if (this.premiumPromo == null || Math.abs((System.currentTimeMillis() / 1000) - this.premiumPromoUpdateDate) >= 3600) {
                loadPremiumPromo(true);
            }
        }
    }

    public void checkReactions() {
        if (!this.isLoadingReactions && Math.abs((System.currentTimeMillis() / 1000) - this.reactionsUpdateDate) >= 3600) {
            loadReactions(true, null);
        }
    }

    public void checkRingtones(boolean z10) {
        this.ringtoneDataStore.g(z10);
    }

    public void checkStickers(int i10) {
        if (!this.loadingStickers[i10]) {
            if (!this.stickersLoaded[i10] || Math.abs((System.currentTimeMillis() / 1000) - this.loadDate[i10]) >= 3600) {
                loadStickers(i10, true, false);
            }
        }
    }

    public void checkTonGiftStickers() {
        if (getUserConfig().premiumTonStickerPack != null) {
            String str = getUserConfig().premiumTonStickerPack;
            TLRPC.TL_messages_stickerSet stickerSetByName = getStickerSetByName(str);
            if (stickerSetByName == null) {
                stickerSetByName = getStickerSetByEmojiOrName(str);
            }
            if (stickerSetByName == null) {
                getInstance(this.currentAccount).loadStickersByEmojiOrName(str, false, true);
            }
        }
        if (!this.loadingPremiumTonStickers && System.currentTimeMillis() - getUserConfig().lastUpdatedTonGiftsStickerPack >= 86400000) {
            this.loadingPremiumTonStickers = true;
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
            tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetTonGifts();
            getConnectionsManager().sendRequest(tL_messages_getStickerSet, new p7(this, 9));
        }
    }

    public void cleanDraft(long j10, long j11, boolean z10) {
        TLRPC.DraftMessage draftMessage;
        a0.h hVar = (a0.h) this.drafts.f(j10);
        if (hVar != null) {
            draftMessage = (TLRPC.DraftMessage) hVar.f(j11);
        } else {
            draftMessage = null;
        }
        if (draftMessage != null) {
            if (!z10) {
                a0.h hVar2 = (a0.h) this.drafts.f(j10);
                if (hVar2 != null) {
                    hVar2.l(j11);
                    if (hVar2.m() == 0) {
                        this.drafts.l(j10);
                    }
                }
                a0.h hVar3 = (a0.h) this.draftMessages.f(j10);
                if (hVar3 != null) {
                    hVar3.l(j11);
                    if (hVar3.m() == 0) {
                        this.draftMessages.l(j10);
                    }
                }
                if (j11 == 0) {
                    this.draftPreferences.edit().remove("" + j10).remove("r_" + j10).commit();
                    getMessagesController().sortDialogs(null);
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
                    return;
                }
                SharedPreferences.Editor edit = this.draftPreferences.edit();
                StringBuilder r6 = a4.w.r(j10, "t_", "_");
                r6.append(j11);
                SharedPreferences.Editor remove = edit.remove(r6.toString());
                StringBuilder r9 = a4.w.r(j10, "rt_", "_");
                r9.append(j11);
                remove.remove(r9.toString()).commit();
                return;
            }
            TLRPC.InputReplyTo inputReplyTo = draftMessage.reply_to;
            if (inputReplyTo != null && inputReplyTo.reply_to_msg_id == 0) {
                return;
            }
            if (inputReplyTo != null) {
                inputReplyTo.reply_to_msg_id = 0;
            }
            draftMessage.flags &= -2;
            saveDraft(j10, j11, draftMessage.message, draftMessage.entities, null, null, null, 0L, draftMessage.no_webpage, true);
        }
    }

    public void cleanup() {
        int i10 = 0;
        while (true) {
            ArrayList<TLRPC.Document>[] arrayListArr = this.recentStickers;
            if (i10 >= arrayListArr.length) {
                break;
            }
            ArrayList<TLRPC.Document> arrayList = arrayListArr[i10];
            if (arrayList != null) {
                arrayList.clear();
            }
            this.loadingRecentStickers[i10] = false;
            this.recentStickersLoaded[i10] = false;
            i10++;
        }
        for (int i11 = 0; i11 < 4; i11++) {
            this.loadHash[i11] = 0;
            this.loadDate[i11] = 0;
            this.stickerSets[i11].clear();
            this.loadingStickers[i11] = false;
            this.stickersLoaded[i11] = false;
        }
        this.loadingPinnedMessages.b();
        int[] iArr = this.loadFeaturedDate;
        iArr[0] = 0;
        long[] jArr = this.loadFeaturedHash;
        jArr[0] = 0;
        iArr[1] = 0;
        jArr[1] = 0;
        this.allStickers.clear();
        this.allStickersFeatured.clear();
        this.stickersByEmoji.b();
        this.featuredStickerSetsById[0].b();
        this.featuredStickerSets[0].clear();
        this.featuredStickerSetsById[1].b();
        this.featuredStickerSets[1].clear();
        this.unreadStickerSets[0].clear();
        this.unreadStickerSets[1].clear();
        this.recentGifs.clear();
        this.stickerSetsById.b();
        this.installedStickerSetsById.b();
        this.stickerSetsByName.clear();
        this.diceStickerSetsByEmoji.clear();
        this.diceEmojiStickerSetsById.b();
        this.loadingDiceStickerSets.clear();
        boolean[] zArr = this.loadingFeaturedStickers;
        zArr[0] = false;
        boolean[] zArr2 = this.featuredStickersLoaded;
        zArr2[0] = false;
        zArr[1] = false;
        zArr2[1] = false;
        this.loadingRecentGifs = false;
        this.recentGifsLoaded = false;
        this.currentFetchingEmoji.clear();
        if (Build.VERSION.SDK_INT >= 25) {
            Utilities.globalQueue.postRunnable(new w1(14));
        }
        this.verifyingMessages.clear();
        this.loading = false;
        this.loaded = false;
        this.hints.clear();
        this.inlineBots.clear();
        this.guestBots.clear();
        this.webapps.clear();
        AndroidUtilities.runOnUIThread(new k7(this, 9));
        this.drafts.b();
        this.draftMessages.b();
        this.draftPreferences.edit().clear().apply();
        this.botInfos.clear();
        this.botKeyboards.clear();
        this.botKeyboardsByMids.b();
    }

    public void clearAllDrafts(boolean z10) {
        this.drafts.b();
        this.draftMessages.b();
        this.draftsFolderIds.b();
        this.draftPreferences.edit().clear().commit();
        if (z10) {
            getMessagesController().sortDialogs(null);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
        }
    }

    public void clearBotKeyboard(MessagesStorage.TopicKey topicKey, ArrayList<Integer> arrayList) {
        AndroidUtilities.runOnUIThread(new f0((BaseController) this, (ArrayList) arrayList, (Object) topicKey, 29));
    }

    public void clearDraftsFolderIds() {
        this.draftsFolderIds.b();
    }

    public void clearFoundMessageObjects() {
        this.searchResultMessages.clear();
        this.searchServerResultMessages.clear();
        this.searchLocalResultMessages.clear();
    }

    public ArrayList<TLRPC.EmojiStatus> clearRecentEmojiStatuses() {
        ArrayList<TLRPC.EmojiStatus> arrayList = this.emojiStatuses[0];
        if (arrayList != null) {
            arrayList.clear();
        }
        this.emojiStatusesHash[0] = 0;
        getMessagesStorage().getStorageQueue().postRunnable(new k7(this, 4));
        return this.emojiStatuses[0];
    }

    public void clearRecentReactions() {
        this.recentReactions.clear();
        Context context = ApplicationLoader.applicationContext;
        context.getSharedPreferences("recent_reactions_" + this.currentAccount, 0).edit().clear().apply();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_messages_clearRecentReactions(), new RequestDelegate() {
            {
                MediaDataController.this = this;
            }

            @Override
            public void run(TLObject tLObject, TLRPC.TL_error tL_error) {
            }
        });
    }

    public void clearRecentStickers() {
        getConnectionsManager().sendRequest(new TLRPC.TL_messages_clearRecentStickers(), new p7(this, 1));
    }

    public void clearTopPeers() {
        this.hints.clear();
        this.inlineBots.clear();
        this.guestBots.clear();
        this.webapps.clear();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadHints, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadInlineHints, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadGuestBotHints, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadWebappsHints, new Object[0]);
        getMessagesStorage().getStorageQueue().postRunnable(new k7(this, 15));
        buildShortcuts();
    }

    public boolean containsTopPeer(long j10) {
        for (int i10 = 0; i10 < this.hints.size(); i10++) {
            if (DialogObject.getPeerDialogId(this.hints.get(i10).peer) == j10) {
                return true;
            }
        }
        return false;
    }

    public void endTransaction() {
        this.inTransaction = false;
    }

    public void fetchEmojiStatuses(int i10, boolean z10) {
        TL_account.getChannelDefaultEmojiStatuses getchanneldefaultemojistatuses;
        boolean[] zArr = this.emojiStatusesFetching;
        if (zArr[i10]) {
            return;
        }
        zArr[i10] = true;
        if (z10) {
            getMessagesStorage().getStorageQueue().postRunnable(new p8(this, i10, 1));
            return;
        }
        if (i10 == 0) {
            TL_account.getRecentEmojiStatuses getrecentemojistatuses = new TL_account.getRecentEmojiStatuses();
            getrecentemojistatuses.hash = this.emojiStatusesHash[i10];
            getchanneldefaultemojistatuses = getrecentemojistatuses;
        } else if (i10 == 1) {
            TL_account.getDefaultEmojiStatuses getdefaultemojistatuses = new TL_account.getDefaultEmojiStatuses();
            getdefaultemojistatuses.hash = this.emojiStatusesHash[i10];
            getchanneldefaultemojistatuses = getdefaultemojistatuses;
        } else {
            TL_account.getChannelDefaultEmojiStatuses getchanneldefaultemojistatuses2 = new TL_account.getChannelDefaultEmojiStatuses();
            getchanneldefaultemojistatuses2.hash = this.emojiStatusesHash[i10];
            getchanneldefaultemojistatuses = getchanneldefaultemojistatuses2;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getchanneldefaultemojistatuses, new q7(this, i10, 3));
    }

    public void fetchNewEmojiKeywords(String[] strArr) {
        fetchNewEmojiKeywords(strArr, false);
    }

    public void fillWithAnimatedEmoji(ArrayList<KeywordResult> arrayList, Integer num, boolean z10, boolean z11, boolean z12, Runnable runnable) {
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList[] arrayListArr = {getStickerSets(5)};
            w6 w6Var = new w6(this, num, arrayList, z11, z10, arrayListArr, runnable);
            ArrayList arrayList2 = arrayListArr[0];
            if ((arrayList2 == null || arrayList2.isEmpty()) && !this.triedLoadingEmojipacks) {
                this.triedLoadingEmojipacks = true;
                boolean[] zArr = new boolean[1];
                AndroidUtilities.runOnUIThread(new ok(this, zArr, arrayListArr, w6Var, 18));
                AndroidUtilities.runOnUIThread(new c2(21, zArr, w6Var), 900L);
                return;
            }
            w6Var.run();
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public TLRPC.TL_attachMenuBot findBotInAttachMenu(long j10) {
        for (int i10 = 0; i10 < this.attachMenuBots.bots.size(); i10++) {
            if (this.attachMenuBots.bots.get(i10).bot_id == j10) {
                return this.attachMenuBots.bots.get(i10);
            }
        }
        return null;
    }

    public void findStickerSetByNameInCache(String str, Utilities.Callback<TLRPC.TL_messages_stickerSet> callback) {
        if (callback == null) {
            return;
        }
        if (str == null) {
            callback.run(null);
        } else {
            getMessagesStorage().getStorageQueue().postRunnable(new c9(this, str, callback, 0));
        }
    }

    public void generateEmojiPreviewThemes(ArrayList<TLRPC.TL_theme> arrayList, int i10) {
        Context context = ApplicationLoader.applicationContext;
        SharedPreferences.Editor edit = context.getSharedPreferences("emojithemes_config_" + i10, 0).edit();
        edit.putInt("count", arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.TL_theme tL_theme = arrayList.get(i11);
            SerializedData serializedData = new SerializedData(tL_theme.getObjectSize());
            tL_theme.serializeToStream(serializedData);
            edit.putString("theme_" + i11, Utilities.bytesToHex(serializedData.toByteArray()));
        }
        edit.apply();
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new fp(org.telegram.ui.ActionBar.b4.c(i10)));
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                org.telegram.ui.ActionBar.b4 d = org.telegram.ui.ActionBar.b4.d(i10, arrayList.get(i12));
                fp fpVar = new fp(d);
                if (d.f22766f.size() >= 4) {
                    arrayList2.add(fpVar);
                }
            }
            ChatThemeController.chatThemeQueue.postRunnable(new AnonymousClass3(arrayList2, i10));
            return;
        }
        this.defaultEmojiThemes.clear();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.emojiPreviewThemesChanged, new Object[0]);
    }

    public HashMap<String, ArrayList<TLRPC.Document>> getAllStickers() {
        return this.allStickers;
    }

    public HashMap<String, ArrayList<TLRPC.Document>> getAllStickersFeatured() {
        return this.allStickersFeatured;
    }

    public void getAnimatedEmojiByKeywords(String str, Utilities.Callback<ArrayList<Long>> callback) {
        if (str == null) {
            if (callback != null) {
                callback.run(new ArrayList<>());
                return;
            }
            return;
        }
        Utilities.searchQueue.postRunnable(new ok(str, getStickerSets(5), getFeaturedEmojiSets(), callback, 16));
    }

    public int getArchivedStickersCount(int i10) {
        return this.archivedStickersCount[i10];
    }

    public TLRPC.TL_attachMenuBots getAttachMenuBots() {
        return this.attachMenuBots;
    }

    public TL_bots.BotInfo getBotInfoCached(long j10, long j11) {
        HashMap<String, TL_bots.BotInfo> hashMap = this.botInfos;
        return hashMap.get(j10 + "_" + j11);
    }

    public ArrayList<TLRPC.EmojiStatus> getDefaultChannelEmojiStatuses() {
        if (!this.emojiStatusesFromCacheFetched[2]) {
            fetchEmojiStatuses(2, true);
        } else if (this.emojiStatuses[2] == null || (this.emojiStatusesFetchDate[2] != null && (System.currentTimeMillis() / 1000) - this.emojiStatusesFetchDate[2].longValue() > 1800)) {
            fetchEmojiStatuses(2, false);
        }
        return this.emojiStatuses[2];
    }

    public ArrayList<TLRPC.EmojiStatus> getDefaultEmojiStatuses() {
        if (!this.emojiStatusesFromCacheFetched[1]) {
            fetchEmojiStatuses(1, true);
        } else if (this.emojiStatuses[1] == null || (this.emojiStatusesFetchDate[1] != null && (System.currentTimeMillis() / 1000) - this.emojiStatusesFetchDate[1].longValue() > 1800)) {
            fetchEmojiStatuses(1, false);
        }
        return this.emojiStatuses[1];
    }

    public String getDoubleTapReaction() {
        String str = this.doubleTapReaction;
        if (str != null) {
            return str;
        }
        if (getReactionsList().isEmpty()) {
            return null;
        }
        String string = MessagesController.getEmojiSettings(this.currentAccount).getString("reaction_on_double_tap", null);
        if (string != null && (getReactionsMap().get(string) != null || string.startsWith("animated_"))) {
            this.doubleTapReaction = string;
            return string;
        }
        return getReactionsList().get(0).reaction;
    }

    public TLRPC.DraftMessage getDraft(long j10, long j11) {
        a0.h hVar = (a0.h) this.drafts.f(j10);
        if (hVar == null) {
            return null;
        }
        return (TLRPC.DraftMessage) hVar.f(j11);
    }

    public int getDraftFolderId(long j10) {
        return ((Integer) this.draftsFolderIds.g(0, j10)).intValue();
    }

    public TLRPC.Message getDraftMessage(long j10, long j11) {
        a0.h hVar = (a0.h) this.draftMessages.f(j10);
        if (hVar == null) {
            return null;
        }
        return (TLRPC.Message) hVar.f(j11);
    }

    public DraftVoice getDraftVoice(long j10, long j11) {
        loadDraftVoiceMessages();
        return (DraftVoice) this.draftVoices.f(Objects.hash(Long.valueOf(j10), Long.valueOf(j11)));
    }

    public a0.h getDrafts() {
        return this.drafts;
    }

    public TLRPC.Document getEmojiAnimatedSticker(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String replace = charSequence.toString().replace("️", "");
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = getStickerSets(4);
        int size = stickerSets.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i10);
            int size2 = tL_messages_stickerSet.packs.size();
            for (int i11 = 0; i11 < size2; i11++) {
                TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i11);
                if (!tL_stickerPack.documents.isEmpty() && TextUtils.equals(tL_stickerPack.emoticon, replace)) {
                    return (TLRPC.Document) getStickerByIds(4).f(tL_stickerPack.documents.get(0).longValue());
                }
            }
        }
        return null;
    }

    public String getEmojiForSticker(long j10) {
        String str = (String) this.stickersByEmoji.f(j10);
        if (str != null) {
            return str;
        }
        return "";
    }

    public void getEmojiNames(String[] strArr, String str, Utilities.Callback<ArrayList<String>> callback) {
        if (callback != null && str != null) {
            getMessagesStorage().getStorageQueue().postRunnable(new ok(this, strArr, str, callback, 17));
        }
    }

    public void getEmojiSuggestions(String[] strArr, String str, boolean z10, KeywordResultCallback keywordResultCallback, boolean z11) {
        getEmojiSuggestions(strArr, str, z10, keywordResultCallback, null, z11, false, false, null);
    }

    public List<TLRPC.TL_availableReaction> getEnabledReactionsList() {
        return this.enabledReactionsList;
    }

    public ArrayList<TLRPC.MessageEntity> getEntities(CharSequence[] charSequenceArr, boolean z10) {
        return getEntities(charSequenceArr, z10, true);
    }

    public ArrayList<TLRPC.StickerSetCovered> getFeaturedEmojiSets() {
        return this.featuredStickerSets[1];
    }

    public ArrayList<TLRPC.StickerSetCovered> getFeaturedStickerSets() {
        return this.featuredStickerSets[0];
    }

    public long getFeaturedStickersHashWithoutUnread(boolean z10) {
        long j10 = 0;
        for (int i10 = 0; i10 < this.featuredStickerSets[z10 ? 1 : 0].size(); i10++) {
            TLRPC.StickerSet stickerSet = this.featuredStickerSets[z10 ? 1 : 0].get(i10).set;
            if (!stickerSet.archived) {
                j10 = calcHash(j10, stickerSet.f22419id);
            }
        }
        return j10;
    }

    public ArrayList<MessageObject> getFoundMessageObjects() {
        return this.searchResultMessages;
    }

    public TLRPC.Document getGreetingsSticker() {
        TLRPC.Document document = this.greetingsSticker;
        preloadNextGreetingsSticker();
        return document;
    }

    public TLRPC.TL_messages_stickerSet getGroupStickerSetById(TLRPC.StickerSet stickerSet) {
        TLRPC.StickerSet stickerSet2;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.stickerSetsById.f(stickerSet.f22419id);
        if (tL_messages_stickerSet == null) {
            tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.groupStickerSets.f(stickerSet.f22419id);
            if (tL_messages_stickerSet != null && (stickerSet2 = tL_messages_stickerSet.set) != null) {
                if (stickerSet2.hash != stickerSet.hash) {
                    loadGroupStickerSet(stickerSet, false);
                }
                return tL_messages_stickerSet;
            }
            loadGroupStickerSet(stickerSet, true);
        }
        return tL_messages_stickerSet;
    }

    public String getLastSearchQuery() {
        return this.lastSearchQuery;
    }

    public int getMask() {
        int i10 = 1;
        if (this.lastReturnedNum >= this.searchResultMessages.size() - 1) {
            boolean[] zArr = this.messagesSearchEndReached;
            if (zArr[0] && zArr[1]) {
                i10 = 0;
            }
        }
        if (this.lastReturnedNum > 0) {
            return i10 | 2;
        }
        return i10;
    }

    public void getMediaCount(final long j10, final long j11, final int i10, final int i11, boolean z10) {
        if (!z10 && !DialogObject.isEncryptedDialog(j10)) {
            TLRPC.TL_messages_getSearchCounters tL_messages_getSearchCounters = new TLRPC.TL_messages_getSearchCounters();
            if (i10 == 0) {
                tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterPhotoVideo());
            } else if (i10 == 1) {
                tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterDocument());
            } else if (i10 == 2) {
                tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterRoundVoice());
            } else if (i10 == 3) {
                tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterUrl());
            } else if (i10 == 4) {
                tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterMusic());
            } else if (i10 == 5) {
                tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterGif());
            } else if (i10 == 8) {
                tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterPoll());
            }
            if (j11 != 0) {
                if (j10 == getUserConfig().getClientUserId()) {
                    tL_messages_getSearchCounters.saved_peer_id = getMessagesController().getInputPeer(j11);
                    tL_messages_getSearchCounters.flags = 4 | tL_messages_getSearchCounters.flags;
                } else {
                    tL_messages_getSearchCounters.top_msg_id = (int) j11;
                    tL_messages_getSearchCounters.flags |= 1;
                }
            }
            TLRPC.InputPeer inputPeer = getMessagesController().getInputPeer(j10);
            tL_messages_getSearchCounters.peer = inputPeer;
            if (inputPeer == null) {
                return;
            }
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getSearchCounters, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    MediaDataController.this.lambda$getMediaCount$132(j10, j11, i10, i11, tLObject, tL_error);
                }
            }), i11);
            return;
        }
        getMediaCountDatabase(j10, j11, i10, i11);
    }

    public void getMediaCounts(long j10, long j11, int i10) {
        getMessagesStorage().getStorageQueue().postRunnable(new v7(this, j11, j10, i10, 0));
    }

    public Pair<Long, TLRPC.DraftMessage> getOneThreadDraft(long j10) {
        a0.h hVar = (a0.h) this.drafts.f(j10);
        if (hVar != null && hVar.m() > 0) {
            return new Pair<>(Long.valueOf(hVar.j(0)), hVar.n(0));
        }
        return null;
    }

    public Integer getPremiumHintAnnualDiscount(boolean z10) {
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo;
        ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList;
        double d;
        int i10;
        double d10;
        p2.l lVar;
        p2.k kVar;
        p2.k kVar2;
        double d11;
        int i11;
        p2.l lVar2;
        p2.k kVar3;
        if ((z10 && (!BillingController.getInstance().isReady() || BillingController.getInstance().getLastPremiumTransaction() == null)) || (tL_help_premiumPromo = this.premiumPromo) == null) {
            return null;
        }
        ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList2 = tL_help_premiumPromo.period_options;
        int size = arrayList2.size();
        double d12 = 0.0d;
        boolean z11 = false;
        int i12 = 0;
        while (i12 < size) {
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = arrayList2.get(i12);
            i12++;
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption2 = tL_premiumSubscriptionOption;
            if (z10) {
                if (tL_premiumSubscriptionOption2.current) {
                    kVar2 = null;
                    if (Objects.equals(tL_premiumSubscriptionOption2.transaction.replaceAll("^(.*?)(?:\\.\\.\\d*|)$", "$1"), BillingController.getInstance().getLastPremiumTransaction())) {
                        if (BuildVars.useInvoiceBilling() && (lVar2 = BillingController.PREMIUM_PRODUCT_DETAILS) != null) {
                            ArrayList arrayList3 = lVar2.h;
                            int size2 = arrayList3.size();
                            int i13 = 0;
                            while (true) {
                                if (i13 < size2) {
                                    Object obj = arrayList3.get(i13);
                                    i13++;
                                    kVar3 = (p2.k) obj;
                                    String str = ((p2.j) ((ArrayList) kVar3.f45470b.f19159b).get(0)).d;
                                    int i14 = tL_premiumSubscriptionOption2.months;
                                    if (i14 == 12) {
                                        if (str.equals("P1Y")) {
                                            break;
                                        }
                                    } else {
                                        Locale locale = Locale.ROOT;
                                        if (str.equals("P" + i14 + "M")) {
                                            break;
                                        }
                                    }
                                } else {
                                    kVar3 = kVar2;
                                    break;
                                }
                            }
                            if (kVar3 == null) {
                                d11 = tL_premiumSubscriptionOption2.amount;
                                i11 = tL_premiumSubscriptionOption2.months;
                            } else {
                                d11 = ((p2.j) ((ArrayList) kVar3.f45470b.f19159b).get(0)).f45467b;
                                i11 = tL_premiumSubscriptionOption2.months;
                            }
                        } else {
                            d11 = tL_premiumSubscriptionOption2.amount;
                            i11 = tL_premiumSubscriptionOption2.months;
                        }
                        d12 = d11 / i11;
                        z11 = true;
                    }
                }
            } else {
                kVar2 = null;
                if (tL_premiumSubscriptionOption2.months == 1) {
                    if (BuildVars.useInvoiceBilling()) {
                    }
                    d11 = tL_premiumSubscriptionOption2.amount;
                    i11 = tL_premiumSubscriptionOption2.months;
                    d12 = d11 / i11;
                    z11 = true;
                }
            }
        }
        ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList4 = this.premiumPromo.period_options;
        int size3 = arrayList4.size();
        int i15 = 0;
        int i16 = 0;
        while (i16 < size3) {
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption3 = arrayList4.get(i16);
            i16++;
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption4 = tL_premiumSubscriptionOption3;
            if (z11 && tL_premiumSubscriptionOption4.months == 12) {
                if (!BuildVars.useInvoiceBilling() && (lVar = BillingController.PREMIUM_PRODUCT_DETAILS) != null) {
                    ArrayList arrayList5 = lVar.h;
                    int size4 = arrayList5.size();
                    int i17 = 0;
                    while (true) {
                        if (i17 < size4) {
                            Object obj2 = arrayList5.get(i17);
                            i17++;
                            kVar = (p2.k) obj2;
                            String str2 = ((p2.j) ((ArrayList) kVar.f45470b.f19159b).get(0)).d;
                            int i18 = tL_premiumSubscriptionOption4.months;
                            arrayList = arrayList4;
                            if (i18 == 12) {
                                if (str2.equals("P1Y")) {
                                    break;
                                }
                                arrayList4 = arrayList;
                            } else {
                                Locale locale2 = Locale.ROOT;
                                if (str2.equals("P" + i18 + "M")) {
                                    break;
                                }
                                arrayList4 = arrayList;
                            }
                        } else {
                            arrayList = arrayList4;
                            kVar = null;
                            break;
                        }
                    }
                    if (kVar == null) {
                        d10 = tL_premiumSubscriptionOption4.amount / tL_premiumSubscriptionOption4.months;
                        i15 = (int) ((1.0d - (d10 / d12)) * 100.0d);
                    } else {
                        d = ((p2.j) ((ArrayList) kVar.f45470b.f19159b).get(0)).f45467b;
                        i10 = tL_premiumSubscriptionOption4.months;
                    }
                } else {
                    arrayList = arrayList4;
                    d = tL_premiumSubscriptionOption4.amount;
                    i10 = tL_premiumSubscriptionOption4.months;
                }
                d10 = d / i10;
                i15 = (int) ((1.0d - (d10 / d12)) * 100.0d);
            } else {
                arrayList = arrayList4;
            }
            arrayList4 = arrayList;
        }
        if (!z11 || i15 <= 0) {
            return null;
        }
        return Integer.valueOf(i15);
    }

    public TLRPC.TL_help_premiumPromo getPremiumPromo() {
        return this.premiumPromo;
    }

    public List<TLRPC.TL_availableReaction> getReactionsList() {
        return this.reactionsList;
    }

    public HashMap<String, TLRPC.TL_availableReaction> getReactionsMap() {
        return this.reactionsMap;
    }

    public ArrayList<TLRPC.EmojiStatus> getRecentEmojiStatuses() {
        if (!this.emojiStatusesFromCacheFetched[0]) {
            fetchEmojiStatuses(0, true);
        } else if (this.emojiStatuses[0] == null || (this.emojiStatusesFetchDate[0] != null && (System.currentTimeMillis() / 1000) - this.emojiStatusesFetchDate[0].longValue() > 1800)) {
            fetchEmojiStatuses(0, false);
        }
        return this.emojiStatuses[0];
    }

    public ArrayList<TLRPC.Document> getRecentGifs() {
        return new ArrayList<>(this.recentGifs);
    }

    public ArrayList<TLRPC.Reaction> getRecentReactions() {
        return this.recentReactions;
    }

    public ArrayList<TLRPC.Document> getRecentStickers(int i10) {
        return getRecentStickers(i10, false);
    }

    public ArrayList<TLRPC.Document> getRecentStickersNoCopy(int i10) {
        return this.recentStickers[i10];
    }

    public ArrayList<TLRPC.Reaction> getSavedReactions() {
        return this.savedReactions;
    }

    public int getSearchCount() {
        if (this.searchServerResultMessages.isEmpty()) {
            int[] iArr = this.messagesSearchCount;
            return Math.max(Math.max(iArr[0] + iArr[1], this.messagesLocalSearchCount), this.searchServerResultMessages.size());
        }
        int[] iArr2 = this.messagesSearchCount;
        return Math.max(iArr2[0] + iArr2[1], this.searchServerResultMessages.size());
    }

    public int getSearchPosition() {
        return this.lastReturnedNum;
    }

    public a0.h getStickerByIds(int i10) {
        return this.stickersByIds[i10];
    }

    public TLRPC.TL_messages_stickerSet getStickerSet(TLRPC.StickerSet stickerSet, boolean z10) {
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_inputStickerSetID.f22412id = stickerSet.f22419id;
        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
        return getStickerSet(tL_inputStickerSetID, z10);
    }

    public TLRPC.TL_messages_stickerSet getStickerSetByEmojiOrName(String str) {
        return this.diceStickerSetsByEmoji.get(str);
    }

    public TLRPC.TL_messages_stickerSet getStickerSetById(long j10) {
        return (TLRPC.TL_messages_stickerSet) this.stickerSetsById.f(j10);
    }

    public TLRPC.TL_messages_stickerSet getStickerSetByName(String str) {
        if (str == null) {
            return null;
        }
        return this.stickerSetsByName.get(str.toLowerCase());
    }

    public String getStickerSetName(long j10) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.stickerSetsById.f(j10);
        if (tL_messages_stickerSet != null) {
            return tL_messages_stickerSet.set.short_name;
        }
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.featuredStickerSetsById[0].f(j10);
        if (stickerSetCovered != null) {
            return stickerSetCovered.set.short_name;
        }
        TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) this.featuredStickerSetsById[1].f(j10);
        if (stickerSetCovered2 != null) {
            return stickerSetCovered2.set.short_name;
        }
        return null;
    }

    public ArrayList<TLRPC.TL_messages_stickerSet> getStickerSets(int i10) {
        if (i10 == 3) {
            return this.stickerSets[2];
        }
        return this.stickerSets[i10];
    }

    public ArrayList<TLRPC.Reaction> getTopReactions() {
        return this.topReactions;
    }

    public ArrayList<Long> getUnreadEmojiSets() {
        return this.unreadStickerSets[1];
    }

    public ArrayList<Long> getUnreadStickerSets() {
        return this.unreadStickerSets[0];
    }

    public boolean hasRecentGif(TLRPC.Document document) {
        for (int i10 = 0; i10 < this.recentGifs.size(); i10++) {
            TLRPC.Document document2 = this.recentGifs.get(i10);
            if (document2.f22398id == document.f22398id) {
                this.recentGifs.remove(i10);
                this.recentGifs.add(0, document2);
                return true;
            }
        }
        return false;
    }

    public void increaseGuestRating(long j10) {
        increaseInlineRating(j10, true);
    }

    public void increaseInlineRating(long j10) {
        increaseInlineRating(j10, false);
    }

    public void increasePeerRaiting(long j10) {
        TLRPC.User user;
        if (getUserConfig().suggestContacts && DialogObject.isUserDialog(j10) && (user = getMessagesController().getUser(Long.valueOf(j10))) != null && !user.bot && !user.self) {
            getMessagesStorage().getStorageQueue().postRunnable(new e7(this, j10, 1));
        }
    }

    public void increaseWebappRating(long j10) {
        int i10;
        TLRPC.TL_topPeer tL_topPeer;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
        if (user != null && user.bot) {
            if (getUserConfig().webappRatingLoadTime != 0) {
                i10 = Math.max(1, ((int) (System.currentTimeMillis() / 1000)) - getUserConfig().webappRatingLoadTime);
            } else {
                i10 = 60;
            }
            int i11 = 0;
            while (true) {
                if (i11 < this.webapps.size()) {
                    tL_topPeer = this.webapps.get(i11);
                    if (tL_topPeer.peer.user_id == j10) {
                        break;
                    }
                    i11++;
                } else {
                    tL_topPeer = null;
                    break;
                }
            }
            if (tL_topPeer == null) {
                tL_topPeer = new TLRPC.TL_topPeer();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_topPeer.peer = tL_peerUser;
                tL_peerUser.user_id = j10;
                this.webapps.add(tL_topPeer);
            }
            tL_topPeer.rating = Math.exp(i10 / getMessagesController().ratingDecay) + tL_topPeer.rating;
            Collections.sort(this.webapps, new q(9));
            if (this.webapps.size() > 20) {
                a4.w.t(1, this.webapps);
            }
            savePeer(j10, 2, tL_topPeer.rating);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadWebappsHints, new Object[0]);
        }
    }

    public void installShortcut(long j10, int i10) {
        installShortcut(j10, i10, null);
    }

    public boolean isLoadingStickers(int i10) {
        return this.loadingStickers[i10];
    }

    public boolean isMenuBotsUpdatedLocal() {
        return this.menuBotsUpdatedLocal;
    }

    public boolean isMessageFound(int i10, boolean z10) {
        if (this.searchServerResultMessagesMap[z10 ? 1 : 0].indexOfKey(i10) >= 0) {
            return true;
        }
        return false;
    }

    public boolean isSearchLoading() {
        if (this.reqId != 0) {
            return true;
        }
        return false;
    }

    public boolean isShortcutAdded(long j10, int i10) {
        String str;
        if (Build.VERSION.SDK_INT >= 26) {
            if (i10 == SHORTCUT_TYPE_USER_OR_CHAT) {
                str = "sdid_";
            } else {
                str = "bdid_";
            }
            String str2 = str + j10;
            List k9 = g0.f.k(ApplicationLoader.applicationContext);
            for (int i11 = 0; i11 < k9.size(); i11++) {
                if (((g0.c) k9.get(i11)).f6964b.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isStickerInFavorites(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        for (int i10 = 0; i10 < this.recentStickers[2].size(); i10++) {
            TLRPC.Document document2 = this.recentStickers[2].get(i10);
            if (document2.f22398id == document.f22398id && document2.dc_id == document.dc_id) {
                return true;
            }
        }
        return false;
    }

    public boolean isStickerPackInstalled(long j10) {
        return isStickerPackInstalled(j10, true);
    }

    public boolean isStickerPackUnread(boolean z10, long j10) {
        return this.unreadStickerSets[z10 ? 1 : 0].contains(Long.valueOf(j10));
    }

    public void jumpToSearchedMessage(int i10, int i11) {
        if (i11 >= 0 && i11 < this.searchResultMessages.size()) {
            this.lastReturnedNum = i11;
            MessageObject messageObject = this.searchResultMessages.get(i11);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatSearchResultsAvailable, Integer.valueOf(i10), Integer.valueOf(messageObject.getId()), Integer.valueOf(getMask()), Long.valueOf(messageObject.getDialogId()), Integer.valueOf(this.lastReturnedNum), Integer.valueOf(getSearchCount()), Boolean.TRUE);
        }
    }

    public void loadArchivedStickersCount(int i10, boolean z10) {
        boolean z11;
        boolean z12 = true;
        if (z10) {
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.currentAccount);
            int i11 = notificationsSettings.getInt("archivedStickersCount" + i10, -1);
            if (i11 == -1) {
                loadArchivedStickersCount(i10, false);
                return;
            }
            this.archivedStickersCount[i10] = i11;
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.archivedStickersCountDidLoad, Integer.valueOf(i10));
            return;
        }
        TLRPC.TL_messages_getArchivedStickers tL_messages_getArchivedStickers = new TLRPC.TL_messages_getArchivedStickers();
        tL_messages_getArchivedStickers.limit = 0;
        if (i10 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        tL_messages_getArchivedStickers.masks = z11;
        if (i10 != 5) {
            z12 = false;
        }
        tL_messages_getArchivedStickers.emojis = z12;
        getConnectionsManager().sendRequest(tL_messages_getArchivedStickers, new q7(this, i10, 0));
    }

    public void loadAttachMenuBots(boolean z10, boolean z11) {
        loadAttachMenuBots(z10, z11, null);
    }

    public void loadBotInfo(long j10, long j11, boolean z10, int i10) {
        loadBotInfo(j10, j11, z10, i10, null);
    }

    public void loadBotKeyboard(MessagesStorage.TopicKey topicKey) {
        loadBotKeyboard(topicKey, false);
    }

    public void loadDraftsIfNeed() {
        if (!getUserConfig().draftsLoaded && !this.loadingDrafts) {
            this.loadingDrafts = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_messages_getAllDrafts(), new p7(this, 6));
        }
    }

    public void loadEmojiThemes() {
        Context context = ApplicationLoader.applicationContext;
        SharedPreferences sharedPreferences = context.getSharedPreferences("emojithemes_config_" + this.currentAccount, 0);
        int i10 = sharedPreferences.getInt("count", 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new fp(org.telegram.ui.ActionBar.b4.c(this.currentAccount)));
        for (int i11 = 0; i11 < i10; i11++) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(sharedPreferences.getString("theme_" + i11, "")));
            try {
                org.telegram.ui.ActionBar.b4 d = org.telegram.ui.ActionBar.b4.d(this.currentAccount, TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true));
                if (d.f22766f.size() >= 4) {
                    arrayList.add(new fp(d));
                }
                ChatThemeController.chatThemeQueue.postRunnable(new AnonymousClass2(arrayList));
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
    }

    public void loadFeaturedStickers(boolean z10, boolean z11) {
        long j10;
        TLRPC.TL_messages_getFeaturedStickers tL_messages_getFeaturedStickers;
        boolean[] zArr = this.loadingFeaturedStickers;
        if (zArr[z10 ? 1 : 0]) {
            return;
        }
        zArr[z10 ? 1 : 0] = true;
        if (z11) {
            getMessagesStorage().getStorageQueue().postRunnable(new e8(this, z10, 0));
            return;
        }
        if (z10) {
            TLRPC.TL_messages_getFeaturedEmojiStickers tL_messages_getFeaturedEmojiStickers = new TLRPC.TL_messages_getFeaturedEmojiStickers();
            j10 = this.loadFeaturedHash[1];
            tL_messages_getFeaturedEmojiStickers.hash = j10;
            tL_messages_getFeaturedStickers = tL_messages_getFeaturedEmojiStickers;
        } else {
            TLRPC.TL_messages_getFeaturedStickers tL_messages_getFeaturedStickers2 = new TLRPC.TL_messages_getFeaturedStickers();
            j10 = this.loadFeaturedHash[0];
            tL_messages_getFeaturedStickers2.hash = j10;
            tL_messages_getFeaturedStickers = tL_messages_getFeaturedStickers2;
        }
        getConnectionsManager().sendRequest(tL_messages_getFeaturedStickers, new f8(this, z10, j10, 0));
    }

    public void loadHints(boolean z10) {
        if (!this.loading && getUserConfig().suggestContacts) {
            if (z10) {
                if (!this.loaded) {
                    this.loading = true;
                    getMessagesStorage().getStorageQueue().postRunnable(new k7(this, 12));
                    this.loaded = true;
                    return;
                }
                return;
            }
            this.loading = true;
            TLRPC.TL_contacts_getTopPeers tL_contacts_getTopPeers = new TLRPC.TL_contacts_getTopPeers();
            tL_contacts_getTopPeers.hash = 0L;
            tL_contacts_getTopPeers.bots_pm = false;
            tL_contacts_getTopPeers.correspondents = true;
            tL_contacts_getTopPeers.groups = false;
            tL_contacts_getTopPeers.channels = false;
            tL_contacts_getTopPeers.bots_inline = true;
            tL_contacts_getTopPeers.bots_guestchat = true;
            tL_contacts_getTopPeers.bots_app = true;
            tL_contacts_getTopPeers.offset = 0;
            tL_contacts_getTopPeers.limit = 20;
            getConnectionsManager().sendRequestTyped(tL_contacts_getTopPeers, new Object(), new oe(this, 4));
        }
    }

    public void loadMedia(final long r17, final int r19, final int r20, final int r21, final int r22, final long r23, int r25, final int r26, final int r27, kg.q0 r28, java.lang.String r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.loadMedia(long, int, int, int, int, long, int, int, int, kg.q0, java.lang.String):void");
    }

    public void loadMoreSearchMessages(boolean z10) {
        if (!this.loadingMoreSearchMessages && this.reqId == 0) {
            boolean[] zArr = this.messagesSearchEndReached;
            if (!zArr[0] || this.lastMergeDialogId != 0 || !zArr[1]) {
                int i10 = this.lastReturnedNum;
                this.lastReturnedNum = this.searchResultMessages.size();
                this.loadingMoreSearchMessages = true;
                searchMessagesInChat(null, this.lastDialogId, this.lastMergeDialogId, this.lastGuid, 1, this.lastReplyMessageId, false, this.lastSearchUser, this.lastSearchChat, false, this.lastReaction);
                this.lastReturnedNum = i10;
            }
        }
    }

    public void loadMusic(long j10, long j11, long j12) {
        getMessagesStorage().getStorageQueue().postRunnable(new l0(this, j10, j11, j12, 1));
    }

    public void loadPinnedMessages(final long j10, final int i10, final int i11) {
        if (this.loadingPinnedMessages.h(j10) >= 0) {
            return;
        }
        this.loadingPinnedMessages.k(Boolean.TRUE, j10);
        final TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.peer = getMessagesController().getInputPeer(j10);
        tL_messages_search.limit = 40;
        tL_messages_search.offset_id = i10;
        tL_messages_search.f22501q = "";
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPinned();
        getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                MediaDataController.this.lambda$loadPinnedMessages$162(i11, tL_messages_search, j10, i10, tLObject, tL_error);
            }
        });
    }

    public void loadPremiumPromo(boolean z10) {
        this.isLoadingPremiumPromo = true;
        if (z10) {
            getMessagesStorage().getStorageQueue().postRunnable(new k7(this, 6));
            return;
        }
        getConnectionsManager().sendRequest(new TLRPC.TL_help_getPremiumPromo(), new p7(this, 3));
    }

    public void loadReactions(boolean z10, Integer num) {
        int i10;
        this.isLoadingReactions = true;
        if (z10) {
            getMessagesStorage().getStorageQueue().postRunnable(new k7(this, 10));
            return;
        }
        TLRPC.TL_messages_getAvailableReactions tL_messages_getAvailableReactions = new TLRPC.TL_messages_getAvailableReactions();
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = this.reactionsUpdateHash;
        }
        tL_messages_getAvailableReactions.hash = i10;
        getConnectionsManager().sendRequest(tL_messages_getAvailableReactions, new p7(this, 4));
    }

    public void loadRecentAndTopReactions(boolean z10) {
        if (!this.loadingRecentReactions) {
            if (!this.loadedRecentReactions || z10) {
                Context context = ApplicationLoader.applicationContext;
                final SharedPreferences sharedPreferences = context.getSharedPreferences("recent_reactions_" + this.currentAccount, 0);
                Context context2 = ApplicationLoader.applicationContext;
                final SharedPreferences sharedPreferences2 = context2.getSharedPreferences("top_reactions_" + this.currentAccount, 0);
                this.recentReactions.clear();
                this.topReactions.clear();
                this.recentReactions.addAll(loadReactionsFromPref(sharedPreferences));
                this.topReactions.addAll(loadReactionsFromPref(sharedPreferences2));
                this.loadingRecentReactions = true;
                this.loadedRecentReactions = true;
                final boolean[] zArr = new boolean[2];
                TLRPC.TL_messages_getRecentReactions tL_messages_getRecentReactions = new TLRPC.TL_messages_getRecentReactions();
                tL_messages_getRecentReactions.hash = sharedPreferences.getLong("hash", 0L);
                tL_messages_getRecentReactions.limit = 50;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getRecentReactions, new RequestDelegate(this) {
                    public final MediaDataController f20429b;

                    {
                        this.f20429b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                this.f20429b.lambda$loadRecentAndTopReactions$236(sharedPreferences, zArr, tLObject, tL_error);
                                return;
                            default:
                                this.f20429b.lambda$loadRecentAndTopReactions$238(sharedPreferences, zArr, tLObject, tL_error);
                                return;
                        }
                    }
                });
                TLRPC.TL_messages_getTopReactions tL_messages_getTopReactions = new TLRPC.TL_messages_getTopReactions();
                tL_messages_getTopReactions.hash = sharedPreferences2.getLong("hash", 0L);
                tL_messages_getTopReactions.limit = 100;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getTopReactions, new RequestDelegate(this) {
                    public final MediaDataController f20429b;

                    {
                        this.f20429b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                this.f20429b.lambda$loadRecentAndTopReactions$236(sharedPreferences2, zArr, tLObject, tL_error);
                                return;
                            default:
                                this.f20429b.lambda$loadRecentAndTopReactions$238(sharedPreferences2, zArr, tLObject, tL_error);
                                return;
                        }
                    }
                });
            }
        }
    }

    public void loadRecents(int r8, boolean r9, boolean r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.loadRecents(int, boolean, boolean, boolean):void");
    }

    public void loadReplyIcons() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.loadReplyIcons():void");
    }

    public void loadReplyMessagesForMessages(java.util.ArrayList<org.telegram.messenger.MessageObject> r22, long r23, int r25, long r26, java.lang.Runnable r28, int r29, org.telegram.messenger.Timer r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.loadReplyMessagesForMessages(java.util.ArrayList, long, int, long, java.lang.Runnable, int, org.telegram.messenger.Timer):void");
    }

    public void loadRestrictedStatusEmojis() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.loadRestrictedStatusEmojis():void");
    }

    public void loadSavedReactions(boolean z10) {
        if (!this.loadingSavedReactions) {
            if (!this.loadedSavedReactions || z10) {
                Context context = ApplicationLoader.applicationContext;
                SharedPreferences sharedPreferences = context.getSharedPreferences("saved_reactions_" + this.currentAccount, 0);
                this.savedReactions.clear();
                this.savedReactions.addAll(loadReactionsFromPref(sharedPreferences));
                this.loadingSavedReactions = true;
                this.loadedSavedReactions = true;
                TLRPC.TL_messages_getDefaultTagReactions tL_messages_getDefaultTagReactions = new TLRPC.TL_messages_getDefaultTagReactions();
                tL_messages_getDefaultTagReactions.hash = sharedPreferences.getLong("hash", 0L);
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getDefaultTagReactions, new x6(this, sharedPreferences, 1));
            }
        }
    }

    public void loadStickers(int i10, boolean z10, boolean z11) {
        loadStickers(i10, z10, z11, false, null);
    }

    public void loadStickersByEmojiOrName(String str, boolean z10, boolean z11) {
        if (!this.loadingDiceStickerSets.contains(str)) {
            if (!z10 || this.diceStickerSetsByEmoji.get(str) == null) {
                this.loadingDiceStickerSets.add(str);
                if (z11) {
                    getMessagesStorage().getStorageQueue().postRunnable(new k8(this, str, z10, 1));
                    return;
                }
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                if (Objects.equals(getUserConfig().premiumGiftsStickerPack, str)) {
                    tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetPremiumGifts();
                } else if (z10) {
                    TLRPC.TL_inputStickerSetDice tL_inputStickerSetDice = new TLRPC.TL_inputStickerSetDice();
                    tL_inputStickerSetDice.emoticon = str;
                    tL_messages_getStickerSet.stickerset = tL_inputStickerSetDice;
                } else {
                    TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                    tL_inputStickerSetShortName.short_name = str;
                    tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                }
                getConnectionsManager().sendRequest(tL_messages_getStickerSet, new u0(this, str, z10, 2));
            }
        }
    }

    public void markFeaturedStickersAsRead(boolean z10, boolean z11) {
        int i10;
        if (!this.unreadStickerSets[z10 ? 1 : 0].isEmpty()) {
            this.unreadStickerSets[z10 ? 1 : 0].clear();
            this.loadFeaturedHash[z10 ? 1 : 0] = calcFeaturedStickersHash(z10, this.featuredStickerSets[z10 ? 1 : 0]);
            NotificationCenter notificationCenter = getNotificationCenter();
            if (z10) {
                i10 = NotificationCenter.featuredEmojiDidLoad;
            } else {
                i10 = NotificationCenter.featuredStickersDidLoad;
            }
            notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
            putFeaturedStickersToCache(z10, this.featuredStickerSets[z10 ? 1 : 0], this.unreadStickerSets[z10 ? 1 : 0], this.loadFeaturedDate[z10 ? 1 : 0], this.loadFeaturedHash[z10 ? 1 : 0], this.loadFeaturedPremium);
            if (z11) {
                getConnectionsManager().sendRequest(new TLRPC.TL_messages_readFeaturedStickers(), new e5(12));
            }
        }
    }

    public void markFeaturedStickersByIdAsRead(boolean z10, long j10) {
        if (this.unreadStickerSets[z10 ? 1 : 0].contains(Long.valueOf(j10)) && !this.readingStickerSets[z10 ? 1 : 0].contains(Long.valueOf(j10))) {
            this.readingStickerSets[z10 ? 1 : 0].add(Long.valueOf(j10));
            TLRPC.TL_messages_readFeaturedStickers tL_messages_readFeaturedStickers = new TLRPC.TL_messages_readFeaturedStickers();
            tL_messages_readFeaturedStickers.f22494id.add(Long.valueOf(j10));
            getConnectionsManager().sendRequest(tL_messages_readFeaturedStickers, new e5(10));
            AndroidUtilities.runOnUIThread(new jh.oa(this, z10, j10, 2), 1000L);
        }
    }

    public void markSetInstalling(long j10, boolean z10) {
        this.uninstalledForceStickerSetsById.remove(Long.valueOf(j10));
        if (z10 && !this.installedForceStickerSetsById.contains(Long.valueOf(j10))) {
            this.installedForceStickerSetsById.add(Long.valueOf(j10));
        }
        if (!z10) {
            this.installedForceStickerSetsById.remove(Long.valueOf(j10));
        }
    }

    public void markSetUninstalling(long j10, boolean z10) {
        this.installedForceStickerSetsById.remove(Long.valueOf(j10));
        if (z10 && !this.uninstalledForceStickerSetsById.contains(Long.valueOf(j10))) {
            this.uninstalledForceStickerSetsById.add(Long.valueOf(j10));
        }
        if (!z10) {
            this.uninstalledForceStickerSetsById.remove(Long.valueOf(j10));
        }
    }

    public void moveStickerSetToTop(long j10, boolean z10, boolean z11) {
        int i10;
        if (z10) {
            i10 = 5;
        } else if (z11) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = getStickerSets(i10);
        if (stickerSets != null) {
            for (int i11 = 0; i11 < stickerSets.size(); i11++) {
                if (stickerSets.get(i11).set.f22419id == j10) {
                    stickerSets.remove(i11);
                    stickerSets.add(0, stickerSets.get(i11));
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i10), Boolean.FALSE);
                    return;
                }
            }
        }
    }

    public void onRingtoneUploaded(String str, TLRPC.Document document, boolean z10) {
        this.ringtoneUploaderHashMap.remove(str);
        ef.e eVar = this.ringtoneDataStore;
        ArrayList arrayList = eVar.f5901e;
        boolean z11 = true;
        if (z10) {
            int i10 = 0;
            while (true) {
                if (i10 < arrayList.size()) {
                    if (((ef.d) arrayList.get(i10)).d && str.equals(((ef.d) arrayList.get(i10)).f5894b)) {
                        arrayList.remove(i10);
                        break;
                    }
                    i10++;
                } else {
                    z11 = false;
                    break;
                }
            }
        } else {
            int i11 = 0;
            while (true) {
                if (i11 < arrayList.size()) {
                    if (((ef.d) arrayList.get(i11)).d && str.equals(((ef.d) arrayList.get(i11)).f5894b)) {
                        ((ef.d) arrayList.get(i11)).d = false;
                        ((ef.d) arrayList.get(i11)).f5893a = document;
                        break;
                    }
                    i11++;
                } else {
                    z11 = false;
                    break;
                }
            }
            if (z11) {
                eVar.h();
            }
        }
        if (z11) {
            NotificationCenter.getInstance(eVar.f5900c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
        }
    }

    public void portSavedSearchResults(int i10, kg.q0 q0Var, String str, ArrayList<MessageObject> arrayList, ArrayList<MessageObject> arrayList2, int i11, int i12, boolean z10) {
        this.lastReaction = q0Var;
        this.lastSearchQuery = str;
        boolean[] zArr = this.messagesSearchEndReached;
        zArr[0] = z10;
        zArr[1] = true;
        this.searchServerResultMessages.clear();
        this.searchServerResultMessages.addAll(arrayList2);
        this.searchLocalResultMessages.clear();
        this.searchLocalResultMessages.addAll(arrayList);
        updateSearchResults();
        int[] iArr = this.messagesSearchCount;
        iArr[0] = i12;
        iArr[1] = 0;
        this.lastReturnedNum = i11;
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatSearchResultsAvailable, Integer.valueOf(i10), 0, Integer.valueOf(getMask()), Long.valueOf(getUserConfig().getClientUserId()), Integer.valueOf(this.lastReturnedNum), Integer.valueOf(getSearchCount()), Boolean.TRUE);
    }

    public void preloadDefaultReactions() {
        if (this.reactionsList != null && !this.reactionsCacheGenerated && LiteMode.isEnabled(8200) && this.currentAccount == UserConfig.selectedAccount) {
            this.reactionsCacheGenerated = true;
            ArrayList arrayList = new ArrayList(this.reactionsList);
            int min = Math.min(arrayList.size(), 10);
            for (int i10 = 0; i10 < min; i10++) {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList.get(i10);
                preloadImage(ImageLocation.getForDocument(tL_availableReaction.activate_animation), 0);
                preloadImage(ImageLocation.getForDocument(tL_availableReaction.appear_animation), 0);
            }
            for (int i11 = 0; i11 < min; i11++) {
                preloadImage(ImageLocation.getForDocument(((TLRPC.TL_availableReaction) arrayList.get(i11)).effect_animation), 0);
            }
        }
    }

    public void preloadImage(ImageLocation imageLocation, int i10) {
        getFileLoader().loadFile(imageLocation, null, null, i10, 11);
    }

    public void preloadPremiumPreviewStickers() {
        int i10;
        if (!this.previewStickersLoading && this.premiumPreviewStickers.isEmpty()) {
            TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
            tL_messages_getStickers.emoticon = Emoji.fixEmoji("⭐") + Emoji.fixEmoji("⭐");
            tL_messages_getStickers.hash = 0L;
            this.previewStickersLoading = true;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getStickers, new p7(this, 2));
            return;
        }
        for (int i11 = 0; i11 < Math.min(this.premiumPreviewStickers.size(), 3); i11++) {
            ArrayList<TLRPC.Document> arrayList = this.premiumPreviewStickers;
            if (i11 == 2) {
                i10 = arrayList.size() - 1;
            } else {
                i10 = i11;
            }
            TLRPC.Document document = arrayList.get(i10);
            if (MessageObject.isPremiumSticker(document)) {
                ImageReceiver imageReceiver = new ImageReceiver();
                imageReceiver.setAllowLoadingOnAttachedOnly(false);
                imageReceiver.setImage(ImageLocation.getForDocument(document), null, null, "webp", null, 1);
                ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
                ImageReceiver imageReceiver2 = new ImageReceiver();
                imageReceiver2.setAllowLoadingOnAttachedOnly(false);
                imageReceiver2.setImage(ImageLocation.getForDocument(MessageObject.getPremiumStickerAnimation(document), document), (String) null, (ImageLocation) null, (String) null, "tgs", (Object) null, 1);
                ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver2);
            }
        }
    }

    public void preloadStickerSetThumb(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.StickerSet stickerSet;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        ArrayList<TLRPC.Document> arrayList;
        if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(stickerSet.thumbs, 90)) == null || (arrayList = tL_messages_stickerSet.documents) == null || arrayList.isEmpty()) {
            return;
        }
        loadStickerSetThumbInternal(closestPhotoSizeWithSize, tL_messages_stickerSet, arrayList.get(0), tL_messages_stickerSet.set.thumb_version);
    }

    public boolean processDeletedMessage(int i10, long[] jArr) {
        MessageObject messageObject;
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            if (i11 < this.deletedFromResultMessages.size()) {
                if (this.deletedFromResultMessages.get(i11).getId() == i10) {
                    messageObject = this.deletedFromResultMessages.get(i11);
                    break;
                }
                i11++;
            } else {
                messageObject = null;
                break;
            }
        }
        if (messageObject != null && messageObject.getDialogId() == getUserConfig().getClientUserId()) {
            boolean processDeletedReactionTags = getMessagesController().processDeletedReactionTags(messageObject.messageOwner);
            jArr[0] = MessageObject.getSavedDialogId(getUserConfig().getClientUserId(), messageObject.messageOwner);
            z10 = processDeletedReactionTags;
        }
        this.deletedFromResultMessages.remove(messageObject);
        return z10;
    }

    public void processLoadedMenuBots(TLRPC.TL_attachMenuBots tL_attachMenuBots, long j10, int i10, boolean z10) {
        boolean z11;
        if (tL_attachMenuBots != null && i10 != 0) {
            this.attachMenuBots = tL_attachMenuBots;
            this.menuBotsUpdateHash = j10;
        }
        SharedPreferences.Editor edit = getMessagesController().getMainSettings().edit();
        this.menuBotsUpdateDate = i10;
        edit.putInt("menuBotsUpdateDate", i10).commit();
        this.menuBotsUpdatedLocal = true;
        if (tL_attachMenuBots != null) {
            if (!z10) {
                getMessagesStorage().putUsersAndChats(tL_attachMenuBots.users, null, true, true);
            }
            getMessagesController().putUsers(tL_attachMenuBots.users, z10);
            AndroidUtilities.runOnUIThread(new k7(this, 1));
            z11 = false;
            for (int i11 = 0; i11 < tL_attachMenuBots.bots.size(); i11++) {
                if (tL_attachMenuBots.bots.get(i11) instanceof TLRPC.TL_attachMenuBot_layer162) {
                    tL_attachMenuBots.bots.get(i11).show_in_attach_menu = true;
                    z11 = true;
                }
            }
        } else {
            z11 = false;
        }
        if (!z10) {
            putMenuBotsToCache(tL_attachMenuBots, j10, i10);
        } else if (z11 || Math.abs((System.currentTimeMillis() / 1000) - i10) >= 3600) {
            loadAttachMenuBots(false, true);
        }
    }

    public void processLoadedPremiumPromo(TLRPC.TL_help_premiumPromo tL_help_premiumPromo, int i10, boolean z10) {
        if (tL_help_premiumPromo != null) {
            this.premiumPromo = tL_help_premiumPromo;
            this.premiumPromoUpdateDate = i10;
            getMessagesController().putUsers(tL_help_premiumPromo.users, z10);
            AndroidUtilities.runOnUIThread(new k7(this, 7));
        }
        if (!z10) {
            if (tL_help_premiumPromo != null) {
                putPremiumPromoToCache(tL_help_premiumPromo, i10);
            }
            this.isLoadingPremiumPromo = false;
        } else if (tL_help_premiumPromo != null && Math.abs((System.currentTimeMillis() / 1000) - i10) < 86400) {
            this.isLoadingPremiumPromo = false;
        } else {
            loadPremiumPromo(false);
        }
    }

    public void processLoadedReactions(List<TLRPC.TL_availableReaction> list, int i10, int i11, boolean z10) {
        if (list != null && i11 != 0) {
            this.reactionsList.clear();
            this.reactionsMap.clear();
            this.enabledReactionsList.clear();
            this.reactionsList.addAll(list);
            for (int i12 = 0; i12 < this.reactionsList.size(); i12++) {
                this.reactionsList.get(i12).positionInList = i12;
                this.reactionsMap.put(this.reactionsList.get(i12).reaction, this.reactionsList.get(i12));
                if (!this.reactionsList.get(i12).inactive) {
                    this.enabledReactionsList.add(this.reactionsList.get(i12));
                }
            }
            this.reactionsUpdateHash = i10;
        }
        this.reactionsUpdateDate = i11;
        if (list != null) {
            AndroidUtilities.runOnUIThread(new k7(this, 3));
        }
        this.isLoadingReactions = false;
        if (!z10) {
            putReactionsToCache(list, i10, i11);
            return;
        }
        Math.abs((System.currentTimeMillis() / 1000) - i11);
        loadReactions(false, Integer.valueOf(i10));
    }

    public void processLoadedRecentDocuments(int i10, ArrayList<TLRPC.Document> arrayList, boolean z10, int i11, boolean z11) {
        int i12;
        ArrayList<TLRPC.Document> arrayList2;
        boolean z12;
        int i13;
        if (arrayList != null) {
            i12 = i10;
            arrayList2 = arrayList;
            z12 = z10;
            i13 = i11;
            getMessagesStorage().getStorageQueue().postRunnable(new q9(this, z12, i12, arrayList2, z11, i13));
        } else {
            i12 = i10;
            arrayList2 = arrayList;
            z12 = z10;
            i13 = i11;
        }
        if (i13 == 0) {
            AndroidUtilities.runOnUIThread(new m9(this, z12, i12, arrayList2));
        }
    }

    public void processStickerSetInstallResultArchive(org.telegram.ui.ActionBar.o2 o2Var, boolean z10, int i10, TLRPC.TL_messages_stickerSetInstallResultArchive tL_messages_stickerSetInstallResultArchive) {
        org.telegram.ui.ActionBar.o2 o2Var2;
        int size = tL_messages_stickerSetInstallResultArchive.sets.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.installedStickerSetsById.l(tL_messages_stickerSetInstallResultArchive.sets.get(i11).set.f22419id);
        }
        loadArchivedStickersCount(i10, false);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needAddArchivedStickers, tL_messages_stickerSetInstallResultArchive.sets);
        if (o2Var != null && o2Var.getParentActivity() != null) {
            Activity parentActivity = o2Var.getParentActivity();
            if (z10) {
                o2Var2 = o2Var;
            } else {
                o2Var2 = null;
            }
            ArrayList<TLRPC.StickerSetCovered> arrayList = tL_messages_stickerSetInstallResultArchive.sets;
            ?? alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            TLRPC.StickerSetCovered stickerSetCovered = arrayList.get(0);
            boolean z11 = stickerSetCovered.set.masks;
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
            if (z11) {
                alertDialog$Builder.d = 1;
                c2Var.N = LocaleController.getString(R.string.ArchivedMasksAlertTitle);
            } else {
                alertDialog$Builder.d = 0;
                c2Var.N = LocaleController.getString(R.string.ArchivedStickersAlertTitle);
            }
            alertDialog$Builder.f31801c = new ArrayList(arrayList);
            alertDialog$Builder.f31802e = o2Var2;
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            alertDialog$Builder.n(linearLayout);
            TextView textView = new TextView(parentActivity);
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
            textView.setGravity(i7.f6.y());
            textView.setTextSize(1, 16.0f);
            textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(23.0f), 0);
            if (stickerSetCovered.set.masks) {
                textView.setText(LocaleController.getString(R.string.ArchivedMasksAlertInfo));
            } else {
                textView.setText(LocaleController.getString(R.string.ArchivedStickersAlertInfo));
            }
            linearLayout.addView(textView, i7.f6.n(-2, -2));
            jl0 jl0Var = new jl0(parentActivity, null);
            c2Var.getContext();
            jl0Var.setLayoutManager(new f2.j0(1, false));
            jl0Var.setAdapter(new ox0(alertDialog$Builder, parentActivity));
            jl0Var.setVerticalScrollBarEnabled(false);
            jl0Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            jl0Var.setGlowColor(-657673);
            linearLayout.addView(jl0Var, i7.f6.k(0.0f, 10.0f, 0.0f, 0.0f, -1, -2));
            alertDialog$Builder.h(LocaleController.getString(R.string.Close), new xo0(5));
            if (o2Var2 != null) {
                alertDialog$Builder.k(LocaleController.getString(R.string.Settings), new cv(alertDialog$Builder, 23));
            }
            o2Var.showDialog(c2Var);
        }
    }

    public void pushDraftVoiceMessage(long j10, long j11, DraftVoice draftVoice) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("2voicedrafts_" + this.currentAccount, 0);
        long hash = Objects.hash(Long.valueOf(j10), Long.valueOf(j11));
        String str = hash + "";
        if (draftVoice == null) {
            sharedPreferences.edit().remove(str).apply();
            this.draftVoices.l(hash);
            return;
        }
        sharedPreferences.edit().putString(str, draftVoice.toString()).apply();
        this.draftVoices.k(draftVoice, hash);
    }

    public void pushRecentEmojiStatus(TLRPC.EmojiStatus emojiStatus) {
        if (this.emojiStatuses[0] != null) {
            if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
                long j10 = ((TLRPC.TL_emojiStatus) emojiStatus).document_id;
                int i10 = 0;
                while (i10 < this.emojiStatuses[0].size()) {
                    if ((this.emojiStatuses[0].get(i10) instanceof TLRPC.TL_emojiStatus) && ((TLRPC.TL_emojiStatus) this.emojiStatuses[0].get(i10)).document_id == j10) {
                        this.emojiStatuses[0].remove(i10);
                        i10--;
                    }
                    i10++;
                }
            }
            this.emojiStatuses[0].add(0, emojiStatus);
            while (this.emojiStatuses[0].size() > 50) {
                a4.w.t(1, this.emojiStatuses[0]);
            }
            TL_account.TL_emojiStatuses tL_emojiStatuses = new TL_account.TL_emojiStatuses();
            tL_emojiStatuses.hash = this.emojiStatusesHash[0];
            tL_emojiStatuses.statuses = this.emojiStatuses[0];
            updateEmojiStatuses(0, tL_emojiStatuses);
        }
    }

    public void putBotInfo(long j10, TL_bots.BotInfo botInfo) {
        if (botInfo == null) {
            return;
        }
        HashMap<String, TL_bots.BotInfo> hashMap = this.botInfos;
        hashMap.put(botInfo.user_id + "_" + j10, botInfo);
        getMessagesStorage().getStorageQueue().postRunnable(new c4(this, botInfo, j10, 6));
    }

    public void putBotKeyboard(MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        SQLiteCursor queryFinalized;
        SQLitePreparedStatement executeFast;
        if (topicKey != null) {
            try {
                int i10 = 0;
                if (topicKey.topicId != 0) {
                    SQLiteDatabase database = getMessagesStorage().getDatabase();
                    Locale locale = Locale.US;
                    long j10 = topicKey.dialogId;
                    long j11 = topicKey.topicId;
                    queryFinalized = database.queryFinalized("SELECT mid FROM bot_keyboard_topics WHERE uid = " + j10 + " AND tid = " + j11, new Object[0]);
                } else {
                    SQLiteDatabase database2 = getMessagesStorage().getDatabase();
                    Locale locale2 = Locale.US;
                    long j12 = topicKey.dialogId;
                    queryFinalized = database2.queryFinalized("SELECT mid FROM bot_keyboard WHERE uid = " + j12, new Object[0]);
                }
                if (queryFinalized.next()) {
                    i10 = queryFinalized.intValue(0);
                }
                queryFinalized.dispose();
                if (i10 >= message.f22413id && !MessageObject.isEphemeralMessageId(i10) && !MessageObject.isEphemeralMessageId(message.f22413id)) {
                    return;
                }
                if (topicKey.topicId != 0) {
                    executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO bot_keyboard_topics VALUES(?, ?, ?, ?)");
                } else {
                    executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO bot_keyboard VALUES(?, ?, ?)");
                }
                executeFast.requery();
                MessageObject.normalizeFlags(message);
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                message.serializeToStream(nativeByteBuffer);
                if (topicKey.topicId != 0) {
                    executeFast.bindLong(1, topicKey.dialogId);
                    executeFast.bindLong(2, topicKey.topicId);
                    executeFast.bindInteger(3, message.f22413id);
                    executeFast.bindByteBuffer(4, nativeByteBuffer);
                } else {
                    executeFast.bindLong(1, topicKey.dialogId);
                    executeFast.bindInteger(2, message.f22413id);
                    executeFast.bindByteBuffer(3, nativeByteBuffer);
                }
                executeFast.step();
                nativeByteBuffer.reuse();
                executeFast.dispose();
                AndroidUtilities.runOnUIThread(new y6(this, topicKey, message));
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    public void putGroupStickerSet(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.groupStickerSets.k(tL_messages_stickerSet, tL_messages_stickerSet.set.f22419id);
    }

    public void putStickerSet(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        putStickerSet(tL_messages_stickerSet, true);
    }

    public void removeInline(long j10) {
        removeInline(j10, false);
    }

    public void removeMessageFromResults(int i10) {
        int i11 = 0;
        int i12 = 0;
        while (i12 < this.searchResultMessages.size()) {
            if (i10 == this.searchResultMessages.get(i12).getId()) {
                this.deletedFromResultMessages.add(this.searchResultMessages.remove(i12));
                i12--;
            }
            i12++;
        }
        int i13 = 0;
        while (i13 < this.searchServerResultMessages.size()) {
            if (i10 == this.searchServerResultMessages.get(i13).getId()) {
                this.searchServerResultMessages.remove(i13);
                i13--;
            }
            i13++;
        }
        while (i11 < this.searchLocalResultMessages.size()) {
            if (i10 == this.searchLocalResultMessages.get(i11).getId()) {
                this.searchLocalResultMessages.remove(i11);
                i11--;
            }
            i11++;
        }
    }

    public void removeMultipleStickerSets(Context context, org.telegram.ui.ActionBar.o2 o2Var, ArrayList<TLRPC.TL_messages_stickerSet> arrayList) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        int i10;
        if (arrayList != null && !arrayList.isEmpty() && (tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) j7.l1.i(1, arrayList)) != null) {
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet.masks) {
                i10 = 1;
            } else if (stickerSet.emojis) {
                i10 = 5;
            } else {
                i10 = 0;
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                arrayList.get(i11).set.archived = false;
            }
            int[] iArr = new int[arrayList.size()];
            for (int i12 = 0; i12 < this.stickerSets[i10].size(); i12++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.stickerSets[i10].get(i12);
                int i13 = 0;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        break;
                    } else if (tL_messages_stickerSet2.set.f22419id == arrayList.get(i13).set.f22419id) {
                        iArr[i13] = i12;
                        this.stickerSets[i10].remove(i12);
                        this.stickerSetsById.l(tL_messages_stickerSet2.set.f22419id);
                        this.installedStickerSetsById.l(tL_messages_stickerSet2.set.f22419id);
                        this.stickerSetsByName.remove(tL_messages_stickerSet2.set.short_name);
                        break;
                    } else {
                        i13++;
                    }
                }
            }
            ArrayList<TLRPC.TL_messages_stickerSet> arrayList2 = this.stickerSets[i10];
            int i14 = this.loadDate[i10];
            long[] jArr = this.loadHash;
            int i15 = i10;
            long calcStickersHash = calcStickersHash(arrayList2);
            jArr[i15] = calcStickersHash;
            putStickersToCache(i15, arrayList2, i14, calcStickersHash);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i15), Boolean.TRUE);
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                markSetUninstalling(arrayList.get(i16).set.f22419id, true);
            }
            sw0 sw0Var = new sw0(context, tL_messages_stickerSet, arrayList.size(), 0, null, o2Var.getResourceProvider());
            boolean[] zArr = new boolean[1];
            org.telegram.ui.Components.kc kcVar = new org.telegram.ui.Components.kc(context, null, false);
            kcVar.f30007a = new bg.j3(this, zArr, arrayList, i15, iArr, 4);
            kcVar.f30008b = new jf.j0(this, zArr, arrayList, context, o2Var, i15);
            sw0Var.setButton(kcVar);
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                this.removingStickerSetsUndos.k(new d1(kcVar, 25), arrayList.get(i17).set.f22419id);
            }
            org.telegram.ui.Components.mc.g(o2Var, sw0Var, 2750).j();
        }
    }

    public void removePeer(long j10) {
        for (int i10 = 0; i10 < this.hints.size(); i10++) {
            if (this.hints.get(i10).peer.user_id == j10) {
                this.hints.remove(i10);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadHints, new Object[0]);
                TLRPC.TL_contacts_resetTopPeerRating tL_contacts_resetTopPeerRating = new TLRPC.TL_contacts_resetTopPeerRating();
                tL_contacts_resetTopPeerRating.category = new TLRPC.TL_topPeerCategoryCorrespondents();
                tL_contacts_resetTopPeerRating.peer = getMessagesController().getInputPeer(j10);
                deletePeer(j10, 0);
                getConnectionsManager().sendRequest(tL_contacts_resetTopPeerRating, new e5(11));
                return;
            }
        }
    }

    public void removeRecentGif(TLRPC.Document document) {
        int size = this.recentGifs.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            } else if (this.recentGifs.get(i10).f22398id == document.f22398id) {
                this.recentGifs.remove(i10);
                break;
            } else {
                i10++;
            }
        }
        TLRPC.TL_messages_saveGif tL_messages_saveGif = new TLRPC.TL_messages_saveGif();
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_messages_saveGif.f22499id = tL_inputDocument;
        tL_inputDocument.f22404id = document.f22398id;
        tL_inputDocument.access_hash = document.access_hash;
        byte[] bArr = document.file_reference;
        tL_inputDocument.file_reference = bArr;
        if (bArr == null) {
            tL_inputDocument.file_reference = new byte[0];
        }
        tL_messages_saveGif.unsave = true;
        getConnectionsManager().sendRequest(tL_messages_saveGif, new t1(3, this, tL_messages_saveGif));
        getMessagesStorage().getStorageQueue().postRunnable(new b8(0, this, document));
    }

    public void removeWebapp(long j10) {
        for (int i10 = 0; i10 < this.webapps.size(); i10++) {
            if (this.webapps.get(i10).peer.user_id == j10) {
                this.webapps.remove(i10);
                TLRPC.TL_contacts_resetTopPeerRating tL_contacts_resetTopPeerRating = new TLRPC.TL_contacts_resetTopPeerRating();
                tL_contacts_resetTopPeerRating.category = new TLRPC.TL_topPeerCategoryBotsApp();
                tL_contacts_resetTopPeerRating.peer = getMessagesController().getInputPeer(j10);
                getConnectionsManager().sendRequest(tL_contacts_resetTopPeerRating, new e5(13));
                deletePeer(j10, 2);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadWebappsHints, new Object[0]);
                return;
            }
        }
    }

    public void reorderStickers(int i10, ArrayList<Long> arrayList, boolean z10) {
        Collections.sort(this.stickerSets[i10], new l7(arrayList, 1));
        this.loadHash[i10] = calcStickersHash(this.stickerSets[i10]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i10), Boolean.valueOf(z10));
    }

    public void replaceStickerSet(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        boolean z10;
        boolean z11;
        int i10;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) this.stickerSetsById.f(tL_messages_stickerSet.set.f22419id);
        String str = (String) this.diceEmojiStickerSetsById.f(tL_messages_stickerSet.set.f22419id);
        if (str != null) {
            this.diceStickerSetsByEmoji.put(str, tL_messages_stickerSet);
            putDiceStickersToCache(str, tL_messages_stickerSet, (int) (System.currentTimeMillis() / 1000));
        }
        if (tL_messages_stickerSet2 == null) {
            tL_messages_stickerSet2 = this.stickerSetsByName.get(tL_messages_stickerSet.set.short_name);
        }
        if (tL_messages_stickerSet2 == null && (tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) this.groupStickerSets.f(tL_messages_stickerSet.set.f22419id)) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (tL_messages_stickerSet2 != null) {
            if ("AnimatedEmojies".equals(tL_messages_stickerSet.set.short_name)) {
                tL_messages_stickerSet2.documents = tL_messages_stickerSet.documents;
                tL_messages_stickerSet2.packs = tL_messages_stickerSet.packs;
                tL_messages_stickerSet2.set = tL_messages_stickerSet.set;
                AndroidUtilities.runOnUIThread(new f7(this, tL_messages_stickerSet, 4));
                z11 = true;
            } else {
                a0.h hVar = new a0.h();
                int size = tL_messages_stickerSet.documents.size();
                for (int i11 = 0; i11 < size; i11++) {
                    TLRPC.Document document = tL_messages_stickerSet.documents.get(i11);
                    hVar.k(document, document.f22398id);
                }
                int size2 = tL_messages_stickerSet2.documents.size();
                z11 = false;
                for (int i12 = 0; i12 < size2; i12++) {
                    TLRPC.Document document2 = (TLRPC.Document) hVar.f(tL_messages_stickerSet2.documents.get(i12).f22398id);
                    if (document2 != null) {
                        tL_messages_stickerSet2.documents.set(i12, document2);
                        z11 = true;
                    }
                }
            }
            if (z11) {
                if (z10) {
                    putSetToCache(tL_messages_stickerSet2);
                    return;
                }
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                if (stickerSet.masks) {
                    i10 = 1;
                } else if (stickerSet.emojis) {
                    i10 = 5;
                } else {
                    i10 = 0;
                }
                putStickersToCache(i10, this.stickerSets[i10], this.loadDate[i10], this.loadHash[i10]);
                if ("AnimatedEmojies".equals(tL_messages_stickerSet.set.short_name)) {
                    putStickersToCache(4, this.stickerSets[4], this.loadDate[4], this.loadHash[4]);
                }
            }
        }
    }

    public void saveDraft(long j10, int i10, CharSequence charSequence, ArrayList<TLRPC.MessageEntity> arrayList, TLRPC.Message message, boolean z10, long j11) {
        saveDraft(j10, i10, charSequence, arrayList, message, null, null, j11, z10, false);
    }

    public boolean saveToRingtones(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        if (this.ringtoneDataStore.c(document.f22398id) != null) {
            return true;
        }
        if (document.size > MessagesController.getInstance(this.currentAccount).ringtoneSizeMax) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax / 1024)));
            return false;
        }
        for (int i10 = 0; i10 < document.attributes.size(); i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && documentAttribute.duration > MessagesController.getInstance(this.currentAccount).ringtoneDurationMax) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax)));
                return false;
            }
        }
        TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        saveringtone.f22602id = tL_inputDocument;
        tL_inputDocument.f22404id = document.f22398id;
        tL_inputDocument.file_reference = document.file_reference;
        tL_inputDocument.access_hash = document.access_hash;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(saveringtone, new t1(4, this, document));
        return true;
    }

    public boolean searchEndReached() {
        boolean[] zArr = this.messagesSearchEndReached;
        if ((!zArr[0] || this.lastMergeDialogId != 0 || !zArr[1]) && !this.loadingSearchLocal && !this.loadedPredirectedSearchLocal) {
            return false;
        }
        return true;
    }

    public void searchMessagesInChat(String str, long j10, long j11, int i10, int i11, long j12, TLRPC.User user, TLRPC.Chat chat, kg.q0 q0Var) {
        searchMessagesInChat(str, j10, j11, i10, i11, j12, false, user, chat, true, q0Var);
    }

    public void searchStickerSets(boolean z10, String str, Utilities.Callback<ArrayList<TLRPC.StickerSetCovered>> callback) {
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        if (z10) {
            TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
            tL_messages_searchEmojiStickerSets.f22502q = str;
            tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
        } else {
            TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
            tL_messages_searchStickerSets2.f22504q = str;
            tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
        }
        getConnectionsManager().sendRequestTyped(tL_messages_searchStickerSets, new Object(), new f4(1, callback));
    }

    public SearchStickersKey searchStickers(boolean z10, String str, String str2, Utilities.Callback<ArrayList<TLRPC.Document>> callback) {
        return searchStickers(z10, str, str2, callback, false);
    }

    public void setDoubleTapReaction(String str) {
        MessagesController.getEmojiSettings(this.currentAccount).edit().putString("reaction_on_double_tap", str).apply();
        this.doubleTapReaction = str;
    }

    public void setDraftFolderId(long j10, int i10) {
        this.draftsFolderIds.k(Integer.valueOf(i10), j10);
    }

    public void setDraftVoiceRegion(long j10, long j11, float f9, float f10) {
        DraftVoice draftVoice = getDraftVoice(j10, j11);
        if (draftVoice != null) {
            if (Math.abs(draftVoice.left - f9) >= 0.001f || Math.abs(draftVoice.right - f10) >= 0.001f) {
                draftVoice.left = f9;
                draftVoice.right = f10;
                Context context = ApplicationLoader.applicationContext;
                SharedPreferences.Editor edit = context.getSharedPreferences("2voicedrafts_" + this.currentAccount, 0).edit();
                edit.putString(Objects.hash(Long.valueOf(j10), Long.valueOf(j11)) + "", draftVoice.toString()).apply();
            }
        }
    }

    public void setPlaceholderImage(org.telegram.ui.Components.t9 t9Var, String str, String str2, String str3) {
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName.short_name = str;
        getInstance(this.currentAccount).getStickerSet(tL_inputStickerSetShortName, 0, false, new g2(str2, t9Var, str3, 3));
    }

    public void setSearchedPosition(int i10) {
        if (i10 >= 0 && i10 < this.searchResultMessages.size()) {
            this.lastReturnedNum = i10;
        }
    }

    public void storeTempStickerSet(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.StickerSet stickerSet;
        if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null) {
            this.stickerSetsById.k(tL_messages_stickerSet, stickerSet.f22419id);
            String str = tL_messages_stickerSet.set.short_name;
            if (str != null) {
                this.stickerSetsByName.put(str.toLowerCase(), tL_messages_stickerSet);
            }
        }
    }

    public CharSequence substring(CharSequence charSequence, int i10, int i11) {
        if (charSequence instanceof SpannableStringBuilder) {
            return charSequence.subSequence(i10, i11);
        }
        if (charSequence instanceof SpannedString) {
            return ((SpannedString) charSequence).subSequence(i10, i11);
        }
        return TextUtils.substring(charSequence, i10, i11);
    }

    public void toggleDraftVoiceOnce(long j10, long j11, boolean z10) {
        DraftVoice draftVoice = getDraftVoice(j10, j11);
        if (draftVoice != null && draftVoice.once != z10) {
            draftVoice.once = z10;
            Context context = ApplicationLoader.applicationContext;
            SharedPreferences.Editor edit = context.getSharedPreferences("2voicedrafts_" + this.currentAccount, 0).edit();
            edit.putString(Objects.hash(Long.valueOf(j10), Long.valueOf(j11)) + "", draftVoice.toString()).apply();
        }
    }

    public void toggleStickerSet(Context context, TLObject tLObject, int i10, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, boolean z11) {
        toggleStickerSet(context, tLObject, i10, o2Var, z10, z11, null, true);
    }

    public void toggleStickerSets(ArrayList<TLRPC.StickerSet> arrayList, final int i10, final int i11, final org.telegram.ui.ActionBar.o2 o2Var, final boolean z10) {
        int size = arrayList.size();
        ArrayList<TLRPC.InputStickerSet> arrayList2 = new ArrayList<>(size);
        int i12 = 0;
        while (true) {
            boolean z11 = true;
            if (i12 >= size) {
                break;
            }
            TLRPC.StickerSet stickerSet = arrayList.get(i12);
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
            tL_inputStickerSetID.f22412id = stickerSet.f22419id;
            arrayList2.add(tL_inputStickerSetID);
            if (i11 != 0) {
                if (i11 != 1) {
                    z11 = false;
                }
                stickerSet.archived = z11;
            }
            int size2 = this.stickerSets[i10].size();
            int i13 = 0;
            while (true) {
                if (i13 < size2) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.stickerSets[i10].get(i13);
                    if (tL_messages_stickerSet.set.f22419id == tL_inputStickerSetID.f22412id) {
                        this.stickerSets[i10].remove(i13);
                        if (i11 == 2) {
                            this.stickerSets[i10].add(0, tL_messages_stickerSet);
                        } else {
                            this.stickerSetsById.l(tL_messages_stickerSet.set.f22419id);
                            this.installedStickerSetsById.l(tL_messages_stickerSet.set.f22419id);
                            this.stickerSetsByName.remove(tL_messages_stickerSet.set.short_name);
                        }
                    } else {
                        i13++;
                    }
                }
            }
            i12++;
        }
        this.loadHash[i10] = calcStickersHash(this.stickerSets[i10]);
        putStickersToCache(i10, this.stickerSets[i10], this.loadDate[i10], this.loadHash[i10]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i10), Boolean.TRUE);
        TLRPC.TL_messages_toggleStickerSets tL_messages_toggleStickerSets = new TLRPC.TL_messages_toggleStickerSets();
        tL_messages_toggleStickerSets.stickersets = arrayList2;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    tL_messages_toggleStickerSets.unarchive = true;
                }
            } else {
                tL_messages_toggleStickerSets.archive = true;
            }
        } else {
            tL_messages_toggleStickerSets.uninstall = true;
        }
        getConnectionsManager().sendRequest(tL_messages_toggleStickerSets, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                MediaDataController.this.lambda$toggleStickerSets$119(i11, o2Var, z10, i10, tLObject, tL_error);
            }
        });
    }

    public void uninstallShortcut(long r8, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.uninstallShortcut(long, int):void");
    }

    public void updateAttachMenuBotsInCache() {
        if (getAttachMenuBots() != null) {
            putMenuBotsToCache(getAttachMenuBots(), this.menuBotsUpdateHash, this.menuBotsUpdateDate);
        }
    }

    public void updateBotInfo(long j10, TL_update.TL_updateBotCommands tL_updateBotCommands) {
        HashMap<String, TL_bots.BotInfo> hashMap = this.botInfos;
        TL_bots.BotInfo botInfo = hashMap.get(tL_updateBotCommands.bot_id + "_" + j10);
        if (botInfo != null) {
            botInfo.commands = tL_updateBotCommands.commands;
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botInfoDidLoad, botInfo, 0);
        }
        getMessagesStorage().getStorageQueue().postRunnable(new c4(this, tL_updateBotCommands, j10, 5));
    }

    public void uploadRingtone(String str) {
        if (this.ringtoneUploaderHashMap.containsKey(str)) {
            return;
        }
        this.ringtoneUploaderHashMap.put(str, new ef.f(str, this.currentAccount));
        ef.e eVar = this.ringtoneDataStore;
        eVar.getClass();
        ?? obj = new Object();
        obj.f5894b = str;
        int i10 = eVar.d;
        eVar.d = i10 + 1;
        obj.f5895c = i10;
        obj.d = true;
        eVar.f5901e.add(obj);
    }

    public void verifyAnimatedStickerMessage(TLRPC.Message message) {
        verifyAnimatedStickerMessage(message, false);
    }

    public static class SearchStickersResult {
        public final ArrayList<TLRPC.Document> documents;
        public Integer next_offset;

        private SearchStickersResult() {
            this.documents = new ArrayList<>();
        }

        public void apply(TLRPC.TL_messages_foundStickers tL_messages_foundStickers) {
            Integer num;
            this.documents.addAll(tL_messages_foundStickers.stickers);
            if ((tL_messages_foundStickers.flags & 1) != 0) {
                num = Integer.valueOf(tL_messages_foundStickers.next_offset);
            } else {
                num = null;
            }
            this.next_offset = num;
        }

        public SearchStickersResult(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static void addTextStyleRuns(TLRPC.DraftMessage draftMessage, Spannable spannable, int i10) {
        addTextStyleRuns(draftMessage.entities, draftMessage.message, spannable, i10);
    }

    public static long calcDocumentsHash(ArrayList<TLRPC.Document> arrayList, int i10) {
        long j10 = 0;
        if (arrayList == null) {
            return 0L;
        }
        int min = Math.min(i10, arrayList.size());
        for (int i11 = 0; i11 < min; i11++) {
            TLRPC.Document document = arrayList.get(i11);
            if (document != null) {
                j10 = calcHash(j10, document.f22398id);
            }
        }
        return j10;
    }

    private void increaseInlineRating(long j10, boolean z10) {
        TLRPC.TL_topPeer tL_topPeer;
        if (getUserConfig().suggestContacts) {
            UserConfig userConfig = getUserConfig();
            int i10 = z10 ? userConfig.botGuestRatingLoadTime : userConfig.botRatingLoadTime;
            int max = i10 != 0 ? Math.max(1, ((int) (System.currentTimeMillis() / 1000)) - i10) : 60;
            ArrayList<TLRPC.TL_topPeer> arrayList = z10 ? this.guestBots : this.inlineBots;
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList.size()) {
                    tL_topPeer = null;
                    break;
                }
                tL_topPeer = arrayList.get(i11);
                if (tL_topPeer.peer.user_id == j10) {
                    break;
                }
                i11++;
            }
            if (tL_topPeer == null) {
                tL_topPeer = new TLRPC.TL_topPeer();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_topPeer.peer = tL_peerUser;
                tL_peerUser.user_id = j10;
                arrayList.add(tL_topPeer);
            }
            tL_topPeer.rating = Math.exp(max / getMessagesController().ratingDecay) + tL_topPeer.rating;
            Collections.sort(arrayList, new q(12));
            if (arrayList.size() > 20) {
                a4.w.t(1, arrayList);
            }
            savePeer(j10, z10 ? 3 : 1, tL_topPeer.rating);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(z10 ? NotificationCenter.reloadGuestBotHints : NotificationCenter.reloadInlineHints, new Object[0]);
        }
    }

    private void processLoadStickersResponse(int i10, TLRPC.TL_messages_allStickers tL_messages_allStickers, Runnable runnable) {
        final TLRPC.TL_messages_allStickers tL_messages_allStickers2;
        final a0.h hVar;
        final int i11;
        final ArrayList<TLRPC.TL_messages_stickerSet> arrayList = new ArrayList<>();
        if (tL_messages_allStickers.sets.isEmpty()) {
            processLoadedStickers(i10, arrayList, false, (int) (System.currentTimeMillis() / 1000), tL_messages_allStickers.hash2, runnable);
            return;
        }
        MediaDataController mediaDataController = this;
        int i12 = i10;
        a0.h hVar2 = new a0.h();
        int i13 = 0;
        while (i13 < tL_messages_allStickers.sets.size()) {
            final TLRPC.StickerSet stickerSet = tL_messages_allStickers.sets.get(i13);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) mediaDataController.stickerSetsById.f(stickerSet.f22419id);
            if (tL_messages_stickerSet != null) {
                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
                if (stickerSet2.hash == stickerSet.hash) {
                    stickerSet2.archived = stickerSet.archived;
                    stickerSet2.installed = stickerSet.installed;
                    stickerSet2.official = stickerSet.official;
                    hVar2.k(tL_messages_stickerSet, stickerSet2.f22419id);
                    arrayList.add(tL_messages_stickerSet);
                    if (hVar2.m() == tL_messages_allStickers.sets.size()) {
                        mediaDataController.processLoadedStickers(i12, arrayList, false, (int) (System.currentTimeMillis() / 1000), tL_messages_allStickers.hash2);
                    }
                    tL_messages_allStickers2 = tL_messages_allStickers;
                    hVar = hVar2;
                    i11 = i13;
                    i13 = i11 + 1;
                    mediaDataController = this;
                    hVar2 = hVar;
                    tL_messages_allStickers = tL_messages_allStickers2;
                }
            }
            arrayList.add(null);
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_messages_getStickerSet.stickerset = tL_inputStickerSetID;
            tL_inputStickerSetID.f22412id = stickerSet.f22419id;
            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
            tL_messages_allStickers2 = tL_messages_allStickers;
            hVar = hVar2;
            i11 = i13;
            final int i14 = i12;
            i12 = i14;
            getConnectionsManager().sendRequest(tL_messages_getStickerSet, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    MediaDataController.this.lambda$processLoadStickersResponse$74(arrayList, i11, hVar, stickerSet, tL_messages_allStickers2, i14, tLObject, tL_error);
                }
            });
            i13 = i11 + 1;
            mediaDataController = this;
            hVar2 = hVar;
            tL_messages_allStickers = tL_messages_allStickers2;
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    private void processLoadedStickers(int i10, ArrayList<TLRPC.TL_messages_stickerSet> arrayList, boolean z10, int i11, long j10, Runnable runnable) {
        AndroidUtilities.runOnUIThread(new p8(this, i10, 0));
        Utilities.stageQueue.postRunnable(new q8(this, z10, arrayList, i11, j10, i10, runnable));
    }

    private void removeInline(long j10, boolean z10) {
        ArrayList<TLRPC.TL_topPeer> arrayList = z10 ? this.guestBots : this.inlineBots;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (arrayList.get(i10).peer.user_id == j10) {
                arrayList.remove(i10);
                TLRPC.TL_contacts_resetTopPeerRating tL_contacts_resetTopPeerRating = new TLRPC.TL_contacts_resetTopPeerRating();
                tL_contacts_resetTopPeerRating.category = new TLRPC.TL_topPeerCategoryBotsInline();
                tL_contacts_resetTopPeerRating.peer = getMessagesController().getInputPeer(j10);
                getConnectionsManager().sendRequest(tL_contacts_resetTopPeerRating, new e5(9));
                deletePeer(j10, z10 ? 3 : 1);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(z10 ? NotificationCenter.reloadGuestBotHints : NotificationCenter.reloadInlineHints, new Object[0]);
                return;
            }
        }
    }

    public void clearBotKeyboard(long j10) {
        AndroidUtilities.runOnUIThread(new e7(this, j10, 2));
    }

    public void fetchNewEmojiKeywords(String[] strArr, boolean z10) {
        if (strArr == null) {
            return;
        }
        for (String str : strArr) {
            if (TextUtils.isEmpty(str) || this.currentFetchingEmoji.get(str) != null) {
                return;
            }
            if (z10 && this.fetchedEmoji.contains(str)) {
                return;
            }
            this.currentFetchingEmoji.put(str, Boolean.TRUE);
            getMessagesStorage().getStorageQueue().postRunnable(new d8(this, str, 3));
        }
    }

    public void getEmojiSuggestions(String[] strArr, String str, boolean z10, KeywordResultCallback keywordResultCallback, CountDownLatch countDownLatch, boolean z11) {
        getEmojiSuggestions(strArr, str, z10, keywordResultCallback, countDownLatch, z11, false, false, null);
    }

    public ArrayList<TLRPC.MessageEntity> getEntities(CharSequence[] charSequenceArr, boolean z10, boolean z11) {
        int i10;
        int i11;
        int min;
        int indexOf;
        int i12;
        int i13;
        String str;
        int i14;
        ArrayList<TLRPC.MessageEntity> arrayList = null;
        if (charSequenceArr != null && charSequenceArr[0] != null) {
            int i15 = -1;
            boolean z12 = false;
            int i16 = 0;
            loop0: while (true) {
                i10 = -1;
                while (true) {
                    if (!z11) {
                        break loop0;
                    }
                    indexOf = TextUtils.indexOf(charSequenceArr[0], !z12 ? "`" : "```", i16);
                    if (indexOf == i15) {
                        break loop0;
                    } else if (i10 == i15) {
                        z12 = charSequenceArr[0].length() - indexOf > 2 && charSequenceArr[0].charAt(indexOf + 1) == '`' && charSequenceArr[0].charAt(indexOf + 2) == '`';
                        i10 = indexOf;
                        i16 = indexOf + (z12 ? 3 : 1);
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                        }
                        for (int i17 = (z12 ? 3 : 1) + indexOf; i17 < charSequenceArr[0].length() && charSequenceArr[0].charAt(i17) == '`'; i17++) {
                            indexOf++;
                        }
                        i12 = (z12 ? 3 : 1) + indexOf;
                        if (z12) {
                            char charAt = i10 > 0 ? charSequenceArr[0].charAt(i10 - 1) : (char) 0;
                            int i18 = (charAt == ' ' || charAt == '\n') ? 1 : 0;
                            int i19 = i10 + 3;
                            int indexOf2 = TextUtils.indexOf(charSequenceArr[0], '\n', i19);
                            if (indexOf2 < 0 || indexOf2 - i19 <= 0) {
                                str = "";
                            } else {
                                str = charSequenceArr[0].toString().substring(i19, indexOf2);
                            }
                            CharSequence substring = substring(charSequenceArr[0], 0, i10 - i18);
                            int length = str.length() + i19 + (!str.isEmpty());
                            if (length >= 0 && length < charSequenceArr[0].length() && length <= indexOf) {
                                CharSequence substring2 = substring(charSequenceArr[0], length, indexOf);
                                int i20 = indexOf + 3;
                                char charAt2 = i20 < charSequenceArr[0].length() ? charSequenceArr[0].charAt(i20) : (char) 0;
                                CharSequence charSequence = charSequenceArr[0];
                                CharSequence substring3 = substring(charSequence, i20 + ((charAt2 == ' ' || charAt2 == '\n') ? 1 : 0), charSequence.length());
                                if (substring.length() != 0) {
                                    substring = AndroidUtilities.concat(substring, "\n");
                                } else {
                                    i18 = 1;
                                }
                                if (substring3.length() > 0 && substring3.charAt(0) != '\n') {
                                    substring3 = AndroidUtilities.concat("\n", substring3);
                                }
                                if (substring2.length() <= 0 || substring2.charAt(substring2.length() - 1) != '\n') {
                                    i14 = 0;
                                } else {
                                    substring2 = substring(substring2, 0, substring2.length() - 1);
                                    i14 = 1;
                                }
                                if (!TextUtils.isEmpty(substring2)) {
                                    if (substring2.length() > 1 && substring2.charAt(0) == '\n') {
                                        substring2 = substring2.subSequence(1, substring2.length());
                                        indexOf--;
                                    }
                                    charSequenceArr[0] = AndroidUtilities.concat(substring, substring2, substring3);
                                    TLRPC.MessageEntity tL_messageEntityPre = new TLRPC.TL_messageEntityPre();
                                    tL_messageEntityPre.offset = (i18 ^ 1) + i10;
                                    tL_messageEntityPre.length = ((((indexOf - i10) - 3) - (str.length() + (!str.isEmpty()))) + (i18 ^ 1)) - i14;
                                    tL_messageEntityPre.language = (TextUtils.isEmpty(str) || str.trim().length() == 0) ? "" : "";
                                    arrayList.add(tL_messageEntityPre);
                                    i12 -= 6;
                                }
                            }
                            i16 = i12;
                            i15 = -1;
                        } else {
                            i13 = i10 + 1;
                            if (i13 == indexOf) {
                                break;
                            }
                            CharSequence charSequence2 = charSequenceArr[0];
                            if (!(charSequence2 instanceof Spanned) || ((CodeHighlighting.Span[]) ((Spanned) charSequence2).getSpans(Utilities.clamp(i10, charSequence2.length(), 0), Utilities.clamp(i13, charSequenceArr[0].length(), 0), CodeHighlighting.Span.class)).length <= 0) {
                                break;
                            }
                            i16 = i12;
                            i15 = -1;
                        }
                    }
                }
                CharSequence substring4 = substring(charSequenceArr[0], 0, i10);
                CharSequence substring5 = substring(charSequenceArr[0], i13, indexOf);
                CharSequence charSequence3 = charSequenceArr[0];
                charSequenceArr[0] = AndroidUtilities.concat(substring4, substring5, substring(charSequence3, indexOf + 1, charSequence3.length()));
                TLRPC.MessageEntity tL_messageEntityCode = new TLRPC.TL_messageEntityCode();
                tL_messageEntityCode.offset = i10;
                tL_messageEntityCode.length = (indexOf - i10) - 1;
                arrayList.add(tL_messageEntityCode);
                i12 -= 2;
                i16 = i12;
                i15 = -1;
                z12 = false;
            }
            if (i10 != i15 && z12) {
                CharSequence substring6 = substring(charSequenceArr[0], 0, i10);
                CharSequence charSequence4 = charSequenceArr[0];
                charSequenceArr[0] = AndroidUtilities.concat(substring6, substring(charSequence4, i10 + 2, charSequence4.length()));
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                TLRPC.MessageEntity tL_messageEntityCode2 = new TLRPC.TL_messageEntityCode();
                tL_messageEntityCode2.offset = i10;
                tL_messageEntityCode2.length = 1;
                arrayList.add(tL_messageEntityCode2);
            }
            CharSequence charSequence5 = charSequenceArr[0];
            if (charSequence5 instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence5;
                i01[] i01VarArr = (i01[]) spanned.getSpans(0, charSequence5.length(), i01.class);
                if (i01VarArr != null && i01VarArr.length > 0) {
                    for (i01 i01Var : i01VarArr) {
                        int spanStart = spanned.getSpanStart(i01Var);
                        int spanEnd = spanned.getSpanEnd(i01Var);
                        if (!checkInclusion(spanStart, arrayList, false) && !checkInclusion(spanEnd, arrayList, true) && !checkIntersection(spanStart, spanEnd, arrayList)) {
                            if (arrayList == null) {
                                arrayList = new ArrayList<>();
                            }
                            addStyle(i01Var.f29294b.f29024a, spanStart, spanEnd, arrayList);
                        }
                    }
                }
                d51[] d51VarArr = (d51[]) spanned.getSpans(0, charSequenceArr[0].length(), d51.class);
                if (d51VarArr != null && d51VarArr.length > 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    for (int i21 = 0; i21 < d51VarArr.length; i21++) {
                        TLRPC.TL_inputMessageEntityMentionName tL_inputMessageEntityMentionName = new TLRPC.TL_inputMessageEntityMentionName();
                        TLRPC.InputUser inputUser = getMessagesController().getInputUser(Utilities.parseLong(d51VarArr[i21].getURL()).longValue());
                        tL_inputMessageEntityMentionName.user_id = inputUser;
                        if (inputUser != null) {
                            tL_inputMessageEntityMentionName.offset = spanned.getSpanStart(d51VarArr[i21]);
                            tL_inputMessageEntityMentionName.length = Math.min(spanned.getSpanEnd(d51VarArr[i21]), charSequenceArr[0].length()) - tL_inputMessageEntityMentionName.offset;
                            if (charSequenceArr[0].charAt((i11 + min) - 1) == ' ') {
                                tL_inputMessageEntityMentionName.length--;
                            }
                            arrayList.add(tL_inputMessageEntityMentionName);
                        }
                    }
                }
                c51[] c51VarArr = (c51[]) spanned.getSpans(0, charSequenceArr[0].length(), c51.class);
                if (c51VarArr != null && c51VarArr.length > 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    for (int i22 = 0; i22 < c51VarArr.length; i22++) {
                        TLRPC.MessageEntity tL_messageEntityTextUrl = new TLRPC.TL_messageEntityTextUrl();
                        tL_messageEntityTextUrl.offset = spanned.getSpanStart(c51VarArr[i22]);
                        tL_messageEntityTextUrl.length = Math.min(spanned.getSpanEnd(c51VarArr[i22]), charSequenceArr[0].length()) - tL_messageEntityTextUrl.offset;
                        tL_messageEntityTextUrl.url = c51VarArr[i22].getURL();
                        arrayList.add(tL_messageEntityTextUrl);
                        h01 h01Var = c51VarArr[i22].f27311a;
                        if (h01Var != null) {
                            int i23 = h01Var.f29024a;
                            int i24 = tL_messageEntityTextUrl.offset;
                            addStyle(i23, i24, tL_messageEntityTextUrl.length + i24, arrayList);
                        }
                    }
                }
                org.telegram.ui.Components.y5[] y5VarArr = (org.telegram.ui.Components.y5[]) spanned.getSpans(0, charSequenceArr[0].length(), org.telegram.ui.Components.y5.class);
                if (y5VarArr != null && y5VarArr.length > 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    ArrayList<TLRPC.MessageEntity> arrayList2 = arrayList;
                    for (org.telegram.ui.Components.y5 y5Var : y5VarArr) {
                        if (y5Var != null) {
                            try {
                                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                                tL_messageEntityCustomEmoji.offset = spanned.getSpanStart(y5Var);
                                tL_messageEntityCustomEmoji.length = Math.min(spanned.getSpanEnd(y5Var), charSequenceArr[0].length()) - tL_messageEntityCustomEmoji.offset;
                                tL_messageEntityCustomEmoji.document_id = y5Var.getDocumentId();
                                tL_messageEntityCustomEmoji.document = y5Var.document;
                                arrayList2.add(tL_messageEntityCustomEmoji);
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                        }
                    }
                    arrayList = arrayList2;
                }
                CodeHighlighting.Span[] spanArr = (CodeHighlighting.Span[]) spanned.getSpans(0, charSequenceArr[0].length(), CodeHighlighting.Span.class);
                if (spanArr != null && spanArr.length > 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    ArrayList<TLRPC.MessageEntity> arrayList3 = arrayList;
                    for (CodeHighlighting.Span span : spanArr) {
                        if (span != null) {
                            try {
                                TLRPC.MessageEntity tL_messageEntityPre2 = new TLRPC.TL_messageEntityPre();
                                tL_messageEntityPre2.offset = spanned.getSpanStart(span);
                                tL_messageEntityPre2.length = Math.min(spanned.getSpanEnd(span), charSequenceArr[0].length()) - tL_messageEntityPre2.offset;
                                tL_messageEntityPre2.language = span.lng;
                                arrayList3.add(tL_messageEntityPre2);
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                        }
                    }
                    arrayList = arrayList3;
                }
                qi0[] qi0VarArr = (qi0[]) spanned.getSpans(0, charSequenceArr[0].length(), qi0.class);
                if (qi0VarArr != null && qi0VarArr.length > 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    ArrayList<TLRPC.MessageEntity> arrayList4 = arrayList;
                    for (qi0 qi0Var : qi0VarArr) {
                        if (qi0Var != null) {
                            try {
                                TLRPC.MessageEntity tL_messageEntityBlockquote = new TLRPC.TL_messageEntityBlockquote();
                                tL_messageEntityBlockquote.offset = spanned.getSpanStart(qi0Var);
                                tL_messageEntityBlockquote.length = Math.min(spanned.getSpanEnd(qi0Var), charSequenceArr[0].length()) - tL_messageEntityBlockquote.offset;
                                tL_messageEntityBlockquote.collapsed = qi0Var.f31959e;
                                arrayList4.add(tL_messageEntityBlockquote);
                            } catch (Exception e12) {
                                FileLog.e(e12);
                            }
                        }
                    }
                    arrayList = arrayList4;
                }
                d10[] d10VarArr = (d10[]) spanned.getSpans(0, charSequenceArr[0].length(), d10.class);
                if (d10VarArr != null && d10VarArr.length > 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    ArrayList<TLRPC.MessageEntity> arrayList5 = arrayList;
                    for (d10 d10Var : d10VarArr) {
                        if (d10Var != null) {
                            try {
                                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
                                tL_messageEntityFormattedDate.offset = spanned.getSpanStart(d10Var);
                                tL_messageEntityFormattedDate.length = Math.min(spanned.getSpanEnd(d10Var), charSequenceArr[0].length()) - tL_messageEntityFormattedDate.offset;
                                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate2 = d10Var.f27632b;
                                tL_messageEntityFormattedDate.relative = tL_messageEntityFormattedDate2.relative;
                                tL_messageEntityFormattedDate.short_time = tL_messageEntityFormattedDate2.short_time;
                                tL_messageEntityFormattedDate.long_time = tL_messageEntityFormattedDate2.long_time;
                                tL_messageEntityFormattedDate.long_date = tL_messageEntityFormattedDate2.long_date;
                                tL_messageEntityFormattedDate.short_date = tL_messageEntityFormattedDate2.short_date;
                                tL_messageEntityFormattedDate.day_of_week = tL_messageEntityFormattedDate2.day_of_week;
                                tL_messageEntityFormattedDate.date = tL_messageEntityFormattedDate2.date;
                                arrayList5.add(tL_messageEntityFormattedDate);
                            } catch (Exception e13) {
                                FileLog.e(e13);
                            }
                        }
                    }
                    arrayList = arrayList5;
                }
                if (spanned instanceof Spannable) {
                    Spannable spannable = (Spannable) spanned;
                    AndroidUtilities.addLinksSafe(spannable, 1, false, false);
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, charSequenceArr[0].length(), URLSpan.class);
                    if (uRLSpanArr != null && uRLSpanArr.length > 0) {
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                        }
                        for (int i25 = 0; i25 < uRLSpanArr.length; i25++) {
                            URLSpan uRLSpan = uRLSpanArr[i25];
                            if (!(uRLSpan instanceof c51) && !(uRLSpan instanceof d51) && !(uRLSpan instanceof d10)) {
                                TLRPC.MessageEntity tL_messageEntityUrl = new TLRPC.TL_messageEntityUrl();
                                tL_messageEntityUrl.offset = spanned.getSpanStart(uRLSpanArr[i25]);
                                tL_messageEntityUrl.length = Math.min(spanned.getSpanEnd(uRLSpanArr[i25]), charSequenceArr[0].length()) - tL_messageEntityUrl.offset;
                                tL_messageEntityUrl.url = uRLSpanArr[i25].getURL();
                                arrayList.add(tL_messageEntityUrl);
                                spannable.removeSpan(uRLSpanArr[i25]);
                            }
                        }
                    }
                }
            }
            CharSequence charSequence6 = charSequenceArr[0];
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (z11) {
                charSequence6 = parsePattern(parsePattern(parsePattern(charSequence6, BOLD_PATTERN, arrayList, new b(22)), ITALIC_PATTERN, arrayList, new b(23)), SPOILER_PATTERN, arrayList, new b(24));
                if (z10) {
                    charSequence6 = parsePattern(charSequence6, STRIKE_PATTERN, arrayList, new b(25));
                }
            }
            while (charSequence6.length() > 0 && (charSequence6.charAt(0) == '\n' || charSequence6.charAt(0) == ' ')) {
                int i26 = 1;
                charSequence6 = charSequence6.subSequence(1, charSequence6.length());
                int i27 = 0;
                while (i27 < arrayList.size()) {
                    TLRPC.MessageEntity messageEntity = arrayList.get(i27);
                    int i28 = messageEntity.offset;
                    if (i28 == 0) {
                        messageEntity.length -= i26;
                    }
                    messageEntity.offset = Math.max(0, i28 - 1);
                    i27++;
                    i26 = 1;
                }
            }
            while (charSequence6.length() > 0 && (charSequence6.charAt(charSequence6.length() - 1) == '\n' || charSequence6.charAt(charSequence6.length() - 1) == ' ')) {
                charSequence6 = charSequence6.subSequence(0, charSequence6.length() - 1);
                for (int i29 = 0; i29 < arrayList.size(); i29++) {
                    TLRPC.MessageEntity messageEntity2 = arrayList.get(i29);
                    if (messageEntity2.offset + messageEntity2.length > charSequence6.length()) {
                        messageEntity2.length--;
                    }
                }
            }
            charSequenceArr[0] = charSequence6;
        }
        return arrayList;
    }

    public ArrayList<TLRPC.Document> getRecentStickers(int i10, boolean z10) {
        ArrayList<TLRPC.Document> arrayList = this.recentStickers[i10];
        if (i10 == 7) {
            return new ArrayList<>(this.recentStickers[i10]);
        }
        ArrayList<TLRPC.Document> arrayList2 = new ArrayList<>(arrayList.subList(0, Math.min(arrayList.size(), 20)));
        if (z10 && !arrayList2.isEmpty()) {
            arrayList2.add(0, new TLRPC.TL_documentEmpty());
        }
        return arrayList2;
    }

    public void installShortcut(long r20, int r22, org.telegram.messenger.Utilities.Callback<java.lang.Boolean> r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.installShortcut(long, int, org.telegram.messenger.Utilities$Callback):void");
    }

    public boolean isStickerPackInstalled(long j10, boolean z10) {
        if (this.installedStickerSetsById.h(j10) >= 0 || (z10 && this.installedForceStickerSetsById.contains(Long.valueOf(j10)))) {
            return (z10 && this.uninstalledForceStickerSetsById.contains(Long.valueOf(j10))) ? false : true;
        }
        return false;
    }

    public void loadAttachMenuBots(boolean z10, boolean z11, Runnable runnable) {
        this.isLoadingMenuBots = true;
        if (z10) {
            getMessagesStorage().getStorageQueue().postRunnable(new k7(this, 13));
            return;
        }
        TLRPC.TL_messages_getAttachMenuBots tL_messages_getAttachMenuBots = new TLRPC.TL_messages_getAttachMenuBots();
        tL_messages_getAttachMenuBots.hash = z11 ? 0L : this.menuBotsUpdateHash;
        getConnectionsManager().sendRequest(tL_messages_getAttachMenuBots, new t1(5, this, runnable));
    }

    public void loadBotInfo(long j10, long j11, boolean z10, int i10, Utilities.Callback<TL_bots.BotInfo> callback) {
        if (z10) {
            HashMap<String, TL_bots.BotInfo> hashMap = this.botInfos;
            TL_bots.BotInfo botInfo = hashMap.get(j10 + "_" + j11);
            if (botInfo != null) {
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botInfoDidLoad, botInfo, Integer.valueOf(i10));
                return;
            }
        }
        getMessagesStorage().getStorageQueue().postRunnable(new s9(this, j10, j11, callback, i10, 0));
    }

    public void loadBotKeyboard(MessagesStorage.TopicKey topicKey, boolean z10) {
        TLRPC.Message message = this.botKeyboards.get(topicKey);
        if (message != null) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botKeyboardDidLoad, message, topicKey);
        } else {
            getMessagesStorage().getStorageQueue().postRunnable(new p6(this, topicKey, z10, 3));
        }
    }

    public void loadStickers(int i10, boolean z10, boolean z11, boolean z12) {
        loadStickers(i10, z10, z11, z12, null);
    }

    public void preloadImage(ImageReceiver imageReceiver, ImageLocation imageLocation, String str) {
        if (LiteMode.isEnabled(8200)) {
            imageReceiver.setUniqKeyPrefix("preload");
            imageReceiver.setFileLoadingPriority(0);
            imageReceiver.setImage(imageLocation, str, null, null, 0, 11);
        }
    }

    public void putStickerSet(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z10) {
        TLRPC.StickerSet stickerSet;
        int i10;
        TLRPC.StickerSet stickerSet2;
        if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null) {
            return;
        }
        this.stickerSetsById.k(tL_messages_stickerSet, stickerSet.f22419id);
        if (!TextUtils.isEmpty(tL_messages_stickerSet.set.short_name)) {
            this.stickerSetsByName.put(tL_messages_stickerSet.set.short_name.toLowerCase(), tL_messages_stickerSet);
        }
        int i11 = 0;
        while (true) {
            ArrayList<TLRPC.TL_messages_stickerSet>[] arrayListArr = this.stickerSets;
            if (i11 >= arrayListArr.length) {
                break;
            }
            ArrayList<TLRPC.TL_messages_stickerSet> arrayList = arrayListArr[i11];
            if (arrayList != null) {
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayList.get(i12);
                    if (tL_messages_stickerSet2 != null && (stickerSet2 = tL_messages_stickerSet2.set) != null && stickerSet2.f22419id == tL_messages_stickerSet.set.f22419id) {
                        arrayList.set(i12, tL_messages_stickerSet);
                    }
                }
            }
            i11++;
        }
        if (this.groupStickerSets.d(tL_messages_stickerSet.set.f22419id)) {
            this.groupStickerSets.k(tL_messages_stickerSet, tL_messages_stickerSet.set.f22419id);
        }
        saveStickerSetIntoCache(tL_messages_stickerSet);
        TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet.set;
        if (stickerSet3.masks) {
            i10 = 1;
        } else {
            i10 = stickerSet3.emojis ? 5 : 0;
        }
        if (z10) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i10), Boolean.TRUE);
        }
    }

    public void saveDraft(long j10, long j11, CharSequence charSequence, ArrayList<TLRPC.MessageEntity> arrayList, TLRPC.Message message, jn jnVar, TLRPC.SuggestedPost suggestedPost, long j12, boolean z10, boolean z11) {
        saveDraft(j10, j11, charSequence, arrayList, message, jnVar, suggestedPost, j12, z10, z11, null);
    }

    public void searchMessagesInChat(java.lang.String r32, final long r33, final long r35, final int r37, final int r38, final long r39, boolean r41, final org.telegram.tgnet.TLRPC.User r42, final org.telegram.tgnet.TLRPC.Chat r43, final boolean r44, final kg.q0 r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.searchMessagesInChat(java.lang.String, long, long, int, int, long, boolean, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, boolean, kg.q0):void");
    }

    public SearchStickersKey searchStickers(boolean z10, String str, String str2, Utilities.Callback<ArrayList<TLRPC.Document>> callback, boolean z11) {
        if (callback == null) {
            return null;
        }
        SearchStickersKey searchStickersKey = new SearchStickersKey(z10, str, str2);
        SearchStickersResult searchStickersResult = this.searchStickerResults.get(searchStickersKey);
        if ((searchStickersResult == null || (searchStickersResult.next_offset != null && z11)) && !this.loadingSearchStickersKeys.containsKey(searchStickersKey)) {
            this.loadingSearchStickersKeys.put(searchStickersKey, 0);
            getInstance(this.currentAccount).getEmojiSuggestions(new String[]{str}, str2, true, new c8(this, searchStickersKey, searchStickersResult, callback), false);
            return searchStickersKey;
        } else if (searchStickersResult != null) {
            callback.run(searchStickersResult.documents);
            return searchStickersKey;
        } else {
            callback.run(new ArrayList<>());
            return searchStickersKey;
        }
    }

    public void toggleStickerSet(Context context, TLObject tLObject, int i10, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, boolean z11, Runnable runnable, boolean z12) {
        toggleStickerSet(context, tLObject, i10, o2Var, null, z10, z11, runnable, z12);
    }

    public void verifyAnimatedStickerMessage(TLRPC.Message message, boolean z10) {
        if (message == null) {
            return;
        }
        TLRPC.Document document = MessageObject.getDocument(message);
        String stickerSetName = MessageObject.getStickerSetName(document);
        if (TextUtils.isEmpty(stickerSetName)) {
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.stickerSetsByName.get(stickerSetName);
        if (tL_messages_stickerSet == null) {
            if (z10) {
                AndroidUtilities.runOnUIThread(new f0(this, message, stickerSetName, 28));
                return;
            } else {
                lambda$verifyAnimatedStickerMessage$68(message, stickerSetName);
                return;
            }
        }
        int size = tL_messages_stickerSet.documents.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.Document document2 = tL_messages_stickerSet.documents.get(i10);
            if (document2.f22398id == document.f22398id && document2.dc_id == document.dc_id) {
                message.stickerVerified = 1;
                return;
            }
        }
    }

    public static void addTextStyleRuns(MessageObject messageObject, Spannable spannable, int i10) {
        addTextStyleRuns(messageObject.messageOwner.entities, messageObject.messageText, spannable, i10);
    }

    public void getEmojiSuggestions(String[] strArr, String str, boolean z10, KeywordResultCallback keywordResultCallback, CountDownLatch countDownLatch, boolean z11, boolean z12, boolean z13, Integer num) {
        getEmojiSuggestions(strArr, str, z10, keywordResultCallback, countDownLatch, z11, z12, z13, false, num, false);
    }

    public boolean isStickerPackInstalled(String str) {
        return this.stickerSetsByName.containsKey(str);
    }

    public void loadStickers(int i10, boolean z10, boolean z11, boolean z12, Utilities.Callback<ArrayList<TLRPC.TL_messages_stickerSet>> callback) {
        long j10;
        TLRPC.TL_messages_getMaskStickers tL_messages_getMaskStickers;
        if (this.loadingStickers[i10]) {
            if (z12) {
                this.scheduledLoadStickers[i10] = new v4(this, i10, z11, callback, 2);
                return;
            } else if (callback != null) {
                callback.run(null);
                return;
            } else {
                return;
            }
        }
        if (i10 == 3) {
            if (this.featuredStickerSets[0].isEmpty() || !getMessagesController().preloadFeaturedStickers) {
                if (callback != null) {
                    callback.run(null);
                    return;
                }
                return;
            }
        } else if (i10 == 6) {
            if (this.featuredStickerSets[1].isEmpty() || !getMessagesController().preloadFeaturedStickers) {
                if (callback != null) {
                    callback.run(null);
                    return;
                }
                return;
            }
        } else if (i10 != 4) {
            loadArchivedStickersCount(i10, z10);
        }
        this.loadingStickers[i10] = true;
        if (z10) {
            getMessagesStorage().getStorageQueue().postRunnable(new r4(this, i10, callback, 10));
        } else if (i10 == 3 || i10 == 6) {
            char c3 = i10 != 6 ? (char) 0 : (char) 1;
            TLRPC.TL_messages_allStickers tL_messages_allStickers = new TLRPC.TL_messages_allStickers();
            tL_messages_allStickers.hash2 = this.loadFeaturedHash[c3];
            int size = this.featuredStickerSets[c3].size();
            for (int i11 = 0; i11 < size; i11++) {
                tL_messages_allStickers.sets.add(this.featuredStickerSets[c3].get(i11).set);
            }
            processLoadStickersResponse(i10, tL_messages_allStickers, new t7(3, callback));
        } else if (i10 == 4) {
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
            tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetAnimatedEmoji();
            getConnectionsManager().sendRequest(tL_messages_getStickerSet, new ya(this, i10, callback, 3));
        } else {
            if (i10 == 0) {
                TLRPC.TL_messages_getAllStickers tL_messages_getAllStickers = new TLRPC.TL_messages_getAllStickers();
                j10 = z11 ? 0L : this.loadHash[i10];
                tL_messages_getAllStickers.hash = j10;
                tL_messages_getMaskStickers = tL_messages_getAllStickers;
            } else if (i10 == 5) {
                TLRPC.TL_messages_getEmojiStickers tL_messages_getEmojiStickers = new TLRPC.TL_messages_getEmojiStickers();
                j10 = z11 ? 0L : this.loadHash[i10];
                tL_messages_getEmojiStickers.hash = j10;
                tL_messages_getMaskStickers = tL_messages_getEmojiStickers;
            } else {
                TLRPC.TL_messages_getMaskStickers tL_messages_getMaskStickers2 = new TLRPC.TL_messages_getMaskStickers();
                j10 = z11 ? 0L : this.loadHash[i10];
                tL_messages_getMaskStickers2.hash = j10;
                tL_messages_getMaskStickers = tL_messages_getMaskStickers2;
            }
            getConnectionsManager().sendRequest(tL_messages_getMaskStickers, new jh.u(this, i10, callback, j10, 4));
        }
    }

    public void saveDraft(long j10, long j11, CharSequence charSequence, ArrayList<TLRPC.MessageEntity> arrayList, TLRPC.Message message, jn jnVar, TLRPC.SuggestedPost suggestedPost, long j12, boolean z10, boolean z11, TL_iv.RichMessage richMessage) {
        TLRPC.DraftMessage tL_draftMessage;
        TLRPC.InputReplyTo inputReplyTo;
        TLRPC.Message message2 = (getMessagesController().isForum(j10) && j11 == 0) ? null : message;
        if (TextUtils.isEmpty(charSequence) && message2 == null && richMessage == null) {
            tL_draftMessage = new TLRPC.TL_draftMessageEmpty();
        } else {
            tL_draftMessage = new TLRPC.TL_draftMessage();
        }
        tL_draftMessage.rich_message = richMessage;
        tL_draftMessage.date = (int) (System.currentTimeMillis() / 1000);
        tL_draftMessage.message = charSequence == null ? "" : charSequence.toString();
        tL_draftMessage.no_webpage = z10;
        if (j12 != 0) {
            tL_draftMessage.flags |= 128;
            tL_draftMessage.effect = j12;
        }
        if (message2 != null) {
            TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
            tL_draftMessage.reply_to = tL_inputReplyToMessage;
            tL_draftMessage.flags |= 16;
            tL_inputReplyToMessage.reply_to_msg_id = message2.f22413id;
            if (jnVar != null) {
                String str = jnVar.f39596i;
                tL_inputReplyToMessage.quote_text = str;
                if (str != null) {
                    tL_inputReplyToMessage.flags |= 20;
                    tL_inputReplyToMessage.quote_offset = jnVar.f39591b;
                }
                ArrayList<TLRPC.MessageEntity> arrayList2 = jnVar.f39597j;
                tL_inputReplyToMessage.quote_entities = arrayList2;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    tL_draftMessage.reply_to.quote_entities = new ArrayList<>(tL_draftMessage.reply_to.quote_entities);
                    tL_draftMessage.reply_to.flags |= 8;
                }
                MessageObject messageObject = jnVar.f39590a;
                if (messageObject != null && messageObject.messageOwner != null) {
                    TLRPC.Peer peer = getMessagesController().getPeer(j10);
                    TLRPC.Peer peer2 = jnVar.f39590a.messageOwner.peer_id;
                    if (peer != null && !MessageObject.peersEqual(peer, peer2)) {
                        TLRPC.InputReplyTo inputReplyTo2 = tL_draftMessage.reply_to;
                        inputReplyTo2.flags |= 2;
                        inputReplyTo2.reply_to_peer_id = getMessagesController().getInputPeer(peer2);
                    }
                }
            } else if (j10 != MessageObject.getDialogId(message2)) {
                TLRPC.InputReplyTo inputReplyTo3 = tL_draftMessage.reply_to;
                inputReplyTo3.flags |= 2;
                inputReplyTo3.reply_to_peer_id = getMessagesController().getInputPeer(getMessagesController().getPeer(MessageObject.getDialogId(message2)));
            }
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            tL_draftMessage.entities = arrayList;
            tL_draftMessage.flags |= 8;
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        if (ChatObject.isMonoForum(chat) && ChatObject.canManageMonoForum(this.currentAccount, chat)) {
            tL_draftMessage.flags |= 16;
            TLRPC.InputReplyTo inputReplyTo4 = tL_draftMessage.reply_to;
            if (inputReplyTo4 == null) {
                TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                tL_draftMessage.reply_to = tL_inputReplyToMonoForum;
                tL_inputReplyToMonoForum.monoforum_peer_id = getMessagesController().getInputPeer(j11);
            } else {
                inputReplyTo4.monoforum_peer_id = getMessagesController().getInputPeer(j11);
                tL_draftMessage.reply_to.flags |= 32;
            }
        }
        if (suggestedPost != null) {
            tL_draftMessage.suggested_post = suggestedPost;
        }
        a0.h hVar = (a0.h) this.drafts.f(j10);
        TLRPC.DraftMessage draftMessage = hVar == null ? null : (TLRPC.DraftMessage) hVar.f(j11);
        if (!z11) {
            if (draftMessage != null) {
                if (draftMessage.message.equals(tL_draftMessage.message) && replyToEquals(draftMessage.reply_to, tL_draftMessage.reply_to) && suggestedPostEquals(draftMessage.suggested_post, tL_draftMessage.suggested_post) && richMessageEquals(draftMessage.rich_message, tL_draftMessage.rich_message) && draftMessage.no_webpage == tL_draftMessage.no_webpage && draftMessage.effect == tL_draftMessage.effect) {
                    return;
                }
            } else if (TextUtils.isEmpty(tL_draftMessage.message) && (((inputReplyTo = tL_draftMessage.reply_to) == null || inputReplyTo.reply_to_msg_id == 0) && tL_draftMessage.effect == 0 && tL_draftMessage.rich_message == null && tL_draftMessage.suggested_post == null)) {
                return;
            }
        }
        saveDraft(j10, j11, tL_draftMessage, message2, false);
        if (j11 == 0 || ChatObject.isForum(chat) || ChatObject.isMonoForum(chat)) {
            if (!DialogObject.isEncryptedDialog(j10)) {
                TLRPC.TL_messages_saveDraft tL_messages_saveDraft = new TLRPC.TL_messages_saveDraft();
                TLRPC.InputPeer inputPeer = getMessagesController().getInputPeer(j10);
                tL_messages_saveDraft.peer = inputPeer;
                if (inputPeer == null) {
                    return;
                }
                tL_messages_saveDraft.message = tL_draftMessage.message;
                tL_messages_saveDraft.no_webpage = tL_draftMessage.no_webpage;
                tL_messages_saveDraft.reply_to = tL_draftMessage.reply_to;
                tL_messages_saveDraft.suggested_post = tL_draftMessage.suggested_post;
                tL_messages_saveDraft.entities = tL_draftMessage.entities;
                TL_iv.RichMessage richMessage2 = tL_draftMessage.rich_message;
                if (richMessage2 != null) {
                    tL_messages_saveDraft.rich_message = toInputRichMessage(richMessage2);
                }
                if ((tL_draftMessage.flags & 128) != 0) {
                    tL_messages_saveDraft.effect = tL_draftMessage.effect;
                    tL_messages_saveDraft.flags |= 128;
                }
                getConnectionsManager().sendRequest(tL_messages_saveDraft, new e5(8));
            }
            getMessagesController().sortDialogs(null);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
        }
    }

    public void toggleStickerSet(Context context, TLObject tLObject, int i10, org.telegram.ui.ActionBar.o2 o2Var, FrameLayout frameLayout, boolean z10, boolean z11, Runnable runnable, boolean z12) {
        toggleStickerSet(context, tLObject, null, i10, o2Var, frameLayout, z10, z11, runnable, z12);
    }

    public static void addTextStyleRuns(ArrayList<TLRPC.MessageEntity> arrayList, CharSequence charSequence, Spannable spannable) {
        addTextStyleRuns(arrayList, charSequence, spannable, -1);
    }

    public static TLRPC.InputStickerSet getInputStickerSet(TLRPC.Document document) {
        for (int i10 = 0; i10 < document.attributes.size(); i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.InputStickerSet inputStickerSet = documentAttribute.stickerset;
                if (inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty) {
                    return null;
                }
                return inputStickerSet;
            }
        }
        return null;
    }

    public void getEmojiSuggestions(final String[] strArr, final String str, final boolean z10, final KeywordResultCallback keywordResultCallback, final CountDownLatch countDownLatch, final boolean z11, final boolean z12, final boolean z13, final boolean z14, final Integer num, final boolean z15) {
        if (keywordResultCallback == null) {
            return;
        }
        if (!TextUtils.isEmpty(str) && strArr != null) {
            final ArrayList arrayList = new ArrayList(Emoji.recentEmoji);
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$getEmojiSuggestions$224(strArr, keywordResultCallback, z13, str, z10, arrayList, z11, num, z12, z14, z15, countDownLatch);
                }
            });
            if (countDownLatch != null) {
                try {
                    countDownLatch.await();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
            return;
        }
        keywordResultCallback.run(new ArrayList<>(), null);
    }

    public void toggleStickerSet(final android.content.Context r18, final org.telegram.tgnet.TLObject r19, final org.telegram.tgnet.TLRPC.Document r20, final int r21, final org.telegram.ui.ActionBar.o2 r22, final android.widget.FrameLayout r23, final boolean r24, boolean r25, final java.lang.Runnable r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.toggleStickerSet(android.content.Context, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$Document, int, org.telegram.ui.ActionBar.o2, android.widget.FrameLayout, boolean, boolean, java.lang.Runnable, boolean):void");
    }

    public static void addTextStyleRuns(ArrayList<TLRPC.MessageEntity> arrayList, CharSequence charSequence, Spannable spannable, int i10) {
        for (i01 i01Var : (i01[]) spannable.getSpans(0, spannable.length(), i01.class)) {
            spannable.removeSpan(i01Var);
        }
        ArrayList<h01> textStyleRuns = getTextStyleRuns(arrayList, charSequence, i10);
        for (int i11 = 0; i11 < Math.min(1000, textStyleRuns.size()); i11++) {
            h01 h01Var = textStyleRuns.get(i11);
            addStyleToText(new i01(h01Var, 0), h01Var.f29025b, h01Var.f29026c, spannable, true);
        }
    }

    public TLRPC.TL_messages_stickerSet getStickerSet(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        return getStickerSet(inputStickerSet, null, z10, null);
    }

    public TLRPC.TL_messages_stickerSet getStickerSet(TLRPC.InputStickerSet inputStickerSet, Integer num, boolean z10) {
        return getStickerSet(inputStickerSet, num, z10, null);
    }

    public void preloadStickerSetThumb(TLRPC.StickerSetCovered stickerSetCovered) {
        TLRPC.StickerSet stickerSet;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        if (stickerSetCovered == null || (stickerSet = stickerSetCovered.set) == null || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(stickerSet.thumbs, 90)) == null) {
            return;
        }
        TLRPC.Document document = stickerSetCovered.cover;
        if (document == null) {
            if (stickerSetCovered.covers.isEmpty()) {
                return;
            }
            document = stickerSetCovered.covers.get(0);
        }
        loadStickerSetThumbInternal(closestPhotoSizeWithSize, stickerSetCovered, document, stickerSetCovered.set.thumb_version);
    }

    public static boolean entitiesEqual(ArrayList<TLRPC.MessageEntity> arrayList, ArrayList<TLRPC.MessageEntity> arrayList2) {
        if (arrayList.size() != arrayList2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (!entitiesEqual(arrayList.get(i10), arrayList2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public TLRPC.TL_messages_stickerSet getStickerSet(TLRPC.InputStickerSet inputStickerSet, Integer num, boolean z10, Utilities.Callback<TLRPC.TL_messages_stickerSet> callback) {
        return getStickerSet(inputStickerSet, num, z10, false, callback);
    }

    public TLRPC.TL_messages_stickerSet getStickerSet(final TLRPC.InputStickerSet inputStickerSet, final Integer num, final boolean z10, boolean z11, final Utilities.Callback<TLRPC.TL_messages_stickerSet> callback) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        String str;
        if (inputStickerSet != null) {
            boolean z12 = inputStickerSet instanceof TLRPC.TL_inputStickerSetID;
            if (z12 && this.stickerSetsById.d(inputStickerSet.f22412id)) {
                tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.stickerSetsById.f(inputStickerSet.f22412id);
            } else if ((inputStickerSet instanceof TLRPC.TL_inputStickerSetShortName) && (str = inputStickerSet.short_name) != null && this.stickerSetsByName.containsKey(str.toLowerCase())) {
                tL_messages_stickerSet = this.stickerSetsByName.get(inputStickerSet.short_name.toLowerCase());
            } else if ((!(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmojiDefaultStatuses) || (tL_messages_stickerSet = this.stickerSetDefaultStatuses) == null) && (!(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmojiChannelDefaultStatuses) || (tL_messages_stickerSet = this.stickerSetDefaultChannelStatuses) == null)) {
                tL_messages_stickerSet = null;
            }
            if (tL_messages_stickerSet != null) {
                if (!z11 && callback != null) {
                    callback.run(tL_messages_stickerSet);
                }
                return tL_messages_stickerSet;
            }
            final String inputSetKey = inputSetKey(inputStickerSet);
            if (callback != null || !this.loadingStickerSetsKeys.contains(inputSetKey)) {
                this.loadingStickerSetsKeys.add(inputSetKey);
                if (z12) {
                    getMessagesStorage().getStorageQueue().postRunnable(new Runnable(this) {
                        public final MediaDataController f19790b;

                        {
                            this.f19790b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r7) {
                                case 0:
                                    this.f19790b.lambda$getStickerSet$34(inputStickerSet, num, inputSetKey, callback, z10);
                                    return;
                                default:
                                    this.f19790b.lambda$getStickerSet$37(inputStickerSet, num, inputSetKey, callback, z10);
                                    return;
                            }
                        }
                    });
                    return null;
                } else if (inputStickerSet instanceof TLRPC.TL_inputStickerSetShortName) {
                    getMessagesStorage().getStorageQueue().postRunnable(new Runnable(this) {
                        public final MediaDataController f19790b;

                        {
                            this.f19790b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r7) {
                                case 0:
                                    this.f19790b.lambda$getStickerSet$34(inputStickerSet, num, inputSetKey, callback, z10);
                                    return;
                                default:
                                    this.f19790b.lambda$getStickerSet$37(inputStickerSet, num, inputSetKey, callback, z10);
                                    return;
                            }
                        }
                    });
                    return null;
                } else if (!z10) {
                    fetchStickerSetInternal(inputStickerSet, new a4(this, inputSetKey, callback, inputStickerSet, 2));
                    return null;
                } else {
                    this.loadingStickerSetsKeys.remove(inputSetKey);
                    return null;
                }
            }
        }
        return null;
    }

    public ArrayList<MessageObject> loadPinnedMessages(long j10, long j11, ArrayList<Integer> arrayList, boolean z10) {
        if (z10) {
            getMessagesStorage().getStorageQueue().postRunnable(new g5.x(this, j10, j11, arrayList, 5));
            return null;
        }
        return loadPinnedMessageInternal(j10, j11, arrayList, true);
    }

    private org.telegram.tgnet.TLRPC.TL_messages_stickerSet getCachedStickerSetInternal(java.lang.String r7, java.lang.Integer r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.getCachedStickerSetInternal(java.lang.String, java.lang.Integer):org.telegram.tgnet.TLRPC$TL_messages_stickerSet");
    }

    public static void lambda$markFeaturedStickersAsRead$65(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void lambda$markFeaturedStickersByIdAsRead$66(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void lambda$removeInline$152(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void lambda$removePeer$154(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void lambda$removeWebapp$153(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void lambda$saveDraft$188(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public void saveDraft(final long j10, final long j11, TLRPC.DraftMessage draftMessage, TLRPC.Message message, boolean z10) {
        TLRPC.Message message2;
        String str;
        TLRPC.InputReplyTo inputReplyTo;
        TLRPC.Chat chat;
        StringBuilder sb2;
        if (getMessagesController().isForum(j10) && j11 == 0 && TextUtils.isEmpty(draftMessage.message)) {
            TLRPC.InputReplyTo inputReplyTo2 = draftMessage.reply_to;
            if (inputReplyTo2 instanceof TLRPC.TL_inputReplyToMessage) {
                ((TLRPC.TL_inputReplyToMessage) inputReplyTo2).reply_to_msg_id = 0;
            }
        }
        SharedPreferences.Editor edit = this.draftPreferences.edit();
        MessagesController messagesController = getMessagesController();
        if (draftMessage != null && !(draftMessage instanceof TLRPC.TL_draftMessageEmpty)) {
            a0.h hVar = (a0.h) this.drafts.f(j10);
            if (hVar == null) {
                hVar = new a0.h();
                this.drafts.k(hVar, j10);
            }
            hVar.k(draftMessage, j11);
            int i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
            if (i10 == 0) {
                messagesController.putDraftDialogIfNeed(j10, draftMessage);
            }
            try {
                SerializedData serializedData = new SerializedData(draftMessage.getObjectSize());
                draftMessage.serializeToStream(serializedData);
                if (i10 != 0) {
                    sb2 = new StringBuilder("t_");
                    sb2.append(j10);
                    sb2.append("_");
                    sb2.append(j11);
                } else {
                    sb2 = new StringBuilder("");
                    sb2.append(j10);
                }
                edit.putString(sb2.toString(), Utilities.bytesToHex(serializedData.toByteArray()));
                serializedData.cleanup();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        } else {
            a0.h hVar2 = (a0.h) this.drafts.f(j10);
            if (hVar2 != null) {
                hVar2.l(j11);
                if (hVar2.m() == 0) {
                    this.drafts.l(j10);
                }
            }
            a0.h hVar3 = (a0.h) this.draftMessages.f(j10);
            if (hVar3 != null) {
                hVar3.l(j11);
                if (hVar3.m() == 0) {
                    this.draftMessages.l(j10);
                }
            }
            if (j11 == 0) {
                this.draftPreferences.edit().remove("" + j10).remove("r_" + j10).commit();
            } else {
                SharedPreferences.Editor edit2 = this.draftPreferences.edit();
                StringBuilder r6 = a4.w.r(j10, "t_", "_");
                r6.append(j11);
                SharedPreferences.Editor remove = edit2.remove(r6.toString());
                StringBuilder r9 = a4.w.r(j10, "rt_", "_");
                r9.append(j11);
                remove.remove(r9.toString()).commit();
            }
            messagesController.removeDraftDialogIfNeed(j10);
        }
        a0.h hVar4 = (a0.h) this.draftMessages.f(j10);
        TLRPC.User user = null;
        if (message != null || draftMessage == null || draftMessage.reply_to == null) {
            if (draftMessage != null && draftMessage.reply_to == null) {
                message2 = null;
            }
            message2 = message;
        } else {
            if (hVar4 != null) {
                message2 = (TLRPC.Message) hVar4.f(j11);
            }
            message2 = message;
        }
        if (message2 == null) {
            if (hVar4 != null) {
                hVar4.l(j11);
                if (hVar4.m() == 0) {
                    this.draftMessages.l(j10);
                }
            }
            if (j11 == 0) {
                edit.remove("r_" + j10);
            } else {
                StringBuilder r10 = a4.w.r(j10, "rt_", "_");
                r10.append(j11);
                edit.remove(r10.toString());
            }
        } else {
            if (hVar4 == null) {
                hVar4 = new a0.h();
                this.draftMessages.k(hVar4, j10);
            }
            hVar4.k(message2, j11);
            try {
                SerializedData serializedData2 = new SerializedData(message2.getObjectSize());
                message2.serializeToStream(serializedData2);
                if (j11 != 0) {
                    str = "rt_" + j10 + "_" + j11;
                } else {
                    str = "r_" + j10;
                }
                edit.putString(str, Utilities.bytesToHex(serializedData2.toByteArray()));
                serializedData2.cleanup();
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        edit.commit();
        if (z10) {
            if (j11 == 0 || getMessagesController().isForum(j10)) {
                if (draftMessage != null && (inputReplyTo = draftMessage.reply_to) != null && inputReplyTo.reply_to_msg_id != 0 && (message2 == 0 || ((message2.reply_to instanceof TLRPC.TL_messageReplyHeader) && message2.replyMessage == null))) {
                    long peerDialogId = (inputReplyTo.flags & 2) != 0 ? DialogObject.getPeerDialogId(inputReplyTo.reply_to_peer_id) : j10;
                    if (DialogObject.isUserDialog(peerDialogId)) {
                        user = getMessagesController().getUser(Long.valueOf(peerDialogId));
                        chat = null;
                    } else {
                        chat = getMessagesController().getChat(Long.valueOf(-peerDialogId));
                    }
                    if (user != null || chat != null) {
                        long j12 = ChatObject.isChannel(chat) ? chat.f22392id : 0L;
                        final int i11 = draftMessage.reply_to.reply_to_msg_id;
                        final long j13 = peerDialogId;
                        final long j14 = j12;
                        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                            @Override
                            public final void run() {
                                MediaDataController.this.lambda$saveDraft$191(i11, j13, j14, j10, j11);
                            }
                        });
                    }
                }
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newDraftReceived, Long.valueOf(j10));
            }
        }
    }
}
