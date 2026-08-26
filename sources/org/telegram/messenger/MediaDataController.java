package org.telegram.messenger;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
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
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.collection.LongSparseArray;
import androidx.core.content.pm.ShortcutInfoCompat;
import androidx.core.content.pm.ShortcutManagerCompat$$ExternalSyntheticApiModelOutline0;
import androidx.core.graphics.drawable.IconCompat;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.DiffUtil;
import com.android.billingclient.api.ProductDetails;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.internal.mlkit_language_id_common.zziq;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
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
import org.telegram.messenger.ringtone.RingtoneDataStore;
import org.telegram.messenger.ringtone.RingtoneUploader;
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
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
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.EmojiThemes;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda4;
import org.telegram.ui.ActionBar.theme.ThemeKey;
import org.telegram.ui.Adapters.MentionsAdapter$$ExternalSyntheticLambda10;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda48;
import org.telegram.ui.Cells.ChatMessageCell$$ExternalSyntheticLambda5;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda286;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda488;
import org.telegram.ui.ChatActivity$70$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.ChatThemeBottomSheet;
import org.telegram.ui.Components.FormattedDateSpan;
import org.telegram.ui.Components.QuoteSpan;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.StickerSetBulletinLayout;
import org.telegram.ui.Components.StickersArchiveAlert;
import org.telegram.ui.Components.TextStyleSpan;
import org.telegram.ui.Components.URLSpanReplacement;
import org.telegram.ui.Components.URLSpanUserMention;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda121;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda162;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda37;
import org.telegram.ui.MessageSeenView$$ExternalSyntheticLambda0;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda9;
import org.telegram.ui.ProfileActivity$$ExternalSyntheticLambda72;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda132;
import org.telegram.ui.Stories.StoriesStorage;
import org.telegram.ui.WearAuthSheet$$ExternalSyntheticLambda3;

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
    private LongSparseArray botDialogKeyboards;
    private HashMap<String, TL_bots.BotInfo> botInfos;
    private HashMap<MessagesStorage.TopicKey, TLRPC.Message> botKeyboards;
    private LongSparseArray botKeyboardsByMids;
    private boolean cleanedupStickerSetCache;
    private HashMap<String, Boolean> currentFetchingEmoji;
    public final ArrayList<ChatThemeBottomSheet.ChatThemeItem> defaultEmojiThemes;
    private ArrayList<MessageObject> deletedFromResultMessages;
    private LongSparseArray diceEmojiStickerSetsById;
    private HashMap<String, TLRPC.TL_messages_stickerSet> diceStickerSetsByEmoji;
    private String doubleTapReaction;
    private LongSparseArray draftMessages;
    private SharedPreferences draftPreferences;
    public LongSparseArray draftVoices;
    private boolean draftVoicesLoaded;
    private LongSparseArray drafts;
    private LongSparseArray draftsFolderIds;
    private ArrayList<TLRPC.EmojiStatus>[] emojiStatuses;
    private Long[] emojiStatusesFetchDate;
    private boolean[] emojiStatusesFetching;
    private boolean[] emojiStatusesFromCacheFetched;
    private long[] emojiStatusesHash;
    private List<TLRPC.TL_availableReaction> enabledReactionsList;
    private ArrayList<TLRPC.StickerSetCovered>[] featuredStickerSets;
    private LongSparseArray[] featuredStickerSetsById;
    private boolean[] featuredStickersLoaded;
    private HashSet<String> fetchedEmoji;
    private TLRPC.Document greetingsSticker;
    public TLRPC.TL_emojiList groupAvatarConstructorDefault;
    private LongSparseArray groupStickerSets;
    public ArrayList<TLRPC.TL_topPeer> guestBots;
    public ArrayList<TLRPC.TL_topPeer> hints;
    private boolean inTransaction;
    public ArrayList<TLRPC.TL_topPeer> inlineBots;
    private ArrayList<Long> installedForceStickerSetsById;
    private LongSparseArray installedStickerSetsById;
    private boolean isLoadingMenuBots;
    private boolean isLoadingPremiumPromo;
    private boolean isLoadingReactions;
    private long lastDialogId;
    private int lastGuid;
    private long lastMergeDialogId;
    private ReactionsLayoutInBubble.VisibleReaction lastReaction;
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
    private LongSparseArray loadingPinnedMessages;
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
    private LongSparseArray removingStickerSetsUndos;
    public TLRPC.TL_emojiList replyIconsDefault;
    private int reqId;
    public TLRPC.TL_emojiList restrictedStatusEmojis;
    public final RingtoneDataStore ringtoneDataStore;
    public HashMap<String, RingtoneUploader> ringtoneUploaderHashMap;
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
    private LongSparseArray stickerSetsById;
    private ConcurrentHashMap<String, TLRPC.TL_messages_stickerSet> stickerSetsByName;
    private LongSparseArray stickersByEmoji;
    private LongSparseArray[] stickersByIds;
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
        final ReactionsLayoutInBubble.VisibleReaction val$tag;
        final long val$topicId;
        final int val$type;
        final long val$uid;

        public AnonymousClass1(int i, long j, int i2, long j2, int i3, ReactionsLayoutInBubble.VisibleReaction visibleReaction, int i4, int i5, int i6, boolean z, int i7) {
            this.val$count = i;
            this.val$uid = j;
            this.val$min_id = i2;
            this.val$topicId = j2;
            this.val$type = i3;
            this.val$tag = visibleReaction;
            this.val$max_id = i4;
            this.val$classGuid = i5;
            this.val$fromCache = i6;
            this.val$isChannel = z;
            this.val$requestIndex = i7;
        }

        public void lambda$run$0(Runnable runnable, int i) {
            MediaDataController.this.getMessagesStorage().completeTaskForGuid(runnable, i);
        }

        @Override
        public void run() throws Throwable {
            ?? r4;
            ?? r5;
            ?? r6;
            ?? r7;
            SQLiteDatabase sQLiteDatabase;
            ArrayList arrayList;
            SQLiteCursor sQLiteCursorQueryFinalized;
            boolean z;
            AnonymousClass1 anonymousClass1;
            boolean z2;
            AnonymousClass1 anonymousClass2;
            SQLiteCursor sQLiteCursorQueryFinalized2;
            HashSet<Long> hashSet;
            TLRPC.TL_messages_messages tL_messages_messages;
            ArrayList<Long> arrayList2;
            ArrayList arrayList3;
            long j;
            long jLongValue;
            int i;
            SQLiteDatabase sQLiteDatabase2;
            SQLiteCursor sQLiteCursorQueryFinalized3;
            ArrayList arrayList4;
            int iIntValue;
            NativeByteBuffer nativeByteBufferByteBufferValue;
            NativeByteBuffer nativeByteBufferByteBufferValue2;
            ArrayList<Long> arrayList5;
            ArrayList arrayList6;
            long j2;
            TLRPC.Message messageTLdeserialize;
            long j3;
            long j4;
            boolean z3;
            String str;
            String str2;
            SQLiteCursor sQLiteCursorQueryFinalized4;
            AnonymousClass1 anonymousClass3;
            SQLiteCursor sQLiteCursorQueryFinalized5;
            int iIntValue2;
            SQLiteCursor sQLiteCursorQueryFinalized6;
            int iIntValue3;
            SQLiteDatabase sQLiteDatabase3;
            SQLiteCursor sQLiteCursorQueryFinalized7;
            int iIntValue4;
            int i2;
            AnonymousClass1 anonymousClass4 = this;
            ?? r8 = "SELECT max(end) FROM media_holes_v2 WHERE uid = ";
            String str3 = "SELECT max(end) FROM media_holes_topics WHERE uid = ";
            String str4 = "t.tag = ";
            long clientUserId = MediaDataController.this.getUserConfig().getClientUserId();
            TLRPC.TL_messages_messages tL_messages_messages2 = new TLRPC.TL_messages_messages();
            boolean z4 = false;
            try {
                try {
                    ArrayList<Long> arrayList7 = new ArrayList<>();
                    ArrayList arrayList8 = new ArrayList();
                    int i3 = anonymousClass4.val$count + 1;
                    SQLiteDatabase database = MediaDataController.this.getMessagesStorage().getDatabase();
                    ArrayList<Long> arrayList9 = arrayList7;
                    TLRPC.TL_messages_messages tL_messages_messages3 = tL_messages_messages2;
                    try {
                        try {
                            if (DialogObject.isEncryptedDialog(anonymousClass4.val$uid)) {
                                AnonymousClass1 anonymousClass5 = anonymousClass4;
                                sQLiteDatabase = database;
                                clientUserId = clientUserId;
                                arrayList = arrayList8;
                                long j5 = anonymousClass5.val$topicId;
                                if (j5 != 0) {
                                    int i4 = anonymousClass5.val$max_id;
                                    if (i4 != 0) {
                                        Locale locale = Locale.US;
                                        sQLiteCursorQueryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_topics as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + anonymousClass5.val$uid + " AND m.topic_id = " + j5 + " AND m.mid > " + i4 + " AND type = " + anonymousClass5.val$type + " ORDER BY m.mid ASC LIMIT " + i3, new Object[0]);
                                    } else {
                                        int i5 = anonymousClass5.val$min_id;
                                        if (i5 != 0) {
                                            Locale locale2 = Locale.US;
                                            sQLiteCursorQueryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_topics as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + anonymousClass5.val$uid + " AND m.topic_id = " + j5 + " AND m.mid < " + i5 + " AND type = " + anonymousClass5.val$type + " ORDER BY m.mid DESC LIMIT " + i3, new Object[0]);
                                        } else {
                                            Locale locale3 = Locale.US;
                                            sQLiteCursorQueryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_topics as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + anonymousClass5.val$uid + " AND m.topic_id = " + j5 + " AND type = " + anonymousClass5.val$type + " ORDER BY m.mid ASC LIMIT " + i3, new Object[0]);
                                        }
                                    }
                                } else {
                                    int i6 = anonymousClass5.val$max_id;
                                    if (i6 != 0) {
                                        Locale locale4 = Locale.US;
                                        sQLiteCursorQueryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_v4 as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + anonymousClass5.val$uid + " AND m.mid > " + i6 + " AND type = " + anonymousClass5.val$type + " ORDER BY m.mid ASC LIMIT " + i3, new Object[0]);
                                    } else {
                                        int i7 = anonymousClass5.val$min_id;
                                        if (i7 != 0) {
                                            Locale locale5 = Locale.US;
                                            sQLiteCursorQueryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_v4 as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + anonymousClass5.val$uid + " AND m.mid < " + i7 + " AND type = " + anonymousClass5.val$type + " ORDER BY m.mid DESC LIMIT " + i3, new Object[0]);
                                        } else {
                                            Locale locale6 = Locale.US;
                                            sQLiteCursorQueryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_v4 as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + anonymousClass5.val$uid + " AND type = " + anonymousClass5.val$type + " ORDER BY m.mid ASC LIMIT " + i3, new Object[0]);
                                        }
                                    }
                                }
                                z = false;
                                anonymousClass1 = anonymousClass5;
                            } else {
                                arrayList = arrayList8;
                                if (anonymousClass4.val$min_id == 0) {
                                    long j6 = anonymousClass4.val$topicId;
                                    if (j6 != 0) {
                                        Locale locale7 = Locale.US;
                                        sQLiteCursorQueryFinalized7 = database.queryFinalized("SELECT start FROM media_holes_topics WHERE uid = " + anonymousClass4.val$uid + " AND topic_id = " + j6 + " AND type = " + anonymousClass4.val$type + " AND start IN (0, 1)", new Object[0]);
                                    } else {
                                        Locale locale8 = Locale.US;
                                        sQLiteCursorQueryFinalized7 = database.queryFinalized("SELECT start FROM media_holes_v2 WHERE uid = " + anonymousClass4.val$uid + " AND type = " + anonymousClass4.val$type + " AND start IN (0, 1)", new Object[0]);
                                    }
                                    if (sQLiteCursorQueryFinalized7.next()) {
                                        z3 = sQLiteCursorQueryFinalized7.intValue(0) == 1;
                                        sQLiteCursorQueryFinalized7.dispose();
                                    } else {
                                        sQLiteCursorQueryFinalized7.dispose();
                                        long j7 = anonymousClass4.val$topicId;
                                        if (j7 != 0) {
                                            Locale locale9 = Locale.US;
                                            sQLiteCursorQueryFinalized7 = database.queryFinalized("SELECT min(mid) FROM media_topics WHERE uid = " + anonymousClass4.val$uid + " AND topic_id = " + j7 + " AND type = " + anonymousClass4.val$type + " AND mid > 0", new Object[0]);
                                        } else {
                                            Locale locale10 = Locale.US;
                                            sQLiteCursorQueryFinalized7 = database.queryFinalized("SELECT min(mid) FROM media_v4 WHERE uid = " + anonymousClass4.val$uid + " AND type = " + anonymousClass4.val$type + " AND mid > 0", new Object[0]);
                                        }
                                        if (sQLiteCursorQueryFinalized7.next() && (iIntValue4 = sQLiteCursorQueryFinalized7.intValue(0)) != 0) {
                                            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = anonymousClass4.val$topicId != 0 ? database.executeFast("REPLACE INTO media_holes_topics VALUES(?, ?, ?, ?, ?)") : database.executeFast("REPLACE INTO media_holes_v2 VALUES(?, ?, ?, ?)");
                                            sQLitePreparedStatementExecuteFast.requery();
                                            sQLitePreparedStatementExecuteFast.bindLong(1, anonymousClass4.val$uid);
                                            long j8 = anonymousClass4.val$topicId;
                                            if (j8 != 0) {
                                                sQLitePreparedStatementExecuteFast.bindLong(2, j8);
                                                i2 = 3;
                                            } else {
                                                i2 = 2;
                                            }
                                            sQLitePreparedStatementExecuteFast.bindInteger(i2, anonymousClass4.val$type);
                                            sQLitePreparedStatementExecuteFast.bindInteger(i2 + 1, 0);
                                            sQLitePreparedStatementExecuteFast.bindInteger(i2 + 2, iIntValue4);
                                            sQLitePreparedStatementExecuteFast.step();
                                            sQLitePreparedStatementExecuteFast.dispose();
                                        }
                                    }
                                    sQLiteCursorQueryFinalized7.dispose();
                                } else {
                                    i3 = i3;
                                    str3 = "SELECT max(end) FROM media_holes_topics WHERE uid = ";
                                    str4 = "t.tag = ";
                                    z3 = false;
                                }
                                ReactionsLayoutInBubble.VisibleReaction visibleReaction = anonymousClass4.val$tag;
                                if (visibleReaction != null) {
                                    long jHashCode = !TextUtils.isEmpty(visibleReaction.emojicon) ? anonymousClass4.val$tag.emojicon.hashCode() : anonymousClass4.val$tag.documentId;
                                    str = "INNER JOIN tag_message_id t ON m.mid = t.mid";
                                    str2 = str4 + jHashCode + " AND";
                                } else {
                                    str = "";
                                    str2 = "";
                                }
                                int i8 = anonymousClass4.val$max_id;
                                z2 = z3;
                                try {
                                    if (i8 != 0) {
                                        long j9 = anonymousClass4.val$topicId;
                                        if (j9 != 0) {
                                            Locale locale11 = Locale.US;
                                            sQLiteCursorQueryFinalized6 = database.queryFinalized("SELECT start, end FROM media_holes_topics WHERE uid = " + anonymousClass4.val$uid + " AND topic_id = " + j9 + " AND type = " + anonymousClass4.val$type + " AND start <= " + i8 + " ORDER BY end DESC LIMIT 1", new Object[0]);
                                        } else {
                                            Locale locale12 = Locale.US;
                                            sQLiteCursorQueryFinalized6 = database.queryFinalized("SELECT start, end FROM media_holes_v2 WHERE uid = " + anonymousClass4.val$uid + " AND type = " + anonymousClass4.val$type + " AND start <= " + i8 + " ORDER BY end DESC LIMIT 1", new Object[0]);
                                        }
                                        if (sQLiteCursorQueryFinalized6.next()) {
                                            sQLiteCursorQueryFinalized6.intValue(0);
                                            iIntValue3 = sQLiteCursorQueryFinalized6.intValue(1);
                                        } else {
                                            iIntValue3 = 0;
                                        }
                                        sQLiteCursorQueryFinalized6.dispose();
                                        long j10 = anonymousClass4.val$topicId;
                                        if (j10 == 0) {
                                            int i9 = i3;
                                            String str5 = str;
                                            String str6 = str2;
                                            if (iIntValue3 > 1) {
                                                Locale locale13 = Locale.US;
                                                sQLiteDatabase3 = database;
                                                sQLiteCursorQueryFinalized2 = sQLiteDatabase3.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str5 + " WHERE " + str6 + " m.uid = " + this.val$uid + " AND m.mid > 0 AND m.mid < " + this.val$max_id + " AND m.mid >= " + iIntValue3 + " AND m.type = " + this.val$type + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i9, new Object[0]);
                                            } else {
                                                try {
                                                    Locale locale14 = Locale.US;
                                                    sQLiteDatabase = database;
                                                    anonymousClass3 = this;
                                                    sQLiteCursorQueryFinalized = database.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str5 + " WHERE " + str6 + " m.uid = " + this.val$uid + " AND m.mid > 0 AND m.mid < " + this.val$max_id + " AND m.type = " + this.val$type + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i9, new Object[0]);
                                                    z = false;
                                                    anonymousClass2 = anonymousClass3;
                                                    sQLiteCursorQueryFinalized2 = sQLiteCursorQueryFinalized;
                                                    r8 = anonymousClass2;
                                                } catch (Exception e) {
                                                    e = e;
                                                    anonymousClass4 = this;
                                                    r7 = anonymousClass4;
                                                    tL_messages_messages2 = tL_messages_messages3;
                                                    r5 = r7;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    anonymousClass4 = this;
                                                    r6 = anonymousClass4;
                                                    tL_messages_messages2 = tL_messages_messages3;
                                                    r4 = r6;
                                                    AndroidUtilities.runOnUIThread(new FileLoader$$ExternalSyntheticLambda5((Object) r4, (Object) r4, r4.val$classGuid, 2));
                                                    MediaDataController.this.processLoadedMedia(tL_messages_messages2, r4.val$uid, r4.val$count, r4.val$max_id, r4.val$min_id, r4.val$type, r4.val$topicId, r4.val$fromCache, r4.val$classGuid, r4.val$isChannel, false, r4.val$requestIndex);
                                                    throw th;
                                                }
                                            }
                                        } else if (iIntValue3 > 1) {
                                            Locale locale15 = Locale.US;
                                            sQLiteCursorQueryFinalized2 = database.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str + " WHERE " + str2 + " m.uid = " + anonymousClass4.val$uid + " AND m.topic_id = " + j10 + " AND m.mid > 0 AND m.mid < " + anonymousClass4.val$max_id + " AND m.mid >= " + iIntValue3 + " AND m.type = " + anonymousClass4.val$type + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i3, new Object[0]);
                                            sQLiteDatabase3 = database;
                                        } else {
                                            String str7 = str;
                                            String str8 = str2;
                                            Locale locale16 = Locale.US;
                                            sQLiteDatabase = database;
                                            sQLiteCursorQueryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str7 + " WHERE " + str8 + " m.uid = " + anonymousClass4.val$uid + " AND m.topic_id = " + j10 + " AND m.mid > 0 AND m.mid < " + anonymousClass4.val$max_id + " AND m.type = " + anonymousClass4.val$type + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i3, new Object[0]);
                                            z = false;
                                            anonymousClass2 = this;
                                            sQLiteCursorQueryFinalized2 = sQLiteCursorQueryFinalized;
                                            r8 = anonymousClass2;
                                        }
                                        z = false;
                                        z2 = false;
                                        sQLiteDatabase = sQLiteDatabase3;
                                        r8 = this;
                                    } else {
                                        String str9 = str2;
                                        ?? r9 = " AND m.type = ";
                                        String str10 = str;
                                        int i10 = i3;
                                        int i11 = anonymousClass4.val$min_id;
                                        try {
                                            if (i11 == 0) {
                                                sQLiteDatabase = database;
                                                long j11 = anonymousClass4.val$topicId;
                                                if (j11 != 0) {
                                                    Locale locale17 = Locale.US;
                                                    sQLiteCursorQueryFinalized4 = sQLiteDatabase.queryFinalized(str3 + anonymousClass4.val$uid + " AND topic_id = " + j11 + " AND type = " + anonymousClass4.val$type, new Object[0]);
                                                } else {
                                                    Locale locale18 = Locale.US;
                                                    sQLiteCursorQueryFinalized4 = sQLiteDatabase.queryFinalized("SELECT max(end) FROM media_holes_v2 WHERE uid = " + anonymousClass4.val$uid + " AND type = " + anonymousClass4.val$type, new Object[0]);
                                                }
                                                int iIntValue5 = sQLiteCursorQueryFinalized4.next() ? sQLiteCursorQueryFinalized4.intValue(0) : 0;
                                                sQLiteCursorQueryFinalized4.dispose();
                                                long j12 = anonymousClass4.val$topicId;
                                                if (j12 != 0) {
                                                    if (iIntValue5 > 1) {
                                                        Locale locale19 = Locale.US;
                                                        sQLiteCursorQueryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str10 + " WHERE " + str9 + " m.uid = " + anonymousClass4.val$uid + " AND m.topic_id = " + j12 + " AND m.mid >= " + iIntValue5 + r9 + anonymousClass4.val$type + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i10, new Object[0]);
                                                        anonymousClass3 = anonymousClass4;
                                                        z = false;
                                                        anonymousClass2 = anonymousClass3;
                                                    } else {
                                                        Locale locale20 = Locale.US;
                                                        sQLiteDatabase = sQLiteDatabase;
                                                        sQLiteCursorQueryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str10 + " WHERE " + str9 + r4 + anonymousClass4.val$uid + r9 + j12 + " AND m.mid > 0 AND m.type = " + anonymousClass4.val$type + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i10, new Object[0]);
                                                        z = false;
                                                        anonymousClass2 = this;
                                                    }
                                                } else if (iIntValue5 > 1) {
                                                    Locale locale21 = Locale.US;
                                                    sQLiteCursorQueryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str10 + " WHERE " + str9 + r4 + this.val$uid + " AND m.mid >= " + iIntValue5 + r10 + this.val$type + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i10, new Object[0]);
                                                    z = false;
                                                    anonymousClass2 = this;
                                                } else {
                                                    Locale locale22 = Locale.US;
                                                    AnonymousClass1 anonymousClass6 = this;
                                                    sQLiteCursorQueryFinalized = sQLiteDatabase.queryFinalized(((String) r11) + str10 + " WHERE " + str9 + r4 + anonymousClass6.val$uid + " AND m.mid > 0 AND m.type = " + anonymousClass6.val$type + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i10, new Object[0]);
                                                    anonymousClass3 = anonymousClass6;
                                                    z = false;
                                                    anonymousClass2 = anonymousClass3;
                                                }
                                                tL_messages_messages2.messages.clear();
                                                tL_messages_messages2.chats.clear();
                                                tL_messages_messages2.users.clear();
                                                FileLog.e(e);
                                                AndroidUtilities.runOnUIThread(new FileLoader$$ExternalSyntheticLambda5((Object) r5, (Object) r5, r5.val$classGuid, 2));
                                                MediaDataController.this.processLoadedMedia(tL_messages_messages2, r5.val$uid, r5.val$count, r5.val$max_id, r5.val$min_id, r5.val$type, r5.val$topicId, r5.val$fromCache, r5.val$classGuid, r5.val$isChannel, false, r5.val$requestIndex);
                                                return;
                                            }
                                            try {
                                                long j13 = anonymousClass4.val$topicId;
                                                if (j13 != 0) {
                                                    Locale locale23 = Locale.US;
                                                    sQLiteCursorQueryFinalized5 = database.queryFinalized("SELECT start, end FROM media_holes_topics WHERE uid = " + anonymousClass4.val$uid + " AND topic_id = " + j13 + " AND type = " + anonymousClass4.val$type + " AND end >= " + i11 + " ORDER BY end ASC LIMIT 1", new Object[0]);
                                                } else {
                                                    Locale locale24 = Locale.US;
                                                    sQLiteCursorQueryFinalized5 = database.queryFinalized("SELECT start, end FROM media_holes_v2 WHERE uid = " + anonymousClass4.val$uid + " AND type = " + anonymousClass4.val$type + " AND end >= " + i11 + " ORDER BY end ASC LIMIT 1", new Object[0]);
                                                }
                                                if (sQLiteCursorQueryFinalized5.next()) {
                                                    iIntValue2 = sQLiteCursorQueryFinalized5.intValue(0);
                                                    sQLiteCursorQueryFinalized5.intValue(1);
                                                } else {
                                                    iIntValue2 = 0;
                                                }
                                                sQLiteCursorQueryFinalized5.dispose();
                                                long j14 = anonymousClass4.val$topicId;
                                                if (j14 != 0) {
                                                    if (iIntValue2 > 1) {
                                                        Locale locale25 = Locale.US;
                                                        sQLiteDatabase = database;
                                                        anonymousClass2 = anonymousClass4;
                                                        sQLiteCursorQueryFinalized = database.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str10 + " WHERE " + str9 + " m.uid = " + anonymousClass4.val$uid + " AND m.topic_id = " + j14 + " AND m.mid > 0 AND m.mid >= " + anonymousClass4.val$min_id + " AND m.mid <= " + iIntValue2 + r9 + anonymousClass4.val$type + " ORDER BY m.date ASC, m.mid ASC LIMIT " + i10, new Object[0]);
                                                        z = true;
                                                    } else {
                                                        Locale locale26 = Locale.US;
                                                        sQLiteDatabase = database;
                                                        sQLiteCursorQueryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str10 + " WHERE " + str9 + " m.uid = " + anonymousClass4.val$uid + " AND m.topic_id = " + j14 + " AND m.mid > 0 AND m.mid >= " + anonymousClass4.val$min_id + r9 + anonymousClass4.val$type + " ORDER BY m.date ASC, m.mid ASC LIMIT " + i10, new Object[0]);
                                                        z = true;
                                                        z2 = true;
                                                    }
                                                } else if (iIntValue2 > 1) {
                                                    Locale locale27 = Locale.US;
                                                    sQLiteDatabase = database;
                                                    sQLiteCursorQueryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str10 + " WHERE " + str9 + " m.uid = " + this.val$uid + " AND m.mid > 0 AND m.mid >= " + this.val$min_id + " AND m.mid <= " + iIntValue2 + r9 + this.val$type + " ORDER BY m.date ASC, m.mid ASC LIMIT " + i10, new Object[0]);
                                                    z = true;
                                                } else {
                                                    try {
                                                        Locale locale28 = Locale.US;
                                                        sQLiteDatabase = database;
                                                        sQLiteCursorQueryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str10 + " WHERE " + str9 + " m.uid = " + this.val$uid + " AND m.mid > 0 AND m.mid >= " + this.val$min_id + r9 + this.val$type + " ORDER BY m.date ASC, m.mid ASC LIMIT " + i10, new Object[0]);
                                                        anonymousClass1 = this;
                                                        z = true;
                                                    } catch (Exception e2) {
                                                        e = e2;
                                                        r9 = this;
                                                        r7 = r9;
                                                        tL_messages_messages2 = tL_messages_messages3;
                                                        r5 = r7;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        r9 = this;
                                                        r6 = r9;
                                                        tL_messages_messages2 = tL_messages_messages3;
                                                        r4 = r6;
                                                        AndroidUtilities.runOnUIThread(new FileLoader$$ExternalSyntheticLambda5((Object) r4, (Object) r4, r4.val$classGuid, 2));
                                                        MediaDataController.this.processLoadedMedia(tL_messages_messages2, r4.val$uid, r4.val$count, r4.val$max_id, r4.val$min_id, r4.val$type, r4.val$topicId, r4.val$fromCache, r4.val$classGuid, r4.val$isChannel, false, r4.val$requestIndex);
                                                        throw th;
                                                    }
                                                }
                                                anonymousClass2 = this;
                                            } catch (Exception e3) {
                                                e = e3;
                                                r9 = anonymousClass4;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                r9 = anonymousClass4;
                                            }
                                            sQLiteCursorQueryFinalized2 = sQLiteCursorQueryFinalized;
                                            r8 = anonymousClass2;
                                        } catch (Exception e4) {
                                            e = e4;
                                        } catch (Throwable th4) {
                                            th = th4;
                                        }
                                    }
                                    if (r8.val$tag != null) {
                                        hashSet = new HashSet();
                                    } else {
                                        hashSet = null;
                                    }
                                    while (sQLiteCursorQueryFinalized2.next()) {
                                        nativeByteBufferByteBufferValue2 = sQLiteCursorQueryFinalized2.byteBufferValue(0);
                                        if (nativeByteBufferByteBufferValue2 != null) {
                                            messageTLdeserialize = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue2, nativeByteBufferByteBufferValue2.readInt32(false), false);
                                            j2 = clientUserId;
                                            messageTLdeserialize.readAttachPath(nativeByteBufferByteBufferValue2, j2);
                                            nativeByteBufferByteBufferValue2.reuse();
                                            messageTLdeserialize.id = sQLiteCursorQueryFinalized2.intValue(1);
                                            j3 = r8.val$uid;
                                            messageTLdeserialize.dialog_id = j3;
                                            if (DialogObject.isEncryptedDialog(j3)) {
                                                messageTLdeserialize.random_id = sQLiteCursorQueryFinalized2.longValue(2);
                                            }
                                            j4 = messageTLdeserialize.grouped_id;
                                            if (j4 != 0 && hashSet != null) {
                                                hashSet.add(Long.valueOf(j4));
                                            }
                                            if (z) {
                                                tL_messages_messages2 = tL_messages_messages3;
                                                try {
                                                    tL_messages_messages2.messages.add(0, messageTLdeserialize);
                                                } catch (Exception e5) {
                                                    e = e5;
                                                    r5 = r8;
                                                }
                                            } else {
                                                tL_messages_messages2 = tL_messages_messages3;
                                                tL_messages_messages2.messages.add(messageTLdeserialize);
                                            }
                                            arrayList5 = arrayList9;
                                            arrayList6 = arrayList;
                                            MessagesStorage.addUsersAndChatsFromMessage(messageTLdeserialize, arrayList5, arrayList6, null);
                                        } else {
                                            tL_messages_messages2 = tL_messages_messages3;
                                            arrayList5 = arrayList9;
                                            arrayList6 = arrayList;
                                            j2 = clientUserId;
                                        }
                                        arrayList9 = arrayList5;
                                        clientUserId = j2;
                                        arrayList = arrayList6;
                                        tL_messages_messages3 = tL_messages_messages2;
                                    }
                                    tL_messages_messages = tL_messages_messages3;
                                    arrayList2 = arrayList9;
                                    arrayList3 = arrayList;
                                    j = clientUserId;
                                    sQLiteCursorQueryFinalized2.dispose();
                                    if (r8.val$tag != null && !hashSet.isEmpty()) {
                                        for (Long l : hashSet) {
                                            jLongValue = l.longValue();
                                            i = 0;
                                            while (true) {
                                                if (i < tL_messages_messages.messages.size()) {
                                                    sQLiteDatabase2 = sQLiteDatabase;
                                                    i = -1;
                                                    break;
                                                } else {
                                                    sQLiteDatabase2 = sQLiteDatabase;
                                                    if (tL_messages_messages.messages.get(i).grouped_id == jLongValue) {
                                                        break;
                                                    }
                                                    i++;
                                                    sQLiteDatabase = sQLiteDatabase2;
                                                }
                                            }
                                            if (i < 0) {
                                                sQLiteDatabase = sQLiteDatabase2;
                                            } else {
                                                sQLiteDatabase = sQLiteDatabase2;
                                                sQLiteCursorQueryFinalized3 = sQLiteDatabase.queryFinalized("SELECT data, mid FROM messages_v2 WHERE uid = ? AND group_id = ? ORDER BY mid DESC", Long.valueOf(r8.val$uid), l);
                                                arrayList4 = new ArrayList();
                                                while (sQLiteCursorQueryFinalized3.next()) {
                                                    iIntValue = sQLiteCursorQueryFinalized3.intValue(1);
                                                    nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized3.byteBufferValue(0);
                                                    if (nativeByteBufferByteBufferValue == null) {
                                                        TLRPC.Message messageTLdeserialize2 = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                                                        messageTLdeserialize2.readAttachPath(nativeByteBufferByteBufferValue, j);
                                                        nativeByteBufferByteBufferValue.reuse();
                                                        messageTLdeserialize2.id = iIntValue;
                                                        messageTLdeserialize2.dialog_id = r8.val$uid;
                                                        arrayList4.add(messageTLdeserialize2);
                                                        MessagesStorage.addUsersAndChatsFromMessage(messageTLdeserialize2, arrayList2, arrayList3, null);
                                                    }
                                                }
                                                if (z) {
                                                    Collections.reverse(arrayList4);
                                                }
                                                tL_messages_messages.messages.remove(i);
                                                tL_messages_messages.messages.addAll(i, arrayList4);
                                                sQLiteCursorQueryFinalized3.dispose();
                                            }
                                        }
                                    }
                                    if (!arrayList2.isEmpty()) {
                                        MediaDataController.this.getMessagesStorage().getUsersInternal(arrayList2, tL_messages_messages.users);
                                    }
                                    if (!arrayList3.isEmpty()) {
                                        MediaDataController.this.getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList3), tL_messages_messages.chats);
                                    }
                                    if (tL_messages_messages.messages.size() <= r8.val$count && r8.val$min_id == 0) {
                                        ArrayList<TLRPC.Message> arrayList10 = tL_messages_messages.messages;
                                        arrayList10.remove(arrayList10.size() - 1);
                                    } else if (r8.val$min_id != 0) {
                                        z4 = false;
                                    } else {
                                        z4 = z2;
                                    }
                                    AndroidUtilities.runOnUIThread(new FileLoader$$ExternalSyntheticLambda5((Object) r8, (Object) r8, r8.val$classGuid, 2));
                                    MediaDataController.this.processLoadedMedia(tL_messages_messages, r8.val$uid, r8.val$count, r8.val$max_id, r8.val$min_id, r8.val$type, r8.val$topicId, r8.val$fromCache, r8.val$classGuid, r8.val$isChannel, z4, r8.val$requestIndex);
                                } catch (Exception e6) {
                                    e = e6;
                                    r7 = this;
                                } catch (Throwable th5) {
                                    th = th5;
                                    r6 = this;
                                }
                            }
                            z2 = true;
                            anonymousClass2 = anonymousClass1;
                            sQLiteCursorQueryFinalized2 = sQLiteCursorQueryFinalized;
                            r8 = anonymousClass2;
                            if (r8.val$tag != null) {
                                hashSet = new HashSet();
                            } else {
                                hashSet = null;
                            }
                            while (sQLiteCursorQueryFinalized2.next()) {
                                nativeByteBufferByteBufferValue2 = sQLiteCursorQueryFinalized2.byteBufferValue(0);
                                if (nativeByteBufferByteBufferValue2 != null) {
                                    messageTLdeserialize = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue2, nativeByteBufferByteBufferValue2.readInt32(false), false);
                                    j2 = clientUserId;
                                    messageTLdeserialize.readAttachPath(nativeByteBufferByteBufferValue2, j2);
                                    nativeByteBufferByteBufferValue2.reuse();
                                    messageTLdeserialize.id = sQLiteCursorQueryFinalized2.intValue(1);
                                    j3 = r8.val$uid;
                                    messageTLdeserialize.dialog_id = j3;
                                    if (DialogObject.isEncryptedDialog(j3)) {
                                        messageTLdeserialize.random_id = sQLiteCursorQueryFinalized2.longValue(2);
                                    }
                                    j4 = messageTLdeserialize.grouped_id;
                                    if (j4 != 0) {
                                        hashSet.add(Long.valueOf(j4));
                                    }
                                    if (z) {
                                        tL_messages_messages2 = tL_messages_messages3;
                                        tL_messages_messages2.messages.add(0, messageTLdeserialize);
                                    } else {
                                        tL_messages_messages2 = tL_messages_messages3;
                                        tL_messages_messages2.messages.add(messageTLdeserialize);
                                    }
                                    arrayList5 = arrayList9;
                                    arrayList6 = arrayList;
                                    MessagesStorage.addUsersAndChatsFromMessage(messageTLdeserialize, arrayList5, arrayList6, null);
                                } else {
                                    tL_messages_messages2 = tL_messages_messages3;
                                    arrayList5 = arrayList9;
                                    arrayList6 = arrayList;
                                    j2 = clientUserId;
                                }
                                arrayList9 = arrayList5;
                                clientUserId = j2;
                                arrayList = arrayList6;
                                tL_messages_messages3 = tL_messages_messages2;
                            }
                            tL_messages_messages = tL_messages_messages3;
                            arrayList2 = arrayList9;
                            arrayList3 = arrayList;
                            j = clientUserId;
                            sQLiteCursorQueryFinalized2.dispose();
                            if (r8.val$tag != null) {
                                while (r1.hasNext()) {
                                    jLongValue = l.longValue();
                                    i = 0;
                                    while (true) {
                                        if (i < tL_messages_messages.messages.size()) {
                                            sQLiteDatabase2 = sQLiteDatabase;
                                            i = -1;
                                            break;
                                        }
                                        sQLiteDatabase2 = sQLiteDatabase;
                                        if (tL_messages_messages.messages.get(i).grouped_id == jLongValue) {
                                            break;
                                            break;
                                        } else {
                                            i++;
                                            sQLiteDatabase = sQLiteDatabase2;
                                        }
                                    }
                                    if (i < 0) {
                                        sQLiteDatabase = sQLiteDatabase2;
                                    } else {
                                        sQLiteDatabase = sQLiteDatabase2;
                                        sQLiteCursorQueryFinalized3 = sQLiteDatabase.queryFinalized("SELECT data, mid FROM messages_v2 WHERE uid = ? AND group_id = ? ORDER BY mid DESC", Long.valueOf(r8.val$uid), l);
                                        arrayList4 = new ArrayList();
                                        while (sQLiteCursorQueryFinalized3.next()) {
                                            iIntValue = sQLiteCursorQueryFinalized3.intValue(1);
                                            nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized3.byteBufferValue(0);
                                            if (nativeByteBufferByteBufferValue == null) {
                                                TLRPC.Message messageTLdeserialize3 = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                                                messageTLdeserialize3.readAttachPath(nativeByteBufferByteBufferValue, j);
                                                nativeByteBufferByteBufferValue.reuse();
                                                messageTLdeserialize3.id = iIntValue;
                                                messageTLdeserialize3.dialog_id = r8.val$uid;
                                                arrayList4.add(messageTLdeserialize3);
                                                MessagesStorage.addUsersAndChatsFromMessage(messageTLdeserialize3, arrayList2, arrayList3, null);
                                            }
                                        }
                                        if (z) {
                                            Collections.reverse(arrayList4);
                                        }
                                        tL_messages_messages.messages.remove(i);
                                        tL_messages_messages.messages.addAll(i, arrayList4);
                                        sQLiteCursorQueryFinalized3.dispose();
                                    }
                                }
                            }
                            if (!arrayList2.isEmpty()) {
                                MediaDataController.this.getMessagesStorage().getUsersInternal(arrayList2, tL_messages_messages.users);
                            }
                            if (!arrayList3.isEmpty()) {
                                MediaDataController.this.getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList3), tL_messages_messages.chats);
                            }
                            if (tL_messages_messages.messages.size() <= r8.val$count) {
                                if (r8.val$min_id != 0) {
                                    z4 = false;
                                } else {
                                    z4 = z2;
                                }
                            } else if (r8.val$min_id != 0) {
                                z4 = false;
                            } else {
                                z4 = z2;
                            }
                            AndroidUtilities.runOnUIThread(new FileLoader$$ExternalSyntheticLambda5((Object) r8, (Object) r8, r8.val$classGuid, 2));
                            MediaDataController.this.processLoadedMedia(tL_messages_messages, r8.val$uid, r8.val$count, r8.val$max_id, r8.val$min_id, r8.val$type, r8.val$topicId, r8.val$fromCache, r8.val$classGuid, r8.val$isChannel, z4, r8.val$requestIndex);
                        } catch (Exception e7) {
                            e = e7;
                            r7 = r8;
                        } catch (Throwable th6) {
                            th = th6;
                            r6 = r8;
                        }
                    } catch (Exception e8) {
                        e = e8;
                    } catch (Throwable th7) {
                        th = th7;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    r4 = r8;
                }
            } catch (Exception e9) {
                e = e9;
                r5 = anonymousClass4;
            } catch (Throwable th9) {
                th = th9;
                r4 = anonymousClass4;
            }
        }
    }

    public class AnonymousClass2 implements Runnable {
        final ArrayList val$previewItems;

        public AnonymousClass2(ArrayList arrayList) {
            this.val$previewItems = arrayList;
        }

        public void lambda$run$0(ArrayList arrayList) {
            MediaDataController.this.defaultEmojiThemes.clear();
            MediaDataController.this.defaultEmojiThemes.addAll(arrayList);
        }

        @Override
        public void run() {
            for (int i = 0; i < this.val$previewItems.size(); i++) {
                if (this.val$previewItems.get(i) != null && ((ChatThemeBottomSheet.ChatThemeItem) this.val$previewItems.get(i)).chatTheme != null) {
                    ((ChatThemeBottomSheet.ChatThemeItem) this.val$previewItems.get(i)).chatTheme.loadPreviewColors(0);
                }
            }
            AndroidUtilities.runOnUIThread(new ImageLoader$$ExternalSyntheticLambda5(8, this, this.val$previewItems));
        }
    }

    public class AnonymousClass3 implements Runnable {
        final int val$currentAccount;
        final ArrayList val$previewItems;

        public AnonymousClass3(ArrayList arrayList, int i) {
            this.val$previewItems = arrayList;
            this.val$currentAccount = i;
        }

        public void lambda$run$0(ArrayList arrayList) {
            MediaDataController.this.defaultEmojiThemes.clear();
            MediaDataController.this.defaultEmojiThemes.addAll(arrayList);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.emojiPreviewThemesChanged, new Object[0]);
        }

        @Override
        public void run() {
            for (int i = 0; i < this.val$previewItems.size(); i++) {
                ((ChatThemeBottomSheet.ChatThemeItem) this.val$previewItems.get(i)).chatTheme.loadPreviewColors(this.val$currentAccount);
            }
            AndroidUtilities.runOnUIThread(new ImageLoader$$ExternalSyntheticLambda5(9, this, this.val$previewItems));
        }
    }

    public static class DraftVoice {
        public long id;
        public boolean once;
        public String path;
        public short[] recordSamples;
        public long recordTimeCount;
        public long samplesCount;
        public int writedFrame;
        public float left = 0.0f;
        public float right = 1.0f;

        public static DraftVoice fromString(String str) {
            if (str == null) {
                return null;
            }
            try {
                if (!str.startsWith("@")) {
                    return null;
                }
                boolean z = true;
                String[] strArrSplit = str.substring(1).split("\n");
                if (strArrSplit.length < 6) {
                    return null;
                }
                DraftVoice draftVoice = new DraftVoice();
                int i = 0;
                draftVoice.path = strArrSplit[0];
                draftVoice.samplesCount = Long.parseLong(strArrSplit[1]);
                draftVoice.writedFrame = Integer.parseInt(strArrSplit[2]);
                draftVoice.recordTimeCount = Long.parseLong(strArrSplit[3]);
                if (strArrSplit[4].contains(";")) {
                    String[] strArrSplit2 = strArrSplit[4].split(";");
                    draftVoice.once = Integer.parseInt(strArrSplit2[0]) != 0;
                    draftVoice.left = Float.parseFloat(strArrSplit2[1]);
                    draftVoice.right = Float.parseFloat(strArrSplit2[2]);
                } else {
                    if (Integer.parseInt(strArrSplit[4]) == 0) {
                        z = false;
                    }
                    draftVoice.once = z;
                    draftVoice.left = 0.0f;
                    draftVoice.right = 1.0f;
                }
                int length = strArrSplit.length - 5;
                String[] strArr = new String[length];
                for (int i2 = 0; i2 < length; i2++) {
                    strArr[i2] = strArrSplit[i2 + 5];
                }
                String strJoin = TextUtils.join("\n", strArr);
                draftVoice.recordSamples = new short[strJoin.length()];
                while (true) {
                    short[] sArr = draftVoice.recordSamples;
                    if (i >= sArr.length) {
                        return draftVoice;
                    }
                    sArr[i] = (short) strJoin.charAt(i);
                    i++;
                }
            } catch (Exception e) {
                FileLog.e(e);
                return null;
            }
        }

        public static DraftVoice of(MediaController mediaController, String str, boolean z, float f, float f2) {
            if (mediaController.recordingAudio == null) {
                return null;
            }
            DraftVoice draftVoice = new DraftVoice();
            draftVoice.path = str;
            draftVoice.samplesCount = mediaController.samplesCount;
            draftVoice.writedFrame = mediaController.writtenFrame;
            draftVoice.recordTimeCount = mediaController.recordTimeCount;
            draftVoice.id = mediaController.recordingAudio.id;
            draftVoice.recordSamples = mediaController.recordSamples;
            draftVoice.once = z;
            draftVoice.left = f;
            draftVoice.right = f2;
            return draftVoice;
        }

        public String toString() {
            char[] cArr = new char[this.recordSamples.length];
            int i = 0;
            while (true) {
                short[] sArr = this.recordSamples;
                if (i >= sArr.length) {
                    return "@" + this.path + "\n" + this.samplesCount + "\n" + this.writedFrame + "\n" + this.recordTimeCount + "\n" + (this.once ? 1 : 0) + ";" + this.left + ";" + this.right + "\n" + new String(cArr);
                }
                cArr[i] = (char) sArr[i];
                i++;
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
        public final String q;

        public SearchStickersKey(boolean z, String str, String str2) {
            this.emojis = z;
            this.lang_code = str;
            this.q = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                SearchStickersKey searchStickersKey = (SearchStickersKey) obj;
                if (this.emojis == searchStickersKey.emojis && Objects.equals(this.lang_code, searchStickersKey.lang_code) && Objects.equals(this.q, searchStickersKey.q)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Boolean.valueOf(this.emojis), this.lang_code, this.q);
        }
    }

    static {
        for (int i = 0; i < 4; i++) {
            lockObjects[i] = new Object();
        }
        SHORTCUT_TYPE_USER_OR_CHAT = 0;
        SHORTCUT_TYPE_ATTACHED_BOT = 1;
        entityComparator = new Emoji$$ExternalSyntheticLambda0(8);
    }

    public MediaDataController(int i) {
        boolean zStartsWith;
        super(i);
        this.attachMenuBots = new TLRPC.TL_attachMenuBots();
        this.reactionsList = new ArrayList();
        this.enabledReactionsList = new ArrayList();
        this.reactionsMap = new HashMap<>();
        this.stickerSets = new ArrayList[]{new ArrayList<>(), new ArrayList<>(), new ArrayList<>(0), new ArrayList<>(), new ArrayList<>(), new ArrayList<>()};
        this.stickersByIds = new LongSparseArray[]{new LongSparseArray(), new LongSparseArray(), new LongSparseArray(), new LongSparseArray(), new LongSparseArray(), new LongSparseArray()};
        this.stickerSetsById = new LongSparseArray();
        this.installedStickerSetsById = new LongSparseArray();
        this.installedForceStickerSetsById = new ArrayList<>();
        this.uninstalledForceStickerSetsById = new ArrayList<>();
        this.groupStickerSets = new LongSparseArray();
        this.stickerSetsByName = new ConcurrentHashMap<>(100, 1.0f, 1);
        this.stickerSetDefaultStatuses = null;
        this.stickerSetDefaultChannelStatuses = null;
        this.diceStickerSetsByEmoji = new HashMap<>();
        this.diceEmojiStickerSetsById = new LongSparseArray();
        this.loadingDiceStickerSets = new HashSet<>();
        this.removingStickerSetsUndos = new LongSparseArray();
        this.scheduledLoadStickers = new Runnable[7];
        this.loadingStickers = new boolean[7];
        this.stickersLoaded = new boolean[7];
        this.loadHash = new long[7];
        this.loadDate = new int[7];
        this.ringtoneUploaderHashMap = new HashMap<>();
        this.verifyingMessages = new HashMap<>();
        this.archivedStickersCount = new int[7];
        this.stickersByEmoji = new LongSparseArray();
        this.allStickers = new HashMap<>();
        this.allStickersFeatured = new HashMap<>();
        this.recentStickers = new ArrayList[]{new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>()};
        this.loadingRecentStickers = new boolean[9];
        this.recentStickersLoaded = new boolean[9];
        this.recentGifs = new ArrayList<>();
        this.loadFeaturedHash = new long[2];
        this.loadFeaturedDate = new int[2];
        this.featuredStickerSets = new ArrayList[]{new ArrayList<>(), new ArrayList<>()};
        this.featuredStickerSetsById = new LongSparseArray[]{new LongSparseArray(), new LongSparseArray()};
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
        this.loadingPinnedMessages = new LongSparseArray();
        this.draftsFolderIds = new LongSparseArray();
        this.drafts = new LongSparseArray();
        this.draftMessages = new LongSparseArray();
        this.botInfos = new HashMap<>();
        this.botDialogKeyboards = new LongSparseArray();
        this.botKeyboards = new HashMap<>();
        this.botKeyboardsByMids = new LongSparseArray();
        this.currentFetchingEmoji = new HashMap<>();
        this.fetchedEmoji = new HashSet<>();
        this.triedLoadingEmojipacks = false;
        this.recentReactions = new ArrayList<>();
        this.topReactions = new ArrayList<>();
        this.savedReactions = new ArrayList<>();
        this.draftVoicesLoaded = false;
        this.draftVoices = new LongSparseArray();
        this.loadingSearchStickersKeys = new HashMap<>();
        this.searchStickerResults = new android.util.LruCache<>(25);
        if (this.currentAccount == 0) {
            this.draftPreferences = ApplicationLoader.applicationContext.getSharedPreferences("drafts", 0);
        } else {
            this.draftPreferences = ApplicationLoader.applicationContext.getSharedPreferences("drafts" + this.currentAccount, 0);
        }
        ArrayList<TLRPC.Message> arrayList = new ArrayList<>();
        for (Map.Entry<String, ?> entry : this.draftPreferences.getAll().entrySet()) {
            try {
                String key = entry.getKey();
                long jLongValue = Utilities.parseLong(key).longValue();
                SerializedData serializedData = new SerializedData(Utilities.hexToBytes((String) entry.getValue()));
                if (key.startsWith("r_")) {
                    zStartsWith = false;
                } else {
                    zStartsWith = key.startsWith("rt_");
                    if (!zStartsWith) {
                        TLRPC.DraftMessage draftMessageTLdeserialize = TLRPC.DraftMessage.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                        if (draftMessageTLdeserialize != null) {
                            LongSparseArray longSparseArray = (LongSparseArray) this.drafts.get(jLongValue);
                            if (longSparseArray == null) {
                                longSparseArray = new LongSparseArray();
                                this.drafts.put(longSparseArray, jLongValue);
                            }
                            longSparseArray.put(draftMessageTLdeserialize, key.startsWith("t_") ? Utilities.parseLong(key.substring(key.lastIndexOf(95) + 1)).longValue() : 0L);
                        }
                    }
                    serializedData.cleanup();
                }
                TLRPC.Message messageTLdeserialize = TLRPC.Message.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                if (messageTLdeserialize != null) {
                    messageTLdeserialize.readAttachPath(serializedData, getUserConfig().clientUserId);
                    LongSparseArray longSparseArray2 = (LongSparseArray) this.draftMessages.get(jLongValue);
                    if (longSparseArray2 == null) {
                        longSparseArray2 = new LongSparseArray();
                        this.draftMessages.put(longSparseArray2, jLongValue);
                    }
                    longSparseArray2.put(messageTLdeserialize, zStartsWith ? Utilities.parseInt((CharSequence) key.substring(key.lastIndexOf(95) + 1)).intValue() : 0);
                    if (messageTLdeserialize.reply_to != null) {
                        arrayList.add(messageTLdeserialize);
                    }
                }
                serializedData.cleanup();
            } catch (Exception unused) {
            }
        }
        loadRepliesOfDraftReplies(arrayList);
        loadStickersByEmojiOrName("tg_placeholders_android", false, true);
        loadEmojiThemes();
        loadRecentAndTopReactions(false);
        loadAvatarConstructor(false);
        loadAvatarConstructor(true);
        this.ringtoneDataStore = new RingtoneDataStore(this.currentAccount);
        this.menuBotsUpdateDate = getMessagesController().getMainSettings().getInt("menuBotsUpdateDate", 0);
    }

    public static void addAnimatedEmojiSpans(ArrayList<TLRPC.MessageEntity> arrayList, CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt) {
        AnimatedEmojiSpan animatedEmojiSpan;
        if (!(charSequence instanceof Spannable) || arrayList == null) {
            return;
        }
        Spannable spannable = (Spannable) charSequence;
        for (AnimatedEmojiSpan animatedEmojiSpan2 : (AnimatedEmojiSpan[]) spannable.getSpans(0, spannable.length(), AnimatedEmojiSpan.class)) {
            if (animatedEmojiSpan2 != null) {
                spannable.removeSpan(animatedEmojiSpan2);
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC.MessageEntity messageEntity = arrayList.get(i);
            if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                int i2 = messageEntity.offset;
                int i3 = messageEntity.length + i2;
                if (i2 < i3 && i3 <= spannable.length()) {
                    if (tL_messageEntityCustomEmoji.document != null) {
                        TLRPC.Document document = tL_messageEntityCustomEmoji.document;
                        animatedEmojiSpan = new AnimatedEmojiSpan(document.id, 1.2f, fontMetricsInt);
                        animatedEmojiSpan.document = document;
                    } else {
                        animatedEmojiSpan = new AnimatedEmojiSpan(tL_messageEntityCustomEmoji.document_id, 1.2f, fontMetricsInt);
                    }
                    spannable.setSpan(animatedEmojiSpan, i2, i3, 33);
                }
            }
        }
    }

    public static void addStyleToText(TextStyleSpan textStyleSpan, int i, int i2, Spannable spannable, boolean z) {
        TextStyleSpan.TextStyleRun textStyleRun;
        int i3;
        try {
            int i4 = i;
            int i5 = i2;
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) spannable.getSpans(i4, i5, CharacterStyle.class);
            if (characterStyleArr != null && characterStyleArr.length > 0) {
                int i6 = 0;
                int i7 = 0;
                while (i7 < characterStyleArr.length) {
                    CharacterStyle characterStyle = characterStyleArr[i7];
                    TextStyleSpan.TextStyleRun textStyleRun2 = textStyleSpan != null ? textStyleSpan.style : new TextStyleSpan.TextStyleRun();
                    if (characterStyle instanceof TextStyleSpan) {
                        textStyleRun = ((TextStyleSpan) characterStyle).style;
                    } else {
                        if (characterStyle instanceof URLSpanReplacement) {
                            textStyleRun = ((URLSpanReplacement) characterStyle).style;
                            if (textStyleRun == null) {
                                textStyleRun = new TextStyleSpan.TextStyleRun();
                            }
                        }
                        i7++;
                        i6 = 0;
                    }
                    if (textStyleRun != null) {
                        int spanStart = spannable.getSpanStart(characterStyle);
                        int spanEnd = spannable.getSpanEnd(characterStyle);
                        spannable.removeSpan(characterStyle);
                        if (spanStart <= i4 || i5 <= spanEnd) {
                            if (spanStart > i4) {
                                i3 = i4;
                            } else {
                                if (spanStart != i4) {
                                    spannable.setSpan(createNewSpan(characterStyle, textStyleRun, null, z), spanStart, i4, 33);
                                }
                                if (spanEnd > i4) {
                                    if (textStyleSpan != null) {
                                        spannable.setSpan(createNewSpan(characterStyle, textStyleRun, textStyleRun2, z), i4, Math.min(spanEnd, i5), 33);
                                    }
                                    i3 = spanEnd;
                                } else {
                                    i3 = i4;
                                }
                            }
                            if (spanEnd >= i5) {
                                if (spanEnd != i5) {
                                    spannable.setSpan(createNewSpan(characterStyle, textStyleRun, null, z), i5, spanEnd, 33);
                                }
                                if (i5 > spanStart && spanEnd <= i4) {
                                    if (textStyleSpan != null) {
                                        spannable.setSpan(createNewSpan(characterStyle, textStyleRun, textStyleRun2, z), spanStart, Math.min(spanEnd, i5), 33);
                                    }
                                    i4 = i3;
                                }
                            }
                            i4 = i3;
                        } else {
                            spannable.setSpan(createNewSpan(characterStyle, textStyleRun, textStyleRun2, z), spanStart, spanEnd, 33);
                            if (textStyleSpan != null) {
                                spannable.setSpan(new TextStyleSpan(new TextStyleSpan.TextStyleRun(textStyleRun2), i6), spanEnd, i5, 33);
                            }
                        }
                        i5 = spanStart;
                    }
                    i7++;
                    i6 = 0;
                }
            }
            if (textStyleSpan == null || i4 >= i5 || i4 >= spannable.length()) {
                return;
            }
            spannable.setSpan(textStyleSpan, i4, Math.min(spannable.length(), i5), 33);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void addTextStyleRuns(MessageObject messageObject, Spannable spannable) {
        addTextStyleRuns(messageObject.messageOwner.entities, messageObject.messageText, spannable, -1);
    }

    private ArrayList<MessageObject> broadcastPinnedMessage(ArrayList<TLRPC.Message> arrayList, ArrayList<TLRPC.User> arrayList2, ArrayList<TLRPC.Chat> arrayList3, boolean z, boolean z2) {
        if (arrayList.isEmpty()) {
            return null;
        }
        LongSparseArray longSparseArray = new LongSparseArray();
        for (int i = 0; i < arrayList2.size(); i++) {
            TLRPC.User user = arrayList2.get(i);
            longSparseArray.put(user, user.id);
        }
        LongSparseArray longSparseArray2 = new LongSparseArray();
        for (int i2 = 0; i2 < arrayList3.size(); i2++) {
            TLRPC.Chat chat = arrayList3.get(i2);
            longSparseArray2.put(chat, chat.id);
        }
        ArrayList<MessageObject> arrayList4 = new ArrayList<>();
        if (!z2) {
            AndroidUtilities.runOnUIThread(new MentionsAdapter$$ExternalSyntheticLambda10(this, arrayList2, z, arrayList3, arrayList, arrayList4, longSparseArray, longSparseArray2));
            return null;
        }
        AndroidUtilities.runOnUIThread(new CacheFetcher$$ExternalSyntheticLambda0(this, arrayList2, z, arrayList3, 9));
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        while (i4 < size) {
            TLRPC.Message message = arrayList.get(i4);
            if ((MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaDocument) || (MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaPhoto)) {
                i3++;
            }
            LongSparseArray longSparseArray3 = longSparseArray2;
            int i5 = i3;
            arrayList4.add(new MessageObject(this.currentAccount, message, longSparseArray, longSparseArray3, false, i5 < 30));
            i4++;
            longSparseArray2 = longSparseArray3;
            i3 = i5;
        }
        return arrayList4;
    }

    private void broadcastReplyMessages(ArrayList<TLRPC.Message> arrayList, LongSparseArray longSparseArray, ArrayList<TLRPC.User> arrayList2, ArrayList<TLRPC.Chat> arrayList3, long j, boolean z) {
        LongSparseArray longSparseArray2 = new LongSparseArray();
        for (int i = 0; i < arrayList2.size(); i++) {
            TLRPC.User user = arrayList2.get(i);
            longSparseArray2.put(user, user.id);
        }
        LongSparseArray longSparseArray3 = new LongSparseArray();
        for (int i2 = 0; i2 < arrayList3.size(); i2++) {
            TLRPC.Chat chat = arrayList3.get(i2);
            longSparseArray3.put(chat, chat.id);
        }
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList4.add(new MessageObject(this.currentAccount, arrayList.get(i3), longSparseArray2, longSparseArray3, false, false));
        }
        AndroidUtilities.runOnUIThread(new TranslateController$$ExternalSyntheticLambda2(this, arrayList2, z, arrayList3, arrayList4, longSparseArray, j));
    }

    public static long calcDocumentsHash(ArrayList<TLRPC.Document> arrayList) {
        return calcDocumentsHash(arrayList, 200);
    }

    private long calcFeaturedStickersHash(boolean z, ArrayList<TLRPC.StickerSetCovered> arrayList) {
        long jCalcHash = 0;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC.StickerSet stickerSet = arrayList.get(i).set;
                if (!stickerSet.archived) {
                    jCalcHash = calcHash(jCalcHash, stickerSet.id);
                    if (this.unreadStickerSets[z ? 1 : 0].contains(Long.valueOf(stickerSet.id))) {
                        jCalcHash = calcHash(jCalcHash, 1L);
                    }
                }
            }
        }
        return jCalcHash;
    }

    public static long calcHash(long j, long j2) {
        long j3 = j ^ (j >>> 21);
        long j4 = j3 ^ (j3 << 35);
        return (j4 ^ (j4 >>> 4)) + j2;
    }

    private static long calcStickersHash(ArrayList<TLRPC.TL_messages_stickerSet> arrayList) {
        long jCalcHash = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) != null) {
                TLRPC.StickerSet stickerSet = arrayList.get(i).set;
                if (!stickerSet.archived) {
                    jCalcHash = calcHash(jCalcHash, stickerSet.hash);
                }
            }
        }
        return jCalcHash;
    }

    public static boolean canAddMessageToMedia(TLRPC.Message message) {
        boolean z = message instanceof TLRPC.TL_message_secret;
        if (!z || (!((MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaPhoto) || MessageObject.isVideoMessage(message) || MessageObject.isGifMessage(message)) || MessageObject.getMedia(message).ttl_seconds == 0 || MessageObject.getMedia(message).ttl_seconds > 60)) {
            return (z || !(message instanceof TLRPC.TL_message) || (!((MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaPhoto) || (MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaDocument)) || MessageObject.getMedia(message).ttl_seconds == 0)) && getMediaType(message) != -1;
        }
        return false;
    }

    public static boolean canShowAttachMenuBot(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLObject tLObject) {
        TLRPC.User user = tLObject instanceof TLRPC.User ? (TLRPC.User) tLObject : null;
        TLRPC.Chat chat = tLObject instanceof TLRPC.Chat ? (TLRPC.Chat) tLObject : null;
        ArrayList<TLRPC.AttachMenuPeerType> arrayList = tL_attachMenuBot.peer_types;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TLRPC.AttachMenuPeerType attachMenuPeerType = arrayList.get(i);
            i++;
            TLRPC.AttachMenuPeerType attachMenuPeerType2 = attachMenuPeerType;
            if ((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeSameBotPM) && user != null && user.bot && user.id == tL_attachMenuBot.bot_id) {
                return true;
            }
            if ((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeBotPM) && user != null && user.bot && user.id != tL_attachMenuBot.bot_id) {
                return true;
            }
            if ((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypePM) && user != null && !user.bot) {
                return true;
            }
            if ((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeChat) && chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
                return true;
            }
            if ((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeBroadcast) && chat != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                return true;
            }
        }
        return false;
    }

    public static boolean canShowAttachMenuBotForTarget(TLRPC.TL_attachMenuBot tL_attachMenuBot, String str) {
        ArrayList<TLRPC.AttachMenuPeerType> arrayList = tL_attachMenuBot.peer_types;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TLRPC.AttachMenuPeerType attachMenuPeerType = arrayList.get(i);
            i++;
            TLRPC.AttachMenuPeerType attachMenuPeerType2 = attachMenuPeerType;
            if (((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeSameBotPM) || (attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeBotPM)) && str.equals("bots")) {
                return true;
            }
            if ((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeBroadcast) && str.equals("channels")) {
                return true;
            }
            if ((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeChat) && str.equals("groups")) {
                return true;
            }
            if ((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypePM) && str.equals("users")) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkInclusion(int i, List<TLRPC.MessageEntity> list, boolean z) {
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                TLRPC.MessageEntity messageEntity = list.get(i2);
                if (z) {
                    if (messageEntity.offset >= i) {
                        continue;
                    } else if (messageEntity.offset + messageEntity.length > i) {
                        return true;
                    }
                } else if (messageEntity.offset > i) {
                    continue;
                } else if (messageEntity.offset + messageEntity.length > i) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkIntersection(int i, int i2, List<TLRPC.MessageEntity> list) {
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                TLRPC.MessageEntity messageEntity = list.get(i3);
                int i4 = messageEntity.offset;
                if (i4 > i && i4 + messageEntity.length <= i2) {
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
        getMessagesStorage().getStorageQueue().postRunnable(new MediaDataController$$ExternalSyntheticLambda3(this, 9));
    }

    private Intent createIntrnalAttachedBotShortcutIntent(long j) {
        if (j != 0 && canCreateAttachedMenuBotShortcut(j)) {
            Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) OpenAttachedMenuBotReceiver.class);
            if (DialogObject.isUserDialog(j)) {
                intent.putExtra("botId", j);
                intent.putExtra("currentAccount", this.currentAccount);
                intent.setAction(OpenAttachedMenuBotReceiver.ACTION + j);
                intent.addFlags(67108864);
                return intent;
            }
        }
        return null;
    }

    private Intent createIntrnalShortcutIntent(long j) {
        Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) OpenChatReceiver.class);
        if (DialogObject.isEncryptedDialog(j)) {
            int encryptedChatId = DialogObject.getEncryptedChatId(j);
            intent.putExtra("encId", encryptedChatId);
            if (getMessagesController().getEncryptedChat(Integer.valueOf(encryptedChatId)) == null) {
                return null;
            }
        } else if (DialogObject.isUserDialog(j)) {
            intent.putExtra("userId", j);
        } else {
            if (!DialogObject.isChatDialog(j)) {
                return null;
            }
            intent.putExtra("chatId", -j);
        }
        intent.putExtra("currentAccount", this.currentAccount);
        intent.setAction("com.tmessages.openchat" + j);
        intent.addFlags(67108864);
        return intent;
    }

    private static CharacterStyle createNewSpan(CharacterStyle characterStyle, TextStyleSpan.TextStyleRun textStyleRun, TextStyleSpan.TextStyleRun textStyleRun2, boolean z) {
        TextStyleSpan.TextStyleRun textStyleRun3 = new TextStyleSpan.TextStyleRun(textStyleRun);
        if (textStyleRun2 != null) {
            if (z) {
                textStyleRun3.merge(textStyleRun2);
            } else {
                textStyleRun3.flags = textStyleRun2.flags;
                textStyleRun3.urlEntity = textStyleRun2.urlEntity;
            }
        }
        if (characterStyle instanceof TextStyleSpan) {
            return new TextStyleSpan(textStyleRun3, 0);
        }
        if (characterStyle instanceof URLSpanReplacement) {
            return new URLSpanReplacement(((URLSpanReplacement) characterStyle).getURL(), textStyleRun3);
        }
        return null;
    }

    private void deletePeer(long j, int i) {
        getMessagesStorage().getStorageQueue().postRunnable(new ChatMessageCell$$ExternalSyntheticLambda5(this, j, i, 3));
    }

    public static boolean entitiesEqual(TLRPC.MessageEntity messageEntity, TLRPC.MessageEntity messageEntity2) {
        if (messageEntity.getClass() != messageEntity2.getClass() || messageEntity.offset != messageEntity2.offset || messageEntity.length != messageEntity2.length || !TextUtils.equals(messageEntity.url, messageEntity2.url) || !TextUtils.equals(messageEntity.language, messageEntity2.language)) {
            return false;
        }
        if ((messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) && ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id != ((TLRPC.TL_inputMessageEntityMentionName) messageEntity2).user_id) {
            return false;
        }
        if (!(messageEntity instanceof TLRPC.TL_messageEntityMentionName) || ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id == ((TLRPC.TL_messageEntityMentionName) messageEntity2).user_id) {
            return !(messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) || ((TLRPC.TL_messageEntityCustomEmoji) messageEntity).document_id == ((TLRPC.TL_messageEntityCustomEmoji) messageEntity2).document_id;
        }
        return false;
    }

    private void fetchStickerSetInternal(TLRPC.InputStickerSet inputStickerSet, Utilities.Callback2<Boolean, TLRPC.TL_messages_stickerSet> callback2) {
        if (callback2 == null) {
            return;
        }
        String strInputSetKey = inputSetKey(inputStickerSet);
        ArrayList<Utilities.Callback2<Boolean, TLRPC.TL_messages_stickerSet>> arrayList = this.loadingStickerSets.get(strInputSetKey);
        if (arrayList != null && arrayList.size() > 0) {
            arrayList.add(callback2);
            return;
        }
        if (arrayList == null) {
            HashMap<String, ArrayList<Utilities.Callback2<Boolean, TLRPC.TL_messages_stickerSet>>> map = this.loadingStickerSets;
            ArrayList<Utilities.Callback2<Boolean, TLRPC.TL_messages_stickerSet>> arrayList2 = new ArrayList<>();
            map.put(strInputSetKey, arrayList2);
            arrayList = arrayList2;
        }
        arrayList.add(callback2);
        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
        tL_messages_getStickerSet.stickerset = inputStickerSet;
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new MediaDataController$$ExternalSyntheticLambda10(this, strInputSetKey, 1));
    }

    public static TLRPC.TL_attachMenuBotIcon getAnimatedAttachMenuBotIcon(TLRPC.TL_attachMenuBot tL_attachMenuBot, boolean z) {
        ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList = tL_attachMenuBot.icons;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon = arrayList.get(i);
            i++;
            TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon2 = tL_attachMenuBotIcon;
            if (tL_attachMenuBotIcon2.name.equals(z ? "android_active_animated" : "android_animated")) {
                return tL_attachMenuBotIcon2;
            }
        }
        return null;
    }

    private TLRPC.TL_messages_stickerSet getCachedStickerSetInternal(long j, Integer num) {
        SQLiteCursor sQLiteCursorQueryFinalized;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSetTLdeserialize;
        NativeByteBuffer nativeByteBuffer = null;
        try {
            try {
                sQLiteCursorQueryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT data, hash FROM stickersets2 WHERE id = ? LIMIT 1", Long.valueOf(j));
                try {
                    if (!sQLiteCursorQueryFinalized.next() || sQLiteCursorQueryFinalized.isNull(0)) {
                        tL_messages_stickerSetTLdeserialize = null;
                    } else {
                        NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                        if (nativeByteBufferByteBufferValue != null) {
                            try {
                                tL_messages_stickerSetTLdeserialize = TLRPC.messages_StickerSet.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                                try {
                                    int iIntValue = sQLiteCursorQueryFinalized.intValue(1);
                                    if (num != null && num.intValue() != 0 && num.intValue() != iIntValue) {
                                        nativeByteBufferByteBufferValue.reuse();
                                        sQLiteCursorQueryFinalized.dispose();
                                        return null;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    nativeByteBuffer = nativeByteBufferByteBufferValue;
                                    try {
                                        FileLog.e(th);
                                        return tL_messages_stickerSetTLdeserialize;
                                    } finally {
                                        if (nativeByteBuffer != null) {
                                            nativeByteBuffer.reuse();
                                        }
                                        if (sQLiteCursorQueryFinalized != null) {
                                            sQLiteCursorQueryFinalized.dispose();
                                        }
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                tL_messages_stickerSetTLdeserialize = null;
                            }
                        } else {
                            tL_messages_stickerSetTLdeserialize = null;
                        }
                        nativeByteBuffer = nativeByteBufferByteBufferValue;
                    }
                    if (nativeByteBuffer != null) {
                        nativeByteBuffer.reuse();
                    }
                    sQLiteCursorQueryFinalized.dispose();
                    return tL_messages_stickerSetTLdeserialize;
                } catch (Throwable th3) {
                    th = th3;
                    tL_messages_stickerSetTLdeserialize = null;
                }
            } catch (Throwable th4) {
                th = th4;
                sQLiteCursorQueryFinalized = null;
                tL_messages_stickerSetTLdeserialize = null;
                FileLog.e(th);
                return tL_messages_stickerSetTLdeserialize;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public static TLRPC.InputStickerSet getInputStickerSet(TLRPC.StickerSet stickerSet) {
        if (stickerSet == null) {
            return null;
        }
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_inputStickerSetID.id = stickerSet.id;
        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
        return tL_inputStickerSetID;
    }

    public static TLRPC.TL_inputStickerSetItem getInputStickerSetItem(TLRPC.Document document, String str) {
        TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem = new TLRPC.TL_inputStickerSetItem();
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_inputStickerSetItem.document = tL_inputDocument;
        tL_inputDocument.id = document.id;
        tL_inputDocument.access_hash = document.access_hash;
        tL_inputDocument.file_reference = document.file_reference;
        tL_inputStickerSetItem.emoji = str;
        return tL_inputStickerSetItem;
    }

    public static MediaDataController getInstance(int i) {
        MediaDataController mediaDataController;
        MediaDataController mediaDataController2 = Instance[i];
        if (mediaDataController2 != null) {
            return mediaDataController2;
        }
        synchronized (lockObjects) {
            try {
                mediaDataController = Instance[i];
                if (mediaDataController == null) {
                    MediaDataController[] mediaDataControllerArr = Instance;
                    MediaDataController mediaDataController3 = new MediaDataController(i);
                    mediaDataControllerArr[i] = mediaDataController3;
                    mediaDataController = mediaDataController3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaDataController;
    }

    private void getMediaCountDatabase(long j, long j2, int i, int i2) {
        getMessagesStorage().getStorageQueue().postRunnable(new MessagesStorage$$ExternalSyntheticLambda254(this, j2, j, i, i2, 1));
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
        if (!(media instanceof TLRPC.TL_messageMediaDocument)) {
            if (!message.entities.isEmpty()) {
                for (int i = 0; i < message.entities.size(); i++) {
                    TLRPC.MessageEntity messageEntity = message.entities.get(i);
                    if ((messageEntity instanceof TLRPC.TL_messageEntityUrl) || (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) || (messageEntity instanceof TLRPC.TL_messageEntityEmail)) {
                        return 3;
                    }
                }
            }
            return -1;
        }
        TLRPC.Document document = media.document;
        if (document == null) {
            return -1;
        }
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        for (int i2 = 0; i2 < document.attributes.size(); i2++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i2);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                z = documentAttribute.round_message;
                z3 = !z;
                z2 = z;
            } else if (documentAttribute instanceof TLRPC.TL_documentAttributeAnimated) {
                z4 = true;
            } else if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                z = documentAttribute.voice;
                z6 = !z;
            } else if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                z5 = true;
            }
        }
        if (z || z2) {
            return 2;
        }
        if (z3 && !z4 && !z5) {
            return 0;
        }
        if (z5) {
            return -1;
        }
        if (z4) {
            return 5;
        }
        return z6 ? 4 : 1;
    }

    public static TLRPC.TL_attachMenuBotIcon getPlaceholderStaticAttachMenuBotIcon(TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList = tL_attachMenuBot.icons;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon = arrayList.get(i);
            i++;
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
        int i = 0;
        while (i < size) {
            TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon = arrayList.get(i);
            i++;
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
        int i = 0;
        while (i < size) {
            TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon = arrayList.get(i);
            i++;
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
        int i = 0;
        while (i < size) {
            TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon = arrayList.get(i);
            i++;
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
        for (int i = 0; i < document.attributes.size(); i++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji)) {
                TLRPC.InputStickerSet inputStickerSet = documentAttribute.stickerset;
                if (inputStickerSet instanceof TLRPC.TL_inputStickerSetID) {
                    return inputStickerSet.id;
                }
                return -1L;
            }
        }
        return -1L;
    }

    public static ArrayList<TextStyleSpan.TextStyleRun> getTextStyleRuns(ArrayList<TLRPC.MessageEntity> arrayList, CharSequence charSequence, int i) {
        int i2;
        ArrayList<TextStyleSpan.TextStyleRun> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList(arrayList);
        Collections.sort(arrayList3, new Emoji$$ExternalSyntheticLambda0(10));
        int size = arrayList3.size();
        for (int i3 = 0; i3 < size; i3++) {
            TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList3.get(i3);
            if (messageEntity != null && messageEntity.length > 0 && (i2 = messageEntity.offset) >= 0 && i2 < charSequence.length()) {
                if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                    messageEntity.length = charSequence.length() - messageEntity.offset;
                }
                if (!(messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji)) {
                    TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
                    int i4 = messageEntity.offset;
                    textStyleRun.start = i4;
                    textStyleRun.end = i4 + messageEntity.length;
                    if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                        textStyleRun.flags = 256;
                    } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                        textStyleRun.flags = 8;
                    } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                        textStyleRun.flags = 16;
                    } else if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                        textStyleRun.flags = 1;
                    } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                        textStyleRun.flags = 2;
                    } else if ((messageEntity instanceof TLRPC.TL_messageEntityCode) || (messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                        textStyleRun.flags = 4;
                    } else if ((messageEntity instanceof TLRPC.TL_messageEntityMentionName) || (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName)) {
                        textStyleRun.flags = 64;
                        textStyleRun.urlEntity = messageEntity;
                    } else {
                        textStyleRun.flags = 128;
                        textStyleRun.urlEntity = messageEntity;
                    }
                    if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                        textStyleRun.flags |= 1024;
                    }
                    textStyleRun.flags &= i;
                    int size2 = arrayList2.size();
                    int i5 = 0;
                    while (i5 < size2) {
                        TextStyleSpan.TextStyleRun textStyleRun2 = arrayList2.get(i5);
                        int i6 = textStyleRun.start;
                        int i7 = textStyleRun2.start;
                        if (i6 > i7) {
                            int i8 = textStyleRun2.end;
                            if (i6 < i8) {
                                if (textStyleRun.end < i8) {
                                    TextStyleSpan.TextStyleRun textStyleRun3 = new TextStyleSpan.TextStyleRun(textStyleRun);
                                    textStyleRun3.merge(textStyleRun2);
                                    arrayList2.add(i5 + 1, textStyleRun3);
                                    TextStyleSpan.TextStyleRun textStyleRun4 = new TextStyleSpan.TextStyleRun(textStyleRun2);
                                    textStyleRun4.start = textStyleRun.end;
                                    i5 += 2;
                                    size2 += 2;
                                    arrayList2.add(i5, textStyleRun4);
                                } else {
                                    TextStyleSpan.TextStyleRun textStyleRun5 = new TextStyleSpan.TextStyleRun(textStyleRun);
                                    textStyleRun5.merge(textStyleRun2);
                                    textStyleRun5.end = textStyleRun2.end;
                                    i5++;
                                    size2++;
                                    arrayList2.add(i5, textStyleRun5);
                                }
                                int i9 = textStyleRun.start;
                                textStyleRun.start = textStyleRun2.end;
                                textStyleRun2.end = i9;
                            }
                        } else {
                            int i10 = textStyleRun.end;
                            if (i7 < i10) {
                                int i11 = textStyleRun2.end;
                                if (i10 == i11) {
                                    textStyleRun2.merge(textStyleRun);
                                } else if (i10 < i11) {
                                    TextStyleSpan.TextStyleRun textStyleRun6 = new TextStyleSpan.TextStyleRun(textStyleRun2);
                                    textStyleRun6.merge(textStyleRun);
                                    textStyleRun6.end = textStyleRun.end;
                                    i5++;
                                    size2++;
                                    arrayList2.add(i5, textStyleRun6);
                                    textStyleRun2.start = textStyleRun.end;
                                } else {
                                    TextStyleSpan.TextStyleRun textStyleRun7 = new TextStyleSpan.TextStyleRun(textStyleRun);
                                    textStyleRun7.start = textStyleRun2.end;
                                    i5++;
                                    size2++;
                                    arrayList2.add(i5, textStyleRun7);
                                    textStyleRun2.merge(textStyleRun);
                                }
                                textStyleRun.end = i7;
                            }
                        }
                        i5++;
                    }
                    if (textStyleRun.start < textStyleRun.end) {
                        arrayList2.add(textStyleRun);
                    }
                }
            }
        }
        return arrayList2;
    }

    public static String inputSetKey(TLRPC.InputStickerSet inputStickerSet) {
        if (inputStickerSet instanceof TLRPC.TL_inputStickerSetID) {
            return "id" + inputStickerSet.id + "access_hash" + inputStickerSet.access_hash;
        }
        if (inputStickerSet instanceof TLRPC.TL_inputStickerSetShortName) {
            return "short" + inputStickerSet.short_name;
        }
        if (inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty) {
            return "empty";
        }
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
        }
        if (inputStickerSet instanceof TLRPC.TL_inputStickerSetPremiumGifts) {
            return "premiumGifts";
        }
        if (inputStickerSet instanceof TLRPC.TL_inputStickerSetEmojiDefaultTopicIcons) {
            return "defaultTopicIcons";
        }
        if (inputStickerSet instanceof TLRPC.TL_inputStickerSetEmojiDefaultStatuses) {
            return "emojiDefaultStatuses";
        }
        return inputStickerSet instanceof TLRPC.TL_inputStickerSetTonGifts ? "tonGifts" : "null";
    }

    public void lambda$addRecentGif$26(TLRPC.Document document) {
        try {
            getMessagesStorage().getDatabase().executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document.id + "' AND type = 2").stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void lambda$addRecentGif$27(TLRPC.Document document) {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 0, document, 7);
    }

    public void lambda$addRecentSticker$20() {
        getMediaDataController().loadRecents(2, false, false, true);
    }

    public void lambda$addRecentSticker$21(Object obj, TLRPC.TL_messages_faveSticker tL_messages_faveSticker, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null || !FileRefController.isFileRefError(tL_error.text) || obj == null) {
            AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda3(this, 3));
        } else {
            getFileRefController().requestReference(obj, tL_messages_faveSticker);
        }
    }

    public void lambda$addRecentSticker$22(Object obj, TLRPC.TL_messages_saveRecentSticker tL_messages_saveRecentSticker, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null || !FileRefController.isFileRefError(tL_error.text) || obj == null) {
            return;
        }
        getFileRefController().requestReference(obj, tL_messages_saveRecentSticker);
    }

    public void lambda$addRecentSticker$23(int i, TLRPC.Document document) {
        int i2;
        if (i == 0) {
            i2 = 3;
        } else if (i == 1) {
            i2 = 4;
        } else {
            i2 = i == 5 ? 7 : 5;
        }
        try {
            getMessagesStorage().getDatabase().executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document.id + "' AND type = " + i2).stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$broadcastPinnedMessage$167(ArrayList arrayList, boolean z, ArrayList arrayList2) {
        getMessagesController().putUsers(arrayList, z);
        getMessagesController().putChats(arrayList2, z);
    }

    public void lambda$broadcastPinnedMessage$168(ArrayList arrayList) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(((MessageObject) arrayList.get(0)).getDialogId()), null, Boolean.TRUE, arrayList, null, 0, -1, Boolean.FALSE);
    }

    public void lambda$broadcastPinnedMessage$169(ArrayList arrayList, boolean z, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, LongSparseArray longSparseArray, LongSparseArray longSparseArray2) {
        getMessagesController().putUsers(arrayList, z);
        getMessagesController().putChats(arrayList2, z);
        int size = arrayList3.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            TLRPC.Message message = (TLRPC.Message) arrayList3.get(i2);
            if ((MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaDocument) || (MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaPhoto)) {
                i++;
            }
            arrayList4.add(new MessageObject(this.currentAccount, message, longSparseArray, longSparseArray2, false, i < 30));
        }
        AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda70(this, arrayList4, 0));
    }

    public void lambda$broadcastReplyMessages$179(ArrayList arrayList, boolean z, ArrayList arrayList2, ArrayList arrayList3, LongSparseArray longSparseArray, long j) {
        ArrayList arrayList4;
        getMessagesController().putUsers(arrayList, z);
        getMessagesController().putChats(arrayList2, z);
        int size = arrayList3.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            MessageObject messageObject = (MessageObject) arrayList3.get(i);
            SparseArray sparseArray = (SparseArray) longSparseArray.get(messageObject.getDialogId());
            if (sparseArray != null && (arrayList4 = (ArrayList) sparseArray.get(messageObject.getId())) != null) {
                for (int i2 = 0; i2 < arrayList4.size(); i2++) {
                    MessageObject messageObject2 = (MessageObject) arrayList4.get(i2);
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
                z2 = true;
            }
        }
        if (z2) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.replyMessagesDidLoad, Long.valueOf(j), arrayList3, longSparseArray);
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
        AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda74(this, tLObject, 0));
    }

    public void lambda$checkGenericAnimations$79(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            getUserConfig().genericAnimationsStickerPack = tL_messages_stickerSet.set.short_name;
            getUserConfig().lastUpdatedGenericAnimations = System.currentTimeMillis();
            getUserConfig().saveConfig(false);
            processLoadedDiceStickers(getUserConfig().genericAnimationsStickerPack, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
            for (int i = 0; i < tL_messages_stickerSet.documents.size(); i++) {
                if (this.currentAccount == UserConfig.selectedAccount) {
                    preloadImage(ImageLocation.getForDocument(tL_messages_stickerSet.documents.get(i)), 0);
                }
            }
        }
    }

    public void lambda$checkGenericAnimations$80(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda74(this, tLObject, 5));
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
        AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda74(this, tLObject, 1));
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
        AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda74(this, tLObject, 3));
    }

    public static void lambda$cleanup$1() {
        try {
            FragmentManager.FragmentIntentSenderContract.removeAllDynamicShortcuts(ApplicationLoader.applicationContext);
        } catch (Exception e) {
            FileLog.e(e);
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
            long jCurrentTimeMillis = System.currentTimeMillis() - 604800000;
            getMessagesStorage().getDatabase().executeFast("DELETE FROM stickersets2 WHERE date < " + jCurrentTimeMillis).stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$clearBotKeyboard$193(ArrayList arrayList, MessagesStorage.TopicKey topicKey) {
        if (arrayList == null) {
            if (topicKey != null) {
                this.botKeyboards.remove(topicKey);
                this.botDialogKeyboards.remove(topicKey.dialogId);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botKeyboardDidLoad, null, topicKey);
                return;
            }
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            int iIntValue = ((Integer) arrayList.get(i)).intValue();
            long j = iIntValue;
            MessagesStorage.TopicKey topicKey2 = (MessagesStorage.TopicKey) this.botKeyboardsByMids.get(j);
            if (topicKey2 != null) {
                this.botKeyboards.remove(topicKey2);
                ArrayList arrayList2 = (ArrayList) this.botDialogKeyboards.get(topicKey2.dialogId);
                if (arrayList2 != null) {
                    int i2 = 0;
                    while (i2 < arrayList2.size()) {
                        TLRPC.Message message = (TLRPC.Message) arrayList2.get(i2);
                        if (message == null || message.id == iIntValue) {
                            arrayList2.remove(i2);
                            i2--;
                        }
                        i2++;
                    }
                    if (arrayList2.isEmpty()) {
                        this.botDialogKeyboards.remove(topicKey2.dialogId);
                    }
                }
                this.botKeyboardsByMids.remove(j);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botKeyboardDidLoad, null, topicKey2);
            }
        }
    }

    public void lambda$clearBotKeyboard$194(long j) {
        ArrayList arrayList = (ArrayList) this.botDialogKeyboards.get(j);
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC.Message message = (TLRPC.Message) arrayList.get(i);
                int i2 = this.currentAccount;
                MessagesStorage.TopicKey topicKeyOf = MessagesStorage.TopicKey.of(j, MessageObject.getTopicId(i2, message, ChatObject.isForum(i2, j)));
                this.botKeyboards.remove(topicKeyOf);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botKeyboardDidLoad, null, topicKeyOf);
            }
        }
        this.botDialogKeyboards.remove(j);
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
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$clearRecentStickers$18(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            getMessagesStorage().getStorageQueue().postRunnable(new MediaDataController$$ExternalSyntheticLambda3(this, 6));
            this.recentStickers[0].clear();
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recentDocumentsDidLoad, Boolean.FALSE, 0);
        }
    }

    public void lambda$clearRecentStickers$19(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda74(this, tLObject, 4));
    }

    public void lambda$clearTopPeers$149() {
        try {
            getMessagesStorage().getDatabase().executeFast("DELETE FROM chat_hints WHERE 1").stepThis().dispose();
        } catch (Exception unused) {
        }
    }

    public void lambda$deletePeer$159(long j, int i) {
        try {
            SQLiteDatabase database = getMessagesStorage().getDatabase();
            Locale locale = Locale.US;
            database.executeFast("DELETE FROM chat_hints WHERE did = " + j + " AND type = " + i).stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$fetchEmojiStatuses$230() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.recentEmojiStatusesUpdate, new Object[0]);
    }

    public void lambda$fetchEmojiStatuses$231(int i) {
        boolean z;
        NativeByteBuffer nativeByteBufferByteBufferValue;
        try {
            SQLiteCursor sQLiteCursorQueryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT data FROM emoji_statuses WHERE type = " + i + " LIMIT 1", new Object[0]);
            if (!sQLiteCursorQueryFinalized.next() || sQLiteCursorQueryFinalized.getColumnCount() <= 0 || sQLiteCursorQueryFinalized.isNull(0) || (nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0)) == null) {
                z = false;
            } else {
                TL_account.EmojiStatuses emojiStatusesTLdeserialize = TL_account.EmojiStatuses.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                if (emojiStatusesTLdeserialize instanceof TL_account.TL_emojiStatuses) {
                    this.emojiStatusesHash[i] = emojiStatusesTLdeserialize.hash;
                    this.emojiStatuses[i] = emojiStatusesTLdeserialize.statuses;
                    z = true;
                } else {
                    z = false;
                }
                try {
                    nativeByteBufferByteBufferValue.reuse();
                } catch (Exception e) {
                    e = e;
                    FileLog.e(e);
                }
            }
            sQLiteCursorQueryFinalized.dispose();
        } catch (Exception e2) {
            e = e2;
            z = false;
        }
        this.emojiStatusesFromCacheFetched[i] = true;
        this.emojiStatusesFetching[i] = false;
        if (z) {
            AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda3(this, 12));
        } else {
            fetchEmojiStatuses(i, false);
        }
    }

    public void lambda$fetchEmojiStatuses$232() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.recentEmojiStatusesUpdate, new Object[0]);
    }

    public void lambda$fetchEmojiStatuses$233(int i, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.emojiStatusesFetchDate[i] = Long.valueOf(System.currentTimeMillis() / 1000);
        if (tLObject instanceof TL_account.TL_emojiStatusesNotModified) {
            this.emojiStatusesFetching[i] = false;
            return;
        }
        if (tLObject instanceof TL_account.TL_emojiStatuses) {
            TL_account.TL_emojiStatuses tL_emojiStatuses = (TL_account.TL_emojiStatuses) tLObject;
            this.emojiStatusesHash[i] = tL_emojiStatuses.hash;
            this.emojiStatuses[i] = tL_emojiStatuses.statuses;
            updateEmojiStatuses(i, tL_emojiStatuses);
            AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda3(this, 1));
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
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = getMessagesStorage().getDatabase().executeFast("DELETE FROM emoji_keywords_info_v2 WHERE lang = ?");
            sQLitePreparedStatementExecuteFast.bindString(1, str);
            sQLitePreparedStatementExecuteFast.step();
            sQLitePreparedStatementExecuteFast.dispose();
            AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda1(this, str, 2));
        } catch (Exception e) {
            FileLog.e(e);
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

    public void lambda$fetchNewEmojiKeywords$212(int i, String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject == null) {
            AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda1(this, str2, 6));
            return;
        }
        TLRPC.TL_emojiKeywordsDifference tL_emojiKeywordsDifference = (TLRPC.TL_emojiKeywordsDifference) tLObject;
        if (i != -1 && !tL_emojiKeywordsDifference.lang_code.equals(str)) {
            getMessagesStorage().getStorageQueue().postRunnable(new MediaDataController$$ExternalSyntheticLambda1(this, str2, 5));
        } else {
            putEmojiKeywords(str2, tL_emojiKeywordsDifference);
            AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda3(this, 18));
        }
    }

    public void lambda$fetchNewEmojiKeywords$213(String str) {
        int iIntValue;
        TLObject tLObject;
        int i = 1;
        String strStringValue = null;
        long jLongValue = 0;
        try {
            SQLiteCursor sQLiteCursorQueryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT alias, version, date FROM emoji_keywords_info_v2 WHERE lang = ?", str);
            if (sQLiteCursorQueryFinalized.next()) {
                strStringValue = sQLiteCursorQueryFinalized.stringValue(0);
                iIntValue = sQLiteCursorQueryFinalized.intValue(1);
                try {
                    jLongValue = sQLiteCursorQueryFinalized.longValue(2);
                } catch (Exception e) {
                    e = e;
                    FileLog.e(e);
                }
            } else {
                iIntValue = -1;
            }
            sQLiteCursorQueryFinalized.dispose();
        } catch (Exception e2) {
            e = e2;
            iIntValue = -1;
        }
        String str2 = strStringValue;
        int i2 = iIntValue;
        if (!BuildVars.DEBUG_VERSION && Math.abs(System.currentTimeMillis() - jLongValue) < 3600000) {
            AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda1(this, str, i));
            return;
        }
        if (i2 == -1) {
            TLRPC.TL_messages_getEmojiKeywords tL_messages_getEmojiKeywords = new TLRPC.TL_messages_getEmojiKeywords();
            tL_messages_getEmojiKeywords.lang_code = str;
            tLObject = tL_messages_getEmojiKeywords;
        } else {
            TLRPC.TL_messages_getEmojiKeywordsDifference tL_messages_getEmojiKeywordsDifference = new TLRPC.TL_messages_getEmojiKeywordsDifference();
            tL_messages_getEmojiKeywordsDifference.lang_code = str;
            tL_messages_getEmojiKeywordsDifference.from_version = i2;
            tLObject = tL_messages_getEmojiKeywordsDifference;
        }
        getConnectionsManager().sendRequest(tLObject, new MessagesController$$ExternalSyntheticLambda45(this, i2, str2, str, 1));
    }

    public void lambda$fetchStickerSetInternal$41(String str, TLObject tLObject) {
        ArrayList<Utilities.Callback2<Boolean, TLRPC.TL_messages_stickerSet>> arrayList = this.loadingStickerSets.get(str);
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (tLObject != null) {
                    arrayList.get(i).run(Boolean.TRUE, (TLRPC.TL_messages_stickerSet) tLObject);
                } else {
                    arrayList.get(i).run(Boolean.FALSE, null);
                }
            }
        }
        this.loadingStickerSets.remove(str);
    }

    public void lambda$fetchStickerSetInternal$42(String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda75(this, str, tLObject, 0));
    }

    public void lambda$fillWithAnimatedEmoji$225(Integer num, ArrayList arrayList, boolean z, boolean z2, ArrayList[] arrayListArr, Runnable runnable) {
        int iIntValue;
        String str;
        boolean z3;
        char c;
        int i;
        ArrayList<TLRPC.StickerSetCovered> arrayList2;
        int i2;
        TLRPC.StickerSetCovered stickerSetCovered;
        ArrayList<TLRPC.Document> arrayList3;
        TLRPC.TL_documentAttributeCustomEmoji tL_documentAttributeCustomEmoji;
        TLRPC.StickerSet stickerSet;
        String str2;
        int i3;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.TL_documentAttributeCustomEmoji tL_documentAttributeCustomEmoji2;
        TLRPC.StickerSet stickerSet2;
        String str3;
        int i4;
        int i5;
        String str4;
        TLRPC.Document document;
        TLRPC.TL_messages_stickerSet stickerSetByName;
        MediaDataController mediaDataController = this;
        ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = mediaDataController.getFeaturedEmojiSets();
        ArrayList arrayList4 = new ArrayList();
        HashSet hashSet = new HashSet();
        ArrayList arrayList5 = new ArrayList();
        boolean z4 = true;
        if (num != null) {
            iIntValue = num.intValue();
        } else if (arrayList.size() > 5) {
            iIntValue = 1;
        } else {
            iIntValue = 2;
            if (arrayList.size() <= 2) {
                iIntValue = 3;
            }
        }
        int iMin = num == null ? Math.min(15, arrayList.size()) : arrayList.size();
        if (!UserConfig.getInstance(mediaDataController.currentAccount).isPremium() && !z) {
            z4 = false;
        }
        if (z2) {
            str = UserConfig.getInstance(mediaDataController.currentAccount).defaultTopicIcons;
            if (arrayListArr[0] != null) {
                if (str != null) {
                    stickerSetByName = getInstance(mediaDataController.currentAccount).getStickerSetByName(str);
                    if (stickerSetByName == null) {
                        stickerSetByName = getInstance(mediaDataController.currentAccount).getStickerSetByEmojiOrName(str);
                    }
                } else {
                    stickerSetByName = null;
                }
                if (stickerSetByName != null) {
                    arrayListArr[0].add(stickerSetByName);
                }
            }
        } else {
            str = null;
        }
        int i6 = 0;
        while (i6 < iMin) {
            String str5 = ((KeywordResult) arrayList.get(i6)).emoji;
            if (TextUtils.isEmpty(str5)) {
                arrayList2 = featuredEmojiSets;
                z3 = z4;
                i = iMin;
            } else {
                arrayList5.clear();
                if (Emoji.recentEmoji != null) {
                    c = 0;
                    int i7 = 0;
                    while (true) {
                        ArrayList<String> arrayList6 = Emoji.recentEmoji;
                        if (i7 >= arrayList6.size()) {
                            z3 = z4;
                            break;
                        }
                        if (arrayList6.get(i7).startsWith("animated_")) {
                            try {
                                z3 = z4;
                                try {
                                    TLRPC.Document documentFindDocument = AnimatedEmojiDrawable.findDocument(mediaDataController.currentAccount, Long.parseLong(arrayList6.get(i7).substring(9)));
                                    String strFindAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(documentFindDocument, null);
                                    if (documentFindDocument != null && strFindAnimatedEmojiEmoticon != null && strFindAnimatedEmojiEmoticon.contains(str5) && (z3 || MessageObject.isFreeEmoji(documentFindDocument))) {
                                        if (!hashSet.contains(Long.valueOf(documentFindDocument.id))) {
                                            hashSet.add(Long.valueOf(documentFindDocument.id));
                                            arrayList5.add(documentFindDocument);
                                        }
                                    }
                                } catch (Exception unused) {
                                }
                            } catch (Exception unused2) {
                                z3 = z4;
                            }
                        } else {
                            z3 = z4;
                        }
                        if (arrayList5.size() >= iIntValue) {
                            break;
                        }
                        i7++;
                        z4 = z3;
                    }
                } else {
                    z3 = z4;
                    c = 0;
                }
                if (arrayList5.size() >= iIntValue || arrayListArr[c] == null) {
                    i = iMin;
                    break;
                }
                int i8 = 0;
                while (true) {
                    if (i8 >= arrayListArr[c].size()) {
                        i = iMin;
                        break;
                    }
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayListArr[c].get(i8);
                    if (tL_messages_stickerSet2 == null || tL_messages_stickerSet2.packs == null) {
                        i3 = i8;
                        i = iMin;
                        if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents != null) {
                            int i9 = 0;
                            while (i9 < tL_messages_stickerSet2.documents.size()) {
                                TLRPC.Document document2 = tL_messages_stickerSet2.documents.get(i9);
                                if (document2 != null && document2.attributes != null && !arrayList5.contains(document2)) {
                                    int i10 = 0;
                                    while (true) {
                                        if (i10 >= document2.attributes.size()) {
                                            tL_documentAttributeCustomEmoji2 = null;
                                            break;
                                        }
                                        TLRPC.DocumentAttribute documentAttribute = document2.attributes.get(i10);
                                        if (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) {
                                            tL_documentAttributeCustomEmoji2 = (TLRPC.TL_documentAttributeCustomEmoji) documentAttribute;
                                            break;
                                        }
                                        i10++;
                                    }
                                    if (tL_documentAttributeCustomEmoji2 != null && !TextUtils.isEmpty(tL_documentAttributeCustomEmoji2.alt) && tL_documentAttributeCustomEmoji2.alt.contains(str5) && (z3 || tL_documentAttributeCustomEmoji2.free || !((stickerSet2 = tL_messages_stickerSet2.set) == null || (str3 = stickerSet2.short_name) == null || !str3.equals(str)))) {
                                        tL_messages_stickerSet = tL_messages_stickerSet2;
                                        if (!hashSet.contains(Long.valueOf(document2.id))) {
                                            hashSet.add(Long.valueOf(document2.id));
                                            arrayList5.add(document2);
                                            if (arrayList5.size() >= iIntValue) {
                                                break;
                                            }
                                        } else {
                                            continue;
                                        }
                                    } else {
                                        tL_messages_stickerSet = tL_messages_stickerSet2;
                                    }
                                } else {
                                    tL_messages_stickerSet = tL_messages_stickerSet2;
                                }
                                i9++;
                                tL_messages_stickerSet2 = tL_messages_stickerSet;
                            }
                        }
                    } else {
                        int i11 = 0;
                        while (i11 < tL_messages_stickerSet2.packs.size()) {
                            TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet2.packs.get(i11);
                            if (tL_stickerPack == null || (str4 = tL_stickerPack.emoticon) == null || !str4.contains(str5)) {
                                i4 = i8;
                            } else {
                                i4 = i8;
                                int i12 = 0;
                                while (true) {
                                    if (i12 < tL_stickerPack.documents.size()) {
                                        long jLongValue = tL_stickerPack.documents.get(i12).longValue();
                                        int i13 = i12;
                                        int i14 = 0;
                                        while (true) {
                                            if (i14 >= tL_messages_stickerSet2.documents.size()) {
                                                i5 = iMin;
                                                document = null;
                                                break;
                                            }
                                            document = tL_messages_stickerSet2.documents.get(i14);
                                            int i15 = i14;
                                            i5 = iMin;
                                            if (document != null && document.id == jLongValue) {
                                                break;
                                            }
                                            i14 = i15 + 1;
                                            iMin = i5;
                                        }
                                        if (document != null && document.attributes != null && !arrayList5.contains(document) && !hashSet.contains(Long.valueOf(document.id))) {
                                            hashSet.add(Long.valueOf(document.id));
                                            arrayList5.add(document);
                                            if (arrayList5.size() >= iIntValue) {
                                                break;
                                            }
                                        }
                                        i12 = i13 + 1;
                                        iMin = i5;
                                    }
                                }
                                i11++;
                                i8 = i4;
                                iMin = i5;
                            }
                            i5 = iMin;
                            i11++;
                            i8 = i4;
                            iMin = i5;
                        }
                        i3 = i8;
                        i = iMin;
                    }
                    if (arrayList5.size() >= iIntValue) {
                        break;
                    }
                    i8 = i3 + 1;
                    iMin = i;
                }
                if (arrayList5.size() >= iIntValue || featuredEmojiSets == null) {
                    arrayList2 = featuredEmojiSets;
                    break;
                }
                int i16 = 0;
                while (true) {
                    if (i16 >= featuredEmojiSets.size()) {
                        arrayList2 = featuredEmojiSets;
                        break;
                    }
                    TLRPC.StickerSetCovered stickerSetCovered2 = featuredEmojiSets.get(i16);
                    if (stickerSetCovered2 != null) {
                        ArrayList<TLRPC.Document> arrayList7 = stickerSetCovered2 instanceof TLRPC.TL_stickerSetFullCovered ? ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered2).documents : stickerSetCovered2.covers;
                        if (arrayList7 != null) {
                            int i17 = 0;
                            while (true) {
                                if (i17 >= arrayList7.size()) {
                                    i2 = i16;
                                    arrayList2 = featuredEmojiSets;
                                    break;
                                }
                                TLRPC.Document document3 = arrayList7.get(i17);
                                if (document3 == null || document3.attributes == null || arrayList5.contains(document3)) {
                                    i2 = i16;
                                    arrayList2 = featuredEmojiSets;
                                } else {
                                    i2 = i16;
                                    int i18 = 0;
                                    while (true) {
                                        if (i18 >= document3.attributes.size()) {
                                            arrayList2 = featuredEmojiSets;
                                            tL_documentAttributeCustomEmoji = null;
                                            break;
                                        }
                                        TLRPC.DocumentAttribute documentAttribute2 = document3.attributes.get(i18);
                                        arrayList2 = featuredEmojiSets;
                                        if (documentAttribute2 instanceof TLRPC.TL_documentAttributeCustomEmoji) {
                                            tL_documentAttributeCustomEmoji = (TLRPC.TL_documentAttributeCustomEmoji) documentAttribute2;
                                            break;
                                        } else {
                                            i18++;
                                            featuredEmojiSets = arrayList2;
                                        }
                                    }
                                    if (tL_documentAttributeCustomEmoji != null && !TextUtils.isEmpty(tL_documentAttributeCustomEmoji.alt) && tL_documentAttributeCustomEmoji.alt.contains(str5) && (z3 || tL_documentAttributeCustomEmoji.free || ((stickerSet = stickerSetCovered2.set) != null && (str2 = stickerSet.short_name) != null && str2.equals(str)))) {
                                        stickerSetCovered = stickerSetCovered2;
                                        arrayList3 = arrayList7;
                                        if (!hashSet.contains(Long.valueOf(document3.id))) {
                                            hashSet.add(Long.valueOf(document3.id));
                                            arrayList5.add(document3);
                                            if (arrayList5.size() >= iIntValue) {
                                                break;
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                    i17++;
                                    stickerSetCovered2 = stickerSetCovered;
                                    arrayList7 = arrayList3;
                                    i16 = i2;
                                    featuredEmojiSets = arrayList2;
                                }
                                stickerSetCovered = stickerSetCovered2;
                                arrayList3 = arrayList7;
                                i17++;
                                stickerSetCovered2 = stickerSetCovered;
                                arrayList7 = arrayList3;
                                i16 = i2;
                                featuredEmojiSets = arrayList2;
                            }
                            if (arrayList5.size() >= iIntValue) {
                                break;
                            }
                        } else {
                            i2 = i16;
                            arrayList2 = featuredEmojiSets;
                        }
                    } else {
                        i2 = i16;
                        arrayList2 = featuredEmojiSets;
                    }
                    i16 = i2 + 1;
                    featuredEmojiSets = arrayList2;
                }
                if (!arrayList5.isEmpty()) {
                    String str6 = ((KeywordResult) arrayList.get(i6)).keyword;
                    for (int i19 = 0; i19 < arrayList5.size(); i19++) {
                        TLRPC.Document document4 = (TLRPC.Document) arrayList5.get(i19);
                        if (document4 != null) {
                            KeywordResult keywordResult = new KeywordResult();
                            keywordResult.emoji = "animated_" + document4.id;
                            keywordResult.keyword = str6;
                            arrayList4.add(keywordResult);
                        }
                    }
                }
            }
            i6++;
            mediaDataController = this;
            z4 = z3;
            featuredEmojiSets = arrayList2;
            iMin = i;
        }
        arrayList.addAll(0, arrayList4);
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void lambda$fillWithAnimatedEmoji$226(boolean[] zArr, ArrayList[] arrayListArr, Runnable runnable, ArrayList arrayList) {
        if (zArr[0]) {
            return;
        }
        arrayListArr[0] = arrayList;
        runnable.run();
        zArr[0] = true;
    }

    public void lambda$fillWithAnimatedEmoji$227(boolean[] zArr, ArrayList[] arrayListArr, Runnable runnable) {
        loadStickers(5, true, false, false, new FileRefController$$ExternalSyntheticLambda21(zArr, arrayListArr, runnable, 4));
    }

    public static void lambda$fillWithAnimatedEmoji$228(boolean[] zArr, Runnable runnable) {
        if (zArr[0]) {
            return;
        }
        runnable.run();
        zArr[0] = true;
    }

    public void lambda$findStickerSetByNameInCache$29(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Utilities.Callback callback) {
        putStickerSet(tL_messages_stickerSet, false);
        callback.run(tL_messages_stickerSet);
    }

    public void lambda$findStickerSetByNameInCache$30(String str, Utilities.Callback callback) {
        AndroidUtilities.runOnUIThread(new Utilities$$ExternalSyntheticLambda1(this, getCachedStickerSetInternal(str.toLowerCase(), (Integer) 0), callback, 5));
    }

    public static void lambda$getAnimatedEmojiByKeywords$216(String str, ArrayList arrayList, ArrayList arrayList2, Utilities.Callback callback) {
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        String lowerCase = str.toLowerCase();
        for (int i = 0; i < arrayList.size(); i++) {
            if (((TLRPC.TL_messages_stickerSet) arrayList.get(i)).keywords != null) {
                ArrayList<TLRPC.TL_stickerKeyword> arrayList5 = ((TLRPC.TL_messages_stickerSet) arrayList.get(i)).keywords;
                for (int i2 = 0; i2 < arrayList5.size(); i2++) {
                    for (int i3 = 0; i3 < arrayList5.get(i2).keyword.size(); i3++) {
                        String str2 = arrayList5.get(i2).keyword.get(i3);
                        if (lowerCase.equals(str2)) {
                            arrayList3.add(Long.valueOf(arrayList5.get(i2).document_id));
                        } else if (lowerCase.contains(str2) || str2.contains(lowerCase)) {
                            arrayList4.add(Long.valueOf(arrayList5.get(i2).document_id));
                        }
                    }
                }
            }
        }
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            if ((arrayList2.get(i4) instanceof TLRPC.TL_stickerSetFullCovered) && ((TLRPC.TL_stickerSetFullCovered) arrayList2.get(i4)).keywords != null) {
                ArrayList<TLRPC.TL_stickerKeyword> arrayList6 = ((TLRPC.TL_stickerSetFullCovered) arrayList2.get(i4)).keywords;
                for (int i5 = 0; i5 < arrayList6.size(); i5++) {
                    for (int i6 = 0; i6 < arrayList6.get(i5).keyword.size(); i6++) {
                        String str3 = arrayList6.get(i5).keyword.get(i6);
                        if (lowerCase.equals(str3)) {
                            arrayList3.add(Long.valueOf(arrayList6.get(i5).document_id));
                        } else if (lowerCase.contains(str3) || str3.contains(lowerCase)) {
                            arrayList4.add(Long.valueOf(arrayList6.get(i5).document_id));
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
        SQLiteCursor sQLiteCursorQuery = null;
        try {
            try {
                Object[] objArr = new Object[strArr.length + 1];
                objArr[0] = str;
                String str2 = "1 = 1";
                int i = 0;
                while (i < strArr.length) {
                    if (i == 0) {
                        str2 = "lang = ?";
                    } else {
                        str2 = str2 + " OR lang = ?";
                    }
                    SQLiteCursor sQLiteCursorQueryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT alias FROM emoji_keywords_info_v2 WHERE lang = ?", strArr[i]);
                    if (sQLiteCursorQueryFinalized.next()) {
                        strArr[i] = sQLiteCursorQueryFinalized.stringValue(0);
                    }
                    sQLiteCursorQueryFinalized.dispose();
                    int i2 = i + 1;
                    objArr[i2] = strArr[i];
                    i = i2;
                }
                sQLiteCursorQuery = getMessagesStorage().getDatabase().executeFast("SELECT keyword FROM emoji_keywords_v2 WHERE emoji = ? AND (" + str2 + ")").query(objArr);
                ArrayList arrayList = new ArrayList();
                while (sQLiteCursorQuery.next()) {
                    arrayList.add(sQLiteCursorQuery.stringValue(0));
                }
                AndroidUtilities.runOnUIThread(new MessagesStorage$$ExternalSyntheticLambda256(callback, arrayList, 2));
                sQLiteCursorQuery.dispose();
            } catch (Exception e) {
                FileLog.e(e);
                if (sQLiteCursorQuery != null) {
                    sQLiteCursorQuery.dispose();
                }
            }
        } catch (Throwable th) {
            if (sQLiteCursorQuery != null) {
                sQLiteCursorQuery.dispose();
            }
            throw th;
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
        int iIndexOf = arrayList.indexOf(keywordResult.emoji);
        if (iIndexOf < 0) {
            iIndexOf = Integer.MAX_VALUE;
        }
        int iIndexOf2 = arrayList.indexOf(keywordResult2.emoji);
        int i = iIndexOf2 >= 0 ? iIndexOf2 : Integer.MAX_VALUE;
        if (iIndexOf < i) {
            return -1;
        }
        if (iIndexOf > i) {
            return 1;
        }
        int length = keywordResult.keyword.length();
        int length2 = keywordResult2.keyword.length();
        if (length < length2) {
            return -1;
        }
        return length > length2 ? 1 : 0;
    }

    public static void lambda$getEmojiSuggestions$222(CountDownLatch countDownLatch, KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str) {
        if (countDownLatch == null) {
            AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda127(keywordResultCallback, arrayList, str, 1));
        } else {
            keywordResultCallback.run(arrayList, str);
            countDownLatch.countDown();
        }
    }

    public void lambda$getEmojiSuggestions$224(String[] strArr, KeywordResultCallback keywordResultCallback, boolean z, String str, boolean z2, ArrayList arrayList, boolean z3, Integer num, boolean z4, boolean z5, boolean z6, CountDownLatch countDownLatch) {
        String str2;
        StringBuilder sb;
        int length;
        String string;
        SQLiteCursor sQLiteCursorQueryFinalized;
        String strReplace;
        char cCharAt;
        ?? r2 = strArr;
        ArrayList<KeywordResult> arrayList2 = new ArrayList<>();
        HashMap map = new HashMap();
        int i = 0;
        String strStringValue = null;
        boolean z7 = false;
        for (?? r0 : r2) {
            try {
                SQLiteCursor sQLiteCursorQueryFinalized2 = getMessagesStorage().getDatabase().queryFinalized("SELECT alias FROM emoji_keywords_info_v2 WHERE lang = ?", new Object[]{r0});
                if (sQLiteCursorQueryFinalized2.next()) {
                    strStringValue = sQLiteCursorQueryFinalized2.stringValue(0);
                }
                sQLiteCursorQueryFinalized2.dispose();
                if (strStringValue != null) {
                    z7 = true;
                }
            } catch (Exception e) {
                e = e;
                r2 = keywordResultCallback;
            }
        }
        try {
            if (z7) {
                r2 = keywordResultCallback;
                if (z) {
                    int[] iArr = new int[1];
                    str2 = str;
                    ArrayList<Emoji.EmojiSpanRange> emojis = Emoji.parseEmojis(str2, iArr);
                    if (iArr[0] > 0) {
                        for (int i2 = 0; i2 < emojis.size(); i2++) {
                            String string2 = emojis.get(i2).code.toString();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= arrayList2.size()) {
                                    KeywordResult keywordResult = new KeywordResult();
                                    keywordResult.emoji = string2;
                                    keywordResult.keyword = "";
                                    arrayList2.add(keywordResult);
                                    break;
                                }
                                if (TextUtils.equals(arrayList2.get(i3).emoji, string2)) {
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                        }
                    }
                } else {
                    str2 = str;
                }
                String lowerCase = str2.toLowerCase();
                for (int i4 = 0; i4 < 2; i4++) {
                    if (i4 == 1) {
                        String translitString = LocaleController.getInstance().getTranslitString(lowerCase, false, false);
                        if (!translitString.equals(lowerCase)) {
                            lowerCase = translitString;
                            sb = new StringBuilder(lowerCase);
                            length = sb.length();
                            while (true) {
                                if (length > 0) {
                                    string = null;
                                    break;
                                }
                                length--;
                                cCharAt = (char) (sb.charAt(length) + 1);
                                sb.setCharAt(length, cCharAt);
                                if (cCharAt != 0) {
                                    string = sb.toString();
                                    break;
                                }
                            }
                            if (z2) {
                                sQLiteCursorQueryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT emoji, keyword FROM emoji_keywords_v2 WHERE keyword = ?", lowerCase);
                            } else if (string != null) {
                                sQLiteCursorQueryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT emoji, keyword FROM emoji_keywords_v2 WHERE keyword >= ? AND keyword < ?", lowerCase, string);
                            } else {
                                lowerCase = lowerCase + "%";
                                sQLiteCursorQueryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT emoji, keyword FROM emoji_keywords_v2 WHERE keyword LIKE ?", lowerCase);
                            }
                            while (sQLiteCursorQueryFinalized.next()) {
                                strReplace = sQLiteCursorQueryFinalized.stringValue(0).replace("️", "");
                                if (map.get(strReplace) != null) {
                                    map.put(strReplace, Boolean.TRUE);
                                    KeywordResult keywordResult2 = new KeywordResult();
                                    keywordResult2.emoji = strReplace;
                                    keywordResult2.keyword = sQLiteCursorQueryFinalized.stringValue(1);
                                    arrayList2.add(keywordResult2);
                                }
                            }
                            sQLiteCursorQueryFinalized.dispose();
                        }
                    } else {
                        sb = new StringBuilder(lowerCase);
                        length = sb.length();
                        while (true) {
                            if (length > 0) {
                                string = null;
                                break;
                            }
                            length--;
                            cCharAt = (char) (sb.charAt(length) + 1);
                            sb.setCharAt(length, cCharAt);
                            if (cCharAt != 0) {
                                string = sb.toString();
                                break;
                            }
                        }
                        if (z2) {
                            sQLiteCursorQueryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT emoji, keyword FROM emoji_keywords_v2 WHERE keyword = ?", lowerCase);
                        } else if (string != null) {
                            sQLiteCursorQueryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT emoji, keyword FROM emoji_keywords_v2 WHERE keyword >= ? AND keyword < ?", lowerCase, string);
                        } else {
                            lowerCase = lowerCase + "%";
                            sQLiteCursorQueryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT emoji, keyword FROM emoji_keywords_v2 WHERE keyword LIKE ?", lowerCase);
                        }
                        while (sQLiteCursorQueryFinalized.next()) {
                            strReplace = sQLiteCursorQueryFinalized.stringValue(0).replace("️", "");
                            if (map.get(strReplace) != null) {
                                map.put(strReplace, Boolean.TRUE);
                                KeywordResult keywordResult3 = new KeywordResult();
                                keywordResult3.emoji = strReplace;
                                keywordResult3.keyword = sQLiteCursorQueryFinalized.stringValue(1);
                                arrayList2.add(keywordResult3);
                            }
                        }
                        sQLiteCursorQueryFinalized.dispose();
                    }
                }
                Collections.sort(arrayList2, new MediaDataController$$ExternalSyntheticLambda125(arrayList, i));
                if (z3) {
                    fillWithAnimatedEmoji(arrayList2, num, z4, z5, z6, new ImageLoader$$ExternalSyntheticLambda10(countDownLatch, (KeywordResultCallback) r2, arrayList2, strStringValue));
                } else if (countDownLatch != null) {
                    AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda127(r2, arrayList2, strStringValue, i));
                } else {
                    r2.run(arrayList2, strStringValue);
                    countDownLatch.countDown();
                }
            }
            try {
                AndroidUtilities.runOnUIThread(new ImageLoader$$ExternalSyntheticLambda10(this, (Object) r2, keywordResultCallback, arrayList2, 14));
                return;
            } catch (Exception e2) {
                e = e2;
                r2 = keywordResultCallback;
            }
        } catch (Exception e3) {
            e = e3;
        }
        FileLog.e(e);
        Collections.sort(arrayList2, new MediaDataController$$ExternalSyntheticLambda125(arrayList, i));
        if (z3) {
            fillWithAnimatedEmoji(arrayList2, num, z4, z5, z6, new ImageLoader$$ExternalSyntheticLambda10(countDownLatch, (KeywordResultCallback) r2, arrayList2, strStringValue));
        } else if (countDownLatch != null) {
            AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda127(r2, arrayList2, strStringValue, i));
        } else {
            r2.run(arrayList2, strStringValue);
            countDownLatch.countDown();
        }
    }

    public static TLRPC.MessageEntity lambda$getEntities$181(Void r0) {
        return new TLRPC.TL_messageEntityBold();
    }

    public static TLRPC.MessageEntity lambda$getEntities$182(Void r0) {
        return new TLRPC.TL_messageEntityItalic();
    }

    public static TLRPC.MessageEntity lambda$getEntities$183(Void r0) {
        return new TLRPC.TL_messageEntitySpoiler();
    }

    public static TLRPC.MessageEntity lambda$getEntities$184(Void r0) {
        return new TLRPC.TL_messageEntityStrike();
    }

    public void lambda$getMediaCount$132(long j, long j2, int i, int i2, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof Vector) {
            Vector vector = (Vector) tLObject;
            if (vector.objects.isEmpty()) {
                return;
            }
            processLoadedMediaCount(((TLRPC.TL_messages_searchCounter) vector.objects.get(0)).count, j, j2, i, i2, false, 0);
        }
    }

    public void lambda$getMediaCountDatabase$139(long j, long j2, int i, int i2) {
        SQLiteCursor sQLiteCursorQueryFinalized;
        int iIntValue;
        int iIntValue2;
        try {
            if (j != 0) {
                SQLiteDatabase database = getMessagesStorage().getDatabase();
                Locale locale = Locale.US;
                sQLiteCursorQueryFinalized = database.queryFinalized("SELECT count, old FROM media_counts_topics WHERE uid = " + j2 + " AND topic_id = " + j + " AND type = " + i + " LIMIT 1", new Object[0]);
            } else {
                SQLiteDatabase database2 = getMessagesStorage().getDatabase();
                Locale locale2 = Locale.US;
                sQLiteCursorQueryFinalized = database2.queryFinalized("SELECT count, old FROM media_counts_v2 WHERE uid = " + j2 + " AND type = " + i + " LIMIT 1", new Object[0]);
            }
            if (sQLiteCursorQueryFinalized.next()) {
                iIntValue = sQLiteCursorQueryFinalized.intValue(0);
                iIntValue2 = sQLiteCursorQueryFinalized.intValue(1);
            } else {
                iIntValue = -1;
                iIntValue2 = 0;
            }
            sQLiteCursorQueryFinalized.dispose();
            if (iIntValue == -1 && DialogObject.isEncryptedDialog(j2)) {
                SQLiteDatabase database3 = getMessagesStorage().getDatabase();
                Locale locale3 = Locale.US;
                SQLiteCursor sQLiteCursorQueryFinalized2 = database3.queryFinalized("SELECT COUNT(mid) FROM media_v4 WHERE uid = " + j2 + " AND type = " + i + " LIMIT 1", new Object[0]);
                if (sQLiteCursorQueryFinalized2.next()) {
                    iIntValue = sQLiteCursorQueryFinalized2.intValue(0);
                }
                sQLiteCursorQueryFinalized2.dispose();
                if (iIntValue != -1) {
                    putMediaCountDatabase(j2, j, i, iIntValue);
                }
            }
            processLoadedMediaCount(iIntValue, j2, j, i, i2, true, iIntValue2);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$getMediaCounts$127(long j, long j2, int[] iArr) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mediaCountsDidLoad, Long.valueOf(j), Long.valueOf(j2), iArr);
    }

    public void lambda$getMediaCounts$128(long j, long j2, int[] iArr) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mediaCountsDidLoad, Long.valueOf(j), Long.valueOf(j2), iArr);
    }

    public void lambda$getMediaCounts$129(int[] iArr, long j, long j2, TLObject tLObject, TLRPC.TL_error tL_error) {
        int i;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] < 0) {
                iArr[i2] = 0;
            }
        }
        if (tLObject instanceof Vector) {
            Vector vector = (Vector) tLObject;
            int size = vector.objects.size();
            for (int i3 = 0; i3 < size; i3++) {
                TLRPC.TL_messages_searchCounter tL_messages_searchCounter = (TLRPC.TL_messages_searchCounter) vector.objects.get(i3);
                TLRPC.MessagesFilter messagesFilter = tL_messages_searchCounter.filter;
                if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterPhotoVideo) {
                    i = 0;
                } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterDocument) {
                    i = 1;
                } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterRoundVoice) {
                    i = 2;
                } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterUrl) {
                    i = 3;
                } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterMusic) {
                    i = 4;
                } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterGif) {
                    i = 5;
                } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterPhotos) {
                    i = 6;
                } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterVideo) {
                    i = 7;
                } else {
                    if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterPoll) {
                        i = 8;
                    }
                }
                int i4 = tL_messages_searchCounter.count;
                iArr[i] = i4;
                putMediaCountDatabase(j, j2, i, i4);
            }
        }
        AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda130(this, j, j2, iArr, 0));
    }

    public void lambda$getMediaCounts$130(long j, long j2, int[] iArr) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mediaCountsDidLoad, Long.valueOf(j), Long.valueOf(j2), iArr);
    }

    public void lambda$getMediaCounts$131(long j, long j2, int i) {
        SQLiteCursor sQLiteCursorQueryFinalized;
        long j3 = j;
        long j4 = j2;
        int i2 = 9;
        try {
            int[] iArr = new int[9];
            int i3 = 0;
            iArr[0] = -1;
            iArr[1] = -1;
            int i4 = 2;
            iArr[2] = -1;
            iArr[3] = -1;
            iArr[4] = -1;
            iArr[5] = -1;
            iArr[6] = -1;
            iArr[7] = -1;
            iArr[8] = -1;
            int[] iArr2 = new int[9];
            iArr2[0] = -1;
            iArr2[1] = -1;
            iArr2[2] = -1;
            iArr2[3] = -1;
            iArr2[4] = -1;
            iArr2[5] = -1;
            iArr2[6] = -1;
            iArr2[7] = -1;
            iArr2[8] = -1;
            int[] iArr3 = new int[9];
            iArr3[0] = 0;
            iArr3[1] = 0;
            iArr3[2] = 0;
            iArr3[3] = 0;
            iArr3[4] = 0;
            iArr3[5] = 0;
            iArr3[6] = 0;
            iArr3[7] = 0;
            iArr3[8] = 0;
            if (j3 != 0) {
                SQLiteDatabase database = getMessagesStorage().getDatabase();
                Locale locale = Locale.US;
                sQLiteCursorQueryFinalized = database.queryFinalized("SELECT type, count, old FROM media_counts_topics WHERE uid = " + j4 + " AND topic_id = " + j3, new Object[0]);
            } else {
                SQLiteDatabase database2 = getMessagesStorage().getDatabase();
                Locale locale2 = Locale.US;
                sQLiteCursorQueryFinalized = database2.queryFinalized("SELECT type, count, old FROM media_counts_v2 WHERE uid = " + j4, new Object[0]);
            }
            while (sQLiteCursorQueryFinalized.next()) {
                int iIntValue = sQLiteCursorQueryFinalized.intValue(0);
                if (iIntValue >= 0 && iIntValue < 9) {
                    int iIntValue2 = sQLiteCursorQueryFinalized.intValue(1);
                    iArr[iIntValue] = iIntValue2;
                    iArr2[iIntValue] = iIntValue2;
                    iArr3[iIntValue] = sQLiteCursorQueryFinalized.intValue(2);
                }
            }
            sQLiteCursorQueryFinalized.dispose();
            if (DialogObject.isEncryptedDialog(j4)) {
                int i5 = 0;
                while (i5 < 9) {
                    if (iArr[i5] == -1) {
                        SQLiteDatabase database3 = getMessagesStorage().getDatabase();
                        Locale locale3 = Locale.US;
                        SQLiteCursor sQLiteCursorQueryFinalized2 = database3.queryFinalized("SELECT COUNT(mid) FROM media_v4 WHERE uid = " + j4 + " AND type = " + i5 + " LIMIT 1", new Object[0]);
                        if (sQLiteCursorQueryFinalized2.next()) {
                            iArr[i5] = sQLiteCursorQueryFinalized2.intValue(0);
                        } else {
                            iArr[i5] = 0;
                        }
                        sQLiteCursorQueryFinalized2.dispose();
                        putMediaCountDatabase(j4, j3, i5, iArr[i5]);
                    }
                    i5++;
                    j3 = j;
                    j4 = j2;
                }
                AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda130(this, j2, j, iArr, 1));
                return;
            }
            TLRPC.TL_messages_getSearchCounters tL_messages_getSearchCounters = new TLRPC.TL_messages_getSearchCounters();
            tL_messages_getSearchCounters.peer = getMessagesController().getInputPeer(j4);
            if (j3 != 0) {
                if (j4 == getUserConfig().getClientUserId()) {
                    tL_messages_getSearchCounters.saved_peer_id = getMessagesController().getInputPeer(j3);
                    tL_messages_getSearchCounters.flags |= 4;
                } else {
                    tL_messages_getSearchCounters.top_msg_id = (int) j3;
                    tL_messages_getSearchCounters.flags |= 1;
                }
            }
            int i6 = 0;
            boolean z = false;
            while (i6 < i2) {
                if (tL_messages_getSearchCounters.peer == null) {
                    iArr[i6] = i3;
                } else {
                    if (iArr[i6] == -1 || iArr3[i6] == 1) {
                        if (i6 == 0) {
                            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterPhotoVideo());
                        } else if (i6 == 1) {
                            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterDocument());
                        } else if (i6 == i4) {
                            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterRoundVoice());
                        } else {
                            if (i6 == 3) {
                                tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterUrl());
                            } else if (i6 == 4) {
                                tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterMusic());
                            } else if (i6 == 6) {
                                tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterPhotos());
                            } else if (i6 == 7) {
                                tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterVideo());
                            } else if (i6 == 8) {
                                tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterPoll());
                            } else {
                                tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterGif());
                            }
                            if (iArr[i6] == -1) {
                                z = true;
                            } else if (iArr3[i6] == 1) {
                                iArr[i6] = -1;
                            }
                        }
                        if (iArr[i6] == -1) {
                            z = true;
                        } else if (iArr3[i6] == 1) {
                            iArr[i6] = -1;
                        }
                    }
                    i6++;
                    i4 = 2;
                    i2 = 9;
                    i3 = 0;
                }
                i6++;
                i4 = 2;
                i2 = 9;
                i3 = 0;
            }
            if (!tL_messages_getSearchCounters.filters.isEmpty()) {
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getSearchCounters, new StarGiftSheet$$ExternalSyntheticLambda132(2, j4, j3, this, iArr)), i);
            }
            if (z && getConnectionsManager().getConnectionState() == 3) {
                return;
            }
            AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda130(this, j2, j, iArr2, 2));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$getStickerSet$32(String str, Utilities.Callback callback, Boolean bool, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.StickerSet stickerSet;
        this.loadingStickerSetsKeys.remove(str);
        if (callback != null) {
            callback.run(tL_messages_stickerSet);
        }
        if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null) {
            return;
        }
        this.stickerSetsById.put(tL_messages_stickerSet, stickerSet.id);
        this.stickerSetsByName.put(tL_messages_stickerSet.set.short_name.toLowerCase(), tL_messages_stickerSet);
        saveStickerSetIntoCache(tL_messages_stickerSet);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupStickersDidLoad, Long.valueOf(tL_messages_stickerSet.set.id), tL_messages_stickerSet);
    }

    public void lambda$getStickerSet$33(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z, TLRPC.InputStickerSet inputStickerSet) {
        int i = 1;
        if (tL_messages_stickerSet == null) {
            if (z) {
                this.loadingStickerSetsKeys.remove(str);
                return;
            } else {
                fetchStickerSetInternal(inputStickerSet, new MediaDataController$$ExternalSyntheticLambda43(this, str, callback, i));
                return;
            }
        }
        this.loadingStickerSetsKeys.remove(str);
        if (callback != null) {
            callback.run(tL_messages_stickerSet);
        }
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        if (stickerSet != null) {
            this.stickerSetsById.put(tL_messages_stickerSet, stickerSet.id);
            this.stickerSetsByName.put(tL_messages_stickerSet.set.short_name.toLowerCase(), tL_messages_stickerSet);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupStickersDidLoad, Long.valueOf(tL_messages_stickerSet.set.id), tL_messages_stickerSet);
    }

    public void lambda$getStickerSet$34(TLRPC.InputStickerSet inputStickerSet, Integer num, String str, Utilities.Callback callback, boolean z) {
        AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda94(this, getCachedStickerSetInternal(inputStickerSet.id, num), str, callback, z, inputStickerSet, 1));
    }

    public void lambda$getStickerSet$35(String str, Utilities.Callback callback, Boolean bool, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.StickerSet stickerSet;
        this.loadingStickerSetsKeys.remove(str);
        if (callback != null) {
            callback.run(tL_messages_stickerSet);
        }
        if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null) {
            return;
        }
        this.stickerSetsById.put(tL_messages_stickerSet, stickerSet.id);
        this.stickerSetsByName.put(tL_messages_stickerSet.set.short_name.toLowerCase(), tL_messages_stickerSet);
        saveStickerSetIntoCache(tL_messages_stickerSet);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupStickersDidLoad, Long.valueOf(tL_messages_stickerSet.set.id), tL_messages_stickerSet);
    }

    public void lambda$getStickerSet$36(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z, TLRPC.InputStickerSet inputStickerSet) {
        int i = 0;
        if (tL_messages_stickerSet == null) {
            if (z) {
                this.loadingStickerSetsKeys.remove(str);
                return;
            } else {
                fetchStickerSetInternal(inputStickerSet, new MediaDataController$$ExternalSyntheticLambda43(this, str, callback, i));
                return;
            }
        }
        this.loadingStickerSetsKeys.remove(str);
        if (callback != null) {
            callback.run(tL_messages_stickerSet);
        }
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        if (stickerSet != null) {
            this.stickerSetsById.put(tL_messages_stickerSet, stickerSet.id);
            this.stickerSetsByName.put(tL_messages_stickerSet.set.short_name.toLowerCase(), tL_messages_stickerSet);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupStickersDidLoad, Long.valueOf(tL_messages_stickerSet.set.id), tL_messages_stickerSet);
    }

    public void lambda$getStickerSet$37(TLRPC.InputStickerSet inputStickerSet, Integer num, String str, Utilities.Callback callback, boolean z) {
        AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda94(this, getCachedStickerSetInternal(inputStickerSet.short_name.toLowerCase(), num), str, callback, z, inputStickerSet, 0));
    }

    public void lambda$getStickerSet$38(String str, Utilities.Callback callback, TLRPC.InputStickerSet inputStickerSet, Boolean bool, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.loadingStickerSetsKeys.remove(str);
        if (callback != null) {
            callback.run(tL_messages_stickerSet);
        }
        if (tL_messages_stickerSet != null) {
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null) {
                this.stickerSetsById.put(tL_messages_stickerSet, stickerSet.id);
                this.stickerSetsByName.put(tL_messages_stickerSet.set.short_name.toLowerCase(), tL_messages_stickerSet);
                boolean z = inputStickerSet instanceof TLRPC.TL_inputStickerSetEmojiDefaultStatuses;
                if (z) {
                    this.stickerSetDefaultStatuses = tL_messages_stickerSet;
                }
                if (z) {
                    this.stickerSetDefaultChannelStatuses = tL_messages_stickerSet;
                }
            }
            saveStickerSetIntoCache(tL_messages_stickerSet);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupStickersDidLoad, Long.valueOf(tL_messages_stickerSet.set.id), tL_messages_stickerSet);
        }
    }

    public static int lambda$getTextStyleRuns$180(TLRPC.MessageEntity messageEntity, TLRPC.MessageEntity messageEntity2) {
        int i = messageEntity.offset;
        int i2 = messageEntity2.offset;
        if (i > i2) {
            return 1;
        }
        return i < i2 ? -1 : 0;
    }

    public static int lambda$increaseInlineRating$150(TLRPC.TL_topPeer tL_topPeer, TLRPC.TL_topPeer tL_topPeer2) {
        double d = tL_topPeer.rating;
        double d2 = tL_topPeer2.rating;
        if (d > d2) {
            return -1;
        }
        return d < d2 ? 1 : 0;
    }

    public static int lambda$increasePeerRaiting$155(TLRPC.TL_topPeer tL_topPeer, TLRPC.TL_topPeer tL_topPeer2) {
        double d = tL_topPeer.rating;
        double d2 = tL_topPeer2.rating;
        if (d > d2) {
            return -1;
        }
        return d < d2 ? 1 : 0;
    }

    public void lambda$increasePeerRaiting$156(long j, double d) {
        TLRPC.TL_topPeer tL_topPeer;
        int i = 0;
        while (true) {
            if (i >= this.hints.size()) {
                tL_topPeer = null;
                break;
            }
            tL_topPeer = this.hints.get(i);
            if (tL_topPeer.peer.user_id == j) {
                break;
            } else {
                i++;
            }
        }
        if (tL_topPeer == null) {
            tL_topPeer = new TLRPC.TL_topPeer();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_topPeer.peer = tL_peerUser;
            tL_peerUser.user_id = j;
            this.hints.add(tL_topPeer);
        }
        tL_topPeer.rating = Math.exp(d / ((double) getMessagesController().ratingDecay)) + tL_topPeer.rating;
        Collections.sort(this.hints, new Emoji$$ExternalSyntheticLambda0(11));
        savePeer(j, 0, tL_topPeer.rating);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadHints, new Object[0]);
    }

    public void lambda$increasePeerRaiting$157(final long j) {
        double d;
        int iIntValue;
        try {
            SQLiteDatabase database = getMessagesStorage().getDatabase();
            Locale locale = Locale.US;
            int iIntValue2 = 0;
            SQLiteCursor sQLiteCursorQueryFinalized = database.queryFinalized("SELECT MAX(mid), MAX(date) FROM messages_v2 WHERE uid = " + j + " AND out = 1", new Object[0]);
            if (sQLiteCursorQueryFinalized.next()) {
                iIntValue2 = sQLiteCursorQueryFinalized.intValue(0);
                iIntValue = sQLiteCursorQueryFinalized.intValue(1);
            } else {
                iIntValue = 0;
            }
            sQLiteCursorQueryFinalized.dispose();
            d = (iIntValue2 <= 0 || getUserConfig().ratingLoadTime == 0) ? 0.0d : iIntValue - getUserConfig().ratingLoadTime;
        } catch (Exception e) {
            FileLog.e(e);
        }
        final double d2 = d;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$increasePeerRaiting$156(j, d2);
            }
        });
    }

    public static int lambda$increaseWebappRating$151(TLRPC.TL_topPeer tL_topPeer, TLRPC.TL_topPeer tL_topPeer2) {
        double d = tL_topPeer.rating;
        double d2 = tL_topPeer2.rating;
        if (d > d2) {
            return -1;
        }
        return d < d2 ? 1 : 0;
    }

    public void lambda$loadArchivedStickersCount$71(TLRPC.TL_error tL_error, TLObject tLObject, int i) {
        if (tL_error == null) {
            TLRPC.TL_messages_archivedStickers tL_messages_archivedStickers = (TLRPC.TL_messages_archivedStickers) tLObject;
            this.archivedStickersCount[i] = tL_messages_archivedStickers.count;
            MessagesController.getNotificationsSettings(this.currentAccount).edit().putInt(DiffUtil.m(i, "archivedStickersCount"), tL_messages_archivedStickers.count).commit();
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.archivedStickersCountDidLoad, Integer.valueOf(i));
        }
    }

    public void lambda$loadArchivedStickersCount$72(int i, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ImageLoader$$ExternalSyntheticLambda14(this, tL_error, tLObject, i, 6));
    }

    public void lambda$loadAttachMenuBots$3() throws Throwable {
        long j;
        SQLiteCursor sQLiteCursor;
        TLRPC.TL_attachMenuBots tL_attachMenuBots;
        int i;
        TLRPC.TL_attachMenuBots tL_attachMenuBots2;
        SQLiteCursor sQLiteCursorQueryFinalized;
        TLRPC.TL_attachMenuBots tL_attachMenuBots3;
        SQLiteCursor sQLiteCursorIntValue = null;
        tL_attachMenuBots = null;
        TLRPC.TL_attachMenuBots tL_attachMenuBots4 = null;
        sQLiteCursorIntValue = null;
        long jLongValue = 0;
        try {
            try {
                sQLiteCursorQueryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT data, hash, date FROM attach_menu_bots", new Object[0]);
                try {
                    try {
                        if (sQLiteCursorQueryFinalized.next()) {
                            NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                            if (nativeByteBufferByteBufferValue != null) {
                                TLRPC.AttachMenuBots attachMenuBotsTLdeserialize = TLRPC.AttachMenuBots.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), true);
                                tL_attachMenuBots4 = attachMenuBotsTLdeserialize instanceof TLRPC.TL_attachMenuBots ? (TLRPC.TL_attachMenuBots) attachMenuBotsTLdeserialize : null;
                                nativeByteBufferByteBufferValue.reuse();
                            }
                            jLongValue = sQLiteCursorQueryFinalized.longValue(1);
                            j = jLongValue;
                            tL_attachMenuBots3 = tL_attachMenuBots4;
                            sQLiteCursorIntValue = sQLiteCursorQueryFinalized.intValue(2);
                        } else {
                            j = 0;
                            tL_attachMenuBots3 = null;
                            sQLiteCursorIntValue = null;
                        }
                        if (tL_attachMenuBots3 != null) {
                            try {
                                ArrayList<Long> arrayList = new ArrayList<>();
                                for (int i2 = 0; i2 < tL_attachMenuBots3.bots.size(); i2++) {
                                    arrayList.add(Long.valueOf(tL_attachMenuBots3.bots.get(i2).bot_id));
                                }
                                tL_attachMenuBots3.users.addAll(getMessagesStorage().getUsers(arrayList));
                            } catch (Exception e) {
                                e = e;
                                tL_attachMenuBots = tL_attachMenuBots3;
                                sQLiteCursor = sQLiteCursorIntValue;
                                sQLiteCursorIntValue = sQLiteCursorQueryFinalized;
                                FileLog.e((Throwable) e, false);
                                if (sQLiteCursorIntValue != null) {
                                    sQLiteCursorQueryFinalized = sQLiteCursorIntValue;
                                    sQLiteCursorIntValue = sQLiteCursor;
                                    tL_attachMenuBots3 = tL_attachMenuBots;
                                } else {
                                    i = sQLiteCursor;
                                    tL_attachMenuBots2 = tL_attachMenuBots;
                                }
                                processLoadedMenuBots(tL_attachMenuBots2, j, i, true);
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        sQLiteCursorIntValue = sQLiteCursorQueryFinalized;
                        if (sQLiteCursorIntValue != null) {
                            sQLiteCursorIntValue.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    j = jLongValue;
                    sQLiteCursor = null;
                    tL_attachMenuBots = tL_attachMenuBots4;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e3) {
            e = e3;
            j = 0;
            sQLiteCursor = null;
            tL_attachMenuBots = null;
        }
        sQLiteCursorQueryFinalized.dispose();
        i = sQLiteCursorIntValue;
        tL_attachMenuBots2 = tL_attachMenuBots3;
        processLoadedMenuBots(tL_attachMenuBots2, j, i, true);
    }

    public void lambda$loadAttachMenuBots$4(Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (tLObject instanceof TLRPC.TL_attachMenuBotsNotModified) {
            processLoadedMenuBots(null, 0L, iCurrentTimeMillis, false);
        } else if (tLObject instanceof TLRPC.TL_attachMenuBots) {
            TLRPC.TL_attachMenuBots tL_attachMenuBots = (TLRPC.TL_attachMenuBots) tLObject;
            processLoadedMenuBots(tL_attachMenuBots, tL_attachMenuBots.hash, iCurrentTimeMillis, false);
        }
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
    }

    public void lambda$loadAvatarConstructor$241(TLObject tLObject, SharedPreferences sharedPreferences, boolean z) {
        if (tLObject instanceof TLRPC.TL_emojiList) {
            SerializedData serializedData = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (z) {
                this.profileAvatarConstructorDefault = (TLRPC.TL_emojiList) tLObject;
                editorEdit.putString("profile", Utilities.bytesToHex(serializedData.toByteArray()));
                editorEdit.putLong("profile_last_check", System.currentTimeMillis());
            } else {
                this.groupAvatarConstructorDefault = (TLRPC.TL_emojiList) tLObject;
                editorEdit.putString("group", Utilities.bytesToHex(serializedData.toByteArray()));
                editorEdit.putLong("group_last_check", System.currentTimeMillis());
            }
            editorEdit.apply();
        }
    }

    public void lambda$loadAvatarConstructor$242(SharedPreferences sharedPreferences, boolean z, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new CacheFetcher$$ExternalSyntheticLambda0(this, tLObject, sharedPreferences, z, 8));
    }

    public void lambda$loadBotInfo$197(Utilities.Callback callback, TL_bots.BotInfo botInfo, int i) {
        if (callback != null) {
            callback.run(botInfo);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botInfoDidLoad, botInfo, Integer.valueOf(i));
    }

    public static void lambda$loadBotInfo$198(Utilities.Callback callback) {
        if (callback != null) {
            callback.run(null);
        }
    }

    public void lambda$loadBotInfo$199(long j, long j2, Utilities.Callback callback, int i) {
        try {
            TL_bots.BotInfo botInfoLoadBotInfoInternal = loadBotInfoInternal(j, j2);
            if (botInfoLoadBotInfoInternal != null) {
                AndroidUtilities.runOnUIThread(new ImageLoader$$ExternalSyntheticLambda14(this, callback, botInfoLoadBotInfoInternal, i, 7));
            } else if (callback != null) {
                AndroidUtilities.runOnUIThread(new MessagesStorage$$ExternalSyntheticLambda257(3, callback));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$loadBotKeyboard$195(TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botKeyboardDidLoad, message, topicKey);
    }

    public void lambda$loadBotKeyboard$196(MessagesStorage.TopicKey topicKey, boolean z) {
        SQLiteCursor sQLiteCursorQueryFinalized;
        TLRPC.Message messageTLdeserialize;
        NativeByteBuffer nativeByteBufferByteBufferValue;
        try {
            if (topicKey.topicId != 0) {
                SQLiteDatabase database = getMessagesStorage().getDatabase();
                Locale locale = Locale.US;
                sQLiteCursorQueryFinalized = database.queryFinalized("SELECT info FROM bot_keyboard_topics WHERE uid = " + topicKey.dialogId + " AND tid = " + topicKey.topicId, new Object[0]);
            } else {
                SQLiteDatabase database2 = getMessagesStorage().getDatabase();
                Locale locale2 = Locale.US;
                sQLiteCursorQueryFinalized = database2.queryFinalized("SELECT info FROM bot_keyboard WHERE uid = " + topicKey.dialogId, new Object[0]);
            }
            if (!sQLiteCursorQueryFinalized.next() || sQLiteCursorQueryFinalized.isNull(0) || (nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0)) == null) {
                messageTLdeserialize = null;
            } else {
                messageTLdeserialize = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                nativeByteBufferByteBufferValue.reuse();
            }
            sQLiteCursorQueryFinalized.dispose();
            if (messageTLdeserialize != null || z) {
                AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda99(this, messageTLdeserialize, topicKey));
            }
        } catch (Exception e) {
            FileLog.e(e);
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
            AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda3(this, 16));
        } else {
            getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda3(this, 17));
        }
    }

    public void lambda$loadFeaturedStickers$55(boolean z) {
        SQLiteCursor sQLiteCursorQueryFinalized;
        boolean z2;
        boolean z3;
        long j;
        int i;
        int iIntValue;
        ArrayList<Long> arrayList = new ArrayList<>();
        ArrayList<TLRPC.StickerSetCovered> arrayList2 = null;
        int i2 = 0;
        long jLongValue = 0;
        try {
            SQLiteDatabase database = getMessagesStorage().getDatabase();
            StringBuilder sb = new StringBuilder("SELECT data, unread, date, hash, premium FROM stickers_featured WHERE emoji = ");
            sb.append(z ? 1 : 0);
            sb.append(" AND id = ");
            z2 = true;
            sb.append(z ? 2 : 1);
            sQLiteCursorQueryFinalized = database.queryFinalized(sb.toString(), new Object[0]);
            try {
                if (sQLiteCursorQueryFinalized.next()) {
                    NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                    if (nativeByteBufferByteBufferValue != null) {
                        ArrayList<TLRPC.StickerSetCovered> arrayList3 = new ArrayList<>();
                        try {
                            int int32 = nativeByteBufferByteBufferValue.readInt32(false);
                            for (int i3 = 0; i3 < int32; i3++) {
                                arrayList3.add(TLRPC.StickerSetCovered.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false));
                            }
                            nativeByteBufferByteBufferValue.reuse();
                            arrayList2 = arrayList3;
                        } catch (Throwable th) {
                            th = th;
                            arrayList2 = arrayList3;
                            iIntValue = 0;
                            try {
                                FileLog.e(th);
                                if (sQLiteCursorQueryFinalized == null) {
                                    i2 = iIntValue;
                                    z2 = false;
                                    sQLiteCursorQueryFinalized.dispose();
                                    long j2 = jLongValue;
                                    z3 = z2;
                                    j = j2;
                                    i = i2;
                                } else {
                                    i = iIntValue;
                                    j = jLongValue;
                                    z3 = false;
                                }
                                processLoadedFeaturedStickers(z, arrayList2, arrayList, z3, true, i, j);
                            } catch (Throwable th2) {
                                if (sQLiteCursorQueryFinalized != null) {
                                    sQLiteCursorQueryFinalized.dispose();
                                }
                                throw th2;
                            }
                        }
                    }
                    NativeByteBuffer nativeByteBufferByteBufferValue2 = sQLiteCursorQueryFinalized.byteBufferValue(1);
                    if (nativeByteBufferByteBufferValue2 != null) {
                        int int33 = nativeByteBufferByteBufferValue2.readInt32(false);
                        for (int i4 = 0; i4 < int33; i4++) {
                            arrayList.add(Long.valueOf(nativeByteBufferByteBufferValue2.readInt64(false)));
                        }
                        nativeByteBufferByteBufferValue2.reuse();
                    }
                    iIntValue = sQLiteCursorQueryFinalized.intValue(2);
                    try {
                        jLongValue = sQLiteCursorQueryFinalized.longValue(3);
                        if (sQLiteCursorQueryFinalized.intValue(4) == 1) {
                            i2 = iIntValue;
                        } else {
                            i2 = iIntValue;
                            z2 = false;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        FileLog.e(th);
                        if (sQLiteCursorQueryFinalized == null) {
                            i = iIntValue;
                            j = jLongValue;
                            z3 = false;
                        }
                        processLoadedFeaturedStickers(z, arrayList2, arrayList, z3, true, i, j);
                    }
                } else {
                    z2 = false;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            sQLiteCursorQueryFinalized = null;
        }
        sQLiteCursorQueryFinalized.dispose();
        long j3 = jLongValue;
        z3 = z2;
        j = j3;
        i = i2;
        processLoadedFeaturedStickers(z, arrayList2, arrayList, z3, true, i, j);
    }

    public void lambda$loadFeaturedStickers$56(boolean z, int i) {
        this.loadingFeaturedStickers[z ? 1 : 0] = false;
        this.featuredStickersLoaded[z ? 1 : 0] = true;
        this.loadFeaturedDate[z ? 1 : 0] = i;
    }

    public void lambda$loadFeaturedStickers$57(TLObject tLObject, boolean z, long j) {
        if (tLObject instanceof TLRPC.TL_messages_featuredStickers) {
            TLRPC.TL_messages_featuredStickers tL_messages_featuredStickers = (TLRPC.TL_messages_featuredStickers) tLObject;
            processLoadedFeaturedStickers(z, tL_messages_featuredStickers.sets, tL_messages_featuredStickers.unread, tL_messages_featuredStickers.premium, false, (int) (System.currentTimeMillis() / 1000), tL_messages_featuredStickers.hash);
        } else {
            if (!(tLObject instanceof TLRPC.TL_messages_featuredStickersNotModified)) {
                processLoadedFeaturedStickers(z, null, null, false, false, (int) (System.currentTimeMillis() / 1000), j);
                return;
            }
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda68(this, z, iCurrentTimeMillis, 0));
            putFeaturedStickersToCache(z, null, null, iCurrentTimeMillis, j, false);
        }
    }

    public void lambda$loadFeaturedStickers$58(boolean z, long j, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ProfileActivity$$ExternalSyntheticLambda72(this, tLObject, z, j, 1));
    }

    public void lambda$loadGroupStickerSet$43(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.groupStickerSets.put(tL_messages_stickerSet, tL_messages_stickerSet.set.id);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupStickersDidLoad, Long.valueOf(tL_messages_stickerSet.set.id), tL_messages_stickerSet);
    }

    public void lambda$loadGroupStickerSet$44(TLRPC.StickerSet stickerSet) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSetTLdeserialize;
        TLRPC.StickerSet stickerSet2;
        NativeByteBuffer nativeByteBufferByteBufferValue;
        try {
            SQLiteCursor sQLiteCursorQueryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT document FROM web_recent_v3 WHERE id = 's_" + stickerSet.id + "'", new Object[0]);
            if (!sQLiteCursorQueryFinalized.next() || sQLiteCursorQueryFinalized.isNull(0) || (nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0)) == null) {
                tL_messages_stickerSetTLdeserialize = null;
            } else {
                tL_messages_stickerSetTLdeserialize = TLRPC.messages_StickerSet.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                nativeByteBufferByteBufferValue.reuse();
            }
            sQLiteCursorQueryFinalized.dispose();
            if (tL_messages_stickerSetTLdeserialize == null || (stickerSet2 = tL_messages_stickerSetTLdeserialize.set) == null || stickerSet2.hash != stickerSet.hash) {
                loadGroupStickerSet(stickerSet, false);
            }
            if (tL_messages_stickerSetTLdeserialize == null || tL_messages_stickerSetTLdeserialize.set == null) {
                return;
            }
            AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda114(this, tL_messages_stickerSetTLdeserialize, 2));
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public void lambda$loadGroupStickerSet$45(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.groupStickerSets.put(tL_messages_stickerSet, tL_messages_stickerSet.set.id);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupStickersDidLoad, Long.valueOf(tL_messages_stickerSet.set.id), tL_messages_stickerSet);
    }

    public void lambda$loadGroupStickerSet$46(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda114(this, (TLRPC.TL_messages_stickerSet) tLObject, 1));
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
        if (Math.abs(getUserConfig().lastHintsSyncTime - ((int) (System.currentTimeMillis() / 1000))) >= 86400 || BuildVars.DEBUG_PRIVATE_VERSION) {
            loadHints(false);
        }
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
            int i = 0;
            SQLiteCursor sQLiteCursorQueryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT did, type, rating FROM chat_hints WHERE 1 ORDER BY rating DESC", new Object[0]);
            while (sQLiteCursorQueryFinalized.next()) {
                long jLongValue = sQLiteCursorQueryFinalized.longValue(i);
                if (jLongValue != clientUserId) {
                    int iIntValue = sQLiteCursorQueryFinalized.intValue(1);
                    TLRPC.TL_topPeer tL_topPeer = new TLRPC.TL_topPeer();
                    long j = clientUserId;
                    tL_topPeer.rating = sQLiteCursorQueryFinalized.doubleValue(2);
                    if (jLongValue > 0) {
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_topPeer.peer = tL_peerUser;
                        tL_peerUser.user_id = jLongValue;
                        arrayList7.add(Long.valueOf(jLongValue));
                    } else {
                        TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                        tL_topPeer.peer = tL_peerChat;
                        long j2 = -jLongValue;
                        tL_peerChat.chat_id = j2;
                        arrayList8.add(Long.valueOf(j2));
                    }
                    if (iIntValue == 0) {
                        arrayList.add(tL_topPeer);
                    } else if (iIntValue == 1) {
                        arrayList2.add(tL_topPeer);
                    } else if (iIntValue == 2) {
                        arrayList4.add(tL_topPeer);
                    } else if (iIntValue == 3) {
                        arrayList3.add(tL_topPeer);
                    }
                    clientUserId = j;
                    i = 0;
                }
            }
            sQLiteCursorQueryFinalized.dispose();
            if (!arrayList7.isEmpty()) {
                getMessagesStorage().getUsersInternal(arrayList7, arrayList5);
            }
            if (!arrayList8.isEmpty()) {
                getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList8), arrayList6);
            }
            AndroidUtilities.runOnUIThread(new AndroidUtilities$$ExternalSyntheticLambda42(this, arrayList5, arrayList6, arrayList, arrayList2, arrayList3, arrayList4, 2));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$loadHints$146() {
        getUserConfig().suggestContacts = true;
        getUserConfig().lastHintsSyncTime = (int) (System.currentTimeMillis() / 1000);
        getUserConfig().saveConfig(false);
    }

    public void lambda$loadHints$147(TLRPC.TL_contacts_topPeers tL_contacts_topPeers) {
        int i;
        try {
            getMessagesStorage().getDatabase().executeFast("DELETE FROM chat_hints WHERE 1").stepThis().dispose();
            getMessagesStorage().getDatabase().beginTransaction();
            getMessagesStorage().putUsersAndChats(tL_contacts_topPeers.users, tL_contacts_topPeers.chats, false, false);
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
            for (int i2 = 0; i2 < tL_contacts_topPeers.categories.size(); i2++) {
                TLRPC.TL_topPeerCategoryPeers tL_topPeerCategoryPeers = tL_contacts_topPeers.categories.get(i2);
                TLRPC.TopPeerCategory topPeerCategory = tL_topPeerCategoryPeers.category;
                if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsInline) {
                    i = 1;
                } else if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsApp) {
                    i = 2;
                } else {
                    i = topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsGuestChat ? 3 : 0;
                }
                for (int i3 = 0; i3 < tL_topPeerCategoryPeers.peers.size(); i3++) {
                    TLRPC.TL_topPeer tL_topPeer = tL_topPeerCategoryPeers.peers.get(i3);
                    sQLitePreparedStatementExecuteFast.requery();
                    sQLitePreparedStatementExecuteFast.bindLong(1, MessageObject.getPeerId(tL_topPeer.peer));
                    sQLitePreparedStatementExecuteFast.bindInteger(2, i);
                    sQLitePreparedStatementExecuteFast.bindDouble(3, tL_topPeer.rating);
                    sQLitePreparedStatementExecuteFast.bindInteger(4, 0);
                    sQLitePreparedStatementExecuteFast.step();
                }
            }
            sQLitePreparedStatementExecuteFast.dispose();
            getMessagesStorage().getDatabase().commitTransaction();
            AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda3(this, 14));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$loadHints$148(TLRPC.contacts_TopPeers contacts_toppeers, TLRPC.TL_error tL_error) {
        if (!(contacts_toppeers instanceof TLRPC.TL_contacts_topPeers)) {
            if (contacts_toppeers instanceof TLRPC.TL_contacts_topPeersDisabled) {
                getUserConfig().suggestContacts = false;
                getUserConfig().lastHintsSyncTime = (int) (System.currentTimeMillis() / 1000);
                getUserConfig().saveConfig(false);
                clearTopPeers();
                return;
            }
            return;
        }
        TLRPC.TL_contacts_topPeers tL_contacts_topPeers = (TLRPC.TL_contacts_topPeers) contacts_toppeers;
        getMessagesController().putUsers(tL_contacts_topPeers.users, false);
        getMessagesController().putChats(tL_contacts_topPeers.chats, false);
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        for (int i = 0; i < tL_contacts_topPeers.categories.size(); i++) {
            TLRPC.TL_topPeerCategoryPeers tL_topPeerCategoryPeers = tL_contacts_topPeers.categories.get(i);
            TLRPC.TopPeerCategory topPeerCategory = tL_topPeerCategoryPeers.category;
            if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsInline) {
                this.inlineBots = tL_topPeerCategoryPeers.peers;
                getUserConfig().botRatingLoadTime = iCurrentTimeMillis;
            } else if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsApp) {
                this.webapps = tL_topPeerCategoryPeers.peers;
                getUserConfig().webappRatingLoadTime = iCurrentTimeMillis;
            } else if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsGuestChat) {
                this.guestBots = tL_topPeerCategoryPeers.peers;
                getUserConfig().botGuestRatingLoadTime = iCurrentTimeMillis;
            } else {
                this.hints = tL_topPeerCategoryPeers.peers;
                long clientUserId = getUserConfig().getClientUserId();
                for (int i2 = 0; i2 < this.hints.size(); i2++) {
                    if (this.hints.get(i2).peer.user_id == clientUserId) {
                        this.hints.remove(i2);
                        break;
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
        getMessagesStorage().getStorageQueue().postRunnable(new FileLog$$ExternalSyntheticLambda3(18, this, tL_contacts_topPeers));
    }

    public void lambda$loadMedia$126(long j, int i, int i2, int i3, int i4, long j2, int i5, boolean z, int i6, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            getMessagesController().removeDeletedMessagesFromArray(j, messages_messages.messages);
            processLoadedMedia(messages_messages, j, i2, i3, i, i4, j2, 0, i5, z, i == 0 ? messages_messages.messages.size() == 0 : messages_messages.messages.size() <= 1, i6);
        }
    }

    public void lambda$loadMusic$141(long j, ArrayList arrayList, ArrayList arrayList2) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.musicDidLoad, Long.valueOf(j), arrayList, arrayList2);
    }

    public void lambda$loadMusic$142(long r18, long r20, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.lambda$loadMusic$142(long, long, long):void");
    }

    public void lambda$loadPinnedMessageInternal$164(long j, long j2, TLRPC.TL_channels_getMessages tL_channels_getMessages, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            removeEmptyMessages(messages_messages.messages);
            if (!messages_messages.messages.isEmpty()) {
                getMessagesController().getChat(Long.valueOf(j));
                ImageLoader.saveMessagesThumbs(messages_messages.messages);
                broadcastPinnedMessage(messages_messages.messages, messages_messages.users, messages_messages.chats, false, false);
                getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                savePinnedMessages(j2, messages_messages.messages);
                return;
            }
        }
        getMessagesStorage().updatePinnedMessages(j2, tL_channels_getMessages.id, false, -1, 0, false, null);
    }

    public void lambda$loadPinnedMessageInternal$165(long j, TLRPC.TL_messages_getMessages tL_messages_getMessages, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            removeEmptyMessages(messages_messages.messages);
            if (!messages_messages.messages.isEmpty()) {
                ImageLoader.saveMessagesThumbs(messages_messages.messages);
                broadcastPinnedMessage(messages_messages.messages, messages_messages.users, messages_messages.chats, false, false);
                getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                savePinnedMessages(j, messages_messages.messages);
                return;
            }
        }
        getMessagesStorage().updatePinnedMessages(j, tL_messages_getMessages.id, false, -1, 0, false, null);
    }

    public void lambda$loadPinnedMessages$161(long j) {
        this.loadingPinnedMessages.remove(j);
    }

    public void lambda$loadPinnedMessages$162(int i, TLRPC.TL_messages_search tL_messages_search, long j, int i2, TLObject tLObject, TLRPC.TL_error tL_error) {
        int iMax;
        boolean z;
        ArrayList<Integer> arrayList = new ArrayList<>();
        HashMap<Integer, MessageObject> map = new HashMap<>();
        int i3 = 1;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            LongSparseArray longSparseArray = new LongSparseArray();
            for (int i4 = 0; i4 < messages_messages.users.size(); i4++) {
                TLRPC.User user = messages_messages.users.get(i4);
                longSparseArray.put(user, user.id);
            }
            LongSparseArray longSparseArray2 = new LongSparseArray();
            for (int i5 = 0; i5 < messages_messages.chats.size(); i5++) {
                TLRPC.Chat chat = messages_messages.chats.get(i5);
                longSparseArray2.put(chat, chat.id);
            }
            getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
            getMessagesController().putUsers(messages_messages.users, false);
            getMessagesController().putChats(messages_messages.chats, false);
            int size = messages_messages.messages.size();
            for (int i6 = 0; i6 < size; i6++) {
                TLRPC.Message message = messages_messages.messages.get(i6);
                if (!(message instanceof TLRPC.TL_messageService) && !(message instanceof TLRPC.TL_messageEmpty)) {
                    arrayList.add(Integer.valueOf(message.id));
                    map.put(Integer.valueOf(message.id), new MessageObject(this.currentAccount, message, longSparseArray, longSparseArray2, false, false));
                }
            }
            if (i != 0 && arrayList.isEmpty()) {
                arrayList.add(Integer.valueOf(i));
            }
            i3 = messages_messages.messages.size() >= tL_messages_search.limit ? 0 : 1;
            iMax = Math.max(messages_messages.count, messages_messages.messages.size());
            z = i3;
        } else {
            if (i != 0) {
                arrayList.add(Integer.valueOf(i));
            } else {
                i3 = 0;
            }
            iMax = i3;
            z = false;
        }
        getMessagesStorage().updatePinnedMessages(j, arrayList, true, iMax, i2, z, map);
        AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda60(this, j, 1));
    }

    public void lambda$loadPinnedMessages$163(long j, long j2, ArrayList arrayList) {
        loadPinnedMessageInternal(j, j2, arrayList, false);
    }

    public void lambda$loadPremiumPromo$7() throws Throwable {
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo;
        SQLiteCursor sQLiteCursorQueryFinalized;
        SQLiteCursor sQLiteCursor = null;
        tL_help_premiumPromoTLdeserialize = null;
        tL_help_premiumPromoTLdeserialize = null;
        TLRPC.TL_help_premiumPromo tL_help_premiumPromoTLdeserialize = null;
        sQLiteCursor = null;
        int iIntValue = 0;
        try {
            try {
                sQLiteCursorQueryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT data, date FROM premium_promo", new Object[0]);
                try {
                    if (sQLiteCursorQueryFinalized.next()) {
                        NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                        if (nativeByteBufferByteBufferValue != null) {
                            tL_help_premiumPromoTLdeserialize = TLRPC.TL_help_premiumPromo.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), true);
                            nativeByteBufferByteBufferValue.reuse();
                        }
                        iIntValue = sQLiteCursorQueryFinalized.intValue(1);
                    }
                } catch (Exception e) {
                    e = e;
                    tL_help_premiumPromo = tL_help_premiumPromoTLdeserialize;
                    sQLiteCursor = sQLiteCursorQueryFinalized;
                    FileLog.e((Throwable) e, false);
                    if (sQLiteCursor != null) {
                        TLRPC.TL_help_premiumPromo tL_help_premiumPromo2 = tL_help_premiumPromo;
                        sQLiteCursorQueryFinalized = sQLiteCursor;
                        tL_help_premiumPromoTLdeserialize = tL_help_premiumPromo2;
                    }
                    processLoadedPremiumPromo(tL_help_premiumPromo, iIntValue, true);
                } catch (Throwable th) {
                    th = th;
                    sQLiteCursor = sQLiteCursorQueryFinalized;
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                tL_help_premiumPromo = null;
            }
            sQLiteCursorQueryFinalized.dispose();
            tL_help_premiumPromo = tL_help_premiumPromoTLdeserialize;
            processLoadedPremiumPromo(tL_help_premiumPromo, iIntValue, true);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void lambda$loadPremiumPromo$8(TLObject tLObject, TLRPC.TL_error tL_error) {
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (tLObject instanceof TLRPC.TL_help_premiumPromo) {
            processLoadedPremiumPromo((TLRPC.TL_help_premiumPromo) tLObject, iCurrentTimeMillis, false);
        }
    }

    public void lambda$loadReactions$11(List list, int i, int i2) {
        processLoadedReactions(list, i, i2, true);
    }

    public void lambda$loadReactions$12() throws Throwable {
        ArrayList arrayList;
        int iIntValue;
        SQLiteCursor sQLiteCursor;
        ArrayList arrayList2;
        int i;
        ArrayList arrayList3;
        int i2;
        int iIntValue2;
        ArrayList arrayList4;
        SQLiteCursor sQLiteCursor2;
        ?? r1 = 0;
        arrayList = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        SQLiteCursor sQLiteCursor3 = null;
        int i3 = 0;
        try {
            try {
                SQLiteCursor sQLiteCursorQueryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT data, hash, date FROM reactions", new Object[0]);
                try {
                    try {
                        boolean next = sQLiteCursorQueryFinalized.next();
                        SQLiteCursor sQLiteCursor4 = sQLiteCursorQueryFinalized;
                        if (next) {
                            NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                            if (nativeByteBufferByteBufferValue != null) {
                                int int32 = nativeByteBufferByteBufferValue.readInt32(false);
                                ArrayList arrayList7 = new ArrayList(int32);
                                for (int i4 = 0; i4 < int32; i4++) {
                                    try {
                                        arrayList7.add(TLRPC.TL_availableReaction.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), true));
                                    } catch (Exception e) {
                                        e = e;
                                        sQLiteCursor3 = sQLiteCursorQueryFinalized;
                                        arrayList = arrayList7;
                                        iIntValue2 = 0;
                                        sQLiteCursor2 = sQLiteCursor3;
                                        arrayList4 = arrayList;
                                        FileLog.e((Throwable) e, false);
                                        if (sQLiteCursor2 != null) {
                                            ArrayList arrayList8 = arrayList4;
                                            sQLiteCursor4 = sQLiteCursor2;
                                            arrayList5 = arrayList8;
                                            i3 = iIntValue2;
                                            iIntValue = 0;
                                            arrayList2 = arrayList5;
                                            sQLiteCursor = sQLiteCursor4;
                                            sQLiteCursor.dispose();
                                            i = iIntValue;
                                            arrayList3 = arrayList2;
                                            i2 = i3;
                                            r1 = arrayList2;
                                        } else {
                                            arrayList3 = arrayList4;
                                            i2 = iIntValue2;
                                            i = 0;
                                            r1 = sQLiteCursor2;
                                        }
                                        AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda221(this, arrayList3, i2, i, 0));
                                    }
                                }
                                nativeByteBufferByteBufferValue.reuse();
                                arrayList6 = arrayList7;
                            }
                            iIntValue2 = sQLiteCursorQueryFinalized.intValue(1);
                            try {
                                iIntValue = sQLiteCursorQueryFinalized.intValue(2);
                                i3 = iIntValue2;
                                arrayList2 = arrayList6;
                                sQLiteCursor = sQLiteCursorQueryFinalized;
                            } catch (Exception e2) {
                                e = e2;
                                arrayList4 = arrayList6;
                                sQLiteCursor2 = sQLiteCursorQueryFinalized;
                                FileLog.e((Throwable) e, false);
                                if (sQLiteCursor2 != null) {
                                    ArrayList arrayList9 = arrayList4;
                                    sQLiteCursor4 = sQLiteCursor2;
                                    arrayList5 = arrayList9;
                                    i3 = iIntValue2;
                                    iIntValue = 0;
                                    arrayList2 = arrayList5;
                                    sQLiteCursor = sQLiteCursor4;
                                } else {
                                    arrayList3 = arrayList4;
                                    i2 = iIntValue2;
                                    i = 0;
                                    r1 = sQLiteCursor2;
                                }
                                AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda221(this, arrayList3, i2, i, 0));
                            }
                        } else {
                            iIntValue = 0;
                            arrayList2 = arrayList5;
                            sQLiteCursor = sQLiteCursor4;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        arrayList = arrayList6;
                        sQLiteCursor3 = sQLiteCursorQueryFinalized;
                    }
                } catch (Throwable th) {
                    th = th;
                    r1 = sQLiteCursorQueryFinalized;
                    if (r1 != 0) {
                        r1.dispose();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e4) {
            e = e4;
            arrayList = null;
        }
        sQLiteCursor.dispose();
        i = iIntValue;
        arrayList3 = arrayList2;
        i2 = i3;
        r1 = arrayList2;
        AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda221(this, arrayList3, i2, i, 0));
    }

    public void lambda$loadReactions$13(TLObject tLObject) {
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (tLObject instanceof TLRPC.TL_messages_availableReactionsNotModified) {
            processLoadedReactions(null, 0, iCurrentTimeMillis, false);
        } else if (tLObject instanceof TLRPC.TL_messages_availableReactions) {
            TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject;
            processLoadedReactions(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, iCurrentTimeMillis, false);
        }
    }

    public void lambda$loadReactions$14(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda74(this, tLObject, 2));
    }

    public void lambda$loadRecentAndTopReactions$235(TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr) {
        if (tL_error == null) {
            if (tLObject instanceof TLRPC.TL_messages_reactions) {
                TLRPC.TL_messages_reactions tL_messages_reactions = (TLRPC.TL_messages_reactions) tLObject;
                this.recentReactions.clear();
                this.recentReactions.addAll(tL_messages_reactions.reactions);
                saveReactionsToPref(sharedPreferences, tL_messages_reactions.hash, tL_messages_reactions.reactions);
            }
            boolean z = tLObject instanceof TLRPC.TL_messages_reactionsNotModified;
        }
        zArr[0] = true;
        if (zArr[1]) {
            this.loadingRecentReactions = false;
        }
    }

    public void lambda$loadRecentAndTopReactions$236(SharedPreferences sharedPreferences, boolean[] zArr, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda56(this, tL_error, tLObject, sharedPreferences, zArr, 0));
    }

    public void lambda$loadRecentAndTopReactions$237(TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr) {
        if (tL_error == null) {
            if (tLObject instanceof TLRPC.TL_messages_reactions) {
                TLRPC.TL_messages_reactions tL_messages_reactions = (TLRPC.TL_messages_reactions) tLObject;
                this.topReactions.clear();
                this.topReactions.addAll(tL_messages_reactions.reactions);
                saveReactionsToPref(sharedPreferences, tL_messages_reactions.hash, tL_messages_reactions.reactions);
            }
            boolean z = tLObject instanceof TLRPC.TL_messages_reactionsNotModified;
        }
        zArr[1] = true;
        if (zArr[0]) {
            this.loadingRecentReactions = false;
        }
    }

    public void lambda$loadRecentAndTopReactions$238(SharedPreferences sharedPreferences, boolean[] zArr, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda56(this, tL_error, tLObject, sharedPreferences, zArr, 1));
    }

    public void lambda$loadRecents$48(boolean z, ArrayList arrayList, int i) {
        if (z) {
            this.recentGifs = arrayList;
            this.loadingRecentGifs = false;
            this.recentGifsLoaded = true;
        } else {
            this.recentStickers[i] = arrayList;
            this.loadingRecentStickers[i] = false;
            this.recentStickersLoaded[i] = true;
        }
        if (i == 3) {
            preloadNextGreetingsSticker();
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.recentDocumentsDidLoad, Boolean.valueOf(z), Integer.valueOf(i));
        loadRecents(i, z, false, false);
    }

    public void lambda$loadRecents$49(boolean z, int i) {
        int i2;
        NativeByteBuffer nativeByteBufferByteBufferValue;
        if (z) {
            i2 = 2;
        } else {
            i2 = 3;
            if (i != 0) {
                if (i == 1) {
                    i2 = 4;
                } else if (i == 3) {
                    i2 = 6;
                } else {
                    i2 = 7;
                    if (i != 5) {
                        i2 = i == 7 ? 8 : 5;
                    }
                }
            }
        }
        try {
            SQLiteCursor sQLiteCursorQueryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT document FROM web_recent_v3 WHERE type = " + i2 + " ORDER BY date DESC", new Object[0]);
            ArrayList arrayList = new ArrayList();
            while (sQLiteCursorQueryFinalized.next()) {
                if (!sQLiteCursorQueryFinalized.isNull(0) && (nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0)) != null) {
                    TLRPC.Document documentTLdeserialize = TLRPC.Document.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                    if (documentTLdeserialize != null) {
                        arrayList.add(documentTLdeserialize);
                    }
                    nativeByteBufferByteBufferValue.reuse();
                }
            }
            sQLiteCursorQueryFinalized.dispose();
            AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda61(this, z, arrayList, i));
        } catch (Throwable th) {
            getMessagesStorage().checkSQLException(th);
        }
    }

    public void lambda$loadRecents$50(int i, TLObject tLObject, TLRPC.TL_error tL_error) {
        processLoadedRecentDocuments(i, tLObject instanceof TLRPC.TL_messages_savedGifs ? ((TLRPC.TL_messages_savedGifs) tLObject).gifs : null, true, 0, true);
    }

    public void lambda$loadRecents$51(int i, TLObject tLObject, TLRPC.TL_error tL_error) {
        ArrayList<TLRPC.Document> arrayList;
        if (i == 3 || i == 7) {
            if (tLObject instanceof TLRPC.TL_messages_stickers) {
                arrayList = ((TLRPC.TL_messages_stickers) tLObject).stickers;
            } else {
                arrayList = null;
            }
        } else if (i == 2) {
            if (tLObject instanceof TLRPC.TL_messages_favedStickers) {
                arrayList = ((TLRPC.TL_messages_favedStickers) tLObject).stickers;
            } else {
                arrayList = null;
            }
        } else if (tLObject instanceof TLRPC.TL_messages_recentStickers) {
            arrayList = ((TLRPC.TL_messages_recentStickers) tLObject).stickers;
        } else {
            arrayList = null;
        }
        processLoadedRecentDocuments(i, arrayList, false, 0, true);
    }

    public void lambda$loadRepliesOfDraftReplies$0(ArrayList arrayList) throws Throwable {
        try {
            ArrayList<Long> arrayList2 = new ArrayList<>();
            ArrayList<Long> arrayList3 = new ArrayList<>();
            LongSparseArray longSparseArray = new LongSparseArray();
            LongSparseArray longSparseArray2 = new LongSparseArray();
            for (int i = 0; i < arrayList.size(); i++) {
                try {
                    MessagesStorage.addReplyMessages((TLRPC.Message) arrayList.get(i), longSparseArray, longSparseArray2);
                } catch (Exception e) {
                    getMessagesStorage().checkSQLException(e);
                }
            }
            getMessagesStorage().loadReplyMessages(longSparseArray, longSparseArray2, arrayList2, arrayList3, 0);
        } catch (Exception e2) {
            FileLog.e(e2);
        }
    }

    public void lambda$loadReplyIcons$243(TLObject tLObject, SharedPreferences sharedPreferences) {
        if (tLObject instanceof TLRPC.TL_emojiList) {
            SerializedData serializedData = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            this.replyIconsDefault = (TLRPC.TL_emojiList) tLObject;
            editorEdit.putString("replyicons", Utilities.bytesToHex(serializedData.toByteArray()));
            editorEdit.putLong("replyicons_last_check", System.currentTimeMillis());
            editorEdit.apply();
        }
    }

    public void lambda$loadReplyIcons$244(SharedPreferences sharedPreferences, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda42(this, tLObject, sharedPreferences, 0));
    }

    public void lambda$loadReplyMessagesForMessages$170(Timer.Task task, long j, ArrayList arrayList) {
        Timer.done(task);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.replyMessagesDidLoad, Long.valueOf(j), arrayList, null);
    }

    public void lambda$loadReplyMessagesForMessages$171(Timer.Task task, Timer timer, ArrayList arrayList, long j, LongSparseArray longSparseArray, Runnable runnable) {
        Timer.done(task);
        Timer.Task taskStart = Timer.start(timer, "loadReplyMessagesForMessages: (encrypted) loading those messages from storage");
        try {
            ArrayList arrayList2 = new ArrayList();
            SQLiteDatabase database = getMessagesStorage().getDatabase();
            Locale locale = Locale.US;
            SQLiteCursor sQLiteCursorQueryFinalized = database.queryFinalized("SELECT m.data, m.mid, m.date, r.random_id FROM randoms_v2 as r INNER JOIN messages_v2 as m ON r.mid = m.mid AND r.uid = m.uid WHERE r.random_id IN(" + TextUtils.join(",", arrayList) + ")", new Object[0]);
            while (sQLiteCursorQueryFinalized.next()) {
                NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                if (nativeByteBufferByteBufferValue != null) {
                    TLRPC.Message messageTLdeserialize = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                    messageTLdeserialize.readAttachPath(nativeByteBufferByteBufferValue, getUserConfig().clientUserId);
                    nativeByteBufferByteBufferValue.reuse();
                    messageTLdeserialize.id = sQLiteCursorQueryFinalized.intValue(1);
                    messageTLdeserialize.date = sQLiteCursorQueryFinalized.intValue(2);
                    messageTLdeserialize.dialog_id = j;
                    long jLongValue = sQLiteCursorQueryFinalized.longValue(3);
                    ArrayList arrayList3 = (ArrayList) longSparseArray.get(jLongValue);
                    longSparseArray.remove(jLongValue);
                    if (arrayList3 != null) {
                        MessageObject messageObject = new MessageObject(this.currentAccount, messageTLdeserialize, false, false);
                        arrayList2.add(messageObject);
                        for (int i = 0; i < arrayList3.size(); i++) {
                            MessageObject messageObject2 = (MessageObject) arrayList3.get(i);
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
            sQLiteCursorQueryFinalized.dispose();
            if (longSparseArray.size() != 0) {
                for (int i2 = 0; i2 < longSparseArray.size(); i2++) {
                    ArrayList arrayList4 = (ArrayList) longSparseArray.valueAt(i2);
                    for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                        TLRPC.MessageReplyHeader messageReplyHeader2 = ((MessageObject) arrayList4.get(i3)).messageOwner.reply_to;
                        if (messageReplyHeader2 != null) {
                            messageReplyHeader2.reply_to_random_id = 0L;
                        }
                    }
                }
            }
            Timer.done(taskStart);
            AndroidUtilities.runOnUIThread(new LaunchActivity$$ExternalSyntheticLambda121(this, Timer.start(timer, "loadReplyMessagesForMessages (encrypted) runOnUIThread: posting notification"), j, arrayList2, 2));
            if (runnable != null) {
                runnable.run();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void lambda$loadReplyMessagesForMessages$172(AtomicInteger atomicInteger, Runnable runnable) {
        if (atomicInteger.decrementAndGet() != 0 || runnable == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(runnable);
    }

    public void lambda$loadReplyMessagesForMessages$173(TLRPC.TL_error tL_error, TLRPC.messages_Messages messages_messages, long j, long j2, LongSparseArray longSparseArray, boolean z, TLObject tLObject, TLRPC.TL_error tL_error2) {
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
            messages_messages.messages.addAll(messages_messages2.messages);
            messages_messages.users.addAll(messages_messages2.users);
            messages_messages.chats.addAll(messages_messages2.chats);
            for (int i = 0; i < messages_messages.messages.size(); i++) {
                TLRPC.Message message = messages_messages.messages.get(i);
                if (message.dialog_id == 0) {
                    message.dialog_id = j;
                }
            }
            MessageObject.fixMessagePeer(messages_messages.messages, j2);
            ImageLoader.saveMessagesThumbs(messages_messages.messages);
            broadcastReplyMessages(messages_messages.messages, longSparseArray, messages_messages.users, messages_messages.chats, j, false);
            getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
            saveReplyMessages(longSparseArray, messages_messages.messages, z);
        }
    }

    public void lambda$loadReplyMessagesForMessages$174(Timer.Task task, TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages, final long j, final long j2, final LongSparseArray longSparseArray, final boolean z, Timer timer, AtomicInteger atomicInteger, Runnable runnable, TLObject tLObject, final TLRPC.TL_error tL_error) {
        TLObject tLObject2;
        Timer.done(task);
        if (tL_error == null) {
            final TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            int i = 0;
            while (i < messages_messages.messages.size()) {
                if (messages_messages.messages.get(i) instanceof TLRPC.TL_messageEmpty) {
                    messages_messages.messages.remove(i);
                    i--;
                }
                i++;
            }
            if (messages_messages.messages.size() < tL_messages_getScheduledMessages.id.size()) {
                if (j != 0) {
                    TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                    tL_channels_getMessages.channel = getMessagesController().getInputChannel(j);
                    tL_channels_getMessages.id = tL_messages_getScheduledMessages.id;
                    tLObject2 = tL_channels_getMessages;
                } else {
                    TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                    tL_messages_getMessages.id = tL_messages_getScheduledMessages.id;
                    tLObject2 = tL_messages_getMessages;
                }
                getConnectionsManager().sendRequest(tLObject2, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject3, TLRPC.TL_error tL_error2) {
                        this.f$0.lambda$loadReplyMessagesForMessages$173(tL_error, messages_messages, j2, j, longSparseArray, z, tLObject3, tL_error2);
                    }
                });
            } else {
                for (int i2 = 0; i2 < messages_messages.messages.size(); i2++) {
                    TLRPC.Message message = messages_messages.messages.get(i2);
                    if (message.dialog_id == 0) {
                        message.dialog_id = j2;
                    }
                }
                MessageObject.fixMessagePeer(messages_messages.messages, j);
                ImageLoader.saveMessagesThumbs(messages_messages.messages);
                broadcastReplyMessages(messages_messages.messages, longSparseArray, messages_messages.users, messages_messages.chats, j2, false);
                getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                saveReplyMessages(longSparseArray, messages_messages.messages, z);
            }
        } else {
            Timer.log(timer, "getScheduledMessages error: " + tL_error.code + " " + tL_error.text);
        }
        if (atomicInteger.decrementAndGet() != 0 || runnable == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(runnable);
    }

    public void lambda$loadReplyMessagesForMessages$175(Timer.Task task, long j, long j2, LongSparseArray longSparseArray, boolean z, Timer timer, AtomicInteger atomicInteger, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        Timer.done(task);
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            for (int i = 0; i < messages_messages.messages.size(); i++) {
                TLRPC.Message message = messages_messages.messages.get(i);
                if (message.dialog_id == 0) {
                    message.dialog_id = j;
                }
            }
            MessageObject.fixMessagePeer(messages_messages.messages, j2);
            ImageLoader.saveMessagesThumbs(messages_messages.messages);
            broadcastReplyMessages(messages_messages.messages, longSparseArray, messages_messages.users, messages_messages.chats, j, false);
            getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
            saveReplyMessages(longSparseArray, messages_messages.messages, z);
        } else {
            Timer.log(timer, "channels.getMessages error: " + tL_error.code + " " + tL_error.text);
        }
        if (atomicInteger.decrementAndGet() != 0 || runnable == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(runnable);
    }

    public void lambda$loadReplyMessagesForMessages$176(Timer.Task task, long j, LongSparseArray longSparseArray, boolean z, Timer timer, AtomicInteger atomicInteger, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        Timer.done(task);
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            for (int i = 0; i < messages_messages.messages.size(); i++) {
                TLRPC.Message message = messages_messages.messages.get(i);
                if (message.dialog_id == 0) {
                    message.dialog_id = j;
                }
            }
            ImageLoader.saveMessagesThumbs(messages_messages.messages);
            broadcastReplyMessages(messages_messages.messages, longSparseArray, messages_messages.users, messages_messages.chats, j, false);
            getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
            saveReplyMessages(longSparseArray, messages_messages.messages, z);
        } else {
            Timer.log(timer, "messages.getMessages error: " + tL_error.code + " " + tL_error.text);
        }
        if (atomicInteger.decrementAndGet() != 0 || runnable == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(runnable);
    }

    public void lambda$loadReplyMessagesForMessages$177(org.telegram.messenger.Timer.Task r25, androidx.collection.LongSparseArray r26, final java.util.concurrent.atomic.AtomicInteger r27, final java.lang.Runnable r28, int r29, final org.telegram.messenger.Timer r30, final androidx.collection.LongSparseArray r31, androidx.collection.LongSparseArray r32, final boolean r33, final long r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.lambda$loadReplyMessagesForMessages$177(org.telegram.messenger.Timer$Task, androidx.collection.LongSparseArray, java.util.concurrent.atomic.AtomicInteger, java.lang.Runnable, int, org.telegram.messenger.Timer, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray, boolean, long):void");
    }

    public void lambda$loadRestrictedStatusEmojis$245(TLObject tLObject, SharedPreferences sharedPreferences) {
        if (tLObject instanceof TLRPC.TL_emojiList) {
            SerializedData serializedData = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            this.restrictedStatusEmojis = (TLRPC.TL_emojiList) tLObject;
            editorEdit.putString("restrictedstatuses", Utilities.bytesToHex(serializedData.toByteArray()));
            editorEdit.putLong("restrictedstatuses_last_check", System.currentTimeMillis());
            editorEdit.apply();
        }
    }

    public void lambda$loadRestrictedStatusEmojis$246(SharedPreferences sharedPreferences, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda42(this, tLObject, sharedPreferences, 1));
    }

    public void lambda$loadSavedReactions$239(TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences) {
        if (tL_error == null) {
            if (tLObject instanceof TLRPC.TL_messages_reactions) {
                TLRPC.TL_messages_reactions tL_messages_reactions = (TLRPC.TL_messages_reactions) tLObject;
                this.savedReactions.clear();
                this.savedReactions.addAll(tL_messages_reactions.reactions);
                saveReactionsToPref(sharedPreferences, tL_messages_reactions.hash, tL_messages_reactions.reactions);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.savedReactionTagsUpdate, 0L);
            }
            boolean z = tLObject instanceof TLRPC.TL_messages_reactionsNotModified;
        }
        this.loadingSavedReactions = false;
    }

    public void lambda$loadSavedReactions$240(SharedPreferences sharedPreferences, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ImageLoader$$ExternalSyntheticLambda10(this, tL_error, tLObject, sharedPreferences, 13));
    }

    public void lambda$loadStickers$100(TLObject tLObject, int i, Utilities.Callback callback, long j) {
        if (tLObject instanceof TLRPC.TL_messages_allStickers) {
            processLoadStickersResponse(i, (TLRPC.TL_messages_allStickers) tLObject, new MessagesStorage$$ExternalSyntheticLambda257(1, callback));
        } else {
            processLoadedStickers(i, null, false, (int) (System.currentTimeMillis() / 1000), j, new MessagesStorage$$ExternalSyntheticLambda257(2, callback));
        }
    }

    public void lambda$loadStickers$101(int i, Utilities.Callback callback, long j, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new BotForumHelper$$ExternalSyntheticLambda2(this, tLObject, i, callback, j, 1));
    }

    public void lambda$loadStickers$91(int i, boolean z, Utilities.Callback callback) {
        loadStickers(i, false, z, false, callback);
    }

    public static void lambda$loadStickers$92(Utilities.Callback callback, ArrayList arrayList) {
        if (callback != null) {
            callback.run(arrayList);
        }
    }

    public void lambda$loadStickers$93(int i, Utilities.Callback callback) {
        ArrayList<TLRPC.TL_messages_stickerSet> arrayList = new ArrayList<>();
        int iIntValue = 0;
        long jCalcStickersHash = 0;
        SQLiteCursor sQLiteCursorQueryFinalized = null;
        try {
            sQLiteCursorQueryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT data, date, hash FROM stickers_v2 WHERE id = " + (i + 1), new Object[0]);
            if (sQLiteCursorQueryFinalized.next()) {
                NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                if (nativeByteBufferByteBufferValue != null) {
                    int int32 = nativeByteBufferByteBufferValue.readInt32(false);
                    for (int i2 = 0; i2 < int32; i2++) {
                        arrayList.add(TLRPC.messages_StickerSet.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false));
                    }
                    nativeByteBufferByteBufferValue.reuse();
                }
                iIntValue = sQLiteCursorQueryFinalized.intValue(1);
                jCalcStickersHash = calcStickersHash(arrayList);
            }
        } catch (Throwable th) {
            try {
                FileLog.e(th);
                if (sQLiteCursorQueryFinalized != null) {
                }
                processLoadedStickers(i, arrayList, true, iIntValue, jCalcStickersHash, new MessagesStorage$$ExternalSyntheticLambda256(callback, arrayList, 3));
            } catch (Throwable th2) {
                if (sQLiteCursorQueryFinalized == null) {
                    throw th2;
                }
                sQLiteCursorQueryFinalized.dispose();
                throw th2;
            }
        }
        sQLiteCursorQueryFinalized.dispose();
        processLoadedStickers(i, arrayList, true, iIntValue, jCalcStickersHash, new MessagesStorage$$ExternalSyntheticLambda256(callback, arrayList, 3));
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

    public void lambda$loadStickers$97(int i, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.TL_messages_stickerSet)) {
            processLoadedStickers(i, null, false, (int) (System.currentTimeMillis() / 1000), 0L, new MessagesStorage$$ExternalSyntheticLambda257(6, callback));
            return;
        }
        ArrayList<TLRPC.TL_messages_stickerSet> arrayList = new ArrayList<>();
        arrayList.add((TLRPC.TL_messages_stickerSet) tLObject);
        processLoadedStickers(i, arrayList, false, (int) (System.currentTimeMillis() / 1000), calcStickersHash(arrayList), new MessagesStorage$$ExternalSyntheticLambda257(5, callback));
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

    public void lambda$loadStickersByEmojiOrName$83(String str, boolean z) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
        int i;
        SQLiteCursor sQLiteCursorQueryFinalized;
        int iIntValue = 0;
        SQLiteCursor sQLiteCursor = null;
        tL_messages_stickerSetTLdeserialize = null;
        tL_messages_stickerSetTLdeserialize = null;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSetTLdeserialize = null;
        try {
            sQLiteCursorQueryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT data, date FROM stickers_dice WHERE emoji = ?", str);
            try {
                if (sQLiteCursorQueryFinalized.next()) {
                    NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                    if (nativeByteBufferByteBufferValue != null) {
                        tL_messages_stickerSetTLdeserialize = TLRPC.messages_StickerSet.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                        nativeByteBufferByteBufferValue.reuse();
                    }
                    iIntValue = sQLiteCursorQueryFinalized.intValue(1);
                }
            } catch (Throwable th) {
                th = th;
                tL_messages_stickerSet = tL_messages_stickerSetTLdeserialize;
                sQLiteCursor = sQLiteCursorQueryFinalized;
                try {
                    FileLog.e(th);
                    if (sQLiteCursor != null) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = tL_messages_stickerSet;
                        sQLiteCursorQueryFinalized = sQLiteCursor;
                        tL_messages_stickerSetTLdeserialize = tL_messages_stickerSet3;
                    } else {
                        tL_messages_stickerSet2 = tL_messages_stickerSet;
                        i = 0;
                    }
                    processLoadedDiceStickers(str, z, tL_messages_stickerSet2, true, i);
                } catch (Throwable th2) {
                    if (sQLiteCursor == null) {
                        throw th2;
                    }
                    sQLiteCursor.dispose();
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            tL_messages_stickerSet = null;
        }
        sQLiteCursorQueryFinalized.dispose();
        i = iIntValue;
        tL_messages_stickerSet2 = tL_messages_stickerSetTLdeserialize;
        processLoadedDiceStickers(str, z, tL_messages_stickerSet2, true, i);
    }

    public void lambda$loadStickersByEmojiOrName$84(TLRPC.TL_error tL_error, TLObject tLObject, String str, boolean z) {
        if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
            processLoadedDiceStickers(str, z, (TLRPC.TL_messages_stickerSet) tLObject, false, (int) (System.currentTimeMillis() / 1000));
        } else {
            processLoadedDiceStickers(str, z, null, false, (int) (System.currentTimeMillis() / 1000));
        }
    }

    public void lambda$loadStickersByEmojiOrName$85(String str, boolean z, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda488(this, tL_error, tLObject, str, z, 2));
    }

    public static void lambda$markFeaturedStickersAsRead$65(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void lambda$markFeaturedStickersByIdAsRead$66(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public void lambda$markFeaturedStickersByIdAsRead$67(boolean z, long j) {
        this.unreadStickerSets[z ? 1 : 0].remove(Long.valueOf(j));
        this.readingStickerSets[z ? 1 : 0].remove(Long.valueOf(j));
        this.loadFeaturedHash[z ? 1 : 0] = calcFeaturedStickersHash(z, this.featuredStickerSets[z ? 1 : 0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(z ? NotificationCenter.featuredEmojiDidLoad : NotificationCenter.featuredStickersDidLoad, new Object[0]);
        putFeaturedStickersToCache(z, this.featuredStickerSets[z ? 1 : 0], this.unreadStickerSets[z ? 1 : 0], this.loadFeaturedDate[z ? 1 : 0], this.loadFeaturedHash[z ? 1 : 0], this.loadFeaturedPremium);
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
        AndroidUtilities.runOnUIThread(new Utilities$$ExternalSyntheticLambda1(this, tL_error, tLObject, 2));
    }

    public void lambda$processLoadStickersResponse$73(TLObject tLObject, ArrayList arrayList, int i, LongSparseArray longSparseArray, TLRPC.StickerSet stickerSet, TLRPC.TL_messages_allStickers tL_messages_allStickers, int i2) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
        arrayList.set(i, tL_messages_stickerSet);
        longSparseArray.put(tL_messages_stickerSet, stickerSet.id);
        if (longSparseArray.size() == tL_messages_allStickers.sets.size()) {
            int i3 = 0;
            while (i3 < arrayList.size()) {
                if (arrayList.get(i3) == null) {
                    arrayList.remove(i3);
                    i3--;
                }
                i3++;
            }
            processLoadedStickers(i2, arrayList, false, (int) (System.currentTimeMillis() / 1000), tL_messages_allStickers.hash2);
        }
    }

    public void lambda$processLoadStickersResponse$74(ArrayList arrayList, int i, LongSparseArray longSparseArray, TLRPC.StickerSet stickerSet, TLRPC.TL_messages_allStickers tL_messages_allStickers, int i2, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda128(this, tLObject, arrayList, i, longSparseArray, stickerSet, tL_messages_allStickers, i2));
    }

    public void lambda$processLoadedDiceStickers$86(String str) {
        this.loadingDiceStickerSets.remove(str);
    }

    public void lambda$processLoadedDiceStickers$87(String str, boolean z) {
        loadStickersByEmojiOrName(str, z, false);
    }

    public void lambda$processLoadedDiceStickers$88(String str, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.diceStickerSetsByEmoji.put(str, tL_messages_stickerSet);
        this.diceEmojiStickerSetsById.put(str, tL_messages_stickerSet.set.id);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.diceStickersDidLoad, str);
    }

    public void lambda$processLoadedDiceStickers$89(boolean z, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i, String str, boolean z2) {
        if (z) {
            if (tL_messages_stickerSet == null || Math.abs((System.currentTimeMillis() / 1000) - ((long) i)) >= 86400) {
                AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda181(this, str, z2, 0), (tL_messages_stickerSet != null || z) ? 0L : 1000L);
                if (tL_messages_stickerSet == null) {
                    return;
                }
            }
        }
        if (tL_messages_stickerSet != null) {
            if (!z) {
                putDiceStickersToCache(str, tL_messages_stickerSet, i);
            }
            AndroidUtilities.runOnUIThread(new FileLoader$$ExternalSyntheticLambda0((Object) this, str, (Object) tL_messages_stickerSet, 26));
        } else {
            if (z) {
                return;
            }
            putDiceStickersToCache(str, null, i);
        }
    }

    public void lambda$processLoadedFeaturedStickers$59(boolean z) {
        this.loadingFeaturedStickers[z ? 1 : 0] = false;
        this.featuredStickersLoaded[z ? 1 : 0] = true;
    }

    public void lambda$processLoadedFeaturedStickers$60(ArrayList arrayList, long j, boolean z) {
        if (arrayList != null && j != 0) {
            this.loadFeaturedHash[z ? 1 : 0] = j;
        }
        this.loadingFeaturedStickers[z ? 1 : 0] = false;
        loadFeaturedStickers(z, false);
    }

    public void lambda$processLoadedFeaturedStickers$61(boolean z, ArrayList arrayList, LongSparseArray longSparseArray, ArrayList arrayList2, long j, int i, boolean z2) {
        this.unreadStickerSets[z ? 1 : 0] = arrayList;
        this.featuredStickerSetsById[z ? 1 : 0] = longSparseArray;
        this.featuredStickerSets[z ? 1 : 0] = arrayList2;
        this.loadFeaturedHash[z ? 1 : 0] = j;
        this.loadFeaturedDate[z ? 1 : 0] = i;
        this.loadFeaturedPremium = z2;
        loadStickers(z ? 6 : 3, true, false);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(z ? NotificationCenter.featuredEmojiDidLoad : NotificationCenter.featuredStickersDidLoad, new Object[0]);
    }

    public void lambda$processLoadedFeaturedStickers$62(boolean z, int i) {
        this.loadFeaturedDate[z ? 1 : 0] = i;
    }

    public void lambda$processLoadedFeaturedStickers$63(boolean z, ArrayList arrayList, final int i, final long j, final boolean z2, final ArrayList arrayList2, final boolean z3) {
        long j2 = 0;
        if ((z && (arrayList == null || Math.abs((System.currentTimeMillis() / 1000) - ((long) i)) >= 3600)) || (!z && arrayList == null && j == 0)) {
            ProfileActivity$$ExternalSyntheticLambda72 profileActivity$$ExternalSyntheticLambda72 = new ProfileActivity$$ExternalSyntheticLambda72(this, arrayList, j, z2);
            if (arrayList == null && !z) {
                j2 = 1000;
            }
            AndroidUtilities.runOnUIThread(profileActivity$$ExternalSyntheticLambda72, j2);
            if (arrayList == null) {
                return;
            }
        }
        if (arrayList == null) {
            AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda68(this, z2, i, 2));
            putFeaturedStickersToCache(z2, null, null, i, 0L, z3);
            return;
        }
        try {
            final ArrayList<TLRPC.StickerSetCovered> arrayList3 = new ArrayList<>();
            final LongSparseArray longSparseArray = new LongSparseArray();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i2);
                arrayList3.add(stickerSetCovered);
                longSparseArray.put(stickerSetCovered, stickerSetCovered.set.id);
            }
            if (!z) {
                putFeaturedStickersToCache(z2, arrayList3, arrayList2, i, j, z3);
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$processLoadedFeaturedStickers$61(z2, arrayList2, longSparseArray, arrayList3, j, i, z3);
                }
            });
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public void lambda$processLoadedMedia$133(TLRPC.messages_Messages messages_messages, int i, long j, ArrayList arrayList, int i2, int i3, boolean z, int i4, int i5) {
        int i6 = messages_messages.count;
        getMessagesController().putUsers(messages_messages.users, i != 0);
        getMessagesController().putChats(messages_messages.chats, i != 0);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mediaDidLoad, Long.valueOf(j), Integer.valueOf(i6), arrayList, Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(z), Boolean.valueOf(i4 != 0), Integer.valueOf(i5));
    }

    public void lambda$processLoadedMedia$134(TLRPC.messages_Messages messages_messages, int i, long j, ArrayList arrayList, int i2, int i3, boolean z, int i4, int i5) {
        AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda54(this, messages_messages, i, j, arrayList, i2, i3, z, i4, i5, 1));
    }

    public void lambda$processLoadedMedia$135(ArrayList arrayList, Runnable runnable) throws Throwable {
        for (int i = 0; i < arrayList.size(); i++) {
            MessageObject messageObject = (MessageObject) arrayList.get(i);
            TLRPC.Message messageWithCustomParamsOnlyInternal = getMessagesStorage().getMessageWithCustomParamsOnlyInternal(messageObject.getId(), messageObject.getDialogId());
            TLRPC.Message message = messageObject.messageOwner;
            message.translatedToLanguage = messageWithCustomParamsOnlyInternal.translatedToLanguage;
            message.translatedText = messageWithCustomParamsOnlyInternal.translatedText;
            messageObject.updateTranslation();
        }
        runnable.run();
    }

    public void lambda$processLoadedMedia$136(TLRPC.messages_Messages messages_messages, int i, long j, int i2, int i3, boolean z, int i4, int i5) {
        LongSparseArray longSparseArray = new LongSparseArray();
        for (int i6 = 0; i6 < messages_messages.users.size(); i6++) {
            TLRPC.User user = messages_messages.users.get(i6);
            longSparseArray.put(user, user.id);
        }
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        for (int i7 = 0; i7 < messages_messages.messages.size(); i7++) {
            MessageObject messageObject = new MessageObject(this.currentAccount, messages_messages.messages.get(i7), longSparseArray, true, false);
            messageObject.createStrippedThumb();
            arrayList.add(messageObject);
        }
        getFileLoader().checkMediaExistance(arrayList);
        MediaDataController$$ExternalSyntheticLambda54 mediaDataController$$ExternalSyntheticLambda54 = new MediaDataController$$ExternalSyntheticLambda54(this, messages_messages, i, j, arrayList, i2, i3, z, i4, i5, 0);
        if (getMessagesController().getTranslateController().isFeatureAvailable(j)) {
            getMessagesStorage().getStorageQueue().postRunnable(new Utilities$$ExternalSyntheticLambda1(this, arrayList, mediaDataController$$ExternalSyntheticLambda54, 3));
        } else {
            mediaDataController$$ExternalSyntheticLambda54.run();
        }
    }

    public void lambda$processLoadedMediaCount$137(long j, boolean z, int i, int i2, int i3, long j2, int i4) {
        int i5;
        boolean z2;
        int i6 = i;
        boolean zIsEncryptedDialog = DialogObject.isEncryptedDialog(j);
        if (z) {
            if (i6 != -1) {
                if (i6 == 0) {
                    i5 = i2;
                    if (i5 == 2) {
                    }
                } else {
                    i5 = i2;
                }
            } else {
                i5 = i2;
            }
            z2 = !zIsEncryptedDialog;
        } else {
            i5 = i2;
        }
        if (z2 || (i3 == 1 && !zIsEncryptedDialog)) {
            getMediaCount(j, j2, i5, i4, false);
        }
        if (z2) {
            return;
        }
        if (!z) {
            putMediaCountDatabase(j, j2, i2, i6);
        }
        NotificationCenter notificationCenter = getNotificationCenter();
        int i7 = NotificationCenter.mediaCountDidLoad;
        Long lValueOf = Long.valueOf(j);
        Long lValueOf2 = Long.valueOf(j2);
        if (z && i6 == -1) {
            i6 = 0;
        }
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i7, lValueOf, lValueOf2, Integer.valueOf(i6), Boolean.valueOf(z), Integer.valueOf(i2));
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

    public void lambda$processLoadedRecentDocuments$52(boolean z, int i, ArrayList arrayList, boolean z2, int i2) {
        int i3;
        int i4;
        try {
            SQLiteDatabase database = getMessagesStorage().getDatabase();
            int i5 = 2;
            if (z) {
                i3 = getMessagesController().maxRecentGifsCount;
            } else if (i == 3 || i == 7) {
                i3 = 200;
            } else {
                i3 = i == 2 ? getMessagesController().maxFaveStickersCount : getMessagesController().maxRecentStickersCount;
            }
            database.beginTransaction();
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = database.executeFast("REPLACE INTO web_recent_v3 VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            int size = arrayList.size();
            if (z) {
                i4 = 2;
            } else if (i == 0) {
                i4 = 3;
            } else if (i == 1) {
                i4 = 4;
            } else if (i == 3) {
                i4 = 6;
            } else if (i == 5) {
                i4 = 7;
            } else {
                i4 = i == 7 ? 8 : 5;
            }
            if (z2) {
                database.executeFast("DELETE FROM web_recent_v3 WHERE type = " + i4).stepThis().dispose();
            }
            int i6 = 0;
            while (i6 < size && i6 != i3) {
                TLRPC.Document document = (TLRPC.Document) arrayList.get(i6);
                sQLitePreparedStatementExecuteFast.requery();
                sQLitePreparedStatementExecuteFast.bindString(1, "" + document.id);
                sQLitePreparedStatementExecuteFast.bindInteger(i5, i4);
                sQLitePreparedStatementExecuteFast.bindString(3, "");
                sQLitePreparedStatementExecuteFast.bindString(4, "");
                sQLitePreparedStatementExecuteFast.bindString(5, "");
                sQLitePreparedStatementExecuteFast.bindInteger(6, 0);
                sQLitePreparedStatementExecuteFast.bindInteger(7, 0);
                sQLitePreparedStatementExecuteFast.bindInteger(8, 0);
                sQLitePreparedStatementExecuteFast.bindInteger(9, i2 != 0 ? i2 : size - i6);
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(document.getObjectSize());
                document.serializeToStream(nativeByteBuffer);
                sQLitePreparedStatementExecuteFast.bindByteBuffer(10, nativeByteBuffer);
                sQLitePreparedStatementExecuteFast.step();
                nativeByteBuffer.reuse();
                i6++;
                i5 = 2;
            }
            sQLitePreparedStatementExecuteFast.dispose();
            database.commitTransaction();
            if (z2 || arrayList.size() < i3) {
                return;
            }
            database.beginTransaction();
            while (i3 < arrayList.size()) {
                database.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + ((TLRPC.Document) arrayList.get(i3)).id + "' AND type = " + i4).stepThis().dispose();
                i3++;
            }
            database.commitTransaction();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$processLoadedRecentDocuments$53(boolean z, int i, ArrayList arrayList) {
        SharedPreferences.Editor editorEdit = MessagesController.getEmojiSettings(this.currentAccount).edit();
        if (z) {
            this.loadingRecentGifs = false;
            this.recentGifsLoaded = true;
            editorEdit.putLong("lastGifLoadTime", System.currentTimeMillis()).apply();
        } else {
            this.loadingRecentStickers[i] = false;
            this.recentStickersLoaded[i] = true;
            if (i == 0) {
                editorEdit.putLong("lastStickersLoadTime", System.currentTimeMillis()).apply();
            } else if (i == 1) {
                editorEdit.putLong("lastStickersLoadTimeMask", System.currentTimeMillis()).apply();
            } else if (i == 3) {
                editorEdit.putLong("lastStickersLoadTimeGreet", System.currentTimeMillis()).apply();
            } else if (i == 5) {
                editorEdit.putLong("lastStickersLoadTimeEmojiPacks", System.currentTimeMillis()).apply();
            } else if (i == 7) {
                editorEdit.putLong("lastStickersLoadTimePremiumStickers", System.currentTimeMillis()).apply();
            } else {
                editorEdit.putLong("lastStickersLoadTimeFavs", System.currentTimeMillis()).apply();
            }
        }
        if (arrayList != null) {
            if (z) {
                this.recentGifs = arrayList;
            } else {
                this.recentStickers[i] = arrayList;
            }
            if (i == 3) {
                preloadNextGreetingsSticker();
            }
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.recentDocumentsDidLoad, Boolean.valueOf(z), Integer.valueOf(i));
        }
    }

    public void lambda$processLoadedStickers$103(int i) {
        this.loadingStickers[i] = false;
        this.stickersLoaded[i] = true;
        Runnable runnable = this.scheduledLoadStickers[i];
        if (runnable != null) {
            runnable.run();
            this.scheduledLoadStickers[i] = null;
        }
    }

    public void lambda$processLoadedStickers$104(ArrayList arrayList, long j, int i) {
        if (arrayList != null && j != 0) {
            this.loadHash[i] = j;
        }
        loadStickers(i, false, false);
    }

    public void lambda$processLoadedStickers$105(int i, LongSparseArray longSparseArray, HashMap map, ArrayList arrayList, long j, int i2, LongSparseArray longSparseArray2, HashMap map2, LongSparseArray longSparseArray3, Runnable runnable) {
        for (int i3 = 0; i3 < this.stickerSets[i].size(); i3++) {
            TLRPC.StickerSet stickerSet = this.stickerSets[i].get(i3).set;
            this.stickerSetsById.remove(stickerSet.id);
            this.stickerSetsByName.remove(stickerSet.short_name);
            if (i != 3 && i != 6 && i != 4) {
                this.installedStickerSetsById.remove(stickerSet.id);
            }
        }
        for (int i4 = 0; i4 < longSparseArray.size(); i4++) {
            this.stickerSetsById.put((TLRPC.TL_messages_stickerSet) longSparseArray.valueAt(i4), longSparseArray.keyAt(i4));
            if (i != 3 && i != 6 && i != 4) {
                this.installedStickerSetsById.put((TLRPC.TL_messages_stickerSet) longSparseArray.valueAt(i4), longSparseArray.keyAt(i4));
            }
        }
        this.stickerSetsByName.putAll(map);
        this.stickerSets[i] = arrayList;
        this.loadHash[i] = j;
        this.loadDate[i] = i2;
        this.stickersByIds[i] = longSparseArray2;
        if (i == 0) {
            this.allStickers = map2;
            this.stickersByEmoji = longSparseArray3;
        } else if (i == 3) {
            this.allStickersFeatured = map2;
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i), Boolean.TRUE);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$processLoadedStickers$106(int i, int i2) {
        this.loadDate[i] = i2;
    }

    public void lambda$processLoadedStickers$107(boolean z, ArrayList arrayList, int i, long j, int i2, Runnable runnable) {
        MediaDataController mediaDataController;
        ArrayList arrayList2;
        String str;
        long j2 = 0;
        if ((z && (arrayList == null || BuildVars.DEBUG_PRIVATE_VERSION || Math.abs((System.currentTimeMillis() / 1000) - ((long) i)) >= 3600)) || (!z && arrayList == null && j == 0)) {
            mediaDataController = this;
            arrayList2 = arrayList;
            ArticleViewer$$ExternalSyntheticLambda48 articleViewer$$ExternalSyntheticLambda48 = new ArticleViewer$$ExternalSyntheticLambda48(mediaDataController, arrayList2, j, i2, 2);
            if (arrayList2 == null && !z) {
                j2 = 1000;
            }
            AndroidUtilities.runOnUIThread(articleViewer$$ExternalSyntheticLambda48, j2);
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
        if (arrayList2 == null) {
            if (z) {
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            } else {
                AndroidUtilities.runOnUIThread(new MediaController$8$$ExternalSyntheticLambda0(mediaDataController, i2, i, 1));
                mediaDataController.putStickersToCache(i2, null, i, 0L);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
        }
        try {
            ArrayList<TLRPC.TL_messages_stickerSet> arrayList3 = new ArrayList<>();
            LongSparseArray longSparseArray = new LongSparseArray();
            HashMap map = new HashMap();
            LongSparseArray longSparseArray2 = new LongSparseArray();
            LongSparseArray longSparseArray3 = new LongSparseArray();
            HashMap map2 = new HashMap();
            int i3 = 0;
            while (i3 < arrayList2.size()) {
                try {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList2.get(i3);
                    if (tL_messages_stickerSet != null && mediaDataController.removingStickerSetsUndos.indexOfKey(tL_messages_stickerSet.set.id) < 0) {
                        arrayList3.add(tL_messages_stickerSet);
                        longSparseArray.put(tL_messages_stickerSet, tL_messages_stickerSet.set.id);
                        map.put(tL_messages_stickerSet.set.short_name, tL_messages_stickerSet);
                        for (int i4 = 0; i4 < tL_messages_stickerSet.documents.size(); i4++) {
                            TLRPC.Document document = tL_messages_stickerSet.documents.get(i4);
                            if (document != null && !(document instanceof TLRPC.TL_documentEmpty)) {
                                longSparseArray3.put(document, document.id);
                            }
                        }
                        if (!tL_messages_stickerSet.set.archived) {
                            int i5 = 0;
                            while (i5 < tL_messages_stickerSet.packs.size()) {
                                TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i5);
                                if (tL_stickerPack != null && (str = tL_stickerPack.emoticon) != null) {
                                    String strReplace = str.replace("️", "");
                                    tL_stickerPack.emoticon = strReplace;
                                    ArrayList arrayList4 = (ArrayList) map2.get(strReplace);
                                    if (arrayList4 == null) {
                                        arrayList4 = new ArrayList();
                                        map2.put(tL_stickerPack.emoticon, arrayList4);
                                    }
                                    int i6 = 0;
                                    while (i6 < tL_stickerPack.documents.size()) {
                                        Long l = tL_stickerPack.documents.get(i6);
                                        LongSparseArray longSparseArray4 = longSparseArray;
                                        if (longSparseArray2.indexOfKey(l.longValue()) < 0) {
                                            longSparseArray2.put(tL_stickerPack.emoticon, l.longValue());
                                        }
                                        TLRPC.Document document2 = (TLRPC.Document) longSparseArray3.get(l.longValue());
                                        if (document2 != null) {
                                            arrayList4.add(document2);
                                        }
                                        i6++;
                                        longSparseArray = longSparseArray4;
                                    }
                                }
                                i5++;
                                longSparseArray = longSparseArray;
                            }
                        }
                    }
                    i3++;
                    mediaDataController = this;
                    arrayList2 = arrayList;
                    longSparseArray = longSparseArray;
                } catch (Throwable th) {
                    th = th;
                    FileLog.e(th);
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
            }
            LongSparseArray longSparseArray5 = longSparseArray;
            if (!z) {
                putStickersToCache(i2, arrayList3, i, j);
            }
            AndroidUtilities.runOnUIThread(new FileLoader$$ExternalSyntheticLambda6(this, i2, longSparseArray5, map, arrayList3, j, i, longSparseArray3, map2, longSparseArray2, runnable));
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void lambda$putBotInfo$201(TL_bots.BotInfo botInfo, long j) {
        try {
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO bot_info_v2 VALUES(?, ?, ?)");
            sQLitePreparedStatementExecuteFast.requery();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(botInfo.getObjectSize());
            botInfo.serializeToStream(nativeByteBuffer);
            sQLitePreparedStatementExecuteFast.bindLong(1, botInfo.user_id);
            sQLitePreparedStatementExecuteFast.bindLong(2, j);
            sQLitePreparedStatementExecuteFast.bindByteBuffer(3, nativeByteBuffer);
            sQLitePreparedStatementExecuteFast.step();
            nativeByteBuffer.reuse();
            sQLitePreparedStatementExecuteFast.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$putBotKeyboard$200(MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        TLRPC.Message message2 = this.botKeyboards.get(topicKey);
        this.botKeyboards.put(topicKey, message);
        ArrayList arrayList = (ArrayList) this.botDialogKeyboards.get(topicKey.dialogId);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        arrayList.add(message);
        this.botDialogKeyboards.put(arrayList, topicKey.dialogId);
        if (MessageObject.getChannelId(message) == 0) {
            if (message2 != null) {
                this.botKeyboardsByMids.delete(message2.id);
            }
            this.botKeyboardsByMids.put(topicKey, message.id);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botKeyboardDidLoad, message, topicKey);
    }

    public void lambda$putDiceStickersToCache$90(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, int i) {
        try {
            if (tL_messages_stickerSet == null) {
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast = getMessagesStorage().getDatabase().executeFast("UPDATE stickers_dice SET date = ?");
                sQLitePreparedStatementExecuteFast.requery();
                sQLitePreparedStatementExecuteFast.bindInteger(1, i);
                sQLitePreparedStatementExecuteFast.step();
                sQLitePreparedStatementExecuteFast.dispose();
                return;
            }
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast2 = getMessagesStorage().getDatabase().executeFast("REPLACE INTO stickers_dice VALUES(?, ?, ?)");
            sQLitePreparedStatementExecuteFast2.requery();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_messages_stickerSet.getObjectSize());
            tL_messages_stickerSet.serializeToStream(nativeByteBuffer);
            sQLitePreparedStatementExecuteFast2.bindString(1, str);
            sQLitePreparedStatementExecuteFast2.bindByteBuffer(2, nativeByteBuffer);
            sQLitePreparedStatementExecuteFast2.bindInteger(3, i);
            sQLitePreparedStatementExecuteFast2.step();
            nativeByteBuffer.reuse();
            sQLitePreparedStatementExecuteFast2.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$putEmojiKeywords$214(String str) {
        this.currentFetchingEmoji.remove(str);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newEmojiSuggestionsAvailable, str);
    }

    public void lambda$putEmojiKeywords$215(TLRPC.TL_emojiKeywordsDifference tL_emojiKeywordsDifference, String str) {
        try {
            if (!tL_emojiKeywordsDifference.keywords.isEmpty()) {
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO emoji_keywords_v2 VALUES(?, ?, ?)");
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast2 = getMessagesStorage().getDatabase().executeFast("DELETE FROM emoji_keywords_v2 WHERE lang = ? AND keyword = ? AND emoji = ?");
                getMessagesStorage().getDatabase().beginTransaction();
                int size = tL_emojiKeywordsDifference.keywords.size();
                for (int i = 0; i < size; i++) {
                    TLRPC.EmojiKeyword emojiKeyword = tL_emojiKeywordsDifference.keywords.get(i);
                    if (emojiKeyword instanceof TLRPC.TL_emojiKeyword) {
                        TLRPC.TL_emojiKeyword tL_emojiKeyword = (TLRPC.TL_emojiKeyword) emojiKeyword;
                        String lowerCase = tL_emojiKeyword.keyword.toLowerCase();
                        int size2 = tL_emojiKeyword.emoticons.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            sQLitePreparedStatementExecuteFast.requery();
                            sQLitePreparedStatementExecuteFast.bindString(1, tL_emojiKeywordsDifference.lang_code);
                            sQLitePreparedStatementExecuteFast.bindString(2, lowerCase);
                            sQLitePreparedStatementExecuteFast.bindString(3, tL_emojiKeyword.emoticons.get(i2));
                            sQLitePreparedStatementExecuteFast.step();
                        }
                    } else if (emojiKeyword instanceof TLRPC.TL_emojiKeywordDeleted) {
                        TLRPC.TL_emojiKeywordDeleted tL_emojiKeywordDeleted = (TLRPC.TL_emojiKeywordDeleted) emojiKeyword;
                        String lowerCase2 = tL_emojiKeywordDeleted.keyword.toLowerCase();
                        int size3 = tL_emojiKeywordDeleted.emoticons.size();
                        for (int i3 = 0; i3 < size3; i3++) {
                            sQLitePreparedStatementExecuteFast2.requery();
                            sQLitePreparedStatementExecuteFast2.bindString(1, tL_emojiKeywordsDifference.lang_code);
                            sQLitePreparedStatementExecuteFast2.bindString(2, lowerCase2);
                            sQLitePreparedStatementExecuteFast2.bindString(3, tL_emojiKeywordDeleted.emoticons.get(i3));
                            sQLitePreparedStatementExecuteFast2.step();
                        }
                    }
                }
                getMessagesStorage().getDatabase().commitTransaction();
                sQLitePreparedStatementExecuteFast.dispose();
                sQLitePreparedStatementExecuteFast2.dispose();
            }
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast3 = getMessagesStorage().getDatabase().executeFast("REPLACE INTO emoji_keywords_info_v2 VALUES(?, ?, ?, ?)");
            sQLitePreparedStatementExecuteFast3.bindString(1, str);
            sQLitePreparedStatementExecuteFast3.bindString(2, tL_emojiKeywordsDifference.lang_code);
            sQLitePreparedStatementExecuteFast3.bindInteger(3, tL_emojiKeywordsDifference.version);
            sQLitePreparedStatementExecuteFast3.bindLong(4, System.currentTimeMillis());
            sQLitePreparedStatementExecuteFast3.step();
            sQLitePreparedStatementExecuteFast3.dispose();
            AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda1(this, str, 0));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$putFeaturedStickersToCache$64(ArrayList arrayList, ArrayList arrayList2, boolean z, int i, long j, boolean z2) {
        try {
            if (arrayList == null) {
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast = getMessagesStorage().getDatabase().executeFast("UPDATE stickers_featured SET date = ? WHERE id = ? AND emoji = ?");
                sQLitePreparedStatementExecuteFast.requery();
                sQLitePreparedStatementExecuteFast.bindInteger(1, i);
                sQLitePreparedStatementExecuteFast.bindInteger(2, z ? 2 : 1);
                sQLitePreparedStatementExecuteFast.bindInteger(3, z ? 1 : 0);
                sQLitePreparedStatementExecuteFast.step();
                sQLitePreparedStatementExecuteFast.dispose();
                return;
            }
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast2 = getMessagesStorage().getDatabase().executeFast("REPLACE INTO stickers_featured VALUES(?, ?, ?, ?, ?, ?, ?)");
            sQLitePreparedStatementExecuteFast2.requery();
            int objectSize = 4;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                objectSize += ((TLRPC.StickerSetCovered) arrayList.get(i2)).getObjectSize();
            }
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(objectSize);
            NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer((arrayList2.size() * 8) + 4);
            nativeByteBuffer.writeInt32(arrayList.size());
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((TLRPC.StickerSetCovered) arrayList.get(i3)).serializeToStream(nativeByteBuffer);
            }
            nativeByteBuffer2.writeInt32(arrayList2.size());
            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                nativeByteBuffer2.writeInt64(((Long) arrayList2.get(i4)).longValue());
            }
            sQLitePreparedStatementExecuteFast2.bindInteger(1, z ? 2 : 1);
            sQLitePreparedStatementExecuteFast2.bindByteBuffer(2, nativeByteBuffer);
            sQLitePreparedStatementExecuteFast2.bindByteBuffer(3, nativeByteBuffer2);
            sQLitePreparedStatementExecuteFast2.bindInteger(4, i);
            sQLitePreparedStatementExecuteFast2.bindLong(5, j);
            sQLitePreparedStatementExecuteFast2.bindInteger(6, z2 ? 1 : 0);
            sQLitePreparedStatementExecuteFast2.bindInteger(7, z ? 1 : 0);
            sQLitePreparedStatementExecuteFast2.step();
            nativeByteBuffer.reuse();
            nativeByteBuffer2.reuse();
            sQLitePreparedStatementExecuteFast2.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$putMediaCountDatabase$138(long j, long j2, int i, int i2) {
        int i3;
        try {
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = j != 0 ? getMessagesStorage().getDatabase().executeFast("REPLACE INTO media_counts_topics VALUES(?, ?, ?, ?, ?)") : getMessagesStorage().getDatabase().executeFast("REPLACE INTO media_counts_v2 VALUES(?, ?, ?, ?)");
            sQLitePreparedStatementExecuteFast.requery();
            sQLitePreparedStatementExecuteFast.bindLong(1, j2);
            if (j != 0) {
                sQLitePreparedStatementExecuteFast.bindLong(2, j);
                i3 = 3;
            } else {
                i3 = 2;
            }
            sQLitePreparedStatementExecuteFast.bindInteger(i3, i);
            sQLitePreparedStatementExecuteFast.bindInteger(i3 + 1, i2);
            sQLitePreparedStatementExecuteFast.bindInteger(i3 + 2, 0);
            sQLitePreparedStatementExecuteFast.step();
            sQLitePreparedStatementExecuteFast.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$putMediaDatabase$140(int i, ArrayList arrayList, boolean z, long j, int i2, int i3, long j2) throws Throwable {
        long j3;
        if (i == 0) {
            try {
                if (arrayList.isEmpty() || z) {
                    j3 = j2;
                    getMessagesStorage().doneHolesInMedia(j, i2, i3, j3);
                    if (arrayList.isEmpty()) {
                        return;
                    }
                } else {
                    j3 = j2;
                }
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        } else {
            j3 = j2;
        }
        getMessagesStorage().getDatabase().beginTransaction();
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast = j3 != 0 ? getMessagesStorage().getDatabase().executeFast("REPLACE INTO media_topics VALUES(?, ?, ?, ?, ?, ?)") : getMessagesStorage().getDatabase().executeFast("REPLACE INTO media_v4 VALUES(?, ?, ?, ?, ?)");
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            TLRPC.Message message = (TLRPC.Message) obj;
            if (canAddMessageToMedia(message)) {
                sQLitePreparedStatementExecuteFast.requery();
                MessageObject.normalizeFlags(message);
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                message.serializeToStream(nativeByteBuffer);
                sQLitePreparedStatementExecuteFast.bindInteger(1, message.id);
                sQLitePreparedStatementExecuteFast.bindLong(2, j);
                int i5 = 3;
                if (j3 != 0) {
                    sQLitePreparedStatementExecuteFast.bindLong(3, j3);
                    i5 = 4;
                }
                sQLitePreparedStatementExecuteFast.bindInteger(i5, message.date);
                sQLitePreparedStatementExecuteFast.bindInteger(i5 + 1, i3);
                sQLitePreparedStatementExecuteFast.bindByteBuffer(i5 + 2, nativeByteBuffer);
                sQLitePreparedStatementExecuteFast.step();
                nativeByteBuffer.reuse();
            }
        }
        sQLitePreparedStatementExecuteFast.dispose();
        if (!z || i2 != 0 || i != 0) {
            int i6 = (z && i == 0) ? 1 : ((TLRPC.Message) arrayList.get(arrayList.size() - 1)).id;
            if (i != 0) {
                getMessagesStorage().closeHolesInMedia(j, i6, ((TLRPC.Message) arrayList.get(0)).id, i3, j3);
            } else if (i2 != 0) {
                getMessagesStorage().closeHolesInMedia(j, i6, i2, i3, j2);
            } else {
                getMessagesStorage().closeHolesInMedia(j, i6, Integer.MAX_VALUE, i3, j2);
            }
        }
        getMessagesStorage().getDatabase().commitTransaction();
    }

    public void lambda$putMenuBotsToCache$6(TLRPC.TL_attachMenuBots tL_attachMenuBots, long j, int i) {
        try {
            if (tL_attachMenuBots == null) {
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast = getMessagesStorage().getDatabase().executeFast("UPDATE attach_menu_bots SET date = ?");
                sQLitePreparedStatementExecuteFast.requery();
                sQLitePreparedStatementExecuteFast.bindLong(1, i);
                sQLitePreparedStatementExecuteFast.step();
                sQLitePreparedStatementExecuteFast.dispose();
                return;
            }
            getMessagesStorage().getDatabase().executeFast("DELETE FROM attach_menu_bots").stepThis().dispose();
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast2 = getMessagesStorage().getDatabase().executeFast("REPLACE INTO attach_menu_bots VALUES(?, ?, ?)");
            sQLitePreparedStatementExecuteFast2.requery();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_attachMenuBots.getObjectSize());
            tL_attachMenuBots.serializeToStream(nativeByteBuffer);
            sQLitePreparedStatementExecuteFast2.bindByteBuffer(1, nativeByteBuffer);
            sQLitePreparedStatementExecuteFast2.bindLong(2, j);
            sQLitePreparedStatementExecuteFast2.bindInteger(3, i);
            sQLitePreparedStatementExecuteFast2.step();
            nativeByteBuffer.reuse();
            sQLitePreparedStatementExecuteFast2.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$putPremiumPromoToCache$10(TLRPC.TL_help_premiumPromo tL_help_premiumPromo, int i) {
        try {
            if (tL_help_premiumPromo == null) {
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast = getMessagesStorage().getDatabase().executeFast("UPDATE premium_promo SET date = ?");
                sQLitePreparedStatementExecuteFast.requery();
                sQLitePreparedStatementExecuteFast.bindInteger(1, i);
                sQLitePreparedStatementExecuteFast.step();
                sQLitePreparedStatementExecuteFast.dispose();
                return;
            }
            getMessagesStorage().getDatabase().executeFast("DELETE FROM premium_promo").stepThis().dispose();
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast2 = getMessagesStorage().getDatabase().executeFast("REPLACE INTO premium_promo VALUES(?, ?)");
            sQLitePreparedStatementExecuteFast2.requery();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_help_premiumPromo.getObjectSize());
            tL_help_premiumPromo.serializeToStream(nativeByteBuffer);
            sQLitePreparedStatementExecuteFast2.bindByteBuffer(1, nativeByteBuffer);
            sQLitePreparedStatementExecuteFast2.bindInteger(2, i);
            sQLitePreparedStatementExecuteFast2.step();
            nativeByteBuffer.reuse();
            sQLitePreparedStatementExecuteFast2.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$putReactionsToCache$16(ArrayList arrayList, int i, int i2) {
        try {
            if (arrayList == null) {
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast = getMessagesStorage().getDatabase().executeFast("UPDATE reactions SET date = ?");
                sQLitePreparedStatementExecuteFast.requery();
                sQLitePreparedStatementExecuteFast.bindLong(1, i2);
                sQLitePreparedStatementExecuteFast.step();
                sQLitePreparedStatementExecuteFast.dispose();
                return;
            }
            getMessagesStorage().getDatabase().executeFast("DELETE FROM reactions").stepThis().dispose();
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast2 = getMessagesStorage().getDatabase().executeFast("REPLACE INTO reactions VALUES(?, ?, ?)");
            sQLitePreparedStatementExecuteFast2.requery();
            int objectSize = 4;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                objectSize += ((TLRPC.TL_availableReaction) arrayList.get(i3)).getObjectSize();
            }
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(objectSize);
            nativeByteBuffer.writeInt32(arrayList.size());
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                ((TLRPC.TL_availableReaction) arrayList.get(i4)).serializeToStream(nativeByteBuffer);
            }
            sQLitePreparedStatementExecuteFast2.bindByteBuffer(1, nativeByteBuffer);
            sQLitePreparedStatementExecuteFast2.bindInteger(2, i);
            sQLitePreparedStatementExecuteFast2.bindInteger(3, i2);
            sQLitePreparedStatementExecuteFast2.step();
            nativeByteBuffer.reuse();
            sQLitePreparedStatementExecuteFast2.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$putSetToCache$47(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        try {
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO web_recent_v3 VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            sQLitePreparedStatementExecuteFast.requery();
            sQLitePreparedStatementExecuteFast.bindString(1, "s_" + tL_messages_stickerSet.set.id);
            sQLitePreparedStatementExecuteFast.bindInteger(2, 6);
            sQLitePreparedStatementExecuteFast.bindString(3, "");
            sQLitePreparedStatementExecuteFast.bindString(4, "");
            sQLitePreparedStatementExecuteFast.bindString(5, "");
            sQLitePreparedStatementExecuteFast.bindInteger(6, 0);
            sQLitePreparedStatementExecuteFast.bindInteger(7, 0);
            sQLitePreparedStatementExecuteFast.bindInteger(8, 0);
            sQLitePreparedStatementExecuteFast.bindInteger(9, 0);
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_messages_stickerSet.getObjectSize());
            tL_messages_stickerSet.serializeToStream(nativeByteBuffer);
            sQLitePreparedStatementExecuteFast.bindByteBuffer(10, nativeByteBuffer);
            sQLitePreparedStatementExecuteFast.step();
            nativeByteBuffer.reuse();
            sQLitePreparedStatementExecuteFast.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$putStickersToCache$102(ArrayList arrayList, int i, int i2, long j) {
        try {
            if (arrayList == null) {
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast = getMessagesStorage().getDatabase().executeFast("UPDATE stickers_v2 SET date = ?");
                sQLitePreparedStatementExecuteFast.requery();
                sQLitePreparedStatementExecuteFast.bindLong(1, i2);
                sQLitePreparedStatementExecuteFast.step();
                sQLitePreparedStatementExecuteFast.dispose();
                return;
            }
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast2 = getMessagesStorage().getDatabase().executeFast("REPLACE INTO stickers_v2 VALUES(?, ?, ?, ?)");
            sQLitePreparedStatementExecuteFast2.requery();
            int objectSize = 4;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                objectSize += ((TLRPC.TL_messages_stickerSet) arrayList.get(i3)).getObjectSize();
            }
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(objectSize);
            nativeByteBuffer.writeInt32(arrayList.size());
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                ((TLRPC.TL_messages_stickerSet) arrayList.get(i4)).serializeToStream(nativeByteBuffer);
            }
            sQLitePreparedStatementExecuteFast2.bindInteger(1, i + 1);
            sQLitePreparedStatementExecuteFast2.bindByteBuffer(2, nativeByteBuffer);
            sQLitePreparedStatementExecuteFast2.bindInteger(3, i2);
            sQLitePreparedStatementExecuteFast2.bindLong(4, j);
            sQLitePreparedStatementExecuteFast2.step();
            nativeByteBuffer.reuse();
            sQLitePreparedStatementExecuteFast2.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void lambda$removeInline$152(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public void lambda$removeMultipleStickerSets$110(boolean[] zArr, ArrayList arrayList, int i, int[] iArr) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            markSetUninstalling(((TLRPC.TL_messages_stickerSet) arrayList.get(i2)).set.id, false);
            ((TLRPC.TL_messages_stickerSet) arrayList.get(i2)).set.archived = false;
            this.stickerSets[i].add(iArr[i2], (TLRPC.TL_messages_stickerSet) arrayList.get(i2));
            this.stickerSetsById.put((TLRPC.TL_messages_stickerSet) arrayList.get(i2), ((TLRPC.TL_messages_stickerSet) arrayList.get(i2)).set.id);
            this.installedStickerSetsById.put((TLRPC.TL_messages_stickerSet) arrayList.get(i2), ((TLRPC.TL_messages_stickerSet) arrayList.get(i2)).set.id);
            this.stickerSetsByName.put(((TLRPC.TL_messages_stickerSet) arrayList.get(i2)).set.short_name, (TLRPC.TL_messages_stickerSet) arrayList.get(i2));
            this.removingStickerSetsUndos.remove(((TLRPC.TL_messages_stickerSet) arrayList.get(i2)).set.id);
        }
        ArrayList<TLRPC.TL_messages_stickerSet> arrayList2 = this.stickerSets[i];
        int i3 = this.loadDate[i];
        long[] jArr = this.loadHash;
        long jCalcStickersHash = calcStickersHash(arrayList2);
        jArr[i] = jCalcStickersHash;
        putStickersToCache(i, arrayList2, i3, jCalcStickersHash);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i), Boolean.TRUE);
    }

    public void lambda$removeMultipleStickerSets$111(boolean[] zArr, ArrayList arrayList, Context context, BaseFragment baseFragment, int i) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            toggleStickerSetInternal(context, 0, baseFragment, null, true, (TLObject) arrayList.get(i2), ((TLRPC.TL_messages_stickerSet) arrayList.get(i2)).set, null, i, false);
        }
    }

    public static void lambda$removePeer$154(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public void lambda$removeRecentGif$24(TLRPC.TL_messages_saveGif tL_messages_saveGif, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null || !FileRefController.isFileRefError(tL_error.text)) {
            return;
        }
        getFileRefController().requestReference("gif", tL_messages_saveGif);
    }

    public void lambda$removeRecentGif$25(TLRPC.Document document) {
        try {
            getMessagesStorage().getDatabase().executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document.id + "' AND type = 2").stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void lambda$removeWebapp$153(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static int lambda$reorderStickers$54(ArrayList arrayList, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, TLRPC.TL_messages_stickerSet tL_messages_stickerSet2) {
        int iIndexOf = arrayList.indexOf(Long.valueOf(tL_messages_stickerSet.set.id));
        int iIndexOf2 = arrayList.indexOf(Long.valueOf(tL_messages_stickerSet2.set.id));
        if (iIndexOf > iIndexOf2) {
            return 1;
        }
        return iIndexOf < iIndexOf2 ? -1 : 0;
    }

    public void lambda$replaceStickerSet$28(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        LongSparseArray stickerByIds = getStickerByIds(4);
        for (int i = 0; i < tL_messages_stickerSet.documents.size(); i++) {
            TLRPC.Document document = tL_messages_stickerSet.documents.get(i);
            stickerByIds.put(document, document.id);
        }
    }

    public static void lambda$saveDraft$188(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public void lambda$saveDraft$189(long j, long j2, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            if (messages_messages.messages.isEmpty()) {
                return;
            }
            saveDraftReplyMessage(j, j2, messages_messages.messages.get(0));
        }
    }

    public void lambda$saveDraft$190(long j, long j2, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            if (messages_messages.messages.isEmpty()) {
                return;
            }
            saveDraftReplyMessage(j, j2, messages_messages.messages.get(0));
        }
    }

    public void lambda$saveDraft$191(int i, long j, long j2, final long j3, final long j4) throws Throwable {
        TLRPC.Message messageTLdeserialize;
        NativeByteBuffer nativeByteBufferByteBufferValue;
        try {
            SQLiteDatabase database = getMessagesStorage().getDatabase();
            Locale locale = Locale.US;
            SQLiteCursor sQLiteCursorQueryFinalized = database.queryFinalized("SELECT data, replydata FROM messages_v2 WHERE mid = " + i + " and uid = " + j, new Object[0]);
            TLRPC.Message message = null;
            if (sQLiteCursorQueryFinalized.next()) {
                NativeByteBuffer nativeByteBufferByteBufferValue2 = sQLiteCursorQueryFinalized.byteBufferValue(0);
                if (nativeByteBufferByteBufferValue2 != null) {
                    messageTLdeserialize = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue2, nativeByteBufferByteBufferValue2.readInt32(false), false);
                    messageTLdeserialize.readAttachPath(nativeByteBufferByteBufferValue2, getUserConfig().clientUserId);
                    nativeByteBufferByteBufferValue2.reuse();
                } else {
                    messageTLdeserialize = null;
                }
                if (messageTLdeserialize != null) {
                    ArrayList<Long> arrayList = new ArrayList<>();
                    ArrayList<Long> arrayList2 = new ArrayList<>();
                    LongSparseArray longSparseArray = new LongSparseArray();
                    LongSparseArray longSparseArray2 = new LongSparseArray();
                    try {
                        TLRPC.MessageReplyHeader messageReplyHeader = messageTLdeserialize.reply_to;
                        if (messageReplyHeader != null && messageReplyHeader.reply_to_msg_id != 0) {
                            if (!sQLiteCursorQueryFinalized.isNull(1) && (nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(1)) != null) {
                                TLRPC.Message messageTLdeserialize2 = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                                messageTLdeserialize.replyMessage = messageTLdeserialize2;
                                messageTLdeserialize2.readAttachPath(nativeByteBufferByteBufferValue, getUserConfig().clientUserId);
                                nativeByteBufferByteBufferValue.reuse();
                                TLRPC.Message message2 = messageTLdeserialize.replyMessage;
                                if (message2 != null) {
                                    MessagesStorage.addUsersAndChatsFromMessage(message2, arrayList, arrayList2, null);
                                }
                            }
                            if (messageTLdeserialize.replyMessage == null) {
                                MessagesStorage.addReplyMessages(messageTLdeserialize, longSparseArray, longSparseArray2);
                            }
                        }
                    } catch (Exception e) {
                        getMessagesStorage().checkSQLException(e);
                    }
                    getMessagesStorage().loadReplyMessages(longSparseArray, longSparseArray2, arrayList, arrayList2, 0);
                }
                message = messageTLdeserialize;
            }
            sQLiteCursorQueryFinalized.dispose();
            if (message != null) {
                saveDraftReplyMessage(j3, j4, message);
                return;
            }
            if (j2 == 0) {
                TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                tL_messages_getMessages.id.add(Integer.valueOf(i));
                final int i2 = 1;
                getConnectionsManager().sendRequest(tL_messages_getMessages, new RequestDelegate(this) {
                    public final MediaDataController f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (i2) {
                            case 0:
                                this.f$0.lambda$saveDraft$189(j3, j4, tLObject, tL_error);
                                break;
                            default:
                                this.f$0.lambda$saveDraft$190(j3, j4, tLObject, tL_error);
                                break;
                        }
                    }
                });
                return;
            }
            TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
            tL_channels_getMessages.channel = getMessagesController().getInputChannel(j2);
            tL_channels_getMessages.id.add(Integer.valueOf(i));
            final int i3 = 0;
            getConnectionsManager().sendRequest(tL_channels_getMessages, new RequestDelegate(this) {
                public final MediaDataController f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i3) {
                        case 0:
                            this.f$0.lambda$saveDraft$189(j3, j4, tLObject, tL_error);
                            break;
                        default:
                            this.f$0.lambda$saveDraft$190(j3, j4, tLObject, tL_error);
                            break;
                    }
                }
            });
        } catch (Exception e2) {
            FileLog.e(e2);
        }
    }

    public void lambda$saveDraftReplyMessage$192(long j, long j2, TLRPC.Message message) {
        TLRPC.InputReplyTo inputReplyTo;
        String string;
        LongSparseArray longSparseArray = (LongSparseArray) this.drafts.get(j);
        TLRPC.DraftMessage draftMessage = longSparseArray != null ? (TLRPC.DraftMessage) longSparseArray.get(j2) : null;
        if (draftMessage == null || (inputReplyTo = draftMessage.reply_to) == null || inputReplyTo.reply_to_msg_id != message.id) {
            return;
        }
        LongSparseArray longSparseArray2 = (LongSparseArray) this.draftMessages.get(j);
        if (longSparseArray2 == null) {
            longSparseArray2 = new LongSparseArray();
            this.draftMessages.put(longSparseArray2, j);
        }
        longSparseArray2.put(message, j2);
        SerializedData serializedData = new SerializedData(message.getObjectSize());
        message.serializeToStream(serializedData);
        SharedPreferences.Editor editorEdit = this.draftPreferences.edit();
        if (j2 == 0) {
            string = Log.m(j, "r_");
        } else {
            StringBuilder sbM = AacUtil.m(j, "rt_", "_");
            sbM.append(j2);
            string = sbM.toString();
        }
        editorEdit.putString(string, Utilities.bytesToHex(serializedData.toByteArray())).commit();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newDraftReceived, Long.valueOf(j));
        serializedData.cleanup();
    }

    public void lambda$savePeer$158(long j, int i, double d) {
        try {
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
            sQLitePreparedStatementExecuteFast.requery();
            sQLitePreparedStatementExecuteFast.bindLong(1, j);
            sQLitePreparedStatementExecuteFast.bindInteger(2, i);
            sQLitePreparedStatementExecuteFast.bindDouble(3, d);
            sQLitePreparedStatementExecuteFast.bindInteger(4, ((int) System.currentTimeMillis()) / 1000);
            sQLitePreparedStatementExecuteFast.step();
            sQLitePreparedStatementExecuteFast.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$savePinnedMessages$166(ArrayList arrayList, long j) {
        try {
            getMessagesStorage().getDatabase().beginTransaction();
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO chat_pinned_v2 VALUES(?, ?, ?)");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                TLRPC.Message message = (TLRPC.Message) arrayList.get(i);
                MessageObject.normalizeFlags(message);
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                message.serializeToStream(nativeByteBuffer);
                sQLitePreparedStatementExecuteFast.requery();
                sQLitePreparedStatementExecuteFast.bindLong(1, j);
                sQLitePreparedStatementExecuteFast.bindInteger(2, message.id);
                sQLitePreparedStatementExecuteFast.bindByteBuffer(3, nativeByteBuffer);
                sQLitePreparedStatementExecuteFast.step();
                nativeByteBuffer.reuse();
            }
            sQLitePreparedStatementExecuteFast.dispose();
            getMessagesStorage().getDatabase().commitTransaction();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$saveReplyMessages$178(boolean z, ArrayList arrayList, LongSparseArray longSparseArray) {
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast;
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast2;
        ArrayList arrayList2;
        try {
            getMessagesStorage().getDatabase().beginTransaction();
            if (z) {
                sQLitePreparedStatementExecuteFast = getMessagesStorage().getDatabase().executeFast("UPDATE scheduled_messages_v2 SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                sQLitePreparedStatementExecuteFast2 = null;
            } else {
                sQLitePreparedStatementExecuteFast = getMessagesStorage().getDatabase().executeFast("UPDATE messages_v2 SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                sQLitePreparedStatementExecuteFast2 = getMessagesStorage().getDatabase().executeFast("UPDATE messages_topics SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
            }
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC.Message message = (TLRPC.Message) arrayList.get(i);
                SparseArray sparseArray = (SparseArray) longSparseArray.get(MessageObject.getDialogId(message));
                if (sparseArray != null && (arrayList2 = (ArrayList) sparseArray.get(message.id)) != null) {
                    MessageObject.normalizeFlags(message);
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                    message.serializeToStream(nativeByteBuffer);
                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                        MessageObject messageObject = (MessageObject) arrayList2.get(i2);
                        int i3 = 0;
                        while (i3 < 2) {
                            SQLitePreparedStatement sQLitePreparedStatement = i3 == 0 ? sQLitePreparedStatementExecuteFast : sQLitePreparedStatementExecuteFast2;
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.requery();
                                sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer);
                                sQLitePreparedStatement.bindInteger(2, message.id);
                                sQLitePreparedStatement.bindInteger(3, messageObject.getId());
                                sQLitePreparedStatement.bindLong(4, messageObject.getDialogId());
                                sQLitePreparedStatement.step();
                            }
                            i3++;
                        }
                    }
                    nativeByteBuffer.reuse();
                }
            }
            sQLitePreparedStatementExecuteFast.dispose();
            if (sQLitePreparedStatementExecuteFast2 != null) {
                sQLitePreparedStatementExecuteFast2.dispose();
            }
            getMessagesStorage().getDatabase().commitTransaction();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$saveStickerSetIntoCache$40(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        try {
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO stickersets2 VALUES(?, ?, ?, ?, ?)");
            sQLitePreparedStatementExecuteFast.requery();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_messages_stickerSet.getObjectSize());
            tL_messages_stickerSet.serializeToStream(nativeByteBuffer);
            sQLitePreparedStatementExecuteFast.bindLong(1, tL_messages_stickerSet.set.id);
            sQLitePreparedStatementExecuteFast.bindByteBuffer(2, nativeByteBuffer);
            sQLitePreparedStatementExecuteFast.bindInteger(3, tL_messages_stickerSet.set.hash);
            sQLitePreparedStatementExecuteFast.bindLong(4, System.currentTimeMillis());
            String str = tL_messages_stickerSet.set.short_name;
            sQLitePreparedStatementExecuteFast.bindString(5, str == null ? "" : str.toLowerCase());
            sQLitePreparedStatementExecuteFast.step();
            nativeByteBuffer.reuse();
            sQLitePreparedStatementExecuteFast.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$saveToRingtones$203(TLObject tLObject, TLRPC.Document document) {
        if (tLObject != null) {
            if (!(tLObject instanceof TL_account.TL_savedRingtoneConverted)) {
                RingtoneDataStore ringtoneDataStore = this.ringtoneDataStore;
                ringtoneDataStore.getClass();
                if (document == null || ringtoneDataStore.getDocument(document.id) != null) {
                    return;
                }
                RingtoneDataStore.CachedTone cachedTone = new RingtoneDataStore.CachedTone();
                cachedTone.document = document;
                int i = ringtoneDataStore.localIds;
                ringtoneDataStore.localIds = i + 1;
                cachedTone.localId = i;
                cachedTone.uploading = false;
                ringtoneDataStore.userRingtones.add(cachedTone);
                ringtoneDataStore.saveTones();
                return;
            }
            RingtoneDataStore ringtoneDataStore2 = this.ringtoneDataStore;
            TLRPC.Document document2 = ((TL_account.TL_savedRingtoneConverted) tLObject).document;
            ringtoneDataStore2.getClass();
            if (document2 == null || ringtoneDataStore2.getDocument(document2.id) != null) {
                return;
            }
            RingtoneDataStore.CachedTone cachedTone2 = new RingtoneDataStore.CachedTone();
            cachedTone2.document = document2;
            int i2 = ringtoneDataStore2.localIds;
            ringtoneDataStore2.localIds = i2 + 1;
            cachedTone2.localId = i2;
            cachedTone2.uploading = false;
            ringtoneDataStore2.userRingtones.add(cachedTone2);
            ringtoneDataStore2.saveTones();
        }
    }

    public void lambda$saveToRingtones$204(TLRPC.Document document, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Utilities$$ExternalSyntheticLambda1(this, tLObject, document, 4));
    }

    public void lambda$searchMessagesInChat$120(long j, TLObject tLObject, TLRPC.TL_messages_search tL_messages_search, long j2, int i, int i2, long j3, TLRPC.User user, TLRPC.Chat chat, boolean z, ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
        if (this.lastMergeDialogId == j) {
            this.mergeReqId = 0;
            if (tLObject == null) {
                this.messagesSearchEndReached[1] = true;
                this.messagesSearchCount[1] = 0;
                searchMessagesInChat(tL_messages_search.q, j2, j, i, i2, j3, true, user, chat, z, visibleReaction);
            } else {
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                this.messagesSearchEndReached[1] = messages_messages.messages.isEmpty();
                this.messagesSearchCount[1] = messages_messages instanceof TLRPC.TL_messages_messagesSlice ? messages_messages.count : messages_messages.messages.size();
                searchMessagesInChat(tL_messages_search.q, j2, j, i, i2, j3, true, user, chat, z, visibleReaction);
            }
        }
    }

    public void lambda$searchMessagesInChat$121(final long j, final TLRPC.TL_messages_search tL_messages_search, final long j2, final int i, final int i2, final long j3, final TLRPC.User user, final TLRPC.Chat chat, final boolean z, final ReactionsLayoutInBubble.VisibleReaction visibleReaction, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$searchMessagesInChat$120(j, tLObject, tL_messages_search, j2, i, i2, j3, user, chat, z, visibleReaction);
            }
        });
    }

    public void lambda$searchMessagesInChat$122(int i, int i2, int i3, long j, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        if (i == this.lastReqId) {
            this.loadedPredirectedSearchLocal = arrayList.size() == i2;
            this.loadingSearchLocal = false;
            getMessagesController().putUsers(arrayList2, true);
            getMessagesController().putChats(arrayList3, true);
            AnimatedEmojiDrawable.getDocumentFetcher(this.currentAccount).processDocuments(arrayList4);
            this.searchLocalResultMessages = arrayList;
            updateSearchResults();
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatSearchResultsAvailable, Integer.valueOf(i3), 0, Integer.valueOf(getMask()), Long.valueOf(j), Integer.valueOf(this.lastReturnedNum), Integer.valueOf(getSearchCount()), Boolean.TRUE);
        }
    }

    public void lambda$searchMessagesInChat$123(TLRPC.TL_messages_search tL_messages_search, long j, long j2, int i, TLRPC.messages_Messages messages_messages, ArrayList arrayList, boolean z, boolean z2, long j3, long j4, TLRPC.User user, TLRPC.Chat chat) {
        long j5;
        if (tL_messages_search.offset_id == 0 && j == j2) {
            this.lastReturnedNum = 0;
            this.searchServerResultMessages.clear();
            this.searchServerResultMessagesMap[0].clear();
            this.searchServerResultMessagesMap[1].clear();
            this.messagesSearchCount[0] = 0;
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatSearchResultsLoading, Integer.valueOf(i));
        }
        int iMin = Math.min(messages_messages.messages.size(), tL_messages_search.limit - 1);
        int i2 = 0;
        boolean z3 = false;
        while (i2 < iMin) {
            MessageObject messageObject = (MessageObject) arrayList.get(i2);
            this.searchServerResultMessages.add(messageObject);
            this.searchServerResultMessagesMap[j == j2 ? (char) 0 : (char) 1].put(messageObject.getId(), messageObject);
            i2++;
            z3 = true;
        }
        updateSearchResults();
        this.messagesSearchEndReached[j == j2 ? (char) 0 : (char) 1] = messages_messages.messages.size() < tL_messages_search.limit;
        this.messagesSearchCount[j == j2 ? (char) 0 : (char) 1] = ((messages_messages instanceof TLRPC.TL_messages_messagesSlice) || (messages_messages instanceof TLRPC.TL_messages_channelMessages)) ? messages_messages.count : messages_messages.messages.size();
        if (this.searchServerResultMessages.isEmpty()) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatSearchResultsAvailable, Integer.valueOf(i), 0, Integer.valueOf(getMask()), 0L, 0, 0, Boolean.valueOf(z));
            j5 = 0;
        } else if (z3) {
            if (this.lastReturnedNum >= this.searchResultMessages.size()) {
                this.lastReturnedNum = this.searchResultMessages.size() - 1;
            }
            MessageObject messageObject2 = this.searchResultMessages.get(this.lastReturnedNum);
            j5 = 0;
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatSearchResultsAvailable, Integer.valueOf(i), Integer.valueOf(messageObject2.getId()), Integer.valueOf(getMask()), Long.valueOf(messageObject2.getDialogId()), Integer.valueOf(this.lastReturnedNum), Integer.valueOf(getSearchCount()), Boolean.valueOf(z));
        } else {
            j5 = 0;
            if (z2) {
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatSearchResultsAvailable, Integer.valueOf(i), 0, Integer.valueOf(getMask()), Long.valueOf(j2), Integer.valueOf(this.lastReturnedNum), Integer.valueOf(getSearchCount()), Boolean.FALSE);
            }
        }
        if (j == j2) {
            boolean[] zArr = this.messagesSearchEndReached;
            if (!zArr[0] || j3 == j5 || zArr[1]) {
                return;
            }
            searchMessagesInChat(this.lastSearchQuery, j2, j3, i, 0, j4, true, user, chat, z, this.lastReaction);
        }
    }

    public void lambda$searchMessagesInChat$124(int i, final boolean z, TLObject tLObject, final TLRPC.TL_messages_search tL_messages_search, final long j, final long j2, final int i2, final ArrayList arrayList, final boolean z2, final long j3, final long j4, final TLRPC.User user, final TLRPC.Chat chat) {
        if (i == this.lastReqId) {
            this.reqId = 0;
            if (!z) {
                this.loadingMoreSearchMessages = false;
            }
            if (tLObject != null) {
                final TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                int i3 = 0;
                while (i3 < messages_messages.messages.size()) {
                    TLRPC.Message message = messages_messages.messages.get(i3);
                    if ((message instanceof TLRPC.TL_messageEmpty) || (message.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                        messages_messages.messages.remove(i3);
                        i3--;
                    }
                    i3++;
                }
                getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                getMessagesController().putUsers(messages_messages.users, false);
                getMessagesController().putChats(messages_messages.chats, false);
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$searchMessagesInChat$123(tL_messages_search, j, j2, i2, messages_messages, arrayList, z, z2, j3, j4, user, chat);
                    }
                };
                if (z2) {
                    loadReplyMessagesForMessages(arrayList, j2, 0, this.lastReplyMessageId, runnable, i2, null);
                } else {
                    runnable.run();
                }
            }
        }
    }

    public void lambda$searchMessagesInChat$125(TLRPC.TL_messages_search tL_messages_search, final boolean z, String str, boolean z2, final int i, final boolean z3, final long j, final long j2, final int i2, final long j3, final long j4, final TLRPC.User user, final TLRPC.Chat chat, final TLObject tLObject, TLRPC.TL_error tL_error) {
        final TLRPC.TL_messages_search tL_messages_search2;
        final ArrayList arrayList = new ArrayList();
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            tL_messages_search2 = tL_messages_search;
            int iMin = Math.min(messages_messages.messages.size(), tL_messages_search2.limit - 1);
            for (int i3 = 0; i3 < iMin; i3++) {
                MessageObject messageObject = new MessageObject(this.currentAccount, messages_messages.messages.get(i3), null, null, null, null, null, true, true, 0L, false, false, z);
                if (messageObject.hasValidGroupId()) {
                    messageObject.isPrimaryGroupMessage = true;
                }
                messageObject.setQuery(str, !z2);
                arrayList.add(messageObject);
            }
        } else {
            tL_messages_search2 = tL_messages_search;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$searchMessagesInChat$124(i, z3, tLObject, tL_messages_search2, j, j2, i2, arrayList, z, j3, j4, user, chat);
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
        if (this.loadingSearchStickersKeys.containsKey(searchStickersKey)) {
            StringBuilder sb = new StringBuilder();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                KeywordResult keywordResult = (KeywordResult) obj;
                if (!TextUtils.isEmpty(keywordResult.emoji) && !keywordResult.emoji.startsWith("animated_")) {
                    sb.append(keywordResult.emoji);
                }
            }
            TLRPC.TL_messages_searchStickers tL_messages_searchStickers = new TLRPC.TL_messages_searchStickers();
            tL_messages_searchStickers.emojis = searchStickersKey.emojis;
            if (!TextUtils.isEmpty(searchStickersKey.lang_code)) {
                tL_messages_searchStickers.lang_code.add(searchStickersKey.lang_code);
            }
            tL_messages_searchStickers.emoticon = sb.toString();
            tL_messages_searchStickers.q = searchStickersKey.q;
            tL_messages_searchStickers.limit = 100;
            tL_messages_searchStickers.offset = searchStickersResult != null ? searchStickersResult.next_offset.intValue() : 0;
            this.loadingSearchStickersKeys.put(searchStickersKey, Integer.valueOf(getConnectionsManager().sendRequestTyped(tL_messages_searchStickers, new AiTonesController$$ExternalSyntheticLambda0(), new MediaDataController$$ExternalSyntheticLambda72(this, searchStickersKey, searchStickersResult, callback, 0))));
        }
    }

    public static void lambda$setPlaceholderImage$31(String str, BackupImageView backupImageView, String str2, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.Document document;
        if (tL_messages_stickerSet == null) {
            return;
        }
        ArrayList<Emoji.EmojiSpanRange> emojis = Emoji.parseEmojis(str);
        for (int i = 0; i < emojis.size(); i++) {
            emojis.get(i).code = Emoji.fixEmoji(emojis.get(i).code.toString());
        }
        int i2 = 0;
        loop1: while (true) {
            if (i2 >= tL_messages_stickerSet.documents.size()) {
                document = null;
                break;
            }
            document = tL_messages_stickerSet.documents.get(i2);
            int size = emojis.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break loop1;
                }
                Emoji.EmojiSpanRange emojiSpanRange = emojis.get(i3);
                i3++;
                Emoji.EmojiSpanRange emojiSpanRange2 = emojiSpanRange;
                int i4 = 0;
                while (true) {
                    if (i4 < tL_messages_stickerSet.packs.size()) {
                        if (!tL_messages_stickerSet.packs.get(i4).documents.contains(Long.valueOf(document.id)) || !TextUtils.equals(Emoji.fixEmoji(tL_messages_stickerSet.packs.get(i4).emoticon), emojiSpanRange2.code)) {
                            i4++;
                        }
                    }
                }
            }
            i2++;
        }
        if (document != null) {
            backupImageView.setImage$1(ImageLocation.getForDocument(document), str2, DocumentObject.getSvgThumb(document, Theme.key_windowBackgroundWhiteGrayIcon, 0.2f, 1.0f, null), document);
            backupImageView.invalidate();
        }
    }

    public static int lambda$static$160(TLRPC.MessageEntity messageEntity, TLRPC.MessageEntity messageEntity2) {
        int i = messageEntity.offset;
        int i2 = messageEntity2.offset;
        if (i > i2) {
            return 1;
        }
        return i < i2 ? -1 : 0;
    }

    public void lambda$toggleStickerSet$108(boolean[] zArr, TLRPC.StickerSet stickerSet, int i, int i2, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Runnable runnable) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        markSetUninstalling(stickerSet.id, false);
        stickerSet.archived = false;
        this.stickerSets[i].add(i2, tL_messages_stickerSet);
        this.stickerSetsById.put(tL_messages_stickerSet, stickerSet.id);
        this.installedStickerSetsById.put(tL_messages_stickerSet, stickerSet.id);
        String str = stickerSet.short_name;
        if (str != null) {
            this.stickerSetsByName.put(str.toLowerCase(), tL_messages_stickerSet);
        }
        this.removingStickerSetsUndos.remove(stickerSet.id);
        this.loadHash[i] = calcStickersHash(this.stickerSets[i]);
        putStickersToCache(i, this.stickerSets[i], this.loadDate[i], this.loadHash[i]);
        if (runnable != null) {
            runnable.run();
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i), Boolean.TRUE);
    }

    public void lambda$toggleStickerSet$109(boolean[] zArr, Context context, int i, BaseFragment baseFragment, FrameLayout frameLayout, boolean z, TLObject tLObject, TLRPC.StickerSet stickerSet, TLRPC.Document document, int i2) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        toggleStickerSetInternal(context, i, baseFragment, frameLayout, z, tLObject, stickerSet, document, i2, false);
    }

    public void lambda$toggleStickerSetInternal$112(TLRPC.StickerSet stickerSet, ArrayList arrayList) {
        markSetInstalling(stickerSet.id, false);
    }

    public void lambda$toggleStickerSetInternal$113(TLRPC.StickerSet stickerSet, TLObject tLObject, BaseFragment baseFragment, boolean z, int i, TLRPC.TL_error tL_error, boolean z2, FrameLayout frameLayout, Context context, TLObject tLObject2, TLRPC.Document document) {
        this.removingStickerSetsUndos.remove(stickerSet.id);
        if (tLObject instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
            processStickerSetInstallResultArchive(baseFragment, z, i, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject);
        }
        loadStickers(i, false, false, true, new MediaDataController$$ExternalSyntheticLambda8(this, stickerSet, 0));
        if (tL_error == null && z2) {
            if (frameLayout != null) {
                Bulletin.make(frameLayout, new StickerSetBulletinLayout(context, tLObject2, 1, 2, document, baseFragment.getResourceProvider()), 1500).show();
            } else if (baseFragment != null) {
                Bulletin.make(baseFragment, new StickerSetBulletinLayout(context, tLObject2, 1, 2, document, baseFragment.getResourceProvider()), 1500).show();
            }
        }
    }

    public void lambda$toggleStickerSetInternal$114(final TLRPC.StickerSet stickerSet, final BaseFragment baseFragment, final boolean z, final int i, final boolean z2, final FrameLayout frameLayout, final Context context, final TLObject tLObject, final TLRPC.Document document, final TLObject tLObject2, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.lambda$toggleStickerSetInternal$113(stickerSet, tLObject2, baseFragment, z, i, tL_error, z2, frameLayout, context, tLObject, document);
            }
        });
    }

    public void lambda$toggleStickerSetInternal$115(TLRPC.StickerSet stickerSet, ArrayList arrayList) {
        markSetUninstalling(stickerSet.id, false);
    }

    public void lambda$toggleStickerSetInternal$116(TLRPC.StickerSet stickerSet, int i) {
        this.removingStickerSetsUndos.remove(stickerSet.id);
        loadStickers(i, false, true, false, new MediaDataController$$ExternalSyntheticLambda8(this, stickerSet, 1));
    }

    public void lambda$toggleStickerSetInternal$117(TLRPC.StickerSet stickerSet, int i, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new FileLoader$$ExternalSyntheticLambda5(this, stickerSet, i, 9));
    }

    public void lambda$toggleStickerSets$118(int i, TLObject tLObject, BaseFragment baseFragment, boolean z, int i2) {
        if (i == 0) {
            loadStickers(i2, false, true);
            return;
        }
        if (tLObject instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
            processStickerSetInstallResultArchive(baseFragment, z, i2, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject);
        }
        loadStickers(i2, false, false, true);
    }

    public void lambda$toggleStickerSets$119(int i, BaseFragment baseFragment, boolean z, int i2, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ChatActivity$70$$ExternalSyntheticLambda0(this, i, tLObject, baseFragment, z, i2));
    }

    public void lambda$updateBotInfo$202(TL_update.TL_updateBotCommands tL_updateBotCommands, long j) {
        try {
            TL_bots.BotInfo botInfoLoadBotInfoInternal = loadBotInfoInternal(tL_updateBotCommands.bot_id, j);
            if (botInfoLoadBotInfoInternal != null) {
                botInfoLoadBotInfoInternal.commands = tL_updateBotCommands.commands;
            }
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO bot_info_v2 VALUES(?, ?, ?)");
            sQLitePreparedStatementExecuteFast.requery();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(botInfoLoadBotInfoInternal.getObjectSize());
            botInfoLoadBotInfoInternal.serializeToStream(nativeByteBuffer);
            sQLitePreparedStatementExecuteFast.bindLong(1, botInfoLoadBotInfoInternal.user_id);
            sQLitePreparedStatementExecuteFast.bindLong(2, j);
            sQLitePreparedStatementExecuteFast.bindByteBuffer(3, nativeByteBuffer);
            sQLitePreparedStatementExecuteFast.step();
            nativeByteBuffer.reuse();
            sQLitePreparedStatementExecuteFast.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$updateEmojiStatuses$234(int i, TL_account.TL_emojiStatuses tL_emojiStatuses) {
        try {
            getMessagesStorage().getDatabase().executeFast("DELETE FROM emoji_statuses WHERE type = " + i).stepThis().dispose();
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = getMessagesStorage().getDatabase().executeFast("INSERT INTO emoji_statuses VALUES(?, ?)");
            sQLitePreparedStatementExecuteFast.requery();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_emojiStatuses.getObjectSize());
            tL_emojiStatuses.serializeToStream(nativeByteBuffer);
            sQLitePreparedStatementExecuteFast.bindByteBuffer(1, nativeByteBuffer);
            sQLitePreparedStatementExecuteFast.bindInteger(2, i);
            sQLitePreparedStatementExecuteFast.step();
            nativeByteBuffer.reuse();
            sQLitePreparedStatementExecuteFast.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.emojiStatusesFetching[i] = false;
    }

    public void lambda$verifyAnimatedStickerMessageInternal$69(String str, TLObject tLObject) {
        char c;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        ArrayList<TLRPC.Message> arrayList = this.verifyingMessages.get(str);
        if (tLObject != null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject;
            storeTempStickerSet(tL_messages_stickerSet2);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                TLRPC.Message message = arrayList.get(i);
                TLRPC.Document document = MessageObject.getDocument(message);
                int size2 = tL_messages_stickerSet2.documents.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size2) {
                        tL_messages_stickerSet = tL_messages_stickerSet2;
                        break;
                    }
                    TLRPC.Document document2 = tL_messages_stickerSet2.documents.get(i2);
                    tL_messages_stickerSet = tL_messages_stickerSet2;
                    if (document2.id == document.id && document2.dc_id == document.dc_id) {
                        message.stickerVerified = 1;
                        break;
                    } else {
                        i2++;
                        tL_messages_stickerSet2 = tL_messages_stickerSet;
                    }
                }
                if (message.stickerVerified == 0) {
                    message.stickerVerified = 2;
                }
                i++;
                tL_messages_stickerSet2 = tL_messages_stickerSet;
            }
            c = 0;
        } else {
            c = 0;
            int size3 = arrayList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                arrayList.get(i3).stickerVerified = 2;
            }
        }
        NotificationCenter notificationCenter = getNotificationCenter();
        int i4 = NotificationCenter.didVerifyMessagesStickers;
        Object[] objArr = new Object[1];
        objArr[c] = arrayList;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i4, objArr);
        getMessagesStorage().updateMessageVerifyFlags(arrayList);
    }

    public void lambda$verifyAnimatedStickerMessageInternal$70(String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda75(this, str, tLObject, 1));
    }

    private void loadAvatarConstructor(boolean z) {
        String string;
        long j;
        TLRPC.TL_emojiList tL_emojiList;
        Throwable th;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("avatar_constructor" + this.currentAccount, 0);
        TLRPC.TL_emojiList tL_emojiList2 = null;
        if (z) {
            string = sharedPreferences.getString("profile", null);
            j = sharedPreferences.getLong("profile_last_check", 0L);
        } else {
            string = sharedPreferences.getString("group", null);
            j = sharedPreferences.getLong("group_last_check", 0L);
        }
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            try {
                tL_emojiList = (TLRPC.TL_emojiList) TLRPC.EmojiList.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                try {
                    if (z) {
                        this.profileAvatarConstructorDefault = tL_emojiList;
                    } else {
                        this.groupAvatarConstructorDefault = tL_emojiList;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    FileLog.e(th);
                }
            } catch (Throwable th3) {
                tL_emojiList = null;
                th = th3;
            }
            tL_emojiList2 = tL_emojiList;
        }
        if (tL_emojiList2 == null || System.currentTimeMillis() - j > 86400000 || BuildVars.DEBUG_PRIVATE_VERSION) {
            TL_account.getDefaultProfilePhotoEmojis getdefaultprofilephotoemojis = new TL_account.getDefaultProfilePhotoEmojis();
            if (tL_emojiList2 != null) {
                getdefaultprofilephotoemojis.hash = tL_emojiList2.hash;
            }
            getConnectionsManager().sendRequest(getdefaultprofilephotoemojis, new ChatObject$Call$$ExternalSyntheticLambda11(this, sharedPreferences, z, 1));
        }
    }

    private TL_bots.BotInfo loadBotInfoInternal(long j, long j2) {
        TL_bots.BotInfo botInfoTLdeserialize;
        NativeByteBuffer nativeByteBufferByteBufferValue;
        SQLiteDatabase database = getMessagesStorage().getDatabase();
        Locale locale = Locale.US;
        SQLiteCursor sQLiteCursorQueryFinalized = database.queryFinalized("SELECT info FROM bot_info_v2 WHERE uid = " + j + " AND dialogId = " + j2, new Object[0]);
        if (!sQLiteCursorQueryFinalized.next() || sQLiteCursorQueryFinalized.isNull(0) || (nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0)) == null) {
            botInfoTLdeserialize = null;
        } else {
            botInfoTLdeserialize = TL_bots.BotInfo.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
            nativeByteBufferByteBufferValue.reuse();
        }
        sQLiteCursorQueryFinalized.dispose();
        return botInfoTLdeserialize;
    }

    private void loadDraftVoiceMessages() {
        if (this.draftVoicesLoaded) {
            return;
        }
        Set<Map.Entry<String, ?>> setEntrySet = ApplicationLoader.applicationContext.getSharedPreferences("2voicedrafts_" + this.currentAccount, 0).getAll().entrySet();
        this.draftVoices.clear();
        for (Map.Entry<String, ?> entry : setEntrySet) {
            String key = entry.getKey();
            DraftVoice draftVoiceFromString = DraftVoice.fromString((String) entry.getValue());
            if (draftVoiceFromString != null) {
                this.draftVoices.put(draftVoiceFromString, Long.parseLong(key));
            }
        }
        this.draftVoicesLoaded = true;
    }

    private void loadGroupStickerSet(TLRPC.StickerSet stickerSet, boolean z) {
        if (z) {
            getMessagesStorage().getStorageQueue().postRunnable(new FileLog$$ExternalSyntheticLambda3(21, this, stickerSet));
            return;
        }
        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_messages_getStickerSet.stickerset = tL_inputStickerSetID;
        tL_inputStickerSetID.id = stickerSet.id;
        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new MediaDataController$$ExternalSyntheticLambda19(this, 8));
    }

    private void loadMediaDatabase(long j, int i, int i2, int i3, int i4, long j2, ReactionsLayoutInBubble.VisibleReaction visibleReaction, int i5, boolean z, int i6, int i7) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(i, j, i3, j2, i4, visibleReaction, i2, i5, i6, z, i7);
        MessagesStorage messagesStorage = getMessagesStorage();
        messagesStorage.getStorageQueue().postRunnable(anonymousClass1);
        messagesStorage.bindTaskToGuid(anonymousClass1, i5);
    }

    private ArrayList<MessageObject> loadPinnedMessageInternal(long j, long j2, ArrayList<Integer> arrayList, boolean z) {
        ?? Join;
        ArrayList<TLRPC.User> arrayList2;
        ArrayList<TLRPC.Chat> arrayList3;
        try {
            ArrayList<Integer> arrayList4 = new ArrayList<>(arrayList);
            if (j2 != 0) {
                Join = new StringBuilder();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Integer num = arrayList.get(i);
                    if (Join.length() != 0) {
                        Join.append(",");
                    }
                    Join.append(num);
                }
            } else {
                Join = TextUtils.join(",", arrayList);
            }
            ArrayList<TLRPC.Message> arrayList5 = new ArrayList<>();
            ArrayList<TLRPC.User> arrayList6 = new ArrayList<>();
            ArrayList<TLRPC.Chat> arrayList7 = new ArrayList<>();
            ArrayList<Long> arrayList8 = new ArrayList<>();
            ArrayList arrayList9 = new ArrayList();
            long j3 = getUserConfig().clientUserId;
            boolean z2 = false;
            SQLiteCursor sQLiteCursorQueryFinalized = getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT data, mid, date FROM messages_v2 WHERE mid IN (%s) AND uid = %d", new Object[]{Join, Long.valueOf(j)}), new Object[0]);
            while (sQLiteCursorQueryFinalized.next()) {
                NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(z2 ? 1 : 0);
                if (nativeByteBufferByteBufferValue != null) {
                    TLRPC.Message messageTLdeserialize = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(z2), z2);
                    if (!(messageTLdeserialize.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                        messageTLdeserialize.readAttachPath(nativeByteBufferByteBufferValue, j3);
                        messageTLdeserialize.id = sQLiteCursorQueryFinalized.intValue(1);
                        messageTLdeserialize.date = sQLiteCursorQueryFinalized.intValue(2);
                        messageTLdeserialize.dialog_id = j;
                        MessagesStorage.addUsersAndChatsFromMessage(messageTLdeserialize, arrayList8, arrayList9, null);
                        arrayList5.add(messageTLdeserialize);
                        arrayList4.remove(Integer.valueOf(messageTLdeserialize.id));
                    }
                    nativeByteBufferByteBufferValue.reuse();
                    z2 = false;
                }
            }
            sQLiteCursorQueryFinalized.dispose();
            if (!arrayList4.isEmpty()) {
                SQLiteDatabase database = getMessagesStorage().getDatabase();
                Locale locale = Locale.US;
                SQLiteCursor sQLiteCursorQueryFinalized2 = database.queryFinalized("SELECT data FROM chat_pinned_v2 WHERE uid = " + j + " AND mid IN (" + TextUtils.join(",", arrayList4) + ")", new Object[0]);
                while (sQLiteCursorQueryFinalized2.next()) {
                    NativeByteBuffer nativeByteBufferByteBufferValue2 = sQLiteCursorQueryFinalized2.byteBufferValue(0);
                    if (nativeByteBufferByteBufferValue2 != null) {
                        TLRPC.Message messageTLdeserialize2 = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue2, nativeByteBufferByteBufferValue2.readInt32(false), false);
                        if (!(messageTLdeserialize2.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                            messageTLdeserialize2.readAttachPath(nativeByteBufferByteBufferValue2, j3);
                            messageTLdeserialize2.dialog_id = j;
                            MessagesStorage.addUsersAndChatsFromMessage(messageTLdeserialize2, arrayList8, arrayList9, null);
                            arrayList5.add(messageTLdeserialize2);
                            arrayList4.remove(Integer.valueOf(messageTLdeserialize2.id));
                        }
                        nativeByteBufferByteBufferValue2.reuse();
                    }
                }
                sQLiteCursorQueryFinalized2.dispose();
            }
            if (!arrayList4.isEmpty()) {
                if (j2 != 0) {
                    TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                    tL_channels_getMessages.channel = getMessagesController().getInputChannel(j2);
                    tL_channels_getMessages.id = arrayList4;
                    getConnectionsManager().sendRequest(tL_channels_getMessages, new StarGiftSheet$$ExternalSyntheticLambda132(this, j2, j, tL_channels_getMessages));
                } else {
                    TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                    tL_messages_getMessages.id = arrayList4;
                    getConnectionsManager().sendRequest(tL_messages_getMessages, new TranslateController$$ExternalSyntheticLambda14(this, j, tL_messages_getMessages, 2));
                }
            }
            if (arrayList5.isEmpty()) {
                return null;
            }
            if (arrayList8.isEmpty()) {
                arrayList2 = arrayList6;
            } else {
                arrayList2 = arrayList6;
                getMessagesStorage().getUsersInternal(arrayList8, arrayList2);
            }
            if (arrayList9.isEmpty()) {
                arrayList3 = arrayList7;
            } else {
                arrayList3 = arrayList7;
                getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList9), arrayList3);
            }
            if (z) {
                return broadcastPinnedMessage(arrayList5, arrayList2, arrayList3, true, true);
            }
            broadcastPinnedMessage(arrayList5, arrayList2, arrayList3, true, false);
            return null;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static ArrayList<TLRPC.Reaction> loadReactionsFromPref(SharedPreferences sharedPreferences) {
        int i = sharedPreferences.getInt("count", 0);
        ArrayList<TLRPC.Reaction> arrayList = new ArrayList<>(i);
        if (i > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                SerializedData serializedData = new SerializedData(Utilities.hexToBytes(sharedPreferences.getString("object_" + i2, "")));
                try {
                    arrayList.add(TLRPC.Reaction.TLdeserialize(serializedData, serializedData.readInt32(true), true));
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            }
        }
        return arrayList;
    }

    private void loadRepliesOfDraftReplies(ArrayList<TLRPC.Message> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new MediaDataController$$ExternalSyntheticLambda70(this, arrayList, 1));
    }

    private void loadStickerSetThumbInternal(TLRPC.PhotoSize photoSize, Object obj, TLRPC.Document document, int i) {
        ImageLocation forSticker = ImageLocation.getForSticker(photoSize, document, i);
        if (forSticker != null) {
            getFileLoader().loadFile(forSticker, obj, forSticker.imageType == 1 ? "tgs" : "webp", 3, 1);
        }
    }

    public static void offsetEntities(ArrayList<TLRPC.MessageEntity> arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            TLRPC.MessageEntity messageEntity = arrayList.get(i2);
            i2++;
            messageEntity.offset += i;
        }
    }

    private CharSequence parsePattern(CharSequence charSequence, Pattern pattern, ArrayList<TLRPC.MessageEntity> arrayList, GenericProvider<Void, TLRPC.MessageEntity> genericProvider) {
        URLSpan[] uRLSpanArr;
        Matcher matcher = pattern.matcher(charSequence);
        int iEnd = 0;
        while (matcher.find()) {
            boolean z = true;
            String strGroup = matcher.group(1);
            if ((charSequence instanceof Spannable) && (uRLSpanArr = (URLSpan[]) ((Spannable) charSequence).getSpans(matcher.start() - iEnd, matcher.end() - iEnd, URLSpan.class)) != null && uRLSpanArr.length > 0) {
                z = false;
            }
            if (z) {
                for (int i = 0; i < arrayList.size(); i++) {
                    TLRPC.MessageEntity messageEntity = arrayList.get(i);
                    if ((messageEntity instanceof TLRPC.TL_messageEntityPre) || (messageEntity instanceof TLRPC.TL_messageEntityCode)) {
                        int iStart = matcher.start() - iEnd;
                        int iEnd2 = matcher.end() - iEnd;
                        int i2 = messageEntity.offset;
                        if (AndroidUtilities.intersect1d(iStart, iEnd2, i2, messageEntity.length + i2)) {
                            z = false;
                            break;
                        }
                    }
                }
            }
            if (z) {
                charSequence = ((Object) charSequence.subSequence(0, matcher.start() - iEnd)) + strGroup + ((Object) charSequence.subSequence(matcher.end() - iEnd, charSequence.length()));
                TLRPC.MessageEntity messageEntityProvide = genericProvider.provide(null);
                messageEntityProvide.offset = matcher.start() - iEnd;
                int length = strGroup.length();
                messageEntityProvide.length = length;
                int i3 = messageEntityProvide.offset;
                removeOffset4After(i3, length + i3, arrayList);
                arrayList.add(messageEntityProvide);
            }
            iEnd += (matcher.end() - matcher.start()) - strGroup.length();
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

    private void processLoadStickersResponse(int i, TLRPC.TL_messages_allStickers tL_messages_allStickers) {
        processLoadStickersResponse(i, tL_messages_allStickers, null);
    }

    private void processLoadedDiceStickers(String str, boolean z, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z2, int i) {
        AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda1(this, str, 4));
        Utilities.stageQueue.postRunnable(new Theme$$ExternalSyntheticLambda4(this, z2, tL_messages_stickerSet, i, str, z));
    }

    private void processLoadedFeaturedStickers(boolean z, ArrayList<TLRPC.StickerSetCovered> arrayList, ArrayList<Long> arrayList2, boolean z2, boolean z3, int i, long j) {
        AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda30(this, z, 0));
        Utilities.stageQueue.postRunnable(new MessagesStorage$$ExternalSyntheticLambda188(this, z3, arrayList, i, j, z, arrayList2, z2));
    }

    public void processLoadedMedia(final TLRPC.messages_Messages messages_messages, final long j, int i, int i2, final int i3, final int i4, long j2, final int i5, final int i6, boolean z, final boolean z2, final int i7) {
        long j3;
        int i8;
        int i9;
        long j4;
        boolean z3;
        ArrayList<TLRPC.Message> arrayList;
        ArrayList<TLRPC.Message> arrayList2;
        if (BuildVars.LOGS_ENABLED) {
            int size = (messages_messages == null || (arrayList2 = messages_messages.messages) == null) ? 0 : arrayList2.size();
            StringBuilder sb = new StringBuilder("process load media messagesCount ");
            sb.append(size);
            sb.append(" did ");
            j3 = j;
            sb.append(j3);
            sb.append(" topicId ");
            j4 = j2;
            sb.append(j4);
            sb.append(" count = ");
            i8 = i;
            SurfaceContainer$$ExternalSyntheticOutline0.m(sb, i8, " max_id=", i2, " min_id=");
            i9 = i4;
            SurfaceContainer$$ExternalSyntheticOutline0.m(sb, i3, " type = ", i9, " cache = ");
            SurfaceContainer$$ExternalSyntheticOutline0.m(sb, i5, " classGuid = ", i6, " topReached=");
            z3 = z2;
            sb.append(z3);
            FileLog.d(sb.toString());
        } else {
            j3 = j;
            i8 = i;
            i9 = i4;
            j4 = j2;
            z3 = z2;
        }
        if (i5 != 0 && messages_messages != null && (arrayList = messages_messages.messages) != null && (((arrayList.isEmpty() && i3 == 0) || (messages_messages.messages.size() <= 1 && i3 != 0)) && !DialogObject.isEncryptedDialog(j3))) {
            if (i5 == 2) {
                return;
            }
            loadMedia(j3, i8, i2, i3, i9, j4, 0, i6, i7, null, null);
        } else {
            if (i5 == 0) {
                ImageLoader.saveMessagesThumbs(messages_messages.messages);
                getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                putMediaDatabase(j, j2, i4, messages_messages.messages, i2, i3, z3);
            }
            Utilities.searchQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$processLoadedMedia$136(messages_messages, i5, j, i6, i4, z2, i3, i7);
                }
            });
        }
    }

    private void processLoadedMediaCount(final int i, final long j, final long j2, final int i2, final int i3, final boolean z, final int i4) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$processLoadedMediaCount$137(j, z, i, i2, i4, j2, i3);
            }
        });
    }

    private void processLoadedStickers(int i, ArrayList<TLRPC.TL_messages_stickerSet> arrayList, boolean z, int i2, long j) {
        processLoadedStickers(i, arrayList, z, i2, j, null);
    }

    private void putDiceStickersToCache(String str, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new ImageLoader$$ExternalSyntheticLambda14(this, tL_messages_stickerSet, str, i));
    }

    private void putEmojiKeywords(String str, TLRPC.TL_emojiKeywordsDifference tL_emojiKeywordsDifference) {
        if (tL_emojiKeywordsDifference == null) {
            return;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new FileLoader$$ExternalSyntheticLambda0(this, tL_emojiKeywordsDifference, str, 27));
    }

    private void putFeaturedStickersToCache(final boolean z, ArrayList<TLRPC.StickerSetCovered> arrayList, final ArrayList<Long> arrayList2, final int i, final long j, final boolean z2) {
        final ArrayList arrayList3 = arrayList != null ? new ArrayList(arrayList) : null;
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$putFeaturedStickersToCache$64(arrayList3, arrayList2, z, i, j, z2);
            }
        });
    }

    private void putMediaCountDatabase(long j, long j2, int i, int i2) {
        getMessagesStorage().getStorageQueue().postRunnable(new MessagesStorage$$ExternalSyntheticLambda254(this, j2, j, i, i2, 2));
    }

    private void putMediaDatabase(long j, long j2, int i, ArrayList<TLRPC.Message> arrayList, int i2, int i3, boolean z) {
        getMessagesStorage().getStorageQueue().postRunnable(new MessagesStorage$$ExternalSyntheticLambda168(this, i3, arrayList, z, j, i2, i, j2));
    }

    private void putMenuBotsToCache(TLRPC.TL_attachMenuBots tL_attachMenuBots, long j, int i) {
        getMessagesStorage().getStorageQueue().postRunnable(new ArticleViewer$$ExternalSyntheticLambda48(this, tL_attachMenuBots, j, i, 1));
    }

    private void putPremiumPromoToCache(TLRPC.TL_help_premiumPromo tL_help_premiumPromo, int i) {
        getMessagesStorage().getStorageQueue().postRunnable(new FileLoader$$ExternalSyntheticLambda5(this, tL_help_premiumPromo, i, 6));
    }

    private void putReactionsToCache(List<TLRPC.TL_availableReaction> list, int i, int i2) {
        getMessagesStorage().getStorageQueue().postRunnable(new MediaDataController$$ExternalSyntheticLambda221(this, list != null ? new ArrayList(list) : null, i, i2, 1));
    }

    private void putSetToCache(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        getMessagesStorage().getStorageQueue().postRunnable(new MediaDataController$$ExternalSyntheticLambda114(this, tL_messages_stickerSet, 3));
    }

    private void putStickersToCache(int i, ArrayList<TLRPC.TL_messages_stickerSet> arrayList, int i2, long j) {
        getMessagesStorage().getStorageQueue().postRunnable(new MessagesStorage$$ExternalSyntheticLambda136(this, arrayList != null ? new ArrayList(arrayList) : null, i, i2, j));
    }

    private static void removeEmptyMessages(ArrayList<TLRPC.Message> arrayList) {
        int i = 0;
        while (i < arrayList.size()) {
            TLRPC.Message message = arrayList.get(i);
            if (message == null || (message instanceof TLRPC.TL_messageEmpty) || (message.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                arrayList.remove(i);
                i--;
            }
            i++;
        }
    }

    private static void removeOffset4After(int i, int i2, ArrayList<TLRPC.MessageEntity> arrayList) {
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            TLRPC.MessageEntity messageEntity = arrayList.get(i3);
            int i4 = messageEntity.offset;
            if (i4 > i2) {
                messageEntity.offset = i4 - 4;
            } else if (i4 > i) {
                messageEntity.offset = i4 - 2;
            }
        }
    }

    private static boolean replyToEquals(TLRPC.InputReplyTo inputReplyTo, TLRPC.InputReplyTo inputReplyTo2) {
        if (inputReplyTo == inputReplyTo2) {
            return true;
        }
        boolean z = inputReplyTo instanceof TLRPC.TL_inputReplyToMessage;
        if (z != (inputReplyTo2 instanceof TLRPC.TL_inputReplyToMessage)) {
            return false;
        }
        if (z) {
            return MessageObject.peersEqual(inputReplyTo.reply_to_peer_id, inputReplyTo2.reply_to_peer_id) && TextUtils.equals(inputReplyTo.quote_text, inputReplyTo2.quote_text) && inputReplyTo.reply_to_msg_id == inputReplyTo2.reply_to_msg_id;
        }
        if (inputReplyTo instanceof TLRPC.TL_inputReplyToStory) {
            return MessageObject.peersEqual(inputReplyTo.peer, inputReplyTo2.peer) && inputReplyTo.story_id == inputReplyTo2.story_id;
        }
        return true;
    }

    private static boolean richMessageEquals(TL_iv.RichMessage richMessage, TL_iv.RichMessage richMessage2) {
        if (richMessage == richMessage2) {
            return true;
        }
        if ((richMessage == null) != (richMessage2 == null)) {
            return false;
        }
        try {
            SerializedData serializedData = new SerializedData(richMessage.getObjectSize());
            SerializedData serializedData2 = new SerializedData(richMessage2.getObjectSize());
            richMessage.serializeToStream(serializedData);
            richMessage2.serializeToStream(serializedData2);
            return Arrays.equals(serializedData.toByteArray(), serializedData2.toByteArray());
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }

    private void saveDraftReplyMessage(long j, long j2, TLRPC.Message message) {
        if (message == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new LaunchActivity$$ExternalSyntheticLambda37(3, j, j2, this, message));
    }

    private void savePeer(final long j, final int i, final double d) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$savePeer$158(j, i, d);
            }
        });
    }

    private void savePinnedMessages(long j, ArrayList<TLRPC.Message> arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new MessagesStorage$$ExternalSyntheticLambda11(this, arrayList, j, 8));
    }

    public static void saveReactionsToPref(SharedPreferences sharedPreferences, long j, ArrayList<? extends TLObject> arrayList) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putInt("count", arrayList.size());
        editorEdit.putLong("hash", j);
        for (int i = 0; i < arrayList.size(); i++) {
            TLObject tLObject = arrayList.get(i);
            SerializedData serializedData = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData);
            editorEdit.putString("object_" + i, Utilities.bytesToHex(serializedData.toByteArray()));
        }
        editorEdit.apply();
    }

    private void saveReplyMessages(LongSparseArray longSparseArray, ArrayList<TLRPC.Message> arrayList, boolean z) {
        getMessagesStorage().getStorageQueue().postRunnable(new CacheFetcher$$ExternalSyntheticLambda0(this, z, arrayList, longSparseArray, 7));
    }

    private void saveStickerSetIntoCache(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        if (tL_messages_stickerSet == null || tL_messages_stickerSet.set == null) {
            return;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new MediaDataController$$ExternalSyntheticLambda114(this, tL_messages_stickerSet, 0));
        cleanupStickerSetCache();
    }

    private TLRPC.MessageEntity setEntityStartEnd(TLRPC.MessageEntity messageEntity, int i, int i2) {
        messageEntity.offset = i;
        messageEntity.length = i2 - i;
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
        if (suggestedPost == suggestedPost2) {
            return true;
        }
        if ((suggestedPost == null) != (suggestedPost2 == null)) {
            return false;
        }
        return !AmountUtils$Amount.equals(AmountUtils$Amount.of(suggestedPost.price), AmountUtils$Amount.of(suggestedPost2.price)) && suggestedPost.schedule_date == suggestedPost2.schedule_date && suggestedPost.accepted == suggestedPost2.accepted && suggestedPost.rejected == suggestedPost2.rejected;
    }

    private static TLRPC.InputReplyTo toInputReplyTo(int i, TLRPC.MessageReplyHeader messageReplyHeader) {
        if (messageReplyHeader instanceof TLRPC.TL_messageReplyStoryHeader) {
            TLRPC.TL_inputReplyToStory tL_inputReplyToStory = new TLRPC.TL_inputReplyToStory();
            tL_inputReplyToStory.peer = MessagesController.getInstance(i).getInputPeer(messageReplyHeader.peer);
            tL_inputReplyToStory.story_id = messageReplyHeader.story_id;
            return tL_inputReplyToStory;
        }
        if (!(messageReplyHeader instanceof TLRPC.TL_messageReplyHeader)) {
            return null;
        }
        TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
        tL_inputReplyToMessage.reply_to_msg_id = messageReplyHeader.reply_to_msg_id;
        if ((messageReplyHeader.flags & 1) != 0) {
            TLRPC.InputPeer inputPeer = MessagesController.getInstance(i).getInputPeer(messageReplyHeader.reply_to_peer_id);
            tL_inputReplyToMessage.reply_to_peer_id = inputPeer;
            if (inputPeer != null) {
                tL_inputReplyToMessage.flags |= 2;
            }
        }
        int i2 = messageReplyHeader.flags;
        if ((i2 & 2) != 0) {
            tL_inputReplyToMessage.flags |= 1;
            tL_inputReplyToMessage.top_msg_id = messageReplyHeader.reply_to_top_id;
        }
        if ((i2 & 64) != 0) {
            tL_inputReplyToMessage.flags |= 4;
            tL_inputReplyToMessage.quote_text = messageReplyHeader.quote_text;
        }
        if ((i2 & 128) != 0) {
            tL_inputReplyToMessage.flags |= 8;
            tL_inputReplyToMessage.quote_entities = messageReplyHeader.quote_entities;
        }
        return tL_inputReplyToMessage;
    }

    private TL_iv.TL_inputRichMessage toInputRichMessage(TL_iv.RichMessage richMessage) {
        TL_iv.TL_inputRichMessage tL_inputRichMessage = new TL_iv.TL_inputRichMessage();
        tL_inputRichMessage.rtl = richMessage.rtl;
        tL_inputRichMessage.blocks = new ArrayList<>(richMessage.blocks.size());
        for (int i = 0; i < richMessage.blocks.size(); i++) {
            tL_inputRichMessage.blocks.add(SendMessagesHelper.toInputPageBlock(richMessage.blocks.get(i)));
        }
        ArrayList<TLRPC.Photo> arrayList = richMessage.photos;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i2 = 0; i2 < richMessage.photos.size(); i2++) {
                TLRPC.Photo photo = richMessage.photos.get(i2);
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                tL_inputPhoto.id = photo.id;
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
            for (int i3 = 0; i3 < richMessage.documents.size(); i3++) {
                TLRPC.Document document = richMessage.documents.get(i3);
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.id = document.id;
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

    private void toggleStickerSetInternal(final Context context, int i, final BaseFragment baseFragment, final FrameLayout frameLayout, final boolean z, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final int i2, final boolean z2) {
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
        long j = stickerSet.id;
        tL_inputStickerSetID.id = j;
        if (i == 0) {
            markSetUninstalling(j, true);
            TLRPC.TL_messages_uninstallStickerSet tL_messages_uninstallStickerSet = new TLRPC.TL_messages_uninstallStickerSet();
            tL_messages_uninstallStickerSet.stickerset = tL_inputStickerSetID;
            getConnectionsManager().sendRequest(tL_messages_uninstallStickerSet, new FileLoadOperation$$ExternalSyntheticLambda5(this, stickerSet, i2));
            return;
        }
        TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
        tL_messages_installStickerSet.stickerset = tL_inputStickerSetID;
        tL_messages_installStickerSet.archived = i == 1;
        markSetInstalling(stickerSet.id, true);
        getConnectionsManager().sendRequest(tL_messages_installStickerSet, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                this.f$0.lambda$toggleStickerSetInternal$114(stickerSet, baseFragment, z, i2, z2, frameLayout, context, tLObject, document, tLObject2, tL_error);
            }
        });
    }

    private void updateEmojiStatuses(int i, TL_account.TL_emojiStatuses tL_emojiStatuses) {
        getMessagesStorage().getStorageQueue().postRunnable(new FileLoader$$ExternalSyntheticLambda5(this, i, tL_emojiStatuses, 8));
    }

    private void updateSearchResults() {
        MessageObject messageObject;
        ArrayList arrayList = new ArrayList(this.searchResultMessages);
        this.searchResultMessages.clear();
        HashSet hashSet = new HashSet();
        int i = 0;
        while (true) {
            MessageObject messageObject2 = null;
            if (i >= this.searchServerResultMessages.size()) {
                break;
            }
            MessageObject messageObject3 = this.searchServerResultMessages.get(i);
            if ((!messageObject3.hasValidGroupId() || messageObject3.isPrimaryGroupMessage) && !hashSet.contains(Integer.valueOf(messageObject3.getId()))) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (((MessageObject) arrayList.get(i2)).getId() == messageObject3.getId()) {
                        messageObject2 = (MessageObject) arrayList.get(i2);
                        break;
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
            i++;
        }
        for (int i3 = 0; i3 < this.searchLocalResultMessages.size(); i3++) {
            MessageObject messageObject4 = this.searchLocalResultMessages.get(i3);
            if (!hashSet.contains(Integer.valueOf(messageObject4.getId()))) {
                int i4 = 0;
                while (true) {
                    if (i4 >= arrayList.size()) {
                        messageObject = null;
                        break;
                    } else {
                        if (((MessageObject) arrayList.get(i4)).getId() == messageObject4.getId()) {
                            messageObject = (MessageObject) arrayList.get(i4);
                            break;
                        }
                        i4++;
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
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new MediaDataController$$ExternalSyntheticLambda10(this, str, 0));
    }

    public void addNewStickerSet(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        if (this.stickerSetsById.indexOfKey(tL_messages_stickerSet.set.id) >= 0 || this.stickerSetsByName.containsKey(tL_messages_stickerSet.set.short_name)) {
            return;
        }
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        int i = stickerSet.masks ? 1 : stickerSet.emojis ? 5 : 0;
        this.stickerSets[i].add(0, tL_messages_stickerSet);
        this.stickerSetsById.put(tL_messages_stickerSet, tL_messages_stickerSet.set.id);
        this.installedStickerSetsById.put(tL_messages_stickerSet, tL_messages_stickerSet.set.id);
        this.stickerSetsByName.put(tL_messages_stickerSet.set.short_name, tL_messages_stickerSet);
        LongSparseArray longSparseArray = new LongSparseArray();
        for (int i2 = 0; i2 < tL_messages_stickerSet.documents.size(); i2++) {
            TLRPC.Document document = tL_messages_stickerSet.documents.get(i2);
            longSparseArray.put(document, document.id);
        }
        for (int i3 = 0; i3 < tL_messages_stickerSet.packs.size(); i3++) {
            TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i3);
            String strReplace = tL_stickerPack.emoticon.replace("️", "");
            tL_stickerPack.emoticon = strReplace;
            ArrayList<TLRPC.Document> arrayList = this.allStickers.get(strReplace);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.allStickers.put(tL_stickerPack.emoticon, arrayList);
            }
            for (int i4 = 0; i4 < tL_stickerPack.documents.size(); i4++) {
                Long l = tL_stickerPack.documents.get(i4);
                if (this.stickersByEmoji.indexOfKey(l.longValue()) < 0) {
                    this.stickersByEmoji.put(tL_stickerPack.emoticon, l.longValue());
                }
                TLRPC.Document document2 = (TLRPC.Document) longSparseArray.get(l.longValue());
                if (document2 != null) {
                    arrayList.add(document2);
                }
            }
        }
        this.loadHash[i] = calcStickersHash(this.stickerSets[i]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i), Boolean.TRUE);
        loadStickers(i, false, true);
    }

    public void addRecentGif(TLRPC.Document document, int i, boolean z) {
        if (document == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= this.recentGifs.size()) {
                this.recentGifs.add(0, document);
                break;
            }
            TLRPC.Document document2 = this.recentGifs.get(i2);
            if (document2.id == document.id) {
                this.recentGifs.remove(i2);
                this.recentGifs.add(0, document2);
                break;
            }
            i2++;
        }
        if ((this.recentGifs.size() > getMessagesController().savedGifsLimitDefault && !UserConfig.getInstance(this.currentAccount).isPremium()) || this.recentGifs.size() > getMessagesController().savedGifsLimitPremium) {
            getMessagesStorage().getStorageQueue().postRunnable(new MediaDataController$$ExternalSyntheticLambda39(0, this, (TLRPC.Document) DiffUtil.m(this.recentGifs)));
            if (z) {
                AndroidUtilities.runOnUIThread(new ANRDetector$$ExternalSyntheticLambda0(document, 26));
            }
        }
        ArrayList<TLRPC.Document> arrayList = new ArrayList<>();
        arrayList.add(document);
        processLoadedRecentDocuments(0, arrayList, true, i, false);
    }

    public void addRecentSticker(int i, Object obj, TLRPC.Document document, int i2, boolean z) {
        int i3;
        int i4 = 2;
        int i5 = 1;
        if (i != 3) {
            if (MessageObject.isStickerDocument(document) || MessageObject.isAnimatedStickerDocument(document, true)) {
                int i6 = 0;
                while (true) {
                    if (i6 >= this.recentStickers[i].size()) {
                        if (!z) {
                            this.recentStickers[i].add(0, document);
                            break;
                        }
                        break;
                    }
                    TLRPC.Document document2 = this.recentStickers[i].get(i6);
                    if (document2.id == document.id) {
                        this.recentStickers[i].remove(i6);
                        if (!z) {
                            this.recentStickers[i].add(0, document2);
                            break;
                        }
                        break;
                    }
                    i6++;
                }
                if (i == 2) {
                    if (z) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 0, document, 4);
                    } else {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 0, document, Integer.valueOf(this.recentStickers[i].size() > getMessagesController().maxFaveStickersCount ? 6 : 5));
                    }
                    TLRPC.TL_messages_faveSticker tL_messages_faveSticker = new TLRPC.TL_messages_faveSticker();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_messages_faveSticker.id = tL_inputDocument;
                    tL_inputDocument.id = document.id;
                    tL_inputDocument.access_hash = document.access_hash;
                    byte[] bArr = document.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    tL_messages_faveSticker.unfave = z;
                    getConnectionsManager().sendRequest(tL_messages_faveSticker, new MessagesController$$ExternalSyntheticLambda30(this, obj, tL_messages_faveSticker, i5));
                    i3 = getMessagesController().maxFaveStickersCount;
                } else {
                    if (i == 0 && z) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 0, document, 3);
                        TLRPC.TL_messages_saveRecentSticker tL_messages_saveRecentSticker = new TLRPC.TL_messages_saveRecentSticker();
                        TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                        tL_messages_saveRecentSticker.id = tL_inputDocument2;
                        tL_inputDocument2.id = document.id;
                        tL_inputDocument2.access_hash = document.access_hash;
                        byte[] bArr2 = document.file_reference;
                        tL_inputDocument2.file_reference = bArr2;
                        if (bArr2 == null) {
                            tL_inputDocument2.file_reference = new byte[0];
                        }
                        tL_messages_saveRecentSticker.unsave = true;
                        getConnectionsManager().sendRequest(tL_messages_saveRecentSticker, new MessagesController$$ExternalSyntheticLambda30(this, obj, tL_messages_saveRecentSticker, i4));
                    }
                    i3 = getMessagesController().maxRecentStickersCount;
                }
                if (this.recentStickers[i].size() > i3 || z) {
                    getMessagesStorage().getStorageQueue().postRunnable(new FileLoader$$ExternalSyntheticLambda5(this, i, z ? document : (TLRPC.Document) DiffUtil.m(this.recentStickers[i]), 7));
                }
                if (!z) {
                    ArrayList<TLRPC.Document> arrayList = new ArrayList<>();
                    arrayList.add(document);
                    processLoadedRecentDocuments(i, arrayList, false, i2, false);
                }
                if (i == 2 || (i == 0 && z)) {
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.recentDocumentsDidLoad, Boolean.FALSE, Integer.valueOf(i));
                }
            }
        }
    }

    public void addStyle(int i, int i2, int i3, ArrayList<TLRPC.MessageEntity> arrayList) {
        if ((i & 256) != 0) {
            arrayList.add(setEntityStartEnd(new TLRPC.TL_messageEntitySpoiler(), i2, i3));
        }
        if ((i & 1) != 0) {
            arrayList.add(setEntityStartEnd(new TLRPC.TL_messageEntityBold(), i2, i3));
        }
        if ((i & 2) != 0) {
            arrayList.add(setEntityStartEnd(new TLRPC.TL_messageEntityItalic(), i2, i3));
        }
        if ((i & 4) != 0) {
            arrayList.add(setEntityStartEnd(new TLRPC.TL_messageEntityCode(), i2, i3));
        }
        if ((i & 8) != 0) {
            arrayList.add(setEntityStartEnd(new TLRPC.TL_messageEntityStrike(), i2, i3));
        }
        if ((i & 16) != 0) {
            arrayList.add(setEntityStartEnd(new TLRPC.TL_messageEntityUnderline(), i2, i3));
        }
    }

    public void applyAttachMenuBot(TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot) {
        this.attachMenuBots.bots.add(tL_attachMenuBotsBot.bot);
        loadAttachMenuBots(false, true);
    }

    public boolean areAllTrendingStickerSetsUnread(boolean z) {
        int size = this.featuredStickerSets[z ? 1 : 0].size();
        for (int i = 0; i < size; i++) {
            TLRPC.StickerSetCovered stickerSetCovered = this.featuredStickerSets[z ? 1 : 0].get(i);
            if (!isStickerPackInstalled(stickerSetCovered.set.id) && ((!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) && !this.unreadStickerSets[z ? 1 : 0].contains(Long.valueOf(stickerSetCovered.set.id)))) {
                return false;
            }
        }
        return true;
    }

    public boolean areStickersLoaded(int i) {
        return this.stickersLoaded[i];
    }

    public void beginTransaction() {
        this.inTransaction = true;
    }

    public boolean botInAttachMenu(long j) {
        for (int i = 0; i < this.attachMenuBots.bots.size(); i++) {
            if (this.attachMenuBots.bots.get(i).bot_id == j) {
                return true;
            }
        }
        return false;
    }

    public void buildShortcuts() {
        int i = Build.VERSION.SDK_INT;
        if (i < 23) {
            return;
        }
        Context context = ApplicationLoader.applicationContext;
        context.getClass();
        int maxShortcutCountPerActivity = (i >= 25 ? ShortcutManagerCompat$$ExternalSyntheticApiModelOutline0.m(context.getSystemService(ShortcutManagerCompat$$ExternalSyntheticApiModelOutline0.m())).getMaxShortcutCountPerActivity() : 5) - 2;
        int i2 = maxShortcutCountPerActivity > 0 ? maxShortcutCountPerActivity : 5;
        ArrayList arrayList = new ArrayList();
        if (SharedConfig.passcodeHash.length() <= 0) {
            for (int i3 = 0; i3 < this.hints.size(); i3++) {
                arrayList.add(this.hints.get(i3));
                if (arrayList.size() == i2 - 2) {
                    break;
                }
            }
        }
        Utilities.globalQueue.postRunnable(new FileLoader$$ExternalSyntheticLambda11(this, Build.VERSION.SDK_INT >= 30, arrayList, 4));
    }

    public void calcNewHash(int i) {
        this.loadHash[i] = calcStickersHash(this.stickerSets[i]);
    }

    public boolean canAddStickerToFavorites() {
        return (this.stickersLoaded[0] && this.stickerSets[0].size() < 5 && this.recentStickers[2].isEmpty()) ? false : true;
    }

    public boolean canCreateAttachedMenuBotShortcut(long j) {
        return true;
    }

    public boolean cancelRemovingStickerSet(long j) {
        Runnable runnable = (Runnable) this.removingStickerSetsUndos.get(j);
        if (runnable == null) {
            return false;
        }
        runnable.run();
        return true;
    }

    public void cancelSearchStickers(SearchStickersKey searchStickersKey) {
        Integer numRemove;
        if (searchStickersKey == null || (numRemove = this.loadingSearchStickersKeys.remove(searchStickersKey)) == null || numRemove.intValue() == 0) {
            return;
        }
        getConnectionsManager().cancelRequest(numRemove.intValue(), true);
    }

    public void checkAllMedia(boolean z) {
        if (z) {
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
        if (this.loadingDefaultTopicIcons || System.currentTimeMillis() - getUserConfig().lastUpdatedDefaultTopicIcons < 86400000) {
            return;
        }
        this.loadingDefaultTopicIcons = true;
        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
        tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetEmojiDefaultTopicIcons();
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new MediaDataController$$ExternalSyntheticLambda19(this, 7));
    }

    public void checkFeaturedEmoji() {
        if (this.loadingFeaturedStickers[1]) {
            return;
        }
        if (!this.featuredStickersLoaded[1] || Math.abs((System.currentTimeMillis() / 1000) - ((long) this.loadFeaturedDate[1])) >= 3600) {
            loadFeaturedStickers(true, true);
        }
    }

    public void checkFeaturedStickers() {
        if (this.loadingFeaturedStickers[0]) {
            return;
        }
        if (!this.featuredStickersLoaded[0] || Math.abs((System.currentTimeMillis() / 1000) - ((long) this.loadFeaturedDate[0])) >= 3600) {
            loadFeaturedStickers(false, true);
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
        if (this.loadingGenericAnimations || System.currentTimeMillis() - getUserConfig().lastUpdatedGenericAnimations < 86400000) {
            return;
        }
        this.loadingGenericAnimations = true;
        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
        tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetEmojiGenericAnimations();
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new MediaDataController$$ExternalSyntheticLambda19(this, 1));
    }

    public void checkMenuBots(boolean z) {
        if (this.isLoadingMenuBots) {
            return;
        }
        if ((!z || this.menuBotsUpdatedLocal) && Math.abs((System.currentTimeMillis() / 1000) - ((long) this.menuBotsUpdateDate)) < 3600) {
            return;
        }
        loadAttachMenuBots(true, false);
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
        if (this.loadingPremiumGiftStickers || System.currentTimeMillis() - getUserConfig().lastUpdatedPremiumGiftsStickerPack < 86400000) {
            return;
        }
        this.loadingPremiumGiftStickers = true;
        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
        tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetPremiumGifts();
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new MediaDataController$$ExternalSyntheticLambda19(this, 5));
    }

    public void checkPremiumPromo() {
        if (this.isLoadingPremiumPromo) {
            return;
        }
        if (this.premiumPromo == null || Math.abs((System.currentTimeMillis() / 1000) - ((long) this.premiumPromoUpdateDate)) >= 3600) {
            loadPremiumPromo(true);
        }
    }

    public void checkReactions() {
        if (this.isLoadingReactions || Math.abs((System.currentTimeMillis() / 1000) - ((long) this.reactionsUpdateDate)) < 3600) {
            return;
        }
        loadReactions(true, null);
    }

    public void checkRingtones(boolean z) {
        this.ringtoneDataStore.loadUserRingtones(z);
    }

    public void checkStickers(int i) {
        if (this.loadingStickers[i]) {
            return;
        }
        if (!this.stickersLoaded[i] || Math.abs((System.currentTimeMillis() / 1000) - ((long) this.loadDate[i])) >= 3600) {
            loadStickers(i, true, false);
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
        if (this.loadingPremiumTonStickers || System.currentTimeMillis() - getUserConfig().lastUpdatedTonGiftsStickerPack < 86400000) {
            return;
        }
        this.loadingPremiumTonStickers = true;
        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
        tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetTonGifts();
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new MediaDataController$$ExternalSyntheticLambda19(this, 9));
    }

    public void cleanDraft(long j, long j2, boolean z) {
        LongSparseArray longSparseArray = (LongSparseArray) this.drafts.get(j);
        TLRPC.DraftMessage draftMessage = longSparseArray != null ? (TLRPC.DraftMessage) longSparseArray.get(j2) : null;
        if (draftMessage == null) {
            return;
        }
        if (z) {
            TLRPC.InputReplyTo inputReplyTo = draftMessage.reply_to;
            if (inputReplyTo == null || inputReplyTo.reply_to_msg_id != 0) {
                if (inputReplyTo != null) {
                    inputReplyTo.reply_to_msg_id = 0;
                }
                draftMessage.flags &= -2;
                saveDraft(j, j2, draftMessage.message, draftMessage.entities, null, null, null, 0L, draftMessage.no_webpage, true);
                return;
            }
            return;
        }
        LongSparseArray longSparseArray2 = (LongSparseArray) this.drafts.get(j);
        if (longSparseArray2 != null) {
            longSparseArray2.remove(j2);
            if (longSparseArray2.size() == 0) {
                this.drafts.remove(j);
            }
        }
        LongSparseArray longSparseArray3 = (LongSparseArray) this.draftMessages.get(j);
        if (longSparseArray3 != null) {
            longSparseArray3.remove(j2);
            if (longSparseArray3.size() == 0) {
                this.draftMessages.remove(j);
            }
        }
        if (j2 != 0) {
            SharedPreferences.Editor editorEdit = this.draftPreferences.edit();
            StringBuilder sbM = AacUtil.m(j, "t_", "_");
            sbM.append(j2);
            SharedPreferences.Editor editorRemove = editorEdit.remove(sbM.toString());
            StringBuilder sbM2 = AacUtil.m(j, "rt_", "_");
            sbM2.append(j2);
            editorRemove.remove(sbM2.toString()).commit();
            return;
        }
        this.draftPreferences.edit().remove("" + j).remove("r_" + j).commit();
        getMessagesController().sortDialogs(null);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
    }

    public void cleanup() {
        int i = 0;
        while (true) {
            ArrayList<TLRPC.Document>[] arrayListArr = this.recentStickers;
            if (i >= arrayListArr.length) {
                break;
            }
            ArrayList<TLRPC.Document> arrayList = arrayListArr[i];
            if (arrayList != null) {
                arrayList.clear();
            }
            this.loadingRecentStickers[i] = false;
            this.recentStickersLoaded[i] = false;
            i++;
        }
        for (int i2 = 0; i2 < 4; i2++) {
            this.loadHash[i2] = 0;
            this.loadDate[i2] = 0;
            this.stickerSets[i2].clear();
            this.loadingStickers[i2] = false;
            this.stickersLoaded[i2] = false;
        }
        this.loadingPinnedMessages.clear();
        int[] iArr = this.loadFeaturedDate;
        iArr[0] = 0;
        long[] jArr = this.loadFeaturedHash;
        jArr[0] = 0;
        iArr[1] = 0;
        jArr[1] = 0;
        this.allStickers.clear();
        this.allStickersFeatured.clear();
        this.stickersByEmoji.clear();
        this.featuredStickerSetsById[0].clear();
        this.featuredStickerSets[0].clear();
        this.featuredStickerSetsById[1].clear();
        this.featuredStickerSets[1].clear();
        this.unreadStickerSets[0].clear();
        this.unreadStickerSets[1].clear();
        this.recentGifs.clear();
        this.stickerSetsById.clear();
        this.installedStickerSetsById.clear();
        this.stickerSetsByName.clear();
        this.diceStickerSetsByEmoji.clear();
        this.diceEmojiStickerSetsById.clear();
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
            Utilities.globalQueue.postRunnable(new Emoji$$ExternalSyntheticLambda1(14));
        }
        this.verifyingMessages.clear();
        this.loading = false;
        this.loaded = false;
        this.hints.clear();
        this.inlineBots.clear();
        this.guestBots.clear();
        this.webapps.clear();
        AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda3(this, 10));
        this.drafts.clear();
        this.draftMessages.clear();
        this.draftPreferences.edit().clear().apply();
        this.botInfos.clear();
        this.botKeyboards.clear();
        this.botKeyboardsByMids.clear();
    }

    public void clearAllDrafts(boolean z) {
        this.drafts.clear();
        this.draftMessages.clear();
        this.draftsFolderIds.clear();
        this.draftPreferences.edit().clear().commit();
        if (z) {
            getMessagesController().sortDialogs(null);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
        }
    }

    public void clearBotKeyboard(MessagesStorage.TopicKey topicKey, ArrayList<Integer> arrayList) {
        AndroidUtilities.runOnUIThread(new FileLoader$$ExternalSyntheticLambda0(this, arrayList, topicKey, 29));
    }

    public void clearDraftsFolderIds() {
        this.draftsFolderIds.clear();
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
        getMessagesStorage().getStorageQueue().postRunnable(new MediaDataController$$ExternalSyntheticLambda3(this, 5));
        return this.emojiStatuses[0];
    }

    public void clearRecentReactions() {
        this.recentReactions.clear();
        ApplicationLoader.applicationContext.getSharedPreferences("recent_reactions_" + this.currentAccount, 0).edit().clear().apply();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_messages_clearRecentReactions(), new RequestDelegate() {
            @Override
            public void run(TLObject tLObject, TLRPC.TL_error tL_error) {
            }
        });
    }

    public void clearRecentStickers() {
        getConnectionsManager().sendRequest(new TLRPC.TL_messages_clearRecentStickers(), new MediaDataController$$ExternalSyntheticLambda19(this, 2));
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
        getMessagesStorage().getStorageQueue().postRunnable(new MediaDataController$$ExternalSyntheticLambda3(this, 15));
        buildShortcuts();
    }

    public boolean containsTopPeer(long j) {
        for (int i = 0; i < this.hints.size(); i++) {
            if (DialogObject.getPeerDialogId(this.hints.get(i).peer) == j) {
                return true;
            }
        }
        return false;
    }

    public void endTransaction() {
        this.inTransaction = false;
    }

    public void fetchEmojiStatuses(int i, boolean z) {
        TLObject tLObject;
        boolean[] zArr = this.emojiStatusesFetching;
        if (zArr[i]) {
            return;
        }
        zArr[i] = true;
        if (z) {
            getMessagesStorage().getStorageQueue().postRunnable(new MediaDataController$$ExternalSyntheticLambda21(this, i, 0));
            return;
        }
        if (i == 0) {
            TL_account.getRecentEmojiStatuses getrecentemojistatuses = new TL_account.getRecentEmojiStatuses();
            getrecentemojistatuses.hash = this.emojiStatusesHash[i];
            tLObject = getrecentemojistatuses;
        } else if (i == 1) {
            TL_account.getDefaultEmojiStatuses getdefaultemojistatuses = new TL_account.getDefaultEmojiStatuses();
            getdefaultemojistatuses.hash = this.emojiStatusesHash[i];
            tLObject = getdefaultemojistatuses;
        } else {
            TL_account.getChannelDefaultEmojiStatuses getchanneldefaultemojistatuses = new TL_account.getChannelDefaultEmojiStatuses();
            getchanneldefaultemojistatuses.hash = this.emojiStatusesHash[i];
            tLObject = getchanneldefaultemojistatuses;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLObject, new MediaDataController$$ExternalSyntheticLambda22(this, i, 0));
    }

    public void fetchNewEmojiKeywords(String[] strArr) {
        fetchNewEmojiKeywords(strArr, false);
    }

    public void fillWithAnimatedEmoji(ArrayList<KeywordResult> arrayList, Integer num, boolean z, boolean z2, boolean z3, Runnable runnable) {
        if (arrayList == null || arrayList.isEmpty()) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        ArrayList[] arrayListArr = {getStickerSets(5)};
        MessagesController$$ExternalSyntheticLambda69 messagesController$$ExternalSyntheticLambda69 = new MessagesController$$ExternalSyntheticLambda69(this, num, arrayList, z2, z, arrayListArr, runnable);
        ArrayList arrayList2 = arrayListArr[0];
        if ((arrayList2 != null && !arrayList2.isEmpty()) || this.triedLoadingEmojipacks) {
            messagesController$$ExternalSyntheticLambda69.run();
            return;
        }
        this.triedLoadingEmojipacks = true;
        boolean[] zArr = new boolean[1];
        AndroidUtilities.runOnUIThread(new ImageLoader$$ExternalSyntheticLambda10(this, zArr, arrayListArr, messagesController$$ExternalSyntheticLambda69, 18));
        AndroidUtilities.runOnUIThread(new FileLog$$ExternalSyntheticLambda3(20, zArr, messagesController$$ExternalSyntheticLambda69), 900L);
    }

    public TLRPC.TL_attachMenuBot findBotInAttachMenu(long j) {
        for (int i = 0; i < this.attachMenuBots.bots.size(); i++) {
            if (this.attachMenuBots.bots.get(i).bot_id == j) {
                return this.attachMenuBots.bots.get(i);
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
            getMessagesStorage().getStorageQueue().postRunnable(new Utilities$$ExternalSyntheticLambda1(this, str, callback, 1));
        }
    }

    public void generateEmojiPreviewThemes(ArrayList<TLRPC.TL_theme> arrayList, int i) {
        SharedPreferences.Editor editorEdit = ApplicationLoader.applicationContext.getSharedPreferences("emojithemes_config_" + i, 0).edit();
        editorEdit.putInt("count", arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            TLRPC.TL_theme tL_theme = arrayList.get(i2);
            SerializedData serializedData = new SerializedData(tL_theme.getObjectSize());
            tL_theme.serializeToStream(serializedData);
            editorEdit.putString("theme_" + i2, Utilities.bytesToHex(serializedData.toByteArray()));
        }
        editorEdit.apply();
        if (arrayList.isEmpty()) {
            this.defaultEmojiThemes.clear();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.emojiPreviewThemesChanged, new Object[0]);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new ChatThemeBottomSheet.ChatThemeItem(EmojiThemes.createHomePreviewTheme(i)));
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            TLRPC.TL_theme tL_theme2 = arrayList.get(i3);
            EmojiThemes emojiThemes = new EmojiThemes(i);
            String str = tL_theme2.emoticon;
            emojiThemes.emoji = str;
            emojiThemes.key = new ThemeKey(str, null);
            emojiThemes.chatTheme = TLRPC.ChatTheme.ofEmoticon(str);
            for (int i4 = 0; i4 < tL_theme2.settings.size(); i4++) {
                EmojiThemes.ThemeItem themeItem = new EmojiThemes.ThemeItem();
                themeItem.tlTheme = tL_theme2;
                themeItem.settingsIndex = i4;
                emojiThemes.items.add(themeItem);
            }
            ChatThemeBottomSheet.ChatThemeItem chatThemeItem = new ChatThemeBottomSheet.ChatThemeItem(emojiThemes);
            if (emojiThemes.items.size() >= 4) {
                arrayList2.add(chatThemeItem);
            }
        }
        ChatThemeController.chatThemeQueue.postRunnable(new AnonymousClass3(arrayList2, i));
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
            }
        } else {
            Utilities.searchQueue.postRunnable(new ImageLoader$$ExternalSyntheticLambda10(str, getStickerSets(5), getFeaturedEmojiSets(), callback));
        }
    }

    public int getArchivedStickersCount(int i) {
        return this.archivedStickersCount[i];
    }

    public TLRPC.TL_attachMenuBots getAttachMenuBots() {
        return this.attachMenuBots;
    }

    public TL_bots.BotInfo getBotInfoCached(long j, long j2) {
        return this.botInfos.get(j + "_" + j2);
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
        if (string == null || (getReactionsMap().get(string) == null && !string.startsWith("animated_"))) {
            return getReactionsList().get(0).reaction;
        }
        this.doubleTapReaction = string;
        return string;
    }

    public TLRPC.DraftMessage getDraft(long j, long j2) {
        LongSparseArray longSparseArray = (LongSparseArray) this.drafts.get(j);
        if (longSparseArray == null) {
            return null;
        }
        return (TLRPC.DraftMessage) longSparseArray.get(j2);
    }

    public int getDraftFolderId(long j) {
        return ((Integer) this.draftsFolderIds.get(0, j)).intValue();
    }

    public TLRPC.Message getDraftMessage(long j, long j2) {
        LongSparseArray longSparseArray = (LongSparseArray) this.draftMessages.get(j);
        if (longSparseArray == null) {
            return null;
        }
        return (TLRPC.Message) longSparseArray.get(j2);
    }

    public DraftVoice getDraftVoice(long j, long j2) {
        loadDraftVoiceMessages();
        return (DraftVoice) this.draftVoices.get(Objects.hash(Long.valueOf(j), Long.valueOf(j2)));
    }

    public LongSparseArray getDrafts() {
        return this.drafts;
    }

    public TLRPC.Document getEmojiAnimatedSticker(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String strReplace = charSequence.toString().replace("️", "");
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = getStickerSets(4);
        int size = stickerSets.size();
        for (int i = 0; i < size; i++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i);
            int size2 = tL_messages_stickerSet.packs.size();
            for (int i2 = 0; i2 < size2; i2++) {
                TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i2);
                if (!tL_stickerPack.documents.isEmpty() && TextUtils.equals(tL_stickerPack.emoticon, strReplace)) {
                    return (TLRPC.Document) getStickerByIds(4).get(tL_stickerPack.documents.get(0).longValue());
                }
            }
        }
        return null;
    }

    public String getEmojiForSticker(long j) {
        String str = (String) this.stickersByEmoji.get(j);
        return str != null ? str : "";
    }

    public void getEmojiNames(String[] strArr, String str, Utilities.Callback<ArrayList<String>> callback) {
        if (callback == null || str == null) {
            return;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new ImageLoader$$ExternalSyntheticLambda10((BaseController) this, (Object) strArr, str, (Object) callback, 17));
    }

    public void getEmojiSuggestions(String[] strArr, String str, boolean z, KeywordResultCallback keywordResultCallback, boolean z2) {
        getEmojiSuggestions(strArr, str, z, keywordResultCallback, null, z2, false, false, null);
    }

    public List<TLRPC.TL_availableReaction> getEnabledReactionsList() {
        return this.enabledReactionsList;
    }

    public ArrayList<TLRPC.MessageEntity> getEntities(CharSequence[] charSequenceArr, boolean z) {
        return getEntities(charSequenceArr, z, true);
    }

    public ArrayList<TLRPC.StickerSetCovered> getFeaturedEmojiSets() {
        return this.featuredStickerSets[1];
    }

    public ArrayList<TLRPC.StickerSetCovered> getFeaturedStickerSets() {
        return this.featuredStickerSets[0];
    }

    public long getFeaturedStickersHashWithoutUnread(boolean z) {
        long jCalcHash = 0;
        for (int i = 0; i < this.featuredStickerSets[z ? 1 : 0].size(); i++) {
            TLRPC.StickerSet stickerSet = this.featuredStickerSets[z ? 1 : 0].get(i).set;
            if (!stickerSet.archived) {
                jCalcHash = calcHash(jCalcHash, stickerSet.id);
            }
        }
        return jCalcHash;
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
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.stickerSetsById.get(stickerSet.id);
        if (tL_messages_stickerSet == null) {
            tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.groupStickerSets.get(stickerSet.id);
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
        int i = 1;
        if (this.lastReturnedNum >= this.searchResultMessages.size() - 1) {
            boolean[] zArr = this.messagesSearchEndReached;
            if (zArr[0] && zArr[1]) {
                i = 0;
            }
        }
        return this.lastReturnedNum > 0 ? i | 2 : i;
    }

    public void getMediaCount(final long j, final long j2, final int i, final int i2, boolean z) {
        if (z || DialogObject.isEncryptedDialog(j)) {
            getMediaCountDatabase(j, j2, i, i2);
            return;
        }
        TLRPC.TL_messages_getSearchCounters tL_messages_getSearchCounters = new TLRPC.TL_messages_getSearchCounters();
        if (i == 0) {
            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterPhotoVideo());
        } else if (i == 1) {
            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterDocument());
        } else if (i == 2) {
            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterRoundVoice());
        } else if (i == 3) {
            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterUrl());
        } else if (i == 4) {
            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterMusic());
        } else if (i == 5) {
            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterGif());
        } else if (i == 8) {
            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterPoll());
        }
        if (j2 != 0) {
            if (j == getUserConfig().getClientUserId()) {
                tL_messages_getSearchCounters.saved_peer_id = getMessagesController().getInputPeer(j2);
                tL_messages_getSearchCounters.flags = 4 | tL_messages_getSearchCounters.flags;
            } else {
                tL_messages_getSearchCounters.top_msg_id = (int) j2;
                tL_messages_getSearchCounters.flags |= 1;
            }
        }
        TLRPC.InputPeer inputPeer = getMessagesController().getInputPeer(j);
        tL_messages_getSearchCounters.peer = inputPeer;
        if (inputPeer == null) {
            return;
        }
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getSearchCounters, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$getMediaCount$132(j, j2, i, i2, tLObject, tL_error);
            }
        }), i2);
    }

    public void getMediaCounts(long j, long j2, int i) {
        getMessagesStorage().getStorageQueue().postRunnable(new TopicsController$$ExternalSyntheticLambda2(this, j2, j, i, 1));
    }

    public Pair<Long, TLRPC.DraftMessage> getOneThreadDraft(long j) {
        LongSparseArray longSparseArray = (LongSparseArray) this.drafts.get(j);
        if (longSparseArray == null || longSparseArray.size() <= 0) {
            return null;
        }
        return new Pair<>(Long.valueOf(longSparseArray.keyAt(0)), longSparseArray.valueAt(0));
    }

    public Integer getPremiumHintAnnualDiscount(boolean z) {
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo;
        ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList;
        double d;
        ProductDetails productDetails;
        ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails;
        ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails2;
        double d2;
        int i;
        ProductDetails productDetails2;
        ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails3;
        if ((z && (!BillingController.getInstance().isReady() || BillingController.getInstance().getLastPremiumTransaction() == null)) || (tL_help_premiumPromo = this.premiumPromo) == null) {
            return null;
        }
        ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList2 = tL_help_premiumPromo.period_options;
        int size = arrayList2.size();
        double d3 = 0.0d;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < size) {
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = arrayList2.get(i2);
            i2++;
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption2 = tL_premiumSubscriptionOption;
            if (!z) {
                subscriptionOfferDetails2 = null;
                if (tL_premiumSubscriptionOption2.months == 1) {
                    if (BuildVars.useInvoiceBilling()) {
                        d2 = tL_premiumSubscriptionOption2.amount;
                        i = tL_premiumSubscriptionOption2.months;
                    } else {
                        d2 = tL_premiumSubscriptionOption2.amount;
                        i = tL_premiumSubscriptionOption2.months;
                    }
                    d3 = d2 / ((double) i);
                    z2 = true;
                }
            } else if (tL_premiumSubscriptionOption2.current) {
                subscriptionOfferDetails2 = null;
                if (Objects.equals(tL_premiumSubscriptionOption2.transaction.replaceAll("^(.*?)(?:\\.\\.\\d*|)$", "$1"), BillingController.getInstance().getLastPremiumTransaction())) {
                    if (BuildVars.useInvoiceBilling() || (productDetails2 = BillingController.PREMIUM_PRODUCT_DETAILS) == null) {
                        d2 = tL_premiumSubscriptionOption2.amount;
                        i = tL_premiumSubscriptionOption2.months;
                    } else {
                        ArrayList arrayList3 = productDetails2.zzj;
                        int size2 = arrayList3.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size2) {
                                subscriptionOfferDetails3 = subscriptionOfferDetails2;
                                break;
                            }
                            Object obj = arrayList3.get(i3);
                            i3++;
                            subscriptionOfferDetails3 = (ProductDetails.SubscriptionOfferDetails) obj;
                            String str = ((ProductDetails.PricingPhase) subscriptionOfferDetails3.zzd.mControlCategories.get(0)).zzd;
                            int i4 = tL_premiumSubscriptionOption2.months;
                            if (i4 != 12) {
                                Locale locale = Locale.ROOT;
                                if (str.equals("P" + i4 + "M")) {
                                    break;
                                }
                            } else if (str.equals("P1Y")) {
                                break;
                            }
                        }
                        if (subscriptionOfferDetails3 == null) {
                            d2 = tL_premiumSubscriptionOption2.amount;
                            i = tL_premiumSubscriptionOption2.months;
                        } else {
                            d2 = ((ProductDetails.PricingPhase) subscriptionOfferDetails3.zzd.mControlCategories.get(0)).zzb;
                            i = tL_premiumSubscriptionOption2.months;
                        }
                    }
                    d3 = d2 / ((double) i);
                    z2 = true;
                }
            }
        }
        ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList4 = this.premiumPromo.period_options;
        int size3 = arrayList4.size();
        int i5 = 0;
        int i6 = 0;
        while (i5 < size3) {
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption3 = arrayList4.get(i5);
            i5++;
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption4 = tL_premiumSubscriptionOption3;
            if (z2 && tL_premiumSubscriptionOption4.months == 12) {
                if (BuildVars.useInvoiceBilling() || (productDetails = BillingController.PREMIUM_PRODUCT_DETAILS) == null) {
                    arrayList = arrayList4;
                    d = tL_premiumSubscriptionOption4.amount / ((double) tL_premiumSubscriptionOption4.months);
                } else {
                    ArrayList arrayList5 = productDetails.zzj;
                    int size4 = arrayList5.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size4) {
                            arrayList = arrayList4;
                            subscriptionOfferDetails = null;
                            break;
                        }
                        Object obj2 = arrayList5.get(i7);
                        i7++;
                        subscriptionOfferDetails = (ProductDetails.SubscriptionOfferDetails) obj2;
                        String str2 = ((ProductDetails.PricingPhase) subscriptionOfferDetails.zzd.mControlCategories.get(0)).zzd;
                        int i8 = tL_premiumSubscriptionOption4.months;
                        arrayList = arrayList4;
                        if (i8 != 12) {
                            Locale locale2 = Locale.ROOT;
                            if (str2.equals("P" + i8 + "M")) {
                                break;
                            }
                            arrayList4 = arrayList;
                        } else {
                            if (str2.equals("P1Y")) {
                                break;
                            }
                            arrayList4 = arrayList;
                        }
                    }
                    d = subscriptionOfferDetails == null ? tL_premiumSubscriptionOption4.amount / ((double) tL_premiumSubscriptionOption4.months) : ((ProductDetails.PricingPhase) subscriptionOfferDetails.zzd.mControlCategories.get(0)).zzb / ((double) tL_premiumSubscriptionOption4.months);
                }
                i6 = (int) ((1.0d - (d / d3)) * 100.0d);
            } else {
                arrayList = arrayList4;
                size3 = size3;
            }
            arrayList4 = arrayList;
            size3 = size3;
        }
        if (!z2 || i6 <= 0) {
            return null;
        }
        return Integer.valueOf(i6);
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

    public ArrayList<TLRPC.Document> getRecentStickers(int i) {
        return getRecentStickers(i, false);
    }

    public ArrayList<TLRPC.Document> getRecentStickersNoCopy(int i) {
        return this.recentStickers[i];
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

    public LongSparseArray getStickerByIds(int i) {
        return this.stickersByIds[i];
    }

    public TLRPC.TL_messages_stickerSet getStickerSet(TLRPC.StickerSet stickerSet, boolean z) {
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_inputStickerSetID.id = stickerSet.id;
        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
        return getStickerSet(tL_inputStickerSetID, z);
    }

    public TLRPC.TL_messages_stickerSet getStickerSetByEmojiOrName(String str) {
        return this.diceStickerSetsByEmoji.get(str);
    }

    public TLRPC.TL_messages_stickerSet getStickerSetById(long j) {
        return (TLRPC.TL_messages_stickerSet) this.stickerSetsById.get(j);
    }

    public TLRPC.TL_messages_stickerSet getStickerSetByName(String str) {
        if (str == null) {
            return null;
        }
        return this.stickerSetsByName.get(str.toLowerCase());
    }

    public String getStickerSetName(long j) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.stickerSetsById.get(j);
        if (tL_messages_stickerSet != null) {
            return tL_messages_stickerSet.set.short_name;
        }
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.featuredStickerSetsById[0].get(j);
        if (stickerSetCovered != null) {
            return stickerSetCovered.set.short_name;
        }
        TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) this.featuredStickerSetsById[1].get(j);
        if (stickerSetCovered2 != null) {
            return stickerSetCovered2.set.short_name;
        }
        return null;
    }

    public ArrayList<TLRPC.TL_messages_stickerSet> getStickerSets(int i) {
        return i == 3 ? this.stickerSets[2] : this.stickerSets[i];
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
        for (int i = 0; i < this.recentGifs.size(); i++) {
            TLRPC.Document document2 = this.recentGifs.get(i);
            if (document2.id == document.id) {
                this.recentGifs.remove(i);
                this.recentGifs.add(0, document2);
                return true;
            }
        }
        return false;
    }

    public void increaseGuestRating(long j) {
        increaseInlineRating(j, true);
    }

    public void increaseInlineRating(long j) {
        increaseInlineRating(j, false);
    }

    public void increasePeerRaiting(long j) {
        TLRPC.User user;
        if (!getUserConfig().suggestContacts || !DialogObject.isUserDialog(j) || (user = getMessagesController().getUser(Long.valueOf(j))) == null || user.bot || user.self) {
            return;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new MediaDataController$$ExternalSyntheticLambda60(this, j, 2));
    }

    public void increaseWebappRating(long j) {
        TLRPC.TL_topPeer tL_topPeer;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j));
        if (user == null || !user.bot) {
            return;
        }
        int iMax = getUserConfig().webappRatingLoadTime != 0 ? Math.max(1, ((int) (System.currentTimeMillis() / 1000)) - getUserConfig().webappRatingLoadTime) : 60;
        int i = 0;
        while (true) {
            if (i >= this.webapps.size()) {
                tL_topPeer = null;
                break;
            }
            tL_topPeer = this.webapps.get(i);
            if (tL_topPeer.peer.user_id == j) {
                break;
            } else {
                i++;
            }
        }
        if (tL_topPeer == null) {
            tL_topPeer = new TLRPC.TL_topPeer();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_topPeer.peer = tL_peerUser;
            tL_peerUser.user_id = j;
            this.webapps.add(tL_topPeer);
        }
        tL_topPeer.rating = Math.exp(iMax / getMessagesController().ratingDecay) + tL_topPeer.rating;
        Collections.sort(this.webapps, new Emoji$$ExternalSyntheticLambda0(9));
        if (this.webapps.size() > 20) {
            SurfaceContainer$$ExternalSyntheticOutline0.m5m(1, (ArrayList) this.webapps);
        }
        savePeer(j, 2, tL_topPeer.rating);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadWebappsHints, new Object[0]);
    }

    public void installShortcut(long j, int i) {
        installShortcut(j, i, null);
    }

    public boolean isLoadingStickers(int i) {
        return this.loadingStickers[i];
    }

    public boolean isMenuBotsUpdatedLocal() {
        return this.menuBotsUpdatedLocal;
    }

    public boolean isMessageFound(int i, boolean z) {
        return this.searchServerResultMessagesMap[z ? 1 : 0].indexOfKey(i) >= 0;
    }

    public boolean isSearchLoading() {
        return this.reqId != 0;
    }

    public boolean isShortcutAdded(long j, int i) {
        List listFromShortcuts;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            String str = (i == SHORTCUT_TYPE_USER_OR_CHAT ? "sdid_" : "bdid_") + j;
            Context context = ApplicationLoader.applicationContext;
            if (i2 >= 30) {
                listFromShortcuts = ShortcutInfoCompat.fromShortcuts(context, ShortcutManagerCompat$$ExternalSyntheticApiModelOutline0.m(context.getSystemService(ShortcutManagerCompat$$ExternalSyntheticApiModelOutline0.m())).getShortcuts(4));
            } else if (i2 >= 25) {
                ShortcutManager shortcutManagerM = ShortcutManagerCompat$$ExternalSyntheticApiModelOutline0.m(context.getSystemService(ShortcutManagerCompat$$ExternalSyntheticApiModelOutline0.m()));
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(shortcutManagerM.getPinnedShortcuts());
                listFromShortcuts = ShortcutInfoCompat.fromShortcuts(context, arrayList);
            } else {
                listFromShortcuts = Collections.EMPTY_LIST;
            }
            for (int i3 = 0; i3 < listFromShortcuts.size(); i3++) {
                if (((ShortcutInfoCompat) listFromShortcuts.get(i3)).mId.equals(str)) {
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
        for (int i = 0; i < this.recentStickers[2].size(); i++) {
            TLRPC.Document document2 = this.recentStickers[2].get(i);
            if (document2.id == document.id && document2.dc_id == document.dc_id) {
                return true;
            }
        }
        return false;
    }

    public boolean isStickerPackInstalled(long j) {
        return isStickerPackInstalled(j, true);
    }

    public boolean isStickerPackUnread(boolean z, long j) {
        return this.unreadStickerSets[z ? 1 : 0].contains(Long.valueOf(j));
    }

    public void jumpToSearchedMessage(int i, int i2) {
        if (i2 < 0 || i2 >= this.searchResultMessages.size()) {
            return;
        }
        this.lastReturnedNum = i2;
        MessageObject messageObject = this.searchResultMessages.get(i2);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatSearchResultsAvailable, Integer.valueOf(i), Integer.valueOf(messageObject.getId()), Integer.valueOf(getMask()), Long.valueOf(messageObject.getDialogId()), Integer.valueOf(this.lastReturnedNum), Integer.valueOf(getSearchCount()), Boolean.TRUE);
    }

    public void loadArchivedStickersCount(int i, boolean z) {
        int i2 = 1;
        if (!z) {
            TLRPC.TL_messages_getArchivedStickers tL_messages_getArchivedStickers = new TLRPC.TL_messages_getArchivedStickers();
            tL_messages_getArchivedStickers.limit = 0;
            tL_messages_getArchivedStickers.masks = i == 1;
            tL_messages_getArchivedStickers.emojis = i == 5;
            getConnectionsManager().sendRequest(tL_messages_getArchivedStickers, new MediaDataController$$ExternalSyntheticLambda22(this, i, i2));
            return;
        }
        int i3 = MessagesController.getNotificationsSettings(this.currentAccount).getInt("archivedStickersCount" + i, -1);
        if (i3 == -1) {
            loadArchivedStickersCount(i, false);
        } else {
            this.archivedStickersCount[i] = i3;
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.archivedStickersCountDidLoad, Integer.valueOf(i));
        }
    }

    public void loadAttachMenuBots(boolean z, boolean z2) {
        loadAttachMenuBots(z, z2, null);
    }

    public void loadBotInfo(long j, long j2, boolean z, int i) {
        loadBotInfo(j, j2, z, i, null);
    }

    public void loadBotKeyboard(MessagesStorage.TopicKey topicKey) {
        loadBotKeyboard(topicKey, false);
    }

    public void loadDraftsIfNeed() {
        if (getUserConfig().draftsLoaded || this.loadingDrafts) {
            return;
        }
        this.loadingDrafts = true;
        getConnectionsManager().sendRequest(new TLRPC.TL_messages_getAllDrafts(), new MediaDataController$$ExternalSyntheticLambda19(this, 6));
    }

    public void loadEmojiThemes() {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("emojithemes_config_" + this.currentAccount, 0);
        int i = sharedPreferences.getInt("count", 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ChatThemeBottomSheet.ChatThemeItem(EmojiThemes.createHomePreviewTheme(this.currentAccount)));
        for (int i2 = 0; i2 < i; i2++) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(sharedPreferences.getString("theme_" + i2, "")));
            try {
                TLRPC.TL_theme tL_themeTLdeserialize = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                EmojiThemes emojiThemes = new EmojiThemes(this.currentAccount);
                String str = tL_themeTLdeserialize.emoticon;
                emojiThemes.emoji = str;
                emojiThemes.key = new ThemeKey(str, null);
                emojiThemes.chatTheme = TLRPC.ChatTheme.ofEmoticon(str);
                for (int i3 = 0; i3 < tL_themeTLdeserialize.settings.size(); i3++) {
                    EmojiThemes.ThemeItem themeItem = new EmojiThemes.ThemeItem();
                    themeItem.tlTheme = tL_themeTLdeserialize;
                    themeItem.settingsIndex = i3;
                    emojiThemes.items.add(themeItem);
                }
                if (emojiThemes.items.size() >= 4) {
                    arrayList.add(new ChatThemeBottomSheet.ChatThemeItem(emojiThemes));
                }
                ChatThemeController.chatThemeQueue.postRunnable(new AnonymousClass2(arrayList));
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
    }

    public void loadFeaturedStickers(boolean z, boolean z2) {
        long j;
        TLObject tLObject;
        boolean[] zArr = this.loadingFeaturedStickers;
        if (zArr[z ? 1 : 0]) {
            return;
        }
        zArr[z ? 1 : 0] = true;
        if (z2) {
            getMessagesStorage().getStorageQueue().postRunnable(new MediaDataController$$ExternalSyntheticLambda30(this, z, 1));
            return;
        }
        if (z) {
            TLRPC.TL_messages_getFeaturedEmojiStickers tL_messages_getFeaturedEmojiStickers = new TLRPC.TL_messages_getFeaturedEmojiStickers();
            j = this.loadFeaturedHash[1];
            tL_messages_getFeaturedEmojiStickers.hash = j;
            tLObject = tL_messages_getFeaturedEmojiStickers;
        } else {
            TLRPC.TL_messages_getFeaturedStickers tL_messages_getFeaturedStickers = new TLRPC.TL_messages_getFeaturedStickers();
            j = this.loadFeaturedHash[0];
            tL_messages_getFeaturedStickers.hash = j;
            tLObject = tL_messages_getFeaturedStickers;
        }
        getConnectionsManager().sendRequest(tLObject, new MessagesController$$ExternalSyntheticLambda464(this, z, j, 1));
    }

    public void loadHints(boolean z) {
        if (this.loading || !getUserConfig().suggestContacts) {
            return;
        }
        if (z) {
            if (this.loaded) {
                return;
            }
            this.loading = true;
            getMessagesStorage().getStorageQueue().postRunnable(new MediaDataController$$ExternalSyntheticLambda3(this, 0));
            this.loaded = true;
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
        getConnectionsManager().sendRequestTyped(tL_contacts_getTopPeers, new AiTonesController$$ExternalSyntheticLambda0(), new AiTonesController$$ExternalSyntheticLambda1(this, 4));
    }

    public void loadMedia(final long j, final int i, final int i2, final int i3, final int i4, final long j2, int i5, final int i6, final int i7, ReactionsLayoutInBubble.VisibleReaction visibleReaction, String str) {
        MediaDataController mediaDataController;
        final boolean z;
        TLRPC.TL_messages_search tL_messages_search;
        if (DialogObject.isChatDialog(j)) {
            mediaDataController = this;
            z = ChatObject.isChannel(-j, mediaDataController.currentAccount);
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("load media did " + j + " count = " + i + " max_id " + i2 + " type = " + i4 + " cache = " + i5 + " classGuid = " + i6);
            }
            if ((i5 == 0 && TextUtils.isEmpty(str)) || DialogObject.isEncryptedDialog(j)) {
                mediaDataController.loadMediaDatabase(j, i, i2, i3, i4, j2, visibleReaction, i6, z, i5, i7);
            }
            tL_messages_search = new TLRPC.TL_messages_search();
            tL_messages_search.limit = i;
            if (i3 != 0) {
                tL_messages_search.offset_id = i3;
                tL_messages_search.add_offset = -i;
            } else {
                tL_messages_search.offset_id = i2;
            }
            if (visibleReaction != null) {
                tL_messages_search.flags |= 8;
                tL_messages_search.saved_reaction.add(visibleReaction.toTLReaction());
            }
            if (i4 == 0) {
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhotoVideo();
            } else if (i4 == 6) {
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhotos();
            } else if (i4 == 7) {
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterVideo();
            } else if (i4 == 1) {
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterDocument();
            } else if (i4 == 2) {
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterRoundVoice();
            } else if (i4 == 3) {
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterUrl();
            } else if (i4 == 4) {
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterMusic();
            } else if (i4 == 5) {
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterGif();
            } else if (i4 == 8) {
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPoll();
            }
            if (TextUtils.isEmpty(str)) {
                tL_messages_search.q = "";
            } else {
                tL_messages_search.q = str;
            }
            tL_messages_search.peer = getMessagesController().getInputPeer(j);
            if (j2 != 0) {
                if (j == getUserConfig().getClientUserId()) {
                    tL_messages_search.saved_peer_id = getMessagesController().getInputPeer(j2);
                    tL_messages_search.flags |= 4;
                } else {
                    tL_messages_search.top_msg_id = (int) j2;
                    tL_messages_search.flags |= 2;
                }
            }
            if (tL_messages_search.peer == null) {
                return;
            }
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$loadMedia$126(j, i3, i, i2, i4, j2, i6, z, i7, tLObject, tL_error);
                }
            }), i6);
            return;
        }
        mediaDataController = this;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("load media did " + j + " count = " + i + " max_id " + i2 + " type = " + i4 + " cache = " + i5 + " classGuid = " + i6);
        }
        if (i5 == 0) {
            tL_messages_search = new TLRPC.TL_messages_search();
            tL_messages_search.limit = i;
            if (i3 != 0) {
                tL_messages_search.offset_id = i3;
                tL_messages_search.add_offset = -i;
            } else {
                tL_messages_search.offset_id = i2;
            }
            if (visibleReaction != null) {
                tL_messages_search.flags |= 8;
                tL_messages_search.saved_reaction.add(visibleReaction.toTLReaction());
            }
            if (i4 == 0) {
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhotoVideo();
            } else if (i4 == 6) {
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhotos();
            } else if (i4 == 7) {
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterVideo();
            } else if (i4 == 1) {
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterDocument();
            } else if (i4 == 2) {
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterRoundVoice();
            } else if (i4 == 3) {
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterUrl();
            } else if (i4 == 4) {
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterMusic();
            } else if (i4 == 5) {
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterGif();
            } else if (i4 == 8) {
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPoll();
            }
            if (TextUtils.isEmpty(str)) {
                tL_messages_search.q = str;
            } else {
                tL_messages_search.q = "";
            }
            tL_messages_search.peer = getMessagesController().getInputPeer(j);
            if (j2 != 0) {
                if (j == getUserConfig().getClientUserId()) {
                    tL_messages_search.saved_peer_id = getMessagesController().getInputPeer(j2);
                    tL_messages_search.flags |= 4;
                } else {
                    tL_messages_search.top_msg_id = (int) j2;
                    tL_messages_search.flags |= 2;
                }
            }
            if (tL_messages_search.peer == null) {
                return;
            }
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$loadMedia$126(j, i3, i, i2, i4, j2, i6, z, i7, tLObject, tL_error);
                }
            }), i6);
            return;
        }
        tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = i;
        if (i3 != 0) {
            tL_messages_search.offset_id = i3;
            tL_messages_search.add_offset = -i;
        } else {
            tL_messages_search.offset_id = i2;
        }
        if (visibleReaction != null) {
            tL_messages_search.flags |= 8;
            tL_messages_search.saved_reaction.add(visibleReaction.toTLReaction());
        }
        if (i4 == 0) {
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhotoVideo();
        } else if (i4 == 6) {
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhotos();
        } else if (i4 == 7) {
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterVideo();
        } else if (i4 == 1) {
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterDocument();
        } else if (i4 == 2) {
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterRoundVoice();
        } else if (i4 == 3) {
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterUrl();
        } else if (i4 == 4) {
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterMusic();
        } else if (i4 == 5) {
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterGif();
        } else if (i4 == 8) {
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPoll();
        }
        if (TextUtils.isEmpty(str)) {
            tL_messages_search.q = str;
        } else {
            tL_messages_search.q = "";
        }
        tL_messages_search.peer = getMessagesController().getInputPeer(j);
        if (j2 != 0) {
            if (j == getUserConfig().getClientUserId()) {
                tL_messages_search.saved_peer_id = getMessagesController().getInputPeer(j2);
                tL_messages_search.flags |= 4;
            } else {
                tL_messages_search.top_msg_id = (int) j2;
                tL_messages_search.flags |= 2;
            }
        }
        if (tL_messages_search.peer == null) {
            return;
        }
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$loadMedia$126(j, i3, i, i2, i4, j2, i6, z, i7, tLObject, tL_error);
            }
        }), i6);
        return;
        mediaDataController.loadMediaDatabase(j, i, i2, i3, i4, j2, visibleReaction, i6, z, i5, i7);
    }

    public void loadMoreSearchMessages(boolean z) {
        if (this.loadingMoreSearchMessages || this.reqId != 0) {
            return;
        }
        boolean[] zArr = this.messagesSearchEndReached;
        if (zArr[0] && this.lastMergeDialogId == 0 && zArr[1]) {
            return;
        }
        int i = this.lastReturnedNum;
        this.lastReturnedNum = this.searchResultMessages.size();
        this.loadingMoreSearchMessages = true;
        searchMessagesInChat(null, this.lastDialogId, this.lastMergeDialogId, this.lastGuid, 1, this.lastReplyMessageId, false, this.lastSearchUser, this.lastSearchChat, false, this.lastReaction);
        this.lastReturnedNum = i;
    }

    public void loadMusic(long j, long j2, long j3) {
        getMessagesStorage().getStorageQueue().postRunnable(new BotGuardHelper$$ExternalSyntheticLambda0(this, j, j2, j3, 1));
    }

    public void loadPinnedMessages(final long j, final int i, final int i2) {
        if (this.loadingPinnedMessages.indexOfKey(j) >= 0) {
            return;
        }
        this.loadingPinnedMessages.put(Boolean.TRUE, j);
        final TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.peer = getMessagesController().getInputPeer(j);
        tL_messages_search.limit = 40;
        tL_messages_search.offset_id = i;
        tL_messages_search.q = "";
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPinned();
        getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$loadPinnedMessages$162(i2, tL_messages_search, j, i, tLObject, tL_error);
            }
        });
    }

    public void loadPremiumPromo(boolean z) {
        this.isLoadingPremiumPromo = true;
        if (z) {
            getMessagesStorage().getStorageQueue().postRunnable(new MediaDataController$$ExternalSyntheticLambda3(this, 7));
        } else {
            getConnectionsManager().sendRequest(new TLRPC.TL_help_getPremiumPromo(), new MediaDataController$$ExternalSyntheticLambda19(this, 3));
        }
    }

    public void loadReactions(boolean z, Integer num) {
        this.isLoadingReactions = true;
        if (z) {
            getMessagesStorage().getStorageQueue().postRunnable(new MediaDataController$$ExternalSyntheticLambda3(this, 11));
            return;
        }
        TLRPC.TL_messages_getAvailableReactions tL_messages_getAvailableReactions = new TLRPC.TL_messages_getAvailableReactions();
        tL_messages_getAvailableReactions.hash = num != null ? num.intValue() : this.reactionsUpdateHash;
        getConnectionsManager().sendRequest(tL_messages_getAvailableReactions, new MediaDataController$$ExternalSyntheticLambda19(this, 4));
    }

    public void loadRecentAndTopReactions(boolean z) {
        if (this.loadingRecentReactions) {
            return;
        }
        if (!this.loadedRecentReactions || z) {
            final SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("recent_reactions_" + this.currentAccount, 0);
            final SharedPreferences sharedPreferences2 = ApplicationLoader.applicationContext.getSharedPreferences("top_reactions_" + this.currentAccount, 0);
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
            final int i = 0;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getRecentReactions, new RequestDelegate(this) {
                public final MediaDataController f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i) {
                        case 0:
                            this.f$0.lambda$loadRecentAndTopReactions$236(sharedPreferences, zArr, tLObject, tL_error);
                            break;
                        default:
                            this.f$0.lambda$loadRecentAndTopReactions$238(sharedPreferences, zArr, tLObject, tL_error);
                            break;
                    }
                }
            });
            TLRPC.TL_messages_getTopReactions tL_messages_getTopReactions = new TLRPC.TL_messages_getTopReactions();
            tL_messages_getTopReactions.hash = sharedPreferences2.getLong("hash", 0L);
            tL_messages_getTopReactions.limit = 100;
            final int i2 = 1;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getTopReactions, new RequestDelegate(this) {
                public final MediaDataController f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i2) {
                        case 0:
                            this.f$0.lambda$loadRecentAndTopReactions$236(sharedPreferences2, zArr, tLObject, tL_error);
                            break;
                        default:
                            this.f$0.lambda$loadRecentAndTopReactions$238(sharedPreferences2, zArr, tLObject, tL_error);
                            break;
                    }
                }
            });
        }
    }

    public void loadRecents(int i, boolean z, boolean z2, boolean z3) {
        TLRPC.TL_messages_getStickers tL_messages_getStickers;
        TLObject tLObject;
        long j;
        if (!z) {
            boolean[] zArr = this.loadingRecentStickers;
            if (zArr[i]) {
                return;
            }
            zArr[i] = true;
            if (this.recentStickersLoaded[i]) {
                z2 = false;
            }
        } else {
            if (this.loadingRecentGifs) {
                return;
            }
            this.loadingRecentGifs = true;
            if (this.recentGifsLoaded) {
                z2 = false;
            }
        }
        if (z2) {
            getMessagesStorage().getStorageQueue().postRunnable(new MediaDataController$$ExternalSyntheticLambda68(this, z, i, 1));
            return;
        }
        SharedPreferences emojiSettings = MessagesController.getEmojiSettings(this.currentAccount);
        if (!z3) {
            if (z) {
                j = emojiSettings.getLong("lastGifLoadTime", 0L);
            } else if (i == 0) {
                j = emojiSettings.getLong("lastStickersLoadTime", 0L);
            } else if (i == 1) {
                j = emojiSettings.getLong("lastStickersLoadTimeMask", 0L);
            } else if (i == 3) {
                j = emojiSettings.getLong("lastStickersLoadTimeGreet", 0L);
            } else if (i == 5) {
                j = emojiSettings.getLong("lastStickersLoadTimeEmojiPacks", 0L);
            } else {
                j = i == 7 ? emojiSettings.getLong("lastStickersLoadTimePremiumStickers", 0L) : emojiSettings.getLong("lastStickersLoadTimeFavs", 0L);
            }
            if (Math.abs(System.currentTimeMillis() - j) < 3600000) {
                if (z) {
                    this.loadingRecentGifs = false;
                    return;
                } else {
                    this.loadingRecentStickers[i] = false;
                    return;
                }
            }
        }
        if (z) {
            TLRPC.TL_messages_getSavedGifs tL_messages_getSavedGifs = new TLRPC.TL_messages_getSavedGifs();
            tL_messages_getSavedGifs.hash = calcDocumentsHash(this.recentGifs);
            getConnectionsManager().sendRequest(tL_messages_getSavedGifs, new MediaDataController$$ExternalSyntheticLambda22(this, i, 2));
            return;
        }
        if (i == 2) {
            TLRPC.TL_messages_getFavedStickers tL_messages_getFavedStickers = new TLRPC.TL_messages_getFavedStickers();
            tL_messages_getFavedStickers.hash = calcDocumentsHash(this.recentStickers[i]);
            tLObject = tL_messages_getFavedStickers;
        } else {
            if (i == 3) {
                tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                tL_messages_getStickers.emoticon = "👋" + Emoji.fixEmoji("⭐");
                tL_messages_getStickers.hash = calcDocumentsHash(this.recentStickers[i]);
            } else if (i == 7) {
                tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                tL_messages_getStickers.emoticon = "📂" + Emoji.fixEmoji("⭐");
                tL_messages_getStickers.hash = calcDocumentsHash(this.recentStickers[i]);
            } else {
                TLRPC.TL_messages_getRecentStickers tL_messages_getRecentStickers = new TLRPC.TL_messages_getRecentStickers();
                tL_messages_getRecentStickers.hash = calcDocumentsHash(this.recentStickers[i]);
                tL_messages_getRecentStickers.attached = i == 1;
                tLObject = tL_messages_getRecentStickers;
            }
            tLObject = tL_messages_getStickers;
        }
        getConnectionsManager().sendRequest(tLObject, new MediaDataController$$ExternalSyntheticLambda22(this, i, 3));
    }

    public void loadReplyIcons() {
        Throwable th;
        TLRPC.TL_emojiList tL_emojiList;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("replyicons_" + this.currentAccount, 0);
        TLRPC.TL_emojiList tL_emojiList2 = null;
        String string = sharedPreferences.getString("replyicons", null);
        long j = sharedPreferences.getLong("replyicons_last_check", 0L);
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            try {
                tL_emojiList = (TLRPC.TL_emojiList) TLRPC.EmojiList.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                try {
                    this.replyIconsDefault = tL_emojiList;
                } catch (Throwable th2) {
                    th = th2;
                    FileLog.e(th);
                }
            } catch (Throwable th3) {
                th = th3;
                tL_emojiList = null;
            }
            tL_emojiList2 = tL_emojiList;
        }
        if (tL_emojiList2 == null || System.currentTimeMillis() - j > 86400000 || BuildVars.DEBUG_PRIVATE_VERSION) {
            TL_account.getDefaultBackgroundEmojis getdefaultbackgroundemojis = new TL_account.getDefaultBackgroundEmojis();
            if (tL_emojiList2 != null) {
                getdefaultbackgroundemojis.hash = tL_emojiList2.hash;
            }
            getConnectionsManager().sendRequest(getdefaultbackgroundemojis, new MediaDataController$$ExternalSyntheticLambda38(this, sharedPreferences, 0));
        }
    }

    public void loadReplyMessagesForMessages(ArrayList<MessageObject> arrayList, long j, int i, long j2, Runnable runnable, int i2, Timer timer) {
        LongSparseArray longSparseArray;
        Timer.Task task;
        int i3;
        LongSparseArray longSparseArray2;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        long j3;
        long j4;
        ArrayList arrayList2;
        TLRPC.Chat chat;
        TLRPC.Message message2;
        TLRPC.Peer peer;
        ArrayList<MessageObject> arrayList3 = arrayList;
        boolean z = i == 1;
        if (DialogObject.isEncryptedDialog(j)) {
            Timer.Task taskStart = Timer.start(timer, "loadReplyMessagesForMessages: (encrypted) finding messages to load");
            ArrayList arrayList4 = new ArrayList();
            LongSparseArray longSparseArray3 = new LongSparseArray();
            for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                MessageObject messageObject = arrayList3.get(i4);
                if (messageObject != null && messageObject.isReply() && messageObject.replyMessageObject == null) {
                    long j5 = messageObject.messageOwner.reply_to.reply_to_random_id;
                    ArrayList arrayListM = (ArrayList) longSparseArray3.get(j5);
                    if (arrayListM == null) {
                        arrayListM = MediaDataController$$ExternalSyntheticOutline0.m(j5, longSparseArray3);
                    }
                    arrayListM.add(messageObject);
                    if (!arrayList4.contains(Long.valueOf(j5))) {
                        arrayList4.add(Long.valueOf(j5));
                    }
                }
            }
            if (!arrayList4.isEmpty()) {
                Timer.done(taskStart);
                getMessagesStorage().getStorageQueue().postRunnable(new TopicsController$$ExternalSyntheticLambda22(this, Timer.start(timer, "loadReplyMessagesForMessages (encrypted) storageQueue.postRunnable"), timer, arrayList4, j, longSparseArray3, runnable));
                return;
            } else {
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
        }
        LongSparseArray longSparseArray4 = new LongSparseArray();
        LongSparseArray longSparseArray5 = new LongSparseArray();
        Timer.Task taskStart2 = Timer.start(timer, "loadReplyMessagesForMessages: filling replies from the same array");
        int i5 = 0;
        while (true) {
            longSparseArray = null;
            if (i5 >= arrayList3.size()) {
                break;
            }
            MessageObject messageObject2 = arrayList3.get(i5);
            if (messageObject2 != null && !messageObject2.isReplyToStory() && messageObject2.isReply() && messageObject2.getRealId() > 0) {
                TLRPC.MessageReplyHeader messageReplyHeader = messageObject2.messageOwner.reply_to;
                if (messageReplyHeader.reply_to_peer_id == null) {
                    int i6 = messageReplyHeader.reply_to_msg_id;
                    for (int i7 = 0; i7 < arrayList3.size(); i7++) {
                        if (i5 != i7 && arrayList3.get(i7) != null && arrayList3.get(i7).getRealId() == i6) {
                            messageObject2.replyMessageObject = arrayList3.get(i7);
                            messageObject2.applyTimestampsHighlightForReplyMsg();
                            TLRPC.MessageAction messageAction = messageObject2.messageOwner.action;
                            if (!(messageAction instanceof TLRPC.TL_messageActionPinMessage)) {
                                if (!(messageAction instanceof TLRPC.TL_messageActionGameScore)) {
                                    if (!(messageAction instanceof TLRPC.TL_messageActionPaymentSent)) {
                                        if (!(messageAction instanceof TLRPC.TL_messageActionPaymentSentMe)) {
                                            if (!(messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval)) {
                                                break;
                                            }
                                            messageObject2.generateSuggestionApprovalMessageText();
                                            break;
                                        }
                                        messageObject2.generatePaymentSentMessageText(null, true);
                                        break;
                                    }
                                    messageObject2.generatePaymentSentMessageText(null, false);
                                    break;
                                }
                                messageObject2.generateGameMessageText(null);
                                break;
                            }
                            messageObject2.generatePinMessageText(null, null);
                            break;
                        }
                    }
                }
            }
            i5++;
        }
        Timer.done(taskStart2);
        Timer.Task taskStart3 = Timer.start(timer, "loadReplyMessagesForMessages: gathering ids of missing reply data");
        int i8 = 0;
        while (i8 < arrayList3.size()) {
            MessageObject messageObject3 = arrayList3.get(i8);
            if (messageObject3 == null) {
                task = taskStart3;
                longSparseArray2 = longSparseArray;
            } else {
                int i9 = messageObject3.type;
                if (i9 == 23 || i9 == 24) {
                    task = taskStart3;
                    i3 = i8;
                    longSparseArray2 = longSparseArray;
                    TLRPC.MessageMedia messageMedia2 = messageObject3.messageOwner.media;
                    if (messageMedia2.storyItem == null) {
                        long peerDialogId = DialogObject.getPeerDialogId(messageMedia2.peer);
                        longSparseArray = longSparseArray2 == null ? new LongSparseArray() : longSparseArray2;
                        ArrayList arrayListM2 = (ArrayList) longSparseArray.get(peerDialogId);
                        if (arrayListM2 == null) {
                            arrayListM2 = MediaDataController$$ExternalSyntheticOutline0.m(peerDialogId, longSparseArray);
                        }
                        StringBuilder sbM = AacUtil.m(peerDialogId, "+story did=", " at ");
                        sbM.append(messageObject3.type == 23 ? "forwarded" : "mentioned");
                        sbM.append(" #");
                        sbM.append(messageObject3.getId());
                        Timer.log(timer, sbM.toString());
                        arrayListM2.add(messageObject3);
                    } else {
                        long peerDialogId2 = DialogObject.getPeerDialogId(messageMedia2.peer);
                        TLRPC.MessageMedia messageMedia3 = messageObject3.messageOwner.media;
                        messageMedia3.storyItem = StoriesStorage.checkExpiredStateLocal(this.currentAccount, peerDialogId2, messageMedia3.storyItem);
                        longSparseArray = longSparseArray2;
                    }
                } else {
                    if (messageObject3.getRealId() <= 0 || !messageObject3.isReplyToStory()) {
                        task = taskStart3;
                        if (messageObject3.getRealId() > 0 && messageObject3.isReply()) {
                            TLRPC.Message message3 = messageObject3.messageOwner;
                            TLRPC.MessageReplyHeader messageReplyHeader2 = message3.reply_to;
                            int i10 = messageReplyHeader2.reply_to_msg_id;
                            longSparseArray2 = longSparseArray;
                            if (i10 != j2) {
                                TLRPC.Peer peer2 = messageReplyHeader2.reply_to_peer_id;
                                if (peer2 != null) {
                                    j3 = 0;
                                    j4 = peer2.channel_id;
                                    if (j4 == 0) {
                                        j4 = j3;
                                    }
                                } else {
                                    j3 = 0;
                                    j4 = message3.peer_id.channel_id;
                                    if (j4 == 0) {
                                        j4 = j3;
                                    }
                                }
                                MessageObject messageObject4 = messageObject3.replyMessageObject;
                                if ((messageObject4 == null || ((message2 = messageObject4.messageOwner) != null && (peer = message2.peer_id) != null && !(message3 instanceof TLRPC.TL_messageEmpty) && peer.channel_id != j4)) && (j == 1271266957 || j4 == j3 || messageObject3.getDialogId() == (-j4) || (chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j4))) == null || ChatObject.isPublic(chat))) {
                                    SparseArray sparseArray = (SparseArray) longSparseArray4.get(j);
                                    ArrayList arrayListM3 = (ArrayList) longSparseArray5.get(j4);
                                    if (sparseArray == null) {
                                        sparseArray = new SparseArray();
                                        longSparseArray4.put(sparseArray, j);
                                    }
                                    if (arrayListM3 == null) {
                                        arrayListM3 = MediaDataController$$ExternalSyntheticOutline0.m(j4, longSparseArray5);
                                    }
                                    ArrayList arrayList5 = (ArrayList) sparseArray.get(i10);
                                    i3 = i8;
                                    if (arrayList5 == null) {
                                        arrayList2 = new ArrayList();
                                        sparseArray.put(i10, arrayList2);
                                        if (!arrayListM3.contains(Integer.valueOf(i10))) {
                                            arrayListM3.add(Integer.valueOf(i10));
                                        }
                                    } else {
                                        arrayList2 = arrayList5;
                                    }
                                    arrayList2.add(messageObject3);
                                    Timer.log(timer, "+message did=" + (-j4) + " mid=" + i10 + " at replied #" + messageObject3.getId());
                                }
                                i8 = i3 + 1;
                                arrayList3 = arrayList;
                                taskStart3 = task;
                            }
                        }
                        longSparseArray = longSparseArray2;
                    } else {
                        TLRPC.Message message4 = messageObject3.messageOwner;
                        if (message4.replyStory == null) {
                            long peerDialogId3 = DialogObject.getPeerDialogId(message4.reply_to.peer);
                            if (longSparseArray == null) {
                                longSparseArray = new LongSparseArray();
                            }
                            ArrayList arrayListM4 = (ArrayList) longSparseArray.get(peerDialogId3);
                            if (arrayListM4 == null) {
                                arrayListM4 = MediaDataController$$ExternalSyntheticOutline0.m(peerDialogId3, longSparseArray);
                            }
                            StringBuilder sbM2 = AacUtil.m(peerDialogId3, "+story did=", " at replied #");
                            sbM2.append(messageObject3.getId());
                            Timer.log(timer, sbM2.toString());
                            arrayListM4.add(messageObject3);
                            task = taskStart3;
                            i3 = i8;
                        } else {
                            long peerDialogId4 = DialogObject.getPeerDialogId(message4.reply_to.peer);
                            TLRPC.Message message5 = messageObject3.messageOwner;
                            task = taskStart3;
                            message5.replyStory = StoriesStorage.checkExpiredStateLocal(this.currentAccount, peerDialogId4, message5.replyStory);
                        }
                    }
                    i3 = i8;
                    longSparseArray2 = longSparseArray;
                    longSparseArray = longSparseArray2;
                }
                if (messageObject3.type == 0 && (message = messageObject3.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                    int i11 = 0;
                    while (i11 < messageObject3.messageOwner.media.webpage.attributes.size()) {
                        TLRPC.WebPageAttribute webPageAttribute = messageObject3.messageOwner.media.webpage.attributes.get(i11);
                        if (webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) {
                            TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) webPageAttribute;
                            if (tL_webPageAttributeStory.storyItem == null) {
                                long peerDialogId5 = DialogObject.getPeerDialogId(tL_webPageAttributeStory.peer);
                                if (longSparseArray == null) {
                                    longSparseArray = new LongSparseArray();
                                }
                                ArrayList arrayListM5 = (ArrayList) longSparseArray.get(peerDialogId5);
                                if (arrayListM5 == null) {
                                    arrayListM5 = MediaDataController$$ExternalSyntheticOutline0.m(peerDialogId5, longSparseArray);
                                }
                                StringBuilder sbM3 = AacUtil.m(peerDialogId5, "+story did=", " at webpage of #");
                                sbM3.append(messageObject3.getId());
                                Timer.log(timer, sbM3.toString());
                                arrayListM5.add(messageObject3);
                            } else {
                                tL_webPageAttributeStory.storyItem = StoriesStorage.checkExpiredStateLocal(this.currentAccount, DialogObject.getPeerDialogId(tL_webPageAttributeStory.peer), tL_webPageAttributeStory.storyItem);
                            }
                        }
                        i11++;
                        messageObject3 = messageObject3;
                    }
                }
                i8 = i3 + 1;
                arrayList3 = arrayList;
                taskStart3 = task;
            }
            i3 = i8;
            longSparseArray = longSparseArray2;
            i8 = i3 + 1;
            arrayList3 = arrayList;
            taskStart3 = task;
        }
        LongSparseArray longSparseArray6 = longSparseArray;
        Timer.done(taskStart3);
        if (longSparseArray4.isEmpty() && longSparseArray6 == null) {
            if (runnable != null) {
                runnable.run();
            }
        } else {
            getMessagesStorage().getStorageQueue().postRunnable(new LaunchActivity$$ExternalSyntheticLambda162(this, Timer.start(timer, "loadReplyMessagesForMessages: storageQueue.postRunnable"), longSparseArray6, new AtomicInteger(2), runnable, i2, timer, longSparseArray4, longSparseArray5, z, j));
        }
    }

    public void loadRestrictedStatusEmojis() {
        Throwable th;
        TLRPC.TL_emojiList tL_emojiList;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("restrictedstatuses_" + this.currentAccount, 0);
        TLRPC.TL_emojiList tL_emojiList2 = null;
        String string = sharedPreferences.getString("restrictedstatuses", null);
        long j = sharedPreferences.getLong("restrictedstatuses_last_check", 0L);
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            try {
                tL_emojiList = (TLRPC.TL_emojiList) TLRPC.EmojiList.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                try {
                    this.restrictedStatusEmojis = tL_emojiList;
                } catch (Throwable th2) {
                    th = th2;
                    FileLog.e(th);
                }
            } catch (Throwable th3) {
                th = th3;
                tL_emojiList = null;
            }
            tL_emojiList2 = tL_emojiList;
        }
        if (tL_emojiList2 == null || System.currentTimeMillis() - j > 86400000) {
            TL_account.getChannelRestrictedStatusEmojis getchannelrestrictedstatusemojis = new TL_account.getChannelRestrictedStatusEmojis();
            if (tL_emojiList2 != null) {
                getchannelrestrictedstatusemojis.hash = tL_emojiList2.hash;
            }
            getConnectionsManager().sendRequest(getchannelrestrictedstatusemojis, new MediaDataController$$ExternalSyntheticLambda38(this, sharedPreferences, 1));
        }
    }

    public void loadSavedReactions(boolean z) {
        if (this.loadingSavedReactions) {
            return;
        }
        if (!this.loadedSavedReactions || z) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("saved_reactions_" + this.currentAccount, 0);
            this.savedReactions.clear();
            this.savedReactions.addAll(loadReactionsFromPref(sharedPreferences));
            this.loadingSavedReactions = true;
            this.loadedSavedReactions = true;
            TLRPC.TL_messages_getDefaultTagReactions tL_messages_getDefaultTagReactions = new TLRPC.TL_messages_getDefaultTagReactions();
            tL_messages_getDefaultTagReactions.hash = sharedPreferences.getLong("hash", 0L);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getDefaultTagReactions, new MediaDataController$$ExternalSyntheticLambda38(this, sharedPreferences, 2));
        }
    }

    public void loadStickers(int i, boolean z, boolean z2) {
        loadStickers(i, z, z2, false, null);
    }

    public void loadStickersByEmojiOrName(String str, boolean z, boolean z2) {
        if (this.loadingDiceStickerSets.contains(str)) {
            return;
        }
        if (!z || this.diceStickerSetsByEmoji.get(str) == null) {
            this.loadingDiceStickerSets.add(str);
            if (z2) {
                getMessagesStorage().getStorageQueue().postRunnable(new MediaDataController$$ExternalSyntheticLambda181(this, str, z, 1));
                return;
            }
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
            if (Objects.equals(getUserConfig().premiumGiftsStickerPack, str)) {
                tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetPremiumGifts();
            } else if (z) {
                TLRPC.TL_inputStickerSetDice tL_inputStickerSetDice = new TLRPC.TL_inputStickerSetDice();
                tL_inputStickerSetDice.emoticon = str;
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetDice;
            } else {
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_inputStickerSetShortName.short_name = str;
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
            }
            getConnectionsManager().sendRequest(tL_messages_getStickerSet, new ChatObject$Call$$ExternalSyntheticLambda11(this, str, z, 2));
        }
    }

    public void markFeaturedStickersAsRead(boolean z, boolean z2) {
        if (this.unreadStickerSets[z ? 1 : 0].isEmpty()) {
            return;
        }
        this.unreadStickerSets[z ? 1 : 0].clear();
        this.loadFeaturedHash[z ? 1 : 0] = calcFeaturedStickersHash(z, this.featuredStickerSets[z ? 1 : 0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(z ? NotificationCenter.featuredEmojiDidLoad : NotificationCenter.featuredStickersDidLoad, new Object[0]);
        putFeaturedStickersToCache(z, this.featuredStickerSets[z ? 1 : 0], this.unreadStickerSets[z ? 1 : 0], this.loadFeaturedDate[z ? 1 : 0], this.loadFeaturedHash[z ? 1 : 0], this.loadFeaturedPremium);
        if (z2) {
            getConnectionsManager().sendRequest(new TLRPC.TL_messages_readFeaturedStickers(), new FileRefController$$ExternalSyntheticLambda11(12));
        }
    }

    public void markFeaturedStickersByIdAsRead(boolean z, long j) {
        if (!this.unreadStickerSets[z ? 1 : 0].contains(Long.valueOf(j)) || this.readingStickerSets[z ? 1 : 0].contains(Long.valueOf(j))) {
            return;
        }
        this.readingStickerSets[z ? 1 : 0].add(Long.valueOf(j));
        TLRPC.TL_messages_readFeaturedStickers tL_messages_readFeaturedStickers = new TLRPC.TL_messages_readFeaturedStickers();
        tL_messages_readFeaturedStickers.id.add(Long.valueOf(j));
        getConnectionsManager().sendRequest(tL_messages_readFeaturedStickers, new FileRefController$$ExternalSyntheticLambda11(10));
        AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda286(this, z, j, 1), 1000L);
    }

    public void markSetInstalling(long j, boolean z) {
        this.uninstalledForceStickerSetsById.remove(Long.valueOf(j));
        if (z && !this.installedForceStickerSetsById.contains(Long.valueOf(j))) {
            this.installedForceStickerSetsById.add(Long.valueOf(j));
        }
        if (z) {
            return;
        }
        this.installedForceStickerSetsById.remove(Long.valueOf(j));
    }

    public void markSetUninstalling(long j, boolean z) {
        this.installedForceStickerSetsById.remove(Long.valueOf(j));
        if (z && !this.uninstalledForceStickerSetsById.contains(Long.valueOf(j))) {
            this.uninstalledForceStickerSetsById.add(Long.valueOf(j));
        }
        if (z) {
            return;
        }
        this.uninstalledForceStickerSetsById.remove(Long.valueOf(j));
    }

    public void moveStickerSetToTop(long j, boolean z, boolean z2) {
        int i = z ? 5 : z2 ? 1 : 0;
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = getStickerSets(i);
        if (stickerSets != null) {
            for (int i2 = 0; i2 < stickerSets.size(); i2++) {
                if (stickerSets.get(i2).set.id == j) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i2);
                    stickerSets.remove(i2);
                    stickerSets.add(0, tL_messages_stickerSet);
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i), Boolean.FALSE);
                    return;
                }
            }
        }
    }

    public void onRingtoneUploaded(String str, TLRPC.Document document, boolean z) {
        this.ringtoneUploaderHashMap.remove(str);
        RingtoneDataStore ringtoneDataStore = this.ringtoneDataStore;
        boolean z2 = true;
        if (z) {
            int i = 0;
            while (true) {
                if (i >= ringtoneDataStore.userRingtones.size()) {
                    z2 = false;
                    break;
                }
                ArrayList arrayList = ringtoneDataStore.userRingtones;
                if (((RingtoneDataStore.CachedTone) arrayList.get(i)).uploading && str.equals(((RingtoneDataStore.CachedTone) arrayList.get(i)).localUri)) {
                    arrayList.remove(i);
                    break;
                }
                i++;
            }
        } else {
            int i2 = 0;
            while (true) {
                if (i2 >= ringtoneDataStore.userRingtones.size()) {
                    z2 = false;
                    break;
                }
                ArrayList arrayList2 = ringtoneDataStore.userRingtones;
                if (((RingtoneDataStore.CachedTone) arrayList2.get(i2)).uploading && str.equals(((RingtoneDataStore.CachedTone) arrayList2.get(i2)).localUri)) {
                    ((RingtoneDataStore.CachedTone) arrayList2.get(i2)).uploading = false;
                    ((RingtoneDataStore.CachedTone) arrayList2.get(i2)).document = document;
                    break;
                }
                i2++;
            }
            if (z2) {
                ringtoneDataStore.saveTones();
            }
        }
        if (z2) {
            NotificationCenter.getInstance(ringtoneDataStore.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
        }
    }

    public void portSavedSearchResults(int i, ReactionsLayoutInBubble.VisibleReaction visibleReaction, String str, ArrayList<MessageObject> arrayList, ArrayList<MessageObject> arrayList2, int i2, int i3, boolean z) {
        this.lastReaction = visibleReaction;
        this.lastSearchQuery = str;
        boolean[] zArr = this.messagesSearchEndReached;
        zArr[0] = z;
        zArr[1] = true;
        this.searchServerResultMessages.clear();
        this.searchServerResultMessages.addAll(arrayList2);
        this.searchLocalResultMessages.clear();
        this.searchLocalResultMessages.addAll(arrayList);
        updateSearchResults();
        int[] iArr = this.messagesSearchCount;
        iArr[0] = i3;
        iArr[1] = 0;
        this.lastReturnedNum = i2;
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatSearchResultsAvailable, Integer.valueOf(i), 0, Integer.valueOf(getMask()), Long.valueOf(getUserConfig().getClientUserId()), Integer.valueOf(this.lastReturnedNum), Integer.valueOf(getSearchCount()), Boolean.TRUE);
    }

    public void preloadDefaultReactions() {
        if (this.reactionsList == null || this.reactionsCacheGenerated || !LiteMode.isEnabled(8200) || this.currentAccount != UserConfig.selectedAccount) {
            return;
        }
        this.reactionsCacheGenerated = true;
        ArrayList arrayList = new ArrayList(this.reactionsList);
        int iMin = Math.min(arrayList.size(), 10);
        for (int i = 0; i < iMin; i++) {
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList.get(i);
            preloadImage(ImageLocation.getForDocument(tL_availableReaction.activate_animation), 0);
            preloadImage(ImageLocation.getForDocument(tL_availableReaction.appear_animation), 0);
        }
        for (int i2 = 0; i2 < iMin; i2++) {
            preloadImage(ImageLocation.getForDocument(((TLRPC.TL_availableReaction) arrayList.get(i2)).effect_animation), 0);
        }
    }

    public void preloadImage(ImageLocation imageLocation, int i) {
        getFileLoader().loadFile(imageLocation, null, null, i, 11);
    }

    public void preloadPremiumPreviewStickers() {
        if (!this.previewStickersLoading && this.premiumPreviewStickers.isEmpty()) {
            TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
            tL_messages_getStickers.emoticon = Emoji.fixEmoji("⭐") + Emoji.fixEmoji("⭐");
            tL_messages_getStickers.hash = 0L;
            this.previewStickersLoading = true;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getStickers, new MediaDataController$$ExternalSyntheticLambda19(this, 0));
            return;
        }
        int i = 0;
        while (i < Math.min(this.premiumPreviewStickers.size(), 3)) {
            ArrayList<TLRPC.Document> arrayList = this.premiumPreviewStickers;
            TLRPC.Document document = arrayList.get(i == 2 ? arrayList.size() - 1 : i);
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
            i++;
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

    public boolean processDeletedMessage(int i, long[] jArr) {
        MessageObject messageObject;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= this.deletedFromResultMessages.size()) {
                messageObject = null;
                break;
            }
            if (this.deletedFromResultMessages.get(i2).getId() == i) {
                messageObject = this.deletedFromResultMessages.get(i2);
                break;
            }
            i2++;
        }
        if (messageObject != null && messageObject.getDialogId() == getUserConfig().getClientUserId()) {
            boolean zProcessDeletedReactionTags = getMessagesController().processDeletedReactionTags(messageObject.messageOwner);
            jArr[0] = MessageObject.getSavedDialogId(getUserConfig().getClientUserId(), messageObject.messageOwner);
            z = zProcessDeletedReactionTags;
        }
        this.deletedFromResultMessages.remove(messageObject);
        return z;
    }

    public void processLoadedMenuBots(TLRPC.TL_attachMenuBots tL_attachMenuBots, long j, int i, boolean z) {
        boolean z2;
        if (tL_attachMenuBots != null && i != 0) {
            this.attachMenuBots = tL_attachMenuBots;
            this.menuBotsUpdateHash = j;
        }
        SharedPreferences.Editor editorEdit = getMessagesController().getMainSettings().edit();
        this.menuBotsUpdateDate = i;
        editorEdit.putInt("menuBotsUpdateDate", i).commit();
        this.menuBotsUpdatedLocal = true;
        if (tL_attachMenuBots != null) {
            if (!z) {
                getMessagesStorage().putUsersAndChats(tL_attachMenuBots.users, null, true, true);
            }
            getMessagesController().putUsers(tL_attachMenuBots.users, z);
            AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda3(this, 2));
            z2 = false;
            for (int i2 = 0; i2 < tL_attachMenuBots.bots.size(); i2++) {
                if (tL_attachMenuBots.bots.get(i2) instanceof TLRPC.TL_attachMenuBot_layer162) {
                    tL_attachMenuBots.bots.get(i2).show_in_attach_menu = true;
                    z2 = true;
                }
            }
        } else {
            z2 = false;
        }
        if (!z) {
            putMenuBotsToCache(tL_attachMenuBots, j, i);
        } else if (z2 || Math.abs((System.currentTimeMillis() / 1000) - ((long) i)) >= 3600) {
            loadAttachMenuBots(false, true);
        }
    }

    public void processLoadedPremiumPromo(TLRPC.TL_help_premiumPromo tL_help_premiumPromo, int i, boolean z) {
        if (tL_help_premiumPromo != null) {
            this.premiumPromo = tL_help_premiumPromo;
            this.premiumPromoUpdateDate = i;
            getMessagesController().putUsers(tL_help_premiumPromo.users, z);
            AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda3(this, 8));
        }
        if (!z) {
            if (tL_help_premiumPromo != null) {
                putPremiumPromoToCache(tL_help_premiumPromo, i);
            }
            this.isLoadingPremiumPromo = false;
        } else if (tL_help_premiumPromo == null || Math.abs((System.currentTimeMillis() / 1000) - ((long) i)) >= 86400) {
            loadPremiumPromo(false);
        } else {
            this.isLoadingPremiumPromo = false;
        }
    }

    public void processLoadedReactions(List<TLRPC.TL_availableReaction> list, int i, int i2, boolean z) {
        if (list != null && i2 != 0) {
            this.reactionsList.clear();
            this.reactionsMap.clear();
            this.enabledReactionsList.clear();
            this.reactionsList.addAll(list);
            for (int i3 = 0; i3 < this.reactionsList.size(); i3++) {
                this.reactionsList.get(i3).positionInList = i3;
                this.reactionsMap.put(this.reactionsList.get(i3).reaction, this.reactionsList.get(i3));
                if (!this.reactionsList.get(i3).inactive) {
                    this.enabledReactionsList.add(this.reactionsList.get(i3));
                }
            }
            this.reactionsUpdateHash = i;
        }
        this.reactionsUpdateDate = i2;
        if (list != null) {
            AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda3(this, 4));
        }
        this.isLoadingReactions = false;
        if (!z) {
            putReactionsToCache(list, i, i2);
        } else {
            Math.abs((System.currentTimeMillis() / 1000) - ((long) i2));
            loadReactions(false, Integer.valueOf(i));
        }
    }

    public void processLoadedRecentDocuments(int i, ArrayList<TLRPC.Document> arrayList, boolean z, int i2, boolean z2) {
        int i3;
        ArrayList<TLRPC.Document> arrayList2;
        boolean z3;
        int i4;
        if (arrayList != null) {
            i3 = i;
            arrayList2 = arrayList;
            z3 = z;
            i4 = i2;
            getMessagesStorage().getStorageQueue().postRunnable(new MessagesController$$ExternalSyntheticLambda24(this, z3, i3, arrayList2, z2, i4));
        } else {
            i3 = i;
            arrayList2 = arrayList;
            z3 = z;
            i4 = i2;
        }
        if (i4 == 0) {
            AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda61(this, z3, i3, arrayList2));
        }
    }

    public void processStickerSetInstallResultArchive(BaseFragment baseFragment, boolean z, int i, TLRPC.TL_messages_stickerSetInstallResultArchive tL_messages_stickerSetInstallResultArchive) {
        int size = tL_messages_stickerSetInstallResultArchive.sets.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.installedStickerSetsById.remove(tL_messages_stickerSetInstallResultArchive.sets.get(i2).set.id);
        }
        loadArchivedStickersCount(i, false);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needAddArchivedStickers, tL_messages_stickerSetInstallResultArchive.sets);
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        baseFragment.showDialog(new StickersArchiveAlert(baseFragment.getParentActivity(), z ? baseFragment : null, tL_messages_stickerSetInstallResultArchive.sets).alertDialog);
    }

    public void pushDraftVoiceMessage(long j, long j2, DraftVoice draftVoice) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("2voicedrafts_" + this.currentAccount, 0);
        long jHash = Objects.hash(Long.valueOf(j), Long.valueOf(j2));
        String str = jHash + "";
        if (draftVoice == null) {
            sharedPreferences.edit().remove(str).apply();
            this.draftVoices.remove(jHash);
        } else {
            sharedPreferences.edit().putString(str, draftVoice.toString()).apply();
            this.draftVoices.put(draftVoice, jHash);
        }
    }

    public void pushRecentEmojiStatus(TLRPC.EmojiStatus emojiStatus) {
        if (this.emojiStatuses[0] != null) {
            if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
                long j = ((TLRPC.TL_emojiStatus) emojiStatus).document_id;
                int i = 0;
                while (i < this.emojiStatuses[0].size()) {
                    if ((this.emojiStatuses[0].get(i) instanceof TLRPC.TL_emojiStatus) && ((TLRPC.TL_emojiStatus) this.emojiStatuses[0].get(i)).document_id == j) {
                        this.emojiStatuses[0].remove(i);
                        i--;
                    }
                    i++;
                }
            }
            this.emojiStatuses[0].add(0, emojiStatus);
            while (this.emojiStatuses[0].size() > 50) {
                SurfaceContainer$$ExternalSyntheticOutline0.m5m(1, (ArrayList) this.emojiStatuses[0]);
            }
            TL_account.TL_emojiStatuses tL_emojiStatuses = new TL_account.TL_emojiStatuses();
            tL_emojiStatuses.hash = this.emojiStatusesHash[0];
            tL_emojiStatuses.statuses = this.emojiStatuses[0];
            updateEmojiStatuses(0, tL_emojiStatuses);
        }
    }

    public void putBotInfo(long j, TL_bots.BotInfo botInfo) {
        if (botInfo == null) {
            return;
        }
        this.botInfos.put(botInfo.user_id + "_" + j, botInfo);
        getMessagesStorage().getStorageQueue().postRunnable(new MessagesStorage$$ExternalSyntheticLambda11(this, botInfo, j, 7));
    }

    public void putBotKeyboard(MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        SQLiteCursor sQLiteCursorQueryFinalized;
        if (topicKey == null) {
            return;
        }
        try {
            if (topicKey.topicId != 0) {
                SQLiteDatabase database = getMessagesStorage().getDatabase();
                Locale locale = Locale.US;
                sQLiteCursorQueryFinalized = database.queryFinalized("SELECT mid FROM bot_keyboard_topics WHERE uid = " + topicKey.dialogId + " AND tid = " + topicKey.topicId, new Object[0]);
            } else {
                SQLiteDatabase database2 = getMessagesStorage().getDatabase();
                Locale locale2 = Locale.US;
                sQLiteCursorQueryFinalized = database2.queryFinalized("SELECT mid FROM bot_keyboard WHERE uid = " + topicKey.dialogId, new Object[0]);
            }
            int iIntValue = sQLiteCursorQueryFinalized.next() ? sQLiteCursorQueryFinalized.intValue(0) : 0;
            sQLiteCursorQueryFinalized.dispose();
            if (iIntValue < message.id || MessageObject.isEphemeralMessageId(iIntValue) || MessageObject.isEphemeralMessageId(message.id)) {
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast = topicKey.topicId != 0 ? getMessagesStorage().getDatabase().executeFast("REPLACE INTO bot_keyboard_topics VALUES(?, ?, ?, ?)") : getMessagesStorage().getDatabase().executeFast("REPLACE INTO bot_keyboard VALUES(?, ?, ?)");
                sQLitePreparedStatementExecuteFast.requery();
                MessageObject.normalizeFlags(message);
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                message.serializeToStream(nativeByteBuffer);
                if (topicKey.topicId != 0) {
                    sQLitePreparedStatementExecuteFast.bindLong(1, topicKey.dialogId);
                    sQLitePreparedStatementExecuteFast.bindLong(2, topicKey.topicId);
                    sQLitePreparedStatementExecuteFast.bindInteger(3, message.id);
                    sQLitePreparedStatementExecuteFast.bindByteBuffer(4, nativeByteBuffer);
                } else {
                    sQLitePreparedStatementExecuteFast.bindLong(1, topicKey.dialogId);
                    sQLitePreparedStatementExecuteFast.bindInteger(2, message.id);
                    sQLitePreparedStatementExecuteFast.bindByteBuffer(3, nativeByteBuffer);
                }
                sQLitePreparedStatementExecuteFast.step();
                nativeByteBuffer.reuse();
                sQLitePreparedStatementExecuteFast.dispose();
                AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda99(this, topicKey, message));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void putGroupStickerSet(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.groupStickerSets.put(tL_messages_stickerSet, tL_messages_stickerSet.set.id);
    }

    public void putStickerSet(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        putStickerSet(tL_messages_stickerSet, true);
    }

    public void removeInline(long j) {
        removeInline(j, false);
    }

    public void removeMessageFromResults(int i) {
        int i2 = 0;
        int i3 = 0;
        while (i3 < this.searchResultMessages.size()) {
            if (i == this.searchResultMessages.get(i3).getId()) {
                this.deletedFromResultMessages.add(this.searchResultMessages.remove(i3));
                i3--;
            }
            i3++;
        }
        int i4 = 0;
        while (i4 < this.searchServerResultMessages.size()) {
            if (i == this.searchServerResultMessages.get(i4).getId()) {
                this.searchServerResultMessages.remove(i4);
                i4--;
            }
            i4++;
        }
        while (i2 < this.searchLocalResultMessages.size()) {
            if (i == this.searchLocalResultMessages.get(i2).getId()) {
                this.searchLocalResultMessages.remove(i2);
                i2--;
            }
            i2++;
        }
    }

    public void removeMultipleStickerSets(Context context, BaseFragment baseFragment, ArrayList<TLRPC.TL_messages_stickerSet> arrayList) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (arrayList == null || arrayList.isEmpty() || (tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) SurfaceContainer$$ExternalSyntheticOutline0.m(1, (ArrayList) arrayList)) == null) {
            return;
        }
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        int i = stickerSet.masks ? 1 : stickerSet.emojis ? 5 : 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).set.archived = false;
        }
        int[] iArr = new int[arrayList.size()];
        for (int i3 = 0; i3 < this.stickerSets[i].size(); i3++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.stickerSets[i].get(i3);
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                if (tL_messages_stickerSet2.set.id == arrayList.get(i4).set.id) {
                    iArr[i4] = i3;
                    this.stickerSets[i].remove(i3);
                    this.stickerSetsById.remove(tL_messages_stickerSet2.set.id);
                    this.installedStickerSetsById.remove(tL_messages_stickerSet2.set.id);
                    this.stickerSetsByName.remove(tL_messages_stickerSet2.set.short_name);
                    break;
                }
            }
        }
        ArrayList<TLRPC.TL_messages_stickerSet> arrayList2 = this.stickerSets[i];
        int i5 = this.loadDate[i];
        long[] jArr = this.loadHash;
        int i6 = i;
        long jCalcStickersHash = calcStickersHash(arrayList2);
        jArr[i6] = jCalcStickersHash;
        putStickersToCache(i6, arrayList2, i5, jCalcStickersHash);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i6), Boolean.TRUE);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            markSetUninstalling(arrayList.get(i7).set.id, true);
        }
        StickerSetBulletinLayout stickerSetBulletinLayout = new StickerSetBulletinLayout(context, tL_messages_stickerSet, arrayList.size(), 0, null, baseFragment.getResourceProvider());
        boolean[] zArr = new boolean[1];
        Bulletin.UndoButton undoButton = new Bulletin.UndoButton(context);
        undoButton.undoAction = new WearAuthSheet$$ExternalSyntheticLambda3((Object) this, (Object) zArr, (Object) arrayList, i6, iArr, 2);
        undoButton.delayedAction = new OAuthSheet$$ExternalSyntheticLambda9(this, zArr, arrayList, context, baseFragment, i6);
        stickerSetBulletinLayout.setButton(undoButton);
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            this.removingStickerSetsUndos.put(new ANRDetector$$ExternalSyntheticLambda0(undoButton, 25), arrayList.get(i8).set.id);
        }
        Bulletin.make(baseFragment, stickerSetBulletinLayout, 2750).show();
    }

    public void removePeer(long j) {
        for (int i = 0; i < this.hints.size(); i++) {
            if (this.hints.get(i).peer.user_id == j) {
                this.hints.remove(i);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadHints, new Object[0]);
                TLRPC.TL_contacts_resetTopPeerRating tL_contacts_resetTopPeerRating = new TLRPC.TL_contacts_resetTopPeerRating();
                tL_contacts_resetTopPeerRating.category = new TLRPC.TL_topPeerCategoryCorrespondents();
                tL_contacts_resetTopPeerRating.peer = getMessagesController().getInputPeer(j);
                deletePeer(j, 0);
                getConnectionsManager().sendRequest(tL_contacts_resetTopPeerRating, new FileRefController$$ExternalSyntheticLambda11(11));
                return;
            }
        }
    }

    public void removeRecentGif(TLRPC.Document document) {
        int size = this.recentGifs.size();
        for (int i = 0; i < size; i++) {
            if (this.recentGifs.get(i).id == document.id) {
                this.recentGifs.remove(i);
                break;
            }
        }
        TLRPC.TL_messages_saveGif tL_messages_saveGif = new TLRPC.TL_messages_saveGif();
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_messages_saveGif.id = tL_inputDocument;
        tL_inputDocument.id = document.id;
        tL_inputDocument.access_hash = document.access_hash;
        byte[] bArr = document.file_reference;
        tL_inputDocument.file_reference = bArr;
        if (bArr == null) {
            tL_inputDocument.file_reference = new byte[0];
        }
        tL_messages_saveGif.unsave = true;
        getConnectionsManager().sendRequest(tL_messages_saveGif, new UserNameResolver$$ExternalSyntheticLambda0(4, this, tL_messages_saveGif));
        getMessagesStorage().getStorageQueue().postRunnable(new MediaDataController$$ExternalSyntheticLambda39(1, this, document));
    }

    public void removeWebapp(long j) {
        for (int i = 0; i < this.webapps.size(); i++) {
            if (this.webapps.get(i).peer.user_id == j) {
                this.webapps.remove(i);
                TLRPC.TL_contacts_resetTopPeerRating tL_contacts_resetTopPeerRating = new TLRPC.TL_contacts_resetTopPeerRating();
                tL_contacts_resetTopPeerRating.category = new TLRPC.TL_topPeerCategoryBotsApp();
                tL_contacts_resetTopPeerRating.peer = getMessagesController().getInputPeer(j);
                getConnectionsManager().sendRequest(tL_contacts_resetTopPeerRating, new FileRefController$$ExternalSyntheticLambda11(13));
                deletePeer(j, 2);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadWebappsHints, new Object[0]);
                return;
            }
        }
    }

    public void reorderStickers(int i, ArrayList<Long> arrayList, boolean z) {
        Collections.sort(this.stickerSets[i], new MediaDataController$$ExternalSyntheticLambda125(arrayList, 1));
        this.loadHash[i] = calcStickersHash(this.stickerSets[i]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i), Boolean.valueOf(z));
    }

    public void replaceStickerSet(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        boolean z;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) this.stickerSetsById.get(tL_messages_stickerSet.set.id);
        String str = (String) this.diceEmojiStickerSetsById.get(tL_messages_stickerSet.set.id);
        if (str != null) {
            this.diceStickerSetsByEmoji.put(str, tL_messages_stickerSet);
            putDiceStickersToCache(str, tL_messages_stickerSet, (int) (System.currentTimeMillis() / 1000));
        }
        if (tL_messages_stickerSet2 == null) {
            tL_messages_stickerSet2 = this.stickerSetsByName.get(tL_messages_stickerSet.set.short_name);
        }
        boolean z2 = tL_messages_stickerSet2 == null && (tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) this.groupStickerSets.get(tL_messages_stickerSet.set.id)) != null;
        if (tL_messages_stickerSet2 == null) {
            return;
        }
        if ("AnimatedEmojies".equals(tL_messages_stickerSet.set.short_name)) {
            tL_messages_stickerSet2.documents = tL_messages_stickerSet.documents;
            tL_messages_stickerSet2.packs = tL_messages_stickerSet.packs;
            tL_messages_stickerSet2.set = tL_messages_stickerSet.set;
            AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda114(this, tL_messages_stickerSet, 4));
            z = true;
        } else {
            LongSparseArray longSparseArray = new LongSparseArray();
            int size = tL_messages_stickerSet.documents.size();
            for (int i = 0; i < size; i++) {
                TLRPC.Document document = tL_messages_stickerSet.documents.get(i);
                longSparseArray.put(document, document.id);
            }
            int size2 = tL_messages_stickerSet2.documents.size();
            z = false;
            for (int i2 = 0; i2 < size2; i2++) {
                TLRPC.Document document2 = (TLRPC.Document) longSparseArray.get(tL_messages_stickerSet2.documents.get(i2).id);
                if (document2 != null) {
                    tL_messages_stickerSet2.documents.set(i2, document2);
                    z = true;
                }
            }
        }
        if (z) {
            if (z2) {
                putSetToCache(tL_messages_stickerSet2);
                return;
            }
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            int i3 = stickerSet.masks ? 1 : stickerSet.emojis ? 5 : 0;
            putStickersToCache(i3, this.stickerSets[i3], this.loadDate[i3], this.loadHash[i3]);
            if ("AnimatedEmojies".equals(tL_messages_stickerSet.set.short_name)) {
                putStickersToCache(4, this.stickerSets[4], this.loadDate[4], this.loadHash[4]);
            }
        }
    }

    public void saveDraft(long j, int i, CharSequence charSequence, ArrayList<TLRPC.MessageEntity> arrayList, TLRPC.Message message, boolean z, long j2) {
        saveDraft(j, i, charSequence, arrayList, message, null, null, j2, z, false);
    }

    public boolean saveToRingtones(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        if (this.ringtoneDataStore.getDocument(document.id) != null) {
            return true;
        }
        if (document.size > MessagesController.getInstance(this.currentAccount).ringtoneSizeMax) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax / 1024)));
            return false;
        }
        for (int i = 0; i < document.attributes.size(); i++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && documentAttribute.duration > MessagesController.getInstance(this.currentAccount).ringtoneDurationMax) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax)));
                return false;
            }
        }
        TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        saveringtone.id = tL_inputDocument;
        tL_inputDocument.id = document.id;
        tL_inputDocument.file_reference = document.file_reference;
        tL_inputDocument.access_hash = document.access_hash;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(saveringtone, new UserNameResolver$$ExternalSyntheticLambda0(5, this, document));
        return true;
    }

    public boolean searchEndReached() {
        boolean[] zArr = this.messagesSearchEndReached;
        return (zArr[0] && this.lastMergeDialogId == 0 && zArr[1]) || this.loadingSearchLocal || this.loadedPredirectedSearchLocal;
    }

    public void searchMessagesInChat(String str, long j, long j2, int i, int i2, long j3, TLRPC.User user, TLRPC.Chat chat, ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
        searchMessagesInChat(str, j, j2, i, i2, j3, false, user, chat, true, visibleReaction);
    }

    public void searchStickerSets(boolean z, String str, Utilities.Callback<ArrayList<TLRPC.StickerSetCovered>> callback) {
        Object obj;
        if (z) {
            TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
            tL_messages_searchEmojiStickerSets.q = str;
            obj = tL_messages_searchEmojiStickerSets;
        } else {
            TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = new TLRPC.TL_messages_searchStickerSets();
            tL_messages_searchStickerSets.q = str;
            obj = tL_messages_searchStickerSets;
        }
        getConnectionsManager().sendRequestTyped(obj, new AiTonesController$$ExternalSyntheticLambda0(), new MediaDataController$$ExternalSyntheticLambda32(0, callback));
    }

    public SearchStickersKey searchStickers(boolean z, String str, String str2, Utilities.Callback<ArrayList<TLRPC.Document>> callback) {
        return searchStickers(z, str, str2, callback, false);
    }

    public void setDoubleTapReaction(String str) {
        MessagesController.getEmojiSettings(this.currentAccount).edit().putString("reaction_on_double_tap", str).apply();
        this.doubleTapReaction = str;
    }

    public void setDraftFolderId(long j, int i) {
        this.draftsFolderIds.put(Integer.valueOf(i), j);
    }

    public void setDraftVoiceRegion(long j, long j2, float f, float f2) {
        DraftVoice draftVoice = getDraftVoice(j, j2);
        if (draftVoice != null) {
            if (Math.abs(draftVoice.left - f) >= 0.001f || Math.abs(draftVoice.right - f2) >= 0.001f) {
                draftVoice.left = f;
                draftVoice.right = f2;
                ApplicationLoader.applicationContext.getSharedPreferences("2voicedrafts_" + this.currentAccount, 0).edit().putString(Objects.hash(Long.valueOf(j), Long.valueOf(j2)) + "", draftVoice.toString()).apply();
            }
        }
    }

    public void setPlaceholderImage(BackupImageView backupImageView, String str, String str2, String str3) {
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName.short_name = str;
        getInstance(this.currentAccount).getStickerSet(tL_inputStickerSetShortName, 0, false, new FileRefController$$ExternalSyntheticLambda21(str2, backupImageView, str3));
    }

    public void setSearchedPosition(int i) {
        if (i < 0 || i >= this.searchResultMessages.size()) {
            return;
        }
        this.lastReturnedNum = i;
    }

    public void storeTempStickerSet(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.StickerSet stickerSet;
        if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null) {
            return;
        }
        this.stickerSetsById.put(tL_messages_stickerSet, stickerSet.id);
        String str = tL_messages_stickerSet.set.short_name;
        if (str != null) {
            this.stickerSetsByName.put(str.toLowerCase(), tL_messages_stickerSet);
        }
    }

    public CharSequence substring(CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof SpannableStringBuilder) {
            return charSequence.subSequence(i, i2);
        }
        return charSequence instanceof SpannedString ? ((SpannedString) charSequence).subSequence(i, i2) : TextUtils.substring(charSequence, i, i2);
    }

    public void toggleDraftVoiceOnce(long j, long j2, boolean z) {
        DraftVoice draftVoice = getDraftVoice(j, j2);
        if (draftVoice == null || draftVoice.once == z) {
            return;
        }
        draftVoice.once = z;
        ApplicationLoader.applicationContext.getSharedPreferences("2voicedrafts_" + this.currentAccount, 0).edit().putString(Objects.hash(Long.valueOf(j), Long.valueOf(j2)) + "", draftVoice.toString()).apply();
    }

    public void toggleStickerSet(Context context, TLObject tLObject, int i, BaseFragment baseFragment, boolean z, boolean z2) {
        toggleStickerSet(context, tLObject, i, baseFragment, z, z2, null, true);
    }

    public void toggleStickerSets(ArrayList<TLRPC.StickerSet> arrayList, final int i, final int i2, final BaseFragment baseFragment, final boolean z) {
        ArrayList<TLRPC.InputStickerSet> arrayList2;
        int i3;
        int i4 = 1;
        int size = arrayList.size();
        ArrayList<TLRPC.InputStickerSet> arrayList3 = new ArrayList<>(size);
        int i5 = 0;
        while (i5 < size) {
            TLRPC.StickerSet stickerSet = arrayList.get(i5);
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
            tL_inputStickerSetID.id = stickerSet.id;
            arrayList3.add(tL_inputStickerSetID);
            if (i2 != 0) {
                stickerSet.archived = i2 == i4;
            }
            int size2 = this.stickerSets[i].size();
            int i6 = 0;
            while (true) {
                if (i6 >= size2) {
                    arrayList2 = arrayList3;
                    i3 = 1;
                    break;
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.stickerSets[i].get(i6);
                arrayList2 = arrayList3;
                i3 = 1;
                if (tL_messages_stickerSet.set.id == tL_inputStickerSetID.id) {
                    this.stickerSets[i].remove(i6);
                    if (i2 != 2) {
                        this.stickerSetsById.remove(tL_messages_stickerSet.set.id);
                        this.installedStickerSetsById.remove(tL_messages_stickerSet.set.id);
                        this.stickerSetsByName.remove(tL_messages_stickerSet.set.short_name);
                        break;
                    }
                    this.stickerSets[i].add(0, tL_messages_stickerSet);
                    break;
                }
                i6++;
                arrayList3 = arrayList2;
            }
            i5 += i3;
            arrayList3 = arrayList2;
            i4 = 1;
        }
        this.loadHash[i] = calcStickersHash(this.stickerSets[i]);
        putStickersToCache(i, this.stickerSets[i], this.loadDate[i], this.loadHash[i]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i), Boolean.TRUE);
        TLRPC.TL_messages_toggleStickerSets tL_messages_toggleStickerSets = new TLRPC.TL_messages_toggleStickerSets();
        tL_messages_toggleStickerSets.stickersets = arrayList3;
        if (i2 == 0) {
            tL_messages_toggleStickerSets.uninstall = true;
        } else if (i2 == 1) {
            tL_messages_toggleStickerSets.archive = true;
        } else if (i2 == 2) {
            tL_messages_toggleStickerSets.unarchive = true;
        }
        getConnectionsManager().sendRequest(tL_messages_toggleStickerSets, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$toggleStickerSets$119(i2, baseFragment, z, i, tLObject, tL_error);
            }
        });
    }

    public void uninstallShortcut(long j, int i) {
        TLRPC.Chat chat;
        TLRPC.User user;
        String name;
        Intent intentCreateIntrnalAttachedBotShortcutIntent;
        try {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 26) {
                ArrayList arrayList = new ArrayList();
                if (i == SHORTCUT_TYPE_USER_OR_CHAT) {
                    arrayList.add("sdid_" + j);
                    arrayList.add("ndid_" + j);
                }
                if (i == SHORTCUT_TYPE_ATTACHED_BOT) {
                    arrayList.add("bdid_" + j);
                }
                FragmentManager.FragmentIntentSenderContract.removeDynamicShortcuts(ApplicationLoader.applicationContext, arrayList);
                if (i2 >= 30) {
                    ShortcutManagerCompat$$ExternalSyntheticApiModelOutline0.m(ApplicationLoader.applicationContext.getSystemService(ShortcutManagerCompat$$ExternalSyntheticApiModelOutline0.m())).removeLongLivedShortcuts(arrayList);
                    return;
                }
                return;
            }
            TLRPC.User user2 = null;
            if (!DialogObject.isEncryptedDialog(j)) {
                if (DialogObject.isUserDialog(j)) {
                    user = getMessagesController().getUser(Long.valueOf(j));
                } else if (!DialogObject.isChatDialog(j)) {
                    return;
                } else {
                    chat = getMessagesController().getChat(Long.valueOf(-j));
                }
                if (user2 == null || chat != null) {
                    if (user2 != null) {
                        name = chat.title;
                    } else if (i == SHORTCUT_TYPE_USER_OR_CHAT) {
                        name = ContactsController.formatName(user2.first_name, user2.last_name);
                    } else if (i == SHORTCUT_TYPE_ATTACHED_BOT) {
                        name = user2.first_name;
                    } else {
                        name = "";
                    }
                    if (i == SHORTCUT_TYPE_USER_OR_CHAT) {
                        intentCreateIntrnalAttachedBotShortcutIntent = createIntrnalShortcutIntent(j);
                    } else {
                        intentCreateIntrnalAttachedBotShortcutIntent = createIntrnalAttachedBotShortcutIntent(j);
                    }
                    Intent intent = new Intent();
                    intent.putExtra("android.intent.extra.shortcut.INTENT", intentCreateIntrnalAttachedBotShortcutIntent);
                    intent.putExtra("android.intent.extra.shortcut.NAME", name);
                    intent.putExtra("duplicate", false);
                    intent.setAction("com.android.launcher.action.UNINSTALL_SHORTCUT");
                    ApplicationLoader.applicationContext.sendBroadcast(intent);
                }
                return;
            }
            TLRPC.EncryptedChat encryptedChat = getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(j)));
            if (encryptedChat == null) {
                return;
            } else {
                user = getMessagesController().getUser(Long.valueOf(encryptedChat.user_id));
            }
            user2 = user;
            chat = null;
            if (user2 == null) {
            }
            if (user2 != null) {
                name = chat.title;
            } else if (i == SHORTCUT_TYPE_USER_OR_CHAT) {
                name = ContactsController.formatName(user2.first_name, user2.last_name);
            } else if (i == SHORTCUT_TYPE_ATTACHED_BOT) {
                name = user2.first_name;
            } else {
                name = "";
            }
            if (i == SHORTCUT_TYPE_USER_OR_CHAT) {
                intentCreateIntrnalAttachedBotShortcutIntent = createIntrnalShortcutIntent(j);
            } else {
                intentCreateIntrnalAttachedBotShortcutIntent = createIntrnalAttachedBotShortcutIntent(j);
            }
            Intent intent2 = new Intent();
            intent2.putExtra("android.intent.extra.shortcut.INTENT", intentCreateIntrnalAttachedBotShortcutIntent);
            intent2.putExtra("android.intent.extra.shortcut.NAME", name);
            intent2.putExtra("duplicate", false);
            intent2.setAction("com.android.launcher.action.UNINSTALL_SHORTCUT");
            ApplicationLoader.applicationContext.sendBroadcast(intent2);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void updateAttachMenuBotsInCache() {
        if (getAttachMenuBots() != null) {
            putMenuBotsToCache(getAttachMenuBots(), this.menuBotsUpdateHash, this.menuBotsUpdateDate);
        }
    }

    public void updateBotInfo(long j, TL_update.TL_updateBotCommands tL_updateBotCommands) {
        TL_bots.BotInfo botInfo = this.botInfos.get(tL_updateBotCommands.bot_id + "_" + j);
        if (botInfo != null) {
            botInfo.commands = tL_updateBotCommands.commands;
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botInfoDidLoad, botInfo, 0);
        }
        getMessagesStorage().getStorageQueue().postRunnable(new MessagesStorage$$ExternalSyntheticLambda11(this, tL_updateBotCommands, j, 6));
    }

    public void uploadRingtone(String str) {
        if (this.ringtoneUploaderHashMap.containsKey(str)) {
            return;
        }
        this.ringtoneUploaderHashMap.put(str, new RingtoneUploader(str, this.currentAccount));
        RingtoneDataStore ringtoneDataStore = this.ringtoneDataStore;
        ringtoneDataStore.getClass();
        RingtoneDataStore.CachedTone cachedTone = new RingtoneDataStore.CachedTone();
        cachedTone.localUri = str;
        int i = ringtoneDataStore.localIds;
        ringtoneDataStore.localIds = i + 1;
        cachedTone.localId = i;
        cachedTone.uploading = true;
        ringtoneDataStore.userRingtones.add(cachedTone);
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
            this.documents.addAll(tL_messages_foundStickers.stickers);
            this.next_offset = (tL_messages_foundStickers.flags & 1) != 0 ? Integer.valueOf(tL_messages_foundStickers.next_offset) : null;
        }

        public SearchStickersResult(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static void addTextStyleRuns(TLRPC.DraftMessage draftMessage, Spannable spannable, int i) {
        addTextStyleRuns(draftMessage.entities, draftMessage.message, spannable, i);
    }

    public static long calcDocumentsHash(ArrayList<TLRPC.Document> arrayList, int i) {
        long jCalcHash = 0;
        if (arrayList == null) {
            return 0L;
        }
        int iMin = Math.min(i, arrayList.size());
        for (int i2 = 0; i2 < iMin; i2++) {
            TLRPC.Document document = arrayList.get(i2);
            if (document != null) {
                jCalcHash = calcHash(jCalcHash, document.id);
            }
        }
        return jCalcHash;
    }

    private void increaseInlineRating(long j, boolean z) {
        TLRPC.TL_topPeer tL_topPeer;
        if (getUserConfig().suggestContacts) {
            int i = z ? getUserConfig().botGuestRatingLoadTime : getUserConfig().botRatingLoadTime;
            int iMax = i != 0 ? Math.max(1, ((int) (System.currentTimeMillis() / 1000)) - i) : 60;
            ArrayList<TLRPC.TL_topPeer> arrayList = z ? this.guestBots : this.inlineBots;
            int i2 = 0;
            while (true) {
                if (i2 >= arrayList.size()) {
                    tL_topPeer = null;
                    break;
                }
                tL_topPeer = arrayList.get(i2);
                if (tL_topPeer.peer.user_id == j) {
                    break;
                } else {
                    i2++;
                }
            }
            if (tL_topPeer == null) {
                tL_topPeer = new TLRPC.TL_topPeer();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_topPeer.peer = tL_peerUser;
                tL_peerUser.user_id = j;
                arrayList.add(tL_topPeer);
            }
            tL_topPeer.rating = Math.exp(iMax / getMessagesController().ratingDecay) + tL_topPeer.rating;
            Collections.sort(arrayList, new Emoji$$ExternalSyntheticLambda0(12));
            if (arrayList.size() > 20) {
                SurfaceContainer$$ExternalSyntheticOutline0.m5m(1, (ArrayList) arrayList);
            }
            savePeer(j, z ? 3 : 1, tL_topPeer.rating);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(z ? NotificationCenter.reloadGuestBotHints : NotificationCenter.reloadInlineHints, new Object[0]);
        }
    }

    private void processLoadStickersResponse(int i, TLRPC.TL_messages_allStickers tL_messages_allStickers, Runnable runnable) {
        final TLRPC.TL_messages_allStickers tL_messages_allStickers2;
        final LongSparseArray longSparseArray;
        final int i2;
        final ArrayList<TLRPC.TL_messages_stickerSet> arrayList = new ArrayList<>();
        if (tL_messages_allStickers.sets.isEmpty()) {
            processLoadedStickers(i, arrayList, false, (int) (System.currentTimeMillis() / 1000), tL_messages_allStickers.hash2, runnable);
            return;
        }
        int i3 = i;
        LongSparseArray longSparseArray2 = new LongSparseArray();
        int i4 = 0;
        while (i4 < tL_messages_allStickers.sets.size()) {
            final TLRPC.StickerSet stickerSet = tL_messages_allStickers.sets.get(i4);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.stickerSetsById.get(stickerSet.id);
            if (tL_messages_stickerSet != null) {
                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
                if (stickerSet2.hash == stickerSet.hash) {
                    stickerSet2.archived = stickerSet.archived;
                    stickerSet2.installed = stickerSet.installed;
                    stickerSet2.official = stickerSet.official;
                    longSparseArray2.put(tL_messages_stickerSet, stickerSet2.id);
                    arrayList.add(tL_messages_stickerSet);
                    if (longSparseArray2.size() == tL_messages_allStickers.sets.size()) {
                        processLoadedStickers(i3, arrayList, false, (int) (System.currentTimeMillis() / 1000), tL_messages_allStickers.hash2);
                    }
                    tL_messages_allStickers2 = tL_messages_allStickers;
                    longSparseArray = longSparseArray2;
                    i2 = i4;
                } else {
                    arrayList.add(null);
                    TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                    tL_messages_getStickerSet.stickerset = tL_inputStickerSetID;
                    tL_inputStickerSetID.id = stickerSet.id;
                    tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                    tL_messages_allStickers2 = tL_messages_allStickers;
                    longSparseArray = longSparseArray2;
                    i2 = i4;
                    final int i5 = i3;
                    i3 = i5;
                    getConnectionsManager().sendRequest(tL_messages_getStickerSet, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            TLRPC.TL_messages_allStickers tL_messages_allStickers3 = tL_messages_allStickers2;
                            this.f$0.lambda$processLoadStickersResponse$74(arrayList, i2, longSparseArray, stickerSet, tL_messages_allStickers3, i5, tLObject, tL_error);
                        }
                    });
                }
            } else {
                arrayList.add(null);
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet2 = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                tL_messages_getStickerSet2.stickerset = tL_inputStickerSetID2;
                tL_inputStickerSetID2.id = stickerSet.id;
                tL_inputStickerSetID2.access_hash = stickerSet.access_hash;
                tL_messages_allStickers2 = tL_messages_allStickers;
                longSparseArray = longSparseArray2;
                i2 = i4;
                final int i6 = i3;
                i3 = i6;
                getConnectionsManager().sendRequest(tL_messages_getStickerSet2, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        TLRPC.TL_messages_allStickers tL_messages_allStickers3 = tL_messages_allStickers2;
                        this.f$0.lambda$processLoadStickersResponse$74(arrayList, i2, longSparseArray, stickerSet, tL_messages_allStickers3, i6, tLObject, tL_error);
                    }
                });
            }
            i4 = i2 + 1;
            longSparseArray2 = longSparseArray;
            tL_messages_allStickers = tL_messages_allStickers2;
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    private void processLoadedStickers(int i, ArrayList<TLRPC.TL_messages_stickerSet> arrayList, boolean z, int i2, long j, Runnable runnable) {
        AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda21(this, i, 1));
        Utilities.stageQueue.postRunnable(new MediaDataController$$ExternalSyntheticLambda204(this, z, arrayList, i2, j, i, runnable));
    }

    private void removeInline(long j, boolean z) {
        ArrayList<TLRPC.TL_topPeer> arrayList = z ? this.guestBots : this.inlineBots;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).peer.user_id == j) {
                arrayList.remove(i);
                TLRPC.TL_contacts_resetTopPeerRating tL_contacts_resetTopPeerRating = new TLRPC.TL_contacts_resetTopPeerRating();
                tL_contacts_resetTopPeerRating.category = new TLRPC.TL_topPeerCategoryBotsInline();
                tL_contacts_resetTopPeerRating.peer = getMessagesController().getInputPeer(j);
                getConnectionsManager().sendRequest(tL_contacts_resetTopPeerRating, new FileRefController$$ExternalSyntheticLambda11(9));
                deletePeer(j, z ? 3 : 1);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(z ? NotificationCenter.reloadGuestBotHints : NotificationCenter.reloadInlineHints, new Object[0]);
                return;
            }
        }
    }

    public void clearBotKeyboard(long j) {
        AndroidUtilities.runOnUIThread(new MediaDataController$$ExternalSyntheticLambda60(this, j, 0));
    }

    public void fetchNewEmojiKeywords(String[] strArr, boolean z) {
        if (strArr == null) {
            return;
        }
        for (String str : strArr) {
            if (TextUtils.isEmpty(str) || this.currentFetchingEmoji.get(str) != null) {
                return;
            }
            if (z && this.fetchedEmoji.contains(str)) {
                return;
            }
            this.currentFetchingEmoji.put(str, Boolean.TRUE);
            getMessagesStorage().getStorageQueue().postRunnable(new MediaDataController$$ExternalSyntheticLambda1(this, str, 3));
        }
    }

    public void getEmojiSuggestions(String[] strArr, String str, boolean z, KeywordResultCallback keywordResultCallback, CountDownLatch countDownLatch, boolean z2) {
        getEmojiSuggestions(strArr, str, z, keywordResultCallback, countDownLatch, z2, false, false, null);
    }

    public ArrayList<TLRPC.MessageEntity> getEntities(CharSequence[] charSequenceArr, boolean z, boolean z2) {
        int i;
        int i2;
        int i3 = -1;
        int i4 = 1;
        ArrayList<TLRPC.MessageEntity> arrayList = null;
        if (charSequenceArr != null && charSequenceArr[0] != null) {
            boolean z3 = false;
            int i5 = 0;
            loop0: while (true) {
                i = -1;
                while (true) {
                    if (!z2) {
                        break loop0;
                    }
                    int iIndexOf = TextUtils.indexOf(charSequenceArr[0], !z3 ? "`" : "```", i5);
                    if (iIndexOf == i3) {
                        break loop0;
                    }
                    if (i == i3) {
                        z3 = charSequenceArr[0].length() - iIndexOf > 2 && charSequenceArr[0].charAt(iIndexOf + 1) == '`' && charSequenceArr[0].charAt(iIndexOf + 2) == '`';
                        i = iIndexOf;
                        i5 = (z3 ? 3 : 1) + iIndexOf;
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                        }
                        for (int i6 = (z3 ? 3 : 1) + iIndexOf; i6 < charSequenceArr[0].length() && charSequenceArr[0].charAt(i6) == '`'; i6 += i4) {
                            iIndexOf += i4;
                        }
                        int i7 = (z3 ? 3 : 1) + iIndexOf;
                        if (z3) {
                            char cCharAt = i > 0 ? charSequenceArr[0].charAt(i - 1) : (char) 0;
                            int i8 = (cCharAt == ' ' || cCharAt == '\n') ? 1 : 0;
                            int i9 = i + 3;
                            int iIndexOf2 = TextUtils.indexOf(charSequenceArr[0], '\n', i9);
                            String strSubstring = (iIndexOf2 < 0 || iIndexOf2 - i9 <= 0) ? "" : charSequenceArr[0].toString().substring(i9, iIndexOf2);
                            CharSequence charSequenceSubstring = substring(charSequenceArr[0], 0, i - i8);
                            int length = strSubstring.length() + i9 + (strSubstring.isEmpty() ^ i4);
                            if (length >= 0 && length < charSequenceArr[0].length() && length <= iIndexOf) {
                                CharSequence charSequenceSubstring2 = substring(charSequenceArr[0], length, iIndexOf);
                                int i10 = iIndexOf + 3;
                                char cCharAt2 = i10 < charSequenceArr[0].length() ? charSequenceArr[0].charAt(i10) : (char) 0;
                                CharSequence charSequence = charSequenceArr[0];
                                CharSequence charSequenceSubstring3 = substring(charSequence, i10 + ((cCharAt2 == ' ' || cCharAt2 == '\n') ? 1 : 0), charSequence.length());
                                if (charSequenceSubstring.length() != 0) {
                                    charSequenceSubstring = AndroidUtilities.concat(charSequenceSubstring, "\n");
                                } else {
                                    i8 = 1;
                                }
                                if (charSequenceSubstring3.length() > 0 && charSequenceSubstring3.charAt(0) != '\n') {
                                    charSequenceSubstring3 = AndroidUtilities.concat("\n", charSequenceSubstring3);
                                }
                                if (charSequenceSubstring2.length() <= 0 || charSequenceSubstring2.charAt(charSequenceSubstring2.length() - 1) != '\n') {
                                    i2 = 0;
                                } else {
                                    charSequenceSubstring2 = substring(charSequenceSubstring2, 0, charSequenceSubstring2.length() - 1);
                                    i2 = 1;
                                }
                                if (!TextUtils.isEmpty(charSequenceSubstring2)) {
                                    if (charSequenceSubstring2.length() > 1 && charSequenceSubstring2.charAt(0) == '\n') {
                                        charSequenceSubstring2 = charSequenceSubstring2.subSequence(1, charSequenceSubstring2.length());
                                        iIndexOf--;
                                    }
                                    charSequenceArr[0] = AndroidUtilities.concat(charSequenceSubstring, charSequenceSubstring2, charSequenceSubstring3);
                                    TLRPC.MessageEntity tL_messageEntityPre = new TLRPC.TL_messageEntityPre();
                                    int i11 = i8 ^ 1;
                                    tL_messageEntityPre.offset = i + i11;
                                    tL_messageEntityPre.length = ((((iIndexOf - i) - 3) - (strSubstring.length() + (!strSubstring.isEmpty()))) + i11) - i2;
                                    if (TextUtils.isEmpty(strSubstring) || strSubstring.trim().length() == 0) {
                                        strSubstring = "";
                                    }
                                    tL_messageEntityPre.language = strSubstring;
                                    arrayList.add(tL_messageEntityPre);
                                    i7 -= 6;
                                }
                                i5 = i7;
                                i3 = -1;
                                i4 = 1;
                                z3 = false;
                            }
                            i5 = i7;
                            i3 = -1;
                            i4 = 1;
                        } else {
                            int i12 = i + 1;
                            if (i12 != iIndexOf) {
                                CharSequence charSequence2 = charSequenceArr[0];
                                if (!(charSequence2 instanceof Spanned) || ((CodeHighlighting.Span[]) ((Spanned) charSequence2).getSpans(Utilities.clamp(i, charSequence2.length(), 0), Utilities.clamp(i12, charSequenceArr[0].length(), 0), CodeHighlighting.Span.class)).length <= 0) {
                                    CharSequence charSequenceSubstring4 = substring(charSequenceArr[0], 0, i);
                                    CharSequence charSequenceSubstring5 = substring(charSequenceArr[0], i12, iIndexOf);
                                    CharSequence charSequence3 = charSequenceArr[0];
                                    charSequenceArr[0] = AndroidUtilities.concat(charSequenceSubstring4, charSequenceSubstring5, substring(charSequence3, iIndexOf + 1, charSequence3.length()));
                                    TLRPC.MessageEntity tL_messageEntityCode = new TLRPC.TL_messageEntityCode();
                                    tL_messageEntityCode.offset = i;
                                    tL_messageEntityCode.length = (iIndexOf - i) - 1;
                                    arrayList.add(tL_messageEntityCode);
                                    i7 -= 2;
                                }
                                i5 = i7;
                                i3 = -1;
                                i4 = 1;
                            }
                            i5 = i7;
                            i3 = -1;
                            i4 = 1;
                            z3 = false;
                        }
                    }
                }
            }
            if (i != i3 && z3) {
                CharSequence charSequenceSubstring6 = substring(charSequenceArr[0], 0, i);
                CharSequence charSequence4 = charSequenceArr[0];
                charSequenceArr[0] = AndroidUtilities.concat(charSequenceSubstring6, substring(charSequence4, i + 2, charSequence4.length()));
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                TLRPC.MessageEntity tL_messageEntityCode2 = new TLRPC.TL_messageEntityCode();
                tL_messageEntityCode2.offset = i;
                tL_messageEntityCode2.length = 1;
                arrayList.add(tL_messageEntityCode2);
            }
            CharSequence charSequence5 = charSequenceArr[0];
            if (charSequence5 instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence5;
                TextStyleSpan[] textStyleSpanArr = (TextStyleSpan[]) spanned.getSpans(0, charSequence5.length(), TextStyleSpan.class);
                if (textStyleSpanArr != null && textStyleSpanArr.length > 0) {
                    for (TextStyleSpan textStyleSpan : textStyleSpanArr) {
                        int spanStart = spanned.getSpanStart(textStyleSpan);
                        int spanEnd = spanned.getSpanEnd(textStyleSpan);
                        if (!checkInclusion(spanStart, arrayList, false) && !checkInclusion(spanEnd, arrayList, true) && !checkIntersection(spanStart, spanEnd, arrayList)) {
                            if (arrayList == null) {
                                arrayList = new ArrayList<>();
                            }
                            addStyle(textStyleSpan.style.flags, spanStart, spanEnd, arrayList);
                        }
                    }
                }
                URLSpanUserMention[] uRLSpanUserMentionArr = (URLSpanUserMention[]) spanned.getSpans(0, charSequenceArr[0].length(), URLSpanUserMention.class);
                if (uRLSpanUserMentionArr != null && uRLSpanUserMentionArr.length > 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    for (int i13 = 0; i13 < uRLSpanUserMentionArr.length; i13++) {
                        TLRPC.TL_inputMessageEntityMentionName tL_inputMessageEntityMentionName = new TLRPC.TL_inputMessageEntityMentionName();
                        TLRPC.InputUser inputUser = getMessagesController().getInputUser(Utilities.parseLong(uRLSpanUserMentionArr[i13].getURL()).longValue());
                        tL_inputMessageEntityMentionName.user_id = inputUser;
                        if (inputUser != null) {
                            tL_inputMessageEntityMentionName.offset = spanned.getSpanStart(uRLSpanUserMentionArr[i13]);
                            int iMin = Math.min(spanned.getSpanEnd(uRLSpanUserMentionArr[i13]), charSequenceArr[0].length());
                            int i14 = tL_inputMessageEntityMentionName.offset;
                            int i15 = iMin - i14;
                            tL_inputMessageEntityMentionName.length = i15;
                            if (charSequenceArr[0].charAt((i14 + i15) - 1) == ' ') {
                                tL_inputMessageEntityMentionName.length--;
                            }
                            arrayList.add(tL_inputMessageEntityMentionName);
                        }
                    }
                }
                URLSpanReplacement[] uRLSpanReplacementArr = (URLSpanReplacement[]) spanned.getSpans(0, charSequenceArr[0].length(), URLSpanReplacement.class);
                if (uRLSpanReplacementArr != null && uRLSpanReplacementArr.length > 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    for (int i16 = 0; i16 < uRLSpanReplacementArr.length; i16++) {
                        TLRPC.MessageEntity tL_messageEntityTextUrl = new TLRPC.TL_messageEntityTextUrl();
                        tL_messageEntityTextUrl.offset = spanned.getSpanStart(uRLSpanReplacementArr[i16]);
                        tL_messageEntityTextUrl.length = Math.min(spanned.getSpanEnd(uRLSpanReplacementArr[i16]), charSequenceArr[0].length()) - tL_messageEntityTextUrl.offset;
                        tL_messageEntityTextUrl.url = uRLSpanReplacementArr[i16].getURL();
                        arrayList.add(tL_messageEntityTextUrl);
                        TextStyleSpan.TextStyleRun textStyleRun = uRLSpanReplacementArr[i16].style;
                        if (textStyleRun != null) {
                            int i17 = textStyleRun.flags;
                            int i18 = tL_messageEntityTextUrl.offset;
                            addStyle(i17, i18, tL_messageEntityTextUrl.length + i18, arrayList);
                        }
                    }
                }
                AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) spanned.getSpans(0, charSequenceArr[0].length(), AnimatedEmojiSpan.class);
                if (animatedEmojiSpanArr != null && animatedEmojiSpanArr.length > 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    for (AnimatedEmojiSpan animatedEmojiSpan : animatedEmojiSpanArr) {
                        if (animatedEmojiSpan != null) {
                            try {
                                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                                tL_messageEntityCustomEmoji.offset = spanned.getSpanStart(animatedEmojiSpan);
                                tL_messageEntityCustomEmoji.length = Math.min(spanned.getSpanEnd(animatedEmojiSpan), charSequenceArr[0].length()) - tL_messageEntityCustomEmoji.offset;
                                tL_messageEntityCustomEmoji.document_id = animatedEmojiSpan.getDocumentId();
                                tL_messageEntityCustomEmoji.document = animatedEmojiSpan.document;
                                arrayList.add(tL_messageEntityCustomEmoji);
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                        }
                    }
                }
                CodeHighlighting.Span[] spanArr = (CodeHighlighting.Span[]) spanned.getSpans(0, charSequenceArr[0].length(), CodeHighlighting.Span.class);
                if (spanArr != null && spanArr.length > 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    for (CodeHighlighting.Span span : spanArr) {
                        if (span != null) {
                            try {
                                TLRPC.MessageEntity tL_messageEntityPre2 = new TLRPC.TL_messageEntityPre();
                                tL_messageEntityPre2.offset = spanned.getSpanStart(span);
                                tL_messageEntityPre2.length = Math.min(spanned.getSpanEnd(span), charSequenceArr[0].length()) - tL_messageEntityPre2.offset;
                                tL_messageEntityPre2.language = span.lng;
                                arrayList.add(tL_messageEntityPre2);
                            } catch (Exception e2) {
                                FileLog.e(e2);
                            }
                        }
                    }
                }
                QuoteSpan[] quoteSpanArr = (QuoteSpan[]) spanned.getSpans(0, charSequenceArr[0].length(), QuoteSpan.class);
                if (quoteSpanArr != null && quoteSpanArr.length > 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    for (QuoteSpan quoteSpan : quoteSpanArr) {
                        if (quoteSpan != null) {
                            try {
                                TLRPC.MessageEntity tL_messageEntityBlockquote = new TLRPC.TL_messageEntityBlockquote();
                                tL_messageEntityBlockquote.offset = spanned.getSpanStart(quoteSpan);
                                tL_messageEntityBlockquote.length = Math.min(spanned.getSpanEnd(quoteSpan), charSequenceArr[0].length()) - tL_messageEntityBlockquote.offset;
                                tL_messageEntityBlockquote.collapsed = quoteSpan.isCollapsing;
                                arrayList.add(tL_messageEntityBlockquote);
                            } catch (Exception e3) {
                                FileLog.e(e3);
                            }
                        }
                    }
                }
                FormattedDateSpan[] formattedDateSpanArr = (FormattedDateSpan[]) spanned.getSpans(0, charSequenceArr[0].length(), FormattedDateSpan.class);
                if (formattedDateSpanArr != null && formattedDateSpanArr.length > 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    for (FormattedDateSpan formattedDateSpan : formattedDateSpanArr) {
                        if (formattedDateSpan != null) {
                            try {
                                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
                                tL_messageEntityFormattedDate.offset = spanned.getSpanStart(formattedDateSpan);
                                tL_messageEntityFormattedDate.length = Math.min(spanned.getSpanEnd(formattedDateSpan), charSequenceArr[0].length()) - tL_messageEntityFormattedDate.offset;
                                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate2 = formattedDateSpan.entity;
                                tL_messageEntityFormattedDate.relative = tL_messageEntityFormattedDate2.relative;
                                tL_messageEntityFormattedDate.short_time = tL_messageEntityFormattedDate2.short_time;
                                tL_messageEntityFormattedDate.long_time = tL_messageEntityFormattedDate2.long_time;
                                tL_messageEntityFormattedDate.long_date = tL_messageEntityFormattedDate2.long_date;
                                tL_messageEntityFormattedDate.short_date = tL_messageEntityFormattedDate2.short_date;
                                tL_messageEntityFormattedDate.day_of_week = tL_messageEntityFormattedDate2.day_of_week;
                                tL_messageEntityFormattedDate.date = tL_messageEntityFormattedDate2.date;
                                arrayList.add(tL_messageEntityFormattedDate);
                            } catch (Exception e4) {
                                FileLog.e(e4);
                            }
                        }
                    }
                }
                if (spanned instanceof Spannable) {
                    Spannable spannable = (Spannable) spanned;
                    AndroidUtilities.addLinksSafe(spannable, 1, false, false);
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, charSequenceArr[0].length(), URLSpan.class);
                    if (uRLSpanArr != null && uRLSpanArr.length > 0) {
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                        }
                        for (int i19 = 0; i19 < uRLSpanArr.length; i19++) {
                            URLSpan uRLSpan = uRLSpanArr[i19];
                            if (!(uRLSpan instanceof URLSpanReplacement) && !(uRLSpan instanceof URLSpanUserMention) && !(uRLSpan instanceof FormattedDateSpan)) {
                                TLRPC.MessageEntity tL_messageEntityUrl = new TLRPC.TL_messageEntityUrl();
                                tL_messageEntityUrl.offset = spanned.getSpanStart(uRLSpanArr[i19]);
                                tL_messageEntityUrl.length = Math.min(spanned.getSpanEnd(uRLSpanArr[i19]), charSequenceArr[0].length()) - tL_messageEntityUrl.offset;
                                tL_messageEntityUrl.url = uRLSpanArr[i19].getURL();
                                arrayList.add(tL_messageEntityUrl);
                                spannable.removeSpan(uRLSpanArr[i19]);
                            }
                        }
                    }
                }
            }
            CharSequence charSequenceSubSequence = charSequenceArr[0];
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (z2) {
                charSequenceSubSequence = parsePattern(parsePattern(parsePattern(charSequenceSubSequence, BOLD_PATTERN, arrayList, new SharedConfig$$ExternalSyntheticLambda5(5)), ITALIC_PATTERN, arrayList, new SharedConfig$$ExternalSyntheticLambda5(6)), SPOILER_PATTERN, arrayList, new SharedConfig$$ExternalSyntheticLambda5(7));
                if (z) {
                    charSequenceSubSequence = parsePattern(charSequenceSubSequence, STRIKE_PATTERN, arrayList, new SharedConfig$$ExternalSyntheticLambda5(8));
                }
            }
            while (charSequenceSubSequence.length() > 0 && (charSequenceSubSequence.charAt(0) == '\n' || charSequenceSubSequence.charAt(0) == ' ')) {
                charSequenceSubSequence = charSequenceSubSequence.subSequence(1, charSequenceSubSequence.length());
                for (int i20 = 0; i20 < arrayList.size(); i20++) {
                    TLRPC.MessageEntity messageEntity = arrayList.get(i20);
                    int i21 = messageEntity.offset;
                    if (i21 == 0) {
                        messageEntity.length--;
                    }
                    messageEntity.offset = Math.max(0, i21 - 1);
                }
            }
            while (charSequenceSubSequence.length() > 0 && (charSequenceSubSequence.charAt(charSequenceSubSequence.length() - 1) == '\n' || charSequenceSubSequence.charAt(charSequenceSubSequence.length() - 1) == ' ')) {
                charSequenceSubSequence = charSequenceSubSequence.subSequence(0, charSequenceSubSequence.length() - 1);
                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                    TLRPC.MessageEntity messageEntity2 = arrayList.get(i22);
                    if (messageEntity2.offset + messageEntity2.length > charSequenceSubSequence.length()) {
                        messageEntity2.length--;
                    }
                }
            }
            charSequenceArr[0] = charSequenceSubSequence;
        }
        return arrayList;
    }

    public ArrayList<TLRPC.Document> getRecentStickers(int i, boolean z) {
        ArrayList<TLRPC.Document> arrayList = this.recentStickers[i];
        if (i == 7) {
            return new ArrayList<>(this.recentStickers[i]);
        }
        ArrayList<TLRPC.Document> arrayList2 = new ArrayList<>(arrayList.subList(0, Math.min(arrayList.size(), 20)));
        if (z && !arrayList2.isEmpty()) {
            arrayList2.add(0, new TLRPC.TL_documentEmpty());
        }
        return arrayList2;
    }

    public void installShortcut(long j, int i, Utilities.Callback<Boolean> callback) {
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.User user2;
        String name;
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.FileLocation fileLocation;
        String str;
        TLRPC.FileLocation fileLocation2;
        boolean z;
        PendingIntent pendingIntent;
        Bitmap bitmapDecodeFile;
        int iDp;
        Canvas canvas;
        AvatarDrawable avatarDrawable;
        Intent intent;
        String str2;
        ShortcutInfoCompat shortcutInfoCompat;
        PendingIntent broadcast;
        Intent[] intentArr;
        TLRPC.UserProfilePhoto userProfilePhoto;
        String string;
        TLRPC.UserProfilePhoto userProfilePhoto2;
        try {
            Intent intentCreateIntrnalShortcutIntent = i == SHORTCUT_TYPE_USER_OR_CHAT ? createIntrnalShortcutIntent(j) : createIntrnalAttachedBotShortcutIntent(j);
            if (intentCreateIntrnalShortcutIntent == null) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                return;
            }
            if (!DialogObject.isEncryptedDialog(j)) {
                if (DialogObject.isUserDialog(j)) {
                    user2 = getMessagesController().getUser(Long.valueOf(j));
                } else {
                    if (!DialogObject.isChatDialog(j)) {
                        if (callback != null) {
                            callback.run(Boolean.FALSE);
                            return;
                        }
                        return;
                    }
                    chat = getMessagesController().getChat(Long.valueOf(-j));
                    user = null;
                }
                if (user != null && chat == null) {
                    if (callback != null) {
                        callback.run(Boolean.FALSE);
                        return;
                    }
                    return;
                }
                if (user != null) {
                    name = chat.title;
                    chatPhoto = chat.photo;
                    if (chatPhoto != null) {
                        fileLocation = chatPhoto.photo_small;
                        TLRPC.FileLocation fileLocation3 = fileLocation;
                        str = name;
                        fileLocation2 = fileLocation3;
                    } else {
                        str = name;
                        fileLocation2 = null;
                    }
                    z = false;
                } else if (i == SHORTCUT_TYPE_ATTACHED_BOT) {
                    name = UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j)));
                    userProfilePhoto2 = user.photo;
                    if (userProfilePhoto2 != null) {
                        fileLocation = userProfilePhoto2.photo_small;
                        TLRPC.FileLocation fileLocation4 = fileLocation;
                        str = name;
                        fileLocation2 = fileLocation4;
                    } else {
                        str = name;
                        fileLocation2 = null;
                    }
                    z = false;
                } else {
                    if (UserObject.isReplyUser(user)) {
                        string = LocaleController.getString(R.string.RepliesTitle);
                    } else if (UserObject.isUserSelf(user)) {
                        string = LocaleController.getString(R.string.SavedMessages);
                    } else {
                        name = ContactsController.formatName(user.first_name, user.last_name);
                        userProfilePhoto = user.photo;
                        if (userProfilePhoto != null) {
                            fileLocation = userProfilePhoto.photo_small;
                            TLRPC.FileLocation fileLocation5 = fileLocation;
                            str = name;
                            fileLocation2 = fileLocation5;
                        } else {
                            str = name;
                            fileLocation2 = null;
                        }
                        z = false;
                    }
                    str = string;
                    fileLocation2 = null;
                    z = true;
                }
                if (z && fileLocation2 == null) {
                    pendingIntent = null;
                    bitmapDecodeFile = null;
                } else {
                    if (z) {
                        bitmapDecodeFile = null;
                    } else {
                        try {
                            bitmapDecodeFile = BitmapFactory.decodeFile(getFileLoader().getPathToAttach(fileLocation2, true).toString());
                        } catch (Throwable th) {
                            th = th;
                            pendingIntent = null;
                            bitmapDecodeFile = null;
                            FileLog.e(th);
                            if (Build.VERSION.SDK_INT < 26) {
                                intent = new Intent();
                                if (bitmapDecodeFile != null) {
                                    intent.putExtra("android.intent.extra.shortcut.ICON", bitmapDecodeFile);
                                } else if (user != null) {
                                    if (user.bot) {
                                        intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.applicationContext, R.drawable.book_bot));
                                    } else {
                                        intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.applicationContext, R.drawable.book_user));
                                    }
                                } else if (ChatObject.isChannel(chat)) {
                                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.applicationContext, R.drawable.book_group));
                                } else {
                                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.applicationContext, R.drawable.book_group));
                                }
                                intent.putExtra("android.intent.extra.shortcut.INTENT", intentCreateIntrnalShortcutIntent);
                                intent.putExtra("android.intent.extra.shortcut.NAME", str);
                                intent.putExtra("duplicate", false);
                                intent.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
                                ApplicationLoader.applicationContext.sendBroadcast(intent);
                                return;
                            }
                            if (i == SHORTCUT_TYPE_USER_OR_CHAT) {
                                str2 = "sdid_";
                            } else {
                                str2 = "bdid_";
                            }
                            Context context = ApplicationLoader.applicationContext;
                            shortcutInfoCompat = new ShortcutInfoCompat();
                            shortcutInfoCompat.mContext = context;
                            shortcutInfoCompat.mId = str2 + j;
                            shortcutInfoCompat.mLabel = str;
                            shortcutInfoCompat.mIntents = new Intent[]{intentCreateIntrnalShortcutIntent};
                            if (bitmapDecodeFile != null) {
                                shortcutInfoCompat.mIcon = IconCompat.createWithBitmap(bitmapDecodeFile);
                            } else if (user != null) {
                                if (user.bot) {
                                    shortcutInfoCompat.mIcon = IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.book_bot);
                                } else {
                                    shortcutInfoCompat.mIcon = IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.book_user);
                                }
                            } else if (ChatObject.isChannel(chat)) {
                                shortcutInfoCompat.mIcon = IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.book_group);
                            } else {
                                shortcutInfoCompat.mIcon = IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.book_group);
                            }
                            if (callback != null) {
                                byte[] bArr = new byte[16];
                                Utilities.fastRandom.nextBytes(bArr);
                                String strBytesToHex = Utilities.bytesToHex(bArr);
                                Intent intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) ShortcutResultReceiver.class);
                                intent2.putExtra("account", this.currentAccount);
                                intent2.putExtra("req_id", strBytesToHex);
                                broadcast = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, intent2, 167772160);
                                this.shortcutCallbacks.put(strBytesToHex, callback);
                            } else {
                                broadcast = pendingIntent;
                            }
                            Context context2 = ApplicationLoader.applicationContext;
                            if (TextUtils.isEmpty(shortcutInfoCompat.mLabel)) {
                                throw new IllegalArgumentException("Shortcut must have a non-empty label");
                            }
                            intentArr = shortcutInfoCompat.mIntents;
                            if (intentArr != null) {
                            }
                            throw new IllegalArgumentException("Shortcut must have an intent");
                        }
                    }
                    if (z && bitmapDecodeFile == null) {
                        pendingIntent = null;
                    } else {
                        try {
                            iDp = AndroidUtilities.dp(58.0f);
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iDp, iDp, Bitmap.Config.ARGB_8888);
                            bitmapCreateBitmap.eraseColor(0);
                            canvas = new Canvas(bitmapCreateBitmap);
                            try {
                                if (z) {
                                    avatarDrawable = new AvatarDrawable(user);
                                    if (UserObject.isReplyUser(user)) {
                                        avatarDrawable.setAvatarType(12);
                                    } else {
                                        avatarDrawable.setAvatarType(1);
                                    }
                                    avatarDrawable.setBounds(0, 0, iDp, iDp);
                                    avatarDrawable.draw(canvas);
                                } else {
                                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                                    BitmapShader bitmapShader = new BitmapShader(bitmapDecodeFile, tileMode, tileMode);
                                    if (roundPaint == null) {
                                        roundPaint = new Paint(1);
                                        bitmapRect = new RectF();
                                    }
                                    float width = iDp / bitmapDecodeFile.getWidth();
                                    canvas.save();
                                    canvas.scale(width, width);
                                    roundPaint.setShader(bitmapShader);
                                    bitmapRect.set(0.0f, 0.0f, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight());
                                    canvas.drawRoundRect(bitmapRect, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), roundPaint);
                                    canvas.restore();
                                }
                                Drawable drawable = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.book_logo);
                                int iDp2 = AndroidUtilities.dp(15.0f);
                                int i2 = iDp - iDp2;
                                int iDp3 = i2 - AndroidUtilities.dp(2.0f);
                                int iDp4 = i2 - AndroidUtilities.dp(2.0f);
                                Bitmap bitmap = bitmapDecodeFile;
                                try {
                                    drawable.setBounds(iDp3, iDp4, iDp3 + iDp2, iDp4 + iDp2);
                                    drawable.draw(canvas);
                                    pendingIntent = null;
                                    try {
                                        canvas.setBitmap(null);
                                    } catch (Exception unused) {
                                    } catch (Throwable th2) {
                                        th = th2;
                                        bitmapDecodeFile = bitmap;
                                        FileLog.e(th);
                                        if (Build.VERSION.SDK_INT < 26) {
                                            intent = new Intent();
                                            if (bitmapDecodeFile != null) {
                                                intent.putExtra("android.intent.extra.shortcut.ICON", bitmapDecodeFile);
                                            } else if (user != null) {
                                                if (user.bot) {
                                                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.applicationContext, R.drawable.book_bot));
                                                } else {
                                                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.applicationContext, R.drawable.book_user));
                                                }
                                            } else if (ChatObject.isChannel(chat)) {
                                                intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.applicationContext, R.drawable.book_group));
                                            } else {
                                                intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.applicationContext, R.drawable.book_group));
                                            }
                                            intent.putExtra("android.intent.extra.shortcut.INTENT", intentCreateIntrnalShortcutIntent);
                                            intent.putExtra("android.intent.extra.shortcut.NAME", str);
                                            intent.putExtra("duplicate", false);
                                            intent.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
                                            ApplicationLoader.applicationContext.sendBroadcast(intent);
                                            return;
                                        }
                                        if (i == SHORTCUT_TYPE_USER_OR_CHAT) {
                                            str2 = "sdid_";
                                        } else {
                                            str2 = "bdid_";
                                        }
                                        Context context3 = ApplicationLoader.applicationContext;
                                        shortcutInfoCompat = new ShortcutInfoCompat();
                                        shortcutInfoCompat.mContext = context3;
                                        shortcutInfoCompat.mId = str2 + j;
                                        shortcutInfoCompat.mLabel = str;
                                        shortcutInfoCompat.mIntents = new Intent[]{intentCreateIntrnalShortcutIntent};
                                        if (bitmapDecodeFile != null) {
                                            shortcutInfoCompat.mIcon = IconCompat.createWithBitmap(bitmapDecodeFile);
                                        } else if (user != null) {
                                            if (user.bot) {
                                                shortcutInfoCompat.mIcon = IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.book_bot);
                                            } else {
                                                shortcutInfoCompat.mIcon = IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.book_user);
                                            }
                                        } else if (ChatObject.isChannel(chat)) {
                                            shortcutInfoCompat.mIcon = IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.book_group);
                                        } else {
                                            shortcutInfoCompat.mIcon = IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.book_group);
                                        }
                                        if (callback != null) {
                                            byte[] bArr2 = new byte[16];
                                            Utilities.fastRandom.nextBytes(bArr2);
                                            String strBytesToHex2 = Utilities.bytesToHex(bArr2);
                                            Intent intent3 = new Intent(ApplicationLoader.applicationContext, (Class<?>) ShortcutResultReceiver.class);
                                            intent3.putExtra("account", this.currentAccount);
                                            intent3.putExtra("req_id", strBytesToHex2);
                                            broadcast = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, intent3, 167772160);
                                            this.shortcutCallbacks.put(strBytesToHex2, callback);
                                        } else {
                                            broadcast = pendingIntent;
                                        }
                                        Context context4 = ApplicationLoader.applicationContext;
                                        if (TextUtils.isEmpty(shortcutInfoCompat.mLabel)) {
                                            throw new IllegalArgumentException("Shortcut must have a non-empty label");
                                        }
                                        intentArr = shortcutInfoCompat.mIntents;
                                        if (intentArr != null) {
                                        }
                                        throw new IllegalArgumentException("Shortcut must have an intent");
                                    }
                                    bitmapDecodeFile = bitmapCreateBitmap;
                                } catch (Throwable th3) {
                                    th = th3;
                                    pendingIntent = null;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                pendingIntent = null;
                                FileLog.e(th);
                                if (Build.VERSION.SDK_INT < 26) {
                                    intent = new Intent();
                                    if (bitmapDecodeFile != null) {
                                        intent.putExtra("android.intent.extra.shortcut.ICON", bitmapDecodeFile);
                                    } else if (user != null) {
                                        if (user.bot) {
                                            intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.applicationContext, R.drawable.book_bot));
                                        } else {
                                            intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.applicationContext, R.drawable.book_user));
                                        }
                                    } else if (ChatObject.isChannel(chat)) {
                                        intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.applicationContext, R.drawable.book_group));
                                    } else {
                                        intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.applicationContext, R.drawable.book_group));
                                    }
                                    intent.putExtra("android.intent.extra.shortcut.INTENT", intentCreateIntrnalShortcutIntent);
                                    intent.putExtra("android.intent.extra.shortcut.NAME", str);
                                    intent.putExtra("duplicate", false);
                                    intent.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
                                    ApplicationLoader.applicationContext.sendBroadcast(intent);
                                    return;
                                }
                                if (i == SHORTCUT_TYPE_USER_OR_CHAT) {
                                    str2 = "sdid_";
                                } else {
                                    str2 = "bdid_";
                                }
                                Context context5 = ApplicationLoader.applicationContext;
                                shortcutInfoCompat = new ShortcutInfoCompat();
                                shortcutInfoCompat.mContext = context5;
                                shortcutInfoCompat.mId = str2 + j;
                                shortcutInfoCompat.mLabel = str;
                                shortcutInfoCompat.mIntents = new Intent[]{intentCreateIntrnalShortcutIntent};
                                if (bitmapDecodeFile != null) {
                                    shortcutInfoCompat.mIcon = IconCompat.createWithBitmap(bitmapDecodeFile);
                                } else if (user != null) {
                                    if (user.bot) {
                                        shortcutInfoCompat.mIcon = IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.book_bot);
                                    } else {
                                        shortcutInfoCompat.mIcon = IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.book_user);
                                    }
                                } else if (ChatObject.isChannel(chat)) {
                                    shortcutInfoCompat.mIcon = IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.book_group);
                                } else {
                                    shortcutInfoCompat.mIcon = IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.book_group);
                                }
                                if (callback != null) {
                                    byte[] bArr3 = new byte[16];
                                    Utilities.fastRandom.nextBytes(bArr3);
                                    String strBytesToHex3 = Utilities.bytesToHex(bArr3);
                                    Intent intent4 = new Intent(ApplicationLoader.applicationContext, (Class<?>) ShortcutResultReceiver.class);
                                    intent4.putExtra("account", this.currentAccount);
                                    intent4.putExtra("req_id", strBytesToHex3);
                                    broadcast = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, intent4, 167772160);
                                    this.shortcutCallbacks.put(strBytesToHex3, callback);
                                } else {
                                    broadcast = pendingIntent;
                                }
                                Context context6 = ApplicationLoader.applicationContext;
                                if (TextUtils.isEmpty(shortcutInfoCompat.mLabel)) {
                                    throw new IllegalArgumentException("Shortcut must have a non-empty label");
                                }
                                intentArr = shortcutInfoCompat.mIntents;
                                if (intentArr != null) {
                                }
                                throw new IllegalArgumentException("Shortcut must have an intent");
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    }
                }
                if (Build.VERSION.SDK_INT < 26) {
                    intent = new Intent();
                    if (bitmapDecodeFile != null) {
                        intent.putExtra("android.intent.extra.shortcut.ICON", bitmapDecodeFile);
                    } else if (user != null) {
                        if (user.bot) {
                            intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.applicationContext, R.drawable.book_bot));
                        } else {
                            intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.applicationContext, R.drawable.book_user));
                        }
                    } else if (ChatObject.isChannel(chat) || chat.megagroup) {
                        intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.applicationContext, R.drawable.book_group));
                    } else {
                        intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.applicationContext, R.drawable.book_channel));
                    }
                    intent.putExtra("android.intent.extra.shortcut.INTENT", intentCreateIntrnalShortcutIntent);
                    intent.putExtra("android.intent.extra.shortcut.NAME", str);
                    intent.putExtra("duplicate", false);
                    intent.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
                    ApplicationLoader.applicationContext.sendBroadcast(intent);
                    return;
                }
                if (i == SHORTCUT_TYPE_USER_OR_CHAT) {
                    str2 = "sdid_";
                } else {
                    str2 = "bdid_";
                }
                Context context7 = ApplicationLoader.applicationContext;
                shortcutInfoCompat = new ShortcutInfoCompat();
                shortcutInfoCompat.mContext = context7;
                shortcutInfoCompat.mId = str2 + j;
                shortcutInfoCompat.mLabel = str;
                shortcutInfoCompat.mIntents = new Intent[]{intentCreateIntrnalShortcutIntent};
                if (bitmapDecodeFile != null) {
                    shortcutInfoCompat.mIcon = IconCompat.createWithBitmap(bitmapDecodeFile);
                } else if (user != null) {
                    if (user.bot) {
                        shortcutInfoCompat.mIcon = IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.book_bot);
                    } else {
                        shortcutInfoCompat.mIcon = IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.book_user);
                    }
                } else if (ChatObject.isChannel(chat) || chat.megagroup) {
                    shortcutInfoCompat.mIcon = IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.book_group);
                } else {
                    shortcutInfoCompat.mIcon = IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.book_channel);
                }
                if (callback != null) {
                    byte[] bArr4 = new byte[16];
                    Utilities.fastRandom.nextBytes(bArr4);
                    String strBytesToHex4 = Utilities.bytesToHex(bArr4);
                    Intent intent5 = new Intent(ApplicationLoader.applicationContext, (Class<?>) ShortcutResultReceiver.class);
                    intent5.putExtra("account", this.currentAccount);
                    intent5.putExtra("req_id", strBytesToHex4);
                    broadcast = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, intent5, 167772160);
                    this.shortcutCallbacks.put(strBytesToHex4, callback);
                } else {
                    broadcast = pendingIntent;
                }
                Context context8 = ApplicationLoader.applicationContext;
                if (TextUtils.isEmpty(shortcutInfoCompat.mLabel)) {
                    throw new IllegalArgumentException("Shortcut must have a non-empty label");
                }
                intentArr = shortcutInfoCompat.mIntents;
                if (intentArr != null || intentArr.length == 0) {
                    throw new IllegalArgumentException("Shortcut must have an intent");
                }
                FragmentManager.FragmentIntentSenderContract.requestPinShortcut(context8, shortcutInfoCompat, broadcast == null ? pendingIntent : broadcast.getIntentSender());
                return;
            }
            TLRPC.EncryptedChat encryptedChat = getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(j)));
            if (encryptedChat == null) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                return;
            }
            user2 = getMessagesController().getUser(Long.valueOf(encryptedChat.user_id));
            user = user2;
            chat = null;
            if (user != null) {
            }
            if (user != null) {
                name = chat.title;
                chatPhoto = chat.photo;
                if (chatPhoto != null) {
                    fileLocation = chatPhoto.photo_small;
                    TLRPC.FileLocation fileLocation6 = fileLocation;
                    str = name;
                    fileLocation2 = fileLocation6;
                } else {
                    str = name;
                    fileLocation2 = null;
                }
                z = false;
            } else if (i == SHORTCUT_TYPE_ATTACHED_BOT) {
                name = UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j)));
                userProfilePhoto2 = user.photo;
                if (userProfilePhoto2 != null) {
                    fileLocation = userProfilePhoto2.photo_small;
                    TLRPC.FileLocation fileLocation7 = fileLocation;
                    str = name;
                    fileLocation2 = fileLocation7;
                } else {
                    str = name;
                    fileLocation2 = null;
                }
                z = false;
            } else {
                if (UserObject.isReplyUser(user)) {
                    string = LocaleController.getString(R.string.RepliesTitle);
                } else if (UserObject.isUserSelf(user)) {
                    string = LocaleController.getString(R.string.SavedMessages);
                } else {
                    name = ContactsController.formatName(user.first_name, user.last_name);
                    userProfilePhoto = user.photo;
                    if (userProfilePhoto != null) {
                        fileLocation = userProfilePhoto.photo_small;
                        TLRPC.FileLocation fileLocation8 = fileLocation;
                        str = name;
                        fileLocation2 = fileLocation8;
                    } else {
                        str = name;
                        fileLocation2 = null;
                    }
                    z = false;
                }
                str = string;
                fileLocation2 = null;
                z = true;
            }
            if (z) {
                if (z) {
                    bitmapDecodeFile = BitmapFactory.decodeFile(getFileLoader().getPathToAttach(fileLocation2, true).toString());
                } else {
                    bitmapDecodeFile = null;
                }
                if (z) {
                    iDp = AndroidUtilities.dp(58.0f);
                    Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(iDp, iDp, Bitmap.Config.ARGB_8888);
                    bitmapCreateBitmap2.eraseColor(0);
                    canvas = new Canvas(bitmapCreateBitmap2);
                    if (z) {
                        avatarDrawable = new AvatarDrawable(user);
                        if (UserObject.isReplyUser(user)) {
                            avatarDrawable.setAvatarType(12);
                        } else {
                            avatarDrawable.setAvatarType(1);
                        }
                        avatarDrawable.setBounds(0, 0, iDp, iDp);
                        avatarDrawable.draw(canvas);
                    } else {
                        Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader2 = new BitmapShader(bitmapDecodeFile, tileMode2, tileMode2);
                        if (roundPaint == null) {
                            roundPaint = new Paint(1);
                            bitmapRect = new RectF();
                        }
                        float width2 = iDp / bitmapDecodeFile.getWidth();
                        canvas.save();
                        canvas.scale(width2, width2);
                        roundPaint.setShader(bitmapShader2);
                        bitmapRect.set(0.0f, 0.0f, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight());
                        canvas.drawRoundRect(bitmapRect, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), roundPaint);
                        canvas.restore();
                    }
                    Drawable drawable2 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.book_logo);
                    int iDp5 = AndroidUtilities.dp(15.0f);
                    int i3 = iDp - iDp5;
                    int iDp6 = i3 - AndroidUtilities.dp(2.0f);
                    int iDp7 = i3 - AndroidUtilities.dp(2.0f);
                    Bitmap bitmap2 = bitmapDecodeFile;
                    drawable2.setBounds(iDp6, iDp7, iDp6 + iDp5, iDp7 + iDp5);
                    drawable2.draw(canvas);
                    pendingIntent = null;
                    canvas.setBitmap(null);
                    bitmapDecodeFile = bitmapCreateBitmap2;
                } else {
                    iDp = AndroidUtilities.dp(58.0f);
                    Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(iDp, iDp, Bitmap.Config.ARGB_8888);
                    bitmapCreateBitmap3.eraseColor(0);
                    canvas = new Canvas(bitmapCreateBitmap3);
                    if (z) {
                        avatarDrawable = new AvatarDrawable(user);
                        if (UserObject.isReplyUser(user)) {
                            avatarDrawable.setAvatarType(12);
                        } else {
                            avatarDrawable.setAvatarType(1);
                        }
                        avatarDrawable.setBounds(0, 0, iDp, iDp);
                        avatarDrawable.draw(canvas);
                    } else {
                        Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader3 = new BitmapShader(bitmapDecodeFile, tileMode3, tileMode3);
                        if (roundPaint == null) {
                            roundPaint = new Paint(1);
                            bitmapRect = new RectF();
                        }
                        float width3 = iDp / bitmapDecodeFile.getWidth();
                        canvas.save();
                        canvas.scale(width3, width3);
                        roundPaint.setShader(bitmapShader3);
                        bitmapRect.set(0.0f, 0.0f, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight());
                        canvas.drawRoundRect(bitmapRect, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), roundPaint);
                        canvas.restore();
                    }
                    Drawable drawable3 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.book_logo);
                    int iDp8 = AndroidUtilities.dp(15.0f);
                    int i4 = iDp - iDp8;
                    int iDp9 = i4 - AndroidUtilities.dp(2.0f);
                    int iDp10 = i4 - AndroidUtilities.dp(2.0f);
                    Bitmap bitmap3 = bitmapDecodeFile;
                    drawable3.setBounds(iDp9, iDp10, iDp9 + iDp8, iDp10 + iDp8);
                    drawable3.draw(canvas);
                    pendingIntent = null;
                    canvas.setBitmap(null);
                    bitmapDecodeFile = bitmapCreateBitmap3;
                }
            } else {
                if (z) {
                    bitmapDecodeFile = BitmapFactory.decodeFile(getFileLoader().getPathToAttach(fileLocation2, true).toString());
                } else {
                    bitmapDecodeFile = null;
                }
                if (z) {
                    iDp = AndroidUtilities.dp(58.0f);
                    Bitmap bitmapCreateBitmap4 = Bitmap.createBitmap(iDp, iDp, Bitmap.Config.ARGB_8888);
                    bitmapCreateBitmap4.eraseColor(0);
                    canvas = new Canvas(bitmapCreateBitmap4);
                    if (z) {
                        avatarDrawable = new AvatarDrawable(user);
                        if (UserObject.isReplyUser(user)) {
                            avatarDrawable.setAvatarType(12);
                        } else {
                            avatarDrawable.setAvatarType(1);
                        }
                        avatarDrawable.setBounds(0, 0, iDp, iDp);
                        avatarDrawable.draw(canvas);
                    } else {
                        Shader.TileMode tileMode4 = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader4 = new BitmapShader(bitmapDecodeFile, tileMode4, tileMode4);
                        if (roundPaint == null) {
                            roundPaint = new Paint(1);
                            bitmapRect = new RectF();
                        }
                        float width4 = iDp / bitmapDecodeFile.getWidth();
                        canvas.save();
                        canvas.scale(width4, width4);
                        roundPaint.setShader(bitmapShader4);
                        bitmapRect.set(0.0f, 0.0f, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight());
                        canvas.drawRoundRect(bitmapRect, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), roundPaint);
                        canvas.restore();
                    }
                    Drawable drawable4 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.book_logo);
                    int iDp11 = AndroidUtilities.dp(15.0f);
                    int i5 = iDp - iDp11;
                    int iDp12 = i5 - AndroidUtilities.dp(2.0f);
                    int iDp13 = i5 - AndroidUtilities.dp(2.0f);
                    Bitmap bitmap4 = bitmapDecodeFile;
                    drawable4.setBounds(iDp12, iDp13, iDp12 + iDp11, iDp13 + iDp11);
                    drawable4.draw(canvas);
                    pendingIntent = null;
                    canvas.setBitmap(null);
                    bitmapDecodeFile = bitmapCreateBitmap4;
                } else {
                    iDp = AndroidUtilities.dp(58.0f);
                    Bitmap bitmapCreateBitmap5 = Bitmap.createBitmap(iDp, iDp, Bitmap.Config.ARGB_8888);
                    bitmapCreateBitmap5.eraseColor(0);
                    canvas = new Canvas(bitmapCreateBitmap5);
                    if (z) {
                        avatarDrawable = new AvatarDrawable(user);
                        if (UserObject.isReplyUser(user)) {
                            avatarDrawable.setAvatarType(12);
                        } else {
                            avatarDrawable.setAvatarType(1);
                        }
                        avatarDrawable.setBounds(0, 0, iDp, iDp);
                        avatarDrawable.draw(canvas);
                    } else {
                        Shader.TileMode tileMode5 = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader5 = new BitmapShader(bitmapDecodeFile, tileMode5, tileMode5);
                        if (roundPaint == null) {
                            roundPaint = new Paint(1);
                            bitmapRect = new RectF();
                        }
                        float width5 = iDp / bitmapDecodeFile.getWidth();
                        canvas.save();
                        canvas.scale(width5, width5);
                        roundPaint.setShader(bitmapShader5);
                        bitmapRect.set(0.0f, 0.0f, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight());
                        canvas.drawRoundRect(bitmapRect, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), roundPaint);
                        canvas.restore();
                    }
                    Drawable drawable5 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.book_logo);
                    int iDp14 = AndroidUtilities.dp(15.0f);
                    int i6 = iDp - iDp14;
                    int iDp15 = i6 - AndroidUtilities.dp(2.0f);
                    int iDp16 = i6 - AndroidUtilities.dp(2.0f);
                    Bitmap bitmap5 = bitmapDecodeFile;
                    drawable5.setBounds(iDp15, iDp16, iDp15 + iDp14, iDp16 + iDp14);
                    drawable5.draw(canvas);
                    pendingIntent = null;
                    canvas.setBitmap(null);
                    bitmapDecodeFile = bitmapCreateBitmap5;
                }
            }
            if (Build.VERSION.SDK_INT < 26) {
                intent = new Intent();
                if (bitmapDecodeFile != null) {
                    intent.putExtra("android.intent.extra.shortcut.ICON", bitmapDecodeFile);
                } else if (user != null) {
                    if (user.bot) {
                        intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.applicationContext, R.drawable.book_bot));
                    } else {
                        intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.applicationContext, R.drawable.book_user));
                    }
                } else if (ChatObject.isChannel(chat)) {
                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.applicationContext, R.drawable.book_group));
                } else {
                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.applicationContext, R.drawable.book_group));
                }
                intent.putExtra("android.intent.extra.shortcut.INTENT", intentCreateIntrnalShortcutIntent);
                intent.putExtra("android.intent.extra.shortcut.NAME", str);
                intent.putExtra("duplicate", false);
                intent.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
                ApplicationLoader.applicationContext.sendBroadcast(intent);
                return;
            }
            if (i == SHORTCUT_TYPE_USER_OR_CHAT) {
                str2 = "sdid_";
            } else {
                str2 = "bdid_";
            }
            Context context9 = ApplicationLoader.applicationContext;
            shortcutInfoCompat = new ShortcutInfoCompat();
            shortcutInfoCompat.mContext = context9;
            shortcutInfoCompat.mId = str2 + j;
            shortcutInfoCompat.mLabel = str;
            shortcutInfoCompat.mIntents = new Intent[]{intentCreateIntrnalShortcutIntent};
            if (bitmapDecodeFile != null) {
                shortcutInfoCompat.mIcon = IconCompat.createWithBitmap(bitmapDecodeFile);
            } else if (user != null) {
                if (user.bot) {
                    shortcutInfoCompat.mIcon = IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.book_bot);
                } else {
                    shortcutInfoCompat.mIcon = IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.book_user);
                }
            } else if (ChatObject.isChannel(chat)) {
                shortcutInfoCompat.mIcon = IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.book_group);
            } else {
                shortcutInfoCompat.mIcon = IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.book_group);
            }
            if (callback != null) {
                byte[] bArr5 = new byte[16];
                Utilities.fastRandom.nextBytes(bArr5);
                String strBytesToHex5 = Utilities.bytesToHex(bArr5);
                Intent intent6 = new Intent(ApplicationLoader.applicationContext, (Class<?>) ShortcutResultReceiver.class);
                intent6.putExtra("account", this.currentAccount);
                intent6.putExtra("req_id", strBytesToHex5);
                broadcast = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, intent6, 167772160);
                this.shortcutCallbacks.put(strBytesToHex5, callback);
            } else {
                broadcast = pendingIntent;
            }
            Context context10 = ApplicationLoader.applicationContext;
            if (TextUtils.isEmpty(shortcutInfoCompat.mLabel)) {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
            intentArr = shortcutInfoCompat.mIntents;
            if (intentArr != null) {
            }
            throw new IllegalArgumentException("Shortcut must have an intent");
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public boolean isStickerPackInstalled(long j, boolean z) {
        if (this.installedStickerSetsById.indexOfKey(j) >= 0 || (z && this.installedForceStickerSetsById.contains(Long.valueOf(j)))) {
            return (z && this.uninstalledForceStickerSetsById.contains(Long.valueOf(j))) ? false : true;
        }
        return false;
    }

    public void loadAttachMenuBots(boolean z, boolean z2, Runnable runnable) {
        this.isLoadingMenuBots = true;
        if (z) {
            getMessagesStorage().getStorageQueue().postRunnable(new MediaDataController$$ExternalSyntheticLambda3(this, 13));
            return;
        }
        TLRPC.TL_messages_getAttachMenuBots tL_messages_getAttachMenuBots = new TLRPC.TL_messages_getAttachMenuBots();
        tL_messages_getAttachMenuBots.hash = z2 ? 0L : this.menuBotsUpdateHash;
        getConnectionsManager().sendRequest(tL_messages_getAttachMenuBots, new UserNameResolver$$ExternalSyntheticLambda0(6, this, runnable));
    }

    public void loadBotInfo(long j, long j2, boolean z, int i, Utilities.Callback<TL_bots.BotInfo> callback) {
        if (z) {
            TL_bots.BotInfo botInfo = this.botInfos.get(j + "_" + j2);
            if (botInfo != null) {
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botInfoDidLoad, botInfo, Integer.valueOf(i));
                return;
            }
        }
        getMessagesStorage().getStorageQueue().postRunnable(new MessagesStorage$$ExternalSyntheticLambda15(this, j, j2, callback, i, 1));
    }

    public void loadBotKeyboard(MessagesStorage.TopicKey topicKey, boolean z) {
        TLRPC.Message message = this.botKeyboards.get(topicKey);
        if (message != null) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botKeyboardDidLoad, message, topicKey);
        } else {
            getMessagesStorage().getStorageQueue().postRunnable(new FileLoader$$ExternalSyntheticLambda11(this, topicKey, z, 3));
        }
    }

    public void loadStickers(int i, boolean z, boolean z2, boolean z3) {
        loadStickers(i, z, z2, z3, null);
    }

    public void preloadImage(ImageReceiver imageReceiver, ImageLocation imageLocation, String str) {
        if (LiteMode.isEnabled(8200)) {
            imageReceiver.setUniqKeyPrefix("preload");
            imageReceiver.setFileLoadingPriority(0);
            imageReceiver.setImage(imageLocation, str, null, null, 0, 11);
        }
    }

    public void putStickerSet(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z) {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null) {
            return;
        }
        this.stickerSetsById.put(tL_messages_stickerSet, stickerSet.id);
        if (!TextUtils.isEmpty(tL_messages_stickerSet.set.short_name)) {
            this.stickerSetsByName.put(tL_messages_stickerSet.set.short_name.toLowerCase(), tL_messages_stickerSet);
        }
        int i = 0;
        while (true) {
            ArrayList<TLRPC.TL_messages_stickerSet>[] arrayListArr = this.stickerSets;
            if (i >= arrayListArr.length) {
                break;
            }
            ArrayList<TLRPC.TL_messages_stickerSet> arrayList = arrayListArr[i];
            if (arrayList != null) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayList.get(i2);
                    if (tL_messages_stickerSet2 != null && (stickerSet2 = tL_messages_stickerSet2.set) != null && stickerSet2.id == tL_messages_stickerSet.set.id) {
                        arrayList.set(i2, tL_messages_stickerSet);
                    }
                }
            }
            i++;
        }
        if (this.groupStickerSets.containsKey(tL_messages_stickerSet.set.id)) {
            this.groupStickerSets.put(tL_messages_stickerSet, tL_messages_stickerSet.set.id);
        }
        saveStickerSetIntoCache(tL_messages_stickerSet);
        TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet.set;
        int i3 = stickerSet3.masks ? 1 : stickerSet3.emojis ? 5 : 0;
        if (z) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i3), Boolean.TRUE);
        }
    }

    public void saveDraft(long j, long j2, CharSequence charSequence, ArrayList<TLRPC.MessageEntity> arrayList, TLRPC.Message message, ChatActivity.ReplyQuote replyQuote, TLRPC.SuggestedPost suggestedPost, long j3, boolean z, boolean z2) {
        saveDraft(j, j2, charSequence, arrayList, message, replyQuote, suggestedPost, j3, z, z2, null);
    }

    public void searchMessagesInChat(String str, final long j, final long j2, final int i, final int i2, final long j3, boolean z, final TLRPC.User user, final TLRPC.Chat chat, final boolean z2, final ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
        char c;
        long j4;
        boolean z3;
        int id;
        String str2;
        char c2;
        final int i3;
        final long j5;
        final String str3;
        long j6;
        boolean z4 = !z;
        if (this.reqId != 0) {
            this.loadingMoreSearchMessages = false;
            c = 6;
            getConnectionsManager().cancelRequest(this.reqId, true);
            this.reqId = 0;
        } else {
            c = 6;
        }
        if (this.mergeReqId != 0) {
            getConnectionsManager().cancelRequest(this.mergeReqId, true);
            this.mergeReqId = 0;
        }
        if (str != null) {
            if (!z) {
                boolean[] zArr = this.messagesSearchEndReached;
                zArr[1] = false;
                zArr[0] = false;
                int[] iArr = this.messagesSearchCount;
                iArr[1] = 0;
                iArr[0] = 0;
                this.searchResultMessages.clear();
                this.searchLocalResultMessages.clear();
                this.searchServerResultMessagesMap[0].clear();
                this.searchServerResultMessagesMap[1].clear();
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatSearchResultsLoading, Integer.valueOf(i));
            }
            j4 = j;
            z3 = z4;
            id = 0;
            str2 = str;
        } else {
            if (this.searchResultMessages.isEmpty()) {
                this.loadingMoreSearchMessages = false;
                return;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    this.loadingMoreSearchMessages = false;
                    return;
                }
                int i4 = this.lastReturnedNum - 1;
                this.lastReturnedNum = i4;
                if (i4 < 0) {
                    this.lastReturnedNum = 0;
                    return;
                }
                if (i4 >= this.searchResultMessages.size()) {
                    this.lastReturnedNum = this.searchResultMessages.size() - 1;
                }
                MessageObject messageObject = this.searchResultMessages.get(this.lastReturnedNum);
                NotificationCenter notificationCenter = getNotificationCenter();
                int i5 = NotificationCenter.chatSearchResultsAvailable;
                Integer numValueOf = Integer.valueOf(i);
                Integer numValueOf2 = Integer.valueOf(messageObject.getId());
                Integer numValueOf3 = Integer.valueOf(getMask());
                Long lValueOf = Long.valueOf(messageObject.getDialogId());
                Integer numValueOf4 = Integer.valueOf(this.lastReturnedNum);
                Integer numValueOf5 = Integer.valueOf(getSearchCount());
                Boolean boolValueOf = Boolean.valueOf(z2);
                Object[] objArr = new Object[7];
                objArr[0] = numValueOf;
                objArr[1] = numValueOf2;
                objArr[2] = numValueOf3;
                objArr[3] = lValueOf;
                objArr[4] = numValueOf4;
                objArr[5] = numValueOf5;
                objArr[c] = boolValueOf;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i5, objArr);
                this.loadingMoreSearchMessages = false;
                return;
            }
            int i6 = this.lastReturnedNum + 1;
            this.lastReturnedNum = i6;
            if (i6 < this.searchResultMessages.size()) {
                MessageObject messageObject2 = this.searchResultMessages.get(this.lastReturnedNum);
                NotificationCenter notificationCenter2 = getNotificationCenter();
                int i7 = NotificationCenter.chatSearchResultsAvailable;
                Integer numValueOf6 = Integer.valueOf(i);
                Integer numValueOf7 = Integer.valueOf(messageObject2.getId());
                Integer numValueOf8 = Integer.valueOf(getMask());
                Long lValueOf2 = Long.valueOf(messageObject2.getDialogId());
                Integer numValueOf9 = Integer.valueOf(this.lastReturnedNum);
                Integer numValueOf10 = Integer.valueOf(getSearchCount());
                Boolean boolValueOf2 = Boolean.valueOf(z2);
                Object[] objArr2 = new Object[7];
                objArr2[0] = numValueOf6;
                objArr2[1] = numValueOf7;
                objArr2[2] = numValueOf8;
                objArr2[3] = lValueOf2;
                objArr2[4] = numValueOf9;
                objArr2[5] = numValueOf10;
                objArr2[c] = boolValueOf2;
                notificationCenter2.lambda$postNotificationNameOnUIThread$1(i7, objArr2);
                this.loadingMoreSearchMessages = false;
                return;
            }
            boolean[] zArr2 = this.messagesSearchEndReached;
            if (zArr2[0] && j2 == 0 && zArr2[1]) {
                this.lastReturnedNum--;
                this.loadingMoreSearchMessages = false;
                return;
            }
            str2 = this.lastSearchQuery;
            MessageObject messageObject3 = (MessageObject) zziq.m(1, this.searchResultMessages);
            if (messageObject3.getDialogId() != j || this.messagesSearchEndReached[0]) {
                id = messageObject3.getDialogId() == j2 ? messageObject3.getId() : 0;
                this.messagesSearchEndReached[1] = false;
                j4 = j2;
            } else {
                id = messageObject3.getId();
                j4 = j;
            }
            z3 = false;
        }
        boolean z5 = str2 != null && (str2.trim().startsWith("#") || str2.trim().startsWith("$"));
        boolean[] zArr3 = this.messagesSearchEndReached;
        long j7 = (!zArr3[0] || zArr3[1] || j2 == 0) ? j4 : j2;
        if (j7 != j || !z3) {
            c2 = 1;
        } else {
            if (j2 != r6) {
                TLRPC.InputPeer inputPeer = getMessagesController().getInputPeer(j2);
                if (inputPeer == null) {
                    return;
                }
                final TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.peer = inputPeer;
                this.lastMergeDialogId = j2;
                tL_messages_search.limit = 1;
                tL_messages_search.q = str2;
                if (user != null) {
                    tL_messages_search.from_id = MessagesController.getInputPeer(user);
                    tL_messages_search.flags |= 1;
                } else if (chat != null) {
                    tL_messages_search.from_id = MessagesController.getInputPeer(chat);
                    tL_messages_search.flags |= 1;
                }
                if (j3 != r6) {
                    if (j == getUserConfig().getClientUserId() || getMessagesStorage().isMonoForum(j7)) {
                        tL_messages_search.saved_peer_id = getMessagesController().getInputPeer(j3);
                        tL_messages_search.flags |= 4;
                    } else {
                        tL_messages_search.top_msg_id = (int) j3;
                        tL_messages_search.flags |= 2;
                    }
                }
                if (visibleReaction != null) {
                    tL_messages_search.saved_reaction.add(visibleReaction.toTLReaction());
                    tL_messages_search.flags |= 8;
                }
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                this.mergeReqId = getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        this.f$0.lambda$searchMessagesInChat$121(j2, tL_messages_search, j, i, i2, j3, user, chat, z2, visibleReaction, tLObject, tL_error);
                    }
                }, 2);
                return;
            }
            c2 = 1;
            this.lastMergeDialogId = 0L;
            zArr3[1] = true;
            this.messagesSearchCount[1] = 0;
        }
        final TLRPC.TL_messages_search tL_messages_search2 = new TLRPC.TL_messages_search();
        TLRPC.InputPeer inputPeer2 = getMessagesController().getInputPeer(j7);
        tL_messages_search2.peer = inputPeer2;
        if (inputPeer2 == null) {
            this.loadingMoreSearchMessages = false;
            return;
        }
        this.lastGuid = i;
        this.lastDialogId = j;
        this.lastSearchUser = user;
        this.lastSearchChat = chat;
        this.lastReplyMessageId = j3;
        this.lastReaction = visibleReaction;
        boolean z6 = z3;
        tL_messages_search2.limit = 21;
        tL_messages_search2.q = str2 != null ? str2 : "";
        tL_messages_search2.offset_id = id;
        if (user != 0) {
            tL_messages_search2.from_id = MessagesController.getInputPeer(user);
            tL_messages_search2.flags |= 1;
        } else if (chat != null) {
            tL_messages_search2.from_id = MessagesController.getInputPeer(chat);
            tL_messages_search2.flags |= 1;
        }
        this.loadingSearchLocal = false;
        this.loadedPredirectedSearchLocal = false;
        int i8 = this.lastReqId + 1;
        this.lastReqId = i8;
        boolean z7 = j == getUserConfig().getClientUserId();
        if (z7 && visibleReaction != 0 && z6) {
            this.lastReturnedNum = 0;
            this.searchServerResultMessages.clear();
            this.searchServerResultMessagesMap[0].clear();
            this.searchServerResultMessagesMap[c2].clear();
            final int savedTagCount = getMessagesController().getSavedTagCount(this.lastReplyMessageId, visibleReaction);
            this.messagesLocalSearchCount = TextUtils.isEmpty(tL_messages_search2.q) ? savedTagCount : 0;
            this.loadingSearchLocal = true;
            this.loadedPredirectedSearchLocal = false;
            MessagesStorage messagesStorage = getMessagesStorage();
            TLRPC.Reaction tLReaction = visibleReaction.toTLReaction();
            long j8 = j7;
            long j9 = this.lastReplyMessageId;
            ArrayList<MessageObject> arrayList = this.searchLocalResultMessages;
            int size = arrayList == null ? 0 : arrayList.size();
            i3 = i8;
            j5 = j8;
            j6 = 0;
            String str4 = str2;
            messagesStorage.searchSavedByTag(tLReaction, j9, str4, 300, size, new Utilities.Callback4() {
                @Override
                public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                    MediaDataController mediaDataController = this.f$0;
                    int i9 = i;
                    long j10 = j;
                    mediaDataController.lambda$searchMessagesInChat$122(i3, savedTagCount, i9, j10, (ArrayList) obj, (ArrayList) obj2, (ArrayList) obj3, (ArrayList) obj4);
                }
            }, true);
            str3 = str4;
        } else {
            i3 = i8;
            j5 = j7;
            str3 = str2;
            j6 = 0;
        }
        if (this.lastReplyMessageId != j6) {
            if (j5 == getUserConfig().getClientUserId() || getMessagesStorage().isMonoForum(j5)) {
                tL_messages_search2.saved_peer_id = getMessagesController().getInputPeer(this.lastReplyMessageId);
                tL_messages_search2.flags |= 4;
            } else {
                tL_messages_search2.top_msg_id = (int) this.lastReplyMessageId;
                tL_messages_search2.flags |= 2;
            }
        }
        if (visibleReaction != 0) {
            tL_messages_search2.saved_reaction.add(visibleReaction.toTLReaction());
            tL_messages_search2.flags |= 8;
        }
        tL_messages_search2.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        this.lastSearchQuery = str3;
        final int i9 = i3;
        final boolean z8 = z5;
        final boolean z9 = z7;
        this.reqId = getConnectionsManager().sendRequest(tL_messages_search2, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$searchMessagesInChat$125(tL_messages_search2, z9, str3, z8, i9, z2, j5, j, i, j2, j3, user, chat, tLObject, tL_error);
            }
        }, 2);
    }

    public SearchStickersKey searchStickers(boolean z, String str, String str2, Utilities.Callback<ArrayList<TLRPC.Document>> callback, boolean z2) {
        if (callback == null) {
            return null;
        }
        SearchStickersKey searchStickersKey = new SearchStickersKey(z, str, str2);
        SearchStickersResult searchStickersResult = this.searchStickerResults.get(searchStickersKey);
        if ((searchStickersResult == null || (searchStickersResult.next_offset != null && z2)) && !this.loadingSearchStickersKeys.containsKey(searchStickersKey)) {
            this.loadingSearchStickersKeys.put(searchStickersKey, 0);
            getInstance(this.currentAccount).getEmojiSuggestions(new String[]{str}, str2, true, new SendMessagesHelper$$ExternalSyntheticLambda61(this, searchStickersKey, searchStickersResult, callback), false);
            return searchStickersKey;
        }
        if (searchStickersResult != null) {
            callback.run(searchStickersResult.documents);
            return searchStickersKey;
        }
        callback.run(new ArrayList<>());
        return searchStickersKey;
    }

    public void toggleStickerSet(Context context, TLObject tLObject, int i, BaseFragment baseFragment, boolean z, boolean z2, Runnable runnable, boolean z3) {
        toggleStickerSet(context, tLObject, i, baseFragment, null, z, z2, runnable, z3);
    }

    public void verifyAnimatedStickerMessage(TLRPC.Message message, boolean z) {
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
            if (z) {
                AndroidUtilities.runOnUIThread(new FileLoader$$ExternalSyntheticLambda0(this, message, stickerSetName, 28));
                return;
            } else {
                lambda$verifyAnimatedStickerMessage$68(message, stickerSetName);
                return;
            }
        }
        int size = tL_messages_stickerSet.documents.size();
        for (int i = 0; i < size; i++) {
            TLRPC.Document document2 = tL_messages_stickerSet.documents.get(i);
            if (document2.id == document.id && document2.dc_id == document.dc_id) {
                message.stickerVerified = 1;
                return;
            }
        }
    }

    public static void addTextStyleRuns(MessageObject messageObject, Spannable spannable, int i) {
        addTextStyleRuns(messageObject.messageOwner.entities, messageObject.messageText, spannable, i);
    }

    public void getEmojiSuggestions(String[] strArr, String str, boolean z, KeywordResultCallback keywordResultCallback, CountDownLatch countDownLatch, boolean z2, boolean z3, boolean z4, Integer num) {
        getEmojiSuggestions(strArr, str, z, keywordResultCallback, countDownLatch, z2, z3, z4, false, num, false);
    }

    public boolean isStickerPackInstalled(String str) {
        return this.stickerSetsByName.containsKey(str);
    }

    public void loadStickers(int i, boolean z, boolean z2, boolean z3, Utilities.Callback<ArrayList<TLRPC.TL_messages_stickerSet>> callback) {
        long j;
        TLObject tLObject;
        if (this.loadingStickers[i]) {
            if (z3) {
                this.scheduledLoadStickers[i] = new ImageLoader$5$$ExternalSyntheticLambda2(this, i, z2, callback, 2);
                return;
            } else {
                if (callback != null) {
                    callback.run(null);
                    return;
                }
                return;
            }
        }
        if (i == 3) {
            if (this.featuredStickerSets[0].isEmpty() || !getMessagesController().preloadFeaturedStickers) {
                if (callback != null) {
                    callback.run(null);
                    return;
                }
                return;
            }
        } else if (i == 6) {
            if (this.featuredStickerSets[1].isEmpty() || !getMessagesController().preloadFeaturedStickers) {
                if (callback != null) {
                    callback.run(null);
                    return;
                }
                return;
            }
        } else if (i != 4) {
            loadArchivedStickersCount(i, z);
        }
        this.loadingStickers[i] = true;
        if (z) {
            getMessagesStorage().getStorageQueue().postRunnable(new FileLoader$$ExternalSyntheticLambda5(this, i, callback, 10));
            return;
        }
        if (i == 3 || i == 6) {
            char c = i != 6 ? (char) 0 : (char) 1;
            TLRPC.TL_messages_allStickers tL_messages_allStickers = new TLRPC.TL_messages_allStickers();
            tL_messages_allStickers.hash2 = this.loadFeaturedHash[c];
            int size = this.featuredStickerSets[c].size();
            for (int i2 = 0; i2 < size; i2++) {
                tL_messages_allStickers.sets.add(this.featuredStickerSets[c].get(i2).set);
            }
            processLoadStickersResponse(i, tL_messages_allStickers, new MessagesStorage$$ExternalSyntheticLambda257(4, callback));
            return;
        }
        if (i == 4) {
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
            tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetAnimatedEmoji();
            getConnectionsManager().sendRequest(tL_messages_getStickerSet, new FileLoadOperation$$ExternalSyntheticLambda5(this, i, callback, 3));
            return;
        }
        if (i == 0) {
            TLRPC.TL_messages_getAllStickers tL_messages_getAllStickers = new TLRPC.TL_messages_getAllStickers();
            j = z2 ? 0L : this.loadHash[i];
            tL_messages_getAllStickers.hash = j;
            tLObject = tL_messages_getAllStickers;
        } else if (i == 5) {
            TLRPC.TL_messages_getEmojiStickers tL_messages_getEmojiStickers = new TLRPC.TL_messages_getEmojiStickers();
            j = z2 ? 0L : this.loadHash[i];
            tL_messages_getEmojiStickers.hash = j;
            tLObject = tL_messages_getEmojiStickers;
        } else {
            TLRPC.TL_messages_getMaskStickers tL_messages_getMaskStickers = new TLRPC.TL_messages_getMaskStickers();
            j = z2 ? 0L : this.loadHash[i];
            tL_messages_getMaskStickers.hash = j;
            tLObject = tL_messages_getMaskStickers;
        }
        getConnectionsManager().sendRequest(tLObject, new MessageSeenView$$ExternalSyntheticLambda0(this, i, callback, j, 2));
    }

    public void saveDraft(long j, long j2, CharSequence charSequence, ArrayList<TLRPC.MessageEntity> arrayList, TLRPC.Message message, ChatActivity.ReplyQuote replyQuote, TLRPC.SuggestedPost suggestedPost, long j3, boolean z, boolean z2, TL_iv.RichMessage richMessage) {
        TLRPC.DraftMessage tL_draftMessage;
        TLRPC.InputReplyTo inputReplyTo;
        TLRPC.Message message2 = (getMessagesController().isForum(j) && j2 == 0) ? null : message;
        if (TextUtils.isEmpty(charSequence) && message2 == null && richMessage == null) {
            tL_draftMessage = new TLRPC.TL_draftMessageEmpty();
        } else {
            tL_draftMessage = new TLRPC.TL_draftMessage();
        }
        tL_draftMessage.rich_message = richMessage;
        tL_draftMessage.date = (int) (System.currentTimeMillis() / 1000);
        tL_draftMessage.message = charSequence == null ? "" : charSequence.toString();
        tL_draftMessage.no_webpage = z;
        if (j3 != 0) {
            tL_draftMessage.flags |= 128;
            tL_draftMessage.effect = j3;
        }
        if (message2 != null) {
            TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
            tL_draftMessage.reply_to = tL_inputReplyToMessage;
            tL_draftMessage.flags |= 16;
            tL_inputReplyToMessage.reply_to_msg_id = message2.id;
            if (replyQuote != null) {
                String str = replyQuote.text;
                tL_inputReplyToMessage.quote_text = str;
                if (str != null) {
                    tL_inputReplyToMessage.flags |= 20;
                    tL_inputReplyToMessage.quote_offset = replyQuote.start;
                }
                ArrayList<TLRPC.MessageEntity> arrayList2 = replyQuote.entities;
                tL_inputReplyToMessage.quote_entities = arrayList2;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    tL_draftMessage.reply_to.quote_entities = new ArrayList<>(tL_draftMessage.reply_to.quote_entities);
                    tL_draftMessage.reply_to.flags |= 8;
                }
                MessageObject messageObject = replyQuote.message;
                if (messageObject != null && messageObject.messageOwner != null) {
                    TLRPC.Peer peer = getMessagesController().getPeer(j);
                    TLRPC.Peer peer2 = replyQuote.message.messageOwner.peer_id;
                    if (peer != null && !MessageObject.peersEqual(peer, peer2)) {
                        TLRPC.InputReplyTo inputReplyTo2 = tL_draftMessage.reply_to;
                        inputReplyTo2.flags |= 2;
                        inputReplyTo2.reply_to_peer_id = getMessagesController().getInputPeer(peer2);
                    }
                }
            } else if (j != MessageObject.getDialogId(message2)) {
                TLRPC.InputReplyTo inputReplyTo3 = tL_draftMessage.reply_to;
                inputReplyTo3.flags |= 2;
                inputReplyTo3.reply_to_peer_id = getMessagesController().getInputPeer(getMessagesController().getPeer(MessageObject.getDialogId(message2)));
            }
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            tL_draftMessage.entities = arrayList;
            tL_draftMessage.flags |= 8;
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
        if (ChatObject.isMonoForum(chat) && ChatObject.canManageMonoForum(this.currentAccount, chat)) {
            tL_draftMessage.flags |= 16;
            TLRPC.InputReplyTo inputReplyTo4 = tL_draftMessage.reply_to;
            if (inputReplyTo4 == null) {
                TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                tL_draftMessage.reply_to = tL_inputReplyToMonoForum;
                tL_inputReplyToMonoForum.monoforum_peer_id = getMessagesController().getInputPeer(j2);
            } else {
                inputReplyTo4.monoforum_peer_id = getMessagesController().getInputPeer(j2);
                tL_draftMessage.reply_to.flags |= 32;
            }
        }
        if (suggestedPost != null) {
            tL_draftMessage.suggested_post = suggestedPost;
        }
        LongSparseArray longSparseArray = (LongSparseArray) this.drafts.get(j);
        TLRPC.DraftMessage draftMessage = longSparseArray == null ? null : (TLRPC.DraftMessage) longSparseArray.get(j2);
        if (!z2) {
            if (draftMessage != null) {
                if (draftMessage.message.equals(tL_draftMessage.message) && replyToEquals(draftMessage.reply_to, tL_draftMessage.reply_to) && suggestedPostEquals(draftMessage.suggested_post, tL_draftMessage.suggested_post) && richMessageEquals(draftMessage.rich_message, tL_draftMessage.rich_message) && draftMessage.no_webpage == tL_draftMessage.no_webpage && draftMessage.effect == tL_draftMessage.effect) {
                    return;
                }
            } else if (TextUtils.isEmpty(tL_draftMessage.message) && (((inputReplyTo = tL_draftMessage.reply_to) == null || inputReplyTo.reply_to_msg_id == 0) && tL_draftMessage.effect == 0 && tL_draftMessage.rich_message == null && tL_draftMessage.suggested_post == null)) {
                return;
            }
        }
        saveDraft(j, j2, tL_draftMessage, message2, false);
        if (j2 == 0 || ChatObject.isForum(chat) || ChatObject.isMonoForum(chat)) {
            if (!DialogObject.isEncryptedDialog(j)) {
                TLRPC.TL_messages_saveDraft tL_messages_saveDraft = new TLRPC.TL_messages_saveDraft();
                TLRPC.InputPeer inputPeer = getMessagesController().getInputPeer(j);
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
                getConnectionsManager().sendRequest(tL_messages_saveDraft, new FileRefController$$ExternalSyntheticLambda11(8));
            }
            getMessagesController().sortDialogs(null);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
        }
    }

    public void toggleStickerSet(Context context, TLObject tLObject, int i, BaseFragment baseFragment, FrameLayout frameLayout, boolean z, boolean z2, Runnable runnable, boolean z3) {
        toggleStickerSet(context, tLObject, null, i, baseFragment, frameLayout, z, z2, runnable, z3);
    }

    public static void addTextStyleRuns(ArrayList<TLRPC.MessageEntity> arrayList, CharSequence charSequence, Spannable spannable) {
        addTextStyleRuns(arrayList, charSequence, spannable, -1);
    }

    public static TLRPC.InputStickerSet getInputStickerSet(TLRPC.Document document) {
        for (int i = 0; i < document.attributes.size(); i++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
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

    public void getEmojiSuggestions(final String[] strArr, final String str, final boolean z, final KeywordResultCallback keywordResultCallback, final CountDownLatch countDownLatch, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final Integer num, final boolean z6) {
        if (keywordResultCallback == null) {
            return;
        }
        if (!TextUtils.isEmpty(str) && strArr != null) {
            final ArrayList arrayList = new ArrayList(Emoji.recentEmoji);
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$getEmojiSuggestions$224(strArr, keywordResultCallback, z4, str, z, arrayList, z2, num, z3, z5, z6, countDownLatch);
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

    public void toggleStickerSet(final Context context, final TLObject tLObject, final TLRPC.Document document, final int i, final BaseFragment baseFragment, final FrameLayout frameLayout, final boolean z, boolean z2, final Runnable runnable, boolean z3) {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        int i2;
        int i3;
        final int i4;
        if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
            tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            stickerSet = tL_messages_stickerSet.set;
        } else if (tLObject instanceof TLRPC.StickerSetCovered) {
            stickerSet = ((TLRPC.StickerSetCovered) tLObject).set;
            if (i != 2) {
                tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.stickerSetsById.get(stickerSet.id);
                if (tL_messages_stickerSet == null) {
                    return;
                }
            } else {
                tL_messages_stickerSet = null;
            }
        } else {
            throw new IllegalArgumentException("Invalid type of the given stickerSetObject: " + tLObject.getClass());
        }
        final TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
        final TLRPC.StickerSet stickerSet2 = stickerSet;
        if (stickerSet2.masks) {
            i2 = 1;
        } else {
            i2 = stickerSet2.emojis ? 5 : 0;
        }
        stickerSet2.archived = i == 1;
        int i5 = 0;
        while (true) {
            if (i5 >= this.stickerSets[i2].size()) {
                i3 = 0;
                break;
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = this.stickerSets[i2].get(i5);
            if (tL_messages_stickerSet3.set.id == stickerSet2.id) {
                this.stickerSets[i2].remove(i5);
                if (i == 2) {
                    tL_messages_stickerSet3.set.title = stickerSet2.title;
                    this.stickerSets[i2].add(0, tL_messages_stickerSet3);
                } else if (z3) {
                    this.stickerSetsById.remove(tL_messages_stickerSet3.set.id);
                    this.installedStickerSetsById.remove(tL_messages_stickerSet3.set.id);
                    this.stickerSetsByName.remove(tL_messages_stickerSet3.set.short_name);
                }
                i3 = i5;
                break;
            }
            i5++;
        }
        this.loadHash[i2] = calcStickersHash(this.stickerSets[i2]);
        putStickersToCache(i2, this.stickerSets[i2], this.loadDate[i2], this.loadHash[i2]);
        if (i != 2) {
            i4 = i2;
            if (z2 && baseFragment != null) {
                StickerSetBulletinLayout stickerSetBulletinLayout = new StickerSetBulletinLayout(context, tLObject, 1, i, document, baseFragment.getResourceProvider());
                final boolean[] zArr = new boolean[1];
                markSetUninstalling(stickerSet2.id, true);
                Bulletin.UndoButton undoButton = new Bulletin.UndoButton(context);
                final int i6 = i3;
                undoButton.undoAction = new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$toggleStickerSet$108(zArr, stickerSet2, i4, i6, tL_messages_stickerSet2, runnable);
                    }
                };
                undoButton.delayedAction = new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$toggleStickerSet$109(zArr, context, i, baseFragment, frameLayout, z, tLObject, stickerSet2, document, i4);
                    }
                };
                stickerSetBulletinLayout.setButton(undoButton);
                this.removingStickerSetsUndos.put(new ANRDetector$$ExternalSyntheticLambda0(undoButton, 25), stickerSet2.id);
                if (frameLayout != null) {
                    i4 = i4;
                    Bulletin.make(frameLayout, stickerSetBulletinLayout, 2750).show();
                } else {
                    i4 = i4;
                    Bulletin.make(baseFragment, stickerSetBulletinLayout, 2750).show();
                }
            } else {
                toggleStickerSetInternal(context, i, baseFragment, frameLayout, z, tLObject, stickerSet2, document, i4, false);
            }
        } else if (cancelRemovingStickerSet(stickerSet2.id)) {
            i4 = i2;
        } else {
            i4 = i2;
            toggleStickerSetInternal(context, i, baseFragment, frameLayout, z, tLObject, stickerSet2, document, i4, z2);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i4), Boolean.TRUE);
    }

    public static void addTextStyleRuns(ArrayList<TLRPC.MessageEntity> arrayList, CharSequence charSequence, Spannable spannable, int i) {
        for (TextStyleSpan textStyleSpan : (TextStyleSpan[]) spannable.getSpans(0, spannable.length(), TextStyleSpan.class)) {
            spannable.removeSpan(textStyleSpan);
        }
        ArrayList<TextStyleSpan.TextStyleRun> textStyleRuns = getTextStyleRuns(arrayList, charSequence, i);
        for (int i2 = 0; i2 < Math.min(1000, textStyleRuns.size()); i2++) {
            TextStyleSpan.TextStyleRun textStyleRun = textStyleRuns.get(i2);
            addStyleToText(new TextStyleSpan(textStyleRun, 0), textStyleRun.start, textStyleRun.end, spannable, true);
        }
    }

    public TLRPC.TL_messages_stickerSet getStickerSet(TLRPC.InputStickerSet inputStickerSet, boolean z) {
        return getStickerSet(inputStickerSet, null, z, null);
    }

    public TLRPC.TL_messages_stickerSet getStickerSet(TLRPC.InputStickerSet inputStickerSet, Integer num, boolean z) {
        return getStickerSet(inputStickerSet, num, z, null);
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
            } else {
                document = stickerSetCovered.covers.get(0);
            }
        }
        loadStickerSetThumbInternal(closestPhotoSizeWithSize, stickerSetCovered, document, stickerSetCovered.set.thumb_version);
    }

    public static boolean entitiesEqual(ArrayList<TLRPC.MessageEntity> arrayList, ArrayList<TLRPC.MessageEntity> arrayList2) {
        if (arrayList.size() != arrayList2.size()) {
            return false;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (!entitiesEqual(arrayList.get(i), arrayList2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public TLRPC.TL_messages_stickerSet getStickerSet(TLRPC.InputStickerSet inputStickerSet, Integer num, boolean z, Utilities.Callback<TLRPC.TL_messages_stickerSet> callback) {
        return getStickerSet(inputStickerSet, num, z, false, callback);
    }

    public TLRPC.TL_messages_stickerSet getStickerSet(final TLRPC.InputStickerSet inputStickerSet, final Integer num, final boolean z, boolean z2, final Utilities.Callback<TLRPC.TL_messages_stickerSet> callback) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        String str;
        if (inputStickerSet != null) {
            boolean z3 = inputStickerSet instanceof TLRPC.TL_inputStickerSetID;
            if (z3 && this.stickerSetsById.containsKey(inputStickerSet.id)) {
                tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.stickerSetsById.get(inputStickerSet.id);
            } else if ((inputStickerSet instanceof TLRPC.TL_inputStickerSetShortName) && (str = inputStickerSet.short_name) != null && this.stickerSetsByName.containsKey(str.toLowerCase())) {
                tL_messages_stickerSet = this.stickerSetsByName.get(inputStickerSet.short_name.toLowerCase());
            } else if ((!(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmojiDefaultStatuses) || (tL_messages_stickerSet = this.stickerSetDefaultStatuses) == null) && (!(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmojiChannelDefaultStatuses) || (tL_messages_stickerSet = this.stickerSetDefaultChannelStatuses) == null)) {
                tL_messages_stickerSet = null;
            }
            if (tL_messages_stickerSet != null) {
                if (!z2 && callback != null) {
                    callback.run(tL_messages_stickerSet);
                }
                return tL_messages_stickerSet;
            }
            final String strInputSetKey = inputSetKey(inputStickerSet);
            if (callback != null || !this.loadingStickerSetsKeys.contains(strInputSetKey)) {
                this.loadingStickerSetsKeys.add(strInputSetKey);
                if (z3) {
                    final int i = 0;
                    getMessagesStorage().getStorageQueue().postRunnable(new Runnable(this) {
                        public final MediaDataController f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void run() {
                            switch (i) {
                                case 0:
                                    this.f$0.lambda$getStickerSet$34(inputStickerSet, num, strInputSetKey, callback, z);
                                    break;
                                default:
                                    this.f$0.lambda$getStickerSet$37(inputStickerSet, num, strInputSetKey, callback, z);
                                    break;
                            }
                        }
                    });
                    return null;
                }
                if (inputStickerSet instanceof TLRPC.TL_inputStickerSetShortName) {
                    final int i2 = 1;
                    getMessagesStorage().getStorageQueue().postRunnable(new Runnable(this) {
                        public final MediaDataController f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    this.f$0.lambda$getStickerSet$34(inputStickerSet, num, strInputSetKey, callback, z);
                                    break;
                                default:
                                    this.f$0.lambda$getStickerSet$37(inputStickerSet, num, strInputSetKey, callback, z);
                                    break;
                            }
                        }
                    });
                    return null;
                }
                if (!z) {
                    fetchStickerSetInternal(inputStickerSet, new MediaDataController$$ExternalSyntheticLambda72(this, strInputSetKey, callback, inputStickerSet));
                    return null;
                }
                this.loadingStickerSetsKeys.remove(strInputSetKey);
                return null;
            }
        }
        return null;
    }

    public ArrayList<MessageObject> loadPinnedMessages(long j, long j2, ArrayList<Integer> arrayList, boolean z) {
        if (z) {
            getMessagesStorage().getStorageQueue().postRunnable(new LaunchActivity$$ExternalSyntheticLambda37(2, j, j2, this, arrayList));
            return null;
        }
        return loadPinnedMessageInternal(j, j2, arrayList, true);
    }

    private TLRPC.TL_messages_stickerSet getCachedStickerSetInternal(String str, Integer num) {
        SQLiteCursor sQLiteCursorQueryFinalized;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSetTLdeserialize;
        NativeByteBuffer nativeByteBuffer = null;
        try {
            try {
                sQLiteCursorQueryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT data, hash FROM stickersets2 WHERE short_name = ? LIMIT 1", str);
                try {
                    if (!sQLiteCursorQueryFinalized.next() || sQLiteCursorQueryFinalized.isNull(0)) {
                        tL_messages_stickerSetTLdeserialize = null;
                    } else {
                        NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                        if (nativeByteBufferByteBufferValue != null) {
                            try {
                                tL_messages_stickerSetTLdeserialize = TLRPC.messages_StickerSet.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                                try {
                                    int iIntValue = sQLiteCursorQueryFinalized.intValue(1);
                                    if (num != null && num.intValue() != 0 && num.intValue() != iIntValue) {
                                        nativeByteBufferByteBufferValue.reuse();
                                        sQLiteCursorQueryFinalized.dispose();
                                        return null;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    nativeByteBuffer = nativeByteBufferByteBufferValue;
                                    try {
                                        FileLog.e(th);
                                        return tL_messages_stickerSetTLdeserialize;
                                    } finally {
                                        if (nativeByteBuffer != null) {
                                            nativeByteBuffer.reuse();
                                        }
                                        if (sQLiteCursorQueryFinalized != null) {
                                            sQLiteCursorQueryFinalized.dispose();
                                        }
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                tL_messages_stickerSetTLdeserialize = null;
                            }
                        } else {
                            tL_messages_stickerSetTLdeserialize = null;
                        }
                        nativeByteBuffer = nativeByteBufferByteBufferValue;
                    }
                    if (nativeByteBuffer != null) {
                        nativeByteBuffer.reuse();
                    }
                    sQLiteCursorQueryFinalized.dispose();
                    return tL_messages_stickerSetTLdeserialize;
                } catch (Throwable th3) {
                    th = th3;
                    tL_messages_stickerSetTLdeserialize = null;
                }
            } catch (Throwable th4) {
                th = th4;
                sQLiteCursorQueryFinalized = null;
                tL_messages_stickerSetTLdeserialize = null;
                FileLog.e(th);
                return tL_messages_stickerSetTLdeserialize;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public void saveDraft(final long j, final long j2, TLRPC.DraftMessage draftMessage, TLRPC.Message message, boolean z) {
        TLRPC.Message message2;
        StringBuilder sb;
        TLRPC.InputReplyTo inputReplyTo;
        TLRPC.Chat chat;
        StringBuilder sb2;
        if (getMessagesController().isForum(j) && j2 == 0 && TextUtils.isEmpty(draftMessage.message)) {
            TLRPC.InputReplyTo inputReplyTo2 = draftMessage.reply_to;
            if (inputReplyTo2 instanceof TLRPC.TL_inputReplyToMessage) {
                ((TLRPC.TL_inputReplyToMessage) inputReplyTo2).reply_to_msg_id = 0;
            }
        }
        SharedPreferences.Editor editorEdit = this.draftPreferences.edit();
        MessagesController messagesController = getMessagesController();
        if (draftMessage != null && !(draftMessage instanceof TLRPC.TL_draftMessageEmpty)) {
            LongSparseArray longSparseArray = (LongSparseArray) this.drafts.get(j);
            if (longSparseArray == null) {
                longSparseArray = new LongSparseArray();
                this.drafts.put(longSparseArray, j);
            }
            longSparseArray.put(draftMessage, j2);
            if (j2 == 0) {
                messagesController.putDraftDialogIfNeed(j, draftMessage);
            }
            try {
                SerializedData serializedData = new SerializedData(draftMessage.getObjectSize());
                draftMessage.serializeToStream(serializedData);
                if (j2 == 0) {
                    sb2 = new StringBuilder("");
                    sb2.append(j);
                } else {
                    sb2 = new StringBuilder("t_");
                    sb2.append(j);
                    sb2.append("_");
                    sb2.append(j2);
                }
                editorEdit.putString(sb2.toString(), Utilities.bytesToHex(serializedData.toByteArray()));
                serializedData.cleanup();
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else {
            LongSparseArray longSparseArray2 = (LongSparseArray) this.drafts.get(j);
            if (longSparseArray2 != null) {
                longSparseArray2.remove(j2);
                if (longSparseArray2.size() == 0) {
                    this.drafts.remove(j);
                }
            }
            LongSparseArray longSparseArray3 = (LongSparseArray) this.draftMessages.get(j);
            if (longSparseArray3 != null) {
                longSparseArray3.remove(j2);
                if (longSparseArray3.size() == 0) {
                    this.draftMessages.remove(j);
                }
            }
            if (j2 == 0) {
                this.draftPreferences.edit().remove("" + j).remove("r_" + j).commit();
            } else {
                SharedPreferences.Editor editorEdit2 = this.draftPreferences.edit();
                StringBuilder sbM = AacUtil.m(j, "t_", "_");
                sbM.append(j2);
                SharedPreferences.Editor editorRemove = editorEdit2.remove(sbM.toString());
                StringBuilder sbM2 = AacUtil.m(j, "rt_", "_");
                sbM2.append(j2);
                editorRemove.remove(sbM2.toString()).commit();
            }
            messagesController.removeDraftDialogIfNeed(j);
        }
        LongSparseArray longSparseArray4 = (LongSparseArray) this.draftMessages.get(j);
        TLRPC.User user = null;
        if (message != null || draftMessage == null || draftMessage.reply_to == null) {
            if (draftMessage == null || draftMessage.reply_to != null) {
                message2 = message;
            } else {
                message2 = null;
            }
        } else if (longSparseArray4 != null) {
            message2 = (TLRPC.Message) longSparseArray4.get(j2);
        } else {
            message2 = message;
        }
        if (message2 == null) {
            if (longSparseArray4 != null) {
                longSparseArray4.remove(j2);
                if (longSparseArray4.size() == 0) {
                    this.draftMessages.remove(j);
                }
            }
            if (j2 == 0) {
                editorEdit.remove("r_" + j);
            } else {
                StringBuilder sbM3 = AacUtil.m(j, "rt_", "_");
                sbM3.append(j2);
                editorEdit.remove(sbM3.toString());
            }
        } else {
            if (longSparseArray4 == null) {
                longSparseArray4 = new LongSparseArray();
                this.draftMessages.put(longSparseArray4, j);
            }
            longSparseArray4.put(message2, j2);
            try {
                SerializedData serializedData2 = new SerializedData(message2.getObjectSize());
                message2.serializeToStream(serializedData2);
                if (j2 == 0) {
                    sb = new StringBuilder("r_");
                    sb.append(j);
                } else {
                    StringBuilder sb3 = new StringBuilder("rt_");
                    sb3.append(j);
                    sb3.append("_");
                    sb3.append(j2);
                    sb = sb3;
                }
                editorEdit.putString(sb.toString(), Utilities.bytesToHex(serializedData2.toByteArray()));
                serializedData2.cleanup();
            } catch (Exception e2) {
                FileLog.e(e2);
            }
        }
        editorEdit.commit();
        if (z) {
            if (j2 == 0 || getMessagesController().isForum(j)) {
                if (draftMessage != null && (inputReplyTo = draftMessage.reply_to) != null && inputReplyTo.reply_to_msg_id != 0 && (message2 == null || ((message2.reply_to instanceof TLRPC.TL_messageReplyHeader) && message2.replyMessage == null))) {
                    long peerDialogId = (inputReplyTo.flags & 2) != 0 ? DialogObject.getPeerDialogId(inputReplyTo.reply_to_peer_id) : j;
                    if (DialogObject.isUserDialog(peerDialogId)) {
                        user = getMessagesController().getUser(Long.valueOf(peerDialogId));
                        chat = null;
                    } else {
                        chat = getMessagesController().getChat(Long.valueOf(-peerDialogId));
                    }
                    if (user != null || chat != null) {
                        long j3 = ChatObject.isChannel(chat) ? chat.id : 0L;
                        final int i = draftMessage.reply_to.reply_to_msg_id;
                        final long j4 = peerDialogId;
                        final long j5 = j3;
                        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                            @Override
                            public final void run() throws Throwable {
                                this.f$0.lambda$saveDraft$191(i, j4, j5, j, j2);
                            }
                        });
                    }
                }
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newDraftReceived, Long.valueOf(j));
            }
        }
    }
}
