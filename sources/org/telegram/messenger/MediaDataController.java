package org.telegram.messenger;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
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
import androidx.collection.LongSparseArray;
import androidx.core.content.pm.ShortcutInfoCompat;
import androidx.core.content.pm.ShortcutManagerCompat;
import androidx.core.content.pm.ShortcutManagerCompat$$ExternalSyntheticApiModelOutline0;
import androidx.core.content.pm.ShortcutManagerCompat$$ExternalSyntheticApiModelOutline2;
import androidx.core.graphics.drawable.IconCompat;
import com.android.billingclient.api.ProductDetails;
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
import java.util.UUID;
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
import org.telegram.ui.ChatActivity;
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
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.StoriesStorage;

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

    public interface KeywordResultCallback {
        void run(ArrayList<KeywordResult> arrayList, String str);
    }

    public static void m561$r8$lambda$1i52D86dq99dx6LmalH62SgUVo(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void $r8$lambda$3c4IKv_kjnKV_i5Kp518Fs2MndI(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void $r8$lambda$GFwA78Z9KdSq6_qTzY0lgeP0Eww(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void m602$r8$lambda$WZs7AxQZLHr9fyhWcAuWS8fClM(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void $r8$lambda$e9B0UIr2GlJGkHd3WtNlPtc8X5U(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void $r8$lambda$fvxCpRRTXkRxVwD4KREoJsTXy0M(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static long calcHash(long j, long j2) {
        long j3 = j ^ (j >>> 21);
        long j4 = j3 ^ (j3 << 35);
        return (j4 ^ (j4 >>> 4)) + j2;
    }

    public boolean canCreateAttachedMenuBotShortcut(long j) {
        return true;
    }

    static {
        for (int i = 0; i < 4; i++) {
            lockObjects[i] = new Object();
        }
        SHORTCUT_TYPE_USER_OR_CHAT = 0;
        SHORTCUT_TYPE_ATTACHED_BOT = 1;
        entityComparator = new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return MediaDataController.$r8$lambda$NfH9CMuBiEsA062xTxacynCGb5k((TLRPC.MessageEntity) obj, (TLRPC.MessageEntity) obj2);
            }
        };
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
                                this.drafts.put(jLongValue, longSparseArray);
                            }
                            longSparseArray.put(key.startsWith("t_") ? Utilities.parseLong(key.substring(key.lastIndexOf(95) + 1)).longValue() : 0L, draftMessageTLdeserialize);
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
                        this.draftMessages.put(jLongValue, longSparseArray2);
                    }
                    longSparseArray2.put(zStartsWith ? Utilities.parseInt((CharSequence) key.substring(key.lastIndexOf(95) + 1)).intValue() : 0, messageTLdeserialize);
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

    private void loadRepliesOfDraftReplies(final ArrayList<TLRPC.Message> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$DVAZIabRtSCW98uOZOGKcjxPwsI(this.f$0, arrayList);
            }
        });
    }

    public static void $r8$lambda$DVAZIabRtSCW98uOZOGKcjxPwsI(MediaDataController mediaDataController, ArrayList arrayList) {
        mediaDataController.getClass();
        try {
            ArrayList<Long> arrayList2 = new ArrayList<>();
            ArrayList<Long> arrayList3 = new ArrayList<>();
            LongSparseArray longSparseArray = new LongSparseArray();
            LongSparseArray longSparseArray2 = new LongSparseArray();
            for (int i = 0; i < arrayList.size(); i++) {
                try {
                    MessagesStorage.addReplyMessages((TLRPC.Message) arrayList.get(i), longSparseArray, longSparseArray2);
                } catch (Exception e) {
                    mediaDataController.getMessagesStorage().checkSQLException(e);
                }
            }
            mediaDataController.getMessagesStorage().loadReplyMessages(longSparseArray, longSparseArray2, arrayList2, arrayList3, 0);
        } catch (Exception e2) {
            FileLog.e(e2);
        }
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
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.$r8$lambda$P07UD38xHwHnuBgLff3vTufHzN8();
                }
            });
        }
        this.verifyingMessages.clear();
        this.loading = false;
        this.loaded = false;
        this.hints.clear();
        this.inlineBots.clear();
        this.guestBots.clear();
        this.webapps.clear();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.m577$r8$lambda$EVLRVo9yYqtJc50gcLkYXEaTPY(this.f$0);
            }
        });
        this.drafts.clear();
        this.draftMessages.clear();
        this.draftPreferences.edit().clear().apply();
        this.botInfos.clear();
        this.botKeyboards.clear();
        this.botKeyboardsByMids.clear();
    }

    public static void $r8$lambda$P07UD38xHwHnuBgLff3vTufHzN8() {
        try {
            ShortcutManagerCompat.removeAllDynamicShortcuts(ApplicationLoader.applicationContext);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void m577$r8$lambda$EVLRVo9yYqtJc50gcLkYXEaTPY(MediaDataController mediaDataController) {
        mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.reloadHints, new Object[0]);
        mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.reloadInlineHints, new Object[0]);
        mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.reloadGuestBotHints, new Object[0]);
        mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.reloadWebappsHints, new Object[0]);
    }

    public boolean areStickersLoaded(int i) {
        return this.stickersLoaded[i];
    }

    public void checkStickers(int i) {
        if (this.loadingStickers[i]) {
            return;
        }
        if (!this.stickersLoaded[i] || Math.abs((System.currentTimeMillis() / 1000) - ((long) this.loadDate[i])) >= 3600) {
            loadStickers(i, true, false);
        }
    }

    public void checkReactions() {
        if (this.isLoadingReactions || Math.abs((System.currentTimeMillis() / 1000) - ((long) this.reactionsUpdateDate)) < 3600) {
            return;
        }
        loadReactions(true, null);
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

    public void checkPremiumPromo() {
        if (this.isLoadingPremiumPromo) {
            return;
        }
        if (this.premiumPromo == null || Math.abs((System.currentTimeMillis() / 1000) - ((long) this.premiumPromoUpdateDate)) >= 3600) {
            loadPremiumPromo(true);
        }
    }

    public TLRPC.TL_help_premiumPromo getPremiumPromo() {
        return this.premiumPromo;
    }

    public Integer getPremiumHintAnnualDiscount(boolean z) {
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo;
        int i;
        double priceAmountMicros;
        int i2;
        double d;
        ProductDetails productDetails;
        ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails;
        Integer num;
        double priceAmountMicros2;
        int i3;
        ProductDetails productDetails2;
        ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails2;
        int i4 = 0;
        Integer num2 = null;
        if ((z && (!BillingController.getInstance().isReady() || BillingController.getInstance().getLastPremiumTransaction() == null)) || (tL_help_premiumPromo = this.premiumPromo) == null) {
            return null;
        }
        ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList = tL_help_premiumPromo.period_options;
        int size = arrayList.size();
        double d2 = 0.0d;
        int i5 = 0;
        boolean z2 = false;
        while (true) {
            i = 12;
            if (i5 >= size) {
                break;
            }
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = arrayList.get(i5);
            i5++;
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption2 = tL_premiumSubscriptionOption;
            if (z) {
                if (tL_premiumSubscriptionOption2.current) {
                    num = num2;
                    if (Objects.equals(tL_premiumSubscriptionOption2.transaction.replaceAll("^(.*?)(?:\\.\\.\\d*|)$", "$1"), BillingController.getInstance().getLastPremiumTransaction())) {
                        if (BuildVars.useInvoiceBilling() && (productDetails2 = BillingController.PREMIUM_PRODUCT_DETAILS) != null) {
                            Iterator it = productDetails2.getSubscriptionOfferDetails().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    subscriptionOfferDetails2 = num;
                                    break;
                                }
                                subscriptionOfferDetails2 = (ProductDetails.SubscriptionOfferDetails) it.next();
                                String billingPeriod = ((ProductDetails.PricingPhase) subscriptionOfferDetails2.getPricingPhases().getPricingPhaseList().get(0)).getBillingPeriod();
                                int i6 = tL_premiumSubscriptionOption2.months;
                                if (i6 == 12) {
                                    if (billingPeriod.equals("P1Y")) {
                                        break;
                                    }
                                } else if (billingPeriod.equals(String.format(Locale.ROOT, "P%dM", Integer.valueOf(i6)))) {
                                    break;
                                }
                            }
                            if (subscriptionOfferDetails2 == 0) {
                                priceAmountMicros2 = tL_premiumSubscriptionOption2.amount;
                                i3 = tL_premiumSubscriptionOption2.months;
                            } else {
                                priceAmountMicros2 = ((ProductDetails.PricingPhase) subscriptionOfferDetails2.getPricingPhases().getPricingPhaseList().get(0)).getPriceAmountMicros();
                                i3 = tL_premiumSubscriptionOption2.months;
                            }
                        } else {
                            priceAmountMicros2 = tL_premiumSubscriptionOption2.amount;
                            i3 = tL_premiumSubscriptionOption2.months;
                        }
                        d2 = priceAmountMicros2 / ((double) i3);
                        num2 = num;
                        z2 = true;
                    }
                } else {
                    num = num2;
                }
                num2 = num;
            } else {
                num = num2;
                if (tL_premiumSubscriptionOption2.months == 1) {
                    if (BuildVars.useInvoiceBilling()) {
                        priceAmountMicros2 = tL_premiumSubscriptionOption2.amount;
                        i3 = tL_premiumSubscriptionOption2.months;
                    } else {
                        priceAmountMicros2 = tL_premiumSubscriptionOption2.amount;
                        i3 = tL_premiumSubscriptionOption2.months;
                    }
                    d2 = priceAmountMicros2 / ((double) i3);
                    num2 = num;
                    z2 = true;
                } else {
                    num2 = num;
                }
            }
        }
        Integer num3 = num2;
        ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList2 = this.premiumPromo.period_options;
        int size2 = arrayList2.size();
        int i7 = 0;
        int i8 = 0;
        while (i7 < size2) {
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption3 = arrayList2.get(i7);
            i7++;
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption4 = tL_premiumSubscriptionOption3;
            if (z2 && tL_premiumSubscriptionOption4.months == i) {
                if (!BuildVars.useInvoiceBilling() && (productDetails = BillingController.PREMIUM_PRODUCT_DETAILS) != null) {
                    Iterator it2 = productDetails.getSubscriptionOfferDetails().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            subscriptionOfferDetails = num3;
                            break;
                        }
                        subscriptionOfferDetails = (ProductDetails.SubscriptionOfferDetails) it2.next();
                        String billingPeriod2 = ((ProductDetails.PricingPhase) subscriptionOfferDetails.getPricingPhases().getPricingPhaseList().get(i4)).getBillingPeriod();
                        int i9 = tL_premiumSubscriptionOption4.months;
                        if (i9 == i) {
                            if (billingPeriod2.equals("P1Y")) {
                                break;
                            }
                            i4 = 0;
                        } else {
                            if (billingPeriod2.equals(String.format(Locale.ROOT, "P%dM", Integer.valueOf(i9)))) {
                                break;
                            }
                            i4 = 0;
                            i = 12;
                        }
                    }
                    if (subscriptionOfferDetails == 0) {
                        d = tL_premiumSubscriptionOption4.amount / ((double) tL_premiumSubscriptionOption4.months);
                        i4 = 0;
                    } else {
                        i4 = 0;
                        priceAmountMicros = ((ProductDetails.PricingPhase) subscriptionOfferDetails.getPricingPhases().getPricingPhaseList().get(0)).getPriceAmountMicros();
                        i2 = tL_premiumSubscriptionOption4.months;
                    }
                    i8 = (int) ((1.0d - (d / d2)) * 100.0d);
                } else {
                    priceAmountMicros = tL_premiumSubscriptionOption4.amount;
                    i2 = tL_premiumSubscriptionOption4.months;
                }
                d = priceAmountMicros / ((double) i2);
                i8 = (int) ((1.0d - (d / d2)) * 100.0d);
            }
            i = 12;
        }
        return (!z2 || i8 <= 0) ? num3 : Integer.valueOf(i8);
    }

    public TLRPC.TL_attachMenuBots getAttachMenuBots() {
        return this.attachMenuBots;
    }

    public void loadAttachMenuBots(boolean z, boolean z2) {
        loadAttachMenuBots(z, z2, null);
    }

    public void loadAttachMenuBots(boolean z, boolean z2, final Runnable runnable) {
        this.isLoadingMenuBots = true;
        if (z) {
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() throws Throwable {
                    MediaDataController.$r8$lambda$Z8M5cAQCbsKSBIhNtYmLwkzZc8c(this.f$0);
                }
            });
            return;
        }
        TLRPC.TL_messages_getAttachMenuBots tL_messages_getAttachMenuBots = new TLRPC.TL_messages_getAttachMenuBots();
        tL_messages_getAttachMenuBots.hash = z2 ? 0L : this.menuBotsUpdateHash;
        getConnectionsManager().sendRequest(tL_messages_getAttachMenuBots, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                MediaDataController.m586$r8$lambda$MqQCCyOSGNaEQeiCJYsWERkGbs(this.f$0, runnable, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$Z8M5cAQCbsKSBIhNtYmLwkzZc8c(MediaDataController mediaDataController) throws Throwable {
        Throwable th;
        long j;
        int i;
        TLRPC.TL_attachMenuBots tL_attachMenuBots;
        int i2;
        TLRPC.TL_attachMenuBots tL_attachMenuBots2;
        SQLiteCursor sQLiteCursorQueryFinalized;
        int iIntValue;
        TLRPC.TL_attachMenuBots tL_attachMenuBots3;
        mediaDataController.getClass();
        SQLiteCursor sQLiteCursor = null;
        tL_attachMenuBots = null;
        TLRPC.TL_attachMenuBots tL_attachMenuBots4 = null;
        sQLiteCursor = null;
        long jLongValue = 0;
        try {
            try {
                sQLiteCursorQueryFinalized = mediaDataController.getMessagesStorage().getDatabase().queryFinalized("SELECT data, hash, date FROM attach_menu_bots", new Object[0]);
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
                            iIntValue = sQLiteCursorQueryFinalized.intValue(2);
                        } else {
                            j = 0;
                            tL_attachMenuBots3 = null;
                            iIntValue = 0;
                        }
                        if (tL_attachMenuBots3 != null) {
                            try {
                                ArrayList<Long> arrayList = new ArrayList<>();
                                for (int i3 = 0; i3 < tL_attachMenuBots3.bots.size(); i3++) {
                                    arrayList.add(Long.valueOf(tL_attachMenuBots3.bots.get(i3).bot_id));
                                }
                                tL_attachMenuBots3.users.addAll(mediaDataController.getMessagesStorage().getUsers(arrayList));
                            } catch (Exception e) {
                                e = e;
                                tL_attachMenuBots = tL_attachMenuBots3;
                                i = iIntValue;
                                sQLiteCursor = sQLiteCursorQueryFinalized;
                                FileLog.e((Throwable) e, false);
                                if (sQLiteCursor != null) {
                                    sQLiteCursorQueryFinalized = sQLiteCursor;
                                    iIntValue = i;
                                    tL_attachMenuBots3 = tL_attachMenuBots;
                                } else {
                                    i2 = i;
                                    tL_attachMenuBots2 = tL_attachMenuBots;
                                }
                                mediaDataController.processLoadedMenuBots(tL_attachMenuBots2, j, i2, true);
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteCursor = sQLiteCursorQueryFinalized;
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                            throw th;
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    j = jLongValue;
                    i = 0;
                    tL_attachMenuBots = tL_attachMenuBots4;
                }
            } catch (Exception e3) {
                e = e3;
                j = 0;
                i = 0;
                tL_attachMenuBots = null;
            }
            sQLiteCursorQueryFinalized.dispose();
            i2 = iIntValue;
            tL_attachMenuBots2 = tL_attachMenuBots3;
            mediaDataController.processLoadedMenuBots(tL_attachMenuBots2, j, i2, true);
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static void m586$r8$lambda$MqQCCyOSGNaEQeiCJYsWERkGbs(MediaDataController mediaDataController, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        mediaDataController.getClass();
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (tLObject instanceof TLRPC.TL_attachMenuBotsNotModified) {
            mediaDataController.processLoadedMenuBots(null, 0L, iCurrentTimeMillis, false);
        } else if (tLObject instanceof TLRPC.TL_attachMenuBots) {
            TLRPC.TL_attachMenuBots tL_attachMenuBots = (TLRPC.TL_attachMenuBots) tLObject;
            mediaDataController.processLoadedMenuBots(tL_attachMenuBots, tL_attachMenuBots.hash, iCurrentTimeMillis, false);
        }
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
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
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    NotificationCenter.getInstance(this.f$0.currentAccount).postNotificationName(NotificationCenter.attachMenuBotsDidLoad, new Object[0]);
                }
            });
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

    public boolean isMenuBotsUpdatedLocal() {
        return this.menuBotsUpdatedLocal;
    }

    public void updateAttachMenuBotsInCache() {
        if (getAttachMenuBots() != null) {
            putMenuBotsToCache(getAttachMenuBots(), this.menuBotsUpdateHash, this.menuBotsUpdateDate);
        }
    }

    private void putMenuBotsToCache(final TLRPC.TL_attachMenuBots tL_attachMenuBots, final long j, final int i) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$UVHeos5MQt8bT2cboTt36qcd4K4(this.f$0, tL_attachMenuBots, j, i);
            }
        });
    }

    public static void $r8$lambda$UVHeos5MQt8bT2cboTt36qcd4K4(MediaDataController mediaDataController, TLRPC.TL_attachMenuBots tL_attachMenuBots, long j, int i) {
        mediaDataController.getClass();
        try {
            if (tL_attachMenuBots != null) {
                mediaDataController.getMessagesStorage().getDatabase().executeFast("DELETE FROM attach_menu_bots").stepThis().dispose();
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast = mediaDataController.getMessagesStorage().getDatabase().executeFast("REPLACE INTO attach_menu_bots VALUES(?, ?, ?)");
                sQLitePreparedStatementExecuteFast.requery();
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_attachMenuBots.getObjectSize());
                tL_attachMenuBots.serializeToStream(nativeByteBuffer);
                sQLitePreparedStatementExecuteFast.bindByteBuffer(1, nativeByteBuffer);
                sQLitePreparedStatementExecuteFast.bindLong(2, j);
                sQLitePreparedStatementExecuteFast.bindInteger(3, i);
                sQLitePreparedStatementExecuteFast.step();
                nativeByteBuffer.reuse();
                sQLitePreparedStatementExecuteFast.dispose();
                return;
            }
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast2 = mediaDataController.getMessagesStorage().getDatabase().executeFast("UPDATE attach_menu_bots SET date = ?");
            sQLitePreparedStatementExecuteFast2.requery();
            sQLitePreparedStatementExecuteFast2.bindLong(1, i);
            sQLitePreparedStatementExecuteFast2.step();
            sQLitePreparedStatementExecuteFast2.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void loadPremiumPromo(boolean z) {
        this.isLoadingPremiumPromo = true;
        if (z) {
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() throws Throwable {
                    MediaDataController.m585$r8$lambda$Kq4LOBomaiRU_xEpLr2YF5IwPE(this.f$0);
                }
            });
        } else {
            getConnectionsManager().sendRequest(new TLRPC.TL_help_getPremiumPromo(), new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    MediaDataController.$r8$lambda$re7KSg8prXeLtddtPQ_lsCYw9mA(this.f$0, tLObject, tL_error);
                }
            });
        }
    }

    public static void m585$r8$lambda$Kq4LOBomaiRU_xEpLr2YF5IwPE(MediaDataController mediaDataController) throws Throwable {
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo;
        SQLiteCursor sQLiteCursorQueryFinalized;
        mediaDataController.getClass();
        SQLiteCursor sQLiteCursor = null;
        tL_help_premiumPromoTLdeserialize = null;
        tL_help_premiumPromoTLdeserialize = null;
        TLRPC.TL_help_premiumPromo tL_help_premiumPromoTLdeserialize = null;
        sQLiteCursor = null;
        int iIntValue = 0;
        try {
            try {
                sQLiteCursorQueryFinalized = mediaDataController.getMessagesStorage().getDatabase().queryFinalized("SELECT data, date FROM premium_promo", new Object[0]);
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
                    mediaDataController.processLoadedPremiumPromo(tL_help_premiumPromo, iIntValue, true);
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
            mediaDataController.processLoadedPremiumPromo(tL_help_premiumPromo, iIntValue, true);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void $r8$lambda$re7KSg8prXeLtddtPQ_lsCYw9mA(MediaDataController mediaDataController, TLObject tLObject, TLRPC.TL_error tL_error) {
        mediaDataController.getClass();
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (tLObject instanceof TLRPC.TL_help_premiumPromo) {
            mediaDataController.processLoadedPremiumPromo((TLRPC.TL_help_premiumPromo) tLObject, iCurrentTimeMillis, false);
        }
    }

    public void processLoadedPremiumPromo(TLRPC.TL_help_premiumPromo tL_help_premiumPromo, int i, boolean z) {
        if (tL_help_premiumPromo != null) {
            this.premiumPromo = tL_help_premiumPromo;
            this.premiumPromoUpdateDate = i;
            getMessagesController().putUsers(tL_help_premiumPromo.users, z);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.getNotificationCenter().postNotificationName(NotificationCenter.premiumPromoUpdated, new Object[0]);
                }
            });
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

    private void putPremiumPromoToCache(final TLRPC.TL_help_premiumPromo tL_help_premiumPromo, final int i) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$I9eXeS9zQEPa7_ui8ylQjaYmgRY(this.f$0, tL_help_premiumPromo, i);
            }
        });
    }

    public static void $r8$lambda$I9eXeS9zQEPa7_ui8ylQjaYmgRY(MediaDataController mediaDataController, TLRPC.TL_help_premiumPromo tL_help_premiumPromo, int i) {
        mediaDataController.getClass();
        try {
            if (tL_help_premiumPromo != null) {
                mediaDataController.getMessagesStorage().getDatabase().executeFast("DELETE FROM premium_promo").stepThis().dispose();
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast = mediaDataController.getMessagesStorage().getDatabase().executeFast("REPLACE INTO premium_promo VALUES(?, ?)");
                sQLitePreparedStatementExecuteFast.requery();
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_help_premiumPromo.getObjectSize());
                tL_help_premiumPromo.serializeToStream(nativeByteBuffer);
                sQLitePreparedStatementExecuteFast.bindByteBuffer(1, nativeByteBuffer);
                sQLitePreparedStatementExecuteFast.bindInteger(2, i);
                sQLitePreparedStatementExecuteFast.step();
                nativeByteBuffer.reuse();
                sQLitePreparedStatementExecuteFast.dispose();
                return;
            }
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast2 = mediaDataController.getMessagesStorage().getDatabase().executeFast("UPDATE premium_promo SET date = ?");
            sQLitePreparedStatementExecuteFast2.requery();
            sQLitePreparedStatementExecuteFast2.bindInteger(1, i);
            sQLitePreparedStatementExecuteFast2.step();
            sQLitePreparedStatementExecuteFast2.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public List<TLRPC.TL_availableReaction> getReactionsList() {
        return this.reactionsList;
    }

    public void loadReactions(boolean z, Integer num) {
        this.isLoadingReactions = true;
        if (z) {
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() throws Throwable {
                    MediaDataController.m611$r8$lambda$eDp6PT6Ef_tMo935N_cjpZMLM8(this.f$0);
                }
            });
            return;
        }
        TLRPC.TL_messages_getAvailableReactions tL_messages_getAvailableReactions = new TLRPC.TL_messages_getAvailableReactions();
        tL_messages_getAvailableReactions.hash = num != null ? num.intValue() : this.reactionsUpdateHash;
        getConnectionsManager().sendRequest(tL_messages_getAvailableReactions, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                MediaDataController.$r8$lambda$kNqTJmDPLNX5ten7mx2ZsU3Z3NU(this.f$0, tLObject, tL_error);
            }
        });
    }

    public static void m611$r8$lambda$eDp6PT6Ef_tMo935N_cjpZMLM8(final MediaDataController mediaDataController) throws Throwable {
        final ArrayList arrayList;
        final int i;
        Exception e;
        SQLiteCursor sQLiteCursorQueryFinalized;
        SQLiteCursor sQLiteCursor;
        int iIntValue;
        mediaDataController.getClass();
        SQLiteCursor sQLiteCursor2 = null;
        arrayList = null;
        arrayList = null;
        ArrayList arrayList2 = null;
        final int i2 = 0;
        try {
            sQLiteCursorQueryFinalized = mediaDataController.getMessagesStorage().getDatabase().queryFinalized("SELECT data, hash, date FROM reactions", new Object[0]);
            try {
                try {
                    if (sQLiteCursorQueryFinalized.next()) {
                        NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                        if (nativeByteBufferByteBufferValue != null) {
                            int int32 = nativeByteBufferByteBufferValue.readInt32(false);
                            ArrayList arrayList3 = new ArrayList(int32);
                            for (int i3 = 0; i3 < int32; i3++) {
                                try {
                                    arrayList3.add(TLRPC.TL_availableReaction.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), true));
                                } catch (Exception e2) {
                                    e = e2;
                                    arrayList = arrayList3;
                                    i = 0;
                                    FileLog.e((Throwable) e, false);
                                    if (sQLiteCursorQueryFinalized != null) {
                                        arrayList2 = arrayList;
                                        i2 = i;
                                        sQLiteCursor = sQLiteCursorQueryFinalized;
                                        iIntValue = 0;
                                        sQLiteCursor.dispose();
                                        arrayList = arrayList2;
                                        i = i2;
                                        i2 = iIntValue;
                                    }
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            this.f$0.processLoadedReactions(arrayList, i, i2, true);
                                        }
                                    });
                                }
                            }
                            nativeByteBufferByteBufferValue.reuse();
                            arrayList2 = arrayList3;
                        }
                        int iIntValue2 = sQLiteCursorQueryFinalized.intValue(1);
                        try {
                            iIntValue = sQLiteCursorQueryFinalized.intValue(2);
                            i2 = iIntValue2;
                            sQLiteCursor = sQLiteCursorQueryFinalized;
                        } catch (Exception e3) {
                            arrayList = arrayList2;
                            e = e3;
                            i = iIntValue2;
                            FileLog.e((Throwable) e, false);
                            if (sQLiteCursorQueryFinalized != null) {
                                arrayList2 = arrayList;
                                i2 = i;
                                sQLiteCursor = sQLiteCursorQueryFinalized;
                                iIntValue = 0;
                            }
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    this.f$0.processLoadedReactions(arrayList, i, i2, true);
                                }
                            });
                        }
                    } else {
                        sQLiteCursor = sQLiteCursorQueryFinalized;
                        iIntValue = 0;
                    }
                } catch (Exception e4) {
                    arrayList = arrayList2;
                    e = e4;
                }
            } catch (Throwable th) {
                th = th;
                sQLiteCursor2 = sQLiteCursorQueryFinalized;
                if (sQLiteCursor2 != null) {
                    sQLiteCursor2.dispose();
                }
                throw th;
            }
        } catch (Exception e5) {
            arrayList = null;
            i = 0;
            e = e5;
            sQLiteCursorQueryFinalized = null;
        } catch (Throwable th2) {
            th = th2;
            if (sQLiteCursor2 != null) {
                sQLiteCursor2.dispose();
            }
            throw th;
        }
        sQLiteCursor.dispose();
        arrayList = arrayList2;
        i = i2;
        i2 = iIntValue;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.processLoadedReactions(arrayList, i, i2, true);
            }
        });
    }

    public static void $r8$lambda$kNqTJmDPLNX5ten7mx2ZsU3Z3NU(final MediaDataController mediaDataController, final TLObject tLObject, TLRPC.TL_error tL_error) {
        mediaDataController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$FW438GfIEZBoF1GmXLMqJXfqjRw(this.f$0, tLObject);
            }
        });
    }

    public static void $r8$lambda$FW438GfIEZBoF1GmXLMqJXfqjRw(MediaDataController mediaDataController, TLObject tLObject) {
        mediaDataController.getClass();
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (tLObject instanceof TLRPC.TL_messages_availableReactionsNotModified) {
            mediaDataController.processLoadedReactions(null, 0, iCurrentTimeMillis, false);
        } else if (tLObject instanceof TLRPC.TL_messages_availableReactions) {
            TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject;
            mediaDataController.processLoadedReactions(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, iCurrentTimeMillis, false);
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
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.$r8$lambda$69I02E5ONarYELf3H4HgKNRNZiE(this.f$0);
                }
            });
        }
        this.isLoadingReactions = false;
        if (!z) {
            putReactionsToCache(list, i, i2);
        } else {
            Math.abs((System.currentTimeMillis() / 1000) - ((long) i2));
            loadReactions(false, Integer.valueOf(i));
        }
    }

    public static void $r8$lambda$69I02E5ONarYELf3H4HgKNRNZiE(MediaDataController mediaDataController) {
        mediaDataController.preloadDefaultReactions();
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.reactionsDidLoad, new Object[0]);
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

    public void preloadImage(ImageReceiver imageReceiver, ImageLocation imageLocation, String str) {
        if (LiteMode.isEnabled(8200)) {
            imageReceiver.setUniqKeyPrefix("preload");
            imageReceiver.setFileLoadingPriority(0);
            imageReceiver.setImage(imageLocation, str, null, null, 0, 11);
        }
    }

    private void putReactionsToCache(List<TLRPC.TL_availableReaction> list, final int i, final int i2) {
        final ArrayList arrayList = list != null ? new ArrayList(list) : null;
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.m600$r8$lambda$WI94MH6ycVcKv9fsYcXYj0GQ(this.f$0, arrayList, i, i2);
            }
        });
    }

    public static void m600$r8$lambda$WI94MH6ycVcKv9fsYcXYj0GQ(MediaDataController mediaDataController, ArrayList arrayList, int i, int i2) {
        mediaDataController.getClass();
        try {
            if (arrayList != null) {
                mediaDataController.getMessagesStorage().getDatabase().executeFast("DELETE FROM reactions").stepThis().dispose();
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast = mediaDataController.getMessagesStorage().getDatabase().executeFast("REPLACE INTO reactions VALUES(?, ?, ?)");
                sQLitePreparedStatementExecuteFast.requery();
                int objectSize = 4;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    objectSize += ((TLRPC.TL_availableReaction) arrayList.get(i3)).getObjectSize();
                }
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(objectSize);
                nativeByteBuffer.writeInt32(arrayList.size());
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    ((TLRPC.TL_availableReaction) arrayList.get(i4)).serializeToStream(nativeByteBuffer);
                }
                sQLitePreparedStatementExecuteFast.bindByteBuffer(1, nativeByteBuffer);
                sQLitePreparedStatementExecuteFast.bindInteger(2, i);
                sQLitePreparedStatementExecuteFast.bindInteger(3, i2);
                sQLitePreparedStatementExecuteFast.step();
                nativeByteBuffer.reuse();
                sQLitePreparedStatementExecuteFast.dispose();
                return;
            }
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast2 = mediaDataController.getMessagesStorage().getDatabase().executeFast("UPDATE reactions SET date = ?");
            sQLitePreparedStatementExecuteFast2.requery();
            sQLitePreparedStatementExecuteFast2.bindLong(1, i2);
            sQLitePreparedStatementExecuteFast2.step();
            sQLitePreparedStatementExecuteFast2.dispose();
        } catch (Exception e) {
            FileLog.e(e);
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

    public void checkFeaturedEmoji() {
        if (this.loadingFeaturedStickers[1]) {
            return;
        }
        if (!this.featuredStickersLoaded[1] || Math.abs((System.currentTimeMillis() / 1000) - ((long) this.loadFeaturedDate[1])) >= 3600) {
            loadFeaturedStickers(true, true);
        }
    }

    public ArrayList<TLRPC.Document> getRecentStickers(int i) {
        return getRecentStickers(i, false);
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

    public ArrayList<TLRPC.Document> getRecentStickersNoCopy(int i) {
        return this.recentStickers[i];
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

    public void clearRecentStickers() {
        getConnectionsManager().sendRequest(new TLRPC.TL_messages_clearRecentStickers(), new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                MediaDataController.$r8$lambda$EzSGIUHiIJ5WBhLe_BJfyzudDkk(this.f$0, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$EzSGIUHiIJ5WBhLe_BJfyzudDkk(final MediaDataController mediaDataController, final TLObject tLObject, TLRPC.TL_error tL_error) {
        mediaDataController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.m574$r8$lambda$CqfEGwQRGyyUniiSuQofOgtAjo(this.f$0, tLObject);
            }
        });
    }

    public static void m574$r8$lambda$CqfEGwQRGyyUniiSuQofOgtAjo(final MediaDataController mediaDataController, TLObject tLObject) {
        mediaDataController.getClass();
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            mediaDataController.getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.$r8$lambda$CU9RPtuGjL7ImxncXTGQTyO_VDk(this.f$0);
                }
            });
            mediaDataController.recentStickers[0].clear();
            NotificationCenter.getInstance(mediaDataController.currentAccount).postNotificationName(NotificationCenter.recentDocumentsDidLoad, Boolean.FALSE, 0);
        }
    }

    public static void $r8$lambda$CU9RPtuGjL7ImxncXTGQTyO_VDk(MediaDataController mediaDataController) {
        mediaDataController.getClass();
        try {
            mediaDataController.getMessagesStorage().getDatabase().executeFast("DELETE FROM web_recent_v3 WHERE type = 3").stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void addRecentSticker(final int i, final Object obj, TLRPC.Document document, int i2, boolean z) {
        int i3;
        final TLRPC.Document documentRemove;
        if (i != 3) {
            if (MessageObject.isStickerDocument(document) || MessageObject.isAnimatedStickerDocument(document, true)) {
                int i4 = 0;
                while (true) {
                    if (i4 >= this.recentStickers[i].size()) {
                        if (!z) {
                            this.recentStickers[i].add(0, document);
                            break;
                        }
                        break;
                    }
                    TLRPC.Document document2 = this.recentStickers[i].get(i4);
                    if (document2.id == document.id) {
                        this.recentStickers[i].remove(i4);
                        if (!z) {
                            this.recentStickers[i].add(0, document2);
                            break;
                        }
                        break;
                    }
                    i4++;
                }
                if (i == 2) {
                    if (z) {
                        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.showBulletin, 0, document, 4);
                    } else {
                        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.showBulletin, 0, document, Integer.valueOf(this.recentStickers[i].size() > getMessagesController().maxFaveStickersCount ? 6 : 5));
                    }
                    final TLRPC.TL_messages_faveSticker tL_messages_faveSticker = new TLRPC.TL_messages_faveSticker();
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
                    getConnectionsManager().sendRequest(tL_messages_faveSticker, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            MediaDataController.$r8$lambda$vXKi8NwHYFvPEZ8sA01Fe340vUU(this.f$0, obj, tL_messages_faveSticker, tLObject, tL_error);
                        }
                    });
                    i3 = getMessagesController().maxFaveStickersCount;
                } else {
                    if (i == 0 && z) {
                        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.showBulletin, 0, document, 3);
                        final TLRPC.TL_messages_saveRecentSticker tL_messages_saveRecentSticker = new TLRPC.TL_messages_saveRecentSticker();
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
                        getConnectionsManager().sendRequest(tL_messages_saveRecentSticker, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                MediaDataController.$r8$lambda$LVRJuf3vc_quXQl_rP1Fj3kUpdY(this.f$0, obj, tL_messages_saveRecentSticker, tLObject, tL_error);
                            }
                        });
                    }
                    i3 = getMessagesController().maxRecentStickersCount;
                }
                if (this.recentStickers[i].size() > i3 || z) {
                    if (z) {
                        documentRemove = document;
                    } else {
                        ArrayList<TLRPC.Document> arrayList = this.recentStickers[i];
                        documentRemove = arrayList.remove(arrayList.size() - 1);
                    }
                    getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                        @Override
                        public final void run() {
                            MediaDataController.$r8$lambda$TLWqnjoTKlz28f8rZE0rT1gRSqU(this.f$0, i, documentRemove);
                        }
                    });
                }
                if (!z) {
                    ArrayList<TLRPC.Document> arrayList2 = new ArrayList<>();
                    arrayList2.add(document);
                    processLoadedRecentDocuments(i, arrayList2, false, i2, false);
                }
                if (i == 2 || (i == 0 && z)) {
                    getNotificationCenter().postNotificationName(NotificationCenter.recentDocumentsDidLoad, Boolean.FALSE, Integer.valueOf(i));
                }
            }
        }
    }

    public static void $r8$lambda$vXKi8NwHYFvPEZ8sA01Fe340vUU(final MediaDataController mediaDataController, Object obj, TLRPC.TL_messages_faveSticker tL_messages_faveSticker, TLObject tLObject, TLRPC.TL_error tL_error) {
        mediaDataController.getClass();
        if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && obj != null) {
            mediaDataController.getFileRefController().requestReference(obj, tL_messages_faveSticker);
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.getMediaDataController().loadRecents(2, false, false, true);
                }
            });
        }
    }

    public static void $r8$lambda$LVRJuf3vc_quXQl_rP1Fj3kUpdY(MediaDataController mediaDataController, Object obj, TLRPC.TL_messages_saveRecentSticker tL_messages_saveRecentSticker, TLObject tLObject, TLRPC.TL_error tL_error) {
        mediaDataController.getClass();
        if (tL_error == null || !FileRefController.isFileRefError(tL_error.text) || obj == null) {
            return;
        }
        mediaDataController.getFileRefController().requestReference(obj, tL_messages_saveRecentSticker);
    }

    public static void $r8$lambda$TLWqnjoTKlz28f8rZE0rT1gRSqU(MediaDataController mediaDataController, int i, TLRPC.Document document) {
        int i2;
        mediaDataController.getClass();
        if (i == 0) {
            i2 = 3;
        } else if (i == 1) {
            i2 = 4;
        } else {
            i2 = i == 5 ? 7 : 5;
        }
        try {
            mediaDataController.getMessagesStorage().getDatabase().executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document.id + "' AND type = " + i2).stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public ArrayList<TLRPC.Document> getRecentGifs() {
        return new ArrayList<>(this.recentGifs);
    }

    public void removeRecentGif(final TLRPC.Document document) {
        int size = this.recentGifs.size();
        for (int i = 0; i < size; i++) {
            if (this.recentGifs.get(i).id == document.id) {
                this.recentGifs.remove(i);
                break;
            }
        }
        final TLRPC.TL_messages_saveGif tL_messages_saveGif = new TLRPC.TL_messages_saveGif();
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
        getConnectionsManager().sendRequest(tL_messages_saveGif, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                MediaDataController.$r8$lambda$M_Yg2ICpRxdgoUlYCFcXem1vAQ8(this.f$0, tL_messages_saveGif, tLObject, tL_error);
            }
        });
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$NR1zgjF19mQzjzgXuqoNwa5wMWw(this.f$0, document);
            }
        });
    }

    public static void $r8$lambda$M_Yg2ICpRxdgoUlYCFcXem1vAQ8(MediaDataController mediaDataController, TLRPC.TL_messages_saveGif tL_messages_saveGif, TLObject tLObject, TLRPC.TL_error tL_error) {
        mediaDataController.getClass();
        if (tL_error == null || !FileRefController.isFileRefError(tL_error.text)) {
            return;
        }
        mediaDataController.getFileRefController().requestReference("gif", tL_messages_saveGif);
    }

    public static void $r8$lambda$NR1zgjF19mQzjzgXuqoNwa5wMWw(MediaDataController mediaDataController, TLRPC.Document document) {
        mediaDataController.getClass();
        try {
            mediaDataController.getMessagesStorage().getDatabase().executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document.id + "' AND type = 2").stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
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

    public void addRecentGif(final TLRPC.Document document, int i, boolean z) {
        if (document == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            if (i2 < this.recentGifs.size()) {
                TLRPC.Document document2 = this.recentGifs.get(i2);
                if (document2.id == document.id) {
                    this.recentGifs.remove(i2);
                    this.recentGifs.add(0, document2);
                    break;
                }
                i2++;
            } else {
                this.recentGifs.add(0, document);
                break;
            }
        }
        if ((this.recentGifs.size() > getMessagesController().savedGifsLimitDefault && !UserConfig.getInstance(this.currentAccount).isPremium()) || this.recentGifs.size() > getMessagesController().savedGifsLimitPremium) {
            ArrayList<TLRPC.Document> arrayList = this.recentGifs;
            final TLRPC.Document documentRemove = arrayList.remove(arrayList.size() - 1);
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.$r8$lambda$c0UrFklevNlRnZZrO7XE1PZUn30(this.f$0, documentRemove);
                }
            });
            if (z) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.showBulletin, 0, document, 7);
                    }
                });
            }
        }
        ArrayList<TLRPC.Document> arrayList2 = new ArrayList<>();
        arrayList2.add(document);
        processLoadedRecentDocuments(0, arrayList2, true, i, false);
    }

    public static void $r8$lambda$c0UrFklevNlRnZZrO7XE1PZUn30(MediaDataController mediaDataController, TLRPC.Document document) {
        mediaDataController.getClass();
        try {
            mediaDataController.getMessagesStorage().getDatabase().executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document.id + "' AND type = 2").stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public boolean isLoadingStickers(int i) {
        return this.loadingStickers[i];
    }

    public void replaceStickerSet(final TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        boolean z;
        int i;
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
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.m624$r8$lambda$riw0aiiTKACveXurdnmw4AuYiw(this.f$0, tL_messages_stickerSet);
                }
            });
            z = true;
        } else {
            LongSparseArray longSparseArray = new LongSparseArray();
            int size = tL_messages_stickerSet.documents.size();
            for (int i2 = 0; i2 < size; i2++) {
                TLRPC.Document document = tL_messages_stickerSet.documents.get(i2);
                longSparseArray.put(document.id, document);
            }
            int size2 = tL_messages_stickerSet2.documents.size();
            z = false;
            for (int i3 = 0; i3 < size2; i3++) {
                TLRPC.Document document2 = (TLRPC.Document) longSparseArray.get(tL_messages_stickerSet2.documents.get(i3).id);
                if (document2 != null) {
                    tL_messages_stickerSet2.documents.set(i3, document2);
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
            if (stickerSet.masks) {
                i = 1;
            } else {
                i = stickerSet.emojis ? 5 : 0;
            }
            putStickersToCache(i, this.stickerSets[i], this.loadDate[i], this.loadHash[i]);
            if ("AnimatedEmojies".equals(tL_messages_stickerSet.set.short_name)) {
                putStickersToCache(4, this.stickerSets[4], this.loadDate[4], this.loadHash[4]);
            }
        }
    }

    public static void m624$r8$lambda$riw0aiiTKACveXurdnmw4AuYiw(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        LongSparseArray stickerByIds = mediaDataController.getStickerByIds(4);
        for (int i = 0; i < tL_messages_stickerSet.documents.size(); i++) {
            TLRPC.Document document = tL_messages_stickerSet.documents.get(i);
            stickerByIds.put(document.id, document);
        }
    }

    public TLRPC.TL_messages_stickerSet getStickerSetByName(String str) {
        if (str == null) {
            return null;
        }
        return this.stickerSetsByName.get(str.toLowerCase());
    }

    public void findStickerSetByNameInCache(final String str, final Utilities.Callback<TLRPC.TL_messages_stickerSet> callback) {
        if (callback == null) {
            return;
        }
        if (str == null) {
            callback.run(null);
        } else {
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.m576$r8$lambda$DoQc5OxIUBlwUcgRZ3E7pIEig(this.f$0, str, callback);
                }
            });
        }
    }

    public static void m576$r8$lambda$DoQc5OxIUBlwUcgRZ3E7pIEig(final MediaDataController mediaDataController, String str, final Utilities.Callback callback) {
        mediaDataController.getClass();
        final TLRPC.TL_messages_stickerSet cachedStickerSetInternal = mediaDataController.getCachedStickerSetInternal(str.toLowerCase(), (Integer) 0);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$GvC_Yam1hwFYTacpV2OFfCLhVws(this.f$0, cachedStickerSetInternal, callback);
            }
        });
    }

    public static void $r8$lambda$GvC_Yam1hwFYTacpV2OFfCLhVws(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Utilities.Callback callback) {
        mediaDataController.putStickerSet(tL_messages_stickerSet, false);
        callback.run(tL_messages_stickerSet);
    }

    public TLRPC.TL_messages_stickerSet getStickerSetByEmojiOrName(String str) {
        return this.diceStickerSetsByEmoji.get(str);
    }

    public TLRPC.TL_messages_stickerSet getStickerSetById(long j) {
        return (TLRPC.TL_messages_stickerSet) this.stickerSetsById.get(j);
    }

    public TLRPC.TL_messages_stickerSet getGroupStickerSetById(TLRPC.StickerSet stickerSet) {
        TLRPC.StickerSet stickerSet2;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.stickerSetsById.get(stickerSet.id);
        if (tL_messages_stickerSet == null) {
            tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.groupStickerSets.get(stickerSet.id);
            if (tL_messages_stickerSet == null || (stickerSet2 = tL_messages_stickerSet.set) == null) {
                loadGroupStickerSet(stickerSet, true);
            } else {
                if (stickerSet2.hash != stickerSet.hash) {
                    loadGroupStickerSet(stickerSet, false);
                }
                return tL_messages_stickerSet;
            }
        }
        return tL_messages_stickerSet;
    }

    public void putGroupStickerSet(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.groupStickerSets.put(tL_messages_stickerSet.set.id, tL_messages_stickerSet);
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

    public void setPlaceholderImage(final BackupImageView backupImageView, String str, final String str2, final String str3) {
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName.short_name = str;
        getInstance(this.currentAccount).getStickerSet(tL_inputStickerSetShortName, 0, false, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                MediaDataController.m579$r8$lambda$Ex_Ge2zW3aQweJAgm6QFrftidY(str2, backupImageView, str3, (TLRPC.TL_messages_stickerSet) obj);
            }
        });
    }

    public static void m579$r8$lambda$Ex_Ge2zW3aQweJAgm6QFrftidY(String str, BackupImageView backupImageView, String str2, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
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
            TLRPC.Document document2 = tL_messages_stickerSet.documents.get(i2);
            int size = emojis.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    document = document2;
                    break loop1;
                }
                Emoji.EmojiSpanRange emojiSpanRange = emojis.get(i3);
                i3++;
                Emoji.EmojiSpanRange emojiSpanRange2 = emojiSpanRange;
                int i4 = 0;
                while (true) {
                    if (i4 < tL_messages_stickerSet.packs.size()) {
                        if (!tL_messages_stickerSet.packs.get(i4).documents.contains(Long.valueOf(document2.id)) || !TextUtils.equals(Emoji.fixEmoji(tL_messages_stickerSet.packs.get(i4).emoticon), emojiSpanRange2.code)) {
                            i4++;
                        }
                    }
                }
            }
            i2++;
        }
        if (document != null) {
            backupImageView.setImage(ImageLocation.getForDocument(document), str2, DocumentObject.getSvgThumb(document, Theme.key_windowBackgroundWhiteGrayIcon, 0.2f, 1.0f, null), 0, document);
            backupImageView.invalidate();
        }
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
        if (inputStickerSet instanceof TLRPC.TL_inputStickerSetTonGifts) {
            return "tonGifts";
        }
        return "null";
    }

    public TLRPC.TL_messages_stickerSet getStickerSet(TLRPC.StickerSet stickerSet, boolean z) {
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_inputStickerSetID.id = stickerSet.id;
        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
        return getStickerSet(tL_inputStickerSetID, z);
    }

    public TLRPC.TL_messages_stickerSet getStickerSet(TLRPC.InputStickerSet inputStickerSet, boolean z) {
        return getStickerSet(inputStickerSet, null, z, null);
    }

    public TLRPC.TL_messages_stickerSet getStickerSet(TLRPC.InputStickerSet inputStickerSet, Integer num, boolean z) {
        return getStickerSet(inputStickerSet, num, z, null);
    }

    public TLRPC.TL_messages_stickerSet getStickerSet(TLRPC.InputStickerSet inputStickerSet, Integer num, boolean z, Utilities.Callback<TLRPC.TL_messages_stickerSet> callback) {
        return getStickerSet(inputStickerSet, num, z, false, callback);
    }

    public TLRPC.TL_messages_stickerSet getStickerSet(final TLRPC.InputStickerSet inputStickerSet, final Integer num, final boolean z, boolean z2, final Utilities.Callback<TLRPC.TL_messages_stickerSet> callback) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        String str;
        if (inputStickerSet == null) {
            return null;
        }
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
        if (callback == null && this.loadingStickerSetsKeys.contains(strInputSetKey)) {
            return null;
        }
        this.loadingStickerSetsKeys.add(strInputSetKey);
        if (z3) {
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.$r8$lambda$6O1ztpcNT7uog7WAk_0CERa13nc(this.f$0, inputStickerSet, num, strInputSetKey, callback, z);
                }
            });
        } else if (inputStickerSet instanceof TLRPC.TL_inputStickerSetShortName) {
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.$r8$lambda$Eja_N0PqlZtBYpsL9pz4oi6M6rY(this.f$0, inputStickerSet, num, strInputSetKey, callback, z);
                }
            });
        } else if (!z) {
            fetchStickerSetInternal(inputStickerSet, new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    MediaDataController.m575$r8$lambda$CrJOwAYqBwSqoO6iHdM6y04THg(this.f$0, strInputSetKey, callback, inputStickerSet, (Boolean) obj, (TLRPC.TL_messages_stickerSet) obj2);
                }
            });
        } else {
            this.loadingStickerSetsKeys.remove(strInputSetKey);
        }
        return null;
    }

    public static void $r8$lambda$6O1ztpcNT7uog7WAk_0CERa13nc(final MediaDataController mediaDataController, final TLRPC.InputStickerSet inputStickerSet, Integer num, final String str, final Utilities.Callback callback, final boolean z) {
        mediaDataController.getClass();
        final TLRPC.TL_messages_stickerSet cachedStickerSetInternal = mediaDataController.getCachedStickerSetInternal(inputStickerSet.id, num);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$6oqN5dTVFKweI_LiNiSPoVU5QSY(this.f$0, cachedStickerSetInternal, str, callback, z, inputStickerSet);
            }
        });
    }

    public static void $r8$lambda$6oqN5dTVFKweI_LiNiSPoVU5QSY(final MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, final String str, final Utilities.Callback callback, boolean z, TLRPC.InputStickerSet inputStickerSet) {
        if (tL_messages_stickerSet == null) {
            if (z) {
                mediaDataController.loadingStickerSetsKeys.remove(str);
                return;
            } else {
                mediaDataController.getClass();
                mediaDataController.fetchStickerSetInternal(inputStickerSet, new Utilities.Callback2() {
                    @Override
                    public final void run(Object obj, Object obj2) {
                        MediaDataController.$r8$lambda$urbhM6wRQy2byBMDFx4fKbRFP1s(this.f$0, str, callback, (Boolean) obj, (TLRPC.TL_messages_stickerSet) obj2);
                    }
                });
                return;
            }
        }
        mediaDataController.loadingStickerSetsKeys.remove(str);
        if (callback != null) {
            callback.run(tL_messages_stickerSet);
        }
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        if (stickerSet != null) {
            mediaDataController.stickerSetsById.put(stickerSet.id, tL_messages_stickerSet);
            mediaDataController.stickerSetsByName.put(tL_messages_stickerSet.set.short_name.toLowerCase(), tL_messages_stickerSet);
        }
        mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.groupStickersDidLoad, Long.valueOf(tL_messages_stickerSet.set.id), tL_messages_stickerSet);
    }

    public static void $r8$lambda$urbhM6wRQy2byBMDFx4fKbRFP1s(MediaDataController mediaDataController, String str, Utilities.Callback callback, Boolean bool, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.StickerSet stickerSet;
        mediaDataController.loadingStickerSetsKeys.remove(str);
        if (callback != null) {
            callback.run(tL_messages_stickerSet);
        }
        if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null) {
            return;
        }
        mediaDataController.stickerSetsById.put(stickerSet.id, tL_messages_stickerSet);
        mediaDataController.stickerSetsByName.put(tL_messages_stickerSet.set.short_name.toLowerCase(), tL_messages_stickerSet);
        mediaDataController.saveStickerSetIntoCache(tL_messages_stickerSet);
        mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.groupStickersDidLoad, Long.valueOf(tL_messages_stickerSet.set.id), tL_messages_stickerSet);
    }

    public static void $r8$lambda$Eja_N0PqlZtBYpsL9pz4oi6M6rY(final MediaDataController mediaDataController, final TLRPC.InputStickerSet inputStickerSet, Integer num, final String str, final Utilities.Callback callback, final boolean z) {
        mediaDataController.getClass();
        final TLRPC.TL_messages_stickerSet cachedStickerSetInternal = mediaDataController.getCachedStickerSetInternal(inputStickerSet.short_name.toLowerCase(), num);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$JNugRFtUiguLkmjFBghDUMLhMF0(this.f$0, cachedStickerSetInternal, str, callback, z, inputStickerSet);
            }
        });
    }

    public static void $r8$lambda$JNugRFtUiguLkmjFBghDUMLhMF0(final MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, final String str, final Utilities.Callback callback, boolean z, TLRPC.InputStickerSet inputStickerSet) {
        if (tL_messages_stickerSet == null) {
            if (z) {
                mediaDataController.loadingStickerSetsKeys.remove(str);
                return;
            } else {
                mediaDataController.getClass();
                mediaDataController.fetchStickerSetInternal(inputStickerSet, new Utilities.Callback2() {
                    @Override
                    public final void run(Object obj, Object obj2) {
                        MediaDataController.$r8$lambda$8O1h5vW_ZQtolPIC5pAUPNwV44g(this.f$0, str, callback, (Boolean) obj, (TLRPC.TL_messages_stickerSet) obj2);
                    }
                });
                return;
            }
        }
        mediaDataController.loadingStickerSetsKeys.remove(str);
        if (callback != null) {
            callback.run(tL_messages_stickerSet);
        }
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        if (stickerSet != null) {
            mediaDataController.stickerSetsById.put(stickerSet.id, tL_messages_stickerSet);
            mediaDataController.stickerSetsByName.put(tL_messages_stickerSet.set.short_name.toLowerCase(), tL_messages_stickerSet);
        }
        mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.groupStickersDidLoad, Long.valueOf(tL_messages_stickerSet.set.id), tL_messages_stickerSet);
    }

    public static void $r8$lambda$8O1h5vW_ZQtolPIC5pAUPNwV44g(MediaDataController mediaDataController, String str, Utilities.Callback callback, Boolean bool, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.StickerSet stickerSet;
        mediaDataController.loadingStickerSetsKeys.remove(str);
        if (callback != null) {
            callback.run(tL_messages_stickerSet);
        }
        if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null) {
            return;
        }
        mediaDataController.stickerSetsById.put(stickerSet.id, tL_messages_stickerSet);
        mediaDataController.stickerSetsByName.put(tL_messages_stickerSet.set.short_name.toLowerCase(), tL_messages_stickerSet);
        mediaDataController.saveStickerSetIntoCache(tL_messages_stickerSet);
        mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.groupStickersDidLoad, Long.valueOf(tL_messages_stickerSet.set.id), tL_messages_stickerSet);
    }

    public static void m575$r8$lambda$CrJOwAYqBwSqoO6iHdM6y04THg(MediaDataController mediaDataController, String str, Utilities.Callback callback, TLRPC.InputStickerSet inputStickerSet, Boolean bool, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        mediaDataController.loadingStickerSetsKeys.remove(str);
        if (callback != null) {
            callback.run(tL_messages_stickerSet);
        }
        if (tL_messages_stickerSet != null) {
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null) {
                mediaDataController.stickerSetsById.put(stickerSet.id, tL_messages_stickerSet);
                mediaDataController.stickerSetsByName.put(tL_messages_stickerSet.set.short_name.toLowerCase(), tL_messages_stickerSet);
                boolean z = inputStickerSet instanceof TLRPC.TL_inputStickerSetEmojiDefaultStatuses;
                if (z) {
                    mediaDataController.stickerSetDefaultStatuses = tL_messages_stickerSet;
                }
                if (z) {
                    mediaDataController.stickerSetDefaultChannelStatuses = tL_messages_stickerSet;
                }
            }
            mediaDataController.saveStickerSetIntoCache(tL_messages_stickerSet);
            mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.groupStickersDidLoad, Long.valueOf(tL_messages_stickerSet.set.id), tL_messages_stickerSet);
        }
    }

    public void putStickerSet(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        putStickerSet(tL_messages_stickerSet, true);
    }

    public void putStickerSet(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z) {
        TLRPC.StickerSet stickerSet;
        int i;
        TLRPC.StickerSet stickerSet2;
        if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null) {
            return;
        }
        this.stickerSetsById.put(stickerSet.id, tL_messages_stickerSet);
        if (!TextUtils.isEmpty(tL_messages_stickerSet.set.short_name)) {
            this.stickerSetsByName.put(tL_messages_stickerSet.set.short_name.toLowerCase(), tL_messages_stickerSet);
        }
        int i2 = 0;
        while (true) {
            ArrayList<TLRPC.TL_messages_stickerSet>[] arrayListArr = this.stickerSets;
            if (i2 >= arrayListArr.length) {
                break;
            }
            ArrayList<TLRPC.TL_messages_stickerSet> arrayList = arrayListArr[i2];
            if (arrayList != null) {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayList.get(i3);
                    if (tL_messages_stickerSet2 != null && (stickerSet2 = tL_messages_stickerSet2.set) != null && stickerSet2.id == tL_messages_stickerSet.set.id) {
                        arrayList.set(i3, tL_messages_stickerSet);
                    }
                }
            }
            i2++;
        }
        if (this.groupStickerSets.containsKey(tL_messages_stickerSet.set.id)) {
            this.groupStickerSets.put(tL_messages_stickerSet.set.id, tL_messages_stickerSet);
        }
        saveStickerSetIntoCache(tL_messages_stickerSet);
        TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet.set;
        if (stickerSet3.masks) {
            i = 1;
        } else {
            i = stickerSet3.emojis ? 5 : 0;
        }
        if (z) {
            getNotificationCenter().postNotificationName(NotificationCenter.stickersDidLoad, Integer.valueOf(i), Boolean.TRUE);
        }
    }

    private void cleanupStickerSetCache() {
        if (this.cleanedupStickerSetCache) {
            return;
        }
        this.cleanedupStickerSetCache = true;
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.m580$r8$lambda$FScHBbBXbTYYJAtnVq42LzT_oo(this.f$0);
            }
        });
    }

    public static void m580$r8$lambda$FScHBbBXbTYYJAtnVq42LzT_oo(MediaDataController mediaDataController) {
        mediaDataController.getClass();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() - 604800000;
            mediaDataController.getMessagesStorage().getDatabase().executeFast("DELETE FROM stickersets2 WHERE date < " + jCurrentTimeMillis).stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private void saveStickerSetIntoCache(final TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        if (tL_messages_stickerSet == null || tL_messages_stickerSet.set == null) {
            return;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.m619$r8$lambda$kSA4VFr89LLrx1DPBMsu8AxYs(this.f$0, tL_messages_stickerSet);
            }
        });
        cleanupStickerSetCache();
    }

    public static void m619$r8$lambda$kSA4VFr89LLrx1DPBMsu8AxYs(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        mediaDataController.getClass();
        try {
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = mediaDataController.getMessagesStorage().getDatabase().executeFast("REPLACE INTO stickersets2 VALUES(?, ?, ?, ?, ?)");
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

    private void fetchStickerSetInternal(TLRPC.InputStickerSet inputStickerSet, Utilities.Callback2<Boolean, TLRPC.TL_messages_stickerSet> callback2) {
        if (callback2 == null) {
            return;
        }
        final String strInputSetKey = inputSetKey(inputStickerSet);
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
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                MediaDataController.$r8$lambda$zkmes63lj9SrAlRecGe0bVSiP0c(this.f$0, strInputSetKey, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$zkmes63lj9SrAlRecGe0bVSiP0c(final MediaDataController mediaDataController, final String str, final TLObject tLObject, TLRPC.TL_error tL_error) {
        mediaDataController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.m578$r8$lambda$E_nue3dMKlYvWbyf9yjhYDEAq8(this.f$0, str, tLObject);
            }
        });
    }

    public static void m578$r8$lambda$E_nue3dMKlYvWbyf9yjhYDEAq8(MediaDataController mediaDataController, String str, TLObject tLObject) {
        ArrayList<Utilities.Callback2<Boolean, TLRPC.TL_messages_stickerSet>> arrayList = mediaDataController.loadingStickerSets.get(str);
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (tLObject != null) {
                    arrayList.get(i).run(Boolean.TRUE, (TLRPC.TL_messages_stickerSet) tLObject);
                } else {
                    arrayList.get(i).run(Boolean.FALSE, null);
                }
            }
        }
        mediaDataController.loadingStickerSets.remove(str);
    }

    private void loadGroupStickerSet(final TLRPC.StickerSet stickerSet, boolean z) {
        if (z) {
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.m615$r8$lambda$iLnWsAGk7KAJG0f9MrI574iT_4(this.f$0, stickerSet);
                }
            });
            return;
        }
        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_messages_getStickerSet.stickerset = tL_inputStickerSetID;
        tL_inputStickerSetID.id = stickerSet.id;
        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                MediaDataController.$r8$lambda$p4Co4SVZcEDOo9WwILgxEmxCyrs(this.f$0, tLObject, tL_error);
            }
        });
    }

    public static void m615$r8$lambda$iLnWsAGk7KAJG0f9MrI574iT_4(final MediaDataController mediaDataController, TLRPC.StickerSet stickerSet) {
        final TLRPC.TL_messages_stickerSet tL_messages_stickerSetTLdeserialize;
        TLRPC.StickerSet stickerSet2;
        NativeByteBuffer nativeByteBufferByteBufferValue;
        mediaDataController.getClass();
        try {
            SQLiteCursor sQLiteCursorQueryFinalized = mediaDataController.getMessagesStorage().getDatabase().queryFinalized("SELECT document FROM web_recent_v3 WHERE id = 's_" + stickerSet.id + "'", new Object[0]);
            if (!sQLiteCursorQueryFinalized.next() || sQLiteCursorQueryFinalized.isNull(0) || (nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0)) == null) {
                tL_messages_stickerSetTLdeserialize = null;
            } else {
                tL_messages_stickerSetTLdeserialize = TLRPC.messages_StickerSet.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                nativeByteBufferByteBufferValue.reuse();
            }
            sQLiteCursorQueryFinalized.dispose();
            if (tL_messages_stickerSetTLdeserialize == null || (stickerSet2 = tL_messages_stickerSetTLdeserialize.set) == null || stickerSet2.hash != stickerSet.hash) {
                mediaDataController.loadGroupStickerSet(stickerSet, false);
            }
            if (tL_messages_stickerSetTLdeserialize == null || tL_messages_stickerSetTLdeserialize.set == null) {
                return;
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.$r8$lambda$Uwu_02j2fWnEMLQIgiI9bteJVBg(this.f$0, tL_messages_stickerSetTLdeserialize);
                }
            });
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public static void $r8$lambda$Uwu_02j2fWnEMLQIgiI9bteJVBg(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        mediaDataController.groupStickerSets.put(tL_messages_stickerSet.set.id, tL_messages_stickerSet);
        mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.groupStickersDidLoad, Long.valueOf(tL_messages_stickerSet.set.id), tL_messages_stickerSet);
    }

    public static void $r8$lambda$p4Co4SVZcEDOo9WwILgxEmxCyrs(final MediaDataController mediaDataController, TLObject tLObject, TLRPC.TL_error tL_error) {
        mediaDataController.getClass();
        if (tLObject != null) {
            final TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.$r8$lambda$vX8ccrogLZhoHwvco9UoJS907BE(this.f$0, tL_messages_stickerSet);
                }
            });
        }
    }

    public static void $r8$lambda$vX8ccrogLZhoHwvco9UoJS907BE(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        mediaDataController.groupStickerSets.put(tL_messages_stickerSet.set.id, tL_messages_stickerSet);
        mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.groupStickersDidLoad, Long.valueOf(tL_messages_stickerSet.set.id), tL_messages_stickerSet);
    }

    private void putSetToCache(final TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$8P48ErZZQtmq0EcPGe1fUtoCkwA(this.f$0, tL_messages_stickerSet);
            }
        });
    }

    public static void $r8$lambda$8P48ErZZQtmq0EcPGe1fUtoCkwA(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        mediaDataController.getClass();
        try {
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = mediaDataController.getMessagesStorage().getDatabase().executeFast("REPLACE INTO web_recent_v3 VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
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

    public HashMap<String, ArrayList<TLRPC.Document>> getAllStickers() {
        return this.allStickers;
    }

    public HashMap<String, ArrayList<TLRPC.Document>> getAllStickersFeatured() {
        return this.allStickersFeatured;
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

    public boolean canAddStickerToFavorites() {
        return (this.stickersLoaded[0] && this.stickerSets[0].size() < 5 && this.recentStickers[2].isEmpty()) ? false : true;
    }

    public ArrayList<TLRPC.TL_messages_stickerSet> getStickerSets(int i) {
        if (i == 3) {
            return this.stickerSets[2];
        }
        return this.stickerSets[i];
    }

    public LongSparseArray getStickerByIds(int i) {
        return this.stickersByIds[i];
    }

    public ArrayList<TLRPC.StickerSetCovered> getFeaturedStickerSets() {
        return this.featuredStickerSets[0];
    }

    public ArrayList<TLRPC.StickerSetCovered> getFeaturedEmojiSets() {
        return this.featuredStickerSets[1];
    }

    public ArrayList<Long> getUnreadStickerSets() {
        return this.unreadStickerSets[0];
    }

    public ArrayList<Long> getUnreadEmojiSets() {
        return this.unreadStickerSets[1];
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

    public boolean isStickerPackInstalled(long j) {
        return isStickerPackInstalled(j, true);
    }

    public boolean isStickerPackInstalled(long j, boolean z) {
        if (this.installedStickerSetsById.indexOfKey(j) >= 0 || (z && this.installedForceStickerSetsById.contains(Long.valueOf(j)))) {
            return (z && this.uninstalledForceStickerSetsById.contains(Long.valueOf(j))) ? false : true;
        }
        return false;
    }

    public boolean isStickerPackUnread(boolean z, long j) {
        return this.unreadStickerSets[z ? 1 : 0].contains(Long.valueOf(j));
    }

    public boolean isStickerPackInstalled(String str) {
        return this.stickerSetsByName.containsKey(str);
    }

    public String getEmojiForSticker(long j) {
        String str = (String) this.stickersByEmoji.get(j);
        return str != null ? str : "";
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

    public static long calcDocumentsHash(ArrayList<TLRPC.Document> arrayList) {
        return calcDocumentsHash(arrayList, 200);
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

    public void loadRecents(final int i, final boolean z, boolean z2, boolean z3) {
        TLRPC.TL_messages_getStickers tL_messages_getStickers;
        TLObject tLObject;
        long j;
        if (z) {
            if (this.loadingRecentGifs) {
                return;
            }
            this.loadingRecentGifs = true;
            if (this.recentGifsLoaded) {
                z2 = false;
            }
        } else {
            boolean[] zArr = this.loadingRecentStickers;
            if (zArr[i]) {
                return;
            }
            zArr[i] = true;
            if (this.recentStickersLoaded[i]) {
                z2 = false;
            }
        }
        if (z2) {
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.$r8$lambda$_VcLq0HG3WscJ1SwosfVAafpWME(this.f$0, z, i);
                }
            });
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
            } else if (i == 7) {
                j = emojiSettings.getLong("lastStickersLoadTimePremiumStickers", 0L);
            } else {
                j = emojiSettings.getLong("lastStickersLoadTimeFavs", 0L);
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
            getConnectionsManager().sendRequest(tL_messages_getSavedGifs, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                    MediaDataController.$r8$lambda$SyAcZrORF8VsKzyE700Gs9FYowE(this.f$0, i, tLObject2, tL_error);
                }
            });
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
        getConnectionsManager().sendRequest(tLObject, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                MediaDataController.m593$r8$lambda$R8GSHJElnzfvX8RaIYsiVxHSQA(this.f$0, i, tLObject2, tL_error);
            }
        });
    }

    public static void $r8$lambda$_VcLq0HG3WscJ1SwosfVAafpWME(final MediaDataController mediaDataController, final boolean z, final int i) {
        int i2;
        NativeByteBuffer nativeByteBufferByteBufferValue;
        mediaDataController.getClass();
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
            SQLiteCursor sQLiteCursorQueryFinalized = mediaDataController.getMessagesStorage().getDatabase().queryFinalized("SELECT document FROM web_recent_v3 WHERE type = " + i2 + " ORDER BY date DESC", new Object[0]);
            final ArrayList arrayList = new ArrayList();
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
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.m587$r8$lambda$MC8VOGK66QpjByXZXVTVyuSWFw(this.f$0, z, arrayList, i);
                }
            });
        } catch (Throwable th) {
            mediaDataController.getMessagesStorage().checkSQLException(th);
        }
    }

    public static void m587$r8$lambda$MC8VOGK66QpjByXZXVTVyuSWFw(MediaDataController mediaDataController, boolean z, ArrayList arrayList, int i) {
        if (z) {
            mediaDataController.recentGifs = arrayList;
            mediaDataController.loadingRecentGifs = false;
            mediaDataController.recentGifsLoaded = true;
        } else {
            mediaDataController.recentStickers[i] = arrayList;
            mediaDataController.loadingRecentStickers[i] = false;
            mediaDataController.recentStickersLoaded[i] = true;
        }
        if (i == 3) {
            mediaDataController.preloadNextGreetingsSticker();
        }
        mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.recentDocumentsDidLoad, Boolean.valueOf(z), Integer.valueOf(i));
        mediaDataController.loadRecents(i, z, false, false);
    }

    public static void $r8$lambda$SyAcZrORF8VsKzyE700Gs9FYowE(MediaDataController mediaDataController, int i, TLObject tLObject, TLRPC.TL_error tL_error) {
        mediaDataController.getClass();
        mediaDataController.processLoadedRecentDocuments(i, tLObject instanceof TLRPC.TL_messages_savedGifs ? ((TLRPC.TL_messages_savedGifs) tLObject).gifs : null, true, 0, true);
    }

    public static void m593$r8$lambda$R8GSHJElnzfvX8RaIYsiVxHSQA(MediaDataController mediaDataController, int i, TLObject tLObject, TLRPC.TL_error tL_error) {
        ArrayList<TLRPC.Document> arrayList;
        mediaDataController.getClass();
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
        mediaDataController.processLoadedRecentDocuments(i, arrayList, false, 0, true);
    }

    private void preloadNextGreetingsSticker() {
        if (this.recentStickers[3].isEmpty()) {
            return;
        }
        ArrayList<TLRPC.Document> arrayList = this.recentStickers[3];
        this.greetingsSticker = arrayList.get(Utilities.random.nextInt(arrayList.size()));
        getFileLoader().loadFile(ImageLocation.getForDocument(this.greetingsSticker), this.greetingsSticker, null, 0, 1);
    }

    public TLRPC.Document getGreetingsSticker() {
        TLRPC.Document document = this.greetingsSticker;
        preloadNextGreetingsSticker();
        return document;
    }

    protected void processLoadedRecentDocuments(int i, ArrayList<TLRPC.Document> arrayList, boolean z, int i2, final boolean z2) {
        final int i3;
        final ArrayList<TLRPC.Document> arrayList2;
        final boolean z3;
        final int i4;
        if (arrayList != null) {
            i3 = i;
            arrayList2 = arrayList;
            z3 = z;
            i4 = i2;
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.$r8$lambda$_5YNEv6F7sO245IdH_1t5sf3oaw(this.f$0, z3, i3, arrayList2, z2, i4);
                }
            });
        } else {
            i3 = i;
            arrayList2 = arrayList;
            z3 = z;
            i4 = i2;
        }
        if (i4 == 0) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.$r8$lambda$CK5Xh5noGRTkSU18xeuglL9UtBQ(this.f$0, z3, i3, arrayList2);
                }
            });
        }
    }

    public static void $r8$lambda$_5YNEv6F7sO245IdH_1t5sf3oaw(MediaDataController mediaDataController, boolean z, int i, ArrayList arrayList, boolean z2, int i2) {
        int i3;
        int i4;
        mediaDataController.getClass();
        try {
            SQLiteDatabase database = mediaDataController.getMessagesStorage().getDatabase();
            int i5 = 2;
            int i6 = 3;
            if (z) {
                i3 = mediaDataController.getMessagesController().maxRecentGifsCount;
            } else if (i == 3 || i == 7) {
                i3 = 200;
            } else {
                i3 = i == 2 ? mediaDataController.getMessagesController().maxFaveStickersCount : mediaDataController.getMessagesController().maxRecentStickersCount;
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
            int i7 = 0;
            while (i7 < size && i7 != i3) {
                TLRPC.Document document = (TLRPC.Document) arrayList.get(i7);
                sQLitePreparedStatementExecuteFast.requery();
                StringBuilder sb = new StringBuilder();
                sb.append("");
                int i8 = i7;
                sb.append(document.id);
                sQLitePreparedStatementExecuteFast.bindString(1, sb.toString());
                sQLitePreparedStatementExecuteFast.bindInteger(i5, i4);
                sQLitePreparedStatementExecuteFast.bindString(i6, "");
                sQLitePreparedStatementExecuteFast.bindString(4, "");
                sQLitePreparedStatementExecuteFast.bindString(5, "");
                sQLitePreparedStatementExecuteFast.bindInteger(6, 0);
                sQLitePreparedStatementExecuteFast.bindInteger(7, 0);
                sQLitePreparedStatementExecuteFast.bindInteger(8, 0);
                sQLitePreparedStatementExecuteFast.bindInteger(9, i2 != 0 ? i2 : size - i8);
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(document.getObjectSize());
                document.serializeToStream(nativeByteBuffer);
                sQLitePreparedStatementExecuteFast.bindByteBuffer(10, nativeByteBuffer);
                sQLitePreparedStatementExecuteFast.step();
                nativeByteBuffer.reuse();
                i7 = i8 + 1;
                i5 = 2;
                i6 = 3;
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

    public static void $r8$lambda$CK5Xh5noGRTkSU18xeuglL9UtBQ(MediaDataController mediaDataController, boolean z, int i, ArrayList arrayList) {
        SharedPreferences.Editor editorEdit = MessagesController.getEmojiSettings(mediaDataController.currentAccount).edit();
        if (z) {
            mediaDataController.loadingRecentGifs = false;
            mediaDataController.recentGifsLoaded = true;
            editorEdit.putLong("lastGifLoadTime", System.currentTimeMillis()).apply();
        } else {
            mediaDataController.loadingRecentStickers[i] = false;
            mediaDataController.recentStickersLoaded[i] = true;
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
                mediaDataController.recentGifs = arrayList;
            } else {
                mediaDataController.recentStickers[i] = arrayList;
            }
            if (i == 3) {
                mediaDataController.preloadNextGreetingsSticker();
            }
            mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.recentDocumentsDidLoad, Boolean.valueOf(z), Integer.valueOf(i));
        }
    }

    public void reorderStickers(int i, final ArrayList<Long> arrayList, boolean z) {
        Collections.sort(this.stickerSets[i], new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return MediaDataController.$r8$lambda$E6VrVowNXA9v_0EmWFlxRXOMQJE(arrayList, (TLRPC.TL_messages_stickerSet) obj, (TLRPC.TL_messages_stickerSet) obj2);
            }
        });
        this.loadHash[i] = calcStickersHash(this.stickerSets[i]);
        getNotificationCenter().postNotificationName(NotificationCenter.stickersDidLoad, Integer.valueOf(i), Boolean.valueOf(z));
    }

    public static int $r8$lambda$E6VrVowNXA9v_0EmWFlxRXOMQJE(ArrayList arrayList, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, TLRPC.TL_messages_stickerSet tL_messages_stickerSet2) {
        int iIndexOf = arrayList.indexOf(Long.valueOf(tL_messages_stickerSet.set.id));
        int iIndexOf2 = arrayList.indexOf(Long.valueOf(tL_messages_stickerSet2.set.id));
        if (iIndexOf > iIndexOf2) {
            return 1;
        }
        return iIndexOf < iIndexOf2 ? -1 : 0;
    }

    public void calcNewHash(int i) {
        this.loadHash[i] = calcStickersHash(this.stickerSets[i]);
    }

    public void storeTempStickerSet(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.StickerSet stickerSet;
        if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null) {
            return;
        }
        this.stickerSetsById.put(stickerSet.id, tL_messages_stickerSet);
        String str = tL_messages_stickerSet.set.short_name;
        if (str != null) {
            this.stickerSetsByName.put(str.toLowerCase(), tL_messages_stickerSet);
        }
    }

    public void addNewStickerSet(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i;
        if (this.stickerSetsById.indexOfKey(tL_messages_stickerSet.set.id) >= 0 || this.stickerSetsByName.containsKey(tL_messages_stickerSet.set.short_name)) {
            return;
        }
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        if (stickerSet.masks) {
            i = 1;
        } else {
            i = stickerSet.emojis ? 5 : 0;
        }
        this.stickerSets[i].add(0, tL_messages_stickerSet);
        this.stickerSetsById.put(tL_messages_stickerSet.set.id, tL_messages_stickerSet);
        this.installedStickerSetsById.put(tL_messages_stickerSet.set.id, tL_messages_stickerSet);
        this.stickerSetsByName.put(tL_messages_stickerSet.set.short_name, tL_messages_stickerSet);
        LongSparseArray longSparseArray = new LongSparseArray();
        for (int i2 = 0; i2 < tL_messages_stickerSet.documents.size(); i2++) {
            TLRPC.Document document = tL_messages_stickerSet.documents.get(i2);
            longSparseArray.put(document.id, document);
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
                    this.stickersByEmoji.put(l.longValue(), tL_stickerPack.emoticon);
                }
                TLRPC.Document document2 = (TLRPC.Document) longSparseArray.get(l.longValue());
                if (document2 != null) {
                    arrayList.add(document2);
                }
            }
        }
        this.loadHash[i] = calcStickersHash(this.stickerSets[i]);
        getNotificationCenter().postNotificationName(NotificationCenter.stickersDidLoad, Integer.valueOf(i), Boolean.TRUE);
        loadStickers(i, false, true);
    }

    public void loadFeaturedStickers(final boolean z, boolean z2) {
        final long j;
        TLObject tLObject;
        boolean[] zArr = this.loadingFeaturedStickers;
        if (zArr[z ? 1 : 0]) {
            return;
        }
        zArr[z ? 1 : 0] = true;
        if (z2) {
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.$r8$lambda$mnRNUcPPiBaPksrOk1oRolDaU4g(this.f$0, z);
                }
            });
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
        getConnectionsManager().sendRequest(tLObject, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                MediaDataController.$r8$lambda$LKsjdNGmjT1O7Unyu811kxp7sD8(this.f$0, z, j, tLObject2, tL_error);
            }
        });
    }

    public static void $r8$lambda$mnRNUcPPiBaPksrOk1oRolDaU4g(MediaDataController mediaDataController, boolean z) {
        SQLiteCursor sQLiteCursorQueryFinalized;
        boolean z2;
        long j;
        boolean z3;
        int i;
        int iIntValue;
        mediaDataController.getClass();
        ArrayList<Long> arrayList = new ArrayList<>();
        ArrayList<TLRPC.StickerSetCovered> arrayList2 = null;
        int i2 = 0;
        long jLongValue = 0;
        try {
            SQLiteDatabase database = mediaDataController.getMessagesStorage().getDatabase();
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT data, unread, date, hash, premium FROM stickers_featured WHERE emoji = ");
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
                                    j = jLongValue;
                                    z3 = z2;
                                    i = i2;
                                } else {
                                    i = iIntValue;
                                    j = jLongValue;
                                    z3 = false;
                                }
                                mediaDataController.processLoadedFeaturedStickers(z, arrayList2, arrayList, z3, true, i, j);
                            } catch (Throwable th2) {
                                if (sQLiteCursorQueryFinalized != null) {
                                    sQLiteCursorQueryFinalized.dispose();
                                    throw th2;
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
                        mediaDataController.processLoadedFeaturedStickers(z, arrayList2, arrayList, z3, true, i, j);
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
        j = jLongValue;
        z3 = z2;
        i = i2;
        mediaDataController.processLoadedFeaturedStickers(z, arrayList2, arrayList, z3, true, i, j);
    }

    public static void $r8$lambda$LKsjdNGmjT1O7Unyu811kxp7sD8(final MediaDataController mediaDataController, final boolean z, final long j, final TLObject tLObject, TLRPC.TL_error tL_error) {
        mediaDataController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$Q0UFh_2ynP9TjDLFyujacO163wc(this.f$0, tLObject, z, j);
            }
        });
    }

    public static void $r8$lambda$Q0UFh_2ynP9TjDLFyujacO163wc(final MediaDataController mediaDataController, TLObject tLObject, final boolean z, long j) {
        mediaDataController.getClass();
        if (tLObject instanceof TLRPC.TL_messages_featuredStickers) {
            TLRPC.TL_messages_featuredStickers tL_messages_featuredStickers = (TLRPC.TL_messages_featuredStickers) tLObject;
            mediaDataController.processLoadedFeaturedStickers(z, tL_messages_featuredStickers.sets, tL_messages_featuredStickers.unread, tL_messages_featuredStickers.premium, false, (int) (System.currentTimeMillis() / 1000), tL_messages_featuredStickers.hash);
        } else {
            if (tLObject instanceof TLRPC.TL_messages_featuredStickersNotModified) {
                final int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MediaDataController.$r8$lambda$djdKug19j8mt8Hk2tttHWGx_oHI(this.f$0, z, iCurrentTimeMillis);
                    }
                });
                mediaDataController.putFeaturedStickersToCache(z, null, null, iCurrentTimeMillis, j, false);
                return;
            }
            mediaDataController.processLoadedFeaturedStickers(z, null, null, false, false, (int) (System.currentTimeMillis() / 1000), j);
        }
    }

    public static void $r8$lambda$djdKug19j8mt8Hk2tttHWGx_oHI(MediaDataController mediaDataController, boolean z, int i) {
        mediaDataController.loadingFeaturedStickers[z ? 1 : 0] = false;
        mediaDataController.featuredStickersLoaded[z ? 1 : 0] = true;
        mediaDataController.loadFeaturedDate[z ? 1 : 0] = i;
    }

    private void processLoadedFeaturedStickers(final boolean z, final ArrayList<TLRPC.StickerSetCovered> arrayList, final ArrayList<Long> arrayList2, final boolean z2, final boolean z3, final int i, final long j) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$ZYRUDabYuF0dv2QSBTmiVNZwmYA(this.f$0, z);
            }
        });
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$vCfqEZ3sTBTU5ZR5oMrexbi9weQ(this.f$0, z3, arrayList, i, j, z, arrayList2, z2);
            }
        });
    }

    public static void $r8$lambda$ZYRUDabYuF0dv2QSBTmiVNZwmYA(MediaDataController mediaDataController, boolean z) {
        mediaDataController.loadingFeaturedStickers[z ? 1 : 0] = false;
        mediaDataController.featuredStickersLoaded[z ? 1 : 0] = true;
    }

    public static void $r8$lambda$vCfqEZ3sTBTU5ZR5oMrexbi9weQ(final MediaDataController mediaDataController, boolean z, final ArrayList arrayList, final int i, final long j, final boolean z2, final ArrayList arrayList2, final boolean z3) {
        ArrayList<TLRPC.StickerSetCovered> arrayList3;
        mediaDataController.getClass();
        long j2 = 0;
        if ((z && (arrayList == null || Math.abs((System.currentTimeMillis() / 1000) - ((long) i)) >= 3600)) || (!z && arrayList == null && j == 0)) {
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.$r8$lambda$m9tX2mSWmhY0RIlktDuejqRo6CU(this.f$0, arrayList, j, z2);
                }
            };
            if (arrayList == null && !z) {
                j2 = 1000;
            }
            AndroidUtilities.runOnUIThread(runnable, j2);
            if (arrayList == null) {
                return;
            }
        }
        if (arrayList != null) {
            try {
                ArrayList<TLRPC.StickerSetCovered> arrayList4 = new ArrayList<>();
                final LongSparseArray longSparseArray = new LongSparseArray();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i2);
                    arrayList4.add(stickerSetCovered);
                    longSparseArray.put(stickerSetCovered.set.id, stickerSetCovered);
                }
                if (z) {
                    arrayList3 = arrayList4;
                } else {
                    arrayList3 = arrayList4;
                    mediaDataController.putFeaturedStickersToCache(z2, arrayList3, arrayList2, i, j, z3);
                }
                final ArrayList<TLRPC.StickerSetCovered> arrayList5 = arrayList3;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MediaDataController.$r8$lambda$Eu5XhbfElxRxMmH4INOGpAy97z0(this.f$0, z2, arrayList2, longSparseArray, arrayList5, j, i, z3);
                    }
                });
                return;
            } catch (Throwable th) {
                FileLog.e(th);
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$7R8d6b99QyZrK5EQv8E6uL4VwwY(this.f$0, z2, i);
            }
        });
        mediaDataController.putFeaturedStickersToCache(z2, null, null, i, 0L, z3);
    }

    public static void $r8$lambda$m9tX2mSWmhY0RIlktDuejqRo6CU(MediaDataController mediaDataController, ArrayList arrayList, long j, boolean z) {
        mediaDataController.getClass();
        if (arrayList != null && j != 0) {
            mediaDataController.loadFeaturedHash[z ? 1 : 0] = j;
        }
        mediaDataController.loadingFeaturedStickers[z ? 1 : 0] = false;
        mediaDataController.loadFeaturedStickers(z, false);
    }

    public static void $r8$lambda$Eu5XhbfElxRxMmH4INOGpAy97z0(MediaDataController mediaDataController, boolean z, ArrayList arrayList, LongSparseArray longSparseArray, ArrayList arrayList2, long j, int i, boolean z2) {
        mediaDataController.unreadStickerSets[z ? 1 : 0] = arrayList;
        mediaDataController.featuredStickerSetsById[z ? 1 : 0] = longSparseArray;
        mediaDataController.featuredStickerSets[z ? 1 : 0] = arrayList2;
        mediaDataController.loadFeaturedHash[z ? 1 : 0] = j;
        mediaDataController.loadFeaturedDate[z ? 1 : 0] = i;
        mediaDataController.loadFeaturedPremium = z2;
        mediaDataController.loadStickers(z ? 6 : 3, true, false);
        mediaDataController.getNotificationCenter().postNotificationName(z ? NotificationCenter.featuredEmojiDidLoad : NotificationCenter.featuredStickersDidLoad, new Object[0]);
    }

    public static void $r8$lambda$7R8d6b99QyZrK5EQv8E6uL4VwwY(MediaDataController mediaDataController, boolean z, int i) {
        mediaDataController.loadFeaturedDate[z ? 1 : 0] = i;
    }

    private void putFeaturedStickersToCache(final boolean z, ArrayList<TLRPC.StickerSetCovered> arrayList, final ArrayList<Long> arrayList2, final int i, final long j, final boolean z2) {
        final ArrayList arrayList3 = arrayList != null ? new ArrayList(arrayList) : null;
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.m564$r8$lambda$4zGW6Og2KEDla_U2RCA2cK4h4(this.f$0, arrayList3, arrayList2, z, i, j, z2);
            }
        });
    }

    public static void m564$r8$lambda$4zGW6Og2KEDla_U2RCA2cK4h4(MediaDataController mediaDataController, ArrayList arrayList, ArrayList arrayList2, boolean z, int i, long j, boolean z2) {
        mediaDataController.getClass();
        try {
            if (arrayList != null) {
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast = mediaDataController.getMessagesStorage().getDatabase().executeFast("REPLACE INTO stickers_featured VALUES(?, ?, ?, ?, ?, ?, ?)");
                sQLitePreparedStatementExecuteFast.requery();
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
                sQLitePreparedStatementExecuteFast.bindInteger(1, z ? 2 : 1);
                sQLitePreparedStatementExecuteFast.bindByteBuffer(2, nativeByteBuffer);
                sQLitePreparedStatementExecuteFast.bindByteBuffer(3, nativeByteBuffer2);
                sQLitePreparedStatementExecuteFast.bindInteger(4, i);
                sQLitePreparedStatementExecuteFast.bindLong(5, j);
                sQLitePreparedStatementExecuteFast.bindInteger(6, z2 ? 1 : 0);
                sQLitePreparedStatementExecuteFast.bindInteger(7, z ? 1 : 0);
                sQLitePreparedStatementExecuteFast.step();
                nativeByteBuffer.reuse();
                nativeByteBuffer2.reuse();
                sQLitePreparedStatementExecuteFast.dispose();
                return;
            }
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast2 = mediaDataController.getMessagesStorage().getDatabase().executeFast("UPDATE stickers_featured SET date = ? WHERE id = ? AND emoji = ?");
            sQLitePreparedStatementExecuteFast2.requery();
            sQLitePreparedStatementExecuteFast2.bindInteger(1, i);
            sQLitePreparedStatementExecuteFast2.bindInteger(2, z ? 2 : 1);
            sQLitePreparedStatementExecuteFast2.bindInteger(3, z ? 1 : 0);
            sQLitePreparedStatementExecuteFast2.step();
            sQLitePreparedStatementExecuteFast2.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
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

    public void markFeaturedStickersAsRead(boolean z, boolean z2) {
        if (this.unreadStickerSets[z ? 1 : 0].isEmpty()) {
            return;
        }
        this.unreadStickerSets[z ? 1 : 0].clear();
        this.loadFeaturedHash[z ? 1 : 0] = calcFeaturedStickersHash(z, this.featuredStickerSets[z ? 1 : 0]);
        getNotificationCenter().postNotificationName(z ? NotificationCenter.featuredEmojiDidLoad : NotificationCenter.featuredStickersDidLoad, new Object[0]);
        putFeaturedStickersToCache(z, this.featuredStickerSets[z ? 1 : 0], this.unreadStickerSets[z ? 1 : 0], this.loadFeaturedDate[z ? 1 : 0], this.loadFeaturedHash[z ? 1 : 0], this.loadFeaturedPremium);
        if (z2) {
            getConnectionsManager().sendRequest(new TLRPC.TL_messages_readFeaturedStickers(), new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    MediaDataController.$r8$lambda$e9B0UIr2GlJGkHd3WtNlPtc8X5U(tLObject, tL_error);
                }
            });
        }
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

    public void markFeaturedStickersByIdAsRead(final boolean z, final long j) {
        if (!this.unreadStickerSets[z ? 1 : 0].contains(Long.valueOf(j)) || this.readingStickerSets[z ? 1 : 0].contains(Long.valueOf(j))) {
            return;
        }
        this.readingStickerSets[z ? 1 : 0].add(Long.valueOf(j));
        TLRPC.TL_messages_readFeaturedStickers tL_messages_readFeaturedStickers = new TLRPC.TL_messages_readFeaturedStickers();
        tL_messages_readFeaturedStickers.id.add(Long.valueOf(j));
        getConnectionsManager().sendRequest(tL_messages_readFeaturedStickers, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                MediaDataController.$r8$lambda$fvxCpRRTXkRxVwD4KREoJsTXy0M(tLObject, tL_error);
            }
        });
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$_q4hLjPKVtdP3rIyNFlqNc6zzcI(this.f$0, z, j);
            }
        }, 1000L);
    }

    public static void $r8$lambda$_q4hLjPKVtdP3rIyNFlqNc6zzcI(MediaDataController mediaDataController, boolean z, long j) {
        mediaDataController.unreadStickerSets[z ? 1 : 0].remove(Long.valueOf(j));
        mediaDataController.readingStickerSets[z ? 1 : 0].remove(Long.valueOf(j));
        mediaDataController.loadFeaturedHash[z ? 1 : 0] = mediaDataController.calcFeaturedStickersHash(z, mediaDataController.featuredStickerSets[z ? 1 : 0]);
        mediaDataController.getNotificationCenter().postNotificationName(z ? NotificationCenter.featuredEmojiDidLoad : NotificationCenter.featuredStickersDidLoad, new Object[0]);
        mediaDataController.putFeaturedStickersToCache(z, mediaDataController.featuredStickerSets[z ? 1 : 0], mediaDataController.unreadStickerSets[z ? 1 : 0], mediaDataController.loadFeaturedDate[z ? 1 : 0], mediaDataController.loadFeaturedHash[z ? 1 : 0], mediaDataController.loadFeaturedPremium);
    }

    public int getArchivedStickersCount(int i) {
        return this.archivedStickersCount[i];
    }

    public void verifyAnimatedStickerMessage(TLRPC.Message message) {
        verifyAnimatedStickerMessage(message, false);
    }

    public void verifyAnimatedStickerMessage(final TLRPC.Message message, boolean z) {
        if (message == null) {
            return;
        }
        TLRPC.Document document = MessageObject.getDocument(message);
        final String stickerSetName = MessageObject.getStickerSetName(document);
        if (TextUtils.isEmpty(stickerSetName)) {
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.stickerSetsByName.get(stickerSetName);
        if (tL_messages_stickerSet == null) {
            if (z) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.verifyAnimatedStickerMessageInternal(message, stickerSetName);
                    }
                });
                return;
            } else {
                verifyAnimatedStickerMessageInternal(message, stickerSetName);
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

    public void verifyAnimatedStickerMessageInternal(TLRPC.Message message, final String str) {
        ArrayList<TLRPC.Message> arrayList = this.verifyingMessages.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.verifyingMessages.put(str, arrayList);
        }
        arrayList.add(message);
        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
        tL_messages_getStickerSet.stickerset = MessageObject.getInputStickerSet(message);
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                MediaDataController.$r8$lambda$lKCXEiiAq10Cp2DGcVr5jjiSQoc(this.f$0, str, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$lKCXEiiAq10Cp2DGcVr5jjiSQoc(final MediaDataController mediaDataController, final String str, final TLObject tLObject, TLRPC.TL_error tL_error) {
        mediaDataController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$Ih9jdnqQdAJZOYaJfbbMoNT2YYM(this.f$0, str, tLObject);
            }
        });
    }

    public static void $r8$lambda$Ih9jdnqQdAJZOYaJfbbMoNT2YYM(MediaDataController mediaDataController, String str, TLObject tLObject) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        ArrayList<TLRPC.Message> arrayList = mediaDataController.verifyingMessages.get(str);
        if (tLObject != null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject;
            mediaDataController.storeTempStickerSet(tL_messages_stickerSet2);
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
        } else {
            int size3 = arrayList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                arrayList.get(i3).stickerVerified = 2;
            }
        }
        mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.didVerifyMessagesStickers, arrayList);
        mediaDataController.getMessagesStorage().updateMessageVerifyFlags(arrayList);
    }

    public void loadArchivedStickersCount(final int i, boolean z) {
        if (z) {
            int i2 = MessagesController.getNotificationsSettings(this.currentAccount).getInt("archivedStickersCount" + i, -1);
            if (i2 == -1) {
                loadArchivedStickersCount(i, false);
                return;
            } else {
                this.archivedStickersCount[i] = i2;
                getNotificationCenter().postNotificationName(NotificationCenter.archivedStickersCountDidLoad, Integer.valueOf(i));
                return;
            }
        }
        TLRPC.TL_messages_getArchivedStickers tL_messages_getArchivedStickers = new TLRPC.TL_messages_getArchivedStickers();
        tL_messages_getArchivedStickers.limit = 0;
        tL_messages_getArchivedStickers.masks = i == 1;
        tL_messages_getArchivedStickers.emojis = i == 5;
        getConnectionsManager().sendRequest(tL_messages_getArchivedStickers, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                MediaDataController.m629$r8$lambda$uUY9MPJjdjolBZeRAiOuu7L3CQ(this.f$0, i, tLObject, tL_error);
            }
        });
    }

    public static void m629$r8$lambda$uUY9MPJjdjolBZeRAiOuu7L3CQ(final MediaDataController mediaDataController, final int i, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        mediaDataController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$BVwxqN7eiuQi3nGwxYT8SNEOU3U(this.f$0, tL_error, tLObject, i);
            }
        });
    }

    public static void $r8$lambda$BVwxqN7eiuQi3nGwxYT8SNEOU3U(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, int i) {
        mediaDataController.getClass();
        if (tL_error == null) {
            TLRPC.TL_messages_archivedStickers tL_messages_archivedStickers = (TLRPC.TL_messages_archivedStickers) tLObject;
            mediaDataController.archivedStickersCount[i] = tL_messages_archivedStickers.count;
            MessagesController.getNotificationsSettings(mediaDataController.currentAccount).edit().putInt("archivedStickersCount" + i, tL_messages_archivedStickers.count).commit();
            mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.archivedStickersCountDidLoad, Integer.valueOf(i));
        }
    }

    private void processLoadStickersResponse(int i, TLRPC.TL_messages_allStickers tL_messages_allStickers) {
        processLoadStickersResponse(i, tL_messages_allStickers, null);
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
                    longSparseArray2.put(stickerSet2.id, tL_messages_stickerSet);
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
                            MediaDataController.m573$r8$lambda$C30gvemcW42lO9RhMVzIgG08Lg(this.f$0, arrayList, i2, longSparseArray, stickerSet, tL_messages_allStickers2, i5, tLObject, tL_error);
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
                        MediaDataController.m573$r8$lambda$C30gvemcW42lO9RhMVzIgG08Lg(this.f$0, arrayList, i2, longSparseArray, stickerSet, tL_messages_allStickers2, i6, tLObject, tL_error);
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

    public static void m573$r8$lambda$C30gvemcW42lO9RhMVzIgG08Lg(final MediaDataController mediaDataController, final ArrayList arrayList, final int i, final LongSparseArray longSparseArray, final TLRPC.StickerSet stickerSet, final TLRPC.TL_messages_allStickers tL_messages_allStickers, final int i2, final TLObject tLObject, TLRPC.TL_error tL_error) {
        mediaDataController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$23xHNULW1h39zI0JUsx2CRAAdbs(this.f$0, tLObject, arrayList, i, longSparseArray, stickerSet, tL_messages_allStickers, i2);
            }
        });
    }

    public static void $r8$lambda$23xHNULW1h39zI0JUsx2CRAAdbs(MediaDataController mediaDataController, TLObject tLObject, ArrayList arrayList, int i, LongSparseArray longSparseArray, TLRPC.StickerSet stickerSet, TLRPC.TL_messages_allStickers tL_messages_allStickers, int i2) {
        mediaDataController.getClass();
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
        arrayList.set(i, tL_messages_stickerSet);
        longSparseArray.put(stickerSet.id, tL_messages_stickerSet);
        if (longSparseArray.size() == tL_messages_allStickers.sets.size()) {
            int i3 = 0;
            while (i3 < arrayList.size()) {
                if (arrayList.get(i3) == null) {
                    arrayList.remove(i3);
                    i3--;
                }
                i3++;
            }
            mediaDataController.processLoadedStickers(i2, arrayList, false, (int) (System.currentTimeMillis() / 1000), tL_messages_allStickers.hash2);
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
        if (this.loadingPremiumGiftStickers || System.currentTimeMillis() - getUserConfig().lastUpdatedPremiumGiftsStickerPack < 86400000) {
            return;
        }
        this.loadingPremiumGiftStickers = true;
        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
        tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetPremiumGifts();
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                MediaDataController.$r8$lambda$gIAXw70TSf2F9Rqb1jYbnqbDqXI(this.f$0, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$gIAXw70TSf2F9Rqb1jYbnqbDqXI(final MediaDataController mediaDataController, final TLObject tLObject, TLRPC.TL_error tL_error) {
        mediaDataController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$3hW3GVQWiMZ6ETGA7LKqxRVg_U0(this.f$0, tLObject);
            }
        });
    }

    public static void $r8$lambda$3hW3GVQWiMZ6ETGA7LKqxRVg_U0(MediaDataController mediaDataController, TLObject tLObject) {
        mediaDataController.getClass();
        if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            mediaDataController.getUserConfig().premiumGiftsStickerPack = tL_messages_stickerSet.set.short_name;
            mediaDataController.getUserConfig().lastUpdatedPremiumGiftsStickerPack = System.currentTimeMillis();
            mediaDataController.getUserConfig().saveConfig(false);
            mediaDataController.processLoadedDiceStickers(mediaDataController.getUserConfig().premiumGiftsStickerPack, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
            mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.didUpdatePremiumGiftStickers, new Object[0]);
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
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                MediaDataController.$r8$lambda$DVezfPLxvpBphrqZvRB_wbRKLqU(this.f$0, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$DVezfPLxvpBphrqZvRB_wbRKLqU(final MediaDataController mediaDataController, final TLObject tLObject, TLRPC.TL_error tL_error) {
        mediaDataController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$PX5wCxsdg3kfLndS5vljT_6nT70(this.f$0, tLObject);
            }
        });
    }

    public static void $r8$lambda$PX5wCxsdg3kfLndS5vljT_6nT70(MediaDataController mediaDataController, TLObject tLObject) {
        mediaDataController.getClass();
        if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            mediaDataController.getUserConfig().premiumTonStickerPack = tL_messages_stickerSet.set.short_name;
            mediaDataController.getUserConfig().lastUpdatedTonGiftsStickerPack = System.currentTimeMillis();
            mediaDataController.getUserConfig().saveConfig(false);
            mediaDataController.processLoadedDiceStickers(mediaDataController.getUserConfig().premiumTonStickerPack, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
            mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.didUpdateTonGiftStickers, new Object[0]);
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
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                MediaDataController.$r8$lambda$qyftrwO59ikB7uwIzRSeEtfKp18(this.f$0, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$qyftrwO59ikB7uwIzRSeEtfKp18(final MediaDataController mediaDataController, final TLObject tLObject, TLRPC.TL_error tL_error) {
        mediaDataController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$gwAYPHQXEYrRvUYBEtiMU83TXc0(this.f$0, tLObject);
            }
        });
    }

    public static void $r8$lambda$gwAYPHQXEYrRvUYBEtiMU83TXc0(MediaDataController mediaDataController, TLObject tLObject) {
        mediaDataController.getClass();
        if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            mediaDataController.getUserConfig().genericAnimationsStickerPack = tL_messages_stickerSet.set.short_name;
            mediaDataController.getUserConfig().lastUpdatedGenericAnimations = System.currentTimeMillis();
            mediaDataController.getUserConfig().saveConfig(false);
            mediaDataController.processLoadedDiceStickers(mediaDataController.getUserConfig().genericAnimationsStickerPack, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
            for (int i = 0; i < tL_messages_stickerSet.documents.size(); i++) {
                if (mediaDataController.currentAccount == UserConfig.selectedAccount) {
                    mediaDataController.preloadImage(ImageLocation.getForDocument(tL_messages_stickerSet.documents.get(i)), 0);
                }
            }
        }
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
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                MediaDataController.$r8$lambda$vhzUpWEfzViWFxNP2Ktu_vqDzk0(this.f$0, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$vhzUpWEfzViWFxNP2Ktu_vqDzk0(final MediaDataController mediaDataController, final TLObject tLObject, TLRPC.TL_error tL_error) {
        mediaDataController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$rN9i6cFEAyK4zbBj2eXem3hygiw(this.f$0, tLObject);
            }
        });
    }

    public static void $r8$lambda$rN9i6cFEAyK4zbBj2eXem3hygiw(MediaDataController mediaDataController, TLObject tLObject) {
        mediaDataController.getClass();
        if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            mediaDataController.getUserConfig().defaultTopicIcons = tL_messages_stickerSet.set.short_name;
            mediaDataController.getUserConfig().lastUpdatedDefaultTopicIcons = System.currentTimeMillis();
            mediaDataController.getUserConfig().saveConfig(false);
            mediaDataController.processLoadedDiceStickers(mediaDataController.getUserConfig().defaultTopicIcons, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
        }
    }

    public void loadStickersByEmojiOrName(final String str, final boolean z, boolean z2) {
        if (this.loadingDiceStickerSets.contains(str)) {
            return;
        }
        if (!z || this.diceStickerSetsByEmoji.get(str) == null) {
            this.loadingDiceStickerSets.add(str);
            if (z2) {
                getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        MediaDataController.$r8$lambda$vvSHUG7c70VKpHDR5CCohhlgPg8(this.f$0, str, z);
                    }
                });
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
            getConnectionsManager().sendRequest(tL_messages_getStickerSet, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    MediaDataController.m626$r8$lambda$tnqUpukxGwDBIUdUIUkrqcua8(this.f$0, str, z, tLObject, tL_error);
                }
            });
        }
    }

    public static void $r8$lambda$vvSHUG7c70VKpHDR5CCohhlgPg8(MediaDataController mediaDataController, String str, boolean z) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
        int i;
        SQLiteCursor sQLiteCursorQueryFinalized;
        int iIntValue = 0;
        mediaDataController.getClass();
        SQLiteCursor sQLiteCursor = null;
        tL_messages_stickerSetTLdeserialize = null;
        tL_messages_stickerSetTLdeserialize = null;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSetTLdeserialize = null;
        try {
            sQLiteCursorQueryFinalized = mediaDataController.getMessagesStorage().getDatabase().queryFinalized("SELECT data, date FROM stickers_dice WHERE emoji = ?", str);
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
                    mediaDataController.processLoadedDiceStickers(str, z, tL_messages_stickerSet2, true, i);
                } catch (Throwable th2) {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                        throw th2;
                    }
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
        mediaDataController.processLoadedDiceStickers(str, z, tL_messages_stickerSet2, true, i);
    }

    public static void m626$r8$lambda$tnqUpukxGwDBIUdUIUkrqcua8(final MediaDataController mediaDataController, final String str, final boolean z, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        mediaDataController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$dW5lH7ibt8nrmPjmQnUiGYvk3iQ(this.f$0, tL_error, tLObject, str, z);
            }
        });
    }

    public static void $r8$lambda$dW5lH7ibt8nrmPjmQnUiGYvk3iQ(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, String str, boolean z) {
        mediaDataController.getClass();
        if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
            mediaDataController.processLoadedDiceStickers(str, z, (TLRPC.TL_messages_stickerSet) tLObject, false, (int) (System.currentTimeMillis() / 1000));
        } else {
            mediaDataController.processLoadedDiceStickers(str, z, null, false, (int) (System.currentTimeMillis() / 1000));
        }
    }

    private void processLoadedDiceStickers(final String str, final boolean z, final TLRPC.TL_messages_stickerSet tL_messages_stickerSet, final boolean z2, final int i) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.loadingDiceStickerSets.remove(str);
            }
        });
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$LkCSQv04easJ4bi8PYISzJs5A1Y(this.f$0, z2, tL_messages_stickerSet, i, str, z);
            }
        });
    }

    public static void $r8$lambda$LkCSQv04easJ4bi8PYISzJs5A1Y(final MediaDataController mediaDataController, boolean z, final TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i, final String str, final boolean z2) {
        mediaDataController.getClass();
        if (z) {
            if (tL_messages_stickerSet == null || Math.abs((System.currentTimeMillis() / 1000) - ((long) i)) >= 86400) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.loadStickersByEmojiOrName(str, z2, false);
                    }
                }, (tL_messages_stickerSet != null || z) ? 0L : 1000L);
                if (tL_messages_stickerSet == null) {
                    return;
                }
            }
        }
        if (tL_messages_stickerSet != null) {
            if (!z) {
                mediaDataController.putDiceStickersToCache(str, tL_messages_stickerSet, i);
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.$r8$lambda$DjIFvXveacqS6uqFCZtVOSiFHeE(this.f$0, str, tL_messages_stickerSet);
                }
            });
        } else {
            if (z) {
                return;
            }
            mediaDataController.putDiceStickersToCache(str, null, i);
        }
    }

    public static void $r8$lambda$DjIFvXveacqS6uqFCZtVOSiFHeE(MediaDataController mediaDataController, String str, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        mediaDataController.diceStickerSetsByEmoji.put(str, tL_messages_stickerSet);
        mediaDataController.diceEmojiStickerSetsById.put(tL_messages_stickerSet.set.id, str);
        mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.diceStickersDidLoad, str);
    }

    private void putDiceStickersToCache(final String str, final TLRPC.TL_messages_stickerSet tL_messages_stickerSet, final int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$UsFVR96MiJq3E0zF4mUxRhMG5dI(this.f$0, tL_messages_stickerSet, str, i);
            }
        });
    }

    public static void $r8$lambda$UsFVR96MiJq3E0zF4mUxRhMG5dI(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, int i) {
        mediaDataController.getClass();
        try {
            if (tL_messages_stickerSet != null) {
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast = mediaDataController.getMessagesStorage().getDatabase().executeFast("REPLACE INTO stickers_dice VALUES(?, ?, ?)");
                sQLitePreparedStatementExecuteFast.requery();
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_messages_stickerSet.getObjectSize());
                tL_messages_stickerSet.serializeToStream(nativeByteBuffer);
                sQLitePreparedStatementExecuteFast.bindString(1, str);
                sQLitePreparedStatementExecuteFast.bindByteBuffer(2, nativeByteBuffer);
                sQLitePreparedStatementExecuteFast.bindInteger(3, i);
                sQLitePreparedStatementExecuteFast.step();
                nativeByteBuffer.reuse();
                sQLitePreparedStatementExecuteFast.dispose();
                return;
            }
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast2 = mediaDataController.getMessagesStorage().getDatabase().executeFast("UPDATE stickers_dice SET date = ?");
            sQLitePreparedStatementExecuteFast2.requery();
            sQLitePreparedStatementExecuteFast2.bindInteger(1, i);
            sQLitePreparedStatementExecuteFast2.step();
            sQLitePreparedStatementExecuteFast2.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
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

    public void loadStickers(int i, boolean z, boolean z2) {
        loadStickers(i, z, z2, false, null);
    }

    public void loadStickers(int i, boolean z, boolean z2, boolean z3) {
        loadStickers(i, z, z2, z3, null);
    }

    public void loadStickers(final int i, boolean z, final boolean z2, boolean z3, final Utilities.Callback<ArrayList<TLRPC.TL_messages_stickerSet>> callback) {
        long j;
        TLObject tLObject;
        if (this.loadingStickers[i]) {
            if (z3) {
                this.scheduledLoadStickers[i] = new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.loadStickers(i, false, z2, false, callback);
                    }
                };
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
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.$r8$lambda$ZbUC3DMEquxyKOEpBMSY4j7Eh8k(this.f$0, i, callback);
                }
            });
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
            processLoadStickersResponse(i, tL_messages_allStickers, new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.$r8$lambda$e6wyqBb0gJRl5mkotb85Lw1_znc(callback);
                }
            });
            return;
        }
        if (i == 4) {
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
            tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetAnimatedEmoji();
            getConnectionsManager().sendRequest(tL_messages_getStickerSet, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                    MediaDataController.$r8$lambda$j7N53FOZUCCIAX55zC8xMJEq6c8(this.f$0, i, callback, tLObject2, tL_error);
                }
            });
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
        final long j2 = j;
        getConnectionsManager().sendRequest(tLObject, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                MediaDataController.$r8$lambda$MPqUAglOclFOI6EAzC5MY0qZdr8(this.f$0, i, callback, j2, tLObject2, tL_error);
            }
        });
    }

    public static void $r8$lambda$ZbUC3DMEquxyKOEpBMSY4j7Eh8k(MediaDataController mediaDataController, int i, final Utilities.Callback callback) {
        mediaDataController.getClass();
        final ArrayList<TLRPC.TL_messages_stickerSet> arrayList = new ArrayList<>();
        int iIntValue = 0;
        long jCalcStickersHash = 0;
        SQLiteCursor sQLiteCursorQueryFinalized = null;
        try {
            sQLiteCursorQueryFinalized = mediaDataController.getMessagesStorage().getDatabase().queryFinalized("SELECT data, date, hash FROM stickers_v2 WHERE id = " + (i + 1), new Object[0]);
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
                mediaDataController.processLoadedStickers(i, arrayList, true, iIntValue, jCalcStickersHash, new Runnable() {
                    @Override
                    public final void run() {
                        MediaDataController.$r8$lambda$gxF0HKWSDmKbaULnY52NVx9yP_M(callback, arrayList);
                    }
                });
            } catch (Throwable th2) {
                if (sQLiteCursorQueryFinalized != null) {
                    sQLiteCursorQueryFinalized.dispose();
                    throw th2;
                }
                throw th2;
            }
        }
        sQLiteCursorQueryFinalized.dispose();
        mediaDataController.processLoadedStickers(i, arrayList, true, iIntValue, jCalcStickersHash, new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$gxF0HKWSDmKbaULnY52NVx9yP_M(callback, arrayList);
            }
        });
    }

    public static void $r8$lambda$gxF0HKWSDmKbaULnY52NVx9yP_M(Utilities.Callback callback, ArrayList arrayList) {
        if (callback != null) {
            callback.run(arrayList);
        }
    }

    public static void $r8$lambda$e6wyqBb0gJRl5mkotb85Lw1_znc(Utilities.Callback callback) {
        if (callback != null) {
            callback.run(null);
        }
    }

    public static void $r8$lambda$j7N53FOZUCCIAX55zC8xMJEq6c8(MediaDataController mediaDataController, int i, final Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        mediaDataController.getClass();
        if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
            ArrayList<TLRPC.TL_messages_stickerSet> arrayList = new ArrayList<>();
            arrayList.add((TLRPC.TL_messages_stickerSet) tLObject);
            mediaDataController.processLoadedStickers(i, arrayList, false, (int) (System.currentTimeMillis() / 1000), calcStickersHash(arrayList), new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.$r8$lambda$vntmLI7gZQwx7oyMWGW9A3lJaUE(callback);
                }
            });
            return;
        }
        mediaDataController.processLoadedStickers(i, null, false, (int) (System.currentTimeMillis() / 1000), 0L, new Runnable() {
            @Override
            public final void run() {
                MediaDataController.m620$r8$lambda$krdduKsZn86HdkyYfwfqP7b6As(callback);
            }
        });
    }

    public static void $r8$lambda$vntmLI7gZQwx7oyMWGW9A3lJaUE(Utilities.Callback callback) {
        if (callback != null) {
            callback.run(null);
        }
    }

    public static void m620$r8$lambda$krdduKsZn86HdkyYfwfqP7b6As(Utilities.Callback callback) {
        if (callback != null) {
            callback.run(null);
        }
    }

    public static void $r8$lambda$MPqUAglOclFOI6EAzC5MY0qZdr8(final MediaDataController mediaDataController, final int i, final Utilities.Callback callback, final long j, final TLObject tLObject, TLRPC.TL_error tL_error) {
        mediaDataController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$71cHNOeGzcgT_OnyIUlAbg23w6E(this.f$0, tLObject, i, callback, j);
            }
        });
    }

    public static void $r8$lambda$71cHNOeGzcgT_OnyIUlAbg23w6E(MediaDataController mediaDataController, TLObject tLObject, int i, final Utilities.Callback callback, long j) {
        mediaDataController.getClass();
        if (tLObject instanceof TLRPC.TL_messages_allStickers) {
            mediaDataController.processLoadStickersResponse(i, (TLRPC.TL_messages_allStickers) tLObject, new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.m569$r8$lambda$6pKMrS2eHl22zKd6hRUVUjvxu4(callback);
                }
            });
        } else {
            mediaDataController.processLoadedStickers(i, null, false, (int) (System.currentTimeMillis() / 1000), j, new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.m606$r8$lambda$_BCRf_vaZd9KdWZ6p58RKK0KzM(callback);
                }
            });
        }
    }

    public static void m569$r8$lambda$6pKMrS2eHl22zKd6hRUVUjvxu4(Utilities.Callback callback) {
        if (callback != null) {
            callback.run(null);
        }
    }

    public static void m606$r8$lambda$_BCRf_vaZd9KdWZ6p58RKK0KzM(Utilities.Callback callback) {
        if (callback != null) {
            callback.run(null);
        }
    }

    private void putStickersToCache(final int i, ArrayList<TLRPC.TL_messages_stickerSet> arrayList, final int i2, final long j) {
        final ArrayList arrayList2 = arrayList != null ? new ArrayList(arrayList) : null;
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$6rjychkiwQ5ENr0n4G2qVdN1TGs(this.f$0, arrayList2, i, i2, j);
            }
        });
    }

    public static void $r8$lambda$6rjychkiwQ5ENr0n4G2qVdN1TGs(MediaDataController mediaDataController, ArrayList arrayList, int i, int i2, long j) {
        mediaDataController.getClass();
        try {
            if (arrayList != null) {
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast = mediaDataController.getMessagesStorage().getDatabase().executeFast("REPLACE INTO stickers_v2 VALUES(?, ?, ?, ?)");
                sQLitePreparedStatementExecuteFast.requery();
                int objectSize = 4;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    objectSize += ((TLRPC.TL_messages_stickerSet) arrayList.get(i3)).getObjectSize();
                }
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(objectSize);
                nativeByteBuffer.writeInt32(arrayList.size());
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    ((TLRPC.TL_messages_stickerSet) arrayList.get(i4)).serializeToStream(nativeByteBuffer);
                }
                sQLitePreparedStatementExecuteFast.bindInteger(1, i + 1);
                sQLitePreparedStatementExecuteFast.bindByteBuffer(2, nativeByteBuffer);
                sQLitePreparedStatementExecuteFast.bindInteger(3, i2);
                sQLitePreparedStatementExecuteFast.bindLong(4, j);
                sQLitePreparedStatementExecuteFast.step();
                nativeByteBuffer.reuse();
                sQLitePreparedStatementExecuteFast.dispose();
                return;
            }
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast2 = mediaDataController.getMessagesStorage().getDatabase().executeFast("UPDATE stickers_v2 SET date = ?");
            sQLitePreparedStatementExecuteFast2.requery();
            sQLitePreparedStatementExecuteFast2.bindLong(1, i2);
            sQLitePreparedStatementExecuteFast2.step();
            sQLitePreparedStatementExecuteFast2.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
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

    private void processLoadedStickers(int i, ArrayList<TLRPC.TL_messages_stickerSet> arrayList, boolean z, int i2, long j) {
        processLoadedStickers(i, arrayList, z, i2, j, null);
    }

    private void processLoadedStickers(final int i, final ArrayList<TLRPC.TL_messages_stickerSet> arrayList, final boolean z, final int i2, final long j, final Runnable runnable) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$1WDMQoGEwrAOdKJznAfitU5TXMI(this.f$0, i);
            }
        });
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.m563$r8$lambda$3NEdB7lUP7iFEBg6pM7431JZk(this.f$0, z, arrayList, i2, j, i, runnable);
            }
        });
    }

    public static void $r8$lambda$1WDMQoGEwrAOdKJznAfitU5TXMI(MediaDataController mediaDataController, int i) {
        mediaDataController.loadingStickers[i] = false;
        mediaDataController.stickersLoaded[i] = true;
        Runnable runnable = mediaDataController.scheduledLoadStickers[i];
        if (runnable != null) {
            runnable.run();
            mediaDataController.scheduledLoadStickers[i] = null;
        }
    }

    public static void m563$r8$lambda$3NEdB7lUP7iFEBg6pM7431JZk(final MediaDataController mediaDataController, boolean z, ArrayList arrayList, final int i, final long j, final int i2, final Runnable runnable) {
        final MediaDataController mediaDataController2;
        final ArrayList arrayList2;
        ArrayList<TLRPC.TL_messages_stickerSet> arrayList3;
        String str;
        mediaDataController.getClass();
        long j2 = 0;
        if ((z && (arrayList == null || BuildVars.DEBUG_PRIVATE_VERSION || Math.abs((System.currentTimeMillis() / 1000) - ((long) i)) >= 3600)) || (!z && arrayList == null && j == 0)) {
            arrayList2 = arrayList;
            Runnable runnable2 = new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.$r8$lambda$eNiX6g62mpKecXKHz9A55wQVcs8(this.f$0, arrayList2, j, i2);
                }
            };
            mediaDataController2 = mediaDataController;
            if (arrayList2 == null && !z) {
                j2 = 1000;
            }
            AndroidUtilities.runOnUIThread(runnable2, j2);
            if (arrayList2 == null) {
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
        } else {
            mediaDataController2 = mediaDataController;
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
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MediaDataController.$r8$lambda$AGupKUe6MRSMWMiMT7riKJ6vpEI(this.f$0, i2, i);
                    }
                });
                mediaDataController2.putStickersToCache(i2, null, i, 0L);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
        }
        try {
            ArrayList<TLRPC.TL_messages_stickerSet> arrayList4 = new ArrayList<>();
            final LongSparseArray longSparseArray = new LongSparseArray();
            final HashMap map = new HashMap();
            final LongSparseArray longSparseArray2 = new LongSparseArray();
            final LongSparseArray longSparseArray3 = new LongSparseArray();
            final HashMap map2 = new HashMap();
            int i3 = 0;
            while (i3 < arrayList2.size()) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList2.get(i3);
                if (tL_messages_stickerSet != null && mediaDataController2.removingStickerSetsUndos.indexOfKey(tL_messages_stickerSet.set.id) < 0) {
                    arrayList4.add(tL_messages_stickerSet);
                    longSparseArray.put(tL_messages_stickerSet.set.id, tL_messages_stickerSet);
                    map.put(tL_messages_stickerSet.set.short_name, tL_messages_stickerSet);
                    for (int i4 = 0; i4 < tL_messages_stickerSet.documents.size(); i4++) {
                        TLRPC.Document document = tL_messages_stickerSet.documents.get(i4);
                        if (document != null && !(document instanceof TLRPC.TL_documentEmpty)) {
                            longSparseArray3.put(document.id, document);
                        }
                    }
                    if (!tL_messages_stickerSet.set.archived) {
                        int i5 = 0;
                        while (i5 < tL_messages_stickerSet.packs.size()) {
                            TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i5);
                            if (tL_stickerPack != null && (str = tL_stickerPack.emoticon) != null) {
                                String strReplace = str.replace("️", "");
                                tL_stickerPack.emoticon = strReplace;
                                ArrayList arrayList5 = (ArrayList) map2.get(strReplace);
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    map2.put(tL_stickerPack.emoticon, arrayList5);
                                }
                                int i6 = 0;
                                while (i6 < tL_stickerPack.documents.size()) {
                                    Long l = tL_stickerPack.documents.get(i6);
                                    int i7 = i3;
                                    if (longSparseArray2.indexOfKey(l.longValue()) < 0) {
                                        longSparseArray2.put(l.longValue(), tL_stickerPack.emoticon);
                                    }
                                    TLRPC.Document document2 = (TLRPC.Document) longSparseArray3.get(l.longValue());
                                    if (document2 != null) {
                                        arrayList5.add(document2);
                                    }
                                    i6++;
                                    i3 = i7;
                                }
                            }
                            i5++;
                            i3 = i3;
                        }
                    }
                }
                i3++;
                mediaDataController2 = mediaDataController;
                arrayList2 = arrayList;
            }
            if (z) {
                arrayList3 = arrayList4;
            } else {
                arrayList3 = arrayList4;
                mediaDataController.putStickersToCache(i2, arrayList3, i, j);
            }
            final ArrayList<TLRPC.TL_messages_stickerSet> arrayList6 = arrayList3;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.$r8$lambda$HWguIR4OsycCC0OgRzXowrKoklM(this.f$0, i2, longSparseArray, map, arrayList6, j, i, longSparseArray3, map2, longSparseArray2, runnable);
                }
            });
        } catch (Throwable th) {
            FileLog.e(th);
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public static void $r8$lambda$eNiX6g62mpKecXKHz9A55wQVcs8(MediaDataController mediaDataController, ArrayList arrayList, long j, int i) {
        mediaDataController.getClass();
        if (arrayList != null && j != 0) {
            mediaDataController.loadHash[i] = j;
        }
        mediaDataController.loadStickers(i, false, false);
    }

    public static void $r8$lambda$HWguIR4OsycCC0OgRzXowrKoklM(MediaDataController mediaDataController, int i, LongSparseArray longSparseArray, HashMap map, ArrayList arrayList, long j, int i2, LongSparseArray longSparseArray2, HashMap map2, LongSparseArray longSparseArray3, Runnable runnable) {
        for (int i3 = 0; i3 < mediaDataController.stickerSets[i].size(); i3++) {
            TLRPC.StickerSet stickerSet = mediaDataController.stickerSets[i].get(i3).set;
            mediaDataController.stickerSetsById.remove(stickerSet.id);
            mediaDataController.stickerSetsByName.remove(stickerSet.short_name);
            if (i != 3 && i != 6 && i != 4) {
                mediaDataController.installedStickerSetsById.remove(stickerSet.id);
            }
        }
        for (int i4 = 0; i4 < longSparseArray.size(); i4++) {
            mediaDataController.stickerSetsById.put(longSparseArray.keyAt(i4), (TLRPC.TL_messages_stickerSet) longSparseArray.valueAt(i4));
            if (i != 3 && i != 6 && i != 4) {
                mediaDataController.installedStickerSetsById.put(longSparseArray.keyAt(i4), (TLRPC.TL_messages_stickerSet) longSparseArray.valueAt(i4));
            }
        }
        mediaDataController.stickerSetsByName.putAll(map);
        mediaDataController.stickerSets[i] = arrayList;
        mediaDataController.loadHash[i] = j;
        mediaDataController.loadDate[i] = i2;
        mediaDataController.stickersByIds[i] = longSparseArray2;
        if (i == 0) {
            mediaDataController.allStickers = map2;
            mediaDataController.stickersByEmoji = longSparseArray3;
        } else if (i == 3) {
            mediaDataController.allStickersFeatured = map2;
        }
        mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.stickersDidLoad, Integer.valueOf(i), Boolean.TRUE);
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void $r8$lambda$AGupKUe6MRSMWMiMT7riKJ6vpEI(MediaDataController mediaDataController, int i, int i2) {
        mediaDataController.loadDate[i] = i2;
    }

    public boolean cancelRemovingStickerSet(long j) {
        Runnable runnable = (Runnable) this.removingStickerSetsUndos.get(j);
        if (runnable == null) {
            return false;
        }
        runnable.run();
        return true;
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

    private void loadStickerSetThumbInternal(TLRPC.PhotoSize photoSize, Object obj, TLRPC.Document document, int i) {
        ImageLocation forSticker = ImageLocation.getForSticker(photoSize, document, i);
        if (forSticker != null) {
            getFileLoader().loadFile(forSticker, obj, forSticker.imageType == 1 ? "tgs" : "webp", 3, 1);
        }
    }

    public void toggleStickerSet(Context context, TLObject tLObject, int i, BaseFragment baseFragment, boolean z, boolean z2) {
        toggleStickerSet(context, tLObject, i, baseFragment, z, z2, null, true);
    }

    public void toggleStickerSet(Context context, TLObject tLObject, int i, BaseFragment baseFragment, boolean z, boolean z2, Runnable runnable, boolean z3) {
        toggleStickerSet(context, tLObject, i, baseFragment, null, z, z2, runnable, z3);
    }

    public void toggleStickerSet(Context context, TLObject tLObject, int i, BaseFragment baseFragment, FrameLayout frameLayout, boolean z, boolean z2, Runnable runnable, boolean z3) {
        toggleStickerSet(context, tLObject, null, i, baseFragment, frameLayout, z, z2, runnable, z3);
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
            if (!z2 || baseFragment == null) {
                toggleStickerSetInternal(context, i, baseFragment, frameLayout, z, tLObject, stickerSet2, document, i4, false);
            } else {
                StickerSetBulletinLayout stickerSetBulletinLayout = new StickerSetBulletinLayout(context, tLObject, i, document, baseFragment.getResourceProvider());
                final boolean[] zArr = new boolean[1];
                markSetUninstalling(stickerSet2.id, true);
                final int i6 = i3;
                Bulletin.UndoButton delayedAction = new Bulletin.UndoButton(context, false).setUndoAction(new Runnable() {
                    @Override
                    public final void run() {
                        MediaDataController.$r8$lambda$2oYwtH1Ae2IVedqUsfQo5dNRCZA(this.f$0, zArr, stickerSet2, i4, i6, tL_messages_stickerSet2, runnable);
                    }
                }).setDelayedAction(new Runnable() {
                    @Override
                    public final void run() {
                        MediaDataController.m581$r8$lambda$HJ3BKpkNq_1JhhdXN_RARqYJqU(this.f$0, zArr, context, i, baseFragment, frameLayout, z, tLObject, stickerSet2, document, i4);
                    }
                });
                stickerSetBulletinLayout.setButton(delayedAction);
                LongSparseArray longSparseArray = this.removingStickerSetsUndos;
                long j = stickerSet2.id;
                Objects.requireNonNull(delayedAction);
                longSparseArray.put(j, new MediaDataController$$ExternalSyntheticLambda159(delayedAction));
                if (frameLayout != null) {
                    i4 = i4;
                    Bulletin.make(frameLayout, stickerSetBulletinLayout, 2750).show();
                } else {
                    i4 = i4;
                    Bulletin.make(baseFragment, stickerSetBulletinLayout, 2750).show();
                }
            }
        } else if (cancelRemovingStickerSet(stickerSet2.id)) {
            i4 = i2;
        } else {
            i4 = i2;
            toggleStickerSetInternal(context, i, baseFragment, frameLayout, z, tLObject, stickerSet2, document, i4, z2);
        }
        getNotificationCenter().postNotificationName(NotificationCenter.stickersDidLoad, Integer.valueOf(i4), Boolean.TRUE);
    }

    public static void $r8$lambda$2oYwtH1Ae2IVedqUsfQo5dNRCZA(MediaDataController mediaDataController, boolean[] zArr, TLRPC.StickerSet stickerSet, int i, int i2, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Runnable runnable) {
        mediaDataController.getClass();
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        mediaDataController.markSetUninstalling(stickerSet.id, false);
        stickerSet.archived = false;
        mediaDataController.stickerSets[i].add(i2, tL_messages_stickerSet);
        mediaDataController.stickerSetsById.put(stickerSet.id, tL_messages_stickerSet);
        mediaDataController.installedStickerSetsById.put(stickerSet.id, tL_messages_stickerSet);
        String str = stickerSet.short_name;
        if (str != null) {
            mediaDataController.stickerSetsByName.put(str.toLowerCase(), tL_messages_stickerSet);
        }
        mediaDataController.removingStickerSetsUndos.remove(stickerSet.id);
        mediaDataController.loadHash[i] = calcStickersHash(mediaDataController.stickerSets[i]);
        mediaDataController.putStickersToCache(i, mediaDataController.stickerSets[i], mediaDataController.loadDate[i], mediaDataController.loadHash[i]);
        if (runnable != null) {
            runnable.run();
        }
        mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.stickersDidLoad, Integer.valueOf(i), Boolean.TRUE);
    }

    public static void m581$r8$lambda$HJ3BKpkNq_1JhhdXN_RARqYJqU(MediaDataController mediaDataController, boolean[] zArr, Context context, int i, BaseFragment baseFragment, FrameLayout frameLayout, boolean z, TLObject tLObject, TLRPC.StickerSet stickerSet, TLRPC.Document document, int i2) {
        mediaDataController.getClass();
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        mediaDataController.toggleStickerSetInternal(context, i, baseFragment, frameLayout, z, tLObject, stickerSet, document, i2, false);
    }

    public void removeMultipleStickerSets(final Context context, final BaseFragment baseFragment, final ArrayList<TLRPC.TL_messages_stickerSet> arrayList) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        int i;
        if (arrayList == null || arrayList.isEmpty() || (tL_messages_stickerSet = arrayList.get(arrayList.size() - 1)) == null) {
            return;
        }
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        if (stickerSet.masks) {
            i = 1;
        } else {
            i = stickerSet.emojis ? 5 : 0;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).set.archived = false;
        }
        final int[] iArr = new int[arrayList.size()];
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
        final int i6 = i;
        long jCalcStickersHash = calcStickersHash(arrayList2);
        jArr[i6] = jCalcStickersHash;
        putStickersToCache(i6, arrayList2, i5, jCalcStickersHash);
        getNotificationCenter().postNotificationName(NotificationCenter.stickersDidLoad, Integer.valueOf(i6), Boolean.TRUE);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            markSetUninstalling(arrayList.get(i7).set.id, true);
        }
        StickerSetBulletinLayout stickerSetBulletinLayout = new StickerSetBulletinLayout(context, tL_messages_stickerSet, arrayList.size(), 0, null, baseFragment.getResourceProvider());
        final boolean[] zArr = new boolean[1];
        Bulletin.UndoButton delayedAction = new Bulletin.UndoButton(context, false).setUndoAction(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$sy8JjwlWzY6yx0tkTcxoRS0eUBc(this.f$0, zArr, arrayList, i6, iArr);
            }
        }).setDelayedAction(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$hmoWYHjA7EGTOrX50JV5hzMhfu4(this.f$0, zArr, arrayList, context, baseFragment, i6);
            }
        });
        stickerSetBulletinLayout.setButton(delayedAction);
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            LongSparseArray longSparseArray = this.removingStickerSetsUndos;
            long j = arrayList.get(i8).set.id;
            Objects.requireNonNull(delayedAction);
            longSparseArray.put(j, new MediaDataController$$ExternalSyntheticLambda159(delayedAction));
        }
        Bulletin.make(baseFragment, stickerSetBulletinLayout, 2750).show();
    }

    public static void $r8$lambda$sy8JjwlWzY6yx0tkTcxoRS0eUBc(MediaDataController mediaDataController, boolean[] zArr, ArrayList arrayList, int i, int[] iArr) {
        mediaDataController.getClass();
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            mediaDataController.markSetUninstalling(((TLRPC.TL_messages_stickerSet) arrayList.get(i2)).set.id, false);
            ((TLRPC.TL_messages_stickerSet) arrayList.get(i2)).set.archived = false;
            mediaDataController.stickerSets[i].add(iArr[i2], (TLRPC.TL_messages_stickerSet) arrayList.get(i2));
            mediaDataController.stickerSetsById.put(((TLRPC.TL_messages_stickerSet) arrayList.get(i2)).set.id, (TLRPC.TL_messages_stickerSet) arrayList.get(i2));
            mediaDataController.installedStickerSetsById.put(((TLRPC.TL_messages_stickerSet) arrayList.get(i2)).set.id, (TLRPC.TL_messages_stickerSet) arrayList.get(i2));
            mediaDataController.stickerSetsByName.put(((TLRPC.TL_messages_stickerSet) arrayList.get(i2)).set.short_name, (TLRPC.TL_messages_stickerSet) arrayList.get(i2));
            mediaDataController.removingStickerSetsUndos.remove(((TLRPC.TL_messages_stickerSet) arrayList.get(i2)).set.id);
        }
        ArrayList<TLRPC.TL_messages_stickerSet> arrayList2 = mediaDataController.stickerSets[i];
        int i3 = mediaDataController.loadDate[i];
        long[] jArr = mediaDataController.loadHash;
        long jCalcStickersHash = calcStickersHash(arrayList2);
        jArr[i] = jCalcStickersHash;
        mediaDataController.putStickersToCache(i, arrayList2, i3, jCalcStickersHash);
        mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.stickersDidLoad, Integer.valueOf(i), Boolean.TRUE);
    }

    public static void $r8$lambda$hmoWYHjA7EGTOrX50JV5hzMhfu4(MediaDataController mediaDataController, boolean[] zArr, ArrayList arrayList, Context context, BaseFragment baseFragment, int i) {
        mediaDataController.getClass();
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            mediaDataController.toggleStickerSetInternal(context, 0, baseFragment, null, true, (TLObject) arrayList.get(i2), ((TLRPC.TL_messages_stickerSet) arrayList.get(i2)).set, null, i, false);
        }
    }

    private void toggleStickerSetInternal(final Context context, int i, final BaseFragment baseFragment, final FrameLayout frameLayout, final boolean z, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final int i2, final boolean z2) {
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
        long j = stickerSet.id;
        tL_inputStickerSetID.id = j;
        if (i != 0) {
            TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
            tL_messages_installStickerSet.stickerset = tL_inputStickerSetID;
            tL_messages_installStickerSet.archived = i == 1;
            markSetInstalling(stickerSet.id, true);
            getConnectionsManager().sendRequest(tL_messages_installStickerSet, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                    MediaDataController.m556$r8$lambda$ACvXySqJfrCjEhrvh8S8iLWPCA(this.f$0, stickerSet, baseFragment, z, i2, z2, frameLayout, context, tLObject, document, tLObject2, tL_error);
                }
            });
            return;
        }
        markSetUninstalling(j, true);
        TLRPC.TL_messages_uninstallStickerSet tL_messages_uninstallStickerSet = new TLRPC.TL_messages_uninstallStickerSet();
        tL_messages_uninstallStickerSet.stickerset = tL_inputStickerSetID;
        getConnectionsManager().sendRequest(tL_messages_uninstallStickerSet, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                MediaDataController.$r8$lambda$2eUr1x9EOETDOu6cAhaMySJMp70(this.f$0, stickerSet, i2, tLObject2, tL_error);
            }
        });
    }

    public static void m556$r8$lambda$ACvXySqJfrCjEhrvh8S8iLWPCA(final MediaDataController mediaDataController, final TLRPC.StickerSet stickerSet, final BaseFragment baseFragment, final boolean z, final int i, final boolean z2, final FrameLayout frameLayout, final Context context, final TLObject tLObject, final TLRPC.Document document, final TLObject tLObject2, final TLRPC.TL_error tL_error) {
        mediaDataController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$ZdA9vmDj9ub1hQ0L5FTvpMdY_QY(this.f$0, stickerSet, tLObject2, baseFragment, z, i, tL_error, z2, frameLayout, context, tLObject, document);
            }
        });
    }

    public static void $r8$lambda$ZdA9vmDj9ub1hQ0L5FTvpMdY_QY(final MediaDataController mediaDataController, final TLRPC.StickerSet stickerSet, TLObject tLObject, BaseFragment baseFragment, boolean z, int i, TLRPC.TL_error tL_error, boolean z2, FrameLayout frameLayout, Context context, TLObject tLObject2, TLRPC.Document document) {
        mediaDataController.removingStickerSetsUndos.remove(stickerSet.id);
        if (tLObject instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
            mediaDataController.processStickerSetInstallResultArchive(baseFragment, z, i, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject);
        }
        mediaDataController.loadStickers(i, false, false, true, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                MediaDataController.$r8$lambda$Fw5kpxs4DpnXB8uqMd4QjYAgdzI(this.f$0, stickerSet, (ArrayList) obj);
            }
        });
        if (tL_error == null && z2) {
            if (frameLayout != null) {
                Bulletin.make(frameLayout, new StickerSetBulletinLayout(context, tLObject2, 2, document, baseFragment.getResourceProvider()), 1500).show();
            } else if (baseFragment != null) {
                Bulletin.make(baseFragment, new StickerSetBulletinLayout(context, tLObject2, 2, document, baseFragment.getResourceProvider()), 1500).show();
            }
        }
    }

    public static void $r8$lambda$Fw5kpxs4DpnXB8uqMd4QjYAgdzI(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, ArrayList arrayList) {
        mediaDataController.getClass();
        mediaDataController.markSetInstalling(stickerSet.id, false);
    }

    public static void $r8$lambda$2eUr1x9EOETDOu6cAhaMySJMp70(final MediaDataController mediaDataController, final TLRPC.StickerSet stickerSet, final int i, TLObject tLObject, TLRPC.TL_error tL_error) {
        mediaDataController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$7eSTTY5PE0a26aXdlXcLVU5MdT0(this.f$0, stickerSet, i);
            }
        });
    }

    public static void $r8$lambda$7eSTTY5PE0a26aXdlXcLVU5MdT0(final MediaDataController mediaDataController, final TLRPC.StickerSet stickerSet, int i) {
        mediaDataController.removingStickerSetsUndos.remove(stickerSet.id);
        mediaDataController.loadStickers(i, false, true, false, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                MediaDataController.m634$r8$lambda$xsFkq9hdOrfMpr9656icTtvSPA(this.f$0, stickerSet, (ArrayList) obj);
            }
        });
    }

    public static void m634$r8$lambda$xsFkq9hdOrfMpr9656icTtvSPA(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, ArrayList arrayList) {
        mediaDataController.getClass();
        mediaDataController.markSetUninstalling(stickerSet.id, false);
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
                    if (i2 == 2) {
                        this.stickerSets[i].add(0, tL_messages_stickerSet);
                        break;
                    }
                    this.stickerSetsById.remove(tL_messages_stickerSet.set.id);
                    this.installedStickerSetsById.remove(tL_messages_stickerSet.set.id);
                    this.stickerSetsByName.remove(tL_messages_stickerSet.set.short_name);
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
        getNotificationCenter().postNotificationName(NotificationCenter.stickersDidLoad, Integer.valueOf(i), Boolean.TRUE);
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
                MediaDataController.$r8$lambda$_YpeH1l5WiytYQ_5kzWr9k16cfg(this.f$0, i2, baseFragment, z, i, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$_YpeH1l5WiytYQ_5kzWr9k16cfg(final MediaDataController mediaDataController, final int i, final BaseFragment baseFragment, final boolean z, final int i2, final TLObject tLObject, TLRPC.TL_error tL_error) {
        mediaDataController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$3PG_hSxJCc7pNEgHkGUX2Xx8t5M(this.f$0, i, tLObject, baseFragment, z, i2);
            }
        });
    }

    public static void $r8$lambda$3PG_hSxJCc7pNEgHkGUX2Xx8t5M(MediaDataController mediaDataController, int i, TLObject tLObject, BaseFragment baseFragment, boolean z, int i2) {
        if (i != 0) {
            mediaDataController.getClass();
            if (tLObject instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                mediaDataController.processStickerSetInstallResultArchive(baseFragment, z, i2, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject);
            }
            mediaDataController.loadStickers(i2, false, false, true);
            return;
        }
        mediaDataController.loadStickers(i2, false, true);
    }

    public void processStickerSetInstallResultArchive(BaseFragment baseFragment, boolean z, int i, TLRPC.TL_messages_stickerSetInstallResultArchive tL_messages_stickerSetInstallResultArchive) {
        int size = tL_messages_stickerSetInstallResultArchive.sets.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.installedStickerSetsById.remove(tL_messages_stickerSetInstallResultArchive.sets.get(i2).set.id);
        }
        loadArchivedStickersCount(i, false);
        getNotificationCenter().postNotificationName(NotificationCenter.needAddArchivedStickers, tL_messages_stickerSetInstallResultArchive.sets);
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        baseFragment.showDialog(new StickersArchiveAlert(baseFragment.getParentActivity(), z ? baseFragment : null, tL_messages_stickerSetInstallResultArchive.sets).create());
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

    public ArrayList<MessageObject> getFoundMessageObjects() {
        return this.searchResultMessages;
    }

    public void clearFoundMessageObjects() {
        this.searchResultMessages.clear();
        this.searchServerResultMessages.clear();
        this.searchLocalResultMessages.clear();
    }

    public boolean isMessageFound(int i, boolean z) {
        return this.searchServerResultMessagesMap[z ? 1 : 0].indexOfKey(i) >= 0;
    }

    public void searchMessagesInChat(String str, long j, long j2, int i, int i2, long j3, TLRPC.User user, TLRPC.Chat chat, ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
        searchMessagesInChat(str, j, j2, i, i2, j3, false, user, chat, true, visibleReaction);
    }

    public void jumpToSearchedMessage(int i, int i2) {
        if (i2 < 0 || i2 >= this.searchResultMessages.size()) {
            return;
        }
        this.lastReturnedNum = i2;
        MessageObject messageObject = this.searchResultMessages.get(i2);
        getNotificationCenter().postNotificationName(NotificationCenter.chatSearchResultsAvailable, Integer.valueOf(i), Integer.valueOf(messageObject.getId()), Integer.valueOf(getMask()), Long.valueOf(messageObject.getDialogId()), Integer.valueOf(this.lastReturnedNum), Integer.valueOf(getSearchCount()), Boolean.TRUE);
    }

    public int getSearchPosition() {
        return this.lastReturnedNum;
    }

    public int getSearchCount() {
        if (this.searchServerResultMessages.isEmpty()) {
            int[] iArr = this.messagesSearchCount;
            return Math.max(Math.max(iArr[0] + iArr[1], this.messagesLocalSearchCount), this.searchServerResultMessages.size());
        }
        int[] iArr2 = this.messagesSearchCount;
        return Math.max(iArr2[0] + iArr2[1], this.searchServerResultMessages.size());
    }

    public void setSearchedPosition(int i) {
        if (i < 0 || i >= this.searchResultMessages.size()) {
            return;
        }
        this.lastReturnedNum = i;
    }

    public boolean searchEndReached() {
        boolean[] zArr = this.messagesSearchEndReached;
        return (zArr[0] && this.lastMergeDialogId == 0 && zArr[1]) || this.loadingSearchLocal || this.loadedPredirectedSearchLocal;
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

    public boolean isSearchLoading() {
        return this.reqId != 0;
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
                getNotificationCenter().postNotificationName(NotificationCenter.chatSearchResultsLoading, Integer.valueOf(i));
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
                if (i2 == 2) {
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
                    notificationCenter.postNotificationName(i5, objArr);
                    this.loadingMoreSearchMessages = false;
                    return;
                }
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
                notificationCenter2.postNotificationName(i7, objArr2);
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
            ArrayList<MessageObject> arrayList = this.searchResultMessages;
            MessageObject messageObject3 = arrayList.get(arrayList.size() - 1);
            if (messageObject3.getDialogId() == j && !this.messagesSearchEndReached[0]) {
                id = messageObject3.getId();
                j4 = j;
            } else {
                id = messageObject3.getDialogId() == j2 ? messageObject3.getId() : 0;
                this.messagesSearchEndReached[1] = false;
                j4 = j2;
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
                        MediaDataController.$r8$lambda$GVr5Zr_FLfcQBEFToBvTFIQobIg(this.f$0, j2, tL_messages_search, j, i, i2, j3, user, chat, z2, visibleReaction, tLObject, tL_error);
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
            ArrayList<MessageObject> arrayList2 = this.searchLocalResultMessages;
            int size = arrayList2 == null ? 0 : arrayList2.size();
            i3 = i8;
            j5 = j8;
            j6 = 0;
            String str4 = str2;
            messagesStorage.searchSavedByTag(tLReaction, j9, str4, 300, size, new Utilities.Callback4() {
                @Override
                public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                    MediaDataController.$r8$lambda$TTUTdqluuRm43EWEd6cEfVd0QSc(this.f$0, i3, savedTagCount, i, j, (ArrayList) obj, (ArrayList) obj2, (ArrayList) obj3, (ArrayList) obj4);
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
                MediaDataController.m566$r8$lambda$5xvaeLb9BpedZ_hoPk9GC9r6ag(this.f$0, tL_messages_search2, z9, str3, z8, i9, z2, j5, j, i, j2, j3, user, chat, tLObject, tL_error);
            }
        }, 2);
    }

    public static void $r8$lambda$GVr5Zr_FLfcQBEFToBvTFIQobIg(final MediaDataController mediaDataController, final long j, final TLRPC.TL_messages_search tL_messages_search, final long j2, final int i, final int i2, final long j3, final TLRPC.User user, final TLRPC.Chat chat, final boolean z, final ReactionsLayoutInBubble.VisibleReaction visibleReaction, final TLObject tLObject, TLRPC.TL_error tL_error) {
        mediaDataController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$d6ljs_BKRAXXYCDLqreesYOJMRU(this.f$0, j, tLObject, tL_messages_search, j2, i, i2, j3, user, chat, z, visibleReaction);
            }
        });
    }

    public static void $r8$lambda$d6ljs_BKRAXXYCDLqreesYOJMRU(MediaDataController mediaDataController, long j, TLObject tLObject, TLRPC.TL_messages_search tL_messages_search, long j2, int i, int i2, long j3, TLRPC.User user, TLRPC.Chat chat, boolean z, ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
        if (mediaDataController.lastMergeDialogId == j) {
            mediaDataController.mergeReqId = 0;
            if (tLObject != null) {
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                mediaDataController.messagesSearchEndReached[1] = messages_messages.messages.isEmpty();
                mediaDataController.messagesSearchCount[1] = messages_messages instanceof TLRPC.TL_messages_messagesSlice ? messages_messages.count : messages_messages.messages.size();
                mediaDataController.searchMessagesInChat(tL_messages_search.q, j2, j, i, i2, j3, true, user, chat, z, visibleReaction);
                return;
            }
            mediaDataController.messagesSearchEndReached[1] = true;
            mediaDataController.messagesSearchCount[1] = 0;
            mediaDataController.searchMessagesInChat(tL_messages_search.q, j2, j, i, i2, j3, true, user, chat, z, visibleReaction);
        }
    }

    public static void $r8$lambda$TTUTdqluuRm43EWEd6cEfVd0QSc(MediaDataController mediaDataController, int i, int i2, int i3, long j, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        if (i == mediaDataController.lastReqId) {
            mediaDataController.loadedPredirectedSearchLocal = arrayList.size() == i2;
            mediaDataController.loadingSearchLocal = false;
            mediaDataController.getMessagesController().putUsers(arrayList2, true);
            mediaDataController.getMessagesController().putChats(arrayList3, true);
            AnimatedEmojiDrawable.getDocumentFetcher(mediaDataController.currentAccount).processDocuments(arrayList4);
            mediaDataController.searchLocalResultMessages = arrayList;
            mediaDataController.updateSearchResults();
            mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.chatSearchResultsAvailable, Integer.valueOf(i3), 0, Integer.valueOf(mediaDataController.getMask()), Long.valueOf(j), Integer.valueOf(mediaDataController.lastReturnedNum), Integer.valueOf(mediaDataController.getSearchCount()), Boolean.TRUE);
        }
    }

    public static void m566$r8$lambda$5xvaeLb9BpedZ_hoPk9GC9r6ag(final MediaDataController mediaDataController, TLRPC.TL_messages_search tL_messages_search, final boolean z, String str, boolean z2, final int i, final boolean z3, final long j, final long j2, final int i2, final long j3, final long j4, final TLRPC.User user, final TLRPC.Chat chat, final TLObject tLObject, TLRPC.TL_error tL_error) {
        final TLRPC.TL_messages_search tL_messages_search2;
        mediaDataController.getClass();
        final ArrayList arrayList = new ArrayList();
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            tL_messages_search2 = tL_messages_search;
            int iMin = Math.min(messages_messages.messages.size(), tL_messages_search2.limit - 1);
            for (int i3 = 0; i3 < iMin; i3++) {
                MessageObject messageObject = new MessageObject(mediaDataController.currentAccount, messages_messages.messages.get(i3), null, null, null, null, null, true, true, 0L, false, false, z);
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
                MediaDataController.$r8$lambda$Cx_3uh3fbvkBVd690krwT3uVrs8(this.f$0, i, z3, tLObject, tL_messages_search2, j, j2, i2, arrayList, z, j3, j4, user, chat);
            }
        });
    }

    public static void $r8$lambda$Cx_3uh3fbvkBVd690krwT3uVrs8(final MediaDataController mediaDataController, int i, final boolean z, TLObject tLObject, final TLRPC.TL_messages_search tL_messages_search, final long j, final long j2, final int i2, final ArrayList arrayList, final boolean z2, final long j3, final long j4, final TLRPC.User user, final TLRPC.Chat chat) {
        if (i == mediaDataController.lastReqId) {
            mediaDataController.reqId = 0;
            if (!z) {
                mediaDataController.loadingMoreSearchMessages = false;
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
                mediaDataController.getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                mediaDataController.getMessagesController().putUsers(messages_messages.users, false);
                mediaDataController.getMessagesController().putChats(messages_messages.chats, false);
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        MediaDataController.$r8$lambda$Qjys8VAmGZPC0dyhkRR7uxIRgZ4(this.f$0, tL_messages_search, j, j2, i2, messages_messages, arrayList, z, z2, j3, j4, user, chat);
                    }
                };
                if (z2) {
                    mediaDataController.loadReplyMessagesForMessages(arrayList, j2, 0, mediaDataController.lastReplyMessageId, runnable, i2, null);
                } else {
                    runnable.run();
                }
            }
        }
    }

    public static void $r8$lambda$Qjys8VAmGZPC0dyhkRR7uxIRgZ4(MediaDataController mediaDataController, TLRPC.TL_messages_search tL_messages_search, long j, long j2, int i, TLRPC.messages_Messages messages_messages, ArrayList arrayList, boolean z, boolean z2, long j3, long j4, TLRPC.User user, TLRPC.Chat chat) {
        long j5;
        mediaDataController.getClass();
        if (tL_messages_search.offset_id == 0 && j == j2) {
            mediaDataController.lastReturnedNum = 0;
            mediaDataController.searchServerResultMessages.clear();
            mediaDataController.searchServerResultMessagesMap[0].clear();
            mediaDataController.searchServerResultMessagesMap[1].clear();
            mediaDataController.messagesSearchCount[0] = 0;
            mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.chatSearchResultsLoading, Integer.valueOf(i));
        }
        int iMin = Math.min(messages_messages.messages.size(), tL_messages_search.limit - 1);
        int i2 = 0;
        boolean z3 = false;
        while (i2 < iMin) {
            MessageObject messageObject = (MessageObject) arrayList.get(i2);
            mediaDataController.searchServerResultMessages.add(messageObject);
            mediaDataController.searchServerResultMessagesMap[j == j2 ? (char) 0 : (char) 1].put(messageObject.getId(), messageObject);
            i2++;
            z3 = true;
        }
        mediaDataController.updateSearchResults();
        mediaDataController.messagesSearchEndReached[j == j2 ? (char) 0 : (char) 1] = messages_messages.messages.size() < tL_messages_search.limit;
        mediaDataController.messagesSearchCount[j == j2 ? (char) 0 : (char) 1] = ((messages_messages instanceof TLRPC.TL_messages_messagesSlice) || (messages_messages instanceof TLRPC.TL_messages_channelMessages)) ? messages_messages.count : messages_messages.messages.size();
        if (mediaDataController.searchServerResultMessages.isEmpty()) {
            mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.chatSearchResultsAvailable, Integer.valueOf(i), 0, Integer.valueOf(mediaDataController.getMask()), 0L, 0, 0, Boolean.valueOf(z));
            j5 = 0;
        } else if (z3) {
            if (mediaDataController.lastReturnedNum >= mediaDataController.searchResultMessages.size()) {
                mediaDataController.lastReturnedNum = mediaDataController.searchResultMessages.size() - 1;
            }
            MessageObject messageObject2 = mediaDataController.searchResultMessages.get(mediaDataController.lastReturnedNum);
            j5 = 0;
            mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.chatSearchResultsAvailable, Integer.valueOf(i), Integer.valueOf(messageObject2.getId()), Integer.valueOf(mediaDataController.getMask()), Long.valueOf(messageObject2.getDialogId()), Integer.valueOf(mediaDataController.lastReturnedNum), Integer.valueOf(mediaDataController.getSearchCount()), Boolean.valueOf(z));
        } else {
            j5 = 0;
            if (z2) {
                mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.chatSearchResultsAvailable, Integer.valueOf(i), 0, Integer.valueOf(mediaDataController.getMask()), Long.valueOf(j2), Integer.valueOf(mediaDataController.lastReturnedNum), Integer.valueOf(mediaDataController.getSearchCount()), Boolean.FALSE);
            }
        }
        if (j == j2) {
            boolean[] zArr = mediaDataController.messagesSearchEndReached;
            if (!zArr[0] || j3 == j5 || zArr[1]) {
                return;
            }
            mediaDataController.searchMessagesInChat(mediaDataController.lastSearchQuery, j2, j3, i, 0, j4, true, user, chat, z, mediaDataController.lastReaction);
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
        getNotificationCenter().postNotificationName(NotificationCenter.chatSearchResultsAvailable, Integer.valueOf(i), 0, Integer.valueOf(getMask()), Long.valueOf(getUserConfig().getClientUserId()), Integer.valueOf(this.lastReturnedNum), Integer.valueOf(getSearchCount()), Boolean.TRUE);
    }

    public String getLastSearchQuery() {
        return this.lastSearchQuery;
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
            if (!TextUtils.isEmpty(str)) {
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
                    MediaDataController.$r8$lambda$qfFuARK_9gGJPoYCPZ4qK1fDzPs(this.f$0, j, i3, i, i2, i4, j2, i6, z, i7, tLObject, tL_error);
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
            if (!TextUtils.isEmpty(str)) {
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
                    MediaDataController.$r8$lambda$qfFuARK_9gGJPoYCPZ4qK1fDzPs(this.f$0, j, i3, i, i2, i4, j2, i6, z, i7, tLObject, tL_error);
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
        if (!TextUtils.isEmpty(str)) {
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
                MediaDataController.$r8$lambda$qfFuARK_9gGJPoYCPZ4qK1fDzPs(this.f$0, j, i3, i, i2, i4, j2, i6, z, i7, tLObject, tL_error);
            }
        }), i6);
        return;
        mediaDataController.loadMediaDatabase(j, i, i2, i3, i4, j2, visibleReaction, i6, z, i5, i7);
    }

    public static void $r8$lambda$qfFuARK_9gGJPoYCPZ4qK1fDzPs(MediaDataController mediaDataController, long j, int i, int i2, int i3, int i4, long j2, int i5, boolean z, int i6, TLObject tLObject, TLRPC.TL_error tL_error) {
        mediaDataController.getClass();
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            mediaDataController.getMessagesController().removeDeletedMessagesFromArray(j, messages_messages.messages);
            mediaDataController.processLoadedMedia(messages_messages, j, i2, i3, i, i4, j2, 0, i5, z, i == 0 ? messages_messages.messages.size() == 0 : messages_messages.messages.size() <= 1, i6);
        }
    }

    public void getMediaCounts(final long j, final long j2, final int i) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.m590$r8$lambda$Mp9ok3wvdrF7Yd6bgtHUTp1xz0(this.f$0, j2, j, i);
            }
        });
    }

    public static void m590$r8$lambda$Mp9ok3wvdrF7Yd6bgtHUTp1xz0(final MediaDataController mediaDataController, final long j, final long j2, int i) {
        SQLiteCursor sQLiteCursorQueryFinalized;
        int i2 = 0;
        mediaDataController.getClass();
        try {
            final int[] iArr = new int[9];
            iArr[0] = -1;
            iArr[1] = -1;
            iArr[2] = -1;
            iArr[3] = -1;
            iArr[4] = -1;
            iArr[5] = -1;
            iArr[6] = -1;
            iArr[7] = -1;
            iArr[8] = -1;
            final int[] iArr2 = new int[9];
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
            if (j != 0) {
                sQLiteCursorQueryFinalized = mediaDataController.getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT type, count, old FROM media_counts_topics WHERE uid = %d AND topic_id = %d", Long.valueOf(j2), Long.valueOf(j)), new Object[0]);
            } else {
                sQLiteCursorQueryFinalized = mediaDataController.getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT type, count, old FROM media_counts_v2 WHERE uid = %d", Long.valueOf(j2)), new Object[0]);
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
            if (DialogObject.isEncryptedDialog(j2)) {
                for (int i3 = 0; i3 < 9; i3++) {
                    if (iArr[i3] == -1) {
                        SQLiteCursor sQLiteCursorQueryFinalized2 = mediaDataController.getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT COUNT(mid) FROM media_v4 WHERE uid = %d AND type = %d LIMIT 1", Long.valueOf(j2), Integer.valueOf(i3)), new Object[0]);
                        if (sQLiteCursorQueryFinalized2.next()) {
                            iArr[i3] = sQLiteCursorQueryFinalized2.intValue(0);
                        } else {
                            iArr[i3] = 0;
                        }
                        sQLiteCursorQueryFinalized2.dispose();
                        mediaDataController.putMediaCountDatabase(j2, j, i3, iArr[i3]);
                    }
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.getNotificationCenter().postNotificationName(NotificationCenter.mediaCountsDidLoad, Long.valueOf(j2), Long.valueOf(j), iArr);
                    }
                });
                return;
            }
            TLRPC.TL_messages_getSearchCounters tL_messages_getSearchCounters = new TLRPC.TL_messages_getSearchCounters();
            tL_messages_getSearchCounters.peer = mediaDataController.getMessagesController().getInputPeer(j2);
            if (j != 0) {
                if (j2 == mediaDataController.getUserConfig().getClientUserId()) {
                    tL_messages_getSearchCounters.saved_peer_id = mediaDataController.getMessagesController().getInputPeer(j);
                    tL_messages_getSearchCounters.flags |= 4;
                } else {
                    tL_messages_getSearchCounters.top_msg_id = (int) j;
                    tL_messages_getSearchCounters.flags |= 1;
                }
            }
            int i4 = 0;
            boolean z = false;
            while (i4 < 9) {
                if (tL_messages_getSearchCounters.peer == null) {
                    iArr[i4] = i2;
                } else if (iArr[i4] == -1 || iArr3[i4] == 1) {
                    if (i4 == 0) {
                        tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterPhotoVideo());
                    } else if (i4 == 1) {
                        tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterDocument());
                    } else if (i4 == 2) {
                        tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterRoundVoice());
                    } else if (i4 == 3) {
                        tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterUrl());
                    } else if (i4 == 4) {
                        tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterMusic());
                    } else if (i4 == 6) {
                        tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterPhotos());
                    } else if (i4 == 7) {
                        tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterVideo());
                    } else if (i4 == 8) {
                        tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterPoll());
                    } else {
                        tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterGif());
                    }
                    if (iArr[i4] == -1) {
                        z = true;
                    } else if (iArr3[i4] == 1) {
                        iArr[i4] = -1;
                    }
                }
                i4++;
                i2 = 0;
            }
            if (!tL_messages_getSearchCounters.filters.isEmpty()) {
                mediaDataController.getConnectionsManager().bindRequestToGuid(mediaDataController.getConnectionsManager().sendRequest(tL_messages_getSearchCounters, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        MediaDataController.m607$r8$lambda$_CyQagl2XCnlEgavnDdLrsE92c(this.f$0, iArr, j2, j, tLObject, tL_error);
                    }
                }), i);
            }
            if (z && mediaDataController.getConnectionsManager().getConnectionState() == 3) {
                return;
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.getNotificationCenter().postNotificationName(NotificationCenter.mediaCountsDidLoad, Long.valueOf(j2), Long.valueOf(j), iArr2);
                }
            });
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void m607$r8$lambda$_CyQagl2XCnlEgavnDdLrsE92c(final MediaDataController mediaDataController, final int[] iArr, final long j, final long j2, TLObject tLObject, TLRPC.TL_error tL_error) {
        int i;
        mediaDataController.getClass();
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
                mediaDataController.putMediaCountDatabase(j, j2, i, i4);
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.getNotificationCenter().postNotificationName(NotificationCenter.mediaCountsDidLoad, Long.valueOf(j), Long.valueOf(j2), iArr);
            }
        });
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
                MediaDataController.$r8$lambda$2vqu5o6tmZCA7SYfJs89NXcd150(this.f$0, j, j2, i, i2, tLObject, tL_error);
            }
        }), i2);
    }

    public static void $r8$lambda$2vqu5o6tmZCA7SYfJs89NXcd150(MediaDataController mediaDataController, long j, long j2, int i, int i2, TLObject tLObject, TLRPC.TL_error tL_error) {
        mediaDataController.getClass();
        if (tLObject instanceof Vector) {
            Vector vector = (Vector) tLObject;
            if (vector.objects.isEmpty()) {
                return;
            }
            mediaDataController.processLoadedMediaCount(((TLRPC.TL_messages_searchCounter) vector.objects.get(0)).count, j, j2, i, i2, false, 0);
        }
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
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            for (int i = 0; i < document.attributes.size(); i++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
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
        if (!message.entities.isEmpty()) {
            for (int i2 = 0; i2 < message.entities.size(); i2++) {
                TLRPC.MessageEntity messageEntity = message.entities.get(i2);
                if ((messageEntity instanceof TLRPC.TL_messageEntityUrl) || (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) || (messageEntity instanceof TLRPC.TL_messageEntityEmail)) {
                    return 3;
                }
            }
        }
        return -1;
    }

    public static boolean canAddMessageToMedia(TLRPC.Message message) {
        boolean z = message instanceof TLRPC.TL_message_secret;
        if (!z || (!((MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaPhoto) || MessageObject.isVideoMessage(message) || MessageObject.isGifMessage(message)) || MessageObject.getMedia(message).ttl_seconds == 0 || MessageObject.getMedia(message).ttl_seconds > 60)) {
            return (z || !(message instanceof TLRPC.TL_message) || (!((MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaPhoto) || (MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaDocument)) || MessageObject.getMedia(message).ttl_seconds == 0)) && getMediaType(message) != -1;
        }
        return false;
    }

    public void processLoadedMedia(final TLRPC.messages_Messages messages_messages, final long j, int i, int i2, final int i3, final int i4, long j2, final int i5, final int i6, boolean z, final boolean z2, final int i7) {
        long j3;
        int i8;
        int i9;
        int i10;
        long j4;
        boolean z3;
        ArrayList<TLRPC.Message> arrayList;
        ArrayList<TLRPC.Message> arrayList2;
        if (BuildVars.LOGS_ENABLED) {
            int size = (messages_messages == null || (arrayList2 = messages_messages.messages) == null) ? 0 : arrayList2.size();
            StringBuilder sb = new StringBuilder();
            sb.append("process load media messagesCount ");
            sb.append(size);
            sb.append(" did ");
            j3 = j;
            sb.append(j3);
            sb.append(" topicId ");
            j4 = j2;
            sb.append(j4);
            sb.append(" count = ");
            i8 = i;
            sb.append(i8);
            sb.append(" max_id=");
            i9 = i2;
            sb.append(i9);
            sb.append(" min_id=");
            sb.append(i3);
            sb.append(" type = ");
            i10 = i4;
            sb.append(i10);
            sb.append(" cache = ");
            sb.append(i5);
            sb.append(" classGuid = ");
            sb.append(i6);
            sb.append(" topReached=");
            z3 = z2;
            sb.append(z3);
            FileLog.d(sb.toString());
        } else {
            j3 = j;
            i8 = i;
            i9 = i2;
            i10 = i4;
            j4 = j2;
            z3 = z2;
        }
        if (i5 != 0 && messages_messages != null && (arrayList = messages_messages.messages) != null && (((arrayList.isEmpty() && i3 == 0) || (messages_messages.messages.size() <= 1 && i3 != 0)) && !DialogObject.isEncryptedDialog(j3))) {
            if (i5 == 2) {
                return;
            }
            loadMedia(j3, i8, i9, i3, i10, j4, 0, i6, i7, null, null);
        } else {
            if (i5 == 0) {
                ImageLoader.saveMessagesThumbs(messages_messages.messages);
                getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                putMediaDatabase(j, j2, i4, messages_messages.messages, i2, i3, z3);
            }
            Utilities.searchQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.$r8$lambda$nMnlvYk_SFEjGimZxw5iR5wksUw(this.f$0, messages_messages, i5, j, i6, i4, z2, i3, i7);
                }
            });
        }
    }

    public static void $r8$lambda$nMnlvYk_SFEjGimZxw5iR5wksUw(final MediaDataController mediaDataController, final TLRPC.messages_Messages messages_messages, final int i, final long j, final int i2, final int i3, final boolean z, final int i4, final int i5) {
        mediaDataController.getClass();
        LongSparseArray longSparseArray = new LongSparseArray();
        for (int i6 = 0; i6 < messages_messages.users.size(); i6++) {
            TLRPC.User user = messages_messages.users.get(i6);
            longSparseArray.put(user.id, user);
        }
        final ArrayList<MessageObject> arrayList = new ArrayList<>();
        for (int i7 = 0; i7 < messages_messages.messages.size(); i7++) {
            MessageObject messageObject = new MessageObject(mediaDataController.currentAccount, messages_messages.messages.get(i7), longSparseArray, true, false);
            messageObject.createStrippedThumb();
            arrayList.add(messageObject);
        }
        mediaDataController.getFileLoader().checkMediaExistance(arrayList);
        final Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$TyGnBrAoU48qXFcdlqsrdo_dZZc(this.f$0, messages_messages, i, j, arrayList, i2, i3, z, i4, i5);
            }
        };
        if (mediaDataController.getMessagesController().getTranslateController().isFeatureAvailable(j)) {
            mediaDataController.getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.m613$r8$lambda$hkrTbHyO3uWZCygoHOnMZ9Vb0o(this.f$0, arrayList, runnable);
                }
            });
        } else {
            runnable.run();
        }
    }

    public static void $r8$lambda$TyGnBrAoU48qXFcdlqsrdo_dZZc(final MediaDataController mediaDataController, final TLRPC.messages_Messages messages_messages, final int i, final long j, final ArrayList arrayList, final int i2, final int i3, final boolean z, final int i4, final int i5) {
        mediaDataController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$oy29E0Dm4d0x8jTOTlNw6_nET54(this.f$0, messages_messages, i, j, arrayList, i2, i3, z, i4, i5);
            }
        });
    }

    public static void $r8$lambda$oy29E0Dm4d0x8jTOTlNw6_nET54(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i, long j, ArrayList arrayList, int i2, int i3, boolean z, int i4, int i5) {
        mediaDataController.getClass();
        int i6 = messages_messages.count;
        mediaDataController.getMessagesController().putUsers(messages_messages.users, i != 0);
        mediaDataController.getMessagesController().putChats(messages_messages.chats, i != 0);
        mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.mediaDidLoad, Long.valueOf(j), Integer.valueOf(i6), arrayList, Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(z), Boolean.valueOf(i4 != 0), Integer.valueOf(i5));
    }

    public static void m613$r8$lambda$hkrTbHyO3uWZCygoHOnMZ9Vb0o(MediaDataController mediaDataController, ArrayList arrayList, Runnable runnable) {
        mediaDataController.getClass();
        for (int i = 0; i < arrayList.size(); i++) {
            MessageObject messageObject = (MessageObject) arrayList.get(i);
            TLRPC.Message messageWithCustomParamsOnlyInternal = mediaDataController.getMessagesStorage().getMessageWithCustomParamsOnlyInternal(messageObject.getId(), messageObject.getDialogId());
            TLRPC.Message message = messageObject.messageOwner;
            message.translatedToLanguage = messageWithCustomParamsOnlyInternal.translatedToLanguage;
            message.translatedText = messageWithCustomParamsOnlyInternal.translatedText;
            messageObject.updateTranslation();
        }
        runnable.run();
    }

    private void processLoadedMediaCount(final int i, final long j, final long j2, final int i2, final int i3, final boolean z, final int i4) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$lW2F6kNU5HVcBnjexurOBePKyhg(this.f$0, j, z, i, i2, i4, j2, i3);
            }
        });
    }

    public static void $r8$lambda$lW2F6kNU5HVcBnjexurOBePKyhg(MediaDataController mediaDataController, long j, boolean z, int i, int i2, int i3, long j2, int i4) {
        int i5;
        boolean z2;
        int i6 = i;
        mediaDataController.getClass();
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
            mediaDataController.getMediaCount(j, j2, i5, i4, false);
        }
        if (z2) {
            return;
        }
        if (!z) {
            mediaDataController.putMediaCountDatabase(j, j2, i2, i6);
        }
        NotificationCenter notificationCenter = mediaDataController.getNotificationCenter();
        int i7 = NotificationCenter.mediaCountDidLoad;
        Long lValueOf = Long.valueOf(j);
        Long lValueOf2 = Long.valueOf(j2);
        if (z && i6 == -1) {
            i6 = 0;
        }
        notificationCenter.postNotificationName(i7, lValueOf, lValueOf2, Integer.valueOf(i6), Boolean.valueOf(z), Integer.valueOf(i2));
    }

    private void putMediaCountDatabase(final long j, final long j2, final int i, final int i2) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.m635$r8$lambda$ybmfllUcyEFQYrkGr73SJyGJSQ(this.f$0, j2, j, i, i2);
            }
        });
    }

    public static void m635$r8$lambda$ybmfllUcyEFQYrkGr73SJyGJSQ(MediaDataController mediaDataController, long j, long j2, int i, int i2) {
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast;
        int i3;
        mediaDataController.getClass();
        try {
            if (j != 0) {
                sQLitePreparedStatementExecuteFast = mediaDataController.getMessagesStorage().getDatabase().executeFast("REPLACE INTO media_counts_topics VALUES(?, ?, ?, ?, ?)");
            } else {
                sQLitePreparedStatementExecuteFast = mediaDataController.getMessagesStorage().getDatabase().executeFast("REPLACE INTO media_counts_v2 VALUES(?, ?, ?, ?)");
            }
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

    private void getMediaCountDatabase(final long j, final long j2, final int i, final int i2) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$yVciH6uTnuzmV3SbczvTftIIxWM(this.f$0, j2, j, i, i2);
            }
        });
    }

    public static void $r8$lambda$yVciH6uTnuzmV3SbczvTftIIxWM(MediaDataController mediaDataController, long j, long j2, int i, int i2) {
        SQLiteCursor sQLiteCursorQueryFinalized;
        int iIntValue;
        int iIntValue2;
        int i3;
        mediaDataController.getClass();
        try {
            if (j != 0) {
                sQLiteCursorQueryFinalized = mediaDataController.getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT count, old FROM media_counts_topics WHERE uid = %d AND topic_id = %d AND type = %d LIMIT 1", Long.valueOf(j2), Long.valueOf(j), Integer.valueOf(i)), new Object[0]);
            } else {
                sQLiteCursorQueryFinalized = mediaDataController.getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT count, old FROM media_counts_v2 WHERE uid = %d AND type = %d LIMIT 1", Long.valueOf(j2), Integer.valueOf(i)), new Object[0]);
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
                SQLiteCursor sQLiteCursorQueryFinalized2 = mediaDataController.getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT COUNT(mid) FROM media_v4 WHERE uid = %d AND type = %d LIMIT 1", Long.valueOf(j2), Integer.valueOf(i)), new Object[0]);
                if (sQLiteCursorQueryFinalized2.next()) {
                    iIntValue = sQLiteCursorQueryFinalized2.intValue(0);
                }
                i3 = iIntValue;
                sQLiteCursorQueryFinalized2.dispose();
                if (i3 != -1) {
                    mediaDataController.putMediaCountDatabase(j2, j, i, i3);
                }
            } else {
                i3 = iIntValue;
            }
            mediaDataController.processLoadedMediaCount(i3, j2, j, i, i2, true, iIntValue2);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    class AnonymousClass1 implements Runnable {
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

        AnonymousClass1(int i, long j, int i2, long j2, int i3, ReactionsLayoutInBubble.VisibleReaction visibleReaction, int i4, int i5, int i6, boolean z, int i7) {
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

        @Override
        public void run() throws Throwable {
            Runnable runnable;
            SQLiteCursor sQLiteCursorQueryFinalized;
            boolean z;
            boolean z2;
            boolean z3;
            HashSet<Long> hashSet;
            long j;
            long jLongValue;
            int i;
            TLRPC.TL_messages_messages tL_messages_messages;
            SQLiteCursor sQLiteCursorQueryFinalized2;
            ArrayList arrayList;
            int iIntValue;
            NativeByteBuffer nativeByteBufferByteBufferValue;
            NativeByteBuffer nativeByteBufferByteBufferValue2;
            long j2;
            TLRPC.Message messageTLdeserialize;
            long j3;
            TLRPC.TL_messages_messages tL_messages_messages2;
            long j4;
            String str;
            String str2;
            int i2;
            SQLiteCursor sQLiteCursorQueryFinalized3;
            int i3;
            SQLiteCursor sQLiteCursorQueryFinalized4;
            int iIntValue2;
            char c;
            int i4;
            SQLiteCursor sQLiteCursorQueryFinalized5;
            int iIntValue3;
            long jHashCode;
            int iIntValue4;
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast;
            int i5;
            long clientUserId = MediaDataController.this.getUserConfig().getClientUserId();
            TLRPC.TL_messages_messages tL_messages_messages3 = new TLRPC.TL_messages_messages();
            boolean z4 = false;
            try {
                try {
                    ArrayList<Long> arrayList2 = new ArrayList<>();
                    ArrayList arrayList3 = new ArrayList();
                    int i6 = this.val$count + 1;
                    SQLiteDatabase database = MediaDataController.this.getMessagesStorage().getDatabase();
                    if (!DialogObject.isEncryptedDialog(this.val$uid)) {
                        if (this.val$min_id == 0) {
                            SQLiteCursor sQLiteCursorQueryFinalized6 = this.val$topicId != 0 ? database.queryFinalized(String.format(Locale.US, "SELECT start FROM media_holes_topics WHERE uid = %d AND topic_id = %d AND type = %d AND start IN (0, 1)", Long.valueOf(this.val$uid), Long.valueOf(this.val$topicId), Integer.valueOf(this.val$type)), new Object[0]) : database.queryFinalized(String.format(Locale.US, "SELECT start FROM media_holes_v2 WHERE uid = %d AND type = %d AND start IN (0, 1)", Long.valueOf(this.val$uid), Integer.valueOf(this.val$type)), new Object[0]);
                            if (sQLiteCursorQueryFinalized6.next()) {
                                z = sQLiteCursorQueryFinalized6.intValue(0) == 1;
                                sQLiteCursorQueryFinalized6.dispose();
                            } else {
                                sQLiteCursorQueryFinalized6.dispose();
                                sQLiteCursorQueryFinalized6 = this.val$topicId != 0 ? database.queryFinalized(String.format(Locale.US, "SELECT min(mid) FROM media_topics WHERE uid = %d AND topic_id = %d AND type = %d AND mid > 0", Long.valueOf(this.val$uid), Long.valueOf(this.val$topicId), Integer.valueOf(this.val$type)), new Object[0]) : database.queryFinalized(String.format(Locale.US, "SELECT min(mid) FROM media_v4 WHERE uid = %d AND type = %d AND mid > 0", Long.valueOf(this.val$uid), Integer.valueOf(this.val$type)), new Object[0]);
                                if (sQLiteCursorQueryFinalized6.next() && (iIntValue4 = sQLiteCursorQueryFinalized6.intValue(0)) != 0) {
                                    if (this.val$topicId != 0) {
                                        sQLitePreparedStatementExecuteFast = database.executeFast("REPLACE INTO media_holes_topics VALUES(?, ?, ?, ?, ?)");
                                    } else {
                                        sQLitePreparedStatementExecuteFast = database.executeFast("REPLACE INTO media_holes_v2 VALUES(?, ?, ?, ?)");
                                    }
                                    sQLitePreparedStatementExecuteFast.requery();
                                    sQLitePreparedStatementExecuteFast.bindLong(1, this.val$uid);
                                    long j5 = this.val$topicId;
                                    if (j5 != 0) {
                                        sQLitePreparedStatementExecuteFast.bindLong(2, j5);
                                        i5 = 3;
                                    } else {
                                        i5 = 2;
                                    }
                                    sQLitePreparedStatementExecuteFast.bindInteger(i5, this.val$type);
                                    sQLitePreparedStatementExecuteFast.bindInteger(i5 + 1, 0);
                                    sQLitePreparedStatementExecuteFast.bindInteger(i5 + 2, iIntValue4);
                                    sQLitePreparedStatementExecuteFast.step();
                                    sQLitePreparedStatementExecuteFast.dispose();
                                }
                            }
                            sQLiteCursorQueryFinalized6.dispose();
                        } else {
                            clientUserId = clientUserId;
                            z = false;
                        }
                        ReactionsLayoutInBubble.VisibleReaction visibleReaction = this.val$tag;
                        if (visibleReaction == null) {
                            str = "";
                            str2 = "";
                        } else {
                            if (!TextUtils.isEmpty(visibleReaction.emojicon)) {
                                jHashCode = this.val$tag.emojicon.hashCode();
                            } else {
                                jHashCode = this.val$tag.documentId;
                            }
                            str = "INNER JOIN tag_message_id t ON m.mid = t.mid";
                            str2 = "t.tag = " + jHashCode + " AND";
                        }
                        if (this.val$max_id != 0) {
                            if (this.val$topicId != 0) {
                                c = 2;
                                sQLiteCursorQueryFinalized5 = database.queryFinalized(String.format(Locale.US, "SELECT start, end FROM media_holes_topics WHERE uid = %d AND topic_id = %d AND type = %d AND start <= %d ORDER BY end DESC LIMIT 1", Long.valueOf(this.val$uid), Long.valueOf(this.val$topicId), Integer.valueOf(this.val$type), Integer.valueOf(this.val$max_id)), new Object[0]);
                                i4 = 0;
                            } else {
                                c = 2;
                                i4 = 0;
                                sQLiteCursorQueryFinalized5 = database.queryFinalized(String.format(Locale.US, "SELECT start, end FROM media_holes_v2 WHERE uid = %d AND type = %d AND start <= %d ORDER BY end DESC LIMIT 1", Long.valueOf(this.val$uid), Integer.valueOf(this.val$type), Integer.valueOf(this.val$max_id)), new Object[0]);
                            }
                            if (sQLiteCursorQueryFinalized5.next()) {
                                sQLiteCursorQueryFinalized5.intValue(i4);
                                iIntValue3 = sQLiteCursorQueryFinalized5.intValue(1);
                            } else {
                                iIntValue3 = 0;
                            }
                            sQLiteCursorQueryFinalized5.dispose();
                            if (this.val$topicId != 0) {
                                if (iIntValue3 > 1) {
                                    Locale locale = Locale.US;
                                    Long lValueOf = Long.valueOf(this.val$uid);
                                    Long lValueOf2 = Long.valueOf(this.val$topicId);
                                    Integer numValueOf = Integer.valueOf(this.val$max_id);
                                    Integer numValueOf2 = Integer.valueOf(iIntValue3);
                                    Integer numValueOf3 = Integer.valueOf(this.val$type);
                                    Integer numValueOf4 = Integer.valueOf(i6);
                                    Object[] objArr = new Object[8];
                                    objArr[0] = str;
                                    objArr[1] = str2;
                                    objArr[c] = lValueOf;
                                    objArr[3] = lValueOf2;
                                    objArr[4] = numValueOf;
                                    objArr[5] = numValueOf2;
                                    objArr[6] = numValueOf3;
                                    objArr[7] = numValueOf4;
                                    sQLiteCursorQueryFinalized = database.queryFinalized(String.format(locale, "SELECT m.data, m.mid FROM media_topics m %s WHERE %s m.uid = %d AND m.topic_id = %d AND m.mid > 0 AND m.mid < %d AND m.mid >= %d AND m.type = %d ORDER BY m.date DESC, m.mid DESC LIMIT %d", objArr), new Object[0]);
                                    z2 = false;
                                } else {
                                    Locale locale2 = Locale.US;
                                    Long lValueOf3 = Long.valueOf(this.val$uid);
                                    Long lValueOf4 = Long.valueOf(this.val$topicId);
                                    Integer numValueOf5 = Integer.valueOf(this.val$max_id);
                                    Integer numValueOf6 = Integer.valueOf(this.val$type);
                                    Integer numValueOf7 = Integer.valueOf(i6);
                                    Object[] objArr2 = new Object[7];
                                    objArr2[0] = str;
                                    objArr2[1] = str2;
                                    objArr2[c] = lValueOf3;
                                    objArr2[3] = lValueOf4;
                                    objArr2[4] = numValueOf5;
                                    objArr2[5] = numValueOf6;
                                    objArr2[6] = numValueOf7;
                                    sQLiteCursorQueryFinalized = database.queryFinalized(String.format(locale2, "SELECT m.data, m.mid FROM media_topics m %s WHERE %s m.uid = %d AND m.topic_id = %d AND m.mid > 0 AND m.mid < %d AND m.type = %d ORDER BY m.date DESC, m.mid DESC LIMIT %d", objArr2), new Object[0]);
                                }
                            } else if (iIntValue3 > 1) {
                                Locale locale3 = Locale.US;
                                Long lValueOf5 = Long.valueOf(this.val$uid);
                                Integer numValueOf8 = Integer.valueOf(this.val$max_id);
                                Integer numValueOf9 = Integer.valueOf(iIntValue3);
                                Integer numValueOf10 = Integer.valueOf(this.val$type);
                                Integer numValueOf11 = Integer.valueOf(i6);
                                Object[] objArr3 = new Object[7];
                                objArr3[0] = str;
                                objArr3[1] = str2;
                                objArr3[c] = lValueOf5;
                                objArr3[3] = numValueOf8;
                                objArr3[4] = numValueOf9;
                                objArr3[5] = numValueOf10;
                                objArr3[6] = numValueOf11;
                                sQLiteCursorQueryFinalized = database.queryFinalized(String.format(locale3, "SELECT m.data, m.mid FROM media_v4 m %s WHERE %s m.uid = %d AND m.mid > 0 AND m.mid < %d AND m.mid >= %d AND m.type = %d ORDER BY m.date DESC, m.mid DESC LIMIT %d", objArr3), new Object[0]);
                                z2 = false;
                            } else {
                                Locale locale4 = Locale.US;
                                Long lValueOf6 = Long.valueOf(this.val$uid);
                                Integer numValueOf12 = Integer.valueOf(this.val$max_id);
                                Integer numValueOf13 = Integer.valueOf(this.val$type);
                                Integer numValueOf14 = Integer.valueOf(i6);
                                Object[] objArr4 = new Object[6];
                                objArr4[0] = str;
                                objArr4[1] = str2;
                                objArr4[c] = lValueOf6;
                                objArr4[3] = numValueOf12;
                                objArr4[4] = numValueOf13;
                                objArr4[5] = numValueOf14;
                                sQLiteCursorQueryFinalized = database.queryFinalized(String.format(locale4, "SELECT m.data, m.mid FROM media_v4 m %s WHERE %s m.uid = %d AND m.mid > 0 AND m.mid < %d AND m.type = %d ORDER BY m.date DESC, m.mid DESC LIMIT %d", objArr4), new Object[0]);
                            }
                            z3 = false;
                            if (this.val$tag != null) {
                                hashSet = new HashSet();
                            } else {
                                hashSet = null;
                            }
                            while (sQLiteCursorQueryFinalized.next()) {
                                nativeByteBufferByteBufferValue2 = sQLiteCursorQueryFinalized.byteBufferValue(0);
                                if (nativeByteBufferByteBufferValue2 != null) {
                                    messageTLdeserialize = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue2, nativeByteBufferByteBufferValue2.readInt32(false), false);
                                    j2 = clientUserId;
                                    messageTLdeserialize.readAttachPath(nativeByteBufferByteBufferValue2, j2);
                                    nativeByteBufferByteBufferValue2.reuse();
                                    messageTLdeserialize.id = sQLiteCursorQueryFinalized.intValue(1);
                                    ArrayList<Long> arrayList4 = arrayList2;
                                    j3 = this.val$uid;
                                    messageTLdeserialize.dialog_id = j3;
                                    if (DialogObject.isEncryptedDialog(j3)) {
                                        tL_messages_messages2 = tL_messages_messages3;
                                        try {
                                            messageTLdeserialize.random_id = sQLiteCursorQueryFinalized.longValue(2);
                                        } catch (Exception e) {
                                            e = e;
                                            tL_messages_messages3 = tL_messages_messages2;
                                            tL_messages_messages3.messages.clear();
                                            tL_messages_messages3.chats.clear();
                                            tL_messages_messages3.users.clear();
                                            FileLog.e(e);
                                            final int i7 = this.val$classGuid;
                                            runnable = new Runnable() {
                                                @Override
                                                public final void run() {
                                                    MediaDataController.this.getMessagesStorage().completeTaskForGuid(this, i7);
                                                }
                                            };
                                            AndroidUtilities.runOnUIThread(runnable);
                                            MediaDataController.this.processLoadedMedia(tL_messages_messages3, this.val$uid, this.val$count, this.val$max_id, this.val$min_id, this.val$type, this.val$topicId, this.val$fromCache, this.val$classGuid, this.val$isChannel, z4, this.val$requestIndex);
                                        } catch (Throwable th) {
                                            th = th;
                                            tL_messages_messages3 = tL_messages_messages2;
                                            final int i8 = this.val$classGuid;
                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                @Override
                                                public final void run() {
                                                    MediaDataController.this.getMessagesStorage().completeTaskForGuid(this, i8);
                                                }
                                            });
                                            MediaDataController.this.processLoadedMedia(tL_messages_messages3, this.val$uid, this.val$count, this.val$max_id, this.val$min_id, this.val$type, this.val$topicId, this.val$fromCache, this.val$classGuid, this.val$isChannel, false, this.val$requestIndex);
                                            throw th;
                                        }
                                    } else {
                                        tL_messages_messages2 = tL_messages_messages3;
                                    }
                                    j4 = messageTLdeserialize.grouped_id;
                                    if (j4 != 0 && hashSet != null) {
                                        hashSet.add(Long.valueOf(j4));
                                    }
                                    if (z3) {
                                        tL_messages_messages3 = tL_messages_messages2;
                                        tL_messages_messages3.messages.add(0, messageTLdeserialize);
                                    } else {
                                        tL_messages_messages3 = tL_messages_messages2;
                                        tL_messages_messages3.messages.add(messageTLdeserialize);
                                    }
                                    arrayList2 = arrayList4;
                                    MessagesStorage.addUsersAndChatsFromMessage(messageTLdeserialize, arrayList2, arrayList3, null);
                                } else {
                                    j2 = clientUserId;
                                }
                                clientUserId = j2;
                            }
                            j = clientUserId;
                            sQLiteCursorQueryFinalized.dispose();
                            if (this.val$tag != null && !hashSet.isEmpty()) {
                                for (Long l : hashSet) {
                                    jLongValue = l.longValue();
                                    i = 0;
                                    while (true) {
                                        if (i >= tL_messages_messages3.messages.size()) {
                                            tL_messages_messages = tL_messages_messages3;
                                            i = -1;
                                            break;
                                        }
                                        try {
                                            tL_messages_messages = tL_messages_messages3;
                                            try {
                                                if (tL_messages_messages3.messages.get(i).grouped_id == jLongValue) {
                                                    break;
                                                }
                                                i++;
                                                tL_messages_messages3 = tL_messages_messages;
                                            } catch (Exception e2) {
                                                e = e2;
                                                tL_messages_messages3 = tL_messages_messages;
                                                tL_messages_messages3.messages.clear();
                                                tL_messages_messages3.chats.clear();
                                                tL_messages_messages3.users.clear();
                                                FileLog.e(e);
                                                final int i9 = this.val$classGuid;
                                                runnable = new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        MediaDataController.this.getMessagesStorage().completeTaskForGuid(this, i9);
                                                    }
                                                };
                                                AndroidUtilities.runOnUIThread(runnable);
                                                MediaDataController.this.processLoadedMedia(tL_messages_messages3, this.val$uid, this.val$count, this.val$max_id, this.val$min_id, this.val$type, this.val$topicId, this.val$fromCache, this.val$classGuid, this.val$isChannel, z4, this.val$requestIndex);
                                            } catch (Throwable th2) {
                                                th = th2;
                                                tL_messages_messages3 = tL_messages_messages;
                                                final int i10 = this.val$classGuid;
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        MediaDataController.this.getMessagesStorage().completeTaskForGuid(this, i10);
                                                    }
                                                });
                                                MediaDataController.this.processLoadedMedia(tL_messages_messages3, this.val$uid, this.val$count, this.val$max_id, this.val$min_id, this.val$type, this.val$topicId, this.val$fromCache, this.val$classGuid, this.val$isChannel, false, this.val$requestIndex);
                                                throw th;
                                            }
                                        } catch (Exception e3) {
                                            e = e3;
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                    }
                                    if (i < 0) {
                                        tL_messages_messages3 = tL_messages_messages;
                                    } else {
                                        sQLiteCursorQueryFinalized2 = database.queryFinalized("SELECT data, mid FROM messages_v2 WHERE uid = ? AND group_id = ? ORDER BY mid DESC", Long.valueOf(this.val$uid), l);
                                        arrayList = new ArrayList();
                                        while (sQLiteCursorQueryFinalized2.next()) {
                                            iIntValue = sQLiteCursorQueryFinalized2.intValue(1);
                                            nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized2.byteBufferValue(0);
                                            if (nativeByteBufferByteBufferValue != null) {
                                                TLRPC.Message messageTLdeserialize2 = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                                                messageTLdeserialize2.readAttachPath(nativeByteBufferByteBufferValue, j);
                                                nativeByteBufferByteBufferValue.reuse();
                                                messageTLdeserialize2.id = iIntValue;
                                                messageTLdeserialize2.dialog_id = this.val$uid;
                                                arrayList.add(messageTLdeserialize2);
                                                MessagesStorage.addUsersAndChatsFromMessage(messageTLdeserialize2, arrayList2, arrayList3, null);
                                                j = j;
                                            }
                                        }
                                        long j6 = j;
                                        if (z3) {
                                            Collections.reverse(arrayList);
                                        }
                                        tL_messages_messages3 = tL_messages_messages;
                                        tL_messages_messages3.messages.remove(i);
                                        tL_messages_messages3.messages.addAll(i, arrayList);
                                        sQLiteCursorQueryFinalized2.dispose();
                                        j = j6;
                                    }
                                }
                            }
                            if (!arrayList2.isEmpty()) {
                                MediaDataController.this.getMessagesStorage().getUsersInternal(arrayList2, tL_messages_messages3.users);
                            }
                            if (!arrayList3.isEmpty()) {
                                MediaDataController.this.getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList3), tL_messages_messages3.chats);
                            }
                            if (tL_messages_messages3.messages.size() <= this.val$count && this.val$min_id == 0) {
                                ArrayList<TLRPC.Message> arrayList5 = tL_messages_messages3.messages;
                                arrayList5.remove(arrayList5.size() - 1);
                            } else if (this.val$min_id != 0) {
                                z4 = false;
                            } else {
                                z4 = z2;
                            }
                            final int i11 = this.val$classGuid;
                            runnable = new Runnable() {
                                @Override
                                public final void run() {
                                    MediaDataController.this.getMessagesStorage().completeTaskForGuid(this, i11);
                                }
                            };
                            AndroidUtilities.runOnUIThread(runnable);
                            MediaDataController.this.processLoadedMedia(tL_messages_messages3, this.val$uid, this.val$count, this.val$max_id, this.val$min_id, this.val$type, this.val$topicId, this.val$fromCache, this.val$classGuid, this.val$isChannel, z4, this.val$requestIndex);
                        }
                        String str3 = str;
                        z = z;
                        arrayList2 = arrayList2;
                        if (this.val$min_id != 0) {
                            if (this.val$topicId != 0) {
                                sQLiteCursorQueryFinalized4 = database.queryFinalized(String.format(Locale.US, "SELECT start, end FROM media_holes_topics WHERE uid = %d AND topic_id = %d AND type = %d AND end >= %d ORDER BY end ASC LIMIT 1", Long.valueOf(this.val$uid), Long.valueOf(this.val$topicId), Integer.valueOf(this.val$type), Integer.valueOf(this.val$min_id)), new Object[0]);
                                i3 = 0;
                            } else {
                                i3 = 0;
                                sQLiteCursorQueryFinalized4 = database.queryFinalized(String.format(Locale.US, "SELECT start, end FROM media_holes_v2 WHERE uid = %d AND type = %d AND end >= %d ORDER BY end ASC LIMIT 1", Long.valueOf(this.val$uid), Integer.valueOf(this.val$type), Integer.valueOf(this.val$min_id)), new Object[0]);
                            }
                            if (sQLiteCursorQueryFinalized4.next()) {
                                iIntValue2 = sQLiteCursorQueryFinalized4.intValue(i3);
                                sQLiteCursorQueryFinalized4.intValue(1);
                            } else {
                                iIntValue2 = 0;
                            }
                            sQLiteCursorQueryFinalized4.dispose();
                            if (this.val$topicId != 0) {
                                if (iIntValue2 > 1) {
                                    sQLiteCursorQueryFinalized = database.queryFinalized(String.format(Locale.US, "SELECT m.data, m.mid FROM media_topics m %s WHERE %s m.uid = %d AND m.topic_id = %d AND m.mid > 0 AND m.mid >= %d AND m.mid <= %d AND m.type = %d ORDER BY m.date ASC, m.mid ASC LIMIT %d", str3, str2, Long.valueOf(this.val$uid), Long.valueOf(this.val$topicId), Integer.valueOf(this.val$min_id), Integer.valueOf(iIntValue2), Integer.valueOf(this.val$type), Integer.valueOf(i6)), new Object[0]);
                                } else {
                                    sQLiteCursorQueryFinalized = database.queryFinalized(String.format(Locale.US, "SELECT m.data, m.mid FROM media_topics m %s WHERE %s m.uid = %d AND m.topic_id = %d AND m.mid > 0 AND m.mid >= %d AND m.type = %d ORDER BY m.date ASC, m.mid ASC LIMIT %d", str3, str2, Long.valueOf(this.val$uid), Long.valueOf(this.val$topicId), Integer.valueOf(this.val$min_id), Integer.valueOf(this.val$type), Integer.valueOf(i6)), new Object[0]);
                                    z = true;
                                }
                            } else if (iIntValue2 > 1) {
                                sQLiteCursorQueryFinalized = database.queryFinalized(String.format(Locale.US, "SELECT m.data, m.mid FROM media_v4 m %s WHERE %s m.uid = %d AND m.mid > 0 AND m.mid >= %d AND m.mid <= %d AND m.type = %d ORDER BY m.date ASC, m.mid ASC LIMIT %d", str3, str2, Long.valueOf(this.val$uid), Integer.valueOf(this.val$min_id), Integer.valueOf(iIntValue2), Integer.valueOf(this.val$type), Integer.valueOf(i6)), new Object[0]);
                            } else {
                                sQLiteCursorQueryFinalized = database.queryFinalized(String.format(Locale.US, "SELECT m.data, m.mid FROM media_v4 m %s WHERE %s m.uid = %d AND m.mid > 0 AND m.mid >= %d AND m.type = %d ORDER BY m.date ASC, m.mid ASC LIMIT %d", str3, str2, Long.valueOf(this.val$uid), Integer.valueOf(this.val$min_id), Integer.valueOf(this.val$type), Integer.valueOf(i6)), new Object[0]);
                                z = true;
                            }
                            z2 = z;
                            z3 = true;
                        } else {
                            if (this.val$topicId != 0) {
                                sQLiteCursorQueryFinalized3 = database.queryFinalized(String.format(Locale.US, "SELECT max(end) FROM media_holes_topics WHERE uid = %d AND topic_id = %d AND type = %d", Long.valueOf(this.val$uid), Long.valueOf(this.val$topicId), Integer.valueOf(this.val$type)), new Object[0]);
                                i2 = 0;
                            } else {
                                i2 = 0;
                                sQLiteCursorQueryFinalized3 = database.queryFinalized(String.format(Locale.US, "SELECT max(end) FROM media_holes_v2 WHERE uid = %d AND type = %d", Long.valueOf(this.val$uid), Integer.valueOf(this.val$type)), new Object[0]);
                            }
                            int iIntValue5 = sQLiteCursorQueryFinalized3.next() ? sQLiteCursorQueryFinalized3.intValue(i2) : 0;
                            sQLiteCursorQueryFinalized3.dispose();
                            sQLiteCursorQueryFinalized = this.val$topicId != 0 ? iIntValue5 > 1 ? database.queryFinalized(String.format(Locale.US, "SELECT m.data, m.mid FROM media_topics m %s WHERE %s m.uid = %d AND m.topic_id = %d AND m.mid >= %d AND m.type = %d ORDER BY m.date DESC, m.mid DESC LIMIT %d", str3, str2, Long.valueOf(this.val$uid), Long.valueOf(this.val$topicId), Integer.valueOf(iIntValue5), Integer.valueOf(this.val$type), Integer.valueOf(i6)), new Object[0]) : database.queryFinalized(String.format(Locale.US, "SELECT m.data, m.mid FROM media_topics m %s WHERE %s m.uid = %d AND m.topic_id = %d AND m.mid > 0 AND m.type = %d ORDER BY m.date DESC, m.mid DESC LIMIT %d", str3, str2, Long.valueOf(this.val$uid), Long.valueOf(this.val$topicId), Integer.valueOf(this.val$type), Integer.valueOf(i6)), new Object[0]) : iIntValue5 > 1 ? database.queryFinalized(String.format(Locale.US, "SELECT m.data, m.mid FROM media_v4 m %s WHERE %s m.uid = %d AND m.mid >= %d AND m.type = %d ORDER BY m.date DESC, m.mid DESC LIMIT %d", str3, str2, Long.valueOf(this.val$uid), Integer.valueOf(iIntValue5), Integer.valueOf(this.val$type), Integer.valueOf(i6)), new Object[0]) : database.queryFinalized(String.format(Locale.US, "SELECT m.data, m.mid FROM media_v4 m %s WHERE %s m.uid = %d AND m.mid > 0 AND m.type = %d ORDER BY m.date DESC, m.mid DESC LIMIT %d", str3, str2, Long.valueOf(this.val$uid), Integer.valueOf(this.val$type), Integer.valueOf(i6)), new Object[0]);
                        }
                        if (this.val$tag != null) {
                            hashSet = new HashSet();
                        } else {
                            hashSet = null;
                        }
                        while (sQLiteCursorQueryFinalized.next()) {
                            nativeByteBufferByteBufferValue2 = sQLiteCursorQueryFinalized.byteBufferValue(0);
                            if (nativeByteBufferByteBufferValue2 != null) {
                                messageTLdeserialize = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue2, nativeByteBufferByteBufferValue2.readInt32(false), false);
                                j2 = clientUserId;
                                messageTLdeserialize.readAttachPath(nativeByteBufferByteBufferValue2, j2);
                                nativeByteBufferByteBufferValue2.reuse();
                                messageTLdeserialize.id = sQLiteCursorQueryFinalized.intValue(1);
                                ArrayList<Long> arrayList6 = arrayList2;
                                j3 = this.val$uid;
                                messageTLdeserialize.dialog_id = j3;
                                if (DialogObject.isEncryptedDialog(j3)) {
                                    tL_messages_messages2 = tL_messages_messages3;
                                    messageTLdeserialize.random_id = sQLiteCursorQueryFinalized.longValue(2);
                                } else {
                                    tL_messages_messages2 = tL_messages_messages3;
                                }
                                j4 = messageTLdeserialize.grouped_id;
                                if (j4 != 0) {
                                    hashSet.add(Long.valueOf(j4));
                                }
                                if (z3) {
                                    tL_messages_messages3 = tL_messages_messages2;
                                    tL_messages_messages3.messages.add(0, messageTLdeserialize);
                                } else {
                                    tL_messages_messages3 = tL_messages_messages2;
                                    tL_messages_messages3.messages.add(messageTLdeserialize);
                                }
                                arrayList2 = arrayList6;
                                MessagesStorage.addUsersAndChatsFromMessage(messageTLdeserialize, arrayList2, arrayList3, null);
                            } else {
                                j2 = clientUserId;
                            }
                            clientUserId = j2;
                        }
                        j = clientUserId;
                        sQLiteCursorQueryFinalized.dispose();
                        if (this.val$tag != null) {
                            while (r0.hasNext()) {
                                jLongValue = l.longValue();
                                i = 0;
                                while (true) {
                                    if (i >= tL_messages_messages3.messages.size()) {
                                        tL_messages_messages = tL_messages_messages3;
                                        i = -1;
                                        break;
                                    }
                                    tL_messages_messages = tL_messages_messages3;
                                    if (tL_messages_messages3.messages.get(i).grouped_id == jLongValue) {
                                        break;
                                        break;
                                    } else {
                                        i++;
                                        tL_messages_messages3 = tL_messages_messages;
                                    }
                                }
                                if (i < 0) {
                                    tL_messages_messages3 = tL_messages_messages;
                                } else {
                                    sQLiteCursorQueryFinalized2 = database.queryFinalized("SELECT data, mid FROM messages_v2 WHERE uid = ? AND group_id = ? ORDER BY mid DESC", Long.valueOf(this.val$uid), l);
                                    arrayList = new ArrayList();
                                    while (sQLiteCursorQueryFinalized2.next()) {
                                        iIntValue = sQLiteCursorQueryFinalized2.intValue(1);
                                        nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized2.byteBufferValue(0);
                                        if (nativeByteBufferByteBufferValue != null) {
                                            TLRPC.Message messageTLdeserialize3 = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                                            messageTLdeserialize3.readAttachPath(nativeByteBufferByteBufferValue, j);
                                            nativeByteBufferByteBufferValue.reuse();
                                            messageTLdeserialize3.id = iIntValue;
                                            messageTLdeserialize3.dialog_id = this.val$uid;
                                            arrayList.add(messageTLdeserialize3);
                                            MessagesStorage.addUsersAndChatsFromMessage(messageTLdeserialize3, arrayList2, arrayList3, null);
                                            j = j;
                                        }
                                    }
                                    long j7 = j;
                                    if (z3) {
                                        Collections.reverse(arrayList);
                                    }
                                    tL_messages_messages3 = tL_messages_messages;
                                    tL_messages_messages3.messages.remove(i);
                                    tL_messages_messages3.messages.addAll(i, arrayList);
                                    sQLiteCursorQueryFinalized2.dispose();
                                    j = j7;
                                }
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            MediaDataController.this.getMessagesStorage().getUsersInternal(arrayList2, tL_messages_messages3.users);
                        }
                        if (!arrayList3.isEmpty()) {
                            MediaDataController.this.getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList3), tL_messages_messages3.chats);
                        }
                        if (tL_messages_messages3.messages.size() <= this.val$count) {
                            if (this.val$min_id != 0) {
                                z4 = false;
                            } else {
                                z4 = z2;
                            }
                        } else if (this.val$min_id != 0) {
                            z4 = false;
                        } else {
                            z4 = z2;
                        }
                        final int i12 = this.val$classGuid;
                        runnable = new Runnable() {
                            @Override
                            public final void run() {
                                MediaDataController.this.getMessagesStorage().completeTaskForGuid(this, i12);
                            }
                        };
                        AndroidUtilities.runOnUIThread(runnable);
                        MediaDataController.this.processLoadedMedia(tL_messages_messages3, this.val$uid, this.val$count, this.val$max_id, this.val$min_id, this.val$type, this.val$topicId, this.val$fromCache, this.val$classGuid, this.val$isChannel, z4, this.val$requestIndex);
                    }
                    clientUserId = clientUserId;
                    arrayList2 = arrayList2;
                    if (this.val$topicId != 0) {
                        if (this.val$max_id != 0) {
                            sQLiteCursorQueryFinalized = database.queryFinalized(String.format(Locale.US, "SELECT m.data, m.mid, r.random_id FROM media_topics as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = %d AND m.topic_id = %d AND m.mid > %d AND type = %d ORDER BY m.mid ASC LIMIT %d", Long.valueOf(this.val$uid), Long.valueOf(this.val$topicId), Integer.valueOf(this.val$max_id), Integer.valueOf(this.val$type), Integer.valueOf(i6)), new Object[0]);
                        } else {
                            sQLiteCursorQueryFinalized = this.val$min_id != 0 ? database.queryFinalized(String.format(Locale.US, "SELECT m.data, m.mid, r.random_id FROM media_topics as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = %d AND m.topic_id = %d AND m.mid < %d AND type = %d ORDER BY m.mid DESC LIMIT %d", Long.valueOf(this.val$uid), Long.valueOf(this.val$topicId), Integer.valueOf(this.val$min_id), Integer.valueOf(this.val$type), Integer.valueOf(i6)), new Object[0]) : database.queryFinalized(String.format(Locale.US, "SELECT m.data, m.mid, r.random_id FROM media_topics as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = %d AND m.topic_id = %d AND type = %d ORDER BY m.mid ASC LIMIT %d", Long.valueOf(this.val$uid), Long.valueOf(this.val$topicId), Integer.valueOf(this.val$type), Integer.valueOf(i6)), new Object[0]);
                        }
                    } else if (this.val$max_id != 0) {
                        sQLiteCursorQueryFinalized = database.queryFinalized(String.format(Locale.US, "SELECT m.data, m.mid, r.random_id FROM media_v4 as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = %d AND m.mid > %d AND type = %d ORDER BY m.mid ASC LIMIT %d", Long.valueOf(this.val$uid), Integer.valueOf(this.val$max_id), Integer.valueOf(this.val$type), Integer.valueOf(i6)), new Object[0]);
                    } else {
                        sQLiteCursorQueryFinalized = this.val$min_id != 0 ? database.queryFinalized(String.format(Locale.US, "SELECT m.data, m.mid, r.random_id FROM media_v4 as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = %d AND m.mid < %d AND type = %d ORDER BY m.mid DESC LIMIT %d", Long.valueOf(this.val$uid), Integer.valueOf(this.val$min_id), Integer.valueOf(this.val$type), Integer.valueOf(i6)), new Object[0]) : database.queryFinalized(String.format(Locale.US, "SELECT m.data, m.mid, r.random_id FROM media_v4 as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = %d AND type = %d ORDER BY m.mid ASC LIMIT %d", Long.valueOf(this.val$uid), Integer.valueOf(this.val$type), Integer.valueOf(i6)), new Object[0]);
                    }
                    z = true;
                    z2 = z;
                    z3 = false;
                    if (this.val$tag != null) {
                        hashSet = new HashSet();
                    } else {
                        hashSet = null;
                    }
                    while (sQLiteCursorQueryFinalized.next()) {
                        nativeByteBufferByteBufferValue2 = sQLiteCursorQueryFinalized.byteBufferValue(0);
                        if (nativeByteBufferByteBufferValue2 != null) {
                            messageTLdeserialize = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue2, nativeByteBufferByteBufferValue2.readInt32(false), false);
                            j2 = clientUserId;
                            messageTLdeserialize.readAttachPath(nativeByteBufferByteBufferValue2, j2);
                            nativeByteBufferByteBufferValue2.reuse();
                            messageTLdeserialize.id = sQLiteCursorQueryFinalized.intValue(1);
                            ArrayList<Long> arrayList7 = arrayList2;
                            j3 = this.val$uid;
                            messageTLdeserialize.dialog_id = j3;
                            if (DialogObject.isEncryptedDialog(j3)) {
                                tL_messages_messages2 = tL_messages_messages3;
                                messageTLdeserialize.random_id = sQLiteCursorQueryFinalized.longValue(2);
                            } else {
                                tL_messages_messages2 = tL_messages_messages3;
                            }
                            j4 = messageTLdeserialize.grouped_id;
                            if (j4 != 0) {
                                hashSet.add(Long.valueOf(j4));
                            }
                            if (z3) {
                                tL_messages_messages3 = tL_messages_messages2;
                                tL_messages_messages3.messages.add(0, messageTLdeserialize);
                            } else {
                                tL_messages_messages3 = tL_messages_messages2;
                                tL_messages_messages3.messages.add(messageTLdeserialize);
                            }
                            arrayList2 = arrayList7;
                            MessagesStorage.addUsersAndChatsFromMessage(messageTLdeserialize, arrayList2, arrayList3, null);
                        } else {
                            j2 = clientUserId;
                        }
                        clientUserId = j2;
                    }
                    j = clientUserId;
                    sQLiteCursorQueryFinalized.dispose();
                    if (this.val$tag != null) {
                        while (r0.hasNext()) {
                            jLongValue = l.longValue();
                            i = 0;
                            while (true) {
                                if (i >= tL_messages_messages3.messages.size()) {
                                    tL_messages_messages = tL_messages_messages3;
                                    i = -1;
                                    break;
                                }
                                tL_messages_messages = tL_messages_messages3;
                                if (tL_messages_messages3.messages.get(i).grouped_id == jLongValue) {
                                    break;
                                    break;
                                } else {
                                    i++;
                                    tL_messages_messages3 = tL_messages_messages;
                                }
                            }
                            if (i < 0) {
                                tL_messages_messages3 = tL_messages_messages;
                            } else {
                                sQLiteCursorQueryFinalized2 = database.queryFinalized("SELECT data, mid FROM messages_v2 WHERE uid = ? AND group_id = ? ORDER BY mid DESC", Long.valueOf(this.val$uid), l);
                                arrayList = new ArrayList();
                                while (sQLiteCursorQueryFinalized2.next()) {
                                    iIntValue = sQLiteCursorQueryFinalized2.intValue(1);
                                    nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized2.byteBufferValue(0);
                                    if (nativeByteBufferByteBufferValue != null) {
                                        TLRPC.Message messageTLdeserialize4 = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                                        messageTLdeserialize4.readAttachPath(nativeByteBufferByteBufferValue, j);
                                        nativeByteBufferByteBufferValue.reuse();
                                        messageTLdeserialize4.id = iIntValue;
                                        messageTLdeserialize4.dialog_id = this.val$uid;
                                        arrayList.add(messageTLdeserialize4);
                                        MessagesStorage.addUsersAndChatsFromMessage(messageTLdeserialize4, arrayList2, arrayList3, null);
                                        j = j;
                                    }
                                }
                                long j8 = j;
                                if (z3) {
                                    Collections.reverse(arrayList);
                                }
                                tL_messages_messages3 = tL_messages_messages;
                                tL_messages_messages3.messages.remove(i);
                                tL_messages_messages3.messages.addAll(i, arrayList);
                                sQLiteCursorQueryFinalized2.dispose();
                                j = j8;
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        MediaDataController.this.getMessagesStorage().getUsersInternal(arrayList2, tL_messages_messages3.users);
                    }
                    if (!arrayList3.isEmpty()) {
                        MediaDataController.this.getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList3), tL_messages_messages3.chats);
                    }
                    if (tL_messages_messages3.messages.size() <= this.val$count) {
                        if (this.val$min_id != 0) {
                            z4 = false;
                        } else {
                            z4 = z2;
                        }
                    } else if (this.val$min_id != 0) {
                        z4 = false;
                    } else {
                        z4 = z2;
                    }
                    final int i13 = this.val$classGuid;
                    runnable = new Runnable() {
                        @Override
                        public final void run() {
                            MediaDataController.this.getMessagesStorage().completeTaskForGuid(this, i13);
                        }
                    };
                } catch (Exception e4) {
                    e = e4;
                }
                AndroidUtilities.runOnUIThread(runnable);
                MediaDataController.this.processLoadedMedia(tL_messages_messages3, this.val$uid, this.val$count, this.val$max_id, this.val$min_id, this.val$type, this.val$topicId, this.val$fromCache, this.val$classGuid, this.val$isChannel, z4, this.val$requestIndex);
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    private void loadMediaDatabase(long j, int i, int i2, int i3, int i4, long j2, ReactionsLayoutInBubble.VisibleReaction visibleReaction, int i5, boolean z, int i6, int i7) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(i, j, i3, j2, i4, visibleReaction, i2, i5, i6, z, i7);
        MessagesStorage messagesStorage = getMessagesStorage();
        messagesStorage.getStorageQueue().postRunnable(anonymousClass1);
        messagesStorage.bindTaskToGuid(anonymousClass1, i5);
    }

    private void putMediaDatabase(final long j, final long j2, final int i, final ArrayList<TLRPC.Message> arrayList, final int i2, final int i3, final boolean z) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$me9FkPnccIg13Ibd1XU2Hyso5Ck(this.f$0, i3, arrayList, z, j, i2, i, j2);
            }
        });
    }

    public static void $r8$lambda$me9FkPnccIg13Ibd1XU2Hyso5Ck(MediaDataController mediaDataController, int i, ArrayList arrayList, boolean z, long j, int i2, int i3, long j2) {
        long j3;
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast;
        mediaDataController.getClass();
        if (i == 0) {
            try {
                if (arrayList.isEmpty() || z) {
                    j3 = j2;
                    mediaDataController.getMessagesStorage().doneHolesInMedia(j, i2, i3, j3);
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
        mediaDataController.getMessagesStorage().getDatabase().beginTransaction();
        if (j3 != 0) {
            sQLitePreparedStatementExecuteFast = mediaDataController.getMessagesStorage().getDatabase().executeFast("REPLACE INTO media_topics VALUES(?, ?, ?, ?, ?, ?)");
        } else {
            sQLitePreparedStatementExecuteFast = mediaDataController.getMessagesStorage().getDatabase().executeFast("REPLACE INTO media_v4 VALUES(?, ?, ?, ?, ?)");
        }
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
                mediaDataController.getMessagesStorage().closeHolesInMedia(j, i6, ((TLRPC.Message) arrayList.get(0)).id, i3, j3);
            } else if (i2 != 0) {
                mediaDataController.getMessagesStorage().closeHolesInMedia(j, i6, i2, i3, j2);
            } else {
                mediaDataController.getMessagesStorage().closeHolesInMedia(j, i6, Integer.MAX_VALUE, i3, j2);
            }
        }
        mediaDataController.getMessagesStorage().getDatabase().commitTransaction();
    }

    public void loadMusic(final long j, final long j2, final long j3) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$MhtLE7dPZyVcTTJ48Jxa_QquvvA(this.f$0, j, j2, j3);
            }
        });
    }

    public static void $r8$lambda$MhtLE7dPZyVcTTJ48Jxa_QquvvA(final MediaDataController mediaDataController, long j, long j2, long j3) {
        long j4;
        SQLiteCursor sQLiteCursorQueryFinalized;
        mediaDataController.getClass();
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (i < 2) {
            ArrayList arrayList3 = i == 0 ? arrayList : arrayList2;
            if (i == 0) {
                try {
                    if (!DialogObject.isEncryptedDialog(j)) {
                        sQLiteCursorQueryFinalized = mediaDataController.getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT data, mid FROM media_v4 WHERE uid = %d AND mid < %d AND type = %d ORDER BY date DESC, mid DESC LIMIT 1000", Long.valueOf(j), Long.valueOf(j2), 4), new Object[0]);
                    } else {
                        sQLiteCursorQueryFinalized = mediaDataController.getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT data, mid FROM media_v4 WHERE uid = %d AND mid > %d AND type = %d ORDER BY date DESC, mid DESC LIMIT 1000", Long.valueOf(j), Long.valueOf(j2), 4), new Object[0]);
                    }
                } catch (Exception e) {
                    e = e;
                    j4 = j;
                    FileLog.e(e);
                    final long j5 = j4;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.getNotificationCenter().postNotificationName(NotificationCenter.musicDidLoad, Long.valueOf(j5), arrayList, arrayList2);
                        }
                    });
                }
            } else if (!DialogObject.isEncryptedDialog(j)) {
                sQLiteCursorQueryFinalized = mediaDataController.getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT data, mid FROM media_v4 WHERE uid = %d AND mid > %d AND type = %d ORDER BY date DESC, mid DESC LIMIT 1000", Long.valueOf(j), Long.valueOf(j3), 4), new Object[0]);
            } else {
                sQLiteCursorQueryFinalized = mediaDataController.getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT data, mid FROM media_v4 WHERE uid = %d AND mid < %d AND type = %d ORDER BY date DESC, mid DESC LIMIT 1000", Long.valueOf(j), Long.valueOf(j3), 4), new Object[0]);
            }
            while (sQLiteCursorQueryFinalized.next()) {
                NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                if (nativeByteBufferByteBufferValue != null) {
                    TLRPC.Message messageTLdeserialize = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                    messageTLdeserialize.readAttachPath(nativeByteBufferByteBufferValue, mediaDataController.getUserConfig().clientUserId);
                    nativeByteBufferByteBufferValue.reuse();
                    if (MessageObject.isMusicMessage(messageTLdeserialize)) {
                        messageTLdeserialize.id = sQLiteCursorQueryFinalized.intValue(1);
                        j4 = j;
                        try {
                            messageTLdeserialize.dialog_id = j4;
                            arrayList3.add(0, new MessageObject(mediaDataController.currentAccount, messageTLdeserialize, false, true));
                        } catch (Exception e2) {
                            e = e2;
                            FileLog.e(e);
                            final long j6 = j4;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    this.f$0.getNotificationCenter().postNotificationName(NotificationCenter.musicDidLoad, Long.valueOf(j6), arrayList, arrayList2);
                                }
                            });
                        }
                    }
                }
            }
            sQLiteCursorQueryFinalized.dispose();
            i++;
        }
        j4 = j;
        final long j7 = j4;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.getNotificationCenter().postNotificationName(NotificationCenter.musicDidLoad, Long.valueOf(j7), arrayList, arrayList2);
            }
        });
    }

    public void buildShortcuts() {
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        int maxShortcutCountPerActivity = ShortcutManagerCompat.getMaxShortcutCountPerActivity(ApplicationLoader.applicationContext) - 2;
        if (maxShortcutCountPerActivity <= 0) {
            maxShortcutCountPerActivity = 5;
        }
        final ArrayList arrayList = new ArrayList();
        if (SharedConfig.passcodeHash.length() <= 0) {
            for (int i = 0; i < this.hints.size(); i++) {
                arrayList.add(this.hints.get(i));
                if (arrayList.size() == maxShortcutCountPerActivity - 2) {
                    break;
                }
            }
        }
        final boolean z = Build.VERSION.SDK_INT >= 30;
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.m617$r8$lambda$iYqQVM_YE_d7np1dGWuqylFGtA(this.f$0, z, arrayList);
            }
        });
    }

    public static void m617$r8$lambda$iYqQVM_YE_d7np1dGWuqylFGtA(MediaDataController mediaDataController, boolean z, ArrayList arrayList) {
        TLRPC.Chat chat;
        TLRPC.User user;
        int i;
        String name;
        TLRPC.FileLocation fileLocation;
        String str;
        Bitmap bitmap;
        ArrayList arrayList2 = arrayList;
        mediaDataController.getClass();
        try {
            int i2 = 0;
            if (SharedConfig.directShareHash == null) {
                SharedConfig.directShareHash = UUID.randomUUID().toString();
                ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putString("directShareHash2", SharedConfig.directShareHash).commit();
            }
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            if (z) {
                ShortcutManagerCompat.removeAllDynamicShortcuts(ApplicationLoader.applicationContext);
            } else {
                List dynamicShortcuts = ShortcutManagerCompat.getDynamicShortcuts(ApplicationLoader.applicationContext);
                if (dynamicShortcuts != null && !dynamicShortcuts.isEmpty()) {
                    arrayList4.add("compose");
                    for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                        arrayList4.add("did3_" + MessageObject.getPeerId(((TLRPC.TL_topPeer) arrayList2.get(i3)).peer));
                    }
                    for (int i4 = 0; i4 < dynamicShortcuts.size(); i4++) {
                        String id = ((ShortcutInfoCompat) dynamicShortcuts.get(i4)).getId();
                        if (!arrayList4.remove(id)) {
                            arrayList5.add(id);
                        }
                        arrayList3.add(id);
                    }
                    if (arrayList4.isEmpty() && arrayList5.isEmpty()) {
                        return;
                    }
                }
                if (!arrayList5.isEmpty()) {
                    ShortcutManagerCompat.removeDynamicShortcuts(ApplicationLoader.applicationContext, arrayList5);
                }
            }
            Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
            intent.setAction("new_dialog");
            ArrayList arrayList6 = new ArrayList();
            ShortcutInfoCompat.Builder builder = new ShortcutInfoCompat.Builder(ApplicationLoader.applicationContext, "compose");
            int i5 = R.string.NewConversationShortcut;
            ShortcutInfoCompat shortcutInfoCompatBuild = builder.setShortLabel(LocaleController.getString(i5)).setLongLabel(LocaleController.getString(i5)).setIcon(IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.shortcut_compose)).setRank(0).setIntent(intent).build();
            if (z) {
                ShortcutManagerCompat.pushDynamicShortcut(ApplicationLoader.applicationContext, shortcutInfoCompatBuild);
            } else {
                arrayList6.add(shortcutInfoCompatBuild);
                if (arrayList3.contains("compose")) {
                    ShortcutManagerCompat.updateShortcuts(ApplicationLoader.applicationContext, arrayList6);
                } else {
                    ShortcutManagerCompat.addDynamicShortcuts(ApplicationLoader.applicationContext, arrayList6);
                }
                arrayList6.clear();
            }
            boolean z2 = true;
            HashSet hashSet = new HashSet(1);
            hashSet.add(SHORTCUT_CATEGORY);
            while (i2 < arrayList2.size()) {
                Intent intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) OpenChatReceiver.class);
                long peerId = MessageObject.getPeerId(((TLRPC.TL_topPeer) arrayList2.get(i2)).peer);
                if (DialogObject.isUserDialog(peerId)) {
                    intent2.putExtra("userId", peerId);
                    user = mediaDataController.getMessagesController().getUser(Long.valueOf(peerId));
                    chat = null;
                } else {
                    long j = -peerId;
                    TLRPC.Chat chat2 = mediaDataController.getMessagesController().getChat(Long.valueOf(j));
                    intent2.putExtra("chatId", j);
                    chat = chat2;
                    user = null;
                }
                if ((user == null || UserObject.isDeleted(user)) && chat == null) {
                    i = i2;
                } else {
                    if (user != null) {
                        name = ContactsController.formatName(user.first_name, user.last_name);
                        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                        fileLocation = userProfilePhoto != null ? userProfilePhoto.photo_small : null;
                    } else {
                        String str2 = chat.title;
                        TLRPC.ChatPhoto chatPhoto = chat.photo;
                        if (chatPhoto != null) {
                            TLRPC.FileLocation fileLocation2 = chatPhoto.photo_small;
                            name = str2;
                            fileLocation = fileLocation2;
                        } else {
                            name = str2;
                        }
                    }
                    intent2.putExtra("currentAccount", mediaDataController.currentAccount);
                    intent2.setAction("com.tmessages.openchat" + peerId);
                    intent2.putExtra("dialogId", peerId);
                    intent2.putExtra("hash", SharedConfig.directShareHash);
                    intent2.addFlags(67108864);
                    if (fileLocation != null) {
                        try {
                            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(mediaDataController.getFileLoader().getPathToAttach(fileLocation, z2).toString());
                            if (bitmapDecodeFile != null) {
                                try {
                                    int iDp = AndroidUtilities.dp(48.0f);
                                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iDp, iDp, Bitmap.Config.ARGB_8888);
                                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                                    if (roundPaint == null) {
                                        roundPaint = new Paint(3);
                                        bitmapRect = new RectF();
                                        Paint paint = new Paint(1);
                                        erasePaint = paint;
                                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                                        Path path = new Path();
                                        roundPath = path;
                                        i = i2;
                                        str = name;
                                        try {
                                            path.addCircle(iDp / 2, iDp / 2, (iDp / 2) - AndroidUtilities.dp(2.0f), Path.Direction.CW);
                                            roundPath.toggleInverseFillType();
                                        } catch (Throwable th) {
                                            th = th;
                                            bitmap = bitmapDecodeFile;
                                            FileLog.e(th);
                                        }
                                    } else {
                                        i = i2;
                                        str = name;
                                    }
                                    bitmapRect.set(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f));
                                    canvas.drawBitmap(bitmapDecodeFile, (Rect) null, bitmapRect, roundPaint);
                                    canvas.drawPath(roundPath, erasePaint);
                                    try {
                                        canvas.setBitmap(null);
                                    } catch (Exception unused) {
                                    }
                                    bitmap = bitmapCreateBitmap;
                                } catch (Throwable th2) {
                                    th = th2;
                                    i = i2;
                                    str = name;
                                }
                            } else {
                                i = i2;
                                str = name;
                                bitmap = bitmapDecodeFile;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            i = i2;
                            str = name;
                            bitmap = null;
                        }
                    } else {
                        i = i2;
                        str = name;
                        bitmap = null;
                    }
                    String str3 = "did3_" + peerId;
                    String str4 = TextUtils.isEmpty(str) ? " " : str;
                    ShortcutInfoCompat.Builder intent3 = new ShortcutInfoCompat.Builder(ApplicationLoader.applicationContext, str3).setShortLabel(str4).setLongLabel(str4).setRank(i + 1).setIntent(intent2);
                    if (SharedConfig.directShare) {
                        intent3.setCategories(hashSet);
                    }
                    if (bitmap != null) {
                        intent3.setIcon(IconCompat.createWithBitmap(bitmap));
                    } else {
                        intent3.setIcon(IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.shortcut_user));
                    }
                    if (z) {
                        ShortcutManagerCompat.pushDynamicShortcut(ApplicationLoader.applicationContext, intent3.build());
                    } else {
                        arrayList6.add(intent3.build());
                        if (arrayList3.contains(str3)) {
                            ShortcutManagerCompat.updateShortcuts(ApplicationLoader.applicationContext, arrayList6);
                        } else {
                            ShortcutManagerCompat.addDynamicShortcuts(ApplicationLoader.applicationContext, arrayList6);
                        }
                        arrayList6.clear();
                    }
                }
                i2 = i + 1;
                arrayList2 = arrayList;
                z2 = true;
            }
        } catch (Throwable unused2) {
        }
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
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.m625$r8$lambda$smu7j_Umduq63_h1DKxAYKk2o(this.f$0);
                }
            });
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
        getConnectionsManager().sendRequestTyped(tL_contacts_getTopPeers, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                MediaDataController.m622$r8$lambda$nhwgAe55zi7hzIjsMSli_9TKeE(this.f$0, (TLRPC.contacts_TopPeers) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    public static void m625$r8$lambda$smu7j_Umduq63_h1DKxAYKk2o(final MediaDataController mediaDataController) {
        mediaDataController.getClass();
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        final ArrayList arrayList4 = new ArrayList();
        final ArrayList<TLRPC.User> arrayList5 = new ArrayList<>();
        final ArrayList<TLRPC.Chat> arrayList6 = new ArrayList<>();
        long clientUserId = mediaDataController.getUserConfig().getClientUserId();
        try {
            ArrayList<Long> arrayList7 = new ArrayList<>();
            ArrayList arrayList8 = new ArrayList();
            int i = 0;
            SQLiteCursor sQLiteCursorQueryFinalized = mediaDataController.getMessagesStorage().getDatabase().queryFinalized("SELECT did, type, rating FROM chat_hints WHERE 1 ORDER BY rating DESC", new Object[0]);
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
                mediaDataController.getMessagesStorage().getUsersInternal(arrayList7, arrayList5);
            }
            if (!arrayList8.isEmpty()) {
                mediaDataController.getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList8), arrayList6);
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.$r8$lambda$KoNQSm9DMNivtTdPk8aLJ3Lvhqo(this.f$0, arrayList5, arrayList6, arrayList, arrayList2, arrayList3, arrayList4);
                }
            });
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void $r8$lambda$KoNQSm9DMNivtTdPk8aLJ3Lvhqo(MediaDataController mediaDataController, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6) {
        mediaDataController.getMessagesController().putUsers(arrayList, true);
        mediaDataController.getMessagesController().putChats(arrayList2, true);
        mediaDataController.loading = false;
        mediaDataController.loaded = true;
        mediaDataController.hints = arrayList3;
        mediaDataController.inlineBots = arrayList4;
        mediaDataController.guestBots = arrayList5;
        mediaDataController.webapps = arrayList6;
        mediaDataController.buildShortcuts();
        mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.reloadHints, new Object[0]);
        mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.reloadInlineHints, new Object[0]);
        mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.reloadGuestBotHints, new Object[0]);
        mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.reloadWebappsHints, new Object[0]);
        if (Math.abs(mediaDataController.getUserConfig().lastHintsSyncTime - ((int) (System.currentTimeMillis() / 1000))) >= 86400 || BuildVars.DEBUG_PRIVATE_VERSION) {
            mediaDataController.loadHints(false);
        }
    }

    public static void m622$r8$lambda$nhwgAe55zi7hzIjsMSli_9TKeE(final MediaDataController mediaDataController, TLRPC.contacts_TopPeers contacts_toppeers, TLRPC.TL_error tL_error) {
        mediaDataController.getClass();
        if (contacts_toppeers instanceof TLRPC.TL_contacts_topPeers) {
            final TLRPC.TL_contacts_topPeers tL_contacts_topPeers = (TLRPC.TL_contacts_topPeers) contacts_toppeers;
            mediaDataController.getMessagesController().putUsers(tL_contacts_topPeers.users, false);
            mediaDataController.getMessagesController().putChats(tL_contacts_topPeers.chats, false);
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            for (int i = 0; i < tL_contacts_topPeers.categories.size(); i++) {
                TLRPC.TL_topPeerCategoryPeers tL_topPeerCategoryPeers = tL_contacts_topPeers.categories.get(i);
                TLRPC.TopPeerCategory topPeerCategory = tL_topPeerCategoryPeers.category;
                if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsInline) {
                    mediaDataController.inlineBots = tL_topPeerCategoryPeers.peers;
                    mediaDataController.getUserConfig().botRatingLoadTime = iCurrentTimeMillis;
                } else if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsApp) {
                    mediaDataController.webapps = tL_topPeerCategoryPeers.peers;
                    mediaDataController.getUserConfig().webappRatingLoadTime = iCurrentTimeMillis;
                } else if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsGuestChat) {
                    mediaDataController.guestBots = tL_topPeerCategoryPeers.peers;
                    mediaDataController.getUserConfig().botGuestRatingLoadTime = iCurrentTimeMillis;
                } else {
                    mediaDataController.hints = tL_topPeerCategoryPeers.peers;
                    long clientUserId = mediaDataController.getUserConfig().getClientUserId();
                    for (int i2 = 0; i2 < mediaDataController.hints.size(); i2++) {
                        if (mediaDataController.hints.get(i2).peer.user_id == clientUserId) {
                            mediaDataController.hints.remove(i2);
                            break;
                        }
                    }
                    mediaDataController.getUserConfig().ratingLoadTime = (int) (System.currentTimeMillis() / 1000);
                }
            }
            mediaDataController.getUserConfig().saveConfig(false);
            mediaDataController.buildShortcuts();
            mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.reloadHints, new Object[0]);
            mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.reloadInlineHints, new Object[0]);
            mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.reloadGuestBotHints, new Object[0]);
            mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.reloadWebappsHints, new Object[0]);
            mediaDataController.getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.m592$r8$lambda$PIkywOIEy2JF_om3poac4PBOw8(this.f$0, tL_contacts_topPeers);
                }
            });
            return;
        }
        if (contacts_toppeers instanceof TLRPC.TL_contacts_topPeersDisabled) {
            mediaDataController.getUserConfig().suggestContacts = false;
            mediaDataController.getUserConfig().lastHintsSyncTime = (int) (System.currentTimeMillis() / 1000);
            mediaDataController.getUserConfig().saveConfig(false);
            mediaDataController.clearTopPeers();
        }
    }

    public static void m592$r8$lambda$PIkywOIEy2JF_om3poac4PBOw8(final MediaDataController mediaDataController, TLRPC.TL_contacts_topPeers tL_contacts_topPeers) {
        int i;
        mediaDataController.getClass();
        try {
            mediaDataController.getMessagesStorage().getDatabase().executeFast("DELETE FROM chat_hints WHERE 1").stepThis().dispose();
            mediaDataController.getMessagesStorage().getDatabase().beginTransaction();
            mediaDataController.getMessagesStorage().putUsersAndChats(tL_contacts_topPeers.users, tL_contacts_topPeers.chats, false, false);
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = mediaDataController.getMessagesStorage().getDatabase().executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
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
            mediaDataController.getMessagesStorage().getDatabase().commitTransaction();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.$r8$lambda$7ZiF9YVFS3RKUv6DNVTYNm1dqDI(this.f$0);
                }
            });
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void $r8$lambda$7ZiF9YVFS3RKUv6DNVTYNm1dqDI(MediaDataController mediaDataController) {
        mediaDataController.getUserConfig().suggestContacts = true;
        mediaDataController.getUserConfig().lastHintsSyncTime = (int) (System.currentTimeMillis() / 1000);
        mediaDataController.getUserConfig().saveConfig(false);
    }

    public void clearTopPeers() {
        this.hints.clear();
        this.inlineBots.clear();
        this.guestBots.clear();
        this.webapps.clear();
        getNotificationCenter().postNotificationName(NotificationCenter.reloadHints, new Object[0]);
        getNotificationCenter().postNotificationName(NotificationCenter.reloadInlineHints, new Object[0]);
        getNotificationCenter().postNotificationName(NotificationCenter.reloadGuestBotHints, new Object[0]);
        getNotificationCenter().postNotificationName(NotificationCenter.reloadWebappsHints, new Object[0]);
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$6X08zHEkyI1twF0wWlkcvUBxNvI(this.f$0);
            }
        });
        buildShortcuts();
    }

    public static void $r8$lambda$6X08zHEkyI1twF0wWlkcvUBxNvI(MediaDataController mediaDataController) {
        mediaDataController.getClass();
        try {
            mediaDataController.getMessagesStorage().getDatabase().executeFast("DELETE FROM chat_hints WHERE 1").stepThis().dispose();
        } catch (Exception unused) {
        }
    }

    public void increaseInlineRating(long j) {
        increaseInlineRating(j, false);
    }

    public void increaseGuestRating(long j) {
        increaseInlineRating(j, true);
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
            tL_topPeer.rating += Math.exp(iMax / getMessagesController().ratingDecay);
            Collections.sort(arrayList, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    return MediaDataController.m584$r8$lambda$K6djVuykOrNKJEJ5kUX1QnWibs((TLRPC.TL_topPeer) obj, (TLRPC.TL_topPeer) obj2);
                }
            });
            if (arrayList.size() > 20) {
                arrayList.remove(arrayList.size() - 1);
            }
            savePeer(j, z ? 3 : 1, tL_topPeer.rating);
            getNotificationCenter().postNotificationName(z ? NotificationCenter.reloadGuestBotHints : NotificationCenter.reloadInlineHints, new Object[0]);
        }
    }

    public static int m584$r8$lambda$K6djVuykOrNKJEJ5kUX1QnWibs(TLRPC.TL_topPeer tL_topPeer, TLRPC.TL_topPeer tL_topPeer2) {
        double d = tL_topPeer.rating;
        double d2 = tL_topPeer2.rating;
        if (d > d2) {
            return -1;
        }
        return d < d2 ? 1 : 0;
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
        tL_topPeer.rating += Math.exp(iMax / getMessagesController().ratingDecay);
        Collections.sort(this.webapps, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return MediaDataController.$r8$lambda$kSKwpjQQ5KmFOeCNUO5vxTNqdBc((TLRPC.TL_topPeer) obj, (TLRPC.TL_topPeer) obj2);
            }
        });
        if (this.webapps.size() > 20) {
            ArrayList<TLRPC.TL_topPeer> arrayList = this.webapps;
            arrayList.remove(arrayList.size() - 1);
        }
        savePeer(j, 2, tL_topPeer.rating);
        getNotificationCenter().postNotificationName(NotificationCenter.reloadWebappsHints, new Object[0]);
    }

    public static int $r8$lambda$kSKwpjQQ5KmFOeCNUO5vxTNqdBc(TLRPC.TL_topPeer tL_topPeer, TLRPC.TL_topPeer tL_topPeer2) {
        double d = tL_topPeer.rating;
        double d2 = tL_topPeer2.rating;
        if (d > d2) {
            return -1;
        }
        return d < d2 ? 1 : 0;
    }

    public void removeInline(long j) {
        removeInline(j, false);
    }

    private void removeInline(long j, boolean z) {
        ArrayList<TLRPC.TL_topPeer> arrayList = z ? this.guestBots : this.inlineBots;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).peer.user_id == j) {
                arrayList.remove(i);
                TLRPC.TL_contacts_resetTopPeerRating tL_contacts_resetTopPeerRating = new TLRPC.TL_contacts_resetTopPeerRating();
                tL_contacts_resetTopPeerRating.category = new TLRPC.TL_topPeerCategoryBotsInline();
                tL_contacts_resetTopPeerRating.peer = getMessagesController().getInputPeer(j);
                getConnectionsManager().sendRequest(tL_contacts_resetTopPeerRating, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        MediaDataController.$r8$lambda$GFwA78Z9KdSq6_qTzY0lgeP0Eww(tLObject, tL_error);
                    }
                });
                deletePeer(j, z ? 3 : 1);
                getNotificationCenter().postNotificationName(z ? NotificationCenter.reloadGuestBotHints : NotificationCenter.reloadInlineHints, new Object[0]);
                return;
            }
        }
    }

    public void removeWebapp(long j) {
        for (int i = 0; i < this.webapps.size(); i++) {
            if (this.webapps.get(i).peer.user_id == j) {
                this.webapps.remove(i);
                TLRPC.TL_contacts_resetTopPeerRating tL_contacts_resetTopPeerRating = new TLRPC.TL_contacts_resetTopPeerRating();
                tL_contacts_resetTopPeerRating.category = new TLRPC.TL_topPeerCategoryBotsApp();
                tL_contacts_resetTopPeerRating.peer = getMessagesController().getInputPeer(j);
                getConnectionsManager().sendRequest(tL_contacts_resetTopPeerRating, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        MediaDataController.$r8$lambda$3c4IKv_kjnKV_i5Kp518Fs2MndI(tLObject, tL_error);
                    }
                });
                deletePeer(j, 2);
                getNotificationCenter().postNotificationName(NotificationCenter.reloadWebappsHints, new Object[0]);
                return;
            }
        }
    }

    public boolean containsTopPeer(long j) {
        for (int i = 0; i < this.hints.size(); i++) {
            if (DialogObject.getPeerDialogId(this.hints.get(i).peer) == j) {
                return true;
            }
        }
        return false;
    }

    public void removePeer(long j) {
        for (int i = 0; i < this.hints.size(); i++) {
            if (this.hints.get(i).peer.user_id == j) {
                this.hints.remove(i);
                getNotificationCenter().postNotificationName(NotificationCenter.reloadHints, new Object[0]);
                TLRPC.TL_contacts_resetTopPeerRating tL_contacts_resetTopPeerRating = new TLRPC.TL_contacts_resetTopPeerRating();
                tL_contacts_resetTopPeerRating.category = new TLRPC.TL_topPeerCategoryCorrespondents();
                tL_contacts_resetTopPeerRating.peer = getMessagesController().getInputPeer(j);
                deletePeer(j, 0);
                getConnectionsManager().sendRequest(tL_contacts_resetTopPeerRating, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        MediaDataController.m561$r8$lambda$1i52D86dq99dx6LmalH62SgUVo(tLObject, tL_error);
                    }
                });
                return;
            }
        }
    }

    public void increasePeerRaiting(final long j) {
        TLRPC.User user;
        if (!getUserConfig().suggestContacts || !DialogObject.isUserDialog(j) || (user = getMessagesController().getUser(Long.valueOf(j))) == null || user.bot || user.self) {
            return;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$lzO0GKm4jJ7YyVNp8e6ADXtp2Ek(this.f$0, j);
            }
        });
    }

    public static void $r8$lambda$lzO0GKm4jJ7YyVNp8e6ADXtp2Ek(final MediaDataController mediaDataController, final long j) {
        double d;
        int iIntValue;
        int iIntValue2 = 0;
        mediaDataController.getClass();
        try {
            SQLiteCursor sQLiteCursorQueryFinalized = mediaDataController.getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT MAX(mid), MAX(date) FROM messages_v2 WHERE uid = %d AND out = 1", Long.valueOf(j)), new Object[0]);
            if (sQLiteCursorQueryFinalized.next()) {
                iIntValue2 = sQLiteCursorQueryFinalized.intValue(0);
                iIntValue = sQLiteCursorQueryFinalized.intValue(1);
            } else {
                iIntValue = 0;
            }
            sQLiteCursorQueryFinalized.dispose();
            d = (iIntValue2 <= 0 || mediaDataController.getUserConfig().ratingLoadTime == 0) ? 0.0d : iIntValue - mediaDataController.getUserConfig().ratingLoadTime;
        } catch (Exception e) {
            FileLog.e(e);
        }
        final double d2 = d;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$TtpHuxnB8V3fk1DxUTu04cpZ_wE(this.f$0, j, d2);
            }
        });
    }

    public static void $r8$lambda$TtpHuxnB8V3fk1DxUTu04cpZ_wE(MediaDataController mediaDataController, long j, double d) {
        TLRPC.TL_topPeer tL_topPeer;
        int i = 0;
        while (true) {
            if (i >= mediaDataController.hints.size()) {
                tL_topPeer = null;
                break;
            }
            tL_topPeer = mediaDataController.hints.get(i);
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
            mediaDataController.hints.add(tL_topPeer);
        }
        tL_topPeer.rating += Math.exp(d / ((double) mediaDataController.getMessagesController().ratingDecay));
        Collections.sort(mediaDataController.hints, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return MediaDataController.m633$r8$lambda$xflpktfs4spSEqmAa4GyPbofU4((TLRPC.TL_topPeer) obj, (TLRPC.TL_topPeer) obj2);
            }
        });
        mediaDataController.savePeer(j, 0, tL_topPeer.rating);
        mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.reloadHints, new Object[0]);
    }

    public static int m633$r8$lambda$xflpktfs4spSEqmAa4GyPbofU4(TLRPC.TL_topPeer tL_topPeer, TLRPC.TL_topPeer tL_topPeer2) {
        double d = tL_topPeer.rating;
        double d2 = tL_topPeer2.rating;
        if (d > d2) {
            return -1;
        }
        return d < d2 ? 1 : 0;
    }

    private void savePeer(final long j, final int i, final double d) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$ARK8j7wKYURw7KMsIKjHAvk6Wl8(this.f$0, j, i, d);
            }
        });
    }

    public static void $r8$lambda$ARK8j7wKYURw7KMsIKjHAvk6Wl8(MediaDataController mediaDataController, long j, int i, double d) {
        mediaDataController.getClass();
        try {
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = mediaDataController.getMessagesStorage().getDatabase().executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
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

    private void deletePeer(final long j, final int i) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.m621$r8$lambda$nABbPAr0ZPK9vkrLZMwUP432Fg(this.f$0, j, i);
            }
        });
    }

    public static void m621$r8$lambda$nABbPAr0ZPK9vkrLZMwUP432Fg(MediaDataController mediaDataController, long j, int i) {
        mediaDataController.getClass();
        try {
            mediaDataController.getMessagesStorage().getDatabase().executeFast(String.format(Locale.US, "DELETE FROM chat_hints WHERE did = %d AND type = %d", Long.valueOf(j), Integer.valueOf(i))).stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
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

    public void installShortcut(long j, int i) {
        installShortcut(j, i, null);
    }

    public void installShortcut(long j, int i, Utilities.Callback<Boolean> callback) {
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.User user2;
        String name;
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.FileLocation fileLocation;
        boolean z;
        PendingIntent pendingIntent;
        Bitmap bitmapDecodeFile;
        int iDp;
        Canvas canvas;
        Bitmap bitmap;
        AvatarDrawable avatarDrawable;
        Intent intent;
        String str;
        ShortcutInfoCompat.Builder intent2;
        PendingIntent broadcast;
        IntentSender intentSender;
        TLRPC.UserProfilePhoto userProfilePhoto;
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
            if (DialogObject.isEncryptedDialog(j)) {
                TLRPC.EncryptedChat encryptedChat = getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(j)));
                if (encryptedChat == null) {
                    if (callback != null) {
                        callback.run(Boolean.FALSE);
                        return;
                    }
                    return;
                }
                user2 = getMessagesController().getUser(Long.valueOf(encryptedChat.user_id));
            } else {
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
                    if (i == SHORTCUT_TYPE_ATTACHED_BOT) {
                        name = UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j)));
                        userProfilePhoto2 = user.photo;
                        if (userProfilePhoto2 != null) {
                            fileLocation = userProfilePhoto2.photo_small;
                        } else {
                            fileLocation = null;
                        }
                        z = false;
                    } else {
                        if (UserObject.isReplyUser(user)) {
                            name = LocaleController.getString(R.string.RepliesTitle);
                        } else if (UserObject.isUserSelf(user)) {
                            name = LocaleController.getString(R.string.SavedMessages);
                        } else {
                            name = ContactsController.formatName(user.first_name, user.last_name);
                            userProfilePhoto = user.photo;
                            if (userProfilePhoto != null) {
                                fileLocation = userProfilePhoto.photo_small;
                            } else {
                                fileLocation = null;
                            }
                            z = false;
                        }
                        fileLocation = null;
                        z = true;
                    }
                } else {
                    name = chat.title;
                    chatPhoto = chat.photo;
                    if (chatPhoto != null) {
                        fileLocation = chatPhoto.photo_small;
                    } else {
                        fileLocation = null;
                    }
                    z = false;
                }
                if (z && fileLocation == null) {
                    pendingIntent = null;
                    bitmapDecodeFile = null;
                } else {
                    if (z) {
                        bitmapDecodeFile = null;
                    } else {
                        try {
                            bitmapDecodeFile = BitmapFactory.decodeFile(getFileLoader().getPathToAttach(fileLocation, true).toString());
                        } catch (Throwable th) {
                            th = th;
                            pendingIntent = null;
                            bitmapDecodeFile = null;
                            FileLog.e(th);
                            if (Build.VERSION.SDK_INT >= 26) {
                                if (i == SHORTCUT_TYPE_USER_OR_CHAT) {
                                    str = "sdid_";
                                } else {
                                    str = "bdid_";
                                }
                                intent2 = new ShortcutInfoCompat.Builder(ApplicationLoader.applicationContext, str + j).setShortLabel(name).setIntent(intentCreateIntrnalShortcutIntent);
                                if (bitmapDecodeFile != null) {
                                    intent2.setIcon(IconCompat.createWithBitmap(bitmapDecodeFile));
                                } else if (user != null) {
                                    if (user.bot) {
                                        intent2.setIcon(IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.book_bot));
                                    } else {
                                        intent2.setIcon(IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.book_user));
                                    }
                                } else if (!ChatObject.isChannel(chat)) {
                                    intent2.setIcon(IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.book_group));
                                } else {
                                    intent2.setIcon(IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.book_group));
                                }
                                if (callback != null) {
                                    byte[] bArr = new byte[16];
                                    Utilities.fastRandom.nextBytes(bArr);
                                    String strBytesToHex = Utilities.bytesToHex(bArr);
                                    Intent intent3 = new Intent(ApplicationLoader.applicationContext, (Class<?>) ShortcutResultReceiver.class);
                                    intent3.putExtra("account", this.currentAccount);
                                    intent3.putExtra("req_id", strBytesToHex);
                                    broadcast = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, intent3, 167772160);
                                    this.shortcutCallbacks.put(strBytesToHex, callback);
                                } else {
                                    broadcast = pendingIntent;
                                }
                                Context context = ApplicationLoader.applicationContext;
                                ShortcutInfoCompat shortcutInfoCompatBuild = intent2.build();
                                if (broadcast == null) {
                                    intentSender = pendingIntent;
                                } else {
                                    intentSender = broadcast.getIntentSender();
                                }
                                ShortcutManagerCompat.requestPinShortcut(context, shortcutInfoCompatBuild, intentSender);
                                return;
                            }
                            intent = new Intent();
                            if (bitmapDecodeFile != null) {
                                intent.putExtra("android.intent.extra.shortcut.ICON", bitmapDecodeFile);
                            } else if (user != null) {
                                if (user.bot) {
                                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.applicationContext, R.drawable.book_bot));
                                } else {
                                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.applicationContext, R.drawable.book_user));
                                }
                            } else if (!ChatObject.isChannel(chat)) {
                                intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.applicationContext, R.drawable.book_group));
                            } else {
                                intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.applicationContext, R.drawable.book_group));
                            }
                            intent.putExtra("android.intent.extra.shortcut.INTENT", intentCreateIntrnalShortcutIntent);
                            intent.putExtra("android.intent.extra.shortcut.NAME", name);
                            intent.putExtra("duplicate", false);
                            intent.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
                            ApplicationLoader.applicationContext.sendBroadcast(intent);
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
                                    bitmap = bitmapDecodeFile;
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
                                    bitmap = bitmapDecodeFile;
                                    try {
                                        bitmapRect.set(0.0f, 0.0f, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight());
                                        canvas.drawRoundRect(bitmapRect, bitmap.getWidth(), bitmap.getHeight(), roundPaint);
                                        canvas.restore();
                                    } catch (Throwable th2) {
                                        th = th2;
                                        pendingIntent = null;
                                        bitmapDecodeFile = bitmap;
                                        FileLog.e(th);
                                        if (Build.VERSION.SDK_INT >= 26) {
                                            if (i == SHORTCUT_TYPE_USER_OR_CHAT) {
                                                str = "sdid_";
                                            } else {
                                                str = "bdid_";
                                            }
                                            intent2 = new ShortcutInfoCompat.Builder(ApplicationLoader.applicationContext, str + j).setShortLabel(name).setIntent(intentCreateIntrnalShortcutIntent);
                                            if (bitmapDecodeFile != null) {
                                                intent2.setIcon(IconCompat.createWithBitmap(bitmapDecodeFile));
                                            } else if (user != null) {
                                                if (user.bot) {
                                                    intent2.setIcon(IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.book_bot));
                                                } else {
                                                    intent2.setIcon(IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.book_user));
                                                }
                                            } else if (!ChatObject.isChannel(chat)) {
                                                intent2.setIcon(IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.book_group));
                                            } else {
                                                intent2.setIcon(IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.book_group));
                                            }
                                            if (callback != null) {
                                                byte[] bArr2 = new byte[16];
                                                Utilities.fastRandom.nextBytes(bArr2);
                                                String strBytesToHex2 = Utilities.bytesToHex(bArr2);
                                                Intent intent4 = new Intent(ApplicationLoader.applicationContext, (Class<?>) ShortcutResultReceiver.class);
                                                intent4.putExtra("account", this.currentAccount);
                                                intent4.putExtra("req_id", strBytesToHex2);
                                                broadcast = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, intent4, 167772160);
                                                this.shortcutCallbacks.put(strBytesToHex2, callback);
                                            } else {
                                                broadcast = pendingIntent;
                                            }
                                            Context context2 = ApplicationLoader.applicationContext;
                                            ShortcutInfoCompat shortcutInfoCompatBuild2 = intent2.build();
                                            if (broadcast == null) {
                                                intentSender = pendingIntent;
                                            } else {
                                                intentSender = broadcast.getIntentSender();
                                            }
                                            ShortcutManagerCompat.requestPinShortcut(context2, shortcutInfoCompatBuild2, intentSender);
                                            return;
                                        }
                                        intent = new Intent();
                                        if (bitmapDecodeFile != null) {
                                            intent.putExtra("android.intent.extra.shortcut.ICON", bitmapDecodeFile);
                                        } else if (user != null) {
                                            if (user.bot) {
                                                intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.applicationContext, R.drawable.book_bot));
                                            } else {
                                                intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.applicationContext, R.drawable.book_user));
                                            }
                                        } else if (!ChatObject.isChannel(chat)) {
                                            intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.applicationContext, R.drawable.book_group));
                                        } else {
                                            intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.applicationContext, R.drawable.book_group));
                                        }
                                        intent.putExtra("android.intent.extra.shortcut.INTENT", intentCreateIntrnalShortcutIntent);
                                        intent.putExtra("android.intent.extra.shortcut.NAME", name);
                                        intent.putExtra("duplicate", false);
                                        intent.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
                                        ApplicationLoader.applicationContext.sendBroadcast(intent);
                                    }
                                }
                                Drawable drawable = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.book_logo);
                                int iDp2 = AndroidUtilities.dp(15.0f);
                                int i2 = iDp - iDp2;
                                int iDp3 = i2 - AndroidUtilities.dp(2.0f);
                                int iDp4 = i2 - AndroidUtilities.dp(2.0f);
                                drawable.setBounds(iDp3, iDp4, iDp3 + iDp2, iDp2 + iDp4);
                                drawable.draw(canvas);
                                pendingIntent = null;
                                try {
                                    canvas.setBitmap(null);
                                } catch (Exception unused) {
                                } catch (Throwable th3) {
                                    th = th3;
                                    bitmapDecodeFile = bitmap;
                                    FileLog.e(th);
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        if (i == SHORTCUT_TYPE_USER_OR_CHAT) {
                                            str = "sdid_";
                                        } else {
                                            str = "bdid_";
                                        }
                                        intent2 = new ShortcutInfoCompat.Builder(ApplicationLoader.applicationContext, str + j).setShortLabel(name).setIntent(intentCreateIntrnalShortcutIntent);
                                        if (bitmapDecodeFile != null) {
                                            intent2.setIcon(IconCompat.createWithBitmap(bitmapDecodeFile));
                                        } else if (user != null) {
                                            if (user.bot) {
                                                intent2.setIcon(IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.book_bot));
                                            } else {
                                                intent2.setIcon(IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.book_user));
                                            }
                                        } else if (!ChatObject.isChannel(chat)) {
                                            intent2.setIcon(IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.book_group));
                                        } else {
                                            intent2.setIcon(IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.book_group));
                                        }
                                        if (callback != null) {
                                            byte[] bArr3 = new byte[16];
                                            Utilities.fastRandom.nextBytes(bArr3);
                                            String strBytesToHex3 = Utilities.bytesToHex(bArr3);
                                            Intent intent5 = new Intent(ApplicationLoader.applicationContext, (Class<?>) ShortcutResultReceiver.class);
                                            intent5.putExtra("account", this.currentAccount);
                                            intent5.putExtra("req_id", strBytesToHex3);
                                            broadcast = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, intent5, 167772160);
                                            this.shortcutCallbacks.put(strBytesToHex3, callback);
                                        } else {
                                            broadcast = pendingIntent;
                                        }
                                        Context context3 = ApplicationLoader.applicationContext;
                                        ShortcutInfoCompat shortcutInfoCompatBuild3 = intent2.build();
                                        if (broadcast == null) {
                                            intentSender = pendingIntent;
                                        } else {
                                            intentSender = broadcast.getIntentSender();
                                        }
                                        ShortcutManagerCompat.requestPinShortcut(context3, shortcutInfoCompatBuild3, intentSender);
                                        return;
                                    }
                                    intent = new Intent();
                                    if (bitmapDecodeFile != null) {
                                        intent.putExtra("android.intent.extra.shortcut.ICON", bitmapDecodeFile);
                                    } else if (user != null) {
                                        if (user.bot) {
                                            intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.applicationContext, R.drawable.book_bot));
                                        } else {
                                            intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.applicationContext, R.drawable.book_user));
                                        }
                                    } else if (!ChatObject.isChannel(chat)) {
                                        intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.applicationContext, R.drawable.book_group));
                                    } else {
                                        intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.applicationContext, R.drawable.book_group));
                                    }
                                    intent.putExtra("android.intent.extra.shortcut.INTENT", intentCreateIntrnalShortcutIntent);
                                    intent.putExtra("android.intent.extra.shortcut.NAME", name);
                                    intent.putExtra("duplicate", false);
                                    intent.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
                                    ApplicationLoader.applicationContext.sendBroadcast(intent);
                                }
                                bitmapDecodeFile = bitmapCreateBitmap;
                            } catch (Throwable th4) {
                                th = th4;
                                pendingIntent = null;
                                FileLog.e(th);
                                if (Build.VERSION.SDK_INT >= 26) {
                                    if (i == SHORTCUT_TYPE_USER_OR_CHAT) {
                                        str = "sdid_";
                                    } else {
                                        str = "bdid_";
                                    }
                                    intent2 = new ShortcutInfoCompat.Builder(ApplicationLoader.applicationContext, str + j).setShortLabel(name).setIntent(intentCreateIntrnalShortcutIntent);
                                    if (bitmapDecodeFile != null) {
                                        intent2.setIcon(IconCompat.createWithBitmap(bitmapDecodeFile));
                                    } else if (user != null) {
                                        if (user.bot) {
                                            intent2.setIcon(IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.book_bot));
                                        } else {
                                            intent2.setIcon(IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.book_user));
                                        }
                                    } else if (!ChatObject.isChannel(chat)) {
                                        intent2.setIcon(IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.book_group));
                                    } else {
                                        intent2.setIcon(IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.book_group));
                                    }
                                    if (callback != null) {
                                        byte[] bArr4 = new byte[16];
                                        Utilities.fastRandom.nextBytes(bArr4);
                                        String strBytesToHex4 = Utilities.bytesToHex(bArr4);
                                        Intent intent6 = new Intent(ApplicationLoader.applicationContext, (Class<?>) ShortcutResultReceiver.class);
                                        intent6.putExtra("account", this.currentAccount);
                                        intent6.putExtra("req_id", strBytesToHex4);
                                        broadcast = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, intent6, 167772160);
                                        this.shortcutCallbacks.put(strBytesToHex4, callback);
                                    } else {
                                        broadcast = pendingIntent;
                                    }
                                    Context context4 = ApplicationLoader.applicationContext;
                                    ShortcutInfoCompat shortcutInfoCompatBuild4 = intent2.build();
                                    if (broadcast == null) {
                                        intentSender = pendingIntent;
                                    } else {
                                        intentSender = broadcast.getIntentSender();
                                    }
                                    ShortcutManagerCompat.requestPinShortcut(context4, shortcutInfoCompatBuild4, intentSender);
                                    return;
                                }
                                intent = new Intent();
                                if (bitmapDecodeFile != null) {
                                    intent.putExtra("android.intent.extra.shortcut.ICON", bitmapDecodeFile);
                                } else if (user != null) {
                                    if (user.bot) {
                                        intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.applicationContext, R.drawable.book_bot));
                                    } else {
                                        intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.applicationContext, R.drawable.book_user));
                                    }
                                } else if (!ChatObject.isChannel(chat)) {
                                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.applicationContext, R.drawable.book_group));
                                } else {
                                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.applicationContext, R.drawable.book_group));
                                }
                                intent.putExtra("android.intent.extra.shortcut.INTENT", intentCreateIntrnalShortcutIntent);
                                intent.putExtra("android.intent.extra.shortcut.NAME", name);
                                intent.putExtra("duplicate", false);
                                intent.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
                                ApplicationLoader.applicationContext.sendBroadcast(intent);
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    }
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    if (i == SHORTCUT_TYPE_USER_OR_CHAT) {
                        str = "sdid_";
                    } else {
                        str = "bdid_";
                    }
                    intent2 = new ShortcutInfoCompat.Builder(ApplicationLoader.applicationContext, str + j).setShortLabel(name).setIntent(intentCreateIntrnalShortcutIntent);
                    if (bitmapDecodeFile != null) {
                        intent2.setIcon(IconCompat.createWithBitmap(bitmapDecodeFile));
                    } else if (user != null) {
                        if (user.bot) {
                            intent2.setIcon(IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.book_bot));
                        } else {
                            intent2.setIcon(IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.book_user));
                        }
                    } else if (!ChatObject.isChannel(chat) && !chat.megagroup) {
                        intent2.setIcon(IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.book_channel));
                    } else {
                        intent2.setIcon(IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.book_group));
                    }
                    if (callback != null) {
                        byte[] bArr5 = new byte[16];
                        Utilities.fastRandom.nextBytes(bArr5);
                        String strBytesToHex5 = Utilities.bytesToHex(bArr5);
                        Intent intent7 = new Intent(ApplicationLoader.applicationContext, (Class<?>) ShortcutResultReceiver.class);
                        intent7.putExtra("account", this.currentAccount);
                        intent7.putExtra("req_id", strBytesToHex5);
                        broadcast = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, intent7, 167772160);
                        this.shortcutCallbacks.put(strBytesToHex5, callback);
                    } else {
                        broadcast = pendingIntent;
                    }
                    Context context5 = ApplicationLoader.applicationContext;
                    ShortcutInfoCompat shortcutInfoCompatBuild5 = intent2.build();
                    if (broadcast == null) {
                        intentSender = pendingIntent;
                    } else {
                        intentSender = broadcast.getIntentSender();
                    }
                    ShortcutManagerCompat.requestPinShortcut(context5, shortcutInfoCompatBuild5, intentSender);
                    return;
                }
                intent = new Intent();
                if (bitmapDecodeFile != null) {
                    intent.putExtra("android.intent.extra.shortcut.ICON", bitmapDecodeFile);
                } else if (user != null) {
                    if (user.bot) {
                        intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.applicationContext, R.drawable.book_bot));
                    } else {
                        intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.applicationContext, R.drawable.book_user));
                    }
                } else if (!ChatObject.isChannel(chat) && !chat.megagroup) {
                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.applicationContext, R.drawable.book_channel));
                } else {
                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.applicationContext, R.drawable.book_group));
                }
                intent.putExtra("android.intent.extra.shortcut.INTENT", intentCreateIntrnalShortcutIntent);
                intent.putExtra("android.intent.extra.shortcut.NAME", name);
                intent.putExtra("duplicate", false);
                intent.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
                ApplicationLoader.applicationContext.sendBroadcast(intent);
            }
            user = user2;
            chat = null;
            if (user != null) {
            }
            if (user != null) {
                if (i == SHORTCUT_TYPE_ATTACHED_BOT) {
                    name = UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j)));
                    userProfilePhoto2 = user.photo;
                    if (userProfilePhoto2 != null) {
                        fileLocation = userProfilePhoto2.photo_small;
                    } else {
                        fileLocation = null;
                    }
                    z = false;
                } else {
                    if (UserObject.isReplyUser(user)) {
                        name = LocaleController.getString(R.string.RepliesTitle);
                    } else if (UserObject.isUserSelf(user)) {
                        name = LocaleController.getString(R.string.SavedMessages);
                    } else {
                        name = ContactsController.formatName(user.first_name, user.last_name);
                        userProfilePhoto = user.photo;
                        if (userProfilePhoto != null) {
                            fileLocation = userProfilePhoto.photo_small;
                        } else {
                            fileLocation = null;
                        }
                        z = false;
                    }
                    fileLocation = null;
                    z = true;
                }
            } else {
                name = chat.title;
                chatPhoto = chat.photo;
                if (chatPhoto != null) {
                    fileLocation = chatPhoto.photo_small;
                } else {
                    fileLocation = null;
                }
                z = false;
            }
            if (z) {
                if (z) {
                    bitmapDecodeFile = BitmapFactory.decodeFile(getFileLoader().getPathToAttach(fileLocation, true).toString());
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
                        bitmap = bitmapDecodeFile;
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
                        bitmap = bitmapDecodeFile;
                        bitmapRect.set(0.0f, 0.0f, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight());
                        canvas.drawRoundRect(bitmapRect, bitmap.getWidth(), bitmap.getHeight(), roundPaint);
                        canvas.restore();
                    }
                    Drawable drawable2 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.book_logo);
                    int iDp5 = AndroidUtilities.dp(15.0f);
                    int i3 = iDp - iDp5;
                    int iDp6 = i3 - AndroidUtilities.dp(2.0f);
                    int iDp7 = i3 - AndroidUtilities.dp(2.0f);
                    drawable2.setBounds(iDp6, iDp7, iDp6 + iDp5, iDp5 + iDp7);
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
                        bitmap = bitmapDecodeFile;
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
                        bitmap = bitmapDecodeFile;
                        bitmapRect.set(0.0f, 0.0f, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight());
                        canvas.drawRoundRect(bitmapRect, bitmap.getWidth(), bitmap.getHeight(), roundPaint);
                        canvas.restore();
                    }
                    Drawable drawable3 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.book_logo);
                    int iDp8 = AndroidUtilities.dp(15.0f);
                    int i4 = iDp - iDp8;
                    int iDp9 = i4 - AndroidUtilities.dp(2.0f);
                    int iDp10 = i4 - AndroidUtilities.dp(2.0f);
                    drawable3.setBounds(iDp9, iDp10, iDp9 + iDp8, iDp8 + iDp10);
                    drawable3.draw(canvas);
                    pendingIntent = null;
                    canvas.setBitmap(null);
                    bitmapDecodeFile = bitmapCreateBitmap3;
                }
            } else {
                if (z) {
                    bitmapDecodeFile = BitmapFactory.decodeFile(getFileLoader().getPathToAttach(fileLocation, true).toString());
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
                        bitmap = bitmapDecodeFile;
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
                        bitmap = bitmapDecodeFile;
                        bitmapRect.set(0.0f, 0.0f, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight());
                        canvas.drawRoundRect(bitmapRect, bitmap.getWidth(), bitmap.getHeight(), roundPaint);
                        canvas.restore();
                    }
                    Drawable drawable4 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.book_logo);
                    int iDp11 = AndroidUtilities.dp(15.0f);
                    int i5 = iDp - iDp11;
                    int iDp12 = i5 - AndroidUtilities.dp(2.0f);
                    int iDp13 = i5 - AndroidUtilities.dp(2.0f);
                    drawable4.setBounds(iDp12, iDp13, iDp12 + iDp11, iDp11 + iDp13);
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
                        bitmap = bitmapDecodeFile;
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
                        bitmap = bitmapDecodeFile;
                        bitmapRect.set(0.0f, 0.0f, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight());
                        canvas.drawRoundRect(bitmapRect, bitmap.getWidth(), bitmap.getHeight(), roundPaint);
                        canvas.restore();
                    }
                    Drawable drawable5 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.book_logo);
                    int iDp14 = AndroidUtilities.dp(15.0f);
                    int i6 = iDp - iDp14;
                    int iDp15 = i6 - AndroidUtilities.dp(2.0f);
                    int iDp16 = i6 - AndroidUtilities.dp(2.0f);
                    drawable5.setBounds(iDp15, iDp16, iDp15 + iDp14, iDp14 + iDp16);
                    drawable5.draw(canvas);
                    pendingIntent = null;
                    canvas.setBitmap(null);
                    bitmapDecodeFile = bitmapCreateBitmap5;
                }
            }
            if (Build.VERSION.SDK_INT >= 26) {
                if (i == SHORTCUT_TYPE_USER_OR_CHAT) {
                    str = "sdid_";
                } else {
                    str = "bdid_";
                }
                intent2 = new ShortcutInfoCompat.Builder(ApplicationLoader.applicationContext, str + j).setShortLabel(name).setIntent(intentCreateIntrnalShortcutIntent);
                if (bitmapDecodeFile != null) {
                    intent2.setIcon(IconCompat.createWithBitmap(bitmapDecodeFile));
                } else if (user != null) {
                    if (user.bot) {
                        intent2.setIcon(IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.book_bot));
                    } else {
                        intent2.setIcon(IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.book_user));
                    }
                } else if (!ChatObject.isChannel(chat)) {
                    intent2.setIcon(IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.book_group));
                } else {
                    intent2.setIcon(IconCompat.createWithResource(ApplicationLoader.applicationContext, R.drawable.book_group));
                }
                if (callback != null) {
                    byte[] bArr6 = new byte[16];
                    Utilities.fastRandom.nextBytes(bArr6);
                    String strBytesToHex6 = Utilities.bytesToHex(bArr6);
                    Intent intent8 = new Intent(ApplicationLoader.applicationContext, (Class<?>) ShortcutResultReceiver.class);
                    intent8.putExtra("account", this.currentAccount);
                    intent8.putExtra("req_id", strBytesToHex6);
                    broadcast = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, intent8, 167772160);
                    this.shortcutCallbacks.put(strBytesToHex6, callback);
                } else {
                    broadcast = pendingIntent;
                }
                Context context6 = ApplicationLoader.applicationContext;
                ShortcutInfoCompat shortcutInfoCompatBuild6 = intent2.build();
                if (broadcast == null) {
                    intentSender = pendingIntent;
                } else {
                    intentSender = broadcast.getIntentSender();
                }
                ShortcutManagerCompat.requestPinShortcut(context6, shortcutInfoCompatBuild6, intentSender);
                return;
            }
            intent = new Intent();
            if (bitmapDecodeFile != null) {
                intent.putExtra("android.intent.extra.shortcut.ICON", bitmapDecodeFile);
            } else if (user != null) {
                if (user.bot) {
                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.applicationContext, R.drawable.book_bot));
                } else {
                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.applicationContext, R.drawable.book_user));
                }
            } else if (!ChatObject.isChannel(chat)) {
                intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.applicationContext, R.drawable.book_group));
            } else {
                intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(ApplicationLoader.applicationContext, R.drawable.book_group));
            }
            intent.putExtra("android.intent.extra.shortcut.INTENT", intentCreateIntrnalShortcutIntent);
            intent.putExtra("android.intent.extra.shortcut.NAME", name);
            intent.putExtra("duplicate", false);
            intent.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
            ApplicationLoader.applicationContext.sendBroadcast(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
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
                ShortcutManagerCompat.removeDynamicShortcuts(ApplicationLoader.applicationContext, arrayList);
                if (i2 >= 30) {
                    ShortcutManagerCompat$$ExternalSyntheticApiModelOutline2.m(ApplicationLoader.applicationContext.getSystemService(ShortcutManagerCompat$$ExternalSyntheticApiModelOutline0.m())).removeLongLivedShortcuts(arrayList);
                    return;
                }
                return;
            }
            TLRPC.User user2 = null;
            if (DialogObject.isEncryptedDialog(j)) {
                TLRPC.EncryptedChat encryptedChat = getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(j)));
                if (encryptedChat == null) {
                    return;
                } else {
                    user = getMessagesController().getUser(Long.valueOf(encryptedChat.user_id));
                }
            } else {
                if (DialogObject.isUserDialog(j)) {
                    user = getMessagesController().getUser(Long.valueOf(j));
                } else if (!DialogObject.isChatDialog(j)) {
                    return;
                } else {
                    chat = getMessagesController().getChat(Long.valueOf(-j));
                }
                if (user2 == null || chat != null) {
                    if (user2 != null) {
                        if (i == SHORTCUT_TYPE_USER_OR_CHAT) {
                            name = ContactsController.formatName(user2.first_name, user2.last_name);
                        } else if (i == SHORTCUT_TYPE_ATTACHED_BOT) {
                            name = user2.first_name;
                        } else {
                            name = "";
                        }
                    } else {
                        name = chat.title;
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
            user2 = user;
            chat = null;
            if (user2 == null) {
            }
            if (user2 != null) {
                if (i == SHORTCUT_TYPE_USER_OR_CHAT) {
                    name = ContactsController.formatName(user2.first_name, user2.last_name);
                } else if (i == SHORTCUT_TYPE_ATTACHED_BOT) {
                    name = user2.first_name;
                } else {
                    name = "";
                }
            } else {
                name = chat.title;
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

    public boolean isShortcutAdded(long j, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            String str = (i == SHORTCUT_TYPE_USER_OR_CHAT ? "sdid_" : "bdid_") + j;
            List shortcuts = ShortcutManagerCompat.getShortcuts(ApplicationLoader.applicationContext, 4);
            for (int i2 = 0; i2 < shortcuts.size(); i2++) {
                if (((ShortcutInfoCompat) shortcuts.get(i2)).getId().equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int $r8$lambda$NfH9CMuBiEsA062xTxacynCGb5k(TLRPC.MessageEntity messageEntity, TLRPC.MessageEntity messageEntity2) {
        int i = messageEntity.offset;
        int i2 = messageEntity2.offset;
        if (i > i2) {
            return 1;
        }
        return i < i2 ? -1 : 0;
    }

    public void loadPinnedMessages(final long j, final int i, final int i2) {
        if (this.loadingPinnedMessages.indexOfKey(j) >= 0) {
            return;
        }
        this.loadingPinnedMessages.put(j, Boolean.TRUE);
        final TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.peer = getMessagesController().getInputPeer(j);
        tL_messages_search.limit = 40;
        tL_messages_search.offset_id = i;
        tL_messages_search.q = "";
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPinned();
        getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                MediaDataController.m623$r8$lambda$oiLQoT6GYkvc0xsdmaEOkRgOfM(this.f$0, i2, tL_messages_search, j, i, tLObject, tL_error);
            }
        });
    }

    public static void m623$r8$lambda$oiLQoT6GYkvc0xsdmaEOkRgOfM(final MediaDataController mediaDataController, int i, TLRPC.TL_messages_search tL_messages_search, final long j, int i2, TLObject tLObject, TLRPC.TL_error tL_error) {
        int iMax;
        boolean z;
        mediaDataController.getClass();
        ArrayList<Integer> arrayList = new ArrayList<>();
        HashMap<Integer, MessageObject> map = new HashMap<>();
        int i3 = 1;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            LongSparseArray longSparseArray = new LongSparseArray();
            for (int i4 = 0; i4 < messages_messages.users.size(); i4++) {
                TLRPC.User user = messages_messages.users.get(i4);
                longSparseArray.put(user.id, user);
            }
            LongSparseArray longSparseArray2 = new LongSparseArray();
            for (int i5 = 0; i5 < messages_messages.chats.size(); i5++) {
                TLRPC.Chat chat = messages_messages.chats.get(i5);
                longSparseArray2.put(chat.id, chat);
            }
            mediaDataController.getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
            mediaDataController.getMessagesController().putUsers(messages_messages.users, false);
            mediaDataController.getMessagesController().putChats(messages_messages.chats, false);
            int size = messages_messages.messages.size();
            for (int i6 = 0; i6 < size; i6++) {
                TLRPC.Message message = messages_messages.messages.get(i6);
                if (!(message instanceof TLRPC.TL_messageService) && !(message instanceof TLRPC.TL_messageEmpty)) {
                    arrayList.add(Integer.valueOf(message.id));
                    map.put(Integer.valueOf(message.id), new MessageObject(mediaDataController.currentAccount, message, longSparseArray, longSparseArray2, false, false));
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
        mediaDataController.getMessagesStorage().updatePinnedMessages(j, arrayList, true, iMax, i2, z, map);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.loadingPinnedMessages.remove(j);
            }
        });
    }

    public ArrayList<MessageObject> loadPinnedMessages(final long j, final long j2, final ArrayList<Integer> arrayList, boolean z) {
        if (z) {
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.loadPinnedMessageInternal(j, j2, arrayList, false);
                }
            });
            return null;
        }
        return loadPinnedMessageInternal(j, j2, arrayList, true);
    }

    public ArrayList<MessageObject> loadPinnedMessageInternal(final long j, final long j2, ArrayList<Integer> arrayList, boolean z) {
        ?? Join;
        final MediaDataController mediaDataController;
        ArrayList<Long> arrayList2;
        ArrayList<TLRPC.User> arrayList3;
        ArrayList<TLRPC.Chat> arrayList4;
        try {
            ArrayList<Integer> arrayList5 = new ArrayList<>(arrayList);
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
            ArrayList<TLRPC.Message> arrayList6 = new ArrayList<>();
            ArrayList<TLRPC.User> arrayList7 = new ArrayList<>();
            ArrayList<TLRPC.Chat> arrayList8 = new ArrayList<>();
            ArrayList<Long> arrayList9 = new ArrayList<>();
            ArrayList arrayList10 = new ArrayList();
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
                        MessagesStorage.addUsersAndChatsFromMessage(messageTLdeserialize, arrayList9, arrayList10, null);
                        arrayList6.add(messageTLdeserialize);
                        arrayList5.remove(Integer.valueOf(messageTLdeserialize.id));
                    }
                    nativeByteBufferByteBufferValue.reuse();
                    z2 = false;
                }
            }
            sQLiteCursorQueryFinalized.dispose();
            if (!arrayList5.isEmpty()) {
                SQLiteCursor sQLiteCursorQueryFinalized2 = getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT data FROM chat_pinned_v2 WHERE uid = %d AND mid IN (%s)", Long.valueOf(j), TextUtils.join(",", arrayList5)), new Object[0]);
                while (sQLiteCursorQueryFinalized2.next()) {
                    NativeByteBuffer nativeByteBufferByteBufferValue2 = sQLiteCursorQueryFinalized2.byteBufferValue(0);
                    if (nativeByteBufferByteBufferValue2 != null) {
                        TLRPC.Message messageTLdeserialize2 = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue2, nativeByteBufferByteBufferValue2.readInt32(false), false);
                        if (!(messageTLdeserialize2.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                            messageTLdeserialize2.readAttachPath(nativeByteBufferByteBufferValue2, j3);
                            messageTLdeserialize2.dialog_id = j;
                            MessagesStorage.addUsersAndChatsFromMessage(messageTLdeserialize2, arrayList9, arrayList10, null);
                            arrayList6.add(messageTLdeserialize2);
                            arrayList5.remove(Integer.valueOf(messageTLdeserialize2.id));
                        }
                        nativeByteBufferByteBufferValue2.reuse();
                    }
                }
                sQLiteCursorQueryFinalized2.dispose();
            }
            if (arrayList5.isEmpty()) {
                mediaDataController = this;
                arrayList2 = arrayList9;
            } else if (j2 != 0) {
                final TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                tL_channels_getMessages.channel = getMessagesController().getInputChannel(j2);
                tL_channels_getMessages.id = arrayList5;
                arrayList2 = arrayList9;
                getConnectionsManager().sendRequest(tL_channels_getMessages, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        MediaDataController.m632$r8$lambda$xQvShQA4twp022CV3WEEzMQlyw(this.f$0, j2, j, tL_channels_getMessages, tLObject, tL_error);
                    }
                });
                mediaDataController = this;
            } else {
                arrayList2 = arrayList9;
                try {
                    final TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                    tL_messages_getMessages.id = arrayList5;
                    mediaDataController = this;
                    getConnectionsManager().sendRequest(tL_messages_getMessages, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            MediaDataController.m568$r8$lambda$5p7Mjo0YhahWkciAGQz4TT0Sr4(this.f$0, j, tL_messages_getMessages, tLObject, tL_error);
                        }
                    });
                } catch (Exception e) {
                    e = e;
                    FileLog.e(e);
                    return null;
                }
            }
            if (arrayList6.isEmpty()) {
                return null;
            }
            if (arrayList2.isEmpty()) {
                arrayList3 = arrayList7;
            } else {
                arrayList3 = arrayList7;
                mediaDataController.getMessagesStorage().getUsersInternal(arrayList2, arrayList3);
            }
            if (arrayList10.isEmpty()) {
                arrayList4 = arrayList8;
            } else {
                arrayList4 = arrayList8;
                mediaDataController.getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList10), arrayList4);
            }
            if (z) {
                return mediaDataController.broadcastPinnedMessage(arrayList6, arrayList3, arrayList4, true, true);
            }
            broadcastPinnedMessage(arrayList6, arrayList3, arrayList4, true, false);
            return null;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static void m632$r8$lambda$xQvShQA4twp022CV3WEEzMQlyw(MediaDataController mediaDataController, long j, long j2, TLRPC.TL_channels_getMessages tL_channels_getMessages, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            mediaDataController.getClass();
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            removeEmptyMessages(messages_messages.messages);
            if (!messages_messages.messages.isEmpty()) {
                mediaDataController.getMessagesController().getChat(Long.valueOf(j));
                ImageLoader.saveMessagesThumbs(messages_messages.messages);
                mediaDataController.broadcastPinnedMessage(messages_messages.messages, messages_messages.users, messages_messages.chats, false, false);
                mediaDataController.getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                mediaDataController.savePinnedMessages(j2, messages_messages.messages);
                return;
            }
        }
        mediaDataController.getMessagesStorage().updatePinnedMessages(j2, tL_channels_getMessages.id, false, -1, 0, false, null);
    }

    public static void m568$r8$lambda$5p7Mjo0YhahWkciAGQz4TT0Sr4(MediaDataController mediaDataController, long j, TLRPC.TL_messages_getMessages tL_messages_getMessages, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            mediaDataController.getClass();
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            removeEmptyMessages(messages_messages.messages);
            if (!messages_messages.messages.isEmpty()) {
                ImageLoader.saveMessagesThumbs(messages_messages.messages);
                mediaDataController.broadcastPinnedMessage(messages_messages.messages, messages_messages.users, messages_messages.chats, false, false);
                mediaDataController.getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                mediaDataController.savePinnedMessages(j, messages_messages.messages);
                return;
            }
        }
        mediaDataController.getMessagesStorage().updatePinnedMessages(j, tL_messages_getMessages.id, false, -1, 0, false, null);
    }

    private void savePinnedMessages(final long j, final ArrayList<TLRPC.Message> arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.m618$r8$lambda$jAGi3EsbkEphyrV7dPdfp_Jnaw(this.f$0, arrayList, j);
            }
        });
    }

    public static void m618$r8$lambda$jAGi3EsbkEphyrV7dPdfp_Jnaw(MediaDataController mediaDataController, ArrayList arrayList, long j) {
        mediaDataController.getClass();
        try {
            mediaDataController.getMessagesStorage().getDatabase().beginTransaction();
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = mediaDataController.getMessagesStorage().getDatabase().executeFast("REPLACE INTO chat_pinned_v2 VALUES(?, ?, ?)");
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
            mediaDataController.getMessagesStorage().getDatabase().commitTransaction();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private ArrayList<MessageObject> broadcastPinnedMessage(final ArrayList<TLRPC.Message> arrayList, final ArrayList<TLRPC.User> arrayList2, final ArrayList<TLRPC.Chat> arrayList3, final boolean z, boolean z2) {
        if (arrayList.isEmpty()) {
            return null;
        }
        final LongSparseArray longSparseArray = new LongSparseArray();
        for (int i = 0; i < arrayList2.size(); i++) {
            TLRPC.User user = arrayList2.get(i);
            longSparseArray.put(user.id, user);
        }
        final LongSparseArray longSparseArray2 = new LongSparseArray();
        for (int i2 = 0; i2 < arrayList3.size(); i2++) {
            TLRPC.Chat chat = arrayList3.get(i2);
            longSparseArray2.put(chat.id, chat);
        }
        final ArrayList<MessageObject> arrayList4 = new ArrayList<>();
        if (z2) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.$r8$lambda$zqDj1U57ESqOk1Peeqvy2clZUxg(this.f$0, arrayList2, z, arrayList3);
                }
            });
            int size = arrayList.size();
            int i3 = 0;
            int i4 = 0;
            while (i4 < size) {
                TLRPC.Message message = arrayList.get(i4);
                if ((MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaDocument) || (MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaPhoto)) {
                    i3++;
                }
                int i5 = i3;
                LongSparseArray longSparseArray3 = longSparseArray;
                longSparseArray = longSparseArray3;
                arrayList4.add(new MessageObject(this.currentAccount, message, longSparseArray3, longSparseArray2, false, i5 < 30));
                i4++;
                i3 = i5;
            }
            return arrayList4;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$fcQDBvQ4pbX9SCC3t5atd2DhcaI(this.f$0, arrayList2, z, arrayList3, arrayList, arrayList4, longSparseArray, longSparseArray2);
            }
        });
        return null;
    }

    public static void $r8$lambda$zqDj1U57ESqOk1Peeqvy2clZUxg(MediaDataController mediaDataController, ArrayList arrayList, boolean z, ArrayList arrayList2) {
        mediaDataController.getMessagesController().putUsers(arrayList, z);
        mediaDataController.getMessagesController().putChats(arrayList2, z);
    }

    public static void $r8$lambda$fcQDBvQ4pbX9SCC3t5atd2DhcaI(final MediaDataController mediaDataController, ArrayList arrayList, boolean z, ArrayList arrayList2, ArrayList arrayList3, final ArrayList arrayList4, LongSparseArray longSparseArray, LongSparseArray longSparseArray2) {
        mediaDataController.getMessagesController().putUsers(arrayList, z);
        mediaDataController.getMessagesController().putChats(arrayList2, z);
        int size = arrayList3.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            TLRPC.Message message = (TLRPC.Message) arrayList3.get(i2);
            if ((MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaDocument) || (MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaPhoto)) {
                i++;
            }
            arrayList4.add(new MessageObject(mediaDataController.currentAccount, message, longSparseArray, longSparseArray2, false, i < 30));
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController mediaDataController2 = this.f$0;
                ArrayList arrayList5 = arrayList4;
                mediaDataController2.getNotificationCenter().postNotificationName(NotificationCenter.didLoadPinnedMessages, Long.valueOf(((MessageObject) arrayList5.get(0)).getDialogId()), null, Boolean.TRUE, arrayList5, null, 0, -1, Boolean.FALSE);
            }
        });
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

    public void loadReplyMessagesForMessages(ArrayList<MessageObject> arrayList, final long j, int i, long j2, final Runnable runnable, final int i2, final Timer timer) {
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
        final boolean z = i == 1;
        if (DialogObject.isEncryptedDialog(j)) {
            Timer.Task taskStart = Timer.start(timer, "loadReplyMessagesForMessages: (encrypted) finding messages to load");
            final ArrayList arrayList4 = new ArrayList();
            final LongSparseArray longSparseArray3 = new LongSparseArray();
            for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                MessageObject messageObject = arrayList3.get(i4);
                if (messageObject != null && messageObject.isReply() && messageObject.replyMessageObject == null) {
                    long j5 = messageObject.messageOwner.reply_to.reply_to_random_id;
                    ArrayList arrayList5 = (ArrayList) longSparseArray3.get(j5);
                    if (arrayList5 == null) {
                        arrayList5 = new ArrayList();
                        longSparseArray3.put(j5, arrayList5);
                    }
                    arrayList5.add(messageObject);
                    if (!arrayList4.contains(Long.valueOf(j5))) {
                        arrayList4.add(Long.valueOf(j5));
                    }
                }
            }
            if (arrayList4.isEmpty()) {
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            } else {
                Timer.done(taskStart);
                final Timer.Task taskStart2 = Timer.start(timer, "loadReplyMessagesForMessages (encrypted) storageQueue.postRunnable");
                getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        MediaDataController.m604$r8$lambda$ZylyKwHVM4qX4W_4yDwCYliiw(this.f$0, taskStart2, timer, arrayList4, j, longSparseArray3, runnable);
                    }
                });
                return;
            }
        }
        final LongSparseArray longSparseArray4 = new LongSparseArray();
        final LongSparseArray longSparseArray5 = new LongSparseArray();
        Timer.Task taskStart3 = Timer.start(timer, "loadReplyMessagesForMessages: filling replies from the same array");
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
                            if (messageAction instanceof TLRPC.TL_messageActionPinMessage) {
                                messageObject2.generatePinMessageText(null, null);
                                break;
                            }
                            if (messageAction instanceof TLRPC.TL_messageActionGameScore) {
                                messageObject2.generateGameMessageText(null);
                                break;
                            }
                            if (messageAction instanceof TLRPC.TL_messageActionPaymentSent) {
                                messageObject2.generatePaymentSentMessageText(null, false);
                                break;
                            } else if (messageAction instanceof TLRPC.TL_messageActionPaymentSentMe) {
                                messageObject2.generatePaymentSentMessageText(null, true);
                                break;
                            } else {
                                if (!(messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval)) {
                                    break;
                                }
                                messageObject2.generateSuggestionApprovalMessageText();
                                break;
                            }
                        }
                    }
                }
            }
            i5++;
        }
        Timer.done(taskStart3);
        Timer.Task taskStart4 = Timer.start(timer, "loadReplyMessagesForMessages: gathering ids of missing reply data");
        int i8 = 0;
        while (i8 < arrayList3.size()) {
            MessageObject messageObject3 = arrayList3.get(i8);
            if (messageObject3 == null) {
                task = taskStart4;
                longSparseArray2 = longSparseArray;
            } else {
                int i9 = messageObject3.type;
                if (i9 == 23 || i9 == 24) {
                    task = taskStart4;
                    i3 = i8;
                    longSparseArray2 = longSparseArray;
                    TLRPC.MessageMedia messageMedia2 = messageObject3.messageOwner.media;
                    if (messageMedia2.storyItem == null) {
                        long peerDialogId = DialogObject.getPeerDialogId(messageMedia2.peer);
                        longSparseArray = longSparseArray2 == null ? new LongSparseArray() : longSparseArray2;
                        ArrayList arrayList6 = (ArrayList) longSparseArray.get(peerDialogId);
                        if (arrayList6 == null) {
                            arrayList6 = new ArrayList();
                            longSparseArray.put(peerDialogId, arrayList6);
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("+story did=");
                        sb.append(peerDialogId);
                        sb.append(" at ");
                        sb.append(messageObject3.type == 23 ? "forwarded" : "mentioned");
                        sb.append(" #");
                        sb.append(messageObject3.getId());
                        Timer.log(timer, sb.toString());
                        arrayList6.add(messageObject3);
                    } else {
                        long peerDialogId2 = DialogObject.getPeerDialogId(messageMedia2.peer);
                        TLRPC.MessageMedia messageMedia3 = messageObject3.messageOwner.media;
                        messageMedia3.storyItem = StoriesStorage.checkExpiredStateLocal(this.currentAccount, peerDialogId2, messageMedia3.storyItem);
                        longSparseArray = longSparseArray2;
                    }
                } else {
                    if (messageObject3.getRealId() > 0 && messageObject3.isReplyToStory()) {
                        TLRPC.Message message3 = messageObject3.messageOwner;
                        if (message3.replyStory == null) {
                            long peerDialogId3 = DialogObject.getPeerDialogId(message3.reply_to.peer);
                            if (longSparseArray == null) {
                                longSparseArray = new LongSparseArray();
                            }
                            ArrayList arrayList7 = (ArrayList) longSparseArray.get(peerDialogId3);
                            if (arrayList7 == null) {
                                arrayList7 = new ArrayList();
                                longSparseArray.put(peerDialogId3, arrayList7);
                            }
                            task = taskStart4;
                            Timer.log(timer, "+story did=" + peerDialogId3 + " at replied #" + messageObject3.getId());
                            arrayList7.add(messageObject3);
                            i3 = i8;
                        } else {
                            task = taskStart4;
                            long peerDialogId4 = DialogObject.getPeerDialogId(message3.reply_to.peer);
                            TLRPC.Message message4 = messageObject3.messageOwner;
                            message4.replyStory = StoriesStorage.checkExpiredStateLocal(this.currentAccount, peerDialogId4, message4.replyStory);
                        }
                    } else {
                        task = taskStart4;
                        if (messageObject3.getRealId() > 0 && messageObject3.isReply()) {
                            TLRPC.Message message5 = messageObject3.messageOwner;
                            TLRPC.MessageReplyHeader messageReplyHeader2 = message5.reply_to;
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
                                    j4 = message5.peer_id.channel_id;
                                    if (j4 == 0) {
                                        j4 = j3;
                                    }
                                }
                                MessageObject messageObject4 = messageObject3.replyMessageObject;
                                if ((messageObject4 == null || ((message2 = messageObject4.messageOwner) != null && (peer = message2.peer_id) != null && !(message5 instanceof TLRPC.TL_messageEmpty) && peer.channel_id != j4)) && (j == 1271266957 || j4 == j3 || messageObject3.getDialogId() == (-j4) || (chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j4))) == null || ChatObject.isPublic(chat))) {
                                    SparseArray sparseArray = (SparseArray) longSparseArray4.get(j);
                                    ArrayList arrayList8 = (ArrayList) longSparseArray5.get(j4);
                                    if (sparseArray == null) {
                                        sparseArray = new SparseArray();
                                        longSparseArray4.put(j, sparseArray);
                                    }
                                    if (arrayList8 == null) {
                                        arrayList8 = new ArrayList();
                                        longSparseArray5.put(j4, arrayList8);
                                    }
                                    ArrayList arrayList9 = (ArrayList) sparseArray.get(i10);
                                    i3 = i8;
                                    if (arrayList9 == null) {
                                        arrayList2 = new ArrayList();
                                        sparseArray.put(i10, arrayList2);
                                        if (!arrayList8.contains(Integer.valueOf(i10))) {
                                            arrayList8.add(Integer.valueOf(i10));
                                        }
                                    } else {
                                        arrayList2 = arrayList9;
                                    }
                                    arrayList2.add(messageObject3);
                                    Timer.log(timer, "+message did=" + (-j4) + " mid=" + i10 + " at replied #" + messageObject3.getId());
                                }
                                i8 = i3 + 1;
                                arrayList3 = arrayList;
                                taskStart4 = task;
                            }
                        }
                        longSparseArray = longSparseArray2;
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
                                ArrayList arrayList10 = (ArrayList) longSparseArray.get(peerDialogId5);
                                if (arrayList10 == null) {
                                    arrayList10 = new ArrayList();
                                    longSparseArray.put(peerDialogId5, arrayList10);
                                }
                                Timer.log(timer, "+story did=" + peerDialogId5 + " at webpage of #" + messageObject3.getId());
                                arrayList10.add(messageObject3);
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
                taskStart4 = task;
            }
            i3 = i8;
            longSparseArray = longSparseArray2;
            i8 = i3 + 1;
            arrayList3 = arrayList;
            taskStart4 = task;
        }
        final LongSparseArray longSparseArray6 = longSparseArray;
        Timer.done(taskStart4);
        if (longSparseArray4.isEmpty() && longSparseArray6 == null) {
            if (runnable != null) {
                runnable.run();
            }
        } else {
            final Timer.Task taskStart5 = Timer.start(timer, "loadReplyMessagesForMessages: storageQueue.postRunnable");
            final AtomicInteger atomicInteger = new AtomicInteger(2);
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.$r8$lambda$KHfAvjLmPXHLzqDvDSjqcjKpsDg(this.f$0, taskStart5, longSparseArray6, atomicInteger, runnable, i2, timer, longSparseArray4, longSparseArray5, z, j);
                }
            });
        }
    }

    public static void m604$r8$lambda$ZylyKwHVM4qX4W_4yDwCYliiw(final MediaDataController mediaDataController, Timer.Task task, Timer timer, ArrayList arrayList, final long j, LongSparseArray longSparseArray, Runnable runnable) {
        mediaDataController.getClass();
        Timer.done(task);
        Timer.Task taskStart = Timer.start(timer, "loadReplyMessagesForMessages: (encrypted) loading those messages from storage");
        try {
            final ArrayList arrayList2 = new ArrayList();
            SQLiteCursor sQLiteCursorQueryFinalized = mediaDataController.getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT m.data, m.mid, m.date, r.random_id FROM randoms_v2 as r INNER JOIN messages_v2 as m ON r.mid = m.mid AND r.uid = m.uid WHERE r.random_id IN(%s)", TextUtils.join(",", arrayList)), new Object[0]);
            while (sQLiteCursorQueryFinalized.next()) {
                NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                if (nativeByteBufferByteBufferValue != null) {
                    TLRPC.Message messageTLdeserialize = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                    messageTLdeserialize.readAttachPath(nativeByteBufferByteBufferValue, mediaDataController.getUserConfig().clientUserId);
                    nativeByteBufferByteBufferValue.reuse();
                    messageTLdeserialize.id = sQLiteCursorQueryFinalized.intValue(1);
                    messageTLdeserialize.date = sQLiteCursorQueryFinalized.intValue(2);
                    messageTLdeserialize.dialog_id = j;
                    long jLongValue = sQLiteCursorQueryFinalized.longValue(3);
                    ArrayList arrayList3 = (ArrayList) longSparseArray.get(jLongValue);
                    longSparseArray.remove(jLongValue);
                    if (arrayList3 != null) {
                        MessageObject messageObject = new MessageObject(mediaDataController.currentAccount, messageTLdeserialize, false, false);
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
            final Timer.Task taskStart2 = Timer.start(timer, "loadReplyMessagesForMessages (encrypted) runOnUIThread: posting notification");
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.$r8$lambda$GwhmYhkrAjYPlKY5a9caEAL8s88(this.f$0, taskStart2, j, arrayList2);
                }
            });
            if (runnable != null) {
                runnable.run();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void $r8$lambda$GwhmYhkrAjYPlKY5a9caEAL8s88(MediaDataController mediaDataController, Timer.Task task, long j, ArrayList arrayList) {
        mediaDataController.getClass();
        Timer.done(task);
        mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.replyMessagesDidLoad, Long.valueOf(j), arrayList, null);
    }

    public static void $r8$lambda$KHfAvjLmPXHLzqDvDSjqcjKpsDg(final org.telegram.messenger.MediaDataController r29, org.telegram.messenger.Timer.Task r30, androidx.collection.LongSparseArray r31, final java.util.concurrent.atomic.AtomicInteger r32, final java.lang.Runnable r33, int r34, final org.telegram.messenger.Timer r35, final androidx.collection.LongSparseArray r36, androidx.collection.LongSparseArray r37, final boolean r38, final long r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.$r8$lambda$KHfAvjLmPXHLzqDvDSjqcjKpsDg(org.telegram.messenger.MediaDataController, org.telegram.messenger.Timer$Task, androidx.collection.LongSparseArray, java.util.concurrent.atomic.AtomicInteger, java.lang.Runnable, int, org.telegram.messenger.Timer, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray, boolean, long):void");
    }

    public static void $r8$lambda$bHnVdpPE9gzgdeP1VISz07huktc(AtomicInteger atomicInteger, Runnable runnable) {
        if (atomicInteger.decrementAndGet() != 0 || runnable == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(runnable);
    }

    public static void m608$r8$lambda$a5SB2dvAav8WvkSPoiugHLWOfw(final MediaDataController mediaDataController, Timer.Task task, TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages, final long j, final long j2, final LongSparseArray longSparseArray, final boolean z, Timer timer, AtomicInteger atomicInteger, Runnable runnable, TLObject tLObject, final TLRPC.TL_error tL_error) {
        TLObject tLObject2;
        mediaDataController.getClass();
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
                    tL_channels_getMessages.channel = mediaDataController.getMessagesController().getInputChannel(j);
                    tL_channels_getMessages.id = tL_messages_getScheduledMessages.id;
                    tLObject2 = tL_channels_getMessages;
                } else {
                    TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                    tL_messages_getMessages.id = tL_messages_getScheduledMessages.id;
                    tLObject2 = tL_messages_getMessages;
                }
                mediaDataController.getConnectionsManager().sendRequest(tLObject2, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject3, TLRPC.TL_error tL_error2) {
                        MediaDataController.$r8$lambda$hB_avzzSVex968Hx5WpxN5UVaek(this.f$0, tL_error, messages_messages, j2, j, longSparseArray, z, tLObject3, tL_error2);
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
                mediaDataController.broadcastReplyMessages(messages_messages.messages, longSparseArray, messages_messages.users, messages_messages.chats, j2, false);
                mediaDataController.getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                mediaDataController.saveReplyMessages(longSparseArray, messages_messages.messages, z);
            }
        } else {
            Timer.log(timer, "getScheduledMessages error: " + tL_error.code + " " + tL_error.text);
        }
        if (atomicInteger.decrementAndGet() != 0 || runnable == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(runnable);
    }

    public static void $r8$lambda$hB_avzzSVex968Hx5WpxN5UVaek(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLRPC.messages_Messages messages_messages, long j, long j2, LongSparseArray longSparseArray, boolean z, TLObject tLObject, TLRPC.TL_error tL_error2) {
        mediaDataController.getClass();
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
            mediaDataController.broadcastReplyMessages(messages_messages.messages, longSparseArray, messages_messages.users, messages_messages.chats, j, false);
            mediaDataController.getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
            mediaDataController.saveReplyMessages(longSparseArray, messages_messages.messages, z);
        }
    }

    public static void $r8$lambda$XDL2rmukHV313zE3goeik8Rbg1c(MediaDataController mediaDataController, Timer.Task task, long j, long j2, LongSparseArray longSparseArray, boolean z, Timer timer, AtomicInteger atomicInteger, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        mediaDataController.getClass();
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
            mediaDataController.broadcastReplyMessages(messages_messages.messages, longSparseArray, messages_messages.users, messages_messages.chats, j, false);
            mediaDataController.getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
            mediaDataController.saveReplyMessages(longSparseArray, messages_messages.messages, z);
        } else {
            Timer.log(timer, "channels.getMessages error: " + tL_error.code + " " + tL_error.text);
        }
        if (atomicInteger.decrementAndGet() != 0 || runnable == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(runnable);
    }

    public static void m560$r8$lambda$1UAf0uE6AuLdPk0JRdJHZeHSS4(MediaDataController mediaDataController, Timer.Task task, long j, LongSparseArray longSparseArray, boolean z, Timer timer, AtomicInteger atomicInteger, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        mediaDataController.getClass();
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
            mediaDataController.broadcastReplyMessages(messages_messages.messages, longSparseArray, messages_messages.users, messages_messages.chats, j, false);
            mediaDataController.getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
            mediaDataController.saveReplyMessages(longSparseArray, messages_messages.messages, z);
        } else {
            Timer.log(timer, "messages.getMessages error: " + tL_error.code + " " + tL_error.text);
        }
        if (atomicInteger.decrementAndGet() != 0 || runnable == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(runnable);
    }

    private void saveReplyMessages(final LongSparseArray longSparseArray, final ArrayList<TLRPC.Message> arrayList, final boolean z) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$crkFMbSMaBNtwADWJfqyToR9Te4(this.f$0, z, arrayList, longSparseArray);
            }
        });
    }

    public static void $r8$lambda$crkFMbSMaBNtwADWJfqyToR9Te4(MediaDataController mediaDataController, boolean z, ArrayList arrayList, LongSparseArray longSparseArray) {
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast;
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast2;
        ArrayList arrayList2;
        mediaDataController.getClass();
        try {
            mediaDataController.getMessagesStorage().getDatabase().beginTransaction();
            if (z) {
                sQLitePreparedStatementExecuteFast = mediaDataController.getMessagesStorage().getDatabase().executeFast("UPDATE scheduled_messages_v2 SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                sQLitePreparedStatementExecuteFast2 = null;
            } else {
                sQLitePreparedStatementExecuteFast = mediaDataController.getMessagesStorage().getDatabase().executeFast("UPDATE messages_v2 SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                sQLitePreparedStatementExecuteFast2 = mediaDataController.getMessagesStorage().getDatabase().executeFast("UPDATE messages_topics SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
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
            mediaDataController.getMessagesStorage().getDatabase().commitTransaction();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private void broadcastReplyMessages(ArrayList<TLRPC.Message> arrayList, final LongSparseArray longSparseArray, final ArrayList<TLRPC.User> arrayList2, final ArrayList<TLRPC.Chat> arrayList3, final long j, final boolean z) {
        LongSparseArray longSparseArray2 = new LongSparseArray();
        for (int i = 0; i < arrayList2.size(); i++) {
            TLRPC.User user = arrayList2.get(i);
            longSparseArray2.put(user.id, user);
        }
        LongSparseArray longSparseArray3 = new LongSparseArray();
        for (int i2 = 0; i2 < arrayList3.size(); i2++) {
            TLRPC.Chat chat = arrayList3.get(i2);
            longSparseArray3.put(chat.id, chat);
        }
        final ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList4.add(new MessageObject(this.currentAccount, arrayList.get(i3), longSparseArray2, longSparseArray3, false, false));
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$_gbjs9NsunaRVgp59FsK6gnYRt8(this.f$0, arrayList2, z, arrayList3, arrayList4, longSparseArray, j);
            }
        });
    }

    public static void $r8$lambda$_gbjs9NsunaRVgp59FsK6gnYRt8(MediaDataController mediaDataController, ArrayList arrayList, boolean z, ArrayList arrayList2, ArrayList arrayList3, LongSparseArray longSparseArray, long j) {
        ArrayList arrayList4;
        mediaDataController.getMessagesController().putUsers(arrayList, z);
        mediaDataController.getMessagesController().putChats(arrayList2, z);
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
            mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.replyMessagesDidLoad, Long.valueOf(j), arrayList3, longSparseArray);
        }
    }

    public static void sortEntities(ArrayList<TLRPC.MessageEntity> arrayList) {
        Collections.sort(arrayList, entityComparator);
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

    public CharSequence substring(CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof SpannableStringBuilder) {
            return charSequence.subSequence(i, i2);
        }
        if (charSequence instanceof SpannedString) {
            return charSequence.subSequence(i, i2);
        }
        return TextUtils.substring(charSequence, i, i2);
    }

    private static CharacterStyle createNewSpan(CharacterStyle characterStyle, TextStyleSpan.TextStyleRun textStyleRun, TextStyleSpan.TextStyleRun textStyleRun2, boolean z) {
        TextStyleSpan.TextStyleRun textStyleRun3 = new TextStyleSpan.TextStyleRun(textStyleRun);
        if (textStyleRun2 != null) {
            if (z) {
                textStyleRun3.merge(textStyleRun2);
            } else {
                textStyleRun3.replace(textStyleRun2);
            }
        }
        if (characterStyle instanceof TextStyleSpan) {
            return new TextStyleSpan(textStyleRun3);
        }
        if (characterStyle instanceof URLSpanReplacement) {
            return new URLSpanReplacement(((URLSpanReplacement) characterStyle).getURL(), textStyleRun3);
        }
        return null;
    }

    public static void addStyleToText(TextStyleSpan textStyleSpan, int i, int i2, Spannable spannable, boolean z) {
        TextStyleSpan.TextStyleRun textStyleRun;
        int i3;
        try {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) spannable.getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr != null && characterStyleArr.length > 0) {
                for (CharacterStyle characterStyle : characterStyleArr) {
                    TextStyleSpan.TextStyleRun textStyleRun2 = textStyleSpan != null ? textStyleSpan.getTextStyleRun() : new TextStyleSpan.TextStyleRun();
                    if (characterStyle instanceof TextStyleSpan) {
                        textStyleRun = ((TextStyleSpan) characterStyle).getTextStyleRun();
                    } else {
                        if (characterStyle instanceof URLSpanReplacement) {
                            textStyleRun = ((URLSpanReplacement) characterStyle).getTextStyleRun();
                            if (textStyleRun == null) {
                                textStyleRun = new TextStyleSpan.TextStyleRun();
                            }
                        }
                    }
                    if (textStyleRun != null) {
                        int spanStart = spannable.getSpanStart(characterStyle);
                        int spanEnd = spannable.getSpanEnd(characterStyle);
                        spannable.removeSpan(characterStyle);
                        if (spanStart <= i || i2 <= spanEnd) {
                            if (spanStart > i) {
                                i3 = i;
                            } else {
                                if (spanStart != i) {
                                    spannable.setSpan(createNewSpan(characterStyle, textStyleRun, null, z), spanStart, i, 33);
                                }
                                if (spanEnd > i) {
                                    if (textStyleSpan != null) {
                                        spannable.setSpan(createNewSpan(characterStyle, textStyleRun, textStyleRun2, z), i, Math.min(spanEnd, i2), 33);
                                    }
                                    i3 = spanEnd;
                                } else {
                                    i3 = i;
                                }
                            }
                            if (spanEnd >= i2) {
                                if (spanEnd != i2) {
                                    spannable.setSpan(createNewSpan(characterStyle, textStyleRun, null, z), i2, spanEnd, 33);
                                }
                                if (i2 > spanStart && spanEnd <= i) {
                                    if (textStyleSpan != null) {
                                        spannable.setSpan(createNewSpan(characterStyle, textStyleRun, textStyleRun2, z), spanStart, Math.min(spanEnd, i2), 33);
                                    }
                                    i2 = spanStart;
                                }
                            }
                            i = i3;
                        } else {
                            spannable.setSpan(createNewSpan(characterStyle, textStyleRun, textStyleRun2, z), spanStart, spanEnd, 33);
                            if (textStyleSpan != null) {
                                spannable.setSpan(new TextStyleSpan(new TextStyleSpan.TextStyleRun(textStyleRun2)), spanEnd, i2, 33);
                            }
                            i2 = spanStart;
                        }
                    }
                }
            }
            if (textStyleSpan == null || i >= i2 || i >= spannable.length()) {
                return;
            }
            spannable.setSpan(textStyleSpan, i, Math.min(spannable.length(), i2), 33);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void addTextStyleRuns(MessageObject messageObject, Spannable spannable) {
        addTextStyleRuns(messageObject.messageOwner.entities, messageObject.messageText, spannable, -1);
    }

    public static void addTextStyleRuns(TLRPC.DraftMessage draftMessage, Spannable spannable, int i) {
        addTextStyleRuns(draftMessage.entities, draftMessage.message, spannable, i);
    }

    public static void addTextStyleRuns(MessageObject messageObject, Spannable spannable, int i) {
        addTextStyleRuns(messageObject.messageOwner.entities, messageObject.messageText, spannable, i);
    }

    public static void addTextStyleRuns(ArrayList<TLRPC.MessageEntity> arrayList, CharSequence charSequence, Spannable spannable) {
        addTextStyleRuns(arrayList, charSequence, spannable, -1);
    }

    public static void addTextStyleRuns(ArrayList<TLRPC.MessageEntity> arrayList, CharSequence charSequence, Spannable spannable, int i) {
        for (TextStyleSpan textStyleSpan : (TextStyleSpan[]) spannable.getSpans(0, spannable.length(), TextStyleSpan.class)) {
            spannable.removeSpan(textStyleSpan);
        }
        ArrayList<TextStyleSpan.TextStyleRun> textStyleRuns = getTextStyleRuns(arrayList, charSequence, i);
        for (int i2 = 0; i2 < Math.min(1000, textStyleRuns.size()); i2++) {
            TextStyleSpan.TextStyleRun textStyleRun = textStyleRuns.get(i2);
            addStyleToText(new TextStyleSpan(textStyleRun), textStyleRun.start, textStyleRun.end, spannable, true);
        }
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
                        animatedEmojiSpan = new AnimatedEmojiSpan(tL_messageEntityCustomEmoji.document, fontMetricsInt);
                    } else {
                        animatedEmojiSpan = new AnimatedEmojiSpan(tL_messageEntityCustomEmoji.document_id, fontMetricsInt);
                    }
                    spannable.setSpan(animatedEmojiSpan, i2, i3, 33);
                }
            }
        }
    }

    public static ArrayList<TextStyleSpan.TextStyleRun> getTextStyleRuns(ArrayList<TLRPC.MessageEntity> arrayList, CharSequence charSequence, int i) {
        int i2;
        ArrayList<TextStyleSpan.TextStyleRun> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList(arrayList);
        Collections.sort(arrayList3, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return MediaDataController.$r8$lambda$XjSRTWKkhj9moNKwxj6bflwMYE4((TLRPC.MessageEntity) obj, (TLRPC.MessageEntity) obj2);
            }
        });
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

    public static int $r8$lambda$XjSRTWKkhj9moNKwxj6bflwMYE4(TLRPC.MessageEntity messageEntity, TLRPC.MessageEntity messageEntity2) {
        int i = messageEntity.offset;
        int i2 = messageEntity2.offset;
        if (i > i2) {
            return 1;
        }
        return i < i2 ? -1 : 0;
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

    private TLRPC.MessageEntity setEntityStartEnd(TLRPC.MessageEntity messageEntity, int i, int i2) {
        messageEntity.offset = i;
        messageEntity.length = i2 - i;
        return messageEntity;
    }

    public ArrayList<TLRPC.MessageEntity> getEntities(CharSequence[] charSequenceArr, boolean z) {
        return getEntities(charSequenceArr, z, true);
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
                            int length = i9 + strSubstring.length() + (strSubstring.isEmpty() ^ i4);
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
                            addStyle(textStyleSpan.getStyleFlags(), spanStart, spanEnd, arrayList);
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
                        TextStyleSpan.TextStyleRun textStyleRun = uRLSpanReplacementArr[i16].getTextStyleRun();
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
                charSequenceSubSequence = parsePattern(parsePattern(parsePattern(charSequenceSubSequence, BOLD_PATTERN, arrayList, new GenericProvider() {
                    @Override
                    public final Object provide(Object obj) {
                        return MediaDataController.$r8$lambda$n0lpgW7sbyI33IiZp2MurEf3nbY((Void) obj);
                    }
                }), ITALIC_PATTERN, arrayList, new GenericProvider() {
                    @Override
                    public final Object provide(Object obj) {
                        return MediaDataController.$r8$lambda$Gl956n6tI7vIBC37dPMZ_TdMv68((Void) obj);
                    }
                }), SPOILER_PATTERN, arrayList, new GenericProvider() {
                    @Override
                    public final Object provide(Object obj) {
                        return MediaDataController.m601$r8$lambda$WLMLglyjJXmCe4sFUK9RdBvUcM((Void) obj);
                    }
                });
                if (z) {
                    charSequenceSubSequence = parsePattern(charSequenceSubSequence, STRIKE_PATTERN, arrayList, new GenericProvider() {
                        @Override
                        public final Object provide(Object obj) {
                            return MediaDataController.$r8$lambda$sRVhz0VV932VixK71DorRWVm4Ig((Void) obj);
                        }
                    });
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

    public static TLRPC.MessageEntity $r8$lambda$n0lpgW7sbyI33IiZp2MurEf3nbY(Void r0) {
        return new TLRPC.TL_messageEntityBold();
    }

    public static TLRPC.MessageEntity $r8$lambda$Gl956n6tI7vIBC37dPMZ_TdMv68(Void r0) {
        return new TLRPC.TL_messageEntityItalic();
    }

    public static TLRPC.MessageEntity m601$r8$lambda$WLMLglyjJXmCe4sFUK9RdBvUcM(Void r0) {
        return new TLRPC.TL_messageEntitySpoiler();
    }

    public static TLRPC.MessageEntity $r8$lambda$sRVhz0VV932VixK71DorRWVm4Ig(Void r0) {
        return new TLRPC.TL_messageEntityStrike();
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

    public static boolean stringsEqual(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null && charSequence2 == null) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || !TextUtils.equals(charSequence, charSequence2)) {
            return false;
        }
        return entitiesEqual(getInstance(UserConfig.selectedAccount).getEntities(new CharSequence[]{new SpannableStringBuilder(charSequence)}, true), getInstance(UserConfig.selectedAccount).getEntities(new CharSequence[]{new SpannableStringBuilder(charSequence2)}, true));
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

    public void loadDraftsIfNeed() {
        if (getUserConfig().draftsLoaded || this.loadingDrafts) {
            return;
        }
        this.loadingDrafts = true;
        getConnectionsManager().sendRequest(new TLRPC.TL_messages_getAllDrafts(), new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException {
                MediaDataController.$r8$lambda$ceAsjl22NMlLl8gPB68v3nngZyk(this.f$0, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$ceAsjl22NMlLl8gPB68v3nngZyk(final MediaDataController mediaDataController, TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException {
        if (tL_error != null) {
            mediaDataController.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.loadingDrafts = false;
                }
            });
        } else {
            mediaDataController.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.$r8$lambda$Spm6LWMyUlGHyYr5q73wUzIRqTY(this.f$0);
                }
            });
        }
    }

    public static void $r8$lambda$Spm6LWMyUlGHyYr5q73wUzIRqTY(MediaDataController mediaDataController) {
        mediaDataController.loadingDrafts = false;
        UserConfig userConfig = mediaDataController.getUserConfig();
        userConfig.draftsLoaded = true;
        userConfig.saveConfig(false);
    }

    public int getDraftFolderId(long j) {
        return ((Integer) this.draftsFolderIds.get(j, 0)).intValue();
    }

    public void setDraftFolderId(long j, int i) {
        this.draftsFolderIds.put(j, Integer.valueOf(i));
    }

    public void clearDraftsFolderIds() {
        this.draftsFolderIds.clear();
    }

    public LongSparseArray getDrafts() {
        return this.drafts;
    }

    public TLRPC.DraftMessage getDraft(long j, long j2) {
        LongSparseArray longSparseArray = (LongSparseArray) this.drafts.get(j);
        if (longSparseArray == null) {
            return null;
        }
        return (TLRPC.DraftMessage) longSparseArray.get(j2);
    }

    public Pair<Long, TLRPC.DraftMessage> getOneThreadDraft(long j) {
        LongSparseArray longSparseArray = (LongSparseArray) this.drafts.get(j);
        if (longSparseArray == null || longSparseArray.size() <= 0) {
            return null;
        }
        return new Pair<>(Long.valueOf(longSparseArray.keyAt(0)), longSparseArray.valueAt(0));
    }

    public TLRPC.Message getDraftMessage(long j, long j2) {
        LongSparseArray longSparseArray = (LongSparseArray) this.draftMessages.get(j);
        if (longSparseArray == null) {
            return null;
        }
        return (TLRPC.Message) longSparseArray.get(j2);
    }

    public void saveDraft(long j, int i, CharSequence charSequence, ArrayList<TLRPC.MessageEntity> arrayList, TLRPC.Message message, boolean z, long j2) {
        saveDraft(j, i, charSequence, arrayList, message, null, null, j2, z, false);
    }

    public void saveDraft(long j, long j2, CharSequence charSequence, ArrayList<TLRPC.MessageEntity> arrayList, TLRPC.Message message, ChatActivity.ReplyQuote replyQuote, TLRPC.SuggestedPost suggestedPost, long j3, boolean z, boolean z2) {
        saveDraft(j, j2, charSequence, arrayList, message, replyQuote, suggestedPost, j3, z, z2, null);
    }

    public void saveDraft(long j, long j2, CharSequence charSequence, ArrayList<TLRPC.MessageEntity> arrayList, TLRPC.Message message, ChatActivity.ReplyQuote replyQuote, TLRPC.SuggestedPost suggestedPost, long j3, boolean z, boolean z2, TL_iv.RichMessage richMessage) {
        TLRPC.DraftMessage tL_draftMessage;
        TLRPC.InputReplyTo inputReplyTo;
        TLRPC.Message message2 = (getMessagesController().isForum(j) && j2 == 0) ? null : message;
        if (!TextUtils.isEmpty(charSequence) || message2 != null || richMessage != null) {
            tL_draftMessage = new TLRPC.TL_draftMessage();
        } else {
            tL_draftMessage = new TLRPC.TL_draftMessageEmpty();
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
                tL_inputReplyToMessage.quote_text = replyQuote.getText();
                TLRPC.InputReplyTo inputReplyTo2 = tL_draftMessage.reply_to;
                if (inputReplyTo2.quote_text != null) {
                    inputReplyTo2.flags |= 20;
                    inputReplyTo2.quote_offset = replyQuote.start;
                }
                inputReplyTo2.quote_entities = replyQuote.getEntities();
                ArrayList<TLRPC.MessageEntity> arrayList2 = tL_draftMessage.reply_to.quote_entities;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    tL_draftMessage.reply_to.quote_entities = new ArrayList<>(tL_draftMessage.reply_to.quote_entities);
                    tL_draftMessage.reply_to.flags |= 8;
                }
                MessageObject messageObject = replyQuote.message;
                if (messageObject != null && messageObject.messageOwner != null) {
                    TLRPC.Peer peer = getMessagesController().getPeer(j);
                    TLRPC.Peer peer2 = replyQuote.message.messageOwner.peer_id;
                    if (peer != null && !MessageObject.peersEqual(peer, peer2)) {
                        TLRPC.InputReplyTo inputReplyTo3 = tL_draftMessage.reply_to;
                        inputReplyTo3.flags |= 2;
                        inputReplyTo3.reply_to_peer_id = getMessagesController().getInputPeer(peer2);
                    }
                }
            } else if (j != MessageObject.getDialogId(message2)) {
                TLRPC.InputReplyTo inputReplyTo4 = tL_draftMessage.reply_to;
                inputReplyTo4.flags |= 2;
                inputReplyTo4.reply_to_peer_id = getMessagesController().getInputPeer(getMessagesController().getPeer(MessageObject.getDialogId(message2)));
            }
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            tL_draftMessage.entities = arrayList;
            tL_draftMessage.flags |= 8;
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
        if (ChatObject.isMonoForum(chat) && ChatObject.canManageMonoForum(this.currentAccount, chat)) {
            tL_draftMessage.flags |= 16;
            TLRPC.InputReplyTo inputReplyTo5 = tL_draftMessage.reply_to;
            if (inputReplyTo5 == null) {
                TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                tL_draftMessage.reply_to = tL_inputReplyToMonoForum;
                tL_inputReplyToMonoForum.monoforum_peer_id = getMessagesController().getInputPeer(j2);
            } else {
                inputReplyTo5.monoforum_peer_id = getMessagesController().getInputPeer(j2);
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
                getConnectionsManager().sendRequest(tL_messages_saveDraft, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        MediaDataController.m602$r8$lambda$WZs7AxQZLHr9fyhWcAuWS8fClM(tLObject, tL_error);
                    }
                });
            }
            getMessagesController().sortDialogs(null);
            getNotificationCenter().postNotificationName(NotificationCenter.dialogsNeedReload, new Object[0]);
        }
    }

    private static boolean suggestedPostEquals(TLRPC.SuggestedPost suggestedPost, TLRPC.SuggestedPost suggestedPost2) {
        if (suggestedPost == suggestedPost2) {
            return true;
        }
        return (suggestedPost == null) == (suggestedPost2 == null) && !AmountUtils$Amount.equals(suggestedPost.price, suggestedPost2.price) && suggestedPost.schedule_date == suggestedPost2.schedule_date && suggestedPost.accepted == suggestedPost2.accepted && suggestedPost.rejected == suggestedPost2.rejected;
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
        if (draftMessage == null || (draftMessage instanceof TLRPC.TL_draftMessageEmpty)) {
            LongSparseArray longSparseArray = (LongSparseArray) this.drafts.get(j);
            if (longSparseArray != null) {
                longSparseArray.remove(j2);
                if (longSparseArray.size() == 0) {
                    this.drafts.remove(j);
                }
            }
            LongSparseArray longSparseArray2 = (LongSparseArray) this.draftMessages.get(j);
            if (longSparseArray2 != null) {
                longSparseArray2.remove(j2);
                if (longSparseArray2.size() == 0) {
                    this.draftMessages.remove(j);
                }
            }
            if (j2 == 0) {
                this.draftPreferences.edit().remove("" + j).remove("r_" + j).commit();
            } else {
                this.draftPreferences.edit().remove("t_" + j + "_" + j2).remove("rt_" + j + "_" + j2).commit();
            }
            messagesController.removeDraftDialogIfNeed(j);
        } else {
            LongSparseArray longSparseArray3 = (LongSparseArray) this.drafts.get(j);
            if (longSparseArray3 == null) {
                longSparseArray3 = new LongSparseArray();
                this.drafts.put(j, longSparseArray3);
            }
            longSparseArray3.put(j2, draftMessage);
            if (j2 == 0) {
                messagesController.putDraftDialogIfNeed(j, draftMessage);
            }
            try {
                SerializedData serializedData = new SerializedData(draftMessage.getObjectSize());
                draftMessage.serializeToStream(serializedData);
                if (j2 == 0) {
                    sb2 = new StringBuilder();
                    sb2.append("");
                    sb2.append(j);
                } else {
                    sb2 = new StringBuilder();
                    sb2.append("t_");
                    sb2.append(j);
                    sb2.append("_");
                    sb2.append(j2);
                }
                editorEdit.putString(sb2.toString(), Utilities.bytesToHex(serializedData.toByteArray()));
                serializedData.cleanup();
            } catch (Exception e) {
                FileLog.e(e);
            }
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
                editorEdit.remove("rt_" + j + "_" + j2);
            }
        } else {
            if (longSparseArray4 == null) {
                longSparseArray4 = new LongSparseArray();
                this.draftMessages.put(j, longSparseArray4);
            }
            longSparseArray4.put(j2, message2);
            try {
                SerializedData serializedData2 = new SerializedData(message2.getObjectSize());
                message2.serializeToStream(serializedData2);
                if (j2 == 0) {
                    sb = new StringBuilder();
                    sb.append("r_");
                    sb.append(j);
                } else {
                    sb = new StringBuilder();
                    sb.append("rt_");
                    sb.append(j);
                    sb.append("_");
                    sb.append(j2);
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
                            public final void run() {
                                MediaDataController.m595$r8$lambda$S3ZXfD3P0p5hzjo4j3DPxKUUaA(this.f$0, i, j4, j5, j, j2);
                            }
                        });
                    }
                }
                getNotificationCenter().postNotificationName(NotificationCenter.newDraftReceived, Long.valueOf(j));
            }
        }
    }

    public static void m595$r8$lambda$S3ZXfD3P0p5hzjo4j3DPxKUUaA(final MediaDataController mediaDataController, int i, long j, long j2, final long j3, final long j4) {
        TLRPC.Message messageTLdeserialize;
        NativeByteBuffer nativeByteBufferByteBufferValue;
        mediaDataController.getClass();
        try {
            SQLiteCursor sQLiteCursorQueryFinalized = mediaDataController.getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT data, replydata FROM messages_v2 WHERE mid = %d and uid = %d", Integer.valueOf(i), Long.valueOf(j)), new Object[0]);
            TLRPC.Message message = null;
            if (sQLiteCursorQueryFinalized.next()) {
                NativeByteBuffer nativeByteBufferByteBufferValue2 = sQLiteCursorQueryFinalized.byteBufferValue(0);
                if (nativeByteBufferByteBufferValue2 != null) {
                    messageTLdeserialize = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue2, nativeByteBufferByteBufferValue2.readInt32(false), false);
                    messageTLdeserialize.readAttachPath(nativeByteBufferByteBufferValue2, mediaDataController.getUserConfig().clientUserId);
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
                                messageTLdeserialize2.readAttachPath(nativeByteBufferByteBufferValue, mediaDataController.getUserConfig().clientUserId);
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
                        mediaDataController.getMessagesStorage().checkSQLException(e);
                    }
                    mediaDataController.getMessagesStorage().loadReplyMessages(longSparseArray, longSparseArray2, arrayList, arrayList2, 0);
                }
                message = messageTLdeserialize;
            }
            sQLiteCursorQueryFinalized.dispose();
            if (message != null) {
                mediaDataController.saveDraftReplyMessage(j3, j4, message);
                return;
            }
            if (j2 != 0) {
                TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                tL_channels_getMessages.channel = mediaDataController.getMessagesController().getInputChannel(j2);
                tL_channels_getMessages.id.add(Integer.valueOf(i));
                mediaDataController.getConnectionsManager().sendRequest(tL_channels_getMessages, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        MediaDataController.$r8$lambda$xz6PceWcGef3kAmz7fnGmfyyNFM(this.f$0, j3, j4, tLObject, tL_error);
                    }
                });
                return;
            }
            TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
            tL_messages_getMessages.id.add(Integer.valueOf(i));
            mediaDataController.getConnectionsManager().sendRequest(tL_messages_getMessages, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    MediaDataController.$r8$lambda$fkmk_26sfzdGlKgbaqb__4xGQ6E(this.f$0, j3, j4, tLObject, tL_error);
                }
            });
        } catch (Exception e2) {
            FileLog.e(e2);
        }
    }

    public static void $r8$lambda$xz6PceWcGef3kAmz7fnGmfyyNFM(MediaDataController mediaDataController, long j, long j2, TLObject tLObject, TLRPC.TL_error tL_error) {
        mediaDataController.getClass();
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            if (messages_messages.messages.isEmpty()) {
                return;
            }
            mediaDataController.saveDraftReplyMessage(j, j2, messages_messages.messages.get(0));
        }
    }

    public static void $r8$lambda$fkmk_26sfzdGlKgbaqb__4xGQ6E(MediaDataController mediaDataController, long j, long j2, TLObject tLObject, TLRPC.TL_error tL_error) {
        mediaDataController.getClass();
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            if (messages_messages.messages.isEmpty()) {
                return;
            }
            mediaDataController.saveDraftReplyMessage(j, j2, messages_messages.messages.get(0));
        }
    }

    private void saveDraftReplyMessage(final long j, final long j2, final TLRPC.Message message) {
        if (message == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$QJydNhjdek_aslqfSQwcOscAZT8(this.f$0, j, j2, message);
            }
        });
    }

    public static void $r8$lambda$QJydNhjdek_aslqfSQwcOscAZT8(MediaDataController mediaDataController, long j, long j2, TLRPC.Message message) {
        TLRPC.InputReplyTo inputReplyTo;
        String str;
        LongSparseArray longSparseArray = (LongSparseArray) mediaDataController.drafts.get(j);
        TLRPC.DraftMessage draftMessage = longSparseArray != null ? (TLRPC.DraftMessage) longSparseArray.get(j2) : null;
        if (draftMessage == null || (inputReplyTo = draftMessage.reply_to) == null || inputReplyTo.reply_to_msg_id != message.id) {
            return;
        }
        LongSparseArray longSparseArray2 = (LongSparseArray) mediaDataController.draftMessages.get(j);
        if (longSparseArray2 == null) {
            longSparseArray2 = new LongSparseArray();
            mediaDataController.draftMessages.put(j, longSparseArray2);
        }
        longSparseArray2.put(j2, message);
        SerializedData serializedData = new SerializedData(message.getObjectSize());
        message.serializeToStream(serializedData);
        SharedPreferences.Editor editorEdit = mediaDataController.draftPreferences.edit();
        if (j2 == 0) {
            str = "r_" + j;
        } else {
            str = "rt_" + j + "_" + j2;
        }
        editorEdit.putString(str, Utilities.bytesToHex(serializedData.toByteArray())).commit();
        mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.newDraftReceived, Long.valueOf(j));
        serializedData.cleanup();
    }

    public void clearAllDrafts(boolean z) {
        this.drafts.clear();
        this.draftMessages.clear();
        this.draftsFolderIds.clear();
        this.draftPreferences.edit().clear().commit();
        if (z) {
            getMessagesController().sortDialogs(null);
            getNotificationCenter().postNotificationName(NotificationCenter.dialogsNeedReload, new Object[0]);
        }
    }

    public void cleanDraft(long j, long j2, boolean z) {
        LongSparseArray longSparseArray = (LongSparseArray) this.drafts.get(j);
        TLRPC.DraftMessage draftMessage = longSparseArray != null ? (TLRPC.DraftMessage) longSparseArray.get(j2) : null;
        if (draftMessage == null) {
            return;
        }
        if (!z) {
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
                getMessagesController().sortDialogs(null);
                getNotificationCenter().postNotificationName(NotificationCenter.dialogsNeedReload, new Object[0]);
                return;
            }
            this.draftPreferences.edit().remove("t_" + j + "_" + j2).remove("rt_" + j + "_" + j2).commit();
            return;
        }
        TLRPC.InputReplyTo inputReplyTo = draftMessage.reply_to;
        if (inputReplyTo == null || inputReplyTo.reply_to_msg_id != 0) {
            if (inputReplyTo != null) {
                inputReplyTo.reply_to_msg_id = 0;
            }
            draftMessage.flags &= -2;
            saveDraft(j, j2, draftMessage.message, draftMessage.entities, null, null, null, 0L, draftMessage.no_webpage, true);
        }
    }

    public void beginTransaction() {
        this.inTransaction = true;
    }

    public void endTransaction() {
        this.inTransaction = false;
    }

    public void clearBotKeyboard(final MessagesStorage.TopicKey topicKey, final ArrayList<Integer> arrayList) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$AYuXjaiKdkziWpU_SK8QvjHB1is(this.f$0, arrayList, topicKey);
            }
        });
    }

    public static void $r8$lambda$AYuXjaiKdkziWpU_SK8QvjHB1is(MediaDataController mediaDataController, ArrayList arrayList, MessagesStorage.TopicKey topicKey) {
        mediaDataController.getClass();
        if (arrayList == null) {
            if (topicKey != null) {
                mediaDataController.botKeyboards.remove(topicKey);
                mediaDataController.botDialogKeyboards.remove(topicKey.dialogId);
                mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.botKeyboardDidLoad, null, topicKey);
                return;
            }
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            int iIntValue = ((Integer) arrayList.get(i)).intValue();
            long j = iIntValue;
            MessagesStorage.TopicKey topicKey2 = (MessagesStorage.TopicKey) mediaDataController.botKeyboardsByMids.get(j);
            if (topicKey2 != null) {
                mediaDataController.botKeyboards.remove(topicKey2);
                ArrayList arrayList2 = (ArrayList) mediaDataController.botDialogKeyboards.get(topicKey2.dialogId);
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
                        mediaDataController.botDialogKeyboards.remove(topicKey2.dialogId);
                    }
                }
                mediaDataController.botKeyboardsByMids.remove(j);
                mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.botKeyboardDidLoad, null, topicKey2);
            }
        }
    }

    public void clearBotKeyboard(final long j) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$iOWLtKp5xElLQR2mO7C_O2OciB0(this.f$0, j);
            }
        });
    }

    public static void $r8$lambda$iOWLtKp5xElLQR2mO7C_O2OciB0(MediaDataController mediaDataController, long j) {
        ArrayList arrayList = (ArrayList) mediaDataController.botDialogKeyboards.get(j);
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC.Message message = (TLRPC.Message) arrayList.get(i);
                int i2 = mediaDataController.currentAccount;
                MessagesStorage.TopicKey topicKeyOf = MessagesStorage.TopicKey.of(j, MessageObject.getTopicId(i2, message, ChatObject.isForum(i2, j)));
                mediaDataController.botKeyboards.remove(topicKeyOf);
                mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.botKeyboardDidLoad, null, topicKeyOf);
            }
        }
        mediaDataController.botDialogKeyboards.remove(j);
    }

    public void loadBotKeyboard(MessagesStorage.TopicKey topicKey) {
        loadBotKeyboard(topicKey, false);
    }

    public void loadBotKeyboard(final MessagesStorage.TopicKey topicKey, final boolean z) {
        TLRPC.Message message = this.botKeyboards.get(topicKey);
        if (message != null) {
            getNotificationCenter().postNotificationName(NotificationCenter.botKeyboardDidLoad, message, topicKey);
        } else {
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.$r8$lambda$KQW7tIhkEBkQ8PzEBDzYfOLQJ3k(this.f$0, topicKey, z);
                }
            });
        }
    }

    public static void $r8$lambda$KQW7tIhkEBkQ8PzEBDzYfOLQJ3k(final MediaDataController mediaDataController, final MessagesStorage.TopicKey topicKey, boolean z) {
        SQLiteCursor sQLiteCursorQueryFinalized;
        final TLRPC.Message messageTLdeserialize;
        NativeByteBuffer nativeByteBufferByteBufferValue;
        mediaDataController.getClass();
        try {
            if (topicKey.topicId != 0) {
                sQLiteCursorQueryFinalized = mediaDataController.getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT info FROM bot_keyboard_topics WHERE uid = %d AND tid = %d", Long.valueOf(topicKey.dialogId), Long.valueOf(topicKey.topicId)), new Object[0]);
            } else {
                sQLiteCursorQueryFinalized = mediaDataController.getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT info FROM bot_keyboard WHERE uid = %d", Long.valueOf(topicKey.dialogId)), new Object[0]);
            }
            if (!sQLiteCursorQueryFinalized.next() || sQLiteCursorQueryFinalized.isNull(0) || (nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0)) == null) {
                messageTLdeserialize = null;
            } else {
                messageTLdeserialize = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                nativeByteBufferByteBufferValue.reuse();
            }
            sQLiteCursorQueryFinalized.dispose();
            if (messageTLdeserialize != null || z) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.getNotificationCenter().postNotificationName(NotificationCenter.botKeyboardDidLoad, messageTLdeserialize, topicKey);
                    }
                });
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private TL_bots.BotInfo loadBotInfoInternal(long j, long j2) {
        TL_bots.BotInfo botInfoTLdeserialize;
        NativeByteBuffer nativeByteBufferByteBufferValue;
        SQLiteCursor sQLiteCursorQueryFinalized = getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT info FROM bot_info_v2 WHERE uid = %d AND dialogId = %d", Long.valueOf(j), Long.valueOf(j2)), new Object[0]);
        if (!sQLiteCursorQueryFinalized.next() || sQLiteCursorQueryFinalized.isNull(0) || (nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0)) == null) {
            botInfoTLdeserialize = null;
        } else {
            botInfoTLdeserialize = TL_bots.BotInfo.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
            nativeByteBufferByteBufferValue.reuse();
        }
        sQLiteCursorQueryFinalized.dispose();
        return botInfoTLdeserialize;
    }

    public TL_bots.BotInfo getBotInfoCached(long j, long j2) {
        return this.botInfos.get(j + "_" + j2);
    }

    public void loadBotInfo(long j, long j2, boolean z, int i) {
        loadBotInfo(j, j2, z, i, null);
    }

    public void loadBotInfo(final long j, final long j2, boolean z, final int i, final Utilities.Callback<TL_bots.BotInfo> callback) {
        if (z) {
            TL_bots.BotInfo botInfo = this.botInfos.get(j + "_" + j2);
            if (botInfo != null) {
                getNotificationCenter().postNotificationName(NotificationCenter.botInfoDidLoad, botInfo, Integer.valueOf(i));
                return;
            }
        }
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$ggYob6DEDPV41vDYGaEe_KT6Wws(this.f$0, j, j2, callback, i);
            }
        });
    }

    public static void $r8$lambda$ggYob6DEDPV41vDYGaEe_KT6Wws(final MediaDataController mediaDataController, long j, long j2, final Utilities.Callback callback, final int i) {
        mediaDataController.getClass();
        try {
            final TL_bots.BotInfo botInfoLoadBotInfoInternal = mediaDataController.loadBotInfoInternal(j, j2);
            if (botInfoLoadBotInfoInternal != null) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MediaDataController.$r8$lambda$5LmHwTllK_sQMGC4uY1sKt3ApQs(this.f$0, callback, botInfoLoadBotInfoInternal, i);
                    }
                });
            } else if (callback != null) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MediaDataController.$r8$lambda$sbB6YknnN0bztSfADJkwhHCwNSg(callback);
                    }
                });
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void $r8$lambda$5LmHwTllK_sQMGC4uY1sKt3ApQs(MediaDataController mediaDataController, Utilities.Callback callback, TL_bots.BotInfo botInfo, int i) {
        if (callback != null) {
            mediaDataController.getClass();
            callback.run(botInfo);
        }
        mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.botInfoDidLoad, botInfo, Integer.valueOf(i));
    }

    public static void $r8$lambda$sbB6YknnN0bztSfADJkwhHCwNSg(Utilities.Callback callback) {
        if (callback != null) {
            callback.run(null);
        }
    }

    public void putBotKeyboard(final MessagesStorage.TopicKey topicKey, final TLRPC.Message message) {
        SQLiteCursor sQLiteCursorQueryFinalized;
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast;
        if (topicKey == null) {
            return;
        }
        try {
            if (topicKey.topicId != 0) {
                sQLiteCursorQueryFinalized = getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT mid FROM bot_keyboard_topics WHERE uid = %d AND tid = %d", Long.valueOf(topicKey.dialogId), Long.valueOf(topicKey.topicId)), new Object[0]);
            } else {
                sQLiteCursorQueryFinalized = getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT mid FROM bot_keyboard WHERE uid = %d", Long.valueOf(topicKey.dialogId)), new Object[0]);
            }
            int iIntValue = sQLiteCursorQueryFinalized.next() ? sQLiteCursorQueryFinalized.intValue(0) : 0;
            sQLiteCursorQueryFinalized.dispose();
            if (iIntValue < message.id || MessageObject.isEphemeralMessageId(iIntValue) || MessageObject.isEphemeralMessageId(message.id)) {
                if (topicKey.topicId != 0) {
                    sQLitePreparedStatementExecuteFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO bot_keyboard_topics VALUES(?, ?, ?, ?)");
                } else {
                    sQLitePreparedStatementExecuteFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO bot_keyboard VALUES(?, ?, ?)");
                }
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
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MediaDataController.m582$r8$lambda$IXT_bQ5fTgLL0Zz9Ab31qR6iw(this.f$0, topicKey, message);
                    }
                });
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void m582$r8$lambda$IXT_bQ5fTgLL0Zz9Ab31qR6iw(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        TLRPC.Message message2 = mediaDataController.botKeyboards.get(topicKey);
        mediaDataController.botKeyboards.put(topicKey, message);
        ArrayList arrayList = (ArrayList) mediaDataController.botDialogKeyboards.get(topicKey.dialogId);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        arrayList.add(message);
        mediaDataController.botDialogKeyboards.put(topicKey.dialogId, arrayList);
        if (MessageObject.getChannelId(message) == 0) {
            if (message2 != null) {
                mediaDataController.botKeyboardsByMids.delete(message2.id);
            }
            mediaDataController.botKeyboardsByMids.put(message.id, topicKey);
        }
        mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.botKeyboardDidLoad, message, topicKey);
    }

    public void putBotInfo(final long j, final TL_bots.BotInfo botInfo) {
        if (botInfo == null) {
            return;
        }
        this.botInfos.put(botInfo.user_id + "_" + j, botInfo);
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$U8krXW2o3MT_QQengC4R2waI7lA(this.f$0, botInfo, j);
            }
        });
    }

    public static void $r8$lambda$U8krXW2o3MT_QQengC4R2waI7lA(MediaDataController mediaDataController, TL_bots.BotInfo botInfo, long j) {
        mediaDataController.getClass();
        try {
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = mediaDataController.getMessagesStorage().getDatabase().executeFast("REPLACE INTO bot_info_v2 VALUES(?, ?, ?)");
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

    public void updateBotInfo(final long j, final TL_update.TL_updateBotCommands tL_updateBotCommands) {
        TL_bots.BotInfo botInfo = this.botInfos.get(tL_updateBotCommands.bot_id + "_" + j);
        if (botInfo != null) {
            botInfo.commands = tL_updateBotCommands.commands;
            getNotificationCenter().postNotificationName(NotificationCenter.botInfoDidLoad, botInfo, 0);
        }
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.m596$r8$lambda$SKpsn_TgNJjemZqwu2jaiL25w(this.f$0, tL_updateBotCommands, j);
            }
        });
    }

    public static void m596$r8$lambda$SKpsn_TgNJjemZqwu2jaiL25w(MediaDataController mediaDataController, TL_update.TL_updateBotCommands tL_updateBotCommands, long j) {
        mediaDataController.getClass();
        try {
            TL_bots.BotInfo botInfoLoadBotInfoInternal = mediaDataController.loadBotInfoInternal(tL_updateBotCommands.bot_id, j);
            if (botInfoLoadBotInfoInternal != null) {
                botInfoLoadBotInfoInternal.commands = tL_updateBotCommands.commands;
            }
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = mediaDataController.getMessagesStorage().getDatabase().executeFast("REPLACE INTO bot_info_v2 VALUES(?, ?, ?)");
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

    public HashMap<String, TLRPC.TL_availableReaction> getReactionsMap() {
        return this.reactionsMap;
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

    public void setDoubleTapReaction(String str) {
        MessagesController.getEmojiSettings(this.currentAccount).edit().putString("reaction_on_double_tap", str).apply();
        this.doubleTapReaction = str;
    }

    public List<TLRPC.TL_availableReaction> getEnabledReactionsList() {
        return this.enabledReactionsList;
    }

    public void uploadRingtone(String str) {
        if (this.ringtoneUploaderHashMap.containsKey(str)) {
            return;
        }
        this.ringtoneUploaderHashMap.put(str, new RingtoneUploader(str, this.currentAccount));
        this.ringtoneDataStore.addUploadingTone(str);
    }

    public void onRingtoneUploaded(String str, TLRPC.Document document, boolean z) {
        this.ringtoneUploaderHashMap.remove(str);
        this.ringtoneDataStore.onRingtoneUploaded(str, document, z);
    }

    public void checkRingtones(boolean z) {
        this.ringtoneDataStore.loadUserRingtones(z);
    }

    public boolean saveToRingtones(final TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        if (this.ringtoneDataStore.contains(document.id)) {
            return true;
        }
        if (document.size > MessagesController.getInstance(this.currentAccount).ringtoneSizeMax) {
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax / 1024)));
            return false;
        }
        for (int i = 0; i < document.attributes.size(); i++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && documentAttribute.duration > MessagesController.getInstance(this.currentAccount).ringtoneDurationMax) {
                NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax)));
                return false;
            }
        }
        TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        saveringtone.id = tL_inputDocument;
        tL_inputDocument.id = document.id;
        tL_inputDocument.file_reference = document.file_reference;
        tL_inputDocument.access_hash = document.access_hash;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(saveringtone, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                MediaDataController.m614$r8$lambda$iFgqLoPbncYX9pMSYWWk_Z0Vw(this.f$0, document, tLObject, tL_error);
            }
        });
        return true;
    }

    public static void m614$r8$lambda$iFgqLoPbncYX9pMSYWWk_Z0Vw(final MediaDataController mediaDataController, final TLRPC.Document document, final TLObject tLObject, TLRPC.TL_error tL_error) {
        mediaDataController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.m598$r8$lambda$T5g6b42sl6s9Xq4TQBiybPE91M(this.f$0, tLObject, document);
            }
        });
    }

    public static void m598$r8$lambda$T5g6b42sl6s9Xq4TQBiybPE91M(MediaDataController mediaDataController, TLObject tLObject, TLRPC.Document document) {
        mediaDataController.getClass();
        if (tLObject != null) {
            if (tLObject instanceof TL_account.TL_savedRingtoneConverted) {
                mediaDataController.ringtoneDataStore.addTone(((TL_account.TL_savedRingtoneConverted) tLObject).document);
            } else {
                mediaDataController.ringtoneDataStore.addTone(document);
            }
        }
    }

    public void preloadPremiumPreviewStickers() {
        if (this.previewStickersLoading || !this.premiumPreviewStickers.isEmpty()) {
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
            return;
        }
        TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
        tL_messages_getStickers.emoticon = Emoji.fixEmoji("⭐") + Emoji.fixEmoji("⭐");
        tL_messages_getStickers.hash = 0L;
        this.previewStickersLoading = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getStickers, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                MediaDataController.m612$r8$lambda$eHtA2afNm4O4_eAEgvKJrTh56I(this.f$0, tLObject, tL_error);
            }
        });
    }

    public static void m612$r8$lambda$eHtA2afNm4O4_eAEgvKJrTh56I(final MediaDataController mediaDataController, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        mediaDataController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$iAgjts94CzEsU7xI8eXrr9HQ1qk(this.f$0, tL_error, tLObject);
            }
        });
    }

    public static void $r8$lambda$iAgjts94CzEsU7xI8eXrr9HQ1qk(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            mediaDataController.getClass();
            return;
        }
        mediaDataController.previewStickersLoading = false;
        mediaDataController.premiumPreviewStickers.clear();
        mediaDataController.premiumPreviewStickers.addAll(((TLRPC.TL_messages_stickers) tLObject).stickers);
        NotificationCenter.getInstance(mediaDataController.currentAccount).postNotificationName(NotificationCenter.premiumStickersPreviewLoaded, new Object[0]);
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

    public void moveStickerSetToTop(long j, boolean z, boolean z2) {
        int i = z ? 5 : z2 ? 1 : 0;
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = getStickerSets(i);
        if (stickerSets != null) {
            for (int i2 = 0; i2 < stickerSets.size(); i2++) {
                if (stickerSets.get(i2).set.id == j) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i2);
                    stickerSets.remove(i2);
                    stickerSets.add(0, tL_messages_stickerSet);
                    getNotificationCenter().postNotificationName(NotificationCenter.stickersDidLoad, Integer.valueOf(i), Boolean.FALSE);
                    return;
                }
            }
        }
    }

    public void applyAttachMenuBot(TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot) {
        this.attachMenuBots.bots.add(tL_attachMenuBotsBot.bot);
        loadAttachMenuBots(false, true);
    }

    public boolean botInAttachMenu(long j) {
        for (int i = 0; i < this.attachMenuBots.bots.size(); i++) {
            if (this.attachMenuBots.bots.get(i).bot_id == j) {
                return true;
            }
        }
        return false;
    }

    public TLRPC.TL_attachMenuBot findBotInAttachMenu(long j) {
        for (int i = 0; i < this.attachMenuBots.bots.size(); i++) {
            if (this.attachMenuBots.bots.get(i).bot_id == j) {
                return this.attachMenuBots.bots.get(i);
            }
        }
        return null;
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

    public void fetchNewEmojiKeywords(String[] strArr) {
        fetchNewEmojiKeywords(strArr, false);
    }

    public void fetchNewEmojiKeywords(String[] strArr, boolean z) {
        if (strArr == null) {
            return;
        }
        for (final String str : strArr) {
            if (TextUtils.isEmpty(str) || this.currentFetchingEmoji.get(str) != null) {
                return;
            }
            if (z && this.fetchedEmoji.contains(str)) {
                return;
            }
            this.currentFetchingEmoji.put(str, Boolean.TRUE);
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.$r8$lambda$_5Hm3mCaZrK2AFtIXeiN9ipM1H0(this.f$0, str);
                }
            });
        }
    }

    public static void $r8$lambda$_5Hm3mCaZrK2AFtIXeiN9ipM1H0(final MediaDataController mediaDataController, final String str) {
        final int iIntValue;
        TLObject tLObject;
        mediaDataController.getClass();
        final String strStringValue = null;
        long jLongValue = 0;
        try {
            try {
                SQLiteCursor sQLiteCursorQueryFinalized = mediaDataController.getMessagesStorage().getDatabase().queryFinalized("SELECT alias, version, date FROM emoji_keywords_info_v2 WHERE lang = ?", str);
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
                FileLog.e(e);
                if (BuildVars.DEBUG_VERSION) {
                }
                if (iIntValue == -1) {
                    TLRPC.TL_messages_getEmojiKeywords tL_messages_getEmojiKeywords = new TLRPC.TL_messages_getEmojiKeywords();
                    tL_messages_getEmojiKeywords.lang_code = str;
                    tLObject = tL_messages_getEmojiKeywords;
                } else {
                    TLRPC.TL_messages_getEmojiKeywordsDifference tL_messages_getEmojiKeywordsDifference = new TLRPC.TL_messages_getEmojiKeywordsDifference();
                    tL_messages_getEmojiKeywordsDifference.lang_code = str;
                    tL_messages_getEmojiKeywordsDifference.from_version = iIntValue;
                    tLObject = tL_messages_getEmojiKeywordsDifference;
                }
                mediaDataController.getConnectionsManager().sendRequest(tLObject, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                        MediaDataController.$r8$lambda$Y3famJJvSB89cb_b3eBYaaWfFrQ(this.f$0, iIntValue, strStringValue, str, tLObject2, tL_error);
                    }
                });
            }
        } catch (Exception e3) {
            e = e3;
        }
        if (BuildVars.DEBUG_VERSION && Math.abs(System.currentTimeMillis() - jLongValue) < 3600000) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.m616$r8$lambda$iVuGvODdmV9ha7PeAkvfaR1Usg(this.f$0, str);
                }
            });
            return;
        }
        if (iIntValue == -1) {
            TLRPC.TL_messages_getEmojiKeywords tL_messages_getEmojiKeywords2 = new TLRPC.TL_messages_getEmojiKeywords();
            tL_messages_getEmojiKeywords2.lang_code = str;
            tLObject = tL_messages_getEmojiKeywords2;
        } else {
            TLRPC.TL_messages_getEmojiKeywordsDifference tL_messages_getEmojiKeywordsDifference2 = new TLRPC.TL_messages_getEmojiKeywordsDifference();
            tL_messages_getEmojiKeywordsDifference2.lang_code = str;
            tL_messages_getEmojiKeywordsDifference2.from_version = iIntValue;
            tLObject = tL_messages_getEmojiKeywordsDifference2;
        }
        mediaDataController.getConnectionsManager().sendRequest(tLObject, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                MediaDataController.$r8$lambda$Y3famJJvSB89cb_b3eBYaaWfFrQ(this.f$0, iIntValue, strStringValue, str, tLObject2, tL_error);
            }
        });
    }

    public static void m616$r8$lambda$iVuGvODdmV9ha7PeAkvfaR1Usg(MediaDataController mediaDataController, String str) {
        mediaDataController.currentFetchingEmoji.remove(str);
        mediaDataController.fetchedEmoji.add(str);
        mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.emojiKeywordsLoaded, new Object[0]);
    }

    public static void $r8$lambda$Y3famJJvSB89cb_b3eBYaaWfFrQ(final MediaDataController mediaDataController, int i, String str, final String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
        mediaDataController.getClass();
        if (tLObject != null) {
            TLRPC.TL_emojiKeywordsDifference tL_emojiKeywordsDifference = (TLRPC.TL_emojiKeywordsDifference) tLObject;
            if (i != -1 && !tL_emojiKeywordsDifference.lang_code.equals(str)) {
                mediaDataController.getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        MediaDataController.$r8$lambda$SQuMh5C5nYW3kTKk9xplhk_wvDA(this.f$0, str2);
                    }
                });
                return;
            } else {
                mediaDataController.putEmojiKeywords(str2, tL_emojiKeywordsDifference);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.getNotificationCenter().postNotificationName(NotificationCenter.emojiKeywordsLoaded, new Object[0]);
                    }
                });
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$SuT8RNea0D8Ft4GRy0BKqyI4tCo(this.f$0, str2);
            }
        });
    }

    public static void $r8$lambda$SQuMh5C5nYW3kTKk9xplhk_wvDA(final MediaDataController mediaDataController, final String str) {
        mediaDataController.getClass();
        try {
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = mediaDataController.getMessagesStorage().getDatabase().executeFast("DELETE FROM emoji_keywords_info_v2 WHERE lang = ?");
            sQLitePreparedStatementExecuteFast.bindString(1, str);
            sQLitePreparedStatementExecuteFast.step();
            sQLitePreparedStatementExecuteFast.dispose();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.$r8$lambda$s0wyZAJmrLTdIaQSpw2XAftiGjA(this.f$0, str);
                }
            });
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void $r8$lambda$s0wyZAJmrLTdIaQSpw2XAftiGjA(MediaDataController mediaDataController, String str) {
        mediaDataController.currentFetchingEmoji.remove(str);
        mediaDataController.fetchedEmoji.add(str);
        mediaDataController.fetchNewEmojiKeywords(new String[]{str});
        mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.emojiKeywordsLoaded, new Object[0]);
    }

    public static void $r8$lambda$SuT8RNea0D8Ft4GRy0BKqyI4tCo(MediaDataController mediaDataController, String str) {
        mediaDataController.currentFetchingEmoji.remove(str);
        mediaDataController.fetchedEmoji.add(str);
        mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.emojiKeywordsLoaded, new Object[0]);
    }

    private void putEmojiKeywords(final String str, final TLRPC.TL_emojiKeywordsDifference tL_emojiKeywordsDifference) {
        if (tL_emojiKeywordsDifference == null) {
            return;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.m630$r8$lambda$urwhPnqTtEgwaFdaJZ79bFTyhk(this.f$0, tL_emojiKeywordsDifference, str);
            }
        });
    }

    public static void m630$r8$lambda$urwhPnqTtEgwaFdaJZ79bFTyhk(final MediaDataController mediaDataController, TLRPC.TL_emojiKeywordsDifference tL_emojiKeywordsDifference, final String str) {
        mediaDataController.getClass();
        try {
            if (!tL_emojiKeywordsDifference.keywords.isEmpty()) {
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast = mediaDataController.getMessagesStorage().getDatabase().executeFast("REPLACE INTO emoji_keywords_v2 VALUES(?, ?, ?)");
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast2 = mediaDataController.getMessagesStorage().getDatabase().executeFast("DELETE FROM emoji_keywords_v2 WHERE lang = ? AND keyword = ? AND emoji = ?");
                mediaDataController.getMessagesStorage().getDatabase().beginTransaction();
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
                mediaDataController.getMessagesStorage().getDatabase().commitTransaction();
                sQLitePreparedStatementExecuteFast.dispose();
                sQLitePreparedStatementExecuteFast2.dispose();
            }
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast3 = mediaDataController.getMessagesStorage().getDatabase().executeFast("REPLACE INTO emoji_keywords_info_v2 VALUES(?, ?, ?, ?)");
            sQLitePreparedStatementExecuteFast3.bindString(1, str);
            sQLitePreparedStatementExecuteFast3.bindString(2, tL_emojiKeywordsDifference.lang_code);
            sQLitePreparedStatementExecuteFast3.bindInteger(3, tL_emojiKeywordsDifference.version);
            sQLitePreparedStatementExecuteFast3.bindLong(4, System.currentTimeMillis());
            sQLitePreparedStatementExecuteFast3.step();
            sQLitePreparedStatementExecuteFast3.dispose();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.$r8$lambda$uKN7bGoHBg46vSt3AggnSGH2wxk(this.f$0, str);
                }
            });
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void $r8$lambda$uKN7bGoHBg46vSt3AggnSGH2wxk(MediaDataController mediaDataController, String str) {
        mediaDataController.currentFetchingEmoji.remove(str);
        mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.newEmojiSuggestionsAvailable, str);
    }

    public void getAnimatedEmojiByKeywords(final String str, final Utilities.Callback<ArrayList<Long>> callback) {
        if (str == null) {
            if (callback != null) {
                callback.run(new ArrayList<>());
            }
        } else {
            final ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = getStickerSets(5);
            final ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = getFeaturedEmojiSets();
            Utilities.searchQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.m610$r8$lambda$cxeqFF4P0SxyV_You7W9Rl_oqo(str, stickerSets, featuredEmojiSets, callback);
                }
            });
        }
    }

    public static void m610$r8$lambda$cxeqFF4P0SxyV_You7W9Rl_oqo(String str, ArrayList arrayList, ArrayList arrayList2, Utilities.Callback callback) {
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

    public void getEmojiNames(final String[] strArr, final String str, final Utilities.Callback<ArrayList<String>> callback) {
        if (callback == null || str == null) {
            return;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.m571$r8$lambda$8cQlsWXJbJctLU2PYbNaB7lRbs(this.f$0, strArr, str, callback);
            }
        });
    }

    public static void m571$r8$lambda$8cQlsWXJbJctLU2PYbNaB7lRbs(MediaDataController mediaDataController, String[] strArr, String str, final Utilities.Callback callback) {
        mediaDataController.getClass();
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
                    SQLiteCursor sQLiteCursorQueryFinalized = mediaDataController.getMessagesStorage().getDatabase().queryFinalized("SELECT alias FROM emoji_keywords_info_v2 WHERE lang = ?", strArr[i]);
                    if (sQLiteCursorQueryFinalized.next()) {
                        strArr[i] = sQLiteCursorQueryFinalized.stringValue(0);
                    }
                    sQLiteCursorQueryFinalized.dispose();
                    int i2 = i + 1;
                    objArr[i2] = strArr[i];
                    i = i2;
                }
                sQLiteCursorQuery = mediaDataController.getMessagesStorage().getDatabase().executeFast("SELECT keyword FROM emoji_keywords_v2 WHERE emoji = ? AND (" + str2 + ")").query(objArr);
                final ArrayList arrayList = new ArrayList();
                while (sQLiteCursorQuery.next()) {
                    arrayList.add(sQLiteCursorQuery.stringValue(0));
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        callback.run(arrayList);
                    }
                });
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

    public void getEmojiSuggestions(String[] strArr, String str, boolean z, KeywordResultCallback keywordResultCallback, boolean z2) {
        getEmojiSuggestions(strArr, str, z, keywordResultCallback, null, z2, false, false, null);
    }

    public void getEmojiSuggestions(String[] strArr, String str, boolean z, KeywordResultCallback keywordResultCallback, CountDownLatch countDownLatch, boolean z2) {
        getEmojiSuggestions(strArr, str, z, keywordResultCallback, countDownLatch, z2, false, false, null);
    }

    public void getEmojiSuggestions(String[] strArr, String str, boolean z, KeywordResultCallback keywordResultCallback, CountDownLatch countDownLatch, boolean z2, boolean z3, boolean z4, Integer num) {
        getEmojiSuggestions(strArr, str, z, keywordResultCallback, countDownLatch, z2, z3, z4, false, num, false);
    }

    public void getEmojiSuggestions(final String[] strArr, final String str, final boolean z, final KeywordResultCallback keywordResultCallback, final CountDownLatch countDownLatch, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final Integer num, final boolean z6) {
        if (keywordResultCallback == null) {
            return;
        }
        if (TextUtils.isEmpty(str) || strArr == null) {
            keywordResultCallback.run(new ArrayList<>(), null);
            return;
        }
        final ArrayList arrayList = new ArrayList(Emoji.recentEmoji);
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$PbJJfDKCjtf_RV8XzcO8si8XX3I(this.f$0, strArr, keywordResultCallback, z4, str, z, arrayList, z2, num, z3, z5, z6, countDownLatch);
            }
        });
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (Throwable unused) {
            }
        }
    }

    public static void $r8$lambda$PbJJfDKCjtf_RV8XzcO8si8XX3I(final MediaDataController mediaDataController, final String[] strArr, final KeywordResultCallback keywordResultCallback, boolean z, String str, boolean z2, final ArrayList arrayList, boolean z3, Integer num, boolean z4, boolean z5, boolean z6, final CountDownLatch countDownLatch) {
        String str2;
        StringBuilder sb;
        int length;
        String string;
        SQLiteCursor sQLiteCursorQueryFinalized;
        String strReplace;
        char cCharAt;
        mediaDataController.getClass();
        final ArrayList<KeywordResult> arrayList2 = new ArrayList<>();
        HashMap map = new HashMap();
        ?? r9 = 0;
        boolean z7 = false;
        final String strStringValue = null;
        while (r9 < strArr.length) {
            try {
                SQLiteCursor sQLiteCursorQueryFinalized2 = mediaDataController.getMessagesStorage().getDatabase().queryFinalized("SELECT alias FROM emoji_keywords_info_v2 WHERE lang = ?", strArr[r9]);
                if (sQLiteCursorQueryFinalized2.next()) {
                    strStringValue = sQLiteCursorQueryFinalized2.stringValue(0);
                }
                sQLiteCursorQueryFinalized2.dispose();
                if (strStringValue != null) {
                    z7 = true;
                }
                r9++;
            } catch (Exception e) {
                e = e;
                r9 = mediaDataController;
            }
        }
        try {
            if (!z7) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MediaDataController.m609$r8$lambda$bncPsVJsxoJpAKu0403PoEddRs(this.f$0, strArr, keywordResultCallback, arrayList2);
                    }
                });
                return;
            }
            r9 = mediaDataController;
            if (z) {
                int[] iArr = new int[1];
                str2 = str;
                ArrayList<Emoji.EmojiSpanRange> emojis = Emoji.parseEmojis(str2, iArr);
                if (iArr[0] > 0) {
                    for (int i = 0; i < emojis.size(); i++) {
                        String string2 = emojis.get(i).code.toString();
                        int i2 = 0;
                        while (true) {
                            if (i2 < arrayList2.size()) {
                                if (TextUtils.equals(arrayList2.get(i2).emoji, string2)) {
                                    break;
                                } else {
                                    i2++;
                                }
                            } else {
                                KeywordResult keywordResult = new KeywordResult();
                                keywordResult.emoji = string2;
                                keywordResult.keyword = "";
                                arrayList2.add(keywordResult);
                                break;
                            }
                        }
                    }
                }
            } else {
                str2 = str;
            }
            String lowerCase = str2.toLowerCase();
            for (int i3 = 0; i3 < 2; i3++) {
                if (i3 == 1) {
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
                            sQLiteCursorQueryFinalized = r9.getMessagesStorage().getDatabase().queryFinalized("SELECT emoji, keyword FROM emoji_keywords_v2 WHERE keyword = ?", lowerCase);
                        } else if (string != null) {
                            sQLiteCursorQueryFinalized = r9.getMessagesStorage().getDatabase().queryFinalized("SELECT emoji, keyword FROM emoji_keywords_v2 WHERE keyword >= ? AND keyword < ?", lowerCase, string);
                        } else {
                            lowerCase = lowerCase + "%";
                            sQLiteCursorQueryFinalized = r9.getMessagesStorage().getDatabase().queryFinalized("SELECT emoji, keyword FROM emoji_keywords_v2 WHERE keyword LIKE ?", lowerCase);
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
                        sQLiteCursorQueryFinalized = r9.getMessagesStorage().getDatabase().queryFinalized("SELECT emoji, keyword FROM emoji_keywords_v2 WHERE keyword = ?", lowerCase);
                    } else if (string != null) {
                        sQLiteCursorQueryFinalized = r9.getMessagesStorage().getDatabase().queryFinalized("SELECT emoji, keyword FROM emoji_keywords_v2 WHERE keyword >= ? AND keyword < ?", lowerCase, string);
                    } else {
                        lowerCase = lowerCase + "%";
                        sQLiteCursorQueryFinalized = r9.getMessagesStorage().getDatabase().queryFinalized("SELECT emoji, keyword FROM emoji_keywords_v2 WHERE keyword LIKE ?", lowerCase);
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
            Collections.sort(arrayList2, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    return MediaDataController.$r8$lambda$cWw1ywWqVJWAGCfCJBWqFcDrfko(arrayList, (MediaDataController.KeywordResult) obj, (MediaDataController.KeywordResult) obj2);
                }
            });
            if (z3) {
                r9.fillWithAnimatedEmoji(arrayList2, num, z4, z5, z6, new Runnable() {
                    @Override
                    public final void run() {
                        MediaDataController.$r8$lambda$yuBteZ0pfxNj6R5lprMiZWMy6eQ(countDownLatch, keywordResultCallback, arrayList2, strStringValue);
                    }
                });
            } else if (countDownLatch != null) {
                keywordResultCallback.run(arrayList2, strStringValue);
                countDownLatch.countDown();
            } else {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        keywordResultCallback.run(arrayList2, strStringValue);
                    }
                });
            }
        } catch (Exception e2) {
            e = e2;
            FileLog.e(e);
        }
        FileLog.e(e);
        Collections.sort(arrayList2, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return MediaDataController.$r8$lambda$cWw1ywWqVJWAGCfCJBWqFcDrfko(arrayList, (MediaDataController.KeywordResult) obj, (MediaDataController.KeywordResult) obj2);
            }
        });
        if (z3) {
            r9.fillWithAnimatedEmoji(arrayList2, num, z4, z5, z6, new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.$r8$lambda$yuBteZ0pfxNj6R5lprMiZWMy6eQ(countDownLatch, keywordResultCallback, arrayList2, strStringValue);
                }
            });
        } else if (countDownLatch != null) {
            keywordResultCallback.run(arrayList2, strStringValue);
            countDownLatch.countDown();
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    keywordResultCallback.run(arrayList2, strStringValue);
                }
            });
        }
    }

    public static void m609$r8$lambda$bncPsVJsxoJpAKu0403PoEddRs(MediaDataController mediaDataController, String[] strArr, KeywordResultCallback keywordResultCallback, ArrayList arrayList) {
        mediaDataController.getClass();
        for (String str : strArr) {
            if (mediaDataController.currentFetchingEmoji.get(str) != null) {
                return;
            }
        }
        keywordResultCallback.run(arrayList, null);
    }

    public static int $r8$lambda$cWw1ywWqVJWAGCfCJBWqFcDrfko(ArrayList arrayList, KeywordResult keywordResult, KeywordResult keywordResult2) {
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

    public static void $r8$lambda$yuBteZ0pfxNj6R5lprMiZWMy6eQ(CountDownLatch countDownLatch, final KeywordResultCallback keywordResultCallback, final ArrayList arrayList, final String str) {
        if (countDownLatch != null) {
            keywordResultCallback.run(arrayList, str);
            countDownLatch.countDown();
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    keywordResultCallback.run(arrayList, str);
                }
            });
        }
    }

    public void fillWithAnimatedEmoji(final ArrayList<KeywordResult> arrayList, final Integer num, final boolean z, final boolean z2, boolean z3, final Runnable runnable) {
        if (arrayList == null || arrayList.isEmpty()) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        final ArrayList[] arrayListArr = {getStickerSets(5)};
        final Runnable runnable2 = new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$UQKu29jWmlP107jarxMLC7Royo0(this.f$0, num, arrayList, z2, z, arrayListArr, runnable);
            }
        };
        ArrayList arrayList2 = arrayListArr[0];
        if ((arrayList2 == null || arrayList2.isEmpty()) && !this.triedLoadingEmojipacks) {
            this.triedLoadingEmojipacks = true;
            final boolean[] zArr = new boolean[1];
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.$r8$lambda$eI00jvSEyu4AqRTyrJYTdqmxzeI(this.f$0, zArr, arrayListArr, runnable2);
                }
            });
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.$r8$lambda$tHBLE8EorteTTItc58SrB_Vu5ok(zArr, runnable2);
                }
            }, 900L);
            return;
        }
        runnable2.run();
    }

    public static void $r8$lambda$UQKu29jWmlP107jarxMLC7Royo0(MediaDataController mediaDataController, Integer num, ArrayList arrayList, boolean z, boolean z2, ArrayList[] arrayListArr, Runnable runnable) {
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
        MediaDataController mediaDataController2 = mediaDataController;
        ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = mediaDataController2.getFeaturedEmojiSets();
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
        if (!UserConfig.getInstance(mediaDataController2.currentAccount).isPremium() && !z) {
            z4 = false;
        }
        if (z2) {
            str = UserConfig.getInstance(mediaDataController2.currentAccount).defaultTopicIcons;
            if (arrayListArr[0] != null) {
                if (str != null) {
                    stickerSetByName = getInstance(mediaDataController2.currentAccount).getStickerSetByName(str);
                    if (stickerSetByName == null) {
                        stickerSetByName = getInstance(mediaDataController2.currentAccount).getStickerSetByEmojiOrName(str);
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
                                    TLRPC.Document documentFindDocument = AnimatedEmojiDrawable.findDocument(mediaDataController2.currentAccount, Long.parseLong(arrayList6.get(i7).substring(9)));
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
                    if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.packs != null) {
                        int i9 = 0;
                        while (i9 < tL_messages_stickerSet2.packs.size()) {
                            TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet2.packs.get(i9);
                            if (tL_stickerPack == null || (str4 = tL_stickerPack.emoticon) == null || !str4.contains(str5)) {
                                i4 = i8;
                            } else {
                                i4 = i8;
                                int i10 = 0;
                                while (true) {
                                    if (i10 < tL_stickerPack.documents.size()) {
                                        long jLongValue = tL_stickerPack.documents.get(i10).longValue();
                                        int i11 = i10;
                                        int i12 = 0;
                                        while (true) {
                                            if (i12 >= tL_messages_stickerSet2.documents.size()) {
                                                i5 = iMin;
                                                document = null;
                                                break;
                                            }
                                            document = tL_messages_stickerSet2.documents.get(i12);
                                            int i13 = i12;
                                            i5 = iMin;
                                            if (document != null && document.id == jLongValue) {
                                                break;
                                            }
                                            i12 = i13 + 1;
                                            iMin = i5;
                                        }
                                        if (document != null && document.attributes != null && !arrayList5.contains(document) && !hashSet.contains(Long.valueOf(document.id))) {
                                            hashSet.add(Long.valueOf(document.id));
                                            arrayList5.add(document);
                                            if (arrayList5.size() >= iIntValue) {
                                                break;
                                            }
                                        }
                                        i10 = i11 + 1;
                                        iMin = i5;
                                    }
                                }
                                i9++;
                                i8 = i4;
                                iMin = i5;
                            }
                            i5 = iMin;
                            i9++;
                            i8 = i4;
                            iMin = i5;
                        }
                        i3 = i8;
                        i = iMin;
                    } else {
                        i3 = i8;
                        i = iMin;
                        if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents != null) {
                            int i14 = 0;
                            while (i14 < tL_messages_stickerSet2.documents.size()) {
                                TLRPC.Document document2 = tL_messages_stickerSet2.documents.get(i14);
                                if (document2 != null && document2.attributes != null && !arrayList5.contains(document2)) {
                                    int i15 = 0;
                                    while (true) {
                                        if (i15 >= document2.attributes.size()) {
                                            tL_documentAttributeCustomEmoji2 = null;
                                            break;
                                        }
                                        TLRPC.DocumentAttribute documentAttribute = document2.attributes.get(i15);
                                        if (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) {
                                            tL_documentAttributeCustomEmoji2 = (TLRPC.TL_documentAttributeCustomEmoji) documentAttribute;
                                            break;
                                        }
                                        i15++;
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
                                i14++;
                                tL_messages_stickerSet2 = tL_messages_stickerSet;
                            }
                        }
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
            mediaDataController2 = mediaDataController;
            z4 = z3;
            featuredEmojiSets = arrayList2;
            iMin = i;
        }
        arrayList.addAll(0, arrayList4);
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void $r8$lambda$eI00jvSEyu4AqRTyrJYTdqmxzeI(MediaDataController mediaDataController, final boolean[] zArr, final ArrayList[] arrayListArr, final Runnable runnable) {
        mediaDataController.getClass();
        mediaDataController.loadStickers(5, true, false, false, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                MediaDataController.$r8$lambda$1pQrnYlyzs4VHNJtI1pGLouqD5k(zArr, arrayListArr, runnable, (ArrayList) obj);
            }
        });
    }

    public static void $r8$lambda$1pQrnYlyzs4VHNJtI1pGLouqD5k(boolean[] zArr, ArrayList[] arrayListArr, Runnable runnable, ArrayList arrayList) {
        if (zArr[0]) {
            return;
        }
        arrayListArr[0] = arrayList;
        runnable.run();
        zArr[0] = true;
    }

    public static void $r8$lambda$tHBLE8EorteTTItc58SrB_Vu5ok(boolean[] zArr, Runnable runnable) {
        if (zArr[0]) {
            return;
        }
        runnable.run();
        zArr[0] = true;
    }

    public void loadEmojiThemes() {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("emojithemes_config_" + this.currentAccount, 0);
        int i = sharedPreferences.getInt("count", 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ChatThemeBottomSheet.ChatThemeItem(EmojiThemes.createHomePreviewTheme(this.currentAccount)));
        for (int i2 = 0; i2 < i; i2++) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(sharedPreferences.getString("theme_" + i2, "")));
            try {
                EmojiThemes emojiThemesCreatePreviewFullTheme = EmojiThemes.createPreviewFullTheme(this.currentAccount, TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true));
                if (emojiThemesCreatePreviewFullTheme.items.size() >= 4) {
                    arrayList.add(new ChatThemeBottomSheet.ChatThemeItem(emojiThemesCreatePreviewFullTheme));
                }
                ChatThemeController.chatThemeQueue.postRunnable(new AnonymousClass2(arrayList));
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
    }

    class AnonymousClass2 implements Runnable {
        final ArrayList val$previewItems;

        AnonymousClass2(ArrayList arrayList) {
            this.val$previewItems = arrayList;
        }

        @Override
        public void run() {
            for (int i = 0; i < this.val$previewItems.size(); i++) {
                if (this.val$previewItems.get(i) != null && ((ChatThemeBottomSheet.ChatThemeItem) this.val$previewItems.get(i)).chatTheme != null) {
                    ((ChatThemeBottomSheet.ChatThemeItem) this.val$previewItems.get(i)).chatTheme.loadPreviewColors(0);
                }
            }
            final ArrayList arrayList = this.val$previewItems;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.AnonymousClass2.m638$r8$lambda$7yet5yrmz5YlBwQT1Kc_jev_W4(this.f$0, arrayList);
                }
            });
        }

        public static void m638$r8$lambda$7yet5yrmz5YlBwQT1Kc_jev_W4(AnonymousClass2 anonymousClass2, ArrayList arrayList) {
            MediaDataController.this.defaultEmojiThemes.clear();
            MediaDataController.this.defaultEmojiThemes.addAll(arrayList);
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
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new ChatThemeBottomSheet.ChatThemeItem(EmojiThemes.createHomePreviewTheme(i)));
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                EmojiThemes emojiThemesCreatePreviewFullTheme = EmojiThemes.createPreviewFullTheme(i, arrayList.get(i3));
                ChatThemeBottomSheet.ChatThemeItem chatThemeItem = new ChatThemeBottomSheet.ChatThemeItem(emojiThemesCreatePreviewFullTheme);
                if (emojiThemesCreatePreviewFullTheme.items.size() >= 4) {
                    arrayList2.add(chatThemeItem);
                }
            }
            ChatThemeController.chatThemeQueue.postRunnable(new AnonymousClass3(arrayList2, i));
            return;
        }
        this.defaultEmojiThemes.clear();
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.emojiPreviewThemesChanged, new Object[0]);
    }

    class AnonymousClass3 implements Runnable {
        final int val$currentAccount;
        final ArrayList val$previewItems;

        AnonymousClass3(ArrayList arrayList, int i) {
            this.val$previewItems = arrayList;
            this.val$currentAccount = i;
        }

        @Override
        public void run() {
            for (int i = 0; i < this.val$previewItems.size(); i++) {
                ((ChatThemeBottomSheet.ChatThemeItem) this.val$previewItems.get(i)).chatTheme.loadPreviewColors(this.val$currentAccount);
            }
            final ArrayList arrayList = this.val$previewItems;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.AnonymousClass3.m639$r8$lambda$2NBgZw5NZsyGGrmXGZYMs4c8eE(this.f$0, arrayList);
                }
            });
        }

        public static void m639$r8$lambda$2NBgZw5NZsyGGrmXGZYMs4c8eE(AnonymousClass3 anonymousClass3, ArrayList arrayList) {
            MediaDataController.this.defaultEmojiThemes.clear();
            MediaDataController.this.defaultEmojiThemes.addAll(arrayList);
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.emojiPreviewThemesChanged, new Object[0]);
        }
    }

    public ArrayList<TLRPC.EmojiStatus> getDefaultEmojiStatuses() {
        if (!this.emojiStatusesFromCacheFetched[1]) {
            fetchEmojiStatuses(1, true);
        } else if (this.emojiStatuses[1] == null || (this.emojiStatusesFetchDate[1] != null && (System.currentTimeMillis() / 1000) - this.emojiStatusesFetchDate[1].longValue() > 1800)) {
            fetchEmojiStatuses(1, false);
        }
        return this.emojiStatuses[1];
    }

    public ArrayList<TLRPC.EmojiStatus> getDefaultChannelEmojiStatuses() {
        if (!this.emojiStatusesFromCacheFetched[2]) {
            fetchEmojiStatuses(2, true);
        } else if (this.emojiStatuses[2] == null || (this.emojiStatusesFetchDate[2] != null && (System.currentTimeMillis() / 1000) - this.emojiStatusesFetchDate[2].longValue() > 1800)) {
            fetchEmojiStatuses(2, false);
        }
        return this.emojiStatuses[2];
    }

    public ArrayList<TLRPC.EmojiStatus> getRecentEmojiStatuses() {
        if (!this.emojiStatusesFromCacheFetched[0]) {
            fetchEmojiStatuses(0, true);
        } else if (this.emojiStatuses[0] == null || (this.emojiStatusesFetchDate[0] != null && (System.currentTimeMillis() / 1000) - this.emojiStatusesFetchDate[0].longValue() > 1800)) {
            fetchEmojiStatuses(0, false);
        }
        return this.emojiStatuses[0];
    }

    public ArrayList<TLRPC.EmojiStatus> clearRecentEmojiStatuses() {
        ArrayList<TLRPC.EmojiStatus> arrayList = this.emojiStatuses[0];
        if (arrayList != null) {
            arrayList.clear();
        }
        this.emojiStatusesHash[0] = 0;
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.m597$r8$lambda$SRhR94U7E4ZY66qGTamkKK1FAY(this.f$0);
            }
        });
        return this.emojiStatuses[0];
    }

    public static void m597$r8$lambda$SRhR94U7E4ZY66qGTamkKK1FAY(MediaDataController mediaDataController) {
        mediaDataController.getClass();
        try {
            mediaDataController.getMessagesStorage().getDatabase().executeFast("DELETE FROM emoji_statuses WHERE type = 0").stepThis().dispose();
        } catch (Exception unused) {
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
                ArrayList<TLRPC.EmojiStatus> arrayList = this.emojiStatuses[0];
                arrayList.remove(arrayList.size() - 1);
            }
            TL_account.TL_emojiStatuses tL_emojiStatuses = new TL_account.TL_emojiStatuses();
            tL_emojiStatuses.hash = this.emojiStatusesHash[0];
            tL_emojiStatuses.statuses = this.emojiStatuses[0];
            updateEmojiStatuses(0, tL_emojiStatuses);
        }
    }

    public void fetchEmojiStatuses(final int i, boolean z) {
        TLObject tLObject;
        boolean[] zArr = this.emojiStatusesFetching;
        if (zArr[i]) {
            return;
        }
        zArr[i] = true;
        if (z) {
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.$r8$lambda$MKHva9c4pzsaOQqmNLT_dFMh2sU(this.f$0, i);
                }
            });
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLObject, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                MediaDataController.$r8$lambda$4BK6PEf5wmwoykgngW5kvvy65kA(this.f$0, i, tLObject2, tL_error);
            }
        });
    }

    public static void $r8$lambda$MKHva9c4pzsaOQqmNLT_dFMh2sU(final MediaDataController mediaDataController, int i) {
        boolean z;
        NativeByteBuffer nativeByteBufferByteBufferValue;
        mediaDataController.getClass();
        try {
            SQLiteCursor sQLiteCursorQueryFinalized = mediaDataController.getMessagesStorage().getDatabase().queryFinalized("SELECT data FROM emoji_statuses WHERE type = " + i + " LIMIT 1", new Object[0]);
            if (!sQLiteCursorQueryFinalized.next() || sQLiteCursorQueryFinalized.getColumnCount() <= 0 || sQLiteCursorQueryFinalized.isNull(0) || (nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0)) == null) {
                z = false;
            } else {
                TL_account.EmojiStatuses emojiStatusesTLdeserialize = TL_account.EmojiStatuses.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                if (emojiStatusesTLdeserialize instanceof TL_account.TL_emojiStatuses) {
                    mediaDataController.emojiStatusesHash[i] = emojiStatusesTLdeserialize.hash;
                    mediaDataController.emojiStatuses[i] = emojiStatusesTLdeserialize.statuses;
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
        mediaDataController.emojiStatusesFromCacheFetched[i] = true;
        mediaDataController.emojiStatusesFetching[i] = false;
        if (z) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.getNotificationCenter().postNotificationName(NotificationCenter.recentEmojiStatusesUpdate, new Object[0]);
                }
            });
        } else {
            mediaDataController.fetchEmojiStatuses(i, false);
        }
    }

    public static void $r8$lambda$4BK6PEf5wmwoykgngW5kvvy65kA(final MediaDataController mediaDataController, int i, TLObject tLObject, TLRPC.TL_error tL_error) {
        mediaDataController.emojiStatusesFetchDate[i] = Long.valueOf(System.currentTimeMillis() / 1000);
        if (tLObject instanceof TL_account.TL_emojiStatusesNotModified) {
            mediaDataController.emojiStatusesFetching[i] = false;
            return;
        }
        if (tLObject instanceof TL_account.TL_emojiStatuses) {
            TL_account.TL_emojiStatuses tL_emojiStatuses = (TL_account.TL_emojiStatuses) tLObject;
            mediaDataController.emojiStatusesHash[i] = tL_emojiStatuses.hash;
            mediaDataController.emojiStatuses[i] = tL_emojiStatuses.statuses;
            mediaDataController.updateEmojiStatuses(i, tL_emojiStatuses);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.getNotificationCenter().postNotificationName(NotificationCenter.recentEmojiStatusesUpdate, new Object[0]);
                }
            });
        }
    }

    private void updateEmojiStatuses(final int i, final TL_account.TL_emojiStatuses tL_emojiStatuses) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.m603$r8$lambda$XCMUDRetq5ek3XLohEH6nltj6g(this.f$0, i, tL_emojiStatuses);
            }
        });
    }

    public static void m603$r8$lambda$XCMUDRetq5ek3XLohEH6nltj6g(MediaDataController mediaDataController, int i, TL_account.TL_emojiStatuses tL_emojiStatuses) {
        mediaDataController.getClass();
        try {
            mediaDataController.getMessagesStorage().getDatabase().executeFast("DELETE FROM emoji_statuses WHERE type = " + i).stepThis().dispose();
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = mediaDataController.getMessagesStorage().getDatabase().executeFast("INSERT INTO emoji_statuses VALUES(?, ?)");
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
        mediaDataController.emojiStatusesFetching[i] = false;
    }

    public ArrayList<TLRPC.Reaction> getRecentReactions() {
        return this.recentReactions;
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

    public ArrayList<TLRPC.Reaction> getTopReactions() {
        return this.topReactions;
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
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getRecentReactions, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    MediaDataController.m565$r8$lambda$4zcz8_beSeWOeDWll9ZS4c1f0U(this.f$0, sharedPreferences, zArr, tLObject, tL_error);
                }
            });
            TLRPC.TL_messages_getTopReactions tL_messages_getTopReactions = new TLRPC.TL_messages_getTopReactions();
            tL_messages_getTopReactions.hash = sharedPreferences2.getLong("hash", 0L);
            tL_messages_getTopReactions.limit = 100;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getTopReactions, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    MediaDataController.m627$r8$lambda$trSq6RYUnS_6MYxSPPIdUlcVBk(this.f$0, sharedPreferences2, zArr, tLObject, tL_error);
                }
            });
        }
    }

    public static void m565$r8$lambda$4zcz8_beSeWOeDWll9ZS4c1f0U(final MediaDataController mediaDataController, final SharedPreferences sharedPreferences, final boolean[] zArr, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        mediaDataController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.m591$r8$lambda$ONX9A7J83VV6wFSF7Jx7d2eOYM(this.f$0, tL_error, tLObject, sharedPreferences, zArr);
            }
        });
    }

    public static void m591$r8$lambda$ONX9A7J83VV6wFSF7Jx7d2eOYM(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr) {
        mediaDataController.getClass();
        if (tL_error == null) {
            if (tLObject instanceof TLRPC.TL_messages_reactions) {
                TLRPC.TL_messages_reactions tL_messages_reactions = (TLRPC.TL_messages_reactions) tLObject;
                mediaDataController.recentReactions.clear();
                mediaDataController.recentReactions.addAll(tL_messages_reactions.reactions);
                saveReactionsToPref(sharedPreferences, tL_messages_reactions.hash, tL_messages_reactions.reactions);
            }
            boolean z = tLObject instanceof TLRPC.TL_messages_reactionsNotModified;
        }
        zArr[0] = true;
        if (zArr[1]) {
            mediaDataController.loadingRecentReactions = false;
        }
    }

    public static void m627$r8$lambda$trSq6RYUnS_6MYxSPPIdUlcVBk(final MediaDataController mediaDataController, final SharedPreferences sharedPreferences, final boolean[] zArr, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        mediaDataController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$AgLVD_KVmHiQ_THoNHh8mhii4Os(this.f$0, tL_error, tLObject, sharedPreferences, zArr);
            }
        });
    }

    public static void $r8$lambda$AgLVD_KVmHiQ_THoNHh8mhii4Os(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr) {
        mediaDataController.getClass();
        if (tL_error == null) {
            if (tLObject instanceof TLRPC.TL_messages_reactions) {
                TLRPC.TL_messages_reactions tL_messages_reactions = (TLRPC.TL_messages_reactions) tLObject;
                mediaDataController.topReactions.clear();
                mediaDataController.topReactions.addAll(tL_messages_reactions.reactions);
                saveReactionsToPref(sharedPreferences, tL_messages_reactions.hash, tL_messages_reactions.reactions);
            }
            boolean z = tLObject instanceof TLRPC.TL_messages_reactionsNotModified;
        }
        zArr[1] = true;
        if (zArr[0]) {
            mediaDataController.loadingRecentReactions = false;
        }
    }

    public ArrayList<TLRPC.Reaction> getSavedReactions() {
        return this.savedReactions;
    }

    public void loadSavedReactions(boolean z) {
        if (this.loadingSavedReactions) {
            return;
        }
        if (!this.loadedSavedReactions || z) {
            final SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("saved_reactions_" + this.currentAccount, 0);
            this.savedReactions.clear();
            this.savedReactions.addAll(loadReactionsFromPref(sharedPreferences));
            this.loadingSavedReactions = true;
            this.loadedSavedReactions = true;
            TLRPC.TL_messages_getDefaultTagReactions tL_messages_getDefaultTagReactions = new TLRPC.TL_messages_getDefaultTagReactions();
            tL_messages_getDefaultTagReactions.hash = sharedPreferences.getLong("hash", 0L);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getDefaultTagReactions, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    MediaDataController.$r8$lambda$VY_qr0Xfs2c2GEQNMvsfcQ17gEs(this.f$0, sharedPreferences, tLObject, tL_error);
                }
            });
        }
    }

    public static void $r8$lambda$VY_qr0Xfs2c2GEQNMvsfcQ17gEs(final MediaDataController mediaDataController, final SharedPreferences sharedPreferences, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        mediaDataController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.m559$r8$lambda$Zh7eeCfEen1NIjNkyfAEYfbyE(this.f$0, tL_error, tLObject, sharedPreferences);
            }
        });
    }

    public static void m559$r8$lambda$Zh7eeCfEen1NIjNkyfAEYfbyE(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences) {
        if (tL_error == null) {
            mediaDataController.getClass();
            if (tLObject instanceof TLRPC.TL_messages_reactions) {
                TLRPC.TL_messages_reactions tL_messages_reactions = (TLRPC.TL_messages_reactions) tLObject;
                mediaDataController.savedReactions.clear();
                mediaDataController.savedReactions.addAll(tL_messages_reactions.reactions);
                saveReactionsToPref(sharedPreferences, tL_messages_reactions.hash, tL_messages_reactions.reactions);
                mediaDataController.getNotificationCenter().postNotificationName(NotificationCenter.savedReactionTagsUpdate, 0L);
            }
            boolean z = tLObject instanceof TLRPC.TL_messages_reactionsNotModified;
        }
        mediaDataController.loadingSavedReactions = false;
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

    private void loadAvatarConstructor(final boolean z) {
        String string;
        long j;
        TLRPC.TL_emojiList tL_emojiList;
        Throwable th;
        final SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("avatar_constructor" + this.currentAccount, 0);
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
            getConnectionsManager().sendRequest(getdefaultprofilephotoemojis, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    MediaDataController.$r8$lambda$EuPILvWMLy0YZK4Rbfo5LBuEWk0(this.f$0, sharedPreferences, z, tLObject, tL_error);
                }
            });
        }
    }

    public static void $r8$lambda$EuPILvWMLy0YZK4Rbfo5LBuEWk0(final MediaDataController mediaDataController, final SharedPreferences sharedPreferences, final boolean z, final TLObject tLObject, TLRPC.TL_error tL_error) {
        mediaDataController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.$r8$lambda$AnLVRi2kO_lgSRq94DLBsi473r4(this.f$0, tLObject, sharedPreferences, z);
            }
        });
    }

    public static void $r8$lambda$AnLVRi2kO_lgSRq94DLBsi473r4(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences, boolean z) {
        mediaDataController.getClass();
        if (tLObject instanceof TLRPC.TL_emojiList) {
            SerializedData serializedData = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (z) {
                mediaDataController.profileAvatarConstructorDefault = (TLRPC.TL_emojiList) tLObject;
                editorEdit.putString("profile", Utilities.bytesToHex(serializedData.toByteArray()));
                editorEdit.putLong("profile_last_check", System.currentTimeMillis());
            } else {
                mediaDataController.groupAvatarConstructorDefault = (TLRPC.TL_emojiList) tLObject;
                editorEdit.putString("group", Utilities.bytesToHex(serializedData.toByteArray()));
                editorEdit.putLong("group_last_check", System.currentTimeMillis());
            }
            editorEdit.apply();
        }
    }

    public void loadReplyIcons() {
        Throwable th;
        TLRPC.TL_emojiList tL_emojiList;
        final SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("replyicons_" + this.currentAccount, 0);
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
            getConnectionsManager().sendRequest(getdefaultbackgroundemojis, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    MediaDataController.$r8$lambda$pAN1UUqpjYPElaKl9kdo1A1RHQY(this.f$0, sharedPreferences, tLObject, tL_error);
                }
            });
        }
    }

    public static void $r8$lambda$pAN1UUqpjYPElaKl9kdo1A1RHQY(final MediaDataController mediaDataController, final SharedPreferences sharedPreferences, final TLObject tLObject, TLRPC.TL_error tL_error) {
        mediaDataController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.m570$r8$lambda$6rdQUuaw5xgfC_8pr4d5AHcrGU(this.f$0, tLObject, sharedPreferences);
            }
        });
    }

    public static void m570$r8$lambda$6rdQUuaw5xgfC_8pr4d5AHcrGU(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences) {
        mediaDataController.getClass();
        if (tLObject instanceof TLRPC.TL_emojiList) {
            SerializedData serializedData = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            mediaDataController.replyIconsDefault = (TLRPC.TL_emojiList) tLObject;
            editorEdit.putString("replyicons", Utilities.bytesToHex(serializedData.toByteArray()));
            editorEdit.putLong("replyicons_last_check", System.currentTimeMillis());
            editorEdit.apply();
        }
    }

    public void loadRestrictedStatusEmojis() {
        Throwable th;
        TLRPC.TL_emojiList tL_emojiList;
        final SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("restrictedstatuses_" + this.currentAccount, 0);
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
            getConnectionsManager().sendRequest(getchannelrestrictedstatusemojis, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    MediaDataController.m605$r8$lambda$_3mYFleuO34EdTlV6T8JPkZBI(this.f$0, sharedPreferences, tLObject, tL_error);
                }
            });
        }
    }

    public static void m605$r8$lambda$_3mYFleuO34EdTlV6T8JPkZBI(final MediaDataController mediaDataController, final SharedPreferences sharedPreferences, final TLObject tLObject, TLRPC.TL_error tL_error) {
        mediaDataController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.m583$r8$lambda$IlObrrtJH_uKdaNMFyDUIr3i5M(this.f$0, tLObject, sharedPreferences);
            }
        });
    }

    public static void m583$r8$lambda$IlObrrtJH_uKdaNMFyDUIr3i5M(MediaDataController mediaDataController, TLObject tLObject, SharedPreferences sharedPreferences) {
        mediaDataController.getClass();
        if (tLObject instanceof TLRPC.TL_emojiList) {
            SerializedData serializedData = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            mediaDataController.restrictedStatusEmojis = (TLRPC.TL_emojiList) tLObject;
            editorEdit.putString("restrictedstatuses", Utilities.bytesToHex(serializedData.toByteArray()));
            editorEdit.putLong("restrictedstatuses_last_check", System.currentTimeMillis());
            editorEdit.apply();
        }
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
                this.draftVoices.put(Long.parseLong(key), draftVoiceFromString);
            }
        }
        this.draftVoicesLoaded = true;
    }

    public void toggleDraftVoiceOnce(long j, long j2, boolean z) {
        DraftVoice draftVoice = getDraftVoice(j, j2);
        if (draftVoice == null || draftVoice.once == z) {
            return;
        }
        draftVoice.once = z;
        ApplicationLoader.applicationContext.getSharedPreferences("2voicedrafts_" + this.currentAccount, 0).edit().putString(Objects.hash(Long.valueOf(j), Long.valueOf(j2)) + "", draftVoice.toString()).apply();
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

    public void pushDraftVoiceMessage(long j, long j2, DraftVoice draftVoice) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("2voicedrafts_" + this.currentAccount, 0);
        long jHash = Objects.hash(Long.valueOf(j), Long.valueOf(j2));
        String str = jHash + "";
        if (draftVoice == null) {
            sharedPreferences.edit().remove(str).apply();
            this.draftVoices.remove(jHash);
        } else {
            sharedPreferences.edit().putString(str, draftVoice.toString()).apply();
            this.draftVoices.put(jHash, draftVoice);
        }
    }

    public DraftVoice getDraftVoice(long j, long j2) {
        loadDraftVoiceMessages();
        return (DraftVoice) this.draftVoices.get(Objects.hash(Long.valueOf(j), Long.valueOf(j2)));
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
                if (i < sArr.length) {
                    cArr[i] = (char) sArr[i];
                    i++;
                } else {
                    return "@" + this.path + "\n" + this.samplesCount + "\n" + this.writedFrame + "\n" + this.recordTimeCount + "\n" + (this.once ? 1 : 0) + ";" + this.left + ";" + this.right + "\n" + new String(cArr);
                }
            }
        }

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

    static class SearchStickersResult {
        public final ArrayList<TLRPC.Document> documents;
        public Integer next_offset;

        private SearchStickersResult() {
            this.documents = new ArrayList<>();
        }

        SearchStickersResult(AnonymousClass1 anonymousClass1) {
            this();
        }

        public void apply(TLRPC.TL_messages_foundStickers tL_messages_foundStickers) {
            this.documents.addAll(tL_messages_foundStickers.stickers);
            this.next_offset = (tL_messages_foundStickers.flags & 1) != 0 ? Integer.valueOf(tL_messages_foundStickers.next_offset) : null;
        }
    }

    public SearchStickersKey searchStickers(boolean z, String str, String str2, Utilities.Callback<ArrayList<TLRPC.Document>> callback) {
        return searchStickers(z, str, str2, callback, false);
    }

    public SearchStickersKey searchStickers(boolean z, String str, String str2, final Utilities.Callback<ArrayList<TLRPC.Document>> callback, boolean z2) {
        if (callback == null) {
            return null;
        }
        final SearchStickersKey searchStickersKey = new SearchStickersKey(z, str, str2);
        final SearchStickersResult searchStickersResult = this.searchStickerResults.get(searchStickersKey);
        if ((searchStickersResult == null || (searchStickersResult.next_offset != null && z2)) && !this.loadingSearchStickersKeys.containsKey(searchStickersKey)) {
            this.loadingSearchStickersKeys.put(searchStickersKey, 0);
            getInstance(this.currentAccount).getEmojiSuggestions(new String[]{str}, str2, true, new KeywordResultCallback() {
                @Override
                public final void run(ArrayList arrayList, String str3) {
                    MediaDataController.$r8$lambda$n8XCDwhssv8mRTTie8fTVNLu0gQ(this.f$0, searchStickersKey, searchStickersResult, callback, arrayList, str3);
                }
            }, false);
            return searchStickersKey;
        }
        if (searchStickersResult != null) {
            callback.run(searchStickersResult.documents);
            return searchStickersKey;
        }
        callback.run(new ArrayList<>());
        return searchStickersKey;
    }

    public static void $r8$lambda$n8XCDwhssv8mRTTie8fTVNLu0gQ(final MediaDataController mediaDataController, final SearchStickersKey searchStickersKey, final SearchStickersResult searchStickersResult, final Utilities.Callback callback, ArrayList arrayList, String str) {
        if (mediaDataController.loadingSearchStickersKeys.containsKey(searchStickersKey)) {
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
            mediaDataController.loadingSearchStickersKeys.put(searchStickersKey, Integer.valueOf(mediaDataController.getConnectionsManager().sendRequestTyped(tL_messages_searchStickers, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
                @Override
                public final void run(Object obj2, Object obj3) {
                    MediaDataController.m558$r8$lambda$WNUyY14e4lXmly00yKzAIZT22c(this.f$0, searchStickersKey, searchStickersResult, callback, (TLRPC.messages_FoundStickers) obj2, (TLRPC.TL_error) obj3);
                }
            })));
        }
    }

    public static void m558$r8$lambda$WNUyY14e4lXmly00yKzAIZT22c(MediaDataController mediaDataController, SearchStickersKey searchStickersKey, SearchStickersResult searchStickersResult, Utilities.Callback callback, TLRPC.messages_FoundStickers messages_foundstickers, TLRPC.TL_error tL_error) {
        mediaDataController.loadingSearchStickersKeys.remove(searchStickersKey);
        if (searchStickersResult == null) {
            searchStickersResult = new SearchStickersResult(null);
        }
        if (messages_foundstickers instanceof TLRPC.TL_messages_foundStickers) {
            searchStickersResult.apply((TLRPC.TL_messages_foundStickers) messages_foundstickers);
        }
        mediaDataController.searchStickerResults.put(searchStickersKey, searchStickersResult);
        callback.run(searchStickersResult.documents);
    }

    public void cancelSearchStickers(SearchStickersKey searchStickersKey) {
        Integer numRemove;
        if (searchStickersKey == null || (numRemove = this.loadingSearchStickersKeys.remove(searchStickersKey)) == null || numRemove.intValue() == 0) {
            return;
        }
        getConnectionsManager().cancelRequest(numRemove.intValue(), true);
    }

    public void searchStickerSets(boolean z, String str, final Utilities.Callback<ArrayList<TLRPC.StickerSetCovered>> callback) {
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
        getConnectionsManager().sendRequestTyped(obj, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
            @Override
            public final void run(Object obj2, Object obj3) {
                MediaDataController.$r8$lambda$2_WUIKFCgBLagc7UXcwatbIBBQg(callback, (TLRPC.messages_FoundStickerSets) obj2, (TLRPC.TL_error) obj3);
            }
        });
    }

    public static void $r8$lambda$2_WUIKFCgBLagc7UXcwatbIBBQg(Utilities.Callback callback, TLRPC.messages_FoundStickerSets messages_foundstickersets, TLRPC.TL_error tL_error) {
        if (messages_foundstickersets instanceof TLRPC.TL_messages_foundStickerSets) {
            callback.run(((TLRPC.TL_messages_foundStickerSets) messages_foundstickersets).sets);
        } else {
            callback.run(new ArrayList());
        }
    }
}
