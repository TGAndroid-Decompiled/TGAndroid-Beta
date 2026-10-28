package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
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
    public static final int agentSettingsUpdated;
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
    public static final int channelNewsUpdated;
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
    public static final int walletTransactionsUpdate;
    public static final int walletUpdate;
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
        private int f19551id;

        private DelayedPost(int i10, Object[] objArr) {
            this.f19551id = i10;
            this.args = objArr;
        }
    }

    public interface NotificationCenterDelegate {
        void didReceivedNotification(int i10, int i11, Object... objArr);
    }

    public interface ObserversGroup {
        ObserversGroup add(int i10);

        ObserversGroup addGlobal(int i10);

        void removeAllObservers();
    }

    public static final class ObserversGroupImpl implements ObserversGroup {
        private NotificationCenterDelegate delegate;
        private ObserversGroupImpl globalGroup;
        private final a0.k ids;
        private NotificationCenter notificationCenter;

        @Override
        public ObserversGroup add(int i10) {
            if (this.delegate == null) {
                return this;
            }
            a0.k kVar = this.ids;
            int i11 = kVar.f24b + 1;
            int[] iArr = kVar.f23a;
            if (iArr.length < i11) {
                int[] copyOf = Arrays.copyOf(iArr, Math.max(i11, (iArr.length * 3) / 2));
                kotlin.jvm.internal.i.d(copyOf, "copyOf(this, newSize)");
                kVar.f23a = copyOf;
            }
            int[] iArr2 = kVar.f23a;
            int i12 = kVar.f24b;
            iArr2[i12] = i10;
            kVar.f24b = i12 + 1;
            this.notificationCenter.addObserverInternal(this.delegate, i10);
            return this;
        }

        @Override
        public ObserversGroup addGlobal(int i10) {
            if (this.delegate == null) {
                return this;
            }
            if (this.globalGroup == null) {
                this.globalGroup = new ObserversGroupImpl(NotificationCenter.getGlobalInstance(), this.delegate);
            }
            this.globalGroup.add(i10);
            return this;
        }

        @Override
        public void removeAllObservers() {
            if (this.delegate == null) {
                return;
            }
            ObserversGroupImpl observersGroupImpl = this.globalGroup;
            if (observersGroupImpl != null) {
                observersGroupImpl.removeAllObservers();
                this.globalGroup = null;
            }
            int i10 = this.ids.f24b;
            for (int i11 = 0; i11 < i10; i11++) {
                NotificationCenter notificationCenter = this.notificationCenter;
                NotificationCenterDelegate notificationCenterDelegate = this.delegate;
                a0.k kVar = this.ids;
                if (i11 >= 0) {
                    if (i11 < kVar.f24b) {
                        notificationCenter.removeObserver(notificationCenterDelegate, kVar.f23a[i11]);
                    }
                } else {
                    kVar.getClass();
                }
                StringBuilder k10 = ic.a.k(i11, "Index ", " must be in 0..");
                k10.append(kVar.f24b - 1);
                throw new IndexOutOfBoundsException(k10.toString());
            }
            this.ids.f24b = 0;
            this.notificationCenter = null;
            this.delegate = null;
        }

        private ObserversGroupImpl(NotificationCenter notificationCenter, NotificationCenterDelegate notificationCenterDelegate) {
            ?? obj = new Object();
            obj.f23a = new int[16];
            this.ids = obj;
            this.notificationCenter = notificationCenter;
            this.delegate = notificationCenterDelegate;
        }
    }

    public interface PostponeNotificationCallback {
        boolean needPostpone(int i10, int i11, Object[] objArr);
    }

    public static final class WeakDelegate implements NotificationCenterDelegate {
        private final NotificationCenter center;
        private final int hash;
        private final WeakReference<NotificationCenterDelegate> reference;

        @Override
        public void didReceivedNotification(int i10, int i11, Object... objArr) {
            NotificationCenterDelegate notificationCenterDelegate = this.reference.get();
            if (notificationCenterDelegate == null) {
                this.center.removeObserverInternal(this, i10);
            } else {
                notificationCenterDelegate.didReceivedNotification(i10, i11, objArr);
            }
        }

        public boolean equals(Object obj) {
            NotificationCenterDelegate notificationCenterDelegate;
            if (this == obj) {
                return true;
            }
            if ((obj instanceof WeakDelegate) && (notificationCenterDelegate = this.reference.get()) != null && notificationCenterDelegate == ((WeakDelegate) obj).reference.get()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.hash;
        }

        private WeakDelegate(NotificationCenter notificationCenter, NotificationCenterDelegate notificationCenterDelegate) {
            this.center = notificationCenter;
            this.reference = new WeakReference<>(notificationCenterDelegate);
            this.hash = System.identityHashCode(notificationCenterDelegate);
        }
    }

    public static final class WeakObserversGroupImpl implements ObserversGroup, NotificationCenterDelegate {
        private final ObserversGroupImpl observersGroup;
        private final WeakReference<NotificationCenterDelegate> reference;

        @Override
        public ObserversGroup add(int i10) {
            return this.observersGroup.add(i10);
        }

        @Override
        public ObserversGroup addGlobal(int i10) {
            return this.observersGroup.addGlobal(i10);
        }

        @Override
        public void didReceivedNotification(int i10, int i11, Object... objArr) {
            NotificationCenterDelegate notificationCenterDelegate = this.reference.get();
            if (notificationCenterDelegate != null) {
                notificationCenterDelegate.didReceivedNotification(i10, i11, objArr);
                return;
            }
            FileLog.e("MEMORY_LEAK observer " + i10 + " with destroyed WeakReference");
            removeAllObservers();
        }

        @Override
        public void removeAllObservers() {
            this.observersGroup.removeAllObservers();
        }

        private WeakObserversGroupImpl(NotificationCenter notificationCenter, NotificationCenterDelegate notificationCenterDelegate) {
            this.observersGroup = new ObserversGroupImpl(this);
            this.reference = new WeakReference<>(notificationCenterDelegate);
        }
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
        channelNewsUpdated = i10 + 26;
        chatDidCreated = i10 + 27;
        chatDidFailCreate = i10 + 28;
        chatInfoDidLoad = i10 + 29;
        chatInfoCantLoad = i10 + 30;
        mediaDidLoad = i10 + 31;
        mediaCountDidLoad = i10 + 32;
        mediaCountsDidLoad = i10 + 33;
        encryptedChatUpdated = i10 + 34;
        messagesReadEncrypted = i10 + 35;
        encryptedChatCreated = i10 + 36;
        dialogPhotosLoaded = i10 + 37;
        reloadDialogPhotos = i10 + 38;
        folderBecomeEmpty = i10 + 39;
        removeAllMessagesFromDialog = i10 + 40;
        notificationsSettingsUpdated = i10 + 41;
        blockedUsersDidLoad = i10 + 42;
        openedChatChanged = i10 + 43;
        didCreatedNewDeleteTask = i10 + 44;
        mainUserInfoChanged = i10 + 45;
        privacyRulesUpdated = i10 + 46;
        updateMessageMedia = i10 + 47;
        replaceMessagesObjects = i10 + 48;
        didSetPasscode = i10 + 49;
        passcodeDismissed = i10 + 50;
        twoStepPasswordChanged = i10 + 51;
        didSetOrRemoveTwoStepPassword = i10 + 52;
        didRemoveTwoStepPassword = i10 + 53;
        replyMessagesDidLoad = i10 + 54;
        didLoadPinnedMessages = i10 + 55;
        newSessionReceived = i10 + 56;
        didReceivedWebpages = i10 + 57;
        didReceivedWebpagesInUpdates = i10 + 58;
        stickersDidLoad = i10 + 59;
        diceStickersDidLoad = i10 + 60;
        featuredStickersDidLoad = i10 + 61;
        featuredEmojiDidLoad = i10 + 62;
        groupStickersDidLoad = i10 + 63;
        messagesReadContent = i10 + 64;
        botInfoDidLoad = i10 + 65;
        userInfoDidLoad = i10 + 66;
        pinnedInfoDidLoad = i10 + 67;
        botKeyboardDidLoad = i10 + 68;
        chatSearchResultsAvailable = i10 + 69;
        hashtagSearchUpdated = i10 + 70;
        chatSearchResultsLoading = i10 + 71;
        musicDidLoad = i10 + 72;
        moreMusicDidLoad = i10 + 73;
        needShowAlert = i10 + 74;
        needShowPlayServicesAlert = i10 + 75;
        didUpdateMessagesViews = i10 + 76;
        needReloadRecentDialogsSearch = i10 + 77;
        peerSettingsDidLoad = i10 + 78;
        wasUnableToFindCurrentLocation = i10 + 79;
        reloadHints = i10 + 80;
        reloadInlineHints = i10 + 81;
        reloadGuestBotHints = i10 + 82;
        reloadWebappsHints = i10 + 83;
        newDraftReceived = i10 + 84;
        recentDocumentsDidLoad = i10 + 85;
        needAddArchivedStickers = i10 + 86;
        archivedStickersCountDidLoad = i10 + 87;
        paymentFinished = i10 + 88;
        channelRightsUpdated = i10 + 89;
        openArticle = i10 + 90;
        articleClosed = i10 + 91;
        updateMentionsCount = i10 + 92;
        didUpdatePollResults = i10 + 93;
        chatOnlineCountDidLoad = i10 + 94;
        videoLoadingStateChanged = i10 + 95;
        newPeopleNearbyAvailable = i10 + 96;
        stopAllHeavyOperations = i10 + 97;
        startAllHeavyOperations = i10 + 98;
        stopSpoilers = i10 + 99;
        startSpoilers = i10 + 100;
        sendingMessagesChanged = i10 + 101;
        didUpdateReactions = i10 + 102;
        didUpdateExtendedMedia = i10 + 103;
        didVerifyMessagesStickers = i10 + 104;
        scheduledMessagesUpdated = i10 + 105;
        newSuggestionsAvailable = i10 + 106;
        didLoadChatInviter = i10 + 107;
        didLoadChatAdmins = i10 + 108;
        historyImportProgressChanged = i10 + 109;
        stickersImportProgressChanged = i10 + 110;
        stickersImportComplete = i10 + 111;
        dialogDeleted = i10 + 112;
        webViewResultSent = i10 + 113;
        voiceTranscriptionUpdate = i10 + 114;
        animatedEmojiDocumentLoaded = i10 + 115;
        recentEmojiStatusesUpdate = i10 + 116;
        updateSearchSettings = i10 + 117;
        updateTranscriptionLock = i10 + 118;
        businessMessagesUpdated = i10 + 119;
        quickRepliesUpdated = i10 + 120;
        quickRepliesDeleted = i10 + 121;
        bookmarkAdded = i10 + 122;
        starReactionAnonymousUpdate = i10 + 123;
        businessLinksUpdated = i10 + 124;
        businessLinkCreated = i10 + 125;
        needDeleteBusinessLink = i10 + 126;
        messageTranslated = i10 + 127;
        messageTranslating = i10 + 128;
        dialogIsTranslatable = i10 + 129;
        dialogTranslate = i10 + 130;
        didGenerateFingerprintKeyPair = i10 + 131;
        walletPendingTransactionsChanged = i10 + 132;
        walletSyncProgressChanged = i10 + 133;
        httpFileDidLoad = i10 + 134;
        httpFileDidFailedLoad = i10 + 135;
        didUpdateConnectionState = i10 + 136;
        fileUploaded = i10 + 137;
        fileUploadFailed = i10 + 138;
        fileUploadProgressChanged = i10 + 139;
        fileLoadProgressChanged = i10 + 140;
        fileLoaded = i10 + 141;
        fileLoadFailed = i10 + 142;
        filePreparingStarted = i10 + 143;
        fileNewChunkAvailable = i10 + 144;
        filePreparingFailed = i10 + 145;
        dialogsUnreadCounterChanged = i10 + 146;
        messagePlayingProgressDidChanged = i10 + 147;
        messagePlayingDidReset = i10 + 148;
        messagePlayingPlayStateChanged = i10 + 149;
        messagePlayingDidStart = i10 + 150;
        messagePlayingDidSeek = i10 + 151;
        messagePlayingGoingToStop = i10 + 152;
        recordProgressChanged = i10 + 153;
        recordStarted = i10 + 154;
        recordStartError = i10 + 155;
        recordStopped = i10 + 156;
        recordPaused = i10 + 157;
        recordResumed = i10 + 158;
        screenshotTook = i10 + 159;
        albumsDidLoad = i10 + 160;
        audioDidSent = i10 + 161;
        audioRecordTooShort = i10 + 162;
        audioRouteChanged = i10 + 163;
        didStartedCall = i10 + 164;
        groupCallUpdated = i10 + 165;
        storyGroupCallUpdated = i10 + 166;
        groupCallSpeakingUsersUpdated = i10 + 167;
        groupCallScreencastStateChanged = i10 + 168;
        activeGroupCallsUpdated = i10 + 169;
        applyGroupCallVisibleParticipants = i10 + 170;
        groupCallTypingsUpdated = i10 + 171;
        didEndCall = i10 + 172;
        closeInCallActivity = i10 + 173;
        groupCallVisibilityChanged = i10 + 174;
        liveStoryUpdated = i10 + 175;
        liveStoryMessageUpdate = i10 + 176;
        appDidLogout = i10 + 177;
        configLoaded = i10 + 178;
        needDeleteDialog = i10 + 179;
        newEmojiSuggestionsAvailable = i10 + 180;
        themeUploadedToServer = i10 + 181;
        themeUploadError = i10 + 182;
        dialogFiltersUpdated = i10 + 183;
        filterSettingsUpdated = i10 + 184;
        suggestedFiltersLoaded = i10 + 185;
        updateBotMenuButton = i10 + 186;
        giftsToUserSent = i10 + 187;
        didStartedMultiGiftsSelector = i10 + 188;
        boostedChannelByUser = i10 + 189;
        boostByChannelCreated = i10 + 190;
        didUpdatePremiumGiftStickers = i10 + 191;
        didUpdateTonGiftStickers = i10 + 192;
        didUpdatePremiumGiftFieldIcon = i10 + 193;
        storiesEnabledUpdate = i10 + 194;
        storiesBlocklistUpdate = i10 + 195;
        storiesLimitUpdate = i10 + 196;
        storiesSendAsUpdate = i10 + 197;
        unconfirmedAuthUpdate = i10 + 198;
        dialogPhotosUpdate = i10 + 199;
        channelRecommendationsLoaded = i10 + 200;
        savedMessagesDialogsUpdate = i10 + 201;
        savedReactionTagsUpdate = i10 + 202;
        userIsPremiumBlockedUpadted = i10 + 203;
        storyAlbumsCollectionsUpdate = i10 + 204;
        savedMessagesForwarded = i10 + 205;
        emojiKeywordsLoaded = i10 + 206;
        smsJobStatusUpdate = i10 + 207;
        storyQualityUpdate = i10 + 208;
        openBoostForUsersDialog = i10 + 209;
        groupRestrictionsUnlockedByBoosts = i10 + 210;
        chatWasBoostedByUser = i10 + 211;
        groupPackUpdated = i10 + 212;
        timezonesUpdated = i10 + 213;
        customStickerCreated = i10 + 214;
        premiumFloodWaitReceived = i10 + 215;
        availableEffectsUpdate = i10 + 216;
        starOptionsLoaded = i10 + 217;
        starGiftOptionsLoaded = i10 + 218;
        starGiveawayOptionsLoaded = i10 + 219;
        starBalanceUpdated = i10 + 220;
        starTransactionsLoaded = i10 + 221;
        starSubscriptionsLoaded = i10 + 222;
        factCheckLoaded = i10 + 223;
        botStarsUpdated = i10 + 224;
        botStarsTransactionsLoaded = i10 + 225;
        channelStarsUpdated = i10 + 226;
        updateAllMessages = i10 + 227;
        starGiftsLoaded = i10 + 228;
        starUserGiftsLoaded = i10 + 229;
        starUserGiftCollectionsLoaded = i10 + 230;
        starGiftSoldOut = i10 + 231;
        updateStories = i10 + 232;
        botDownloadsUpdate = i10 + 233;
        channelSuggestedBotsUpdate = i10 + 234;
        channelConnectedBotsUpdate = i10 + 235;
        adminedChannelsLoaded = i10 + 236;
        messagesFeeUpdated = i10 + 237;
        commonChatsLoaded = i10 + 238;
        appConfigUpdated = i10 + 239;
        activeAuctionsUpdated = i10 + 240;
        conferenceEmojiUpdated = i10 + 241;
        contentSettingsLoaded = i10 + 242;
        musicListLoaded = i10 + 243;
        musicIdsLoaded = i10 + 244;
        profileMusicUpdated = i10 + 245;
        updatedChatRanks = i10 + 246;
        joinedGroup = i10 + 247;
        loadedAiComposeTones = i10 + 248;
        agentSettingsUpdated = i10 + 249;
        updatedChatbot = i10 + 250;
        walletUpdate = i10 + 251;
        walletTransactionsUpdate = i10 + 252;
        activeAccountChanged = i10 + 253;
        pushMessagesUpdated = i10 + 254;
        wallpapersDidLoad = i10 + 255;
        wallpapersNeedReload = i10 + 256;
        didReceiveSmsCode = i10 + 257;
        didReceiveCall = i10 + 258;
        emojiLoaded = i10 + 259;
        invalidateMotionBackground = i10 + 260;
        closeOtherAppActivities = i10 + 261;
        cameraInitied = i10 + 262;
        didReplacedPhotoInMemCache = i10 + 263;
        didSetNewTheme = i10 + 264;
        themeListUpdated = i10 + 265;
        didApplyNewTheme = i10 + 266;
        themeAccentListUpdated = i10 + 267;
        needCheckSystemBarColors = i10 + 268;
        needShareTheme = i10 + 269;
        needSetDayNightTheme = i10 + 270;
        goingToPreviewTheme = i10 + 271;
        locationPermissionGranted = i10 + 272;
        locationPermissionDenied = i10 + 273;
        reloadInterface = i10 + 274;
        suggestedLangpack = i10 + 275;
        didSetNewWallpapper = i10 + 276;
        proxySettingsChanged = i10 + 277;
        proxyCheckDone = i10 + 278;
        proxyChangedByRotation = i10 + 279;
        liveLocationsChanged = i10 + 280;
        newLocationAvailable = i10 + 281;
        liveLocationsCacheChanged = i10 + 282;
        notificationsCountUpdated = i10 + 283;
        playerDidStartPlaying = i10 + 284;
        closeSearchByActiveAction = i10 + 285;
        messagePlayingSpeedChanged = i10 + 286;
        screenStateChanged = i10 + 287;
        didClearDatabase = i10 + 288;
        voipServiceCreated = i10 + 289;
        webRtcMicAmplitudeEvent = i10 + 290;
        webRtcSpeakerAmplitudeEvent = i10 + 291;
        showBulletin = i10 + 292;
        appUpdateAvailable = i10 + 293;
        appUpdateLoading = i10 + 294;
        onDatabaseMigration = i10 + 295;
        onEmojiInteractionsReceived = i10 + 296;
        emojiPreviewThemesChanged = i10 + 297;
        reactionsDidLoad = i10 + 298;
        attachMenuBotsDidLoad = i10 + 299;
        chatAvailableReactionsUpdated = i10 + 300;
        dialogsUnreadReactionsCounterChanged = i10 + 301;
        dialogsUnreadPollVotesCounterChanged = i10 + 302;
        onDatabaseOpened = i10 + 303;
        onDownloadingFilesChanged = i10 + 304;
        onActivityResultReceived = i10 + 305;
        onRequestPermissionResultReceived = i10 + 306;
        onUserRingtonesUpdated = i10 + 307;
        currentUserPremiumStatusChanged = i10 + 308;
        premiumPromoUpdated = i10 + 309;
        premiumStatusChangedGlobal = i10 + 310;
        currentUserShowLimitReachedDialog = i10 + 311;
        billingProductDetailsUpdated = i10 + 312;
        billingConfirmPurchaseError = i10 + 313;
        premiumStickersPreviewLoaded = i10 + 314;
        userEmojiStatusUpdated = i10 + 315;
        requestPermissions = i10 + 316;
        permissionsGranted = i10 + 317;
        activityPermissionsGranted = i10 + 318;
        topicsDidLoaded = i10 + 319;
        chatSwitchedForum = i10 + 320;
        didUpdateGlobalAutoDeleteTimer = i10 + 321;
        onDatabaseReset = i10 + 322;
        wallpaperSettedToUser = i10 + 323;
        storiesUpdated = i10 + 324;
        storyDeleted = i10 + 325;
        storiesListUpdated = i10 + 326;
        storiesDraftsUpdated = i10 + 327;
        chatlistFolderUpdate = i10 + 328;
        uploadStoryProgress = i10 + 329;
        uploadStoryEnd = i10 + 330;
        customTypefacesLoaded = i10 + 331;
        stealthModeChanged = i10 + 332;
        onReceivedChannelDifference = i10 + 333;
        storiesReadUpdated = i10 + 334;
        nearEarEvent = i10 + 335;
        translationModelDownloading = i10 + 336;
        translationModelDownloaded = i10 + 337;
        botForumTopicDidCreate = i10 + 338;
        botForumDraftUpdate = i10 + 339;
        botForumDraftDelete = i10 + 340;
        tlSchemeParseException = i10 + 341;
        memoryLeakFoundException = i10 + 342;
        callTabsVisibleToggled = i10 + 343;
        contactsPermissionBadgeCheck = i10 + 344;
        guardBotDecisionResult = i10 + 345;
        webBrowserSettingsUpdate = i10 + 346;
        communityPendingRequestsUpdate = i10 + 347;
        totalEvents = i10 + 349;
        communitySwitchedCollapsed = i10 + 348;
    }

    public NotificationCenter(int i10) {
        this.currentAccount = i10;
    }

    public void addObserverInternal(NotificationCenterDelegate notificationCenterDelegate, int i10) {
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
        if (!containsObserver(arrayList2, notificationCenterDelegate)) {
            arrayList2.add(notificationCenterDelegate);
            if (BuildVars.DEBUG_VERSION && !alreadyLogged && arrayList2.size() > 1000) {
                alreadyLogged = true;
                FileLog.e((Throwable) new RuntimeException(ic.a.i(i10, "Total observers more than 1000, need check for memory leak. ")), true);
            }
        }
    }

    public void checkForExpiredNotifications() {
        ArrayList arrayList = null;
        this.checkForExpiredNotifications = null;
        if (this.allowedNotifications.size() != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < this.allowedNotifications.size(); i10++) {
                long j11 = this.allowedNotifications.valueAt(i10).time;
                if (elapsedRealtime - j11 > 1000) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(Integer.valueOf(this.allowedNotifications.keyAt(i10)));
                } else {
                    j10 = Math.min(j11, j10);
                }
            }
            if (arrayList != null) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    onAnimationFinish(((Integer) arrayList.get(i11)).intValue());
                }
            }
            if (j10 != Long.MAX_VALUE) {
                AndroidUtilities.runOnUIThread(new xg(this, 0), Math.max(17L, 5017 - (elapsedRealtime - j10)));
            }
        }
    }

    private static boolean containsObserver(ArrayList<NotificationCenterDelegate> arrayList, NotificationCenterDelegate notificationCenterDelegate) {
        NotificationCenterDelegate unwrap = unwrap(notificationCenterDelegate);
        if (unwrap == null) {
            return false;
        }
        if (arrayList instanceof UniqArrayList) {
            if (!arrayList.contains(unwrap) && !arrayList.contains(new WeakDelegate(unwrap))) {
                return false;
            }
            return true;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            NotificationCenterDelegate notificationCenterDelegate2 = arrayList.get(i10);
            if (unwrap.equals(notificationCenterDelegate2) || ((notificationCenterDelegate2 instanceof WeakDelegate) && ((WeakDelegate) notificationCenterDelegate2).reference.get() == unwrap)) {
                return true;
            }
        }
        return false;
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
                StringBuilder n10 = c3.h0.n("key=", keyAt, " CHANGED: ", intValue, " -> ");
                n10.append(intValue2);
                Log.i("ObserverDiff", n10.toString());
            }
        }
        for (int i11 = 0; i11 < sparseArray2.size(); i11++) {
            int keyAt2 = sparseArray2.keyAt(i11);
            if (sparseArray.get(keyAt2, -1).intValue() == -1) {
                StringBuilder k10 = ic.a.k(keyAt2, "key=", " ADDED (size=");
                k10.append(sparseArray2.valueAt(i11));
                k10.append(")");
                Log.i("ObserverDiff", k10.toString());
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

    private static boolean isContextDestroyed(Context context) {
        if (context == null) {
            return false;
        }
        if (context instanceof Activity) {
            return ((Activity) context).isDestroyed();
        }
        if (!(context instanceof ContextWrapper)) {
            return false;
        }
        return isContextDestroyed(((ContextWrapper) context).getBaseContext());
    }

    public void lambda$checkForExpiredNotifications$0() {
        this.checkForExpiredNotifications = new xg(this, 1);
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
        getGlobalInstance().listen(view, emojiLoaded, new g1(view, 2));
    }

    private void postNotificationDebounced(int i10, Object[] objArr) {
        int hashCode = (Arrays.hashCode(objArr) << 16) + i10;
        if (this.alreadyPostedRunnubles.indexOfKey(hashCode) >= 0) {
            return;
        }
        f5 f5Var = new f5(this, i10, objArr, hashCode);
        this.alreadyPostedRunnubles.put(hashCode, f5Var);
        AndroidUtilities.runOnUIThread(f5Var, 250L);
    }

    public void removeObserverInternal(NotificationCenterDelegate notificationCenterDelegate, int i10) {
        NotificationCenterDelegate notificationCenterDelegate2;
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
            NotificationCenterDelegate unwrap = unwrap(notificationCenterDelegate);
            if (arrayList2 instanceof UniqArrayList) {
                arrayList2.remove(notificationCenterDelegate);
                if (unwrap != null) {
                    arrayList2.remove(unwrap);
                    arrayList2.remove(new WeakDelegate(unwrap));
                    return;
                }
                return;
            }
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                NotificationCenterDelegate notificationCenterDelegate3 = arrayList2.get(size);
                if (notificationCenterDelegate.equals(notificationCenterDelegate3)) {
                    arrayList2.remove(size);
                } else if ((notificationCenterDelegate3 instanceof WeakDelegate) && ((notificationCenterDelegate2 = (NotificationCenterDelegate) ((WeakDelegate) notificationCenterDelegate3).reference.get()) == null || notificationCenterDelegate2 == unwrap)) {
                    arrayList2.remove(size);
                }
            }
        }
    }

    public static void sanitize() {
        sanitizeInternal(globalInstance);
        for (NotificationCenter notificationCenter : Instance) {
            sanitizeInternal(notificationCenter);
        }
    }

    private static void sanitizeInternal(NotificationCenter notificationCenter) {
        if (notificationCenter != null) {
            for (int i10 = 0; i10 < notificationCenter.observers.size(); i10++) {
                int keyAt = notificationCenter.observers.keyAt(i10);
                ArrayList<NotificationCenterDelegate> valueAt = notificationCenter.observers.valueAt(i10);
                for (int size = valueAt.size() - 1; size >= 0; size--) {
                    NotificationCenterDelegate notificationCenterDelegate = valueAt.get(size);
                    if (notificationCenterDelegate instanceof WeakDelegate) {
                        if (((WeakDelegate) notificationCenterDelegate).reference.get() == null) {
                            valueAt.remove(size);
                        }
                    } else if (!(notificationCenterDelegate instanceof WeakObserversGroupImpl) && !(notificationCenterDelegate instanceof BaseController)) {
                        if (notificationCenterDelegate instanceof Context) {
                            if (isContextDestroyed((Context) notificationCenterDelegate)) {
                                FileLog.e("MEMORY_LEAK observer " + keyAt + " with destroyed Context");
                                valueAt.remove(size);
                            }
                        } else if (notificationCenterDelegate instanceof View) {
                            if (isContextDestroyed(((View) notificationCenterDelegate).getContext())) {
                                FileLog.e("MEMORY_LEAK observer " + keyAt + " with View with destroyed Context");
                                valueAt.remove(size);
                            }
                        } else if (notificationCenterDelegate instanceof org.telegram.ui.ActionBar.r2) {
                            if (((org.telegram.ui.ActionBar.r2) notificationCenterDelegate).isFinished) {
                                FileLog.e("MEMORY_LEAK observer " + keyAt + " with destroyed BaseFragment");
                                valueAt.remove(size);
                            }
                        } else if ((notificationCenterDelegate instanceof org.telegram.ui.ActionBar.k3) && ((org.telegram.ui.ActionBar.k3) notificationCenterDelegate).isDismissed()) {
                            FileLog.e("MEMORY_LEAK observer " + keyAt + " with destroyed BottomSheet");
                            valueAt.remove(size);
                        }
                    }
                }
            }
        }
    }

    private boolean shouldDebounce(int i10, Object[] objArr) {
        if (i10 == updateInterfaces) {
            return true;
        }
        return false;
    }

    private static NotificationCenterDelegate unwrap(NotificationCenterDelegate notificationCenterDelegate) {
        if (notificationCenterDelegate instanceof WeakDelegate) {
            return (NotificationCenterDelegate) ((WeakDelegate) notificationCenterDelegate).reference.get();
        }
        return notificationCenterDelegate;
    }

    @Deprecated(since = "use createWeakObserversGroup or createObserversGroup")
    public void addObserver(NotificationCenterDelegate notificationCenterDelegate, int i10) {
        addObserverInternal(notificationCenterDelegate, i10);
    }

    public void addPostponeNotificationsCallback(PostponeNotificationCallback postponeNotificationCallback) {
        if (BuildVars.DEBUG_VERSION && Thread.currentThread() != ApplicationLoader.applicationHandler.getLooper().getThread()) {
            throw new RuntimeException("PostponeNotificationsCallback allowed only from MAIN thread");
        }
        if (!this.postponeCallbackList.contains(postponeNotificationCallback)) {
            this.postponeCallbackList.add(postponeNotificationCallback);
        }
    }

    public void addWeakObserver(NotificationCenterDelegate notificationCenterDelegate, int i10) {
        if (notificationCenterDelegate == null) {
            return;
        }
        addObserverInternal(new WeakDelegate(notificationCenterDelegate), i10);
    }

    public ObserversGroup createObserversGroup(NotificationCenterDelegate notificationCenterDelegate) {
        return new ObserversGroupImpl(notificationCenterDelegate);
    }

    public ObserversGroup createWeakObserversGroup(NotificationCenterDelegate notificationCenterDelegate) {
        return new WeakObserversGroupImpl(notificationCenterDelegate);
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
        ArrayList<NotificationCenterDelegate> arrayList = this.observers.get(i10);
        if (arrayList == null) {
            return null;
        }
        ArrayList<NotificationCenterDelegate> arrayList2 = new ArrayList<>(arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            NotificationCenterDelegate unwrap = unwrap(arrayList.get(i11));
            if (unwrap != null) {
                arrayList2.add(unwrap);
            }
        }
        return arrayList2;
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
                    NotificationCenter.this.addObserverInternal(notificationCenterDelegate, i10);
                }

                @Override
                public void onViewDetachedFromWindow(View view2) {
                    NotificationCenter.this.removeObserver(notificationCenterDelegate, i10);
                }
            };
            view.addOnAttachStateChangeListener(onAttachStateChangeListener);
            return new bi.sb(this, view, onAttachStateChangeListener, notificationCenterDelegate, i10, 12);
        }
        return new a2(19);
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
                        addObserverInternal(arrayList3.get(i17), keyAt2);
                    }
                }
                this.addAfterBroadcast.clear();
            }
        }
    }

    public void postNotificationNameOnUIThread(int i10, Object... objArr) {
        AndroidUtilities.runOnUIThread(new y4(this, i10, objArr, 19));
    }

    public void removeDelayed(Runnable runnable) {
        this.delayedRunnables.remove(runnable);
    }

    public void removeObserver(NotificationCenterDelegate notificationCenterDelegate, int i10) {
        removeObserverInternal(notificationCenterDelegate, i10);
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
                postNotificationNameInternal(delayedPost.f19551id, true, delayedPost.args);
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
            xg xgVar = new xg(this, 1);
            this.checkForExpiredNotifications = xgVar;
            AndroidUtilities.runOnUIThread(xgVar, 5017L);
        }
        return this.animationInProgressPointer;
    }

    public static void lambda$listen$3() {
    }
}
