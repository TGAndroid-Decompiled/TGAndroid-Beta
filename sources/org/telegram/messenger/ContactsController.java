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
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$InputUser;
import org.telegram.tgnet.TLRPC$PrivacyRule;
import org.telegram.tgnet.TLRPC$TL_accountDaysTTL;
import org.telegram.tgnet.TLRPC$TL_account_getPrivacy;
import org.telegram.tgnet.TLRPC$TL_account_privacyRules;
import org.telegram.tgnet.TLRPC$TL_contact;
import org.telegram.tgnet.TLRPC$TL_contactStatus;
import org.telegram.tgnet.TLRPC$TL_contacts_addContact;
import org.telegram.tgnet.TLRPC$TL_contacts_contactsNotModified;
import org.telegram.tgnet.TLRPC$TL_contacts_deleteContacts;
import org.telegram.tgnet.TLRPC$TL_contacts_getContacts;
import org.telegram.tgnet.TLRPC$TL_contacts_importContacts;
import org.telegram.tgnet.TLRPC$TL_contacts_importedContacts;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_globalPrivacySettings;
import org.telegram.tgnet.TLRPC$TL_help_inviteText;
import org.telegram.tgnet.TLRPC$TL_inputPrivacyKeyAbout;
import org.telegram.tgnet.TLRPC$TL_inputPrivacyKeyAddedByPhone;
import org.telegram.tgnet.TLRPC$TL_inputPrivacyKeyBirthday;
import org.telegram.tgnet.TLRPC$TL_inputPrivacyKeyChatInvite;
import org.telegram.tgnet.TLRPC$TL_inputPrivacyKeyForwards;
import org.telegram.tgnet.TLRPC$TL_inputPrivacyKeyPhoneCall;
import org.telegram.tgnet.TLRPC$TL_inputPrivacyKeyPhoneNumber;
import org.telegram.tgnet.TLRPC$TL_inputPrivacyKeyPhoneP2P;
import org.telegram.tgnet.TLRPC$TL_inputPrivacyKeyProfilePhoto;
import org.telegram.tgnet.TLRPC$TL_inputPrivacyKeyStatusTimestamp;
import org.telegram.tgnet.TLRPC$TL_inputPrivacyKeyVoiceMessages;
import org.telegram.tgnet.TLRPC$TL_popularContact;
import org.telegram.tgnet.TLRPC$TL_user;
import org.telegram.tgnet.TLRPC$TL_userStatusLastMonth;
import org.telegram.tgnet.TLRPC$TL_userStatusLastWeek;
import org.telegram.tgnet.TLRPC$TL_userStatusRecently;
import org.telegram.tgnet.TLRPC$Updates;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$UserProfilePhoto;
import org.telegram.tgnet.TLRPC$UserStatus;
import org.telegram.tgnet.TLRPC$Vector;
import org.telegram.tgnet.TLRPC$contacts_Contacts;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.Bulletin;

public class ContactsController extends BaseController {
    private static volatile ContactsController[] Instance = new ContactsController[4];
    public static final int PRIVACY_RULES_TYPE_ADDED_BY_PHONE = 7;
    public static final int PRIVACY_RULES_TYPE_BIO = 9;
    public static final int PRIVACY_RULES_TYPE_BIRTHDAY = 11;
    public static final int PRIVACY_RULES_TYPE_CALLS = 2;
    public static final int PRIVACY_RULES_TYPE_COUNT = 12;
    public static final int PRIVACY_RULES_TYPE_FORWARDS = 5;
    public static final int PRIVACY_RULES_TYPE_INVITE = 1;
    public static final int PRIVACY_RULES_TYPE_LASTSEEN = 0;
    public static final int PRIVACY_RULES_TYPE_MESSAGES = 10;
    public static final int PRIVACY_RULES_TYPE_P2P = 3;
    public static final int PRIVACY_RULES_TYPE_PHONE = 6;
    public static final int PRIVACY_RULES_TYPE_PHOTO = 4;
    public static final int PRIVACY_RULES_TYPE_VOICE_MESSAGES = 8;
    private static Collator cachedCollator;
    private static Locale cachedCollatorLocale;
    private ArrayList<TLRPC$PrivacyRule> addedByPhonePrivacyRules;
    private ArrayList<TLRPC$PrivacyRule> bioPrivacyRules;
    private ArrayList<TLRPC$PrivacyRule> birthdayPrivacyRules;
    private ArrayList<TLRPC$PrivacyRule> callPrivacyRules;
    private int completedRequestsCount;
    public ArrayList<TLRPC$TL_contact> contacts;
    public HashMap<String, Contact> contactsBook;
    private boolean contactsBookLoaded;
    public HashMap<String, Contact> contactsBookSPhones;
    public HashMap<String, TLRPC$TL_contact> contactsByPhone;
    public HashMap<String, TLRPC$TL_contact> contactsByShortPhone;
    public ConcurrentHashMap<Long, TLRPC$TL_contact> contactsDict;
    public boolean contactsLoaded;
    private boolean contactsSyncInProgress;
    private ArrayList<Long> delayedContactsUpdate;
    private int deleteAccountTTL;
    public boolean doneLoadingContacts;
    private ArrayList<TLRPC$PrivacyRule> forwardsPrivacyRules;
    private TLRPC$TL_globalPrivacySettings globalPrivacySettings;
    private ArrayList<TLRPC$PrivacyRule> groupPrivacyRules;
    private boolean ignoreChanges;
    private String inviteLink;
    private String lastContactsVersions;
    private ArrayList<TLRPC$PrivacyRule> lastseenPrivacyRules;
    private final Object loadContactsSync;
    private boolean loadingContacts;
    private int loadingDeleteInfo;
    private int loadingGlobalSettings;
    private int[] loadingPrivacyInfo;
    private boolean migratingContacts;
    private final Object observerLock;
    private ArrayList<TLRPC$PrivacyRule> p2pPrivacyRules;
    public HashMap<String, Contact> phoneBookByShortPhones;
    public ArrayList<Contact> phoneBookContacts;
    public ArrayList<String> phoneBookSectionsArray;
    public HashMap<String, ArrayList<Object>> phoneBookSectionsDict;
    private ArrayList<TLRPC$PrivacyRule> phonePrivacyRules;
    private ArrayList<TLRPC$PrivacyRule> profilePhotoPrivacyRules;
    private String[] projectionNames;
    private String[] projectionPhones;
    private HashMap<String, String> sectionsToReplace;
    public ArrayList<String> sortedUsersMutualSectionsArray;
    public ArrayList<String> sortedUsersSectionsArray;
    private Account systemAccount;
    private boolean updatingInviteLink;
    public HashMap<String, ArrayList<TLRPC$TL_contact>> usersMutualSectionsDict;
    public HashMap<String, ArrayList<TLRPC$TL_contact>> usersSectionsDict;
    private ArrayList<TLRPC$PrivacyRule> voiceMessagesRules;

    public static void lambda$resetImportedContacts$9(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public class MyContentObserver extends ContentObserver {
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
                if (ContactsController.this.ignoreChanges) {
                    return;
                }
                Utilities.globalQueue.cancelRunnable(this.checkRunnable);
                Utilities.globalQueue.postRunnable(this.checkRunnable, 500L);
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
        public TLRPC$User user;
        public ArrayList<String> phones = new ArrayList<>(4);
        public ArrayList<String> phoneTypes = new ArrayList<>(4);
        public ArrayList<String> shortPhones = new ArrayList<>(4);
        public ArrayList<Integer> phoneDeleted = new ArrayList<>(4);

        public String getLetter() {
            return getLetter(this.first_name, this.last_name);
        }

        public static String getLetter(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return !TextUtils.isEmpty(str2) ? str2.substring(0, 1) : "#";
            }
            return str.substring(0, 1);
        }
    }

    public static ContactsController getInstance(int i) {
        ContactsController contactsController = Instance[i];
        if (contactsController == null) {
            synchronized (ContactsController.class) {
                contactsController = Instance[i];
                if (contactsController == null) {
                    ContactsController[] contactsControllerArr = Instance;
                    ContactsController contactsController2 = new ContactsController(i);
                    contactsControllerArr[i] = contactsController2;
                    contactsController = contactsController2;
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
        this.loadingPrivacyInfo = new int[12];
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
                    ContactsController.this.lambda$new$0();
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
        this.birthdayPrivacyRules = null;
        this.forwardsPrivacyRules = null;
        this.phonePrivacyRules = null;
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                ContactsController.this.lambda$cleanup$1();
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
            getConnectionsManager().sendRequest(new TLObject() {
                @Override
                public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i2, boolean z) {
                    return TLRPC$TL_help_inviteText.TLdeserialize(abstractSerializedData, i2, z);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                    abstractSerializedData.writeInt32(1295590211);
                }
            }, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    ContactsController.this.lambda$checkInviteText$3(tLObject, tLRPC$TL_error);
                }
            }, 2);
        }
    }

    public void lambda$checkInviteText$3(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            final TLRPC$TL_help_inviteText tLRPC$TL_help_inviteText = (TLRPC$TL_help_inviteText) tLObject;
            if (tLRPC$TL_help_inviteText.message.length() != 0) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ContactsController.this.lambda$checkInviteText$2(tLRPC$TL_help_inviteText);
                    }
                });
            }
        }
    }

    public void lambda$checkInviteText$2(TLRPC$TL_help_inviteText tLRPC$TL_help_inviteText) {
        this.updatingInviteLink = false;
        SharedPreferences.Editor edit = MessagesController.getMainSettings(this.currentAccount).edit();
        String str = tLRPC$TL_help_inviteText.message;
        this.inviteLink = str;
        edit.putString("invitelink", str);
        edit.putInt("invitelinktime", (int) (System.currentTimeMillis() / 1000));
        edit.commit();
    }

    public String getInviteText(int i) {
        String str = this.inviteLink;
        if (str == null) {
            str = "https://telegram.org/dl";
        }
        if (i <= 1) {
            return LocaleController.formatString("InviteText2", R.string.InviteText2, str);
        }
        try {
            return String.format(LocaleController.getPluralString("InviteTextNum", i), Integer.valueOf(i), str);
        } catch (Exception unused) {
            return LocaleController.formatString("InviteText2", R.string.InviteText2, str);
        }
    }

    public void checkAppAccount() {
        boolean z;
        AccountManager accountManager = AccountManager.get(ApplicationLoader.applicationContext);
        try {
            Account[] accountsByType = accountManager.getAccountsByType(BuildConfig.LIBRARY_PACKAGE_NAME);
            this.systemAccount = null;
            for (int i = 0; i < accountsByType.length; i++) {
                Account account = accountsByType[i];
                int i2 = 0;
                while (true) {
                    if (i2 >= 4) {
                        z = false;
                        break;
                    }
                    TLRPC$User currentUser = UserConfig.getInstance(i2).getCurrentUser();
                    if (currentUser != null) {
                        if (account.name.equals("" + currentUser.id)) {
                            if (i2 == this.currentAccount) {
                                this.systemAccount = account;
                            }
                            z = true;
                        }
                    }
                    i2++;
                }
                if (!z) {
                    try {
                        accountManager.removeAccount(accountsByType[i], null, null);
                    } catch (Exception unused) {
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        if (getUserConfig().isClientActivated()) {
            readContacts();
            if (this.systemAccount == null) {
                try {
                    Account account2 = new Account("" + getUserConfig().getClientUserId(), BuildConfig.LIBRARY_PACKAGE_NAME);
                    this.systemAccount = account2;
                    accountManager.addAccountExplicitly(account2, "", null);
                } catch (Exception unused3) {
                }
            }
        }
    }

    public void deleteUnknownAppAccounts() {
        boolean z;
        try {
            this.systemAccount = null;
            AccountManager accountManager = AccountManager.get(ApplicationLoader.applicationContext);
            Account[] accountsByType = accountManager.getAccountsByType(BuildConfig.LIBRARY_PACKAGE_NAME);
            for (int i = 0; i < accountsByType.length; i++) {
                Account account = accountsByType[i];
                int i2 = 0;
                while (true) {
                    if (i2 >= 4) {
                        z = false;
                        break;
                    }
                    TLRPC$User currentUser = UserConfig.getInstance(i2).getCurrentUser();
                    if (currentUser != null) {
                        if (account.name.equals("" + currentUser.id)) {
                            z = true;
                            break;
                        }
                    }
                    i2++;
                }
                if (!z) {
                    try {
                        accountManager.removeAccount(accountsByType[i], null, null);
                    } catch (Exception unused) {
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
                ContactsController.this.lambda$checkContacts$4();
            }
        });
    }

    public void lambda$checkContacts$4() {
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
                ContactsController.this.lambda$forceImportContacts$5();
            }
        });
    }

    public void lambda$forceImportContacts$5() {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("force import contacts");
        }
        performSyncPhoneBook(new HashMap<>(), true, true, true, true, false, false);
    }

    public void syncPhoneBookByAlert(final HashMap<String, Contact> hashMap, final boolean z, final boolean z2, final boolean z3) {
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                ContactsController.this.lambda$syncPhoneBookByAlert$6(hashMap, z, z2, z3);
            }
        });
    }

    public void lambda$syncPhoneBookByAlert$6(HashMap hashMap, boolean z, boolean z2, boolean z3) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("sync contacts by alert");
        }
        performSyncPhoneBook(hashMap, true, z, z2, false, false, z3);
    }

    public void deleteAllContacts(final Runnable runnable) {
        resetImportedContacts();
        TLRPC$TL_contacts_deleteContacts tLRPC$TL_contacts_deleteContacts = new TLRPC$TL_contacts_deleteContacts();
        int size = this.contacts.size();
        for (int i = 0; i < size; i++) {
            tLRPC$TL_contacts_deleteContacts.id.add(getMessagesController().getInputUser(this.contacts.get(i).user_id));
        }
        getConnectionsManager().sendRequest(tLRPC$TL_contacts_deleteContacts, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                ContactsController.this.lambda$deleteAllContacts$8(runnable, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$deleteAllContacts$8(final Runnable runnable, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
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
                    ContactsController.this.lambda$deleteAllContacts$7(runnable);
                }
            });
            return;
        }
        AndroidUtilities.runOnUIThread(runnable);
    }

    public void lambda$deleteAllContacts$7(Runnable runnable) {
        AccountManager accountManager = AccountManager.get(ApplicationLoader.applicationContext);
        try {
            Account[] accountsByType = accountManager.getAccountsByType(BuildConfig.LIBRARY_PACKAGE_NAME);
            this.systemAccount = null;
            for (Account account : accountsByType) {
                int i = 0;
                while (true) {
                    if (i >= 4) {
                        break;
                    }
                    TLRPC$User currentUser = UserConfig.getInstance(i).getCurrentUser();
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
            Account account2 = new Account("" + getUserConfig().getClientUserId(), BuildConfig.LIBRARY_PACKAGE_NAME);
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
        getConnectionsManager().sendRequest(new TLObject() {
            @Override
            public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
                return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                abstractSerializedData.writeInt32(-2020263951);
            }
        }, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                ContactsController.lambda$resetImportedContacts$9(tLObject, tLRPC$TL_error);
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
            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(ContactsContract.RawContacts.CONTENT_URI, new String[]{"version"}, null, null, null);
            if (query != null) {
                try {
                    StringBuilder sb = new StringBuilder();
                    while (query.moveToNext()) {
                        sb.append(query.getString(query.getColumnIndex("version")));
                    }
                    String sb2 = sb.toString();
                    if (this.lastContactsVersions.length() != 0 && !this.lastContactsVersions.equals(sb2)) {
                        z = true;
                    }
                    this.lastContactsVersions = sb2;
                } finally {
                }
            }
            if (query != null) {
                query.close();
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        return z;
    }

    public void readContacts() {
        synchronized (this.loadContactsSync) {
            if (this.loadingContacts) {
                return;
            }
            this.loadingContacts = true;
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    ContactsController.this.lambda$readContacts$10();
                }
            });
        }
    }

    public void lambda$readContacts$10() {
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
            char charAt = str.charAt(i2);
            if (charAt >= '0' && charAt <= '9') {
                i++;
            }
        }
        return i > 3;
    }

    public java.util.HashMap<java.lang.String, org.telegram.messenger.ContactsController.Contact> readContactsFromPhoneBook() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ContactsController.readContactsFromPhoneBook():java.util.HashMap");
    }

    public HashMap<String, Contact> getContactsCopy(HashMap<String, Contact> hashMap) {
        HashMap<String, Contact> hashMap2 = new HashMap<>();
        for (Map.Entry<String, Contact> entry : hashMap.entrySet()) {
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
            hashMap2.put(str, contact);
        }
        return hashMap2;
    }

    public void migratePhoneBookToV7(final SparseArray<Contact> sparseArray) {
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                ContactsController.this.lambda$migratePhoneBookToV7$11(sparseArray);
            }
        });
    }

    public void lambda$migratePhoneBookToV7$11(SparseArray sparseArray) {
        if (this.migratingContacts) {
            return;
        }
        this.migratingContacts = true;
        HashMap<String, Contact> hashMap = new HashMap<>();
        HashMap<String, Contact> readContactsFromPhoneBook = readContactsFromPhoneBook();
        HashMap hashMap2 = new HashMap();
        Iterator<Map.Entry<String, Contact>> it = readContactsFromPhoneBook.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Contact value = it.next().getValue();
            for (int i = 0; i < value.shortPhones.size(); i++) {
                hashMap2.put(value.shortPhones.get(i), value.key);
            }
        }
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            Contact contact = (Contact) sparseArray.valueAt(i2);
            int i3 = 0;
            while (true) {
                if (i3 >= contact.shortPhones.size()) {
                    break;
                }
                String str = (String) hashMap2.get(contact.shortPhones.get(i3));
                if (str != null) {
                    contact.key = str;
                    hashMap.put(str, contact);
                    break;
                }
                i3++;
            }
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("migrated contacts " + hashMap.size() + " of " + sparseArray.size());
        }
        getMessagesStorage().putCachedPhoneBook(hashMap, true, false);
    }

    public void performSyncPhoneBook(final HashMap<String, Contact> hashMap, final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final boolean z6) {
        if (z2 || this.contactsBookLoaded) {
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    ContactsController.this.lambda$performSyncPhoneBook$24(hashMap, z3, z, z2, z4, z5, z6);
                }
            });
        }
    }

    public void lambda$performSyncPhoneBook$24(final java.util.HashMap r29, final boolean r30, boolean r31, final boolean r32, boolean r33, boolean r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ContactsController.lambda$performSyncPhoneBook$24(java.util.HashMap, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    private void lambda$performSyncPhoneBook$12(HashMap hashMap) {
        ArrayList<TLRPC$User> arrayList = new ArrayList<>();
        if (hashMap != null && !hashMap.isEmpty()) {
            try {
                HashMap hashMap2 = new HashMap();
                for (int i = 0; i < this.contacts.size(); i++) {
                    TLRPC$User user = getMessagesController().getUser(Long.valueOf(this.contacts.get(i).user_id));
                    if (user != null && !TextUtils.isEmpty(user.phone)) {
                        hashMap2.put(user.phone, user);
                    }
                }
                Iterator it = hashMap.entrySet().iterator();
                while (it.hasNext()) {
                    Contact contact = (Contact) ((Map.Entry) it.next()).getValue();
                    int i2 = 0;
                    boolean z = false;
                    while (i2 < contact.shortPhones.size()) {
                        TLRPC$User tLRPC$User = (TLRPC$User) hashMap2.get(contact.shortPhones.get(i2));
                        if (tLRPC$User != null) {
                            arrayList.add(tLRPC$User);
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

    public void lambda$performSyncPhoneBook$13(int i, HashMap hashMap, boolean z, boolean z2) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.hasNewContactsToImport, Integer.valueOf(i), hashMap, Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    public void lambda$performSyncPhoneBook$15(HashMap hashMap, HashMap hashMap2, boolean z, final HashMap hashMap3, final ArrayList arrayList, final HashMap hashMap4) {
        this.contactsBookSPhones = hashMap;
        this.contactsBook = hashMap2;
        this.contactsSyncInProgress = false;
        this.contactsBookLoaded = true;
        if (z) {
            this.contactsLoaded = true;
        }
        if (!this.delayedContactsUpdate.isEmpty() && this.contactsLoaded) {
            applyContactsUpdates(this.delayedContactsUpdate, null, null, null);
            this.delayedContactsUpdate.clear();
        }
        getMessagesStorage().putCachedPhoneBook(hashMap2, false, false);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ContactsController.this.lambda$performSyncPhoneBook$14(hashMap3, arrayList, hashMap4);
            }
        });
    }

    public void lambda$performSyncPhoneBook$14(HashMap hashMap, ArrayList arrayList, HashMap hashMap2) {
        lambda$performSyncPhoneBook$22(hashMap, arrayList, hashMap2);
        updateUnregisteredContacts();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsDidLoad, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsImported, new Object[0]);
    }

    public void lambda$performSyncPhoneBook$19(HashMap hashMap, SparseArray sparseArray, final boolean[] zArr, final HashMap hashMap2, TLRPC$TL_contacts_importContacts tLRPC$TL_contacts_importContacts, int i, final HashMap hashMap3, final boolean z, final HashMap hashMap4, final ArrayList arrayList, final HashMap hashMap5, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        this.completedRequestsCount++;
        if (tLRPC$TL_error == null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("contacts imported");
            }
            TLRPC$TL_contacts_importedContacts tLRPC$TL_contacts_importedContacts = (TLRPC$TL_contacts_importedContacts) tLObject;
            if (!tLRPC$TL_contacts_importedContacts.retry_contacts.isEmpty()) {
                for (int i2 = 0; i2 < tLRPC$TL_contacts_importedContacts.retry_contacts.size(); i2++) {
                    hashMap.remove(sparseArray.get((int) tLRPC$TL_contacts_importedContacts.retry_contacts.get(i2).longValue()));
                }
                zArr[0] = true;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("result has retry contacts");
                }
            }
            for (int i3 = 0; i3 < tLRPC$TL_contacts_importedContacts.popular_invites.size(); i3++) {
                TLRPC$TL_popularContact tLRPC$TL_popularContact = tLRPC$TL_contacts_importedContacts.popular_invites.get(i3);
                Contact contact = (Contact) hashMap2.get(sparseArray.get((int) tLRPC$TL_popularContact.client_id));
                if (contact != null) {
                    contact.imported = tLRPC$TL_popularContact.importers;
                }
            }
            getMessagesStorage().putUsersAndChats(tLRPC$TL_contacts_importedContacts.users, null, true, true);
            ArrayList<TLRPC$TL_contact> arrayList2 = new ArrayList<>();
            for (int i4 = 0; i4 < tLRPC$TL_contacts_importedContacts.imported.size(); i4++) {
                TLRPC$TL_contact tLRPC$TL_contact = new TLRPC$TL_contact();
                tLRPC$TL_contact.user_id = tLRPC$TL_contacts_importedContacts.imported.get(i4).user_id;
                arrayList2.add(tLRPC$TL_contact);
            }
            processLoadedContacts(arrayList2, tLRPC$TL_contacts_importedContacts.users, 2);
        } else {
            for (int i5 = 0; i5 < tLRPC$TL_contacts_importContacts.contacts.size(); i5++) {
                hashMap.remove(sparseArray.get((int) tLRPC$TL_contacts_importContacts.contacts.get(i5).client_id));
            }
            zArr[0] = true;
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("import contacts error " + tLRPC$TL_error.text);
            }
        }
        if (this.completedRequestsCount == i) {
            if (!hashMap.isEmpty()) {
                getMessagesStorage().putCachedPhoneBook(hashMap, false, false);
            }
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    ContactsController.this.lambda$performSyncPhoneBook$18(hashMap3, hashMap2, z, hashMap4, arrayList, hashMap5, zArr);
                }
            });
        }
    }

    public void lambda$performSyncPhoneBook$18(HashMap hashMap, HashMap hashMap2, boolean z, final HashMap hashMap3, final ArrayList arrayList, final HashMap hashMap4, boolean[] zArr) {
        this.contactsBookSPhones = hashMap;
        this.contactsBook = hashMap2;
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
                ContactsController.this.lambda$performSyncPhoneBook$16(hashMap3, arrayList, hashMap4);
            }
        });
        if (zArr[0]) {
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    ContactsController.this.lambda$performSyncPhoneBook$17();
                }
            }, 300000L);
        }
    }

    public void lambda$performSyncPhoneBook$16(HashMap hashMap, ArrayList arrayList, HashMap hashMap2) {
        lambda$performSyncPhoneBook$22(hashMap, arrayList, hashMap2);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsImported, new Object[0]);
    }

    public void lambda$performSyncPhoneBook$17() {
        getMessagesStorage().getCachedPhoneBook(true);
    }

    public void lambda$performSyncPhoneBook$21(HashMap hashMap, HashMap hashMap2, boolean z, final HashMap hashMap3, final ArrayList arrayList, final HashMap hashMap4) {
        this.contactsBookSPhones = hashMap;
        this.contactsBook = hashMap2;
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
                ContactsController.this.lambda$performSyncPhoneBook$20(hashMap3, arrayList, hashMap4);
            }
        });
    }

    public void lambda$performSyncPhoneBook$20(HashMap hashMap, ArrayList arrayList, HashMap hashMap2) {
        lambda$performSyncPhoneBook$22(hashMap, arrayList, hashMap2);
        updateUnregisteredContacts();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsDidLoad, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsImported, new Object[0]);
    }

    public void lambda$performSyncPhoneBook$23(HashMap hashMap, HashMap hashMap2, boolean z, final HashMap hashMap3, final ArrayList arrayList, final HashMap hashMap4) {
        this.contactsBookSPhones = hashMap;
        this.contactsBook = hashMap2;
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
                ContactsController.this.lambda$performSyncPhoneBook$22(hashMap3, arrayList, hashMap4);
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

    private long getContactsHash(ArrayList<TLRPC$TL_contact> arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        Collections.sort(arrayList2, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                int lambda$getContactsHash$25;
                lambda$getContactsHash$25 = ContactsController.lambda$getContactsHash$25((TLRPC$TL_contact) obj, (TLRPC$TL_contact) obj2);
                return lambda$getContactsHash$25;
            }
        });
        int size = arrayList2.size();
        long j = 0;
        for (int i = -1; i < size; i++) {
            if (i == -1) {
                j = MediaDataController.calcHash(j, getUserConfig().contactsSavedCount);
            } else {
                j = MediaDataController.calcHash(j, ((TLRPC$TL_contact) arrayList2.get(i)).user_id);
            }
        }
        return j;
    }

    public static int lambda$getContactsHash$25(TLRPC$TL_contact tLRPC$TL_contact, TLRPC$TL_contact tLRPC$TL_contact2) {
        long j = tLRPC$TL_contact.user_id;
        long j2 = tLRPC$TL_contact2.user_id;
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
            TLRPC$TL_contacts_getContacts tLRPC$TL_contacts_getContacts = new TLRPC$TL_contacts_getContacts();
            tLRPC$TL_contacts_getContacts.hash = j;
            getConnectionsManager().sendRequest(tLRPC$TL_contacts_getContacts, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    ContactsController.this.lambda$loadContacts$27(j, tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$loadContacts$27(long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            TLRPC$contacts_Contacts tLRPC$contacts_Contacts = (TLRPC$contacts_Contacts) tLObject;
            if (j != 0 && (tLRPC$contacts_Contacts instanceof TLRPC$TL_contacts_contactsNotModified)) {
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
                        ContactsController.this.lambda$loadContacts$26();
                    }
                });
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("load contacts don't change");
                    return;
                }
                return;
            }
            getUserConfig().contactsSavedCount = tLRPC$contacts_Contacts.saved_count;
            getUserConfig().saveConfig(false);
            processLoadedContacts(tLRPC$contacts_Contacts.contacts, tLRPC$contacts_Contacts.users, 0);
        }
    }

    public void lambda$loadContacts$26() {
        synchronized (this.loadContactsSync) {
            this.loadingContacts = false;
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsDidLoad, new Object[0]);
    }

    public void processLoadedContacts(final ArrayList<TLRPC$TL_contact> arrayList, final ArrayList<TLRPC$User> arrayList2, final int i) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ContactsController.this.lambda$processLoadedContacts$36(arrayList2, i, arrayList);
            }
        });
    }

    public void lambda$processLoadedContacts$36(final ArrayList arrayList, final int i, final ArrayList arrayList2) {
        getMessagesController().putUsers(arrayList, i == 1);
        final LongSparseArray longSparseArray = new LongSparseArray();
        final boolean isEmpty = arrayList2.isEmpty();
        if (i == 2 && !this.contacts.isEmpty()) {
            int i2 = 0;
            while (i2 < arrayList2.size()) {
                if (this.contactsDict.get(Long.valueOf(((TLRPC$TL_contact) arrayList2.get(i2)).user_id)) != null) {
                    arrayList2.remove(i2);
                    i2--;
                }
                i2++;
            }
            arrayList2.addAll(this.contacts);
        }
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            TLRPC$User user = getMessagesController().getUser(Long.valueOf(((TLRPC$TL_contact) arrayList2.get(i3)).user_id));
            if (user != null) {
                longSparseArray.put(user.id, user);
            }
        }
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                ContactsController.this.lambda$processLoadedContacts$35(i, arrayList2, arrayList, longSparseArray, isEmpty);
            }
        });
    }

    public void lambda$processLoadedContacts$35(final int i, final ArrayList arrayList, ArrayList arrayList2, LongSparseArray longSparseArray, final boolean z) {
        HashMap hashMap;
        final HashMap hashMap2;
        int i2;
        int i3;
        HashMap hashMap3;
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
                        ContactsController.this.lambda$processLoadedContacts$28();
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
            TLRPC$TL_contact tLRPC$TL_contact = arrayList4.get(i4);
            if (MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tLRPC$TL_contact.user_id)) == null && tLRPC$TL_contact.user_id != getUserConfig().getClientUserId()) {
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
                int lambda$processLoadedContacts$29;
                lambda$processLoadedContacts$29 = ContactsController.lambda$processLoadedContacts$29(LongSparseArray.this, localeCollator, (TLRPC$TL_contact) obj, (TLRPC$TL_contact) obj2);
                return lambda$processLoadedContacts$29;
            }
        });
        final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(20, 1.0f, 2);
        final HashMap hashMap4 = new HashMap();
        final HashMap hashMap5 = new HashMap();
        final ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        if (this.contactsBookLoaded) {
            hashMap = null;
            hashMap2 = null;
        } else {
            hashMap2 = new HashMap();
            hashMap = new HashMap();
        }
        int i5 = 0;
        while (i5 < arrayList.size()) {
            TLRPC$TL_contact tLRPC$TL_contact2 = arrayList4.get(i5);
            TLRPC$User tLRPC$User = (TLRPC$User) longSparseArray2.get(tLRPC$TL_contact2.user_id);
            if (tLRPC$User == null) {
                hashMap3 = hashMap;
                i2 = i5;
                arrayList3 = arrayList6;
            } else {
                i2 = i5;
                ArrayList arrayList7 = arrayList6;
                concurrentHashMap.put(Long.valueOf(tLRPC$TL_contact2.user_id), tLRPC$TL_contact2);
                if (hashMap2 == null || TextUtils.isEmpty(tLRPC$User.phone)) {
                    i3 = 0;
                } else {
                    hashMap2.put(tLRPC$User.phone, tLRPC$TL_contact2);
                    i3 = 0;
                    hashMap.put(tLRPC$User.phone.substring(Math.max(0, r13.length() - 7)), tLRPC$TL_contact2);
                }
                String firstName = UserObject.getFirstName(tLRPC$User);
                hashMap3 = hashMap;
                if (firstName.length() > 1) {
                    firstName = firstName.substring(i3, 1);
                }
                String upperCase = firstName.length() == 0 ? "#" : firstName.toUpperCase();
                String str = this.sectionsToReplace.get(upperCase);
                if (str != null) {
                    upperCase = str;
                }
                ArrayList arrayList8 = (ArrayList) hashMap4.get(upperCase);
                if (arrayList8 == null) {
                    arrayList8 = new ArrayList();
                    hashMap4.put(upperCase, arrayList8);
                    arrayList5.add(upperCase);
                }
                arrayList8.add(tLRPC$TL_contact2);
                if (tLRPC$User.mutual_contact) {
                    ArrayList arrayList9 = (ArrayList) hashMap5.get(upperCase);
                    if (arrayList9 == null) {
                        arrayList9 = new ArrayList();
                        hashMap5.put(upperCase, arrayList9);
                        arrayList3 = arrayList7;
                        arrayList3.add(upperCase);
                    } else {
                        arrayList3 = arrayList7;
                    }
                    arrayList9.add(tLRPC$TL_contact2);
                } else {
                    arrayList3 = arrayList7;
                }
            }
            int i6 = i2 + 1;
            arrayList4 = arrayList;
            longSparseArray2 = longSparseArray;
            arrayList6 = arrayList3;
            hashMap = hashMap3;
            i5 = i6;
        }
        final HashMap hashMap6 = hashMap;
        final ArrayList arrayList10 = arrayList6;
        Collections.sort(arrayList5, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                int lambda$processLoadedContacts$30;
                lambda$processLoadedContacts$30 = ContactsController.lambda$processLoadedContacts$30(localeCollator, (String) obj, (String) obj2);
                return lambda$processLoadedContacts$30;
            }
        });
        Collections.sort(arrayList10, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                int lambda$processLoadedContacts$31;
                lambda$processLoadedContacts$31 = ContactsController.lambda$processLoadedContacts$31(localeCollator, (String) obj, (String) obj2);
                return lambda$processLoadedContacts$31;
            }
        });
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ContactsController.this.lambda$processLoadedContacts$32(arrayList, concurrentHashMap, hashMap4, hashMap5, arrayList5, arrayList10, i, z, z2);
            }
        });
        if (!this.delayedContactsUpdate.isEmpty() && this.contactsLoaded && this.contactsBookLoaded) {
            applyContactsUpdates(this.delayedContactsUpdate, null, null, null);
            this.delayedContactsUpdate.clear();
        }
        if (hashMap2 != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ContactsController.this.lambda$processLoadedContacts$34(hashMap2, hashMap6);
                }
            });
        } else {
            this.contactsLoaded = true;
        }
    }

    public void lambda$processLoadedContacts$28() {
        this.doneLoadingContacts = true;
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsDidLoad, new Object[0]);
    }

    public static int lambda$processLoadedContacts$29(LongSparseArray longSparseArray, Collator collator, TLRPC$TL_contact tLRPC$TL_contact, TLRPC$TL_contact tLRPC$TL_contact2) {
        return collator.compare(UserObject.getFirstName((TLRPC$User) longSparseArray.get(tLRPC$TL_contact.user_id)), UserObject.getFirstName((TLRPC$User) longSparseArray.get(tLRPC$TL_contact2.user_id)));
    }

    public static int lambda$processLoadedContacts$30(Collator collator, String str, String str2) {
        char charAt = str.charAt(0);
        char charAt2 = str2.charAt(0);
        if (charAt == '#') {
            return 1;
        }
        if (charAt2 == '#') {
            return -1;
        }
        return collator.compare(str, str2);
    }

    public static int lambda$processLoadedContacts$31(Collator collator, String str, String str2) {
        char charAt = str.charAt(0);
        char charAt2 = str2.charAt(0);
        if (charAt == '#') {
            return 1;
        }
        if (charAt2 == '#') {
            return -1;
        }
        return collator.compare(str, str2);
    }

    public void lambda$processLoadedContacts$32(ArrayList arrayList, ConcurrentHashMap concurrentHashMap, HashMap hashMap, HashMap hashMap2, ArrayList arrayList2, ArrayList arrayList3, int i, boolean z, boolean z2) {
        this.contacts = arrayList;
        this.contactsDict = concurrentHashMap;
        this.usersSectionsDict = hashMap;
        this.usersMutualSectionsDict = hashMap2;
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

    public void lambda$processLoadedContacts$34(final HashMap hashMap, final HashMap hashMap2) {
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                ContactsController.this.lambda$processLoadedContacts$33(hashMap, hashMap2);
            }
        });
        if (this.contactsSyncInProgress) {
            return;
        }
        this.contactsSyncInProgress = true;
        getMessagesStorage().getCachedPhoneBook(false);
    }

    public void lambda$processLoadedContacts$33(HashMap hashMap, HashMap hashMap2) {
        this.contactsByPhone = hashMap;
        this.contactsByShortPhone = hashMap2;
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

    public void lambda$performSyncPhoneBook$22(HashMap<String, ArrayList<Object>> hashMap, ArrayList<String> arrayList, HashMap<String, Contact> hashMap2) {
        mergePhonebookAndTelegramContacts(hashMap, arrayList, hashMap2, true);
    }

    private void mergePhonebookAndTelegramContacts(final HashMap<String, ArrayList<Object>> hashMap, final ArrayList<String> arrayList, final HashMap<String, Contact> hashMap2, final boolean z) {
        final ArrayList arrayList2 = new ArrayList(this.contacts);
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                ContactsController.this.lambda$mergePhonebookAndTelegramContacts$40(z, arrayList2, hashMap2, hashMap, arrayList);
            }
        });
    }

    public void lambda$mergePhonebookAndTelegramContacts$40(boolean z, ArrayList arrayList, final HashMap hashMap, final HashMap hashMap2, final ArrayList arrayList2) {
        if (z) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                TLRPC$User user = getMessagesController().getUser(Long.valueOf(((TLRPC$TL_contact) arrayList.get(i)).user_id));
                if (user != null && !TextUtils.isEmpty(user.phone)) {
                    Contact contact = (Contact) hashMap.get(user.phone.substring(Math.max(0, r3.length() - 7)));
                    if (contact != null) {
                        if (contact.user == null) {
                            contact.user = user;
                        }
                    } else {
                        String letter = Contact.getLetter(user.first_name, user.last_name);
                        ArrayList arrayList3 = (ArrayList) hashMap2.get(letter);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            hashMap2.put(letter, arrayList3);
                            arrayList2.add(letter);
                        }
                        arrayList3.add(user);
                    }
                }
            }
        }
        final Collator localeCollator = getLocaleCollator();
        Iterator it = hashMap2.values().iterator();
        while (it.hasNext()) {
            Collections.sort((ArrayList) it.next(), new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    int lambda$mergePhonebookAndTelegramContacts$37;
                    lambda$mergePhonebookAndTelegramContacts$37 = ContactsController.lambda$mergePhonebookAndTelegramContacts$37(localeCollator, obj, obj2);
                    return lambda$mergePhonebookAndTelegramContacts$37;
                }
            });
        }
        Collections.sort(arrayList2, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                int lambda$mergePhonebookAndTelegramContacts$38;
                lambda$mergePhonebookAndTelegramContacts$38 = ContactsController.lambda$mergePhonebookAndTelegramContacts$38(localeCollator, (String) obj, (String) obj2);
                return lambda$mergePhonebookAndTelegramContacts$38;
            }
        });
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ContactsController.this.lambda$mergePhonebookAndTelegramContacts$39(arrayList2, hashMap, hashMap2);
            }
        });
    }

    public static int lambda$mergePhonebookAndTelegramContacts$37(Collator collator, Object obj, Object obj2) {
        String str;
        String formatName;
        String str2 = "";
        if (obj instanceof TLRPC$User) {
            TLRPC$User tLRPC$User = (TLRPC$User) obj;
            str = formatName(tLRPC$User.first_name, tLRPC$User.last_name);
        } else if (obj instanceof Contact) {
            Contact contact = (Contact) obj;
            TLRPC$User tLRPC$User2 = contact.user;
            if (tLRPC$User2 != null) {
                str = formatName(tLRPC$User2.first_name, tLRPC$User2.last_name);
            } else {
                str = formatName(contact.first_name, contact.last_name);
            }
        } else {
            str = "";
        }
        if (obj2 instanceof TLRPC$User) {
            TLRPC$User tLRPC$User3 = (TLRPC$User) obj2;
            str2 = formatName(tLRPC$User3.first_name, tLRPC$User3.last_name);
        } else if (obj2 instanceof Contact) {
            Contact contact2 = (Contact) obj2;
            TLRPC$User tLRPC$User4 = contact2.user;
            if (tLRPC$User4 != null) {
                formatName = formatName(tLRPC$User4.first_name, tLRPC$User4.last_name);
            } else {
                formatName = formatName(contact2.first_name, contact2.last_name);
            }
            str2 = formatName;
        }
        return collator.compare(str, str2);
    }

    public static int lambda$mergePhonebookAndTelegramContacts$38(Collator collator, String str, String str2) {
        char charAt = str.charAt(0);
        char charAt2 = str2.charAt(0);
        if (charAt == '#') {
            return 1;
        }
        if (charAt2 == '#') {
            return -1;
        }
        return collator.compare(str, str2);
    }

    public void lambda$mergePhonebookAndTelegramContacts$39(ArrayList arrayList, HashMap hashMap, HashMap hashMap2) {
        this.phoneBookSectionsArray = arrayList;
        this.phoneBookByShortPhones = hashMap;
        this.phoneBookSectionsDict = hashMap2;
    }

    private void updateUnregisteredContacts() {
        boolean z;
        HashMap hashMap = new HashMap();
        int size = this.contacts.size();
        for (int i = 0; i < size; i++) {
            TLRPC$TL_contact tLRPC$TL_contact = this.contacts.get(i);
            TLRPC$User user = getMessagesController().getUser(Long.valueOf(tLRPC$TL_contact.user_id));
            if (user != null && !TextUtils.isEmpty(user.phone)) {
                hashMap.put(user.phone, tLRPC$TL_contact);
            }
        }
        ArrayList<Contact> arrayList = new ArrayList<>();
        Iterator<Map.Entry<String, Contact>> it = this.contactsBook.entrySet().iterator();
        while (it.hasNext()) {
            Contact value = it.next().getValue();
            int i2 = 0;
            while (true) {
                z = true;
                if (i2 >= value.phones.size()) {
                    z = false;
                    break;
                } else if (hashMap.containsKey(value.shortPhones.get(i2)) || value.phoneDeleted.get(i2).intValue() == 1) {
                    break;
                } else {
                    i2++;
                }
            }
            if (!z) {
                arrayList.add(value);
            }
        }
        final Collator localeCollator = getLocaleCollator();
        Collections.sort(arrayList, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                int lambda$updateUnregisteredContacts$41;
                lambda$updateUnregisteredContacts$41 = ContactsController.lambda$updateUnregisteredContacts$41(localeCollator, (ContactsController.Contact) obj, (ContactsController.Contact) obj2);
                return lambda$updateUnregisteredContacts$41;
            }
        });
        this.phoneBookContacts = arrayList;
    }

    public static int lambda$updateUnregisteredContacts$41(Collator collator, Contact contact, Contact contact2) {
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
        final Collator localeCollator = getLocaleCollator();
        if (z) {
            Collections.sort(this.contacts, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    int lambda$buildContactsSectionsArrays$42;
                    lambda$buildContactsSectionsArrays$42 = ContactsController.this.lambda$buildContactsSectionsArrays$42(localeCollator, (TLRPC$TL_contact) obj, (TLRPC$TL_contact) obj2);
                    return lambda$buildContactsSectionsArrays$42;
                }
            });
        }
        HashMap<String, ArrayList<TLRPC$TL_contact>> hashMap = new HashMap<>();
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < this.contacts.size(); i++) {
            TLRPC$TL_contact tLRPC$TL_contact = this.contacts.get(i);
            TLRPC$User user = getMessagesController().getUser(Long.valueOf(tLRPC$TL_contact.user_id));
            if (user != null) {
                String firstName = UserObject.getFirstName(user);
                if (firstName.length() > 1) {
                    firstName = firstName.substring(0, 1);
                }
                String upperCase = firstName.length() == 0 ? "#" : firstName.toUpperCase();
                String str = this.sectionsToReplace.get(upperCase);
                if (str != null) {
                    upperCase = str;
                }
                ArrayList<TLRPC$TL_contact> arrayList2 = hashMap.get(upperCase);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                    hashMap.put(upperCase, arrayList2);
                    arrayList.add(upperCase);
                }
                arrayList2.add(tLRPC$TL_contact);
            }
        }
        Collections.sort(arrayList, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                int lambda$buildContactsSectionsArrays$43;
                lambda$buildContactsSectionsArrays$43 = ContactsController.lambda$buildContactsSectionsArrays$43(localeCollator, (String) obj, (String) obj2);
                return lambda$buildContactsSectionsArrays$43;
            }
        });
        this.usersSectionsDict = hashMap;
        this.sortedUsersSectionsArray = arrayList;
    }

    public int lambda$buildContactsSectionsArrays$42(Collator collator, TLRPC$TL_contact tLRPC$TL_contact, TLRPC$TL_contact tLRPC$TL_contact2) {
        return collator.compare(UserObject.getFirstName(getMessagesController().getUser(Long.valueOf(tLRPC$TL_contact.user_id))), UserObject.getFirstName(getMessagesController().getUser(Long.valueOf(tLRPC$TL_contact2.user_id))));
    }

    public static int lambda$buildContactsSectionsArrays$43(Collator collator, String str, String str2) {
        char charAt = str.charAt(0);
        char charAt2 = str2.charAt(0);
        if (charAt == '#') {
            return 1;
        }
        if (charAt2 == '#') {
            return -1;
        }
        return collator.compare(str, str2);
    }

    private boolean hasContactsPermission() {
        if (Build.VERSION.SDK_INT >= 23) {
            return ApplicationLoader.applicationContext.checkSelfPermission("android.permission.READ_CONTACTS") == 0;
        }
        Cursor cursor = null;
        try {
            try {
                cursor = ApplicationLoader.applicationContext.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, this.projectionPhones, null, null, null);
            } catch (Exception e) {
                FileLog.e(e);
            }
        } catch (Throwable th) {
            try {
                FileLog.e(th);
                if (cursor != null) {
                    cursor.close();
                }
            } finally {
                if (cursor != null) {
                    try {
                        cursor.close();
                    } catch (Exception e2) {
                        FileLog.e(e2);
                    }
                }
            }
        }
        if (cursor != null) {
            if (cursor.getCount() != 0) {
                cursor.close();
                return true;
            }
        }
        return false;
    }

    private boolean hasContactsWritePermission() {
        return Build.VERSION.SDK_INT < 23 || ApplicationLoader.applicationContext.checkSelfPermission("android.permission.WRITE_CONTACTS") == 0;
    }

    public void lambda$performWriteContactsToPhoneBook$44(java.util.ArrayList<org.telegram.tgnet.TLRPC$TL_contact> r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ContactsController.lambda$performWriteContactsToPhoneBook$44(java.util.ArrayList):void");
    }

    private void performWriteContactsToPhoneBook() {
        final ArrayList arrayList = new ArrayList(this.contacts);
        Utilities.phoneBookQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                ContactsController.this.lambda$performWriteContactsToPhoneBook$44(arrayList);
            }
        });
    }

    private void applyContactsUpdates(ArrayList<Long> arrayList, ConcurrentHashMap<Long, TLRPC$User> concurrentHashMap, final ArrayList<TLRPC$TL_contact> arrayList2, final ArrayList<Long> arrayList3) {
        int indexOf;
        int indexOf2;
        if (arrayList2 == null || arrayList3 == null) {
            arrayList2 = new ArrayList<>();
            arrayList3 = new ArrayList<>();
            for (int i = 0; i < arrayList.size(); i++) {
                Long l = arrayList.get(i);
                if (l.longValue() > 0) {
                    TLRPC$TL_contact tLRPC$TL_contact = new TLRPC$TL_contact();
                    tLRPC$TL_contact.user_id = l.longValue();
                    arrayList2.add(tLRPC$TL_contact);
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
            TLRPC$TL_contact tLRPC$TL_contact2 = arrayList2.get(i2);
            TLRPC$User tLRPC$User = concurrentHashMap != null ? concurrentHashMap.get(Long.valueOf(tLRPC$TL_contact2.user_id)) : null;
            if (tLRPC$User == null) {
                tLRPC$User = getMessagesController().getUser(Long.valueOf(tLRPC$TL_contact2.user_id));
            } else {
                getMessagesController().putUser(tLRPC$User, true);
            }
            if (tLRPC$User == null || TextUtils.isEmpty(tLRPC$User.phone)) {
                z = true;
            } else {
                Contact contact = this.contactsBookSPhones.get(tLRPC$User.phone);
                if (contact != null && (indexOf2 = contact.shortPhones.indexOf(tLRPC$User.phone)) != -1) {
                    contact.phoneDeleted.set(indexOf2, 0);
                }
                if (sb.length() != 0) {
                    sb.append(",");
                }
                sb.append(tLRPC$User.phone);
            }
            i2++;
        }
        for (int i3 = 0; i3 < arrayList3.size(); i3++) {
            final Long l2 = arrayList3.get(i3);
            Utilities.phoneBookQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    ContactsController.this.lambda$applyContactsUpdates$45(l2);
                }
            });
            TLRPC$User tLRPC$User2 = concurrentHashMap != null ? concurrentHashMap.get(l2) : null;
            if (tLRPC$User2 == null) {
                tLRPC$User2 = getMessagesController().getUser(l2);
            } else {
                getMessagesController().putUser(tLRPC$User2, true);
            }
            if (tLRPC$User2 == null) {
                z = true;
            } else if (!TextUtils.isEmpty(tLRPC$User2.phone)) {
                Contact contact2 = this.contactsBookSPhones.get(tLRPC$User2.phone);
                if (contact2 != null && (indexOf = contact2.shortPhones.indexOf(tLRPC$User2.phone)) != -1) {
                    contact2.phoneDeleted.set(indexOf, 1);
                }
                if (sb2.length() != 0) {
                    sb2.append(",");
                }
                sb2.append(tLRPC$User2.phone);
            }
        }
        if (sb.length() != 0 || sb2.length() != 0) {
            getMessagesStorage().applyPhoneBookUpdates(sb.toString(), sb2.toString());
        }
        if (z) {
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    ContactsController.this.lambda$applyContactsUpdates$46();
                }
            });
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ContactsController.this.lambda$applyContactsUpdates$47(arrayList2, arrayList3);
                }
            });
        }
    }

    public void lambda$applyContactsUpdates$45(Long l) {
        deleteContactFromPhoneBook(l.longValue());
    }

    public void lambda$applyContactsUpdates$46() {
        loadContacts(false, 0L);
    }

    public void lambda$applyContactsUpdates$47(ArrayList arrayList, ArrayList arrayList2) {
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC$TL_contact tLRPC$TL_contact = (TLRPC$TL_contact) arrayList.get(i);
            if (this.contactsDict.get(Long.valueOf(tLRPC$TL_contact.user_id)) == null) {
                this.contacts.add(tLRPC$TL_contact);
                this.contactsDict.put(Long.valueOf(tLRPC$TL_contact.user_id), tLRPC$TL_contact);
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            Long l = (Long) arrayList2.get(i2);
            TLRPC$TL_contact tLRPC$TL_contact2 = this.contactsDict.get(l);
            if (tLRPC$TL_contact2 != null) {
                this.contacts.remove(tLRPC$TL_contact2);
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

    public void processContactsUpdates(ArrayList<Long> arrayList, ConcurrentHashMap<Long, TLRPC$User> concurrentHashMap) {
        int indexOf;
        int indexOf2;
        ArrayList<TLRPC$TL_contact> arrayList2 = new ArrayList<>();
        ArrayList<Long> arrayList3 = new ArrayList<>();
        Iterator<Long> it = arrayList.iterator();
        while (it.hasNext()) {
            Long next = it.next();
            if (next.longValue() > 0) {
                TLRPC$TL_contact tLRPC$TL_contact = new TLRPC$TL_contact();
                tLRPC$TL_contact.user_id = next.longValue();
                arrayList2.add(tLRPC$TL_contact);
                if (!this.delayedContactsUpdate.isEmpty() && (indexOf = this.delayedContactsUpdate.indexOf(Long.valueOf(-next.longValue()))) != -1) {
                    this.delayedContactsUpdate.remove(indexOf);
                }
            } else if (next.longValue() < 0) {
                arrayList3.add(Long.valueOf(-next.longValue()));
                if (!this.delayedContactsUpdate.isEmpty() && (indexOf2 = this.delayedContactsUpdate.indexOf(Long.valueOf(-next.longValue()))) != -1) {
                    this.delayedContactsUpdate.remove(indexOf2);
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

    public long addContactToPhoneBook(TLRPC$User tLRPC$User, boolean z) {
        long j = -1;
        if (this.systemAccount == null || tLRPC$User == null || !hasContactsWritePermission()) {
            return -1L;
        }
        synchronized (this.observerLock) {
            this.ignoreChanges = true;
        }
        ContentResolver contentResolver = ApplicationLoader.applicationContext.getContentResolver();
        if (z) {
            try {
                contentResolver.delete(ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", this.systemAccount.name).appendQueryParameter("account_type", this.systemAccount.type).build(), "sync2 = " + tLRPC$User.id, null);
            } catch (Exception unused) {
            }
        }
        ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
        applyContactToPhoneBook(arrayList, tLRPC$User);
        try {
            ContentProviderResult[] applyBatch = contentResolver.applyBatch("com.android.contacts", arrayList);
            if (applyBatch != null && applyBatch.length > 0 && applyBatch[0].uri != null) {
                j = Long.parseLong(applyBatch[0].uri.getLastPathSegment());
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        synchronized (this.observerLock) {
            this.ignoreChanges = false;
        }
        return j;
    }

    private void applyContactToPhoneBook(ArrayList<ContentProviderOperation> arrayList, TLRPC$User tLRPC$User) {
        String str;
        if (tLRPC$User == null) {
            return;
        }
        int size = arrayList.size();
        ContentProviderOperation.Builder newInsert = ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI);
        newInsert.withValue("account_name", this.systemAccount.name);
        newInsert.withValue("account_type", this.systemAccount.type);
        newInsert.withValue("sync1", TextUtils.isEmpty(tLRPC$User.phone) ? "" : tLRPC$User.phone);
        newInsert.withValue("sync2", Long.valueOf(tLRPC$User.id));
        arrayList.add(newInsert.build());
        ContentProviderOperation.Builder newInsert2 = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
        newInsert2.withValueBackReference("raw_contact_id", size);
        newInsert2.withValue("mimetype", "vnd.android.cursor.item/name");
        newInsert2.withValue("data2", tLRPC$User.first_name);
        newInsert2.withValue("data3", tLRPC$User.last_name);
        arrayList.add(newInsert2.build());
        if (TextUtils.isEmpty(tLRPC$User.phone)) {
            str = formatName(tLRPC$User.first_name, tLRPC$User.last_name);
        } else {
            str = "+" + tLRPC$User.phone;
        }
        ContentProviderOperation.Builder newInsert3 = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
        newInsert3.withValueBackReference("raw_contact_id", size);
        newInsert3.withValue("mimetype", "vnd.android.cursor.item/vnd.org.telegram.messenger.android.profile");
        newInsert3.withValue("data1", Long.valueOf(tLRPC$User.id));
        newInsert3.withValue("data2", "Telegram Profile");
        newInsert3.withValue("data3", LocaleController.formatString("ContactShortcutMessage", R.string.ContactShortcutMessage, str));
        newInsert3.withValue("data4", Long.valueOf(tLRPC$User.id));
        arrayList.add(newInsert3.build());
        ContentProviderOperation.Builder newInsert4 = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
        newInsert4.withValueBackReference("raw_contact_id", size);
        newInsert4.withValue("mimetype", "vnd.android.cursor.item/vnd.org.telegram.messenger.android.call");
        newInsert4.withValue("data1", Long.valueOf(tLRPC$User.id));
        newInsert4.withValue("data2", "Telegram Voice Call");
        newInsert4.withValue("data3", LocaleController.formatString("ContactShortcutVoiceCall", R.string.ContactShortcutVoiceCall, str));
        newInsert4.withValue("data4", Long.valueOf(tLRPC$User.id));
        arrayList.add(newInsert4.build());
        ContentProviderOperation.Builder newInsert5 = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
        newInsert5.withValueBackReference("raw_contact_id", size);
        newInsert5.withValue("mimetype", "vnd.android.cursor.item/vnd.org.telegram.messenger.android.call.video");
        newInsert5.withValue("data1", Long.valueOf(tLRPC$User.id));
        newInsert5.withValue("data2", "Telegram Video Call");
        newInsert5.withValue("data3", LocaleController.formatString("ContactShortcutVideoCall", R.string.ContactShortcutVideoCall, str));
        newInsert5.withValue("data4", Long.valueOf(tLRPC$User.id));
        arrayList.add(newInsert5.build());
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

    public void markAsContacted(final String str) {
        if (str == null) {
            return;
        }
        Utilities.phoneBookQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                ContactsController.lambda$markAsContacted$48(str);
            }
        });
    }

    public static void lambda$markAsContacted$48(String str) {
        Uri parse = Uri.parse(str);
        ContentValues contentValues = new ContentValues();
        contentValues.put("last_time_contacted", Long.valueOf(System.currentTimeMillis()));
        ApplicationLoader.applicationContext.getContentResolver().update(parse, contentValues, null, null);
    }

    public void addContact(final TLRPC$User tLRPC$User, boolean z) {
        if (tLRPC$User == null) {
            return;
        }
        TLRPC$TL_contacts_addContact tLRPC$TL_contacts_addContact = new TLRPC$TL_contacts_addContact();
        tLRPC$TL_contacts_addContact.id = getMessagesController().getInputUser(tLRPC$User);
        tLRPC$TL_contacts_addContact.first_name = tLRPC$User.first_name;
        tLRPC$TL_contacts_addContact.last_name = tLRPC$User.last_name;
        String str = tLRPC$User.phone;
        tLRPC$TL_contacts_addContact.phone = str;
        tLRPC$TL_contacts_addContact.add_phone_privacy_exception = z;
        if (str == null) {
            tLRPC$TL_contacts_addContact.phone = "";
        } else if (str.length() > 0 && !tLRPC$TL_contacts_addContact.phone.startsWith("+")) {
            tLRPC$TL_contacts_addContact.phone = "+" + tLRPC$TL_contacts_addContact.phone;
        }
        getConnectionsManager().sendRequest(tLRPC$TL_contacts_addContact, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                ContactsController.this.lambda$addContact$51(tLRPC$User, tLObject, tLRPC$TL_error);
            }
        }, 6);
    }

    public void lambda$addContact$51(final TLRPC$User tLRPC$User, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        int indexOf;
        if (tLRPC$TL_error != null) {
            return;
        }
        final TLRPC$Updates tLRPC$Updates = (TLRPC$Updates) tLObject;
        TLRPC$UserProfilePhoto tLRPC$UserProfilePhoto = tLRPC$User.photo;
        if (tLRPC$UserProfilePhoto != null && tLRPC$UserProfilePhoto.personal) {
            for (int i = 0; i < tLRPC$Updates.users.size(); i++) {
                if (tLRPC$Updates.users.get(i).id == tLRPC$User.id) {
                    tLRPC$Updates.users.get(i).photo = tLRPC$User.photo;
                }
            }
        }
        getMessagesController().processUpdates(tLRPC$Updates, false);
        for (int i2 = 0; i2 < tLRPC$Updates.users.size(); i2++) {
            final TLRPC$User tLRPC$User2 = tLRPC$Updates.users.get(i2);
            if (tLRPC$User2.id == tLRPC$User.id) {
                Utilities.phoneBookQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        ContactsController.this.lambda$addContact$49(tLRPC$User2);
                    }
                });
                TLRPC$TL_contact tLRPC$TL_contact = new TLRPC$TL_contact();
                tLRPC$TL_contact.user_id = tLRPC$User2.id;
                ArrayList<TLRPC$TL_contact> arrayList = new ArrayList<>();
                arrayList.add(tLRPC$TL_contact);
                getMessagesStorage().putContacts(arrayList, false);
                if (!TextUtils.isEmpty(tLRPC$User2.phone)) {
                    formatName(tLRPC$User2.first_name, tLRPC$User2.last_name);
                    getMessagesStorage().applyPhoneBookUpdates(tLRPC$User2.phone, "");
                    Contact contact = this.contactsBookSPhones.get(tLRPC$User2.phone);
                    if (contact != null && (indexOf = contact.shortPhones.indexOf(tLRPC$User2.phone)) != -1) {
                        contact.phoneDeleted.set(indexOf, 0);
                    }
                }
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ContactsController.this.lambda$addContact$50(tLRPC$Updates, tLRPC$User);
            }
        });
    }

    public void lambda$addContact$49(TLRPC$User tLRPC$User) {
        addContactToPhoneBook(tLRPC$User, true);
    }

    public void lambda$addContact$50(TLRPC$Updates tLRPC$Updates, TLRPC$User tLRPC$User) {
        Contact contact;
        boolean z = false;
        for (int i = 0; i < tLRPC$Updates.users.size(); i++) {
            TLRPC$User tLRPC$User2 = tLRPC$Updates.users.get(i);
            if (tLRPC$User2.contact && (contact = this.contactsBookSPhones.get(tLRPC$User2.phone)) != null) {
                String letter = contact.getLetter();
                String letter2 = Contact.getLetter(tLRPC$User.first_name, tLRPC$User.last_name);
                if (contact.user == null) {
                    contact.user = tLRPC$User;
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
            if (tLRPC$User2.contact && this.contactsDict.get(Long.valueOf(tLRPC$User2.id)) == null) {
                TLRPC$TL_contact tLRPC$TL_contact = new TLRPC$TL_contact();
                tLRPC$TL_contact.user_id = tLRPC$User2.id;
                this.contacts.add(tLRPC$TL_contact);
                this.contactsDict.put(Long.valueOf(tLRPC$TL_contact.user_id), tLRPC$TL_contact);
            }
        }
        buildContactsSectionsArrays(true);
        if (z) {
            mergePhonebookAndTelegramContacts(this.phoneBookSectionsDict, this.phoneBookSectionsArray, this.phoneBookByShortPhones, false);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsDidLoad, new Object[0]);
    }

    public void deleteContactsUndoable(Context context, BaseFragment baseFragment, final ArrayList<TLRPC$User> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        final HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            TLRPC$User tLRPC$User = arrayList.get(i);
            TLRPC$TL_contact tLRPC$TL_contact = this.contactsDict.get(Long.valueOf(tLRPC$User.id));
            tLRPC$User.contact = false;
            this.contacts.remove(tLRPC$TL_contact);
            this.contactsDict.remove(Long.valueOf(tLRPC$User.id));
            hashMap.put(tLRPC$User, tLRPC$TL_contact);
        }
        buildContactsSectionsArrays(false);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsDidLoad, new Object[0]);
        Bulletin.SimpleLayout simpleLayout = new Bulletin.SimpleLayout(context, baseFragment.getResourceProvider());
        simpleLayout.setTimer();
        simpleLayout.textView.setText(LocaleController.formatPluralString("ContactsDeletedUndo", hashMap.size(), new Object[0]));
        Bulletin.UndoButton undoButton = new Bulletin.UndoButton(context, true, true, baseFragment.getResourceProvider());
        undoButton.setUndoAction(new Runnable() {
            @Override
            public final void run() {
                ContactsController.this.lambda$deleteContactsUndoable$52(hashMap);
            }
        });
        undoButton.setDelayedAction(new Runnable() {
            @Override
            public final void run() {
                ContactsController.this.lambda$deleteContactsUndoable$53(arrayList);
            }
        });
        simpleLayout.setButton(undoButton);
        Bulletin.make(baseFragment, simpleLayout, 5000).show();
    }

    public void lambda$deleteContactsUndoable$52(HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            TLRPC$User tLRPC$User = (TLRPC$User) entry.getKey();
            TLRPC$TL_contact tLRPC$TL_contact = (TLRPC$TL_contact) entry.getValue();
            tLRPC$User.contact = true;
            this.contacts.add(tLRPC$TL_contact);
            this.contactsDict.put(Long.valueOf(tLRPC$User.id), tLRPC$TL_contact);
        }
        buildContactsSectionsArrays(true);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsDidLoad, new Object[0]);
    }

    public void lambda$deleteContactsUndoable$53(ArrayList arrayList) {
        deleteContact(arrayList, false);
    }

    public void deleteContact(final ArrayList<TLRPC$User> arrayList, final boolean z) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        TLRPC$TL_contacts_deleteContacts tLRPC$TL_contacts_deleteContacts = new TLRPC$TL_contacts_deleteContacts();
        final ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            TLRPC$User tLRPC$User = arrayList.get(i);
            getMessagesController().getStoriesController().removeContact(tLRPC$User.id);
            TLRPC$InputUser inputUser = getMessagesController().getInputUser(tLRPC$User);
            if (inputUser != null) {
                tLRPC$User.contact = false;
                arrayList2.add(Long.valueOf(tLRPC$User.id));
                tLRPC$TL_contacts_deleteContacts.id.add(inputUser);
            }
        }
        final String str = arrayList.get(0).first_name;
        getConnectionsManager().sendRequest(tLRPC$TL_contacts_deleteContacts, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                ContactsController.this.lambda$deleteContact$56(arrayList2, arrayList, z, str, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$deleteContact$56(ArrayList arrayList, final ArrayList arrayList2, final boolean z, final String str, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        int indexOf;
        if (tLRPC$TL_error != null) {
            return;
        }
        getMessagesController().processUpdates((TLRPC$Updates) tLObject, false);
        getMessagesStorage().deleteContacts(arrayList);
        Utilities.phoneBookQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                ContactsController.this.lambda$deleteContact$54(arrayList2);
            }
        });
        for (int i = 0; i < arrayList2.size(); i++) {
            TLRPC$User tLRPC$User = (TLRPC$User) arrayList2.get(i);
            if (!TextUtils.isEmpty(tLRPC$User.phone)) {
                getMessagesStorage().applyPhoneBookUpdates(tLRPC$User.phone, "");
                Contact contact = this.contactsBookSPhones.get(tLRPC$User.phone);
                if (contact != null && (indexOf = contact.shortPhones.indexOf(tLRPC$User.phone)) != -1) {
                    contact.phoneDeleted.set(indexOf, 1);
                }
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ContactsController.this.lambda$deleteContact$55(arrayList2, z, str);
            }
        });
    }

    public void lambda$deleteContact$54(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            deleteContactFromPhoneBook(((TLRPC$User) it.next()).id);
        }
    }

    public void lambda$deleteContact$55(ArrayList arrayList, boolean z, String str) {
        Iterator it = arrayList.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            TLRPC$User tLRPC$User = (TLRPC$User) it.next();
            TLRPC$TL_contact tLRPC$TL_contact = this.contactsDict.get(Long.valueOf(tLRPC$User.id));
            if (tLRPC$TL_contact != null) {
                this.contacts.remove(tLRPC$TL_contact);
                this.contactsDict.remove(Long.valueOf(tLRPC$User.id));
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
        final SharedPreferences.Editor edit = MessagesController.getMainSettings(this.currentAccount).edit();
        edit.putBoolean("needGetStatuses", true).commit();
        getConnectionsManager().sendRequest(new TLObject() {
            @Override
            public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
                TLRPC$Vector tLRPC$Vector = new TLRPC$Vector();
                int readInt32 = abstractSerializedData.readInt32(z);
                for (int i2 = 0; i2 < readInt32; i2++) {
                    TLRPC$TL_contactStatus TLdeserialize = TLRPC$TL_contactStatus.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                    if (TLdeserialize == null) {
                        return tLRPC$Vector;
                    }
                    tLRPC$Vector.objects.add(TLdeserialize);
                }
                return tLRPC$Vector;
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                abstractSerializedData.writeInt32(-995929106);
            }
        }, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                ContactsController.this.lambda$reloadContactsStatuses$58(edit, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$reloadContactsStatuses$58(final SharedPreferences.Editor editor, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ContactsController.this.lambda$reloadContactsStatuses$57(editor, tLObject);
                }
            });
        }
    }

    public void lambda$reloadContactsStatuses$57(SharedPreferences.Editor editor, TLObject tLObject) {
        editor.remove("needGetStatuses").commit();
        TLRPC$Vector tLRPC$Vector = (TLRPC$Vector) tLObject;
        if (!tLRPC$Vector.objects.isEmpty()) {
            ArrayList<TLRPC$User> arrayList = new ArrayList<>();
            Iterator<Object> it = tLRPC$Vector.objects.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                TLRPC$TL_user tLRPC$TL_user = new TLRPC$TL_user();
                TLRPC$TL_contactStatus tLRPC$TL_contactStatus = (TLRPC$TL_contactStatus) next;
                if (tLRPC$TL_contactStatus != null) {
                    TLRPC$UserStatus tLRPC$UserStatus = tLRPC$TL_contactStatus.status;
                    if (tLRPC$UserStatus instanceof TLRPC$TL_userStatusRecently) {
                        tLRPC$UserStatus.expires = tLRPC$UserStatus.by_me ? -1000 : -100;
                    } else if (tLRPC$UserStatus instanceof TLRPC$TL_userStatusLastWeek) {
                        tLRPC$UserStatus.expires = tLRPC$UserStatus.by_me ? -1001 : -101;
                    } else if (tLRPC$UserStatus instanceof TLRPC$TL_userStatusLastMonth) {
                        tLRPC$UserStatus.expires = tLRPC$UserStatus.by_me ? -1002 : -102;
                    }
                    TLRPC$User user = getMessagesController().getUser(Long.valueOf(tLRPC$TL_contactStatus.user_id));
                    if (user != null) {
                        user.status = tLRPC$TL_contactStatus.status;
                    }
                    tLRPC$TL_user.status = tLRPC$TL_contactStatus.status;
                    arrayList.add(tLRPC$TL_user);
                }
            }
            getMessagesStorage().updateUsers(arrayList, true, true, true);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_STATUS));
    }

    public void loadGlobalPrivacySetting() {
        if (this.loadingGlobalSettings == 0) {
            this.loadingGlobalSettings = 1;
            getConnectionsManager().sendRequest(new TLObject() {
                @Override
                public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
                    return TLRPC$TL_globalPrivacySettings.TLdeserialize(abstractSerializedData, i, z);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                    abstractSerializedData.writeInt32(-349483786);
                }
            }, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    ContactsController.this.lambda$loadGlobalPrivacySetting$60(tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$loadGlobalPrivacySetting$60(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ContactsController.this.lambda$loadGlobalPrivacySetting$59(tLRPC$TL_error, tLObject);
            }
        });
    }

    public void lambda$loadGlobalPrivacySetting$59(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        if (tLRPC$TL_error == null) {
            this.globalPrivacySettings = (TLRPC$TL_globalPrivacySettings) tLObject;
            this.loadingGlobalSettings = 2;
        } else {
            this.loadingGlobalSettings = 0;
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.privacyRulesUpdated, new Object[0]);
    }

    public void loadPrivacySettings() {
        if (this.loadingDeleteInfo == 0) {
            this.loadingDeleteInfo = 1;
            getConnectionsManager().sendRequest(new TLObject() {
                @Override
                public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
                    return TLRPC$TL_accountDaysTTL.TLdeserialize(abstractSerializedData, i, z);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                    abstractSerializedData.writeInt32(150761757);
                }
            }, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    ContactsController.this.lambda$loadPrivacySettings$62(tLObject, tLRPC$TL_error);
                }
            });
        }
        loadGlobalPrivacySetting();
        final int i = 0;
        while (true) {
            int[] iArr = this.loadingPrivacyInfo;
            if (i < iArr.length) {
                if (iArr[i] == 0) {
                    iArr[i] = 1;
                    TLRPC$TL_account_getPrivacy tLRPC$TL_account_getPrivacy = new TLRPC$TL_account_getPrivacy();
                    switch (i) {
                        case 0:
                            tLRPC$TL_account_getPrivacy.key = new TLRPC$TL_inputPrivacyKeyStatusTimestamp();
                            break;
                        case 1:
                            tLRPC$TL_account_getPrivacy.key = new TLRPC$TL_inputPrivacyKeyChatInvite();
                            break;
                        case 2:
                            tLRPC$TL_account_getPrivacy.key = new TLRPC$TL_inputPrivacyKeyPhoneCall();
                            break;
                        case 3:
                            tLRPC$TL_account_getPrivacy.key = new TLRPC$TL_inputPrivacyKeyPhoneP2P();
                            break;
                        case 4:
                            tLRPC$TL_account_getPrivacy.key = new TLRPC$TL_inputPrivacyKeyProfilePhoto();
                            break;
                        case 5:
                            tLRPC$TL_account_getPrivacy.key = new TLRPC$TL_inputPrivacyKeyForwards();
                            break;
                        case 6:
                            tLRPC$TL_account_getPrivacy.key = new TLRPC$TL_inputPrivacyKeyPhoneNumber();
                            break;
                        case 7:
                            tLRPC$TL_account_getPrivacy.key = new TLRPC$TL_inputPrivacyKeyAddedByPhone();
                            break;
                        case 8:
                            tLRPC$TL_account_getPrivacy.key = new TLRPC$TL_inputPrivacyKeyVoiceMessages();
                            break;
                        case 9:
                            tLRPC$TL_account_getPrivacy.key = new TLRPC$TL_inputPrivacyKeyAbout();
                            break;
                        case 11:
                            tLRPC$TL_account_getPrivacy.key = new TLRPC$TL_inputPrivacyKeyBirthday();
                            break;
                    }
                    getConnectionsManager().sendRequest(tLRPC$TL_account_getPrivacy, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            ContactsController.this.lambda$loadPrivacySettings$64(i, tLObject, tLRPC$TL_error);
                        }
                    });
                }
                i++;
            } else {
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.privacyRulesUpdated, new Object[0]);
                return;
            }
        }
    }

    public void lambda$loadPrivacySettings$62(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ContactsController.this.lambda$loadPrivacySettings$61(tLRPC$TL_error, tLObject);
            }
        });
    }

    public void lambda$loadPrivacySettings$61(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        if (tLRPC$TL_error == null) {
            this.deleteAccountTTL = ((TLRPC$TL_accountDaysTTL) tLObject).days;
            this.loadingDeleteInfo = 2;
        } else {
            this.loadingDeleteInfo = 0;
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.privacyRulesUpdated, new Object[0]);
    }

    public void lambda$loadPrivacySettings$64(final int i, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ContactsController.this.lambda$loadPrivacySettings$63(tLRPC$TL_error, tLObject, i);
            }
        });
    }

    public void lambda$loadPrivacySettings$63(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject, int i) {
        if (tLRPC$TL_error == null) {
            TLRPC$TL_account_privacyRules tLRPC$TL_account_privacyRules = (TLRPC$TL_account_privacyRules) tLObject;
            getMessagesController().putUsers(tLRPC$TL_account_privacyRules.users, false);
            getMessagesController().putChats(tLRPC$TL_account_privacyRules.chats, false);
            switch (i) {
                case 0:
                    this.lastseenPrivacyRules = tLRPC$TL_account_privacyRules.rules;
                    break;
                case 1:
                    this.groupPrivacyRules = tLRPC$TL_account_privacyRules.rules;
                    break;
                case 2:
                    this.callPrivacyRules = tLRPC$TL_account_privacyRules.rules;
                    break;
                case 3:
                    this.p2pPrivacyRules = tLRPC$TL_account_privacyRules.rules;
                    break;
                case 4:
                    this.profilePhotoPrivacyRules = tLRPC$TL_account_privacyRules.rules;
                    break;
                case 5:
                    this.forwardsPrivacyRules = tLRPC$TL_account_privacyRules.rules;
                    break;
                case 6:
                    this.phonePrivacyRules = tLRPC$TL_account_privacyRules.rules;
                    break;
                case 7:
                case 10:
                default:
                    this.addedByPhonePrivacyRules = tLRPC$TL_account_privacyRules.rules;
                    break;
                case 8:
                    this.voiceMessagesRules = tLRPC$TL_account_privacyRules.rules;
                    break;
                case 9:
                    this.bioPrivacyRules = tLRPC$TL_account_privacyRules.rules;
                    break;
                case 11:
                    this.birthdayPrivacyRules = tLRPC$TL_account_privacyRules.rules;
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

    public TLRPC$TL_globalPrivacySettings getGlobalPrivacySettings() {
        return this.globalPrivacySettings;
    }

    public ArrayList<TLRPC$PrivacyRule> getPrivacyRules(int i) {
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
        }
    }

    public void setPrivacyRules(ArrayList<TLRPC$PrivacyRule> arrayList, int i) {
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
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.privacyRulesUpdated, new Object[0]);
        reloadContactsStatuses();
    }

    public void createOrUpdateConnectionServiceContact(long j, String str, String str2) {
        String str3;
        String str4;
        int parseInt;
        Cursor cursor;
        ArrayList<ContentProviderOperation> arrayList;
        if (hasContactsPermission()) {
            try {
                ContentResolver contentResolver = ApplicationLoader.applicationContext.getContentResolver();
                ArrayList<ContentProviderOperation> arrayList2 = new ArrayList<>();
                Uri build = ContactsContract.Groups.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").build();
                Uri build2 = ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").build();
                Account account = this.systemAccount;
                Cursor query = contentResolver.query(build, new String[]{"_id"}, "title=? AND account_type=? AND account_name=?", new String[]{"TelegramConnectionService", account.type, account.name}, null);
                if (query != null && query.moveToFirst()) {
                    parseInt = query.getInt(0);
                    str4 = "account_name";
                    str3 = "account_type";
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("account_type", this.systemAccount.type);
                    contentValues.put("account_name", this.systemAccount.name);
                    str3 = "account_type";
                    contentValues.put("group_visible", (Integer) 0);
                    str4 = "account_name";
                    contentValues.put("group_is_read_only", (Integer) 1);
                    contentValues.put("title", "TelegramConnectionService");
                    parseInt = Integer.parseInt(contentResolver.insert(build, contentValues).getLastPathSegment());
                }
                if (query != null) {
                    query.close();
                }
                String str5 = str3;
                Cursor query2 = contentResolver.query(ContactsContract.Data.CONTENT_URI, new String[]{"raw_contact_id"}, "mimetype=? AND data1=?", new String[]{"vnd.android.cursor.item/group_membership", parseInt + ""}, null);
                int size = arrayList2.size();
                int i = parseInt;
                if (query2 != null && query2.moveToFirst()) {
                    int i2 = query2.getInt(0);
                    cursor = query2;
                    arrayList = arrayList2;
                    arrayList.add(ContentProviderOperation.newUpdate(build2).withSelection("_id=?", new String[]{i2 + ""}).withValue("deleted", 0).build());
                    arrayList.add(ContentProviderOperation.newUpdate(ContactsContract.Data.CONTENT_URI).withSelection("raw_contact_id=? AND mimetype=?", new String[]{i2 + "", "vnd.android.cursor.item/phone_v2"}).withValue("data1", "+99084" + j).build());
                    arrayList.add(ContentProviderOperation.newUpdate(ContactsContract.Data.CONTENT_URI).withSelection("raw_contact_id=? AND mimetype=?", new String[]{i2 + "", "vnd.android.cursor.item/name"}).withValue("data2", str).withValue("data3", str2).build());
                } else {
                    cursor = query2;
                    arrayList = arrayList2;
                    arrayList.add(ContentProviderOperation.newInsert(build2).withValue(str5, this.systemAccount.type).withValue(str4, this.systemAccount.name).withValue("raw_contact_is_read_only", 1).withValue("aggregation_mode", 3).build());
                    arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/name").withValue("data2", str).withValue("data3", str2).build());
                    arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("data1", "+99084" + j).build());
                    arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/group_membership").withValue("data1", Integer.valueOf(i)).build());
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
                Cursor query = contentResolver.query(ContactsContract.Groups.CONTENT_URI, new String[]{"_id"}, "title=? AND account_type=? AND account_name=?", new String[]{"TelegramConnectionService", account.type, account.name}, null);
                if (query == null || !query.moveToFirst()) {
                    if (query != null) {
                        query.close();
                        return;
                    }
                    return;
                }
                int i = query.getInt(0);
                query.close();
                Cursor query2 = contentResolver.query(ContactsContract.Data.CONTENT_URI, new String[]{"raw_contact_id"}, "mimetype=? AND data1=?", new String[]{"vnd.android.cursor.item/group_membership", i + ""}, null);
                if (query2 == null || !query2.moveToFirst()) {
                    if (query2 != null) {
                        query2.close();
                        return;
                    }
                    return;
                }
                int i2 = query2.getInt(0);
                query2.close();
                contentResolver.delete(ContactsContract.RawContacts.CONTENT_URI, "_id=?", new String[]{i2 + ""});
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static String formatName(TLObject tLObject) {
        if (tLObject instanceof TLRPC$User) {
            return formatName((TLRPC$User) tLObject);
        }
        if (tLObject instanceof TLRPC$Chat) {
            return ((TLRPC$Chat) tLObject).title;
        }
        return LocaleController.getString(R.string.HiddenName);
    }

    public static String formatName(TLRPC$User tLRPC$User) {
        return tLRPC$User == null ? "" : formatName(tLRPC$User.first_name, tLRPC$User.last_name, 0);
    }

    public static String formatName(String str, String str2) {
        return formatName(str, str2, 0);
    }

    public static String formatName(String str, String str2, int i) {
        if (str != null) {
            str = str.trim();
        }
        if (str != null && str2 == null && i > 0 && str.contains(" ")) {
            int indexOf = str.indexOf(" ");
            String substring = str.substring(indexOf + 1);
            str = str.substring(0, indexOf);
            str2 = substring;
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

    public class PhoneBookContact {
        String id;
        String lookup_key;
        String name;
        String phone;

        private PhoneBookContact() {
        }
    }
}
