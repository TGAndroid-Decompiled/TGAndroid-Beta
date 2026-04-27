package org.telegram.messenger;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.util.Base64;
import android.util.LongSparseArray;
import java.util.Arrays;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
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

    public static UserConfig getInstance(int i) {
        UserConfig userConfig = Instance[i];
        if (userConfig == null) {
            synchronized (UserConfig.class) {
                try {
                    userConfig = Instance[i];
                    if (userConfig == null) {
                        UserConfig[] userConfigArr = Instance;
                        UserConfig userConfig2 = new UserConfig(i);
                        userConfigArr[i] = userConfig2;
                        userConfig = userConfig2;
                    }
                } finally {
                }
            }
        }
        return userConfig;
    }

    public static int getActivatedAccountsCount() {
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            if (AccountInstance.getInstance(i2).getUserConfig().isClientActivated()) {
                i++;
            }
        }
        return i;
    }

    public UserConfig(int i) {
        super(i);
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

    public static boolean hasPremiumOnAccounts() {
        for (int i = 0; i < 4; i++) {
            if (AccountInstance.getInstance(i).getUserConfig().isClientActivated() && AccountInstance.getInstance(i).getUserConfig().getUserConfig().isPremium()) {
                return true;
            }
        }
        return false;
    }

    public static int getMaxAccountCount() {
        return hasPremiumOnAccounts() ? 5 : 3;
    }

    public int getNewMessageId() {
        int i;
        synchronized (this.sync) {
            i = this.lastSendMessageId;
            this.lastSendMessageId = i - 1;
        }
        return i;
    }

    public void saveConfig(final boolean z) {
        NotificationCenter.getInstance(this.currentAccount).doOnIdle(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$saveConfig$0(z);
            }
        });
    }

    public void lambda$saveConfig$0(boolean z) {
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
                        } else if (z) {
                            SerializedData serializedData3 = new SerializedData();
                            this.currentUser.serializeToStream(serializedData3);
                            editorEdit.putString("user", Base64.encodeToString(serializedData3.toByteArray(), 0));
                            serializedData3.cleanup();
                        }
                        editorEdit.apply();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static boolean isValidAccount(int i) {
        return i >= 0 && i < 4 && getInstance(i).isClientActivated();
    }

    public boolean isClientActivated() {
        boolean z;
        synchronized (this.sync) {
            z = this.currentUser != null;
        }
        return z;
    }

    public long getClientUserId() {
        long j;
        synchronized (this.sync) {
            try {
                TLRPC.User user = this.currentUser;
                j = user != null ? user.id : 0L;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j;
    }

    public String getClientPhone() {
        String str;
        synchronized (this.sync) {
            try {
                TLRPC.User user = this.currentUser;
                if (user == null || (str = user.phone) == null) {
                    str = "";
                }
            } finally {
            }
        }
        return str;
    }

    public TLRPC.User getCurrentUser() {
        TLRPC.User user;
        synchronized (this.sync) {
            user = this.currentUser;
        }
        return user;
    }

    public void setCurrentUser(TLRPC.User user) {
        synchronized (this.sync) {
            TLRPC.User user2 = this.currentUser;
            this.currentUser = user;
            this.clientUserId = user.id;
            checkPremiumSelf(user2, user);
        }
    }

    private void checkPremiumSelf(TLRPC.User user, final TLRPC.User user2) {
        if (user != null && user2 != null && user.premium != user2.premium) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$checkPremiumSelf$1(user2);
                }
            });
        } else if (user == null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$checkPremiumSelf$2(user2);
                }
            });
        }
    }

    public void lambda$checkPremiumSelf$1(TLRPC.User user) {
        getMessagesController().updatePremium(user.premium);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.currentUserPremiumStatusChanged, new Object[0]);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.premiumStatusChangedGlobal, new Object[0]);
        getMediaDataController().loadPremiumPromo(false);
        getMediaDataController().loadReactions(false, null);
        getMessagesController().getStoriesController().invalidateStoryLimit();
    }

    public void lambda$checkPremiumSelf$2(TLRPC.User user) {
        getMessagesController().updatePremium(user.premium);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.currentUserPremiumStatusChanged, new Object[0]);
        getMediaDataController().loadPremiumPromo(true);
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
                } catch (Exception e) {
                    FileLog.e(e);
                }
                int i = preferences.getInt("6migrateOffsetId", 0);
                this.migrateOffsetId = i;
                if (i != -1) {
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
                    this.clientUserId = this.currentUser.id;
                }
                this.configLoaded = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean isConfigLoaded() {
        return this.configLoaded;
    }

    public void savePassword(byte[] bArr, byte[] bArr2) {
        this.savedPasswordTime = SystemClock.elapsedRealtime();
        this.savedPasswordHash = bArr;
        this.savedSaltedPassword = bArr2;
    }

    public void checkSavedPassword() {
        if (!(this.savedSaltedPassword == null && this.savedPasswordHash == null) && Math.abs(SystemClock.elapsedRealtime() - this.savedPasswordTime) >= 1800000) {
            resetSavedPassword();
        }
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

    public SharedPreferences getPreferences() {
        if (this.currentAccount == 0) {
            return ApplicationLoader.applicationContext.getSharedPreferences("userconfing", 0);
        }
        return ApplicationLoader.applicationContext.getSharedPreferences("userconfig" + this.currentAccount, 0);
    }

    public LongSparseArray<SaveToGallerySettingsHelper.DialogException> getSaveGalleryExceptions(int i) {
        if (i == 1) {
            if (this.userSaveGalleryExceptions == null) {
                this.userSaveGalleryExceptions = SaveToGallerySettingsHelper.loadExceptions(ApplicationLoader.applicationContext.getSharedPreferences(SaveToGallerySettingsHelper.USERS_PREF_NAME + "_" + this.currentAccount, 0));
            }
            return this.userSaveGalleryExceptions;
        }
        if (i == 2) {
            if (this.groupsSaveGalleryExceptions == null) {
                this.groupsSaveGalleryExceptions = SaveToGallerySettingsHelper.loadExceptions(ApplicationLoader.applicationContext.getSharedPreferences(SaveToGallerySettingsHelper.GROUPS_PREF_NAME + "_" + this.currentAccount, 0));
            }
            return this.groupsSaveGalleryExceptions;
        }
        if (i != 4) {
            return null;
        }
        if (this.chanelSaveGalleryExceptions == null) {
            this.chanelSaveGalleryExceptions = SaveToGallerySettingsHelper.loadExceptions(ApplicationLoader.applicationContext.getSharedPreferences(SaveToGallerySettingsHelper.CHANNELS_PREF_NAME + "_" + this.currentAccount, 0));
        }
        return this.chanelSaveGalleryExceptions;
    }

    public void updateSaveGalleryExceptions(int i, LongSparseArray<SaveToGallerySettingsHelper.DialogException> longSparseArray) {
        if (i == 1) {
            this.userSaveGalleryExceptions = longSparseArray;
            SaveToGallerySettingsHelper.saveExceptions(ApplicationLoader.applicationContext.getSharedPreferences(SaveToGallerySettingsHelper.USERS_PREF_NAME + "_" + this.currentAccount, 0), this.userSaveGalleryExceptions);
            return;
        }
        if (i == 2) {
            this.groupsSaveGalleryExceptions = longSparseArray;
            SaveToGallerySettingsHelper.saveExceptions(ApplicationLoader.applicationContext.getSharedPreferences(SaveToGallerySettingsHelper.GROUPS_PREF_NAME + "_" + this.currentAccount, 0), this.groupsSaveGalleryExceptions);
            return;
        }
        if (i == 4) {
            this.chanelSaveGalleryExceptions = longSparseArray;
            SaveToGallerySettingsHelper.saveExceptions(ApplicationLoader.applicationContext.getSharedPreferences(SaveToGallerySettingsHelper.CHANNELS_PREF_NAME + "_" + this.currentAccount, 0), this.chanelSaveGalleryExceptions);
        }
    }

    public void clearConfig() {
        getPreferences().edit().clear().apply();
        int i = 0;
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
        while (true) {
            if (i < 4) {
                if (AccountInstance.getInstance(i).getUserConfig().isClientActivated()) {
                    break;
                } else {
                    i++;
                }
            } else {
                SharedConfig.clearConfig();
                break;
            }
        }
        saveConfig(true);
    }

    public boolean isPinnedDialogsLoaded(int i) {
        return getPreferences().getBoolean("2pinnedDialogsLoaded" + i, false);
    }

    public void setPinnedDialogsLoaded(int i, boolean z) {
        getPreferences().edit().putBoolean("2pinnedDialogsLoaded" + i, z).commit();
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

    public int getTotalDialogsCount(int i) {
        SharedPreferences preferences = getPreferences();
        StringBuilder sb = new StringBuilder();
        sb.append("2totalDialogsLoadCount");
        sb.append(i == 0 ? "" : Integer.valueOf(i));
        return preferences.getInt(sb.toString(), 0);
    }

    public void setTotalDialogsCount(int i, int i2) {
        SharedPreferences.Editor editorEdit = getPreferences().edit();
        StringBuilder sb = new StringBuilder();
        sb.append("2totalDialogsLoadCount");
        sb.append(i == 0 ? "" : Integer.valueOf(i));
        editorEdit.putInt(sb.toString(), i2).commit();
    }

    public long[] getDialogLoadOffsets(int i) {
        SharedPreferences preferences = getPreferences();
        StringBuilder sb = new StringBuilder();
        sb.append("2dialogsLoadOffsetId");
        sb.append(i == 0 ? "" : Integer.valueOf(i));
        int i2 = preferences.getInt(sb.toString(), this.hasValidDialogLoadIds ? 0 : -1);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("2dialogsLoadOffsetDate");
        sb2.append(i == 0 ? "" : Integer.valueOf(i));
        int i3 = preferences.getInt(sb2.toString(), this.hasValidDialogLoadIds ? 0 : -1);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("2dialogsLoadOffsetUserId");
        sb3.append(i == 0 ? "" : Integer.valueOf(i));
        long prefIntOrLong = AndroidUtilities.getPrefIntOrLong(preferences, sb3.toString(), this.hasValidDialogLoadIds ? 0L : -1L);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("2dialogsLoadOffsetChatId");
        sb4.append(i == 0 ? "" : Integer.valueOf(i));
        long prefIntOrLong2 = AndroidUtilities.getPrefIntOrLong(preferences, sb4.toString(), this.hasValidDialogLoadIds ? 0L : -1L);
        StringBuilder sb5 = new StringBuilder();
        sb5.append("2dialogsLoadOffsetChannelId");
        sb5.append(i == 0 ? "" : Integer.valueOf(i));
        long prefIntOrLong3 = AndroidUtilities.getPrefIntOrLong(preferences, sb5.toString(), this.hasValidDialogLoadIds ? 0L : -1L);
        StringBuilder sb6 = new StringBuilder();
        sb6.append("2dialogsLoadOffsetAccess");
        sb6.append(i != 0 ? Integer.valueOf(i) : "");
        return new long[]{i2, i3, prefIntOrLong, prefIntOrLong2, prefIntOrLong3, preferences.getLong(sb6.toString(), this.hasValidDialogLoadIds ? 0L : -1L)};
    }

    public void setDialogsLoadOffset(int i, int i2, int i3, long j, long j2, long j3, long j4) {
        SharedPreferences.Editor editorEdit = getPreferences().edit();
        StringBuilder sb = new StringBuilder();
        sb.append("2dialogsLoadOffsetId");
        sb.append(i == 0 ? "" : Integer.valueOf(i));
        editorEdit.putInt(sb.toString(), i2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("2dialogsLoadOffsetDate");
        sb2.append(i == 0 ? "" : Integer.valueOf(i));
        editorEdit.putInt(sb2.toString(), i3);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("2dialogsLoadOffsetUserId");
        sb3.append(i == 0 ? "" : Integer.valueOf(i));
        editorEdit.putLong(sb3.toString(), j);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("2dialogsLoadOffsetChatId");
        sb4.append(i == 0 ? "" : Integer.valueOf(i));
        editorEdit.putLong(sb4.toString(), j2);
        StringBuilder sb5 = new StringBuilder();
        sb5.append("2dialogsLoadOffsetChannelId");
        sb5.append(i == 0 ? "" : Integer.valueOf(i));
        editorEdit.putLong(sb5.toString(), j3);
        StringBuilder sb6 = new StringBuilder();
        sb6.append("2dialogsLoadOffsetAccess");
        sb6.append(i != 0 ? Integer.valueOf(i) : "");
        editorEdit.putLong(sb6.toString(), j4);
        editorEdit.putBoolean("hasValidDialogLoadIds", true);
        editorEdit.commit();
    }

    public void setShowCallsTab(boolean z) {
        if (this.showCallsTab != z) {
            this.showCallsTab = z;
            saveConfig(false);
        }
    }

    public boolean isPremium() {
        TLRPC.User user = this.currentUser;
        if (user == null) {
            return false;
        }
        return user.premium;
    }

    public Long getEmojiStatus() {
        return UserObject.getEmojiStatusDocumentId(this.currentUser);
    }

    public int getGlobalTTl() {
        return this.globalTtl;
    }

    public void loadGlobalTTl() {
        if (this.ttlIsLoading || System.currentTimeMillis() - this.lastLoadingTime < 60000) {
            return;
        }
        this.ttlIsLoading = true;
        getConnectionsManager().sendRequest(new TLRPC.TL_messages_getDefaultHistoryTTL(), new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$loadGlobalTTl$4(tLObject, tL_error);
            }
        });
    }

    public void lambda$loadGlobalTTl$4(final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$loadGlobalTTl$3(tLObject);
            }
        });
    }

    public void lambda$loadGlobalTTl$3(TLObject tLObject) {
        if (tLObject != null) {
            this.globalTtl = ((TLRPC.TL_defaultHistoryTTL) tLObject).period / 60;
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateGlobalAutoDeleteTimer, new Object[0]);
            this.ttlIsLoading = false;
            this.lastLoadingTime = System.currentTimeMillis();
        }
    }

    public void setGlobalTtl(int i) {
        this.globalTtl = i;
    }

    public void clearFilters() {
        getPreferences().edit().remove("filtersLoaded").apply();
        this.filtersLoaded = false;
    }

    public static int getProductionAccount() {
        int i = -1;
        while (i < 4) {
            int i2 = i < 0 ? selectedAccount : i;
            if (getInstance(i2).isClientActivated() && !ConnectionsManager.getInstance(i2).isTestBackend()) {
                return i2;
            }
            i++;
        }
        return selectedAccount;
    }
}
