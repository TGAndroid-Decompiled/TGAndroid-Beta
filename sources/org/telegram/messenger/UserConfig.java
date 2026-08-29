package org.telegram.messenger;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.util.Base64;
import android.util.LongSparseArray;
import java.util.Arrays;
import org.telegram.messenger.SaveToGallerySettingsHelper;
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
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final UserConfig f21590b;

                {
                    this.f21590b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            this.f21590b.lambda$checkPremiumSelf$1(user2);
                            return;
                        default:
                            this.f21590b.lambda$checkPremiumSelf$2(user2);
                            return;
                    }
                }
            });
        } else if (user == null) {
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final UserConfig f21590b;

                {
                    this.f21590b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            this.f21590b.lambda$checkPremiumSelf$1(user2);
                            return;
                        default:
                            this.f21590b.lambda$checkPremiumSelf$2(user2);
                            return;
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
        if (userConfig2 == null) {
            synchronized (UserConfig.class) {
                try {
                    userConfig = Instance[i10];
                    if (userConfig == null) {
                        UserConfig[] userConfigArr = Instance;
                        UserConfig userConfig3 = new UserConfig(i10);
                        userConfigArr[i10] = userConfig3;
                        userConfig = userConfig3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return userConfig;
        }
        return userConfig2;
    }

    public static int getMaxAccountCount() {
        if (hasPremiumOnAccounts()) {
            return 5;
        }
        return 3;
    }

    public static int getProductionAccount() {
        int i10;
        for (int i11 = -1; i11 < 4; i11++) {
            if (i11 < 0) {
                i10 = selectedAccount;
            } else {
                i10 = i11;
            }
            if (getInstance(i10).isClientActivated() && !ConnectionsManager.getInstance(i10).isTestBackend()) {
                return i10;
            }
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
        if (i10 >= 0 && i10 < 4 && getInstance(i10).isClientActivated()) {
            return true;
        }
        return false;
    }

    public void lambda$checkPremiumSelf$1(TLRPC.User user) {
        getMessagesController().updatePremium(user.premium);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.currentUserPremiumStatusChanged, new Object[0]);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.premiumStatusChangedGlobal, new Object[0]);
        getMediaDataController().loadPremiumPromo(false);
        getMediaDataController().loadReactions(false, null);
        lh.s6 storiesController = getMessagesController().getStoriesController();
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
        AndroidUtilities.runOnUIThread(new vg(16, this, tLObject));
    }

    public void lambda$saveConfig$0(boolean z10) {
        if (this.configLoaded) {
            synchronized (this.sync) {
                try {
                    try {
                        SharedPreferences.Editor edit = getPreferences().edit();
                        if (this.currentAccount == 0) {
                            edit.putInt("selectedAccount", selectedAccount);
                        }
                        edit.putBoolean("registeredForPush", this.registeredForPush);
                        edit.putInt("lastSendMessageId", this.lastSendMessageId);
                        edit.putInt("contactsSavedCount", this.contactsSavedCount);
                        edit.putInt("lastBroadcastId", this.lastBroadcastId);
                        edit.putInt("lastContactsSyncTime", this.lastContactsSyncTime);
                        edit.putInt("lastHintsSyncTime", this.lastHintsSyncTime);
                        edit.putBoolean("draftsLoaded", this.draftsLoaded);
                        edit.putBoolean("unreadDialogsLoaded", this.unreadDialogsLoaded);
                        edit.putInt("ratingLoadTime", this.ratingLoadTime);
                        edit.putInt("botRatingLoadTime", this.botRatingLoadTime);
                        edit.putInt("botGuestRatingLoadTime", this.botGuestRatingLoadTime);
                        edit.putInt("webappRatingLoadTime", this.webappRatingLoadTime);
                        edit.putBoolean("contactsReimported", this.contactsReimported);
                        edit.putInt("loginTime", this.loginTime);
                        edit.putBoolean("syncContacts", this.syncContacts);
                        edit.putBoolean("showCallsTab", this.showCallsTab);
                        edit.putBoolean("suggestContacts", this.suggestContacts);
                        edit.putBoolean("hasSecureData", this.hasSecureData);
                        edit.putBoolean("notificationsSettingsLoaded4", this.notificationsSettingsLoaded);
                        edit.putBoolean("notificationsSignUpSettingsLoaded", this.notificationsSignUpSettingsLoaded);
                        edit.putLong("autoDownloadConfigLoadTime", this.autoDownloadConfigLoadTime);
                        edit.putBoolean("hasValidDialogLoadIds", this.hasValidDialogLoadIds);
                        edit.putInt("sharingMyLocationUntil", this.sharingMyLocationUntil);
                        edit.putInt("lastMyLocationShareTime", this.lastMyLocationShareTime);
                        edit.putBoolean("filtersLoaded", this.filtersLoaded);
                        edit.putString("premiumGiftsStickerPack", this.premiumGiftsStickerPack);
                        edit.putLong("lastUpdatedPremiumGiftsStickerPack", this.lastUpdatedPremiumGiftsStickerPack);
                        edit.putString("genericAnimationsStickerPack", this.genericAnimationsStickerPack);
                        edit.putLong("lastUpdatedGenericAnimations", this.lastUpdatedGenericAnimations);
                        edit.putInt("6migrateOffsetId", this.migrateOffsetId);
                        if (this.migrateOffsetId != -1) {
                            edit.putInt("6migrateOffsetDate", this.migrateOffsetDate);
                            edit.putLong("6migrateOffsetUserId", this.migrateOffsetUserId);
                            edit.putLong("6migrateOffsetChatId", this.migrateOffsetChatId);
                            edit.putLong("6migrateOffsetChannelId", this.migrateOffsetChannelId);
                            edit.putLong("6migrateOffsetAccess", this.migrateOffsetAccess);
                        }
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = this.unacceptedTermsOfService;
                        if (tL_help_termsOfService != null) {
                            try {
                                SerializedData serializedData = new SerializedData(tL_help_termsOfService.getObjectSize());
                                this.unacceptedTermsOfService.serializeToStream(serializedData);
                                edit.putString("terms", Base64.encodeToString(serializedData.toByteArray(), 0));
                                serializedData.cleanup();
                            } catch (Exception unused) {
                            }
                        } else {
                            edit.remove("terms");
                        }
                        SharedConfig.saveConfig();
                        if (this.tmpPassword != null) {
                            SerializedData serializedData2 = new SerializedData();
                            this.tmpPassword.serializeToStream(serializedData2);
                            edit.putString("tmpPassword", Base64.encodeToString(serializedData2.toByteArray(), 0));
                            serializedData2.cleanup();
                        } else {
                            edit.remove("tmpPassword");
                        }
                        if (this.currentUser != null) {
                            if (z10) {
                                SerializedData serializedData3 = new SerializedData();
                                this.currentUser.serializeToStream(serializedData3);
                                edit.putString("user", Base64.encodeToString(serializedData3.toByteArray(), 0));
                                serializedData3.cleanup();
                            }
                        } else {
                            edit.remove("user");
                        }
                        edit.apply();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void checkSavedPassword() {
        if ((this.savedSaltedPassword == null && this.savedPasswordHash == null) || Math.abs(SystemClock.elapsedRealtime() - this.savedPasswordTime) < 1800000) {
            return;
        }
        resetSavedPassword();
    }

    public void clearConfig() {
        getPreferences().edit().clear().apply();
        int i10 = 0;
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
            if (i10 < 4) {
                if (AccountInstance.getInstance(i10).getUserConfig().isClientActivated()) {
                    break;
                }
                i10++;
            } else {
                SharedConfig.clearConfig();
                break;
            }
        }
        saveConfig(true);
    }

    public void clearFilters() {
        getPreferences().edit().remove("filtersLoaded").apply();
        this.filtersLoaded = false;
    }

    public void clearPinnedDialogsLoaded() {
        SharedPreferences.Editor edit = getPreferences().edit();
        for (String str : getPreferences().getAll().keySet()) {
            if (str.startsWith("2pinnedDialogsLoaded")) {
                edit.remove(str);
            }
        }
        edit.apply();
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

    public long getClientUserId() {
        long j10;
        synchronized (this.sync) {
            try {
                TLRPC.User user = this.currentUser;
                if (user != null) {
                    j10 = user.f22539id;
                } else {
                    j10 = 0;
                }
            } catch (Throwable th2) {
                throw th2;
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
        Integer valueOf;
        int i11;
        Integer valueOf2;
        Integer valueOf3;
        long j10;
        Integer valueOf4;
        long j11;
        Integer valueOf5;
        long j12;
        long j13;
        SharedPreferences preferences = getPreferences();
        StringBuilder sb2 = new StringBuilder("2dialogsLoadOffsetId");
        Object obj = "";
        if (i10 == 0) {
            valueOf = "";
        } else {
            valueOf = Integer.valueOf(i10);
        }
        sb2.append(valueOf);
        String sb3 = sb2.toString();
        int i12 = -1;
        if (this.hasValidDialogLoadIds) {
            i11 = 0;
        } else {
            i11 = -1;
        }
        int i13 = preferences.getInt(sb3, i11);
        StringBuilder sb4 = new StringBuilder("2dialogsLoadOffsetDate");
        if (i10 == 0) {
            valueOf2 = "";
        } else {
            valueOf2 = Integer.valueOf(i10);
        }
        sb4.append(valueOf2);
        String sb5 = sb4.toString();
        if (this.hasValidDialogLoadIds) {
            i12 = 0;
        }
        int i14 = preferences.getInt(sb5, i12);
        StringBuilder sb6 = new StringBuilder("2dialogsLoadOffsetUserId");
        if (i10 == 0) {
            valueOf3 = "";
        } else {
            valueOf3 = Integer.valueOf(i10);
        }
        sb6.append(valueOf3);
        String sb7 = sb6.toString();
        if (this.hasValidDialogLoadIds) {
            j10 = 0;
        } else {
            j10 = -1;
        }
        long prefIntOrLong = AndroidUtilities.getPrefIntOrLong(preferences, sb7, j10);
        StringBuilder sb8 = new StringBuilder("2dialogsLoadOffsetChatId");
        if (i10 == 0) {
            valueOf4 = "";
        } else {
            valueOf4 = Integer.valueOf(i10);
        }
        sb8.append(valueOf4);
        String sb9 = sb8.toString();
        if (this.hasValidDialogLoadIds) {
            j11 = 0;
        } else {
            j11 = -1;
        }
        long prefIntOrLong2 = AndroidUtilities.getPrefIntOrLong(preferences, sb9, j11);
        StringBuilder sb10 = new StringBuilder("2dialogsLoadOffsetChannelId");
        if (i10 == 0) {
            valueOf5 = "";
        } else {
            valueOf5 = Integer.valueOf(i10);
        }
        sb10.append(valueOf5);
        String sb11 = sb10.toString();
        if (this.hasValidDialogLoadIds) {
            j12 = 0;
        } else {
            j12 = -1;
        }
        long prefIntOrLong3 = AndroidUtilities.getPrefIntOrLong(preferences, sb11, j12);
        StringBuilder sb12 = new StringBuilder("2dialogsLoadOffsetAccess");
        if (i10 != 0) {
            obj = Integer.valueOf(i10);
        }
        sb12.append(obj);
        String sb13 = sb12.toString();
        if (this.hasValidDialogLoadIds) {
            j13 = 0;
        } else {
            j13 = -1;
        }
        return new long[]{i13, i14, prefIntOrLong, prefIntOrLong2, prefIntOrLong3, preferences.getLong(sb13, j13)};
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
        Context context = ApplicationLoader.applicationContext;
        return context.getSharedPreferences("userconfig" + this.currentAccount, 0);
    }

    public LongSparseArray<SaveToGallerySettingsHelper.DialogException> getSaveGalleryExceptions(int i10) {
        if (i10 == 1) {
            if (this.userSaveGalleryExceptions == null) {
                Context context = ApplicationLoader.applicationContext;
                this.userSaveGalleryExceptions = SaveToGallerySettingsHelper.loadExceptions(context.getSharedPreferences(SaveToGallerySettingsHelper.USERS_PREF_NAME + "_" + this.currentAccount, 0));
            }
            return this.userSaveGalleryExceptions;
        } else if (i10 == 2) {
            if (this.groupsSaveGalleryExceptions == null) {
                Context context2 = ApplicationLoader.applicationContext;
                this.groupsSaveGalleryExceptions = SaveToGallerySettingsHelper.loadExceptions(context2.getSharedPreferences(SaveToGallerySettingsHelper.GROUPS_PREF_NAME + "_" + this.currentAccount, 0));
            }
            return this.groupsSaveGalleryExceptions;
        } else if (i10 == 4) {
            if (this.chanelSaveGalleryExceptions == null) {
                Context context3 = ApplicationLoader.applicationContext;
                this.chanelSaveGalleryExceptions = SaveToGallerySettingsHelper.loadExceptions(context3.getSharedPreferences(SaveToGallerySettingsHelper.CHANNELS_PREF_NAME + "_" + this.currentAccount, 0));
            }
            return this.chanelSaveGalleryExceptions;
        } else {
            return null;
        }
    }

    public int getTotalDialogsCount(int i10) {
        Object valueOf;
        SharedPreferences preferences = getPreferences();
        StringBuilder sb2 = new StringBuilder("2totalDialogsLoadCount");
        if (i10 == 0) {
            valueOf = "";
        } else {
            valueOf = Integer.valueOf(i10);
        }
        sb2.append(valueOf);
        return preferences.getInt(sb2.toString(), 0);
    }

    public boolean isClientActivated() {
        boolean z10;
        synchronized (this.sync) {
            if (this.currentUser != null) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public boolean isConfigLoaded() {
        return this.configLoaded;
    }

    public boolean isPinnedDialogsLoaded(int i10) {
        SharedPreferences preferences = getPreferences();
        return preferences.getBoolean("2pinnedDialogsLoaded" + i10, false);
    }

    public boolean isPremium() {
        TLRPC.User user = this.currentUser;
        if (user == null) {
            return false;
        }
        return user.premium;
    }

    public void loadConfig() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.UserConfig.loadConfig():void");
    }

    public void loadGlobalTTl() {
        if (!this.ttlIsLoading && System.currentTimeMillis() - this.lastLoadingTime >= 60000) {
            this.ttlIsLoading = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_messages_getDefaultHistoryTTL(), new g0(this, 10));
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

    public void saveConfig(boolean z10) {
        NotificationCenter.getInstance(this.currentAccount).doOnIdle(new hh.f(16, this, z10));
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
            this.clientUserId = user.f22539id;
            checkPremiumSelf(user2, user);
        }
    }

    public void setDialogsLoadOffset(int i10, int i11, int i12, long j10, long j11, long j12, long j13) {
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        Integer valueOf4;
        Integer valueOf5;
        SharedPreferences.Editor edit = getPreferences().edit();
        StringBuilder sb2 = new StringBuilder("2dialogsLoadOffsetId");
        Object obj = "";
        if (i10 == 0) {
            valueOf = "";
        } else {
            valueOf = Integer.valueOf(i10);
        }
        sb2.append(valueOf);
        edit.putInt(sb2.toString(), i11);
        StringBuilder sb3 = new StringBuilder("2dialogsLoadOffsetDate");
        if (i10 == 0) {
            valueOf2 = "";
        } else {
            valueOf2 = Integer.valueOf(i10);
        }
        sb3.append(valueOf2);
        edit.putInt(sb3.toString(), i12);
        StringBuilder sb4 = new StringBuilder("2dialogsLoadOffsetUserId");
        if (i10 == 0) {
            valueOf3 = "";
        } else {
            valueOf3 = Integer.valueOf(i10);
        }
        sb4.append(valueOf3);
        edit.putLong(sb4.toString(), j10);
        StringBuilder sb5 = new StringBuilder("2dialogsLoadOffsetChatId");
        if (i10 == 0) {
            valueOf4 = "";
        } else {
            valueOf4 = Integer.valueOf(i10);
        }
        sb5.append(valueOf4);
        edit.putLong(sb5.toString(), j11);
        StringBuilder sb6 = new StringBuilder("2dialogsLoadOffsetChannelId");
        if (i10 == 0) {
            valueOf5 = "";
        } else {
            valueOf5 = Integer.valueOf(i10);
        }
        sb6.append(valueOf5);
        edit.putLong(sb6.toString(), j12);
        StringBuilder sb7 = new StringBuilder("2dialogsLoadOffsetAccess");
        if (i10 != 0) {
            obj = Integer.valueOf(i10);
        }
        sb7.append(obj);
        edit.putLong(sb7.toString(), j13);
        edit.putBoolean("hasValidDialogLoadIds", true);
        edit.commit();
    }

    public void setGlobalTtl(int i10) {
        this.globalTtl = i10;
    }

    public void setPinnedDialogsLoaded(int i10, boolean z10) {
        SharedPreferences.Editor edit = getPreferences().edit();
        edit.putBoolean("2pinnedDialogsLoaded" + i10, z10).commit();
    }

    public void setShowCallsTab(boolean z10) {
        if (this.showCallsTab != z10) {
            this.showCallsTab = z10;
            saveConfig(false);
        }
    }

    public void setTotalDialogsCount(int i10, int i11) {
        Object valueOf;
        SharedPreferences.Editor edit = getPreferences().edit();
        StringBuilder sb2 = new StringBuilder("2totalDialogsLoadCount");
        if (i10 == 0) {
            valueOf = "";
        } else {
            valueOf = Integer.valueOf(i10);
        }
        sb2.append(valueOf);
        edit.putInt(sb2.toString(), i11).commit();
    }

    public void updateSaveGalleryExceptions(int i10, LongSparseArray<SaveToGallerySettingsHelper.DialogException> longSparseArray) {
        if (i10 == 1) {
            this.userSaveGalleryExceptions = longSparseArray;
            Context context = ApplicationLoader.applicationContext;
            SaveToGallerySettingsHelper.saveExceptions(context.getSharedPreferences(SaveToGallerySettingsHelper.USERS_PREF_NAME + "_" + this.currentAccount, 0), this.userSaveGalleryExceptions);
        } else if (i10 == 2) {
            this.groupsSaveGalleryExceptions = longSparseArray;
            Context context2 = ApplicationLoader.applicationContext;
            SaveToGallerySettingsHelper.saveExceptions(context2.getSharedPreferences(SaveToGallerySettingsHelper.GROUPS_PREF_NAME + "_" + this.currentAccount, 0), this.groupsSaveGalleryExceptions);
        } else if (i10 == 4) {
            this.chanelSaveGalleryExceptions = longSparseArray;
            Context context3 = ApplicationLoader.applicationContext;
            SaveToGallerySettingsHelper.saveExceptions(context3.getSharedPreferences(SaveToGallerySettingsHelper.CHANNELS_PREF_NAME + "_" + this.currentAccount, 0), this.chanelSaveGalleryExceptions);
        }
    }
}
