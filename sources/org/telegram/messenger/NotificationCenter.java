package org.telegram.messenger;

import android.os.SystemClock;
import android.util.Log;
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
    public static final int activeAuctionsUpdated = 241;
    public static final int activeGroupCallsUpdated = 169;
    public static final int activityPermissionsGranted = 313;
    public static final int adminedChannelsLoaded = 237;
    public static final int albumsDidLoad = 160;
    public static boolean alreadyLogged = false;
    public static final int animatedEmojiDocumentLoaded = 115;
    public static final int appConfigUpdated = 240;
    public static final int appDidLogout = 177;
    public static final int appUpdateAvailable = 288;
    public static final int appUpdateLoading = 289;
    public static final int applyGroupCallVisibleParticipants = 170;
    public static final int archivedStickersCountDidLoad = 87;
    public static final int articleClosed = 91;
    public static final int attachMenuBotsDidLoad = 294;
    public static final int audioDidSent = 161;
    public static final int audioRecordTooShort = 162;
    public static final int audioRouteChanged = 163;
    public static final int availableEffectsUpdate = 216;
    public static final int billingConfirmPurchaseError = 308;
    public static final int billingProductDetailsUpdated = 307;
    public static final int blockedUsersDidLoad = 43;
    public static final int bookmarkAdded = 122;
    public static final int boostByChannelCreated = 190;
    public static final int boostedChannelByUser = 189;
    public static final int botDownloadsUpdate = 234;
    public static final int botForumDraftDelete = 335;
    public static final int botForumDraftUpdate = 334;
    public static final int botForumTopicDidCreate = 333;
    public static final int botInfoDidLoad = 66;
    public static final int botKeyboardDidLoad = 69;
    public static final int botStarsTransactionsLoaded = 225;
    public static final int botStarsUpdated = 224;
    public static final int businessLinkCreated = 125;
    public static final int businessLinksUpdated = 124;
    public static final int businessMessagesUpdated = 119;
    public static final int callTabsVisibleToggled = 338;
    public static final int cameraInitied = 257;
    public static final int changeRepliesCounter = 13;
    public static final int channelConnectedBotsUpdate = 236;
    public static final int channelRecommendationsLoaded = 200;
    public static final int channelRightsUpdated = 89;
    public static final int channelStarsUpdated = 226;
    public static final int channelSuggestedBotsUpdate = 235;
    public static final int chatAvailableReactionsUpdated = 295;
    public static final int chatDidCreated = 28;
    public static final int chatDidFailCreate = 29;
    public static final int chatInfoCantLoad = 31;
    public static final int chatInfoDidLoad = 30;
    public static final int chatOnlineCountDidLoad = 94;
    public static final int chatSearchResultsAvailable = 70;
    public static final int chatSearchResultsLoading = 72;
    public static final int chatSwitchedForum = 315;
    public static final int chatWasBoostedByUser = 211;
    public static final int chatlistFolderUpdate = 323;
    public static final int closeChatActivity = 5;
    public static final int closeChats = 4;
    public static final int closeInCallActivity = 173;
    public static final int closeOtherAppActivities = 256;
    public static final int closeProfileActivity = 6;
    public static final int closeSearchByActiveAction = 280;
    public static final int commentsRead = 12;
    public static final int commonChatsLoaded = 239;
    public static final int conferenceEmojiUpdated = 242;
    public static final int configLoaded = 178;
    public static final int contactsDidLoad = 25;
    public static final int contactsImported = 26;
    public static final int contactsPermissionBadgeCheck = 339;
    public static final int contentSettingsLoaded = 243;
    public static final int currentUserPremiumStatusChanged = 303;
    public static final int currentUserShowLimitReachedDialog = 306;
    public static final int customStickerCreated = 214;
    public static final int customTypefacesLoaded = 326;
    public static final int dialogDeleted = 112;
    public static final int dialogFiltersUpdated = 183;
    public static final int dialogIsTranslatable = 129;
    public static final int dialogPhotosLoaded = 38;
    public static final int dialogPhotosUpdate = 199;
    public static final int dialogTranslate = 130;
    public static final int dialogsNeedReload = 3;
    public static final int dialogsUnreadCounterChanged = 146;
    public static final int dialogsUnreadPollVotesCounterChanged = 297;
    public static final int dialogsUnreadReactionsCounterChanged = 296;
    public static final int diceStickersDidLoad = 61;
    public static final int didApplyNewTheme = 261;
    public static final int didClearDatabase = 283;
    public static final int didCreatedNewDeleteTask = 45;
    public static final int didEndCall = 172;
    public static final int didGenerateFingerprintKeyPair = 131;
    public static final int didLoadChatAdmins = 108;
    public static final int didLoadChatInviter = 107;
    public static final int didLoadPinnedMessages = 56;
    public static final int didLoadSendAsPeers = 16;
    public static final int didLoadSponsoredMessages = 15;
    public static final int didReceiveCall = 253;
    public static final int didReceiveNewMessages = 1;
    public static final int didReceiveSmsCode = 252;
    public static final int didReceivedWebpages = 58;
    public static final int didReceivedWebpagesInUpdates = 59;
    public static final int didRemoveTwoStepPassword = 54;
    public static final int didReplacedPhotoInMemCache = 258;
    public static final int didSetNewTheme = 259;
    public static final int didSetNewWallpapper = 271;
    public static final int didSetOrRemoveTwoStepPassword = 53;
    public static final int didSetPasscode = 50;
    public static final int didStartedCall = 164;
    public static final int didStartedMultiGiftsSelector = 188;
    public static final int didUpdateConnectionState = 136;
    public static final int didUpdateExtendedMedia = 103;
    public static final int didUpdateGlobalAutoDeleteTimer = 316;
    public static final int didUpdateMessagesViews = 77;
    public static final int didUpdatePollResults = 93;
    public static final int didUpdatePremiumGiftFieldIcon = 193;
    public static final int didUpdatePremiumGiftStickers = 191;
    public static final int didUpdateReactions = 102;
    public static final int didUpdateTonGiftStickers = 192;
    public static final int didVerifyMessagesStickers = 104;
    public static final int emojiKeywordsLoaded = 206;
    public static final int emojiLoaded = 254;
    public static final int emojiPreviewThemesChanged = 292;
    public static final int encryptedChatCreated = 37;
    public static final int encryptedChatUpdated = 35;
    public static final int factCheckLoaded = 223;
    public static final int featuredEmojiDidLoad = 63;
    public static final int featuredStickersDidLoad = 62;
    public static final int fileLoadFailed = 142;
    public static final int fileLoadProgressChanged = 140;
    public static final int fileLoaded = 141;
    public static final int fileNewChunkAvailable = 144;
    public static final int filePreparingFailed = 145;
    public static final int filePreparingStarted = 143;
    public static final int fileUploadFailed = 138;
    public static final int fileUploadProgressChanged = 139;
    public static final int fileUploaded = 137;
    public static final int filterSettingsUpdated = 184;
    public static final int folderBecomeEmpty = 40;
    public static final int forceImportContactsStart = 24;
    public static final int giftsToUserSent = 187;
    private static volatile NotificationCenter globalInstance = null;
    public static final int goingToPreviewTheme = 266;
    public static final int groupCallScreencastStateChanged = 168;
    public static final int groupCallSpeakingUsersUpdated = 167;
    public static final int groupCallTypingsUpdated = 171;
    public static final int groupCallUpdated = 165;
    public static final int groupCallVisibilityChanged = 174;
    public static final int groupPackUpdated = 212;
    public static final int groupRestrictionsUnlockedByBoosts = 210;
    public static final int groupStickersDidLoad = 64;
    public static final int hasNewContactsToImport = 27;
    public static final int hashtagSearchUpdated = 71;
    public static final int historyCleared = 8;
    public static final int historyImportProgressChanged = 109;
    public static final int httpFileDidFailedLoad = 135;
    public static final int httpFileDidLoad = 134;
    public static final int invalidateMotionBackground = 255;
    public static final int joinedGroup = 248;
    public static final int liveLocationsCacheChanged = 277;
    public static final int liveLocationsChanged = 275;
    public static final int liveStoryMessageUpdate = 176;
    public static final int liveStoryUpdated = 175;
    public static final int loadingMessagesFailed = 19;
    public static final int locationPermissionDenied = 268;
    public static final int locationPermissionGranted = 267;
    public static final int mainUserInfoChanged = 46;
    public static final int mediaCountDidLoad = 33;
    public static final int mediaCountsDidLoad = 34;
    public static final int mediaDidLoad = 32;
    public static final int memoryLeakFoundException = 337;
    public static final int messagePlayingDidReset = 148;
    public static final int messagePlayingDidSeek = 151;
    public static final int messagePlayingDidStart = 150;
    public static final int messagePlayingGoingToStop = 152;
    public static final int messagePlayingPlayStateChanged = 149;
    public static final int messagePlayingProgressDidChanged = 147;
    public static final int messagePlayingSpeedChanged = 281;
    public static final int messageReceivedByAck = 20;
    public static final int messageReceivedByServer = 21;
    public static final int messageReceivedByServer2 = 22;
    public static final int messageSendError = 23;
    public static final int messageTranslated = 127;
    public static final int messageTranslating = 128;
    public static final int messagesDeleted = 7;
    public static final int messagesDidLoad = 14;
    public static final int messagesDidLoadWithoutProcess = 18;
    public static final int messagesFeeUpdated = 238;
    public static final int messagesRead = 9;
    public static final int messagesReadContent = 65;
    public static final int messagesReadEncrypted = 36;
    public static final int monoForumMessagesRead = 11;
    public static final int moreMusicDidLoad = 74;
    public static final int musicDidLoad = 73;
    public static final int musicIdsLoaded = 245;
    public static final int musicListLoaded = 244;
    public static final int nearEarEvent = 330;
    public static final int needAddArchivedStickers = 86;
    public static final int needCheckSystemBarColors = 263;
    public static final int needDeleteBusinessLink = 126;
    public static final int needDeleteDialog = 179;
    public static final int needReloadRecentDialogsSearch = 78;
    public static final int needSetDayNightTheme = 265;
    public static final int needShareTheme = 264;
    public static final int needShowAlert = 75;
    public static final int needShowPlayServicesAlert = 76;
    public static final int newDraftReceived = 84;
    public static final int newEmojiSuggestionsAvailable = 180;
    public static final int newLocationAvailable = 276;
    public static final int newPeopleNearbyAvailable = 96;
    public static final int newSessionReceived = 57;
    public static final int newSuggestionsAvailable = 106;
    public static final int notificationsCountUpdated = 278;
    public static final int notificationsSettingsUpdated = 42;
    public static final int onActivityResultReceived = 300;
    public static final int onDatabaseMigration = 290;
    public static final int onDatabaseOpened = 298;
    public static final int onDatabaseReset = 317;
    public static final int onDownloadingFilesChanged = 299;
    public static final int onEmojiInteractionsReceived = 291;
    public static final int onReceivedChannelDifference = 328;
    public static final int onRequestPermissionResultReceived = 301;
    public static final int onUserRingtonesUpdated = 302;
    public static final int openArticle = 90;
    public static final int openBoostForUsersDialog = 209;
    public static final int openedChatChanged = 44;
    public static final int passcodeDismissed = 51;
    public static final int paymentFinished = 88;
    public static final int peerSettingsDidLoad = 79;
    public static final int permissionsGranted = 312;
    public static final int pinnedInfoDidLoad = 68;
    public static final int playerDidStartPlaying = 279;
    public static final int premiumFloodWaitReceived = 215;
    public static final int premiumPromoUpdated = 304;
    public static final int premiumStatusChangedGlobal = 305;
    public static final int premiumStickersPreviewLoaded = 309;
    public static final int privacyRulesUpdated = 47;
    public static final int profileMusicUpdated = 246;
    public static final int proxyChangedByRotation = 274;
    public static final int proxyCheckDone = 273;
    public static final int proxySettingsChanged = 272;
    public static final int pushMessagesUpdated = 249;
    public static final int quickRepliesDeleted = 121;
    public static final int quickRepliesUpdated = 120;
    public static final int reactionsDidLoad = 293;
    public static final int recentDocumentsDidLoad = 85;
    public static final int recentEmojiStatusesUpdate = 116;
    public static final int recordPaused = 157;
    public static final int recordProgressChanged = 153;
    public static final int recordResumed = 158;
    public static final int recordStartError = 155;
    public static final int recordStarted = 154;
    public static final int recordStopped = 156;
    public static final int reloadDialogPhotos = 39;
    public static final int reloadHints = 81;
    public static final int reloadInlineHints = 82;
    public static final int reloadInterface = 269;
    public static final int reloadWebappsHints = 83;
    public static final int removeAllMessagesFromDialog = 41;
    public static final int replaceMessagesObjects = 49;
    public static final int replyMessagesDidLoad = 55;
    public static final int requestPermissions = 311;
    public static final int savedMessagesDialogsUpdate = 201;
    public static final int savedMessagesForwarded = 205;
    public static final int savedReactionTagsUpdate = 202;
    public static final int scheduledMessagesUpdated = 105;
    public static final int screenStateChanged = 282;
    public static final int screenshotTook = 159;
    public static final int sendingMessagesChanged = 101;
    public static final int showBulletin = 287;
    public static final int smsJobStatusUpdate = 207;
    public static final int starBalanceUpdated = 220;
    public static final int starGiftOptionsLoaded = 218;
    public static final int starGiftSoldOut = 232;
    public static final int starGiftsLoaded = 229;
    public static final int starGiveawayOptionsLoaded = 219;
    public static final int starOptionsLoaded = 217;
    public static final int starReactionAnonymousUpdate = 123;
    public static final int starSubscriptionsLoaded = 222;
    public static final int starTransactionsLoaded = 221;
    public static final int starUserGiftCollectionsLoaded = 231;
    public static final int starUserGiftsLoaded = 230;
    public static final int startAllHeavyOperations = 98;
    public static final int startSpoilers = 100;
    public static final int stealthModeChanged = 327;
    public static final int stickersDidLoad = 60;
    public static final int stickersImportComplete = 111;
    public static final int stickersImportProgressChanged = 110;
    public static final int stopAllHeavyOperations = 97;
    public static final int stopSpoilers = 99;
    public static final int storiesBlocklistUpdate = 195;
    public static final int storiesDraftsUpdated = 322;
    public static final int storiesEnabledUpdate = 194;
    public static final int storiesLimitUpdate = 196;
    public static final int storiesListUpdated = 321;
    public static final int storiesReadUpdated = 329;
    public static final int storiesSendAsUpdate = 197;
    public static final int storiesUpdated = 319;
    public static final int storyAlbumsCollectionsUpdate = 204;
    public static final int storyDeleted = 320;
    public static final int storyGroupCallUpdated = 166;
    public static final int storyQualityUpdate = 208;
    public static final int suggestedFiltersLoaded = 185;
    public static final int suggestedLangpack = 270;
    public static final int themeAccentListUpdated = 262;
    public static final int themeListUpdated = 260;
    public static final int themeUploadError = 182;
    public static final int themeUploadedToServer = 181;
    public static final int threadMessagesRead = 10;
    public static final int timezonesUpdated = 213;
    public static final int tlSchemeParseException = 336;
    public static final int topicsDidLoaded = 314;
    private static int totalEvents = 340;
    public static final int translationModelDownloaded = 332;
    public static final int translationModelDownloading = 331;
    public static final int twoStepPasswordChanged = 52;
    public static final int unconfirmedAuthUpdate = 198;
    public static final int updateAllMessages = 228;
    public static final int updateBotMenuButton = 186;
    public static final int updateDefaultSendAsPeer = 17;
    public static final int updateInterfaces = 2;
    public static final int updateMentionsCount = 92;
    public static final int updateMessageMedia = 48;
    public static final int updateSearchSettings = 117;
    public static final int updateStories = 233;
    public static final int updateTranscriptionLock = 118;
    public static final int updatedChatRanks = 247;
    public static final int uploadStoryEnd = 325;
    public static final int uploadStoryProgress = 324;
    public static final int userEmojiStatusUpdated = 310;
    public static final int userInfoDidLoad = 67;
    public static final int userIsPremiumBlockedUpadted = 203;
    public static final int videoLoadingStateChanged = 95;
    public static final int voiceTranscriptionUpdate = 114;
    public static final int voipServiceCreated = 284;
    public static final int walletPendingTransactionsChanged = 132;
    public static final int walletSyncProgressChanged = 133;
    public static final int wallpaperSettedToUser = 318;
    public static final int wallpapersDidLoad = 250;
    public static final int wallpapersNeedReload = 251;
    public static final int wasUnableToFindCurrentLocation = 80;
    public static final int webRtcMicAmplitudeEvent = 285;
    public static final int webRtcSpeakerAmplitudeEvent = 286;
    public static final int webViewResolved = 227;
    public static final int webViewResultSent = 113;
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

    private static class DelayedPost {
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
                try {
                    notificationCenter = Instance[i];
                    if (notificationCenter == null) {
                        NotificationCenter[] notificationCenterArr = Instance;
                        NotificationCenter notificationCenter2 = new NotificationCenter(i);
                        notificationCenterArr[i] = notificationCenter2;
                        notificationCenter = notificationCenter2;
                    }
                } finally {
                }
            }
        }
        return notificationCenter;
    }

    public static NotificationCenter getGlobalInstance() {
        NotificationCenter notificationCenter = globalInstance;
        if (notificationCenter == null) {
            synchronized (NotificationCenter.class) {
                try {
                    notificationCenter = globalInstance;
                    if (notificationCenter == null) {
                        notificationCenter = new NotificationCenter(-1);
                        globalInstance = notificationCenter;
                    }
                } finally {
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
            NotificationCenter$$ExternalSyntheticLambda11 notificationCenter$$ExternalSyntheticLambda11 = new NotificationCenter$$ExternalSyntheticLambda11(this);
            this.checkForExpiredNotifications = notificationCenter$$ExternalSyntheticLambda11;
            AndroidUtilities.runOnUIThread(notificationCenter$$ExternalSyntheticLambda11, 5017L);
        }
        return this.animationInProgressPointer;
    }

    public void checkForExpiredNotifications() {
        ArrayList arrayList = null;
        this.checkForExpiredNotifications = null;
        if (this.allowedNotifications.size() == 0) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMin = Long.MAX_VALUE;
        for (int i = 0; i < this.allowedNotifications.size(); i++) {
            long j = this.allowedNotifications.valueAt(i).time;
            if (jElapsedRealtime - j > 1000) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(Integer.valueOf(this.allowedNotifications.keyAt(i)));
            } else {
                jMin = Math.min(j, jMin);
            }
        }
        if (arrayList != null) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                onAnimationFinish(((Integer) arrayList.get(i2)).intValue());
            }
        }
        if (jMin != Long.MAX_VALUE) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$checkForExpiredNotifications$0();
                }
            }, Math.max(17L, 5017 - (jElapsedRealtime - jMin)));
        }
    }

    public void lambda$checkForExpiredNotifications$0() {
        this.checkForExpiredNotifications = new NotificationCenter$$ExternalSyntheticLambda11(this);
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
                this.f$0.lambda$postNotificationNameOnUIThread$1(i, objArr);
            }
        });
    }

    public void lambda$postNotificationNameOnUIThread$1(int i, Object... objArr) {
        boolean z = true;
        boolean z2 = i == startAllHeavyOperations || i == stopAllHeavyOperations || i == didReplacedPhotoInMemCache || i == closeChats || i == invalidateMotionBackground || i == needCheckSystemBarColors || i == messageReceivedByServer2;
        ArrayList arrayList = null;
        if (z2 || this.allowedNotifications.size() <= 0) {
            z = z2;
        } else {
            int size = this.allowedNotifications.size();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            int i2 = 0;
            for (int i3 = 0; i3 < this.allowedNotifications.size(); i3++) {
                AllowedNotifications allowedNotificationsValueAt = this.allowedNotifications.valueAt(i3);
                if (jElapsedRealtime - allowedNotificationsValueAt.time > 5017) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(Integer.valueOf(this.allowedNotifications.keyAt(i3)));
                }
                int[] iArr = allowedNotificationsValueAt.allowedIds;
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
            if (size != i2) {
                z = false;
            }
        }
        if (i == startAllHeavyOperations) {
            this.currentHeavyOperationFlags = (~((Integer) objArr[0]).intValue()) & this.currentHeavyOperationFlags;
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
        final int iHashCode = (Arrays.hashCode(objArr) << 16) + i;
        if (this.alreadyPostedRunnubles.indexOfKey(iHashCode) >= 0) {
            return;
        }
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$postNotificationDebounced$2(i, objArr, iHashCode);
            }
        };
        this.alreadyPostedRunnubles.put(iHashCode, runnable);
        AndroidUtilities.runOnUIThread(runnable, 250L);
    }

    public void lambda$postNotificationDebounced$2(int i, Object[] objArr, int i2) {
        postNotificationNameInternal(i, false, objArr);
        this.alreadyPostedRunnubles.remove(i2);
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
                    int iKeyAt = this.removeAfterBroadcast.keyAt(i5);
                    ArrayList<NotificationCenterDelegate> arrayList2 = this.removeAfterBroadcast.get(iKeyAt);
                    for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                        removeObserver(arrayList2.get(i6), iKeyAt);
                    }
                }
                this.removeAfterBroadcast.clear();
            }
            if (this.addAfterBroadcast.size() != 0) {
                for (int i7 = 0; i7 < this.addAfterBroadcast.size(); i7++) {
                    int iKeyAt2 = this.addAfterBroadcast.keyAt(i7);
                    ArrayList<NotificationCenterDelegate> arrayList3 = this.addAfterBroadcast.get(iKeyAt2);
                    for (int i8 = 0; i8 < arrayList3.size(); i8++) {
                        addObserver(arrayList3.get(i8), iKeyAt2);
                    }
                }
                this.addAfterBroadcast.clear();
            }
        }
    }

    public void updateObserver(boolean z, NotificationCenterDelegate notificationCenterDelegate, int i) {
        if (z) {
            addObserver(notificationCenterDelegate, i);
        } else {
            removeObserver(notificationCenterDelegate, i);
        }
    }

    public static class ObserversGroup {
        private NotificationCenterDelegate delegate;
        private NotificationCenter notificationCenter;
        private final ArrayList<Observer> observers;

        private ObserversGroup(NotificationCenter notificationCenter, NotificationCenterDelegate notificationCenterDelegate) {
            this.observers = new ArrayList<>();
            this.notificationCenter = notificationCenter;
            this.delegate = notificationCenterDelegate;
        }

        private static class Observer {
            private final int id;
            private final NotificationCenterDelegate observer;

            private Observer(NotificationCenterDelegate notificationCenterDelegate, int i) {
                this.observer = notificationCenterDelegate;
                this.id = i;
            }
        }

        public ObserversGroup add(int i) {
            this.notificationCenter.addObserver(this.delegate, i);
            this.observers.add(new Observer(this.delegate, i));
            return this;
        }

        public void removeAllObservers() {
            Iterator<Observer> it = this.observers.iterator();
            while (it.hasNext()) {
                Observer next = it.next();
                this.notificationCenter.removeObserver(next.observer, next.id);
            }
            this.observers.clear();
            this.notificationCenter = null;
            this.delegate = null;
        }
    }

    public ObserversGroup createObserversGroup(NotificationCenterDelegate notificationCenterDelegate) {
        return new ObserversGroup(notificationCenterDelegate);
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
            ArrayList<NotificationCenterDelegate> arrayListCreateArrayForId = createArrayForId(i);
            sparseArray.put(i, arrayListCreateArrayForId);
            arrayList2 = arrayListCreateArrayForId;
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

    private static class AllowedNotifications {
        int[] allowedIds;
        final long time;

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
        final View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() {
            @Override
            public void onViewAttachedToWindow(View view2) {
                NotificationCenter.getGlobalInstance().addObserver(notificationCenterDelegate, i);
            }

            @Override
            public void onViewDetachedFromWindow(View view2) {
                NotificationCenter.getGlobalInstance().removeObserver(notificationCenterDelegate, i);
            }
        };
        view.addOnAttachStateChangeListener(onAttachStateChangeListener);
        return new Runnable() {
            @Override
            public final void run() {
                NotificationCenter.lambda$listenGlobal$5(view, onAttachStateChangeListener, notificationCenterDelegate, i);
            }
        };
    }

    public static void lambda$listenGlobal$4(int i, Utilities.Callback callback, int i2, int i3, Object[] objArr) {
        if (i2 == i) {
            callback.run(objArr);
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
        final View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() {
            @Override
            public void onViewAttachedToWindow(View view2) {
                NotificationCenter.this.addObserver(notificationCenterDelegate, i);
            }

            @Override
            public void onViewDetachedFromWindow(View view2) {
                NotificationCenter.this.removeObserver(notificationCenterDelegate, i);
            }
        };
        view.addOnAttachStateChangeListener(onAttachStateChangeListener);
        return new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$listen$8(view, onAttachStateChangeListener, notificationCenterDelegate, i);
            }
        };
    }

    public static void lambda$listen$7(int i, Utilities.Callback callback, int i2, int i3, Object[] objArr) {
        if (i2 == i) {
            callback.run(objArr);
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
        final NotificationCenterDelegate[] notificationCenterDelegateArr = {notificationCenterDelegate};
        NotificationCenterDelegate notificationCenterDelegate = new NotificationCenterDelegate() {
            @Override
            public final void didReceivedNotification(int i2, int i3, Object[] objArr) {
                this.f$0.lambda$listenOnce$10(i, notificationCenterDelegateArr, runnable, i2, i3, objArr);
            }
        };
        addObserver(notificationCenterDelegate, i);
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

    public void listenOnce(final int i, final Utilities.Callback3<Integer, Object[], Runnable> callback3) {
        final NotificationCenterDelegate[] notificationCenterDelegateArr = {notificationCenterDelegate};
        NotificationCenterDelegate notificationCenterDelegate = new NotificationCenterDelegate() {
            @Override
            public final void didReceivedNotification(int i2, int i3, Object[] objArr) {
                this.f$0.lambda$listenOnce$12(i, notificationCenterDelegateArr, callback3, i2, i3, objArr);
            }
        };
        addObserver(notificationCenterDelegate, i);
    }

    public void lambda$listenOnce$12(final int i, final NotificationCenterDelegate[] notificationCenterDelegateArr, Utilities.Callback3 callback3, int i2, int i3, Object[] objArr) {
        if (i2 != i || notificationCenterDelegateArr[0] == null || callback3 == null) {
            return;
        }
        callback3.run(Integer.valueOf(i3), objArr, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$listenOnce$11(notificationCenterDelegateArr, i);
            }
        });
    }

    public void lambda$listenOnce$11(NotificationCenterDelegate[] notificationCenterDelegateArr, int i) {
        removeObserver(notificationCenterDelegateArr[0], i);
        notificationCenterDelegateArr[0] = null;
    }

    private class UniqArrayList<T> extends ArrayList<T> {
        HashSet<T> set;

        private UniqArrayList() {
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

    public int getObserversSize() {
        int size = 0;
        for (int i = 0; i < this.observers.size(); i++) {
            ArrayList<NotificationCenterDelegate> arrayListValueAt = this.observers.valueAt(i);
            if (arrayListValueAt != null) {
                size += arrayListValueAt.size();
            }
        }
        return size;
    }

    public SparseArray<Integer> dumpObservers() {
        SparseArray<Integer> sparseArray = new SparseArray<>();
        for (int i = 0; i < this.observers.size(); i++) {
            int iKeyAt = this.observers.keyAt(i);
            ArrayList<NotificationCenterDelegate> arrayListValueAt = this.observers.valueAt(i);
            sparseArray.put(iKeyAt, Integer.valueOf(arrayListValueAt != null ? arrayListValueAt.size() : 0));
        }
        return sparseArray;
    }

    public static void diffObserverDumps(SparseArray<Integer> sparseArray, SparseArray<Integer> sparseArray2) {
        for (int i = 0; i < sparseArray.size(); i++) {
            int iKeyAt = sparseArray.keyAt(i);
            int iIntValue = sparseArray.valueAt(i).intValue();
            int iIntValue2 = sparseArray2.get(iKeyAt, -1).intValue();
            if (iIntValue2 == -1) {
                Log.i("ObserverDiff", "key=" + iKeyAt + " REMOVED (was " + iIntValue + ")");
            } else if (iIntValue != iIntValue2) {
                Log.i("ObserverDiff", "key=" + iKeyAt + " CHANGED: " + iIntValue + " -> " + iIntValue2);
            }
        }
        for (int i2 = 0; i2 < sparseArray2.size(); i2++) {
            int iKeyAt2 = sparseArray2.keyAt(i2);
            if (sparseArray.get(iKeyAt2, -1).intValue() == -1) {
                Log.i("ObserverDiff", "key=" + iKeyAt2 + " ADDED (size=" + sparseArray2.valueAt(i2) + ")");
            }
        }
    }
}
