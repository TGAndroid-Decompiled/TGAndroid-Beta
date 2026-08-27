package org.telegram.messenger;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.util.Base64;
import android.util.LongSparseArray;
import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

public class UserConfig extends BaseController {
    private static volatile UserConfig[] Instance = new UserConfig[4];
    public static final int MAX_ACCOUNT_COUNT = 4;
    public static final int MAX_ACCOUNT_DEFAULT_COUNT = 3;
    public static final int i_dialogsLoadOffsetAccess = 5;
    public static final int i_dialogsLoadOffsetChannelId = 4;
    public static final int i_dialogsLoadOffsetChatId = 3;
    public static final int i_dialogsLoadOffsetDate = 1;
    public static final int i_dialogsLoadOffsetId = 0;
    public static final int i_dialogsLoadOffsetUserId = 2;
    public static int selectedAccount;
    public long autoDownloadConfigLoadTime;
    public int botGuestRatingLoadTime;
    public int botRatingLoadTime;
    LongSparseArray<SaveToGallerySettingsHelper.DialogException> chanelSaveGalleryExceptions;
    public long clientUserId;
    private volatile boolean configLoaded;
    public boolean contactsReimported;
    public int contactsSavedCount;
    private TLRPC.User currentUser;
    public String defaultTopicIcons;
    public boolean draftsLoaded;
    public boolean filtersLoaded;
    public String genericAnimationsStickerPack;
    int globalTtl;
    LongSparseArray<SaveToGallerySettingsHelper.DialogException> groupsSaveGalleryExceptions;
    public boolean hasSecureData;
    public boolean hasValidDialogLoadIds;
    public int lastBroadcastId;
    public int lastContactsSyncTime;
    public int lastHintsSyncTime;
    long lastLoadingTime;
    public int lastMyLocationShareTime;
    public int lastSendMessageId;
    public long lastUpdatedDefaultTopicIcons;
    public long lastUpdatedGenericAnimations;
    public long lastUpdatedPremiumGiftsStickerPack;
    public long lastUpdatedTonGiftsStickerPack;
    public int loginTime;
    public long migrateOffsetAccess;
    public long migrateOffsetChannelId;
    public long migrateOffsetChatId;
    public int migrateOffsetDate;
    public int migrateOffsetId;
    public long migrateOffsetUserId;
    public boolean notificationsSettingsLoaded;
    public boolean notificationsSignUpSettingsLoaded;
    public String premiumGiftsStickerPack;
    public String premiumTonStickerPack;
    public int ratingLoadTime;
    public boolean registeredForPush;
    public volatile byte[] savedPasswordHash;
    public volatile long savedPasswordTime;
    public volatile byte[] savedSaltedPassword;
    public int sharingMyLocationUntil;
    public boolean showCallsTab;
    public boolean suggestContacts;
    private final Object sync;
    public boolean syncContacts;
    public TL_account.tmpPassword tmpPassword;
    boolean ttlIsLoading;
    public TLRPC.TL_help_termsOfService unacceptedTermsOfService;
    public boolean unreadDialogsLoaded;
    LongSparseArray<SaveToGallerySettingsHelper.DialogException> userSaveGalleryExceptions;
    public int webappRatingLoadTime;

    public UserConfig(int i10) {
        super(i10);
        this.sync = new Object();
        this.lastSendMessageId = -210000;
        this.lastBroadcastId = -1;
        this.unreadDialogsLoaded = true;
        this.migrateOffsetId = -1;
        this.migrateOffsetDate = -1;
        this.migrateOffsetUserId = -1L;
        this.migrateOffsetChatId = -1L;
        this.migrateOffsetChannelId = -1L;
        this.migrateOffsetAccess = -1L;
        this.syncContacts = true;
        this.suggestContacts = true;
        this.globalTtl = 0;
        this.ttlIsLoading = false;
    }

    private void checkPremiumSelf(TLRPC.User user, final TLRPC.User user2) {
        if (user != null && user2 != null && user.premium != user2.premium) {
            final int i10 = 0;
            AndroidUtilities.runOnUIThread(new Runnable(this) {

                public final UserConfig f21302b;

                {
                    this.f21302b = this;
                }

                @Override
                public final void run() {
                    switch (i10) {
                        case 0:
                            this.f21302b.lambda$checkPremiumSelf$1(user2);
                            break;
                        default:
                            this.f21302b.lambda$checkPremiumSelf$2(user2);
                            break;
                    }
                }
            });
        } else if (user == null) {
            final int i11 = 1;
            AndroidUtilities.runOnUIThread(new Runnable(this) {

                public final UserConfig f21302b;

                {
                    this.f21302b = this;
                }

                @Override
                public final void run() {
                    switch (i11) {
                        case 0:
                            this.f21302b.lambda$checkPremiumSelf$1(user2);
                            break;
                        default:
                            this.f21302b.lambda$checkPremiumSelf$2(user2);
                            break;
                    }
                }
            });
        }
    }

    public static int getActivatedAccountsCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            if (AccountInstance.getInstance(i11).getUserConfig().isClientActivated()) {
                i10++;
            }
        }
        return i10;
    }

    public static UserConfig getInstance(int i10) {
        UserConfig userConfig;
        UserConfig userConfig2 = Instance[i10];
        if (userConfig2 != null) {
            return userConfig2;
        }
        synchronized (UserConfig.class) {
            try {
                userConfig = Instance[i10];
                if (userConfig == null) {
                    UserConfig[] userConfigArr = Instance;
                    UserConfig userConfig3 = new UserConfig(i10);
                    userConfigArr[i10] = userConfig3;
                    userConfig = userConfig3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return userConfig;
    }

    public static int getMaxAccountCount() {
        return hasPremiumOnAccounts() ? 5 : 3;
    }

    public static int getProductionAccount() {
        int i10 = -1;
        while (i10 < 4) {
            int i11 = i10 < 0 ? selectedAccount : i10;
            if (getInstance(i11).isClientActivated() && !ConnectionsManager.getInstance(i11).isTestBackend()) {
                return i11;
            }
            i10++;
        }
        return selectedAccount;
    }

    public static boolean hasPremiumOnAccounts() {
        for (int i10 = 0; i10 < 4; i10++) {
            if (AccountInstance.getInstance(i10).getUserConfig().isClientActivated() && AccountInstance.getInstance(i10).getUserConfig().getUserConfig().isPremium()) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValidAccount(int i10) {
        return i10 >= 0 && i10 < 4 && getInstance(i10).isClientActivated();
    }

    public void lambda$checkPremiumSelf$1(TLRPC.User user) {
        getMessagesController().updatePremium(user.premium);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.currentUserPremiumStatusChanged, new Object[0]);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.premiumStatusChangedGlobal, new Object[0]);
        getMediaDataController().loadPremiumPromo(false);
        getMediaDataController().loadReactions(false, null);
        jh.s6 storiesController = getMessagesController().getStoriesController();
        storiesController.R = false;
        storiesController.S = null;
    }

    public void lambda$checkPremiumSelf$2(TLRPC.User user) {
        getMessagesController().updatePremium(user.premium);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.currentUserPremiumStatusChanged, new Object[0]);
        getMediaDataController().loadPremiumPromo(true);
    }

    public void lambda$loadGlobalTTl$3(TLObject tLObject) {
        if (tLObject != null) {
            this.globalTtl = ((TLRPC.TL_defaultHistoryTTL) tLObject).period / 60;
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateGlobalAutoDeleteTimer, new Object[0]);
            this.ttlIsLoading = false;
            this.lastLoadingTime = System.currentTimeMillis();
        }
    }

    public void lambda$loadGlobalTTl$4(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new sg(15, this, tLObject));
    }

    public void lambda$saveConfig$0(boolean z10) {
        if (this.configLoaded) {
            synchronized (this.sync) {
                try {
                    try {
                        SharedPreferences.Editor editorEdit = getPreferences().edit();
                        if (this.currentAccount == 0) {
                            editorEdit.putInt("selectedAccount", selectedAccount);
                        }
                        editorEdit.putBoolean("registeredForPush", this.registeredForPush);
                        editorEdit.putInt("lastSendMessageId", this.lastSendMessageId);
                        editorEdit.putInt("contactsSavedCount", this.contactsSavedCount);
                        editorEdit.putInt("lastBroadcastId", this.lastBroadcastId);
                        editorEdit.putInt("lastContactsSyncTime", this.lastContactsSyncTime);
                        editorEdit.putInt("lastHintsSyncTime", this.lastHintsSyncTime);
                        editorEdit.putBoolean("draftsLoaded", this.draftsLoaded);
                        editorEdit.putBoolean("unreadDialogsLoaded", this.unreadDialogsLoaded);
                        editorEdit.putInt("ratingLoadTime", this.ratingLoadTime);
                        editorEdit.putInt("botRatingLoadTime", this.botRatingLoadTime);
                        editorEdit.putInt("botGuestRatingLoadTime", this.botGuestRatingLoadTime);
                        editorEdit.putInt("webappRatingLoadTime", this.webappRatingLoadTime);
                        editorEdit.putBoolean("contactsReimported", this.contactsReimported);
                        editorEdit.putInt("loginTime", this.loginTime);
                        editorEdit.putBoolean("syncContacts", this.syncContacts);
                        editorEdit.putBoolean("showCallsTab", this.showCallsTab);
                        editorEdit.putBoolean("suggestContacts", this.suggestContacts);
                        editorEdit.putBoolean("hasSecureData", this.hasSecureData);
                        editorEdit.putBoolean("notificationsSettingsLoaded4", this.notificationsSettingsLoaded);
                        editorEdit.putBoolean("notificationsSignUpSettingsLoaded", this.notificationsSignUpSettingsLoaded);
                        editorEdit.putLong("autoDownloadConfigLoadTime", this.autoDownloadConfigLoadTime);
                        editorEdit.putBoolean("hasValidDialogLoadIds", this.hasValidDialogLoadIds);
                        editorEdit.putInt("sharingMyLocationUntil", this.sharingMyLocationUntil);
                        editorEdit.putInt("lastMyLocationShareTime", this.lastMyLocationShareTime);
                        editorEdit.putBoolean("filtersLoaded", this.filtersLoaded);
                        editorEdit.putString("premiumGiftsStickerPack", this.premiumGiftsStickerPack);
                        editorEdit.putLong("lastUpdatedPremiumGiftsStickerPack", this.lastUpdatedPremiumGiftsStickerPack);
                        editorEdit.putString("genericAnimationsStickerPack", this.genericAnimationsStickerPack);
                        editorEdit.putLong("lastUpdatedGenericAnimations", this.lastUpdatedGenericAnimations);
                        editorEdit.putInt("6migrateOffsetId", this.migrateOffsetId);
                        if (this.migrateOffsetId != -1) {
                            editorEdit.putInt("6migrateOffsetDate", this.migrateOffsetDate);
                            editorEdit.putLong("6migrateOffsetUserId", this.migrateOffsetUserId);
                            editorEdit.putLong("6migrateOffsetChatId", this.migrateOffsetChatId);
                            editorEdit.putLong("6migrateOffsetChannelId", this.migrateOffsetChannelId);
                            editorEdit.putLong("6migrateOffsetAccess", this.migrateOffsetAccess);
                        }
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = this.unacceptedTermsOfService;
                        if (tL_help_termsOfService != null) {
                            try {
                                SerializedData serializedData = new SerializedData(tL_help_termsOfService.getObjectSize());
                                this.unacceptedTermsOfService.serializeToStream(serializedData);
                                editorEdit.putString("terms", Base64.encodeToString(serializedData.toByteArray(), 0));
                                serializedData.cleanup();
                            } catch (Exception unused) {
                            }
                        } else {
                            editorEdit.remove("terms");
                        }
                        SharedConfig.saveConfig();
                        if (this.tmpPassword != null) {
                            SerializedData serializedData2 = new SerializedData();
                            this.tmpPassword.serializeToStream(serializedData2);
                            editorEdit.putString("tmpPassword", Base64.encodeToString(serializedData2.toByteArray(), 0));
                            serializedData2.cleanup();
                        } else {
                            editorEdit.remove("tmpPassword");
                        }
                        if (this.currentUser == null) {
                            editorEdit.remove("user");
                        } else if (z10) {
                            SerializedData serializedData3 = new SerializedData();
                            this.currentUser.serializeToStream(serializedData3);
                            editorEdit.putString("user", Base64.encodeToString(serializedData3.toByteArray(), 0));
                            serializedData3.cleanup();
                        }
                        editorEdit.apply();
                    } catch (Exception e9) {
                        FileLog.e(e9);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void checkSavedPassword() {
        if (!(this.savedSaltedPassword == null && this.savedPasswordHash == null) && Math.abs(SystemClock.elapsedRealtime() - this.savedPasswordTime) >= 1800000) {
            resetSavedPassword();
        }
    }

    public void clearConfig() {
        getPreferences().edit().clear().apply();
        this.sharingMyLocationUntil = 0;
        this.lastMyLocationShareTime = 0;
        this.currentUser = null;
        this.clientUserId = 0L;
        this.registeredForPush = false;
        this.contactsSavedCount = 0;
        this.lastSendMessageId = -210000;
        this.lastBroadcastId = -1;
        this.notificationsSettingsLoaded = false;
        this.notificationsSignUpSettingsLoaded = false;
        this.migrateOffsetId = -1;
        this.migrateOffsetDate = -1;
        this.migrateOffsetUserId = -1L;
        this.migrateOffsetChatId = -1L;
        this.migrateOffsetChannelId = -1L;
        this.migrateOffsetAccess = -1L;
        this.ratingLoadTime = 0;
        this.botRatingLoadTime = 0;
        this.botGuestRatingLoadTime = 0;
        this.webappRatingLoadTime = 0;
        this.draftsLoaded = false;
        this.contactsReimported = true;
        this.syncContacts = true;
        this.showCallsTab = false;
        this.suggestContacts = true;
        this.unreadDialogsLoaded = true;
        this.hasValidDialogLoadIds = true;
        this.unacceptedTermsOfService = null;
        this.filtersLoaded = false;
        this.hasSecureData = false;
        this.loginTime = (int) (System.currentTimeMillis() / 1000);
        this.lastContactsSyncTime = ((int) (System.currentTimeMillis() / 1000)) - 82800;
        this.lastHintsSyncTime = ((int) (System.currentTimeMillis() / 1000)) - 90000;
        resetSavedPassword();
        for (int i10 = 0; i10 < 4; i10++) {
            if (AccountInstance.getInstance(i10).getUserConfig().isClientActivated()) {
                saveConfig(true);
            }
        }
        SharedConfig.clearConfig();
        saveConfig(true);
    }

    public void clearFilters() {
        getPreferences().edit().remove("filtersLoaded").apply();
        this.filtersLoaded = false;
    }

    public void clearPinnedDialogsLoaded() {
        SharedPreferences.Editor editorEdit = getPreferences().edit();
        for (String str : getPreferences().getAll().keySet()) {
            if (str.startsWith("2pinnedDialogsLoaded")) {
                editorEdit.remove(str);
            }
        }
        editorEdit.apply();
    }

    public String getClientPhone() {
        String str;
        synchronized (this.sync) {
            try {
                TLRPC.User user = this.currentUser;
                if (user == null || (str = user.phone) == null) {
                    str = "";
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public long getClientUserId() {
        long j10;
        synchronized (this.sync) {
            try {
                TLRPC.User user = this.currentUser;
                j10 = user != null ? user.f22527id : 0L;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j10;
    }

    public TLRPC.User getCurrentUser() {
        TLRPC.User user;
        synchronized (this.sync) {
            user = this.currentUser;
        }
        return user;
    }

    public long[] getDialogLoadOffsets(int i10) {
        SharedPreferences preferences = getPreferences();
        StringBuilder sb2 = new StringBuilder("2dialogsLoadOffsetId");
        sb2.append(i10 == 0 ? "" : Integer.valueOf(i10));
        int i11 = preferences.getInt(sb2.toString(), this.hasValidDialogLoadIds ? 0 : -1);
        StringBuilder sb3 = new StringBuilder("2dialogsLoadOffsetDate");
        sb3.append(i10 == 0 ? "" : Integer.valueOf(i10));
        int i12 = preferences.getInt(sb3.toString(), this.hasValidDialogLoadIds ? 0 : -1);
        StringBuilder sb4 = new StringBuilder("2dialogsLoadOffsetUserId");
        sb4.append(i10 == 0 ? "" : Integer.valueOf(i10));
        long prefIntOrLong = AndroidUtilities.getPrefIntOrLong(preferences, sb4.toString(), this.hasValidDialogLoadIds ? 0L : -1L);
        StringBuilder sb5 = new StringBuilder("2dialogsLoadOffsetChatId");
        sb5.append(i10 == 0 ? "" : Integer.valueOf(i10));
        long prefIntOrLong2 = AndroidUtilities.getPrefIntOrLong(preferences, sb5.toString(), this.hasValidDialogLoadIds ? 0L : -1L);
        StringBuilder sb6 = new StringBuilder("2dialogsLoadOffsetChannelId");
        sb6.append(i10 == 0 ? "" : Integer.valueOf(i10));
        long prefIntOrLong3 = AndroidUtilities.getPrefIntOrLong(preferences, sb6.toString(), this.hasValidDialogLoadIds ? 0L : -1L);
        StringBuilder sb7 = new StringBuilder("2dialogsLoadOffsetAccess");
        sb7.append(i10 != 0 ? Integer.valueOf(i10) : "");
        return new long[]{i11, i12, prefIntOrLong, prefIntOrLong2, prefIntOrLong3, preferences.getLong(sb7.toString(), this.hasValidDialogLoadIds ? 0L : -1L)};
    }

    public Long getEmojiStatus() {
        return UserObject.getEmojiStatusDocumentId(this.currentUser);
    }

    public int getGlobalTTl() {
        return this.globalTtl;
    }

    public int getNewMessageId() {
        int i10;
        synchronized (this.sync) {
            i10 = this.lastSendMessageId;
            this.lastSendMessageId = i10 - 1;
        }
        return i10;
    }

    public SharedPreferences getPreferences() {
        if (this.currentAccount == 0) {
            return ApplicationLoader.applicationContext.getSharedPreferences("userconfing", 0);
        }
        return ApplicationLoader.applicationContext.getSharedPreferences("userconfig" + this.currentAccount, 0);
    }

    public LongSparseArray<SaveToGallerySettingsHelper.DialogException> getSaveGalleryExceptions(int i10) {
        if (i10 == 1) {
            if (this.userSaveGalleryExceptions == null) {
                this.userSaveGalleryExceptions = SaveToGallerySettingsHelper.loadExceptions(ApplicationLoader.applicationContext.getSharedPreferences(SaveToGallerySettingsHelper.USERS_PREF_NAME + "_" + this.currentAccount, 0));
            }
            return this.userSaveGalleryExceptions;
        }
        if (i10 == 2) {
            if (this.groupsSaveGalleryExceptions == null) {
                this.groupsSaveGalleryExceptions = SaveToGallerySettingsHelper.loadExceptions(ApplicationLoader.applicationContext.getSharedPreferences(SaveToGallerySettingsHelper.GROUPS_PREF_NAME + "_" + this.currentAccount, 0));
            }
            return this.groupsSaveGalleryExceptions;
        }
        if (i10 != 4) {
            return null;
        }
        if (this.chanelSaveGalleryExceptions == null) {
            this.chanelSaveGalleryExceptions = SaveToGallerySettingsHelper.loadExceptions(ApplicationLoader.applicationContext.getSharedPreferences(SaveToGallerySettingsHelper.CHANNELS_PREF_NAME + "_" + this.currentAccount, 0));
        }
        return this.chanelSaveGalleryExceptions;
    }

    public int getTotalDialogsCount(int i10) {
        SharedPreferences preferences = getPreferences();
        StringBuilder sb2 = new StringBuilder("2totalDialogsLoadCount");
        sb2.append(i10 == 0 ? "" : Integer.valueOf(i10));
        return preferences.getInt(sb2.toString(), 0);
    }

    public boolean isClientActivated() {
        boolean z10;
        synchronized (this.sync) {
            z10 = this.currentUser != null;
        }
        return z10;
    }

    public boolean isConfigLoaded() {
        return this.configLoaded;
    }

    public boolean isPinnedDialogsLoaded(int i10) {
        return getPreferences().getBoolean("2pinnedDialogsLoaded" + i10, false);
    }

    public boolean isPremium() {
        TLRPC.User user = this.currentUser;
        if (user == null) {
            return false;
        }
        return user.premium;
    }

    public void loadConfig() {
        byte[] bArrDecode;
        byte[] bArrDecode2;
        byte[] bArrDecode3;
        synchronized (this.sync) {
            try {
                if (this.configLoaded) {
                    return;
                }
                SharedPreferences preferences = getPreferences();
                if (this.currentAccount == 0) {
                    selectedAccount = preferences.getInt("selectedAccount", 0);
                }
                this.registeredForPush = preferences.getBoolean("registeredForPush", false);
                this.lastSendMessageId = preferences.getInt("lastSendMessageId", -210000);
                this.contactsSavedCount = preferences.getInt("contactsSavedCount", 0);
                this.lastBroadcastId = preferences.getInt("lastBroadcastId", -1);
                this.lastContactsSyncTime = preferences.getInt("lastContactsSyncTime", ((int) (System.currentTimeMillis() / 1000)) - 82800);
                this.lastHintsSyncTime = preferences.getInt("lastHintsSyncTime", ((int) (System.currentTimeMillis() / 1000)) - 90000);
                this.draftsLoaded = preferences.getBoolean("draftsLoaded", false);
                this.unreadDialogsLoaded = preferences.getBoolean("unreadDialogsLoaded", false);
                this.contactsReimported = preferences.getBoolean("contactsReimported", false);
                this.ratingLoadTime = preferences.getInt("ratingLoadTime", 0);
                this.botRatingLoadTime = preferences.getInt("botRatingLoadTime", 0);
                this.botGuestRatingLoadTime = preferences.getInt("botGuestRatingLoadTime", 0);
                this.webappRatingLoadTime = preferences.getInt("webappRatingLoadTime", 0);
                this.loginTime = preferences.getInt("loginTime", this.currentAccount);
                this.syncContacts = preferences.getBoolean("syncContacts", true);
                this.showCallsTab = preferences.getBoolean("showCallsTab", false);
                this.suggestContacts = preferences.getBoolean("suggestContacts", true);
                this.hasSecureData = preferences.getBoolean("hasSecureData", false);
                this.notificationsSettingsLoaded = preferences.getBoolean("notificationsSettingsLoaded4", false);
                this.notificationsSignUpSettingsLoaded = preferences.getBoolean("notificationsSignUpSettingsLoaded", false);
                this.autoDownloadConfigLoadTime = preferences.getLong("autoDownloadConfigLoadTime", 0L);
                this.hasValidDialogLoadIds = preferences.contains("2dialogsLoadOffsetId") || preferences.getBoolean("hasValidDialogLoadIds", false);
                this.sharingMyLocationUntil = preferences.getInt("sharingMyLocationUntil", 0);
                this.lastMyLocationShareTime = preferences.getInt("lastMyLocationShareTime", 0);
                this.filtersLoaded = preferences.getBoolean("filtersLoaded", false);
                this.premiumGiftsStickerPack = preferences.getString("premiumGiftsStickerPack", null);
                this.lastUpdatedPremiumGiftsStickerPack = preferences.getLong("lastUpdatedPremiumGiftsStickerPack", 0L);
                this.genericAnimationsStickerPack = preferences.getString("genericAnimationsStickerPack", null);
                this.lastUpdatedGenericAnimations = preferences.getLong("lastUpdatedGenericAnimations", 0L);
                try {
                    String string = preferences.getString("terms", null);
                    if (string != null && (bArrDecode3 = Base64.decode(string, 0)) != null) {
                        SerializedData serializedData = new SerializedData(bArrDecode3);
                        this.unacceptedTermsOfService = TLRPC.TL_help_termsOfService.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                        serializedData.cleanup();
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                int i10 = preferences.getInt("6migrateOffsetId", 0);
                this.migrateOffsetId = i10;
                if (i10 != -1) {
                    this.migrateOffsetDate = preferences.getInt("6migrateOffsetDate", 0);
                    this.migrateOffsetUserId = AndroidUtilities.getPrefIntOrLong(preferences, "6migrateOffsetUserId", 0L);
                    this.migrateOffsetChatId = AndroidUtilities.getPrefIntOrLong(preferences, "6migrateOffsetChatId", 0L);
                    this.migrateOffsetChannelId = AndroidUtilities.getPrefIntOrLong(preferences, "6migrateOffsetChannelId", 0L);
                    this.migrateOffsetAccess = preferences.getLong("6migrateOffsetAccess", 0L);
                }
                String string2 = preferences.getString("tmpPassword", null);
                if (string2 != null && (bArrDecode2 = Base64.decode(string2, 0)) != null) {
                    SerializedData serializedData2 = new SerializedData(bArrDecode2);
                    this.tmpPassword = TL_account.tmpPassword.TLdeserialize(serializedData2, serializedData2.readInt32(false), false);
                    serializedData2.cleanup();
                }
                String string3 = preferences.getString("user", null);
                if (string3 != null && (bArrDecode = Base64.decode(string3, 0)) != null) {
                    SerializedData serializedData3 = new SerializedData(bArrDecode);
                    this.currentUser = TLRPC.User.TLdeserialize(serializedData3, serializedData3.readInt32(false), false);
                    serializedData3.cleanup();
                }
                TLRPC.User user = this.currentUser;
                if (user != null) {
                    checkPremiumSelf(null, user);
                    this.clientUserId = this.currentUser.f22527id;
                }
                this.configLoaded = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void loadGlobalTTl() {
        if (this.ttlIsLoading || System.currentTimeMillis() - this.lastLoadingTime < 60000) {
            return;
        }
        this.ttlIsLoading = true;
        getConnectionsManager().sendRequest(new TLRPC.TL_messages_getDefaultHistoryTTL(), new g0(this, 10));
    }

    public void resetSavedPassword() {
        this.savedPasswordTime = 0L;
        if (this.savedPasswordHash != null) {
            Arrays.fill(this.savedPasswordHash, (byte) 0);
            this.savedPasswordHash = null;
        }
        if (this.savedSaltedPassword != null) {
            Arrays.fill(this.savedSaltedPassword, (byte) 0);
            this.savedSaltedPassword = null;
        }
    }

    public void saveConfig(boolean z10) {
        NotificationCenter.getInstance(this.currentAccount).doOnIdle(new fh.f(17, this, z10));
    }

    public void savePassword(byte[] bArr, byte[] bArr2) {
        this.savedPasswordTime = SystemClock.elapsedRealtime();
        this.savedPasswordHash = bArr;
        this.savedSaltedPassword = bArr2;
    }

    public void setCurrentUser(TLRPC.User user) {
        synchronized (this.sync) {
            TLRPC.User user2 = this.currentUser;
            this.currentUser = user;
            this.clientUserId = user.f22527id;
            checkPremiumSelf(user2, user);
        }
    }

    public void setDialogsLoadOffset(int i10, int i11, int i12, long j10, long j11, long j12, long j13) {
        SharedPreferences.Editor editorEdit = getPreferences().edit();
        StringBuilder sb2 = new StringBuilder("2dialogsLoadOffsetId");
        sb2.append(i10 == 0 ? "" : Integer.valueOf(i10));
        editorEdit.putInt(sb2.toString(), i11);
        StringBuilder sb3 = new StringBuilder("2dialogsLoadOffsetDate");
        sb3.append(i10 == 0 ? "" : Integer.valueOf(i10));
        editorEdit.putInt(sb3.toString(), i12);
        StringBuilder sb4 = new StringBuilder("2dialogsLoadOffsetUserId");
        sb4.append(i10 == 0 ? "" : Integer.valueOf(i10));
        editorEdit.putLong(sb4.toString(), j10);
        StringBuilder sb5 = new StringBuilder("2dialogsLoadOffsetChatId");
        sb5.append(i10 == 0 ? "" : Integer.valueOf(i10));
        editorEdit.putLong(sb5.toString(), j11);
        StringBuilder sb6 = new StringBuilder("2dialogsLoadOffsetChannelId");
        sb6.append(i10 == 0 ? "" : Integer.valueOf(i10));
        editorEdit.putLong(sb6.toString(), j12);
        StringBuilder sb7 = new StringBuilder("2dialogsLoadOffsetAccess");
        sb7.append(i10 != 0 ? Integer.valueOf(i10) : "");
        editorEdit.putLong(sb7.toString(), j13);
        editorEdit.putBoolean("hasValidDialogLoadIds", true);
        editorEdit.commit();
    }

    public void setGlobalTtl(int i10) {
        this.globalTtl = i10;
    }

    public void setPinnedDialogsLoaded(int i10, boolean z10) {
        getPreferences().edit().putBoolean("2pinnedDialogsLoaded" + i10, z10).commit();
    }

    public void setShowCallsTab(boolean z10) {
        if (this.showCallsTab != z10) {
            this.showCallsTab = z10;
            saveConfig(false);
        }
    }

    public void setTotalDialogsCount(int i10, int i11) {
        SharedPreferences.Editor editorEdit = getPreferences().edit();
        StringBuilder sb2 = new StringBuilder("2totalDialogsLoadCount");
        sb2.append(i10 == 0 ? "" : Integer.valueOf(i10));
        editorEdit.putInt(sb2.toString(), i11).commit();
    }

    public void updateSaveGalleryExceptions(int i10, LongSparseArray<SaveToGallerySettingsHelper.DialogException> longSparseArray) {
        if (i10 == 1) {
            this.userSaveGalleryExceptions = longSparseArray;
            SaveToGallerySettingsHelper.saveExceptions(ApplicationLoader.applicationContext.getSharedPreferences(SaveToGallerySettingsHelper.USERS_PREF_NAME + "_" + this.currentAccount, 0), this.userSaveGalleryExceptions);
            return;
        }
        if (i10 == 2) {
            this.groupsSaveGalleryExceptions = longSparseArray;
            SaveToGallerySettingsHelper.saveExceptions(ApplicationLoader.applicationContext.getSharedPreferences(SaveToGallerySettingsHelper.GROUPS_PREF_NAME + "_" + this.currentAccount, 0), this.groupsSaveGalleryExceptions);
            return;
        }
        if (i10 == 4) {
            this.chanelSaveGalleryExceptions = longSparseArray;
            SaveToGallerySettingsHelper.saveExceptions(ApplicationLoader.applicationContext.getSharedPreferences(SaveToGallerySettingsHelper.CHANNELS_PREF_NAME + "_" + this.currentAccount, 0), this.chanelSaveGalleryExceptions);
        }
    }
}
