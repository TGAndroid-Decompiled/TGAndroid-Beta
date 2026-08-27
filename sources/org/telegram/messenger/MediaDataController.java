package org.telegram.messenger;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.drawable.IconCompat;
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
import org.telegram.ui.Components.fx0;
import org.telegram.ui.Components.gx0;
import org.telegram.ui.Components.hi0;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.pc0;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.v00;
import org.telegram.ui.Components.vu;
import org.telegram.ui.Components.xz0;
import org.telegram.ui.Components.yz0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.Components.zo;
import org.telegram.ui.hn;

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
    public final ArrayList<zo> defaultEmojiThemes;
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
    private ig.q0 lastReaction;
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
    public final cf.d ringtoneDataStore;
    public HashMap<String, cf.e> ringtoneUploaderHashMap;
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
        final ig.q0 val$tag;
        final long val$topicId;
        final int val$type;
        final long val$uid;

        public AnonymousClass1(int i10, long j10, int i11, long j11, int i12, ig.q0 q0Var, int i13, int i14, int i15, boolean z10, int i16) {
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
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.AnonymousClass1.run():void");
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
            for (int i10 = 0; i10 < this.val$previewItems.size(); i10++) {
                if (this.val$previewItems.get(i10) != null && ((zo) this.val$previewItems.get(i10)).f35316a != null) {
                    ((zo) this.val$previewItems.get(i10)).f35316a.n(0);
                }
            }
            AndroidUtilities.runOnUIThread(new e3(8, this, this.val$previewItems));
        }
    }

    public class AnonymousClass3 implements Runnable {
        final int val$currentAccount;
        final ArrayList val$previewItems;

        public AnonymousClass3(ArrayList arrayList, int i10) {
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
                ((zo) this.val$previewItems.get(i10)).f35316a.n(this.val$currentAccount);
            }
            AndroidUtilities.runOnUIThread(new e3(9, this, this.val$previewItems));
        }
    }

    public static class DraftVoice {

        public long f19617id;
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
                boolean z10 = true;
                String[] strArrSplit = str.substring(1).split("\n");
                if (strArrSplit.length < 6) {
                    return null;
                }
                DraftVoice draftVoice = new DraftVoice();
                int i10 = 0;
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
                        z10 = false;
                    }
                    draftVoice.once = z10;
                    draftVoice.left = 0.0f;
                    draftVoice.right = 1.0f;
                }
                int length = strArrSplit.length - 5;
                String[] strArr = new String[length];
                for (int i11 = 0; i11 < length; i11++) {
                    strArr[i11] = strArrSplit[i11 + 5];
                }
                String strJoin = TextUtils.join("\n", strArr);
                draftVoice.recordSamples = new short[strJoin.length()];
                while (true) {
                    short[] sArr = draftVoice.recordSamples;
                    if (i10 >= sArr.length) {
                        return draftVoice;
                    }
                    sArr[i10] = (short) strJoin.charAt(i10);
                    i10++;
                }
            } catch (Exception e9) {
                FileLog.e(e9);
                return null;
            }
        }

        public static DraftVoice of(MediaController mediaController, String str, boolean z10, float f10, float f11) {
            if (mediaController.recordingAudio == null) {
                return null;
            }
            DraftVoice draftVoice = new DraftVoice();
            draftVoice.path = str;
            draftVoice.samplesCount = mediaController.samplesCount;
            draftVoice.writedFrame = mediaController.writtenFrame;
            draftVoice.recordTimeCount = mediaController.recordTimeCount;
            draftVoice.f19617id = mediaController.recordingAudio.f22386id;
            draftVoice.recordSamples = mediaController.recordSamples;
            draftVoice.once = z10;
            draftVoice.left = f10;
            draftVoice.right = f11;
            return draftVoice;
        }

        public String toString() {
            char[] cArr = new char[this.recordSamples.length];
            int i10 = 0;
            while (true) {
                short[] sArr = this.recordSamples;
                if (i10 >= sArr.length) {
                    return "@" + this.path + "\n" + this.samplesCount + "\n" + this.writedFrame + "\n" + this.recordTimeCount + "\n" + (this.once ? 1 : 0) + ";" + this.left + ";" + this.right + "\n" + new String(cArr);
                }
                cArr[i10] = (char) sArr[i10];
                i10++;
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

        public final String f19618q;

        public SearchStickersKey(boolean z10, String str, String str2) {
            this.emojis = z10;
            this.lang_code = str;
            this.f19618q = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                SearchStickersKey searchStickersKey = (SearchStickersKey) obj;
                if (this.emojis == searchStickersKey.emojis && Objects.equals(this.lang_code, searchStickersKey.lang_code) && Objects.equals(this.f19618q, searchStickersKey.f19618q)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Boolean.valueOf(this.emojis), this.lang_code, this.f19618q);
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
        boolean zStartsWith;
        super(i10);
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
                            a0.h hVar = (a0.h) this.drafts.f(jLongValue);
                            if (hVar == null) {
                                hVar = new a0.h();
                                this.drafts.k(hVar, jLongValue);
                            }
                            hVar.k(draftMessageTLdeserialize, key.startsWith("t_") ? Utilities.parseLong(key.substring(key.lastIndexOf(95) + 1)).longValue() : 0L);
                        }
                    }
                    serializedData.cleanup();
                }
                TLRPC.Message messageTLdeserialize = TLRPC.Message.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                if (messageTLdeserialize != null) {
                    messageTLdeserialize.readAttachPath(serializedData, getUserConfig().clientUserId);
                    a0.h hVar2 = (a0.h) this.draftMessages.f(jLongValue);
                    if (hVar2 == null) {
                        hVar2 = new a0.h();
                        this.draftMessages.k(hVar2, jLongValue);
                    }
                    hVar2.k(messageTLdeserialize, zStartsWith ? Utilities.parseInt((CharSequence) key.substring(key.lastIndexOf(95) + 1)).intValue() : 0);
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
        this.ringtoneDataStore = new cf.d(this.currentAccount);
        this.menuBotsUpdateDate = getMessagesController().getMainSettings().getInt("menuBotsUpdateDate", 0);
    }

    public static void access$000(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, long j10, int i10, int i11, int i12, int i13, long j11, int i14, int i15, boolean z10, boolean z11, int i16) {
        mediaDataController.processLoadedMedia(messages_messages, j10, i10, i11, i12, i13, j11, i14, i15, z10, z11, i16);
    }

    public static void addAnimatedEmojiSpans(ArrayList<TLRPC.MessageEntity> arrayList, CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt) {
        if (!(charSequence instanceof Spannable) || arrayList == null) {
            return;
        }
        Spannable spannable = (Spannable) charSequence;
        for (org.telegram.ui.Components.t5 t5Var : (org.telegram.ui.Components.t5[]) spannable.getSpans(0, spannable.length(), org.telegram.ui.Components.t5.class)) {
            if (t5Var != null) {
                spannable.removeSpan(t5Var);
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.MessageEntity messageEntity = arrayList.get(i10);
            if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                int i11 = messageEntity.offset;
                int i12 = messageEntity.length + i11;
                if (i11 < i12 && i12 <= spannable.length()) {
                    spannable.setSpan(tL_messageEntityCustomEmoji.document != null ? new org.telegram.ui.Components.t5(tL_messageEntityCustomEmoji.document, fontMetricsInt) : new org.telegram.ui.Components.t5(tL_messageEntityCustomEmoji.document_id, fontMetricsInt), i11, i12, 33);
                }
            }
        }
    }

    public static void addStyleToText(yz0 yz0Var, int i10, int i11, Spannable spannable, boolean z10) {
        xz0 xz0Var;
        int i12;
        try {
            int i13 = i10;
            int i14 = i11;
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) spannable.getSpans(i13, i14, CharacterStyle.class);
            if (characterStyleArr != null && characterStyleArr.length > 0) {
                int i15 = 0;
                int i16 = 0;
                while (i16 < characterStyleArr.length) {
                    CharacterStyle characterStyle = characterStyleArr[i16];
                    xz0 xz0Var2 = yz0Var != null ? yz0Var.f35101b : new xz0();
                    if (characterStyle instanceof yz0) {
                        xz0Var = ((yz0) characterStyle).f35101b;
                    } else {
                        if (characterStyle instanceof t41) {
                            xz0Var = ((t41) characterStyle).f32651a;
                            if (xz0Var == null) {
                                xz0Var = new xz0();
                            }
                        }
                        i16++;
                        i15 = 0;
                    }
                    if (xz0Var != null) {
                        int spanStart = spannable.getSpanStart(characterStyle);
                        int spanEnd = spannable.getSpanEnd(characterStyle);
                        spannable.removeSpan(characterStyle);
                        if (spanStart <= i13 || i14 <= spanEnd) {
                            if (spanStart > i13) {
                                i12 = i13;
                            } else {
                                if (spanStart != i13) {
                                    spannable.setSpan(createNewSpan(characterStyle, xz0Var, null, z10), spanStart, i13, 33);
                                }
                                if (spanEnd > i13) {
                                    if (yz0Var != null) {
                                        spannable.setSpan(createNewSpan(characterStyle, xz0Var, xz0Var2, z10), i13, Math.min(spanEnd, i14), 33);
                                    }
                                    i12 = spanEnd;
                                } else {
                                    i12 = i13;
                                }
                            }
                            if (spanEnd >= i14) {
                                if (spanEnd != i14) {
                                    spannable.setSpan(createNewSpan(characterStyle, xz0Var, null, z10), i14, spanEnd, 33);
                                }
                                if (i14 > spanStart && spanEnd <= i13) {
                                    if (yz0Var != null) {
                                        spannable.setSpan(createNewSpan(characterStyle, xz0Var, xz0Var2, z10), spanStart, Math.min(spanEnd, i14), 33);
                                    }
                                    i13 = i12;
                                }
                            }
                            i13 = i12;
                        } else {
                            spannable.setSpan(createNewSpan(characterStyle, xz0Var, xz0Var2, z10), spanStart, spanEnd, 33);
                            if (yz0Var != null) {
                                spannable.setSpan(new yz0(new xz0(xz0Var2), i15), spanEnd, i14, 33);
                            }
                        }
                        i14 = spanStart;
                    }
                    i16++;
                    i15 = 0;
                }
            }
            if (yz0Var == null || i13 >= i14 || i13 >= spannable.length()) {
                return;
            }
            spannable.setSpan(yz0Var, i13, Math.min(spannable.length(), i14), 33);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public static void addTextStyleRuns(MessageObject messageObject, Spannable spannable) {
        addTextStyleRuns(messageObject.messageOwner.entities, messageObject.messageText, spannable, -1);
    }

    private ArrayList<MessageObject> broadcastPinnedMessage(ArrayList<TLRPC.Message> arrayList, ArrayList<TLRPC.User> arrayList2, ArrayList<TLRPC.Chat> arrayList3, boolean z10, boolean z11) {
        if (arrayList.isEmpty()) {
            return null;
        }
        a0.h hVar = new a0.h();
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            TLRPC.User user = arrayList2.get(i10);
            hVar.k(user, user.f22527id);
        }
        a0.h hVar2 = new a0.h();
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            TLRPC.Chat chat = arrayList3.get(i11);
            hVar2.k(chat, chat.f22380id);
        }
        ArrayList<MessageObject> arrayList4 = new ArrayList<>();
        if (!z11) {
            AndroidUtilities.runOnUIThread(new s1(this, arrayList2, z10, arrayList3, arrayList, arrayList4, hVar, hVar2));
            return null;
        }
        AndroidUtilities.runOnUIThread(new qj(this, arrayList2, z10, arrayList3, 9));
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
            arrayList4.add(new MessageObject(this.currentAccount, message, hVar, hVar3, false, i14 < 30));
            i13++;
            hVar2 = hVar3;
            i12 = i14;
        }
        return arrayList4;
    }

    private void broadcastReplyMessages(ArrayList<TLRPC.Message> arrayList, a0.h hVar, ArrayList<TLRPC.User> arrayList2, ArrayList<TLRPC.Chat> arrayList3, long j10, boolean z10) {
        a0.h hVar2 = new a0.h();
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            TLRPC.User user = arrayList2.get(i10);
            hVar2.k(user, user.f22527id);
        }
        a0.h hVar3 = new a0.h();
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            TLRPC.Chat chat = arrayList3.get(i11);
            hVar3.k(chat, chat.f22380id);
        }
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList4.add(new MessageObject(this.currentAccount, arrayList.get(i12), hVar2, hVar3, false, false));
        }
        AndroidUtilities.runOnUIThread(new sk(this, arrayList2, z10, arrayList3, arrayList4, hVar, j10));
    }

    public static long calcDocumentsHash(ArrayList<TLRPC.Document> arrayList) {
        return calcDocumentsHash(arrayList, 200);
    }

    private long calcFeaturedStickersHash(boolean z10, ArrayList<TLRPC.StickerSetCovered> arrayList) {
        long jCalcHash = 0;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.StickerSet stickerSet = arrayList.get(i10).set;
                if (!stickerSet.archived) {
                    jCalcHash = calcHash(jCalcHash, stickerSet.f22407id);
                    if (this.unreadStickerSets[z10 ? 1 : 0].contains(Long.valueOf(stickerSet.f22407id))) {
                        jCalcHash = calcHash(jCalcHash, 1L);
                    }
                }
            }
        }
        return jCalcHash;
    }

    public static long calcHash(long j10, long j11) {
        long j12 = j10 ^ (j10 >>> 21);
        long j13 = j12 ^ (j12 << 35);
        return (j13 ^ (j13 >>> 4)) + j11;
    }

    private static long calcStickersHash(ArrayList<TLRPC.TL_messages_stickerSet> arrayList) {
        long jCalcHash = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (arrayList.get(i10) != null) {
                TLRPC.StickerSet stickerSet = arrayList.get(i10).set;
                if (!stickerSet.archived) {
                    jCalcHash = calcHash(jCalcHash, stickerSet.hash);
                }
            }
        }
        return jCalcHash;
    }

    public static boolean canAddMessageToMedia(TLRPC.Message message) {
        boolean z10 = message instanceof TLRPC.TL_message_secret;
        if (!z10 || (!((MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaPhoto) || MessageObject.isVideoMessage(message) || MessageObject.isGifMessage(message)) || MessageObject.getMedia(message).ttl_seconds == 0 || MessageObject.getMedia(message).ttl_seconds > 60)) {
            return (z10 || !(message instanceof TLRPC.TL_message) || (!((MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaPhoto) || (MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaDocument)) || MessageObject.getMedia(message).ttl_seconds == 0)) && getMediaType(message) != -1;
        }
        return false;
    }

    public static boolean canShowAttachMenuBot(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLObject tLObject) {
        TLRPC.User user = tLObject instanceof TLRPC.User ? (TLRPC.User) tLObject : null;
        TLRPC.Chat chat = tLObject instanceof TLRPC.Chat ? (TLRPC.Chat) tLObject : null;
        ArrayList<TLRPC.AttachMenuPeerType> arrayList = tL_attachMenuBot.peer_types;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.AttachMenuPeerType attachMenuPeerType = arrayList.get(i10);
            i10++;
            TLRPC.AttachMenuPeerType attachMenuPeerType2 = attachMenuPeerType;
            if ((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeSameBotPM) && user != null && user.bot && user.f22527id == tL_attachMenuBot.bot_id) {
                return true;
            }
            if ((attachMenuPeerType2 instanceof TLRPC.TL_attachMenuPeerTypeBotPM) && user != null && user.bot && user.f22527id != tL_attachMenuBot.bot_id) {
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
        int i10 = 0;
        while (i10 < size) {
            TLRPC.AttachMenuPeerType attachMenuPeerType = arrayList.get(i10);
            i10++;
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

    private static boolean checkInclusion(int i10, List<TLRPC.MessageEntity> list, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                TLRPC.MessageEntity messageEntity = list.get(i11);
                int i12 = messageEntity.offset;
                if (z10) {
                    if (i12 >= i10) {
                        continue;
                    } else if (messageEntity.offset + messageEntity.length > i10) {
                        return true;
                    }
                } else if (i12 > i10) {
                    continue;
                } else if (messageEntity.offset + messageEntity.length > i10) {
                    return true;
                }
            }
        }
        return false;
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
        getMessagesStorage().getStorageQueue().postRunnable(new i7(this, 8));
    }

    private Intent createIntrnalAttachedBotShortcutIntent(long j10) {
        if (j10 != 0 && canCreateAttachedMenuBotShortcut(j10)) {
            Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) OpenAttachedMenuBotReceiver.class);
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
        Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) OpenChatReceiver.class);
        if (DialogObject.isEncryptedDialog(j10)) {
            int encryptedChatId = DialogObject.getEncryptedChatId(j10);
            intent.putExtra("encId", encryptedChatId);
            if (getMessagesController().getEncryptedChat(Integer.valueOf(encryptedChatId)) == null) {
                return null;
            }
        } else if (DialogObject.isUserDialog(j10)) {
            intent.putExtra("userId", j10);
        } else {
            if (!DialogObject.isChatDialog(j10)) {
                return null;
            }
            intent.putExtra("chatId", -j10);
        }
        intent.putExtra("currentAccount", this.currentAccount);
        intent.setAction("com.tmessages.openchat" + j10);
        intent.addFlags(67108864);
        return intent;
    }

    private static CharacterStyle createNewSpan(CharacterStyle characterStyle, xz0 xz0Var, xz0 xz0Var2, boolean z10) {
        xz0 xz0Var3 = new xz0(xz0Var);
        if (xz0Var2 != null) {
            if (z10) {
                xz0Var3.b(xz0Var2);
            } else {
                xz0Var3.f34734a = xz0Var2.f34734a;
                xz0Var3.d = xz0Var2.d;
            }
        }
        if (characterStyle instanceof yz0) {
            return new yz0(xz0Var3, 0);
        }
        if (characterStyle instanceof t41) {
            return new t41(((t41) characterStyle).getURL(), xz0Var3);
        }
        return null;
    }

    private void deletePeer(long j10, int i10) {
        getMessagesStorage().getStorageQueue().postRunnable(new hh.d9(this, j10, i10, 4));
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
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new a7(this, strInputSetKey, 1));
    }

    public static TLRPC.TL_attachMenuBotIcon getAnimatedAttachMenuBotIcon(TLRPC.TL_attachMenuBot tL_attachMenuBot, boolean z10) {
        ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList = tL_attachMenuBot.icons;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon = arrayList.get(i10);
            i10++;
            TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon2 = tL_attachMenuBotIcon;
            if (tL_attachMenuBotIcon2.name.equals(z10 ? "android_active_animated" : "android_animated")) {
                return tL_attachMenuBotIcon2;
            }
        }
        return null;
    }

    private TLRPC.TL_messages_stickerSet getCachedStickerSetInternal(long j10, Integer num) {
        SQLiteCursor sQLiteCursorQueryFinalized;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSetTLdeserialize;
        NativeByteBuffer nativeByteBuffer = null;
        try {
            try {
                sQLiteCursorQueryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT data, hash FROM stickersets2 WHERE id = ? LIMIT 1", Long.valueOf(j10));
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
        tL_inputStickerSetID.f22400id = stickerSet.f22407id;
        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
        return tL_inputStickerSetID;
    }

    public static TLRPC.TL_inputStickerSetItem getInputStickerSetItem(TLRPC.Document document, String str) {
        TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem = new TLRPC.TL_inputStickerSetItem();
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_inputStickerSetItem.document = tL_inputDocument;
        tL_inputDocument.f22392id = document.f22386id;
        tL_inputDocument.access_hash = document.access_hash;
        tL_inputDocument.file_reference = document.file_reference;
        tL_inputStickerSetItem.emoji = str;
        return tL_inputStickerSetItem;
    }

    public static MediaDataController getInstance(int i10) {
        MediaDataController mediaDataController;
        MediaDataController mediaDataController2 = Instance[i10];
        if (mediaDataController2 != null) {
            return mediaDataController2;
        }
        synchronized (lockObjects) {
            try {
                mediaDataController = Instance[i10];
                if (mediaDataController == null) {
                    MediaDataController[] mediaDataControllerArr = Instance;
                    MediaDataController mediaDataController3 = new MediaDataController(i10);
                    mediaDataControllerArr[i10] = mediaDataController3;
                    mediaDataController = mediaDataController3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaDataController;
    }

    private void getMediaCountDatabase(long j10, long j11, int i10, int i11) {
        getMessagesStorage().getStorageQueue().postRunnable(new j8(this, j11, j10, i10, i11, 0));
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
                for (int i10 = 0; i10 < message.entities.size(); i10++) {
                    TLRPC.MessageEntity messageEntity = message.entities.get(i10);
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
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        for (int i11 = 0; i11 < document.attributes.size(); i11++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
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
        if (z10 || z11) {
            return 2;
        }
        if (z12 && !z13 && !z14) {
            return 0;
        }
        if (z14) {
            return -1;
        }
        if (z13) {
            return 5;
        }
        return z15 ? 4 : 1;
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
                if (inputStickerSet instanceof TLRPC.TL_inputStickerSetID) {
                    return inputStickerSet.f22400id;
                }
                return -1L;
            }
        }
        return -1L;
    }

    public static ArrayList<xz0> getTextStyleRuns(ArrayList<TLRPC.MessageEntity> arrayList, CharSequence charSequence, int i10) {
        int i11;
        ArrayList<xz0> arrayList2 = new ArrayList<>();
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
                    xz0 xz0Var = new xz0();
                    int i13 = messageEntity.offset;
                    xz0Var.f34735b = i13;
                    xz0Var.f34736c = i13 + messageEntity.length;
                    if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                        xz0Var.f34734a = 256;
                    } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                        xz0Var.f34734a = 8;
                    } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                        xz0Var.f34734a = 16;
                    } else if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                        xz0Var.f34734a = 1;
                    } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                        xz0Var.f34734a = 2;
                    } else if ((messageEntity instanceof TLRPC.TL_messageEntityCode) || (messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                        xz0Var.f34734a = 4;
                    } else if ((messageEntity instanceof TLRPC.TL_messageEntityMentionName) || (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName)) {
                        xz0Var.f34734a = 64;
                        xz0Var.d = messageEntity;
                    } else {
                        xz0Var.f34734a = 128;
                        xz0Var.d = messageEntity;
                    }
                    if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                        xz0Var.f34734a |= 1024;
                    }
                    xz0Var.f34734a &= i10;
                    int size2 = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        xz0 xz0Var2 = arrayList2.get(i14);
                        int i15 = xz0Var.f34735b;
                        int i16 = xz0Var2.f34735b;
                        if (i15 > i16) {
                            int i17 = xz0Var2.f34736c;
                            if (i15 < i17) {
                                if (xz0Var.f34736c < i17) {
                                    xz0 xz0Var3 = new xz0(xz0Var);
                                    xz0Var3.b(xz0Var2);
                                    arrayList2.add(i14 + 1, xz0Var3);
                                    xz0 xz0Var4 = new xz0(xz0Var2);
                                    xz0Var4.f34735b = xz0Var.f34736c;
                                    i14 += 2;
                                    size2 += 2;
                                    arrayList2.add(i14, xz0Var4);
                                } else {
                                    xz0 xz0Var5 = new xz0(xz0Var);
                                    xz0Var5.b(xz0Var2);
                                    xz0Var5.f34736c = xz0Var2.f34736c;
                                    i14++;
                                    size2++;
                                    arrayList2.add(i14, xz0Var5);
                                }
                                int i18 = xz0Var.f34735b;
                                xz0Var.f34735b = xz0Var2.f34736c;
                                xz0Var2.f34736c = i18;
                            }
                        } else {
                            int i19 = xz0Var.f34736c;
                            if (i16 < i19) {
                                int i20 = xz0Var2.f34736c;
                                if (i19 == i20) {
                                    xz0Var2.b(xz0Var);
                                } else if (i19 < i20) {
                                    xz0 xz0Var6 = new xz0(xz0Var2);
                                    xz0Var6.b(xz0Var);
                                    xz0Var6.f34736c = xz0Var.f34736c;
                                    i14++;
                                    size2++;
                                    arrayList2.add(i14, xz0Var6);
                                    xz0Var2.f34735b = xz0Var.f34736c;
                                } else {
                                    xz0 xz0Var7 = new xz0(xz0Var);
                                    xz0Var7.f34735b = xz0Var2.f34736c;
                                    i14++;
                                    size2++;
                                    arrayList2.add(i14, xz0Var7);
                                    xz0Var2.b(xz0Var);
                                }
                                xz0Var.f34736c = i16;
                            }
                        }
                        i14++;
                    }
                    if (xz0Var.f34735b < xz0Var.f34736c) {
                        arrayList2.add(xz0Var);
                    }
                }
            }
        }
        return arrayList2;
    }

    public static String inputSetKey(TLRPC.InputStickerSet inputStickerSet) {
        if (inputStickerSet instanceof TLRPC.TL_inputStickerSetID) {
            return "id" + inputStickerSet.f22400id + "access_hash" + inputStickerSet.access_hash;
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
            getMessagesStorage().getDatabase().executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document.f22386id + "' AND type = 2").stepThis().dispose();
        } catch (Exception e9) {
            FileLog.e(e9);
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
            AndroidUtilities.runOnUIThread(new i7(this, 2));
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

    public void lambda$addRecentSticker$23(int i10, TLRPC.Document document) {
        int i11;
        if (i10 == 0) {
            i11 = 3;
        } else if (i10 == 1) {
            i11 = 4;
        } else {
            i11 = i10 == 5 ? 7 : 5;
        }
        try {
            getMessagesStorage().getDatabase().executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document.f22386id + "' AND type = " + i11).stepThis().dispose();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public void lambda$broadcastPinnedMessage$167(ArrayList arrayList, boolean z10, ArrayList arrayList2) {
        getMessagesController().putUsers(arrayList, z10);
        getMessagesController().putChats(arrayList2, z10);
    }

    public void lambda$broadcastPinnedMessage$168(ArrayList arrayList) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(((MessageObject) arrayList.get(0)).getDialogId()), null, Boolean.TRUE, arrayList, null, 0, -1, Boolean.FALSE);
    }

    public void lambda$broadcastPinnedMessage$169(ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, a0.h hVar, a0.h hVar2) {
        getMessagesController().putUsers(arrayList, z10);
        getMessagesController().putChats(arrayList2, z10);
        int size = arrayList3.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            TLRPC.Message message = (TLRPC.Message) arrayList3.get(i11);
            if ((MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaDocument) || (MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaPhoto)) {
                i10++;
            }
            arrayList4.add(new MessageObject(this.currentAccount, message, hVar, hVar2, false, i10 < 30));
        }
        AndroidUtilities.runOnUIThread(new u7(this, arrayList4, 1));
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
        AndroidUtilities.runOnUIThread(new e7(this, tLObject, 3));
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
        AndroidUtilities.runOnUIThread(new e7(this, tLObject, 5));
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
        AndroidUtilities.runOnUIThread(new e7(this, tLObject, 0));
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
        AndroidUtilities.runOnUIThread(new e7(this, tLObject, 2));
    }

    public static void lambda$cleanup$1() {
        try {
            g0.f.n(ApplicationLoader.applicationContext);
        } catch (Exception e9) {
            FileLog.e(e9);
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
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public void lambda$clearBotKeyboard$193(ArrayList arrayList, MessagesStorage.TopicKey topicKey) {
        if (arrayList == null) {
            if (topicKey != null) {
                this.botKeyboards.remove(topicKey);
                this.botDialogKeyboards.l(topicKey.dialogId);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botKeyboardDidLoad, null, topicKey);
                return;
            }
            return;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            int iIntValue = ((Integer) arrayList.get(i10)).intValue();
            long j10 = iIntValue;
            MessagesStorage.TopicKey topicKey2 = (MessagesStorage.TopicKey) this.botKeyboardsByMids.f(j10);
            if (topicKey2 != null) {
                this.botKeyboards.remove(topicKey2);
                ArrayList arrayList2 = (ArrayList) this.botDialogKeyboards.f(topicKey2.dialogId);
                if (arrayList2 != null) {
                    int i11 = 0;
                    while (i11 < arrayList2.size()) {
                        TLRPC.Message message = (TLRPC.Message) arrayList2.get(i11);
                        if (message == null || message.f22401id == iIntValue) {
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
    }

    public void lambda$clearBotKeyboard$194(long j10) {
        ArrayList arrayList = (ArrayList) this.botDialogKeyboards.f(j10);
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.Message message = (TLRPC.Message) arrayList.get(i10);
                int i11 = this.currentAccount;
                MessagesStorage.TopicKey topicKeyOf = MessagesStorage.TopicKey.of(j10, MessageObject.getTopicId(i11, message, ChatObject.isForum(i11, j10)));
                this.botKeyboards.remove(topicKeyOf);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botKeyboardDidLoad, null, topicKeyOf);
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
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public void lambda$clearRecentStickers$18(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            getMessagesStorage().getStorageQueue().postRunnable(new i7(this, 5));
            this.recentStickers[0].clear();
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recentDocumentsDidLoad, Boolean.FALSE, 0);
        }
    }

    public void lambda$clearRecentStickers$19(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new e7(this, tLObject, 4));
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
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public void lambda$fetchEmojiStatuses$230() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.recentEmojiStatusesUpdate, new Object[0]);
    }

    public void lambda$fetchEmojiStatuses$231(int i10) {
        boolean z10;
        NativeByteBuffer nativeByteBufferByteBufferValue;
        try {
            SQLiteCursor sQLiteCursorQueryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT data FROM emoji_statuses WHERE type = " + i10 + " LIMIT 1", new Object[0]);
            if (!sQLiteCursorQueryFinalized.next() || sQLiteCursorQueryFinalized.getColumnCount() <= 0 || sQLiteCursorQueryFinalized.isNull(0) || (nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0)) == null) {
                z10 = false;
            } else {
                TL_account.EmojiStatuses emojiStatusesTLdeserialize = TL_account.EmojiStatuses.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                if (emojiStatusesTLdeserialize instanceof TL_account.TL_emojiStatuses) {
                    this.emojiStatusesHash[i10] = emojiStatusesTLdeserialize.hash;
                    this.emojiStatuses[i10] = emojiStatusesTLdeserialize.statuses;
                    z10 = true;
                } else {
                    z10 = false;
                }
                try {
                    nativeByteBufferByteBufferValue.reuse();
                } catch (Exception e9) {
                    e = e9;
                    FileLog.e(e);
                }
            }
            sQLiteCursorQueryFinalized.dispose();
        } catch (Exception e10) {
            e = e10;
            z10 = false;
        }
        this.emojiStatusesFromCacheFetched[i10] = true;
        this.emojiStatusesFetching[i10] = false;
        if (z10) {
            AndroidUtilities.runOnUIThread(new i7(this, 11));
        } else {
            fetchEmojiStatuses(i10, false);
        }
    }

    public void lambda$fetchEmojiStatuses$232() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.recentEmojiStatusesUpdate, new Object[0]);
    }

    public void lambda$fetchEmojiStatuses$233(int i10, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.emojiStatusesFetchDate[i10] = Long.valueOf(System.currentTimeMillis() / 1000);
        if (tLObject instanceof TL_account.TL_emojiStatusesNotModified) {
            this.emojiStatusesFetching[i10] = false;
            return;
        }
        if (tLObject instanceof TL_account.TL_emojiStatuses) {
            TL_account.TL_emojiStatuses tL_emojiStatuses = (TL_account.TL_emojiStatuses) tLObject;
            this.emojiStatusesHash[i10] = tL_emojiStatuses.hash;
            this.emojiStatuses[i10] = tL_emojiStatuses.statuses;
            updateEmojiStatuses(i10, tL_emojiStatuses);
            AndroidUtilities.runOnUIThread(new i7(this, 0));
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
            AndroidUtilities.runOnUIThread(new b8(this, str, 2));
        } catch (Exception e9) {
            FileLog.e(e9);
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
        if (tLObject == null) {
            AndroidUtilities.runOnUIThread(new b8(this, str2, 6));
            return;
        }
        TLRPC.TL_emojiKeywordsDifference tL_emojiKeywordsDifference = (TLRPC.TL_emojiKeywordsDifference) tLObject;
        if (i10 != -1 && !tL_emojiKeywordsDifference.lang_code.equals(str)) {
            getMessagesStorage().getStorageQueue().postRunnable(new b8(this, str2, 5));
        } else {
            putEmojiKeywords(str2, tL_emojiKeywordsDifference);
            AndroidUtilities.runOnUIThread(new i7(this, 18));
        }
    }

    public void lambda$fetchNewEmojiKeywords$213(String str) {
        int iIntValue;
        TLObject tLObject;
        int i10 = 0;
        String strStringValue = null;
        long jLongValue = 0;
        try {
            SQLiteCursor sQLiteCursorQueryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT alias, version, date FROM emoji_keywords_info_v2 WHERE lang = ?", str);
            if (sQLiteCursorQueryFinalized.next()) {
                strStringValue = sQLiteCursorQueryFinalized.stringValue(0);
                iIntValue = sQLiteCursorQueryFinalized.intValue(1);
                try {
                    jLongValue = sQLiteCursorQueryFinalized.longValue(2);
                } catch (Exception e9) {
                    e = e9;
                    FileLog.e(e);
                }
            } else {
                iIntValue = -1;
            }
            sQLiteCursorQueryFinalized.dispose();
        } catch (Exception e10) {
            e = e10;
            iIntValue = -1;
        }
        String str2 = strStringValue;
        int i11 = iIntValue;
        if (!BuildVars.DEBUG_VERSION && Math.abs(System.currentTimeMillis() - jLongValue) < 3600000) {
            AndroidUtilities.runOnUIThread(new b8(this, str, i10));
            return;
        }
        if (i11 == -1) {
            TLRPC.TL_messages_getEmojiKeywords tL_messages_getEmojiKeywords = new TLRPC.TL_messages_getEmojiKeywords();
            tL_messages_getEmojiKeywords.lang_code = str;
            tLObject = tL_messages_getEmojiKeywords;
        } else {
            TLRPC.TL_messages_getEmojiKeywordsDifference tL_messages_getEmojiKeywordsDifference = new TLRPC.TL_messages_getEmojiKeywordsDifference();
            tL_messages_getEmojiKeywordsDifference.lang_code = str;
            tL_messages_getEmojiKeywordsDifference.from_version = i11;
            tLObject = tL_messages_getEmojiKeywordsDifference;
        }
        getConnectionsManager().sendRequest(tLObject, new h8(this, i11, str2, str, 0));
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
        AndroidUtilities.runOnUIThread(new n9(this, str, tLObject, 0));
    }

    public void lambda$fillWithAnimatedEmoji$225(Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        int iIntValue;
        String str;
        boolean z12;
        char c10;
        int i10;
        ArrayList<TLRPC.StickerSetCovered> arrayList2;
        int i11;
        TLRPC.StickerSetCovered stickerSetCovered;
        ArrayList<TLRPC.Document> arrayList3;
        TLRPC.TL_documentAttributeCustomEmoji tL_documentAttributeCustomEmoji;
        TLRPC.StickerSet stickerSet;
        String str2;
        int i12;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.TL_documentAttributeCustomEmoji tL_documentAttributeCustomEmoji2;
        TLRPC.StickerSet stickerSet2;
        String str3;
        int i13;
        int i14;
        String str4;
        TLRPC.Document document;
        TLRPC.TL_messages_stickerSet stickerSetByName;
        MediaDataController mediaDataController = this;
        ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = mediaDataController.getFeaturedEmojiSets();
        ArrayList arrayList4 = new ArrayList();
        HashSet hashSet = new HashSet();
        ArrayList arrayList5 = new ArrayList();
        boolean z13 = true;
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
        if (!UserConfig.getInstance(mediaDataController.currentAccount).isPremium() && !z10) {
            z13 = false;
        }
        if (z11) {
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
        int i15 = 0;
        while (i15 < iMin) {
            String str5 = ((KeywordResult) arrayList.get(i15)).emoji;
            if (TextUtils.isEmpty(str5)) {
                arrayList2 = featuredEmojiSets;
                z12 = z13;
                i10 = iMin;
            } else {
                arrayList5.clear();
                if (Emoji.recentEmoji != null) {
                    c10 = 0;
                    int i16 = 0;
                    while (true) {
                        ArrayList<String> arrayList6 = Emoji.recentEmoji;
                        if (i16 >= arrayList6.size()) {
                            z12 = z13;
                            break;
                        }
                        if (arrayList6.get(i16).startsWith("animated_")) {
                            try {
                                z12 = z13;
                                try {
                                    TLRPC.Document documentF = org.telegram.ui.Components.k5.f(mediaDataController.currentAccount, Long.parseLong(arrayList6.get(i16).substring(9)));
                                    String strFindAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(documentF, null);
                                    if (documentF != null && strFindAnimatedEmojiEmoticon != null && strFindAnimatedEmojiEmoticon.contains(str5) && (z12 || MessageObject.isFreeEmoji(documentF))) {
                                        if (!hashSet.contains(Long.valueOf(documentF.f22386id))) {
                                            hashSet.add(Long.valueOf(documentF.f22386id));
                                            arrayList5.add(documentF);
                                        }
                                    }
                                } catch (Exception unused) {
                                }
                            } catch (Exception unused2) {
                                z12 = z13;
                            }
                        } else {
                            z12 = z13;
                        }
                        if (arrayList5.size() >= iIntValue) {
                            break;
                        }
                        i16++;
                        z13 = z12;
                    }
                } else {
                    z12 = z13;
                    c10 = 0;
                }
                if (arrayList5.size() >= iIntValue || arrayListArr[c10] == null) {
                    i10 = iMin;
                    break;
                }
                int i17 = 0;
                while (true) {
                    if (i17 >= arrayListArr[c10].size()) {
                        i10 = iMin;
                        break;
                    }
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayListArr[c10].get(i17);
                    if (tL_messages_stickerSet2 == null || tL_messages_stickerSet2.packs == null) {
                        i12 = i17;
                        i10 = iMin;
                        if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents != null) {
                            int i18 = 0;
                            while (i18 < tL_messages_stickerSet2.documents.size()) {
                                TLRPC.Document document2 = tL_messages_stickerSet2.documents.get(i18);
                                if (document2 != null && document2.attributes != null && !arrayList5.contains(document2)) {
                                    int i19 = 0;
                                    while (true) {
                                        if (i19 >= document2.attributes.size()) {
                                            tL_documentAttributeCustomEmoji2 = null;
                                            break;
                                        }
                                        TLRPC.DocumentAttribute documentAttribute = document2.attributes.get(i19);
                                        if (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) {
                                            tL_documentAttributeCustomEmoji2 = (TLRPC.TL_documentAttributeCustomEmoji) documentAttribute;
                                            break;
                                        }
                                        i19++;
                                    }
                                    if (tL_documentAttributeCustomEmoji2 != null && !TextUtils.isEmpty(tL_documentAttributeCustomEmoji2.alt) && tL_documentAttributeCustomEmoji2.alt.contains(str5) && (z12 || tL_documentAttributeCustomEmoji2.free || !((stickerSet2 = tL_messages_stickerSet2.set) == null || (str3 = stickerSet2.short_name) == null || !str3.equals(str)))) {
                                        tL_messages_stickerSet = tL_messages_stickerSet2;
                                        if (!hashSet.contains(Long.valueOf(document2.f22386id))) {
                                            hashSet.add(Long.valueOf(document2.f22386id));
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
                                i18++;
                                tL_messages_stickerSet2 = tL_messages_stickerSet;
                            }
                        }
                    } else {
                        int i20 = 0;
                        while (i20 < tL_messages_stickerSet2.packs.size()) {
                            TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet2.packs.get(i20);
                            if (tL_stickerPack == null || (str4 = tL_stickerPack.emoticon) == null || !str4.contains(str5)) {
                                i13 = i17;
                            } else {
                                i13 = i17;
                                int i21 = 0;
                                while (true) {
                                    if (i21 < tL_stickerPack.documents.size()) {
                                        long jLongValue = tL_stickerPack.documents.get(i21).longValue();
                                        int i22 = i21;
                                        int i23 = 0;
                                        while (true) {
                                            if (i23 >= tL_messages_stickerSet2.documents.size()) {
                                                i14 = iMin;
                                                document = null;
                                                break;
                                            }
                                            document = tL_messages_stickerSet2.documents.get(i23);
                                            int i24 = i23;
                                            i14 = iMin;
                                            if (document != null && document.f22386id == jLongValue) {
                                                break;
                                            }
                                            i23 = i24 + 1;
                                            iMin = i14;
                                        }
                                        if (document != null && document.attributes != null && !arrayList5.contains(document) && !hashSet.contains(Long.valueOf(document.f22386id))) {
                                            hashSet.add(Long.valueOf(document.f22386id));
                                            arrayList5.add(document);
                                            if (arrayList5.size() >= iIntValue) {
                                                break;
                                            }
                                        }
                                        i21 = i22 + 1;
                                        iMin = i14;
                                    }
                                }
                                i20++;
                                i17 = i13;
                                iMin = i14;
                            }
                            i14 = iMin;
                            i20++;
                            i17 = i13;
                            iMin = i14;
                        }
                        i12 = i17;
                        i10 = iMin;
                    }
                    if (arrayList5.size() >= iIntValue) {
                        break;
                    }
                    i17 = i12 + 1;
                    iMin = i10;
                }
                if (arrayList5.size() >= iIntValue || featuredEmojiSets == null) {
                    arrayList2 = featuredEmojiSets;
                    break;
                }
                int i25 = 0;
                while (true) {
                    if (i25 >= featuredEmojiSets.size()) {
                        arrayList2 = featuredEmojiSets;
                        break;
                    }
                    TLRPC.StickerSetCovered stickerSetCovered2 = featuredEmojiSets.get(i25);
                    if (stickerSetCovered2 != null) {
                        ArrayList<TLRPC.Document> arrayList7 = stickerSetCovered2 instanceof TLRPC.TL_stickerSetFullCovered ? ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered2).documents : stickerSetCovered2.covers;
                        if (arrayList7 != null) {
                            int i26 = 0;
                            while (true) {
                                if (i26 >= arrayList7.size()) {
                                    i11 = i25;
                                    arrayList2 = featuredEmojiSets;
                                    break;
                                }
                                TLRPC.Document document3 = arrayList7.get(i26);
                                if (document3 == null || document3.attributes == null || arrayList5.contains(document3)) {
                                    i11 = i25;
                                    arrayList2 = featuredEmojiSets;
                                } else {
                                    i11 = i25;
                                    int i27 = 0;
                                    while (true) {
                                        if (i27 >= document3.attributes.size()) {
                                            arrayList2 = featuredEmojiSets;
                                            tL_documentAttributeCustomEmoji = null;
                                            break;
                                        }
                                        TLRPC.DocumentAttribute documentAttribute2 = document3.attributes.get(i27);
                                        arrayList2 = featuredEmojiSets;
                                        if (documentAttribute2 instanceof TLRPC.TL_documentAttributeCustomEmoji) {
                                            tL_documentAttributeCustomEmoji = (TLRPC.TL_documentAttributeCustomEmoji) documentAttribute2;
                                            break;
                                        } else {
                                            i27++;
                                            featuredEmojiSets = arrayList2;
                                        }
                                    }
                                    if (tL_documentAttributeCustomEmoji != null && !TextUtils.isEmpty(tL_documentAttributeCustomEmoji.alt) && tL_documentAttributeCustomEmoji.alt.contains(str5) && (z12 || tL_documentAttributeCustomEmoji.free || ((stickerSet = stickerSetCovered2.set) != null && (str2 = stickerSet.short_name) != null && str2.equals(str)))) {
                                        stickerSetCovered = stickerSetCovered2;
                                        arrayList3 = arrayList7;
                                        if (!hashSet.contains(Long.valueOf(document3.f22386id))) {
                                            hashSet.add(Long.valueOf(document3.f22386id));
                                            arrayList5.add(document3);
                                            if (arrayList5.size() >= iIntValue) {
                                                break;
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                    i26++;
                                    stickerSetCovered2 = stickerSetCovered;
                                    arrayList7 = arrayList3;
                                    i25 = i11;
                                    featuredEmojiSets = arrayList2;
                                }
                                stickerSetCovered = stickerSetCovered2;
                                arrayList3 = arrayList7;
                                i26++;
                                stickerSetCovered2 = stickerSetCovered;
                                arrayList7 = arrayList3;
                                i25 = i11;
                                featuredEmojiSets = arrayList2;
                            }
                            if (arrayList5.size() >= iIntValue) {
                                break;
                            }
                        } else {
                            i11 = i25;
                            arrayList2 = featuredEmojiSets;
                        }
                    } else {
                        i11 = i25;
                        arrayList2 = featuredEmojiSets;
                    }
                    i25 = i11 + 1;
                    featuredEmojiSets = arrayList2;
                }
                if (!arrayList5.isEmpty()) {
                    String str6 = ((KeywordResult) arrayList.get(i15)).keyword;
                    for (int i28 = 0; i28 < arrayList5.size(); i28++) {
                        TLRPC.Document document4 = (TLRPC.Document) arrayList5.get(i28);
                        if (document4 != null) {
                            KeywordResult keywordResult = new KeywordResult();
                            keywordResult.emoji = "animated_" + document4.f22386id;
                            keywordResult.keyword = str6;
                            arrayList4.add(keywordResult);
                        }
                    }
                }
            }
            i15++;
            mediaDataController = this;
            z13 = z12;
            featuredEmojiSets = arrayList2;
            iMin = i10;
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
        loadStickers(5, true, false, false, new h2(zArr, arrayListArr, runnable, 4));
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
        AndroidUtilities.runOnUIThread(new a9(this, getCachedStickerSetInternal(str.toLowerCase(), (Integer) 0), callback, 4));
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
        SQLiteCursor sQLiteCursorQuery = null;
        try {
            try {
                int i10 = 1;
                Object[] objArr = new Object[strArr.length + 1];
                objArr[0] = str;
                String str2 = "1 = 1";
                int i11 = 0;
                while (i11 < strArr.length) {
                    if (i11 == 0) {
                        str2 = "lang = ?";
                    } else {
                        str2 = str2 + " OR lang = ?";
                    }
                    SQLiteCursor sQLiteCursorQueryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT alias FROM emoji_keywords_info_v2 WHERE lang = ?", strArr[i11]);
                    if (sQLiteCursorQueryFinalized.next()) {
                        strArr[i11] = sQLiteCursorQueryFinalized.stringValue(0);
                    }
                    sQLiteCursorQueryFinalized.dispose();
                    int i12 = i11 + 1;
                    objArr[i12] = strArr[i11];
                    i11 = i12;
                }
                sQLiteCursorQuery = getMessagesStorage().getDatabase().executeFast("SELECT keyword FROM emoji_keywords_v2 WHERE emoji = ? AND (" + str2 + ")").query(objArr);
                ArrayList arrayList = new ArrayList();
                while (sQLiteCursorQuery.next()) {
                    arrayList.add(sQLiteCursorQuery.stringValue(0));
                }
                AndroidUtilities.runOnUIThread(new f2(callback, arrayList, i10));
                sQLiteCursorQuery.dispose();
            } catch (Exception e9) {
                FileLog.e(e9);
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
        int i10 = iIndexOf2 >= 0 ? iIndexOf2 : Integer.MAX_VALUE;
        if (iIndexOf < i10) {
            return -1;
        }
        if (iIndexOf > i10) {
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
            AndroidUtilities.runOnUIThread(new k7(keywordResultCallback, arrayList, str, 1));
        } else {
            keywordResultCallback.run(arrayList, str);
            countDownLatch.countDown();
        }
    }

    public void lambda$getEmojiSuggestions$224(String[] strArr, KeywordResultCallback keywordResultCallback, boolean z10, String str, boolean z11, ArrayList arrayList, boolean z12, Integer num, boolean z13, boolean z14, boolean z15, CountDownLatch countDownLatch) {
        String str2;
        ArrayList<KeywordResult> arrayList2;
        String str3;
        StringBuilder sb2;
        int length;
        String string;
        SQLiteCursor sQLiteCursorQueryFinalized;
        String strReplace;
        char cCharAt;
        ArrayList<KeywordResult> arrayList3 = new ArrayList<>();
        HashMap map = new HashMap();
        int i10 = 0;
        String strStringValue = null;
        boolean z16 = false;
        for (String str4 : strArr) {
            try {
                SQLiteCursor sQLiteCursorQueryFinalized2 = getMessagesStorage().getDatabase().queryFinalized("SELECT alias FROM emoji_keywords_info_v2 WHERE lang = ?", str4);
                if (sQLiteCursorQueryFinalized2.next()) {
                    strStringValue = sQLiteCursorQueryFinalized2.stringValue(0);
                }
                sQLiteCursorQueryFinalized2.dispose();
                if (strStringValue != null) {
                    z16 = true;
                }
            } catch (Exception e9) {
                e = e9;
            }
        }
        if (!z16) {
            try {
                AndroidUtilities.runOnUIThread(new lk(this, strArr, keywordResultCallback, arrayList3, 14));
                return;
            } catch (Exception e10) {
                e = e10;
                arrayList3 = arrayList3;
                FileLog.e(e);
                str2 = strStringValue;
                Collections.sort(arrayList3, new j7(arrayList, i10));
                if (z12) {
                    fillWithAnimatedEmoji(arrayList3, num, z13, z14, z15, new lk(countDownLatch, keywordResultCallback, arrayList3, str2, 15));
                    return;
                }
                arrayList2 = arrayList3;
                if (countDownLatch != null) {
                    AndroidUtilities.runOnUIThread(new k7(keywordResultCallback, arrayList2, str2, i10));
                } else {
                    keywordResultCallback.run(arrayList2, str2);
                    countDownLatch.countDown();
                }
            }
        }
        if (z10) {
            int[] iArr = new int[1];
            str3 = str;
            ArrayList<Emoji.EmojiSpanRange> emojis = Emoji.parseEmojis(str3, iArr);
            if (iArr[0] > 0) {
                for (int i11 = 0; i11 < emojis.size(); i11++) {
                    String string2 = emojis.get(i11).code.toString();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList3.size()) {
                            KeywordResult keywordResult = new KeywordResult();
                            keywordResult.emoji = string2;
                            keywordResult.keyword = "";
                            arrayList3.add(keywordResult);
                            break;
                        }
                        if (TextUtils.equals(arrayList3.get(i12).emoji, string2)) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
            }
        } else {
            str3 = str;
        }
        String lowerCase = str3.toLowerCase();
        for (int i13 = 0; i13 < 2; i13++) {
            if (i13 == 1) {
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase, false, false);
                if (!translitString.equals(lowerCase)) {
                    lowerCase = translitString;
                    sb2 = new StringBuilder(lowerCase);
                    length = sb2.length();
                    while (true) {
                        if (length > 0) {
                            string = null;
                            break;
                        }
                        length--;
                        cCharAt = (char) (sb2.charAt(length) + 1);
                        sb2.setCharAt(length, cCharAt);
                        if (cCharAt != 0) {
                            string = sb2.toString();
                            break;
                        }
                    }
                    if (z11) {
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
                            arrayList3.add(keywordResult2);
                        }
                    }
                    sQLiteCursorQueryFinalized.dispose();
                }
            } else {
                sb2 = new StringBuilder(lowerCase);
                length = sb2.length();
                while (true) {
                    if (length > 0) {
                        string = null;
                        break;
                    }
                    length--;
                    cCharAt = (char) (sb2.charAt(length) + 1);
                    sb2.setCharAt(length, cCharAt);
                    if (cCharAt != 0) {
                        string = sb2.toString();
                        break;
                    }
                }
                if (z11) {
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
                        arrayList3.add(keywordResult3);
                    }
                }
                sQLiteCursorQueryFinalized.dispose();
            }
        }
        str2 = strStringValue;
        Collections.sort(arrayList3, new j7(arrayList, i10));
        if (z12) {
            fillWithAnimatedEmoji(arrayList3, num, z13, z14, z15, new lk(countDownLatch, keywordResultCallback, arrayList3, str2, 15));
            return;
        }
        arrayList2 = arrayList3;
        if (countDownLatch != null) {
            AndroidUtilities.runOnUIThread(new k7(keywordResultCallback, arrayList2, str2, i10));
        } else {
            keywordResultCallback.run(arrayList2, str2);
            countDownLatch.countDown();
        }
    }

    public static TLRPC.MessageEntity lambda$getEntities$181(Void r10) {
        return new TLRPC.TL_messageEntityBold();
    }

    public static TLRPC.MessageEntity lambda$getEntities$182(Void r10) {
        return new TLRPC.TL_messageEntityItalic();
    }

    public static TLRPC.MessageEntity lambda$getEntities$183(Void r10) {
        return new TLRPC.TL_messageEntitySpoiler();
    }

    public static TLRPC.MessageEntity lambda$getEntities$184(Void r10) {
        return new TLRPC.TL_messageEntityStrike();
    }

    public void lambda$getMediaCount$132(long j10, long j11, int i10, int i11, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof Vector) {
            Vector vector = (Vector) tLObject;
            if (vector.objects.isEmpty()) {
                return;
            }
            processLoadedMediaCount(((TLRPC.TL_messages_searchCounter) vector.objects.get(0)).count, j10, j11, i10, i11, false, 0);
        }
    }

    public void lambda$getMediaCountDatabase$139(long j10, long j11, int i10, int i11) {
        SQLiteCursor sQLiteCursorQueryFinalized;
        int iIntValue;
        int iIntValue2;
        try {
            if (j10 != 0) {
                SQLiteDatabase database = getMessagesStorage().getDatabase();
                Locale locale = Locale.US;
                sQLiteCursorQueryFinalized = database.queryFinalized("SELECT count, old FROM media_counts_topics WHERE uid = " + j11 + " AND topic_id = " + j10 + " AND type = " + i10 + " LIMIT 1", new Object[0]);
            } else {
                SQLiteDatabase database2 = getMessagesStorage().getDatabase();
                Locale locale2 = Locale.US;
                sQLiteCursorQueryFinalized = database2.queryFinalized("SELECT count, old FROM media_counts_v2 WHERE uid = " + j11 + " AND type = " + i10 + " LIMIT 1", new Object[0]);
            }
            if (sQLiteCursorQueryFinalized.next()) {
                iIntValue = sQLiteCursorQueryFinalized.intValue(0);
                iIntValue2 = sQLiteCursorQueryFinalized.intValue(1);
            } else {
                iIntValue = -1;
                iIntValue2 = 0;
            }
            sQLiteCursorQueryFinalized.dispose();
            if (iIntValue == -1 && DialogObject.isEncryptedDialog(j11)) {
                SQLiteDatabase database3 = getMessagesStorage().getDatabase();
                Locale locale3 = Locale.US;
                SQLiteCursor sQLiteCursorQueryFinalized2 = database3.queryFinalized("SELECT COUNT(mid) FROM media_v4 WHERE uid = " + j11 + " AND type = " + i10 + " LIMIT 1", new Object[0]);
                if (sQLiteCursorQueryFinalized2.next()) {
                    iIntValue = sQLiteCursorQueryFinalized2.intValue(0);
                }
                sQLiteCursorQueryFinalized2.dispose();
                if (iIntValue != -1) {
                    putMediaCountDatabase(j11, j10, i10, iIntValue);
                }
            }
            processLoadedMediaCount(iIntValue, j11, j10, i10, i11, true, iIntValue2);
        } catch (Exception e9) {
            FileLog.e(e9);
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
                } else {
                    if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterPoll) {
                        i10 = 8;
                    }
                }
                int i13 = tL_messages_searchCounter.count;
                iArr[i10] = i13;
                putMediaCountDatabase(j10, j11, i10, i13);
            }
        }
        AndroidUtilities.runOnUIThread(new m7(this, j10, j11, iArr, 0));
    }

    public void lambda$getMediaCounts$130(long j10, long j11, int[] iArr) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mediaCountsDidLoad, Long.valueOf(j10), Long.valueOf(j11), iArr);
    }

    public void lambda$getMediaCounts$131(long j10, long j11, int i10) {
        SQLiteCursor sQLiteCursorQueryFinalized;
        long j12 = j10;
        long j13 = j11;
        int i11 = 9;
        try {
            int[] iArr = new int[9];
            int i12 = 0;
            iArr[0] = -1;
            iArr[1] = -1;
            int i13 = 2;
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
            if (j12 != 0) {
                SQLiteDatabase database = getMessagesStorage().getDatabase();
                Locale locale = Locale.US;
                sQLiteCursorQueryFinalized = database.queryFinalized("SELECT type, count, old FROM media_counts_topics WHERE uid = " + j13 + " AND topic_id = " + j12, new Object[0]);
            } else {
                SQLiteDatabase database2 = getMessagesStorage().getDatabase();
                Locale locale2 = Locale.US;
                sQLiteCursorQueryFinalized = database2.queryFinalized("SELECT type, count, old FROM media_counts_v2 WHERE uid = " + j13, new Object[0]);
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
            if (DialogObject.isEncryptedDialog(j13)) {
                int i14 = 0;
                while (i14 < 9) {
                    if (iArr[i14] == -1) {
                        SQLiteDatabase database3 = getMessagesStorage().getDatabase();
                        Locale locale3 = Locale.US;
                        SQLiteCursor sQLiteCursorQueryFinalized2 = database3.queryFinalized("SELECT COUNT(mid) FROM media_v4 WHERE uid = " + j13 + " AND type = " + i14 + " LIMIT 1", new Object[0]);
                        if (sQLiteCursorQueryFinalized2.next()) {
                            iArr[i14] = sQLiteCursorQueryFinalized2.intValue(0);
                        } else {
                            iArr[i14] = 0;
                        }
                        sQLiteCursorQueryFinalized2.dispose();
                        putMediaCountDatabase(j13, j12, i14, iArr[i14]);
                    }
                    i14++;
                    j12 = j10;
                    j13 = j11;
                }
                AndroidUtilities.runOnUIThread(new m7(this, j11, j10, iArr, 1));
                return;
            }
            TLRPC.TL_messages_getSearchCounters tL_messages_getSearchCounters = new TLRPC.TL_messages_getSearchCounters();
            tL_messages_getSearchCounters.peer = getMessagesController().getInputPeer(j13);
            if (j12 != 0) {
                if (j13 == getUserConfig().getClientUserId()) {
                    tL_messages_getSearchCounters.saved_peer_id = getMessagesController().getInputPeer(j12);
                    tL_messages_getSearchCounters.flags |= 4;
                } else {
                    tL_messages_getSearchCounters.top_msg_id = (int) j12;
                    tL_messages_getSearchCounters.flags |= 1;
                }
            }
            int i15 = 0;
            boolean z10 = false;
            while (i15 < i11) {
                if (tL_messages_getSearchCounters.peer == null) {
                    iArr[i15] = i12;
                } else {
                    if (iArr[i15] == -1 || iArr3[i15] == 1) {
                        if (i15 == 0) {
                            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterPhotoVideo());
                        } else if (i15 == 1) {
                            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterDocument());
                        } else if (i15 == i13) {
                            tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterRoundVoice());
                        } else {
                            if (i15 == 3) {
                                tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterUrl());
                            } else if (i15 == 4) {
                                tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterMusic());
                            } else if (i15 == 6) {
                                tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterPhotos());
                            } else if (i15 == 7) {
                                tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterVideo());
                            } else if (i15 == 8) {
                                tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterPoll());
                            } else {
                                tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterGif());
                            }
                            if (iArr[i15] == -1) {
                                z10 = true;
                            } else if (iArr3[i15] == 1) {
                                iArr[i15] = -1;
                            }
                        }
                        if (iArr[i15] == -1) {
                            z10 = true;
                        } else if (iArr3[i15] == 1) {
                            iArr[i15] = -1;
                        }
                    }
                    i15++;
                    i13 = 2;
                    i11 = 9;
                    i12 = 0;
                }
                i15++;
                i13 = 2;
                i11 = 9;
                i12 = 0;
            }
            if (!tL_messages_getSearchCounters.filters.isEmpty()) {
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getSearchCounters, new hh.d2(this, iArr, j13, j12, 2)), i10);
            }
            if (z10 && getConnectionsManager().getConnectionState() == 3) {
                return;
            }
            AndroidUtilities.runOnUIThread(new m7(this, j11, j10, iArr2, 2));
        } catch (Exception e9) {
            FileLog.e(e9);
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
        this.stickerSetsById.k(tL_messages_stickerSet, stickerSet.f22407id);
        this.stickerSetsByName.put(tL_messages_stickerSet.set.short_name.toLowerCase(), tL_messages_stickerSet);
        saveStickerSetIntoCache(tL_messages_stickerSet);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupStickersDidLoad, Long.valueOf(tL_messages_stickerSet.set.f22407id), tL_messages_stickerSet);
    }

    public void lambda$getStickerSet$33(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z10, TLRPC.InputStickerSet inputStickerSet) {
        int i10 = 0;
        if (tL_messages_stickerSet == null) {
            if (z10) {
                this.loadingStickerSetsKeys.remove(str);
                return;
            } else {
                fetchStickerSetInternal(inputStickerSet, new p7(this, str, callback, i10));
                return;
            }
        }
        this.loadingStickerSetsKeys.remove(str);
        if (callback != null) {
            callback.run(tL_messages_stickerSet);
        }
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        if (stickerSet != null) {
            this.stickerSetsById.k(tL_messages_stickerSet, stickerSet.f22407id);
            this.stickerSetsByName.put(tL_messages_stickerSet.set.short_name.toLowerCase(), tL_messages_stickerSet);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupStickersDidLoad, Long.valueOf(tL_messages_stickerSet.set.f22407id), tL_messages_stickerSet);
    }

    public void lambda$getStickerSet$34(TLRPC.InputStickerSet inputStickerSet, Integer num, String str, Utilities.Callback callback, boolean z10) {
        AndroidUtilities.runOnUIThread(new p8(this, getCachedStickerSetInternal(inputStickerSet.f22400id, num), str, callback, z10, inputStickerSet, 0));
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
        this.stickerSetsById.k(tL_messages_stickerSet, stickerSet.f22407id);
        this.stickerSetsByName.put(tL_messages_stickerSet.set.short_name.toLowerCase(), tL_messages_stickerSet);
        saveStickerSetIntoCache(tL_messages_stickerSet);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupStickersDidLoad, Long.valueOf(tL_messages_stickerSet.set.f22407id), tL_messages_stickerSet);
    }

    public void lambda$getStickerSet$36(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z10, TLRPC.InputStickerSet inputStickerSet) {
        int i10 = 1;
        if (tL_messages_stickerSet == null) {
            if (z10) {
                this.loadingStickerSetsKeys.remove(str);
                return;
            } else {
                fetchStickerSetInternal(inputStickerSet, new p7(this, str, callback, i10));
                return;
            }
        }
        this.loadingStickerSetsKeys.remove(str);
        if (callback != null) {
            callback.run(tL_messages_stickerSet);
        }
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        if (stickerSet != null) {
            this.stickerSetsById.k(tL_messages_stickerSet, stickerSet.f22407id);
            this.stickerSetsByName.put(tL_messages_stickerSet.set.short_name.toLowerCase(), tL_messages_stickerSet);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupStickersDidLoad, Long.valueOf(tL_messages_stickerSet.set.f22407id), tL_messages_stickerSet);
    }

    public void lambda$getStickerSet$37(TLRPC.InputStickerSet inputStickerSet, Integer num, String str, Utilities.Callback callback, boolean z10) {
        AndroidUtilities.runOnUIThread(new p8(this, getCachedStickerSetInternal(inputStickerSet.short_name.toLowerCase(), num), str, callback, z10, inputStickerSet, 1));
    }

    public void lambda$getStickerSet$38(String str, Utilities.Callback callback, TLRPC.InputStickerSet inputStickerSet, Boolean bool, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.loadingStickerSetsKeys.remove(str);
        if (callback != null) {
            callback.run(tL_messages_stickerSet);
        }
        if (tL_messages_stickerSet != null) {
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null) {
                this.stickerSetsById.k(tL_messages_stickerSet, stickerSet.f22407id);
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
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupStickersDidLoad, Long.valueOf(tL_messages_stickerSet.set.f22407id), tL_messages_stickerSet);
        }
    }

    public static int lambda$getTextStyleRuns$180(TLRPC.MessageEntity messageEntity, TLRPC.MessageEntity messageEntity2) {
        int i10 = messageEntity.offset;
        int i11 = messageEntity2.offset;
        if (i10 > i11) {
            return 1;
        }
        return i10 < i11 ? -1 : 0;
    }

    public static int lambda$increaseInlineRating$150(TLRPC.TL_topPeer tL_topPeer, TLRPC.TL_topPeer tL_topPeer2) {
        double d = tL_topPeer.rating;
        double d10 = tL_topPeer2.rating;
        if (d > d10) {
            return -1;
        }
        return d < d10 ? 1 : 0;
    }

    public static int lambda$increasePeerRaiting$155(TLRPC.TL_topPeer tL_topPeer, TLRPC.TL_topPeer tL_topPeer2) {
        double d = tL_topPeer.rating;
        double d10 = tL_topPeer2.rating;
        if (d > d10) {
            return -1;
        }
        return d < d10 ? 1 : 0;
    }

    public void lambda$increasePeerRaiting$156(long j10, double d) {
        TLRPC.TL_topPeer tL_topPeer;
        int i10 = 0;
        while (true) {
            if (i10 >= this.hints.size()) {
                tL_topPeer = null;
                break;
            }
            tL_topPeer = this.hints.get(i10);
            if (tL_topPeer.peer.user_id == j10) {
                break;
            } else {
                i10++;
            }
        }
        if (tL_topPeer == null) {
            tL_topPeer = new TLRPC.TL_topPeer();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_topPeer.peer = tL_peerUser;
            tL_peerUser.user_id = j10;
            this.hints.add(tL_topPeer);
        }
        tL_topPeer.rating = Math.exp(d / ((double) getMessagesController().ratingDecay)) + tL_topPeer.rating;
        Collections.sort(this.hints, new q(11));
        savePeer(j10, 0, tL_topPeer.rating);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadHints, new Object[0]);
    }

    public void lambda$increasePeerRaiting$157(final long j10) {
        int iIntValue;
        double d = 0.0d;
        try {
            SQLiteDatabase database = getMessagesStorage().getDatabase();
            Locale locale = Locale.US;
            int iIntValue2 = 0;
            SQLiteCursor sQLiteCursorQueryFinalized = database.queryFinalized("SELECT MAX(mid), MAX(date) FROM messages_v2 WHERE uid = " + j10 + " AND out = 1", new Object[0]);
            if (sQLiteCursorQueryFinalized.next()) {
                iIntValue2 = sQLiteCursorQueryFinalized.intValue(0);
                iIntValue = sQLiteCursorQueryFinalized.intValue(1);
            } else {
                iIntValue = 0;
            }
            sQLiteCursorQueryFinalized.dispose();
            if (iIntValue2 > 0 && getUserConfig().ratingLoadTime != 0) {
                d = iIntValue - getUserConfig().ratingLoadTime;
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        final double d10 = d;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f20472a.lambda$increasePeerRaiting$156(j10, d10);
            }
        });
    }

    public static int lambda$increaseWebappRating$151(TLRPC.TL_topPeer tL_topPeer, TLRPC.TL_topPeer tL_topPeer2) {
        double d = tL_topPeer.rating;
        double d10 = tL_topPeer2.rating;
        if (d > d10) {
            return -1;
        }
        return d < d10 ? 1 : 0;
    }

    public void lambda$loadArchivedStickersCount$71(TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        if (tL_error == null) {
            TLRPC.TL_messages_archivedStickers tL_messages_archivedStickers = (TLRPC.TL_messages_archivedStickers) tLObject;
            this.archivedStickersCount[i10] = tL_messages_archivedStickers.count;
            MessagesController.getNotificationsSettings(this.currentAccount).edit().putInt(i0.a.k(i10, "archivedStickersCount"), tL_messages_archivedStickers.count).commit();
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.archivedStickersCountDidLoad, Integer.valueOf(i10));
        }
    }

    public void lambda$loadArchivedStickersCount$72(int i10, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new h0(this, tL_error, tLObject, i10, 6));
    }

    public void lambda$loadAttachMenuBots$3() throws Throwable {
        long j10;
        int i10;
        TLRPC.TL_attachMenuBots tL_attachMenuBots;
        int i11;
        TLRPC.TL_attachMenuBots tL_attachMenuBots2;
        TLRPC.TL_attachMenuBots tL_attachMenuBots3;
        int iIntValue;
        SQLiteCursor sQLiteCursor = null;
        tL_attachMenuBots = null;
        TLRPC.TL_attachMenuBots tL_attachMenuBots4 = null;
        sQLiteCursor = null;
        long jLongValue = 0;
        try {
            try {
                SQLiteCursor sQLiteCursorQueryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT data, hash, date FROM attach_menu_bots", new Object[0]);
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
                            j10 = jLongValue;
                            tL_attachMenuBots3 = tL_attachMenuBots4;
                            iIntValue = sQLiteCursorQueryFinalized.intValue(2);
                        } else {
                            j10 = 0;
                            tL_attachMenuBots3 = null;
                            iIntValue = 0;
                        }
                        if (tL_attachMenuBots3 != null) {
                            try {
                                ArrayList<Long> arrayList = new ArrayList<>();
                                for (int i12 = 0; i12 < tL_attachMenuBots3.bots.size(); i12++) {
                                    arrayList.add(Long.valueOf(tL_attachMenuBots3.bots.get(i12).bot_id));
                                }
                                tL_attachMenuBots3.users.addAll(getMessagesStorage().getUsers(arrayList));
                            } catch (Exception e9) {
                                e = e9;
                                tL_attachMenuBots = tL_attachMenuBots3;
                                i10 = iIntValue;
                                sQLiteCursor = sQLiteCursorQueryFinalized;
                                FileLog.e((Throwable) e, false);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                i11 = i10;
                                tL_attachMenuBots2 = tL_attachMenuBots;
                            }
                        }
                        sQLiteCursorQueryFinalized.dispose();
                        i11 = iIntValue;
                        tL_attachMenuBots2 = tL_attachMenuBots3;
                    } catch (Throwable th) {
                        th = th;
                        sQLiteCursor = sQLiteCursorQueryFinalized;
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e10) {
                    e = e10;
                    j10 = jLongValue;
                    i10 = 0;
                    tL_attachMenuBots = tL_attachMenuBots4;
                }
            } catch (Exception e11) {
                e = e11;
                j10 = 0;
                i10 = 0;
                tL_attachMenuBots = null;
            }
            processLoadedMenuBots(tL_attachMenuBots2, j10, i11, true);
        } catch (Throwable th2) {
            th = th2;
        }
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

    public void lambda$loadAvatarConstructor$241(TLObject tLObject, SharedPreferences sharedPreferences, boolean z10) {
        if (tLObject instanceof TLRPC.TL_emojiList) {
            SerializedData serializedData = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (z10) {
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

    public void lambda$loadAvatarConstructor$242(SharedPreferences sharedPreferences, boolean z10, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new qj(this, tLObject, sharedPreferences, z10, 8));
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
            TL_bots.BotInfo botInfoLoadBotInfoInternal = loadBotInfoInternal(j10, j11);
            if (botInfoLoadBotInfoInternal != null) {
                AndroidUtilities.runOnUIThread(new h0(this, callback, botInfoLoadBotInfoInternal, i10, 7));
            } else if (callback != null) {
                AndroidUtilities.runOnUIThread(new r7(2, callback));
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public void lambda$loadBotKeyboard$195(TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botKeyboardDidLoad, message, topicKey);
    }

    public void lambda$loadBotKeyboard$196(MessagesStorage.TopicKey topicKey, boolean z10) {
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
            if (messageTLdeserialize == null && !z10) {
                return;
            }
            AndroidUtilities.runOnUIThread(new w6(this, messageTLdeserialize, topicKey));
        } catch (Exception e9) {
            FileLog.e(e9);
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
            AndroidUtilities.runOnUIThread(new i7(this, 16));
        } else {
            getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new i7(this, 17));
        }
    }

    public void lambda$loadFeaturedStickers$55(boolean z10) {
        ArrayList<TLRPC.StickerSetCovered> arrayList;
        long j10;
        int iIntValue;
        boolean z11;
        ArrayList<TLRPC.StickerSetCovered> arrayList2;
        int i10;
        ArrayList<Long> arrayList3 = new ArrayList<>();
        SQLiteCursor sQLiteCursor = null;
        arrayList = null;
        arrayList = null;
        ArrayList<TLRPC.StickerSetCovered> arrayList4 = null;
        int i11 = 0;
        long jLongValue = 0;
        try {
            SQLiteDatabase database = getMessagesStorage().getDatabase();
            StringBuilder sb2 = new StringBuilder("SELECT data, unread, date, hash, premium FROM stickers_featured WHERE emoji = ");
            sb2.append(z10 ? 1 : 0);
            sb2.append(" AND id = ");
            sb2.append(z10 ? 2 : 1);
            SQLiteCursor sQLiteCursorQueryFinalized = database.queryFinalized(sb2.toString(), new Object[0]);
            try {
                if (sQLiteCursorQueryFinalized.next()) {
                    NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                    if (nativeByteBufferByteBufferValue != null) {
                        arrayList = new ArrayList<>();
                        try {
                            int int32 = nativeByteBufferByteBufferValue.readInt32(false);
                            for (int i12 = 0; i12 < int32; i12++) {
                                arrayList.add(TLRPC.StickerSetCovered.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false));
                            }
                            nativeByteBufferByteBufferValue.reuse();
                            arrayList4 = arrayList;
                        } catch (Throwable th) {
                            th = th;
                            sQLiteCursor = sQLiteCursorQueryFinalized;
                            iIntValue = 0;
                            try {
                                FileLog.e(th);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                arrayList2 = arrayList;
                                j10 = jLongValue;
                                z11 = false;
                                processLoadedFeaturedStickers(z10, arrayList2, arrayList3, z11, true, iIntValue, j10);
                            } catch (Throwable th2) {
                                if (sQLiteCursor == null) {
                                    throw th2;
                                }
                                sQLiteCursor.dispose();
                                throw th2;
                            }
                        }
                    }
                    NativeByteBuffer nativeByteBufferByteBufferValue2 = sQLiteCursorQueryFinalized.byteBufferValue(1);
                    if (nativeByteBufferByteBufferValue2 != null) {
                        int int33 = nativeByteBufferByteBufferValue2.readInt32(false);
                        for (int i13 = 0; i13 < int33; i13++) {
                            arrayList3.add(Long.valueOf(nativeByteBufferByteBufferValue2.readInt64(false)));
                        }
                        nativeByteBufferByteBufferValue2.reuse();
                    }
                    iIntValue = sQLiteCursorQueryFinalized.intValue(2);
                    try {
                        jLongValue = sQLiteCursorQueryFinalized.longValue(3);
                        i10 = sQLiteCursorQueryFinalized.intValue(4) == 1 ? 1 : 0;
                        i11 = iIntValue;
                    } catch (Throwable th3) {
                        th = th3;
                        arrayList = arrayList4;
                        sQLiteCursor = sQLiteCursorQueryFinalized;
                        FileLog.e(th);
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        arrayList2 = arrayList;
                        j10 = jLongValue;
                        z11 = false;
                    }
                } else {
                    i10 = 0;
                }
                sQLiteCursorQueryFinalized.dispose();
                arrayList2 = arrayList4;
                iIntValue = i11;
                j10 = jLongValue;
                z11 = i10;
            } catch (Throwable th4) {
                th = th4;
                arrayList = arrayList4;
            }
        } catch (Throwable th5) {
            th = th5;
            arrayList = null;
        }
        processLoadedFeaturedStickers(z10, arrayList2, arrayList3, z11, true, iIntValue, j10);
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
        } else {
            if (!(tLObject instanceof TLRPC.TL_messages_featuredStickersNotModified)) {
                processLoadedFeaturedStickers(z10, null, null, false, false, (int) (System.currentTimeMillis() / 1000), j10);
                return;
            }
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            AndroidUtilities.runOnUIThread(new r8(this, z10, iCurrentTimeMillis, 2));
            putFeaturedStickersToCache(z10, null, null, iCurrentTimeMillis, j10, false);
        }
    }

    public void lambda$loadFeaturedStickers$58(boolean z10, long j10, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new t8(this, tLObject, z10, j10, 0));
    }

    public void lambda$loadGroupStickerSet$43(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.groupStickerSets.k(tL_messages_stickerSet, tL_messages_stickerSet.set.f22407id);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupStickersDidLoad, Long.valueOf(tL_messages_stickerSet.set.f22407id), tL_messages_stickerSet);
    }

    public void lambda$loadGroupStickerSet$44(TLRPC.StickerSet stickerSet) {
        TLRPC.StickerSet stickerSet2;
        NativeByteBuffer nativeByteBufferByteBufferValue;
        try {
            SQLiteCursor sQLiteCursorQueryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT document FROM web_recent_v3 WHERE id = 's_" + stickerSet.f22407id + "'", new Object[0]);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSetTLdeserialize = null;
            if (sQLiteCursorQueryFinalized.next() && !sQLiteCursorQueryFinalized.isNull(0) && (nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0)) != null) {
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
            AndroidUtilities.runOnUIThread(new d7(this, tL_messages_stickerSetTLdeserialize, 2));
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public void lambda$loadGroupStickerSet$45(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.groupStickerSets.k(tL_messages_stickerSet, tL_messages_stickerSet.set.f22407id);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupStickersDidLoad, Long.valueOf(tL_messages_stickerSet.set.f22407id), tL_messages_stickerSet);
    }

    public void lambda$loadGroupStickerSet$46(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            AndroidUtilities.runOnUIThread(new d7(this, (TLRPC.TL_messages_stickerSet) tLObject, 1));
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
            int i10 = 0;
            SQLiteCursor sQLiteCursorQueryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT did, type, rating FROM chat_hints WHERE 1 ORDER BY rating DESC", new Object[0]);
            while (sQLiteCursorQueryFinalized.next()) {
                long jLongValue = sQLiteCursorQueryFinalized.longValue(i10);
                if (jLongValue != clientUserId) {
                    int iIntValue = sQLiteCursorQueryFinalized.intValue(1);
                    TLRPC.TL_topPeer tL_topPeer = new TLRPC.TL_topPeer();
                    long j10 = clientUserId;
                    tL_topPeer.rating = sQLiteCursorQueryFinalized.doubleValue(2);
                    if (jLongValue > 0) {
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_topPeer.peer = tL_peerUser;
                        tL_peerUser.user_id = jLongValue;
                        arrayList7.add(Long.valueOf(jLongValue));
                    } else {
                        TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                        tL_topPeer.peer = tL_peerChat;
                        long j11 = -jLongValue;
                        tL_peerChat.chat_id = j11;
                        arrayList8.add(Long.valueOf(j11));
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
                    clientUserId = j10;
                    i10 = 0;
                }
            }
            sQLiteCursorQueryFinalized.dispose();
            if (!arrayList7.isEmpty()) {
                getMessagesStorage().getUsersInternal(arrayList7, arrayList5);
            }
            if (!arrayList8.isEmpty()) {
                getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList8), arrayList6);
            }
            AndroidUtilities.runOnUIThread(new il(this, arrayList5, arrayList6, arrayList, arrayList2, arrayList3, arrayList4, 2));
        } catch (Exception e9) {
            FileLog.e(e9);
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
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
            for (int i11 = 0; i11 < tL_contacts_topPeers.categories.size(); i11++) {
                TLRPC.TL_topPeerCategoryPeers tL_topPeerCategoryPeers = tL_contacts_topPeers.categories.get(i11);
                TLRPC.TopPeerCategory topPeerCategory = tL_topPeerCategoryPeers.category;
                if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsInline) {
                    i10 = 1;
                } else if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsApp) {
                    i10 = 2;
                } else {
                    i10 = topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsGuestChat ? 3 : 0;
                }
                for (int i12 = 0; i12 < tL_topPeerCategoryPeers.peers.size(); i12++) {
                    TLRPC.TL_topPeer tL_topPeer = tL_topPeerCategoryPeers.peers.get(i12);
                    sQLitePreparedStatementExecuteFast.requery();
                    sQLitePreparedStatementExecuteFast.bindLong(1, MessageObject.getPeerId(tL_topPeer.peer));
                    sQLitePreparedStatementExecuteFast.bindInteger(2, i10);
                    sQLitePreparedStatementExecuteFast.bindDouble(3, tL_topPeer.rating);
                    sQLitePreparedStatementExecuteFast.bindInteger(4, 0);
                    sQLitePreparedStatementExecuteFast.step();
                }
            }
            sQLitePreparedStatementExecuteFast.dispose();
            getMessagesStorage().getDatabase().commitTransaction();
            AndroidUtilities.runOnUIThread(new i7(this, 14));
        } catch (Exception e9) {
            FileLog.e(e9);
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
        for (int i10 = 0; i10 < tL_contacts_topPeers.categories.size(); i10++) {
            TLRPC.TL_topPeerCategoryPeers tL_topPeerCategoryPeers = tL_contacts_topPeers.categories.get(i10);
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
                for (int i11 = 0; i11 < this.hints.size(); i11++) {
                    if (this.hints.get(i11).peer.user_id == clientUserId) {
                        this.hints.remove(i11);
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
        getMessagesStorage().getStorageQueue().postRunnable(new d2(18, this, tL_contacts_topPeers));
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
        getMessagesStorage().updatePinnedMessages(j11, tL_channels_getMessages.f22418id, false, -1, 0, false, null);
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
        getMessagesStorage().updatePinnedMessages(j10, tL_messages_getMessages.f22474id, false, -1, 0, false, null);
    }

    public void lambda$loadPinnedMessages$161(long j10) {
        this.loadingPinnedMessages.l(j10);
    }

    public void lambda$loadPinnedMessages$162(int i10, TLRPC.TL_messages_search tL_messages_search, long j10, int i11, TLObject tLObject, TLRPC.TL_error tL_error) {
        int iMax;
        boolean z10;
        ArrayList<Integer> arrayList = new ArrayList<>();
        HashMap<Integer, MessageObject> map = new HashMap<>();
        int i12 = 1;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            a0.h hVar = new a0.h();
            for (int i13 = 0; i13 < messages_messages.users.size(); i13++) {
                TLRPC.User user = messages_messages.users.get(i13);
                hVar.k(user, user.f22527id);
            }
            a0.h hVar2 = new a0.h();
            for (int i14 = 0; i14 < messages_messages.chats.size(); i14++) {
                TLRPC.Chat chat = messages_messages.chats.get(i14);
                hVar2.k(chat, chat.f22380id);
            }
            getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
            getMessagesController().putUsers(messages_messages.users, false);
            getMessagesController().putChats(messages_messages.chats, false);
            int size = messages_messages.messages.size();
            for (int i15 = 0; i15 < size; i15++) {
                TLRPC.Message message = messages_messages.messages.get(i15);
                if (!(message instanceof TLRPC.TL_messageService) && !(message instanceof TLRPC.TL_messageEmpty)) {
                    arrayList.add(Integer.valueOf(message.f22401id));
                    map.put(Integer.valueOf(message.f22401id), new MessageObject(this.currentAccount, message, hVar, hVar2, false, false));
                }
            }
            if (i10 != 0 && arrayList.isEmpty()) {
                arrayList.add(Integer.valueOf(i10));
            }
            i12 = messages_messages.messages.size() >= tL_messages_search.limit ? 0 : 1;
            iMax = Math.max(messages_messages.count, messages_messages.messages.size());
            z10 = i12;
        } else {
            if (i10 != 0) {
                arrayList.add(Integer.valueOf(i10));
            } else {
                i12 = 0;
            }
            iMax = i12;
            z10 = false;
        }
        getMessagesStorage().updatePinnedMessages(j10, arrayList, true, iMax, i11, z10, map);
        AndroidUtilities.runOnUIThread(new c7(this, j10, 0));
    }

    public void lambda$loadPinnedMessages$163(long j10, long j11, ArrayList arrayList) {
        loadPinnedMessageInternal(j10, j11, arrayList, false);
    }

    public void lambda$loadPremiumPromo$7() throws Throwable {
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo;
        SQLiteCursor sQLiteCursor = null;
        tL_help_premiumPromoTLdeserialize = null;
        tL_help_premiumPromoTLdeserialize = null;
        TLRPC.TL_help_premiumPromo tL_help_premiumPromoTLdeserialize = null;
        sQLiteCursor = null;
        int iIntValue = 0;
        try {
            try {
                SQLiteCursor sQLiteCursorQueryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT data, date FROM premium_promo", new Object[0]);
                try {
                    if (sQLiteCursorQueryFinalized.next()) {
                        NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                        if (nativeByteBufferByteBufferValue != null) {
                            tL_help_premiumPromoTLdeserialize = TLRPC.TL_help_premiumPromo.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), true);
                            nativeByteBufferByteBufferValue.reuse();
                        }
                        iIntValue = sQLiteCursorQueryFinalized.intValue(1);
                    }
                    sQLiteCursorQueryFinalized.dispose();
                } catch (Exception e9) {
                    e = e9;
                    tL_help_premiumPromo = tL_help_premiumPromoTLdeserialize;
                    sQLiteCursor = sQLiteCursorQueryFinalized;
                    FileLog.e((Throwable) e, false);
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    tL_help_premiumPromoTLdeserialize = tL_help_premiumPromo;
                } catch (Throwable th) {
                    th = th;
                    sQLiteCursor = sQLiteCursorQueryFinalized;
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th;
                }
            } catch (Exception e10) {
                e = e10;
                tL_help_premiumPromo = null;
            }
            processLoadedPremiumPromo(tL_help_premiumPromoTLdeserialize, iIntValue, true);
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

    public void lambda$loadReactions$11(List list, int i10, int i11) {
        processLoadedReactions(list, i10, i11, true);
    }

    public void lambda$loadReactions$12() throws Throwable {
        ArrayList arrayList;
        int i10;
        int i11;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int iIntValue;
        SQLiteCursor sQLiteCursor;
        ArrayList arrayList4;
        int iIntValue2;
        ?? r10 = 0;
        arrayList = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        SQLiteCursor sQLiteCursor2 = null;
        int i12 = 0;
        try {
            try {
                SQLiteCursor sQLiteCursorQueryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT data, hash, date FROM reactions", new Object[0]);
                try {
                    try {
                        if (sQLiteCursorQueryFinalized.next()) {
                            NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                            if (nativeByteBufferByteBufferValue != null) {
                                int int32 = nativeByteBufferByteBufferValue.readInt32(false);
                                arrayList4 = new ArrayList(int32);
                                for (int i13 = 0; i13 < int32; i13++) {
                                    try {
                                        arrayList4.add(TLRPC.TL_availableReaction.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), true));
                                    } catch (Exception e9) {
                                        e = e9;
                                        sQLiteCursor2 = sQLiteCursorQueryFinalized;
                                        arrayList = arrayList4;
                                        iIntValue = 0;
                                        sQLiteCursor = sQLiteCursor2;
                                        arrayList3 = arrayList;
                                        FileLog.e((Throwable) e, false);
                                        if (sQLiteCursor != null) {
                                            sQLiteCursor.dispose();
                                        }
                                        i11 = iIntValue;
                                        arrayList2 = arrayList3;
                                        i10 = 0;
                                        r10 = sQLiteCursor;
                                        AndroidUtilities.runOnUIThread(new y4(this, arrayList2, i11, i10, 2));
                                    }
                                }
                                nativeByteBufferByteBufferValue.reuse();
                                arrayList6 = arrayList4;
                            }
                            iIntValue = sQLiteCursorQueryFinalized.intValue(1);
                            try {
                                iIntValue2 = sQLiteCursorQueryFinalized.intValue(2);
                                i12 = iIntValue;
                                arrayList5 = arrayList6;
                            } catch (Exception e10) {
                                e = e10;
                                arrayList3 = arrayList6;
                                sQLiteCursor = sQLiteCursorQueryFinalized;
                                FileLog.e((Throwable) e, false);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                i11 = iIntValue;
                                arrayList2 = arrayList3;
                                i10 = 0;
                                r10 = sQLiteCursor;
                            }
                        } else {
                            iIntValue2 = 0;
                        }
                        sQLiteCursorQueryFinalized.dispose();
                        i10 = iIntValue2;
                        arrayList2 = arrayList5;
                        i11 = i12;
                        r10 = arrayList5;
                    } catch (Throwable th) {
                        th = th;
                        r10 = sQLiteCursorQueryFinalized;
                        if (r10 != 0) {
                            r10.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e11) {
                    e = e11;
                    arrayList4 = arrayList6;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e12) {
            e = e12;
            arrayList = null;
        }
        AndroidUtilities.runOnUIThread(new y4(this, arrayList2, i11, i10, 2));
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
        AndroidUtilities.runOnUIThread(new e7(this, tLObject, 1));
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
        AndroidUtilities.runOnUIThread(new x6(this, tL_error, tLObject, sharedPreferences, zArr, 1));
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
        AndroidUtilities.runOnUIThread(new x6(this, tL_error, tLObject, sharedPreferences, zArr, 0));
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
        NativeByteBuffer nativeByteBufferByteBufferValue;
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
                        i11 = i10 == 7 ? 8 : 5;
                    }
                }
            }
        }
        try {
            SQLiteCursor sQLiteCursorQueryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT document FROM web_recent_v3 WHERE type = " + i11 + " ORDER BY date DESC", new Object[0]);
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
            AndroidUtilities.runOnUIThread(new k9(this, z10, arrayList, i10));
        } catch (Throwable th) {
            getMessagesStorage().checkSQLException(th);
        }
    }

    public void lambda$loadRecents$50(int i10, TLObject tLObject, TLRPC.TL_error tL_error) {
        processLoadedRecentDocuments(i10, tLObject instanceof TLRPC.TL_messages_savedGifs ? ((TLRPC.TL_messages_savedGifs) tLObject).gifs : null, true, 0, true);
    }

    public void lambda$loadRecents$51(int i10, TLObject tLObject, TLRPC.TL_error tL_error) {
        ArrayList<TLRPC.Document> arrayList;
        if (i10 == 3 || i10 == 7) {
            if (tLObject instanceof TLRPC.TL_messages_stickers) {
                arrayList = ((TLRPC.TL_messages_stickers) tLObject).stickers;
            } else {
                arrayList = null;
            }
        } else if (i10 == 2) {
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
                } catch (Exception e9) {
                    getMessagesStorage().checkSQLException(e9);
                }
            }
            getMessagesStorage().loadReplyMessages(hVar, hVar2, arrayList2, arrayList3, 0);
        } catch (Exception e10) {
            FileLog.e(e10);
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
        AndroidUtilities.runOnUIThread(new f8(this, tLObject, sharedPreferences, 1));
    }

    public void lambda$loadReplyMessagesForMessages$170(Timer.Task task, long j10, ArrayList arrayList) {
        Timer.done(task);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.replyMessagesDidLoad, Long.valueOf(j10), arrayList, null);
    }

    public void lambda$loadReplyMessagesForMessages$171(Timer.Task task, Timer timer, ArrayList arrayList, long j10, a0.h hVar, Runnable runnable) {
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
                    messageTLdeserialize.f22401id = sQLiteCursorQueryFinalized.intValue(1);
                    messageTLdeserialize.date = sQLiteCursorQueryFinalized.intValue(2);
                    messageTLdeserialize.dialog_id = j10;
                    long jLongValue = sQLiteCursorQueryFinalized.longValue(3);
                    ArrayList arrayList3 = (ArrayList) hVar.f(jLongValue);
                    hVar.l(jLongValue);
                    if (arrayList3 != null) {
                        MessageObject messageObject = new MessageObject(this.currentAccount, messageTLdeserialize, false, false);
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
            sQLiteCursorQueryFinalized.dispose();
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
            Timer.done(taskStart);
            AndroidUtilities.runOnUIThread(new hh.e2(this, Timer.start(timer, "loadReplyMessagesForMessages (encrypted) runOnUIThread: posting notification"), j10, arrayList2, 14));
            if (runnable != null) {
                runnable.run();
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public static void lambda$loadReplyMessagesForMessages$172(AtomicInteger atomicInteger, Runnable runnable) {
        if (atomicInteger.decrementAndGet() != 0 || runnable == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(runnable);
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
        TLObject tLObject2;
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
            if (messages_messages.messages.size() < tL_messages_getScheduledMessages.f22480id.size()) {
                if (j10 != 0) {
                    TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                    tL_channels_getMessages.channel = getMessagesController().getInputChannel(j10);
                    tL_channels_getMessages.f22418id = tL_messages_getScheduledMessages.f22480id;
                    tLObject2 = tL_channels_getMessages;
                } else {
                    TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                    tL_messages_getMessages.f22474id = tL_messages_getScheduledMessages.f22480id;
                    tLObject2 = tL_messages_getMessages;
                }
                getConnectionsManager().sendRequest(tLObject2, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject3, TLRPC.TL_error tL_error2) {
                        this.f20746a.lambda$loadReplyMessagesForMessages$173(tL_error, messages_messages, j11, j10, hVar, z10, tLObject3, tL_error2);
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
        if (atomicInteger.decrementAndGet() != 0 || runnable == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(runnable);
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
        if (atomicInteger.decrementAndGet() != 0 || runnable == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(runnable);
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
        if (atomicInteger.decrementAndGet() != 0 || runnable == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(runnable);
    }

    public void lambda$loadReplyMessagesForMessages$177(org.telegram.messenger.Timer.Task r25, a0.h r26, final java.util.concurrent.atomic.AtomicInteger r27, final java.lang.Runnable r28, int r29, final org.telegram.messenger.Timer r30, final a0.h r31, a0.h r32, final boolean r33, final long r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.lambda$loadReplyMessagesForMessages$177(org.telegram.messenger.Timer$Task, a0.h, java.util.concurrent.atomic.AtomicInteger, java.lang.Runnable, int, org.telegram.messenger.Timer, a0.h, a0.h, boolean, long):void");
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
        AndroidUtilities.runOnUIThread(new f8(this, tLObject, sharedPreferences, 0));
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
        AndroidUtilities.runOnUIThread(new lk((BaseController) this, tL_error, (Object) tLObject, (Object) sharedPreferences, 13));
    }

    public void lambda$loadStickers$100(TLObject tLObject, int i10, Utilities.Callback callback, long j10) {
        if (tLObject instanceof TLRPC.TL_messages_allStickers) {
            processLoadStickersResponse(i10, (TLRPC.TL_messages_allStickers) tLObject, new r7(0, callback));
        } else {
            processLoadedStickers(i10, null, false, (int) (System.currentTimeMillis() / 1000), j10, new r7(1, callback));
        }
    }

    public void lambda$loadStickers$101(int i10, Utilities.Callback callback, long j10, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new gh.a0(this, tLObject, i10, callback, j10, 5));
    }

    public void lambda$loadStickers$91(int i10, boolean z10, Utilities.Callback callback) {
        loadStickers(i10, false, z10, false, callback);
    }

    public static void lambda$loadStickers$92(Utilities.Callback callback, ArrayList arrayList) {
        if (callback != null) {
            callback.run(arrayList);
        }
    }

    public void lambda$loadStickers$93(int i10, Utilities.Callback callback) {
        ArrayList<TLRPC.TL_messages_stickerSet> arrayList = new ArrayList<>();
        int iIntValue = 0;
        long jCalcStickersHash = 0;
        SQLiteCursor sQLiteCursorQueryFinalized = null;
        try {
            sQLiteCursorQueryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT data, date, hash FROM stickers_v2 WHERE id = " + (i10 + 1), new Object[0]);
            if (sQLiteCursorQueryFinalized.next()) {
                NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                if (nativeByteBufferByteBufferValue != null) {
                    int int32 = nativeByteBufferByteBufferValue.readInt32(false);
                    for (int i11 = 0; i11 < int32; i11++) {
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
                processLoadedStickers(i10, arrayList, true, iIntValue, jCalcStickersHash, new f2(callback, arrayList, 2));
            } catch (Throwable th2) {
                if (sQLiteCursorQueryFinalized == null) {
                    throw th2;
                }
                sQLiteCursorQueryFinalized.dispose();
                throw th2;
            }
        }
        sQLiteCursorQueryFinalized.dispose();
        processLoadedStickers(i10, arrayList, true, iIntValue, jCalcStickersHash, new f2(callback, arrayList, 2));
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
        if (!(tLObject instanceof TLRPC.TL_messages_stickerSet)) {
            processLoadedStickers(i10, null, false, (int) (System.currentTimeMillis() / 1000), 0L, new r7(5, callback));
            return;
        }
        ArrayList<TLRPC.TL_messages_stickerSet> arrayList = new ArrayList<>();
        arrayList.add((TLRPC.TL_messages_stickerSet) tLObject);
        processLoadedStickers(i10, arrayList, false, (int) (System.currentTimeMillis() / 1000), calcStickersHash(arrayList), new r7(4, callback));
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
        SQLiteCursor sQLiteCursor = null;
        tL_messages_stickerSetTLdeserialize = null;
        tL_messages_stickerSetTLdeserialize = null;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSetTLdeserialize = null;
        int iIntValue = 0;
        try {
            SQLiteCursor sQLiteCursorQueryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT data, date FROM stickers_dice WHERE emoji = ?", str);
            try {
                if (sQLiteCursorQueryFinalized.next()) {
                    NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                    if (nativeByteBufferByteBufferValue != null) {
                        tL_messages_stickerSetTLdeserialize = TLRPC.messages_StickerSet.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                        nativeByteBufferByteBufferValue.reuse();
                    }
                    iIntValue = sQLiteCursorQueryFinalized.intValue(1);
                }
                sQLiteCursorQueryFinalized.dispose();
                tL_messages_stickerSet2 = tL_messages_stickerSetTLdeserialize;
                i10 = iIntValue;
            } catch (Throwable th) {
                th = th;
                tL_messages_stickerSet = tL_messages_stickerSetTLdeserialize;
                sQLiteCursor = sQLiteCursorQueryFinalized;
                try {
                    FileLog.e(th);
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                    i10 = 0;
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
        AndroidUtilities.runOnUIThread(new cg.j((Object) this, tL_error, tLObject, str, z10, 4));
    }

    public void lambda$markFeaturedStickersByIdAsRead$67(boolean z10, long j10) {
        this.unreadStickerSets[z10 ? 1 : 0].remove(Long.valueOf(j10));
        this.readingStickerSets[z10 ? 1 : 0].remove(Long.valueOf(j10));
        this.loadFeaturedHash[z10 ? 1 : 0] = calcFeaturedStickersHash(z10, this.featuredStickerSets[z10 ? 1 : 0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(z10 ? NotificationCenter.featuredEmojiDidLoad : NotificationCenter.featuredStickersDidLoad, new Object[0]);
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
        AndroidUtilities.runOnUIThread(new a9(this, tL_error, tLObject, 1));
    }

    public void lambda$processLoadStickersResponse$73(TLObject tLObject, ArrayList arrayList, int i10, a0.h hVar, TLRPC.StickerSet stickerSet, TLRPC.TL_messages_allStickers tL_messages_allStickers, int i11) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
        arrayList.set(i10, tL_messages_stickerSet);
        hVar.k(tL_messages_stickerSet, stickerSet.f22407id);
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
        AndroidUtilities.runOnUIThread(new l7(this, tLObject, arrayList, i10, hVar, stickerSet, tL_messages_allStickers, i11));
    }

    public void lambda$processLoadedDiceStickers$86(String str) {
        this.loadingDiceStickerSets.remove(str);
    }

    public void lambda$processLoadedDiceStickers$87(String str, boolean z10) {
        loadStickersByEmojiOrName(str, z10, false);
    }

    public void lambda$processLoadedDiceStickers$88(String str, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.diceStickerSetsByEmoji.put(str, tL_messages_stickerSet);
        this.diceEmojiStickerSetsById.k(str, tL_messages_stickerSet.set.f22407id);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.diceStickersDidLoad, str);
    }

    public void lambda$processLoadedDiceStickers$89(boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10, String str, boolean z11) {
        if (z10) {
            if (tL_messages_stickerSet == null || Math.abs((System.currentTimeMillis() / 1000) - ((long) i10)) >= 86400) {
                AndroidUtilities.runOnUIThread(new i8(this, str, z11, 0), (tL_messages_stickerSet != null || z10) ? 0L : 1000L);
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
        } else {
            if (z10) {
                return;
            }
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
        this.unreadStickerSets[z10 ? 1 : 0] = arrayList;
        this.featuredStickerSetsById[z10 ? 1 : 0] = hVar;
        this.featuredStickerSets[z10 ? 1 : 0] = arrayList2;
        this.loadFeaturedHash[z10 ? 1 : 0] = j10;
        this.loadFeaturedDate[z10 ? 1 : 0] = i10;
        this.loadFeaturedPremium = z11;
        loadStickers(z10 ? 6 : 3, true, false);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(z10 ? NotificationCenter.featuredEmojiDidLoad : NotificationCenter.featuredStickersDidLoad, new Object[0]);
    }

    public void lambda$processLoadedFeaturedStickers$62(boolean z10, int i10) {
        this.loadFeaturedDate[z10 ? 1 : 0] = i10;
    }

    public void lambda$processLoadedFeaturedStickers$63(boolean z10, ArrayList arrayList, final int i10, final long j10, final boolean z11, final ArrayList arrayList2, final boolean z12) {
        long j11 = 0;
        if ((z10 && (arrayList == null || Math.abs((System.currentTimeMillis() / 1000) - ((long) i10)) >= 3600)) || (!z10 && arrayList == null && j10 == 0)) {
            t8 t8Var = new t8(this, arrayList, j10, z11);
            if (arrayList == null && !z10) {
                j11 = 1000;
            }
            AndroidUtilities.runOnUIThread(t8Var, j11);
            if (arrayList == null) {
                return;
            }
        }
        if (arrayList == null) {
            AndroidUtilities.runOnUIThread(new r8(this, z11, i10, 1));
            putFeaturedStickersToCache(z11, null, null, i10, 0L, z12);
            return;
        }
        try {
            final ArrayList<TLRPC.StickerSetCovered> arrayList3 = new ArrayList<>();
            final a0.h hVar = new a0.h();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i11);
                arrayList3.add(stickerSetCovered);
                hVar.k(stickerSetCovered, stickerSetCovered.set.f22407id);
            }
            if (!z10) {
                putFeaturedStickersToCache(z11, arrayList3, arrayList2, i10, j10, z12);
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f22119a.lambda$processLoadedFeaturedStickers$61(z11, arrayList2, hVar, arrayList3, j10, i10, z12);
                }
            });
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public void lambda$processLoadedMedia$133(TLRPC.messages_Messages messages_messages, int i10, long j10, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14) {
        int i15 = messages_messages.count;
        getMessagesController().putUsers(messages_messages.users, i10 != 0);
        getMessagesController().putChats(messages_messages.chats, i10 != 0);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mediaDidLoad, Long.valueOf(j10), Integer.valueOf(i15), arrayList, Integer.valueOf(i11), Integer.valueOf(i12), Boolean.valueOf(z10), Boolean.valueOf(i13 != 0), Integer.valueOf(i14));
    }

    public void lambda$processLoadedMedia$134(TLRPC.messages_Messages messages_messages, int i10, long j10, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14) {
        AndroidUtilities.runOnUIThread(new z6(this, messages_messages, i10, j10, arrayList, i11, i12, z10, i13, i14, 0));
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
            hVar.k(user, user.f22527id);
        }
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        for (int i16 = 0; i16 < messages_messages.messages.size(); i16++) {
            MessageObject messageObject = new MessageObject(this.currentAccount, messages_messages.messages.get(i16), hVar, true, false);
            messageObject.createStrippedThumb();
            arrayList.add(messageObject);
        }
        getFileLoader().checkMediaExistance(arrayList);
        z6 z6Var = new z6(this, messages_messages, i10, j10, arrayList, i11, i12, z10, i13, i14, 1);
        if (getMessagesController().getTranslateController().isFeatureAvailable(j10)) {
            getMessagesStorage().getStorageQueue().postRunnable(new a9(this, arrayList, z6Var, 2));
        } else {
            z6Var.run();
        }
    }

    public void lambda$processLoadedMediaCount$137(long j10, boolean z10, int i10, int i11, int i12, long j11, int i13) {
        int i14;
        boolean z11;
        int i15 = i10;
        boolean zIsEncryptedDialog = DialogObject.isEncryptedDialog(j10);
        if (z10) {
            if (i15 != -1) {
                if (i15 == 0) {
                    i14 = i11;
                    if (i14 == 2) {
                    }
                } else {
                    i14 = i11;
                }
            } else {
                i14 = i11;
            }
            z11 = !zIsEncryptedDialog;
        } else {
            i14 = i11;
        }
        if (z11 || (i12 == 1 && !zIsEncryptedDialog)) {
            getMediaCount(j10, j11, i14, i13, false);
        }
        if (z11) {
            return;
        }
        if (!z10) {
            putMediaCountDatabase(j10, j11, i11, i15);
        }
        NotificationCenter notificationCenter = getNotificationCenter();
        int i16 = NotificationCenter.mediaCountDidLoad;
        Long lValueOf = Long.valueOf(j10);
        Long lValueOf2 = Long.valueOf(j11);
        if (z10 && i15 == -1) {
            i15 = 0;
        }
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i16, lValueOf, lValueOf2, Integer.valueOf(i15), Boolean.valueOf(z10), Integer.valueOf(i11));
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
        try {
            SQLiteDatabase database = getMessagesStorage().getDatabase();
            int i14 = 2;
            if (z10) {
                i12 = getMessagesController().maxRecentGifsCount;
            } else if (i10 == 3 || i10 == 7) {
                i12 = 200;
            } else {
                i12 = i10 == 2 ? getMessagesController().maxFaveStickersCount : getMessagesController().maxRecentStickersCount;
            }
            database.beginTransaction();
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = database.executeFast("REPLACE INTO web_recent_v3 VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
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
            } else {
                i13 = i10 == 7 ? 8 : 5;
            }
            if (z11) {
                database.executeFast("DELETE FROM web_recent_v3 WHERE type = " + i13).stepThis().dispose();
            }
            int i15 = 0;
            while (i15 < size && i15 != i12) {
                TLRPC.Document document = (TLRPC.Document) arrayList.get(i15);
                sQLitePreparedStatementExecuteFast.requery();
                sQLitePreparedStatementExecuteFast.bindString(1, "" + document.f22386id);
                sQLitePreparedStatementExecuteFast.bindInteger(i14, i13);
                sQLitePreparedStatementExecuteFast.bindString(3, "");
                sQLitePreparedStatementExecuteFast.bindString(4, "");
                sQLitePreparedStatementExecuteFast.bindString(5, "");
                sQLitePreparedStatementExecuteFast.bindInteger(6, 0);
                sQLitePreparedStatementExecuteFast.bindInteger(7, 0);
                sQLitePreparedStatementExecuteFast.bindInteger(8, 0);
                sQLitePreparedStatementExecuteFast.bindInteger(9, i11 != 0 ? i11 : size - i15);
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(document.getObjectSize());
                document.serializeToStream(nativeByteBuffer);
                sQLitePreparedStatementExecuteFast.bindByteBuffer(10, nativeByteBuffer);
                sQLitePreparedStatementExecuteFast.step();
                nativeByteBuffer.reuse();
                i15++;
                i14 = 2;
            }
            sQLitePreparedStatementExecuteFast.dispose();
            database.commitTransaction();
            if (z11 || arrayList.size() < i12) {
                return;
            }
            database.beginTransaction();
            while (i12 < arrayList.size()) {
                database.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + ((TLRPC.Document) arrayList.get(i12)).f22386id + "' AND type = " + i13).stepThis().dispose();
                i12++;
            }
            database.commitTransaction();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public void lambda$processLoadedRecentDocuments$53(boolean z10, int i10, ArrayList arrayList) {
        SharedPreferences.Editor editorEdit = MessagesController.getEmojiSettings(this.currentAccount).edit();
        if (z10) {
            this.loadingRecentGifs = false;
            this.recentGifsLoaded = true;
            editorEdit.putLong("lastGifLoadTime", System.currentTimeMillis()).apply();
        } else {
            this.loadingRecentStickers[i10] = false;
            this.recentStickersLoaded[i10] = true;
            if (i10 == 0) {
                editorEdit.putLong("lastStickersLoadTime", System.currentTimeMillis()).apply();
            } else if (i10 == 1) {
                editorEdit.putLong("lastStickersLoadTimeMask", System.currentTimeMillis()).apply();
            } else if (i10 == 3) {
                editorEdit.putLong("lastStickersLoadTimeGreet", System.currentTimeMillis()).apply();
            } else if (i10 == 5) {
                editorEdit.putLong("lastStickersLoadTimeEmojiPacks", System.currentTimeMillis()).apply();
            } else if (i10 == 7) {
                editorEdit.putLong("lastStickersLoadTimePremiumStickers", System.currentTimeMillis()).apply();
            } else {
                editorEdit.putLong("lastStickersLoadTimeFavs", System.currentTimeMillis()).apply();
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

    public void lambda$processLoadedStickers$105(int i10, a0.h hVar, HashMap map, ArrayList arrayList, long j10, int i11, a0.h hVar2, HashMap map2, a0.h hVar3, Runnable runnable) {
        for (int i12 = 0; i12 < this.stickerSets[i10].size(); i12++) {
            TLRPC.StickerSet stickerSet = this.stickerSets[i10].get(i12).set;
            this.stickerSetsById.l(stickerSet.f22407id);
            this.stickerSetsByName.remove(stickerSet.short_name);
            if (i10 != 3 && i10 != 6 && i10 != 4) {
                this.installedStickerSetsById.l(stickerSet.f22407id);
            }
        }
        for (int i13 = 0; i13 < hVar.m(); i13++) {
            this.stickerSetsById.k((TLRPC.TL_messages_stickerSet) hVar.n(i13), hVar.j(i13));
            if (i10 != 3 && i10 != 6 && i10 != 4) {
                this.installedStickerSetsById.k((TLRPC.TL_messages_stickerSet) hVar.n(i13), hVar.j(i13));
            }
        }
        this.stickerSetsByName.putAll(map);
        this.stickerSets[i10] = arrayList;
        this.loadHash[i10] = j10;
        this.loadDate[i10] = i11;
        this.stickersByIds[i10] = hVar2;
        if (i10 == 0) {
            this.allStickers = map2;
            this.stickersByEmoji = hVar3;
        } else if (i10 == 3) {
            this.allStickersFeatured = map2;
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
        if ((z10 && (arrayList == null || BuildVars.DEBUG_PRIVATE_VERSION || Math.abs((System.currentTimeMillis() / 1000) - ((long) i10)) >= 3600)) || (!z10 && arrayList == null && j10 == 0)) {
            mediaDataController = this;
            arrayList2 = arrayList;
            hh.b9 b9Var = new hh.b9(mediaDataController, arrayList2, j10, i11, 2);
            if (arrayList2 == null && !z10) {
                j11 = 1000;
            }
            AndroidUtilities.runOnUIThread(b9Var, j11);
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
            if (z10) {
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            } else {
                AndroidUtilities.runOnUIThread(new r6(mediaDataController, i11, i10, 1));
                mediaDataController.putStickersToCache(i11, null, i10, 0L);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
        }
        try {
            ArrayList<TLRPC.TL_messages_stickerSet> arrayList3 = new ArrayList<>();
            a0.h hVar = new a0.h();
            HashMap map = new HashMap();
            a0.h hVar2 = new a0.h();
            a0.h hVar3 = new a0.h();
            HashMap map2 = new HashMap();
            int i12 = 0;
            while (i12 < arrayList2.size()) {
                try {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList2.get(i12);
                    if (tL_messages_stickerSet != null && mediaDataController.removingStickerSetsUndos.h(tL_messages_stickerSet.set.f22407id) < 0) {
                        arrayList3.add(tL_messages_stickerSet);
                        hVar.k(tL_messages_stickerSet, tL_messages_stickerSet.set.f22407id);
                        map.put(tL_messages_stickerSet.set.short_name, tL_messages_stickerSet);
                        for (int i13 = 0; i13 < tL_messages_stickerSet.documents.size(); i13++) {
                            TLRPC.Document document = tL_messages_stickerSet.documents.get(i13);
                            if (document != null && !(document instanceof TLRPC.TL_documentEmpty)) {
                                hVar3.k(document, document.f22386id);
                            }
                        }
                        if (!tL_messages_stickerSet.set.archived) {
                            int i14 = 0;
                            while (i14 < tL_messages_stickerSet.packs.size()) {
                                TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i14);
                                if (tL_stickerPack != null && (str = tL_stickerPack.emoticon) != null) {
                                    String strReplace = str.replace("️", "");
                                    tL_stickerPack.emoticon = strReplace;
                                    ArrayList arrayList4 = (ArrayList) map2.get(strReplace);
                                    if (arrayList4 == null) {
                                        arrayList4 = new ArrayList();
                                        map2.put(tL_stickerPack.emoticon, arrayList4);
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
            a0.h hVar5 = hVar;
            if (!z10) {
                putStickersToCache(i11, arrayList3, i10, j10);
            }
            AndroidUtilities.runOnUIThread(new a3(this, i11, hVar5, map, arrayList3, j10, i10, hVar3, map2, hVar2, runnable));
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void lambda$putBotInfo$201(TL_bots.BotInfo botInfo, long j10) {
        try {
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO bot_info_v2 VALUES(?, ?, ?)");
            sQLitePreparedStatementExecuteFast.requery();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(botInfo.getObjectSize());
            botInfo.serializeToStream(nativeByteBuffer);
            sQLitePreparedStatementExecuteFast.bindLong(1, botInfo.user_id);
            sQLitePreparedStatementExecuteFast.bindLong(2, j10);
            sQLitePreparedStatementExecuteFast.bindByteBuffer(3, nativeByteBuffer);
            sQLitePreparedStatementExecuteFast.step();
            nativeByteBuffer.reuse();
            sQLitePreparedStatementExecuteFast.dispose();
        } catch (Exception e9) {
            FileLog.e(e9);
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
                this.botKeyboardsByMids.e(message2.f22401id);
            }
            this.botKeyboardsByMids.k(topicKey, message.f22401id);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botKeyboardDidLoad, message, topicKey);
    }

    public void lambda$putDiceStickersToCache$90(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, int i10) {
        try {
            if (tL_messages_stickerSet == null) {
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast = getMessagesStorage().getDatabase().executeFast("UPDATE stickers_dice SET date = ?");
                sQLitePreparedStatementExecuteFast.requery();
                sQLitePreparedStatementExecuteFast.bindInteger(1, i10);
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
            sQLitePreparedStatementExecuteFast2.bindInteger(3, i10);
            sQLitePreparedStatementExecuteFast2.step();
            nativeByteBuffer.reuse();
            sQLitePreparedStatementExecuteFast2.dispose();
        } catch (Exception e9) {
            FileLog.e(e9);
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
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.EmojiKeyword emojiKeyword = tL_emojiKeywordsDifference.keywords.get(i10);
                    if (emojiKeyword instanceof TLRPC.TL_emojiKeyword) {
                        TLRPC.TL_emojiKeyword tL_emojiKeyword = (TLRPC.TL_emojiKeyword) emojiKeyword;
                        String lowerCase = tL_emojiKeyword.keyword.toLowerCase();
                        int size2 = tL_emojiKeyword.emoticons.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            sQLitePreparedStatementExecuteFast.requery();
                            sQLitePreparedStatementExecuteFast.bindString(1, tL_emojiKeywordsDifference.lang_code);
                            sQLitePreparedStatementExecuteFast.bindString(2, lowerCase);
                            sQLitePreparedStatementExecuteFast.bindString(3, tL_emojiKeyword.emoticons.get(i11));
                            sQLitePreparedStatementExecuteFast.step();
                        }
                    } else if (emojiKeyword instanceof TLRPC.TL_emojiKeywordDeleted) {
                        TLRPC.TL_emojiKeywordDeleted tL_emojiKeywordDeleted = (TLRPC.TL_emojiKeywordDeleted) emojiKeyword;
                        String lowerCase2 = tL_emojiKeywordDeleted.keyword.toLowerCase();
                        int size3 = tL_emojiKeywordDeleted.emoticons.size();
                        for (int i12 = 0; i12 < size3; i12++) {
                            sQLitePreparedStatementExecuteFast2.requery();
                            sQLitePreparedStatementExecuteFast2.bindString(1, tL_emojiKeywordsDifference.lang_code);
                            sQLitePreparedStatementExecuteFast2.bindString(2, lowerCase2);
                            sQLitePreparedStatementExecuteFast2.bindString(3, tL_emojiKeywordDeleted.emoticons.get(i12));
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
            AndroidUtilities.runOnUIThread(new b8(this, str, 1));
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public void lambda$putFeaturedStickersToCache$64(ArrayList arrayList, ArrayList arrayList2, boolean z10, int i10, long j10, boolean z11) {
        try {
            if (arrayList == null) {
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast = getMessagesStorage().getDatabase().executeFast("UPDATE stickers_featured SET date = ? WHERE id = ? AND emoji = ?");
                sQLitePreparedStatementExecuteFast.requery();
                sQLitePreparedStatementExecuteFast.bindInteger(1, i10);
                sQLitePreparedStatementExecuteFast.bindInteger(2, z10 ? 2 : 1);
                sQLitePreparedStatementExecuteFast.bindInteger(3, z10 ? 1 : 0);
                sQLitePreparedStatementExecuteFast.step();
                sQLitePreparedStatementExecuteFast.dispose();
                return;
            }
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast2 = getMessagesStorage().getDatabase().executeFast("REPLACE INTO stickers_featured VALUES(?, ?, ?, ?, ?, ?, ?)");
            sQLitePreparedStatementExecuteFast2.requery();
            int objectSize = 4;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                objectSize += ((TLRPC.StickerSetCovered) arrayList.get(i11)).getObjectSize();
            }
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(objectSize);
            NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer((arrayList2.size() * 8) + 4);
            nativeByteBuffer.writeInt32(arrayList.size());
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((TLRPC.StickerSetCovered) arrayList.get(i12)).serializeToStream(nativeByteBuffer);
            }
            nativeByteBuffer2.writeInt32(arrayList2.size());
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                nativeByteBuffer2.writeInt64(((Long) arrayList2.get(i13)).longValue());
            }
            sQLitePreparedStatementExecuteFast2.bindInteger(1, z10 ? 2 : 1);
            sQLitePreparedStatementExecuteFast2.bindByteBuffer(2, nativeByteBuffer);
            sQLitePreparedStatementExecuteFast2.bindByteBuffer(3, nativeByteBuffer2);
            sQLitePreparedStatementExecuteFast2.bindInteger(4, i10);
            sQLitePreparedStatementExecuteFast2.bindLong(5, j10);
            sQLitePreparedStatementExecuteFast2.bindInteger(6, z11 ? 1 : 0);
            sQLitePreparedStatementExecuteFast2.bindInteger(7, z10 ? 1 : 0);
            sQLitePreparedStatementExecuteFast2.step();
            nativeByteBuffer.reuse();
            nativeByteBuffer2.reuse();
            sQLitePreparedStatementExecuteFast2.dispose();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public void lambda$putMediaCountDatabase$138(long j10, long j11, int i10, int i11) {
        int i12;
        try {
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = j10 != 0 ? getMessagesStorage().getDatabase().executeFast("REPLACE INTO media_counts_topics VALUES(?, ?, ?, ?, ?)") : getMessagesStorage().getDatabase().executeFast("REPLACE INTO media_counts_v2 VALUES(?, ?, ?, ?)");
            sQLitePreparedStatementExecuteFast.requery();
            sQLitePreparedStatementExecuteFast.bindLong(1, j11);
            if (j10 != 0) {
                sQLitePreparedStatementExecuteFast.bindLong(2, j10);
                i12 = 3;
            } else {
                i12 = 2;
            }
            sQLitePreparedStatementExecuteFast.bindInteger(i12, i10);
            sQLitePreparedStatementExecuteFast.bindInteger(i12 + 1, i11);
            sQLitePreparedStatementExecuteFast.bindInteger(i12 + 2, 0);
            sQLitePreparedStatementExecuteFast.step();
            sQLitePreparedStatementExecuteFast.dispose();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public void lambda$putMediaDatabase$140(int i10, ArrayList arrayList, boolean z10, long j10, int i11, int i12, long j11) {
        long j12;
        if (i10 == 0) {
            try {
                if (arrayList.isEmpty() || z10) {
                    j12 = j11;
                    getMessagesStorage().doneHolesInMedia(j10, i11, i12, j12);
                    if (arrayList.isEmpty()) {
                        return;
                    }
                } else {
                    j12 = j11;
                }
            } catch (Exception e9) {
                FileLog.e(e9);
                return;
            }
        } else {
            j12 = j11;
        }
        getMessagesStorage().getDatabase().beginTransaction();
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast = j12 != 0 ? getMessagesStorage().getDatabase().executeFast("REPLACE INTO media_topics VALUES(?, ?, ?, ?, ?, ?)") : getMessagesStorage().getDatabase().executeFast("REPLACE INTO media_v4 VALUES(?, ?, ?, ?, ?)");
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            TLRPC.Message message = (TLRPC.Message) obj;
            if (canAddMessageToMedia(message)) {
                sQLitePreparedStatementExecuteFast.requery();
                MessageObject.normalizeFlags(message);
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                message.serializeToStream(nativeByteBuffer);
                sQLitePreparedStatementExecuteFast.bindInteger(1, message.f22401id);
                sQLitePreparedStatementExecuteFast.bindLong(2, j10);
                int i14 = 3;
                if (j12 != 0) {
                    sQLitePreparedStatementExecuteFast.bindLong(3, j12);
                    i14 = 4;
                }
                sQLitePreparedStatementExecuteFast.bindInteger(i14, message.date);
                sQLitePreparedStatementExecuteFast.bindInteger(i14 + 1, i12);
                sQLitePreparedStatementExecuteFast.bindByteBuffer(i14 + 2, nativeByteBuffer);
                sQLitePreparedStatementExecuteFast.step();
                nativeByteBuffer.reuse();
            }
        }
        sQLitePreparedStatementExecuteFast.dispose();
        if (!z10 || i11 != 0 || i10 != 0) {
            int i15 = (z10 && i10 == 0) ? 1 : ((TLRPC.Message) arrayList.get(arrayList.size() - 1)).f22401id;
            if (i10 != 0) {
                getMessagesStorage().closeHolesInMedia(j10, i15, ((TLRPC.Message) arrayList.get(0)).f22401id, i12, j12);
            } else if (i11 != 0) {
                getMessagesStorage().closeHolesInMedia(j10, i15, i11, i12, j11);
            } else {
                getMessagesStorage().closeHolesInMedia(j10, i15, Integer.MAX_VALUE, i12, j11);
            }
        }
        getMessagesStorage().getDatabase().commitTransaction();
    }

    public void lambda$putMenuBotsToCache$6(TLRPC.TL_attachMenuBots tL_attachMenuBots, long j10, int i10) {
        try {
            if (tL_attachMenuBots == null) {
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast = getMessagesStorage().getDatabase().executeFast("UPDATE attach_menu_bots SET date = ?");
                sQLitePreparedStatementExecuteFast.requery();
                sQLitePreparedStatementExecuteFast.bindLong(1, i10);
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
            sQLitePreparedStatementExecuteFast2.bindLong(2, j10);
            sQLitePreparedStatementExecuteFast2.bindInteger(3, i10);
            sQLitePreparedStatementExecuteFast2.step();
            nativeByteBuffer.reuse();
            sQLitePreparedStatementExecuteFast2.dispose();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public void lambda$putPremiumPromoToCache$10(TLRPC.TL_help_premiumPromo tL_help_premiumPromo, int i10) {
        try {
            if (tL_help_premiumPromo == null) {
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast = getMessagesStorage().getDatabase().executeFast("UPDATE premium_promo SET date = ?");
                sQLitePreparedStatementExecuteFast.requery();
                sQLitePreparedStatementExecuteFast.bindInteger(1, i10);
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
            sQLitePreparedStatementExecuteFast2.bindInteger(2, i10);
            sQLitePreparedStatementExecuteFast2.step();
            nativeByteBuffer.reuse();
            sQLitePreparedStatementExecuteFast2.dispose();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public void lambda$putReactionsToCache$16(ArrayList arrayList, int i10, int i11) {
        try {
            if (arrayList == null) {
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast = getMessagesStorage().getDatabase().executeFast("UPDATE reactions SET date = ?");
                sQLitePreparedStatementExecuteFast.requery();
                sQLitePreparedStatementExecuteFast.bindLong(1, i11);
                sQLitePreparedStatementExecuteFast.step();
                sQLitePreparedStatementExecuteFast.dispose();
                return;
            }
            getMessagesStorage().getDatabase().executeFast("DELETE FROM reactions").stepThis().dispose();
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast2 = getMessagesStorage().getDatabase().executeFast("REPLACE INTO reactions VALUES(?, ?, ?)");
            sQLitePreparedStatementExecuteFast2.requery();
            int objectSize = 4;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                objectSize += ((TLRPC.TL_availableReaction) arrayList.get(i12)).getObjectSize();
            }
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(objectSize);
            nativeByteBuffer.writeInt32(arrayList.size());
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((TLRPC.TL_availableReaction) arrayList.get(i13)).serializeToStream(nativeByteBuffer);
            }
            sQLitePreparedStatementExecuteFast2.bindByteBuffer(1, nativeByteBuffer);
            sQLitePreparedStatementExecuteFast2.bindInteger(2, i10);
            sQLitePreparedStatementExecuteFast2.bindInteger(3, i11);
            sQLitePreparedStatementExecuteFast2.step();
            nativeByteBuffer.reuse();
            sQLitePreparedStatementExecuteFast2.dispose();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public void lambda$putSetToCache$47(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        try {
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO web_recent_v3 VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            sQLitePreparedStatementExecuteFast.requery();
            sQLitePreparedStatementExecuteFast.bindString(1, "s_" + tL_messages_stickerSet.set.f22407id);
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
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public void lambda$putStickersToCache$102(ArrayList arrayList, int i10, int i11, long j10) {
        try {
            if (arrayList == null) {
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast = getMessagesStorage().getDatabase().executeFast("UPDATE stickers_v2 SET date = ?");
                sQLitePreparedStatementExecuteFast.requery();
                sQLitePreparedStatementExecuteFast.bindLong(1, i11);
                sQLitePreparedStatementExecuteFast.step();
                sQLitePreparedStatementExecuteFast.dispose();
                return;
            }
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast2 = getMessagesStorage().getDatabase().executeFast("REPLACE INTO stickers_v2 VALUES(?, ?, ?, ?)");
            sQLitePreparedStatementExecuteFast2.requery();
            int objectSize = 4;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                objectSize += ((TLRPC.TL_messages_stickerSet) arrayList.get(i12)).getObjectSize();
            }
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(objectSize);
            nativeByteBuffer.writeInt32(arrayList.size());
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((TLRPC.TL_messages_stickerSet) arrayList.get(i13)).serializeToStream(nativeByteBuffer);
            }
            sQLitePreparedStatementExecuteFast2.bindInteger(1, i10 + 1);
            sQLitePreparedStatementExecuteFast2.bindByteBuffer(2, nativeByteBuffer);
            sQLitePreparedStatementExecuteFast2.bindInteger(3, i11);
            sQLitePreparedStatementExecuteFast2.bindLong(4, j10);
            sQLitePreparedStatementExecuteFast2.step();
            nativeByteBuffer.reuse();
            sQLitePreparedStatementExecuteFast2.dispose();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public void lambda$removeMultipleStickerSets$110(boolean[] zArr, ArrayList arrayList, int i10, int[] iArr) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            markSetUninstalling(((TLRPC.TL_messages_stickerSet) arrayList.get(i11)).set.f22407id, false);
            ((TLRPC.TL_messages_stickerSet) arrayList.get(i11)).set.archived = false;
            this.stickerSets[i10].add(iArr[i11], (TLRPC.TL_messages_stickerSet) arrayList.get(i11));
            this.stickerSetsById.k((TLRPC.TL_messages_stickerSet) arrayList.get(i11), ((TLRPC.TL_messages_stickerSet) arrayList.get(i11)).set.f22407id);
            this.installedStickerSetsById.k((TLRPC.TL_messages_stickerSet) arrayList.get(i11), ((TLRPC.TL_messages_stickerSet) arrayList.get(i11)).set.f22407id);
            this.stickerSetsByName.put(((TLRPC.TL_messages_stickerSet) arrayList.get(i11)).set.short_name, (TLRPC.TL_messages_stickerSet) arrayList.get(i11));
            this.removingStickerSetsUndos.l(((TLRPC.TL_messages_stickerSet) arrayList.get(i11)).set.f22407id);
        }
        ArrayList<TLRPC.TL_messages_stickerSet> arrayList2 = this.stickerSets[i10];
        int i12 = this.loadDate[i10];
        long[] jArr = this.loadHash;
        long jCalcStickersHash = calcStickersHash(arrayList2);
        jArr[i10] = jCalcStickersHash;
        putStickersToCache(i10, arrayList2, i12, jCalcStickersHash);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i10), Boolean.TRUE);
    }

    public void lambda$removeMultipleStickerSets$111(boolean[] zArr, ArrayList arrayList, Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            toggleStickerSetInternal(context, 0, n2Var, null, true, (TLObject) arrayList.get(i11), ((TLRPC.TL_messages_stickerSet) arrayList.get(i11)).set, null, i10, false);
        }
    }

    public void lambda$removeRecentGif$24(TLRPC.TL_messages_saveGif tL_messages_saveGif, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null || !FileRefController.isFileRefError(tL_error.text)) {
            return;
        }
        getFileRefController().requestReference("gif", tL_messages_saveGif);
    }

    public void lambda$removeRecentGif$25(TLRPC.Document document) {
        try {
            getMessagesStorage().getDatabase().executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document.f22386id + "' AND type = 2").stepThis().dispose();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public static int lambda$reorderStickers$54(ArrayList arrayList, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, TLRPC.TL_messages_stickerSet tL_messages_stickerSet2) {
        int iIndexOf = arrayList.indexOf(Long.valueOf(tL_messages_stickerSet.set.f22407id));
        int iIndexOf2 = arrayList.indexOf(Long.valueOf(tL_messages_stickerSet2.set.f22407id));
        if (iIndexOf > iIndexOf2) {
            return 1;
        }
        return iIndexOf < iIndexOf2 ? -1 : 0;
    }

    public void lambda$replaceStickerSet$28(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        a0.h stickerByIds = getStickerByIds(4);
        for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
            TLRPC.Document document = tL_messages_stickerSet.documents.get(i10);
            stickerByIds.k(document, document.f22386id);
        }
    }

    public void lambda$saveDraft$189(long j10, long j11, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            if (messages_messages.messages.isEmpty()) {
                return;
            }
            saveDraftReplyMessage(j10, j11, messages_messages.messages.get(0));
        }
    }

    public void lambda$saveDraft$190(long j10, long j11, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            if (messages_messages.messages.isEmpty()) {
                return;
            }
            saveDraftReplyMessage(j10, j11, messages_messages.messages.get(0));
        }
    }

    public void lambda$saveDraft$191(int i10, long j10, long j11, final long j12, final long j13) {
        TLRPC.Message messageTLdeserialize;
        NativeByteBuffer nativeByteBufferByteBufferValue;
        try {
            SQLiteDatabase database = getMessagesStorage().getDatabase();
            Locale locale = Locale.US;
            SQLiteCursor sQLiteCursorQueryFinalized = database.queryFinalized("SELECT data, replydata FROM messages_v2 WHERE mid = " + i10 + " and uid = " + j10, new Object[0]);
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
                    a0.h hVar = new a0.h();
                    a0.h hVar2 = new a0.h();
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
                                MessagesStorage.addReplyMessages(messageTLdeserialize, hVar, hVar2);
                            }
                        }
                    } catch (Exception e9) {
                        getMessagesStorage().checkSQLException(e9);
                    }
                    getMessagesStorage().loadReplyMessages(hVar, hVar2, arrayList, arrayList2, 0);
                }
                message = messageTLdeserialize;
            }
            sQLiteCursorQueryFinalized.dispose();
            if (message != null) {
                saveDraftReplyMessage(j12, j13, message);
                return;
            }
            if (j11 == 0) {
                TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                tL_messages_getMessages.f22474id.add(Integer.valueOf(i10));
                final int i11 = 1;
                getConnectionsManager().sendRequest(tL_messages_getMessages, new RequestDelegate(this) {

                    public final MediaDataController f21334b;

                    {
                        this.f21334b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (i11) {
                            case 0:
                                this.f21334b.lambda$saveDraft$189(j12, j13, tLObject, tL_error);
                                break;
                            default:
                                this.f21334b.lambda$saveDraft$190(j12, j13, tLObject, tL_error);
                                break;
                        }
                    }
                });
                return;
            }
            TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
            tL_channels_getMessages.channel = getMessagesController().getInputChannel(j11);
            tL_channels_getMessages.f22418id.add(Integer.valueOf(i10));
            final int i12 = 0;
            getConnectionsManager().sendRequest(tL_channels_getMessages, new RequestDelegate(this) {

                public final MediaDataController f21334b;

                {
                    this.f21334b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i12) {
                        case 0:
                            this.f21334b.lambda$saveDraft$189(j12, j13, tLObject, tL_error);
                            break;
                        default:
                            this.f21334b.lambda$saveDraft$190(j12, j13, tLObject, tL_error);
                            break;
                    }
                }
            });
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public void lambda$saveDraftReplyMessage$192(long j10, long j11, TLRPC.Message message) {
        TLRPC.InputReplyTo inputReplyTo;
        String string;
        a0.h hVar = (a0.h) this.drafts.f(j10);
        TLRPC.DraftMessage draftMessage = hVar != null ? (TLRPC.DraftMessage) hVar.f(j11) : null;
        if (draftMessage == null || (inputReplyTo = draftMessage.reply_to) == null || inputReplyTo.reply_to_msg_id != message.f22401id) {
            return;
        }
        a0.h hVar2 = (a0.h) this.draftMessages.f(j10);
        if (hVar2 == null) {
            hVar2 = new a0.h();
            this.draftMessages.k(hVar2, j10);
        }
        hVar2.k(message, j11);
        SerializedData serializedData = new SerializedData(message.getObjectSize());
        message.serializeToStream(serializedData);
        SharedPreferences.Editor editorEdit = this.draftPreferences.edit();
        if (j11 == 0) {
            string = a9.p.l(j10, "r_");
        } else {
            StringBuilder sbQ = a9.p.q(j10, "rt_", "_");
            sbQ.append(j11);
            string = sbQ.toString();
        }
        editorEdit.putString(string, Utilities.bytesToHex(serializedData.toByteArray())).commit();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newDraftReceived, Long.valueOf(j10));
        serializedData.cleanup();
    }

    public void lambda$savePeer$158(long j10, int i10, double d) {
        try {
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
            sQLitePreparedStatementExecuteFast.requery();
            sQLitePreparedStatementExecuteFast.bindLong(1, j10);
            sQLitePreparedStatementExecuteFast.bindInteger(2, i10);
            sQLitePreparedStatementExecuteFast.bindDouble(3, d);
            sQLitePreparedStatementExecuteFast.bindInteger(4, ((int) System.currentTimeMillis()) / 1000);
            sQLitePreparedStatementExecuteFast.step();
            sQLitePreparedStatementExecuteFast.dispose();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public void lambda$savePinnedMessages$166(ArrayList arrayList, long j10) {
        try {
            getMessagesStorage().getDatabase().beginTransaction();
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO chat_pinned_v2 VALUES(?, ?, ?)");
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.Message message = (TLRPC.Message) arrayList.get(i10);
                MessageObject.normalizeFlags(message);
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                message.serializeToStream(nativeByteBuffer);
                sQLitePreparedStatementExecuteFast.requery();
                sQLitePreparedStatementExecuteFast.bindLong(1, j10);
                sQLitePreparedStatementExecuteFast.bindInteger(2, message.f22401id);
                sQLitePreparedStatementExecuteFast.bindByteBuffer(3, nativeByteBuffer);
                sQLitePreparedStatementExecuteFast.step();
                nativeByteBuffer.reuse();
            }
            sQLitePreparedStatementExecuteFast.dispose();
            getMessagesStorage().getDatabase().commitTransaction();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public void lambda$saveReplyMessages$178(boolean z10, ArrayList arrayList, a0.h hVar) {
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast;
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast2;
        ArrayList arrayList2;
        try {
            getMessagesStorage().getDatabase().beginTransaction();
            if (z10) {
                sQLitePreparedStatementExecuteFast = getMessagesStorage().getDatabase().executeFast("UPDATE scheduled_messages_v2 SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                sQLitePreparedStatementExecuteFast2 = null;
            } else {
                sQLitePreparedStatementExecuteFast = getMessagesStorage().getDatabase().executeFast("UPDATE messages_v2 SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                sQLitePreparedStatementExecuteFast2 = getMessagesStorage().getDatabase().executeFast("UPDATE messages_topics SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.Message message = (TLRPC.Message) arrayList.get(i10);
                SparseArray sparseArray = (SparseArray) hVar.f(MessageObject.getDialogId(message));
                if (sparseArray != null && (arrayList2 = (ArrayList) sparseArray.get(message.f22401id)) != null) {
                    MessageObject.normalizeFlags(message);
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                    message.serializeToStream(nativeByteBuffer);
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        MessageObject messageObject = (MessageObject) arrayList2.get(i11);
                        int i12 = 0;
                        while (i12 < 2) {
                            SQLitePreparedStatement sQLitePreparedStatement = i12 == 0 ? sQLitePreparedStatementExecuteFast : sQLitePreparedStatementExecuteFast2;
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.requery();
                                sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer);
                                sQLitePreparedStatement.bindInteger(2, message.f22401id);
                                sQLitePreparedStatement.bindInteger(3, messageObject.getId());
                                sQLitePreparedStatement.bindLong(4, messageObject.getDialogId());
                                sQLitePreparedStatement.step();
                            }
                            i12++;
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
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public void lambda$saveStickerSetIntoCache$40(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        try {
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO stickersets2 VALUES(?, ?, ?, ?, ?)");
            sQLitePreparedStatementExecuteFast.requery();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_messages_stickerSet.getObjectSize());
            tL_messages_stickerSet.serializeToStream(nativeByteBuffer);
            sQLitePreparedStatementExecuteFast.bindLong(1, tL_messages_stickerSet.set.f22407id);
            sQLitePreparedStatementExecuteFast.bindByteBuffer(2, nativeByteBuffer);
            sQLitePreparedStatementExecuteFast.bindInteger(3, tL_messages_stickerSet.set.hash);
            sQLitePreparedStatementExecuteFast.bindLong(4, System.currentTimeMillis());
            String str = tL_messages_stickerSet.set.short_name;
            sQLitePreparedStatementExecuteFast.bindString(5, str == null ? "" : str.toLowerCase());
            sQLitePreparedStatementExecuteFast.step();
            nativeByteBuffer.reuse();
            sQLitePreparedStatementExecuteFast.dispose();
        } catch (Exception e9) {
            FileLog.e(e9);
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
        AndroidUtilities.runOnUIThread(new a9(this, tLObject, document, 3));
    }

    public void lambda$searchMessagesInChat$120(long j10, TLObject tLObject, TLRPC.TL_messages_search tL_messages_search, long j11, int i10, int i11, long j12, TLRPC.User user, TLRPC.Chat chat, boolean z10, ig.q0 q0Var) {
        if (this.lastMergeDialogId == j10) {
            this.mergeReqId = 0;
            if (tLObject == null) {
                this.messagesSearchEndReached[1] = true;
                this.messagesSearchCount[1] = 0;
                searchMessagesInChat(tL_messages_search.f22489q, j11, j10, i10, i11, j12, true, user, chat, z10, q0Var);
            } else {
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                this.messagesSearchEndReached[1] = messages_messages.messages.isEmpty();
                this.messagesSearchCount[1] = messages_messages instanceof TLRPC.TL_messages_messagesSlice ? messages_messages.count : messages_messages.messages.size();
                searchMessagesInChat(tL_messages_search.f22489q, j11, j10, i10, i11, j12, true, user, chat, z10, q0Var);
            }
        }
    }

    public void lambda$searchMessagesInChat$121(final long j10, final TLRPC.TL_messages_search tL_messages_search, final long j11, final int i10, final int i11, final long j12, final TLRPC.User user, final TLRPC.Chat chat, final boolean z10, final ig.q0 q0Var, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f20116a.lambda$searchMessagesInChat$120(j10, tLObject, tL_messages_search, j11, i10, i11, j12, user, chat, z10, q0Var);
            }
        });
    }

    public void lambda$searchMessagesInChat$122(int i10, int i11, int i12, long j10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        if (i10 == this.lastReqId) {
            this.loadedPredirectedSearchLocal = arrayList.size() == i11;
            this.loadingSearchLocal = false;
            getMessagesController().putUsers(arrayList2, true);
            getMessagesController().putChats(arrayList3, true);
            org.telegram.ui.Components.k5.h(this.currentAccount).d(arrayList4);
            this.searchLocalResultMessages = arrayList;
            updateSearchResults();
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatSearchResultsAvailable, Integer.valueOf(i12), 0, Integer.valueOf(getMask()), Long.valueOf(j10), Integer.valueOf(this.lastReturnedNum), Integer.valueOf(getSearchCount()), Boolean.TRUE);
        }
    }

    public void lambda$searchMessagesInChat$123(TLRPC.TL_messages_search tL_messages_search, long j10, long j11, int i10, TLRPC.messages_Messages messages_messages, ArrayList arrayList, boolean z10, boolean z11, long j12, long j13, TLRPC.User user, TLRPC.Chat chat) {
        char c10;
        boolean[] zArr;
        if (tL_messages_search.offset_id == 0 && j10 == j11) {
            this.lastReturnedNum = 0;
            this.searchServerResultMessages.clear();
            this.searchServerResultMessagesMap[0].clear();
            this.searchServerResultMessagesMap[1].clear();
            this.messagesSearchCount[0] = 0;
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatSearchResultsLoading, Integer.valueOf(i10));
        }
        int iMin = Math.min(messages_messages.messages.size(), tL_messages_search.limit - 1);
        int i11 = 0;
        boolean z12 = false;
        while (i11 < iMin) {
            MessageObject messageObject = (MessageObject) arrayList.get(i11);
            this.searchServerResultMessages.add(messageObject);
            this.searchServerResultMessagesMap[j10 == j11 ? (char) 0 : (char) 1].put(messageObject.getId(), messageObject);
            i11++;
            z12 = true;
        }
        updateSearchResults();
        this.messagesSearchEndReached[j10 == j11 ? (char) 0 : (char) 1] = messages_messages.messages.size() < tL_messages_search.limit;
        this.messagesSearchCount[j10 == j11 ? (char) 0 : (char) 1] = ((messages_messages instanceof TLRPC.TL_messages_messagesSlice) || (messages_messages instanceof TLRPC.TL_messages_channelMessages)) ? messages_messages.count : messages_messages.messages.size();
        if (this.searchServerResultMessages.isEmpty()) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatSearchResultsAvailable, Integer.valueOf(i10), 0, Integer.valueOf(getMask()), 0L, 0, 0, Boolean.valueOf(z10));
        } else {
            if (!z12) {
                if (z11) {
                    c10 = 0;
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatSearchResultsAvailable, Integer.valueOf(i10), 0, Integer.valueOf(getMask()), Long.valueOf(j11), Integer.valueOf(this.lastReturnedNum), Integer.valueOf(getSearchCount()), Boolean.FALSE);
                }
                if (j10 == j11) {
                    zArr = this.messagesSearchEndReached;
                    if (zArr[c10] || j12 == 0 || zArr[1]) {
                        return;
                    }
                    searchMessagesInChat(this.lastSearchQuery, j11, j12, i10, 0, j13, true, user, chat, z10, this.lastReaction);
                    return;
                }
            }
            if (this.lastReturnedNum >= this.searchResultMessages.size()) {
                this.lastReturnedNum = this.searchResultMessages.size() - 1;
            }
            MessageObject messageObject2 = this.searchResultMessages.get(this.lastReturnedNum);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatSearchResultsAvailable, Integer.valueOf(i10), Integer.valueOf(messageObject2.getId()), Integer.valueOf(getMask()), Long.valueOf(messageObject2.getDialogId()), Integer.valueOf(this.lastReturnedNum), Integer.valueOf(getSearchCount()), Boolean.valueOf(z10));
        }
        c10 = 0;
        if (j10 == j11) {
            zArr = this.messagesSearchEndReached;
            if (zArr[c10]) {
            }
        }
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
                        this.f20125a.lambda$searchMessagesInChat$123(tL_messages_search, j10, j11, i11, messages_messages, arrayList, z10, z11, j12, j13, user, chat);
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
            int iMin = Math.min(messages_messages.messages.size(), tL_messages_search2.limit - 1);
            for (int i12 = 0; i12 < iMin; i12++) {
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
                this.f20353a.lambda$searchMessagesInChat$124(i10, z12, tLObject, tL_messages_search2, j10, j11, i11, arrayList, z10, j12, j13, user, chat);
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
            StringBuilder sb2 = new StringBuilder();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
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
            tL_messages_searchStickers.f22493q = searchStickersKey.f19618q;
            tL_messages_searchStickers.limit = 100;
            tL_messages_searchStickers.offset = searchStickersResult != null ? searchStickersResult.next_offset.intValue() : 0;
            this.loadingSearchStickersKeys.put(searchStickersKey, Integer.valueOf(getConnectionsManager().sendRequestTyped(tL_messages_searchStickers, new a(), new a4(this, searchStickersKey, searchStickersResult, callback, 1))));
        }
    }

    public static void lambda$setPlaceholderImage$31(String str, org.telegram.ui.Components.n9 n9Var, String str2, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.Document document;
        if (tL_messages_stickerSet == null) {
            return;
        }
        ArrayList<Emoji.EmojiSpanRange> emojis = Emoji.parseEmojis(str);
        for (int i10 = 0; i10 < emojis.size(); i10++) {
            emojis.get(i10).code = Emoji.fixEmoji(emojis.get(i10).code.toString());
        }
        int i11 = 0;
        loop1: while (true) {
            if (i11 >= tL_messages_stickerSet.documents.size()) {
                document = null;
                break;
            }
            document = tL_messages_stickerSet.documents.get(i11);
            int size = emojis.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    break loop1;
                }
                Emoji.EmojiSpanRange emojiSpanRange = emojis.get(i12);
                i12++;
                Emoji.EmojiSpanRange emojiSpanRange2 = emojiSpanRange;
                int i13 = 0;
                while (true) {
                    if (i13 < tL_messages_stickerSet.packs.size()) {
                        if (!tL_messages_stickerSet.packs.get(i13).documents.contains(Long.valueOf(document.f22386id)) || !TextUtils.equals(Emoji.fixEmoji(tL_messages_stickerSet.packs.get(i13).emoticon), emojiSpanRange2.code)) {
                            i13++;
                        }
                    }
                }
            }
            i11++;
        }
        if (document != null) {
            n9Var.n(ImageLocation.getForDocument(document), str2, DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.g6.f23215m6, 0.2f, 1.0f, null), document);
            n9Var.invalidate();
        }
    }

    public static int lambda$static$160(TLRPC.MessageEntity messageEntity, TLRPC.MessageEntity messageEntity2) {
        int i10 = messageEntity.offset;
        int i11 = messageEntity2.offset;
        if (i10 > i11) {
            return 1;
        }
        return i10 < i11 ? -1 : 0;
    }

    public void lambda$toggleStickerSet$108(boolean[] zArr, TLRPC.StickerSet stickerSet, int i10, int i11, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Runnable runnable) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        markSetUninstalling(stickerSet.f22407id, false);
        stickerSet.archived = false;
        this.stickerSets[i10].add(i11, tL_messages_stickerSet);
        this.stickerSetsById.k(tL_messages_stickerSet, stickerSet.f22407id);
        this.installedStickerSetsById.k(tL_messages_stickerSet, stickerSet.f22407id);
        String str = stickerSet.short_name;
        if (str != null) {
            this.stickerSetsByName.put(str.toLowerCase(), tL_messages_stickerSet);
        }
        this.removingStickerSetsUndos.l(stickerSet.f22407id);
        this.loadHash[i10] = calcStickersHash(this.stickerSets[i10]);
        putStickersToCache(i10, this.stickerSets[i10], this.loadDate[i10], this.loadHash[i10]);
        if (runnable != null) {
            runnable.run();
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i10), Boolean.TRUE);
    }

    public void lambda$toggleStickerSet$109(boolean[] zArr, Context context, int i10, org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, boolean z10, TLObject tLObject, TLRPC.StickerSet stickerSet, TLRPC.Document document, int i11) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        toggleStickerSetInternal(context, i10, n2Var, frameLayout, z10, tLObject, stickerSet, document, i11, false);
    }

    public void lambda$toggleStickerSetInternal$112(TLRPC.StickerSet stickerSet, ArrayList arrayList) {
        markSetInstalling(stickerSet.f22407id, false);
    }

    public void lambda$toggleStickerSetInternal$113(TLRPC.StickerSet stickerSet, TLObject tLObject, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, int i10, TLRPC.TL_error tL_error, boolean z11, FrameLayout frameLayout, Context context, TLObject tLObject2, TLRPC.Document document) {
        this.removingStickerSetsUndos.l(stickerSet.f22407id);
        if (tLObject instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
            processStickerSetInstallResultArchive(n2Var, z10, i10, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject);
        }
        loadStickers(i10, false, false, true, new l9(this, stickerSet, 1));
        if (tL_error == null && z11) {
            if (frameLayout != null) {
                org.telegram.ui.Components.ec.f(frameLayout, new kw0(context, tLObject2, 1, 2, document, n2Var.getResourceProvider()), 1500).j();
            } else if (n2Var != null) {
                org.telegram.ui.Components.ec.g(n2Var, new kw0(context, tLObject2, 1, 2, document, n2Var.getResourceProvider()), 1500).j();
            }
        }
    }

    public void lambda$toggleStickerSetInternal$114(final TLRPC.StickerSet stickerSet, final org.telegram.ui.ActionBar.n2 n2Var, final boolean z10, final int i10, final boolean z11, final FrameLayout frameLayout, final Context context, final TLObject tLObject, final TLRPC.Document document, final TLObject tLObject2, final TLRPC.TL_error tL_error) {
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
                mediaDataController.lambda$toggleStickerSetInternal$113(stickerSet, tLObject4, n2Var, z10, i11, tL_error, z11, frameLayout2, context2, tLObject3, document2);
            }
        });
    }

    public void lambda$toggleStickerSetInternal$115(TLRPC.StickerSet stickerSet, ArrayList arrayList) {
        markSetUninstalling(stickerSet.f22407id, false);
    }

    public void lambda$toggleStickerSetInternal$116(TLRPC.StickerSet stickerSet, int i10) {
        this.removingStickerSetsUndos.l(stickerSet.f22407id);
        loadStickers(i10, false, true, false, new l9(this, stickerSet, 0));
    }

    public void lambda$toggleStickerSetInternal$117(TLRPC.StickerSet stickerSet, int i10, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new r4(this, stickerSet, i10, 9));
    }

    public void lambda$toggleStickerSets$118(int i10, TLObject tLObject, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, int i11) {
        if (i10 == 0) {
            loadStickers(i11, false, true);
            return;
        }
        if (tLObject instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
            processStickerSetInstallResultArchive(n2Var, z10, i11, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject);
        }
        loadStickers(i11, false, false, true);
    }

    public void lambda$toggleStickerSets$119(int i10, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, int i11, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new y7(this, i10, tLObject, n2Var, z10, i11));
    }

    public void lambda$updateBotInfo$202(TL_update.TL_updateBotCommands tL_updateBotCommands, long j10) {
        try {
            TL_bots.BotInfo botInfoLoadBotInfoInternal = loadBotInfoInternal(tL_updateBotCommands.bot_id, j10);
            if (botInfoLoadBotInfoInternal != null) {
                botInfoLoadBotInfoInternal.commands = tL_updateBotCommands.commands;
            }
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO bot_info_v2 VALUES(?, ?, ?)");
            sQLitePreparedStatementExecuteFast.requery();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(botInfoLoadBotInfoInternal.getObjectSize());
            botInfoLoadBotInfoInternal.serializeToStream(nativeByteBuffer);
            sQLitePreparedStatementExecuteFast.bindLong(1, botInfoLoadBotInfoInternal.user_id);
            sQLitePreparedStatementExecuteFast.bindLong(2, j10);
            sQLitePreparedStatementExecuteFast.bindByteBuffer(3, nativeByteBuffer);
            sQLitePreparedStatementExecuteFast.step();
            nativeByteBuffer.reuse();
            sQLitePreparedStatementExecuteFast.dispose();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public void lambda$updateEmojiStatuses$234(int i10, TL_account.TL_emojiStatuses tL_emojiStatuses) {
        try {
            getMessagesStorage().getDatabase().executeFast("DELETE FROM emoji_statuses WHERE type = " + i10).stepThis().dispose();
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = getMessagesStorage().getDatabase().executeFast("INSERT INTO emoji_statuses VALUES(?, ?)");
            sQLitePreparedStatementExecuteFast.requery();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_emojiStatuses.getObjectSize());
            tL_emojiStatuses.serializeToStream(nativeByteBuffer);
            sQLitePreparedStatementExecuteFast.bindByteBuffer(1, nativeByteBuffer);
            sQLitePreparedStatementExecuteFast.bindInteger(2, i10);
            sQLitePreparedStatementExecuteFast.step();
            nativeByteBuffer.reuse();
            sQLitePreparedStatementExecuteFast.dispose();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        this.emojiStatusesFetching[i10] = false;
    }

    public void lambda$verifyAnimatedStickerMessageInternal$69(String str, TLObject tLObject) {
        char c10;
        ArrayList<TLRPC.Message> arrayList = this.verifyingMessages.get(str);
        if (tLObject != null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            storeTempStickerSet(tL_messages_stickerSet);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.Message message = arrayList.get(i10);
                TLRPC.Document document = MessageObject.getDocument(message);
                int size2 = tL_messages_stickerSet.documents.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    TLRPC.Document document2 = tL_messages_stickerSet.documents.get(i11);
                    if (document2.f22386id == document.f22386id && document2.dc_id == document.dc_id) {
                        message.stickerVerified = 1;
                        break;
                    }
                }
                if (message.stickerVerified == 0) {
                    message.stickerVerified = 2;
                }
            }
            c10 = 0;
        } else {
            c10 = 0;
            int size3 = arrayList.size();
            for (int i12 = 0; i12 < size3; i12++) {
                arrayList.get(i12).stickerVerified = 2;
            }
        }
        NotificationCenter notificationCenter = getNotificationCenter();
        int i13 = NotificationCenter.didVerifyMessagesStickers;
        Object[] objArr = new Object[1];
        objArr[c10] = arrayList;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i13, objArr);
        getMessagesStorage().updateMessageVerifyFlags(arrayList);
    }

    public void lambda$verifyAnimatedStickerMessageInternal$70(String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new n9(this, str, tLObject, 1));
    }

    private void loadAvatarConstructor(boolean z10) {
        String string;
        long j10;
        TLRPC.TL_emojiList tL_emojiList;
        Throwable th;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("avatar_constructor" + this.currentAccount, 0);
        TLRPC.TL_emojiList tL_emojiList2 = null;
        if (z10) {
            string = sharedPreferences.getString("profile", null);
            j10 = sharedPreferences.getLong("profile_last_check", 0L);
        } else {
            string = sharedPreferences.getString("group", null);
            j10 = sharedPreferences.getLong("group_last_check", 0L);
        }
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            try {
                tL_emojiList = (TLRPC.TL_emojiList) TLRPC.EmojiList.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                try {
                    if (z10) {
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
        if (tL_emojiList2 == null || System.currentTimeMillis() - j10 > 86400000 || BuildVars.DEBUG_PRIVATE_VERSION) {
            TL_account.getDefaultProfilePhotoEmojis getdefaultprofilephotoemojis = new TL_account.getDefaultProfilePhotoEmojis();
            if (tL_emojiList2 != null) {
                getdefaultprofilephotoemojis.hash = tL_emojiList2.hash;
            }
            getConnectionsManager().sendRequest(getdefaultprofilephotoemojis, new u0(this, sharedPreferences, z10, 1));
        }
    }

    private TL_bots.BotInfo loadBotInfoInternal(long j10, long j11) {
        TL_bots.BotInfo botInfoTLdeserialize;
        NativeByteBuffer nativeByteBufferByteBufferValue;
        SQLiteDatabase database = getMessagesStorage().getDatabase();
        Locale locale = Locale.US;
        StringBuilder sbQ = a9.p.q(j10, "SELECT info FROM bot_info_v2 WHERE uid = ", " AND dialogId = ");
        sbQ.append(j11);
        SQLiteCursor sQLiteCursorQueryFinalized = database.queryFinalized(sbQ.toString(), new Object[0]);
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
        this.draftVoices.b();
        for (Map.Entry<String, ?> entry : setEntrySet) {
            String key = entry.getKey();
            DraftVoice draftVoiceFromString = DraftVoice.fromString((String) entry.getValue());
            if (draftVoiceFromString != null) {
                this.draftVoices.k(draftVoiceFromString, Long.parseLong(key));
            }
        }
        this.draftVoicesLoaded = true;
    }

    private void loadGroupStickerSet(TLRPC.StickerSet stickerSet, boolean z10) {
        if (z10) {
            getMessagesStorage().getStorageQueue().postRunnable(new d2(21, this, stickerSet));
            return;
        }
        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_messages_getStickerSet.stickerset = tL_inputStickerSetID;
        tL_inputStickerSetID.f22400id = stickerSet.f22407id;
        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new n7(this, 8));
    }

    private void loadMediaDatabase(long j10, int i10, int i11, int i12, int i13, long j11, ig.q0 q0Var, int i14, boolean z10, int i15, int i16) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(i10, j10, i12, j11, i13, q0Var, i11, i14, i15, z10, i16);
        MessagesStorage messagesStorage = getMessagesStorage();
        messagesStorage.getStorageQueue().postRunnable(anonymousClass1);
        messagesStorage.bindTaskToGuid(anonymousClass1, i14);
    }

    private ArrayList<MessageObject> loadPinnedMessageInternal(long j10, long j11, ArrayList<Integer> arrayList, boolean z10) {
        ?? Join;
        ArrayList<TLRPC.User> arrayList2;
        ArrayList<TLRPC.Chat> arrayList3;
        try {
            ArrayList<Integer> arrayList4 = new ArrayList<>(arrayList);
            if (j11 != 0) {
                Join = new StringBuilder();
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Integer num = arrayList.get(i10);
                    if (Join.length() != 0) {
                        Join.append(",");
                    }
                    Join.append(num);
                }
            } else {
                Join = TextUtils.join(",", arrayList);
            }
            ArrayList arrayList5 = new ArrayList();
            ArrayList<TLRPC.User> arrayList6 = new ArrayList<>();
            ArrayList<TLRPC.Chat> arrayList7 = new ArrayList<>();
            ArrayList<Long> arrayList8 = new ArrayList<>();
            ArrayList arrayList9 = new ArrayList();
            long j12 = getUserConfig().clientUserId;
            int i11 = 1;
            ?? r11 = 0;
            ?? QueryFinalized = getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT data, mid, date FROM messages_v2 WHERE mid IN (%s) AND uid = %d", new Object[]{Join, Long.valueOf(j10)}), new Object[0]);
            while (QueryFinalized.next()) {
                ?? ByteBufferValue = QueryFinalized.byteBufferValue(r11);
                if (ByteBufferValue != 0) {
                    ?? TLdeserialize = TLRPC.Message.TLdeserialize(ByteBufferValue, ByteBufferValue.readInt32(r11), r11);
                    if (!(TLdeserialize.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                        TLdeserialize.readAttachPath(ByteBufferValue, j12);
                        TLdeserialize.f22401id = QueryFinalized.intValue(i11);
                        TLdeserialize.date = QueryFinalized.intValue(2);
                        TLdeserialize.dialog_id = j10;
                        MessagesStorage.addUsersAndChatsFromMessage(TLdeserialize, arrayList8, arrayList9, null);
                        arrayList5.add(TLdeserialize);
                        arrayList4.remove(Integer.valueOf(TLdeserialize.f22401id));
                    }
                    ByteBufferValue.reuse();
                }
                r11 = 0;
                i11 = 1;
            }
            QueryFinalized.dispose();
            if (!arrayList4.isEmpty()) {
                SQLiteDatabase database = getMessagesStorage().getDatabase();
                Locale locale = Locale.US;
                SQLiteCursor sQLiteCursorQueryFinalized = database.queryFinalized("SELECT data FROM chat_pinned_v2 WHERE uid = " + j10 + " AND mid IN (" + TextUtils.join(",", arrayList4) + ")", new Object[0]);
                while (sQLiteCursorQueryFinalized.next()) {
                    NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                    if (nativeByteBufferByteBufferValue != null) {
                        TLRPC.Message messageTLdeserialize = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                        if (!(messageTLdeserialize.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                            messageTLdeserialize.readAttachPath(nativeByteBufferByteBufferValue, j12);
                            messageTLdeserialize.dialog_id = j10;
                            MessagesStorage.addUsersAndChatsFromMessage(messageTLdeserialize, arrayList8, arrayList9, null);
                            arrayList5.add(messageTLdeserialize);
                            arrayList4.remove(Integer.valueOf(messageTLdeserialize.f22401id));
                        }
                        nativeByteBufferByteBufferValue.reuse();
                    }
                }
                sQLiteCursorQueryFinalized.dispose();
            }
            if (!arrayList4.isEmpty()) {
                if (j11 != 0) {
                    TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                    tL_channels_getMessages.channel = getMessagesController().getInputChannel(j11);
                    tL_channels_getMessages.f22418id = arrayList4;
                    getConnectionsManager().sendRequest(tL_channels_getMessages, new hh.d2(this, j11, j10, tL_channels_getMessages));
                } else {
                    TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                    tL_messages_getMessages.f22474id = arrayList4;
                    getConnectionsManager().sendRequest(tL_messages_getMessages, new uk((BaseController) this, j10, tL_messages_getMessages, 2));
                }
            }
            if (arrayList5.isEmpty()) {
                return null;
            }
            try {
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
                if (z10) {
                    return broadcastPinnedMessage(arrayList5, arrayList2, arrayList3, true, true);
                }
                broadcastPinnedMessage(arrayList5, arrayList2, arrayList3, true, false);
                return null;
            } catch (Exception e9) {
                e = e9;
            }
        } catch (Exception e10) {
            e = e10;
        }
        FileLog.e(e);
        return null;
    }

    public static ArrayList<TLRPC.Reaction> loadReactionsFromPref(SharedPreferences sharedPreferences) {
        int i10 = sharedPreferences.getInt("count", 0);
        ArrayList<TLRPC.Reaction> arrayList = new ArrayList<>(i10);
        if (i10 > 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                SerializedData serializedData = new SerializedData(Utilities.hexToBytes(sharedPreferences.getString("object_" + i11, "")));
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
        getMessagesStorage().getStorageQueue().postRunnable(new u7(this, arrayList, 0));
    }

    private void loadStickerSetThumbInternal(TLRPC.PhotoSize photoSize, Object obj, TLRPC.Document document, int i10) {
        ImageLocation forSticker = ImageLocation.getForSticker(photoSize, document, i10);
        if (forSticker != null) {
            getFileLoader().loadFile(forSticker, obj, forSticker.imageType == 1 ? "tgs" : "webp", 3, 1);
        }
    }

    public static void offsetEntities(ArrayList<TLRPC.MessageEntity> arrayList, int i10) {
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            TLRPC.MessageEntity messageEntity = arrayList.get(i11);
            i11++;
            messageEntity.offset += i10;
        }
    }

    private CharSequence parsePattern(CharSequence charSequence, Pattern pattern, ArrayList<TLRPC.MessageEntity> arrayList, GenericProvider<Void, TLRPC.MessageEntity> genericProvider) {
        URLSpan[] uRLSpanArr;
        Matcher matcher = pattern.matcher(charSequence);
        int iEnd = 0;
        while (matcher.find()) {
            boolean z10 = true;
            String strGroup = matcher.group(1);
            if ((charSequence instanceof Spannable) && (uRLSpanArr = (URLSpan[]) ((Spannable) charSequence).getSpans(matcher.start() - iEnd, matcher.end() - iEnd, URLSpan.class)) != null && uRLSpanArr.length > 0) {
                z10 = false;
            }
            if (z10) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLRPC.MessageEntity messageEntity = arrayList.get(i10);
                    if ((messageEntity instanceof TLRPC.TL_messageEntityPre) || (messageEntity instanceof TLRPC.TL_messageEntityCode)) {
                        int iStart = matcher.start() - iEnd;
                        int iEnd2 = matcher.end() - iEnd;
                        int i11 = messageEntity.offset;
                        if (AndroidUtilities.intersect1d(iStart, iEnd2, i11, messageEntity.length + i11)) {
                            z10 = false;
                            break;
                        }
                    }
                }
            }
            if (z10) {
                charSequence = ((Object) charSequence.subSequence(0, matcher.start() - iEnd)) + strGroup + ((Object) charSequence.subSequence(matcher.end() - iEnd, charSequence.length()));
                TLRPC.MessageEntity messageEntityProvide = genericProvider.provide(null);
                messageEntityProvide.offset = matcher.start() - iEnd;
                int length = strGroup.length();
                messageEntityProvide.length = length;
                int i12 = messageEntityProvide.offset;
                removeOffset4After(i12, length + i12, arrayList);
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

    private void processLoadStickersResponse(int i10, TLRPC.TL_messages_allStickers tL_messages_allStickers) {
        processLoadStickersResponse(i10, tL_messages_allStickers, null);
    }

    private void processLoadedDiceStickers(String str, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z11, int i10) {
        AndroidUtilities.runOnUIThread(new b8(this, str, 4));
        Utilities.stageQueue.postRunnable(new c9(this, z11, tL_messages_stickerSet, i10, str, z10));
    }

    private void processLoadedFeaturedStickers(boolean z10, ArrayList<TLRPC.StickerSetCovered> arrayList, ArrayList<Long> arrayList2, boolean z11, boolean z12, int i10, long j10) {
        AndroidUtilities.runOnUIThread(new c8(this, z10, 1));
        Utilities.stageQueue.postRunnable(new b9(this, z12, arrayList, i10, j10, z10, arrayList2, z11));
    }

    public void processLoadedMedia(final TLRPC.messages_Messages messages_messages, final long j10, int i10, int i11, final int i12, final int i13, long j11, final int i14, final int i15, boolean z10, final boolean z11, final int i16) {
        long j12;
        int i17;
        int i18;
        long j13;
        boolean z12;
        ArrayList<TLRPC.Message> arrayList;
        ArrayList<TLRPC.Message> arrayList2;
        if (BuildVars.LOGS_ENABLED) {
            int size = (messages_messages == null || (arrayList2 = messages_messages.messages) == null) ? 0 : arrayList2.size();
            StringBuilder sb2 = new StringBuilder("process load media messagesCount ");
            sb2.append(size);
            sb2.append(" did ");
            j12 = j10;
            sb2.append(j12);
            sb2.append(" topicId ");
            j13 = j11;
            sb2.append(j13);
            sb2.append(" count = ");
            i17 = i10;
            i0.a.x(sb2, i17, " max_id=", i11, " min_id=");
            i18 = i13;
            i0.a.x(sb2, i12, " type = ", i18, " cache = ");
            i0.a.x(sb2, i14, " classGuid = ", i15, " topReached=");
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
        } else {
            if (i14 == 0) {
                ImageLoader.saveMessagesThumbs(messages_messages.messages);
                getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                putMediaDatabase(j10, j11, i13, messages_messages.messages, i11, i12, z12);
            }
            Utilities.searchQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f20958a.lambda$processLoadedMedia$136(messages_messages, i14, j10, i15, i13, z11, i12, i16);
                }
            });
        }
    }

    private void processLoadedMediaCount(final int i10, final long j10, final long j11, final int i11, final int i12, final boolean z10, final int i13) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f20031a.lambda$processLoadedMediaCount$137(j10, z10, i10, i11, i13, j11, i12);
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
        final ArrayList arrayList3 = arrayList != null ? new ArrayList(arrayList) : null;
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f21237a.lambda$putFeaturedStickersToCache$64(arrayList3, arrayList2, z10, i10, j10, z11);
            }
        });
    }

    private void putMediaCountDatabase(long j10, long j11, int i10, int i11) {
        getMessagesStorage().getStorageQueue().postRunnable(new j8(this, j11, j10, i10, i11, 1));
    }

    private void putMediaDatabase(long j10, long j11, int i10, ArrayList<TLRPC.Message> arrayList, int i11, int i12, boolean z10) {
        getMessagesStorage().getStorageQueue().postRunnable(new y8(this, i12, arrayList, z10, j10, i11, i10, j11));
    }

    private void putMenuBotsToCache(TLRPC.TL_attachMenuBots tL_attachMenuBots, long j10, int i10) {
        getMessagesStorage().getStorageQueue().postRunnable(new hh.b9(this, tL_attachMenuBots, j10, i10, 1));
    }

    private void putPremiumPromoToCache(TLRPC.TL_help_premiumPromo tL_help_premiumPromo, int i10) {
        getMessagesStorage().getStorageQueue().postRunnable(new r4(this, tL_help_premiumPromo, i10, 6));
    }

    private void putReactionsToCache(List<TLRPC.TL_availableReaction> list, int i10, int i11) {
        getMessagesStorage().getStorageQueue().postRunnable(new y4(this, list != null ? new ArrayList(list) : null, i10, i11, 3));
    }

    private void putSetToCache(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        getMessagesStorage().getStorageQueue().postRunnable(new d7(this, tL_messages_stickerSet, 3));
    }

    private void putStickersToCache(int i10, ArrayList<TLRPC.TL_messages_stickerSet> arrayList, int i11, long j10) {
        getMessagesStorage().getStorageQueue().postRunnable(new t(this, arrayList != null ? new ArrayList(arrayList) : null, i10, i11, j10));
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
        } catch (Exception e9) {
            FileLog.e(e9);
            return false;
        }
    }

    private void saveDraftReplyMessage(long j10, long j11, TLRPC.Message message) {
        if (message == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new e5.w(this, j10, j11, message, 6));
    }

    private void savePeer(final long j10, final int i10, final double d) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f22202a.lambda$savePeer$158(j10, i10, d);
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
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putInt("count", arrayList.size());
        editorEdit.putLong("hash", j10);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLObject tLObject = arrayList.get(i10);
            SerializedData serializedData = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData);
            editorEdit.putString("object_" + i10, Utilities.bytesToHex(serializedData.toByteArray()));
        }
        editorEdit.apply();
    }

    private void saveReplyMessages(a0.h hVar, ArrayList<TLRPC.Message> arrayList, boolean z10) {
        getMessagesStorage().getStorageQueue().postRunnable(new qj(this, z10, arrayList, hVar, 7));
    }

    private void saveStickerSetIntoCache(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        if (tL_messages_stickerSet == null || tL_messages_stickerSet.set == null) {
            return;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new d7(this, tL_messages_stickerSet, 0));
        cleanupStickerSetCache();
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
        if (suggestedPost != suggestedPost2) {
            if ((suggestedPost == null) == (suggestedPost2 == null)) {
                TL_stars.StarsAmount starsAmount = suggestedPost.price;
                TL_stars.StarsAmount starsAmount2 = suggestedPost2.price;
                hf.a aVarL = hf.a.l(starsAmount);
                hf.a aVarL2 = hf.a.l(starsAmount2);
                if (aVarL != aVarL2 && ((aVarL == null || aVarL2 == null || aVarL.f8919a != aVarL2.f8919a || aVarL.f8920b != aVarL2.f8920b) && suggestedPost.schedule_date == suggestedPost2.schedule_date && suggestedPost.accepted == suggestedPost2.accepted && suggestedPost.rejected == suggestedPost2.rejected)) {
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
        }
        if (!(messageReplyHeader instanceof TLRPC.TL_messageReplyHeader)) {
            return null;
        }
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
                tL_inputPhoto.f22399id = photo.f22404id;
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
                tL_inputDocument.f22392id = document.f22386id;
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

    private void toggleStickerSetInternal(final Context context, int i10, final org.telegram.ui.ActionBar.n2 n2Var, final FrameLayout frameLayout, final boolean z10, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final int i11, final boolean z11) {
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
        long j10 = stickerSet.f22407id;
        tL_inputStickerSetID.f22400id = j10;
        if (i10 == 0) {
            markSetUninstalling(j10, true);
            TLRPC.TL_messages_uninstallStickerSet tL_messages_uninstallStickerSet = new TLRPC.TL_messages_uninstallStickerSet();
            tL_messages_uninstallStickerSet.stickerset = tL_inputStickerSetID;
            getConnectionsManager().sendRequest(tL_messages_uninstallStickerSet, new wa(this, stickerSet, i11));
            return;
        }
        TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
        tL_messages_installStickerSet.stickerset = tL_inputStickerSetID;
        tL_messages_installStickerSet.archived = i10 == 1;
        markSetInstalling(stickerSet.f22407id, true);
        getConnectionsManager().sendRequest(tL_messages_installStickerSet, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                TLObject tLObject3 = tLObject;
                TLRPC.Document document2 = document;
                int i12 = i11;
                Context context2 = context;
                this.f19769a.lambda$toggleStickerSetInternal$114(stickerSet, n2Var, z10, i12, z11, frameLayout, context2, tLObject3, document2, tLObject2, tL_error);
            }
        });
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
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    if (((MessageObject) arrayList.get(i11)).getId() == messageObject3.getId()) {
                        messageObject2 = (MessageObject) arrayList.get(i11);
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
            i10++;
        }
        for (int i12 = 0; i12 < this.searchLocalResultMessages.size(); i12++) {
            MessageObject messageObject4 = this.searchLocalResultMessages.get(i12);
            if (!hashSet.contains(Integer.valueOf(messageObject4.getId()))) {
                int i13 = 0;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        messageObject = null;
                        break;
                    } else {
                        if (((MessageObject) arrayList.get(i13)).getId() == messageObject4.getId()) {
                            messageObject = (MessageObject) arrayList.get(i13);
                            break;
                        }
                        i13++;
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
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new a7(this, str, 0));
    }

    public void addNewStickerSet(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        if (this.stickerSetsById.h(tL_messages_stickerSet.set.f22407id) >= 0 || this.stickerSetsByName.containsKey(tL_messages_stickerSet.set.short_name)) {
            return;
        }
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        int i10 = stickerSet.masks ? 1 : stickerSet.emojis ? 5 : 0;
        this.stickerSets[i10].add(0, tL_messages_stickerSet);
        this.stickerSetsById.k(tL_messages_stickerSet, tL_messages_stickerSet.set.f22407id);
        this.installedStickerSetsById.k(tL_messages_stickerSet, tL_messages_stickerSet.set.f22407id);
        this.stickerSetsByName.put(tL_messages_stickerSet.set.short_name, tL_messages_stickerSet);
        a0.h hVar = new a0.h();
        for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
            TLRPC.Document document = tL_messages_stickerSet.documents.get(i11);
            hVar.k(document, document.f22386id);
        }
        for (int i12 = 0; i12 < tL_messages_stickerSet.packs.size(); i12++) {
            TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i12);
            String strReplace = tL_stickerPack.emoticon.replace("️", "");
            tL_stickerPack.emoticon = strReplace;
            ArrayList<TLRPC.Document> arrayList = this.allStickers.get(strReplace);
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

    public void addRecentGif(TLRPC.Document document, int i10, boolean z10) {
        if (document == null) {
            return;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= this.recentGifs.size()) {
                this.recentGifs.add(0, document);
                break;
            }
            TLRPC.Document document2 = this.recentGifs.get(i11);
            if (document2.f22386id == document.f22386id) {
                this.recentGifs.remove(i11);
                this.recentGifs.add(0, document2);
                break;
            }
            i11++;
        }
        if ((this.recentGifs.size() > getMessagesController().savedGifsLimitDefault && !UserConfig.getInstance(this.currentAccount).isPremium()) || this.recentGifs.size() > getMessagesController().savedGifsLimitPremium) {
            getMessagesStorage().getStorageQueue().postRunnable(new z7(1, this, (TLRPC.Document) com.google.android.recaptcha.internal.a.k(1, this.recentGifs)));
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
        int i13 = 0;
        if (i10 != 3) {
            int i14 = 1;
            if (MessageObject.isStickerDocument(document) || MessageObject.isAnimatedStickerDocument(document, true)) {
                int i15 = 0;
                while (true) {
                    if (i15 >= this.recentStickers[i10].size()) {
                        if (!z10) {
                            this.recentStickers[i10].add(0, document);
                            break;
                        }
                        break;
                    }
                    TLRPC.Document document2 = this.recentStickers[i10].get(i15);
                    if (document2.f22386id == document.f22386id) {
                        this.recentStickers[i10].remove(i15);
                        if (!z10) {
                            this.recentStickers[i10].add(0, document2);
                            break;
                        }
                        break;
                    }
                    i15++;
                }
                if (i10 == 2) {
                    if (z10) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 0, document, 4);
                    } else {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 0, document, Integer.valueOf(this.recentStickers[i10].size() > getMessagesController().maxFaveStickersCount ? 6 : 5));
                    }
                    TLRPC.TL_messages_faveSticker tL_messages_faveSticker = new TLRPC.TL_messages_faveSticker();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_messages_faveSticker.f22464id = tL_inputDocument;
                    tL_inputDocument.f22392id = document.f22386id;
                    tL_inputDocument.access_hash = document.access_hash;
                    byte[] bArr = document.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    tL_messages_faveSticker.unfave = z10;
                    getConnectionsManager().sendRequest(tL_messages_faveSticker, new v7(this, obj, tL_messages_faveSticker, i13));
                    i12 = getMessagesController().maxFaveStickersCount;
                } else {
                    if (i10 == 0 && z10) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 0, document, 3);
                        TLRPC.TL_messages_saveRecentSticker tL_messages_saveRecentSticker = new TLRPC.TL_messages_saveRecentSticker();
                        TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                        tL_messages_saveRecentSticker.f22488id = tL_inputDocument2;
                        tL_inputDocument2.f22392id = document.f22386id;
                        tL_inputDocument2.access_hash = document.access_hash;
                        byte[] bArr2 = document.file_reference;
                        tL_inputDocument2.file_reference = bArr2;
                        if (bArr2 == null) {
                            tL_inputDocument2.file_reference = new byte[0];
                        }
                        tL_messages_saveRecentSticker.unsave = true;
                        getConnectionsManager().sendRequest(tL_messages_saveRecentSticker, new v7(this, obj, tL_messages_saveRecentSticker, i14));
                    }
                    i12 = getMessagesController().maxRecentStickersCount;
                }
                if (this.recentStickers[i10].size() > i12 || z10) {
                    getMessagesStorage().getStorageQueue().postRunnable(new r4(this, i10, z10 ? document : (TLRPC.Document) com.google.android.recaptcha.internal.a.k(1, this.recentStickers[i10]), 7));
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
            if (!isStickerPackInstalled(stickerSetCovered.set.f22407id) && ((!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) && !this.unreadStickerSets[z10 ? 1 : 0].contains(Long.valueOf(stickerSetCovered.set.f22407id)))) {
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
        int iG = g0.f.g(ApplicationLoader.applicationContext) - 2;
        if (iG <= 0) {
            iG = 5;
        }
        ArrayList arrayList = new ArrayList();
        if (SharedConfig.passcodeHash.length() <= 0) {
            for (int i10 = 0; i10 < this.hints.size(); i10++) {
                arrayList.add(this.hints.get(i10));
                if (arrayList.size() == iG - 2) {
                    break;
                }
            }
        }
        Utilities.globalQueue.postRunnable(new n6(this, Build.VERSION.SDK_INT >= 30, arrayList, 4));
    }

    public void calcNewHash(int i10) {
        this.loadHash[i10] = calcStickersHash(this.stickerSets[i10]);
    }

    public boolean canAddStickerToFavorites() {
        return (this.stickersLoaded[0] && this.stickerSets[0].size() < 5 && this.recentStickers[2].isEmpty()) ? false : true;
    }

    public boolean canCreateAttachedMenuBotShortcut(long j10) {
        return true;
    }

    public boolean cancelRemovingStickerSet(long j10) {
        Runnable runnable = (Runnable) this.removingStickerSetsUndos.f(j10);
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
        if (this.loadingDefaultTopicIcons || System.currentTimeMillis() - getUserConfig().lastUpdatedDefaultTopicIcons < 86400000) {
            return;
        }
        this.loadingDefaultTopicIcons = true;
        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
        tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetEmojiDefaultTopicIcons();
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new n7(this, 7));
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
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new n7(this, 0));
    }

    public void checkMenuBots(boolean z10) {
        if (this.isLoadingMenuBots) {
            return;
        }
        if ((!z10 || this.menuBotsUpdatedLocal) && Math.abs((System.currentTimeMillis() / 1000) - ((long) this.menuBotsUpdateDate)) < 3600) {
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
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new n7(this, 5));
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

    public void checkRingtones(boolean z10) {
        this.ringtoneDataStore.g(z10);
    }

    public void checkStickers(int i10) {
        if (this.loadingStickers[i10]) {
            return;
        }
        if (!this.stickersLoaded[i10] || Math.abs((System.currentTimeMillis() / 1000) - ((long) this.loadDate[i10])) >= 3600) {
            loadStickers(i10, true, false);
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
        getConnectionsManager().sendRequest(tL_messages_getStickerSet, new n7(this, 9));
    }

    public void cleanDraft(long j10, long j11, boolean z10) {
        a0.h hVar = (a0.h) this.drafts.f(j10);
        TLRPC.DraftMessage draftMessage = hVar != null ? (TLRPC.DraftMessage) hVar.f(j11) : null;
        if (draftMessage == null) {
            return;
        }
        if (z10) {
            TLRPC.InputReplyTo inputReplyTo = draftMessage.reply_to;
            if (inputReplyTo == null || inputReplyTo.reply_to_msg_id != 0) {
                if (inputReplyTo != null) {
                    inputReplyTo.reply_to_msg_id = 0;
                }
                draftMessage.flags &= -2;
                saveDraft(j10, j11, draftMessage.message, draftMessage.entities, null, null, null, 0L, draftMessage.no_webpage, true);
                return;
            }
            return;
        }
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
        if (j11 != 0) {
            SharedPreferences.Editor editorEdit = this.draftPreferences.edit();
            StringBuilder sbQ = a9.p.q(j10, "t_", "_");
            sbQ.append(j11);
            SharedPreferences.Editor editorRemove = editorEdit.remove(sbQ.toString());
            StringBuilder sbQ2 = a9.p.q(j10, "rt_", "_");
            sbQ2.append(j11);
            editorRemove.remove(sbQ2.toString()).commit();
            return;
        }
        this.draftPreferences.edit().remove("" + j10).remove("r_" + j10).commit();
        getMessagesController().sortDialogs(null);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
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
        AndroidUtilities.runOnUIThread(new i7(this, 9));
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
        getMessagesStorage().getStorageQueue().postRunnable(new i7(this, 4));
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
        getConnectionsManager().sendRequest(new TLRPC.TL_messages_clearRecentStickers(), new n7(this, 1));
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
        getMessagesStorage().getStorageQueue().postRunnable(new i7(this, 15));
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
        TLObject tLObject;
        boolean[] zArr = this.emojiStatusesFetching;
        if (zArr[i10]) {
            return;
        }
        zArr[i10] = true;
        if (z10) {
            getMessagesStorage().getStorageQueue().postRunnable(new n8(this, i10, 1));
            return;
        }
        if (i10 == 0) {
            TL_account.getRecentEmojiStatuses getrecentemojistatuses = new TL_account.getRecentEmojiStatuses();
            getrecentemojistatuses.hash = this.emojiStatusesHash[i10];
            tLObject = getrecentemojistatuses;
        } else if (i10 == 1) {
            TL_account.getDefaultEmojiStatuses getdefaultemojistatuses = new TL_account.getDefaultEmojiStatuses();
            getdefaultemojistatuses.hash = this.emojiStatusesHash[i10];
            tLObject = getdefaultemojistatuses;
        } else {
            TL_account.getChannelDefaultEmojiStatuses getchanneldefaultemojistatuses = new TL_account.getChannelDefaultEmojiStatuses();
            getchanneldefaultemojistatuses.hash = this.emojiStatusesHash[i10];
            tLObject = getchanneldefaultemojistatuses;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLObject, new o7(this, i10, 3));
    }

    public void fetchNewEmojiKeywords(String[] strArr) {
        fetchNewEmojiKeywords(strArr, false);
    }

    public void fillWithAnimatedEmoji(ArrayList<KeywordResult> arrayList, Integer num, boolean z10, boolean z11, boolean z12, Runnable runnable) {
        if (arrayList == null || arrayList.isEmpty()) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        ArrayList[] arrayListArr = {getStickerSets(5)};
        u6 u6Var = new u6(this, num, arrayList, z11, z10, arrayListArr, runnable);
        ArrayList arrayList2 = arrayListArr[0];
        if ((arrayList2 != null && !arrayList2.isEmpty()) || this.triedLoadingEmojipacks) {
            u6Var.run();
            return;
        }
        this.triedLoadingEmojipacks = true;
        boolean[] zArr = new boolean[1];
        AndroidUtilities.runOnUIThread(new lk(this, zArr, arrayListArr, u6Var, 18));
        AndroidUtilities.runOnUIThread(new d2(20, zArr, u6Var), 900L);
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
            getMessagesStorage().getStorageQueue().postRunnable(new a9(this, str, callback, 0));
        }
    }

    public void generateEmojiPreviewThemes(ArrayList<TLRPC.TL_theme> arrayList, int i10) {
        SharedPreferences.Editor editorEdit = ApplicationLoader.applicationContext.getSharedPreferences("emojithemes_config_" + i10, 0).edit();
        editorEdit.putInt("count", arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.TL_theme tL_theme = arrayList.get(i11);
            SerializedData serializedData = new SerializedData(tL_theme.getObjectSize());
            tL_theme.serializeToStream(serializedData);
            editorEdit.putString("theme_" + i11, Utilities.bytesToHex(serializedData.toByteArray()));
        }
        editorEdit.apply();
        if (arrayList.isEmpty()) {
            this.defaultEmojiThemes.clear();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.emojiPreviewThemesChanged, new Object[0]);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new zo(org.telegram.ui.ActionBar.b4.c(i10)));
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            org.telegram.ui.ActionBar.b4 b4VarD = org.telegram.ui.ActionBar.b4.d(i10, arrayList.get(i12));
            zo zoVar = new zo(b4VarD);
            if (b4VarD.f22784f.size() >= 4) {
                arrayList2.add(zoVar);
            }
        }
        ChatThemeController.chatThemeQueue.postRunnable(new AnonymousClass3(arrayList2, i10));
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
            Utilities.searchQueue.postRunnable(new lk(str, getStickerSets(5), getFeaturedEmojiSets(), callback, 16));
        }
    }

    public int getArchivedStickersCount(int i10) {
        return this.archivedStickersCount[i10];
    }

    public TLRPC.TL_attachMenuBots getAttachMenuBots() {
        return this.attachMenuBots;
    }

    public TL_bots.BotInfo getBotInfoCached(long j10, long j11) {
        return this.botInfos.get(j10 + "_" + j11);
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
        String strReplace = charSequence.toString().replace("️", "");
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = getStickerSets(4);
        int size = stickerSets.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i10);
            int size2 = tL_messages_stickerSet.packs.size();
            for (int i11 = 0; i11 < size2; i11++) {
                TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i11);
                if (!tL_stickerPack.documents.isEmpty() && TextUtils.equals(tL_stickerPack.emoticon, strReplace)) {
                    return (TLRPC.Document) getStickerByIds(4).f(tL_stickerPack.documents.get(0).longValue());
                }
            }
        }
        return null;
    }

    public String getEmojiForSticker(long j10) {
        String str = (String) this.stickersByEmoji.f(j10);
        return str != null ? str : "";
    }

    public void getEmojiNames(String[] strArr, String str, Utilities.Callback<ArrayList<String>> callback) {
        if (callback == null || str == null) {
            return;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new lk(this, strArr, str, callback, 17));
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
        long jCalcHash = 0;
        for (int i10 = 0; i10 < this.featuredStickerSets[z10 ? 1 : 0].size(); i10++) {
            TLRPC.StickerSet stickerSet = this.featuredStickerSets[z10 ? 1 : 0].get(i10).set;
            if (!stickerSet.archived) {
                jCalcHash = calcHash(jCalcHash, stickerSet.f22407id);
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
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.stickerSetsById.f(stickerSet.f22407id);
        if (tL_messages_stickerSet == null) {
            tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.groupStickerSets.f(stickerSet.f22407id);
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
        return this.lastReturnedNum > 0 ? i10 | 2 : i10;
    }

    public void getMediaCount(final long j10, final long j11, final int i10, final int i11, boolean z10) {
        if (z10 || DialogObject.isEncryptedDialog(j10)) {
            getMediaCountDatabase(j10, j11, i10, i11);
            return;
        }
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
                this.f21506a.lambda$getMediaCount$132(j10, j11, i10, i11, tLObject, tL_error);
            }
        }), i11);
    }

    public void getMediaCounts(long j10, long j11, int i10) {
        getMessagesStorage().getStorageQueue().postRunnable(new t7(this, j11, j10, i10, 0));
    }

    public Pair<Long, TLRPC.DraftMessage> getOneThreadDraft(long j10) {
        a0.h hVar = (a0.h) this.drafts.f(j10);
        if (hVar == null || hVar.m() <= 0) {
            return null;
        }
        return new Pair<>(Long.valueOf(hVar.j(0)), hVar.n(0));
    }

    public Integer getPremiumHintAnnualDiscount(boolean z10) {
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo;
        ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList;
        double d;
        int i10;
        double d10;
        n2.l lVar;
        n2.k kVar;
        n2.k kVar2;
        double d11;
        int i11;
        n2.l lVar2;
        n2.k kVar3;
        if ((z10 && (!BillingController.getInstance().isReady() || BillingController.getInstance().getLastPremiumTransaction() == null)) || (tL_help_premiumPromo = this.premiumPromo) == null) {
            return null;
        }
        ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList2 = tL_help_premiumPromo.period_options;
        int size = arrayList2.size();
        int i12 = 0;
        double d12 = 0.0d;
        boolean z11 = false;
        int i13 = 0;
        while (i13 < size) {
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = arrayList2.get(i13);
            i13++;
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption2 = tL_premiumSubscriptionOption;
            if (!z10) {
                kVar2 = null;
                if (tL_premiumSubscriptionOption2.months == 1) {
                    if (BuildVars.useInvoiceBilling()) {
                        d11 = tL_premiumSubscriptionOption2.amount;
                        i11 = tL_premiumSubscriptionOption2.months;
                    } else {
                        d11 = tL_premiumSubscriptionOption2.amount;
                        i11 = tL_premiumSubscriptionOption2.months;
                    }
                    d12 = d11 / ((double) i11);
                    z11 = true;
                }
            } else if (tL_premiumSubscriptionOption2.current) {
                kVar2 = null;
                if (Objects.equals(tL_premiumSubscriptionOption2.transaction.replaceAll("^(.*?)(?:\\.\\.\\d*|)$", "$1"), BillingController.getInstance().getLastPremiumTransaction())) {
                    if (BuildVars.useInvoiceBilling() || (lVar2 = BillingController.PREMIUM_PRODUCT_DETAILS) == null) {
                        d11 = tL_premiumSubscriptionOption2.amount;
                        i11 = tL_premiumSubscriptionOption2.months;
                    } else {
                        ArrayList arrayList3 = lVar2.h;
                        int size2 = arrayList3.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 >= size2) {
                                kVar3 = kVar2;
                                break;
                            }
                            Object obj = arrayList3.get(i14);
                            i14++;
                            kVar3 = (n2.k) obj;
                            String str = ((n2.j) kVar3.f18160b.f8872a.get(0)).d;
                            int i15 = tL_premiumSubscriptionOption2.months;
                            if (i15 != 12) {
                                Locale locale = Locale.ROOT;
                                if (str.equals("P" + i15 + "M")) {
                                    break;
                                }
                            } else if (str.equals("P1Y")) {
                                break;
                            }
                        }
                        if (kVar3 == null) {
                            d11 = tL_premiumSubscriptionOption2.amount;
                            i11 = tL_premiumSubscriptionOption2.months;
                        } else {
                            d11 = ((n2.j) kVar3.f18160b.f8872a.get(0)).f18157b;
                            i11 = tL_premiumSubscriptionOption2.months;
                        }
                    }
                    d12 = d11 / ((double) i11);
                    z11 = true;
                }
            }
        }
        ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList4 = this.premiumPromo.period_options;
        int size3 = arrayList4.size();
        int i16 = 0;
        int i17 = 0;
        while (i17 < size3) {
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption3 = arrayList4.get(i17);
            i17++;
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption4 = tL_premiumSubscriptionOption3;
            if (z11 && tL_premiumSubscriptionOption4.months == 12) {
                if (BuildVars.useInvoiceBilling() || (lVar = BillingController.PREMIUM_PRODUCT_DETAILS) == null) {
                    arrayList = arrayList4;
                    d = tL_premiumSubscriptionOption4.amount;
                    i10 = tL_premiumSubscriptionOption4.months;
                } else {
                    ArrayList arrayList5 = lVar.h;
                    int size4 = arrayList5.size();
                    int i18 = 0;
                    while (true) {
                        if (i18 >= size4) {
                            arrayList = arrayList4;
                            kVar = null;
                            break;
                        }
                        Object obj2 = arrayList5.get(i18);
                        i18++;
                        kVar = (n2.k) obj2;
                        String str2 = ((n2.j) kVar.f18160b.f8872a.get(i12)).d;
                        int i19 = tL_premiumSubscriptionOption4.months;
                        arrayList = arrayList4;
                        if (i19 != 12) {
                            Locale locale2 = Locale.ROOT;
                            if (str2.equals("P" + i19 + "M")) {
                                break;
                            }
                            arrayList4 = arrayList;
                            i12 = 0;
                        } else {
                            if (str2.equals("P1Y")) {
                                break;
                            }
                            arrayList4 = arrayList;
                            i12 = 0;
                        }
                    }
                    if (kVar == null) {
                        d10 = tL_premiumSubscriptionOption4.amount / ((double) tL_premiumSubscriptionOption4.months);
                    } else {
                        d = ((n2.j) kVar.f18160b.f8872a.get(0)).f18157b;
                        i10 = tL_premiumSubscriptionOption4.months;
                    }
                    i16 = (int) ((1.0d - (d10 / d12)) * 100.0d);
                }
                d10 = d / ((double) i10);
                i16 = (int) ((1.0d - (d10 / d12)) * 100.0d);
            } else {
                arrayList = arrayList4;
            }
            arrayList4 = arrayList;
            i12 = 0;
        }
        if (!z11 || i16 <= 0) {
            return null;
        }
        return Integer.valueOf(i16);
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
        tL_inputStickerSetID.f22400id = stickerSet.f22407id;
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
        return i10 == 3 ? this.stickerSets[2] : this.stickerSets[i10];
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
            if (document2.f22386id == document.f22386id) {
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
        if (!getUserConfig().suggestContacts || !DialogObject.isUserDialog(j10) || (user = getMessagesController().getUser(Long.valueOf(j10))) == null || user.bot || user.self) {
            return;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new c7(this, j10, 1));
    }

    public void increaseWebappRating(long j10) {
        TLRPC.TL_topPeer tL_topPeer;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
        if (user == null || !user.bot) {
            return;
        }
        int iMax = getUserConfig().webappRatingLoadTime != 0 ? Math.max(1, ((int) (System.currentTimeMillis() / 1000)) - getUserConfig().webappRatingLoadTime) : 60;
        int i10 = 0;
        while (true) {
            if (i10 >= this.webapps.size()) {
                tL_topPeer = null;
                break;
            }
            tL_topPeer = this.webapps.get(i10);
            if (tL_topPeer.peer.user_id == j10) {
                break;
            } else {
                i10++;
            }
        }
        if (tL_topPeer == null) {
            tL_topPeer = new TLRPC.TL_topPeer();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_topPeer.peer = tL_peerUser;
            tL_peerUser.user_id = j10;
            this.webapps.add(tL_topPeer);
        }
        tL_topPeer.rating = Math.exp(iMax / getMessagesController().ratingDecay) + tL_topPeer.rating;
        Collections.sort(this.webapps, new q(9));
        if (this.webapps.size() > 20) {
            a9.p.s(1, this.webapps);
        }
        savePeer(j10, 2, tL_topPeer.rating);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadWebappsHints, new Object[0]);
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
        return this.searchServerResultMessagesMap[z10 ? 1 : 0].indexOfKey(i10) >= 0;
    }

    public boolean isSearchLoading() {
        return this.reqId != 0;
    }

    public boolean isShortcutAdded(long j10, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            String str = (i10 == SHORTCUT_TYPE_USER_OR_CHAT ? "sdid_" : "bdid_") + j10;
            List listK = g0.f.k(ApplicationLoader.applicationContext);
            for (int i11 = 0; i11 < listK.size(); i11++) {
                if (((g0.c) listK.get(i11)).f6332b.equals(str)) {
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
            if (document2.f22386id == document.f22386id && document2.dc_id == document.dc_id) {
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
        if (i11 < 0 || i11 >= this.searchResultMessages.size()) {
            return;
        }
        this.lastReturnedNum = i11;
        MessageObject messageObject = this.searchResultMessages.get(i11);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatSearchResultsAvailable, Integer.valueOf(i10), Integer.valueOf(messageObject.getId()), Integer.valueOf(getMask()), Long.valueOf(messageObject.getDialogId()), Integer.valueOf(this.lastReturnedNum), Integer.valueOf(getSearchCount()), Boolean.TRUE);
    }

    public void loadArchivedStickersCount(int i10, boolean z10) {
        int i11 = 0;
        if (!z10) {
            TLRPC.TL_messages_getArchivedStickers tL_messages_getArchivedStickers = new TLRPC.TL_messages_getArchivedStickers();
            tL_messages_getArchivedStickers.limit = 0;
            tL_messages_getArchivedStickers.masks = i10 == 1;
            tL_messages_getArchivedStickers.emojis = i10 == 5;
            getConnectionsManager().sendRequest(tL_messages_getArchivedStickers, new o7(this, i10, i11));
            return;
        }
        int i12 = MessagesController.getNotificationsSettings(this.currentAccount).getInt("archivedStickersCount" + i10, -1);
        if (i12 == -1) {
            loadArchivedStickersCount(i10, false);
        } else {
            this.archivedStickersCount[i10] = i12;
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.archivedStickersCountDidLoad, Integer.valueOf(i10));
        }
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
        if (getUserConfig().draftsLoaded || this.loadingDrafts) {
            return;
        }
        this.loadingDrafts = true;
        getConnectionsManager().sendRequest(new TLRPC.TL_messages_getAllDrafts(), new n7(this, 6));
    }

    public void loadEmojiThemes() {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("emojithemes_config_" + this.currentAccount, 0);
        int i10 = sharedPreferences.getInt("count", 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zo(org.telegram.ui.ActionBar.b4.c(this.currentAccount)));
        for (int i11 = 0; i11 < i10; i11++) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(sharedPreferences.getString("theme_" + i11, "")));
            try {
                org.telegram.ui.ActionBar.b4 b4VarD = org.telegram.ui.ActionBar.b4.d(this.currentAccount, TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true));
                if (b4VarD.f22784f.size() >= 4) {
                    arrayList.add(new zo(b4VarD));
                }
                ChatThemeController.chatThemeQueue.postRunnable(new AnonymousClass2(arrayList));
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
    }

    public void loadFeaturedStickers(boolean z10, boolean z11) {
        long j10;
        TLObject tLObject;
        boolean[] zArr = this.loadingFeaturedStickers;
        if (zArr[z10 ? 1 : 0]) {
            return;
        }
        zArr[z10 ? 1 : 0] = true;
        if (z11) {
            getMessagesStorage().getStorageQueue().postRunnable(new c8(this, z10, 0));
            return;
        }
        if (z10) {
            TLRPC.TL_messages_getFeaturedEmojiStickers tL_messages_getFeaturedEmojiStickers = new TLRPC.TL_messages_getFeaturedEmojiStickers();
            j10 = this.loadFeaturedHash[1];
            tL_messages_getFeaturedEmojiStickers.hash = j10;
            tLObject = tL_messages_getFeaturedEmojiStickers;
        } else {
            TLRPC.TL_messages_getFeaturedStickers tL_messages_getFeaturedStickers = new TLRPC.TL_messages_getFeaturedStickers();
            j10 = this.loadFeaturedHash[0];
            tL_messages_getFeaturedStickers.hash = j10;
            tLObject = tL_messages_getFeaturedStickers;
        }
        getConnectionsManager().sendRequest(tLObject, new d8(this, z10, j10, 0));
    }

    public void loadHints(boolean z10) {
        if (this.loading || !getUserConfig().suggestContacts) {
            return;
        }
        if (z10) {
            if (this.loaded) {
                return;
            }
            this.loading = true;
            getMessagesStorage().getStorageQueue().postRunnable(new i7(this, 12));
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
        getConnectionsManager().sendRequestTyped(tL_contacts_getTopPeers, new a(), new le(this, 4));
    }

    public void loadMedia(final long j10, final int i10, final int i11, final int i12, final int i13, final long j11, int i14, final int i15, final int i16, ig.q0 q0Var, String str) {
        MediaDataController mediaDataController;
        final boolean z10;
        TLRPC.TL_messages_search tL_messages_search;
        if (DialogObject.isChatDialog(j10)) {
            mediaDataController = this;
            z10 = ChatObject.isChannel(-j10, mediaDataController.currentAccount);
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("load media did " + j10 + " count = " + i10 + " max_id " + i11 + " type = " + i13 + " cache = " + i14 + " classGuid = " + i15);
            }
            if ((i14 == 0 && TextUtils.isEmpty(str)) || DialogObject.isEncryptedDialog(j10)) {
                mediaDataController.loadMediaDatabase(j10, i10, i11, i12, i13, j11, q0Var, i15, z10, i14, i16);
            }
            tL_messages_search = new TLRPC.TL_messages_search();
            tL_messages_search.limit = i10;
            if (i12 != 0) {
                tL_messages_search.offset_id = i12;
                tL_messages_search.add_offset = -i10;
            } else {
                tL_messages_search.offset_id = i11;
            }
            if (q0Var != null) {
                tL_messages_search.flags |= 8;
                tL_messages_search.saved_reaction.add(q0Var.g());
            }
            if (i13 == 0) {
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhotoVideo();
            } else if (i13 == 6) {
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhotos();
            } else if (i13 == 7) {
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterVideo();
            } else if (i13 == 1) {
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterDocument();
            } else if (i13 == 2) {
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterRoundVoice();
            } else if (i13 == 3) {
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterUrl();
            } else if (i13 == 4) {
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterMusic();
            } else if (i13 == 5) {
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterGif();
            } else if (i13 == 8) {
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPoll();
            }
            if (TextUtils.isEmpty(str)) {
                tL_messages_search.f22489q = "";
            } else {
                tL_messages_search.f22489q = str;
            }
            tL_messages_search.peer = getMessagesController().getInputPeer(j10);
            if (j11 != 0) {
                if (j10 == getUserConfig().getClientUserId()) {
                    tL_messages_search.saved_peer_id = getMessagesController().getInputPeer(j11);
                    tL_messages_search.flags |= 4;
                } else {
                    tL_messages_search.top_msg_id = (int) j11;
                    tL_messages_search.flags |= 2;
                }
            }
            if (tL_messages_search.peer == null) {
                return;
            }
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f22111a.lambda$loadMedia$126(j10, i12, i10, i11, i13, j11, i15, z10, i16, tLObject, tL_error);
                }
            }), i15);
            return;
        }
        mediaDataController = this;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("load media did " + j10 + " count = " + i10 + " max_id " + i11 + " type = " + i13 + " cache = " + i14 + " classGuid = " + i15);
        }
        if (i14 == 0) {
            tL_messages_search = new TLRPC.TL_messages_search();
            tL_messages_search.limit = i10;
            if (i12 != 0) {
                tL_messages_search.offset_id = i12;
                tL_messages_search.add_offset = -i10;
            } else {
                tL_messages_search.offset_id = i11;
            }
            if (q0Var != null) {
                tL_messages_search.flags |= 8;
                tL_messages_search.saved_reaction.add(q0Var.g());
            }
            if (i13 == 0) {
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhotoVideo();
            } else if (i13 == 6) {
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhotos();
            } else if (i13 == 7) {
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterVideo();
            } else if (i13 == 1) {
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterDocument();
            } else if (i13 == 2) {
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterRoundVoice();
            } else if (i13 == 3) {
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterUrl();
            } else if (i13 == 4) {
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterMusic();
            } else if (i13 == 5) {
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterGif();
            } else if (i13 == 8) {
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPoll();
            }
            if (TextUtils.isEmpty(str)) {
                tL_messages_search.f22489q = str;
            } else {
                tL_messages_search.f22489q = "";
            }
            tL_messages_search.peer = getMessagesController().getInputPeer(j10);
            if (j11 != 0) {
                if (j10 == getUserConfig().getClientUserId()) {
                    tL_messages_search.saved_peer_id = getMessagesController().getInputPeer(j11);
                    tL_messages_search.flags |= 4;
                } else {
                    tL_messages_search.top_msg_id = (int) j11;
                    tL_messages_search.flags |= 2;
                }
            }
            if (tL_messages_search.peer == null) {
                return;
            }
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f22111a.lambda$loadMedia$126(j10, i12, i10, i11, i13, j11, i15, z10, i16, tLObject, tL_error);
                }
            }), i15);
            return;
        }
        tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = i10;
        if (i12 != 0) {
            tL_messages_search.offset_id = i12;
            tL_messages_search.add_offset = -i10;
        } else {
            tL_messages_search.offset_id = i11;
        }
        if (q0Var != null) {
            tL_messages_search.flags |= 8;
            tL_messages_search.saved_reaction.add(q0Var.g());
        }
        if (i13 == 0) {
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhotoVideo();
        } else if (i13 == 6) {
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhotos();
        } else if (i13 == 7) {
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterVideo();
        } else if (i13 == 1) {
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterDocument();
        } else if (i13 == 2) {
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterRoundVoice();
        } else if (i13 == 3) {
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterUrl();
        } else if (i13 == 4) {
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterMusic();
        } else if (i13 == 5) {
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterGif();
        } else if (i13 == 8) {
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPoll();
        }
        if (TextUtils.isEmpty(str)) {
            tL_messages_search.f22489q = str;
        } else {
            tL_messages_search.f22489q = "";
        }
        tL_messages_search.peer = getMessagesController().getInputPeer(j10);
        if (j11 != 0) {
            if (j10 == getUserConfig().getClientUserId()) {
                tL_messages_search.saved_peer_id = getMessagesController().getInputPeer(j11);
                tL_messages_search.flags |= 4;
            } else {
                tL_messages_search.top_msg_id = (int) j11;
                tL_messages_search.flags |= 2;
            }
        }
        if (tL_messages_search.peer == null) {
            return;
        }
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f22111a.lambda$loadMedia$126(j10, i12, i10, i11, i13, j11, i15, z10, i16, tLObject, tL_error);
            }
        }), i15);
        return;
        mediaDataController.loadMediaDatabase(j10, i10, i11, i12, i13, j11, q0Var, i15, z10, i14, i16);
    }

    public void loadMoreSearchMessages(boolean z10) {
        if (this.loadingMoreSearchMessages || this.reqId != 0) {
            return;
        }
        boolean[] zArr = this.messagesSearchEndReached;
        if (zArr[0] && this.lastMergeDialogId == 0 && zArr[1]) {
            return;
        }
        int i10 = this.lastReturnedNum;
        this.lastReturnedNum = this.searchResultMessages.size();
        this.loadingMoreSearchMessages = true;
        searchMessagesInChat(null, this.lastDialogId, this.lastMergeDialogId, this.lastGuid, 1, this.lastReplyMessageId, false, this.lastSearchUser, this.lastSearchChat, false, this.lastReaction);
        this.lastReturnedNum = i10;
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
        tL_messages_search.f22489q = "";
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPinned();
        getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f20364a.lambda$loadPinnedMessages$162(i11, tL_messages_search, j10, i10, tLObject, tL_error);
            }
        });
    }

    public void loadPremiumPromo(boolean z10) {
        this.isLoadingPremiumPromo = true;
        if (z10) {
            getMessagesStorage().getStorageQueue().postRunnable(new i7(this, 6));
        } else {
            getConnectionsManager().sendRequest(new TLRPC.TL_help_getPremiumPromo(), new n7(this, 3));
        }
    }

    public void loadReactions(boolean z10, Integer num) {
        this.isLoadingReactions = true;
        if (z10) {
            getMessagesStorage().getStorageQueue().postRunnable(new i7(this, 10));
            return;
        }
        TLRPC.TL_messages_getAvailableReactions tL_messages_getAvailableReactions = new TLRPC.TL_messages_getAvailableReactions();
        tL_messages_getAvailableReactions.hash = num != null ? num.intValue() : this.reactionsUpdateHash;
        getConnectionsManager().sendRequest(tL_messages_getAvailableReactions, new n7(this, 4));
    }

    public void loadRecentAndTopReactions(boolean z10) {
        if (this.loadingRecentReactions) {
            return;
        }
        if (!this.loadedRecentReactions || z10) {
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
            final int i10 = 0;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getRecentReactions, new RequestDelegate(this) {

                public final MediaDataController f20239b;

                {
                    this.f20239b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i10) {
                        case 0:
                            this.f20239b.lambda$loadRecentAndTopReactions$236(sharedPreferences, zArr, tLObject, tL_error);
                            break;
                        default:
                            this.f20239b.lambda$loadRecentAndTopReactions$238(sharedPreferences, zArr, tLObject, tL_error);
                            break;
                    }
                }
            });
            TLRPC.TL_messages_getTopReactions tL_messages_getTopReactions = new TLRPC.TL_messages_getTopReactions();
            tL_messages_getTopReactions.hash = sharedPreferences2.getLong("hash", 0L);
            tL_messages_getTopReactions.limit = 100;
            final int i11 = 1;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getTopReactions, new RequestDelegate(this) {

                public final MediaDataController f20239b;

                {
                    this.f20239b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i11) {
                        case 0:
                            this.f20239b.lambda$loadRecentAndTopReactions$236(sharedPreferences2, zArr, tLObject, tL_error);
                            break;
                        default:
                            this.f20239b.lambda$loadRecentAndTopReactions$238(sharedPreferences2, zArr, tLObject, tL_error);
                            break;
                    }
                }
            });
        }
    }

    public void loadRecents(int i10, boolean z10, boolean z11, boolean z12) {
        TLRPC.TL_messages_getStickers tL_messages_getStickers;
        TLObject tLObject;
        long j10;
        if (!z10) {
            boolean[] zArr = this.loadingRecentStickers;
            if (zArr[i10]) {
                return;
            }
            zArr[i10] = true;
            if (this.recentStickersLoaded[i10]) {
                z11 = false;
            }
        } else {
            if (this.loadingRecentGifs) {
                return;
            }
            this.loadingRecentGifs = true;
            if (this.recentGifsLoaded) {
                z11 = false;
            }
        }
        if (z11) {
            getMessagesStorage().getStorageQueue().postRunnable(new r8(this, z10, i10, 0));
            return;
        }
        SharedPreferences emojiSettings = MessagesController.getEmojiSettings(this.currentAccount);
        if (!z12) {
            if (z10) {
                j10 = emojiSettings.getLong("lastGifLoadTime", 0L);
            } else if (i10 == 0) {
                j10 = emojiSettings.getLong("lastStickersLoadTime", 0L);
            } else if (i10 == 1) {
                j10 = emojiSettings.getLong("lastStickersLoadTimeMask", 0L);
            } else if (i10 == 3) {
                j10 = emojiSettings.getLong("lastStickersLoadTimeGreet", 0L);
            } else if (i10 == 5) {
                j10 = emojiSettings.getLong("lastStickersLoadTimeEmojiPacks", 0L);
            } else {
                j10 = i10 == 7 ? emojiSettings.getLong("lastStickersLoadTimePremiumStickers", 0L) : emojiSettings.getLong("lastStickersLoadTimeFavs", 0L);
            }
            if (Math.abs(System.currentTimeMillis() - j10) < 3600000) {
                if (z10) {
                    this.loadingRecentGifs = false;
                    return;
                } else {
                    this.loadingRecentStickers[i10] = false;
                    return;
                }
            }
        }
        if (z10) {
            TLRPC.TL_messages_getSavedGifs tL_messages_getSavedGifs = new TLRPC.TL_messages_getSavedGifs();
            tL_messages_getSavedGifs.hash = calcDocumentsHash(this.recentGifs);
            getConnectionsManager().sendRequest(tL_messages_getSavedGifs, new o7(this, i10, 1));
            return;
        }
        if (i10 == 2) {
            TLRPC.TL_messages_getFavedStickers tL_messages_getFavedStickers = new TLRPC.TL_messages_getFavedStickers();
            tL_messages_getFavedStickers.hash = calcDocumentsHash(this.recentStickers[i10]);
            tLObject = tL_messages_getFavedStickers;
        } else {
            if (i10 == 3) {
                tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                tL_messages_getStickers.emoticon = "👋" + Emoji.fixEmoji("⭐");
                tL_messages_getStickers.hash = calcDocumentsHash(this.recentStickers[i10]);
            } else if (i10 == 7) {
                tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                tL_messages_getStickers.emoticon = "📂" + Emoji.fixEmoji("⭐");
                tL_messages_getStickers.hash = calcDocumentsHash(this.recentStickers[i10]);
            } else {
                TLRPC.TL_messages_getRecentStickers tL_messages_getRecentStickers = new TLRPC.TL_messages_getRecentStickers();
                tL_messages_getRecentStickers.hash = calcDocumentsHash(this.recentStickers[i10]);
                tL_messages_getRecentStickers.attached = i10 == 1;
                tLObject = tL_messages_getRecentStickers;
            }
            tLObject = tL_messages_getStickers;
        }
        getConnectionsManager().sendRequest(tLObject, new o7(this, i10, 2));
    }

    public void loadReplyIcons() {
        Throwable th;
        TLRPC.TL_emojiList tL_emojiList;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("replyicons_" + this.currentAccount, 0);
        TLRPC.TL_emojiList tL_emojiList2 = null;
        String string = sharedPreferences.getString("replyicons", null);
        long j10 = sharedPreferences.getLong("replyicons_last_check", 0L);
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
        if (tL_emojiList2 == null || System.currentTimeMillis() - j10 > 86400000 || BuildVars.DEBUG_PRIVATE_VERSION) {
            TL_account.getDefaultBackgroundEmojis getdefaultbackgroundemojis = new TL_account.getDefaultBackgroundEmojis();
            if (tL_emojiList2 != null) {
                getdefaultbackgroundemojis.hash = tL_emojiList2.hash;
            }
            getConnectionsManager().sendRequest(getdefaultbackgroundemojis, new v6(this, sharedPreferences, 2));
        }
    }

    public void loadReplyMessagesForMessages(ArrayList<MessageObject> arrayList, long j10, int i10, long j11, Runnable runnable, int i11, Timer timer) {
        a0.h hVar;
        Timer.Task task;
        int i12;
        a0.h hVar2;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        long j12;
        long j13;
        ArrayList arrayList2;
        TLRPC.Chat chat;
        TLRPC.Message message2;
        TLRPC.Peer peer;
        ArrayList<MessageObject> arrayList3 = arrayList;
        boolean z10 = i10 == 1;
        if (DialogObject.isEncryptedDialog(j10)) {
            Timer.Task taskStart = Timer.start(timer, "loadReplyMessagesForMessages: (encrypted) finding messages to load");
            ArrayList arrayList4 = new ArrayList();
            a0.h hVar3 = new a0.h();
            for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                MessageObject messageObject = arrayList3.get(i13);
                if (messageObject != null && messageObject.isReply() && messageObject.replyMessageObject == null) {
                    long j14 = messageObject.messageOwner.reply_to.reply_to_random_id;
                    ArrayList arrayListL = (ArrayList) hVar3.f(j14);
                    if (arrayListL == null) {
                        arrayListL = y1.l(j14, hVar3);
                    }
                    arrayListL.add(messageObject);
                    if (!arrayList4.contains(Long.valueOf(j14))) {
                        arrayList4.add(Long.valueOf(j14));
                    }
                }
            }
            if (!arrayList4.isEmpty()) {
                Timer.done(taskStart);
                getMessagesStorage().getStorageQueue().postRunnable(new l8(this, Timer.start(timer, "loadReplyMessagesForMessages (encrypted) storageQueue.postRunnable"), timer, arrayList4, j10, hVar3, runnable));
                return;
            } else {
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
        }
        a0.h hVar4 = new a0.h();
        a0.h hVar5 = new a0.h();
        Timer.Task taskStart2 = Timer.start(timer, "loadReplyMessagesForMessages: filling replies from the same array");
        int i14 = 0;
        while (true) {
            hVar = null;
            if (i14 >= arrayList3.size()) {
                break;
            }
            MessageObject messageObject2 = arrayList3.get(i14);
            if (messageObject2 != null && !messageObject2.isReplyToStory() && messageObject2.isReply() && messageObject2.getRealId() > 0) {
                TLRPC.MessageReplyHeader messageReplyHeader = messageObject2.messageOwner.reply_to;
                if (messageReplyHeader.reply_to_peer_id == null) {
                    int i15 = messageReplyHeader.reply_to_msg_id;
                    for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                        if (i14 != i16 && arrayList3.get(i16) != null && arrayList3.get(i16).getRealId() == i15) {
                            messageObject2.replyMessageObject = arrayList3.get(i16);
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
            i14++;
        }
        Timer.done(taskStart2);
        Timer.Task taskStart3 = Timer.start(timer, "loadReplyMessagesForMessages: gathering ids of missing reply data");
        int i17 = 0;
        while (i17 < arrayList3.size()) {
            MessageObject messageObject3 = arrayList3.get(i17);
            if (messageObject3 == null) {
                task = taskStart3;
                hVar2 = hVar;
            } else {
                int i18 = messageObject3.type;
                if (i18 == 23 || i18 == 24) {
                    task = taskStart3;
                    i12 = i17;
                    hVar2 = hVar;
                    TLRPC.MessageMedia messageMedia2 = messageObject3.messageOwner.media;
                    if (messageMedia2.storyItem == null) {
                        long peerDialogId = DialogObject.getPeerDialogId(messageMedia2.peer);
                        hVar = hVar2 == null ? new a0.h() : hVar2;
                        ArrayList arrayListL2 = (ArrayList) hVar.f(peerDialogId);
                        if (arrayListL2 == null) {
                            arrayListL2 = y1.l(peerDialogId, hVar);
                        }
                        StringBuilder sbQ = a9.p.q(peerDialogId, "+story did=", " at ");
                        sbQ.append(messageObject3.type == 23 ? "forwarded" : "mentioned");
                        sbQ.append(" #");
                        sbQ.append(messageObject3.getId());
                        Timer.log(timer, sbQ.toString());
                        arrayListL2.add(messageObject3);
                    } else {
                        long peerDialogId2 = DialogObject.getPeerDialogId(messageMedia2.peer);
                        TLRPC.MessageMedia messageMedia3 = messageObject3.messageOwner.media;
                        messageMedia3.storyItem = jh.f7.c(this.currentAccount, peerDialogId2, messageMedia3.storyItem);
                        hVar = hVar2;
                    }
                } else {
                    if (messageObject3.getRealId() <= 0 || !messageObject3.isReplyToStory()) {
                        task = taskStart3;
                        if (messageObject3.getRealId() > 0 && messageObject3.isReply()) {
                            TLRPC.Message message3 = messageObject3.messageOwner;
                            TLRPC.MessageReplyHeader messageReplyHeader2 = message3.reply_to;
                            int i19 = messageReplyHeader2.reply_to_msg_id;
                            hVar2 = hVar;
                            if (i19 != j11) {
                                TLRPC.Peer peer2 = messageReplyHeader2.reply_to_peer_id;
                                if (peer2 != null) {
                                    j12 = 0;
                                    j13 = peer2.channel_id;
                                    if (j13 == 0) {
                                        j13 = j12;
                                    }
                                } else {
                                    j12 = 0;
                                    j13 = message3.peer_id.channel_id;
                                    if (j13 == 0) {
                                        j13 = j12;
                                    }
                                }
                                MessageObject messageObject4 = messageObject3.replyMessageObject;
                                if ((messageObject4 == null || ((message2 = messageObject4.messageOwner) != null && (peer = message2.peer_id) != null && !(message3 instanceof TLRPC.TL_messageEmpty) && peer.channel_id != j13)) && (j10 == 1271266957 || j13 == j12 || messageObject3.getDialogId() == (-j13) || (chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j13))) == null || ChatObject.isPublic(chat))) {
                                    SparseArray sparseArray = (SparseArray) hVar4.f(j10);
                                    ArrayList arrayListL3 = (ArrayList) hVar5.f(j13);
                                    if (sparseArray == null) {
                                        sparseArray = new SparseArray();
                                        hVar4.k(sparseArray, j10);
                                    }
                                    if (arrayListL3 == null) {
                                        arrayListL3 = y1.l(j13, hVar5);
                                    }
                                    ArrayList arrayList5 = (ArrayList) sparseArray.get(i19);
                                    i12 = i17;
                                    if (arrayList5 == null) {
                                        arrayList2 = new ArrayList();
                                        sparseArray.put(i19, arrayList2);
                                        if (!arrayListL3.contains(Integer.valueOf(i19))) {
                                            arrayListL3.add(Integer.valueOf(i19));
                                        }
                                    } else {
                                        arrayList2 = arrayList5;
                                    }
                                    arrayList2.add(messageObject3);
                                    Timer.log(timer, "+message did=" + (-j13) + " mid=" + i19 + " at replied #" + messageObject3.getId());
                                }
                                i17 = i12 + 1;
                                arrayList3 = arrayList;
                                taskStart3 = task;
                            }
                        }
                        hVar = hVar2;
                    } else {
                        TLRPC.Message message4 = messageObject3.messageOwner;
                        if (message4.replyStory == null) {
                            long peerDialogId3 = DialogObject.getPeerDialogId(message4.reply_to.peer);
                            if (hVar == null) {
                                hVar = new a0.h();
                            }
                            ArrayList arrayListL4 = (ArrayList) hVar.f(peerDialogId3);
                            if (arrayListL4 == null) {
                                arrayListL4 = y1.l(peerDialogId3, hVar);
                            }
                            StringBuilder sbQ2 = a9.p.q(peerDialogId3, "+story did=", " at replied #");
                            sbQ2.append(messageObject3.getId());
                            Timer.log(timer, sbQ2.toString());
                            arrayListL4.add(messageObject3);
                            task = taskStart3;
                            i12 = i17;
                        } else {
                            long peerDialogId4 = DialogObject.getPeerDialogId(message4.reply_to.peer);
                            TLRPC.Message message5 = messageObject3.messageOwner;
                            task = taskStart3;
                            message5.replyStory = jh.f7.c(this.currentAccount, peerDialogId4, message5.replyStory);
                        }
                    }
                    i12 = i17;
                    hVar2 = hVar;
                    hVar = hVar2;
                }
                if (messageObject3.type == 0 && (message = messageObject3.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                    int i20 = 0;
                    while (i20 < messageObject3.messageOwner.media.webpage.attributes.size()) {
                        TLRPC.WebPageAttribute webPageAttribute = messageObject3.messageOwner.media.webpage.attributes.get(i20);
                        if (webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) {
                            TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) webPageAttribute;
                            if (tL_webPageAttributeStory.storyItem == null) {
                                long peerDialogId5 = DialogObject.getPeerDialogId(tL_webPageAttributeStory.peer);
                                if (hVar == null) {
                                    hVar = new a0.h();
                                }
                                ArrayList arrayListL5 = (ArrayList) hVar.f(peerDialogId5);
                                if (arrayListL5 == null) {
                                    arrayListL5 = y1.l(peerDialogId5, hVar);
                                }
                                StringBuilder sbQ3 = a9.p.q(peerDialogId5, "+story did=", " at webpage of #");
                                sbQ3.append(messageObject3.getId());
                                Timer.log(timer, sbQ3.toString());
                                arrayListL5.add(messageObject3);
                            } else {
                                tL_webPageAttributeStory.storyItem = jh.f7.c(this.currentAccount, DialogObject.getPeerDialogId(tL_webPageAttributeStory.peer), tL_webPageAttributeStory.storyItem);
                            }
                        }
                        i20++;
                        messageObject3 = messageObject3;
                    }
                }
                i17 = i12 + 1;
                arrayList3 = arrayList;
                taskStart3 = task;
            }
            i12 = i17;
            hVar = hVar2;
            i17 = i12 + 1;
            arrayList3 = arrayList;
            taskStart3 = task;
        }
        a0.h hVar6 = hVar;
        Timer.done(taskStart3);
        if (hVar4.i() && hVar6 == null) {
            if (runnable != null) {
                runnable.run();
            }
        } else {
            getMessagesStorage().getStorageQueue().postRunnable(new m8(this, Timer.start(timer, "loadReplyMessagesForMessages: storageQueue.postRunnable"), hVar6, new AtomicInteger(2), runnable, i11, timer, hVar4, hVar5, z10, j10));
        }
    }

    public void loadRestrictedStatusEmojis() {
        Throwable th;
        TLRPC.TL_emojiList tL_emojiList;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("restrictedstatuses_" + this.currentAccount, 0);
        TLRPC.TL_emojiList tL_emojiList2 = null;
        String string = sharedPreferences.getString("restrictedstatuses", null);
        long j10 = sharedPreferences.getLong("restrictedstatuses_last_check", 0L);
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
        if (tL_emojiList2 == null || System.currentTimeMillis() - j10 > 86400000) {
            TL_account.getChannelRestrictedStatusEmojis getchannelrestrictedstatusemojis = new TL_account.getChannelRestrictedStatusEmojis();
            if (tL_emojiList2 != null) {
                getchannelrestrictedstatusemojis.hash = tL_emojiList2.hash;
            }
            getConnectionsManager().sendRequest(getchannelrestrictedstatusemojis, new v6(this, sharedPreferences, 0));
        }
    }

    public void loadSavedReactions(boolean z10) {
        if (this.loadingSavedReactions) {
            return;
        }
        if (!this.loadedSavedReactions || z10) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("saved_reactions_" + this.currentAccount, 0);
            this.savedReactions.clear();
            this.savedReactions.addAll(loadReactionsFromPref(sharedPreferences));
            this.loadingSavedReactions = true;
            this.loadedSavedReactions = true;
            TLRPC.TL_messages_getDefaultTagReactions tL_messages_getDefaultTagReactions = new TLRPC.TL_messages_getDefaultTagReactions();
            tL_messages_getDefaultTagReactions.hash = sharedPreferences.getLong("hash", 0L);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getDefaultTagReactions, new v6(this, sharedPreferences, 1));
        }
    }

    public void loadStickers(int i10, boolean z10, boolean z11) {
        loadStickers(i10, z10, z11, false, null);
    }

    public void loadStickersByEmojiOrName(String str, boolean z10, boolean z11) {
        if (this.loadingDiceStickerSets.contains(str)) {
            return;
        }
        if (!z10 || this.diceStickerSetsByEmoji.get(str) == null) {
            this.loadingDiceStickerSets.add(str);
            if (z11) {
                getMessagesStorage().getStorageQueue().postRunnable(new i8(this, str, z10, 1));
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

    public void markFeaturedStickersAsRead(boolean z10, boolean z11) {
        if (this.unreadStickerSets[z10 ? 1 : 0].isEmpty()) {
            return;
        }
        this.unreadStickerSets[z10 ? 1 : 0].clear();
        this.loadFeaturedHash[z10 ? 1 : 0] = calcFeaturedStickersHash(z10, this.featuredStickerSets[z10 ? 1 : 0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(z10 ? NotificationCenter.featuredEmojiDidLoad : NotificationCenter.featuredStickersDidLoad, new Object[0]);
        putFeaturedStickersToCache(z10, this.featuredStickerSets[z10 ? 1 : 0], this.unreadStickerSets[z10 ? 1 : 0], this.loadFeaturedDate[z10 ? 1 : 0], this.loadFeaturedHash[z10 ? 1 : 0], this.loadFeaturedPremium);
        if (z11) {
            getConnectionsManager().sendRequest(new TLRPC.TL_messages_readFeaturedStickers(), new e5(12));
        }
    }

    public void markFeaturedStickersByIdAsRead(boolean z10, long j10) {
        if (!this.unreadStickerSets[z10 ? 1 : 0].contains(Long.valueOf(j10)) || this.readingStickerSets[z10 ? 1 : 0].contains(Long.valueOf(j10))) {
            return;
        }
        this.readingStickerSets[z10 ? 1 : 0].add(Long.valueOf(j10));
        TLRPC.TL_messages_readFeaturedStickers tL_messages_readFeaturedStickers = new TLRPC.TL_messages_readFeaturedStickers();
        tL_messages_readFeaturedStickers.f22482id.add(Long.valueOf(j10));
        getConnectionsManager().sendRequest(tL_messages_readFeaturedStickers, new e5(10));
        AndroidUtilities.runOnUIThread(new hh.ua(this, z10, j10, 3), 1000L);
    }

    public void markSetInstalling(long j10, boolean z10) {
        this.uninstalledForceStickerSetsById.remove(Long.valueOf(j10));
        if (z10 && !this.installedForceStickerSetsById.contains(Long.valueOf(j10))) {
            this.installedForceStickerSetsById.add(Long.valueOf(j10));
        }
        if (z10) {
            return;
        }
        this.installedForceStickerSetsById.remove(Long.valueOf(j10));
    }

    public void markSetUninstalling(long j10, boolean z10) {
        this.installedForceStickerSetsById.remove(Long.valueOf(j10));
        if (z10 && !this.uninstalledForceStickerSetsById.contains(Long.valueOf(j10))) {
            this.uninstalledForceStickerSetsById.add(Long.valueOf(j10));
        }
        if (z10) {
            return;
        }
        this.uninstalledForceStickerSetsById.remove(Long.valueOf(j10));
    }

    public void moveStickerSetToTop(long j10, boolean z10, boolean z11) {
        int i10 = z10 ? 5 : z11 ? 1 : 0;
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = getStickerSets(i10);
        if (stickerSets != null) {
            for (int i11 = 0; i11 < stickerSets.size(); i11++) {
                if (stickerSets.get(i11).set.f22407id == j10) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i11);
                    stickerSets.remove(i11);
                    stickerSets.add(0, tL_messages_stickerSet);
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i10), Boolean.FALSE);
                    return;
                }
            }
        }
    }

    public void onRingtoneUploaded(String str, TLRPC.Document document, boolean z10) {
        this.ringtoneUploaderHashMap.remove(str);
        cf.d dVar = this.ringtoneDataStore;
        ArrayList arrayList = dVar.f2584e;
        boolean z11 = true;
        if (z10) {
            int i10 = 0;
            while (true) {
                if (i10 >= arrayList.size()) {
                    z11 = false;
                    break;
                } else {
                    if (((cf.c) arrayList.get(i10)).d && str.equals(((cf.c) arrayList.get(i10)).f2577b)) {
                        arrayList.remove(i10);
                        break;
                    }
                    i10++;
                }
            }
        } else {
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList.size()) {
                    z11 = false;
                    break;
                } else {
                    if (((cf.c) arrayList.get(i11)).d && str.equals(((cf.c) arrayList.get(i11)).f2577b)) {
                        ((cf.c) arrayList.get(i11)).d = false;
                        ((cf.c) arrayList.get(i11)).f2576a = document;
                        break;
                    }
                    i11++;
                }
            }
            if (z11) {
                dVar.h();
            }
        }
        if (z11) {
            NotificationCenter.getInstance(dVar.f2583c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
        }
    }

    public void portSavedSearchResults(int i10, ig.q0 q0Var, String str, ArrayList<MessageObject> arrayList, ArrayList<MessageObject> arrayList2, int i11, int i12, boolean z10) {
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
        if (this.reactionsList == null || this.reactionsCacheGenerated || !LiteMode.isEnabled(8200) || this.currentAccount != UserConfig.selectedAccount) {
            return;
        }
        this.reactionsCacheGenerated = true;
        ArrayList arrayList = new ArrayList(this.reactionsList);
        int iMin = Math.min(arrayList.size(), 10);
        for (int i10 = 0; i10 < iMin; i10++) {
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList.get(i10);
            preloadImage(ImageLocation.getForDocument(tL_availableReaction.activate_animation), 0);
            preloadImage(ImageLocation.getForDocument(tL_availableReaction.appear_animation), 0);
        }
        for (int i11 = 0; i11 < iMin; i11++) {
            preloadImage(ImageLocation.getForDocument(((TLRPC.TL_availableReaction) arrayList.get(i11)).effect_animation), 0);
        }
    }

    public void preloadImage(ImageLocation imageLocation, int i10) {
        getFileLoader().loadFile(imageLocation, null, null, i10, 11);
    }

    public void preloadPremiumPreviewStickers() {
        if (!this.previewStickersLoading && this.premiumPreviewStickers.isEmpty()) {
            TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
            tL_messages_getStickers.emoticon = Emoji.fixEmoji("⭐") + Emoji.fixEmoji("⭐");
            tL_messages_getStickers.hash = 0L;
            this.previewStickersLoading = true;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getStickers, new n7(this, 2));
            return;
        }
        int i10 = 0;
        while (i10 < Math.min(this.premiumPreviewStickers.size(), 3)) {
            ArrayList<TLRPC.Document> arrayList = this.premiumPreviewStickers;
            TLRPC.Document document = arrayList.get(i10 == 2 ? arrayList.size() - 1 : i10);
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
            i10++;
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
            if (i11 >= this.deletedFromResultMessages.size()) {
                messageObject = null;
                break;
            }
            if (this.deletedFromResultMessages.get(i11).getId() == i10) {
                messageObject = this.deletedFromResultMessages.get(i11);
                break;
            }
            i11++;
        }
        if (messageObject != null && messageObject.getDialogId() == getUserConfig().getClientUserId()) {
            boolean zProcessDeletedReactionTags = getMessagesController().processDeletedReactionTags(messageObject.messageOwner);
            jArr[0] = MessageObject.getSavedDialogId(getUserConfig().getClientUserId(), messageObject.messageOwner);
            z10 = zProcessDeletedReactionTags;
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
        SharedPreferences.Editor editorEdit = getMessagesController().getMainSettings().edit();
        this.menuBotsUpdateDate = i10;
        editorEdit.putInt("menuBotsUpdateDate", i10).commit();
        this.menuBotsUpdatedLocal = true;
        if (tL_attachMenuBots != null) {
            if (!z10) {
                getMessagesStorage().putUsersAndChats(tL_attachMenuBots.users, null, true, true);
            }
            getMessagesController().putUsers(tL_attachMenuBots.users, z10);
            AndroidUtilities.runOnUIThread(new i7(this, 1));
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
        } else if (z11 || Math.abs((System.currentTimeMillis() / 1000) - ((long) i10)) >= 3600) {
            loadAttachMenuBots(false, true);
        }
    }

    public void processLoadedPremiumPromo(TLRPC.TL_help_premiumPromo tL_help_premiumPromo, int i10, boolean z10) {
        if (tL_help_premiumPromo != null) {
            this.premiumPromo = tL_help_premiumPromo;
            this.premiumPromoUpdateDate = i10;
            getMessagesController().putUsers(tL_help_premiumPromo.users, z10);
            AndroidUtilities.runOnUIThread(new i7(this, 7));
        }
        if (!z10) {
            if (tL_help_premiumPromo != null) {
                putPremiumPromoToCache(tL_help_premiumPromo, i10);
            }
            this.isLoadingPremiumPromo = false;
        } else if (tL_help_premiumPromo == null || Math.abs((System.currentTimeMillis() / 1000) - ((long) i10)) >= 86400) {
            loadPremiumPromo(false);
        } else {
            this.isLoadingPremiumPromo = false;
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
            AndroidUtilities.runOnUIThread(new i7(this, 3));
        }
        this.isLoadingReactions = false;
        if (!z10) {
            putReactionsToCache(list, i10, i11);
        } else {
            Math.abs((System.currentTimeMillis() / 1000) - ((long) i11));
            loadReactions(false, Integer.valueOf(i10));
        }
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
            getMessagesStorage().getStorageQueue().postRunnable(new o9(this, z12, i12, arrayList2, z11, i13));
        } else {
            i12 = i10;
            arrayList2 = arrayList;
            z12 = z10;
            i13 = i11;
        }
        if (i13 == 0) {
            AndroidUtilities.runOnUIThread(new k9(this, z12, i12, arrayList2));
        }
    }

    public void processStickerSetInstallResultArchive(org.telegram.ui.ActionBar.n2 n2Var, boolean z10, int i10, TLRPC.TL_messages_stickerSetInstallResultArchive tL_messages_stickerSetInstallResultArchive) {
        int size = tL_messages_stickerSetInstallResultArchive.sets.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.installedStickerSetsById.l(tL_messages_stickerSetInstallResultArchive.sets.get(i11).set.f22407id);
        }
        loadArchivedStickersCount(i10, false);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needAddArchivedStickers, tL_messages_stickerSetInstallResultArchive.sets);
        if (n2Var == null || n2Var.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = n2Var.getParentActivity();
        org.telegram.ui.ActionBar.n2 n2Var2 = z10 ? n2Var : null;
        ArrayList<TLRPC.StickerSetCovered> arrayList = tL_messages_stickerSetInstallResultArchive.sets;
        gx0 gx0Var = new gx0(parentActivity);
        TLRPC.StickerSetCovered stickerSetCovered = arrayList.get(0);
        boolean z11 = stickerSetCovered.set.masks;
        org.telegram.ui.ActionBar.b2 b2Var = gx0Var.f22702a;
        if (z11) {
            gx0Var.d = 1;
            b2Var.N = LocaleController.getString(R.string.ArchivedMasksAlertTitle);
        } else {
            gx0Var.d = 0;
            b2Var.N = LocaleController.getString(R.string.ArchivedStickersAlertTitle);
        }
        gx0Var.f28864c = new ArrayList(arrayList);
        gx0Var.f28865e = n2Var2;
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        gx0Var.n(linearLayout);
        TextView textView = new TextView(parentActivity);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        textView.setGravity(h7.z5.y());
        textView.setTextSize(1, 16.0f);
        textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(23.0f), 0);
        if (stickerSetCovered.set.masks) {
            textView.setText(LocaleController.getString(R.string.ArchivedMasksAlertInfo));
        } else {
            textView.setText(LocaleController.getString(R.string.ArchivedStickersAlertInfo));
        }
        linearLayout.addView(textView, h7.z5.n(-2, -2));
        zk0 zk0Var = new zk0(parentActivity, null);
        b2Var.getContext();
        zk0Var.setLayoutManager(new f2.k0(1, false));
        zk0Var.setAdapter(new fx0(gx0Var, parentActivity));
        zk0Var.setVerticalScrollBarEnabled(false);
        zk0Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        zk0Var.setGlowColor(-657673);
        linearLayout.addView(zk0Var, h7.z5.k(0.0f, 10.0f, 0.0f, 0.0f, -1, -2));
        gx0Var.h(LocaleController.getString(R.string.Close), new pc0(16));
        if (n2Var2 != null) {
            gx0Var.k(LocaleController.getString(R.string.Settings), new vu(gx0Var, 23));
        }
        n2Var.showDialog(b2Var);
    }

    public void pushDraftVoiceMessage(long j10, long j11, DraftVoice draftVoice) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("2voicedrafts_" + this.currentAccount, 0);
        long jHash = Objects.hash(Long.valueOf(j10), Long.valueOf(j11));
        String str = jHash + "";
        if (draftVoice == null) {
            sharedPreferences.edit().remove(str).apply();
            this.draftVoices.l(jHash);
        } else {
            sharedPreferences.edit().putString(str, draftVoice.toString()).apply();
            this.draftVoices.k(draftVoice, jHash);
        }
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
                a9.p.s(1, this.emojiStatuses[0]);
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
        this.botInfos.put(botInfo.user_id + "_" + j10, botInfo);
        getMessagesStorage().getStorageQueue().postRunnable(new c4(this, botInfo, j10, 6));
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
            if (iIntValue < message.f22401id || MessageObject.isEphemeralMessageId(iIntValue) || MessageObject.isEphemeralMessageId(message.f22401id)) {
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast = topicKey.topicId != 0 ? getMessagesStorage().getDatabase().executeFast("REPLACE INTO bot_keyboard_topics VALUES(?, ?, ?, ?)") : getMessagesStorage().getDatabase().executeFast("REPLACE INTO bot_keyboard VALUES(?, ?, ?)");
                sQLitePreparedStatementExecuteFast.requery();
                MessageObject.normalizeFlags(message);
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                message.serializeToStream(nativeByteBuffer);
                if (topicKey.topicId != 0) {
                    sQLitePreparedStatementExecuteFast.bindLong(1, topicKey.dialogId);
                    sQLitePreparedStatementExecuteFast.bindLong(2, topicKey.topicId);
                    sQLitePreparedStatementExecuteFast.bindInteger(3, message.f22401id);
                    sQLitePreparedStatementExecuteFast.bindByteBuffer(4, nativeByteBuffer);
                } else {
                    sQLitePreparedStatementExecuteFast.bindLong(1, topicKey.dialogId);
                    sQLitePreparedStatementExecuteFast.bindInteger(2, message.f22401id);
                    sQLitePreparedStatementExecuteFast.bindByteBuffer(3, nativeByteBuffer);
                }
                sQLitePreparedStatementExecuteFast.step();
                nativeByteBuffer.reuse();
                sQLitePreparedStatementExecuteFast.dispose();
                AndroidUtilities.runOnUIThread(new w6(this, topicKey, message));
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public void putGroupStickerSet(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.groupStickerSets.k(tL_messages_stickerSet, tL_messages_stickerSet.set.f22407id);
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

    public void removeMultipleStickerSets(Context context, org.telegram.ui.ActionBar.n2 n2Var, ArrayList<TLRPC.TL_messages_stickerSet> arrayList) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (arrayList == null || arrayList.isEmpty() || (tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) i0.a.i(1, arrayList)) == null) {
            return;
        }
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        int i10 = stickerSet.masks ? 1 : stickerSet.emojis ? 5 : 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList.get(i11).set.archived = false;
        }
        int[] iArr = new int[arrayList.size()];
        for (int i12 = 0; i12 < this.stickerSets[i10].size(); i12++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.stickerSets[i10].get(i12);
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                if (tL_messages_stickerSet2.set.f22407id == arrayList.get(i13).set.f22407id) {
                    iArr[i13] = i12;
                    this.stickerSets[i10].remove(i12);
                    this.stickerSetsById.l(tL_messages_stickerSet2.set.f22407id);
                    this.installedStickerSetsById.l(tL_messages_stickerSet2.set.f22407id);
                    this.stickerSetsByName.remove(tL_messages_stickerSet2.set.short_name);
                    break;
                }
            }
        }
        ArrayList<TLRPC.TL_messages_stickerSet> arrayList2 = this.stickerSets[i10];
        int i14 = this.loadDate[i10];
        long[] jArr = this.loadHash;
        int i15 = i10;
        long jCalcStickersHash = calcStickersHash(arrayList2);
        jArr[i15] = jCalcStickersHash;
        putStickersToCache(i15, arrayList2, i14, jCalcStickersHash);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i15), Boolean.TRUE);
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            markSetUninstalling(arrayList.get(i16).set.f22407id, true);
        }
        kw0 kw0Var = new kw0(context, tL_messages_stickerSet, arrayList.size(), 0, null, n2Var.getResourceProvider());
        boolean[] zArr = new boolean[1];
        org.telegram.ui.Components.cc ccVar = new org.telegram.ui.Components.cc(context, null, false);
        ccVar.f27402a = new gh.e1(this, zArr, arrayList, i15, iArr, 5);
        ccVar.f27403b = new gf.k0(this, zArr, arrayList, context, n2Var, i15);
        kw0Var.setButton(ccVar);
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            this.removingStickerSetsUndos.k(new d1(ccVar, 25), arrayList.get(i17).set.f22407id);
        }
        org.telegram.ui.Components.ec.g(n2Var, kw0Var, 2750).j();
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
        for (int i10 = 0; i10 < size; i10++) {
            if (this.recentGifs.get(i10).f22386id == document.f22386id) {
                this.recentGifs.remove(i10);
                break;
            }
        }
        TLRPC.TL_messages_saveGif tL_messages_saveGif = new TLRPC.TL_messages_saveGif();
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_messages_saveGif.f22487id = tL_inputDocument;
        tL_inputDocument.f22392id = document.f22386id;
        tL_inputDocument.access_hash = document.access_hash;
        byte[] bArr = document.file_reference;
        tL_inputDocument.file_reference = bArr;
        if (bArr == null) {
            tL_inputDocument.file_reference = new byte[0];
        }
        tL_messages_saveGif.unsave = true;
        getConnectionsManager().sendRequest(tL_messages_saveGif, new t1(3, this, tL_messages_saveGif));
        getMessagesStorage().getStorageQueue().postRunnable(new z7(0, this, document));
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
        Collections.sort(this.stickerSets[i10], new j7(arrayList, 1));
        this.loadHash[i10] = calcStickersHash(this.stickerSets[i10]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i10), Boolean.valueOf(z10));
    }

    public void replaceStickerSet(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        boolean z10;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) this.stickerSetsById.f(tL_messages_stickerSet.set.f22407id);
        String str = (String) this.diceEmojiStickerSetsById.f(tL_messages_stickerSet.set.f22407id);
        if (str != null) {
            this.diceStickerSetsByEmoji.put(str, tL_messages_stickerSet);
            putDiceStickersToCache(str, tL_messages_stickerSet, (int) (System.currentTimeMillis() / 1000));
        }
        if (tL_messages_stickerSet2 == null) {
            tL_messages_stickerSet2 = this.stickerSetsByName.get(tL_messages_stickerSet.set.short_name);
        }
        boolean z11 = tL_messages_stickerSet2 == null && (tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) this.groupStickerSets.f(tL_messages_stickerSet.set.f22407id)) != null;
        if (tL_messages_stickerSet2 == null) {
            return;
        }
        if ("AnimatedEmojies".equals(tL_messages_stickerSet.set.short_name)) {
            tL_messages_stickerSet2.documents = tL_messages_stickerSet.documents;
            tL_messages_stickerSet2.packs = tL_messages_stickerSet.packs;
            tL_messages_stickerSet2.set = tL_messages_stickerSet.set;
            AndroidUtilities.runOnUIThread(new d7(this, tL_messages_stickerSet, 4));
            z10 = true;
        } else {
            a0.h hVar = new a0.h();
            int size = tL_messages_stickerSet.documents.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.Document document = tL_messages_stickerSet.documents.get(i10);
                hVar.k(document, document.f22386id);
            }
            int size2 = tL_messages_stickerSet2.documents.size();
            z10 = false;
            for (int i11 = 0; i11 < size2; i11++) {
                TLRPC.Document document2 = (TLRPC.Document) hVar.f(tL_messages_stickerSet2.documents.get(i11).f22386id);
                if (document2 != null) {
                    tL_messages_stickerSet2.documents.set(i11, document2);
                    z10 = true;
                }
            }
        }
        if (z10) {
            if (z11) {
                putSetToCache(tL_messages_stickerSet2);
                return;
            }
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            int i12 = stickerSet.masks ? 1 : stickerSet.emojis ? 5 : 0;
            putStickersToCache(i12, this.stickerSets[i12], this.loadDate[i12], this.loadHash[i12]);
            if ("AnimatedEmojies".equals(tL_messages_stickerSet.set.short_name)) {
                putStickersToCache(4, this.stickerSets[4], this.loadDate[4], this.loadHash[4]);
            }
        }
    }

    public void saveDraft(long j10, int i10, CharSequence charSequence, ArrayList<TLRPC.MessageEntity> arrayList, TLRPC.Message message, boolean z10, long j11) {
        saveDraft(j10, i10, charSequence, arrayList, message, null, null, j11, z10, false);
    }

    public boolean saveToRingtones(TLRPC.Document document) {
        int i10 = 4;
        if (document == null) {
            return false;
        }
        if (this.ringtoneDataStore.c(document.f22386id) != null) {
            return true;
        }
        if (document.size > MessagesController.getInstance(this.currentAccount).ringtoneSizeMax) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax / 1024)));
            return false;
        }
        for (int i11 = 0; i11 < document.attributes.size(); i11++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && documentAttribute.duration > MessagesController.getInstance(this.currentAccount).ringtoneDurationMax) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax)));
                return false;
            }
        }
        TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        saveringtone.f22590id = tL_inputDocument;
        tL_inputDocument.f22392id = document.f22386id;
        tL_inputDocument.file_reference = document.file_reference;
        tL_inputDocument.access_hash = document.access_hash;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(saveringtone, new t1(i10, this, document));
        return true;
    }

    public boolean searchEndReached() {
        boolean[] zArr = this.messagesSearchEndReached;
        return (zArr[0] && this.lastMergeDialogId == 0 && zArr[1]) || this.loadingSearchLocal || this.loadedPredirectedSearchLocal;
    }

    public void searchMessagesInChat(String str, long j10, long j11, int i10, int i11, long j12, TLRPC.User user, TLRPC.Chat chat, ig.q0 q0Var) {
        searchMessagesInChat(str, j10, j11, i10, i11, j12, false, user, chat, true, q0Var);
    }

    public void searchStickerSets(boolean z10, String str, Utilities.Callback<ArrayList<TLRPC.StickerSetCovered>> callback) {
        Object obj;
        if (z10) {
            TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
            tL_messages_searchEmojiStickerSets.f22490q = str;
            obj = tL_messages_searchEmojiStickerSets;
        } else {
            TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = new TLRPC.TL_messages_searchStickerSets();
            tL_messages_searchStickerSets.f22492q = str;
            obj = tL_messages_searchStickerSets;
        }
        getConnectionsManager().sendRequestTyped(obj, new a(), new f4(1, callback));
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

    public void setDraftVoiceRegion(long j10, long j11, float f10, float f11) {
        DraftVoice draftVoice = getDraftVoice(j10, j11);
        if (draftVoice != null) {
            if (Math.abs(draftVoice.left - f10) >= 0.001f || Math.abs(draftVoice.right - f11) >= 0.001f) {
                draftVoice.left = f10;
                draftVoice.right = f11;
                ApplicationLoader.applicationContext.getSharedPreferences("2voicedrafts_" + this.currentAccount, 0).edit().putString(Objects.hash(Long.valueOf(j10), Long.valueOf(j11)) + "", draftVoice.toString()).apply();
            }
        }
    }

    public void setPlaceholderImage(org.telegram.ui.Components.n9 n9Var, String str, String str2, String str3) {
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName.short_name = str;
        getInstance(this.currentAccount).getStickerSet(tL_inputStickerSetShortName, 0, false, new h2(str2, n9Var, str3, 3));
    }

    public void setSearchedPosition(int i10) {
        if (i10 < 0 || i10 >= this.searchResultMessages.size()) {
            return;
        }
        this.lastReturnedNum = i10;
    }

    public void storeTempStickerSet(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.StickerSet stickerSet;
        if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null) {
            return;
        }
        this.stickerSetsById.k(tL_messages_stickerSet, stickerSet.f22407id);
        String str = tL_messages_stickerSet.set.short_name;
        if (str != null) {
            this.stickerSetsByName.put(str.toLowerCase(), tL_messages_stickerSet);
        }
    }

    public CharSequence substring(CharSequence charSequence, int i10, int i11) {
        if (charSequence instanceof SpannableStringBuilder) {
            return charSequence.subSequence(i10, i11);
        }
        return charSequence instanceof SpannedString ? ((SpannedString) charSequence).subSequence(i10, i11) : TextUtils.substring(charSequence, i10, i11);
    }

    public void toggleDraftVoiceOnce(long j10, long j11, boolean z10) {
        DraftVoice draftVoice = getDraftVoice(j10, j11);
        if (draftVoice == null || draftVoice.once == z10) {
            return;
        }
        draftVoice.once = z10;
        ApplicationLoader.applicationContext.getSharedPreferences("2voicedrafts_" + this.currentAccount, 0).edit().putString(Objects.hash(Long.valueOf(j10), Long.valueOf(j11)) + "", draftVoice.toString()).apply();
    }

    public void toggleStickerSet(Context context, TLObject tLObject, int i10, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, boolean z11) {
        toggleStickerSet(context, tLObject, i10, n2Var, z10, z11, null, true);
    }

    public void toggleStickerSets(ArrayList<TLRPC.StickerSet> arrayList, final int i10, final int i11, final org.telegram.ui.ActionBar.n2 n2Var, final boolean z10) {
        int size = arrayList.size();
        ArrayList<TLRPC.InputStickerSet> arrayList2 = new ArrayList<>(size);
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                break;
            }
            TLRPC.StickerSet stickerSet = arrayList.get(i12);
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
            tL_inputStickerSetID.f22400id = stickerSet.f22407id;
            arrayList2.add(tL_inputStickerSetID);
            if (i11 != 0) {
                stickerSet.archived = i11 == 1;
            }
            int size2 = this.stickerSets[i10].size();
            for (int i13 = 0; i13 < size2; i13++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.stickerSets[i10].get(i13);
                if (tL_messages_stickerSet.set.f22407id == tL_inputStickerSetID.f22400id) {
                    this.stickerSets[i10].remove(i13);
                    if (i11 != 2) {
                        this.stickerSetsById.l(tL_messages_stickerSet.set.f22407id);
                        this.installedStickerSetsById.l(tL_messages_stickerSet.set.f22407id);
                        this.stickerSetsByName.remove(tL_messages_stickerSet.set.short_name);
                        break;
                    }
                    this.stickerSets[i10].add(0, tL_messages_stickerSet);
                    break;
                }
            }
            i12++;
        }
        this.loadHash[i10] = calcStickersHash(this.stickerSets[i10]);
        putStickersToCache(i10, this.stickerSets[i10], this.loadDate[i10], this.loadHash[i10]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i10), Boolean.TRUE);
        TLRPC.TL_messages_toggleStickerSets tL_messages_toggleStickerSets = new TLRPC.TL_messages_toggleStickerSets();
        tL_messages_toggleStickerSets.stickersets = arrayList2;
        if (i11 == 0) {
            tL_messages_toggleStickerSets.uninstall = true;
        } else if (i11 == 1) {
            tL_messages_toggleStickerSets.archive = true;
        } else if (i11 == 2) {
            tL_messages_toggleStickerSets.unarchive = true;
        }
        getConnectionsManager().sendRequest(tL_messages_toggleStickerSets, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f20557a.lambda$toggleStickerSets$119(i11, n2Var, z10, i10, tLObject, tL_error);
            }
        });
    }

    public void uninstallShortcut(long j10, int i10) {
        TLRPC.Chat chat;
        TLRPC.User user;
        String name;
        Intent intentCreateIntrnalAttachedBotShortcutIntent;
        try {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 26) {
                ArrayList arrayList = new ArrayList();
                if (i10 == SHORTCUT_TYPE_USER_OR_CHAT) {
                    arrayList.add("sdid_" + j10);
                    arrayList.add("ndid_" + j10);
                }
                if (i10 == SHORTCUT_TYPE_ATTACHED_BOT) {
                    arrayList.add("bdid_" + j10);
                }
                g0.f.o(ApplicationLoader.applicationContext, arrayList);
                if (i11 >= 30) {
                    f9.z.b(ApplicationLoader.applicationContext.getSystemService(f9.z.g())).removeLongLivedShortcuts(arrayList);
                    return;
                }
                return;
            }
            TLRPC.User user2 = null;
            if (!DialogObject.isEncryptedDialog(j10)) {
                if (DialogObject.isUserDialog(j10)) {
                    user = getMessagesController().getUser(Long.valueOf(j10));
                } else if (!DialogObject.isChatDialog(j10)) {
                    return;
                } else {
                    chat = getMessagesController().getChat(Long.valueOf(-j10));
                }
                if (user2 == null || chat != null) {
                    if (user2 != null) {
                        name = chat.title;
                    } else if (i10 == SHORTCUT_TYPE_USER_OR_CHAT) {
                        name = ContactsController.formatName(user2.first_name, user2.last_name);
                    } else if (i10 == SHORTCUT_TYPE_ATTACHED_BOT) {
                        name = user2.first_name;
                    } else {
                        name = "";
                    }
                    if (i10 == SHORTCUT_TYPE_USER_OR_CHAT) {
                        intentCreateIntrnalAttachedBotShortcutIntent = createIntrnalShortcutIntent(j10);
                    } else {
                        intentCreateIntrnalAttachedBotShortcutIntent = createIntrnalAttachedBotShortcutIntent(j10);
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
            TLRPC.EncryptedChat encryptedChat = getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(j10)));
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
            } else if (i10 == SHORTCUT_TYPE_USER_OR_CHAT) {
                name = ContactsController.formatName(user2.first_name, user2.last_name);
            } else if (i10 == SHORTCUT_TYPE_ATTACHED_BOT) {
                name = user2.first_name;
            } else {
                name = "";
            }
            if (i10 == SHORTCUT_TYPE_USER_OR_CHAT) {
                intentCreateIntrnalAttachedBotShortcutIntent = createIntrnalShortcutIntent(j10);
            } else {
                intentCreateIntrnalAttachedBotShortcutIntent = createIntrnalAttachedBotShortcutIntent(j10);
            }
            Intent intent2 = new Intent();
            intent2.putExtra("android.intent.extra.shortcut.INTENT", intentCreateIntrnalAttachedBotShortcutIntent);
            intent2.putExtra("android.intent.extra.shortcut.NAME", name);
            intent2.putExtra("duplicate", false);
            intent2.setAction("com.android.launcher.action.UNINSTALL_SHORTCUT");
            ApplicationLoader.applicationContext.sendBroadcast(intent2);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public void updateAttachMenuBotsInCache() {
        if (getAttachMenuBots() != null) {
            putMenuBotsToCache(getAttachMenuBots(), this.menuBotsUpdateHash, this.menuBotsUpdateDate);
        }
    }

    public void updateBotInfo(long j10, TL_update.TL_updateBotCommands tL_updateBotCommands) {
        TL_bots.BotInfo botInfo = this.botInfos.get(tL_updateBotCommands.bot_id + "_" + j10);
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
        this.ringtoneUploaderHashMap.put(str, new cf.e(str, this.currentAccount));
        cf.d dVar = this.ringtoneDataStore;
        dVar.getClass();
        cf.c cVar = new cf.c();
        cVar.f2577b = str;
        int i10 = dVar.d;
        dVar.d = i10 + 1;
        cVar.f2578c = i10;
        cVar.d = true;
        dVar.f2584e.add(cVar);
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

    public static void addTextStyleRuns(TLRPC.DraftMessage draftMessage, Spannable spannable, int i10) {
        addTextStyleRuns(draftMessage.entities, draftMessage.message, spannable, i10);
    }

    public static long calcDocumentsHash(ArrayList<TLRPC.Document> arrayList, int i10) {
        long jCalcHash = 0;
        if (arrayList == null) {
            return 0L;
        }
        int iMin = Math.min(i10, arrayList.size());
        for (int i11 = 0; i11 < iMin; i11++) {
            TLRPC.Document document = arrayList.get(i11);
            if (document != null) {
                jCalcHash = calcHash(jCalcHash, document.f22386id);
            }
        }
        return jCalcHash;
    }

    private void increaseInlineRating(long j10, boolean z10) {
        TLRPC.TL_topPeer tL_topPeer;
        if (getUserConfig().suggestContacts) {
            UserConfig userConfig = getUserConfig();
            int i10 = z10 ? userConfig.botGuestRatingLoadTime : userConfig.botRatingLoadTime;
            int iMax = i10 != 0 ? Math.max(1, ((int) (System.currentTimeMillis() / 1000)) - i10) : 60;
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
                } else {
                    i11++;
                }
            }
            if (tL_topPeer == null) {
                tL_topPeer = new TLRPC.TL_topPeer();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_topPeer.peer = tL_peerUser;
                tL_peerUser.user_id = j10;
                arrayList.add(tL_topPeer);
            }
            tL_topPeer.rating = Math.exp(iMax / getMessagesController().ratingDecay) + tL_topPeer.rating;
            Collections.sort(arrayList, new q(12));
            if (arrayList.size() > 20) {
                a9.p.s(1, arrayList);
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
        int i12 = i10;
        a0.h hVar2 = new a0.h();
        int i13 = 0;
        while (i13 < tL_messages_allStickers.sets.size()) {
            final TLRPC.StickerSet stickerSet = tL_messages_allStickers.sets.get(i13);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.stickerSetsById.f(stickerSet.f22407id);
            if (tL_messages_stickerSet != null) {
                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
                if (stickerSet2.hash == stickerSet.hash) {
                    stickerSet2.archived = stickerSet.archived;
                    stickerSet2.installed = stickerSet.installed;
                    stickerSet2.official = stickerSet.official;
                    hVar2.k(tL_messages_stickerSet, stickerSet2.f22407id);
                    arrayList.add(tL_messages_stickerSet);
                    if (hVar2.m() == tL_messages_allStickers.sets.size()) {
                        processLoadedStickers(i12, arrayList, false, (int) (System.currentTimeMillis() / 1000), tL_messages_allStickers.hash2);
                    }
                    tL_messages_allStickers2 = tL_messages_allStickers;
                    hVar = hVar2;
                    i11 = i13;
                } else {
                    arrayList.add(null);
                    TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                    tL_messages_getStickerSet.stickerset = tL_inputStickerSetID;
                    tL_inputStickerSetID.f22400id = stickerSet.f22407id;
                    tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                    tL_messages_allStickers2 = tL_messages_allStickers;
                    hVar = hVar2;
                    i11 = i13;
                    final int i14 = i12;
                    i12 = i14;
                    getConnectionsManager().sendRequest(tL_messages_getStickerSet, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            this.f21702a.lambda$processLoadStickersResponse$74(arrayList, i11, hVar, stickerSet, tL_messages_allStickers2, i14, tLObject, tL_error);
                        }
                    });
                }
            } else {
                arrayList.add(null);
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet2 = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                tL_messages_getStickerSet2.stickerset = tL_inputStickerSetID2;
                tL_inputStickerSetID2.f22400id = stickerSet.f22407id;
                tL_inputStickerSetID2.access_hash = stickerSet.access_hash;
                tL_messages_allStickers2 = tL_messages_allStickers;
                hVar = hVar2;
                i11 = i13;
                final int i15 = i12;
                i12 = i15;
                getConnectionsManager().sendRequest(tL_messages_getStickerSet2, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        this.f21702a.lambda$processLoadStickersResponse$74(arrayList, i11, hVar, stickerSet, tL_messages_allStickers2, i15, tLObject, tL_error);
                    }
                });
            }
            i13 = i11 + 1;
            hVar2 = hVar;
            tL_messages_allStickers = tL_messages_allStickers2;
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    private void processLoadedStickers(int i10, ArrayList<TLRPC.TL_messages_stickerSet> arrayList, boolean z10, int i11, long j10, Runnable runnable) {
        AndroidUtilities.runOnUIThread(new n8(this, i10, 0));
        Utilities.stageQueue.postRunnable(new o8(this, z10, arrayList, i11, j10, i10, runnable));
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
        AndroidUtilities.runOnUIThread(new c7(this, j10, 2));
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
            getMessagesStorage().getStorageQueue().postRunnable(new b8(this, str, 3));
        }
    }

    public void getEmojiSuggestions(String[] strArr, String str, boolean z10, KeywordResultCallback keywordResultCallback, CountDownLatch countDownLatch, boolean z11) {
        getEmojiSuggestions(strArr, str, z10, keywordResultCallback, countDownLatch, z11, false, false, null);
    }

    public ArrayList<TLRPC.MessageEntity> getEntities(CharSequence[] charSequenceArr, boolean z10, boolean z11) {
        int i10;
        int i11;
        int i12;
        ArrayList<TLRPC.MessageEntity> arrayList = null;
        if (charSequenceArr != null && charSequenceArr[0] != null) {
            int i13 = -1;
            boolean z12 = false;
            int i14 = 0;
            loop0: while (true) {
                i10 = -1;
                while (true) {
                    if (!z11) {
                        break loop0;
                    }
                    int iIndexOf = TextUtils.indexOf(charSequenceArr[0], !z12 ? "`" : "```", i14);
                    if (iIndexOf == i13) {
                        break loop0;
                    }
                    if (i10 != i13) {
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                        }
                        for (int i15 = (z12 ? 3 : 1) + iIndexOf; i15 < charSequenceArr[0].length() && charSequenceArr[0].charAt(i15) == '`'; i15++) {
                            iIndexOf++;
                        }
                        i11 = (z12 ? 3 : 1) + iIndexOf;
                        if (!z12) {
                            int i16 = i10 + 1;
                            if (i16 == iIndexOf) {
                                break;
                            }
                            CharSequence charSequence = charSequenceArr[0];
                            if (!(charSequence instanceof Spanned) || ((CodeHighlighting.Span[]) ((Spanned) charSequence).getSpans(Utilities.clamp(i10, charSequence.length(), 0), Utilities.clamp(i16, charSequenceArr[0].length(), 0), CodeHighlighting.Span.class)).length <= 0) {
                                CharSequence charSequenceSubstring = substring(charSequenceArr[0], 0, i10);
                                CharSequence charSequenceSubstring2 = substring(charSequenceArr[0], i16, iIndexOf);
                                CharSequence charSequence2 = charSequenceArr[0];
                                charSequenceArr[0] = AndroidUtilities.concat(charSequenceSubstring, charSequenceSubstring2, substring(charSequence2, iIndexOf + 1, charSequence2.length()));
                                TLRPC.MessageEntity tL_messageEntityCode = new TLRPC.TL_messageEntityCode();
                                tL_messageEntityCode.offset = i10;
                                tL_messageEntityCode.length = (iIndexOf - i10) - 1;
                                arrayList.add(tL_messageEntityCode);
                                i11 -= 2;
                                break;
                            }
                            i14 = i11;
                            i13 = -1;
                        } else {
                            char cCharAt = i10 > 0 ? charSequenceArr[0].charAt(i10 - 1) : (char) 0;
                            int i17 = (cCharAt == ' ' || cCharAt == '\n') ? 1 : 0;
                            int i18 = i10 + 3;
                            int iIndexOf2 = TextUtils.indexOf(charSequenceArr[0], '\n', i18);
                            String strSubstring = (iIndexOf2 < 0 || iIndexOf2 - i18 <= 0) ? "" : charSequenceArr[0].toString().substring(i18, iIndexOf2);
                            CharSequence charSequenceSubstring3 = substring(charSequenceArr[0], 0, i10 - i17);
                            int length = strSubstring.length() + i18 + (!strSubstring.isEmpty());
                            if (length >= 0 && length < charSequenceArr[0].length() && length <= iIndexOf) {
                                CharSequence charSequenceSubstring4 = substring(charSequenceArr[0], length, iIndexOf);
                                int i19 = iIndexOf + 3;
                                char cCharAt2 = i19 < charSequenceArr[0].length() ? charSequenceArr[0].charAt(i19) : (char) 0;
                                CharSequence charSequence3 = charSequenceArr[0];
                                CharSequence charSequenceSubstring5 = substring(charSequence3, i19 + ((cCharAt2 == ' ' || cCharAt2 == '\n') ? 1 : 0), charSequence3.length());
                                if (charSequenceSubstring3.length() != 0) {
                                    charSequenceSubstring3 = AndroidUtilities.concat(charSequenceSubstring3, "\n");
                                } else {
                                    i17 = 1;
                                }
                                if (charSequenceSubstring5.length() > 0 && charSequenceSubstring5.charAt(0) != '\n') {
                                    charSequenceSubstring5 = AndroidUtilities.concat("\n", charSequenceSubstring5);
                                }
                                if (charSequenceSubstring4.length() <= 0 || charSequenceSubstring4.charAt(charSequenceSubstring4.length() - 1) != '\n') {
                                    i12 = 0;
                                } else {
                                    charSequenceSubstring4 = substring(charSequenceSubstring4, 0, charSequenceSubstring4.length() - 1);
                                    i12 = 1;
                                }
                                if (!TextUtils.isEmpty(charSequenceSubstring4)) {
                                    if (charSequenceSubstring4.length() > 1 && charSequenceSubstring4.charAt(0) == '\n') {
                                        charSequenceSubstring4 = charSequenceSubstring4.subSequence(1, charSequenceSubstring4.length());
                                        iIndexOf--;
                                    }
                                    charSequenceArr[0] = AndroidUtilities.concat(charSequenceSubstring3, charSequenceSubstring4, charSequenceSubstring5);
                                    TLRPC.MessageEntity tL_messageEntityPre = new TLRPC.TL_messageEntityPre();
                                    tL_messageEntityPre.offset = (i17 ^ 1) + i10;
                                    tL_messageEntityPre.length = ((((iIndexOf - i10) - 3) - (strSubstring.length() + (!strSubstring.isEmpty()))) + (i17 ^ 1)) - i12;
                                    if (TextUtils.isEmpty(strSubstring) || strSubstring.trim().length() == 0) {
                                        strSubstring = "";
                                    }
                                    tL_messageEntityPre.language = strSubstring;
                                    arrayList.add(tL_messageEntityPre);
                                    i11 -= 6;
                                    break;
                                }
                                break;
                            }
                            i14 = i11;
                            i13 = -1;
                        }
                    } else {
                        z12 = charSequenceArr[0].length() - iIndexOf > 2 && charSequenceArr[0].charAt(iIndexOf + 1) == '`' && charSequenceArr[0].charAt(iIndexOf + 2) == '`';
                        i10 = iIndexOf;
                        i14 = iIndexOf + (z12 ? 3 : 1);
                    }
                }
                i14 = i11;
                i13 = -1;
                z12 = false;
            }
            if (i10 != i13 && z12) {
                CharSequence charSequenceSubstring6 = substring(charSequenceArr[0], 0, i10);
                CharSequence charSequence4 = charSequenceArr[0];
                charSequenceArr[0] = AndroidUtilities.concat(charSequenceSubstring6, substring(charSequence4, i10 + 2, charSequence4.length()));
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
                yz0[] yz0VarArr = (yz0[]) spanned.getSpans(0, charSequence5.length(), yz0.class);
                if (yz0VarArr != null && yz0VarArr.length > 0) {
                    for (yz0 yz0Var : yz0VarArr) {
                        int spanStart = spanned.getSpanStart(yz0Var);
                        int spanEnd = spanned.getSpanEnd(yz0Var);
                        if (!checkInclusion(spanStart, arrayList, false) && !checkInclusion(spanEnd, arrayList, true) && !checkIntersection(spanStart, spanEnd, arrayList)) {
                            if (arrayList == null) {
                                arrayList = new ArrayList<>();
                            }
                            addStyle(yz0Var.f35101b.f34734a, spanStart, spanEnd, arrayList);
                        }
                    }
                }
                u41[] u41VarArr = (u41[]) spanned.getSpans(0, charSequenceArr[0].length(), u41.class);
                if (u41VarArr != null && u41VarArr.length > 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    for (int i20 = 0; i20 < u41VarArr.length; i20++) {
                        TLRPC.TL_inputMessageEntityMentionName tL_inputMessageEntityMentionName = new TLRPC.TL_inputMessageEntityMentionName();
                        TLRPC.InputUser inputUser = getMessagesController().getInputUser(Utilities.parseLong(u41VarArr[i20].getURL()).longValue());
                        tL_inputMessageEntityMentionName.user_id = inputUser;
                        if (inputUser != null) {
                            tL_inputMessageEntityMentionName.offset = spanned.getSpanStart(u41VarArr[i20]);
                            int iMin = Math.min(spanned.getSpanEnd(u41VarArr[i20]), charSequenceArr[0].length());
                            int i21 = tL_inputMessageEntityMentionName.offset;
                            int i22 = iMin - i21;
                            tL_inputMessageEntityMentionName.length = i22;
                            if (charSequenceArr[0].charAt((i21 + i22) - 1) == ' ') {
                                tL_inputMessageEntityMentionName.length--;
                            }
                            arrayList.add(tL_inputMessageEntityMentionName);
                        }
                    }
                }
                t41[] t41VarArr = (t41[]) spanned.getSpans(0, charSequenceArr[0].length(), t41.class);
                if (t41VarArr != null && t41VarArr.length > 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    for (int i23 = 0; i23 < t41VarArr.length; i23++) {
                        TLRPC.MessageEntity tL_messageEntityTextUrl = new TLRPC.TL_messageEntityTextUrl();
                        tL_messageEntityTextUrl.offset = spanned.getSpanStart(t41VarArr[i23]);
                        tL_messageEntityTextUrl.length = Math.min(spanned.getSpanEnd(t41VarArr[i23]), charSequenceArr[0].length()) - tL_messageEntityTextUrl.offset;
                        tL_messageEntityTextUrl.url = t41VarArr[i23].getURL();
                        arrayList.add(tL_messageEntityTextUrl);
                        xz0 xz0Var = t41VarArr[i23].f32651a;
                        if (xz0Var != null) {
                            int i24 = xz0Var.f34734a;
                            int i25 = tL_messageEntityTextUrl.offset;
                            addStyle(i24, i25, tL_messageEntityTextUrl.length + i25, arrayList);
                        }
                    }
                }
                org.telegram.ui.Components.t5[] t5VarArr = (org.telegram.ui.Components.t5[]) spanned.getSpans(0, charSequenceArr[0].length(), org.telegram.ui.Components.t5.class);
                if (t5VarArr != null && t5VarArr.length > 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    ArrayList<TLRPC.MessageEntity> arrayList2 = arrayList;
                    for (org.telegram.ui.Components.t5 t5Var : t5VarArr) {
                        if (t5Var != null) {
                            try {
                                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                                tL_messageEntityCustomEmoji.offset = spanned.getSpanStart(t5Var);
                                tL_messageEntityCustomEmoji.length = Math.min(spanned.getSpanEnd(t5Var), charSequenceArr[0].length()) - tL_messageEntityCustomEmoji.offset;
                                tL_messageEntityCustomEmoji.document_id = t5Var.getDocumentId();
                                tL_messageEntityCustomEmoji.document = t5Var.document;
                                arrayList2.add(tL_messageEntityCustomEmoji);
                            } catch (Exception e9) {
                                FileLog.e(e9);
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
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                        }
                    }
                    arrayList = arrayList3;
                }
                hi0[] hi0VarArr = (hi0[]) spanned.getSpans(0, charSequenceArr[0].length(), hi0.class);
                if (hi0VarArr != null && hi0VarArr.length > 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    ArrayList<TLRPC.MessageEntity> arrayList4 = arrayList;
                    for (hi0 hi0Var : hi0VarArr) {
                        if (hi0Var != null) {
                            try {
                                TLRPC.MessageEntity tL_messageEntityBlockquote = new TLRPC.TL_messageEntityBlockquote();
                                tL_messageEntityBlockquote.offset = spanned.getSpanStart(hi0Var);
                                tL_messageEntityBlockquote.length = Math.min(spanned.getSpanEnd(hi0Var), charSequenceArr[0].length()) - tL_messageEntityBlockquote.offset;
                                tL_messageEntityBlockquote.collapsed = hi0Var.f29029e;
                                arrayList4.add(tL_messageEntityBlockquote);
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                        }
                    }
                    arrayList = arrayList4;
                }
                v00[] v00VarArr = (v00[]) spanned.getSpans(0, charSequenceArr[0].length(), v00.class);
                if (v00VarArr != null && v00VarArr.length > 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    ArrayList<TLRPC.MessageEntity> arrayList5 = arrayList;
                    for (v00 v00Var : v00VarArr) {
                        if (v00Var != null) {
                            try {
                                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
                                tL_messageEntityFormattedDate.offset = spanned.getSpanStart(v00Var);
                                tL_messageEntityFormattedDate.length = Math.min(spanned.getSpanEnd(v00Var), charSequenceArr[0].length()) - tL_messageEntityFormattedDate.offset;
                                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate2 = v00Var.f33240b;
                                tL_messageEntityFormattedDate.relative = tL_messageEntityFormattedDate2.relative;
                                tL_messageEntityFormattedDate.short_time = tL_messageEntityFormattedDate2.short_time;
                                tL_messageEntityFormattedDate.long_time = tL_messageEntityFormattedDate2.long_time;
                                tL_messageEntityFormattedDate.long_date = tL_messageEntityFormattedDate2.long_date;
                                tL_messageEntityFormattedDate.short_date = tL_messageEntityFormattedDate2.short_date;
                                tL_messageEntityFormattedDate.day_of_week = tL_messageEntityFormattedDate2.day_of_week;
                                tL_messageEntityFormattedDate.date = tL_messageEntityFormattedDate2.date;
                                arrayList5.add(tL_messageEntityFormattedDate);
                            } catch (Exception e12) {
                                FileLog.e(e12);
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
                        for (int i26 = 0; i26 < uRLSpanArr.length; i26++) {
                            URLSpan uRLSpan = uRLSpanArr[i26];
                            if (!(uRLSpan instanceof t41) && !(uRLSpan instanceof u41) && !(uRLSpan instanceof v00)) {
                                TLRPC.MessageEntity tL_messageEntityUrl = new TLRPC.TL_messageEntityUrl();
                                tL_messageEntityUrl.offset = spanned.getSpanStart(uRLSpanArr[i26]);
                                tL_messageEntityUrl.length = Math.min(spanned.getSpanEnd(uRLSpanArr[i26]), charSequenceArr[0].length()) - tL_messageEntityUrl.offset;
                                tL_messageEntityUrl.url = uRLSpanArr[i26].getURL();
                                arrayList.add(tL_messageEntityUrl);
                                spannable.removeSpan(uRLSpanArr[i26]);
                            }
                        }
                    }
                }
            }
            CharSequence charSequenceSubSequence = charSequenceArr[0];
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (z11) {
                charSequenceSubSequence = parsePattern(parsePattern(parsePattern(charSequenceSubSequence, BOLD_PATTERN, arrayList, new b(22)), ITALIC_PATTERN, arrayList, new b(23)), SPOILER_PATTERN, arrayList, new b(24));
                if (z10) {
                    charSequenceSubSequence = parsePattern(charSequenceSubSequence, STRIKE_PATTERN, arrayList, new b(25));
                }
            }
            while (charSequenceSubSequence.length() > 0 && (charSequenceSubSequence.charAt(0) == '\n' || charSequenceSubSequence.charAt(0) == ' ')) {
                int i27 = 1;
                charSequenceSubSequence = charSequenceSubSequence.subSequence(1, charSequenceSubSequence.length());
                int i28 = 0;
                while (i28 < arrayList.size()) {
                    TLRPC.MessageEntity messageEntity = arrayList.get(i28);
                    int i29 = messageEntity.offset;
                    if (i29 == 0) {
                        messageEntity.length -= i27;
                    }
                    messageEntity.offset = Math.max(0, i29 - 1);
                    i28++;
                    i27 = 1;
                }
            }
            while (charSequenceSubSequence.length() > 0 && (charSequenceSubSequence.charAt(charSequenceSubSequence.length() - 1) == '\n' || charSequenceSubSequence.charAt(charSequenceSubSequence.length() - 1) == ' ')) {
                charSequenceSubSequence = charSequenceSubSequence.subSequence(0, charSequenceSubSequence.length() - 1);
                for (int i30 = 0; i30 < arrayList.size(); i30++) {
                    TLRPC.MessageEntity messageEntity2 = arrayList.get(i30);
                    if (messageEntity2.offset + messageEntity2.length > charSequenceSubSequence.length()) {
                        messageEntity2.length--;
                    }
                }
            }
            charSequenceArr[0] = charSequenceSubSequence;
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

    public void installShortcut(long j10, int i10, Utilities.Callback<Boolean> callback) {
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.User user2;
        String name;
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.FileLocation fileLocation;
        String str;
        TLRPC.FileLocation fileLocation2;
        boolean z10;
        PendingIntent pendingIntent;
        Bitmap bitmapDecodeFile;
        int iDp;
        Canvas canvas;
        org.telegram.ui.Components.y8 y8Var;
        Intent intent;
        String str2;
        g0.c cVar;
        PendingIntent broadcast;
        Intent[] intentArr;
        TLRPC.UserProfilePhoto userProfilePhoto;
        String string;
        TLRPC.UserProfilePhoto userProfilePhoto2;
        try {
            Intent intentCreateIntrnalShortcutIntent = i10 == SHORTCUT_TYPE_USER_OR_CHAT ? createIntrnalShortcutIntent(j10) : createIntrnalAttachedBotShortcutIntent(j10);
            if (intentCreateIntrnalShortcutIntent == null) {
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                    return;
                }
                return;
            }
            if (!DialogObject.isEncryptedDialog(j10)) {
                if (DialogObject.isUserDialog(j10)) {
                    user2 = getMessagesController().getUser(Long.valueOf(j10));
                } else {
                    if (!DialogObject.isChatDialog(j10)) {
                        if (callback != null) {
                            callback.run(Boolean.FALSE);
                            return;
                        }
                        return;
                    }
                    chat = getMessagesController().getChat(Long.valueOf(-j10));
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
                    z10 = false;
                } else if (i10 == SHORTCUT_TYPE_ATTACHED_BOT) {
                    name = UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10)));
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
                    z10 = false;
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
                        z10 = false;
                    }
                    str = string;
                    fileLocation2 = null;
                    z10 = true;
                }
                if (z10 && fileLocation2 == null) {
                    pendingIntent = null;
                    bitmapDecodeFile = null;
                } else {
                    if (z10) {
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
                            if (i10 == SHORTCUT_TYPE_USER_OR_CHAT) {
                                str2 = "sdid_";
                            } else {
                                str2 = "bdid_";
                            }
                            Context context = ApplicationLoader.applicationContext;
                            cVar = new g0.c();
                            cVar.f6331a = context;
                            cVar.f6332b = str2 + j10;
                            cVar.f6334e = str;
                            cVar.f6333c = new Intent[]{intentCreateIntrnalShortcutIntent};
                            if (bitmapDecodeFile != null) {
                                cVar.h = IconCompat.c(bitmapDecodeFile);
                            } else if (user != null) {
                                if (user.bot) {
                                    cVar.h = IconCompat.d(ApplicationLoader.applicationContext, R.drawable.book_bot);
                                } else {
                                    cVar.h = IconCompat.d(ApplicationLoader.applicationContext, R.drawable.book_user);
                                }
                            } else if (ChatObject.isChannel(chat)) {
                                cVar.h = IconCompat.d(ApplicationLoader.applicationContext, R.drawable.book_group);
                            } else {
                                cVar.h = IconCompat.d(ApplicationLoader.applicationContext, R.drawable.book_group);
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
                            if (TextUtils.isEmpty(cVar.f6334e)) {
                                throw new IllegalArgumentException("Shortcut must have a non-empty label");
                            }
                            intentArr = cVar.f6333c;
                            if (intentArr != null) {
                            }
                            throw new IllegalArgumentException("Shortcut must have an intent");
                        }
                    }
                    if (z10 && bitmapDecodeFile == null) {
                        pendingIntent = null;
                    } else {
                        try {
                            iDp = AndroidUtilities.dp(58.0f);
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iDp, iDp, Bitmap.Config.ARGB_8888);
                            bitmapCreateBitmap.eraseColor(0);
                            canvas = new Canvas(bitmapCreateBitmap);
                            try {
                                if (z10) {
                                    y8Var = new org.telegram.ui.Components.y8(0, user);
                                    if (UserObject.isReplyUser(user)) {
                                        y8Var.g(12);
                                    } else {
                                        y8Var.g(1);
                                    }
                                    y8Var.setBounds(0, 0, iDp, iDp);
                                    y8Var.draw(canvas);
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
                                int i11 = iDp - iDp2;
                                int iDp3 = i11 - AndroidUtilities.dp(2.0f);
                                int iDp4 = i11 - AndroidUtilities.dp(2.0f);
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
                                        if (i10 == SHORTCUT_TYPE_USER_OR_CHAT) {
                                            str2 = "sdid_";
                                        } else {
                                            str2 = "bdid_";
                                        }
                                        Context context3 = ApplicationLoader.applicationContext;
                                        cVar = new g0.c();
                                        cVar.f6331a = context3;
                                        cVar.f6332b = str2 + j10;
                                        cVar.f6334e = str;
                                        cVar.f6333c = new Intent[]{intentCreateIntrnalShortcutIntent};
                                        if (bitmapDecodeFile != null) {
                                            cVar.h = IconCompat.c(bitmapDecodeFile);
                                        } else if (user != null) {
                                            if (user.bot) {
                                                cVar.h = IconCompat.d(ApplicationLoader.applicationContext, R.drawable.book_bot);
                                            } else {
                                                cVar.h = IconCompat.d(ApplicationLoader.applicationContext, R.drawable.book_user);
                                            }
                                        } else if (ChatObject.isChannel(chat)) {
                                            cVar.h = IconCompat.d(ApplicationLoader.applicationContext, R.drawable.book_group);
                                        } else {
                                            cVar.h = IconCompat.d(ApplicationLoader.applicationContext, R.drawable.book_group);
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
                                        if (TextUtils.isEmpty(cVar.f6334e)) {
                                            throw new IllegalArgumentException("Shortcut must have a non-empty label");
                                        }
                                        intentArr = cVar.f6333c;
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
                                if (i10 == SHORTCUT_TYPE_USER_OR_CHAT) {
                                    str2 = "sdid_";
                                } else {
                                    str2 = "bdid_";
                                }
                                Context context5 = ApplicationLoader.applicationContext;
                                cVar = new g0.c();
                                cVar.f6331a = context5;
                                cVar.f6332b = str2 + j10;
                                cVar.f6334e = str;
                                cVar.f6333c = new Intent[]{intentCreateIntrnalShortcutIntent};
                                if (bitmapDecodeFile != null) {
                                    cVar.h = IconCompat.c(bitmapDecodeFile);
                                } else if (user != null) {
                                    if (user.bot) {
                                        cVar.h = IconCompat.d(ApplicationLoader.applicationContext, R.drawable.book_bot);
                                    } else {
                                        cVar.h = IconCompat.d(ApplicationLoader.applicationContext, R.drawable.book_user);
                                    }
                                } else if (ChatObject.isChannel(chat)) {
                                    cVar.h = IconCompat.d(ApplicationLoader.applicationContext, R.drawable.book_group);
                                } else {
                                    cVar.h = IconCompat.d(ApplicationLoader.applicationContext, R.drawable.book_group);
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
                                if (TextUtils.isEmpty(cVar.f6334e)) {
                                    throw new IllegalArgumentException("Shortcut must have a non-empty label");
                                }
                                intentArr = cVar.f6333c;
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
                if (i10 == SHORTCUT_TYPE_USER_OR_CHAT) {
                    str2 = "sdid_";
                } else {
                    str2 = "bdid_";
                }
                Context context7 = ApplicationLoader.applicationContext;
                cVar = new g0.c();
                cVar.f6331a = context7;
                cVar.f6332b = str2 + j10;
                cVar.f6334e = str;
                cVar.f6333c = new Intent[]{intentCreateIntrnalShortcutIntent};
                if (bitmapDecodeFile != null) {
                    cVar.h = IconCompat.c(bitmapDecodeFile);
                } else if (user != null) {
                    if (user.bot) {
                        cVar.h = IconCompat.d(ApplicationLoader.applicationContext, R.drawable.book_bot);
                    } else {
                        cVar.h = IconCompat.d(ApplicationLoader.applicationContext, R.drawable.book_user);
                    }
                } else if (ChatObject.isChannel(chat) || chat.megagroup) {
                    cVar.h = IconCompat.d(ApplicationLoader.applicationContext, R.drawable.book_group);
                } else {
                    cVar.h = IconCompat.d(ApplicationLoader.applicationContext, R.drawable.book_channel);
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
                if (TextUtils.isEmpty(cVar.f6334e)) {
                    throw new IllegalArgumentException("Shortcut must have a non-empty label");
                }
                intentArr = cVar.f6333c;
                if (intentArr != null || intentArr.length == 0) {
                    throw new IllegalArgumentException("Shortcut must have an intent");
                }
                g0.f.r(context8, cVar, broadcast == null ? pendingIntent : broadcast.getIntentSender());
                return;
            }
            TLRPC.EncryptedChat encryptedChat = getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(j10)));
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
                z10 = false;
            } else if (i10 == SHORTCUT_TYPE_ATTACHED_BOT) {
                name = UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10)));
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
                z10 = false;
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
                    z10 = false;
                }
                str = string;
                fileLocation2 = null;
                z10 = true;
            }
            if (z10) {
                if (z10) {
                    bitmapDecodeFile = BitmapFactory.decodeFile(getFileLoader().getPathToAttach(fileLocation2, true).toString());
                } else {
                    bitmapDecodeFile = null;
                }
                if (z10) {
                    iDp = AndroidUtilities.dp(58.0f);
                    Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(iDp, iDp, Bitmap.Config.ARGB_8888);
                    bitmapCreateBitmap2.eraseColor(0);
                    canvas = new Canvas(bitmapCreateBitmap2);
                    if (z10) {
                        y8Var = new org.telegram.ui.Components.y8(0, user);
                        if (UserObject.isReplyUser(user)) {
                            y8Var.g(12);
                        } else {
                            y8Var.g(1);
                        }
                        y8Var.setBounds(0, 0, iDp, iDp);
                        y8Var.draw(canvas);
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
                    int i12 = iDp - iDp5;
                    int iDp6 = i12 - AndroidUtilities.dp(2.0f);
                    int iDp7 = i12 - AndroidUtilities.dp(2.0f);
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
                    if (z10) {
                        y8Var = new org.telegram.ui.Components.y8(0, user);
                        if (UserObject.isReplyUser(user)) {
                            y8Var.g(12);
                        } else {
                            y8Var.g(1);
                        }
                        y8Var.setBounds(0, 0, iDp, iDp);
                        y8Var.draw(canvas);
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
                    int i13 = iDp - iDp8;
                    int iDp9 = i13 - AndroidUtilities.dp(2.0f);
                    int iDp10 = i13 - AndroidUtilities.dp(2.0f);
                    Bitmap bitmap3 = bitmapDecodeFile;
                    drawable3.setBounds(iDp9, iDp10, iDp9 + iDp8, iDp10 + iDp8);
                    drawable3.draw(canvas);
                    pendingIntent = null;
                    canvas.setBitmap(null);
                    bitmapDecodeFile = bitmapCreateBitmap3;
                }
            } else {
                if (z10) {
                    bitmapDecodeFile = BitmapFactory.decodeFile(getFileLoader().getPathToAttach(fileLocation2, true).toString());
                } else {
                    bitmapDecodeFile = null;
                }
                if (z10) {
                    iDp = AndroidUtilities.dp(58.0f);
                    Bitmap bitmapCreateBitmap4 = Bitmap.createBitmap(iDp, iDp, Bitmap.Config.ARGB_8888);
                    bitmapCreateBitmap4.eraseColor(0);
                    canvas = new Canvas(bitmapCreateBitmap4);
                    if (z10) {
                        y8Var = new org.telegram.ui.Components.y8(0, user);
                        if (UserObject.isReplyUser(user)) {
                            y8Var.g(12);
                        } else {
                            y8Var.g(1);
                        }
                        y8Var.setBounds(0, 0, iDp, iDp);
                        y8Var.draw(canvas);
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
                    int i14 = iDp - iDp11;
                    int iDp12 = i14 - AndroidUtilities.dp(2.0f);
                    int iDp13 = i14 - AndroidUtilities.dp(2.0f);
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
                    if (z10) {
                        y8Var = new org.telegram.ui.Components.y8(0, user);
                        if (UserObject.isReplyUser(user)) {
                            y8Var.g(12);
                        } else {
                            y8Var.g(1);
                        }
                        y8Var.setBounds(0, 0, iDp, iDp);
                        y8Var.draw(canvas);
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
                    int i15 = iDp - iDp14;
                    int iDp15 = i15 - AndroidUtilities.dp(2.0f);
                    int iDp16 = i15 - AndroidUtilities.dp(2.0f);
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
            if (i10 == SHORTCUT_TYPE_USER_OR_CHAT) {
                str2 = "sdid_";
            } else {
                str2 = "bdid_";
            }
            Context context9 = ApplicationLoader.applicationContext;
            cVar = new g0.c();
            cVar.f6331a = context9;
            cVar.f6332b = str2 + j10;
            cVar.f6334e = str;
            cVar.f6333c = new Intent[]{intentCreateIntrnalShortcutIntent};
            if (bitmapDecodeFile != null) {
                cVar.h = IconCompat.c(bitmapDecodeFile);
            } else if (user != null) {
                if (user.bot) {
                    cVar.h = IconCompat.d(ApplicationLoader.applicationContext, R.drawable.book_bot);
                } else {
                    cVar.h = IconCompat.d(ApplicationLoader.applicationContext, R.drawable.book_user);
                }
            } else if (ChatObject.isChannel(chat)) {
                cVar.h = IconCompat.d(ApplicationLoader.applicationContext, R.drawable.book_group);
            } else {
                cVar.h = IconCompat.d(ApplicationLoader.applicationContext, R.drawable.book_group);
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
            if (TextUtils.isEmpty(cVar.f6334e)) {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
            intentArr = cVar.f6333c;
            if (intentArr != null) {
            }
            throw new IllegalArgumentException("Shortcut must have an intent");
        } catch (Exception e9) {
            FileLog.e(e9);
        }
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
            getMessagesStorage().getStorageQueue().postRunnable(new i7(this, 13));
            return;
        }
        TLRPC.TL_messages_getAttachMenuBots tL_messages_getAttachMenuBots = new TLRPC.TL_messages_getAttachMenuBots();
        tL_messages_getAttachMenuBots.hash = z11 ? 0L : this.menuBotsUpdateHash;
        getConnectionsManager().sendRequest(tL_messages_getAttachMenuBots, new t1(5, this, runnable));
    }

    public void loadBotInfo(long j10, long j11, boolean z10, int i10, Utilities.Callback<TL_bots.BotInfo> callback) {
        if (z10) {
            TL_bots.BotInfo botInfo = this.botInfos.get(j10 + "_" + j11);
            if (botInfo != null) {
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botInfoDidLoad, botInfo, Integer.valueOf(i10));
                return;
            }
        }
        getMessagesStorage().getStorageQueue().postRunnable(new q9(this, j10, j11, callback, i10, 0));
    }

    public void loadBotKeyboard(MessagesStorage.TopicKey topicKey, boolean z10) {
        TLRPC.Message message = this.botKeyboards.get(topicKey);
        if (message != null) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botKeyboardDidLoad, message, topicKey);
        } else {
            getMessagesStorage().getStorageQueue().postRunnable(new n6(this, topicKey, z10, 3));
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
        TLRPC.StickerSet stickerSet2;
        if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null) {
            return;
        }
        this.stickerSetsById.k(tL_messages_stickerSet, stickerSet.f22407id);
        if (!TextUtils.isEmpty(tL_messages_stickerSet.set.short_name)) {
            this.stickerSetsByName.put(tL_messages_stickerSet.set.short_name.toLowerCase(), tL_messages_stickerSet);
        }
        int i10 = 0;
        while (true) {
            ArrayList<TLRPC.TL_messages_stickerSet>[] arrayListArr = this.stickerSets;
            if (i10 >= arrayListArr.length) {
                break;
            }
            ArrayList<TLRPC.TL_messages_stickerSet> arrayList = arrayListArr[i10];
            if (arrayList != null) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayList.get(i11);
                    if (tL_messages_stickerSet2 != null && (stickerSet2 = tL_messages_stickerSet2.set) != null && stickerSet2.f22407id == tL_messages_stickerSet.set.f22407id) {
                        arrayList.set(i11, tL_messages_stickerSet);
                    }
                }
            }
            i10++;
        }
        if (this.groupStickerSets.d(tL_messages_stickerSet.set.f22407id)) {
            this.groupStickerSets.k(tL_messages_stickerSet, tL_messages_stickerSet.set.f22407id);
        }
        saveStickerSetIntoCache(tL_messages_stickerSet);
        TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet.set;
        int i12 = stickerSet3.masks ? 1 : stickerSet3.emojis ? 5 : 0;
        if (z10) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i12), Boolean.TRUE);
        }
    }

    public void saveDraft(long j10, long j11, CharSequence charSequence, ArrayList<TLRPC.MessageEntity> arrayList, TLRPC.Message message, hn hnVar, TLRPC.SuggestedPost suggestedPost, long j12, boolean z10, boolean z11) {
        saveDraft(j10, j11, charSequence, arrayList, message, hnVar, suggestedPost, j12, z10, z11, null);
    }

    public void searchMessagesInChat(String str, final long j10, final long j11, final int i10, final int i11, final long j12, boolean z10, final TLRPC.User user, final TLRPC.Chat chat, final boolean z11, final ig.q0 q0Var) {
        String str2;
        long j13;
        int id2;
        long j14;
        int i12;
        boolean z12;
        boolean[] zArr;
        char c10;
        final TLRPC.TL_messages_search tL_messages_search;
        TLRPC.InputPeer inputPeer;
        String str3;
        int i13;
        boolean z13;
        final int i14;
        boolean z14 = !z10;
        if (this.reqId != 0) {
            this.loadingMoreSearchMessages = false;
            getConnectionsManager().cancelRequest(this.reqId, true);
            this.reqId = 0;
        }
        if (this.mergeReqId != 0) {
            getConnectionsManager().cancelRequest(this.mergeReqId, true);
            this.mergeReqId = 0;
        }
        if (str != null) {
            if (!z10) {
                boolean[] zArr2 = this.messagesSearchEndReached;
                zArr2[1] = false;
                zArr2[0] = false;
                int[] iArr = this.messagesSearchCount;
                iArr[1] = 0;
                iArr[0] = 0;
                this.searchResultMessages.clear();
                this.searchLocalResultMessages.clear();
                this.searchServerResultMessagesMap[0].clear();
                this.searchServerResultMessagesMap[1].clear();
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatSearchResultsLoading, Integer.valueOf(i10));
            }
            str2 = str;
            j13 = j10;
            id2 = 0;
        } else {
            if (this.searchResultMessages.isEmpty()) {
                this.loadingMoreSearchMessages = false;
                return;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    this.loadingMoreSearchMessages = false;
                    return;
                }
                int i15 = this.lastReturnedNum - 1;
                this.lastReturnedNum = i15;
                if (i15 < 0) {
                    this.lastReturnedNum = 0;
                    return;
                }
                if (i15 >= this.searchResultMessages.size()) {
                    this.lastReturnedNum = this.searchResultMessages.size() - 1;
                }
                MessageObject messageObject = this.searchResultMessages.get(this.lastReturnedNum);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatSearchResultsAvailable, Integer.valueOf(i10), Integer.valueOf(messageObject.getId()), Integer.valueOf(getMask()), Long.valueOf(messageObject.getDialogId()), Integer.valueOf(this.lastReturnedNum), Integer.valueOf(getSearchCount()), Boolean.valueOf(z11));
                this.loadingMoreSearchMessages = false;
                return;
            }
            int i16 = this.lastReturnedNum + 1;
            this.lastReturnedNum = i16;
            if (i16 < this.searchResultMessages.size()) {
                MessageObject messageObject2 = this.searchResultMessages.get(this.lastReturnedNum);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatSearchResultsAvailable, Integer.valueOf(i10), Integer.valueOf(messageObject2.getId()), Integer.valueOf(getMask()), Long.valueOf(messageObject2.getDialogId()), Integer.valueOf(this.lastReturnedNum), Integer.valueOf(getSearchCount()), Boolean.valueOf(z11));
                this.loadingMoreSearchMessages = false;
                return;
            }
            boolean[] zArr3 = this.messagesSearchEndReached;
            if (zArr3[0] && j11 == 0 && zArr3[1]) {
                this.lastReturnedNum--;
                this.loadingMoreSearchMessages = false;
                return;
            }
            String str4 = this.lastSearchQuery;
            MessageObject messageObject3 = (MessageObject) i0.a.i(1, this.searchResultMessages);
            if (messageObject3.getDialogId() != j10 || this.messagesSearchEndReached[0]) {
                id2 = messageObject3.getDialogId() == j11 ? messageObject3.getId() : 0;
                this.messagesSearchEndReached[1] = false;
                j13 = j11;
            } else {
                id2 = messageObject3.getId();
                j13 = j10;
            }
            str2 = str4;
            z14 = false;
        }
        if (str2 != null) {
            i12 = 0;
            j14 = 0;
            z12 = str2.trim().startsWith("#") || str2.trim().startsWith("$");
            zArr = this.messagesSearchEndReached;
            if (zArr[i12] && !zArr[1] && j11 != j14) {
                j13 = j11;
            }
            if (j13 == j10 || !z14) {
                c10 = 1;
            } else {
                if (j11 != j14) {
                    TLRPC.InputPeer inputPeer2 = getMessagesController().getInputPeer(j11);
                    if (inputPeer2 == null) {
                        return;
                    }
                    final TLRPC.TL_messages_search tL_messages_search2 = new TLRPC.TL_messages_search();
                    tL_messages_search2.peer = inputPeer2;
                    this.lastMergeDialogId = j11;
                    tL_messages_search2.limit = 1;
                    tL_messages_search2.f22489q = str2;
                    if (user != null) {
                        tL_messages_search2.from_id = MessagesController.getInputPeer(user);
                        tL_messages_search2.flags |= 1;
                    } else if (chat != null) {
                        tL_messages_search2.from_id = MessagesController.getInputPeer(chat);
                        tL_messages_search2.flags |= 1;
                    }
                    if (j12 != j14) {
                        if (j10 == getUserConfig().getClientUserId() || getMessagesStorage().isMonoForum(j13)) {
                            tL_messages_search2.saved_peer_id = getMessagesController().getInputPeer(j12);
                            tL_messages_search2.flags |= 4;
                        } else {
                            tL_messages_search2.top_msg_id = (int) j12;
                            tL_messages_search2.flags |= 2;
                        }
                    }
                    if (q0Var != null) {
                        tL_messages_search2.saved_reaction.add(q0Var.g());
                        tL_messages_search2.flags |= 8;
                    }
                    tL_messages_search2.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                    this.mergeReqId = getConnectionsManager().sendRequest(tL_messages_search2, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            this.f20226a.lambda$searchMessagesInChat$121(j11, tL_messages_search2, j10, i10, i11, j12, user, chat, z11, q0Var, tLObject, tL_error);
                        }
                    }, 2);
                    return;
                }
                c10 = 1;
                this.lastMergeDialogId = j14;
                zArr[1] = true;
                this.messagesSearchCount[1] = i12;
            }
            tL_messages_search = new TLRPC.TL_messages_search();
            inputPeer = getMessagesController().getInputPeer(j13);
            tL_messages_search.peer = inputPeer;
            if (inputPeer == null) {
                this.loadingMoreSearchMessages = false;
                return;
            }
            this.lastGuid = i10;
            this.lastDialogId = j10;
            this.lastSearchUser = user;
            this.lastSearchChat = chat;
            this.lastReplyMessageId = j12;
            this.lastReaction = q0Var;
            tL_messages_search.limit = 21;
            if (str2 != 0) {
                str3 = str2;
            } else {
                str3 = "";
            }
            tL_messages_search.f22489q = str3;
            tL_messages_search.offset_id = id2;
            if (user != 0) {
                tL_messages_search.from_id = MessagesController.getInputPeer(user);
                tL_messages_search.flags |= 1;
            } else if (chat != 0) {
                tL_messages_search.from_id = MessagesController.getInputPeer(chat);
                tL_messages_search.flags |= 1;
            }
            this.loadingSearchLocal = false;
            this.loadedPredirectedSearchLocal = false;
            i13 = this.lastReqId + 1;
            this.lastReqId = i13;
            if (j10 == getUserConfig().getClientUserId()) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13 || q0Var == 0 || !z14) {
                i14 = i13;
            } else {
                this.lastReturnedNum = 0;
                this.searchServerResultMessages.clear();
                this.searchServerResultMessagesMap[0].clear();
                this.searchServerResultMessagesMap[c10].clear();
                final int savedTagCount = getMessagesController().getSavedTagCount(this.lastReplyMessageId, q0Var);
                this.messagesLocalSearchCount = TextUtils.isEmpty(tL_messages_search.f22489q) ? savedTagCount : 0;
                this.loadingSearchLocal = true;
                this.loadedPredirectedSearchLocal = false;
                MessagesStorage messagesStorage = getMessagesStorage();
                TLRPC.Reaction reactionG = q0Var.g();
                long j15 = this.lastReplyMessageId;
                ArrayList<MessageObject> arrayList = this.searchLocalResultMessages;
                i14 = i13;
                messagesStorage.searchSavedByTag(reactionG, j15, str2, 300, arrayList == null ? 0 : arrayList.size(), new Utilities.Callback4() {
                    @Override
                    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                        this.f20349a.lambda$searchMessagesInChat$122(i14, savedTagCount, i10, j10, (ArrayList) obj, (ArrayList) obj2, (ArrayList) obj3, (ArrayList) obj4);
                    }
                }, true);
            }
            final String str5 = str2;
            if (this.lastReplyMessageId != 0) {
                if (j13 != getUserConfig().getClientUserId() || getMessagesStorage().isMonoForum(j13)) {
                    tL_messages_search.saved_peer_id = getMessagesController().getInputPeer(this.lastReplyMessageId);
                    tL_messages_search.flags |= 4;
                } else {
                    tL_messages_search.top_msg_id = (int) this.lastReplyMessageId;
                    tL_messages_search.flags |= 2;
                }
            }
            if (q0Var != 0) {
                tL_messages_search.saved_reaction.add(q0Var.g());
                tL_messages_search.flags |= 8;
            }
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
            this.lastSearchQuery = str5;
            final int i17 = i14;
            final boolean z15 = z12;
            final long j16 = j13;
            final boolean z16 = z13;
            this.reqId = getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f20456a.lambda$searchMessagesInChat$125(tL_messages_search, z16, str5, z15, i17, z11, j16, j10, i10, j11, j12, user, chat, tLObject, tL_error);
                }
            }, 2);
        }
        j14 = 0;
        i12 = 0;
        zArr = this.messagesSearchEndReached;
        if (zArr[i12]) {
            j13 = j11;
        }
        if (j13 == j10) {
            c10 = 1;
        } else {
            c10 = 1;
        }
        tL_messages_search = new TLRPC.TL_messages_search();
        inputPeer = getMessagesController().getInputPeer(j13);
        tL_messages_search.peer = inputPeer;
        if (inputPeer == null) {
            this.loadingMoreSearchMessages = false;
            return;
        }
        this.lastGuid = i10;
        this.lastDialogId = j10;
        this.lastSearchUser = user;
        this.lastSearchChat = chat;
        this.lastReplyMessageId = j12;
        this.lastReaction = q0Var;
        tL_messages_search.limit = 21;
        if (str2 != 0) {
            str3 = str2;
        } else {
            str3 = "";
        }
        tL_messages_search.f22489q = str3;
        tL_messages_search.offset_id = id2;
        if (user != 0) {
            tL_messages_search.from_id = MessagesController.getInputPeer(user);
            tL_messages_search.flags |= 1;
        } else if (chat != 0) {
            tL_messages_search.from_id = MessagesController.getInputPeer(chat);
            tL_messages_search.flags |= 1;
        }
        this.loadingSearchLocal = false;
        this.loadedPredirectedSearchLocal = false;
        i13 = this.lastReqId + 1;
        this.lastReqId = i13;
        if (j10 == getUserConfig().getClientUserId()) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13) {
            i14 = i13;
        } else {
            i14 = i13;
        }
        final String str6 = str2;
        if (this.lastReplyMessageId != 0) {
            if (j13 != getUserConfig().getClientUserId()) {
                tL_messages_search.saved_peer_id = getMessagesController().getInputPeer(this.lastReplyMessageId);
                tL_messages_search.flags |= 4;
            } else {
                tL_messages_search.saved_peer_id = getMessagesController().getInputPeer(this.lastReplyMessageId);
                tL_messages_search.flags |= 4;
            }
        }
        if (q0Var != 0) {
            tL_messages_search.saved_reaction.add(q0Var.g());
            tL_messages_search.flags |= 8;
        }
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        this.lastSearchQuery = str6;
        final int i18 = i14;
        final boolean z17 = z12;
        final long j17 = j13;
        final boolean z18 = z13;
        this.reqId = getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f20456a.lambda$searchMessagesInChat$125(tL_messages_search, z18, str6, z17, i18, z11, j17, j10, i10, j11, j12, user, chat, tLObject, tL_error);
            }
        }, 2);
    }

    public SearchStickersKey searchStickers(boolean z10, String str, String str2, Utilities.Callback<ArrayList<TLRPC.Document>> callback, boolean z11) {
        if (callback == null) {
            return null;
        }
        SearchStickersKey searchStickersKey = new SearchStickersKey(z10, str, str2);
        SearchStickersResult searchStickersResult = this.searchStickerResults.get(searchStickersKey);
        if ((searchStickersResult == null || (searchStickersResult.next_offset != null && z11)) && !this.loadingSearchStickersKeys.containsKey(searchStickersKey)) {
            this.loadingSearchStickersKeys.put(searchStickersKey, 0);
            getInstance(this.currentAccount).getEmojiSuggestions(new String[]{str}, str2, true, new a8(this, searchStickersKey, searchStickersResult, callback), false);
            return searchStickersKey;
        }
        if (searchStickersResult != null) {
            callback.run(searchStickersResult.documents);
            return searchStickersKey;
        }
        callback.run(new ArrayList<>());
        return searchStickersKey;
    }

    public void toggleStickerSet(Context context, TLObject tLObject, int i10, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, boolean z11, Runnable runnable, boolean z12) {
        toggleStickerSet(context, tLObject, i10, n2Var, null, z10, z11, runnable, z12);
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
            if (document2.f22386id == document.f22386id && document2.dc_id == document.dc_id) {
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
        TLObject tLObject;
        if (this.loadingStickers[i10]) {
            if (z12) {
                this.scheduledLoadStickers[i10] = new v4(this, i10, z11, callback, 2);
                return;
            } else {
                if (callback != null) {
                    callback.run(null);
                    return;
                }
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
            return;
        }
        if (i10 == 3 || i10 == 6) {
            char c10 = i10 != 6 ? (char) 0 : (char) 1;
            TLRPC.TL_messages_allStickers tL_messages_allStickers = new TLRPC.TL_messages_allStickers();
            tL_messages_allStickers.hash2 = this.loadFeaturedHash[c10];
            int size = this.featuredStickerSets[c10].size();
            for (int i11 = 0; i11 < size; i11++) {
                tL_messages_allStickers.sets.add(this.featuredStickerSets[c10].get(i11).set);
            }
            processLoadStickersResponse(i10, tL_messages_allStickers, new r7(3, callback));
            return;
        }
        if (i10 == 4) {
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
            tL_messages_getStickerSet.stickerset = new TLRPC.TL_inputStickerSetAnimatedEmoji();
            getConnectionsManager().sendRequest(tL_messages_getStickerSet, new wa(this, i10, callback, 3));
            return;
        }
        if (i10 == 0) {
            TLRPC.TL_messages_getAllStickers tL_messages_getAllStickers = new TLRPC.TL_messages_getAllStickers();
            j10 = z11 ? 0L : this.loadHash[i10];
            tL_messages_getAllStickers.hash = j10;
            tLObject = tL_messages_getAllStickers;
        } else if (i10 == 5) {
            TLRPC.TL_messages_getEmojiStickers tL_messages_getEmojiStickers = new TLRPC.TL_messages_getEmojiStickers();
            j10 = z11 ? 0L : this.loadHash[i10];
            tL_messages_getEmojiStickers.hash = j10;
            tLObject = tL_messages_getEmojiStickers;
        } else {
            TLRPC.TL_messages_getMaskStickers tL_messages_getMaskStickers = new TLRPC.TL_messages_getMaskStickers();
            j10 = z11 ? 0L : this.loadHash[i10];
            tL_messages_getMaskStickers.hash = j10;
            tLObject = tL_messages_getMaskStickers;
        }
        getConnectionsManager().sendRequest(tLObject, new hh.v(this, i10, callback, j10, 4));
    }

    public void saveDraft(long j10, long j11, CharSequence charSequence, ArrayList<TLRPC.MessageEntity> arrayList, TLRPC.Message message, hn hnVar, TLRPC.SuggestedPost suggestedPost, long j12, boolean z10, boolean z11, TL_iv.RichMessage richMessage) {
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
            tL_inputReplyToMessage.reply_to_msg_id = message2.f22401id;
            if (hnVar != null) {
                String str = hnVar.f38867i;
                tL_inputReplyToMessage.quote_text = str;
                if (str != null) {
                    tL_inputReplyToMessage.flags |= 20;
                    tL_inputReplyToMessage.quote_offset = hnVar.f38862b;
                }
                ArrayList<TLRPC.MessageEntity> arrayList2 = hnVar.f38868j;
                tL_inputReplyToMessage.quote_entities = arrayList2;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    tL_draftMessage.reply_to.quote_entities = new ArrayList<>(tL_draftMessage.reply_to.quote_entities);
                    tL_draftMessage.reply_to.flags |= 8;
                }
                MessageObject messageObject = hnVar.f38861a;
                if (messageObject != null && messageObject.messageOwner != null) {
                    TLRPC.Peer peer = getMessagesController().getPeer(j10);
                    TLRPC.Peer peer2 = hnVar.f38861a.messageOwner.peer_id;
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

    public void toggleStickerSet(Context context, TLObject tLObject, int i10, org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, boolean z10, boolean z11, Runnable runnable, boolean z12) {
        toggleStickerSet(context, tLObject, null, i10, n2Var, frameLayout, z10, z11, runnable, z12);
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
                    this.f21510a.lambda$getEmojiSuggestions$224(strArr, keywordResultCallback, z13, str, z10, arrayList, z11, num, z12, z14, z15, countDownLatch);
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

    public void toggleStickerSet(final Context context, final TLObject tLObject, final TLRPC.Document document, final int i10, final org.telegram.ui.ActionBar.n2 n2Var, final FrameLayout frameLayout, final boolean z10, boolean z11, final Runnable runnable, boolean z12) {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
        int i11;
        boolean z13;
        int i12;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3;
        int i13;
        final int i14;
        char c10;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet4;
        if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
            tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject;
            stickerSet = tL_messages_stickerSet2.set;
        } else {
            if (tLObject instanceof TLRPC.StickerSetCovered) {
                stickerSet = ((TLRPC.StickerSetCovered) tLObject).set;
                if (i10 != 2) {
                    tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) this.stickerSetsById.f(stickerSet.f22407id);
                    if (tL_messages_stickerSet2 == null) {
                        return;
                    }
                } else {
                    stickerSet2 = stickerSet;
                    tL_messages_stickerSet = null;
                }
                if (stickerSet2.masks) {
                    i11 = 1;
                } else if (stickerSet2.emojis) {
                    i11 = 5;
                } else {
                    i11 = 0;
                }
                if (i10 == 1) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                stickerSet2.archived = z13;
                i12 = 0;
                while (true) {
                    if (i12 < this.stickerSets[i11].size()) {
                        tL_messages_stickerSet3 = tL_messages_stickerSet;
                        i13 = 0;
                        break;
                    }
                    tL_messages_stickerSet4 = this.stickerSets[i11].get(i12);
                    tL_messages_stickerSet3 = tL_messages_stickerSet;
                    if (tL_messages_stickerSet4.set.f22407id == stickerSet2.f22407id) {
                        this.stickerSets[i11].remove(i12);
                        if (i10 == 2) {
                            tL_messages_stickerSet4.set.title = stickerSet2.title;
                            this.stickerSets[i11].add(0, tL_messages_stickerSet4);
                        } else if (z12) {
                            this.stickerSetsById.l(tL_messages_stickerSet4.set.f22407id);
                            this.installedStickerSetsById.l(tL_messages_stickerSet4.set.f22407id);
                            this.stickerSetsByName.remove(tL_messages_stickerSet4.set.short_name);
                        }
                        i13 = i12;
                        break;
                    }
                    i12++;
                    tL_messages_stickerSet = tL_messages_stickerSet3;
                }
                this.loadHash[i11] = calcStickersHash(this.stickerSets[i11]);
                int i15 = i11;
                putStickersToCache(i15, this.stickerSets[i11], this.loadDate[i11], this.loadHash[i11]);
                i14 = i15;
                if (i10 == 2) {
                    if (!cancelRemovingStickerSet(stickerSet2.f22407id)) {
                        toggleStickerSetInternal(context, i10, n2Var, frameLayout, z10, tLObject, stickerSet2, document, i14, z11);
                    }
                    c10 = 1;
                } else if (!z11 && n2Var != null) {
                    kw0 kw0Var = new kw0(context, tLObject, 1, i10, document, n2Var.getResourceProvider());
                    final boolean[] zArr = new boolean[1];
                    markSetUninstalling(stickerSet2.f22407id, true);
                    org.telegram.ui.Components.cc ccVar = new org.telegram.ui.Components.cc(context, null, false);
                    final int i16 = i13;
                    final TLRPC.StickerSet stickerSet3 = stickerSet2;
                    final TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = tL_messages_stickerSet3;
                    ccVar.f27402a = new Runnable() {
                        @Override
                        public final void run() {
                            this.f21779a.lambda$toggleStickerSet$108(zArr, stickerSet3, i14, i16, tL_messages_stickerSet5, runnable);
                        }
                    };
                    c10 = 1;
                    ccVar.f27403b = new Runnable() {
                        @Override
                        public final void run() {
                            this.f22029a.lambda$toggleStickerSet$109(zArr, context, i10, n2Var, frameLayout, z10, tLObject, stickerSet3, document, i14);
                        }
                    };
                    kw0Var.setButton(ccVar);
                    this.removingStickerSetsUndos.k(new d1(ccVar, 25), stickerSet3.f22407id);
                    if (frameLayout != null) {
                        i14 = i14;
                        org.telegram.ui.Components.ec.f(frameLayout, kw0Var, 2750).j();
                    } else {
                        i14 = i14;
                        org.telegram.ui.Components.ec.g(n2Var, kw0Var, 2750).j();
                    }
                } else {
                    c10 = 1;
                    toggleStickerSetInternal(context, i10, n2Var, frameLayout, z10, tLObject, stickerSet2, document, i14, false);
                }
                NotificationCenter notificationCenter = getNotificationCenter();
                int i17 = NotificationCenter.stickersDidLoad;
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(i14);
                objArr[c10] = Boolean.TRUE;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i17, objArr);
            }
            throw new IllegalArgumentException("Invalid type of the given stickerSetObject: " + tLObject.getClass());
        }
        tL_messages_stickerSet = tL_messages_stickerSet2;
        stickerSet2 = stickerSet;
        if (stickerSet2.masks) {
            i11 = 1;
        } else if (stickerSet2.emojis) {
            i11 = 5;
        } else {
            i11 = 0;
        }
        if (i10 == 1) {
            z13 = true;
        } else {
            z13 = false;
        }
        stickerSet2.archived = z13;
        i12 = 0;
        while (true) {
            if (i12 < this.stickerSets[i11].size()) {
                tL_messages_stickerSet3 = tL_messages_stickerSet;
                i13 = 0;
                break;
            }
            tL_messages_stickerSet4 = this.stickerSets[i11].get(i12);
            tL_messages_stickerSet3 = tL_messages_stickerSet;
            if (tL_messages_stickerSet4.set.f22407id == stickerSet2.f22407id) {
                this.stickerSets[i11].remove(i12);
                if (i10 == 2) {
                    tL_messages_stickerSet4.set.title = stickerSet2.title;
                    this.stickerSets[i11].add(0, tL_messages_stickerSet4);
                } else if (z12) {
                    this.stickerSetsById.l(tL_messages_stickerSet4.set.f22407id);
                    this.installedStickerSetsById.l(tL_messages_stickerSet4.set.f22407id);
                    this.stickerSetsByName.remove(tL_messages_stickerSet4.set.short_name);
                }
                i13 = i12;
                break;
            }
            i12++;
            tL_messages_stickerSet = tL_messages_stickerSet3;
        }
        this.loadHash[i11] = calcStickersHash(this.stickerSets[i11]);
        int i18 = i11;
        putStickersToCache(i18, this.stickerSets[i11], this.loadDate[i11], this.loadHash[i11]);
        i14 = i18;
        if (i10 == 2) {
            if (!cancelRemovingStickerSet(stickerSet2.f22407id)) {
                toggleStickerSetInternal(context, i10, n2Var, frameLayout, z10, tLObject, stickerSet2, document, i14, z11);
            }
            c10 = 1;
        } else if (!z11) {
            c10 = 1;
            toggleStickerSetInternal(context, i10, n2Var, frameLayout, z10, tLObject, stickerSet2, document, i14, false);
        } else {
            c10 = 1;
            toggleStickerSetInternal(context, i10, n2Var, frameLayout, z10, tLObject, stickerSet2, document, i14, false);
        }
        NotificationCenter notificationCenter2 = getNotificationCenter();
        int i19 = NotificationCenter.stickersDidLoad;
        Object[] objArr2 = new Object[2];
        objArr2[0] = Integer.valueOf(i14);
        objArr2[c10] = Boolean.TRUE;
        notificationCenter2.lambda$postNotificationNameOnUIThread$1(i19, objArr2);
    }

    public static void addTextStyleRuns(ArrayList<TLRPC.MessageEntity> arrayList, CharSequence charSequence, Spannable spannable, int i10) {
        for (yz0 yz0Var : (yz0[]) spannable.getSpans(0, spannable.length(), yz0.class)) {
            spannable.removeSpan(yz0Var);
        }
        ArrayList<xz0> textStyleRuns = getTextStyleRuns(arrayList, charSequence, i10);
        for (int i11 = 0; i11 < Math.min(1000, textStyleRuns.size()); i11++) {
            xz0 xz0Var = textStyleRuns.get(i11);
            addStyleToText(new yz0(xz0Var, 0), xz0Var.f34735b, xz0Var.f34736c, spannable, true);
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
            if (z12 && this.stickerSetsById.d(inputStickerSet.f22400id)) {
                tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.stickerSetsById.f(inputStickerSet.f22400id);
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
            final String strInputSetKey = inputSetKey(inputStickerSet);
            if (callback != null || !this.loadingStickerSetsKeys.contains(strInputSetKey)) {
                this.loadingStickerSetsKeys.add(strInputSetKey);
                if (z12) {
                    final int i10 = 0;
                    getMessagesStorage().getStorageQueue().postRunnable(new Runnable(this) {

                        public final MediaDataController f22321b;

                        {
                            this.f22321b = this;
                        }

                        @Override
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    this.f22321b.lambda$getStickerSet$34(inputStickerSet, num, strInputSetKey, callback, z10);
                                    break;
                                default:
                                    this.f22321b.lambda$getStickerSet$37(inputStickerSet, num, strInputSetKey, callback, z10);
                                    break;
                            }
                        }
                    });
                    return null;
                }
                if (inputStickerSet instanceof TLRPC.TL_inputStickerSetShortName) {
                    final int i11 = 1;
                    getMessagesStorage().getStorageQueue().postRunnable(new Runnable(this) {

                        public final MediaDataController f22321b;

                        {
                            this.f22321b = this;
                        }

                        @Override
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    this.f22321b.lambda$getStickerSet$34(inputStickerSet, num, strInputSetKey, callback, z10);
                                    break;
                                default:
                                    this.f22321b.lambda$getStickerSet$37(inputStickerSet, num, strInputSetKey, callback, z10);
                                    break;
                            }
                        }
                    });
                    return null;
                }
                if (!z10) {
                    fetchStickerSetInternal(inputStickerSet, new a4(this, strInputSetKey, callback, inputStickerSet, 2));
                    return null;
                }
                this.loadingStickerSetsKeys.remove(strInputSetKey);
                return null;
            }
        }
        return null;
    }

    public ArrayList<MessageObject> loadPinnedMessages(long j10, long j11, ArrayList<Integer> arrayList, boolean z10) {
        if (z10) {
            getMessagesStorage().getStorageQueue().postRunnable(new e5.w(this, j10, j11, arrayList, 5));
            return null;
        }
        return loadPinnedMessageInternal(j10, j11, arrayList, true);
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
        SharedPreferences.Editor editorEdit = this.draftPreferences.edit();
        MessagesController messagesController = getMessagesController();
        if (draftMessage != null && !(draftMessage instanceof TLRPC.TL_draftMessageEmpty)) {
            a0.h hVar = (a0.h) this.drafts.f(j10);
            if (hVar == null) {
                hVar = new a0.h();
                this.drafts.k(hVar, j10);
            }
            hVar.k(draftMessage, j11);
            if (j11 == 0) {
                messagesController.putDraftDialogIfNeed(j10, draftMessage);
            }
            try {
                SerializedData serializedData = new SerializedData(draftMessage.getObjectSize());
                draftMessage.serializeToStream(serializedData);
                if (j11 != 0) {
                    sb2 = new StringBuilder("t_");
                    sb2.append(j10);
                    sb2.append("_");
                    sb2.append(j11);
                } else {
                    sb2 = new StringBuilder("");
                    sb2.append(j10);
                }
                editorEdit.putString(sb2.toString(), Utilities.bytesToHex(serializedData.toByteArray()));
                serializedData.cleanup();
            } catch (Exception e9) {
                FileLog.e(e9);
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
                SharedPreferences.Editor editorEdit2 = this.draftPreferences.edit();
                StringBuilder sbQ = a9.p.q(j10, "t_", "_");
                sbQ.append(j11);
                SharedPreferences.Editor editorRemove = editorEdit2.remove(sbQ.toString());
                StringBuilder sbQ2 = a9.p.q(j10, "rt_", "_");
                sbQ2.append(j11);
                editorRemove.remove(sbQ2.toString()).commit();
            }
            messagesController.removeDraftDialogIfNeed(j10);
        }
        a0.h hVar4 = (a0.h) this.draftMessages.f(j10);
        TLRPC.User user = null;
        if (message != null || draftMessage == null || draftMessage.reply_to == null) {
            if (draftMessage == null || draftMessage.reply_to != null) {
                message2 = message;
            } else {
                message2 = null;
            }
        } else if (hVar4 != null) {
            message2 = (TLRPC.Message) hVar4.f(j11);
        } else {
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
                editorEdit.remove("r_" + j10);
            } else {
                StringBuilder sbQ3 = a9.p.q(j10, "rt_", "_");
                sbQ3.append(j11);
                editorEdit.remove(sbQ3.toString());
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
                editorEdit.putString(str, Utilities.bytesToHex(serializedData2.toByteArray()));
                serializedData2.cleanup();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        editorEdit.commit();
        if (z10) {
            if (j11 == 0 || getMessagesController().isForum(j10)) {
                if (draftMessage != null && (inputReplyTo = draftMessage.reply_to) != null && inputReplyTo.reply_to_msg_id != 0 && (message2 == null || ((message2.reply_to instanceof TLRPC.TL_messageReplyHeader) && message2.replyMessage == null))) {
                    long peerDialogId = (inputReplyTo.flags & 2) != 0 ? DialogObject.getPeerDialogId(inputReplyTo.reply_to_peer_id) : j10;
                    if (DialogObject.isUserDialog(peerDialogId)) {
                        user = getMessagesController().getUser(Long.valueOf(peerDialogId));
                        chat = null;
                    } else {
                        chat = getMessagesController().getChat(Long.valueOf(-peerDialogId));
                    }
                    if (user != null || chat != null) {
                        long j12 = ChatObject.isChannel(chat) ? chat.f22380id : 0L;
                        final int i10 = draftMessage.reply_to.reply_to_msg_id;
                        final long j13 = peerDialogId;
                        final long j14 = j12;
                        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                            @Override
                            public final void run() {
                                this.f21418a.lambda$saveDraft$191(i10, j13, j14, j10, j11);
                            }
                        });
                    }
                }
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newDraftReceived, Long.valueOf(j10));
            }
        }
    }
}
