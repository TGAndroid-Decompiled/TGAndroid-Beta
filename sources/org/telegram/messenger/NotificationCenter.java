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
    public static final int activeGroupCallsUpdated = 166;
    public static final int activityPermissionsGranted = 297;
    public static final int adminedChannelsLoaded = 229;
    public static final int albumsDidLoad = 158;
    public static boolean alreadyLogged = false;
    public static final int animatedEmojiDocumentLoaded = 113;
    public static final int appConfigUpdated = 232;
    public static final int appDidLogout = 172;
    public static final int appUpdateAvailable = 273;
    public static final int appUpdateLoading = 274;
    public static final int applyGroupCallVisibleParticipants = 167;
    public static final int archivedStickersCountDidLoad = 85;
    public static final int articleClosed = 89;
    public static final int attachMenuBotsDidLoad = 279;
    public static final int audioDidSent = 159;
    public static final int audioRecordTooShort = 160;
    public static final int audioRouteChanged = 161;
    public static final int availableEffectsUpdate = 209;
    public static final int billingConfirmPurchaseError = 292;
    public static final int billingProductDetailsUpdated = 291;
    public static final int blockedUsersDidLoad = 41;
    public static final int bookmarkAdded = 120;
    public static final int boostByChannelCreated = 185;
    public static final int boostedChannelByUser = 184;
    public static final int botDownloadsUpdate = 226;
    public static final int botInfoDidLoad = 64;
    public static final int botKeyboardDidLoad = 67;
    public static final int botStarsTransactionsLoaded = 218;
    public static final int botStarsUpdated = 217;
    public static final int businessLinkCreated = 123;
    public static final int businessLinksUpdated = 122;
    public static final int businessMessagesUpdated = 117;
    public static final int cameraInitied = 242;
    public static final int changeRepliesCounter = 11;
    public static final int channelConnectedBotsUpdate = 228;
    public static final int channelRecommendationsLoaded = 194;
    public static final int channelRightsUpdated = 87;
    public static final int channelStarsUpdated = 219;
    public static final int channelSuggestedBotsUpdate = 227;
    public static final int chatAvailableReactionsUpdated = 280;
    public static final int chatDidCreated = 26;
    public static final int chatDidFailCreate = 27;
    public static final int chatInfoCantLoad = 29;
    public static final int chatInfoDidLoad = 28;
    public static final int chatOnlineCountDidLoad = 92;
    public static final int chatSearchResultsAvailable = 68;
    public static final int chatSearchResultsLoading = 70;
    public static final int chatSwitchedForum = 299;
    public static final int chatWasBoostedByUser = 204;
    public static final int chatlistFolderUpdate = 306;
    public static final int closeChats = 4;
    public static final int closeInCallActivity = 170;
    public static final int closeOtherAppActivities = 241;
    public static final int closeSearchByActiveAction = 265;
    public static final int commentsRead = 10;
    public static final int commonChatsLoaded = 231;
    public static final int conferenceEmojiUpdated = 233;
    public static final int configLoaded = 173;
    public static final int contactsDidLoad = 23;
    public static final int contactsImported = 24;
    public static final int currentUserPremiumStatusChanged = 287;
    public static final int currentUserShowLimitReachedDialog = 290;
    public static final int customStickerCreated = 207;
    public static final int customTypefacesLoaded = 309;
    public static final int dialogDeleted = 110;
    public static final int dialogFiltersUpdated = 178;
    public static final int dialogIsTranslatable = 127;
    public static final int dialogPhotosLoaded = 36;
    public static final int dialogPhotosUpdate = 193;
    public static final int dialogTranslate = 128;
    public static final int dialogsNeedReload = 3;
    public static final int dialogsUnreadCounterChanged = 144;
    public static final int dialogsUnreadReactionsCounterChanged = 281;
    public static final int diceStickersDidLoad = 59;
    public static final int didApplyNewTheme = 246;
    public static final int didClearDatabase = 268;
    public static final int didCreatedNewDeleteTask = 43;
    public static final int didEndCall = 169;
    public static final int didGenerateFingerprintKeyPair = 129;
    public static final int didLoadChatAdmins = 106;
    public static final int didLoadChatInviter = 105;
    public static final int didLoadPinnedMessages = 54;
    public static final int didLoadSendAsPeers = 14;
    public static final int didLoadSponsoredMessages = 13;
    public static final int didReceiveCall = 238;
    public static final int didReceiveNewMessages = 1;
    public static final int didReceiveSmsCode = 237;
    public static final int didReceivedWebpages = 56;
    public static final int didReceivedWebpagesInUpdates = 57;
    public static final int didRemoveTwoStepPassword = 52;
    public static final int didReplacedPhotoInMemCache = 243;
    public static final int didSetNewTheme = 244;
    public static final int didSetNewWallpapper = 256;
    public static final int didSetOrRemoveTwoStepPassword = 51;
    public static final int didSetPasscode = 48;
    public static final int didStartedCall = 162;
    public static final int didStartedMultiGiftsSelector = 183;
    public static final int didUpdateConnectionState = 134;
    public static final int didUpdateExtendedMedia = 101;
    public static final int didUpdateGlobalAutoDeleteTimer = 300;
    public static final int didUpdateMessagesViews = 75;
    public static final int didUpdatePollResults = 91;
    public static final int didUpdatePremiumGiftFieldIcon = 187;
    public static final int didUpdatePremiumGiftStickers = 186;
    public static final int didUpdateReactions = 100;
    public static final int didVerifyMessagesStickers = 102;
    public static final int emojiKeywordsLoaded = 199;
    public static final int emojiLoaded = 239;
    public static final int emojiPreviewThemesChanged = 277;
    public static final int encryptedChatCreated = 35;
    public static final int encryptedChatUpdated = 33;
    public static final int factCheckLoaded = 216;
    public static final int featuredEmojiDidLoad = 61;
    public static final int featuredStickersDidLoad = 60;
    public static final int fileLoadFailed = 140;
    public static final int fileLoadProgressChanged = 138;
    public static final int fileLoaded = 139;
    public static final int fileNewChunkAvailable = 142;
    public static final int filePreparingFailed = 143;
    public static final int filePreparingStarted = 141;
    public static final int fileUploadFailed = 136;
    public static final int fileUploadProgressChanged = 137;
    public static final int fileUploaded = 135;
    public static final int filterSettingsUpdated = 179;
    public static final int folderBecomeEmpty = 38;
    public static final int forceImportContactsStart = 22;
    public static final int giftsToUserSent = 182;
    private static volatile NotificationCenter globalInstance = null;
    public static final int goingToPreviewTheme = 251;
    public static final int groupCallScreencastStateChanged = 165;
    public static final int groupCallSpeakingUsersUpdated = 164;
    public static final int groupCallTypingsUpdated = 168;
    public static final int groupCallUpdated = 163;
    public static final int groupCallVisibilityChanged = 171;
    public static final int groupPackUpdated = 205;
    public static final int groupRestrictionsUnlockedByBoosts = 203;
    public static final int groupStickersDidLoad = 62;
    public static final int hasNewContactsToImport = 25;
    public static final int hashtagSearchUpdated = 69;
    public static final int historyCleared = 6;
    public static final int historyImportProgressChanged = 107;
    public static final int httpFileDidFailedLoad = 133;
    public static final int httpFileDidLoad = 132;
    public static final int invalidateMotionBackground = 240;
    public static final int liveLocationsCacheChanged = 262;
    public static final int liveLocationsChanged = 260;
    public static final int loadingMessagesFailed = 17;
    public static final int locationPermissionDenied = 253;
    public static final int locationPermissionGranted = 252;
    public static final int mainUserInfoChanged = 44;
    public static final int mediaCountDidLoad = 31;
    public static final int mediaCountsDidLoad = 32;
    public static final int mediaDidLoad = 30;
    public static final int messagePlayingDidReset = 146;
    public static final int messagePlayingDidSeek = 149;
    public static final int messagePlayingDidStart = 148;
    public static final int messagePlayingGoingToStop = 150;
    public static final int messagePlayingPlayStateChanged = 147;
    public static final int messagePlayingProgressDidChanged = 145;
    public static final int messagePlayingSpeedChanged = 266;
    public static final int messageReceivedByAck = 18;
    public static final int messageReceivedByServer = 19;
    public static final int messageReceivedByServer2 = 20;
    public static final int messageSendError = 21;
    public static final int messageTranslated = 125;
    public static final int messageTranslating = 126;
    public static final int messagesDeleted = 5;
    public static final int messagesDidLoad = 12;
    public static final int messagesDidLoadWithoutProcess = 16;
    public static final int messagesFeeUpdated = 230;
    public static final int messagesRead = 7;
    public static final int messagesReadContent = 63;
    public static final int messagesReadEncrypted = 34;
    public static final int monoForumMessagesRead = 9;
    public static final int moreMusicDidLoad = 72;
    public static final int musicDidLoad = 71;
    public static final int nearEarEvent = 313;
    public static final int needAddArchivedStickers = 84;
    public static final int needCheckSystemBarColors = 248;
    public static final int needDeleteBusinessLink = 124;
    public static final int needDeleteDialog = 174;
    public static final int needReloadRecentDialogsSearch = 76;
    public static final int needSetDayNightTheme = 250;
    public static final int needShareTheme = 249;
    public static final int needShowAlert = 73;
    public static final int needShowPlayServicesAlert = 74;
    public static final int newDraftReceived = 82;
    public static final int newEmojiSuggestionsAvailable = 175;
    public static final int newLocationAvailable = 261;
    public static final int newPeopleNearbyAvailable = 94;
    public static final int newSessionReceived = 55;
    public static final int newSuggestionsAvailable = 104;
    public static final int notificationsCountUpdated = 263;
    public static final int notificationsSettingsUpdated = 40;
    public static final int onActivityResultReceived = 284;
    public static final int onDatabaseMigration = 275;
    public static final int onDatabaseOpened = 282;
    public static final int onDatabaseReset = 301;
    public static final int onDownloadingFilesChanged = 283;
    public static final int onEmojiInteractionsReceived = 276;
    public static final int onReceivedChannelDifference = 311;
    public static final int onRequestPermissionResultReceived = 285;
    public static final int onUserRingtonesUpdated = 286;
    public static final int openArticle = 88;
    public static final int openBoostForUsersDialog = 202;
    public static final int openedChatChanged = 42;
    public static final int passcodeDismissed = 49;
    public static final int paymentFinished = 86;
    public static final int peerSettingsDidLoad = 77;
    public static final int permissionsGranted = 296;
    public static final int pinnedInfoDidLoad = 66;
    public static final int playerDidStartPlaying = 264;
    public static final int premiumFloodWaitReceived = 208;
    public static final int premiumPromoUpdated = 288;
    public static final int premiumStatusChangedGlobal = 289;
    public static final int premiumStickersPreviewLoaded = 293;
    public static final int privacyRulesUpdated = 45;
    public static final int proxyChangedByRotation = 259;
    public static final int proxyCheckDone = 258;
    public static final int proxySettingsChanged = 257;
    public static final int pushMessagesUpdated = 234;
    public static final int quickRepliesDeleted = 119;
    public static final int quickRepliesUpdated = 118;
    public static final int reactionsDidLoad = 278;
    public static final int recentDocumentsDidLoad = 83;
    public static final int recentEmojiStatusesUpdate = 114;
    public static final int recordPaused = 155;
    public static final int recordProgressChanged = 151;
    public static final int recordResumed = 156;
    public static final int recordStartError = 153;
    public static final int recordStarted = 152;
    public static final int recordStopped = 154;
    public static final int reloadDialogPhotos = 37;
    public static final int reloadHints = 79;
    public static final int reloadInlineHints = 80;
    public static final int reloadInterface = 254;
    public static final int reloadWebappsHints = 81;
    public static final int removeAllMessagesFromDialog = 39;
    public static final int replaceMessagesObjects = 47;
    public static final int replyMessagesDidLoad = 53;
    public static final int requestPermissions = 295;
    public static final int savedMessagesDialogsUpdate = 195;
    public static final int savedMessagesForwarded = 198;
    public static final int savedReactionTagsUpdate = 196;
    public static final int scheduledMessagesUpdated = 103;
    public static final int screenStateChanged = 267;
    public static final int screenshotTook = 157;
    public static final int sendingMessagesChanged = 99;
    public static final int showBulletin = 272;
    public static final int smsJobStatusUpdate = 200;
    public static final int starBalanceUpdated = 213;
    public static final int starGiftOptionsLoaded = 211;
    public static final int starGiftSoldOut = 224;
    public static final int starGiftsLoaded = 222;
    public static final int starGiveawayOptionsLoaded = 212;
    public static final int starOptionsLoaded = 210;
    public static final int starReactionAnonymousUpdate = 121;
    public static final int starSubscriptionsLoaded = 215;
    public static final int starTransactionsLoaded = 214;
    public static final int starUserGiftsLoaded = 223;
    public static final int startAllHeavyOperations = 96;
    public static final int startSpoilers = 98;
    public static final int stealthModeChanged = 310;
    public static final int stickersDidLoad = 58;
    public static final int stickersImportComplete = 109;
    public static final int stickersImportProgressChanged = 108;
    public static final int stopAllHeavyOperations = 95;
    public static final int stopSpoilers = 97;
    public static final int storiesBlocklistUpdate = 189;
    public static final int storiesDraftsUpdated = 305;
    public static final int storiesEnabledUpdate = 188;
    public static final int storiesLimitUpdate = 190;
    public static final int storiesListUpdated = 304;
    public static final int storiesReadUpdated = 312;
    public static final int storiesSendAsUpdate = 191;
    public static final int storiesUpdated = 303;
    public static final int storyQualityUpdate = 201;
    public static final int suggestedFiltersLoaded = 180;
    public static final int suggestedLangpack = 255;
    public static final int themeAccentListUpdated = 247;
    public static final int themeListUpdated = 245;
    public static final int themeUploadError = 177;
    public static final int themeUploadedToServer = 176;
    public static final int threadMessagesRead = 8;
    public static final int timezonesUpdated = 206;
    public static final int topicsDidLoaded = 298;
    private static int totalEvents = 316;
    public static final int translationModelDownloaded = 315;
    public static final int translationModelDownloading = 314;
    public static final int twoStepPasswordChanged = 50;
    public static final int unconfirmedAuthUpdate = 192;
    public static final int updateAllMessages = 221;
    public static final int updateBotMenuButton = 181;
    public static final int updateDefaultSendAsPeer = 15;
    public static final int updateInterfaces = 2;
    public static final int updateMentionsCount = 90;
    public static final int updateMessageMedia = 46;
    public static final int updateSearchSettings = 115;
    public static final int updateStories = 225;
    public static final int updateTranscriptionLock = 116;
    public static final int uploadStoryEnd = 308;
    public static final int uploadStoryProgress = 307;
    public static final int userEmojiStatusUpdated = 294;
    public static final int userInfoDidLoad = 65;
    public static final int userIsPremiumBlockedUpadted = 197;
    public static final int videoLoadingStateChanged = 93;
    public static final int voiceTranscriptionUpdate = 112;
    public static final int voipServiceCreated = 269;
    public static final int walletPendingTransactionsChanged = 130;
    public static final int walletSyncProgressChanged = 131;
    public static final int wallpaperSettedToUser = 302;
    public static final int wallpapersDidLoad = 235;
    public static final int wallpapersNeedReload = 236;
    public static final int wasUnableToFindCurrentLocation = 78;
    public static final int webRtcMicAmplitudeEvent = 270;
    public static final int webRtcSpeakerAmplitudeEvent = 271;
    public static final int webViewResolved = 220;
    public static final int webViewResultSent = 111;
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

    public class AnonymousClass1 implements View.OnAttachStateChangeListener {
        final NotificationCenterDelegate val$delegate;
        final int val$id;

        AnonymousClass1(NotificationCenterDelegate notificationCenterDelegate, int i) {
            r2 = notificationCenterDelegate;
            r3 = i;
        }

        @Override
        public void onViewAttachedToWindow(View view) {
            NotificationCenter.getGlobalInstance().addObserver(r2, r3);
        }

        @Override
        public void onViewDetachedFromWindow(View view) {
            NotificationCenter.getGlobalInstance().removeObserver(r2, r3);
        }
    }

    public class AnonymousClass2 implements View.OnAttachStateChangeListener {
        final NotificationCenterDelegate val$delegate;
        final int val$id;

        AnonymousClass2(NotificationCenterDelegate notificationCenterDelegate, int i) {
            r2 = notificationCenterDelegate;
            r3 = i;
        }

        @Override
        public void onViewAttachedToWindow(View view) {
            NotificationCenter.this.addObserver(r2, r3);
        }

        @Override
        public void onViewDetachedFromWindow(View view) {
            NotificationCenter.this.removeObserver(r2, r3);
        }
    }

    public static class AllowedNotifications {
        int[] allowedIds;
        final long time;

        private AllowedNotifications() {
            this.time = SystemClock.elapsedRealtime();
        }

        AllowedNotifications(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class DelayedPost {
        private Object[] args;
        private int id;

        private DelayedPost(int i, Object[] objArr) {
            this.id = i;
            this.args = objArr;
        }

        DelayedPost(int i, Object[] objArr, AnonymousClass1 anonymousClass1) {
            this(i, objArr);
        }
    }

    public interface NotificationCenterDelegate {
        void didReceivedNotification(int i, int i2, Object... objArr);
    }

    public interface PostponeNotificationCallback {
        boolean needPostpone(int i, int i2, Object[] objArr);
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
        public void add(int i, T t) {
            if (this.set.add(t)) {
                super.add(i, t);
            }
        }

        @Override
        public boolean add(T t) {
            if (this.set.add(t)) {
                return super.add(t);
            }
            return false;
        }

        @Override
        public boolean addAll(int i, Collection<? extends T> collection) {
            throw new UnsupportedOperationException();
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
        public void clear() {
            this.set.clear();
            super.clear();
        }

        @Override
        public boolean contains(Object obj) {
            return this.set.contains(obj);
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
    }

    public NotificationCenter(int i) {
        this.currentAccount = i;
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

    private ArrayList<NotificationCenterDelegate> createArrayForId(int i) {
        return (i == didReplacedPhotoInMemCache || i == stopAllHeavyOperations || i == startAllHeavyOperations) ? new UniqArrayList() : new ArrayList<>();
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

    public void lambda$checkForExpiredNotifications$0() {
        this.checkForExpiredNotifications = new NotificationCenter$$ExternalSyntheticLambda9(this);
    }

    public static void lambda$listen$6() {
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

    public static void lambda$listenGlobal$3() {
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

    public void lambda$postNotificationDebounced$2(int i, Object[] objArr, int i2) {
        postNotificationNameInternal(i, false, objArr);
        this.alreadyPostedRunnubles.remove(i2);
    }

    public static void listenEmojiLoading(final View view) {
        getGlobalInstance().listenGlobal(view, emojiLoaded, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                view.invalidate();
            }
        });
    }

    private void postNotificationDebounced(final int i, final Object[] objArr) {
        final int hashCode = (Arrays.hashCode(objArr) << 16) + i;
        if (this.alreadyPostedRunnubles.indexOfKey(hashCode) >= 0) {
            return;
        }
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                NotificationCenter.this.lambda$postNotificationDebounced$2(i, objArr, hashCode);
            }
        };
        this.alreadyPostedRunnubles.put(hashCode, runnable);
        AndroidUtilities.runOnUIThread(runnable, 250L);
    }

    private boolean shouldDebounce(int i, Object[] objArr) {
        return i == updateInterfaces;
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

    public void addPostponeNotificationsCallback(PostponeNotificationCallback postponeNotificationCallback) {
        if (BuildVars.DEBUG_VERSION && Thread.currentThread() != ApplicationLoader.applicationHandler.getLooper().getThread()) {
            throw new RuntimeException("PostponeNotificationsCallback allowed only from MAIN thread");
        }
        if (this.postponeCallbackList.contains(postponeNotificationCallback)) {
            return;
        }
        this.postponeCallbackList.add(postponeNotificationCallback);
    }

    public void doOnIdle(Runnable runnable) {
        if (isAnimationInProgress()) {
            this.delayedRunnables.add(runnable);
        } else {
            runnable.run();
        }
    }

    public int getCurrentHeavyOperationFlags() {
        return this.currentHeavyOperationFlags;
    }

    public ArrayList<NotificationCenterDelegate> getObservers(int i) {
        return this.observers.get(i);
    }

    public boolean hasObservers(int i) {
        return this.observers.indexOfKey(i) >= 0;
    }

    public boolean isAnimationInProgress() {
        return this.animationInProgressCount > 0;
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

    public void listenOnce(final int i, final Runnable runnable) {
        NotificationCenterDelegate notificationCenterDelegate = new NotificationCenterDelegate() {
            @Override
            public final void didReceivedNotification(int i2, int i3, Object[] objArr) {
                NotificationCenter.this.lambda$listenOnce$10(i, r3, runnable, i2, i3, objArr);
            }
        };
        final NotificationCenterDelegate[] notificationCenterDelegateArr = {notificationCenterDelegate};
        addObserver(notificationCenterDelegate, i);
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

    public void lambda$postNotificationNameOnUIThread$1(int r18, java.lang.Object... r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.NotificationCenter.lambda$postNotificationNameOnUIThread$1(int, java.lang.Object[]):void");
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

    public void postNotificationNameOnUIThread(final int i, final Object... objArr) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                NotificationCenter.this.lambda$postNotificationNameOnUIThread$1(i, objArr);
            }
        });
    }

    public void removeDelayed(Runnable runnable) {
        this.delayedRunnables.remove(runnable);
    }

    public void removeObserver(NotificationCenterDelegate notificationCenterDelegate, int i) {
        if (BuildVars.DEBUG_VERSION && Thread.currentThread() != ApplicationLoader.applicationHandler.getLooper().getThread()) {
            throw new RuntimeException("removeObserver allowed only from MAIN thread");
        }
        if (this.broadcasting == 0) {
            ArrayList<NotificationCenterDelegate> arrayList = this.observers.get(i);
            if (arrayList != null) {
                arrayList.remove(notificationCenterDelegate);
                return;
            }
            return;
        }
        ArrayList<NotificationCenterDelegate> arrayList2 = this.removeAfterBroadcast.get(i);
        if (arrayList2 == null) {
            arrayList2 = new ArrayList<>();
            this.removeAfterBroadcast.put(i, arrayList2);
        }
        arrayList2.add(notificationCenterDelegate);
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
            NotificationCenter$$ExternalSyntheticLambda9 notificationCenter$$ExternalSyntheticLambda9 = new NotificationCenter$$ExternalSyntheticLambda9(this);
            this.checkForExpiredNotifications = notificationCenter$$ExternalSyntheticLambda9;
            AndroidUtilities.runOnUIThread(notificationCenter$$ExternalSyntheticLambda9, 5017L);
        }
        return this.animationInProgressPointer;
    }

    public void updateAllowedNotifications(int i, int[] iArr) {
        AllowedNotifications allowedNotifications = this.allowedNotifications.get(i);
        if (allowedNotifications != null) {
            allowedNotifications.allowedIds = iArr;
        }
    }
}
