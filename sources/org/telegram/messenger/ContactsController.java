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
import android.database.DatabaseUtils;
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.Bulletin;

public class ContactsController extends BaseController {
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
    private HashMap<String, String> sectionsToReplace;
    public ArrayList<String> sortedUsersMutualSectionsArray;
    public ArrayList<String> sortedUsersSectionsArray;
    private Account systemAccount;
    private boolean updatingInviteLink;
    public HashMap<String, ArrayList<TLRPC.TL_contact>> usersMutualSectionsDict;
    public HashMap<String, ArrayList<TLRPC.TL_contact>> usersSectionsDict;
    private ArrayList<TLRPC.PrivacyRule> voiceMessagesRules;
    private static final String[] projectionPhones = {"lookup", "data1", "data2", "data3", "display_name", "account_type"};
    private static final String[] projectionNames = {"lookup", "data2", "data3", "data5"};
    private static volatile ContactsController[] Instance = new ContactsController[4];

    public static void $r8$lambda$3kLSExHkbpEOZRcpxnKH3hiSKQ8(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    class MyContentObserver extends ContentObserver {
        private Runnable checkRunnable;

        @Override
        public boolean deliverSelfNotifications() {
            return false;
        }

        public static void m419$r8$lambda$V7bWM39F88C9Ch7Xl0TeFehTo() {
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
                    ContactsController.MyContentObserver.m419$r8$lambda$V7bWM39F88C9Ch7Xl0TeFehTo();
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
        ContactsController contactsController;
        ContactsController contactsController2 = Instance[i];
        if (contactsController2 != null) {
            return contactsController2;
        }
        synchronized (ContactsController.class) {
            try {
                contactsController = Instance[i];
                if (contactsController == null) {
                    ContactsController[] contactsControllerArr = Instance;
                    ContactsController contactsController3 = new ContactsController(i);
                    contactsControllerArr[i] = contactsController3;
                    contactsController = contactsController3;
                }
            } catch (Throwable th) {
                throw th;
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
                    ContactsController.m398$r8$lambda$8jMKxJf3mScD6YkmPu1qP_3Cl0(this.f$0);
                }
            });
        }
    }

    public static void m398$r8$lambda$8jMKxJf3mScD6YkmPu1qP_3Cl0(ContactsController contactsController) {
        contactsController.getClass();
        try {
            if (hasContactsPermission()) {
                ApplicationLoader.applicationContext.getContentResolver().registerContentObserver(ContactsContract.Contacts.CONTENT_URI, true, contactsController.new MyContentObserver());
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
                ContactsController.$r8$lambda$RvD7m1Lqbu3pJ52kag06cGx0DCk(this.f$0);
            }
        });
    }

    public static void $r8$lambda$RvD7m1Lqbu3pJ52kag06cGx0DCk(ContactsController contactsController) {
        contactsController.migratingContacts = false;
        contactsController.completedRequestsCount = 0;
    }

    public void checkInviteText() {
        SharedPreferences mainSettings = MessagesController.getMainSettings(this.currentAccount);
        this.inviteLink = mainSettings.getString("invitelink", null);
        int i = mainSettings.getInt("invitelinktime", 0);
        if (this.updatingInviteLink) {
            return;
        }
        if (this.inviteLink == null || Math.abs((System.currentTimeMillis() / 1000) - ((long) i)) >= 86400) {
            this.updatingInviteLink = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_help_getInviteText(), new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    ContactsController.m396$r8$lambda$6gFBbEOGWiS1BEcHnDTkEJg27c(this.f$0, tLObject, tL_error);
                }
            }, 2);
        }
    }

    public static void m396$r8$lambda$6gFBbEOGWiS1BEcHnDTkEJg27c(final ContactsController contactsController, TLObject tLObject, TLRPC.TL_error tL_error) {
        contactsController.getClass();
        if (tLObject != null) {
            final TLRPC.TL_help_inviteText tL_help_inviteText = (TLRPC.TL_help_inviteText) tLObject;
            if (tL_help_inviteText.message.length() != 0) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ContactsController.$r8$lambda$gbGE8kSGuYLcNij1hZe27h2m5no(this.f$0, tL_help_inviteText);
                    }
                });
            }
        }
    }

    public static void $r8$lambda$gbGE8kSGuYLcNij1hZe27h2m5no(ContactsController contactsController, TLRPC.TL_help_inviteText tL_help_inviteText) {
        contactsController.updatingInviteLink = false;
        SharedPreferences.Editor editorEdit = MessagesController.getMainSettings(contactsController.currentAccount).edit();
        String str = tL_help_inviteText.message;
        contactsController.inviteLink = str;
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
                ContactsController.$r8$lambda$0WhfGDS_FWEVRisgKfPDCwquNkg(this.f$0);
            }
        });
    }

    public static void $r8$lambda$0WhfGDS_FWEVRisgKfPDCwquNkg(ContactsController contactsController) {
        contactsController.getClass();
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
                                if (i2 != contactsController.currentAccount) {
                                    break;
                                }
                                contactsController.systemAccount = account;
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
        } catch (Throwable unused2) {
        }
        if (contactsController.getUserConfig().isClientActivated()) {
            contactsController.readContacts();
            if (contactsController.systemAccount == null) {
                try {
                    Account account2 = new Account("" + contactsController.getUserConfig().getClientUserId(), "org.telegram.messenger");
                    contactsController.systemAccount = account2;
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
                ContactsController.$r8$lambda$JD0QTcTwrePLuZBLBqJTsA_UUlE(this.f$0);
            }
        });
    }

    public static void $r8$lambda$JD0QTcTwrePLuZBLBqJTsA_UUlE(ContactsController contactsController) {
        if (contactsController.checkContactsInternal()) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("detected contacts change");
            }
            contactsController.performSyncPhoneBook(contactsController.getContactsCopy(contactsController.contactsBook), true, false, true, false, true, false);
        }
    }

    public void forceImportContacts() {
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                ContactsController.m393$r8$lambda$R8puVEywPYPkoEGanSWoebVLU(this.f$0);
            }
        });
    }

    public static void m393$r8$lambda$R8puVEywPYPkoEGanSWoebVLU(ContactsController contactsController) {
        contactsController.getClass();
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("force import contacts");
        }
        contactsController.performSyncPhoneBook(new HashMap<>(), true, true, true, true, false, false);
    }

    public void syncPhoneBookByAlert(final HashMap<String, Contact> map, final boolean z, final boolean z2, final boolean z3) {
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                ContactsController.$r8$lambda$Jt_CbNVdKSONOojBLeQwKn72WRE(this.f$0, map, z, z2, z3);
            }
        });
    }

    public static void $r8$lambda$Jt_CbNVdKSONOojBLeQwKn72WRE(ContactsController contactsController, HashMap map, boolean z, boolean z2, boolean z3) {
        contactsController.getClass();
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("sync contacts by alert");
        }
        contactsController.performSyncPhoneBook(map, true, z, z2, false, false, z3);
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
                ContactsController.$r8$lambda$UfrECPt0A9K3H_GC3VoIJ624X0s(this.f$0, runnable, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$UfrECPt0A9K3H_GC3VoIJ624X0s(final ContactsController contactsController, final Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            contactsController.getClass();
            AndroidUtilities.runOnUIThread(runnable);
            return;
        }
        contactsController.contactsBookSPhones.clear();
        contactsController.contactsBook.clear();
        contactsController.completedRequestsCount = 0;
        contactsController.migratingContacts = false;
        contactsController.contactsSyncInProgress = false;
        contactsController.contactsLoaded = false;
        contactsController.loadingContacts = false;
        contactsController.contactsBookLoaded = false;
        contactsController.lastContactsVersions = "";
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ContactsController.m416$r8$lambda$o0_Qsu1nB13fJl_DmqNKBeCBxk(this.f$0, runnable);
            }
        });
    }

    public static void m416$r8$lambda$o0_Qsu1nB13fJl_DmqNKBeCBxk(ContactsController contactsController, Runnable runnable) {
        contactsController.getClass();
        AccountManager accountManager = AccountManager.get(ApplicationLoader.applicationContext);
        try {
            Account[] accountsByType = accountManager.getAccountsByType("org.telegram.messenger");
            contactsController.systemAccount = null;
            for (Account account : accountsByType) {
                for (int i = 0; i < 4; i++) {
                    TLRPC.User currentUser = UserConfig.getInstance(i).getCurrentUser();
                    if (currentUser != null) {
                        if (account.name.equals("" + currentUser.id)) {
                            accountManager.removeAccount(account, null, null);
                            break;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        try {
            Account account2 = new Account("" + contactsController.getUserConfig().getClientUserId(), "org.telegram.messenger");
            contactsController.systemAccount = account2;
            accountManager.addAccountExplicitly(account2, "", null);
        } catch (Exception unused2) {
        }
        contactsController.getMessagesStorage().putCachedPhoneBook(new HashMap<>(), false, true);
        contactsController.getMessagesStorage().putContacts(new ArrayList<>(), true);
        contactsController.phoneBookContacts.clear();
        contactsController.contacts.clear();
        contactsController.contactsDict.clear();
        contactsController.usersSectionsDict.clear();
        contactsController.usersMutualSectionsDict.clear();
        contactsController.sortedUsersSectionsArray.clear();
        contactsController.phoneBookSectionsDict.clear();
        contactsController.phoneBookSectionsArray.clear();
        contactsController.phoneBookByShortPhones.clear();
        contactsController.delayedContactsUpdate.clear();
        contactsController.sortedUsersMutualSectionsArray.clear();
        contactsController.contactsByPhone.clear();
        contactsController.contactsByShortPhone.clear();
        contactsController.getNotificationCenter().postNotificationName(NotificationCenter.contactsDidLoad, new Object[0]);
        contactsController.loadContacts(false, 0L);
        runnable.run();
    }

    public void resetImportedContacts() {
        getConnectionsManager().sendRequest(new TLRPC.TL_contacts_resetSaved(), new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ContactsController.$r8$lambda$3kLSExHkbpEOZRcpxnKH3hiSKQ8(tLObject, tL_error);
            }
        });
    }

    private boolean checkContactsInternal() throws Throwable {
        Throwable th;
        boolean z;
        boolean z2 = false;
        try {
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
                            z2 = true;
                        }
                        try {
                            this.lastContactsVersions = string;
                        } catch (Throwable th2) {
                            z = z2;
                            th = th2;
                            try {
                                try {
                                    cursorQuery.close();
                                    throw th;
                                } catch (Exception e) {
                                    e = e;
                                    z2 = z;
                                }
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                                throw th;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        z = false;
                    }
                }
                if (cursorQuery == null) {
                    return z2;
                }
                cursorQuery.close();
                return z2;
            } catch (Exception e2) {
                e = e2;
            }
            FileLog.e(e);
        } catch (Exception e3) {
            FileLog.e(e3);
        }
        return z2;
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
                        ContactsController.m400$r8$lambda$Inbq6QrnoSr15gdr4U5iOQXoYk(this.f$0);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void m400$r8$lambda$Inbq6QrnoSr15gdr4U5iOQXoYk(ContactsController contactsController) {
        if (!contactsController.contacts.isEmpty() || contactsController.contactsLoaded) {
            synchronized (contactsController.loadContactsSync) {
                contactsController.loadingContacts = false;
            }
            return;
        }
        contactsController.loadContacts(true, 0L);
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

    public HashMap<String, Contact> readContactsFromPhoneBook() {
        HashMap<String, Contact> map;
        ?? r2;
        ?? r5;
        int i;
        ContentResolver contentResolver;
        long j;
        String str;
        ?? r3;
        ContentResolver contentResolver2;
        long j2;
        String str2;
        ?? r4;
        ArrayList arrayList;
        String str3;
        ContactsController contactsController = this;
        if (!contactsController.getUserConfig().syncContacts) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("contacts sync disabled");
            }
            return new HashMap<>();
        }
        try {
            if (!hasContactsPermission()) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("app has no contacts permissions");
                }
                return new HashMap<>();
            }
            try {
                StringBuilder sb = new StringBuilder();
                ContentResolver contentResolver3 = ApplicationLoader.applicationContext.getContentResolver();
                ?? map2 = new HashMap();
                ArrayList arrayList2 = new ArrayList();
                ?? Query = contentResolver3.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, projectionPhones, null, null, null);
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String str4 = "+";
                    ?? r9 = 1;
                    if (Query != 0) {
                        try {
                            int count = Query.getCount();
                            if (count > 0) {
                                map = new HashMap<>(count);
                                i = 1;
                                while (Query.moveToNext()) {
                                    try {
                                        String string = Query.getString(r9);
                                        String string2 = Query.getString(5);
                                        if (string2 == null) {
                                            string2 = "";
                                        }
                                        boolean z = string2.indexOf(".sim") != 0;
                                        if (TextUtils.isEmpty(string)) {
                                            contentResolver2 = contentResolver3;
                                            j2 = jCurrentTimeMillis;
                                            contentResolver3 = contentResolver2;
                                            jCurrentTimeMillis = j2;
                                        } else {
                                            ?? StripExceptNumbers = PhoneFormat.stripExceptNumbers(string, r9);
                                            if (TextUtils.isEmpty(StripExceptNumbers)) {
                                                contentResolver2 = contentResolver3;
                                                j2 = jCurrentTimeMillis;
                                                contentResolver3 = contentResolver2;
                                                jCurrentTimeMillis = j2;
                                            } else {
                                                ?? Substring = StripExceptNumbers.startsWith(str4) ? StripExceptNumbers.substring(r9) : StripExceptNumbers;
                                                contentResolver2 = contentResolver3;
                                                j2 = jCurrentTimeMillis;
                                                String string3 = Query.getString(0);
                                                sb.setLength(0);
                                                DatabaseUtils.appendEscapedSQLString(sb, string3);
                                                String string4 = sb.toString();
                                                Contact contact = (Contact) map2.get(Substring);
                                                if (contact != null) {
                                                    if (!contact.isGoodProvider && !string2.equals(contact.provider)) {
                                                        sb.setLength(0);
                                                        DatabaseUtils.appendEscapedSQLString(sb, contact.key);
                                                        arrayList2.remove(sb.toString());
                                                        arrayList2.add(string4);
                                                        contact.key = string3;
                                                        contact.isGoodProvider = z;
                                                        contact.provider = string2;
                                                    }
                                                    contentResolver3 = contentResolver2;
                                                    jCurrentTimeMillis = j2;
                                                } else {
                                                    if (!arrayList2.contains(string4)) {
                                                        arrayList2.add(string4);
                                                    }
                                                    int i2 = Query.getInt(2);
                                                    Contact contact2 = map.get(string3);
                                                    if (contact2 == null) {
                                                        contact2 = new Contact();
                                                        String string5 = Query.getString(4);
                                                        String strTrim = string5 == null ? "" : string5.trim();
                                                        if (contactsController.isNotValidNameString(strTrim)) {
                                                            contact2.first_name = strTrim;
                                                            contact2.last_name = "";
                                                            str2 = str4;
                                                        } else {
                                                            str2 = str4;
                                                            int iLastIndexOf = strTrim.lastIndexOf(32);
                                                            if (iLastIndexOf != -1) {
                                                                contact2.first_name = strTrim.substring(0, iLastIndexOf).trim();
                                                                contact2.last_name = strTrim.substring(iLastIndexOf + 1).trim();
                                                            } else {
                                                                contact2.first_name = strTrim;
                                                                contact2.last_name = "";
                                                            }
                                                        }
                                                        contact2.provider = string2;
                                                        contact2.isGoodProvider = z;
                                                        contact2.key = string3;
                                                        contact2.contact_id = i;
                                                        map.put(string3, contact2);
                                                        i++;
                                                    } else {
                                                        str2 = str4;
                                                    }
                                                    contact2.shortPhones.add((String) Substring);
                                                    contact2.phones.add((String) StripExceptNumbers);
                                                    contact2.phoneDeleted.add(0);
                                                    if (i2 == 0) {
                                                        String string6 = Query.getString(3);
                                                        ArrayList<String> arrayList3 = contact2.phoneTypes;
                                                        if (string6 == null) {
                                                            string6 = LocaleController.getString(R.string.PhoneMobile);
                                                        }
                                                        arrayList3.add(string6);
                                                    } else {
                                                        if (i2 == 1) {
                                                            contact2.phoneTypes.add(LocaleController.getString(R.string.PhoneHome));
                                                        } else if (i2 == 2) {
                                                            contact2.phoneTypes.add(LocaleController.getString(R.string.PhoneMobile));
                                                        } else if (i2 == 3) {
                                                            contact2.phoneTypes.add(LocaleController.getString(R.string.PhoneWork));
                                                        } else if (i2 == 12) {
                                                            contact2.phoneTypes.add(LocaleController.getString(R.string.PhoneMain));
                                                        } else {
                                                            contact2.phoneTypes.add(LocaleController.getString(R.string.PhoneOther));
                                                        }
                                                        map2.put(Substring, contact2);
                                                        contactsController = this;
                                                        contentResolver3 = contentResolver2;
                                                        jCurrentTimeMillis = j2;
                                                        sb = sb;
                                                        str4 = str2;
                                                    }
                                                    map2.put(Substring, contact2);
                                                    contactsController = this;
                                                    contentResolver3 = contentResolver2;
                                                    jCurrentTimeMillis = j2;
                                                    sb = sb;
                                                    str4 = str2;
                                                }
                                            }
                                        }
                                        r9 = 1;
                                    } catch (Throwable th) {
                                        th = th;
                                        r5 = Query;
                                        try {
                                            FileLog.e(th);
                                            if (map != null) {
                                                map.clear();
                                            }
                                            if (r5 != 0) {
                                                r5.close();
                                            }
                                            if (map != null) {
                                                return map;
                                            }
                                            return new HashMap<>();
                                        } catch (Throwable th2) {
                                            if (r5 != 0) {
                                                try {
                                                    r5.close();
                                                    throw th2;
                                                } catch (Exception e) {
                                                    FileLog.e(e);
                                                    throw th2;
                                                }
                                            }
                                            throw th2;
                                        }
                                    }
                                }
                            } else {
                                i = 1;
                                map = null;
                            }
                            contentResolver = contentResolver3;
                            j = jCurrentTimeMillis;
                            str = str4;
                            try {
                                Query.close();
                            } catch (Exception unused) {
                            } catch (Throwable th3) {
                                th = th3;
                                r2 = Query;
                                r5 = r2;
                                FileLog.e(th);
                                if (map != null) {
                                    map.clear();
                                }
                                if (r5 != 0) {
                                    r5.close();
                                }
                                if (map != null) {
                                    return map;
                                }
                                return new HashMap<>();
                            }
                            r3 = 0;
                        } catch (Throwable th4) {
                            th = th4;
                            map = null;
                        }
                    } else {
                        contentResolver = contentResolver3;
                        j = jCurrentTimeMillis;
                        str = "+";
                        r3 = Query;
                        i = 1;
                        map = null;
                    }
                    try {
                        String strJoin = TextUtils.join(",", arrayList2);
                        ContentResolver contentResolver4 = contentResolver;
                        Cursor cursorQuery = contentResolver4.query(ContactsContract.Data.CONTENT_URI, projectionNames, "lookup IN (" + strJoin + ") AND mimetype = 'vnd.android.cursor.item/name'", null, null);
                        if (cursorQuery != null) {
                            while (cursorQuery.moveToNext()) {
                                String string7 = cursorQuery.getString(0);
                                String string8 = cursorQuery.getString(1);
                                String string9 = cursorQuery.getString(2);
                                String string10 = cursorQuery.getString(3);
                                Contact contact3 = map != null ? map.get(string7) : null;
                                if (contact3 != null && !contact3.namesFilled) {
                                    if (contact3.isGoodProvider) {
                                        if (string8 != null) {
                                            contact3.first_name = string8;
                                        } else {
                                            contact3.first_name = "";
                                        }
                                        if (string9 != null) {
                                            contact3.last_name = string9;
                                        } else {
                                            contact3.last_name = "";
                                        }
                                        if (!TextUtils.isEmpty(string10)) {
                                            if (!TextUtils.isEmpty(contact3.first_name)) {
                                                contact3.first_name += " " + string10;
                                            } else {
                                                contact3.first_name = string10;
                                            }
                                        }
                                    } else if (isNotValidNameString(string8) || (!contact3.first_name.contains(string8) && !string8.contains(contact3.first_name))) {
                                        if (!isNotValidNameString(string9) && (contact3.last_name.contains(string9) || string8.contains(contact3.last_name))) {
                                            if (string8 != null) {
                                                contact3.first_name = string8;
                                            } else {
                                                contact3.first_name = "";
                                            }
                                            if (!TextUtils.isEmpty(string10)) {
                                                if (!TextUtils.isEmpty(contact3.first_name)) {
                                                    contact3.first_name += " " + string10;
                                                } else {
                                                    contact3.first_name = string10;
                                                }
                                            }
                                            if (string9 != null) {
                                                contact3.last_name = string9;
                                            } else {
                                                contact3.last_name = "";
                                            }
                                        }
                                    } else {
                                        if (string8 != null) {
                                            contact3.first_name = string8;
                                        } else {
                                            contact3.first_name = "";
                                        }
                                        if (!TextUtils.isEmpty(string10)) {
                                            if (!TextUtils.isEmpty(contact3.first_name)) {
                                                contact3.first_name += " " + string10;
                                            } else {
                                                contact3.first_name = string10;
                                            }
                                        }
                                        if (string9 != null) {
                                            contact3.last_name = string9;
                                        } else {
                                            contact3.last_name = "";
                                        }
                                    }
                                    try {
                                        contact3.namesFilled = true;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        r4 = cursorQuery;
                                        r2 = r4;
                                        r5 = r2;
                                        FileLog.e(th);
                                        if (map != null) {
                                            map.clear();
                                        }
                                        if (r5 != 0) {
                                            r5.close();
                                        }
                                        if (map != null) {
                                            return map;
                                        }
                                        return new HashMap<>();
                                    }
                                }
                            }
                            try {
                                cursorQuery.close();
                            } catch (Exception unused2) {
                            }
                            cursorQuery = null;
                        } else {
                            cursorQuery = cursorQuery;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("loading contacts 1 query time = ");
                        sb2.append(System.currentTimeMillis() - j);
                        sb2.append(" contactsSize = ");
                        sb2.append(map == null ? 0 : map.size());
                        FileLog.d(sb2.toString());
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        HashMap map3 = new HashMap();
                        ArrayList arrayList4 = new ArrayList();
                        Cursor cursorQuery2 = contentResolver4.query(ContactsContract.Contacts.CONTENT_URI, new String[]{"_id", "lookup", "display_name"}, "has_phone_number = ?", new String[]{"0"}, null);
                        if (cursorQuery2 != null) {
                            while (cursorQuery2.moveToNext()) {
                                PhoneBookContact phoneBookContact = new PhoneBookContact();
                                phoneBookContact.id = cursorQuery2.getString(0);
                                phoneBookContact.lookup_key = cursorQuery2.getString(1);
                                phoneBookContact.name = cursorQuery2.getString(2);
                                if (map == null || map.get(phoneBookContact.lookup_key) == null) {
                                    if (!TextUtils.isEmpty(phoneBookContact.name)) {
                                        map3.put(phoneBookContact.id, phoneBookContact);
                                        ArrayList arrayList5 = arrayList4;
                                        arrayList5.add(phoneBookContact.id);
                                        arrayList4 = arrayList5;
                                    }
                                }
                            }
                            arrayList = arrayList4;
                            cursorQuery2.close();
                        } else {
                            arrayList = arrayList4;
                        }
                        FileLog.d("loading contacts 2 query time = " + (System.currentTimeMillis() - jCurrentTimeMillis2) + " phoneBookConacts size = " + arrayList.size());
                        long jCurrentTimeMillis3 = System.currentTimeMillis();
                        if (arrayList.isEmpty()) {
                            r2 = cursorQuery;
                        } else {
                            Pattern patternCompile = Pattern.compile(".*(\\+[0-9 \\-]+).*");
                            Cursor cursorQuery3 = contentResolver4.query(ContactsContract.Data.CONTENT_URI, new String[]{"contact_id", "data1", "data2", "data3", "data4"}, "contact_id IN (" + TextUtils.join(", ", arrayList) + ")", null, null);
                            if (cursorQuery3 != null) {
                                int i3 = i;
                                HashMap<String, Contact> map4 = map;
                                while (cursorQuery3.moveToNext()) {
                                    try {
                                        PhoneBookContact phoneBookContact2 = (PhoneBookContact) map3.get(cursorQuery3.getString(0));
                                        if (phoneBookContact2 != null) {
                                            String[] strArr = {cursorQuery3.getString(1), cursorQuery3.getString(2), cursorQuery3.getString(3), cursorQuery3.getString(4)};
                                            int i4 = 0;
                                            while (true) {
                                                if (i4 < 4) {
                                                    String str5 = strArr[i4];
                                                    if (str5 != null) {
                                                        Matcher matcher = patternCompile.matcher(str5);
                                                        if (matcher.matches()) {
                                                            phoneBookContact2.phone = matcher.group(1).replace(" ", "").replace("-", "");
                                                        }
                                                        String strSubstring = phoneBookContact2.phone;
                                                        if (strSubstring != null) {
                                                            str3 = str;
                                                            if (strSubstring.startsWith(str3)) {
                                                                strSubstring = phoneBookContact2.phone.substring(1);
                                                            }
                                                            Contact contact4 = new Contact();
                                                            contact4.first_name = phoneBookContact2.name;
                                                            contact4.last_name = "";
                                                            int i5 = i3 + 1;
                                                            contact4.contact_id = i3;
                                                            contact4.key = phoneBookContact2.lookup_key;
                                                            contact4.phones.add(phoneBookContact2.phone);
                                                            contact4.shortPhones.add(strSubstring);
                                                            contact4.phoneDeleted.add(0);
                                                            contact4.phoneTypes.add(LocaleController.getString(R.string.PhoneOther));
                                                            if (map4 == null) {
                                                                map4 = new HashMap<>();
                                                            }
                                                            map4.put(phoneBookContact2.lookup_key, contact4);
                                                            i3 = i5;
                                                            break;
                                                        }
                                                    }
                                                    i4++;
                                                    str = str;
                                                }
                                            }
                                            str = str3;
                                        }
                                        str3 = str;
                                        str = str3;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        map = map4;
                                        r2 = cursorQuery3;
                                        r5 = r2;
                                        FileLog.e(th);
                                        if (map != null) {
                                            map.clear();
                                        }
                                        if (r5 != 0) {
                                            r5.close();
                                        }
                                        if (map != null) {
                                            return map;
                                        }
                                        return new HashMap<>();
                                    }
                                }
                                cursorQuery3.close();
                                map = map4;
                            }
                            r2 = cursorQuery3;
                        }
                        try {
                            FileLog.d("loading contacts 3 query time = " + (System.currentTimeMillis() - jCurrentTimeMillis3));
                            if (r2 != 0) {
                                r2.close();
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            r5 = r2;
                            FileLog.e(th);
                            if (map != null) {
                                map.clear();
                            }
                            if (r5 != 0) {
                                r5.close();
                            }
                            if (map != null) {
                                return map;
                            }
                            return new HashMap<>();
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        r4 = r3;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    r2 = Query;
                    map = null;
                }
            } catch (Throwable th10) {
                th = th10;
                r2 = 0;
                map = null;
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        if (map != null) {
            return map;
        }
        return new HashMap<>();
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
                ContactsController.m394$r8$lambda$1J6pwQFtklDiCvnjpl68cfAJqk(this.f$0, sparseArray);
            }
        });
    }

    public static void m394$r8$lambda$1J6pwQFtklDiCvnjpl68cfAJqk(ContactsController contactsController, SparseArray sparseArray) {
        if (contactsController.migratingContacts) {
            return;
        }
        contactsController.migratingContacts = true;
        HashMap<String, Contact> map = new HashMap<>();
        HashMap<String, Contact> contactsFromPhoneBook = contactsController.readContactsFromPhoneBook();
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
            for (int i3 = 0; i3 < contact.shortPhones.size(); i3++) {
                String str = (String) map2.get(contact.shortPhones.get(i3));
                if (str != null) {
                    contact.key = str;
                    map.put(str, contact);
                    break;
                }
            }
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("migrated contacts " + map.size() + " of " + sparseArray.size());
        }
        contactsController.getMessagesStorage().putCachedPhoneBook(map, true, false);
    }

    protected void performSyncPhoneBook(final HashMap<String, Contact> map, final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final boolean z6) {
        if (z2 || this.contactsBookLoaded) {
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() throws Throwable {
                    ContactsController.$r8$lambda$gBU6U9H7n0TqD5DiIXYquK955pc(this.f$0, map, z3, z, z2, z4, z5, z6);
                }
            });
        }
    }

    public static void $r8$lambda$gBU6U9H7n0TqD5DiIXYquK955pc(final ContactsController contactsController, final HashMap map, final boolean z, boolean z2, final boolean z3, boolean z4, boolean z5, boolean z6) throws Throwable {
        ArrayList arrayList;
        HashMap map2;
        HashMap map3;
        HashMap map4;
        int i;
        int i2;
        final int i3;
        Contact contact;
        HashMap map5;
        boolean z7;
        int i4;
        HashMap<String, Contact> map6;
        HashMap map7;
        Iterator<Map.Entry<String, Contact>> it;
        HashMap map8;
        int i5;
        String str;
        int i6;
        int iIndexOf;
        int i7;
        HashMap<String, Contact> map9;
        int i8;
        HashMap map10;
        int i9;
        boolean z8;
        int i10;
        TLRPC.TL_contact tL_contact;
        TLRPC.User user;
        String str2;
        String str3;
        int i11 = 0;
        contactsController.getClass();
        HashMap map11 = new HashMap();
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Contact contact2 = (Contact) ((Map.Entry) it2.next()).getValue();
            for (int i12 = 0; i12 < contact2.shortPhones.size(); i12++) {
                map11.put(contact2.shortPhones.get(i12), contact2);
            }
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("start read contacts from phone");
        }
        if (!z) {
            contactsController.checkContactsInternal();
        }
        HashMap<String, Contact> contactsFromPhoneBook = contactsController.readContactsFromPhoneBook();
        HashMap map12 = new HashMap();
        HashMap map13 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        Iterator<Map.Entry<String, Contact>> it3 = contactsFromPhoneBook.entrySet().iterator();
        while (it3.hasNext()) {
            Contact value = it3.next().getValue();
            int size = value.shortPhones.size();
            for (int i13 = 0; i13 < size; i13++) {
                String str4 = value.shortPhones.get(i13);
                map13.put(str4.substring(Math.max(0, str4.length() - 7)), value);
            }
            String letter = value.getLetter();
            ArrayList arrayList3 = (ArrayList) map12.get(letter);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                map12.put(letter, arrayList3);
                arrayList2.add(letter);
            }
            arrayList3.add(value);
        }
        HashMap map14 = new HashMap();
        int size2 = map.size();
        ArrayList arrayList4 = new ArrayList();
        if (map.isEmpty()) {
            arrayList = arrayList2;
            map2 = map13;
            map3 = map12;
            if (z2) {
                int i14 = 0;
                for (Map.Entry<String, Contact> entry : contactsFromPhoneBook.entrySet()) {
                    Contact value2 = entry.getValue();
                    entry.getKey();
                    int i15 = 0;
                    while (i15 < value2.phones.size()) {
                        if (!z4) {
                            String str5 = value2.shortPhones.get(i15);
                            String strSubstring = str5.substring(Math.max(0, str5.length() - 7));
                            TLRPC.TL_contact tL_contact2 = contactsController.contactsByPhone.get(str5);
                            if (tL_contact2 != null) {
                                TLRPC.User user2 = contactsController.getMessagesController().getUser(Long.valueOf(tL_contact2.user_id));
                                if (user2 != null) {
                                    i14++;
                                    String str6 = user2.first_name;
                                    if (str6 == null) {
                                        str6 = "";
                                    }
                                    String str7 = user2.last_name;
                                    if (str7 == null) {
                                        str7 = "";
                                    }
                                    if ((!str6.equals(value2.first_name) || !str7.equals(value2.last_name)) && (!TextUtils.isEmpty(value2.first_name) || !TextUtils.isEmpty(value2.last_name))) {
                                    }
                                }
                            } else if (contactsController.contactsByShortPhone.containsKey(strSubstring)) {
                                i14++;
                            }
                            TLRPC.TL_inputPhoneContact tL_inputPhoneContact = new TLRPC.TL_inputPhoneContact();
                            tL_inputPhoneContact.client_id = (((long) i15) << 32) | ((long) value2.contact_id);
                            tL_inputPhoneContact.first_name = value2.first_name;
                            tL_inputPhoneContact.last_name = value2.last_name;
                            tL_inputPhoneContact.phone = value2.phones.get(i15);
                            arrayList4.add(tL_inputPhoneContact);
                        } else {
                            TLRPC.TL_inputPhoneContact tL_inputPhoneContact2 = new TLRPC.TL_inputPhoneContact();
                            tL_inputPhoneContact2.client_id = (((long) i15) << 32) | ((long) value2.contact_id);
                            tL_inputPhoneContact2.first_name = value2.first_name;
                            tL_inputPhoneContact2.last_name = value2.last_name;
                            tL_inputPhoneContact2.phone = value2.phones.get(i15);
                            arrayList4.add(tL_inputPhoneContact2);
                        }
                        i15++;
                        map14 = map14;
                    }
                }
                map4 = map14;
                i = i14;
            } else {
                map4 = map14;
                i = 0;
            }
            i2 = 0;
        } else {
            Iterator<Map.Entry<String, Contact>> it4 = contactsFromPhoneBook.entrySet().iterator();
            i2 = 0;
            int i16 = 0;
            while (it4.hasNext()) {
                Map.Entry<String, Contact> next = it4.next();
                String key = next.getKey();
                Contact value3 = next.getValue();
                Contact contact3 = (Contact) map.get(key);
                ArrayList arrayList5 = arrayList2;
                if (contact3 != null) {
                    contact = contact3;
                    break;
                }
                while (true) {
                    if (i11 >= value3.shortPhones.size()) {
                        contact = contact3;
                        break;
                    }
                    contact = (Contact) map11.get(value3.shortPhones.get(i11));
                    if (contact != null) {
                        key = contact.key;
                        break;
                    }
                    i11++;
                }
                if (contact != null) {
                    value3.imported = contact.imported;
                }
                if (contact != null) {
                    if (TextUtils.isEmpty(value3.first_name)) {
                        map5 = map11;
                    } else {
                        map5 = map11;
                        if (contact.first_name.equals(value3.first_name)) {
                        }
                        z7 = true;
                        if (contact != null || z7) {
                            i4 = size2;
                            map6 = contactsFromPhoneBook;
                            map7 = map13;
                            it = it4;
                            map8 = map12;
                            for (i5 = 0; i5 < value3.phones.size(); i5++) {
                                str = value3.shortPhones.get(i5);
                                str.substring(Math.max(0, str.length() - 7));
                                map14.put(str, value3);
                                if (contact != null || (iIndexOf = contact.shortPhones.indexOf(str)) == -1) {
                                    i6 = 1;
                                } else {
                                    Integer num = contact.phoneDeleted.get(iIndexOf);
                                    value3.phoneDeleted.set(i5, num);
                                    i6 = 1;
                                    if (num.intValue() != 1) {
                                    }
                                }
                                if (z2) {
                                    if (!z7) {
                                        if (contactsController.contactsByPhone.containsKey(str)) {
                                            i16++;
                                        } else {
                                            i2 += i6;
                                            TLRPC.TL_inputPhoneContact tL_inputPhoneContact3 = new TLRPC.TL_inputPhoneContact();
                                            tL_inputPhoneContact3.client_id = ((long) value3.contact_id) | (((long) i5) << 32);
                                            tL_inputPhoneContact3.first_name = value3.first_name;
                                            tL_inputPhoneContact3.last_name = value3.last_name;
                                            tL_inputPhoneContact3.phone = value3.phones.get(i5);
                                            arrayList4.add(tL_inputPhoneContact3);
                                        }
                                    } else {
                                        TLRPC.TL_inputPhoneContact tL_inputPhoneContact4 = new TLRPC.TL_inputPhoneContact();
                                        tL_inputPhoneContact4.client_id = ((long) value3.contact_id) | (((long) i5) << 32);
                                        tL_inputPhoneContact4.first_name = value3.first_name;
                                        tL_inputPhoneContact4.last_name = value3.last_name;
                                        tL_inputPhoneContact4.phone = value3.phones.get(i5);
                                        arrayList4.add(tL_inputPhoneContact4);
                                    }
                                }
                            }
                            if (contact != null) {
                                map.remove(key);
                            }
                        } else {
                            int i17 = 0;
                            while (i17 < value3.phones.size()) {
                                String str8 = value3.shortPhones.get(i17);
                                HashMap map15 = map13;
                                Iterator<Map.Entry<String, Contact>> it5 = it4;
                                String strSubstring2 = str8.substring(Math.max(0, str8.length() - 7));
                                map14.put(str8, value3);
                                int iIndexOf2 = contact.shortPhones.indexOf(str8);
                                if (z2) {
                                    i8 = iIndexOf2;
                                    TLRPC.TL_contact tL_contact3 = contactsController.contactsByPhone.get(str8);
                                    if (tL_contact3 != null) {
                                        map10 = map12;
                                        i7 = size2;
                                        map9 = contactsFromPhoneBook;
                                        TLRPC.User user3 = contactsController.getMessagesController().getUser(Long.valueOf(tL_contact3.user_id));
                                        if (user3 != null) {
                                            i16++;
                                            if (TextUtils.isEmpty(user3.first_name) && TextUtils.isEmpty(user3.last_name) && (!TextUtils.isEmpty(value3.first_name) || !TextUtils.isEmpty(value3.last_name))) {
                                                z8 = true;
                                                i10 = -1;
                                                i9 = -1;
                                            }
                                        }
                                        if (i9 == i10) {
                                            value3.phoneDeleted.set(i17, contact.phoneDeleted.get(i9));
                                            contact.phones.remove(i9);
                                            contact.shortPhones.remove(i9);
                                            contact.phoneDeleted.remove(i9);
                                            contact.phoneTypes.remove(i9);
                                        } else if (!z2) {
                                            if (z8) {
                                                tL_contact = contactsController.contactsByPhone.get(str8);
                                                if (tL_contact != null) {
                                                    user = contactsController.getMessagesController().getUser(Long.valueOf(tL_contact.user_id));
                                                    if (user != null) {
                                                        i16++;
                                                        str2 = user.first_name;
                                                        if (str2 == null) {
                                                            str2 = "";
                                                        }
                                                        str3 = user.last_name;
                                                        if (str3 == null) {
                                                            str3 = "";
                                                        }
                                                        if ((str2.equals(value3.first_name) || !str3.equals(value3.last_name)) && (!TextUtils.isEmpty(value3.first_name) || !TextUtils.isEmpty(value3.last_name))) {
                                                        }
                                                    } else {
                                                        i2++;
                                                    }
                                                } else if (contactsController.contactsByShortPhone.containsKey(strSubstring2)) {
                                                    i16++;
                                                }
                                                TLRPC.TL_inputPhoneContact tL_inputPhoneContact5 = new TLRPC.TL_inputPhoneContact();
                                                tL_inputPhoneContact5.client_id = ((long) value3.contact_id) | (((long) i17) << 32);
                                                tL_inputPhoneContact5.first_name = value3.first_name;
                                                tL_inputPhoneContact5.last_name = value3.last_name;
                                                tL_inputPhoneContact5.phone = value3.phones.get(i17);
                                                arrayList4.add(tL_inputPhoneContact5);
                                            } else {
                                                TLRPC.TL_inputPhoneContact tL_inputPhoneContact6 = new TLRPC.TL_inputPhoneContact();
                                                tL_inputPhoneContact6.client_id = ((long) value3.contact_id) | (((long) i17) << 32);
                                                tL_inputPhoneContact6.first_name = value3.first_name;
                                                tL_inputPhoneContact6.last_name = value3.last_name;
                                                tL_inputPhoneContact6.phone = value3.phones.get(i17);
                                                arrayList4.add(tL_inputPhoneContact6);
                                            }
                                        }
                                        i17++;
                                        it4 = it5;
                                        map13 = map15;
                                        map12 = map10;
                                        contactsFromPhoneBook = map9;
                                        size2 = i7;
                                    } else {
                                        i7 = size2;
                                        map9 = contactsFromPhoneBook;
                                        map10 = map12;
                                        if (contactsController.contactsByShortPhone.containsKey(strSubstring2)) {
                                            i16++;
                                        }
                                    }
                                } else {
                                    i7 = size2;
                                    map9 = contactsFromPhoneBook;
                                    i8 = iIndexOf2;
                                    map10 = map12;
                                }
                                i9 = i8;
                                z8 = false;
                                i10 = -1;
                                if (i9 == i10) {
                                    value3.phoneDeleted.set(i17, contact.phoneDeleted.get(i9));
                                    contact.phones.remove(i9);
                                    contact.shortPhones.remove(i9);
                                    contact.phoneDeleted.remove(i9);
                                    contact.phoneTypes.remove(i9);
                                } else if (!z2) {
                                    if (z8) {
                                        tL_contact = contactsController.contactsByPhone.get(str8);
                                        if (tL_contact != null) {
                                            user = contactsController.getMessagesController().getUser(Long.valueOf(tL_contact.user_id));
                                            if (user != null) {
                                                i16++;
                                                str2 = user.first_name;
                                                if (str2 == null) {
                                                    str2 = "";
                                                }
                                                str3 = user.last_name;
                                                if (str3 == null) {
                                                    str3 = "";
                                                }
                                                if (str2.equals(value3.first_name)) {
                                                }
                                            } else {
                                                i2++;
                                            }
                                        } else if (contactsController.contactsByShortPhone.containsKey(strSubstring2)) {
                                            i16++;
                                        }
                                        TLRPC.TL_inputPhoneContact tL_inputPhoneContact7 = new TLRPC.TL_inputPhoneContact();
                                        tL_inputPhoneContact7.client_id = ((long) value3.contact_id) | (((long) i17) << 32);
                                        tL_inputPhoneContact7.first_name = value3.first_name;
                                        tL_inputPhoneContact7.last_name = value3.last_name;
                                        tL_inputPhoneContact7.phone = value3.phones.get(i17);
                                        arrayList4.add(tL_inputPhoneContact7);
                                    } else {
                                        TLRPC.TL_inputPhoneContact tL_inputPhoneContact8 = new TLRPC.TL_inputPhoneContact();
                                        tL_inputPhoneContact8.client_id = ((long) value3.contact_id) | (((long) i17) << 32);
                                        tL_inputPhoneContact8.first_name = value3.first_name;
                                        tL_inputPhoneContact8.last_name = value3.last_name;
                                        tL_inputPhoneContact8.phone = value3.phones.get(i17);
                                        arrayList4.add(tL_inputPhoneContact8);
                                    }
                                }
                                i17++;
                                it4 = it5;
                                map13 = map15;
                                map12 = map10;
                                contactsFromPhoneBook = map9;
                                size2 = i7;
                            }
                            i4 = size2;
                            map6 = contactsFromPhoneBook;
                            map7 = map13;
                            it = it4;
                            map8 = map12;
                            if (contact.phones.isEmpty()) {
                                map.remove(key);
                            }
                        }
                        map11 = map5;
                        arrayList2 = arrayList5;
                        it4 = it;
                        map13 = map7;
                        map12 = map8;
                        contactsFromPhoneBook = map6;
                        size2 = i4;
                        i11 = 0;
                    }
                    if (!TextUtils.isEmpty(value3.last_name) && !contact.last_name.equals(value3.last_name)) {
                        z7 = true;
                    }
                    if (contact != null) {
                        i4 = size2;
                        map6 = contactsFromPhoneBook;
                        map7 = map13;
                        it = it4;
                        map8 = map12;
                        while (i5 < value3.phones.size()) {
                            str = value3.shortPhones.get(i5);
                            str.substring(Math.max(0, str.length() - 7));
                            map14.put(str, value3);
                            if (contact != null) {
                            }
                            i6 = 1;
                            if (z2) {
                                if (!z7) {
                                    if (contactsController.contactsByPhone.containsKey(str)) {
                                        i16++;
                                    } else {
                                        i2 += i6;
                                        TLRPC.TL_inputPhoneContact tL_inputPhoneContact9 = new TLRPC.TL_inputPhoneContact();
                                        tL_inputPhoneContact9.client_id = ((long) value3.contact_id) | (((long) i5) << 32);
                                        tL_inputPhoneContact9.first_name = value3.first_name;
                                        tL_inputPhoneContact9.last_name = value3.last_name;
                                        tL_inputPhoneContact9.phone = value3.phones.get(i5);
                                        arrayList4.add(tL_inputPhoneContact9);
                                    }
                                } else {
                                    TLRPC.TL_inputPhoneContact tL_inputPhoneContact10 = new TLRPC.TL_inputPhoneContact();
                                    tL_inputPhoneContact10.client_id = ((long) value3.contact_id) | (((long) i5) << 32);
                                    tL_inputPhoneContact10.first_name = value3.first_name;
                                    tL_inputPhoneContact10.last_name = value3.last_name;
                                    tL_inputPhoneContact10.phone = value3.phones.get(i5);
                                    arrayList4.add(tL_inputPhoneContact10);
                                }
                            }
                        }
                        if (contact != null) {
                            map.remove(key);
                        }
                    } else {
                        i4 = size2;
                        map6 = contactsFromPhoneBook;
                        map7 = map13;
                        it = it4;
                        map8 = map12;
                        while (i5 < value3.phones.size()) {
                            str = value3.shortPhones.get(i5);
                            str.substring(Math.max(0, str.length() - 7));
                            map14.put(str, value3);
                            if (contact != null) {
                            }
                            i6 = 1;
                            if (z2) {
                                if (!z7) {
                                    if (contactsController.contactsByPhone.containsKey(str)) {
                                        i16++;
                                    } else {
                                        i2 += i6;
                                        TLRPC.TL_inputPhoneContact tL_inputPhoneContact11 = new TLRPC.TL_inputPhoneContact();
                                        tL_inputPhoneContact11.client_id = ((long) value3.contact_id) | (((long) i5) << 32);
                                        tL_inputPhoneContact11.first_name = value3.first_name;
                                        tL_inputPhoneContact11.last_name = value3.last_name;
                                        tL_inputPhoneContact11.phone = value3.phones.get(i5);
                                        arrayList4.add(tL_inputPhoneContact11);
                                    }
                                } else {
                                    TLRPC.TL_inputPhoneContact tL_inputPhoneContact12 = new TLRPC.TL_inputPhoneContact();
                                    tL_inputPhoneContact12.client_id = ((long) value3.contact_id) | (((long) i5) << 32);
                                    tL_inputPhoneContact12.first_name = value3.first_name;
                                    tL_inputPhoneContact12.last_name = value3.last_name;
                                    tL_inputPhoneContact12.phone = value3.phones.get(i5);
                                    arrayList4.add(tL_inputPhoneContact12);
                                }
                            }
                        }
                        if (contact != null) {
                            map.remove(key);
                        }
                    }
                    map11 = map5;
                    arrayList2 = arrayList5;
                    it4 = it;
                    map13 = map7;
                    map12 = map8;
                    contactsFromPhoneBook = map6;
                    size2 = i4;
                    i11 = 0;
                } else {
                    map5 = map11;
                }
                z7 = false;
                if (contact != null) {
                    i4 = size2;
                    map6 = contactsFromPhoneBook;
                    map7 = map13;
                    it = it4;
                    map8 = map12;
                    while (i5 < value3.phones.size()) {
                        str = value3.shortPhones.get(i5);
                        str.substring(Math.max(0, str.length() - 7));
                        map14.put(str, value3);
                        if (contact != null) {
                        }
                        i6 = 1;
                        if (z2) {
                            if (!z7) {
                                if (contactsController.contactsByPhone.containsKey(str)) {
                                    i16++;
                                } else {
                                    i2 += i6;
                                    TLRPC.TL_inputPhoneContact tL_inputPhoneContact13 = new TLRPC.TL_inputPhoneContact();
                                    tL_inputPhoneContact13.client_id = ((long) value3.contact_id) | (((long) i5) << 32);
                                    tL_inputPhoneContact13.first_name = value3.first_name;
                                    tL_inputPhoneContact13.last_name = value3.last_name;
                                    tL_inputPhoneContact13.phone = value3.phones.get(i5);
                                    arrayList4.add(tL_inputPhoneContact13);
                                }
                            } else {
                                TLRPC.TL_inputPhoneContact tL_inputPhoneContact14 = new TLRPC.TL_inputPhoneContact();
                                tL_inputPhoneContact14.client_id = ((long) value3.contact_id) | (((long) i5) << 32);
                                tL_inputPhoneContact14.first_name = value3.first_name;
                                tL_inputPhoneContact14.last_name = value3.last_name;
                                tL_inputPhoneContact14.phone = value3.phones.get(i5);
                                arrayList4.add(tL_inputPhoneContact14);
                            }
                        }
                    }
                    if (contact != null) {
                        map.remove(key);
                    }
                } else {
                    i4 = size2;
                    map6 = contactsFromPhoneBook;
                    map7 = map13;
                    it = it4;
                    map8 = map12;
                    while (i5 < value3.phones.size()) {
                        str = value3.shortPhones.get(i5);
                        str.substring(Math.max(0, str.length() - 7));
                        map14.put(str, value3);
                        if (contact != null) {
                        }
                        i6 = 1;
                        if (z2) {
                            if (!z7) {
                                if (contactsController.contactsByPhone.containsKey(str)) {
                                    i16++;
                                } else {
                                    i2 += i6;
                                    TLRPC.TL_inputPhoneContact tL_inputPhoneContact15 = new TLRPC.TL_inputPhoneContact();
                                    tL_inputPhoneContact15.client_id = ((long) value3.contact_id) | (((long) i5) << 32);
                                    tL_inputPhoneContact15.first_name = value3.first_name;
                                    tL_inputPhoneContact15.last_name = value3.last_name;
                                    tL_inputPhoneContact15.phone = value3.phones.get(i5);
                                    arrayList4.add(tL_inputPhoneContact15);
                                }
                            } else {
                                TLRPC.TL_inputPhoneContact tL_inputPhoneContact16 = new TLRPC.TL_inputPhoneContact();
                                tL_inputPhoneContact16.client_id = ((long) value3.contact_id) | (((long) i5) << 32);
                                tL_inputPhoneContact16.first_name = value3.first_name;
                                tL_inputPhoneContact16.last_name = value3.last_name;
                                tL_inputPhoneContact16.phone = value3.phones.get(i5);
                                arrayList4.add(tL_inputPhoneContact16);
                            }
                        }
                    }
                    if (contact != null) {
                        map.remove(key);
                    }
                }
                map11 = map5;
                arrayList2 = arrayList5;
                it4 = it;
                map13 = map7;
                map12 = map8;
                contactsFromPhoneBook = map6;
                size2 = i4;
                i11 = 0;
            }
            int i18 = size2;
            HashMap<String, Contact> map16 = contactsFromPhoneBook;
            arrayList = arrayList2;
            map2 = map13;
            map3 = map12;
            if (!z3 && map.isEmpty() && arrayList4.isEmpty()) {
                size2 = i18;
                if (size2 == map16.size()) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("contacts not changed!");
                        return;
                    }
                    return;
                }
            } else {
                size2 = i18;
            }
            if (!z2 || map.isEmpty() || map16.isEmpty() || !arrayList4.isEmpty()) {
                contactsFromPhoneBook = map16;
            } else {
                contactsFromPhoneBook = map16;
                contactsController.getMessagesStorage().putCachedPhoneBook(contactsFromPhoneBook, false, false);
            }
            map4 = map14;
            i = i16;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("done processing contacts");
        }
        if (z2) {
            if (!arrayList4.isEmpty()) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("start import contacts");
                }
                if (!z5 || i2 == 0) {
                    i3 = 0;
                } else if (i2 >= 30) {
                    i3 = 1;
                } else if (z3 && size2 == 0 && contactsController.contactsByPhone.size() - i > (contactsController.contactsByPhone.size() / 3) * 2) {
                    i3 = 2;
                } else {
                    i3 = 0;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("new phone book contacts " + i2 + " serverContactsInPhonebook " + i + " totalContacts " + contactsController.contactsByPhone.size());
                }
                if (i3 != 0) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.getNotificationCenter().postNotificationName(NotificationCenter.hasNewContactsToImport, Integer.valueOf(i3), map, Boolean.valueOf(z3), Boolean.valueOf(z));
                        }
                    });
                    return;
                }
                if (z6) {
                    final HashMap<String, Contact> map17 = contactsFromPhoneBook;
                    final HashMap map18 = map4;
                    final ArrayList arrayList6 = arrayList;
                    final HashMap map19 = map2;
                    final HashMap map20 = map3;
                    Utilities.stageQueue.postRunnable(new Runnable() {
                        @Override
                        public final void run() {
                            ContactsController.$r8$lambda$DzyePdDHobLMv9A6sqrQbKexbnY(this.f$0, map18, map17, z3, map20, arrayList6, map19);
                        }
                    });
                    return;
                }
                final ContactsController contactsController2 = contactsController;
                HashMap<String, Contact> map21 = contactsFromPhoneBook;
                ArrayList arrayList7 = arrayList;
                HashMap map22 = map2;
                HashMap map23 = map3;
                final boolean[] zArr = {false};
                final HashMap map24 = map4;
                final HashMap map25 = new HashMap(map21);
                HashMap<String, Contact> map26 = map21;
                final SparseArray sparseArray = new SparseArray();
                Iterator it6 = map25.entrySet().iterator();
                while (it6.hasNext()) {
                    Contact contact4 = (Contact) ((Map.Entry) it6.next()).getValue();
                    sparseArray.put(contact4.contact_id, contact4.key);
                }
                contactsController2.completedRequestsCount = 0;
                int iCeil = (int) Math.ceil(((double) arrayList4.size()) / 500.0d);
                int i19 = 0;
                while (i19 < iCeil) {
                    final ArrayList arrayList8 = arrayList7;
                    final TLRPC.TL_contacts_importContacts tL_contacts_importContacts = new TLRPC.TL_contacts_importContacts();
                    int i20 = i19 * 500;
                    tL_contacts_importContacts.contacts = new ArrayList<>(arrayList4.subList(i20, Math.min(i20 + 500, arrayList4.size())));
                    ConnectionsManager connectionsManager = contactsController2.getConnectionsManager();
                    final HashMap map27 = map22;
                    final int i21 = iCeil;
                    final HashMap map28 = map23;
                    final HashMap<String, Contact> map29 = map26;
                    RequestDelegate requestDelegate = new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            ContactsController.$r8$lambda$ct_tQv2ZgHwWp8YjYDEnc2ezxu8(this.f$0, map25, sparseArray, zArr, map29, tL_contacts_importContacts, i21, map24, z3, map28, arrayList8, map27, tLObject, tL_error);
                        }
                    };
                    map23 = map28;
                    arrayList7 = arrayList8;
                    map22 = map27;
                    connectionsManager.sendRequest(tL_contacts_importContacts, requestDelegate, 6);
                    i19++;
                    map25 = map25;
                    iCeil = i21;
                    map24 = map24;
                    map26 = map29;
                    sparseArray = sparseArray;
                    contactsController2 = contactsController;
                }
                return;
            }
            final HashMap<String, Contact> map30 = contactsFromPhoneBook;
            final HashMap map31 = map4;
            final ArrayList arrayList9 = arrayList;
            final HashMap map32 = map2;
            final HashMap map33 = map3;
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    ContactsController.m399$r8$lambda$Cxx6ppn2ZIgCYY1XVmWBjTBfw(this.f$0, map31, map30, z3, map33, arrayList9, map32);
                }
            });
            return;
        }
        final HashMap<String, Contact> map34 = contactsFromPhoneBook;
        final HashMap map35 = map4;
        final ArrayList arrayList10 = arrayList;
        final HashMap map36 = map2;
        final HashMap map37 = map3;
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                ContactsController.$r8$lambda$VnpSwn84DC_nFlwkjA1tes35rWw(this.f$0, map35, map34, z3, map37, arrayList10, map36);
            }
        });
        if (map34.isEmpty()) {
            return;
        }
        contactsController.getMessagesStorage().putCachedPhoneBook(map34, false, false);
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

    public static void $r8$lambda$DzyePdDHobLMv9A6sqrQbKexbnY(final ContactsController contactsController, HashMap map, HashMap map2, boolean z, final HashMap map3, final ArrayList arrayList, final HashMap map4) {
        contactsController.contactsBookSPhones = map;
        contactsController.contactsBook = map2;
        contactsController.contactsSyncInProgress = false;
        contactsController.contactsBookLoaded = true;
        if (z) {
            contactsController.contactsLoaded = true;
        }
        if (!contactsController.delayedContactsUpdate.isEmpty() && contactsController.contactsLoaded) {
            contactsController.applyContactsUpdates(contactsController.delayedContactsUpdate, null, null, null);
            contactsController.delayedContactsUpdate.clear();
        }
        contactsController.getMessagesStorage().putCachedPhoneBook(map2, false, false);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ContactsController.m409$r8$lambda$YSr23CPplMLSh2Kz4dutpK7ghI(this.f$0, map3, arrayList, map4);
            }
        });
    }

    public static void m409$r8$lambda$YSr23CPplMLSh2Kz4dutpK7ghI(ContactsController contactsController, HashMap map, ArrayList arrayList, HashMap map2) {
        contactsController.mergePhonebookAndTelegramContacts(map, arrayList, map2);
        contactsController.updateUnregisteredContacts();
        contactsController.getNotificationCenter().postNotificationName(NotificationCenter.contactsDidLoad, new Object[0]);
        contactsController.getNotificationCenter().postNotificationName(NotificationCenter.contactsImported, new Object[0]);
    }

    public static void $r8$lambda$ct_tQv2ZgHwWp8YjYDEnc2ezxu8(final ContactsController contactsController, HashMap map, SparseArray sparseArray, final boolean[] zArr, HashMap map2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i, final HashMap map3, final boolean z, final HashMap map4, final ArrayList arrayList, final HashMap map5, TLObject tLObject, TLRPC.TL_error tL_error) {
        HashMap map6;
        contactsController.completedRequestsCount++;
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
            map6 = map2;
            contactsController.getMessagesStorage().putUsersAndChats(tL_contacts_importedContacts.users, null, true, true);
            ArrayList<TLRPC.TL_contact> arrayList2 = new ArrayList<>();
            for (int i4 = 0; i4 < tL_contacts_importedContacts.imported.size(); i4++) {
                TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                tL_contact.user_id = tL_contacts_importedContacts.imported.get(i4).user_id;
                arrayList2.add(tL_contact);
            }
            contactsController.processLoadedContacts(arrayList2, tL_contacts_importedContacts.users, 2);
        } else {
            map6 = map2;
            for (int i5 = 0; i5 < tL_contacts_importContacts.contacts.size(); i5++) {
                map.remove(sparseArray.get((int) tL_contacts_importContacts.contacts.get(i5).client_id));
            }
            zArr[0] = true;
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("import contacts error " + tL_error.text);
            }
        }
        if (contactsController.completedRequestsCount == i) {
            if (!map.isEmpty()) {
                contactsController.getMessagesStorage().putCachedPhoneBook(map, false, false);
            }
            final HashMap map7 = map6;
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    ContactsController.$r8$lambda$m1TwqhGaw0Mq2egntGVluTEqXxA(this.f$0, map3, map7, z, map4, arrayList, map5, zArr);
                }
            });
        }
    }

    public static void $r8$lambda$m1TwqhGaw0Mq2egntGVluTEqXxA(final ContactsController contactsController, HashMap map, HashMap map2, boolean z, final HashMap map3, final ArrayList arrayList, final HashMap map4, boolean[] zArr) {
        contactsController.contactsBookSPhones = map;
        contactsController.contactsBook = map2;
        contactsController.contactsSyncInProgress = false;
        contactsController.contactsBookLoaded = true;
        if (z) {
            contactsController.contactsLoaded = true;
        }
        if (!contactsController.delayedContactsUpdate.isEmpty() && contactsController.contactsLoaded) {
            contactsController.applyContactsUpdates(contactsController.delayedContactsUpdate, null, null, null);
            contactsController.delayedContactsUpdate.clear();
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ContactsController.$r8$lambda$sazV40rllpevw6KcmybtaUh6_pY(this.f$0, map3, arrayList, map4);
            }
        });
        if (zArr[0]) {
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.getMessagesStorage().getCachedPhoneBook(true);
                }
            }, 300000L);
        }
    }

    public static void $r8$lambda$sazV40rllpevw6KcmybtaUh6_pY(ContactsController contactsController, HashMap map, ArrayList arrayList, HashMap map2) {
        contactsController.mergePhonebookAndTelegramContacts(map, arrayList, map2);
        contactsController.getNotificationCenter().postNotificationName(NotificationCenter.contactsImported, new Object[0]);
    }

    public static void m399$r8$lambda$Cxx6ppn2ZIgCYY1XVmWBjTBfw(final ContactsController contactsController, HashMap map, HashMap map2, boolean z, final HashMap map3, final ArrayList arrayList, final HashMap map4) {
        contactsController.contactsBookSPhones = map;
        contactsController.contactsBook = map2;
        contactsController.contactsSyncInProgress = false;
        contactsController.contactsBookLoaded = true;
        if (z) {
            contactsController.contactsLoaded = true;
        }
        if (!contactsController.delayedContactsUpdate.isEmpty() && contactsController.contactsLoaded) {
            contactsController.applyContactsUpdates(contactsController.delayedContactsUpdate, null, null, null);
            contactsController.delayedContactsUpdate.clear();
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ContactsController.$r8$lambda$iHfROOqAza5xZhmSuQfOgm6b0PU(this.f$0, map3, arrayList, map4);
            }
        });
    }

    public static void $r8$lambda$iHfROOqAza5xZhmSuQfOgm6b0PU(ContactsController contactsController, HashMap map, ArrayList arrayList, HashMap map2) {
        contactsController.mergePhonebookAndTelegramContacts(map, arrayList, map2);
        contactsController.updateUnregisteredContacts();
        contactsController.getNotificationCenter().postNotificationName(NotificationCenter.contactsDidLoad, new Object[0]);
        contactsController.getNotificationCenter().postNotificationName(NotificationCenter.contactsImported, new Object[0]);
    }

    public static void $r8$lambda$VnpSwn84DC_nFlwkjA1tes35rWw(final ContactsController contactsController, HashMap map, HashMap map2, boolean z, final HashMap map3, final ArrayList arrayList, final HashMap map4) {
        contactsController.contactsBookSPhones = map;
        contactsController.contactsBook = map2;
        contactsController.contactsSyncInProgress = false;
        contactsController.contactsBookLoaded = true;
        if (z) {
            contactsController.contactsLoaded = true;
        }
        if (!contactsController.delayedContactsUpdate.isEmpty() && contactsController.contactsLoaded) {
            contactsController.applyContactsUpdates(contactsController.delayedContactsUpdate, null, null, null);
            contactsController.delayedContactsUpdate.clear();
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.mergePhonebookAndTelegramContacts(map3, arrayList, map4);
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
                return ContactsController.$r8$lambda$EoqSNI82ZJZ2JYcR7TTNAdah2R4((TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
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

    public static int $r8$lambda$EoqSNI82ZJZ2JYcR7TTNAdah2R4(TLRPC.TL_contact tL_contact, TLRPC.TL_contact tL_contact2) {
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
                    ContactsController.$r8$lambda$bcRno81M2P1y2X6oM85aph1vkCI(this.f$0, j, tLObject, tL_error);
                }
            });
        }
    }

    public static void $r8$lambda$bcRno81M2P1y2X6oM85aph1vkCI(final ContactsController contactsController, long j, TLObject tLObject, TLRPC.TL_error tL_error) {
        contactsController.getClass();
        if (tL_error == null) {
            TLRPC.contacts_Contacts contacts_contacts = (TLRPC.contacts_Contacts) tLObject;
            if (j != 0 && (contacts_contacts instanceof TLRPC.TL_contacts_contactsNotModified)) {
                contactsController.contactsLoaded = true;
                if (!contactsController.delayedContactsUpdate.isEmpty() && contactsController.contactsBookLoaded) {
                    contactsController.applyContactsUpdates(contactsController.delayedContactsUpdate, null, null, null);
                    contactsController.delayedContactsUpdate.clear();
                }
                contactsController.getUserConfig().lastContactsSyncTime = (int) (System.currentTimeMillis() / 1000);
                contactsController.getUserConfig().saveConfig(false);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ContactsController.m417$r8$lambda$rMrPpoD2aWy4eWvNRNvjJSkDxA(this.f$0);
                    }
                });
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("load contacts don't change");
                    return;
                }
                return;
            }
            contactsController.getUserConfig().contactsSavedCount = contacts_contacts.saved_count;
            contactsController.getUserConfig().saveConfig(false);
            contactsController.processLoadedContacts(contacts_contacts.contacts, contacts_contacts.users, 0);
        }
    }

    public static void m417$r8$lambda$rMrPpoD2aWy4eWvNRNvjJSkDxA(ContactsController contactsController) {
        synchronized (contactsController.loadContactsSync) {
            contactsController.loadingContacts = false;
        }
        contactsController.getNotificationCenter().postNotificationName(NotificationCenter.contactsDidLoad, new Object[0]);
    }

    public void processLoadedContacts(final ArrayList<TLRPC.TL_contact> arrayList, final ArrayList<TLRPC.User> arrayList2, final int i) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ContactsController.$r8$lambda$A22AQoDOGbqiGzFfc8XlavpwOMs(this.f$0, arrayList2, i, arrayList);
            }
        });
    }

    public static void $r8$lambda$A22AQoDOGbqiGzFfc8XlavpwOMs(final ContactsController contactsController, final ArrayList arrayList, final int i, final ArrayList arrayList2) {
        contactsController.getMessagesController().putUsers(arrayList, i == 1);
        final LongSparseArray longSparseArray = new LongSparseArray();
        final boolean zIsEmpty = arrayList2.isEmpty();
        if (i == 2 && !contactsController.contacts.isEmpty()) {
            int i2 = 0;
            while (i2 < arrayList2.size()) {
                if (contactsController.contactsDict.get(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i2)).user_id)) != null) {
                    arrayList2.remove(i2);
                    i2--;
                }
                i2++;
            }
            arrayList2.addAll(contactsController.contacts);
        }
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            TLRPC.User user = contactsController.getMessagesController().getUser(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i3)).user_id));
            if (user != null) {
                longSparseArray.put(user.id, user);
            }
        }
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                ContactsController.$r8$lambda$crN0eunr4yjNwrMNxPKC3SblvxE(this.f$0, i, arrayList2, arrayList, longSparseArray, zIsEmpty);
            }
        });
    }

    public static void $r8$lambda$crN0eunr4yjNwrMNxPKC3SblvxE(final ContactsController contactsController, final int i, final ArrayList arrayList, ArrayList arrayList2, LongSparseArray longSparseArray, final boolean z) {
        final HashMap map;
        final HashMap map2;
        int i2;
        ConcurrentHashMap concurrentHashMap;
        int i3;
        String upperCase;
        ArrayList arrayList3;
        ArrayList arrayList4 = arrayList;
        final LongSparseArray longSparseArray2 = longSparseArray;
        contactsController.getClass();
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("done loading contacts");
        }
        if (i == 1 && (arrayList4.isEmpty() || Math.abs((System.currentTimeMillis() / 1000) - ((long) contactsController.getUserConfig().lastContactsSyncTime)) >= 86400)) {
            contactsController.loadContacts(false, contactsController.getContactsHash(arrayList4));
            if (arrayList4.isEmpty()) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ContactsController.$r8$lambda$BknDRtYuKhih0K5uHkrPJWZ3GKk(this.f$0);
                    }
                });
                return;
            }
        }
        if (i == 0) {
            contactsController.getUserConfig().lastContactsSyncTime = (int) (System.currentTimeMillis() / 1000);
            contactsController.getUserConfig().saveConfig(false);
        }
        int i4 = 0;
        final boolean z2 = false;
        while (i4 < arrayList4.size()) {
            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList4.get(i4);
            if (MessagesController.getInstance(contactsController.currentAccount).getUser(Long.valueOf(tL_contact.user_id)) == null && tL_contact.user_id != contactsController.getUserConfig().getClientUserId()) {
                arrayList4.remove(i4);
                i4--;
                z2 = true;
            }
            i4++;
        }
        if (i != 1) {
            contactsController.getMessagesStorage().putUsersAndChats(arrayList2, null, true, true);
            contactsController.getMessagesStorage().putContacts(arrayList4, i != 2);
        }
        final Collator localeCollator = getLocaleCollator();
        Collections.sort(arrayList4, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                LongSparseArray longSparseArray3 = longSparseArray2;
                return localeCollator.compare(UserObject.getFirstName((TLRPC.User) longSparseArray3.get(((TLRPC.TL_contact) obj).user_id)), UserObject.getFirstName((TLRPC.User) longSparseArray3.get(((TLRPC.TL_contact) obj2).user_id)));
            }
        });
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap(20, 1.0f, 2);
        final HashMap map3 = new HashMap();
        final HashMap map4 = new HashMap();
        final ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        if (contactsController.contactsBookLoaded) {
            map = null;
            map2 = null;
        } else {
            map = new HashMap();
            map2 = new HashMap();
        }
        int i5 = 0;
        while (i5 < arrayList4.size()) {
            TLRPC.TL_contact tL_contact2 = (TLRPC.TL_contact) arrayList4.get(i5);
            ConcurrentHashMap concurrentHashMap3 = concurrentHashMap2;
            TLRPC.User user = (TLRPC.User) longSparseArray2.get(tL_contact2.user_id);
            if (user == null) {
                i2 = i5;
                arrayList3 = arrayList6;
                concurrentHashMap = concurrentHashMap3;
            } else {
                i2 = i5;
                ArrayList arrayList7 = arrayList6;
                concurrentHashMap = concurrentHashMap3;
                concurrentHashMap.put(Long.valueOf(tL_contact2.user_id), tL_contact2);
                if (map == null || TextUtils.isEmpty(user.phone)) {
                    i3 = 0;
                } else {
                    map.put(user.phone, tL_contact2);
                    String str = user.phone;
                    i3 = 0;
                    map2.put(str.substring(Math.max(0, str.length() - 7)), tL_contact2);
                }
                String firstName = UserObject.getFirstName(user);
                if (firstName.length() > 1) {
                    firstName = firstName.substring(i3, 1);
                }
                if (firstName.length() == 0) {
                    upperCase = "#";
                } else {
                    upperCase = firstName.toUpperCase();
                }
                String str2 = contactsController.sectionsToReplace.get(upperCase);
                if (str2 != null) {
                    upperCase = str2;
                }
                ArrayList arrayList8 = (ArrayList) map3.get(upperCase);
                if (arrayList8 == null) {
                    arrayList8 = new ArrayList();
                    map3.put(upperCase, arrayList8);
                    arrayList5.add(upperCase);
                }
                arrayList8.add(tL_contact2);
                if (user.mutual_contact) {
                    ArrayList arrayList9 = (ArrayList) map4.get(upperCase);
                    if (arrayList9 == null) {
                        arrayList9 = new ArrayList();
                        map4.put(upperCase, arrayList9);
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
            i5 = i2 + 1;
            ConcurrentHashMap concurrentHashMap4 = concurrentHashMap;
            arrayList6 = arrayList3;
            concurrentHashMap2 = concurrentHashMap4;
            arrayList4 = arrayList;
            longSparseArray2 = longSparseArray;
        }
        final ArrayList arrayList10 = arrayList6;
        final ConcurrentHashMap concurrentHashMap5 = concurrentHashMap2;
        Collections.sort(arrayList5, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return ContactsController.$r8$lambda$7FRrR4a9X27JXVm5UFt68w07Xyw(localeCollator, (String) obj, (String) obj2);
            }
        });
        Collections.sort(arrayList10, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return ContactsController.$r8$lambda$qp1Mm9C7fv5a8XV5V4R8DcUSLyE(localeCollator, (String) obj, (String) obj2);
            }
        });
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ContactsController.m414$r8$lambda$eBU4ijZpnJaQE_58t7m8z9CDXI(this.f$0, arrayList, concurrentHashMap5, map3, map4, arrayList5, arrayList10, i, z, z2);
            }
        });
        if (!contactsController.delayedContactsUpdate.isEmpty() && contactsController.contactsLoaded && contactsController.contactsBookLoaded) {
            contactsController.applyContactsUpdates(contactsController.delayedContactsUpdate, null, null, null);
            contactsController.delayedContactsUpdate.clear();
        }
        if (map != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ContactsController.$r8$lambda$I6NjXpJ1ep04JxrgdpS_MC9aSU8(this.f$0, map, map2);
                }
            });
        } else {
            contactsController.contactsLoaded = true;
        }
    }

    public static void $r8$lambda$BknDRtYuKhih0K5uHkrPJWZ3GKk(ContactsController contactsController) {
        contactsController.doneLoadingContacts = true;
        contactsController.getNotificationCenter().postNotificationName(NotificationCenter.contactsDidLoad, new Object[0]);
    }

    public static int $r8$lambda$7FRrR4a9X27JXVm5UFt68w07Xyw(Collator collator, String str, String str2) {
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

    public static int $r8$lambda$qp1Mm9C7fv5a8XV5V4R8DcUSLyE(Collator collator, String str, String str2) {
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

    public static void m414$r8$lambda$eBU4ijZpnJaQE_58t7m8z9CDXI(ContactsController contactsController, ArrayList arrayList, ConcurrentHashMap concurrentHashMap, HashMap map, HashMap map2, ArrayList arrayList2, ArrayList arrayList3, int i, boolean z, boolean z2) {
        contactsController.contacts = arrayList;
        contactsController.contactsDict = concurrentHashMap;
        contactsController.usersSectionsDict = map;
        contactsController.usersMutualSectionsDict = map2;
        contactsController.sortedUsersSectionsArray = arrayList2;
        contactsController.sortedUsersMutualSectionsArray = arrayList3;
        contactsController.doneLoadingContacts = true;
        if (i != 2) {
            synchronized (contactsController.loadContactsSync) {
                contactsController.loadingContacts = false;
            }
        }
        contactsController.performWriteContactsToPhoneBook();
        contactsController.updateUnregisteredContacts();
        contactsController.getNotificationCenter().postNotificationName(NotificationCenter.contactsDidLoad, new Object[0]);
        if (i != 1 && !z) {
            contactsController.saveContactsLoadTime();
        } else {
            contactsController.reloadContactsStatusesMaybe(false);
        }
        if (z2) {
            contactsController.loadContacts(false, 0L);
        }
    }

    public static void $r8$lambda$I6NjXpJ1ep04JxrgdpS_MC9aSU8(final ContactsController contactsController, final HashMap map, final HashMap map2) {
        contactsController.getClass();
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                ContactsController.m412$r8$lambda$cL9qTXJ9G8sZHvZemeEl1tk_lY(this.f$0, map, map2);
            }
        });
        if (contactsController.contactsSyncInProgress) {
            return;
        }
        contactsController.contactsSyncInProgress = true;
        contactsController.getMessagesStorage().getCachedPhoneBook(false);
    }

    public static void m412$r8$lambda$cL9qTXJ9G8sZHvZemeEl1tk_lY(ContactsController contactsController, HashMap map, HashMap map2) {
        contactsController.contactsByPhone = map;
        contactsController.contactsByShortPhone = map2;
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

    public void mergePhonebookAndTelegramContacts(HashMap<String, ArrayList<Object>> map, ArrayList<String> arrayList, HashMap<String, Contact> map2) {
        mergePhonebookAndTelegramContacts(map, arrayList, map2, true);
    }

    private void mergePhonebookAndTelegramContacts(final HashMap<String, ArrayList<Object>> map, final ArrayList<String> arrayList, final HashMap<String, Contact> map2, final boolean z) {
        final ArrayList arrayList2 = new ArrayList(this.contacts);
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                ContactsController.$r8$lambda$aFecLyzFUcMB3rGVfISfk6kFunQ(this.f$0, z, arrayList2, map2, map, arrayList);
            }
        });
    }

    public static void $r8$lambda$aFecLyzFUcMB3rGVfISfk6kFunQ(final ContactsController contactsController, boolean z, ArrayList arrayList, final HashMap map, final HashMap map2, final ArrayList arrayList2) {
        contactsController.getClass();
        if (z) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                TLRPC.User user = contactsController.getMessagesController().getUser(Long.valueOf(((TLRPC.TL_contact) arrayList.get(i)).user_id));
                if (user != null && !TextUtils.isEmpty(user.phone)) {
                    String str = user.phone;
                    Contact contact = (Contact) map.get(str.substring(Math.max(0, str.length() - 7)));
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
                    return ContactsController.m408$r8$lambda$WzPKw0eDXIhv6oQVE8ad2kfSmY(localeCollator, obj, obj2);
                }
            });
        }
        Collections.sort(arrayList2, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return ContactsController.$r8$lambda$LmjoaGJCZKV1FB4RaDKP3eteBZo(localeCollator, (String) obj, (String) obj2);
            }
        });
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ContactsController.$r8$lambda$PNFsHfNynRpoGoAiTkc0RHopmCU(this.f$0, arrayList2, map, map2);
            }
        });
    }

    public static int m408$r8$lambda$WzPKw0eDXIhv6oQVE8ad2kfSmY(Collator collator, Object obj, Object obj2) {
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

    public static int $r8$lambda$LmjoaGJCZKV1FB4RaDKP3eteBZo(Collator collator, String str, String str2) {
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

    public static void $r8$lambda$PNFsHfNynRpoGoAiTkc0RHopmCU(ContactsController contactsController, ArrayList arrayList, HashMap map, HashMap map2) {
        contactsController.phoneBookSectionsArray = arrayList;
        contactsController.phoneBookByShortPhones = map;
        contactsController.phoneBookSectionsDict = map2;
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
                return ContactsController.$r8$lambda$yGcrFYDPChyOJMc3cE_7E1f7VFk(localeCollator, (ContactsController.Contact) obj, (ContactsController.Contact) obj2);
            }
        });
        this.phoneBookContacts = arrayList;
    }

    public static int $r8$lambda$yGcrFYDPChyOJMc3cE_7E1f7VFk(Collator collator, Contact contact, Contact contact2) {
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
                    ContactsController contactsController = this.f$0;
                    return localeCollator.compare(UserObject.getFirstName(contactsController.getMessagesController().getUser(Long.valueOf(((TLRPC.TL_contact) obj).user_id))), UserObject.getFirstName(contactsController.getMessagesController().getUser(Long.valueOf(((TLRPC.TL_contact) obj2).user_id))));
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
                return ContactsController.m415$r8$lambda$hj1bMqpqHFptNGw1SaNPswetxQ(localeCollator, (String) obj, (String) obj2);
            }
        });
        this.usersSectionsDict = map;
        this.sortedUsersSectionsArray = arrayList;
    }

    public static int m415$r8$lambda$hj1bMqpqHFptNGw1SaNPswetxQ(Collator collator, String str, String str2) {
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

    public static boolean hasContactsPermission() {
        if (Build.VERSION.SDK_INT >= 23) {
            return ApplicationLoader.applicationContext.checkSelfPermission("android.permission.READ_CONTACTS") == 0;
        }
        Cursor cursorQuery = null;
        try {
            cursorQuery = ApplicationLoader.applicationContext.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, projectionPhones, null, null, null);
            if (cursorQuery == null || cursorQuery.getCount() == 0) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                        return false;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                return false;
            }
        } catch (Throwable th) {
            try {
                FileLog.e(th);
                return true;
            } finally {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Exception e2) {
                        FileLog.e(e2);
                    }
                }
            }
        }
        return true;
    }

    public static boolean hasContactsWritePermission() {
        return Build.VERSION.SDK_INT < 23 || ApplicationLoader.applicationContext.checkSelfPermission("android.permission.WRITE_CONTACTS") == 0;
    }

    public void performWriteContactsToPhoneBookInternal(ArrayList<TLRPC.TL_contact> arrayList) throws Throwable {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Cursor cursor = null;
        try {
            try {
                Account account = this.systemAccount;
                if (hasContactsPermission() && account != null && hasContactsWritePermission()) {
                    SharedPreferences mainSettings = MessagesController.getMainSettings(this.currentAccount);
                    boolean z = mainSettings.getBoolean("contacts_updated_v7", false);
                    boolean z2 = !z;
                    if (!z) {
                        mainSettings.edit().putBoolean("contacts_updated_v7", true).commit();
                    }
                    ContentResolver contentResolver = ApplicationLoader.applicationContext.getContentResolver();
                    Cursor cursorQuery = contentResolver.query(ContactsContract.RawContacts.CONTENT_URI, new String[]{"_id", "sync2"}, null, null, null);
                    try {
                        LongSparseArray longSparseArray = new LongSparseArray();
                        if (cursorQuery != null) {
                            while (cursorQuery.moveToNext()) {
                                longSparseArray.put(cursorQuery.getLong(1), Long.valueOf(cursorQuery.getLong(0)));
                            }
                            cursorQuery.close();
                            FileLog.d("performWriteContactsToPhoneBookInternal contacts array " + arrayList.size() + " " + z2 + " bookContactsSize=" + longSparseArray.size() + " currentAccount=" + this.currentAccount);
                            ArrayList<ContentProviderOperation> arrayList2 = null;
                            for (int i = 0; i < arrayList.size(); i++) {
                                TLRPC.TL_contact tL_contact = arrayList.get(i);
                                if (!z || longSparseArray.indexOfKey(tL_contact.user_id) < 0) {
                                    if (arrayList2 == null) {
                                        arrayList2 = new ArrayList<>();
                                    }
                                    applyContactToPhoneBook(arrayList2, getMessagesController().getUser(Long.valueOf(tL_contact.user_id)));
                                    if (arrayList2.size() > 450) {
                                        contentResolver.applyBatch("com.android.contacts", arrayList2);
                                        arrayList2.clear();
                                    }
                                }
                            }
                            if (arrayList2 != null && !arrayList2.isEmpty()) {
                                contentResolver.applyBatch("com.android.contacts", arrayList2);
                                arrayList2.clear();
                            }
                        } else {
                            cursor = cursorQuery;
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                    } catch (Exception e) {
                        e = e;
                        cursor = cursorQuery;
                        FileLog.e(e);
                        if (cursor != null) {
                            cursor.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                    FileLog.d("performWriteContactsToPhoneBookInternal " + (System.currentTimeMillis() - jCurrentTimeMillis));
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void performWriteContactsToPhoneBook() {
        final ArrayList arrayList = new ArrayList(this.contacts);
        Utilities.phoneBookQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                this.f$0.performWriteContactsToPhoneBookInternal(arrayList);
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
                    ContactsController.$r8$lambda$i6I92fR3o5e1_10D9G6WfCv50n0(this.f$0, l2);
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
                    this.f$0.loadContacts(false, 0L);
                }
            });
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ContactsController.$r8$lambda$zkbh6flya9SMla74sF1IXwmafi8(this.f$0, arrayList2, arrayList3);
                }
            });
        }
    }

    public static void $r8$lambda$i6I92fR3o5e1_10D9G6WfCv50n0(ContactsController contactsController, Long l) {
        contactsController.getClass();
        contactsController.deleteContactFromPhoneBook(l.longValue());
    }

    public static void $r8$lambda$zkbh6flya9SMla74sF1IXwmafi8(ContactsController contactsController, ArrayList arrayList, ArrayList arrayList2) {
        contactsController.getClass();
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList.get(i);
            if (contactsController.contactsDict.get(Long.valueOf(tL_contact.user_id)) == null) {
                contactsController.contacts.add(tL_contact);
                contactsController.contactsDict.put(Long.valueOf(tL_contact.user_id), tL_contact);
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            Long l = (Long) arrayList2.get(i2);
            TLRPC.TL_contact tL_contact2 = contactsController.contactsDict.get(l);
            if (tL_contact2 != null) {
                contactsController.contacts.remove(tL_contact2);
                contactsController.contactsDict.remove(l);
            }
        }
        if (!arrayList.isEmpty()) {
            contactsController.updateUnregisteredContacts();
            contactsController.performWriteContactsToPhoneBook();
        }
        contactsController.performSyncPhoneBook(contactsController.getContactsCopy(contactsController.contactsBook), false, false, false, false, true, false);
        contactsController.buildContactsSectionsArrays(!arrayList.isEmpty());
        contactsController.getNotificationCenter().postNotificationName(NotificationCenter.contactsDidLoad, new Object[0]);
    }

    public void processContactsUpdates(ArrayList<Long> arrayList, ConcurrentHashMap<Long, TLRPC.User> concurrentHashMap) {
        int iIndexOf;
        int iIndexOf2;
        ArrayList<TLRPC.TL_contact> arrayList2 = new ArrayList<>();
        ArrayList<Long> arrayList3 = new ArrayList<>();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Long l = arrayList.get(i);
            i++;
            Long l2 = l;
            if (l2.longValue() > 0) {
                TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                tL_contact.user_id = l2.longValue();
                arrayList2.add(tL_contact);
                if (!this.delayedContactsUpdate.isEmpty() && (iIndexOf = this.delayedContactsUpdate.indexOf(Long.valueOf(-l2.longValue()))) != -1) {
                    this.delayedContactsUpdate.remove(iIndexOf);
                }
            } else if (l2.longValue() < 0) {
                arrayList3.add(Long.valueOf(-l2.longValue()));
                if (!this.delayedContactsUpdate.isEmpty() && (iIndexOf2 = this.delayedContactsUpdate.indexOf(Long.valueOf(-l2.longValue()))) != -1) {
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
        String str = name;
        builderNewInsert4.withValue("data1", Long.valueOf(user.id));
        builderNewInsert4.withValue("data2", "Telegram Voice Call");
        builderNewInsert4.withValue("data3", LocaleController.formatString("ContactShortcutVoiceCall", R.string.ContactShortcutVoiceCall, str));
        builderNewInsert4.withValue("data4", Long.valueOf(user.id));
        arrayList.add(builderNewInsert4.build());
        ContentProviderOperation.Builder builderNewInsert5 = ContentProviderOperation.newInsert(uri);
        builderNewInsert5.withValueBackReference("raw_contact_id", size);
        builderNewInsert5.withValue("mimetype", "vnd.android.cursor.item/vnd.org.telegram.messenger.android.call.video");
        builderNewInsert5.withValue("data1", Long.valueOf(user.id));
        builderNewInsert5.withValue("data2", "Telegram Video Call");
        builderNewInsert5.withValue("data3", LocaleController.formatString("ContactShortcutVideoCall", R.string.ContactShortcutVideoCall, str));
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
                ContactsController.m401$r8$lambda$KdxsDzNdBySWkSquPm6yasNp8U(str);
            }
        });
    }

    public static void m401$r8$lambda$KdxsDzNdBySWkSquPm6yasNp8U(String str) {
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
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException {
                ContactsController.$r8$lambda$WMOqe2SZnqwy1urgVCcm1dIWs1c(this.f$0, user, tLObject, tL_error);
            }
        }, 6);
    }

    public static void $r8$lambda$WMOqe2SZnqwy1urgVCcm1dIWs1c(final ContactsController contactsController, final TLRPC.User user, TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException {
        int iIndexOf;
        contactsController.getClass();
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
        contactsController.getMessagesController().processUpdates(updates, false);
        for (int i2 = 0; i2 < updates.users.size(); i2++) {
            final TLRPC.User user2 = updates.users.get(i2);
            if (user2.id == user.id) {
                Utilities.phoneBookQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.addContactToPhoneBook(user2, true);
                    }
                });
                TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                tL_contact.user_id = user2.id;
                ArrayList<TLRPC.TL_contact> arrayList = new ArrayList<>();
                arrayList.add(tL_contact);
                contactsController.getMessagesStorage().putContacts(arrayList, false);
                if (!TextUtils.isEmpty(user2.phone)) {
                    formatName(user2.first_name, user2.last_name);
                    contactsController.getMessagesStorage().applyPhoneBookUpdates(user2.phone, "");
                    Contact contact = contactsController.contactsBookSPhones.get(user2.phone);
                    if (contact != null && (iIndexOf = contact.shortPhones.indexOf(user2.phone)) != -1) {
                        contact.phoneDeleted.set(iIndexOf, 0);
                    }
                }
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ContactsController.m413$r8$lambda$dnmSr_UMKHuy09fawHYxlZ6qOc(this.f$0, updates, user);
            }
        });
    }

    public static void m413$r8$lambda$dnmSr_UMKHuy09fawHYxlZ6qOc(ContactsController contactsController, TLRPC.Updates updates, TLRPC.User user) {
        Contact contact;
        contactsController.getClass();
        boolean z = false;
        for (int i = 0; i < updates.users.size(); i++) {
            TLRPC.User user2 = updates.users.get(i);
            if (user2.contact && (contact = contactsController.contactsBookSPhones.get(user2.phone)) != null) {
                String letter = contact.getLetter();
                String letter2 = Contact.getLetter(user.first_name, user.last_name);
                if (contact.user == null) {
                    contact.user = user;
                    if (!letter.equals(letter2)) {
                        ArrayList<Object> arrayList = contactsController.phoneBookSectionsDict.get(letter2);
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                            contactsController.phoneBookSectionsDict.put(letter2, arrayList);
                            contactsController.phoneBookSectionsArray.add(letter2);
                        }
                        arrayList.add(contact);
                        ArrayList<Object> arrayList2 = contactsController.phoneBookSectionsDict.get(letter);
                        if (arrayList2 != null) {
                            int size = arrayList2.size();
                            int i2 = 0;
                            while (i2 < size) {
                                Object obj = arrayList2.get(i2);
                                i2++;
                                if (obj instanceof Contact) {
                                    Contact contact2 = (Contact) obj;
                                    if (contact2.contact_id == contact.contact_id) {
                                        if (!arrayList2.remove(contact2) || !arrayList2.isEmpty()) {
                                            break;
                                            break;
                                        } else {
                                            contactsController.phoneBookSectionsDict.remove(letter);
                                            contactsController.phoneBookSectionsArray.remove(letter);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z = true;
                }
            }
            if (user2.contact && contactsController.contactsDict.get(Long.valueOf(user2.id)) == null) {
                TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                tL_contact.user_id = user2.id;
                contactsController.contacts.add(tL_contact);
                contactsController.contactsDict.put(Long.valueOf(tL_contact.user_id), tL_contact);
            }
        }
        contactsController.buildContactsSectionsArrays(true);
        if (z) {
            contactsController.mergePhonebookAndTelegramContacts(contactsController.phoneBookSectionsDict, contactsController.phoneBookSectionsArray, contactsController.phoneBookByShortPhones, false);
        }
        contactsController.getNotificationCenter().postNotificationName(NotificationCenter.contactsDidLoad, new Object[0]);
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
        getNotificationCenter().postNotificationName(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
        getNotificationCenter().postNotificationName(NotificationCenter.contactsDidLoad, new Object[0]);
        Bulletin.SimpleLayout simpleLayout = new Bulletin.SimpleLayout(context, baseFragment.getResourceProvider());
        simpleLayout.setTimer();
        simpleLayout.textView.setText(LocaleController.formatPluralString("ContactsDeletedUndo", map.size(), new Object[0]));
        Bulletin.UndoButton undoButton = new Bulletin.UndoButton(context, true, true, baseFragment.getResourceProvider());
        undoButton.setUndoAction(new Runnable() {
            @Override
            public final void run() {
                ContactsController.$r8$lambda$sGf3d0To3WbbqYRY5rfRt4ZCE0g(this.f$0, map);
            }
        });
        undoButton.setDelayedAction(new Runnable() {
            @Override
            public final void run() {
                this.f$0.deleteContact(arrayList, false);
            }
        });
        simpleLayout.setButton(undoButton);
        Bulletin.make(baseFragment, simpleLayout, 5000).show();
    }

    public static void $r8$lambda$sGf3d0To3WbbqYRY5rfRt4ZCE0g(ContactsController contactsController, HashMap map) {
        contactsController.getClass();
        for (Map.Entry entry : map.entrySet()) {
            TLRPC.User user = (TLRPC.User) entry.getKey();
            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) entry.getValue();
            user.contact = true;
            contactsController.contacts.add(tL_contact);
            contactsController.contactsDict.put(Long.valueOf(user.id), tL_contact);
        }
        contactsController.buildContactsSectionsArrays(true);
        contactsController.getNotificationCenter().postNotificationName(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
        contactsController.getNotificationCenter().postNotificationName(NotificationCenter.contactsDidLoad, new Object[0]);
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
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException {
                ContactsController.$r8$lambda$Uut7dQkVNNt0ILgqBBwZu6CLlYs(this.f$0, arrayList2, arrayList, z, str, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$Uut7dQkVNNt0ILgqBBwZu6CLlYs(final ContactsController contactsController, ArrayList arrayList, final ArrayList arrayList2, final boolean z, final String str, TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException {
        int iIndexOf;
        if (tL_error != null) {
            contactsController.getClass();
            return;
        }
        contactsController.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
        contactsController.getMessagesStorage().deleteContacts(arrayList);
        Utilities.phoneBookQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                ContactsController.m418$r8$lambda$xLhJdolOg4uQPwq5ga5LWgeT4I(this.f$0, arrayList2);
            }
        });
        for (int i = 0; i < arrayList2.size(); i++) {
            TLRPC.User user = (TLRPC.User) arrayList2.get(i);
            if (!TextUtils.isEmpty(user.phone)) {
                contactsController.getMessagesStorage().applyPhoneBookUpdates(user.phone, "");
                Contact contact = contactsController.contactsBookSPhones.get(user.phone);
                if (contact != null && (iIndexOf = contact.shortPhones.indexOf(user.phone)) != -1) {
                    contact.phoneDeleted.set(iIndexOf, 1);
                }
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ContactsController.$r8$lambda$v_d5dY2ByvRIMrfpKdyszndFuv8(this.f$0, arrayList2, z, str);
            }
        });
    }

    public static void m418$r8$lambda$xLhJdolOg4uQPwq5ga5LWgeT4I(ContactsController contactsController, ArrayList arrayList) {
        contactsController.getClass();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            contactsController.deleteContactFromPhoneBook(((TLRPC.User) obj).id);
        }
    }

    public static void $r8$lambda$v_d5dY2ByvRIMrfpKdyszndFuv8(ContactsController contactsController, ArrayList arrayList, boolean z, String str) {
        contactsController.getClass();
        int size = arrayList.size();
        int i = 0;
        boolean z2 = false;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            TLRPC.User user = (TLRPC.User) obj;
            TLRPC.TL_contact tL_contact = contactsController.contactsDict.get(Long.valueOf(user.id));
            if (tL_contact != null) {
                contactsController.contacts.remove(tL_contact);
                contactsController.contactsDict.remove(Long.valueOf(user.id));
                z2 = true;
            }
        }
        if (z2) {
            contactsController.buildContactsSectionsArrays(false);
        }
        contactsController.getNotificationCenter().postNotificationName(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
        contactsController.getNotificationCenter().postNotificationName(NotificationCenter.contactsDidLoad, new Object[0]);
        if (z) {
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.showBulletin, 1, LocaleController.formatString("DeletedFromYourContacts", R.string.DeletedFromYourContacts, str));
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
                ContactsController.$r8$lambda$lZKMTjXNb2O_STtGGPdSg_dVEiw(this.f$0, editorEdit, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$lZKMTjXNb2O_STtGGPdSg_dVEiw(final ContactsController contactsController, final SharedPreferences.Editor editor, final TLObject tLObject, TLRPC.TL_error tL_error) {
        contactsController.getClass();
        if (tLObject instanceof Vector) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ContactsController.m405$r8$lambda$TOvYMlA3iNJx3_7sqUtCyo_U9c(this.f$0, editor, tLObject);
                }
            });
        }
    }

    public static void m405$r8$lambda$TOvYMlA3iNJx3_7sqUtCyo_U9c(ContactsController contactsController, SharedPreferences.Editor editor, TLObject tLObject) {
        contactsController.getClass();
        editor.remove("needGetStatuses").commit();
        Vector vector = (Vector) tLObject;
        if (!vector.objects.isEmpty()) {
            ArrayList<TLRPC.User> arrayList = new ArrayList<>();
            ArrayList<T> arrayList2 = vector.objects;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                TLRPC.TL_user tL_user = new TLRPC.TL_user();
                TLRPC.TL_contactStatus tL_contactStatus = (TLRPC.TL_contactStatus) obj;
                if (tL_contactStatus != null) {
                    TLRPC.UserStatus userStatus = tL_contactStatus.status;
                    if (userStatus instanceof TLRPC.TL_userStatusRecently) {
                        userStatus.expires = userStatus.by_me ? -1000 : -100;
                    } else if (userStatus instanceof TLRPC.TL_userStatusLastWeek) {
                        userStatus.expires = userStatus.by_me ? -1001 : -101;
                    } else if (userStatus instanceof TLRPC.TL_userStatusLastMonth) {
                        userStatus.expires = userStatus.by_me ? -1002 : -102;
                    }
                    TLRPC.User user = contactsController.getMessagesController().getUser(Long.valueOf(tL_contactStatus.user_id));
                    if (user != null) {
                        user.status = tL_contactStatus.status;
                    }
                    tL_user.status = tL_contactStatus.status;
                    arrayList.add(tL_user);
                }
            }
            contactsController.getMessagesStorage().updateUsers(arrayList, true, true, true);
        }
        contactsController.getNotificationCenter().postNotificationName(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_STATUS));
    }

    public void loadGlobalPrivacySetting() {
        if (this.loadingGlobalSettings == 0) {
            this.loadingGlobalSettings = 1;
            getConnectionsManager().sendRequest(new TL_account.getGlobalPrivacySettings(), new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    ContactsController.$r8$lambda$tf17IN6fDKrdHdEkEukmFucVfrY(this.f$0, tLObject, tL_error);
                }
            });
        }
    }

    public static void $r8$lambda$tf17IN6fDKrdHdEkEukmFucVfrY(final ContactsController contactsController, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        contactsController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ContactsController.m404$r8$lambda$QeuYjZ85W8_XtjVCKOQwkDyCKA(this.f$0, tL_error, tLObject);
            }
        });
    }

    public static void m404$r8$lambda$QeuYjZ85W8_XtjVCKOQwkDyCKA(ContactsController contactsController, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            contactsController.getClass();
            contactsController.globalPrivacySettings = (TLRPC.GlobalPrivacySettings) tLObject;
            contactsController.loadingGlobalSettings = 2;
        } else {
            contactsController.loadingGlobalSettings = 0;
        }
        contactsController.getNotificationCenter().postNotificationName(NotificationCenter.privacyRulesUpdated, new Object[0]);
    }

    public void loadPrivacySettings() {
        loadPrivacySettings(false);
    }

    public void loadPrivacySettings(boolean z) {
        TL_account.getPrivacy getprivacy;
        if (this.loadingDeleteInfo == 0) {
            this.loadingDeleteInfo = 1;
            getConnectionsManager().sendRequest(new TL_account.getAccountTTL(), new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    ContactsController.$r8$lambda$ALc_1dACp70c0iWpt0jc6LW3YRQ(this.f$0, tLObject, tL_error);
                }
            });
        }
        loadGlobalPrivacySetting();
        final int i = 0;
        while (true) {
            int[] iArr = this.loadingPrivacyInfo;
            if (i >= iArr.length) {
                getNotificationCenter().postNotificationName(NotificationCenter.privacyRulesUpdated, new Object[0]);
                return;
            }
            if (z) {
                if (iArr[i] != 1) {
                    iArr[i] = 1;
                    getprivacy = new TL_account.getPrivacy();
                    switch (i) {
                        case 0:
                            getprivacy.key = new TLRPC.TL_inputPrivacyKeyStatusTimestamp();
                            break;
                        case 1:
                            getprivacy.key = new TLRPC.TL_inputPrivacyKeyChatInvite();
                            break;
                        case 2:
                            getprivacy.key = new TLRPC.TL_inputPrivacyKeyPhoneCall();
                            break;
                        case 3:
                            getprivacy.key = new TLRPC.TL_inputPrivacyKeyPhoneP2P();
                            break;
                        case 4:
                            getprivacy.key = new TLRPC.TL_inputPrivacyKeyProfilePhoto();
                            break;
                        case 5:
                            getprivacy.key = new TLRPC.TL_inputPrivacyKeyForwards();
                            break;
                        case 6:
                            getprivacy.key = new TLRPC.TL_inputPrivacyKeyPhoneNumber();
                            break;
                        case 7:
                            getprivacy.key = new TLRPC.TL_inputPrivacyKeyAddedByPhone();
                            break;
                        case 8:
                            getprivacy.key = new TLRPC.TL_inputPrivacyKeyVoiceMessages();
                            break;
                        case 9:
                            getprivacy.key = new TLRPC.TL_inputPrivacyKeyAbout();
                            break;
                        case 10:
                        default:
                            continue;
                            continue;
                        case 11:
                            getprivacy.key = new TLRPC.TL_inputPrivacyKeyBirthday();
                            break;
                        case 12:
                            getprivacy.key = new TLRPC.TL_inputPrivacyKeyStarGiftsAutoSave();
                            break;
                        case 13:
                            getprivacy.key = new TLRPC.TL_inputPrivacyKeyNoPaidMessages();
                            break;
                        case 14:
                            getprivacy.key = new TLRPC.TL_inputPrivacyKeySavedMusic();
                            break;
                    }
                    getConnectionsManager().sendRequest(getprivacy, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            ContactsController.m411$r8$lambda$brnNmFoFrGQlcVWonzCFJH2XeE(this.f$0, i, tLObject, tL_error);
                        }
                    });
                }
            } else if (iArr[i] == 0) {
                iArr[i] = 1;
                getprivacy = new TL_account.getPrivacy();
                switch (i) {
                    case 0:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyStatusTimestamp();
                        break;
                    case 1:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyChatInvite();
                        break;
                    case 2:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyPhoneCall();
                        break;
                    case 3:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyPhoneP2P();
                        break;
                    case 4:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyProfilePhoto();
                        break;
                    case 5:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyForwards();
                        break;
                    case 6:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyPhoneNumber();
                        break;
                    case 7:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyAddedByPhone();
                        break;
                    case 8:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyVoiceMessages();
                        break;
                    case 9:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyAbout();
                        break;
                    case 10:
                    default:
                        continue;
                        continue;
                    case 11:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyBirthday();
                        break;
                    case 12:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyStarGiftsAutoSave();
                        break;
                    case 13:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyNoPaidMessages();
                        break;
                    case 14:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeySavedMusic();
                        break;
                }
                getConnectionsManager().sendRequest(getprivacy, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        ContactsController.m411$r8$lambda$brnNmFoFrGQlcVWonzCFJH2XeE(this.f$0, i, tLObject, tL_error);
                    }
                });
            }
            i++;
        }
    }

    public static void $r8$lambda$ALc_1dACp70c0iWpt0jc6LW3YRQ(final ContactsController contactsController, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        contactsController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ContactsController.m395$r8$lambda$21SCJa7j9t8TgEA_pMr4c7txqE(this.f$0, tL_error, tLObject);
            }
        });
    }

    public static void m395$r8$lambda$21SCJa7j9t8TgEA_pMr4c7txqE(ContactsController contactsController, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            contactsController.getClass();
            contactsController.deleteAccountTTL = ((TLRPC.TL_accountDaysTTL) tLObject).days;
            contactsController.loadingDeleteInfo = 2;
        } else {
            contactsController.loadingDeleteInfo = 0;
        }
        contactsController.getNotificationCenter().postNotificationName(NotificationCenter.privacyRulesUpdated, new Object[0]);
    }

    public static void m411$r8$lambda$brnNmFoFrGQlcVWonzCFJH2XeE(final ContactsController contactsController, final int i, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        contactsController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ContactsController.m403$r8$lambda$PorMFGOnt91XsHK5vYPTvJ1Bc(this.f$0, tL_error, tLObject, i);
            }
        });
    }

    public static void m403$r8$lambda$PorMFGOnt91XsHK5vYPTvJ1Bc(ContactsController contactsController, TLRPC.TL_error tL_error, TLObject tLObject, int i) {
        if (tL_error == null) {
            contactsController.getClass();
            TL_account.privacyRules privacyrules = (TL_account.privacyRules) tLObject;
            contactsController.getMessagesController().putUsers(privacyrules.users, false);
            contactsController.getMessagesController().putChats(privacyrules.chats, false);
            switch (i) {
                case 0:
                    contactsController.lastseenPrivacyRules = privacyrules.rules;
                    break;
                case 1:
                    contactsController.groupPrivacyRules = privacyrules.rules;
                    break;
                case 2:
                    contactsController.callPrivacyRules = privacyrules.rules;
                    break;
                case 3:
                    contactsController.p2pPrivacyRules = privacyrules.rules;
                    break;
                case 4:
                    contactsController.profilePhotoPrivacyRules = privacyrules.rules;
                    break;
                case 5:
                    contactsController.forwardsPrivacyRules = privacyrules.rules;
                    break;
                case 6:
                    contactsController.phonePrivacyRules = privacyrules.rules;
                    break;
                case 7:
                case 10:
                default:
                    contactsController.addedByPhonePrivacyRules = privacyrules.rules;
                    break;
                case 8:
                    contactsController.voiceMessagesRules = privacyrules.rules;
                    break;
                case 9:
                    contactsController.bioPrivacyRules = privacyrules.rules;
                    break;
                case 11:
                    contactsController.birthdayPrivacyRules = privacyrules.rules;
                    break;
                case 12:
                    contactsController.giftsPrivacyRules = privacyrules.rules;
                    break;
                case 13:
                    contactsController.noPaidMessagesPrivacyRules = privacyrules.rules;
                    break;
                case 14:
                    contactsController.musicPrivacyRules = privacyrules.rules;
                    break;
            }
            contactsController.loadingPrivacyInfo[i] = 2;
        } else {
            contactsController.loadingPrivacyInfo[i] = 0;
        }
        contactsController.getNotificationCenter().postNotificationName(NotificationCenter.privacyRulesUpdated, new Object[0]);
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
        getNotificationCenter().postNotificationName(NotificationCenter.privacyRulesUpdated, new Object[0]);
        reloadContactsStatuses();
    }

    public void createOrUpdateConnectionServiceContact(long j, String str, String str2) {
        int i;
        if (!hasContactsPermission()) {
            return;
        }
        try {
            ContentResolver contentResolver = ApplicationLoader.applicationContext.getContentResolver();
            ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
            Uri uriBuild = ContactsContract.Groups.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").build();
            Uri uriBuild2 = ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").build();
            Account account = this.systemAccount;
            Cursor cursorQuery = contentResolver.query(uriBuild, new String[]{"_id"}, "title=? AND account_type=? AND account_name=?", new String[]{"TelegramConnectionService", account.type, account.name}, null);
            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                i = cursorQuery.getInt(0);
            } else {
                ContentValues contentValues = new ContentValues();
                contentValues.put("account_type", this.systemAccount.type);
                contentValues.put("account_name", this.systemAccount.name);
                contentValues.put("group_visible", (Integer) 0);
                contentValues.put("group_is_read_only", (Integer) 1);
                contentValues.put("title", "TelegramConnectionService");
                i = Integer.parseInt(contentResolver.insert(uriBuild, contentValues).getLastPathSegment());
            }
            if (cursorQuery != 0) {
                cursorQuery.close();
            }
            Uri uri = ContactsContract.Data.CONTENT_URI;
            Cursor cursorQuery2 = contentResolver.query(uri, new String[]{"raw_contact_id"}, "mimetype=? AND data1=?", new String[]{"vnd.android.cursor.item/group_membership", i + ""}, null);
            int size = arrayList.size();
            int i2 = i;
            if (cursorQuery2 != null) {
                try {
                    if (cursorQuery2.moveToFirst()) {
                        int i3 = cursorQuery2.getInt(0);
                        arrayList.add(ContentProviderOperation.newUpdate(uriBuild2).withSelection("_id=?", new String[]{i3 + ""}).withValue("deleted", 0).build());
                        arrayList.add(ContentProviderOperation.newUpdate(uri).withSelection("raw_contact_id=? AND mimetype=?", new String[]{i3 + "", "vnd.android.cursor.item/phone_v2"}).withValue("data1", "+99084" + j).build());
                        arrayList.add(ContentProviderOperation.newUpdate(uri).withSelection("raw_contact_id=? AND mimetype=?", new String[]{i3 + "", "vnd.android.cursor.item/name"}).withValue("data2", str).withValue("data3", str2).build());
                    } else {
                        try {
                            arrayList.add(ContentProviderOperation.newInsert(uriBuild2).withValue("account_type", this.systemAccount.type).withValue("account_name", this.systemAccount.name).withValue("raw_contact_is_read_only", 1).withValue("aggregation_mode", 3).build());
                            arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/name").withValue("data2", str).withValue("data3", str2).build());
                            arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("data1", "+99084" + j).build());
                            arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/group_membership").withValue("data1", Integer.valueOf(i2)).build());
                        } catch (Exception e) {
                            e = e;
                            FileLog.e(e);
                            return;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    FileLog.e(e);
                    return;
                }
            } else {
                arrayList.add(ContentProviderOperation.newInsert(uriBuild2).withValue("account_type", this.systemAccount.type).withValue("account_name", this.systemAccount.name).withValue("raw_contact_is_read_only", 1).withValue("aggregation_mode", 3).build());
                arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/name").withValue("data2", str).withValue("data3", str2).build());
                arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("data1", "+99084" + j).build());
                arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/group_membership").withValue("data1", Integer.valueOf(i2)).build());
            }
            if (cursorQuery2 != 0) {
                cursorQuery2.close();
            }
            contentResolver.applyBatch("com.android.contacts", arrayList);
        } catch (Exception e3) {
            e = e3;
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
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TLRPC.PrivacyRule privacyRule = arrayList.get(i);
            i++;
            TLRPC.PrivacyRule privacyRule2 = privacyRule;
            if (cls.isInstance(privacyRule2)) {
                return cls.cast(privacyRule2);
            }
        }
        return null;
    }
}
