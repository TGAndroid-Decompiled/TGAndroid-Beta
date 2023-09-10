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
import android.util.Pair;
import android.util.SparseArray;
import androidx.collection.LongSparseArray;
import androidx.core.content.pm.ShortcutManagerCompat;
import com.android.billingclient.api.ProductDetails;
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
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationBadge;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ringtone.RingtoneDataStore;
import org.telegram.messenger.ringtone.RingtoneUploader;
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
import org.telegram.tgnet.TLRPC$EmojiStatus;
import org.telegram.tgnet.TLRPC$InputPeer;
import org.telegram.tgnet.TLRPC$InputStickerSet;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$MessageAction;
import org.telegram.tgnet.TLRPC$MessageEntity;
import org.telegram.tgnet.TLRPC$MessageReplyHeader;
import org.telegram.tgnet.TLRPC$MessagesFilter;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$Reaction;
import org.telegram.tgnet.TLRPC$StickerSet;
import org.telegram.tgnet.TLRPC$StickerSetCovered;
import org.telegram.tgnet.TLRPC$TL_account_emojiStatuses;
import org.telegram.tgnet.TLRPC$TL_account_emojiStatusesNotModified;
import org.telegram.tgnet.TLRPC$TL_account_getDefaultEmojiStatuses;
import org.telegram.tgnet.TLRPC$TL_account_getRecentEmojiStatuses;
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
import org.telegram.tgnet.TLRPC$TL_documentAttributeCustomEmoji;
import org.telegram.tgnet.TLRPC$TL_documentAttributeSticker;
import org.telegram.tgnet.TLRPC$TL_documentAttributeVideo;
import org.telegram.tgnet.TLRPC$TL_documentEmpty;
import org.telegram.tgnet.TLRPC$TL_draftMessage;
import org.telegram.tgnet.TLRPC$TL_draftMessageEmpty;
import org.telegram.tgnet.TLRPC$TL_emojiKeyword;
import org.telegram.tgnet.TLRPC$TL_emojiKeywordDeleted;
import org.telegram.tgnet.TLRPC$TL_emojiKeywordsDifference;
import org.telegram.tgnet.TLRPC$TL_emojiList;
import org.telegram.tgnet.TLRPC$TL_emojiStatus;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_help_getPremiumPromo;
import org.telegram.tgnet.TLRPC$TL_help_premiumPromo;
import org.telegram.tgnet.TLRPC$TL_inputDocument;
import org.telegram.tgnet.TLRPC$TL_inputMessageEntityMentionName;
import org.telegram.tgnet.TLRPC$TL_inputMessagesFilterDocument;
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
import org.telegram.tgnet.TLRPC$TL_inputStickerSetEmojiDefaultStatuses;
import org.telegram.tgnet.TLRPC$TL_inputStickerSetEmojiDefaultTopicIcons;
import org.telegram.tgnet.TLRPC$TL_inputStickerSetEmojiGenericAnimations;
import org.telegram.tgnet.TLRPC$TL_inputStickerSetEmpty;
import org.telegram.tgnet.TLRPC$TL_inputStickerSetID;
import org.telegram.tgnet.TLRPC$TL_inputStickerSetPremiumGifts;
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
import org.telegram.tgnet.TLRPC$TL_messageEntityCustomEmoji;
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
import org.telegram.tgnet.TLRPC$TL_messages_getEmojiStickers;
import org.telegram.tgnet.TLRPC$TL_messages_getFeaturedEmojiStickers;
import org.telegram.tgnet.TLRPC$TL_messages_getFeaturedStickers;
import org.telegram.tgnet.TLRPC$TL_messages_getMaskStickers;
import org.telegram.tgnet.TLRPC$TL_messages_getMessages;
import org.telegram.tgnet.TLRPC$TL_messages_getRecentReactions;
import org.telegram.tgnet.TLRPC$TL_messages_getScheduledMessages;
import org.telegram.tgnet.TLRPC$TL_messages_getSearchCounters;
import org.telegram.tgnet.TLRPC$TL_messages_getStickerSet;
import org.telegram.tgnet.TLRPC$TL_messages_getStickers;
import org.telegram.tgnet.TLRPC$TL_messages_getTopReactions;
import org.telegram.tgnet.TLRPC$TL_messages_installStickerSet;
import org.telegram.tgnet.TLRPC$TL_messages_messages;
import org.telegram.tgnet.TLRPC$TL_messages_messagesSlice;
import org.telegram.tgnet.TLRPC$TL_messages_reactions;
import org.telegram.tgnet.TLRPC$TL_messages_reactionsNotModified;
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
import org.telegram.tgnet.TLRPC$TL_premiumSubscriptionOption;
import org.telegram.tgnet.TLRPC$TL_stickerKeyword;
import org.telegram.tgnet.TLRPC$TL_stickerPack;
import org.telegram.tgnet.TLRPC$TL_stickerSetFullCovered;
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
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.ChatThemeBottomSheet;
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
    public static final int MEDIA_STORIES = 8;
    public static final int MEDIA_TYPES_COUNT = 8;
    public static final int MEDIA_URL = 3;
    public static final int MEDIA_VIDEOS_ONLY = 7;
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
    private static Comparator<TLRPC$MessageEntity> entityComparator;
    private static Paint erasePaint;
    private static Paint roundPaint;
    private static Path roundPath;
    private HashMap<String, ArrayList<TLRPC$Document>> allStickers;
    private HashMap<String, ArrayList<TLRPC$Document>> allStickersFeatured;
    private int[] archivedStickersCount;
    private TLRPC$TL_attachMenuBots attachMenuBots;
    private LongSparseArray<ArrayList<TLRPC$Message>> botDialogKeyboards;
    private HashMap<String, TLRPC$BotInfo> botInfos;
    private HashMap<MessagesStorage.TopicKey, TLRPC$Message> botKeyboards;
    private LongSparseArray<MessagesStorage.TopicKey> botKeyboardsByMids;
    private HashMap<String, Boolean> currentFetchingEmoji;
    public final ArrayList<ChatThemeBottomSheet.ChatThemeItem> defaultEmojiThemes;
    private LongSparseArray<String> diceEmojiStickerSetsById;
    private HashMap<String, TLRPC$TL_messages_stickerSet> diceStickerSetsByEmoji;
    private String doubleTapReaction;
    private LongSparseArray<SparseArray<TLRPC$Message>> draftMessages;
    private SharedPreferences draftPreferences;
    private LongSparseArray<SparseArray<TLRPC$DraftMessage>> drafts;
    private LongSparseArray<Integer> draftsFolderIds;
    private ArrayList<TLRPC$EmojiStatus>[] emojiStatuses;
    private Long[] emojiStatusesFetchDate;
    private boolean[] emojiStatusesFetching;
    private boolean[] emojiStatusesFromCacheFetched;
    private long[] emojiStatusesHash;
    private List<TLRPC$TL_availableReaction> enabledReactionsList;
    private ArrayList<TLRPC$StickerSetCovered>[] featuredStickerSets;
    private LongSparseArray<TLRPC$StickerSetCovered>[] featuredStickerSetsById;
    private boolean[] featuredStickersLoaded;
    private TLRPC$Document greetingsSticker;
    public TLRPC$TL_emojiList groupAvatarConstructorDefault;
    private LongSparseArray<TLRPC$TL_messages_stickerSet> groupStickerSets;
    public ArrayList<TLRPC$TL_topPeer> hints;
    private boolean inTransaction;
    public ArrayList<TLRPC$TL_topPeer> inlineBots;
    private ArrayList<Long> installedForceStickerSetsById;
    private LongSparseArray<TLRPC$TL_messages_stickerSet> installedStickerSetsById;
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
    private int[] loadDate;
    private int[] loadFeaturedDate;
    private long[] loadFeaturedHash;
    public boolean loadFeaturedPremium;
    private long[] loadHash;
    boolean loaded;
    boolean loading;
    private boolean loadingDefaultTopicIcons;
    private HashSet<String> loadingDiceStickerSets;
    private boolean loadingDrafts;
    private boolean[] loadingFeaturedStickers;
    private boolean loadingGenericAnimations;
    private boolean loadingMoreSearchMessages;
    private LongSparseArray<Boolean> loadingPinnedMessages;
    private boolean loadingPremiumGiftStickers;
    private boolean loadingRecentGifs;
    boolean loadingRecentReactions;
    private boolean[] loadingRecentStickers;
    private final HashSet<TLRPC$InputStickerSet> loadingStickerSets;
    private boolean[] loadingStickers;
    private int menuBotsUpdateDate;
    private long menuBotsUpdateHash;
    private boolean menuBotsUpdatedLocal;
    private int mergeReqId;
    private int[] messagesSearchCount;
    private boolean[] messagesSearchEndReached;
    public final ArrayList<TLRPC$Document> premiumPreviewStickers;
    private TLRPC$TL_help_premiumPromo premiumPromo;
    private int premiumPromoUpdateDate;
    boolean previewStickersLoading;
    public TLRPC$TL_emojiList profileAvatarConstructorDefault;
    private boolean reactionsCacheGenerated;
    private List<TLRPC$TL_availableReaction> reactionsList;
    private HashMap<String, TLRPC$TL_availableReaction> reactionsMap;
    private int reactionsUpdateDate;
    private int reactionsUpdateHash;
    private ArrayList<Long>[] readingStickerSets;
    private ArrayList<TLRPC$Document> recentGifs;
    private boolean recentGifsLoaded;
    ArrayList<TLRPC$Reaction> recentReactions;
    private ArrayList<TLRPC$Document>[] recentStickers;
    private boolean[] recentStickersLoaded;
    private LongSparseArray<Runnable> removingStickerSetsUndos;
    private int reqId;
    public final RingtoneDataStore ringtoneDataStore;
    public HashMap<String, RingtoneUploader> ringtoneUploaderHashMap;
    private Runnable[] scheduledLoadStickers;
    private ArrayList<MessageObject> searchResultMessages;
    private SparseArray<MessageObject>[] searchResultMessagesMap;
    private TLRPC$TL_messages_stickerSet stickerSetDefaultStatuses;
    private ArrayList<TLRPC$TL_messages_stickerSet>[] stickerSets;
    private LongSparseArray<TLRPC$TL_messages_stickerSet> stickerSetsById;
    private ConcurrentHashMap<String, TLRPC$TL_messages_stickerSet> stickerSetsByName;
    private LongSparseArray<String> stickersByEmoji;
    private LongSparseArray<TLRPC$Document>[] stickersByIds;
    private boolean[] stickersLoaded;
    ArrayList<TLRPC$Reaction> topReactions;
    private boolean triedLoadingEmojipacks;
    private ArrayList<Long> uninstalledForceStickerSetsById;
    private ArrayList<Long>[] unreadStickerSets;
    private HashMap<String, ArrayList<TLRPC$Message>> verifyingMessages;
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

    public static long calcHash(long j, long j2) {
        long j3 = j ^ (j >> 21);
        long j4 = j3 ^ (j3 << 35);
        return (j4 ^ (j4 >> 4)) + j2;
    }

    public static void lambda$markFeaturedStickersAsRead$58(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$markFeaturedStickersByIdAsRead$59(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$removeInline$142(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$removePeer$143(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$saveDraft$177(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    static {
        for (int i = 0; i < 4; i++) {
            lockObjects[i] = new Object();
        }
        entityComparator = new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                int lambda$static$149;
                lambda$static$149 = MediaDataController.lambda$static$149((TLRPC$MessageEntity) obj, (TLRPC$MessageEntity) obj2);
                return lambda$static$149;
            }
        };
    }

    public static MediaDataController getInstance(int i) {
        MediaDataController mediaDataController = Instance[i];
        if (mediaDataController == null) {
            synchronized (lockObjects) {
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
        this.attachMenuBots = new TLRPC$TL_attachMenuBots();
        this.reactionsList = new ArrayList();
        this.enabledReactionsList = new ArrayList();
        this.reactionsMap = new HashMap<>();
        this.stickerSets = new ArrayList[]{new ArrayList<>(), new ArrayList<>(), new ArrayList<>(0), new ArrayList<>(), new ArrayList<>(), new ArrayList<>()};
        this.stickersByIds = new LongSparseArray[]{new LongSparseArray<>(), new LongSparseArray<>(), new LongSparseArray<>(), new LongSparseArray<>(), new LongSparseArray<>(), new LongSparseArray<>()};
        this.stickerSetsById = new LongSparseArray<>();
        this.installedStickerSetsById = new LongSparseArray<>();
        this.installedForceStickerSetsById = new ArrayList<>();
        this.uninstalledForceStickerSetsById = new ArrayList<>();
        this.groupStickerSets = new LongSparseArray<>();
        this.stickerSetsByName = new ConcurrentHashMap<>(100, 1.0f, 1);
        this.stickerSetDefaultStatuses = null;
        this.diceStickerSetsByEmoji = new HashMap<>();
        this.diceEmojiStickerSetsById = new LongSparseArray<>();
        this.loadingDiceStickerSets = new HashSet<>();
        this.removingStickerSetsUndos = new LongSparseArray<>();
        this.scheduledLoadStickers = new Runnable[7];
        this.loadingStickers = new boolean[7];
        this.stickersLoaded = new boolean[7];
        this.loadHash = new long[7];
        this.loadDate = new int[7];
        this.ringtoneUploaderHashMap = new HashMap<>();
        this.verifyingMessages = new HashMap<>();
        this.archivedStickersCount = new int[7];
        this.stickersByEmoji = new LongSparseArray<>();
        this.allStickers = new HashMap<>();
        this.allStickersFeatured = new HashMap<>();
        this.recentStickers = new ArrayList[]{new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>()};
        this.loadingRecentStickers = new boolean[9];
        this.recentStickersLoaded = new boolean[9];
        this.recentGifs = new ArrayList<>();
        this.loadFeaturedHash = new long[2];
        this.loadFeaturedDate = new int[2];
        this.featuredStickerSets = new ArrayList[]{new ArrayList<>(), new ArrayList<>()};
        this.featuredStickerSetsById = new LongSparseArray[]{new LongSparseArray<>(), new LongSparseArray<>()};
        this.unreadStickerSets = new ArrayList[]{new ArrayList<>(), new ArrayList<>()};
        this.readingStickerSets = new ArrayList[]{new ArrayList<>(), new ArrayList<>()};
        this.loadingFeaturedStickers = new boolean[2];
        this.featuredStickersLoaded = new boolean[2];
        this.defaultEmojiThemes = new ArrayList<>();
        this.premiumPreviewStickers = new ArrayList<>();
        this.emojiStatusesHash = new long[2];
        this.emojiStatuses = new ArrayList[2];
        this.emojiStatusesFetchDate = new Long[2];
        this.emojiStatusesFromCacheFetched = new boolean[2];
        this.emojiStatusesFetching = new boolean[2];
        this.loadingStickerSets = new HashSet<>();
        this.messagesSearchCount = new int[]{0, 0};
        this.messagesSearchEndReached = new boolean[]{false, false};
        this.searchResultMessages = new ArrayList<>();
        this.searchResultMessagesMap = new SparseArray[]{new SparseArray<>(), new SparseArray<>()};
        this.hints = new ArrayList<>();
        this.inlineBots = new ArrayList<>();
        this.loadingPinnedMessages = new LongSparseArray<>();
        this.draftsFolderIds = new LongSparseArray<>();
        this.drafts = new LongSparseArray<>();
        this.draftMessages = new LongSparseArray<>();
        this.botInfos = new HashMap<>();
        this.botDialogKeyboards = new LongSparseArray<>();
        this.botKeyboards = new HashMap<>();
        this.botKeyboardsByMids = new LongSparseArray<>();
        this.currentFetchingEmoji = new HashMap<>();
        this.triedLoadingEmojipacks = false;
        this.recentReactions = new ArrayList<>();
        this.topReactions = new ArrayList<>();
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
            if (key.startsWith("r_")) {
                z = false;
            } else {
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
        loadRecentAndTopReactions(false);
        loadAvatarConstructor(false);
        loadAvatarConstructor(true);
        this.ringtoneDataStore = new RingtoneDataStore(this.currentAccount);
        this.menuBotsUpdateDate = getMessagesController().getMainSettings().getInt("menuBotsUpdateDate", 0);
    }

    public void cleanup() {
        int i = 0;
        while (true) {
            ArrayList<TLRPC$Document>[] arrayListArr = this.recentStickers;
            if (i >= arrayListArr.length) {
                break;
            }
            if (arrayListArr[i] != null) {
                arrayListArr[i].clear();
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
                    MediaDataController.lambda$cleanup$0();
                }
            });
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
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadHints, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadInlineHints, new Object[0]);
    }

    public boolean areStickersLoaded(int i) {
        return this.stickersLoaded[i];
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
        if (this.isLoadingReactions || Math.abs((System.currentTimeMillis() / 1000) - this.reactionsUpdateDate) < 3600) {
            return;
        }
        loadReactions(true, false);
    }

    public void checkMenuBots(boolean z) {
        if (this.isLoadingMenuBots) {
            return;
        }
        if ((!z || this.menuBotsUpdatedLocal) && Math.abs((System.currentTimeMillis() / 1000) - this.menuBotsUpdateDate) < 3600) {
            return;
        }
        loadAttachMenuBots(true, false);
    }

    public void checkPremiumPromo() {
        if (this.isLoadingPremiumPromo || Math.abs((System.currentTimeMillis() / 1000) - this.premiumPromoUpdateDate) < 3600) {
            return;
        }
        loadPremiumPromo(true);
    }

    public TLRPC$TL_help_premiumPromo getPremiumPromo() {
        return this.premiumPromo;
    }

    public Integer getPremiumHintAnnualDiscount(boolean z) {
        TLRPC$TL_help_premiumPromo tLRPC$TL_help_premiumPromo;
        int i;
        int i2;
        double d;
        double d2;
        ProductDetails productDetails;
        ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails;
        double d3;
        double d4;
        ProductDetails productDetails2;
        ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails2;
        if ((!z || (BillingController.getInstance().isReady() && BillingController.getInstance().getLastPremiumTransaction() != null)) && (tLRPC$TL_help_premiumPromo = this.premiumPromo) != null) {
            double d5 = 0.0d;
            Iterator<TLRPC$TL_premiumSubscriptionOption> it = tLRPC$TL_help_premiumPromo.period_options.iterator();
            boolean z2 = false;
            while (true) {
                i = 12;
                i2 = 1;
                if (!it.hasNext()) {
                    break;
                }
                TLRPC$TL_premiumSubscriptionOption next = it.next();
                if (z) {
                    if (next.current && Objects.equals(next.transaction.replaceAll("^(.*?)(?:\\.\\.\\d*|)$", "$1"), BillingController.getInstance().getLastPremiumTransaction())) {
                        if (BuildVars.useInvoiceBilling() && (productDetails2 = BillingController.PREMIUM_PRODUCT_DETAILS) != null) {
                            Iterator<ProductDetails.SubscriptionOfferDetails> it2 = productDetails2.getSubscriptionOfferDetails().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    subscriptionOfferDetails2 = null;
                                    break;
                                }
                                subscriptionOfferDetails2 = it2.next();
                                String billingPeriod = subscriptionOfferDetails2.getPricingPhases().getPricingPhaseList().get(0).getBillingPeriod();
                                int i3 = next.months;
                                if (i3 == 12) {
                                    if (billingPeriod.equals("P1Y")) {
                                        break;
                                    }
                                } else if (billingPeriod.equals(String.format(Locale.ROOT, "P%dM", Integer.valueOf(i3)))) {
                                    break;
                                }
                            }
                            if (subscriptionOfferDetails2 == null) {
                                d3 = next.amount;
                                d4 = next.months;
                                Double.isNaN(d3);
                                Double.isNaN(d4);
                            } else {
                                d3 = subscriptionOfferDetails2.getPricingPhases().getPricingPhaseList().get(0).getPriceAmountMicros();
                                d4 = next.months;
                                Double.isNaN(d3);
                                Double.isNaN(d4);
                            }
                        } else {
                            d3 = next.amount;
                            d4 = next.months;
                            Double.isNaN(d3);
                            Double.isNaN(d4);
                        }
                        d5 = d3 / d4;
                        z2 = true;
                    }
                } else if (next.months == 1) {
                    if (BuildVars.useInvoiceBilling()) {
                    }
                    d3 = next.amount;
                    d4 = next.months;
                    Double.isNaN(d3);
                    Double.isNaN(d4);
                    d5 = d3 / d4;
                    z2 = true;
                }
            }
            Iterator<TLRPC$TL_premiumSubscriptionOption> it3 = this.premiumPromo.period_options.iterator();
            int i4 = 0;
            while (it3.hasNext()) {
                TLRPC$TL_premiumSubscriptionOption next2 = it3.next();
                if (z2 && next2.months == i) {
                    if (!BuildVars.useInvoiceBilling() && (productDetails = BillingController.PREMIUM_PRODUCT_DETAILS) != null) {
                        Iterator<ProductDetails.SubscriptionOfferDetails> it4 = productDetails.getSubscriptionOfferDetails().iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                subscriptionOfferDetails = null;
                                break;
                            }
                            subscriptionOfferDetails = it4.next();
                            String billingPeriod2 = subscriptionOfferDetails.getPricingPhases().getPricingPhaseList().get(0).getBillingPeriod();
                            int i5 = next2.months;
                            if (i5 != i) {
                                Locale locale = Locale.ROOT;
                                Object[] objArr = new Object[i2];
                                objArr[0] = Integer.valueOf(i5);
                                if (billingPeriod2.equals(String.format(locale, "P%dM", objArr))) {
                                    break;
                                }
                                i = 12;
                            } else if (billingPeriod2.equals("P1Y")) {
                                break;
                            } else {
                                i = 12;
                            }
                        }
                        if (subscriptionOfferDetails == null) {
                            d = next2.amount;
                            d2 = next2.months;
                            Double.isNaN(d);
                            Double.isNaN(d2);
                        } else {
                            d = subscriptionOfferDetails.getPricingPhases().getPricingPhaseList().get(0).getPriceAmountMicros();
                            d2 = next2.months;
                            Double.isNaN(d);
                            Double.isNaN(d2);
                        }
                    } else {
                        d = next2.amount;
                        d2 = next2.months;
                        Double.isNaN(d);
                        Double.isNaN(d2);
                    }
                    i4 = (int) ((1.0d - ((d / d2) / d5)) * 100.0d);
                }
                i = 12;
                i2 = 1;
            }
            if (!z2 || i4 <= 0) {
                return null;
            }
            return Integer.valueOf(i4);
        }
        return null;
    }

    public TLRPC$TL_attachMenuBots getAttachMenuBots() {
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
                MediaDataController.this.lambda$loadAttachMenuBots$3(runnable, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadAttachMenuBots$2() {
        SQLiteCursor sQLiteCursor;
        Throwable th;
        long j;
        SQLiteCursor sQLiteCursor2;
        TLRPC$TL_attachMenuBots tLRPC$TL_attachMenuBots;
        long j2;
        int i;
        int i2 = 0;
        long j3 = 0;
        try {
            try {
                sQLiteCursor = getMessagesStorage().getDatabase().queryFinalized("SELECT data, hash, date FROM attach_menu_bots", new Object[0]);
            } catch (Exception e) {
                e = e;
                j = 0;
                sQLiteCursor2 = null;
            }
        } catch (Throwable th2) {
            sQLiteCursor = r0;
            th = th2;
        }
        try {
            if (sQLiteCursor.next()) {
                NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                if (byteBufferValue != null) {
                    TLRPC$AttachMenuBots TLdeserialize = TLRPC$AttachMenuBots.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), true);
                    r0 = TLdeserialize instanceof TLRPC$TL_attachMenuBots ? (TLRPC$TL_attachMenuBots) TLdeserialize : null;
                    byteBufferValue.reuse();
                }
                j3 = sQLiteCursor.longValue(1);
                i2 = sQLiteCursor.intValue(2);
            }
            sQLiteCursor.dispose();
            tLRPC$TL_attachMenuBots = r0;
            i = i2;
            j2 = j3;
        } catch (Exception e2) {
            e = e2;
            long j4 = j3;
            sQLiteCursor2 = r0;
            r0 = sQLiteCursor;
            j = j4;
            FileLog.e((Throwable) e, false);
            if (r0 != null) {
                r0.dispose();
            }
            tLRPC$TL_attachMenuBots = sQLiteCursor2;
            j2 = j;
            i = 0;
            processLoadedMenuBots(tLRPC$TL_attachMenuBots, j2, i, true);
        } catch (Throwable th3) {
            th = th3;
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
        processLoadedMenuBots(tLRPC$TL_attachMenuBots, j2, i, true);
    }

    public void lambda$loadAttachMenuBots$3(Runnable runnable, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (tLObject instanceof TLRPC$TL_attachMenuBotsNotModified) {
            processLoadedMenuBots(null, 0L, currentTimeMillis, false);
        } else if (tLObject instanceof TLRPC$TL_attachMenuBots) {
            TLRPC$TL_attachMenuBots tLRPC$TL_attachMenuBots = (TLRPC$TL_attachMenuBots) tLObject;
            processLoadedMenuBots(tLRPC$TL_attachMenuBots, tLRPC$TL_attachMenuBots.hash, currentTimeMillis, false);
        }
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
    }

    public void processLoadedMenuBots(TLRPC$TL_attachMenuBots tLRPC$TL_attachMenuBots, long j, int i, boolean z) {
        if (tLRPC$TL_attachMenuBots != null && i != 0) {
            this.attachMenuBots = tLRPC$TL_attachMenuBots;
            this.menuBotsUpdateHash = j;
        }
        SharedPreferences.Editor edit = getMessagesController().getMainSettings().edit();
        this.menuBotsUpdateDate = i;
        edit.putInt("menuBotsUpdateDate", i).commit();
        this.menuBotsUpdatedLocal = true;
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
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.attachMenuBotsDidLoad, new Object[0]);
    }

    public void updateAttachMenuBotsInCache() {
        if (getAttachMenuBots() != null) {
            putMenuBotsToCache(getAttachMenuBots(), this.menuBotsUpdateHash, this.menuBotsUpdateDate);
        }
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
        getConnectionsManager().sendRequest(new TLRPC$TL_help_getPremiumPromo(), new RequestDelegate() {
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

    public void processLoadedPremiumPromo(TLRPC$TL_help_premiumPromo tLRPC$TL_help_premiumPromo, int i, boolean z) {
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
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.premiumPromoUpdated, new Object[0]);
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
                getMessagesStorage().getDatabase().executeFast("DELETE FROM premium_promo").stepThis().dispose();
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
                    MediaDataController.this.lambda$loadReactions$11();
                }
            });
            return;
        }
        TLRPC$TL_messages_getAvailableReactions tLRPC$TL_messages_getAvailableReactions = new TLRPC$TL_messages_getAvailableReactions();
        tLRPC$TL_messages_getAvailableReactions.hash = z2 ? 0 : this.reactionsUpdateHash;
        getConnectionsManager().sendRequest(tLRPC$TL_messages_getAvailableReactions, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MediaDataController.this.lambda$loadReactions$13(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadReactions$11() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.lambda$loadReactions$11():void");
    }

    public void lambda$loadReactions$10(List list, int i, int i2) {
        processLoadedReactions(list, i, i2, true);
    }

    public void lambda$loadReactions$13(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$loadReactions$12(tLObject);
            }
        });
    }

    public void lambda$loadReactions$12(TLObject tLObject) {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (tLObject instanceof TLRPC$TL_messages_availableReactionsNotModified) {
            processLoadedReactions(null, 0, currentTimeMillis, false);
        } else if (tLObject instanceof TLRPC$TL_messages_availableReactions) {
            TLRPC$TL_messages_availableReactions tLRPC$TL_messages_availableReactions = (TLRPC$TL_messages_availableReactions) tLObject;
            processLoadedReactions(tLRPC$TL_messages_availableReactions.reactions, tLRPC$TL_messages_availableReactions.hash, currentTimeMillis, false);
        }
    }

    public void processLoadedReactions(List<TLRPC$TL_availableReaction> list, int i, int i2, boolean z) {
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
                    MediaDataController.this.lambda$processLoadedReactions$14();
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

    public void lambda$processLoadedReactions$14() {
        preloadDefaultReactions();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reactionsDidLoad, new Object[0]);
    }

    public void preloadDefaultReactions() {
        if (this.reactionsList == null || this.reactionsCacheGenerated || !LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS) || this.currentAccount != UserConfig.selectedAccount) {
            return;
        }
        this.reactionsCacheGenerated = true;
        ArrayList arrayList = new ArrayList(this.reactionsList);
        int min = Math.min(arrayList.size(), 10);
        for (int i = 0; i < min; i++) {
            TLRPC$TL_availableReaction tLRPC$TL_availableReaction = (TLRPC$TL_availableReaction) arrayList.get(i);
            preloadImage(ImageLocation.getForDocument(tLRPC$TL_availableReaction.activate_animation), 0);
            preloadImage(ImageLocation.getForDocument(tLRPC$TL_availableReaction.appear_animation), 0);
        }
        for (int i2 = 0; i2 < min; i2++) {
            preloadImage(ImageLocation.getForDocument(((TLRPC$TL_availableReaction) arrayList.get(i2)).effect_animation), 0);
        }
    }

    public void preloadImage(ImageLocation imageLocation, int i) {
        getFileLoader().loadFile(imageLocation, null, null, i, 11);
    }

    public void preloadImage(ImageReceiver imageReceiver, ImageLocation imageLocation, String str) {
        if (LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)) {
            imageReceiver.setUniqKeyPrefix("preload");
            imageReceiver.setFileLoadingPriority(0);
            imageReceiver.setImage(imageLocation, str, null, null, 0, 11);
        }
    }

    private void putReactionsToCache(List<TLRPC$TL_availableReaction> list, final int i, final int i2) {
        final ArrayList arrayList = list != null ? new ArrayList(list) : null;
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$putReactionsToCache$15(arrayList, i, i2);
            }
        });
    }

    public void lambda$putReactionsToCache$15(ArrayList arrayList, int i, int i2) {
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
        if (this.loadingFeaturedStickers[0]) {
            return;
        }
        if (!this.featuredStickersLoaded[0] || Math.abs((System.currentTimeMillis() / 1000) - this.loadFeaturedDate[0]) >= 3600) {
            loadFeaturedStickers(false, true, false);
        }
    }

    public void checkFeaturedEmoji() {
        if (this.loadingFeaturedStickers[1]) {
            return;
        }
        if (!this.featuredStickersLoaded[1] || Math.abs((System.currentTimeMillis() / 1000) - this.loadFeaturedDate[1]) >= 3600) {
            loadFeaturedStickers(true, true, false);
        }
    }

    public ArrayList<TLRPC$Document> getRecentStickers(int i) {
        ArrayList<TLRPC$Document> arrayList = this.recentStickers[i];
        if (i == 7) {
            return new ArrayList<>(this.recentStickers[i]);
        }
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
                MediaDataController.this.lambda$clearRecentStickers$18(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$clearRecentStickers$18(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$clearRecentStickers$17(tLObject);
            }
        });
    }

    public void lambda$clearRecentStickers$17(TLObject tLObject) {
        if (tLObject instanceof TLRPC$TL_boolTrue) {
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$clearRecentStickers$16();
                }
            });
            this.recentStickers[0].clear();
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recentDocumentsDidLoad, Boolean.FALSE, 0);
        }
    }

    public void lambda$clearRecentStickers$16() {
        try {
            getMessagesStorage().getDatabase().executeFast("DELETE FROM web_recent_v3 WHERE type = 3").stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void addRecentSticker(final int i, final Object obj, TLRPC$Document tLRPC$Document, int i2, boolean z) {
        boolean z2;
        int i3;
        final TLRPC$Document remove;
        if (i != 3) {
            if (MessageObject.isStickerDocument(tLRPC$Document) || MessageObject.isAnimatedStickerDocument(tLRPC$Document, true)) {
                int i4 = 0;
                while (true) {
                    if (i4 >= this.recentStickers[i].size()) {
                        z2 = false;
                        break;
                    }
                    TLRPC$Document tLRPC$Document2 = this.recentStickers[i].get(i4);
                    if (tLRPC$Document2.id == tLRPC$Document.id) {
                        this.recentStickers[i].remove(i4);
                        if (!z) {
                            this.recentStickers[i].add(0, tLRPC$Document2);
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
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 0, tLRPC$Document, 4);
                    } else {
                        boolean z3 = this.recentStickers[i].size() > getMessagesController().maxFaveStickersCount;
                        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                        int i5 = NotificationCenter.showBulletin;
                        Object[] objArr = new Object[3];
                        objArr[0] = 0;
                        objArr[1] = tLRPC$Document;
                        objArr[2] = Integer.valueOf(z3 ? 6 : 5);
                        globalInstance.lambda$postNotificationNameOnUIThread$1(i5, objArr);
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
                            MediaDataController.this.lambda$addRecentSticker$20(obj, tLRPC$TL_messages_faveSticker, tLObject, tLRPC$TL_error);
                        }
                    });
                    i3 = getMessagesController().maxFaveStickersCount;
                } else {
                    if (i == 0 && z) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 0, tLRPC$Document, 3);
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
                                MediaDataController.this.lambda$addRecentSticker$21(obj, tLRPC$TL_messages_saveRecentSticker, tLObject, tLRPC$TL_error);
                            }
                        });
                    }
                    i3 = getMessagesController().maxRecentStickersCount;
                }
                if (this.recentStickers[i].size() > i3 || z) {
                    if (z) {
                        remove = tLRPC$Document;
                    } else {
                        ArrayList<TLRPC$Document>[] arrayListArr = this.recentStickers;
                        remove = arrayListArr[i].remove(arrayListArr[i].size() - 1);
                    }
                    getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                        @Override
                        public final void run() {
                            MediaDataController.this.lambda$addRecentSticker$22(i, remove);
                        }
                    });
                }
                if (!z) {
                    ArrayList<TLRPC$Document> arrayList = new ArrayList<>();
                    arrayList.add(tLRPC$Document);
                    processLoadedRecentDocuments(i, arrayList, false, i2, false);
                }
                if (i == 2 || (i == 0 && z)) {
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.recentDocumentsDidLoad, Boolean.FALSE, Integer.valueOf(i));
                }
            }
        }
    }

    public void lambda$addRecentSticker$20(Object obj, TLRPC$TL_messages_faveSticker tLRPC$TL_messages_faveSticker, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null && FileRefController.isFileRefError(tLRPC$TL_error.text) && obj != null) {
            getFileRefController().requestReference(obj, tLRPC$TL_messages_faveSticker);
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$addRecentSticker$19();
                }
            });
        }
    }

    public void lambda$addRecentSticker$19() {
        getMediaDataController().loadRecents(2, false, false, true);
    }

    public void lambda$addRecentSticker$21(Object obj, TLRPC$TL_messages_saveRecentSticker tLRPC$TL_messages_saveRecentSticker, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null || !FileRefController.isFileRefError(tLRPC$TL_error.text) || obj == null) {
            return;
        }
        getFileRefController().requestReference(obj, tLRPC$TL_messages_saveRecentSticker);
    }

    public void lambda$addRecentSticker$22(int i, TLRPC$Document tLRPC$Document) {
        int i2 = 5;
        if (i == 0) {
            i2 = 3;
        } else if (i == 1) {
            i2 = 4;
        } else if (i == 5) {
            i2 = 7;
        }
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
                MediaDataController.this.lambda$removeRecentGif$23(tLRPC$TL_messages_saveGif, tLObject, tLRPC$TL_error);
            }
        });
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$removeRecentGif$24(tLRPC$Document);
            }
        });
    }

    public void lambda$removeRecentGif$23(TLRPC$TL_messages_saveGif tLRPC$TL_messages_saveGif, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null || !FileRefController.isFileRefError(tLRPC$TL_error.text)) {
            return;
        }
        getFileRefController().requestReference("gif", tLRPC$TL_messages_saveGif);
    }

    public void lambda$removeRecentGif$24(TLRPC$Document tLRPC$Document) {
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

    public void addRecentGif(final TLRPC$Document tLRPC$Document, int i, boolean z) {
        boolean z2;
        if (tLRPC$Document == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= this.recentGifs.size()) {
                z2 = false;
                break;
            }
            TLRPC$Document tLRPC$Document2 = this.recentGifs.get(i2);
            if (tLRPC$Document2.id == tLRPC$Document.id) {
                this.recentGifs.remove(i2);
                this.recentGifs.add(0, tLRPC$Document2);
                z2 = true;
                break;
            }
            i2++;
        }
        if (!z2) {
            this.recentGifs.add(0, tLRPC$Document);
        }
        if ((this.recentGifs.size() > getMessagesController().savedGifsLimitDefault && !UserConfig.getInstance(this.currentAccount).isPremium()) || this.recentGifs.size() > getMessagesController().savedGifsLimitPremium) {
            ArrayList<TLRPC$Document> arrayList = this.recentGifs;
            final TLRPC$Document remove = arrayList.remove(arrayList.size() - 1);
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$addRecentGif$25(remove);
                }
            });
            if (z) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MediaDataController.lambda$addRecentGif$26(TLRPC$Document.this);
                    }
                });
            }
        }
        ArrayList<TLRPC$Document> arrayList2 = new ArrayList<>();
        arrayList2.add(tLRPC$Document);
        processLoadedRecentDocuments(0, arrayList2, true, i, false);
    }

    public void lambda$addRecentGif$25(TLRPC$Document tLRPC$Document) {
        try {
            SQLiteDatabase database = getMessagesStorage().getDatabase();
            database.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + tLRPC$Document.id + "' AND type = 2").stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void lambda$addRecentGif$26(TLRPC$Document tLRPC$Document) {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 0, tLRPC$Document, 7);
    }

    public boolean isLoadingStickers(int i) {
        return this.loadingStickers[i];
    }

    public void replaceStickerSet(final TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet) {
        boolean z;
        int i;
        TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet2 = this.stickerSetsById.get(tLRPC$TL_messages_stickerSet.set.id);
        String str = this.diceEmojiStickerSetsById.get(tLRPC$TL_messages_stickerSet.set.id);
        if (str != null) {
            this.diceStickerSetsByEmoji.put(str, tLRPC$TL_messages_stickerSet);
            putDiceStickersToCache(str, tLRPC$TL_messages_stickerSet, (int) (System.currentTimeMillis() / 1000));
        }
        if (tLRPC$TL_messages_stickerSet2 == null) {
            tLRPC$TL_messages_stickerSet2 = this.stickerSetsByName.get(tLRPC$TL_messages_stickerSet.set.short_name);
        }
        boolean z2 = tLRPC$TL_messages_stickerSet2 == null && (tLRPC$TL_messages_stickerSet2 = this.groupStickerSets.get(tLRPC$TL_messages_stickerSet.set.id)) != null;
        if (tLRPC$TL_messages_stickerSet2 == null) {
            return;
        }
        if ("AnimatedEmojies".equals(tLRPC$TL_messages_stickerSet.set.short_name)) {
            tLRPC$TL_messages_stickerSet2.documents = tLRPC$TL_messages_stickerSet.documents;
            tLRPC$TL_messages_stickerSet2.packs = tLRPC$TL_messages_stickerSet.packs;
            tLRPC$TL_messages_stickerSet2.set = tLRPC$TL_messages_stickerSet.set;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$replaceStickerSet$27(tLRPC$TL_messages_stickerSet);
                }
            });
            z = true;
        } else {
            LongSparseArray longSparseArray = new LongSparseArray();
            int size = tLRPC$TL_messages_stickerSet.documents.size();
            for (int i2 = 0; i2 < size; i2++) {
                TLRPC$Document tLRPC$Document = tLRPC$TL_messages_stickerSet.documents.get(i2);
                longSparseArray.put(tLRPC$Document.id, tLRPC$Document);
            }
            int size2 = tLRPC$TL_messages_stickerSet2.documents.size();
            z = false;
            for (int i3 = 0; i3 < size2; i3++) {
                TLRPC$Document tLRPC$Document2 = (TLRPC$Document) longSparseArray.get(tLRPC$TL_messages_stickerSet2.documents.get(i3).id);
                if (tLRPC$Document2 != null) {
                    tLRPC$TL_messages_stickerSet2.documents.set(i3, tLRPC$Document2);
                    z = true;
                }
            }
        }
        if (z) {
            if (z2) {
                putSetToCache(tLRPC$TL_messages_stickerSet2);
                return;
            }
            TLRPC$StickerSet tLRPC$StickerSet = tLRPC$TL_messages_stickerSet.set;
            if (tLRPC$StickerSet.masks) {
                i = 1;
            } else {
                i = tLRPC$StickerSet.emojis ? 5 : 0;
            }
            putStickersToCache(i, this.stickerSets[i], this.loadDate[i], this.loadHash[i]);
            if ("AnimatedEmojies".equals(tLRPC$TL_messages_stickerSet.set.short_name)) {
                putStickersToCache(4, this.stickerSets[4], this.loadDate[4], this.loadHash[4]);
            }
        }
    }

    public void lambda$replaceStickerSet$27(TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet) {
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

    public static TLRPC$InputStickerSet getInputStickerSet(TLRPC$StickerSet tLRPC$StickerSet) {
        if (tLRPC$StickerSet != null) {
            TLRPC$TL_inputStickerSetID tLRPC$TL_inputStickerSetID = new TLRPC$TL_inputStickerSetID();
            tLRPC$TL_inputStickerSetID.id = tLRPC$StickerSet.id;
            tLRPC$TL_inputStickerSetID.access_hash = tLRPC$StickerSet.access_hash;
            return tLRPC$TL_inputStickerSetID;
        }
        return null;
    }

    public TLRPC$TL_messages_stickerSet getStickerSet(TLRPC$InputStickerSet tLRPC$InputStickerSet, boolean z) {
        return getStickerSet(tLRPC$InputStickerSet, null, z, null);
    }

    public TLRPC$TL_messages_stickerSet getStickerSet(TLRPC$InputStickerSet tLRPC$InputStickerSet, Integer num, boolean z) {
        return getStickerSet(tLRPC$InputStickerSet, num, z, null);
    }

    public TLRPC$TL_messages_stickerSet getStickerSet(final TLRPC$InputStickerSet tLRPC$InputStickerSet, final Integer num, boolean z, final Utilities.Callback<TLRPC$TL_messages_stickerSet> callback) {
        TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet;
        String str;
        if (tLRPC$InputStickerSet == null) {
            return null;
        }
        boolean z2 = tLRPC$InputStickerSet instanceof TLRPC$TL_inputStickerSetID;
        if (z2 && this.stickerSetsById.containsKey(tLRPC$InputStickerSet.id)) {
            tLRPC$TL_messages_stickerSet = this.stickerSetsById.get(tLRPC$InputStickerSet.id);
        } else if ((tLRPC$InputStickerSet instanceof TLRPC$TL_inputStickerSetShortName) && (str = tLRPC$InputStickerSet.short_name) != null && this.stickerSetsByName.containsKey(str.toLowerCase())) {
            tLRPC$TL_messages_stickerSet = this.stickerSetsByName.get(tLRPC$InputStickerSet.short_name.toLowerCase());
        } else if (!(tLRPC$InputStickerSet instanceof TLRPC$TL_inputStickerSetEmojiDefaultStatuses) || (tLRPC$TL_messages_stickerSet = this.stickerSetDefaultStatuses) == null) {
            tLRPC$TL_messages_stickerSet = null;
        }
        if (tLRPC$TL_messages_stickerSet != null) {
            if (callback != null) {
                callback.run(tLRPC$TL_messages_stickerSet);
            }
            return tLRPC$TL_messages_stickerSet;
        }
        if (z2) {
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$getStickerSet$30(tLRPC$InputStickerSet, num, callback);
                }
            });
        } else if (!z) {
            fetchStickerSetInternal(tLRPC$InputStickerSet, new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    MediaDataController.this.lambda$getStickerSet$31(callback, tLRPC$InputStickerSet, (Boolean) obj, (TLRPC$TL_messages_stickerSet) obj2);
                }
            });
        }
        return null;
    }

    public void lambda$getStickerSet$30(final TLRPC$InputStickerSet tLRPC$InputStickerSet, Integer num, final Utilities.Callback callback) {
        final TLRPC$TL_messages_stickerSet cachedStickerSetInternal = getCachedStickerSetInternal(tLRPC$InputStickerSet.id, num);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$getStickerSet$29(cachedStickerSetInternal, callback, tLRPC$InputStickerSet);
            }
        });
    }

    public void lambda$getStickerSet$29(TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet, final Utilities.Callback callback, TLRPC$InputStickerSet tLRPC$InputStickerSet) {
        if (tLRPC$TL_messages_stickerSet != null) {
            if (callback != null) {
                callback.run(tLRPC$TL_messages_stickerSet);
            }
            TLRPC$StickerSet tLRPC$StickerSet = tLRPC$TL_messages_stickerSet.set;
            if (tLRPC$StickerSet != null) {
                this.stickerSetsById.put(tLRPC$StickerSet.id, tLRPC$TL_messages_stickerSet);
                this.stickerSetsByName.put(tLRPC$TL_messages_stickerSet.set.short_name.toLowerCase(), tLRPC$TL_messages_stickerSet);
            }
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupStickersDidLoad, Long.valueOf(tLRPC$TL_messages_stickerSet.set.id), tLRPC$TL_messages_stickerSet);
            return;
        }
        fetchStickerSetInternal(tLRPC$InputStickerSet, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                MediaDataController.this.lambda$getStickerSet$28(callback, (Boolean) obj, (TLRPC$TL_messages_stickerSet) obj2);
            }
        });
    }

    public void lambda$getStickerSet$28(Utilities.Callback callback, Boolean bool, TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet) {
        TLRPC$StickerSet tLRPC$StickerSet;
        if (callback != null) {
            callback.run(tLRPC$TL_messages_stickerSet);
        }
        if (tLRPC$TL_messages_stickerSet == null || (tLRPC$StickerSet = tLRPC$TL_messages_stickerSet.set) == null) {
            return;
        }
        this.stickerSetsById.put(tLRPC$StickerSet.id, tLRPC$TL_messages_stickerSet);
        this.stickerSetsByName.put(tLRPC$TL_messages_stickerSet.set.short_name.toLowerCase(), tLRPC$TL_messages_stickerSet);
        saveStickerSetIntoCache(tLRPC$TL_messages_stickerSet);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupStickersDidLoad, Long.valueOf(tLRPC$TL_messages_stickerSet.set.id), tLRPC$TL_messages_stickerSet);
    }

    public void lambda$getStickerSet$31(Utilities.Callback callback, TLRPC$InputStickerSet tLRPC$InputStickerSet, Boolean bool, TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet) {
        if (callback != null) {
            callback.run(tLRPC$TL_messages_stickerSet);
        }
        if (tLRPC$TL_messages_stickerSet != null) {
            TLRPC$StickerSet tLRPC$StickerSet = tLRPC$TL_messages_stickerSet.set;
            if (tLRPC$StickerSet != null) {
                this.stickerSetsById.put(tLRPC$StickerSet.id, tLRPC$TL_messages_stickerSet);
                this.stickerSetsByName.put(tLRPC$TL_messages_stickerSet.set.short_name.toLowerCase(), tLRPC$TL_messages_stickerSet);
                if (tLRPC$InputStickerSet instanceof TLRPC$TL_inputStickerSetEmojiDefaultStatuses) {
                    this.stickerSetDefaultStatuses = tLRPC$TL_messages_stickerSet;
                }
            }
            saveStickerSetIntoCache(tLRPC$TL_messages_stickerSet);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupStickersDidLoad, Long.valueOf(tLRPC$TL_messages_stickerSet.set.id), tLRPC$TL_messages_stickerSet);
        }
    }

    private void saveStickerSetIntoCache(final TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet) {
        if (tLRPC$TL_messages_stickerSet == null || tLRPC$TL_messages_stickerSet.set == null) {
            return;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$saveStickerSetIntoCache$32(tLRPC$TL_messages_stickerSet);
            }
        });
    }

    public void lambda$saveStickerSetIntoCache$32(TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet) {
        try {
            SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO stickersets VALUES(?, ?, ?)");
            executeFast.requery();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLRPC$TL_messages_stickerSet.getObjectSize());
            tLRPC$TL_messages_stickerSet.serializeToStream(nativeByteBuffer);
            executeFast.bindLong(1, tLRPC$TL_messages_stickerSet.set.id);
            executeFast.bindByteBuffer(2, nativeByteBuffer);
            executeFast.bindInteger(3, tLRPC$TL_messages_stickerSet.set.hash);
            executeFast.step();
            nativeByteBuffer.reuse();
            executeFast.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private org.telegram.tgnet.TLRPC$TL_messages_stickerSet getCachedStickerSetInternal(long r5, java.lang.Integer r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.getCachedStickerSetInternal(long, java.lang.Integer):org.telegram.tgnet.TLRPC$TL_messages_stickerSet");
    }

    private void fetchStickerSetInternal(long j, Integer num, final Utilities.Callback2<Boolean, TLRPC$TL_messages_stickerSet> callback2) {
        if (callback2 == null) {
            return;
        }
        TLRPC$TL_messages_getStickerSet tLRPC$TL_messages_getStickerSet = new TLRPC$TL_messages_getStickerSet();
        TLRPC$TL_inputStickerSetID tLRPC$TL_inputStickerSetID = new TLRPC$TL_inputStickerSetID();
        tLRPC$TL_inputStickerSetID.id = j;
        tLRPC$TL_messages_getStickerSet.stickerset = tLRPC$TL_inputStickerSetID;
        if (num != null) {
            tLRPC$TL_messages_getStickerSet.hash = num.intValue();
        }
        getConnectionsManager().sendRequest(tLRPC$TL_messages_getStickerSet, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MediaDataController.lambda$fetchStickerSetInternal$34(Utilities.Callback2.this, tLObject, tLRPC$TL_error);
            }
        });
    }

    public static void lambda$fetchStickerSetInternal$34(final Utilities.Callback2 callback2, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.lambda$fetchStickerSetInternal$33(TLObject.this, callback2);
            }
        });
    }

    public static void lambda$fetchStickerSetInternal$33(TLObject tLObject, Utilities.Callback2 callback2) {
        if (tLObject != null) {
            callback2.run(Boolean.TRUE, (TLRPC$TL_messages_stickerSet) tLObject);
        } else {
            callback2.run(Boolean.FALSE, null);
        }
    }

    private void fetchStickerSetInternal(final TLRPC$InputStickerSet tLRPC$InputStickerSet, final Utilities.Callback2<Boolean, TLRPC$TL_messages_stickerSet> callback2) {
        if (callback2 == null || this.loadingStickerSets.contains(tLRPC$InputStickerSet)) {
            return;
        }
        this.loadingStickerSets.add(tLRPC$InputStickerSet);
        TLRPC$TL_messages_getStickerSet tLRPC$TL_messages_getStickerSet = new TLRPC$TL_messages_getStickerSet();
        tLRPC$TL_messages_getStickerSet.stickerset = tLRPC$InputStickerSet;
        getConnectionsManager().sendRequest(tLRPC$TL_messages_getStickerSet, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MediaDataController.this.lambda$fetchStickerSetInternal$36(tLRPC$InputStickerSet, callback2, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$fetchStickerSetInternal$36(final TLRPC$InputStickerSet tLRPC$InputStickerSet, final Utilities.Callback2 callback2, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$fetchStickerSetInternal$35(tLRPC$InputStickerSet, tLObject, callback2);
            }
        });
    }

    public void lambda$fetchStickerSetInternal$35(TLRPC$InputStickerSet tLRPC$InputStickerSet, TLObject tLObject, Utilities.Callback2 callback2) {
        this.loadingStickerSets.remove(tLRPC$InputStickerSet);
        if (tLObject != null) {
            callback2.run(Boolean.TRUE, (TLRPC$TL_messages_stickerSet) tLObject);
        } else {
            callback2.run(Boolean.FALSE, null);
        }
    }

    private void loadGroupStickerSet(final TLRPC$StickerSet tLRPC$StickerSet, boolean z) {
        if (z) {
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$loadGroupStickerSet$38(tLRPC$StickerSet);
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
                MediaDataController.this.lambda$loadGroupStickerSet$40(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadGroupStickerSet$38(TLRPC$StickerSet tLRPC$StickerSet) {
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
            if (tLRPC$TL_messages_stickerSet == null || tLRPC$TL_messages_stickerSet.set == null) {
                return;
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$loadGroupStickerSet$37(tLRPC$TL_messages_stickerSet);
                }
            });
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public void lambda$loadGroupStickerSet$37(TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet) {
        this.groupStickerSets.put(tLRPC$TL_messages_stickerSet.set.id, tLRPC$TL_messages_stickerSet);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupStickersDidLoad, Long.valueOf(tLRPC$TL_messages_stickerSet.set.id), tLRPC$TL_messages_stickerSet);
    }

    public void lambda$loadGroupStickerSet$40(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            final TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = (TLRPC$TL_messages_stickerSet) tLObject;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$loadGroupStickerSet$39(tLRPC$TL_messages_stickerSet);
                }
            });
        }
    }

    public void lambda$loadGroupStickerSet$39(TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet) {
        this.groupStickerSets.put(tLRPC$TL_messages_stickerSet.set.id, tLRPC$TL_messages_stickerSet);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupStickersDidLoad, Long.valueOf(tLRPC$TL_messages_stickerSet.set.id), tLRPC$TL_messages_stickerSet);
    }

    private void putSetToCache(final TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$putSetToCache$41(tLRPC$TL_messages_stickerSet);
            }
        });
    }

    public void lambda$putSetToCache$41(TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet) {
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
        return (this.stickersLoaded[0] && this.stickerSets[0].size() < 5 && this.recentStickers[2].isEmpty()) ? false : true;
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
        return this.featuredStickerSets[0];
    }

    public ArrayList<TLRPC$StickerSetCovered> getFeaturedEmojiSets() {
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
            TLRPC$StickerSetCovered tLRPC$StickerSetCovered = this.featuredStickerSets[z ? 1 : 0].get(i);
            if (!isStickerPackInstalled(tLRPC$StickerSetCovered.set.id) && ((!tLRPC$StickerSetCovered.covers.isEmpty() || tLRPC$StickerSetCovered.cover != null) && !this.unreadStickerSets[z ? 1 : 0].contains(Long.valueOf(tLRPC$StickerSetCovered.set.id)))) {
                return false;
            }
        }
        return true;
    }

    public boolean isStickerPackInstalled(long j) {
        return isStickerPackInstalled(j, true);
    }

    public boolean isStickerPackInstalled(long j, boolean z) {
        return (this.installedStickerSetsById.indexOfKey(j) >= 0 || (z && this.installedForceStickerSetsById.contains(Long.valueOf(j)))) && !(z && this.uninstalledForceStickerSetsById.contains(Long.valueOf(j)));
    }

    public boolean isStickerPackUnread(boolean z, long j) {
        return this.unreadStickerSets[z ? 1 : 0].contains(Long.valueOf(j));
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
        TLRPC$User tLRPC$User = tLObject instanceof TLRPC$User ? (TLRPC$User) tLObject : null;
        TLRPC$Chat tLRPC$Chat = tLObject instanceof TLRPC$Chat ? (TLRPC$Chat) tLObject : null;
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

    public void loadRecents(final int r8, final boolean r9, boolean r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.loadRecents(int, boolean, boolean, boolean):void");
    }

    public void lambda$loadRecents$43(final boolean z, final int i) {
        NativeByteBuffer byteBufferValue;
        int i2 = 7;
        if (z) {
            i2 = 2;
        } else if (i == 0) {
            i2 = 3;
        } else if (i == 1) {
            i2 = 4;
        } else if (i == 3) {
            i2 = 6;
        } else if (i != 5) {
            i2 = i == 7 ? 8 : 5;
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
                    MediaDataController.this.lambda$loadRecents$42(z, arrayList, i);
                }
            });
        } catch (Throwable th) {
            getMessagesStorage().checkSQLException(th);
        }
    }

    public void lambda$loadRecents$42(boolean z, ArrayList arrayList, int i) {
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

    public void lambda$loadRecents$44(int i, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        processLoadedRecentDocuments(i, tLObject instanceof TLRPC$TL_messages_savedGifs ? ((TLRPC$TL_messages_savedGifs) tLObject).gifs : null, true, 0, true);
    }

    public void lambda$loadRecents$45(int i, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        ArrayList<TLRPC$Document> arrayList;
        if (i == 3 || i == 7) {
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
        if (this.recentStickers[3].isEmpty()) {
            return;
        }
        ArrayList<TLRPC$Document>[] arrayListArr = this.recentStickers;
        this.greetingsSticker = arrayListArr[3].get(Utilities.random.nextInt(arrayListArr[3].size()));
        getFileLoader().loadFile(ImageLocation.getForDocument(this.greetingsSticker), this.greetingsSticker, null, 0, 1);
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
                    MediaDataController.this.lambda$processLoadedRecentDocuments$46(z, i, arrayList, z2, i2);
                }
            });
        }
        if (i2 == 0) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$processLoadedRecentDocuments$47(z, i, arrayList);
                }
            });
        }
    }

    public void lambda$processLoadedRecentDocuments$46(boolean z, int i, ArrayList arrayList, boolean z2, int i2) {
        int i3;
        try {
            SQLiteDatabase database = getMessagesStorage().getDatabase();
            int i4 = 2;
            int i5 = 3;
            if (z) {
                i3 = getMessagesController().maxRecentGifsCount;
            } else {
                if (i != 3 && i != 7) {
                    if (i == 2) {
                        i3 = getMessagesController().maxFaveStickersCount;
                    } else {
                        i3 = getMessagesController().maxRecentStickersCount;
                    }
                }
                i3 = 200;
            }
            database.beginTransaction();
            SQLitePreparedStatement executeFast = database.executeFast("REPLACE INTO web_recent_v3 VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            int size = arrayList.size();
            int i6 = z ? 2 : i == 0 ? 3 : i == 1 ? 4 : i == 3 ? 6 : i == 5 ? 7 : i == 7 ? 8 : 5;
            if (z2) {
                database.executeFast("DELETE FROM web_recent_v3 WHERE type = " + i6).stepThis().dispose();
            }
            int i7 = 0;
            while (i7 < size && i7 != i3) {
                TLRPC$Document tLRPC$Document = (TLRPC$Document) arrayList.get(i7);
                executeFast.requery();
                executeFast.bindString(1, "" + tLRPC$Document.id);
                executeFast.bindInteger(i4, i6);
                executeFast.bindString(i5, "");
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
                i7++;
                i4 = 2;
                i5 = 3;
            }
            executeFast.dispose();
            database.commitTransaction();
            if (arrayList.size() >= i3) {
                database.beginTransaction();
                while (i3 < arrayList.size()) {
                    database.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + ((TLRPC$Document) arrayList.get(i3)).id + "' AND type = " + i6).stepThis().dispose();
                    i3++;
                }
                database.commitTransaction();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$processLoadedRecentDocuments$47(boolean z, int i, ArrayList arrayList) {
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
            } else if (i == 5) {
                edit.putLong("lastStickersLoadTimeEmojiPacks", System.currentTimeMillis()).commit();
            } else if (i == 7) {
                edit.putLong("lastStickersLoadTimePremiumStickers", System.currentTimeMillis()).commit();
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
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.recentDocumentsDidLoad, Boolean.valueOf(z), Integer.valueOf(i));
        }
    }

    public void reorderStickers(int i, final ArrayList<Long> arrayList, boolean z) {
        Collections.sort(this.stickerSets[i], new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                int lambda$reorderStickers$48;
                lambda$reorderStickers$48 = MediaDataController.lambda$reorderStickers$48(arrayList, (TLRPC$TL_messages_stickerSet) obj, (TLRPC$TL_messages_stickerSet) obj2);
                return lambda$reorderStickers$48;
            }
        });
        this.loadHash[i] = calcStickersHash(this.stickerSets[i]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i), Boolean.valueOf(z));
    }

    public static int lambda$reorderStickers$48(ArrayList arrayList, TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet, TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet2) {
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
        int i;
        if (this.stickerSetsById.indexOfKey(tLRPC$TL_messages_stickerSet.set.id) >= 0 || this.stickerSetsByName.containsKey(tLRPC$TL_messages_stickerSet.set.short_name)) {
            return;
        }
        TLRPC$StickerSet tLRPC$StickerSet = tLRPC$TL_messages_stickerSet.set;
        if (tLRPC$StickerSet.masks) {
            i = 1;
        } else {
            i = tLRPC$StickerSet.emojis ? 5 : 0;
        }
        this.stickerSets[i].add(0, tLRPC$TL_messages_stickerSet);
        this.stickerSetsById.put(tLRPC$TL_messages_stickerSet.set.id, tLRPC$TL_messages_stickerSet);
        this.installedStickerSetsById.put(tLRPC$TL_messages_stickerSet.set.id, tLRPC$TL_messages_stickerSet);
        this.stickerSetsByName.put(tLRPC$TL_messages_stickerSet.set.short_name, tLRPC$TL_messages_stickerSet);
        LongSparseArray longSparseArray = new LongSparseArray();
        for (int i2 = 0; i2 < tLRPC$TL_messages_stickerSet.documents.size(); i2++) {
            TLRPC$Document tLRPC$Document = tLRPC$TL_messages_stickerSet.documents.get(i2);
            longSparseArray.put(tLRPC$Document.id, tLRPC$Document);
        }
        for (int i3 = 0; i3 < tLRPC$TL_messages_stickerSet.packs.size(); i3++) {
            TLRPC$TL_stickerPack tLRPC$TL_stickerPack = tLRPC$TL_messages_stickerSet.packs.get(i3);
            String replace = tLRPC$TL_stickerPack.emoticon.replace("️", "");
            tLRPC$TL_stickerPack.emoticon = replace;
            ArrayList<TLRPC$Document> arrayList = this.allStickers.get(replace);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.allStickers.put(tLRPC$TL_stickerPack.emoticon, arrayList);
            }
            for (int i4 = 0; i4 < tLRPC$TL_stickerPack.documents.size(); i4++) {
                Long l = tLRPC$TL_stickerPack.documents.get(i4);
                if (this.stickersByEmoji.indexOfKey(l.longValue()) < 0) {
                    this.stickersByEmoji.put(l.longValue(), tLRPC$TL_stickerPack.emoticon);
                }
                TLRPC$Document tLRPC$Document2 = (TLRPC$Document) longSparseArray.get(l.longValue());
                if (tLRPC$Document2 != null) {
                    arrayList.add(tLRPC$Document2);
                }
            }
        }
        this.loadHash[i] = calcStickersHash(this.stickerSets[i]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i), Boolean.TRUE);
        loadStickers(i, false, true);
    }

    public void loadFeaturedStickers(final boolean z, boolean z2, boolean z3) {
        final long j;
        TLRPC$TL_messages_getFeaturedStickers tLRPC$TL_messages_getFeaturedStickers;
        boolean[] zArr = this.loadingFeaturedStickers;
        if (zArr[z ? 1 : 0]) {
            return;
        }
        zArr[z ? 1 : 0] = true;
        if (z2) {
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$loadFeaturedStickers$49(z);
                }
            });
            return;
        }
        if (z) {
            TLRPC$TL_messages_getFeaturedEmojiStickers tLRPC$TL_messages_getFeaturedEmojiStickers = new TLRPC$TL_messages_getFeaturedEmojiStickers();
            j = z3 ? 0L : this.loadFeaturedHash[1];
            tLRPC$TL_messages_getFeaturedEmojiStickers.hash = j;
            tLRPC$TL_messages_getFeaturedStickers = tLRPC$TL_messages_getFeaturedEmojiStickers;
        } else {
            TLRPC$TL_messages_getFeaturedStickers tLRPC$TL_messages_getFeaturedStickers2 = new TLRPC$TL_messages_getFeaturedStickers();
            j = z3 ? 0L : this.loadFeaturedHash[0];
            tLRPC$TL_messages_getFeaturedStickers2.hash = j;
            tLRPC$TL_messages_getFeaturedStickers = tLRPC$TL_messages_getFeaturedStickers2;
        }
        getConnectionsManager().sendRequest(tLRPC$TL_messages_getFeaturedStickers, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MediaDataController.this.lambda$loadFeaturedStickers$51(z, j, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadFeaturedStickers$49(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.lambda$loadFeaturedStickers$49(boolean):void");
    }

    public void lambda$loadFeaturedStickers$51(final boolean z, final long j, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$loadFeaturedStickers$50(tLObject, z, j);
            }
        });
    }

    public void lambda$loadFeaturedStickers$50(TLObject tLObject, boolean z, long j) {
        if (tLObject instanceof TLRPC$TL_messages_featuredStickers) {
            TLRPC$TL_messages_featuredStickers tLRPC$TL_messages_featuredStickers = (TLRPC$TL_messages_featuredStickers) tLObject;
            processLoadedFeaturedStickers(z, tLRPC$TL_messages_featuredStickers.sets, tLRPC$TL_messages_featuredStickers.unread, tLRPC$TL_messages_featuredStickers.premium, false, (int) (System.currentTimeMillis() / 1000), tLRPC$TL_messages_featuredStickers.hash);
            return;
        }
        processLoadedFeaturedStickers(z, null, null, false, false, (int) (System.currentTimeMillis() / 1000), j);
    }

    private void processLoadedFeaturedStickers(final boolean z, final ArrayList<TLRPC$StickerSetCovered> arrayList, final ArrayList<Long> arrayList2, final boolean z2, final boolean z3, final int i, final long j) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$processLoadedFeaturedStickers$52(z);
            }
        });
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$processLoadedFeaturedStickers$56(z3, arrayList, i, j, z, arrayList2, z2);
            }
        });
    }

    public void lambda$processLoadedFeaturedStickers$52(boolean z) {
        this.loadingFeaturedStickers[z ? 1 : 0] = false;
        this.featuredStickersLoaded[z ? 1 : 0] = true;
    }

    public void lambda$processLoadedFeaturedStickers$56(boolean z, final ArrayList arrayList, final int i, final long j, final boolean z2, final ArrayList arrayList2, final boolean z3) {
        long j2 = 0;
        if ((z && (arrayList == null || Math.abs((System.currentTimeMillis() / 1000) - i) >= 3600)) || (!z && arrayList == null && j == 0)) {
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$processLoadedFeaturedStickers$53(arrayList, j, z2);
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
                final ArrayList<TLRPC$StickerSetCovered> arrayList3 = new ArrayList<>();
                final LongSparseArray longSparseArray = new LongSparseArray();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    TLRPC$StickerSetCovered tLRPC$StickerSetCovered = (TLRPC$StickerSetCovered) arrayList.get(i2);
                    arrayList3.add(tLRPC$StickerSetCovered);
                    longSparseArray.put(tLRPC$StickerSetCovered.set.id, tLRPC$StickerSetCovered);
                }
                if (!z) {
                    putFeaturedStickersToCache(z2, arrayList3, arrayList2, i, j, z3);
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MediaDataController.this.lambda$processLoadedFeaturedStickers$54(z2, arrayList2, longSparseArray, arrayList3, j, i, z3);
                    }
                });
            } catch (Throwable th) {
                FileLog.e(th);
            }
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$processLoadedFeaturedStickers$55(z2, i);
            }
        });
        putFeaturedStickersToCache(z2, null, null, i, 0L, z3);
    }

    public void lambda$processLoadedFeaturedStickers$53(ArrayList arrayList, long j, boolean z) {
        if (arrayList != null && j != 0) {
            this.loadFeaturedHash[z ? 1 : 0] = j;
        }
        this.loadingFeaturedStickers[z ? 1 : 0] = false;
        loadFeaturedStickers(z, false, false);
    }

    public void lambda$processLoadedFeaturedStickers$54(boolean z, ArrayList arrayList, LongSparseArray longSparseArray, ArrayList arrayList2, long j, int i, boolean z2) {
        this.unreadStickerSets[z ? 1 : 0] = arrayList;
        this.featuredStickerSetsById[z ? 1 : 0] = longSparseArray;
        this.featuredStickerSets[z ? 1 : 0] = arrayList2;
        this.loadFeaturedHash[z ? 1 : 0] = j;
        this.loadFeaturedDate[z ? 1 : 0] = i;
        this.loadFeaturedPremium = z2;
        loadStickers(z ? 6 : 3, true, false);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(z ? NotificationCenter.featuredEmojiDidLoad : NotificationCenter.featuredStickersDidLoad, new Object[0]);
    }

    public void lambda$processLoadedFeaturedStickers$55(boolean z, int i) {
        this.loadFeaturedDate[z ? 1 : 0] = i;
    }

    private void putFeaturedStickersToCache(final boolean z, ArrayList<TLRPC$StickerSetCovered> arrayList, final ArrayList<Long> arrayList2, final int i, final long j, final boolean z2) {
        final ArrayList arrayList3 = arrayList != null ? new ArrayList(arrayList) : null;
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$putFeaturedStickersToCache$57(arrayList3, arrayList2, i, j, z2, z);
            }
        });
    }

    public void lambda$putFeaturedStickersToCache$57(ArrayList arrayList, ArrayList arrayList2, int i, long j, boolean z, boolean z2) {
        int i2 = 1;
        try {
            if (arrayList != null) {
                SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO stickers_featured VALUES(?, ?, ?, ?, ?, ?, ?)");
                executeFast.requery();
                int i3 = 4;
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    i3 += ((TLRPC$StickerSetCovered) arrayList.get(i4)).getObjectSize();
                }
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(i3);
                NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer((arrayList2.size() * 8) + 4);
                nativeByteBuffer.writeInt32(arrayList.size());
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    ((TLRPC$StickerSetCovered) arrayList.get(i5)).serializeToStream(nativeByteBuffer);
                }
                nativeByteBuffer2.writeInt32(arrayList2.size());
                for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                    nativeByteBuffer2.writeInt64(((Long) arrayList2.get(i6)).longValue());
                }
                executeFast.bindInteger(1, 1);
                executeFast.bindByteBuffer(2, nativeByteBuffer);
                executeFast.bindByteBuffer(3, nativeByteBuffer2);
                executeFast.bindInteger(4, i);
                executeFast.bindLong(5, j);
                executeFast.bindInteger(6, z ? 1 : 0);
                if (!z2) {
                    i2 = 0;
                }
                executeFast.bindInteger(7, i2);
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

    private long calcFeaturedStickersHash(boolean z, ArrayList<TLRPC$StickerSetCovered> arrayList) {
        long j = 0;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC$StickerSet tLRPC$StickerSet = arrayList.get(i).set;
                if (!tLRPC$StickerSet.archived) {
                    j = calcHash(j, tLRPC$StickerSet.id);
                    if (this.unreadStickerSets[z ? 1 : 0].contains(Long.valueOf(tLRPC$StickerSet.id))) {
                        j = calcHash(j, 1L);
                    }
                }
            }
        }
        return j;
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
            getConnectionsManager().sendRequest(new TLRPC$TL_messages_readFeaturedStickers(), new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MediaDataController.lambda$markFeaturedStickersAsRead$58(tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public long getFeaturedStickersHashWithoutUnread(boolean z) {
        long j = 0;
        for (int i = 0; i < this.featuredStickerSets[z ? 1 : 0].size(); i++) {
            TLRPC$StickerSet tLRPC$StickerSet = this.featuredStickerSets[z ? 1 : 0].get(i).set;
            if (!tLRPC$StickerSet.archived) {
                j = calcHash(j, tLRPC$StickerSet.id);
            }
        }
        return j;
    }

    public void markFeaturedStickersByIdAsRead(final boolean z, final long j) {
        if (!this.unreadStickerSets[z ? 1 : 0].contains(Long.valueOf(j)) || this.readingStickerSets[z ? 1 : 0].contains(Long.valueOf(j))) {
            return;
        }
        this.readingStickerSets[z ? 1 : 0].add(Long.valueOf(j));
        TLRPC$TL_messages_readFeaturedStickers tLRPC$TL_messages_readFeaturedStickers = new TLRPC$TL_messages_readFeaturedStickers();
        tLRPC$TL_messages_readFeaturedStickers.id.add(Long.valueOf(j));
        getConnectionsManager().sendRequest(tLRPC$TL_messages_readFeaturedStickers, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MediaDataController.lambda$markFeaturedStickersByIdAsRead$59(tLObject, tLRPC$TL_error);
            }
        });
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$markFeaturedStickersByIdAsRead$60(z, j);
            }
        }, 1000L);
    }

    public void lambda$markFeaturedStickersByIdAsRead$60(boolean z, long j) {
        this.unreadStickerSets[z ? 1 : 0].remove(Long.valueOf(j));
        this.readingStickerSets[z ? 1 : 0].remove(Long.valueOf(j));
        this.loadFeaturedHash[z ? 1 : 0] = calcFeaturedStickersHash(z, this.featuredStickerSets[z ? 1 : 0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(z ? NotificationCenter.featuredEmojiDidLoad : NotificationCenter.featuredStickersDidLoad, new Object[0]);
        putFeaturedStickersToCache(z, this.featuredStickerSets[z ? 1 : 0], this.unreadStickerSets[z ? 1 : 0], this.loadFeaturedDate[z ? 1 : 0], this.loadFeaturedHash[z ? 1 : 0], this.loadFeaturedPremium);
    }

    public int getArchivedStickersCount(int i) {
        return this.archivedStickersCount[i];
    }

    public void verifyAnimatedStickerMessage(TLRPC$Message tLRPC$Message) {
        verifyAnimatedStickerMessage(tLRPC$Message, false);
    }

    public void verifyAnimatedStickerMessage(final TLRPC$Message tLRPC$Message, boolean z) {
        if (tLRPC$Message == null) {
            return;
        }
        TLRPC$Document document = MessageObject.getDocument(tLRPC$Message);
        final String stickerSetName = MessageObject.getStickerSetName(document);
        if (TextUtils.isEmpty(stickerSetName)) {
            return;
        }
        TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = this.stickerSetsByName.get(stickerSetName);
        if (tLRPC$TL_messages_stickerSet == null) {
            if (z) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MediaDataController.this.lambda$verifyAnimatedStickerMessage$61(tLRPC$Message, stickerSetName);
                    }
                });
                return;
            } else {
                lambda$verifyAnimatedStickerMessage$61(tLRPC$Message, stickerSetName);
                return;
            }
        }
        int size = tLRPC$TL_messages_stickerSet.documents.size();
        for (int i = 0; i < size; i++) {
            TLRPC$Document tLRPC$Document = tLRPC$TL_messages_stickerSet.documents.get(i);
            if (tLRPC$Document.id == document.id && tLRPC$Document.dc_id == document.dc_id) {
                tLRPC$Message.stickerVerified = 1;
                return;
            }
        }
    }

    public void lambda$verifyAnimatedStickerMessage$61(TLRPC$Message tLRPC$Message, final String str) {
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
                MediaDataController.this.lambda$verifyAnimatedStickerMessageInternal$63(str, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$verifyAnimatedStickerMessageInternal$63(final String str, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$verifyAnimatedStickerMessageInternal$62(str, tLObject);
            }
        });
    }

    public void lambda$verifyAnimatedStickerMessageInternal$62(String str, TLObject tLObject) {
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
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didVerifyMessagesStickers, arrayList);
        getMessagesStorage().updateMessageVerifyFlags(arrayList);
    }

    public void loadArchivedStickersCount(final int i, boolean z) {
        if (z) {
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.currentAccount);
            int i2 = notificationsSettings.getInt("archivedStickersCount" + i, -1);
            if (i2 == -1) {
                loadArchivedStickersCount(i, false);
                return;
            }
            this.archivedStickersCount[i] = i2;
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.archivedStickersCountDidLoad, Integer.valueOf(i));
            return;
        }
        TLRPC$TL_messages_getArchivedStickers tLRPC$TL_messages_getArchivedStickers = new TLRPC$TL_messages_getArchivedStickers();
        tLRPC$TL_messages_getArchivedStickers.limit = 0;
        tLRPC$TL_messages_getArchivedStickers.masks = i == 1;
        tLRPC$TL_messages_getArchivedStickers.emojis = i == 5;
        getConnectionsManager().sendRequest(tLRPC$TL_messages_getArchivedStickers, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MediaDataController.this.lambda$loadArchivedStickersCount$65(i, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadArchivedStickersCount$65(final int i, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$loadArchivedStickersCount$64(tLRPC$TL_error, tLObject, i);
            }
        });
    }

    public void lambda$loadArchivedStickersCount$64(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject, int i) {
        if (tLRPC$TL_error == null) {
            TLRPC$TL_messages_archivedStickers tLRPC$TL_messages_archivedStickers = (TLRPC$TL_messages_archivedStickers) tLObject;
            this.archivedStickersCount[i] = tLRPC$TL_messages_archivedStickers.count;
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            edit.putInt("archivedStickersCount" + i, tLRPC$TL_messages_archivedStickers.count).commit();
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.archivedStickersCountDidLoad, Integer.valueOf(i));
        }
    }

    private void processLoadStickersResponse(int i, TLRPC$TL_messages_allStickers tLRPC$TL_messages_allStickers) {
        processLoadStickersResponse(i, tLRPC$TL_messages_allStickers, null);
    }

    private void processLoadStickersResponse(final int i, final TLRPC$TL_messages_allStickers tLRPC$TL_messages_allStickers, Runnable runnable) {
        final ArrayList<TLRPC$TL_messages_stickerSet> arrayList = new ArrayList<>();
        long j = 1000;
        if (tLRPC$TL_messages_allStickers.sets.isEmpty()) {
            processLoadedStickers(i, arrayList, false, (int) (System.currentTimeMillis() / 1000), tLRPC$TL_messages_allStickers.hash2, runnable);
            return;
        }
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
                        processLoadedStickers(i, arrayList, false, (int) (System.currentTimeMillis() / j), tLRPC$TL_messages_allStickers.hash2);
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
                    MediaDataController.this.lambda$processLoadStickersResponse$67(arrayList, i3, longSparseArray, tLRPC$StickerSet, tLRPC$TL_messages_allStickers, i, tLObject, tLRPC$TL_error);
                }
            });
            i2++;
            j = 1000;
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$processLoadStickersResponse$67(final ArrayList arrayList, final int i, final LongSparseArray longSparseArray, final TLRPC$StickerSet tLRPC$StickerSet, final TLRPC$TL_messages_allStickers tLRPC$TL_messages_allStickers, final int i2, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$processLoadStickersResponse$66(tLObject, arrayList, i, longSparseArray, tLRPC$StickerSet, tLRPC$TL_messages_allStickers, i2);
            }
        });
    }

    public void lambda$processLoadStickersResponse$66(TLObject tLObject, ArrayList arrayList, int i, LongSparseArray longSparseArray, TLRPC$StickerSet tLRPC$StickerSet, TLRPC$TL_messages_allStickers tLRPC$TL_messages_allStickers, int i2) {
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
            processLoadedStickers(i2, arrayList, false, (int) (System.currentTimeMillis() / 1000), tLRPC$TL_messages_allStickers.hash2);
        }
    }

    public void checkPremiumGiftStickers() {
        if (getUserConfig().premiumGiftsStickerPack != null) {
            String str = getUserConfig().premiumGiftsStickerPack;
            TLRPC$TL_messages_stickerSet stickerSetByName = getStickerSetByName(str);
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
        TLRPC$TL_messages_getStickerSet tLRPC$TL_messages_getStickerSet = new TLRPC$TL_messages_getStickerSet();
        tLRPC$TL_messages_getStickerSet.stickerset = new TLRPC$TL_inputStickerSetPremiumGifts();
        getConnectionsManager().sendRequest(tLRPC$TL_messages_getStickerSet, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MediaDataController.this.lambda$checkPremiumGiftStickers$69(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$checkPremiumGiftStickers$69(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$checkPremiumGiftStickers$68(tLObject);
            }
        });
    }

    public void lambda$checkPremiumGiftStickers$68(TLObject tLObject) {
        if (tLObject instanceof TLRPC$TL_messages_stickerSet) {
            TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = (TLRPC$TL_messages_stickerSet) tLObject;
            getUserConfig().premiumGiftsStickerPack = tLRPC$TL_messages_stickerSet.set.short_name;
            getUserConfig().lastUpdatedPremiumGiftsStickerPack = System.currentTimeMillis();
            getUserConfig().saveConfig(false);
            processLoadedDiceStickers(getUserConfig().premiumGiftsStickerPack, false, tLRPC$TL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdatePremiumGiftStickers, new Object[0]);
        }
    }

    public void checkGenericAnimations() {
        if (getUserConfig().genericAnimationsStickerPack != null) {
            String str = getUserConfig().genericAnimationsStickerPack;
            TLRPC$TL_messages_stickerSet stickerSetByName = getStickerSetByName(str);
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
        TLRPC$TL_messages_getStickerSet tLRPC$TL_messages_getStickerSet = new TLRPC$TL_messages_getStickerSet();
        tLRPC$TL_messages_getStickerSet.stickerset = new TLRPC$TL_inputStickerSetEmojiGenericAnimations();
        getConnectionsManager().sendRequest(tLRPC$TL_messages_getStickerSet, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MediaDataController.this.lambda$checkGenericAnimations$71(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$checkGenericAnimations$71(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$checkGenericAnimations$70(tLObject);
            }
        });
    }

    public void lambda$checkGenericAnimations$70(TLObject tLObject) {
        if (tLObject instanceof TLRPC$TL_messages_stickerSet) {
            TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = (TLRPC$TL_messages_stickerSet) tLObject;
            getUserConfig().genericAnimationsStickerPack = tLRPC$TL_messages_stickerSet.set.short_name;
            getUserConfig().lastUpdatedGenericAnimations = System.currentTimeMillis();
            getUserConfig().saveConfig(false);
            processLoadedDiceStickers(getUserConfig().genericAnimationsStickerPack, false, tLRPC$TL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
            for (int i = 0; i < tLRPC$TL_messages_stickerSet.documents.size(); i++) {
                if (this.currentAccount == UserConfig.selectedAccount) {
                    preloadImage(ImageLocation.getForDocument(tLRPC$TL_messages_stickerSet.documents.get(i)), 0);
                }
            }
        }
    }

    public void checkDefaultTopicIcons() {
        if (getUserConfig().defaultTopicIcons != null) {
            String str = getUserConfig().defaultTopicIcons;
            TLRPC$TL_messages_stickerSet stickerSetByName = getStickerSetByName(str);
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
        TLRPC$TL_messages_getStickerSet tLRPC$TL_messages_getStickerSet = new TLRPC$TL_messages_getStickerSet();
        tLRPC$TL_messages_getStickerSet.stickerset = new TLRPC$TL_inputStickerSetEmojiDefaultTopicIcons();
        getConnectionsManager().sendRequest(tLRPC$TL_messages_getStickerSet, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MediaDataController.this.lambda$checkDefaultTopicIcons$73(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$checkDefaultTopicIcons$73(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$checkDefaultTopicIcons$72(tLObject);
            }
        });
    }

    public void lambda$checkDefaultTopicIcons$72(TLObject tLObject) {
        if (tLObject instanceof TLRPC$TL_messages_stickerSet) {
            TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = (TLRPC$TL_messages_stickerSet) tLObject;
            getUserConfig().defaultTopicIcons = tLRPC$TL_messages_stickerSet.set.short_name;
            getUserConfig().lastUpdatedDefaultTopicIcons = System.currentTimeMillis();
            getUserConfig().saveConfig(false);
            processLoadedDiceStickers(getUserConfig().defaultTopicIcons, false, tLRPC$TL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
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
                        MediaDataController.this.lambda$loadStickersByEmojiOrName$74(str, z);
                    }
                });
                return;
            }
            TLRPC$TL_messages_getStickerSet tLRPC$TL_messages_getStickerSet = new TLRPC$TL_messages_getStickerSet();
            if (Objects.equals(getUserConfig().premiumGiftsStickerPack, str)) {
                tLRPC$TL_messages_getStickerSet.stickerset = new TLRPC$TL_inputStickerSetPremiumGifts();
            } else if (z) {
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
                    MediaDataController.this.lambda$loadStickersByEmojiOrName$76(str, z, tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$loadStickersByEmojiOrName$74(String str, boolean z) {
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
            } catch (Throwable th) {
                th = th;
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
        } catch (Throwable th2) {
            th = th2;
            tLRPC$TL_messages_stickerSet = null;
        }
        processLoadedDiceStickers(str, z, tLRPC$TL_messages_stickerSet2, true, i);
    }

    public void lambda$loadStickersByEmojiOrName$76(final String str, final boolean z, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$loadStickersByEmojiOrName$75(tLRPC$TL_error, tLObject, str, z);
            }
        });
    }

    public void lambda$loadStickersByEmojiOrName$75(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject, String str, boolean z) {
        if (tLObject instanceof TLRPC$TL_messages_stickerSet) {
            processLoadedDiceStickers(str, z, (TLRPC$TL_messages_stickerSet) tLObject, false, (int) (System.currentTimeMillis() / 1000));
        } else {
            processLoadedDiceStickers(str, z, null, false, (int) (System.currentTimeMillis() / 1000));
        }
    }

    public void lambda$processLoadedDiceStickers$77(String str) {
        this.loadingDiceStickerSets.remove(str);
    }

    private void processLoadedDiceStickers(final String str, final boolean z, final TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet, final boolean z2, final int i) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$processLoadedDiceStickers$77(str);
            }
        });
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$processLoadedDiceStickers$80(z2, tLRPC$TL_messages_stickerSet, i, str, z);
            }
        });
    }

    public void lambda$processLoadedDiceStickers$80(boolean z, final TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet, int i, final String str, final boolean z2) {
        long j = 1000;
        if ((z && (tLRPC$TL_messages_stickerSet == null || Math.abs((System.currentTimeMillis() / 1000) - i) >= 86400)) || (!z && tLRPC$TL_messages_stickerSet == null)) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$processLoadedDiceStickers$78(str, z2);
                }
            }, (tLRPC$TL_messages_stickerSet != null || z) ? 0L : 0L);
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
                    MediaDataController.this.lambda$processLoadedDiceStickers$79(str, tLRPC$TL_messages_stickerSet);
                }
            });
        } else if (z) {
        } else {
            putDiceStickersToCache(str, null, i);
        }
    }

    public void lambda$processLoadedDiceStickers$78(String str, boolean z) {
        loadStickersByEmojiOrName(str, z, false);
    }

    public void lambda$processLoadedDiceStickers$79(String str, TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet) {
        this.diceStickerSetsByEmoji.put(str, tLRPC$TL_messages_stickerSet);
        this.diceEmojiStickerSetsById.put(tLRPC$TL_messages_stickerSet.set.id, str);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.diceStickersDidLoad, str);
    }

    private void putDiceStickersToCache(final String str, final TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet, final int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$putDiceStickersToCache$81(tLRPC$TL_messages_stickerSet, str, i);
            }
        });
    }

    public void lambda$putDiceStickersToCache$81(TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet, String str, int i) {
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

    public void loadStickers(final int i, boolean z, final boolean z2, boolean z3, final Utilities.Callback<ArrayList<TLRPC$TL_messages_stickerSet>> callback) {
        long j;
        TLRPC$TL_messages_getMaskStickers tLRPC$TL_messages_getMaskStickers;
        if (this.loadingStickers[i]) {
            if (z3) {
                this.scheduledLoadStickers[i] = new Runnable() {
                    @Override
                    public final void run() {
                        MediaDataController.this.lambda$loadStickers$82(i, z2, callback);
                    }
                };
                return;
            } else if (callback != null) {
                callback.run(null);
                return;
            } else {
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
                    MediaDataController.this.lambda$loadStickers$84(i, callback);
                }
            });
        } else if (i == 3 || i == 6) {
            char c = i != 6 ? (char) 0 : (char) 1;
            TLRPC$TL_messages_allStickers tLRPC$TL_messages_allStickers = new TLRPC$TL_messages_allStickers();
            tLRPC$TL_messages_allStickers.hash2 = this.loadFeaturedHash[c];
            int size = this.featuredStickerSets[c].size();
            for (int i2 = 0; i2 < size; i2++) {
                tLRPC$TL_messages_allStickers.sets.add(this.featuredStickerSets[c].get(i2).set);
            }
            processLoadStickersResponse(i, tLRPC$TL_messages_allStickers, new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.lambda$loadStickers$85(Utilities.Callback.this);
                }
            });
        } else if (i == 4) {
            TLRPC$TL_messages_getStickerSet tLRPC$TL_messages_getStickerSet = new TLRPC$TL_messages_getStickerSet();
            tLRPC$TL_messages_getStickerSet.stickerset = new TLRPC$TL_inputStickerSetAnimatedEmoji();
            getConnectionsManager().sendRequest(tLRPC$TL_messages_getStickerSet, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MediaDataController.this.lambda$loadStickers$88(i, callback, tLObject, tLRPC$TL_error);
                }
            });
        } else {
            if (i == 0) {
                TLRPC$TL_messages_getAllStickers tLRPC$TL_messages_getAllStickers = new TLRPC$TL_messages_getAllStickers();
                j = z2 ? 0L : this.loadHash[i];
                tLRPC$TL_messages_getAllStickers.hash = j;
                tLRPC$TL_messages_getMaskStickers = tLRPC$TL_messages_getAllStickers;
            } else if (i == 5) {
                TLRPC$TL_messages_getEmojiStickers tLRPC$TL_messages_getEmojiStickers = new TLRPC$TL_messages_getEmojiStickers();
                j = z2 ? 0L : this.loadHash[i];
                tLRPC$TL_messages_getEmojiStickers.hash = j;
                tLRPC$TL_messages_getMaskStickers = tLRPC$TL_messages_getEmojiStickers;
            } else {
                TLRPC$TL_messages_getMaskStickers tLRPC$TL_messages_getMaskStickers2 = new TLRPC$TL_messages_getMaskStickers();
                j = z2 ? 0L : this.loadHash[i];
                tLRPC$TL_messages_getMaskStickers2.hash = j;
                tLRPC$TL_messages_getMaskStickers = tLRPC$TL_messages_getMaskStickers2;
            }
            final long j2 = j;
            getConnectionsManager().sendRequest(tLRPC$TL_messages_getMaskStickers, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MediaDataController.this.lambda$loadStickers$92(i, callback, j2, tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$loadStickers$82(int i, boolean z, Utilities.Callback callback) {
        loadStickers(i, false, z, false, callback);
    }

    public void lambda$loadStickers$84(int i, final Utilities.Callback callback) {
        final ArrayList<TLRPC$TL_messages_stickerSet> arrayList = new ArrayList<>();
        int i2 = 0;
        long j = 0;
        SQLiteCursor sQLiteCursor = null;
        try {
            SQLiteDatabase database = getMessagesStorage().getDatabase();
            sQLiteCursor = database.queryFinalized("SELECT data, date, hash FROM stickers_v2 WHERE id = " + (i + 1), new Object[0]);
            if (sQLiteCursor.next()) {
                NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                if (byteBufferValue != null) {
                    int readInt32 = byteBufferValue.readInt32(false);
                    for (int i3 = 0; i3 < readInt32; i3++) {
                        arrayList.add(TLRPC$messages_StickerSet.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false));
                    }
                    byteBufferValue.reuse();
                }
                i2 = sQLiteCursor.intValue(1);
                j = calcStickersHash(arrayList);
            }
        } catch (Throwable th) {
            try {
                FileLog.e(th);
            } finally {
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
            }
        }
        processLoadedStickers(i, arrayList, true, i2, j, new Runnable() {
            @Override
            public final void run() {
                MediaDataController.lambda$loadStickers$83(Utilities.Callback.this, arrayList);
            }
        });
    }

    public static void lambda$loadStickers$83(Utilities.Callback callback, ArrayList arrayList) {
        if (callback != null) {
            callback.run(arrayList);
        }
    }

    public static void lambda$loadStickers$85(Utilities.Callback callback) {
        if (callback != null) {
            callback.run(null);
        }
    }

    public void lambda$loadStickers$88(int i, final Utilities.Callback callback, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject instanceof TLRPC$TL_messages_stickerSet) {
            ArrayList<TLRPC$TL_messages_stickerSet> arrayList = new ArrayList<>();
            arrayList.add((TLRPC$TL_messages_stickerSet) tLObject);
            processLoadedStickers(i, arrayList, false, (int) (System.currentTimeMillis() / 1000), calcStickersHash(arrayList), new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.lambda$loadStickers$86(Utilities.Callback.this);
                }
            });
            return;
        }
        processLoadedStickers(i, null, false, (int) (System.currentTimeMillis() / 1000), 0L, new Runnable() {
            @Override
            public final void run() {
                MediaDataController.lambda$loadStickers$87(Utilities.Callback.this);
            }
        });
    }

    public static void lambda$loadStickers$86(Utilities.Callback callback) {
        if (callback != null) {
            callback.run(null);
        }
    }

    public static void lambda$loadStickers$87(Utilities.Callback callback) {
        if (callback != null) {
            callback.run(null);
        }
    }

    public void lambda$loadStickers$92(final int i, final Utilities.Callback callback, final long j, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$loadStickers$91(tLObject, i, callback, j);
            }
        });
    }

    public void lambda$loadStickers$91(TLObject tLObject, int i, final Utilities.Callback callback, long j) {
        if (tLObject instanceof TLRPC$TL_messages_allStickers) {
            processLoadStickersResponse(i, (TLRPC$TL_messages_allStickers) tLObject, new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.lambda$loadStickers$89(Utilities.Callback.this);
                }
            });
        } else {
            processLoadedStickers(i, null, false, (int) (System.currentTimeMillis() / 1000), j, new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.lambda$loadStickers$90(Utilities.Callback.this);
                }
            });
        }
    }

    public static void lambda$loadStickers$89(Utilities.Callback callback) {
        if (callback != null) {
            callback.run(null);
        }
    }

    public static void lambda$loadStickers$90(Utilities.Callback callback) {
        if (callback != null) {
            callback.run(null);
        }
    }

    private void putStickersToCache(final int i, ArrayList<TLRPC$TL_messages_stickerSet> arrayList, final int i2, final long j) {
        final ArrayList arrayList2 = arrayList != null ? new ArrayList(arrayList) : null;
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$putStickersToCache$93(arrayList2, i, i2, j);
            }
        });
    }

    public void lambda$putStickersToCache$93(ArrayList arrayList, int i, int i2, long j) {
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
        TLRPC$StickerSetCovered tLRPC$StickerSetCovered = this.featuredStickerSetsById[0].get(j);
        if (tLRPC$StickerSetCovered != null) {
            return tLRPC$StickerSetCovered.set.short_name;
        }
        TLRPC$StickerSetCovered tLRPC$StickerSetCovered2 = this.featuredStickerSetsById[1].get(j);
        if (tLRPC$StickerSetCovered2 != null) {
            return tLRPC$StickerSetCovered2.set.short_name;
        }
        return null;
    }

    public static long getStickerSetId(TLRPC$Document tLRPC$Document) {
        if (tLRPC$Document == null) {
            return -1L;
        }
        for (int i = 0; i < tLRPC$Document.attributes.size(); i++) {
            TLRPC$DocumentAttribute tLRPC$DocumentAttribute = tLRPC$Document.attributes.get(i);
            if ((tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeSticker) || (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeCustomEmoji)) {
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
            if (arrayList.get(i) != null) {
                TLRPC$StickerSet tLRPC$StickerSet = arrayList.get(i).set;
                if (!tLRPC$StickerSet.archived) {
                    j = calcHash(j, tLRPC$StickerSet.hash);
                }
            }
        }
        return j;
    }

    private void processLoadedStickers(int i, ArrayList<TLRPC$TL_messages_stickerSet> arrayList, boolean z, int i2, long j) {
        processLoadedStickers(i, arrayList, z, i2, j, null);
    }

    private void processLoadedStickers(final int i, final ArrayList<TLRPC$TL_messages_stickerSet> arrayList, final boolean z, final int i2, final long j, final Runnable runnable) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$processLoadedStickers$94(i);
            }
        });
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$processLoadedStickers$98(z, arrayList, i2, j, i, runnable);
            }
        });
    }

    public void lambda$processLoadedStickers$94(int i) {
        this.loadingStickers[i] = false;
        this.stickersLoaded[i] = true;
        Runnable[] runnableArr = this.scheduledLoadStickers;
        if (runnableArr[i] != null) {
            runnableArr[i].run();
            this.scheduledLoadStickers[i] = null;
        }
    }

    public void lambda$processLoadedStickers$98(boolean z, final ArrayList arrayList, final int i, final long j, final int i2, final Runnable runnable) {
        int i3;
        String str;
        int i4;
        MediaDataController mediaDataController = this;
        ArrayList arrayList2 = arrayList;
        long j2 = 1000;
        if ((z && (arrayList2 == null || BuildVars.DEBUG_PRIVATE_VERSION || Math.abs((System.currentTimeMillis() / 1000) - i) >= 3600)) || (!z && arrayList2 == null && j == 0)) {
            Runnable runnable2 = new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$processLoadedStickers$95(arrayList, j, i2);
                }
            };
            if (arrayList2 != null || z) {
                j2 = 0;
            }
            AndroidUtilities.runOnUIThread(runnable2, j2);
            if (arrayList2 == null) {
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
        }
        if (arrayList2 == null) {
            if (z) {
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$processLoadedStickers$97(i2, i);
                }
            });
            putStickersToCache(i2, null, i, 0L);
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
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
                        int i7 = 0;
                        while (i7 < tLRPC$TL_messages_stickerSet.packs.size()) {
                            TLRPC$TL_stickerPack tLRPC$TL_stickerPack = tLRPC$TL_messages_stickerSet.packs.get(i7);
                            if (tLRPC$TL_stickerPack != null && (str = tLRPC$TL_stickerPack.emoticon) != null) {
                                String replace = str.replace("️", "");
                                tLRPC$TL_stickerPack.emoticon = replace;
                                ArrayList arrayList4 = (ArrayList) hashMap2.get(replace);
                                if (arrayList4 == null) {
                                    arrayList4 = new ArrayList();
                                    hashMap2.put(tLRPC$TL_stickerPack.emoticon, arrayList4);
                                }
                                int i8 = 0;
                                while (i8 < tLRPC$TL_stickerPack.documents.size()) {
                                    Long l = tLRPC$TL_stickerPack.documents.get(i8);
                                    HashMap hashMap3 = hashMap2;
                                    if (longSparseArray2.indexOfKey(l.longValue()) < 0) {
                                        longSparseArray2.put(l.longValue(), tLRPC$TL_stickerPack.emoticon);
                                    }
                                    TLRPC$Document tLRPC$Document2 = (TLRPC$Document) longSparseArray3.get(l.longValue());
                                    if (tLRPC$Document2 != null) {
                                        arrayList4.add(tLRPC$Document2);
                                    }
                                    i8++;
                                    hashMap2 = hashMap3;
                                }
                            }
                            i7++;
                            hashMap2 = hashMap2;
                        }
                    }
                    i5 = i3 + 1;
                    mediaDataController = this;
                    arrayList2 = arrayList;
                    hashMap2 = hashMap2;
                }
                i3 = i5;
                i5 = i3 + 1;
                mediaDataController = this;
                arrayList2 = arrayList;
                hashMap2 = hashMap2;
            }
            final HashMap hashMap4 = hashMap2;
            if (!z) {
                putStickersToCache(i2, arrayList3, i, j);
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$processLoadedStickers$96(i2, longSparseArray, hashMap, arrayList3, j, i, longSparseArray3, hashMap4, longSparseArray2, runnable);
                }
            });
        } catch (Throwable th) {
            FileLog.e(th);
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void lambda$processLoadedStickers$95(ArrayList arrayList, long j, int i) {
        if (arrayList != null && j != 0) {
            this.loadHash[i] = j;
        }
        loadStickers(i, false, false);
    }

    public void lambda$processLoadedStickers$96(int i, LongSparseArray longSparseArray, HashMap hashMap, ArrayList arrayList, long j, int i2, LongSparseArray longSparseArray2, HashMap hashMap2, LongSparseArray longSparseArray3, Runnable runnable) {
        for (int i3 = 0; i3 < this.stickerSets[i].size(); i3++) {
            TLRPC$StickerSet tLRPC$StickerSet = this.stickerSets[i].get(i3).set;
            this.stickerSetsById.remove(tLRPC$StickerSet.id);
            this.stickerSetsByName.remove(tLRPC$StickerSet.short_name);
            if (i != 3 && i != 6 && i != 4) {
                this.installedStickerSetsById.remove(tLRPC$StickerSet.id);
            }
        }
        for (int i4 = 0; i4 < longSparseArray.size(); i4++) {
            this.stickerSetsById.put(longSparseArray.keyAt(i4), (TLRPC$TL_messages_stickerSet) longSparseArray.valueAt(i4));
            if (i != 3 && i != 6 && i != 4) {
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
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i), Boolean.TRUE);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$processLoadedStickers$97(int i, int i2) {
        this.loadDate[i] = i2;
    }

    public boolean cancelRemovingStickerSet(long j) {
        Runnable runnable = this.removingStickerSetsUndos.get(j);
        if (runnable != null) {
            runnable.run();
            return true;
        }
        return false;
    }

    public void preloadStickerSetThumb(TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet) {
        TLRPC$StickerSet tLRPC$StickerSet;
        TLRPC$PhotoSize closestPhotoSizeWithSize;
        ArrayList<TLRPC$Document> arrayList;
        if (tLRPC$TL_messages_stickerSet == null || (tLRPC$StickerSet = tLRPC$TL_messages_stickerSet.set) == null || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tLRPC$StickerSet.thumbs, 90)) == null || (arrayList = tLRPC$TL_messages_stickerSet.documents) == null || arrayList.isEmpty()) {
            return;
        }
        loadStickerSetThumbInternal(closestPhotoSizeWithSize, tLRPC$TL_messages_stickerSet, arrayList.get(0), tLRPC$TL_messages_stickerSet.set.thumb_version);
    }

    public void preloadStickerSetThumb(TLRPC$StickerSetCovered tLRPC$StickerSetCovered) {
        TLRPC$StickerSet tLRPC$StickerSet;
        TLRPC$PhotoSize closestPhotoSizeWithSize;
        if (tLRPC$StickerSetCovered == null || (tLRPC$StickerSet = tLRPC$StickerSetCovered.set) == null || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tLRPC$StickerSet.thumbs, 90)) == null) {
            return;
        }
        TLRPC$Document tLRPC$Document = tLRPC$StickerSetCovered.cover;
        if (tLRPC$Document == null) {
            if (tLRPC$StickerSetCovered.covers.isEmpty()) {
                return;
            }
            tLRPC$Document = tLRPC$StickerSetCovered.covers.get(0);
        }
        loadStickerSetThumbInternal(closestPhotoSizeWithSize, tLRPC$StickerSetCovered, tLRPC$Document, tLRPC$StickerSetCovered.set.thumb_version);
    }

    private void loadStickerSetThumbInternal(TLRPC$PhotoSize tLRPC$PhotoSize, Object obj, TLRPC$Document tLRPC$Document, int i) {
        ImageLocation forSticker = ImageLocation.getForSticker(tLRPC$PhotoSize, tLRPC$Document, i);
        if (forSticker != null) {
            getFileLoader().loadFile(forSticker, obj, forSticker.imageType == 1 ? "tgs" : "webp", 3, 1);
        }
    }

    public void toggleStickerSet(Context context, TLObject tLObject, int i, BaseFragment baseFragment, boolean z, boolean z2) {
        toggleStickerSet(context, tLObject, i, baseFragment, z, z2, null);
    }

    public void toggleStickerSet(final Context context, final TLObject tLObject, final int i, final BaseFragment baseFragment, final boolean z, boolean z2, final Runnable runnable) {
        TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet;
        TLRPC$StickerSet tLRPC$StickerSet;
        final TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet2;
        int i2;
        int i3;
        if (tLObject instanceof TLRPC$TL_messages_stickerSet) {
            TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet3 = (TLRPC$TL_messages_stickerSet) tLObject;
            tLRPC$TL_messages_stickerSet2 = tLRPC$TL_messages_stickerSet3;
            tLRPC$StickerSet = tLRPC$TL_messages_stickerSet3.set;
        } else if (tLObject instanceof TLRPC$StickerSetCovered) {
            TLRPC$StickerSet tLRPC$StickerSet2 = ((TLRPC$StickerSetCovered) tLObject).set;
            if (i != 2) {
                tLRPC$TL_messages_stickerSet = this.stickerSetsById.get(tLRPC$StickerSet2.id);
                if (tLRPC$TL_messages_stickerSet == null) {
                    return;
                }
            } else {
                tLRPC$TL_messages_stickerSet = null;
            }
            tLRPC$StickerSet = tLRPC$StickerSet2;
            tLRPC$TL_messages_stickerSet2 = tLRPC$TL_messages_stickerSet;
        } else {
            throw new IllegalArgumentException("Invalid type of the given stickerSetObject: " + tLObject.getClass());
        }
        if (tLRPC$StickerSet.masks) {
            i2 = 1;
        } else {
            i2 = tLRPC$StickerSet.emojis ? 5 : 0;
        }
        tLRPC$StickerSet.archived = i == 1;
        int i4 = 0;
        while (true) {
            if (i4 >= this.stickerSets[i2].size()) {
                i3 = 0;
                break;
            }
            TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet4 = this.stickerSets[i2].get(i4);
            if (tLRPC$TL_messages_stickerSet4.set.id == tLRPC$StickerSet.id) {
                this.stickerSets[i2].remove(i4);
                if (i == 2) {
                    this.stickerSets[i2].add(0, tLRPC$TL_messages_stickerSet4);
                } else {
                    this.stickerSetsById.remove(tLRPC$TL_messages_stickerSet4.set.id);
                    this.installedStickerSetsById.remove(tLRPC$TL_messages_stickerSet4.set.id);
                    this.stickerSetsByName.remove(tLRPC$TL_messages_stickerSet4.set.short_name);
                }
                i3 = i4;
            } else {
                i4++;
            }
        }
        this.loadHash[i2] = calcStickersHash(this.stickerSets[i2]);
        putStickersToCache(i2, this.stickerSets[i2], this.loadDate[i2], this.loadHash[i2]);
        if (i == 2) {
            if (!cancelRemovingStickerSet(tLRPC$StickerSet.id)) {
                toggleStickerSetInternal(context, i, baseFragment, z, tLObject, tLRPC$StickerSet, i2, z2);
            }
        } else if (!z2 || baseFragment == null) {
            toggleStickerSetInternal(context, i, baseFragment, z, tLObject, tLRPC$StickerSet, i2, false);
        } else {
            StickerSetBulletinLayout stickerSetBulletinLayout = new StickerSetBulletinLayout(context, tLObject, i, null, baseFragment.getResourceProvider());
            final boolean[] zArr = new boolean[1];
            markSetUninstalling(tLRPC$StickerSet.id, true);
            final TLRPC$StickerSet tLRPC$StickerSet3 = tLRPC$StickerSet;
            final int i5 = i2;
            final int i6 = i3;
            final TLRPC$StickerSet tLRPC$StickerSet4 = tLRPC$StickerSet;
            final int i7 = i2;
            Bulletin.UndoButton delayedAction = new Bulletin.UndoButton(context, false).setUndoAction(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$toggleStickerSet$99(zArr, tLRPC$StickerSet3, i5, i6, tLRPC$TL_messages_stickerSet2, runnable);
                }
            }).setDelayedAction(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$toggleStickerSet$100(zArr, context, i, baseFragment, z, tLObject, tLRPC$StickerSet4, i7);
                }
            });
            stickerSetBulletinLayout.setButton(delayedAction);
            LongSparseArray<Runnable> longSparseArray = this.removingStickerSetsUndos;
            long j = tLRPC$StickerSet.id;
            Objects.requireNonNull(delayedAction);
            longSparseArray.put(j, new MediaDataController$$ExternalSyntheticLambda153(delayedAction));
            Bulletin.make(baseFragment, stickerSetBulletinLayout, 2750).show();
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i2), Boolean.TRUE);
    }

    public void lambda$toggleStickerSet$99(boolean[] zArr, TLRPC$StickerSet tLRPC$StickerSet, int i, int i2, TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet, Runnable runnable) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        markSetUninstalling(tLRPC$StickerSet.id, false);
        tLRPC$StickerSet.archived = false;
        this.stickerSets[i].add(i2, tLRPC$TL_messages_stickerSet);
        this.stickerSetsById.put(tLRPC$StickerSet.id, tLRPC$TL_messages_stickerSet);
        this.installedStickerSetsById.put(tLRPC$StickerSet.id, tLRPC$TL_messages_stickerSet);
        this.stickerSetsByName.put(tLRPC$StickerSet.short_name, tLRPC$TL_messages_stickerSet);
        this.removingStickerSetsUndos.remove(tLRPC$StickerSet.id);
        this.loadHash[i] = calcStickersHash(this.stickerSets[i]);
        putStickersToCache(i, this.stickerSets[i], this.loadDate[i], this.loadHash[i]);
        if (runnable != null) {
            runnable.run();
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i), Boolean.TRUE);
    }

    public void lambda$toggleStickerSet$100(boolean[] zArr, Context context, int i, BaseFragment baseFragment, boolean z, TLObject tLObject, TLRPC$StickerSet tLRPC$StickerSet, int i2) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        toggleStickerSetInternal(context, i, baseFragment, z, tLObject, tLRPC$StickerSet, i2, false);
    }

    public void removeMultipleStickerSets(final Context context, final BaseFragment baseFragment, final ArrayList<TLRPC$TL_messages_stickerSet> arrayList) {
        TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet;
        int i;
        if (arrayList == null || arrayList.isEmpty() || (tLRPC$TL_messages_stickerSet = arrayList.get(arrayList.size() - 1)) == null) {
            return;
        }
        TLRPC$StickerSet tLRPC$StickerSet = tLRPC$TL_messages_stickerSet.set;
        if (tLRPC$StickerSet.masks) {
            i = 1;
        } else {
            i = tLRPC$StickerSet.emojis ? 5 : 0;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).set.archived = false;
        }
        final int[] iArr = new int[arrayList.size()];
        for (int i3 = 0; i3 < this.stickerSets[i].size(); i3++) {
            TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet2 = this.stickerSets[i].get(i3);
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                } else if (tLRPC$TL_messages_stickerSet2.set.id == arrayList.get(i4).set.id) {
                    iArr[i4] = i3;
                    this.stickerSets[i].remove(i3);
                    this.stickerSetsById.remove(tLRPC$TL_messages_stickerSet2.set.id);
                    this.installedStickerSetsById.remove(tLRPC$TL_messages_stickerSet2.set.id);
                    this.stickerSetsByName.remove(tLRPC$TL_messages_stickerSet2.set.short_name);
                    break;
                } else {
                    i4++;
                }
            }
        }
        ArrayList<TLRPC$TL_messages_stickerSet>[] arrayListArr = this.stickerSets;
        ArrayList<TLRPC$TL_messages_stickerSet> arrayList2 = arrayListArr[i];
        int i5 = this.loadDate[i];
        long[] jArr = this.loadHash;
        long calcStickersHash = calcStickersHash(arrayListArr[i]);
        jArr[i] = calcStickersHash;
        putStickersToCache(i, arrayList2, i5, calcStickersHash);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i), Boolean.TRUE);
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            markSetUninstalling(arrayList.get(i6).set.id, true);
        }
        StickerSetBulletinLayout stickerSetBulletinLayout = new StickerSetBulletinLayout(context, tLRPC$TL_messages_stickerSet, arrayList.size(), 0, null, baseFragment.getResourceProvider());
        final boolean[] zArr = new boolean[1];
        final int i7 = i;
        final int i8 = i;
        Bulletin.UndoButton delayedAction = new Bulletin.UndoButton(context, false).setUndoAction(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$removeMultipleStickerSets$101(zArr, arrayList, i7, iArr);
            }
        }).setDelayedAction(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$removeMultipleStickerSets$102(zArr, arrayList, context, baseFragment, i8);
            }
        });
        stickerSetBulletinLayout.setButton(delayedAction);
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            LongSparseArray<Runnable> longSparseArray = this.removingStickerSetsUndos;
            long j = arrayList.get(i9).set.id;
            Objects.requireNonNull(delayedAction);
            longSparseArray.put(j, new MediaDataController$$ExternalSyntheticLambda153(delayedAction));
        }
        Bulletin.make(baseFragment, stickerSetBulletinLayout, 2750).show();
    }

    public void lambda$removeMultipleStickerSets$101(boolean[] zArr, ArrayList arrayList, int i, int[] iArr) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            markSetUninstalling(((TLRPC$TL_messages_stickerSet) arrayList.get(i2)).set.id, false);
            ((TLRPC$TL_messages_stickerSet) arrayList.get(i2)).set.archived = false;
            this.stickerSets[i].add(iArr[i2], (TLRPC$TL_messages_stickerSet) arrayList.get(i2));
            this.stickerSetsById.put(((TLRPC$TL_messages_stickerSet) arrayList.get(i2)).set.id, (TLRPC$TL_messages_stickerSet) arrayList.get(i2));
            this.installedStickerSetsById.put(((TLRPC$TL_messages_stickerSet) arrayList.get(i2)).set.id, (TLRPC$TL_messages_stickerSet) arrayList.get(i2));
            this.stickerSetsByName.put(((TLRPC$TL_messages_stickerSet) arrayList.get(i2)).set.short_name, (TLRPC$TL_messages_stickerSet) arrayList.get(i2));
            this.removingStickerSetsUndos.remove(((TLRPC$TL_messages_stickerSet) arrayList.get(i2)).set.id);
        }
        ArrayList<TLRPC$TL_messages_stickerSet>[] arrayListArr = this.stickerSets;
        ArrayList<TLRPC$TL_messages_stickerSet> arrayList2 = arrayListArr[i];
        int i3 = this.loadDate[i];
        long[] jArr = this.loadHash;
        long calcStickersHash = calcStickersHash(arrayListArr[i]);
        jArr[i] = calcStickersHash;
        putStickersToCache(i, arrayList2, i3, calcStickersHash);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i), Boolean.TRUE);
    }

    public void lambda$removeMultipleStickerSets$102(boolean[] zArr, ArrayList arrayList, Context context, BaseFragment baseFragment, int i) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            toggleStickerSetInternal(context, 0, baseFragment, true, (TLObject) arrayList.get(i2), ((TLRPC$TL_messages_stickerSet) arrayList.get(i2)).set, i, false);
        }
    }

    private void toggleStickerSetInternal(final Context context, int i, final BaseFragment baseFragment, final boolean z, final TLObject tLObject, final TLRPC$StickerSet tLRPC$StickerSet, final int i2, final boolean z2) {
        TLRPC$TL_inputStickerSetID tLRPC$TL_inputStickerSetID = new TLRPC$TL_inputStickerSetID();
        tLRPC$TL_inputStickerSetID.access_hash = tLRPC$StickerSet.access_hash;
        long j = tLRPC$StickerSet.id;
        tLRPC$TL_inputStickerSetID.id = j;
        if (i != 0) {
            TLRPC$TL_messages_installStickerSet tLRPC$TL_messages_installStickerSet = new TLRPC$TL_messages_installStickerSet();
            tLRPC$TL_messages_installStickerSet.stickerset = tLRPC$TL_inputStickerSetID;
            tLRPC$TL_messages_installStickerSet.archived = i == 1;
            markSetInstalling(tLRPC$StickerSet.id, true);
            getConnectionsManager().sendRequest(tLRPC$TL_messages_installStickerSet, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error) {
                    MediaDataController.this.lambda$toggleStickerSetInternal$105(tLRPC$StickerSet, baseFragment, z, i2, z2, context, tLObject, tLObject2, tLRPC$TL_error);
                }
            });
            return;
        }
        markSetUninstalling(j, true);
        TLRPC$TL_messages_uninstallStickerSet tLRPC$TL_messages_uninstallStickerSet = new TLRPC$TL_messages_uninstallStickerSet();
        tLRPC$TL_messages_uninstallStickerSet.stickerset = tLRPC$TL_inputStickerSetID;
        getConnectionsManager().sendRequest(tLRPC$TL_messages_uninstallStickerSet, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error) {
                MediaDataController.this.lambda$toggleStickerSetInternal$108(tLRPC$StickerSet, i2, tLObject2, tLRPC$TL_error);
            }
        });
    }

    public void lambda$toggleStickerSetInternal$105(final TLRPC$StickerSet tLRPC$StickerSet, final BaseFragment baseFragment, final boolean z, final int i, final boolean z2, final Context context, final TLObject tLObject, final TLObject tLObject2, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$toggleStickerSetInternal$104(tLRPC$StickerSet, tLObject2, baseFragment, z, i, tLRPC$TL_error, z2, context, tLObject);
            }
        });
    }

    public void lambda$toggleStickerSetInternal$104(final TLRPC$StickerSet tLRPC$StickerSet, TLObject tLObject, BaseFragment baseFragment, boolean z, int i, TLRPC$TL_error tLRPC$TL_error, boolean z2, Context context, TLObject tLObject2) {
        this.removingStickerSetsUndos.remove(tLRPC$StickerSet.id);
        if (tLObject instanceof TLRPC$TL_messages_stickerSetInstallResultArchive) {
            processStickerSetInstallResultArchive(baseFragment, z, i, (TLRPC$TL_messages_stickerSetInstallResultArchive) tLObject);
        }
        loadStickers(i, false, false, true, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                MediaDataController.this.lambda$toggleStickerSetInternal$103(tLRPC$StickerSet, (ArrayList) obj);
            }
        });
        if (tLRPC$TL_error == null && z2 && baseFragment != null) {
            Bulletin.make(baseFragment, new StickerSetBulletinLayout(context, tLObject2, 2, null, baseFragment.getResourceProvider()), 1500).show();
        }
    }

    public void lambda$toggleStickerSetInternal$103(TLRPC$StickerSet tLRPC$StickerSet, ArrayList arrayList) {
        markSetInstalling(tLRPC$StickerSet.id, false);
    }

    public void lambda$toggleStickerSetInternal$108(final TLRPC$StickerSet tLRPC$StickerSet, final int i, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$toggleStickerSetInternal$107(tLRPC$StickerSet, i);
            }
        });
    }

    public void lambda$toggleStickerSetInternal$107(final TLRPC$StickerSet tLRPC$StickerSet, int i) {
        this.removingStickerSetsUndos.remove(tLRPC$StickerSet.id);
        loadStickers(i, false, true, false, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                MediaDataController.this.lambda$toggleStickerSetInternal$106(tLRPC$StickerSet, (ArrayList) obj);
            }
        });
    }

    public void lambda$toggleStickerSetInternal$106(TLRPC$StickerSet tLRPC$StickerSet, ArrayList arrayList) {
        markSetUninstalling(tLRPC$StickerSet.id, false);
    }

    public void toggleStickerSets(ArrayList<TLRPC$StickerSet> arrayList, final int i, final int i2, final BaseFragment baseFragment, final boolean z) {
        int size = arrayList.size();
        ArrayList<TLRPC$InputStickerSet> arrayList2 = new ArrayList<>(size);
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            TLRPC$StickerSet tLRPC$StickerSet = arrayList.get(i3);
            TLRPC$TL_inputStickerSetID tLRPC$TL_inputStickerSetID = new TLRPC$TL_inputStickerSetID();
            tLRPC$TL_inputStickerSetID.access_hash = tLRPC$StickerSet.access_hash;
            tLRPC$TL_inputStickerSetID.id = tLRPC$StickerSet.id;
            arrayList2.add(tLRPC$TL_inputStickerSetID);
            if (i2 != 0) {
                tLRPC$StickerSet.archived = i2 == 1;
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
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i), Boolean.TRUE);
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
                MediaDataController.this.lambda$toggleStickerSets$110(i2, baseFragment, z, i, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$toggleStickerSets$110(final int i, final BaseFragment baseFragment, final boolean z, final int i2, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$toggleStickerSets$109(i, tLObject, baseFragment, z, i2);
            }
        });
    }

    public void lambda$toggleStickerSets$109(int i, TLObject tLObject, BaseFragment baseFragment, boolean z, int i2) {
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
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needAddArchivedStickers, tLRPC$TL_messages_stickerSetInstallResultArchive.sets);
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        baseFragment.showDialog(new StickersArchiveAlert(baseFragment.getParentActivity(), z ? baseFragment : null, tLRPC$TL_messages_stickerSetInstallResultArchive.sets).create());
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
        if (i2 < 0 || i2 >= this.searchResultMessages.size()) {
            return;
        }
        this.lastReturnedNum = i2;
        MessageObject messageObject = this.searchResultMessages.get(i2);
        NotificationCenter notificationCenter = getNotificationCenter();
        int i3 = NotificationCenter.chatSearchResultsAvailable;
        int[] iArr = this.messagesSearchCount;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i3, Integer.valueOf(i), Integer.valueOf(messageObject.getId()), Integer.valueOf(getMask()), Long.valueOf(messageObject.getDialogId()), Integer.valueOf(this.lastReturnedNum), Integer.valueOf(iArr[0] + iArr[1]), Boolean.TRUE);
    }

    public void loadMoreSearchMessages() {
        if (this.loadingMoreSearchMessages) {
            return;
        }
        boolean[] zArr = this.messagesSearchEndReached;
        if (zArr[0] && this.lastMergeDialogId == 0 && zArr[1]) {
            return;
        }
        int size = this.searchResultMessages.size();
        this.lastReturnedNum = this.searchResultMessages.size();
        searchMessagesInChat(null, this.lastDialogId, this.lastMergeDialogId, this.lastGuid, 1, this.lastReplyMessageId, false, this.lastSearchUser, this.lastSearchChat, false);
        this.lastReturnedNum = size;
        this.loadingMoreSearchMessages = true;
    }

    private void searchMessagesInChat(java.lang.String r25, final long r26, final long r28, final int r30, final int r31, final int r32, boolean r33, final org.telegram.tgnet.TLRPC$User r34, final org.telegram.tgnet.TLRPC$Chat r35, final boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.searchMessagesInChat(java.lang.String, long, long, int, int, int, boolean, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, boolean):void");
    }

    public void lambda$searchMessagesInChat$112(final long j, final TLRPC$TL_messages_search tLRPC$TL_messages_search, final long j2, final int i, final int i2, final int i3, final TLRPC$User tLRPC$User, final TLRPC$Chat tLRPC$Chat, final boolean z, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$searchMessagesInChat$111(j, tLObject, tLRPC$TL_messages_search, j2, i, i2, i3, tLRPC$User, tLRPC$Chat, z);
            }
        });
    }

    public void lambda$searchMessagesInChat$111(long j, TLObject tLObject, TLRPC$TL_messages_search tLRPC$TL_messages_search, long j2, int i, int i2, int i3, TLRPC$User tLRPC$User, TLRPC$Chat tLRPC$Chat, boolean z) {
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

    public void lambda$searchMessagesInChat$114(String str, final int i, final boolean z, final TLRPC$TL_messages_search tLRPC$TL_messages_search, final long j, final long j2, final int i2, final long j3, final int i3, final TLRPC$User tLRPC$User, final TLRPC$Chat tLRPC$Chat, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
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
                MediaDataController.this.lambda$searchMessagesInChat$113(i, z, tLObject, tLRPC$TL_messages_search, j, j2, i2, arrayList, j3, i3, tLRPC$User, tLRPC$Chat);
            }
        });
    }

    public void lambda$searchMessagesInChat$113(int i, boolean z, TLObject tLObject, TLRPC$TL_messages_search tLRPC$TL_messages_search, long j, long j2, int i2, ArrayList arrayList, long j3, int i3, TLRPC$User tLRPC$User, TLRPC$Chat tLRPC$Chat) {
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
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatSearchResultsLoading, Integer.valueOf(i2));
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
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatSearchResultsAvailable, Integer.valueOf(i2), 0, Integer.valueOf(getMask()), 0L, 0, 0, Boolean.valueOf(z));
                } else if (z2) {
                    if (this.lastReturnedNum >= this.searchResultMessages.size()) {
                        this.lastReturnedNum = this.searchResultMessages.size() - 1;
                    }
                    MessageObject messageObject2 = this.searchResultMessages.get(this.lastReturnedNum);
                    NotificationCenter notificationCenter = getNotificationCenter();
                    int i6 = NotificationCenter.chatSearchResultsAvailable;
                    int[] iArr = this.messagesSearchCount;
                    notificationCenter.lambda$postNotificationNameOnUIThread$1(i6, Integer.valueOf(i2), Integer.valueOf(messageObject2.getId()), Integer.valueOf(getMask()), Long.valueOf(messageObject2.getDialogId()), Integer.valueOf(this.lastReturnedNum), Integer.valueOf(iArr[0] + iArr[1]), Boolean.valueOf(z));
                }
                if (j == j2) {
                    boolean[] zArr = this.messagesSearchEndReached;
                    if (!zArr[0] || j3 == 0 || zArr[1]) {
                        return;
                    }
                    searchMessagesInChat(this.lastSearchQuery, j2, j3, i2, 0, i3, true, tLRPC$User, tLRPC$Chat, z);
                }
            }
        }
    }

    public String getLastSearchQuery() {
        return this.lastSearchQuery;
    }

    public void loadMedia(final long r17, final int r19, final int r20, final int r21, final int r22, final int r23, int r24, final int r25, final int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.loadMedia(long, int, int, int, int, int, int, int, int):void");
    }

    public void lambda$loadMedia$115(long j, int i, int i2, int i3, int i4, int i5, int i6, boolean z, int i7, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
            getMessagesController().removeDeletedMessagesFromArray(j, tLRPC$messages_Messages.messages);
            boolean z2 = false;
            if (i == 0 ? tLRPC$messages_Messages.messages.size() == 0 : tLRPC$messages_Messages.messages.size() <= 1) {
                z2 = true;
            }
            processLoadedMedia(tLRPC$messages_Messages, j, i2, i3, i, i4, i5, 0, i6, z, z2, i7);
        }
    }

    public void getMediaCounts(final long j, final int i, final int i2) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$getMediaCounts$120(i, j, i2);
            }
        });
    }

    public void lambda$getMediaCounts$120(final int r18, final long r19, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.lambda$getMediaCounts$120(int, long, int):void");
    }

    public void lambda$getMediaCounts$116(long j, int i, int[] iArr) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mediaCountsDidLoad, Long.valueOf(j), Integer.valueOf(i), iArr);
    }

    public void lambda$getMediaCounts$118(final int[] iArr, final long j, final int i, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        int i2;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (iArr[i3] < 0) {
                iArr[i3] = 0;
            }
        }
        if (tLObject != null) {
            TLRPC$Vector tLRPC$Vector = (TLRPC$Vector) tLObject;
            int size = tLRPC$Vector.objects.size();
            for (int i4 = 0; i4 < size; i4++) {
                TLRPC$TL_messages_searchCounter tLRPC$TL_messages_searchCounter = (TLRPC$TL_messages_searchCounter) tLRPC$Vector.objects.get(i4);
                TLRPC$MessagesFilter tLRPC$MessagesFilter = tLRPC$TL_messages_searchCounter.filter;
                if (tLRPC$MessagesFilter instanceof TLRPC$TL_inputMessagesFilterPhotoVideo) {
                    i2 = 0;
                } else if (tLRPC$MessagesFilter instanceof TLRPC$TL_inputMessagesFilterDocument) {
                    i2 = 1;
                } else if (tLRPC$MessagesFilter instanceof TLRPC$TL_inputMessagesFilterRoundVoice) {
                    i2 = 2;
                } else if (tLRPC$MessagesFilter instanceof TLRPC$TL_inputMessagesFilterUrl) {
                    i2 = 3;
                } else if (tLRPC$MessagesFilter instanceof TLRPC$TL_inputMessagesFilterMusic) {
                    i2 = 4;
                } else if (tLRPC$MessagesFilter instanceof TLRPC$TL_inputMessagesFilterGif) {
                    i2 = 5;
                } else if (tLRPC$MessagesFilter instanceof TLRPC$TL_inputMessagesFilterPhotos) {
                    i2 = 6;
                } else if (tLRPC$MessagesFilter instanceof TLRPC$TL_inputMessagesFilterVideo) {
                    i2 = 7;
                }
                iArr[i2] = tLRPC$TL_messages_searchCounter.count;
                putMediaCountDatabase(j, i, i2, iArr[i2]);
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$getMediaCounts$117(j, i, iArr);
            }
        });
    }

    public void lambda$getMediaCounts$117(long j, int i, int[] iArr) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mediaCountsDidLoad, Long.valueOf(j), Integer.valueOf(i), iArr);
    }

    public void lambda$getMediaCounts$119(long j, int i, int[] iArr) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mediaCountsDidLoad, Long.valueOf(j), Integer.valueOf(i), iArr);
    }

    public void getMediaCount(final long j, final int i, final int i2, final int i3, boolean z) {
        if (z || DialogObject.isEncryptedDialog(j)) {
            getMediaCountDatabase(j, i, i2, i3);
            return;
        }
        TLRPC$TL_messages_getSearchCounters tLRPC$TL_messages_getSearchCounters = new TLRPC$TL_messages_getSearchCounters();
        if (i2 == 0) {
            tLRPC$TL_messages_getSearchCounters.filters.add(new TLRPC$TL_inputMessagesFilterPhotoVideo());
        } else if (i2 == 1) {
            tLRPC$TL_messages_getSearchCounters.filters.add(new TLRPC$TL_inputMessagesFilterDocument());
        } else if (i2 == 2) {
            tLRPC$TL_messages_getSearchCounters.filters.add(new TLRPC$TL_inputMessagesFilterRoundVoice());
        } else if (i2 == 3) {
            tLRPC$TL_messages_getSearchCounters.filters.add(new TLRPC$TL_inputMessagesFilterUrl());
        } else if (i2 == 4) {
            tLRPC$TL_messages_getSearchCounters.filters.add(new TLRPC$TL_inputMessagesFilterMusic());
        } else if (i2 == 5) {
            tLRPC$TL_messages_getSearchCounters.filters.add(new TLRPC$TL_inputMessagesFilterGif());
        }
        if (i != 0) {
            tLRPC$TL_messages_getSearchCounters.top_msg_id = i;
            tLRPC$TL_messages_getSearchCounters.flags = 1 | tLRPC$TL_messages_getSearchCounters.flags;
        }
        TLRPC$InputPeer inputPeer = getMessagesController().getInputPeer(j);
        tLRPC$TL_messages_getSearchCounters.peer = inputPeer;
        if (inputPeer == null) {
            return;
        }
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tLRPC$TL_messages_getSearchCounters, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MediaDataController.this.lambda$getMediaCount$121(j, i, i2, i3, tLObject, tLRPC$TL_error);
            }
        }), i3);
    }

    public void lambda$getMediaCount$121(long j, int i, int i2, int i3, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            TLRPC$Vector tLRPC$Vector = (TLRPC$Vector) tLObject;
            if (tLRPC$Vector.objects.isEmpty()) {
                return;
            }
            processLoadedMediaCount(((TLRPC$TL_messages_searchCounter) tLRPC$Vector.objects.get(0)).count, j, i, i2, i3, false, 0);
        }
    }

    public static int getMediaType(TLRPC$Message tLRPC$Message) {
        if (tLRPC$Message == null) {
            return -1;
        }
        if (MessageObject.getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaPhoto) {
            return 0;
        }
        if (MessageObject.getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaDocument) {
            TLRPC$Document tLRPC$Document = MessageObject.getMedia(tLRPC$Message).document;
            if (tLRPC$Document == null) {
                return -1;
            }
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            for (int i = 0; i < tLRPC$Document.attributes.size(); i++) {
                TLRPC$DocumentAttribute tLRPC$DocumentAttribute = tLRPC$Document.attributes.get(i);
                if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeVideo) {
                    z = tLRPC$DocumentAttribute.round_message;
                    z3 = !z;
                    z2 = z;
                } else if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeAnimated) {
                    z4 = true;
                } else if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeAudio) {
                    z = tLRPC$DocumentAttribute.voice;
                    z6 = !z;
                } else if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeSticker) {
                    z5 = true;
                }
            }
            if (z || z2) {
                return 2;
            }
            if (!z3 || z4 || z5) {
                if (z5) {
                    return -1;
                }
                if (z4) {
                    return 5;
                }
                return z6 ? 4 : 1;
            }
            return 0;
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
        boolean z = tLRPC$Message instanceof TLRPC$TL_message_secret;
        if (!z || (!((MessageObject.getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaPhoto) || MessageObject.isVideoMessage(tLRPC$Message) || MessageObject.isGifMessage(tLRPC$Message)) || MessageObject.getMedia(tLRPC$Message).ttl_seconds == 0 || MessageObject.getMedia(tLRPC$Message).ttl_seconds > 60)) {
            return (z || !(tLRPC$Message instanceof TLRPC$TL_message) || (!((MessageObject.getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaPhoto) || (MessageObject.getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaDocument)) || MessageObject.getMedia(tLRPC$Message).ttl_seconds == 0)) && getMediaType(tLRPC$Message) != -1;
        }
        return false;
    }

    public void processLoadedMedia(final TLRPC$messages_Messages tLRPC$messages_Messages, final long j, int i, int i2, final int i3, final int i4, int i5, final int i6, final int i7, boolean z, final boolean z2, final int i8) {
        ArrayList<TLRPC$Message> arrayList;
        ArrayList<TLRPC$Message> arrayList2;
        if (BuildVars.LOGS_ENABLED) {
            int i9 = 0;
            if (tLRPC$messages_Messages != null && (arrayList2 = tLRPC$messages_Messages.messages) != null) {
                i9 = arrayList2.size();
            }
            FileLog.d("process load media messagesCount " + i9 + " did " + j + " topicId " + i5 + " count = " + i + " max_id=" + i2 + " min_id=" + i3 + " type = " + i4 + " cache = " + i6 + " classGuid = " + i7);
        }
        if (i6 != 0 && tLRPC$messages_Messages != null && (arrayList = tLRPC$messages_Messages.messages) != null && (((arrayList.isEmpty() && i3 == 0) || (tLRPC$messages_Messages.messages.size() <= 1 && i3 != 0)) && !DialogObject.isEncryptedDialog(j))) {
            if (i6 == 2) {
                return;
            }
            loadMedia(j, i, i2, i3, i4, i5, 0, i7, i8);
            return;
        }
        if (i6 == 0) {
            ImageLoader.saveMessagesThumbs(tLRPC$messages_Messages.messages);
            getMessagesStorage().putUsersAndChats(tLRPC$messages_Messages.users, tLRPC$messages_Messages.chats, true, true);
            putMediaDatabase(j, i5, i4, tLRPC$messages_Messages.messages, i2, i3, z2);
        }
        Utilities.searchQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$processLoadedMedia$125(tLRPC$messages_Messages, i6, j, i7, i4, z2, i3, i8);
            }
        });
    }

    public void lambda$processLoadedMedia$125(final TLRPC$messages_Messages tLRPC$messages_Messages, final int i, final long j, final int i2, final int i3, final boolean z, final int i4, final int i5) {
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
        final Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$processLoadedMedia$123(tLRPC$messages_Messages, i, j, arrayList, i2, i3, z, i4, i5);
            }
        };
        if (getMessagesController().getTranslateController().isFeatureAvailable()) {
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$processLoadedMedia$124(arrayList, runnable);
                }
            });
        } else {
            runnable.run();
        }
    }

    public void lambda$processLoadedMedia$123(final TLRPC$messages_Messages tLRPC$messages_Messages, final int i, final long j, final ArrayList arrayList, final int i2, final int i3, final boolean z, final int i4, final int i5) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$processLoadedMedia$122(tLRPC$messages_Messages, i, j, arrayList, i2, i3, z, i4, i5);
            }
        });
    }

    public void lambda$processLoadedMedia$122(TLRPC$messages_Messages tLRPC$messages_Messages, int i, long j, ArrayList arrayList, int i2, int i3, boolean z, int i4, int i5) {
        int i6 = tLRPC$messages_Messages.count;
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
        objArr[6] = Boolean.valueOf(i4 != 0);
        objArr[7] = Integer.valueOf(i5);
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i7, objArr);
    }

    public void lambda$processLoadedMedia$124(ArrayList arrayList, Runnable runnable) {
        for (int i = 0; i < arrayList.size(); i++) {
            MessageObject messageObject = (MessageObject) arrayList.get(i);
            TLRPC$Message messageWithCustomParamsOnlyInternal = getMessagesStorage().getMessageWithCustomParamsOnlyInternal(messageObject.getId(), messageObject.getDialogId());
            TLRPC$Message tLRPC$Message = messageObject.messageOwner;
            tLRPC$Message.translatedToLanguage = messageWithCustomParamsOnlyInternal.translatedToLanguage;
            tLRPC$Message.translatedText = messageWithCustomParamsOnlyInternal.translatedText;
            messageObject.updateTranslation();
        }
        runnable.run();
    }

    private void processLoadedMediaCount(final int i, final long j, final int i2, final int i3, final int i4, final boolean z, final int i5) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$processLoadedMediaCount$126(j, z, i, i3, i5, i2, i4);
            }
        });
    }

    public void lambda$processLoadedMediaCount$126(long r19, boolean r21, int r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.lambda$processLoadedMediaCount$126(long, boolean, int, int, int, int, int):void");
    }

    private void putMediaCountDatabase(final long j, final int i, final int i2, final int i3) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$putMediaCountDatabase$127(i, j, i2, i3);
            }
        });
    }

    public void lambda$putMediaCountDatabase$127(int i, long j, int i2, int i3) {
        SQLitePreparedStatement executeFast;
        try {
            if (i != 0) {
                executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO media_counts_topics VALUES(?, ?, ?, ?, ?)");
            } else {
                executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO media_counts_v2 VALUES(?, ?, ?, ?)");
            }
            executeFast.requery();
            int i4 = 2;
            executeFast.bindLong(1, j);
            if (i != 0) {
                executeFast.bindInteger(2, i);
                i4 = 3;
            }
            int i5 = i4 + 1;
            executeFast.bindInteger(i4, i2);
            executeFast.bindInteger(i5, i3);
            executeFast.bindInteger(i5 + 1, 0);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private void getMediaCountDatabase(final long j, final int i, final int i2, final int i3) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$getMediaCountDatabase$128(i, j, i2, i3);
            }
        });
    }

    public void lambda$getMediaCountDatabase$128(int i, long j, int i2, int i3) {
        SQLiteCursor queryFinalized;
        int i4;
        int i5;
        try {
            if (i != 0) {
                queryFinalized = getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT count, old FROM media_counts_topics WHERE uid = %d AND topic_id = %d AND type = %d LIMIT 1", Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2)), new Object[0]);
            } else {
                queryFinalized = getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT count, old FROM media_counts_v2 WHERE uid = %d AND type = %d LIMIT 1", Long.valueOf(j), Integer.valueOf(i2)), new Object[0]);
            }
            if (queryFinalized.next()) {
                i4 = queryFinalized.intValue(0);
                i5 = queryFinalized.intValue(1);
            } else {
                i4 = -1;
                i5 = 0;
            }
            queryFinalized.dispose();
            if (i4 == -1 && DialogObject.isEncryptedDialog(j)) {
                SQLiteCursor queryFinalized2 = getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT COUNT(mid) FROM media_v4 WHERE uid = %d AND type = %d LIMIT 1", Long.valueOf(j), Integer.valueOf(i2)), new Object[0]);
                if (queryFinalized2.next()) {
                    i4 = queryFinalized2.intValue(0);
                }
                int i6 = i4;
                queryFinalized2.dispose();
                if (i6 != -1) {
                    putMediaCountDatabase(j, i, i2, i6);
                }
                i4 = i6;
            }
            processLoadedMediaCount(i4, j, i, i2, i3, true, i5);
        } catch (Exception e) {
            FileLog.e(e);
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
        final int val$topicId;
        final int val$type;
        final long val$uid;

        AnonymousClass1(int i, long j, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, int i8) {
            this.val$count = i;
            this.val$uid = j;
            this.val$min_id = i2;
            this.val$topicId = i3;
            this.val$type = i4;
            this.val$max_id = i5;
            this.val$classGuid = i6;
            this.val$fromCache = i7;
            this.val$isChannel = z;
            this.val$requestIndex = i8;
        }

        @Override
        public void run() {
            MediaDataController mediaDataController;
            long j;
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            boolean z;
            int i8;
            boolean z2;
            SQLiteCursor queryFinalized;
            boolean z3;
            boolean z4;
            boolean z5;
            int i9;
            SQLiteDatabase sQLiteDatabase;
            SQLiteCursor queryFinalized2;
            int i10;
            int intValue;
            SQLitePreparedStatement executeFast;
            int i11;
            TLRPC$TL_messages_messages tLRPC$TL_messages_messages = new TLRPC$TL_messages_messages();
            try {
                try {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    int i12 = this.val$count + 1;
                    SQLiteDatabase database = MediaDataController.this.getMessagesStorage().getDatabase();
                    if (!DialogObject.isEncryptedDialog(this.val$uid)) {
                        if (this.val$min_id == 0) {
                            SQLiteCursor queryFinalized3 = this.val$topicId != 0 ? database.queryFinalized(String.format(Locale.US, "SELECT start FROM media_holes_topics WHERE uid = %d AND topic_id = %d AND type = %d AND start IN (0, 1)", Long.valueOf(this.val$uid), Integer.valueOf(this.val$topicId), Integer.valueOf(this.val$type)), new Object[0]) : database.queryFinalized(String.format(Locale.US, "SELECT start FROM media_holes_v2 WHERE uid = %d AND type = %d AND start IN (0, 1)", Long.valueOf(this.val$uid), Integer.valueOf(this.val$type)), new Object[0]);
                            if (queryFinalized3.next()) {
                                if (queryFinalized3.intValue(0) == 1) {
                                    z5 = true;
                                    queryFinalized3.dispose();
                                }
                            } else {
                                queryFinalized3.dispose();
                                queryFinalized3 = this.val$topicId != 0 ? database.queryFinalized(String.format(Locale.US, "SELECT min(mid) FROM media_topics WHERE uid = %d AND topic_id = %d AND type = %d AND mid > 0", Long.valueOf(this.val$uid), Integer.valueOf(this.val$topicId), Integer.valueOf(this.val$type)), new Object[0]) : database.queryFinalized(String.format(Locale.US, "SELECT min(mid) FROM media_v4 WHERE uid = %d AND type = %d AND mid > 0", Long.valueOf(this.val$uid), Integer.valueOf(this.val$type)), new Object[0]);
                                if (queryFinalized3.next() && (intValue = queryFinalized3.intValue(0)) != 0) {
                                    if (this.val$topicId != 0) {
                                        executeFast = database.executeFast("REPLACE INTO media_holes_topics VALUES(?, ?, ?, ?, ?)");
                                    } else {
                                        executeFast = database.executeFast("REPLACE INTO media_holes_v2 VALUES(?, ?, ?, ?)");
                                    }
                                    executeFast.requery();
                                    executeFast.bindLong(1, this.val$uid);
                                    int i13 = this.val$topicId;
                                    if (i13 != 0) {
                                        executeFast.bindInteger(2, i13);
                                        i11 = 3;
                                    } else {
                                        i11 = 2;
                                    }
                                    int i14 = i11 + 1;
                                    executeFast.bindInteger(i11, this.val$type);
                                    executeFast.bindInteger(i14, 0);
                                    executeFast.bindInteger(i14 + 1, intValue);
                                    executeFast.step();
                                    executeFast.dispose();
                                }
                            }
                            z5 = false;
                            queryFinalized3.dispose();
                        } else {
                            z5 = false;
                        }
                        if (this.val$max_id != 0) {
                            if (this.val$topicId != 0) {
                                queryFinalized2 = database.queryFinalized(String.format(Locale.US, "SELECT start, end FROM media_holes_topics WHERE uid = %d AND topic_id = %d AND type = %d AND start <= %d ORDER BY end DESC LIMIT 1", Long.valueOf(this.val$uid), Integer.valueOf(this.val$topicId), Integer.valueOf(this.val$type), Integer.valueOf(this.val$max_id)), new Object[0]);
                                sQLiteDatabase = database;
                            } else {
                                sQLiteDatabase = database;
                                queryFinalized2 = sQLiteDatabase.queryFinalized(String.format(Locale.US, "SELECT start, end FROM media_holes_v2 WHERE uid = %d AND type = %d AND start <= %d ORDER BY end DESC LIMIT 1", Long.valueOf(this.val$uid), Integer.valueOf(this.val$type), Integer.valueOf(this.val$max_id)), new Object[0]);
                            }
                            if (queryFinalized2.next()) {
                                queryFinalized2.intValue(0);
                                i10 = queryFinalized2.intValue(1);
                            } else {
                                i10 = 0;
                            }
                            queryFinalized2.dispose();
                            if (this.val$topicId != 0) {
                                if (i10 > 1) {
                                    queryFinalized = sQLiteDatabase.queryFinalized(String.format(Locale.US, "SELECT data, mid FROM media_topics WHERE uid = %d AND topic_id = %d AND mid > 0 AND mid < %d AND mid >= %d AND type = %d ORDER BY date DESC, mid DESC LIMIT %d", Long.valueOf(this.val$uid), Integer.valueOf(this.val$topicId), Integer.valueOf(this.val$max_id), Integer.valueOf(i10), Integer.valueOf(this.val$type), Integer.valueOf(i12)), new Object[0]);
                                    z5 = false;
                                } else {
                                    queryFinalized = sQLiteDatabase.queryFinalized(String.format(Locale.US, "SELECT data, mid FROM media_topics WHERE uid = %d AND topic_id = %d AND mid > 0 AND mid < %d AND type = %d ORDER BY date DESC, mid DESC LIMIT %d", Long.valueOf(this.val$uid), Integer.valueOf(this.val$topicId), Integer.valueOf(this.val$max_id), Integer.valueOf(this.val$type), Integer.valueOf(i12)), new Object[0]);
                                }
                            } else if (i10 > 1) {
                                queryFinalized = sQLiteDatabase.queryFinalized(String.format(Locale.US, "SELECT data, mid FROM media_v4 WHERE uid = %d AND mid > 0 AND mid < %d AND mid >= %d AND type = %d ORDER BY date DESC, mid DESC LIMIT %d", Long.valueOf(this.val$uid), Integer.valueOf(this.val$max_id), Integer.valueOf(i10), Integer.valueOf(this.val$type), Integer.valueOf(i12)), new Object[0]);
                                z5 = false;
                            } else {
                                queryFinalized = sQLiteDatabase.queryFinalized(String.format(Locale.US, "SELECT data, mid FROM media_v4 WHERE uid = %d AND mid > 0 AND mid < %d AND type = %d ORDER BY date DESC, mid DESC LIMIT %d", Long.valueOf(this.val$uid), Integer.valueOf(this.val$max_id), Integer.valueOf(this.val$type), Integer.valueOf(i12)), new Object[0]);
                            }
                            z4 = z5;
                        } else if (this.val$min_id != 0) {
                            SQLiteCursor queryFinalized4 = this.val$topicId != 0 ? database.queryFinalized(String.format(Locale.US, "SELECT start, end FROM media_holes_topics WHERE uid = %d AND topic_id = %d AND type = %d AND end >= %d ORDER BY end ASC LIMIT 1", Long.valueOf(this.val$uid), Integer.valueOf(this.val$topicId), Integer.valueOf(this.val$type), Integer.valueOf(this.val$min_id)), new Object[0]) : database.queryFinalized(String.format(Locale.US, "SELECT start, end FROM media_holes_v2 WHERE uid = %d AND type = %d AND end >= %d ORDER BY end ASC LIMIT 1", Long.valueOf(this.val$uid), Integer.valueOf(this.val$type), Integer.valueOf(this.val$min_id)), new Object[0]);
                            if (queryFinalized4.next()) {
                                i9 = queryFinalized4.intValue(0);
                                queryFinalized4.intValue(1);
                            } else {
                                i9 = 0;
                            }
                            queryFinalized4.dispose();
                            if (this.val$topicId != 0) {
                                if (i9 > 1) {
                                    queryFinalized = database.queryFinalized(String.format(Locale.US, "SELECT data, mid FROM media_topics WHERE uid = %d AND topic_id = %d AND mid > 0 AND mid >= %d AND mid <= %d AND type = %d ORDER BY date ASC, mid ASC LIMIT %d", Long.valueOf(this.val$uid), Integer.valueOf(this.val$topicId), Integer.valueOf(this.val$min_id), Integer.valueOf(i9), Integer.valueOf(this.val$type), Integer.valueOf(i12)), new Object[0]);
                                    z3 = true;
                                    z4 = z5;
                                } else {
                                    queryFinalized = database.queryFinalized(String.format(Locale.US, "SELECT data, mid FROM media_topics WHERE uid = %d AND topic_id = %d AND mid > 0 AND mid >= %d AND type = %d ORDER BY date ASC, mid ASC LIMIT %d", Long.valueOf(this.val$uid), Integer.valueOf(this.val$topicId), Integer.valueOf(this.val$min_id), Integer.valueOf(this.val$type), Integer.valueOf(i12)), new Object[0]);
                                    z5 = true;
                                    z3 = true;
                                    z4 = z5;
                                }
                            } else if (i9 > 1) {
                                queryFinalized = database.queryFinalized(String.format(Locale.US, "SELECT data, mid FROM media_v4 WHERE uid = %d AND mid > 0 AND mid >= %d AND mid <= %d AND type = %d ORDER BY date ASC, mid ASC LIMIT %d", Long.valueOf(this.val$uid), Integer.valueOf(this.val$min_id), Integer.valueOf(i9), Integer.valueOf(this.val$type), Integer.valueOf(i12)), new Object[0]);
                                z3 = true;
                                z4 = z5;
                            } else {
                                queryFinalized = database.queryFinalized(String.format(Locale.US, "SELECT data, mid FROM media_v4 WHERE uid = %d AND mid > 0 AND mid >= %d AND type = %d ORDER BY date ASC, mid ASC LIMIT %d", Long.valueOf(this.val$uid), Integer.valueOf(this.val$min_id), Integer.valueOf(this.val$type), Integer.valueOf(i12)), new Object[0]);
                                z5 = true;
                                z3 = true;
                                z4 = z5;
                            }
                        } else {
                            SQLiteCursor queryFinalized5 = this.val$topicId != 0 ? database.queryFinalized(String.format(Locale.US, "SELECT max(end) FROM media_holes_topics WHERE uid = %d AND topic_id = %d AND type = %d", Long.valueOf(this.val$uid), Integer.valueOf(this.val$topicId), Integer.valueOf(this.val$type)), new Object[0]) : database.queryFinalized(String.format(Locale.US, "SELECT max(end) FROM media_holes_v2 WHERE uid = %d AND type = %d", Long.valueOf(this.val$uid), Integer.valueOf(this.val$type)), new Object[0]);
                            int intValue2 = queryFinalized5.next() ? queryFinalized5.intValue(0) : 0;
                            queryFinalized5.dispose();
                            queryFinalized = this.val$topicId != 0 ? intValue2 > 1 ? database.queryFinalized(String.format(Locale.US, "SELECT data, mid FROM media_topics WHERE uid = %d AND topic_id = %d AND mid >= %d AND type = %d ORDER BY date DESC, mid DESC LIMIT %d", Long.valueOf(this.val$uid), Integer.valueOf(this.val$topicId), Integer.valueOf(intValue2), Integer.valueOf(this.val$type), Integer.valueOf(i12)), new Object[0]) : database.queryFinalized(String.format(Locale.US, "SELECT data, mid FROM media_topics WHERE uid = %d AND topic_id = %d AND mid > 0 AND type = %d ORDER BY date DESC, mid DESC LIMIT %d", Long.valueOf(this.val$uid), Integer.valueOf(this.val$topicId), Integer.valueOf(this.val$type), Integer.valueOf(i12)), new Object[0]) : intValue2 > 1 ? database.queryFinalized(String.format(Locale.US, "SELECT data, mid FROM media_v4 WHERE uid = %d AND mid >= %d AND type = %d ORDER BY date DESC, mid DESC LIMIT %d", Long.valueOf(this.val$uid), Integer.valueOf(intValue2), Integer.valueOf(this.val$type), Integer.valueOf(i12)), new Object[0]) : database.queryFinalized(String.format(Locale.US, "SELECT data, mid FROM media_v4 WHERE uid = %d AND mid > 0 AND type = %d ORDER BY date DESC, mid DESC LIMIT %d", Long.valueOf(this.val$uid), Integer.valueOf(this.val$type), Integer.valueOf(i12)), new Object[0]);
                        }
                        z3 = false;
                        z4 = z5;
                    } else {
                        if (this.val$topicId != 0) {
                            if (this.val$max_id != 0) {
                                queryFinalized = database.queryFinalized(String.format(Locale.US, "SELECT m.data, m.mid, r.random_id FROM media_topics as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = %d AND m.topic_id = %d AND m.mid > %d AND type = %d ORDER BY m.mid ASC LIMIT %d", Long.valueOf(this.val$uid), Integer.valueOf(this.val$topicId), Integer.valueOf(this.val$max_id), Integer.valueOf(this.val$type), Integer.valueOf(i12)), new Object[0]);
                            } else {
                                queryFinalized = this.val$min_id != 0 ? database.queryFinalized(String.format(Locale.US, "SELECT m.data, m.mid, r.random_id FROM media_topics as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = %d AND m.topic_id = %d AND m.mid < %d AND type = %d ORDER BY m.mid DESC LIMIT %d", Long.valueOf(this.val$uid), Integer.valueOf(this.val$topicId), Integer.valueOf(this.val$min_id), Integer.valueOf(this.val$type), Integer.valueOf(i12)), new Object[0]) : database.queryFinalized(String.format(Locale.US, "SELECT m.data, m.mid, r.random_id FROM media_topics as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = %d AND m.topic_id = %d AND type = %d ORDER BY m.mid ASC LIMIT %d", Long.valueOf(this.val$uid), Integer.valueOf(this.val$topicId), Integer.valueOf(this.val$type), Integer.valueOf(i12)), new Object[0]);
                            }
                        } else if (this.val$max_id != 0) {
                            queryFinalized = database.queryFinalized(String.format(Locale.US, "SELECT m.data, m.mid, r.random_id FROM media_v4 as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = %d AND m.mid > %d AND type = %d ORDER BY m.mid ASC LIMIT %d", Long.valueOf(this.val$uid), Integer.valueOf(this.val$max_id), Integer.valueOf(this.val$type), Integer.valueOf(i12)), new Object[0]);
                        } else {
                            queryFinalized = this.val$min_id != 0 ? database.queryFinalized(String.format(Locale.US, "SELECT m.data, m.mid, r.random_id FROM media_v4 as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = %d AND m.mid < %d AND type = %d ORDER BY m.mid DESC LIMIT %d", Long.valueOf(this.val$uid), Integer.valueOf(this.val$min_id), Integer.valueOf(this.val$type), Integer.valueOf(i12)), new Object[0]) : database.queryFinalized(String.format(Locale.US, "SELECT m.data, m.mid, r.random_id FROM media_v4 as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = %d AND type = %d ORDER BY m.mid ASC LIMIT %d", Long.valueOf(this.val$uid), Integer.valueOf(this.val$type), Integer.valueOf(i12)), new Object[0]);
                        }
                        z3 = false;
                        z4 = true;
                    }
                    while (queryFinalized.next()) {
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                        if (byteBufferValue != null) {
                            TLRPC$Message TLdeserialize = TLRPC$Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            TLdeserialize.readAttachPath(byteBufferValue, MediaDataController.this.getUserConfig().clientUserId);
                            byteBufferValue.reuse();
                            TLdeserialize.id = queryFinalized.intValue(1);
                            long j2 = this.val$uid;
                            TLdeserialize.dialog_id = j2;
                            if (DialogObject.isEncryptedDialog(j2)) {
                                TLdeserialize.random_id = queryFinalized.longValue(2);
                            }
                            if (z3) {
                                tLRPC$TL_messages_messages.messages.add(0, TLdeserialize);
                            } else {
                                tLRPC$TL_messages_messages.messages.add(TLdeserialize);
                            }
                            MessagesStorage.addUsersAndChatsFromMessage(TLdeserialize, arrayList, arrayList2, null);
                        }
                    }
                    queryFinalized.dispose();
                    if (!arrayList.isEmpty()) {
                        MediaDataController.this.getMessagesStorage().getUsersInternal(TextUtils.join(",", arrayList), tLRPC$TL_messages_messages.users);
                    }
                    if (!arrayList2.isEmpty()) {
                        MediaDataController.this.getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList2), tLRPC$TL_messages_messages.chats);
                    }
                } catch (Exception e) {
                    tLRPC$TL_messages_messages.messages.clear();
                    tLRPC$TL_messages_messages.chats.clear();
                    tLRPC$TL_messages_messages.users.clear();
                    FileLog.e(e);
                    final int i15 = this.val$classGuid;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            MediaDataController.AnonymousClass1.this.lambda$run$0(this, i15);
                        }
                    });
                    mediaDataController = MediaDataController.this;
                    j = this.val$uid;
                    i = this.val$count;
                    i2 = this.val$max_id;
                    i3 = this.val$min_id;
                    i4 = this.val$type;
                    i5 = this.val$topicId;
                    i6 = this.val$fromCache;
                    i7 = this.val$classGuid;
                    z = this.val$isChannel;
                    i8 = this.val$requestIndex;
                    z2 = false;
                }
                if (tLRPC$TL_messages_messages.messages.size() > this.val$count && this.val$min_id == 0) {
                    ArrayList<TLRPC$Message> arrayList3 = tLRPC$TL_messages_messages.messages;
                    arrayList3.remove(arrayList3.size() - 1);
                } else if (this.val$min_id == 0) {
                    z2 = z4;
                    final int i16 = this.val$classGuid;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            MediaDataController.AnonymousClass1.this.lambda$run$0(this, i16);
                        }
                    });
                    mediaDataController = MediaDataController.this;
                    j = this.val$uid;
                    i = this.val$count;
                    i2 = this.val$max_id;
                    i3 = this.val$min_id;
                    i4 = this.val$type;
                    i5 = this.val$topicId;
                    i6 = this.val$fromCache;
                    i7 = this.val$classGuid;
                    z = this.val$isChannel;
                    i8 = this.val$requestIndex;
                    mediaDataController.processLoadedMedia(tLRPC$TL_messages_messages, j, i, i2, i3, i4, i5, i6, i7, z, z2, i8);
                }
                z2 = false;
                final int i162 = this.val$classGuid;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MediaDataController.AnonymousClass1.this.lambda$run$0(this, i162);
                    }
                });
                mediaDataController = MediaDataController.this;
                j = this.val$uid;
                i = this.val$count;
                i2 = this.val$max_id;
                i3 = this.val$min_id;
                i4 = this.val$type;
                i5 = this.val$topicId;
                i6 = this.val$fromCache;
                i7 = this.val$classGuid;
                z = this.val$isChannel;
                i8 = this.val$requestIndex;
                mediaDataController.processLoadedMedia(tLRPC$TL_messages_messages, j, i, i2, i3, i4, i5, i6, i7, z, z2, i8);
            } catch (Throwable th) {
                final int i17 = this.val$classGuid;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MediaDataController.AnonymousClass1.this.lambda$run$0(this, i17);
                    }
                });
                MediaDataController.this.processLoadedMedia(tLRPC$TL_messages_messages, this.val$uid, this.val$count, this.val$max_id, this.val$min_id, this.val$type, this.val$topicId, this.val$fromCache, this.val$classGuid, this.val$isChannel, false, this.val$requestIndex);
                throw th;
            }
        }

        public void lambda$run$0(Runnable runnable, int i) {
            MediaDataController.this.getMessagesStorage().completeTaskForGuid(runnable, i);
        }
    }

    private void loadMediaDatabase(long j, int i, int i2, int i3, int i4, int i5, int i6, boolean z, int i7, int i8) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(i, j, i3, i5, i4, i2, i6, i7, z, i8);
        MessagesStorage messagesStorage = getMessagesStorage();
        messagesStorage.getStorageQueue().postRunnable(anonymousClass1);
        messagesStorage.bindTaskToGuid(anonymousClass1, i6);
    }

    private void putMediaDatabase(final long j, final int i, final int i2, final ArrayList<TLRPC$Message> arrayList, final int i3, final int i4, final boolean z) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$putMediaDatabase$129(i4, arrayList, z, j, i3, i2, i);
            }
        });
    }

    public void lambda$putMediaDatabase$129(int i, ArrayList arrayList, boolean z, long j, int i2, int i3, int i4) {
        SQLitePreparedStatement executeFast;
        if (i == 0) {
            try {
                if (arrayList.isEmpty() || z) {
                    getMessagesStorage().doneHolesInMedia(j, i2, i3, i4);
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
        if (i4 != 0) {
            executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO media_topics VALUES(?, ?, ?, ?, ?, ?)");
        } else {
            executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO media_v4 VALUES(?, ?, ?, ?, ?)");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TLRPC$Message tLRPC$Message = (TLRPC$Message) it.next();
            if (canAddMessageToMedia(tLRPC$Message)) {
                executeFast.requery();
                MessageObject.normalizeFlags(tLRPC$Message);
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLRPC$Message.getObjectSize());
                tLRPC$Message.serializeToStream(nativeByteBuffer);
                executeFast.bindInteger(1, tLRPC$Message.id);
                int i5 = 3;
                executeFast.bindLong(2, j);
                if (i4 != 0) {
                    executeFast.bindInteger(3, i4);
                    i5 = 4;
                }
                int i6 = i5 + 1;
                executeFast.bindInteger(i5, tLRPC$Message.date);
                executeFast.bindInteger(i6, i3);
                executeFast.bindByteBuffer(i6 + 1, nativeByteBuffer);
                executeFast.step();
                nativeByteBuffer.reuse();
            }
        }
        executeFast.dispose();
        if (!z || i2 != 0 || i != 0) {
            int i7 = (z && i == 0) ? 1 : ((TLRPC$Message) arrayList.get(arrayList.size() - 1)).id;
            if (i != 0) {
                getMessagesStorage().closeHolesInMedia(j, i7, ((TLRPC$Message) arrayList.get(0)).id, i3, i4);
            } else if (i2 != 0) {
                getMessagesStorage().closeHolesInMedia(j, i7, i2, i3, i4);
            } else {
                getMessagesStorage().closeHolesInMedia(j, i7, ConnectionsManager.DEFAULT_DATACENTER_ID, i3, i4);
            }
        }
        getMessagesStorage().getDatabase().commitTransaction();
    }

    public void loadMusic(final long j, final long j2, final long j3) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$loadMusic$131(j, j2, j3);
            }
        });
    }

    public void lambda$loadMusic$131(final long j, long j2, long j3) {
        SQLiteCursor queryFinalized;
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (i < 2) {
            ArrayList arrayList3 = i == 0 ? arrayList : arrayList2;
            if (i == 0) {
                try {
                    if (!DialogObject.isEncryptedDialog(j)) {
                        queryFinalized = getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT data, mid FROM media_v4 WHERE uid = %d AND mid < %d AND type = %d ORDER BY date DESC, mid DESC LIMIT 1000", Long.valueOf(j), Long.valueOf(j2), 4), new Object[0]);
                    } else {
                        queryFinalized = getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT data, mid FROM media_v4 WHERE uid = %d AND mid > %d AND type = %d ORDER BY date DESC, mid DESC LIMIT 1000", Long.valueOf(j), Long.valueOf(j2), 4), new Object[0]);
                    }
                } catch (Exception e) {
                    e = e;
                    FileLog.e(e);
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            MediaDataController.this.lambda$loadMusic$130(j, arrayList, arrayList2);
                        }
                    });
                }
            } else if (!DialogObject.isEncryptedDialog(j)) {
                queryFinalized = getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT data, mid FROM media_v4 WHERE uid = %d AND mid > %d AND type = %d ORDER BY date DESC, mid DESC LIMIT 1000", Long.valueOf(j), Long.valueOf(j3), 4), new Object[0]);
            } else {
                queryFinalized = getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT data, mid FROM media_v4 WHERE uid = %d AND mid < %d AND type = %d ORDER BY date DESC, mid DESC LIMIT 1000", Long.valueOf(j), Long.valueOf(j3), 4), new Object[0]);
            }
            while (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                if (byteBufferValue != null) {
                    TLRPC$Message TLdeserialize = TLRPC$Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    TLdeserialize.readAttachPath(byteBufferValue, getUserConfig().clientUserId);
                    byteBufferValue.reuse();
                    if (MessageObject.isMusicMessage(TLdeserialize)) {
                        TLdeserialize.id = queryFinalized.intValue(1);
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
                                    MediaDataController.this.lambda$loadMusic$130(j, arrayList, arrayList2);
                                }
                            });
                        }
                    }
                }
            }
            queryFinalized.dispose();
            i++;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$loadMusic$130(j, arrayList, arrayList2);
            }
        });
    }

    public void lambda$loadMusic$130(long j, ArrayList arrayList, ArrayList arrayList2) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.musicDidLoad, Long.valueOf(j), arrayList, arrayList2);
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
                MediaDataController.this.lambda$buildShortcuts$132(z, arrayList);
            }
        });
    }

    public void lambda$buildShortcuts$132(boolean r21, java.util.ArrayList r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.lambda$buildShortcuts$132(boolean, java.util.ArrayList):void");
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
                    MediaDataController.this.lambda$loadHints$134();
                }
            });
            this.loaded = true;
            return;
        }
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
                MediaDataController.this.lambda$loadHints$139(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadHints$134() {
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
                    MediaDataController.this.lambda$loadHints$133(arrayList3, arrayList4, arrayList, arrayList2);
                }
            });
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$loadHints$133(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        getMessagesController().putUsers(arrayList, true);
        getMessagesController().putChats(arrayList2, true);
        this.loading = false;
        this.loaded = true;
        this.hints = arrayList3;
        this.inlineBots = arrayList4;
        buildShortcuts();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadHints, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadInlineHints, new Object[0]);
        if (Math.abs(getUserConfig().lastHintsSyncTime - ((int) (System.currentTimeMillis() / 1000))) >= 86400) {
            loadHints(false);
        }
    }

    public void lambda$loadHints$139(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject instanceof TLRPC$TL_contacts_topPeers) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$loadHints$137(tLObject);
                }
            });
        } else if (tLObject instanceof TLRPC$TL_contacts_topPeersDisabled) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$loadHints$138();
                }
            });
        }
    }

    public void lambda$loadHints$137(TLObject tLObject) {
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
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadHints, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadInlineHints, new Object[0]);
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$loadHints$136(tLRPC$TL_contacts_topPeers);
            }
        });
    }

    public void lambda$loadHints$136(TLRPC$TL_contacts_topPeers tLRPC$TL_contacts_topPeers) {
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
                    MediaDataController.this.lambda$loadHints$135();
                }
            });
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$loadHints$135() {
        getUserConfig().suggestContacts = true;
        getUserConfig().lastHintsSyncTime = (int) (System.currentTimeMillis() / 1000);
        getUserConfig().saveConfig(false);
    }

    public void lambda$loadHints$138() {
        getUserConfig().suggestContacts = false;
        getUserConfig().lastHintsSyncTime = (int) (System.currentTimeMillis() / 1000);
        getUserConfig().saveConfig(false);
        clearTopPeers();
    }

    public void clearTopPeers() {
        this.hints.clear();
        this.inlineBots.clear();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadHints, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadInlineHints, new Object[0]);
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$clearTopPeers$140();
            }
        });
        buildShortcuts();
    }

    public void lambda$clearTopPeers$140() {
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
            Collections.sort(this.inlineBots, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    int lambda$increaseInlineRaiting$141;
                    lambda$increaseInlineRaiting$141 = MediaDataController.lambda$increaseInlineRaiting$141((TLRPC$TL_topPeer) obj, (TLRPC$TL_topPeer) obj2);
                    return lambda$increaseInlineRaiting$141;
                }
            });
            if (this.inlineBots.size() > 20) {
                ArrayList<TLRPC$TL_topPeer> arrayList = this.inlineBots;
                arrayList.remove(arrayList.size() - 1);
            }
            savePeer(j, 1, tLRPC$TL_topPeer.rating);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadInlineHints, new Object[0]);
        }
    }

    public static int lambda$increaseInlineRaiting$141(TLRPC$TL_topPeer tLRPC$TL_topPeer, TLRPC$TL_topPeer tLRPC$TL_topPeer2) {
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
                getConnectionsManager().sendRequest(tLRPC$TL_contacts_resetTopPeerRating, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MediaDataController.lambda$removeInline$142(tLObject, tLRPC$TL_error);
                    }
                });
                deletePeer(j, 1);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadInlineHints, new Object[0]);
                return;
            }
        }
    }

    public void removePeer(long j) {
        for (int i = 0; i < this.hints.size(); i++) {
            if (this.hints.get(i).peer.user_id == j) {
                this.hints.remove(i);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadHints, new Object[0]);
                TLRPC$TL_contacts_resetTopPeerRating tLRPC$TL_contacts_resetTopPeerRating = new TLRPC$TL_contacts_resetTopPeerRating();
                tLRPC$TL_contacts_resetTopPeerRating.category = new TLRPC$TL_topPeerCategoryCorrespondents();
                tLRPC$TL_contacts_resetTopPeerRating.peer = getMessagesController().getInputPeer(j);
                deletePeer(j, 0);
                getConnectionsManager().sendRequest(tLRPC$TL_contacts_resetTopPeerRating, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MediaDataController.lambda$removePeer$143(tLObject, tLRPC$TL_error);
                    }
                });
                return;
            }
        }
    }

    public void increasePeerRaiting(final long j) {
        TLRPC$User user;
        if (!getUserConfig().suggestContacts || !DialogObject.isUserDialog(j) || (user = getMessagesController().getUser(Long.valueOf(j))) == null || user.bot || user.self) {
            return;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$increasePeerRaiting$146(j);
            }
        });
    }

    public void lambda$increasePeerRaiting$146(final long j) {
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
                MediaDataController.this.lambda$increasePeerRaiting$145(j, d2);
            }
        });
    }

    public void lambda$increasePeerRaiting$145(long j, double d) {
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
        Collections.sort(this.hints, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                int lambda$increasePeerRaiting$144;
                lambda$increasePeerRaiting$144 = MediaDataController.lambda$increasePeerRaiting$144((TLRPC$TL_topPeer) obj, (TLRPC$TL_topPeer) obj2);
                return lambda$increasePeerRaiting$144;
            }
        });
        savePeer(j, 0, tLRPC$TL_topPeer.rating);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadHints, new Object[0]);
    }

    public static int lambda$increasePeerRaiting$144(TLRPC$TL_topPeer tLRPC$TL_topPeer, TLRPC$TL_topPeer tLRPC$TL_topPeer2) {
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
                MediaDataController.this.lambda$savePeer$147(j, i, d);
            }
        });
    }

    public void lambda$savePeer$147(long j, int i, double d) {
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
                MediaDataController.this.lambda$deletePeer$148(j, i);
            }
        });
    }

    public void lambda$deletePeer$148(long j, int i) {
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

    public static int lambda$static$149(TLRPC$MessageEntity tLRPC$MessageEntity, TLRPC$MessageEntity tLRPC$MessageEntity2) {
        int i = tLRPC$MessageEntity.offset;
        int i2 = tLRPC$MessageEntity2.offset;
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
        final TLRPC$TL_messages_search tLRPC$TL_messages_search = new TLRPC$TL_messages_search();
        tLRPC$TL_messages_search.peer = getMessagesController().getInputPeer(j);
        tLRPC$TL_messages_search.limit = 40;
        tLRPC$TL_messages_search.offset_id = i;
        tLRPC$TL_messages_search.q = "";
        tLRPC$TL_messages_search.filter = new TLRPC$TL_inputMessagesFilterPinned();
        getConnectionsManager().sendRequest(tLRPC$TL_messages_search, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MediaDataController.this.lambda$loadPinnedMessages$151(i2, tLRPC$TL_messages_search, j, i, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadPinnedMessages$151(int i, TLRPC$TL_messages_search tLRPC$TL_messages_search, final long j, int i2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        int i3;
        int i4;
        boolean z;
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
            i4 = Math.max(tLRPC$messages_Messages.count, tLRPC$messages_Messages.messages.size());
            z = z2;
        } else {
            if (i != 0) {
                arrayList.add(Integer.valueOf(i));
                i3 = 1;
            } else {
                i3 = 0;
            }
            i4 = i3;
            z = false;
        }
        getMessagesStorage().updatePinnedMessages(j, arrayList, true, i4, i2, z, hashMap);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$loadPinnedMessages$150(j);
            }
        });
    }

    public void lambda$loadPinnedMessages$150(long j) {
        this.loadingPinnedMessages.remove(j);
    }

    public void lambda$loadPinnedMessages$152(long j, long j2, ArrayList arrayList) {
        loadPinnedMessageInternal(j, j2, arrayList, false);
    }

    public ArrayList<MessageObject> loadPinnedMessages(final long j, final long j2, final ArrayList<Integer> arrayList, boolean z) {
        if (z) {
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$loadPinnedMessages$152(j, j2, arrayList);
                }
            });
            return null;
        }
        return loadPinnedMessageInternal(j, j2, arrayList, true);
    }

    private java.util.ArrayList<org.telegram.messenger.MessageObject> loadPinnedMessageInternal(final long r19, final long r21, java.util.ArrayList<java.lang.Integer> r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.loadPinnedMessageInternal(long, long, java.util.ArrayList, boolean):java.util.ArrayList");
    }

    public void lambda$loadPinnedMessageInternal$153(long r13, long r15, org.telegram.tgnet.TLRPC$TL_channels_getMessages r17, org.telegram.tgnet.TLObject r18, org.telegram.tgnet.TLRPC$TL_error r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.lambda$loadPinnedMessageInternal$153(long, long, org.telegram.tgnet.TLRPC$TL_channels_getMessages, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    public void lambda$loadPinnedMessageInternal$154(long r11, org.telegram.tgnet.TLRPC$TL_messages_getMessages r13, org.telegram.tgnet.TLObject r14, org.telegram.tgnet.TLRPC$TL_error r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.lambda$loadPinnedMessageInternal$154(long, org.telegram.tgnet.TLRPC$TL_messages_getMessages, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    private void savePinnedMessages(final long j, final ArrayList<TLRPC$Message> arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$savePinnedMessages$155(arrayList, j);
            }
        });
    }

    public void lambda$savePinnedMessages$155(ArrayList arrayList, long j) {
        try {
            getMessagesStorage().getDatabase().beginTransaction();
            SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO chat_pinned_v2 VALUES(?, ?, ?)");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                TLRPC$Message tLRPC$Message = (TLRPC$Message) arrayList.get(i);
                MessageObject.normalizeFlags(tLRPC$Message);
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
                    MediaDataController.this.lambda$broadcastPinnedMessage$156(arrayList2, z, arrayList3);
                }
            });
            int size = arrayList.size();
            int i3 = 0;
            int i4 = 0;
            while (i4 < size) {
                TLRPC$Message tLRPC$Message = arrayList.get(i4);
                if ((MessageObject.getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaDocument) || (MessageObject.getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaPhoto)) {
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
                MediaDataController.this.lambda$broadcastPinnedMessage$158(arrayList2, z, arrayList3, arrayList, arrayList4, longSparseArray, longSparseArray2);
            }
        });
        return null;
    }

    public void lambda$broadcastPinnedMessage$156(ArrayList arrayList, boolean z, ArrayList arrayList2) {
        getMessagesController().putUsers(arrayList, z);
        getMessagesController().putChats(arrayList2, z);
    }

    public void lambda$broadcastPinnedMessage$158(ArrayList arrayList, boolean z, ArrayList arrayList2, ArrayList arrayList3, final ArrayList arrayList4, LongSparseArray longSparseArray, LongSparseArray longSparseArray2) {
        getMessagesController().putUsers(arrayList, z);
        getMessagesController().putChats(arrayList2, z);
        int size = arrayList3.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            TLRPC$Message tLRPC$Message = (TLRPC$Message) arrayList3.get(i2);
            if ((MessageObject.getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaDocument) || (MessageObject.getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaPhoto)) {
                i++;
            }
            arrayList4.add(new MessageObject(this.currentAccount, tLRPC$Message, (LongSparseArray<TLRPC$User>) longSparseArray, (LongSparseArray<TLRPC$Chat>) longSparseArray2, false, i < 30));
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$broadcastPinnedMessage$157(arrayList4);
            }
        });
    }

    public void lambda$broadcastPinnedMessage$157(ArrayList arrayList) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(((MessageObject) arrayList.get(0)).getDialogId()), null, Boolean.TRUE, arrayList, 0, 0, -1, Boolean.FALSE);
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

    public void loadReplyMessagesForMessages(java.util.ArrayList<org.telegram.messenger.MessageObject> r18, final long r19, final boolean r21, int r22, final java.lang.Runnable r23, final int r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.loadReplyMessagesForMessages(java.util.ArrayList, long, boolean, int, java.lang.Runnable, int):void");
    }

    public void lambda$loadReplyMessagesForMessages$160(ArrayList arrayList, final long j, LongSparseArray longSparseArray, Runnable runnable) {
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
                            messageObject2.applyTimestampsHighlightForReplyMsg();
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
                        TLRPC$MessageReplyHeader tLRPC$MessageReplyHeader = ((MessageObject) arrayList4.get(i3)).messageOwner.reply_to;
                        if (tLRPC$MessageReplyHeader != null) {
                            tLRPC$MessageReplyHeader.reply_to_random_id = 0L;
                        }
                    }
                }
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$loadReplyMessagesForMessages$159(j, arrayList2);
                }
            });
            if (runnable != null) {
                runnable.run();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$loadReplyMessagesForMessages$159(long j, ArrayList arrayList) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.replyMessagesDidLoad, Long.valueOf(j), arrayList, 0);
    }

    public void lambda$loadReplyMessagesForMessages$166(androidx.collection.LongSparseArray r22, final int[] r23, final java.lang.Runnable r24, int r25, final androidx.collection.LongSparseArray r26, androidx.collection.LongSparseArray r27, final boolean r28, final long r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.lambda$loadReplyMessagesForMessages$166(androidx.collection.LongSparseArray, int[], java.lang.Runnable, int, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray, boolean, long):void");
    }

    public static void lambda$loadReplyMessagesForMessages$161(int[] iArr, Runnable runnable) {
        iArr[0] = iArr[0] - 1;
        if (iArr[0] != 0 || runnable == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(runnable);
    }

    public void lambda$loadReplyMessagesForMessages$163(TLRPC$TL_messages_getScheduledMessages tLRPC$TL_messages_getScheduledMessages, final long j, final long j2, final LongSparseArray longSparseArray, final boolean z, int[] iArr, Runnable runnable, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        TLRPC$TL_messages_getMessages tLRPC$TL_messages_getMessages;
        if (tLRPC$TL_error == null) {
            final TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
            int i = 0;
            while (i < tLRPC$messages_Messages.messages.size()) {
                if (tLRPC$messages_Messages.messages.get(i) instanceof TLRPC$TL_messageEmpty) {
                    tLRPC$messages_Messages.messages.remove(i);
                    i--;
                }
                i++;
            }
            if (tLRPC$messages_Messages.messages.size() < tLRPC$TL_messages_getScheduledMessages.id.size()) {
                if (j != 0) {
                    TLRPC$TL_channels_getMessages tLRPC$TL_channels_getMessages = new TLRPC$TL_channels_getMessages();
                    tLRPC$TL_channels_getMessages.channel = getMessagesController().getInputChannel(j);
                    tLRPC$TL_channels_getMessages.id = tLRPC$TL_messages_getScheduledMessages.id;
                    tLRPC$TL_messages_getMessages = tLRPC$TL_channels_getMessages;
                } else {
                    TLRPC$TL_messages_getMessages tLRPC$TL_messages_getMessages2 = new TLRPC$TL_messages_getMessages();
                    tLRPC$TL_messages_getMessages2.id = tLRPC$TL_messages_getScheduledMessages.id;
                    tLRPC$TL_messages_getMessages = tLRPC$TL_messages_getMessages2;
                }
                getConnectionsManager().sendRequest(tLRPC$TL_messages_getMessages, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error2) {
                        MediaDataController.this.lambda$loadReplyMessagesForMessages$162(tLRPC$TL_error, tLRPC$messages_Messages, j2, j, longSparseArray, z, tLObject2, tLRPC$TL_error2);
                    }
                });
            } else {
                for (int i2 = 0; i2 < tLRPC$messages_Messages.messages.size(); i2++) {
                    TLRPC$Message tLRPC$Message = tLRPC$messages_Messages.messages.get(i2);
                    if (tLRPC$Message.dialog_id == 0) {
                        tLRPC$Message.dialog_id = j2;
                    }
                }
                MessageObject.fixMessagePeer(tLRPC$messages_Messages.messages, j);
                ImageLoader.saveMessagesThumbs(tLRPC$messages_Messages.messages);
                broadcastReplyMessages(tLRPC$messages_Messages.messages, longSparseArray, tLRPC$messages_Messages.users, tLRPC$messages_Messages.chats, j2, false);
                getMessagesStorage().putUsersAndChats(tLRPC$messages_Messages.users, tLRPC$messages_Messages.chats, true, true);
                saveReplyMessages(longSparseArray, tLRPC$messages_Messages.messages, z);
            }
        }
        iArr[0] = iArr[0] - 1;
        if (iArr[0] != 0 || runnable == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(runnable);
    }

    public void lambda$loadReplyMessagesForMessages$162(TLRPC$TL_error tLRPC$TL_error, TLRPC$messages_Messages tLRPC$messages_Messages, long j, long j2, LongSparseArray longSparseArray, boolean z, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error2) {
        if (tLRPC$TL_error == null) {
            TLRPC$messages_Messages tLRPC$messages_Messages2 = (TLRPC$messages_Messages) tLObject;
            tLRPC$messages_Messages.messages.addAll(tLRPC$messages_Messages2.messages);
            tLRPC$messages_Messages.users.addAll(tLRPC$messages_Messages2.users);
            tLRPC$messages_Messages.chats.addAll(tLRPC$messages_Messages2.chats);
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
    }

    public void lambda$loadReplyMessagesForMessages$164(long j, long j2, LongSparseArray longSparseArray, boolean z, int[] iArr, Runnable runnable, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
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
        iArr[0] = iArr[0] - 1;
        if (iArr[0] != 0 || runnable == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(runnable);
    }

    public void lambda$loadReplyMessagesForMessages$165(long j, LongSparseArray longSparseArray, boolean z, int[] iArr, Runnable runnable, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
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
        iArr[0] = iArr[0] - 1;
        if (iArr[0] != 0 || runnable == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(runnable);
    }

    private void saveReplyMessages(final LongSparseArray<SparseArray<ArrayList<MessageObject>>> longSparseArray, final ArrayList<TLRPC$Message> arrayList, final boolean z) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$saveReplyMessages$167(z, arrayList, longSparseArray);
            }
        });
    }

    public void lambda$saveReplyMessages$167(boolean z, ArrayList arrayList, LongSparseArray longSparseArray) {
        SQLitePreparedStatement executeFast;
        ArrayList arrayList2;
        try {
            getMessagesStorage().getDatabase().beginTransaction();
            SQLitePreparedStatement sQLitePreparedStatement = null;
            if (z) {
                executeFast = getMessagesStorage().getDatabase().executeFast("UPDATE scheduled_messages_v2 SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
            } else {
                executeFast = getMessagesStorage().getDatabase().executeFast("UPDATE messages_v2 SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                sQLitePreparedStatement = getMessagesStorage().getDatabase().executeFast("UPDATE messages_topics SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
            }
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC$Message tLRPC$Message = (TLRPC$Message) arrayList.get(i);
                SparseArray sparseArray = (SparseArray) longSparseArray.get(MessageObject.getDialogId(tLRPC$Message));
                if (sparseArray != null && (arrayList2 = (ArrayList) sparseArray.get(tLRPC$Message.id)) != null) {
                    MessageObject.normalizeFlags(tLRPC$Message);
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLRPC$Message.getObjectSize());
                    tLRPC$Message.serializeToStream(nativeByteBuffer);
                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                        MessageObject messageObject = (MessageObject) arrayList2.get(i2);
                        int i3 = 0;
                        while (i3 < 2) {
                            SQLitePreparedStatement sQLitePreparedStatement2 = i3 == 0 ? executeFast : sQLitePreparedStatement;
                            if (sQLitePreparedStatement2 != null) {
                                sQLitePreparedStatement2.requery();
                                sQLitePreparedStatement2.bindByteBuffer(1, nativeByteBuffer);
                                sQLitePreparedStatement2.bindInteger(2, tLRPC$Message.id);
                                sQLitePreparedStatement2.bindInteger(3, messageObject.getId());
                                sQLitePreparedStatement2.bindLong(4, messageObject.getDialogId());
                                sQLitePreparedStatement2.step();
                            }
                            i3++;
                        }
                    }
                    nativeByteBuffer.reuse();
                }
            }
            executeFast.dispose();
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
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
                MediaDataController.this.lambda$broadcastReplyMessages$168(arrayList2, z, arrayList3, arrayList4, longSparseArray, j);
            }
        });
    }

    public void lambda$broadcastReplyMessages$168(ArrayList arrayList, boolean z, ArrayList arrayList2, ArrayList arrayList3, LongSparseArray longSparseArray, long j) {
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
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.replyMessagesDidLoad, Long.valueOf(j), arrayList3, longSparseArray);
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

    public static void addAnimatedEmojiSpans(ArrayList<TLRPC$MessageEntity> arrayList, CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt) {
        AnimatedEmojiSpan[] animatedEmojiSpanArr;
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
            TLRPC$MessageEntity tLRPC$MessageEntity = arrayList.get(i);
            if (tLRPC$MessageEntity instanceof TLRPC$TL_messageEntityCustomEmoji) {
                TLRPC$TL_messageEntityCustomEmoji tLRPC$TL_messageEntityCustomEmoji = (TLRPC$TL_messageEntityCustomEmoji) tLRPC$MessageEntity;
                int i2 = tLRPC$MessageEntity.offset;
                int i3 = tLRPC$MessageEntity.length + i2;
                if (i2 < i3 && i3 <= spannable.length()) {
                    if (tLRPC$TL_messageEntityCustomEmoji.document != null) {
                        animatedEmojiSpan = new AnimatedEmojiSpan(tLRPC$TL_messageEntityCustomEmoji.document, fontMetricsInt);
                    } else {
                        animatedEmojiSpan = new AnimatedEmojiSpan(tLRPC$TL_messageEntityCustomEmoji.document_id, fontMetricsInt);
                    }
                    spannable.setSpan(animatedEmojiSpan, i2, i3, 33);
                }
            }
        }
    }

    public static ArrayList<TextStyleSpan.TextStyleRun> getTextStyleRuns(ArrayList<TLRPC$MessageEntity> arrayList, CharSequence charSequence, int i) {
        int i2;
        ArrayList<TextStyleSpan.TextStyleRun> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList(arrayList);
        Collections.sort(arrayList3, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                int lambda$getTextStyleRuns$169;
                lambda$getTextStyleRuns$169 = MediaDataController.lambda$getTextStyleRuns$169((TLRPC$MessageEntity) obj, (TLRPC$MessageEntity) obj2);
                return lambda$getTextStyleRuns$169;
            }
        });
        int size = arrayList3.size();
        for (int i3 = 0; i3 < size; i3++) {
            TLRPC$MessageEntity tLRPC$MessageEntity = (TLRPC$MessageEntity) arrayList3.get(i3);
            if (tLRPC$MessageEntity != null && tLRPC$MessageEntity.length > 0 && (i2 = tLRPC$MessageEntity.offset) >= 0 && i2 < charSequence.length()) {
                if (tLRPC$MessageEntity.offset + tLRPC$MessageEntity.length > charSequence.length()) {
                    tLRPC$MessageEntity.length = charSequence.length() - tLRPC$MessageEntity.offset;
                }
                if (!(tLRPC$MessageEntity instanceof TLRPC$TL_messageEntityCustomEmoji)) {
                    TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
                    int i4 = tLRPC$MessageEntity.offset;
                    textStyleRun.start = i4;
                    textStyleRun.end = i4 + tLRPC$MessageEntity.length;
                    if (tLRPC$MessageEntity instanceof TLRPC$TL_messageEntitySpoiler) {
                        textStyleRun.flags = LiteMode.FLAG_CHAT_BLUR;
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
                        textStyleRun.flags = 128;
                        textStyleRun.urlEntity = tLRPC$MessageEntity;
                    }
                    if (tLRPC$MessageEntity instanceof TLRPC$TL_messageEntityTextUrl) {
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
        }
        return arrayList2;
    }

    public static int lambda$getTextStyleRuns$169(TLRPC$MessageEntity tLRPC$MessageEntity, TLRPC$MessageEntity tLRPC$MessageEntity2) {
        int i = tLRPC$MessageEntity.offset;
        int i2 = tLRPC$MessageEntity2.offset;
        if (i > i2) {
            return 1;
        }
        return i < i2 ? -1 : 0;
    }

    public void addStyle(int i, int i2, int i3, ArrayList<TLRPC$MessageEntity> arrayList) {
        if ((i & LiteMode.FLAG_CHAT_BLUR) != 0) {
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

    public static TLRPC$MessageEntity lambda$getEntities$170(Void r0) {
        return new TLRPC$TL_messageEntityBold();
    }

    public static TLRPC$MessageEntity lambda$getEntities$171(Void r0) {
        return new TLRPC$TL_messageEntityItalic();
    }

    public static TLRPC$MessageEntity lambda$getEntities$172(Void r0) {
        return new TLRPC$TL_messageEntitySpoiler();
    }

    public static TLRPC$MessageEntity lambda$getEntities$173(Void r0) {
        return new TLRPC$TL_messageEntityStrike();
    }

    private CharSequence parsePattern(CharSequence charSequence, Pattern pattern, ArrayList<TLRPC$MessageEntity> arrayList, GenericProvider<Void, TLRPC$MessageEntity> genericProvider) {
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
                int length = group.length();
                provide.length = length;
                int i2 = provide.offset;
                removeOffset4After(i2, length + i2, arrayList);
                arrayList.add(provide);
            }
            i += (matcher.end() - matcher.start()) - group.length();
        }
        return charSequence;
    }

    private static void removeOffset4After(int i, int i2, ArrayList<TLRPC$MessageEntity> arrayList) {
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            TLRPC$MessageEntity tLRPC$MessageEntity = arrayList.get(i3);
            int i4 = tLRPC$MessageEntity.offset;
            if (i4 > i2) {
                tLRPC$MessageEntity.offset = i4 - 4;
            } else if (i4 > i) {
                tLRPC$MessageEntity.offset = i4 - 2;
            }
        }
    }

    public void loadDraftsIfNeed() {
        if (getUserConfig().draftsLoaded || this.loadingDrafts) {
            return;
        }
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
                MediaDataController.this.lambda$loadDraftsIfNeed$176(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadDraftsIfNeed$174() {
        this.loadingDrafts = false;
    }

    public void lambda$loadDraftsIfNeed$176(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$loadDraftsIfNeed$174();
                }
            });
            return;
        }
        getMessagesController().processUpdates((TLRPC$Updates) tLObject, false);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$loadDraftsIfNeed$175();
            }
        });
    }

    public void lambda$loadDraftsIfNeed$175() {
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

    public Pair<Integer, TLRPC$DraftMessage> getOneThreadDraft(long j) {
        SparseArray<TLRPC$DraftMessage> sparseArray = this.drafts.get(j);
        if (sparseArray != null && sparseArray.size() > 0) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (sparseArray.keyAt(i) != 0) {
                    return new Pair<>(Integer.valueOf(sparseArray.keyAt(i)), sparseArray.valueAt(i));
                }
            }
        }
        return null;
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
        TLRPC$DraftMessage tLRPC$TL_draftMessage;
        TLRPC$Message tLRPC$Message2 = (getMessagesController().isForum(j) && i == 0) ? null : tLRPC$Message;
        if (!TextUtils.isEmpty(charSequence) || tLRPC$Message2 != null) {
            tLRPC$TL_draftMessage = new TLRPC$TL_draftMessage();
        } else {
            tLRPC$TL_draftMessage = new TLRPC$TL_draftMessageEmpty();
        }
        TLRPC$DraftMessage tLRPC$DraftMessage = tLRPC$TL_draftMessage;
        tLRPC$DraftMessage.date = (int) (System.currentTimeMillis() / 1000);
        tLRPC$DraftMessage.message = charSequence == null ? "" : charSequence.toString();
        tLRPC$DraftMessage.no_webpage = z;
        if (tLRPC$Message2 != null) {
            tLRPC$DraftMessage.reply_to_msg_id = tLRPC$Message2.id;
            tLRPC$DraftMessage.flags |= 1;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            tLRPC$DraftMessage.entities = arrayList;
            tLRPC$DraftMessage.flags |= 8;
        }
        SparseArray<TLRPC$DraftMessage> sparseArray = this.drafts.get(j);
        TLRPC$DraftMessage tLRPC$DraftMessage2 = sparseArray == null ? null : sparseArray.get(i);
        if (!z2) {
            if (tLRPC$DraftMessage2 != null && tLRPC$DraftMessage2.message.equals(tLRPC$DraftMessage.message) && tLRPC$DraftMessage2.reply_to_msg_id == tLRPC$DraftMessage.reply_to_msg_id && tLRPC$DraftMessage2.no_webpage == tLRPC$DraftMessage.no_webpage) {
                return;
            }
            if (tLRPC$DraftMessage2 == null && TextUtils.isEmpty(tLRPC$DraftMessage.message) && tLRPC$DraftMessage.reply_to_msg_id == 0) {
                return;
            }
        }
        saveDraft(j, i, tLRPC$DraftMessage, tLRPC$Message2, false);
        if (i == 0 || ChatObject.isForum(this.currentAccount, j)) {
            if (!DialogObject.isEncryptedDialog(j)) {
                TLRPC$TL_messages_saveDraft tLRPC$TL_messages_saveDraft = new TLRPC$TL_messages_saveDraft();
                TLRPC$InputPeer inputPeer = getMessagesController().getInputPeer(j);
                tLRPC$TL_messages_saveDraft.peer = inputPeer;
                if (inputPeer == null) {
                    return;
                }
                if (i != 0) {
                    tLRPC$TL_messages_saveDraft.top_msg_id = i;
                }
                tLRPC$TL_messages_saveDraft.message = tLRPC$DraftMessage.message;
                tLRPC$TL_messages_saveDraft.no_webpage = tLRPC$DraftMessage.no_webpage;
                tLRPC$TL_messages_saveDraft.reply_to_msg_id = tLRPC$DraftMessage.reply_to_msg_id;
                tLRPC$TL_messages_saveDraft.entities = tLRPC$DraftMessage.entities;
                tLRPC$TL_messages_saveDraft.flags = tLRPC$DraftMessage.flags;
                getConnectionsManager().sendRequest(tLRPC$TL_messages_saveDraft, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MediaDataController.lambda$saveDraft$177(tLObject, tLRPC$TL_error);
                    }
                });
            }
            getMessagesController().sortDialogs(null);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
        }
    }

    public void saveDraft(final long j, final int i, TLRPC$DraftMessage tLRPC$DraftMessage, TLRPC$Message tLRPC$Message, boolean z) {
        StringBuilder sb;
        TLRPC$Chat chat;
        String str;
        if (getMessagesController().isForum(j) && i == 0 && TextUtils.isEmpty(tLRPC$DraftMessage.message)) {
            tLRPC$DraftMessage.reply_to_msg_id = 0;
        }
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
        if (z) {
            if (i == 0 || getMessagesController().isForum(j)) {
                if (tLRPC$DraftMessage != null && tLRPC$DraftMessage.reply_to_msg_id != 0 && tLRPC$Message == null) {
                    TLRPC$Chat tLRPC$Chat = null;
                    if (DialogObject.isUserDialog(j)) {
                        tLRPC$Chat = getMessagesController().getUser(Long.valueOf(j));
                        chat = tLRPC$Chat;
                    } else {
                        chat = getMessagesController().getChat(Long.valueOf(-j));
                    }
                    if (tLRPC$Chat != null || chat != null) {
                        final long j2 = ChatObject.isChannel(chat) ? chat.id : 0L;
                        final int i2 = tLRPC$DraftMessage.reply_to_msg_id;
                        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                            @Override
                            public final void run() {
                                MediaDataController.this.lambda$saveDraft$180(i2, j, j2, i);
                            }
                        });
                    }
                }
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newDraftReceived, Long.valueOf(j));
            }
        }
    }

    public void lambda$saveDraft$180(int i, final long j, long j2, final int i2) {
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
                        MediaDataController.this.lambda$saveDraft$178(j, i2, tLObject, tLRPC$TL_error);
                    }
                });
            } else {
                TLRPC$TL_messages_getMessages tLRPC$TL_messages_getMessages = new TLRPC$TL_messages_getMessages();
                tLRPC$TL_messages_getMessages.id.add(Integer.valueOf(i));
                getConnectionsManager().sendRequest(tLRPC$TL_messages_getMessages, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MediaDataController.this.lambda$saveDraft$179(j, i2, tLObject, tLRPC$TL_error);
                    }
                });
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$saveDraft$178(long j, int i, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
            if (tLRPC$messages_Messages.messages.isEmpty()) {
                return;
            }
            saveDraftReplyMessage(j, i, tLRPC$messages_Messages.messages.get(0));
        }
    }

    public void lambda$saveDraft$179(long j, int i, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
            if (tLRPC$messages_Messages.messages.isEmpty()) {
                return;
            }
            saveDraftReplyMessage(j, i, tLRPC$messages_Messages.messages.get(0));
        }
    }

    private void saveDraftReplyMessage(final long j, final int i, final TLRPC$Message tLRPC$Message) {
        if (tLRPC$Message == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$saveDraftReplyMessage$181(j, i, tLRPC$Message);
            }
        });
    }

    public void lambda$saveDraftReplyMessage$181(long j, int i, TLRPC$Message tLRPC$Message) {
        String str;
        SparseArray<TLRPC$DraftMessage> sparseArray = this.drafts.get(j);
        TLRPC$DraftMessage tLRPC$DraftMessage = sparseArray != null ? sparseArray.get(i) : null;
        if (tLRPC$DraftMessage == null || tLRPC$DraftMessage.reply_to_msg_id != tLRPC$Message.id) {
            return;
        }
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
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newDraftReceived, Long.valueOf(j));
        serializedData.cleanup();
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

    public void cleanDraft(long j, int i, boolean z) {
        SparseArray<TLRPC$DraftMessage> sparseArray = this.drafts.get(j);
        TLRPC$DraftMessage tLRPC$DraftMessage = sparseArray != null ? sparseArray.get(i) : null;
        if (tLRPC$DraftMessage == null) {
            return;
        }
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
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
                return;
            }
            this.draftPreferences.edit().remove("t_" + j + "_" + i).remove("rt_" + j + "_" + i).commit();
        } else if (tLRPC$DraftMessage.reply_to_msg_id != 0) {
            tLRPC$DraftMessage.reply_to_msg_id = 0;
            tLRPC$DraftMessage.flags &= -2;
            saveDraft(j, i, tLRPC$DraftMessage.message, tLRPC$DraftMessage.entities, null, tLRPC$DraftMessage.no_webpage, true);
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
                MediaDataController.this.lambda$clearBotKeyboard$182(arrayList, topicKey);
            }
        });
    }

    public void lambda$clearBotKeyboard$182(ArrayList arrayList, MessagesStorage.TopicKey topicKey) {
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
            int intValue = ((Integer) arrayList.get(i)).intValue();
            long j = intValue;
            MessagesStorage.TopicKey topicKey2 = this.botKeyboardsByMids.get(j);
            if (topicKey2 != null) {
                this.botKeyboards.remove(topicKey2);
                ArrayList<TLRPC$Message> arrayList2 = this.botDialogKeyboards.get(topicKey2.dialogId);
                if (arrayList2 != null) {
                    int i2 = 0;
                    while (i2 < arrayList2.size()) {
                        TLRPC$Message tLRPC$Message = arrayList2.get(i2);
                        if (tLRPC$Message == null || tLRPC$Message.id == intValue) {
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

    public void clearBotKeyboard(final long j) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$clearBotKeyboard$183(j);
            }
        });
    }

    public void lambda$clearBotKeyboard$183(long j) {
        ArrayList<TLRPC$Message> arrayList = this.botDialogKeyboards.get(j);
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                MessagesStorage.TopicKey of = MessagesStorage.TopicKey.of(j, MessageObject.getTopicId(arrayList.get(i), ChatObject.isForum(this.currentAccount, j)));
                this.botKeyboards.remove(of);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botKeyboardDidLoad, null, of);
            }
        }
        this.botDialogKeyboards.remove(j);
    }

    public void loadBotKeyboard(final MessagesStorage.TopicKey topicKey) {
        TLRPC$Message tLRPC$Message = this.botKeyboards.get(topicKey);
        if (tLRPC$Message != null) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botKeyboardDidLoad, tLRPC$Message, topicKey);
        } else {
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$loadBotKeyboard$185(topicKey);
                }
            });
        }
    }

    public void lambda$loadBotKeyboard$185(final MessagesStorage.TopicKey topicKey) {
        SQLiteCursor queryFinalized;
        NativeByteBuffer byteBufferValue;
        final TLRPC$Message tLRPC$Message = null;
        try {
            if (topicKey.topicId != 0) {
                queryFinalized = getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT info FROM bot_keyboard_topics WHERE uid = %d AND tid = %d", Long.valueOf(topicKey.dialogId), Integer.valueOf(topicKey.topicId)), new Object[0]);
            } else {
                queryFinalized = getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT info FROM bot_keyboard WHERE uid = %d", Long.valueOf(topicKey.dialogId)), new Object[0]);
            }
            if (queryFinalized.next() && !queryFinalized.isNull(0) && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                tLRPC$Message = TLRPC$Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                byteBufferValue.reuse();
            }
            queryFinalized.dispose();
            if (tLRPC$Message != null) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MediaDataController.this.lambda$loadBotKeyboard$184(tLRPC$Message, topicKey);
                    }
                });
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$loadBotKeyboard$184(TLRPC$Message tLRPC$Message, MessagesStorage.TopicKey topicKey) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botKeyboardDidLoad, tLRPC$Message, topicKey);
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
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botInfoDidLoad, tLRPC$BotInfo, Integer.valueOf(i));
                return;
            }
        }
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$loadBotInfo$187(j, j2, i);
            }
        });
    }

    public void lambda$loadBotInfo$187(long j, long j2, final int i) {
        try {
            final TLRPC$BotInfo loadBotInfoInternal = loadBotInfoInternal(j, j2);
            if (loadBotInfoInternal != null) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MediaDataController.this.lambda$loadBotInfo$186(loadBotInfoInternal, i);
                    }
                });
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$loadBotInfo$186(TLRPC$BotInfo tLRPC$BotInfo, int i) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botInfoDidLoad, tLRPC$BotInfo, Integer.valueOf(i));
    }

    public void putBotKeyboard(final MessagesStorage.TopicKey topicKey, final TLRPC$Message tLRPC$Message) {
        SQLiteCursor queryFinalized;
        SQLitePreparedStatement executeFast;
        if (topicKey == null) {
            return;
        }
        try {
            if (topicKey.topicId != 0) {
                queryFinalized = getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT mid FROM bot_keyboard_topics WHERE uid = %d AND tid = %d", Long.valueOf(topicKey.dialogId), Integer.valueOf(topicKey.topicId)), new Object[0]);
            } else {
                queryFinalized = getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT mid FROM bot_keyboard WHERE uid = %d", Long.valueOf(topicKey.dialogId)), new Object[0]);
            }
            int intValue = queryFinalized.next() ? queryFinalized.intValue(0) : 0;
            queryFinalized.dispose();
            if (intValue >= tLRPC$Message.id) {
                return;
            }
            if (topicKey.topicId != 0) {
                executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO bot_keyboard_topics VALUES(?, ?, ?, ?)");
            } else {
                executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO bot_keyboard VALUES(?, ?, ?)");
            }
            executeFast.requery();
            MessageObject.normalizeFlags(tLRPC$Message);
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLRPC$Message.getObjectSize());
            tLRPC$Message.serializeToStream(nativeByteBuffer);
            if (topicKey.topicId != 0) {
                executeFast.bindLong(1, topicKey.dialogId);
                executeFast.bindInteger(2, topicKey.topicId);
                executeFast.bindInteger(3, tLRPC$Message.id);
                executeFast.bindByteBuffer(4, nativeByteBuffer);
            } else {
                executeFast.bindLong(1, topicKey.dialogId);
                executeFast.bindInteger(2, tLRPC$Message.id);
                executeFast.bindByteBuffer(3, nativeByteBuffer);
            }
            executeFast.step();
            nativeByteBuffer.reuse();
            executeFast.dispose();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$putBotKeyboard$188(topicKey, tLRPC$Message);
                }
            });
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$putBotKeyboard$188(MessagesStorage.TopicKey topicKey, TLRPC$Message tLRPC$Message) {
        TLRPC$Message tLRPC$Message2 = this.botKeyboards.get(topicKey);
        this.botKeyboards.put(topicKey, tLRPC$Message);
        ArrayList<TLRPC$Message> arrayList = this.botDialogKeyboards.get(topicKey.dialogId);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        arrayList.add(tLRPC$Message);
        this.botDialogKeyboards.put(topicKey.dialogId, arrayList);
        if (MessageObject.getChannelId(tLRPC$Message) == 0) {
            if (tLRPC$Message2 != null) {
                this.botKeyboardsByMids.delete(tLRPC$Message2.id);
            }
            this.botKeyboardsByMids.put(tLRPC$Message.id, topicKey);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botKeyboardDidLoad, tLRPC$Message, topicKey);
    }

    public void putBotInfo(final long j, final TLRPC$BotInfo tLRPC$BotInfo) {
        if (tLRPC$BotInfo == null) {
            return;
        }
        HashMap<String, TLRPC$BotInfo> hashMap = this.botInfos;
        hashMap.put(tLRPC$BotInfo.user_id + "_" + j, tLRPC$BotInfo);
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$putBotInfo$189(tLRPC$BotInfo, j);
            }
        });
    }

    public void lambda$putBotInfo$189(TLRPC$BotInfo tLRPC$BotInfo, long j) {
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
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botInfoDidLoad, tLRPC$BotInfo, 0);
        }
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$updateBotInfo$190(tLRPC$TL_updateBotCommands, j);
            }
        });
    }

    public void lambda$updateBotInfo$190(TLRPC$TL_updateBotCommands tLRPC$TL_updateBotCommands, long j) {
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

    public List<TLRPC$TL_availableReaction> getEnabledReactionsList() {
        return this.enabledReactionsList;
    }

    public void uploadRingtone(String str) {
        if (this.ringtoneUploaderHashMap.containsKey(str)) {
            return;
        }
        this.ringtoneUploaderHashMap.put(str, new RingtoneUploader(str, this.currentAccount));
        this.ringtoneDataStore.addUploadingTone(str);
    }

    public void onRingtoneUploaded(String str, TLRPC$Document tLRPC$Document, boolean z) {
        this.ringtoneUploaderHashMap.remove(str);
        this.ringtoneDataStore.onRingtoneUploaded(str, tLRPC$Document, z);
    }

    public void checkRingtones(boolean z) {
        this.ringtoneDataStore.loadUserRingtones(z);
    }

    public boolean saveToRingtones(final TLRPC$Document tLRPC$Document) {
        if (tLRPC$Document == null) {
            return false;
        }
        if (this.ringtoneDataStore.contains(tLRPC$Document.id)) {
            return true;
        }
        if (tLRPC$Document.size > MessagesController.getInstance(this.currentAccount).ringtoneSizeMax) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneSizeMax / 1024)));
            return false;
        }
        for (int i = 0; i < tLRPC$Document.attributes.size(); i++) {
            TLRPC$DocumentAttribute tLRPC$DocumentAttribute = tLRPC$Document.attributes.get(i);
            if ((tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeAudio) && tLRPC$DocumentAttribute.duration > MessagesController.getInstance(this.currentAccount).ringtoneDurationMax) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).ringtoneDurationMax)));
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
                MediaDataController.this.lambda$saveToRingtones$192(tLRPC$Document, tLObject, tLRPC$TL_error);
            }
        });
        return true;
    }

    public void lambda$saveToRingtones$192(final TLRPC$Document tLRPC$Document, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$saveToRingtones$191(tLObject, tLRPC$Document);
            }
        });
    }

    public void lambda$saveToRingtones$191(TLObject tLObject, TLRPC$Document tLRPC$Document) {
        if (tLObject != null) {
            if (tLObject instanceof TLRPC$TL_account_savedRingtoneConverted) {
                this.ringtoneDataStore.addTone(((TLRPC$TL_account_savedRingtoneConverted) tLObject).document);
            } else {
                this.ringtoneDataStore.addTone(tLRPC$Document);
            }
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
                    imageReceiver.setAllowLoadingOnAttachedOnly(false);
                    imageReceiver.setImage(ImageLocation.getForDocument(tLRPC$Document), null, null, "webp", null, 1);
                    ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver);
                    ImageReceiver imageReceiver2 = new ImageReceiver();
                    imageReceiver2.setAllowLoadingOnAttachedOnly(false);
                    imageReceiver2.setImage(ImageLocation.getForDocument(MessageObject.getPremiumStickerAnimation(tLRPC$Document), tLRPC$Document), (String) null, (ImageLocation) null, (String) null, "tgs", (Object) null, 1);
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
                MediaDataController.this.lambda$preloadPremiumPreviewStickers$194(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$preloadPremiumPreviewStickers$194(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$preloadPremiumPreviewStickers$193(tLRPC$TL_error, tLObject);
            }
        });
    }

    public void lambda$preloadPremiumPreviewStickers$193(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        if (tLRPC$TL_error != null) {
            return;
        }
        this.previewStickersLoading = false;
        this.premiumPreviewStickers.clear();
        this.premiumPreviewStickers.addAll(((TLRPC$TL_messages_stickers) tLObject).stickers);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.premiumStickersPreviewLoaded, new Object[0]);
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
        checkGenericAnimations();
    }

    public void moveStickerSetToTop(long j, boolean z, boolean z2) {
        int i = z ? 5 : z2 ? 1 : 0;
        ArrayList<TLRPC$TL_messages_stickerSet> stickerSets = getStickerSets(i);
        if (stickerSets != null) {
            for (int i2 = 0; i2 < stickerSets.size(); i2++) {
                if (stickerSets.get(i2).set.id == j) {
                    stickerSets.remove(i2);
                    stickerSets.add(0, stickerSets.get(i2));
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, Integer.valueOf(i), Boolean.FALSE);
                    return;
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

    public void fetchNewEmojiKeywords(String[] strArr) {
        if (strArr == null) {
            return;
        }
        for (final String str : strArr) {
            if (TextUtils.isEmpty(str) || this.currentFetchingEmoji.get(str) != null) {
                return;
            }
            this.currentFetchingEmoji.put(str, Boolean.TRUE);
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$fetchNewEmojiKeywords$200(str);
                }
            });
        }
    }

    public void lambda$fetchNewEmojiKeywords$200(final java.lang.String r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.lambda$fetchNewEmojiKeywords$200(java.lang.String):void");
    }

    public void lambda$fetchNewEmojiKeywords$195(String str) {
        this.currentFetchingEmoji.remove(str);
    }

    public void lambda$fetchNewEmojiKeywords$199(int i, String str, final String str2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            TLRPC$TL_emojiKeywordsDifference tLRPC$TL_emojiKeywordsDifference = (TLRPC$TL_emojiKeywordsDifference) tLObject;
            if (i != -1 && !tLRPC$TL_emojiKeywordsDifference.lang_code.equals(str)) {
                getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        MediaDataController.this.lambda$fetchNewEmojiKeywords$197(str2);
                    }
                });
                return;
            } else {
                putEmojiKeywords(str2, tLRPC$TL_emojiKeywordsDifference);
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$fetchNewEmojiKeywords$198(str2);
            }
        });
    }

    public void lambda$fetchNewEmojiKeywords$197(final String str) {
        try {
            SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("DELETE FROM emoji_keywords_info_v2 WHERE lang = ?");
            executeFast.bindString(1, str);
            executeFast.step();
            executeFast.dispose();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$fetchNewEmojiKeywords$196(str);
                }
            });
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$fetchNewEmojiKeywords$196(String str) {
        this.currentFetchingEmoji.remove(str);
        fetchNewEmojiKeywords(new String[]{str});
    }

    public void lambda$fetchNewEmojiKeywords$198(String str) {
        this.currentFetchingEmoji.remove(str);
    }

    private void putEmojiKeywords(final String str, final TLRPC$TL_emojiKeywordsDifference tLRPC$TL_emojiKeywordsDifference) {
        if (tLRPC$TL_emojiKeywordsDifference == null) {
            return;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$putEmojiKeywords$202(tLRPC$TL_emojiKeywordsDifference, str);
            }
        });
    }

    public void lambda$putEmojiKeywords$202(TLRPC$TL_emojiKeywordsDifference tLRPC$TL_emojiKeywordsDifference, final String str) {
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
                    MediaDataController.this.lambda$putEmojiKeywords$201(str);
                }
            });
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$putEmojiKeywords$201(String str) {
        this.currentFetchingEmoji.remove(str);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newEmojiSuggestionsAvailable, str);
    }

    public void getAnimatedEmojiByKeywords(final String str, final Utilities.Callback<ArrayList<Long>> callback) {
        if (str == null) {
            if (callback != null) {
                callback.run(new ArrayList<>());
                return;
            }
            return;
        }
        final ArrayList<TLRPC$TL_messages_stickerSet> stickerSets = getStickerSets(5);
        final ArrayList<TLRPC$StickerSetCovered> featuredEmojiSets = getFeaturedEmojiSets();
        Utilities.searchQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.lambda$getAnimatedEmojiByKeywords$203(str, stickerSets, featuredEmojiSets, callback);
            }
        });
    }

    public static void lambda$getAnimatedEmojiByKeywords$203(String str, ArrayList arrayList, ArrayList arrayList2, Utilities.Callback callback) {
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        String lowerCase = str.toLowerCase();
        for (int i = 0; i < arrayList.size(); i++) {
            if (((TLRPC$TL_messages_stickerSet) arrayList.get(i)).keywords != null) {
                ArrayList<TLRPC$TL_stickerKeyword> arrayList5 = ((TLRPC$TL_messages_stickerSet) arrayList.get(i)).keywords;
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
            if ((arrayList2.get(i4) instanceof TLRPC$TL_stickerSetFullCovered) && ((TLRPC$TL_stickerSetFullCovered) arrayList2.get(i4)).keywords != null) {
                ArrayList<TLRPC$TL_stickerKeyword> arrayList6 = ((TLRPC$TL_stickerSetFullCovered) arrayList2.get(i4)).keywords;
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

    public void getEmojiSuggestions(String[] strArr, String str, boolean z, KeywordResultCallback keywordResultCallback, boolean z2) {
        getEmojiSuggestions(strArr, str, z, keywordResultCallback, null, z2, false, false, null);
    }

    public void getEmojiSuggestions(String[] strArr, String str, boolean z, KeywordResultCallback keywordResultCallback, CountDownLatch countDownLatch, boolean z2) {
        getEmojiSuggestions(strArr, str, z, keywordResultCallback, countDownLatch, z2, false, false, null);
    }

    public void getEmojiSuggestions(String[] strArr, String str, boolean z, KeywordResultCallback keywordResultCallback, CountDownLatch countDownLatch, boolean z2, boolean z3, boolean z4, Integer num) {
        getEmojiSuggestions(strArr, str, z, keywordResultCallback, countDownLatch, z2, z3, z4, false, num);
    }

    public void getEmojiSuggestions(final String[] strArr, final String str, final boolean z, final KeywordResultCallback keywordResultCallback, final CountDownLatch countDownLatch, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final Integer num) {
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
                MediaDataController.this.lambda$getEmojiSuggestions$209(strArr, keywordResultCallback, z4, str, z, arrayList, z2, num, z3, z5, countDownLatch);
            }
        });
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (Throwable unused) {
            }
        }
    }

    public void lambda$getEmojiSuggestions$209(final java.lang.String[] r17, final org.telegram.messenger.MediaDataController.KeywordResultCallback r18, boolean r19, java.lang.String r20, boolean r21, final java.util.ArrayList r22, boolean r23, java.lang.Integer r24, boolean r25, boolean r26, final java.util.concurrent.CountDownLatch r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.lambda$getEmojiSuggestions$209(java.lang.String[], org.telegram.messenger.MediaDataController$KeywordResultCallback, boolean, java.lang.String, boolean, java.util.ArrayList, boolean, java.lang.Integer, boolean, boolean, java.util.concurrent.CountDownLatch):void");
    }

    public void lambda$getEmojiSuggestions$204(String[] strArr, KeywordResultCallback keywordResultCallback, ArrayList arrayList) {
        for (String str : strArr) {
            if (this.currentFetchingEmoji.get(str) != null) {
                return;
            }
        }
        keywordResultCallback.run(arrayList, null);
    }

    public static int lambda$getEmojiSuggestions$205(ArrayList arrayList, KeywordResult keywordResult, KeywordResult keywordResult2) {
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

    public static void lambda$getEmojiSuggestions$207(CountDownLatch countDownLatch, final KeywordResultCallback keywordResultCallback, final ArrayList arrayList, final String str) {
        if (countDownLatch != null) {
            keywordResultCallback.run(arrayList, str);
            countDownLatch.countDown();
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.KeywordResultCallback.this.run(arrayList, str);
            }
        });
    }

    public void fillWithAnimatedEmoji(final ArrayList<KeywordResult> arrayList, final Integer num, final boolean z, final boolean z2, final Runnable runnable) {
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
                MediaDataController.this.lambda$fillWithAnimatedEmoji$210(num, arrayList, z2, z, arrayListArr, runnable);
            }
        };
        if ((arrayListArr[0] == null || arrayListArr[0].isEmpty()) && !this.triedLoadingEmojipacks) {
            this.triedLoadingEmojipacks = true;
            final boolean[] zArr = new boolean[1];
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$fillWithAnimatedEmoji$212(zArr, arrayListArr, runnable2);
                }
            });
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.lambda$fillWithAnimatedEmoji$213(zArr, runnable2);
                }
            }, 900L);
            return;
        }
        runnable2.run();
    }

    public void lambda$fillWithAnimatedEmoji$210(java.lang.Integer r22, java.util.ArrayList r23, boolean r24, boolean r25, java.util.ArrayList[] r26, java.lang.Runnable r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.lambda$fillWithAnimatedEmoji$210(java.lang.Integer, java.util.ArrayList, boolean, boolean, java.util.ArrayList[], java.lang.Runnable):void");
    }

    public void lambda$fillWithAnimatedEmoji$212(final boolean[] zArr, final ArrayList[] arrayListArr, final Runnable runnable) {
        loadStickers(5, true, false, false, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                MediaDataController.lambda$fillWithAnimatedEmoji$211(zArr, arrayListArr, runnable, (ArrayList) obj);
            }
        });
    }

    public static void lambda$fillWithAnimatedEmoji$211(boolean[] zArr, ArrayList[] arrayListArr, Runnable runnable, ArrayList arrayList) {
        if (zArr[0]) {
            return;
        }
        arrayListArr[0] = arrayList;
        runnable.run();
        zArr[0] = true;
    }

    public static void lambda$fillWithAnimatedEmoji$213(boolean[] zArr, Runnable runnable) {
        if (zArr[0]) {
            return;
        }
        runnable.run();
        zArr[0] = true;
    }

    public void loadEmojiThemes() {
        Context context = ApplicationLoader.applicationContext;
        SharedPreferences sharedPreferences = context.getSharedPreferences("emojithemes_config_" + this.currentAccount, 0);
        int i = sharedPreferences.getInt(NotificationBadge.NewHtcHomeBadger.COUNT, 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ChatThemeBottomSheet.ChatThemeItem(EmojiThemes.createHomePreviewTheme(this.currentAccount)));
        for (int i2 = 0; i2 < i; i2++) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(sharedPreferences.getString("theme_" + i2, "")));
            try {
                EmojiThemes createPreviewFullTheme = EmojiThemes.createPreviewFullTheme(this.currentAccount, TLRPC$Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true));
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
                if (this.val$previewItems.get(i) != null && ((ChatThemeBottomSheet.ChatThemeItem) this.val$previewItems.get(i)).chatTheme != null) {
                    ((ChatThemeBottomSheet.ChatThemeItem) this.val$previewItems.get(i)).chatTheme.loadPreviewColors(0);
                }
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
            arrayList2.add(new ChatThemeBottomSheet.ChatThemeItem(EmojiThemes.createHomePreviewTheme(i)));
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                EmojiThemes createPreviewFullTheme = EmojiThemes.createPreviewFullTheme(i, arrayList.get(i3));
                ChatThemeBottomSheet.ChatThemeItem chatThemeItem = new ChatThemeBottomSheet.ChatThemeItem(createPreviewFullTheme);
                if (createPreviewFullTheme.items.size() >= 4) {
                    arrayList2.add(chatThemeItem);
                }
            }
            ChatThemeController.chatThemeQueue.postRunnable(new AnonymousClass3(arrayList2, i));
            return;
        }
        this.defaultEmojiThemes.clear();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.emojiPreviewThemesChanged, new Object[0]);
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
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.emojiPreviewThemesChanged, new Object[0]);
        }
    }

    public ArrayList<TLRPC$EmojiStatus> getDefaultEmojiStatuses() {
        if (!this.emojiStatusesFromCacheFetched[1]) {
            fetchEmojiStatuses(1, true);
        } else if (this.emojiStatuses[1] == null || (this.emojiStatusesFetchDate[1] != null && (System.currentTimeMillis() / 1000) - this.emojiStatusesFetchDate[1].longValue() > 1800)) {
            fetchEmojiStatuses(1, false);
        }
        return this.emojiStatuses[1];
    }

    public ArrayList<TLRPC$EmojiStatus> getRecentEmojiStatuses() {
        if (!this.emojiStatusesFromCacheFetched[0]) {
            fetchEmojiStatuses(0, true);
        } else if (this.emojiStatuses[0] == null || (this.emojiStatusesFetchDate[0] != null && (System.currentTimeMillis() / 1000) - this.emojiStatusesFetchDate[0].longValue() > 1800)) {
            fetchEmojiStatuses(0, false);
        }
        return this.emojiStatuses[0];
    }

    public ArrayList<TLRPC$EmojiStatus> clearRecentEmojiStatuses() {
        ArrayList<TLRPC$EmojiStatus>[] arrayListArr = this.emojiStatuses;
        if (arrayListArr[0] != null) {
            arrayListArr[0].clear();
        }
        this.emojiStatusesHash[0] = 0;
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$clearRecentEmojiStatuses$214();
            }
        });
        return this.emojiStatuses[0];
    }

    public void lambda$clearRecentEmojiStatuses$214() {
        try {
            getMessagesStorage().getDatabase().executeFast("DELETE FROM emoji_statuses WHERE type = 0").stepThis().dispose();
        } catch (Exception unused) {
        }
    }

    public void pushRecentEmojiStatus(TLRPC$EmojiStatus tLRPC$EmojiStatus) {
        ArrayList<TLRPC$EmojiStatus>[] arrayListArr;
        if (this.emojiStatuses[0] != null) {
            if (tLRPC$EmojiStatus instanceof TLRPC$TL_emojiStatus) {
                long j = ((TLRPC$TL_emojiStatus) tLRPC$EmojiStatus).document_id;
                int i = 0;
                while (i < this.emojiStatuses[0].size()) {
                    if ((this.emojiStatuses[0].get(i) instanceof TLRPC$TL_emojiStatus) && ((TLRPC$TL_emojiStatus) this.emojiStatuses[0].get(i)).document_id == j) {
                        this.emojiStatuses[0].remove(i);
                        i--;
                    }
                    i++;
                }
            }
            this.emojiStatuses[0].add(0, tLRPC$EmojiStatus);
            while (this.emojiStatuses[0].size() > 50) {
                this.emojiStatuses[0].remove(arrayListArr[0].size() - 1);
            }
            TLRPC$TL_account_emojiStatuses tLRPC$TL_account_emojiStatuses = new TLRPC$TL_account_emojiStatuses();
            tLRPC$TL_account_emojiStatuses.hash = this.emojiStatusesHash[0];
            tLRPC$TL_account_emojiStatuses.statuses = this.emojiStatuses[0];
            updateEmojiStatuses(0, tLRPC$TL_account_emojiStatuses);
        }
    }

    public void fetchEmojiStatuses(final int i, boolean z) {
        TLRPC$TL_account_getDefaultEmojiStatuses tLRPC$TL_account_getDefaultEmojiStatuses;
        boolean[] zArr = this.emojiStatusesFetching;
        if (zArr[i]) {
            return;
        }
        zArr[i] = true;
        if (z) {
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$fetchEmojiStatuses$216(i);
                }
            });
            return;
        }
        if (i == 0) {
            TLRPC$TL_account_getRecentEmojiStatuses tLRPC$TL_account_getRecentEmojiStatuses = new TLRPC$TL_account_getRecentEmojiStatuses();
            tLRPC$TL_account_getRecentEmojiStatuses.hash = this.emojiStatusesHash[i];
            tLRPC$TL_account_getDefaultEmojiStatuses = tLRPC$TL_account_getRecentEmojiStatuses;
        } else {
            TLRPC$TL_account_getDefaultEmojiStatuses tLRPC$TL_account_getDefaultEmojiStatuses2 = new TLRPC$TL_account_getDefaultEmojiStatuses();
            tLRPC$TL_account_getDefaultEmojiStatuses2.hash = this.emojiStatusesHash[i];
            tLRPC$TL_account_getDefaultEmojiStatuses = tLRPC$TL_account_getDefaultEmojiStatuses2;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_account_getDefaultEmojiStatuses, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MediaDataController.this.lambda$fetchEmojiStatuses$218(i, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$fetchEmojiStatuses$216(int r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.lambda$fetchEmojiStatuses$216(int):void");
    }

    public void lambda$fetchEmojiStatuses$215() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.recentEmojiStatusesUpdate, new Object[0]);
    }

    public void lambda$fetchEmojiStatuses$218(int i, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        this.emojiStatusesFetchDate[i] = Long.valueOf(System.currentTimeMillis() / 1000);
        if (tLObject instanceof TLRPC$TL_account_emojiStatusesNotModified) {
            this.emojiStatusesFetching[i] = false;
        } else if (tLObject instanceof TLRPC$TL_account_emojiStatuses) {
            TLRPC$TL_account_emojiStatuses tLRPC$TL_account_emojiStatuses = (TLRPC$TL_account_emojiStatuses) tLObject;
            this.emojiStatusesHash[i] = tLRPC$TL_account_emojiStatuses.hash;
            this.emojiStatuses[i] = tLRPC$TL_account_emojiStatuses.statuses;
            updateEmojiStatuses(i, tLRPC$TL_account_emojiStatuses);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MediaDataController.this.lambda$fetchEmojiStatuses$217();
                }
            });
        }
    }

    public void lambda$fetchEmojiStatuses$217() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.recentEmojiStatusesUpdate, new Object[0]);
    }

    private void updateEmojiStatuses(final int i, final TLRPC$TL_account_emojiStatuses tLRPC$TL_account_emojiStatuses) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$updateEmojiStatuses$219(i, tLRPC$TL_account_emojiStatuses);
            }
        });
    }

    public void lambda$updateEmojiStatuses$219(int i, TLRPC$TL_account_emojiStatuses tLRPC$TL_account_emojiStatuses) {
        try {
            SQLiteDatabase database = getMessagesStorage().getDatabase();
            database.executeFast("DELETE FROM emoji_statuses WHERE type = " + i).stepThis().dispose();
            SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("INSERT INTO emoji_statuses VALUES(?, ?)");
            executeFast.requery();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLRPC$TL_account_emojiStatuses.getObjectSize());
            tLRPC$TL_account_emojiStatuses.serializeToStream(nativeByteBuffer);
            executeFast.bindByteBuffer(1, nativeByteBuffer);
            executeFast.bindInteger(2, i);
            executeFast.step();
            nativeByteBuffer.reuse();
            executeFast.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.emojiStatusesFetching[i] = false;
    }

    public ArrayList<TLRPC$Reaction> getRecentReactions() {
        return this.recentReactions;
    }

    public void clearRecentReactions() {
        this.recentReactions.clear();
        Context context = ApplicationLoader.applicationContext;
        context.getSharedPreferences("recent_reactions_" + this.currentAccount, 0).edit().clear().apply();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLObject() {
            public static int constructor = -1644236876;

            @Override
            public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
                return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                abstractSerializedData.writeInt32(constructor);
            }
        }, new RequestDelegate() {
            @Override
            public void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            }
        });
    }

    public ArrayList<TLRPC$Reaction> getTopReactions() {
        return this.topReactions;
    }

    public void loadRecentAndTopReactions(boolean z) {
        if (this.loadingRecentReactions || !this.recentReactions.isEmpty() || z) {
            return;
        }
        Context context = ApplicationLoader.applicationContext;
        final SharedPreferences sharedPreferences = context.getSharedPreferences("recent_reactions_" + this.currentAccount, 0);
        Context context2 = ApplicationLoader.applicationContext;
        final SharedPreferences sharedPreferences2 = context2.getSharedPreferences("top_reactions_" + this.currentAccount, 0);
        this.recentReactions.clear();
        this.topReactions.clear();
        this.recentReactions.addAll(loadReactionsFromPref(sharedPreferences));
        this.topReactions.addAll(loadReactionsFromPref(sharedPreferences2));
        this.loadingRecentReactions = true;
        TLRPC$TL_messages_getRecentReactions tLRPC$TL_messages_getRecentReactions = new TLRPC$TL_messages_getRecentReactions();
        tLRPC$TL_messages_getRecentReactions.hash = sharedPreferences.getLong("hash", 0L);
        tLRPC$TL_messages_getRecentReactions.limit = 50;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_getRecentReactions, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MediaDataController.this.lambda$loadRecentAndTopReactions$220(sharedPreferences, tLObject, tLRPC$TL_error);
            }
        });
        TLRPC$TL_messages_getTopReactions tLRPC$TL_messages_getTopReactions = new TLRPC$TL_messages_getTopReactions();
        tLRPC$TL_messages_getTopReactions.hash = sharedPreferences2.getLong("hash", 0L);
        tLRPC$TL_messages_getTopReactions.limit = 100;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_getTopReactions, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MediaDataController.this.lambda$loadRecentAndTopReactions$221(sharedPreferences2, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadRecentAndTopReactions$220(SharedPreferences sharedPreferences, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            if (tLObject instanceof TLRPC$TL_messages_reactions) {
                TLRPC$TL_messages_reactions tLRPC$TL_messages_reactions = (TLRPC$TL_messages_reactions) tLObject;
                this.recentReactions.clear();
                this.recentReactions.addAll(tLRPC$TL_messages_reactions.reactions);
                saveReactionsToPref(sharedPreferences, tLRPC$TL_messages_reactions.hash, tLRPC$TL_messages_reactions.reactions);
            }
            boolean z = tLObject instanceof TLRPC$TL_messages_reactionsNotModified;
        }
    }

    public void lambda$loadRecentAndTopReactions$221(SharedPreferences sharedPreferences, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            if (tLObject instanceof TLRPC$TL_messages_reactions) {
                TLRPC$TL_messages_reactions tLRPC$TL_messages_reactions = (TLRPC$TL_messages_reactions) tLObject;
                this.topReactions.clear();
                this.topReactions.addAll(tLRPC$TL_messages_reactions.reactions);
                saveReactionsToPref(sharedPreferences, tLRPC$TL_messages_reactions.hash, tLRPC$TL_messages_reactions.reactions);
            }
            boolean z = tLObject instanceof TLRPC$TL_messages_reactionsNotModified;
        }
    }

    public static void saveReactionsToPref(SharedPreferences sharedPreferences, long j, ArrayList<? extends TLObject> arrayList) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt(NotificationBadge.NewHtcHomeBadger.COUNT, arrayList.size());
        edit.putLong("hash", j);
        for (int i = 0; i < arrayList.size(); i++) {
            TLObject tLObject = arrayList.get(i);
            SerializedData serializedData = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData);
            edit.putString("object_" + i, Utilities.bytesToHex(serializedData.toByteArray()));
        }
        edit.apply();
    }

    public static ArrayList<TLRPC$Reaction> loadReactionsFromPref(SharedPreferences sharedPreferences) {
        int i = sharedPreferences.getInt(NotificationBadge.NewHtcHomeBadger.COUNT, 0);
        ArrayList<TLRPC$Reaction> arrayList = new ArrayList<>(i);
        if (i > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                SerializedData serializedData = new SerializedData(Utilities.hexToBytes(sharedPreferences.getString("object_" + i2, "")));
                try {
                    arrayList.add(TLRPC$Reaction.TLdeserialize(serializedData, serializedData.readInt32(true), true));
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            }
        }
        return arrayList;
    }

    private void loadAvatarConstructor(final boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MediaDataController.loadAvatarConstructor(boolean):void");
    }

    public void lambda$loadAvatarConstructor$223(final SharedPreferences sharedPreferences, final boolean z, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MediaDataController.this.lambda$loadAvatarConstructor$222(tLObject, sharedPreferences, z);
            }
        });
    }

    public void lambda$loadAvatarConstructor$222(TLObject tLObject, SharedPreferences sharedPreferences, boolean z) {
        if (tLObject instanceof TLRPC$TL_emojiList) {
            SerializedData serializedData = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            if (z) {
                this.profileAvatarConstructorDefault = (TLRPC$TL_emojiList) tLObject;
                edit.putString("profile", Utilities.bytesToHex(serializedData.toByteArray()));
                edit.putLong("profile_last_check", System.currentTimeMillis());
            } else {
                this.groupAvatarConstructorDefault = (TLRPC$TL_emojiList) tLObject;
                edit.putString("group", Utilities.bytesToHex(serializedData.toByteArray()));
                edit.putLong("group_last_check", System.currentTimeMillis());
            }
            edit.apply();
        }
    }
}
