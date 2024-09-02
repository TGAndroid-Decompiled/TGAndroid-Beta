package org.telegram.messenger;

import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.Utilities;

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
    public static final int articleClosed;
    public static final int attachMenuBotsDidLoad;
    public static final int audioDidSent;
    public static final int audioRecordTooShort;
    public static final int audioRouteChanged;
    public static final int availableEffectsUpdate;
    public static final int billingConfirmPurchaseError;
    public static final int billingProductDetailsUpdated;
    public static final int blockedUsersDidLoad;
    public static final int bookmarkAdded;
    public static final int boostByChannelCreated;
    public static final int boostedChannelByUser;
    public static final int botInfoDidLoad;
    public static final int botKeyboardDidLoad;
    public static final int botStarsTransactionsLoaded;
    public static final int botStarsUpdated;
    public static final int businessLinkCreated;
    public static final int businessLinksUpdated;
    public static final int businessMessagesUpdated;
    public static final int cameraInitied;
    public static final int changeRepliesCounter;
    public static final int channelRecommendationsLoaded;
    public static final int channelRightsUpdated;
    public static final int channelStarsUpdated;
    public static final int chatAvailableReactionsUpdated;
    public static final int chatDidCreated;
    public static final int chatDidFailCreate;
    public static final int chatInfoCantLoad;
    public static final int chatInfoDidLoad;
    public static final int chatOnlineCountDidLoad;
    public static final int chatSearchResultsAvailable;
    public static final int chatSearchResultsLoading;
    public static final int chatSwithcedToForum;
    public static final int chatWasBoostedByUser;
    public static final int chatlistFolderUpdate;
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
    public static final int customStickerCreated;
    public static final int customTypefacesLoaded;
    public static final int dialogDeleted;
    public static final int dialogFiltersUpdated;
    public static final int dialogIsTranslatable;
    public static final int dialogPhotosLoaded;
    public static final int dialogPhotosUpdate;
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
    public static final int didStartedMultiGiftsSelector;
    public static final int didUpdateConnectionState;
    public static final int didUpdateExtendedMedia;
    public static final int didUpdateGlobalAutoDeleteTimer;
    public static final int didUpdateMessagesViews;
    public static final int didUpdatePollResults;
    public static final int didUpdatePremiumGiftFieldIcon;
    public static final int didUpdatePremiumGiftStickers;
    public static final int didUpdateReactions;
    public static final int didVerifyMessagesStickers;
    public static final int emojiKeywordsLoaded;
    public static final int emojiLoaded;
    public static final int emojiPreviewThemesChanged;
    public static final int encryptedChatCreated;
    public static final int encryptedChatUpdated;
    public static final int factCheckLoaded;
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
    public static final int giftsToUserSent;
    private static volatile NotificationCenter globalInstance = null;
    public static final int goingToPreviewTheme;
    public static final int groupCallScreencastStateChanged;
    public static final int groupCallSpeakingUsersUpdated;
    public static final int groupCallTypingsUpdated;
    public static final int groupCallUpdated;
    public static final int groupCallVisibilityChanged;
    public static final int groupPackUpdated;
    public static final int groupRestrictionsUnlockedByBoosts;
    public static final int groupStickersDidLoad;
    public static final int hasNewContactsToImport;
    public static final int hashtagSearchUpdated;
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
    public static final int messageReceivedByServer2;
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
    public static final int nearEarEvent;
    public static final int needAddArchivedStickers;
    public static final int needCheckSystemBarColors;
    public static final int needDeleteBusinessLink;
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
    public static final int onDatabaseReset;
    public static final int onDownloadingFilesChanged;
    public static final int onEmojiInteractionsReceived;
    public static final int onReceivedChannelDifference;
    public static final int onRequestPermissionResultReceived;
    public static final int onUserRingtonesUpdated;
    public static final int openArticle;
    public static final int openBoostForUsersDialog;
    public static final int openedChatChanged;
    public static final int passcodeDismissed;
    public static final int paymentFinished;
    public static final int peerSettingsDidLoad;
    public static final int permissionsGranted;
    public static final int pinnedInfoDidLoad;
    public static final int playerDidStartPlaying;
    public static final int premiumFloodWaitReceived;
    public static final int premiumPromoUpdated;
    public static final int premiumStatusChangedGlobal;
    public static final int premiumStickersPreviewLoaded;
    public static final int privacyRulesUpdated;
    public static final int proxyChangedByRotation;
    public static final int proxyCheckDone;
    public static final int proxySettingsChanged;
    public static final int pushMessagesUpdated;
    public static final int quickRepliesDeleted;
    public static final int quickRepliesUpdated;
    public static final int reactionsDidLoad;
    public static final int recentDocumentsDidLoad;
    public static final int recentEmojiStatusesUpdate;
    public static final int recordPaused;
    public static final int recordProgressChanged;
    public static final int recordResumed;
    public static final int recordStartError;
    public static final int recordStarted;
    public static final int recordStopped;
    public static final int reloadDialogPhotos;
    public static final int reloadHints;
    public static final int reloadInlineHints;
    public static final int reloadInterface;
    public static final int reloadWebappsHints;
    public static final int removeAllMessagesFromDialog;
    public static final int replaceMessagesObjects;
    public static final int replyMessagesDidLoad;
    public static final int requestPermissions;
    public static final int savedMessagesDialogsUpdate;
    public static final int savedMessagesForwarded;
    public static final int savedReactionTagsUpdate;
    public static final int scheduledMessagesUpdated;
    public static final int screenStateChanged;
    public static final int screenshotTook;
    public static final int sendingMessagesChanged;
    public static final int showBulletin;
    public static final int smsJobStatusUpdate;
    public static final int starBalanceUpdated;
    public static final int starGiftOptionsLoaded;
    public static final int starOptionsLoaded;
    public static final int starReactionAnonymousUpdate;
    public static final int starSubscriptionsLoaded;
    public static final int starTransactionsLoaded;
    public static final int startAllHeavyOperations;
    public static final int startSpoilers;
    public static final int stealthModeChanged;
    public static final int stickersDidLoad;
    public static final int stickersImportComplete;
    public static final int stickersImportProgressChanged;
    public static final int stopAllHeavyOperations;
    public static final int stopSpoilers;
    public static final int storiesBlocklistUpdate;
    public static final int storiesDraftsUpdated;
    public static final int storiesEnabledUpdate;
    public static final int storiesLimitUpdate;
    public static final int storiesListUpdated;
    public static final int storiesReadUpdated;
    public static final int storiesSendAsUpdate;
    public static final int storiesUpdated;
    public static final int storyQualityUpdate;
    public static final int suggestedFiltersLoaded;
    public static final int suggestedLangpack;
    public static final int themeAccentListUpdated;
    public static final int themeListUpdated;
    public static final int themeUploadError;
    public static final int themeUploadedToServer;
    public static final int threadMessagesRead;
    public static final int timezonesUpdated;
    public static final int topicsDidLoaded;
    private static int totalEvents = 1;
    public static final int twoStepPasswordChanged;
    public static final int unconfirmedAuthUpdate;
    public static final int updateAllMessages;
    public static final int updateBotMenuButton;
    public static final int updateDefaultSendAsPeer;
    public static final int updateInterfaces;
    public static final int updateMentionsCount;
    public static final int updateMessageMedia;
    public static final int updateSearchSettings;
    public static final int updateTranscriptionLock;
    public static final int uploadStoryEnd;
    public static final int uploadStoryProgress;
    public static final int userEmojiStatusUpdated;
    public static final int userInfoDidLoad;
    public static final int userIsPremiumBlockedUpadted;
    public static final int videoLoadingStateChanged;
    public static final int voiceTranscriptionUpdate;
    public static final int voipServiceCreated;
    public static final int walletPendingTransactionsChanged;
    public static final int walletSyncProgressChanged;
    public static final int wallpaperSettedToUser;
    public static final int wallpapersDidLoad;
    public static final int wallpapersNeedReload;
    public static final int wasUnableToFindCurrentLocation;
    public static final int webRtcMicAmplitudeEvent;
    public static final int webRtcSpeakerAmplitudeEvent;
    public static final int webViewResolved;
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

    public static void lambda$listen$6() {
    }

    public static void lambda$listenGlobal$3() {
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
        messageReceivedByServer2 = i18;
        int i20 = i19 + 1;
        totalEvents = i20;
        messageSendError = i19;
        int i21 = i20 + 1;
        totalEvents = i21;
        forceImportContactsStart = i20;
        int i22 = i21 + 1;
        totalEvents = i22;
        contactsDidLoad = i21;
        int i23 = i22 + 1;
        totalEvents = i23;
        contactsImported = i22;
        int i24 = i23 + 1;
        totalEvents = i24;
        hasNewContactsToImport = i23;
        int i25 = i24 + 1;
        totalEvents = i25;
        chatDidCreated = i24;
        int i26 = i25 + 1;
        totalEvents = i26;
        chatDidFailCreate = i25;
        int i27 = i26 + 1;
        totalEvents = i27;
        chatInfoDidLoad = i26;
        int i28 = i27 + 1;
        totalEvents = i28;
        chatInfoCantLoad = i27;
        int i29 = i28 + 1;
        totalEvents = i29;
        mediaDidLoad = i28;
        int i30 = i29 + 1;
        totalEvents = i30;
        mediaCountDidLoad = i29;
        int i31 = i30 + 1;
        totalEvents = i31;
        mediaCountsDidLoad = i30;
        int i32 = i31 + 1;
        totalEvents = i32;
        encryptedChatUpdated = i31;
        int i33 = i32 + 1;
        totalEvents = i33;
        messagesReadEncrypted = i32;
        int i34 = i33 + 1;
        totalEvents = i34;
        encryptedChatCreated = i33;
        int i35 = i34 + 1;
        totalEvents = i35;
        dialogPhotosLoaded = i34;
        int i36 = i35 + 1;
        totalEvents = i36;
        reloadDialogPhotos = i35;
        int i37 = i36 + 1;
        totalEvents = i37;
        folderBecomeEmpty = i36;
        int i38 = i37 + 1;
        totalEvents = i38;
        removeAllMessagesFromDialog = i37;
        int i39 = i38 + 1;
        totalEvents = i39;
        notificationsSettingsUpdated = i38;
        int i40 = i39 + 1;
        totalEvents = i40;
        blockedUsersDidLoad = i39;
        int i41 = i40 + 1;
        totalEvents = i41;
        openedChatChanged = i40;
        int i42 = i41 + 1;
        totalEvents = i42;
        didCreatedNewDeleteTask = i41;
        int i43 = i42 + 1;
        totalEvents = i43;
        mainUserInfoChanged = i42;
        int i44 = i43 + 1;
        totalEvents = i44;
        privacyRulesUpdated = i43;
        int i45 = i44 + 1;
        totalEvents = i45;
        updateMessageMedia = i44;
        int i46 = i45 + 1;
        totalEvents = i46;
        replaceMessagesObjects = i45;
        int i47 = i46 + 1;
        totalEvents = i47;
        didSetPasscode = i46;
        int i48 = i47 + 1;
        totalEvents = i48;
        passcodeDismissed = i47;
        int i49 = i48 + 1;
        totalEvents = i49;
        twoStepPasswordChanged = i48;
        int i50 = i49 + 1;
        totalEvents = i50;
        didSetOrRemoveTwoStepPassword = i49;
        int i51 = i50 + 1;
        totalEvents = i51;
        didRemoveTwoStepPassword = i50;
        int i52 = i51 + 1;
        totalEvents = i52;
        replyMessagesDidLoad = i51;
        int i53 = i52 + 1;
        totalEvents = i53;
        didLoadPinnedMessages = i52;
        int i54 = i53 + 1;
        totalEvents = i54;
        newSessionReceived = i53;
        int i55 = i54 + 1;
        totalEvents = i55;
        didReceivedWebpages = i54;
        int i56 = i55 + 1;
        totalEvents = i56;
        didReceivedWebpagesInUpdates = i55;
        int i57 = i56 + 1;
        totalEvents = i57;
        stickersDidLoad = i56;
        int i58 = i57 + 1;
        totalEvents = i58;
        diceStickersDidLoad = i57;
        int i59 = i58 + 1;
        totalEvents = i59;
        featuredStickersDidLoad = i58;
        int i60 = i59 + 1;
        totalEvents = i60;
        featuredEmojiDidLoad = i59;
        int i61 = i60 + 1;
        totalEvents = i61;
        groupStickersDidLoad = i60;
        int i62 = i61 + 1;
        totalEvents = i62;
        messagesReadContent = i61;
        int i63 = i62 + 1;
        totalEvents = i63;
        botInfoDidLoad = i62;
        int i64 = i63 + 1;
        totalEvents = i64;
        userInfoDidLoad = i63;
        int i65 = i64 + 1;
        totalEvents = i65;
        pinnedInfoDidLoad = i64;
        int i66 = i65 + 1;
        totalEvents = i66;
        botKeyboardDidLoad = i65;
        int i67 = i66 + 1;
        totalEvents = i67;
        chatSearchResultsAvailable = i66;
        int i68 = i67 + 1;
        totalEvents = i68;
        hashtagSearchUpdated = i67;
        int i69 = i68 + 1;
        totalEvents = i69;
        chatSearchResultsLoading = i68;
        int i70 = i69 + 1;
        totalEvents = i70;
        musicDidLoad = i69;
        int i71 = i70 + 1;
        totalEvents = i71;
        moreMusicDidLoad = i70;
        int i72 = i71 + 1;
        totalEvents = i72;
        needShowAlert = i71;
        int i73 = i72 + 1;
        totalEvents = i73;
        needShowPlayServicesAlert = i72;
        int i74 = i73 + 1;
        totalEvents = i74;
        didUpdateMessagesViews = i73;
        int i75 = i74 + 1;
        totalEvents = i75;
        needReloadRecentDialogsSearch = i74;
        int i76 = i75 + 1;
        totalEvents = i76;
        peerSettingsDidLoad = i75;
        int i77 = i76 + 1;
        totalEvents = i77;
        wasUnableToFindCurrentLocation = i76;
        int i78 = i77 + 1;
        totalEvents = i78;
        reloadHints = i77;
        int i79 = i78 + 1;
        totalEvents = i79;
        reloadInlineHints = i78;
        int i80 = i79 + 1;
        totalEvents = i80;
        reloadWebappsHints = i79;
        int i81 = i80 + 1;
        totalEvents = i81;
        newDraftReceived = i80;
        int i82 = i81 + 1;
        totalEvents = i82;
        recentDocumentsDidLoad = i81;
        int i83 = i82 + 1;
        totalEvents = i83;
        needAddArchivedStickers = i82;
        int i84 = i83 + 1;
        totalEvents = i84;
        archivedStickersCountDidLoad = i83;
        int i85 = i84 + 1;
        totalEvents = i85;
        paymentFinished = i84;
        int i86 = i85 + 1;
        totalEvents = i86;
        channelRightsUpdated = i85;
        int i87 = i86 + 1;
        totalEvents = i87;
        openArticle = i86;
        int i88 = i87 + 1;
        totalEvents = i88;
        articleClosed = i87;
        int i89 = i88 + 1;
        totalEvents = i89;
        updateMentionsCount = i88;
        int i90 = i89 + 1;
        totalEvents = i90;
        didUpdatePollResults = i89;
        int i91 = i90 + 1;
        totalEvents = i91;
        chatOnlineCountDidLoad = i90;
        int i92 = i91 + 1;
        totalEvents = i92;
        videoLoadingStateChanged = i91;
        int i93 = i92 + 1;
        totalEvents = i93;
        newPeopleNearbyAvailable = i92;
        int i94 = i93 + 1;
        totalEvents = i94;
        stopAllHeavyOperations = i93;
        int i95 = i94 + 1;
        totalEvents = i95;
        startAllHeavyOperations = i94;
        int i96 = i95 + 1;
        totalEvents = i96;
        stopSpoilers = i95;
        int i97 = i96 + 1;
        totalEvents = i97;
        startSpoilers = i96;
        int i98 = i97 + 1;
        totalEvents = i98;
        sendingMessagesChanged = i97;
        int i99 = i98 + 1;
        totalEvents = i99;
        didUpdateReactions = i98;
        int i100 = i99 + 1;
        totalEvents = i100;
        didUpdateExtendedMedia = i99;
        int i101 = i100 + 1;
        totalEvents = i101;
        didVerifyMessagesStickers = i100;
        int i102 = i101 + 1;
        totalEvents = i102;
        scheduledMessagesUpdated = i101;
        int i103 = i102 + 1;
        totalEvents = i103;
        newSuggestionsAvailable = i102;
        int i104 = i103 + 1;
        totalEvents = i104;
        didLoadChatInviter = i103;
        int i105 = i104 + 1;
        totalEvents = i105;
        didLoadChatAdmins = i104;
        int i106 = i105 + 1;
        totalEvents = i106;
        historyImportProgressChanged = i105;
        int i107 = i106 + 1;
        totalEvents = i107;
        stickersImportProgressChanged = i106;
        int i108 = i107 + 1;
        totalEvents = i108;
        stickersImportComplete = i107;
        int i109 = i108 + 1;
        totalEvents = i109;
        dialogDeleted = i108;
        int i110 = i109 + 1;
        totalEvents = i110;
        webViewResultSent = i109;
        int i111 = i110 + 1;
        totalEvents = i111;
        voiceTranscriptionUpdate = i110;
        int i112 = i111 + 1;
        totalEvents = i112;
        animatedEmojiDocumentLoaded = i111;
        int i113 = i112 + 1;
        totalEvents = i113;
        recentEmojiStatusesUpdate = i112;
        int i114 = i113 + 1;
        totalEvents = i114;
        updateSearchSettings = i113;
        int i115 = i114 + 1;
        totalEvents = i115;
        updateTranscriptionLock = i114;
        int i116 = i115 + 1;
        totalEvents = i116;
        businessMessagesUpdated = i115;
        int i117 = i116 + 1;
        totalEvents = i117;
        quickRepliesUpdated = i116;
        int i118 = i117 + 1;
        totalEvents = i118;
        quickRepliesDeleted = i117;
        int i119 = i118 + 1;
        totalEvents = i119;
        bookmarkAdded = i118;
        int i120 = i119 + 1;
        totalEvents = i120;
        starReactionAnonymousUpdate = i119;
        int i121 = i120 + 1;
        totalEvents = i121;
        businessLinksUpdated = i120;
        int i122 = i121 + 1;
        totalEvents = i122;
        businessLinkCreated = i121;
        int i123 = i122 + 1;
        totalEvents = i123;
        needDeleteBusinessLink = i122;
        int i124 = i123 + 1;
        totalEvents = i124;
        messageTranslated = i123;
        int i125 = i124 + 1;
        totalEvents = i125;
        messageTranslating = i124;
        int i126 = i125 + 1;
        totalEvents = i126;
        dialogIsTranslatable = i125;
        int i127 = i126 + 1;
        totalEvents = i127;
        dialogTranslate = i126;
        int i128 = i127 + 1;
        totalEvents = i128;
        didGenerateFingerprintKeyPair = i127;
        int i129 = i128 + 1;
        totalEvents = i129;
        walletPendingTransactionsChanged = i128;
        int i130 = i129 + 1;
        totalEvents = i130;
        walletSyncProgressChanged = i129;
        int i131 = i130 + 1;
        totalEvents = i131;
        httpFileDidLoad = i130;
        int i132 = i131 + 1;
        totalEvents = i132;
        httpFileDidFailedLoad = i131;
        int i133 = i132 + 1;
        totalEvents = i133;
        didUpdateConnectionState = i132;
        int i134 = i133 + 1;
        totalEvents = i134;
        fileUploaded = i133;
        int i135 = i134 + 1;
        totalEvents = i135;
        fileUploadFailed = i134;
        int i136 = i135 + 1;
        totalEvents = i136;
        fileUploadProgressChanged = i135;
        int i137 = i136 + 1;
        totalEvents = i137;
        fileLoadProgressChanged = i136;
        int i138 = i137 + 1;
        totalEvents = i138;
        fileLoaded = i137;
        int i139 = i138 + 1;
        totalEvents = i139;
        fileLoadFailed = i138;
        int i140 = i139 + 1;
        totalEvents = i140;
        filePreparingStarted = i139;
        int i141 = i140 + 1;
        totalEvents = i141;
        fileNewChunkAvailable = i140;
        int i142 = i141 + 1;
        totalEvents = i142;
        filePreparingFailed = i141;
        int i143 = i142 + 1;
        totalEvents = i143;
        dialogsUnreadCounterChanged = i142;
        int i144 = i143 + 1;
        totalEvents = i144;
        messagePlayingProgressDidChanged = i143;
        int i145 = i144 + 1;
        totalEvents = i145;
        messagePlayingDidReset = i144;
        int i146 = i145 + 1;
        totalEvents = i146;
        messagePlayingPlayStateChanged = i145;
        int i147 = i146 + 1;
        totalEvents = i147;
        messagePlayingDidStart = i146;
        int i148 = i147 + 1;
        totalEvents = i148;
        messagePlayingDidSeek = i147;
        int i149 = i148 + 1;
        totalEvents = i149;
        messagePlayingGoingToStop = i148;
        int i150 = i149 + 1;
        totalEvents = i150;
        recordProgressChanged = i149;
        int i151 = i150 + 1;
        totalEvents = i151;
        recordStarted = i150;
        int i152 = i151 + 1;
        totalEvents = i152;
        recordStartError = i151;
        int i153 = i152 + 1;
        totalEvents = i153;
        recordStopped = i152;
        int i154 = i153 + 1;
        totalEvents = i154;
        recordPaused = i153;
        int i155 = i154 + 1;
        totalEvents = i155;
        recordResumed = i154;
        int i156 = i155 + 1;
        totalEvents = i156;
        screenshotTook = i155;
        int i157 = i156 + 1;
        totalEvents = i157;
        albumsDidLoad = i156;
        int i158 = i157 + 1;
        totalEvents = i158;
        audioDidSent = i157;
        int i159 = i158 + 1;
        totalEvents = i159;
        audioRecordTooShort = i158;
        int i160 = i159 + 1;
        totalEvents = i160;
        audioRouteChanged = i159;
        int i161 = i160 + 1;
        totalEvents = i161;
        didStartedCall = i160;
        int i162 = i161 + 1;
        totalEvents = i162;
        groupCallUpdated = i161;
        int i163 = i162 + 1;
        totalEvents = i163;
        groupCallSpeakingUsersUpdated = i162;
        int i164 = i163 + 1;
        totalEvents = i164;
        groupCallScreencastStateChanged = i163;
        int i165 = i164 + 1;
        totalEvents = i165;
        activeGroupCallsUpdated = i164;
        int i166 = i165 + 1;
        totalEvents = i166;
        applyGroupCallVisibleParticipants = i165;
        int i167 = i166 + 1;
        totalEvents = i167;
        groupCallTypingsUpdated = i166;
        int i168 = i167 + 1;
        totalEvents = i168;
        didEndCall = i167;
        int i169 = i168 + 1;
        totalEvents = i169;
        closeInCallActivity = i168;
        int i170 = i169 + 1;
        totalEvents = i170;
        groupCallVisibilityChanged = i169;
        int i171 = i170 + 1;
        totalEvents = i171;
        appDidLogout = i170;
        int i172 = i171 + 1;
        totalEvents = i172;
        configLoaded = i171;
        int i173 = i172 + 1;
        totalEvents = i173;
        needDeleteDialog = i172;
        int i174 = i173 + 1;
        totalEvents = i174;
        newEmojiSuggestionsAvailable = i173;
        int i175 = i174 + 1;
        totalEvents = i175;
        themeUploadedToServer = i174;
        int i176 = i175 + 1;
        totalEvents = i176;
        themeUploadError = i175;
        int i177 = i176 + 1;
        totalEvents = i177;
        dialogFiltersUpdated = i176;
        int i178 = i177 + 1;
        totalEvents = i178;
        filterSettingsUpdated = i177;
        int i179 = i178 + 1;
        totalEvents = i179;
        suggestedFiltersLoaded = i178;
        int i180 = i179 + 1;
        totalEvents = i180;
        updateBotMenuButton = i179;
        int i181 = i180 + 1;
        totalEvents = i181;
        giftsToUserSent = i180;
        int i182 = i181 + 1;
        totalEvents = i182;
        didStartedMultiGiftsSelector = i181;
        int i183 = i182 + 1;
        totalEvents = i183;
        boostedChannelByUser = i182;
        int i184 = i183 + 1;
        totalEvents = i184;
        boostByChannelCreated = i183;
        int i185 = i184 + 1;
        totalEvents = i185;
        didUpdatePremiumGiftStickers = i184;
        int i186 = i185 + 1;
        totalEvents = i186;
        didUpdatePremiumGiftFieldIcon = i185;
        int i187 = i186 + 1;
        totalEvents = i187;
        storiesEnabledUpdate = i186;
        int i188 = i187 + 1;
        totalEvents = i188;
        storiesBlocklistUpdate = i187;
        int i189 = i188 + 1;
        totalEvents = i189;
        storiesLimitUpdate = i188;
        int i190 = i189 + 1;
        totalEvents = i190;
        storiesSendAsUpdate = i189;
        int i191 = i190 + 1;
        totalEvents = i191;
        unconfirmedAuthUpdate = i190;
        int i192 = i191 + 1;
        totalEvents = i192;
        dialogPhotosUpdate = i191;
        int i193 = i192 + 1;
        totalEvents = i193;
        channelRecommendationsLoaded = i192;
        int i194 = i193 + 1;
        totalEvents = i194;
        savedMessagesDialogsUpdate = i193;
        int i195 = i194 + 1;
        totalEvents = i195;
        savedReactionTagsUpdate = i194;
        int i196 = i195 + 1;
        totalEvents = i196;
        userIsPremiumBlockedUpadted = i195;
        int i197 = i196 + 1;
        totalEvents = i197;
        savedMessagesForwarded = i196;
        int i198 = i197 + 1;
        totalEvents = i198;
        emojiKeywordsLoaded = i197;
        int i199 = i198 + 1;
        totalEvents = i199;
        smsJobStatusUpdate = i198;
        int i200 = i199 + 1;
        totalEvents = i200;
        storyQualityUpdate = i199;
        int i201 = i200 + 1;
        totalEvents = i201;
        openBoostForUsersDialog = i200;
        int i202 = i201 + 1;
        totalEvents = i202;
        groupRestrictionsUnlockedByBoosts = i201;
        int i203 = i202 + 1;
        totalEvents = i203;
        chatWasBoostedByUser = i202;
        int i204 = i203 + 1;
        totalEvents = i204;
        groupPackUpdated = i203;
        int i205 = i204 + 1;
        totalEvents = i205;
        timezonesUpdated = i204;
        int i206 = i205 + 1;
        totalEvents = i206;
        customStickerCreated = i205;
        int i207 = i206 + 1;
        totalEvents = i207;
        premiumFloodWaitReceived = i206;
        int i208 = i207 + 1;
        totalEvents = i208;
        availableEffectsUpdate = i207;
        int i209 = i208 + 1;
        totalEvents = i209;
        starOptionsLoaded = i208;
        int i210 = i209 + 1;
        totalEvents = i210;
        starGiftOptionsLoaded = i209;
        int i211 = i210 + 1;
        totalEvents = i211;
        starBalanceUpdated = i210;
        int i212 = i211 + 1;
        totalEvents = i212;
        starTransactionsLoaded = i211;
        int i213 = i212 + 1;
        totalEvents = i213;
        starSubscriptionsLoaded = i212;
        int i214 = i213 + 1;
        totalEvents = i214;
        factCheckLoaded = i213;
        int i215 = i214 + 1;
        totalEvents = i215;
        botStarsUpdated = i214;
        int i216 = i215 + 1;
        totalEvents = i216;
        botStarsTransactionsLoaded = i215;
        int i217 = i216 + 1;
        totalEvents = i217;
        channelStarsUpdated = i216;
        int i218 = i217 + 1;
        totalEvents = i218;
        webViewResolved = i217;
        int i219 = i218 + 1;
        totalEvents = i219;
        updateAllMessages = i218;
        int i220 = i219 + 1;
        totalEvents = i220;
        pushMessagesUpdated = i219;
        int i221 = i220 + 1;
        totalEvents = i221;
        wallpapersDidLoad = i220;
        int i222 = i221 + 1;
        totalEvents = i222;
        wallpapersNeedReload = i221;
        int i223 = i222 + 1;
        totalEvents = i223;
        didReceiveSmsCode = i222;
        int i224 = i223 + 1;
        totalEvents = i224;
        didReceiveCall = i223;
        int i225 = i224 + 1;
        totalEvents = i225;
        emojiLoaded = i224;
        int i226 = i225 + 1;
        totalEvents = i226;
        invalidateMotionBackground = i225;
        int i227 = i226 + 1;
        totalEvents = i227;
        closeOtherAppActivities = i226;
        int i228 = i227 + 1;
        totalEvents = i228;
        cameraInitied = i227;
        int i229 = i228 + 1;
        totalEvents = i229;
        didReplacedPhotoInMemCache = i228;
        int i230 = i229 + 1;
        totalEvents = i230;
        didSetNewTheme = i229;
        int i231 = i230 + 1;
        totalEvents = i231;
        themeListUpdated = i230;
        int i232 = i231 + 1;
        totalEvents = i232;
        didApplyNewTheme = i231;
        int i233 = i232 + 1;
        totalEvents = i233;
        themeAccentListUpdated = i232;
        int i234 = i233 + 1;
        totalEvents = i234;
        needCheckSystemBarColors = i233;
        int i235 = i234 + 1;
        totalEvents = i235;
        needShareTheme = i234;
        int i236 = i235 + 1;
        totalEvents = i236;
        needSetDayNightTheme = i235;
        int i237 = i236 + 1;
        totalEvents = i237;
        goingToPreviewTheme = i236;
        int i238 = i237 + 1;
        totalEvents = i238;
        locationPermissionGranted = i237;
        int i239 = i238 + 1;
        totalEvents = i239;
        locationPermissionDenied = i238;
        int i240 = i239 + 1;
        totalEvents = i240;
        reloadInterface = i239;
        int i241 = i240 + 1;
        totalEvents = i241;
        suggestedLangpack = i240;
        int i242 = i241 + 1;
        totalEvents = i242;
        didSetNewWallpapper = i241;
        int i243 = i242 + 1;
        totalEvents = i243;
        proxySettingsChanged = i242;
        int i244 = i243 + 1;
        totalEvents = i244;
        proxyCheckDone = i243;
        int i245 = i244 + 1;
        totalEvents = i245;
        proxyChangedByRotation = i244;
        int i246 = i245 + 1;
        totalEvents = i246;
        liveLocationsChanged = i245;
        int i247 = i246 + 1;
        totalEvents = i247;
        newLocationAvailable = i246;
        int i248 = i247 + 1;
        totalEvents = i248;
        liveLocationsCacheChanged = i247;
        int i249 = i248 + 1;
        totalEvents = i249;
        notificationsCountUpdated = i248;
        int i250 = i249 + 1;
        totalEvents = i250;
        playerDidStartPlaying = i249;
        int i251 = i250 + 1;
        totalEvents = i251;
        closeSearchByActiveAction = i250;
        int i252 = i251 + 1;
        totalEvents = i252;
        messagePlayingSpeedChanged = i251;
        int i253 = i252 + 1;
        totalEvents = i253;
        screenStateChanged = i252;
        int i254 = i253 + 1;
        totalEvents = i254;
        didClearDatabase = i253;
        int i255 = i254 + 1;
        totalEvents = i255;
        voipServiceCreated = i254;
        int i256 = i255 + 1;
        totalEvents = i256;
        webRtcMicAmplitudeEvent = i255;
        int i257 = i256 + 1;
        totalEvents = i257;
        webRtcSpeakerAmplitudeEvent = i256;
        int i258 = i257 + 1;
        totalEvents = i258;
        showBulletin = i257;
        int i259 = i258 + 1;
        totalEvents = i259;
        appUpdateAvailable = i258;
        int i260 = i259 + 1;
        totalEvents = i260;
        onDatabaseMigration = i259;
        int i261 = i260 + 1;
        totalEvents = i261;
        onEmojiInteractionsReceived = i260;
        int i262 = i261 + 1;
        totalEvents = i262;
        emojiPreviewThemesChanged = i261;
        int i263 = i262 + 1;
        totalEvents = i263;
        reactionsDidLoad = i262;
        int i264 = i263 + 1;
        totalEvents = i264;
        attachMenuBotsDidLoad = i263;
        int i265 = i264 + 1;
        totalEvents = i265;
        chatAvailableReactionsUpdated = i264;
        int i266 = i265 + 1;
        totalEvents = i266;
        dialogsUnreadReactionsCounterChanged = i265;
        int i267 = i266 + 1;
        totalEvents = i267;
        onDatabaseOpened = i266;
        int i268 = i267 + 1;
        totalEvents = i268;
        onDownloadingFilesChanged = i267;
        int i269 = i268 + 1;
        totalEvents = i269;
        onActivityResultReceived = i268;
        int i270 = i269 + 1;
        totalEvents = i270;
        onRequestPermissionResultReceived = i269;
        int i271 = i270 + 1;
        totalEvents = i271;
        onUserRingtonesUpdated = i270;
        int i272 = i271 + 1;
        totalEvents = i272;
        currentUserPremiumStatusChanged = i271;
        int i273 = i272 + 1;
        totalEvents = i273;
        premiumPromoUpdated = i272;
        int i274 = i273 + 1;
        totalEvents = i274;
        premiumStatusChangedGlobal = i273;
        int i275 = i274 + 1;
        totalEvents = i275;
        currentUserShowLimitReachedDialog = i274;
        int i276 = i275 + 1;
        totalEvents = i276;
        billingProductDetailsUpdated = i275;
        int i277 = i276 + 1;
        totalEvents = i277;
        billingConfirmPurchaseError = i276;
        int i278 = i277 + 1;
        totalEvents = i278;
        premiumStickersPreviewLoaded = i277;
        int i279 = i278 + 1;
        totalEvents = i279;
        userEmojiStatusUpdated = i278;
        int i280 = i279 + 1;
        totalEvents = i280;
        requestPermissions = i279;
        int i281 = i280 + 1;
        totalEvents = i281;
        permissionsGranted = i280;
        int i282 = i281 + 1;
        totalEvents = i282;
        topicsDidLoaded = i281;
        int i283 = i282 + 1;
        totalEvents = i283;
        chatSwithcedToForum = i282;
        int i284 = i283 + 1;
        totalEvents = i284;
        didUpdateGlobalAutoDeleteTimer = i283;
        int i285 = i284 + 1;
        totalEvents = i285;
        onDatabaseReset = i284;
        int i286 = i285 + 1;
        totalEvents = i286;
        wallpaperSettedToUser = i285;
        int i287 = i286 + 1;
        totalEvents = i287;
        storiesUpdated = i286;
        int i288 = i287 + 1;
        totalEvents = i288;
        storiesListUpdated = i287;
        int i289 = i288 + 1;
        totalEvents = i289;
        storiesDraftsUpdated = i288;
        int i290 = i289 + 1;
        totalEvents = i290;
        chatlistFolderUpdate = i289;
        int i291 = i290 + 1;
        totalEvents = i291;
        uploadStoryProgress = i290;
        int i292 = i291 + 1;
        totalEvents = i292;
        uploadStoryEnd = i291;
        int i293 = i292 + 1;
        totalEvents = i293;
        customTypefacesLoaded = i292;
        int i294 = i293 + 1;
        totalEvents = i294;
        stealthModeChanged = i293;
        int i295 = i294 + 1;
        totalEvents = i295;
        onReceivedChannelDifference = i294;
        int i296 = i295 + 1;
        totalEvents = i296;
        storiesReadUpdated = i295;
        totalEvents = i296 + 1;
        nearEarEvent = i296;
    }

    public static class DelayedPost {
        private Object[] args;
        private int id;

        DelayedPost(int i, Object[] objArr, AnonymousClass1 anonymousClass1) {
            this(i, objArr);
        }

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
            getGlobalInstance().lambda$postNotificationNameOnUIThread$1(stopAllHeavyOperations, 512);
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
            NotificationCenter$$ExternalSyntheticLambda2 notificationCenter$$ExternalSyntheticLambda2 = new NotificationCenter$$ExternalSyntheticLambda2(this);
            this.checkForExpiredNotifications = notificationCenter$$ExternalSyntheticLambda2;
            AndroidUtilities.runOnUIThread(notificationCenter$$ExternalSyntheticLambda2, 5017L);
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
            }, Math.max(17L, 5017 - (elapsedRealtime - j)));
        }
    }

    public void lambda$checkForExpiredNotifications$0() {
        this.checkForExpiredNotifications = new NotificationCenter$$ExternalSyntheticLambda2(this);
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
                    getGlobalInstance().lambda$postNotificationNameOnUIThread$1(startAllHeavyOperations, 512);
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
        boolean z = i == startAllHeavyOperations || i == stopAllHeavyOperations || i == didReplacedPhotoInMemCache || i == closeChats || i == invalidateMotionBackground || i == needCheckSystemBarColors;
        ArrayList arrayList = null;
        if (!z && this.allowedNotifications.size() > 0) {
            int size = this.allowedNotifications.size();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i2 = 0;
            for (int i3 = 0; i3 < this.allowedNotifications.size(); i3++) {
                AllowedNotifications valueAt = this.allowedNotifications.valueAt(i3);
                if (elapsedRealtime - valueAt.time > 5017) {
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
                    }
                    if (iArr[i4] == i) {
                        i2++;
                        break;
                    }
                    i4++;
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

        AllowedNotifications(AnonymousClass1 anonymousClass1) {
            this();
        }

        private AllowedNotifications() {
            this.time = SystemClock.elapsedRealtime();
        }
    }

    public Runnable listenGlobal(final View view, final int i, final Utilities.Callback<Object[]> callback) {
        if (view == null || callback == null) {
            return new Runnable() {
                @Override
                public final void run() {
                    NotificationCenter.lambda$listenGlobal$3();
                }
            };
        }
        final NotificationCenterDelegate notificationCenterDelegate = new NotificationCenterDelegate() {
            @Override
            public final void didReceivedNotification(int i2, int i3, Object[] objArr) {
                NotificationCenter.lambda$listenGlobal$4(i, callback, i2, i3, objArr);
            }
        };
        final AnonymousClass1 anonymousClass1 = new View.OnAttachStateChangeListener() {
            final NotificationCenterDelegate val$delegate;
            final int val$id;

            AnonymousClass1(final NotificationCenterDelegate notificationCenterDelegate2, final int i2) {
                r2 = notificationCenterDelegate2;
                r3 = i2;
            }

            @Override
            public void onViewAttachedToWindow(View view2) {
                NotificationCenter.getGlobalInstance().addObserver(r2, r3);
            }

            @Override
            public void onViewDetachedFromWindow(View view2) {
                NotificationCenter.getGlobalInstance().removeObserver(r2, r3);
            }
        };
        view.addOnAttachStateChangeListener(anonymousClass1);
        return new Runnable() {
            @Override
            public final void run() {
                NotificationCenter.lambda$listenGlobal$5(view, anonymousClass1, notificationCenterDelegate2, i2);
            }
        };
    }

    public static void lambda$listenGlobal$4(int i, Utilities.Callback callback, int i2, int i3, Object[] objArr) {
        if (i2 == i) {
            callback.run(objArr);
        }
    }

    public class AnonymousClass1 implements View.OnAttachStateChangeListener {
        final NotificationCenterDelegate val$delegate;
        final int val$id;

        AnonymousClass1(final NotificationCenterDelegate notificationCenterDelegate2, final int i2) {
            r2 = notificationCenterDelegate2;
            r3 = i2;
        }

        @Override
        public void onViewAttachedToWindow(View view2) {
            NotificationCenter.getGlobalInstance().addObserver(r2, r3);
        }

        @Override
        public void onViewDetachedFromWindow(View view2) {
            NotificationCenter.getGlobalInstance().removeObserver(r2, r3);
        }
    }

    public static void lambda$listenGlobal$5(View view, View.OnAttachStateChangeListener onAttachStateChangeListener, NotificationCenterDelegate notificationCenterDelegate, int i) {
        view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        getGlobalInstance().removeObserver(notificationCenterDelegate, i);
    }

    public Runnable listen(final View view, final int i, final Utilities.Callback<Object[]> callback) {
        if (view == null || callback == null) {
            return new Runnable() {
                @Override
                public final void run() {
                    NotificationCenter.lambda$listen$6();
                }
            };
        }
        final NotificationCenterDelegate notificationCenterDelegate = new NotificationCenterDelegate() {
            @Override
            public final void didReceivedNotification(int i2, int i3, Object[] objArr) {
                NotificationCenter.lambda$listen$7(i, callback, i2, i3, objArr);
            }
        };
        final AnonymousClass2 anonymousClass2 = new View.OnAttachStateChangeListener() {
            final NotificationCenterDelegate val$delegate;
            final int val$id;

            AnonymousClass2(final NotificationCenterDelegate notificationCenterDelegate2, final int i2) {
                r2 = notificationCenterDelegate2;
                r3 = i2;
            }

            @Override
            public void onViewAttachedToWindow(View view2) {
                NotificationCenter.this.addObserver(r2, r3);
            }

            @Override
            public void onViewDetachedFromWindow(View view2) {
                NotificationCenter.this.removeObserver(r2, r3);
            }
        };
        view.addOnAttachStateChangeListener(anonymousClass2);
        return new Runnable() {
            @Override
            public final void run() {
                NotificationCenter.this.lambda$listen$8(view, anonymousClass2, notificationCenterDelegate2, i2);
            }
        };
    }

    public static void lambda$listen$7(int i, Utilities.Callback callback, int i2, int i3, Object[] objArr) {
        if (i2 == i) {
            callback.run(objArr);
        }
    }

    public class AnonymousClass2 implements View.OnAttachStateChangeListener {
        final NotificationCenterDelegate val$delegate;
        final int val$id;

        AnonymousClass2(final NotificationCenterDelegate notificationCenterDelegate2, final int i2) {
            r2 = notificationCenterDelegate2;
            r3 = i2;
        }

        @Override
        public void onViewAttachedToWindow(View view2) {
            NotificationCenter.this.addObserver(r2, r3);
        }

        @Override
        public void onViewDetachedFromWindow(View view2) {
            NotificationCenter.this.removeObserver(r2, r3);
        }
    }

    public void lambda$listen$8(View view, View.OnAttachStateChangeListener onAttachStateChangeListener, NotificationCenterDelegate notificationCenterDelegate, int i) {
        view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        removeObserver(notificationCenterDelegate, i);
    }

    public static void listenEmojiLoading(final View view) {
        getGlobalInstance().listenGlobal(view, emojiLoaded, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                view.invalidate();
            }
        });
    }

    public void listenOnce(final int i, final Runnable runnable) {
        final NotificationCenterDelegate[] notificationCenterDelegateArr = {new NotificationCenterDelegate() {
            @Override
            public final void didReceivedNotification(int i2, int i3, Object[] objArr) {
                NotificationCenter.this.lambda$listenOnce$10(i, notificationCenterDelegateArr, runnable, i2, i3, objArr);
            }
        }};
        addObserver(notificationCenterDelegateArr[0], i);
    }

    public void lambda$listenOnce$10(int i, NotificationCenterDelegate[] notificationCenterDelegateArr, Runnable runnable, int i2, int i3, Object[] objArr) {
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
            this.set = new HashSet<>();
        }

        UniqArrayList(NotificationCenter notificationCenter, AnonymousClass1 anonymousClass1) {
            this();
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
            Iterator<? extends T> it = collection.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (add(it.next())) {
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
