package org.telegram.messenger;

import android.app.Activity;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.location.Location;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.collection.LongSparseArray;
import androidx.core.graphics.ColorUtils;
import androidx.core.util.Consumer;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.io.File;
import java.util.AbstractMap;
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
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ToLongFunction;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.Timer;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_forum;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ImageUpdater;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.MainTabsActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.HighlightMessageSheet;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.TopicsFragment;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.bots.WebViewRequestProps;

public class MessagesController extends BaseController implements NotificationCenter.NotificationCenterDelegate {
    public static int DIALOG_FILTER_FLAG_ALL_CHATS = 31;
    public static int DIALOG_FILTER_FLAG_BOTS = 16;
    public static int DIALOG_FILTER_FLAG_CHANNELS = 8;
    public static int DIALOG_FILTER_FLAG_CHATLIST = 512;
    public static int DIALOG_FILTER_FLAG_CHATLIST_ADMIN = 1024;
    public static int DIALOG_FILTER_FLAG_CONTACTS = 1;
    public static int DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED = 128;
    public static int DIALOG_FILTER_FLAG_EXCLUDE_MUTED = 32;
    public static int DIALOG_FILTER_FLAG_EXCLUDE_READ = 64;
    public static int DIALOG_FILTER_FLAG_GROUPS = 4;
    public static int DIALOG_FILTER_FLAG_NON_CONTACTS = 2;
    public static int DIALOG_FILTER_FLAG_ONLY_ARCHIVED = 256;
    public static final int EMAIL_SUGGESTION_FALSE = 0;
    public static final int EMAIL_SUGGESTION_TRUE = 1;
    public static final int EMAIL_SUGGESTION_TRUE_FORCED = 2;
    public static final int LOAD_AROUND_DATE = 4;
    public static final int LOAD_AROUND_MESSAGE = 3;
    public static final int LOAD_BACKWARD = 0;
    public static final int LOAD_FORWARD = 1;
    public static final int LOAD_FROM_UNREAD = 2;
    public static int PROMO_TYPE_OTHER = 2;
    public static int PROMO_TYPE_PROXY = 0;
    public static int PROMO_TYPE_PSA = 1;
    public static int UPDATE_MASK_ALL = 1050111;
    public static int UPDATE_MASK_AVATAR = 2;
    public static int UPDATE_MASK_CHAT = 8192;
    public static int UPDATE_MASK_CHAT_AVATAR = 8;
    public static int UPDATE_MASK_CHAT_MEMBERS = 32;
    public static int UPDATE_MASK_CHAT_NAME = 16;
    public static int UPDATE_MASK_CHECK = 65536;
    public static int UPDATE_MASK_EMOJI_INTERACTIONS = 262144;
    public static int UPDATE_MASK_EMOJI_STATUS = 524288;
    public static int UPDATE_MASK_MESSAGE_TEXT = 32768;
    public static int UPDATE_MASK_NAME = 1;
    public static int UPDATE_MASK_NEW_MESSAGE = 2048;
    public static int UPDATE_MASK_PHONE = 1024;
    public static int UPDATE_MASK_REACTIONS_READ = 1048576;
    public static int UPDATE_MASK_READ_DIALOG_MESSAGE = 256;
    public static int UPDATE_MASK_REORDER = 131072;
    public static int UPDATE_MASK_SELECT_DIALOG = 512;
    public static int UPDATE_MASK_SEND_STATE = 4096;
    public static int UPDATE_MASK_STATUS = 4;
    public static int UPDATE_MASK_USER_PHONE = 128;
    public static int UPDATE_MASK_USER_PRINT = 64;
    private static volatile long lastPasswordCheckTime = 0;
    private static volatile long lastThemeCheckTime = 0;
    public static int stableIdPointer = 100;
    private int DIALOGS_LOAD_TYPE_CACHE;
    private int DIALOGS_LOAD_TYPE_CHANNEL;
    private int DIALOGS_LOAD_TYPE_UNKNOWN;
    public int aboutLengthLimitDefault;
    public int aboutLengthLimitPremium;
    private final HashMap<Long, TLRPC.Chat> activeVoiceChatsMap;
    protected final ArrayList<TLRPC.Dialog> allDialogs;
    public boolean androidDisableRoundCamera2;
    public float animatedEmojisZoom;
    private final CacheFetcher<Integer, TLRPC.TL_help_appConfig> appConfigFetcher;
    public Set<String> authDomains;
    public int authorizationAutoconfirmPeriod;
    public boolean autoarchiveAvailable;
    public Set<String> autologinDomains;
    public String autologinToken;
    private TLRPC.messages_AvailableEffects availableEffects;
    public int availableMapProviders;
    public boolean backgroundConnection;
    public LongSparseIntArray blockePeers;
    public boolean blockedCountry;
    public boolean blockedEndReached;
    public int boostsChannelLevelMax;
    public long boostsPerSentGift;
    public int botPreviewMediasMax;
    public int botVerificationDescriptionLengthLimit;
    public int businessChatLinksLimit;
    public SparseIntArray businessFeaturesTypesToPosition;
    private CacheByChatsController cacheByChatsController;
    private HashMap<Long, ChannelRecommendations> cachedChannelRecommendations;
    private TLRPC.TL_exportedContactToken cachedContactToken;
    private final LongSparseArray cachedIsUserContactBlocked;
    public int callConnectTimeout;
    public int callPacketTimeout;
    public int callReceiveTimeout;
    public boolean callRequestsDisabled;
    public int callRingTimeout;
    public boolean canEditFactcheck;
    public boolean canRevokePmInbox;
    public int captionLengthLimitDefault;
    public int captionLengthLimitPremium;
    private LongSparseArray channelAdmins;
    public int channelAutotranslationLevelMin;
    public int channelBgIconLevelMin;
    private ChannelBoostsController channelBoostsControler;
    public int channelCustomWallpaperLevelMin;
    public int channelEmojiStatusLevelMin;
    public int channelProfileIconLevelMin;
    public int channelRestrictSponsoredLevelMin;
    public boolean channelRevenueWithdrawalEnabled;
    private LongSparseArray channelViewsToSend;
    public int channelWallpaperLevelMin;
    public int channelsLimitDefault;
    public int channelsLimitPremium;
    private LongSparseIntArray channelsPts;
    public int chatReadMarkExpirePeriod;
    public int chatReadMarkSizeThreshold;
    private SparseArray<ChatlistUpdatesStat> chatlistFoldersUpdates;
    public int chatlistInvitesLimitDefault;
    public int chatlistInvitesLimitPremium;
    public int chatlistJoinedLimitDefault;
    public int chatlistJoinedLimitPremium;
    private int chatlistUpdatePeriod;
    private final ConcurrentHashMap<Long, TLRPC.Chat> chats;
    public int checkResetLangpack;
    private LongSparseArray checkingLastMessagesDialogs;
    private boolean checkingPromoInfo;
    private int checkingPromoInfoRequestId;
    private boolean checkingTosUpdate;
    private LongSparseArray clearingHistoryDialogs;
    public boolean collectDeviceStats;
    public final android.util.LongSparseArray<CommonChatsList> commonChats;
    public int conferenceCallSizeLimit;
    public final AppGlobalConfig config;
    private TL_account.contentSettings contentSettings;
    private ArrayList<Utilities.Callback<TL_account.contentSettings>> contentSettingsCallbacks;
    private long contentSettingsLoadedTime;
    private boolean contentSettingsLoading;
    private ArrayList<Long> createdDialogIds;
    private ArrayList<Long> createdDialogMainThreadIds;
    private ArrayList<Long> createdScheduledDialogIds;
    private Runnable currentDeleteTaskRunnable;
    private LongSparseArray currentDeletingTaskMediaMids;
    private LongSparseArray currentDeletingTaskMids;
    private int currentDeletingTaskTime;
    public TLRPC.TL_pendingSuggestion customPendingSuggestion;
    public String dcDomainName;
    public LongSparseIntArray deletedHistory;
    private LongSparseArray deletingDialogs;
    private Comparator<TLRPC.Dialog> dialogComparator;
    private final Comparator<TLRPC.Dialog> dialogDateComparator;
    public ArrayList<DialogFilter> dialogFilters;
    public SparseArray<DialogFilter> dialogFiltersById;
    public int dialogFiltersChatsLimitDefault;
    public int dialogFiltersChatsLimitPremium;
    public int dialogFiltersLimitDefault;
    public int dialogFiltersLimitPremium;
    public boolean dialogFiltersLoaded;
    public int dialogFiltersPinnedLimitDefault;
    public int dialogFiltersPinnedLimitPremium;
    public LongSparseArray dialogMessage;
    public SparseArray<MessageObject> dialogMessagesByIds;
    public LongSparseArray dialogMessagesByRandomIds;
    private LongSparseArray dialogPhotos;
    public final SparseArray<ArrayList<TLRPC.Dialog>> dialogsByFolder;
    public ArrayList<TLRPC.Dialog> dialogsCanAddUsers;
    public ArrayList<TLRPC.Dialog> dialogsChannelsOnly;
    private SparseBooleanArray dialogsEndReached;
    public ArrayList<TLRPC.Dialog> dialogsForBlock;
    public ArrayList<TLRPC.Dialog> dialogsForward;
    public ArrayList<TLRPC.Dialog> dialogsGroupsOnly;
    private boolean dialogsInTransaction;
    public boolean dialogsLoaded;
    private int dialogsLoadedTillDate;
    public ArrayList<TLRPC.Dialog> dialogsMyChannels;
    public ArrayList<TLRPC.Dialog> dialogsMyGroups;
    public ArrayList<TLRPC.Dialog> dialogsServerOnly;
    public ArrayList<TLRPC.Dialog> dialogsUsersOnly;
    public LongSparseArray dialogs_dict;
    public ConcurrentHashMap<Long, Integer> dialogs_read_inbox_max;
    public ConcurrentHashMap<Long, Integer> dialogs_read_outbox_max;
    public HashSet<String> diceEmojies;
    public HashMap<String, DiceFrameSuccess> diceSuccess;
    public List<String> directPaymentsCurrency;
    public boolean disableBotFullscreenBlur;
    public Set<String> dismissedSuggestions;
    private final CacheFetcher<Integer, TLRPC.messages_AvailableEffects> effectsFetcher;
    private boolean emailSuggestionWasShown;
    public HashMap<Long, ArrayList<TLRPC.TL_sendMessageEmojiInteraction>> emojiInteractions;
    private final SharedPreferences emojiPreferences;
    public HashMap<String, EmojiSound> emojiSounds;
    private final ConcurrentHashMap<Long, Integer> emojiStatusUntilValues;
    public boolean enableGiftsInProfile;
    public boolean enableJoined;
    private final ConcurrentHashMap<Integer, TLRPC.EncryptedChat> encryptedChats;
    public Set<String> exportGroupUri;
    public Set<String> exportPrivateUri;
    public Set<String> exportUri;
    private final LongSparseArray exportedChats;
    public int factcheckLengthLimit;
    public ArrayList<FaqSearchResult> faqSearchArray;
    public TLRPC.WebPage faqWebPage;
    public boolean filtersEnabled;
    public boolean firstGettingTask;
    public boolean folderTags;
    public int forumUpgradeParticipantsMin;
    public String freezeAppealUrl;
    public long freezeSinceDate;
    public long freezeUntilDate;
    public ArrayList<DialogFilter> frozenDialogFilters;
    private final LongSparseArray fullChats;
    private final LongSparseArray fullUsers;
    private boolean getDifferenceFirstSync;
    public boolean getfileExperimentalParams;
    private LongSparseArray gettingChatInviters;
    public boolean gettingDifference;
    private LongSparseArray gettingDifferenceChannels;
    private boolean gettingNewDeleteTask;
    private LongSparseArray gettingUnknownChannels;
    private LongSparseArray gettingUnknownDialogs;
    public String gifSearchBot;
    public ArrayList<String> gifSearchEmojies;
    public boolean giftAttachMenuIcon;
    public boolean giftTextFieldIcon;
    public long giveawayAddPeersMax;
    public long giveawayBoostsPerPremium;
    public long giveawayCountriesMax;
    public boolean giveawayGiftsPurchaseAvailable;
    public long giveawayPeriodMax;
    public int groupCallVideoMaxParticipants;
    private final LongSparseArray groupCalls;
    private final LongSparseArray groupCallsByChatId;
    public int groupCustomWallpaperLevelMin;
    public int groupEmojiStatusLevelMin;
    public int groupEmojiStickersLevelMin;
    public int groupProfileBgIconLevelMin;
    public int groupTranscribeLevelMin;
    public int groupWallpaperLevelMin;
    private boolean hasArchivedChats;
    private boolean hasStories;
    public int hiddenMembersGroupSizeMin;
    public ArrayList<Long> hiddenUndoChats;
    public ArrayList<TLRPC.RecentMeUrl> hintDialogs;
    public Set<String> ignoreRestrictionReasons;
    public volatile boolean ignoreSetOnline;
    public String imageSearchBot;
    private String installReferer;
    public int introDescriptionLengthLimit;
    public int introTitleLengthLimit;
    private boolean isLeftPromoChannel;
    private final ArrayList<Long> joiningToChannels;
    public boolean keepAliveService;
    public int largeQueueMaxActiveOperations;
    private int lastCheckPromoId;
    private long lastCheckPromoInfoTime;
    public int lastKnownSessionsCount;
    private int lastPrintingStringCount;
    private long lastPushRegisterSendTime;
    private LongSparseArray lastQuickReplyServerQueryTime;
    private LongSparseArray lastSavedServerQueryTime;
    private LongSparseArray lastScheduledServerQueryTime;
    private LongSparseArray lastServerQueryTime;
    private long lastStatusUpdateTime;
    private long lastViewsCheckTime;
    public String linkPrefix;
    private Runnable loadAppConfigRunnable;
    public LongSparseLongArray loadedFullChats;
    private HashSet<Long> loadedFullParticipants;
    private LongSparseLongArray loadedFullUsers;
    private boolean loadingArePaidReactionsAnonymous;
    private boolean loadingAvailableEffects;
    public boolean loadingBlockedPeers;
    private LongSparseIntArray loadingChannelAdmins;
    private SparseBooleanArray loadingDialogs;
    private HashSet<Long> loadingFullChats;
    private HashSet<Long> loadingFullParticipants;
    private HashSet<Long> loadingFullUsers;
    private HashSet<Long> loadingGroupCalls;
    private final HashSet<Long> loadingIsUserContactBlocked;
    private int loadingNotificationSettings;
    private boolean loadingNotificationSignUpSettings;
    private boolean loadingPeerColors;
    private LongSparseArray loadingPeerSettings;
    private SparseIntArray loadingPinnedDialogs;
    private boolean loadingProfilePeerColors;
    private HashSet<Long> loadingReactionTags;
    private boolean loadingRemoteFilters;
    private ArrayList<Utilities.Callback<Boolean>> loadingStakeDiceInfo;
    private boolean loadingSuggestedFilters;
    private boolean loadingUnreadDialogs;
    private boolean loggedDeviceStats;
    private final SharedPreferences mainPreferences;
    public String mapKey;
    public int mapProvider;
    public int maxBroadcastCount;
    public int maxCaptionLength;
    public int maxEditTime;
    public int maxFaveStickersCount;
    public int maxFolderPinnedDialogsCountDefault;
    public int maxFolderPinnedDialogsCountPremium;
    public int maxGroupCount;
    public int maxMegagroupCount;
    public int maxMessageLength;
    public int maxPinnedDialogsCountDefault;
    public int maxPinnedDialogsCountPremium;
    public int maxRecentGifsCount;
    public int maxRecentStickersCount;
    private SparseIntArray migratedChats;
    private boolean migratingDialogs;
    public int minGroupConvertSize;
    private final ConcurrentHashMap<Long, Long> monoForumLinkedChannels;
    private LongSparseArray needShortPollChannels;
    private LongSparseArray needShortPollOnlines;
    public NewMessageCallback newMessageCallback;
    public boolean newNoncontactPeersRequirePremiumWithoutOwnpremium;
    private SparseIntArray nextDialogsCacheOffset;
    private int nextPromoInfoCheckTime;
    private int nextTosCheckTime;
    private final SharedPreferences notificationsPreferences;
    private final Runnable notifyTranscriptionAudioCooldownUpdate;
    private final ConcurrentHashMap<String, TLObject> objectsByUsernames;
    private boolean offlineSent;
    private Utilities.Callback<Boolean> onLoadedRemoteFilters;
    public ConcurrentHashMap<Long, Integer> onlinePrivacy;
    public Long paidReactionsPrivacy;
    public long paidReactionsPrivacyTime;
    private Runnable passwordCheckRunnable;
    public PeerColors peerColors;
    private final long peerDialogRequestTimeout;
    private final LongSparseArray peerDialogsRequested;
    private final HashSet<Pair<StarsController.MessageId, AtomicBoolean>> pendingReportMessageDelivery;
    public Set<String> pendingSuggestions;
    private LongSparseIntArray pendingUnreadCounter;
    public SparseArray<ImageUpdater> photoSuggestion;
    public int pmReadDateExpirePeriod;
    public int pollAnswersMax;
    private LongSparseArray pollsToCheck;
    private int pollsToCheckSize;
    public boolean preloadFeaturedStickers;
    public String premiumBotUsername;
    public SparseIntArray premiumFeaturesTypesToPosition;
    public String premiumInvoiceSlug;
    public boolean premiumLocked;
    public String premiumManageSubscriptionUrl;
    public LongSparseArray printingStrings;
    public LongSparseArray printingStringsTypes;
    public ConcurrentHashMap<Long, ConcurrentHashMap<Integer, ArrayList<PrintingUser>>> printingUsers;
    public PeerColors profilePeerColors;
    private TLRPC.Dialog promoDialog;
    private long promoDialogId;
    public int promoDialogType;
    public String promoPsaMessage;
    public String promoPsaType;
    private String proxyDialogAddress;
    public int publicLinksLimitDefault;
    public int publicLinksLimitPremium;
    public boolean qrLoginCamera;
    public int quickRepliesLimit;
    public int quickReplyMessagesLimit;
    public int quoteLengthMax;
    public int ratingDecay;
    private LongSparseArray reactionTags;
    public int reactionsInChatMax;
    public int reactionsUniqMax;
    public int reactionsUserMaxDefault;
    public int reactionsUserMaxPremium;
    private ArrayList<ReadTask> readTasks;
    private LongSparseArray readTasksMap;
    private Runnable recentEmojiStatusUpdateRunnable;
    private long recentEmojiStatusUpdateRunnableTime;
    private long recentEmojiStatusUpdateRunnableTimeout;
    public int recommendedChannelsLimitDefault;
    public int recommendedChannelsLimitPremium;
    public boolean registeringForPush;
    private LongSparseArray reloadingMessages;
    private HashMap<String, ArrayList<MessageObject>> reloadingSavedWebpages;
    private LongSparseArray reloadingSavedWebpagesPending;
    private HashMap<String, ArrayList<MessageObject>> reloadingScheduledWebpages;
    private LongSparseArray reloadingScheduledWebpagesPending;
    private HashMap<String, ArrayList<MessageObject>> reloadingWebpages;
    private LongSparseArray reloadingWebpagesPending;
    public boolean remoteConfigLoaded;
    private ArrayList<ReadTask> repliesReadTasks;
    private final HashSet<StarsController.MessageId> reportedMessageDelivery;
    private final Runnable requestIsUserContactBlockedRunnable;
    private boolean requestingContactToken;
    private TLRPC.messages_Dialogs resetDialogsAll;
    private TLRPC.TL_messages_peerDialogs resetDialogsPinned;
    private boolean resetingDialogs;
    public int revokeTimeLimit;
    public int revokeTimePmLimit;
    public int ringtoneDurationMax;
    public int ringtoneSizeMax;
    public int roundAudioBitrate;
    public int roundVideoBitrate;
    public int roundVideoSize;
    public boolean saveGifsWithStickers;
    public int savedDialogsPinnedLimitDefault;
    public int savedDialogsPinnedLimitPremium;
    public int savedGifsLimitDefault;
    public int savedGifsLimitPremium;
    public SavedMessagesController savedMessagesController;
    private SavedMusicIds savedMusicIds;
    public boolean savedViewAsChats;
    public int secretWebpagePreview;
    public DialogFilter[] selectedDialogFilter;
    private LongSparseArray sendAsPeers;
    private LongSparseArray sendAsPeersLiveStories;
    private final Runnable sendReportMessageDeliver;
    private final HashMap<String, Boolean> sendingSuggestedMessageApprovalMap;
    public LongSparseArray[] sendingTypings;
    private final HashSet<Long> sensitiveAgreed;
    private SparseBooleanArray serverDialogsEndReached;
    private LongSparseIntArray shortPollChannels;
    private LongSparseIntArray shortPollOnlines;
    public boolean showAnnualPerMonth;
    public boolean showFiltersTooltip;
    public int smallQueueMaxActiveOperations;
    public boolean smsjobsStickyNotificationEnabled;
    private DialogFilter sortingDialogFilter;
    public boolean sponsoredLinksInappAllow;
    private LongSparseArray sponsoredMessages;
    public TLRPC.EmojiGameInfo stakeDiceInfo;
    public boolean stargiftsBlocked;
    public int stargiftsConvertPeriodMax;
    public int[][] stargiftsCraftAttributesPermilles;
    public int stargiftsMessageLengthMax;
    public int stargiftsPinnedToTopLimit;
    public boolean starrefConnectAllowed;
    public int starrefMaxCommissionPermille;
    public int starrefMinCommissionPermille;
    public boolean starrefProgramAllowed;
    public Set<String> starrefStartParamPrefixes;
    public boolean starsGiftsEnabled;
    public int starsGroupcallMessageAmountMax;
    public int[] starsGroupcallMessageLimits;
    public boolean starsLocked;
    public long starsPaidMessageAmountMax;
    public int starsPaidMessageCommissionPermille;
    public boolean starsPaidMessagesAvailable;
    public long starsPaidPostAmountMax;
    public long starsPaidReactionAmountMax;
    public long starsRevenueWithdrawalMin;
    public long starsSubscriptionAmountMax;
    public float starsUsdSellRate1000;
    public float starsUsdWithdrawRate1000;
    private int statusRequest;
    private int statusSettingState;
    public int stealthModeCooldown;
    public int stealthModeFuture;
    public int stealthModePast;
    public int stickersFavedLimitDefault;
    public int stickersFavedLimitPremium;
    public long storiesChangelogUserId;
    public StoriesController storiesController;
    public String storiesEntities;
    public boolean storiesExportNopublicLink;
    public int storiesPinnedToTopCountMax;
    public String storiesPosting;
    public int storiesSentMonthlyLimitDefault;
    public int storiesSentMonthlyLimitPremium;
    public int storiesSentWeeklyLimitDefault;
    public int storiesSentWeeklyLimitPremium;
    public int storiesSuggestedReactionsLimitDefault;
    public int storiesSuggestedReactionsLimitPremium;
    public int storyCaptionLengthLimitDefault;
    public int storyCaptionLengthLimitPremium;
    public int storyExpiringLimitDefault;
    public int storyExpiringLimitPremium;
    public boolean storyQualityFull;
    public String storyVenueSearchBot;
    public boolean storyWeatherPreload;
    public boolean suggestContacts;
    public boolean suggestStickersApiOnly;
    public ArrayList<TLRPC.TL_dialogFilterSuggested> suggestedFilters;
    public String suggestedLangCode;
    public int telegramAntispamGroupSizeMin;
    public long telegramAntispamUserId;
    private Runnable themeCheckRunnable;
    private HashMap<String, ReadTask> threadsReadTasksMap;
    public int todoItemLengthMax;
    public int todoItemsMax;
    public int todoTitleLengthMax;
    public String tonBlockchainExplorerUrl;
    public String tonProxyAddress;
    public long tonStakeddiceStakeAmountMax;
    public long tonStakeddiceStakeAmountMin;
    public long[] tonStakediceStakeSuggestedAmounts;
    private TopicsController topicsController;
    public int topicsPinnedLimit;
    public int totalBlockedCount;
    public int transcribeAudioTrialCooldownUntil;
    public int transcribeAudioTrialCurrentNumber;
    public int transcribeAudioTrialDurationMax;
    public int transcribeAudioTrialWeeklyNumber;
    public int transcribeButtonPressed;
    private TranslateController translateController;
    public String translationsAutoEnabled;
    public String translationsManualEnabled;
    public UnconfirmedAuthController unconfirmedAuthController;
    public int unreadUnmutedDialogs;
    public int updateCheckDelay;
    private Comparator<TLRPC.Update> updatesComparator;
    private final LongSparseArray updatesQueueChannels;
    private ArrayList<TLRPC.Updates> updatesQueuePts;
    private ArrayList<TLRPC.Updates> updatesQueueQts;
    private ArrayList<TLRPC.Updates> updatesQueueSeq;
    private LongSparseLongArray updatesStartWaitTimeChannels;
    private long updatesStartWaitTimePts;
    private long updatesStartWaitTimeQts;
    private long updatesStartWaitTimeSeq;
    public boolean updatingState;
    public boolean uploadMarkupVideo;
    public int uploadMaxFileParts;
    public int uploadMaxFilePartsPremium;
    public float uploadPremiumSpeedupDownload;
    public int uploadPremiumSpeedupNotifyPeriod;
    public float uploadPremiumSpeedupUpload;
    private String uploadingAvatar;
    private HashMap<String, Object> uploadingThemes;
    public String uploadingWallpaper;
    public Theme.OverrideWallpaperInfo uploadingWallpaperInfo;
    private UserNameResolver userNameResolver;
    private final LongSparseArray userPeerSettings;
    private final ConcurrentHashMap<Long, TLRPC.User> users;
    public String venueSearchBot;
    public String verifyAgeBotUsername;
    public String verifyAgeCountry;
    public int verifyAgeMin;
    public boolean videoIgnoreAltDocuments;
    private ArrayList<Long> visibleDialogMainThreadIds;
    private ArrayList<Long> visibleScheduledDialogMainThreadIds;
    public VoIPDebugToSend voipDebug;
    public String weatherSearchUsername;
    public Set<String> webAppAllowedProtocols;
    public int webFileDatacenterId;
    public HashSet<Long> whitelistedBots;
    public String youtubePipType;
    private static volatile MessagesController[] Instance = new MessagesController[4];
    private static final Object[] lockObjects = new Object[4];

    public interface ErrorDelegate {
        boolean run(TLRPC.TL_error tL_error);
    }

    public interface IsInChatCheckedCallback {
        void run(boolean z, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str);
    }

    public interface MessagesLoadedCallback {
        void onError();

        void onMessagesLoaded(boolean z);
    }

    public interface NewMessageCallback {
        boolean onMessageReceived(TLRPC.Message message);
    }

    public static class PrintingUser {
        public TLRPC.SendMessageAction action;
        public long lastTime;
        public long userId;
    }

    public static void lambda$blockPeer$88(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void lambda$completeReadTask$230(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void lambda$completeReadTask$232(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void lambda$deleteParticipantFromChat$290(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void lambda$deleteParticipantFromChat$293(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void lambda$hidePeerSettingsBar$74(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void lambda$hidePromoDialog$130(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void lambda$installTheme$117(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void lambda$installTheme$118(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void lambda$logDeviceStats$31(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void lambda$markMentionMessageAsRead$226(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void lambda$markMessageContentAsRead$224(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void lambda$markReactionsAsRead$397(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void lambda$removeSuggestion$40(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void lambda$reportSpam$75(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void lambda$reportSpam$76(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void lambda$reportSpam$77(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void lambda$saveTheme$116(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void lambda$unregistedPush$299(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public void markSponsoredAsRead(long j, MessageObject messageObject) {
    }

    public void setStoryQuality(boolean r3) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.setStoryQuality(boolean):void");
    }

    public static TLRPC.Peer getPeerFromInputPeer(TLRPC.InputPeer inputPeer) {
        if (inputPeer.chat_id != 0) {
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            tL_peerChat.chat_id = inputPeer.chat_id;
            return tL_peerChat;
        }
        if (inputPeer.channel_id != 0) {
            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
            tL_peerChannel.channel_id = inputPeer.channel_id;
            return tL_peerChannel;
        }
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_peerUser.user_id = inputPeer.user_id;
        return tL_peerUser;
    }

    public ChannelBoostsController getBoostsController() {
        ChannelBoostsController channelBoostsController = this.channelBoostsControler;
        if (channelBoostsController != null) {
            return channelBoostsController;
        }
        synchronized (lockObjects[this.currentAccount]) {
            try {
                ChannelBoostsController channelBoostsController2 = this.channelBoostsControler;
                if (channelBoostsController2 != null) {
                    return channelBoostsController2;
                }
                ChannelBoostsController channelBoostsController3 = new ChannelBoostsController(this.currentAccount);
                this.channelBoostsControler = channelBoostsController3;
                return channelBoostsController3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    class ChatlistUpdatesStat {
        long lastRequestTime;
        TL_chatlists.TL_chatlists_chatlistUpdates lastValue;
        boolean loading;

        public ChatlistUpdatesStat() {
            this.loading = true;
        }

        public ChatlistUpdatesStat(TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates) {
            this.loading = false;
            this.lastRequestTime = System.currentTimeMillis();
            this.lastValue = tL_chatlists_chatlistUpdates;
        }
    }

    public void lambda$new$0() {
        getUserConfig().checkSavedPassword();
    }

    public ArrayList<DialogFilter> getDialogFilters() {
        ArrayList<DialogFilter> arrayList = this.frozenDialogFilters;
        return arrayList != null ? arrayList : this.dialogFilters;
    }

    class AnonymousClass1 extends CacheFetcher<Integer, TLRPC.TL_help_appConfig> {
        @Override
        public boolean useCache(Integer num) {
            return false;
        }

        AnonymousClass1() {
        }

        @Override
        public void getRemote(int i, Integer num, long j, final Utilities.Callback4<Boolean, TLRPC.TL_help_appConfig, Long, Boolean> callback4) {
            TLRPC.TL_help_getAppConfig tL_help_getAppConfig = new TLRPC.TL_help_getAppConfig();
            tL_help_getAppConfig.hash = (int) j;
            MessagesController.this.getConnectionsManager().sendRequest(tL_help_getAppConfig, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    MessagesController.AnonymousClass1.lambda$getRemote$0(callback4, tLObject, tL_error);
                }
            });
        }

        public static void lambda$getRemote$0(Utilities.Callback4 callback4, TLObject tLObject, TLRPC.TL_error tL_error) {
            String str;
            int i;
            if (tLObject instanceof TLRPC.TL_help_appConfigNotModified) {
                Boolean bool = Boolean.TRUE;
                callback4.run(bool, null, 0L, bool);
                return;
            }
            if (tLObject instanceof TLRPC.TL_help_appConfig) {
                callback4.run(Boolean.FALSE, (TLRPC.TL_help_appConfig) tLObject, Long.valueOf(r5.hash), Boolean.TRUE);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("getting appconfig error ");
            if (tL_error != null) {
                str = tL_error.code + " " + tL_error.text;
            } else {
                str = "";
            }
            sb.append(str);
            FileLog.e(sb.toString());
            callback4.run(Boolean.FALSE, null, 0L, Boolean.valueOf(tL_error == null || !((i = tL_error.code) == -2000 || i == -2001)));
        }

        @Override
        public void getLocal(final int i, Integer num, final Utilities.Callback2<Long, TLRPC.TL_help_appConfig> callback2) {
            MessagesController.this.getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() throws Throwable {
                    MessagesController.AnonymousClass1.lambda$getLocal$1(i, callback2);
                }
            });
        }

        public static void lambda$getLocal$1(int r7, org.telegram.messenger.Utilities.Callback2 r8) throws java.lang.Throwable {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.AnonymousClass1.lambda$getLocal$1(int, org.telegram.messenger.Utilities$Callback2):void");
        }

        @Override
        public void setLocal(final int i, Integer num, final TLRPC.TL_help_appConfig tL_help_appConfig, long j) {
            MessagesStorage.getInstance(i).getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.AnonymousClass1.lambda$setLocal$2(i, tL_help_appConfig);
                }
            });
        }

        public static void lambda$setLocal$2(int i, TLRPC.TL_help_appConfig tL_help_appConfig) {
            try {
                SQLiteDatabase database = MessagesStorage.getInstance(i).getDatabase();
                if (database != null) {
                    database.executeFast("DELETE FROM app_config").stepThis().dispose();
                    if (tL_help_appConfig != null) {
                        SQLitePreparedStatement sQLitePreparedStatementExecuteFast = database.executeFast("INSERT INTO app_config VALUES(?)");
                        sQLitePreparedStatementExecuteFast.requery();
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_help_appConfig.getObjectSize());
                        tL_help_appConfig.serializeToStream(nativeByteBuffer);
                        sQLitePreparedStatementExecuteFast.bindByteBuffer(1, nativeByteBuffer);
                        sQLitePreparedStatementExecuteFast.step();
                        nativeByteBuffer.reuse();
                        sQLitePreparedStatementExecuteFast.dispose();
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public boolean starsPurchaseAvailable() {
        return !this.starsLocked;
    }

    public boolean premiumFeaturesBlocked() {
        return this.premiumLocked && !getUserConfig().isPremium();
    }

    public boolean premiumPurchaseBlocked() {
        return this.premiumLocked;
    }

    public boolean isTranslationsManualEnabled() {
        return !"disabled".equals(this.translationsManualEnabled);
    }

    public boolean isTranslationsAutoEnabled() {
        return !"disabled".equals(this.translationsAutoEnabled);
    }

    public void getNextReactionMention(final long j, final long j2, final int i, final Consumer consumer) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$getNextReactionMention$5(j2, j, consumer, i);
            }
        });
    }

    public void lambda$getNextReactionMention$5(long r17, long r19, final androidx.core.util.Consumer r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$getNextReactionMention$5(long, long, androidx.core.util.Consumer, int):void");
    }

    public static void lambda$getNextReactionMention$1(Consumer consumer, int i) {
        consumer.accept(Integer.valueOf(i));
    }

    public static void lambda$getNextReactionMention$4(final Consumer consumer, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.lambda$getNextReactionMention$3(tLObject, tL_error, consumer);
            }
        });
    }

    public static void lambda$getNextReactionMention$3(TLObject tLObject, TLRPC.TL_error tL_error, final Consumer consumer) {
        ArrayList<TLRPC.Message> arrayList;
        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
        final int i = 0;
        if (tL_error != null && messages_messages != null && (arrayList = messages_messages.messages) != null && !arrayList.isEmpty()) {
            i = messages_messages.messages.get(0).id;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.lambda$getNextReactionMention$2(consumer, i);
            }
        });
    }

    public static void lambda$getNextReactionMention$2(Consumer consumer, int i) {
        consumer.accept(Integer.valueOf(i));
    }

    public void updatePremium(boolean z) {
        if (this.dialogFilters.isEmpty()) {
            return;
        }
        if (!z) {
            if (!this.dialogFilters.get(0).isDefault()) {
                int i = 1;
                while (true) {
                    if (i >= this.dialogFilters.size()) {
                        break;
                    }
                    if (this.dialogFilters.get(i).isDefault()) {
                        this.dialogFilters.add(0, this.dialogFilters.remove(i));
                        break;
                    }
                    i++;
                }
            }
            lockFiltersInternal();
        } else {
            for (int i2 = 0; i2 < this.dialogFilters.size(); i2++) {
                this.dialogFilters.get(i2).locked = false;
            }
        }
        getMessagesStorage().saveDialogFiltersOrder();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
        getStoriesController().onPremiumChanged();
    }

    public void lockFiltersInternal() {
        boolean z;
        if (getUserConfig().isPremium() || this.dialogFilters.size() - 1 <= this.dialogFiltersLimitDefault) {
            z = false;
        } else {
            int size = (this.dialogFilters.size() - 1) - this.dialogFiltersLimitDefault;
            ArrayList arrayList = new ArrayList(this.dialogFilters);
            Collections.reverse(arrayList);
            z = false;
            for (int i = 0; i < arrayList.size(); i++) {
                if (i < size) {
                    if (!((DialogFilter) arrayList.get(i)).locked) {
                        z = true;
                    }
                    ((DialogFilter) arrayList.get(i)).locked = true;
                } else {
                    if (((DialogFilter) arrayList.get(i)).locked) {
                        z = true;
                    }
                    ((DialogFilter) arrayList.get(i)).locked = false;
                }
            }
        }
        if (z) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
        }
    }

    public int getCaptionMaxLengthLimit() {
        return getUserConfig().isPremium() ? this.captionLengthLimitPremium : this.captionLengthLimitDefault;
    }

    public int getAboutLimit() {
        return getUserConfig().isPremium() ? this.aboutLengthLimitPremium : this.aboutLengthLimitDefault;
    }

    public int getMaxUserReactionsCount() {
        return getUserConfig().isPremium() ? this.reactionsUserMaxPremium : this.reactionsUserMaxDefault;
    }

    public int getChatReactionsCount() {
        if (getUserConfig().isPremium()) {
            return this.reactionsInChatMax;
        }
        return 1;
    }

    public int getChatMaxUniqReactions(long j) {
        TLRPC.ChatFull chatFull = getInstance(this.currentAccount).getChatFull(-j);
        if (chatFull != null && (!(chatFull instanceof TLRPC.TL_chatFull) ? (chatFull.flags2 & 8192) != 0 : (chatFull.flags & 1048576) != 0)) {
            return chatFull.reactions_limit;
        }
        return this.reactionsUniqMax;
    }

    public boolean isPremiumUser(TLRPC.User user) {
        return (premiumFeaturesBlocked() || !user.premium || isSupportUser(user)) ? false : true;
    }

    public boolean didPressTranscribeButtonEnough() {
        return this.transcribeButtonPressed >= 2;
    }

    public void pressTranscribeButton() {
        int i = this.transcribeButtonPressed;
        if (i < 2) {
            this.transcribeButtonPressed = i + 1;
            SharedPreferences sharedPreferences = this.mainPreferences;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putInt("transcribeButtonPressed", this.transcribeButtonPressed).apply();
            }
        }
    }

    public void putLastGiftAuctionUpdate() {
        SharedPreferences sharedPreferences = this.mainPreferences;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putLong("lastGiftAuctionTimeUpdate", System.currentTimeMillis()).apply();
        }
    }

    public boolean giftAuctionUpdateWasRecently() {
        SharedPreferences sharedPreferences = this.mainPreferences;
        return System.currentTimeMillis() - (sharedPreferences != null ? sharedPreferences.getLong("lastGiftAuctionTimeUpdate", 0L) : 0L) < 86400000;
    }

    public ArrayList<TLRPC.TL_messages_stickerSet> filterPremiumStickers(ArrayList<TLRPC.TL_messages_stickerSet> arrayList) {
        if (!premiumFeaturesBlocked()) {
            return arrayList;
        }
        int i = 0;
        while (i < arrayList.size()) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSetFilterPremiumStickers = getInstance(this.currentAccount).filterPremiumStickers(arrayList.get(i));
            if (tL_messages_stickerSetFilterPremiumStickers == null) {
                arrayList.remove(i);
                i--;
            } else {
                arrayList.set(i, tL_messages_stickerSetFilterPremiumStickers);
            }
            i++;
        }
        return arrayList;
    }

    public TLRPC.TL_messages_stickerSet filterPremiumStickers(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
        Exception e;
        if (!premiumFeaturesBlocked() || tL_messages_stickerSet == null) {
            return tL_messages_stickerSet;
        }
        int i = 0;
        for (int i2 = 0; i2 < tL_messages_stickerSet.documents.size(); i2++) {
            try {
            } catch (Exception e2) {
                tL_messages_stickerSet2 = tL_messages_stickerSet;
                e = e2;
            }
            if (MessageObject.isPremiumSticker(tL_messages_stickerSet.documents.get(i2))) {
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_messages_stickerSet.getObjectSize());
                tL_messages_stickerSet.serializeToStream(nativeByteBuffer);
                nativeByteBuffer.position(0);
                tL_messages_stickerSet2 = new TLRPC.TL_messages_stickerSet();
                nativeByteBuffer.readInt32(true);
                tL_messages_stickerSet2.readParams(nativeByteBuffer, true);
                nativeByteBuffer.reuse();
                while (i < tL_messages_stickerSet2.documents.size()) {
                    try {
                        if (MessageObject.isPremiumSticker(tL_messages_stickerSet2.documents.get(i))) {
                            tL_messages_stickerSet2.documents.remove(i);
                            tL_messages_stickerSet2.packs.remove(i);
                            i--;
                            if (tL_messages_stickerSet2.documents.isEmpty()) {
                                return null;
                            }
                        }
                        i++;
                    } catch (Exception e3) {
                        e = e3;
                        e.printStackTrace();
                        return tL_messages_stickerSet2;
                    }
                }
                return tL_messages_stickerSet2;
            }
        }
        return tL_messages_stickerSet;
    }

    public TopicsController getTopicsController() {
        return this.topicsController;
    }

    public TranslateController getTranslateController() {
        return this.translateController;
    }

    public boolean isForum(long j) {
        if (j < 0) {
            TLRPC.Chat chat = getChat(Long.valueOf(-j));
            return chat != null && chat.forum;
        }
        return UserObject.isBotForum(getUser(Long.valueOf(j)));
    }

    public boolean isMonoForum(long j) {
        TLRPC.Chat chat = getChat(Long.valueOf(-j));
        return chat != null && chat.monoforum;
    }

    public boolean isMonoForumWithManageRights(long j) {
        TLRPC.Chat chat = getChat(Long.valueOf(-j));
        return ChatObject.isMonoForum(chat) && ChatObject.canManageMonoForum(this.currentAccount, chat);
    }

    public boolean isForum(MessageObject messageObject) {
        return messageObject != null && isForum(messageObject.getDialogId());
    }

    public boolean isForum(TLRPC.Message message) {
        return message != null && isForum(MessageObject.getDialogId(message));
    }

    public void markAllTopicsAsRead(final long j) {
        getMessagesStorage().loadTopics(j, new java.util.function.Consumer() {
            @Override
            public final void p(Object obj) {
                this.f$0.lambda$markAllTopicsAsRead$9(j, (ArrayList) obj);
            }

            public java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public void lambda$markAllTopicsAsRead$9(final long j, final ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$markAllTopicsAsRead$8(arrayList, j);
            }
        });
    }

    public void lambda$markAllTopicsAsRead$8(ArrayList arrayList, long j) {
        TLRPC.TL_forumTopic tL_forumTopic;
        long peerDialogId;
        if (arrayList != null) {
            int i = 0;
            while (i < arrayList.size()) {
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) arrayList.get(i);
                MessagesController messagesController = getMessagesController();
                int i2 = tL_forumTopic2.top_message;
                TLRPC.Message message = tL_forumTopic2.topMessage;
                int i3 = i;
                messagesController.markDialogAsRead(j, i2, 0, message != null ? message.date : 0, false, isMonoForum(j) ? DialogObject.getPeerDialogId(tL_forumTopic2.from_id) : tL_forumTopic2.id, 0, true, 0);
                MessagesStorage messagesStorage = getMessagesStorage();
                long j2 = -j;
                if (isMonoForum(j)) {
                    tL_forumTopic = tL_forumTopic2;
                    peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
                } else {
                    tL_forumTopic = tL_forumTopic2;
                    peerDialogId = tL_forumTopic.id;
                }
                messagesStorage.updateRepliesMaxReadId(j2, peerDialogId, tL_forumTopic.top_message, 0, true);
                i = i3 + 1;
            }
        }
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$markAllTopicsAsRead$7();
            }
        });
    }

    public void lambda$markAllTopicsAsRead$7() {
        getMessagesStorage().resetAllUnreadCounters(false);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$markAllTopicsAsRead$6();
            }
        });
    }

    public void lambda$markAllTopicsAsRead$6() {
        getMessagesController().sortDialogs(null);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, Boolean.TRUE);
    }

    public String getFullName(long j) {
        if (j > 0) {
            TLRPC.User user = getUser(Long.valueOf(j));
            if (user != null) {
                return ContactsController.formatName(user.first_name, user.last_name);
            }
            return null;
        }
        TLRPC.Chat chat = getChat(Long.valueOf(-j));
        if (chat != null) {
            return chat.title;
        }
        return null;
    }

    public UserNameResolver getUserNameResolver() {
        if (this.userNameResolver == null) {
            this.userNameResolver = new UserNameResolver(this.currentAccount);
        }
        return this.userNameResolver;
    }

    public class SponsoredMessagesInfo {
        public long loadTime;
        public boolean loading;
        public ArrayList<MessageObject> messages;
        public Integer posts_between;

        public SponsoredMessagesInfo() {
        }
    }

    class SendAsPeersInfo {
        private long loadTime;
        private boolean loading;
        private TLRPC.TL_channels_sendAsPeers sendAsPeers;

        private SendAsPeersInfo() {
        }

        SendAsPeersInfo(MessagesController messagesController, AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class FaqSearchResult {
        public int num;
        public String[] path;
        public String title;
        public String url;

        public FaqSearchResult(String str, String[] strArr, String str2) {
            this.title = str;
            this.path = strArr;
            this.url = str2;
        }

        public boolean equals(Object obj) {
            if (obj instanceof FaqSearchResult) {
                return this.title.equals(((FaqSearchResult) obj).title);
            }
            return false;
        }

        public String toString() {
            SerializedData serializedData = new SerializedData();
            serializedData.writeInt32(this.num);
            int i = 0;
            serializedData.writeInt32(0);
            serializedData.writeString(this.title);
            String[] strArr = this.path;
            serializedData.writeInt32(strArr != null ? strArr.length : 0);
            if (this.path != null) {
                while (true) {
                    String[] strArr2 = this.path;
                    if (i >= strArr2.length) {
                        break;
                    }
                    serializedData.writeString(strArr2[i]);
                    i++;
                }
            }
            serializedData.writeString(this.url);
            return Utilities.bytesToHex(serializedData.toByteArray());
        }
    }

    public static class EmojiSound {
        public long accessHash;
        public byte[] fileReference;
        public long id;

        public EmojiSound(long j, long j2, String str) {
            this.id = j;
            this.accessHash = j2;
            this.fileReference = Base64.decode(str, 8);
        }

        public EmojiSound(long j, long j2, byte[] bArr) {
            this.id = j;
            this.accessHash = j2;
            this.fileReference = bArr;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof EmojiSound)) {
                return false;
            }
            EmojiSound emojiSound = (EmojiSound) obj;
            return this.id == emojiSound.id && this.accessHash == emojiSound.accessHash && Arrays.equals(this.fileReference, emojiSound.fileReference);
        }
    }

    public void clearQueryTime() {
        this.lastServerQueryTime.clear();
        this.lastScheduledServerQueryTime.clear();
        this.lastQuickReplyServerQueryTime.clear();
        this.lastSavedServerQueryTime.clear();
    }

    public static class DiceFrameSuccess {
        public int frame;
        public int num;

        public DiceFrameSuccess(int i, int i2) {
            this.frame = i;
            this.num = i2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof DiceFrameSuccess)) {
                return false;
            }
            DiceFrameSuccess diceFrameSuccess = (DiceFrameSuccess) obj;
            return this.frame == diceFrameSuccess.frame && this.num == diceFrameSuccess.num;
        }
    }

    private static class UserActionUpdatesSeq extends TLRPC.Updates {
        private UserActionUpdatesSeq() {
        }

        UserActionUpdatesSeq(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    private static class UserActionUpdatesPts extends TLRPC.Updates {
        private UserActionUpdatesPts() {
        }

        UserActionUpdatesPts(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    private static class ReadTask {
        public long dialogId;
        public int maxDate;
        public int maxId;
        public long monoForumPeerId;
        public long replyId;
        public long sendRequestTime;

        private ReadTask() {
        }

        ReadTask(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class DialogFilter {
        private static int dialogFilterPointer = 10;
        public int color;
        public int flags;
        public int id;
        public int localId;
        public boolean locked;
        public String name;
        public int order;
        public volatile int pendingUnreadCount;
        public boolean title_noanimate;
        public int unreadCount;
        public ArrayList<TLRPC.MessageEntity> entities = new ArrayList<>();
        public ArrayList<Long> alwaysShow = new ArrayList<>();
        public ArrayList<Long> neverShow = new ArrayList<>();
        public LongSparseIntArray pinnedDialogs = new LongSparseIntArray();
        public ArrayList<TLRPC.Dialog> dialogs = new ArrayList<>();
        public ArrayList<TLRPC.Dialog> dialogsForward = new ArrayList<>();
        public ArrayList<TL_chatlists.TL_exportedChatlistInvite> invites = null;

        public DialogFilter() {
            int i = dialogFilterPointer;
            dialogFilterPointer = i + 1;
            this.localId = i;
        }

        public boolean includesDialog(AccountInstance accountInstance, long j) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) accountInstance.getMessagesController().dialogs_dict.get(j);
            if (dialog == null) {
                return false;
            }
            return includesDialog(accountInstance, j, dialog);
        }

        public boolean includesDialog(AccountInstance accountInstance, long j, TLRPC.Dialog dialog) {
            TLRPC.Chat chat;
            if (this.neverShow.contains(Long.valueOf(j))) {
                return false;
            }
            if (this.alwaysShow.contains(Long.valueOf(j))) {
                return true;
            }
            if (dialog.folder_id != 0 && (this.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) != 0) {
                return false;
            }
            MessagesController messagesController = accountInstance.getMessagesController();
            ContactsController contactsController = accountInstance.getContactsController();
            if (((this.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) != 0 && messagesController.isDialogMuted(dialog.id, 0L) && dialog.unread_mentions_count == 0) || ((this.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0 && messagesController.getDialogUnreadCount(dialog) == 0 && !dialog.unread_mark && dialog.unread_mentions_count == 0)) {
                return false;
            }
            if (j > 0) {
                TLRPC.User user = messagesController.getUser(Long.valueOf(j));
                if (user != null) {
                    if (!user.bot) {
                        if (user.self || user.contact || contactsController.isContact(j)) {
                            if ((this.flags & MessagesController.DIALOG_FILTER_FLAG_CONTACTS) != 0) {
                                return true;
                            }
                        } else if ((this.flags & MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) != 0) {
                            return true;
                        }
                    } else if ((this.flags & MessagesController.DIALOG_FILTER_FLAG_BOTS) != 0) {
                        return true;
                    }
                }
            } else if (j < 0 && (chat = messagesController.getChat(Long.valueOf(-j))) != null) {
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    if ((this.flags & MessagesController.DIALOG_FILTER_FLAG_CHANNELS) != 0) {
                        return true;
                    }
                } else if ((this.flags & MessagesController.DIALOG_FILTER_FLAG_GROUPS) != 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean alwaysShow(int i, TLRPC.Dialog dialog) {
            TLRPC.EncryptedChat encryptedChat;
            if (dialog == null) {
                return false;
            }
            long j = dialog.id;
            if (DialogObject.isEncryptedDialog(j) && (encryptedChat = MessagesController.getInstance(i).getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(j)))) != null) {
                j = encryptedChat.user_id;
            }
            return this.alwaysShow.contains(Long.valueOf(j));
        }

        public boolean isDefault() {
            return this.id == 0;
        }

        public boolean isChatlist() {
            return (this.flags & MessagesController.DIALOG_FILTER_FLAG_CHATLIST) > 0;
        }

        public boolean isMyChatlist() {
            return isChatlist() && (this.flags & MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN) > 0;
        }
    }

    public int lambda$new$10(TLRPC.Dialog dialog, TLRPC.Dialog dialog2) {
        DialogFilter dialogFilter = this.sortingDialogFilter;
        int i = dialogFilter == null ? Integer.MIN_VALUE : dialogFilter.pinnedDialogs.get(dialog.id, Integer.MIN_VALUE);
        DialogFilter dialogFilter2 = this.sortingDialogFilter;
        int i2 = dialogFilter2 == null ? Integer.MIN_VALUE : dialogFilter2.pinnedDialogs.get(dialog2.id, Integer.MIN_VALUE);
        boolean z = dialog instanceof TLRPC.TL_dialogFolder;
        if (z && !(dialog2 instanceof TLRPC.TL_dialogFolder)) {
            return -1;
        }
        if (!z && (dialog2 instanceof TLRPC.TL_dialogFolder)) {
            return 1;
        }
        if (i == Integer.MIN_VALUE && i2 != Integer.MIN_VALUE) {
            return 1;
        }
        if (i != Integer.MIN_VALUE && i2 == Integer.MIN_VALUE) {
            return -1;
        }
        if (i != Integer.MIN_VALUE) {
            if (i > i2) {
                return 1;
            }
            return i < i2 ? -1 : 0;
        }
        MediaDataController mediaDataController = getMediaDataController();
        long lastMessageOrDraftDate = DialogObject.getLastMessageOrDraftDate(dialog, mediaDataController.getDraft(dialog.id, 0L));
        long lastMessageOrDraftDate2 = DialogObject.getLastMessageOrDraftDate(dialog2, mediaDataController.getDraft(dialog2.id, 0L));
        if (lastMessageOrDraftDate < lastMessageOrDraftDate2) {
            return 1;
        }
        return lastMessageOrDraftDate > lastMessageOrDraftDate2 ? -1 : 0;
    }

    public void sortDialogsList(ArrayList<TLRPC.Dialog> arrayList) {
        if (arrayList == null) {
            return;
        }
        Collections.sort(arrayList, this.dialogComparator);
    }

    public int lambda$new$11(TLRPC.Dialog dialog, TLRPC.Dialog dialog2) {
        boolean z = dialog instanceof TLRPC.TL_dialogFolder;
        if (z && !(dialog2 instanceof TLRPC.TL_dialogFolder)) {
            return -1;
        }
        if (!z && (dialog2 instanceof TLRPC.TL_dialogFolder)) {
            return 1;
        }
        boolean z2 = dialog.pinned;
        if (!z2 && dialog2.pinned) {
            return 1;
        }
        if (z2 && !dialog2.pinned) {
            return -1;
        }
        if (z2) {
            int i = dialog.pinnedNum;
            int i2 = dialog2.pinnedNum;
            if (i < i2) {
                return 1;
            }
            return i > i2 ? -1 : 0;
        }
        MediaDataController mediaDataController = getMediaDataController();
        long lastMessageOrDraftDate = DialogObject.getLastMessageOrDraftDate(dialog, mediaDataController.getDraft(dialog.id, 0L));
        long lastMessageOrDraftDate2 = DialogObject.getLastMessageOrDraftDate(dialog2, mediaDataController.getDraft(dialog2.id, 0L));
        if (lastMessageOrDraftDate < lastMessageOrDraftDate2) {
            return 1;
        }
        return lastMessageOrDraftDate > lastMessageOrDraftDate2 ? -1 : 0;
    }

    public int lambda$new$12(TLRPC.Update update, TLRPC.Update update2) {
        int updateType = getUpdateType(update);
        int updateType2 = getUpdateType(update2);
        if (updateType != updateType2) {
            return AndroidUtilities.compare(updateType, updateType2);
        }
        if (updateType == 0) {
            return AndroidUtilities.compare(getUpdatePts(update), getUpdatePts(update2));
        }
        if (updateType == 1) {
            return AndroidUtilities.compare(getUpdateQts(update), getUpdateQts(update2));
        }
        if (updateType != 2) {
            return 0;
        }
        long updateChannelId = getUpdateChannelId(update);
        long updateChannelId2 = getUpdateChannelId(update2);
        if (updateChannelId == updateChannelId2) {
            return AndroidUtilities.compare(getUpdatePts(update), getUpdatePts(update2));
        }
        return AndroidUtilities.compare(updateChannelId, updateChannelId2);
    }

    static {
        for (int i = 0; i < 4; i++) {
            lockObjects[i] = new Object();
        }
    }

    public static MessagesController getInstance(int i) {
        MessagesController messagesController = Instance[i];
        if (messagesController == null) {
            synchronized (lockObjects[i]) {
                try {
                    messagesController = Instance[i];
                    if (messagesController == null) {
                        MessagesController[] messagesControllerArr = Instance;
                        MessagesController messagesController2 = new MessagesController(i);
                        messagesControllerArr[i] = messagesController2;
                        messagesController = messagesController2;
                    }
                } finally {
                }
            }
        }
        return messagesController;
    }

    public SharedPreferences getMainSettings() {
        return this.mainPreferences;
    }

    public static SharedPreferences getNotificationsSettings(int i) {
        return getInstance(i).notificationsPreferences;
    }

    public static SharedPreferences getGlobalNotificationsSettings() {
        return getInstance(0).notificationsPreferences;
    }

    public static SharedPreferences getMainSettings(int i) {
        return getInstance(i).mainPreferences;
    }

    public static SharedPreferences getGlobalMainSettings() {
        return getInstance(0).mainPreferences;
    }

    public static SharedPreferences getEmojiSettings(int i) {
        return getInstance(i).emojiPreferences;
    }

    public static SharedPreferences getGlobalEmojiSettings() {
        return getInstance(0).emojiPreferences;
    }

    public MessagesController(int i) {
        super(i);
        this.chats = new ConcurrentHashMap<>(100, 1.0f, 2);
        this.encryptedChats = new ConcurrentHashMap<>(10, 1.0f, 2);
        this.users = new ConcurrentHashMap<>(100, 1.0f, 3);
        this.objectsByUsernames = new ConcurrentHashMap<>(100, 1.0f, 2);
        this.monoForumLinkedChannels = new ConcurrentHashMap<>(3, 1.0f, 2);
        this.activeVoiceChatsMap = new HashMap<>();
        this.joiningToChannels = new ArrayList<>();
        this.exportedChats = new LongSparseArray();
        this.hintDialogs = new ArrayList<>();
        this.dialogsByFolder = new SparseArray<>();
        this.allDialogs = new ArrayList<>();
        this.dialogsForward = new ArrayList<>();
        this.dialogsServerOnly = new ArrayList<>();
        this.dialogsCanAddUsers = new ArrayList<>();
        this.dialogsMyChannels = new ArrayList<>();
        this.dialogsMyGroups = new ArrayList<>();
        this.dialogsChannelsOnly = new ArrayList<>();
        this.dialogsUsersOnly = new ArrayList<>();
        this.dialogsForBlock = new ArrayList<>();
        this.dialogsGroupsOnly = new ArrayList<>();
        this.selectedDialogFilter = new DialogFilter[2];
        this.dialogsLoadedTillDate = Integer.MAX_VALUE;
        this.dialogs_read_inbox_max = new ConcurrentHashMap<>(100, 1.0f, 2);
        this.dialogs_read_outbox_max = new ConcurrentHashMap<>(100, 1.0f, 2);
        this.dialogs_dict = new LongSparseArray();
        this.dialogMessage = new LongSparseArray();
        this.dialogMessagesByRandomIds = new LongSparseArray();
        this.deletedHistory = new LongSparseIntArray();
        this.dialogMessagesByIds = new SparseArray<>();
        this.printingUsers = new ConcurrentHashMap<>(20, 1.0f, 2);
        this.printingStrings = new LongSparseArray();
        this.printingStringsTypes = new LongSparseArray();
        this.sendingTypings = new LongSparseArray[12];
        this.onlinePrivacy = new ConcurrentHashMap<>(20, 1.0f, 2);
        this.pendingUnreadCounter = new LongSparseIntArray();
        this.chatlistFoldersUpdates = new SparseArray<>();
        this.largeQueueMaxActiveOperations = 2;
        this.smallQueueMaxActiveOperations = 5;
        this.storiesChangelogUserId = 777000L;
        this.giveawayAddPeersMax = 10L;
        this.giveawayPeriodMax = 7L;
        this.giveawayCountriesMax = 10L;
        this.giveawayBoostsPerPremium = 4L;
        this.boostsPerSentGift = 3L;
        this.loadingPeerSettings = new LongSparseArray();
        this.createdDialogIds = new ArrayList<>();
        this.createdScheduledDialogIds = new ArrayList<>();
        this.createdDialogMainThreadIds = new ArrayList<>();
        this.visibleDialogMainThreadIds = new ArrayList<>();
        this.visibleScheduledDialogMainThreadIds = new ArrayList<>();
        this.shortPollChannels = new LongSparseIntArray();
        this.needShortPollChannels = new LongSparseArray();
        this.shortPollOnlines = new LongSparseIntArray();
        this.needShortPollOnlines = new LongSparseArray();
        this.deletingDialogs = new LongSparseArray();
        this.clearingHistoryDialogs = new LongSparseArray();
        this.loadingBlockedPeers = false;
        this.blockePeers = new LongSparseIntArray();
        this.totalBlockedCount = -1;
        this.channelViewsToSend = new LongSparseArray();
        this.pollsToCheck = new LongSparseArray();
        this.premiumFeaturesTypesToPosition = new SparseIntArray();
        this.businessFeaturesTypesToPosition = new SparseIntArray();
        this.dialogFilters = new ArrayList<>();
        this.frozenDialogFilters = null;
        this.hiddenUndoChats = new ArrayList<>();
        this.dialogFiltersById = new SparseArray<>();
        this.suggestedFilters = new ArrayList<>();
        this.updatesQueueChannels = new LongSparseArray();
        this.updatesStartWaitTimeChannels = new LongSparseLongArray();
        this.channelsPts = new LongSparseIntArray();
        this.gettingDifferenceChannels = new LongSparseArray();
        this.gettingChatInviters = new LongSparseArray();
        this.gettingUnknownChannels = new LongSparseArray();
        this.gettingUnknownDialogs = new LongSparseArray();
        this.checkingLastMessagesDialogs = new LongSparseArray();
        this.updatesQueueSeq = new ArrayList<>();
        this.updatesQueuePts = new ArrayList<>();
        this.updatesQueueQts = new ArrayList<>();
        this.fullUsers = new LongSparseArray();
        this.fullChats = new LongSparseArray();
        this.groupCalls = new LongSparseArray();
        this.groupCallsByChatId = new LongSparseArray();
        this.userPeerSettings = new LongSparseArray();
        this.loadingFullUsers = new HashSet<>();
        this.loadedFullUsers = new LongSparseLongArray();
        this.loadingFullChats = new HashSet<>();
        this.loadingGroupCalls = new HashSet<>();
        this.loadingFullParticipants = new HashSet<>();
        this.loadedFullParticipants = new HashSet<>();
        this.loadedFullChats = new LongSparseLongArray();
        this.channelAdmins = new LongSparseArray();
        this.loadingChannelAdmins = new LongSparseIntArray();
        this.migratedChats = new SparseIntArray();
        this.sponsoredMessages = new LongSparseArray();
        this.sendAsPeers = new LongSparseArray();
        this.sendAsPeersLiveStories = new LongSparseArray();
        this.reloadingWebpages = new HashMap<>();
        this.reloadingWebpagesPending = new LongSparseArray();
        this.reloadingScheduledWebpages = new HashMap<>();
        this.reloadingScheduledWebpagesPending = new LongSparseArray();
        this.reloadingSavedWebpages = new HashMap<>();
        this.reloadingSavedWebpagesPending = new LongSparseArray();
        this.lastScheduledServerQueryTime = new LongSparseArray();
        this.lastQuickReplyServerQueryTime = new LongSparseArray();
        this.lastSavedServerQueryTime = new LongSparseArray();
        this.lastServerQueryTime = new LongSparseArray();
        this.reloadingMessages = new LongSparseArray();
        this.readTasks = new ArrayList<>();
        this.readTasksMap = new LongSparseArray();
        this.repliesReadTasks = new ArrayList<>();
        this.threadsReadTasksMap = new HashMap<>();
        this.nextDialogsCacheOffset = new SparseIntArray();
        this.loadingDialogs = new SparseBooleanArray();
        this.dialogsEndReached = new SparseBooleanArray();
        this.serverDialogsEndReached = new SparseBooleanArray();
        this.getDifferenceFirstSync = true;
        this.loadingPinnedDialogs = new SparseIntArray();
        this.faqSearchArray = new ArrayList<>();
        this.suggestContacts = true;
        this.themeCheckRunnable = new MessagesController$$ExternalSyntheticLambda90();
        this.passwordCheckRunnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$0();
            }
        };
        this.uploadingThemes = new HashMap<>();
        this.appConfigFetcher = new AnonymousClass1();
        this.maxBroadcastCount = 100;
        this.minGroupConvertSize = 200;
        this.gifSearchEmojies = new ArrayList<>();
        this.diceSuccess = new HashMap<>();
        this.emojiSounds = new HashMap<>();
        this.emojiInteractions = new HashMap<>();
        this.showAnnualPerMonth = false;
        this.starrefStartParamPrefixes = new HashSet();
        this.directPaymentsCurrency = new ArrayList();
        this.emojiStatusUntilValues = new ConcurrentHashMap<>();
        AppGlobalConfig appGlobalConfig = new AppGlobalConfig();
        this.config = appGlobalConfig;
        this.photoSuggestion = new SparseArray<>();
        this.dialogDateComparator = new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return this.f$0.lambda$new$10((TLRPC.Dialog) obj, (TLRPC.Dialog) obj2);
            }
        };
        this.dialogComparator = new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return this.f$0.lambda$new$11((TLRPC.Dialog) obj, (TLRPC.Dialog) obj2);
            }
        };
        this.updatesComparator = new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return this.f$0.lambda$new$12((TLRPC.Update) obj, (TLRPC.Update) obj2);
            }
        };
        this.loadAppConfigRunnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.loadAppConfig();
            }
        };
        this.notifyTranscriptionAudioCooldownUpdate = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$39();
            }
        };
        this.peerDialogsRequested = new LongSparseArray();
        this.peerDialogRequestTimeout = 240000L;
        this.dialogPhotos = new LongSparseArray();
        this.DIALOGS_LOAD_TYPE_CACHE = 1;
        this.DIALOGS_LOAD_TYPE_CHANNEL = 2;
        this.DIALOGS_LOAD_TYPE_UNKNOWN = 3;
        this.sensitiveAgreed = new HashSet<>();
        this.cachedIsUserContactBlocked = new LongSparseArray();
        this.loadingIsUserContactBlocked = new HashSet<>();
        this.requestIsUserContactBlockedRunnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.requestIsUserContactBlocked();
            }
        };
        this.effectsFetcher = new AnonymousClass4();
        this.reportedMessageDelivery = new HashSet<>();
        this.pendingReportMessageDelivery = new HashSet<>();
        this.sendReportMessageDeliver = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$465();
            }
        };
        this.commonChats = new android.util.LongSparseArray<>();
        this.sendingSuggestedMessageApprovalMap = new HashMap<>();
        ImageLoader.getInstance();
        getMessagesStorage();
        getLocationController();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$13();
            }
        });
        addSupportUser();
        if (this.currentAccount == 0) {
            this.notificationsPreferences = ApplicationLoader.applicationContext.getSharedPreferences("Notifications", 0);
            this.mainPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
            this.emojiPreferences = ApplicationLoader.applicationContext.getSharedPreferences("emoji", 0);
        } else {
            this.notificationsPreferences = ApplicationLoader.applicationContext.getSharedPreferences("Notifications" + this.currentAccount, 0);
            this.mainPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig" + this.currentAccount, 0);
            this.emojiPreferences = ApplicationLoader.applicationContext.getSharedPreferences("emoji" + this.currentAccount, 0);
        }
        System.currentTimeMillis();
        this.remoteConfigLoaded = this.mainPreferences.getBoolean("remoteConfigLoaded", false);
        this.secretWebpagePreview = this.mainPreferences.getInt("secretWebpage2", 2);
        this.maxGroupCount = this.mainPreferences.getInt("maxGroupCount", 200);
        this.maxMegagroupCount = this.mainPreferences.getInt("maxMegagroupCount", 10000);
        this.maxRecentGifsCount = this.mainPreferences.getInt("maxRecentGifsCount", 200);
        this.maxRecentStickersCount = this.mainPreferences.getInt("maxRecentStickersCount", 30);
        this.maxFaveStickersCount = this.mainPreferences.getInt("maxFaveStickersCount", 5);
        this.maxEditTime = this.mainPreferences.getInt("maxEditTime", 3600);
        this.ratingDecay = this.mainPreferences.getInt("ratingDecay", 2419200);
        this.linkPrefix = this.mainPreferences.getString("linkPrefix", "t.me");
        this.callReceiveTimeout = this.mainPreferences.getInt("callReceiveTimeout", 20000);
        this.callRingTimeout = this.mainPreferences.getInt("callRingTimeout", 90000);
        this.callConnectTimeout = this.mainPreferences.getInt("callConnectTimeout", 30000);
        this.callPacketTimeout = this.mainPreferences.getInt("callPacketTimeout", 10000);
        this.updateCheckDelay = this.mainPreferences.getInt("updateCheckDelay", 86400);
        this.maxFolderPinnedDialogsCountDefault = this.mainPreferences.getInt("maxFolderPinnedDialogsCountDefault", 100);
        this.maxFolderPinnedDialogsCountPremium = this.mainPreferences.getInt("maxFolderPinnedDialogsCountPremium", 100);
        this.maxMessageLength = this.mainPreferences.getInt("maxMessageLength", 4096);
        this.maxCaptionLength = this.mainPreferences.getInt("maxCaptionLength", 1024);
        this.mapProvider = this.mainPreferences.getInt("mapProvider", 0);
        this.availableMapProviders = this.mainPreferences.getInt("availableMapProviders", 3);
        this.mapKey = this.mainPreferences.getString("pk", null);
        this.installReferer = this.mainPreferences.getString("installReferer", null);
        this.revokeTimeLimit = this.mainPreferences.getInt("revokeTimeLimit", Integer.MAX_VALUE);
        this.revokeTimePmLimit = this.mainPreferences.getInt("revokeTimePmLimit", Integer.MAX_VALUE);
        this.canRevokePmInbox = this.mainPreferences.getBoolean("canRevokePmInbox", this.canRevokePmInbox);
        this.preloadFeaturedStickers = this.mainPreferences.getBoolean("preloadFeaturedStickers", false);
        this.youtubePipType = this.mainPreferences.getString("youtubePipType", "disabled");
        this.keepAliveService = this.mainPreferences.getBoolean("keepAliveService", false);
        this.backgroundConnection = this.mainPreferences.getBoolean("keepAliveService", false);
        this.promoDialogId = this.mainPreferences.getLong("proxy_dialog", 0L);
        this.nextPromoInfoCheckTime = this.mainPreferences.getInt("nextPromoInfoCheckTime", 0);
        this.promoDialogType = this.mainPreferences.getInt("promo_dialog_type", 0);
        this.promoPsaMessage = this.mainPreferences.getString("promo_psa_message", null);
        this.promoPsaType = this.mainPreferences.getString("promo_psa_type", null);
        this.proxyDialogAddress = this.mainPreferences.getString("proxyDialogAddress", null);
        this.venueSearchBot = this.mainPreferences.getString("venueSearchBot", "foursquare");
        this.storyVenueSearchBot = this.mainPreferences.getString("storyVenueSearchBot", "foursquare");
        this.gifSearchBot = this.mainPreferences.getString("gifSearchBot", "gif");
        this.imageSearchBot = this.mainPreferences.getString("imageSearchBot", "pic");
        this.blockedCountry = this.mainPreferences.getBoolean("blockedCountry", false);
        this.suggestedLangCode = this.mainPreferences.getString("suggestedLangCode", "en");
        this.animatedEmojisZoom = this.mainPreferences.getFloat("animatedEmojisZoom", 0.625f);
        this.qrLoginCamera = this.mainPreferences.getBoolean("qrLoginCamera", true);
        this.saveGifsWithStickers = this.mainPreferences.getBoolean("saveGifsWithStickers", false);
        this.filtersEnabled = this.mainPreferences.getBoolean("filtersEnabled", false);
        this.getfileExperimentalParams = this.mainPreferences.getBoolean("getfileExperimentalParams", false);
        this.smsjobsStickyNotificationEnabled = this.mainPreferences.getBoolean("smsjobsStickyNotificationEnabled", false);
        this.showFiltersTooltip = this.mainPreferences.getBoolean("showFiltersTooltip", false);
        this.autoarchiveAvailable = this.mainPreferences.getBoolean("autoarchiveAvailable", false);
        this.groupCallVideoMaxParticipants = this.mainPreferences.getInt("groipCallVideoMaxParticipants", 30);
        this.chatReadMarkSizeThreshold = this.mainPreferences.getInt("chatReadMarkSizeThreshold", 100);
        this.chatReadMarkExpirePeriod = this.mainPreferences.getInt("chatReadMarkExpirePeriod", 604800);
        this.ringtoneDurationMax = this.mainPreferences.getInt("ringtoneDurationMax", 5);
        this.ringtoneSizeMax = this.mainPreferences.getInt("ringtoneSizeMax", 102400);
        this.pmReadDateExpirePeriod = this.mainPreferences.getInt("pmReadDateExpirePeriod", 604800);
        this.suggestStickersApiOnly = this.mainPreferences.getBoolean("suggestStickersApiOnly", false);
        this.roundVideoSize = this.mainPreferences.getInt("roundVideoSize", 384);
        this.roundVideoBitrate = this.mainPreferences.getInt("roundVideoBitrate", 1000);
        this.roundAudioBitrate = this.mainPreferences.getInt("roundAudioBitrate", 64);
        this.pendingSuggestions = this.mainPreferences.getStringSet("pendingSuggestions", null);
        this.dismissedSuggestions = this.mainPreferences.getStringSet("dismissedSuggestions", null);
        int i2 = this.mainPreferences.getInt("channelsLimitDefault", 500);
        this.channelsLimitDefault = i2;
        this.channelsLimitPremium = this.mainPreferences.getInt("channelsLimitPremium", i2 * 2);
        this.savedGifsLimitDefault = this.mainPreferences.getInt("savedGifsLimitDefault", 200);
        this.savedGifsLimitPremium = this.mainPreferences.getInt("savedGifsLimitPremium", 400);
        this.stickersFavedLimitDefault = this.mainPreferences.getInt("stickersFavedLimitDefault", 5);
        this.stickersFavedLimitPremium = this.mainPreferences.getInt("stickersFavedLimitPremium", 200);
        this.maxPinnedDialogsCountDefault = this.mainPreferences.getInt("maxPinnedDialogsCountDefault", 5);
        this.maxPinnedDialogsCountPremium = this.mainPreferences.getInt("maxPinnedDialogsCountPremium", 5);
        this.maxPinnedDialogsCountDefault = this.mainPreferences.getInt("maxPinnedDialogsCountDefault", 5);
        this.maxPinnedDialogsCountPremium = this.mainPreferences.getInt("maxPinnedDialogsCountPremium", 5);
        this.dialogFiltersLimitDefault = this.mainPreferences.getInt("dialogFiltersLimitDefault", 10);
        this.dialogFiltersLimitPremium = this.mainPreferences.getInt("dialogFiltersLimitPremium", 20);
        this.dialogFiltersChatsLimitDefault = this.mainPreferences.getInt("dialogFiltersChatsLimitDefault", 100);
        this.dialogFiltersChatsLimitPremium = this.mainPreferences.getInt("dialogFiltersChatsLimitPremium", 200);
        this.dialogFiltersPinnedLimitDefault = this.mainPreferences.getInt("dialogFiltersPinnedLimitDefault", 5);
        this.dialogFiltersPinnedLimitPremium = this.mainPreferences.getInt("dialogFiltersPinnedLimitPremium", 10);
        this.publicLinksLimitDefault = this.mainPreferences.getInt("publicLinksLimitDefault", 10);
        this.publicLinksLimitPremium = this.mainPreferences.getInt("publicLinksLimitPremium", 20);
        this.captionLengthLimitDefault = this.mainPreferences.getInt("captionLengthLimitDefault", 1024);
        this.captionLengthLimitPremium = this.mainPreferences.getInt("captionLengthLimitPremium", 4096);
        this.storyCaptionLengthLimitDefault = this.mainPreferences.getInt("storyCaptionLengthLimit", 200);
        this.storyCaptionLengthLimitPremium = this.mainPreferences.getInt("storyCaptionLengthLimitPremium", 2048);
        this.aboutLengthLimitDefault = this.mainPreferences.getInt("aboutLengthLimitDefault", 70);
        this.aboutLengthLimitPremium = this.mainPreferences.getInt("aboutLengthLimitPremium", 140);
        this.reactionsUserMaxDefault = this.mainPreferences.getInt("reactionsUserMaxDefault", 1);
        this.reactionsUserMaxPremium = this.mainPreferences.getInt("reactionsUserMaxPremium", 3);
        this.reactionsInChatMax = this.mainPreferences.getInt("reactionsInChatMax", 3);
        int i3 = this.mainPreferences.getInt("uploadMaxFileParts", 4000);
        this.uploadMaxFileParts = i3;
        this.uploadMaxFilePartsPremium = this.mainPreferences.getInt("uploadMaxFilePartsPremium", i3 * 2);
        this.premiumInvoiceSlug = this.mainPreferences.getString("premiumInvoiceSlug", null);
        this.verifyAgeBotUsername = this.mainPreferences.getString("verifyAgeBotUsername", null);
        this.verifyAgeCountry = this.mainPreferences.getString("verifyAgeCountry", "GB");
        this.verifyAgeMin = this.mainPreferences.getInt("verifyAgeMin", 18);
        this.premiumBotUsername = this.mainPreferences.getString("premiumBotUsername", null);
        this.premiumLocked = this.mainPreferences.getBoolean("premiumLocked", false);
        this.starsLocked = this.mainPreferences.getBoolean("starsLocked", true);
        this.transcribeButtonPressed = this.mainPreferences.getInt("transcribeButtonPressed", 0);
        this.forumUpgradeParticipantsMin = this.mainPreferences.getInt("forumUpgradeParticipantsMin", 200);
        this.topicsPinnedLimit = this.mainPreferences.getInt("topicsPinnedLimit", 3);
        this.telegramAntispamUserId = this.mainPreferences.getLong("telegramAntispamUserId", -1L);
        this.telegramAntispamGroupSizeMin = this.mainPreferences.getInt("telegramAntispamGroupSizeMin", 100);
        this.hiddenMembersGroupSizeMin = this.mainPreferences.getInt("hiddenMembersGroupSizeMin", 100);
        this.chatlistUpdatePeriod = this.mainPreferences.getInt("chatlistUpdatePeriod", 3600);
        this.uploadMarkupVideo = this.mainPreferences.getBoolean("uploadMarkupVideo", true);
        this.giftAttachMenuIcon = this.mainPreferences.getBoolean("giftAttachMenuIcon", false);
        this.giftTextFieldIcon = this.mainPreferences.getBoolean("giftTextFieldIcon", false);
        this.checkResetLangpack = this.mainPreferences.getInt("checkResetLangpack", 0);
        this.smallQueueMaxActiveOperations = this.mainPreferences.getInt("smallQueueMaxActiveOperations", 5);
        this.largeQueueMaxActiveOperations = this.mainPreferences.getInt("largeQueueMaxActiveOperations", 2);
        this.stealthModeFuture = this.mainPreferences.getInt("stories_stealth_future_period", 1500);
        this.storiesChangelogUserId = this.mainPreferences.getLong("stories_changelog_user_id", 777000L);
        this.giveawayAddPeersMax = this.mainPreferences.getLong("giveaway_add_peers_max", 10L);
        this.giveawayCountriesMax = this.mainPreferences.getLong("giveaway_countries_max", 10L);
        this.giveawayBoostsPerPremium = this.mainPreferences.getLong("giveaway_boosts_per_premium", 4L);
        this.boostsPerSentGift = this.mainPreferences.getLong("boosts_per_sent_gift", 3L);
        this.giveawayPeriodMax = this.mainPreferences.getLong("giveaway_period_max", 7L);
        this.stealthModePast = this.mainPreferences.getInt("stories_stealth_past_period", 300);
        this.stealthModeCooldown = this.mainPreferences.getInt("stories_stealth_cooldown_period", 3600);
        boolean z = ConnectionsManager.native_isTestBackend(this.currentAccount) != 0;
        this.chatlistInvitesLimitDefault = this.mainPreferences.getInt("chatlistInvitesLimitDefault", 3);
        this.storyExpiringLimitDefault = this.mainPreferences.getInt("storyExpiringLimitDefault", 50);
        this.storyExpiringLimitPremium = this.mainPreferences.getInt("storyExpiringLimitPremium", 100);
        this.storiesSentWeeklyLimitDefault = this.mainPreferences.getInt("storiesSentWeeklyLimitDefault", 7);
        this.storiesSuggestedReactionsLimitDefault = this.mainPreferences.getInt("storiesSuggestedReactionsLimitDefault", 1);
        this.storiesSuggestedReactionsLimitPremium = this.mainPreferences.getInt("storiesSuggestedReactionsLimitPremium", 5);
        this.storiesSentWeeklyLimitPremium = this.mainPreferences.getInt("storiesSentWeeklyLimitPremium", 70);
        this.storiesSentMonthlyLimitDefault = this.mainPreferences.getInt("storiesSentMonthlyLimitDefault", 30);
        this.storiesSentMonthlyLimitPremium = this.mainPreferences.getInt("storiesSentMonthlyLimitPremium", 300);
        this.channelBgIconLevelMin = this.mainPreferences.getInt("channelBgIconLevelMin", 1);
        this.channelProfileIconLevelMin = this.mainPreferences.getInt("channelProfileIconLevelMin", 1);
        this.channelEmojiStatusLevelMin = this.mainPreferences.getInt("channelEmojiStatusLevelMin", 1);
        this.groupProfileBgIconLevelMin = this.mainPreferences.getInt("groupProfileBgIconLevelMin", 1);
        this.groupEmojiStatusLevelMin = this.mainPreferences.getInt("groupEmojiStatusLevelMin", 1);
        this.groupEmojiStickersLevelMin = this.mainPreferences.getInt("groupEmojiStickersLevelMin", 1);
        this.groupWallpaperLevelMin = this.mainPreferences.getInt("groupWallpaperLevelMin", 1);
        this.groupCustomWallpaperLevelMin = this.mainPreferences.getInt("groupCustomWallpaperLevelMin", 1);
        this.groupTranscribeLevelMin = this.mainPreferences.getInt("groupTranscribeLevelMin", 1);
        this.quickRepliesLimit = this.mainPreferences.getInt("quickRepliesLimit", 10);
        this.quickReplyMessagesLimit = this.mainPreferences.getInt("quickReplyMessagesLimit", 20);
        this.channelWallpaperLevelMin = this.mainPreferences.getInt("channelWallpaperLevelMin", 1);
        this.channelCustomWallpaperLevelMin = this.mainPreferences.getInt("channelCustomWallpaperLevelMin", 1);
        this.chatlistInvitesLimitPremium = this.mainPreferences.getInt("chatlistInvitesLimitPremium", z ? 5 : 20);
        this.chatlistJoinedLimitDefault = this.mainPreferences.getInt("chatlistJoinedLimitDefault", 2);
        this.chatlistJoinedLimitPremium = this.mainPreferences.getInt("chatlistJoinedLimitPremium", z ? 5 : 20);
        this.stargiftsMessageLengthMax = this.mainPreferences.getInt("stargiftsMessageLengthMax", 255);
        this.stargiftsConvertPeriodMax = this.mainPreferences.getInt("stargiftsConvertPeriodMax", z ? 300 : 7776000);
        this.videoIgnoreAltDocuments = this.mainPreferences.getBoolean("videoIgnoreAltDocuments", false);
        this.disableBotFullscreenBlur = this.mainPreferences.getBoolean("disableBotFullscreenBlur", false);
        this.tonBlockchainExplorerUrl = this.mainPreferences.getString("tonBlockchainExplorerUrl", "https://tonviewer.com/");
        this.starsPaidMessageAmountMax = this.mainPreferences.getLong("starsPaidMessageAmountMax", 10000L);
        this.starsPaidMessageCommissionPermille = this.mainPreferences.getInt("starsPaidMessageCommissionPermille", 850);
        this.stargiftsPinnedToTopLimit = this.mainPreferences.getInt("stargiftsPinnedToTopLimit", 6);
        this.starsPaidMessagesAvailable = this.mainPreferences.getBoolean("starsPaidMessagesAvailable", true);
        this.freezeSinceDate = this.mainPreferences.getLong("freezeSinceDate", 0L);
        this.freezeUntilDate = this.mainPreferences.getLong("freezeUntilDate", 0L);
        this.conferenceCallSizeLimit = this.mainPreferences.getInt("conferenceCallSizeLimit", z ? 5 : 100);
        this.callRequestsDisabled = this.mainPreferences.getBoolean("callRequestsDisabled", false);
        this.pollAnswersMax = this.mainPreferences.getInt("pollAnswersMax", 12);
        this.todoItemsMax = this.mainPreferences.getInt("todoItemsMax", z ? 10 : 30);
        this.todoTitleLengthMax = this.mainPreferences.getInt("todoTitleLengthMax", 32);
        this.todoItemLengthMax = this.mainPreferences.getInt("todoItemLengthMax", 64);
        this.translationsManualEnabled = this.mainPreferences.getString("translationsManualEnabled", "enabled");
        this.translationsAutoEnabled = this.mainPreferences.getString("translationsAutoEnabled", "enabled");
        this.whitelistedBots = (HashSet) Collection.EL.stream(this.mainPreferences.getStringSet("whitelistedBots", new HashSet())).map(new Function() {
            public Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override
            public final Object apply(Object obj) {
                return MessagesController.lambda$new$14((String) obj);
            }

            public Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new MessagesController$$ExternalSyntheticLambda92()));
        this.starsGroupcallMessageAmountMax = this.mainPreferences.getInt("starsGroupcallMessageAmountMax", 10000);
        this.starsGroupcallMessageLimits = HighlightMessageSheet.parseTiersString(this.mainPreferences.getString("starsGroupcallMessageLimits", null));
        this.freezeAppealUrl = this.mainPreferences.getString("freezeAppealUrl", "t.me/spambot");
        this.enableGiftsInProfile = this.mainPreferences.getBoolean("enableGiftsInProfile", true);
        this.storiesPosting = this.mainPreferences.getString("storiesPosting", "enabled");
        this.storiesEntities = this.mainPreferences.getString("storiesEntities", "premium");
        this.storiesExportNopublicLink = this.mainPreferences.getBoolean("storiesExportNopublicLink", false);
        this.authorizationAutoconfirmPeriod = this.mainPreferences.getInt("authorization_autoconfirm_period", 604800);
        this.quoteLengthMax = this.mainPreferences.getInt("quoteLengthMax", 1024);
        this.giveawayGiftsPurchaseAvailable = this.mainPreferences.getBoolean("giveawayGiftsPurchaseAvailable", false);
        this.peerColors = PeerColors.fromString(0, this.mainPreferences.getString("peerColors", ""));
        this.profilePeerColors = PeerColors.fromString(1, this.mainPreferences.getString("profilePeerColors", ""));
        int i4 = this.mainPreferences.getInt("transcribeAudioTrialWeeklyNumber", BuildVars.DEBUG_PRIVATE_VERSION ? 2 : 0);
        this.transcribeAudioTrialWeeklyNumber = i4;
        this.transcribeAudioTrialCurrentNumber = this.mainPreferences.getInt("transcribeAudioTrialCurrentNumber", i4);
        this.transcribeAudioTrialDurationMax = this.mainPreferences.getInt("transcribeAudioTrialDurationMax", 300);
        this.transcribeAudioTrialCooldownUntil = this.mainPreferences.getInt("transcribeAudioTrialCooldownUntil", 0);
        this.recommendedChannelsLimitDefault = this.mainPreferences.getInt("recommendedChannelsLimitDefault", 10);
        this.recommendedChannelsLimitPremium = this.mainPreferences.getInt("recommendedChannelsLimitPremium", 100);
        this.boostsChannelLevelMax = this.mainPreferences.getInt("boostsChannelLevelMax", 100);
        this.channelRestrictSponsoredLevelMin = this.mainPreferences.getInt("channelRestrictSponsoredLevelMin", 30);
        this.channelAutotranslationLevelMin = this.mainPreferences.getInt("channelAutotranslationLevelMin", 3);
        this.savedDialogsPinnedLimitDefault = this.mainPreferences.getInt("savedDialogsPinnedLimitDefault", 4);
        this.savedDialogsPinnedLimitPremium = this.mainPreferences.getInt("savedDialogsPinnedLimitPremium", 6);
        this.storyQualityFull = this.mainPreferences.getBoolean("storyQualityFull", true);
        this.savedViewAsChats = this.mainPreferences.getBoolean("savedViewAsChats", false);
        this.folderTags = this.mainPreferences.getBoolean("folderTags", false);
        this.uploadPremiumSpeedupUpload = this.mainPreferences.getFloat("uploadPremiumSpeedupUpload", 10.0f);
        this.uploadPremiumSpeedupDownload = this.mainPreferences.getFloat("uploadPremiumSpeedupDownload", 10.0f);
        this.uploadPremiumSpeedupNotifyPeriod = this.mainPreferences.getInt("uploadPremiumSpeedupNotifyPeriod2", 3600);
        this.introTitleLengthLimit = this.mainPreferences.getInt("introTitleLengthLimit", 32);
        this.introDescriptionLengthLimit = this.mainPreferences.getInt("introDescriptionLengthLimit", 72);
        this.businessChatLinksLimit = this.mainPreferences.getInt("businessChatLinksLimit", 100);
        this.channelRevenueWithdrawalEnabled = this.mainPreferences.getBoolean("channelRevenueWithdrawalEnabled", false);
        this.newNoncontactPeersRequirePremiumWithoutOwnpremium = this.mainPreferences.getBoolean("newNoncontactPeersRequirePremiumWithoutOwnpremium", false);
        this.reactionsUniqMax = this.mainPreferences.getInt("reactionsUniqMax", 11);
        this.premiumManageSubscriptionUrl = this.mainPreferences.getString("premiumManageSubscriptionUrl", ApplicationLoader.isStandaloneBuild() ? "https://t.me/premiumbot?start=status" : "https://play.google.com/store/account/subscriptions?sku=telegram_premium&package=org.telegram.messenger");
        this.androidDisableRoundCamera2 = this.mainPreferences.getBoolean("androidDisableRoundCamera2", true);
        this.storiesPinnedToTopCountMax = this.mainPreferences.getInt("storiesPinnedToTopCountMax", 3);
        this.showAnnualPerMonth = this.mainPreferences.getBoolean("showAnnualPerMonth", false);
        this.canEditFactcheck = this.mainPreferences.getBoolean("canEditFactcheck", false);
        this.factcheckLengthLimit = this.mainPreferences.getInt("factcheckLengthLimit", 1024);
        this.starsRevenueWithdrawalMin = this.mainPreferences.getLong("starsRevenueWithdrawalMin", 1000L);
        this.starsPaidPostAmountMax = this.mainPreferences.getLong("starsPaidPostAmountMax", 10000L);
        this.botPreviewMediasMax = this.mainPreferences.getInt("botPreviewMediasMax", 10);
        this.webAppAllowedProtocols = this.mainPreferences.getStringSet("webAppAllowedProtocols", new HashSet(Arrays.asList("http", "https")));
        this.ignoreRestrictionReasons = this.mainPreferences.getStringSet("ignoreRestrictionReasons", new HashSet(Arrays.asList(new String[0])));
        this.tonProxyAddress = this.mainPreferences.getString("tonProxyAddress", "magic.org");
        this.weatherSearchUsername = this.mainPreferences.getString("weatherSearchUsername", "izweatherbot");
        this.storyWeatherPreload = this.mainPreferences.getBoolean("storyWeatherPreload", true);
        this.starsGiftsEnabled = this.mainPreferences.getBoolean("starsGiftsEnabled", true);
        this.stargiftsBlocked = this.mainPreferences.getBoolean("stargiftsBlocked", true);
        this.starsPaidReactionAmountMax = this.mainPreferences.getLong("starsPaidReactionAmountMax", 10000L);
        this.starsSubscriptionAmountMax = this.mainPreferences.getLong("starsSubscriptionAmountMax", 2500L);
        this.starsUsdSellRate1000 = this.mainPreferences.getFloat("starsUsdSellRate1000", 2000.0f);
        this.starsUsdWithdrawRate1000 = this.mainPreferences.getFloat("starsUsdWithdrawRate1000", 1200.0f);
        this.sponsoredLinksInappAllow = this.mainPreferences.getBoolean("sponsoredLinksInappAllow", false);
        this.starrefProgramAllowed = this.mainPreferences.getBoolean("starrefProgramAllowed", false);
        this.starrefConnectAllowed = this.mainPreferences.getBoolean("starrefConnectAllowed", false);
        this.starrefStartParamPrefixes = this.mainPreferences.getStringSet("starrefStartParamPrefixes", new HashSet(Arrays.asList("_tgr_")));
        this.starrefMinCommissionPermille = this.mainPreferences.getInt("starrefMinCommissionPermille", 1);
        this.starrefMaxCommissionPermille = this.mainPreferences.getInt("starrefMaxCommissionPermille", 400);
        this.botVerificationDescriptionLengthLimit = this.mainPreferences.getInt("botVerificationDescriptionLengthLimit", 70);
        this.paidReactionsPrivacyTime = this.mainPreferences.getLong("paidReactionsAnonymousTime", 0L);
        this.tonStakeddiceStakeAmountMin = this.mainPreferences.getLong("tonStakeddiceStakeAmountMin", 100000000L);
        this.tonStakeddiceStakeAmountMax = this.mainPreferences.getLong("tonStakeddiceStakeAmountMax", 50000000000L);
        this.tonStakediceStakeSuggestedAmounts = DesugarArrays.stream(this.mainPreferences.getString("tonStakediceStakeSuggestedAmounts", "100000000,1000000000,2000000000,5000000000,10000000000,20000000000").split(",")).mapToLong(new ToLongFunction() {
            @Override
            public final long applyAsLong(Object obj) {
                return Long.parseLong((String) obj);
            }
        }).toArray();
        this.stargiftsCraftAttributesPermilles = (int[][]) DesugarArrays.stream(this.mainPreferences.getString("stargiftsCraftAttributesPermilles", "90,,80,200,,70,190,460,,60,180,450,1000").split(",,")).map(new Function() {
            public Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override
            public final Object apply(Object obj) {
                return MessagesController.lambda$new$15((String) obj);
            }

            public Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).toArray(new IntFunction() {
            @Override
            public final Object apply(int i5) {
                return MessagesController.lambda$new$16(i5);
            }
        });
        appGlobalConfig.load(this.mainPreferences);
        System.currentTimeMillis();
        this.paidReactionsPrivacy = null;
        if (System.currentTimeMillis() - this.paidReactionsPrivacyTime < 7200000) {
            if (this.mainPreferences.contains("paidReactionsDialogId")) {
                this.paidReactionsPrivacy = Long.valueOf(this.mainPreferences.getLong("paidReactionsDialogId", 0L));
            } else {
                this.paidReactionsPrivacy = Long.valueOf(this.mainPreferences.getBoolean("paidReactionsAnonymous", false) ? 2666000L : 0L);
            }
        }
        scheduleTranscriptionUpdate();
        BuildVars.GOOGLE_AUTH_CLIENT_ID = this.mainPreferences.getString("googleAuthClientId", BuildVars.GOOGLE_AUTH_CLIENT_ID);
        if (this.mainPreferences.contains("dcDomainName2")) {
            this.dcDomainName = this.mainPreferences.getString("dcDomainName2", "apv3.stel.com");
        } else {
            this.dcDomainName = z ? "tapv3.stel.com" : "apv3.stel.com";
        }
        if (this.mainPreferences.contains("webFileDatacenterId")) {
            this.webFileDatacenterId = this.mainPreferences.getInt("webFileDatacenterId", 4);
        } else {
            this.webFileDatacenterId = z ? 2 : 4;
        }
        Set<String> stringSet = this.mainPreferences.getStringSet("directPaymentsCurrency", null);
        if (stringSet != null) {
            this.directPaymentsCurrency.clear();
            this.directPaymentsCurrency.addAll(stringSet);
        }
        loadPremiumFeaturesPreviewOrder(this.premiumFeaturesTypesToPosition, this.mainPreferences.getString("premiumFeaturesTypesToPosition", null));
        loadPremiumFeaturesPreviewOrder(this.businessFeaturesTypesToPosition, this.mainPreferences.getString("businessFeaturesTypesToPosition", null));
        if (this.pendingSuggestions != null) {
            this.pendingSuggestions = new HashSet(this.pendingSuggestions);
        } else {
            this.pendingSuggestions = new HashSet();
        }
        if (this.dismissedSuggestions != null) {
            this.dismissedSuggestions = new HashSet(this.dismissedSuggestions);
        } else {
            this.dismissedSuggestions = new HashSet();
        }
        Set<String> stringSet2 = this.mainPreferences.getStringSet("exportUri2", null);
        this.exportUri = stringSet2;
        if (stringSet2 != null) {
            this.exportUri = new HashSet(this.exportUri);
        } else {
            HashSet hashSet = new HashSet();
            this.exportUri = hashSet;
            hashSet.add("content://(\\d+@)?com\\.whatsapp\\.provider\\.media/export_chat/");
            this.exportUri.add("content://(\\d+@)?com\\.whatsapp\\.w4b\\.provider\\.media/export_chat/");
            this.exportUri.add("content://jp\\.naver\\.line\\.android\\.line\\.common\\.FileProvider/export-chat/");
            this.exportUri.add(".*WhatsApp.*\\.txt$");
            this.exportUri.add(".*WhatsApp.*\\.zip$");
        }
        Set<String> stringSet3 = this.mainPreferences.getStringSet("exportGroupUri", null);
        this.exportGroupUri = stringSet3;
        if (stringSet3 != null) {
            this.exportGroupUri = new HashSet(this.exportGroupUri);
        } else {
            HashSet hashSet2 = new HashSet();
            this.exportGroupUri = hashSet2;
            hashSet2.add("@g.us/");
        }
        Set<String> stringSet4 = this.mainPreferences.getStringSet("exportPrivateUri", null);
        this.exportPrivateUri = stringSet4;
        if (stringSet4 != null) {
            this.exportPrivateUri = new HashSet(this.exportPrivateUri);
        } else {
            HashSet hashSet3 = new HashSet();
            this.exportPrivateUri = hashSet3;
            hashSet3.add("@s.whatsapp.net/");
        }
        Set<String> stringSet5 = this.mainPreferences.getStringSet("autologinDomains", null);
        this.autologinDomains = stringSet5;
        if (stringSet5 != null) {
            this.autologinDomains = new HashSet(this.autologinDomains);
        } else {
            this.autologinDomains = new HashSet();
        }
        Set<String> stringSet6 = this.mainPreferences.getStringSet("authDomains", null);
        this.authDomains = stringSet6;
        if (stringSet6 != null) {
            this.authDomains = new HashSet(this.authDomains);
        } else {
            this.authDomains = new HashSet();
        }
        this.autologinToken = this.mainPreferences.getString("autologinToken", null);
        Set<String> stringSet7 = this.mainPreferences.getStringSet("diceEmojies", null);
        if (stringSet7 == null) {
            HashSet<String> hashSet4 = new HashSet<>();
            this.diceEmojies = hashSet4;
            hashSet4.add("🎲");
            this.diceEmojies.add("🎯");
        } else {
            this.diceEmojies = new HashSet<>(stringSet7);
        }
        String string = this.mainPreferences.getString("diceSuccess", null);
        if (string == null) {
            this.diceSuccess.put("🎯", new DiceFrameSuccess(62, 6));
        } else {
            try {
                byte[] bArrDecode = Base64.decode(string, 0);
                if (bArrDecode != null) {
                    SerializedData serializedData = new SerializedData(bArrDecode);
                    int int32 = serializedData.readInt32(true);
                    for (int i5 = 0; i5 < int32; i5++) {
                        this.diceSuccess.put(serializedData.readString(true), new DiceFrameSuccess(serializedData.readInt32(true), serializedData.readInt32(true)));
                    }
                    serializedData.cleanup();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        String string2 = this.mainPreferences.getString("emojiSounds", null);
        if (string2 != null) {
            try {
                byte[] bArrDecode2 = Base64.decode(string2, 0);
                if (bArrDecode2 != null) {
                    SerializedData serializedData2 = new SerializedData(bArrDecode2);
                    int int322 = serializedData2.readInt32(true);
                    for (int i6 = 0; i6 < int322; i6++) {
                        this.emojiSounds.put(serializedData2.readString(true), new EmojiSound(serializedData2.readInt64(true), serializedData2.readInt64(true), serializedData2.readByteArray(true)));
                    }
                    serializedData2.cleanup();
                }
            } catch (Exception e2) {
                FileLog.e(e2);
            }
        }
        String string3 = this.mainPreferences.getString("gifSearchEmojies", null);
        if (string3 == null) {
            this.gifSearchEmojies.add("👍");
            this.gifSearchEmojies.add("👎");
            this.gifSearchEmojies.add("😍");
            this.gifSearchEmojies.add("😂");
            this.gifSearchEmojies.add("😮");
            this.gifSearchEmojies.add("🙄");
            this.gifSearchEmojies.add("😥");
            this.gifSearchEmojies.add("😡");
            this.gifSearchEmojies.add("🥳");
            this.gifSearchEmojies.add("😎");
        } else {
            try {
                byte[] bArrDecode3 = Base64.decode(string3, 0);
                if (bArrDecode3 != null) {
                    SerializedData serializedData3 = new SerializedData(bArrDecode3);
                    int int323 = serializedData3.readInt32(true);
                    for (int i7 = 0; i7 < int323; i7++) {
                        this.gifSearchEmojies.add(serializedData3.readString(true));
                    }
                    serializedData3.cleanup();
                }
            } catch (Exception e3) {
                FileLog.e(e3);
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.loadAppConfig();
            }
        }, 2000L);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$17();
            }
        }, 400L);
        this.topicsController = new TopicsController(i);
        this.cacheByChatsController = new CacheByChatsController(i);
        this.translateController = new TranslateController(this);
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$18();
            }
        });
    }

    public void lambda$new$13() {
        MessagesController messagesController = getMessagesController();
        getNotificationCenter().addObserver(messagesController, NotificationCenter.fileUploaded);
        getNotificationCenter().addObserver(messagesController, NotificationCenter.fileUploadFailed);
        getNotificationCenter().addObserver(messagesController, NotificationCenter.fileUploadProgressChanged);
        getNotificationCenter().addObserver(messagesController, NotificationCenter.fileLoaded);
        getNotificationCenter().addObserver(messagesController, NotificationCenter.fileLoadFailed);
        getNotificationCenter().addObserver(messagesController, NotificationCenter.messageReceivedByServer);
        getNotificationCenter().addObserver(messagesController, NotificationCenter.updateMessageMedia);
    }

    public static Long lambda$new$14(String str) {
        return Long.valueOf(Utilities.tryParseLong(str, 0L));
    }

    public static int[] lambda$new$15(String str) {
        return DesugarArrays.stream(str.split(",")).mapToInt(new MessagesController$$ExternalSyntheticLambda325()).toArray();
    }

    public static int[][] lambda$new$16(int i) {
        return new int[i][];
    }

    public void lambda$new$17() {
        checkPeerColors(false);
    }

    public void lambda$new$18() {
        this.enableJoined = this.notificationsPreferences.getBoolean("EnableContactJoined", true);
        this.nextTosCheckTime = this.notificationsPreferences.getInt("nextTosCheckTime", 0);
    }

    private void sendLoadPeersRequest(final TLObject tLObject, final ArrayList<TLObject> arrayList, final TLRPC.messages_Dialogs messages_dialogs, final TLRPC.messages_Dialogs messages_dialogs2, final ArrayList<TLRPC.User> arrayList2, final ArrayList<TLRPC.Chat> arrayList3, final ArrayList<DialogFilter> arrayList4, final SparseArray<DialogFilter> sparseArray, final ArrayList<Integer> arrayList5, final HashMap<Integer, HashSet<Long>> map, final HashSet<Integer> hashSet, final Runnable runnable) {
        getConnectionsManager().sendRequest(tLObject, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                this.f$0.lambda$sendLoadPeersRequest$19(arrayList3, arrayList2, messages_dialogs, messages_dialogs2, arrayList, tLObject, arrayList4, sparseArray, arrayList5, map, hashSet, runnable, tLObject2, tL_error);
            }
        });
    }

    public void lambda$sendLoadPeersRequest$19(ArrayList arrayList, ArrayList arrayList2, TLRPC.messages_Dialogs messages_dialogs, TLRPC.messages_Dialogs messages_dialogs2, ArrayList arrayList3, TLObject tLObject, ArrayList arrayList4, SparseArray sparseArray, ArrayList arrayList5, HashMap map, HashSet hashSet, Runnable runnable, TLObject tLObject2, TLRPC.TL_error tL_error) {
        if (tLObject2 instanceof TLRPC.TL_messages_chats) {
            arrayList.addAll(((TLRPC.TL_messages_chats) tLObject2).chats);
        } else if (tLObject2 instanceof Vector) {
            Vector vector = (Vector) tLObject2;
            int size = vector.objects.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add((TLRPC.User) vector.objects.get(i));
            }
        } else if (tLObject2 instanceof TLRPC.TL_messages_peerDialogs) {
            TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject2;
            messages_dialogs.dialogs.addAll(tL_messages_peerDialogs.dialogs);
            messages_dialogs.messages.addAll(tL_messages_peerDialogs.messages);
            messages_dialogs2.dialogs.addAll(tL_messages_peerDialogs.dialogs);
            messages_dialogs2.messages.addAll(tL_messages_peerDialogs.messages);
            arrayList2.addAll(tL_messages_peerDialogs.users);
            arrayList.addAll(tL_messages_peerDialogs.chats);
        }
        arrayList3.remove(tLObject);
        if (arrayList3.isEmpty()) {
            getMessagesStorage().processLoadedFilterPeers(messages_dialogs, messages_dialogs2, arrayList2, arrayList, arrayList4, sparseArray, arrayList5, map, hashSet, runnable);
        }
    }

    protected void loadFilterPeers(final HashMap<Long, TLRPC.InputPeer> map, final HashMap<Long, TLRPC.InputPeer> map2, final HashMap<Long, TLRPC.InputPeer> map3, final TLRPC.messages_Dialogs messages_dialogs, final TLRPC.messages_Dialogs messages_dialogs2, final ArrayList<TLRPC.User> arrayList, final ArrayList<TLRPC.Chat> arrayList2, final ArrayList<DialogFilter> arrayList3, final SparseArray<DialogFilter> sparseArray, final ArrayList<Integer> arrayList4, final HashMap<Integer, HashSet<Long>> map4, final HashSet<Integer> hashSet, final Runnable runnable) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$loadFilterPeers$20(map2, messages_dialogs, messages_dialogs2, arrayList, arrayList2, arrayList3, sparseArray, arrayList4, map4, hashSet, runnable, map3, map);
            }
        });
    }

    public void lambda$loadFilterPeers$20(HashMap map, TLRPC.messages_Dialogs messages_dialogs, TLRPC.messages_Dialogs messages_dialogs2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SparseArray sparseArray, ArrayList arrayList4, HashMap map2, HashSet hashSet, Runnable runnable, HashMap map3, HashMap map4) {
        TLRPC.TL_users_getUsers tL_users_getUsers;
        int i;
        TLRPC.TL_messages_getPeerDialogs tL_messages_getPeerDialogs;
        TLRPC.TL_messages_getChats tL_messages_getChats;
        TLRPC.TL_channels_getChannels tL_channels_getChannels;
        ArrayList<TLObject> arrayList5 = new ArrayList<>();
        loop0: while (true) {
            tL_users_getUsers = null;
            for (Map.Entry entry : map.entrySet()) {
                if (tL_users_getUsers == null) {
                    tL_users_getUsers = new TLRPC.TL_users_getUsers();
                    arrayList5.add(tL_users_getUsers);
                }
                tL_users_getUsers.id.add(getInputUser((TLRPC.InputPeer) entry.getValue()));
                if (tL_users_getUsers.id.size() == 100) {
                    break;
                }
            }
            sendLoadPeersRequest(tL_users_getUsers, arrayList5, messages_dialogs, messages_dialogs2, arrayList, arrayList2, arrayList3, sparseArray, arrayList4, map2, hashSet, runnable);
        }
        if (tL_users_getUsers != null) {
            i = 100;
            sendLoadPeersRequest(tL_users_getUsers, arrayList5, messages_dialogs, messages_dialogs2, arrayList, arrayList2, arrayList3, sparseArray, arrayList4, map2, hashSet, runnable);
        } else {
            i = 100;
        }
        TLRPC.TL_messages_getChats tL_messages_getChats2 = null;
        TLRPC.TL_channels_getChannels tL_channels_getChannels2 = null;
        for (Map.Entry entry2 : map3.entrySet()) {
            TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) entry2.getValue();
            if (inputPeer.chat_id != 0) {
                if (tL_messages_getChats2 == null) {
                    tL_messages_getChats = new TLRPC.TL_messages_getChats();
                    arrayList5.add(tL_messages_getChats);
                } else {
                    tL_messages_getChats = tL_messages_getChats2;
                }
                tL_messages_getChats.id.add((Long) entry2.getKey());
                if (tL_messages_getChats.id.size() == i) {
                    sendLoadPeersRequest(tL_messages_getChats, arrayList5, messages_dialogs, messages_dialogs2, arrayList, arrayList2, arrayList3, sparseArray, arrayList4, map2, hashSet, runnable);
                    tL_messages_getChats2 = null;
                } else {
                    tL_messages_getChats2 = tL_messages_getChats;
                }
            } else if (inputPeer.channel_id != 0) {
                if (tL_channels_getChannels2 == null) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels3 = new TLRPC.TL_channels_getChannels();
                    arrayList5.add(tL_channels_getChannels3);
                    tL_channels_getChannels = tL_channels_getChannels3;
                } else {
                    tL_channels_getChannels = tL_channels_getChannels2;
                }
                tL_channels_getChannels.id.add(getInputChannel(inputPeer));
                if (tL_channels_getChannels.id.size() == i) {
                    sendLoadPeersRequest(tL_channels_getChannels, arrayList5, messages_dialogs, messages_dialogs2, arrayList, arrayList2, arrayList3, sparseArray, arrayList4, map2, hashSet, runnable);
                    tL_channels_getChannels2 = null;
                } else {
                    tL_channels_getChannels2 = tL_channels_getChannels;
                }
            }
        }
        if (tL_messages_getChats2 != null) {
            sendLoadPeersRequest(tL_messages_getChats2, arrayList5, messages_dialogs, messages_dialogs2, arrayList, arrayList2, arrayList3, sparseArray, arrayList4, map2, hashSet, runnable);
        }
        if (tL_channels_getChannels2 != null) {
            sendLoadPeersRequest(tL_channels_getChannels2, arrayList5, messages_dialogs, messages_dialogs2, arrayList, arrayList2, arrayList3, sparseArray, arrayList4, map2, hashSet, runnable);
        }
        loop3: while (true) {
            tL_messages_getPeerDialogs = null;
            for (Map.Entry entry3 : map4.entrySet()) {
                if (tL_messages_getPeerDialogs == null) {
                    tL_messages_getPeerDialogs = new TLRPC.TL_messages_getPeerDialogs();
                    arrayList5.add(tL_messages_getPeerDialogs);
                }
                TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                tL_inputDialogPeer.peer = (TLRPC.InputPeer) entry3.getValue();
                tL_messages_getPeerDialogs.peers.add(tL_inputDialogPeer);
                if (tL_messages_getPeerDialogs.peers.size() == i) {
                    break;
                }
            }
            sendLoadPeersRequest(tL_messages_getPeerDialogs, arrayList5, messages_dialogs, messages_dialogs2, arrayList, arrayList2, arrayList3, sparseArray, arrayList4, map2, hashSet, runnable);
        }
        if (tL_messages_getPeerDialogs != null) {
            sendLoadPeersRequest(tL_messages_getPeerDialogs, arrayList5, messages_dialogs, messages_dialogs2, arrayList, arrayList2, arrayList3, sparseArray, arrayList4, map2, hashSet, runnable);
        }
    }

    protected void processLoadedDialogFilters(final ArrayList<DialogFilter> arrayList, final TLRPC.messages_Dialogs messages_dialogs, final TLRPC.messages_Dialogs messages_dialogs2, final ArrayList<TLRPC.User> arrayList2, final ArrayList<TLRPC.Chat> arrayList3, final ArrayList<TLRPC.EncryptedChat> arrayList4, final int i, final Runnable runnable) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$processLoadedDialogFilters$23(messages_dialogs, arrayList4, messages_dialogs2, i, arrayList, arrayList2, arrayList3, runnable);
            }
        });
    }

    public void lambda$processLoadedDialogFilters$23(org.telegram.tgnet.TLRPC.messages_Dialogs r20, final java.util.ArrayList r21, final org.telegram.tgnet.TLRPC.messages_Dialogs r22, final int r23, final java.util.ArrayList r24, final java.util.ArrayList r25, final java.util.ArrayList r26, final java.lang.Runnable r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$processLoadedDialogFilters$23(org.telegram.tgnet.TLRPC$messages_Dialogs, java.util.ArrayList, org.telegram.tgnet.TLRPC$messages_Dialogs, int, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.lang.Runnable):void");
    }

    public void lambda$processLoadedDialogFilters$22(int r22, java.util.ArrayList r23, java.util.ArrayList r24, java.util.ArrayList r25, org.telegram.tgnet.TLRPC.messages_Dialogs r26, java.util.ArrayList r27, androidx.collection.LongSparseArray r28, androidx.collection.LongSparseArray r29, java.lang.Runnable r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$processLoadedDialogFilters$22(int, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, org.telegram.tgnet.TLRPC$messages_Dialogs, java.util.ArrayList, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray, java.lang.Runnable):void");
    }

    public static int lambda$processLoadedDialogFilters$21(DialogFilter dialogFilter, DialogFilter dialogFilter2) {
        int i = dialogFilter.order;
        int i2 = dialogFilter2.order;
        if (i > i2) {
            return 1;
        }
        return i < i2 ? -1 : 0;
    }

    public void loadSuggestedFilters() {
        if (this.loadingSuggestedFilters) {
            return;
        }
        this.loadingSuggestedFilters = true;
        getConnectionsManager().sendRequest(new TLRPC.TL_messages_getSuggestedDialogFilters(), new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$loadSuggestedFilters$25(tLObject, tL_error);
            }
        });
    }

    public void lambda$loadSuggestedFilters$25(final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$loadSuggestedFilters$24(tLObject);
            }
        });
    }

    public void lambda$loadSuggestedFilters$24(TLObject tLObject) {
        this.loadingSuggestedFilters = false;
        this.suggestedFilters.clear();
        if (tLObject instanceof Vector) {
            this.suggestedFilters.addAll(((Vector) tLObject).objects);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.suggestedFiltersLoaded, new Object[0]);
    }

    public void loadRemoteFilters(boolean z) {
        loadRemoteFilters(z, null);
    }

    public void loadRemoteFilters(boolean z, Utilities.Callback<Boolean> callback) {
        if (callback != null) {
            this.onLoadedRemoteFilters = callback;
        }
        if (this.loadingRemoteFilters || !getUserConfig().isClientActivated()) {
            return;
        }
        if (z || !getUserConfig().filtersLoaded) {
            if (z) {
                getUserConfig().filtersLoaded = false;
                getUserConfig().saveConfig(false);
            }
            getConnectionsManager().sendRequest(new TLRPC.TL_messages_getDialogFilters(), new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$loadRemoteFilters$30(tLObject, tL_error);
                }
            });
        }
    }

    public void lambda$loadRemoteFilters$30(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof Vector) {
            ArrayList<TLRPC.DialogFilter> arrayList = new ArrayList<>();
            Vector vector = (Vector) tLObject;
            for (int i = 0; i < vector.objects.size(); i++) {
                arrayList.add((TLRPC.DialogFilter) vector.objects.get(i));
            }
            getMessagesStorage().checkLoadedRemoteFilters(arrayList, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$loadRemoteFilters$26();
                }
            });
            return;
        }
        if (tLObject instanceof TLRPC.TL_messages_dialogFilters) {
            TLRPC.TL_messages_dialogFilters tL_messages_dialogFilters = (TLRPC.TL_messages_dialogFilters) tLObject;
            boolean z = this.folderTags;
            boolean z2 = tL_messages_dialogFilters.tags_enabled;
            if (z != z2) {
                setFolderTags(z2);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$loadRemoteFilters$27();
                    }
                });
            }
            getMessagesStorage().checkLoadedRemoteFilters(tL_messages_dialogFilters.filters, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$loadRemoteFilters$28();
                }
            });
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$loadRemoteFilters$29();
            }
        });
    }

    public void lambda$loadRemoteFilters$26() {
        Utilities.Callback<Boolean> callback = this.onLoadedRemoteFilters;
        if (callback != null) {
            callback.run(Boolean.TRUE);
            this.onLoadedRemoteFilters = null;
        }
    }

    public void lambda$loadRemoteFilters$27() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
    }

    public void lambda$loadRemoteFilters$28() {
        Utilities.Callback<Boolean> callback = this.onLoadedRemoteFilters;
        if (callback != null) {
            callback.run(Boolean.TRUE);
            this.onLoadedRemoteFilters = null;
        }
    }

    public void lambda$loadRemoteFilters$29() {
        this.loadingRemoteFilters = false;
        Utilities.Callback<Boolean> callback = this.onLoadedRemoteFilters;
        if (callback != null) {
            callback.run(Boolean.FALSE);
            this.onLoadedRemoteFilters = null;
        }
    }

    public void logDeviceStats() {
        if (!this.collectDeviceStats || this.loggedDeviceStats) {
            return;
        }
        ArrayList<File> rootDirs = AndroidUtilities.getRootDirs();
        if (!rootDirs.isEmpty()) {
            int i = 0;
            String absolutePath = rootDirs.get(0).getAbsolutePath();
            if (!TextUtils.isEmpty(SharedConfig.storageCacheDir)) {
                int size = rootDirs.size();
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    String absolutePath2 = rootDirs.get(i).getAbsolutePath();
                    if (absolutePath2.startsWith(SharedConfig.storageCacheDir)) {
                        absolutePath = absolutePath2;
                        break;
                    }
                    i++;
                }
            }
            boolean zContains = absolutePath.contains("/storage/emulated/");
            TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
            TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
            tL_inputAppEvent.time = getConnectionsManager().getCurrentTime();
            tL_inputAppEvent.type = "android_sdcard_exists";
            TLRPC.TL_jsonBool tL_jsonBool = new TLRPC.TL_jsonBool();
            tL_jsonBool.value = zContains;
            tL_inputAppEvent.data = tL_jsonBool;
            tL_inputAppEvent.peer = zContains ? 1L : 0L;
            tL_help_saveAppLog.events.add(tL_inputAppEvent);
            getConnectionsManager().sendRequest(tL_help_saveAppLog, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    MessagesController.lambda$logDeviceStats$31(tLObject, tL_error);
                }
            });
        }
        this.loggedDeviceStats = true;
    }

    public void selectDialogFilter(DialogFilter dialogFilter, int i) {
        DialogFilter[] dialogFilterArr = this.selectedDialogFilter;
        DialogFilter dialogFilter2 = dialogFilterArr[i];
        if (dialogFilter2 == dialogFilter) {
            return;
        }
        dialogFilterArr[i] = dialogFilter;
        if (dialogFilterArr[i == 0 ? (char) 1 : (char) 0] == dialogFilter) {
            dialogFilterArr[i == 0 ? (char) 1 : (char) 0] = null;
        }
        if (dialogFilterArr[i] != null) {
            sortDialogs(null);
        } else if (dialogFilter2 != null) {
            dialogFilter2.dialogs.clear();
            dialogFilter2.dialogsForward.clear();
        }
    }

    public void onFilterUpdate(DialogFilter dialogFilter) {
        for (int i = 0; i < 2; i++) {
            if (this.selectedDialogFilter[i] == dialogFilter) {
                sortDialogs(null);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, Boolean.TRUE);
                return;
            }
        }
    }

    public void addFilter(DialogFilter dialogFilter, boolean z) {
        if (z) {
            int size = this.dialogFilters.size();
            int iMin = 254;
            for (int i = 0; i < size; i++) {
                iMin = Math.min(iMin, this.dialogFilters.get(i).order);
            }
            dialogFilter.order = iMin - 1;
            if (this.dialogFilters.get(0).isDefault()) {
                this.dialogFilters.add(1, dialogFilter);
            } else {
                this.dialogFilters.add(0, dialogFilter);
            }
        } else {
            int size2 = this.dialogFilters.size();
            int iMax = 0;
            for (int i2 = 0; i2 < size2; i2++) {
                iMax = Math.max(iMax, this.dialogFilters.get(i2).order);
            }
            dialogFilter.order = iMax + 1;
            this.dialogFilters.add(dialogFilter);
        }
        this.dialogFiltersById.put(dialogFilter.id, dialogFilter);
        if (this.dialogFilters.size() == 1 && SharedConfig.getChatSwipeAction(this.currentAccount) != 5) {
            SharedConfig.updateChatListSwipeSetting(5);
        }
        lockFiltersInternal();
    }

    public static TLRPC.TL_emojiStatusCollectible emojiStatusCollectibleFromGift(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = new TLRPC.TL_emojiStatusCollectible();
        tL_emojiStatusCollectible.collectible_id = tL_starGiftUnique.id;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        tL_emojiStatusCollectible.title = tL_starGiftUnique.title + " #" + tL_starGiftUnique.num;
        if (stargiftattributemodel != null) {
            tL_emojiStatusCollectible.document_id = stargiftattributemodel.document.id;
        }
        if (stargiftattributepattern != null) {
            tL_emojiStatusCollectible.pattern_document_id = stargiftattributepattern.document.id;
        }
        if (stargiftattributebackdrop != null) {
            tL_emojiStatusCollectible.center_color = stargiftattributebackdrop.center_color;
            tL_emojiStatusCollectible.edge_color = stargiftattributebackdrop.edge_color;
            tL_emojiStatusCollectible.text_color = stargiftattributebackdrop.text_color;
            tL_emojiStatusCollectible.pattern_color = stargiftattributebackdrop.pattern_color;
        }
        return tL_emojiStatusCollectible;
    }

    public void updateEmojiStatus(TLRPC.EmojiStatus emojiStatus) {
        updateEmojiStatus(emojiStatus, null);
    }

    public void updateEmojiStatus(TLRPC.EmojiStatus emojiStatus, TL_stars.StarGift starGift) {
        updateEmojiStatus(0L, emojiStatus, starGift);
    }

    public void updateEmojiStatus(long j, TLRPC.EmojiStatus emojiStatus, TL_stars.StarGift starGift) {
        TLRPC.TL_channels_updateEmojiStatus tL_channels_updateEmojiStatus;
        boolean z = j == 0 || j == getUserConfig().getClientUserId();
        TLRPC.EmojiStatus emojiStatusEmojiStatusCollectibleFromGift = ((emojiStatus instanceof TLRPC.TL_inputEmojiStatusCollectible) && (starGift instanceof TL_stars.TL_starGiftUnique)) ? emojiStatusCollectibleFromGift((TL_stars.TL_starGiftUnique) starGift) : emojiStatus;
        if (z) {
            TL_account.updateEmojiStatus updateemojistatus = new TL_account.updateEmojiStatus();
            updateemojistatus.emoji_status = emojiStatus;
            TLRPC.User currentUser = getUserConfig().getCurrentUser();
            tL_channels_updateEmojiStatus = updateemojistatus;
            if (currentUser != null) {
                currentUser.emoji_status = emojiStatusEmojiStatusCollectibleFromGift;
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.userEmojiStatusUpdated, currentUser);
                tL_channels_updateEmojiStatus = updateemojistatus;
            }
        } else {
            TLRPC.TL_channels_updateEmojiStatus tL_channels_updateEmojiStatus2 = new TLRPC.TL_channels_updateEmojiStatus();
            long j2 = -j;
            tL_channels_updateEmojiStatus2.channel = getInputChannel(j2);
            tL_channels_updateEmojiStatus2.emoji_status = emojiStatus;
            TLRPC.Chat chat = getChat(Long.valueOf(j2));
            tL_channels_updateEmojiStatus = tL_channels_updateEmojiStatus2;
            if (chat != null) {
                chat.flags |= 512;
                chat.emoji_status = emojiStatusEmojiStatusCollectibleFromGift;
                putChat(chat, true);
                tL_channels_updateEmojiStatus = tL_channels_updateEmojiStatus2;
            }
        }
        getMessagesController().updateEmojiStatusUntilUpdate(j, emojiStatusEmojiStatusCollectibleFromGift);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_EMOJI_STATUS));
        getConnectionsManager().sendRequest(tL_channels_updateEmojiStatus, null);
    }

    public void removeFilter(DialogFilter dialogFilter) {
        this.dialogFilters.remove(dialogFilter);
        this.dialogFiltersById.remove(dialogFilter.id);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
    }

    public void loadAppConfig() {
        loadAppConfig(true);
    }

    public void loadAppConfig(boolean z) {
        AndroidUtilities.cancelRunOnUIThread(this.loadAppConfigRunnable);
        if (z) {
            this.appConfigFetcher.forceRequest(this.currentAccount, 0);
        }
        this.appConfigFetcher.fetch(this.currentAccount, 0, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$loadAppConfig$33((TLRPC.TL_help_appConfig) obj);
            }
        });
    }

    public void lambda$loadAppConfig$33(final TLRPC.TL_help_appConfig tL_help_appConfig) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() throws NumberFormatException {
                this.f$0.lambda$loadAppConfig$32(tL_help_appConfig);
            }
        });
    }

    public void lambda$loadAppConfig$32(TLRPC.TL_help_appConfig tL_help_appConfig) throws NumberFormatException {
        if (tL_help_appConfig != null) {
            TLRPC.JSONValue jSONValue = tL_help_appConfig.config;
            if (jSONValue instanceof TLRPC.TL_jsonObject) {
                applyAppConfig((TLRPC.TL_jsonObject) jSONValue);
            }
        }
        AndroidUtilities.cancelRunOnUIThread(this.loadAppConfigRunnable);
        AndroidUtilities.runOnUIThread(this.loadAppConfigRunnable, 240010L);
    }

    private void applyAppConfig(org.telegram.tgnet.TLRPC.TL_jsonObject r41) throws java.lang.NumberFormatException {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.applyAppConfig(org.telegram.tgnet.TLRPC$TL_jsonObject):void");
    }

    public static String lambda$applyAppConfig$35(int[] iArr) {
        return (String) DesugarArrays.stream(iArr).mapToObj(new MessagesController$$ExternalSyntheticLambda66()).collect(Collectors.joining(","));
    }

    public void lambda$applyAppConfig$36() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appConfigUpdated, new Object[0]);
    }

    public void lambda$applyAppConfig$37() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesEnabledUpdate, new Object[0]);
    }

    public void updateTranscribeAudioTrialCurrentNumber(int i) {
        if (i != this.transcribeAudioTrialCurrentNumber) {
            this.transcribeAudioTrialCurrentNumber = i;
            this.mainPreferences.edit().putInt("transcribeAudioTrialCurrentNumber", this.transcribeAudioTrialCurrentNumber).apply();
        }
    }

    public void updateTranscribeAudioTrialCooldownUntil(int i) {
        if (i != this.transcribeAudioTrialCooldownUntil) {
            this.transcribeAudioTrialCooldownUntil = i;
            this.mainPreferences.edit().putInt("transcribeAudioTrialCooldownUntil", this.transcribeAudioTrialCooldownUntil).apply();
            scheduleTranscriptionUpdate();
        }
    }

    private void scheduleTranscriptionUpdate() {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$scheduleTranscriptionUpdate$38();
            }
        });
    }

    public void lambda$scheduleTranscriptionUpdate$38() {
        AndroidUtilities.cancelRunOnUIThread(this.notifyTranscriptionAudioCooldownUpdate);
        long currentTime = this.transcribeAudioTrialCooldownUntil - getConnectionsManager().getCurrentTime();
        if (currentTime > 0) {
            AndroidUtilities.runOnUIThread(this.notifyTranscriptionAudioCooldownUpdate, currentTime);
        }
    }

    public void lambda$new$39() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateTranscriptionLock, new Object[0]);
    }

    public static class PeerColors {
        public static final int TYPE_NAME = 0;
        public static final int TYPE_PROFILE = 1;
        public final ArrayList<PeerColor> colors = new ArrayList<>();
        private final LongSparseArray colorsById = new LongSparseArray();
        public final int hash;
        public final int type;

        public boolean needUpdate() {
            boolean z = true;
            boolean z2 = false;
            for (int i = 0; i < this.colors.size(); i++) {
                if (this.colors.get(i).channelLvl > 0) {
                    z = false;
                }
                if (this.colors.get(i).id < 7) {
                    z2 = true;
                }
            }
            if (this.type == 1 && !z) {
                Iterator<PeerColor> it = this.colors.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    if (it.next().groupLvl > 0) {
                        z = false;
                        break;
                    }
                }
            }
            if (z) {
                return true;
            }
            return this.type == 0 && !z2;
        }

        public int colorsAvailable(int i, boolean z) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.colors.size(); i3++) {
                PeerColor peerColor = this.colors.get(i3);
                if (!peerColor.hidden && i >= peerColor.getLvl(z)) {
                    i2++;
                }
            }
            return i2;
        }

        public int maxLevel() {
            return maxLevel(false);
        }

        public int maxLevel(boolean z) {
            int iMax = 0;
            for (int i = 0; i < this.colors.size(); i++) {
                PeerColor peerColor = this.colors.get(i);
                if (!peerColor.hidden) {
                    iMax = Math.max(iMax, peerColor.getLvl(z));
                }
            }
            return iMax;
        }

        public int minLevel() {
            return minLevel(false);
        }

        public int minLevel(boolean z) {
            int iMaxLevel = maxLevel(z);
            for (int i = 0; i < this.colors.size(); i++) {
                PeerColor peerColor = this.colors.get(i);
                if (!peerColor.hidden) {
                    iMaxLevel = Math.min(iMaxLevel, peerColor.getLvl(z));
                }
            }
            return iMaxLevel;
        }

        private PeerColors(int i, int i2) {
            this.type = i;
            this.hash = i2;
        }

        public PeerColor getColor(int i) {
            return (PeerColor) this.colorsById.get(i);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.hash != 0) {
                sb.append("@");
                sb.append(this.hash);
                sb.append("^");
            }
            for (int i = 0; i < this.colors.size(); i++) {
                PeerColor peerColor = this.colors.get(i);
                if (i > 0) {
                    sb.append(";");
                }
                peerColor.appendString(sb);
            }
            return sb.toString();
        }

        public static PeerColors fromString(int i, String str) {
            int iIntValue;
            int iIndexOf;
            if (str == null) {
                return null;
            }
            if (!str.startsWith("@") || (iIndexOf = str.indexOf("^")) < 0) {
                iIntValue = 0;
            } else {
                iIntValue = Utilities.parseInt((CharSequence) str.substring(1, iIndexOf)).intValue();
                str = str.substring(iIndexOf + 1);
            }
            PeerColors peerColors = new PeerColors(i, iIntValue);
            for (String str2 : str.split(";")) {
                PeerColor peerColorFromString = PeerColor.fromString(str2);
                if (peerColorFromString != null) {
                    peerColorFromString.isDefaultName = peerColorFromString.id < 7 && i == 0;
                    if (!peerColorFromString.hidden) {
                        peerColors.colors.add(peerColorFromString);
                    }
                    peerColors.colorsById.put(peerColorFromString.id, peerColorFromString);
                }
            }
            return peerColors;
        }

        private static int color(String str) {
            return MessagesController$PeerColors$$ExternalSyntheticBackport0.m("ff" + str, 16);
        }

        public static PeerColors fromTL(int i, TLRPC.TL_help_peerColors tL_help_peerColors) {
            if (tL_help_peerColors == null) {
                return null;
            }
            try {
                PeerColors peerColors = new PeerColors(i, tL_help_peerColors.hash);
                for (int i2 = 0; i2 < tL_help_peerColors.colors.size(); i2++) {
                    PeerColor peerColorFromTL = PeerColor.fromTL(tL_help_peerColors.colors.get(i2));
                    if (peerColorFromTL != null) {
                        peerColorFromTL.isDefaultName = peerColorFromTL.id < 7 && i == 0;
                        if (!peerColorFromTL.hidden) {
                            peerColors.colors.add(peerColorFromTL);
                        }
                        peerColors.colorsById.put(peerColorFromTL.id, peerColorFromTL);
                    }
                }
                return peerColors;
            } catch (Exception e) {
                FileLog.e(e);
                return null;
            }
        }

        public static PeerColors fromJSON(int i, TLRPC.TL_jsonObject tL_jsonObject, TLRPC.TL_jsonObject tL_jsonObject2, TLRPC.TL_jsonArray tL_jsonArray) {
            try {
                PeerColors peerColors = new PeerColors(i, 0);
                if (tL_jsonObject != null) {
                    Iterator<TLRPC.TL_jsonObjectValue> it = tL_jsonObject.value.iterator();
                    while (it.hasNext()) {
                        TLRPC.TL_jsonObjectValue next = it.next();
                        int iIntValue = Utilities.parseInt((CharSequence) next.key).intValue();
                        TLRPC.JSONValue jSONValue = next.value;
                        if (jSONValue instanceof TLRPC.TL_jsonArray) {
                            ArrayList<TLRPC.JSONValue> arrayList = ((TLRPC.TL_jsonArray) jSONValue).value;
                            if (!arrayList.isEmpty()) {
                                PeerColor peerColor = new PeerColor();
                                try {
                                    peerColor.id = iIntValue;
                                    int i2 = 0;
                                    while (i2 < 6) {
                                        int[] iArr = peerColor.colors;
                                        int[] iArr2 = peerColor.darkColors;
                                        int iColor = arrayList.size() > i2 ? color(((TLRPC.TL_jsonString) arrayList.get(i2)).value) : peerColor.colors[0];
                                        iArr2[i2] = iColor;
                                        iArr[i2] = iColor;
                                        i2++;
                                    }
                                    peerColor.isDefaultName = peerColor.id < 7 && i == 0;
                                    peerColors.colorsById.put(iIntValue, peerColor);
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                            }
                        }
                    }
                }
                if (tL_jsonObject2 != null) {
                    Iterator<TLRPC.TL_jsonObjectValue> it2 = tL_jsonObject2.value.iterator();
                    while (it2.hasNext()) {
                        TLRPC.TL_jsonObjectValue next2 = it2.next();
                        int iIntValue2 = Utilities.parseInt((CharSequence) next2.key).intValue();
                        TLRPC.JSONValue jSONValue2 = next2.value;
                        if (jSONValue2 instanceof TLRPC.TL_jsonArray) {
                            ArrayList<TLRPC.JSONValue> arrayList2 = ((TLRPC.TL_jsonArray) jSONValue2).value;
                            if (!arrayList2.isEmpty()) {
                                long j = iIntValue2;
                                PeerColor peerColor2 = (PeerColor) peerColors.colorsById.get(j);
                                if (peerColor2 != null) {
                                    try {
                                        peerColor2.id = iIntValue2;
                                        int i3 = 0;
                                        while (i3 < 6) {
                                            peerColor2.darkColors[i3] = arrayList2.size() > i3 ? color(((TLRPC.TL_jsonString) arrayList2.get(i3)).value) : peerColor2.darkColors[0];
                                            i3++;
                                        }
                                        peerColors.colorsById.put(j, peerColor2);
                                    } catch (Exception e2) {
                                        FileLog.e(e2);
                                    }
                                }
                            }
                        }
                    }
                }
                peerColors.colors.clear();
                if (tL_jsonArray != null) {
                    Iterator<TLRPC.JSONValue> it3 = tL_jsonArray.value.iterator();
                    while (it3.hasNext()) {
                        if (it3.next() instanceof TLRPC.TL_jsonNumber) {
                            PeerColor peerColor3 = (PeerColor) peerColors.colorsById.get((int) ((TLRPC.TL_jsonNumber) r11).value);
                            if (peerColor3 != null) {
                                peerColors.colors.add(peerColor3);
                            }
                        }
                    }
                }
                return peerColors;
            } catch (Exception e3) {
                FileLog.e(e3);
                return null;
            }
        }
    }

    public static class PeerColor {
        public int channelLvl;
        public int groupLvl;
        public boolean hidden;
        public int id;
        public boolean isDefaultName;
        public int patternColor = 0;
        public int textColor = 0;
        private final int[] colors = new int[6];
        private final int[] darkColors = new int[6];

        public int getColor(int i, Theme.ResourcesProvider resourcesProvider) {
            int i2;
            if (i < 0 || i > 5) {
                return 0;
            }
            if (!this.isDefaultName || (i2 = this.id) < 0 || i2 >= 7) {
                return (resourcesProvider != null ? resourcesProvider.isDark() : Theme.isCurrentThemeDark() ? this.darkColors : this.colors)[i];
            }
            return Theme.getColor(Theme.keys_avatar_nameInMessage[i2], resourcesProvider);
        }

        public int getLvl(boolean z) {
            return z ? this.groupLvl : this.channelLvl;
        }

        public int getColor1(boolean z) {
            return (z ? this.darkColors : this.colors)[0];
        }

        public int getColor2(boolean z) {
            return (z ? this.darkColors : this.colors)[1];
        }

        public int getColor3(boolean z) {
            return (z ? this.darkColors : this.colors)[2];
        }

        public int getColor4(boolean z) {
            return (z ? this.darkColors : this.colors)[3];
        }

        public int getColor5(boolean z) {
            return (z ? this.darkColors : this.colors)[4];
        }

        public int getColor6(boolean z) {
            return (z ? this.darkColors : this.colors)[5];
        }

        public int getColor1() {
            return (Theme.isCurrentThemeDark() ? this.darkColors : this.colors)[0];
        }

        public int getColor2() {
            return (Theme.isCurrentThemeDark() ? this.darkColors : this.colors)[1];
        }

        public int getColor3() {
            return (Theme.isCurrentThemeDark() ? this.darkColors : this.colors)[2];
        }

        public int getColor4() {
            return (Theme.isCurrentThemeDark() ? this.darkColors : this.colors)[3];
        }

        public int getColor5() {
            return (Theme.isCurrentThemeDark() ? this.darkColors : this.colors)[4];
        }

        public boolean hasColor2() {
            return getColor2() != getColor1();
        }

        public boolean hasColor3() {
            return getColor3() != getColor1();
        }

        public boolean hasColor2(boolean z) {
            return getColor2(z) != getColor1(z);
        }

        public boolean hasColor3(boolean z) {
            return getColor3(z) != getColor1(z);
        }

        public boolean hasColor6(boolean z) {
            return getColor6(z) != getColor1(z);
        }

        public int getBgColor1(boolean z) {
            return hasColor6(z) ? getColor3(z) : getColor2(z);
        }

        public int getBgColor2(boolean z) {
            return hasColor6(z) ? getColor4(z) : getColor2(z);
        }

        public int getStoryColor1(boolean z) {
            return hasColor6(z) ? getColor5(z) : getColor3(z);
        }

        public int getStoryColor2(boolean z) {
            return hasColor6(z) ? getColor6(z) : getColor4(z);
        }

        public int getAvatarColor1() {
            return ColorUtils.blendARGB(getBgColor2(false), getStoryColor2(false), 0.5f);
        }

        public int getAvatarColor2() {
            return ColorUtils.blendARGB(getBgColor1(false), getStoryColor1(false), 0.5f);
        }

        public void appendString(StringBuilder sb) {
            sb.append("#");
            if (this.hidden) {
                sb.append("H");
            }
            if (this.channelLvl != 0 || this.groupLvl != 0) {
                sb.append("[");
                sb.append(this.channelLvl);
                sb.append(",");
                sb.append(this.groupLvl);
                sb.append("]");
            }
            sb.append(this.id);
            sb.append("{");
            sb.append(this.colors[0]);
            int[] iArr = this.colors;
            if (iArr[1] != iArr[0]) {
                sb.append(",");
                sb.append(this.colors[1]);
                int[] iArr2 = this.colors;
                int i = iArr2[2];
                int i2 = iArr2[0];
                if (i != i2 || iArr2[3] != i2) {
                    sb.append(",");
                    sb.append(this.colors[2]);
                    sb.append(",");
                    sb.append(this.colors[3]);
                    int[] iArr3 = this.colors;
                    int i3 = iArr3[4];
                    int i4 = iArr3[0];
                    if (i3 != i4 || iArr3[5] != i4) {
                        sb.append(",");
                        sb.append(this.colors[4]);
                        sb.append(",");
                        sb.append(this.colors[5]);
                    }
                }
            }
            int[] iArr4 = this.darkColors;
            int i5 = iArr4[0];
            int[] iArr5 = this.colors;
            if (i5 != iArr5[0] || iArr4[1] != iArr5[1] || iArr4[2] != iArr5[2]) {
                sb.append("@");
                sb.append(this.darkColors[0]);
                int[] iArr6 = this.darkColors;
                if (iArr6[1] != iArr6[0]) {
                    sb.append(",");
                    sb.append(this.darkColors[1]);
                    int[] iArr7 = this.darkColors;
                    int i6 = iArr7[2];
                    int i7 = iArr7[0];
                    if (i6 != i7 || iArr7[3] != i7) {
                        sb.append(",");
                        sb.append(this.darkColors[2]);
                        sb.append(",");
                        sb.append(this.darkColors[3]);
                        int[] iArr8 = this.darkColors;
                        int i8 = iArr8[4];
                        int i9 = iArr8[0];
                        if (i8 != i9 || iArr8[5] != i9) {
                            sb.append(",");
                            sb.append(this.darkColors[4]);
                            sb.append(",");
                            sb.append(this.darkColors[5]);
                        }
                    }
                }
            }
            sb.append("}");
        }

        public static PeerColor fromPeerCollectible(TLRPC.PeerColor peerColor) {
            if (!(peerColor instanceof TLRPC.TL_peerColorCollectible)) {
                return null;
            }
            PeerColor peerColor2 = new PeerColor();
            peerColor2.id = -1;
            peerColor2.hidden = true;
            return peerColor2;
        }

        public static PeerColor fromCollectible(TLRPC.EmojiStatus emojiStatus) {
            if (!(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible)) {
                return null;
            }
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            PeerColor peerColor = new PeerColor();
            peerColor.id = -1;
            peerColor.hidden = true;
            int[] iArr = peerColor.colors;
            int i = tL_emojiStatusCollectible.edge_color | (-16777216);
            iArr[0] = i;
            int i2 = tL_emojiStatusCollectible.center_color | (-16777216);
            iArr[1] = i2;
            iArr[2] = i;
            iArr[3] = i2;
            int i3 = tL_emojiStatusCollectible.text_color | (-16777216);
            iArr[4] = i3;
            iArr[5] = i3;
            System.arraycopy(iArr, 0, peerColor.darkColors, 0, 6);
            peerColor.patternColor = tL_emojiStatusCollectible.pattern_color | (-16777216);
            peerColor.textColor = tL_emojiStatusCollectible.text_color | (-16777216);
            return peerColor;
        }

        public static PeerColor fromTL(TLRPC.TL_help_peerColorOption tL_help_peerColorOption) {
            if (tL_help_peerColorOption == null) {
                return null;
            }
            PeerColor peerColor = new PeerColor();
            peerColor.id = tL_help_peerColorOption.color_id;
            peerColor.hidden = tL_help_peerColorOption.hidden;
            int i = tL_help_peerColorOption.flags;
            if ((i & 8) != 0) {
                peerColor.channelLvl = tL_help_peerColorOption.channel_min_level;
            }
            if ((i & 16) != 0) {
                peerColor.groupLvl = tL_help_peerColorOption.group_min_level;
            }
            System.arraycopy(optionToColors(tL_help_peerColorOption.colors), 0, peerColor.colors, 0, 6);
            System.arraycopy(optionToColors(tL_help_peerColorOption.dark_colors), 0, peerColor.darkColors, 0, 6);
            return peerColor;
        }

        public static int[] optionToColors(TLRPC.help_PeerColorSet help_peercolorset) {
            ArrayList<Integer> arrayList;
            int[] iArr = new int[6];
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            iArr[4] = 0;
            iArr[5] = 0;
            if (help_peercolorset instanceof TLRPC.TL_help_peerColorSet) {
                arrayList = ((TLRPC.TL_help_peerColorSet) help_peercolorset).colors;
            } else if (help_peercolorset instanceof TLRPC.TL_help_peerColorProfileSet) {
                TLRPC.TL_help_peerColorProfileSet tL_help_peerColorProfileSet = (TLRPC.TL_help_peerColorProfileSet) help_peercolorset;
                ArrayList<Integer> arrayList2 = tL_help_peerColorProfileSet.palette_colors;
                ArrayList<Integer> arrayList3 = tL_help_peerColorProfileSet.bg_colors;
                ArrayList<Integer> arrayList4 = tL_help_peerColorProfileSet.story_colors;
                ArrayList<Integer> arrayList5 = new ArrayList<>();
                if (arrayList2 != null) {
                    for (int i = 0; i < Math.min(2, arrayList2.size()); i++) {
                        arrayList5.add(arrayList2.get(i));
                    }
                }
                if (arrayList3 != null) {
                    for (int i2 = 0; i2 < Math.min(2, arrayList3.size()); i2++) {
                        arrayList5.add(arrayList3.get(i2));
                    }
                }
                if (arrayList4 != null) {
                    for (int i3 = 0; i3 < Math.min(2, arrayList4.size()); i3++) {
                        arrayList5.add(arrayList4.get(i3));
                    }
                }
                arrayList = arrayList5;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                if (arrayList.size() > 0) {
                    Arrays.fill(iArr, arrayList.get(0).intValue() | (-16777216));
                }
                for (int i4 = 0; i4 < Math.min(6, arrayList.size()); i4++) {
                    iArr[i4] = arrayList.get(i4).intValue() | (-16777216);
                }
            }
            return iArr;
        }

        public static PeerColor fromString(String str) {
            int i;
            int iIntValue;
            int iIntValue2;
            int iIndexOf;
            if (str != null && !str.isEmpty()) {
                if (str.charAt(0) == '#') {
                    boolean z = str.length() > 1 && str.charAt(1) == 'H';
                    int i2 = z ? 2 : 1;
                    if (str.length() <= i2 || str.charAt(i2) != '[' || (iIndexOf = str.indexOf(93)) <= i2) {
                        i = i2;
                        iIntValue = 0;
                        iIntValue2 = 0;
                    } else {
                        String strSubstring = str.substring(i2 + 1, iIndexOf);
                        if (strSubstring.contains(",")) {
                            String[] strArrSplit = strSubstring.split(",");
                            iIntValue2 = Utilities.parseInt((CharSequence) strArrSplit[0]).intValue();
                            iIntValue = Utilities.parseInt((CharSequence) strArrSplit[1]).intValue();
                        } else {
                            iIntValue2 = Utilities.parseInt((CharSequence) strSubstring).intValue();
                            iIntValue = 0;
                        }
                        i = iIndexOf + 1;
                    }
                    int iIndexOf2 = str.indexOf(123);
                    if (iIndexOf2 < 0) {
                        return null;
                    }
                    try {
                        PeerColor peerColor = new PeerColor();
                        peerColor.id = Utilities.parseInt((CharSequence) str.substring(i, iIndexOf2)).intValue();
                        peerColor.hidden = z;
                        peerColor.channelLvl = iIntValue2;
                        peerColor.groupLvl = iIntValue;
                        String[] strArrSplit2 = str.substring(iIndexOf2 + 1, str.length() - 1).split("@");
                        String[] strArrSplit3 = strArrSplit2[0].split(",");
                        int i3 = 0;
                        while (i3 < 6) {
                            int[] iArr = peerColor.colors;
                            int i4 = i3 + 1;
                            iArr[i3] = strArrSplit3.length >= i4 ? Utilities.parseInt((CharSequence) strArrSplit3[i3]).intValue() : iArr[0];
                            i3 = i4;
                        }
                        if (strArrSplit2.length >= 2) {
                            String[] strArrSplit4 = strArrSplit2[1].split(",");
                            int i5 = 0;
                            while (i5 < 6) {
                                int[] iArr2 = peerColor.darkColors;
                                int i6 = i5 + 1;
                                iArr2[i5] = strArrSplit4.length >= i6 ? Utilities.parseInt((CharSequence) strArrSplit4[i5]).intValue() : iArr2[0];
                                i5 = i6;
                            }
                        } else {
                            for (int i7 = 0; i7 < 6; i7++) {
                                peerColor.darkColors[i7] = peerColor.colors[i7];
                            }
                        }
                        return peerColor;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
            }
            return null;
        }
    }

    private void resetAppConfig() {
        this.getfileExperimentalParams = false;
        this.channelRevenueWithdrawalEnabled = false;
        this.collectDeviceStats = false;
        this.smsjobsStickyNotificationEnabled = false;
        this.showAnnualPerMonth = false;
        this.canEditFactcheck = false;
        this.starsLocked = true;
        this.factcheckLengthLimit = 1024;
        this.videoIgnoreAltDocuments = false;
        this.freezeSinceDate = 0L;
        this.freezeUntilDate = 0L;
        this.freezeAppealUrl = "t.me/spambot";
        this.verifyAgeBotUsername = null;
        this.verifyAgeCountry = "GB";
        this.ignoreRestrictionReasons = new HashSet();
        this.mainPreferences.edit().remove("starsLocked").remove("getfileExperimentalParams").remove("smsjobsStickyNotificationEnabled").remove("channelRevenueWithdrawalEnabled").remove("showAnnualPerMonth").remove("canEditFactcheck").remove("factcheckLengthLimit").remove("videoIgnoreAltDocuments").remove("freezeSinceDate").remove("freezeUntilDate").remove("freezeAppealUrl").remove("verifyAgeBotUsername").remove("verifyAgeCountry").remove("ignoreRestrictionReasons").apply();
    }

    private boolean savePremiumFeaturesPreviewOrder(String str, SparseIntArray sparseIntArray, SharedPreferences.Editor editor, ArrayList<TLRPC.JSONValue> arrayList) {
        int iServerStringToFeatureType;
        StringBuilder sb = new StringBuilder();
        sparseIntArray.clear();
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                break;
            }
            String str2 = arrayList.get(i) instanceof TLRPC.TL_jsonString ? ((TLRPC.TL_jsonString) arrayList.get(i)).value : null;
            if (str2 != null && (iServerStringToFeatureType = PremiumPreviewFragment.serverStringToFeatureType(str2)) >= 0) {
                sparseIntArray.put(iServerStringToFeatureType, i);
                if (sb.length() > 0) {
                    sb.append('_');
                }
                sb.append(iServerStringToFeatureType);
            }
            i++;
        }
        if (sb.length() > 0) {
            String string = sb.toString();
            boolean z = !string.equals(this.mainPreferences.getString(str, null));
            editor.putString(str, string);
            return z;
        }
        editor.remove(str);
        return this.mainPreferences.getString(str, null) != null;
    }

    private void loadPremiumFeaturesPreviewOrder(SparseIntArray sparseIntArray, String str) {
        sparseIntArray.clear();
        if (str != null) {
            String[] strArrSplit = str.split("_");
            for (int i = 0; i < strArrSplit.length; i++) {
                sparseIntArray.put(Integer.parseInt(strArrSplit[i]), i);
            }
        }
    }

    public void removeSuggestion(long j, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (j == 0) {
            TLRPC.TL_pendingSuggestion tL_pendingSuggestion = this.customPendingSuggestion;
            if (tL_pendingSuggestion != null && TextUtils.equals(str, tL_pendingSuggestion.suggestion)) {
                this.customPendingSuggestion = null;
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
            } else {
                if (!this.pendingSuggestions.remove(str) && this.dismissedSuggestions.contains(str)) {
                    return;
                }
                this.dismissedSuggestions.add(str);
                SharedPreferences.Editor editorEdit = this.mainPreferences.edit();
                editorEdit.putStringSet("pendingSuggestions", this.pendingSuggestions);
                editorEdit.putStringSet("dismissedSuggestions", this.dismissedSuggestions);
                editorEdit.commit();
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
            }
        }
        TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
        tL_help_dismissSuggestion.suggestion = str;
        if (j == 0) {
            tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
        } else {
            tL_help_dismissSuggestion.peer = getInputPeer(j);
        }
        getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                MessagesController.lambda$removeSuggestion$40(tLObject, tL_error);
            }
        });
    }

    public void updateConfig(final TLRPC.TL_config tL_config) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$updateConfig$41(tL_config);
            }
        });
    }

    public void lambda$updateConfig$41(TLRPC.TL_config tL_config) {
        getDownloadController().loadAutoDownloadConfig(false);
        loadAppConfig(true);
        checkPeerColors(true);
        this.remoteConfigLoaded = true;
        this.maxMegagroupCount = tL_config.megagroup_size_max;
        this.maxGroupCount = tL_config.chat_size_max;
        this.maxEditTime = tL_config.edit_time_limit;
        this.ratingDecay = tL_config.rating_e_decay;
        this.maxRecentStickersCount = tL_config.stickers_recent_limit;
        this.revokeTimeLimit = tL_config.revoke_time_limit;
        this.revokeTimePmLimit = tL_config.revoke_pm_time_limit;
        this.canRevokePmInbox = tL_config.revoke_pm_inbox;
        String str = tL_config.me_url_prefix;
        this.linkPrefix = str;
        boolean z = tL_config.force_try_ipv6;
        if (str.endsWith("/")) {
            String str2 = this.linkPrefix;
            this.linkPrefix = str2.substring(0, str2.length() - 1);
        }
        if (this.linkPrefix.startsWith("https://")) {
            this.linkPrefix = this.linkPrefix.substring(8);
        } else if (this.linkPrefix.startsWith("http://")) {
            this.linkPrefix = this.linkPrefix.substring(7);
        }
        this.callReceiveTimeout = tL_config.call_receive_timeout_ms;
        this.callRingTimeout = tL_config.call_ring_timeout_ms;
        this.callConnectTimeout = tL_config.call_connect_timeout_ms;
        this.callPacketTimeout = tL_config.call_packet_timeout_ms;
        this.maxMessageLength = tL_config.message_length_max;
        this.maxCaptionLength = tL_config.caption_length_max;
        this.preloadFeaturedStickers = tL_config.preload_featured_stickers;
        String str3 = tL_config.venue_search_username;
        if (str3 != null) {
            this.venueSearchBot = str3;
        }
        String str4 = tL_config.gif_search_username;
        if (str4 != null) {
            this.gifSearchBot = str4;
        }
        if (this.imageSearchBot != null) {
            this.imageSearchBot = tL_config.img_search_username;
        }
        this.blockedCountry = tL_config.blocked_mode;
        this.dcDomainName = tL_config.dc_txt_domain_name;
        this.webFileDatacenterId = tL_config.webfile_dc_id;
        String str5 = tL_config.suggested_lang_code;
        if (str5 != null) {
            String str6 = this.suggestedLangCode;
            boolean z2 = str6 == null || !str6.equals(str5);
            this.suggestedLangCode = tL_config.suggested_lang_code;
            if (z2) {
                LocaleController.getInstance().loadRemoteLanguages(this.currentAccount);
            }
        }
        Theme.loadRemoteThemes(this.currentAccount, false);
        Theme.checkCurrentRemoteTheme(false);
        if (tL_config.static_maps_provider == null) {
            tL_config.static_maps_provider = "telegram";
        }
        this.mapKey = null;
        this.mapProvider = 2;
        this.availableMapProviders = 0;
        FileLog.d("map providers = " + tL_config.static_maps_provider);
        String[] strArrSplit = tL_config.static_maps_provider.split(",");
        for (int i = 0; i < strArrSplit.length; i++) {
            String[] strArrSplit2 = strArrSplit[i].split("\\+");
            if (strArrSplit2.length > 0) {
                String[] strArrSplit3 = strArrSplit2[0].split(":");
                if (strArrSplit3.length > 0) {
                    if ("yandex".equals(strArrSplit3[0])) {
                        if (i == 0) {
                            if (strArrSplit2.length > 1) {
                                this.mapProvider = 3;
                            } else {
                                this.mapProvider = 1;
                            }
                        }
                        this.availableMapProviders |= 4;
                    } else if ("google".equals(strArrSplit3[0])) {
                        if (i == 0 && strArrSplit2.length > 1) {
                            this.mapProvider = 4;
                        }
                        this.availableMapProviders |= 1;
                    } else if ("telegram".equals(strArrSplit3[0])) {
                        if (i == 0) {
                            this.mapProvider = 2;
                        }
                        this.availableMapProviders |= 2;
                    }
                    if (strArrSplit3.length > 1) {
                        this.mapKey = strArrSplit3[1];
                    }
                }
            }
        }
        SharedPreferences.Editor editorEdit = this.mainPreferences.edit();
        editorEdit.putBoolean("remoteConfigLoaded", this.remoteConfigLoaded);
        editorEdit.putInt("maxGroupCount", this.maxGroupCount);
        editorEdit.putInt("maxMegagroupCount", this.maxMegagroupCount);
        editorEdit.putInt("maxEditTime", this.maxEditTime);
        editorEdit.putInt("ratingDecay", this.ratingDecay);
        editorEdit.putInt("maxRecentGifsCount", this.maxRecentGifsCount);
        editorEdit.putInt("maxRecentStickersCount", this.maxRecentStickersCount);
        editorEdit.putInt("maxFaveStickersCount", this.maxFaveStickersCount);
        editorEdit.putInt("callReceiveTimeout", this.callReceiveTimeout);
        editorEdit.putInt("callRingTimeout", this.callRingTimeout);
        editorEdit.putInt("callConnectTimeout", this.callConnectTimeout);
        editorEdit.putInt("callPacketTimeout", this.callPacketTimeout);
        editorEdit.putString("linkPrefix", this.linkPrefix);
        editorEdit.putInt("maxFolderPinnedDialogsCountDefault", this.maxFolderPinnedDialogsCountDefault);
        editorEdit.putInt("maxFolderPinnedDialogsCountPremium", this.maxFolderPinnedDialogsCountPremium);
        editorEdit.putInt("maxMessageLength", this.maxMessageLength);
        editorEdit.putInt("maxCaptionLength", this.maxCaptionLength);
        editorEdit.putBoolean("preloadFeaturedStickers", this.preloadFeaturedStickers);
        editorEdit.putInt("revokeTimeLimit", this.revokeTimeLimit);
        editorEdit.putInt("revokeTimePmLimit", this.revokeTimePmLimit);
        editorEdit.putInt("mapProvider", this.mapProvider);
        String str7 = this.mapKey;
        if (str7 != null) {
            editorEdit.putString("pk", str7);
        } else {
            editorEdit.remove("pk");
        }
        editorEdit.putBoolean("canRevokePmInbox", this.canRevokePmInbox);
        editorEdit.putBoolean("blockedCountry", this.blockedCountry);
        editorEdit.putString("venueSearchBot", this.venueSearchBot);
        editorEdit.putString("gifSearchBot", this.gifSearchBot);
        editorEdit.putString("imageSearchBot", this.imageSearchBot);
        editorEdit.putString("dcDomainName2", this.dcDomainName);
        editorEdit.putInt("webFileDatacenterId", this.webFileDatacenterId);
        editorEdit.putString("suggestedLangCode", this.suggestedLangCode);
        editorEdit.putBoolean("forceTryIpV6", z);
        String str8 = tL_config.autologin_token;
        this.autologinToken = str8;
        editorEdit.putString("autologinToken", str8);
        editorEdit.commit();
        getConnectionsManager().setForceTryIpV6(z);
        LocaleController.getInstance().checkUpdateForCurrentRemoteLocale(this.currentAccount, tL_config.lang_pack_version, tL_config.base_lang_pack_version);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.configLoaded, new Object[0]);
    }

    public void addSupportUser() {
        TLRPC.TL_userForeign_old2 tL_userForeign_old2 = new TLRPC.TL_userForeign_old2();
        tL_userForeign_old2.phone = "333";
        tL_userForeign_old2.id = 333000L;
        tL_userForeign_old2.first_name = "Telegram";
        tL_userForeign_old2.last_name = "";
        tL_userForeign_old2.status = null;
        tL_userForeign_old2.photo = new TLRPC.TL_userProfilePhotoEmpty();
        putUser(tL_userForeign_old2, true);
        TLRPC.TL_userForeign_old2 tL_userForeign_old22 = new TLRPC.TL_userForeign_old2();
        tL_userForeign_old22.phone = "42777";
        tL_userForeign_old22.id = 777000L;
        tL_userForeign_old22.verified = true;
        tL_userForeign_old22.first_name = "Telegram";
        tL_userForeign_old22.last_name = "Notifications";
        tL_userForeign_old22.status = null;
        tL_userForeign_old22.photo = new TLRPC.TL_userProfilePhotoEmpty();
        putUser(tL_userForeign_old22, true);
    }

    public TLRPC.InputUser getInputUser(TLRPC.User user) {
        if (user == null) {
            return new TLRPC.TL_inputUserEmpty();
        }
        if (user.id == getUserConfig().getClientUserId()) {
            return new TLRPC.TL_inputUserSelf();
        }
        TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
        tL_inputUser.user_id = user.id;
        tL_inputUser.access_hash = user.access_hash;
        return tL_inputUser;
    }

    public TLRPC.InputUser getInputUser(TLRPC.InputPeer inputPeer) {
        if (inputPeer == null) {
            return new TLRPC.TL_inputUserEmpty();
        }
        if (inputPeer instanceof TLRPC.TL_inputPeerSelf) {
            return new TLRPC.TL_inputUserSelf();
        }
        TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
        tL_inputUser.user_id = inputPeer.user_id;
        tL_inputUser.access_hash = inputPeer.access_hash;
        return tL_inputUser;
    }

    public TLRPC.InputUser getInputUser(long j) {
        return getInputUser(getUser(Long.valueOf(j)));
    }

    public static TLRPC.InputChannel getInputChannel(TLRPC.Chat chat) {
        if ((chat instanceof TLRPC.TL_channel) || (chat instanceof TLRPC.TL_channelForbidden)) {
            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
            tL_inputChannel.channel_id = chat.id;
            tL_inputChannel.access_hash = chat.access_hash;
            return tL_inputChannel;
        }
        return new TLRPC.TL_inputChannelEmpty();
    }

    public static TLRPC.InputChannel getInputChannel(TLRPC.InputPeer inputPeer) {
        TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
        tL_inputChannel.channel_id = inputPeer.channel_id;
        tL_inputChannel.access_hash = inputPeer.access_hash;
        return tL_inputChannel;
    }

    public TLRPC.InputChannel getInputChannel(long j) {
        return getInputChannel(getChat(Long.valueOf(j)));
    }

    public TLRPC.InputPeer getInputPeer(TLRPC.Peer peer) {
        if (peer instanceof TLRPC.TL_peerChat) {
            TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
            tL_inputPeerChat.chat_id = peer.chat_id;
            return tL_inputPeerChat;
        }
        if (peer instanceof TLRPC.TL_peerChannel) {
            TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
            long j = peer.channel_id;
            tL_inputPeerChannel.channel_id = j;
            TLRPC.Chat chat = getChat(Long.valueOf(j));
            if (chat == null) {
                return tL_inputPeerChannel;
            }
            tL_inputPeerChannel.access_hash = chat.access_hash;
            return tL_inputPeerChannel;
        }
        TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
        long j2 = peer.user_id;
        tL_inputPeerUser.user_id = j2;
        TLRPC.User user = getUser(Long.valueOf(j2));
        if (user == null) {
            return tL_inputPeerUser;
        }
        tL_inputPeerUser.access_hash = user.access_hash;
        return tL_inputPeerUser;
    }

    public TLRPC.InputPeer getInputPeer(long j) {
        TLRPC.InputPeer tL_inputPeerUser;
        if (j == getUserConfig().getClientUserId()) {
            return new TLRPC.TL_inputPeerSelf();
        }
        if (j < 0) {
            long j2 = -j;
            TLRPC.Chat chat = getChat(Long.valueOf(j2));
            if (ChatObject.isChannel(chat)) {
                tL_inputPeerUser = new TLRPC.TL_inputPeerChannel();
                tL_inputPeerUser.channel_id = j2;
                tL_inputPeerUser.access_hash = chat.access_hash;
            } else {
                TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                tL_inputPeerChat.chat_id = j2;
                return tL_inputPeerChat;
            }
        } else {
            TLRPC.User user = getUser(Long.valueOf(j));
            tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
            tL_inputPeerUser.user_id = j;
            if (user != null) {
                tL_inputPeerUser.access_hash = user.access_hash;
            }
        }
        return tL_inputPeerUser;
    }

    public static TLRPC.InputPeer getInputPeer(TLRPC.Chat chat) {
        if (ChatObject.isChannel(chat)) {
            TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
            tL_inputPeerChannel.channel_id = chat.id;
            tL_inputPeerChannel.access_hash = chat.access_hash;
            return tL_inputPeerChannel;
        }
        TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
        tL_inputPeerChat.chat_id = chat.id;
        return tL_inputPeerChat;
    }

    public static TLRPC.InputPeer getInputPeer(TLRPC.User user) {
        TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
        tL_inputPeerUser.user_id = user.id;
        tL_inputPeerUser.access_hash = user.access_hash;
        return tL_inputPeerUser;
    }

    public static TLRPC.InputPeer getInputPeer(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return getInputPeer((TLRPC.User) tLObject);
        }
        if (tLObject instanceof TLRPC.Chat) {
            return getInputPeer((TLRPC.Chat) tLObject);
        }
        return null;
    }

    public TLRPC.Peer getPeer(long j) {
        if (j < 0) {
            long j2 = -j;
            TLRPC.Chat chat = getChat(Long.valueOf(j2));
            if ((chat instanceof TLRPC.TL_channel) || (chat instanceof TLRPC.TL_channelForbidden)) {
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                tL_peerChannel.channel_id = j2;
                return tL_peerChannel;
            }
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            tL_peerChat.chat_id = j2;
            return tL_peerChat;
        }
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_peerUser.user_id = j;
        return tL_peerUser;
    }

    public TLRPC.InputDocument getInputDocument(TLRPC.Document document) {
        if (document == null) {
            return null;
        }
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_inputDocument.id = document.id;
        tL_inputDocument.access_hash = document.access_hash;
        byte[] bArr = document.file_reference;
        tL_inputDocument.file_reference = bArr;
        if (bArr == null) {
            tL_inputDocument.file_reference = new byte[0];
        }
        return tL_inputDocument;
    }

    public String getPeerName(long j) {
        return getPeerName(j, false);
    }

    public String getPeerName(long j, boolean z) {
        if (j >= 0) {
            TLRPC.User user = getUser(Long.valueOf(j));
            if (z) {
                return AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getFirstName(user, true)));
            }
            return AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(user)));
        }
        TLRPC.Chat chat = getChat(Long.valueOf(-j));
        return AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat == null ? "" : chat.title));
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        MessageObject messageObject;
        TLRPC.InputFile inputFile;
        final Theme.ThemeInfo themeInfo;
        TLRPC.InputFile inputFile2;
        final Theme.ThemeAccent themeAccent;
        TLRPC.TL_theme tL_theme;
        TLRPC.TL_inputThemeSettings tL_inputThemeSettings = null;
        if (i == NotificationCenter.fileUploaded) {
            String str = (String) objArr[0];
            TLRPC.InputFile inputFile3 = (TLRPC.InputFile) objArr[1];
            String str2 = this.uploadingAvatar;
            if (str2 != null && str2.equals(str)) {
                TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                tL_photos_uploadProfilePhoto.file = inputFile3;
                tL_photos_uploadProfilePhoto.flags |= 1;
                getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        this.f$0.lambda$didReceivedNotification$43(tLObject, tL_error);
                    }
                });
            } else {
                String str3 = this.uploadingWallpaper;
                if (str3 != null && str3.equals(str)) {
                    TL_account.uploadWallPaper uploadwallpaper = new TL_account.uploadWallPaper();
                    uploadwallpaper.file = inputFile3;
                    uploadwallpaper.mime_type = "image/jpeg";
                    final Theme.OverrideWallpaperInfo overrideWallpaperInfo = this.uploadingWallpaperInfo;
                    final String str4 = this.uploadingWallpaper;
                    final TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
                    tL_wallPaperSettings.blur = overrideWallpaperInfo.isBlurred;
                    tL_wallPaperSettings.motion = overrideWallpaperInfo.isMotion;
                    uploadwallpaper.settings = tL_wallPaperSettings;
                    Theme.OverrideWallpaperInfo overrideWallpaperInfo2 = this.uploadingWallpaperInfo;
                    overrideWallpaperInfo2.uploadingProgress = 1.0f;
                    overrideWallpaperInfo2.requestIds = new ArrayList();
                    this.uploadingWallpaperInfo.requestIds.add(Integer.valueOf(getConnectionsManager().sendRequest(uploadwallpaper, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            this.f$0.lambda$didReceivedNotification$45(overrideWallpaperInfo, tL_wallPaperSettings, str4, tLObject, tL_error);
                        }
                    })));
                } else {
                    Object obj = this.uploadingThemes.get(str);
                    if (obj instanceof Theme.ThemeInfo) {
                        themeInfo = (Theme.ThemeInfo) obj;
                        if (str.equals(themeInfo.uploadingThumb)) {
                            themeInfo.uploadedThumb = inputFile3;
                            themeInfo.uploadingThumb = null;
                        } else if (str.equals(themeInfo.uploadingFile)) {
                            themeInfo.uploadedFile = inputFile3;
                            themeInfo.uploadingFile = null;
                        }
                        inputFile = themeInfo.uploadedThumb;
                        inputFile2 = themeInfo.uploadedFile;
                        themeAccent = null;
                    } else if (obj instanceof Theme.ThemeAccent) {
                        Theme.ThemeAccent themeAccent2 = (Theme.ThemeAccent) obj;
                        if (str.equals(themeAccent2.uploadingThumb)) {
                            themeAccent2.uploadedThumb = inputFile3;
                            themeAccent2.uploadingThumb = null;
                        } else if (str.equals(themeAccent2.uploadingFile)) {
                            themeAccent2.uploadedFile = inputFile3;
                            themeAccent2.uploadingFile = null;
                        }
                        Theme.ThemeInfo themeInfo2 = themeAccent2.parentTheme;
                        TLRPC.InputFile inputFile4 = themeAccent2.uploadedThumb;
                        TLRPC.InputFile inputFile5 = themeAccent2.uploadedFile;
                        themeInfo = themeInfo2;
                        inputFile = inputFile4;
                        inputFile2 = inputFile5;
                        themeAccent = themeAccent2;
                    } else {
                        inputFile = null;
                        themeInfo = null;
                        inputFile2 = null;
                        themeAccent = null;
                    }
                    this.uploadingThemes.remove(str);
                    if (inputFile2 != null && inputFile != null) {
                        new File(str);
                        TL_account.uploadTheme uploadtheme = new TL_account.uploadTheme();
                        uploadtheme.mime_type = "application/x-tgtheme-android";
                        uploadtheme.file_name = "theme.attheme";
                        uploadtheme.file = inputFile2;
                        inputFile2.name = "theme.attheme";
                        uploadtheme.thumb = inputFile;
                        inputFile.name = "theme-preview.jpg";
                        uploadtheme.flags |= 1;
                        if (themeAccent != null) {
                            themeAccent.uploadedFile = null;
                            themeAccent.uploadedThumb = null;
                            tL_theme = themeAccent.info;
                            tL_inputThemeSettings = new TLRPC.TL_inputThemeSettings();
                            tL_inputThemeSettings.base_theme = Theme.getBaseThemeByKey(themeInfo.name);
                            tL_inputThemeSettings.accent_color = themeAccent.accentColor;
                            int i3 = themeAccent.accentColor2;
                            if (i3 != 0) {
                                tL_inputThemeSettings.flags |= 8;
                                tL_inputThemeSettings.outbox_accent_color = i3;
                            }
                            int i4 = themeAccent.myMessagesAccentColor;
                            if (i4 != 0) {
                                tL_inputThemeSettings.message_colors.add(Integer.valueOf(i4));
                                tL_inputThemeSettings.flags |= 1;
                                int i5 = themeAccent.myMessagesGradientAccentColor1;
                                if (i5 != 0) {
                                    tL_inputThemeSettings.message_colors.add(Integer.valueOf(i5));
                                    int i6 = themeAccent.myMessagesGradientAccentColor2;
                                    if (i6 != 0) {
                                        tL_inputThemeSettings.message_colors.add(Integer.valueOf(i6));
                                        int i7 = themeAccent.myMessagesGradientAccentColor3;
                                        if (i7 != 0) {
                                            tL_inputThemeSettings.message_colors.add(Integer.valueOf(i7));
                                        }
                                    }
                                }
                                tL_inputThemeSettings.message_colors_animated = themeAccent.myMessagesAnimated;
                            }
                            tL_inputThemeSettings.flags |= 2;
                            tL_inputThemeSettings.wallpaper_settings = new TLRPC.TL_wallPaperSettings();
                            if (!TextUtils.isEmpty(themeAccent.patternSlug)) {
                                TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                                tL_inputWallPaperSlug.slug = themeAccent.patternSlug;
                                tL_inputThemeSettings.wallpaper = tL_inputWallPaperSlug;
                                TLRPC.WallPaperSettings wallPaperSettings = tL_inputThemeSettings.wallpaper_settings;
                                wallPaperSettings.intensity = (int) (themeAccent.patternIntensity * 100.0f);
                                wallPaperSettings.flags |= 8;
                            } else {
                                TLRPC.TL_inputWallPaperNoFile tL_inputWallPaperNoFile = new TLRPC.TL_inputWallPaperNoFile();
                                tL_inputWallPaperNoFile.id = 0L;
                                tL_inputThemeSettings.wallpaper = tL_inputWallPaperNoFile;
                            }
                            TLRPC.WallPaperSettings wallPaperSettings2 = tL_inputThemeSettings.wallpaper_settings;
                            wallPaperSettings2.motion = themeAccent.patternMotion;
                            long j = themeAccent.backgroundOverrideColor;
                            if (j != 0) {
                                wallPaperSettings2.background_color = (int) j;
                                wallPaperSettings2.flags |= 1;
                            }
                            long j2 = themeAccent.backgroundGradientOverrideColor1;
                            if (j2 != 0) {
                                wallPaperSettings2.second_background_color = (int) j2;
                                wallPaperSettings2.flags |= 16;
                                wallPaperSettings2.rotation = AndroidUtilities.getWallpaperRotation(themeAccent.backgroundRotation, true);
                            }
                            long j3 = themeAccent.backgroundGradientOverrideColor2;
                            if (j3 != 0) {
                                TLRPC.WallPaperSettings wallPaperSettings3 = tL_inputThemeSettings.wallpaper_settings;
                                wallPaperSettings3.third_background_color = (int) j3;
                                wallPaperSettings3.flags |= 32;
                            }
                            long j4 = themeAccent.backgroundGradientOverrideColor3;
                            if (j4 != 0) {
                                TLRPC.WallPaperSettings wallPaperSettings4 = tL_inputThemeSettings.wallpaper_settings;
                                wallPaperSettings4.fourth_background_color = (int) j4;
                                wallPaperSettings4.flags |= 64;
                            }
                        } else {
                            themeInfo.uploadedFile = null;
                            themeInfo.uploadedThumb = null;
                            tL_theme = themeInfo.info;
                        }
                        final TLRPC.TL_theme tL_theme2 = tL_theme;
                        final TLRPC.TL_inputThemeSettings tL_inputThemeSettings2 = tL_inputThemeSettings;
                        getConnectionsManager().sendRequest(uploadtheme, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                this.f$0.lambda$didReceivedNotification$51(tL_theme2, themeInfo, tL_inputThemeSettings2, themeAccent, tLObject, tL_error);
                            }
                        });
                    }
                }
            }
        } else if (i == NotificationCenter.fileUploadFailed) {
            String str5 = (String) objArr[0];
            String str6 = this.uploadingAvatar;
            if (str6 != null && str6.equals(str5)) {
                this.uploadingAvatar = null;
            } else {
                String str7 = this.uploadingWallpaper;
                if (str7 != null && str7.equals(str5)) {
                    this.uploadingWallpaper = null;
                    this.uploadingWallpaperInfo = null;
                } else {
                    Object objRemove = this.uploadingThemes.remove(str5);
                    if (objRemove instanceof Theme.ThemeInfo) {
                        Theme.ThemeInfo themeInfo3 = (Theme.ThemeInfo) objRemove;
                        themeInfo3.uploadedFile = null;
                        themeInfo3.uploadedThumb = null;
                        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeUploadError, themeInfo3, null);
                    } else if (objRemove instanceof Theme.ThemeAccent) {
                        Theme.ThemeAccent themeAccent3 = (Theme.ThemeAccent) objRemove;
                        themeAccent3.uploadingThumb = null;
                        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeUploadError, themeAccent3.parentTheme, themeAccent3);
                    }
                }
            }
        }
        if (i == NotificationCenter.fileUploadProgressChanged) {
            String str8 = (String) objArr[0];
            String str9 = this.uploadingWallpaper;
            if (str9 == null || !str9.equals(str8)) {
                return;
            }
            this.uploadingWallpaperInfo.uploadingProgress = ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue();
            return;
        }
        if (i == NotificationCenter.messageReceivedByServer) {
            if (((Boolean) objArr[6]).booleanValue()) {
                return;
            }
            Integer num = (Integer) objArr[0];
            Integer num2 = (Integer) objArr[1];
            Long l = (Long) objArr[3];
            ArrayList arrayList = (ArrayList) this.dialogMessage.get(l.longValue());
            for (int i8 = 0; arrayList != null && i8 < arrayList.size(); i8++) {
                MessageObject messageObject2 = (MessageObject) arrayList.get(i8);
                if (messageObject2 != null && (messageObject2.getId() == num.intValue() || messageObject2.messageOwner.local_id == num.intValue())) {
                    messageObject2.messageOwner.id = num2.intValue();
                    messageObject2.messageOwner.send_state = 0;
                }
                MessageObject messageObject3 = this.dialogMessagesByIds.get(num.intValue());
                if (messageObject3 != null) {
                    this.dialogMessagesByIds.remove(num.intValue());
                    this.dialogMessagesByIds.put(num2.intValue(), messageObject3);
                }
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) this.dialogs_dict.get(l.longValue());
            if (dialog != null && dialog.top_message == num.intValue()) {
                dialog.top_message = num2.intValue();
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
            }
            if (DialogObject.isChatDialog(l.longValue())) {
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) this.fullChats.get(-l.longValue());
                TLRPC.Chat chat = getChat(Long.valueOf(-l.longValue()));
                if (chat == null || ChatObject.hasAdminRights(chat) || chatFull == null || chatFull.slowmode_seconds == 0) {
                    return;
                }
                chatFull.slowmode_next_send_date = getConnectionsManager().getCurrentTime() + chatFull.slowmode_seconds;
                chatFull.flags |= 262144;
                getMessagesStorage().updateChatInfo(chatFull, false);
                return;
            }
            return;
        }
        if (i == NotificationCenter.updateMessageMedia) {
            TLRPC.Message message = (TLRPC.Message) objArr[0];
            if (message.peer_id.channel_id != 0 || (messageObject = this.dialogMessagesByIds.get(message.id)) == null) {
                return;
            }
            messageObject.messageOwner.media = MessageObject.getMedia(message);
            if (MessageObject.getMedia(message).ttl_seconds != 0) {
                if ((MessageObject.getMedia(message).photo instanceof TLRPC.TL_photoEmpty) || (MessageObject.getMedia(message).document instanceof TLRPC.TL_documentEmpty)) {
                    messageObject.setType();
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
                    return;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.currentUserPremiumStatusChanged) {
            loadAppConfig(false);
            getContactsController().reloadContactsStatusesMaybe(true);
            if ((!this.storyQualityFull || getUserConfig().isPremium()) && !getUserConfig().isPremium()) {
                return;
            }
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyQualityUpdate, new Object[0]);
        }
    }

    public void lambda$didReceivedNotification$43(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.User user = getUser(Long.valueOf(getUserConfig().getClientUserId()));
            if (user == null) {
                user = getUserConfig().getCurrentUser();
                putUser(user, true);
            } else {
                getUserConfig().setCurrentUser(user);
            }
            if (user == null) {
                return;
            }
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 100);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, 1000);
            TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
            user.photo = tL_userProfilePhoto;
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
            if (closestPhotoSizeWithSize != null) {
                tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
            }
            if (closestPhotoSizeWithSize2 != null) {
                tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
            }
            getDialogPhotos(user.id).reset();
            getDialogPhotos(user.id).load(0, 80);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(user);
            getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$didReceivedNotification$42();
                }
            });
        }
    }

    public void lambda$didReceivedNotification$42() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_AVATAR));
        getUserConfig().saveConfig(true);
    }

    public void lambda$didReceivedNotification$45(final Theme.OverrideWallpaperInfo overrideWallpaperInfo, final TLRPC.TL_wallPaperSettings tL_wallPaperSettings, final String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        final TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
        final File file = new File(ApplicationLoader.getFilesDirFixed(), overrideWallpaperInfo.originalFileName);
        if (wallPaper != null) {
            try {
                AndroidUtilities.copyFile(file, getFileLoader().getPathToAttach(wallPaper.document, true));
            } catch (Exception unused) {
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$didReceivedNotification$44(wallPaper, tL_wallPaperSettings, overrideWallpaperInfo, file, str);
            }
        });
    }

    public void lambda$didReceivedNotification$44(TLRPC.WallPaper wallPaper, TLRPC.TL_wallPaperSettings tL_wallPaperSettings, Theme.OverrideWallpaperInfo overrideWallpaperInfo, File file, String str) {
        if (this.uploadingWallpaper == null || this.uploadingWallpaperInfo.requestIds == null || wallPaper == null) {
            return;
        }
        wallPaper.settings = tL_wallPaperSettings;
        wallPaper.flags |= 4;
        overrideWallpaperInfo.slug = wallPaper.slug;
        overrideWallpaperInfo.saveOverrideWallpaper();
        ArrayList<TLRPC.WallPaper> arrayList = new ArrayList<>();
        arrayList.add(wallPaper);
        getMessagesStorage().putWallpapers(arrayList, 2);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(wallPaper.document.thumbs, 320);
        if (closestPhotoSizeWithSize != null) {
            ImageLoader.getInstance().replaceImageInCache(Utilities.MD5(file.getAbsolutePath()) + "@100_100", closestPhotoSizeWithSize.location.volume_id + "_" + closestPhotoSizeWithSize.location.local_id + "@100_100", ImageLocation.getForDocument(closestPhotoSizeWithSize, wallPaper.document), false);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.wallpapersNeedReload, wallPaper.slug);
        ArrayList arrayList2 = this.uploadingWallpaperInfo.requestIds;
        if (arrayList2 == null || overrideWallpaperInfo.dialogId == 0) {
            return;
        }
        arrayList2.add(Integer.valueOf(ChatThemeController.getInstance(this.currentAccount).setWallpaperToPeer(overrideWallpaperInfo.dialogId, str, overrideWallpaperInfo, null, null)));
    }

    public void lambda$didReceivedNotification$51(TLRPC.TL_theme tL_theme, final Theme.ThemeInfo themeInfo, TLRPC.TL_inputThemeSettings tL_inputThemeSettings, final Theme.ThemeAccent themeAccent, TLObject tLObject, TLRPC.TL_error tL_error) {
        String name = tL_theme != null ? tL_theme.title : themeInfo.getName();
        int iLastIndexOf = name.lastIndexOf(".attheme");
        if (iLastIndexOf > 0) {
            name = name.substring(0, iLastIndexOf);
        }
        if (tLObject != null) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.id = document.id;
            tL_inputDocument.file_reference = document.file_reference;
            if (tL_theme == null || !tL_theme.creator) {
                TL_account.createTheme createtheme = new TL_account.createTheme();
                createtheme.document = tL_inputDocument;
                createtheme.flags |= 4;
                createtheme.slug = (tL_theme == null || TextUtils.isEmpty(tL_theme.slug)) ? "" : tL_theme.slug;
                createtheme.title = name;
                if (tL_inputThemeSettings != null) {
                    createtheme.settings = tL_inputThemeSettings;
                    createtheme.flags |= 8;
                }
                getConnectionsManager().sendRequest(createtheme, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                        this.f$0.lambda$didReceivedNotification$47(themeInfo, themeAccent, tLObject2, tL_error2);
                    }
                });
                return;
            }
            TL_account.updateTheme updatetheme = new TL_account.updateTheme();
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.id = tL_theme.id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            updatetheme.theme = tL_inputTheme;
            updatetheme.slug = tL_theme.slug;
            int i = updatetheme.flags;
            updatetheme.title = name;
            updatetheme.document = tL_inputDocument;
            updatetheme.flags = i | 7;
            if (tL_inputThemeSettings != null) {
                updatetheme.settings = tL_inputThemeSettings;
                updatetheme.flags = i | 15;
            }
            updatetheme.format = "android";
            getConnectionsManager().sendRequest(updatetheme, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                    this.f$0.lambda$didReceivedNotification$49(themeInfo, themeAccent, tLObject2, tL_error2);
                }
            });
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$didReceivedNotification$50(themeInfo, themeAccent);
            }
        });
    }

    public void lambda$didReceivedNotification$47(final Theme.ThemeInfo themeInfo, final Theme.ThemeAccent themeAccent, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$didReceivedNotification$46(tLObject, themeInfo, themeAccent);
            }
        });
    }

    public void lambda$didReceivedNotification$46(TLObject tLObject, Theme.ThemeInfo themeInfo, Theme.ThemeAccent themeAccent) {
        if (tLObject instanceof TLRPC.TL_theme) {
            Theme.setThemeUploadInfo(themeInfo, themeAccent, (TLRPC.TL_theme) tLObject, this.currentAccount, false);
            installTheme(themeInfo, themeAccent, themeInfo == Theme.getCurrentNightTheme());
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeUploadedToServer, themeInfo, themeAccent);
            return;
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeUploadError, themeInfo, themeAccent);
    }

    public void lambda$didReceivedNotification$49(final Theme.ThemeInfo themeInfo, final Theme.ThemeAccent themeAccent, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$didReceivedNotification$48(tLObject, themeInfo, themeAccent);
            }
        });
    }

    public void lambda$didReceivedNotification$48(TLObject tLObject, Theme.ThemeInfo themeInfo, Theme.ThemeAccent themeAccent) {
        if (tLObject instanceof TLRPC.TL_theme) {
            Theme.setThemeUploadInfo(themeInfo, themeAccent, (TLRPC.TL_theme) tLObject, this.currentAccount, false);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeUploadedToServer, themeInfo, themeAccent);
        } else {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeUploadError, themeInfo, themeAccent);
        }
    }

    public void lambda$didReceivedNotification$50(Theme.ThemeInfo themeInfo, Theme.ThemeAccent themeAccent) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeUploadError, themeInfo, themeAccent);
    }

    public void cleanup() {
        getContactsController().cleanup();
        MediaController.getInstance().cleanup();
        getNotificationsController().cleanup();
        getSendMessagesHelper().cleanup();
        getSecretChatHelper().cleanup();
        getLocationController().cleanup();
        getMediaDataController().cleanup();
        getColorPalette().cleanup();
        getTranslateController().cleanup();
        getSavedMessagesController().cleanup();
        StoriesController storiesController = this.storiesController;
        if (storiesController != null) {
            storiesController.cleanup();
        }
        UnconfirmedAuthController unconfirmedAuthController = this.unconfirmedAuthController;
        if (unconfirmedAuthController != null) {
            unconfirmedAuthController.cleanup();
        }
        this.showFiltersTooltip = false;
        DialogsActivity.dialogsLoaded[this.currentAccount] = false;
        this.notificationsPreferences.edit().clear().commit();
        this.emojiPreferences.edit().putLong("lastGifLoadTime", 0L).putLong("lastStickersLoadTime", 0L).putLong("lastStickersLoadTimeMask", 0L).putLong("lastStickersLoadTimeFavs", 0L).commit();
        this.mainPreferences.edit().remove("archivehint").remove("proximityhint").remove("archivehint_l").remove("gifhint").remove("reminderhint").remove("soundHint").remove("dcDomainName2").remove("webFileDatacenterId").remove("themehint").remove("showFiltersTooltip").remove("transcribeButtonPressed").commit();
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("shortcut_widget", 0);
        SharedPreferences.Editor editorEdit = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        AppWidgetManager appWidgetManager = null;
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            String key = entry.getKey();
            if (key.startsWith("account") && ((Integer) entry.getValue()).intValue() == this.currentAccount) {
                Integer num = Utilities.parseInt((CharSequence) key);
                int iIntValue = num.intValue();
                if (editorEdit == null) {
                    editorEdit = sharedPreferences.edit();
                    appWidgetManager = AppWidgetManager.getInstance(ApplicationLoader.applicationContext);
                }
                editorEdit.putBoolean("deleted" + iIntValue, true);
                if (sharedPreferences.getInt("type" + iIntValue, 0) == 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(num);
                } else {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(num);
                }
            }
        }
        if (editorEdit != null) {
            editorEdit.commit();
        }
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ChatsWidgetProvider.updateWidget(ApplicationLoader.applicationContext, appWidgetManager, ((Integer) arrayList.get(i)).intValue());
            }
        }
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ContactsWidgetProvider.updateWidget(ApplicationLoader.applicationContext, appWidgetManager, ((Integer) arrayList2.get(i2)).intValue());
            }
        }
        this.lastScheduledServerQueryTime.clear();
        this.lastQuickReplyServerQueryTime.clear();
        this.lastSavedServerQueryTime.clear();
        this.lastServerQueryTime.clear();
        this.reloadingWebpages.clear();
        this.reloadingWebpagesPending.clear();
        this.reloadingScheduledWebpages.clear();
        this.reloadingScheduledWebpagesPending.clear();
        this.reloadingSavedWebpages.clear();
        this.reloadingSavedWebpagesPending.clear();
        this.sponsoredMessages.clear();
        this.sendAsPeers.clear();
        this.sendAsPeersLiveStories.clear();
        this.dialogs_dict.clear();
        this.dialogs_read_inbox_max.clear();
        this.loadingPinnedDialogs.clear();
        this.dialogs_read_outbox_max.clear();
        this.exportedChats.clear();
        this.fullUsers.clear();
        this.fullChats.clear();
        this.activeVoiceChatsMap.clear();
        this.loadingGroupCalls.clear();
        this.groupCallsByChatId.clear();
        this.dialogsByFolder.clear();
        this.unreadUnmutedDialogs = 0;
        this.joiningToChannels.clear();
        this.migratedChats.clear();
        this.channelViewsToSend.clear();
        this.pollsToCheck.clear();
        this.pollsToCheckSize = 0;
        this.dialogsServerOnly.clear();
        this.dialogsForward.clear();
        this.allDialogs.clear();
        this.dialogsLoadedTillDate = Integer.MAX_VALUE;
        this.dialogsCanAddUsers.clear();
        this.dialogsMyChannels.clear();
        this.dialogsMyGroups.clear();
        this.dialogsChannelsOnly.clear();
        this.dialogsGroupsOnly.clear();
        this.dialogsUsersOnly.clear();
        this.dialogsForBlock.clear();
        this.dialogMessagesByIds.clear();
        this.dialogMessagesByRandomIds.clear();
        this.channelAdmins.clear();
        this.loadingChannelAdmins.clear();
        this.users.clear();
        this.objectsByUsernames.clear();
        this.chats.clear();
        this.dialogMessage.clear();
        this.deletedHistory.clear();
        this.printingUsers.clear();
        this.printingStrings.clear();
        this.printingStringsTypes.clear();
        this.onlinePrivacy.clear();
        this.loadingPeerSettings.clear();
        this.deletingDialogs.clear();
        this.clearingHistoryDialogs.clear();
        this.lastPrintingStringCount = 0;
        DialogFilter[] dialogFilterArr = this.selectedDialogFilter;
        dialogFilterArr[1] = null;
        dialogFilterArr[0] = null;
        this.dialogFilters.clear();
        this.dialogFiltersById.clear();
        this.loadingSuggestedFilters = false;
        this.loadingRemoteFilters = false;
        this.suggestedFilters.clear();
        this.dialogFiltersLoaded = false;
        this.ignoreSetOnline = false;
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$cleanup$52();
            }
        });
        this.createdDialogMainThreadIds.clear();
        this.visibleDialogMainThreadIds.clear();
        this.visibleScheduledDialogMainThreadIds.clear();
        this.blockePeers.clear();
        int i3 = 0;
        while (true) {
            LongSparseArray[] longSparseArrayArr = this.sendingTypings;
            if (i3 >= longSparseArrayArr.length) {
                break;
            }
            LongSparseArray longSparseArray = longSparseArrayArr[i3];
            if (longSparseArray != null) {
                longSparseArray.clear();
            }
            i3++;
        }
        this.loadingFullUsers.clear();
        this.loadedFullUsers.clear();
        this.reloadingMessages.clear();
        this.loadingFullChats.clear();
        this.loadingFullParticipants.clear();
        this.loadedFullParticipants.clear();
        this.loadedFullChats.clear();
        this.dialogsLoaded = false;
        this.nextDialogsCacheOffset.clear();
        this.loadingDialogs.clear();
        this.dialogsEndReached.clear();
        this.serverDialogsEndReached.clear();
        this.checkingTosUpdate = false;
        this.nextTosCheckTime = 0;
        this.nextPromoInfoCheckTime = 0;
        this.checkingPromoInfo = false;
        this.loadingUnreadDialogs = false;
        this.currentDeletingTaskTime = 0;
        this.currentDeletingTaskMids = null;
        this.currentDeletingTaskMediaMids = null;
        this.gettingNewDeleteTask = false;
        this.loadingBlockedPeers = false;
        this.totalBlockedCount = -1;
        this.blockedEndReached = false;
        this.firstGettingTask = false;
        this.updatingState = false;
        this.resetingDialogs = false;
        this.lastStatusUpdateTime = 0L;
        this.offlineSent = false;
        this.registeringForPush = false;
        this.getDifferenceFirstSync = true;
        this.uploadingAvatar = null;
        this.uploadingWallpaper = null;
        this.uploadingWallpaperInfo = null;
        this.uploadingThemes.clear();
        this.gettingChatInviters.clear();
        this.statusRequest = 0;
        this.statusSettingState = 0;
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$cleanup$53();
            }
        });
        if (this.currentDeleteTaskRunnable != null) {
            Utilities.stageQueue.cancelRunnable(this.currentDeleteTaskRunnable);
            this.currentDeleteTaskRunnable = null;
        }
        addSupportUser();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$cleanup$54();
            }
        });
    }

    public void lambda$cleanup$52() {
        this.readTasks.clear();
        this.readTasksMap.clear();
        this.repliesReadTasks.clear();
        this.threadsReadTasksMap.clear();
        this.updatesQueueSeq.clear();
        this.updatesQueuePts.clear();
        this.updatesQueueQts.clear();
        this.gettingUnknownChannels.clear();
        this.gettingUnknownDialogs.clear();
        this.updatesStartWaitTimeSeq = 0L;
        this.updatesStartWaitTimePts = 0L;
        this.updatesStartWaitTimeQts = 0L;
        this.createdDialogIds.clear();
        this.createdScheduledDialogIds.clear();
        this.gettingDifference = false;
        this.resetDialogsPinned = null;
        this.resetDialogsAll = null;
    }

    public void lambda$cleanup$53() {
        FileLog.d("cleanup: isUpdating = false");
        getConnectionsManager().setIsUpdating(false);
        this.updatesQueueChannels.clear();
        this.updatesStartWaitTimeChannels.clear();
        this.gettingDifferenceChannels.clear();
        this.channelsPts.clear();
        this.shortPollChannels.clear();
        this.needShortPollChannels.clear();
        this.shortPollOnlines.clear();
        this.needShortPollOnlines.clear();
    }

    public void lambda$cleanup$54() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.suggestedFiltersLoaded, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
    }

    public boolean isChatNoForwards(TLRPC.Chat chat) {
        TLRPC.Chat chat2;
        if (chat == null) {
            return false;
        }
        TLRPC.InputChannel inputChannel = chat.migrated_to;
        if (inputChannel != null && (chat2 = getChat(Long.valueOf(inputChannel.channel_id))) != null) {
            return chat2.noforwards;
        }
        return chat.noforwards;
    }

    public boolean isChatNoForwards(long j) {
        return isChatNoForwards(getChat(Long.valueOf(j)));
    }

    public TLRPC.User getUser(Long l) {
        if (l.longValue() == 0) {
            return UserConfig.getInstance(this.currentAccount).getCurrentUser();
        }
        return this.users.get(l);
    }

    public TLObject getUserOrChat(long j) {
        if (this.users.containsKey(Long.valueOf(j))) {
            return this.users.get(Long.valueOf(j));
        }
        long j2 = -j;
        if (this.chats.containsKey(Long.valueOf(j2))) {
            return this.chats.get(Long.valueOf(j2));
        }
        return null;
    }

    public TLObject getUserOrChat(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return this.objectsByUsernames.get(str.toLowerCase());
    }

    public TLRPC.User getUser(String str) {
        TLObject userOrChat = getUserOrChat(str);
        if (userOrChat instanceof TLRPC.User) {
            return (TLRPC.User) userOrChat;
        }
        return null;
    }

    public ConcurrentHashMap<Long, TLRPC.User> getUsers() {
        return this.users;
    }

    public ConcurrentHashMap<Long, TLRPC.Chat> getChats() {
        return this.chats;
    }

    public TLRPC.Chat getChat(Long l) {
        return this.chats.get(l);
    }

    public TLRPC.EncryptedChat getEncryptedChat(Integer num) {
        return this.encryptedChats.get(num);
    }

    public TLRPC.EncryptedChat getEncryptedChatDB(int i, boolean z) throws InterruptedException {
        TLRPC.EncryptedChat encryptedChat = this.encryptedChats.get(Integer.valueOf(i));
        if (encryptedChat != null) {
            if (!z) {
                return encryptedChat;
            }
            if (!(encryptedChat instanceof TLRPC.TL_encryptedChatWaiting) && !(encryptedChat instanceof TLRPC.TL_encryptedChatRequested)) {
                return encryptedChat;
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ArrayList<TLObject> arrayList = new ArrayList<>();
        getMessagesStorage().getEncryptedChat(i, countDownLatch, arrayList);
        try {
            countDownLatch.await();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (arrayList.size() != 2) {
            return encryptedChat;
        }
        TLRPC.EncryptedChat encryptedChat2 = (TLRPC.EncryptedChat) arrayList.get(0);
        TLRPC.User user = (TLRPC.User) arrayList.get(1);
        putEncryptedChat(encryptedChat2, false);
        putUser(user, true);
        return encryptedChat2;
    }

    public boolean isDialogVisible(long j, boolean z) {
        return (z ? this.visibleScheduledDialogMainThreadIds : this.visibleDialogMainThreadIds).contains(Long.valueOf(j));
    }

    public void setLastVisibleDialogId(long j, boolean z, boolean z2) {
        ArrayList<Long> arrayList = z ? this.visibleScheduledDialogMainThreadIds : this.visibleDialogMainThreadIds;
        if (z2) {
            if (arrayList.contains(Long.valueOf(j))) {
                return;
            }
            arrayList.add(Long.valueOf(j));
            return;
        }
        arrayList.remove(Long.valueOf(j));
    }

    public void setLastCreatedDialogId(final long j, final boolean z, final boolean z2) {
        if (!z) {
            ArrayList<Long> arrayList = this.createdDialogMainThreadIds;
            if (z2) {
                if (arrayList.contains(Long.valueOf(j))) {
                    return;
                } else {
                    arrayList.add(Long.valueOf(j));
                }
            } else {
                arrayList.remove(Long.valueOf(j));
                SparseArray sparseArray = (SparseArray) this.pollsToCheck.get(j);
                if (sparseArray != null) {
                    int size = sparseArray.size();
                    for (int i = 0; i < size; i++) {
                        ((MessageObject) sparseArray.valueAt(i)).pollVisibleOnScreen = false;
                    }
                }
            }
        }
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$setLastCreatedDialogId$55(z, z2, j);
            }
        });
    }

    public void lambda$setLastCreatedDialogId$55(boolean z, boolean z2, long j) {
        ArrayList<Long> arrayList = z ? this.createdScheduledDialogIds : this.createdDialogIds;
        if (z2) {
            if (arrayList.contains(Long.valueOf(j))) {
                return;
            }
            arrayList.add(Long.valueOf(j));
            return;
        }
        arrayList.remove(Long.valueOf(j));
    }

    public TLRPC.TL_chatInviteExported getExportedInvite(long j) {
        return (TLRPC.TL_chatInviteExported) this.exportedChats.get(j);
    }

    public boolean putUser(TLRPC.User user, boolean z) {
        return putUser(user, z, false);
    }

    public boolean putUser(org.telegram.tgnet.TLRPC.User r9, boolean r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.putUser(org.telegram.tgnet.TLRPC$User, boolean, boolean):boolean");
    }

    public void reloadUser(long j) {
        TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
        TLRPC.InputUser inputUser = getInputUser(j);
        if (inputUser == null) {
            return;
        }
        tL_users_getUsers.id.add(inputUser);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_users_getUsers, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$reloadUser$56(tLObject, tL_error);
            }
        });
    }

    public void lambda$reloadUser$56(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof Vector) {
            ArrayList<T> arrayList = ((Vector) tLObject).objects;
            ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) instanceof TLRPC.User) {
                    arrayList2.add((TLRPC.User) arrayList.get(i));
                }
            }
            getMessagesController().putUsers(arrayList2, false);
        }
    }

    public void putUsers(ArrayList<TLRPC.User> arrayList, boolean z) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            if (putUser(arrayList.get(i), z)) {
                z2 = true;
            }
        }
        if (z2) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$putUsers$57();
                }
            });
        }
    }

    public void lambda$putUsers$57() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_STATUS));
    }

    public void putChat(final TLRPC.Chat chat, boolean z) {
        TLRPC.Chat chat2;
        if (chat == null || (chat2 = this.chats.get(Long.valueOf(chat.id))) == chat) {
            return;
        }
        if (chat2 != null && !TextUtils.isEmpty(chat2.username)) {
            this.objectsByUsernames.remove(chat2.username.toLowerCase());
        }
        if (chat2 != null && chat2.usernames != null) {
            for (int i = 0; i < chat2.usernames.size(); i++) {
                TLRPC.TL_username tL_username = chat2.usernames.get(i);
                if (tL_username != null && !TextUtils.isEmpty(tL_username.username)) {
                    this.objectsByUsernames.remove(tL_username.username.toLowerCase());
                }
            }
        }
        if (!TextUtils.isEmpty(chat.username)) {
            this.objectsByUsernames.put(chat.username.toLowerCase(), chat);
        }
        if (chat.usernames != null) {
            for (int i2 = 0; i2 < chat.usernames.size(); i2++) {
                TLRPC.TL_username tL_username2 = chat.usernames.get(i2);
                if (tL_username2 != null && !TextUtils.isEmpty(tL_username2.username) && tL_username2.active) {
                    this.objectsByUsernames.put(tL_username2.username.toLowerCase(), chat);
                }
            }
        }
        updateEmojiStatusUntilUpdate(-chat.id, chat.emoji_status);
        if (!chat.min) {
            if (!z) {
                if (chat2 != null) {
                    if (chat.version != chat2.version) {
                        this.loadedFullChats.delete(chat.id);
                    }
                    int i3 = chat2.participants_count;
                    if (i3 != 0 && chat.participants_count == 0) {
                        chat.participants_count = i3;
                        chat.flags |= 131072;
                    }
                    TLRPC.TL_chatBannedRights tL_chatBannedRights = chat2.banned_rights;
                    int i4 = tL_chatBannedRights != null ? tL_chatBannedRights.flags : 0;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.banned_rights;
                    int i5 = tL_chatBannedRights2 != null ? tL_chatBannedRights2.flags : 0;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights3 = chat2.default_banned_rights;
                    int i6 = tL_chatBannedRights3 != null ? tL_chatBannedRights3.flags : 0;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights4 = chat.default_banned_rights;
                    int i7 = tL_chatBannedRights4 != null ? tL_chatBannedRights4.flags : 0;
                    chat2.default_banned_rights = tL_chatBannedRights4;
                    if (tL_chatBannedRights4 == null) {
                        chat2.flags &= -262145;
                    } else {
                        chat2.flags = 262144 | chat2.flags;
                    }
                    chat2.banned_rights = tL_chatBannedRights2;
                    if (tL_chatBannedRights2 == null) {
                        chat2.flags &= -32769;
                    } else {
                        chat2.flags |= 32768;
                    }
                    TLRPC.TL_chatAdminRights tL_chatAdminRights = chat.admin_rights;
                    chat2.admin_rights = tL_chatAdminRights;
                    if (tL_chatAdminRights == null) {
                        chat2.flags &= -16385;
                    } else {
                        chat2.flags |= 16384;
                    }
                    if (chat.stories_hidden_min) {
                        chat.stories_hidden = chat2.stories_hidden;
                    }
                    if (i4 != i5 || i6 != i7) {
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.lambda$putChat$58(chat);
                            }
                        });
                    }
                }
                this.chats.put(Long.valueOf(chat.id), chat);
            } else if (chat2 == null) {
                this.chats.put(Long.valueOf(chat.id), chat);
            } else if (chat2.min) {
                chat.title = chat2.title;
                chat.photo = chat2.photo;
                chat.broadcast = chat2.broadcast;
                chat.verified = chat2.verified;
                chat.megagroup = chat2.megagroup;
                TLRPC.TL_chatBannedRights tL_chatBannedRights5 = chat2.default_banned_rights;
                if (tL_chatBannedRights5 != null) {
                    chat.default_banned_rights = tL_chatBannedRights5;
                    chat.flags |= 262144;
                }
                TLRPC.TL_chatAdminRights tL_chatAdminRights2 = chat2.admin_rights;
                if (tL_chatAdminRights2 != null) {
                    chat.admin_rights = tL_chatAdminRights2;
                    chat.flags |= 16384;
                }
                TLRPC.TL_chatBannedRights tL_chatBannedRights6 = chat2.banned_rights;
                if (tL_chatBannedRights6 != null) {
                    chat.banned_rights = tL_chatBannedRights6;
                    chat.flags |= 32768;
                }
                String str = chat2.username;
                if (str != null) {
                    chat.username = str;
                    chat.flags |= 64;
                } else {
                    chat.flags &= -65;
                    chat.username = null;
                }
                int i8 = chat2.participants_count;
                if (i8 != 0 && chat.participants_count == 0) {
                    chat.participants_count = i8;
                    chat.flags |= 131072;
                }
                this.chats.put(Long.valueOf(chat.id), chat);
            }
            addOrRemoveActiveVoiceChat(chat);
        } else if (chat2 == null) {
            this.chats.put(Long.valueOf(chat.id), chat);
            addOrRemoveActiveVoiceChat(chat);
        } else if (!z) {
            getUserNameResolver().update(chat2, chat);
            chat2.title = chat.title;
            chat2.photo = chat.photo;
            chat2.broadcast = chat.broadcast;
            chat2.verified = chat.verified;
            chat2.megagroup = chat.megagroup;
            chat2.call_not_empty = chat.call_not_empty;
            chat2.call_active = chat.call_active;
            chat2.monoforum = chat.monoforum;
            chat2.broadcast_messages_allowed = chat.broadcast_messages_allowed;
            if ((chat.flags2 & 262144) != 0) {
                chat2.linked_monoforum_id = chat.linked_monoforum_id;
                chat2.flags2 |= 262144;
            }
            TLRPC.TL_chatBannedRights tL_chatBannedRights7 = chat.default_banned_rights;
            if (tL_chatBannedRights7 != null) {
                chat2.default_banned_rights = tL_chatBannedRights7;
                chat2.flags |= 262144;
            }
            TLRPC.TL_chatAdminRights tL_chatAdminRights3 = chat.admin_rights;
            if (tL_chatAdminRights3 != null) {
                chat2.admin_rights = tL_chatAdminRights3;
                chat2.flags |= 16384;
            }
            TLRPC.TL_chatBannedRights tL_chatBannedRights8 = chat.banned_rights;
            if (tL_chatBannedRights8 != null) {
                chat2.banned_rights = tL_chatBannedRights8;
                chat2.flags |= 32768;
            }
            String str2 = chat.username;
            if (str2 != null) {
                chat2.username = str2;
                chat2.flags |= 64;
            } else {
                chat2.flags &= -65;
                chat2.username = null;
            }
            int i9 = chat.participants_count;
            if (i9 != 0) {
                chat2.participants_count = i9;
            }
            addOrRemoveActiveVoiceChat(chat2);
            boolean z2 = chat2.forum;
            boolean z3 = chat.forum;
            if (z2 != z3) {
                chat2.forum = z3;
                if (z3) {
                    chat2.flags |= 1073741824;
                } else {
                    chat2.flags &= -1073741825;
                }
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatSwitchedForum, Long.valueOf(chat.id), Boolean.valueOf(chat.forum), Boolean.valueOf(chat.forum_tabs));
            }
        }
        if (chat2 == null || chat2.forum == chat.forum) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$putChat$59(chat);
            }
        });
    }

    public void lambda$putChat$58(TLRPC.Chat chat) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRightsUpdated, chat);
    }

    public void lambda$putChat$59(TLRPC.Chat chat) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatSwitchedForum, Long.valueOf(chat.id), Boolean.valueOf(chat.forum), Boolean.valueOf(chat.forum_tabs));
    }

    public void putChats(ArrayList<TLRPC.Chat> arrayList, boolean z) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            putChat(arrayList.get(i), z);
        }
    }

    private void addOrRemoveActiveVoiceChat(final TLRPC.Chat chat) {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$addOrRemoveActiveVoiceChat$60(chat);
                }
            });
        } else {
            lambda$addOrRemoveActiveVoiceChat$60(chat);
        }
    }

    public void lambda$addOrRemoveActiveVoiceChat$60(TLRPC.Chat chat) {
        TLRPC.Chat chat2 = this.activeVoiceChatsMap.get(Long.valueOf(chat.id));
        if (chat.call_active && chat.call_not_empty && chat.migrated_to == null && !ChatObject.isNotInChat(chat)) {
            if (chat2 != null) {
                return;
            }
            this.activeVoiceChatsMap.put(Long.valueOf(chat.id), chat);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.activeGroupCallsUpdated, new Object[0]);
            return;
        }
        if (chat2 == null) {
            return;
        }
        this.activeVoiceChatsMap.remove(Long.valueOf(chat.id));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.activeGroupCallsUpdated, new Object[0]);
    }

    public ArrayList<Long> getActiveGroupCalls() {
        return new ArrayList<>(this.activeVoiceChatsMap.keySet());
    }

    public void setReferer(String str) {
        if (str == null) {
            return;
        }
        this.installReferer = str;
        this.mainPreferences.edit().putString("installReferer", str).commit();
    }

    public void putEncryptedChat(TLRPC.EncryptedChat encryptedChat, boolean z) {
        if (encryptedChat == null) {
            return;
        }
        if (z) {
            this.encryptedChats.putIfAbsent(Integer.valueOf(encryptedChat.id), encryptedChat);
        } else {
            this.encryptedChats.put(Integer.valueOf(encryptedChat.id), encryptedChat);
        }
    }

    public void putEncryptedChats(ArrayList<TLRPC.EncryptedChat> arrayList, boolean z) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            putEncryptedChat(arrayList.get(i), z);
        }
    }

    public long getSendPaidMessagesStars(long j) {
        if (j > 0) {
            if (j == getUserConfig().getClientUserId()) {
                return 0L;
            }
            TLRPC.UserFull userFull = getUserFull(j);
            if (userFull != null) {
                return userFull.send_paid_messages_stars;
            }
            TLRPC.User user = getUser(Long.valueOf(j));
            if (user != null && user.send_paid_messages_stars > 0) {
                return DialogObject.getMessagesStarsPrice(isUserContactBlocked(user.id));
            }
        } else if (j < 0) {
            long j2 = -j;
            TLRPC.Chat chat = getChat(Long.valueOf(j2));
            if (ChatObject.hasAdminRights(chat)) {
                return 0L;
            }
            if (ChatObject.isMonoForum(chat) && ChatObject.canManageMonoForum(this.currentAccount, chat)) {
                return 0L;
            }
            TLRPC.ChatFull chatFull = getChatFull(j2);
            if (chatFull != null) {
                return chatFull.send_paid_messages_stars;
            }
            if (chat != null) {
                return chat.send_paid_messages_stars;
            }
        }
        return 0L;
    }

    public void putMonoForumLinkedChat(long j, long j2) {
        this.monoForumLinkedChannels.put(Long.valueOf(j), Long.valueOf(j2));
        this.monoForumLinkedChannels.put(Long.valueOf(j2), Long.valueOf(j));
    }

    public TLRPC.Chat getMonoForumLinkedChat(long j) {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        TLRPC.Chat chat3 = getChat(Long.valueOf(j));
        if (chat3 != null && (chat2 = getChat(Long.valueOf(chat3.linked_monoforum_id))) != null) {
            return chat2;
        }
        Long l = this.monoForumLinkedChannels.get(Long.valueOf(j));
        if (l == null || (chat = getChat(l)) == null) {
            return null;
        }
        return chat;
    }

    public TLRPC.UserFull getUserFull(long j) {
        return (TLRPC.UserFull) this.fullUsers.get(j);
    }

    public TLRPC.ChatFull getChatFull(long j) {
        return (TLRPC.ChatFull) this.fullChats.get(j);
    }

    public void putGroupCall(long j, ChatObject.Call call) {
        this.groupCalls.put(call.call.id, call);
        this.groupCallsByChatId.put(j, call);
        TLRPC.ChatFull chatFull = getChatFull(j);
        if (chatFull != null) {
            chatFull.call = call.getInputGroupCall();
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallUpdated, Long.valueOf(j), Long.valueOf(call.call.id), Boolean.FALSE);
        loadFullChat(j, 0, true);
    }

    public ChatObject.Call getGroupCall(long j, boolean z) {
        return getGroupCall(j, z, null);
    }

    public ChatObject.Call getGroupCall(final long j, boolean z, final Runnable runnable) {
        TLRPC.InputGroupCall inputGroupCall;
        TLRPC.ChatFull chatFull = getChatFull(j);
        if (chatFull == null || (inputGroupCall = chatFull.call) == null) {
            return null;
        }
        ChatObject.Call call = (ChatObject.Call) this.groupCalls.get(inputGroupCall.id);
        if (call == null && z && !this.loadingGroupCalls.contains(Long.valueOf(j))) {
            this.loadingGroupCalls.add(Long.valueOf(j));
            if (chatFull.call != null) {
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = chatFull.call;
                getgroupcall.limit = 20;
                getConnectionsManager().sendRequest(getgroupcall, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        this.f$0.lambda$getGroupCall$62(j, runnable, tLObject, tL_error);
                    }
                });
            }
        }
        if (call == null || !(call.call instanceof TLRPC.TL_groupCallDiscarded)) {
            return call;
        }
        return null;
    }

    public void lambda$getGroupCall$62(final long j, final Runnable runnable, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$getGroupCall$61(tLObject, j, runnable);
            }
        });
    }

    public void lambda$getGroupCall$61(TLObject tLObject, long j, Runnable runnable) {
        if (tLObject != null) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            putUsers(groupcall.users, false);
            putChats(groupcall.chats, false);
            ChatObject.Call call = new ChatObject.Call();
            call.setCall(getAccountInstance(), j, groupcall);
            this.groupCalls.put(groupcall.call.id, call);
            this.groupCallsByChatId.put(j, call);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallUpdated, Long.valueOf(j), Long.valueOf(groupcall.call.id), Boolean.FALSE);
            if (runnable != null) {
                runnable.run();
            }
        }
        this.loadingGroupCalls.remove(Long.valueOf(j));
    }

    public void cancelLoadFullUser(long j) {
        this.loadingFullUsers.remove(Long.valueOf(j));
    }

    public void cancelLoadFullChat(long j) {
        this.loadingFullChats.remove(Long.valueOf(j));
    }

    public void clearFullUsers() {
        this.loadedFullUsers.clear();
        this.loadedFullChats.clear();
    }

    private void reloadDialogsReadValue(ArrayList<TLRPC.Dialog> arrayList, long j) {
        if (j == 0 && (arrayList == null || arrayList.isEmpty())) {
            return;
        }
        TLRPC.TL_messages_getPeerDialogs tL_messages_getPeerDialogs = new TLRPC.TL_messages_getPeerDialogs();
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC.InputPeer inputPeer = getInputPeer(arrayList.get(i).id);
                if (!(inputPeer instanceof TLRPC.TL_inputPeerChannel) || inputPeer.access_hash != 0) {
                    TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                    tL_inputDialogPeer.peer = inputPeer;
                    long peerDialogId = DialogObject.getPeerDialogId(inputPeer);
                    Long l = (Long) this.peerDialogsRequested.get(peerDialogId);
                    if (l == null || System.currentTimeMillis() - l.longValue() > 240000) {
                        tL_messages_getPeerDialogs.peers.add(tL_inputDialogPeer);
                        this.peerDialogsRequested.put(peerDialogId, Long.valueOf(System.currentTimeMillis()));
                    }
                }
            }
        } else {
            TLRPC.InputPeer inputPeer2 = getInputPeer(j);
            if ((inputPeer2 instanceof TLRPC.TL_inputPeerChannel) && inputPeer2.access_hash == 0) {
                return;
            }
            TLRPC.TL_inputDialogPeer tL_inputDialogPeer2 = new TLRPC.TL_inputDialogPeer();
            tL_inputDialogPeer2.peer = inputPeer2;
            long peerDialogId2 = DialogObject.getPeerDialogId(inputPeer2);
            Long l2 = (Long) this.peerDialogsRequested.get(peerDialogId2);
            if (l2 == null || System.currentTimeMillis() - l2.longValue() > 240000) {
                tL_messages_getPeerDialogs.peers.add(tL_inputDialogPeer2);
                this.peerDialogsRequested.put(peerDialogId2, Long.valueOf(System.currentTimeMillis()));
            }
        }
        if (tL_messages_getPeerDialogs.peers.isEmpty()) {
            return;
        }
        getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException {
                this.f$0.lambda$reloadDialogsReadValue$63(tLObject, tL_error);
            }
        });
    }

    public void lambda$reloadDialogsReadValue$63(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException {
        if (tLObject != null) {
            TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
            ArrayList<TLRPC.Update> arrayList = new ArrayList<>();
            for (int i = 0; i < tL_messages_peerDialogs.dialogs.size(); i++) {
                TLRPC.Dialog dialog = tL_messages_peerDialogs.dialogs.get(i);
                DialogObject.initDialog(dialog);
                Integer num = this.dialogs_read_inbox_max.get(Long.valueOf(dialog.id));
                if (num == null) {
                    num = 0;
                }
                this.dialogs_read_inbox_max.put(Long.valueOf(dialog.id), Integer.valueOf(Math.max(dialog.read_inbox_max_id, num.intValue())));
                if (num.intValue() == 0) {
                    if (dialog.peer.channel_id != 0) {
                        TLRPC.TL_updateReadChannelInbox tL_updateReadChannelInbox = new TLRPC.TL_updateReadChannelInbox();
                        tL_updateReadChannelInbox.channel_id = dialog.peer.channel_id;
                        tL_updateReadChannelInbox.max_id = dialog.read_inbox_max_id;
                        tL_updateReadChannelInbox.still_unread_count = dialog.unread_count;
                        arrayList.add(tL_updateReadChannelInbox);
                    } else {
                        TLRPC.TL_updateReadHistoryInbox tL_updateReadHistoryInbox = new TLRPC.TL_updateReadHistoryInbox();
                        tL_updateReadHistoryInbox.peer = dialog.peer;
                        tL_updateReadHistoryInbox.max_id = dialog.read_inbox_max_id;
                        arrayList.add(tL_updateReadHistoryInbox);
                    }
                }
                Integer num2 = this.dialogs_read_outbox_max.get(Long.valueOf(dialog.id));
                if (num2 == null) {
                    num2 = 0;
                }
                this.dialogs_read_outbox_max.put(Long.valueOf(dialog.id), Integer.valueOf(Math.max(dialog.read_outbox_max_id, num2.intValue())));
                if (dialog.read_outbox_max_id > num2.intValue()) {
                    if (dialog.peer.channel_id != 0) {
                        TLRPC.TL_updateReadChannelOutbox tL_updateReadChannelOutbox = new TLRPC.TL_updateReadChannelOutbox();
                        tL_updateReadChannelOutbox.channel_id = dialog.peer.channel_id;
                        tL_updateReadChannelOutbox.max_id = dialog.read_outbox_max_id;
                        arrayList.add(tL_updateReadChannelOutbox);
                    } else {
                        TLRPC.TL_updateReadHistoryOutbox tL_updateReadHistoryOutbox = new TLRPC.TL_updateReadHistoryOutbox();
                        tL_updateReadHistoryOutbox.peer = dialog.peer;
                        tL_updateReadHistoryOutbox.max_id = dialog.read_outbox_max_id;
                        arrayList.add(tL_updateReadHistoryOutbox);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            processUpdateArray(arrayList, null, null, false, 0);
        }
    }

    public TLRPC.ChannelParticipant getAdminInChannel(long j, long j2) {
        LongSparseArray longSparseArray = (LongSparseArray) this.channelAdmins.get(j2);
        if (longSparseArray == null) {
            return null;
        }
        return (TLRPC.ChannelParticipant) longSparseArray.get(j);
    }

    public String getAdminRank(long j, long j2) {
        TLRPC.ChannelParticipant channelParticipant;
        if (j == j2) {
            return "";
        }
        LongSparseArray longSparseArray = (LongSparseArray) this.channelAdmins.get(j);
        if (longSparseArray == null || (channelParticipant = (TLRPC.ChannelParticipant) longSparseArray.get(j2)) == null) {
            return null;
        }
        String str = channelParticipant.rank;
        return str != null ? str : "";
    }

    public boolean isChannelAdminsLoaded(long j) {
        return this.channelAdmins.get(j) != null;
    }

    public void loadChannelAdmins(final long j, boolean z) {
        if ((SystemClock.elapsedRealtime() / 1000) - this.loadingChannelAdmins.get(j) < 60) {
            return;
        }
        this.loadingChannelAdmins.put(j, (int) (SystemClock.elapsedRealtime() / 1000));
        if (z) {
            getMessagesStorage().loadChannelAdmins(j);
            return;
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = getInputChannel(j);
        tL_channels_getParticipants.limit = 100;
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        getConnectionsManager().sendRequest(tL_channels_getParticipants, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$loadChannelAdmins$64(j, tLObject, tL_error);
            }
        });
    }

    public void lambda$loadChannelAdmins$64(long j, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_channels_channelParticipants) {
            processLoadedAdminsResponse(j, (TLRPC.TL_channels_channelParticipants) tLObject);
        }
    }

    public void processLoadedAdminsResponse(long j, TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants) {
        LongSparseArray longSparseArray = new LongSparseArray(tL_channels_channelParticipants.participants.size());
        for (int i = 0; i < tL_channels_channelParticipants.participants.size(); i++) {
            TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i);
            longSparseArray.put(MessageObject.getPeerId(channelParticipant.peer), channelParticipant);
        }
        processLoadedChannelAdmins(longSparseArray, j, false);
    }

    public void processLoadedChannelAdmins(final LongSparseArray longSparseArray, final long j, final boolean z) {
        if (!z) {
            getMessagesStorage().putChannelAdmins(j, longSparseArray);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$processLoadedChannelAdmins$65(j, longSparseArray, z);
            }
        });
    }

    public void lambda$processLoadedChannelAdmins$65(long j, LongSparseArray longSparseArray, boolean z) {
        this.channelAdmins.put(j, longSparseArray);
        if (z) {
            this.loadingChannelAdmins.delete(j);
            loadChannelAdmins(j, false);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadChatAdmins, Long.valueOf(j));
        }
    }

    public void loadFullChat(final long r12, final int r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.loadFullChat(long, int, boolean):void");
    }

    public void lambda$loadFullChat$68(final long j, final long j2, TLRPC.Chat chat, final int i, TLObject tLObject, final TLRPC.TL_error tL_error) throws InterruptedException {
        if (tL_error == null) {
            final TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject;
            getMessagesStorage().putUsersAndChats(tL_messages_chatFull.users, tL_messages_chatFull.chats, true, true);
            getMessagesStorage().updateChatInfo(tL_messages_chatFull.full_chat, false);
            getStoriesController().updateStoriesFromFullPeer(j, tL_messages_chatFull.full_chat.stories);
            ChatThemeController.getInstance(this.currentAccount).saveChatWallpaper(-j2, tL_messages_chatFull.full_chat.wallpaper);
            if (ChatObject.isChannel(chat)) {
                Integer numValueOf = this.dialogs_read_inbox_max.get(Long.valueOf(j));
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(getMessagesStorage().getDialogReadMax(false, j));
                }
                this.dialogs_read_inbox_max.put(Long.valueOf(j), Integer.valueOf(Math.max(tL_messages_chatFull.full_chat.read_inbox_max_id, numValueOf.intValue())));
                if (tL_messages_chatFull.full_chat.read_inbox_max_id > numValueOf.intValue()) {
                    ArrayList<TLRPC.Update> arrayList = new ArrayList<>();
                    TLRPC.TL_updateReadChannelInbox tL_updateReadChannelInbox = new TLRPC.TL_updateReadChannelInbox();
                    tL_updateReadChannelInbox.channel_id = j2;
                    TLRPC.ChatFull chatFull = tL_messages_chatFull.full_chat;
                    tL_updateReadChannelInbox.max_id = chatFull.read_inbox_max_id;
                    tL_updateReadChannelInbox.still_unread_count = chatFull.unread_count;
                    arrayList.add(tL_updateReadChannelInbox);
                    processUpdateArray(arrayList, null, null, false, 0);
                }
                Integer numValueOf2 = this.dialogs_read_outbox_max.get(Long.valueOf(j));
                if (numValueOf2 == null) {
                    numValueOf2 = Integer.valueOf(getMessagesStorage().getDialogReadMax(true, j));
                }
                this.dialogs_read_outbox_max.put(Long.valueOf(j), Integer.valueOf(Math.max(tL_messages_chatFull.full_chat.read_outbox_max_id, numValueOf2.intValue())));
                if (tL_messages_chatFull.full_chat.read_outbox_max_id > numValueOf2.intValue()) {
                    ArrayList<TLRPC.Update> arrayList2 = new ArrayList<>();
                    TLRPC.TL_updateReadChannelOutbox tL_updateReadChannelOutbox = new TLRPC.TL_updateReadChannelOutbox();
                    tL_updateReadChannelOutbox.channel_id = j2;
                    tL_updateReadChannelOutbox.max_id = tL_messages_chatFull.full_chat.read_outbox_max_id;
                    arrayList2.add(tL_updateReadChannelOutbox);
                    processUpdateArray(arrayList2, null, null, false, 0);
                }
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$loadFullChat$66(j2, tL_messages_chatFull, i, j);
                }
            });
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$loadFullChat$67(tL_error, j2);
            }
        });
    }

    public void lambda$loadFullChat$66(long j, TLRPC.TL_messages_chatFull tL_messages_chatFull, int i, long j2) {
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) this.fullChats.get(j);
        if (chatFull != null) {
            tL_messages_chatFull.full_chat.inviterId = chatFull.inviterId;
        }
        this.fullChats.put(j, tL_messages_chatFull.full_chat);
        long j3 = -j;
        getTranslateController().updateDialogFull(j3);
        applyDialogNotificationsSettings(j3, 0L, tL_messages_chatFull.full_chat.notify_settings);
        for (int i2 = 0; i2 < tL_messages_chatFull.full_chat.bot_info.size(); i2++) {
            getMediaDataController().putBotInfo(j3, tL_messages_chatFull.full_chat.bot_info.get(i2));
        }
        int iIndexOfKey = this.blockePeers.indexOfKey(j3);
        if (tL_messages_chatFull.full_chat.blocked) {
            if (iIndexOfKey < 0) {
                this.blockePeers.put(j3, 1);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.blockedUsersDidLoad, new Object[0]);
            }
        } else if (iIndexOfKey >= 0) {
            this.blockePeers.removeAt(iIndexOfKey);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.blockedUsersDidLoad, new Object[0]);
        }
        this.exportedChats.put(j, tL_messages_chatFull.full_chat.exported_invite);
        this.loadingFullChats.remove(Long.valueOf(j));
        this.loadedFullChats.put(j, System.currentTimeMillis());
        putUsers(tL_messages_chatFull.users, false);
        putChats(tL_messages_chatFull.chats, false);
        if (tL_messages_chatFull.full_chat.stickerset != null) {
            getMediaDataController().getGroupStickerSetById(tL_messages_chatFull.full_chat.stickerset);
        }
        if (tL_messages_chatFull.full_chat.emojiset != null) {
            getMediaDataController().getGroupStickerSetById(tL_messages_chatFull.full_chat.emojiset);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatInfoDidLoad, tL_messages_chatFull.full_chat, Integer.valueOf(i), Boolean.FALSE, Boolean.TRUE);
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.dialogs_dict.get(j3);
        if (dialog != null) {
            TLRPC.ChatFull chatFull2 = tL_messages_chatFull.full_chat;
            if ((chatFull2.flags & 2048) != 0) {
                int i3 = dialog.folder_id;
                int i4 = chatFull2.folder_id;
                if (i3 != i4) {
                    dialog.folder_id = i4;
                    sortDialogs(null);
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
                }
            }
            int i5 = dialog.ttl_period;
            int i6 = tL_messages_chatFull.full_chat.ttl_period;
            if (i5 != i6) {
                dialog.ttl_period = i6;
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
            }
            boolean z = dialog.view_forum_as_messages;
            boolean z2 = tL_messages_chatFull.full_chat.view_forum_as_messages;
            if (z != z2) {
                dialog.view_forum_as_messages = z2;
                getMessagesStorage().setDialogViewThreadAsMessages(j2, tL_messages_chatFull.full_chat.view_forum_as_messages);
            }
        }
    }

    public void lambda$loadFullChat$67(TLRPC.TL_error tL_error, long j) {
        checkChannelError(tL_error.text, j);
        this.loadingFullChats.remove(Long.valueOf(j));
    }

    public void loadFullUser(TLRPC.User user, int i, boolean z) {
        loadFullUser(user, i, z, null);
    }

    public void loadFullUser(final TLRPC.User user, final int i, boolean z, final Utilities.Callback<TLRPC.UserFull> callback) {
        if (user != null) {
            if (callback == null) {
                if (this.loadingFullUsers.contains(Long.valueOf(user.id))) {
                    return;
                }
                if (!z && this.loadedFullUsers.get(user.id) > 0) {
                    return;
                }
            }
            this.loadingFullUsers.add(Long.valueOf(user.id));
            TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
            tL_users_getFullUser.id = getInputUser(user);
            final long j = user.id;
            if (this.dialogs_read_inbox_max.get(Long.valueOf(j)) == null || this.dialogs_read_outbox_max.get(Long.valueOf(j)) == null) {
                reloadDialogsReadValue(null, j);
            }
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_users_getFullUser, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$loadFullUser$71(j, callback, user, i, tLObject, tL_error);
                }
            }), i);
        }
    }

    public void lambda$loadFullUser$71(long j, Utilities.Callback callback, final TLRPC.User user, final int i, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject;
            final TLRPC.UserFull userFull = tL_users_userFull.full_user;
            putUsers(tL_users_userFull.users, false);
            putChats(tL_users_userFull.chats, false);
            TLRPC.UserFull userFull2 = tL_users_userFull.full_user;
            userFull2.user = getUser(Long.valueOf(userFull2.id));
            getMessagesStorage().updateUserInfo(userFull, false);
            getStoriesController().updateStoriesFromFullPeer(j, userFull.stories);
            ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
            TLRPC.UserFull userFull3 = tL_users_userFull.full_user;
            chatThemeController.saveChatWallpaper(userFull3.id, userFull3.wallpaper);
            if (callback != null) {
                callback.run(userFull);
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$loadFullUser$69(userFull, user, i);
                }
            });
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$loadFullUser$70(user);
            }
        });
    }

    public void lambda$loadFullUser$69(TLRPC.UserFull userFull, TLRPC.User user, int i) {
        savePeerSettings(userFull.user.id, userFull.settings, false);
        applyDialogNotificationsSettings(user.id, 0L, userFull.notify_settings);
        TL_bots.BotInfo botInfo = userFull.bot_info;
        if (botInfo instanceof TL_bots.TL_botInfo) {
            botInfo.user_id = user.id;
            getMediaDataController().putBotInfo(user.id, userFull.bot_info);
        }
        int iIndexOfKey = this.blockePeers.indexOfKey(user.id);
        if (userFull.blocked) {
            if (iIndexOfKey < 0) {
                this.blockePeers.put(user.id, 1);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.blockedUsersDidLoad, new Object[0]);
            }
        } else if (iIndexOfKey >= 0) {
            this.blockePeers.removeAt(iIndexOfKey);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.blockedUsersDidLoad, new Object[0]);
        }
        this.fullUsers.put(user.id, userFull);
        getTranslateController().updateDialogFull(user.id);
        StarsController.getInstance(this.currentAccount).invalidateProfileGifts(userFull);
        this.loadingFullUsers.remove(Long.valueOf(user.id));
        this.loadedFullUsers.put(user.id, System.currentTimeMillis());
        String str = user.first_name + user.last_name + UserObject.getPublicUsername(user);
        ArrayList<TLRPC.User> arrayList = new ArrayList<>();
        arrayList.add(userFull.user);
        putUsers(arrayList, false);
        getMessagesStorage().putUsersAndChats(arrayList, null, false, true);
        if (!str.equals(userFull.user.first_name + userFull.user.last_name + UserObject.getPublicUsername(userFull.user))) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_NAME));
        }
        TLRPC.UserProfilePhoto userProfilePhoto = userFull.user.photo;
        if (userProfilePhoto != null && userProfilePhoto.has_video) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_AVATAR));
        }
        TL_bots.BotInfo botInfo2 = userFull.bot_info;
        if (botInfo2 instanceof TL_bots.TL_botInfo) {
            botInfo2.user_id = userFull.id;
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botInfoDidLoad, userFull.bot_info, Integer.valueOf(i));
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(user.id), userFull);
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.dialogs_dict.get(user.id);
        if (dialog != null) {
            if ((userFull.flags & 2048) != 0) {
                int i2 = dialog.folder_id;
                int i3 = userFull.folder_id;
                if (i2 != i3) {
                    dialog.folder_id = i3;
                    sortDialogs(null);
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
                }
            }
            if ((userFull.flags & 16384) != 0) {
                int i4 = dialog.ttl_period;
                int i5 = userFull.ttl_period;
                if (i4 != i5) {
                    dialog.ttl_period = i5;
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
                }
            }
        }
    }

    public void lambda$loadFullUser$70(TLRPC.User user) {
        this.loadingFullUsers.remove(Long.valueOf(user.id));
    }

    private void reloadMessages(ArrayList<Integer> arrayList, final long j, final int i) {
        TLRPC.TL_messages_getMessages tL_messages_getMessages;
        if (arrayList.isEmpty()) {
            return;
        }
        final boolean z = i == 1;
        final ArrayList<Integer> arrayList2 = new ArrayList<>();
        TLRPC.Chat chat = DialogObject.isChatDialog(j) ? getChat(Long.valueOf(-j)) : null;
        if (ChatObject.isChannel(chat)) {
            TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
            tL_channels_getMessages.channel = getInputChannel(chat);
            tL_channels_getMessages.id = arrayList2;
            tL_messages_getMessages = tL_channels_getMessages;
        } else {
            TLRPC.TL_messages_getMessages tL_messages_getMessages2 = new TLRPC.TL_messages_getMessages();
            tL_messages_getMessages2.id = arrayList2;
            tL_messages_getMessages = tL_messages_getMessages2;
        }
        TLRPC.TL_messages_getMessages tL_messages_getMessages3 = tL_messages_getMessages;
        ArrayList arrayList3 = (ArrayList) this.reloadingMessages.get(j);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Integer num = arrayList.get(i2);
            if (arrayList3 == null || !arrayList3.contains(num)) {
                arrayList2.add(num);
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            this.reloadingMessages.put(j, arrayList3);
        }
        arrayList3.addAll(arrayList2);
        getConnectionsManager().sendRequest(tL_messages_getMessages3, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$reloadMessages$73(j, z, i, arrayList2, tLObject, tL_error);
            }
        });
    }

    public void lambda$reloadMessages$73(final long j, boolean z, int i, final ArrayList arrayList, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            LongSparseArray longSparseArray = new LongSparseArray();
            for (int i2 = 0; i2 < messages_messages.users.size(); i2++) {
                TLRPC.User user = messages_messages.users.get(i2);
                longSparseArray.put(user.id, user);
            }
            LongSparseArray longSparseArray2 = new LongSparseArray();
            for (int i3 = 0; i3 < messages_messages.chats.size(); i3++) {
                TLRPC.Chat chat = messages_messages.chats.get(i3);
                longSparseArray2.put(chat.id, chat);
            }
            Integer numValueOf = this.dialogs_read_inbox_max.get(Long.valueOf(j));
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(getMessagesStorage().getDialogReadMax(false, j));
                this.dialogs_read_inbox_max.put(Long.valueOf(j), numValueOf);
            }
            Integer numValueOf2 = this.dialogs_read_outbox_max.get(Long.valueOf(j));
            if (numValueOf2 == null) {
                numValueOf2 = Integer.valueOf(getMessagesStorage().getDialogReadMax(true, j));
                this.dialogs_read_outbox_max.put(Long.valueOf(j), numValueOf2);
            }
            ArrayList arrayList2 = new ArrayList();
            int i4 = 0;
            while (i4 < messages_messages.messages.size()) {
                TLRPC.Message message = messages_messages.messages.get(i4);
                message.dialog_id = j;
                if (!z) {
                    message.unread = (message.out ? numValueOf2 : numValueOf).intValue() < message.id;
                }
                Integer num = numValueOf;
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(new MessageObject(this.currentAccount, message, longSparseArray, longSparseArray2, true, true));
                i4++;
                arrayList2 = arrayList3;
                numValueOf = num;
            }
            final ArrayList arrayList4 = arrayList2;
            ImageLoader.saveMessagesThumbs(messages_messages.messages);
            getMessagesStorage().putMessages(messages_messages, j, -1, 0, false, i, 0L);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$reloadMessages$72(j, arrayList, arrayList4);
                }
            });
        }
    }

    public void lambda$reloadMessages$72(long j, ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3 = (ArrayList) this.reloadingMessages.get(j);
        if (arrayList3 != null) {
            arrayList3.removeAll(arrayList);
            if (arrayList3.isEmpty()) {
                this.reloadingMessages.remove(j);
            }
        }
        ArrayList arrayList4 = (ArrayList) this.dialogMessage.get(j);
        if (arrayList4 != null) {
            for (int i = 0; i < arrayList4.size(); i++) {
                MessageObject messageObject = (MessageObject) arrayList4.get(i);
                int i2 = 0;
                while (true) {
                    if (i2 < arrayList2.size()) {
                        MessageObject messageObject2 = (MessageObject) arrayList2.get(i2);
                        if (messageObject.getId() == messageObject2.getId()) {
                            arrayList4.set(i, messageObject2);
                            if (messageObject2.messageOwner.peer_id.channel_id == 0) {
                                MessageObject messageObject3 = this.dialogMessagesByIds.get(messageObject2.getId());
                                this.dialogMessagesByIds.remove(messageObject2.getId());
                                if (messageObject3 != null) {
                                    this.dialogMessagesByIds.put(messageObject3.getId(), messageObject3);
                                }
                            }
                            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.replaceMessagesObjects, Long.valueOf(j), arrayList2);
    }

    public void hidePeerSettingsBar(long j, TLRPC.User user, TLRPC.Chat chat) {
        if (user == null && chat == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.notificationsPreferences.edit();
        editorEdit.putInt("dialog_bar_vis3" + j, 3);
        editorEdit.remove("dialog_bar_invite" + j);
        editorEdit.commit();
        if (DialogObject.isEncryptedDialog(j)) {
            return;
        }
        TLRPC.TL_messages_hidePeerSettingsBar tL_messages_hidePeerSettingsBar = new TLRPC.TL_messages_hidePeerSettingsBar();
        if (user != null) {
            tL_messages_hidePeerSettingsBar.peer = getInputPeer(user.id);
        } else {
            tL_messages_hidePeerSettingsBar.peer = getInputPeer(-chat.id);
        }
        getConnectionsManager().sendRequest(tL_messages_hidePeerSettingsBar, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                MessagesController.lambda$hidePeerSettingsBar$74(tLObject, tL_error);
            }
        });
    }

    public void reportSpam(long j, TLRPC.User user, TLRPC.Chat chat, TLRPC.EncryptedChat encryptedChat, boolean z) {
        if (user == null && chat == null && encryptedChat == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.notificationsPreferences.edit();
        editorEdit.putInt("dialog_bar_vis3" + j, 3);
        editorEdit.commit();
        if (DialogObject.isEncryptedDialog(j)) {
            if (encryptedChat == null || encryptedChat.access_hash == 0) {
                return;
            }
            TLRPC.TL_messages_reportEncryptedSpam tL_messages_reportEncryptedSpam = new TLRPC.TL_messages_reportEncryptedSpam();
            TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat = new TLRPC.TL_inputEncryptedChat();
            tL_messages_reportEncryptedSpam.peer = tL_inputEncryptedChat;
            tL_inputEncryptedChat.chat_id = encryptedChat.id;
            tL_inputEncryptedChat.access_hash = encryptedChat.access_hash;
            getConnectionsManager().sendRequest(tL_messages_reportEncryptedSpam, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    MessagesController.lambda$reportSpam$75(tLObject, tL_error);
                }
            }, 2);
            return;
        }
        if (z) {
            TL_account.reportPeer reportpeer = new TL_account.reportPeer();
            if (chat != null) {
                reportpeer.peer = getInputPeer(-chat.id);
            } else if (user != null) {
                reportpeer.peer = getInputPeer(user.id);
            }
            reportpeer.message = "";
            reportpeer.reason = new TLRPC.TL_inputReportReasonGeoIrrelevant();
            getConnectionsManager().sendRequest(reportpeer, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    MessagesController.lambda$reportSpam$76(tLObject, tL_error);
                }
            }, 2);
            return;
        }
        TLRPC.TL_messages_reportSpam tL_messages_reportSpam = new TLRPC.TL_messages_reportSpam();
        if (chat != null) {
            tL_messages_reportSpam.peer = getInputPeer(-chat.id);
        } else if (user != null) {
            tL_messages_reportSpam.peer = getInputPeer(user.id);
        }
        getConnectionsManager().sendRequest(tL_messages_reportSpam, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                MessagesController.lambda$reportSpam$77(tLObject, tL_error);
            }
        }, 2);
    }

    private void savePeerSettings(long j, TLRPC.PeerSettings peerSettings, boolean z) {
        if (peerSettings == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.notificationsPreferences.edit();
        if (peerSettings.business_bot_id != 0) {
            editorEdit.putLong("dialog_botid" + j, peerSettings.business_bot_id);
            editorEdit.putString("dialog_boturl" + j, peerSettings.business_bot_manage_url);
            editorEdit.putInt("dialog_botflags" + j, (peerSettings.business_bot_paused ? 1 : 0) + (peerSettings.business_bot_can_reply ? 2 : 0));
        } else {
            editorEdit.remove("dialog_botid" + j).remove("dialog_boturl" + j).remove("dialog_botflags" + j);
        }
        editorEdit.putLong("dialog_bar_paying_" + j, peerSettings.charge_paid_message_stars);
        if (this.notificationsPreferences.getInt("dialog_bar_vis3" + j, 0) == 3) {
            editorEdit.apply();
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(j));
            return;
        }
        boolean z2 = peerSettings.flags == 0;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("peer settings loaded for " + j + " add = " + peerSettings.add_contact + " block = " + peerSettings.block_contact + " spam = " + peerSettings.report_spam + " share = " + peerSettings.share_contact + " geo = " + peerSettings.report_geo + " hide = " + z2 + " distance = " + peerSettings.geo_distance + " invite = " + peerSettings.invite_members);
        }
        editorEdit.putInt("dialog_bar_vis3" + j, z2 ? 1 : 2);
        editorEdit.putBoolean("dialog_bar_share" + j, peerSettings.share_contact);
        editorEdit.putBoolean("dialog_bar_report" + j, peerSettings.report_spam);
        editorEdit.putBoolean("dialog_bar_add" + j, peerSettings.add_contact);
        editorEdit.putBoolean("dialog_bar_block" + j, peerSettings.block_contact);
        editorEdit.putBoolean("dialog_bar_exception" + j, peerSettings.need_contacts_exception);
        editorEdit.putBoolean("dialog_bar_location" + j, peerSettings.report_geo);
        editorEdit.putBoolean("dialog_bar_archived" + j, peerSettings.autoarchived);
        editorEdit.putBoolean("dialog_bar_invite" + j, peerSettings.invite_members);
        editorEdit.putString("dialog_bar_chat_with_admin_title" + j, peerSettings.request_chat_title);
        editorEdit.putBoolean("dialog_bar_chat_with_channel" + j, peerSettings.request_chat_broadcast);
        editorEdit.putInt("dialog_bar_chat_with_date" + j, peerSettings.request_chat_date);
        if (this.notificationsPreferences.getInt("dialog_bar_distance" + j, -1) != -2) {
            if ((peerSettings.flags & 64) != 0) {
                editorEdit.putInt("dialog_bar_distance" + j, peerSettings.geo_distance);
            } else {
                editorEdit.remove("dialog_bar_distance" + j);
            }
        }
        if (j == getUserConfig().getClientUserId()) {
            peerSettings.business_bot_id = 1271266957L;
            peerSettings.business_bot_manage_url = "https://telegram.org/";
        }
        editorEdit.apply();
        this.userPeerSettings.put(j, peerSettings);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(j));
    }

    public TLRPC.PeerSettings getPeerSettings(long j) {
        TLRPC.PeerSettings peerSettings;
        TLRPC.UserFull userFull = getUserFull(j);
        return (userFull == null || (peerSettings = userFull.settings) == null) ? (TLRPC.PeerSettings) this.userPeerSettings.get(j) : peerSettings;
    }

    public void loadPeerSettings(TLRPC.User user, TLRPC.Chat chat) {
        loadPeerSettings(user, chat, false);
    }

    public void loadPeerSettings(TLRPC.User user, TLRPC.Chat chat, boolean z) {
        final long j;
        if (user == null && chat == null) {
            return;
        }
        if (user != null) {
            j = user.id;
        } else {
            j = -chat.id;
        }
        if (this.loadingPeerSettings.indexOfKey(j) >= 0) {
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("request spam button for " + j);
        }
        int i = this.notificationsPreferences.getInt("dialog_bar_vis3" + j, 0);
        if (!z && (i == 1 || i == 3)) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("dialog bar already hidden for " + j);
                return;
            }
            return;
        }
        this.loadingPeerSettings.put(j, Boolean.TRUE);
        TLRPC.TL_messages_getPeerSettings tL_messages_getPeerSettings = new TLRPC.TL_messages_getPeerSettings();
        if (user != null) {
            tL_messages_getPeerSettings.peer = getInputPeer(user.id);
        } else {
            tL_messages_getPeerSettings.peer = getInputPeer(-chat.id);
        }
        getConnectionsManager().sendRequest(tL_messages_getPeerSettings, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$loadPeerSettings$79(j, tLObject, tL_error);
            }
        });
    }

    public void lambda$loadPeerSettings$79(final long j, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$loadPeerSettings$78(j, tLObject);
            }
        });
    }

    public void lambda$loadPeerSettings$78(long j, TLObject tLObject) {
        this.loadingPeerSettings.remove(j);
        if (tLObject != null) {
            TLRPC.TL_messages_peerSettings tL_messages_peerSettings = (TLRPC.TL_messages_peerSettings) tLObject;
            TLRPC.PeerSettings peerSettings = tL_messages_peerSettings.settings;
            putUsers(tL_messages_peerSettings.users, false);
            putChats(tL_messages_peerSettings.chats, false);
            savePeerSettings(j, peerSettings, false);
        }
    }

    protected void processNewChannelDifferenceParams(int i, int i2, long j) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("processNewChannelDifferenceParams pts = " + i + " pts_count = " + i2 + " channeldId = " + j);
        }
        int channelPtsSync = this.channelsPts.get(j);
        if (channelPtsSync == 0) {
            channelPtsSync = getMessagesStorage().getChannelPtsSync(j);
            if (channelPtsSync == 0) {
                channelPtsSync = 1;
            }
            this.channelsPts.put(j, channelPtsSync);
        }
        if (channelPtsSync + i2 == i) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("APPLY CHANNEL PTS");
            }
            this.channelsPts.put(j, i);
            getMessagesStorage().saveChannelPts(j, i);
            return;
        }
        if (channelPtsSync != i) {
            long j2 = this.updatesStartWaitTimeChannels.get(j);
            if (((Boolean) this.gettingDifferenceChannels.get(j, Boolean.FALSE)).booleanValue() || j2 == 0 || Math.abs(System.currentTimeMillis() - j2) <= 1500) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("ADD CHANNEL UPDATE TO QUEUE pts = " + i + " pts_count = " + i2);
                }
                if (j2 == 0) {
                    this.updatesStartWaitTimeChannels.put(j, System.currentTimeMillis());
                }
                UserActionUpdatesPts userActionUpdatesPts = new UserActionUpdatesPts(null);
                userActionUpdatesPts.pts = i;
                userActionUpdatesPts.pts_count = i2;
                userActionUpdatesPts.chat_id = j;
                ArrayList arrayList = (ArrayList) this.updatesQueueChannels.get(j);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.updatesQueueChannels.put(j, arrayList);
                }
                arrayList.add(userActionUpdatesPts);
                return;
            }
            getChannelDifference(j);
        }
    }

    public void processNewDifferenceParams(int i, int i2, int i3, int i4) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("processNewDifferenceParams seq = " + i + " pts = " + i2 + " date = " + i3 + " pts_count = " + i4);
        }
        AnonymousClass1 anonymousClass1 = null;
        if (i2 != -1) {
            if (getMessagesStorage().getLastPtsValue() + i4 == i2) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("APPLY PTS");
                }
                getMessagesStorage().setLastPtsValue(i2);
                getMessagesStorage().saveDiffParams(getMessagesStorage().getLastSeqValue(), getMessagesStorage().getLastPtsValue(), getMessagesStorage().getLastDateValue(), getMessagesStorage().getLastQtsValue());
            } else if (getMessagesStorage().getLastPtsValue() != i2) {
                if (this.gettingDifference || this.updatesStartWaitTimePts == 0 || Math.abs(System.currentTimeMillis() - this.updatesStartWaitTimePts) <= 1500) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("ADD UPDATE TO QUEUE pts = " + i2 + " pts_count = " + i4);
                    }
                    if (this.updatesStartWaitTimePts == 0) {
                        this.updatesStartWaitTimePts = System.currentTimeMillis();
                    }
                    UserActionUpdatesPts userActionUpdatesPts = new UserActionUpdatesPts(anonymousClass1);
                    userActionUpdatesPts.pts = i2;
                    userActionUpdatesPts.pts_count = i4;
                    this.updatesQueuePts.add(userActionUpdatesPts);
                } else {
                    getDifference();
                }
            }
        }
        if (i != -1) {
            if (getMessagesStorage().getLastSeqValue() + 1 == i) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("APPLY SEQ");
                }
                getMessagesStorage().setLastSeqValue(i);
                if (i3 != -1) {
                    getMessagesStorage().setLastDateValue(i3);
                }
                getMessagesStorage().saveDiffParams(getMessagesStorage().getLastSeqValue(), getMessagesStorage().getLastPtsValue(), getMessagesStorage().getLastDateValue(), getMessagesStorage().getLastQtsValue());
                return;
            }
            if (getMessagesStorage().getLastSeqValue() != i) {
                if (this.gettingDifference || this.updatesStartWaitTimeSeq == 0 || Math.abs(System.currentTimeMillis() - this.updatesStartWaitTimeSeq) <= 1500) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("ADD UPDATE TO QUEUE seq = " + i);
                    }
                    if (this.updatesStartWaitTimeSeq == 0) {
                        this.updatesStartWaitTimeSeq = System.currentTimeMillis();
                    }
                    UserActionUpdatesSeq userActionUpdatesSeq = new UserActionUpdatesSeq(anonymousClass1);
                    userActionUpdatesSeq.seq = i;
                    this.updatesQueueSeq.add(userActionUpdatesSeq);
                    return;
                }
                getDifference();
            }
        }
    }

    public void didAddedNewTask(final int i, final long j, final SparseArray<ArrayList<Integer>> sparseArray) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$didAddedNewTask$80(i);
            }
        });
        if (sparseArray != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$didAddedNewTask$81(j, sparseArray);
                }
            });
        }
    }

    public void lambda$didAddedNewTask$80(int i) {
        int i2;
        if (!(this.currentDeletingTaskMids == null && this.currentDeletingTaskMediaMids == null && !this.gettingNewDeleteTask) && ((i2 = this.currentDeletingTaskTime) == 0 || i >= i2)) {
            return;
        }
        getNewDeleteTask(null, null);
    }

    public void lambda$didAddedNewTask$81(long j, SparseArray sparseArray) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didCreatedNewDeleteTask, Long.valueOf(j), sparseArray);
    }

    public void getNewDeleteTask(final LongSparseArray longSparseArray, final LongSparseArray longSparseArray2) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$getNewDeleteTask$82(longSparseArray, longSparseArray2);
            }
        });
    }

    public void lambda$getNewDeleteTask$82(LongSparseArray longSparseArray, LongSparseArray longSparseArray2) {
        this.gettingNewDeleteTask = true;
        getMessagesStorage().getNewTask(longSparseArray, longSparseArray2);
    }

    private boolean checkDeletingTask(boolean z) {
        int i;
        int currentTime = getConnectionsManager().getCurrentTime();
        if ((this.currentDeletingTaskMids == null && this.currentDeletingTaskMediaMids == null) || (!z && ((i = this.currentDeletingTaskTime) == 0 || i > currentTime))) {
            return false;
        }
        this.currentDeletingTaskTime = 0;
        if (this.currentDeleteTaskRunnable != null && !z) {
            Utilities.stageQueue.cancelRunnable(this.currentDeleteTaskRunnable);
        }
        this.currentDeleteTaskRunnable = null;
        LongSparseArray longSparseArray = this.currentDeletingTaskMids;
        final LongSparseArray longSparseArrayClone = longSparseArray != null ? longSparseArray.m9clone() : null;
        LongSparseArray longSparseArray2 = this.currentDeletingTaskMediaMids;
        final LongSparseArray longSparseArrayClone2 = longSparseArray2 != null ? longSparseArray2.m9clone() : null;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$checkDeletingTask$85(longSparseArrayClone, longSparseArrayClone2);
            }
        });
        return true;
    }

    public void lambda$checkDeletingTask$85(final LongSparseArray longSparseArray, final LongSparseArray longSparseArray2) {
        long j;
        ArrayList<Integer> arrayList;
        boolean z = true;
        if (longSparseArray != null) {
            int size = longSparseArray.size();
            for (int i = 0; i < size; i++) {
                ArrayList<Integer> arrayList2 = (ArrayList) longSparseArray.valueAt(i);
                deleteMessages(arrayList2, null, null, longSparseArray.keyAt(i), 0, true, 0, !arrayList2.isEmpty() && arrayList2.get(0).intValue() > 0);
            }
        }
        if (longSparseArray2 != null) {
            boolean z2 = SecretMediaViewer.hasInstance() && SecretMediaViewer.getInstance().isVisible();
            MessageObject currentMessageObject = z2 ? SecretMediaViewer.getInstance().getCurrentMessageObject() : null;
            int size2 = longSparseArray2.size();
            int i2 = 0;
            while (i2 < size2) {
                final long jKeyAt = longSparseArray2.keyAt(i2);
                ArrayList<Integer> arrayList3 = (ArrayList) longSparseArray2.valueAt(i2);
                if (z2 && currentMessageObject != null && currentMessageObject.currentAccount == this.currentAccount && currentMessageObject.getDialogId() == jKeyAt && arrayList3.contains(Integer.valueOf(currentMessageObject.getId()))) {
                    final int id = currentMessageObject.getId();
                    arrayList3.remove(Integer.valueOf(id));
                    currentMessageObject.forceExpired = z;
                    final long jCreateDeleteShowOnceTask = createDeleteShowOnceTask(jKeyAt, id);
                    j = jKeyAt;
                    arrayList = arrayList3;
                    SecretMediaViewer.getInstance().setOnClose(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$checkDeletingTask$83(jCreateDeleteShowOnceTask, jKeyAt, id);
                        }
                    });
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateMessageMedia, currentMessageObject.messageOwner);
                } else {
                    j = jKeyAt;
                    arrayList = arrayList3;
                }
                if (!arrayList.isEmpty()) {
                    getMessagesStorage().emptyMessagesMedia(j, arrayList);
                }
                i2++;
                z = true;
            }
        }
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$checkDeletingTask$84(longSparseArray, longSparseArray2);
            }
        });
    }

    public void lambda$checkDeletingTask$84(LongSparseArray longSparseArray, LongSparseArray longSparseArray2) {
        getNewDeleteTask(longSparseArray, longSparseArray2);
        this.currentDeletingTaskTime = 0;
        this.currentDeletingTaskMids = null;
        this.currentDeletingTaskMediaMids = null;
    }

    public void processLoadedDeleteTask(final int i, final LongSparseArray longSparseArray, final LongSparseArray longSparseArray2) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$processLoadedDeleteTask$87(longSparseArray, longSparseArray2, i);
            }
        });
    }

    public void lambda$processLoadedDeleteTask$87(LongSparseArray longSparseArray, LongSparseArray longSparseArray2, int i) {
        this.gettingNewDeleteTask = false;
        if (longSparseArray != null || longSparseArray2 != null) {
            this.currentDeletingTaskTime = i;
            this.currentDeletingTaskMids = longSparseArray;
            this.currentDeletingTaskMediaMids = longSparseArray2;
            if (this.currentDeleteTaskRunnable != null) {
                Utilities.stageQueue.cancelRunnable(this.currentDeleteTaskRunnable);
                this.currentDeleteTaskRunnable = null;
            }
            if (checkDeletingTask(false)) {
                return;
            }
            this.currentDeleteTaskRunnable = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$processLoadedDeleteTask$86();
                }
            };
            Utilities.stageQueue.postRunnable(this.currentDeleteTaskRunnable, Math.abs(getConnectionsManager().getCurrentTime() - this.currentDeletingTaskTime) * 1000);
            return;
        }
        this.currentDeletingTaskTime = 0;
        this.currentDeletingTaskMids = null;
        this.currentDeletingTaskMediaMids = null;
    }

    public void lambda$processLoadedDeleteTask$86() {
        checkDeletingTask(true);
    }

    public DialogPhotos getDialogPhotos(long j) {
        DialogPhotos dialogPhotos = (DialogPhotos) this.dialogPhotos.get(j);
        if (dialogPhotos != null) {
            return dialogPhotos;
        }
        LongSparseArray longSparseArray = this.dialogPhotos;
        DialogPhotos dialogPhotos2 = new DialogPhotos(j);
        longSparseArray.put(j, dialogPhotos2);
        return dialogPhotos2;
    }

    public class DialogPhotos {
        public static final int STEP = 80;
        public final long dialogId;
        private boolean loading;
        public final ArrayList<TLRPC.Photo> photos = new ArrayList<>();
        public boolean fromCache = true;
        public boolean loaded = false;
        private int lastLoadOffset = -1;
        private int lastLoadCount = -1;

        public void addPhotoAtStart(TLRPC.Photo photo) {
        }

        public DialogPhotos(long j) {
            this.dialogId = j;
        }

        public void loadAfter(int i, boolean z) {
            int i2 = 0;
            if (this.photos.isEmpty()) {
                load(0, 80);
                return;
            }
            if (i < 0) {
                i += this.photos.size();
            }
            if (i >= this.photos.size()) {
                i -= this.photos.size();
            }
            if (i < 0 || i >= this.photos.size()) {
                return;
            }
            for (int i3 = 0; i3 < this.photos.size(); i3++) {
                if (this.photos.get(i3) == null) {
                    if (z) {
                        while (this.photos.get(i) != null) {
                            i++;
                            if (i >= this.photos.size()) {
                                i = 0;
                            }
                        }
                        while (i2 <= 80) {
                            int i4 = i + i2;
                            if (i4 >= this.photos.size() || this.photos.get(i4) != null) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                        if (i2 > 0) {
                            load(i, i2);
                            return;
                        }
                        return;
                    }
                    while (this.photos.get(i) != null) {
                        i--;
                        if (i < 0) {
                            i = this.photos.size() - 1;
                        }
                    }
                    while (i2 <= 80) {
                        int i5 = i - i2;
                        if (i5 < 0 || this.photos.get(i5) != null) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i2 > 0) {
                        load(i - i2, i2);
                        return;
                    }
                    return;
                }
            }
        }

        public void load(final int i, final int i2) {
            if (this.loading || i2 <= 0 || i < 0) {
                return;
            }
            if (i2 == this.lastLoadCount && i == this.lastLoadOffset) {
                return;
            }
            this.loading = true;
            this.lastLoadOffset = i;
            this.lastLoadCount = i2;
            long j = this.dialogId;
            if (j >= 0) {
                TLRPC.User user = MessagesController.this.getUser(Long.valueOf(j));
                if (user == null) {
                    this.loading = false;
                    return;
                }
                TLRPC.TL_photos_getUserPhotos tL_photos_getUserPhotos = new TLRPC.TL_photos_getUserPhotos();
                tL_photos_getUserPhotos.offset = i;
                tL_photos_getUserPhotos.limit = i2;
                tL_photos_getUserPhotos.max_id = 0L;
                tL_photos_getUserPhotos.user_id = MessagesController.this.getInputUser(user);
                MessagesController.this.getConnectionsManager().sendRequest(tL_photos_getUserPhotos, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        this.f$0.lambda$load$1(i, i2, tLObject, tL_error);
                    }
                });
                return;
            }
            TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterChatPhotos();
            tL_messages_search.add_offset = i;
            tL_messages_search.limit = i2;
            tL_messages_search.offset_id = 0;
            tL_messages_search.q = "";
            tL_messages_search.peer = MessagesController.this.getInputPeer(this.dialogId);
            MessagesController.this.getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$load$3(i, i2, tLObject, tL_error);
                }
            });
        }

        public void lambda$load$1(final int i, final int i2, TLObject tLObject, TLRPC.TL_error tL_error) {
            if (tL_error == null) {
                final TLRPC.photos_Photos photos_photos = (TLRPC.photos_Photos) tLObject;
                MessagesController.this.getMessagesStorage().putUsersAndChats(photos_photos.users, null, true, true);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$load$0(photos_photos, i, i2);
                    }
                });
            }
        }

        public void lambda$load$0(TLRPC.photos_Photos photos_photos, int i, int i2) {
            MessagesController.this.putUsers(photos_photos.users, false);
            onLoaded(i, i2, photos_photos);
        }

        public void lambda$load$3(final int i, final int i2, TLObject tLObject, TLRPC.TL_error tL_error) {
            if (tL_error == null) {
                final TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                MessagesController.this.getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$load$2(messages_messages, i, i2);
                    }
                });
            }
        }

        public void lambda$load$2(TLRPC.messages_Messages messages_messages, int i, int i2) {
            TLRPC.Photo photo;
            MessagesController.this.putUsers(messages_messages.users, false);
            MessagesController.this.putChats(messages_messages.chats, false);
            TLRPC.TL_photos_photos tL_photos_photos = new TLRPC.TL_photos_photos();
            tL_photos_photos.count = messages_messages.count;
            for (int i3 = 0; i3 < messages_messages.messages.size(); i3++) {
                TLRPC.MessageAction messageAction = messages_messages.messages.get(i3).action;
                if (messageAction != null && (photo = messageAction.photo) != null) {
                    tL_photos_photos.photos.add(photo);
                }
            }
            onLoaded(i, i2, tL_photos_photos);
        }

        private void onLoaded(int i, int i2, TLRPC.photos_Photos photos_photos) {
            boolean z = this.loaded;
            this.loading = false;
            this.loaded = true;
            this.fromCache = false;
            int iMax = Math.max(photos_photos.count, photos_photos.photos.size());
            photos_photos.count = iMax;
            boolean z2 = iMax != this.photos.size() || i + i2 > this.photos.size();
            if (!z2) {
                int i3 = 0;
                while (true) {
                    if (i3 >= photos_photos.photos.size()) {
                        break;
                    }
                    int i4 = i + i3;
                    if (this.photos.get(i4) != null && this.photos.get(i4).id != photos_photos.photos.get(i3).id) {
                        z2 = true;
                        break;
                    }
                    i3++;
                }
            }
            if (z2) {
                this.photos.clear();
                for (int i5 = 0; i5 < photos_photos.count; i5++) {
                    int i6 = i5 - i;
                    this.photos.add((i6 < 0 || i6 >= photos_photos.photos.size()) ? null : photos_photos.photos.get(i6));
                }
            } else {
                for (int i7 = 0; i7 < photos_photos.photos.size(); i7++) {
                    this.photos.set(i + i7, photos_photos.photos.get(i7));
                }
            }
            saveCache();
            MessagesController.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogPhotosUpdate, this);
            if (z || i != 0 || i2 >= this.photos.size() || this.photos.size() - i2 <= 80) {
                return;
            }
            load(this.photos.size() - 80, 80);
        }

        public void removePhoto(long j) {
            if (removePhotoInternal(j)) {
                saveCache();
                MessagesController.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogPhotosUpdate, this);
            }
        }

        public void moveToStart(int i) {
            if (i < 0 || i >= this.photos.size()) {
                return;
            }
            ArrayList<TLRPC.Photo> arrayList = this.photos;
            arrayList.add(0, arrayList.remove(i));
            saveCache();
            MessagesController.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogPhotosUpdate, this);
        }

        private boolean removePhotoInternal(long j) {
            int i = 0;
            boolean z = false;
            while (i < this.photos.size()) {
                TLRPC.Photo photo = this.photos.get(i);
                if (photo != null && photo.id == j) {
                    this.photos.remove(i);
                    i--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int getCount() {
            return this.photos.size();
        }

        public void loadCache() {
            MessagesController.this.getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() throws Throwable {
                    this.f$0.lambda$loadCache$5();
                }
            });
        }

        public void lambda$loadCache$5() throws Throwable {
            int iIntValue;
            int int32;
            int i = 0;
            SQLiteDatabase database = MessagesController.this.getMessagesStorage().getDatabase();
            final HashMap map = new HashMap();
            SQLiteCursor sQLiteCursor = null;
            try {
                try {
                    Locale locale = Locale.US;
                    SQLiteCursor sQLiteCursorQueryFinalized = database.queryFinalized(String.format(locale, "SELECT count FROM dialog_photos_count WHERE uid = %d", Long.valueOf(this.dialogId)), new Object[0]);
                    try {
                        try {
                            iIntValue = sQLiteCursorQueryFinalized.next() ? sQLiteCursorQueryFinalized.intValue(0) : 0;
                            try {
                                sQLiteCursorQueryFinalized.dispose();
                                try {
                                    SQLiteCursor sQLiteCursorQueryFinalized2 = database.queryFinalized(String.format(locale, "SELECT num, data FROM dialog_photos WHERE uid = %d", Long.valueOf(this.dialogId)), new Object[0]);
                                    while (sQLiteCursorQueryFinalized2.next()) {
                                        try {
                                            int iIntValue2 = sQLiteCursorQueryFinalized2.intValue(0);
                                            NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized2.byteBufferValue(1);
                                            TLRPC.Photo photoTLdeserialize = (nativeByteBufferByteBufferValue == null || (int32 = nativeByteBufferByteBufferValue.readInt32(false)) == 1450380236) ? null : TLRPC.Photo.TLdeserialize(nativeByteBufferByteBufferValue, int32, false);
                                            if (photoTLdeserialize != null) {
                                                iIntValue = Math.max(iIntValue2 + 1, iIntValue);
                                                map.put(Integer.valueOf(iIntValue2), photoTLdeserialize);
                                            }
                                        } catch (Exception unused) {
                                            sQLiteCursor = sQLiteCursorQueryFinalized2;
                                            i = iIntValue;
                                            if (sQLiteCursor != null) {
                                                sQLiteCursor.dispose();
                                            }
                                            iIntValue = i;
                                            final int iMax = Math.max(iIntValue, map.size());
                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                @Override
                                                public final void run() {
                                                    this.f$0.lambda$loadCache$4(iMax, map);
                                                }
                                            });
                                        } catch (Throwable th) {
                                            th = th;
                                            sQLiteCursor = sQLiteCursorQueryFinalized2;
                                            if (sQLiteCursor != null) {
                                                sQLiteCursor.dispose();
                                            }
                                            throw th;
                                        }
                                    }
                                    sQLiteCursorQueryFinalized2.dispose();
                                } catch (Exception unused2) {
                                }
                            } catch (Exception unused3) {
                                sQLiteCursor = sQLiteCursorQueryFinalized;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            sQLiteCursor = sQLiteCursorQueryFinalized;
                        }
                    } catch (Exception unused4) {
                        sQLiteCursor = sQLiteCursorQueryFinalized;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception unused5) {
            }
            final int iMax2 = Math.max(iIntValue, map.size());
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$loadCache$4(iMax2, map);
                }
            });
        }

        public void lambda$loadCache$4(int i, HashMap map) {
            this.photos.clear();
            this.lastLoadOffset = -1;
            this.lastLoadCount = -1;
            for (int i2 = 0; i2 < i; i2++) {
                this.photos.add(null);
            }
            for (Map.Entry entry : map.entrySet()) {
                this.photos.set(((Integer) entry.getKey()).intValue(), (TLRPC.Photo) entry.getValue());
            }
            MessagesController.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogPhotosUpdate, this);
            load(0, 80);
        }

        private void saveCache() {
            MessagesController.this.getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$saveCache$6();
                }
            });
        }

        public void lambda$saveCache$6() {
            SQLiteDatabase database = MessagesController.this.getMessagesStorage().getDatabase();
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = null;
            try {
                database.executeFast("DELETE FROM dialog_photos WHERE uid = " + this.dialogId).stepThis().dispose();
                database.executeFast("DELETE FROM dialog_photos_count WHERE uid = " + this.dialogId).stepThis().dispose();
                database.executeFast("REPLACE INTO dialog_photos_count VALUES(" + this.dialogId + ", " + this.photos.size() + ")").stepThis().dispose();
                sQLitePreparedStatementExecuteFast = database.executeFast("REPLACE INTO dialog_photos VALUES(?, ?, ?, ?)");
                for (int i = 0; i < this.photos.size(); i++) {
                    TLRPC.Photo photo = this.photos.get(i);
                    if (photo != null) {
                        if (photo.file_reference == null) {
                            photo.file_reference = new byte[0];
                        }
                        sQLitePreparedStatementExecuteFast.requery();
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(photo.getObjectSize());
                        photo.serializeToStream(nativeByteBuffer);
                        sQLitePreparedStatementExecuteFast.bindLong(1, this.dialogId);
                        sQLitePreparedStatementExecuteFast.bindLong(2, photo.id);
                        sQLitePreparedStatementExecuteFast.bindInteger(3, i);
                        sQLitePreparedStatementExecuteFast.bindByteBuffer(4, nativeByteBuffer);
                        sQLitePreparedStatementExecuteFast.step();
                        nativeByteBuffer.reuse();
                    }
                }
                sQLitePreparedStatementExecuteFast.dispose();
            } catch (Exception unused) {
                if (sQLitePreparedStatementExecuteFast != null) {
                    sQLitePreparedStatementExecuteFast.dispose();
                }
            } catch (Throwable th) {
                if (sQLitePreparedStatementExecuteFast != null) {
                    sQLitePreparedStatementExecuteFast.dispose();
                }
                throw th;
            }
        }

        public void reset() {
            this.photos.clear();
            this.lastLoadOffset = -1;
            this.lastLoadCount = -1;
            this.fromCache = true;
            saveCache();
        }
    }

    public void blockPeer(long j) {
        TLRPC.Chat chat;
        TLRPC.User user = null;
        if (j > 0) {
            TLRPC.User user2 = getUser(Long.valueOf(j));
            if (user2 == null) {
                return;
            }
            user = user2;
            chat = null;
        } else {
            chat = getChat(Long.valueOf(-j));
            if (chat == null) {
                return;
            }
        }
        if (this.blockePeers.indexOfKey(j) >= 0) {
            return;
        }
        this.blockePeers.put(j, 1);
        if (user != null) {
            if (user.bot) {
                getMediaDataController().removeInline(j);
            } else {
                getMediaDataController().removePeer(j);
            }
        }
        int i = this.totalBlockedCount;
        if (i >= 0) {
            this.totalBlockedCount = i + 1;
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.blockedUsersDidLoad, new Object[0]);
        TLRPC.TL_contacts_block tL_contacts_block = new TLRPC.TL_contacts_block();
        if (user != null) {
            tL_contacts_block.id = getInputPeer(user);
        } else {
            tL_contacts_block.id = getInputPeer(chat);
        }
        getConnectionsManager().sendRequest(tL_contacts_block, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                MessagesController.lambda$blockPeer$88(tLObject, tL_error);
            }
        });
    }

    public void setParticipantBannedRole(long j, TLRPC.User user, TLRPC.Chat chat, TLRPC.TL_chatBannedRights tL_chatBannedRights, boolean z, BaseFragment baseFragment) {
        setParticipantBannedRole(j, user, chat, tL_chatBannedRights, z, baseFragment, null);
    }

    public void setParticipantBannedRole(final long j, TLRPC.User user, TLRPC.Chat chat, TLRPC.TL_chatBannedRights tL_chatBannedRights, final boolean z, final BaseFragment baseFragment, final Runnable runnable) {
        if ((user == null && chat == null) || tL_chatBannedRights == null) {
            return;
        }
        final TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
        tL_channels_editBanned.channel = getInputChannel(j);
        if (user != null) {
            tL_channels_editBanned.participant = getInputPeer(user);
        } else {
            tL_channels_editBanned.participant = getInputPeer(chat);
        }
        tL_channels_editBanned.banned_rights = tL_chatBannedRights;
        getConnectionsManager().sendRequest(tL_channels_editBanned, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$setParticipantBannedRole$91(j, runnable, baseFragment, tL_channels_editBanned, z, tLObject, tL_error);
            }
        });
    }

    public void lambda$setParticipantBannedRole$91(final long j, Runnable runnable, final BaseFragment baseFragment, final TLRPC.TL_channels_editBanned tL_channels_editBanned, final boolean z, TLObject tLObject, final TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$setParticipantBannedRole$89(j);
                }
            }, 1000L);
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
                return;
            }
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$setParticipantBannedRole$90(tL_error, baseFragment, tL_channels_editBanned, z);
            }
        });
    }

    public void lambda$setParticipantBannedRole$89(long j) {
        loadFullChat(j, 0, true);
    }

    public void lambda$setParticipantBannedRole$90(TLRPC.TL_error tL_error, BaseFragment baseFragment, TLRPC.TL_channels_editBanned tL_channels_editBanned, boolean z) {
        AlertsCreator.processError(this.currentAccount, tL_error, baseFragment, tL_channels_editBanned, Boolean.valueOf(z));
    }

    public void setChannelSlowMode(final long j, int i) {
        TLRPC.TL_channels_toggleSlowMode tL_channels_toggleSlowMode = new TLRPC.TL_channels_toggleSlowMode();
        tL_channels_toggleSlowMode.seconds = i;
        tL_channels_toggleSlowMode.channel = getInputChannel(j);
        getConnectionsManager().sendRequest(tL_channels_toggleSlowMode, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$setChannelSlowMode$93(j, tLObject, tL_error);
            }
        });
    }

    public void lambda$setChannelSlowMode$93(final long j, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$setChannelSlowMode$92(j);
                }
            }, 1000L);
        }
    }

    public void lambda$setChannelSlowMode$92(long j) {
        loadFullChat(j, 0, true);
    }

    public void setBoostsToUnblockRestrictions(final long j, int i) {
        TLRPC.TL_channels_setBoostsToUnblockRestrictions tL_channels_setBoostsToUnblockRestrictions = new TLRPC.TL_channels_setBoostsToUnblockRestrictions();
        tL_channels_setBoostsToUnblockRestrictions.boosts = i;
        tL_channels_setBoostsToUnblockRestrictions.channel = getInputChannel(j);
        getConnectionsManager().sendRequest(tL_channels_setBoostsToUnblockRestrictions, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$setBoostsToUnblockRestrictions$95(j, tLObject, tL_error);
            }
        });
    }

    public void lambda$setBoostsToUnblockRestrictions$95(final long j, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$setBoostsToUnblockRestrictions$94(j);
                }
            }, 1000L);
        }
    }

    public void lambda$setBoostsToUnblockRestrictions$94(long j) {
        loadFullChat(j, 0, true);
    }

    public void setDefaultBannedRole(final long j, TLRPC.TL_chatBannedRights tL_chatBannedRights, final boolean z, final BaseFragment baseFragment) {
        if (tL_chatBannedRights == null) {
            return;
        }
        final TLRPC.TL_messages_editChatDefaultBannedRights tL_messages_editChatDefaultBannedRights = new TLRPC.TL_messages_editChatDefaultBannedRights();
        tL_messages_editChatDefaultBannedRights.peer = getInputPeer(-j);
        tL_messages_editChatDefaultBannedRights.banned_rights = tL_chatBannedRights;
        getConnectionsManager().sendRequest(tL_messages_editChatDefaultBannedRights, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$setDefaultBannedRole$98(j, baseFragment, tL_messages_editChatDefaultBannedRights, z, tLObject, tL_error);
            }
        });
    }

    public void lambda$setDefaultBannedRole$98(final long j, final BaseFragment baseFragment, final TLRPC.TL_messages_editChatDefaultBannedRights tL_messages_editChatDefaultBannedRights, final boolean z, TLObject tLObject, final TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$setDefaultBannedRole$96(j);
                }
            }, 1000L);
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$setDefaultBannedRole$97(tL_error, baseFragment, tL_messages_editChatDefaultBannedRights, z);
                }
            });
        }
    }

    public void lambda$setDefaultBannedRole$96(long j) {
        loadFullChat(j, 0, true);
    }

    public void lambda$setDefaultBannedRole$97(TLRPC.TL_error tL_error, BaseFragment baseFragment, TLRPC.TL_messages_editChatDefaultBannedRights tL_messages_editChatDefaultBannedRights, boolean z) {
        AlertsCreator.processError(this.currentAccount, tL_error, baseFragment, tL_messages_editChatDefaultBannedRights, Boolean.valueOf(z));
    }

    public void setUserAdminRole(long j, TLRPC.User user, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str, boolean z, BaseFragment baseFragment, boolean z2, boolean z3, String str2, Runnable runnable) {
        setUserAdminRole(j, user, tL_chatAdminRights, str, z, baseFragment, z2, z3, str2, runnable, null);
    }

    public void setUserAdminRole(final long j, final TLRPC.User user, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str, final boolean z, final BaseFragment baseFragment, boolean z2, boolean z3, String str2, final Runnable runnable, final ErrorDelegate errorDelegate) {
        if (user == null || tL_chatAdminRights == null) {
            return;
        }
        final TLRPC.Chat chat = getChat(Long.valueOf(j));
        if (ChatObject.isChannel(chat)) {
            final TLRPC.TL_channels_editAdmin tL_channels_editAdmin = new TLRPC.TL_channels_editAdmin();
            tL_channels_editAdmin.channel = getInputChannel(chat);
            tL_channels_editAdmin.user_id = getInputUser(user);
            tL_channels_editAdmin.admin_rights = tL_chatAdminRights;
            tL_channels_editAdmin.rank = str;
            final RequestDelegate requestDelegate = new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$setUserAdminRole$103(j, runnable, chat, user, errorDelegate, baseFragment, tL_channels_editAdmin, z, tLObject, tL_error);
                }
            };
            if (!user.bot && z2) {
                addUserToChat(j, user, 0, str2, baseFragment, true, new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$setUserAdminRole$104(tL_channels_editAdmin, requestDelegate);
                    }
                }, errorDelegate);
                return;
            } else {
                getConnectionsManager().sendRequest(tL_channels_editAdmin, requestDelegate);
                return;
            }
        }
        final TLRPC.TL_messages_editChatAdmin tL_messages_editChatAdmin = new TLRPC.TL_messages_editChatAdmin();
        tL_messages_editChatAdmin.chat_id = j;
        tL_messages_editChatAdmin.user_id = getInputUser(user);
        tL_messages_editChatAdmin.is_admin = z3 || tL_chatAdminRights.change_info || tL_chatAdminRights.delete_messages || tL_chatAdminRights.ban_users || tL_chatAdminRights.invite_users || tL_chatAdminRights.pin_messages || tL_chatAdminRights.add_admins || tL_chatAdminRights.manage_call;
        final RequestDelegate requestDelegate2 = new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$setUserAdminRole$108(j, runnable, baseFragment, tL_messages_editChatAdmin, errorDelegate, tLObject, tL_error);
            }
        };
        if (tL_messages_editChatAdmin.is_admin || z2 || !TextUtils.isEmpty(str2)) {
            addUserToChat(j, user, 0, str2, baseFragment, true, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$setUserAdminRole$109(tL_messages_editChatAdmin, requestDelegate2);
                }
            }, errorDelegate);
        } else {
            getConnectionsManager().sendRequest(tL_messages_editChatAdmin, requestDelegate2);
        }
    }

    public void lambda$setUserAdminRole$103(final long j, final Runnable runnable, final TLRPC.Chat chat, final TLRPC.User user, final ErrorDelegate errorDelegate, final BaseFragment baseFragment, final TLRPC.TL_channels_editAdmin tL_channels_editAdmin, final boolean z, TLObject tLObject, final TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$setUserAdminRole$99(j, runnable);
                }
            }, 1000L);
        } else {
            if ("USER_PRIVACY_RESTRICTED".equals(tL_error.text) && ChatObject.canUserDoAdminAction(chat, 3)) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$setUserAdminRole$100(user, chat, errorDelegate, tL_error);
                    }
                });
                return;
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$setUserAdminRole$101(tL_error, baseFragment, tL_channels_editAdmin, z);
                }
            });
            if (errorDelegate != null) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        errorDelegate.run(tL_error);
                    }
                });
            }
        }
    }

    public void lambda$setUserAdminRole$99(long j, Runnable runnable) {
        loadFullChat(j, 0, true);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$setUserAdminRole$100(TLRPC.User user, TLRPC.Chat chat, ErrorDelegate errorDelegate, TLRPC.TL_error tL_error) {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment != null && lastFragment.getParentActivity() != null) {
            LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(lastFragment, lastFragment.getParentActivity(), 11, this.currentAccount, null);
            ArrayList arrayList = new ArrayList();
            arrayList.add(user);
            limitReachedBottomSheet.setRestrictedUsers(chat, arrayList, null, null, null);
            limitReachedBottomSheet.show();
        }
        errorDelegate.run(tL_error);
    }

    public void lambda$setUserAdminRole$101(TLRPC.TL_error tL_error, BaseFragment baseFragment, TLRPC.TL_channels_editAdmin tL_channels_editAdmin, boolean z) {
        AlertsCreator.processError(this.currentAccount, tL_error, baseFragment, tL_channels_editAdmin, Boolean.valueOf(z));
    }

    public void lambda$setUserAdminRole$104(TLRPC.TL_channels_editAdmin tL_channels_editAdmin, RequestDelegate requestDelegate) {
        getConnectionsManager().sendRequest(tL_channels_editAdmin, requestDelegate);
    }

    public void lambda$setUserAdminRole$108(final long j, final Runnable runnable, final BaseFragment baseFragment, final TLRPC.TL_messages_editChatAdmin tL_messages_editChatAdmin, final ErrorDelegate errorDelegate, TLObject tLObject, final TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$setUserAdminRole$105(j, runnable);
                }
            }, 1000L);
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$setUserAdminRole$106(tL_error, baseFragment, tL_messages_editChatAdmin);
            }
        });
        if (errorDelegate != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    errorDelegate.run(tL_error);
                }
            });
        }
    }

    public void lambda$setUserAdminRole$105(long j, Runnable runnable) {
        loadFullChat(j, 0, true);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$setUserAdminRole$106(TLRPC.TL_error tL_error, BaseFragment baseFragment, TLRPC.TL_messages_editChatAdmin tL_messages_editChatAdmin) {
        AlertsCreator.processError(this.currentAccount, tL_error, baseFragment, tL_messages_editChatAdmin, Boolean.FALSE);
    }

    public void lambda$setUserAdminRole$109(TLRPC.TL_messages_editChatAdmin tL_messages_editChatAdmin, RequestDelegate requestDelegate) {
        getConnectionsManager().sendRequest(tL_messages_editChatAdmin, requestDelegate);
    }

    public void unblockPeer(long j) {
        unblockPeer(j, null);
    }

    public void unblockPeer(long j, final Runnable runnable) {
        TLRPC.Chat chat;
        TLRPC.TL_contacts_unblock tL_contacts_unblock = new TLRPC.TL_contacts_unblock();
        TLRPC.User user = null;
        if (j > 0) {
            TLRPC.User user2 = getUser(Long.valueOf(j));
            if (user2 == null) {
                return;
            }
            user = user2;
            chat = null;
        } else {
            chat = getChat(Long.valueOf(-j));
            if (chat == null) {
                return;
            }
        }
        this.totalBlockedCount--;
        this.blockePeers.delete(j);
        if (user != null) {
            tL_contacts_unblock.id = getInputPeer(user);
        } else {
            tL_contacts_unblock.id = getInputPeer(chat);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.blockedUsersDidLoad, new Object[0]);
        getConnectionsManager().sendRequest(tL_contacts_unblock, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                MessagesController.lambda$unblockPeer$111(runnable, tLObject, tL_error);
            }
        });
    }

    public static void lambda$unblockPeer$111(final Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.lambda$unblockPeer$110(runnable);
            }
        });
    }

    public static void lambda$unblockPeer$110(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public void getBlockedPeers(final boolean z) {
        if (!getUserConfig().isClientActivated() || this.loadingBlockedPeers) {
            return;
        }
        this.loadingBlockedPeers = true;
        final TLRPC.TL_contacts_getBlocked tL_contacts_getBlocked = new TLRPC.TL_contacts_getBlocked();
        tL_contacts_getBlocked.offset = z ? 0 : this.blockePeers.size();
        tL_contacts_getBlocked.limit = z ? 20 : 100;
        getConnectionsManager().sendRequest(tL_contacts_getBlocked, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$getBlockedPeers$113(z, tL_contacts_getBlocked, tLObject, tL_error);
            }
        });
    }

    public void lambda$getBlockedPeers$113(final boolean z, final TLRPC.TL_contacts_getBlocked tL_contacts_getBlocked, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$getBlockedPeers$112(tLObject, z, tL_contacts_getBlocked);
            }
        });
    }

    public void lambda$getBlockedPeers$112(TLObject tLObject, boolean z, TLRPC.TL_contacts_getBlocked tL_contacts_getBlocked) {
        if (tLObject != null) {
            TLRPC.contacts_Blocked contacts_blocked = (TLRPC.contacts_Blocked) tLObject;
            putUsers(contacts_blocked.users, false);
            putChats(contacts_blocked.chats, false);
            getMessagesStorage().putUsersAndChats(contacts_blocked.users, contacts_blocked.chats, true, true);
            if (z) {
                this.blockePeers.clear();
            }
            this.totalBlockedCount = Math.max(contacts_blocked.count, contacts_blocked.blocked.size());
            this.blockedEndReached = contacts_blocked.blocked.size() < tL_contacts_getBlocked.limit;
            int size = contacts_blocked.blocked.size();
            for (int i = 0; i < size; i++) {
                this.blockePeers.put(MessageObject.getPeerId(contacts_blocked.blocked.get(i).peer_id), 1);
            }
            this.loadingBlockedPeers = false;
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.blockedUsersDidLoad, new Object[0]);
        }
    }

    public void deleteUserPhoto(TLRPC.InputPhoto inputPhoto) {
        TLRPC.Photo photo;
        final long clientUserId = getUserConfig().getClientUserId();
        if (inputPhoto == null) {
            DialogPhotos dialogPhotos = getDialogPhotos(clientUserId);
            if (dialogPhotos != null && dialogPhotos.photos.size() > 0 && (photo = dialogPhotos.photos.get(0)) != null) {
                dialogPhotos.removePhoto(photo.id);
            }
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
            TLRPC.User user = getUser(Long.valueOf(getUserConfig().getClientUserId()));
            if (user == null) {
                user = getUserConfig().getCurrentUser();
            }
            if (user == null) {
                return;
            }
            if (user.photo != null) {
                getMessagesStorage().clearUserPhoto(user.id, user.photo.photo_id);
            }
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_ALL));
            getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$deleteUserPhoto$115(clientUserId, tLObject, tL_error);
                }
            });
            return;
        }
        TLRPC.TL_photos_deletePhotos tL_photos_deletePhotos = new TLRPC.TL_photos_deletePhotos();
        tL_photos_deletePhotos.id.add(inputPhoto);
        getDialogPhotos(clientUserId).removePhoto(inputPhoto.id);
        getConnectionsManager().sendRequest(tL_photos_deletePhotos, null);
    }

    public void lambda$deleteUserPhoto$115(final long j, final TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$deleteUserPhoto$114(tLObject, j);
                }
            });
        }
    }

    public void lambda$deleteUserPhoto$114(TLObject tLObject, long j) {
        TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
        TLRPC.User user = getUser(Long.valueOf(getUserConfig().getClientUserId()));
        if (user == null) {
            user = getUserConfig().getCurrentUser();
            putUser(user, false);
        } else {
            getUserConfig().setCurrentUser(user);
        }
        if (user == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(user);
        getMessagesStorage().putUsersAndChats(arrayList, null, false, true);
        if (tL_photos_photo.photo instanceof TLRPC.TL_photo) {
            TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
            user.photo = tL_userProfilePhoto;
            tL_userProfilePhoto.has_video = !tL_photos_photo.photo.video_sizes.isEmpty();
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            TLRPC.Photo photo = tL_photos_photo.photo;
            userProfilePhoto.photo_id = photo.id;
            userProfilePhoto.photo_small = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 150).location;
            user.photo.photo_big = FileLoader.getClosestPhotoSizeWithSize(tL_photos_photo.photo.sizes, 800).location;
            user.photo.dc_id = tL_photos_photo.photo.dc_id;
        } else {
            user.photo = new TLRPC.TL_userProfilePhotoEmpty();
        }
        TLRPC.UserFull userFull = getUserFull(j);
        if (userFull != null) {
            userFull.profile_photo = tL_photos_photo.photo;
            getMessagesStorage().updateUserInfo(userFull, false);
        }
        getUserConfig().getCurrentUser().photo = user.photo;
        putUser(user, false);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
        NotificationCenter notificationCenter = getNotificationCenter();
        int i = NotificationCenter.updateInterfaces;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i, Integer.valueOf(UPDATE_MASK_ALL));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i, Integer.valueOf(UPDATE_MASK_AVATAR));
        getUserConfig().saveConfig(true);
    }

    public void uploadAndApplyUserAvatar(TLRPC.FileLocation fileLocation) {
        if (fileLocation == null) {
            return;
        }
        this.uploadingAvatar = FileLoader.getDirectory(4) + "/" + fileLocation.volume_id + "_" + fileLocation.local_id + ".jpg";
        getFileLoader().uploadFile(this.uploadingAvatar, false, true, 16777216);
    }

    public void saveTheme(Theme.ThemeInfo themeInfo, Theme.ThemeAccent themeAccent, boolean z, boolean z2) {
        TLRPC.TL_theme tL_theme = themeAccent != null ? themeAccent.info : themeInfo.info;
        if (tL_theme != null) {
            TL_account.saveTheme savetheme = new TL_account.saveTheme();
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.id = tL_theme.id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            savetheme.theme = tL_inputTheme;
            savetheme.unsave = z2;
            getConnectionsManager().sendRequest(savetheme, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    MessagesController.lambda$saveTheme$116(tLObject, tL_error);
                }
            });
            getConnectionsManager().resumeNetworkMaybe();
        }
        if (z2) {
            return;
        }
        installTheme(themeInfo, themeAccent, z);
    }

    public void installTheme(Theme.ThemeInfo themeInfo, Theme.ThemeAccent themeAccent, boolean z) {
        TLRPC.TL_theme tL_theme = themeAccent != null ? themeAccent.info : themeInfo.info;
        String str = themeAccent != null ? themeAccent.patternSlug : themeInfo.slug;
        boolean z2 = themeAccent == null && themeInfo.isBlured;
        boolean z3 = themeAccent != null ? themeAccent.patternMotion : themeInfo.isMotion;
        TL_account.installTheme installtheme = new TL_account.installTheme();
        installtheme.dark = z;
        if (tL_theme != null) {
            installtheme.format = "android";
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.id = tL_theme.id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            installtheme.theme = tL_inputTheme;
            installtheme.flags |= 2;
        }
        getConnectionsManager().sendRequest(installtheme, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                MessagesController.lambda$installTheme$117(tLObject, tL_error);
            }
        });
        if (TextUtils.isEmpty(str)) {
            return;
        }
        TL_account.installWallPaper installwallpaper = new TL_account.installWallPaper();
        TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
        tL_inputWallPaperSlug.slug = str;
        installwallpaper.wallpaper = tL_inputWallPaperSlug;
        TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
        installwallpaper.settings = tL_wallPaperSettings;
        tL_wallPaperSettings.blur = z2;
        tL_wallPaperSettings.motion = z3;
        getConnectionsManager().sendRequest(installwallpaper, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                MessagesController.lambda$installTheme$118(tLObject, tL_error);
            }
        });
    }

    public void saveThemeToServer(final Theme.ThemeInfo themeInfo, final Theme.ThemeAccent themeAccent) {
        String absolutePath;
        File pathToWallpaper;
        if (themeInfo == null) {
            return;
        }
        if (themeAccent != 0) {
            absolutePath = themeAccent.saveToFile().getAbsolutePath();
            pathToWallpaper = themeAccent.getPathToWallpaper();
        } else {
            absolutePath = themeInfo.pathToFile;
            pathToWallpaper = null;
        }
        final String str = absolutePath;
        final File file = pathToWallpaper;
        if (str == null || this.uploadingThemes.containsKey(str)) {
            return;
        }
        this.uploadingThemes.put(str, themeAccent != 0 ? themeAccent : themeInfo);
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$saveThemeToServer$120(str, file, themeAccent, themeInfo);
            }
        });
    }

    public void lambda$saveThemeToServer$120(final String str, File file, final Theme.ThemeAccent themeAccent, final Theme.ThemeInfo themeInfo) {
        final String strCreateThemePreviewImage = Theme.createThemePreviewImage(str, file != null ? file.getAbsolutePath() : null, themeAccent);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$saveThemeToServer$119(strCreateThemePreviewImage, str, themeAccent, themeInfo);
            }
        });
    }

    public void lambda$saveThemeToServer$119(String str, String str2, Theme.ThemeAccent themeAccent, Theme.ThemeInfo themeInfo) {
        if (str == null) {
            this.uploadingThemes.remove(str2);
            return;
        }
        this.uploadingThemes.put(str, themeAccent != null ? themeAccent : themeInfo);
        if (themeAccent == null) {
            themeInfo.uploadingFile = str2;
            themeInfo.uploadingThumb = str;
        } else {
            themeAccent.uploadingFile = str2;
            themeAccent.uploadingThumb = str;
        }
        getFileLoader().uploadFile(str2, false, true, 67108864);
        getFileLoader().uploadFile(str, false, true, 16777216);
    }

    public void saveWallpaperToServer(java.io.File r8, org.telegram.ui.ActionBar.Theme.OverrideWallpaperInfo r9, boolean r10, final long r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.saveWallpaperToServer(java.io.File, org.telegram.ui.ActionBar.Theme$OverrideWallpaperInfo, boolean, long):void");
    }

    public void lambda$saveWallpaperToServer$121(long j, TLObject tLObject, TLRPC.TL_error tL_error) {
        getMessagesStorage().removePendingTask(j);
    }

    public static TLRPC.TL_wallPaperSettings getWallpaperSetting(Theme.OverrideWallpaperInfo overrideWallpaperInfo) {
        TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
        tL_wallPaperSettings.blur = overrideWallpaperInfo.isBlurred;
        tL_wallPaperSettings.motion = overrideWallpaperInfo.isMotion;
        int i = overrideWallpaperInfo.color;
        if (i != 0) {
            tL_wallPaperSettings.background_color = i & 16777215;
            int i2 = tL_wallPaperSettings.flags;
            tL_wallPaperSettings.intensity = (int) (overrideWallpaperInfo.intensity * 100.0f);
            tL_wallPaperSettings.flags = i2 | 9;
        } else {
            float f = overrideWallpaperInfo.intensity;
            if (f > 0.0f) {
                tL_wallPaperSettings.intensity = (int) (f * 100.0f);
                tL_wallPaperSettings.flags |= 8;
            }
        }
        int i3 = overrideWallpaperInfo.gradientColor1;
        if (i3 != 0) {
            tL_wallPaperSettings.second_background_color = i3 & 16777215;
            tL_wallPaperSettings.rotation = AndroidUtilities.getWallpaperRotation(overrideWallpaperInfo.rotation, true);
            tL_wallPaperSettings.flags |= 16;
        }
        int i4 = overrideWallpaperInfo.gradientColor2;
        if (i4 != 0) {
            tL_wallPaperSettings.third_background_color = i4 & 16777215;
            tL_wallPaperSettings.flags |= 32;
        }
        int i5 = overrideWallpaperInfo.gradientColor3;
        if (i5 != 0) {
            tL_wallPaperSettings.fourth_background_color = i5 & 16777215;
            tL_wallPaperSettings.flags |= 64;
        }
        return tL_wallPaperSettings;
    }

    public static TLRPC.InputWallPaper getInputWallpaper(Theme.OverrideWallpaperInfo overrideWallpaperInfo) {
        if (overrideWallpaperInfo.wallpaperId > 0) {
            TLRPC.TL_inputWallPaper tL_inputWallPaper = new TLRPC.TL_inputWallPaper();
            tL_inputWallPaper.id = overrideWallpaperInfo.wallpaperId;
            tL_inputWallPaper.access_hash = overrideWallpaperInfo.accessHash;
            return tL_inputWallPaper;
        }
        TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
        tL_inputWallPaperSlug.slug = overrideWallpaperInfo.slug;
        return tL_inputWallPaperSlug;
    }

    public void markDialogMessageAsDeleted(long j, ArrayList<Integer> arrayList) {
        ArrayList arrayList2 = (ArrayList) this.dialogMessage.get(j);
        if (arrayList2 != null) {
            for (int i = 0; i < arrayList2.size(); i++) {
                MessageObject messageObject = (MessageObject) arrayList2.get(i);
                if (messageObject != null) {
                    int i2 = 0;
                    while (true) {
                        if (i2 < arrayList.size()) {
                            if (messageObject.getId() == arrayList.get(i2).intValue()) {
                                messageObject.deleted = true;
                                break;
                            }
                            i2++;
                        }
                    }
                }
            }
        }
    }

    public void deleteMessages(ArrayList<Integer> arrayList, ArrayList<Long> arrayList2, TLRPC.EncryptedChat encryptedChat, long j, int i, boolean z, int i2) {
        deleteMessages(arrayList, arrayList2, encryptedChat, j, z, i2, false, 0L, null, i);
    }

    public void deleteMessages(ArrayList<Integer> arrayList, ArrayList<Long> arrayList2, TLRPC.EncryptedChat encryptedChat, long j, int i, boolean z, int i2, boolean z2) {
        deleteMessages(arrayList, arrayList2, encryptedChat, j, z, i2, z2, 0L, null, i);
    }

    public void deleteMessages(ArrayList<Integer> arrayList, ArrayList<Long> arrayList2, TLRPC.EncryptedChat encryptedChat, long j, boolean z, int i, boolean z2, long j2, TLObject tLObject, int i2) {
        deleteMessages(arrayList, arrayList2, encryptedChat, j, z, i, z2, j2, tLObject, i2, false, 0);
    }

    public void deleteMessages(java.util.ArrayList<java.lang.Integer> r28, java.util.ArrayList<java.lang.Long> r29, org.telegram.tgnet.TLRPC.EncryptedChat r30, long r31, boolean r33, int r34, boolean r35, long r36, org.telegram.tgnet.TLObject r38, int r39, boolean r40, int r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.deleteMessages(java.util.ArrayList, java.util.ArrayList, org.telegram.tgnet.TLRPC$EncryptedChat, long, boolean, int, boolean, long, org.telegram.tgnet.TLObject, int, boolean, int):void");
    }

    public void lambda$deleteMessages$122(long j, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            processUpdates((TLRPC.Updates) tLObject, false);
        }
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
    }

    public void lambda$deleteMessages$123(long j, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            processUpdates((TLRPC.Updates) tLObject, false);
        }
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
    }

    public void lambda$deleteMessages$124(long j, long j2, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
            processNewChannelDifferenceParams(tL_messages_affectedMessages.pts, tL_messages_affectedMessages.pts_count, j);
        }
        if (j2 != 0) {
            getMessagesStorage().removePendingTask(j2);
        }
    }

    public void lambda$deleteMessages$125(long j, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
            processNewDifferenceParams(-1, tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
        }
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
    }

    public void unpinAllMessages(final TLRPC.Chat chat, final TLRPC.User user) {
        if (chat == null && user == null) {
            return;
        }
        TLRPC.TL_messages_unpinAllMessages tL_messages_unpinAllMessages = new TLRPC.TL_messages_unpinAllMessages();
        tL_messages_unpinAllMessages.peer = getInputPeer(chat != null ? -chat.id : user.id);
        getConnectionsManager().sendRequest(tL_messages_unpinAllMessages, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$unpinAllMessages$126(chat, user, tLObject, tL_error);
            }
        });
    }

    public void lambda$unpinAllMessages$126(TLRPC.Chat chat, TLRPC.User user, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
            if (ChatObject.isChannel(chat)) {
                processNewChannelDifferenceParams(tL_messages_affectedHistory.pts, tL_messages_affectedHistory.pts_count, chat.id);
            } else {
                processNewDifferenceParams(-1, tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
            }
            new ArrayList();
            getMessagesStorage().updatePinnedMessages(chat != null ? -chat.id : user.id, null, false, 0, 0, false, null);
        }
    }

    public void pinMessage(final TLRPC.Chat chat, final TLRPC.User user, final int i, final boolean z, boolean z2, boolean z3) {
        if (chat == null && user == null) {
            return;
        }
        TLRPC.TL_messages_updatePinnedMessage tL_messages_updatePinnedMessage = new TLRPC.TL_messages_updatePinnedMessage();
        tL_messages_updatePinnedMessage.peer = getInputPeer(chat != null ? -chat.id : user.id);
        tL_messages_updatePinnedMessage.id = i;
        tL_messages_updatePinnedMessage.unpin = z;
        tL_messages_updatePinnedMessage.silent = !z3;
        tL_messages_updatePinnedMessage.pm_oneside = z2;
        getConnectionsManager().sendRequest(tL_messages_updatePinnedMessage, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$pinMessage$127(i, chat, user, z, tLObject, tL_error);
            }
        });
    }

    public void lambda$pinMessage$127(int i, TLRPC.Chat chat, TLRPC.User user, boolean z, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(Integer.valueOf(i));
            getMessagesStorage().updatePinnedMessages(chat != null ? -chat.id : user.id, arrayList, !z, -1, 0, false, null);
            processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public void deleteUserChannelHistory(final TLRPC.Chat chat, final TLRPC.User user, final TLRPC.Chat chat2, int i) {
        long j;
        if (user != null) {
            j = user.id;
        } else {
            j = chat2 != null ? chat2.id : 0L;
        }
        if (i == 0) {
            getMessagesStorage().deleteUserChatHistory(-chat.id, j);
        }
        TLRPC.TL_channels_deleteParticipantHistory tL_channels_deleteParticipantHistory = new TLRPC.TL_channels_deleteParticipantHistory();
        tL_channels_deleteParticipantHistory.channel = getInputChannel(chat);
        tL_channels_deleteParticipantHistory.participant = user != null ? getInputPeer(user) : getInputPeer(chat2);
        getConnectionsManager().sendRequest(tL_channels_deleteParticipantHistory, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$deleteUserChannelHistory$128(chat, user, chat2, tLObject, tL_error);
            }
        });
    }

    public void lambda$deleteUserChannelHistory$128(TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
            int i = tL_messages_affectedHistory.offset;
            if (i > 0) {
                deleteUserChannelHistory(chat, user, chat2, i);
            }
            processNewChannelDifferenceParams(tL_messages_affectedHistory.pts, tL_messages_affectedHistory.pts_count, chat.id);
        }
    }

    public ArrayList<TLRPC.Dialog> getAllDialogs() {
        return this.allDialogs;
    }

    public void putDialogsEndReachedAfterRegistration() {
        this.dialogsEndReached.put(0, true);
        this.serverDialogsEndReached.put(0, true);
    }

    public boolean isDialogsEndReached(int i) {
        return this.dialogsEndReached.get(i);
    }

    public boolean isLoadingDialogs(int i) {
        return this.loadingDialogs.get(i);
    }

    public boolean isServerDialogsEndReached(int i) {
        return this.serverDialogsEndReached.get(i);
    }

    public boolean hasHiddenArchive() {
        return SharedConfig.archiveHidden && this.dialogs_dict.get(DialogObject.makeFolderDialogId(1)) != null;
    }

    public ArrayList<TLRPC.Dialog> getDialogs(int i) {
        ArrayList<TLRPC.Dialog> arrayList = this.dialogsByFolder.get(i);
        return arrayList == null ? new ArrayList<>() : arrayList;
    }

    public int getAllFoldersDialogsCount() {
        int size = 0;
        for (int i = 0; i < this.dialogsByFolder.size(); i++) {
            SparseArray<ArrayList<TLRPC.Dialog>> sparseArray = this.dialogsByFolder;
            ArrayList<TLRPC.Dialog> arrayList = sparseArray.get(sparseArray.keyAt(i));
            if (arrayList != null) {
                size += arrayList.size();
            }
        }
        return size;
    }

    public int getTotalDialogsCount() {
        ArrayList<TLRPC.Dialog> arrayList = this.dialogsByFolder.get(0);
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public void putAllNeededDraftDialogs() {
        LongSparseArray drafts = getMediaDataController().getDrafts();
        int size = drafts.size();
        for (int i = 0; i < size; i++) {
            TLRPC.DraftMessage draftMessage = (TLRPC.DraftMessage) ((LongSparseArray) drafts.valueAt(i)).get(0L);
            if (draftMessage != null) {
                putDraftDialogIfNeed(drafts.keyAt(i), draftMessage);
            }
        }
    }

    public void putDraftDialogIfNeed(long j, TLRPC.DraftMessage draftMessage) {
        if (this.dialogs_dict.indexOfKey(j) < 0) {
            if (!ChatObject.isMonoForum(this.currentAccount, j) || ChatObject.canManageMonoForum(this.currentAccount, j)) {
                MediaDataController mediaDataController = getMediaDataController();
                int size = this.allDialogs.size();
                if (size > 0) {
                    TLRPC.Dialog dialog = this.allDialogs.get(size - 1);
                    if (draftMessage.date < DialogObject.getLastMessageOrDraftDate(dialog, mediaDataController.getDraft(dialog.id, 0L))) {
                        return;
                    }
                }
                TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                tL_dialog.id = j;
                tL_dialog.draft = draftMessage;
                tL_dialog.folder_id = mediaDataController.getDraftFolderId(j);
                tL_dialog.flags = (j >= 0 || !ChatObject.isChannel(getChat(Long.valueOf(-j)))) ? 0 : 1;
                this.dialogs_dict.put(j, tL_dialog);
                this.allDialogs.add(tL_dialog);
                sortDialogs(null);
            }
        }
    }

    public void removeDraftDialogIfNeed(long j) {
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.dialogs_dict.get(j);
        if (dialog == null || dialog.top_message != 0) {
            return;
        }
        this.dialogs_dict.remove(dialog.id);
        this.allDialogs.remove(dialog);
    }

    private void removeDialog(TLRPC.Dialog dialog) {
        if (dialog == null) {
            return;
        }
        final long j = dialog.id;
        if (this.dialogsServerOnly.remove(dialog) && DialogObject.isChannel(dialog)) {
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$removeDialog$129(j);
                }
            });
        }
        this.allDialogs.remove(dialog);
        this.dialogsMyChannels.remove(dialog);
        this.dialogsMyGroups.remove(dialog);
        this.dialogsCanAddUsers.remove(dialog);
        this.dialogsChannelsOnly.remove(dialog);
        this.dialogsGroupsOnly.remove(dialog);
        this.dialogsUsersOnly.remove(dialog);
        this.dialogsForBlock.remove(dialog);
        this.dialogsForward.remove(dialog);
        int i = 0;
        while (true) {
            DialogFilter[] dialogFilterArr = this.selectedDialogFilter;
            if (i >= dialogFilterArr.length) {
                break;
            }
            DialogFilter dialogFilter = dialogFilterArr[i];
            if (dialogFilter != null) {
                dialogFilter.dialogs.remove(dialog);
                this.selectedDialogFilter[i].dialogsForward.remove(dialog);
            }
            i++;
        }
        this.dialogs_dict.remove(j);
        ArrayList<TLRPC.Dialog> arrayList = this.dialogsByFolder.get(dialog.folder_id);
        if (arrayList != null) {
            arrayList.remove(dialog);
        }
    }

    public void lambda$removeDialog$129(long j) {
        long j2 = -j;
        this.channelsPts.delete(j2);
        this.shortPollChannels.delete(j2);
        this.needShortPollChannels.delete(j2);
        this.shortPollOnlines.delete(j2);
        this.needShortPollOnlines.delete(j2);
    }

    public void hidePromoDialog() {
        if (this.promoDialog == null) {
            return;
        }
        TLRPC.TL_help_hidePromoData tL_help_hidePromoData = new TLRPC.TL_help_hidePromoData();
        tL_help_hidePromoData.peer = getInputPeer(this.promoDialog.id);
        getConnectionsManager().sendRequest(tL_help_hidePromoData, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                MessagesController.lambda$hidePromoDialog$130(tLObject, tL_error);
            }
        });
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$hidePromoDialog$131();
            }
        });
        removePromoDialog();
    }

    public void lambda$hidePromoDialog$131() {
        this.promoDialogId = 0L;
        this.proxyDialogAddress = null;
        this.nextPromoInfoCheckTime = getConnectionsManager().getCurrentTime() + 3600;
        getGlobalMainSettings().edit().putLong("proxy_dialog", this.promoDialogId).remove("proxyDialogAddress").putInt("nextPromoInfoCheckTime", this.nextPromoInfoCheckTime).commit();
    }

    public void deleteDialog(long j, int i) {
        deleteDialog(j, i, false);
    }

    public void deleteDialog(long j, int i, boolean z) {
        deleteDialog(j, 1, i, 0, z, null, 0L);
    }

    public void setDialogHistoryTTL(long j, int i) {
        TLRPC.UserFull userFull;
        TLRPC.TL_messages_setHistoryTTL tL_messages_setHistoryTTL = new TLRPC.TL_messages_setHistoryTTL();
        tL_messages_setHistoryTTL.peer = getInputPeer(j);
        tL_messages_setHistoryTTL.period = i;
        getConnectionsManager().sendRequest(tL_messages_setHistoryTTL, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$setDialogHistoryTTL$132(tLObject, tL_error);
            }
        });
        TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().dialogs_dict.get(j);
        if (dialog != null) {
            dialog.ttl_period = i;
        }
        getMessagesStorage().setDialogTtl(j, i);
        TLRPC.ChatFull chatFull = null;
        if (j > 0) {
            userFull = getUserFull(j);
            if (userFull != null) {
                userFull.ttl_period = i;
                userFull.flags |= 16384;
            }
        } else {
            TLRPC.ChatFull chatFull2 = getChatFull(-j);
            if (chatFull2 != null) {
                chatFull2.ttl_period = i;
                if (chatFull2 instanceof TLRPC.TL_channelFull) {
                    chatFull2.flags |= 16777216;
                } else {
                    chatFull2.flags |= 16384;
                }
            }
            chatFull = chatFull2;
            userFull = null;
        }
        if (chatFull == null) {
            if (userFull != null) {
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j), userFull);
            }
        } else {
            NotificationCenter notificationCenter = getNotificationCenter();
            int i2 = NotificationCenter.chatInfoDidLoad;
            Boolean bool = Boolean.FALSE;
            notificationCenter.lambda$postNotificationNameOnUIThread$1(i2, chatFull, 0, bool, bool);
        }
    }

    public void lambda$setDialogHistoryTTL$132(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public void setDialogsInTransaction(boolean z) {
        this.dialogsInTransaction = z;
        if (z) {
            return;
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, Boolean.TRUE);
    }

    protected void deleteDialog(final long r32, int r34, final int r35, int r36, final boolean r37, final org.telegram.tgnet.TLRPC.InputPeer r38, final long r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.deleteDialog(long, int, int, int, boolean, org.telegram.tgnet.TLRPC$InputPeer, long):void");
    }

    public void lambda$deleteDialog$133(long j, int i, boolean z, TLRPC.InputPeer inputPeer, long j2, int i2) {
        if (j == getUserConfig().getClientUserId()) {
            getSavedMessagesController().deleteAllDialogs();
        }
        deleteDialog(j, 2, i, Math.max(0, i2), z, inputPeer, j2);
        checkIfFolderEmpty(1);
    }

    public void lambda$deleteDialog$134(long j) {
        getNotificationsController().removeNotificationsForDialog(j);
    }

    public void lambda$deleteDialog$135(final long j) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$deleteDialog$134(j);
            }
        });
    }

    public void lambda$deleteDialog$136(long j, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
        if (tLObject != null) {
            processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public void lambda$deleteDialog$137(long j, long j2, int i, int i2, boolean z, TLRPC.InputPeer inputPeer, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
        if (tL_error == null) {
            TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
            if (tL_messages_affectedHistory.offset > 0) {
                deleteDialog(j2, 0, i, i2, z, inputPeer, 0L);
            }
            processNewDifferenceParams(-1, tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
            getMessagesStorage().onDeleteQueryComplete(j2);
        }
    }

    public void deleteSavedDialog(long j) {
        deleteSavedDialog(j, 0, null);
    }

    public void deleteSavedDialog(long j, TLRPC.InputPeer inputPeer) {
        deleteSavedDialog(j, 0, inputPeer);
    }

    protected void deleteSavedDialog(final long j, final int i, final TLRPC.InputPeer inputPeer) {
        final long peerDialogId = DialogObject.getPeerDialogId(inputPeer);
        final int[] iArr = {i};
        final Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$deleteSavedDialog$139(peerDialogId, j, inputPeer, i, iArr);
            }
        };
        if (iArr[0] <= 0 && peerDialogId == 0) {
            getMessagesStorage().getSavedDialogMaxMessageId(j, new MessagesStorage.IntCallback() {
                @Override
                public final void run(int i2) {
                    MessagesController.lambda$deleteSavedDialog$140(iArr, runnable, i2);
                }
            });
        } else {
            runnable.run();
        }
    }

    public void lambda$deleteSavedDialog$139(long j, final long j2, final TLRPC.InputPeer inputPeer, int i, final int[] iArr) {
        SavedMessagesController.SavedDialog savedDialog;
        if (j == 0) {
            getMessagesStorage().deleteSavedDialog(j2);
        }
        TLRPC.TL_messages_deleteSavedHistory tL_messages_deleteSavedHistory = new TLRPC.TL_messages_deleteSavedHistory();
        tL_messages_deleteSavedHistory.peer = getInputPeer(j2);
        tL_messages_deleteSavedHistory.parent_peer = inputPeer;
        if (i == 0 && j == 0) {
            int i2 = 0;
            while (true) {
                if (i2 >= getSavedMessagesController().allDialogs.size()) {
                    savedDialog = null;
                    break;
                } else {
                    if (getSavedMessagesController().allDialogs.get(i2).dialogId == j2) {
                        savedDialog = getSavedMessagesController().allDialogs.get(i2);
                        break;
                    }
                    i2++;
                }
            }
            if (savedDialog != null) {
                iArr[0] = Math.max(iArr[0], savedDialog.top_message_id);
                getSavedMessagesController().deleteDialog(j2);
            }
            int i3 = iArr[0];
            if (i3 <= 0) {
                i3 = Integer.MAX_VALUE;
            }
            tL_messages_deleteSavedHistory.max_id = i3;
        }
        getConnectionsManager().sendRequest(tL_messages_deleteSavedHistory, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$deleteSavedDialog$138(j2, iArr, inputPeer, tLObject, tL_error);
            }
        }, 64);
    }

    public void lambda$deleteSavedDialog$138(long j, int[] iArr, TLRPC.InputPeer inputPeer, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
            if (tL_messages_affectedHistory.offset > 0) {
                deleteSavedDialog(j, iArr[0], inputPeer);
            }
            processNewDifferenceParams(-1, tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
            getMessagesStorage().onDeleteQueryComplete(j);
        }
    }

    public static void lambda$deleteSavedDialog$140(int[] iArr, Runnable runnable, int i) {
        iArr[0] = i;
        runnable.run();
    }

    public void saveGif(final Object obj, TLRPC.Document document) {
        if (obj == null || !MessageObject.isGifDocument(document)) {
            return;
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
        tL_messages_saveGif.unsave = false;
        getConnectionsManager().sendRequest(tL_messages_saveGif, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$saveGif$141(obj, tL_messages_saveGif, tLObject, tL_error);
            }
        });
    }

    public void lambda$saveGif$141(Object obj, TLRPC.TL_messages_saveGif tL_messages_saveGif, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null || !FileRefController.isFileRefError(tL_error.text)) {
            return;
        }
        getFileRefController().requestReference(obj, tL_messages_saveGif);
    }

    public void saveRecentSticker(final Object obj, TLRPC.Document document, boolean z) {
        if (obj == null || document == null) {
            return;
        }
        final TLRPC.TL_messages_saveRecentSticker tL_messages_saveRecentSticker = new TLRPC.TL_messages_saveRecentSticker();
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_messages_saveRecentSticker.id = tL_inputDocument;
        tL_inputDocument.id = document.id;
        tL_inputDocument.access_hash = document.access_hash;
        byte[] bArr = document.file_reference;
        tL_inputDocument.file_reference = bArr;
        if (bArr == null) {
            tL_inputDocument.file_reference = new byte[0];
        }
        tL_messages_saveRecentSticker.unsave = false;
        tL_messages_saveRecentSticker.attached = z;
        getConnectionsManager().sendRequest(tL_messages_saveRecentSticker, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$saveRecentSticker$142(obj, tL_messages_saveRecentSticker, tLObject, tL_error);
            }
        });
    }

    public void lambda$saveRecentSticker$142(Object obj, TLRPC.TL_messages_saveRecentSticker tL_messages_saveRecentSticker, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null || !FileRefController.isFileRefError(tL_error.text)) {
            return;
        }
        getFileRefController().requestReference(obj, tL_messages_saveRecentSticker);
    }

    public void loadChannelParticipants(Long l) {
        loadChannelParticipants(l, null, 32);
    }

    public void loadChannelParticipants(final Long l, final Utilities.Callback<TLRPC.TL_channels_channelParticipants> callback, int i) {
        if (callback == null && (this.loadingFullParticipants.contains(l) || this.loadedFullParticipants.contains(l))) {
            return;
        }
        this.loadingFullParticipants.add(l);
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = getInputChannel(l.longValue());
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = i;
        getConnectionsManager().sendRequest(tL_channels_getParticipants, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$loadChannelParticipants$144(l, callback, tLObject, tL_error);
            }
        });
    }

    public void lambda$loadChannelParticipants$144(final Long l, final Utilities.Callback callback, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$loadChannelParticipants$143(tL_error, tLObject, l, callback);
            }
        });
    }

    public void lambda$loadChannelParticipants$143(TLRPC.TL_error tL_error, TLObject tLObject, Long l, Utilities.Callback callback) {
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            putUsers(tL_channels_channelParticipants.users, false);
            putChats(tL_channels_channelParticipants.chats, false);
            getMessagesStorage().putUsersAndChats(tL_channels_channelParticipants.users, tL_channels_channelParticipants.chats, true, true);
            getMessagesStorage().updateChannelUsers(l.longValue(), tL_channels_channelParticipants.participants);
            this.loadedFullParticipants.add(l);
        }
        this.loadingFullParticipants.remove(l);
        if (callback != null) {
            callback.run(tLObject instanceof TLRPC.TL_channels_channelParticipants ? (TLRPC.TL_channels_channelParticipants) tLObject : null);
        }
    }

    public void putChatFull(TLRPC.ChatFull chatFull) {
        this.fullChats.put(chatFull.id, chatFull);
        getTranslateController().updateDialogFull(-chatFull.id);
    }

    public void processChatInfo(final long j, final TLRPC.ChatFull chatFull, final ArrayList<TLRPC.User> arrayList, final boolean z, final boolean z2, final boolean z3, final ArrayList<Integer> arrayList2, final HashMap<Integer, MessageObject> map, final int i, final boolean z4) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$processChatInfo$145(z, j, z3, z2, chatFull, arrayList, arrayList2, map, i, z4);
            }
        });
    }

    public void lambda$processChatInfo$145(boolean z, long j, boolean z2, boolean z3, TLRPC.ChatFull chatFull, ArrayList arrayList, ArrayList arrayList2, HashMap map, int i, boolean z4) {
        if (z && j > 0 && !z2 && System.currentTimeMillis() - this.loadedFullChats.get(j, 0L) > 60000) {
            loadFullChat(j, 0, z3);
        }
        if (chatFull != null) {
            if (this.fullChats.get(j) == null) {
                this.fullChats.put(j, chatFull);
                getTranslateController().updateDialogFull(-j);
            }
            putUsers(arrayList, z);
            if (chatFull.stickerset != null) {
                getMediaDataController().getGroupStickerSetById(chatFull.stickerset);
            }
            if (chatFull.emojiset != null) {
                getMediaDataController().getGroupStickerSetById(chatFull.emojiset);
            }
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatInfoDidLoad, chatFull, 0, Boolean.valueOf(z2), Boolean.FALSE);
        }
        if (arrayList2 != null) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.pinnedInfoDidLoad, Long.valueOf(-j), arrayList2, map, Integer.valueOf(i), Boolean.valueOf(z4));
        }
    }

    public void loadUserInfo(TLRPC.User user, boolean z, int i) {
        loadUserInfo(user, z, i, 0);
    }

    public void loadUserInfo(TLRPC.User user, boolean z, int i, int i2) {
        getMessagesStorage().loadUserInfo(user, z, i, i2);
    }

    public void updateUsernameActiveness(TLObject tLObject, String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.objectsByUsernames.remove(str);
        if (z) {
            this.objectsByUsernames.put(str.toLowerCase(), tLObject);
        }
    }

    public void processUserInfo(final TLRPC.User user, final TLRPC.UserFull userFull, final boolean z, final boolean z2, final int i, final ArrayList<Integer> arrayList, final HashMap<Integer, MessageObject> map, final int i2, final boolean z3) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$processUserInfo$146(z, user, i, z2, userFull, arrayList, map, i2, z3);
            }
        });
    }

    public void lambda$processUserInfo$146(boolean z, TLRPC.User user, int i, boolean z2, TLRPC.UserFull userFull, ArrayList arrayList, HashMap map, int i2, boolean z3) {
        if (z && System.currentTimeMillis() - this.loadedFullUsers.get(user.id, 0L) > 60000) {
            loadFullUser(user, i, z2);
        }
        if (userFull != null) {
            if (this.fullUsers.get(user.id) == null) {
                this.fullUsers.put(user.id, userFull);
                getTranslateController().updateDialogFull(user.id);
                StarsController.getInstance(this.currentAccount).invalidateProfileGifts(userFull);
                int iIndexOfKey = this.blockePeers.indexOfKey(user.id);
                if (userFull.blocked) {
                    if (iIndexOfKey < 0) {
                        this.blockePeers.put(user.id, 1);
                        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.blockedUsersDidLoad, new Object[0]);
                    }
                } else if (iIndexOfKey >= 0) {
                    this.blockePeers.removeAt(iIndexOfKey);
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.blockedUsersDidLoad, new Object[0]);
                }
            }
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(user.id), userFull);
        }
        if (arrayList != null) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.pinnedInfoDidLoad, Long.valueOf(user.id), arrayList, map, Integer.valueOf(i2), Boolean.valueOf(z3));
        }
    }

    public void updateTimerProc() {
        int i;
        ArrayList arrayList;
        int i2;
        int i3;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i4 = 0;
        checkDeletingTask(false);
        checkReadTasks();
        if (getUserConfig().isClientActivated()) {
            if (!this.ignoreSetOnline && getConnectionsManager().getPauseTime() == 0 && ApplicationLoader.isScreenOn && !ApplicationLoader.mainInterfacePausedStageQueue) {
                if (ApplicationLoader.mainInterfacePausedStageQueueTime != 0 && Math.abs(ApplicationLoader.mainInterfacePausedStageQueueTime - System.currentTimeMillis()) > 1000 && this.statusSettingState != 1 && (this.lastStatusUpdateTime == 0 || Math.abs(System.currentTimeMillis() - this.lastStatusUpdateTime) >= 55000 || this.offlineSent)) {
                    this.statusSettingState = 1;
                    if (this.statusRequest != 0) {
                        getConnectionsManager().cancelRequest(this.statusRequest, true);
                    }
                    TL_account.updateStatus updatestatus = new TL_account.updateStatus();
                    updatestatus.offline = false;
                    this.statusRequest = getConnectionsManager().sendRequest(updatestatus, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            this.f$0.lambda$updateTimerProc$147(tLObject, tL_error);
                        }
                    });
                }
            } else if (this.statusSettingState != 2 && !this.offlineSent && Math.abs(System.currentTimeMillis() - getConnectionsManager().getPauseTime()) >= 2000) {
                this.statusSettingState = 2;
                if (this.statusRequest != 0) {
                    getConnectionsManager().cancelRequest(this.statusRequest, true);
                }
                TL_account.updateStatus updatestatus2 = new TL_account.updateStatus();
                updatestatus2.offline = true;
                this.statusRequest = getConnectionsManager().sendRequest(updatestatus2, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        this.f$0.lambda$updateTimerProc$148(tLObject, tL_error);
                    }
                });
            }
            if (this.updatesQueueChannels.size() != 0) {
                for (int i5 = 0; i5 < this.updatesQueueChannels.size(); i5++) {
                    long jKeyAt = this.updatesQueueChannels.keyAt(i5);
                    if (Math.abs(jCurrentTimeMillis - this.updatesStartWaitTimeChannels.valueAt(i5)) >= 1500) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("QUEUE CHANNEL " + jKeyAt + " UPDATES WAIT TIMEOUT - CHECK QUEUE");
                        }
                        processChannelsUpdatesQueue(jKeyAt, 0);
                    }
                }
            }
            for (int i6 = 0; i6 < 3; i6++) {
                if (getUpdatesStartTime(i6) != 0 && Math.abs(jCurrentTimeMillis - getUpdatesStartTime(i6)) >= 1500) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d(i6 + " QUEUE UPDATES WAIT TIMEOUT - CHECK QUEUE");
                    }
                    processUpdatesQueue(i6, 0);
                }
            }
        }
        final int currentTime = getConnectionsManager().getCurrentTime();
        if (Math.abs(System.currentTimeMillis() - this.lastViewsCheckTime) >= 5000) {
            this.lastViewsCheckTime = System.currentTimeMillis();
            if (this.channelViewsToSend.size() != 0) {
                int i7 = 0;
                while (i7 < this.channelViewsToSend.size()) {
                    final long jKeyAt2 = this.channelViewsToSend.keyAt(i7);
                    final TLRPC.TL_messages_getMessagesViews tL_messages_getMessagesViews = new TLRPC.TL_messages_getMessagesViews();
                    tL_messages_getMessagesViews.peer = getInputPeer(jKeyAt2);
                    tL_messages_getMessagesViews.id = (ArrayList) this.channelViewsToSend.valueAt(i7);
                    tL_messages_getMessagesViews.increment = i7 == 0;
                    getConnectionsManager().sendRequest(tL_messages_getMessagesViews, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            this.f$0.lambda$updateTimerProc$150(jKeyAt2, tL_messages_getMessagesViews, tLObject, tL_error);
                        }
                    });
                    i7++;
                }
                this.channelViewsToSend.clear();
            }
            if (this.pollsToCheckSize > 0) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$updateTimerProc$152(currentTime);
                    }
                });
            }
        }
        if (!this.onlinePrivacy.isEmpty()) {
            ArrayList arrayList2 = null;
            for (Map.Entry<Long, Integer> entry : this.onlinePrivacy.entrySet()) {
                if (entry.getValue().intValue() < currentTime - 30) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(entry.getKey());
                }
            }
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    this.onlinePrivacy.remove((Long) it.next());
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$updateTimerProc$153();
                    }
                });
            }
        }
        if (this.shortPollChannels.size() != 0) {
            int i8 = 0;
            while (i8 < this.shortPollChannels.size()) {
                long jKeyAt3 = this.shortPollChannels.keyAt(i8);
                if (this.shortPollChannels.valueAt(i8) < System.currentTimeMillis() / 1000) {
                    this.shortPollChannels.delete(jKeyAt3);
                    i8--;
                    if (this.needShortPollChannels.indexOfKey(jKeyAt3) >= 0) {
                        getChannelDifference(jKeyAt3);
                    }
                }
                i8++;
            }
        }
        if (this.shortPollOnlines.size() != 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() / 1000;
            int i9 = 0;
            while (i9 < this.shortPollOnlines.size()) {
                final long jKeyAt4 = this.shortPollOnlines.keyAt(i9);
                if (this.shortPollOnlines.valueAt(i9) < jElapsedRealtime) {
                    if (this.needShortPollChannels.indexOfKey(jKeyAt4) >= 0) {
                        this.shortPollOnlines.put(jKeyAt4, (int) (300 + jElapsedRealtime));
                    } else {
                        this.shortPollOnlines.delete(jKeyAt4);
                        i9--;
                    }
                    TLRPC.TL_messages_getOnlines tL_messages_getOnlines = new TLRPC.TL_messages_getOnlines();
                    tL_messages_getOnlines.peer = getInputPeer(-jKeyAt4);
                    getConnectionsManager().sendRequest(tL_messages_getOnlines, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            this.f$0.lambda$updateTimerProc$155(jKeyAt4, tLObject, tL_error);
                        }
                    });
                }
                i9++;
            }
        }
        if (this.printingUsers.isEmpty() && this.lastPrintingStringCount == this.printingUsers.size()) {
            i = 1;
        } else {
            ArrayList arrayList3 = new ArrayList(this.printingUsers.keySet());
            int i10 = 0;
            boolean z = false;
            while (i10 < arrayList3.size()) {
                Long l = (Long) arrayList3.get(i10);
                ConcurrentHashMap<Integer, ArrayList<PrintingUser>> concurrentHashMap = this.printingUsers.get(l);
                if (concurrentHashMap != null) {
                    ArrayList arrayList4 = new ArrayList(concurrentHashMap.keySet());
                    int i11 = 0;
                    while (i11 < arrayList4.size()) {
                        Integer num = (Integer) arrayList4.get(i11);
                        ArrayList<PrintingUser> arrayList5 = concurrentHashMap.get(num);
                        if (arrayList5 != null) {
                            while (i4 < arrayList5.size()) {
                                PrintingUser printingUser = arrayList5.get(i4);
                                Long l2 = l;
                                ArrayList arrayList6 = arrayList3;
                                int i12 = i10;
                                if (printingUser.lastTime + (printingUser.action instanceof TLRPC.TL_sendMessageGamePlayAction ? 30000 : 5900) < jCurrentTimeMillis) {
                                    arrayList5.remove(printingUser);
                                    i4--;
                                    i3 = 1;
                                    z = true;
                                } else {
                                    i3 = 1;
                                }
                                i4 += i3;
                                l = l2;
                                arrayList3 = arrayList6;
                                i10 = i12;
                            }
                        }
                        ArrayList arrayList7 = arrayList3;
                        int i13 = i10;
                        Long l3 = l;
                        if (arrayList5 == null || arrayList5.isEmpty()) {
                            concurrentHashMap.remove(num);
                            arrayList4.remove(i11);
                            i11--;
                        }
                        i11++;
                        l = l3;
                        arrayList3 = arrayList7;
                        i10 = i13;
                        i4 = 0;
                    }
                }
                ArrayList arrayList8 = arrayList3;
                int i14 = i10;
                Long l4 = l;
                if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
                    this.printingUsers.remove(l4);
                    arrayList = arrayList8;
                    arrayList.remove(i14);
                    i2 = i14 - 1;
                } else {
                    arrayList = arrayList8;
                    i2 = i14;
                }
                i10 = i2 + 1;
                arrayList3 = arrayList;
                i4 = 0;
            }
            i = 1;
            updatePrintingStrings();
            if (z) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$updateTimerProc$156();
                    }
                });
            }
        }
        if (Theme.selectedAutoNightType == i && Math.abs(jCurrentTimeMillis - lastThemeCheckTime) >= 60) {
            AndroidUtilities.runOnUIThread(this.themeCheckRunnable);
            lastThemeCheckTime = jCurrentTimeMillis;
        }
        if (getUserConfig().savedPasswordHash != null && Math.abs(jCurrentTimeMillis - lastPasswordCheckTime) >= 60) {
            AndroidUtilities.runOnUIThread(this.passwordCheckRunnable);
            lastPasswordCheckTime = jCurrentTimeMillis;
        }
        if (this.lastPushRegisterSendTime != 0 && Math.abs(SystemClock.elapsedRealtime() - this.lastPushRegisterSendTime) >= 10800000) {
            PushListenerController.sendRegistrationToServer(SharedConfig.pushType, SharedConfig.pushString);
        }
        getLocationController().update();
        lambda$checkPromoInfo$159(false);
        checkTosUpdate();
    }

    public void lambda$updateTimerProc$147(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            this.lastStatusUpdateTime = System.currentTimeMillis();
            this.offlineSent = false;
            this.statusSettingState = 0;
        } else {
            long j = this.lastStatusUpdateTime;
            if (j != 0) {
                this.lastStatusUpdateTime = j + 5000;
            }
        }
        this.statusRequest = 0;
    }

    public void lambda$updateTimerProc$148(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            this.offlineSent = true;
        } else {
            long j = this.lastStatusUpdateTime;
            if (j != 0) {
                this.lastStatusUpdateTime = j + 5000;
            }
        }
        this.statusRequest = 0;
    }

    public void lambda$updateTimerProc$150(long j, TLRPC.TL_messages_getMessagesViews tL_messages_getMessagesViews, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            final TLRPC.TL_messages_messageViews tL_messages_messageViews = (TLRPC.TL_messages_messageViews) tLObject;
            final LongSparseArray longSparseArray = new LongSparseArray();
            final LongSparseArray longSparseArray2 = new LongSparseArray();
            final LongSparseArray longSparseArray3 = new LongSparseArray();
            SparseIntArray sparseIntArray = (SparseIntArray) longSparseArray.get(j);
            SparseIntArray sparseIntArray2 = (SparseIntArray) longSparseArray2.get(j);
            SparseArray sparseArray = (SparseArray) longSparseArray3.get(j);
            for (int i = 0; i < tL_messages_getMessagesViews.id.size() && i < tL_messages_messageViews.views.size(); i++) {
                TLRPC.TL_messageViews tL_messageViews = tL_messages_messageViews.views.get(i);
                if ((1 & tL_messageViews.flags) != 0) {
                    if (sparseIntArray == null) {
                        sparseIntArray = new SparseIntArray();
                        longSparseArray.put(j, sparseIntArray);
                    }
                    sparseIntArray.put(tL_messages_getMessagesViews.id.get(i).intValue(), tL_messageViews.views);
                }
                if ((tL_messageViews.flags & 2) != 0) {
                    if (sparseIntArray2 == null) {
                        sparseIntArray2 = new SparseIntArray();
                        longSparseArray2.put(j, sparseIntArray2);
                    }
                    sparseIntArray2.put(tL_messages_getMessagesViews.id.get(i).intValue(), tL_messageViews.forwards);
                }
                if ((tL_messageViews.flags & 4) != 0) {
                    if (sparseArray == null) {
                        sparseArray = new SparseArray();
                        longSparseArray3.put(j, sparseArray);
                    }
                    sparseArray.put(tL_messages_getMessagesViews.id.get(i).intValue(), tL_messageViews.replies);
                }
            }
            getMessagesStorage().putUsersAndChats(tL_messages_messageViews.users, tL_messages_messageViews.chats, true, true);
            getMessagesStorage().putChannelViews(longSparseArray, longSparseArray2, longSparseArray3, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$updateTimerProc$149(tL_messages_messageViews, longSparseArray, longSparseArray2, longSparseArray3);
                }
            });
        }
    }

    public void lambda$updateTimerProc$149(TLRPC.TL_messages_messageViews tL_messages_messageViews, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, LongSparseArray longSparseArray3) {
        putUsers(tL_messages_messageViews.users, false);
        putChats(tL_messages_messageViews.chats, false);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateMessagesViews, longSparseArray, longSparseArray2, longSparseArray3, Boolean.FALSE);
    }

    public void lambda$updateTimerProc$152(int i) {
        int i2;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int size = this.pollsToCheck.size();
        int iMin = Integer.MAX_VALUE;
        int i3 = 0;
        while (i3 < size) {
            SparseArray sparseArray = (SparseArray) this.pollsToCheck.valueAt(i3);
            if (sparseArray != null) {
                int size2 = sparseArray.size();
                int i4 = 0;
                while (true) {
                    int i5 = 1000;
                    if (i4 >= size2) {
                        break;
                    }
                    MessageObject messageObject = (MessageObject) sparseArray.valueAt(i4);
                    TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media).poll;
                    int i6 = poll.close_date;
                    final boolean z = (i6 == 0 || poll.closed) ? false : true;
                    if (!z) {
                        i2 = i3;
                        i5 = 30000;
                    } else if (i6 <= i) {
                        i2 = i3;
                    } else {
                        iMin = Math.min(iMin, i6 - i);
                        i2 = i3;
                        i5 = 30000;
                    }
                    int i7 = size2;
                    if (Math.abs(jElapsedRealtime - messageObject.pollLastCheckTime) < i5) {
                        if (!messageObject.pollVisibleOnScreen && !z) {
                            sparseArray.remove(messageObject.getId());
                            size2 = i7 - 1;
                            i4--;
                        }
                        i4++;
                        i3 = i2;
                    } else {
                        messageObject.pollLastCheckTime = jElapsedRealtime;
                        TLRPC.TL_messages_getPollResults tL_messages_getPollResults = new TLRPC.TL_messages_getPollResults();
                        tL_messages_getPollResults.peer = getInputPeer(messageObject.getDialogId());
                        tL_messages_getPollResults.msg_id = messageObject.getId();
                        getConnectionsManager().sendRequest(tL_messages_getPollResults, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                this.f$0.lambda$updateTimerProc$151(z, tLObject, tL_error);
                            }
                        });
                    }
                    size2 = i7;
                    i4++;
                    i3 = i2;
                }
                int i8 = i3;
                if (iMin < 5) {
                    this.lastViewsCheckTime = Math.min(this.lastViewsCheckTime, System.currentTimeMillis() - ((5 - iMin) * 1000));
                }
                if (sparseArray.size() == 0) {
                    LongSparseArray longSparseArray = this.pollsToCheck;
                    longSparseArray.remove(longSparseArray.keyAt(i8));
                    size--;
                    i3 = i8 - 1;
                } else {
                    i3 = i8;
                }
            }
            i3++;
        }
        this.pollsToCheckSize = this.pollsToCheck.size();
    }

    public void lambda$updateTimerProc$151(boolean z, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Poll poll;
        if (tL_error == null) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            if (z) {
                for (int i = 0; i < updates.updates.size(); i++) {
                    TLRPC.Update update = updates.updates.get(i);
                    if ((update instanceof TLRPC.TL_updateMessagePoll) && (poll = ((TLRPC.TL_updateMessagePoll) update).poll) != null && !poll.closed) {
                        this.lastViewsCheckTime = System.currentTimeMillis() - 4000;
                    }
                }
            }
            processUpdates(updates, false);
        }
    }

    public void lambda$updateTimerProc$153() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_STATUS));
    }

    public void lambda$updateTimerProc$155(final long j, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            final TLRPC.TL_chatOnlines tL_chatOnlines = (TLRPC.TL_chatOnlines) tLObject;
            getMessagesStorage().updateChatOnlineCount(j, tL_chatOnlines.onlines);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$updateTimerProc$154(j, tL_chatOnlines);
                }
            });
        }
    }

    public void lambda$updateTimerProc$154(long j, TLRPC.TL_chatOnlines tL_chatOnlines) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatOnlineCountDidLoad, Long.valueOf(j), Integer.valueOf(tL_chatOnlines.onlines));
    }

    public void lambda$updateTimerProc$156() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_USER_PRINT));
    }

    private void checkTosUpdate() {
        if (this.nextTosCheckTime > getConnectionsManager().getCurrentTime() || this.checkingTosUpdate || !getUserConfig().isClientActivated()) {
            return;
        }
        this.checkingTosUpdate = true;
        getConnectionsManager().sendRequest(new TLRPC.TL_help_getTermsOfServiceUpdate(), new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$checkTosUpdate$158(tLObject, tL_error);
            }
        });
    }

    public void lambda$checkTosUpdate$158(TLObject tLObject, TLRPC.TL_error tL_error) {
        this.checkingTosUpdate = false;
        if (tLObject instanceof TLRPC.TL_help_termsOfServiceUpdateEmpty) {
            this.nextTosCheckTime = ((TLRPC.TL_help_termsOfServiceUpdateEmpty) tLObject).expires;
        } else if (tLObject instanceof TLRPC.TL_help_termsOfServiceUpdate) {
            final TLRPC.TL_help_termsOfServiceUpdate tL_help_termsOfServiceUpdate = (TLRPC.TL_help_termsOfServiceUpdate) tLObject;
            this.nextTosCheckTime = tL_help_termsOfServiceUpdate.expires;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$checkTosUpdate$157(tL_help_termsOfServiceUpdate);
                }
            });
        } else {
            this.nextTosCheckTime = getConnectionsManager().getCurrentTime() + 3600;
        }
        this.notificationsPreferences.edit().putInt("nextTosCheckTime", this.nextTosCheckTime).commit();
    }

    public void lambda$checkTosUpdate$157(TLRPC.TL_help_termsOfServiceUpdate tL_help_termsOfServiceUpdate) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 4, tL_help_termsOfServiceUpdate.terms_of_service);
    }

    public void checkPromoInfo(final boolean z) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$checkPromoInfo$159(z);
            }
        });
    }

    public void lambda$checkPromoInfo$159(boolean z) {
        String str;
        boolean z2 = false;
        if (z && this.checkingPromoInfo) {
            this.checkingPromoInfo = false;
        }
        if ((z || this.nextPromoInfoCheckTime <= getConnectionsManager().getCurrentTime()) && !this.checkingPromoInfo) {
            if (this.checkingPromoInfoRequestId != 0) {
                getConnectionsManager().cancelRequest(this.checkingPromoInfoRequestId, true);
                this.checkingPromoInfoRequestId = 0;
            }
            SharedPreferences globalMainSettings = getGlobalMainSettings();
            globalMainSettings.getBoolean("proxy_enabled", false);
            final String string = globalMainSettings.getString("proxy_ip", "");
            final String string2 = globalMainSettings.getString("proxy_secret", "");
            if (this.promoDialogId != 0 && this.promoDialogType == PROMO_TYPE_PROXY && (str = this.proxyDialogAddress) != null) {
                if (!str.equals(string + string2)) {
                    z2 = true;
                }
            }
            final int i = this.lastCheckPromoId + 1;
            this.lastCheckPromoId = i;
            this.checkingPromoInfo = true;
            this.checkingPromoInfoRequestId = getConnectionsManager().sendRequest(new TLRPC.TL_help_getPromoData(), new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$checkPromoInfoInternal$164(i, string, string2, tLObject, tL_error);
                }
            });
            if (z2) {
                this.promoDialogId = 0L;
                this.proxyDialogAddress = null;
                this.nextPromoInfoCheckTime = getConnectionsManager().getCurrentTime() + 3600;
                getGlobalMainSettings().edit().putLong("proxy_dialog", this.promoDialogId).remove("proxyDialogAddress").putInt("nextPromoInfoCheckTime", this.nextPromoInfoCheckTime).commit();
                AndroidUtilities.runOnUIThread(new MessagesController$$ExternalSyntheticLambda68(this));
            }
        }
    }

    public void lambda$checkPromoInfoInternal$164(final int r17, java.lang.String r18, java.lang.String r19, org.telegram.tgnet.TLObject r20, org.telegram.tgnet.TLRPC.TL_error r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$checkPromoInfoInternal$164(int, java.lang.String, java.lang.String, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    public void lambda$checkPromoInfoInternal$163(final long j, final TLRPC.TL_help_promoData tL_help_promoData, final int i) {
        this.lastCheckPromoInfoTime = getConnectionsManager().getCurrentTime();
        TLRPC.Dialog dialog = this.promoDialog;
        if (dialog != null && j != dialog.id) {
            removePromoDialog();
        }
        this.promoDialog = (TLRPC.Dialog) this.dialogs_dict.get(j);
        this.pendingSuggestions = new HashSet(tL_help_promoData.pending_suggestions);
        this.dismissedSuggestions = new HashSet(tL_help_promoData.dismissed_suggestions);
        this.customPendingSuggestion = tL_help_promoData.custom_pending_suggestion;
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
        SharedPreferences.Editor editorEdit = this.mainPreferences.edit();
        editorEdit.putStringSet("pendingSuggestions", this.pendingSuggestions);
        editorEdit.putStringSet("dismissedSuggestions", this.dismissedSuggestions);
        editorEdit.commit();
        if (this.promoDialog != null) {
            this.checkingPromoInfo = false;
            sortDialogs(null);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, Boolean.TRUE);
            return;
        }
        LongSparseArray longSparseArray = new LongSparseArray();
        LongSparseArray longSparseArray2 = new LongSparseArray();
        for (int i2 = 0; i2 < tL_help_promoData.users.size(); i2++) {
            TLRPC.User user = tL_help_promoData.users.get(i2);
            longSparseArray.put(user.id, user);
        }
        for (int i3 = 0; i3 < tL_help_promoData.chats.size(); i3++) {
            TLRPC.Chat chat = tL_help_promoData.chats.get(i3);
            longSparseArray2.put(chat.id, chat);
        }
        TLRPC.TL_messages_getPeerDialogs tL_messages_getPeerDialogs = new TLRPC.TL_messages_getPeerDialogs();
        TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
        TLRPC.Peer peer = tL_help_promoData.peer;
        if (peer == null) {
            TLRPC.Dialog dialog2 = this.promoDialog;
            if (dialog2 != null) {
                long j2 = dialog2.id;
                if (j2 < 0) {
                    TLRPC.Chat chat2 = getChat(Long.valueOf(-j2));
                    if (ChatObject.isNotInChat(chat2) || chat2.restricted) {
                        removeDialog(this.promoDialog);
                    }
                } else {
                    removeDialog(dialog2);
                }
                this.promoDialog = null;
                sortDialogs(null);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
                return;
            }
            return;
        }
        if (peer.user_id != 0) {
            TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
            tL_inputDialogPeer.peer = tL_inputPeerUser;
            long j3 = tL_help_promoData.peer.user_id;
            tL_inputPeerUser.user_id = j3;
            TLRPC.User user2 = (TLRPC.User) longSparseArray.get(j3);
            if (user2 != null) {
                tL_inputDialogPeer.peer.access_hash = user2.access_hash;
            }
        } else if (peer.chat_id != 0) {
            TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
            tL_inputDialogPeer.peer = tL_inputPeerChat;
            long j4 = tL_help_promoData.peer.chat_id;
            tL_inputPeerChat.chat_id = j4;
            TLRPC.Chat chat3 = (TLRPC.Chat) longSparseArray2.get(j4);
            if (chat3 != null) {
                tL_inputDialogPeer.peer.access_hash = chat3.access_hash;
            }
        } else {
            TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
            tL_inputDialogPeer.peer = tL_inputPeerChannel;
            long j5 = tL_help_promoData.peer.channel_id;
            tL_inputPeerChannel.channel_id = j5;
            TLRPC.Chat chat4 = (TLRPC.Chat) longSparseArray2.get(j5);
            if (chat4 != null) {
                tL_inputDialogPeer.peer.access_hash = chat4.access_hash;
            }
        }
        tL_messages_getPeerDialogs.peers.add(tL_inputDialogPeer);
        this.checkingPromoInfoRequestId = getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$checkPromoInfoInternal$162(i, tL_help_promoData, j, tLObject, tL_error);
            }
        });
    }

    public void lambda$checkPromoInfoInternal$162(int i, final TLRPC.TL_help_promoData tL_help_promoData, final long j, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (i != this.lastCheckPromoId) {
            return;
        }
        this.checkingPromoInfoRequestId = 0;
        final TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
        if (tL_messages_peerDialogs != null && !tL_messages_peerDialogs.dialogs.isEmpty()) {
            getMessagesStorage().putUsersAndChats(tL_help_promoData.users, tL_help_promoData.chats, true, true);
            TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
            tL_messages_dialogs.chats = tL_messages_peerDialogs.chats;
            tL_messages_dialogs.users = tL_messages_peerDialogs.users;
            tL_messages_dialogs.dialogs = tL_messages_peerDialogs.dialogs;
            tL_messages_dialogs.messages = tL_messages_peerDialogs.messages;
            getMessagesStorage().putDialogs(tL_messages_dialogs, 2);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$checkPromoInfoInternal$160(tL_help_promoData, tL_messages_peerDialogs, j);
                }
            });
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$checkPromoInfoInternal$161();
                }
            });
        }
        this.checkingPromoInfo = false;
    }

    public void lambda$checkPromoInfoInternal$160(TLRPC.TL_help_promoData tL_help_promoData, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, long j) {
        putUsers(tL_help_promoData.users, false);
        putChats(tL_help_promoData.chats, false);
        putUsers(tL_messages_peerDialogs.users, false);
        putChats(tL_messages_peerDialogs.chats, false);
        TLRPC.Dialog dialog = this.promoDialog;
        if (dialog != null) {
            long j2 = dialog.id;
            if (j2 < 0) {
                TLRPC.Chat chat = getChat(Long.valueOf(-j2));
                if (ChatObject.isNotInChat(chat) || chat.restricted) {
                    removeDialog(this.promoDialog);
                }
            } else {
                removeDialog(dialog);
            }
        }
        TLRPC.Dialog dialog2 = tL_messages_peerDialogs.dialogs.get(0);
        this.promoDialog = dialog2;
        dialog2.id = j;
        dialog2.folder_id = 0;
        if (DialogObject.isChannel(dialog2)) {
            LongSparseIntArray longSparseIntArray = this.channelsPts;
            TLRPC.Dialog dialog3 = this.promoDialog;
            longSparseIntArray.put(-dialog3.id, dialog3.pts);
        }
        Integer num = this.dialogs_read_inbox_max.get(Long.valueOf(this.promoDialog.id));
        if (num == null) {
            num = num;
        }
        this.dialogs_read_inbox_max.put(Long.valueOf(this.promoDialog.id), Integer.valueOf(Math.max(num.intValue(), this.promoDialog.read_inbox_max_id)));
        Integer num2 = this.dialogs_read_outbox_max.get(Long.valueOf(this.promoDialog.id));
        this.dialogs_read_outbox_max.put(Long.valueOf(this.promoDialog.id), Integer.valueOf(Math.max((num2 != null ? num2 : 0).intValue(), this.promoDialog.read_outbox_max_id)));
        this.dialogs_dict.put(j, this.promoDialog);
        if (!tL_messages_peerDialogs.messages.isEmpty()) {
            LongSparseArray longSparseArray = new LongSparseArray();
            LongSparseArray longSparseArray2 = new LongSparseArray();
            for (int i = 0; i < tL_messages_peerDialogs.users.size(); i++) {
                TLRPC.User user = tL_messages_peerDialogs.users.get(i);
                longSparseArray.put(user.id, user);
            }
            for (int i2 = 0; i2 < tL_messages_peerDialogs.chats.size(); i2++) {
                TLRPC.Chat chat2 = tL_messages_peerDialogs.chats.get(i2);
                longSparseArray2.put(chat2.id, chat2);
            }
            MessageObject messageObject = new MessageObject(this.currentAccount, tL_messages_peerDialogs.messages.get(0), longSparseArray, longSparseArray2, false, true);
            ArrayList arrayList = (ArrayList) this.dialogMessage.get(j);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
            }
            if (arrayList.size() > 0 && arrayList.get(0) != null && ((MessageObject) arrayList.get(0)).hasValidGroupId() && ((MessageObject) arrayList.get(0)).getGroupIdForUse() != messageObject.getGroupIdForUse()) {
                arrayList.clear();
            }
            arrayList.add(messageObject);
            this.dialogMessage.put(j, arrayList);
            TLRPC.Dialog dialog4 = this.promoDialog;
            if (dialog4.last_message_date == 0) {
                dialog4.last_message_date = messageObject.messageOwner.date;
            }
            getTranslateController().checkDialogMessage(j);
        }
        sortDialogs(null);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, Boolean.TRUE);
    }

    public void lambda$checkPromoInfoInternal$161() {
        TLRPC.Dialog dialog = this.promoDialog;
        if (dialog != null) {
            long j = dialog.id;
            if (j < 0) {
                TLRPC.Chat chat = getChat(Long.valueOf(-j));
                if (ChatObject.isNotInChat(chat) || chat.restricted) {
                    removeDialog(this.promoDialog);
                }
            } else {
                removeDialog(dialog);
            }
            this.promoDialog = null;
            sortDialogs(null);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
        }
    }

    public void removePromoDialog() {
        TLRPC.Dialog dialog = this.promoDialog;
        if (dialog == null) {
            return;
        }
        long j = dialog.id;
        if (j < 0) {
            TLRPC.Chat chat = getChat(Long.valueOf(-j));
            if (ChatObject.isNotInChat(chat) || chat.restricted) {
                removeDialog(this.promoDialog);
            }
        } else {
            removeDialog(dialog);
        }
        this.promoDialog = null;
        sortDialogs(null);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
    }

    public boolean isPromoDialog(long j, boolean z) {
        TLRPC.Dialog dialog = this.promoDialog;
        return dialog != null && dialog.id == j && (!z || this.isLeftPromoChannel);
    }

    private String getUserNameForTyping(TLRPC.User user) {
        if (user == null) {
            return "";
        }
        String str = user.first_name;
        if (str != null && str.length() > 0) {
            return AndroidUtilities.removeDiacritics(user.first_name);
        }
        String str2 = user.last_name;
        return (str2 == null || str2.length() <= 0) ? "" : AndroidUtilities.removeDiacritics(user.last_name);
    }

    private void updatePrintingStrings() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.updatePrintingStrings():void");
    }

    public void lambda$updatePrintingStrings$165(LongSparseArray longSparseArray, LongSparseArray longSparseArray2) {
        this.printingStrings = longSparseArray;
        this.printingStringsTypes = longSparseArray2;
    }

    public void lambda$sendTyping$168(int i, long j, long j2) {
        LongSparseArray longSparseArray;
        LongSparseArray longSparseArray2;
        if (i >= 0) {
            LongSparseArray[] longSparseArrayArr = this.sendingTypings;
            if (i >= longSparseArrayArr.length || (longSparseArray = longSparseArrayArr[i]) == null || (longSparseArray2 = (LongSparseArray) longSparseArray.get(j)) == null) {
                return;
            }
            longSparseArray2.remove(j2);
            if (longSparseArray2.size() == 0) {
                longSparseArray.remove(j);
            }
        }
    }

    public boolean sendTyping(long j, long j2, int i, int i2) {
        return sendTyping(j, j2, i, null, i2);
    }

    public boolean sendTyping(final long j, final long j2, final int i, String str, int i2) {
        TLRPC.Chat chat;
        if (i < 0 || i >= this.sendingTypings.length || j == 0) {
            return false;
        }
        long clientUserId = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
        if (j == clientUserId) {
            return false;
        }
        if (j < 0) {
            long j3 = -j;
            if (ChatObject.getSendAsPeerId(getChat(Long.valueOf(j3)), getChatFull(j3)) != clientUserId) {
                return false;
            }
        } else {
            TLRPC.User user = getUser(Long.valueOf(j));
            if (user != null) {
                if (user.id == getUserConfig().getClientUserId()) {
                    return false;
                }
                TLRPC.UserStatus userStatus = user.status;
                if (userStatus != null && userStatus.expires != -100 && !this.onlinePrivacy.containsKey(Long.valueOf(user.id))) {
                    if (user.status.expires <= getConnectionsManager().getCurrentTime() - 30) {
                        return false;
                    }
                }
            }
        }
        LongSparseArray[] longSparseArrayArr = this.sendingTypings;
        LongSparseArray longSparseArray = longSparseArrayArr[i];
        if (longSparseArray == null) {
            longSparseArray = new LongSparseArray();
            longSparseArrayArr[i] = longSparseArray;
        }
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(j);
        if (longSparseArray2 == null) {
            longSparseArray2 = new LongSparseArray();
            longSparseArray.put(j, longSparseArray2);
        }
        if (longSparseArray2.get(j2) != null) {
            return false;
        }
        if (!DialogObject.isEncryptedDialog(j)) {
            TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
            if (j2 != 0) {
                tL_messages_setTyping.top_msg_id = (int) j2;
                tL_messages_setTyping.flags |= 1;
            }
            TLRPC.InputPeer inputPeer = getInputPeer(j);
            tL_messages_setTyping.peer = inputPeer;
            if (((inputPeer instanceof TLRPC.TL_inputPeerChannel) && ((chat = getChat(Long.valueOf(inputPeer.channel_id))) == null || !chat.megagroup)) || tL_messages_setTyping.peer == null) {
                return false;
            }
            if (i == 0) {
                tL_messages_setTyping.action = new TLRPC.TL_sendMessageTypingAction();
            } else if (i == 1) {
                tL_messages_setTyping.action = new TLRPC.TL_sendMessageRecordAudioAction();
            } else if (i == 2) {
                tL_messages_setTyping.action = new TLRPC.TL_sendMessageCancelAction();
            } else if (i == 3) {
                tL_messages_setTyping.action = new TLRPC.TL_sendMessageUploadDocumentAction();
            } else if (i == 4) {
                tL_messages_setTyping.action = new TLRPC.TL_sendMessageUploadPhotoAction();
            } else if (i == 5) {
                tL_messages_setTyping.action = new TLRPC.TL_sendMessageUploadVideoAction();
            } else if (i == 6) {
                tL_messages_setTyping.action = new TLRPC.TL_sendMessageGamePlayAction();
            } else if (i == 7) {
                tL_messages_setTyping.action = new TLRPC.TL_sendMessageRecordRoundAction();
            } else if (i == 8) {
                tL_messages_setTyping.action = new TLRPC.TL_sendMessageUploadRoundAction();
            } else if (i == 9) {
                tL_messages_setTyping.action = new TLRPC.TL_sendMessageUploadAudioAction();
            } else if (i == 10) {
                tL_messages_setTyping.action = new TLRPC.TL_sendMessageChooseStickerAction();
            } else if (i == 11) {
                TLRPC.TL_sendMessageEmojiInteractionSeen tL_sendMessageEmojiInteractionSeen = new TLRPC.TL_sendMessageEmojiInteractionSeen();
                tL_sendMessageEmojiInteractionSeen.emoticon = str;
                tL_messages_setTyping.action = tL_sendMessageEmojiInteractionSeen;
            }
            longSparseArray2.put(j2, Boolean.TRUE);
            int iSendRequest = getConnectionsManager().sendRequest(tL_messages_setTyping, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$sendTyping$167(i, j, j2, tLObject, tL_error);
                }
            }, 2);
            if (i2 != 0) {
                getConnectionsManager().bindRequestToGuid(iSendRequest, i2);
            }
        } else {
            if (i != 0) {
                return false;
            }
            TLRPC.EncryptedChat encryptedChat = getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(j)));
            byte[] bArr = encryptedChat.auth_key;
            if (bArr != null && bArr.length > 1 && (encryptedChat instanceof TLRPC.TL_encryptedChat)) {
                TLRPC.TL_messages_setEncryptedTyping tL_messages_setEncryptedTyping = new TLRPC.TL_messages_setEncryptedTyping();
                TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat = new TLRPC.TL_inputEncryptedChat();
                tL_messages_setEncryptedTyping.peer = tL_inputEncryptedChat;
                tL_inputEncryptedChat.chat_id = encryptedChat.id;
                tL_inputEncryptedChat.access_hash = encryptedChat.access_hash;
                tL_messages_setEncryptedTyping.typing = true;
                longSparseArray2.put(j2, Boolean.TRUE);
                int iSendRequest2 = getConnectionsManager().sendRequest(tL_messages_setEncryptedTyping, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        this.f$0.lambda$sendTyping$169(i, j, j2, tLObject, tL_error);
                    }
                }, 2);
                if (i2 != 0) {
                    getConnectionsManager().bindRequestToGuid(iSendRequest2, i2);
                }
            }
        }
        return true;
    }

    public void lambda$sendTyping$167(final int i, final long j, final long j2, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$sendTyping$166(i, j, j2);
            }
        });
    }

    public void lambda$sendTyping$169(final int i, final long j, final long j2, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$sendTyping$168(i, j, j2);
            }
        });
    }

    protected void removeDeletedMessagesFromArray(long j, ArrayList<TLRPC.Message> arrayList) {
        int i = 0;
        int i2 = this.deletedHistory.get(j, 0);
        if (i2 == 0) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            if (arrayList.get(i).id <= i2) {
                arrayList.remove(i);
                i--;
                size--;
            }
            i++;
        }
    }

    public void loadMessages(long j, long j2, boolean z, int i, int i2, int i3, boolean z2, int i4, int i5, int i6, int i7, int i8, long j3, int i9, int i10, boolean z3) {
        loadMessages(j, j2, z, i, i2, i3, z2, i4, i5, i6, i7, i8, j3, i10, j3 != 0 ? i9 : 0, 0, 0, false, 0, z3);
    }

    public void loadMessages(long j, long j2, boolean z, int i, int i2, int i3, boolean z2, int i4, int i5, int i6, int i7, int i8, long j3, int i9, int i10, int i11, int i12, boolean z3, int i13, boolean z4) {
        loadMessagesInternal(j, j2, z, i, i2, i3, z2, i4, i5, i6, i7, i8, j3, i9, i10, i11, i12, z3, i13, true, true, z4, null, 0L);
    }

    public void loadMessagesInternal(final long j, final long j2, final boolean z, final int i, final int i2, final int i3, boolean z2, final int i4, final int i5, final int i6, final int i7, final int i8, final long j3, final int i9, final int i10, final int i11, final int i12, final boolean z3, final int i13, boolean z4, final boolean z5, final boolean z6, Timer timer, long j4) {
        Timer timer2;
        TLRPC.Chat chat;
        int i14;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("load messages in chat " + j + " topic_id " + j3 + " count " + i + " max_id " + i2 + " cache " + z2 + " mindate = " + i4 + " guid " + i5 + " load_type " + i6 + " last_message_id " + i7 + " mode " + i8 + " index " + i9 + " firstUnread " + i10 + " unread_count " + i11 + " last_date " + i12 + " queryFromServer " + z3 + " isTopic " + z6);
        }
        if (BuildVars.LOGS_ENABLED && timer == null && i8 == 0) {
            timer2 = new Timer("MessageLoaderLogger dialogId=" + j + " index=" + i9 + " count=" + i);
        } else {
            timer2 = timer;
        }
        if ((j3 == 0 || z6 || i8 == 8 || i8 == 3 || i8 == 5) && i8 != 2 && (z2 || DialogObject.isEncryptedDialog(j))) {
            getMessagesStorage().getMessages(j, j2, z, i, i2, i3, i4, i5, i6, i8, j3, i9, z5, z6, timer2);
            return;
        }
        TLRPC.Chat chat2 = j < 0 ? getChat(Long.valueOf(-j)) : null;
        if (i8 == 5) {
            TLRPC.TL_messages_getQuickReplyMessages tL_messages_getQuickReplyMessages = new TLRPC.TL_messages_getQuickReplyMessages();
            tL_messages_getQuickReplyMessages.shortcut_id = (int) j3;
            tL_messages_getQuickReplyMessages.hash = j4;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getQuickReplyMessages, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$loadMessagesInternal$170(j, j2, i, i2, i3, i5, i10, i7, i11, i12, i6, i8, j3, i9, z3, i13, z5, z6, tLObject, tL_error);
                }
            }), i5);
            return;
        }
        if (j3 == 0) {
            TLRPC.Chat chat3 = chat2;
            if (i8 == 2) {
                return;
            }
            if (i8 == 1) {
                TLRPC.TL_messages_getScheduledHistory tL_messages_getScheduledHistory = new TLRPC.TL_messages_getScheduledHistory();
                tL_messages_getScheduledHistory.peer = getInputPeer(j);
                tL_messages_getScheduledHistory.hash = j4;
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getScheduledHistory, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        this.f$0.lambda$loadMessagesInternal$175(i2, i3, j, j2, i, i5, i10, i7, i11, i12, i6, i8, j3, i9, z3, i13, z5, z6, tLObject, tL_error);
                    }
                }), i5);
                return;
            }
            if (!ChatObject.isMonoForum(chat3) && z4 && ((i6 == 3 || i6 == 2) && i7 == 0)) {
                final TLRPC.TL_messages_getPeerDialogs tL_messages_getPeerDialogs = new TLRPC.TL_messages_getPeerDialogs();
                TLRPC.InputPeer inputPeer = getInputPeer(j);
                TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                tL_inputDialogPeer.peer = inputPeer;
                tL_messages_getPeerDialogs.peers.add(tL_inputDialogPeer);
                getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        this.f$0.lambda$loadMessagesInternal$177(j, j2, z, i, i2, i3, i4, i5, i6, j3, i9, i10, i12, z3, z5, z6, tL_messages_getPeerDialogs, tLObject, tL_error);
                    }
                });
                return;
            }
            final TLRPC.TL_messages_getHistory tL_messages_getHistory = new TLRPC.TL_messages_getHistory();
            tL_messages_getHistory.peer = getInputPeer(j);
            if (i6 == 4) {
                tL_messages_getHistory.add_offset = (-i) + 5;
            } else if (i6 == 3) {
                tL_messages_getHistory.add_offset = (-i) / 2;
            } else if (i6 == 1) {
                tL_messages_getHistory.add_offset = (-i) - 1;
            } else if (i6 == 2 && i2 != 0) {
                tL_messages_getHistory.add_offset = (-i) + 6;
            } else if (j < 0 && i2 != 0 && ChatObject.isChannel(chat3)) {
                tL_messages_getHistory.add_offset = -1;
                tL_messages_getHistory.limit++;
            }
            tL_messages_getHistory.limit = i;
            tL_messages_getHistory.offset_id = i2;
            tL_messages_getHistory.offset_date = i3;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getHistory, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$loadMessagesInternal$179(j, i, i2, i3, j2, i5, i10, i7, i11, i12, i6, i8, j3, i9, z3, i13, z5, z6, tL_messages_getHistory, tLObject, tL_error);
                }
            }), i5);
            return;
        }
        if (i8 == 3 || ChatObject.isMonoForum(chat2)) {
            TLRPC.Chat chat4 = chat2;
            final TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = new TLRPC.TL_messages_getSavedHistory();
            tL_messages_getSavedHistory.peer = getInputPeer(j3);
            if (ChatObject.isMonoForum(chat4)) {
                tL_messages_getSavedHistory.parent_peer = getInputPeer(j);
            }
            if (i6 == 4) {
                tL_messages_getSavedHistory.add_offset = (-i) + 5;
            } else if (i6 == 3) {
                tL_messages_getSavedHistory.add_offset = (-i) / 2;
            } else if (i6 == 1) {
                tL_messages_getSavedHistory.add_offset = (-i) - 1;
            } else if (i6 == 2 && i2 != 0) {
                tL_messages_getSavedHistory.add_offset = (-i) + 6;
            } else if (j < 0 && i2 != 0 && ChatObject.isChannel(chat4)) {
                tL_messages_getSavedHistory.add_offset = -1;
                tL_messages_getSavedHistory.limit++;
            }
            tL_messages_getSavedHistory.limit = i;
            tL_messages_getSavedHistory.offset_id = i2;
            tL_messages_getSavedHistory.offset_date = i3;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getSavedHistory, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$loadMessagesInternal$172(j, i, i2, i3, j2, i5, i10, i7, i11, i12, i6, i8, j3, i9, z3, i13, z5, z6, tL_messages_getSavedHistory, tLObject, tL_error);
                }
            }), i5);
            return;
        }
        if (z4 && z6 && i6 == 2 && i7 == 0) {
            chat = chat2;
            TLRPC.TL_forumTopic tL_forumTopicFindTopic = this.topicsController.findTopic(-j, j3);
            if (tL_forumTopicFindTopic != null) {
                loadMessagesInternal(j, j2, z, i, i2, i3, false, i4, i5, i6, tL_forumTopicFindTopic.top_message, i8, j3, i9, i10, tL_forumTopicFindTopic.unread_count, i12, z3, tL_forumTopicFindTopic.unread_mentions_count, false, z5, z6, timer2, 0L);
                return;
            }
        } else {
            chat = chat2;
        }
        if (i8 != 0) {
            return;
        }
        final TLRPC.TL_messages_getReplies tL_messages_getReplies = new TLRPC.TL_messages_getReplies();
        tL_messages_getReplies.peer = getInputPeer(j);
        tL_messages_getReplies.msg_id = (int) j3;
        tL_messages_getReplies.offset_date = i3;
        if (i6 == 4) {
            i14 = i;
            tL_messages_getReplies.add_offset = (-i14) + 5;
        } else {
            i14 = i;
            if (i6 == 3) {
                tL_messages_getReplies.add_offset = (-i14) / 2;
            } else if (i6 == 1) {
                tL_messages_getReplies.add_offset = (-i14) - 1;
            } else if (i6 == 2 && i2 != 0) {
                tL_messages_getReplies.add_offset = (-i14) + 10;
            } else if (j < 0 && i2 != 0 && ChatObject.isChannel(chat)) {
                tL_messages_getReplies.add_offset = -1;
                tL_messages_getReplies.limit++;
            }
        }
        tL_messages_getReplies.limit = i14;
        tL_messages_getReplies.offset_id = i2;
        tL_messages_getReplies.hash = j4;
        System.currentTimeMillis();
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getReplies, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$loadMessagesInternal$174(i, i2, i3, i10, i6, j, j2, i5, i7, i11, i12, i8, j3, i9, z3, i13, z5, z6, tL_messages_getReplies, tLObject, tL_error);
            }
        }), i5);
    }

    public void lambda$loadMessagesInternal$170(long j, long j2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, long j3, int i11, boolean z, int i12, boolean z2, boolean z3, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            if (messages_messages instanceof TLRPC.TL_messages_messagesNotModified) {
                return;
            }
            processLoadedMessages(messages_messages, messages_messages.messages.size(), j, j2, i, i2, i3, false, i4, i5, i6, i7, i8, i9, false, i10, j3, i11, z, i12, z2, z3, null);
            return;
        }
        if (tL_error == null || !"SHORTCUT_INVALID".equals(tL_error.text)) {
            return;
        }
        processLoadedMessages(new TLRPC.TL_messages_messages(), 0, j, j2, i, i2, i3, false, i4, i5, i6, i7, i8, i9, false, i10, j3, i11, z, i12, z2, z3, null);
    }

    public void lambda$loadMessagesInternal$172(long j, int i, int i2, int i3, long j2, final int i4, int i5, int i6, int i7, int i8, int i9, int i10, long j3, int i11, boolean z, int i12, boolean z2, boolean z3, final TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory, TLObject tLObject, final TLRPC.TL_error tL_error) {
        int i13;
        if (tLObject != null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            removeDeletedMessagesFromArray(j, messages_messages.messages);
            if (messages_messages.messages.size() > i) {
                messages_messages.messages.remove(0);
            }
            if (i3 == 0 || messages_messages.messages.isEmpty()) {
                i13 = i2;
            } else {
                int i14 = messages_messages.messages.get(r0.size() - 1).id;
                int size = messages_messages.messages.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    TLRPC.Message message = messages_messages.messages.get(size);
                    if (message.date > i3) {
                        i14 = message.id;
                        break;
                    }
                    size--;
                }
                i13 = i14;
            }
            processLoadedMessages(messages_messages, messages_messages.messages.size(), j, j2, i, i13, i3, false, i4, i5, i6, i7, i8, i9, false, i10, j3, i11, z, i12, z2, z3, null);
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$loadMessagesInternal$171(i4, tL_messages_getSavedHistory, tL_error);
            }
        });
    }

    public void lambda$loadMessagesInternal$171(int i, TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory, TLRPC.TL_error tL_error) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.loadingMessagesFailed, Integer.valueOf(i), tL_messages_getSavedHistory, tL_error);
    }

    public void lambda$loadMessagesInternal$174(int r28, int r29, int r30, int r31, int r32, long r33, long r35, final int r37, int r38, int r39, int r40, int r41, long r42, int r44, boolean r45, int r46, boolean r47, boolean r48, final org.telegram.tgnet.TLRPC.TL_messages_getReplies r49, org.telegram.tgnet.TLObject r50, final org.telegram.tgnet.TLRPC.TL_error r51) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$loadMessagesInternal$174(int, int, int, int, int, long, long, int, int, int, int, int, long, int, boolean, int, boolean, boolean, org.telegram.tgnet.TLRPC$TL_messages_getReplies, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    public void lambda$loadMessagesInternal$173(int i, TLRPC.TL_messages_getReplies tL_messages_getReplies, TLRPC.TL_error tL_error) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.loadingMessagesFailed, Integer.valueOf(i), tL_messages_getReplies, tL_error);
    }

    public void lambda$loadMessagesInternal$175(int i, int i2, long j, long j2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, long j3, int i11, boolean z, int i12, boolean z2, boolean z3, TLObject tLObject, TLRPC.TL_error tL_error) {
        int i13;
        if (tLObject != null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            if (messages_messages instanceof TLRPC.TL_messages_messagesNotModified) {
                return;
            }
            if (i2 == 0 || messages_messages.messages.isEmpty()) {
                i13 = i;
            } else {
                int i14 = messages_messages.messages.get(r0.size() - 1).id;
                int size = messages_messages.messages.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    TLRPC.Message message = messages_messages.messages.get(size);
                    if (message.date > i2) {
                        i14 = message.id;
                        break;
                    }
                    size--;
                }
                i13 = i14;
            }
            processLoadedMessages(messages_messages, messages_messages.messages.size(), j, j2, i3, i13, i2, false, i4, i5, i6, i7, i8, i9, false, i10, j3, i11, z, i12, z2, z3, null);
        }
    }

    public void lambda$loadMessagesInternal$177(long j, long j2, boolean z, int i, int i2, int i3, int i4, final int i5, int i6, long j3, int i7, int i8, int i9, boolean z2, boolean z3, boolean z4, final TLRPC.TL_messages_getPeerDialogs tL_messages_getPeerDialogs, TLObject tLObject, final TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
            if (!tL_messages_peerDialogs.dialogs.isEmpty()) {
                TLRPC.Dialog dialog = tL_messages_peerDialogs.dialogs.get(0);
                if (dialog.top_message != 0) {
                    TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                    tL_messages_dialogs.chats = tL_messages_peerDialogs.chats;
                    tL_messages_dialogs.users = tL_messages_peerDialogs.users;
                    tL_messages_dialogs.dialogs = tL_messages_peerDialogs.dialogs;
                    tL_messages_dialogs.messages = tL_messages_peerDialogs.messages;
                    getMessagesStorage().putDialogs(tL_messages_dialogs, 2);
                }
                loadMessagesInternal(j, j2, z, i, i2, i3, false, i4, i5, i6, dialog.top_message, 0, j3, i7, i8, dialog.unread_count, i9, z2, dialog.unread_mentions_count, false, z3, z4, null, 0L);
            }
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$loadMessagesInternal$176(i5, tL_messages_getPeerDialogs, tL_error);
            }
        });
    }

    public void lambda$loadMessagesInternal$176(int i, TLRPC.TL_messages_getPeerDialogs tL_messages_getPeerDialogs, TLRPC.TL_error tL_error) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.loadingMessagesFailed, Integer.valueOf(i), tL_messages_getPeerDialogs, tL_error);
    }

    public void lambda$loadMessagesInternal$179(long j, int i, int i2, int i3, long j2, final int i4, int i5, int i6, int i7, int i8, int i9, int i10, long j3, int i11, boolean z, int i12, boolean z2, boolean z3, final TLRPC.TL_messages_getHistory tL_messages_getHistory, TLObject tLObject, final TLRPC.TL_error tL_error) {
        int i13;
        if (tLObject != null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            removeDeletedMessagesFromArray(j, messages_messages.messages);
            if (messages_messages.messages.size() > i) {
                messages_messages.messages.remove(0);
            }
            if (i3 == 0 || messages_messages.messages.isEmpty()) {
                i13 = i2;
            } else {
                int i14 = messages_messages.messages.get(r0.size() - 1).id;
                int size = messages_messages.messages.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    TLRPC.Message message = messages_messages.messages.get(size);
                    if (message.date > i3) {
                        i14 = message.id;
                        break;
                    }
                    size--;
                }
                i13 = i14;
            }
            processLoadedMessages(messages_messages, messages_messages.messages.size(), j, j2, i, i13, i3, false, i4, i5, i6, i7, i8, i9, false, i10, j3, i11, z, i12, z2, z3, null);
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$loadMessagesInternal$178(i4, tL_messages_getHistory, tL_error);
            }
        });
    }

    public void lambda$loadMessagesInternal$178(int i, TLRPC.TL_messages_getHistory tL_messages_getHistory, TLRPC.TL_error tL_error) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.loadingMessagesFailed, Integer.valueOf(i), tL_messages_getHistory, tL_error);
    }

    public void reloadWebPages(final long j, HashMap<String, ArrayList<MessageObject>> map, final int i) {
        HashMap<String, ArrayList<MessageObject>> map2;
        LongSparseArray longSparseArray;
        boolean z = i == 1;
        boolean z2 = i == 3;
        if (z) {
            map2 = this.reloadingScheduledWebpages;
            longSparseArray = this.reloadingScheduledWebpagesPending;
        } else if (z2) {
            map2 = this.reloadingSavedWebpages;
            longSparseArray = this.reloadingSavedWebpagesPending;
        } else {
            map2 = this.reloadingWebpages;
            longSparseArray = this.reloadingWebpagesPending;
        }
        final HashMap<String, ArrayList<MessageObject>> map3 = map2;
        final LongSparseArray longSparseArray2 = longSparseArray;
        for (Map.Entry<String, ArrayList<MessageObject>> entry : map.entrySet()) {
            final String key = entry.getKey();
            ArrayList<MessageObject> value = entry.getValue();
            ArrayList<MessageObject> arrayList = map3.get(key);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                map3.put(key, arrayList);
            }
            arrayList.addAll(value);
            TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
            getwebpagepreview.message = key;
            getConnectionsManager().sendRequest(getwebpagepreview, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$reloadWebPages$181(map3, key, longSparseArray2, j, i, tLObject, tL_error);
                }
            });
        }
    }

    public void lambda$reloadWebPages$181(final HashMap map, final String str, final LongSparseArray longSparseArray, final long j, final int i, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$reloadWebPages$180(map, str, tLObject, longSparseArray, j, i);
            }
        });
    }

    public void lambda$reloadWebPages$180(java.util.HashMap r16, java.lang.String r17, org.telegram.tgnet.TLObject r18, androidx.collection.LongSparseArray r19, long r20, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$reloadWebPages$180(java.util.HashMap, java.lang.String, org.telegram.tgnet.TLObject, androidx.collection.LongSparseArray, long, int):void");
    }

    public void processLoadedMessages(final org.telegram.tgnet.TLRPC.messages_Messages r36, final int r37, final long r38, final long r40, final int r42, final int r43, final int r44, final boolean r45, final int r46, final int r47, final int r48, final int r49, final int r50, final int r51, final boolean r52, final int r53, final long r54, final int r56, final boolean r57, final int r58, final boolean r59, final boolean r60, final org.telegram.messenger.Timer r61) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.processLoadedMessages(org.telegram.tgnet.TLRPC$messages_Messages, int, long, long, int, int, int, boolean, int, int, int, int, int, int, boolean, int, long, int, boolean, int, boolean, boolean, org.telegram.messenger.Timer):void");
    }

    public void lambda$processLoadedMessages$182(long j, long j2, int i, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, long j3, int i9, int i10, int i11, int i12, boolean z2, boolean z3, Timer timer, long j4) {
        loadMessagesInternal(j, j2, false, i, (i2 == 2 && z) ? i3 : i4, i5, false, 0, i6, i2, i7, i8, j3, i9, i3, i10, i11, z, i12, true, z2, z3, timer, j4);
    }

    public void lambda$processLoadedMessages$183(int i, TLRPC.messages_Messages messages_messages, boolean z, boolean z2, int i2) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesDidLoadWithoutProcess, Integer.valueOf(i), Integer.valueOf(messages_messages.messages.size()), Boolean.valueOf(z), Boolean.valueOf(z2), Integer.valueOf(i2));
    }

    public static int lambda$processLoadedMessages$184(MessageObject messageObject, MessageObject messageObject2) {
        int id;
        int id2;
        if (messageObject.messageOwner.date == messageObject2.messageOwner.date && messageObject.getId() >= 0 && messageObject2.getId() >= 0) {
            id = messageObject2.getId();
            id2 = messageObject.getId();
        } else {
            id = messageObject2.messageOwner.date;
            id2 = messageObject.messageOwner.date;
        }
        return id - id2;
    }

    public static int lambda$processLoadedMessages$185(MessageObject messageObject, MessageObject messageObject2) {
        return messageObject2.getId() - messageObject.getId();
    }

    public void lambda$processLoadedMessages$187(Timer.Task task, Timer timer, TLRPC.messages_Messages messages_messages, final boolean z, final boolean z2, final int i, boolean z3, final int i2, int i3, final int i4, final long j, final ArrayList arrayList, long j2, final int i5, final int i6, final boolean z4, final int i7, final int i8, final int i9, final int i10, final int i11, final int i12, ArrayList arrayList2, HashMap map) {
        int i13;
        int i14;
        int i15;
        int i16;
        MessagesController messagesController;
        int i17;
        long j3;
        Timer.done(task);
        Timer.Task taskStart = Timer.start(timer, "processLoadedMessages: post runOnUIThread");
        putUsers(messages_messages.users, z);
        putChats(messages_messages.chats, z);
        if (messages_messages.animatedEmoji != null && z2) {
            AnimatedEmojiDrawable.getDocumentFetcher(this.currentAccount).processDocuments(messages_messages.animatedEmoji);
        }
        if (i == 1) {
            i15 = 0;
        } else {
            if (z3 && i2 == 2) {
                i14 = Integer.MAX_VALUE;
                for (int i18 = 0; i18 < messages_messages.messages.size(); i18++) {
                    TLRPC.Message message = messages_messages.messages.get(i18);
                    if ((!message.out || message.from_scheduled) && (i16 = message.id) > i3 && i16 < i14) {
                        i14 = i16;
                    }
                }
                i13 = i3;
            } else {
                i13 = i3;
                i14 = Integer.MAX_VALUE;
            }
            i15 = i14 == Integer.MAX_VALUE ? i13 : i14;
        }
        if (i == 1 && i4 == 1) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.scheduledMessagesUpdated, Long.valueOf(j), Integer.valueOf(arrayList.size()), Boolean.FALSE);
        }
        if (!DialogObject.isEncryptedDialog(j) && i != 5) {
            final Timer.Task taskStart2 = Timer.start(timer, "loadReplyMessagesForMessages");
            final int i19 = i15;
            getMediaDataController().loadReplyMessagesForMessages(arrayList, j, i, j2, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$processLoadedMessages$186(taskStart2, z2, i5, i6, z, z4, i7, j, i4, arrayList, i19, i8, i9, i2, i10, i11, i12, i);
                }
            }, i5, timer);
        } else {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesDidLoad, Long.valueOf(j), Integer.valueOf(i4), arrayList, Boolean.valueOf(z), Integer.valueOf(i15), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i2), Boolean.valueOf(z4), Integer.valueOf(i5), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i));
        }
        if (arrayList2.isEmpty()) {
            messagesController = this;
            i17 = i;
            j3 = j;
        } else {
            messagesController = this;
            i17 = i;
            j3 = j;
            messagesController.reloadMessages(arrayList2, j3, i17);
        }
        if (!map.isEmpty()) {
            messagesController.reloadWebPages(j3, map, i17);
        }
        Timer.done(taskStart);
        Timer.finish(timer);
    }

    public void lambda$processLoadedMessages$186(Timer.Task task, boolean z, int i, int i2, boolean z2, boolean z3, int i3, long j, int i4, ArrayList arrayList, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        Timer.done(task);
        if (!z) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesDidLoadWithoutProcess, Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z2), Boolean.valueOf(z3), Integer.valueOf(i3));
        } else {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesDidLoad, Long.valueOf(j), Integer.valueOf(i4), arrayList, Boolean.valueOf(z2), Integer.valueOf(i5), Integer.valueOf(i3), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Boolean.valueOf(z3), Integer.valueOf(i), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        }
    }

    public void forceNoReload(long j, int i) {
        if (i == 1) {
            this.lastScheduledServerQueryTime.put(j, Long.valueOf(SystemClock.elapsedRealtime()));
        } else if (i == 0) {
            this.lastServerQueryTime.put(j, Long.valueOf(SystemClock.elapsedRealtime()));
        }
    }

    public void loadHintDialogs() {
        if (!this.hintDialogs.isEmpty() || TextUtils.isEmpty(this.installReferer)) {
            return;
        }
        TLRPC.TL_help_getRecentMeUrls tL_help_getRecentMeUrls = new TLRPC.TL_help_getRecentMeUrls();
        tL_help_getRecentMeUrls.referer = this.installReferer;
        getConnectionsManager().sendRequest(tL_help_getRecentMeUrls, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$loadHintDialogs$189(tLObject, tL_error);
            }
        });
    }

    public void lambda$loadHintDialogs$189(final TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$loadHintDialogs$188(tLObject);
                }
            });
        }
    }

    public void lambda$loadHintDialogs$188(TLObject tLObject) {
        TLRPC.TL_help_recentMeUrls tL_help_recentMeUrls = (TLRPC.TL_help_recentMeUrls) tLObject;
        putUsers(tL_help_recentMeUrls.users, false);
        putChats(tL_help_recentMeUrls.chats, false);
        this.hintDialogs.clear();
        this.hintDialogs.addAll(tL_help_recentMeUrls.urls);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
    }

    public TLRPC.TL_dialogFolder ensureFolderDialogExists(int i, boolean[] zArr) {
        if (i == 0) {
            return null;
        }
        long jMakeFolderDialogId = DialogObject.makeFolderDialogId(i);
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.dialogs_dict.get(jMakeFolderDialogId);
        if (dialog instanceof TLRPC.TL_dialogFolder) {
            if (zArr != null) {
                zArr[0] = false;
            }
            return (TLRPC.TL_dialogFolder) dialog;
        }
        if (zArr != null) {
            zArr[0] = true;
        }
        TLRPC.TL_dialogFolder tL_dialogFolder = new TLRPC.TL_dialogFolder();
        tL_dialogFolder.id = jMakeFolderDialogId;
        tL_dialogFolder.peer = new TLRPC.TL_peerUser();
        TLRPC.TL_folder tL_folder = new TLRPC.TL_folder();
        tL_dialogFolder.folder = tL_folder;
        tL_folder.id = i;
        tL_folder.title = LocaleController.getString(R.string.ArchivedChats);
        tL_dialogFolder.pinned = true;
        int iMax = 0;
        for (int i2 = 0; i2 < this.allDialogs.size(); i2++) {
            TLRPC.Dialog dialog2 = this.allDialogs.get(i2);
            if (!dialog2.pinned) {
                if (dialog2.id != this.promoDialogId) {
                    break;
                }
            } else {
                iMax = Math.max(dialog2.pinnedNum, iMax);
            }
        }
        tL_dialogFolder.pinnedNum = iMax + 1;
        TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
        tL_messages_dialogs.dialogs.add(tL_dialogFolder);
        getMessagesStorage().putDialogs(tL_messages_dialogs, 1);
        this.dialogs_dict.put(jMakeFolderDialogId, tL_dialogFolder);
        this.allDialogs.add(0, tL_dialogFolder);
        return tL_dialogFolder;
    }

    private void removeFolder(int i) {
        long jMakeFolderDialogId = DialogObject.makeFolderDialogId(i);
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.dialogs_dict.get(jMakeFolderDialogId);
        if (dialog == null) {
            return;
        }
        this.dialogs_dict.remove(jMakeFolderDialogId);
        this.allDialogs.remove(dialog);
        sortDialogs(null);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.folderBecomeEmpty, Integer.valueOf(i));
    }

    protected void onFolderEmpty(final int i) {
        if (getUserConfig().getDialogLoadOffsets(i)[0] != 2147483647L) {
            loadDialogs(i, 0, 10, false, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onFolderEmpty$190(i);
                }
            });
        } else if (i == 1) {
            this.hasArchivedChats = false;
            checkArchiveFolder();
        } else {
            removeFolder(i);
        }
    }

    public void lambda$onFolderEmpty$190(int i) {
        if (i == 1) {
            this.hasArchivedChats = false;
            checkArchiveFolder();
        } else {
            removeFolder(i);
        }
    }

    public void checkArchiveFolder() {
        if (!this.hasArchivedChats && !getStoriesController().hasHiddenStories()) {
            removeFolder(1);
        } else {
            boolean[] zArr = {false};
            ensureFolderDialogExists(1, zArr);
            if (zArr[0]) {
                sortDialogs(null);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
            }
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, 0);
    }

    public void checkIfFolderEmpty(int i) {
        if (i == 0) {
            return;
        }
        getMessagesStorage().checkIfFolderEmpty(i);
    }

    public int addDialogToFolder(long j, int i, int i2, long j2) {
        ArrayList<Long> arrayList = new ArrayList<>(1);
        arrayList.add(Long.valueOf(j));
        return addDialogToFolder(arrayList, i, i2, null, j2);
    }

    public int addDialogToFolder(java.util.ArrayList<java.lang.Long> r22, int r23, int r24, java.util.ArrayList<org.telegram.tgnet.TLRPC.TL_inputFolderPeer> r25, long r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.addDialogToFolder(java.util.ArrayList, int, int, java.util.ArrayList, long):int");
    }

    public void lambda$addDialogToFolder$191(long j, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            processUpdates((TLRPC.Updates) tLObject, false);
        }
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
    }

    public void loadDialogs(int i, int i2, int i3, boolean z) {
        loadDialogs(i, i2, i3, z, null);
    }

    public void loadDialogs(final int r17, int r18, final int r19, boolean r20, final java.lang.Runnable r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.loadDialogs(int, int, int, boolean, java.lang.Runnable):void");
    }

    public void lambda$loadDialogs$192(int i, int i2, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.messages_Dialogs messages_dialogs = (TLRPC.messages_Dialogs) tLObject;
            processLoadedDialogs(messages_dialogs, null, null, i, 0, i2, 0, false, false, false);
            if (runnable == null || !messages_dialogs.dialogs.isEmpty()) {
                return;
            }
            AndroidUtilities.runOnUIThread(runnable);
        }
    }

    public void loadGlobalNotificationsSettings() {
        SharedPreferences.Editor editorEdit;
        if (this.loadingNotificationSettings == 0 && !getUserConfig().notificationsSettingsLoaded) {
            SharedPreferences notificationsSettings = getNotificationsSettings(this.currentAccount);
            if (notificationsSettings.contains("EnableGroup")) {
                boolean z = notificationsSettings.getBoolean("EnableGroup", true);
                editorEdit = notificationsSettings.edit();
                if (!z) {
                    editorEdit.putInt("EnableGroup2", Integer.MAX_VALUE);
                    editorEdit.putInt("EnableChannel2", Integer.MAX_VALUE);
                }
                editorEdit.remove("EnableGroup").commit();
            } else {
                editorEdit = null;
            }
            if (notificationsSettings.contains("EnableAll")) {
                boolean z2 = notificationsSettings.getBoolean("EnableAll", true);
                if (editorEdit == null) {
                    editorEdit = notificationsSettings.edit();
                }
                if (!z2) {
                    editorEdit.putInt("EnableAll2", Integer.MAX_VALUE);
                }
                editorEdit.remove("EnableAll").commit();
            }
            if (editorEdit != null) {
                editorEdit.commit();
            }
            this.loadingNotificationSettings = 4;
            for (final int i = 0; i < 3; i++) {
                TL_account.getNotifySettings getnotifysettings = new TL_account.getNotifySettings();
                if (i == 0) {
                    getnotifysettings.peer = new TLRPC.TL_inputNotifyChats();
                } else if (i == 1) {
                    getnotifysettings.peer = new TLRPC.TL_inputNotifyUsers();
                } else {
                    getnotifysettings.peer = new TLRPC.TL_inputNotifyBroadcasts();
                }
                getConnectionsManager().sendRequest(getnotifysettings, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        this.f$0.lambda$loadGlobalNotificationsSettings$194(i, tLObject, tL_error);
                    }
                });
            }
            getConnectionsManager().sendRequest(new TL_account.getReactionsNotifySettings(), new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$loadGlobalNotificationsSettings$196(tLObject, tL_error);
                }
            });
        }
        if (getUserConfig().notificationsSignUpSettingsLoaded) {
            return;
        }
        loadSignUpNotificationsSettings();
    }

    public void lambda$loadGlobalNotificationsSettings$194(final int i, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$loadGlobalNotificationsSettings$193(tLObject, i);
            }
        });
    }

    public void lambda$loadGlobalNotificationsSettings$193(TLObject tLObject, int i) {
        if (tLObject != null) {
            this.loadingNotificationSettings--;
            TLRPC.TL_peerNotifySettings tL_peerNotifySettings = (TLRPC.TL_peerNotifySettings) tLObject;
            SharedPreferences.Editor editorEdit = this.notificationsPreferences.edit();
            if (i == 0) {
                if ((tL_peerNotifySettings.flags & 1) != 0) {
                    editorEdit.putBoolean("EnablePreviewGroup", tL_peerNotifySettings.show_previews);
                }
                if ((tL_peerNotifySettings.flags & 4) != 0) {
                    editorEdit.putInt("EnableGroup2", tL_peerNotifySettings.mute_until);
                }
            } else if (i == 1) {
                if ((tL_peerNotifySettings.flags & 1) != 0) {
                    editorEdit.putBoolean("EnablePreviewAll", tL_peerNotifySettings.show_previews);
                }
                if ((tL_peerNotifySettings.flags & 64) != 0) {
                    editorEdit.putBoolean("EnableAllStories", !tL_peerNotifySettings.stories_muted);
                }
                if ((tL_peerNotifySettings.flags & 128) != 0) {
                    editorEdit.putBoolean("EnableHideStoriesSenders", tL_peerNotifySettings.stories_hide_sender);
                }
                if ((tL_peerNotifySettings.flags & 4) != 0) {
                    editorEdit.putInt("EnableAll2", tL_peerNotifySettings.mute_until);
                }
                if ((tL_peerNotifySettings.flags & 64) != 0) {
                    editorEdit.putBoolean("EnableAllStories", !tL_peerNotifySettings.stories_muted);
                }
            } else {
                if ((tL_peerNotifySettings.flags & 1) != 0) {
                    editorEdit.putBoolean("EnablePreviewChannel", tL_peerNotifySettings.show_previews);
                }
                if ((tL_peerNotifySettings.flags & 4) != 0) {
                    editorEdit.putInt("EnableChannel2", tL_peerNotifySettings.mute_until);
                }
            }
            getNotificationsController().getNotificationsSettingsFacade().applySoundSettings(tL_peerNotifySettings.android_sound, editorEdit, 0L, 0L, i, false);
            editorEdit.apply();
            if (this.loadingNotificationSettings == 0) {
                getUserConfig().notificationsSettingsLoaded = true;
                getUserConfig().saveConfig(false);
            }
        }
    }

    public void lambda$loadGlobalNotificationsSettings$196(final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$loadGlobalNotificationsSettings$195(tLObject);
            }
        });
    }

    public void lambda$loadGlobalNotificationsSettings$195(TLObject tLObject) {
        this.loadingNotificationSettings--;
        if (tLObject instanceof TL_account.TL_reactionsNotifySettings) {
            TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject;
            SharedPreferences.Editor editorEdit = this.notificationsPreferences.edit();
            editorEdit.putBoolean("EnableReactionsMessages", tL_reactionsNotifySettings.messages_notify_from != null);
            TL_account.ReactionNotificationsFrom reactionNotificationsFrom = tL_reactionsNotifySettings.messages_notify_from;
            if (reactionNotificationsFrom != null) {
                editorEdit.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom instanceof TL_account.TL_reactionNotificationsFromContacts);
            }
            editorEdit.putBoolean("EnableReactionsStories", tL_reactionsNotifySettings.stories_notify_from != null);
            TL_account.ReactionNotificationsFrom reactionNotificationsFrom2 = tL_reactionsNotifySettings.stories_notify_from;
            if (reactionNotificationsFrom2 != null) {
                editorEdit.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom2 instanceof TL_account.TL_reactionNotificationsFromContacts);
            }
            editorEdit.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings.show_previews);
            getNotificationsController().getNotificationsSettingsFacade().applySoundSettings(tL_reactionsNotifySettings.sound, editorEdit, 0L, 0L, 4, false);
            editorEdit.apply();
        }
        if (this.loadingNotificationSettings == 0) {
            getUserConfig().notificationsSettingsLoaded = true;
            getUserConfig().saveConfig(false);
        }
    }

    public void lambda$reloadReactionsNotifySettings$198(final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$reloadReactionsNotifySettings$197(tLObject);
            }
        });
    }

    public void reloadReactionsNotifySettings() {
        getConnectionsManager().sendRequest(new TL_account.getReactionsNotifySettings(), new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$reloadReactionsNotifySettings$198(tLObject, tL_error);
            }
        });
    }

    public void lambda$reloadReactionsNotifySettings$197(TLObject tLObject) {
        if (tLObject instanceof TL_account.TL_reactionsNotifySettings) {
            TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = (TL_account.TL_reactionsNotifySettings) tLObject;
            SharedPreferences.Editor editorEdit = this.notificationsPreferences.edit();
            editorEdit.putBoolean("EnableReactionsMessages", tL_reactionsNotifySettings.messages_notify_from != null);
            TL_account.ReactionNotificationsFrom reactionNotificationsFrom = tL_reactionsNotifySettings.messages_notify_from;
            if (reactionNotificationsFrom != null) {
                editorEdit.putBoolean("EnableReactionsMessagesContacts", reactionNotificationsFrom instanceof TL_account.TL_reactionNotificationsFromContacts);
            }
            editorEdit.putBoolean("EnableReactionsStories", tL_reactionsNotifySettings.stories_notify_from != null);
            TL_account.ReactionNotificationsFrom reactionNotificationsFrom2 = tL_reactionsNotifySettings.stories_notify_from;
            if (reactionNotificationsFrom2 != null) {
                editorEdit.putBoolean("EnableReactionsStoriesContacts", reactionNotificationsFrom2 instanceof TL_account.TL_reactionNotificationsFromContacts);
            }
            editorEdit.putBoolean("EnableReactionsPreview", tL_reactionsNotifySettings.show_previews);
            getNotificationsController().getNotificationsSettingsFacade().applySoundSettings(tL_reactionsNotifySettings.sound, editorEdit, 0L, 0L, 4, false);
            editorEdit.apply();
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
        }
    }

    public void loadSignUpNotificationsSettings() {
        if (this.loadingNotificationSignUpSettings) {
            return;
        }
        this.loadingNotificationSignUpSettings = true;
        getConnectionsManager().sendRequest(new TL_account.getContactSignUpNotification(), new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$loadSignUpNotificationsSettings$200(tLObject, tL_error);
            }
        });
    }

    public void lambda$loadSignUpNotificationsSettings$200(final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$loadSignUpNotificationsSettings$199(tLObject);
            }
        });
    }

    public void lambda$loadSignUpNotificationsSettings$199(TLObject tLObject) {
        this.loadingNotificationSignUpSettings = false;
        SharedPreferences.Editor editorEdit = this.notificationsPreferences.edit();
        boolean z = tLObject instanceof TLRPC.TL_boolFalse;
        this.enableJoined = z;
        editorEdit.putBoolean("EnableContactJoined", z);
        editorEdit.commit();
        getUserConfig().notificationsSignUpSettingsLoaded = true;
        getUserConfig().saveConfig(false);
    }

    public void forceResetDialogs() {
        resetDialogs(true, getMessagesStorage().getLastSeqValue(), getMessagesStorage().getLastPtsValue(), getMessagesStorage().getLastDateValue(), getMessagesStorage().getLastQtsValue());
        getNotificationsController().deleteAllNotificationChannels();
    }

    protected void loadUnknownDialog(TLRPC.InputPeer inputPeer, long j) {
        NativeByteBuffer nativeByteBuffer;
        if (inputPeer == null) {
            return;
        }
        final long peerDialogId = DialogObject.getPeerDialogId(inputPeer);
        if (this.gettingUnknownDialogs.indexOfKey(peerDialogId) >= 0) {
            return;
        }
        this.gettingUnknownDialogs.put(peerDialogId, Boolean.TRUE);
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("load unknown dialog " + peerDialogId);
        }
        TLRPC.TL_messages_getPeerDialogs tL_messages_getPeerDialogs = new TLRPC.TL_messages_getPeerDialogs();
        TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
        tL_inputDialogPeer.peer = inputPeer;
        tL_messages_getPeerDialogs.peers.add(tL_inputDialogPeer);
        if (j == 0) {
            try {
                nativeByteBuffer = new NativeByteBuffer(inputPeer.getObjectSize() + 4);
            } catch (Exception e) {
                e = e;
                nativeByteBuffer = null;
            }
            try {
                nativeByteBuffer.writeInt32(15);
                inputPeer.serializeToStream(nativeByteBuffer);
            } catch (Exception e2) {
                e = e2;
                FileLog.e(e);
                j = getMessagesStorage().createPendingTask(nativeByteBuffer);
                final long j2 = j;
                getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        this.f$0.lambda$loadUnknownDialog$201(j2, peerDialogId, tLObject, tL_error);
                    }
                });
            }
            j = getMessagesStorage().createPendingTask(nativeByteBuffer);
        }
        final long j22 = j;
        getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$loadUnknownDialog$201(j22, peerDialogId, tLObject, tL_error);
            }
        });
    }

    public void lambda$loadUnknownDialog$201(long j, long j2, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
            if (!tL_messages_peerDialogs.dialogs.isEmpty()) {
                TLRPC.TL_dialog tL_dialog = (TLRPC.TL_dialog) tL_messages_peerDialogs.dialogs.get(0);
                TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                tL_messages_dialogs.dialogs.addAll(tL_messages_peerDialogs.dialogs);
                tL_messages_dialogs.messages.addAll(tL_messages_peerDialogs.messages);
                tL_messages_dialogs.users.addAll(tL_messages_peerDialogs.users);
                tL_messages_dialogs.chats.addAll(tL_messages_peerDialogs.chats);
                processLoadedDialogs(tL_messages_dialogs, null, null, tL_dialog.folder_id, 0, 1, this.DIALOGS_LOAD_TYPE_UNKNOWN, false, false, false);
            }
        }
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
        this.gettingUnknownDialogs.delete(j2);
    }

    private void fetchFolderInLoadedPinnedDialogs(TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs) {
        TLRPC.InputPeer tL_inputPeerUser;
        int size = tL_messages_peerDialogs.dialogs.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            TLRPC.Dialog dialog = tL_messages_peerDialogs.dialogs.get(i2);
            if (dialog instanceof TLRPC.TL_dialogFolder) {
                TLRPC.TL_dialogFolder tL_dialogFolder = (TLRPC.TL_dialogFolder) dialog;
                long peerDialogId = DialogObject.getPeerDialogId(dialog.peer);
                if (tL_dialogFolder.top_message == 0 || peerDialogId == 0) {
                    tL_messages_peerDialogs.dialogs.remove(tL_dialogFolder);
                } else {
                    int size2 = tL_messages_peerDialogs.messages.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        TLRPC.Message message = tL_messages_peerDialogs.messages.get(i3);
                        if (peerDialogId == MessageObject.getDialogId(message) && dialog.top_message == message.id) {
                            TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                            tL_dialog.peer = dialog.peer;
                            tL_dialog.top_message = dialog.top_message;
                            tL_dialog.folder_id = tL_dialogFolder.folder.id;
                            tL_dialog.flags |= 16;
                            tL_messages_peerDialogs.dialogs.add(tL_dialog);
                            TLRPC.Peer peer = dialog.peer;
                            if (peer instanceof TLRPC.TL_peerChannel) {
                                tL_inputPeerUser = new TLRPC.TL_inputPeerChannel();
                                tL_inputPeerUser.channel_id = dialog.peer.channel_id;
                                int size3 = tL_messages_peerDialogs.chats.size();
                                while (true) {
                                    if (i >= size3) {
                                        break;
                                    }
                                    TLRPC.Chat chat = tL_messages_peerDialogs.chats.get(i);
                                    if (chat.id == tL_inputPeerUser.channel_id) {
                                        tL_inputPeerUser.access_hash = chat.access_hash;
                                        break;
                                    }
                                    i++;
                                }
                            } else if (peer instanceof TLRPC.TL_peerChat) {
                                tL_inputPeerUser = new TLRPC.TL_inputPeerChat();
                                tL_inputPeerUser.chat_id = dialog.peer.chat_id;
                            } else {
                                tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
                                tL_inputPeerUser.user_id = dialog.peer.user_id;
                                int size4 = tL_messages_peerDialogs.users.size();
                                while (true) {
                                    if (i >= size4) {
                                        break;
                                    }
                                    TLRPC.User user = tL_messages_peerDialogs.users.get(i);
                                    if (user.id == tL_inputPeerUser.user_id) {
                                        tL_inputPeerUser.access_hash = user.access_hash;
                                        break;
                                    }
                                    i++;
                                }
                            }
                            loadUnknownDialog(tL_inputPeerUser, 0L);
                            return;
                        }
                    }
                    return;
                }
            }
        }
    }

    public void lambda$resetDialogs$202(int i, int i2, int i3, int i4, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            this.resetDialogsPinned = (TLRPC.TL_messages_peerDialogs) tLObject;
            for (int i5 = 0; i5 < this.resetDialogsPinned.dialogs.size(); i5++) {
                this.resetDialogsPinned.dialogs.get(i5).pinned = true;
            }
            resetDialogs(false, i, i2, i3, i4);
        }
    }

    public void lambda$resetDialogs$203(int i, int i2, int i3, int i4, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            this.resetDialogsAll = (TLRPC.messages_Dialogs) tLObject;
            resetDialogs(false, i, i2, i3, i4);
        }
    }

    private void resetDialogs(boolean r27, final int r28, final int r29, final int r30, final int r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.resetDialogs(boolean, int, int, int, int):void");
    }

    protected void completeDialogsReset(final TLRPC.messages_Dialogs messages_dialogs, int i, int i2, final int i3, final int i4, final int i5, final LongSparseArray longSparseArray, final LongSparseArray longSparseArray2, TLRPC.Message message) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$completeDialogsReset$205(i3, i4, i5, messages_dialogs, longSparseArray, longSparseArray2);
            }
        });
    }

    public void lambda$completeDialogsReset$205(int i, int i2, int i3, final TLRPC.messages_Dialogs messages_dialogs, final LongSparseArray longSparseArray, final LongSparseArray longSparseArray2) {
        this.gettingDifference = false;
        getMessagesStorage().setLastPtsValue(i);
        getMessagesStorage().setLastDateValue(i2);
        getMessagesStorage().setLastQtsValue(i3);
        getDifference();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$completeDialogsReset$204(messages_dialogs, longSparseArray, longSparseArray2);
            }
        });
    }

    public void lambda$completeDialogsReset$204(TLRPC.messages_Dialogs messages_dialogs, LongSparseArray longSparseArray, LongSparseArray longSparseArray2) {
        MediaDataController mediaDataController;
        long j;
        this.resetingDialogs = false;
        applyDialogsNotificationsSettings(messages_dialogs.dialogs);
        MediaDataController mediaDataController2 = getMediaDataController();
        mediaDataController2.clearAllDrafts(false);
        mediaDataController2.loadDraftsIfNeed();
        putUsers(messages_dialogs.users, false);
        putChats(messages_dialogs.chats, false);
        for (int i = 0; i < this.allDialogs.size(); i++) {
            TLRPC.Dialog dialog = this.allDialogs.get(i);
            if (!DialogObject.isEncryptedDialog(dialog.id)) {
                this.dialogs_dict.remove(dialog.id);
                ArrayList arrayList = (ArrayList) this.dialogMessage.get(dialog.id);
                this.dialogMessage.remove(dialog.id);
                if (arrayList != null) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i2);
                        if (messageObject != null) {
                            if (messageObject.messageOwner.peer_id.channel_id == 0) {
                                this.dialogMessagesByIds.remove(messageObject.getId());
                            }
                            long j2 = messageObject.messageOwner.random_id;
                            if (j2 != 0) {
                                this.dialogMessagesByRandomIds.remove(j2);
                            }
                        }
                    }
                }
            }
        }
        int i3 = 0;
        while (i3 < longSparseArray.size()) {
            long jKeyAt = longSparseArray.keyAt(i3);
            TLRPC.Dialog dialog2 = (TLRPC.Dialog) longSparseArray.valueAt(i3);
            TLRPC.DraftMessage draftMessage = dialog2.draft;
            if (draftMessage instanceof TLRPC.TL_draftMessage) {
                mediaDataController = mediaDataController2;
                j = jKeyAt;
                mediaDataController2.saveDraft(dialog2.id, 0L, draftMessage, null, false);
            } else {
                mediaDataController = mediaDataController2;
                j = jKeyAt;
            }
            this.dialogs_dict.put(j, dialog2);
            ArrayList arrayList2 = (ArrayList) longSparseArray2.get(dialog2.id);
            this.dialogMessage.put(j, arrayList2);
            if (arrayList2 != null) {
                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                    MessageObject messageObject2 = (MessageObject) arrayList2.get(i4);
                    if (messageObject2 != null && messageObject2.messageOwner.peer_id.channel_id == 0) {
                        this.dialogMessagesByIds.put(messageObject2.getId(), messageObject2);
                        this.dialogsLoadedTillDate = Math.min(this.dialogsLoadedTillDate, messageObject2.messageOwner.date);
                        long j3 = messageObject2.messageOwner.random_id;
                        if (j3 != 0) {
                            this.dialogMessagesByRandomIds.put(j3, messageObject2);
                        }
                    }
                }
            }
            getTranslateController().checkDialogMessage(j);
            i3++;
            mediaDataController2 = mediaDataController;
        }
        this.allDialogs.clear();
        int size = this.dialogs_dict.size();
        for (int i5 = 0; i5 < size; i5++) {
            TLRPC.Dialog dialog3 = (TLRPC.Dialog) this.dialogs_dict.valueAt(i5);
            if (this.deletingDialogs.indexOfKey(dialog3.id) < 0) {
                this.allDialogs.add(dialog3);
            }
        }
        sortDialogs(null);
        this.dialogsEndReached.put(0, true);
        this.serverDialogsEndReached.put(0, false);
        this.dialogsEndReached.put(1, true);
        this.serverDialogsEndReached.put(1, false);
        int totalDialogsCount = getUserConfig().getTotalDialogsCount(0);
        long[] dialogLoadOffsets = getUserConfig().getDialogLoadOffsets(0);
        if (totalDialogsCount < 400) {
            long j4 = dialogLoadOffsets[0];
            if (j4 != -1 && j4 != 2147483647L) {
                loadDialogs(0, 0, 100, false);
            }
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
    }

    private void migrateDialogs(final int i, int i2, long j, long j2, long j3, long j4) {
        if (this.migratingDialogs || i == -1) {
            return;
        }
        this.migratingDialogs = true;
        TLRPC.TL_messages_getDialogs tL_messages_getDialogs = new TLRPC.TL_messages_getDialogs();
        tL_messages_getDialogs.exclude_pinned = true;
        tL_messages_getDialogs.limit = 100;
        tL_messages_getDialogs.offset_id = i;
        tL_messages_getDialogs.offset_date = i2;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("start migrate with id " + i + " date " + LocaleController.getInstance().getFormatterStats().format(i2 * 1000));
        }
        if (i == 0) {
            tL_messages_getDialogs.offset_peer = new TLRPC.TL_inputPeerEmpty();
        } else {
            if (j3 != 0) {
                TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
                tL_messages_getDialogs.offset_peer = tL_inputPeerChannel;
                tL_inputPeerChannel.channel_id = j3;
            } else if (j != 0) {
                TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
                tL_messages_getDialogs.offset_peer = tL_inputPeerUser;
                tL_inputPeerUser.user_id = j;
            } else {
                TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                tL_messages_getDialogs.offset_peer = tL_inputPeerChat;
                tL_inputPeerChat.chat_id = j2;
            }
            tL_messages_getDialogs.offset_peer.access_hash = j4;
        }
        getConnectionsManager().sendRequest(tL_messages_getDialogs, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$migrateDialogs$209(i, tLObject, tL_error);
            }
        });
    }

    public void lambda$migrateDialogs$209(final int i, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            final TLRPC.messages_Dialogs messages_dialogs = (TLRPC.messages_Dialogs) tLObject;
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$migrateDialogs$207(messages_dialogs, i);
                }
            });
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$migrateDialogs$208();
                }
            });
        }
    }

    public void lambda$migrateDialogs$207(org.telegram.tgnet.TLRPC.messages_Dialogs r38, int r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$migrateDialogs$207(org.telegram.tgnet.TLRPC$messages_Dialogs, int):void");
    }

    public void lambda$migrateDialogs$206() {
        this.migratingDialogs = false;
    }

    public void lambda$migrateDialogs$208() {
        this.migratingDialogs = false;
    }

    public void processLoadedDialogs(final TLRPC.messages_Dialogs messages_dialogs, final ArrayList<TLRPC.EncryptedChat> arrayList, final ArrayList<TLRPC.UserFull> arrayList2, final int i, final int i2, final int i3, final int i4, final boolean z, final boolean z2, final boolean z3) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$processLoadedDialogs$213(i, i4, messages_dialogs, arrayList2, z, i3, arrayList, i2, z3, z2);
            }
        });
    }

    public void lambda$processLoadedDialogs$213(final int r32, final int r33, final org.telegram.tgnet.TLRPC.messages_Dialogs r34, final java.util.ArrayList r35, final boolean r36, final int r37, final java.util.ArrayList r38, final int r39, final boolean r40, final boolean r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$processLoadedDialogs$213(int, int, org.telegram.tgnet.TLRPC$messages_Dialogs, java.util.ArrayList, boolean, int, java.util.ArrayList, int, boolean, boolean):void");
    }

    public void lambda$processLoadedDialogs$210(TLRPC.messages_Dialogs messages_dialogs, ArrayList arrayList, int i, boolean z, long[] jArr, int i2) {
        putUsers(messages_dialogs.users, true);
        if (arrayList != null) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                long j = ((TLRPC.UserFull) arrayList.get(i3)).id;
                this.fullUsers.put(j, (TLRPC.UserFull) arrayList.get(i3));
                getTranslateController().updateDialogFull(j);
            }
        }
        this.loadingDialogs.put(i, false);
        if (z) {
            this.dialogsEndReached.put(i, false);
            this.serverDialogsEndReached.put(i, false);
        } else if (jArr[0] == 2147483647L) {
            this.dialogsEndReached.put(i, true);
            this.serverDialogsEndReached.put(i, true);
        } else {
            loadDialogs(i, 0, i2, false);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
    }

    public void lambda$processLoadedDialogs$211(TLRPC.Chat chat) {
        checkChatInviter(chat.id, true);
    }

    public void lambda$processLoadedDialogs$212(org.telegram.tgnet.TLRPC.Message r25, int r26, org.telegram.tgnet.TLRPC.messages_Dialogs r27, java.util.ArrayList r28, java.util.ArrayList r29, boolean r30, int r31, androidx.collection.LongSparseArray r32, androidx.collection.LongSparseArray r33, androidx.collection.LongSparseArray r34, int r35, boolean r36, int r37, java.util.ArrayList r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$processLoadedDialogs$212(org.telegram.tgnet.TLRPC$Message, int, org.telegram.tgnet.TLRPC$messages_Dialogs, java.util.ArrayList, java.util.ArrayList, boolean, int, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray, int, boolean, int, java.util.ArrayList):void");
    }

    private void applyDialogNotificationsSettings(long j, long j2, TLRPC.PeerNotifySettings peerNotifySettings) {
        getNotificationsController().getNotificationsSettingsFacade().applyDialogNotificationsSettings(j, j2, peerNotifySettings);
    }

    private void applyDialogsNotificationsSettings(ArrayList<TLRPC.Dialog> arrayList) {
        SharedPreferences.Editor editorEdit = getNotificationsSettings(this.currentAccount).edit();
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC.Dialog dialog = arrayList.get(i);
            if (dialog.peer != null && (dialog.notify_settings instanceof TLRPC.TL_peerNotifySettings)) {
                getNotificationsController().getNotificationsSettingsFacade().setSettingsForDialog(editorEdit, dialog, dialog.notify_settings);
            }
        }
        editorEdit.apply();
    }

    public void reloadMentionsCountForChannel(final TLRPC.InputPeer inputPeer, final long j) {
        Exception e;
        NativeByteBuffer nativeByteBuffer;
        if (j == 0) {
            try {
                nativeByteBuffer = new NativeByteBuffer(inputPeer.getObjectSize() + 4);
            } catch (Exception e2) {
                e = e2;
                nativeByteBuffer = null;
            }
            try {
                nativeByteBuffer.writeInt32(22);
                inputPeer.serializeToStream(nativeByteBuffer);
            } catch (Exception e3) {
                e = e3;
                FileLog.e(e);
                j = getMessagesStorage().createPendingTask(nativeByteBuffer);
                TLRPC.TL_messages_getUnreadMentions tL_messages_getUnreadMentions = new TLRPC.TL_messages_getUnreadMentions();
                tL_messages_getUnreadMentions.peer = inputPeer;
                tL_messages_getUnreadMentions.limit = 1;
                getConnectionsManager().sendRequest(tL_messages_getUnreadMentions, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        this.f$0.lambda$reloadMentionsCountForChannel$214(inputPeer, j, tLObject, tL_error);
                    }
                });
            }
            j = getMessagesStorage().createPendingTask(nativeByteBuffer);
        }
        TLRPC.TL_messages_getUnreadMentions tL_messages_getUnreadMentions2 = new TLRPC.TL_messages_getUnreadMentions();
        tL_messages_getUnreadMentions2.peer = inputPeer;
        tL_messages_getUnreadMentions2.limit = 1;
        getConnectionsManager().sendRequest(tL_messages_getUnreadMentions2, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$reloadMentionsCountForChannel$214(inputPeer, j, tLObject, tL_error);
            }
        });
    }

    public void lambda$reloadMentionsCountForChannel$214(TLRPC.InputPeer inputPeer, long j, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
        if (messages_messages != null) {
            int size = messages_messages.count;
            if (size == 0) {
                size = messages_messages.messages.size();
            }
            getMessagesStorage().resetMentionsCount(-inputPeer.channel_id, 0L, size);
        }
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
    }

    public void reloadMentionsCountForChannels(final ArrayList<Long> arrayList) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$reloadMentionsCountForChannels$215(arrayList);
            }
        });
    }

    public void lambda$reloadMentionsCountForChannels$215(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            reloadMentionsCountForChannel(getInputPeer(-((Long) arrayList.get(i)).longValue()), 0L);
        }
    }

    public void processDialogsUpdateRead(final LongSparseIntArray longSparseIntArray, final LongSparseIntArray longSparseIntArray2) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$processDialogsUpdateRead$216(longSparseIntArray, longSparseIntArray2);
            }
        });
    }

    public void lambda$processDialogsUpdateRead$216(LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2) {
        boolean z;
        if (longSparseIntArray != null) {
            z = false;
            for (int i = 0; i < longSparseIntArray.size(); i++) {
                long jKeyAt = longSparseIntArray.keyAt(i);
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.dialogs_dict.get(jKeyAt);
                if (dialog == null) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= this.allDialogs.size()) {
                            break;
                        }
                        if (this.allDialogs.get(i2).id == jKeyAt) {
                            this.dialogs_dict.put(jKeyAt, this.allDialogs.get(i2));
                            dialog = this.allDialogs.get(i2);
                            break;
                        }
                        i2++;
                    }
                }
                if (dialog == null) {
                    if (BuildVars.DEBUG_PRIVATE_VERSION) {
                        FileLog.d("can't update dialog " + jKeyAt + " with new unread " + longSparseIntArray.valueAt(i));
                    }
                    this.pendingUnreadCounter.put(jKeyAt, longSparseIntArray.valueAt(i));
                }
                if (dialog != null) {
                    int i3 = dialog.unread_count;
                    dialog.unread_count = longSparseIntArray.valueAt(i);
                    if (BuildVars.DEBUG_PRIVATE_VERSION) {
                        FileLog.d("update dialog " + jKeyAt + " with new unread " + dialog.unread_count);
                    }
                    if (i3 != 0 && dialog.unread_count == 0) {
                        if (!isDialogMuted(jKeyAt, 0L)) {
                            this.unreadUnmutedDialogs--;
                        }
                        if (!z) {
                            int i4 = 0;
                            while (true) {
                                DialogFilter[] dialogFilterArr = this.selectedDialogFilter;
                                if (i4 >= dialogFilterArr.length) {
                                    break;
                                }
                                DialogFilter dialogFilter = dialogFilterArr[i4];
                                if (dialogFilter != null && (dialogFilter.flags & DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0) {
                                    break;
                                } else {
                                    i4++;
                                }
                            }
                            z = true;
                        }
                    } else if (i3 == 0 && !dialog.unread_mark && dialog.unread_count != 0) {
                        if (!isDialogMuted(jKeyAt, 0L)) {
                            this.unreadUnmutedDialogs++;
                        }
                        if (!z) {
                            int i5 = 0;
                            while (true) {
                                DialogFilter[] dialogFilterArr2 = this.selectedDialogFilter;
                                if (i5 >= dialogFilterArr2.length) {
                                    break;
                                }
                                DialogFilter dialogFilter2 = dialogFilterArr2[i5];
                                if (dialogFilter2 != null && (dialogFilter2.flags & DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0) {
                                    break;
                                } else {
                                    i5++;
                                }
                            }
                            z = true;
                        }
                    }
                }
            }
        } else {
            z = false;
        }
        if (longSparseIntArray2 != null) {
            for (int i6 = 0; i6 < longSparseIntArray2.size(); i6++) {
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) this.dialogs_dict.get(longSparseIntArray2.keyAt(i6));
                if (dialog2 != null) {
                    dialog2.unread_mentions_count = longSparseIntArray2.valueAt(i6);
                    if (this.createdDialogMainThreadIds.contains(Long.valueOf(dialog2.id))) {
                        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateMentionsCount, Long.valueOf(dialog2.id), 0L, Integer.valueOf(dialog2.unread_mentions_count));
                    }
                    if (!z) {
                        int i7 = 0;
                        while (true) {
                            DialogFilter[] dialogFilterArr3 = this.selectedDialogFilter;
                            if (i7 >= dialogFilterArr3.length) {
                                break;
                            }
                            DialogFilter dialogFilter3 = dialogFilterArr3[i7];
                            if (dialogFilter3 != null) {
                                int i8 = dialogFilter3.flags;
                                if ((DIALOG_FILTER_FLAG_EXCLUDE_MUTED & i8) != 0 || (i8 & DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0) {
                                    break;
                                }
                            }
                            i7++;
                        }
                        z = true;
                    }
                }
            }
        }
        if (z) {
            sortDialogs(null);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_READ_DIALOG_MESSAGE));
        if (longSparseIntArray != null) {
            getNotificationsController().processDialogsUpdateRead(longSparseIntArray);
        }
    }

    protected void checkLastDialogMessage(final TLRPC.Dialog dialog, TLRPC.InputPeer inputPeer, final long j) {
        Exception e;
        NativeByteBuffer nativeByteBuffer;
        if (DialogObject.isEncryptedDialog(dialog.id) || this.checkingLastMessagesDialogs.indexOfKey(dialog.id) >= 0) {
            return;
        }
        TLRPC.TL_messages_getHistory tL_messages_getHistory = new TLRPC.TL_messages_getHistory();
        if (inputPeer == null) {
            inputPeer = getInputPeer(dialog.id);
        }
        tL_messages_getHistory.peer = inputPeer;
        if (inputPeer == null) {
            return;
        }
        tL_messages_getHistory.limit = 1;
        this.checkingLastMessagesDialogs.put(dialog.id, Boolean.TRUE);
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("checkLastDialogMessage for " + dialog.id);
        }
        if (j == 0) {
            try {
                nativeByteBuffer = new NativeByteBuffer(tL_messages_getHistory.peer.getObjectSize() + 60);
            } catch (Exception e2) {
                e = e2;
                nativeByteBuffer = null;
            }
            try {
                nativeByteBuffer.writeInt32(14);
                nativeByteBuffer.writeInt64(dialog.id);
                nativeByteBuffer.writeInt32(dialog.top_message);
                nativeByteBuffer.writeInt32(dialog.read_inbox_max_id);
                nativeByteBuffer.writeInt32(dialog.read_outbox_max_id);
                nativeByteBuffer.writeInt32(dialog.unread_count);
                nativeByteBuffer.writeInt32(dialog.last_message_date);
                nativeByteBuffer.writeInt32(dialog.pts);
                nativeByteBuffer.writeInt32(dialog.flags);
                nativeByteBuffer.writeBool(dialog.pinned);
                nativeByteBuffer.writeInt32(dialog.pinnedNum);
                nativeByteBuffer.writeInt32(dialog.unread_mentions_count);
                nativeByteBuffer.writeBool(dialog.unread_mark);
                nativeByteBuffer.writeInt32(dialog.folder_id);
                tL_messages_getHistory.peer.serializeToStream(nativeByteBuffer);
            } catch (Exception e3) {
                e = e3;
                FileLog.e(e);
                j = getMessagesStorage().createPendingTask(nativeByteBuffer);
                getConnectionsManager().sendRequest(tL_messages_getHistory, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        this.f$0.lambda$checkLastDialogMessage$220(dialog, j, tLObject, tL_error);
                    }
                });
            }
            j = getMessagesStorage().createPendingTask(nativeByteBuffer);
        }
        getConnectionsManager().sendRequest(tL_messages_getHistory, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$checkLastDialogMessage$220(dialog, j, tLObject, tL_error);
            }
        });
    }

    public void lambda$checkLastDialogMessage$220(final TLRPC.Dialog dialog, long j, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            removeDeletedMessagesFromArray(dialog.id, messages_messages.messages);
            if (!messages_messages.messages.isEmpty()) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("checkLastDialogMessage for " + dialog.id + " has message");
                }
                TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                TLRPC.Message message = messages_messages.messages.get(0);
                TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                tL_dialog.flags = dialog.flags;
                tL_dialog.top_message = message.id;
                tL_dialog.last_message_date = message.date;
                tL_dialog.notify_settings = dialog.notify_settings;
                tL_dialog.pts = dialog.pts;
                tL_dialog.unread_count = dialog.unread_count;
                tL_dialog.unread_mark = dialog.unread_mark;
                tL_dialog.unread_mentions_count = dialog.unread_mentions_count;
                tL_dialog.unread_reactions_count = dialog.unread_reactions_count;
                tL_dialog.read_inbox_max_id = dialog.read_inbox_max_id;
                tL_dialog.read_outbox_max_id = dialog.read_outbox_max_id;
                tL_dialog.pinned = dialog.pinned;
                tL_dialog.pinnedNum = dialog.pinnedNum;
                tL_dialog.folder_id = dialog.folder_id;
                long j2 = dialog.id;
                tL_dialog.id = j2;
                message.dialog_id = j2;
                tL_messages_dialogs.users.addAll(messages_messages.users);
                tL_messages_dialogs.chats.addAll(messages_messages.chats);
                tL_messages_dialogs.dialogs.add(tL_dialog);
                tL_messages_dialogs.messages.addAll(messages_messages.messages);
                tL_messages_dialogs.count = 1;
                processDialogsUpdate(tL_messages_dialogs, null, false);
                getMessagesStorage().putMessages(messages_messages.messages, true, true, false, getDownloadController().getAutodownloadMask(), true, 0, 0L);
            } else {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$checkLastDialogMessage$218(dialog);
                    }
                });
            }
        }
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$checkLastDialogMessage$219(dialog);
            }
        });
    }

    public void lambda$checkLastDialogMessage$218(final TLRPC.Dialog dialog) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("checkLastDialogMessage for " + dialog.id + " has not message");
        }
        if (getMediaDataController().getDraft(dialog.id, 0L) == null) {
            TLRPC.Dialog dialog2 = (TLRPC.Dialog) this.dialogs_dict.get(dialog.id);
            if (dialog2 == null) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("checkLastDialogMessage for " + dialog.id + " current dialog not found");
                }
                getMessagesStorage().isDialogHasTopMessage(dialog.id, new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$checkLastDialogMessage$217(dialog);
                    }
                });
                return;
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("checkLastDialogMessage for " + dialog.id + " current dialog top message " + dialog2.top_message);
            }
            if (dialog2.top_message == 0) {
                deleteDialog(dialog.id, 3);
            }
        }
    }

    public void lambda$checkLastDialogMessage$217(TLRPC.Dialog dialog) {
        deleteDialog(dialog.id, 3);
    }

    public void lambda$checkLastDialogMessage$219(TLRPC.Dialog dialog) {
        this.checkingLastMessagesDialogs.delete(dialog.id);
    }

    public void processDialogsUpdate(final TLRPC.messages_Dialogs messages_dialogs, ArrayList<TLRPC.EncryptedChat> arrayList, final boolean z) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$processDialogsUpdate$222(messages_dialogs, z);
            }
        });
    }

    public void lambda$processDialogsUpdate$222(final org.telegram.tgnet.TLRPC.messages_Dialogs r20, final boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$processDialogsUpdate$222(org.telegram.tgnet.TLRPC$messages_Dialogs, boolean):void");
    }

    public void lambda$processDialogsUpdate$221(org.telegram.tgnet.TLRPC.messages_Dialogs r19, androidx.collection.LongSparseArray r20, androidx.collection.LongSparseArray r21, boolean r22, org.telegram.messenger.support.LongSparseIntArray r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$processDialogsUpdate$221(org.telegram.tgnet.TLRPC$messages_Dialogs, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray, boolean, org.telegram.messenger.support.LongSparseIntArray):void");
    }

    private int messagesMaxDate(ArrayList<MessageObject> arrayList) {
        TLRPC.Message message;
        int i;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; arrayList != null && i3 < arrayList.size(); i3++) {
            MessageObject messageObject = arrayList.get(i3);
            if (messageObject != null && (message = messageObject.messageOwner) != null && (i = message.date) > i2) {
                i2 = i;
            }
        }
        return i2;
    }

    public void addToViewsQueue(final MessageObject messageObject) {
        if (messageObject == null) {
            return;
        }
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$addToViewsQueue$223(messageObject);
            }
        });
    }

    public void lambda$addToViewsQueue$223(MessageObject messageObject) {
        long dialogId = messageObject.getDialogId();
        int id = messageObject.getId();
        ArrayList arrayList = (ArrayList) this.channelViewsToSend.get(dialogId);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.channelViewsToSend.put(dialogId, arrayList);
        }
        if (arrayList.contains(Integer.valueOf(id))) {
            return;
        }
        arrayList.add(Integer.valueOf(id));
    }

    public void addToPollsQueue(long j, ArrayList<MessageObject> arrayList) {
        int i;
        SparseArray sparseArray = (SparseArray) this.pollsToCheck.get(j);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            this.pollsToCheck.put(j, sparseArray);
            this.pollsToCheckSize++;
        }
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((MessageObject) sparseArray.valueAt(i2)).pollVisibleOnScreen = false;
        }
        int currentTime = getConnectionsManager().getCurrentTime();
        int size2 = arrayList.size();
        boolean z = false;
        int iMin = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < size2; i3++) {
            MessageObject messageObject = arrayList.get(i3);
            if (messageObject.type == 17) {
                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                    TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageMedia).poll;
                    if (!poll.closed && (i = poll.close_date) != 0) {
                        if (i <= currentTime) {
                            z = true;
                        } else {
                            iMin = Math.min(iMin, i - currentTime);
                        }
                    }
                    int id = messageObject.getId();
                    MessageObject messageObject2 = (MessageObject) sparseArray.get(id);
                    if (messageObject2 != null) {
                        messageObject2.pollVisibleOnScreen = true;
                    } else {
                        sparseArray.put(id, messageObject);
                    }
                }
            }
        }
        if (z) {
            this.lastViewsCheckTime = 0L;
        } else if (iMin < 5) {
            this.lastViewsCheckTime = Math.min(this.lastViewsCheckTime, System.currentTimeMillis() - ((5 - iMin) * 1000));
        }
    }

    public void markMessageContentAsRead(MessageObject messageObject) {
        if (messageObject.scheduled) {
            return;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (messageObject.messageOwner.mentioned) {
            getMessagesStorage().markMentionMessageAsRead(-messageObject.messageOwner.peer_id.channel_id, messageObject.getId(), messageObject.getDialogId());
        }
        arrayList.add(Integer.valueOf(messageObject.getId()));
        long dialogId = messageObject.getDialogId();
        getMessagesStorage().markMessagesContentAsRead(dialogId, arrayList, 0, 0);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesReadContent, Long.valueOf(dialogId), arrayList);
        if (messageObject.getId() < 0) {
            markMessageAsRead(messageObject.getDialogId(), messageObject.messageOwner.random_id, Integer.MIN_VALUE);
            return;
        }
        if (messageObject.messageOwner.peer_id.channel_id != 0) {
            TLRPC.TL_channels_readMessageContents tL_channels_readMessageContents = new TLRPC.TL_channels_readMessageContents();
            TLRPC.InputChannel inputChannel = getInputChannel(messageObject.messageOwner.peer_id.channel_id);
            tL_channels_readMessageContents.channel = inputChannel;
            if (inputChannel == null) {
                return;
            }
            tL_channels_readMessageContents.id.add(Integer.valueOf(messageObject.getId()));
            getConnectionsManager().sendRequest(tL_channels_readMessageContents, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    MessagesController.lambda$markMessageContentAsRead$224(tLObject, tL_error);
                }
            });
            return;
        }
        TLRPC.TL_messages_readMessageContents tL_messages_readMessageContents = new TLRPC.TL_messages_readMessageContents();
        tL_messages_readMessageContents.id.add(Integer.valueOf(messageObject.getId()));
        getConnectionsManager().sendRequest(tL_messages_readMessageContents, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$markMessageContentAsRead$225(tLObject, tL_error);
            }
        });
    }

    public void lambda$markMessageContentAsRead$225(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
            processNewDifferenceParams(-1, tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
        }
    }

    public void markMentionMessageAsRead(int i, long j, long j2) {
        getMessagesStorage().markMentionMessageAsRead(-j, i, j2);
        if (j != 0) {
            TLRPC.TL_channels_readMessageContents tL_channels_readMessageContents = new TLRPC.TL_channels_readMessageContents();
            TLRPC.InputChannel inputChannel = getInputChannel(j);
            tL_channels_readMessageContents.channel = inputChannel;
            if (inputChannel == null) {
                return;
            }
            tL_channels_readMessageContents.id.add(Integer.valueOf(i));
            getConnectionsManager().sendRequest(tL_channels_readMessageContents, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    MessagesController.lambda$markMentionMessageAsRead$226(tLObject, tL_error);
                }
            });
            return;
        }
        TLRPC.TL_messages_readMessageContents tL_messages_readMessageContents = new TLRPC.TL_messages_readMessageContents();
        tL_messages_readMessageContents.id.add(Integer.valueOf(i));
        getConnectionsManager().sendRequest(tL_messages_readMessageContents, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$markMentionMessageAsRead$227(tLObject, tL_error);
            }
        });
    }

    public void lambda$markMentionMessageAsRead$227(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
            processNewDifferenceParams(-1, tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
        }
    }

    public long createDeleteShowOnceTask(long j, int i) {
        NativeByteBuffer nativeByteBuffer;
        try {
            nativeByteBuffer = new NativeByteBuffer(16);
        } catch (Exception e) {
            e = e;
            nativeByteBuffer = null;
        }
        try {
            nativeByteBuffer.writeInt32(102);
            nativeByteBuffer.writeInt64(j);
            nativeByteBuffer.writeInt32(i);
        } catch (Exception e2) {
            e = e2;
            FileLog.e(e);
            return getMessagesStorage().createPendingTask(nativeByteBuffer);
        }
        return getMessagesStorage().createPendingTask(nativeByteBuffer);
    }

    public void lambda$checkDeletingTask$83(long j, long j2, int i) {
        getMessagesStorage().removePendingTask(j);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(i));
        getMessagesStorage().emptyMessagesMedia(j2, arrayList);
    }

    public void markMessageAsRead2(long j, int i, TLRPC.InputChannel inputChannel, int i2, long j2) {
        markMessageAsRead2(j, i, inputChannel, i2, j2, true);
    }

    public void markMessageAsRead2(long r15, int r17, org.telegram.tgnet.TLRPC.InputChannel r18, int r19, long r20, boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.markMessageAsRead2(long, int, org.telegram.tgnet.TLRPC$InputChannel, int, long, boolean):void");
    }

    public void lambda$markMessageAsRead2$228(long j, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
    }

    public void lambda$markMessageAsRead2$229(long j, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
            processNewDifferenceParams(-1, tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
        }
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
    }

    public void markMessageAsRead(long j, long j2, int i) {
        TLRPC.EncryptedChat encryptedChat;
        if (j2 == 0 || j == 0) {
            return;
        }
        if ((i > 0 || i == Integer.MIN_VALUE) && DialogObject.isEncryptedDialog(j) && (encryptedChat = getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(j)))) != null) {
            ArrayList<Long> arrayList = new ArrayList<>();
            arrayList.add(Long.valueOf(j2));
            getSecretChatHelper().sendMessagesReadMessage(encryptedChat, arrayList, null);
            if (i > 0) {
                int currentTime = getConnectionsManager().getCurrentTime();
                getMessagesStorage().createTaskForSecretChat(encryptedChat.id, currentTime, currentTime, 0, arrayList);
            }
        }
    }

    private void completeReadTask(ReadTask readTask) {
        TLRPC.TL_messages_readHistory tL_messages_readHistory;
        if (readTask.replyId != 0 && readTask.monoForumPeerId == 0) {
            TLRPC.TL_messages_readDiscussion tL_messages_readDiscussion = new TLRPC.TL_messages_readDiscussion();
            tL_messages_readDiscussion.msg_id = (int) readTask.replyId;
            tL_messages_readDiscussion.peer = getInputPeer(readTask.dialogId);
            tL_messages_readDiscussion.read_max_id = readTask.maxId;
            getConnectionsManager().sendRequest(tL_messages_readDiscussion, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    MessagesController.lambda$completeReadTask$230(tLObject, tL_error);
                }
            });
            return;
        }
        if (!DialogObject.isEncryptedDialog(readTask.dialogId)) {
            TLRPC.InputPeer inputPeer = getInputPeer(readTask.dialogId);
            if (readTask.monoForumPeerId != 0) {
                TLRPC.TL_messages_readSavedHistory tL_messages_readSavedHistory = new TLRPC.TL_messages_readSavedHistory();
                tL_messages_readSavedHistory.parent_peer = getInputPeer(readTask.dialogId);
                tL_messages_readSavedHistory.peer = getInputPeer(readTask.monoForumPeerId);
                tL_messages_readSavedHistory.max_id = readTask.maxId;
                tL_messages_readHistory = tL_messages_readSavedHistory;
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                TLRPC.TL_channels_readHistory tL_channels_readHistory = new TLRPC.TL_channels_readHistory();
                tL_channels_readHistory.channel = getInputChannel(-readTask.dialogId);
                tL_channels_readHistory.max_id = readTask.maxId;
                tL_messages_readHistory = tL_channels_readHistory;
            } else {
                TLRPC.TL_messages_readHistory tL_messages_readHistory2 = new TLRPC.TL_messages_readHistory();
                tL_messages_readHistory2.peer = inputPeer;
                tL_messages_readHistory2.max_id = readTask.maxId;
                tL_messages_readHistory = tL_messages_readHistory2;
            }
            getConnectionsManager().sendRequest(tL_messages_readHistory, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$completeReadTask$231(tLObject, tL_error);
                }
            });
            return;
        }
        TLRPC.EncryptedChat encryptedChat = getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(readTask.dialogId)));
        byte[] bArr = encryptedChat.auth_key;
        if (bArr == null || bArr.length <= 1 || !(encryptedChat instanceof TLRPC.TL_encryptedChat)) {
            return;
        }
        TLRPC.TL_messages_readEncryptedHistory tL_messages_readEncryptedHistory = new TLRPC.TL_messages_readEncryptedHistory();
        TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat = new TLRPC.TL_inputEncryptedChat();
        tL_messages_readEncryptedHistory.peer = tL_inputEncryptedChat;
        tL_inputEncryptedChat.chat_id = encryptedChat.id;
        tL_inputEncryptedChat.access_hash = encryptedChat.access_hash;
        tL_messages_readEncryptedHistory.max_date = readTask.maxDate;
        getConnectionsManager().sendRequest(tL_messages_readEncryptedHistory, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                MessagesController.lambda$completeReadTask$232(tLObject, tL_error);
            }
        });
    }

    public void lambda$completeReadTask$231(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null && (tLObject instanceof TLRPC.TL_messages_affectedMessages)) {
            TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
            processNewDifferenceParams(-1, tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
        }
    }

    private void checkReadTasks() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int size = this.readTasks.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            ReadTask readTask = this.readTasks.get(i2);
            if (readTask.sendRequestTime <= jElapsedRealtime) {
                completeReadTask(readTask);
                this.readTasks.remove(i2);
                this.readTasksMap.remove(readTask.dialogId);
                i2--;
                size--;
            }
            i2++;
        }
        int size2 = this.repliesReadTasks.size();
        while (i < size2) {
            ReadTask readTask2 = this.repliesReadTasks.get(i);
            if (readTask2.sendRequestTime <= jElapsedRealtime) {
                completeReadTask(readTask2);
                this.repliesReadTasks.remove(i);
                this.threadsReadTasksMap.remove(readTask2.dialogId + "_" + readTask2.replyId);
                i += -1;
                size2 += -1;
            }
            i++;
        }
    }

    public void markDialogAsReadNow(final long j, final long j2) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$markDialogAsReadNow$233(j2, j);
            }
        });
    }

    public void lambda$markDialogAsReadNow$233(long j, long j2) {
        if (j != 0) {
            String str = j2 + "_" + j;
            ReadTask readTask = this.threadsReadTasksMap.get(str);
            if (readTask == null) {
                return;
            }
            completeReadTask(readTask);
            this.repliesReadTasks.remove(readTask);
            this.threadsReadTasksMap.remove(str);
            return;
        }
        ReadTask readTask2 = (ReadTask) this.readTasksMap.get(j2);
        if (readTask2 == null) {
            return;
        }
        completeReadTask(readTask2);
        this.readTasks.remove(readTask2);
        this.readTasksMap.remove(j2);
    }

    public void markMentionsAsRead(long j, long j2) {
        if (DialogObject.isEncryptedDialog(j) || j == getUserConfig().getClientUserId()) {
            return;
        }
        getMessagesStorage().resetMentionsCount(j, j2, 0);
        TLRPC.TL_messages_readMentions tL_messages_readMentions = new TLRPC.TL_messages_readMentions();
        tL_messages_readMentions.peer = getInputPeer(j);
        if (j2 != 0) {
            tL_messages_readMentions.top_msg_id = (int) j2;
            tL_messages_readMentions.flags |= 1;
        }
        getConnectionsManager().sendRequest(tL_messages_readMentions, null);
    }

    public void markDialogAsRead(final long r17, final int r19, final int r20, final int r21, final boolean r22, final long r23, final int r25, final boolean r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.markDialogAsRead(long, int, int, int, boolean, long, int, boolean, int):void");
    }

    public void lambda$markDialogAsRead$235(final long j, final int i, final int i2, final boolean z) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$markDialogAsRead$234(j, i, i2, z);
            }
        });
    }

    public void lambda$markDialogAsRead$234(long j, int i, int i2, boolean z) {
        int i3;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.dialogs_dict.get(j);
        if (dialog != null) {
            int i4 = dialog.unread_count;
            if (i == 0 || i2 >= dialog.top_message) {
                dialog.unread_count = 0;
            } else {
                int iMax = Math.max(i4 - i, 0);
                dialog.unread_count = iMax;
                if (i2 != Integer.MIN_VALUE && iMax > (i3 = dialog.top_message - i2)) {
                    dialog.unread_count = i3;
                }
            }
            boolean z2 = dialog.unread_mark;
            if (z2) {
                dialog.unread_mark = false;
                getMessagesStorage().setDialogUnread(dialog.id, false);
            }
            if ((i4 != 0 || z2) && dialog.unread_count == 0) {
                if (!isDialogMuted(j, 0L)) {
                    this.unreadUnmutedDialogs--;
                }
                int i5 = 0;
                while (true) {
                    DialogFilter[] dialogFilterArr = this.selectedDialogFilter;
                    if (i5 < dialogFilterArr.length) {
                        DialogFilter dialogFilter = dialogFilterArr[i5];
                        if (dialogFilter != null && (dialogFilter.flags & DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0) {
                            sortDialogs(null);
                            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
                            break;
                        }
                        i5++;
                    } else {
                        break;
                    }
                }
            }
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_READ_DIALOG_MESSAGE));
        }
        if (!z) {
            getNotificationsController().processReadMessages(null, j, 0, i2, false);
            LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
            longSparseIntArray.put(j, 0);
            getNotificationsController().processDialogsUpdateRead(longSparseIntArray);
            return;
        }
        getNotificationsController().processReadMessages(null, j, 0, i2, true);
        LongSparseIntArray longSparseIntArray2 = new LongSparseIntArray(1);
        longSparseIntArray2.put(j, -1);
        getNotificationsController().processDialogsUpdateRead(longSparseIntArray2);
    }

    public void lambda$markDialogAsRead$237(final long j, final int i, final boolean z, final int i2, final int i3) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$markDialogAsRead$236(j, i, z, i2, i3);
            }
        });
    }

    public void lambda$markDialogAsRead$236(long j, int i, boolean z, int i2, int i3) {
        int i4;
        getNotificationsController().processReadMessages(null, j, i, 0, z);
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.dialogs_dict.get(j);
        if (dialog != null) {
            int i5 = dialog.unread_count;
            if (i2 == 0 || i3 <= dialog.top_message) {
                dialog.unread_count = 0;
            } else {
                int iMax = Math.max(i5 - i2, 0);
                dialog.unread_count = iMax;
                if (i3 != Integer.MAX_VALUE && iMax > (i4 = i3 - dialog.top_message)) {
                    dialog.unread_count = i4;
                }
            }
            boolean z2 = dialog.unread_mark;
            if (z2) {
                dialog.unread_mark = false;
                getMessagesStorage().setDialogUnread(dialog.id, false);
            }
            if ((i5 != 0 || z2) && dialog.unread_count == 0) {
                if (!isDialogMuted(j, 0L)) {
                    this.unreadUnmutedDialogs--;
                }
                int i6 = 0;
                while (true) {
                    DialogFilter[] dialogFilterArr = this.selectedDialogFilter;
                    if (i6 < dialogFilterArr.length) {
                        DialogFilter dialogFilter = dialogFilterArr[i6];
                        if (dialogFilter != null && (dialogFilter.flags & DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0) {
                            sortDialogs(null);
                            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
                            break;
                        }
                        i6++;
                    } else {
                        break;
                    }
                }
            }
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_READ_DIALOG_MESSAGE));
        }
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
        longSparseIntArray.put(j, 0);
        getNotificationsController().processDialogsUpdateRead(longSparseIntArray);
    }

    public void lambda$markDialogAsRead$238(long j, long j2, long j3, boolean z, int i, int i2) {
        ReadTask readTask;
        if (j != 0) {
            readTask = this.threadsReadTasksMap.get(j2 + "_" + j);
        } else {
            readTask = (ReadTask) this.readTasksMap.get(j2);
        }
        if (readTask == null) {
            readTask = new ReadTask(null);
            readTask.dialogId = j2;
            readTask.replyId = j;
            readTask.monoForumPeerId = j3;
            readTask.sendRequestTime = SystemClock.elapsedRealtime() + 5000;
            if (!z) {
                if (j != 0) {
                    this.threadsReadTasksMap.put(j2 + "_" + j, readTask);
                    this.repliesReadTasks.add(readTask);
                } else {
                    this.readTasksMap.put(j2, readTask);
                    this.readTasks.add(readTask);
                }
            }
        }
        readTask.maxDate = i;
        readTask.maxId = i2;
        if (z) {
            completeReadTask(readTask);
        }
    }

    public int createChat(String str, ArrayList<Long> arrayList, String str2, int i, boolean z, Location location, String str3, int i2, final BaseFragment baseFragment) {
        if (i == 0 && !z) {
            final TLRPC.TL_messages_createChat tL_messages_createChat = new TLRPC.TL_messages_createChat();
            tL_messages_createChat.title = str;
            if (i2 >= 0) {
                tL_messages_createChat.ttl_period = i2;
                tL_messages_createChat.flags |= 1;
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                TLRPC.User user = getUser(arrayList.get(i3));
                if (user != null) {
                    tL_messages_createChat.users.add(getInputUser(user));
                }
            }
            return getConnectionsManager().sendRequest(tL_messages_createChat, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$createChat$241(baseFragment, tL_messages_createChat, tLObject, tL_error);
                }
            }, 2);
        }
        if (!z && i != 2 && i != 4 && i != 5) {
            return 0;
        }
        final TLRPC.TL_channels_createChannel tL_channels_createChannel = new TLRPC.TL_channels_createChannel();
        tL_channels_createChannel.title = str;
        if (str2 == null) {
            str2 = "";
        }
        tL_channels_createChannel.about = str2;
        tL_channels_createChannel.for_import = z;
        if (z || i == 4 || i == 5) {
            tL_channels_createChannel.megagroup = true;
        } else {
            tL_channels_createChannel.broadcast = true;
        }
        tL_channels_createChannel.forum = i == 5;
        if (location != null) {
            TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
            tL_channels_createChannel.geo_point = tL_inputGeoPoint;
            tL_inputGeoPoint.lat = location.getLatitude();
            tL_channels_createChannel.geo_point._long = location.getLongitude();
            tL_channels_createChannel.address = str3;
            tL_channels_createChannel.flags |= 4;
        }
        return getConnectionsManager().sendRequest(tL_channels_createChannel, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$createChat$244(baseFragment, tL_channels_createChannel, tLObject, tL_error);
            }
        }, 2);
    }

    public void lambda$createChat$241(final BaseFragment baseFragment, final TLRPC.TL_messages_createChat tL_messages_createChat, TLObject tLObject, final TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$createChat$239(tL_error, baseFragment, tL_messages_createChat);
                }
            });
        } else if (tLObject instanceof TLRPC.TL_messages_invitedUsers) {
            final TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) tLObject;
            processUpdates(tL_messages_invitedUsers.updates, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$createChat$240(tL_messages_invitedUsers);
                }
            });
        }
    }

    public void lambda$createChat$239(TLRPC.TL_error tL_error, BaseFragment baseFragment, TLRPC.TL_messages_createChat tL_messages_createChat) {
        AlertsCreator.processError(this.currentAccount, tL_error, baseFragment, tL_messages_createChat, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatDidFailCreate, new Object[0]);
    }

    public void lambda$createChat$240(TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers) {
        putUsers(tL_messages_invitedUsers.updates.users, false);
        putChats(tL_messages_invitedUsers.updates.chats, false);
        ArrayList<TLRPC.Chat> arrayList = tL_messages_invitedUsers.updates.chats;
        if (arrayList != null && !arrayList.isEmpty()) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatDidCreated, Long.valueOf(tL_messages_invitedUsers.updates.chats.get(0).id));
            AlertsCreator.checkRestrictedInviteUsers(this.currentAccount, tL_messages_invitedUsers.updates.chats.get(0), tL_messages_invitedUsers);
        } else {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatDidFailCreate, new Object[0]);
        }
    }

    public void lambda$createChat$244(final BaseFragment baseFragment, final TLRPC.TL_channels_createChannel tL_channels_createChannel, TLObject tLObject, final TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$createChat$242(tL_error, baseFragment, tL_channels_createChannel);
                }
            });
            return;
        }
        final TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        processUpdates(updates, false);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$createChat$243(updates);
            }
        });
    }

    public void lambda$createChat$242(TLRPC.TL_error tL_error, BaseFragment baseFragment, TLRPC.TL_channels_createChannel tL_channels_createChannel) {
        AlertsCreator.processError(this.currentAccount, tL_error, baseFragment, tL_channels_createChannel, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatDidFailCreate, new Object[0]);
    }

    public void lambda$createChat$243(TLRPC.Updates updates) {
        putUsers(updates.users, false);
        putChats(updates.chats, false);
        ArrayList<TLRPC.Chat> arrayList = updates.chats;
        if (arrayList != null && !arrayList.isEmpty()) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatDidCreated, Long.valueOf(updates.chats.get(0).id));
        } else {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatDidFailCreate, new Object[0]);
        }
    }

    public void convertToMegaGroup(Context context, long j, BaseFragment baseFragment, MessagesStorage.LongCallback longCallback) {
        convertToMegaGroup(context, j, baseFragment, longCallback, null);
    }

    public void convertToMegaGroup(final Context context, final long j, final BaseFragment baseFragment, final MessagesStorage.LongCallback longCallback, final Runnable runnable) {
        final TLRPC.TL_messages_migrateChat tL_messages_migrateChat = new TLRPC.TL_messages_migrateChat();
        tL_messages_migrateChat.chat_id = j;
        final AlertDialog alertDialog = context != null ? new AlertDialog(context, 3) : null;
        final int iSendRequest = getConnectionsManager().sendRequest(tL_messages_migrateChat, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$convertToMegaGroup$248(context, alertDialog, longCallback, j, runnable, baseFragment, tL_messages_migrateChat, tLObject, tL_error);
            }
        });
        if (alertDialog != null) {
            alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f$0.lambda$convertToMegaGroup$249(iSendRequest, dialogInterface);
                }
            });
            try {
                alertDialog.show();
            } catch (Exception unused) {
            }
        }
    }

    public void lambda$convertToMegaGroup$248(final Context context, final AlertDialog alertDialog, final MessagesStorage.LongCallback longCallback, final long j, Runnable runnable, final BaseFragment baseFragment, final TLRPC.TL_messages_migrateChat tL_messages_migrateChat, TLObject tLObject, final TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            if (context != null) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.lambda$convertToMegaGroup$245(context, alertDialog);
                    }
                });
            }
            final TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            processUpdates(updates, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.lambda$convertToMegaGroup$246(longCallback, updates, j);
                }
            });
            return;
        }
        if (runnable != null) {
            runnable.run();
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$convertToMegaGroup$247(longCallback, context, alertDialog, tL_error, baseFragment, tL_messages_migrateChat);
            }
        });
    }

    public static void lambda$convertToMegaGroup$245(Context context, AlertDialog alertDialog) {
        if (((Activity) context).isFinishing()) {
            return;
        }
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void lambda$convertToMegaGroup$246(MessagesStorage.LongCallback longCallback, TLRPC.Updates updates, long j) {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        TLRPC.InputChannel inputChannel;
        if (longCallback != null) {
            int i = 0;
            int i2 = 0;
            while (true) {
                chat = null;
                if (i2 >= updates.chats.size()) {
                    chat2 = null;
                    break;
                }
                chat2 = updates.chats.get(i2);
                if (j == chat2.id) {
                    break;
                } else {
                    i2++;
                }
            }
            if (chat2 == null || (inputChannel = chat2.migrated_to) == null) {
                return;
            }
            long j2 = inputChannel.channel_id;
            while (true) {
                if (i >= updates.chats.size()) {
                    break;
                }
                TLRPC.Chat chat3 = updates.chats.get(i);
                if (j2 == chat3.id) {
                    chat = chat3;
                    break;
                }
                i++;
            }
            if (chat != null) {
                longCallback.run(j2);
            }
        }
    }

    public void lambda$convertToMegaGroup$247(MessagesStorage.LongCallback longCallback, Context context, AlertDialog alertDialog, TLRPC.TL_error tL_error, BaseFragment baseFragment, TLRPC.TL_messages_migrateChat tL_messages_migrateChat) {
        if (longCallback != null) {
            longCallback.run(0L);
        }
        if (context == null || ((Activity) context).isFinishing()) {
            return;
        }
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        AlertsCreator.processError(this.currentAccount, tL_error, baseFragment, tL_messages_migrateChat, Boolean.FALSE);
    }

    public void lambda$convertToMegaGroup$249(int i, DialogInterface dialogInterface) {
        getConnectionsManager().cancelRequest(i, true);
    }

    public void convertToGigaGroup(final Context context, TLRPC.Chat chat, final BaseFragment baseFragment, final MessagesStorage.BooleanCallback booleanCallback) {
        final TLRPC.TL_channels_convertToGigagroup tL_channels_convertToGigagroup = new TLRPC.TL_channels_convertToGigagroup();
        tL_channels_convertToGigagroup.channel = getInputChannel(chat);
        AlertDialog alertDialog = context != null ? new AlertDialog(context, 3) : null;
        final AlertDialog alertDialog2 = alertDialog;
        final int iSendRequest = getConnectionsManager().sendRequest(tL_channels_convertToGigagroup, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$convertToGigaGroup$253(context, alertDialog2, booleanCallback, baseFragment, tL_channels_convertToGigagroup, tLObject, tL_error);
            }
        });
        if (alertDialog != null) {
            alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f$0.lambda$convertToGigaGroup$254(iSendRequest, dialogInterface);
                }
            });
            try {
                alertDialog.showDelayed(400L);
            } catch (Exception unused) {
            }
        }
    }

    public void lambda$convertToGigaGroup$253(final Context context, final AlertDialog alertDialog, final MessagesStorage.BooleanCallback booleanCallback, final BaseFragment baseFragment, final TLRPC.TL_channels_convertToGigagroup tL_channels_convertToGigagroup, TLObject tLObject, final TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            if (context != null) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.lambda$convertToGigaGroup$250(context, alertDialog);
                    }
                });
            }
            processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.lambda$convertToGigaGroup$251(booleanCallback);
                }
            });
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$convertToGigaGroup$252(booleanCallback, context, alertDialog, tL_error, baseFragment, tL_channels_convertToGigagroup);
            }
        });
    }

    public static void lambda$convertToGigaGroup$250(Context context, AlertDialog alertDialog) {
        if (((Activity) context).isFinishing()) {
            return;
        }
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void lambda$convertToGigaGroup$251(MessagesStorage.BooleanCallback booleanCallback) {
        if (booleanCallback != null) {
            booleanCallback.run(true);
        }
    }

    public void lambda$convertToGigaGroup$252(MessagesStorage.BooleanCallback booleanCallback, Context context, AlertDialog alertDialog, TLRPC.TL_error tL_error, BaseFragment baseFragment, TLRPC.TL_channels_convertToGigagroup tL_channels_convertToGigagroup) {
        if (booleanCallback != null) {
            booleanCallback.run(false);
        }
        if (context == null || ((Activity) context).isFinishing()) {
            return;
        }
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        AlertsCreator.processError(this.currentAccount, tL_error, baseFragment, tL_channels_convertToGigagroup, Boolean.FALSE);
    }

    public void lambda$convertToGigaGroup$254(int i, DialogInterface dialogInterface) {
        getConnectionsManager().cancelRequest(i, true);
    }

    public void addUsersToChannel(final long j, ArrayList<TLRPC.InputUser> arrayList, final BaseFragment baseFragment) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        final TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel = new TLRPC.TL_channels_inviteToChannel();
        tL_channels_inviteToChannel.channel = getInputChannel(j);
        tL_channels_inviteToChannel.users = arrayList;
        getConnectionsManager().sendRequest(tL_channels_inviteToChannel, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$addUsersToChannel$257(baseFragment, tL_channels_inviteToChannel, j, tLObject, tL_error);
            }
        });
    }

    public void lambda$addUsersToChannel$255(TLRPC.TL_error tL_error, BaseFragment baseFragment, TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel) {
        AlertsCreator.processError(this.currentAccount, tL_error, baseFragment, tL_channels_inviteToChannel, Boolean.TRUE);
    }

    public void lambda$addUsersToChannel$257(final BaseFragment baseFragment, final TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel, final long j, TLObject tLObject, final TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$addUsersToChannel$255(tL_error, baseFragment, tL_channels_inviteToChannel);
                }
            });
        } else if (tLObject instanceof TLRPC.TL_messages_invitedUsers) {
            final TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) tLObject;
            processUpdates(tL_messages_invitedUsers.updates, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$addUsersToChannel$256(tL_messages_invitedUsers, j);
                }
            });
        }
    }

    public void lambda$addUsersToChannel$256(TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, long j) {
        putUsers(tL_messages_invitedUsers.updates.users, false);
        putChats(tL_messages_invitedUsers.updates.chats, false);
        AlertsCreator.checkRestrictedInviteUsers(this.currentAccount, getChat(Long.valueOf(j)), tL_messages_invitedUsers);
    }

    public void setDefaultSendAs(final long j, long j2) {
        TLRPC.ChatFull chatFull = getChatFull(-j);
        if (chatFull != null) {
            chatFull.default_send_as = getPeer(j2);
            getMessagesStorage().updateChatInfo(chatFull, false);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateDefaultSendAsPeer, Long.valueOf(j), chatFull.default_send_as);
        }
        TLRPC.TL_messages_saveDefaultSendAs tL_messages_saveDefaultSendAs = new TLRPC.TL_messages_saveDefaultSendAs();
        tL_messages_saveDefaultSendAs.peer = getInputPeer(j);
        tL_messages_saveDefaultSendAs.send_as = getInputPeer(j2);
        getConnectionsManager().sendRequest(tL_messages_saveDefaultSendAs, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$setDefaultSendAs$258(j, tLObject, tL_error);
            }
        }, 64);
    }

    public void lambda$setDefaultSendAs$258(long j, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            long j2 = -j;
            if (getChatFull(j2) == null) {
                loadFullChat(j2, 0, true);
                return;
            }
            return;
        }
        if (tL_error == null || tL_error.code != 400) {
            return;
        }
        loadFullChat(-j, 0, true);
    }

    public void toggleChatNoForwards(long j, boolean z) {
        TLRPC.TL_messages_toggleNoForwards tL_messages_toggleNoForwards = new TLRPC.TL_messages_toggleNoForwards();
        tL_messages_toggleNoForwards.peer = getInputPeer(-j);
        tL_messages_toggleNoForwards.enabled = z;
        getConnectionsManager().sendRequest(tL_messages_toggleNoForwards, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$toggleChatNoForwards$260(tLObject, tL_error);
            }
        }, 64);
    }

    public void lambda$toggleChatNoForwards$260(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$toggleChatNoForwards$259();
                }
            });
        }
    }

    public void lambda$toggleChatNoForwards$259() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_CHAT));
    }

    public void toggleChatJoinToSend(long j, boolean z, final Runnable runnable, final Runnable runnable2) {
        TLRPC.TL_channels_toggleJoinToSend tL_channels_toggleJoinToSend = new TLRPC.TL_channels_toggleJoinToSend();
        tL_channels_toggleJoinToSend.channel = getInputChannel(j);
        tL_channels_toggleJoinToSend.enabled = z;
        getConnectionsManager().sendRequest(tL_channels_toggleJoinToSend, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$toggleChatJoinToSend$262(runnable, runnable2, tLObject, tL_error);
            }
        }, 64);
    }

    public void lambda$toggleChatJoinToSend$262(Runnable runnable, Runnable runnable2, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$toggleChatJoinToSend$261();
                }
            });
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (tL_error == null || "CHAT_NOT_MODIFIED".equals(tL_error.text)) {
            if (runnable != null) {
                runnable.run();
            }
        } else if (runnable2 != null) {
            runnable2.run();
        }
    }

    public void lambda$toggleChatJoinToSend$261() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_CHAT));
    }

    public void toggleChatJoinRequest(long j, boolean z, final Runnable runnable, final Runnable runnable2) {
        TLRPC.TL_channels_toggleJoinRequest tL_channels_toggleJoinRequest = new TLRPC.TL_channels_toggleJoinRequest();
        tL_channels_toggleJoinRequest.channel = getInputChannel(j);
        tL_channels_toggleJoinRequest.enabled = z;
        getConnectionsManager().sendRequest(tL_channels_toggleJoinRequest, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$toggleChatJoinRequest$264(runnable, runnable2, tLObject, tL_error);
            }
        }, 64);
    }

    public void lambda$toggleChatJoinRequest$264(Runnable runnable, Runnable runnable2, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$toggleChatJoinRequest$263();
                }
            });
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (tL_error == null || "CHAT_NOT_MODIFIED".equals(tL_error.text)) {
            if (runnable != null) {
                runnable.run();
            }
        } else if (runnable2 != null) {
            runnable2.run();
        }
    }

    public void lambda$toggleChatJoinRequest$263() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_CHAT));
    }

    public void toggleChannelSignatures(long j, boolean z, boolean z2) {
        TLRPC.Chat chat = getChat(Long.valueOf(j));
        if (chat != null) {
            chat.signatures = z;
            chat.signature_profiles = z2;
            putChat(chat, true);
        }
        TLRPC.TL_channels_toggleSignatures tL_channels_toggleSignatures = new TLRPC.TL_channels_toggleSignatures();
        tL_channels_toggleSignatures.channel = getInputChannel(j);
        tL_channels_toggleSignatures.signatures_enabled = z;
        tL_channels_toggleSignatures.profiles_enabled = z2;
        getConnectionsManager().sendRequest(tL_channels_toggleSignatures, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$toggleChannelSignatures$266(tLObject, tL_error);
            }
        }, 64);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateAllMessages, Long.valueOf(-j));
    }

    public void lambda$toggleChannelSignatures$266(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$toggleChannelSignatures$265();
                }
            });
        }
    }

    public void lambda$toggleChannelSignatures$265() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_CHAT));
    }

    public void toggleChannelForum(long j, boolean z, boolean z2) {
        TLRPC.TL_channels_toggleForum tL_channels_toggleForum = new TLRPC.TL_channels_toggleForum();
        tL_channels_toggleForum.channel = getInputChannel(j);
        tL_channels_toggleForum.enabled = z;
        tL_channels_toggleForum.tabs = z2;
        getConnectionsManager().sendRequest(tL_channels_toggleForum, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$toggleChannelForum$268(tLObject, tL_error);
            }
        }, 64);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatSwitchedForum, Long.valueOf(j), Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    public void lambda$toggleChannelForum$268(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$toggleChannelForum$267();
                }
            });
        }
    }

    public void lambda$toggleChannelForum$267() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_CHAT));
    }

    public void toggleChannelInvitesHistory(long j, boolean z) {
        TLRPC.TL_channels_togglePreHistoryHidden tL_channels_togglePreHistoryHidden = new TLRPC.TL_channels_togglePreHistoryHidden();
        tL_channels_togglePreHistoryHidden.channel = getInputChannel(j);
        tL_channels_togglePreHistoryHidden.enabled = z;
        getConnectionsManager().sendRequest(tL_channels_togglePreHistoryHidden, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$toggleChannelInvitesHistory$270(tLObject, tL_error);
            }
        }, 64);
    }

    public void lambda$toggleChannelInvitesHistory$270(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$toggleChannelInvitesHistory$269();
                }
            });
        }
    }

    public void lambda$toggleChannelInvitesHistory$269() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_CHAT));
    }

    public void updateChatAbout(long j, final String str, final TLRPC.ChatFull chatFull) {
        TLRPC.TL_messages_editChatAbout tL_messages_editChatAbout = new TLRPC.TL_messages_editChatAbout();
        tL_messages_editChatAbout.peer = getInputPeer(-j);
        tL_messages_editChatAbout.about = str;
        getConnectionsManager().sendRequest(tL_messages_editChatAbout, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$updateChatAbout$272(chatFull, str, tLObject, tL_error);
            }
        }, 64);
    }

    public void lambda$updateChatAbout$272(final TLRPC.ChatFull chatFull, final String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.TL_boolTrue) || chatFull == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$updateChatAbout$271(chatFull, str);
            }
        });
    }

    public void lambda$updateChatAbout$271(TLRPC.ChatFull chatFull, String str) {
        chatFull.about = str;
        getMessagesStorage().updateChatInfo(chatFull, false);
        NotificationCenter notificationCenter = getNotificationCenter();
        int i = NotificationCenter.chatInfoDidLoad;
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i, chatFull, 0, bool, bool);
    }

    public void updateChannelUserName(final BaseFragment baseFragment, final long j, final String str, final Runnable runnable, final Runnable runnable2) {
        final TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
        tL_channels_updateUsername.channel = getInputChannel(j);
        tL_channels_updateUsername.username = str;
        getConnectionsManager().sendRequest(tL_channels_updateUsername, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$updateChannelUserName$274(j, str, runnable, baseFragment, tL_channels_updateUsername, runnable2, tLObject, tL_error);
            }
        }, 64);
    }

    public void lambda$updateChannelUserName$274(final long j, final String str, final Runnable runnable, BaseFragment baseFragment, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2, TLObject tLObject, TLRPC.TL_error tL_error) {
        if ((tLObject instanceof TLRPC.TL_boolTrue) || (tL_error != null && "USERNAME_NOT_MODIFIED".equals(tL_error.text))) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$updateChannelUserName$273(j, str, runnable);
                }
            });
            return;
        }
        AlertsCreator.processError(UserConfig.selectedAccount, tL_error, baseFragment, tL_channels_updateUsername, new Object[0]);
        if (runnable2 != null) {
            runnable2.run();
        }
    }

    public void lambda$updateChannelUserName$273(long r5, java.lang.String r7, java.lang.Runnable r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$updateChannelUserName$273(long, java.lang.String, java.lang.Runnable):void");
    }

    public void sendBotStart(TLRPC.User user, String str) {
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_startBot tL_messages_startBot = new TLRPC.TL_messages_startBot();
        tL_messages_startBot.bot = getInputUser(user);
        tL_messages_startBot.peer = getInputPeer(user.id);
        tL_messages_startBot.start_param = str;
        tL_messages_startBot.random_id = Utilities.random.nextLong();
        getConnectionsManager().sendRequest(tL_messages_startBot, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$sendBotStart$275(tLObject, tL_error);
            }
        });
    }

    public void lambda$sendBotStart$275(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            return;
        }
        processUpdates((TLRPC.Updates) tLObject, false);
    }

    public boolean isJoiningChannel(long j) {
        return this.joiningToChannels.contains(Long.valueOf(j));
    }

    public void addUserToChat(long j, TLRPC.User user, int i, String str, BaseFragment baseFragment, Runnable runnable) {
        addUserToChat(j, user, i, str, baseFragment, false, runnable, null);
    }

    public void addUsersToChat(final TLRPC.Chat chat, BaseFragment baseFragment, ArrayList<TLRPC.User> arrayList, int i, final Consumer consumer, final Consumer consumer2, final Runnable runnable) {
        final int size = arrayList.size();
        final int[] iArr = {0};
        final TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
        long j = chat.id;
        for (int i2 = 0; i2 < size; i2++) {
            final TLRPC.User user = arrayList.get(i2);
            addUserToChat(j, user, i, null, baseFragment, false, new Runnable() {
                @Override
                public final void run() {
                    MessagesController.lambda$addUsersToChat$276(consumer, user);
                }
            }, new ErrorDelegate() {
                @Override
                public final boolean run(TLRPC.TL_error tL_error) {
                    return MessagesController.lambda$addUsersToChat$277(consumer2, user, tL_error);
                }
            }, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.lambda$addUsersToChat$279(tL_messages_invitedUsers, iArr, size, chat, runnable, (TLRPC.TL_messages_invitedUsers) obj);
                }
            });
            putUser(user, false);
        }
    }

    public static void lambda$addUsersToChat$276(Consumer consumer, TLRPC.User user) {
        if (consumer != null) {
            consumer.accept(user);
        }
    }

    public static boolean lambda$addUsersToChat$277(Consumer consumer, TLRPC.User user, TLRPC.TL_error tL_error) {
        if (consumer != null) {
            consumer.accept(user);
        }
        return tL_error == null || !"USER_PRIVACY_RESTRICTED".equals(tL_error.text);
    }

    public void lambda$addUsersToChat$279(final TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i, final TLRPC.Chat chat, Runnable runnable, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers2) {
        if (tL_messages_invitedUsers2 != null) {
            tL_messages_invitedUsers.missing_invitees.addAll(tL_messages_invitedUsers2.missing_invitees);
        }
        int i2 = iArr[0] + 1;
        iArr[0] = i2;
        if (i2 >= i) {
            if (!tL_messages_invitedUsers.missing_invitees.isEmpty()) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$addUsersToChat$278(chat, tL_messages_invitedUsers);
                    }
                });
            }
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void lambda$addUsersToChat$278(TLRPC.Chat chat, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers) {
        AlertsCreator.checkRestrictedInviteUsers(this.currentAccount, chat, tL_messages_invitedUsers);
    }

    public void addUserToChat(long j, TLRPC.User user, int i, String str, BaseFragment baseFragment, boolean z, Runnable runnable, ErrorDelegate errorDelegate) {
        addUserToChat(j, user, i, str, baseFragment, z, runnable, errorDelegate, null);
    }

    public void addUserToChat(final long j, final TLRPC.User user, int i, String str, final BaseFragment baseFragment, final boolean z, final Runnable runnable, final ErrorDelegate errorDelegate, final Utilities.Callback<TLRPC.TL_messages_invitedUsers> callback) {
        TLRPC.TL_messages_addChatUser tL_messages_addChatUser;
        if (user == null) {
            if (errorDelegate != null) {
                errorDelegate.run(null);
            }
            if (callback != null) {
                callback.run(null);
                return;
            }
            return;
        }
        final boolean zIsChannel = ChatObject.isChannel(j, this.currentAccount);
        final boolean z2 = zIsChannel && getChat(Long.valueOf(j)).megagroup;
        final TLRPC.InputUser inputUser = getInputUser(user);
        if (str != null && (!zIsChannel || z2)) {
            TLRPC.TL_messages_startBot tL_messages_startBot = new TLRPC.TL_messages_startBot();
            tL_messages_startBot.bot = inputUser;
            if (zIsChannel) {
                tL_messages_startBot.peer = getInputPeer(-j);
            } else {
                TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                tL_messages_startBot.peer = tL_inputPeerChat;
                tL_inputPeerChat.chat_id = j;
            }
            tL_messages_startBot.start_param = str;
            tL_messages_startBot.random_id = Utilities.random.nextLong();
            tL_messages_addChatUser = tL_messages_startBot;
        } else if (zIsChannel) {
            if (inputUser instanceof TLRPC.TL_inputUserSelf) {
                if (this.joiningToChannels.contains(Long.valueOf(j))) {
                    if (errorDelegate != null) {
                        errorDelegate.run(null);
                        return;
                    }
                    return;
                } else {
                    TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
                    tL_channels_joinChannel.channel = getInputChannel(j);
                    this.joiningToChannels.add(Long.valueOf(j));
                    tL_messages_addChatUser = tL_channels_joinChannel;
                }
            } else {
                TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel = new TLRPC.TL_channels_inviteToChannel();
                tL_channels_inviteToChannel.channel = getInputChannel(j);
                tL_channels_inviteToChannel.users.add(inputUser);
                tL_messages_addChatUser = tL_channels_inviteToChannel;
            }
        } else {
            TLRPC.TL_messages_addChatUser tL_messages_addChatUser2 = new TLRPC.TL_messages_addChatUser();
            tL_messages_addChatUser2.chat_id = j;
            tL_messages_addChatUser2.fwd_limit = i;
            tL_messages_addChatUser2.user_id = inputUser;
            tL_messages_addChatUser = tL_messages_addChatUser2;
        }
        final TLRPC.TL_messages_addChatUser tL_messages_addChatUser3 = tL_messages_addChatUser;
        getConnectionsManager().sendRequest(tL_messages_addChatUser3, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$addUserToChat$289(zIsChannel, inputUser, j, user, callback, z, runnable, errorDelegate, baseFragment, tL_messages_addChatUser3, z2, tLObject, tL_error);
            }
        });
    }

    public void lambda$addUserToChat$289(final boolean z, final TLRPC.InputUser inputUser, final long j, TLRPC.User user, final Utilities.Callback callback, boolean z2, Runnable runnable, final ErrorDelegate errorDelegate, final BaseFragment baseFragment, final TLObject tLObject, final boolean z3, TLObject tLObject2, final TLRPC.TL_error tL_error) {
        TLRPC.Updates updates;
        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers;
        boolean z4;
        if (z && (inputUser instanceof TLRPC.TL_inputUserSelf)) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$addUserToChat$280(j);
                }
            });
        }
        if (tL_error != null) {
            if ("PRIVACY_PREMIUM_REQUIRED".equals(tL_error.text)) {
                final TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers2 = new TLRPC.TL_messages_invitedUsers();
                tL_messages_invitedUsers2.updates = new TLRPC.TL_updates();
                TLRPC.TL_missingInvitee tL_missingInvitee = new TLRPC.TL_missingInvitee();
                tL_missingInvitee.user_id = user.id;
                tL_missingInvitee.premium_would_allow_invite = true;
                tL_missingInvitee.premium_required_for_pm = true;
                tL_messages_invitedUsers2.missing_invitees.add(tL_missingInvitee);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$addUserToChat$281(callback, tL_messages_invitedUsers2, j);
                    }
                });
                return;
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.lambda$addUserToChat$282(callback);
                }
            });
            if ("USER_ALREADY_PARTICIPANT".equals(tL_error.text) && z2) {
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            } else {
                if (errorDelegate != null) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$addUserToChat$283(errorDelegate, tL_error, baseFragment, tLObject, z, z3);
                        }
                    });
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$addUserToChat$284(errorDelegate, tL_error, baseFragment, tLObject, z, z3, inputUser);
                    }
                });
                return;
            }
        }
        if (tLObject2 instanceof TLRPC.TL_messages_invitedUsers) {
            tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) tLObject2;
            updates = tL_messages_invitedUsers.updates;
        } else if (tLObject2 instanceof TLRPC.Updates) {
            updates = (TLRPC.Updates) tLObject2;
            tL_messages_invitedUsers = null;
        } else {
            FileLog.e("unexpected " + tLObject2 + " in addUserToChat");
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.lambda$addUserToChat$285(callback);
                }
            });
            return;
        }
        int i = 0;
        while (true) {
            if (i >= updates.updates.size()) {
                z4 = false;
                break;
            }
            TLRPC.Update update = updates.updates.get(i);
            if ((update instanceof TLRPC.TL_updateNewChannelMessage) && (((TLRPC.TL_updateNewChannelMessage) update).message.action instanceof TLRPC.TL_messageActionChatAddUser)) {
                z4 = true;
                break;
            }
            i++;
        }
        processUpdates(updates, false);
        if (tL_messages_invitedUsers != null && !tL_messages_invitedUsers.missing_invitees.isEmpty()) {
            final TLRPC.Updates updates2 = updates;
            final TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers3 = tL_messages_invitedUsers;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$addUserToChat$286(updates2, callback, tL_messages_invitedUsers3, j);
                }
            });
            return;
        }
        if (z) {
            if (!z4 && (inputUser instanceof TLRPC.TL_inputUserSelf)) {
                generateJoinMessage(j, true);
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$addUserToChat$287(j);
                }
            }, 1000L);
        }
        if (z && (inputUser instanceof TLRPC.TL_inputUserSelf)) {
            getMessagesStorage().updateDialogsWithDeletedMessages(-j, j, new ArrayList<>(), null, true);
        }
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
        if (callback != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    callback.run(null);
                }
            });
        }
    }

    public void lambda$addUserToChat$280(long j) {
        this.joiningToChannels.remove(Long.valueOf(j));
    }

    public void lambda$addUserToChat$281(Utilities.Callback callback, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, long j) {
        if (callback != null) {
            callback.run(tL_messages_invitedUsers);
        } else {
            AlertsCreator.checkRestrictedInviteUsers(this.currentAccount, getChat(Long.valueOf(j)), tL_messages_invitedUsers);
        }
    }

    public static void lambda$addUserToChat$282(Utilities.Callback callback) {
        if (callback != null) {
            callback.run(null);
        }
    }

    public void lambda$addUserToChat$283(ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, BaseFragment baseFragment, TLObject tLObject, boolean z, boolean z2) {
        if (errorDelegate.run(tL_error)) {
            AlertsCreator.processError(this.currentAccount, tL_error, baseFragment, tLObject, Boolean.valueOf(z && !z2));
        }
    }

    public void lambda$addUserToChat$284(ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, BaseFragment baseFragment, TLObject tLObject, boolean z, boolean z2, TLRPC.InputUser inputUser) {
        if (errorDelegate == null) {
            AlertsCreator.processError(this.currentAccount, tL_error, baseFragment, tLObject, Boolean.valueOf(z && !z2));
        }
        if (z && (inputUser instanceof TLRPC.TL_inputUserSelf)) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_CHAT));
        }
    }

    public static void lambda$addUserToChat$285(Utilities.Callback callback) {
        if (callback != null) {
            callback.run(null);
        }
    }

    public void lambda$addUserToChat$286(TLRPC.Updates updates, Utilities.Callback callback, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, long j) {
        putUsers(updates.users, false);
        putChats(updates.chats, false);
        if (callback != null) {
            callback.run(tL_messages_invitedUsers);
        } else {
            AlertsCreator.checkRestrictedInviteUsers(this.currentAccount, getChat(Long.valueOf(j)), tL_messages_invitedUsers);
        }
    }

    public void lambda$addUserToChat$287(long j) {
        loadFullChat(j, 0, true);
    }

    public void deleteParticipantFromChat(long j, TLRPC.User user) {
        deleteParticipantFromChat(j, user, (TLRPC.Chat) null, false, false);
    }

    public void deleteParticipantFromChat(long j, TLRPC.InputPeer inputPeer) {
        deleteParticipantFromChat(j, inputPeer, false, false);
    }

    public void deleteParticipantFromChat(long j, TLRPC.InputPeer inputPeer, boolean z, boolean z2) {
        deleteParticipantFromChat(j, inputPeer, z, z2, (Runnable) null);
    }

    public void deleteParticipantFromChat(final long j, TLRPC.InputPeer inputPeer, boolean z, boolean z2, final Runnable runnable) {
        TLRPC.TL_messages_deleteChatUser tL_messages_deleteChatUser;
        TLRPC.TL_messages_deleteChatUser tL_messages_deleteChatUser2;
        if (inputPeer == null) {
            return;
        }
        TLRPC.Chat chat = getChat(Long.valueOf(j));
        boolean z3 = (inputPeer instanceof TLRPC.TL_inputPeerUser) && UserObject.isUserSelf(getMessagesController().getUser(Long.valueOf(inputPeer.user_id)));
        final boolean zIsChannel = ChatObject.isChannel(chat);
        if (zIsChannel) {
            if (z3) {
                if (chat.creator && z) {
                    TLRPC.TL_channels_deleteChannel tL_channels_deleteChannel = new TLRPC.TL_channels_deleteChannel();
                    tL_channels_deleteChannel.channel = getInputChannel(chat);
                    tL_messages_deleteChatUser2 = tL_channels_deleteChannel;
                } else {
                    TLRPC.TL_channels_leaveChannel tL_channels_leaveChannel = new TLRPC.TL_channels_leaveChannel();
                    tL_channels_leaveChannel.channel = getInputChannel(chat);
                    tL_messages_deleteChatUser2 = tL_channels_leaveChannel;
                }
                tL_messages_deleteChatUser = tL_messages_deleteChatUser2;
            } else {
                TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
                tL_channels_editBanned.channel = getInputChannel(chat);
                tL_channels_editBanned.participant = inputPeer;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = new TLRPC.TL_chatBannedRights();
                tL_channels_editBanned.banned_rights = tL_chatBannedRights;
                tL_chatBannedRights.view_messages = true;
                tL_chatBannedRights.send_media = true;
                tL_chatBannedRights.send_messages = true;
                tL_chatBannedRights.send_stickers = true;
                tL_chatBannedRights.send_gifs = true;
                tL_chatBannedRights.send_games = true;
                tL_chatBannedRights.send_inline = true;
                tL_chatBannedRights.embed_links = true;
                tL_chatBannedRights.pin_messages = true;
                tL_chatBannedRights.send_polls = true;
                tL_chatBannedRights.invite_users = true;
                tL_chatBannedRights.change_info = true;
                tL_messages_deleteChatUser = tL_channels_editBanned;
            }
        } else if (z) {
            TLRPC.TL_messages_deleteChat tL_messages_deleteChat = new TLRPC.TL_messages_deleteChat();
            tL_messages_deleteChat.chat_id = j;
            getConnectionsManager().sendRequest(tL_messages_deleteChat, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    MessagesController.lambda$deleteParticipantFromChat$290(tLObject, tL_error);
                }
            });
            return;
        } else {
            TLRPC.TL_messages_deleteChatUser tL_messages_deleteChatUser3 = new TLRPC.TL_messages_deleteChatUser();
            tL_messages_deleteChatUser3.chat_id = j;
            tL_messages_deleteChatUser3.user_id = getInputUser(inputPeer);
            tL_messages_deleteChatUser3.revoke_history = true;
            tL_messages_deleteChatUser = tL_messages_deleteChatUser3;
        }
        if (z3) {
            deleteDialog(-j, 0, z2);
        }
        final boolean z4 = z3;
        getConnectionsManager().sendRequest(tL_messages_deleteChatUser, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$deleteParticipantFromChat$292(zIsChannel, z4, j, runnable, tLObject, tL_error);
            }
        }, 64);
    }

    public void lambda$deleteParticipantFromChat$292(boolean z, boolean z2, final long j, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            return;
        }
        processUpdates((TLRPC.Updates) tLObject, false);
        if (z && !z2) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$deleteParticipantFromChat$291(j);
                }
            }, 1000L);
        }
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
    }

    public void lambda$deleteParticipantFromChat$291(long j) {
        loadFullChat(j, 0, true);
    }

    public void deleteParticipantFromChat(final long j, final TLRPC.User user, TLRPC.Chat chat, boolean z, boolean z2) {
        TLRPC.InputPeer inputPeer;
        TLRPC.TL_messages_deleteChatUser tL_messages_deleteChatUser;
        if (user == null && chat == null) {
            return;
        }
        if (user != null) {
            inputPeer = getInputPeer(user);
        } else {
            inputPeer = getInputPeer(chat);
        }
        TLRPC.Chat chat2 = getChat(Long.valueOf(j));
        final boolean zIsChannel = ChatObject.isChannel(chat2);
        if (zIsChannel) {
            if (UserObject.isUserSelf(user)) {
                if (chat2.creator && z) {
                    TLRPC.TL_channels_deleteChannel tL_channels_deleteChannel = new TLRPC.TL_channels_deleteChannel();
                    tL_channels_deleteChannel.channel = getInputChannel(chat2);
                    tL_messages_deleteChatUser = tL_channels_deleteChannel;
                } else {
                    TLRPC.TL_channels_leaveChannel tL_channels_leaveChannel = new TLRPC.TL_channels_leaveChannel();
                    tL_channels_leaveChannel.channel = getInputChannel(chat2);
                    tL_messages_deleteChatUser = tL_channels_leaveChannel;
                }
            } else {
                TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
                tL_channels_editBanned.channel = getInputChannel(chat2);
                tL_channels_editBanned.participant = inputPeer;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = new TLRPC.TL_chatBannedRights();
                tL_channels_editBanned.banned_rights = tL_chatBannedRights;
                tL_chatBannedRights.view_messages = true;
                tL_chatBannedRights.send_media = true;
                tL_chatBannedRights.send_messages = true;
                tL_chatBannedRights.send_stickers = true;
                tL_chatBannedRights.send_gifs = true;
                tL_chatBannedRights.send_games = true;
                tL_chatBannedRights.send_inline = true;
                tL_chatBannedRights.embed_links = true;
                tL_chatBannedRights.pin_messages = true;
                tL_chatBannedRights.send_polls = true;
                tL_chatBannedRights.invite_users = true;
                tL_chatBannedRights.change_info = true;
                tL_messages_deleteChatUser = tL_channels_editBanned;
            }
        } else if (z) {
            TLRPC.TL_messages_deleteChat tL_messages_deleteChat = new TLRPC.TL_messages_deleteChat();
            tL_messages_deleteChat.chat_id = j;
            getConnectionsManager().sendRequest(tL_messages_deleteChat, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    MessagesController.lambda$deleteParticipantFromChat$293(tLObject, tL_error);
                }
            });
            return;
        } else {
            TLRPC.TL_messages_deleteChatUser tL_messages_deleteChatUser2 = new TLRPC.TL_messages_deleteChatUser();
            tL_messages_deleteChatUser2.chat_id = j;
            tL_messages_deleteChatUser2.user_id = getInputUser(user);
            tL_messages_deleteChatUser2.revoke_history = true;
            tL_messages_deleteChatUser = tL_messages_deleteChatUser2;
        }
        if (UserObject.isUserSelf(user)) {
            deleteDialog(-j, 0, z2);
        }
        getConnectionsManager().sendRequest(tL_messages_deleteChatUser, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$deleteParticipantFromChat$295(zIsChannel, user, j, tLObject, tL_error);
            }
        }, 64);
    }

    public void lambda$deleteParticipantFromChat$295(boolean z, TLRPC.User user, final long j, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            return;
        }
        processUpdates((TLRPC.Updates) tLObject, false);
        if (!z || UserObject.isUserSelf(user)) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$deleteParticipantFromChat$294(j);
            }
        }, 1000L);
    }

    public void lambda$deleteParticipantFromChat$294(long j) {
        loadFullChat(j, 0, true);
    }

    public void changeChatTitle(long j, String str) {
        TLRPC.TL_messages_editChatTitle tL_messages_editChatTitle;
        if (ChatObject.isChannel(j, this.currentAccount)) {
            TLRPC.TL_channels_editTitle tL_channels_editTitle = new TLRPC.TL_channels_editTitle();
            tL_channels_editTitle.channel = getInputChannel(j);
            tL_channels_editTitle.title = str;
            tL_messages_editChatTitle = tL_channels_editTitle;
        } else {
            TLRPC.TL_messages_editChatTitle tL_messages_editChatTitle2 = new TLRPC.TL_messages_editChatTitle();
            tL_messages_editChatTitle2.chat_id = j;
            tL_messages_editChatTitle2.title = str;
            tL_messages_editChatTitle = tL_messages_editChatTitle2;
        }
        getConnectionsManager().sendRequest(tL_messages_editChatTitle, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$changeChatTitle$296(tLObject, tL_error);
            }
        }, 64);
    }

    public void lambda$changeChatTitle$296(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            return;
        }
        processUpdates((TLRPC.Updates) tLObject, false);
    }

    public void changeChatAvatar(final long j, final TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, final String str, final TLRPC.FileLocation fileLocation, final TLRPC.FileLocation fileLocation2, final Runnable runnable) {
        MessagesController messagesController;
        TLRPC.InputChatPhoto tL_inputChatPhotoEmpty;
        TLRPC.TL_messages_editChatPhoto tL_messages_editChatPhoto;
        if (tL_inputChatPhoto != null) {
            messagesController = this;
            tL_inputChatPhotoEmpty = tL_inputChatPhoto;
        } else if (inputFile != null || inputFile2 != null || videoSize != null) {
            TLRPC.TL_inputChatUploadedPhoto tL_inputChatUploadedPhoto = new TLRPC.TL_inputChatUploadedPhoto();
            if (inputFile != null) {
                tL_inputChatUploadedPhoto.file = inputFile;
                tL_inputChatUploadedPhoto.flags |= 1;
            }
            if (inputFile2 != null) {
                tL_inputChatUploadedPhoto.video = inputFile2;
                int i = tL_inputChatUploadedPhoto.flags;
                tL_inputChatUploadedPhoto.video_start_ts = d;
                tL_inputChatUploadedPhoto.flags = i | 6;
            }
            if (videoSize != null) {
                tL_inputChatUploadedPhoto.video_emoji_markup = videoSize;
                tL_inputChatUploadedPhoto.flags |= 8;
            }
            messagesController = this;
            tL_inputChatPhotoEmpty = tL_inputChatUploadedPhoto;
        } else {
            tL_inputChatPhotoEmpty = new TLRPC.TL_inputChatPhotoEmpty();
            messagesController = this;
        }
        if (ChatObject.isChannel(j, messagesController.currentAccount)) {
            TLRPC.TL_channels_editPhoto tL_channels_editPhoto = new TLRPC.TL_channels_editPhoto();
            tL_channels_editPhoto.channel = getInputChannel(j);
            tL_channels_editPhoto.photo = tL_inputChatPhotoEmpty;
            tL_messages_editChatPhoto = tL_channels_editPhoto;
        } else {
            TLRPC.TL_messages_editChatPhoto tL_messages_editChatPhoto2 = new TLRPC.TL_messages_editChatPhoto();
            tL_messages_editChatPhoto2.chat_id = j;
            tL_messages_editChatPhoto2.photo = tL_inputChatPhotoEmpty;
            tL_messages_editChatPhoto = tL_messages_editChatPhoto2;
        }
        getConnectionsManager().sendRequest(tL_messages_editChatPhoto, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$changeChatAvatar$298(tL_inputChatPhoto, fileLocation, fileLocation2, str, j, runnable, tLObject, tL_error);
            }
        }, 64);
    }

    public void lambda$changeChatAvatar$298(TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j, final Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.Photo photo;
        if (tL_error != null) {
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        if (tL_inputChatPhoto == null) {
            int size = updates.updates.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    photo = null;
                    break;
                }
                TLRPC.Update update = updates.updates.get(i);
                if (update instanceof TLRPC.TL_updateNewChannelMessage) {
                    TLRPC.MessageAction messageAction = ((TLRPC.TL_updateNewChannelMessage) update).message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionChatEditPhoto) {
                        photo = messageAction.photo;
                        if (photo instanceof TLRPC.TL_photo) {
                            break;
                        }
                    } else {
                        continue;
                    }
                    i++;
                } else {
                    if (update instanceof TLRPC.TL_updateNewMessage) {
                        TLRPC.MessageAction messageAction2 = ((TLRPC.TL_updateNewMessage) update).message.action;
                        if (messageAction2 instanceof TLRPC.TL_messageActionChatEditPhoto) {
                            photo = messageAction2.photo;
                            if (photo instanceof TLRPC.TL_photo) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                    i++;
                }
            }
            if (photo != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 150);
                TLRPC.VideoSize videoSize = photo.video_sizes.isEmpty() ? null : photo.video_sizes.get(0);
                if (closestPhotoSizeWithSize != null && fileLocation != null) {
                    getFileLoader().getPathToAttach(fileLocation, true).renameTo(getFileLoader().getPathToAttach(closestPhotoSizeWithSize, true));
                    ImageLoader.getInstance().replaceImageInCache(fileLocation.volume_id + "_" + fileLocation.local_id + "@50_50", closestPhotoSizeWithSize.location.volume_id + "_" + closestPhotoSizeWithSize.location.local_id + "@50_50", ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), true);
                }
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 800);
                if (closestPhotoSizeWithSize2 != null && fileLocation2 != null) {
                    getFileLoader().getPathToAttach(fileLocation2, true).renameTo(getFileLoader().getPathToAttach(closestPhotoSizeWithSize2, true));
                }
                if (videoSize != null && str != null) {
                    new File(str).renameTo(getFileLoader().getPathToAttach(videoSize, "mp4", true));
                }
                getDialogPhotos(-j).addPhotoAtStart(photo);
            }
        }
        processUpdates(updates, false);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$changeChatAvatar$297(runnable);
            }
        });
    }

    public void lambda$changeChatAvatar$297(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_AVATAR));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
    }

    public void unregistedPush() {
        if (getUserConfig().registeredForPush && SharedConfig.pushString.length() == 0) {
            TL_account.unregisterDevice unregisterdevice = new TL_account.unregisterDevice();
            unregisterdevice.token = SharedConfig.pushString;
            unregisterdevice.token_type = SharedConfig.pushType;
            for (int i = 0; i < 4; i++) {
                UserConfig userConfig = UserConfig.getInstance(i);
                if (i != this.currentAccount && userConfig.isClientActivated()) {
                    unregisterdevice.other_uids.add(Long.valueOf(userConfig.getClientUserId()));
                }
            }
            getConnectionsManager().sendRequest(unregisterdevice, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    MessagesController.lambda$unregistedPush$299(tLObject, tL_error);
                }
            });
        }
    }

    public void performLogout(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.performLogout(int):void");
    }

    public void lambda$performLogout$301(final TLObject tLObject, TLRPC.TL_error tL_error) {
        getConnectionsManager().cleanup(false);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.lambda$performLogout$300(tLObject);
            }
        });
    }

    public static void lambda$performLogout$300(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_auth_loggedOut) {
            TLRPC.TL_auth_loggedOut tL_auth_loggedOut = (TLRPC.TL_auth_loggedOut) tLObject;
            if (tL_auth_loggedOut.future_auth_token != null) {
                AuthTokensHelper.addLogOutToken(tL_auth_loggedOut);
            }
        }
    }

    public void registerForPush(final int i, final String str) {
        if (TextUtils.isEmpty(str) || this.registeringForPush || getUserConfig().getClientUserId() == 0) {
            return;
        }
        if (getUserConfig().registeredForPush && str.equals(SharedConfig.pushString)) {
            return;
        }
        this.registeringForPush = true;
        this.lastPushRegisterSendTime = SystemClock.elapsedRealtime();
        if (SharedConfig.pushAuthKey == null) {
            SharedConfig.pushAuthKey = new byte[256];
            Utilities.random.nextBytes(SharedConfig.pushAuthKey);
            SharedConfig.saveConfig();
        }
        TL_account.registerDevice registerdevice = new TL_account.registerDevice();
        registerdevice.token_type = i;
        registerdevice.token = str;
        registerdevice.no_muted = false;
        registerdevice.secret = SharedConfig.pushAuthKey;
        for (int i2 = 0; i2 < 4; i2++) {
            UserConfig userConfig = UserConfig.getInstance(i2);
            if (i2 != this.currentAccount && userConfig.isClientActivated()) {
                long clientUserId = userConfig.getClientUserId();
                registerdevice.other_uids.add(Long.valueOf(clientUserId));
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("add other uid = " + clientUserId + " for account " + this.currentAccount);
                }
            }
        }
        getConnectionsManager().sendRequest(registerdevice, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$registerForPush$303(i, str, tLObject, tL_error);
            }
        });
    }

    public void lambda$registerForPush$303(int i, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("account " + this.currentAccount + " registered for push, push type: " + i);
            }
            getUserConfig().registeredForPush = true;
            SharedConfig.pushString = str;
            SharedConfig.pushType = i;
            getUserConfig().saveConfig(false);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$registerForPush$302();
            }
        });
    }

    public void lambda$registerForPush$302() {
        this.registeringForPush = false;
    }

    public void loadCurrentState() {
        if (this.updatingState) {
            return;
        }
        this.updatingState = true;
        getConnectionsManager().sendRequest(new TLRPC.TL_updates_getState(), new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$loadCurrentState$304(tLObject, tL_error);
            }
        });
    }

    public void lambda$loadCurrentState$304(TLObject tLObject, TLRPC.TL_error tL_error) {
        this.updatingState = false;
        if (tL_error == null) {
            TLRPC.TL_updates_state tL_updates_state = (TLRPC.TL_updates_state) tLObject;
            getMessagesStorage().setLastDateValue(tL_updates_state.date);
            getMessagesStorage().setLastPtsValue(tL_updates_state.pts);
            getMessagesStorage().setLastSeqValue(tL_updates_state.seq);
            getMessagesStorage().setLastQtsValue(tL_updates_state.qts);
            for (int i = 0; i < 3; i++) {
                processUpdatesQueue(i, 2);
            }
            getMessagesStorage().saveDiffParams(getMessagesStorage().getLastSeqValue(), getMessagesStorage().getLastPtsValue(), getMessagesStorage().getLastDateValue(), getMessagesStorage().getLastQtsValue());
            return;
        }
        if (tL_error.code != 401) {
            loadCurrentState();
        }
    }

    private int getUpdateSeq(TLRPC.Updates updates) {
        if (updates instanceof TLRPC.TL_updatesCombined) {
            return updates.seq_start;
        }
        return updates.seq;
    }

    private void setUpdatesStartTime(int i, long j) {
        if (i == 0) {
            this.updatesStartWaitTimeSeq = j;
        } else if (i == 1) {
            this.updatesStartWaitTimePts = j;
        } else if (i == 2) {
            this.updatesStartWaitTimeQts = j;
        }
    }

    public long getUpdatesStartTime(int i) {
        if (i == 0) {
            return this.updatesStartWaitTimeSeq;
        }
        if (i == 1) {
            return this.updatesStartWaitTimePts;
        }
        if (i == 2) {
            return this.updatesStartWaitTimeQts;
        }
        return 0L;
    }

    private int isValidUpdate(TLRPC.Updates updates, int i) {
        if (i == 0) {
            int updateSeq = getUpdateSeq(updates);
            if (getMessagesStorage().getLastSeqValue() + 1 == updateSeq || getMessagesStorage().getLastSeqValue() == updateSeq) {
                return 0;
            }
            return getMessagesStorage().getLastSeqValue() < updateSeq ? 1 : 2;
        }
        if (i == 1) {
            if (updates.pts <= getMessagesStorage().getLastPtsValue()) {
                return 2;
            }
            return getMessagesStorage().getLastPtsValue() + updates.pts_count == updates.pts ? 0 : 1;
        }
        if (i != 2) {
            return 0;
        }
        if (updates.pts <= getMessagesStorage().getLastQtsValue()) {
            return 2;
        }
        return getMessagesStorage().getLastQtsValue() + updates.updates.size() == updates.pts ? 0 : 1;
    }

    private void processChannelsUpdatesQueue(long j, int i) {
        char c;
        ArrayList arrayList = (ArrayList) this.updatesQueueChannels.get(j);
        if (arrayList == null) {
            return;
        }
        int i2 = this.channelsPts.get(j);
        if (arrayList.isEmpty() || i2 == 0) {
            this.updatesQueueChannels.remove(j);
            return;
        }
        Collections.sort(arrayList, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return MessagesController.lambda$processChannelsUpdatesQueue$305((TLRPC.Updates) obj, (TLRPC.Updates) obj2);
            }
        });
        if (i == 2) {
            this.channelsPts.put(j, ((TLRPC.Updates) arrayList.get(0)).pts);
        }
        boolean z = false;
        while (arrayList.size() > 0) {
            TLRPC.Updates updates = (TLRPC.Updates) arrayList.get(0);
            int i3 = updates.pts;
            if (i3 <= i2) {
                c = 2;
            } else {
                c = updates.pts_count + i2 == i3 ? (char) 0 : (char) 1;
            }
            if (c == 0) {
                processUpdates(updates, true);
                if (arrayList.size() <= 0) {
                    break;
                }
                arrayList.remove(0);
                z = true;
            } else {
                if (c == 1) {
                    long j2 = this.updatesStartWaitTimeChannels.get(j);
                    if (j2 != 0 && (z || Math.abs(System.currentTimeMillis() - j2) <= 1500)) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("HOLE IN CHANNEL " + j + " UPDATES QUEUE - will wait more time");
                        }
                        if (z) {
                            this.updatesStartWaitTimeChannels.put(j, System.currentTimeMillis());
                            return;
                        }
                        return;
                    }
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("HOLE IN CHANNEL " + j + " UPDATES QUEUE - getChannelDifference ");
                    }
                    this.updatesStartWaitTimeChannels.delete(j);
                    this.updatesQueueChannels.remove(j);
                    getChannelDifference(j);
                    return;
                }
                if (arrayList.size() <= 0) {
                    break;
                } else {
                    arrayList.remove(0);
                }
            }
        }
        this.updatesQueueChannels.remove(j);
        this.updatesStartWaitTimeChannels.delete(j);
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("UPDATES CHANNEL " + j + " QUEUE PROCEED - OK");
        }
    }

    public static int lambda$processChannelsUpdatesQueue$305(TLRPC.Updates updates, TLRPC.Updates updates2) {
        return AndroidUtilities.compare(updates.pts, updates2.pts);
    }

    private void processUpdatesQueue(int i, int i2) {
        ArrayList<TLRPC.Updates> arrayList;
        if (i == 0) {
            arrayList = this.updatesQueueSeq;
            Collections.sort(arrayList, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    return this.f$0.lambda$processUpdatesQueue$306((TLRPC.Updates) obj, (TLRPC.Updates) obj2);
                }
            });
        } else if (i == 1) {
            arrayList = this.updatesQueuePts;
            Collections.sort(arrayList, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    return MessagesController.lambda$processUpdatesQueue$307((TLRPC.Updates) obj, (TLRPC.Updates) obj2);
                }
            });
        } else if (i == 2) {
            arrayList = this.updatesQueueQts;
            Collections.sort(arrayList, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    return MessagesController.lambda$processUpdatesQueue$308((TLRPC.Updates) obj, (TLRPC.Updates) obj2);
                }
            });
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            if (i2 == 2) {
                TLRPC.Updates updates = arrayList.get(0);
                if (i == 0) {
                    getMessagesStorage().setLastSeqValue(getUpdateSeq(updates));
                } else if (i == 1) {
                    getMessagesStorage().setLastPtsValue(updates.pts);
                } else {
                    getMessagesStorage().setLastQtsValue(updates.pts);
                }
            }
            boolean z = false;
            while (arrayList.size() > 0) {
                TLRPC.Updates updates2 = arrayList.get(0);
                int iIsValidUpdate = isValidUpdate(updates2, i);
                if (iIsValidUpdate == 0) {
                    processUpdates(updates2, true);
                    arrayList.remove(0);
                    z = true;
                } else {
                    if (iIsValidUpdate == 1) {
                        if (getUpdatesStartTime(i) != 0 && (z || Math.abs(System.currentTimeMillis() - getUpdatesStartTime(i)) <= 1500)) {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("HOLE IN UPDATES QUEUE - will wait more time");
                            }
                            if (z) {
                                setUpdatesStartTime(i, System.currentTimeMillis());
                                return;
                            }
                            return;
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("HOLE IN UPDATES QUEUE - getDifference");
                        }
                        setUpdatesStartTime(i, 0L);
                        arrayList.clear();
                        getDifference();
                        return;
                    }
                    arrayList.remove(0);
                }
            }
            arrayList.clear();
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("UPDATES QUEUE PROCEED - OK");
            }
        }
        setUpdatesStartTime(i, 0L);
    }

    public int lambda$processUpdatesQueue$306(TLRPC.Updates updates, TLRPC.Updates updates2) {
        return AndroidUtilities.compare(getUpdateSeq(updates), getUpdateSeq(updates2));
    }

    public static int lambda$processUpdatesQueue$307(TLRPC.Updates updates, TLRPC.Updates updates2) {
        return AndroidUtilities.compare(updates.pts, updates2.pts);
    }

    public static int lambda$processUpdatesQueue$308(TLRPC.Updates updates, TLRPC.Updates updates2) {
        return AndroidUtilities.compare(updates.pts, updates2.pts);
    }

    protected void loadUnknownChannel(final TLRPC.Chat chat, final long j) {
        Exception e;
        NativeByteBuffer nativeByteBuffer;
        if (!(chat instanceof TLRPC.TL_channel) || this.gettingUnknownChannels.indexOfKey(chat.id) >= 0) {
            return;
        }
        if (chat.access_hash == 0) {
            if (j != 0) {
                getMessagesStorage().removePendingTask(j);
                return;
            }
            return;
        }
        TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
        long j2 = chat.id;
        tL_inputPeerChannel.channel_id = j2;
        tL_inputPeerChannel.access_hash = chat.access_hash;
        this.gettingUnknownChannels.put(j2, Boolean.TRUE);
        TLRPC.TL_messages_getPeerDialogs tL_messages_getPeerDialogs = new TLRPC.TL_messages_getPeerDialogs();
        TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
        tL_inputDialogPeer.peer = tL_inputPeerChannel;
        tL_messages_getPeerDialogs.peers.add(tL_inputDialogPeer);
        if (j == 0) {
            try {
                nativeByteBuffer = new NativeByteBuffer(chat.getObjectSize() + 4);
                try {
                    nativeByteBuffer.writeInt32(0);
                    chat.serializeToStream(nativeByteBuffer);
                } catch (Exception e2) {
                    e = e2;
                    FileLog.e(e);
                    j = getMessagesStorage().createPendingTask(nativeByteBuffer);
                    getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            this.f$0.lambda$loadUnknownChannel$309(j, chat, tLObject, tL_error);
                        }
                    });
                }
            } catch (Exception e3) {
                e = e3;
                nativeByteBuffer = null;
            }
            j = getMessagesStorage().createPendingTask(nativeByteBuffer);
        }
        getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$loadUnknownChannel$309(j, chat, tLObject, tL_error);
            }
        });
    }

    public void lambda$loadUnknownChannel$309(long j, TLRPC.Chat chat, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
            if (!tL_messages_peerDialogs.dialogs.isEmpty() && !tL_messages_peerDialogs.chats.isEmpty()) {
                TLRPC.TL_dialog tL_dialog = (TLRPC.TL_dialog) tL_messages_peerDialogs.dialogs.get(0);
                TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                tL_messages_dialogs.dialogs.addAll(tL_messages_peerDialogs.dialogs);
                tL_messages_dialogs.messages.addAll(tL_messages_peerDialogs.messages);
                tL_messages_dialogs.users.addAll(tL_messages_peerDialogs.users);
                tL_messages_dialogs.chats.addAll(tL_messages_peerDialogs.chats);
                processLoadedDialogs(tL_messages_dialogs, null, null, tL_dialog.folder_id, 0, 1, this.DIALOGS_LOAD_TYPE_CHANNEL, false, false, false);
            }
        }
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
        this.gettingUnknownChannels.delete(chat.id);
    }

    public void startShortPoll(TLRPC.Chat chat, int i, boolean z) {
        startShortPoll(chat, i, z, null);
    }

    public void startShortPoll(final TLRPC.Chat chat, final int i, final boolean z, final Consumer consumer) {
        if (chat == null) {
            return;
        }
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$startShortPoll$312(chat, z, i, consumer);
            }
        });
    }

    public void lambda$startShortPoll$312(TLRPC.Chat chat, boolean z, int i, final Consumer consumer) {
        ArrayList arrayList = (ArrayList) this.needShortPollChannels.get(chat.id);
        ArrayList arrayList2 = (ArrayList) this.needShortPollOnlines.get(chat.id);
        if (z) {
            if (arrayList != null) {
                arrayList.remove(Integer.valueOf(i));
            }
            if (arrayList == null || arrayList.isEmpty()) {
                this.needShortPollChannels.delete(chat.id);
            }
            if (chat.megagroup) {
                if (arrayList2 != null) {
                    arrayList2.remove(Integer.valueOf(i));
                }
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    this.needShortPollOnlines.delete(chat.id);
                    return;
                }
                return;
            }
            return;
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.needShortPollChannels.put(chat.id, arrayList);
        }
        if (!arrayList.contains(Integer.valueOf(i))) {
            arrayList.add(Integer.valueOf(i));
        }
        if (this.shortPollChannels.indexOfKey(chat.id) < 0) {
            if (consumer != null) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.lambda$startShortPoll$310(consumer);
                    }
                });
            }
            getChannelDifference(chat.id, 3, 0L, null);
        } else if (consumer != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.lambda$startShortPoll$311(consumer);
                }
            });
        }
        if (!chat.megagroup || chat.monoforum) {
            return;
        }
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
            this.needShortPollOnlines.put(chat.id, arrayList2);
        }
        if (!arrayList2.contains(Integer.valueOf(i))) {
            arrayList2.add(Integer.valueOf(i));
        }
        if (this.shortPollOnlines.indexOfKey(chat.id) < 0) {
            this.shortPollOnlines.put(chat.id, 0);
        }
    }

    public static void lambda$startShortPoll$310(Consumer consumer) {
        consumer.accept(Boolean.TRUE);
    }

    public static void lambda$startShortPoll$311(Consumer consumer) {
        consumer.accept(Boolean.FALSE);
    }

    private void getChannelDifference(long j) {
        getChannelDifference(j, 0, 0L, null);
    }

    public static boolean isSupportUser(TLRPC.User user) {
        if (user != null) {
            if (!user.support) {
                long j = user.id;
                if (j == 777000 || j == 333000 || j == 4240000 || j == 4244000 || j == 4245000 || j == 4246000 || j == 410000 || j == 420000 || j == 431000 || j == 431415000 || j == 434000 || j == 4243000 || j == 439000 || j == 449000 || j == 450000 || j == 452000 || j == 454000 || j == 4254000 || j == 455000 || j == 460000 || j == 470000 || j == 479000 || j == 796000 || j == 482000 || j == 490000 || j == 496000 || j == 497000 || j == 498000 || j == 4298000) {
                }
            }
            return true;
        }
        return false;
    }

    protected void getChannelDifference(final long r17, final int r19, long r20, org.telegram.tgnet.TLRPC.InputChannel r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.getChannelDifference(long, int, long, org.telegram.tgnet.TLRPC$InputChannel):void");
    }

    public void lambda$getChannelDifference$313(long j) {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onReceivedChannelDifference, Long.valueOf(j));
    }

    public void lambda$getChannelDifference$314(long j) {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onReceivedChannelDifference, Long.valueOf(j));
    }

    public void lambda$getChannelDifference$315(long j) {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onReceivedChannelDifference, Long.valueOf(j));
    }

    public void lambda$getChannelDifference$316(long j) {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onReceivedChannelDifference, Long.valueOf(j));
    }

    public void lambda$getChannelDifference$328(final long j, final int i, final long j2, TLObject tLObject, final TLRPC.TL_error tL_error) {
        final TLRPC.Chat chat;
        if (tLObject == null) {
            if (tL_error != null) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$getChannelDifference$327(tL_error, j);
                    }
                });
                this.gettingDifferenceChannels.delete(j);
                if (j2 != 0) {
                    getMessagesStorage().removePendingTask(j2);
                    return;
                }
                return;
            }
            return;
        }
        final TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) tLObject;
        final LongSparseArray longSparseArray = new LongSparseArray();
        int i2 = 0;
        for (int i3 = 0; i3 < updates_channeldifference.users.size(); i3++) {
            TLRPC.User user = updates_channeldifference.users.get(i3);
            longSparseArray.put(user.id, user);
        }
        int i4 = 0;
        while (true) {
            if (i4 >= updates_channeldifference.chats.size()) {
                chat = null;
                break;
            }
            TLRPC.Chat chat2 = updates_channeldifference.chats.get(i4);
            if (chat2.id == j) {
                chat = chat2;
                break;
            }
            i4++;
        }
        final ArrayList arrayList = new ArrayList();
        if (!updates_channeldifference.other_updates.isEmpty()) {
            while (i2 < updates_channeldifference.other_updates.size()) {
                TLRPC.Update update = updates_channeldifference.other_updates.get(i2);
                if (update instanceof TLRPC.TL_updateMessageID) {
                    arrayList.add((TLRPC.TL_updateMessageID) update);
                    updates_channeldifference.other_updates.remove(i2);
                    i2--;
                }
                i2++;
            }
        }
        getMessagesStorage().putUsersAndChats(updates_channeldifference.users, updates_channeldifference.chats, true, true);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$getChannelDifference$317(updates_channeldifference);
            }
        });
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$getChannelDifference$326(arrayList, j, updates_channeldifference, chat, longSparseArray, i, j2);
            }
        });
    }

    public void lambda$getChannelDifference$317(TLRPC.updates_ChannelDifference updates_channeldifference) {
        putUsers(updates_channeldifference.users, false);
        putChats(updates_channeldifference.chats, false);
    }

    public void lambda$getChannelDifference$326(ArrayList arrayList, final long j, final TLRPC.updates_ChannelDifference updates_channeldifference, final TLRPC.Chat chat, final LongSparseArray longSparseArray, final int i, final long j2) {
        if (!arrayList.isEmpty()) {
            final SparseArray sparseArray = new SparseArray();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TLRPC.TL_updateMessageID tL_updateMessageID = (TLRPC.TL_updateMessageID) it.next();
                long[] jArrUpdateMessageStateAndId = getMessagesStorage().updateMessageStateAndId(tL_updateMessageID.random_id, -j, null, tL_updateMessageID.id, 0, false, -1, 0);
                if (jArrUpdateMessageStateAndId != null) {
                    sparseArray.put(tL_updateMessageID.id, jArrUpdateMessageStateAndId);
                }
            }
            if (sparseArray.size() != 0) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$getChannelDifference$318(sparseArray);
                    }
                });
            }
        }
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws InterruptedException {
                this.f$0.lambda$getChannelDifference$325(updates_channeldifference, j, chat, longSparseArray, i, j2);
            }
        });
    }

    public void lambda$getChannelDifference$318(SparseArray sparseArray) {
        for (int i = 0; i < sparseArray.size(); i++) {
            int iKeyAt = sparseArray.keyAt(i);
            long[] jArr = (long[]) sparseArray.valueAt(i);
            getSendMessagesHelper().processSentMessage((int) jArr[1]);
            NotificationCenter notificationCenter = getNotificationCenter();
            int i2 = NotificationCenter.messageReceivedByServer;
            Integer numValueOf = Integer.valueOf((int) jArr[1]);
            Integer numValueOf2 = Integer.valueOf(iKeyAt);
            Long lValueOf = Long.valueOf(jArr[0]);
            Boolean bool = Boolean.FALSE;
            notificationCenter.lambda$postNotificationNameOnUIThread$1(i2, numValueOf, numValueOf2, null, lValueOf, 0L, -1, bool);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageReceivedByServer2, Integer.valueOf((int) jArr[1]), Integer.valueOf(iKeyAt), null, Long.valueOf(jArr[0]), 0L, -1, bool);
        }
    }

    public void lambda$getChannelDifference$325(final org.telegram.tgnet.TLRPC.updates_ChannelDifference r23, final long r24, org.telegram.tgnet.TLRPC.Chat r26, androidx.collection.LongSparseArray r27, int r28, long r29) throws java.lang.InterruptedException {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$getChannelDifference$325(org.telegram.tgnet.TLRPC$updates_ChannelDifference, long, org.telegram.tgnet.TLRPC$Chat, androidx.collection.LongSparseArray, int, long):void");
    }

    public void lambda$getChannelDifference$319(LongSparseArray longSparseArray) {
        for (int i = 0; i < longSparseArray.size(); i++) {
            updateInterfaceWithMessages(longSparseArray.keyAt(i), (ArrayList) longSparseArray.valueAt(i), 0);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
    }

    public void lambda$getChannelDifference$321(final ArrayList arrayList, TLRPC.updates_ChannelDifference updates_channeldifference) {
        if (!arrayList.isEmpty()) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$getChannelDifference$320(arrayList);
                }
            });
        }
        getMessagesStorage().putMessages(updates_channeldifference.new_messages, true, false, false, getDownloadController().getAutodownloadMask(), 0, 0L);
    }

    public void lambda$getChannelDifference$320(ArrayList arrayList) {
        getNotificationsController().processNewMessages(arrayList, true, false, null);
    }

    public void lambda$getChannelDifference$323(final long j) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$getChannelDifference$322(j);
            }
        });
    }

    public void lambda$getChannelDifference$322(long j) {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onReceivedChannelDifference, Long.valueOf(j));
    }

    public void lambda$getChannelDifference$324(long j) {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onReceivedChannelDifference, Long.valueOf(j));
    }

    public void lambda$getChannelDifference$327(TLRPC.TL_error tL_error, long j) {
        checkChannelError(tL_error.text, j);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onReceivedChannelDifference, Long.valueOf(j));
    }

    private void checkChannelError(String str, long j) {
        str.hashCode();
        switch (str) {
            case "USER_BANNED_IN_CHANNEL":
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatInfoCantLoad, Long.valueOf(j), 2);
                break;
            case "CHANNEL_PRIVATE":
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatInfoCantLoad, Long.valueOf(j), 0);
                break;
            case "CHANNEL_PUBLIC_GROUP_NA":
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatInfoCantLoad, Long.valueOf(j), 1);
                break;
        }
    }

    public void getDifference() {
        getDifference(getMessagesStorage().getLastPtsValue(), getMessagesStorage().getLastDateValue(), getMessagesStorage().getLastQtsValue(), false);
    }

    public void getDifference(int i, final int i2, final int i3, boolean z) {
        registerForPush(SharedConfig.pushType, SharedConfig.pushString);
        if (getMessagesStorage().getLastPtsValue() == 0) {
            loadCurrentState();
            return;
        }
        if (z || !this.gettingDifference) {
            this.gettingDifference = true;
            TLRPC.TL_updates_getDifference tL_updates_getDifference = new TLRPC.TL_updates_getDifference();
            tL_updates_getDifference.pts = i;
            tL_updates_getDifference.date = i2;
            tL_updates_getDifference.qts = i3;
            if (this.getDifferenceFirstSync) {
                tL_updates_getDifference.flags |= 1;
                if (ApplicationLoader.isConnectedOrConnectingToWiFi()) {
                    tL_updates_getDifference.pts_total_limit = 5000;
                } else {
                    tL_updates_getDifference.pts_total_limit = 1000;
                }
                this.getDifferenceFirstSync = false;
            }
            if (tL_updates_getDifference.date == 0) {
                tL_updates_getDifference.date = getConnectionsManager().getCurrentTime();
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("start getDifference with date = " + i2 + " pts = " + i + " qts = " + i3);
                FileLog.d("getDifference: isUpdating = true");
            }
            getConnectionsManager().setIsUpdating(true);
            getConnectionsManager().sendRequest(tL_updates_getDifference, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$getDifference$338(i2, i3, tLObject, tL_error);
                }
            });
        }
    }

    public void lambda$getDifference$338(final int i, final int i2, TLObject tLObject, TLRPC.TL_error tL_error) {
        int i3 = 0;
        if (tL_error == null) {
            final TLRPC.updates_Difference updates_difference = (TLRPC.updates_Difference) tLObject;
            if (updates_difference instanceof TLRPC.TL_updates_differenceTooLong) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$getDifference$329(updates_difference, i, i2);
                    }
                });
                return;
            }
            if (updates_difference instanceof TLRPC.TL_updates_differenceSlice) {
                TLRPC.TL_updates_state tL_updates_state = updates_difference.intermediate_state;
                getDifference(tL_updates_state.pts, tL_updates_state.date, tL_updates_state.qts, true);
            }
            final LongSparseArray longSparseArray = new LongSparseArray();
            final LongSparseArray longSparseArray2 = new LongSparseArray();
            for (int i4 = 0; i4 < updates_difference.users.size(); i4++) {
                TLRPC.User user = updates_difference.users.get(i4);
                longSparseArray.put(user.id, user);
            }
            for (int i5 = 0; i5 < updates_difference.chats.size(); i5++) {
                TLRPC.Chat chat = updates_difference.chats.get(i5);
                longSparseArray2.put(chat.id, chat);
            }
            final ArrayList arrayList = new ArrayList();
            if (!updates_difference.other_updates.isEmpty()) {
                while (i3 < updates_difference.other_updates.size()) {
                    TLRPC.Update update = updates_difference.other_updates.get(i3);
                    if (update instanceof TLRPC.TL_updateMessageID) {
                        arrayList.add((TLRPC.TL_updateMessageID) update);
                        updates_difference.other_updates.remove(i3);
                    } else {
                        if (getUpdateType(update) == 2) {
                            long updateChannelId = getUpdateChannelId(update);
                            int channelPtsSync = this.channelsPts.get(updateChannelId);
                            if (channelPtsSync == 0 && (channelPtsSync = getMessagesStorage().getChannelPtsSync(updateChannelId)) != 0) {
                                this.channelsPts.put(updateChannelId, channelPtsSync);
                            }
                            if (channelPtsSync != 0 && getUpdatePts(update) <= channelPtsSync) {
                                updates_difference.other_updates.remove(i3);
                            }
                        }
                        i3++;
                    }
                    i3--;
                    i3++;
                }
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$getDifference$330(updates_difference);
                }
            });
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$getDifference$337(updates_difference, arrayList, longSparseArray, longSparseArray2);
                }
            });
            return;
        }
        this.gettingDifference = false;
        getConnectionsManager().setIsUpdating(false);
        FileLog.d("received: isUpdating = false");
    }

    public void lambda$getDifference$329(TLRPC.updates_Difference updates_difference, int i, int i2) {
        this.loadedFullUsers.clear();
        this.loadedFullChats.clear();
        resetDialogs(true, getMessagesStorage().getLastSeqValue(), updates_difference.pts, i, i2);
        getStoriesController().cleanup();
    }

    public void lambda$getDifference$330(TLRPC.updates_Difference updates_difference) {
        this.loadedFullUsers.clear();
        this.loadedFullChats.clear();
        putUsers(updates_difference.users, false);
        putChats(updates_difference.chats, false);
    }

    public void lambda$getDifference$337(final TLRPC.updates_Difference updates_difference, ArrayList arrayList, final LongSparseArray longSparseArray, final LongSparseArray longSparseArray2) {
        getMessagesStorage().putUsersAndChats(updates_difference.users, updates_difference.chats, true, false);
        if (!arrayList.isEmpty()) {
            final SparseArray sparseArray = new SparseArray();
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC.TL_updateMessageID tL_updateMessageID = (TLRPC.TL_updateMessageID) arrayList.get(i);
                long[] jArrUpdateMessageStateAndId = getMessagesStorage().updateMessageStateAndId(tL_updateMessageID.random_id, 0L, null, tL_updateMessageID.id, 0, false, -1, 0);
                if (jArrUpdateMessageStateAndId != null) {
                    sparseArray.put(tL_updateMessageID.id, jArrUpdateMessageStateAndId);
                }
            }
            if (sparseArray.size() != 0) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$getDifference$331(sparseArray);
                    }
                });
            }
        }
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws InterruptedException {
                this.f$0.lambda$getDifference$336(updates_difference, longSparseArray, longSparseArray2);
            }
        });
    }

    public void lambda$getDifference$331(SparseArray sparseArray) {
        for (int i = 0; i < sparseArray.size(); i++) {
            int iKeyAt = sparseArray.keyAt(i);
            long[] jArr = (long[]) sparseArray.valueAt(i);
            getSendMessagesHelper().processSentMessage((int) jArr[1]);
            NotificationCenter notificationCenter = getNotificationCenter();
            int i2 = NotificationCenter.messageReceivedByServer;
            Integer numValueOf = Integer.valueOf((int) jArr[1]);
            Integer numValueOf2 = Integer.valueOf(iKeyAt);
            Long lValueOf = Long.valueOf(jArr[0]);
            Boolean bool = Boolean.FALSE;
            notificationCenter.lambda$postNotificationNameOnUIThread$1(i2, numValueOf, numValueOf2, null, lValueOf, 0L, -1, bool);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageReceivedByServer2, Integer.valueOf((int) jArr[1]), Integer.valueOf(iKeyAt), null, Long.valueOf(jArr[0]), 0L, -1, bool);
        }
    }

    public void lambda$getDifference$336(final org.telegram.tgnet.TLRPC.updates_Difference r19, androidx.collection.LongSparseArray r20, androidx.collection.LongSparseArray r21) throws java.lang.InterruptedException {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$getDifference$336(org.telegram.tgnet.TLRPC$updates_Difference, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray):void");
    }

    public void lambda$getDifference$335(final ArrayList arrayList, final TLRPC.updates_Difference updates_difference, LongSparseArray longSparseArray) {
        if (!arrayList.isEmpty()) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$getDifference$332(arrayList, updates_difference);
                }
            });
        }
        getMessagesStorage().putMessages(updates_difference.new_messages, true, false, false, getDownloadController().getAutodownloadMask(), 0, 0L);
        for (int i = 0; i < longSparseArray.size(); i++) {
            final long jKeyAt = longSparseArray.keyAt(i);
            final ArrayList<MessageObject> arrayList2 = (ArrayList) longSparseArray.valueAt(i);
            getMediaDataController().loadReplyMessagesForMessages(arrayList2, jKeyAt, 0, 0L, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$getDifference$334(jKeyAt, arrayList2);
                }
            }, 0, null);
        }
    }

    public void lambda$getDifference$332(ArrayList arrayList, TLRPC.updates_Difference updates_difference) {
        getNotificationsController().processNewMessages(arrayList, !(updates_difference instanceof TLRPC.TL_updates_differenceSlice), false, null);
    }

    public void lambda$getDifference$334(final long j, final ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$getDifference$333(j, arrayList);
            }
        });
    }

    public void lambda$getDifference$333(long j, ArrayList arrayList) {
        updateInterfaceWithMessages(j, arrayList, 0);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
    }

    public void markDialogAsUnread(long j, TLRPC.InputPeer inputPeer, final long j2) {
        NativeByteBuffer nativeByteBuffer;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.dialogs_dict.get(j);
        NativeByteBuffer nativeByteBuffer2 = null;
        if (dialog != null) {
            dialog.unread_mark = true;
            if (dialog.unread_count == 0 && !isDialogMuted(j, 0L)) {
                this.unreadUnmutedDialogs++;
            }
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_READ_DIALOG_MESSAGE));
            getMessagesStorage().setDialogUnread(j, true);
            int i = 0;
            while (true) {
                DialogFilter[] dialogFilterArr = this.selectedDialogFilter;
                if (i < dialogFilterArr.length) {
                    DialogFilter dialogFilter = dialogFilterArr[i];
                    if (dialogFilter != null && (dialogFilter.flags & DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0) {
                        sortDialogs(null);
                        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
        }
        if (DialogObject.isEncryptedDialog(j)) {
            return;
        }
        TLRPC.TL_messages_markDialogUnread tL_messages_markDialogUnread = new TLRPC.TL_messages_markDialogUnread();
        tL_messages_markDialogUnread.unread = true;
        if (inputPeer == null) {
            inputPeer = getInputPeer(j);
        }
        if (inputPeer instanceof TLRPC.TL_inputPeerEmpty) {
            return;
        }
        TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
        tL_inputDialogPeer.peer = inputPeer;
        tL_messages_markDialogUnread.peer = tL_inputDialogPeer;
        if (j2 == 0) {
            try {
                nativeByteBuffer = new NativeByteBuffer(inputPeer.getObjectSize() + 12);
            } catch (Exception e) {
                e = e;
            }
            try {
                nativeByteBuffer.writeInt32(9);
                nativeByteBuffer.writeInt64(j);
                inputPeer.serializeToStream(nativeByteBuffer);
            } catch (Exception e2) {
                e = e2;
                nativeByteBuffer2 = nativeByteBuffer;
                FileLog.e(e);
                nativeByteBuffer = nativeByteBuffer2;
                j2 = getMessagesStorage().createPendingTask(nativeByteBuffer);
                getConnectionsManager().sendRequest(tL_messages_markDialogUnread, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        this.f$0.lambda$markDialogAsUnread$339(j2, tLObject, tL_error);
                    }
                });
            }
            j2 = getMessagesStorage().createPendingTask(nativeByteBuffer);
        }
        getConnectionsManager().sendRequest(tL_messages_markDialogUnread, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$markDialogAsUnread$339(j2, tLObject, tL_error);
            }
        });
    }

    public void lambda$markDialogAsUnread$339(long j, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
    }

    public void loadUnreadDialogs() {
        if (this.loadingUnreadDialogs || getUserConfig().unreadDialogsLoaded) {
            return;
        }
        this.loadingUnreadDialogs = true;
        getConnectionsManager().sendRequest(new TLRPC.TL_messages_getDialogUnreadMarks(), new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$loadUnreadDialogs$341(tLObject, tL_error);
            }
        });
    }

    public void lambda$loadUnreadDialogs$341(final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$loadUnreadDialogs$340(tLObject);
            }
        });
    }

    public void lambda$loadUnreadDialogs$340(TLObject tLObject) {
        if (tLObject instanceof Vector) {
            Vector vector = (Vector) tLObject;
            int size = vector.objects.size();
            for (int i = 0; i < size; i++) {
                TLRPC.DialogPeer dialogPeer = (TLRPC.DialogPeer) vector.objects.get(i);
                if (dialogPeer instanceof TLRPC.TL_dialogPeer) {
                    TLRPC.Peer peer = ((TLRPC.TL_dialogPeer) dialogPeer).peer;
                    long j = peer.user_id;
                    if (j == 0) {
                        long j2 = peer.chat_id;
                        j = j2 != 0 ? -j2 : -peer.channel_id;
                    }
                    getMessagesStorage().setDialogUnread(j, true);
                    TLRPC.Dialog dialog = (TLRPC.Dialog) this.dialogs_dict.get(j);
                    if (dialog != null && !dialog.unread_mark) {
                        dialog.unread_mark = true;
                        if (dialog.unread_count == 0 && !isDialogMuted(j, 0L)) {
                            this.unreadUnmutedDialogs++;
                        }
                    }
                }
            }
            getUserConfig().unreadDialogsLoaded = true;
            getUserConfig().saveConfig(false);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_READ_DIALOG_MESSAGE));
            this.loadingUnreadDialogs = false;
        }
    }

    public void reorderPinnedDialogs(int i, ArrayList<TLRPC.InputDialogPeer> arrayList, final long j) {
        NativeByteBuffer nativeByteBuffer;
        TLRPC.TL_messages_reorderPinnedDialogs tL_messages_reorderPinnedDialogs = new TLRPC.TL_messages_reorderPinnedDialogs();
        tL_messages_reorderPinnedDialogs.folder_id = i;
        tL_messages_reorderPinnedDialogs.force = true;
        if (j == 0) {
            ArrayList<TLRPC.Dialog> dialogs = getDialogs(i);
            if (dialogs.isEmpty()) {
                return;
            }
            ArrayList<Long> arrayList2 = new ArrayList<>();
            ArrayList<Integer> arrayList3 = new ArrayList<>();
            int size = dialogs.size();
            int objectSize = 0;
            for (int i2 = 0; i2 < size; i2++) {
                TLRPC.Dialog dialog = dialogs.get(i2);
                if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                    if (!dialog.pinned) {
                        if (dialog.id != this.promoDialogId) {
                            break;
                        }
                    } else {
                        arrayList2.add(Long.valueOf(dialog.id));
                        arrayList3.add(Integer.valueOf(dialog.pinnedNum));
                        if (!DialogObject.isEncryptedDialog(dialog.id)) {
                            TLRPC.InputPeer inputPeer = getInputPeer(dialog.id);
                            TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                            tL_inputDialogPeer.peer = inputPeer;
                            tL_messages_reorderPinnedDialogs.order.add(tL_inputDialogPeer);
                            objectSize += tL_inputDialogPeer.getObjectSize();
                        }
                    }
                }
            }
            getMessagesStorage().setDialogsPinned(arrayList2, arrayList3);
            try {
                nativeByteBuffer = new NativeByteBuffer(objectSize + 12);
                try {
                    nativeByteBuffer.writeInt32(16);
                    nativeByteBuffer.writeInt32(i);
                    nativeByteBuffer.writeInt32(tL_messages_reorderPinnedDialogs.order.size());
                    int size2 = tL_messages_reorderPinnedDialogs.order.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        tL_messages_reorderPinnedDialogs.order.get(i3).serializeToStream(nativeByteBuffer);
                    }
                } catch (Exception e) {
                    e = e;
                    FileLog.e(e);
                    j = getMessagesStorage().createPendingTask(nativeByteBuffer);
                    getConnectionsManager().sendRequest(tL_messages_reorderPinnedDialogs, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            this.f$0.lambda$reorderPinnedDialogs$342(j, tLObject, tL_error);
                        }
                    });
                }
            } catch (Exception e2) {
                e = e2;
                nativeByteBuffer = null;
            }
            j = getMessagesStorage().createPendingTask(nativeByteBuffer);
        } else {
            tL_messages_reorderPinnedDialogs.order = arrayList;
        }
        getConnectionsManager().sendRequest(tL_messages_reorderPinnedDialogs, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$reorderPinnedDialogs$342(j, tLObject, tL_error);
            }
        });
    }

    public void lambda$reorderPinnedDialogs$342(long j, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
    }

    public boolean pinDialog(long j, boolean z, TLRPC.InputPeer inputPeer, long j2) {
        NativeByteBuffer nativeByteBuffer;
        final long jCreatePendingTask;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.dialogs_dict.get(j);
        if (dialog == null || dialog.pinned == z) {
            return dialog != null;
        }
        int i = dialog.folder_id;
        ArrayList<TLRPC.Dialog> dialogs = getDialogs(i);
        dialog.pinned = z;
        if (z) {
            int iMax = 0;
            for (int i2 = 0; i2 < dialogs.size(); i2++) {
                TLRPC.Dialog dialog2 = dialogs.get(i2);
                if (!(dialog2 instanceof TLRPC.TL_dialogFolder)) {
                    if (!dialog2.pinned) {
                        if (dialog2.id != this.promoDialogId) {
                            break;
                        }
                    } else {
                        iMax = Math.max(dialog2.pinnedNum, iMax);
                    }
                }
            }
            dialog.pinnedNum = iMax + 1;
        } else {
            dialog.pinnedNum = 0;
        }
        NativeByteBuffer nativeByteBuffer2 = null;
        sortDialogs(null);
        if (!z && !dialogs.isEmpty() && dialogs.get(dialogs.size() - 1) == dialog && !this.dialogsEndReached.get(i)) {
            dialogs.remove(dialogs.size() - 1);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
        if (!DialogObject.isEncryptedDialog(j) && j2 != -1) {
            TLRPC.TL_messages_toggleDialogPin tL_messages_toggleDialogPin = new TLRPC.TL_messages_toggleDialogPin();
            tL_messages_toggleDialogPin.pinned = z;
            TLRPC.InputPeer inputPeer2 = inputPeer == null ? getInputPeer(j) : inputPeer;
            if (inputPeer2 instanceof TLRPC.TL_inputPeerEmpty) {
                return false;
            }
            TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
            tL_inputDialogPeer.peer = inputPeer2;
            tL_messages_toggleDialogPin.peer = tL_inputDialogPeer;
            if (j2 == 0) {
                try {
                    nativeByteBuffer = new NativeByteBuffer(inputPeer2.getObjectSize() + 16);
                } catch (Exception e) {
                    e = e;
                }
                try {
                    nativeByteBuffer.writeInt32(4);
                    nativeByteBuffer.writeInt64(j);
                    nativeByteBuffer.writeBool(z);
                    inputPeer2.serializeToStream(nativeByteBuffer);
                } catch (Exception e2) {
                    e = e2;
                    nativeByteBuffer2 = nativeByteBuffer;
                    FileLog.e(e);
                    nativeByteBuffer = nativeByteBuffer2;
                    jCreatePendingTask = getMessagesStorage().createPendingTask(nativeByteBuffer);
                    getConnectionsManager().sendRequest(tL_messages_toggleDialogPin, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            this.f$0.lambda$pinDialog$343(jCreatePendingTask, tLObject, tL_error);
                        }
                    });
                    getMessagesStorage().setDialogPinned(j, dialog.pinnedNum);
                    return true;
                }
                jCreatePendingTask = getMessagesStorage().createPendingTask(nativeByteBuffer);
            } else {
                jCreatePendingTask = j2;
            }
            getConnectionsManager().sendRequest(tL_messages_toggleDialogPin, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$pinDialog$343(jCreatePendingTask, tLObject, tL_error);
                }
            });
        }
        getMessagesStorage().setDialogPinned(j, dialog.pinnedNum);
        return true;
    }

    public void lambda$pinDialog$343(long j, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
    }

    public void loadPinnedDialogs(final int i, long j, ArrayList<Long> arrayList) {
        if (this.loadingPinnedDialogs.indexOfKey(i) >= 0 || getUserConfig().isPinnedDialogsLoaded(i)) {
            return;
        }
        this.loadingPinnedDialogs.put(i, 1);
        TLRPC.TL_messages_getPinnedDialogs tL_messages_getPinnedDialogs = new TLRPC.TL_messages_getPinnedDialogs();
        tL_messages_getPinnedDialogs.folder_id = i;
        getConnectionsManager().sendRequest(tL_messages_getPinnedDialogs, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$loadPinnedDialogs$346(i, tLObject, tL_error);
            }
        });
    }

    public void lambda$loadPinnedDialogs$346(final int r19, org.telegram.tgnet.TLObject r20, org.telegram.tgnet.TLRPC.TL_error r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$loadPinnedDialogs$346(int, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    public void lambda$loadPinnedDialogs$345(final int i, final ArrayList arrayList, final boolean z, final TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, final LongSparseArray longSparseArray, final TLRPC.TL_messages_dialogs tL_messages_dialogs) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$loadPinnedDialogs$344(i, arrayList, z, tL_messages_peerDialogs, longSparseArray, tL_messages_dialogs);
            }
        });
    }

    public void lambda$loadPinnedDialogs$344(int i, ArrayList arrayList, boolean z, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, LongSparseArray longSparseArray, TLRPC.TL_messages_dialogs tL_messages_dialogs) {
        boolean z2;
        boolean z3;
        boolean z4;
        ArrayList<Integer> arrayList2;
        ArrayList arrayList3;
        this.loadingPinnedDialogs.delete(i);
        applyDialogsNotificationsSettings(arrayList);
        ArrayList<TLRPC.Dialog> dialogs = getDialogs(i);
        int i2 = z ? 1 : 0;
        int i3 = 0;
        int iMax = 0;
        boolean z5 = false;
        while (true) {
            z2 = true;
            if (i3 >= dialogs.size()) {
                break;
            }
            TLRPC.Dialog dialog = dialogs.get(i3);
            if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                if (DialogObject.isEncryptedDialog(dialog.id)) {
                    if (i2 < arrayList.size()) {
                        arrayList.add(i2, dialog);
                    } else {
                        arrayList.add(dialog);
                    }
                    i2++;
                } else if (!dialog.pinned) {
                    if (dialog.id != this.promoDialogId) {
                        break;
                    }
                } else {
                    iMax = Math.max(dialog.pinnedNum, iMax);
                    dialog.pinned = false;
                    dialog.pinnedNum = 0;
                    i2++;
                    z5 = true;
                }
            }
            i3++;
        }
        ArrayList<Long> arrayList4 = new ArrayList<>();
        if (arrayList.isEmpty()) {
            z3 = false;
        } else {
            putUsers(tL_messages_peerDialogs.users, false);
            putChats(tL_messages_peerDialogs.chats, false);
            ArrayList<Long> arrayList5 = new ArrayList<>();
            ArrayList<Integer> arrayList6 = new ArrayList<>();
            int size = arrayList.size();
            int i4 = 0;
            z3 = false;
            while (i4 < size) {
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList.get(i4);
                dialog2.pinnedNum = (size - i4) + iMax;
                arrayList4.add(Long.valueOf(dialog2.id));
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) this.dialogs_dict.get(dialog2.id);
                if (dialog3 != null) {
                    dialog3.pinned = z2;
                    dialog3.pinnedNum = dialog2.pinnedNum;
                    arrayList5.add(Long.valueOf(dialog2.id));
                    arrayList6.add(Integer.valueOf(dialog2.pinnedNum));
                    arrayList2 = arrayList6;
                } else {
                    this.dialogs_dict.put(dialog2.id, dialog2);
                    ArrayList arrayList7 = (ArrayList) longSparseArray.get(dialog2.id);
                    arrayList2 = arrayList6;
                    this.dialogMessage.put(dialog2.id, arrayList7);
                    if (arrayList7 != null) {
                        int i5 = 0;
                        while (i5 < arrayList7.size()) {
                            MessageObject messageObject = (MessageObject) arrayList7.get(i5);
                            if (messageObject != null) {
                                arrayList3 = arrayList7;
                                if (messageObject.messageOwner.peer_id.channel_id == 0) {
                                    this.dialogMessagesByIds.put(messageObject.getId(), messageObject);
                                    this.dialogsLoadedTillDate = Math.min(this.dialogsLoadedTillDate, messageObject.messageOwner.date);
                                    long j = messageObject.messageOwner.random_id;
                                    if (j != 0) {
                                        this.dialogMessagesByRandomIds.put(j, messageObject);
                                    }
                                }
                            } else {
                                arrayList3 = arrayList7;
                            }
                            i5++;
                            arrayList7 = arrayList3;
                        }
                    }
                    getTranslateController().checkDialogMessage(dialog2.id);
                    z3 = true;
                }
                i4++;
                arrayList6 = arrayList2;
                z5 = true;
                z2 = true;
            }
            getMessagesStorage().setDialogsPinned(arrayList5, arrayList6);
        }
        if (z5) {
            if (z3) {
                this.allDialogs.clear();
                int size2 = this.dialogs_dict.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    TLRPC.Dialog dialog4 = (TLRPC.Dialog) this.dialogs_dict.valueAt(i6);
                    if (this.deletingDialogs.indexOfKey(dialog4.id) < 0) {
                        this.allDialogs.add(dialog4);
                    }
                }
            }
            sortDialogs(null);
            z4 = false;
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
        } else {
            z4 = false;
        }
        getMessagesStorage().unpinAllDialogsExceptNew(arrayList4, i);
        getMessagesStorage().putDialogs(tL_messages_dialogs, 1);
        getUserConfig().setPinnedDialogsLoaded(i, true);
        getUserConfig().saveConfig(z4);
    }

    public void generateJoinMessage(final long j, boolean z) {
        TLRPC.Chat chat = getChat(Long.valueOf(j));
        if (chat == null || !ChatObject.isChannel(j, this.currentAccount)) {
            return;
        }
        if ((ChatObject.isNotInChat(chat) && !z) || chat.creator || ChatObject.isMonoForum(chat)) {
            return;
        }
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        tL_messageService.flags = 256;
        int newMessageId = getUserConfig().getNewMessageId();
        tL_messageService.id = newMessageId;
        tL_messageService.local_id = newMessageId;
        if ((chat instanceof TLRPC.TL_channel) && !z) {
            tL_messageService.date = chat.date;
        } else {
            tL_messageService.date = getConnectionsManager().getCurrentTime();
        }
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_messageService.from_id = tL_peerUser;
        tL_peerUser.user_id = getUserConfig().getClientUserId();
        TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
        tL_messageService.peer_id = tL_peerChannel;
        tL_peerChannel.channel_id = j;
        tL_messageService.dialog_id = -j;
        tL_messageService.post = true;
        TLRPC.TL_messageActionChatAddUser tL_messageActionChatAddUser = new TLRPC.TL_messageActionChatAddUser();
        tL_messageService.action = tL_messageActionChatAddUser;
        tL_messageActionChatAddUser.users.add(Long.valueOf(getUserConfig().getClientUserId()));
        getUserConfig().saveConfig(false);
        final ArrayList arrayList = new ArrayList();
        ArrayList<TLRPC.Message> arrayList2 = new ArrayList<>();
        arrayList2.add(tL_messageService);
        arrayList.add(new MessageObject(this.currentAccount, tL_messageService, true, false));
        getMessagesStorage().putMessages(arrayList2, true, true, false, 0, 0, 0L);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$generateJoinMessage$347(j, arrayList);
            }
        });
    }

    public void lambda$generateJoinMessage$347(long j, ArrayList arrayList) {
        updateInterfaceWithMessages(-j, arrayList, 0);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
    }

    protected void deleteMessagesByPush(final long j, final ArrayList<Integer> arrayList, final long j2) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$deleteMessagesByPush$349(arrayList, j2, j);
            }
        });
    }

    public void lambda$deleteMessagesByPush$349(final ArrayList arrayList, final long j, long j2) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$deleteMessagesByPush$348(arrayList, j);
            }
        });
        getMessagesStorage().deletePushMessages(j2, arrayList);
        getMessagesStorage().updateDialogsWithDeletedMessages(j2, j, arrayList, getMessagesStorage().markMessagesAsDeleted(j2, arrayList, false, true, 0, 0), false);
    }

    public void lambda$deleteMessagesByPush$348(ArrayList arrayList, long j) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesDeleted, arrayList, Long.valueOf(j), Boolean.FALSE);
        if (j == 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                MessageObject messageObject = this.dialogMessagesByIds.get(((Integer) arrayList.get(i)).intValue());
                if (messageObject != null) {
                    messageObject.deleted = true;
                }
            }
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.dialogMessage.get(-j);
        if (arrayList2 != null) {
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                MessageObject messageObject2 = (MessageObject) arrayList2.get(i2);
                int size2 = arrayList.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        break;
                    }
                    if (messageObject2.getId() == ((Integer) arrayList.get(i3)).intValue()) {
                        messageObject2.deleted = true;
                        break;
                    }
                    i3++;
                }
            }
        }
    }

    public void checkChatInviter(final long j, boolean z) {
        final TLRPC.Chat chat = getChat(Long.valueOf(j));
        if (!ChatObject.isChannel(chat) || chat.creator || this.gettingChatInviters.indexOfKey(j) >= 0) {
            return;
        }
        final boolean z2 = ChatObject.isMonoForum(chat) ? false : z;
        this.gettingChatInviters.put(j, Boolean.TRUE);
        TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
        tL_channels_getParticipant.channel = getInputChannel(j);
        tL_channels_getParticipant.participant = getInputPeer(getUserConfig().getClientUserId());
        getConnectionsManager().sendRequest(tL_channels_getParticipant, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$checkChatInviter$354(chat, z2, j, tLObject, tL_error);
            }
        });
    }

    public void lambda$checkChatInviter$354(TLRPC.Chat chat, boolean z, final long j, TLObject tLObject, TLRPC.TL_error tL_error) {
        final ArrayList arrayList;
        final TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) tLObject;
        if (tL_channels_channelParticipant != null) {
            TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipant.participant;
            if (channelParticipant instanceof TLRPC.TL_channelParticipantSelf) {
                TLRPC.TL_channelParticipantSelf tL_channelParticipantSelf = (TLRPC.TL_channelParticipantSelf) channelParticipant;
                if (chat.megagroup && getMessagesStorage().isMigratedChat(chat.id)) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$checkChatInviter$350(tL_channels_channelParticipant);
                    }
                });
                getMessagesStorage().putUsersAndChats(tL_channels_channelParticipant.users, tL_channels_channelParticipant.chats, true, true);
                if (!z || Math.abs(getConnectionsManager().getCurrentTime() - tL_channels_channelParticipant.participant.date) >= 86400 || getMessagesStorage().hasInviteMeMessage(j)) {
                    arrayList = null;
                } else {
                    TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                    tL_messageService.flags = 256;
                    int newMessageId = getUserConfig().getNewMessageId();
                    tL_messageService.id = newMessageId;
                    tL_messageService.local_id = newMessageId;
                    tL_messageService.date = tL_channels_channelParticipant.participant.date;
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_messageService.from_id = tL_peerUser;
                    tL_peerUser.user_id = tL_channels_channelParticipant.participant.inviter_id;
                    TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                    tL_messageService.peer_id = tL_peerChannel;
                    tL_peerChannel.channel_id = j;
                    tL_messageService.media_unread = true;
                    tL_messageService.unread = true;
                    tL_messageService.post = true;
                    if (!tL_channelParticipantSelf.via_invite || tL_channelParticipantSelf.inviter_id != getUserConfig().getClientUserId()) {
                        tL_messageService.action = new TLRPC.TL_messageActionChatAddUser();
                    } else {
                        tL_messageService.action = new TLRPC.TL_messageActionChatJoinedByRequest();
                    }
                    tL_messageService.action.users.add(Long.valueOf(getUserConfig().getClientUserId()));
                    tL_messageService.dialog_id = -j;
                    getUserConfig().saveConfig(false);
                    final ArrayList arrayList2 = new ArrayList();
                    ArrayList<TLRPC.Message> arrayList3 = new ArrayList<>();
                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                    for (int i = 0; i < tL_channels_channelParticipant.users.size(); i++) {
                        TLRPC.User user = tL_channels_channelParticipant.users.get(i);
                        concurrentHashMap.put(Long.valueOf(user.id), user);
                    }
                    arrayList3.add(tL_messageService);
                    arrayList2.add(new MessageObject(this.currentAccount, (TLRPC.Message) tL_messageService, (AbstractMap<Long, TLRPC.User>) concurrentHashMap, true, false));
                    if (tL_messageService.from_id.user_id != getUserConfig().getClientUserId()) {
                        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.lambda$checkChatInviter$352(arrayList2);
                            }
                        });
                    }
                    getMessagesStorage().putMessages(arrayList3, true, true, false, 0, 0, 0L);
                    arrayList = arrayList2;
                }
                getMessagesStorage().saveChatInviter(j, tL_channels_channelParticipant.participant.inviter_id);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$checkChatInviter$353(j, arrayList, tL_channels_channelParticipant);
                    }
                });
            }
        }
    }

    public void lambda$checkChatInviter$350(TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant) {
        putUsers(tL_channels_channelParticipant.users, false);
        putChats(tL_channels_channelParticipant.chats, false);
    }

    public void lambda$checkChatInviter$351(ArrayList arrayList) {
        getNotificationsController().processNewMessages(arrayList, true, false, null);
    }

    public void lambda$checkChatInviter$352(final ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$checkChatInviter$351(arrayList);
            }
        });
    }

    public void lambda$checkChatInviter$353(long j, ArrayList arrayList, TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant) {
        this.gettingChatInviters.delete(j);
        if (arrayList != null) {
            updateInterfaceWithMessages(-j, arrayList, 0);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadChatInviter, Long.valueOf(j), Long.valueOf(tL_channels_channelParticipant.participant.inviter_id));
    }

    private int getUpdateType(TLRPC.Update update) {
        if ((update instanceof TLRPC.TL_updateNewMessage) || (update instanceof TLRPC.TL_updateReadMessagesContents) || (update instanceof TLRPC.TL_updateReadHistoryInbox) || (update instanceof TLRPC.TL_updateReadHistoryOutbox) || (update instanceof TLRPC.TL_updateDeleteMessages) || (update instanceof TLRPC.TL_updateWebPage) || (update instanceof TLRPC.TL_updateEditMessage) || (update instanceof TLRPC.TL_updateFolderPeers) || (update instanceof TLRPC.TL_updatePinnedMessages)) {
            return 0;
        }
        if (update instanceof TLRPC.TL_updateNewEncryptedMessage) {
            return 1;
        }
        return ((update instanceof TLRPC.TL_updateNewChannelMessage) || (update instanceof TLRPC.TL_updateDeleteChannelMessages) || (update instanceof TLRPC.TL_updateEditChannelMessage) || (update instanceof TLRPC.TL_updateChannelWebPage) || (update instanceof TLRPC.TL_updatePinnedChannelMessages)) ? 2 : 3;
    }

    private static int getUpdatePts(TLRPC.Update update) {
        if (update instanceof TLRPC.TL_updateDeleteMessages) {
            return ((TLRPC.TL_updateDeleteMessages) update).pts;
        }
        if (update instanceof TLRPC.TL_updateNewChannelMessage) {
            return ((TLRPC.TL_updateNewChannelMessage) update).pts;
        }
        if (update instanceof TLRPC.TL_updateReadHistoryOutbox) {
            return ((TLRPC.TL_updateReadHistoryOutbox) update).pts;
        }
        if (update instanceof TLRPC.TL_updateNewMessage) {
            return ((TLRPC.TL_updateNewMessage) update).pts;
        }
        if (update instanceof TLRPC.TL_updateEditMessage) {
            return ((TLRPC.TL_updateEditMessage) update).pts;
        }
        if (update instanceof TLRPC.TL_updateWebPage) {
            return ((TLRPC.TL_updateWebPage) update).pts;
        }
        if (update instanceof TLRPC.TL_updateReadHistoryInbox) {
            return ((TLRPC.TL_updateReadHistoryInbox) update).pts;
        }
        if (update instanceof TLRPC.TL_updateChannelWebPage) {
            return ((TLRPC.TL_updateChannelWebPage) update).pts;
        }
        if (update instanceof TLRPC.TL_updateDeleteChannelMessages) {
            return ((TLRPC.TL_updateDeleteChannelMessages) update).pts;
        }
        if (update instanceof TLRPC.TL_updateEditChannelMessage) {
            return ((TLRPC.TL_updateEditChannelMessage) update).pts;
        }
        if (update instanceof TLRPC.TL_updateReadMessagesContents) {
            return ((TLRPC.TL_updateReadMessagesContents) update).pts;
        }
        if (update instanceof TLRPC.TL_updateChannelTooLong) {
            return ((TLRPC.TL_updateChannelTooLong) update).pts;
        }
        if (update instanceof TLRPC.TL_updateFolderPeers) {
            return ((TLRPC.TL_updateFolderPeers) update).pts;
        }
        if (update instanceof TLRPC.TL_updatePinnedChannelMessages) {
            return ((TLRPC.TL_updatePinnedChannelMessages) update).pts;
        }
        if (update instanceof TLRPC.TL_updatePinnedMessages) {
            return ((TLRPC.TL_updatePinnedMessages) update).pts;
        }
        return 0;
    }

    private static int getUpdatePtsCount(TLRPC.Update update) {
        if (update instanceof TLRPC.TL_updateDeleteMessages) {
            return ((TLRPC.TL_updateDeleteMessages) update).pts_count;
        }
        if (update instanceof TLRPC.TL_updateNewChannelMessage) {
            return ((TLRPC.TL_updateNewChannelMessage) update).pts_count;
        }
        if (update instanceof TLRPC.TL_updateReadHistoryOutbox) {
            return ((TLRPC.TL_updateReadHistoryOutbox) update).pts_count;
        }
        if (update instanceof TLRPC.TL_updateNewMessage) {
            return ((TLRPC.TL_updateNewMessage) update).pts_count;
        }
        if (update instanceof TLRPC.TL_updateEditMessage) {
            return ((TLRPC.TL_updateEditMessage) update).pts_count;
        }
        if (update instanceof TLRPC.TL_updateWebPage) {
            return ((TLRPC.TL_updateWebPage) update).pts_count;
        }
        if (update instanceof TLRPC.TL_updateReadHistoryInbox) {
            return ((TLRPC.TL_updateReadHistoryInbox) update).pts_count;
        }
        if (update instanceof TLRPC.TL_updateChannelWebPage) {
            return ((TLRPC.TL_updateChannelWebPage) update).pts_count;
        }
        if (update instanceof TLRPC.TL_updateDeleteChannelMessages) {
            return ((TLRPC.TL_updateDeleteChannelMessages) update).pts_count;
        }
        if (update instanceof TLRPC.TL_updateEditChannelMessage) {
            return ((TLRPC.TL_updateEditChannelMessage) update).pts_count;
        }
        if (update instanceof TLRPC.TL_updateReadMessagesContents) {
            return ((TLRPC.TL_updateReadMessagesContents) update).pts_count;
        }
        if (update instanceof TLRPC.TL_updateFolderPeers) {
            return ((TLRPC.TL_updateFolderPeers) update).pts_count;
        }
        if (update instanceof TLRPC.TL_updatePinnedChannelMessages) {
            return ((TLRPC.TL_updatePinnedChannelMessages) update).pts_count;
        }
        if (update instanceof TLRPC.TL_updatePinnedMessages) {
            return ((TLRPC.TL_updatePinnedMessages) update).pts_count;
        }
        return 0;
    }

    private static int getUpdateQts(TLRPC.Update update) {
        if (update instanceof TLRPC.TL_updateNewEncryptedMessage) {
            return ((TLRPC.TL_updateNewEncryptedMessage) update).qts;
        }
        return 0;
    }

    public static long getUpdateChannelId(TLRPC.Update update) {
        if (update instanceof TLRPC.TL_updateNewChannelMessage) {
            return ((TLRPC.TL_updateNewChannelMessage) update).message.peer_id.channel_id;
        }
        if (update instanceof TLRPC.TL_updateEditChannelMessage) {
            return ((TLRPC.TL_updateEditChannelMessage) update).message.peer_id.channel_id;
        }
        if (update instanceof TLRPC.TL_updateReadChannelOutbox) {
            return ((TLRPC.TL_updateReadChannelOutbox) update).channel_id;
        }
        if (update instanceof TLRPC.TL_updateChannelMessageViews) {
            return ((TLRPC.TL_updateChannelMessageViews) update).channel_id;
        }
        if (update instanceof TLRPC.TL_updateChannelMessageForwards) {
            return ((TLRPC.TL_updateChannelMessageForwards) update).channel_id;
        }
        if (update instanceof TLRPC.TL_updateChannelTooLong) {
            return ((TLRPC.TL_updateChannelTooLong) update).channel_id;
        }
        if (update instanceof TLRPC.TL_updateChannelReadMessagesContents) {
            return ((TLRPC.TL_updateChannelReadMessagesContents) update).channel_id;
        }
        if (update instanceof TLRPC.TL_updateChannelAvailableMessages) {
            return ((TLRPC.TL_updateChannelAvailableMessages) update).channel_id;
        }
        if (update instanceof TLRPC.TL_updateChannel) {
            return ((TLRPC.TL_updateChannel) update).channel_id;
        }
        if (update instanceof TLRPC.TL_updateChannelWebPage) {
            return ((TLRPC.TL_updateChannelWebPage) update).channel_id;
        }
        if (update instanceof TLRPC.TL_updateDeleteChannelMessages) {
            return ((TLRPC.TL_updateDeleteChannelMessages) update).channel_id;
        }
        if (update instanceof TLRPC.TL_updateReadChannelInbox) {
            return ((TLRPC.TL_updateReadChannelInbox) update).channel_id;
        }
        if (update instanceof TLRPC.TL_updatePinnedForumTopic) {
            return ((TLRPC.TL_updatePinnedForumTopic) update).peer.channel_id;
        }
        if (update instanceof TLRPC.TL_updatePinnedForumTopics) {
            return ((TLRPC.TL_updatePinnedForumTopics) update).peer.channel_id;
        }
        if (update instanceof TLRPC.TL_updateReadChannelDiscussionInbox) {
            return ((TLRPC.TL_updateReadChannelDiscussionInbox) update).channel_id;
        }
        if (update instanceof TLRPC.TL_updateReadChannelDiscussionOutbox) {
            return ((TLRPC.TL_updateReadChannelDiscussionOutbox) update).channel_id;
        }
        if (update instanceof TLRPC.TL_updateChannelUserTyping) {
            return ((TLRPC.TL_updateChannelUserTyping) update).channel_id;
        }
        if (update instanceof TLRPC.TL_updatePinnedChannelMessages) {
            return ((TLRPC.TL_updatePinnedChannelMessages) update).channel_id;
        }
        if (update instanceof TLRPC.TL_updateChannelViewForumAsMessages) {
            return ((TLRPC.TL_updateChannelViewForumAsMessages) update).channel_id;
        }
        if (!BuildVars.LOGS_ENABLED) {
            return 0L;
        }
        FileLog.e("trying to get unknown update channel_id for " + update);
        return 0L;
    }

    public void processUpdates(final org.telegram.tgnet.TLRPC.Updates r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.processUpdates(org.telegram.tgnet.TLRPC$Updates, boolean):void");
    }

    public void lambda$processUpdates$355(boolean z, long j, ArrayList arrayList) {
        if (z) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_USER_PRINT));
        }
        updateInterfaceWithMessages(j, arrayList, 0);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
    }

    public void lambda$processUpdates$356(boolean z, TLRPC.Updates updates, ArrayList arrayList) {
        if (z) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_USER_PRINT));
        }
        updateInterfaceWithMessages(-updates.chat_id, arrayList, 0);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
    }

    public void lambda$processUpdates$357(ArrayList arrayList) {
        getNotificationsController().processNewMessages(arrayList, true, false, null);
    }

    public void lambda$processUpdates$358(final ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$processUpdates$357(arrayList);
            }
        });
    }

    public void lambda$processUpdates$359() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_STATUS));
    }

    private boolean applyFoldersUpdates(ArrayList<TLRPC.TL_updateFolderPeers> arrayList) {
        if (arrayList == null) {
            return false;
        }
        int size = arrayList.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            TLRPC.TL_updateFolderPeers tL_updateFolderPeers = arrayList.get(i);
            int size2 = tL_updateFolderPeers.folder_peers.size();
            for (int i2 = 0; i2 < size2; i2++) {
                TLRPC.TL_folderPeer tL_folderPeer = tL_updateFolderPeers.folder_peers.get(i2);
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.dialogs_dict.get(DialogObject.getPeerDialogId(tL_folderPeer.peer));
                if (dialog != null) {
                    int i3 = dialog.folder_id;
                    int i4 = tL_folderPeer.folder_id;
                    if (i3 != i4) {
                        dialog.pinned = false;
                        dialog.pinnedNum = 0;
                        dialog.folder_id = i4;
                        this.hasArchivedChats = true;
                        checkArchiveFolder();
                    }
                }
            }
            getMessagesStorage().setDialogsFolderId(arrayList.get(i).folder_peers, null, 0L, 0);
            i++;
            z = true;
        }
        return z;
    }

    public boolean processUpdateArray(java.util.ArrayList<org.telegram.tgnet.TLRPC.Update> r82, java.util.ArrayList<org.telegram.tgnet.TLRPC.User> r83, java.util.ArrayList<org.telegram.tgnet.TLRPC.Chat> r84, boolean r85, int r86) throws java.lang.InterruptedException {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.processUpdateArray(java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, boolean, int):boolean");
    }

    public void lambda$processUpdateArray$360(ArrayList arrayList, ArrayList arrayList2) {
        putUsers(arrayList, false);
        putChats(arrayList2, false);
    }

    public void lambda$processUpdateArray$361(ArrayList arrayList, ArrayList arrayList2) {
        putUsers(arrayList, false);
        putChats(arrayList2, false);
    }

    public void lambda$processUpdateArray$362(TLRPC.TL_updateGroupCallMessage tL_updateGroupCallMessage) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryMessageUpdate, Long.valueOf(tL_updateGroupCallMessage.call.id), tL_updateGroupCallMessage, Boolean.FALSE);
    }

    public void lambda$processUpdateArray$363(TLRPC.TL_updateDeleteGroupCallMessages tL_updateDeleteGroupCallMessages) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryMessageUpdate, Long.valueOf(tL_updateDeleteGroupCallMessages.call.id), tL_updateDeleteGroupCallMessages, Boolean.FALSE);
    }

    public void lambda$processUpdateArray$364(TLRPC.TL_updateUserTyping tL_updateUserTyping) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onEmojiInteractionsReceived, Long.valueOf(tL_updateUserTyping.user_id), tL_updateUserTyping.action);
    }

    public void lambda$processUpdateArray$365(TLRPC.TL_updateChatUserTyping tL_updateChatUserTyping) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onEmojiInteractionsReceived, Long.valueOf(-tL_updateChatUserTyping.chat_id), tL_updateChatUserTyping.action);
    }

    public void lambda$processUpdateArray$366(long j, int i, TLRPC.SendMessageAction sendMessageAction) {
        TLRPC.TL_sendMessageTextDraftAction tL_sendMessageTextDraftAction = (TLRPC.TL_sendMessageTextDraftAction) sendMessageAction;
        BotForumHelper.getInstance(this.currentAccount).onBotForumDraftUpdate(j, i, tL_sendMessageTextDraftAction.random_id, tL_sendMessageTextDraftAction.text);
    }

    public void lambda$processUpdateArray$368(final TLRPC.TL_updatePeerBlocked tL_updatePeerBlocked) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$processUpdateArray$367(tL_updatePeerBlocked);
            }
        });
    }

    public void lambda$processUpdateArray$367(TLRPC.TL_updatePeerBlocked tL_updatePeerBlocked) {
        long peerId = MessageObject.getPeerId(tL_updatePeerBlocked.peer_id);
        if (tL_updatePeerBlocked.blocked) {
            if (this.blockePeers.indexOfKey(peerId) < 0) {
                this.blockePeers.put(peerId, 1);
            }
        } else {
            this.blockePeers.delete(peerId);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.blockedUsersDidLoad, new Object[0]);
        getStoriesController().updateBlockUser(peerId, tL_updatePeerBlocked.blocked_my_stories_from, false);
    }

    public void lambda$processUpdateArray$369(TLRPC.TL_updateServiceNotification tL_updateServiceNotification) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 2, tL_updateServiceNotification.message, tL_updateServiceNotification.type);
    }

    public void lambda$processUpdateArray$370(TLRPC.Message message) {
        getSendMessagesHelper().onMessageEdited(message);
    }

    public void lambda$processUpdateArray$371(TLRPC.TL_updateLangPack tL_updateLangPack) {
        LocaleController.getInstance().saveRemoteLocaleStringsForCurrentLocale(tL_updateLangPack.difference, this.currentAccount);
    }

    public void lambda$processUpdateArray$372(ArrayList arrayList) {
        getNotificationsController().processNewMessages(arrayList, true, false, null);
    }

    public void lambda$processUpdateArray$373(final ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$processUpdateArray$372(arrayList);
            }
        });
    }

    public void lambda$processUpdateArray$375(final LongSparseArray longSparseArray) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$processUpdateArray$374(longSparseArray);
            }
        });
    }

    public void lambda$processUpdateArray$374(LongSparseArray longSparseArray) {
        getNotificationsController().processEditedMessages(longSparseArray);
        getTopicsController().processEditedMessages(longSparseArray);
    }

    public void lambda$processUpdateArray$376(TLRPC.User user) {
        getContactsController().addContactToPhoneBook(user, true);
    }

    public void lambda$processUpdateArray$377() {
        getNotificationsController().deleteNotificationChannelGlobal(0);
    }

    public void lambda$processUpdateArray$378() {
        getNotificationsController().deleteNotificationChannelGlobal(1);
    }

    public void lambda$processUpdateArray$379() {
        getNotificationsController().deleteNotificationChannelGlobal(2);
    }

    public void lambda$processUpdateArray$380(TLRPC.TL_updateChannel tL_updateChannel) {
        getChannelDifference(tL_updateChannel.channel_id, 1, 0L, null);
    }

    public void lambda$processUpdateArray$381(TLRPC.Chat chat) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRightsUpdated, chat);
    }

    public void lambda$processUpdateArray$382(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public void lambda$processUpdateArray$383(int r48, java.util.ArrayList r49, java.util.ArrayList r50, androidx.collection.LongSparseArray r51, int r52, org.telegram.messenger.support.LongSparseIntArray r53, androidx.collection.LongSparseArray r54, androidx.collection.LongSparseArray r55, java.util.ArrayList r56, androidx.collection.LongSparseArray r57, androidx.collection.LongSparseArray r58, boolean r59, java.util.ArrayList r60, java.util.ArrayList r61, androidx.collection.LongSparseArray r62, androidx.collection.LongSparseArray r63, androidx.collection.LongSparseArray r64, java.util.ArrayList r65) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$processUpdateArray$383(int, java.util.ArrayList, java.util.ArrayList, androidx.collection.LongSparseArray, int, org.telegram.messenger.support.LongSparseIntArray, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray, java.util.ArrayList, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray, boolean, java.util.ArrayList, java.util.ArrayList, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray, java.util.ArrayList):void");
    }

    public void lambda$processUpdateArray$385(final LongSparseIntArray longSparseIntArray, final LongSparseIntArray longSparseIntArray2, final SparseIntArray sparseIntArray, final LongSparseArray longSparseArray, final LongSparseArray longSparseArray2, final LongSparseArray longSparseArray3, final LongSparseArray longSparseArray4, final LongSparseArray longSparseArray5, final LongSparseIntArray longSparseIntArray3) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$processUpdateArray$384(longSparseIntArray, longSparseIntArray2, sparseIntArray, longSparseArray, longSparseArray2, longSparseArray3, longSparseArray4, longSparseArray5, longSparseIntArray3);
            }
        });
    }

    public void lambda$processUpdateArray$384(org.telegram.messenger.support.LongSparseIntArray r22, org.telegram.messenger.support.LongSparseIntArray r23, android.util.SparseIntArray r24, androidx.collection.LongSparseArray r25, androidx.collection.LongSparseArray r26, androidx.collection.LongSparseArray r27, androidx.collection.LongSparseArray r28, androidx.collection.LongSparseArray r29, org.telegram.messenger.support.LongSparseIntArray r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$processUpdateArray$384(org.telegram.messenger.support.LongSparseIntArray, org.telegram.messenger.support.LongSparseIntArray, android.util.SparseIntArray, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray, org.telegram.messenger.support.LongSparseIntArray):void");
    }

    public void lambda$processUpdateArray$386(long j, ArrayList arrayList) {
        getMessagesStorage().updateDialogsWithDeletedMessages(j, -j, arrayList, getMessagesStorage().markMessagesAsDeleted(j, arrayList, false, true, 0, 0), false);
    }

    public void lambda$processUpdateArray$387(long j, ArrayList arrayList, long j2) {
        getMessagesStorage().updateDialogsWithDeletedMessages(j, -j, arrayList, getMessagesStorage().markMessagesAsDeleted(j, arrayList, false, true, 5, (int) j2), false);
    }

    public void lambda$processUpdateArray$388(long j, int i) {
        getMessagesStorage().updateDialogsWithDeletedMessages(j, -j, new ArrayList<>(), getMessagesStorage().markMessagesAsDeleted(j, i, false, true), false);
    }

    public void checkUnreadReactions(final long j, final long j2, final SparseBooleanArray sparseBooleanArray) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$checkUnreadReactions$396(sparseBooleanArray, j2, j);
            }
        });
    }

    public void lambda$checkUnreadReactions$396(SparseBooleanArray sparseBooleanArray, final long j, final long j2) {
        int i;
        boolean z;
        boolean z2;
        SQLiteCursor sQLiteCursorQueryFinalized;
        final ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        for (int i3 = 0; i3 < sparseBooleanArray.size(); i3++) {
            int iKeyAt = sparseBooleanArray.keyAt(i3);
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(iKeyAt);
        }
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
        try {
            if (j == 0) {
                sQLiteCursorQueryFinalized = getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT message_id, state FROM reaction_mentions WHERE message_id IN (%s) AND dialog_id = %d", sb, Long.valueOf(j2)), new Object[0]);
            } else {
                sQLiteCursorQueryFinalized = getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT message_id, state FROM reaction_mentions_topics WHERE message_id IN (%s) AND dialog_id = %d AND topic_id = %d", sb, Long.valueOf(j2), Long.valueOf(j)), new Object[0]);
            }
            while (sQLiteCursorQueryFinalized.next()) {
                sparseBooleanArray2.put(sQLiteCursorQueryFinalized.intValue(0), sQLiteCursorQueryFinalized.intValue(1) == 1);
            }
            sQLiteCursorQueryFinalized.dispose();
        } catch (SQLiteException e) {
            e.printStackTrace();
        }
        boolean z3 = false;
        int i4 = 0;
        boolean z4 = false;
        while (i4 < sparseBooleanArray.size()) {
            int iKeyAt2 = sparseBooleanArray.keyAt(i4);
            boolean zValueAt = sparseBooleanArray.valueAt(i4);
            if (sparseBooleanArray2.indexOfKey(iKeyAt2) < 0) {
                i = i2;
                z = z4;
                z2 = true;
            } else if (sparseBooleanArray2.get(iKeyAt2) != zValueAt) {
                z2 = z3;
                i = i2 + (zValueAt ? 1 : -1);
                z = true;
            } else {
                i = i2;
                z = z4;
                z2 = z3;
            }
            if (zValueAt) {
                arrayList.add(Integer.valueOf(iKeyAt2));
            }
            if (j == 0) {
                try {
                    SQLitePreparedStatement sQLitePreparedStatementExecuteFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO reaction_mentions VALUES(?, ?, ?)");
                    sQLitePreparedStatementExecuteFast.requery();
                    sQLitePreparedStatementExecuteFast.bindInteger(1, iKeyAt2);
                    sQLitePreparedStatementExecuteFast.bindInteger(2, zValueAt ? 1 : 0);
                    sQLitePreparedStatementExecuteFast.bindLong(3, j2);
                    sQLitePreparedStatementExecuteFast.step();
                    sQLitePreparedStatementExecuteFast.dispose();
                } catch (SQLiteException e2) {
                    e = e2;
                    e.printStackTrace();
                    i4++;
                    z3 = z2;
                    z4 = z;
                    i2 = i;
                }
                i4++;
                z3 = z2;
                z4 = z;
                i2 = i;
            } else {
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast2 = getMessagesStorage().getDatabase().executeFast("REPLACE INTO reaction_mentions_topics VALUES(?, ?, ?, ?)");
                sQLitePreparedStatementExecuteFast2.requery();
                sQLitePreparedStatementExecuteFast2.bindInteger(1, iKeyAt2);
                try {
                    sQLitePreparedStatementExecuteFast2.bindInteger(2, zValueAt ? 1 : 0);
                    try {
                        sQLitePreparedStatementExecuteFast2.bindLong(3, j2);
                        sQLitePreparedStatementExecuteFast2.bindLong(4, j);
                        sQLitePreparedStatementExecuteFast2.step();
                        sQLitePreparedStatementExecuteFast2.dispose();
                    } catch (SQLiteException e3) {
                        e = e3;
                    }
                } catch (SQLiteException e4) {
                    e = e4;
                    e.printStackTrace();
                    i4++;
                    z3 = z2;
                    z4 = z;
                    i2 = i;
                }
                i4++;
                z3 = z2;
                z4 = z;
                i2 = i;
            }
            e.printStackTrace();
            i4++;
            z3 = z2;
            z4 = z;
            i2 = i;
        }
        if (!z3) {
            if (z4) {
                final int i5 = i2;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$checkUnreadReactions$395(j, j2, i5, arrayList);
                    }
                });
                return;
            }
            return;
        }
        if (j == 0) {
            TLRPC.TL_messages_getPeerDialogs tL_messages_getPeerDialogs = new TLRPC.TL_messages_getPeerDialogs();
            TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
            tL_inputDialogPeer.peer = getInputPeer(j2);
            tL_messages_getPeerDialogs.peers.add(tL_inputDialogPeer);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getPeerDialogs, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$checkUnreadReactions$390(j2, j, arrayList, tLObject, tL_error);
                }
            });
            return;
        }
        if (isMonoForum(j2)) {
            TLRPC.TL_messages_getSavedDialogsByID tL_messages_getSavedDialogsByID = new TLRPC.TL_messages_getSavedDialogsByID();
            tL_messages_getSavedDialogsByID.ids.add(getInputPeer(j));
            tL_messages_getSavedDialogsByID.parent_peer = getInputPeer(j2);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getSavedDialogsByID, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$checkUnreadReactions$392(j2, j, arrayList, tLObject, tL_error);
                }
            });
            return;
        }
        TL_forum.TL_messages_getForumTopicsByID tL_messages_getForumTopicsByID = new TL_forum.TL_messages_getForumTopicsByID();
        tL_messages_getForumTopicsByID.topics.add(Integer.valueOf((int) j));
        tL_messages_getForumTopicsByID.peer = getMessagesController().getInputPeer(j2);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getForumTopicsByID, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$checkUnreadReactions$394(j2, j, arrayList, tLObject, tL_error);
            }
        });
    }

    public void lambda$checkUnreadReactions$390(final long j, final long j2, final ArrayList arrayList, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
            final int i = tL_messages_peerDialogs.dialogs.size() == 0 ? 0 : tL_messages_peerDialogs.dialogs.get(0).unread_reactions_count;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$checkUnreadReactions$389(j, i, j2, arrayList);
                }
            });
        }
    }

    public void lambda$checkUnreadReactions$389(long j, int i, long j2, ArrayList arrayList) {
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.dialogs_dict.get(j);
        if (dialog == null) {
            getMessagesStorage().updateDialogUnreadReactions(j, 0L, i, false);
            return;
        }
        dialog.unread_reactions_count = i;
        getMessagesStorage().updateUnreadReactionsCount(j, j2, i);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsUnreadReactionsCounterChanged, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), arrayList);
    }

    public void lambda$checkUnreadReactions$392(final long j, final long j2, final ArrayList arrayList, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject;
            final int i = tL_messages_savedDialogs.dialogs.size() == 0 ? 0 : tL_messages_savedDialogs.dialogs.get(0).unread_reactions_count;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$checkUnreadReactions$391(j, j2, i, arrayList);
                }
            });
        }
    }

    public void lambda$checkUnreadReactions$391(long j, long j2, int i, ArrayList arrayList) {
        getMessagesController().getTopicsController().updateReactionsUnread(j, j2, i, false);
        getMessagesStorage().updateUnreadReactionsCount(j, j2, i);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsUnreadReactionsCounterChanged, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), arrayList);
    }

    public void lambda$checkUnreadReactions$394(final long j, final long j2, final ArrayList arrayList, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject;
            final int i = tL_messages_forumTopics.topics.size() == 0 ? 0 : tL_messages_forumTopics.topics.get(0).unread_reactions_count;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$checkUnreadReactions$393(j, j2, i, arrayList);
                }
            });
        }
    }

    public void lambda$checkUnreadReactions$393(long j, long j2, int i, ArrayList arrayList) {
        getMessagesController().getTopicsController().updateReactionsUnread(j, j2, i, false);
        getMessagesStorage().updateUnreadReactionsCount(j, j2, i);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsUnreadReactionsCounterChanged, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), arrayList);
    }

    public void lambda$checkUnreadReactions$395(long j, long j2, int i, ArrayList arrayList) {
        if (j == 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) this.dialogs_dict.get(j2);
            if (dialog == null) {
                getMessagesStorage().updateDialogUnreadReactions(j2, 0L, i, true);
                return;
            }
            int i2 = dialog.unread_reactions_count + i;
            dialog.unread_reactions_count = i2;
            if (i2 < 0) {
                dialog.unread_reactions_count = 0;
            }
            getMessagesStorage().updateUnreadReactionsCount(j2, 0L, dialog.unread_reactions_count);
            if (isForum(j2) || isMonoForum(j2) || j2 > 0) {
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsUnreadReactionsCounterChanged, Long.valueOf(j2), Long.valueOf(j), Integer.valueOf(dialog.unread_reactions_count), arrayList);
                return;
            }
            return;
        }
        int iUpdateReactionsUnread = getMessagesController().getTopicsController().updateReactionsUnread(j2, j, i, true);
        if (iUpdateReactionsUnread >= 0) {
            getMessagesStorage().updateUnreadReactionsCount(j2, j, iUpdateReactionsUnread, true);
            if (isForum(j2) || isMonoForum(j2) || j2 > 0) {
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsUnreadReactionsCounterChanged, Long.valueOf(j2), Long.valueOf(j), Integer.valueOf(iUpdateReactionsUnread), arrayList);
            }
        }
    }

    public boolean isDialogMuted(long j, long j2) {
        return isDialogMuted(j, j2, null);
    }

    public boolean isDialogNotificationsSoundEnabled(long j, long j2) {
        return this.notificationsPreferences.getBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(j, j2), true);
    }

    public boolean isDialogMuted(long j, long j2, TLRPC.Chat chat) {
        Boolean boolValueOf;
        int i = this.notificationsPreferences.getInt("notify2_" + NotificationsController.getSharedPrefKey(j, j2), -1);
        boolean z = false;
        if (i == -1) {
            if (chat != null) {
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    z = true;
                }
                boolValueOf = Boolean.valueOf(z);
            } else {
                boolValueOf = null;
            }
            Boolean bool = boolValueOf;
            if (j2 != 0) {
                return isDialogMuted(j, 0L, chat);
            }
            return !getNotificationsController().isGlobalNotificationsEnabled(j, bool, false, false);
        }
        if (i == 2) {
            return true;
        }
        if (i == 3) {
            if (this.notificationsPreferences.getInt("notifyuntil_" + NotificationsController.getSharedPrefKey(j, j2), 0) >= getConnectionsManager().getCurrentTime()) {
                return true;
            }
        }
        return false;
    }

    public void markReactionsAsRead(long j, long j2) {
        if (j2 == 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) this.dialogs_dict.get(j);
            if (dialog != null) {
                dialog.unread_reactions_count = 0;
            }
            if (isForum(j) || isMonoForumWithManageRights(j)) {
                this.topicsController.markAllReactionsAsRead(-j);
            }
        } else {
            this.topicsController.markAllReactionsAsRead(-j, j2);
        }
        getMessagesStorage().updateUnreadReactionsCount(j, j2, 0);
        TLRPC.TL_messages_readReactions tL_messages_readReactions = new TLRPC.TL_messages_readReactions();
        tL_messages_readReactions.peer = getInputPeer(j);
        if (j2 != 0) {
            if (isMonoForum(j)) {
                tL_messages_readReactions.saved_peer_id = getInputPeer(j2);
                tL_messages_readReactions.flags |= 2;
            } else {
                tL_messages_readReactions.top_msg_id = (int) j2;
                tL_messages_readReactions.flags |= 1;
            }
        }
        getConnectionsManager().sendRequest(tL_messages_readReactions, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                MessagesController.lambda$markReactionsAsRead$397(tLObject, tL_error);
            }
        });
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_REACTIONS_READ));
    }

    public SponsoredMessagesInfo getSponsoredMessages(final long j) {
        SponsoredMessagesInfo sponsoredMessagesInfo = (SponsoredMessagesInfo) this.sponsoredMessages.get(j);
        if (sponsoredMessagesInfo != null && (sponsoredMessagesInfo.loading || Math.abs(SystemClock.elapsedRealtime() - sponsoredMessagesInfo.loadTime) <= 300000)) {
            return sponsoredMessagesInfo;
        }
        if (j >= 0 ? !UserObject.isBot(getUser(Long.valueOf(j))) : !ChatObject.isChannel(getChat(Long.valueOf(-j)))) {
            return null;
        }
        final SponsoredMessagesInfo sponsoredMessagesInfo2 = new SponsoredMessagesInfo();
        sponsoredMessagesInfo2.loading = true;
        this.sponsoredMessages.put(j, sponsoredMessagesInfo2);
        TLRPC.TL_messages_getSponsoredMessages tL_messages_getSponsoredMessages = new TLRPC.TL_messages_getSponsoredMessages();
        tL_messages_getSponsoredMessages.peer = getInputPeer(j);
        getConnectionsManager().sendRequest(tL_messages_getSponsoredMessages, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$getSponsoredMessages$400(j, sponsoredMessagesInfo2, tLObject, tL_error);
            }
        });
        return null;
    }

    public void lambda$getSponsoredMessages$400(final long r20, final org.telegram.messenger.MessagesController.SponsoredMessagesInfo r22, org.telegram.tgnet.TLObject r23, org.telegram.tgnet.TLRPC.TL_error r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$getSponsoredMessages$400(long, org.telegram.messenger.MessagesController$SponsoredMessagesInfo, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    public void lambda$getSponsoredMessages$398(TLRPC.messages_SponsoredMessages messages_sponsoredmessages) {
        putUsers(messages_sponsoredmessages.users, false);
        putChats(messages_sponsoredmessages.chats, false);
    }

    public void lambda$getSponsoredMessages$399(ArrayList arrayList, long j, SponsoredMessagesInfo sponsoredMessagesInfo, Integer num) {
        if (arrayList == null) {
            this.sponsoredMessages.remove(j);
            return;
        }
        sponsoredMessagesInfo.loadTime = SystemClock.elapsedRealtime();
        sponsoredMessagesInfo.loading = false;
        sponsoredMessagesInfo.messages = arrayList;
        sponsoredMessagesInfo.posts_between = num;
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadSponsoredMessages, Long.valueOf(j), arrayList);
    }

    public void clearSendAsPeers() {
        this.sendAsPeers.clear();
        this.sendAsPeersLiveStories.clear();
    }

    public TLRPC.TL_channels_sendAsPeers getSendAsPeers(long j) {
        return getSendAsPeers(j, false);
    }

    public TLRPC.TL_channels_sendAsPeers getSendAsPeers(final long j, final boolean z) {
        TLRPC.Chat chat;
        final LongSparseArray longSparseArray = z ? this.sendAsPeersLiveStories : this.sendAsPeers;
        SendAsPeersInfo sendAsPeersInfo = (SendAsPeersInfo) longSparseArray.get(j);
        if (sendAsPeersInfo != null && (sendAsPeersInfo.loading || Math.abs(SystemClock.elapsedRealtime() - sendAsPeersInfo.loadTime) <= 300000)) {
            return sendAsPeersInfo.sendAsPeers;
        }
        AnonymousClass1 anonymousClass1 = null;
        if (!z && ((chat = getChat(Long.valueOf(-j))) == null || !ChatObject.canSendAsPeers(chat))) {
            return null;
        }
        final SendAsPeersInfo sendAsPeersInfo2 = new SendAsPeersInfo(this, anonymousClass1);
        sendAsPeersInfo2.loading = true;
        longSparseArray.put(j, sendAsPeersInfo2);
        TLRPC.TL_channels_getSendAs tL_channels_getSendAs = new TLRPC.TL_channels_getSendAs();
        tL_channels_getSendAs.peer = getInputPeer(j);
        tL_channels_getSendAs.for_live_stories = z;
        getConnectionsManager().sendRequest(tL_channels_getSendAs, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$getSendAsPeers$403(longSparseArray, j, sendAsPeersInfo2, z, tLObject, tL_error);
            }
        });
        return null;
    }

    public void lambda$getSendAsPeers$403(final androidx.collection.LongSparseArray r9, final long r10, final org.telegram.messenger.MessagesController.SendAsPeersInfo r12, final boolean r13, org.telegram.tgnet.TLObject r14, org.telegram.tgnet.TLRPC.TL_error r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$getSendAsPeers$403(androidx.collection.LongSparseArray, long, org.telegram.messenger.MessagesController$SendAsPeersInfo, boolean, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    public void lambda$getSendAsPeers$401(TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers) {
        putUsers(tL_channels_sendAsPeers.users, false);
        putChats(tL_channels_sendAsPeers.chats, false);
    }

    public void lambda$getSendAsPeers$402(TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, LongSparseArray longSparseArray, long j, SendAsPeersInfo sendAsPeersInfo, boolean z) {
        if (tL_channels_sendAsPeers != null) {
            sendAsPeersInfo.loadTime = SystemClock.elapsedRealtime();
            sendAsPeersInfo.sendAsPeers = tL_channels_sendAsPeers;
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadSendAsPeers, Long.valueOf(j), tL_channels_sendAsPeers, Boolean.valueOf(z));
            return;
        }
        longSparseArray.remove(j);
    }

    public TLRPC.Peer getSendAsSelectedPeer(long j) {
        TLRPC.Peer peer;
        TLRPC.ChatFull chatFull = getChatFull(-j);
        if (chatFull != null && (peer = chatFull.default_send_as) != null) {
            return peer;
        }
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_peerUser.user_id = getAccountInstance().getUserConfig().clientUserId;
        return tL_peerUser;
    }

    public CharSequence getPrintingString(long j, long j2, boolean z) {
        LongSparseArray longSparseArray;
        TLRPC.User user;
        TLRPC.UserStatus userStatus;
        if ((!z || !DialogObject.isUserDialog(j) || (user = getUser(Long.valueOf(j))) == null || (userStatus = user.status) == null || userStatus.expires >= 0) && (longSparseArray = (LongSparseArray) this.printingStrings.get(j)) != null) {
            return (CharSequence) longSparseArray.get(j2);
        }
        return null;
    }

    public Integer getPrintingStringType(long j, long j2) {
        LongSparseArray longSparseArray = (LongSparseArray) this.printingStringsTypes.get(j);
        if (longSparseArray == null) {
            return null;
        }
        return (Integer) longSparseArray.get(j2);
    }

    private boolean updatePrintingUsersWithNewMessages(long j, ArrayList<MessageObject> arrayList) {
        boolean z;
        if (j > 0) {
            if (this.printingUsers.get(Long.valueOf(j)) != null) {
                this.printingUsers.remove(Long.valueOf(j));
                return true;
            }
        } else if (j < 0) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<MessageObject> it = arrayList.iterator();
            while (it.hasNext()) {
                MessageObject next = it.next();
                if (next.isFromUser() && !arrayList2.contains(Long.valueOf(next.messageOwner.from_id.user_id))) {
                    arrayList2.add(Long.valueOf(next.messageOwner.from_id.user_id));
                }
            }
            ConcurrentHashMap<Integer, ArrayList<PrintingUser>> concurrentHashMap = this.printingUsers.get(Long.valueOf(j));
            if (concurrentHashMap != null) {
                ArrayList arrayList3 = null;
                z = false;
                for (Map.Entry<Integer, ArrayList<PrintingUser>> entry : concurrentHashMap.entrySet()) {
                    Integer key = entry.getKey();
                    ArrayList<PrintingUser> value = entry.getValue();
                    int i = 0;
                    while (i < value.size()) {
                        if (arrayList2.contains(Long.valueOf(value.get(i).userId))) {
                            value.remove(i);
                            i--;
                            if (value.isEmpty()) {
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(key);
                            }
                            z = true;
                        }
                        i++;
                    }
                }
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        concurrentHashMap.remove(arrayList3.get(i2));
                    }
                    if (concurrentHashMap.isEmpty()) {
                        this.printingUsers.remove(Long.valueOf(j));
                    }
                }
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public boolean updateInterfaceWithMessages(final long r27, java.util.ArrayList<org.telegram.messenger.MessageObject> r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.updateInterfaceWithMessages(long, java.util.ArrayList, int):boolean");
    }

    public void lambda$updateInterfaceWithMessages$404(TLRPC.Dialog dialog, int i, long j, int i2) {
        if (i2 == -1) {
            if (i <= 0 || DialogObject.isEncryptedDialog(j)) {
                return;
            }
            loadUnknownDialog(getInputPeer(j), 0L);
            return;
        }
        if (i2 != 0) {
            dialog.folder_id = i2;
            sortDialogs(null);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, Boolean.TRUE);
        }
    }

    public TLRPC.Dialog getDialog(long j) {
        return (TLRPC.Dialog) this.dialogs_dict.get(j);
    }

    public void addDialogAction(long j, boolean z) {
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.dialogs_dict.get(j);
        if (dialog == null) {
            return;
        }
        if (z) {
            this.clearingHistoryDialogs.put(j, dialog);
        } else {
            this.deletingDialogs.put(j, dialog);
            this.allDialogs.remove(dialog);
            sortDialogs(null);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, Boolean.TRUE);
    }

    public void removeDialogAction(long j, boolean z, boolean z2) {
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.dialogs_dict.get(j);
        if (dialog == null) {
            return;
        }
        if (z) {
            this.clearingHistoryDialogs.remove(j);
        } else {
            this.deletingDialogs.remove(j);
            if (!z2) {
                this.allDialogs.add(dialog);
                sortDialogs(null);
            }
        }
        if (z2) {
            return;
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, Boolean.TRUE);
    }

    public boolean isClearingDialog(long j) {
        return this.clearingHistoryDialogs.get(j) != null;
    }

    public void updateFilterDialogs(DialogFilter dialogFilter) {
        TLRPC.EncryptedChat encryptedChat;
        if (dialogFilter == null) {
            return;
        }
        ArrayList<TLRPC.Dialog> arrayList = dialogFilter.dialogs;
        ArrayList<TLRPC.Dialog> arrayList2 = dialogFilter.dialogsForward;
        arrayList.clear();
        arrayList2.clear();
        this.sortingDialogFilter = dialogFilter;
        try {
            Collections.sort(this.allDialogs, this.dialogDateComparator);
        } catch (Exception e) {
            FileLog.e(e);
        }
        int size = this.allDialogs.size();
        for (int i = 0; i < size; i++) {
            TLRPC.Dialog dialog = this.allDialogs.get(i);
            if (dialog instanceof TLRPC.TL_dialog) {
                long j = dialog.id;
                if (DialogObject.isEncryptedDialog(j) && (encryptedChat = getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(j)))) != null) {
                    j = encryptedChat.user_id;
                }
                if (dialogFilter.includesDialog(getAccountInstance(), j, dialog)) {
                    if (canAddToForward(dialog)) {
                        arrayList2.add(dialog);
                    }
                    arrayList.add(dialog);
                }
            }
        }
        try {
            Collections.sort(this.allDialogs, this.dialogComparator);
        } catch (Exception unused) {
        }
    }

    public boolean canAddToForward(TLRPC.Dialog dialog) {
        if (dialog == null) {
            return false;
        }
        if (!DialogObject.isEncryptedDialog(dialog.id) && DialogObject.isChannel(dialog)) {
            TLRPC.Chat chat = getChat(Long.valueOf(-dialog.id));
            if (chat != null && chat.megagroup) {
                if (chat.gigagroup && !ChatObject.hasAdminRights(chat)) {
                    return false;
                }
            } else if (!ChatObject.hasAdminRights(chat) || !ChatObject.canPost(chat)) {
                return false;
            }
        }
        return true;
    }

    public void sortDialogs(androidx.collection.LongSparseArray r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.sortDialogs(androidx.collection.LongSparseArray):void");
    }

    private void addDialogToItsFolder(int i, TLRPC.Dialog dialog) {
        int i2 = dialog instanceof TLRPC.TL_dialogFolder ? 0 : dialog.folder_id;
        ArrayList<TLRPC.Dialog> arrayList = this.dialogsByFolder.get(i2);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.dialogsByFolder.put(i2, arrayList);
        }
        if (i == -1) {
            arrayList.add(dialog);
            return;
        }
        if (i == -2) {
            if (arrayList.isEmpty() || !(arrayList.get(0) instanceof TLRPC.TL_dialogFolder)) {
                arrayList.add(0, dialog);
                return;
            } else {
                arrayList.add(1, dialog);
                return;
            }
        }
        arrayList.add(i, dialog);
    }

    public String getRestrictionReason(ArrayList<TLRPC.RestrictionReason> arrayList) {
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            TLRPC.RestrictionReason restrictionReason = arrayList.get(i);
            Set<String> set = this.ignoreRestrictionReasons;
            if ((set == null || !set.contains(restrictionReason.reason)) && !"sensitive".equals(restrictionReason.reason) && ("all".equals(restrictionReason.platform) || (("android".equals(restrictionReason.platform) && (!(ApplicationLoader.isStandaloneBuild() || BuildVars.isBetaApp()) || BuildVars.DEBUG_PRIVATE_VERSION)) || "android-all".equals(restrictionReason.platform)))) {
                return restrictionReason.text;
            }
        }
        return null;
    }

    public boolean isSensitive(ArrayList<TLRPC.RestrictionReason> arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                TLRPC.RestrictionReason restrictionReason = arrayList.get(i);
                Set<String> set = this.ignoreRestrictionReasons;
                if ((set == null || !set.contains(restrictionReason.reason)) && (("all".equals(restrictionReason.platform) || (("android".equals(restrictionReason.platform) && (!(ApplicationLoader.isStandaloneBuild() || BuildVars.isBetaApp()) || BuildVars.DEBUG_PRIVATE_VERSION)) || "android-all".equals(restrictionReason.platform))) && "sensitive".equals(restrictionReason.reason))) {
                    return true;
                }
            }
        }
        return false;
    }

    public void checkSensitive(final org.telegram.ui.ActionBar.BaseFragment r10, final long r11, final java.lang.Runnable r13, final java.lang.Runnable r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.checkSensitive(org.telegram.ui.ActionBar.BaseFragment, long, java.lang.Runnable, java.lang.Runnable):void");
    }

    public void lambda$checkSensitive$410(AlertDialog alertDialog, BaseFragment baseFragment, final Runnable runnable, final long j, final Runnable runnable2, final TL_account.contentSettings contentsettings) {
        if (alertDialog != null) {
            alertDialog.dismissUnless(200L);
        }
        Context context = baseFragment.getContext();
        if (context == null) {
            context = AndroidUtilities.findActivity(LaunchActivity.instance);
        }
        if (context == null) {
            context = LaunchActivity.instance;
        }
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        final Context context2 = context;
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        final Theme.ResourcesProvider resourceProvider = safeLastFragment == null ? null : safeLastFragment.getResourceProvider();
        final boolean[] zArr = new boolean[1];
        FrameLayout frameLayout = new FrameLayout(context2);
        boolean z = this.config.needAgeVideoVerification.get() && !TextUtils.isEmpty(this.verifyAgeBotUsername);
        boolean z2 = (contentsettings == null || !contentsettings.sensitive_can_change) && z;
        if (z) {
            zArr[0] = true;
        } else if (contentsettings != null && contentsettings.sensitive_can_change) {
            CheckBoxCell checkBoxCell = new CheckBoxCell(context2, 1, resourceProvider);
            checkBoxCell.setBackground(Theme.getSelectorDrawable(false));
            checkBoxCell.setText(LocaleController.getString(R.string.MessageShowSensitiveContentAlways), "", zArr[0], false);
            checkBoxCell.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
            frameLayout.addView(checkBoxCell, LayoutHelper.createFrame(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            checkBoxCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    MessagesController.lambda$checkSensitive$405(zArr, view);
                }
            });
        }
        final boolean[] zArr2 = new boolean[1];
        AlertDialog.Builder onDismissListener = new AlertDialog.Builder(context2, resourceProvider).setTitle(LocaleController.getString(R.string.MessageShowSensitiveContentChannelTitle)).setMessage(LocaleController.getString(z2 ? R.string.MessageShowSensitiveContentChannelTextClosed : R.string.MessageShowSensitiveContentChannelText)).setView(frameLayout).setCustomViewOffset(9).setNegativeButton(LocaleController.getString(z2 ? R.string.MessageShowSensitiveContentChannelTextClosedButton : R.string.Cancel), null).setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                MessagesController.lambda$checkSensitive$406(zArr2, runnable, dialogInterface);
            }
        });
        if (!z2) {
            final boolean z3 = z;
            onDismissListener.setPositiveButton(LocaleController.getString(R.string.MessageShowSensitiveContentButton), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog2, int i) {
                    this.f$0.lambda$checkSensitive$409(z3, zArr, contentsettings, context2, j, zArr2, runnable2, resourceProvider, alertDialog2, i);
                }
            });
        }
        onDismissListener.show();
    }

    public static void lambda$checkSensitive$405(boolean[] zArr, View view) {
        boolean z = !zArr[0];
        zArr[0] = z;
        ((CheckBoxCell) view).setChecked(z, true);
    }

    public static void lambda$checkSensitive$406(boolean[] zArr, Runnable runnable, DialogInterface dialogInterface) {
        if (zArr[0] || runnable == null) {
            return;
        }
        runnable.run();
    }

    public void lambda$checkSensitive$409(boolean z, boolean[] zArr, TL_account.contentSettings contentsettings, Context context, final long j, final boolean[] zArr2, final Runnable runnable, Theme.ResourcesProvider resourcesProvider, AlertDialog alertDialog, int i) {
        if (z || (zArr[0] && contentsettings != null && contentsettings.sensitive_can_change)) {
            ThemeActivity.verifyAge(context, this.currentAccount, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.lambda$checkSensitive$408(j, zArr2, runnable, (Boolean) obj);
                }
            }, resourcesProvider);
            return;
        }
        this.sensitiveAgreed.add(Long.valueOf(j));
        zArr2[0] = true;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$checkSensitive$408(long j, boolean[] zArr, Runnable runnable, Boolean bool) {
        final BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (!bool.booleanValue()) {
            if (safeLastFragment != null) {
                BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText)).show();
                return;
            }
            return;
        }
        this.sensitiveAgreed.add(Long.valueOf(j));
        setContentSettings(true);
        if (safeLastFragment != null) {
            BulletinFactory.of(safeLastFragment).createSimpleBulletinDetail(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new Runnable() {
                @Override
                public final void run() {
                    MessagesController.lambda$checkSensitive$407(safeLastFragment);
                }
            }), true)).show(true);
        }
        zArr[0] = true;
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void lambda$checkSensitive$407(BaseFragment baseFragment) {
        if (baseFragment != null) {
            baseFragment.presentFragment(new ThemeActivity(0).highlightSensitiveRow());
        }
    }

    public static void showCantOpenAlert(BaseFragment baseFragment, String str) {
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(baseFragment.getParentActivity(), baseFragment.getResourceProvider());
        builder.setTitle(LocaleController.getString(R.string.DialogNotAvailable));
        HashMap map = new HashMap();
        int i = Theme.key_dialogTopBackground;
        map.put("info1.**", Integer.valueOf(baseFragment.getThemedColor(i)));
        map.put("info2.**", Integer.valueOf(baseFragment.getThemedColor(i)));
        builder.setTopAnimation(R.raw.not_available, 52, false, baseFragment.getThemedColor(i), map);
        builder.setTopAnimationIsNew(true);
        builder.setPositiveButton(LocaleController.getString(R.string.Close), null);
        builder.setMessage(str);
        baseFragment.showDialog(builder.create());
    }

    public boolean checkCanOpenChat(Bundle bundle, BaseFragment baseFragment) {
        return checkCanOpenChat(bundle, baseFragment, null);
    }

    public boolean checkCanOpenChat(Bundle bundle, BaseFragment baseFragment, MessageObject messageObject) {
        return checkCanOpenChat(bundle, baseFragment, messageObject, null);
    }

    public boolean checkCanOpenChat(final Bundle bundle, final BaseFragment baseFragment, MessageObject messageObject, final Browser.Progress progress) {
        TLRPC.User user;
        TLRPC.Chat chat;
        String restrictionReason;
        TLRPC.TL_messages_getMessages tL_messages_getMessages;
        if (bundle != null && baseFragment != null) {
            long j = bundle.getLong("user_id", 0L);
            long j2 = bundle.getLong("chat_id", 0L);
            int i = bundle.getInt("message_id", 0);
            AlertDialog alertDialog = null;
            if (j != 0) {
                user = getUser(Long.valueOf(j));
                chat = null;
            } else if (j2 != 0) {
                chat = getChat(Long.valueOf(j2));
                user = null;
            } else {
                user = null;
                chat = null;
            }
            if (user == null && chat == null) {
                return true;
            }
            if (chat != null) {
                restrictionReason = getRestrictionReason(chat.restriction_reason);
            } else {
                restrictionReason = getRestrictionReason(user.restriction_reason);
            }
            if (restrictionReason != null) {
                showCantOpenAlert(baseFragment, restrictionReason);
                return false;
            }
            if (i != 0 && messageObject != null && chat != null && chat.access_hash == 0) {
                long dialogId = messageObject.getDialogId();
                if (!DialogObject.isEncryptedDialog(dialogId)) {
                    if (progress != null) {
                        progress.init();
                    } else {
                        alertDialog = new AlertDialog(baseFragment.getParentActivity(), 3);
                    }
                    final AlertDialog alertDialog2 = alertDialog;
                    if (dialogId < 0) {
                        chat = getChat(Long.valueOf(-dialogId));
                    }
                    if (dialogId > 0 || !ChatObject.isChannel(chat)) {
                        TLRPC.TL_messages_getMessages tL_messages_getMessages2 = new TLRPC.TL_messages_getMessages();
                        tL_messages_getMessages2.id.add(Integer.valueOf(messageObject.getId()));
                        tL_messages_getMessages = tL_messages_getMessages2;
                    } else {
                        TLRPC.Chat chat2 = getChat(Long.valueOf(-dialogId));
                        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                        tL_channels_getMessages.channel = getInputChannel(chat2);
                        tL_channels_getMessages.id.add(Integer.valueOf(messageObject.getId()));
                        tL_messages_getMessages = tL_channels_getMessages;
                    }
                    final int iSendRequest = getConnectionsManager().sendRequest(tL_messages_getMessages, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            this.f$0.lambda$checkCanOpenChat$412(alertDialog2, progress, baseFragment, bundle, tLObject, tL_error);
                        }
                    });
                    if (alertDialog2 != null) {
                        alertDialog2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                            @Override
                            public final void onCancel(DialogInterface dialogInterface) {
                                this.f$0.lambda$checkCanOpenChat$413(iSendRequest, baseFragment, dialogInterface);
                            }
                        });
                        baseFragment.setVisibleDialog(alertDialog2);
                        alertDialog2.show();
                    } else {
                        progress.onCancel(new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.lambda$checkCanOpenChat$414(iSendRequest, baseFragment);
                            }
                        });
                        progress.init();
                    }
                    return false;
                }
            } else if (i != 0 && messageObject != null && progress != null) {
                progress.init();
                progress.onCancel(ensureMessagesLoaded(-j2, i, new MessagesLoadedCallback() {
                    @Override
                    public void onMessagesLoaded(boolean z) {
                        progress.end();
                        baseFragment.presentFragment(new ChatActivity(bundle));
                    }

                    @Override
                    public void onError() {
                        progress.end();
                        baseFragment.presentFragment(new ChatActivity(bundle));
                    }
                }));
                return false;
            }
        }
        return true;
    }

    public void lambda$checkCanOpenChat$412(final AlertDialog alertDialog, final Browser.Progress progress, final BaseFragment baseFragment, final Bundle bundle, final TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$checkCanOpenChat$411(alertDialog, progress, tLObject, baseFragment, bundle);
                }
            });
        }
    }

    public void lambda$checkCanOpenChat$411(AlertDialog alertDialog, Browser.Progress progress, TLObject tLObject, BaseFragment baseFragment, Bundle bundle) {
        if (alertDialog != null) {
            try {
                alertDialog.dismiss();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        if (progress != null) {
            progress.end();
        }
        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
        putUsers(messages_messages.users, false);
        putChats(messages_messages.chats, false);
        getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
        baseFragment.presentFragment(new ChatActivity(bundle), true);
    }

    public void lambda$checkCanOpenChat$413(int i, BaseFragment baseFragment, DialogInterface dialogInterface) {
        getConnectionsManager().cancelRequest(i, true);
        baseFragment.setVisibleDialog(null);
    }

    public void lambda$checkCanOpenChat$414(int i, BaseFragment baseFragment) {
        getConnectionsManager().cancelRequest(i, true);
        baseFragment.setVisibleDialog(null);
    }

    public void openChatOrProfileWith(TLRPC.User user, TLRPC.Chat chat, BaseFragment baseFragment, int i, boolean z) {
        String restrictionReason;
        if ((user == null && chat == null) || baseFragment == null) {
            return;
        }
        if (chat != null) {
            restrictionReason = getRestrictionReason(chat.restriction_reason);
        } else {
            restrictionReason = getRestrictionReason(user.restriction_reason);
            if (i != 3 && user.bot) {
                if (LaunchActivity.getLastFragment().getLastStoryViewer() == null) {
                    i = 1;
                    z = true;
                } else {
                    i = 1;
                }
            }
        }
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        boolean z2 = (lastFragment instanceof DialogsActivity) || (lastFragment instanceof MainTabsActivity);
        if (restrictionReason != null) {
            showCantOpenAlert(baseFragment, restrictionReason);
            return;
        }
        Bundle bundle = new Bundle();
        if (chat != null) {
            bundle.putLong("chat_id", chat.id);
        } else {
            bundle.putLong("user_id", user.id);
        }
        if (i == 0) {
            baseFragment.presentFragment(new ProfileActivity(bundle));
            return;
        }
        if (i == 2) {
            if (ChatObject.isForum(chat)) {
                baseFragment.presentFragment(TopicsFragment.getTopicsOrChat(baseFragment, bundle), !z2, true);
                return;
            } else {
                baseFragment.presentFragment(new ChatActivity(bundle), !z2, true);
                return;
            }
        }
        if (ChatObject.isForum(chat)) {
            baseFragment.presentFragment(TopicsFragment.getTopicsOrChat(baseFragment, bundle), z && !z2);
        } else {
            baseFragment.presentFragment(new ChatActivity(bundle), z && !z2);
        }
    }

    public void openByUserName(String str, BaseFragment baseFragment, int i) {
        openByUserName(str, baseFragment, i, null);
    }

    public void openByUserName(java.lang.String r16, final org.telegram.ui.ActionBar.BaseFragment r17, final int r18, final org.telegram.messenger.browser.Browser.Progress r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.openByUserName(java.lang.String, org.telegram.ui.ActionBar.BaseFragment, int, org.telegram.messenger.browser.Browser$Progress):void");
    }

    public void lambda$openByUserName$415(Browser.Progress progress, AlertDialog[] alertDialogArr, BaseFragment baseFragment, boolean[] zArr, int i, Long l) {
        try {
            if (progress != null) {
                progress.end();
            } else {
                alertDialogArr[0].dismiss();
            }
        } catch (Exception unused) {
        }
        alertDialogArr[0] = null;
        baseFragment.setVisibleDialog(null);
        if (zArr[0]) {
            return;
        }
        if (l != null) {
            if (l.longValue() < 0) {
                openChatOrProfileWith(null, getChat(Long.valueOf(-l.longValue())), baseFragment, 1, false);
                return;
            } else {
                openChatOrProfileWith(getUser(l), null, baseFragment, i, false);
                return;
            }
        }
        if (baseFragment.getParentActivity() != null) {
            try {
                if (baseFragment instanceof ChatActivity) {
                    ((ChatActivity) baseFragment).shakeContent();
                }
                BulletinFactory.of(baseFragment).createErrorBulletin(LocaleController.getString(R.string.NoUsernameFound)).show();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static void lambda$openByUserName$416(boolean[] zArr) {
        zArr[0] = true;
    }

    public static void lambda$openByUserName$418(AlertDialog[] alertDialogArr, final boolean[] zArr, BaseFragment baseFragment) {
        AlertDialog alertDialog = alertDialogArr[0];
        if (alertDialog == null) {
            return;
        }
        alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public final void onCancel(DialogInterface dialogInterface) {
                MessagesController.lambda$openByUserName$417(zArr, dialogInterface);
            }
        });
        baseFragment.showDialog(alertDialogArr[0]);
    }

    public static void lambda$openByUserName$417(boolean[] zArr, DialogInterface dialogInterface) {
        zArr[0] = true;
    }

    public Runnable ensureMessagesLoaded(final long j, int i, final MessagesLoadedCallback messagesLoadedCallback) {
        int i2;
        int i3;
        SharedPreferences notificationsSettings = getNotificationsSettings(this.currentAccount);
        if (i == 0) {
            i2 = notificationsSettings.getInt("diditem" + j, 0);
        } else {
            i2 = i;
        }
        final int iGenerateClassGuid = ConnectionsManager.generateClassGuid();
        final long j2 = DialogObject.isChatDialog(j) ? -j : 0L;
        if (j2 != 0 && getMessagesController().getChat(Long.valueOf(j2)) == null) {
            final boolean[] zArr = new boolean[1];
            final Runnable[] runnableArr = new Runnable[1];
            final MessagesStorage messagesStorage = getMessagesStorage();
            final int i4 = i2;
            messagesStorage.getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$ensureMessagesLoaded$420(zArr, messagesStorage, j2, runnableArr, j, i4, messagesLoadedCallback);
                }
            });
            return new Runnable() {
                @Override
                public final void run() {
                    MessagesController.lambda$ensureMessagesLoaded$421(zArr, runnableArr);
                }
            };
        }
        int i5 = AndroidUtilities.isTablet() ? 30 : 20;
        final int i6 = i5;
        final int i7 = i2;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = new NotificationCenter.NotificationCenterDelegate() {
            @Override
            public void didReceivedNotification(int i8, int i9, Object... objArr) {
                int i10 = NotificationCenter.messagesDidLoadWithoutProcess;
                if (i8 == i10 && ((Integer) objArr[0]).intValue() == iGenerateClassGuid) {
                    int iIntValue = ((Integer) objArr[1]).intValue();
                    boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
                    boolean zBooleanValue2 = ((Boolean) objArr[3]).booleanValue();
                    int iIntValue2 = ((Integer) objArr[4]).intValue();
                    int i11 = i6;
                    if (iIntValue < i11 / 2 && !zBooleanValue2 && zBooleanValue) {
                        int i12 = i7;
                        if (i12 != 0) {
                            MessagesController.this.loadMessagesInternal(j, 0L, false, i11, i12, 0, false, 0, iGenerateClassGuid, 3, iIntValue2, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
                            return;
                        } else {
                            MessagesController.this.loadMessagesInternal(j, 0L, false, i11, i12, 0, false, 0, iGenerateClassGuid, 2, iIntValue2, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
                            return;
                        }
                    }
                    MessagesController.this.getNotificationCenter().removeObserver(this, i10);
                    MessagesController.this.getNotificationCenter().removeObserver(this, NotificationCenter.loadingMessagesFailed);
                    MessagesLoadedCallback messagesLoadedCallback2 = messagesLoadedCallback;
                    if (messagesLoadedCallback2 != null) {
                        messagesLoadedCallback2.onMessagesLoaded(zBooleanValue);
                        return;
                    }
                    return;
                }
                int i13 = NotificationCenter.loadingMessagesFailed;
                if (i8 == i13 && ((Integer) objArr[0]).intValue() == iGenerateClassGuid) {
                    MessagesController.this.getNotificationCenter().removeObserver(this, i10);
                    MessagesController.this.getNotificationCenter().removeObserver(this, i13);
                    MessagesLoadedCallback messagesLoadedCallback3 = messagesLoadedCallback;
                    if (messagesLoadedCallback3 != null) {
                        messagesLoadedCallback3.onError();
                    }
                }
            }
        };
        getNotificationCenter().addObserver(notificationCenterDelegate, NotificationCenter.messagesDidLoadWithoutProcess);
        getNotificationCenter().addObserver(notificationCenterDelegate, NotificationCenter.loadingMessagesFailed);
        if (i2 != 0) {
            i3 = iGenerateClassGuid;
            loadMessagesInternal(j, 0L, true, i5, i2, 0, true, 0, i3, 3, 0, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
        } else {
            i3 = iGenerateClassGuid;
            loadMessagesInternal(j, 0L, true, i5, i2, 0, true, 0, i3, 2, 0, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
        }
        final int i8 = i3;
        return new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$ensureMessagesLoaded$422(i8);
            }
        };
    }

    public void lambda$ensureMessagesLoaded$420(final boolean[] zArr, MessagesStorage messagesStorage, long j, final Runnable[] runnableArr, final long j2, final int i, final MessagesLoadedCallback messagesLoadedCallback) {
        if (zArr[0]) {
            return;
        }
        final TLRPC.Chat chat = messagesStorage.getChat(j);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$ensureMessagesLoaded$419(zArr, chat, runnableArr, j2, i, messagesLoadedCallback);
            }
        });
    }

    public void lambda$ensureMessagesLoaded$419(boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j, int i, MessagesLoadedCallback messagesLoadedCallback) {
        if (zArr[0]) {
            return;
        }
        if (chat != null) {
            getMessagesController().putChat(chat, true);
            runnableArr[0] = ensureMessagesLoaded(j, i, messagesLoadedCallback);
        } else if (messagesLoadedCallback != null) {
            messagesLoadedCallback.onError();
        }
    }

    public static void lambda$ensureMessagesLoaded$421(boolean[] zArr, Runnable[] runnableArr) {
        zArr[0] = true;
        Runnable runnable = runnableArr[0];
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$ensureMessagesLoaded$422(int i) {
        getConnectionsManager().cancelRequestsForGuid(i);
    }

    public int getChatPendingRequestsOnClosed(long j) {
        return this.mainPreferences.getInt("chatPendingRequests" + j, 0);
    }

    public void setChatPendingRequestsOnClose(long j, int i) {
        this.mainPreferences.edit().putInt("chatPendingRequests" + j, i).apply();
    }

    public void deleteMessagesRange(final long j, final long j2, final int i, final int i2, final boolean z, final Runnable runnable) {
        TLRPC.TL_messages_deleteHistory tL_messages_deleteHistory = new TLRPC.TL_messages_deleteHistory();
        tL_messages_deleteHistory.peer = getInputPeer(j);
        tL_messages_deleteHistory.flags = 12;
        tL_messages_deleteHistory.min_date = i;
        tL_messages_deleteHistory.max_date = i2;
        tL_messages_deleteHistory.revoke = z;
        getConnectionsManager().sendRequest(tL_messages_deleteHistory, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$deleteMessagesRange$426(j, i, i2, j2, z, runnable, tLObject, tL_error);
            }
        });
    }

    public void lambda$deleteMessagesRange$426(final long j, final int i, final int i2, final long j2, final boolean z, final Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            final TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
            processNewDifferenceParams(-1, tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$deleteMessagesRange$424(j, i, i2, j2, tL_messages_affectedHistory, z, runnable);
                }
            });
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                runnable.run();
            }
        });
    }

    public void lambda$deleteMessagesRange$424(final long j, final int i, final int i2, final long j2, final TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, final boolean z, final Runnable runnable) {
        final ArrayList<Integer> cachedMessagesInRange = getMessagesStorage().getCachedMessagesInRange(j, i, i2);
        getMessagesStorage().markMessagesAsDeleted(j, cachedMessagesInRange, false, true, 0, 0);
        getMessagesStorage().updateDialogsWithDeletedMessages(j, 0L, cachedMessagesInRange, null, false);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$deleteMessagesRange$423(cachedMessagesInRange, j2, tL_messages_affectedHistory, j, i, i2, z, runnable);
            }
        });
    }

    public void lambda$deleteMessagesRange$423(ArrayList arrayList, long j, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, long j2, int i, int i2, boolean z, Runnable runnable) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesDeleted, arrayList, Long.valueOf(j), Boolean.FALSE);
        if (tL_messages_affectedHistory.offset > 0) {
            deleteMessagesRange(j2, j, i, i2, z, runnable);
        } else {
            runnable.run();
        }
    }

    public void setCustomChatReactions(final long j, int i, List<TLRPC.Reaction> list, int i2, Boolean bool, final Utilities.Callback<TLRPC.TL_error> callback, final Runnable runnable) {
        final TLRPC.TL_messages_setChatAvailableReactions tL_messages_setChatAvailableReactions = new TLRPC.TL_messages_setChatAvailableReactions();
        tL_messages_setChatAvailableReactions.peer = getInputPeer(-j);
        if (i == 2 || list.isEmpty()) {
            tL_messages_setChatAvailableReactions.available_reactions = new TLRPC.TL_chatReactionsNone();
        } else if (i == 0) {
            tL_messages_setChatAvailableReactions.available_reactions = new TLRPC.TL_chatReactionsAll();
        } else {
            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = new TLRPC.TL_chatReactionsSome();
            tL_messages_setChatAvailableReactions.available_reactions = tL_chatReactionsSome;
            tL_chatReactionsSome.reactions.addAll(list);
        }
        if (bool != null) {
            tL_messages_setChatAvailableReactions.flags |= 2;
            tL_messages_setChatAvailableReactions.paid_enabled = bool.booleanValue();
        }
        tL_messages_setChatAvailableReactions.flags |= 1;
        tL_messages_setChatAvailableReactions.reactions_limit = i2;
        getConnectionsManager().sendRequest(tL_messages_setChatAvailableReactions, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$setCustomChatReactions$429(j, tL_messages_setChatAvailableReactions, runnable, callback, tLObject, tL_error);
            }
        });
        TLRPC.ChatFull chatFull = getChatFull(j);
        if (chatFull != null) {
            if (chatFull instanceof TLRPC.TL_channelFull) {
                chatFull.flags2 |= 8192;
            } else {
                chatFull.flags |= 1048576;
            }
            chatFull.reactions_limit = i2;
            if (bool != null) {
                chatFull.paid_reactions_available = bool.booleanValue();
            }
            getMessagesStorage().updateChatInfo(chatFull, false);
        }
    }

    public void lambda$setCustomChatReactions$429(final long j, TLRPC.TL_messages_setChatAvailableReactions tL_messages_setChatAvailableReactions, final Runnable runnable, final Utilities.Callback callback, TLObject tLObject, final TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            processUpdates((TLRPC.Updates) tLObject, false);
            TLRPC.ChatFull chatFull = getChatFull(j);
            if (chatFull != null) {
                if (chatFull instanceof TLRPC.TL_chatFull) {
                    chatFull.flags |= 262144;
                }
                if (chatFull instanceof TLRPC.TL_channelFull) {
                    chatFull.flags |= 1073741824;
                }
                chatFull.available_reactions = tL_messages_setChatAvailableReactions.available_reactions;
                getMessagesStorage().updateChatInfo(chatFull, false);
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$setCustomChatReactions$427(runnable, j);
                }
            });
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.lambda$setCustomChatReactions$428(callback, tL_error);
            }
        });
    }

    public void lambda$setCustomChatReactions$427(Runnable runnable, long j) {
        if (runnable != null) {
            runnable.run();
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatAvailableReactionsUpdated, Long.valueOf(j), 0L);
    }

    public static void lambda$setCustomChatReactions$428(Utilities.Callback callback, TLRPC.TL_error tL_error) {
        if (callback != null) {
            callback.run(tL_error);
        }
    }

    public void setChatReactions(final long j, int i, List<String> list) {
        final TLRPC.TL_messages_setChatAvailableReactions tL_messages_setChatAvailableReactions = new TLRPC.TL_messages_setChatAvailableReactions();
        tL_messages_setChatAvailableReactions.peer = getInputPeer(-j);
        if (i == 2) {
            tL_messages_setChatAvailableReactions.available_reactions = new TLRPC.TL_chatReactionsNone();
        } else if (i == 0) {
            tL_messages_setChatAvailableReactions.available_reactions = new TLRPC.TL_chatReactionsAll();
        } else {
            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = new TLRPC.TL_chatReactionsSome();
            tL_messages_setChatAvailableReactions.available_reactions = tL_chatReactionsSome;
            for (int i2 = 0; i2 < list.size(); i2++) {
                TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                tL_reactionEmoji.emoticon = list.get(i2);
                tL_chatReactionsSome.reactions.add(tL_reactionEmoji);
            }
        }
        getConnectionsManager().sendRequest(tL_messages_setChatAvailableReactions, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$setChatReactions$431(j, tL_messages_setChatAvailableReactions, tLObject, tL_error);
            }
        });
    }

    public void lambda$setChatReactions$431(final long j, TLRPC.TL_messages_setChatAvailableReactions tL_messages_setChatAvailableReactions, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            processUpdates((TLRPC.Updates) tLObject, false);
            TLRPC.ChatFull chatFull = getChatFull(j);
            if (chatFull != null) {
                if (chatFull instanceof TLRPC.TL_chatFull) {
                    chatFull.flags |= 262144;
                }
                if (chatFull instanceof TLRPC.TL_channelFull) {
                    chatFull.flags |= 1073741824;
                }
                chatFull.available_reactions = tL_messages_setChatAvailableReactions.available_reactions;
                getMessagesStorage().updateChatInfo(chatFull, false);
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$setChatReactions$430(j);
                }
            });
        }
    }

    public void lambda$setChatReactions$430(long j) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatAvailableReactionsUpdated, Long.valueOf(j), 0L);
    }

    public boolean matchesAdminRights(TLRPC.Chat chat, TLRPC.User user, TLRPC.TL_chatAdminRights tL_chatAdminRights) {
        if (tL_chatAdminRights == null) {
            return true;
        }
        TLRPC.TL_chatAdminRights chatAdminRightsCached = getChatAdminRightsCached(chat, user);
        if ((!tL_chatAdminRights.change_info || (chatAdminRightsCached != null && chatAdminRightsCached.change_info)) && ((!tL_chatAdminRights.post_messages || (chatAdminRightsCached != null && chatAdminRightsCached.post_messages)) && ((!tL_chatAdminRights.edit_messages || (chatAdminRightsCached != null && chatAdminRightsCached.edit_messages)) && ((!tL_chatAdminRights.delete_messages || (chatAdminRightsCached != null && chatAdminRightsCached.delete_messages)) && ((!tL_chatAdminRights.ban_users || (chatAdminRightsCached != null && chatAdminRightsCached.ban_users)) && ((!tL_chatAdminRights.invite_users || (chatAdminRightsCached != null && chatAdminRightsCached.invite_users)) && ((!tL_chatAdminRights.pin_messages || (chatAdminRightsCached != null && chatAdminRightsCached.pin_messages)) && ((!tL_chatAdminRights.add_admins || (chatAdminRightsCached != null && chatAdminRightsCached.add_admins)) && ((!tL_chatAdminRights.anonymous || (chatAdminRightsCached != null && chatAdminRightsCached.anonymous)) && ((!tL_chatAdminRights.manage_call || (chatAdminRightsCached != null && chatAdminRightsCached.manage_call)) && (!tL_chatAdminRights.other || (chatAdminRightsCached != null && chatAdminRightsCached.other)))))))))))) {
            if (!tL_chatAdminRights.manage_topics) {
                return true;
            }
            if (chatAdminRightsCached != null && chatAdminRightsCached.manage_topics) {
                return true;
            }
        }
        return false;
    }

    public TLRPC.TL_chatAdminRights getChatAdminRightsCached(TLRPC.Chat chat, TLRPC.User user) {
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        TLRPC.ChannelParticipant channelParticipant;
        if (chat != null && user != null) {
            if (UserObject.isUserSelf(user)) {
                return chat.admin_rights;
            }
            TLRPC.ChatFull chatFull = getChatFull(chat.id);
            if (chatFull != null && (chatParticipants = chatFull.participants) != null && (arrayList = chatParticipants.participants) != null) {
                for (int i = 0; i < arrayList.size(); i++) {
                    TLRPC.ChatParticipant chatParticipant = arrayList.get(i);
                    if (chatParticipant != null && chatParticipant.user_id == user.id) {
                        if (!(chatParticipant instanceof TLRPC.TL_chatChannelParticipant) || (channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant) == null) {
                            return null;
                        }
                        return channelParticipant.admin_rights;
                    }
                }
            }
        }
        return null;
    }

    public boolean isInChatCached(TLRPC.Chat chat, TLRPC.User user) {
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        if (chat != null && user != null) {
            if (UserObject.isUserSelf(user)) {
                return !ChatObject.isNotInChat(chat);
            }
            TLRPC.ChatFull chatFull = getChatFull(chat.id);
            if (chatFull != null && (chatParticipants = chatFull.participants) != null && (arrayList = chatParticipants.participants) != null) {
                for (int i = 0; i < arrayList.size(); i++) {
                    TLRPC.ChatParticipant chatParticipant = arrayList.get(i);
                    if (chatParticipant != null && chatParticipant.user_id == user.id) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void getChannelParticipant(TLRPC.Chat chat, TLRPC.User user, final Utilities.Callback<TLRPC.ChannelParticipant> callback) {
        if (chat == null || user == null) {
            if (callback != null) {
                callback.run(null);
            }
        } else {
            TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
            tL_channels_getParticipant.channel = getInputChannel(chat.id);
            tL_channels_getParticipant.participant = getInputPeer(user);
            getConnectionsManager().sendRequest(tL_channels_getParticipant, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    MessagesController.lambda$getChannelParticipant$432(callback, tLObject, tL_error);
                }
            });
        }
    }

    public static void lambda$getChannelParticipant$432(Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (callback != null) {
            callback.run(tLObject instanceof TLRPC.TL_channels_channelParticipant ? ((TLRPC.TL_channels_channelParticipant) tLObject).participant : null);
        }
    }

    public void checkIsInChat(boolean r11, org.telegram.tgnet.TLRPC.Chat r12, org.telegram.tgnet.TLRPC.User r13, final org.telegram.messenger.MessagesController.IsInChatCheckedCallback r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.checkIsInChat(boolean, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User, org.telegram.messenger.MessagesController$IsInChatCheckedCallback):void");
    }

    public static void lambda$checkIsInChat$433(IsInChatCheckedCallback isInChatCheckedCallback, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (isInChatCheckedCallback != null) {
            TLRPC.ChannelParticipant channelParticipant = tLObject instanceof TLRPC.TL_channels_channelParticipant ? ((TLRPC.TL_channels_channelParticipant) tLObject).participant : null;
            isInChatCheckedCallback.run((tL_error != null || channelParticipant == null || channelParticipant.left) ? false : true, channelParticipant != null ? channelParticipant.admin_rights : null, channelParticipant != null ? channelParticipant.rank : null);
        }
    }

    public void updateEmojiStatusUntilUpdate(long j, TLRPC.EmojiStatus emojiStatus) {
        int emojiStatusUntil = DialogObject.getEmojiStatusUntil(emojiStatus);
        if (emojiStatusUntil != 0) {
            this.emojiStatusUntilValues.put(Long.valueOf(j), Integer.valueOf(emojiStatusUntil));
        } else if (!this.emojiStatusUntilValues.containsKey(Long.valueOf(j))) {
            return;
        } else {
            this.emojiStatusUntilValues.remove(Long.valueOf(j));
        }
        updateEmojiStatusUntil();
    }

    public void updateEmojiStatusUntil() {
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        Iterator<Long> it = this.emojiStatusUntilValues.keySet().iterator();
        Long lValueOf = null;
        while (it.hasNext()) {
            if (this.emojiStatusUntilValues.get(it.next()).intValue() > iCurrentTimeMillis) {
                lValueOf = Long.valueOf(Math.min(lValueOf == null ? Long.MAX_VALUE : lValueOf.longValue(), r5 - iCurrentTimeMillis));
            } else {
                it.remove();
            }
        }
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue() + 2;
            long j = iCurrentTimeMillis;
            if (j + jLongValue != this.recentEmojiStatusUpdateRunnableTime + this.recentEmojiStatusUpdateRunnableTimeout) {
                AndroidUtilities.cancelRunOnUIThread(this.recentEmojiStatusUpdateRunnable);
                this.recentEmojiStatusUpdateRunnableTime = j;
                this.recentEmojiStatusUpdateRunnableTimeout = jLongValue;
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$updateEmojiStatusUntil$434();
                    }
                };
                this.recentEmojiStatusUpdateRunnable = runnable;
                AndroidUtilities.runOnUIThread(runnable, jLongValue * 1000);
                return;
            }
            return;
        }
        Runnable runnable2 = this.recentEmojiStatusUpdateRunnable;
        if (runnable2 != null) {
            this.recentEmojiStatusUpdateRunnableTime = -1L;
            this.recentEmojiStatusUpdateRunnableTimeout = -1L;
            AndroidUtilities.cancelRunOnUIThread(runnable2);
        }
    }

    public void lambda$updateEmojiStatusUntil$434() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_EMOJI_STATUS));
        updateEmojiStatusUntil();
    }

    public String getMutedString(long j, long j2) {
        if (getMessagesController().isDialogMuted(j, j2)) {
            int i = this.notificationsPreferences.getInt("notifyuntil_" + NotificationsController.getSharedPrefKey(j, j2), 0);
            return i >= getConnectionsManager().getCurrentTime() ? LocaleController.formatString("NotificationsMutedForHint", R.string.NotificationsMutedForHint, LocaleController.formatTTLString(i)) : LocaleController.getString(R.string.NotificationsMuted);
        }
        return LocaleController.getString(R.string.NotificationsUnmuted);
    }

    public int getDialogUnreadCount(TLRPC.Dialog dialog) {
        if (dialog == null) {
            return 0;
        }
        int i = dialog.unread_count;
        TLRPC.Chat chat = getChat(Long.valueOf(-dialog.id));
        return chat != null ? (chat.forum || chat.monoforum) ? this.topicsController.getForumUnreadCount(-dialog.id)[0] : i : i;
    }

    public TLRPC.TL_exportedContactToken getCachedContactToken() {
        if (this.cachedContactToken == null || r0.expires <= System.currentTimeMillis() / 1000) {
            return null;
        }
        return this.cachedContactToken;
    }

    public void requestContactToken(Utilities.Callback<TLRPC.TL_exportedContactToken> callback) {
        requestContactToken(0L, callback);
    }

    public void requestContactToken(final long j, final Utilities.Callback<TLRPC.TL_exportedContactToken> callback) {
        if (callback == null || this.requestingContactToken) {
            return;
        }
        if (this.cachedContactToken != null && r0.expires > System.currentTimeMillis() / 1000) {
            callback.run(this.cachedContactToken);
            return;
        }
        this.requestingContactToken = true;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        getConnectionsManager().sendRequest(new TLRPC.TL_contacts_exportContactToken(), new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$requestContactToken$436(callback, j, jCurrentTimeMillis, tLObject, tL_error);
            }
        });
    }

    public void lambda$requestContactToken$436(final Utilities.Callback callback, long j, long j2, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_exportedContactToken) {
            this.cachedContactToken = (TLRPC.TL_exportedContactToken) tLObject;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$requestContactToken$435(callback);
                }
            }, Math.max(0L, j - (System.currentTimeMillis() - j2)));
        } else {
            this.requestingContactToken = false;
        }
    }

    public void lambda$requestContactToken$435(Utilities.Callback callback) {
        callback.run(this.cachedContactToken);
        this.requestingContactToken = false;
    }

    public CacheByChatsController getCacheByChatsController() {
        return this.cacheByChatsController;
    }

    public int getFilterIdByDialogsType(int i) {
        if (i != 7 && i != 8) {
            return 0;
        }
        DialogFilter dialogFilter = this.selectedDialogFilter[i - 7];
        if (dialogFilter == null) {
            return -1;
        }
        return dialogFilter.id;
    }

    public void invalidateChatlistFolderUpdate(int i) {
        this.chatlistFoldersUpdates.remove(i);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatlistFolderUpdate, Integer.valueOf(i));
    }

    public void checkChatlistFolderUpdate(final int i, boolean z) {
        if (i < 0) {
            return;
        }
        final ChatlistUpdatesStat chatlistUpdatesStat = this.chatlistFoldersUpdates.get(i);
        if (chatlistUpdatesStat != null) {
            if (chatlistUpdatesStat.loading) {
                return;
            }
            if (System.currentTimeMillis() - chatlistUpdatesStat.lastRequestTime <= this.chatlistUpdatePeriod * 1000 && !z) {
                return;
            }
        }
        if (chatlistUpdatesStat == null) {
            chatlistUpdatesStat = new ChatlistUpdatesStat();
            this.chatlistFoldersUpdates.put(i, chatlistUpdatesStat);
        }
        chatlistUpdatesStat.loading = false;
        TL_chatlists.TL_chatlists_getChatlistUpdates tL_chatlists_getChatlistUpdates = new TL_chatlists.TL_chatlists_getChatlistUpdates();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_getChatlistUpdates.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = i;
        getConnectionsManager().sendRequest(tL_chatlists_getChatlistUpdates, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$checkChatlistFolderUpdate$438(i, chatlistUpdatesStat, tLObject, tL_error);
            }
        });
    }

    public void lambda$checkChatlistFolderUpdate$438(final int i, final ChatlistUpdatesStat chatlistUpdatesStat, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$checkChatlistFolderUpdate$437(tLObject, i, chatlistUpdatesStat);
            }
        });
    }

    public void lambda$checkChatlistFolderUpdate$437(TLObject tLObject, int i, ChatlistUpdatesStat chatlistUpdatesStat) {
        if (tLObject instanceof TL_chatlists.TL_chatlists_chatlistUpdates) {
            TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = (TL_chatlists.TL_chatlists_chatlistUpdates) tLObject;
            putChats(tL_chatlists_chatlistUpdates.chats, false);
            putUsers(tL_chatlists_chatlistUpdates.users, false);
            this.chatlistFoldersUpdates.put(i, new ChatlistUpdatesStat(tL_chatlists_chatlistUpdates));
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatlistFolderUpdate, Integer.valueOf(i));
            return;
        }
        chatlistUpdatesStat.loading = false;
    }

    public TL_chatlists.TL_chatlists_chatlistUpdates getChatlistFolderUpdates(int i) {
        ChatlistUpdatesStat chatlistUpdatesStat = this.chatlistFoldersUpdates.get(i);
        if (chatlistUpdatesStat == null) {
            return null;
        }
        return chatlistUpdatesStat.lastValue;
    }

    public Pair<Runnable, Runnable> removeFolderTemporarily(final int i, ArrayList<Long> arrayList) {
        this.frozenDialogFilters = new ArrayList<>(this.dialogFilters);
        int i2 = 0;
        while (i2 < this.frozenDialogFilters.size()) {
            if (this.frozenDialogFilters.get(i2).id == i) {
                this.frozenDialogFilters.remove(i2);
                i2--;
            }
            i2++;
        }
        this.hiddenUndoChats.clear();
        if (arrayList != null) {
            this.hiddenUndoChats.addAll(arrayList);
        }
        boolean zIsEmpty = this.hiddenUndoChats.isEmpty();
        final boolean z = !zIsEmpty;
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
        if (!zIsEmpty) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
        }
        return new Pair<>(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$removeFolderTemporarily$439(i, z);
            }
        }, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$removeFolderTemporarily$440(z);
            }
        });
    }

    public void lambda$removeFolderTemporarily$439(int i, boolean z) {
        int i2 = 0;
        while (i2 < this.dialogFilters.size()) {
            if (this.dialogFilters.get(i2).id == i) {
                this.dialogFilters.remove(i2);
                i2--;
            }
            i2++;
        }
        this.frozenDialogFilters = null;
        this.hiddenUndoChats.clear();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
        if (z) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
        }
    }

    public void lambda$removeFolderTemporarily$440(boolean z) {
        this.frozenDialogFilters = null;
        this.hiddenUndoChats.clear();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
        if (z) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
        }
    }

    public boolean isHiddenByUndo(long j) {
        return !this.hiddenUndoChats.isEmpty() && this.hiddenUndoChats.contains(Long.valueOf(j));
    }

    public void cancelUploadWallpaper() {
        Theme.OverrideWallpaperInfo overrideWallpaperInfo = this.uploadingWallpaperInfo;
        if (overrideWallpaperInfo != null) {
            if (overrideWallpaperInfo.requestIds != null) {
                for (int i = 0; i < this.uploadingWallpaperInfo.requestIds.size(); i++) {
                    ConnectionsManager.getInstance(this.currentAccount).cancelRequest(((Integer) this.uploadingWallpaperInfo.requestIds.get(i)).intValue(), true);
                }
            }
            FileLoader.getInstance(this.currentAccount).cancelFileUpload(this.uploadingWallpaper, false);
            long j = this.uploadingWallpaperInfo.dialogId;
            if (j != 0) {
                if (j >= 0) {
                    TLRPC.UserFull userFull = getUserFull(j);
                    if (userFull != null) {
                        userFull.wallpaper = this.uploadingWallpaperInfo.prevUserWallpaper;
                        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(this.uploadingWallpaperInfo.dialogId), userFull);
                    }
                } else {
                    TLRPC.ChatFull chatFull = getChatFull(-j);
                    if (chatFull != null) {
                        chatFull.wallpaper = this.uploadingWallpaperInfo.prevUserWallpaper;
                        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                        int i2 = NotificationCenter.chatInfoDidLoad;
                        Boolean bool = Boolean.FALSE;
                        notificationCenter.lambda$postNotificationNameOnUIThread$1(i2, chatFull, 0, bool, bool);
                    }
                }
            }
            this.uploadingWallpaperInfo = null;
            this.uploadingWallpaper = null;
        }
    }

    public StoriesController getStoriesController() {
        StoriesController storiesController = this.storiesController;
        if (storiesController != null) {
            return storiesController;
        }
        synchronized (lockObjects[this.currentAccount]) {
            try {
                StoriesController storiesController2 = this.storiesController;
                if (storiesController2 != null) {
                    return storiesController2;
                }
                StoriesController storiesController3 = new StoriesController(this.currentAccount);
                this.storiesController = storiesController3;
                return storiesController3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public SavedMessagesController getSavedMessagesController() {
        SavedMessagesController savedMessagesController = this.savedMessagesController;
        if (savedMessagesController != null) {
            return savedMessagesController;
        }
        synchronized (lockObjects[this.currentAccount]) {
            try {
                SavedMessagesController savedMessagesController2 = this.savedMessagesController;
                if (savedMessagesController2 != null) {
                    return savedMessagesController2;
                }
                SavedMessagesController savedMessagesController3 = new SavedMessagesController(this.currentAccount);
                this.savedMessagesController = savedMessagesController3;
                return savedMessagesController3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public UnconfirmedAuthController getUnconfirmedAuthController() {
        UnconfirmedAuthController unconfirmedAuthController = this.unconfirmedAuthController;
        if (unconfirmedAuthController != null) {
            return unconfirmedAuthController;
        }
        synchronized (lockObjects[this.currentAccount]) {
            try {
                UnconfirmedAuthController unconfirmedAuthController2 = this.unconfirmedAuthController;
                if (unconfirmedAuthController2 != null) {
                    return unconfirmedAuthController2;
                }
                UnconfirmedAuthController unconfirmedAuthController3 = new UnconfirmedAuthController(this.currentAccount);
                this.unconfirmedAuthController = unconfirmedAuthController3;
                return unconfirmedAuthController3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean storiesEnabled() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.storiesEnabled():boolean");
    }

    public boolean storyEntitiesAllowed() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.storyEntitiesAllowed():boolean");
    }

    public boolean storyEntitiesAllowed(org.telegram.tgnet.TLRPC.User r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.storyEntitiesAllowed(org.telegram.tgnet.TLRPC$User):boolean");
    }

    public static class ChannelRecommendations {
        public final ArrayList<TLObject> chats = new ArrayList<>();
        public int more;
        public boolean wasPremium;

        public static boolean hasRecommendations(ChannelRecommendations channelRecommendations) {
            return (channelRecommendations == null || channelRecommendations.chats.isEmpty()) ? false : true;
        }

        public static boolean hasRecommendations(int i, long j) {
            return hasRecommendations(MessagesController.getInstance(i).getChannelRecommendations(j));
        }
    }

    public ChannelRecommendations getCachedChannelRecommendations(long j) {
        HashMap<Long, ChannelRecommendations> map = this.cachedChannelRecommendations;
        if (map == null) {
            return null;
        }
        return map.get(Long.valueOf(j));
    }

    public ChannelRecommendations getChannelRecommendations(final long j) {
        ChannelRecommendations channelRecommendations;
        TLRPC.TL_channels_getChannelRecommendations tL_channels_getChannelRecommendations;
        if (this.cachedChannelRecommendations == null) {
            this.cachedChannelRecommendations = new HashMap<>();
        }
        final boolean zIsPremium = getUserConfig().isPremium();
        if (this.cachedChannelRecommendations.containsKey(Long.valueOf(j))) {
            channelRecommendations = this.cachedChannelRecommendations.get(Long.valueOf(j));
            if (channelRecommendations == null || channelRecommendations.wasPremium == zIsPremium) {
                return channelRecommendations;
            }
        } else {
            channelRecommendations = null;
        }
        if (j > 0) {
            TL_bots.getBotRecommendations getbotrecommendations = new TL_bots.getBotRecommendations();
            TLRPC.InputUser inputUser = getInputUser(j);
            getbotrecommendations.bot = inputUser;
            tL_channels_getChannelRecommendations = getbotrecommendations;
            if (inputUser == null) {
                return null;
            }
        } else {
            TLRPC.TL_channels_getChannelRecommendations tL_channels_getChannelRecommendations2 = new TLRPC.TL_channels_getChannelRecommendations();
            tL_channels_getChannelRecommendations = tL_channels_getChannelRecommendations2;
            if (j != 0) {
                tL_channels_getChannelRecommendations2.flags |= 1;
                TLRPC.InputChannel inputChannel = getInputChannel(-j);
                tL_channels_getChannelRecommendations2.channel = inputChannel;
                tL_channels_getChannelRecommendations = tL_channels_getChannelRecommendations2;
                if (inputChannel == null) {
                    return null;
                }
            }
        }
        this.cachedChannelRecommendations.put(Long.valueOf(j), null);
        getConnectionsManager().sendRequest(tL_channels_getChannelRecommendations, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$getChannelRecommendations$442(zIsPremium, j, tLObject, tL_error);
            }
        });
        return channelRecommendations;
    }

    public void lambda$getChannelRecommendations$442(final boolean z, final long j, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$getChannelRecommendations$441(tLObject, z, j);
            }
        });
    }

    public void lambda$getChannelRecommendations$441(TLObject tLObject, boolean z, long j) {
        if (tLObject instanceof TLRPC.messages_Chats) {
            ArrayList<TLRPC.Chat> arrayList = ((TLRPC.messages_Chats) tLObject).chats;
            putChats(arrayList, false);
            ChannelRecommendations channelRecommendations = new ChannelRecommendations();
            channelRecommendations.wasPremium = z;
            channelRecommendations.chats.addAll(arrayList);
            if (tLObject instanceof TLRPC.TL_messages_chatsSlice) {
                channelRecommendations.more = Math.max(0, ((TLRPC.TL_messages_chatsSlice) tLObject).count - arrayList.size());
            } else if (!getUserConfig().isPremium() && BuildVars.DEBUG_PRIVATE_VERSION) {
                channelRecommendations.more = 90;
            }
            this.cachedChannelRecommendations.put(Long.valueOf(j), channelRecommendations);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(j));
            return;
        }
        if (tLObject instanceof TLRPC.Users) {
            ArrayList<TLRPC.User> arrayList2 = ((TLRPC.Users) tLObject).users;
            putUsers(arrayList2, false);
            ChannelRecommendations channelRecommendations2 = new ChannelRecommendations();
            channelRecommendations2.wasPremium = z;
            channelRecommendations2.chats.addAll(arrayList2);
            if (tLObject instanceof TLRPC.TL_usersSlice) {
                channelRecommendations2.more = Math.max(0, ((TLRPC.TL_usersSlice) tLObject).count - arrayList2.size());
            } else if (!getUserConfig().isPremium() && BuildVars.DEBUG_PRIVATE_VERSION) {
                channelRecommendations2.more = 90;
            }
            this.cachedChannelRecommendations.put(Long.valueOf(j), channelRecommendations2);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(j));
        }
    }

    public boolean processDeletedReactionTags(TLRPC.Message message) {
        TLRPC.TL_messageReactions tL_messageReactions;
        if (message == null || DialogObject.getPeerDialogId(message.peer_id) != getUserConfig().getClientUserId() || (tL_messageReactions = message.reactions) == null || !tL_messageReactions.reactions_as_tags || tL_messageReactions.results == null) {
            return false;
        }
        long savedDialogId = MessageObject.getSavedDialogId(getUserConfig().getClientUserId(), message);
        boolean z = false;
        for (int i = 0; i < message.reactions.results.size(); i++) {
            if (updateSavedReactionTags(savedDialogId, ReactionsLayoutInBubble.VisibleReaction.fromTL(message.reactions.results.get(i).reaction), false, false)) {
                z = true;
            }
        }
        return z;
    }

    public boolean updateSavedReactionTags(long j, ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z, boolean z2) {
        if (this.reactionTags == null) {
            return false;
        }
        int i = 0;
        boolean z3 = false;
        while (i < 2) {
            long j2 = i == 0 ? 0L : j;
            boolean z4 = true;
            if (i != 1 || j2 != 0) {
                TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags = (TLRPC.TL_messages_savedReactionsTags) this.reactionTags.get(j2);
                if (tL_messages_savedReactionsTags == null) {
                    if (j2 != 0) {
                        LongSparseArray longSparseArray = this.reactionTags;
                        tL_messages_savedReactionsTags = new TLRPC.TL_messages_savedReactionsTags();
                        longSparseArray.put(j2, tL_messages_savedReactionsTags);
                    }
                }
                int i2 = 0;
                boolean z5 = false;
                boolean z6 = false;
                while (i2 < tL_messages_savedReactionsTags.tags.size()) {
                    TLRPC.TL_savedReactionTag tL_savedReactionTag = tL_messages_savedReactionsTags.tags.get(i2);
                    if (visibleReaction.isSame(tL_savedReactionTag.reaction)) {
                        int i3 = tL_savedReactionTag.count;
                        int iMax = Math.max(0, (z ? 1 : -1) + i3);
                        tL_savedReactionTag.count = iMax;
                        if (iMax <= 0) {
                            tL_messages_savedReactionsTags.tags.remove(i2);
                            i2--;
                        } else if (iMax == i3) {
                            z5 = true;
                        }
                        z3 = true;
                        z5 = true;
                        z6 = true;
                    }
                    i2++;
                }
                if (z5 || !z) {
                    z4 = z6;
                } else {
                    TLRPC.TL_savedReactionTag tL_savedReactionTag2 = new TLRPC.TL_savedReactionTag();
                    tL_savedReactionTag2.reaction = visibleReaction.toTLReaction();
                    tL_savedReactionTag2.count = 1;
                    tL_messages_savedReactionsTags.tags.add(tL_savedReactionTag2);
                    z3 = true;
                }
                if (z2 && z4) {
                    updateSavedReactionTags(j2);
                }
            }
            i++;
        }
        return z3;
    }

    public void updateSavedReactionTags(HashSet<Long> hashSet) {
        updateSavedReactionTags(0L);
        Iterator<Long> it = hashSet.iterator();
        while (it.hasNext()) {
            updateSavedReactionTags(it.next().longValue());
        }
    }

    public void updateSavedReactionTags(long j) {
        String str;
        LongSparseArray longSparseArray = this.reactionTags;
        if (longSparseArray == null) {
            return;
        }
        TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags = (TLRPC.TL_messages_savedReactionsTags) longSparseArray.get(j);
        if (tL_messages_savedReactionsTags == null) {
            if (j == 0) {
                return;
            }
            LongSparseArray longSparseArray2 = this.reactionTags;
            TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags2 = new TLRPC.TL_messages_savedReactionsTags();
            longSparseArray2.put(j, tL_messages_savedReactionsTags2);
            tL_messages_savedReactionsTags = tL_messages_savedReactionsTags2;
        }
        Collections.sort(tL_messages_savedReactionsTags.tags, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return this.f$0.lambda$updateSavedReactionTags$443((TLRPC.TL_savedReactionTag) obj, (TLRPC.TL_savedReactionTag) obj2);
            }
        });
        long jCalcHash = 0;
        for (int i = 0; i < tL_messages_savedReactionsTags.tags.size(); i++) {
            TLRPC.TL_savedReactionTag tL_savedReactionTag = tL_messages_savedReactionsTags.tags.get(i);
            if (tL_savedReactionTag.count > 0) {
                TLRPC.Reaction reaction = tL_savedReactionTag.reaction;
                if (reaction instanceof TLRPC.TL_reactionEmoji) {
                    String strSubstring = Utilities.MD5(((TLRPC.TL_reactionEmoji) reaction).emoticon).substring(0, 16);
                    jCalcHash = MediaDataController.calcHash(jCalcHash, MessagesController$$ExternalSyntheticBackport12.m(strSubstring, 0, strSubstring.length(), 16));
                } else if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                    jCalcHash = MediaDataController.calcHash(jCalcHash, ((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
                }
                if (j == 0 && (tL_savedReactionTag.flags & 1) != 0 && (str = tL_savedReactionTag.title) != null) {
                    String strSubstring2 = Utilities.MD5(str).substring(0, 16);
                    jCalcHash = MediaDataController.calcHash(jCalcHash, MessagesController$$ExternalSyntheticBackport10.m(strSubstring2, 0, strSubstring2.length(), 16));
                }
                jCalcHash = MediaDataController.calcHash(jCalcHash, tL_savedReactionTag.count);
            }
        }
        tL_messages_savedReactionsTags.hash = jCalcHash;
        saveSavedReactionsTags(j, tL_messages_savedReactionsTags);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.savedReactionTagsUpdate, Long.valueOf(j));
    }

    public int lambda$updateSavedReactionTags$443(TLRPC.TL_savedReactionTag tL_savedReactionTag, TLRPC.TL_savedReactionTag tL_savedReactionTag2) {
        int i = tL_savedReactionTag.count;
        int i2 = tL_savedReactionTag2.count;
        return i == i2 ? Long.compare(getTagLongId(tL_savedReactionTag2.reaction) ^ Long.MIN_VALUE, getTagLongId(tL_savedReactionTag.reaction) ^ Long.MIN_VALUE) : i2 - i;
    }

    public String getSavedTagName(ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
        TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags;
        LongSparseArray longSparseArray = this.reactionTags;
        if (longSparseArray == null || (tL_messages_savedReactionsTags = (TLRPC.TL_messages_savedReactionsTags) longSparseArray.get(0L)) == null) {
            return null;
        }
        for (int i = 0; i < tL_messages_savedReactionsTags.tags.size(); i++) {
            if (visibleReaction.isSame(tL_messages_savedReactionsTags.tags.get(i).reaction)) {
                return tL_messages_savedReactionsTags.tags.get(i).title;
            }
        }
        return null;
    }

    public int getSavedTagCount(long j, ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
        TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags;
        LongSparseArray longSparseArray = this.reactionTags;
        if (longSparseArray == null || (tL_messages_savedReactionsTags = (TLRPC.TL_messages_savedReactionsTags) longSparseArray.get(j)) == null) {
            return 0;
        }
        for (int i = 0; i < tL_messages_savedReactionsTags.tags.size(); i++) {
            if (visibleReaction.isSame(tL_messages_savedReactionsTags.tags.get(i).reaction)) {
                return tL_messages_savedReactionsTags.tags.get(i).count;
            }
        }
        return 0;
    }

    public String getSavedTagName(TLRPC.Reaction reaction) {
        TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags;
        LongSparseArray longSparseArray = this.reactionTags;
        if (longSparseArray == null || (tL_messages_savedReactionsTags = (TLRPC.TL_messages_savedReactionsTags) longSparseArray.get(0L)) == null) {
            return null;
        }
        for (int i = 0; i < tL_messages_savedReactionsTags.tags.size(); i++) {
            if (ReactionsLayoutInBubble.reactionsEqual(reaction, tL_messages_savedReactionsTags.tags.get(i).reaction)) {
                return tL_messages_savedReactionsTags.tags.get(i).title;
            }
        }
        return null;
    }

    public void renameSavedReactionTag(ReactionsLayoutInBubble.VisibleReaction visibleReaction, String str) {
        boolean z;
        boolean z2;
        String str2;
        LongSparseArray longSparseArray = this.reactionTags;
        if (longSparseArray == null) {
            return;
        }
        TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags = (TLRPC.TL_messages_savedReactionsTags) longSparseArray.get(0L);
        if (tL_messages_savedReactionsTags == null) {
            LongSparseArray longSparseArray2 = this.reactionTags;
            TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags2 = new TLRPC.TL_messages_savedReactionsTags();
            longSparseArray2.put(0L, tL_messages_savedReactionsTags2);
            tL_messages_savedReactionsTags = tL_messages_savedReactionsTags2;
        }
        int i = 0;
        while (true) {
            if (i >= tL_messages_savedReactionsTags.tags.size()) {
                z = false;
                z2 = false;
                break;
            }
            TLRPC.TL_savedReactionTag tL_savedReactionTag = tL_messages_savedReactionsTags.tags.get(i);
            if (visibleReaction.isSame(tL_savedReactionTag.reaction)) {
                if (TextUtils.isEmpty(str)) {
                    z = tL_savedReactionTag.title != null;
                    tL_savedReactionTag.flags &= -2;
                    tL_savedReactionTag.title = null;
                } else {
                    z = !TextUtils.equals(tL_savedReactionTag.title, str);
                    tL_savedReactionTag.flags |= 1;
                    tL_savedReactionTag.title = str;
                }
                z2 = true;
            } else {
                i++;
            }
        }
        if (!z2) {
            TLRPC.TL_savedReactionTag tL_savedReactionTag2 = new TLRPC.TL_savedReactionTag();
            tL_savedReactionTag2.reaction = visibleReaction.toTLReaction();
            if (!TextUtils.isEmpty(str)) {
                tL_savedReactionTag2.title = str;
            }
            tL_savedReactionTag2.count = 1;
            tL_messages_savedReactionsTags.tags.add(tL_savedReactionTag2);
            z = true;
        }
        if (z) {
            TLRPC.TL_messages_updateSavedReactionTag tL_messages_updateSavedReactionTag = new TLRPC.TL_messages_updateSavedReactionTag();
            tL_messages_updateSavedReactionTag.reaction = visibleReaction.toTLReaction();
            if (!TextUtils.isEmpty(str)) {
                tL_messages_updateSavedReactionTag.flags |= 1;
                tL_messages_updateSavedReactionTag.title = str;
            }
            getConnectionsManager().sendRequest(tL_messages_updateSavedReactionTag, null);
            Collections.sort(tL_messages_savedReactionsTags.tags, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    return this.f$0.lambda$renameSavedReactionTag$444((TLRPC.TL_savedReactionTag) obj, (TLRPC.TL_savedReactionTag) obj2);
                }
            });
            long jCalcHash = 0;
            for (int i2 = 0; i2 < tL_messages_savedReactionsTags.tags.size(); i2++) {
                TLRPC.TL_savedReactionTag tL_savedReactionTag3 = tL_messages_savedReactionsTags.tags.get(i2);
                if (tL_savedReactionTag3.count > 0) {
                    TLRPC.Reaction reaction = tL_savedReactionTag3.reaction;
                    if (reaction instanceof TLRPC.TL_reactionEmoji) {
                        String strSubstring = Utilities.MD5(((TLRPC.TL_reactionEmoji) reaction).emoticon).substring(0, 16);
                        jCalcHash = MediaDataController.calcHash(jCalcHash, MessagesController$$ExternalSyntheticBackport9.m(strSubstring, 0, strSubstring.length(), 16));
                    } else if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                        jCalcHash = MediaDataController.calcHash(jCalcHash, ((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
                    }
                    if ((tL_savedReactionTag3.flags & 1) != 0 && (str2 = tL_savedReactionTag3.title) != null) {
                        String strSubstring2 = Utilities.MD5(str2).substring(0, 16);
                        jCalcHash = MediaDataController.calcHash(jCalcHash, MessagesController$$ExternalSyntheticBackport11.m(strSubstring2, 0, strSubstring2.length(), 16));
                    }
                    jCalcHash = MediaDataController.calcHash(jCalcHash, tL_savedReactionTag3.count);
                }
            }
            tL_messages_savedReactionsTags.hash = jCalcHash;
            saveSavedReactionsTags(0L, tL_messages_savedReactionsTags);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.savedReactionTagsUpdate, 0L);
        }
    }

    public int lambda$renameSavedReactionTag$444(TLRPC.TL_savedReactionTag tL_savedReactionTag, TLRPC.TL_savedReactionTag tL_savedReactionTag2) {
        int i = tL_savedReactionTag.count;
        int i2 = tL_savedReactionTag2.count;
        return i == i2 ? Long.compare(getTagLongId(tL_savedReactionTag2.reaction) ^ Long.MIN_VALUE, getTagLongId(tL_savedReactionTag.reaction) ^ Long.MIN_VALUE) : i2 - i;
    }

    private long getTagLongId(TLRPC.Reaction reaction) {
        if (reaction == null) {
            return 0L;
        }
        long j = reaction.tag_long_id;
        if (j != 0) {
            return j;
        }
        if (reaction instanceof TLRPC.TL_reactionEmoji) {
            String strSubstring = Utilities.MD5(((TLRPC.TL_reactionEmoji) reaction).emoticon).substring(0, 16);
            long jM = MessagesController$$ExternalSyntheticBackport8.m(strSubstring, 0, strSubstring.length(), 16);
            reaction.tag_long_id = jM;
            return jM;
        }
        if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji)) {
            return 0L;
        }
        long j2 = ((TLRPC.TL_reactionCustomEmoji) reaction).document_id;
        reaction.tag_long_id = j2;
        return j2;
    }

    public TLRPC.TL_messages_savedReactionsTags getSavedReactionTags(long j) {
        return getSavedReactionTags(j, false);
    }

    public TLRPC.TL_messages_savedReactionsTags getSavedReactionTags(final long j, boolean z) {
        HashSet<Long> hashSet = this.loadingReactionTags;
        if (hashSet != null && hashSet.contains(Long.valueOf(j)) && !z) {
            LongSparseArray longSparseArray = this.reactionTags;
            if (longSparseArray == null) {
                return null;
            }
            return (TLRPC.TL_messages_savedReactionsTags) longSparseArray.get(j);
        }
        if (this.loadingReactionTags == null) {
            this.loadingReactionTags = new HashSet<>();
        }
        this.loadingReactionTags.add(Long.valueOf(j));
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$getSavedReactionTags$448(j);
            }
        });
        return null;
    }

    public void lambda$getSavedReactionTags$448(final long r8) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$getSavedReactionTags$448(long):void");
    }

    public void lambda$getSavedReactionTags$447(final TLRPC.messages_SavedReactionTags messages_savedreactiontags, final long j) {
        if (this.reactionTags == null) {
            this.reactionTags = new LongSparseArray();
        }
        boolean z = messages_savedreactiontags instanceof TLRPC.TL_messages_savedReactionsTags;
        if (z) {
            this.reactionTags.put(j, (TLRPC.TL_messages_savedReactionsTags) messages_savedreactiontags);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.savedReactionTagsUpdate, Long.valueOf(j));
        }
        final TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags = new TLRPC.TL_messages_getSavedReactionTags();
        if (z) {
            tL_messages_getSavedReactionTags.hash = messages_savedreactiontags.hash;
        }
        if (j != 0) {
            tL_messages_getSavedReactionTags.flags = 1 | tL_messages_getSavedReactionTags.flags;
            tL_messages_getSavedReactionTags.peer = getInputPeer(j);
        }
        getConnectionsManager().sendRequest(tL_messages_getSavedReactionTags, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$getSavedReactionTags$446(j, messages_savedreactiontags, tL_messages_getSavedReactionTags, tLObject, tL_error);
            }
        });
    }

    public void lambda$getSavedReactionTags$446(final long j, final TLRPC.messages_SavedReactionTags messages_savedreactiontags, final TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$getSavedReactionTags$445(tLObject, j, messages_savedreactiontags, tL_messages_getSavedReactionTags);
            }
        });
    }

    public void lambda$getSavedReactionTags$445(TLObject tLObject, long j, TLRPC.messages_SavedReactionTags messages_savedreactiontags, TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags) {
        if (tLObject instanceof TLRPC.TL_messages_savedReactionsTags) {
            TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags = (TLRPC.TL_messages_savedReactionsTags) tLObject;
            this.reactionTags.put(j, tL_messages_savedReactionsTags);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.savedReactionTagsUpdate, Long.valueOf(j));
            saveSavedReactionsTags(j, tL_messages_savedReactionsTags);
            return;
        }
        if ((tLObject instanceof TLRPC.TL_messages_savedReactionsTagsNotModified) && messages_savedreactiontags == null && tL_messages_getSavedReactionTags.hash == 0) {
            TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags2 = new TLRPC.TL_messages_savedReactionsTags();
            this.reactionTags.put(j, tL_messages_savedReactionsTags2);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.savedReactionTagsUpdate, Long.valueOf(j));
            saveSavedReactionsTags(j, tL_messages_savedReactionsTags2);
        }
    }

    private void saveSavedReactionsTags(final long j, final TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$saveSavedReactionsTags$449(j, tL_messages_savedReactionsTags);
            }
        });
    }

    public void lambda$saveSavedReactionsTags$449(long j, TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags) {
        SQLiteDatabase database = getMessagesStorage().getDatabase();
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast = null;
        try {
            try {
                database.executeFast("DELETE FROM saved_reaction_tags WHERE topic_id = " + j).stepThis().dispose();
                sQLitePreparedStatementExecuteFast = database.executeFast("REPLACE INTO saved_reaction_tags VALUES(?, ?)");
                sQLitePreparedStatementExecuteFast.requery();
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_messages_savedReactionsTags.getObjectSize());
                tL_messages_savedReactionsTags.serializeToStream(nativeByteBuffer);
                sQLitePreparedStatementExecuteFast.bindLong(1, j);
                sQLitePreparedStatementExecuteFast.bindByteBuffer(2, nativeByteBuffer);
                sQLitePreparedStatementExecuteFast.step();
            } catch (Exception e) {
                FileLog.e(e);
                if (sQLitePreparedStatementExecuteFast == null) {
                    return;
                }
            }
            sQLitePreparedStatementExecuteFast.dispose();
        } catch (Throwable th) {
            if (sQLitePreparedStatementExecuteFast != null) {
                sQLitePreparedStatementExecuteFast.dispose();
            }
            throw th;
        }
    }

    public void checkPeerColors(boolean z) {
        PeerColors peerColors;
        if (getUserConfig().getCurrentUser() == null) {
            return;
        }
        if (!this.loadingPeerColors && ((peerColors = this.peerColors) == null || peerColors.needUpdate() || z)) {
            this.loadingPeerColors = true;
            TLRPC.TL_help_getPeerColors tL_help_getPeerColors = new TLRPC.TL_help_getPeerColors();
            PeerColors peerColors2 = this.peerColors;
            tL_help_getPeerColors.hash = peerColors2 != null ? peerColors2.hash : 0;
            if (peerColors2 != null && peerColors2.needUpdate()) {
                tL_help_getPeerColors.hash = 0;
            }
            getConnectionsManager().sendRequest(tL_help_getPeerColors, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$checkPeerColors$451(tLObject, tL_error);
                }
            });
        }
        if (this.loadingProfilePeerColors) {
            return;
        }
        PeerColors peerColors3 = this.profilePeerColors;
        if (peerColors3 == null || peerColors3.needUpdate() || z) {
            this.loadingProfilePeerColors = true;
            TLRPC.TL_help_getPeerProfileColors tL_help_getPeerProfileColors = new TLRPC.TL_help_getPeerProfileColors();
            PeerColors peerColors4 = this.profilePeerColors;
            tL_help_getPeerProfileColors.hash = peerColors4 != null ? peerColors4.hash : 0;
            if (peerColors4 != null && peerColors4.needUpdate()) {
                tL_help_getPeerProfileColors.hash = 0;
            }
            getConnectionsManager().sendRequest(tL_help_getPeerProfileColors, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$checkPeerColors$453(tLObject, tL_error);
                }
            });
        }
    }

    public void lambda$checkPeerColors$451(final TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_help_peerColors) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$checkPeerColors$450(tLObject);
                }
            });
        }
    }

    public void lambda$checkPeerColors$450(TLObject tLObject) {
        this.loadingPeerColors = false;
        this.peerColors = PeerColors.fromTL(0, (TLRPC.TL_help_peerColors) tLObject);
        this.mainPreferences.edit().putString("peerColors", this.peerColors.toString()).apply();
    }

    public void lambda$checkPeerColors$453(final TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_help_peerColors) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$checkPeerColors$452(tLObject);
                }
            });
        }
    }

    public void lambda$checkPeerColors$452(TLObject tLObject) {
        this.loadingProfilePeerColors = false;
        this.profilePeerColors = PeerColors.fromTL(1, (TLRPC.TL_help_peerColors) tLObject);
        this.mainPreferences.edit().putString("profilePeerColors", this.profilePeerColors.toString()).apply();
    }

    public void setSavedViewAs(boolean z) {
        if (this.savedViewAsChats != z) {
            SharedPreferences.Editor editorEdit = this.mainPreferences.edit();
            this.savedViewAsChats = z;
            editorEdit.putBoolean("savedViewAsChats", z).apply();
        }
    }

    public void setFolderTags(boolean z) {
        SharedPreferences.Editor editorEdit = this.mainPreferences.edit();
        this.folderTags = z;
        editorEdit.putBoolean("folderTags", z).apply();
    }

    public boolean isStoryQualityFullOnAccount() {
        return getUserConfig().isPremium() && this.storyQualityFull;
    }

    public static boolean isStoryQualityFull() {
        return getInstance(UserConfig.selectedAccount).isStoryQualityFullOnAccount();
    }

    public TL_account.RequirementToContact isUserContactBlocked(long j) {
        return isUserContactBlocked(j, false);
    }

    public TL_account.RequirementToContact isUserContactBlocked(long j, boolean z) {
        if (!getUserConfig().isPremium() && getUserConfig().getClientUserId() != j) {
            TL_account.RequirementToContact requirementToContact = (TL_account.RequirementToContact) this.cachedIsUserContactBlocked.get(j);
            if (requirementToContact != null) {
                return requirementToContact;
            }
            TLRPC.User user = getUser(Long.valueOf(j));
            if (user != null && !user.contact_require_premium && user.send_paid_messages_stars == 0) {
                return null;
            }
            TLRPC.UserFull userFull = getUserFull(j);
            if (userFull != null) {
                return UserObject.getRequirementToContact(userFull);
            }
            if (getInputUser(j) == null || z) {
                return null;
            }
            this.loadingIsUserContactBlocked.add(Long.valueOf(j));
            AndroidUtilities.cancelRunOnUIThread(this.requestIsUserContactBlockedRunnable);
            AndroidUtilities.runOnUIThread(this.requestIsUserContactBlockedRunnable, 60L);
        }
        return null;
    }

    public void invalidateUserPremiumBlocked(long j, int i) {
        if (this.loadingFullUsers.contains(Long.valueOf(j))) {
            return;
        }
        int iIndexOfKey = this.loadedFullUsers.indexOfKey(j);
        if (iIndexOfKey >= 0) {
            this.loadedFullUsers.removeAt(iIndexOfKey);
        }
        loadFullUser(getUser(Long.valueOf(j)), i, true);
    }

    public void requestIsUserContactBlocked() {
        if (this.loadingIsUserContactBlocked.isEmpty()) {
            return;
        }
        TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
        final ArrayList arrayList = new ArrayList();
        Iterator<Long> it = this.loadingIsUserContactBlocked.iterator();
        while (it.hasNext()) {
            Long next = it.next();
            TLRPC.InputUser inputUser = getInputUser(next.longValue());
            if (inputUser != null) {
                getrequirementstocontact.id.add(inputUser);
                arrayList.add(next);
            }
        }
        this.loadingIsUserContactBlocked.clear();
        if (getrequirementstocontact.id.isEmpty()) {
            return;
        }
        getConnectionsManager().sendRequest(getrequirementstocontact, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$requestIsUserContactBlocked$455(arrayList, tLObject, tL_error);
            }
        });
    }

    public void lambda$requestIsUserContactBlocked$455(final ArrayList arrayList, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$requestIsUserContactBlocked$454(tLObject, arrayList);
            }
        });
    }

    public void lambda$requestIsUserContactBlocked$454(TLObject tLObject, ArrayList arrayList) {
        boolean z;
        if (tLObject instanceof Vector) {
            ArrayList<T> arrayList2 = ((Vector) tLObject).objects;
            z = false;
            for (int i = 0; i < Math.min(arrayList.size(), arrayList2.size()); i++) {
                long jLongValue = ((Long) arrayList.get(i)).longValue();
                if (arrayList2.get(i) instanceof TL_account.RequirementToContact) {
                    TL_account.RequirementToContact requirementToContact = (TL_account.RequirementToContact) arrayList2.get(i);
                    if (!UserObject.eq((TL_account.RequirementToContact) this.cachedIsUserContactBlocked.get(jLongValue), requirementToContact)) {
                        if (requirementToContact == null || (requirementToContact instanceof TL_account.requirementToContactEmpty)) {
                            this.cachedIsUserContactBlocked.remove(jLongValue);
                        } else {
                            this.cachedIsUserContactBlocked.put(jLongValue, requirementToContact);
                        }
                        z = true;
                    }
                    TLRPC.UserFull userFull = getUserFull(jLongValue);
                    if (userFull != null && UserObject.applyRequirementToContact(userFull, requirementToContact)) {
                        getMessagesStorage().updateUserInfo(userFull, true);
                    } else if (userFull == null) {
                        getMessagesStorage().updateUserInfoContactBlocked(jLongValue, requirementToContact);
                    }
                    z = true;
                }
            }
        } else {
            z = false;
        }
        if (z) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.userIsPremiumBlockedUpadted, new Object[0]);
        }
    }

    public void disableAds(boolean z) {
        TLRPC.UserFull userFull = getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            return;
        }
        userFull.sponsored_enabled = false;
        getMessagesStorage().updateUserInfo(userFull, false);
        if (z) {
            TL_account.toggleSponsoredMessages togglesponsoredmessages = new TL_account.toggleSponsoredMessages();
            togglesponsoredmessages.enabled = false;
            getConnectionsManager().sendRequest(togglesponsoredmessages, null);
        }
    }

    public boolean isSponsoredDisabled() {
        if (getUserFull(getUserConfig().getClientUserId()) == null) {
            return false;
        }
        return !r0.sponsored_enabled;
    }

    public TLRPC.messages_AvailableEffects getAvailableEffects() {
        if (!this.loadingAvailableEffects) {
            this.loadingAvailableEffects = true;
            this.effectsFetcher.fetch(this.currentAccount, 0, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.lambda$getAvailableEffects$456((TLRPC.messages_AvailableEffects) obj);
                }
            });
        }
        return this.availableEffects;
    }

    public void lambda$getAvailableEffects$456(TLRPC.messages_AvailableEffects messages_availableeffects) {
        if (this.availableEffects != messages_availableeffects) {
            this.availableEffects = messages_availableeffects;
            if (messages_availableeffects != null) {
                AnimatedEmojiDrawable.getDocumentFetcher(this.currentAccount).putDocuments(this.availableEffects.documents);
            }
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.availableEffectsUpdate, new Object[0]);
        }
        this.loadingAvailableEffects = false;
    }

    public boolean hasAvailableEffects() {
        TLRPC.messages_AvailableEffects messages_availableeffects = this.availableEffects;
        return (messages_availableeffects == null || messages_availableeffects.effects.isEmpty()) ? false : true;
    }

    public TLRPC.TL_availableEffect getEffect(long j) {
        getAvailableEffects();
        if (this.availableEffects == null) {
            return null;
        }
        for (int i = 0; i < this.availableEffects.effects.size(); i++) {
            if (this.availableEffects.effects.get(i).id == j) {
                return this.availableEffects.effects.get(i);
            }
        }
        return null;
    }

    public TLRPC.Document getEffectDocument(long j) {
        if (this.availableEffects == null) {
            return null;
        }
        for (int i = 0; i < this.availableEffects.documents.size(); i++) {
            if (this.availableEffects.documents.get(i).id == j) {
                return this.availableEffects.documents.get(i);
            }
        }
        return null;
    }

    class AnonymousClass4 extends CacheFetcher<Integer, TLRPC.messages_AvailableEffects> {
        @Override
        public boolean emitLocal(Integer num) {
            return true;
        }

        @Override
        protected boolean saveLastTimeRequested() {
            return true;
        }

        AnonymousClass4() {
        }

        @Override
        public void getRemote(int i, Integer num, long j, final Utilities.Callback4<Boolean, TLRPC.messages_AvailableEffects, Long, Boolean> callback4) {
            TLRPC.TL_messages_getAvailableEffects tL_messages_getAvailableEffects = new TLRPC.TL_messages_getAvailableEffects();
            tL_messages_getAvailableEffects.hash = (int) j;
            MessagesController.this.getConnectionsManager().sendRequest(tL_messages_getAvailableEffects, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    MessagesController.AnonymousClass4.lambda$getRemote$0(callback4, tLObject, tL_error);
                }
            });
        }

        public static void lambda$getRemote$0(Utilities.Callback4 callback4, TLObject tLObject, TLRPC.TL_error tL_error) {
            String str;
            int i;
            if (tLObject instanceof TLRPC.TL_messages_availableEffectsNotModified) {
                Boolean bool = Boolean.TRUE;
                callback4.run(bool, null, 0L, bool);
                return;
            }
            if (tLObject instanceof TLRPC.TL_messages_availableEffects) {
                callback4.run(Boolean.FALSE, (TLRPC.TL_messages_availableEffects) tLObject, Long.valueOf(r5.hash), Boolean.TRUE);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("getting available effects error ");
            if (tL_error != null) {
                str = tL_error.code + " " + tL_error.text;
            } else {
                str = "";
            }
            sb.append(str);
            FileLog.e(sb.toString());
            callback4.run(Boolean.FALSE, null, 0L, Boolean.valueOf(tL_error == null || !((i = tL_error.code) == -2000 || i == -2001)));
        }

        @Override
        public void getLocal(final int i, Integer num, final Utilities.Callback2<Long, TLRPC.messages_AvailableEffects> callback2) {
            MessagesController.this.getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() throws Throwable {
                    MessagesController.AnonymousClass4.lambda$getLocal$1(i, callback2);
                }
            });
        }

        public static void lambda$getLocal$1(int r7, org.telegram.messenger.Utilities.Callback2 r8) throws java.lang.Throwable {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.AnonymousClass4.lambda$getLocal$1(int, org.telegram.messenger.Utilities$Callback2):void");
        }

        @Override
        public void setLocal(final int i, Integer num, final TLRPC.messages_AvailableEffects messages_availableeffects, long j) {
            MessagesStorage.getInstance(i).getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.AnonymousClass4.lambda$setLocal$2(i, messages_availableeffects);
                }
            });
        }

        public static void lambda$setLocal$2(int i, TLRPC.messages_AvailableEffects messages_availableeffects) {
            try {
                SQLiteDatabase database = MessagesStorage.getInstance(i).getDatabase();
                if (database != null) {
                    database.executeFast("DELETE FROM effects").stepThis().dispose();
                    if (messages_availableeffects != null) {
                        SQLitePreparedStatement sQLitePreparedStatementExecuteFast = database.executeFast("INSERT INTO effects VALUES(?)");
                        sQLitePreparedStatementExecuteFast.requery();
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(messages_availableeffects.getObjectSize());
                        messages_availableeffects.serializeToStream(nativeByteBuffer);
                        sQLitePreparedStatementExecuteFast.bindByteBuffer(1, nativeByteBuffer);
                        sQLitePreparedStatementExecuteFast.step();
                        nativeByteBuffer.reuse();
                        sQLitePreparedStatementExecuteFast.dispose();
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override
        protected long getSavedLastTimeRequested(int i) {
            return MessagesController.this.mainPreferences.getLong("effects_last_" + i, 0L);
        }

        @Override
        protected void setSavedLastTimeRequested(int i, long j) {
            MessagesController.this.mainPreferences.edit().putLong("effects_last_" + i, j).apply();
        }
    }

    public static boolean equals(TLRPC.MessageMedia messageMedia, TLRPC.MessageMedia messageMedia2) {
        return messageMedia instanceof TLRPC.TL_messageMediaDocument ? (messageMedia2 instanceof TLRPC.TL_messageMediaDocument) && messageMedia.document.id == messageMedia2.document.id : (messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) && (messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) && messageMedia.photo.id == messageMedia2.photo.id;
    }

    public static TLRPC.InputDocument toInputDocument(TLRPC.Document document) {
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_inputDocument.id = document.id;
        tL_inputDocument.access_hash = document.access_hash;
        tL_inputDocument.file_reference = document.file_reference;
        return tL_inputDocument;
    }

    public static TLRPC.InputMedia toInputMedia(TLRPC.MessageMedia messageMedia) {
        if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_inputMediaDocument.id = tL_inputDocument;
            TLRPC.Document document = messageMedia.document;
            tL_inputDocument.id = document.id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            return tL_inputMediaDocument;
        }
        if (!(messageMedia instanceof TLRPC.TL_messageMediaPhoto)) {
            return null;
        }
        TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = new TLRPC.TL_inputMediaPhoto();
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_inputMediaPhoto.id = tL_inputPhoto;
        TLRPC.Photo photo = messageMedia.photo;
        tL_inputPhoto.id = photo.id;
        tL_inputPhoto.access_hash = photo.access_hash;
        tL_inputPhoto.file_reference = photo.file_reference;
        return tL_inputMediaPhoto;
    }

    public void openApp(TLRPC.User user, int i) {
        openApp(null, user, null, i, null);
    }

    public void openApp(BaseFragment baseFragment, TLRPC.User user, String str, int i, Browser.Progress progress) {
        openApp(baseFragment, user, str, i, progress, false, false);
    }

    public void openApp(final BaseFragment baseFragment, final TLRPC.User user, final String str, final int i, final Browser.Progress progress, final boolean z, final boolean z2) {
        if (user == null) {
            return;
        }
        final boolean[] zArr = {false};
        if (progress != null) {
            progress.onCancel(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.lambda$openApp$457(zArr);
                }
            });
            progress.init();
        }
        final TL_bots.BotInfo[] botInfoArr = {botInfoCached};
        final Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$openApp$458(baseFragment, progress, zArr, user, str, z, z2, botInfoArr);
            }
        };
        MediaDataController mediaDataController = getMediaDataController();
        long j = user.id;
        TL_bots.BotInfo botInfoCached = mediaDataController.getBotInfoCached(j, j);
        if (user.bot_has_main_app) {
            runnable.run();
        } else {
            if (botInfoCached == null) {
                MediaDataController mediaDataController2 = getMediaDataController();
                long j2 = user.id;
                mediaDataController2.loadBotInfo(j2, j2, false, i, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        this.f$0.lambda$openApp$460(zArr, botInfoArr, user, i, runnable, (TL_bots.BotInfo) obj);
                    }
                });
                return;
            }
            runnable.run();
        }
    }

    public static void lambda$openApp$457(boolean[] zArr) {
        zArr[0] = true;
    }

    public void lambda$openApp$458(BaseFragment baseFragment, Browser.Progress progress, boolean[] zArr, TLRPC.User user, String str, boolean z, boolean z2, TL_bots.BotInfo[] botInfoArr) {
        BaseFragment safeLastFragment = baseFragment != null ? baseFragment : LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        if (progress != null) {
            progress.end();
        }
        if (zArr[0]) {
            return;
        }
        String restrictionReason = getRestrictionReason(user.restriction_reason);
        if (!TextUtils.isEmpty(restrictionReason)) {
            showCantOpenAlert(safeLastFragment, restrictionReason);
            return;
        }
        if (user.bot_has_main_app) {
            if (safeLastFragment.getParentLayout() instanceof ActionBarLayout) {
                safeLastFragment = ((ActionBarLayout) safeLastFragment.getParentLayout()).getSheetFragment();
            }
            BaseFragment baseFragment2 = safeLastFragment;
            AndroidUtilities.hideKeyboard(baseFragment2.getFragmentView());
            int i = this.currentAccount;
            long j = user.id;
            WebViewRequestProps webViewRequestPropsOf = WebViewRequestProps.of(i, j, j, null, null, 4, 0, 0L, false, null, false, str, user, 0, z, z2);
            LaunchActivity launchActivity = LaunchActivity.instance;
            if (launchActivity == null || launchActivity.getBottomSheetTabs() == null || LaunchActivity.instance.getBottomSheetTabs().tryReopenTab(webViewRequestPropsOf) == null) {
                BotWebViewSheet botWebViewSheet = new BotWebViewSheet(baseFragment2.getContext(), baseFragment2.getResourceProvider());
                botWebViewSheet.setDefaultFullsize(true);
                botWebViewSheet.setNeedsContext(false);
                botWebViewSheet.setParentActivity(baseFragment2.getParentActivity());
                botWebViewSheet.requestWebView(baseFragment2, webViewRequestPropsOf);
                botWebViewSheet.show();
                return;
            }
            return;
        }
        TL_bots.BotInfo botInfo = botInfoArr[0];
        if (botInfo != null && (botInfo.menu_button instanceof TL_bots.TL_botMenuButton)) {
            if (safeLastFragment.getParentLayout() instanceof ActionBarLayout) {
                safeLastFragment = ((ActionBarLayout) safeLastFragment.getParentLayout()).getSheetFragment();
            }
            BaseFragment baseFragment3 = safeLastFragment;
            TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botInfoArr[0].menu_button;
            AndroidUtilities.hideKeyboard(baseFragment3.getFragmentView());
            int i2 = this.currentAccount;
            long j2 = user.id;
            WebViewRequestProps webViewRequestPropsOf2 = WebViewRequestProps.of(i2, j2, j2, tL_botMenuButton.text, tL_botMenuButton.url, 2, 0, 0L, false, null, false, str, user, 0, z, z2);
            LaunchActivity launchActivity2 = LaunchActivity.instance;
            if (launchActivity2 == null || launchActivity2.getBottomSheetTabs() == null || LaunchActivity.instance.getBottomSheetTabs().tryReopenTab(webViewRequestPropsOf2) == null) {
                BotWebViewSheet botWebViewSheet2 = new BotWebViewSheet(baseFragment3.getContext(), baseFragment3.getResourceProvider());
                botWebViewSheet2.setDefaultFullsize(false);
                botWebViewSheet2.setNeedsContext(true);
                botWebViewSheet2.setParentActivity(baseFragment3.getParentActivity());
                botWebViewSheet2.requestWebView(baseFragment3, webViewRequestPropsOf2);
                botWebViewSheet2.show();
                return;
            }
            return;
        }
        safeLastFragment.presentFragment(ChatActivity.of(user.id));
    }

    public void lambda$openApp$460(final boolean[] zArr, final TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i, final Runnable runnable, TL_bots.BotInfo botInfo) {
        if (zArr[0]) {
            return;
        }
        botInfoArr[0] = botInfo;
        if (botInfo == null) {
            TLRPC.UserFull userFull = getUserFull(user.id);
            if (userFull == null) {
                if (zArr[0]) {
                    return;
                }
                loadFullUser(user, i, true, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        MessagesController.lambda$openApp$459(zArr, botInfoArr, runnable, (TLRPC.UserFull) obj);
                    }
                });
                return;
            } else {
                botInfoArr[0] = userFull.bot_info;
                runnable.run();
                return;
            }
        }
        runnable.run();
    }

    public static void lambda$openApp$459(boolean[] zArr, TL_bots.BotInfo[] botInfoArr, Runnable runnable, TLRPC.UserFull userFull) {
        if (zArr[0]) {
            return;
        }
        if (userFull != null) {
            botInfoArr[0] = userFull.bot_info;
        }
        AndroidUtilities.runOnUIThread(runnable);
    }

    public TL_account.contentSettings getContentSettings() {
        return this.contentSettings;
    }

    public void getContentSettings(Utilities.Callback<TL_account.contentSettings> callback) {
        if (this.contentSettings != null && System.currentTimeMillis() - this.contentSettingsLoadedTime < 3600000) {
            if (callback != null) {
                callback.run(this.contentSettings);
                return;
            }
            return;
        }
        if (this.contentSettingsCallbacks == null) {
            this.contentSettingsCallbacks = new ArrayList<>();
        }
        if (callback != null) {
            this.contentSettingsCallbacks.add(callback);
        }
        if (this.contentSettingsLoading) {
            return;
        }
        this.contentSettingsLoading = true;
        getConnectionsManager().sendRequest(new TL_account.getContentSettings(), new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$getContentSettings$462(tLObject, tL_error);
            }
        });
    }

    public void lambda$getContentSettings$462(final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$getContentSettings$461(tLObject);
            }
        });
    }

    public void lambda$getContentSettings$461(TLObject tLObject) {
        Set<String> set;
        if (tLObject instanceof TL_account.contentSettings) {
            this.contentSettings = (TL_account.contentSettings) tLObject;
            this.contentSettingsLoadedTime = System.currentTimeMillis();
        }
        this.contentSettingsLoading = false;
        TL_account.contentSettings contentsettings = this.contentSettings;
        if (contentsettings != null && (set = this.ignoreRestrictionReasons) != null) {
            if (contentsettings.sensitive_enabled) {
                set.add("sensitive");
            } else {
                set.remove("sensitive");
            }
            SharedPreferences sharedPreferences = this.mainPreferences;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", this.ignoreRestrictionReasons).apply();
            }
        }
        ArrayList<Utilities.Callback<TL_account.contentSettings>> arrayList = this.contentSettingsCallbacks;
        if (arrayList != null) {
            Iterator<Utilities.Callback<TL_account.contentSettings>> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().run(this.contentSettings);
            }
            this.contentSettingsCallbacks.clear();
            this.contentSettingsCallbacks = null;
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contentSettingsLoaded, new Object[0]);
    }

    public void invalidateContentSettings() {
        this.contentSettings = null;
        this.contentSettingsLoadedTime = 0L;
    }

    public void setContentSettings(boolean z) {
        TL_account.contentSettings contentsettings = this.contentSettings;
        if (contentsettings != null) {
            if (!contentsettings.sensitive_can_change) {
                return;
            } else {
                contentsettings.sensitive_enabled = z;
            }
        }
        if (this.ignoreRestrictionReasons == null) {
            this.ignoreRestrictionReasons = new HashSet();
        }
        if (z) {
            this.ignoreRestrictionReasons.add("sensitive");
        } else {
            this.ignoreRestrictionReasons.remove("sensitive");
        }
        SharedPreferences sharedPreferences = this.mainPreferences;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putStringSet("ignoreRestrictionReasons", this.ignoreRestrictionReasons).apply();
        }
        TL_account.setContentSettings setcontentsettings = new TL_account.setContentSettings();
        setcontentsettings.sensitive_enabled = z;
        getConnectionsManager().sendRequest(setcontentsettings, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                MessagesController.lambda$setContentSettings$464(tLObject, tL_error);
            }
        });
    }

    public static void lambda$setContentSettings$464(TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.lambda$setContentSettings$463(tL_error);
            }
        });
    }

    public static void lambda$setContentSettings$463(TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            BulletinFactory.showError(tL_error);
        }
    }

    public boolean showSensitiveContent() {
        if (this.contentSettings != null && System.currentTimeMillis() - this.contentSettingsLoadedTime < 3600000) {
            return this.contentSettings.sensitive_enabled;
        }
        Set<String> set = this.ignoreRestrictionReasons;
        return set == null || set.contains("sensitive");
    }

    public Long getPaidReactionsDialogId() {
        if (this.paidReactionsPrivacy == null && !this.loadingArePaidReactionsAnonymous) {
            this.loadingArePaidReactionsAnonymous = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_messages_getPaidReactionPrivacy(), null);
        }
        return this.paidReactionsPrivacy;
    }

    public boolean shouldShowMoveCaptionHint() {
        return getMainSettings().getInt("movecaptionhint", 0) < 24 || BuildVars.DEBUG_PRIVATE_VERSION;
    }

    public void incrementMoveCaptionHint() {
        getMainSettings().edit().putInt("movecaptionhint", getMainSettings().getInt("movecaptionhint", 0) + 1).apply();
    }

    public void lambda$new$465() {
        int i;
        LongSparseArray longSparseArray = new LongSparseArray();
        Iterator<Pair<StarsController.MessageId, AtomicBoolean>> it = this.pendingReportMessageDelivery.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Pair<StarsController.MessageId, AtomicBoolean> next = it.next();
            Pair pair = (Pair) longSparseArray.get(((StarsController.MessageId) next.first).did);
            if (pair == null) {
                long j = ((StarsController.MessageId) next.first).did;
                Pair pair2 = new Pair(new HashSet(), (AtomicBoolean) next.second);
                longSparseArray.put(j, pair2);
                pair = pair2;
            }
            if (!((AtomicBoolean) next.second).get()) {
                ((AtomicBoolean) pair.second).set(false);
            }
            ((HashSet) pair.first).add(Integer.valueOf(((StarsController.MessageId) next.first).mid));
        }
        this.pendingReportMessageDelivery.clear();
        for (i = 0; i < longSparseArray.size(); i++) {
            Pair pair3 = (Pair) longSparseArray.valueAt(i);
            long jKeyAt = longSparseArray.keyAt(i);
            HashSet hashSet = (HashSet) pair3.first;
            boolean z = ((AtomicBoolean) pair3.second).get();
            TLRPC.TL_reportMessagesDelivery tL_reportMessagesDelivery = new TLRPC.TL_reportMessagesDelivery();
            tL_reportMessagesDelivery.peer = getInputPeer(jKeyAt);
            tL_reportMessagesDelivery.id.addAll(hashSet);
            tL_reportMessagesDelivery.push = z;
            getConnectionsManager().sendRequest(tL_reportMessagesDelivery, null);
        }
    }

    public void reportMessageDelivery(long j, int i, boolean z) {
        StarsController.MessageId messageIdFrom = StarsController.MessageId.from(j, i);
        if (this.reportedMessageDelivery.contains(messageIdFrom)) {
            return;
        }
        this.reportedMessageDelivery.add(messageIdFrom);
        this.pendingReportMessageDelivery.add(new Pair<>(messageIdFrom, new AtomicBoolean(z)));
        AndroidUtilities.cancelRunOnUIThread(this.sendReportMessageDeliver);
        AndroidUtilities.runOnUIThread(this.sendReportMessageDeliver);
    }

    public CommonChatsList getCommonChats(long j) {
        return getCommonChats(j, true);
    }

    public CommonChatsList getCommonChats(long j, boolean z) {
        CommonChatsList commonChatsList = this.commonChats.get(j);
        if (commonChatsList != null || !z) {
            return commonChatsList;
        }
        android.util.LongSparseArray<CommonChatsList> longSparseArray = this.commonChats;
        CommonChatsList commonChatsList2 = new CommonChatsList(this.currentAccount, j);
        longSparseArray.put(j, commonChatsList2);
        return commonChatsList2;
    }

    public static class CommonChatsList {
        public ArrayList<TLRPC.Chat> chats;
        public final int currentAccount;
        public int currentRequestId;
        public final long dialogId;
        public boolean endReached;
        public boolean loading;
        public boolean shown;
        public int totalCount;

        public CommonChatsList(int i, long j) {
            this(i, j, true);
        }

        public CommonChatsList(int i, long j, boolean z) {
            this.chats = new ArrayList<>();
            this.currentRequestId = -1;
            this.currentAccount = i;
            this.dialogId = j;
            if (z) {
                load();
            }
        }

        public void invalidate(boolean z) {
            if (this.currentRequestId != -1) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.currentRequestId, true);
                this.currentRequestId = -1;
            }
            this.loading = false;
            this.chats.clear();
            this.endReached = false;
            if (z || this.shown) {
                load();
            }
        }

        public void load() {
            long j;
            if (this.loading || this.endReached) {
                return;
            }
            final boolean zIsEmpty = this.chats.isEmpty();
            this.loading = true;
            TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
            tL_messages_getCommonChats.user_id = MessagesController.getInstance(this.currentAccount).getInputUser(this.dialogId);
            if (this.chats.isEmpty()) {
                j = 0;
            } else {
                ArrayList<TLRPC.Chat> arrayList = this.chats;
                j = arrayList.get(arrayList.size() - 1).id;
            }
            tL_messages_getCommonChats.max_id = j;
            tL_messages_getCommonChats.limit = zIsEmpty ? 15 : 30;
            int iSendRequest = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getCommonChats, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$load$1(iArr, zIsEmpty, tLObject, tL_error);
                }
            });
            this.currentRequestId = iSendRequest;
            final int[] iArr = {iSendRequest};
        }

        public void lambda$load$1(final int[] iArr, final boolean z, final TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$load$0(iArr, tLObject, z);
                }
            });
        }

        public void lambda$load$0(int[] iArr, TLObject tLObject, boolean z) {
            if (iArr[0] != this.currentRequestId) {
                return;
            }
            this.loading = false;
            this.currentRequestId = -1;
            if (tLObject instanceof TLRPC.messages_Chats) {
                TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                MessagesController.getInstance(this.currentAccount).putChats(messages_chats.chats, false);
                if (z) {
                    this.chats.clear();
                }
                this.chats.addAll(messages_chats.chats);
                this.totalCount = messages_chats instanceof TLRPC.TL_messages_chatsSlice ? messages_chats.count : messages_chats.chats.size();
                this.endReached = this.chats.size() >= this.totalCount;
            } else {
                this.endReached = true;
            }
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.commonChatsLoaded, Long.valueOf(this.dialogId), this);
        }

        public void cancel() {
            if (this.currentRequestId != -1) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.currentRequestId, true);
                this.currentRequestId = -1;
            }
            this.loading = false;
        }

        public int getCount() {
            return this.totalCount;
        }
    }

    public boolean isFrozen() {
        return (this.freezeSinceDate == 0 || this.freezeUntilDate == 0) ? false : true;
    }

    public static <T extends TLRPC.Update> T findUpdateFirst(TLRPC.Updates updates, Class<T> cls) {
        new ArrayList();
        if (updates == null) {
            return null;
        }
        if (cls.isInstance(updates.update)) {
            return cls.cast(updates.update);
        }
        if (updates.updates != null) {
            for (int i = 0; i < updates.updates.size(); i++) {
                TLRPC.Update update = updates.updates.get(i);
                if (cls.isInstance(update)) {
                    return cls.cast(update);
                }
            }
        }
        return null;
    }

    public static <T extends TLRPC.Update> ArrayList<T> findUpdates(TLRPC.Updates updates, Class<T> cls) {
        ArrayList<T> arrayList = new ArrayList<>();
        if (updates == null) {
            return arrayList;
        }
        if (cls.isInstance(updates.update)) {
            arrayList.add(cls.cast(updates.update));
        }
        if (updates.updates != null) {
            for (int i = 0; i < updates.updates.size(); i++) {
                TLRPC.Update update = updates.updates.get(i);
                if (cls.isInstance(update)) {
                    arrayList.add(cls.cast(update));
                }
            }
        }
        return arrayList;
    }

    public static <T extends TLRPC.Update> ArrayList<T> findUpdatesAndRemove(TLRPC.Updates updates, Class<T> cls) {
        ArrayList<T> arrayList = new ArrayList<>();
        if (updates == null) {
            return arrayList;
        }
        if (cls.isInstance(updates.update)) {
            TLRPC.Update update = updates.update;
            updates.update = null;
            arrayList.add(cls.cast(update));
        }
        if (updates.updates != null) {
            int i = 0;
            while (i < updates.updates.size()) {
                if (cls.isInstance(updates.updates.get(i))) {
                    arrayList.add(cls.cast(updates.updates.remove(i)));
                    i--;
                }
                i++;
            }
        }
        return arrayList;
    }

    public void setForumLastTopicId(long j, long j2) {
        this.mainPreferences.edit().putLong("forumlasttopic" + j, j2).apply();
    }

    public long getForumLastTopicId(long j) {
        return this.mainPreferences.getLong("forumlasttopic" + j, 1L);
    }

    public void addOfferToSuggestedMessage(MessageObject messageObject, TLRPC.SuggestedPost suggestedPost) {
        MessageObject messageObject2 = messageObject;
        if (messageObject2 == null || messageObject2.messageOwner == null) {
            return;
        }
        ArrayList<MessageObject> arrayList = new ArrayList<>(1);
        arrayList.add(messageObject2);
        SendMessagesHelper sendMessagesHelper = getSendMessagesHelper();
        long dialogId = messageObject.getDialogId();
        boolean z = !messageObject.isForwarded();
        TLRPC.Message message = messageObject2.messageOwner;
        if (message.suggested_post == null) {
            messageObject2 = null;
        }
        sendMessagesHelper.sendMessage(arrayList, dialogId, z, false, true, 0, 0, messageObject2, -1, 0L, DialogObject.getPeerDialogId(message.saved_peer_id), MessageSuggestionParams.of(suggestedPost));
    }

    public void approveSuggestedMessage(long j, int i, int i2) {
        approveOrRejectSuggestedMessageImpl(j, i, i2, false, null);
    }

    public void rejectSuggestedMessage(long j, int i, String str) {
        approveOrRejectSuggestedMessageImpl(j, i, -1, true, str);
    }

    public boolean isSendingSuggestedMessageApproval(long j, int i, boolean z) {
        Boolean bool = this.sendingSuggestedMessageApprovalMap.get(j + "_" + i);
        return bool != null && bool.booleanValue() == z;
    }

    private void approveOrRejectSuggestedMessageImpl(final long j, final int i, int i2, boolean z, String str) {
        if (this.sendingSuggestedMessageApprovalMap.containsKey(j + "_" + i)) {
            return;
        }
        TLRPC.TL_messages_toggleSuggestedPostApproval tL_messages_toggleSuggestedPostApproval = new TLRPC.TL_messages_toggleSuggestedPostApproval();
        tL_messages_toggleSuggestedPostApproval.reject = z;
        tL_messages_toggleSuggestedPostApproval.peer = getMessagesController().getInputPeer(j);
        tL_messages_toggleSuggestedPostApproval.msg_id = i;
        if (i2 > 0) {
            tL_messages_toggleSuggestedPostApproval.schedule_date = i2;
            tL_messages_toggleSuggestedPostApproval.flags |= 1;
        }
        if (z && !TextUtils.isEmpty(str)) {
            tL_messages_toggleSuggestedPostApproval.reject_comment = str;
        }
        this.sendingSuggestedMessageApprovalMap.put(j + "_" + i, Boolean.valueOf(!z));
        getConnectionsManager().sendRequest(tL_messages_toggleSuggestedPostApproval, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$approveOrRejectSuggestedMessageImpl$466(j, i, tLObject, tL_error);
            }
        });
    }

    public void lambda$approveOrRejectSuggestedMessageImpl$466(long j, int i, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.sendingSuggestedMessageApprovalMap.remove(j + "_" + i);
        if (tL_error == null && tLObject != null) {
            processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public static class SavedMusicList {
        public final int currentAccount;
        public final long dialogId;
        public boolean endReached;
        public final ArrayList<MessageObject> list = new ArrayList<>();
        public boolean loading;
        public int totalCount;

        public SavedMusicList(int i, long j) {
            this.currentAccount = i;
            this.dialogId = j;
        }

        public void setup(TLRPC.Document document) {
            this.list.clear();
            load();
            this.list.add(0, toMessageObject(document));
        }

        public MessageObject toMessageObject(TLRPC.Document document) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.id = SharedConfig.getLastLocalId();
            tL_message.peer_id = MessagesController.getInstance(this.currentAccount).getPeer(this.dialogId);
            tL_message.from_id = MessagesController.getInstance(this.currentAccount).getPeer(this.dialogId);
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.document = document;
            MessageObject messageObject = new MessageObject(this.currentAccount, tL_message, false, false);
            messageObject.checkMediaExistance();
            return messageObject;
        }

        public void load() {
            if (this.loading || this.endReached) {
                return;
            }
            this.loading = true;
            TLRPC.TL_getSavedMusic tL_getSavedMusic = new TLRPC.TL_getSavedMusic();
            tL_getSavedMusic.id = MessagesController.getInstance(this.currentAccount).getInputUser(this.dialogId);
            tL_getSavedMusic.offset = this.list.size();
            tL_getSavedMusic.limit = 30;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_getSavedMusic, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$load$1(tLObject, tL_error);
                }
            });
        }

        public void lambda$load$1(final TLObject tLObject, TLRPC.TL_error tL_error) {
            final ArrayList arrayList = new ArrayList();
            if (tLObject instanceof TLRPC.TL_savedMusic) {
                Iterator<TLRPC.Document> it = ((TLRPC.TL_savedMusic) tLObject).documents.iterator();
                while (it.hasNext()) {
                    arrayList.add(toMessageObject(it.next()));
                }
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$load$0(tLObject, arrayList);
                }
            });
        }

        public void lambda$load$0(TLObject tLObject, ArrayList arrayList) {
            if (tLObject instanceof TLRPC.TL_savedMusic) {
                TLRPC.TL_savedMusic tL_savedMusic = (TLRPC.TL_savedMusic) tLObject;
                if (this.totalCount <= 0 && this.list.size() == 1) {
                    if (this.list.get(0).getDocument() != null && !arrayList.isEmpty() && ((MessageObject) arrayList.get(0)).getDocument() != null && this.list.get(0).getDocument().id == ((MessageObject) arrayList.get(0)).getDocument().id) {
                        arrayList.remove(0);
                    } else {
                        this.list.clear();
                    }
                }
                this.totalCount = tL_savedMusic.count;
                this.list.addAll(arrayList);
                this.endReached = this.list.size() >= this.totalCount;
            }
            this.loading = false;
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.musicListLoaded, this);
        }

        public TLRPC.Document getFirstDocument() {
            MessageObject messageObject;
            if (this.list.isEmpty() || (messageObject = this.list.get(0)) == null) {
                return null;
            }
            return messageObject.getDocument();
        }

        public void remove(MessageObject messageObject) {
            TLRPC.Document firstDocument = getFirstDocument();
            this.list.remove(messageObject);
            if (getFirstDocument() != firstDocument) {
                updateFirstMusic();
            }
        }

        public void move(int i, int i2) {
            TLRPC.Document firstDocument = getFirstDocument();
            MessageObject messageObject = this.list.get(i2);
            MessageObject messageObject2 = this.list.get(i);
            this.list.set(i, messageObject);
            this.list.set(i2, messageObject2);
            if (getFirstDocument() != firstDocument) {
                updateFirstMusic();
            }
            MessageObject messageObject3 = i2 == 0 ? null : this.list.get(i2 - 1);
            TLRPC.Document document = messageObject2.getDocument();
            TLRPC.Document document2 = messageObject3 == null ? null : messageObject3.getDocument();
            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
            if (document == null) {
                return;
            }
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_account_saveMusic.id = tL_inputDocument;
            tL_inputDocument.id = document.id;
            tL_inputDocument.access_hash = document.access_hash;
            byte[] bArr = document.file_reference;
            tL_inputDocument.file_reference = bArr;
            if (bArr == null) {
                tL_inputDocument.file_reference = new byte[0];
            }
            if (document2 != null) {
                tL_account_saveMusic.flags |= 2;
                TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                tL_account_saveMusic.after_id = tL_inputDocument2;
                tL_inputDocument2.id = document2.id;
                tL_inputDocument2.access_hash = document2.access_hash;
                byte[] bArr2 = document2.file_reference;
                tL_inputDocument2.file_reference = bArr2;
                if (bArr2 == null) {
                    tL_inputDocument2.file_reference = new byte[0];
                }
            }
            tL_account_saveMusic.unsave = false;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_account_saveMusic, null);
        }

        public void updateFirstMusic() {
            TLRPC.Document firstDocument = getFirstDocument();
            TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(this.dialogId);
            if (userFull == null) {
                return;
            }
            if (firstDocument == null) {
                userFull.flags2 &= -2097153;
                userFull.saved_music = null;
            } else {
                userFull.flags2 |= 2097152;
                userFull.saved_music = firstDocument;
            }
            MessagesStorage.getInstance(this.currentAccount).updateUserInfo(userFull, false);
            UserConfig.getInstance(this.currentAccount).saveConfig(true);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.profileMusicUpdated, Long.valueOf(this.dialogId));
        }
    }

    public SavedMusicIds getSavedMusicIds() {
        if (this.savedMusicIds == null) {
            this.savedMusicIds = new SavedMusicIds(this.currentAccount);
        }
        return this.savedMusicIds;
    }

    public static class SavedMusicIds {
        public final int currentAccount;
        public final HashSet<Long> ids = new HashSet<>();
        public boolean loaded;
        public boolean loading;

        public SavedMusicIds(int i) {
            this.currentAccount = i;
            load();
        }

        public void load() {
            if (this.loading || this.loaded) {
                return;
            }
            this.loading = true;
            TL_account.getSavedMusicIds getsavedmusicids = new TL_account.getSavedMusicIds();
            getsavedmusicids.hash = 0L;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getsavedmusicids, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$load$1(tLObject, tL_error);
                }
            });
        }

        public void lambda$load$1(final TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$load$0(tLObject);
                }
            });
        }

        public void lambda$load$0(TLObject tLObject) {
            this.loading = false;
            this.loaded = true;
            if (tLObject instanceof TL_account.TL_savedMusicIds) {
                this.ids.addAll(((TL_account.TL_savedMusicIds) tLObject).ids);
            }
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.musicIdsLoaded, new Object[0]);
        }

        public void update(long j, boolean z) {
            if (z) {
                this.ids.add(Long.valueOf(j));
            } else {
                this.ids.remove(Long.valueOf(j));
            }
        }
    }

    public boolean hasSetupEmailSuggestion() {
        return this.pendingSuggestions.contains("SETUP_LOGIN_EMAIL") || this.pendingSuggestions.contains("SETUP_LOGIN_EMAIL_NOSKIP");
    }

    public int checkEmailSuggestion() {
        if (this.emailSuggestionWasShown || this.lastCheckPromoInfoTime + 10 < getConnectionsManager().getCurrentTime()) {
            return 0;
        }
        boolean zContains = this.pendingSuggestions.contains("SETUP_LOGIN_EMAIL");
        if (this.pendingSuggestions.contains("SETUP_LOGIN_EMAIL_NOSKIP")) {
            return 2;
        }
        return zContains ? 1 : 0;
    }

    public void markEmailSuggestionAsShown() {
        this.emailSuggestionWasShown = true;
    }

    public void loadStakeDiceInfo(Utilities.Callback<Boolean> callback) {
        TLRPC.EmojiGameInfo emojiGameInfo = this.stakeDiceInfo;
        if (emojiGameInfo != null) {
            callback.run(Boolean.valueOf(emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo));
            return;
        }
        ArrayList<Utilities.Callback<Boolean>> arrayList = this.loadingStakeDiceInfo;
        if (arrayList != null) {
            arrayList.add(callback);
            return;
        }
        ArrayList<Utilities.Callback<Boolean>> arrayList2 = new ArrayList<>();
        this.loadingStakeDiceInfo = arrayList2;
        arrayList2.add(callback);
        getConnectionsManager().sendRequestTyped(new TLRPC.TL_messages_getEmojiGameInfo(), new BotForumHelper$$ExternalSyntheticLambda2(), new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.lambda$loadStakeDiceInfo$467((TLRPC.EmojiGameInfo) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    public void lambda$loadStakeDiceInfo$467(TLRPC.EmojiGameInfo emojiGameInfo, TLRPC.TL_error tL_error) {
        if (emojiGameInfo != null) {
            this.stakeDiceInfo = emojiGameInfo;
        }
        Iterator<Utilities.Callback<Boolean>> it = this.loadingStakeDiceInfo.iterator();
        while (it.hasNext()) {
            it.next().run(Boolean.valueOf(this.stakeDiceInfo instanceof TLRPC.TL_emojiGameDiceInfo));
        }
        this.loadingStakeDiceInfo = null;
    }
}
