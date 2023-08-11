package org.telegram.messenger;

import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
public class NotificationCenter {
    private static final long EXPIRE_NOTIFICATIONS_TIME = 5017;
    private static volatile NotificationCenter[] Instance = new NotificationCenter[4];
    public static final int activeGroupCallsUpdated;
    public static final int albumsDidLoad;
    public static boolean alreadyLogged = false;
    public static final int animatedEmojiDocumentLoaded;
    public static final int appDidLogout;
    public static final int appUpdateAvailable;
    public static final int applyGroupCallVisibleParticipants;
    public static final int archivedStickersCountDidLoad;
    public static final int attachMenuBotsDidLoad;
    public static final int audioDidSent;
    public static final int audioRecordTooShort;
    public static final int audioRouteChanged;
    public static final int billingConfirmPurchaseError;
    public static final int billingProductDetailsUpdated;
    public static final int blockedUsersDidLoad;
    public static final int botInfoDidLoad;
    public static final int botKeyboardDidLoad;
    public static final int cameraInitied;
    public static final int changeRepliesCounter;
    public static final int channelRightsUpdated;
    public static final int chatAvailableReactionsUpdated;
    public static final int chatDidCreated;
    public static final int chatDidFailCreate;
    public static final int chatInfoCantLoad;
    public static final int chatInfoDidLoad;
    public static final int chatOnlineCountDidLoad;
    public static final int chatSearchResultsAvailable;
    public static final int chatSearchResultsLoading;
    public static int chatSwithcedToForum = 0;
    public static int chatlistFolderUpdate = 0;
    public static final int closeChats;
    public static final int closeInCallActivity;
    public static final int closeOtherAppActivities;
    public static final int closeSearchByActiveAction;
    public static final int commentsRead;
    public static final int configLoaded;
    public static final int contactsDidLoad;
    public static final int contactsImported;
    public static final int currentUserPremiumStatusChanged;
    public static final int currentUserShowLimitReachedDialog;
    public static final int customTypefacesLoaded;
    public static final int dialogDeleted;
    public static final int dialogFiltersUpdated;
    public static final int dialogIsTranslatable;
    public static final int dialogPhotosLoaded;
    public static final int dialogTranslate;
    public static final int dialogsNeedReload;
    public static final int dialogsUnreadCounterChanged;
    public static final int dialogsUnreadReactionsCounterChanged;
    public static final int diceStickersDidLoad;
    public static final int didApplyNewTheme;
    public static final int didClearDatabase;
    public static final int didCreatedNewDeleteTask;
    public static final int didEndCall;
    public static final int didGenerateFingerprintKeyPair;
    public static final int didLoadChatAdmins;
    public static final int didLoadChatInviter;
    public static final int didLoadPinnedMessages;
    public static final int didLoadSendAsPeers;
    public static final int didLoadSponsoredMessages;
    public static final int didReceiveCall;
    public static final int didReceiveNewMessages = 1;
    public static final int didReceiveSmsCode;
    public static final int didReceivedWebpages;
    public static final int didReceivedWebpagesInUpdates;
    public static final int didRemoveTwoStepPassword;
    public static final int didReplacedPhotoInMemCache;
    public static final int didSetNewTheme;
    public static final int didSetNewWallpapper;
    public static final int didSetOrRemoveTwoStepPassword;
    public static final int didSetPasscode;
    public static final int didStartedCall;
    public static final int didUpdateConnectionState;
    public static final int didUpdateExtendedMedia;
    public static int didUpdateGlobalAutoDeleteTimer = 0;
    public static final int didUpdateMessagesViews;
    public static final int didUpdatePollResults;
    public static final int didUpdatePremiumGiftFieldIcon;
    public static final int didUpdatePremiumGiftStickers;
    public static final int didUpdateReactions;
    public static final int didVerifyMessagesStickers;
    public static final int emojiLoaded;
    public static final int emojiPreviewThemesChanged;
    public static final int encryptedChatCreated;
    public static final int encryptedChatUpdated;
    public static final int featuredEmojiDidLoad;
    public static final int featuredStickersDidLoad;
    public static final int fileLoadFailed;
    public static final int fileLoadProgressChanged;
    public static final int fileLoaded;
    public static final int fileNewChunkAvailable;
    public static final int filePreparingFailed;
    public static final int filePreparingStarted;
    public static final int fileUploadFailed;
    public static final int fileUploadProgressChanged;
    public static final int fileUploaded;
    public static final int filterSettingsUpdated;
    public static final int folderBecomeEmpty;
    public static final int forceImportContactsStart;
    private static volatile NotificationCenter globalInstance = null;
    public static final int goingToPreviewTheme;
    public static final int groupCallScreencastStateChanged;
    public static final int groupCallSpeakingUsersUpdated;
    public static final int groupCallTypingsUpdated;
    public static final int groupCallUpdated;
    public static final int groupCallVisibilityChanged;
    public static final int groupStickersDidLoad;
    public static final int hasNewContactsToImport;
    public static final int historyCleared;
    public static final int historyImportProgressChanged;
    public static final int httpFileDidFailedLoad;
    public static final int httpFileDidLoad;
    public static final int invalidateMotionBackground;
    public static final int liveLocationsCacheChanged;
    public static final int liveLocationsChanged;
    public static final int loadingMessagesFailed;
    public static final int locationPermissionDenied;
    public static final int locationPermissionGranted;
    public static final int mainUserInfoChanged;
    public static final int mediaCountDidLoad;
    public static final int mediaCountsDidLoad;
    public static final int mediaDidLoad;
    public static final int messagePlayingDidReset;
    public static final int messagePlayingDidSeek;
    public static final int messagePlayingDidStart;
    public static final int messagePlayingGoingToStop;
    public static final int messagePlayingPlayStateChanged;
    public static final int messagePlayingProgressDidChanged;
    public static final int messagePlayingSpeedChanged;
    public static final int messageReceivedByAck;
    public static final int messageReceivedByServer;
    public static final int messageSendError;
    public static final int messageTranslated;
    public static final int messageTranslating;
    public static final int messagesDeleted;
    public static final int messagesDidLoad;
    public static final int messagesDidLoadWithoutProcess;
    public static final int messagesRead;
    public static final int messagesReadContent;
    public static final int messagesReadEncrypted;
    public static final int moreMusicDidLoad;
    public static final int musicDidLoad;
    public static final int needAddArchivedStickers;
    public static final int needCheckSystemBarColors;
    public static final int needDeleteDialog;
    public static final int needReloadRecentDialogsSearch;
    public static final int needSetDayNightTheme;
    public static final int needShareTheme;
    public static final int needShowAlert;
    public static final int needShowPlayServicesAlert;
    public static final int newDraftReceived;
    public static final int newEmojiSuggestionsAvailable;
    public static final int newLocationAvailable;
    public static final int newPeopleNearbyAvailable;
    public static final int newSessionReceived;
    public static final int newSuggestionsAvailable;
    public static final int notificationsCountUpdated;
    public static final int notificationsSettingsUpdated;
    public static final int onActivityResultReceived;
    public static final int onDatabaseMigration;
    public static final int onDatabaseOpened;
    public static int onDatabaseReset = 0;
    public static final int onDownloadingFilesChanged;
    public static final int onEmojiInteractionsReceived;
    public static final int onReceivedChannelDifference;
    public static final int onRequestPermissionResultReceived;
    public static final int onUserRingtonesUpdated;
    public static final int openArticle;
    public static final int openedChatChanged;
    public static final int passcodeDismissed;
    public static final int paymentFinished;
    public static final int peerSettingsDidLoad;
    public static final int permissionsGranted;
    public static final int pinnedInfoDidLoad;
    public static final int playerDidStartPlaying;
    public static final int premiumPromoUpdated;
    public static final int premiumStatusChangedGlobal;
    public static final int premiumStickersPreviewLoaded;
    public static final int privacyRulesUpdated;
    public static final int proxyChangedByRotation;
    public static final int proxyCheckDone;
    public static final int proxySettingsChanged;
    public static final int pushMessagesUpdated;
    public static final int reactionsDidLoad;
    public static final int recentDocumentsDidLoad;
    public static final int recentEmojiStatusesUpdate;
    public static final int recordProgressChanged;
    public static final int recordStartError;
    public static final int recordStarted;
    public static final int recordStopped;
    public static final int reloadDialogPhotos;
    public static final int reloadHints;
    public static final int reloadInlineHints;
    public static final int reloadInterface;
    public static final int removeAllMessagesFromDialog;
    public static final int replaceMessagesObjects;
    public static final int replyMessagesDidLoad;
    public static final int requestPermissions;
    public static final int scheduledMessagesUpdated;
    public static final int screenStateChanged;
    public static final int screenshotTook;
    public static final int sendingMessagesChanged;
    public static final int showBulletin;
    public static final int startAllHeavyOperations;
    public static final int startSpoilers;
    public static final int stealthModeChanged;
    public static final int stickersDidLoad;
    public static final int stickersImportComplete;
    public static final int stickersImportProgressChanged;
    public static final int stopAllHeavyOperations;
    public static final int stopEncodingService;
    public static final int stopSpoilers;
    public static final int storiesBlocklistUpdate;
    public static int storiesDraftsUpdated = 0;
    public static final int storiesEnabledUpdate;
    public static final int storiesLimitUpdate;
    public static int storiesListUpdated = 0;
    public static int storiesUpdated = 0;
    public static final int suggestedFiltersLoaded;
    public static final int suggestedLangpack;
    public static final int themeAccentListUpdated;
    public static final int themeListUpdated;
    public static final int themeUploadError;
    public static final int themeUploadedToServer;
    public static final int threadMessagesRead;
    public static int topicsDidLoaded = 0;
    private static int totalEvents = 1;
    public static final int twoStepPasswordChanged;
    public static final int updateBotMenuButton;
    public static final int updateDefaultSendAsPeer;
    public static final int updateInterfaces;
    public static final int updateMentionsCount;
    public static final int updateMessageMedia;
    public static final int updateSearchSettings;
    public static final int uploadStoryEnd;
    public static final int uploadStoryProgress;
    public static final int userEmojiStatusUpdated;
    public static final int userInfoDidLoad;
    public static final int videoLoadingStateChanged;
    public static final int voiceTranscriptionUpdate;
    public static final int voipServiceCreated;
    public static final int walletPendingTransactionsChanged;
    public static final int walletSyncProgressChanged;
    public static int wallpaperSettedToUser;
    public static final int wallpapersDidLoad;
    public static final int wallpapersNeedReload;
    public static final int wasUnableToFindCurrentLocation;
    public static final int webRtcMicAmplitudeEvent;
    public static final int webRtcSpeakerAmplitudeEvent;
    public static final int webViewResultSent;
    private int animationInProgressCount;
    private Runnable checkForExpiredNotifications;
    private int currentAccount;
    private int currentHeavyOperationFlags;
    private SparseArray<ArrayList<NotificationCenterDelegate>> observers = new SparseArray<>();
    private SparseArray<ArrayList<NotificationCenterDelegate>> removeAfterBroadcast = new SparseArray<>();
    private SparseArray<ArrayList<NotificationCenterDelegate>> addAfterBroadcast = new SparseArray<>();
    private ArrayList<DelayedPost> delayedPosts = new ArrayList<>(10);
    private ArrayList<Runnable> delayedRunnables = new ArrayList<>(10);
    private ArrayList<Runnable> delayedRunnablesTmp = new ArrayList<>(10);
    private ArrayList<DelayedPost> delayedPostsTmp = new ArrayList<>(10);
    private ArrayList<PostponeNotificationCallback> postponeCallbackList = new ArrayList<>(10);
    private int broadcasting = 0;
    private int animationInProgressPointer = 1;
    HashSet<Integer> heavyOperationsCounter = new HashSet<>();
    private final SparseArray<AllowedNotifications> allowedNotifications = new SparseArray<>();
    SparseArray<Runnable> alreadyPostedRannubles = new SparseArray<>();

    public interface NotificationCenterDelegate {
        void didReceivedNotification(int i, int i2, Object... objArr);
    }

    public interface PostponeNotificationCallback {
        boolean needPostpone(int i, int i2, Object[] objArr);
    }

    static {
        int i = 1 + 1;
        totalEvents = i;
        int i2 = i + 1;
        totalEvents = i2;
        updateInterfaces = i;
        int i3 = i2 + 1;
        totalEvents = i3;
        dialogsNeedReload = i2;
        int i4 = i3 + 1;
        totalEvents = i4;
        closeChats = i3;
        int i5 = i4 + 1;
        totalEvents = i5;
        messagesDeleted = i4;
        int i6 = i5 + 1;
        totalEvents = i6;
        historyCleared = i5;
        int i7 = i6 + 1;
        totalEvents = i7;
        messagesRead = i6;
        int i8 = i7 + 1;
        totalEvents = i8;
        threadMessagesRead = i7;
        int i9 = i8 + 1;
        totalEvents = i9;
        commentsRead = i8;
        int i10 = i9 + 1;
        totalEvents = i10;
        changeRepliesCounter = i9;
        int i11 = i10 + 1;
        totalEvents = i11;
        messagesDidLoad = i10;
        int i12 = i11 + 1;
        totalEvents = i12;
        didLoadSponsoredMessages = i11;
        int i13 = i12 + 1;
        totalEvents = i13;
        didLoadSendAsPeers = i12;
        int i14 = i13 + 1;
        totalEvents = i14;
        updateDefaultSendAsPeer = i13;
        int i15 = i14 + 1;
        totalEvents = i15;
        messagesDidLoadWithoutProcess = i14;
        int i16 = i15 + 1;
        totalEvents = i16;
        loadingMessagesFailed = i15;
        int i17 = i16 + 1;
        totalEvents = i17;
        messageReceivedByAck = i16;
        int i18 = i17 + 1;
        totalEvents = i18;
        messageReceivedByServer = i17;
        int i19 = i18 + 1;
        totalEvents = i19;
        messageSendError = i18;
        int i20 = i19 + 1;
        totalEvents = i20;
        forceImportContactsStart = i19;
        int i21 = i20 + 1;
        totalEvents = i21;
        contactsDidLoad = i20;
        int i22 = i21 + 1;
        totalEvents = i22;
        contactsImported = i21;
        int i23 = i22 + 1;
        totalEvents = i23;
        hasNewContactsToImport = i22;
        int i24 = i23 + 1;
        totalEvents = i24;
        chatDidCreated = i23;
        int i25 = i24 + 1;
        totalEvents = i25;
        chatDidFailCreate = i24;
        int i26 = i25 + 1;
        totalEvents = i26;
        chatInfoDidLoad = i25;
        int i27 = i26 + 1;
        totalEvents = i27;
        chatInfoCantLoad = i26;
        int i28 = i27 + 1;
        totalEvents = i28;
        mediaDidLoad = i27;
        int i29 = i28 + 1;
        totalEvents = i29;
        mediaCountDidLoad = i28;
        int i30 = i29 + 1;
        totalEvents = i30;
        mediaCountsDidLoad = i29;
        int i31 = i30 + 1;
        totalEvents = i31;
        encryptedChatUpdated = i30;
        int i32 = i31 + 1;
        totalEvents = i32;
        messagesReadEncrypted = i31;
        int i33 = i32 + 1;
        totalEvents = i33;
        encryptedChatCreated = i32;
        int i34 = i33 + 1;
        totalEvents = i34;
        dialogPhotosLoaded = i33;
        int i35 = i34 + 1;
        totalEvents = i35;
        reloadDialogPhotos = i34;
        int i36 = i35 + 1;
        totalEvents = i36;
        folderBecomeEmpty = i35;
        int i37 = i36 + 1;
        totalEvents = i37;
        removeAllMessagesFromDialog = i36;
        int i38 = i37 + 1;
        totalEvents = i38;
        notificationsSettingsUpdated = i37;
        int i39 = i38 + 1;
        totalEvents = i39;
        blockedUsersDidLoad = i38;
        int i40 = i39 + 1;
        totalEvents = i40;
        openedChatChanged = i39;
        int i41 = i40 + 1;
        totalEvents = i41;
        didCreatedNewDeleteTask = i40;
        int i42 = i41 + 1;
        totalEvents = i42;
        mainUserInfoChanged = i41;
        int i43 = i42 + 1;
        totalEvents = i43;
        privacyRulesUpdated = i42;
        int i44 = i43 + 1;
        totalEvents = i44;
        updateMessageMedia = i43;
        int i45 = i44 + 1;
        totalEvents = i45;
        replaceMessagesObjects = i44;
        int i46 = i45 + 1;
        totalEvents = i46;
        didSetPasscode = i45;
        int i47 = i46 + 1;
        totalEvents = i47;
        passcodeDismissed = i46;
        int i48 = i47 + 1;
        totalEvents = i48;
        twoStepPasswordChanged = i47;
        int i49 = i48 + 1;
        totalEvents = i49;
        didSetOrRemoveTwoStepPassword = i48;
        int i50 = i49 + 1;
        totalEvents = i50;
        didRemoveTwoStepPassword = i49;
        int i51 = i50 + 1;
        totalEvents = i51;
        replyMessagesDidLoad = i50;
        int i52 = i51 + 1;
        totalEvents = i52;
        didLoadPinnedMessages = i51;
        int i53 = i52 + 1;
        totalEvents = i53;
        newSessionReceived = i52;
        int i54 = i53 + 1;
        totalEvents = i54;
        didReceivedWebpages = i53;
        int i55 = i54 + 1;
        totalEvents = i55;
        didReceivedWebpagesInUpdates = i54;
        int i56 = i55 + 1;
        totalEvents = i56;
        stickersDidLoad = i55;
        int i57 = i56 + 1;
        totalEvents = i57;
        diceStickersDidLoad = i56;
        int i58 = i57 + 1;
        totalEvents = i58;
        featuredStickersDidLoad = i57;
        int i59 = i58 + 1;
        totalEvents = i59;
        featuredEmojiDidLoad = i58;
        int i60 = i59 + 1;
        totalEvents = i60;
        groupStickersDidLoad = i59;
        int i61 = i60 + 1;
        totalEvents = i61;
        messagesReadContent = i60;
        int i62 = i61 + 1;
        totalEvents = i62;
        botInfoDidLoad = i61;
        int i63 = i62 + 1;
        totalEvents = i63;
        userInfoDidLoad = i62;
        int i64 = i63 + 1;
        totalEvents = i64;
        pinnedInfoDidLoad = i63;
        int i65 = i64 + 1;
        totalEvents = i65;
        botKeyboardDidLoad = i64;
        int i66 = i65 + 1;
        totalEvents = i66;
        chatSearchResultsAvailable = i65;
        int i67 = i66 + 1;
        totalEvents = i67;
        chatSearchResultsLoading = i66;
        int i68 = i67 + 1;
        totalEvents = i68;
        musicDidLoad = i67;
        int i69 = i68 + 1;
        totalEvents = i69;
        moreMusicDidLoad = i68;
        int i70 = i69 + 1;
        totalEvents = i70;
        needShowAlert = i69;
        int i71 = i70 + 1;
        totalEvents = i71;
        needShowPlayServicesAlert = i70;
        int i72 = i71 + 1;
        totalEvents = i72;
        didUpdateMessagesViews = i71;
        int i73 = i72 + 1;
        totalEvents = i73;
        needReloadRecentDialogsSearch = i72;
        int i74 = i73 + 1;
        totalEvents = i74;
        peerSettingsDidLoad = i73;
        int i75 = i74 + 1;
        totalEvents = i75;
        wasUnableToFindCurrentLocation = i74;
        int i76 = i75 + 1;
        totalEvents = i76;
        reloadHints = i75;
        int i77 = i76 + 1;
        totalEvents = i77;
        reloadInlineHints = i76;
        int i78 = i77 + 1;
        totalEvents = i78;
        newDraftReceived = i77;
        int i79 = i78 + 1;
        totalEvents = i79;
        recentDocumentsDidLoad = i78;
        int i80 = i79 + 1;
        totalEvents = i80;
        needAddArchivedStickers = i79;
        int i81 = i80 + 1;
        totalEvents = i81;
        archivedStickersCountDidLoad = i80;
        int i82 = i81 + 1;
        totalEvents = i82;
        paymentFinished = i81;
        int i83 = i82 + 1;
        totalEvents = i83;
        channelRightsUpdated = i82;
        int i84 = i83 + 1;
        totalEvents = i84;
        openArticle = i83;
        int i85 = i84 + 1;
        totalEvents = i85;
        updateMentionsCount = i84;
        int i86 = i85 + 1;
        totalEvents = i86;
        didUpdatePollResults = i85;
        int i87 = i86 + 1;
        totalEvents = i87;
        chatOnlineCountDidLoad = i86;
        int i88 = i87 + 1;
        totalEvents = i88;
        videoLoadingStateChanged = i87;
        int i89 = i88 + 1;
        totalEvents = i89;
        newPeopleNearbyAvailable = i88;
        int i90 = i89 + 1;
        totalEvents = i90;
        stopAllHeavyOperations = i89;
        int i91 = i90 + 1;
        totalEvents = i91;
        startAllHeavyOperations = i90;
        int i92 = i91 + 1;
        totalEvents = i92;
        stopSpoilers = i91;
        int i93 = i92 + 1;
        totalEvents = i93;
        startSpoilers = i92;
        int i94 = i93 + 1;
        totalEvents = i94;
        sendingMessagesChanged = i93;
        int i95 = i94 + 1;
        totalEvents = i95;
        didUpdateReactions = i94;
        int i96 = i95 + 1;
        totalEvents = i96;
        didUpdateExtendedMedia = i95;
        int i97 = i96 + 1;
        totalEvents = i97;
        didVerifyMessagesStickers = i96;
        int i98 = i97 + 1;
        totalEvents = i98;
        scheduledMessagesUpdated = i97;
        int i99 = i98 + 1;
        totalEvents = i99;
        newSuggestionsAvailable = i98;
        int i100 = i99 + 1;
        totalEvents = i100;
        didLoadChatInviter = i99;
        int i101 = i100 + 1;
        totalEvents = i101;
        didLoadChatAdmins = i100;
        int i102 = i101 + 1;
        totalEvents = i102;
        historyImportProgressChanged = i101;
        int i103 = i102 + 1;
        totalEvents = i103;
        stickersImportProgressChanged = i102;
        int i104 = i103 + 1;
        totalEvents = i104;
        stickersImportComplete = i103;
        int i105 = i104 + 1;
        totalEvents = i105;
        dialogDeleted = i104;
        int i106 = i105 + 1;
        totalEvents = i106;
        webViewResultSent = i105;
        int i107 = i106 + 1;
        totalEvents = i107;
        voiceTranscriptionUpdate = i106;
        int i108 = i107 + 1;
        totalEvents = i108;
        animatedEmojiDocumentLoaded = i107;
        int i109 = i108 + 1;
        totalEvents = i109;
        recentEmojiStatusesUpdate = i108;
        int i110 = i109 + 1;
        totalEvents = i110;
        updateSearchSettings = i109;
        int i111 = i110 + 1;
        totalEvents = i111;
        messageTranslated = i110;
        int i112 = i111 + 1;
        totalEvents = i112;
        messageTranslating = i111;
        int i113 = i112 + 1;
        totalEvents = i113;
        dialogIsTranslatable = i112;
        int i114 = i113 + 1;
        totalEvents = i114;
        dialogTranslate = i113;
        int i115 = i114 + 1;
        totalEvents = i115;
        didGenerateFingerprintKeyPair = i114;
        int i116 = i115 + 1;
        totalEvents = i116;
        walletPendingTransactionsChanged = i115;
        int i117 = i116 + 1;
        totalEvents = i117;
        walletSyncProgressChanged = i116;
        int i118 = i117 + 1;
        totalEvents = i118;
        httpFileDidLoad = i117;
        int i119 = i118 + 1;
        totalEvents = i119;
        httpFileDidFailedLoad = i118;
        int i120 = i119 + 1;
        totalEvents = i120;
        didUpdateConnectionState = i119;
        int i121 = i120 + 1;
        totalEvents = i121;
        fileUploaded = i120;
        int i122 = i121 + 1;
        totalEvents = i122;
        fileUploadFailed = i121;
        int i123 = i122 + 1;
        totalEvents = i123;
        fileUploadProgressChanged = i122;
        int i124 = i123 + 1;
        totalEvents = i124;
        fileLoadProgressChanged = i123;
        int i125 = i124 + 1;
        totalEvents = i125;
        fileLoaded = i124;
        int i126 = i125 + 1;
        totalEvents = i126;
        fileLoadFailed = i125;
        int i127 = i126 + 1;
        totalEvents = i127;
        filePreparingStarted = i126;
        int i128 = i127 + 1;
        totalEvents = i128;
        fileNewChunkAvailable = i127;
        int i129 = i128 + 1;
        totalEvents = i129;
        filePreparingFailed = i128;
        int i130 = i129 + 1;
        totalEvents = i130;
        dialogsUnreadCounterChanged = i129;
        int i131 = i130 + 1;
        totalEvents = i131;
        messagePlayingProgressDidChanged = i130;
        int i132 = i131 + 1;
        totalEvents = i132;
        messagePlayingDidReset = i131;
        int i133 = i132 + 1;
        totalEvents = i133;
        messagePlayingPlayStateChanged = i132;
        int i134 = i133 + 1;
        totalEvents = i134;
        messagePlayingDidStart = i133;
        int i135 = i134 + 1;
        totalEvents = i135;
        messagePlayingDidSeek = i134;
        int i136 = i135 + 1;
        totalEvents = i136;
        messagePlayingGoingToStop = i135;
        int i137 = i136 + 1;
        totalEvents = i137;
        recordProgressChanged = i136;
        int i138 = i137 + 1;
        totalEvents = i138;
        recordStarted = i137;
        int i139 = i138 + 1;
        totalEvents = i139;
        recordStartError = i138;
        int i140 = i139 + 1;
        totalEvents = i140;
        recordStopped = i139;
        int i141 = i140 + 1;
        totalEvents = i141;
        screenshotTook = i140;
        int i142 = i141 + 1;
        totalEvents = i142;
        albumsDidLoad = i141;
        int i143 = i142 + 1;
        totalEvents = i143;
        audioDidSent = i142;
        int i144 = i143 + 1;
        totalEvents = i144;
        audioRecordTooShort = i143;
        int i145 = i144 + 1;
        totalEvents = i145;
        audioRouteChanged = i144;
        int i146 = i145 + 1;
        totalEvents = i146;
        didStartedCall = i145;
        int i147 = i146 + 1;
        totalEvents = i147;
        groupCallUpdated = i146;
        int i148 = i147 + 1;
        totalEvents = i148;
        groupCallSpeakingUsersUpdated = i147;
        int i149 = i148 + 1;
        totalEvents = i149;
        groupCallScreencastStateChanged = i148;
        int i150 = i149 + 1;
        totalEvents = i150;
        activeGroupCallsUpdated = i149;
        int i151 = i150 + 1;
        totalEvents = i151;
        applyGroupCallVisibleParticipants = i150;
        int i152 = i151 + 1;
        totalEvents = i152;
        groupCallTypingsUpdated = i151;
        int i153 = i152 + 1;
        totalEvents = i153;
        didEndCall = i152;
        int i154 = i153 + 1;
        totalEvents = i154;
        closeInCallActivity = i153;
        int i155 = i154 + 1;
        totalEvents = i155;
        groupCallVisibilityChanged = i154;
        int i156 = i155 + 1;
        totalEvents = i156;
        appDidLogout = i155;
        int i157 = i156 + 1;
        totalEvents = i157;
        configLoaded = i156;
        int i158 = i157 + 1;
        totalEvents = i158;
        needDeleteDialog = i157;
        int i159 = i158 + 1;
        totalEvents = i159;
        newEmojiSuggestionsAvailable = i158;
        int i160 = i159 + 1;
        totalEvents = i160;
        themeUploadedToServer = i159;
        int i161 = i160 + 1;
        totalEvents = i161;
        themeUploadError = i160;
        int i162 = i161 + 1;
        totalEvents = i162;
        dialogFiltersUpdated = i161;
        int i163 = i162 + 1;
        totalEvents = i163;
        filterSettingsUpdated = i162;
        int i164 = i163 + 1;
        totalEvents = i164;
        suggestedFiltersLoaded = i163;
        int i165 = i164 + 1;
        totalEvents = i165;
        updateBotMenuButton = i164;
        int i166 = i165 + 1;
        totalEvents = i166;
        didUpdatePremiumGiftStickers = i165;
        int i167 = i166 + 1;
        totalEvents = i167;
        didUpdatePremiumGiftFieldIcon = i166;
        int i168 = i167 + 1;
        totalEvents = i168;
        storiesEnabledUpdate = i167;
        int i169 = i168 + 1;
        totalEvents = i169;
        storiesBlocklistUpdate = i168;
        int i170 = i169 + 1;
        totalEvents = i170;
        storiesLimitUpdate = i169;
        int i171 = i170 + 1;
        totalEvents = i171;
        pushMessagesUpdated = i170;
        int i172 = i171 + 1;
        totalEvents = i172;
        stopEncodingService = i171;
        int i173 = i172 + 1;
        totalEvents = i173;
        wallpapersDidLoad = i172;
        int i174 = i173 + 1;
        totalEvents = i174;
        wallpapersNeedReload = i173;
        int i175 = i174 + 1;
        totalEvents = i175;
        didReceiveSmsCode = i174;
        int i176 = i175 + 1;
        totalEvents = i176;
        didReceiveCall = i175;
        int i177 = i176 + 1;
        totalEvents = i177;
        emojiLoaded = i176;
        int i178 = i177 + 1;
        totalEvents = i178;
        invalidateMotionBackground = i177;
        int i179 = i178 + 1;
        totalEvents = i179;
        closeOtherAppActivities = i178;
        int i180 = i179 + 1;
        totalEvents = i180;
        cameraInitied = i179;
        int i181 = i180 + 1;
        totalEvents = i181;
        didReplacedPhotoInMemCache = i180;
        int i182 = i181 + 1;
        totalEvents = i182;
        didSetNewTheme = i181;
        int i183 = i182 + 1;
        totalEvents = i183;
        themeListUpdated = i182;
        int i184 = i183 + 1;
        totalEvents = i184;
        didApplyNewTheme = i183;
        int i185 = i184 + 1;
        totalEvents = i185;
        themeAccentListUpdated = i184;
        int i186 = i185 + 1;
        totalEvents = i186;
        needCheckSystemBarColors = i185;
        int i187 = i186 + 1;
        totalEvents = i187;
        needShareTheme = i186;
        int i188 = i187 + 1;
        totalEvents = i188;
        needSetDayNightTheme = i187;
        int i189 = i188 + 1;
        totalEvents = i189;
        goingToPreviewTheme = i188;
        int i190 = i189 + 1;
        totalEvents = i190;
        locationPermissionGranted = i189;
        int i191 = i190 + 1;
        totalEvents = i191;
        locationPermissionDenied = i190;
        int i192 = i191 + 1;
        totalEvents = i192;
        reloadInterface = i191;
        int i193 = i192 + 1;
        totalEvents = i193;
        suggestedLangpack = i192;
        int i194 = i193 + 1;
        totalEvents = i194;
        didSetNewWallpapper = i193;
        int i195 = i194 + 1;
        totalEvents = i195;
        proxySettingsChanged = i194;
        int i196 = i195 + 1;
        totalEvents = i196;
        proxyCheckDone = i195;
        int i197 = i196 + 1;
        totalEvents = i197;
        proxyChangedByRotation = i196;
        int i198 = i197 + 1;
        totalEvents = i198;
        liveLocationsChanged = i197;
        int i199 = i198 + 1;
        totalEvents = i199;
        newLocationAvailable = i198;
        int i200 = i199 + 1;
        totalEvents = i200;
        liveLocationsCacheChanged = i199;
        int i201 = i200 + 1;
        totalEvents = i201;
        notificationsCountUpdated = i200;
        int i202 = i201 + 1;
        totalEvents = i202;
        playerDidStartPlaying = i201;
        int i203 = i202 + 1;
        totalEvents = i203;
        closeSearchByActiveAction = i202;
        int i204 = i203 + 1;
        totalEvents = i204;
        messagePlayingSpeedChanged = i203;
        int i205 = i204 + 1;
        totalEvents = i205;
        screenStateChanged = i204;
        int i206 = i205 + 1;
        totalEvents = i206;
        didClearDatabase = i205;
        int i207 = i206 + 1;
        totalEvents = i207;
        voipServiceCreated = i206;
        int i208 = i207 + 1;
        totalEvents = i208;
        webRtcMicAmplitudeEvent = i207;
        int i209 = i208 + 1;
        totalEvents = i209;
        webRtcSpeakerAmplitudeEvent = i208;
        int i210 = i209 + 1;
        totalEvents = i210;
        showBulletin = i209;
        int i211 = i210 + 1;
        totalEvents = i211;
        appUpdateAvailable = i210;
        int i212 = i211 + 1;
        totalEvents = i212;
        onDatabaseMigration = i211;
        int i213 = i212 + 1;
        totalEvents = i213;
        onEmojiInteractionsReceived = i212;
        int i214 = i213 + 1;
        totalEvents = i214;
        emojiPreviewThemesChanged = i213;
        int i215 = i214 + 1;
        totalEvents = i215;
        reactionsDidLoad = i214;
        int i216 = i215 + 1;
        totalEvents = i216;
        attachMenuBotsDidLoad = i215;
        int i217 = i216 + 1;
        totalEvents = i217;
        chatAvailableReactionsUpdated = i216;
        int i218 = i217 + 1;
        totalEvents = i218;
        dialogsUnreadReactionsCounterChanged = i217;
        int i219 = i218 + 1;
        totalEvents = i219;
        onDatabaseOpened = i218;
        int i220 = i219 + 1;
        totalEvents = i220;
        onDownloadingFilesChanged = i219;
        int i221 = i220 + 1;
        totalEvents = i221;
        onActivityResultReceived = i220;
        int i222 = i221 + 1;
        totalEvents = i222;
        onRequestPermissionResultReceived = i221;
        int i223 = i222 + 1;
        totalEvents = i223;
        onUserRingtonesUpdated = i222;
        int i224 = i223 + 1;
        totalEvents = i224;
        currentUserPremiumStatusChanged = i223;
        int i225 = i224 + 1;
        totalEvents = i225;
        premiumPromoUpdated = i224;
        int i226 = i225 + 1;
        totalEvents = i226;
        premiumStatusChangedGlobal = i225;
        int i227 = i226 + 1;
        totalEvents = i227;
        currentUserShowLimitReachedDialog = i226;
        int i228 = i227 + 1;
        totalEvents = i228;
        billingProductDetailsUpdated = i227;
        int i229 = i228 + 1;
        totalEvents = i229;
        billingConfirmPurchaseError = i228;
        int i230 = i229 + 1;
        totalEvents = i230;
        premiumStickersPreviewLoaded = i229;
        int i231 = i230 + 1;
        totalEvents = i231;
        userEmojiStatusUpdated = i230;
        int i232 = i231 + 1;
        totalEvents = i232;
        requestPermissions = i231;
        int i233 = i232 + 1;
        totalEvents = i233;
        permissionsGranted = i232;
        int i234 = i233 + 1;
        totalEvents = i234;
        topicsDidLoaded = i233;
        int i235 = i234 + 1;
        totalEvents = i235;
        chatSwithcedToForum = i234;
        int i236 = i235 + 1;
        totalEvents = i236;
        didUpdateGlobalAutoDeleteTimer = i235;
        int i237 = i236 + 1;
        totalEvents = i237;
        onDatabaseReset = i236;
        int i238 = i237 + 1;
        totalEvents = i238;
        wallpaperSettedToUser = i237;
        int i239 = i238 + 1;
        totalEvents = i239;
        storiesUpdated = i238;
        int i240 = i239 + 1;
        totalEvents = i240;
        storiesListUpdated = i239;
        int i241 = i240 + 1;
        totalEvents = i241;
        storiesDraftsUpdated = i240;
        int i242 = i241 + 1;
        totalEvents = i242;
        chatlistFolderUpdate = i241;
        int i243 = i242 + 1;
        totalEvents = i243;
        uploadStoryProgress = i242;
        int i244 = i243 + 1;
        totalEvents = i244;
        uploadStoryEnd = i243;
        int i245 = i244 + 1;
        totalEvents = i245;
        customTypefacesLoaded = i244;
        int i246 = i245 + 1;
        totalEvents = i246;
        stealthModeChanged = i245;
        totalEvents = i246 + 1;
        onReceivedChannelDifference = i246;
    }

    public static class DelayedPost {
        private Object[] args;
        private int id;

        private DelayedPost(int i, Object[] objArr) {
            this.id = i;
            this.args = objArr;
        }
    }

    public static NotificationCenter getInstance(int i) {
        NotificationCenter notificationCenter = Instance[i];
        if (notificationCenter == null) {
            synchronized (NotificationCenter.class) {
                notificationCenter = Instance[i];
                if (notificationCenter == null) {
                    NotificationCenter[] notificationCenterArr = Instance;
                    NotificationCenter notificationCenter2 = new NotificationCenter(i);
                    notificationCenterArr[i] = notificationCenter2;
                    notificationCenter = notificationCenter2;
                }
            }
        }
        return notificationCenter;
    }

    public static NotificationCenter getGlobalInstance() {
        NotificationCenter notificationCenter = globalInstance;
        if (notificationCenter == null) {
            synchronized (NotificationCenter.class) {
                notificationCenter = globalInstance;
                if (notificationCenter == null) {
                    notificationCenter = new NotificationCenter(-1);
                    globalInstance = notificationCenter;
                }
            }
        }
        return notificationCenter;
    }

    public NotificationCenter(int i) {
        this.currentAccount = i;
    }

    public int setAnimationInProgress(int i, int[] iArr) {
        return setAnimationInProgress(i, iArr, true);
    }

    public int setAnimationInProgress(int i, int[] iArr, boolean z) {
        onAnimationFinish(i);
        if (this.heavyOperationsCounter.isEmpty() && z) {
            getGlobalInstance().lambda$postNotificationNameOnUIThread$1(stopAllHeavyOperations, Integer.valueOf((int) LiteMode.FLAG_CALLS_ANIMATIONS));
        }
        this.animationInProgressCount++;
        int i2 = this.animationInProgressPointer + 1;
        this.animationInProgressPointer = i2;
        if (z) {
            this.heavyOperationsCounter.add(Integer.valueOf(i2));
        }
        AllowedNotifications allowedNotifications = new AllowedNotifications();
        allowedNotifications.allowedIds = iArr;
        this.allowedNotifications.put(this.animationInProgressPointer, allowedNotifications);
        if (this.checkForExpiredNotifications == null) {
            NotificationCenter$$ExternalSyntheticLambda1 notificationCenter$$ExternalSyntheticLambda1 = new NotificationCenter$$ExternalSyntheticLambda1(this);
            this.checkForExpiredNotifications = notificationCenter$$ExternalSyntheticLambda1;
            AndroidUtilities.runOnUIThread(notificationCenter$$ExternalSyntheticLambda1, EXPIRE_NOTIFICATIONS_TIME);
        }
        return this.animationInProgressPointer;
    }

    public void checkForExpiredNotifications() {
        ArrayList arrayList = null;
        this.checkForExpiredNotifications = null;
        if (this.allowedNotifications.size() == 0) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = Long.MAX_VALUE;
        for (int i = 0; i < this.allowedNotifications.size(); i++) {
            long j2 = this.allowedNotifications.valueAt(i).time;
            if (elapsedRealtime - j2 > 1000) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(Integer.valueOf(this.allowedNotifications.keyAt(i)));
            } else {
                j = Math.min(j2, j);
            }
        }
        if (arrayList != null) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                onAnimationFinish(((Integer) arrayList.get(i2)).intValue());
            }
        }
        if (j != Long.MAX_VALUE) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    NotificationCenter.this.lambda$checkForExpiredNotifications$0();
                }
            }, Math.max(17L, EXPIRE_NOTIFICATIONS_TIME - (elapsedRealtime - j)));
        }
    }

    public void lambda$checkForExpiredNotifications$0() {
        this.checkForExpiredNotifications = new NotificationCenter$$ExternalSyntheticLambda1(this);
    }

    public void updateAllowedNotifications(int i, int[] iArr) {
        AllowedNotifications allowedNotifications = this.allowedNotifications.get(i);
        if (allowedNotifications != null) {
            allowedNotifications.allowedIds = iArr;
        }
    }

    public void onAnimationFinish(int i) {
        AllowedNotifications allowedNotifications = this.allowedNotifications.get(i);
        this.allowedNotifications.delete(i);
        if (allowedNotifications != null) {
            this.animationInProgressCount--;
            if (!this.heavyOperationsCounter.isEmpty()) {
                this.heavyOperationsCounter.remove(Integer.valueOf(i));
                if (this.heavyOperationsCounter.isEmpty()) {
                    getGlobalInstance().lambda$postNotificationNameOnUIThread$1(startAllHeavyOperations, Integer.valueOf((int) LiteMode.FLAG_CALLS_ANIMATIONS));
                }
            }
            if (this.animationInProgressCount == 0) {
                runDelayedNotifications();
            }
        }
        if (this.checkForExpiredNotifications == null || this.allowedNotifications.size() != 0) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.checkForExpiredNotifications);
        this.checkForExpiredNotifications = null;
    }

    public void runDelayedNotifications() {
        if (!this.delayedPosts.isEmpty()) {
            this.delayedPostsTmp.clear();
            this.delayedPostsTmp.addAll(this.delayedPosts);
            this.delayedPosts.clear();
            for (int i = 0; i < this.delayedPostsTmp.size(); i++) {
                DelayedPost delayedPost = this.delayedPostsTmp.get(i);
                postNotificationNameInternal(delayedPost.id, true, delayedPost.args);
            }
            this.delayedPostsTmp.clear();
        }
        if (this.delayedRunnables.isEmpty()) {
            return;
        }
        this.delayedRunnablesTmp.clear();
        this.delayedRunnablesTmp.addAll(this.delayedRunnables);
        this.delayedRunnables.clear();
        for (int i2 = 0; i2 < this.delayedRunnablesTmp.size(); i2++) {
            AndroidUtilities.runOnUIThread(this.delayedRunnablesTmp.get(i2));
        }
        this.delayedRunnablesTmp.clear();
    }

    public boolean isAnimationInProgress() {
        return this.animationInProgressCount > 0;
    }

    public int getCurrentHeavyOperationFlags() {
        return this.currentHeavyOperationFlags;
    }

    public ArrayList<NotificationCenterDelegate> getObservers(int i) {
        return this.observers.get(i);
    }

    public void postNotificationNameOnUIThread(final int i, final Object... objArr) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                NotificationCenter.this.lambda$postNotificationNameOnUIThread$1(i, objArr);
            }
        });
    }

    public void lambda$postNotificationNameOnUIThread$1(int i, Object... objArr) {
        boolean z = i == startAllHeavyOperations || i == stopAllHeavyOperations || i == didReplacedPhotoInMemCache || i == closeChats || i == invalidateMotionBackground;
        ArrayList arrayList = null;
        if (!z && this.allowedNotifications.size() > 0) {
            int size = this.allowedNotifications.size();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i2 = 0;
            for (int i3 = 0; i3 < this.allowedNotifications.size(); i3++) {
                AllowedNotifications valueAt = this.allowedNotifications.valueAt(i3);
                if (elapsedRealtime - valueAt.time > EXPIRE_NOTIFICATIONS_TIME) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(Integer.valueOf(this.allowedNotifications.keyAt(i3)));
                }
                int[] iArr = valueAt.allowedIds;
                if (iArr == null) {
                    break;
                }
                int i4 = 0;
                while (true) {
                    if (i4 >= iArr.length) {
                        break;
                    } else if (iArr[i4] == i) {
                        i2++;
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            z = size == i2;
        }
        if (i == startAllHeavyOperations) {
            this.currentHeavyOperationFlags = (((Integer) objArr[0]).intValue() ^ (-1)) & this.currentHeavyOperationFlags;
        } else if (i == stopAllHeavyOperations) {
            this.currentHeavyOperationFlags = ((Integer) objArr[0]).intValue() | this.currentHeavyOperationFlags;
        }
        if (shouldDebounce(i, objArr) && BuildVars.DEBUG_VERSION) {
            postNotificationDebounced(i, objArr);
        } else {
            postNotificationNameInternal(i, z, objArr);
        }
        if (arrayList != null) {
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                onAnimationFinish(((Integer) arrayList.get(i5)).intValue());
            }
        }
    }

    private void postNotificationDebounced(final int i, final Object[] objArr) {
        final int hashCode = (Arrays.hashCode(objArr) << 16) + i;
        if (this.alreadyPostedRannubles.indexOfKey(hashCode) >= 0) {
            return;
        }
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                NotificationCenter.this.lambda$postNotificationDebounced$2(i, objArr, hashCode);
            }
        };
        this.alreadyPostedRannubles.put(hashCode, runnable);
        AndroidUtilities.runOnUIThread(runnable, 250L);
    }

    public void lambda$postNotificationDebounced$2(int i, Object[] objArr, int i2) {
        postNotificationNameInternal(i, false, objArr);
        this.alreadyPostedRannubles.remove(i2);
    }

    private boolean shouldDebounce(int i, Object[] objArr) {
        return i == updateInterfaces;
    }

    public void postNotificationNameInternal(int i, boolean z, Object... objArr) {
        if (BuildVars.DEBUG_VERSION && Thread.currentThread() != ApplicationLoader.applicationHandler.getLooper().getThread()) {
            throw new RuntimeException("postNotificationName allowed only from MAIN thread");
        }
        if (!z && isAnimationInProgress()) {
            this.delayedPosts.add(new DelayedPost(i, objArr));
            return;
        }
        if (!this.postponeCallbackList.isEmpty()) {
            for (int i2 = 0; i2 < this.postponeCallbackList.size(); i2++) {
                if (this.postponeCallbackList.get(i2).needPostpone(i, this.currentAccount, objArr)) {
                    this.delayedPosts.add(new DelayedPost(i, objArr));
                    return;
                }
            }
        }
        this.broadcasting++;
        ArrayList<NotificationCenterDelegate> arrayList = this.observers.get(i);
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                arrayList.get(i3).didReceivedNotification(i, this.currentAccount, objArr);
            }
        }
        int i4 = this.broadcasting - 1;
        this.broadcasting = i4;
        if (i4 == 0) {
            if (this.removeAfterBroadcast.size() != 0) {
                for (int i5 = 0; i5 < this.removeAfterBroadcast.size(); i5++) {
                    int keyAt = this.removeAfterBroadcast.keyAt(i5);
                    ArrayList<NotificationCenterDelegate> arrayList2 = this.removeAfterBroadcast.get(keyAt);
                    for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                        removeObserver(arrayList2.get(i6), keyAt);
                    }
                }
                this.removeAfterBroadcast.clear();
            }
            if (this.addAfterBroadcast.size() != 0) {
                for (int i7 = 0; i7 < this.addAfterBroadcast.size(); i7++) {
                    int keyAt2 = this.addAfterBroadcast.keyAt(i7);
                    ArrayList<NotificationCenterDelegate> arrayList3 = this.addAfterBroadcast.get(keyAt2);
                    for (int i8 = 0; i8 < arrayList3.size(); i8++) {
                        addObserver(arrayList3.get(i8), keyAt2);
                    }
                }
                this.addAfterBroadcast.clear();
            }
        }
    }

    public void addObserver(NotificationCenterDelegate notificationCenterDelegate, int i) {
        if (BuildVars.DEBUG_VERSION && Thread.currentThread() != ApplicationLoader.applicationHandler.getLooper().getThread()) {
            throw new RuntimeException("addObserver allowed only from MAIN thread");
        }
        if (this.broadcasting != 0) {
            ArrayList<NotificationCenterDelegate> arrayList = this.addAfterBroadcast.get(i);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.addAfterBroadcast.put(i, arrayList);
            }
            arrayList.add(notificationCenterDelegate);
            return;
        }
        ArrayList<NotificationCenterDelegate> arrayList2 = this.observers.get(i);
        if (arrayList2 == null) {
            SparseArray<ArrayList<NotificationCenterDelegate>> sparseArray = this.observers;
            ArrayList<NotificationCenterDelegate> createArrayForId = createArrayForId(i);
            sparseArray.put(i, createArrayForId);
            arrayList2 = createArrayForId;
        }
        if (arrayList2.contains(notificationCenterDelegate)) {
            return;
        }
        arrayList2.add(notificationCenterDelegate);
        if (!BuildVars.DEBUG_VERSION || alreadyLogged || arrayList2.size() <= 1000) {
            return;
        }
        alreadyLogged = true;
        FileLog.e((Throwable) new RuntimeException("Total observers more than 1000, need check for memory leak. " + i), true);
    }

    private ArrayList<NotificationCenterDelegate> createArrayForId(int i) {
        if (i == didReplacedPhotoInMemCache || i == stopAllHeavyOperations || i == startAllHeavyOperations) {
            return new UniqArrayList();
        }
        return new ArrayList<>();
    }

    public void removeObserver(NotificationCenterDelegate notificationCenterDelegate, int i) {
        if (BuildVars.DEBUG_VERSION && Thread.currentThread() != ApplicationLoader.applicationHandler.getLooper().getThread()) {
            throw new RuntimeException("removeObserver allowed only from MAIN thread");
        }
        if (this.broadcasting != 0) {
            ArrayList<NotificationCenterDelegate> arrayList = this.removeAfterBroadcast.get(i);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.removeAfterBroadcast.put(i, arrayList);
            }
            arrayList.add(notificationCenterDelegate);
            return;
        }
        ArrayList<NotificationCenterDelegate> arrayList2 = this.observers.get(i);
        if (arrayList2 != null) {
            arrayList2.remove(notificationCenterDelegate);
        }
    }

    public boolean hasObservers(int i) {
        return this.observers.indexOfKey(i) >= 0;
    }

    public void addPostponeNotificationsCallback(PostponeNotificationCallback postponeNotificationCallback) {
        if (BuildVars.DEBUG_VERSION && Thread.currentThread() != ApplicationLoader.applicationHandler.getLooper().getThread()) {
            throw new RuntimeException("PostponeNotificationsCallback allowed only from MAIN thread");
        }
        if (this.postponeCallbackList.contains(postponeNotificationCallback)) {
            return;
        }
        this.postponeCallbackList.add(postponeNotificationCallback);
    }

    public void removePostponeNotificationsCallback(PostponeNotificationCallback postponeNotificationCallback) {
        if (BuildVars.DEBUG_VERSION && Thread.currentThread() != ApplicationLoader.applicationHandler.getLooper().getThread()) {
            throw new RuntimeException("removePostponeNotificationsCallback allowed only from MAIN thread");
        }
        if (this.postponeCallbackList.remove(postponeNotificationCallback)) {
            runDelayedNotifications();
        }
    }

    public void doOnIdle(Runnable runnable) {
        if (isAnimationInProgress()) {
            this.delayedRunnables.add(runnable);
        } else {
            runnable.run();
        }
    }

    public void removeDelayed(Runnable runnable) {
        this.delayedRunnables.remove(runnable);
    }

    public static class AllowedNotifications {
        int[] allowedIds;
        final long time;

        private AllowedNotifications() {
            this.time = SystemClock.elapsedRealtime();
        }
    }

    public static void listenEmojiLoading(final View view) {
        if (view == null) {
            return;
        }
        final NotificationCenterDelegate notificationCenterDelegate = new NotificationCenterDelegate() {
            @Override
            public final void didReceivedNotification(int i, int i2, Object[] objArr) {
                NotificationCenter.lambda$listenEmojiLoading$3(view, i, i2, objArr);
            }
        };
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            @Override
            public void onViewAttachedToWindow(View view2) {
                NotificationCenter.getGlobalInstance().addObserver(notificationCenterDelegate, NotificationCenter.emojiLoaded);
            }

            @Override
            public void onViewDetachedFromWindow(View view2) {
                NotificationCenter.getGlobalInstance().removeObserver(notificationCenterDelegate, NotificationCenter.emojiLoaded);
            }
        });
    }

    public static void lambda$listenEmojiLoading$3(View view, int i, int i2, Object[] objArr) {
        if (i == emojiLoaded && view != null && view.isAttachedToWindow()) {
            view.invalidate();
        }
    }

    public void listenOnce(final int i, final Runnable runnable) {
        final NotificationCenterDelegate[] notificationCenterDelegateArr = {new NotificationCenterDelegate() {
            @Override
            public final void didReceivedNotification(int i2, int i3, Object[] objArr) {
                NotificationCenter.this.lambda$listenOnce$4(i, notificationCenterDelegateArr, runnable, i2, i3, objArr);
            }
        }};
        addObserver(notificationCenterDelegateArr[0], i);
    }

    public void lambda$listenOnce$4(int i, NotificationCenterDelegate[] notificationCenterDelegateArr, Runnable runnable, int i2, int i3, Object[] objArr) {
        if (i2 != i || notificationCenterDelegateArr[0] == null) {
            return;
        }
        if (runnable != null) {
            runnable.run();
        }
        removeObserver(notificationCenterDelegateArr[0], i);
        notificationCenterDelegateArr[0] = null;
    }

    public class UniqArrayList<T> extends ArrayList<T> {
        HashSet<T> set;

        private UniqArrayList() {
            NotificationCenter.this = r1;
            this.set = new HashSet<>();
        }

        @Override
        public boolean add(T t) {
            if (this.set.add(t)) {
                return super.add(t);
            }
            return false;
        }

        @Override
        public void add(int i, T t) {
            if (this.set.add(t)) {
                super.add(i, t);
            }
        }

        @Override
        public boolean addAll(Collection<? extends T> collection) {
            boolean z = false;
            for (T t : collection) {
                if (add(t)) {
                    z = true;
                }
            }
            return z;
        }

        @Override
        public boolean addAll(int i, Collection<? extends T> collection) {
            throw new UnsupportedOperationException();
        }

        @Override
        public T remove(int i) {
            T t = (T) super.remove(i);
            if (t != null) {
                this.set.remove(t);
            }
            return t;
        }

        @Override
        public boolean remove(Object obj) {
            if (this.set.remove(obj)) {
                return super.remove(obj);
            }
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean contains(Object obj) {
            return this.set.contains(obj);
        }

        @Override
        public void clear() {
            this.set.clear();
            super.clear();
        }
    }
}
