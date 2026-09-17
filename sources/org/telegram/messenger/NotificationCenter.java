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
        private int f17083id;

        private DelayedPost(int i10, Object[] objArr) {
            this.f17083id = i10;
            this.args = objArr;
        }
    }

    public interface NotificationCenterDelegate {
        void didReceivedNotification(int i10, int i11, Object... objArr);
    }

    public static class ObserversGroup {
        private NotificationCenterDelegate delegate;
        private NotificationCenter notificationCenter;
        private final ArrayList<Observer> observers;

        public static class Observer {
            private final int f17084id;
            private final NotificationCenterDelegate observer;

            private Observer(NotificationCenterDelegate notificationCenterDelegate, int i10) {
                this.observer = notificationCenterDelegate;
                this.f17084id = i10;
            }
        }

        public ObserversGroup add(int i10) {
            this.notificationCenter.addObserver(this.delegate, i10);
            this.observers.add(new Observer(this.delegate, i10));
            return this;
        }

        public void removeAllObservers() {
            ArrayList<Observer> arrayList = this.observers;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Observer observer = arrayList.get(i10);
                i10++;
                Observer observer2 = observer;
                this.notificationCenter.removeObserver(observer2.observer, observer2.f17084id);
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
        boolean needPostpone(int i10, int i11, Object[] objArr);
    }

    static {
        int i10 = 1 + 1;
        updateInterfaces = i10;
        dialogsNeedReload = i10 + 1;
        closeChats = i10 + 2;
        closeChatActivity = i10 + 3;
        closeProfileActivity = i10 + 4;
        messagesDeleted = i10 + 5;
        historyCleared = i10 + 6;
        messagesRead = i10 + 7;
        threadMessagesRead = i10 + 8;
        monoForumMessagesRead = i10 + 9;
        commentsRead = i10 + 10;
        changeRepliesCounter = i10 + 11;
        messagesDidLoad = i10 + 12;
        didLoadSponsoredMessages = i10 + 13;
        didLoadSendAsPeers = i10 + 14;
        updateDefaultSendAsPeer = i10 + 15;
        messagesDidLoadWithoutProcess = i10 + 16;
        loadingMessagesFailed = i10 + 17;
        messageReceivedByAck = i10 + 18;
        messageReceivedByServer = i10 + 19;
        messageReceivedByServer2 = i10 + 20;
        messageSendError = i10 + 21;
        forceImportContactsStart = i10 + 22;
        contactsDidLoad = i10 + 23;
        contactsImported = i10 + 24;
        hasNewContactsToImport = i10 + 25;
        chatDidCreated = i10 + 26;
        chatDidFailCreate = i10 + 27;
        chatInfoDidLoad = i10 + 28;
        chatInfoCantLoad = i10 + 29;
        mediaDidLoad = i10 + 30;
        mediaCountDidLoad = i10 + 31;
        mediaCountsDidLoad = i10 + 32;
        encryptedChatUpdated = i10 + 33;
        messagesReadEncrypted = i10 + 34;
        encryptedChatCreated = i10 + 35;
        dialogPhotosLoaded = i10 + 36;
        reloadDialogPhotos = i10 + 37;
        folderBecomeEmpty = i10 + 38;
        removeAllMessagesFromDialog = i10 + 39;
        notificationsSettingsUpdated = i10 + 40;
        blockedUsersDidLoad = i10 + 41;
        openedChatChanged = i10 + 42;
        didCreatedNewDeleteTask = i10 + 43;
        mainUserInfoChanged = i10 + 44;
        privacyRulesUpdated = i10 + 45;
        updateMessageMedia = i10 + 46;
        replaceMessagesObjects = i10 + 47;
        didSetPasscode = i10 + 48;
        passcodeDismissed = i10 + 49;
        twoStepPasswordChanged = i10 + 50;
        didSetOrRemoveTwoStepPassword = i10 + 51;
        didRemoveTwoStepPassword = i10 + 52;
        replyMessagesDidLoad = i10 + 53;
        didLoadPinnedMessages = i10 + 54;
        newSessionReceived = i10 + 55;
        didReceivedWebpages = i10 + 56;
        didReceivedWebpagesInUpdates = i10 + 57;
        stickersDidLoad = i10 + 58;
        diceStickersDidLoad = i10 + 59;
        featuredStickersDidLoad = i10 + 60;
        featuredEmojiDidLoad = i10 + 61;
        groupStickersDidLoad = i10 + 62;
        messagesReadContent = i10 + 63;
        botInfoDidLoad = i10 + 64;
        userInfoDidLoad = i10 + 65;
        pinnedInfoDidLoad = i10 + 66;
        botKeyboardDidLoad = i10 + 67;
        chatSearchResultsAvailable = i10 + 68;
        hashtagSearchUpdated = i10 + 69;
        chatSearchResultsLoading = i10 + 70;
        musicDidLoad = i10 + 71;
        moreMusicDidLoad = i10 + 72;
        needShowAlert = i10 + 73;
        needShowPlayServicesAlert = i10 + 74;
        didUpdateMessagesViews = i10 + 75;
        needReloadRecentDialogsSearch = i10 + 76;
        peerSettingsDidLoad = i10 + 77;
        wasUnableToFindCurrentLocation = i10 + 78;
        reloadHints = i10 + 79;
        reloadInlineHints = i10 + 80;
        reloadGuestBotHints = i10 + 81;
        reloadWebappsHints = i10 + 82;
        newDraftReceived = i10 + 83;
        recentDocumentsDidLoad = i10 + 84;
        needAddArchivedStickers = i10 + 85;
        archivedStickersCountDidLoad = i10 + 86;
        paymentFinished = i10 + 87;
        channelRightsUpdated = i10 + 88;
        openArticle = i10 + 89;
        articleClosed = i10 + 90;
        updateMentionsCount = i10 + 91;
        didUpdatePollResults = i10 + 92;
        chatOnlineCountDidLoad = i10 + 93;
        videoLoadingStateChanged = i10 + 94;
        newPeopleNearbyAvailable = i10 + 95;
        stopAllHeavyOperations = i10 + 96;
        startAllHeavyOperations = i10 + 97;
        stopSpoilers = i10 + 98;
        startSpoilers = i10 + 99;
        sendingMessagesChanged = i10 + 100;
        didUpdateReactions = i10 + 101;
        didUpdateExtendedMedia = i10 + 102;
        didVerifyMessagesStickers = i10 + 103;
        scheduledMessagesUpdated = i10 + 104;
        newSuggestionsAvailable = i10 + 105;
        didLoadChatInviter = i10 + 106;
        didLoadChatAdmins = i10 + 107;
        historyImportProgressChanged = i10 + 108;
        stickersImportProgressChanged = i10 + 109;
        stickersImportComplete = i10 + 110;
        dialogDeleted = i10 + 111;
        webViewResultSent = i10 + 112;
        voiceTranscriptionUpdate = i10 + 113;
        animatedEmojiDocumentLoaded = i10 + 114;
        recentEmojiStatusesUpdate = i10 + 115;
        updateSearchSettings = i10 + 116;
        updateTranscriptionLock = i10 + 117;
        businessMessagesUpdated = i10 + 118;
        quickRepliesUpdated = i10 + 119;
        quickRepliesDeleted = i10 + 120;
        bookmarkAdded = i10 + 121;
        starReactionAnonymousUpdate = i10 + 122;
        businessLinksUpdated = i10 + 123;
        businessLinkCreated = i10 + 124;
        needDeleteBusinessLink = i10 + 125;
        messageTranslated = i10 + 126;
        messageTranslating = i10 + 127;
        dialogIsTranslatable = i10 + 128;
        dialogTranslate = i10 + 129;
        didGenerateFingerprintKeyPair = i10 + 130;
        walletPendingTransactionsChanged = i10 + 131;
        walletSyncProgressChanged = i10 + 132;
        httpFileDidLoad = i10 + 133;
        httpFileDidFailedLoad = i10 + 134;
        didUpdateConnectionState = i10 + 135;
        fileUploaded = i10 + 136;
        fileUploadFailed = i10 + 137;
        fileUploadProgressChanged = i10 + 138;
        fileLoadProgressChanged = i10 + 139;
        fileLoaded = i10 + 140;
        fileLoadFailed = i10 + 141;
        filePreparingStarted = i10 + 142;
        fileNewChunkAvailable = i10 + 143;
        filePreparingFailed = i10 + 144;
        dialogsUnreadCounterChanged = i10 + 145;
        messagePlayingProgressDidChanged = i10 + 146;
        messagePlayingDidReset = i10 + 147;
        messagePlayingPlayStateChanged = i10 + 148;
        messagePlayingDidStart = i10 + 149;
        messagePlayingDidSeek = i10 + 150;
        messagePlayingGoingToStop = i10 + 151;
        recordProgressChanged = i10 + 152;
        recordStarted = i10 + 153;
        recordStartError = i10 + 154;
        recordStopped = i10 + 155;
        recordPaused = i10 + 156;
        recordResumed = i10 + 157;
        screenshotTook = i10 + 158;
        albumsDidLoad = i10 + 159;
        audioDidSent = i10 + 160;
        audioRecordTooShort = i10 + 161;
        audioRouteChanged = i10 + 162;
        didStartedCall = i10 + 163;
        groupCallUpdated = i10 + 164;
        storyGroupCallUpdated = i10 + 165;
        groupCallSpeakingUsersUpdated = i10 + 166;
        groupCallScreencastStateChanged = i10 + 167;
        activeGroupCallsUpdated = i10 + 168;
        applyGroupCallVisibleParticipants = i10 + 169;
        groupCallTypingsUpdated = i10 + 170;
        didEndCall = i10 + 171;
        closeInCallActivity = i10 + 172;
        groupCallVisibilityChanged = i10 + 173;
        liveStoryUpdated = i10 + 174;
        liveStoryMessageUpdate = i10 + 175;
        appDidLogout = i10 + 176;
        configLoaded = i10 + 177;
        needDeleteDialog = i10 + 178;
        newEmojiSuggestionsAvailable = i10 + 179;
        themeUploadedToServer = i10 + 180;
        themeUploadError = i10 + 181;
        dialogFiltersUpdated = i10 + 182;
        filterSettingsUpdated = i10 + 183;
        suggestedFiltersLoaded = i10 + 184;
        updateBotMenuButton = i10 + 185;
        giftsToUserSent = i10 + 186;
        didStartedMultiGiftsSelector = i10 + 187;
        boostedChannelByUser = i10 + 188;
        boostByChannelCreated = i10 + 189;
        didUpdatePremiumGiftStickers = i10 + 190;
        didUpdateTonGiftStickers = i10 + 191;
        didUpdatePremiumGiftFieldIcon = i10 + 192;
        storiesEnabledUpdate = i10 + 193;
        storiesBlocklistUpdate = i10 + 194;
        storiesLimitUpdate = i10 + 195;
        storiesSendAsUpdate = i10 + 196;
        unconfirmedAuthUpdate = i10 + 197;
        dialogPhotosUpdate = i10 + 198;
        channelRecommendationsLoaded = i10 + 199;
        savedMessagesDialogsUpdate = i10 + 200;
        savedReactionTagsUpdate = i10 + 201;
        userIsPremiumBlockedUpadted = i10 + 202;
        storyAlbumsCollectionsUpdate = i10 + 203;
        savedMessagesForwarded = i10 + 204;
        emojiKeywordsLoaded = i10 + 205;
        smsJobStatusUpdate = i10 + 206;
        storyQualityUpdate = i10 + 207;
        openBoostForUsersDialog = i10 + 208;
        groupRestrictionsUnlockedByBoosts = i10 + 209;
        chatWasBoostedByUser = i10 + 210;
        groupPackUpdated = i10 + 211;
        timezonesUpdated = i10 + 212;
        customStickerCreated = i10 + 213;
        premiumFloodWaitReceived = i10 + 214;
        availableEffectsUpdate = i10 + 215;
        starOptionsLoaded = i10 + 216;
        starGiftOptionsLoaded = i10 + 217;
        starGiveawayOptionsLoaded = i10 + 218;
        starBalanceUpdated = i10 + 219;
        starTransactionsLoaded = i10 + 220;
        starSubscriptionsLoaded = i10 + 221;
        factCheckLoaded = i10 + 222;
        botStarsUpdated = i10 + 223;
        botStarsTransactionsLoaded = i10 + 224;
        channelStarsUpdated = i10 + 225;
        updateAllMessages = i10 + 226;
        starGiftsLoaded = i10 + 227;
        starUserGiftsLoaded = i10 + 228;
        starUserGiftCollectionsLoaded = i10 + 229;
        starGiftSoldOut = i10 + 230;
        updateStories = i10 + 231;
        botDownloadsUpdate = i10 + 232;
        channelSuggestedBotsUpdate = i10 + 233;
        channelConnectedBotsUpdate = i10 + 234;
        adminedChannelsLoaded = i10 + 235;
        messagesFeeUpdated = i10 + 236;
        commonChatsLoaded = i10 + 237;
        appConfigUpdated = i10 + 238;
        activeAuctionsUpdated = i10 + 239;
        conferenceEmojiUpdated = i10 + 240;
        contentSettingsLoaded = i10 + 241;
        musicListLoaded = i10 + 242;
        musicIdsLoaded = i10 + 243;
        profileMusicUpdated = i10 + 244;
        updatedChatRanks = i10 + 245;
        joinedGroup = i10 + 246;
        loadedAiComposeTones = i10 + 247;
        updatedChatbot = i10 + 248;
        activeAccountChanged = i10 + 249;
        pushMessagesUpdated = i10 + 250;
        wallpapersDidLoad = i10 + 251;
        wallpapersNeedReload = i10 + 252;
        didReceiveSmsCode = i10 + 253;
        didReceiveCall = i10 + 254;
        emojiLoaded = i10 + 255;
        invalidateMotionBackground = i10 + 256;
        closeOtherAppActivities = i10 + 257;
        cameraInitied = i10 + 258;
        didReplacedPhotoInMemCache = i10 + 259;
        didSetNewTheme = i10 + 260;
        themeListUpdated = i10 + 261;
        didApplyNewTheme = i10 + 262;
        themeAccentListUpdated = i10 + 263;
        needCheckSystemBarColors = i10 + 264;
        needShareTheme = i10 + 265;
        needSetDayNightTheme = i10 + 266;
        goingToPreviewTheme = i10 + 267;
        locationPermissionGranted = i10 + 268;
        locationPermissionDenied = i10 + 269;
        reloadInterface = i10 + 270;
        suggestedLangpack = i10 + 271;
        didSetNewWallpapper = i10 + 272;
        proxySettingsChanged = i10 + 273;
        proxyCheckDone = i10 + 274;
        proxyChangedByRotation = i10 + 275;
        liveLocationsChanged = i10 + 276;
        newLocationAvailable = i10 + 277;
        liveLocationsCacheChanged = i10 + 278;
        notificationsCountUpdated = i10 + 279;
        playerDidStartPlaying = i10 + 280;
        closeSearchByActiveAction = i10 + 281;
        messagePlayingSpeedChanged = i10 + 282;
        screenStateChanged = i10 + 283;
        didClearDatabase = i10 + 284;
        voipServiceCreated = i10 + 285;
        webRtcMicAmplitudeEvent = i10 + 286;
        webRtcSpeakerAmplitudeEvent = i10 + 287;
        showBulletin = i10 + 288;
        appUpdateAvailable = i10 + 289;
        appUpdateLoading = i10 + 290;
        onDatabaseMigration = i10 + 291;
        onEmojiInteractionsReceived = i10 + 292;
        emojiPreviewThemesChanged = i10 + 293;
        reactionsDidLoad = i10 + 294;
        attachMenuBotsDidLoad = i10 + 295;
        chatAvailableReactionsUpdated = i10 + 296;
        dialogsUnreadReactionsCounterChanged = i10 + 297;
        dialogsUnreadPollVotesCounterChanged = i10 + 298;
        onDatabaseOpened = i10 + 299;
        onDownloadingFilesChanged = i10 + 300;
        onActivityResultReceived = i10 + 301;
        onRequestPermissionResultReceived = i10 + 302;
        onUserRingtonesUpdated = i10 + 303;
        currentUserPremiumStatusChanged = i10 + 304;
        premiumPromoUpdated = i10 + 305;
        premiumStatusChangedGlobal = i10 + 306;
        currentUserShowLimitReachedDialog = i10 + 307;
        billingProductDetailsUpdated = i10 + 308;
        billingConfirmPurchaseError = i10 + 309;
        premiumStickersPreviewLoaded = i10 + 310;
        userEmojiStatusUpdated = i10 + 311;
        requestPermissions = i10 + 312;
        permissionsGranted = i10 + 313;
        activityPermissionsGranted = i10 + 314;
        topicsDidLoaded = i10 + 315;
        chatSwitchedForum = i10 + 316;
        didUpdateGlobalAutoDeleteTimer = i10 + 317;
        onDatabaseReset = i10 + 318;
        wallpaperSettedToUser = i10 + 319;
        storiesUpdated = i10 + 320;
        storyDeleted = i10 + 321;
        storiesListUpdated = i10 + 322;
        storiesDraftsUpdated = i10 + 323;
        chatlistFolderUpdate = i10 + 324;
        uploadStoryProgress = i10 + 325;
        uploadStoryEnd = i10 + 326;
        customTypefacesLoaded = i10 + 327;
        stealthModeChanged = i10 + 328;
        onReceivedChannelDifference = i10 + 329;
        storiesReadUpdated = i10 + 330;
        nearEarEvent = i10 + 331;
        translationModelDownloading = i10 + 332;
        translationModelDownloaded = i10 + 333;
        botForumTopicDidCreate = i10 + 334;
        botForumDraftUpdate = i10 + 335;
        botForumDraftDelete = i10 + 336;
        tlSchemeParseException = i10 + 337;
        memoryLeakFoundException = i10 + 338;
        callTabsVisibleToggled = i10 + 339;
        contactsPermissionBadgeCheck = i10 + 340;
        guardBotDecisionResult = i10 + 341;
        webBrowserSettingsUpdate = i10 + 342;
        communityPendingRequestsUpdate = i10 + 343;
        totalEvents = i10 + 345;
        communitySwitchedCollapsed = i10 + 344;
    }

    public NotificationCenter(int i10) {
        this.currentAccount = i10;
    }

    public void checkForExpiredNotifications() {
        ArrayList arrayList = null;
        this.checkForExpiredNotifications = null;
        if (this.allowedNotifications.size() != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < this.allowedNotifications.size(); i10++) {
                long j10 = this.allowedNotifications.valueAt(i10).time;
                if (elapsedRealtime - j10 > 1000) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(Integer.valueOf(this.allowedNotifications.keyAt(i10)));
                } else {
                    j3 = Math.min(j10, j3);
                }
            }
            if (arrayList != null) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    onAnimationFinish(((Integer) arrayList.get(i11)).intValue());
                }
            }
            if (j3 != Long.MAX_VALUE) {
                AndroidUtilities.runOnUIThread(new wg(this, 0), Math.max(17L, 5017 - (elapsedRealtime - j3)));
            }
        }
    }

    private ArrayList<NotificationCenterDelegate> createArrayForId(int i10) {
        if (i10 != didReplacedPhotoInMemCache && i10 != stopAllHeavyOperations && i10 != startAllHeavyOperations) {
            return new ArrayList<>();
        }
        return new UniqArrayList();
    }

    public static void diffObserverDumps(SparseArray<Integer> sparseArray, SparseArray<Integer> sparseArray2) {
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            int keyAt = sparseArray.keyAt(i10);
            int intValue = sparseArray.valueAt(i10).intValue();
            int intValue2 = sparseArray2.get(keyAt, -1).intValue();
            if (intValue2 == -1) {
                Log.i("ObserverDiff", "key=" + keyAt + " REMOVED (was " + intValue + ")");
            } else if (intValue != intValue2) {
                StringBuilder k10 = com.google.android.gms.internal.vision.e2.k("key=", keyAt, " CHANGED: ", intValue, " -> ");
                k10.append(intValue2);
                Log.i("ObserverDiff", k10.toString());
            }
        }
        for (int i11 = 0; i11 < sparseArray2.size(); i11++) {
            int keyAt2 = sparseArray2.keyAt(i11);
            if (sparseArray.get(keyAt2, -1).intValue() == -1) {
                StringBuilder l4 = i2.g.l(keyAt2, "key=", " ADDED (size=");
                l4.append(sparseArray2.valueAt(i11));
                l4.append(")");
                Log.i("ObserverDiff", l4.toString());
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
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return notificationCenter;
        }
        return notificationCenter2;
    }

    public static NotificationCenter getInstance(int i10) {
        NotificationCenter notificationCenter;
        NotificationCenter notificationCenter2 = Instance[i10];
        if (notificationCenter2 == null) {
            synchronized (NotificationCenter.class) {
                try {
                    notificationCenter = Instance[i10];
                    if (notificationCenter == null) {
                        NotificationCenter[] notificationCenterArr = Instance;
                        NotificationCenter notificationCenter3 = new NotificationCenter(i10);
                        notificationCenterArr[i10] = notificationCenter3;
                        notificationCenter = notificationCenter3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return notificationCenter;
        }
        return notificationCenter2;
    }

    public void lambda$checkForExpiredNotifications$0() {
        this.checkForExpiredNotifications = new wg(this, 1);
    }

    public static void lambda$listen$4(int i10, Utilities.Callback callback, int i11, int i12, Object[] objArr) {
        if (i11 == i10) {
            callback.run(objArr);
        }
    }

    public void lambda$listen$5(View view, View.OnAttachStateChangeListener onAttachStateChangeListener, NotificationCenterDelegate notificationCenterDelegate, int i10) {
        view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        removeObserver(notificationCenterDelegate, i10);
    }

    public void lambda$postNotificationDebounced$2(int i10, Object[] objArr, int i11) {
        postNotificationNameInternal(i10, false, objArr);
        this.alreadyPostedRunnubles.remove(i11);
    }

    public static void listenEmojiLoading(View view) {
        getGlobalInstance().listen(view, emojiLoaded, new z0(view, 2));
    }

    private void postNotificationDebounced(int i10, Object[] objArr) {
        int hashCode = i10 + (Arrays.hashCode(objArr) << 16);
        if (this.alreadyPostedRunnubles.indexOfKey(hashCode) >= 0) {
            return;
        }
        w4 w4Var = new w4(this, i10, objArr, hashCode, 8);
        this.alreadyPostedRunnubles.put(hashCode, w4Var);
        AndroidUtilities.runOnUIThread(w4Var, 250L);
    }

    private boolean shouldDebounce(int i10, Object[] objArr) {
        if (i10 == updateInterfaces) {
            return true;
        }
        return false;
    }

    public void addObserver(NotificationCenterDelegate notificationCenterDelegate, int i10) {
        if (BuildVars.DEBUG_VERSION && Thread.currentThread() != ApplicationLoader.applicationHandler.getLooper().getThread()) {
            throw new RuntimeException("addObserver allowed only from MAIN thread");
        }
        if (this.broadcasting != 0) {
            ArrayList<NotificationCenterDelegate> arrayList = this.addAfterBroadcast.get(i10);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.addAfterBroadcast.put(i10, arrayList);
            }
            arrayList.add(notificationCenterDelegate);
            return;
        }
        ArrayList<NotificationCenterDelegate> arrayList2 = this.observers.get(i10);
        if (arrayList2 == null) {
            SparseArray<ArrayList<NotificationCenterDelegate>> sparseArray = this.observers;
            ArrayList<NotificationCenterDelegate> createArrayForId = createArrayForId(i10);
            sparseArray.put(i10, createArrayForId);
            arrayList2 = createArrayForId;
        }
        if (!arrayList2.contains(notificationCenterDelegate)) {
            arrayList2.add(notificationCenterDelegate);
            if (BuildVars.DEBUG_VERSION && !alreadyLogged && arrayList2.size() > 1000) {
                alreadyLogged = true;
                FileLog.e((Throwable) new RuntimeException(i2.g.i(i10, "Total observers more than 1000, need check for memory leak. ")), true);
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
        int i10;
        SparseArray<Integer> sparseArray = new SparseArray<>();
        for (int i11 = 0; i11 < this.observers.size(); i11++) {
            int keyAt = this.observers.keyAt(i11);
            ArrayList<NotificationCenterDelegate> valueAt = this.observers.valueAt(i11);
            if (valueAt != null) {
                i10 = valueAt.size();
            } else {
                i10 = 0;
            }
            sparseArray.put(keyAt, Integer.valueOf(i10));
        }
        return sparseArray;
    }

    public int getCurrentHeavyOperationFlags() {
        return this.currentHeavyOperationFlags;
    }

    public ArrayList<NotificationCenterDelegate> getObservers(int i10) {
        return this.observers.get(i10);
    }

    public int getObserversSize() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.observers.size(); i11++) {
            ArrayList<NotificationCenterDelegate> valueAt = this.observers.valueAt(i11);
            if (valueAt != null) {
                i10 = valueAt.size() + i10;
            }
        }
        return i10;
    }

    public boolean hasObservers(int i10) {
        if (this.observers.indexOfKey(i10) >= 0) {
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

    public Runnable listen(View view, final int i10, final Utilities.Callback<Object[]> callback) {
        if (view != null && callback != null) {
            final NotificationCenterDelegate notificationCenterDelegate = new NotificationCenterDelegate() {
                @Override
                public final void didReceivedNotification(int i11, int i12, Object[] objArr) {
                    NotificationCenter.lambda$listen$4(i10, callback, i11, i12, objArr);
                }
            };
            View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() {
                {
                    NotificationCenter.this = this;
                }

                @Override
                public void onViewAttachedToWindow(View view2) {
                    NotificationCenter.this.addObserver(notificationCenterDelegate, i10);
                }

                @Override
                public void onViewDetachedFromWindow(View view2) {
                    NotificationCenter.this.removeObserver(notificationCenterDelegate, i10);
                }
            };
            view.addOnAttachStateChangeListener(onAttachStateChangeListener);
            return new fi.l3(this, view, onAttachStateChangeListener, notificationCenterDelegate, i10, 11);
        }
        return new u1(16);
    }

    public void onAnimationFinish(int i10) {
        AllowedNotifications allowedNotifications = this.allowedNotifications.get(i10);
        this.allowedNotifications.delete(i10);
        if (allowedNotifications != null) {
            this.animationInProgressCount--;
            if (!this.heavyOperationsCounter.isEmpty()) {
                this.heavyOperationsCounter.remove(Integer.valueOf(i10));
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

    public void lambda$postNotificationNameOnUIThread$1(int i10, Object... objArr) {
        boolean z10;
        boolean z11 = true;
        if (i10 != startAllHeavyOperations && i10 != stopAllHeavyOperations && i10 != didReplacedPhotoInMemCache && i10 != closeChats && i10 != invalidateMotionBackground && i10 != needCheckSystemBarColors && i10 != messageReceivedByServer2) {
            z10 = false;
        } else {
            z10 = true;
        }
        ArrayList arrayList = null;
        if (!z10 && this.allowedNotifications.size() > 0) {
            int size = this.allowedNotifications.size();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i11 = 0;
            for (int i12 = 0; i12 < this.allowedNotifications.size(); i12++) {
                AllowedNotifications valueAt = this.allowedNotifications.valueAt(i12);
                if (elapsedRealtime - valueAt.time > 5017) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(Integer.valueOf(this.allowedNotifications.keyAt(i12)));
                }
                int[] iArr = valueAt.allowedIds;
                if (iArr == null) {
                    break;
                }
                int i13 = 0;
                while (true) {
                    if (i13 >= iArr.length) {
                        break;
                    } else if (iArr[i13] == i10) {
                        i11++;
                        break;
                    } else {
                        i13++;
                    }
                }
            }
            if (size != i11) {
                z11 = false;
            }
            z10 = z11;
        }
        if (i10 == startAllHeavyOperations) {
            this.currentHeavyOperationFlags = (~((Integer) objArr[0]).intValue()) & this.currentHeavyOperationFlags;
        } else if (i10 == stopAllHeavyOperations) {
            this.currentHeavyOperationFlags = ((Integer) objArr[0]).intValue() | this.currentHeavyOperationFlags;
        }
        if (shouldDebounce(i10, objArr) && BuildVars.DEBUG_VERSION) {
            postNotificationDebounced(i10, objArr);
        } else {
            postNotificationNameInternal(i10, z10, objArr);
        }
        if (arrayList != null) {
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                onAnimationFinish(((Integer) arrayList.get(i14)).intValue());
            }
        }
    }

    public void postNotificationNameInternal(int i10, boolean z10, Object... objArr) {
        if (BuildVars.DEBUG_VERSION && Thread.currentThread() != ApplicationLoader.applicationHandler.getLooper().getThread()) {
            throw new RuntimeException("postNotificationName allowed only from MAIN thread");
        }
        if (!z10 && isAnimationInProgress()) {
            this.delayedPosts.add(new DelayedPost(i10, objArr));
            return;
        }
        if (!this.postponeCallbackList.isEmpty()) {
            for (int i11 = 0; i11 < this.postponeCallbackList.size(); i11++) {
                if (this.postponeCallbackList.get(i11).needPostpone(i10, this.currentAccount, objArr)) {
                    this.delayedPosts.add(new DelayedPost(i10, objArr));
                    return;
                }
            }
        }
        this.broadcasting++;
        ArrayList<NotificationCenterDelegate> arrayList = this.observers.get(i10);
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                arrayList.get(i12).didReceivedNotification(i10, this.currentAccount, objArr);
            }
        }
        int i13 = this.broadcasting - 1;
        this.broadcasting = i13;
        if (i13 == 0) {
            if (this.removeAfterBroadcast.size() != 0) {
                for (int i14 = 0; i14 < this.removeAfterBroadcast.size(); i14++) {
                    int keyAt = this.removeAfterBroadcast.keyAt(i14);
                    ArrayList<NotificationCenterDelegate> arrayList2 = this.removeAfterBroadcast.get(keyAt);
                    for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                        removeObserver(arrayList2.get(i15), keyAt);
                    }
                }
                this.removeAfterBroadcast.clear();
            }
            if (this.addAfterBroadcast.size() != 0) {
                for (int i16 = 0; i16 < this.addAfterBroadcast.size(); i16++) {
                    int keyAt2 = this.addAfterBroadcast.keyAt(i16);
                    ArrayList<NotificationCenterDelegate> arrayList3 = this.addAfterBroadcast.get(keyAt2);
                    for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                        addObserver(arrayList3.get(i17), keyAt2);
                    }
                }
                this.addAfterBroadcast.clear();
            }
        }
    }

    public void postNotificationNameOnUIThread(int i10, Object... objArr) {
        AndroidUtilities.runOnUIThread(new p4(this, i10, objArr, 19));
    }

    public void removeDelayed(Runnable runnable) {
        this.delayedRunnables.remove(runnable);
    }

    public void removeObserver(NotificationCenterDelegate notificationCenterDelegate, int i10) {
        if (BuildVars.DEBUG_VERSION && Thread.currentThread() != ApplicationLoader.applicationHandler.getLooper().getThread()) {
            throw new RuntimeException("removeObserver allowed only from MAIN thread");
        }
        if (this.broadcasting != 0) {
            ArrayList<NotificationCenterDelegate> arrayList = this.removeAfterBroadcast.get(i10);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.removeAfterBroadcast.put(i10, arrayList);
            }
            arrayList.add(notificationCenterDelegate);
            return;
        }
        ArrayList<NotificationCenterDelegate> arrayList2 = this.observers.get(i10);
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
            for (int i10 = 0; i10 < this.delayedPostsTmp.size(); i10++) {
                DelayedPost delayedPost = this.delayedPostsTmp.get(i10);
                postNotificationNameInternal(delayedPost.f17083id, true, delayedPost.args);
            }
            this.delayedPostsTmp.clear();
        }
        if (!this.delayedRunnables.isEmpty()) {
            this.delayedRunnablesTmp.clear();
            this.delayedRunnablesTmp.addAll(this.delayedRunnables);
            this.delayedRunnables.clear();
            for (int i11 = 0; i11 < this.delayedRunnablesTmp.size(); i11++) {
                AndroidUtilities.runOnUIThread(this.delayedRunnablesTmp.get(i11));
            }
            this.delayedRunnablesTmp.clear();
        }
    }

    public int setAnimationInProgress(int i10, int[] iArr) {
        return setAnimationInProgress(i10, iArr, true);
    }

    public void updateAllowedNotifications(int i10, int[] iArr) {
        AllowedNotifications allowedNotifications = this.allowedNotifications.get(i10);
        if (allowedNotifications != null) {
            allowedNotifications.allowedIds = iArr;
        }
    }

    public void updateObserver(boolean z10, NotificationCenterDelegate notificationCenterDelegate, int i10) {
        if (z10) {
            addObserver(notificationCenterDelegate, i10);
        } else {
            removeObserver(notificationCenterDelegate, i10);
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
        public T remove(int i10) {
            T t10 = (T) super.remove(i10);
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
        public void add(int i10, T t10) {
            if (this.set.add(t10)) {
                super.add(i10, t10);
            }
        }

        @Override
        public boolean addAll(int i10, Collection<? extends T> collection) {
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

    public int setAnimationInProgress(int i10, int[] iArr, boolean z10) {
        onAnimationFinish(i10);
        if (this.heavyOperationsCounter.isEmpty() && z10) {
            getGlobalInstance().lambda$postNotificationNameOnUIThread$1(stopAllHeavyOperations, 512);
        }
        this.animationInProgressCount++;
        int i11 = this.animationInProgressPointer + 1;
        this.animationInProgressPointer = i11;
        if (z10) {
            this.heavyOperationsCounter.add(Integer.valueOf(i11));
        }
        AllowedNotifications allowedNotifications = new AllowedNotifications();
        allowedNotifications.allowedIds = iArr;
        this.allowedNotifications.put(this.animationInProgressPointer, allowedNotifications);
        if (this.checkForExpiredNotifications == null) {
            wg wgVar = new wg(this, 1);
            this.checkForExpiredNotifications = wgVar;
            AndroidUtilities.runOnUIThread(wgVar, 5017L);
        }
        return this.animationInProgressPointer;
    }

    public static void lambda$listen$3() {
    }
}
