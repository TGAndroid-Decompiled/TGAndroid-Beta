package org.telegram.messenger;

import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
public class NotificationCenter {
    private static final long EXPIRE_NOTIFICATIONS_TIME = 5017;
    private static volatile NotificationCenter[] Instance = new NotificationCenter[4];
    public static final int activeAccountChanged;
    public static final int activeAuctionsUpdated;
    public static final int activeGroupCallsUpdated;
    public static final int activityPermissionsGranted;
    public static final int adminedChannelsLoaded;
    public static final int albumsDidLoad;
    public static boolean alreadyLogged = false;
    public static final int animatedEmojiDocumentLoaded;
    public static final int appConfigUpdated;
    public static final int appDidLogout;
    public static final int appUpdateAvailable;
    public static final int appUpdateLoading;
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
    public static final int botDownloadsUpdate;
    public static final int botForumDraftDelete;
    public static final int botForumDraftUpdate;
    public static final int botForumTopicDidCreate;
    public static final int botInfoDidLoad;
    public static final int botKeyboardDidLoad;
    public static final int botStarsTransactionsLoaded;
    public static final int botStarsUpdated;
    public static final int businessLinkCreated;
    public static final int businessLinksUpdated;
    public static final int businessMessagesUpdated;
    public static final int callTabsVisibleToggled;
    public static final int cameraInitied;
    public static final int changeRepliesCounter;
    public static final int channelConnectedBotsUpdate;
    public static final int channelRecommendationsLoaded;
    public static final int channelRightsUpdated;
    public static final int channelStarsUpdated;
    public static final int channelSuggestedBotsUpdate;
    public static final int chatAvailableReactionsUpdated;
    public static final int chatDidCreated;
    public static final int chatDidFailCreate;
    public static final int chatInfoCantLoad;
    public static final int chatInfoDidLoad;
    public static final int chatOnlineCountDidLoad;
    public static final int chatSearchResultsAvailable;
    public static final int chatSearchResultsLoading;
    public static final int chatSwitchedForum;
    public static final int chatWasBoostedByUser;
    public static final int chatlistFolderUpdate;
    public static final int closeChatActivity;
    public static final int closeChats;
    public static final int closeInCallActivity;
    public static final int closeOtherAppActivities;
    public static final int closeProfileActivity;
    public static final int closeSearchByActiveAction;
    public static final int commentsRead;
    public static final int commonChatsLoaded;
    public static final int communityPendingRequestsUpdate;
    public static final int communitySwitchedCollapsed;
    public static final int conferenceEmojiUpdated;
    public static final int configLoaded;
    public static final int contactsDidLoad;
    public static final int contactsImported;
    public static final int contactsPermissionBadgeCheck;
    public static final int contentSettingsLoaded;
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
    public static final int dialogsUnreadPollVotesCounterChanged;
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
    public static final int didUpdateTonGiftStickers;
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
    private static volatile NotificationCenter globalInstance;
    public static final int goingToPreviewTheme;
    public static final int groupCallScreencastStateChanged;
    public static final int groupCallSpeakingUsersUpdated;
    public static final int groupCallTypingsUpdated;
    public static final int groupCallUpdated;
    public static final int groupCallVisibilityChanged;
    public static final int groupPackUpdated;
    public static final int groupRestrictionsUnlockedByBoosts;
    public static final int groupStickersDidLoad;
    public static final int guardBotDecisionResult;
    public static final int hasNewContactsToImport;
    public static final int hashtagSearchUpdated;
    public static final int historyCleared;
    public static final int historyImportProgressChanged;
    public static final int httpFileDidFailedLoad;
    public static final int httpFileDidLoad;
    public static final int invalidateMotionBackground;
    public static final int joinedGroup;
    public static final int liveLocationsCacheChanged;
    public static final int liveLocationsChanged;
    public static final int liveStoryMessageUpdate;
    public static final int liveStoryUpdated;
    public static final int loadedAiComposeTones;
    public static final int loadingMessagesFailed;
    public static final int locationPermissionDenied;
    public static final int locationPermissionGranted;
    public static final int mainUserInfoChanged;
    public static final int mediaCountDidLoad;
    public static final int mediaCountsDidLoad;
    public static final int mediaDidLoad;
    public static final int memoryLeakFoundException;
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
    public static final int messagesFeeUpdated;
    public static final int messagesRead;
    public static final int messagesReadContent;
    public static final int messagesReadEncrypted;
    public static final int monoForumMessagesRead;
    public static final int moreMusicDidLoad;
    public static final int musicDidLoad;
    public static final int musicIdsLoaded;
    public static final int musicListLoaded;
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
    public static final int profileMusicUpdated;
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
    public static final int reloadGuestBotHints;
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
    public static final int starGiftSoldOut;
    public static final int starGiftsLoaded;
    public static final int starGiveawayOptionsLoaded;
    public static final int starOptionsLoaded;
    public static final int starReactionAnonymousUpdate;
    public static final int starSubscriptionsLoaded;
    public static final int starTransactionsLoaded;
    public static final int starUserGiftCollectionsLoaded;
    public static final int starUserGiftsLoaded;
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
    public static final int storyAlbumsCollectionsUpdate;
    public static final int storyDeleted;
    public static final int storyGroupCallUpdated;
    public static final int storyQualityUpdate;
    public static final int suggestedFiltersLoaded;
    public static final int suggestedLangpack;
    public static final int themeAccentListUpdated;
    public static final int themeListUpdated;
    public static final int themeUploadError;
    public static final int themeUploadedToServer;
    public static final int threadMessagesRead;
    public static final int timezonesUpdated;
    public static final int tlSchemeParseException;
    public static final int topicsDidLoaded;
    private static int totalEvents;
    public static final int translationModelDownloaded;
    public static final int translationModelDownloading;
    public static final int twoStepPasswordChanged;
    public static final int unconfirmedAuthUpdate;
    public static final int updateAllMessages;
    public static final int updateBotMenuButton;
    public static final int updateDefaultSendAsPeer;
    public static final int updateInterfaces;
    public static final int updateMentionsCount;
    public static final int updateMessageMedia;
    public static final int updateSearchSettings;
    public static final int updateStories;
    public static final int updateTranscriptionLock;
    public static final int updatedChatRanks;
    public static final int updatedChatbot;
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
    public static final int webBrowserSettingsUpdate;
    public static final int webRtcMicAmplitudeEvent;
    public static final int webRtcSpeakerAmplitudeEvent;
    public static final int webViewResultSent;
    private int animationInProgressCount;
    private Runnable checkForExpiredNotifications;
    private int currentAccount;
    private int currentHeavyOperationFlags;
    private final SparseArray<ArrayList<NotificationCenterDelegate>> observers = new SparseArray<>();
    private final SparseArray<ArrayList<NotificationCenterDelegate>> removeAfterBroadcast = new SparseArray<>();
    private final SparseArray<ArrayList<NotificationCenterDelegate>> addAfterBroadcast = new SparseArray<>();
    private final ArrayList<DelayedPost> delayedPosts = new ArrayList<>(10);
    private final ArrayList<Runnable> delayedRunnables = new ArrayList<>(10);
    private final ArrayList<Runnable> delayedRunnablesTmp = new ArrayList<>(10);
    private final ArrayList<DelayedPost> delayedPostsTmp = new ArrayList<>(10);
    private final ArrayList<PostponeNotificationCallback> postponeCallbackList = new ArrayList<>(10);
    private int broadcasting = 0;
    private int animationInProgressPointer = 1;
    HashSet<Integer> heavyOperationsCounter = new HashSet<>();
    private final SparseArray<AllowedNotifications> allowedNotifications = new SparseArray<>();
    SparseArray<Runnable> alreadyPostedRunnubles = new SparseArray<>();

    public static class AllowedNotifications {
        int[] allowedIds;
        final long time;

        private AllowedNotifications() {
            this.time = SystemClock.elapsedRealtime();
        }
    }

    public static class DelayedPost {
        private Object[] args;
        private int f19652id;

        private DelayedPost(int i9, Object[] objArr) {
            this.f19652id = i9;
            this.args = objArr;
        }
    }

    public interface NotificationCenterDelegate {
        void didReceivedNotification(int i9, int i10, Object... objArr);
    }

    public static class ObserversGroup {
        private NotificationCenterDelegate delegate;
        private NotificationCenter notificationCenter;
        private final ArrayList<Observer> observers;

        public static class Observer {
            private final int f19653id;
            private final NotificationCenterDelegate observer;

            private Observer(NotificationCenterDelegate notificationCenterDelegate, int i9) {
                this.observer = notificationCenterDelegate;
                this.f19653id = i9;
            }
        }

        public ObserversGroup add(int i9) {
            this.notificationCenter.addObserver(this.delegate, i9);
            this.observers.add(new Observer(this.delegate, i9));
            return this;
        }

        public void removeAllObservers() {
            ArrayList<Observer> arrayList = this.observers;
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Observer observer = arrayList.get(i9);
                i9++;
                Observer observer2 = observer;
                this.notificationCenter.removeObserver(observer2.observer, observer2.f19653id);
            }
            this.observers.clear();
            this.notificationCenter = null;
            this.delegate = null;
        }

        private ObserversGroup(NotificationCenter notificationCenter, NotificationCenterDelegate notificationCenterDelegate) {
            this.observers = new ArrayList<>();
            this.notificationCenter = notificationCenter;
            this.delegate = notificationCenterDelegate;
        }
    }

    public interface PostponeNotificationCallback {
        boolean needPostpone(int i9, int i10, Object[] objArr);
    }

    static {
        int i9 = 1 + 1;
        updateInterfaces = i9;
        dialogsNeedReload = i9 + 1;
        closeChats = i9 + 2;
        closeChatActivity = i9 + 3;
        closeProfileActivity = i9 + 4;
        messagesDeleted = i9 + 5;
        historyCleared = i9 + 6;
        messagesRead = i9 + 7;
        threadMessagesRead = i9 + 8;
        monoForumMessagesRead = i9 + 9;
        commentsRead = i9 + 10;
        changeRepliesCounter = i9 + 11;
        messagesDidLoad = i9 + 12;
        didLoadSponsoredMessages = i9 + 13;
        didLoadSendAsPeers = i9 + 14;
        updateDefaultSendAsPeer = i9 + 15;
        messagesDidLoadWithoutProcess = i9 + 16;
        loadingMessagesFailed = i9 + 17;
        messageReceivedByAck = i9 + 18;
        messageReceivedByServer = i9 + 19;
        messageReceivedByServer2 = i9 + 20;
        messageSendError = i9 + 21;
        forceImportContactsStart = i9 + 22;
        contactsDidLoad = i9 + 23;
        contactsImported = i9 + 24;
        hasNewContactsToImport = i9 + 25;
        chatDidCreated = i9 + 26;
        chatDidFailCreate = i9 + 27;
        chatInfoDidLoad = i9 + 28;
        chatInfoCantLoad = i9 + 29;
        mediaDidLoad = i9 + 30;
        mediaCountDidLoad = i9 + 31;
        mediaCountsDidLoad = i9 + 32;
        encryptedChatUpdated = i9 + 33;
        messagesReadEncrypted = i9 + 34;
        encryptedChatCreated = i9 + 35;
        dialogPhotosLoaded = i9 + 36;
        reloadDialogPhotos = i9 + 37;
        folderBecomeEmpty = i9 + 38;
        removeAllMessagesFromDialog = i9 + 39;
        notificationsSettingsUpdated = i9 + 40;
        blockedUsersDidLoad = i9 + 41;
        openedChatChanged = i9 + 42;
        didCreatedNewDeleteTask = i9 + 43;
        mainUserInfoChanged = i9 + 44;
        privacyRulesUpdated = i9 + 45;
        updateMessageMedia = i9 + 46;
        replaceMessagesObjects = i9 + 47;
        didSetPasscode = i9 + 48;
        passcodeDismissed = i9 + 49;
        twoStepPasswordChanged = i9 + 50;
        didSetOrRemoveTwoStepPassword = i9 + 51;
        didRemoveTwoStepPassword = i9 + 52;
        replyMessagesDidLoad = i9 + 53;
        didLoadPinnedMessages = i9 + 54;
        newSessionReceived = i9 + 55;
        didReceivedWebpages = i9 + 56;
        didReceivedWebpagesInUpdates = i9 + 57;
        stickersDidLoad = i9 + 58;
        diceStickersDidLoad = i9 + 59;
        featuredStickersDidLoad = i9 + 60;
        featuredEmojiDidLoad = i9 + 61;
        groupStickersDidLoad = i9 + 62;
        messagesReadContent = i9 + 63;
        botInfoDidLoad = i9 + 64;
        userInfoDidLoad = i9 + 65;
        pinnedInfoDidLoad = i9 + 66;
        botKeyboardDidLoad = i9 + 67;
        chatSearchResultsAvailable = i9 + 68;
        hashtagSearchUpdated = i9 + 69;
        chatSearchResultsLoading = i9 + 70;
        musicDidLoad = i9 + 71;
        moreMusicDidLoad = i9 + 72;
        needShowAlert = i9 + 73;
        needShowPlayServicesAlert = i9 + 74;
        didUpdateMessagesViews = i9 + 75;
        needReloadRecentDialogsSearch = i9 + 76;
        peerSettingsDidLoad = i9 + 77;
        wasUnableToFindCurrentLocation = i9 + 78;
        reloadHints = i9 + 79;
        reloadInlineHints = i9 + 80;
        reloadGuestBotHints = i9 + 81;
        reloadWebappsHints = i9 + 82;
        newDraftReceived = i9 + 83;
        recentDocumentsDidLoad = i9 + 84;
        needAddArchivedStickers = i9 + 85;
        archivedStickersCountDidLoad = i9 + 86;
        paymentFinished = i9 + 87;
        channelRightsUpdated = i9 + 88;
        openArticle = i9 + 89;
        articleClosed = i9 + 90;
        updateMentionsCount = i9 + 91;
        didUpdatePollResults = i9 + 92;
        chatOnlineCountDidLoad = i9 + 93;
        videoLoadingStateChanged = i9 + 94;
        newPeopleNearbyAvailable = i9 + 95;
        stopAllHeavyOperations = i9 + 96;
        startAllHeavyOperations = i9 + 97;
        stopSpoilers = i9 + 98;
        startSpoilers = i9 + 99;
        sendingMessagesChanged = i9 + 100;
        didUpdateReactions = i9 + 101;
        didUpdateExtendedMedia = i9 + 102;
        didVerifyMessagesStickers = i9 + 103;
        scheduledMessagesUpdated = i9 + 104;
        newSuggestionsAvailable = i9 + 105;
        didLoadChatInviter = i9 + 106;
        didLoadChatAdmins = i9 + 107;
        historyImportProgressChanged = i9 + 108;
        stickersImportProgressChanged = i9 + 109;
        stickersImportComplete = i9 + 110;
        dialogDeleted = i9 + 111;
        webViewResultSent = i9 + 112;
        voiceTranscriptionUpdate = i9 + 113;
        animatedEmojiDocumentLoaded = i9 + 114;
        recentEmojiStatusesUpdate = i9 + 115;
        updateSearchSettings = i9 + 116;
        updateTranscriptionLock = i9 + 117;
        businessMessagesUpdated = i9 + 118;
        quickRepliesUpdated = i9 + 119;
        quickRepliesDeleted = i9 + 120;
        bookmarkAdded = i9 + 121;
        starReactionAnonymousUpdate = i9 + 122;
        businessLinksUpdated = i9 + 123;
        businessLinkCreated = i9 + 124;
        needDeleteBusinessLink = i9 + 125;
        messageTranslated = i9 + 126;
        messageTranslating = i9 + 127;
        dialogIsTranslatable = i9 + 128;
        dialogTranslate = i9 + 129;
        didGenerateFingerprintKeyPair = i9 + 130;
        walletPendingTransactionsChanged = i9 + 131;
        walletSyncProgressChanged = i9 + 132;
        httpFileDidLoad = i9 + 133;
        httpFileDidFailedLoad = i9 + 134;
        didUpdateConnectionState = i9 + 135;
        fileUploaded = i9 + 136;
        fileUploadFailed = i9 + 137;
        fileUploadProgressChanged = i9 + 138;
        fileLoadProgressChanged = i9 + 139;
        fileLoaded = i9 + 140;
        fileLoadFailed = i9 + 141;
        filePreparingStarted = i9 + 142;
        fileNewChunkAvailable = i9 + 143;
        filePreparingFailed = i9 + 144;
        dialogsUnreadCounterChanged = i9 + 145;
        messagePlayingProgressDidChanged = i9 + 146;
        messagePlayingDidReset = i9 + 147;
        messagePlayingPlayStateChanged = i9 + 148;
        messagePlayingDidStart = i9 + 149;
        messagePlayingDidSeek = i9 + 150;
        messagePlayingGoingToStop = i9 + 151;
        recordProgressChanged = i9 + 152;
        recordStarted = i9 + 153;
        recordStartError = i9 + 154;
        recordStopped = i9 + 155;
        recordPaused = i9 + 156;
        recordResumed = i9 + 157;
        screenshotTook = i9 + 158;
        albumsDidLoad = i9 + 159;
        audioDidSent = i9 + 160;
        audioRecordTooShort = i9 + 161;
        audioRouteChanged = i9 + 162;
        didStartedCall = i9 + 163;
        groupCallUpdated = i9 + 164;
        storyGroupCallUpdated = i9 + 165;
        groupCallSpeakingUsersUpdated = i9 + 166;
        groupCallScreencastStateChanged = i9 + 167;
        activeGroupCallsUpdated = i9 + 168;
        applyGroupCallVisibleParticipants = i9 + 169;
        groupCallTypingsUpdated = i9 + 170;
        didEndCall = i9 + 171;
        closeInCallActivity = i9 + 172;
        groupCallVisibilityChanged = i9 + 173;
        liveStoryUpdated = i9 + 174;
        liveStoryMessageUpdate = i9 + 175;
        appDidLogout = i9 + 176;
        configLoaded = i9 + 177;
        needDeleteDialog = i9 + 178;
        newEmojiSuggestionsAvailable = i9 + 179;
        themeUploadedToServer = i9 + 180;
        themeUploadError = i9 + 181;
        dialogFiltersUpdated = i9 + 182;
        filterSettingsUpdated = i9 + 183;
        suggestedFiltersLoaded = i9 + 184;
        updateBotMenuButton = i9 + 185;
        giftsToUserSent = i9 + 186;
        didStartedMultiGiftsSelector = i9 + 187;
        boostedChannelByUser = i9 + 188;
        boostByChannelCreated = i9 + 189;
        didUpdatePremiumGiftStickers = i9 + 190;
        didUpdateTonGiftStickers = i9 + 191;
        didUpdatePremiumGiftFieldIcon = i9 + 192;
        storiesEnabledUpdate = i9 + 193;
        storiesBlocklistUpdate = i9 + 194;
        storiesLimitUpdate = i9 + 195;
        storiesSendAsUpdate = i9 + 196;
        unconfirmedAuthUpdate = i9 + 197;
        dialogPhotosUpdate = i9 + 198;
        channelRecommendationsLoaded = i9 + 199;
        savedMessagesDialogsUpdate = i9 + 200;
        savedReactionTagsUpdate = i9 + 201;
        userIsPremiumBlockedUpadted = i9 + 202;
        storyAlbumsCollectionsUpdate = i9 + 203;
        savedMessagesForwarded = i9 + 204;
        emojiKeywordsLoaded = i9 + 205;
        smsJobStatusUpdate = i9 + 206;
        storyQualityUpdate = i9 + 207;
        openBoostForUsersDialog = i9 + 208;
        groupRestrictionsUnlockedByBoosts = i9 + 209;
        chatWasBoostedByUser = i9 + 210;
        groupPackUpdated = i9 + 211;
        timezonesUpdated = i9 + 212;
        customStickerCreated = i9 + 213;
        premiumFloodWaitReceived = i9 + 214;
        availableEffectsUpdate = i9 + 215;
        starOptionsLoaded = i9 + 216;
        starGiftOptionsLoaded = i9 + 217;
        starGiveawayOptionsLoaded = i9 + 218;
        starBalanceUpdated = i9 + 219;
        starTransactionsLoaded = i9 + 220;
        starSubscriptionsLoaded = i9 + 221;
        factCheckLoaded = i9 + 222;
        botStarsUpdated = i9 + 223;
        botStarsTransactionsLoaded = i9 + 224;
        channelStarsUpdated = i9 + 225;
        updateAllMessages = i9 + 226;
        starGiftsLoaded = i9 + 227;
        starUserGiftsLoaded = i9 + 228;
        starUserGiftCollectionsLoaded = i9 + 229;
        starGiftSoldOut = i9 + 230;
        updateStories = i9 + 231;
        botDownloadsUpdate = i9 + 232;
        channelSuggestedBotsUpdate = i9 + 233;
        channelConnectedBotsUpdate = i9 + 234;
        adminedChannelsLoaded = i9 + 235;
        messagesFeeUpdated = i9 + 236;
        commonChatsLoaded = i9 + 237;
        appConfigUpdated = i9 + 238;
        activeAuctionsUpdated = i9 + 239;
        conferenceEmojiUpdated = i9 + 240;
        contentSettingsLoaded = i9 + 241;
        musicListLoaded = i9 + 242;
        musicIdsLoaded = i9 + 243;
        profileMusicUpdated = i9 + 244;
        updatedChatRanks = i9 + 245;
        joinedGroup = i9 + 246;
        loadedAiComposeTones = i9 + 247;
        updatedChatbot = i9 + 248;
        activeAccountChanged = i9 + 249;
        pushMessagesUpdated = i9 + 250;
        wallpapersDidLoad = i9 + 251;
        wallpapersNeedReload = i9 + 252;
        didReceiveSmsCode = i9 + 253;
        didReceiveCall = i9 + 254;
        emojiLoaded = i9 + 255;
        invalidateMotionBackground = i9 + 256;
        closeOtherAppActivities = i9 + 257;
        cameraInitied = i9 + 258;
        didReplacedPhotoInMemCache = i9 + 259;
        didSetNewTheme = i9 + 260;
        themeListUpdated = i9 + 261;
        didApplyNewTheme = i9 + 262;
        themeAccentListUpdated = i9 + 263;
        needCheckSystemBarColors = i9 + 264;
        needShareTheme = i9 + 265;
        needSetDayNightTheme = i9 + 266;
        goingToPreviewTheme = i9 + 267;
        locationPermissionGranted = i9 + 268;
        locationPermissionDenied = i9 + 269;
        reloadInterface = i9 + 270;
        suggestedLangpack = i9 + 271;
        didSetNewWallpapper = i9 + 272;
        proxySettingsChanged = i9 + 273;
        proxyCheckDone = i9 + 274;
        proxyChangedByRotation = i9 + 275;
        liveLocationsChanged = i9 + 276;
        newLocationAvailable = i9 + 277;
        liveLocationsCacheChanged = i9 + 278;
        notificationsCountUpdated = i9 + 279;
        playerDidStartPlaying = i9 + 280;
        closeSearchByActiveAction = i9 + 281;
        messagePlayingSpeedChanged = i9 + 282;
        screenStateChanged = i9 + 283;
        didClearDatabase = i9 + 284;
        voipServiceCreated = i9 + 285;
        webRtcMicAmplitudeEvent = i9 + 286;
        webRtcSpeakerAmplitudeEvent = i9 + 287;
        showBulletin = i9 + 288;
        appUpdateAvailable = i9 + 289;
        appUpdateLoading = i9 + 290;
        onDatabaseMigration = i9 + 291;
        onEmojiInteractionsReceived = i9 + 292;
        emojiPreviewThemesChanged = i9 + 293;
        reactionsDidLoad = i9 + 294;
        attachMenuBotsDidLoad = i9 + 295;
        chatAvailableReactionsUpdated = i9 + 296;
        dialogsUnreadReactionsCounterChanged = i9 + 297;
        dialogsUnreadPollVotesCounterChanged = i9 + 298;
        onDatabaseOpened = i9 + 299;
        onDownloadingFilesChanged = i9 + 300;
        onActivityResultReceived = i9 + 301;
        onRequestPermissionResultReceived = i9 + 302;
        onUserRingtonesUpdated = i9 + 303;
        currentUserPremiumStatusChanged = i9 + 304;
        premiumPromoUpdated = i9 + 305;
        premiumStatusChangedGlobal = i9 + 306;
        currentUserShowLimitReachedDialog = i9 + 307;
        billingProductDetailsUpdated = i9 + 308;
        billingConfirmPurchaseError = i9 + 309;
        premiumStickersPreviewLoaded = i9 + 310;
        userEmojiStatusUpdated = i9 + 311;
        requestPermissions = i9 + 312;
        permissionsGranted = i9 + 313;
        activityPermissionsGranted = i9 + 314;
        topicsDidLoaded = i9 + 315;
        chatSwitchedForum = i9 + 316;
        didUpdateGlobalAutoDeleteTimer = i9 + 317;
        onDatabaseReset = i9 + 318;
        wallpaperSettedToUser = i9 + 319;
        storiesUpdated = i9 + 320;
        storyDeleted = i9 + 321;
        storiesListUpdated = i9 + 322;
        storiesDraftsUpdated = i9 + 323;
        chatlistFolderUpdate = i9 + 324;
        uploadStoryProgress = i9 + 325;
        uploadStoryEnd = i9 + 326;
        customTypefacesLoaded = i9 + 327;
        stealthModeChanged = i9 + 328;
        onReceivedChannelDifference = i9 + 329;
        storiesReadUpdated = i9 + 330;
        nearEarEvent = i9 + 331;
        translationModelDownloading = i9 + 332;
        translationModelDownloaded = i9 + 333;
        botForumTopicDidCreate = i9 + 334;
        botForumDraftUpdate = i9 + 335;
        botForumDraftDelete = i9 + 336;
        tlSchemeParseException = i9 + 337;
        memoryLeakFoundException = i9 + 338;
        callTabsVisibleToggled = i9 + 339;
        contactsPermissionBadgeCheck = i9 + 340;
        guardBotDecisionResult = i9 + 341;
        webBrowserSettingsUpdate = i9 + 342;
        communityPendingRequestsUpdate = i9 + 343;
        totalEvents = i9 + 345;
        communitySwitchedCollapsed = i9 + 344;
    }

    public NotificationCenter(int i9) {
        this.currentAccount = i9;
    }

    public void checkForExpiredNotifications() {
        ArrayList arrayList = null;
        this.checkForExpiredNotifications = null;
        if (this.allowedNotifications.size() != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = Long.MAX_VALUE;
            for (int i9 = 0; i9 < this.allowedNotifications.size(); i9++) {
                long j11 = this.allowedNotifications.valueAt(i9).time;
                if (elapsedRealtime - j11 > 1000) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(Integer.valueOf(this.allowedNotifications.keyAt(i9)));
                } else {
                    j10 = Math.min(j11, j10);
                }
            }
            if (arrayList != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    onAnimationFinish(((Integer) arrayList.get(i10)).intValue());
                }
            }
            if (j10 != Long.MAX_VALUE) {
                AndroidUtilities.runOnUIThread(new pg(this, 0), Math.max(17L, 5017 - (elapsedRealtime - j10)));
            }
        }
    }

    private ArrayList<NotificationCenterDelegate> createArrayForId(int i9) {
        if (i9 != didReplacedPhotoInMemCache && i9 != stopAllHeavyOperations && i9 != startAllHeavyOperations) {
            return new ArrayList<>();
        }
        return new UniqArrayList();
    }

    public static void diffObserverDumps(SparseArray<Integer> sparseArray, SparseArray<Integer> sparseArray2) {
        for (int i9 = 0; i9 < sparseArray.size(); i9++) {
            int keyAt = sparseArray.keyAt(i9);
            int intValue = sparseArray.valueAt(i9).intValue();
            int intValue2 = sparseArray2.get(keyAt, -1).intValue();
            if (intValue2 == -1) {
                Log.i("ObserverDiff", "key=" + keyAt + " REMOVED (was " + intValue + ")");
            } else if (intValue != intValue2) {
                StringBuilder o6 = e2.c.o("key=", keyAt, " CHANGED: ", intValue, " -> ");
                o6.append(intValue2);
                Log.i("ObserverDiff", o6.toString());
            }
        }
        for (int i10 = 0; i10 < sparseArray2.size(); i10++) {
            int keyAt2 = sparseArray2.keyAt(i10);
            if (sparseArray.get(keyAt2, -1).intValue() == -1) {
                StringBuilder p6 = j3.r0.p(keyAt2, "key=", " ADDED (size=");
                p6.append(sparseArray2.valueAt(i10));
                p6.append(")");
                Log.i("ObserverDiff", p6.toString());
            }
        }
    }

    public static NotificationCenter getGlobalInstance() {
        NotificationCenter notificationCenter;
        NotificationCenter notificationCenter2 = globalInstance;
        if (notificationCenter2 == null) {
            synchronized (NotificationCenter.class) {
                try {
                    notificationCenter = globalInstance;
                    if (notificationCenter == null) {
                        notificationCenter = new NotificationCenter(-1);
                        globalInstance = notificationCenter;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return notificationCenter;
        }
        return notificationCenter2;
    }

    public static NotificationCenter getInstance(int i9) {
        NotificationCenter notificationCenter;
        NotificationCenter notificationCenter2 = Instance[i9];
        if (notificationCenter2 == null) {
            synchronized (NotificationCenter.class) {
                try {
                    notificationCenter = Instance[i9];
                    if (notificationCenter == null) {
                        NotificationCenter[] notificationCenterArr = Instance;
                        NotificationCenter notificationCenter3 = new NotificationCenter(i9);
                        notificationCenterArr[i9] = notificationCenter3;
                        notificationCenter = notificationCenter3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return notificationCenter;
        }
        return notificationCenter2;
    }

    public void lambda$checkForExpiredNotifications$0() {
        this.checkForExpiredNotifications = new pg(this, 1);
    }

    public static void lambda$listen$4(int i9, Utilities.Callback callback, int i10, int i11, Object[] objArr) {
        if (i10 == i9) {
            callback.run(objArr);
        }
    }

    public void lambda$listen$5(View view, View.OnAttachStateChangeListener onAttachStateChangeListener, NotificationCenterDelegate notificationCenterDelegate, int i9) {
        view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        removeObserver(notificationCenterDelegate, i9);
    }

    public void lambda$postNotificationDebounced$2(int i9, Object[] objArr, int i10) {
        postNotificationNameInternal(i9, false, objArr);
        this.alreadyPostedRunnubles.remove(i10);
    }

    public static void listenEmojiLoading(View view) {
        getGlobalInstance().listen(view, emojiLoaded, new a1(view, 2));
    }

    private void postNotificationDebounced(int i9, Object[] objArr) {
        int hashCode = i9 + (Arrays.hashCode(objArr) << 16);
        if (this.alreadyPostedRunnubles.indexOfKey(hashCode) >= 0) {
            return;
        }
        w4 w4Var = new w4(this, i9, objArr, hashCode, 8);
        this.alreadyPostedRunnubles.put(hashCode, w4Var);
        AndroidUtilities.runOnUIThread(w4Var, 250L);
    }

    private boolean shouldDebounce(int i9, Object[] objArr) {
        if (i9 == updateInterfaces) {
            return true;
        }
        return false;
    }

    public void addObserver(NotificationCenterDelegate notificationCenterDelegate, int i9) {
        if (BuildVars.DEBUG_VERSION && Thread.currentThread() != ApplicationLoader.applicationHandler.getLooper().getThread()) {
            throw new RuntimeException("addObserver allowed only from MAIN thread");
        }
        if (this.broadcasting != 0) {
            ArrayList<NotificationCenterDelegate> arrayList = this.addAfterBroadcast.get(i9);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.addAfterBroadcast.put(i9, arrayList);
            }
            arrayList.add(notificationCenterDelegate);
            return;
        }
        ArrayList<NotificationCenterDelegate> arrayList2 = this.observers.get(i9);
        if (arrayList2 == null) {
            SparseArray<ArrayList<NotificationCenterDelegate>> sparseArray = this.observers;
            ArrayList<NotificationCenterDelegate> createArrayForId = createArrayForId(i9);
            sparseArray.put(i9, createArrayForId);
            arrayList2 = createArrayForId;
        }
        if (!arrayList2.contains(notificationCenterDelegate)) {
            arrayList2.add(notificationCenterDelegate);
            if (BuildVars.DEBUG_VERSION && !alreadyLogged && arrayList2.size() > 1000) {
                alreadyLogged = true;
                FileLog.e((Throwable) new RuntimeException(j3.r0.l(i9, "Total observers more than 1000, need check for memory leak. ")), true);
            }
        }
    }

    public void addPostponeNotificationsCallback(PostponeNotificationCallback postponeNotificationCallback) {
        if (BuildVars.DEBUG_VERSION && Thread.currentThread() != ApplicationLoader.applicationHandler.getLooper().getThread()) {
            throw new RuntimeException("PostponeNotificationsCallback allowed only from MAIN thread");
        }
        if (!this.postponeCallbackList.contains(postponeNotificationCallback)) {
            this.postponeCallbackList.add(postponeNotificationCallback);
        }
    }

    public ObserversGroup createObserversGroup(NotificationCenterDelegate notificationCenterDelegate) {
        return new ObserversGroup(notificationCenterDelegate);
    }

    public void doOnIdle(Runnable runnable) {
        if (isAnimationInProgress()) {
            this.delayedRunnables.add(runnable);
        } else {
            runnable.run();
        }
    }

    public SparseArray<Integer> dumpObservers() {
        int i9;
        SparseArray<Integer> sparseArray = new SparseArray<>();
        for (int i10 = 0; i10 < this.observers.size(); i10++) {
            int keyAt = this.observers.keyAt(i10);
            ArrayList<NotificationCenterDelegate> valueAt = this.observers.valueAt(i10);
            if (valueAt != null) {
                i9 = valueAt.size();
            } else {
                i9 = 0;
            }
            sparseArray.put(keyAt, Integer.valueOf(i9));
        }
        return sparseArray;
    }

    public int getCurrentHeavyOperationFlags() {
        return this.currentHeavyOperationFlags;
    }

    public ArrayList<NotificationCenterDelegate> getObservers(int i9) {
        return this.observers.get(i9);
    }

    public int getObserversSize() {
        int i9 = 0;
        for (int i10 = 0; i10 < this.observers.size(); i10++) {
            ArrayList<NotificationCenterDelegate> valueAt = this.observers.valueAt(i10);
            if (valueAt != null) {
                i9 = valueAt.size() + i9;
            }
        }
        return i9;
    }

    public boolean hasObservers(int i9) {
        if (this.observers.indexOfKey(i9) >= 0) {
            return true;
        }
        return false;
    }

    public boolean isAnimationInProgress() {
        if (this.animationInProgressCount > 0) {
            return true;
        }
        return false;
    }

    public Runnable listen(View view, final int i9, final Utilities.Callback<Object[]> callback) {
        if (view != null && callback != null) {
            final NotificationCenterDelegate notificationCenterDelegate = new NotificationCenterDelegate() {
                @Override
                public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
                    NotificationCenter.lambda$listen$4(i9, callback, i10, i11, objArr);
                }
            };
            View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() {
                {
                    NotificationCenter.this = this;
                }

                @Override
                public void onViewAttachedToWindow(View view2) {
                    NotificationCenter.this.addObserver(notificationCenterDelegate, i9);
                }

                @Override
                public void onViewDetachedFromWindow(View view2) {
                    NotificationCenter.this.removeObserver(notificationCenterDelegate, i9);
                }
            };
            view.addOnAttachStateChangeListener(onAttachStateChangeListener);
            return new fh.g1(this, view, onAttachStateChangeListener, notificationCenterDelegate, i9, 11);
        }
        return new w1(16);
    }

    public void onAnimationFinish(int i9) {
        AllowedNotifications allowedNotifications = this.allowedNotifications.get(i9);
        this.allowedNotifications.delete(i9);
        if (allowedNotifications != null) {
            this.animationInProgressCount--;
            if (!this.heavyOperationsCounter.isEmpty()) {
                this.heavyOperationsCounter.remove(Integer.valueOf(i9));
                if (this.heavyOperationsCounter.isEmpty()) {
                    getGlobalInstance().lambda$postNotificationNameOnUIThread$1(startAllHeavyOperations, 512);
                }
            }
            if (this.animationInProgressCount == 0) {
                runDelayedNotifications();
            }
        }
        if (this.checkForExpiredNotifications != null && this.allowedNotifications.size() == 0) {
            AndroidUtilities.cancelRunOnUIThread(this.checkForExpiredNotifications);
            this.checkForExpiredNotifications = null;
        }
    }

    public void lambda$postNotificationNameOnUIThread$1(int i9, Object... objArr) {
        boolean z10;
        boolean z11 = true;
        if (i9 != startAllHeavyOperations && i9 != stopAllHeavyOperations && i9 != didReplacedPhotoInMemCache && i9 != closeChats && i9 != invalidateMotionBackground && i9 != needCheckSystemBarColors && i9 != messageReceivedByServer2) {
            z10 = false;
        } else {
            z10 = true;
        }
        ArrayList arrayList = null;
        if (!z10 && this.allowedNotifications.size() > 0) {
            int size = this.allowedNotifications.size();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i10 = 0;
            for (int i11 = 0; i11 < this.allowedNotifications.size(); i11++) {
                AllowedNotifications valueAt = this.allowedNotifications.valueAt(i11);
                if (elapsedRealtime - valueAt.time > 5017) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(Integer.valueOf(this.allowedNotifications.keyAt(i11)));
                }
                int[] iArr = valueAt.allowedIds;
                if (iArr == null) {
                    break;
                }
                int i12 = 0;
                while (true) {
                    if (i12 >= iArr.length) {
                        break;
                    } else if (iArr[i12] == i9) {
                        i10++;
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            if (size != i10) {
                z11 = false;
            }
            z10 = z11;
        }
        if (i9 == startAllHeavyOperations) {
            this.currentHeavyOperationFlags = (~((Integer) objArr[0]).intValue()) & this.currentHeavyOperationFlags;
        } else if (i9 == stopAllHeavyOperations) {
            this.currentHeavyOperationFlags = ((Integer) objArr[0]).intValue() | this.currentHeavyOperationFlags;
        }
        if (shouldDebounce(i9, objArr) && BuildVars.DEBUG_VERSION) {
            postNotificationDebounced(i9, objArr);
        } else {
            postNotificationNameInternal(i9, z10, objArr);
        }
        if (arrayList != null) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                onAnimationFinish(((Integer) arrayList.get(i13)).intValue());
            }
        }
    }

    public void postNotificationNameInternal(int i9, boolean z10, Object... objArr) {
        if (BuildVars.DEBUG_VERSION && Thread.currentThread() != ApplicationLoader.applicationHandler.getLooper().getThread()) {
            throw new RuntimeException("postNotificationName allowed only from MAIN thread");
        }
        if (!z10 && isAnimationInProgress()) {
            this.delayedPosts.add(new DelayedPost(i9, objArr));
            return;
        }
        if (!this.postponeCallbackList.isEmpty()) {
            for (int i10 = 0; i10 < this.postponeCallbackList.size(); i10++) {
                if (this.postponeCallbackList.get(i10).needPostpone(i9, this.currentAccount, objArr)) {
                    this.delayedPosts.add(new DelayedPost(i9, objArr));
                    return;
                }
            }
        }
        this.broadcasting++;
        ArrayList<NotificationCenterDelegate> arrayList = this.observers.get(i9);
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                arrayList.get(i11).didReceivedNotification(i9, this.currentAccount, objArr);
            }
        }
        int i12 = this.broadcasting - 1;
        this.broadcasting = i12;
        if (i12 == 0) {
            if (this.removeAfterBroadcast.size() != 0) {
                for (int i13 = 0; i13 < this.removeAfterBroadcast.size(); i13++) {
                    int keyAt = this.removeAfterBroadcast.keyAt(i13);
                    ArrayList<NotificationCenterDelegate> arrayList2 = this.removeAfterBroadcast.get(keyAt);
                    for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                        removeObserver(arrayList2.get(i14), keyAt);
                    }
                }
                this.removeAfterBroadcast.clear();
            }
            if (this.addAfterBroadcast.size() != 0) {
                for (int i15 = 0; i15 < this.addAfterBroadcast.size(); i15++) {
                    int keyAt2 = this.addAfterBroadcast.keyAt(i15);
                    ArrayList<NotificationCenterDelegate> arrayList3 = this.addAfterBroadcast.get(keyAt2);
                    for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                        addObserver(arrayList3.get(i16), keyAt2);
                    }
                }
                this.addAfterBroadcast.clear();
            }
        }
    }

    public void postNotificationNameOnUIThread(int i9, Object... objArr) {
        AndroidUtilities.runOnUIThread(new p4(this, i9, objArr, 19));
    }

    public void removeDelayed(Runnable runnable) {
        this.delayedRunnables.remove(runnable);
    }

    public void removeObserver(NotificationCenterDelegate notificationCenterDelegate, int i9) {
        if (BuildVars.DEBUG_VERSION && Thread.currentThread() != ApplicationLoader.applicationHandler.getLooper().getThread()) {
            throw new RuntimeException("removeObserver allowed only from MAIN thread");
        }
        if (this.broadcasting != 0) {
            ArrayList<NotificationCenterDelegate> arrayList = this.removeAfterBroadcast.get(i9);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.removeAfterBroadcast.put(i9, arrayList);
            }
            arrayList.add(notificationCenterDelegate);
            return;
        }
        ArrayList<NotificationCenterDelegate> arrayList2 = this.observers.get(i9);
        if (arrayList2 != null) {
            arrayList2.remove(notificationCenterDelegate);
        }
    }

    public void removePostponeNotificationsCallback(PostponeNotificationCallback postponeNotificationCallback) {
        if (BuildVars.DEBUG_VERSION && Thread.currentThread() != ApplicationLoader.applicationHandler.getLooper().getThread()) {
            throw new RuntimeException("removePostponeNotificationsCallback allowed only from MAIN thread");
        }
        if (this.postponeCallbackList.remove(postponeNotificationCallback)) {
            runDelayedNotifications();
        }
    }

    public void runDelayedNotifications() {
        if (!this.delayedPosts.isEmpty()) {
            this.delayedPostsTmp.clear();
            this.delayedPostsTmp.addAll(this.delayedPosts);
            this.delayedPosts.clear();
            for (int i9 = 0; i9 < this.delayedPostsTmp.size(); i9++) {
                DelayedPost delayedPost = this.delayedPostsTmp.get(i9);
                postNotificationNameInternal(delayedPost.f19652id, true, delayedPost.args);
            }
            this.delayedPostsTmp.clear();
        }
        if (!this.delayedRunnables.isEmpty()) {
            this.delayedRunnablesTmp.clear();
            this.delayedRunnablesTmp.addAll(this.delayedRunnables);
            this.delayedRunnables.clear();
            for (int i10 = 0; i10 < this.delayedRunnablesTmp.size(); i10++) {
                AndroidUtilities.runOnUIThread(this.delayedRunnablesTmp.get(i10));
            }
            this.delayedRunnablesTmp.clear();
        }
    }

    public int setAnimationInProgress(int i9, int[] iArr) {
        return setAnimationInProgress(i9, iArr, true);
    }

    public void updateAllowedNotifications(int i9, int[] iArr) {
        AllowedNotifications allowedNotifications = this.allowedNotifications.get(i9);
        if (allowedNotifications != null) {
            allowedNotifications.allowedIds = iArr;
        }
    }

    public void updateObserver(boolean z10, NotificationCenterDelegate notificationCenterDelegate, int i9) {
        if (z10) {
            addObserver(notificationCenterDelegate, i9);
        } else {
            removeObserver(notificationCenterDelegate, i9);
        }
    }

    public class UniqArrayList<T> extends ArrayList<T> {
        HashSet<T> set;

        private UniqArrayList() {
            NotificationCenter.this = r1;
            this.set = new HashSet<>();
        }

        @Override
        public boolean add(T t10) {
            if (this.set.add(t10)) {
                return super.add(t10);
            }
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends T> collection) {
            boolean z10 = false;
            for (T t10 : collection) {
                if (add(t10)) {
                    z10 = true;
                }
            }
            return z10;
        }

        @Override
        public void clear() {
            this.set.clear();
            super.clear();
        }

        @Override
        public boolean contains(Object obj) {
            return this.set.contains(obj);
        }

        @Override
        public T remove(int i9) {
            T t10 = (T) super.remove(i9);
            if (t10 != null) {
                this.set.remove(t10);
            }
            return t10;
        }

        @Override
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void add(int i9, T t10) {
            if (this.set.add(t10)) {
                super.add(i9, t10);
            }
        }

        @Override
        public boolean addAll(int i9, Collection<? extends T> collection) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean remove(Object obj) {
            if (this.set.remove(obj)) {
                return super.remove(obj);
            }
            return false;
        }
    }

    public int setAnimationInProgress(int i9, int[] iArr, boolean z10) {
        onAnimationFinish(i9);
        if (this.heavyOperationsCounter.isEmpty() && z10) {
            getGlobalInstance().lambda$postNotificationNameOnUIThread$1(stopAllHeavyOperations, 512);
        }
        this.animationInProgressCount++;
        int i10 = this.animationInProgressPointer + 1;
        this.animationInProgressPointer = i10;
        if (z10) {
            this.heavyOperationsCounter.add(Integer.valueOf(i10));
        }
        AllowedNotifications allowedNotifications = new AllowedNotifications();
        allowedNotifications.allowedIds = iArr;
        this.allowedNotifications.put(this.animationInProgressPointer, allowedNotifications);
        if (this.checkForExpiredNotifications == null) {
            pg pgVar = new pg(this, 1);
            this.checkForExpiredNotifications = pgVar;
            AndroidUtilities.runOnUIThread(pgVar, 5017L);
        }
        return this.animationInProgressPointer;
    }

    public static void lambda$listen$3() {
    }
}
