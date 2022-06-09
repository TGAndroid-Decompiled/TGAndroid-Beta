package org.telegram.messenger;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.util.SparseArray;
import androidx.collection.LongSparseArray;
import androidx.core.content.pm.ShortcutManagerCompat;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationBadge;
import org.telegram.messenger.ringtone.RingtoneDataStore;
import org.telegram.messenger.ringtone.RingtoneUploader;
import org.telegram.messenger.support.SparseLongArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$AttachMenuBots;
import org.telegram.tgnet.TLRPC$AttachMenuPeerType;
import org.telegram.tgnet.TLRPC$BotInfo;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$DocumentAttribute;
import org.telegram.tgnet.TLRPC$DraftMessage;
import org.telegram.tgnet.TLRPC$EmojiKeyword;
import org.telegram.tgnet.TLRPC$InputPeer;
import org.telegram.tgnet.TLRPC$InputStickerSet;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$MessageAction;
import org.telegram.tgnet.TLRPC$MessageEntity;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$MessagesFilter;
import org.telegram.tgnet.TLRPC$Peer;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$StickerSet;
import org.telegram.tgnet.TLRPC$StickerSetCovered;
import org.telegram.tgnet.TLRPC$TL_account_saveRingtone;
import org.telegram.tgnet.TLRPC$TL_account_savedRingtoneConverted;
import org.telegram.tgnet.TLRPC$TL_attachMenuBot;
import org.telegram.tgnet.TLRPC$TL_attachMenuBotIcon;
import org.telegram.tgnet.TLRPC$TL_attachMenuBots;
import org.telegram.tgnet.TLRPC$TL_attachMenuBotsNotModified;
import org.telegram.tgnet.TLRPC$TL_attachMenuPeerTypeBotPM;
import org.telegram.tgnet.TLRPC$TL_attachMenuPeerTypeBroadcast;
import org.telegram.tgnet.TLRPC$TL_attachMenuPeerTypeChat;
import org.telegram.tgnet.TLRPC$TL_attachMenuPeerTypePM;
import org.telegram.tgnet.TLRPC$TL_attachMenuPeerTypeSameBotPM;
import org.telegram.tgnet.TLRPC$TL_availableReaction;
import org.telegram.tgnet.TLRPC$TL_boolTrue;
import org.telegram.tgnet.TLRPC$TL_channels_getMessages;
import org.telegram.tgnet.TLRPC$TL_contacts_getTopPeers;
import org.telegram.tgnet.TLRPC$TL_contacts_resetTopPeerRating;
import org.telegram.tgnet.TLRPC$TL_contacts_topPeers;
import org.telegram.tgnet.TLRPC$TL_contacts_topPeersDisabled;
import org.telegram.tgnet.TLRPC$TL_documentAttributeAnimated;
import org.telegram.tgnet.TLRPC$TL_documentAttributeAudio;
import org.telegram.tgnet.TLRPC$TL_documentAttributeSticker;
import org.telegram.tgnet.TLRPC$TL_documentAttributeVideo;
import org.telegram.tgnet.TLRPC$TL_documentEmpty;
import org.telegram.tgnet.TLRPC$TL_draftMessage;
import org.telegram.tgnet.TLRPC$TL_draftMessageEmpty;
import org.telegram.tgnet.TLRPC$TL_emojiKeyword;
import org.telegram.tgnet.TLRPC$TL_emojiKeywordDeleted;
import org.telegram.tgnet.TLRPC$TL_emojiKeywordsDifference;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_help_premiumPromo;
import org.telegram.tgnet.TLRPC$TL_inputDocument;
import org.telegram.tgnet.TLRPC$TL_inputMessageEntityMentionName;
import org.telegram.tgnet.TLRPC$TL_inputMessagesFilterDocument;
import org.telegram.tgnet.TLRPC$TL_inputMessagesFilterEmpty;
import org.telegram.tgnet.TLRPC$TL_inputMessagesFilterGif;
import org.telegram.tgnet.TLRPC$TL_inputMessagesFilterMusic;
import org.telegram.tgnet.TLRPC$TL_inputMessagesFilterPhotoVideo;
import org.telegram.tgnet.TLRPC$TL_inputMessagesFilterPhotos;
import org.telegram.tgnet.TLRPC$TL_inputMessagesFilterPinned;
import org.telegram.tgnet.TLRPC$TL_inputMessagesFilterRoundVoice;
import org.telegram.tgnet.TLRPC$TL_inputMessagesFilterUrl;
import org.telegram.tgnet.TLRPC$TL_inputMessagesFilterVideo;
import org.telegram.tgnet.TLRPC$TL_inputStickerSetAnimatedEmoji;
import org.telegram.tgnet.TLRPC$TL_inputStickerSetDice;
import org.telegram.tgnet.TLRPC$TL_inputStickerSetEmpty;
import org.telegram.tgnet.TLRPC$TL_inputStickerSetID;
import org.telegram.tgnet.TLRPC$TL_inputStickerSetShortName;
import org.telegram.tgnet.TLRPC$TL_message;
import org.telegram.tgnet.TLRPC$TL_messageActionGameScore;
import org.telegram.tgnet.TLRPC$TL_messageActionHistoryClear;
import org.telegram.tgnet.TLRPC$TL_messageActionPaymentSent;
import org.telegram.tgnet.TLRPC$TL_messageActionPinMessage;
import org.telegram.tgnet.TLRPC$TL_messageEmpty;
import org.telegram.tgnet.TLRPC$TL_messageEntityBlockquote;
import org.telegram.tgnet.TLRPC$TL_messageEntityBold;
import org.telegram.tgnet.TLRPC$TL_messageEntityCode;
import org.telegram.tgnet.TLRPC$TL_messageEntityEmail;
import org.telegram.tgnet.TLRPC$TL_messageEntityItalic;
import org.telegram.tgnet.TLRPC$TL_messageEntityMentionName;
import org.telegram.tgnet.TLRPC$TL_messageEntityPre;
import org.telegram.tgnet.TLRPC$TL_messageEntitySpoiler;
import org.telegram.tgnet.TLRPC$TL_messageEntityStrike;
import org.telegram.tgnet.TLRPC$TL_messageEntityTextUrl;
import org.telegram.tgnet.TLRPC$TL_messageEntityUnderline;
import org.telegram.tgnet.TLRPC$TL_messageEntityUrl;
import org.telegram.tgnet.TLRPC$TL_messageMediaDocument;
import org.telegram.tgnet.TLRPC$TL_messageMediaPhoto;
import org.telegram.tgnet.TLRPC$TL_messageReplyHeader;
import org.telegram.tgnet.TLRPC$TL_messageService;
import org.telegram.tgnet.TLRPC$TL_message_secret;
import org.telegram.tgnet.TLRPC$TL_messages_allStickers;
import org.telegram.tgnet.TLRPC$TL_messages_archivedStickers;
import org.telegram.tgnet.TLRPC$TL_messages_availableReactions;
import org.telegram.tgnet.TLRPC$TL_messages_availableReactionsNotModified;
import org.telegram.tgnet.TLRPC$TL_messages_channelMessages;
import org.telegram.tgnet.TLRPC$TL_messages_faveSticker;
import org.telegram.tgnet.TLRPC$TL_messages_favedStickers;
import org.telegram.tgnet.TLRPC$TL_messages_featuredStickers;
import org.telegram.tgnet.TLRPC$TL_messages_getAllStickers;
import org.telegram.tgnet.TLRPC$TL_messages_getArchivedStickers;
import org.telegram.tgnet.TLRPC$TL_messages_getAttachMenuBots;
import org.telegram.tgnet.TLRPC$TL_messages_getAvailableReactions;
import org.telegram.tgnet.TLRPC$TL_messages_getFeaturedStickers;
import org.telegram.tgnet.TLRPC$TL_messages_getMaskStickers;
import org.telegram.tgnet.TLRPC$TL_messages_getMessages;
import org.telegram.tgnet.TLRPC$TL_messages_getScheduledMessages;
import org.telegram.tgnet.TLRPC$TL_messages_getSearchCounters;
import org.telegram.tgnet.TLRPC$TL_messages_getStickerSet;
import org.telegram.tgnet.TLRPC$TL_messages_getStickers;
import org.telegram.tgnet.TLRPC$TL_messages_installStickerSet;
import org.telegram.tgnet.TLRPC$TL_messages_messagesSlice;
import org.telegram.tgnet.TLRPC$TL_messages_readFeaturedStickers;
import org.telegram.tgnet.TLRPC$TL_messages_recentStickers;
import org.telegram.tgnet.TLRPC$TL_messages_saveDraft;
import org.telegram.tgnet.TLRPC$TL_messages_saveGif;
import org.telegram.tgnet.TLRPC$TL_messages_saveRecentSticker;
import org.telegram.tgnet.TLRPC$TL_messages_savedGifs;
import org.telegram.tgnet.TLRPC$TL_messages_search;
import org.telegram.tgnet.TLRPC$TL_messages_searchCounter;
import org.telegram.tgnet.TLRPC$TL_messages_stickerSet;
import org.telegram.tgnet.TLRPC$TL_messages_stickerSetInstallResultArchive;
import org.telegram.tgnet.TLRPC$TL_messages_stickers;
import org.telegram.tgnet.TLRPC$TL_messages_toggleStickerSets;
import org.telegram.tgnet.TLRPC$TL_messages_uninstallStickerSet;
import org.telegram.tgnet.TLRPC$TL_peerChat;
import org.telegram.tgnet.TLRPC$TL_peerUser;
import org.telegram.tgnet.TLRPC$TL_stickerPack;
import org.telegram.tgnet.TLRPC$TL_theme;
import org.telegram.tgnet.TLRPC$TL_topPeer;
import org.telegram.tgnet.TLRPC$TL_topPeerCategoryBotsInline;
import org.telegram.tgnet.TLRPC$TL_topPeerCategoryCorrespondents;
import org.telegram.tgnet.TLRPC$TL_topPeerCategoryPeers;
import org.telegram.tgnet.TLRPC$TL_updateBotCommands;
import org.telegram.tgnet.TLRPC$Theme;
import org.telegram.tgnet.TLRPC$Updates;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$Vector;
import org.telegram.tgnet.TLRPC$messages_Messages;
import org.telegram.tgnet.TLRPC$messages_StickerSet;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.EmojiThemes;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.ChatThemeBottomSheet;
import org.telegram.ui.Components.Reactions.ReactionsEffectOverlay;
import org.telegram.ui.Components.StickerSetBulletinLayout;
import org.telegram.ui.Components.StickersArchiveAlert;
import org.telegram.ui.Components.TextStyleSpan;
import org.telegram.ui.Components.URLSpanReplacement;

public class MediaDataController extends BaseController {
    public static final String ATTACH_MENU_BOT_ANIMATED_ICON_KEY = "android_animated";
    public static final String ATTACH_MENU_BOT_COLOR_DARK_ICON = "dark_icon";
    public static final String ATTACH_MENU_BOT_COLOR_DARK_TEXT = "dark_text";
    public static final String ATTACH_MENU_BOT_COLOR_LIGHT_ICON = "light_icon";
    public static final String ATTACH_MENU_BOT_COLOR_LIGHT_TEXT = "light_text";
    public static final String ATTACH_MENU_BOT_PLACEHOLDER_STATIC_KEY = "placeholder_static";
    public static final String ATTACH_MENU_BOT_STATIC_ICON_KEY = "default_static";
    public static final int MEDIA_AUDIO = 2;
    public static final int MEDIA_FILE = 1;
    public static final int MEDIA_GIF = 5;
    public static final int MEDIA_MUSIC = 4;
    public static final int MEDIA_PHOTOS_ONLY = 6;
    public static final int MEDIA_PHOTOVIDEO = 0;
    public static final int MEDIA_TYPES_COUNT = 8;
    public static final int MEDIA_URL = 3;
    public static final int MEDIA_VIDEOS_ONLY = 7;
    public static final int TYPE_EMOJI = 4;
    public static final int TYPE_FAVE = 2;
    public static final int TYPE_FEATURED = 3;
    public static final int TYPE_GREETINGS = 3;
    public static final int TYPE_IMAGE = 0;
    public static final int TYPE_MASK = 1;
    private static RectF bitmapRect;
    private static Paint erasePaint;
    private static Paint roundPaint;
    private static Path roundPath;
    private String doubleTapReaction;
    private SharedPreferences draftPreferences;
    private boolean featuredStickersLoaded;
    private TLRPC$Document greetingsSticker;
    private boolean inTransaction;
    private boolean isLoadingMenuBots;
    private boolean isLoadingPremiumPromo;
    private boolean isLoadingReactions;
    private long lastDialogId;
    private int lastGuid;
    private long lastMergeDialogId;
    private int lastReplyMessageId;
    private int lastReqId;
    private int lastReturnedNum;
    private TLRPC$Chat lastSearchChat;
    private String lastSearchQuery;
    private TLRPC$User lastSearchUser;
    private int loadFeaturedDate;
    private long loadFeaturedHash;
    boolean loaded;
    boolean loading;
    private boolean loadingDrafts;
    private boolean loadingFeaturedStickers;
    private boolean loadingMoreSearchMessages;
    private boolean loadingRecentGifs;
    private int menuBotsUpdateDate;
    private long menuBotsUpdateHash;
    private int mergeReqId;
    private TLRPC$TL_help_premiumPromo premiumPromo;
    private int premiumPromoUpdateDate;
    boolean previewStickersLoading;
    private int reactionsUpdateDate;
    private int reactionsUpdateHash;
    private boolean recentGifsLoaded;
    private int reqId;
    public final RingtoneDataStore ringtoneDataStore;
    private static Pattern BOLD_PATTERN = Pattern.compile("\\*\\*(.+?)\\*\\*");
    private static Pattern ITALIC_PATTERN = Pattern.compile("__(.+?)__");
    private static Pattern SPOILER_PATTERN = Pattern.compile("\\|\\|(.+?)\\|\\|");
    private static Pattern STRIKE_PATTERN = Pattern.compile("~~(.+?)~~");
    public static String SHORTCUT_CATEGORY = "org.telegram.messenger.SHORTCUT_SHARE";
    private static volatile MediaDataController[] Instance = new MediaDataController[4];
    private static Comparator<TLRPC$MessageEntity> entityComparator = MediaDataController$$ExternalSyntheticLambda126.INSTANCE;
    private TLRPC$TL_attachMenuBots attachMenuBots = new TLRPC$TL_attachMenuBots();
    private List<TLRPC$TL_availableReaction> reactionsList = new ArrayList();
    private List<TLRPC$TL_availableReaction> enabledReactionsList = new ArrayList();
    private HashMap<String, TLRPC$TL_availableReaction> reactionsMap = new HashMap<>();
    private ArrayList<TLRPC$TL_messages_stickerSet>[] stickerSets = {new ArrayList<>(), new ArrayList<>(), new ArrayList<>(0), new ArrayList<>(), new ArrayList<>()};
    private LongSparseArray<TLRPC$Document>[] stickersByIds = {new LongSparseArray<>(), new LongSparseArray<>(), new LongSparseArray<>(), new LongSparseArray<>(), new LongSparseArray<>()};
    private LongSparseArray<TLRPC$TL_messages_stickerSet> stickerSetsById = new LongSparseArray<>();
    private LongSparseArray<TLRPC$TL_messages_stickerSet> installedStickerSetsById = new LongSparseArray<>();
    private LongSparseArray<TLRPC$TL_messages_stickerSet> groupStickerSets = new LongSparseArray<>();
    private ConcurrentHashMap<String, TLRPC$TL_messages_stickerSet> stickerSetsByName = new ConcurrentHashMap<>(100, 1.0f, 1);
    private HashMap<String, TLRPC$TL_messages_stickerSet> diceStickerSetsByEmoji = new HashMap<>();
    private LongSparseArray<String> diceEmojiStickerSetsById = new LongSparseArray<>();
    private HashSet<String> loadingDiceStickerSets = new HashSet<>();
    private LongSparseArray<Runnable> removingStickerSetsUndos = new LongSparseArray<>();
    private Runnable[] scheduledLoadStickers = new Runnable[5];
    private boolean[] loadingStickers = new boolean[5];
    private boolean[] stickersLoaded = new boolean[5];
    private long[] loadHash = new long[5];
    private int[] loadDate = new int[5];
    public HashMap<String, RingtoneUploader> ringtoneUploaderHashMap = new HashMap<>();
    private HashMap<String, ArrayList<TLRPC$Message>> verifyingMessages = new HashMap<>();
    private int[] archivedStickersCount = new int[2];
    private LongSparseArray<String> stickersByEmoji = new LongSparseArray<>();
    private HashMap<String, ArrayList<TLRPC$Document>> allStickers = new HashMap<>();
    private HashMap<String, ArrayList<TLRPC$Document>> allStickersFeatured = new HashMap<>();
    private ArrayList<TLRPC$Document>[] recentStickers = {new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>()};
    private boolean[] loadingRecentStickers = new boolean[4];
    private boolean[] recentStickersLoaded = new boolean[4];
    private ArrayList<TLRPC$Document> recentGifs = new ArrayList<>();
    private ArrayList<TLRPC$StickerSetCovered> featuredStickerSets = new ArrayList<>();
    private LongSparseArray<TLRPC$StickerSetCovered> featuredStickerSetsById = new LongSparseArray<>();
    private ArrayList<Long> unreadStickerSets = new ArrayList<>();
    private ArrayList<Long> readingStickerSets = new ArrayList<>();
    public final ArrayList<ChatThemeBottomSheet.ChatThemeItem> defaultEmojiThemes = new ArrayList<>();
    public final ArrayList<TLRPC$Document> premiumPreviewStickers = new ArrayList<>();
    private int[] messagesSearchCount = {0, 0};
    private boolean[] messagesSearchEndReached = {false, false};
    private ArrayList<MessageObject> searchResultMessages = new ArrayList<>();
    private SparseArray<MessageObject>[] searchResultMessagesMap = {new SparseArray<>(), new SparseArray<>()};
    public ArrayList<TLRPC$TL_topPeer> hints = new ArrayList<>();
    public ArrayList<TLRPC$TL_topPeer> inlineBots = new ArrayList<>();
    private LongSparseArray<Boolean> loadingPinnedMessages = new LongSparseArray<>();
    private LongSparseArray<Integer> draftsFolderIds = new LongSparseArray<>();
    private LongSparseArray<SparseArray<TLRPC$DraftMessage>> drafts = new LongSparseArray<>();
    private LongSparseArray<SparseArray<TLRPC$Message>> draftMessages = new LongSparseArray<>();
    private HashMap<String, TLRPC$BotInfo> botInfos = new HashMap<>();
    private LongSparseArray<TLRPC$Message> botKeyboards = new LongSparseArray<>();
    private SparseLongArray botKeyboardsByMids = new SparseLongArray();
    private HashMap<String, Boolean> currentFetchingEmoji = new HashMap<>();

    public static class KeywordResult {
        public String emoji;
        public String keyword;
    }

    public interface KeywordResultCallback {
        void run(ArrayList<KeywordResult> arrayList, String str);
    }

    public static long calcHash(long j, long j2) {
        return (((j ^ (j2 >> 21)) ^ (j2 << 35)) ^ (j2 >> 4)) + j2;
    }

    public static void lambda$markFaturedStickersAsRead$47(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$markFaturedStickersByIdAsRead$48(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$removeInline$113(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$removePeer$114(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$saveDraft$146(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static MediaDataController getInstance(int i) {
        MediaDataController mediaDataController = Instance[i];
        if (mediaDataController == null) {
            synchronized (MediaDataController.class) {
                mediaDataController = Instance[i];
                if (mediaDataController == null) {
                    MediaDataController[] mediaDataControllerArr = Instance;
                    MediaDataController mediaDataController2 = new MediaDataController(i);
                    mediaDataControllerArr[i] = mediaDataController2;
                    mediaDataController = mediaDataController2;
                }
            }
        }
        return mediaDataController;
    }

    public MediaDataController(int i) {
        super(i);
        String key;
        long longValue;
        SerializedData serializedData;
        boolean z;
        if (this.currentAccount == 0) {
            this.draftPreferences = ApplicationLoader.applicationContext.getSharedPreferences("drafts", 0);
        } else {
            Context context = ApplicationLoader.applicationContext;
            this.draftPreferences = context.getSharedPreferences("drafts" + this.currentAccount, 0);
        }
        for (Map.Entry<String, ?> entry : this.draftPreferences.getAll().entrySet()) {
            try {
                key = entry.getKey();
                longValue = Utilities.parseLong(key).longValue();
                serializedData = new SerializedData(Utilities.hexToBytes((String) entry.getValue()));
            } catch (Exception unused) {
            }
            if (!key.startsWith("r_")) {
                z = key.startsWith("rt_");
                if (!z) {
                    TLRPC$DraftMessage TLdeserialize = TLRPC$DraftMessage.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                    if (TLdeserialize != null) {
                        SparseArray<TLRPC$DraftMessage> sparseArray = this.drafts.get(longValue);
                        if (sparseArray == null) {
                            sparseArray = new SparseArray<>();
                            this.drafts.put(longValue, sparseArray);
                        }
                        sparseArray.put(key.startsWith("t_") ? Utilities.parseInt((CharSequence) key.substring(key.lastIndexOf(95) + 1)).intValue() : 0, TLdeserialize);
                    }
                    serializedData.cleanup();
                }
            } else {
                z = false;
            }
            TLRPC$Message TLdeserialize2 = TLRPC$Message.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            if (TLdeserialize2 != null) {
                TLdeserialize2.readAttachPath(serializedData, getUserConfig().clientUserId);
                SparseArray<TLRPC$Message> sparseArray2 = this.draftMessages.get(longValue);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray<>();
                    this.draftMessages.put(longValue, sparseArray2);
                }
                sparseArray2.put(z ? Utilities.parseInt((CharSequence) key.substring(key.lastIndexOf(95) + 1)).intValue() : 0, TLdeserialize2);
            }
            serializedData.cleanup();
        }
        loadStickersByEmojiOrName(AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME, false, true);
        loadEmojiThemes();
        this.ringtoneDataStore = new RingtoneDataStore(this.currentAccount);
    }

    public void cleanup() {
        int i = 0;
        while (true) {
            ArrayList<TLRPC$Document>[] arrayListArr = this.recentStickers;
            if (i >= arrayListArr.length) {
                break;
            }
            arrayListArr[i].clear();
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
        this.loadFeaturedDate = 0;
        this.loadFeaturedHash = 0L;
        this.allStickers.clear();
        this.allStickersFeatured.clear();
        this.stickersByEmoji.clear();
        this.featuredStickerSetsById.clear();
        this.featuredStickerSets.clear();
        this.unreadStickerSets.clear();
        this.recentGifs.clear();
        this.stickerSetsById.clear();
        this.installedStickerSetsById.clear();
        this.stickerSetsByName.clear();
        this.diceStickerSetsByEmoji.clear();
        this.diceEmojiStickerSetsById.clear();
        this.loadingDiceStickerSets.clear();
        this.loadingFeaturedStickers = false;
        this.featuredStickersLoaded = false;
        this.loadingRecentGifs = false;
        this.recentGifsLoaded = false;
        this.currentFetchingEmoji.clear();
        if (Build.VERSION.SDK_INT >= 25) {
            Utilities.globalQueue.postRunnable(MediaDataController$$ExternalSyntheticLambda122.INSTANCE);
        }
        this.verifyingMessages.clear();
        this.loading = false;
        this.loaded = false;
        this.hints.clear();
        this.inlineBots.clear();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$cleanup$1();
            }
        });
        this.drafts.clear();
        this.draftMessages.clear();
        this.draftPreferences.edit().clear().apply();
        this.botInfos.clear();
        this.botKeyboards.clear();
        this.botKeyboardsByMids.clear();
    }

    public static void lambda$cleanup$0() {
        try {
            ShortcutManagerCompat.removeAllDynamicShortcuts(ApplicationLoader.applicationContext);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$cleanup$1() {
        getNotificationCenter().postNotificationName(NotificationCenter.reloadHints, new Object[0]);
        getNotificationCenter().postNotificationName(NotificationCenter.reloadInlineHints, new Object[0]);
    }

    public void checkStickers(int i) {
        if (this.loadingStickers[i]) {
            return;
        }
        if (!this.stickersLoaded[i] || Math.abs((System.currentTimeMillis() / 1000) - this.loadDate[i]) >= 3600) {
            loadStickers(i, true, false);
        }
    }

    public void checkReactions() {
        if (!this.isLoadingReactions && Math.abs((System.currentTimeMillis() / 1000) - this.reactionsUpdateDate) >= 3600) {
            loadReactions(true, false);
        }
    }

    public void checkMenuBots() {
        if (!this.isLoadingMenuBots && Math.abs((System.currentTimeMillis() / 1000) - this.menuBotsUpdateDate) >= 3600) {
            loadAttachMenuBots(true, false);
        }
    }

    public void checkPremiumPromo() {
        if (!this.isLoadingPremiumPromo && Math.abs((System.currentTimeMillis() / 1000) - this.premiumPromoUpdateDate) >= 3600) {
            loadPremiumPromo(true);
        }
    }

    public TLRPC$TL_help_premiumPromo getPremiumPromo() {
        return this.premiumPromo;
    }

    public TLRPC$TL_attachMenuBots getAttachMenuBots() {
        return this.attachMenuBots;
    }

    public void loadAttachMenuBots(boolean z, boolean z2) {
        this.isLoadingMenuBots = true;
        if (z) {
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$loadAttachMenuBots$2();
                }
            });
            return;
        }
        TLRPC$TL_messages_getAttachMenuBots tLRPC$TL_messages_getAttachMenuBots = new TLRPC$TL_messages_getAttachMenuBots();
        tLRPC$TL_messages_getAttachMenuBots.hash = z2 ? 0L : this.menuBotsUpdateHash;
        getConnectionsManager().sendRequest(tLRPC$TL_messages_getAttachMenuBots, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MediaDataController.this.lambda$loadAttachMenuBots$3(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadAttachMenuBots$2() {
        SQLiteCursor sQLiteCursor;
        Throwable th;
        int i;
        long j;
        TLRPC$TL_attachMenuBots tLRPC$TL_attachMenuBots;
        Exception e;
        long j2;
        SQLiteCursor sQLiteCursor2;
        SQLiteCursor sQLiteCursor3 = null;
        int i2 = 0;
        long j3 = 0;
        try {
            try {
                sQLiteCursor = getMessagesStorage().getDatabase().queryFinalized("SELECT data, hash, date FROM attach_menu_bots", new Object[0]);
            } catch (Exception e2) {
                e = e2;
                j2 = 0;
                sQLiteCursor2 = null;
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteCursor = sQLiteCursor3;
        }
        try {
            if (sQLiteCursor.next()) {
                NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                if (byteBufferValue != null) {
                    TLRPC$AttachMenuBots TLdeserialize = TLRPC$AttachMenuBots.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), true);
                    if (TLdeserialize instanceof TLRPC$TL_attachMenuBots) {
                        sQLiteCursor3 = (TLRPC$TL_attachMenuBots) TLdeserialize;
                    }
                    byteBufferValue.reuse();
                }
                j3 = sQLiteCursor.longValue(1);
                i2 = sQLiteCursor.intValue(2);
            }
            sQLiteCursor.dispose();
            tLRPC$TL_attachMenuBots = sQLiteCursor3;
            i = i2;
            j = j3;
        } catch (Exception e3) {
            e = e3;
            j2 = j3;
            sQLiteCursor2 = sQLiteCursor3;
            sQLiteCursor3 = sQLiteCursor;
            FileLog.e((Throwable) e, false);
            if (sQLiteCursor3 != null) {
                sQLiteCursor3.dispose();
            }
            tLRPC$TL_attachMenuBots = sQLiteCursor2;
            j = j2;
            i = 0;
            processLoadedMenuBots(tLRPC$TL_attachMenuBots, j, i, true);
        } catch (Throwable th3) {
            th = th3;
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
        processLoadedMenuBots(tLRPC$TL_attachMenuBots, j, i, true);
    }

    public void lambda$loadAttachMenuBots$3(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (tLObject instanceof TLRPC$TL_attachMenuBotsNotModified) {
            processLoadedMenuBots(null, 0L, currentTimeMillis, false);
        } else if (tLObject instanceof TLRPC$TL_attachMenuBots) {
            TLRPC$TL_attachMenuBots tLRPC$TL_attachMenuBots = (TLRPC$TL_attachMenuBots) tLObject;
            processLoadedMenuBots(tLRPC$TL_attachMenuBots, tLRPC$TL_attachMenuBots.hash, currentTimeMillis, false);
        }
    }

    public void processLoadedMenuBots(TLRPC$TL_attachMenuBots tLRPC$TL_attachMenuBots, long j, int i, boolean z) {
        if (!(tLRPC$TL_attachMenuBots == null || i == 0)) {
            this.attachMenuBots = tLRPC$TL_attachMenuBots;
            this.menuBotsUpdateHash = j;
        }
        this.menuBotsUpdateDate = i;
        if (tLRPC$TL_attachMenuBots != null) {
            getMessagesController().putUsers(tLRPC$TL_attachMenuBots.users, z);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$processLoadedMenuBots$4();
                }
            });
        }
        if (!z) {
            putMenuBotsToCache(tLRPC$TL_attachMenuBots, j, i);
        } else if (Math.abs((System.currentTimeMillis() / 1000) - i) >= 3600) {
            loadAttachMenuBots(false, true);
        }
    }

    public void lambda$processLoadedMenuBots$4() {
        NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.attachMenuBotsDidLoad, new Object[0]);
    }

    private void putMenuBotsToCache(final TLRPC$TL_attachMenuBots tLRPC$TL_attachMenuBots, final long j, final int i) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$putMenuBotsToCache$5(tLRPC$TL_attachMenuBots, j, i);
            }
        });
    }

    public void lambda$putMenuBotsToCache$5(TLRPC$TL_attachMenuBots tLRPC$TL_attachMenuBots, long j, int i) {
        try {
            if (tLRPC$TL_attachMenuBots != null) {
                getMessagesStorage().getDatabase().executeFast("DELETE FROM attach_menu_bots").stepThis().dispose();
                SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO attach_menu_bots VALUES(?, ?, ?)");
                executeFast.requery();
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLRPC$TL_attachMenuBots.getObjectSize());
                tLRPC$TL_attachMenuBots.serializeToStream(nativeByteBuffer);
                executeFast.bindByteBuffer(1, nativeByteBuffer);
                executeFast.bindLong(2, j);
                executeFast.bindInteger(3, i);
                executeFast.step();
                nativeByteBuffer.reuse();
                executeFast.dispose();
            } else {
                SQLitePreparedStatement executeFast2 = getMessagesStorage().getDatabase().executeFast("UPDATE attach_menu_bots SET date = ?");
                executeFast2.requery();
                executeFast2.bindLong(1, i);
                executeFast2.step();
                executeFast2.dispose();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void loadPremiumPromo(boolean z) {
        this.isLoadingPremiumPromo = true;
        if (z) {
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$loadPremiumPromo$6();
                }
            });
            return;
        }
        getConnectionsManager().sendRequest(new TLObject() {
            public static int constructor = -1206152236;

            @Override
            public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z2) {
                return TLRPC$TL_help_premiumPromo.TLdeserialize(abstractSerializedData, i, z2);
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                abstractSerializedData.writeInt32(constructor);
            }
        }, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MediaDataController.this.lambda$loadPremiumPromo$7(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadPremiumPromo$6() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.lambda$loadPremiumPromo$6():void");
    }

    public void lambda$loadPremiumPromo$7(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (tLObject instanceof TLRPC$TL_help_premiumPromo) {
            processLoadedPremiumPromo((TLRPC$TL_help_premiumPromo) tLObject, currentTimeMillis, false);
        }
    }

    private void processLoadedPremiumPromo(TLRPC$TL_help_premiumPromo tLRPC$TL_help_premiumPromo, int i, boolean z) {
        this.premiumPromo = tLRPC$TL_help_premiumPromo;
        this.premiumPromoUpdateDate = i;
        getMessagesController().putUsers(tLRPC$TL_help_premiumPromo.users, z);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$processLoadedPremiumPromo$8();
            }
        });
        if (!z) {
            putPremiumPromoToCache(tLRPC$TL_help_premiumPromo, i);
        } else if (Math.abs((System.currentTimeMillis() / 1000) - i) >= 86400 || BuildVars.DEBUG_PRIVATE_VERSION) {
            loadPremiumPromo(false);
        }
    }

    public void lambda$processLoadedPremiumPromo$8() {
        getNotificationCenter().postNotificationName(NotificationCenter.premiumPromoUpdated, new Object[0]);
    }

    private void putPremiumPromoToCache(final TLRPC$TL_help_premiumPromo tLRPC$TL_help_premiumPromo, final int i) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$putPremiumPromoToCache$9(tLRPC$TL_help_premiumPromo, i);
            }
        });
    }

    public void lambda$putPremiumPromoToCache$9(TLRPC$TL_help_premiumPromo tLRPC$TL_help_premiumPromo, int i) {
        try {
            if (tLRPC$TL_help_premiumPromo != null) {
                getMessagesStorage().getDatabase().executeFast("DELETE FROM attach_menu_bots").stepThis().dispose();
                SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO premium_promo VALUES(?, ?)");
                executeFast.requery();
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLRPC$TL_help_premiumPromo.getObjectSize());
                tLRPC$TL_help_premiumPromo.serializeToStream(nativeByteBuffer);
                executeFast.bindByteBuffer(1, nativeByteBuffer);
                executeFast.bindInteger(2, i);
                executeFast.step();
                nativeByteBuffer.reuse();
                executeFast.dispose();
            } else {
                SQLitePreparedStatement executeFast2 = getMessagesStorage().getDatabase().executeFast("UPDATE premium_promo SET date = ?");
                executeFast2.requery();
                executeFast2.bindInteger(1, i);
                executeFast2.step();
                executeFast2.dispose();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public List<TLRPC$TL_availableReaction> getReactionsList() {
        return this.reactionsList;
    }

    public void loadReactions(boolean z, boolean z2) {
        this.isLoadingReactions = true;
        if (z) {
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$loadReactions$10();
                }
            });
            return;
        }
        TLRPC$TL_messages_getAvailableReactions tLRPC$TL_messages_getAvailableReactions = new TLRPC$TL_messages_getAvailableReactions();
        tLRPC$TL_messages_getAvailableReactions.hash = z2 ? 0 : this.reactionsUpdateHash;
        getConnectionsManager().sendRequest(tLRPC$TL_messages_getAvailableReactions, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MediaDataController.this.lambda$loadReactions$11(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadReactions$10() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.lambda$loadReactions$10():void");
    }

    public void lambda$loadReactions$11(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (tLObject instanceof TLRPC$TL_messages_availableReactionsNotModified) {
            processLoadedReactions(null, 0, currentTimeMillis, false);
        } else if (tLObject instanceof TLRPC$TL_messages_availableReactions) {
            TLRPC$TL_messages_availableReactions tLRPC$TL_messages_availableReactions = (TLRPC$TL_messages_availableReactions) tLObject;
            processLoadedReactions(tLRPC$TL_messages_availableReactions.reactions, tLRPC$TL_messages_availableReactions.hash, currentTimeMillis, false);
        }
    }

    public void processLoadedReactions(final List<TLRPC$TL_availableReaction> list, int i, int i2, boolean z) {
        if (!(list == null || i2 == 0)) {
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
                    MediaDataController.lambda$processLoadedReactions$12(list);
                }
            });
        }
        this.isLoadingReactions = false;
        if (!z) {
            putReactionsToCache(list, i, i2);
        } else if (Math.abs((System.currentTimeMillis() / 1000) - i2) >= 3600) {
            loadReactions(false, true);
        }
    }

    public static void lambda$processLoadedReactions$12(List list) {
        for (int i = 0; i < list.size(); i++) {
            ImageReceiver imageReceiver = new ImageReceiver();
            TLRPC$TL_availableReaction tLRPC$TL_availableReaction = (TLRPC$TL_availableReaction) list.get(i);
            imageReceiver.setImage(ImageLocation.getForDocument(tLRPC$TL_availableReaction.activate_animation), null, null, null, 0, 11);
            ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
            ImageReceiver imageReceiver2 = new ImageReceiver();
            imageReceiver2.setImage(ImageLocation.getForDocument(tLRPC$TL_availableReaction.appear_animation), "60_60_nolimit", null, null, 0, 11);
            ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver2);
            int sizeForBigReaction = ReactionsEffectOverlay.sizeForBigReaction();
            ImageReceiver imageReceiver3 = new ImageReceiver();
            ImageLocation forDocument = ImageLocation.getForDocument(tLRPC$TL_availableReaction.around_animation);
            imageReceiver3.setImage(forDocument, sizeForBigReaction + "_" + sizeForBigReaction, null, null, 0, 11);
            ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver3);
            ImageReceiver imageReceiver4 = new ImageReceiver();
            imageReceiver4.setImage(ImageLocation.getForDocument(tLRPC$TL_availableReaction.center_icon), null, null, null, 0, 11);
            ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver4);
            ImageReceiver imageReceiver5 = new ImageReceiver();
            imageReceiver5.setImage(ImageLocation.getForDocument(tLRPC$TL_availableReaction.static_icon), null, null, null, 0, 11);
            ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver5);
        }
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.reactionsDidLoad, new Object[0]);
    }

    private void putReactionsToCache(List<TLRPC$TL_availableReaction> list, final int i, final int i2) {
        final ArrayList arrayList = list != null ? new ArrayList(list) : null;
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$putReactionsToCache$13(arrayList, i, i2);
            }
        });
    }

    public void lambda$putReactionsToCache$13(ArrayList arrayList, int i, int i2) {
        try {
            if (arrayList != null) {
                getMessagesStorage().getDatabase().executeFast("DELETE FROM reactions").stepThis().dispose();
                SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO reactions VALUES(?, ?, ?)");
                executeFast.requery();
                int i3 = 4;
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    i3 += ((TLRPC$TL_availableReaction) arrayList.get(i4)).getObjectSize();
                }
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(i3);
                nativeByteBuffer.writeInt32(arrayList.size());
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    ((TLRPC$TL_availableReaction) arrayList.get(i5)).serializeToStream(nativeByteBuffer);
                }
                executeFast.bindByteBuffer(1, nativeByteBuffer);
                executeFast.bindInteger(2, i);
                executeFast.bindInteger(3, i2);
                executeFast.step();
                nativeByteBuffer.reuse();
                executeFast.dispose();
                return;
            }
            SQLitePreparedStatement executeFast2 = getMessagesStorage().getDatabase().executeFast("UPDATE reactions SET date = ?");
            executeFast2.requery();
            executeFast2.bindLong(1, i2);
            executeFast2.step();
            executeFast2.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void checkFeaturedStickers() {
        if (this.loadingFeaturedStickers) {
            return;
        }
        if (!this.featuredStickersLoaded || Math.abs((System.currentTimeMillis() / 1000) - this.loadFeaturedDate) >= 3600) {
            loadFeaturedStickers(true, false);
        }
    }

    public ArrayList<TLRPC$Document> getRecentStickers(int i) {
        ArrayList<TLRPC$Document> arrayList = this.recentStickers[i];
        return new ArrayList<>(arrayList.subList(0, Math.min(arrayList.size(), 20)));
    }

    public ArrayList<TLRPC$Document> getRecentStickersNoCopy(int i) {
        return this.recentStickers[i];
    }

    public boolean isStickerInFavorites(TLRPC$Document tLRPC$Document) {
        if (tLRPC$Document == null) {
            return false;
        }
        for (int i = 0; i < this.recentStickers[2].size(); i++) {
            TLRPC$Document tLRPC$Document2 = this.recentStickers[2].get(i);
            if (tLRPC$Document2.id == tLRPC$Document.id && tLRPC$Document2.dc_id == tLRPC$Document.dc_id) {
                return true;
            }
        }
        return false;
    }

    public void clearRecentStickers() {
        getConnectionsManager().sendRequest(new TLObject() {
            public static int constructor = -1986437075;
            public boolean attached;
            public int flags;

            @Override
            public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
                return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                abstractSerializedData.writeInt32(constructor);
                int i = this.attached ? this.flags | 1 : this.flags & (-2);
                this.flags = i;
                abstractSerializedData.writeInt32(i);
            }
        }, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MediaDataController.this.lambda$clearRecentStickers$16(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$clearRecentStickers$16(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$clearRecentStickers$15(tLObject);
            }
        });
    }

    public void lambda$clearRecentStickers$15(TLObject tLObject) {
        if (tLObject instanceof TLRPC$TL_boolTrue) {
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$clearRecentStickers$14();
                }
            });
            this.recentStickers[0].clear();
            NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.recentDocumentsDidLoad, Boolean.FALSE, 0);
        }
    }

    public void lambda$clearRecentStickers$14() {
        try {
            getMessagesStorage().getDatabase().executeFast("DELETE FROM web_recent_v3 WHERE type = 3").stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void addRecentSticker(final int i, final Object obj, TLRPC$Document tLRPC$Document, int i2, boolean z) {
        boolean z2;
        int i3;
        final TLRPC$Document tLRPC$Document2;
        if (i == 3) {
            return;
        }
        if (MessageObject.isStickerDocument(tLRPC$Document) || MessageObject.isAnimatedStickerDocument(tLRPC$Document, true)) {
            int i4 = 0;
            while (true) {
                if (i4 >= this.recentStickers[i].size()) {
                    z2 = false;
                    break;
                }
                TLRPC$Document tLRPC$Document3 = this.recentStickers[i].get(i4);
                if (tLRPC$Document3.id == tLRPC$Document.id) {
                    this.recentStickers[i].remove(i4);
                    if (!z) {
                        this.recentStickers[i].add(0, tLRPC$Document3);
                    }
                    z2 = true;
                } else {
                    i4++;
                }
            }
            if (!z2 && !z) {
                this.recentStickers[i].add(0, tLRPC$Document);
            }
            if (i == 2) {
                if (z) {
                    NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.showBulletin, 0, tLRPC$Document, 4);
                } else {
                    boolean z3 = this.recentStickers[i].size() > getMessagesController().maxFaveStickersCount;
                    NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                    int i5 = NotificationCenter.showBulletin;
                    Object[] objArr = new Object[3];
                    objArr[0] = 0;
                    objArr[1] = tLRPC$Document;
                    objArr[2] = Integer.valueOf(z3 ? 6 : 5);
                    globalInstance.postNotificationName(i5, objArr);
                }
                final TLRPC$TL_messages_faveSticker tLRPC$TL_messages_faveSticker = new TLRPC$TL_messages_faveSticker();
                TLRPC$TL_inputDocument tLRPC$TL_inputDocument = new TLRPC$TL_inputDocument();
                tLRPC$TL_messages_faveSticker.id = tLRPC$TL_inputDocument;
                tLRPC$TL_inputDocument.id = tLRPC$Document.id;
                tLRPC$TL_inputDocument.access_hash = tLRPC$Document.access_hash;
                byte[] bArr = tLRPC$Document.file_reference;
                tLRPC$TL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tLRPC$TL_inputDocument.file_reference = new byte[0];
                }
                tLRPC$TL_messages_faveSticker.unfave = z;
                getConnectionsManager().sendRequest(tLRPC$TL_messages_faveSticker, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MediaDataController.this.lambda$addRecentSticker$18(obj, tLRPC$TL_messages_faveSticker, tLObject, tLRPC$TL_error);
                    }
                });
                i3 = getMessagesController().maxFaveStickersCount;
            } else {
                if (i == 0 && z) {
                    NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.showBulletin, 0, tLRPC$Document, 3);
                    final TLRPC$TL_messages_saveRecentSticker tLRPC$TL_messages_saveRecentSticker = new TLRPC$TL_messages_saveRecentSticker();
                    TLRPC$TL_inputDocument tLRPC$TL_inputDocument2 = new TLRPC$TL_inputDocument();
                    tLRPC$TL_messages_saveRecentSticker.id = tLRPC$TL_inputDocument2;
                    tLRPC$TL_inputDocument2.id = tLRPC$Document.id;
                    tLRPC$TL_inputDocument2.access_hash = tLRPC$Document.access_hash;
                    byte[] bArr2 = tLRPC$Document.file_reference;
                    tLRPC$TL_inputDocument2.file_reference = bArr2;
                    if (bArr2 == null) {
                        tLRPC$TL_inputDocument2.file_reference = new byte[0];
                    }
                    tLRPC$TL_messages_saveRecentSticker.unsave = true;
                    getConnectionsManager().sendRequest(tLRPC$TL_messages_saveRecentSticker, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            MediaDataController.this.lambda$addRecentSticker$19(obj, tLRPC$TL_messages_saveRecentSticker, tLObject, tLRPC$TL_error);
                        }
                    });
                }
                i3 = getMessagesController().maxRecentStickersCount;
            }
            if (this.recentStickers[i].size() > i3 || z) {
                if (z) {
                    tLRPC$Document2 = tLRPC$Document;
                } else {
                    ArrayList<TLRPC$Document>[] arrayListArr = this.recentStickers;
                    tLRPC$Document2 = arrayListArr[i].remove(arrayListArr[i].size() - 1);
                }
                getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        MediaDataController.this.lambda$addRecentSticker$20(i, tLRPC$Document2);
                    }
                });
            }
            if (!z) {
                ArrayList<TLRPC$Document> arrayList = new ArrayList<>();
                arrayList.add(tLRPC$Document);
                processLoadedRecentDocuments(i, arrayList, false, i2, false);
            }
            if (i == 2 || (i == 0 && z)) {
                getNotificationCenter().postNotificationName(NotificationCenter.recentDocumentsDidLoad, Boolean.FALSE, Integer.valueOf(i));
            }
        }
    }

    public void lambda$addRecentSticker$18(Object obj, TLRPC$TL_messages_faveSticker tLRPC$TL_messages_faveSticker, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null || !FileRefController.isFileRefError(tLRPC$TL_error.text) || obj == null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$addRecentSticker$17();
                }
            });
        } else {
            getFileRefController().requestReference(obj, tLRPC$TL_messages_faveSticker);
        }
    }

    public void lambda$addRecentSticker$17() {
        getMediaDataController().loadRecents(2, false, false, true);
    }

    public void lambda$addRecentSticker$19(Object obj, TLRPC$TL_messages_saveRecentSticker tLRPC$TL_messages_saveRecentSticker, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null && FileRefController.isFileRefError(tLRPC$TL_error.text) && obj != null) {
            getFileRefController().requestReference(obj, tLRPC$TL_messages_saveRecentSticker);
        }
    }

    public void lambda$addRecentSticker$20(int i, TLRPC$Document tLRPC$Document) {
        int i2 = i == 0 ? 3 : i == 1 ? 4 : 5;
        try {
            SQLiteDatabase database = getMessagesStorage().getDatabase();
            database.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + tLRPC$Document.id + "' AND type = " + i2).stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public ArrayList<TLRPC$Document> getRecentGifs() {
        return new ArrayList<>(this.recentGifs);
    }

    public void removeRecentGif(final TLRPC$Document tLRPC$Document) {
        int size = this.recentGifs.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            } else if (this.recentGifs.get(i).id == tLRPC$Document.id) {
                this.recentGifs.remove(i);
                break;
            } else {
                i++;
            }
        }
        final TLRPC$TL_messages_saveGif tLRPC$TL_messages_saveGif = new TLRPC$TL_messages_saveGif();
        TLRPC$TL_inputDocument tLRPC$TL_inputDocument = new TLRPC$TL_inputDocument();
        tLRPC$TL_messages_saveGif.id = tLRPC$TL_inputDocument;
        tLRPC$TL_inputDocument.id = tLRPC$Document.id;
        tLRPC$TL_inputDocument.access_hash = tLRPC$Document.access_hash;
        byte[] bArr = tLRPC$Document.file_reference;
        tLRPC$TL_inputDocument.file_reference = bArr;
        if (bArr == null) {
            tLRPC$TL_inputDocument.file_reference = new byte[0];
        }
        tLRPC$TL_messages_saveGif.unsave = true;
        getConnectionsManager().sendRequest(tLRPC$TL_messages_saveGif, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MediaDataController.this.lambda$removeRecentGif$21(tLRPC$TL_messages_saveGif, tLObject, tLRPC$TL_error);
            }
        });
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$removeRecentGif$22(tLRPC$Document);
            }
        });
    }

    public void lambda$removeRecentGif$21(TLRPC$TL_messages_saveGif tLRPC$TL_messages_saveGif, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null && FileRefController.isFileRefError(tLRPC$TL_error.text)) {
            getFileRefController().requestReference("gif", tLRPC$TL_messages_saveGif);
        }
    }

    public void lambda$removeRecentGif$22(TLRPC$Document tLRPC$Document) {
        try {
            SQLiteDatabase database = getMessagesStorage().getDatabase();
            database.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + tLRPC$Document.id + "' AND type = 2").stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public boolean hasRecentGif(TLRPC$Document tLRPC$Document) {
        for (int i = 0; i < this.recentGifs.size(); i++) {
            TLRPC$Document tLRPC$Document2 = this.recentGifs.get(i);
            if (tLRPC$Document2.id == tLRPC$Document.id) {
                this.recentGifs.remove(i);
                this.recentGifs.add(0, tLRPC$Document2);
                return true;
            }
        }
        return false;
    }

    public void addRecentGif(final TLRPC$Document tLRPC$Document, int i) {
        boolean z;
        if (tLRPC$Document != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.recentGifs.size()) {
                    z = false;
                    break;
                }
                TLRPC$Document tLRPC$Document2 = this.recentGifs.get(i2);
                if (tLRPC$Document2.id == tLRPC$Document.id) {
                    this.recentGifs.remove(i2);
                    this.recentGifs.add(0, tLRPC$Document2);
                    z = true;
                    break;
                }
                i2++;
            }
            if (!z) {
                this.recentGifs.add(0, tLRPC$Document);
            }
            if ((this.recentGifs.size() > getMessagesController().savedGifsLimitDefault && !UserConfig.getInstance(this.currentAccount).isPremium()) || this.recentGifs.size() > getMessagesController().savedGifsLimitPremium) {
                ArrayList<TLRPC$Document> arrayList = this.recentGifs;
                final TLRPC$Document remove = arrayList.remove(arrayList.size() - 1);
                getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        MediaDataController.this.lambda$addRecentGif$23(remove);
                    }
                });
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MediaDataController.lambda$addRecentGif$24(TLRPC$Document.this);
                    }
                });
            }
            ArrayList<TLRPC$Document> arrayList2 = new ArrayList<>();
            arrayList2.add(tLRPC$Document);
            processLoadedRecentDocuments(0, arrayList2, true, i, false);
        }
    }

    public void lambda$addRecentGif$23(TLRPC$Document tLRPC$Document) {
        try {
            SQLiteDatabase database = getMessagesStorage().getDatabase();
            database.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + tLRPC$Document.id + "' AND type = 2").stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void lambda$addRecentGif$24(TLRPC$Document tLRPC$Document) {
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.showBulletin, 0, tLRPC$Document, 7);
    }

    public boolean isLoadingStickers(int i) {
        return this.loadingStickers[i];
    }

    public void replaceStickerSet(final TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet) {
        TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet2 = this.stickerSetsById.get(tLRPC$TL_messages_stickerSet.set.id);
        String str = this.diceEmojiStickerSetsById.get(tLRPC$TL_messages_stickerSet.set.id);
        if (str != null) {
            this.diceStickerSetsByEmoji.put(str, tLRPC$TL_messages_stickerSet);
            putDiceStickersToCache(str, tLRPC$TL_messages_stickerSet, (int) (System.currentTimeMillis() / 1000));
        }
        if (tLRPC$TL_messages_stickerSet2 == null) {
            tLRPC$TL_messages_stickerSet2 = this.stickerSetsByName.get(tLRPC$TL_messages_stickerSet.set.short_name);
        }
        boolean z = true;
        boolean z2 = tLRPC$TL_messages_stickerSet2 == null && (tLRPC$TL_messages_stickerSet2 = this.groupStickerSets.get(tLRPC$TL_messages_stickerSet.set.id)) != null;
        if (tLRPC$TL_messages_stickerSet2 != null) {
            if ("AnimatedEmojies".equals(tLRPC$TL_messages_stickerSet.set.short_name)) {
                tLRPC$TL_messages_stickerSet2.documents = tLRPC$TL_messages_stickerSet.documents;
                tLRPC$TL_messages_stickerSet2.packs = tLRPC$TL_messages_stickerSet.packs;
                tLRPC$TL_messages_stickerSet2.set = tLRPC$TL_messages_stickerSet.set;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MediaDataController.this.lambda$replaceStickerSet$25(tLRPC$TL_messages_stickerSet);
                    }
                });
            } else {
                LongSparseArray longSparseArray = new LongSparseArray();
                int size = tLRPC$TL_messages_stickerSet.documents.size();
                for (int i = 0; i < size; i++) {
                    TLRPC$Document tLRPC$Document = tLRPC$TL_messages_stickerSet.documents.get(i);
                    longSparseArray.put(tLRPC$Document.id, tLRPC$Document);
                }
                int size2 = tLRPC$TL_messages_stickerSet2.documents.size();
                boolean z3 = false;
                for (int i2 = 0; i2 < size2; i2++) {
                    TLRPC$Document tLRPC$Document2 = (TLRPC$Document) longSparseArray.get(tLRPC$TL_messages_stickerSet2.documents.get(i2).id);
                    if (tLRPC$Document2 != null) {
                        tLRPC$TL_messages_stickerSet2.documents.set(i2, tLRPC$Document2);
                        z3 = true;
                    }
                }
                z = z3;
            }
            if (!z) {
                return;
            }
            if (z2) {
                putSetToCache(tLRPC$TL_messages_stickerSet2);
                return;
            }
            ?? r7 = tLRPC$TL_messages_stickerSet.set.masks;
            putStickersToCache(r7 == true ? 1 : 0, this.stickerSets[r7 == true ? 1 : 0], this.loadDate[r7], this.loadHash[r7]);
            if ("AnimatedEmojies".equals(tLRPC$TL_messages_stickerSet.set.short_name)) {
                putStickersToCache(4, this.stickerSets[4], this.loadDate[4], this.loadHash[4]);
            }
        }
    }

    public void lambda$replaceStickerSet$25(TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet) {
        LongSparseArray<TLRPC$Document> stickerByIds = getStickerByIds(4);
        for (int i = 0; i < tLRPC$TL_messages_stickerSet.documents.size(); i++) {
            TLRPC$Document tLRPC$Document = tLRPC$TL_messages_stickerSet.documents.get(i);
            stickerByIds.put(tLRPC$Document.id, tLRPC$Document);
        }
    }

    public TLRPC$TL_messages_stickerSet getStickerSetByName(String str) {
        return this.stickerSetsByName.get(str);
    }

    public TLRPC$TL_messages_stickerSet getStickerSetByEmojiOrName(String str) {
        return this.diceStickerSetsByEmoji.get(str);
    }

    public TLRPC$TL_messages_stickerSet getStickerSetById(long j) {
        return this.stickerSetsById.get(j);
    }

    public TLRPC$TL_messages_stickerSet getGroupStickerSetById(TLRPC$StickerSet tLRPC$StickerSet) {
        TLRPC$StickerSet tLRPC$StickerSet2;
        TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = this.stickerSetsById.get(tLRPC$StickerSet.id);
        if (tLRPC$TL_messages_stickerSet == null) {
            tLRPC$TL_messages_stickerSet = this.groupStickerSets.get(tLRPC$StickerSet.id);
            if (tLRPC$TL_messages_stickerSet == null || (tLRPC$StickerSet2 = tLRPC$TL_messages_stickerSet.set) == null) {
                loadGroupStickerSet(tLRPC$StickerSet, true);
            } else if (tLRPC$StickerSet2.hash != tLRPC$StickerSet.hash) {
                loadGroupStickerSet(tLRPC$StickerSet, false);
            }
        }
        return tLRPC$TL_messages_stickerSet;
    }

    public void putGroupStickerSet(TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet) {
        this.groupStickerSets.put(tLRPC$TL_messages_stickerSet.set.id, tLRPC$TL_messages_stickerSet);
    }

    private void loadGroupStickerSet(final TLRPC$StickerSet tLRPC$StickerSet, boolean z) {
        if (z) {
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$loadGroupStickerSet$27(tLRPC$StickerSet);
                }
            });
            return;
        }
        TLRPC$TL_messages_getStickerSet tLRPC$TL_messages_getStickerSet = new TLRPC$TL_messages_getStickerSet();
        TLRPC$TL_inputStickerSetID tLRPC$TL_inputStickerSetID = new TLRPC$TL_inputStickerSetID();
        tLRPC$TL_messages_getStickerSet.stickerset = tLRPC$TL_inputStickerSetID;
        tLRPC$TL_inputStickerSetID.id = tLRPC$StickerSet.id;
        tLRPC$TL_inputStickerSetID.access_hash = tLRPC$StickerSet.access_hash;
        getConnectionsManager().sendRequest(tLRPC$TL_messages_getStickerSet, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MediaDataController.this.lambda$loadGroupStickerSet$29(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadGroupStickerSet$27(TLRPC$StickerSet tLRPC$StickerSet) {
        TLRPC$StickerSet tLRPC$StickerSet2;
        NativeByteBuffer byteBufferValue;
        try {
            SQLiteDatabase database = getMessagesStorage().getDatabase();
            SQLiteCursor queryFinalized = database.queryFinalized("SELECT document FROM web_recent_v3 WHERE id = 's_" + tLRPC$StickerSet.id + "'", new Object[0]);
            final TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = null;
            if (queryFinalized.next() && !queryFinalized.isNull(0) && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                tLRPC$TL_messages_stickerSet = TLRPC$messages_StickerSet.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                byteBufferValue.reuse();
            }
            queryFinalized.dispose();
            if (tLRPC$TL_messages_stickerSet == null || (tLRPC$StickerSet2 = tLRPC$TL_messages_stickerSet.set) == null || tLRPC$StickerSet2.hash != tLRPC$StickerSet.hash) {
                loadGroupStickerSet(tLRPC$StickerSet, false);
            }
            if (tLRPC$TL_messages_stickerSet != null && tLRPC$TL_messages_stickerSet.set != null) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MediaDataController.this.lambda$loadGroupStickerSet$26(tLRPC$TL_messages_stickerSet);
                    }
                });
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public void lambda$loadGroupStickerSet$26(TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet) {
        this.groupStickerSets.put(tLRPC$TL_messages_stickerSet.set.id, tLRPC$TL_messages_stickerSet);
        getNotificationCenter().postNotificationName(NotificationCenter.groupStickersDidLoad, Long.valueOf(tLRPC$TL_messages_stickerSet.set.id));
    }

    public void lambda$loadGroupStickerSet$29(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            final TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = (TLRPC$TL_messages_stickerSet) tLObject;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$loadGroupStickerSet$28(tLRPC$TL_messages_stickerSet);
                }
            });
        }
    }

    public void lambda$loadGroupStickerSet$28(TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet) {
        this.groupStickerSets.put(tLRPC$TL_messages_stickerSet.set.id, tLRPC$TL_messages_stickerSet);
        getNotificationCenter().postNotificationName(NotificationCenter.groupStickersDidLoad, Long.valueOf(tLRPC$TL_messages_stickerSet.set.id));
    }

    private void putSetToCache(final TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$putSetToCache$30(tLRPC$TL_messages_stickerSet);
            }
        });
    }

    public void lambda$putSetToCache$30(TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet) {
        try {
            SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO web_recent_v3 VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            executeFast.requery();
            executeFast.bindString(1, "s_" + tLRPC$TL_messages_stickerSet.set.id);
            executeFast.bindInteger(2, 6);
            executeFast.bindString(3, "");
            executeFast.bindString(4, "");
            executeFast.bindString(5, "");
            executeFast.bindInteger(6, 0);
            executeFast.bindInteger(7, 0);
            executeFast.bindInteger(8, 0);
            executeFast.bindInteger(9, 0);
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLRPC$TL_messages_stickerSet.getObjectSize());
            tLRPC$TL_messages_stickerSet.serializeToStream(nativeByteBuffer);
            executeFast.bindByteBuffer(10, nativeByteBuffer);
            executeFast.step();
            nativeByteBuffer.reuse();
            executeFast.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public HashMap<String, ArrayList<TLRPC$Document>> getAllStickers() {
        return this.allStickers;
    }

    public HashMap<String, ArrayList<TLRPC$Document>> getAllStickersFeatured() {
        return this.allStickersFeatured;
    }

    public TLRPC$Document getEmojiAnimatedSticker(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String replace = charSequence.toString().replace("️", "");
        ArrayList<TLRPC$TL_messages_stickerSet> stickerSets = getStickerSets(4);
        int size = stickerSets.size();
        for (int i = 0; i < size; i++) {
            TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = stickerSets.get(i);
            int size2 = tLRPC$TL_messages_stickerSet.packs.size();
            for (int i2 = 0; i2 < size2; i2++) {
                TLRPC$TL_stickerPack tLRPC$TL_stickerPack = tLRPC$TL_messages_stickerSet.packs.get(i2);
                if (!tLRPC$TL_stickerPack.documents.isEmpty() && TextUtils.equals(tLRPC$TL_stickerPack.emoticon, replace)) {
                    return getStickerByIds(4).get(tLRPC$TL_stickerPack.documents.get(0).longValue());
                }
            }
        }
        return null;
    }

    public boolean canAddStickerToFavorites() {
        return !this.stickersLoaded[0] || this.stickerSets[0].size() >= 5 || !this.recentStickers[2].isEmpty();
    }

    public ArrayList<TLRPC$TL_messages_stickerSet> getStickerSets(int i) {
        if (i == 3) {
            return this.stickerSets[2];
        }
        return this.stickerSets[i];
    }

    public LongSparseArray<TLRPC$Document> getStickerByIds(int i) {
        return this.stickersByIds[i];
    }

    public ArrayList<TLRPC$StickerSetCovered> getFeaturedStickerSets() {
        return this.featuredStickerSets;
    }

    public ArrayList<Long> getUnreadStickerSets() {
        return this.unreadStickerSets;
    }

    public boolean areAllTrendingStickerSetsUnread() {
        int size = this.featuredStickerSets.size();
        for (int i = 0; i < size; i++) {
            TLRPC$StickerSetCovered tLRPC$StickerSetCovered = this.featuredStickerSets.get(i);
            if (!(isStickerPackInstalled(tLRPC$StickerSetCovered.set.id) || ((tLRPC$StickerSetCovered.covers.isEmpty() && tLRPC$StickerSetCovered.cover == null) || this.unreadStickerSets.contains(Long.valueOf(tLRPC$StickerSetCovered.set.id))))) {
                return false;
            }
        }
        return true;
    }

    public boolean isStickerPackInstalled(long j) {
        return this.installedStickerSetsById.indexOfKey(j) >= 0;
    }

    public boolean isStickerPackUnread(long j) {
        return this.unreadStickerSets.contains(Long.valueOf(j));
    }

    public boolean isStickerPackInstalled(String str) {
        return this.stickerSetsByName.containsKey(str);
    }

    public String getEmojiForSticker(long j) {
        String str = this.stickersByEmoji.get(j);
        return str != null ? str : "";
    }

    public static boolean canShowAttachMenuBotForTarget(TLRPC$TL_attachMenuBot tLRPC$TL_attachMenuBot, String str) {
        Iterator<TLRPC$AttachMenuPeerType> it = tLRPC$TL_attachMenuBot.peer_types.iterator();
        while (it.hasNext()) {
            TLRPC$AttachMenuPeerType next = it.next();
            if (((next instanceof TLRPC$TL_attachMenuPeerTypeSameBotPM) || (next instanceof TLRPC$TL_attachMenuPeerTypeBotPM)) && str.equals("bots")) {
                return true;
            }
            if ((next instanceof TLRPC$TL_attachMenuPeerTypeBroadcast) && str.equals("channels")) {
                return true;
            }
            if ((next instanceof TLRPC$TL_attachMenuPeerTypeChat) && str.equals("groups")) {
                return true;
            }
            if ((next instanceof TLRPC$TL_attachMenuPeerTypePM) && str.equals("users")) {
                return true;
            }
        }
        return false;
    }

    public static boolean canShowAttachMenuBot(TLRPC$TL_attachMenuBot tLRPC$TL_attachMenuBot, TLObject tLObject) {
        TLRPC$Chat tLRPC$Chat = null;
        TLRPC$User tLRPC$User = tLObject instanceof TLRPC$User ? (TLRPC$User) tLObject : null;
        if (tLObject instanceof TLRPC$Chat) {
            tLRPC$Chat = (TLRPC$Chat) tLObject;
        }
        Iterator<TLRPC$AttachMenuPeerType> it = tLRPC$TL_attachMenuBot.peer_types.iterator();
        while (it.hasNext()) {
            TLRPC$AttachMenuPeerType next = it.next();
            if ((next instanceof TLRPC$TL_attachMenuPeerTypeSameBotPM) && tLRPC$User != null && tLRPC$User.bot && tLRPC$User.id == tLRPC$TL_attachMenuBot.bot_id) {
                return true;
            }
            if ((next instanceof TLRPC$TL_attachMenuPeerTypeBotPM) && tLRPC$User != null && tLRPC$User.bot && tLRPC$User.id != tLRPC$TL_attachMenuBot.bot_id) {
                return true;
            }
            if ((next instanceof TLRPC$TL_attachMenuPeerTypePM) && tLRPC$User != null && !tLRPC$User.bot) {
                return true;
            }
            if ((next instanceof TLRPC$TL_attachMenuPeerTypeChat) && tLRPC$Chat != null && !ChatObject.isChannelAndNotMegaGroup(tLRPC$Chat)) {
                return true;
            }
            if ((next instanceof TLRPC$TL_attachMenuPeerTypeBroadcast) && tLRPC$Chat != null && ChatObject.isChannelAndNotMegaGroup(tLRPC$Chat)) {
                return true;
            }
        }
        return false;
    }

    public static TLRPC$TL_attachMenuBotIcon getAnimatedAttachMenuBotIcon(TLRPC$TL_attachMenuBot tLRPC$TL_attachMenuBot) {
        Iterator<TLRPC$TL_attachMenuBotIcon> it = tLRPC$TL_attachMenuBot.icons.iterator();
        while (it.hasNext()) {
            TLRPC$TL_attachMenuBotIcon next = it.next();
            if (next.name.equals(ATTACH_MENU_BOT_ANIMATED_ICON_KEY)) {
                return next;
            }
        }
        return null;
    }

    public static TLRPC$TL_attachMenuBotIcon getStaticAttachMenuBotIcon(TLRPC$TL_attachMenuBot tLRPC$TL_attachMenuBot) {
        Iterator<TLRPC$TL_attachMenuBotIcon> it = tLRPC$TL_attachMenuBot.icons.iterator();
        while (it.hasNext()) {
            TLRPC$TL_attachMenuBotIcon next = it.next();
            if (next.name.equals(ATTACH_MENU_BOT_STATIC_ICON_KEY)) {
                return next;
            }
        }
        return null;
    }

    public static TLRPC$TL_attachMenuBotIcon getPlaceholderStaticAttachMenuBotIcon(TLRPC$TL_attachMenuBot tLRPC$TL_attachMenuBot) {
        Iterator<TLRPC$TL_attachMenuBotIcon> it = tLRPC$TL_attachMenuBot.icons.iterator();
        while (it.hasNext()) {
            TLRPC$TL_attachMenuBotIcon next = it.next();
            if (next.name.equals(ATTACH_MENU_BOT_PLACEHOLDER_STATIC_KEY)) {
                return next;
            }
        }
        return null;
    }

    public static long calcDocumentsHash(ArrayList<TLRPC$Document> arrayList) {
        return calcDocumentsHash(arrayList, 200);
    }

    public static long calcDocumentsHash(ArrayList<TLRPC$Document> arrayList, int i) {
        long j = 0;
        if (arrayList == null) {
            return 0L;
        }
        int min = Math.min(i, arrayList.size());
        for (int i2 = 0; i2 < min; i2++) {
            TLRPC$Document tLRPC$Document = arrayList.get(i2);
            if (tLRPC$Document != null) {
                j = calcHash(j, tLRPC$Document.id);
            }
        }
        return j;
    }

    public void loadRecents(final int r7, final boolean r8, boolean r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.loadRecents(int, boolean, boolean, boolean):void");
    }

    public void lambda$loadRecents$32(final boolean z, final int i) {
        NativeByteBuffer byteBufferValue;
        int i2 = 3;
        if (z) {
            i2 = 2;
        } else if (i != 0) {
            if (i == 1) {
                i2 = 4;
            } else {
                i2 = i == 3 ? 6 : 5;
            }
        }
        try {
            SQLiteDatabase database = getMessagesStorage().getDatabase();
            SQLiteCursor queryFinalized = database.queryFinalized("SELECT document FROM web_recent_v3 WHERE type = " + i2 + " ORDER BY date DESC", new Object[0]);
            final ArrayList arrayList = new ArrayList();
            while (queryFinalized.next()) {
                if (!queryFinalized.isNull(0) && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                    TLRPC$Document TLdeserialize = TLRPC$Document.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    if (TLdeserialize != null) {
                        arrayList.add(TLdeserialize);
                    }
                    byteBufferValue.reuse();
                }
            }
            queryFinalized.dispose();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$loadRecents$31(z, arrayList, i);
                }
            });
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public void lambda$loadRecents$31(boolean z, ArrayList arrayList, int i) {
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
        getNotificationCenter().postNotificationName(NotificationCenter.recentDocumentsDidLoad, Boolean.valueOf(z), Integer.valueOf(i));
        loadRecents(i, z, false, false);
    }

    public void lambda$loadRecents$33(int i, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        processLoadedRecentDocuments(i, tLObject instanceof TLRPC$TL_messages_savedGifs ? ((TLRPC$TL_messages_savedGifs) tLObject).gifs : null, true, 0, true);
    }

    public void lambda$loadRecents$34(int i, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        ArrayList<TLRPC$Document> arrayList;
        if (i == 3) {
            if (tLObject instanceof TLRPC$TL_messages_stickers) {
                arrayList = ((TLRPC$TL_messages_stickers) tLObject).stickers;
            }
            arrayList = null;
        } else if (i == 2) {
            if (tLObject instanceof TLRPC$TL_messages_favedStickers) {
                arrayList = ((TLRPC$TL_messages_favedStickers) tLObject).stickers;
            }
            arrayList = null;
        } else {
            if (tLObject instanceof TLRPC$TL_messages_recentStickers) {
                arrayList = ((TLRPC$TL_messages_recentStickers) tLObject).stickers;
            }
            arrayList = null;
        }
        processLoadedRecentDocuments(i, arrayList, false, 0, true);
    }

    private void preloadNextGreetingsSticker() {
        if (!this.recentStickers[3].isEmpty()) {
            ArrayList<TLRPC$Document>[] arrayListArr = this.recentStickers;
            this.greetingsSticker = arrayListArr[3].get(Utilities.random.nextInt(arrayListArr[3].size()));
            getFileLoader().loadFile(ImageLocation.getForDocument(this.greetingsSticker), this.greetingsSticker, null, 0, 1);
        }
    }

    public TLRPC$Document getGreetingsSticker() {
        TLRPC$Document tLRPC$Document = this.greetingsSticker;
        preloadNextGreetingsSticker();
        return tLRPC$Document;
    }

    public void processLoadedRecentDocuments(final int i, final ArrayList<TLRPC$Document> arrayList, final boolean z, final int i2, final boolean z2) {
        if (arrayList != null) {
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$processLoadedRecentDocuments$35(z, i, arrayList, z2, i2);
                }
            });
        }
        if (i2 == 0) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$processLoadedRecentDocuments$36(z, i, arrayList);
                }
            });
        }
    }

    public void lambda$processLoadedRecentDocuments$35(boolean z, int i, ArrayList arrayList, boolean z2, int i2) {
        int i3;
        int i4;
        try {
            SQLiteDatabase database = getMessagesStorage().getDatabase();
            int i5 = 2;
            if (z) {
                i3 = getMessagesController().maxRecentGifsCount;
            } else if (i == 3) {
                i3 = 200;
            } else if (i == 2) {
                i3 = getMessagesController().maxFaveStickersCount;
            } else {
                i3 = getMessagesController().maxRecentStickersCount;
            }
            database.beginTransaction();
            SQLitePreparedStatement executeFast = database.executeFast("REPLACE INTO web_recent_v3 VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            int size = arrayList.size();
            if (z) {
                i4 = 2;
            } else if (i == 0) {
                i4 = 3;
            } else if (i == 1) {
                i4 = 4;
            } else {
                i4 = i == 3 ? 6 : 5;
            }
            if (z2) {
                database.executeFast("DELETE FROM web_recent_v3 WHERE type = " + i4).stepThis().dispose();
            }
            int i6 = 0;
            while (i6 < size && i6 != i3) {
                TLRPC$Document tLRPC$Document = (TLRPC$Document) arrayList.get(i6);
                executeFast.requery();
                StringBuilder sb = new StringBuilder();
                sb.append("");
                int i7 = i6;
                sb.append(tLRPC$Document.id);
                executeFast.bindString(1, sb.toString());
                executeFast.bindInteger(i5, i4);
                executeFast.bindString(3, "");
                executeFast.bindString(4, "");
                executeFast.bindString(5, "");
                executeFast.bindInteger(6, 0);
                executeFast.bindInteger(7, 0);
                executeFast.bindInteger(8, 0);
                executeFast.bindInteger(9, i2 != 0 ? i2 : size - i7);
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLRPC$Document.getObjectSize());
                tLRPC$Document.serializeToStream(nativeByteBuffer);
                executeFast.bindByteBuffer(10, nativeByteBuffer);
                executeFast.step();
                nativeByteBuffer.reuse();
                i6 = i7 + 1;
                i5 = 2;
            }
            executeFast.dispose();
            database.commitTransaction();
            if (arrayList.size() >= i3) {
                database.beginTransaction();
                while (i3 < arrayList.size()) {
                    database.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + ((TLRPC$Document) arrayList.get(i3)).id + "' AND type = " + i4).stepThis().dispose();
                    i3++;
                }
                database.commitTransaction();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$processLoadedRecentDocuments$36(boolean z, int i, ArrayList arrayList) {
        SharedPreferences.Editor edit = MessagesController.getEmojiSettings(this.currentAccount).edit();
        if (z) {
            this.loadingRecentGifs = false;
            this.recentGifsLoaded = true;
            edit.putLong("lastGifLoadTime", System.currentTimeMillis()).commit();
        } else {
            this.loadingRecentStickers[i] = false;
            this.recentStickersLoaded[i] = true;
            if (i == 0) {
                edit.putLong("lastStickersLoadTime", System.currentTimeMillis()).commit();
            } else if (i == 1) {
                edit.putLong("lastStickersLoadTimeMask", System.currentTimeMillis()).commit();
            } else if (i == 3) {
                edit.putLong("lastStickersLoadTimeGreet", System.currentTimeMillis()).commit();
            } else {
                edit.putLong("lastStickersLoadTimeFavs", System.currentTimeMillis()).commit();
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
            getNotificationCenter().postNotificationName(NotificationCenter.recentDocumentsDidLoad, Boolean.valueOf(z), Integer.valueOf(i));
        }
    }

    public void reorderStickers(int i, final ArrayList<Long> arrayList) {
        Collections.sort(this.stickerSets[i], new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                int lambda$reorderStickers$37;
                lambda$reorderStickers$37 = MediaDataController.lambda$reorderStickers$37(arrayList, (TLRPC$TL_messages_stickerSet) obj, (TLRPC$TL_messages_stickerSet) obj2);
                return lambda$reorderStickers$37;
            }
        });
        this.loadHash[i] = calcStickersHash(this.stickerSets[i]);
        getNotificationCenter().postNotificationName(NotificationCenter.stickersDidLoad, Integer.valueOf(i));
        loadStickers(i, false, true);
    }

    public static int lambda$reorderStickers$37(ArrayList arrayList, TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet, TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet2) {
        int indexOf = arrayList.indexOf(Long.valueOf(tLRPC$TL_messages_stickerSet.set.id));
        int indexOf2 = arrayList.indexOf(Long.valueOf(tLRPC$TL_messages_stickerSet2.set.id));
        if (indexOf > indexOf2) {
            return 1;
        }
        return indexOf < indexOf2 ? -1 : 0;
    }

    public void calcNewHash(int i) {
        this.loadHash[i] = calcStickersHash(this.stickerSets[i]);
    }

    public void storeTempStickerSet(TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet) {
        this.stickerSetsById.put(tLRPC$TL_messages_stickerSet.set.id, tLRPC$TL_messages_stickerSet);
        this.stickerSetsByName.put(tLRPC$TL_messages_stickerSet.set.short_name, tLRPC$TL_messages_stickerSet);
    }

    public void addNewStickerSet(TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet) {
        if (this.stickerSetsById.indexOfKey(tLRPC$TL_messages_stickerSet.set.id) < 0 && !this.stickerSetsByName.containsKey(tLRPC$TL_messages_stickerSet.set.short_name)) {
            ?? r0 = tLRPC$TL_messages_stickerSet.set.masks;
            this.stickerSets[r0 == true ? 1 : 0].add(0, tLRPC$TL_messages_stickerSet);
            this.stickerSetsById.put(tLRPC$TL_messages_stickerSet.set.id, tLRPC$TL_messages_stickerSet);
            this.installedStickerSetsById.put(tLRPC$TL_messages_stickerSet.set.id, tLRPC$TL_messages_stickerSet);
            this.stickerSetsByName.put(tLRPC$TL_messages_stickerSet.set.short_name, tLRPC$TL_messages_stickerSet);
            LongSparseArray longSparseArray = new LongSparseArray();
            for (int i = 0; i < tLRPC$TL_messages_stickerSet.documents.size(); i++) {
                TLRPC$Document tLRPC$Document = tLRPC$TL_messages_stickerSet.documents.get(i);
                longSparseArray.put(tLRPC$Document.id, tLRPC$Document);
            }
            for (int i2 = 0; i2 < tLRPC$TL_messages_stickerSet.packs.size(); i2++) {
                TLRPC$TL_stickerPack tLRPC$TL_stickerPack = tLRPC$TL_messages_stickerSet.packs.get(i2);
                String replace = tLRPC$TL_stickerPack.emoticon.replace("️", "");
                tLRPC$TL_stickerPack.emoticon = replace;
                ArrayList<TLRPC$Document> arrayList = this.allStickers.get(replace);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.allStickers.put(tLRPC$TL_stickerPack.emoticon, arrayList);
                }
                for (int i3 = 0; i3 < tLRPC$TL_stickerPack.documents.size(); i3++) {
                    Long l = tLRPC$TL_stickerPack.documents.get(i3);
                    if (this.stickersByEmoji.indexOfKey(l.longValue()) < 0) {
                        this.stickersByEmoji.put(l.longValue(), tLRPC$TL_stickerPack.emoticon);
                    }
                    TLRPC$Document tLRPC$Document2 = (TLRPC$Document) longSparseArray.get(l.longValue());
                    if (tLRPC$Document2 != null) {
                        arrayList.add(tLRPC$Document2);
                    }
                }
            }
            this.loadHash[r0] = calcStickersHash(this.stickerSets[r0]);
            getNotificationCenter().postNotificationName(NotificationCenter.stickersDidLoad, Integer.valueOf(r0 == true ? 1 : 0));
            loadStickers(r0, false, true);
        }
    }

    public void loadFeaturedStickers(boolean z, boolean z2) {
        if (!this.loadingFeaturedStickers) {
            this.loadingFeaturedStickers = true;
            if (z) {
                getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        MediaDataController.this.lambda$loadFeaturedStickers$38();
                    }
                });
                return;
            }
            final TLRPC$TL_messages_getFeaturedStickers tLRPC$TL_messages_getFeaturedStickers = new TLRPC$TL_messages_getFeaturedStickers();
            tLRPC$TL_messages_getFeaturedStickers.hash = z2 ? 0L : this.loadFeaturedHash;
            getConnectionsManager().sendRequest(tLRPC$TL_messages_getFeaturedStickers, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MediaDataController.this.lambda$loadFeaturedStickers$40(tLRPC$TL_messages_getFeaturedStickers, tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$loadFeaturedStickers$38() {
        ArrayList<TLRPC$StickerSetCovered> arrayList;
        SQLiteCursor sQLiteCursor;
        Throwable th;
        long j;
        int i;
        ArrayList<TLRPC$StickerSetCovered> arrayList2;
        ArrayList<Long> arrayList3 = new ArrayList<>();
        ArrayList<TLRPC$StickerSetCovered> arrayList4 = null;
        int i2 = 0;
        long j2 = 0;
        try {
            sQLiteCursor = getMessagesStorage().getDatabase().queryFinalized("SELECT data, unread, date, hash FROM stickers_featured WHERE 1", new Object[0]);
            try {
                if (sQLiteCursor.next()) {
                    NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                    if (byteBufferValue != null) {
                        arrayList = new ArrayList<>();
                        try {
                            int readInt32 = byteBufferValue.readInt32(false);
                            for (int i3 = 0; i3 < readInt32; i3++) {
                                arrayList.add(TLRPC$StickerSetCovered.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false));
                            }
                            byteBufferValue.reuse();
                            arrayList4 = arrayList;
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                FileLog.e(th);
                                j = 0;
                                i = i2;
                                arrayList2 = arrayList;
                                processLoadedFeaturedStickers(arrayList2, arrayList3, true, i, j);
                            } finally {
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                            }
                        }
                    }
                    NativeByteBuffer byteBufferValue2 = sQLiteCursor.byteBufferValue(1);
                    if (byteBufferValue2 != null) {
                        int readInt322 = byteBufferValue2.readInt32(false);
                        for (int i4 = 0; i4 < readInt322; i4++) {
                            arrayList3.add(Long.valueOf(byteBufferValue2.readInt64(false)));
                        }
                        byteBufferValue2.reuse();
                    }
                    i2 = sQLiteCursor.intValue(2);
                    j2 = calcFeaturedStickersHash(arrayList4);
                }
                sQLiteCursor.dispose();
                j = j2;
                i = i2;
                arrayList2 = arrayList4;
            } catch (Throwable th3) {
                th = th3;
                arrayList = arrayList4;
            }
        } catch (Throwable th4) {
            th = th4;
            arrayList = null;
            sQLiteCursor = null;
        }
        processLoadedFeaturedStickers(arrayList2, arrayList3, true, i, j);
    }

    public void lambda$loadFeaturedStickers$40(final TLRPC$TL_messages_getFeaturedStickers tLRPC$TL_messages_getFeaturedStickers, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$loadFeaturedStickers$39(tLObject, tLRPC$TL_messages_getFeaturedStickers);
            }
        });
    }

    public void lambda$loadFeaturedStickers$39(TLObject tLObject, TLRPC$TL_messages_getFeaturedStickers tLRPC$TL_messages_getFeaturedStickers) {
        if (tLObject instanceof TLRPC$TL_messages_featuredStickers) {
            TLRPC$TL_messages_featuredStickers tLRPC$TL_messages_featuredStickers = (TLRPC$TL_messages_featuredStickers) tLObject;
            processLoadedFeaturedStickers(tLRPC$TL_messages_featuredStickers.sets, tLRPC$TL_messages_featuredStickers.unread, false, (int) (System.currentTimeMillis() / 1000), tLRPC$TL_messages_featuredStickers.hash);
            return;
        }
        processLoadedFeaturedStickers(null, null, false, (int) (System.currentTimeMillis() / 1000), tLRPC$TL_messages_getFeaturedStickers.hash);
    }

    private void processLoadedFeaturedStickers(final ArrayList<TLRPC$StickerSetCovered> arrayList, final ArrayList<Long> arrayList2, final boolean z, final int i, final long j) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$processLoadedFeaturedStickers$41();
            }
        });
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$processLoadedFeaturedStickers$45(z, arrayList, i, j, arrayList2);
            }
        });
    }

    public void lambda$processLoadedFeaturedStickers$41() {
        this.loadingFeaturedStickers = false;
        this.featuredStickersLoaded = true;
    }

    public void lambda$processLoadedFeaturedStickers$45(boolean z, final ArrayList arrayList, final int i, final long j, final ArrayList arrayList2) {
        long j2 = 0;
        if ((z && (arrayList == null || Math.abs((System.currentTimeMillis() / 1000) - i) >= 3600)) || (!z && arrayList == null && j == 0)) {
            Runnable mediaDataController$$ExternalSyntheticLambda68 = new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$processLoadedFeaturedStickers$42(arrayList, j);
                }
            };
            if (arrayList == null && !z) {
                j2 = 1000;
            }
            AndroidUtilities.runOnUIThread(mediaDataController$$ExternalSyntheticLambda68, j2);
            if (arrayList == null) {
                return;
            }
        }
        if (arrayList != null) {
            try {
                final ArrayList<TLRPC$StickerSetCovered> arrayList3 = new ArrayList<>();
                final LongSparseArray longSparseArray = new LongSparseArray();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    TLRPC$StickerSetCovered tLRPC$StickerSetCovered = (TLRPC$StickerSetCovered) arrayList.get(i2);
                    arrayList3.add(tLRPC$StickerSetCovered);
                    longSparseArray.put(tLRPC$StickerSetCovered.set.id, tLRPC$StickerSetCovered);
                }
                if (!z) {
                    putFeaturedStickersToCache(arrayList3, arrayList2, i, j);
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MediaDataController.this.lambda$processLoadedFeaturedStickers$43(arrayList2, longSparseArray, arrayList3, j, i);
                    }
                });
            } catch (Throwable th) {
                FileLog.e(th);
            }
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$processLoadedFeaturedStickers$44(i);
                }
            });
            putFeaturedStickersToCache(null, null, i, 0L);
        }
    }

    public void lambda$processLoadedFeaturedStickers$42(ArrayList arrayList, long j) {
        if (!(arrayList == null || j == 0)) {
            this.loadFeaturedHash = j;
        }
        loadFeaturedStickers(false, false);
    }

    public void lambda$processLoadedFeaturedStickers$43(ArrayList arrayList, LongSparseArray longSparseArray, ArrayList arrayList2, long j, int i) {
        this.unreadStickerSets = arrayList;
        this.featuredStickerSetsById = longSparseArray;
        this.featuredStickerSets = arrayList2;
        this.loadFeaturedHash = j;
        this.loadFeaturedDate = i;
        loadStickers(3, true, false);
        getNotificationCenter().postNotificationName(NotificationCenter.featuredStickersDidLoad, new Object[0]);
    }

    public void lambda$processLoadedFeaturedStickers$44(int i) {
        this.loadFeaturedDate = i;
    }

    private void putFeaturedStickersToCache(ArrayList<TLRPC$StickerSetCovered> arrayList, final ArrayList<Long> arrayList2, final int i, final long j) {
        final ArrayList arrayList3 = arrayList != null ? new ArrayList(arrayList) : null;
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$putFeaturedStickersToCache$46(arrayList3, arrayList2, i, j);
            }
        });
    }

    public void lambda$putFeaturedStickersToCache$46(ArrayList arrayList, ArrayList arrayList2, int i, long j) {
        try {
            if (arrayList != null) {
                SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO stickers_featured VALUES(?, ?, ?, ?, ?)");
                executeFast.requery();
                int i2 = 4;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    i2 += ((TLRPC$StickerSetCovered) arrayList.get(i3)).getObjectSize();
                }
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(i2);
                NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer((arrayList2.size() * 8) + 4);
                nativeByteBuffer.writeInt32(arrayList.size());
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    ((TLRPC$StickerSetCovered) arrayList.get(i4)).serializeToStream(nativeByteBuffer);
                }
                nativeByteBuffer2.writeInt32(arrayList2.size());
                for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                    nativeByteBuffer2.writeInt64(((Long) arrayList2.get(i5)).longValue());
                }
                executeFast.bindInteger(1, 1);
                executeFast.bindByteBuffer(2, nativeByteBuffer);
                executeFast.bindByteBuffer(3, nativeByteBuffer2);
                executeFast.bindInteger(4, i);
                executeFast.bindLong(5, j);
                executeFast.step();
                nativeByteBuffer.reuse();
                nativeByteBuffer2.reuse();
                executeFast.dispose();
                return;
            }
            SQLitePreparedStatement executeFast2 = getMessagesStorage().getDatabase().executeFast("UPDATE stickers_featured SET date = ?");
            executeFast2.requery();
            executeFast2.bindInteger(1, i);
            executeFast2.step();
            executeFast2.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private long calcFeaturedStickersHash(ArrayList<TLRPC$StickerSetCovered> arrayList) {
        long j = 0;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC$StickerSet tLRPC$StickerSet = arrayList.get(i).set;
                if (!tLRPC$StickerSet.archived) {
                    j = calcHash(j, tLRPC$StickerSet.id);
                    if (this.unreadStickerSets.contains(Long.valueOf(tLRPC$StickerSet.id))) {
                        j = calcHash(j, 1L);
                    }
                }
            }
        }
        return j;
    }

    public void markFaturedStickersAsRead(boolean z) {
        if (!this.unreadStickerSets.isEmpty()) {
            this.unreadStickerSets.clear();
            this.loadFeaturedHash = calcFeaturedStickersHash(this.featuredStickerSets);
            getNotificationCenter().postNotificationName(NotificationCenter.featuredStickersDidLoad, new Object[0]);
            putFeaturedStickersToCache(this.featuredStickerSets, this.unreadStickerSets, this.loadFeaturedDate, this.loadFeaturedHash);
            if (z) {
                getConnectionsManager().sendRequest(new TLRPC$TL_messages_readFeaturedStickers(), MediaDataController$$ExternalSyntheticLambda173.INSTANCE);
            }
        }
    }

    public long getFeaturesStickersHashWithoutUnread() {
        long j = 0;
        for (int i = 0; i < this.featuredStickerSets.size(); i++) {
            TLRPC$StickerSet tLRPC$StickerSet = this.featuredStickerSets.get(i).set;
            if (!tLRPC$StickerSet.archived) {
                j = calcHash(j, tLRPC$StickerSet.id);
            }
        }
        return j;
    }

    public void markFaturedStickersByIdAsRead(final long j) {
        if (this.unreadStickerSets.contains(Long.valueOf(j)) && !this.readingStickerSets.contains(Long.valueOf(j))) {
            this.readingStickerSets.add(Long.valueOf(j));
            TLRPC$TL_messages_readFeaturedStickers tLRPC$TL_messages_readFeaturedStickers = new TLRPC$TL_messages_readFeaturedStickers();
            tLRPC$TL_messages_readFeaturedStickers.id.add(Long.valueOf(j));
            getConnectionsManager().sendRequest(tLRPC$TL_messages_readFeaturedStickers, MediaDataController$$ExternalSyntheticLambda174.INSTANCE);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$markFaturedStickersByIdAsRead$49(j);
                }
            }, 1000L);
        }
    }

    public void lambda$markFaturedStickersByIdAsRead$49(long j) {
        this.unreadStickerSets.remove(Long.valueOf(j));
        this.readingStickerSets.remove(Long.valueOf(j));
        this.loadFeaturedHash = calcFeaturedStickersHash(this.featuredStickerSets);
        getNotificationCenter().postNotificationName(NotificationCenter.featuredStickersDidLoad, new Object[0]);
        putFeaturedStickersToCache(this.featuredStickerSets, this.unreadStickerSets, this.loadFeaturedDate, this.loadFeaturedHash);
    }

    public int getArchivedStickersCount(int i) {
        return this.archivedStickersCount[i];
    }

    public void verifyAnimatedStickerMessage(TLRPC$Message tLRPC$Message) {
        verifyAnimatedStickerMessage(tLRPC$Message, false);
    }

    public void verifyAnimatedStickerMessage(final TLRPC$Message tLRPC$Message, boolean z) {
        if (tLRPC$Message != null) {
            TLRPC$Document document = MessageObject.getDocument(tLRPC$Message);
            final String stickerSetName = MessageObject.getStickerSetName(document);
            if (!TextUtils.isEmpty(stickerSetName)) {
                TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = this.stickerSetsByName.get(stickerSetName);
                if (tLRPC$TL_messages_stickerSet != null) {
                    int size = tLRPC$TL_messages_stickerSet.documents.size();
                    for (int i = 0; i < size; i++) {
                        TLRPC$Document tLRPC$Document = tLRPC$TL_messages_stickerSet.documents.get(i);
                        if (tLRPC$Document.id == document.id && tLRPC$Document.dc_id == document.dc_id) {
                            tLRPC$Message.stickerVerified = 1;
                            return;
                        }
                    }
                } else if (z) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            MediaDataController.this.lambda$verifyAnimatedStickerMessage$50(tLRPC$Message, stickerSetName);
                        }
                    });
                } else {
                    lambda$verifyAnimatedStickerMessage$50(tLRPC$Message, stickerSetName);
                }
            }
        }
    }

    public void lambda$verifyAnimatedStickerMessage$50(TLRPC$Message tLRPC$Message, final String str) {
        ArrayList<TLRPC$Message> arrayList = this.verifyingMessages.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.verifyingMessages.put(str, arrayList);
        }
        arrayList.add(tLRPC$Message);
        TLRPC$TL_messages_getStickerSet tLRPC$TL_messages_getStickerSet = new TLRPC$TL_messages_getStickerSet();
        tLRPC$TL_messages_getStickerSet.stickerset = MessageObject.getInputStickerSet(tLRPC$Message);
        getConnectionsManager().sendRequest(tLRPC$TL_messages_getStickerSet, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MediaDataController.this.lambda$verifyAnimatedStickerMessageInternal$52(str, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$verifyAnimatedStickerMessageInternal$52(final String str, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$verifyAnimatedStickerMessageInternal$51(str, tLObject);
            }
        });
    }

    public void lambda$verifyAnimatedStickerMessageInternal$51(String str, TLObject tLObject) {
        ArrayList<TLRPC$Message> arrayList = this.verifyingMessages.get(str);
        if (tLObject != null) {
            TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = (TLRPC$TL_messages_stickerSet) tLObject;
            storeTempStickerSet(tLRPC$TL_messages_stickerSet);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                TLRPC$Message tLRPC$Message = arrayList.get(i);
                TLRPC$Document document = MessageObject.getDocument(tLRPC$Message);
                int size2 = tLRPC$TL_messages_stickerSet.documents.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size2) {
                        break;
                    }
                    TLRPC$Document tLRPC$Document = tLRPC$TL_messages_stickerSet.documents.get(i2);
                    if (tLRPC$Document.id == document.id && tLRPC$Document.dc_id == document.dc_id) {
                        tLRPC$Message.stickerVerified = 1;
                        break;
                    }
                    i2++;
                }
                if (tLRPC$Message.stickerVerified == 0) {
                    tLRPC$Message.stickerVerified = 2;
                }
            }
        } else {
            int size3 = arrayList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                arrayList.get(i3).stickerVerified = 2;
            }
        }
        getNotificationCenter().postNotificationName(NotificationCenter.didVerifyMessagesStickers, arrayList);
        getMessagesStorage().updateMessageVerifyFlags(arrayList);
    }

    public void loadArchivedStickersCount(final int i, boolean z) {
        boolean z2 = true;
        if (z) {
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.currentAccount);
            int i2 = notificationsSettings.getInt("archivedStickersCount" + i, -1);
            if (i2 == -1) {
                loadArchivedStickersCount(i, false);
                return;
            }
            this.archivedStickersCount[i] = i2;
            getNotificationCenter().postNotificationName(NotificationCenter.archivedStickersCountDidLoad, Integer.valueOf(i));
            return;
        }
        TLRPC$TL_messages_getArchivedStickers tLRPC$TL_messages_getArchivedStickers = new TLRPC$TL_messages_getArchivedStickers();
        tLRPC$TL_messages_getArchivedStickers.limit = 0;
        if (i != 1) {
            z2 = false;
        }
        tLRPC$TL_messages_getArchivedStickers.masks = z2;
        getConnectionsManager().sendRequest(tLRPC$TL_messages_getArchivedStickers, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MediaDataController.this.lambda$loadArchivedStickersCount$54(i, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadArchivedStickersCount$54(final int i, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$loadArchivedStickersCount$53(tLRPC$TL_error, tLObject, i);
            }
        });
    }

    public void lambda$loadArchivedStickersCount$53(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject, int i) {
        if (tLRPC$TL_error == null) {
            TLRPC$TL_messages_archivedStickers tLRPC$TL_messages_archivedStickers = (TLRPC$TL_messages_archivedStickers) tLObject;
            this.archivedStickersCount[i] = tLRPC$TL_messages_archivedStickers.count;
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            edit.putInt("archivedStickersCount" + i, tLRPC$TL_messages_archivedStickers.count).commit();
            getNotificationCenter().postNotificationName(NotificationCenter.archivedStickersCountDidLoad, Integer.valueOf(i));
        }
    }

    private void processLoadStickersResponse(final int i, final TLRPC$TL_messages_allStickers tLRPC$TL_messages_allStickers) {
        final ArrayList<TLRPC$TL_messages_stickerSet> arrayList = new ArrayList<>();
        long j = 1000;
        if (tLRPC$TL_messages_allStickers.sets.isEmpty()) {
            processLoadedStickers(i, arrayList, false, (int) (System.currentTimeMillis() / 1000), tLRPC$TL_messages_allStickers.hash);
        } else {
            final LongSparseArray longSparseArray = new LongSparseArray();
            int i2 = 0;
            while (i2 < tLRPC$TL_messages_allStickers.sets.size()) {
                final TLRPC$StickerSet tLRPC$StickerSet = tLRPC$TL_messages_allStickers.sets.get(i2);
                TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = this.stickerSetsById.get(tLRPC$StickerSet.id);
                if (tLRPC$TL_messages_stickerSet != null) {
                    TLRPC$StickerSet tLRPC$StickerSet2 = tLRPC$TL_messages_stickerSet.set;
                    if (tLRPC$StickerSet2.hash == tLRPC$StickerSet.hash) {
                        tLRPC$StickerSet2.archived = tLRPC$StickerSet.archived;
                        tLRPC$StickerSet2.installed = tLRPC$StickerSet.installed;
                        tLRPC$StickerSet2.official = tLRPC$StickerSet.official;
                        longSparseArray.put(tLRPC$StickerSet2.id, tLRPC$TL_messages_stickerSet);
                        arrayList.add(tLRPC$TL_messages_stickerSet);
                        if (longSparseArray.size() == tLRPC$TL_messages_allStickers.sets.size()) {
                            processLoadedStickers(i, arrayList, false, (int) (System.currentTimeMillis() / j), tLRPC$TL_messages_allStickers.hash);
                        }
                        i2++;
                        j = 1000;
                    }
                }
                arrayList.add(null);
                TLRPC$TL_messages_getStickerSet tLRPC$TL_messages_getStickerSet = new TLRPC$TL_messages_getStickerSet();
                TLRPC$TL_inputStickerSetID tLRPC$TL_inputStickerSetID = new TLRPC$TL_inputStickerSetID();
                tLRPC$TL_messages_getStickerSet.stickerset = tLRPC$TL_inputStickerSetID;
                tLRPC$TL_inputStickerSetID.id = tLRPC$StickerSet.id;
                tLRPC$TL_inputStickerSetID.access_hash = tLRPC$StickerSet.access_hash;
                final int i3 = i2;
                getConnectionsManager().sendRequest(tLRPC$TL_messages_getStickerSet, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MediaDataController.this.lambda$processLoadStickersResponse$56(arrayList, i3, longSparseArray, tLRPC$StickerSet, tLRPC$TL_messages_allStickers, i, tLObject, tLRPC$TL_error);
                    }
                });
                i2++;
                j = 1000;
            }
        }
    }

    public void lambda$processLoadStickersResponse$56(final ArrayList arrayList, final int i, final LongSparseArray longSparseArray, final TLRPC$StickerSet tLRPC$StickerSet, final TLRPC$TL_messages_allStickers tLRPC$TL_messages_allStickers, final int i2, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$processLoadStickersResponse$55(tLObject, arrayList, i, longSparseArray, tLRPC$StickerSet, tLRPC$TL_messages_allStickers, i2);
            }
        });
    }

    public void lambda$processLoadStickersResponse$55(TLObject tLObject, ArrayList arrayList, int i, LongSparseArray longSparseArray, TLRPC$StickerSet tLRPC$StickerSet, TLRPC$TL_messages_allStickers tLRPC$TL_messages_allStickers, int i2) {
        TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = (TLRPC$TL_messages_stickerSet) tLObject;
        arrayList.set(i, tLRPC$TL_messages_stickerSet);
        longSparseArray.put(tLRPC$StickerSet.id, tLRPC$TL_messages_stickerSet);
        if (longSparseArray.size() == tLRPC$TL_messages_allStickers.sets.size()) {
            int i3 = 0;
            while (i3 < arrayList.size()) {
                if (arrayList.get(i3) == null) {
                    arrayList.remove(i3);
                    i3--;
                }
                i3++;
            }
            processLoadedStickers(i2, arrayList, false, (int) (System.currentTimeMillis() / 1000), tLRPC$TL_messages_allStickers.hash);
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
                        MediaDataController.this.lambda$loadStickersByEmojiOrName$57(str, z);
                    }
                });
                return;
            }
            TLRPC$TL_messages_getStickerSet tLRPC$TL_messages_getStickerSet = new TLRPC$TL_messages_getStickerSet();
            if (z) {
                TLRPC$TL_inputStickerSetDice tLRPC$TL_inputStickerSetDice = new TLRPC$TL_inputStickerSetDice();
                tLRPC$TL_inputStickerSetDice.emoticon = str;
                tLRPC$TL_messages_getStickerSet.stickerset = tLRPC$TL_inputStickerSetDice;
            } else {
                TLRPC$TL_inputStickerSetShortName tLRPC$TL_inputStickerSetShortName = new TLRPC$TL_inputStickerSetShortName();
                tLRPC$TL_inputStickerSetShortName.short_name = str;
                tLRPC$TL_messages_getStickerSet.stickerset = tLRPC$TL_inputStickerSetShortName;
            }
            getConnectionsManager().sendRequest(tLRPC$TL_messages_getStickerSet, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MediaDataController.this.lambda$loadStickersByEmojiOrName$59(str, z, tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$loadStickersByEmojiOrName$57(String str, boolean z) {
        Throwable th;
        TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet;
        TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet2;
        int i;
        SQLiteCursor sQLiteCursor = null;
        r0 = null;
        r0 = null;
        TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet3 = null;
        int i2 = 0;
        try {
            SQLiteCursor queryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT data, date FROM stickers_dice WHERE emoji = ?", str);
            try {
                if (queryFinalized.next()) {
                    NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                    if (byteBufferValue != null) {
                        tLRPC$TL_messages_stickerSet3 = TLRPC$messages_StickerSet.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        byteBufferValue.reuse();
                    }
                    i2 = queryFinalized.intValue(1);
                }
                queryFinalized.dispose();
                tLRPC$TL_messages_stickerSet2 = tLRPC$TL_messages_stickerSet3;
                i = i2;
            } catch (Throwable th2) {
                th = th2;
                tLRPC$TL_messages_stickerSet = tLRPC$TL_messages_stickerSet3;
                sQLiteCursor = queryFinalized;
                try {
                    FileLog.e(th);
                    tLRPC$TL_messages_stickerSet2 = tLRPC$TL_messages_stickerSet;
                    i = 0;
                    processLoadedDiceStickers(str, z, tLRPC$TL_messages_stickerSet2, true, i);
                } finally {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            tLRPC$TL_messages_stickerSet = null;
        }
        processLoadedDiceStickers(str, z, tLRPC$TL_messages_stickerSet2, true, i);
    }

    public void lambda$loadStickersByEmojiOrName$59(final String str, final boolean z, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$loadStickersByEmojiOrName$58(tLRPC$TL_error, tLObject, str, z);
            }
        });
    }

    public void lambda$loadStickersByEmojiOrName$58(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject, String str, boolean z) {
        if (tLObject instanceof TLRPC$TL_messages_stickerSet) {
            processLoadedDiceStickers(str, z, (TLRPC$TL_messages_stickerSet) tLObject, false, (int) (System.currentTimeMillis() / 1000));
        } else {
            processLoadedDiceStickers(str, z, null, false, (int) (System.currentTimeMillis() / 1000));
        }
    }

    public void lambda$processLoadedDiceStickers$60(String str) {
        this.loadingDiceStickerSets.remove(str);
    }

    private void processLoadedDiceStickers(final String str, final boolean z, final TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet, final boolean z2, final int i) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$processLoadedDiceStickers$60(str);
            }
        });
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$processLoadedDiceStickers$63(z2, tLRPC$TL_messages_stickerSet, i, str, z);
            }
        });
    }

    public void lambda$processLoadedDiceStickers$63(boolean z, final TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet, int i, final String str, final boolean z2) {
        long j = 1000;
        if ((z && (tLRPC$TL_messages_stickerSet == null || Math.abs((System.currentTimeMillis() / 1000) - i) >= 86400)) || (!z && tLRPC$TL_messages_stickerSet == null)) {
            Runnable mediaDataController$$ExternalSyntheticLambda62 = new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$processLoadedDiceStickers$61(str, z2);
                }
            };
            if (tLRPC$TL_messages_stickerSet != null || z) {
                j = 0;
            }
            AndroidUtilities.runOnUIThread(mediaDataController$$ExternalSyntheticLambda62, j);
            if (tLRPC$TL_messages_stickerSet == null) {
                return;
            }
        }
        if (tLRPC$TL_messages_stickerSet != null) {
            if (!z) {
                putDiceStickersToCache(str, tLRPC$TL_messages_stickerSet, i);
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$processLoadedDiceStickers$62(str, tLRPC$TL_messages_stickerSet);
                }
            });
        } else if (!z) {
            putDiceStickersToCache(str, null, i);
        }
    }

    public void lambda$processLoadedDiceStickers$61(String str, boolean z) {
        loadStickersByEmojiOrName(str, z, false);
    }

    public void lambda$processLoadedDiceStickers$62(String str, TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet) {
        this.diceStickerSetsByEmoji.put(str, tLRPC$TL_messages_stickerSet);
        this.diceEmojiStickerSetsById.put(tLRPC$TL_messages_stickerSet.set.id, str);
        getNotificationCenter().postNotificationName(NotificationCenter.diceStickersDidLoad, str);
    }

    private void putDiceStickersToCache(final String str, final TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet, final int i) {
        if (!TextUtils.isEmpty(str)) {
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$putDiceStickersToCache$64(tLRPC$TL_messages_stickerSet, str, i);
                }
            });
        }
    }

    public void lambda$putDiceStickersToCache$64(TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet, String str, int i) {
        try {
            if (tLRPC$TL_messages_stickerSet != null) {
                SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO stickers_dice VALUES(?, ?, ?)");
                executeFast.requery();
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLRPC$TL_messages_stickerSet.getObjectSize());
                tLRPC$TL_messages_stickerSet.serializeToStream(nativeByteBuffer);
                executeFast.bindString(1, str);
                executeFast.bindByteBuffer(2, nativeByteBuffer);
                executeFast.bindInteger(3, i);
                executeFast.step();
                nativeByteBuffer.reuse();
                executeFast.dispose();
            } else {
                SQLitePreparedStatement executeFast2 = getMessagesStorage().getDatabase().executeFast("UPDATE stickers_dice SET date = ?");
                executeFast2.requery();
                executeFast2.bindInteger(1, i);
                executeFast2.step();
                executeFast2.dispose();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void loadStickers(int i, boolean z, boolean z2) {
        loadStickers(i, z, z2, false);
    }

    public void loadStickers(final int i, boolean z, final boolean z2, boolean z3) {
        TLRPC$TL_messages_getMaskStickers tLRPC$TL_messages_getMaskStickers;
        if (!this.loadingStickers[i]) {
            if (i == 3) {
                if (this.featuredStickerSets.isEmpty() || !getMessagesController().preloadFeaturedStickers) {
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
                        MediaDataController.this.lambda$loadStickers$66(i);
                    }
                });
            } else if (i == 3) {
                TLRPC$TL_messages_allStickers tLRPC$TL_messages_allStickers = new TLRPC$TL_messages_allStickers();
                tLRPC$TL_messages_allStickers.hash = this.loadFeaturedHash;
                int size = this.featuredStickerSets.size();
                for (int i2 = 0; i2 < size; i2++) {
                    tLRPC$TL_messages_allStickers.sets.add(this.featuredStickerSets.get(i2).set);
                }
                processLoadStickersResponse(i, tLRPC$TL_messages_allStickers);
            } else if (i == 4) {
                TLRPC$TL_messages_getStickerSet tLRPC$TL_messages_getStickerSet = new TLRPC$TL_messages_getStickerSet();
                tLRPC$TL_messages_getStickerSet.stickerset = new TLRPC$TL_inputStickerSetAnimatedEmoji();
                getConnectionsManager().sendRequest(tLRPC$TL_messages_getStickerSet, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MediaDataController.this.lambda$loadStickers$67(i, tLObject, tLRPC$TL_error);
                    }
                });
            } else {
                final long j = 0;
                if (i == 0) {
                    TLRPC$TL_messages_getAllStickers tLRPC$TL_messages_getAllStickers = new TLRPC$TL_messages_getAllStickers();
                    if (!z2) {
                        j = this.loadHash[i];
                    }
                    tLRPC$TL_messages_getAllStickers.hash = j;
                    tLRPC$TL_messages_getMaskStickers = tLRPC$TL_messages_getAllStickers;
                } else {
                    TLRPC$TL_messages_getMaskStickers tLRPC$TL_messages_getMaskStickers2 = new TLRPC$TL_messages_getMaskStickers();
                    if (!z2) {
                        j = this.loadHash[i];
                    }
                    tLRPC$TL_messages_getMaskStickers2.hash = j;
                    tLRPC$TL_messages_getMaskStickers = tLRPC$TL_messages_getMaskStickers2;
                }
                getConnectionsManager().sendRequest(tLRPC$TL_messages_getMaskStickers, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MediaDataController.this.lambda$loadStickers$69(i, j, tLObject, tLRPC$TL_error);
                    }
                });
            }
        } else if (z3) {
            this.scheduledLoadStickers[i] = new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$loadStickers$65(i, z2);
                }
            };
        }
    }

    public void lambda$loadStickers$65(int i, boolean z) {
        loadStickers(i, false, z, false);
    }

    public void lambda$loadStickers$66(int i) {
        ArrayList<TLRPC$TL_messages_stickerSet> arrayList;
        SQLiteCursor sQLiteCursor;
        Throwable th;
        int i2;
        long j;
        ArrayList<TLRPC$TL_messages_stickerSet> arrayList2;
        ArrayList<TLRPC$TL_messages_stickerSet> arrayList3 = null;
        int i3 = 0;
        long j2 = 0;
        try {
            sQLiteCursor = getMessagesStorage().getDatabase().queryFinalized("SELECT data, date, hash FROM stickers_v2 WHERE id = " + (i + 1), new Object[0]);
            try {
                if (sQLiteCursor.next()) {
                    NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                    if (byteBufferValue != null) {
                        arrayList = new ArrayList<>();
                        try {
                            int readInt32 = byteBufferValue.readInt32(false);
                            for (int i4 = 0; i4 < readInt32; i4++) {
                                arrayList.add(TLRPC$messages_StickerSet.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false));
                            }
                            byteBufferValue.reuse();
                            arrayList3 = arrayList;
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                FileLog.e(th);
                                i2 = i3;
                                j = 0;
                                arrayList2 = arrayList;
                                processLoadedStickers(i, arrayList2, true, i2, j);
                            } finally {
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                            }
                        }
                    }
                    i3 = sQLiteCursor.intValue(1);
                    j2 = calcStickersHash(arrayList3);
                }
                sQLiteCursor.dispose();
                arrayList2 = arrayList3;
                i2 = i3;
                j = j2;
            } catch (Throwable th3) {
                th = th3;
                arrayList = arrayList3;
            }
        } catch (Throwable th4) {
            th = th4;
            arrayList = null;
            sQLiteCursor = null;
        }
        processLoadedStickers(i, arrayList2, true, i2, j);
    }

    public void lambda$loadStickers$67(int i, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject instanceof TLRPC$TL_messages_stickerSet) {
            ArrayList<TLRPC$TL_messages_stickerSet> arrayList = new ArrayList<>();
            arrayList.add((TLRPC$TL_messages_stickerSet) tLObject);
            processLoadedStickers(i, arrayList, false, (int) (System.currentTimeMillis() / 1000), calcStickersHash(arrayList));
            return;
        }
        processLoadedStickers(i, null, false, (int) (System.currentTimeMillis() / 1000), 0L);
    }

    public void lambda$loadStickers$69(final int i, final long j, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$loadStickers$68(tLObject, i, j);
            }
        });
    }

    public void lambda$loadStickers$68(TLObject tLObject, int i, long j) {
        if (tLObject instanceof TLRPC$TL_messages_allStickers) {
            processLoadStickersResponse(i, (TLRPC$TL_messages_allStickers) tLObject);
        } else {
            processLoadedStickers(i, null, false, (int) (System.currentTimeMillis() / 1000), j);
        }
    }

    private void putStickersToCache(final int i, ArrayList<TLRPC$TL_messages_stickerSet> arrayList, final int i2, final long j) {
        final ArrayList arrayList2 = arrayList != null ? new ArrayList(arrayList) : null;
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$putStickersToCache$70(arrayList2, i, i2, j);
            }
        });
    }

    public void lambda$putStickersToCache$70(ArrayList arrayList, int i, int i2, long j) {
        try {
            if (arrayList != null) {
                SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO stickers_v2 VALUES(?, ?, ?, ?)");
                executeFast.requery();
                int i3 = 4;
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    i3 += ((TLRPC$TL_messages_stickerSet) arrayList.get(i4)).getObjectSize();
                }
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(i3);
                nativeByteBuffer.writeInt32(arrayList.size());
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    ((TLRPC$TL_messages_stickerSet) arrayList.get(i5)).serializeToStream(nativeByteBuffer);
                }
                executeFast.bindInteger(1, i + 1);
                executeFast.bindByteBuffer(2, nativeByteBuffer);
                executeFast.bindInteger(3, i2);
                executeFast.bindLong(4, j);
                executeFast.step();
                nativeByteBuffer.reuse();
                executeFast.dispose();
                return;
            }
            SQLitePreparedStatement executeFast2 = getMessagesStorage().getDatabase().executeFast("UPDATE stickers_v2 SET date = ?");
            executeFast2.requery();
            executeFast2.bindLong(1, i2);
            executeFast2.step();
            executeFast2.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public String getStickerSetName(long j) {
        TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = this.stickerSetsById.get(j);
        if (tLRPC$TL_messages_stickerSet != null) {
            return tLRPC$TL_messages_stickerSet.set.short_name;
        }
        TLRPC$StickerSetCovered tLRPC$StickerSetCovered = this.featuredStickerSetsById.get(j);
        if (tLRPC$StickerSetCovered != null) {
            return tLRPC$StickerSetCovered.set.short_name;
        }
        return null;
    }

    public static long getStickerSetId(TLRPC$Document tLRPC$Document) {
        for (int i = 0; i < tLRPC$Document.attributes.size(); i++) {
            TLRPC$DocumentAttribute tLRPC$DocumentAttribute = tLRPC$Document.attributes.get(i);
            if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeSticker) {
                TLRPC$InputStickerSet tLRPC$InputStickerSet = tLRPC$DocumentAttribute.stickerset;
                if (tLRPC$InputStickerSet instanceof TLRPC$TL_inputStickerSetID) {
                    return tLRPC$InputStickerSet.id;
                }
                return -1L;
            }
        }
        return -1L;
    }

    public static TLRPC$InputStickerSet getInputStickerSet(TLRPC$Document tLRPC$Document) {
        for (int i = 0; i < tLRPC$Document.attributes.size(); i++) {
            TLRPC$DocumentAttribute tLRPC$DocumentAttribute = tLRPC$Document.attributes.get(i);
            if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeSticker) {
                TLRPC$InputStickerSet tLRPC$InputStickerSet = tLRPC$DocumentAttribute.stickerset;
                if (tLRPC$InputStickerSet instanceof TLRPC$TL_inputStickerSetEmpty) {
                    return null;
                }
                return tLRPC$InputStickerSet;
            }
        }
        return null;
    }

    private static long calcStickersHash(ArrayList<TLRPC$TL_messages_stickerSet> arrayList) {
        long j = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC$StickerSet tLRPC$StickerSet = arrayList.get(i).set;
            if (!tLRPC$StickerSet.archived) {
                j = calcHash(j, tLRPC$StickerSet.hash);
            }
        }
        return j;
    }

    private void processLoadedStickers(final int i, final ArrayList<TLRPC$TL_messages_stickerSet> arrayList, final boolean z, final int i2, final long j) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$processLoadedStickers$71(i);
            }
        });
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$processLoadedStickers$75(z, arrayList, i2, j, i);
            }
        });
    }

    public void lambda$processLoadedStickers$71(int i) {
        this.loadingStickers[i] = false;
        this.stickersLoaded[i] = true;
        Runnable[] runnableArr = this.scheduledLoadStickers;
        if (runnableArr[i] != null) {
            runnableArr[i].run();
            this.scheduledLoadStickers[i] = null;
        }
    }

    public void lambda$processLoadedStickers$75(boolean z, final ArrayList arrayList, final int i, final long j, final int i2) {
        int i3;
        String str;
        int i4;
        MediaDataController mediaDataController = this;
        ArrayList arrayList2 = arrayList;
        long j2 = 1000;
        if ((z && (arrayList2 == null || BuildVars.DEBUG_PRIVATE_VERSION || Math.abs((System.currentTimeMillis() / 1000) - i) >= 3600)) || (!z && arrayList2 == null && j == 0)) {
            Runnable mediaDataController$$ExternalSyntheticLambda71 = new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$processLoadedStickers$72(arrayList, j, i2);
                }
            };
            if (arrayList2 != null || z) {
                j2 = 0;
            }
            AndroidUtilities.runOnUIThread(mediaDataController$$ExternalSyntheticLambda71, j2);
            if (arrayList2 == null) {
                return;
            }
        }
        if (arrayList2 != null) {
            try {
                final ArrayList<TLRPC$TL_messages_stickerSet> arrayList3 = new ArrayList<>();
                final LongSparseArray longSparseArray = new LongSparseArray();
                final HashMap hashMap = new HashMap();
                final LongSparseArray longSparseArray2 = new LongSparseArray();
                final LongSparseArray longSparseArray3 = new LongSparseArray();
                HashMap hashMap2 = new HashMap();
                int i5 = 0;
                while (i5 < arrayList.size()) {
                    TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = (TLRPC$TL_messages_stickerSet) arrayList2.get(i5);
                    if (tLRPC$TL_messages_stickerSet != null && mediaDataController.removingStickerSetsUndos.indexOfKey(tLRPC$TL_messages_stickerSet.set.id) < 0) {
                        arrayList3.add(tLRPC$TL_messages_stickerSet);
                        longSparseArray.put(tLRPC$TL_messages_stickerSet.set.id, tLRPC$TL_messages_stickerSet);
                        hashMap.put(tLRPC$TL_messages_stickerSet.set.short_name, tLRPC$TL_messages_stickerSet);
                        int i6 = 0;
                        while (i6 < tLRPC$TL_messages_stickerSet.documents.size()) {
                            TLRPC$Document tLRPC$Document = tLRPC$TL_messages_stickerSet.documents.get(i6);
                            if (tLRPC$Document != null && !(tLRPC$Document instanceof TLRPC$TL_documentEmpty)) {
                                i4 = i5;
                                longSparseArray3.put(tLRPC$Document.id, tLRPC$Document);
                                i6++;
                                i5 = i4;
                            }
                            i4 = i5;
                            i6++;
                            i5 = i4;
                        }
                        i3 = i5;
                        if (!tLRPC$TL_messages_stickerSet.set.archived) {
                            for (int i7 = 0; i7 < tLRPC$TL_messages_stickerSet.packs.size(); i7++) {
                                TLRPC$TL_stickerPack tLRPC$TL_stickerPack = tLRPC$TL_messages_stickerSet.packs.get(i7);
                                if (!(tLRPC$TL_stickerPack == null || (str = tLRPC$TL_stickerPack.emoticon) == null)) {
                                    String replace = str.replace("️", "");
                                    tLRPC$TL_stickerPack.emoticon = replace;
                                    ArrayList arrayList4 = (ArrayList) hashMap2.get(replace);
                                    if (arrayList4 == null) {
                                        arrayList4 = new ArrayList();
                                        hashMap2.put(tLRPC$TL_stickerPack.emoticon, arrayList4);
                                    }
                                    for (int i8 = 0; i8 < tLRPC$TL_stickerPack.documents.size(); i8++) {
                                        Long l = tLRPC$TL_stickerPack.documents.get(i8);
                                        hashMap2 = hashMap2;
                                        if (longSparseArray2.indexOfKey(l.longValue()) < 0) {
                                            longSparseArray2.put(l.longValue(), tLRPC$TL_stickerPack.emoticon);
                                        }
                                        TLRPC$Document tLRPC$Document2 = (TLRPC$Document) longSparseArray3.get(l.longValue());
                                        if (tLRPC$Document2 != null) {
                                            arrayList4.add(tLRPC$Document2);
                                        }
                                    }
                                }
                                hashMap2 = hashMap2;
                            }
                        }
                        hashMap2 = hashMap2;
                        i5 = i3 + 1;
                        mediaDataController = this;
                        arrayList2 = arrayList;
                    }
                    i3 = i5;
                    hashMap2 = hashMap2;
                    i5 = i3 + 1;
                    mediaDataController = this;
                    arrayList2 = arrayList;
                }
                final HashMap hashMap3 = hashMap2;
                if (!z) {
                    putStickersToCache(i2, arrayList3, i, j);
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MediaDataController.this.lambda$processLoadedStickers$73(i2, longSparseArray, hashMap, arrayList3, j, i, longSparseArray3, hashMap3, longSparseArray2);
                    }
                });
            } catch (Throwable th) {
                FileLog.e(th);
            }
        } else if (!z) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$processLoadedStickers$74(i2, i);
                }
            });
            putStickersToCache(i2, null, i, 0L);
        }
    }

    public void lambda$processLoadedStickers$72(ArrayList arrayList, long j, int i) {
        if (!(arrayList == null || j == 0)) {
            this.loadHash[i] = j;
        }
        loadStickers(i, false, false);
    }

    public void lambda$processLoadedStickers$73(int i, LongSparseArray longSparseArray, HashMap hashMap, ArrayList arrayList, long j, int i2, LongSparseArray longSparseArray2, HashMap hashMap2, LongSparseArray longSparseArray3) {
        for (int i3 = 0; i3 < this.stickerSets[i].size(); i3++) {
            TLRPC$StickerSet tLRPC$StickerSet = this.stickerSets[i].get(i3).set;
            this.stickerSetsById.remove(tLRPC$StickerSet.id);
            this.stickerSetsByName.remove(tLRPC$StickerSet.short_name);
            if (!(i == 3 || i == 4)) {
                this.installedStickerSetsById.remove(tLRPC$StickerSet.id);
            }
        }
        for (int i4 = 0; i4 < longSparseArray.size(); i4++) {
            this.stickerSetsById.put(longSparseArray.keyAt(i4), (TLRPC$TL_messages_stickerSet) longSparseArray.valueAt(i4));
            if (!(i == 3 || i == 4)) {
                this.installedStickerSetsById.put(longSparseArray.keyAt(i4), (TLRPC$TL_messages_stickerSet) longSparseArray.valueAt(i4));
            }
        }
        this.stickerSetsByName.putAll(hashMap);
        this.stickerSets[i] = arrayList;
        this.loadHash[i] = j;
        this.loadDate[i] = i2;
        this.stickersByIds[i] = longSparseArray2;
        if (i == 0) {
            this.allStickers = hashMap2;
            this.stickersByEmoji = longSparseArray3;
        } else if (i == 3) {
            this.allStickersFeatured = hashMap2;
        }
        getNotificationCenter().postNotificationName(NotificationCenter.stickersDidLoad, Integer.valueOf(i));
    }

    public void lambda$processLoadedStickers$74(int i, int i2) {
        this.loadDate[i] = i2;
    }

    public boolean cancelRemovingStickerSet(long j) {
        Runnable runnable = this.removingStickerSetsUndos.get(j);
        if (runnable == null) {
            return false;
        }
        runnable.run();
        return true;
    }

    public void preloadStickerSetThumb(TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet) {
        ArrayList<TLRPC$Document> arrayList;
        TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tLRPC$TL_messages_stickerSet.set.thumbs, 90);
        if (closestPhotoSizeWithSize != null && (arrayList = tLRPC$TL_messages_stickerSet.documents) != null && !arrayList.isEmpty()) {
            loadStickerSetThumbInternal(closestPhotoSizeWithSize, tLRPC$TL_messages_stickerSet, arrayList.get(0), tLRPC$TL_messages_stickerSet.set.thumb_version);
        }
    }

    public void preloadStickerSetThumb(TLRPC$StickerSetCovered tLRPC$StickerSetCovered) {
        TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tLRPC$StickerSetCovered.set.thumbs, 90);
        if (closestPhotoSizeWithSize != null) {
            TLRPC$Document tLRPC$Document = tLRPC$StickerSetCovered.cover;
            if (tLRPC$Document == null) {
                if (!tLRPC$StickerSetCovered.covers.isEmpty()) {
                    tLRPC$Document = tLRPC$StickerSetCovered.covers.get(0);
                } else {
                    return;
                }
            }
            loadStickerSetThumbInternal(closestPhotoSizeWithSize, tLRPC$StickerSetCovered, tLRPC$Document, tLRPC$StickerSetCovered.set.thumb_version);
        }
    }

    private void loadStickerSetThumbInternal(TLRPC$PhotoSize tLRPC$PhotoSize, Object obj, TLRPC$Document tLRPC$Document, int i) {
        ImageLocation forSticker = ImageLocation.getForSticker(tLRPC$PhotoSize, tLRPC$Document, i);
        if (forSticker != null) {
            getFileLoader().loadFile(forSticker, obj, forSticker.imageType == 1 ? "tgs" : "webp", 2, 1);
        }
    }

    public void toggleStickerSet(final Context context, final TLObject tLObject, final int i, final BaseFragment baseFragment, final boolean z, boolean z2) {
        TLRPC$StickerSet tLRPC$StickerSet;
        TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet;
        int i2;
        TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet2;
        if (tLObject instanceof TLRPC$TL_messages_stickerSet) {
            TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet3 = (TLRPC$TL_messages_stickerSet) tLObject;
            tLRPC$TL_messages_stickerSet = tLRPC$TL_messages_stickerSet3;
            tLRPC$StickerSet = tLRPC$TL_messages_stickerSet3.set;
        } else if (tLObject instanceof TLRPC$StickerSetCovered) {
            TLRPC$StickerSet tLRPC$StickerSet2 = ((TLRPC$StickerSetCovered) tLObject).set;
            if (i != 2) {
                tLRPC$TL_messages_stickerSet2 = this.stickerSetsById.get(tLRPC$StickerSet2.id);
                if (tLRPC$TL_messages_stickerSet2 == null) {
                    return;
                }
            } else {
                tLRPC$TL_messages_stickerSet2 = null;
            }
            tLRPC$StickerSet = tLRPC$StickerSet2;
            tLRPC$TL_messages_stickerSet = tLRPC$TL_messages_stickerSet2;
        } else {
            throw new IllegalArgumentException("Invalid type of the given stickerSetObject: " + tLObject.getClass());
        }
        final ?? r14 = tLRPC$StickerSet.masks;
        tLRPC$StickerSet.archived = i == 1;
        int i3 = 0;
        while (true) {
            if (i3 >= this.stickerSets[r14 == true ? 1 : 0].size()) {
                i2 = 0;
                break;
            }
            TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet4 = this.stickerSets[r14].get(i3);
            if (tLRPC$TL_messages_stickerSet4.set.id == tLRPC$StickerSet.id) {
                this.stickerSets[r14].remove(i3);
                if (i == 2) {
                    this.stickerSets[r14].add(0, tLRPC$TL_messages_stickerSet4);
                } else {
                    this.stickerSetsById.remove(tLRPC$TL_messages_stickerSet4.set.id);
                    this.installedStickerSetsById.remove(tLRPC$TL_messages_stickerSet4.set.id);
                    this.stickerSetsByName.remove(tLRPC$TL_messages_stickerSet4.set.short_name);
                }
                i2 = i3;
            } else {
                i3++;
            }
        }
        this.loadHash[r14] = calcStickersHash(this.stickerSets[r14]);
        putStickersToCache(r14, this.stickerSets[r14], this.loadDate[r14], this.loadHash[r14]);
        getNotificationCenter().postNotificationName(NotificationCenter.stickersDidLoad, Integer.valueOf(r14 == true ? 1 : 0));
        if (i == 2) {
            if (!cancelRemovingStickerSet(tLRPC$StickerSet.id)) {
                toggleStickerSetInternal(context, i, baseFragment, z, tLObject, tLRPC$StickerSet, r14, z2);
            }
        } else if (!z2 || baseFragment == null) {
            toggleStickerSetInternal(context, i, baseFragment, z, tLObject, tLRPC$StickerSet, r14, false);
        } else {
            StickerSetBulletinLayout stickerSetBulletinLayout = new StickerSetBulletinLayout(context, tLObject, i);
            final TLRPC$StickerSet tLRPC$StickerSet3 = tLRPC$StickerSet;
            final int i4 = i2;
            final TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet5 = tLRPC$TL_messages_stickerSet;
            final TLRPC$StickerSet tLRPC$StickerSet4 = tLRPC$StickerSet;
            final Bulletin.UndoButton delayedAction = new Bulletin.UndoButton(context, false).setUndoAction(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$toggleStickerSet$76(tLRPC$StickerSet3, r14, i4, tLRPC$TL_messages_stickerSet5);
                }
            }).setDelayedAction(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$toggleStickerSet$77(context, i, baseFragment, z, tLObject, tLRPC$StickerSet4, r14);
                }
            });
            stickerSetBulletinLayout.setButton(delayedAction);
            LongSparseArray<Runnable> longSparseArray = this.removingStickerSetsUndos;
            long j = tLRPC$StickerSet.id;
            delayedAction.getClass();
            longSparseArray.put(j, new Runnable() {
                @Override
                public final void run() {
                    Bulletin.UndoButton.this.undo();
                }
            });
            Bulletin.make(baseFragment, stickerSetBulletinLayout, 2750).show();
        }
    }

    public void lambda$toggleStickerSet$76(TLRPC$StickerSet tLRPC$StickerSet, int i, int i2, TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet) {
        tLRPC$StickerSet.archived = false;
        this.stickerSets[i].add(i2, tLRPC$TL_messages_stickerSet);
        this.stickerSetsById.put(tLRPC$StickerSet.id, tLRPC$TL_messages_stickerSet);
        this.installedStickerSetsById.put(tLRPC$StickerSet.id, tLRPC$TL_messages_stickerSet);
        this.stickerSetsByName.put(tLRPC$StickerSet.short_name, tLRPC$TL_messages_stickerSet);
        this.removingStickerSetsUndos.remove(tLRPC$StickerSet.id);
        this.loadHash[i] = calcStickersHash(this.stickerSets[i]);
        putStickersToCache(i, this.stickerSets[i], this.loadDate[i], this.loadHash[i]);
        getNotificationCenter().postNotificationName(NotificationCenter.stickersDidLoad, Integer.valueOf(i));
    }

    public void lambda$toggleStickerSet$77(Context context, int i, BaseFragment baseFragment, boolean z, TLObject tLObject, TLRPC$StickerSet tLRPC$StickerSet, int i2) {
        toggleStickerSetInternal(context, i, baseFragment, z, tLObject, tLRPC$StickerSet, i2, false);
    }

    private void toggleStickerSetInternal(final Context context, int i, final BaseFragment baseFragment, final boolean z, final TLObject tLObject, final TLRPC$StickerSet tLRPC$StickerSet, final int i2, final boolean z2) {
        TLRPC$TL_inputStickerSetID tLRPC$TL_inputStickerSetID = new TLRPC$TL_inputStickerSetID();
        tLRPC$TL_inputStickerSetID.access_hash = tLRPC$StickerSet.access_hash;
        tLRPC$TL_inputStickerSetID.id = tLRPC$StickerSet.id;
        if (i != 0) {
            TLRPC$TL_messages_installStickerSet tLRPC$TL_messages_installStickerSet = new TLRPC$TL_messages_installStickerSet();
            tLRPC$TL_messages_installStickerSet.stickerset = tLRPC$TL_inputStickerSetID;
            boolean z3 = true;
            if (i != 1) {
                z3 = false;
            }
            tLRPC$TL_messages_installStickerSet.archived = z3;
            getConnectionsManager().sendRequest(tLRPC$TL_messages_installStickerSet, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error) {
                    MediaDataController.this.lambda$toggleStickerSetInternal$79(tLRPC$StickerSet, baseFragment, z, i2, z2, context, tLObject, tLObject2, tLRPC$TL_error);
                }
            });
            return;
        }
        TLRPC$TL_messages_uninstallStickerSet tLRPC$TL_messages_uninstallStickerSet = new TLRPC$TL_messages_uninstallStickerSet();
        tLRPC$TL_messages_uninstallStickerSet.stickerset = tLRPC$TL_inputStickerSetID;
        getConnectionsManager().sendRequest(tLRPC$TL_messages_uninstallStickerSet, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error) {
                MediaDataController.this.lambda$toggleStickerSetInternal$81(tLRPC$StickerSet, i2, tLObject2, tLRPC$TL_error);
            }
        });
    }

    public void lambda$toggleStickerSetInternal$79(final TLRPC$StickerSet tLRPC$StickerSet, final BaseFragment baseFragment, final boolean z, final int i, final boolean z2, final Context context, final TLObject tLObject, final TLObject tLObject2, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$toggleStickerSetInternal$78(tLRPC$StickerSet, tLObject2, baseFragment, z, i, tLRPC$TL_error, z2, context, tLObject);
            }
        });
    }

    public void lambda$toggleStickerSetInternal$78(TLRPC$StickerSet tLRPC$StickerSet, TLObject tLObject, BaseFragment baseFragment, boolean z, int i, TLRPC$TL_error tLRPC$TL_error, boolean z2, Context context, TLObject tLObject2) {
        this.removingStickerSetsUndos.remove(tLRPC$StickerSet.id);
        if (tLObject instanceof TLRPC$TL_messages_stickerSetInstallResultArchive) {
            processStickerSetInstallResultArchive(baseFragment, z, i, (TLRPC$TL_messages_stickerSetInstallResultArchive) tLObject);
        }
        loadStickers(i, false, false, true);
        if (tLRPC$TL_error == null && z2 && baseFragment != null) {
            Bulletin.make(baseFragment, new StickerSetBulletinLayout(context, tLObject2, 2), 1500).show();
        }
    }

    public void lambda$toggleStickerSetInternal$81(final TLRPC$StickerSet tLRPC$StickerSet, final int i, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$toggleStickerSetInternal$80(tLRPC$StickerSet, i);
            }
        });
    }

    public void lambda$toggleStickerSetInternal$80(TLRPC$StickerSet tLRPC$StickerSet, int i) {
        this.removingStickerSetsUndos.remove(tLRPC$StickerSet.id);
        loadStickers(i, false, true);
    }

    public void toggleStickerSets(ArrayList<TLRPC$StickerSet> arrayList, final int i, final int i2, final BaseFragment baseFragment, final boolean z) {
        int size = arrayList.size();
        ArrayList<TLRPC$InputStickerSet> arrayList2 = new ArrayList<>(size);
        int i3 = 0;
        while (true) {
            boolean z2 = true;
            if (i3 >= size) {
                break;
            }
            TLRPC$StickerSet tLRPC$StickerSet = arrayList.get(i3);
            TLRPC$TL_inputStickerSetID tLRPC$TL_inputStickerSetID = new TLRPC$TL_inputStickerSetID();
            tLRPC$TL_inputStickerSetID.access_hash = tLRPC$StickerSet.access_hash;
            tLRPC$TL_inputStickerSetID.id = tLRPC$StickerSet.id;
            arrayList2.add(tLRPC$TL_inputStickerSetID);
            if (i2 != 0) {
                if (i2 != 1) {
                    z2 = false;
                }
                tLRPC$StickerSet.archived = z2;
            }
            int size2 = this.stickerSets[i].size();
            int i4 = 0;
            while (true) {
                if (i4 < size2) {
                    TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = this.stickerSets[i].get(i4);
                    if (tLRPC$TL_messages_stickerSet.set.id == tLRPC$TL_inputStickerSetID.id) {
                        this.stickerSets[i].remove(i4);
                        if (i2 == 2) {
                            this.stickerSets[i].add(0, tLRPC$TL_messages_stickerSet);
                        } else {
                            this.stickerSetsById.remove(tLRPC$TL_messages_stickerSet.set.id);
                            this.installedStickerSetsById.remove(tLRPC$TL_messages_stickerSet.set.id);
                            this.stickerSetsByName.remove(tLRPC$TL_messages_stickerSet.set.short_name);
                        }
                    } else {
                        i4++;
                    }
                }
            }
            i3++;
        }
        this.loadHash[i] = calcStickersHash(this.stickerSets[i]);
        putStickersToCache(i, this.stickerSets[i], this.loadDate[i], this.loadHash[i]);
        getNotificationCenter().postNotificationName(NotificationCenter.stickersDidLoad, Integer.valueOf(i));
        TLRPC$TL_messages_toggleStickerSets tLRPC$TL_messages_toggleStickerSets = new TLRPC$TL_messages_toggleStickerSets();
        tLRPC$TL_messages_toggleStickerSets.stickersets = arrayList2;
        if (i2 == 0) {
            tLRPC$TL_messages_toggleStickerSets.uninstall = true;
        } else if (i2 == 1) {
            tLRPC$TL_messages_toggleStickerSets.archive = true;
        } else if (i2 == 2) {
            tLRPC$TL_messages_toggleStickerSets.unarchive = true;
        }
        getConnectionsManager().sendRequest(tLRPC$TL_messages_toggleStickerSets, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MediaDataController.this.lambda$toggleStickerSets$83(i2, baseFragment, z, i, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$toggleStickerSets$83(final int i, final BaseFragment baseFragment, final boolean z, final int i2, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$toggleStickerSets$82(i, tLObject, baseFragment, z, i2);
            }
        });
    }

    public void lambda$toggleStickerSets$82(int i, TLObject tLObject, BaseFragment baseFragment, boolean z, int i2) {
        if (i != 0) {
            if (tLObject instanceof TLRPC$TL_messages_stickerSetInstallResultArchive) {
                processStickerSetInstallResultArchive(baseFragment, z, i2, (TLRPC$TL_messages_stickerSetInstallResultArchive) tLObject);
            }
            loadStickers(i2, false, false, true);
            return;
        }
        loadStickers(i2, false, true);
    }

    public void processStickerSetInstallResultArchive(BaseFragment baseFragment, boolean z, int i, TLRPC$TL_messages_stickerSetInstallResultArchive tLRPC$TL_messages_stickerSetInstallResultArchive) {
        int size = tLRPC$TL_messages_stickerSetInstallResultArchive.sets.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.installedStickerSetsById.remove(tLRPC$TL_messages_stickerSetInstallResultArchive.sets.get(i2).set.id);
        }
        loadArchivedStickersCount(i, false);
        getNotificationCenter().postNotificationName(NotificationCenter.needAddArchivedStickers, tLRPC$TL_messages_stickerSetInstallResultArchive.sets);
        if (!(baseFragment == null || baseFragment.getParentActivity() == null)) {
            baseFragment.showDialog(new StickersArchiveAlert(baseFragment.getParentActivity(), z ? baseFragment : null, tLRPC$TL_messages_stickerSetInstallResultArchive.sets).create());
        }
    }

    private int getMask() {
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
    }

    public boolean isMessageFound(int i, boolean z) {
        return this.searchResultMessagesMap[z ? 1 : 0].indexOfKey(i) >= 0;
    }

    public void searchMessagesInChat(String str, long j, long j2, int i, int i2, int i3, TLRPC$User tLRPC$User, TLRPC$Chat tLRPC$Chat) {
        searchMessagesInChat(str, j, j2, i, i2, i3, false, tLRPC$User, tLRPC$Chat, true);
    }

    public void jumpToSearchedMessage(int i, int i2) {
        if (i2 >= 0 && i2 < this.searchResultMessages.size()) {
            this.lastReturnedNum = i2;
            MessageObject messageObject = this.searchResultMessages.get(i2);
            NotificationCenter notificationCenter = getNotificationCenter();
            int i3 = NotificationCenter.chatSearchResultsAvailable;
            int[] iArr = this.messagesSearchCount;
            notificationCenter.postNotificationName(i3, Integer.valueOf(i), Integer.valueOf(messageObject.getId()), Integer.valueOf(getMask()), Long.valueOf(messageObject.getDialogId()), Integer.valueOf(this.lastReturnedNum), Integer.valueOf(iArr[0] + iArr[1]), Boolean.TRUE);
        }
    }

    public void loadMoreSearchMessages() {
        if (!this.loadingMoreSearchMessages) {
            boolean[] zArr = this.messagesSearchEndReached;
            if (!zArr[0] || this.lastMergeDialogId != 0 || !zArr[1]) {
                int size = this.searchResultMessages.size();
                this.lastReturnedNum = this.searchResultMessages.size();
                searchMessagesInChat(null, this.lastDialogId, this.lastMergeDialogId, this.lastGuid, 1, this.lastReplyMessageId, false, this.lastSearchUser, this.lastSearchChat, false);
                this.lastReturnedNum = size;
                this.loadingMoreSearchMessages = true;
            }
        }
    }

    private void searchMessagesInChat(String str, final long j, final long j2, final int i, final int i2, final int i3, boolean z, final TLRPC$User tLRPC$User, final TLRPC$Chat tLRPC$Chat, final boolean z2) {
        long j3;
        int i4;
        String str2;
        long j4;
        String str3;
        long j5;
        int i5;
        boolean z3 = !z;
        if (this.reqId != 0) {
            getConnectionsManager().cancelRequest(this.reqId, true);
            this.reqId = 0;
        }
        if (this.mergeReqId != 0) {
            getConnectionsManager().cancelRequest(this.mergeReqId, true);
            this.mergeReqId = 0;
        }
        if (str != null) {
            if (z3) {
                boolean[] zArr = this.messagesSearchEndReached;
                zArr[1] = false;
                zArr[0] = false;
                int[] iArr = this.messagesSearchCount;
                iArr[1] = 0;
                iArr[0] = 0;
                this.searchResultMessages.clear();
                this.searchResultMessagesMap[0].clear();
                this.searchResultMessagesMap[1].clear();
                getNotificationCenter().postNotificationName(NotificationCenter.chatSearchResultsLoading, Integer.valueOf(i));
            }
            str2 = str;
            j3 = j;
            i4 = 0;
        } else if (!this.searchResultMessages.isEmpty()) {
            if (i2 == 1) {
                int i6 = this.lastReturnedNum + 1;
                this.lastReturnedNum = i6;
                if (i6 < this.searchResultMessages.size()) {
                    MessageObject messageObject = this.searchResultMessages.get(this.lastReturnedNum);
                    NotificationCenter notificationCenter = getNotificationCenter();
                    int i7 = NotificationCenter.chatSearchResultsAvailable;
                    int[] iArr2 = this.messagesSearchCount;
                    notificationCenter.postNotificationName(i7, Integer.valueOf(i), Integer.valueOf(messageObject.getId()), Integer.valueOf(getMask()), Long.valueOf(messageObject.getDialogId()), Integer.valueOf(this.lastReturnedNum), Integer.valueOf(iArr2[0] + iArr2[1]), Boolean.valueOf(z2));
                    return;
                }
                boolean[] zArr2 = this.messagesSearchEndReached;
                if (!zArr2[0] || j2 != 0 || !zArr2[1]) {
                    String str4 = this.lastSearchQuery;
                    ArrayList<MessageObject> arrayList = this.searchResultMessages;
                    MessageObject messageObject2 = arrayList.get(arrayList.size() - 1);
                    if (messageObject2.getDialogId() != j || this.messagesSearchEndReached[0]) {
                        i5 = messageObject2.getDialogId() == j2 ? messageObject2.getId() : 0;
                        this.messagesSearchEndReached[1] = false;
                        j5 = j2;
                    } else {
                        i5 = messageObject2.getId();
                        j5 = j;
                    }
                    j3 = j5;
                    i4 = i5;
                    str2 = str4;
                    z3 = false;
                } else {
                    this.lastReturnedNum--;
                    return;
                }
            } else if (i2 == 2) {
                int i8 = this.lastReturnedNum - 1;
                this.lastReturnedNum = i8;
                if (i8 < 0) {
                    this.lastReturnedNum = 0;
                    return;
                }
                if (i8 >= this.searchResultMessages.size()) {
                    this.lastReturnedNum = this.searchResultMessages.size() - 1;
                }
                MessageObject messageObject3 = this.searchResultMessages.get(this.lastReturnedNum);
                NotificationCenter notificationCenter2 = getNotificationCenter();
                int i9 = NotificationCenter.chatSearchResultsAvailable;
                int[] iArr3 = this.messagesSearchCount;
                notificationCenter2.postNotificationName(i9, Integer.valueOf(i), Integer.valueOf(messageObject3.getId()), Integer.valueOf(getMask()), Long.valueOf(messageObject3.getDialogId()), Integer.valueOf(this.lastReturnedNum), Integer.valueOf(iArr3[0] + iArr3[1]), Boolean.valueOf(z2));
                return;
            } else {
                return;
            }
        } else {
            return;
        }
        boolean[] zArr3 = this.messagesSearchEndReached;
        if (!zArr3[0] || zArr3[1]) {
            j4 = 0;
        } else {
            j4 = 0;
            if (j2 != 0) {
                j3 = j2;
            }
        }
        if (j3 != j || !z3) {
            str3 = str2;
        } else if (j2 != j4) {
            TLRPC$InputPeer inputPeer = getMessagesController().getInputPeer(j2);
            if (inputPeer != null) {
                final TLRPC$TL_messages_search tLRPC$TL_messages_search = new TLRPC$TL_messages_search();
                tLRPC$TL_messages_search.peer = inputPeer;
                this.lastMergeDialogId = j2;
                tLRPC$TL_messages_search.limit = 1;
                tLRPC$TL_messages_search.q = str2;
                if (tLRPC$User != null) {
                    tLRPC$TL_messages_search.from_id = MessagesController.getInputPeer(tLRPC$User);
                    tLRPC$TL_messages_search.flags = 1 | tLRPC$TL_messages_search.flags;
                } else if (tLRPC$Chat != null) {
                    tLRPC$TL_messages_search.from_id = MessagesController.getInputPeer(tLRPC$Chat);
                    tLRPC$TL_messages_search.flags = 1 | tLRPC$TL_messages_search.flags;
                }
                tLRPC$TL_messages_search.filter = new TLRPC$TL_inputMessagesFilterEmpty();
                this.mergeReqId = getConnectionsManager().sendRequest(tLRPC$TL_messages_search, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MediaDataController.this.lambda$searchMessagesInChat$85(j2, tLRPC$TL_messages_search, j, i, i2, i3, tLRPC$User, tLRPC$Chat, z2, tLObject, tLRPC$TL_error);
                    }
                }, 2);
                return;
            }
            return;
        } else {
            str3 = str2;
            this.lastMergeDialogId = 0L;
            zArr3[1] = true;
            this.messagesSearchCount[1] = 0;
        }
        final TLRPC$TL_messages_search tLRPC$TL_messages_search2 = new TLRPC$TL_messages_search();
        TLRPC$InputPeer inputPeer2 = getMessagesController().getInputPeer(j3);
        tLRPC$TL_messages_search2.peer = inputPeer2;
        if (inputPeer2 != null) {
            this.lastGuid = i;
            this.lastDialogId = j;
            this.lastSearchUser = tLRPC$User;
            this.lastSearchChat = tLRPC$Chat;
            this.lastReplyMessageId = i3;
            tLRPC$TL_messages_search2.limit = 21;
            tLRPC$TL_messages_search2.q = str3 != null ? str3 : "";
            tLRPC$TL_messages_search2.offset_id = i4;
            if (tLRPC$User != null) {
                tLRPC$TL_messages_search2.from_id = MessagesController.getInputPeer(tLRPC$User);
                tLRPC$TL_messages_search2.flags |= 1;
            } else if (tLRPC$Chat != null) {
                tLRPC$TL_messages_search2.from_id = MessagesController.getInputPeer(tLRPC$Chat);
                tLRPC$TL_messages_search2.flags |= 1;
            }
            int i10 = this.lastReplyMessageId;
            if (i10 != 0) {
                tLRPC$TL_messages_search2.top_msg_id = i10;
                tLRPC$TL_messages_search2.flags |= 2;
            }
            tLRPC$TL_messages_search2.filter = new TLRPC$TL_inputMessagesFilterEmpty();
            final int i11 = this.lastReqId + 1;
            this.lastReqId = i11;
            this.lastSearchQuery = str3;
            final String str5 = str3;
            final long j6 = j3;
            this.reqId = getConnectionsManager().sendRequest(tLRPC$TL_messages_search2, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MediaDataController.this.lambda$searchMessagesInChat$87(str5, i11, z2, tLRPC$TL_messages_search2, j6, j, i, j2, i3, tLRPC$User, tLRPC$Chat, tLObject, tLRPC$TL_error);
                }
            }, 2);
        }
    }

    public void lambda$searchMessagesInChat$85(final long j, final TLRPC$TL_messages_search tLRPC$TL_messages_search, final long j2, final int i, final int i2, final int i3, final TLRPC$User tLRPC$User, final TLRPC$Chat tLRPC$Chat, final boolean z, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$searchMessagesInChat$84(j, tLObject, tLRPC$TL_messages_search, j2, i, i2, i3, tLRPC$User, tLRPC$Chat, z);
            }
        });
    }

    public void lambda$searchMessagesInChat$84(long j, TLObject tLObject, TLRPC$TL_messages_search tLRPC$TL_messages_search, long j2, int i, int i2, int i3, TLRPC$User tLRPC$User, TLRPC$Chat tLRPC$Chat, boolean z) {
        if (this.lastMergeDialogId == j) {
            this.mergeReqId = 0;
            if (tLObject != null) {
                TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
                this.messagesSearchEndReached[1] = tLRPC$messages_Messages.messages.isEmpty();
                this.messagesSearchCount[1] = tLRPC$messages_Messages instanceof TLRPC$TL_messages_messagesSlice ? tLRPC$messages_Messages.count : tLRPC$messages_Messages.messages.size();
                searchMessagesInChat(tLRPC$TL_messages_search.q, j2, j, i, i2, i3, true, tLRPC$User, tLRPC$Chat, z);
                return;
            }
            this.messagesSearchEndReached[1] = true;
            this.messagesSearchCount[1] = 0;
            searchMessagesInChat(tLRPC$TL_messages_search.q, j2, j, i, i2, i3, true, tLRPC$User, tLRPC$Chat, z);
        }
    }

    public void lambda$searchMessagesInChat$87(String str, final int i, final boolean z, final TLRPC$TL_messages_search tLRPC$TL_messages_search, final long j, final long j2, final int i2, final long j3, final int i3, final TLRPC$User tLRPC$User, final TLRPC$Chat tLRPC$Chat, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        final ArrayList arrayList = new ArrayList();
        if (tLRPC$TL_error == null) {
            TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
            int min = Math.min(tLRPC$messages_Messages.messages.size(), 20);
            for (int i4 = 0; i4 < min; i4++) {
                MessageObject messageObject = new MessageObject(this.currentAccount, tLRPC$messages_Messages.messages.get(i4), false, false);
                messageObject.setQuery(str);
                arrayList.add(messageObject);
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$searchMessagesInChat$86(i, z, tLObject, tLRPC$TL_messages_search, j, j2, i2, arrayList, j3, i3, tLRPC$User, tLRPC$Chat);
            }
        });
    }

    public void lambda$searchMessagesInChat$86(int i, boolean z, TLObject tLObject, TLRPC$TL_messages_search tLRPC$TL_messages_search, long j, long j2, int i2, ArrayList arrayList, long j3, int i3, TLRPC$User tLRPC$User, TLRPC$Chat tLRPC$Chat) {
        if (i == this.lastReqId) {
            this.reqId = 0;
            if (!z) {
                this.loadingMoreSearchMessages = false;
            }
            if (tLObject != null) {
                TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
                int i4 = 0;
                while (i4 < tLRPC$messages_Messages.messages.size()) {
                    TLRPC$Message tLRPC$Message = tLRPC$messages_Messages.messages.get(i4);
                    if ((tLRPC$Message instanceof TLRPC$TL_messageEmpty) || (tLRPC$Message.action instanceof TLRPC$TL_messageActionHistoryClear)) {
                        tLRPC$messages_Messages.messages.remove(i4);
                        i4--;
                    }
                    i4++;
                }
                getMessagesStorage().putUsersAndChats(tLRPC$messages_Messages.users, tLRPC$messages_Messages.chats, true, true);
                getMessagesController().putUsers(tLRPC$messages_Messages.users, false);
                getMessagesController().putChats(tLRPC$messages_Messages.chats, false);
                if (tLRPC$TL_messages_search.offset_id == 0 && j == j2) {
                    this.lastReturnedNum = 0;
                    this.searchResultMessages.clear();
                    this.searchResultMessagesMap[0].clear();
                    this.searchResultMessagesMap[1].clear();
                    this.messagesSearchCount[0] = 0;
                    getNotificationCenter().postNotificationName(NotificationCenter.chatSearchResultsLoading, Integer.valueOf(i2));
                }
                int min = Math.min(tLRPC$messages_Messages.messages.size(), 20);
                int i5 = 0;
                boolean z2 = false;
                while (i5 < min) {
                    tLRPC$messages_Messages.messages.get(i5);
                    MessageObject messageObject = (MessageObject) arrayList.get(i5);
                    this.searchResultMessages.add(messageObject);
                    this.searchResultMessagesMap[j == j2 ? (char) 0 : (char) 1].put(messageObject.getId(), messageObject);
                    i5++;
                    z2 = true;
                }
                this.messagesSearchEndReached[j == j2 ? (char) 0 : (char) 1] = tLRPC$messages_Messages.messages.size() < 21;
                this.messagesSearchCount[j == j2 ? (char) 0 : (char) 1] = ((tLRPC$messages_Messages instanceof TLRPC$TL_messages_messagesSlice) || (tLRPC$messages_Messages instanceof TLRPC$TL_messages_channelMessages)) ? tLRPC$messages_Messages.count : tLRPC$messages_Messages.messages.size();
                if (this.searchResultMessages.isEmpty()) {
                    getNotificationCenter().postNotificationName(NotificationCenter.chatSearchResultsAvailable, Integer.valueOf(i2), 0, Integer.valueOf(getMask()), 0L, 0, 0, Boolean.valueOf(z));
                } else if (z2) {
                    if (this.lastReturnedNum >= this.searchResultMessages.size()) {
                        this.lastReturnedNum = this.searchResultMessages.size() - 1;
                    }
                    MessageObject messageObject2 = this.searchResultMessages.get(this.lastReturnedNum);
                    NotificationCenter notificationCenter = getNotificationCenter();
                    int i6 = NotificationCenter.chatSearchResultsAvailable;
                    int[] iArr = this.messagesSearchCount;
                    notificationCenter.postNotificationName(i6, Integer.valueOf(i2), Integer.valueOf(messageObject2.getId()), Integer.valueOf(getMask()), Long.valueOf(messageObject2.getDialogId()), Integer.valueOf(this.lastReturnedNum), Integer.valueOf(iArr[0] + iArr[1]), Boolean.valueOf(z));
                }
                if (j == j2) {
                    boolean[] zArr = this.messagesSearchEndReached;
                    if (zArr[0] && j3 != 0 && !zArr[1]) {
                        searchMessagesInChat(this.lastSearchQuery, j2, j3, i2, 0, i3, true, tLRPC$User, tLRPC$Chat, z);
                    }
                }
            }
        }
    }

    public String getLastSearchQuery() {
        return this.lastSearchQuery;
    }

    public void loadMedia(final long r17, final int r19, final int r20, final int r21, final int r22, int r23, final int r24, final int r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.loadMedia(long, int, int, int, int, int, int, int):void");
    }

    public void lambda$loadMedia$88(long j, int i, int i2, int i3, int i4, int i5, boolean z, int i6, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
            getMessagesController().removeDeletedMessagesFromArray(j, tLRPC$messages_Messages.messages);
            boolean z2 = false;
            if (i == 0 ? tLRPC$messages_Messages.messages.size() == 0 : tLRPC$messages_Messages.messages.size() <= 1) {
                z2 = true;
            }
            processLoadedMedia(tLRPC$messages_Messages, j, i2, i3, i, i4, 0, i5, z, z2, i6);
        }
    }

    public void getMediaCounts(final long j, final int i) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$getMediaCounts$93(j, i);
            }
        });
    }

    public void lambda$getMediaCounts$93(final long j, int i) {
        try {
            final int[] iArr = new int[8];
            iArr[0] = -1;
            iArr[1] = -1;
            iArr[2] = -1;
            iArr[3] = -1;
            iArr[4] = -1;
            iArr[5] = -1;
            iArr[6] = -1;
            iArr[7] = -1;
            final int[] iArr2 = new int[8];
            iArr2[0] = -1;
            iArr2[1] = -1;
            iArr2[2] = -1;
            iArr2[3] = -1;
            iArr2[4] = -1;
            iArr2[5] = -1;
            iArr2[6] = -1;
            iArr2[7] = -1;
            int[] iArr3 = new int[8];
            iArr3[0] = 0;
            iArr3[1] = 0;
            iArr3[2] = 0;
            iArr3[3] = 0;
            iArr3[4] = 0;
            iArr3[5] = 0;
            iArr3[6] = 0;
            iArr3[7] = 0;
            SQLiteCursor queryFinalized = getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT type, count, old FROM media_counts_v2 WHERE uid = %d", Long.valueOf(j)), new Object[0]);
            while (queryFinalized.next()) {
                int intValue = queryFinalized.intValue(0);
                if (intValue >= 0 && intValue < 8) {
                    int intValue2 = queryFinalized.intValue(1);
                    iArr[intValue] = intValue2;
                    iArr2[intValue] = intValue2;
                    iArr3[intValue] = queryFinalized.intValue(2);
                }
            }
            queryFinalized.dispose();
            if (DialogObject.isEncryptedDialog(j)) {
                for (int i2 = 0; i2 < 8; i2++) {
                    if (iArr[i2] == -1) {
                        SQLiteCursor queryFinalized2 = getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT COUNT(mid) FROM media_v4 WHERE uid = %d AND type = %d LIMIT 1", Long.valueOf(j), Integer.valueOf(i2)), new Object[0]);
                        if (queryFinalized2.next()) {
                            iArr[i2] = queryFinalized2.intValue(0);
                        } else {
                            iArr[i2] = 0;
                        }
                        queryFinalized2.dispose();
                        putMediaCountDatabase(j, i2, iArr[i2]);
                    }
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MediaDataController.this.lambda$getMediaCounts$89(j, iArr);
                    }
                });
                return;
            }
            TLRPC$TL_messages_getSearchCounters tLRPC$TL_messages_getSearchCounters = new TLRPC$TL_messages_getSearchCounters();
            tLRPC$TL_messages_getSearchCounters.peer = getMessagesController().getInputPeer(j);
            int i3 = 0;
            boolean z = false;
            for (int i4 = 8; i3 < i4; i4 = 8) {
                if (tLRPC$TL_messages_getSearchCounters.peer == null) {
                    iArr[i3] = 0;
                } else if (iArr[i3] == -1 || iArr3[i3] == 1) {
                    if (i3 == 0) {
                        tLRPC$TL_messages_getSearchCounters.filters.add(new TLRPC$TL_inputMessagesFilterPhotoVideo());
                    } else if (i3 == 1) {
                        tLRPC$TL_messages_getSearchCounters.filters.add(new TLRPC$TL_inputMessagesFilterDocument());
                    } else if (i3 == 2) {
                        tLRPC$TL_messages_getSearchCounters.filters.add(new TLRPC$TL_inputMessagesFilterRoundVoice());
                    } else if (i3 == 3) {
                        tLRPC$TL_messages_getSearchCounters.filters.add(new TLRPC$TL_inputMessagesFilterUrl());
                    } else if (i3 == 4) {
                        tLRPC$TL_messages_getSearchCounters.filters.add(new TLRPC$TL_inputMessagesFilterMusic());
                    } else if (i3 == 6) {
                        tLRPC$TL_messages_getSearchCounters.filters.add(new TLRPC$TL_inputMessagesFilterPhotos());
                    } else if (i3 == 7) {
                        tLRPC$TL_messages_getSearchCounters.filters.add(new TLRPC$TL_inputMessagesFilterVideo());
                    } else {
                        tLRPC$TL_messages_getSearchCounters.filters.add(new TLRPC$TL_inputMessagesFilterGif());
                    }
                    if (iArr[i3] == -1) {
                        z = true;
                    } else if (iArr3[i3] == 1) {
                        iArr[i3] = -1;
                    }
                }
                i3++;
            }
            if (!tLRPC$TL_messages_getSearchCounters.filters.isEmpty()) {
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tLRPC$TL_messages_getSearchCounters, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MediaDataController.this.lambda$getMediaCounts$91(iArr, j, tLObject, tLRPC$TL_error);
                    }
                }), i);
            }
            if (!z) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MediaDataController.this.lambda$getMediaCounts$92(j, iArr2);
                    }
                });
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$getMediaCounts$89(long j, int[] iArr) {
        getNotificationCenter().postNotificationName(NotificationCenter.mediaCountsDidLoad, Long.valueOf(j), iArr);
    }

    public void lambda$getMediaCounts$91(final int[] iArr, final long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        int i;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] < 0) {
                iArr[i2] = 0;
            }
        }
        if (tLObject != null) {
            TLRPC$Vector tLRPC$Vector = (TLRPC$Vector) tLObject;
            int size = tLRPC$Vector.objects.size();
            for (int i3 = 0; i3 < size; i3++) {
                TLRPC$TL_messages_searchCounter tLRPC$TL_messages_searchCounter = (TLRPC$TL_messages_searchCounter) tLRPC$Vector.objects.get(i3);
                TLRPC$MessagesFilter tLRPC$MessagesFilter = tLRPC$TL_messages_searchCounter.filter;
                if (tLRPC$MessagesFilter instanceof TLRPC$TL_inputMessagesFilterPhotoVideo) {
                    i = 0;
                } else if (tLRPC$MessagesFilter instanceof TLRPC$TL_inputMessagesFilterDocument) {
                    i = 1;
                } else if (tLRPC$MessagesFilter instanceof TLRPC$TL_inputMessagesFilterRoundVoice) {
                    i = 2;
                } else if (tLRPC$MessagesFilter instanceof TLRPC$TL_inputMessagesFilterUrl) {
                    i = 3;
                } else if (tLRPC$MessagesFilter instanceof TLRPC$TL_inputMessagesFilterMusic) {
                    i = 4;
                } else if (tLRPC$MessagesFilter instanceof TLRPC$TL_inputMessagesFilterGif) {
                    i = 5;
                } else if (tLRPC$MessagesFilter instanceof TLRPC$TL_inputMessagesFilterPhotos) {
                    i = 6;
                } else if (tLRPC$MessagesFilter instanceof TLRPC$TL_inputMessagesFilterVideo) {
                    i = 7;
                }
                iArr[i] = tLRPC$TL_messages_searchCounter.count;
                putMediaCountDatabase(j, i, iArr[i]);
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$getMediaCounts$90(j, iArr);
            }
        });
    }

    public void lambda$getMediaCounts$90(long j, int[] iArr) {
        getNotificationCenter().postNotificationName(NotificationCenter.mediaCountsDidLoad, Long.valueOf(j), iArr);
    }

    public void lambda$getMediaCounts$92(long j, int[] iArr) {
        getNotificationCenter().postNotificationName(NotificationCenter.mediaCountsDidLoad, Long.valueOf(j), iArr);
    }

    public void getMediaCount(final long j, final int i, final int i2, boolean z) {
        if (z || DialogObject.isEncryptedDialog(j)) {
            getMediaCountDatabase(j, i, i2);
            return;
        }
        TLRPC$TL_messages_getSearchCounters tLRPC$TL_messages_getSearchCounters = new TLRPC$TL_messages_getSearchCounters();
        if (i == 0) {
            tLRPC$TL_messages_getSearchCounters.filters.add(new TLRPC$TL_inputMessagesFilterPhotoVideo());
        } else if (i == 1) {
            tLRPC$TL_messages_getSearchCounters.filters.add(new TLRPC$TL_inputMessagesFilterDocument());
        } else if (i == 2) {
            tLRPC$TL_messages_getSearchCounters.filters.add(new TLRPC$TL_inputMessagesFilterRoundVoice());
        } else if (i == 3) {
            tLRPC$TL_messages_getSearchCounters.filters.add(new TLRPC$TL_inputMessagesFilterUrl());
        } else if (i == 4) {
            tLRPC$TL_messages_getSearchCounters.filters.add(new TLRPC$TL_inputMessagesFilterMusic());
        } else if (i == 5) {
            tLRPC$TL_messages_getSearchCounters.filters.add(new TLRPC$TL_inputMessagesFilterGif());
        }
        TLRPC$InputPeer inputPeer = getMessagesController().getInputPeer(j);
        tLRPC$TL_messages_getSearchCounters.peer = inputPeer;
        if (inputPeer != null) {
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tLRPC$TL_messages_getSearchCounters, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MediaDataController.this.lambda$getMediaCount$94(j, i, i2, tLObject, tLRPC$TL_error);
                }
            }), i2);
        }
    }

    public void lambda$getMediaCount$94(long j, int i, int i2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            TLRPC$Vector tLRPC$Vector = (TLRPC$Vector) tLObject;
            if (!tLRPC$Vector.objects.isEmpty()) {
                processLoadedMediaCount(((TLRPC$TL_messages_searchCounter) tLRPC$Vector.objects.get(0)).count, j, i, i2, false, 0);
            }
        }
    }

    public static int getMediaType(TLRPC$Message tLRPC$Message) {
        if (tLRPC$Message == null) {
            return -1;
        }
        TLRPC$MessageMedia tLRPC$MessageMedia = tLRPC$Message.media;
        if (tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaPhoto) {
            return 0;
        }
        if (tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaDocument) {
            TLRPC$Document tLRPC$Document = tLRPC$MessageMedia.document;
            if (tLRPC$Document == null) {
                return -1;
            }
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            for (int i = 0; i < tLRPC$Document.attributes.size(); i++) {
                TLRPC$DocumentAttribute tLRPC$DocumentAttribute = tLRPC$Document.attributes.get(i);
                if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeVideo) {
                    z = tLRPC$DocumentAttribute.round_message;
                    z2 = !z;
                } else if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeAnimated) {
                    z3 = true;
                } else if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeAudio) {
                    z = tLRPC$DocumentAttribute.voice;
                    z5 = !z;
                } else if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeSticker) {
                    z4 = true;
                }
            }
            if (z) {
                return 2;
            }
            if (!(!z2 || z3 || z4)) {
                return 0;
            }
            if (z4) {
                return -1;
            }
            if (z3) {
                return 5;
            }
            return z5 ? 4 : 1;
        }
        if (!tLRPC$Message.entities.isEmpty()) {
            for (int i2 = 0; i2 < tLRPC$Message.entities.size(); i2++) {
                TLRPC$MessageEntity tLRPC$MessageEntity = tLRPC$Message.entities.get(i2);
                if ((tLRPC$MessageEntity instanceof TLRPC$TL_messageEntityUrl) || (tLRPC$MessageEntity instanceof TLRPC$TL_messageEntityTextUrl) || (tLRPC$MessageEntity instanceof TLRPC$TL_messageEntityEmail)) {
                    return 3;
                }
            }
        }
        return -1;
    }

    public static boolean canAddMessageToMedia(TLRPC$Message tLRPC$Message) {
        int i;
        boolean z = tLRPC$Message instanceof TLRPC$TL_message_secret;
        if (z && (((tLRPC$Message.media instanceof TLRPC$TL_messageMediaPhoto) || MessageObject.isVideoMessage(tLRPC$Message) || MessageObject.isGifMessage(tLRPC$Message)) && (i = tLRPC$Message.media.ttl_seconds) != 0 && i <= 60)) {
            return false;
        }
        if (!z && (tLRPC$Message instanceof TLRPC$TL_message)) {
            TLRPC$MessageMedia tLRPC$MessageMedia = tLRPC$Message.media;
            if (((tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaPhoto) || (tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaDocument)) && tLRPC$MessageMedia.ttl_seconds != 0) {
                return false;
            }
        }
        return getMediaType(tLRPC$Message) != -1;
    }

    public void processLoadedMedia(final TLRPC$messages_Messages tLRPC$messages_Messages, final long j, int i, int i2, final int i3, final int i4, final int i5, final int i6, boolean z, final boolean z2, final int i7) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("process load media did " + j + " count = " + i + " max_id=" + i2 + " min_id=" + i3 + " type = " + i4 + " cache = " + i5 + " classGuid = " + i6);
        }
        if (i5 == 0 || (((!tLRPC$messages_Messages.messages.isEmpty() || i3 != 0) && (tLRPC$messages_Messages.messages.size() > 1 || i3 == 0)) || DialogObject.isEncryptedDialog(j))) {
            if (i5 == 0) {
                ImageLoader.saveMessagesThumbs(tLRPC$messages_Messages.messages);
                getMessagesStorage().putUsersAndChats(tLRPC$messages_Messages.users, tLRPC$messages_Messages.chats, true, true);
                putMediaDatabase(j, i4, tLRPC$messages_Messages.messages, i2, i3, z2);
            }
            Utilities.searchQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$processLoadedMedia$96(tLRPC$messages_Messages, i5, j, i6, i4, z2, i3, i7);
                }
            });
        } else if (i5 != 2) {
            loadMedia(j, i, i2, i3, i4, 0, i6, i7);
        }
    }

    public void lambda$processLoadedMedia$96(final TLRPC$messages_Messages tLRPC$messages_Messages, final int i, final long j, final int i2, final int i3, final boolean z, final int i4, final int i5) {
        LongSparseArray longSparseArray = new LongSparseArray();
        for (int i6 = 0; i6 < tLRPC$messages_Messages.users.size(); i6++) {
            TLRPC$User tLRPC$User = tLRPC$messages_Messages.users.get(i6);
            longSparseArray.put(tLRPC$User.id, tLRPC$User);
        }
        final ArrayList<MessageObject> arrayList = new ArrayList<>();
        for (int i7 = 0; i7 < tLRPC$messages_Messages.messages.size(); i7++) {
            MessageObject messageObject = new MessageObject(this.currentAccount, tLRPC$messages_Messages.messages.get(i7), (LongSparseArray<TLRPC$User>) longSparseArray, true, false);
            messageObject.createStrippedThumb();
            arrayList.add(messageObject);
        }
        getFileLoader().checkMediaExistance(arrayList);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$processLoadedMedia$95(tLRPC$messages_Messages, i, j, arrayList, i2, i3, z, i4, i5);
            }
        });
    }

    public void lambda$processLoadedMedia$95(TLRPC$messages_Messages tLRPC$messages_Messages, int i, long j, ArrayList arrayList, int i2, int i3, boolean z, int i4, int i5) {
        int i6 = tLRPC$messages_Messages.count;
        boolean z2 = true;
        getMessagesController().putUsers(tLRPC$messages_Messages.users, i != 0);
        getMessagesController().putChats(tLRPC$messages_Messages.chats, i != 0);
        NotificationCenter notificationCenter = getNotificationCenter();
        int i7 = NotificationCenter.mediaDidLoad;
        Object[] objArr = new Object[8];
        objArr[0] = Long.valueOf(j);
        objArr[1] = Integer.valueOf(i6);
        objArr[2] = arrayList;
        objArr[3] = Integer.valueOf(i2);
        objArr[4] = Integer.valueOf(i3);
        objArr[5] = Boolean.valueOf(z);
        if (i4 == 0) {
            z2 = false;
        }
        objArr[6] = Boolean.valueOf(z2);
        objArr[7] = Integer.valueOf(i5);
        notificationCenter.postNotificationName(i7, objArr);
    }

    private void processLoadedMediaCount(final int i, final long j, final int i2, final int i3, final boolean z, final int i4) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$processLoadedMediaCount$97(j, z, i, i2, i4, i3);
            }
        });
    }

    public void lambda$processLoadedMediaCount$97(long j, boolean z, int i, int i2, int i3, int i4) {
        boolean isEncryptedDialog = DialogObject.isEncryptedDialog(j);
        int i5 = 0;
        boolean z2 = z && (i == -1 || (i == 0 && i2 == 2)) && !isEncryptedDialog;
        if (z2 || (i3 == 1 && !isEncryptedDialog)) {
            getMediaCount(j, i2, i4, false);
        }
        if (!z2) {
            if (!z) {
                putMediaCountDatabase(j, i2, i);
            }
            NotificationCenter notificationCenter = getNotificationCenter();
            int i6 = NotificationCenter.mediaCountDidLoad;
            Object[] objArr = new Object[4];
            objArr[0] = Long.valueOf(j);
            if (!z || i != -1) {
                i5 = i;
            }
            objArr[1] = Integer.valueOf(i5);
            objArr[2] = Boolean.valueOf(z);
            objArr[3] = Integer.valueOf(i2);
            notificationCenter.postNotificationName(i6, objArr);
        }
    }

    private void putMediaCountDatabase(final long j, final int i, final int i2) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$putMediaCountDatabase$98(j, i, i2);
            }
        });
    }

    public void lambda$putMediaCountDatabase$98(long j, int i, int i2) {
        try {
            SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO media_counts_v2 VALUES(?, ?, ?, ?)");
            executeFast.requery();
            executeFast.bindLong(1, j);
            executeFast.bindInteger(2, i);
            executeFast.bindInteger(3, i2);
            executeFast.bindInteger(4, 0);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private void getMediaCountDatabase(final long j, final int i, final int i2) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$getMediaCountDatabase$99(j, i, i2);
            }
        });
    }

    public void lambda$getMediaCountDatabase$99(long j, int i, int i2) {
        Exception e;
        int i3;
        int i4;
        try {
            SQLiteDatabase database = getMessagesStorage().getDatabase();
            Locale locale = Locale.US;
            SQLiteCursor queryFinalized = database.queryFinalized(String.format(locale, "SELECT count, old FROM media_counts_v2 WHERE uid = %d AND type = %d LIMIT 1", Long.valueOf(j), Integer.valueOf(i)), new Object[0]);
            if (queryFinalized.next()) {
                i4 = queryFinalized.intValue(0);
                i3 = queryFinalized.intValue(1);
            } else {
                i4 = -1;
                i3 = 0;
            }
            queryFinalized.dispose();
            if (i4 == -1 && DialogObject.isEncryptedDialog(j)) {
                SQLiteCursor queryFinalized2 = getMessagesStorage().getDatabase().queryFinalized(String.format(locale, "SELECT COUNT(mid) FROM media_v4 WHERE uid = %d AND type = %d LIMIT 1", Long.valueOf(j), Integer.valueOf(i)), new Object[0]);
                if (queryFinalized2.next()) {
                    i4 = queryFinalized2.intValue(0);
                }
                queryFinalized2.dispose();
                if (i4 != -1) {
                    try {
                        putMediaCountDatabase(j, i, i4);
                        processLoadedMediaCount(i4, j, i, i2, true, i3);
                    } catch (Exception e2) {
                        e = e2;
                        FileLog.e(e);
                        return;
                    }
                }
            }
            processLoadedMediaCount(i4, j, i, i2, true, i3);
        } catch (Exception e3) {
            e = e3;
        }
    }

    public class AnonymousClass1 implements Runnable {
        final int val$classGuid;
        final int val$count;
        final int val$fromCache;
        final boolean val$isChannel;
        final int val$max_id;
        final int val$min_id;
        final int val$requestIndex;
        final int val$type;
        final long val$uid;

        AnonymousClass1(int i, long j, int i2, int i3, int i4, int i5, int i6, boolean z, int i7) {
            this.val$count = i;
            this.val$uid = j;
            this.val$min_id = i2;
            this.val$type = i3;
            this.val$max_id = i4;
            this.val$classGuid = i5;
            this.val$fromCache = i6;
            this.val$isChannel = z;
            this.val$requestIndex = i7;
        }

        @Override
        public void run() {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.AnonymousClass1.run():void");
        }

        public void lambda$run$0(Runnable runnable, int i) {
            MediaDataController.this.getMessagesStorage().completeTaskForGuid(runnable, i);
        }
    }

    private void loadMediaDatabase(long j, int i, int i2, int i3, int i4, int i5, boolean z, int i6, int i7) {
        AnonymousClass1 r12 = new AnonymousClass1(i, j, i3, i4, i2, i5, i6, z, i7);
        MessagesStorage messagesStorage = getMessagesStorage();
        messagesStorage.getStorageQueue().postRunnable(r12);
        messagesStorage.bindTaskToGuid(r12, i5);
    }

    private void putMediaDatabase(final long j, final int i, final ArrayList<TLRPC$Message> arrayList, final int i2, final int i3, final boolean z) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$putMediaDatabase$100(i3, arrayList, z, j, i2, i);
            }
        });
    }

    public void lambda$putMediaDatabase$100(int i, ArrayList arrayList, boolean z, long j, int i2, int i3) {
        if (i == 0) {
            try {
                if (arrayList.isEmpty() || z) {
                    getMessagesStorage().doneHolesInMedia(j, i2, i3);
                    if (arrayList.isEmpty()) {
                        return;
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        getMessagesStorage().getDatabase().beginTransaction();
        SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO media_v4 VALUES(?, ?, ?, ?, ?)");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TLRPC$Message tLRPC$Message = (TLRPC$Message) it.next();
            if (canAddMessageToMedia(tLRPC$Message)) {
                executeFast.requery();
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLRPC$Message.getObjectSize());
                tLRPC$Message.serializeToStream(nativeByteBuffer);
                executeFast.bindInteger(1, tLRPC$Message.id);
                executeFast.bindLong(2, j);
                executeFast.bindInteger(3, tLRPC$Message.date);
                executeFast.bindInteger(4, i3);
                executeFast.bindByteBuffer(5, nativeByteBuffer);
                executeFast.step();
                nativeByteBuffer.reuse();
            }
        }
        executeFast.dispose();
        if (!(z && i2 == 0 && i == 0)) {
            int i4 = (!z || i != 0) ? ((TLRPC$Message) arrayList.get(arrayList.size() - 1)).id : 1;
            if (i != 0) {
                getMessagesStorage().closeHolesInMedia(j, i4, ((TLRPC$Message) arrayList.get(0)).id, i3);
            } else if (i2 != 0) {
                getMessagesStorage().closeHolesInMedia(j, i4, i2, i3);
            } else {
                getMessagesStorage().closeHolesInMedia(j, i4, ConnectionsManager.DEFAULT_DATACENTER_ID, i3);
            }
        }
        getMessagesStorage().getDatabase().commitTransaction();
    }

    public void loadMusic(final long j, final long j2, final long j3) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$loadMusic$102(j, j2, j3);
            }
        });
    }

    public void lambda$loadMusic$102(final long j, long j2, long j3) {
        SQLiteCursor sQLiteCursor;
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (i < 2) {
            ArrayList arrayList3 = i == 0 ? arrayList : arrayList2;
            if (i == 0) {
                try {
                    if (!DialogObject.isEncryptedDialog(j)) {
                        sQLiteCursor = getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT data, mid FROM media_v4 WHERE uid = %d AND mid < %d AND type = %d ORDER BY date DESC, mid DESC LIMIT 1000", Long.valueOf(j), Long.valueOf(j2), 4), new Object[0]);
                    } else {
                        sQLiteCursor = getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT data, mid FROM media_v4 WHERE uid = %d AND mid > %d AND type = %d ORDER BY date DESC, mid DESC LIMIT 1000", Long.valueOf(j), Long.valueOf(j2), 4), new Object[0]);
                    }
                } catch (Exception e) {
                    e = e;
                    FileLog.e(e);
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            MediaDataController.this.lambda$loadMusic$101(j, arrayList, arrayList2);
                        }
                    });
                }
            } else if (!DialogObject.isEncryptedDialog(j)) {
                sQLiteCursor = getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT data, mid FROM media_v4 WHERE uid = %d AND mid > %d AND type = %d ORDER BY date DESC, mid DESC LIMIT 1000", Long.valueOf(j), Long.valueOf(j3), 4), new Object[0]);
            } else {
                sQLiteCursor = getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT data, mid FROM media_v4 WHERE uid = %d AND mid < %d AND type = %d ORDER BY date DESC, mid DESC LIMIT 1000", Long.valueOf(j), Long.valueOf(j3), 4), new Object[0]);
            }
            while (sQLiteCursor.next()) {
                NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                if (byteBufferValue != null) {
                    TLRPC$Message TLdeserialize = TLRPC$Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    TLdeserialize.readAttachPath(byteBufferValue, getUserConfig().clientUserId);
                    byteBufferValue.reuse();
                    if (MessageObject.isMusicMessage(TLdeserialize)) {
                        TLdeserialize.id = sQLiteCursor.intValue(1);
                        try {
                            TLdeserialize.dialog_id = j;
                        } catch (Exception e2) {
                            e = e2;
                        }
                        try {
                            arrayList3.add(0, new MessageObject(this.currentAccount, TLdeserialize, false, true));
                        } catch (Exception e3) {
                            e = e3;
                            FileLog.e(e);
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    MediaDataController.this.lambda$loadMusic$101(j, arrayList, arrayList2);
                                }
                            });
                        }
                    }
                }
            }
            sQLiteCursor.dispose();
            i++;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$loadMusic$101(j, arrayList, arrayList2);
            }
        });
    }

    public void lambda$loadMusic$101(long j, ArrayList arrayList, ArrayList arrayList2) {
        getNotificationCenter().postNotificationName(NotificationCenter.musicDidLoad, Long.valueOf(j), arrayList, arrayList2);
    }

    public void buildShortcuts() {
        if (Build.VERSION.SDK_INT >= 23) {
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
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$buildShortcuts$103(arrayList);
                }
            });
        }
    }

    public void lambda$buildShortcuts$103(java.util.ArrayList r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.lambda$buildShortcuts$103(java.util.ArrayList):void");
    }

    public void loadHints(boolean z) {
        if (!this.loading && getUserConfig().suggestContacts) {
            if (!z) {
                this.loading = true;
                TLRPC$TL_contacts_getTopPeers tLRPC$TL_contacts_getTopPeers = new TLRPC$TL_contacts_getTopPeers();
                tLRPC$TL_contacts_getTopPeers.hash = 0L;
                tLRPC$TL_contacts_getTopPeers.bots_pm = false;
                tLRPC$TL_contacts_getTopPeers.correspondents = true;
                tLRPC$TL_contacts_getTopPeers.groups = false;
                tLRPC$TL_contacts_getTopPeers.channels = false;
                tLRPC$TL_contacts_getTopPeers.bots_inline = true;
                tLRPC$TL_contacts_getTopPeers.offset = 0;
                tLRPC$TL_contacts_getTopPeers.limit = 20;
                getConnectionsManager().sendRequest(tLRPC$TL_contacts_getTopPeers, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MediaDataController.this.lambda$loadHints$110(tLObject, tLRPC$TL_error);
                    }
                });
            } else if (!this.loaded) {
                this.loading = true;
                getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        MediaDataController.this.lambda$loadHints$105();
                    }
                });
                this.loaded = true;
            }
        }
    }

    public void lambda$loadHints$105() {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        final ArrayList<TLRPC$User> arrayList3 = new ArrayList<>();
        final ArrayList<TLRPC$Chat> arrayList4 = new ArrayList<>();
        long clientUserId = getUserConfig().getClientUserId();
        try {
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            int i = 0;
            SQLiteCursor queryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT did, type, rating FROM chat_hints WHERE 1 ORDER BY rating DESC", new Object[0]);
            while (queryFinalized.next()) {
                long longValue = queryFinalized.longValue(i);
                if (longValue != clientUserId) {
                    int intValue = queryFinalized.intValue(1);
                    TLRPC$TL_topPeer tLRPC$TL_topPeer = new TLRPC$TL_topPeer();
                    tLRPC$TL_topPeer.rating = queryFinalized.doubleValue(2);
                    if (longValue > 0) {
                        TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                        tLRPC$TL_topPeer.peer = tLRPC$TL_peerUser;
                        tLRPC$TL_peerUser.user_id = longValue;
                        arrayList5.add(Long.valueOf(longValue));
                    } else {
                        TLRPC$TL_peerChat tLRPC$TL_peerChat = new TLRPC$TL_peerChat();
                        tLRPC$TL_topPeer.peer = tLRPC$TL_peerChat;
                        long j = -longValue;
                        tLRPC$TL_peerChat.chat_id = j;
                        arrayList6.add(Long.valueOf(j));
                    }
                    if (intValue == 0) {
                        arrayList.add(tLRPC$TL_topPeer);
                    } else if (intValue == 1) {
                        arrayList2.add(tLRPC$TL_topPeer);
                    }
                    i = 0;
                }
            }
            queryFinalized.dispose();
            if (!arrayList5.isEmpty()) {
                getMessagesStorage().getUsersInternal(TextUtils.join(",", arrayList5), arrayList3);
            }
            if (!arrayList6.isEmpty()) {
                getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList6), arrayList4);
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$loadHints$104(arrayList3, arrayList4, arrayList, arrayList2);
                }
            });
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$loadHints$104(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        getMessagesController().putUsers(arrayList, true);
        getMessagesController().putChats(arrayList2, true);
        this.loading = false;
        this.loaded = true;
        this.hints = arrayList3;
        this.inlineBots = arrayList4;
        buildShortcuts();
        getNotificationCenter().postNotificationName(NotificationCenter.reloadHints, new Object[0]);
        getNotificationCenter().postNotificationName(NotificationCenter.reloadInlineHints, new Object[0]);
        if (Math.abs(getUserConfig().lastHintsSyncTime - ((int) (System.currentTimeMillis() / 1000))) >= 86400) {
            loadHints(false);
        }
    }

    public void lambda$loadHints$110(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject instanceof TLRPC$TL_contacts_topPeers) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$loadHints$108(tLObject);
                }
            });
        } else if (tLObject instanceof TLRPC$TL_contacts_topPeersDisabled) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$loadHints$109();
                }
            });
        }
    }

    public void lambda$loadHints$108(TLObject tLObject) {
        final TLRPC$TL_contacts_topPeers tLRPC$TL_contacts_topPeers = (TLRPC$TL_contacts_topPeers) tLObject;
        getMessagesController().putUsers(tLRPC$TL_contacts_topPeers.users, false);
        getMessagesController().putChats(tLRPC$TL_contacts_topPeers.chats, false);
        for (int i = 0; i < tLRPC$TL_contacts_topPeers.categories.size(); i++) {
            TLRPC$TL_topPeerCategoryPeers tLRPC$TL_topPeerCategoryPeers = tLRPC$TL_contacts_topPeers.categories.get(i);
            if (tLRPC$TL_topPeerCategoryPeers.category instanceof TLRPC$TL_topPeerCategoryBotsInline) {
                this.inlineBots = tLRPC$TL_topPeerCategoryPeers.peers;
                getUserConfig().botRatingLoadTime = (int) (System.currentTimeMillis() / 1000);
            } else {
                this.hints = tLRPC$TL_topPeerCategoryPeers.peers;
                long clientUserId = getUserConfig().getClientUserId();
                int i2 = 0;
                while (true) {
                    if (i2 >= this.hints.size()) {
                        break;
                    } else if (this.hints.get(i2).peer.user_id == clientUserId) {
                        this.hints.remove(i2);
                        break;
                    } else {
                        i2++;
                    }
                }
                getUserConfig().ratingLoadTime = (int) (System.currentTimeMillis() / 1000);
            }
        }
        getUserConfig().saveConfig(false);
        buildShortcuts();
        getNotificationCenter().postNotificationName(NotificationCenter.reloadHints, new Object[0]);
        getNotificationCenter().postNotificationName(NotificationCenter.reloadInlineHints, new Object[0]);
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$loadHints$107(tLRPC$TL_contacts_topPeers);
            }
        });
    }

    public void lambda$loadHints$107(TLRPC$TL_contacts_topPeers tLRPC$TL_contacts_topPeers) {
        try {
            getMessagesStorage().getDatabase().executeFast("DELETE FROM chat_hints WHERE 1").stepThis().dispose();
            getMessagesStorage().getDatabase().beginTransaction();
            getMessagesStorage().putUsersAndChats(tLRPC$TL_contacts_topPeers.users, tLRPC$TL_contacts_topPeers.chats, false, false);
            SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
            for (int i = 0; i < tLRPC$TL_contacts_topPeers.categories.size(); i++) {
                TLRPC$TL_topPeerCategoryPeers tLRPC$TL_topPeerCategoryPeers = tLRPC$TL_contacts_topPeers.categories.get(i);
                int i2 = tLRPC$TL_topPeerCategoryPeers.category instanceof TLRPC$TL_topPeerCategoryBotsInline ? 1 : 0;
                for (int i3 = 0; i3 < tLRPC$TL_topPeerCategoryPeers.peers.size(); i3++) {
                    TLRPC$TL_topPeer tLRPC$TL_topPeer = tLRPC$TL_topPeerCategoryPeers.peers.get(i3);
                    executeFast.requery();
                    executeFast.bindLong(1, MessageObject.getPeerId(tLRPC$TL_topPeer.peer));
                    executeFast.bindInteger(2, i2);
                    executeFast.bindDouble(3, tLRPC$TL_topPeer.rating);
                    executeFast.bindInteger(4, 0);
                    executeFast.step();
                }
            }
            executeFast.dispose();
            getMessagesStorage().getDatabase().commitTransaction();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$loadHints$106();
                }
            });
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$loadHints$106() {
        getUserConfig().suggestContacts = true;
        getUserConfig().lastHintsSyncTime = (int) (System.currentTimeMillis() / 1000);
        getUserConfig().saveConfig(false);
    }

    public void lambda$loadHints$109() {
        getUserConfig().suggestContacts = false;
        getUserConfig().lastHintsSyncTime = (int) (System.currentTimeMillis() / 1000);
        getUserConfig().saveConfig(false);
        clearTopPeers();
    }

    public void clearTopPeers() {
        this.hints.clear();
        this.inlineBots.clear();
        getNotificationCenter().postNotificationName(NotificationCenter.reloadHints, new Object[0]);
        getNotificationCenter().postNotificationName(NotificationCenter.reloadInlineHints, new Object[0]);
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$clearTopPeers$111();
            }
        });
        buildShortcuts();
    }

    public void lambda$clearTopPeers$111() {
        try {
            getMessagesStorage().getDatabase().executeFast("DELETE FROM chat_hints WHERE 1").stepThis().dispose();
        } catch (Exception unused) {
        }
    }

    public void increaseInlineRaiting(long j) {
        if (getUserConfig().suggestContacts) {
            int max = getUserConfig().botRatingLoadTime != 0 ? Math.max(1, ((int) (System.currentTimeMillis() / 1000)) - getUserConfig().botRatingLoadTime) : 60;
            TLRPC$TL_topPeer tLRPC$TL_topPeer = null;
            int i = 0;
            while (true) {
                if (i >= this.inlineBots.size()) {
                    break;
                }
                TLRPC$TL_topPeer tLRPC$TL_topPeer2 = this.inlineBots.get(i);
                if (tLRPC$TL_topPeer2.peer.user_id == j) {
                    tLRPC$TL_topPeer = tLRPC$TL_topPeer2;
                    break;
                }
                i++;
            }
            if (tLRPC$TL_topPeer == null) {
                tLRPC$TL_topPeer = new TLRPC$TL_topPeer();
                TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                tLRPC$TL_topPeer.peer = tLRPC$TL_peerUser;
                tLRPC$TL_peerUser.user_id = j;
                this.inlineBots.add(tLRPC$TL_topPeer);
            }
            tLRPC$TL_topPeer.rating += Math.exp(max / getMessagesController().ratingDecay);
            Collections.sort(this.inlineBots, MediaDataController$$ExternalSyntheticLambda128.INSTANCE);
            if (this.inlineBots.size() > 20) {
                ArrayList<TLRPC$TL_topPeer> arrayList = this.inlineBots;
                arrayList.remove(arrayList.size() - 1);
            }
            savePeer(j, 1, tLRPC$TL_topPeer.rating);
            getNotificationCenter().postNotificationName(NotificationCenter.reloadInlineHints, new Object[0]);
        }
    }

    public static int lambda$increaseInlineRaiting$112(TLRPC$TL_topPeer tLRPC$TL_topPeer, TLRPC$TL_topPeer tLRPC$TL_topPeer2) {
        double d = tLRPC$TL_topPeer.rating;
        double d2 = tLRPC$TL_topPeer2.rating;
        if (d > d2) {
            return -1;
        }
        return d < d2 ? 1 : 0;
    }

    public void removeInline(long j) {
        for (int i = 0; i < this.inlineBots.size(); i++) {
            if (this.inlineBots.get(i).peer.user_id == j) {
                this.inlineBots.remove(i);
                TLRPC$TL_contacts_resetTopPeerRating tLRPC$TL_contacts_resetTopPeerRating = new TLRPC$TL_contacts_resetTopPeerRating();
                tLRPC$TL_contacts_resetTopPeerRating.category = new TLRPC$TL_topPeerCategoryBotsInline();
                tLRPC$TL_contacts_resetTopPeerRating.peer = getMessagesController().getInputPeer(j);
                getConnectionsManager().sendRequest(tLRPC$TL_contacts_resetTopPeerRating, MediaDataController$$ExternalSyntheticLambda175.INSTANCE);
                deletePeer(j, 1);
                getNotificationCenter().postNotificationName(NotificationCenter.reloadInlineHints, new Object[0]);
                return;
            }
        }
    }

    public void removePeer(long j) {
        for (int i = 0; i < this.hints.size(); i++) {
            if (this.hints.get(i).peer.user_id == j) {
                this.hints.remove(i);
                getNotificationCenter().postNotificationName(NotificationCenter.reloadHints, new Object[0]);
                TLRPC$TL_contacts_resetTopPeerRating tLRPC$TL_contacts_resetTopPeerRating = new TLRPC$TL_contacts_resetTopPeerRating();
                tLRPC$TL_contacts_resetTopPeerRating.category = new TLRPC$TL_topPeerCategoryCorrespondents();
                tLRPC$TL_contacts_resetTopPeerRating.peer = getMessagesController().getInputPeer(j);
                deletePeer(j, 0);
                getConnectionsManager().sendRequest(tLRPC$TL_contacts_resetTopPeerRating, MediaDataController$$ExternalSyntheticLambda172.INSTANCE);
                return;
            }
        }
    }

    public void increasePeerRaiting(final long j) {
        TLRPC$User user;
        if (getUserConfig().suggestContacts && DialogObject.isUserDialog(j) && (user = getMessagesController().getUser(Long.valueOf(j))) != null && !user.bot && !user.self) {
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$increasePeerRaiting$117(j);
                }
            });
        }
    }

    public void lambda$increasePeerRaiting$117(final long j) {
        int i;
        double d = 0.0d;
        try {
            int i2 = 0;
            SQLiteCursor queryFinalized = getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT MAX(mid), MAX(date) FROM messages_v2 WHERE uid = %d AND out = 1", Long.valueOf(j)), new Object[0]);
            if (queryFinalized.next()) {
                i2 = queryFinalized.intValue(0);
                i = queryFinalized.intValue(1);
            } else {
                i = 0;
            }
            queryFinalized.dispose();
            if (i2 > 0 && getUserConfig().ratingLoadTime != 0) {
                d = i - getUserConfig().ratingLoadTime;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        final double d2 = d;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$increasePeerRaiting$116(j, d2);
            }
        });
    }

    public void lambda$increasePeerRaiting$116(long j, double d) {
        TLRPC$TL_topPeer tLRPC$TL_topPeer;
        int i = 0;
        while (true) {
            if (i >= this.hints.size()) {
                tLRPC$TL_topPeer = null;
                break;
            }
            tLRPC$TL_topPeer = this.hints.get(i);
            if (tLRPC$TL_topPeer.peer.user_id == j) {
                break;
            }
            i++;
        }
        if (tLRPC$TL_topPeer == null) {
            tLRPC$TL_topPeer = new TLRPC$TL_topPeer();
            TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
            tLRPC$TL_topPeer.peer = tLRPC$TL_peerUser;
            tLRPC$TL_peerUser.user_id = j;
            this.hints.add(tLRPC$TL_topPeer);
        }
        double d2 = tLRPC$TL_topPeer.rating;
        double d3 = getMessagesController().ratingDecay;
        Double.isNaN(d3);
        tLRPC$TL_topPeer.rating = d2 + Math.exp(d / d3);
        Collections.sort(this.hints, MediaDataController$$ExternalSyntheticLambda127.INSTANCE);
        savePeer(j, 0, tLRPC$TL_topPeer.rating);
        getNotificationCenter().postNotificationName(NotificationCenter.reloadHints, new Object[0]);
    }

    public static int lambda$increasePeerRaiting$115(TLRPC$TL_topPeer tLRPC$TL_topPeer, TLRPC$TL_topPeer tLRPC$TL_topPeer2) {
        double d = tLRPC$TL_topPeer.rating;
        double d2 = tLRPC$TL_topPeer2.rating;
        if (d > d2) {
            return -1;
        }
        return d < d2 ? 1 : 0;
    }

    private void savePeer(final long j, final int i, final double d) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$savePeer$118(j, i, d);
            }
        });
    }

    public void lambda$savePeer$118(long j, int i, double d) {
        try {
            SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
            executeFast.requery();
            executeFast.bindLong(1, j);
            executeFast.bindInteger(2, i);
            executeFast.bindDouble(3, d);
            executeFast.bindInteger(4, ((int) System.currentTimeMillis()) / 1000);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private void deletePeer(final long j, final int i) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$deletePeer$119(j, i);
            }
        });
    }

    public void lambda$deletePeer$119(long j, int i) {
        try {
            getMessagesStorage().getDatabase().executeFast(String.format(Locale.US, "DELETE FROM chat_hints WHERE did = %d AND type = %d", Long.valueOf(j), Integer.valueOf(i))).stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private Intent createIntrnalShortcutIntent(long j) {
        Intent intent = new Intent(ApplicationLoader.applicationContext, OpenChatReceiver.class);
        if (DialogObject.isEncryptedDialog(j)) {
            int encryptedChatId = DialogObject.getEncryptedChatId(j);
            intent.putExtra("encId", encryptedChatId);
            if (getMessagesController().getEncryptedChat(Integer.valueOf(encryptedChatId)) == null) {
                return null;
            }
        } else if (DialogObject.isUserDialog(j)) {
            intent.putExtra("userId", j);
        } else if (!DialogObject.isChatDialog(j)) {
            return null;
        } else {
            intent.putExtra("chatId", -j);
        }
        intent.putExtra("currentAccount", this.currentAccount);
        intent.setAction("com.tmessages.openchat" + j);
        intent.addFlags(ConnectionsManager.FileTypeFile);
        return intent;
    }

    public void installShortcut(long r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.installShortcut(long):void");
    }

    public void uninstallShortcut(long r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.uninstallShortcut(long):void");
    }

    public static int lambda$static$120(TLRPC$MessageEntity tLRPC$MessageEntity, TLRPC$MessageEntity tLRPC$MessageEntity2) {
        int i = tLRPC$MessageEntity.offset;
        int i2 = tLRPC$MessageEntity2.offset;
        if (i > i2) {
            return 1;
        }
        return i < i2 ? -1 : 0;
    }

    public void loadPinnedMessages(final long j, final int i, final int i2) {
        if (this.loadingPinnedMessages.indexOfKey(j) < 0) {
            this.loadingPinnedMessages.put(j, Boolean.TRUE);
            final TLRPC$TL_messages_search tLRPC$TL_messages_search = new TLRPC$TL_messages_search();
            tLRPC$TL_messages_search.peer = getMessagesController().getInputPeer(j);
            tLRPC$TL_messages_search.limit = 40;
            tLRPC$TL_messages_search.offset_id = i;
            tLRPC$TL_messages_search.q = "";
            tLRPC$TL_messages_search.filter = new TLRPC$TL_inputMessagesFilterPinned();
            getConnectionsManager().sendRequest(tLRPC$TL_messages_search, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MediaDataController.this.lambda$loadPinnedMessages$122(i2, tLRPC$TL_messages_search, j, i, tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$loadPinnedMessages$122(int i, TLRPC$TL_messages_search tLRPC$TL_messages_search, final long j, int i2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        boolean z;
        int i3;
        int i4;
        ArrayList<Integer> arrayList = new ArrayList<>();
        HashMap<Integer, MessageObject> hashMap = new HashMap<>();
        if (tLObject instanceof TLRPC$messages_Messages) {
            TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
            LongSparseArray longSparseArray = new LongSparseArray();
            for (int i5 = 0; i5 < tLRPC$messages_Messages.users.size(); i5++) {
                TLRPC$User tLRPC$User = tLRPC$messages_Messages.users.get(i5);
                longSparseArray.put(tLRPC$User.id, tLRPC$User);
            }
            LongSparseArray longSparseArray2 = new LongSparseArray();
            for (int i6 = 0; i6 < tLRPC$messages_Messages.chats.size(); i6++) {
                TLRPC$Chat tLRPC$Chat = tLRPC$messages_Messages.chats.get(i6);
                longSparseArray2.put(tLRPC$Chat.id, tLRPC$Chat);
            }
            getMessagesStorage().putUsersAndChats(tLRPC$messages_Messages.users, tLRPC$messages_Messages.chats, true, true);
            getMessagesController().putUsers(tLRPC$messages_Messages.users, false);
            getMessagesController().putChats(tLRPC$messages_Messages.chats, false);
            int size = tLRPC$messages_Messages.messages.size();
            for (int i7 = 0; i7 < size; i7++) {
                TLRPC$Message tLRPC$Message = tLRPC$messages_Messages.messages.get(i7);
                if (!(tLRPC$Message instanceof TLRPC$TL_messageService) && !(tLRPC$Message instanceof TLRPC$TL_messageEmpty)) {
                    arrayList.add(Integer.valueOf(tLRPC$Message.id));
                    hashMap.put(Integer.valueOf(tLRPC$Message.id), new MessageObject(this.currentAccount, tLRPC$Message, (LongSparseArray<TLRPC$User>) longSparseArray, (LongSparseArray<TLRPC$Chat>) longSparseArray2, false, false));
                }
            }
            if (i != 0 && arrayList.isEmpty()) {
                arrayList.add(Integer.valueOf(i));
            }
            boolean z2 = tLRPC$messages_Messages.messages.size() < tLRPC$TL_messages_search.limit;
            i3 = Math.max(tLRPC$messages_Messages.count, tLRPC$messages_Messages.messages.size());
            z = z2;
        } else {
            if (i != 0) {
                arrayList.add(Integer.valueOf(i));
                i4 = 1;
            } else {
                i4 = 0;
            }
            i3 = i4;
            z = false;
        }
        getMessagesStorage().updatePinnedMessages(j, arrayList, true, i3, i2, z, hashMap);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$loadPinnedMessages$121(j);
            }
        });
    }

    public void lambda$loadPinnedMessages$121(long j) {
        this.loadingPinnedMessages.remove(j);
    }

    public void lambda$loadPinnedMessages$123(long j, long j2, ArrayList arrayList) {
        loadPinnedMessageInternal(j, j2, arrayList, false);
    }

    public ArrayList<MessageObject> loadPinnedMessages(final long j, final long j2, final ArrayList<Integer> arrayList, boolean z) {
        if (!z) {
            return loadPinnedMessageInternal(j, j2, arrayList, true);
        }
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$loadPinnedMessages$123(j, j2, arrayList);
            }
        });
        return null;
    }

    private java.util.ArrayList<org.telegram.messenger.MessageObject> loadPinnedMessageInternal(final long r18, final long r20, java.util.ArrayList<java.lang.Integer> r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.loadPinnedMessageInternal(long, long, java.util.ArrayList, boolean):java.util.ArrayList");
    }

    public void lambda$loadPinnedMessageInternal$124(long r13, long r15, org.telegram.tgnet.TLRPC$TL_channels_getMessages r17, org.telegram.tgnet.TLObject r18, org.telegram.tgnet.TLRPC$TL_error r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.lambda$loadPinnedMessageInternal$124(long, long, org.telegram.tgnet.TLRPC$TL_channels_getMessages, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    public void lambda$loadPinnedMessageInternal$125(long r11, org.telegram.tgnet.TLRPC$TL_messages_getMessages r13, org.telegram.tgnet.TLObject r14, org.telegram.tgnet.TLRPC$TL_error r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.lambda$loadPinnedMessageInternal$125(long, org.telegram.tgnet.TLRPC$TL_messages_getMessages, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    private void savePinnedMessages(final long j, final ArrayList<TLRPC$Message> arrayList) {
        if (!arrayList.isEmpty()) {
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$savePinnedMessages$126(arrayList, j);
                }
            });
        }
    }

    public void lambda$savePinnedMessages$126(ArrayList arrayList, long j) {
        try {
            getMessagesStorage().getDatabase().beginTransaction();
            SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO chat_pinned_v2 VALUES(?, ?, ?)");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                TLRPC$Message tLRPC$Message = (TLRPC$Message) arrayList.get(i);
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLRPC$Message.getObjectSize());
                tLRPC$Message.serializeToStream(nativeByteBuffer);
                executeFast.requery();
                executeFast.bindLong(1, j);
                executeFast.bindInteger(2, tLRPC$Message.id);
                executeFast.bindByteBuffer(3, nativeByteBuffer);
                executeFast.step();
                nativeByteBuffer.reuse();
            }
            executeFast.dispose();
            getMessagesStorage().getDatabase().commitTransaction();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private ArrayList<MessageObject> broadcastPinnedMessage(final ArrayList<TLRPC$Message> arrayList, final ArrayList<TLRPC$User> arrayList2, final ArrayList<TLRPC$Chat> arrayList3, final boolean z, boolean z2) {
        if (arrayList.isEmpty()) {
            return null;
        }
        final LongSparseArray longSparseArray = new LongSparseArray();
        for (int i = 0; i < arrayList2.size(); i++) {
            TLRPC$User tLRPC$User = arrayList2.get(i);
            longSparseArray.put(tLRPC$User.id, tLRPC$User);
        }
        final LongSparseArray longSparseArray2 = new LongSparseArray();
        for (int i2 = 0; i2 < arrayList3.size(); i2++) {
            TLRPC$Chat tLRPC$Chat = arrayList3.get(i2);
            longSparseArray2.put(tLRPC$Chat.id, tLRPC$Chat);
        }
        final ArrayList<MessageObject> arrayList4 = new ArrayList<>();
        if (z2) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$broadcastPinnedMessage$127(arrayList2, z, arrayList3);
                }
            });
            int size = arrayList.size();
            int i3 = 0;
            int i4 = 0;
            while (i4 < size) {
                TLRPC$Message tLRPC$Message = arrayList.get(i4);
                TLRPC$MessageMedia tLRPC$MessageMedia = tLRPC$Message.media;
                if ((tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaDocument) || (tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaPhoto)) {
                    i3++;
                }
                int i5 = i3;
                arrayList4.add(new MessageObject(this.currentAccount, tLRPC$Message, (LongSparseArray<TLRPC$User>) longSparseArray, (LongSparseArray<TLRPC$Chat>) longSparseArray2, false, i5 < 30));
                i4++;
                i3 = i5;
            }
            return arrayList4;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$broadcastPinnedMessage$129(arrayList2, z, arrayList3, arrayList, arrayList4, longSparseArray, longSparseArray2);
            }
        });
        return null;
    }

    public void lambda$broadcastPinnedMessage$127(ArrayList arrayList, boolean z, ArrayList arrayList2) {
        getMessagesController().putUsers(arrayList, z);
        getMessagesController().putChats(arrayList2, z);
    }

    public void lambda$broadcastPinnedMessage$129(ArrayList arrayList, boolean z, ArrayList arrayList2, ArrayList arrayList3, final ArrayList arrayList4, LongSparseArray longSparseArray, LongSparseArray longSparseArray2) {
        getMessagesController().putUsers(arrayList, z);
        getMessagesController().putChats(arrayList2, z);
        int size = arrayList3.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            TLRPC$Message tLRPC$Message = (TLRPC$Message) arrayList3.get(i2);
            TLRPC$MessageMedia tLRPC$MessageMedia = tLRPC$Message.media;
            if ((tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaDocument) || (tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaPhoto)) {
                i++;
            }
            arrayList4.add(new MessageObject(this.currentAccount, tLRPC$Message, (LongSparseArray<TLRPC$User>) longSparseArray, (LongSparseArray<TLRPC$Chat>) longSparseArray2, false, i < 30));
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$broadcastPinnedMessage$128(arrayList4);
            }
        });
    }

    public void lambda$broadcastPinnedMessage$128(ArrayList arrayList) {
        getNotificationCenter().postNotificationName(NotificationCenter.didLoadPinnedMessages, Long.valueOf(((MessageObject) arrayList.get(0)).getDialogId()), null, Boolean.TRUE, arrayList, 0, 0, -1, Boolean.FALSE);
    }

    private static void removeEmptyMessages(ArrayList<TLRPC$Message> arrayList) {
        int i = 0;
        while (i < arrayList.size()) {
            TLRPC$Message tLRPC$Message = arrayList.get(i);
            if (tLRPC$Message == null || (tLRPC$Message instanceof TLRPC$TL_messageEmpty) || (tLRPC$Message.action instanceof TLRPC$TL_messageActionHistoryClear)) {
                arrayList.remove(i);
                i--;
            }
            i++;
        }
    }

    public void loadReplyMessagesForMessages(java.util.ArrayList<org.telegram.messenger.MessageObject> r15, final long r16, final boolean r18, final java.lang.Runnable r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.loadReplyMessagesForMessages(java.util.ArrayList, long, boolean, java.lang.Runnable):void");
    }

    public void lambda$loadReplyMessagesForMessages$131(ArrayList arrayList, final long j, LongSparseArray longSparseArray, Runnable runnable) {
        try {
            final ArrayList arrayList2 = new ArrayList();
            SQLiteCursor queryFinalized = getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT m.data, m.mid, m.date, r.random_id FROM randoms_v2 as r INNER JOIN messages_v2 as m ON r.mid = m.mid AND r.uid = m.uid WHERE r.random_id IN(%s)", TextUtils.join(",", arrayList)), new Object[0]);
            while (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                if (byteBufferValue != null) {
                    TLRPC$Message TLdeserialize = TLRPC$Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    TLdeserialize.readAttachPath(byteBufferValue, getUserConfig().clientUserId);
                    byteBufferValue.reuse();
                    TLdeserialize.id = queryFinalized.intValue(1);
                    TLdeserialize.date = queryFinalized.intValue(2);
                    TLdeserialize.dialog_id = j;
                    long longValue = queryFinalized.longValue(3);
                    ArrayList arrayList3 = (ArrayList) longSparseArray.get(longValue);
                    longSparseArray.remove(longValue);
                    if (arrayList3 != null) {
                        MessageObject messageObject = new MessageObject(this.currentAccount, TLdeserialize, false, false);
                        arrayList2.add(messageObject);
                        for (int i = 0; i < arrayList3.size(); i++) {
                            MessageObject messageObject2 = (MessageObject) arrayList3.get(i);
                            messageObject2.replyMessageObject = messageObject;
                            messageObject2.messageOwner.reply_to = new TLRPC$TL_messageReplyHeader();
                            messageObject2.messageOwner.reply_to.reply_to_msg_id = messageObject.getId();
                        }
                    }
                }
            }
            queryFinalized.dispose();
            if (longSparseArray.size() != 0) {
                for (int i2 = 0; i2 < longSparseArray.size(); i2++) {
                    ArrayList arrayList4 = (ArrayList) longSparseArray.valueAt(i2);
                    for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                        TLRPC$TL_messageReplyHeader tLRPC$TL_messageReplyHeader = ((MessageObject) arrayList4.get(i3)).messageOwner.reply_to;
                        if (tLRPC$TL_messageReplyHeader != null) {
                            tLRPC$TL_messageReplyHeader.reply_to_random_id = 0L;
                        }
                    }
                }
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$loadReplyMessagesForMessages$130(j, arrayList2);
                }
            });
            if (runnable != null) {
                runnable.run();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$loadReplyMessagesForMessages$130(long j, ArrayList arrayList) {
        getNotificationCenter().postNotificationName(NotificationCenter.replyMessagesDidLoad, Long.valueOf(j), arrayList, 0);
    }

    public void lambda$loadReplyMessagesForMessages$135(final LongSparseArray longSparseArray, LongSparseArray longSparseArray2, final boolean z, final long j, final Runnable runnable) {
        int i;
        int i2;
        boolean z2;
        SQLiteCursor sQLiteCursor;
        LongSparseArray longSparseArray3 = longSparseArray;
        try {
            ArrayList<TLRPC$Message> arrayList = new ArrayList<>();
            ArrayList<TLRPC$User> arrayList2 = new ArrayList<>();
            ArrayList<TLRPC$Chat> arrayList3 = new ArrayList<>();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            int i3 = 0;
            for (int size = longSparseArray.size(); i3 < size; size = i2) {
                long keyAt = longSparseArray3.keyAt(i3);
                SparseArray sparseArray = (SparseArray) longSparseArray3.valueAt(i3);
                ArrayList arrayList6 = (ArrayList) longSparseArray2.get(keyAt);
                if (arrayList6 == null) {
                    i2 = size;
                } else {
                    if (z) {
                        i2 = size;
                        sQLiteCursor = getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT data, mid, date, uid FROM scheduled_messages_v2 WHERE mid IN(%s) AND uid = %d", TextUtils.join(",", arrayList6), Long.valueOf(j)), new Object[0]);
                        z2 = false;
                    } else {
                        i2 = size;
                        SQLiteDatabase database = getMessagesStorage().getDatabase();
                        Locale locale = Locale.US;
                        String join = TextUtils.join(",", arrayList6);
                        z2 = false;
                        sQLiteCursor = database.queryFinalized(String.format(locale, "SELECT data, mid, date, uid FROM messages_v2 WHERE mid IN(%s) AND uid = %d", join, Long.valueOf(j)), new Object[0]);
                    }
                    while (sQLiteCursor.next()) {
                        int i4 = z2 ? 1 : 0;
                        int i5 = z2 ? 1 : 0;
                        int i6 = z2 ? 1 : 0;
                        int i7 = z2 ? 1 : 0;
                        NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(i4);
                        if (byteBufferValue != null) {
                            TLRPC$Message TLdeserialize = TLRPC$Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(z2), z2);
                            TLdeserialize.readAttachPath(byteBufferValue, getUserConfig().clientUserId);
                            byteBufferValue.reuse();
                            TLdeserialize.id = sQLiteCursor.intValue(1);
                            TLdeserialize.date = sQLiteCursor.intValue(2);
                            TLdeserialize.dialog_id = j;
                            MessagesStorage.addUsersAndChatsFromMessage(TLdeserialize, arrayList4, arrayList5);
                            arrayList.add(TLdeserialize);
                            TLRPC$Peer tLRPC$Peer = TLdeserialize.peer_id;
                            long j2 = tLRPC$Peer != null ? tLRPC$Peer.channel_id : 0L;
                            ArrayList arrayList7 = (ArrayList) longSparseArray2.get(j2);
                            if (arrayList7 != null) {
                                arrayList7.remove(Integer.valueOf(TLdeserialize.id));
                                if (arrayList7.isEmpty()) {
                                    longSparseArray2.remove(j2);
                                }
                            }
                        }
                        z2 = false;
                    }
                    sQLiteCursor.dispose();
                }
                i3++;
                longSparseArray3 = longSparseArray;
            }
            if (!arrayList4.isEmpty()) {
                getMessagesStorage().getUsersInternal(TextUtils.join(",", arrayList4), arrayList2);
            }
            if (!arrayList5.isEmpty()) {
                getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList5), arrayList3);
            }
            broadcastReplyMessages(arrayList, longSparseArray, arrayList2, arrayList3, j, true);
            if (!longSparseArray2.isEmpty()) {
                int size2 = longSparseArray2.size();
                int i8 = 0;
                while (i8 < size2) {
                    final long keyAt2 = longSparseArray2.keyAt(i8);
                    if (z) {
                        TLRPC$TL_messages_getScheduledMessages tLRPC$TL_messages_getScheduledMessages = new TLRPC$TL_messages_getScheduledMessages();
                        tLRPC$TL_messages_getScheduledMessages.peer = getMessagesController().getInputPeer(j);
                        tLRPC$TL_messages_getScheduledMessages.id = (ArrayList) longSparseArray2.valueAt(i8);
                        i = size2;
                        getConnectionsManager().sendRequest(tLRPC$TL_messages_getScheduledMessages, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                                MediaDataController.this.lambda$loadReplyMessagesForMessages$132(j, keyAt2, longSparseArray, z, runnable, tLObject, tLRPC$TL_error);
                            }
                        });
                    } else {
                        i = size2;
                        if (keyAt2 != 0) {
                            TLRPC$TL_channels_getMessages tLRPC$TL_channels_getMessages = new TLRPC$TL_channels_getMessages();
                            tLRPC$TL_channels_getMessages.channel = getMessagesController().getInputChannel(keyAt2);
                            tLRPC$TL_channels_getMessages.id = (ArrayList) longSparseArray2.valueAt(i8);
                            getConnectionsManager().sendRequest(tLRPC$TL_channels_getMessages, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                                    MediaDataController.this.lambda$loadReplyMessagesForMessages$133(j, keyAt2, longSparseArray, z, runnable, tLObject, tLRPC$TL_error);
                                }
                            });
                        } else {
                            TLRPC$TL_messages_getMessages tLRPC$TL_messages_getMessages = new TLRPC$TL_messages_getMessages();
                            tLRPC$TL_messages_getMessages.id = (ArrayList) longSparseArray2.valueAt(i8);
                            getConnectionsManager().sendRequest(tLRPC$TL_messages_getMessages, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                                    MediaDataController.this.lambda$loadReplyMessagesForMessages$134(j, longSparseArray, z, runnable, tLObject, tLRPC$TL_error);
                                }
                            });
                        }
                    }
                    i8++;
                    size2 = i;
                }
            } else if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$loadReplyMessagesForMessages$132(long j, long j2, LongSparseArray longSparseArray, boolean z, Runnable runnable, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
            for (int i = 0; i < tLRPC$messages_Messages.messages.size(); i++) {
                TLRPC$Message tLRPC$Message = tLRPC$messages_Messages.messages.get(i);
                if (tLRPC$Message.dialog_id == 0) {
                    tLRPC$Message.dialog_id = j;
                }
            }
            MessageObject.fixMessagePeer(tLRPC$messages_Messages.messages, j2);
            ImageLoader.saveMessagesThumbs(tLRPC$messages_Messages.messages);
            broadcastReplyMessages(tLRPC$messages_Messages.messages, longSparseArray, tLRPC$messages_Messages.users, tLRPC$messages_Messages.chats, j, false);
            getMessagesStorage().putUsersAndChats(tLRPC$messages_Messages.users, tLRPC$messages_Messages.chats, true, true);
            saveReplyMessages(longSparseArray, tLRPC$messages_Messages.messages, z);
        }
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
    }

    public void lambda$loadReplyMessagesForMessages$133(long j, long j2, LongSparseArray longSparseArray, boolean z, Runnable runnable, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
            for (int i = 0; i < tLRPC$messages_Messages.messages.size(); i++) {
                TLRPC$Message tLRPC$Message = tLRPC$messages_Messages.messages.get(i);
                if (tLRPC$Message.dialog_id == 0) {
                    tLRPC$Message.dialog_id = j;
                }
            }
            MessageObject.fixMessagePeer(tLRPC$messages_Messages.messages, j2);
            ImageLoader.saveMessagesThumbs(tLRPC$messages_Messages.messages);
            broadcastReplyMessages(tLRPC$messages_Messages.messages, longSparseArray, tLRPC$messages_Messages.users, tLRPC$messages_Messages.chats, j, false);
            getMessagesStorage().putUsersAndChats(tLRPC$messages_Messages.users, tLRPC$messages_Messages.chats, true, true);
            saveReplyMessages(longSparseArray, tLRPC$messages_Messages.messages, z);
        }
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
    }

    public void lambda$loadReplyMessagesForMessages$134(long j, LongSparseArray longSparseArray, boolean z, Runnable runnable, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
            for (int i = 0; i < tLRPC$messages_Messages.messages.size(); i++) {
                TLRPC$Message tLRPC$Message = tLRPC$messages_Messages.messages.get(i);
                if (tLRPC$Message.dialog_id == 0) {
                    tLRPC$Message.dialog_id = j;
                }
            }
            ImageLoader.saveMessagesThumbs(tLRPC$messages_Messages.messages);
            broadcastReplyMessages(tLRPC$messages_Messages.messages, longSparseArray, tLRPC$messages_Messages.users, tLRPC$messages_Messages.chats, j, false);
            getMessagesStorage().putUsersAndChats(tLRPC$messages_Messages.users, tLRPC$messages_Messages.chats, true, true);
            saveReplyMessages(longSparseArray, tLRPC$messages_Messages.messages, z);
        }
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
    }

    private void saveReplyMessages(final LongSparseArray<SparseArray<ArrayList<MessageObject>>> longSparseArray, final ArrayList<TLRPC$Message> arrayList, final boolean z) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$saveReplyMessages$136(z, arrayList, longSparseArray);
            }
        });
    }

    public void lambda$saveReplyMessages$136(boolean z, ArrayList arrayList, LongSparseArray longSparseArray) {
        SQLitePreparedStatement sQLitePreparedStatement;
        ArrayList arrayList2;
        try {
            getMessagesStorage().getDatabase().beginTransaction();
            if (z) {
                sQLitePreparedStatement = getMessagesStorage().getDatabase().executeFast("UPDATE scheduled_messages_v2 SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
            } else {
                sQLitePreparedStatement = getMessagesStorage().getDatabase().executeFast("UPDATE messages_v2 SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
            }
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC$Message tLRPC$Message = (TLRPC$Message) arrayList.get(i);
                SparseArray sparseArray = (SparseArray) longSparseArray.get(MessageObject.getDialogId(tLRPC$Message));
                if (!(sparseArray == null || (arrayList2 = (ArrayList) sparseArray.get(tLRPC$Message.id)) == null)) {
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLRPC$Message.getObjectSize());
                    tLRPC$Message.serializeToStream(nativeByteBuffer);
                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                        MessageObject messageObject = (MessageObject) arrayList2.get(i2);
                        sQLitePreparedStatement.requery();
                        sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer);
                        sQLitePreparedStatement.bindInteger(2, tLRPC$Message.id);
                        sQLitePreparedStatement.bindInteger(3, messageObject.getId());
                        sQLitePreparedStatement.bindLong(4, messageObject.getDialogId());
                        sQLitePreparedStatement.step();
                    }
                    nativeByteBuffer.reuse();
                }
            }
            sQLitePreparedStatement.dispose();
            getMessagesStorage().getDatabase().commitTransaction();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private void broadcastReplyMessages(ArrayList<TLRPC$Message> arrayList, final LongSparseArray<SparseArray<ArrayList<MessageObject>>> longSparseArray, final ArrayList<TLRPC$User> arrayList2, final ArrayList<TLRPC$Chat> arrayList3, final long j, final boolean z) {
        LongSparseArray longSparseArray2 = new LongSparseArray();
        for (int i = 0; i < arrayList2.size(); i++) {
            TLRPC$User tLRPC$User = arrayList2.get(i);
            longSparseArray2.put(tLRPC$User.id, tLRPC$User);
        }
        LongSparseArray longSparseArray3 = new LongSparseArray();
        for (int i2 = 0; i2 < arrayList3.size(); i2++) {
            TLRPC$Chat tLRPC$Chat = arrayList3.get(i2);
            longSparseArray3.put(tLRPC$Chat.id, tLRPC$Chat);
        }
        final ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList4.add(new MessageObject(this.currentAccount, arrayList.get(i3), (LongSparseArray<TLRPC$User>) longSparseArray2, (LongSparseArray<TLRPC$Chat>) longSparseArray3, false, false));
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$broadcastReplyMessages$137(arrayList2, z, arrayList3, arrayList4, longSparseArray, j);
            }
        });
    }

    public void lambda$broadcastReplyMessages$137(ArrayList arrayList, boolean z, ArrayList arrayList2, ArrayList arrayList3, LongSparseArray longSparseArray, long j) {
        ArrayList arrayList4;
        getMessagesController().putUsers(arrayList, z);
        getMessagesController().putChats(arrayList2, z);
        int size = arrayList3.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            MessageObject messageObject = (MessageObject) arrayList3.get(i);
            SparseArray sparseArray = (SparseArray) longSparseArray.get(messageObject.getDialogId());
            if (!(sparseArray == null || (arrayList4 = (ArrayList) sparseArray.get(messageObject.getId())) == null)) {
                for (int i2 = 0; i2 < arrayList4.size(); i2++) {
                    MessageObject messageObject2 = (MessageObject) arrayList4.get(i2);
                    messageObject2.replyMessageObject = messageObject;
                    TLRPC$MessageAction tLRPC$MessageAction = messageObject2.messageOwner.action;
                    if (tLRPC$MessageAction instanceof TLRPC$TL_messageActionPinMessage) {
                        messageObject2.generatePinMessageText(null, null);
                    } else if (tLRPC$MessageAction instanceof TLRPC$TL_messageActionGameScore) {
                        messageObject2.generateGameMessageText(null);
                    } else if (tLRPC$MessageAction instanceof TLRPC$TL_messageActionPaymentSent) {
                        messageObject2.generatePaymentSentMessageText(null);
                    }
                }
                z2 = true;
            }
        }
        if (z2) {
            getNotificationCenter().postNotificationName(NotificationCenter.replyMessagesDidLoad, Long.valueOf(j), arrayList3, longSparseArray);
        }
    }

    public static void sortEntities(ArrayList<TLRPC$MessageEntity> arrayList) {
        Collections.sort(arrayList, entityComparator);
    }

    private static boolean checkInclusion(int r5, java.util.List<org.telegram.tgnet.TLRPC$MessageEntity> r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.checkInclusion(int, java.util.List, boolean):boolean");
    }

    private static boolean checkIntersection(int i, int i2, List<TLRPC$MessageEntity> list) {
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                TLRPC$MessageEntity tLRPC$MessageEntity = list.get(i3);
                int i4 = tLRPC$MessageEntity.offset;
                if (i4 > i && i4 + tLRPC$MessageEntity.length <= i2) {
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

    public static void addStyleToText(org.telegram.ui.Components.TextStyleSpan r11, int r12, int r13, android.text.Spannable r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.addStyleToText(org.telegram.ui.Components.TextStyleSpan, int, int, android.text.Spannable, boolean):void");
    }

    public static void addTextStyleRuns(MessageObject messageObject, Spannable spannable) {
        addTextStyleRuns(messageObject.messageOwner.entities, messageObject.messageText, spannable, -1);
    }

    public static void addTextStyleRuns(TLRPC$DraftMessage tLRPC$DraftMessage, Spannable spannable, int i) {
        addTextStyleRuns(tLRPC$DraftMessage.entities, tLRPC$DraftMessage.message, spannable, i);
    }

    public static void addTextStyleRuns(MessageObject messageObject, Spannable spannable, int i) {
        addTextStyleRuns(messageObject.messageOwner.entities, messageObject.messageText, spannable, i);
    }

    public static void addTextStyleRuns(ArrayList<TLRPC$MessageEntity> arrayList, CharSequence charSequence, Spannable spannable) {
        addTextStyleRuns(arrayList, charSequence, spannable, -1);
    }

    public static void addTextStyleRuns(ArrayList<TLRPC$MessageEntity> arrayList, CharSequence charSequence, Spannable spannable, int i) {
        for (TextStyleSpan textStyleSpan : (TextStyleSpan[]) spannable.getSpans(0, spannable.length(), TextStyleSpan.class)) {
            spannable.removeSpan(textStyleSpan);
        }
        Iterator<TextStyleSpan.TextStyleRun> it = getTextStyleRuns(arrayList, charSequence, i).iterator();
        while (it.hasNext()) {
            TextStyleSpan.TextStyleRun next = it.next();
            addStyleToText(new TextStyleSpan(next), next.start, next.end, spannable, true);
        }
    }

    public static ArrayList<TextStyleSpan.TextStyleRun> getTextStyleRuns(ArrayList<TLRPC$MessageEntity> arrayList, CharSequence charSequence, int i) {
        int i2;
        ArrayList<TextStyleSpan.TextStyleRun> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList(arrayList);
        Collections.sort(arrayList3, MediaDataController$$ExternalSyntheticLambda125.INSTANCE);
        int size = arrayList3.size();
        for (int i3 = 0; i3 < size; i3++) {
            TLRPC$MessageEntity tLRPC$MessageEntity = (TLRPC$MessageEntity) arrayList3.get(i3);
            if (tLRPC$MessageEntity != null && tLRPC$MessageEntity.length > 0 && (i2 = tLRPC$MessageEntity.offset) >= 0 && i2 < charSequence.length()) {
                if (tLRPC$MessageEntity.offset + tLRPC$MessageEntity.length > charSequence.length()) {
                    tLRPC$MessageEntity.length = charSequence.length() - tLRPC$MessageEntity.offset;
                }
                TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
                int i4 = tLRPC$MessageEntity.offset;
                textStyleRun.start = i4;
                textStyleRun.end = i4 + tLRPC$MessageEntity.length;
                if (tLRPC$MessageEntity instanceof TLRPC$TL_messageEntitySpoiler) {
                    textStyleRun.flags = 256;
                } else if (tLRPC$MessageEntity instanceof TLRPC$TL_messageEntityStrike) {
                    textStyleRun.flags = 8;
                } else if (tLRPC$MessageEntity instanceof TLRPC$TL_messageEntityUnderline) {
                    textStyleRun.flags = 16;
                } else if (tLRPC$MessageEntity instanceof TLRPC$TL_messageEntityBlockquote) {
                    textStyleRun.flags = 32;
                } else if (tLRPC$MessageEntity instanceof TLRPC$TL_messageEntityBold) {
                    textStyleRun.flags = 1;
                } else if (tLRPC$MessageEntity instanceof TLRPC$TL_messageEntityItalic) {
                    textStyleRun.flags = 2;
                } else if ((tLRPC$MessageEntity instanceof TLRPC$TL_messageEntityCode) || (tLRPC$MessageEntity instanceof TLRPC$TL_messageEntityPre)) {
                    textStyleRun.flags = 4;
                } else if (tLRPC$MessageEntity instanceof TLRPC$TL_messageEntityMentionName) {
                    textStyleRun.flags = 64;
                    textStyleRun.urlEntity = tLRPC$MessageEntity;
                } else if (tLRPC$MessageEntity instanceof TLRPC$TL_inputMessageEntityMentionName) {
                    textStyleRun.flags = 64;
                    textStyleRun.urlEntity = tLRPC$MessageEntity;
                } else {
                    textStyleRun.flags = ConnectionsManager.RequestFlagNeedQuickAck;
                    textStyleRun.urlEntity = tLRPC$MessageEntity;
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
                                int i9 = i5 + 1;
                                arrayList2.add(i9, textStyleRun3);
                                TextStyleSpan.TextStyleRun textStyleRun4 = new TextStyleSpan.TextStyleRun(textStyleRun2);
                                textStyleRun4.start = textStyleRun.end;
                                i5 = i9 + 1;
                                size2 = size2 + 1 + 1;
                                arrayList2.add(i5, textStyleRun4);
                            } else {
                                TextStyleSpan.TextStyleRun textStyleRun5 = new TextStyleSpan.TextStyleRun(textStyleRun);
                                textStyleRun5.merge(textStyleRun2);
                                textStyleRun5.end = textStyleRun2.end;
                                i5++;
                                size2++;
                                arrayList2.add(i5, textStyleRun5);
                            }
                            int i10 = textStyleRun.start;
                            textStyleRun.start = textStyleRun2.end;
                            textStyleRun2.end = i10;
                        }
                    } else {
                        int i11 = textStyleRun.end;
                        if (i7 < i11) {
                            int i12 = textStyleRun2.end;
                            if (i11 == i12) {
                                textStyleRun2.merge(textStyleRun);
                            } else if (i11 < i12) {
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
        return arrayList2;
    }

    public static int lambda$getTextStyleRuns$138(TLRPC$MessageEntity tLRPC$MessageEntity, TLRPC$MessageEntity tLRPC$MessageEntity2) {
        int i = tLRPC$MessageEntity.offset;
        int i2 = tLRPC$MessageEntity2.offset;
        if (i > i2) {
            return 1;
        }
        return i < i2 ? -1 : 0;
    }

    public void addStyle(int i, int i2, int i3, ArrayList<TLRPC$MessageEntity> arrayList) {
        if ((i & 256) != 0) {
            arrayList.add(setEntityStartEnd(new TLRPC$TL_messageEntitySpoiler(), i2, i3));
        }
        if ((i & 1) != 0) {
            arrayList.add(setEntityStartEnd(new TLRPC$TL_messageEntityBold(), i2, i3));
        }
        if ((i & 2) != 0) {
            arrayList.add(setEntityStartEnd(new TLRPC$TL_messageEntityItalic(), i2, i3));
        }
        if ((i & 4) != 0) {
            arrayList.add(setEntityStartEnd(new TLRPC$TL_messageEntityCode(), i2, i3));
        }
        if ((i & 8) != 0) {
            arrayList.add(setEntityStartEnd(new TLRPC$TL_messageEntityStrike(), i2, i3));
        }
        if ((i & 16) != 0) {
            arrayList.add(setEntityStartEnd(new TLRPC$TL_messageEntityUnderline(), i2, i3));
        }
        if ((i & 32) != 0) {
            arrayList.add(setEntityStartEnd(new TLRPC$TL_messageEntityBlockquote(), i2, i3));
        }
    }

    private TLRPC$MessageEntity setEntityStartEnd(TLRPC$MessageEntity tLRPC$MessageEntity, int i, int i2) {
        tLRPC$MessageEntity.offset = i;
        tLRPC$MessageEntity.length = i2 - i;
        return tLRPC$MessageEntity;
    }

    public java.util.ArrayList<org.telegram.tgnet.TLRPC$MessageEntity> getEntities(java.lang.CharSequence[] r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.getEntities(java.lang.CharSequence[], boolean):java.util.ArrayList");
    }

    public static TLRPC$MessageEntity lambda$getEntities$139(Void r0) {
        return new TLRPC$TL_messageEntityBold();
    }

    public static TLRPC$MessageEntity lambda$getEntities$140(Void r0) {
        return new TLRPC$TL_messageEntityItalic();
    }

    public static TLRPC$MessageEntity lambda$getEntities$141(Void r0) {
        return new TLRPC$TL_messageEntitySpoiler();
    }

    public static TLRPC$MessageEntity lambda$getEntities$142(Void r0) {
        return new TLRPC$TL_messageEntityStrike();
    }

    private CharSequence parsePattern(CharSequence charSequence, Pattern pattern, List<TLRPC$MessageEntity> list, GenericProvider<Void, TLRPC$MessageEntity> genericProvider) {
        URLSpan[] uRLSpanArr;
        Matcher matcher = pattern.matcher(charSequence);
        int i = 0;
        while (matcher.find()) {
            boolean z = true;
            String group = matcher.group(1);
            if ((charSequence instanceof Spannable) && (uRLSpanArr = (URLSpan[]) ((Spannable) charSequence).getSpans(matcher.start() - i, matcher.end() - i, URLSpan.class)) != null && uRLSpanArr.length > 0) {
                z = false;
            }
            if (z) {
                charSequence = ((Object) charSequence.subSequence(0, matcher.start() - i)) + group + ((Object) charSequence.subSequence(matcher.end() - i, charSequence.length()));
                TLRPC$MessageEntity provide = genericProvider.provide(null);
                provide.offset = matcher.start() - i;
                provide.length = group.length();
                list.add(provide);
            }
            i += (matcher.end() - matcher.start()) - group.length();
        }
        return charSequence;
    }

    public void loadDraftsIfNeed() {
        if (!getUserConfig().draftsLoaded && !this.loadingDrafts) {
            this.loadingDrafts = true;
            getConnectionsManager().sendRequest(new TLObject() {
                public static int constructor = 1782549861;

                @Override
                public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
                    return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                    abstractSerializedData.writeInt32(constructor);
                }
            }, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MediaDataController.this.lambda$loadDraftsIfNeed$145(tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$loadDraftsIfNeed$143() {
        this.loadingDrafts = false;
    }

    public void lambda$loadDraftsIfNeed$145(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$loadDraftsIfNeed$143();
                }
            });
            return;
        }
        getMessagesController().processUpdates((TLRPC$Updates) tLObject, false);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$loadDraftsIfNeed$144();
            }
        });
    }

    public void lambda$loadDraftsIfNeed$144() {
        this.loadingDrafts = false;
        UserConfig userConfig = getUserConfig();
        userConfig.draftsLoaded = true;
        userConfig.saveConfig(false);
    }

    public int getDraftFolderId(long j) {
        return this.draftsFolderIds.get(j, 0).intValue();
    }

    public void setDraftFolderId(long j, int i) {
        this.draftsFolderIds.put(j, Integer.valueOf(i));
    }

    public void clearDraftsFolderIds() {
        this.draftsFolderIds.clear();
    }

    public LongSparseArray<SparseArray<TLRPC$DraftMessage>> getDrafts() {
        return this.drafts;
    }

    public TLRPC$DraftMessage getDraft(long j, int i) {
        SparseArray<TLRPC$DraftMessage> sparseArray = this.drafts.get(j);
        if (sparseArray == null) {
            return null;
        }
        return sparseArray.get(i);
    }

    public TLRPC$Message getDraftMessage(long j, int i) {
        SparseArray<TLRPC$Message> sparseArray = this.draftMessages.get(j);
        if (sparseArray == null) {
            return null;
        }
        return sparseArray.get(i);
    }

    public void saveDraft(long j, int i, CharSequence charSequence, ArrayList<TLRPC$MessageEntity> arrayList, TLRPC$Message tLRPC$Message, boolean z) {
        saveDraft(j, i, charSequence, arrayList, tLRPC$Message, z, false);
    }

    public void saveDraft(long j, int i, CharSequence charSequence, ArrayList<TLRPC$MessageEntity> arrayList, TLRPC$Message tLRPC$Message, boolean z, boolean z2) {
        TLRPC$DraftMessage tLRPC$DraftMessage;
        if (!TextUtils.isEmpty(charSequence) || tLRPC$Message != null) {
            tLRPC$DraftMessage = new TLRPC$TL_draftMessage();
        } else {
            tLRPC$DraftMessage = new TLRPC$TL_draftMessageEmpty();
        }
        TLRPC$DraftMessage tLRPC$DraftMessage2 = tLRPC$DraftMessage;
        tLRPC$DraftMessage2.date = (int) (System.currentTimeMillis() / 1000);
        tLRPC$DraftMessage2.message = charSequence == null ? "" : charSequence.toString();
        tLRPC$DraftMessage2.no_webpage = z;
        if (tLRPC$Message != null) {
            tLRPC$DraftMessage2.reply_to_msg_id = tLRPC$Message.id;
            tLRPC$DraftMessage2.flags |= 1;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            tLRPC$DraftMessage2.entities = arrayList;
            tLRPC$DraftMessage2.flags |= 8;
        }
        SparseArray<TLRPC$DraftMessage> sparseArray = this.drafts.get(j);
        TLRPC$DraftMessage tLRPC$DraftMessage3 = sparseArray == null ? null : sparseArray.get(i);
        if (!z2) {
            if (tLRPC$DraftMessage3 != null && tLRPC$DraftMessage3.message.equals(tLRPC$DraftMessage2.message) && tLRPC$DraftMessage3.reply_to_msg_id == tLRPC$DraftMessage2.reply_to_msg_id && tLRPC$DraftMessage3.no_webpage == tLRPC$DraftMessage2.no_webpage) {
                return;
            }
            if (tLRPC$DraftMessage3 == null && TextUtils.isEmpty(tLRPC$DraftMessage2.message) && tLRPC$DraftMessage2.reply_to_msg_id == 0) {
                return;
            }
        }
        saveDraft(j, i, tLRPC$DraftMessage2, tLRPC$Message, false);
        if (i == 0) {
            if (!DialogObject.isEncryptedDialog(j)) {
                TLRPC$TL_messages_saveDraft tLRPC$TL_messages_saveDraft = new TLRPC$TL_messages_saveDraft();
                TLRPC$InputPeer inputPeer = getMessagesController().getInputPeer(j);
                tLRPC$TL_messages_saveDraft.peer = inputPeer;
                if (inputPeer != null) {
                    tLRPC$TL_messages_saveDraft.message = tLRPC$DraftMessage2.message;
                    tLRPC$TL_messages_saveDraft.no_webpage = tLRPC$DraftMessage2.no_webpage;
                    tLRPC$TL_messages_saveDraft.reply_to_msg_id = tLRPC$DraftMessage2.reply_to_msg_id;
                    tLRPC$TL_messages_saveDraft.entities = tLRPC$DraftMessage2.entities;
                    tLRPC$TL_messages_saveDraft.flags = tLRPC$DraftMessage2.flags;
                    getConnectionsManager().sendRequest(tLRPC$TL_messages_saveDraft, MediaDataController$$ExternalSyntheticLambda171.INSTANCE);
                } else {
                    return;
                }
            }
            getMessagesController().sortDialogs(null);
            getNotificationCenter().postNotificationName(NotificationCenter.dialogsNeedReload, new Object[0]);
        }
    }

    public void saveDraft(final long j, final int i, TLRPC$DraftMessage tLRPC$DraftMessage, TLRPC$Message tLRPC$Message, boolean z) {
        TLRPC$Chat tLRPC$Chat;
        StringBuilder sb;
        String str;
        SharedPreferences.Editor edit = this.draftPreferences.edit();
        MessagesController messagesController = getMessagesController();
        if (tLRPC$DraftMessage == null || (tLRPC$DraftMessage instanceof TLRPC$TL_draftMessageEmpty)) {
            SparseArray<TLRPC$DraftMessage> sparseArray = this.drafts.get(j);
            if (sparseArray != null) {
                sparseArray.remove(i);
                if (sparseArray.size() == 0) {
                    this.drafts.remove(j);
                }
            }
            SparseArray<TLRPC$Message> sparseArray2 = this.draftMessages.get(j);
            if (sparseArray2 != null) {
                sparseArray2.remove(i);
                if (sparseArray2.size() == 0) {
                    this.draftMessages.remove(j);
                }
            }
            if (i == 0) {
                this.draftPreferences.edit().remove("" + j).remove("r_" + j).commit();
            } else {
                this.draftPreferences.edit().remove("t_" + j + "_" + i).remove("rt_" + j + "_" + i).commit();
            }
            messagesController.removeDraftDialogIfNeed(j);
        } else {
            SparseArray<TLRPC$DraftMessage> sparseArray3 = this.drafts.get(j);
            if (sparseArray3 == null) {
                sparseArray3 = new SparseArray<>();
                this.drafts.put(j, sparseArray3);
            }
            sparseArray3.put(i, tLRPC$DraftMessage);
            if (i == 0) {
                messagesController.putDraftDialogIfNeed(j, tLRPC$DraftMessage);
            }
            try {
                SerializedData serializedData = new SerializedData(tLRPC$DraftMessage.getObjectSize());
                tLRPC$DraftMessage.serializeToStream(serializedData);
                if (i == 0) {
                    str = "" + j;
                } else {
                    str = "t_" + j + "_" + i;
                }
                edit.putString(str, Utilities.bytesToHex(serializedData.toByteArray()));
                serializedData.cleanup();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        SparseArray<TLRPC$Message> sparseArray4 = this.draftMessages.get(j);
        if (tLRPC$Message == null) {
            if (sparseArray4 != null) {
                sparseArray4.remove(i);
                if (sparseArray4.size() == 0) {
                    this.draftMessages.remove(j);
                }
            }
            if (i == 0) {
                edit.remove("r_" + j);
            } else {
                edit.remove("rt_" + j + "_" + i);
            }
        } else {
            if (sparseArray4 == null) {
                sparseArray4 = new SparseArray<>();
                this.draftMessages.put(j, sparseArray4);
            }
            sparseArray4.put(i, tLRPC$Message);
            SerializedData serializedData2 = new SerializedData(tLRPC$Message.getObjectSize());
            tLRPC$Message.serializeToStream(serializedData2);
            if (i == 0) {
                sb = new StringBuilder();
                sb.append("r_");
                sb.append(j);
            } else {
                sb = new StringBuilder();
                sb.append("rt_");
                sb.append(j);
                sb.append("_");
                sb.append(i);
            }
            edit.putString(sb.toString(), Utilities.bytesToHex(serializedData2.toByteArray()));
            serializedData2.cleanup();
        }
        edit.commit();
        if (z && i == 0) {
            if (!(tLRPC$DraftMessage == null || tLRPC$DraftMessage.reply_to_msg_id == 0 || tLRPC$Message != null)) {
                TLRPC$User tLRPC$User = null;
                if (DialogObject.isUserDialog(j)) {
                    tLRPC$User = getMessagesController().getUser(Long.valueOf(j));
                    tLRPC$Chat = tLRPC$User;
                } else {
                    tLRPC$Chat = getMessagesController().getChat(Long.valueOf(-j));
                }
                if (!(tLRPC$User == null && tLRPC$Chat == null)) {
                    final long j2 = ChatObject.isChannel(tLRPC$Chat) ? tLRPC$Chat.id : 0L;
                    final int i2 = tLRPC$DraftMessage.reply_to_msg_id;
                    getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                        @Override
                        public final void run() {
                            MediaDataController.this.lambda$saveDraft$149(i2, j, j2, i);
                        }
                    });
                }
            }
            getNotificationCenter().postNotificationName(NotificationCenter.newDraftReceived, Long.valueOf(j));
        }
    }

    public void lambda$saveDraft$149(int i, final long j, long j2, final int i2) {
        NativeByteBuffer byteBufferValue;
        TLRPC$Message tLRPC$Message = null;
        try {
            SQLiteCursor queryFinalized = getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT data FROM messages_v2 WHERE mid = %d and uid = %d", Integer.valueOf(i), Long.valueOf(j)), new Object[0]);
            if (queryFinalized.next() && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                tLRPC$Message = TLRPC$Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                tLRPC$Message.readAttachPath(byteBufferValue, getUserConfig().clientUserId);
                byteBufferValue.reuse();
            }
            queryFinalized.dispose();
            if (tLRPC$Message != null) {
                saveDraftReplyMessage(j, i2, tLRPC$Message);
            } else if (j2 != 0) {
                TLRPC$TL_channels_getMessages tLRPC$TL_channels_getMessages = new TLRPC$TL_channels_getMessages();
                tLRPC$TL_channels_getMessages.channel = getMessagesController().getInputChannel(j2);
                tLRPC$TL_channels_getMessages.id.add(Integer.valueOf(i));
                getConnectionsManager().sendRequest(tLRPC$TL_channels_getMessages, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MediaDataController.this.lambda$saveDraft$147(j, i2, tLObject, tLRPC$TL_error);
                    }
                });
            } else {
                TLRPC$TL_messages_getMessages tLRPC$TL_messages_getMessages = new TLRPC$TL_messages_getMessages();
                tLRPC$TL_messages_getMessages.id.add(Integer.valueOf(i));
                getConnectionsManager().sendRequest(tLRPC$TL_messages_getMessages, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MediaDataController.this.lambda$saveDraft$148(j, i2, tLObject, tLRPC$TL_error);
                    }
                });
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$saveDraft$147(long j, int i, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
            if (!tLRPC$messages_Messages.messages.isEmpty()) {
                saveDraftReplyMessage(j, i, tLRPC$messages_Messages.messages.get(0));
            }
        }
    }

    public void lambda$saveDraft$148(long j, int i, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
            if (!tLRPC$messages_Messages.messages.isEmpty()) {
                saveDraftReplyMessage(j, i, tLRPC$messages_Messages.messages.get(0));
            }
        }
    }

    private void saveDraftReplyMessage(final long j, final int i, final TLRPC$Message tLRPC$Message) {
        if (tLRPC$Message != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$saveDraftReplyMessage$150(j, i, tLRPC$Message);
                }
            });
        }
    }

    public void lambda$saveDraftReplyMessage$150(long j, int i, TLRPC$Message tLRPC$Message) {
        String str;
        SparseArray<TLRPC$DraftMessage> sparseArray = this.drafts.get(j);
        TLRPC$DraftMessage tLRPC$DraftMessage = sparseArray != null ? sparseArray.get(i) : null;
        if (tLRPC$DraftMessage != null && tLRPC$DraftMessage.reply_to_msg_id == tLRPC$Message.id) {
            SparseArray<TLRPC$Message> sparseArray2 = this.draftMessages.get(j);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray<>();
                this.draftMessages.put(j, sparseArray2);
            }
            sparseArray2.put(i, tLRPC$Message);
            SerializedData serializedData = new SerializedData(tLRPC$Message.getObjectSize());
            tLRPC$Message.serializeToStream(serializedData);
            SharedPreferences.Editor edit = this.draftPreferences.edit();
            if (i == 0) {
                str = "r_" + j;
            } else {
                str = "rt_" + j + "_" + i;
            }
            edit.putString(str, Utilities.bytesToHex(serializedData.toByteArray())).commit();
            getNotificationCenter().postNotificationName(NotificationCenter.newDraftReceived, Long.valueOf(j));
            serializedData.cleanup();
        }
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

    public void cleanDraft(long j, int i, boolean z) {
        SparseArray<TLRPC$DraftMessage> sparseArray = this.drafts.get(j);
        TLRPC$DraftMessage tLRPC$DraftMessage = sparseArray != null ? sparseArray.get(i) : null;
        if (tLRPC$DraftMessage != null) {
            if (!z) {
                SparseArray<TLRPC$DraftMessage> sparseArray2 = this.drafts.get(j);
                if (sparseArray2 != null) {
                    sparseArray2.remove(i);
                    if (sparseArray2.size() == 0) {
                        this.drafts.remove(j);
                    }
                }
                SparseArray<TLRPC$Message> sparseArray3 = this.draftMessages.get(j);
                if (sparseArray3 != null) {
                    sparseArray3.remove(i);
                    if (sparseArray3.size() == 0) {
                        this.draftMessages.remove(j);
                    }
                }
                if (i == 0) {
                    this.draftPreferences.edit().remove("" + j).remove("r_" + j).commit();
                    getMessagesController().sortDialogs(null);
                    getNotificationCenter().postNotificationName(NotificationCenter.dialogsNeedReload, new Object[0]);
                    return;
                }
                this.draftPreferences.edit().remove("t_" + j + "_" + i).remove("rt_" + j + "_" + i).commit();
            } else if (tLRPC$DraftMessage.reply_to_msg_id != 0) {
                tLRPC$DraftMessage.reply_to_msg_id = 0;
                tLRPC$DraftMessage.flags &= -2;
                saveDraft(j, i, tLRPC$DraftMessage.message, tLRPC$DraftMessage.entities, null, tLRPC$DraftMessage.no_webpage, true);
            }
        }
    }

    public void beginTransaction() {
        this.inTransaction = true;
    }

    public void endTransaction() {
        this.inTransaction = false;
    }

    public void clearBotKeyboard(final long j, final ArrayList<Integer> arrayList) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$clearBotKeyboard$151(arrayList, j);
            }
        });
    }

    public void lambda$clearBotKeyboard$151(ArrayList arrayList, long j) {
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                long j2 = this.botKeyboardsByMids.get(((Integer) arrayList.get(i)).intValue());
                if (j2 != 0) {
                    this.botKeyboards.remove(j2);
                    this.botKeyboardsByMids.delete(((Integer) arrayList.get(i)).intValue());
                    getNotificationCenter().postNotificationName(NotificationCenter.botKeyboardDidLoad, null, Long.valueOf(j2));
                }
            }
            return;
        }
        this.botKeyboards.remove(j);
        getNotificationCenter().postNotificationName(NotificationCenter.botKeyboardDidLoad, null, Long.valueOf(j));
    }

    public void loadBotKeyboard(final long j) {
        TLRPC$Message tLRPC$Message = this.botKeyboards.get(j);
        if (tLRPC$Message != null) {
            getNotificationCenter().postNotificationName(NotificationCenter.botKeyboardDidLoad, tLRPC$Message, Long.valueOf(j));
        } else {
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$loadBotKeyboard$153(j);
                }
            });
        }
    }

    public void lambda$loadBotKeyboard$153(final long j) {
        NativeByteBuffer byteBufferValue;
        final TLRPC$Message tLRPC$Message = null;
        try {
            SQLiteCursor queryFinalized = getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT info FROM bot_keyboard WHERE uid = %d", Long.valueOf(j)), new Object[0]);
            if (queryFinalized.next() && !queryFinalized.isNull(0) && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                tLRPC$Message = TLRPC$Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                byteBufferValue.reuse();
            }
            queryFinalized.dispose();
            if (tLRPC$Message != null) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MediaDataController.this.lambda$loadBotKeyboard$152(tLRPC$Message, j);
                    }
                });
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$loadBotKeyboard$152(TLRPC$Message tLRPC$Message, long j) {
        getNotificationCenter().postNotificationName(NotificationCenter.botKeyboardDidLoad, tLRPC$Message, Long.valueOf(j));
    }

    private TLRPC$BotInfo loadBotInfoInternal(long j, long j2) throws SQLiteException {
        TLRPC$BotInfo tLRPC$BotInfo;
        NativeByteBuffer byteBufferValue;
        SQLiteCursor queryFinalized = getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT info FROM bot_info_v2 WHERE uid = %d AND dialogId = %d", Long.valueOf(j), Long.valueOf(j2)), new Object[0]);
        if (!queryFinalized.next() || queryFinalized.isNull(0) || (byteBufferValue = queryFinalized.byteBufferValue(0)) == null) {
            tLRPC$BotInfo = null;
        } else {
            tLRPC$BotInfo = TLRPC$BotInfo.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
            byteBufferValue.reuse();
        }
        queryFinalized.dispose();
        return tLRPC$BotInfo;
    }

    public void loadBotInfo(final long j, final long j2, boolean z, final int i) {
        if (z) {
            HashMap<String, TLRPC$BotInfo> hashMap = this.botInfos;
            TLRPC$BotInfo tLRPC$BotInfo = hashMap.get(j + "_" + j2);
            if (tLRPC$BotInfo != null) {
                getNotificationCenter().postNotificationName(NotificationCenter.botInfoDidLoad, tLRPC$BotInfo, Integer.valueOf(i));
                return;
            }
        }
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$loadBotInfo$155(j, j2, i);
            }
        });
    }

    public void lambda$loadBotInfo$155(long j, long j2, final int i) {
        try {
            final TLRPC$BotInfo loadBotInfoInternal = loadBotInfoInternal(j, j2);
            if (loadBotInfoInternal != null) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MediaDataController.this.lambda$loadBotInfo$154(loadBotInfoInternal, i);
                    }
                });
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$loadBotInfo$154(TLRPC$BotInfo tLRPC$BotInfo, int i) {
        getNotificationCenter().postNotificationName(NotificationCenter.botInfoDidLoad, tLRPC$BotInfo, Integer.valueOf(i));
    }

    public void putBotKeyboard(final long j, final TLRPC$Message tLRPC$Message) {
        if (tLRPC$Message != null) {
            try {
                int i = 0;
                SQLiteCursor queryFinalized = getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT mid FROM bot_keyboard WHERE uid = %d", Long.valueOf(j)), new Object[0]);
                if (queryFinalized.next()) {
                    i = queryFinalized.intValue(0);
                }
                queryFinalized.dispose();
                if (i < tLRPC$Message.id) {
                    SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO bot_keyboard VALUES(?, ?, ?)");
                    executeFast.requery();
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLRPC$Message.getObjectSize());
                    tLRPC$Message.serializeToStream(nativeByteBuffer);
                    executeFast.bindLong(1, j);
                    executeFast.bindInteger(2, tLRPC$Message.id);
                    executeFast.bindByteBuffer(3, nativeByteBuffer);
                    executeFast.step();
                    nativeByteBuffer.reuse();
                    executeFast.dispose();
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            MediaDataController.this.lambda$putBotKeyboard$156(j, tLRPC$Message);
                        }
                    });
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public void lambda$putBotKeyboard$156(long j, TLRPC$Message tLRPC$Message) {
        TLRPC$Message tLRPC$Message2 = this.botKeyboards.get(j);
        this.botKeyboards.put(j, tLRPC$Message);
        if (MessageObject.getChannelId(tLRPC$Message) == 0) {
            if (tLRPC$Message2 != null) {
                this.botKeyboardsByMids.delete(tLRPC$Message2.id);
            }
            this.botKeyboardsByMids.put(tLRPC$Message.id, j);
        }
        getNotificationCenter().postNotificationName(NotificationCenter.botKeyboardDidLoad, tLRPC$Message, Long.valueOf(j));
    }

    public void putBotInfo(final long j, final TLRPC$BotInfo tLRPC$BotInfo) {
        if (tLRPC$BotInfo != null) {
            HashMap<String, TLRPC$BotInfo> hashMap = this.botInfos;
            hashMap.put(tLRPC$BotInfo.user_id + "_" + j, tLRPC$BotInfo);
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$putBotInfo$157(tLRPC$BotInfo, j);
                }
            });
        }
    }

    public void lambda$putBotInfo$157(TLRPC$BotInfo tLRPC$BotInfo, long j) {
        try {
            SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO bot_info_v2 VALUES(?, ?, ?)");
            executeFast.requery();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLRPC$BotInfo.getObjectSize());
            tLRPC$BotInfo.serializeToStream(nativeByteBuffer);
            executeFast.bindLong(1, tLRPC$BotInfo.user_id);
            executeFast.bindLong(2, j);
            executeFast.bindByteBuffer(3, nativeByteBuffer);
            executeFast.step();
            nativeByteBuffer.reuse();
            executeFast.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void updateBotInfo(final long j, final TLRPC$TL_updateBotCommands tLRPC$TL_updateBotCommands) {
        HashMap<String, TLRPC$BotInfo> hashMap = this.botInfos;
        TLRPC$BotInfo tLRPC$BotInfo = hashMap.get(tLRPC$TL_updateBotCommands.bot_id + "_" + j);
        if (tLRPC$BotInfo != null) {
            tLRPC$BotInfo.commands = tLRPC$TL_updateBotCommands.commands;
            getNotificationCenter().postNotificationName(NotificationCenter.botInfoDidLoad, tLRPC$BotInfo, 0);
        }
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$updateBotInfo$158(tLRPC$TL_updateBotCommands, j);
            }
        });
    }

    public void lambda$updateBotInfo$158(TLRPC$TL_updateBotCommands tLRPC$TL_updateBotCommands, long j) {
        try {
            TLRPC$BotInfo loadBotInfoInternal = loadBotInfoInternal(tLRPC$TL_updateBotCommands.bot_id, j);
            if (loadBotInfoInternal != null) {
                loadBotInfoInternal.commands = tLRPC$TL_updateBotCommands.commands;
            }
            SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO bot_info_v2 VALUES(?, ?, ?)");
            executeFast.requery();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(loadBotInfoInternal.getObjectSize());
            loadBotInfoInternal.serializeToStream(nativeByteBuffer);
            executeFast.bindLong(1, loadBotInfoInternal.user_id);
            executeFast.bindLong(2, j);
            executeFast.bindByteBuffer(3, nativeByteBuffer);
            executeFast.step();
            nativeByteBuffer.reuse();
            executeFast.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public HashMap<String, TLRPC$TL_availableReaction> getReactionsMap() {
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
        if (string == null || getReactionsMap().get(string) == null) {
            return getReactionsList().get(0).reaction;
        }
        this.doubleTapReaction = string;
        return string;
    }

    public void setDoubleTapReaction(String str) {
        MessagesController.getEmojiSettings(this.currentAccount).edit().putString("reaction_on_double_tap", str).apply();
        this.doubleTapReaction = str;
    }

    public List<TLRPC$TL_availableReaction> getEnabledReactionsList() {
        return this.enabledReactionsList;
    }

    public void uploadRingtone(String str) {
        if (!this.ringtoneUploaderHashMap.containsKey(str)) {
            this.ringtoneUploaderHashMap.put(str, new RingtoneUploader(str, this.currentAccount));
            this.ringtoneDataStore.addUploadingTone(str);
        }
    }

    public void onRingtoneUploaded(String str, TLRPC$Document tLRPC$Document, boolean z) {
        this.ringtoneUploaderHashMap.remove(str);
        this.ringtoneDataStore.onRingtoneUploaded(str, tLRPC$Document, z);
    }

    public void checkRingtones() {
        this.ringtoneDataStore.lambda$new$0();
    }

    public boolean saveToRingtones(final TLRPC$Document tLRPC$Document) {
        if (tLRPC$Document == null) {
            return false;
        }
        if (this.ringtoneDataStore.contains(tLRPC$Document.id)) {
            return true;
        }
        if (tLRPC$Document.size > MessagesController.getInstance(this.currentAccount).ringtoneSizeMax) {
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax / 1024)));
            return false;
        }
        for (int i = 0; i < tLRPC$Document.attributes.size(); i++) {
            TLRPC$DocumentAttribute tLRPC$DocumentAttribute = tLRPC$Document.attributes.get(i);
            if ((tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeAudio) && tLRPC$DocumentAttribute.duration > MessagesController.getInstance(this.currentAccount).ringtoneDurationMax) {
                NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax)));
                return false;
            }
        }
        TLRPC$TL_account_saveRingtone tLRPC$TL_account_saveRingtone = new TLRPC$TL_account_saveRingtone();
        TLRPC$TL_inputDocument tLRPC$TL_inputDocument = new TLRPC$TL_inputDocument();
        tLRPC$TL_account_saveRingtone.id = tLRPC$TL_inputDocument;
        tLRPC$TL_inputDocument.id = tLRPC$Document.id;
        tLRPC$TL_inputDocument.file_reference = tLRPC$Document.file_reference;
        tLRPC$TL_inputDocument.access_hash = tLRPC$Document.access_hash;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_account_saveRingtone, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MediaDataController.this.lambda$saveToRingtones$160(tLRPC$Document, tLObject, tLRPC$TL_error);
            }
        });
        return true;
    }

    public void lambda$saveToRingtones$160(final TLRPC$Document tLRPC$Document, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$saveToRingtones$159(tLObject, tLRPC$Document);
            }
        });
    }

    public void lambda$saveToRingtones$159(TLObject tLObject, TLRPC$Document tLRPC$Document) {
        if (tLObject == null) {
            return;
        }
        if (tLObject instanceof TLRPC$TL_account_savedRingtoneConverted) {
            this.ringtoneDataStore.addTone(((TLRPC$TL_account_savedRingtoneConverted) tLObject).document);
        } else {
            this.ringtoneDataStore.addTone(tLRPC$Document);
        }
    }

    public void preloadPremiumPreviewStickers() {
        if (this.previewStickersLoading || !this.premiumPreviewStickers.isEmpty()) {
            int i = 0;
            while (i < Math.min(this.premiumPreviewStickers.size(), 3)) {
                ArrayList<TLRPC$Document> arrayList = this.premiumPreviewStickers;
                TLRPC$Document tLRPC$Document = arrayList.get(i == 2 ? arrayList.size() - 1 : i);
                if (MessageObject.isPremiumSticker(tLRPC$Document)) {
                    ImageReceiver imageReceiver = new ImageReceiver();
                    imageReceiver.setImage(ImageLocation.getForDocument(tLRPC$Document), null, null, "webp", null, 1);
                    ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
                    ImageReceiver imageReceiver2 = new ImageReceiver();
                    imageReceiver2.setImage(ImageLocation.getForDocument(MessageObject.getPremiumStickerAnimation(tLRPC$Document), tLRPC$Document), "140_140", (ImageLocation) null, (String) null, "tgs", (Object) null, 1);
                    ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver2);
                }
                i++;
            }
            return;
        }
        TLRPC$TL_messages_getStickers tLRPC$TL_messages_getStickers = new TLRPC$TL_messages_getStickers();
        tLRPC$TL_messages_getStickers.emoticon = Emoji.fixEmoji("⭐") + Emoji.fixEmoji("⭐");
        tLRPC$TL_messages_getStickers.hash = 0L;
        this.previewStickersLoading = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_getStickers, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MediaDataController.this.lambda$preloadPremiumPreviewStickers$162(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$preloadPremiumPreviewStickers$162(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$preloadPremiumPreviewStickers$161(tLRPC$TL_error, tLObject);
            }
        });
    }

    public void lambda$preloadPremiumPreviewStickers$161(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        if (tLRPC$TL_error == null) {
            this.previewStickersLoading = false;
            this.premiumPreviewStickers.clear();
            this.premiumPreviewStickers.addAll(((TLRPC$TL_messages_stickers) tLObject).stickers);
            NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.premiumStickersPreviewLoaded, new Object[0]);
        }
    }

    public void chekAllMedia(boolean z) {
        if (z) {
            this.reactionsUpdateDate = 0;
            this.loadFeaturedDate = 0;
        }
        loadRecents(2, false, true, false);
        loadRecents(3, false, true, false);
        checkFeaturedStickers();
        checkReactions();
        checkMenuBots();
        checkPremiumPromo();
    }

    public void fetchNewEmojiKeywords(String[] strArr) {
        if (strArr != null) {
            for (final String str : strArr) {
                if (!TextUtils.isEmpty(str) && this.currentFetchingEmoji.get(str) == null) {
                    this.currentFetchingEmoji.put(str, Boolean.TRUE);
                    getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                        @Override
                        public final void run() {
                            MediaDataController.this.lambda$fetchNewEmojiKeywords$168(str);
                        }
                    });
                } else {
                    return;
                }
            }
        }
    }

    public void lambda$fetchNewEmojiKeywords$168(final java.lang.String r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.lambda$fetchNewEmojiKeywords$168(java.lang.String):void");
    }

    public void lambda$fetchNewEmojiKeywords$163(String str) {
        this.currentFetchingEmoji.remove(str);
    }

    public void lambda$fetchNewEmojiKeywords$167(int i, String str, final String str2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            TLRPC$TL_emojiKeywordsDifference tLRPC$TL_emojiKeywordsDifference = (TLRPC$TL_emojiKeywordsDifference) tLObject;
            if (i == -1 || tLRPC$TL_emojiKeywordsDifference.lang_code.equals(str)) {
                putEmojiKeywords(str2, tLRPC$TL_emojiKeywordsDifference);
            } else {
                getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        MediaDataController.this.lambda$fetchNewEmojiKeywords$165(str2);
                    }
                });
            }
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$fetchNewEmojiKeywords$166(str2);
                }
            });
        }
    }

    public void lambda$fetchNewEmojiKeywords$165(final String str) {
        try {
            SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("DELETE FROM emoji_keywords_info_v2 WHERE lang = ?");
            executeFast.bindString(1, str);
            executeFast.step();
            executeFast.dispose();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$fetchNewEmojiKeywords$164(str);
                }
            });
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$fetchNewEmojiKeywords$164(String str) {
        this.currentFetchingEmoji.remove(str);
        fetchNewEmojiKeywords(new String[]{str});
    }

    public void lambda$fetchNewEmojiKeywords$166(String str) {
        this.currentFetchingEmoji.remove(str);
    }

    private void putEmojiKeywords(final String str, final TLRPC$TL_emojiKeywordsDifference tLRPC$TL_emojiKeywordsDifference) {
        if (tLRPC$TL_emojiKeywordsDifference != null) {
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$putEmojiKeywords$170(tLRPC$TL_emojiKeywordsDifference, str);
                }
            });
        }
    }

    public void lambda$putEmojiKeywords$170(TLRPC$TL_emojiKeywordsDifference tLRPC$TL_emojiKeywordsDifference, final String str) {
        try {
            if (!tLRPC$TL_emojiKeywordsDifference.keywords.isEmpty()) {
                SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO emoji_keywords_v2 VALUES(?, ?, ?)");
                SQLitePreparedStatement executeFast2 = getMessagesStorage().getDatabase().executeFast("DELETE FROM emoji_keywords_v2 WHERE lang = ? AND keyword = ? AND emoji = ?");
                getMessagesStorage().getDatabase().beginTransaction();
                int size = tLRPC$TL_emojiKeywordsDifference.keywords.size();
                for (int i = 0; i < size; i++) {
                    TLRPC$EmojiKeyword tLRPC$EmojiKeyword = tLRPC$TL_emojiKeywordsDifference.keywords.get(i);
                    if (tLRPC$EmojiKeyword instanceof TLRPC$TL_emojiKeyword) {
                        TLRPC$TL_emojiKeyword tLRPC$TL_emojiKeyword = (TLRPC$TL_emojiKeyword) tLRPC$EmojiKeyword;
                        String lowerCase = tLRPC$TL_emojiKeyword.keyword.toLowerCase();
                        int size2 = tLRPC$TL_emojiKeyword.emoticons.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            executeFast.requery();
                            executeFast.bindString(1, tLRPC$TL_emojiKeywordsDifference.lang_code);
                            executeFast.bindString(2, lowerCase);
                            executeFast.bindString(3, tLRPC$TL_emojiKeyword.emoticons.get(i2));
                            executeFast.step();
                        }
                    } else if (tLRPC$EmojiKeyword instanceof TLRPC$TL_emojiKeywordDeleted) {
                        TLRPC$TL_emojiKeywordDeleted tLRPC$TL_emojiKeywordDeleted = (TLRPC$TL_emojiKeywordDeleted) tLRPC$EmojiKeyword;
                        String lowerCase2 = tLRPC$TL_emojiKeywordDeleted.keyword.toLowerCase();
                        int size3 = tLRPC$TL_emojiKeywordDeleted.emoticons.size();
                        for (int i3 = 0; i3 < size3; i3++) {
                            executeFast2.requery();
                            executeFast2.bindString(1, tLRPC$TL_emojiKeywordsDifference.lang_code);
                            executeFast2.bindString(2, lowerCase2);
                            executeFast2.bindString(3, tLRPC$TL_emojiKeywordDeleted.emoticons.get(i3));
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
            executeFast3.bindString(2, tLRPC$TL_emojiKeywordsDifference.lang_code);
            executeFast3.bindInteger(3, tLRPC$TL_emojiKeywordsDifference.version);
            executeFast3.bindLong(4, System.currentTimeMillis());
            executeFast3.step();
            executeFast3.dispose();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$putEmojiKeywords$169(str);
                }
            });
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$putEmojiKeywords$169(String str) {
        this.currentFetchingEmoji.remove(str);
        getNotificationCenter().postNotificationName(NotificationCenter.newEmojiSuggestionsAvailable, str);
    }

    public void getEmojiSuggestions(String[] strArr, String str, boolean z, KeywordResultCallback keywordResultCallback) {
        getEmojiSuggestions(strArr, str, z, keywordResultCallback, null);
    }

    public void getEmojiSuggestions(final String[] strArr, final String str, final boolean z, final KeywordResultCallback keywordResultCallback, final CountDownLatch countDownLatch) {
        if (keywordResultCallback != null) {
            if (TextUtils.isEmpty(str) || strArr == null) {
                keywordResultCallback.run(new ArrayList<>(), null);
                return;
            }
            final ArrayList arrayList = new ArrayList(Emoji.recentEmoji);
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$getEmojiSuggestions$174(strArr, keywordResultCallback, str, z, arrayList, countDownLatch);
                }
            });
            if (countDownLatch != null) {
                try {
                    countDownLatch.await();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public void lambda$getEmojiSuggestions$174(final java.lang.String[] r15, final org.telegram.messenger.MediaDataController.KeywordResultCallback r16, java.lang.String r17, boolean r18, final java.util.ArrayList r19, java.util.concurrent.CountDownLatch r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.lambda$getEmojiSuggestions$174(java.lang.String[], org.telegram.messenger.MediaDataController$KeywordResultCallback, java.lang.String, boolean, java.util.ArrayList, java.util.concurrent.CountDownLatch):void");
    }

    public void lambda$getEmojiSuggestions$171(String[] strArr, KeywordResultCallback keywordResultCallback, ArrayList arrayList) {
        for (String str : strArr) {
            if (this.currentFetchingEmoji.get(str) != null) {
                return;
            }
        }
        keywordResultCallback.run(arrayList, null);
    }

    public static int lambda$getEmojiSuggestions$172(ArrayList arrayList, KeywordResult keywordResult, KeywordResult keywordResult2) {
        int indexOf = arrayList.indexOf(keywordResult.emoji);
        int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (indexOf < 0) {
            indexOf = ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int indexOf2 = arrayList.indexOf(keywordResult2.emoji);
        if (indexOf2 >= 0) {
            i = indexOf2;
        }
        if (indexOf < i) {
            return -1;
        }
        if (indexOf > i) {
            return 1;
        }
        int length = keywordResult.keyword.length();
        int length2 = keywordResult2.keyword.length();
        if (length < length2) {
            return -1;
        }
        return length > length2 ? 1 : 0;
    }

    public void loadEmojiThemes() {
        Context context = ApplicationLoader.applicationContext;
        SharedPreferences sharedPreferences = context.getSharedPreferences("emojithemes_config_" + this.currentAccount, 0);
        int i = sharedPreferences.getInt(NotificationBadge.NewHtcHomeBadger.COUNT, 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ChatThemeBottomSheet.ChatThemeItem(EmojiThemes.createHomePreviewTheme()));
        for (int i2 = 0; i2 < i; i2++) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(sharedPreferences.getString("theme_" + i2, "")));
            try {
                EmojiThemes createPreviewFullTheme = EmojiThemes.createPreviewFullTheme(TLRPC$Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true));
                if (createPreviewFullTheme.items.size() >= 4) {
                    arrayList.add(new ChatThemeBottomSheet.ChatThemeItem(createPreviewFullTheme));
                }
                ChatThemeController.chatThemeQueue.postRunnable(new AnonymousClass2(arrayList));
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
    }

    public class AnonymousClass2 implements Runnable {
        final ArrayList val$previewItems;

        AnonymousClass2(ArrayList arrayList) {
            this.val$previewItems = arrayList;
        }

        @Override
        public void run() {
            for (int i = 0; i < this.val$previewItems.size(); i++) {
                ((ChatThemeBottomSheet.ChatThemeItem) this.val$previewItems.get(i)).chatTheme.loadPreviewColors(0);
            }
            final ArrayList arrayList = this.val$previewItems;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.AnonymousClass2.this.lambda$run$0(arrayList);
                }
            });
        }

        public void lambda$run$0(ArrayList arrayList) {
            MediaDataController.this.defaultEmojiThemes.clear();
            MediaDataController.this.defaultEmojiThemes.addAll(arrayList);
        }
    }

    public void generateEmojiPreviewThemes(ArrayList<TLRPC$TL_theme> arrayList, int i) {
        Context context = ApplicationLoader.applicationContext;
        SharedPreferences.Editor edit = context.getSharedPreferences("emojithemes_config_" + i, 0).edit();
        edit.putInt(NotificationBadge.NewHtcHomeBadger.COUNT, arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            TLRPC$TL_theme tLRPC$TL_theme = arrayList.get(i2);
            SerializedData serializedData = new SerializedData(tLRPC$TL_theme.getObjectSize());
            tLRPC$TL_theme.serializeToStream(serializedData);
            edit.putString("theme_" + i2, Utilities.bytesToHex(serializedData.toByteArray()));
        }
        edit.apply();
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new ChatThemeBottomSheet.ChatThemeItem(EmojiThemes.createHomePreviewTheme()));
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                EmojiThemes createPreviewFullTheme = EmojiThemes.createPreviewFullTheme(arrayList.get(i3));
                ChatThemeBottomSheet.ChatThemeItem chatThemeItem = new ChatThemeBottomSheet.ChatThemeItem(createPreviewFullTheme);
                if (createPreviewFullTheme.items.size() >= 4) {
                    arrayList2.add(chatThemeItem);
                }
            }
            ChatThemeController.chatThemeQueue.postRunnable(new AnonymousClass3(arrayList2, i));
            return;
        }
        this.defaultEmojiThemes.clear();
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.emojiPreviewThemesChanged, new Object[0]);
    }

    public class AnonymousClass3 implements Runnable {
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
                    MediaDataController.AnonymousClass3.this.lambda$run$0(arrayList);
                }
            });
        }

        public void lambda$run$0(ArrayList arrayList) {
            MediaDataController.this.defaultEmojiThemes.clear();
            MediaDataController.this.defaultEmojiThemes.addAll(arrayList);
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.emojiPreviewThemesChanged, new Object[0]);
        }
    }
}
