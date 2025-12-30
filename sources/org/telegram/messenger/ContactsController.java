package org.telegram.messenger;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.collection.LongSparseArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.text.CollationKey;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.Bulletin;

public class ContactsController extends BaseController {
    private static volatile ContactsController[] Instance = new ContactsController[4];
    public static final int PRIVACY_RULES_TYPE_ADDED_BY_PHONE = 7;
    public static final int PRIVACY_RULES_TYPE_BIO = 9;
    public static final int PRIVACY_RULES_TYPE_BIRTHDAY = 11;
    public static final int PRIVACY_RULES_TYPE_CALLS = 2;
    public static final int PRIVACY_RULES_TYPE_COUNT = 15;
    public static final int PRIVACY_RULES_TYPE_FORWARDS = 5;
    public static final int PRIVACY_RULES_TYPE_GIFTS = 12;
    public static final int PRIVACY_RULES_TYPE_INVITE = 1;
    public static final int PRIVACY_RULES_TYPE_LASTSEEN = 0;
    public static final int PRIVACY_RULES_TYPE_MESSAGES = 10;
    public static final int PRIVACY_RULES_TYPE_MUSIC = 14;
    public static final int PRIVACY_RULES_TYPE_NO_PAID_MESSAGES = 13;
    public static final int PRIVACY_RULES_TYPE_P2P = 3;
    public static final int PRIVACY_RULES_TYPE_PHONE = 6;
    public static final int PRIVACY_RULES_TYPE_PHOTO = 4;
    public static final int PRIVACY_RULES_TYPE_VOICE_MESSAGES = 8;
    private static Collator cachedCollator;
    private static Locale cachedCollatorLocale;
    private ArrayList<TLRPC.PrivacyRule> addedByPhonePrivacyRules;
    private ArrayList<TLRPC.PrivacyRule> bioPrivacyRules;
    private ArrayList<TLRPC.PrivacyRule> birthdayPrivacyRules;
    private ArrayList<TLRPC.PrivacyRule> callPrivacyRules;
    private int completedRequestsCount;
    public ArrayList<TLRPC.TL_contact> contacts;
    public HashMap<String, Contact> contactsBook;
    private boolean contactsBookLoaded;
    public HashMap<String, Contact> contactsBookSPhones;
    public HashMap<String, TLRPC.TL_contact> contactsByPhone;
    public HashMap<String, TLRPC.TL_contact> contactsByShortPhone;
    public ConcurrentHashMap<Long, TLRPC.TL_contact> contactsDict;
    public boolean contactsLoaded;
    private boolean contactsSyncInProgress;
    private ArrayList<Long> delayedContactsUpdate;
    private int deleteAccountTTL;
    public boolean doneLoadingContacts;
    private ArrayList<TLRPC.PrivacyRule> forwardsPrivacyRules;
    private ArrayList<TLRPC.PrivacyRule> giftsPrivacyRules;
    private TLRPC.GlobalPrivacySettings globalPrivacySettings;
    private ArrayList<TLRPC.PrivacyRule> groupPrivacyRules;
    private boolean ignoreChanges;
    private String inviteLink;
    private String lastContactsVersions;
    private ArrayList<TLRPC.PrivacyRule> lastseenPrivacyRules;
    private final Object loadContactsSync;
    private boolean loadingContacts;
    private int loadingDeleteInfo;
    private int loadingGlobalSettings;
    private int[] loadingPrivacyInfo;
    private boolean migratingContacts;
    private ArrayList<TLRPC.PrivacyRule> musicPrivacyRules;
    private ArrayList<TLRPC.PrivacyRule> noPaidMessagesPrivacyRules;
    private final Object observerLock;
    private ArrayList<TLRPC.PrivacyRule> p2pPrivacyRules;
    public HashMap<String, Contact> phoneBookByShortPhones;
    public ArrayList<Contact> phoneBookContacts;
    public ArrayList<String> phoneBookSectionsArray;
    public HashMap<String, ArrayList<Object>> phoneBookSectionsDict;
    private ArrayList<TLRPC.PrivacyRule> phonePrivacyRules;
    private ArrayList<TLRPC.PrivacyRule> profilePhotoPrivacyRules;
    private String[] projectionNames;
    private String[] projectionPhones;
    private HashMap<String, String> sectionsToReplace;
    public ArrayList<String> sortedUsersMutualSectionsArray;
    public ArrayList<String> sortedUsersSectionsArray;
    private Account systemAccount;
    private boolean updatingInviteLink;
    public HashMap<String, ArrayList<TLRPC.TL_contact>> usersMutualSectionsDict;
    public HashMap<String, ArrayList<TLRPC.TL_contact>> usersSectionsDict;
    private ArrayList<TLRPC.PrivacyRule> voiceMessagesRules;

    public static void lambda$resetImportedContacts$10(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    class MyContentObserver extends ContentObserver {
        private Runnable checkRunnable;

        @Override
        public boolean deliverSelfNotifications() {
            return false;
        }

        public static void lambda$new$0() {
            for (int i = 0; i < 4; i++) {
                if (UserConfig.getInstance(i).isClientActivated()) {
                    ConnectionsManager.getInstance(i).resumeNetworkMaybe();
                    ContactsController.getInstance(i).checkContacts();
                }
            }
        }

        public MyContentObserver() {
            super(null);
            this.checkRunnable = new Runnable() {
                @Override
                public final void run() {
                    ContactsController.MyContentObserver.lambda$new$0();
                }
            };
        }

        @Override
        public void onChange(boolean z) {
            super.onChange(z);
            synchronized (ContactsController.this.observerLock) {
                try {
                    if (ContactsController.this.ignoreChanges) {
                        return;
                    }
                    Utilities.globalQueue.cancelRunnable(this.checkRunnable);
                    Utilities.globalQueue.postRunnable(this.checkRunnable, 500L);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static Collator getLocaleCollator() {
        if (cachedCollator == null || cachedCollatorLocale != Locale.getDefault()) {
            try {
                Locale locale = Locale.getDefault();
                cachedCollatorLocale = locale;
                Collator collator = Collator.getInstance(locale);
                cachedCollator = collator;
                collator.setStrength(1);
            } catch (Exception e) {
                FileLog.e((Throwable) e, true);
            }
        }
        if (cachedCollator == null) {
            try {
                Collator collator2 = Collator.getInstance();
                cachedCollator = collator2;
                collator2.setStrength(1);
            } catch (Exception e2) {
                FileLog.e((Throwable) e2, true);
            }
        }
        if (cachedCollator == null) {
            cachedCollator = new Collator() {
                @Override
                public CollationKey getCollationKey(String str) {
                    return null;
                }

                @Override
                public int hashCode() {
                    return 0;
                }

                @Override
                public int compare(String str, String str2) {
                    if (str == null || str2 == null) {
                        return 0;
                    }
                    return str.compareTo(str2);
                }
            };
        }
        return cachedCollator;
    }

    public static class Contact {
        public int contact_id;
        public String first_name;
        public int imported;
        public boolean isGoodProvider;
        public String key;
        public String last_name;
        public boolean namesFilled;
        public String provider;
        public TLRPC.User user;
        public ArrayList<String> phones = new ArrayList<>(4);
        public ArrayList<String> phoneTypes = new ArrayList<>(4);
        public ArrayList<String> shortPhones = new ArrayList<>(4);
        public ArrayList<Integer> phoneDeleted = new ArrayList<>(4);

        public String getLetter() {
            return getLetter(this.first_name, this.last_name);
        }

        public static String getLetter(String str, String str2) {
            if (!TextUtils.isEmpty(str)) {
                return str.substring(0, 1);
            }
            if (!TextUtils.isEmpty(str2)) {
                return str2.substring(0, 1);
            }
            return "#";
        }
    }

    public static ContactsController getInstance(int i) {
        ContactsController contactsController = Instance[i];
        if (contactsController == null) {
            synchronized (ContactsController.class) {
                try {
                    contactsController = Instance[i];
                    if (contactsController == null) {
                        ContactsController[] contactsControllerArr = Instance;
                        ContactsController contactsController2 = new ContactsController(i);
                        contactsControllerArr[i] = contactsController2;
                        contactsController = contactsController2;
                    }
                } finally {
                }
            }
        }
        return contactsController;
    }

    public ContactsController(int i) {
        super(i);
        this.loadContactsSync = new Object();
        this.observerLock = new Object();
        this.lastContactsVersions = "";
        this.delayedContactsUpdate = new ArrayList<>();
        this.sectionsToReplace = new HashMap<>();
        this.loadingPrivacyInfo = new int[15];
        this.projectionPhones = new String[]{"lookup", "data1", "data2", "data3", "display_name", "account_type"};
        this.projectionNames = new String[]{"lookup", "data2", "data3", "data5"};
        this.contactsBook = new HashMap<>();
        this.contactsBookSPhones = new HashMap<>();
        this.phoneBookContacts = new ArrayList<>();
        this.phoneBookSectionsDict = new HashMap<>();
        this.phoneBookSectionsArray = new ArrayList<>();
        this.phoneBookByShortPhones = new HashMap<>();
        this.contacts = new ArrayList<>();
        this.contactsDict = new ConcurrentHashMap<>(20, 1.0f, 2);
        this.usersSectionsDict = new HashMap<>();
        this.sortedUsersSectionsArray = new ArrayList<>();
        this.usersMutualSectionsDict = new HashMap<>();
        this.sortedUsersMutualSectionsArray = new ArrayList<>();
        this.contactsByPhone = new HashMap<>();
        this.contactsByShortPhone = new HashMap<>();
        if (MessagesController.getMainSettings(this.currentAccount).getBoolean("needGetStatuses", false)) {
            reloadContactsStatuses();
        }
        this.sectionsToReplace.put("À", "A");
        this.sectionsToReplace.put("Á", "A");
        this.sectionsToReplace.put("Ä", "A");
        this.sectionsToReplace.put("Ù", "U");
        this.sectionsToReplace.put("Ú", "U");
        this.sectionsToReplace.put("Ü", "U");
        this.sectionsToReplace.put("Ì", "I");
        this.sectionsToReplace.put("Í", "I");
        this.sectionsToReplace.put("Ï", "I");
        this.sectionsToReplace.put("È", "E");
        this.sectionsToReplace.put("É", "E");
        this.sectionsToReplace.put("Ê", "E");
        this.sectionsToReplace.put("Ë", "E");
        this.sectionsToReplace.put("Ò", "O");
        this.sectionsToReplace.put("Ó", "O");
        this.sectionsToReplace.put("Ö", "O");
        this.sectionsToReplace.put("Ç", "C");
        this.sectionsToReplace.put("Ñ", "N");
        this.sectionsToReplace.put("Ÿ", "Y");
        this.sectionsToReplace.put("Ý", "Y");
        this.sectionsToReplace.put("Ţ", "Y");
        if (i == 0) {
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$new$0();
                }
            });
        }
    }

    public void lambda$new$0() {
        try {
            if (hasContactsPermission()) {
                ApplicationLoader.applicationContext.getContentResolver().registerContentObserver(ContactsContract.Contacts.CONTENT_URI, true, new MyContentObserver());
            }
        } catch (Throwable unused) {
        }
    }

    public void cleanup() {
        this.contactsBook.clear();
        this.contactsBookSPhones.clear();
        this.phoneBookContacts.clear();
        this.contacts.clear();
        this.contactsDict.clear();
        this.usersSectionsDict.clear();
        this.usersMutualSectionsDict.clear();
        this.sortedUsersSectionsArray.clear();
        this.sortedUsersMutualSectionsArray.clear();
        this.delayedContactsUpdate.clear();
        this.contactsByPhone.clear();
        this.contactsByShortPhone.clear();
        this.phoneBookSectionsDict.clear();
        this.phoneBookSectionsArray.clear();
        this.phoneBookByShortPhones.clear();
        this.loadingContacts = false;
        this.contactsSyncInProgress = false;
        this.doneLoadingContacts = false;
        this.contactsLoaded = false;
        this.contactsBookLoaded = false;
        this.lastContactsVersions = "";
        this.loadingGlobalSettings = 0;
        this.loadingDeleteInfo = 0;
        this.deleteAccountTTL = 0;
        Arrays.fill(this.loadingPrivacyInfo, 0);
        this.lastseenPrivacyRules = null;
        this.groupPrivacyRules = null;
        this.callPrivacyRules = null;
        this.p2pPrivacyRules = null;
        this.profilePhotoPrivacyRules = null;
        this.bioPrivacyRules = null;
        this.musicPrivacyRules = null;
        this.birthdayPrivacyRules = null;
        this.giftsPrivacyRules = null;
        this.forwardsPrivacyRules = null;
        this.phonePrivacyRules = null;
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$cleanup$1();
            }
        });
    }

    public void lambda$cleanup$1() {
        this.migratingContacts = false;
        this.completedRequestsCount = 0;
    }

    public void checkInviteText() {
        SharedPreferences mainSettings = MessagesController.getMainSettings(this.currentAccount);
        this.inviteLink = mainSettings.getString("invitelink", null);
        int i = mainSettings.getInt("invitelinktime", 0);
        if (this.updatingInviteLink) {
            return;
        }
        if (this.inviteLink == null || Math.abs((System.currentTimeMillis() / 1000) - i) >= 86400) {
            this.updatingInviteLink = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_help_getInviteText(), new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$checkInviteText$3(tLObject, tL_error);
                }
            }, 2);
        }
    }

    public void lambda$checkInviteText$3(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            final TLRPC.TL_help_inviteText tL_help_inviteText = (TLRPC.TL_help_inviteText) tLObject;
            if (tL_help_inviteText.message.length() != 0) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$checkInviteText$2(tL_help_inviteText);
                    }
                });
            }
        }
    }

    public void lambda$checkInviteText$2(TLRPC.TL_help_inviteText tL_help_inviteText) {
        this.updatingInviteLink = false;
        SharedPreferences.Editor editorEdit = MessagesController.getMainSettings(this.currentAccount).edit();
        String str = tL_help_inviteText.message;
        this.inviteLink = str;
        editorEdit.putString("invitelink", str);
        editorEdit.putInt("invitelinktime", (int) (System.currentTimeMillis() / 1000));
        editorEdit.commit();
    }

    public String getInviteText(int i) {
        String str = this.inviteLink;
        if (str == null) {
            str = "https://telegram.org/dl";
        }
        if (i <= 1) {
            return LocaleController.formatString(R.string.InviteText2, str);
        }
        try {
            return String.format(LocaleController.getPluralString("InviteTextNum", i), Integer.valueOf(i), str);
        } catch (Exception unused) {
            return LocaleController.formatString(R.string.InviteText2, str);
        }
    }

    public void checkAppAccount() {
        this.systemAccount = null;
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$checkAppAccount$4();
            }
        });
    }

    public void lambda$checkAppAccount$4() {
        AccountManager accountManager = AccountManager.get(ApplicationLoader.applicationContext);
        try {
            Account[] accountsByType = accountManager.getAccountsByType("org.telegram.messenger");
            for (int i = 0; i < accountsByType.length; i++) {
                Account account = accountsByType[i];
                int i2 = 0;
                while (true) {
                    if (i2 < 4) {
                        TLRPC.User currentUser = UserConfig.getInstance(i2).getCurrentUser();
                        if (currentUser != null) {
                            if (account.name.equals("" + currentUser.id)) {
                                if (i2 == this.currentAccount) {
                                    this.systemAccount = account;
                                }
                            }
                        }
                        i2++;
                    } else {
                        try {
                            accountManager.removeAccount(accountsByType[i], null, null);
                            break;
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        if (getUserConfig().isClientActivated()) {
            readContacts();
            if (this.systemAccount == null) {
                try {
                    Account account2 = new Account("" + getUserConfig().getClientUserId(), "org.telegram.messenger");
                    this.systemAccount = account2;
                    accountManager.addAccountExplicitly(account2, "", null);
                } catch (Exception unused3) {
                }
            }
        }
    }

    public void deleteUnknownAppAccounts() {
        try {
            this.systemAccount = null;
            AccountManager accountManager = AccountManager.get(ApplicationLoader.applicationContext);
            Account[] accountsByType = accountManager.getAccountsByType("org.telegram.messenger");
            for (int i = 0; i < accountsByType.length; i++) {
                Account account = accountsByType[i];
                int i2 = 0;
                while (true) {
                    if (i2 < 4) {
                        TLRPC.User currentUser = UserConfig.getInstance(i2).getCurrentUser();
                        if (currentUser != null) {
                            if (account.name.equals("" + currentUser.id)) {
                                break;
                            }
                        }
                        i2++;
                    } else {
                        try {
                            accountManager.removeAccount(accountsByType[i], null, null);
                            break;
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void checkContacts() {
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$checkContacts$5();
            }
        });
    }

    public void lambda$checkContacts$5() {
        if (checkContactsInternal()) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("detected contacts change");
            }
            performSyncPhoneBook(getContactsCopy(this.contactsBook), true, false, true, false, true, false);
        }
    }

    public void forceImportContacts() {
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$forceImportContacts$6();
            }
        });
    }

    public void lambda$forceImportContacts$6() {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("force import contacts");
        }
        performSyncPhoneBook(new HashMap<>(), true, true, true, true, false, false);
    }

    public void syncPhoneBookByAlert(final HashMap<String, Contact> map, final boolean z, final boolean z2, final boolean z3) {
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$syncPhoneBookByAlert$7(map, z, z2, z3);
            }
        });
    }

    public void lambda$syncPhoneBookByAlert$7(HashMap map, boolean z, boolean z2, boolean z3) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("sync contacts by alert");
        }
        performSyncPhoneBook(map, true, z, z2, false, false, z3);
    }

    public void deleteAllContacts(final Runnable runnable) {
        resetImportedContacts();
        TLRPC.TL_contacts_deleteContacts tL_contacts_deleteContacts = new TLRPC.TL_contacts_deleteContacts();
        int size = this.contacts.size();
        for (int i = 0; i < size; i++) {
            tL_contacts_deleteContacts.id.add(getMessagesController().getInputUser(this.contacts.get(i).user_id));
        }
        getConnectionsManager().sendRequest(tL_contacts_deleteContacts, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$deleteAllContacts$9(runnable, tLObject, tL_error);
            }
        });
    }

    public void lambda$deleteAllContacts$9(final Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            this.contactsBookSPhones.clear();
            this.contactsBook.clear();
            this.completedRequestsCount = 0;
            this.migratingContacts = false;
            this.contactsSyncInProgress = false;
            this.contactsLoaded = false;
            this.loadingContacts = false;
            this.contactsBookLoaded = false;
            this.lastContactsVersions = "";
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$deleteAllContacts$8(runnable);
                }
            });
            return;
        }
        AndroidUtilities.runOnUIThread(runnable);
    }

    public void lambda$deleteAllContacts$8(Runnable runnable) {
        AccountManager accountManager = AccountManager.get(ApplicationLoader.applicationContext);
        try {
            Account[] accountsByType = accountManager.getAccountsByType("org.telegram.messenger");
            this.systemAccount = null;
            for (Account account : accountsByType) {
                int i = 0;
                while (true) {
                    if (i >= 4) {
                        break;
                    }
                    TLRPC.User currentUser = UserConfig.getInstance(i).getCurrentUser();
                    if (currentUser != null) {
                        if (account.name.equals("" + currentUser.id)) {
                            accountManager.removeAccount(account, null, null);
                            break;
                        }
                    }
                    i++;
                }
            }
        } catch (Throwable unused) {
        }
        try {
            Account account2 = new Account("" + getUserConfig().getClientUserId(), "org.telegram.messenger");
            this.systemAccount = account2;
            accountManager.addAccountExplicitly(account2, "", null);
        } catch (Exception unused2) {
        }
        getMessagesStorage().putCachedPhoneBook(new HashMap<>(), false, true);
        getMessagesStorage().putContacts(new ArrayList<>(), true);
        this.phoneBookContacts.clear();
        this.contacts.clear();
        this.contactsDict.clear();
        this.usersSectionsDict.clear();
        this.usersMutualSectionsDict.clear();
        this.sortedUsersSectionsArray.clear();
        this.phoneBookSectionsDict.clear();
        this.phoneBookSectionsArray.clear();
        this.phoneBookByShortPhones.clear();
        this.delayedContactsUpdate.clear();
        this.sortedUsersMutualSectionsArray.clear();
        this.contactsByPhone.clear();
        this.contactsByShortPhone.clear();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsDidLoad, new Object[0]);
        loadContacts(false, 0L);
        runnable.run();
    }

    public void resetImportedContacts() {
        getConnectionsManager().sendRequest(new TLRPC.TL_contacts_resetSaved(), new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ContactsController.lambda$resetImportedContacts$10(tLObject, tL_error);
            }
        });
    }

    private boolean checkContactsInternal() {
        boolean z = false;
        try {
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (!hasContactsPermission()) {
            return false;
        }
        try {
            Cursor cursorQuery = ApplicationLoader.applicationContext.getContentResolver().query(ContactsContract.RawContacts.CONTENT_URI, new String[]{"version"}, null, null, null);
            if (cursorQuery != null) {
                try {
                    StringBuilder sb = new StringBuilder();
                    while (cursorQuery.moveToNext()) {
                        sb.append(cursorQuery.getString(cursorQuery.getColumnIndex("version")));
                    }
                    String string = sb.toString();
                    if (this.lastContactsVersions.length() != 0 && !this.lastContactsVersions.equals(string)) {
                        z = true;
                    }
                    this.lastContactsVersions = string;
                } finally {
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        return z;
    }

    public void readContacts() {
        synchronized (this.loadContactsSync) {
            try {
                if (this.loadingContacts) {
                    return;
                }
                this.loadingContacts = true;
                Utilities.stageQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$readContacts$11();
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void lambda$readContacts$11() {
        if (!this.contacts.isEmpty() || this.contactsLoaded) {
            synchronized (this.loadContactsSync) {
                this.loadingContacts = false;
            }
            return;
        }
        loadContacts(true, 0L);
    }

    private boolean isNotValidNameString(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= '0' && cCharAt <= '9') {
                i++;
            }
        }
        return i > 3;
    }

    public java.util.HashMap<java.lang.String, org.telegram.messenger.ContactsController.Contact> readContactsFromPhoneBook() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ContactsController.readContactsFromPhoneBook():java.util.HashMap");
    }

    public HashMap<String, Contact> getContactsCopy(HashMap<String, Contact> map) {
        HashMap<String, Contact> map2 = new HashMap<>();
        for (Map.Entry<String, Contact> entry : map.entrySet()) {
            Contact contact = new Contact();
            Contact value = entry.getValue();
            contact.phoneDeleted.addAll(value.phoneDeleted);
            contact.phones.addAll(value.phones);
            contact.phoneTypes.addAll(value.phoneTypes);
            contact.shortPhones.addAll(value.shortPhones);
            contact.first_name = value.first_name;
            contact.last_name = value.last_name;
            contact.contact_id = value.contact_id;
            String str = value.key;
            contact.key = str;
            map2.put(str, contact);
        }
        return map2;
    }

    protected void migratePhoneBookToV7(final SparseArray<Contact> sparseArray) {
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$migratePhoneBookToV7$12(sparseArray);
            }
        });
    }

    public void lambda$migratePhoneBookToV7$12(SparseArray sparseArray) {
        if (this.migratingContacts) {
            return;
        }
        this.migratingContacts = true;
        HashMap<String, Contact> map = new HashMap<>();
        HashMap<String, Contact> contactsFromPhoneBook = readContactsFromPhoneBook();
        HashMap map2 = new HashMap();
        Iterator<Map.Entry<String, Contact>> it = contactsFromPhoneBook.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Contact value = it.next().getValue();
            for (int i = 0; i < value.shortPhones.size(); i++) {
                map2.put(value.shortPhones.get(i), value.key);
            }
        }
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            Contact contact = (Contact) sparseArray.valueAt(i2);
            int i3 = 0;
            while (true) {
                if (i3 >= contact.shortPhones.size()) {
                    break;
                }
                String str = (String) map2.get(contact.shortPhones.get(i3));
                if (str != null) {
                    contact.key = str;
                    map.put(str, contact);
                    break;
                }
                i3++;
            }
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("migrated contacts " + map.size() + " of " + sparseArray.size());
        }
        getMessagesStorage().putCachedPhoneBook(map, true, false);
    }

    protected void performSyncPhoneBook(final HashMap<String, Contact> map, final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final boolean z6) {
        if (!z2 && !this.contactsBookLoaded) {
            return;
        }
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$performSyncPhoneBook$25(map, z3, z, z2, z4, z5, z6);
            }
        });
    }

    public void lambda$performSyncPhoneBook$25(final java.util.HashMap r27, final boolean r28, boolean r29, final boolean r30, boolean r31, boolean r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ContactsController.lambda$performSyncPhoneBook$25(java.util.HashMap, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    private void lambda$performSyncPhoneBook$13(HashMap map) {
        ArrayList<TLRPC.User> arrayList = new ArrayList<>();
        if (map != null && !map.isEmpty()) {
            try {
                HashMap map2 = new HashMap();
                for (int i = 0; i < this.contacts.size(); i++) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.contacts.get(i).user_id));
                    if (user != null && !TextUtils.isEmpty(user.phone)) {
                        map2.put(user.phone, user);
                    }
                }
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Contact contact = (Contact) ((Map.Entry) it.next()).getValue();
                    int i2 = 0;
                    boolean z = false;
                    while (i2 < contact.shortPhones.size()) {
                        TLRPC.User user2 = (TLRPC.User) map2.get(contact.shortPhones.get(i2));
                        if (user2 != null) {
                            arrayList.add(user2);
                            contact.shortPhones.remove(i2);
                            i2--;
                            z = true;
                        }
                        i2++;
                    }
                    if (z) {
                        contact.shortPhones.size();
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        deleteContact(arrayList, false);
    }

    public void lambda$performSyncPhoneBook$14(int i, HashMap map, boolean z, boolean z2) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.hasNewContactsToImport, Integer.valueOf(i), map, Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    public void lambda$performSyncPhoneBook$16(HashMap map, HashMap map2, boolean z, final HashMap map3, final ArrayList arrayList, final HashMap map4) {
        this.contactsBookSPhones = map;
        this.contactsBook = map2;
        this.contactsSyncInProgress = false;
        this.contactsBookLoaded = true;
        if (z) {
            this.contactsLoaded = true;
        }
        if (!this.delayedContactsUpdate.isEmpty() && this.contactsLoaded) {
            applyContactsUpdates(this.delayedContactsUpdate, null, null, null);
            this.delayedContactsUpdate.clear();
        }
        getMessagesStorage().putCachedPhoneBook(map2, false, false);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$performSyncPhoneBook$15(map3, arrayList, map4);
            }
        });
    }

    public void lambda$performSyncPhoneBook$15(HashMap map, ArrayList arrayList, HashMap map2) {
        lambda$performSyncPhoneBook$23(map, arrayList, map2);
        updateUnregisteredContacts();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsDidLoad, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsImported, new Object[0]);
    }

    public void lambda$performSyncPhoneBook$20(HashMap map, SparseArray sparseArray, final boolean[] zArr, final HashMap map2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i, final HashMap map3, final boolean z, final HashMap map4, final ArrayList arrayList, final HashMap map5, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.completedRequestsCount++;
        if (tL_error == null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("contacts imported");
            }
            TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts = (TLRPC.TL_contacts_importedContacts) tLObject;
            if (!tL_contacts_importedContacts.retry_contacts.isEmpty()) {
                for (int i2 = 0; i2 < tL_contacts_importedContacts.retry_contacts.size(); i2++) {
                    map.remove(sparseArray.get((int) tL_contacts_importedContacts.retry_contacts.get(i2).longValue()));
                }
                zArr[0] = true;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("result has retry contacts");
                }
            }
            for (int i3 = 0; i3 < tL_contacts_importedContacts.popular_invites.size(); i3++) {
                TLRPC.TL_popularContact tL_popularContact = tL_contacts_importedContacts.popular_invites.get(i3);
                Contact contact = (Contact) map2.get(sparseArray.get((int) tL_popularContact.client_id));
                if (contact != null) {
                    contact.imported = tL_popularContact.importers;
                }
            }
            getMessagesStorage().putUsersAndChats(tL_contacts_importedContacts.users, null, true, true);
            ArrayList<TLRPC.TL_contact> arrayList2 = new ArrayList<>();
            for (int i4 = 0; i4 < tL_contacts_importedContacts.imported.size(); i4++) {
                TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                tL_contact.user_id = tL_contacts_importedContacts.imported.get(i4).user_id;
                arrayList2.add(tL_contact);
            }
            processLoadedContacts(arrayList2, tL_contacts_importedContacts.users, 2);
        } else {
            for (int i5 = 0; i5 < tL_contacts_importContacts.contacts.size(); i5++) {
                map.remove(sparseArray.get((int) tL_contacts_importContacts.contacts.get(i5).client_id));
            }
            zArr[0] = true;
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("import contacts error " + tL_error.text);
            }
        }
        if (this.completedRequestsCount == i) {
            if (!map.isEmpty()) {
                getMessagesStorage().putCachedPhoneBook(map, false, false);
            }
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$performSyncPhoneBook$19(map3, map2, z, map4, arrayList, map5, zArr);
                }
            });
        }
    }

    public void lambda$performSyncPhoneBook$19(HashMap map, HashMap map2, boolean z, final HashMap map3, final ArrayList arrayList, final HashMap map4, boolean[] zArr) {
        this.contactsBookSPhones = map;
        this.contactsBook = map2;
        this.contactsSyncInProgress = false;
        this.contactsBookLoaded = true;
        if (z) {
            this.contactsLoaded = true;
        }
        if (!this.delayedContactsUpdate.isEmpty() && this.contactsLoaded) {
            applyContactsUpdates(this.delayedContactsUpdate, null, null, null);
            this.delayedContactsUpdate.clear();
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$performSyncPhoneBook$17(map3, arrayList, map4);
            }
        });
        if (zArr[0]) {
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$performSyncPhoneBook$18();
                }
            }, 300000L);
        }
    }

    public void lambda$performSyncPhoneBook$17(HashMap map, ArrayList arrayList, HashMap map2) {
        lambda$performSyncPhoneBook$23(map, arrayList, map2);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsImported, new Object[0]);
    }

    public void lambda$performSyncPhoneBook$18() {
        getMessagesStorage().getCachedPhoneBook(true);
    }

    public void lambda$performSyncPhoneBook$22(HashMap map, HashMap map2, boolean z, final HashMap map3, final ArrayList arrayList, final HashMap map4) {
        this.contactsBookSPhones = map;
        this.contactsBook = map2;
        this.contactsSyncInProgress = false;
        this.contactsBookLoaded = true;
        if (z) {
            this.contactsLoaded = true;
        }
        if (!this.delayedContactsUpdate.isEmpty() && this.contactsLoaded) {
            applyContactsUpdates(this.delayedContactsUpdate, null, null, null);
            this.delayedContactsUpdate.clear();
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$performSyncPhoneBook$21(map3, arrayList, map4);
            }
        });
    }

    public void lambda$performSyncPhoneBook$21(HashMap map, ArrayList arrayList, HashMap map2) {
        lambda$performSyncPhoneBook$23(map, arrayList, map2);
        updateUnregisteredContacts();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsDidLoad, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsImported, new Object[0]);
    }

    public void lambda$performSyncPhoneBook$24(HashMap map, HashMap map2, boolean z, final HashMap map3, final ArrayList arrayList, final HashMap map4) {
        this.contactsBookSPhones = map;
        this.contactsBook = map2;
        this.contactsSyncInProgress = false;
        this.contactsBookLoaded = true;
        if (z) {
            this.contactsLoaded = true;
        }
        if (!this.delayedContactsUpdate.isEmpty() && this.contactsLoaded) {
            applyContactsUpdates(this.delayedContactsUpdate, null, null, null);
            this.delayedContactsUpdate.clear();
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$performSyncPhoneBook$23(map3, arrayList, map4);
            }
        });
    }

    public boolean isLoadingContacts() {
        boolean z;
        synchronized (this.loadContactsSync) {
            z = this.loadingContacts;
        }
        return z;
    }

    private long getContactsHash(ArrayList<TLRPC.TL_contact> arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        Collections.sort(arrayList2, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return ContactsController.lambda$getContactsHash$26((TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
            }
        });
        int size = arrayList2.size();
        long jCalcHash = 0;
        for (int i = -1; i < size; i++) {
            if (i == -1) {
                jCalcHash = MediaDataController.calcHash(jCalcHash, getUserConfig().contactsSavedCount);
            } else {
                jCalcHash = MediaDataController.calcHash(jCalcHash, ((TLRPC.TL_contact) arrayList2.get(i)).user_id);
            }
        }
        return jCalcHash;
    }

    public static int lambda$getContactsHash$26(TLRPC.TL_contact tL_contact, TLRPC.TL_contact tL_contact2) {
        long j = tL_contact.user_id;
        long j2 = tL_contact2.user_id;
        if (j > j2) {
            return 1;
        }
        return j < j2 ? -1 : 0;
    }

    public void loadContacts(boolean z, final long j) {
        synchronized (this.loadContactsSync) {
            this.loadingContacts = true;
        }
        if (z) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("load contacts from cache");
            }
            getMessagesStorage().getContacts();
        } else {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("load contacts from server");
            }
            TLRPC.TL_contacts_getContacts tL_contacts_getContacts = new TLRPC.TL_contacts_getContacts();
            tL_contacts_getContacts.hash = j;
            getConnectionsManager().sendRequest(tL_contacts_getContacts, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$loadContacts$28(j, tLObject, tL_error);
                }
            });
        }
    }

    public void lambda$loadContacts$28(long j, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.contacts_Contacts contacts_contacts = (TLRPC.contacts_Contacts) tLObject;
            if (j != 0 && (contacts_contacts instanceof TLRPC.TL_contacts_contactsNotModified)) {
                this.contactsLoaded = true;
                if (!this.delayedContactsUpdate.isEmpty() && this.contactsBookLoaded) {
                    applyContactsUpdates(this.delayedContactsUpdate, null, null, null);
                    this.delayedContactsUpdate.clear();
                }
                getUserConfig().lastContactsSyncTime = (int) (System.currentTimeMillis() / 1000);
                getUserConfig().saveConfig(false);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$loadContacts$27();
                    }
                });
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("load contacts don't change");
                    return;
                }
                return;
            }
            getUserConfig().contactsSavedCount = contacts_contacts.saved_count;
            getUserConfig().saveConfig(false);
            processLoadedContacts(contacts_contacts.contacts, contacts_contacts.users, 0);
        }
    }

    public void lambda$loadContacts$27() {
        synchronized (this.loadContactsSync) {
            this.loadingContacts = false;
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsDidLoad, new Object[0]);
    }

    public void processLoadedContacts(final ArrayList<TLRPC.TL_contact> arrayList, final ArrayList<TLRPC.User> arrayList2, final int i) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$processLoadedContacts$37(arrayList2, i, arrayList);
            }
        });
    }

    public void lambda$processLoadedContacts$37(final ArrayList arrayList, final int i, final ArrayList arrayList2) {
        getMessagesController().putUsers(arrayList, i == 1);
        final LongSparseArray longSparseArray = new LongSparseArray();
        final boolean zIsEmpty = arrayList2.isEmpty();
        if (i == 2 && !this.contacts.isEmpty()) {
            int i2 = 0;
            while (i2 < arrayList2.size()) {
                if (this.contactsDict.get(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i2)).user_id)) != null) {
                    arrayList2.remove(i2);
                    i2--;
                }
                i2++;
            }
            arrayList2.addAll(this.contacts);
        }
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i3)).user_id));
            if (user != null) {
                longSparseArray.put(user.id, user);
            }
        }
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$processLoadedContacts$36(i, arrayList2, arrayList, longSparseArray, zIsEmpty);
            }
        });
    }

    public void lambda$processLoadedContacts$36(final int i, final ArrayList arrayList, ArrayList arrayList2, LongSparseArray longSparseArray, final boolean z) {
        HashMap map;
        final HashMap map2;
        int i2;
        int i3;
        HashMap map3;
        String upperCase;
        ArrayList arrayList3;
        ArrayList arrayList4 = arrayList;
        final LongSparseArray longSparseArray2 = longSparseArray;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("done loading contacts");
        }
        if (i == 1 && (arrayList.isEmpty() || Math.abs((System.currentTimeMillis() / 1000) - getUserConfig().lastContactsSyncTime) >= 86400)) {
            loadContacts(false, getContactsHash(arrayList4));
            if (arrayList.isEmpty()) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$processLoadedContacts$29();
                    }
                });
                return;
            }
        }
        if (i == 0) {
            getUserConfig().lastContactsSyncTime = (int) (System.currentTimeMillis() / 1000);
            getUserConfig().saveConfig(false);
        }
        int i4 = 0;
        final boolean z2 = false;
        while (i4 < arrayList.size()) {
            TLRPC.TL_contact tL_contact = arrayList4.get(i4);
            if (MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_contact.user_id)) == null && tL_contact.user_id != getUserConfig().getClientUserId()) {
                arrayList4.remove(i4);
                i4--;
                z2 = true;
            }
            i4++;
        }
        if (i != 1) {
            getMessagesStorage().putUsersAndChats(arrayList2, null, true, true);
            getMessagesStorage().putContacts(arrayList4, i != 2);
        }
        final Collator localeCollator = getLocaleCollator();
        Collections.sort(arrayList4, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return ContactsController.lambda$processLoadedContacts$30(longSparseArray2, localeCollator, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
            }
        });
        final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(20, 1.0f, 2);
        final HashMap map4 = new HashMap();
        final HashMap map5 = new HashMap();
        final ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        if (this.contactsBookLoaded) {
            map = null;
            map2 = null;
        } else {
            map2 = new HashMap();
            map = new HashMap();
        }
        int i5 = 0;
        while (i5 < arrayList.size()) {
            TLRPC.TL_contact tL_contact2 = arrayList4.get(i5);
            TLRPC.User user = (TLRPC.User) longSparseArray2.get(tL_contact2.user_id);
            if (user == null) {
                map3 = map;
                i2 = i5;
                arrayList3 = arrayList6;
            } else {
                i2 = i5;
                ArrayList arrayList7 = arrayList6;
                concurrentHashMap.put(Long.valueOf(tL_contact2.user_id), tL_contact2);
                if (map2 == null || TextUtils.isEmpty(user.phone)) {
                    i3 = 0;
                } else {
                    map2.put(user.phone, tL_contact2);
                    i3 = 0;
                    map.put(user.phone.substring(Math.max(0, r13.length() - 7)), tL_contact2);
                }
                String firstName = UserObject.getFirstName(user);
                map3 = map;
                if (firstName.length() > 1) {
                    firstName = firstName.substring(i3, 1);
                }
                if (firstName.length() == 0) {
                    upperCase = "#";
                } else {
                    upperCase = firstName.toUpperCase();
                }
                String str = this.sectionsToReplace.get(upperCase);
                if (str != null) {
                    upperCase = str;
                }
                ArrayList arrayList8 = (ArrayList) map4.get(upperCase);
                if (arrayList8 == null) {
                    arrayList8 = new ArrayList();
                    map4.put(upperCase, arrayList8);
                    arrayList5.add(upperCase);
                }
                arrayList8.add(tL_contact2);
                if (user.mutual_contact) {
                    ArrayList arrayList9 = (ArrayList) map5.get(upperCase);
                    if (arrayList9 == null) {
                        arrayList9 = new ArrayList();
                        map5.put(upperCase, arrayList9);
                        arrayList3 = arrayList7;
                        arrayList3.add(upperCase);
                    } else {
                        arrayList3 = arrayList7;
                    }
                    arrayList9.add(tL_contact2);
                } else {
                    arrayList3 = arrayList7;
                }
            }
            int i6 = i2 + 1;
            arrayList4 = arrayList;
            longSparseArray2 = longSparseArray;
            arrayList6 = arrayList3;
            map = map3;
            i5 = i6;
        }
        final HashMap map6 = map;
        final ArrayList arrayList10 = arrayList6;
        Collections.sort(arrayList5, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return ContactsController.lambda$processLoadedContacts$31(localeCollator, (String) obj, (String) obj2);
            }
        });
        Collections.sort(arrayList10, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return ContactsController.lambda$processLoadedContacts$32(localeCollator, (String) obj, (String) obj2);
            }
        });
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$processLoadedContacts$33(arrayList, concurrentHashMap, map4, map5, arrayList5, arrayList10, i, z, z2);
            }
        });
        if (!this.delayedContactsUpdate.isEmpty() && this.contactsLoaded && this.contactsBookLoaded) {
            applyContactsUpdates(this.delayedContactsUpdate, null, null, null);
            this.delayedContactsUpdate.clear();
        }
        if (map2 != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$processLoadedContacts$35(map2, map6);
                }
            });
        } else {
            this.contactsLoaded = true;
        }
    }

    public void lambda$processLoadedContacts$29() {
        this.doneLoadingContacts = true;
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsDidLoad, new Object[0]);
    }

    public static int lambda$processLoadedContacts$30(LongSparseArray longSparseArray, Collator collator, TLRPC.TL_contact tL_contact, TLRPC.TL_contact tL_contact2) {
        return collator.compare(UserObject.getFirstName((TLRPC.User) longSparseArray.get(tL_contact.user_id)), UserObject.getFirstName((TLRPC.User) longSparseArray.get(tL_contact2.user_id)));
    }

    public static int lambda$processLoadedContacts$31(Collator collator, String str, String str2) {
        char cCharAt = str.charAt(0);
        char cCharAt2 = str2.charAt(0);
        if (cCharAt == '#') {
            return 1;
        }
        if (cCharAt2 == '#') {
            return -1;
        }
        return collator.compare(str, str2);
    }

    public static int lambda$processLoadedContacts$32(Collator collator, String str, String str2) {
        char cCharAt = str.charAt(0);
        char cCharAt2 = str2.charAt(0);
        if (cCharAt == '#') {
            return 1;
        }
        if (cCharAt2 == '#') {
            return -1;
        }
        return collator.compare(str, str2);
    }

    public void lambda$processLoadedContacts$33(ArrayList arrayList, ConcurrentHashMap concurrentHashMap, HashMap map, HashMap map2, ArrayList arrayList2, ArrayList arrayList3, int i, boolean z, boolean z2) {
        this.contacts = arrayList;
        this.contactsDict = concurrentHashMap;
        this.usersSectionsDict = map;
        this.usersMutualSectionsDict = map2;
        this.sortedUsersSectionsArray = arrayList2;
        this.sortedUsersMutualSectionsArray = arrayList3;
        this.doneLoadingContacts = true;
        if (i != 2) {
            synchronized (this.loadContactsSync) {
                this.loadingContacts = false;
            }
        }
        performWriteContactsToPhoneBook();
        updateUnregisteredContacts();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsDidLoad, new Object[0]);
        if (i != 1 && !z) {
            saveContactsLoadTime();
        } else {
            reloadContactsStatusesMaybe(false);
        }
        if (z2) {
            loadContacts(false, 0L);
        }
    }

    public void lambda$processLoadedContacts$35(final HashMap map, final HashMap map2) {
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$processLoadedContacts$34(map, map2);
            }
        });
        if (this.contactsSyncInProgress) {
            return;
        }
        this.contactsSyncInProgress = true;
        getMessagesStorage().getCachedPhoneBook(false);
    }

    public void lambda$processLoadedContacts$34(HashMap map, HashMap map2) {
        this.contactsByPhone = map;
        this.contactsByShortPhone = map2;
    }

    public boolean isContact(long j) {
        return this.contactsDict.get(Long.valueOf(j)) != null;
    }

    public void reloadContactsStatusesMaybe(boolean z) {
        try {
            if (MessagesController.getMainSettings(this.currentAccount).getLong("lastReloadStatusTime", 0L) < System.currentTimeMillis() - 10800000 || z) {
                reloadContactsStatuses();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private void saveContactsLoadTime() {
        try {
            MessagesController.getMainSettings(this.currentAccount).edit().putLong("lastReloadStatusTime", System.currentTimeMillis()).commit();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$performSyncPhoneBook$23(HashMap<String, ArrayList<Object>> map, ArrayList<String> arrayList, HashMap<String, Contact> map2) {
        mergePhonebookAndTelegramContacts(map, arrayList, map2, true);
    }

    private void mergePhonebookAndTelegramContacts(final HashMap<String, ArrayList<Object>> map, final ArrayList<String> arrayList, final HashMap<String, Contact> map2, final boolean z) {
        final ArrayList arrayList2 = new ArrayList(this.contacts);
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$mergePhonebookAndTelegramContacts$41(z, arrayList2, map2, map, arrayList);
            }
        });
    }

    public void lambda$mergePhonebookAndTelegramContacts$41(boolean z, ArrayList arrayList, final HashMap map, final HashMap map2, final ArrayList arrayList2) {
        if (z) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(((TLRPC.TL_contact) arrayList.get(i)).user_id));
                if (user != null && !TextUtils.isEmpty(user.phone)) {
                    Contact contact = (Contact) map.get(user.phone.substring(Math.max(0, r3.length() - 7)));
                    if (contact != null) {
                        if (contact.user == null) {
                            contact.user = user;
                        }
                    } else {
                        String letter = Contact.getLetter(user.first_name, user.last_name);
                        ArrayList arrayList3 = (ArrayList) map2.get(letter);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            map2.put(letter, arrayList3);
                            arrayList2.add(letter);
                        }
                        arrayList3.add(user);
                    }
                }
            }
        }
        final Collator localeCollator = getLocaleCollator();
        Iterator it = map2.values().iterator();
        while (it.hasNext()) {
            Collections.sort((ArrayList) it.next(), new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    return ContactsController.lambda$mergePhonebookAndTelegramContacts$38(localeCollator, obj, obj2);
                }
            });
        }
        Collections.sort(arrayList2, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return ContactsController.lambda$mergePhonebookAndTelegramContacts$39(localeCollator, (String) obj, (String) obj2);
            }
        });
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$mergePhonebookAndTelegramContacts$40(arrayList2, map, map2);
            }
        });
    }

    public static int lambda$mergePhonebookAndTelegramContacts$38(Collator collator, Object obj, Object obj2) {
        String name;
        String name2 = "";
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            name = formatName(user.first_name, user.last_name);
        } else if (obj instanceof Contact) {
            Contact contact = (Contact) obj;
            TLRPC.User user2 = contact.user;
            if (user2 != null) {
                name = formatName(user2.first_name, user2.last_name);
            } else {
                name = formatName(contact.first_name, contact.last_name);
            }
        } else {
            name = "";
        }
        if (obj2 instanceof TLRPC.User) {
            TLRPC.User user3 = (TLRPC.User) obj2;
            name2 = formatName(user3.first_name, user3.last_name);
        } else if (obj2 instanceof Contact) {
            Contact contact2 = (Contact) obj2;
            TLRPC.User user4 = contact2.user;
            if (user4 != null) {
                name2 = formatName(user4.first_name, user4.last_name);
            } else {
                name2 = formatName(contact2.first_name, contact2.last_name);
            }
        }
        return collator.compare(name, name2);
    }

    public static int lambda$mergePhonebookAndTelegramContacts$39(Collator collator, String str, String str2) {
        char cCharAt = str.charAt(0);
        char cCharAt2 = str2.charAt(0);
        if (cCharAt == '#') {
            return 1;
        }
        if (cCharAt2 == '#') {
            return -1;
        }
        return collator.compare(str, str2);
    }

    public void lambda$mergePhonebookAndTelegramContacts$40(ArrayList arrayList, HashMap map, HashMap map2) {
        this.phoneBookSectionsArray = arrayList;
        this.phoneBookByShortPhones = map;
        this.phoneBookSectionsDict = map2;
    }

    private void updateUnregisteredContacts() {
        HashMap map = new HashMap();
        int size = this.contacts.size();
        for (int i = 0; i < size; i++) {
            TLRPC.TL_contact tL_contact = this.contacts.get(i);
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(tL_contact.user_id));
            if (user != null && !TextUtils.isEmpty(user.phone)) {
                map.put(user.phone, tL_contact);
            }
        }
        ArrayList<Contact> arrayList = new ArrayList<>();
        Iterator<Map.Entry<String, Contact>> it = this.contactsBook.entrySet().iterator();
        while (it.hasNext()) {
            Contact value = it.next().getValue();
            int i2 = 0;
            while (true) {
                if (i2 < value.phones.size()) {
                    if (map.containsKey(value.shortPhones.get(i2)) || value.phoneDeleted.get(i2).intValue() == 1) {
                        break;
                    } else {
                        i2++;
                    }
                } else {
                    arrayList.add(value);
                    break;
                }
            }
        }
        final Collator localeCollator = getLocaleCollator();
        Collections.sort(arrayList, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return ContactsController.lambda$updateUnregisteredContacts$42(localeCollator, (ContactsController.Contact) obj, (ContactsController.Contact) obj2);
            }
        });
        this.phoneBookContacts = arrayList;
    }

    public static int lambda$updateUnregisteredContacts$42(Collator collator, Contact contact, Contact contact2) {
        String str = contact.first_name;
        if (str.length() == 0) {
            str = contact.last_name;
        }
        String str2 = contact2.first_name;
        if (str2.length() == 0) {
            str2 = contact2.last_name;
        }
        return collator.compare(str, str2);
    }

    private void buildContactsSectionsArrays(boolean z) {
        String upperCase;
        final Collator localeCollator = getLocaleCollator();
        if (z) {
            Collections.sort(this.contacts, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    return this.f$0.lambda$buildContactsSectionsArrays$43(localeCollator, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                }
            });
        }
        HashMap<String, ArrayList<TLRPC.TL_contact>> map = new HashMap<>();
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < this.contacts.size(); i++) {
            TLRPC.TL_contact tL_contact = this.contacts.get(i);
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(tL_contact.user_id));
            if (user != null) {
                String firstName = UserObject.getFirstName(user);
                if (firstName.length() > 1) {
                    firstName = firstName.substring(0, 1);
                }
                if (firstName.length() == 0) {
                    upperCase = "#";
                } else {
                    upperCase = firstName.toUpperCase();
                }
                String str = this.sectionsToReplace.get(upperCase);
                if (str != null) {
                    upperCase = str;
                }
                ArrayList<TLRPC.TL_contact> arrayList2 = map.get(upperCase);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                    map.put(upperCase, arrayList2);
                    arrayList.add(upperCase);
                }
                arrayList2.add(tL_contact);
            }
        }
        Collections.sort(arrayList, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return ContactsController.lambda$buildContactsSectionsArrays$44(localeCollator, (String) obj, (String) obj2);
            }
        });
        this.usersSectionsDict = map;
        this.sortedUsersSectionsArray = arrayList;
    }

    public int lambda$buildContactsSectionsArrays$43(Collator collator, TLRPC.TL_contact tL_contact, TLRPC.TL_contact tL_contact2) {
        return collator.compare(UserObject.getFirstName(getMessagesController().getUser(Long.valueOf(tL_contact.user_id))), UserObject.getFirstName(getMessagesController().getUser(Long.valueOf(tL_contact2.user_id))));
    }

    public static int lambda$buildContactsSectionsArrays$44(Collator collator, String str, String str2) {
        char cCharAt = str.charAt(0);
        char cCharAt2 = str2.charAt(0);
        if (cCharAt == '#') {
            return 1;
        }
        if (cCharAt2 == '#') {
            return -1;
        }
        return collator.compare(str, str2);
    }

    private boolean hasContactsPermission() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ContactsController.hasContactsPermission():boolean");
    }

    private boolean hasContactsWritePermission() {
        return Build.VERSION.SDK_INT < 23 || ApplicationLoader.applicationContext.checkSelfPermission("android.permission.WRITE_CONTACTS") == 0;
    }

    public void lambda$performWriteContactsToPhoneBook$45(java.util.ArrayList<org.telegram.tgnet.TLRPC.TL_contact> r17) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ContactsController.lambda$performWriteContactsToPhoneBook$45(java.util.ArrayList):void");
    }

    private void performWriteContactsToPhoneBook() {
        final ArrayList arrayList = new ArrayList(this.contacts);
        Utilities.phoneBookQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.lambda$performWriteContactsToPhoneBook$45(arrayList);
            }
        });
    }

    private void applyContactsUpdates(ArrayList<Long> arrayList, ConcurrentHashMap<Long, TLRPC.User> concurrentHashMap, final ArrayList<TLRPC.TL_contact> arrayList2, final ArrayList<Long> arrayList3) {
        int iIndexOf;
        int iIndexOf2;
        if (arrayList2 == null || arrayList3 == null) {
            arrayList2 = new ArrayList<>();
            arrayList3 = new ArrayList<>();
            for (int i = 0; i < arrayList.size(); i++) {
                Long l = arrayList.get(i);
                if (l.longValue() > 0) {
                    TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                    tL_contact.user_id = l.longValue();
                    arrayList2.add(tL_contact);
                } else if (l.longValue() < 0) {
                    arrayList3.add(Long.valueOf(-l.longValue()));
                }
            }
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("process update - contacts add = " + arrayList2.size() + " delete = " + arrayList3.size());
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int i2 = 0;
        boolean z = false;
        while (true) {
            if (i2 >= arrayList2.size()) {
                break;
            }
            TLRPC.TL_contact tL_contact2 = arrayList2.get(i2);
            TLRPC.User user = concurrentHashMap != null ? concurrentHashMap.get(Long.valueOf(tL_contact2.user_id)) : null;
            if (user == null) {
                user = getMessagesController().getUser(Long.valueOf(tL_contact2.user_id));
            } else {
                getMessagesController().putUser(user, true);
            }
            if (user == null || TextUtils.isEmpty(user.phone)) {
                z = true;
            } else {
                Contact contact = this.contactsBookSPhones.get(user.phone);
                if (contact != null && (iIndexOf2 = contact.shortPhones.indexOf(user.phone)) != -1) {
                    contact.phoneDeleted.set(iIndexOf2, 0);
                }
                if (sb.length() != 0) {
                    sb.append(",");
                }
                sb.append(user.phone);
            }
            i2++;
        }
        for (int i3 = 0; i3 < arrayList3.size(); i3++) {
            final Long l2 = arrayList3.get(i3);
            Utilities.phoneBookQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$applyContactsUpdates$46(l2);
                }
            });
            TLRPC.User user2 = concurrentHashMap != null ? concurrentHashMap.get(l2) : null;
            if (user2 == null) {
                user2 = getMessagesController().getUser(l2);
            } else {
                getMessagesController().putUser(user2, true);
            }
            if (user2 == null) {
                z = true;
            } else if (!TextUtils.isEmpty(user2.phone)) {
                Contact contact2 = this.contactsBookSPhones.get(user2.phone);
                if (contact2 != null && (iIndexOf = contact2.shortPhones.indexOf(user2.phone)) != -1) {
                    contact2.phoneDeleted.set(iIndexOf, 1);
                }
                if (sb2.length() != 0) {
                    sb2.append(",");
                }
                sb2.append(user2.phone);
            }
        }
        if (sb.length() != 0 || sb2.length() != 0) {
            getMessagesStorage().applyPhoneBookUpdates(sb.toString(), sb2.toString());
        }
        if (z) {
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$applyContactsUpdates$47();
                }
            });
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$applyContactsUpdates$48(arrayList2, arrayList3);
                }
            });
        }
    }

    public void lambda$applyContactsUpdates$46(Long l) {
        deleteContactFromPhoneBook(l.longValue());
    }

    public void lambda$applyContactsUpdates$47() {
        loadContacts(false, 0L);
    }

    public void lambda$applyContactsUpdates$48(ArrayList arrayList, ArrayList arrayList2) {
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList.get(i);
            if (this.contactsDict.get(Long.valueOf(tL_contact.user_id)) == null) {
                this.contacts.add(tL_contact);
                this.contactsDict.put(Long.valueOf(tL_contact.user_id), tL_contact);
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            Long l = (Long) arrayList2.get(i2);
            TLRPC.TL_contact tL_contact2 = this.contactsDict.get(l);
            if (tL_contact2 != null) {
                this.contacts.remove(tL_contact2);
                this.contactsDict.remove(l);
            }
        }
        if (!arrayList.isEmpty()) {
            updateUnregisteredContacts();
            performWriteContactsToPhoneBook();
        }
        performSyncPhoneBook(getContactsCopy(this.contactsBook), false, false, false, false, true, false);
        buildContactsSectionsArrays(!arrayList.isEmpty());
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsDidLoad, new Object[0]);
    }

    public void processContactsUpdates(ArrayList<Long> arrayList, ConcurrentHashMap<Long, TLRPC.User> concurrentHashMap) {
        int iIndexOf;
        int iIndexOf2;
        ArrayList<TLRPC.TL_contact> arrayList2 = new ArrayList<>();
        ArrayList<Long> arrayList3 = new ArrayList<>();
        Iterator<Long> it = arrayList.iterator();
        while (it.hasNext()) {
            Long next = it.next();
            if (next.longValue() > 0) {
                TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                tL_contact.user_id = next.longValue();
                arrayList2.add(tL_contact);
                if (!this.delayedContactsUpdate.isEmpty() && (iIndexOf = this.delayedContactsUpdate.indexOf(Long.valueOf(-next.longValue()))) != -1) {
                    this.delayedContactsUpdate.remove(iIndexOf);
                }
            } else if (next.longValue() < 0) {
                arrayList3.add(Long.valueOf(-next.longValue()));
                if (!this.delayedContactsUpdate.isEmpty() && (iIndexOf2 = this.delayedContactsUpdate.indexOf(Long.valueOf(-next.longValue()))) != -1) {
                    this.delayedContactsUpdate.remove(iIndexOf2);
                }
            }
        }
        if (!arrayList3.isEmpty()) {
            getMessagesStorage().deleteContacts(arrayList3);
        }
        if (!arrayList2.isEmpty()) {
            getMessagesStorage().putContacts(arrayList2, false);
        }
        if (!this.contactsLoaded || !this.contactsBookLoaded) {
            this.delayedContactsUpdate.addAll(arrayList);
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("delay update - contacts add = " + arrayList2.size() + " delete = " + arrayList3.size());
                return;
            }
            return;
        }
        applyContactsUpdates(arrayList, concurrentHashMap, arrayList2, arrayList3);
    }

    public long addContactToPhoneBook(TLRPC.User user, boolean z) {
        Uri uri;
        long j = -1;
        if (this.systemAccount == null || user == null || !hasContactsWritePermission()) {
            return -1L;
        }
        synchronized (this.observerLock) {
            this.ignoreChanges = true;
        }
        ContentResolver contentResolver = ApplicationLoader.applicationContext.getContentResolver();
        if (z) {
            try {
                contentResolver.delete(ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", this.systemAccount.name).appendQueryParameter("account_type", this.systemAccount.type).build(), "sync2 = " + user.id, null);
            } catch (Exception unused) {
            }
        }
        ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
        applyContactToPhoneBook(arrayList, user);
        try {
            ContentProviderResult[] contentProviderResultArrApplyBatch = contentResolver.applyBatch("com.android.contacts", arrayList);
            if (contentProviderResultArrApplyBatch != null && contentProviderResultArrApplyBatch.length > 0 && (uri = contentProviderResultArrApplyBatch[0].uri) != null) {
                j = Long.parseLong(uri.getLastPathSegment());
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        synchronized (this.observerLock) {
            this.ignoreChanges = false;
        }
        return j;
    }

    private void applyContactToPhoneBook(ArrayList<ContentProviderOperation> arrayList, TLRPC.User user) {
        String name;
        if (user == null) {
            return;
        }
        int size = arrayList.size();
        ContentProviderOperation.Builder builderNewInsert = ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI);
        builderNewInsert.withValue("account_name", this.systemAccount.name);
        builderNewInsert.withValue("account_type", this.systemAccount.type);
        builderNewInsert.withValue("sync1", TextUtils.isEmpty(user.phone) ? "" : user.phone);
        builderNewInsert.withValue("sync2", Long.valueOf(user.id));
        arrayList.add(builderNewInsert.build());
        Uri uri = ContactsContract.Data.CONTENT_URI;
        ContentProviderOperation.Builder builderNewInsert2 = ContentProviderOperation.newInsert(uri);
        builderNewInsert2.withValueBackReference("raw_contact_id", size);
        builderNewInsert2.withValue("mimetype", "vnd.android.cursor.item/name");
        builderNewInsert2.withValue("data2", user.first_name);
        builderNewInsert2.withValue("data3", user.last_name);
        arrayList.add(builderNewInsert2.build());
        if (TextUtils.isEmpty(user.phone)) {
            name = formatName(user.first_name, user.last_name);
        } else {
            name = "+" + user.phone;
        }
        ContentProviderOperation.Builder builderNewInsert3 = ContentProviderOperation.newInsert(uri);
        builderNewInsert3.withValueBackReference("raw_contact_id", size);
        builderNewInsert3.withValue("mimetype", "vnd.android.cursor.item/vnd.org.telegram.messenger.android.profile");
        builderNewInsert3.withValue("data1", Long.valueOf(user.id));
        builderNewInsert3.withValue("data2", "Telegram Profile");
        builderNewInsert3.withValue("data3", LocaleController.formatString("ContactShortcutMessage", R.string.ContactShortcutMessage, name));
        builderNewInsert3.withValue("data4", Long.valueOf(user.id));
        arrayList.add(builderNewInsert3.build());
        ContentProviderOperation.Builder builderNewInsert4 = ContentProviderOperation.newInsert(uri);
        builderNewInsert4.withValueBackReference("raw_contact_id", size);
        builderNewInsert4.withValue("mimetype", "vnd.android.cursor.item/vnd.org.telegram.messenger.android.call");
        builderNewInsert4.withValue("data1", Long.valueOf(user.id));
        builderNewInsert4.withValue("data2", "Telegram Voice Call");
        builderNewInsert4.withValue("data3", LocaleController.formatString("ContactShortcutVoiceCall", R.string.ContactShortcutVoiceCall, name));
        builderNewInsert4.withValue("data4", Long.valueOf(user.id));
        arrayList.add(builderNewInsert4.build());
        ContentProviderOperation.Builder builderNewInsert5 = ContentProviderOperation.newInsert(uri);
        builderNewInsert5.withValueBackReference("raw_contact_id", size);
        builderNewInsert5.withValue("mimetype", "vnd.android.cursor.item/vnd.org.telegram.messenger.android.call.video");
        builderNewInsert5.withValue("data1", Long.valueOf(user.id));
        builderNewInsert5.withValue("data2", "Telegram Video Call");
        builderNewInsert5.withValue("data3", LocaleController.formatString("ContactShortcutVideoCall", R.string.ContactShortcutVideoCall, name));
        builderNewInsert5.withValue("data4", Long.valueOf(user.id));
        arrayList.add(builderNewInsert5.build());
    }

    private void deleteContactFromPhoneBook(long j) {
        if (hasContactsPermission()) {
            synchronized (this.observerLock) {
                this.ignoreChanges = true;
            }
            try {
                ApplicationLoader.applicationContext.getContentResolver().delete(ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", this.systemAccount.name).appendQueryParameter("account_type", this.systemAccount.type).build(), "sync2 = " + j, null);
            } catch (Exception e) {
                FileLog.e((Throwable) e, false);
            }
            synchronized (this.observerLock) {
                this.ignoreChanges = false;
            }
        }
    }

    protected void markAsContacted(final String str) {
        if (str == null) {
            return;
        }
        Utilities.phoneBookQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                ContactsController.lambda$markAsContacted$49(str);
            }
        });
    }

    public static void lambda$markAsContacted$49(String str) {
        Uri uri = Uri.parse(str);
        ContentValues contentValues = new ContentValues();
        contentValues.put("last_time_contacted", Long.valueOf(System.currentTimeMillis()));
        ApplicationLoader.applicationContext.getContentResolver().update(uri, contentValues, null, null);
    }

    public void addContact(TLRPC.User user, boolean z) {
        addContact(user, null, z);
    }

    public void addContact(final TLRPC.User user, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z) {
        if (user == null) {
            return;
        }
        TLRPC.TL_contacts_addContact tL_contacts_addContact = new TLRPC.TL_contacts_addContact();
        tL_contacts_addContact.id = getMessagesController().getInputUser(user);
        tL_contacts_addContact.first_name = user.first_name;
        tL_contacts_addContact.last_name = user.last_name;
        String str = user.phone;
        tL_contacts_addContact.phone = str;
        tL_contacts_addContact.add_phone_privacy_exception = z;
        if (str == null) {
            tL_contacts_addContact.phone = "";
        } else if (str.length() > 0 && !tL_contacts_addContact.phone.startsWith("+")) {
            tL_contacts_addContact.phone = "+" + tL_contacts_addContact.phone;
        }
        if (tL_textWithEntities != null) {
            tL_contacts_addContact.flags |= 2;
            tL_contacts_addContact.note = tL_textWithEntities;
        }
        getConnectionsManager().sendRequest(tL_contacts_addContact, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$addContact$52(user, tLObject, tL_error);
            }
        }, 6);
    }

    public void lambda$addContact$52(final TLRPC.User user, TLObject tLObject, TLRPC.TL_error tL_error) {
        int iIndexOf;
        if (tL_error != null) {
            return;
        }
        final TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null && userProfilePhoto.personal) {
            for (int i = 0; i < updates.users.size(); i++) {
                if (updates.users.get(i).id == user.id) {
                    updates.users.get(i).photo = user.photo;
                }
            }
        }
        getMessagesController().processUpdates(updates, false);
        for (int i2 = 0; i2 < updates.users.size(); i2++) {
            final TLRPC.User user2 = updates.users.get(i2);
            if (user2.id == user.id) {
                Utilities.phoneBookQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$addContact$50(user2);
                    }
                });
                TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                tL_contact.user_id = user2.id;
                ArrayList<TLRPC.TL_contact> arrayList = new ArrayList<>();
                arrayList.add(tL_contact);
                getMessagesStorage().putContacts(arrayList, false);
                if (!TextUtils.isEmpty(user2.phone)) {
                    formatName(user2.first_name, user2.last_name);
                    getMessagesStorage().applyPhoneBookUpdates(user2.phone, "");
                    Contact contact = this.contactsBookSPhones.get(user2.phone);
                    if (contact != null && (iIndexOf = contact.shortPhones.indexOf(user2.phone)) != -1) {
                        contact.phoneDeleted.set(iIndexOf, 0);
                    }
                }
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$addContact$51(updates, user);
            }
        });
    }

    public void lambda$addContact$50(TLRPC.User user) {
        addContactToPhoneBook(user, true);
    }

    public void lambda$addContact$51(TLRPC.Updates updates, TLRPC.User user) {
        Contact contact;
        boolean z = false;
        for (int i = 0; i < updates.users.size(); i++) {
            TLRPC.User user2 = updates.users.get(i);
            if (user2.contact && (contact = this.contactsBookSPhones.get(user2.phone)) != null) {
                String letter = contact.getLetter();
                String letter2 = Contact.getLetter(user.first_name, user.last_name);
                if (contact.user == null) {
                    contact.user = user;
                    if (!letter.equals(letter2)) {
                        ArrayList<Object> arrayList = this.phoneBookSectionsDict.get(letter2);
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                            this.phoneBookSectionsDict.put(letter2, arrayList);
                            this.phoneBookSectionsArray.add(letter2);
                        }
                        arrayList.add(contact);
                        ArrayList<Object> arrayList2 = this.phoneBookSectionsDict.get(letter);
                        if (arrayList2 != null) {
                            Iterator<Object> it = arrayList2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                Object next = it.next();
                                if (next instanceof Contact) {
                                    Contact contact2 = (Contact) next;
                                    if (contact2.contact_id == contact.contact_id) {
                                        if (arrayList2.remove(contact2) && arrayList2.isEmpty()) {
                                            this.phoneBookSectionsDict.remove(letter);
                                            this.phoneBookSectionsArray.remove(letter);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z = true;
                }
            }
            if (user2.contact && this.contactsDict.get(Long.valueOf(user2.id)) == null) {
                TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                tL_contact.user_id = user2.id;
                this.contacts.add(tL_contact);
                this.contactsDict.put(Long.valueOf(tL_contact.user_id), tL_contact);
            }
        }
        buildContactsSectionsArrays(true);
        if (z) {
            mergePhonebookAndTelegramContacts(this.phoneBookSectionsDict, this.phoneBookSectionsArray, this.phoneBookByShortPhones, false);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsDidLoad, new Object[0]);
    }

    public void deleteContactsUndoable(Context context, BaseFragment baseFragment, final ArrayList<TLRPC.User> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        final HashMap map = new HashMap();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            TLRPC.User user = arrayList.get(i);
            TLRPC.TL_contact tL_contact = this.contactsDict.get(Long.valueOf(user.id));
            user.contact = false;
            this.contacts.remove(tL_contact);
            this.contactsDict.remove(Long.valueOf(user.id));
            map.put(user, tL_contact);
        }
        buildContactsSectionsArrays(false);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsDidLoad, new Object[0]);
        Bulletin.SimpleLayout simpleLayout = new Bulletin.SimpleLayout(context, baseFragment.getResourceProvider());
        simpleLayout.setTimer();
        simpleLayout.textView.setText(LocaleController.formatPluralString("ContactsDeletedUndo", map.size(), new Object[0]));
        Bulletin.UndoButton undoButton = new Bulletin.UndoButton(context, true, true, baseFragment.getResourceProvider());
        undoButton.setUndoAction(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$deleteContactsUndoable$53(map);
            }
        });
        undoButton.setDelayedAction(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$deleteContactsUndoable$54(arrayList);
            }
        });
        simpleLayout.setButton(undoButton);
        Bulletin.make(baseFragment, simpleLayout, 5000).show();
    }

    public void lambda$deleteContactsUndoable$53(HashMap map) {
        for (Map.Entry entry : map.entrySet()) {
            TLRPC.User user = (TLRPC.User) entry.getKey();
            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) entry.getValue();
            user.contact = true;
            this.contacts.add(tL_contact);
            this.contactsDict.put(Long.valueOf(user.id), tL_contact);
        }
        buildContactsSectionsArrays(true);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsDidLoad, new Object[0]);
    }

    public void lambda$deleteContactsUndoable$54(ArrayList arrayList) {
        deleteContact(arrayList, false);
    }

    public void deleteContact(final ArrayList<TLRPC.User> arrayList, final boolean z) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        TLRPC.TL_contacts_deleteContacts tL_contacts_deleteContacts = new TLRPC.TL_contacts_deleteContacts();
        final ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            TLRPC.User user = arrayList.get(i);
            getMessagesController().getStoriesController().removeContact(user.id);
            TLRPC.InputUser inputUser = getMessagesController().getInputUser(user);
            if (inputUser != null) {
                user.contact = false;
                arrayList2.add(Long.valueOf(user.id));
                tL_contacts_deleteContacts.id.add(inputUser);
            }
        }
        final String str = arrayList.get(0).first_name;
        getConnectionsManager().sendRequest(tL_contacts_deleteContacts, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$deleteContact$57(arrayList2, arrayList, z, str, tLObject, tL_error);
            }
        });
    }

    public void lambda$deleteContact$57(ArrayList arrayList, final ArrayList arrayList2, final boolean z, final String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        int iIndexOf;
        if (tL_error != null) {
            return;
        }
        getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
        getMessagesStorage().deleteContacts(arrayList);
        Utilities.phoneBookQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$deleteContact$55(arrayList2);
            }
        });
        for (int i = 0; i < arrayList2.size(); i++) {
            TLRPC.User user = (TLRPC.User) arrayList2.get(i);
            if (!TextUtils.isEmpty(user.phone)) {
                getMessagesStorage().applyPhoneBookUpdates(user.phone, "");
                Contact contact = this.contactsBookSPhones.get(user.phone);
                if (contact != null && (iIndexOf = contact.shortPhones.indexOf(user.phone)) != -1) {
                    contact.phoneDeleted.set(iIndexOf, 1);
                }
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$deleteContact$56(arrayList2, z, str);
            }
        });
    }

    public void lambda$deleteContact$55(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            deleteContactFromPhoneBook(((TLRPC.User) it.next()).id);
        }
    }

    public void lambda$deleteContact$56(ArrayList arrayList, boolean z, String str) {
        Iterator it = arrayList.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            TLRPC.User user = (TLRPC.User) it.next();
            TLRPC.TL_contact tL_contact = this.contactsDict.get(Long.valueOf(user.id));
            if (tL_contact != null) {
                this.contacts.remove(tL_contact);
                this.contactsDict.remove(Long.valueOf(user.id));
                z2 = true;
            }
        }
        if (z2) {
            buildContactsSectionsArrays(false);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsDidLoad, new Object[0]);
        if (z) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.formatString("DeletedFromYourContacts", R.string.DeletedFromYourContacts, str));
        }
    }

    private void reloadContactsStatuses() {
        saveContactsLoadTime();
        getMessagesController().clearFullUsers();
        final SharedPreferences.Editor editorEdit = MessagesController.getMainSettings(this.currentAccount).edit();
        editorEdit.putBoolean("needGetStatuses", true).commit();
        getConnectionsManager().sendRequest(new TLRPC.TL_contacts_getStatuses(), new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$reloadContactsStatuses$59(editorEdit, tLObject, tL_error);
            }
        });
    }

    public void lambda$reloadContactsStatuses$59(final SharedPreferences.Editor editor, final TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof Vector) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$reloadContactsStatuses$58(editor, tLObject);
                }
            });
        }
    }

    public void lambda$reloadContactsStatuses$58(SharedPreferences.Editor editor, TLObject tLObject) {
        editor.remove("needGetStatuses").commit();
        Vector vector = (Vector) tLObject;
        if (!vector.objects.isEmpty()) {
            ArrayList<TLRPC.User> arrayList = new ArrayList<>();
            Iterator it = vector.objects.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                TLRPC.TL_user tL_user = new TLRPC.TL_user();
                TLRPC.TL_contactStatus tL_contactStatus = (TLRPC.TL_contactStatus) next;
                if (tL_contactStatus != null) {
                    TLRPC.UserStatus userStatus = tL_contactStatus.status;
                    if (userStatus instanceof TLRPC.TL_userStatusRecently) {
                        userStatus.expires = userStatus.by_me ? -1000 : -100;
                    } else if (userStatus instanceof TLRPC.TL_userStatusLastWeek) {
                        userStatus.expires = userStatus.by_me ? -1001 : -101;
                    } else if (userStatus instanceof TLRPC.TL_userStatusLastMonth) {
                        userStatus.expires = userStatus.by_me ? -1002 : -102;
                    }
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(tL_contactStatus.user_id));
                    if (user != null) {
                        user.status = tL_contactStatus.status;
                    }
                    tL_user.status = tL_contactStatus.status;
                    arrayList.add(tL_user);
                }
            }
            getMessagesStorage().updateUsers(arrayList, true, true, true);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_STATUS));
    }

    public void loadGlobalPrivacySetting() {
        if (this.loadingGlobalSettings == 0) {
            this.loadingGlobalSettings = 1;
            getConnectionsManager().sendRequest(new TL_account.getGlobalPrivacySettings(), new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$loadGlobalPrivacySetting$61(tLObject, tL_error);
                }
            });
        }
    }

    public void lambda$loadGlobalPrivacySetting$61(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$loadGlobalPrivacySetting$60(tL_error, tLObject);
            }
        });
    }

    public void lambda$loadGlobalPrivacySetting$60(TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            this.globalPrivacySettings = (TLRPC.GlobalPrivacySettings) tLObject;
            this.loadingGlobalSettings = 2;
        } else {
            this.loadingGlobalSettings = 0;
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.privacyRulesUpdated, new Object[0]);
    }

    public void loadPrivacySettings() {
        loadPrivacySettings(false);
    }

    public void loadPrivacySettings(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ContactsController.loadPrivacySettings(boolean):void");
    }

    public void lambda$loadPrivacySettings$63(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$loadPrivacySettings$62(tL_error, tLObject);
            }
        });
    }

    public void lambda$loadPrivacySettings$62(TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            this.deleteAccountTTL = ((TLRPC.TL_accountDaysTTL) tLObject).days;
            this.loadingDeleteInfo = 2;
        } else {
            this.loadingDeleteInfo = 0;
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.privacyRulesUpdated, new Object[0]);
    }

    public void lambda$loadPrivacySettings$65(final int i, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$loadPrivacySettings$64(tL_error, tLObject, i);
            }
        });
    }

    public void lambda$loadPrivacySettings$64(TLRPC.TL_error tL_error, TLObject tLObject, int i) {
        if (tL_error == null) {
            TL_account.privacyRules privacyrules = (TL_account.privacyRules) tLObject;
            getMessagesController().putUsers(privacyrules.users, false);
            getMessagesController().putChats(privacyrules.chats, false);
            switch (i) {
                case 0:
                    this.lastseenPrivacyRules = privacyrules.rules;
                    break;
                case 1:
                    this.groupPrivacyRules = privacyrules.rules;
                    break;
                case 2:
                    this.callPrivacyRules = privacyrules.rules;
                    break;
                case 3:
                    this.p2pPrivacyRules = privacyrules.rules;
                    break;
                case 4:
                    this.profilePhotoPrivacyRules = privacyrules.rules;
                    break;
                case 5:
                    this.forwardsPrivacyRules = privacyrules.rules;
                    break;
                case 6:
                    this.phonePrivacyRules = privacyrules.rules;
                    break;
                case 7:
                case 10:
                default:
                    this.addedByPhonePrivacyRules = privacyrules.rules;
                    break;
                case 8:
                    this.voiceMessagesRules = privacyrules.rules;
                    break;
                case 9:
                    this.bioPrivacyRules = privacyrules.rules;
                    break;
                case 11:
                    this.birthdayPrivacyRules = privacyrules.rules;
                    break;
                case 12:
                    this.giftsPrivacyRules = privacyrules.rules;
                    break;
                case 13:
                    this.noPaidMessagesPrivacyRules = privacyrules.rules;
                    break;
                case 14:
                    this.musicPrivacyRules = privacyrules.rules;
                    break;
            }
            this.loadingPrivacyInfo[i] = 2;
        } else {
            this.loadingPrivacyInfo[i] = 0;
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.privacyRulesUpdated, new Object[0]);
    }

    public void setDeleteAccountTTL(int i) {
        this.deleteAccountTTL = i;
    }

    public int getDeleteAccountTTL() {
        return this.deleteAccountTTL;
    }

    public boolean getLoadingDeleteInfo() {
        return this.loadingDeleteInfo != 2;
    }

    public boolean getLoadingGlobalSettings() {
        return this.loadingGlobalSettings != 2;
    }

    public boolean getLoadingPrivacyInfo(int i) {
        return this.loadingPrivacyInfo[i] != 2;
    }

    public TLRPC.GlobalPrivacySettings getGlobalPrivacySettings() {
        return this.globalPrivacySettings;
    }

    public ArrayList<TLRPC.PrivacyRule> getPrivacyRules(int i) {
        switch (i) {
            case 0:
                return this.lastseenPrivacyRules;
            case 1:
                return this.groupPrivacyRules;
            case 2:
                return this.callPrivacyRules;
            case 3:
                return this.p2pPrivacyRules;
            case 4:
                return this.profilePhotoPrivacyRules;
            case 5:
                return this.forwardsPrivacyRules;
            case 6:
                return this.phonePrivacyRules;
            case 7:
                return this.addedByPhonePrivacyRules;
            case 8:
                return this.voiceMessagesRules;
            case 9:
                return this.bioPrivacyRules;
            case 10:
            default:
                return null;
            case 11:
                return this.birthdayPrivacyRules;
            case 12:
                return this.giftsPrivacyRules;
            case 13:
                return this.noPaidMessagesPrivacyRules;
            case 14:
                return this.musicPrivacyRules;
        }
    }

    public void setPrivacyRules(ArrayList<TLRPC.PrivacyRule> arrayList, int i) {
        switch (i) {
            case 0:
                this.lastseenPrivacyRules = arrayList;
                break;
            case 1:
                this.groupPrivacyRules = arrayList;
                break;
            case 2:
                this.callPrivacyRules = arrayList;
                break;
            case 3:
                this.p2pPrivacyRules = arrayList;
                break;
            case 4:
                this.profilePhotoPrivacyRules = arrayList;
                break;
            case 5:
                this.forwardsPrivacyRules = arrayList;
                break;
            case 6:
                this.phonePrivacyRules = arrayList;
                break;
            case 7:
                this.addedByPhonePrivacyRules = arrayList;
                break;
            case 8:
                this.voiceMessagesRules = arrayList;
                break;
            case 9:
                this.bioPrivacyRules = arrayList;
                break;
            case 11:
                this.birthdayPrivacyRules = arrayList;
                break;
            case 12:
                this.giftsPrivacyRules = arrayList;
                break;
            case 13:
                this.noPaidMessagesPrivacyRules = arrayList;
                break;
            case 14:
                this.musicPrivacyRules = arrayList;
                break;
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.privacyRulesUpdated, new Object[0]);
        reloadContactsStatuses();
    }

    public void createOrUpdateConnectionServiceContact(long j, String str, String str2) {
        String str3;
        int i;
        Cursor cursor;
        ArrayList<ContentProviderOperation> arrayList;
        if (hasContactsPermission()) {
            try {
                ContentResolver contentResolver = ApplicationLoader.applicationContext.getContentResolver();
                ArrayList<ContentProviderOperation> arrayList2 = new ArrayList<>();
                Uri uriBuild = ContactsContract.Groups.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").build();
                Uri uriBuild2 = ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").build();
                Account account = this.systemAccount;
                Cursor cursorQuery = contentResolver.query(uriBuild, new String[]{"_id"}, "title=? AND account_type=? AND account_name=?", new String[]{"TelegramConnectionService", account.type, account.name}, null);
                if (cursorQuery != null && cursorQuery.moveToFirst()) {
                    i = cursorQuery.getInt(0);
                    str3 = "account_type";
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("account_type", this.systemAccount.type);
                    contentValues.put("account_name", this.systemAccount.name);
                    str3 = "account_type";
                    contentValues.put("group_visible", (Integer) 0);
                    contentValues.put("group_is_read_only", (Integer) 1);
                    contentValues.put("title", "TelegramConnectionService");
                    i = Integer.parseInt(contentResolver.insert(uriBuild, contentValues).getLastPathSegment());
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                Uri uri = ContactsContract.Data.CONTENT_URI;
                String str4 = str3;
                Cursor cursorQuery2 = contentResolver.query(uri, new String[]{"raw_contact_id"}, "mimetype=? AND data1=?", new String[]{"vnd.android.cursor.item/group_membership", i + ""}, null);
                int size = arrayList2.size();
                int i2 = i;
                if (cursorQuery2 != null && cursorQuery2.moveToFirst()) {
                    int i3 = cursorQuery2.getInt(0);
                    cursor = cursorQuery2;
                    arrayList = arrayList2;
                    arrayList.add(ContentProviderOperation.newUpdate(uriBuild2).withSelection("_id=?", new String[]{i3 + ""}).withValue("deleted", 0).build());
                    arrayList.add(ContentProviderOperation.newUpdate(uri).withSelection("raw_contact_id=? AND mimetype=?", new String[]{i3 + "", "vnd.android.cursor.item/phone_v2"}).withValue("data1", "+99084" + j).build());
                    arrayList.add(ContentProviderOperation.newUpdate(uri).withSelection("raw_contact_id=? AND mimetype=?", new String[]{i3 + "", "vnd.android.cursor.item/name"}).withValue("data2", str).withValue("data3", str2).build());
                } else {
                    cursor = cursorQuery2;
                    arrayList = arrayList2;
                    arrayList.add(ContentProviderOperation.newInsert(uriBuild2).withValue(str4, this.systemAccount.type).withValue("account_name", this.systemAccount.name).withValue("raw_contact_is_read_only", 1).withValue("aggregation_mode", 3).build());
                    arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/name").withValue("data2", str).withValue("data3", str2).build());
                    arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("data1", "+99084" + j).build());
                    arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/group_membership").withValue("data1", Integer.valueOf(i2)).build());
                }
                if (cursor != null) {
                    cursor.close();
                }
                contentResolver.applyBatch("com.android.contacts", arrayList);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public void deleteConnectionServiceContact() {
        if (hasContactsPermission()) {
            try {
                ContentResolver contentResolver = ApplicationLoader.applicationContext.getContentResolver();
                Account account = this.systemAccount;
                Cursor cursorQuery = contentResolver.query(ContactsContract.Groups.CONTENT_URI, new String[]{"_id"}, "title=? AND account_type=? AND account_name=?", new String[]{"TelegramConnectionService", account.type, account.name}, null);
                if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                        return;
                    }
                    return;
                }
                int i = cursorQuery.getInt(0);
                cursorQuery.close();
                Cursor cursorQuery2 = contentResolver.query(ContactsContract.Data.CONTENT_URI, new String[]{"raw_contact_id"}, "mimetype=? AND data1=?", new String[]{"vnd.android.cursor.item/group_membership", i + ""}, null);
                if (cursorQuery2 == null || !cursorQuery2.moveToFirst()) {
                    if (cursorQuery2 != null) {
                        cursorQuery2.close();
                        return;
                    }
                    return;
                }
                int i2 = cursorQuery2.getInt(0);
                cursorQuery2.close();
                contentResolver.delete(ContactsContract.RawContacts.CONTENT_URI, "_id=?", new String[]{i2 + ""});
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static String formatName(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return formatName((TLRPC.User) tLObject);
        }
        if (tLObject instanceof TLRPC.Chat) {
            return ((TLRPC.Chat) tLObject).title;
        }
        return LocaleController.getString(R.string.HiddenName);
    }

    public static String formatName(TLRPC.User user) {
        if (user == null) {
            return "";
        }
        return formatName(user.first_name, user.last_name, 0);
    }

    public static String formatName(String str, String str2) {
        return formatName(str, str2, 0);
    }

    public static String formatName(String str, String str2, int i) {
        if (str != null) {
            str = str.trim();
        }
        if (str != null && str2 == null && i > 0 && str.contains(" ")) {
            int iIndexOf = str.indexOf(" ");
            String strSubstring = str.substring(iIndexOf + 1);
            str = str.substring(0, iIndexOf);
            str2 = strSubstring;
        }
        if (str2 != null) {
            str2 = str2.trim();
        }
        StringBuilder sb = new StringBuilder((str != null ? str.length() : 0) + (str2 != null ? str2.length() : 0) + 1);
        if (LocaleController.nameDisplayOrder == 1) {
            if (str != null && str.length() > 0) {
                if (i > 0 && str.length() > i + 2) {
                    return str.substring(0, i) + "…";
                }
                sb.append(str);
                if (str2 != null && str2.length() > 0) {
                    sb.append(" ");
                    if (i > 0 && sb.length() + str2.length() > i) {
                        sb.append(str2.charAt(0));
                    } else {
                        sb.append(str2);
                    }
                }
            } else if (str2 != null && str2.length() > 0) {
                if (i > 0 && str2.length() > i + 2) {
                    return str2.substring(0, i) + "…";
                }
                sb.append(str2);
            }
        } else if (str2 != null && str2.length() > 0) {
            if (i > 0 && str2.length() > i + 2) {
                return str2.substring(0, i) + "…";
            }
            sb.append(str2);
            if (str != null && str.length() > 0) {
                sb.append(" ");
                if (i > 0 && sb.length() + str.length() > i) {
                    sb.append(str.charAt(0));
                } else {
                    sb.append(str);
                }
            }
        } else if (str != null && str.length() > 0) {
            if (i > 0 && str.length() > i + 2) {
                return str.substring(0, i) + "…";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    private class PhoneBookContact {
        String id;
        String lookup_key;
        String name;
        String phone;

        private PhoneBookContact() {
        }
    }

    public static <T extends TLRPC.PrivacyRule> T findRule(ArrayList<TLRPC.PrivacyRule> arrayList, Class<T> cls) {
        if (arrayList == null) {
            return null;
        }
        Iterator<TLRPC.PrivacyRule> it = arrayList.iterator();
        while (it.hasNext()) {
            TLRPC.PrivacyRule next = it.next();
            if (cls.isInstance(next)) {
                return cls.cast(next);
            }
        }
        return null;
    }
}
