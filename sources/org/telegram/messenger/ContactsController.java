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
import j$.util.concurrent.ConcurrentHashMap;
import java.text.CollationKey;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;

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
            if (TextUtils.isEmpty(str)) {
                return !TextUtils.isEmpty(str2) ? str2.substring(0, 1) : "#";
            }
            return str.substring(0, 1);
        }
    }

    public class MyContentObserver extends ContentObserver {
        private Runnable checkRunnable;

        public MyContentObserver() {
            super(null);
            this.checkRunnable = new w1(0);
        }

        public static void lambda$new$0() {
            for (int i10 = 0; i10 < 4; i10++) {
                if (UserConfig.getInstance(i10).isClientActivated()) {
                    ConnectionsManager.getInstance(i10).resumeNetworkMaybe();
                    ContactsController.getInstance(i10).checkContacts();
                }
            }
        }

        @Override
        public boolean deliverSelfNotifications() {
            return false;
        }

        @Override
        public void onChange(boolean z10) {
            super.onChange(z10);
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

    public class PhoneBookContact {

        String f19609id;
        String lookup_key;
        String name;
        String phone;

        private PhoneBookContact() {
        }
    }

    public ContactsController(int i10) {
        super(i10);
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
        if (i10 == 0) {
            Utilities.globalQueue.postRunnable(new e1(this, 6));
        }
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
        builderNewInsert.withValue("sync2", Long.valueOf(user.f22527id));
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
        builderNewInsert3.withValue("data1", Long.valueOf(user.f22527id));
        builderNewInsert3.withValue("data2", "Telegram Profile");
        builderNewInsert3.withValue("data3", LocaleController.formatString("ContactShortcutMessage", R.string.ContactShortcutMessage, name));
        builderNewInsert3.withValue("data4", Long.valueOf(user.f22527id));
        arrayList.add(builderNewInsert3.build());
        ContentProviderOperation.Builder builderNewInsert4 = ContentProviderOperation.newInsert(uri);
        builderNewInsert4.withValueBackReference("raw_contact_id", size);
        builderNewInsert4.withValue("mimetype", "vnd.android.cursor.item/vnd.org.telegram.messenger.android.call");
        builderNewInsert4.withValue("data1", Long.valueOf(user.f22527id));
        builderNewInsert4.withValue("data2", "Telegram Voice Call");
        builderNewInsert4.withValue("data3", LocaleController.formatString("ContactShortcutVoiceCall", R.string.ContactShortcutVoiceCall, name));
        builderNewInsert4.withValue("data4", Long.valueOf(user.f22527id));
        arrayList.add(builderNewInsert4.build());
        ContentProviderOperation.Builder builderNewInsert5 = ContentProviderOperation.newInsert(uri);
        builderNewInsert5.withValueBackReference("raw_contact_id", size);
        builderNewInsert5.withValue("mimetype", "vnd.android.cursor.item/vnd.org.telegram.messenger.android.call.video");
        builderNewInsert5.withValue("data1", Long.valueOf(user.f22527id));
        builderNewInsert5.withValue("data2", "Telegram Video Call");
        builderNewInsert5.withValue("data3", LocaleController.formatString("ContactShortcutVideoCall", R.string.ContactShortcutVideoCall, name));
        builderNewInsert5.withValue("data4", Long.valueOf(user.f22527id));
        arrayList.add(builderNewInsert5.build());
    }

    private void applyContactsUpdates(ArrayList<Long> arrayList, ConcurrentHashMap<Long, TLRPC.User> concurrentHashMap, ArrayList<TLRPC.TL_contact> arrayList2, ArrayList<Long> arrayList3) {
        int iIndexOf;
        int iIndexOf2;
        if (arrayList2 == null || arrayList3 == null) {
            arrayList2 = new ArrayList<>();
            arrayList3 = new ArrayList<>();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Long l10 = arrayList.get(i10);
                if (l10.longValue() > 0) {
                    TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                    tL_contact.user_id = l10.longValue();
                    arrayList2.add(tL_contact);
                } else if (l10.longValue() < 0) {
                    arrayList3.add(Long.valueOf(-l10.longValue()));
                }
            }
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("process update - contacts add = " + arrayList2.size() + " delete = " + arrayList3.size());
        }
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        int i11 = 0;
        boolean z10 = false;
        while (true) {
            if (i11 >= arrayList2.size()) {
                break;
            }
            TLRPC.TL_contact tL_contact2 = arrayList2.get(i11);
            TLRPC.User user = concurrentHashMap != null ? concurrentHashMap.get(Long.valueOf(tL_contact2.user_id)) : null;
            if (user == null) {
                user = getMessagesController().getUser(Long.valueOf(tL_contact2.user_id));
            } else {
                getMessagesController().putUser(user, true);
            }
            if (user == null || TextUtils.isEmpty(user.phone)) {
                z10 = true;
            } else {
                Contact contact = this.contactsBookSPhones.get(user.phone);
                if (contact != null && (iIndexOf2 = contact.shortPhones.indexOf(user.phone)) != -1) {
                    contact.phoneDeleted.set(iIndexOf2, 0);
                }
                if (sb2.length() != 0) {
                    sb2.append(",");
                }
                sb2.append(user.phone);
            }
            i11++;
        }
        for (int i12 = 0; i12 < arrayList3.size(); i12++) {
            Long l11 = arrayList3.get(i12);
            Utilities.phoneBookQueue.postRunnable(new e3(25, this, l11));
            TLRPC.User user2 = concurrentHashMap != null ? concurrentHashMap.get(l11) : null;
            if (user2 == null) {
                user2 = getMessagesController().getUser(l11);
            } else {
                getMessagesController().putUser(user2, true);
            }
            if (user2 == null) {
                z10 = true;
            } else if (!TextUtils.isEmpty(user2.phone)) {
                Contact contact2 = this.contactsBookSPhones.get(user2.phone);
                if (contact2 != null && (iIndexOf = contact2.shortPhones.indexOf(user2.phone)) != -1) {
                    contact2.phoneDeleted.set(iIndexOf, 1);
                }
                if (sb3.length() != 0) {
                    sb3.append(",");
                }
                sb3.append(user2.phone);
            }
        }
        if (sb2.length() != 0 || sb3.length() != 0) {
            getMessagesStorage().applyPhoneBookUpdates(sb2.toString(), sb3.toString());
        }
        if (z10) {
            Utilities.stageQueue.postRunnable(new e1(this, 3));
        } else {
            AndroidUtilities.runOnUIThread(new f0((BaseController) this, (ArrayList) arrayList2, (Object) arrayList3, 15));
        }
    }

    private void buildContactsSectionsArrays(boolean z10) {
        Collator localeCollator = getLocaleCollator();
        if (z10) {
            Collections.sort(this.contacts, new j1(this, localeCollator, 0));
        }
        HashMap<String, ArrayList<TLRPC.TL_contact>> map = new HashMap<>();
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < this.contacts.size(); i10++) {
            TLRPC.TL_contact tL_contact = this.contacts.get(i10);
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(tL_contact.user_id));
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
                ArrayList<TLRPC.TL_contact> arrayList2 = map.get(upperCase);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                    map.put(upperCase, arrayList2);
                    arrayList.add(upperCase);
                }
                arrayList2.add(tL_contact);
            }
        }
        Collections.sort(arrayList, new k1(localeCollator, 0));
        this.usersSectionsDict = map;
        this.sortedUsersSectionsArray = arrayList;
    }

    private boolean checkContactsInternal() throws Throwable {
        Throwable th;
        boolean z10;
        boolean z11 = false;
        try {
            if (!hasContactsPermission()) {
                return false;
            }
            try {
                Cursor cursorQuery = ApplicationLoader.applicationContext.getContentResolver().query(ContactsContract.RawContacts.CONTENT_URI, new String[]{"version"}, null, null, null);
                if (cursorQuery != null) {
                    try {
                        StringBuilder sb2 = new StringBuilder();
                        while (cursorQuery.moveToNext()) {
                            sb2.append(cursorQuery.getString(cursorQuery.getColumnIndex("version")));
                        }
                        String string = sb2.toString();
                        if (this.lastContactsVersions.length() != 0 && !this.lastContactsVersions.equals(string)) {
                            z11 = true;
                        }
                        try {
                            this.lastContactsVersions = string;
                        } catch (Throwable th2) {
                            z10 = z11;
                            th = th2;
                            try {
                                try {
                                    cursorQuery.close();
                                    throw th;
                                } catch (Exception e9) {
                                    e = e9;
                                    z11 = z10;
                                    FileLog.e(e);
                                    return z11;
                                }
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                                throw th;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        z10 = false;
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        return z11;
    }

    private void deleteContactFromPhoneBook(long j10) {
        if (hasContactsPermission()) {
            synchronized (this.observerLock) {
                this.ignoreChanges = true;
            }
            try {
                ApplicationLoader.applicationContext.getContentResolver().delete(ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", this.systemAccount.name).appendQueryParameter("account_type", this.systemAccount.type).build(), "sync2 = " + j10, null);
            } catch (Exception e9) {
                FileLog.e((Throwable) e9, false);
            }
            synchronized (this.observerLock) {
                this.ignoreChanges = false;
            }
        }
    }

    public static <T extends TLRPC.PrivacyRule> T findRule(ArrayList<TLRPC.PrivacyRule> arrayList, Class<T> cls) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.PrivacyRule privacyRule = arrayList.get(i10);
            i10++;
            TLRPC.PrivacyRule privacyRule2 = privacyRule;
            if (cls.isInstance(privacyRule2)) {
                return cls.cast(privacyRule2);
            }
        }
        return null;
    }

    public static String formatName(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return formatName((TLRPC.User) tLObject);
        }
        return tLObject instanceof TLRPC.Chat ? ((TLRPC.Chat) tLObject).title : LocaleController.getString(R.string.HiddenName);
    }

    private long getContactsHash(ArrayList<TLRPC.TL_contact> arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        Collections.sort(arrayList2, new q(3));
        int size = arrayList2.size();
        long jCalcHash = 0;
        int i10 = -1;
        while (i10 < size) {
            jCalcHash = i10 == -1 ? MediaDataController.calcHash(jCalcHash, getUserConfig().contactsSavedCount) : MediaDataController.calcHash(jCalcHash, ((TLRPC.TL_contact) arrayList2.get(i10)).user_id);
            i10++;
        }
        return jCalcHash;
    }

    public static ContactsController getInstance(int i10) {
        ContactsController contactsController;
        ContactsController contactsController2 = Instance[i10];
        if (contactsController2 != null) {
            return contactsController2;
        }
        synchronized (ContactsController.class) {
            try {
                contactsController = Instance[i10];
                if (contactsController == null) {
                    ContactsController[] contactsControllerArr = Instance;
                    ContactsController contactsController3 = new ContactsController(i10);
                    contactsControllerArr[i10] = contactsController3;
                    contactsController = contactsController3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return contactsController;
    }

    public static Collator getLocaleCollator() {
        if (cachedCollator == null || cachedCollatorLocale != Locale.getDefault()) {
            try {
                Locale locale = Locale.getDefault();
                cachedCollatorLocale = locale;
                Collator collator = Collator.getInstance(locale);
                cachedCollator = collator;
                collator.setStrength(1);
            } catch (Exception e9) {
                FileLog.e((Throwable) e9, true);
            }
        }
        if (cachedCollator == null) {
            try {
                Collator collator2 = Collator.getInstance();
                cachedCollator = collator2;
                collator2.setStrength(1);
            } catch (Exception e10) {
                FileLog.e((Throwable) e10, true);
            }
        }
        if (cachedCollator == null) {
            cachedCollator = new Collator() {
                @Override
                public int compare(String str, String str2) {
                    if (str == null || str2 == null) {
                        return 0;
                    }
                    return str.compareTo(str2);
                }

                @Override
                public CollationKey getCollationKey(String str) {
                    return null;
                }

                @Override
                public int hashCode() {
                    return 0;
                }
            };
        }
        return cachedCollator;
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
                    } catch (Exception e9) {
                        FileLog.e(e9);
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
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
            }
        }
        return true;
    }

    public static boolean hasContactsWritePermission() {
        return Build.VERSION.SDK_INT < 23 || ApplicationLoader.applicationContext.checkSelfPermission("android.permission.WRITE_CONTACTS") == 0;
    }

    private boolean isNotValidNameString(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt >= '0' && cCharAt <= '9') {
                i10++;
            }
        }
        return i10 > 3;
    }

    public void lambda$addContact$50(TLRPC.User user) {
        addContactToPhoneBook(user, true);
    }

    public void lambda$addContact$51(TLRPC.Updates updates, TLRPC.User user) {
        Contact contact;
        boolean z10 = false;
        for (int i10 = 0; i10 < updates.users.size(); i10++) {
            TLRPC.User user2 = updates.users.get(i10);
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
                            int size = arrayList2.size();
                            int i11 = 0;
                            while (i11 < size) {
                                Object obj = arrayList2.get(i11);
                                i11++;
                                if (obj instanceof Contact) {
                                    Contact contact2 = (Contact) obj;
                                    if (contact2.contact_id == contact.contact_id) {
                                        if (!arrayList2.remove(contact2) || !arrayList2.isEmpty()) {
                                            break;
                                            break;
                                        } else {
                                            this.phoneBookSectionsDict.remove(letter);
                                            this.phoneBookSectionsArray.remove(letter);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z10 = true;
                }
            }
            if (user2.contact && this.contactsDict.get(Long.valueOf(user2.f22527id)) == null) {
                TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                tL_contact.user_id = user2.f22527id;
                this.contacts.add(tL_contact);
                this.contactsDict.put(Long.valueOf(tL_contact.user_id), tL_contact);
            }
        }
        buildContactsSectionsArrays(true);
        if (z10) {
            mergePhonebookAndTelegramContacts(this.phoneBookSectionsDict, this.phoneBookSectionsArray, this.phoneBookByShortPhones, false);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsDidLoad, new Object[0]);
    }

    public void lambda$addContact$52(TLRPC.User user, TLObject tLObject, TLRPC.TL_error tL_error) {
        int iIndexOf;
        if (tL_error != null) {
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null && userProfilePhoto.personal) {
            for (int i10 = 0; i10 < updates.users.size(); i10++) {
                if (updates.users.get(i10).f22527id == user.f22527id) {
                    updates.users.get(i10).photo = user.photo;
                }
            }
        }
        getMessagesController().processUpdates(updates, false);
        for (int i11 = 0; i11 < updates.users.size(); i11++) {
            TLRPC.User user2 = updates.users.get(i11);
            if (user2.f22527id == user.f22527id) {
                Utilities.phoneBookQueue.postRunnable(new e3(22, this, user2));
                TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                tL_contact.user_id = user2.f22527id;
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
        AndroidUtilities.runOnUIThread(new f0(this, updates, user, 13));
    }

    public void lambda$applyContactsUpdates$46(Long l10) {
        deleteContactFromPhoneBook(l10.longValue());
    }

    public void lambda$applyContactsUpdates$47() {
        loadContacts(false, 0L);
    }

    public void lambda$applyContactsUpdates$48(ArrayList arrayList, ArrayList arrayList2) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList.get(i10);
            if (this.contactsDict.get(Long.valueOf(tL_contact.user_id)) == null) {
                this.contacts.add(tL_contact);
                this.contactsDict.put(Long.valueOf(tL_contact.user_id), tL_contact);
            }
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            Long l10 = (Long) arrayList2.get(i11);
            TLRPC.TL_contact tL_contact2 = this.contactsDict.get(l10);
            if (tL_contact2 != null) {
                this.contacts.remove(tL_contact2);
                this.contactsDict.remove(l10);
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

    public void lambda$checkAppAccount$4() {
        AccountManager accountManager = AccountManager.get(ApplicationLoader.applicationContext);
        try {
            Account[] accountsByType = accountManager.getAccountsByType("org.telegram.messenger");
            for (int i10 = 0; i10 < accountsByType.length; i10++) {
                Account account = accountsByType[i10];
                int i11 = 0;
                while (true) {
                    if (i11 < 4) {
                        TLRPC.User currentUser = UserConfig.getInstance(i11).getCurrentUser();
                        if (currentUser != null) {
                            if (account.name.equals("" + currentUser.f22527id)) {
                                if (i11 != this.currentAccount) {
                                    break;
                                }
                                this.systemAccount = account;
                                break;
                            }
                        }
                        i11++;
                    } else {
                        try {
                            accountManager.removeAccount(accountsByType[i10], null, null);
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

    public void lambda$checkContacts$5() {
        if (checkContactsInternal()) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("detected contacts change");
            }
            performSyncPhoneBook(getContactsCopy(this.contactsBook), true, false, true, false, true, false);
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

    public void lambda$checkInviteText$3(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            TLRPC.TL_help_inviteText tL_help_inviteText = (TLRPC.TL_help_inviteText) tLObject;
            if (tL_help_inviteText.message.length() != 0) {
                AndroidUtilities.runOnUIThread(new e3(24, this, tL_help_inviteText));
            }
        }
    }

    public void lambda$cleanup$1() {
        this.migratingContacts = false;
        this.completedRequestsCount = 0;
    }

    public void lambda$deleteAllContacts$8(Runnable runnable) {
        AccountManager accountManager = AccountManager.get(ApplicationLoader.applicationContext);
        try {
            Account[] accountsByType = accountManager.getAccountsByType("org.telegram.messenger");
            this.systemAccount = null;
            for (Account account : accountsByType) {
                for (int i10 = 0; i10 < 4; i10++) {
                    TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
                    if (currentUser != null) {
                        if (account.name.equals("" + currentUser.f22527id)) {
                            accountManager.removeAccount(account, null, null);
                            break;
                        }
                    }
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

    public void lambda$deleteAllContacts$9(Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            AndroidUtilities.runOnUIThread(runnable);
            return;
        }
        this.contactsBookSPhones.clear();
        this.contactsBook.clear();
        this.completedRequestsCount = 0;
        this.migratingContacts = false;
        this.contactsSyncInProgress = false;
        this.contactsLoaded = false;
        this.loadingContacts = false;
        this.contactsBookLoaded = false;
        this.lastContactsVersions = "";
        AndroidUtilities.runOnUIThread(new e3(23, this, runnable));
    }

    public void lambda$deleteContact$55(ArrayList arrayList) {
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            deleteContactFromPhoneBook(((TLRPC.User) obj).f22527id);
        }
    }

    public void lambda$deleteContact$56(ArrayList arrayList, boolean z10, String str) {
        int size = arrayList.size();
        boolean z11 = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TLRPC.User user = (TLRPC.User) obj;
            TLRPC.TL_contact tL_contact = this.contactsDict.get(Long.valueOf(user.f22527id));
            if (tL_contact != null) {
                this.contacts.remove(tL_contact);
                this.contactsDict.remove(Long.valueOf(user.f22527id));
                z11 = true;
            }
        }
        if (z11) {
            buildContactsSectionsArrays(false);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsDidLoad, new Object[0]);
        if (z10) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.formatString("DeletedFromYourContacts", R.string.DeletedFromYourContacts, str));
        }
    }

    public void lambda$deleteContact$57(ArrayList arrayList, ArrayList arrayList2, boolean z10, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        int iIndexOf;
        if (tL_error != null) {
            return;
        }
        getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
        getMessagesStorage().deleteContacts(arrayList);
        Utilities.phoneBookQueue.postRunnable(new o1(this, arrayList2, 0));
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            TLRPC.User user = (TLRPC.User) arrayList2.get(i10);
            if (!TextUtils.isEmpty(user.phone)) {
                getMessagesStorage().applyPhoneBookUpdates(user.phone, "");
                Contact contact = this.contactsBookSPhones.get(user.phone);
                if (contact != null && (iIndexOf = contact.shortPhones.indexOf(user.phone)) != -1) {
                    contact.phoneDeleted.set(iIndexOf, 1);
                }
            }
        }
        AndroidUtilities.runOnUIThread(new qj(this, arrayList2, z10, str, 4));
    }

    public void lambda$deleteContactsUndoable$53(HashMap map) {
        for (Map.Entry entry : map.entrySet()) {
            TLRPC.User user = (TLRPC.User) entry.getKey();
            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) entry.getValue();
            user.contact = true;
            this.contacts.add(tL_contact);
            this.contactsDict.put(Long.valueOf(user.f22527id), tL_contact);
        }
        buildContactsSectionsArrays(true);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsDidLoad, new Object[0]);
    }

    public void lambda$deleteContactsUndoable$54(ArrayList arrayList) {
        deleteContact(arrayList, false);
    }

    public void lambda$forceImportContacts$6() {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("force import contacts");
        }
        performSyncPhoneBook(new HashMap<>(), true, true, true, true, false, false);
    }

    public static int lambda$getContactsHash$26(TLRPC.TL_contact tL_contact, TLRPC.TL_contact tL_contact2) {
        long j10 = tL_contact.user_id;
        long j11 = tL_contact2.user_id;
        if (j10 > j11) {
            return 1;
        }
        return j10 < j11 ? -1 : 0;
    }

    public void lambda$loadContacts$27() {
        synchronized (this.loadContactsSync) {
            this.loadingContacts = false;
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsDidLoad, new Object[0]);
    }

    public void lambda$loadContacts$28(long j10, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.contacts_Contacts contacts_contacts = (TLRPC.contacts_Contacts) tLObject;
            if (j10 == 0 || !(contacts_contacts instanceof TLRPC.TL_contacts_contactsNotModified)) {
                getUserConfig().contactsSavedCount = contacts_contacts.saved_count;
                getUserConfig().saveConfig(false);
                processLoadedContacts(contacts_contacts.contacts, contacts_contacts.users, 0);
                return;
            }
            this.contactsLoaded = true;
            if (!this.delayedContactsUpdate.isEmpty() && this.contactsBookLoaded) {
                applyContactsUpdates(this.delayedContactsUpdate, null, null, null);
                this.delayedContactsUpdate.clear();
            }
            getUserConfig().lastContactsSyncTime = (int) (System.currentTimeMillis() / 1000);
            getUserConfig().saveConfig(false);
            AndroidUtilities.runOnUIThread(new e1(this, 0));
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("load contacts don't change");
            }
        }
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

    public void lambda$loadGlobalPrivacySetting$61(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new n1(0, this, tLObject, tL_error));
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

    public void lambda$loadPrivacySettings$63(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new n1(1, this, tLObject, tL_error));
    }

    public void lambda$loadPrivacySettings$64(TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        if (tL_error == null) {
            TL_account.privacyRules privacyrules = (TL_account.privacyRules) tLObject;
            getMessagesController().putUsers(privacyrules.users, false);
            getMessagesController().putChats(privacyrules.chats, false);
            switch (i10) {
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
            this.loadingPrivacyInfo[i10] = 2;
        } else {
            this.loadingPrivacyInfo[i10] = 0;
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.privacyRulesUpdated, new Object[0]);
    }

    public void lambda$loadPrivacySettings$65(int i10, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new h0(this, tL_error, tLObject, i10, 2));
    }

    public static void lambda$markAsContacted$49(String str) {
        Uri uri = Uri.parse(str);
        ContentValues contentValues = new ContentValues();
        contentValues.put("last_time_contacted", Long.valueOf(System.currentTimeMillis()));
        ApplicationLoader.applicationContext.getContentResolver().update(uri, contentValues, null, null);
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
            name = user2 != null ? formatName(user2.first_name, user2.last_name) : formatName(contact.first_name, contact.last_name);
        } else {
            name = "";
        }
        if (obj2 instanceof TLRPC.User) {
            TLRPC.User user3 = (TLRPC.User) obj2;
            name2 = formatName(user3.first_name, user3.last_name);
        } else if (obj2 instanceof Contact) {
            Contact contact2 = (Contact) obj2;
            TLRPC.User user4 = contact2.user;
            name2 = user4 != null ? formatName(user4.first_name, user4.last_name) : formatName(contact2.first_name, contact2.last_name);
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

    public void lambda$mergePhonebookAndTelegramContacts$41(boolean z10, ArrayList arrayList, HashMap map, HashMap map2, ArrayList arrayList2) {
        if (z10) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(((TLRPC.TL_contact) arrayList.get(i10)).user_id));
                if (user != null && !TextUtils.isEmpty(user.phone)) {
                    String str = user.phone;
                    Contact contact = (Contact) map.get(str.substring(Math.max(0, str.length() - 7)));
                    if (contact == null) {
                        String letter = Contact.getLetter(user.first_name, user.last_name);
                        ArrayList arrayList3 = (ArrayList) map2.get(letter);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            map2.put(letter, arrayList3);
                            arrayList2.add(letter);
                        }
                        arrayList3.add(user);
                    } else if (contact.user == null) {
                        contact.user = user;
                    }
                }
            }
        }
        Collator localeCollator = getLocaleCollator();
        Iterator it = map2.values().iterator();
        while (it.hasNext()) {
            Collections.sort((ArrayList) it.next(), new k1(localeCollator, 1));
        }
        Collections.sort(arrayList2, new k1(localeCollator, 2));
        AndroidUtilities.runOnUIThread(new l1(arrayList2, map, map2, this));
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
            for (int i10 = 0; i10 < value.shortPhones.size(); i10++) {
                map2.put(value.shortPhones.get(i10), value.key);
            }
        }
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            Contact contact = (Contact) sparseArray.valueAt(i11);
            for (int i12 = 0; i12 < contact.shortPhones.size(); i12++) {
                String str = (String) map2.get(contact.shortPhones.get(i12));
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
        getMessagesStorage().putCachedPhoneBook(map, true, false);
    }

    public void lambda$new$0() {
        try {
            if (hasContactsPermission()) {
                ApplicationLoader.applicationContext.getContentResolver().registerContentObserver(ContactsContract.Contacts.CONTENT_URI, true, new MyContentObserver());
            }
        } catch (Throwable unused) {
        }
    }

    private void lambda$performSyncPhoneBook$13(HashMap map) {
        ArrayList<TLRPC.User> arrayList = new ArrayList<>();
        if (map != null && !map.isEmpty()) {
            try {
                HashMap map2 = new HashMap();
                for (int i10 = 0; i10 < this.contacts.size(); i10++) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.contacts.get(i10).user_id));
                    if (user != null && !TextUtils.isEmpty(user.phone)) {
                        map2.put(user.phone, user);
                    }
                }
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Contact contact = (Contact) ((Map.Entry) it.next()).getValue();
                    int i11 = 0;
                    boolean z10 = false;
                    while (i11 < contact.shortPhones.size()) {
                        TLRPC.User user2 = (TLRPC.User) map2.get(contact.shortPhones.get(i11));
                        if (user2 != null) {
                            arrayList.add(user2);
                            contact.shortPhones.remove(i11);
                            i11--;
                            z10 = true;
                        }
                        i11++;
                    }
                    if (z10) {
                        contact.shortPhones.size();
                    }
                }
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        deleteContact(arrayList, false);
    }

    public void lambda$performSyncPhoneBook$14(int i10, HashMap map, boolean z10, boolean z11) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.hasNewContactsToImport, Integer.valueOf(i10), map, Boolean.valueOf(z10), Boolean.valueOf(z11));
    }

    public void lambda$performSyncPhoneBook$15(HashMap map, ArrayList arrayList, HashMap map2) {
        lambda$performSyncPhoneBook$23(map, arrayList, map2);
        updateUnregisteredContacts();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsDidLoad, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsImported, new Object[0]);
    }

    public void lambda$performSyncPhoneBook$16(HashMap map, HashMap map2, boolean z10, HashMap map3, ArrayList arrayList, HashMap map4) {
        this.contactsBookSPhones = map;
        this.contactsBook = map2;
        this.contactsSyncInProgress = false;
        this.contactsBookLoaded = true;
        if (z10) {
            this.contactsLoaded = true;
        }
        if (!this.delayedContactsUpdate.isEmpty() && this.contactsLoaded) {
            applyContactsUpdates(this.delayedContactsUpdate, null, null, null);
            this.delayedContactsUpdate.clear();
        }
        getMessagesStorage().putCachedPhoneBook(map2, false, false);
        AndroidUtilities.runOnUIThread(new l1(this, map3, arrayList, map4, 0));
    }

    public void lambda$performSyncPhoneBook$17(HashMap map, ArrayList arrayList, HashMap map2) {
        lambda$performSyncPhoneBook$23(map, arrayList, map2);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsImported, new Object[0]);
    }

    public void lambda$performSyncPhoneBook$18() {
        getMessagesStorage().getCachedPhoneBook(true);
    }

    public void lambda$performSyncPhoneBook$19(HashMap map, HashMap map2, boolean z10, HashMap map3, ArrayList arrayList, HashMap map4, boolean[] zArr) {
        this.contactsBookSPhones = map;
        this.contactsBook = map2;
        this.contactsSyncInProgress = false;
        this.contactsBookLoaded = true;
        if (z10) {
            this.contactsLoaded = true;
        }
        if (!this.delayedContactsUpdate.isEmpty() && this.contactsLoaded) {
            applyContactsUpdates(this.delayedContactsUpdate, null, null, null);
            this.delayedContactsUpdate.clear();
        }
        AndroidUtilities.runOnUIThread(new l1(this, map3, arrayList, map4, 3));
        if (zArr[0]) {
            Utilities.globalQueue.postRunnable(new e1(this, 1), 300000L);
        }
    }

    public void lambda$performSyncPhoneBook$20(HashMap map, SparseArray sparseArray, boolean[] zArr, HashMap map2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i10, HashMap map3, boolean z10, HashMap map4, ArrayList arrayList, HashMap map5, TLObject tLObject, TLRPC.TL_error tL_error) {
        HashMap map6;
        this.completedRequestsCount++;
        if (tL_error == null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("contacts imported");
            }
            TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts = (TLRPC.TL_contacts_importedContacts) tLObject;
            if (!tL_contacts_importedContacts.retry_contacts.isEmpty()) {
                for (int i11 = 0; i11 < tL_contacts_importedContacts.retry_contacts.size(); i11++) {
                    map.remove(sparseArray.get((int) tL_contacts_importedContacts.retry_contacts.get(i11).longValue()));
                }
                zArr[0] = true;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("result has retry contacts");
                }
            }
            for (int i12 = 0; i12 < tL_contacts_importedContacts.popular_invites.size(); i12++) {
                TLRPC.TL_popularContact tL_popularContact = tL_contacts_importedContacts.popular_invites.get(i12);
                Contact contact = (Contact) map2.get(sparseArray.get((int) tL_popularContact.client_id));
                if (contact != null) {
                    contact.imported = tL_popularContact.importers;
                }
            }
            map6 = map2;
            getMessagesStorage().putUsersAndChats(tL_contacts_importedContacts.users, null, true, true);
            ArrayList<TLRPC.TL_contact> arrayList2 = new ArrayList<>();
            for (int i13 = 0; i13 < tL_contacts_importedContacts.imported.size(); i13++) {
                TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                tL_contact.user_id = tL_contacts_importedContacts.imported.get(i13).user_id;
                arrayList2.add(tL_contact);
            }
            processLoadedContacts(arrayList2, tL_contacts_importedContacts.users, 2);
        } else {
            map6 = map2;
            for (int i14 = 0; i14 < tL_contacts_importContacts.contacts.size(); i14++) {
                map.remove(sparseArray.get((int) tL_contacts_importContacts.contacts.get(i14).client_id));
            }
            zArr[0] = true;
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.ui.Cells.pa.v(tL_error.text, new StringBuilder("import contacts error "));
            }
        }
        if (this.completedRequestsCount == i10) {
            if (!map.isEmpty()) {
                getMessagesStorage().putCachedPhoneBook(map, false, false);
            }
            Utilities.stageQueue.postRunnable(new s1(this, map3, map6, z10, map4, arrayList, map5, zArr));
        }
    }

    public void lambda$performSyncPhoneBook$21(HashMap map, ArrayList arrayList, HashMap map2) {
        lambda$performSyncPhoneBook$23(map, arrayList, map2);
        updateUnregisteredContacts();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsDidLoad, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsImported, new Object[0]);
    }

    public void lambda$performSyncPhoneBook$22(HashMap map, HashMap map2, boolean z10, HashMap map3, ArrayList arrayList, HashMap map4) {
        this.contactsBookSPhones = map;
        this.contactsBook = map2;
        this.contactsSyncInProgress = false;
        this.contactsBookLoaded = true;
        if (z10) {
            this.contactsLoaded = true;
        }
        if (!this.delayedContactsUpdate.isEmpty() && this.contactsLoaded) {
            applyContactsUpdates(this.delayedContactsUpdate, null, null, null);
            this.delayedContactsUpdate.clear();
        }
        AndroidUtilities.runOnUIThread(new l1(this, map3, arrayList, map4, 2));
    }

    public void lambda$performSyncPhoneBook$24(HashMap map, HashMap map2, boolean z10, HashMap map3, ArrayList arrayList, HashMap map4) {
        this.contactsBookSPhones = map;
        this.contactsBook = map2;
        this.contactsSyncInProgress = false;
        this.contactsBookLoaded = true;
        if (z10) {
            this.contactsLoaded = true;
        }
        if (!this.delayedContactsUpdate.isEmpty() && this.contactsLoaded) {
            applyContactsUpdates(this.delayedContactsUpdate, null, null, null);
            this.delayedContactsUpdate.clear();
        }
        AndroidUtilities.runOnUIThread(new l1(this, map3, arrayList, map4, 4));
    }

    public void lambda$performSyncPhoneBook$25(final HashMap map, final boolean z10, boolean z11, final boolean z12, boolean z13, boolean z14, boolean z15) throws Throwable {
        int i10;
        ArrayList arrayList;
        HashMap map2;
        HashMap map3;
        int i11;
        int i12;
        final int i13;
        Contact contact;
        HashMap map4;
        boolean z16;
        int i14;
        HashMap<String, Contact> map5;
        HashMap map6;
        Iterator<Map.Entry<String, Contact>> it;
        HashMap map7;
        int i15;
        String str;
        int iIndexOf;
        int i16;
        HashMap<String, Contact> map8;
        int i17;
        HashMap map9;
        int i18;
        boolean z17;
        TLRPC.TL_contact tL_contact;
        TLRPC.User user;
        String str2;
        String str3;
        HashMap map10 = new HashMap();
        Iterator it2 = map.entrySet().iterator();
        while (true) {
            i10 = 0;
            if (!it2.hasNext()) {
                break;
            }
            Contact contact2 = (Contact) ((Map.Entry) it2.next()).getValue();
            while (i10 < contact2.shortPhones.size()) {
                map10.put(contact2.shortPhones.get(i10), contact2);
                i10++;
            }
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("start read contacts from phone");
        }
        if (!z10) {
            checkContactsInternal();
        }
        HashMap<String, Contact> contactsFromPhoneBook = readContactsFromPhoneBook();
        HashMap map11 = new HashMap();
        HashMap map12 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        Iterator<Map.Entry<String, Contact>> it3 = contactsFromPhoneBook.entrySet().iterator();
        while (it3.hasNext()) {
            Contact value = it3.next().getValue();
            int size = value.shortPhones.size();
            for (int i19 = 0; i19 < size; i19++) {
                String str4 = value.shortPhones.get(i19);
                map12.put(str4.substring(Math.max(0, str4.length() - 7)), value);
            }
            String letter = value.getLetter();
            ArrayList arrayList3 = (ArrayList) map11.get(letter);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                map11.put(letter, arrayList3);
                arrayList2.add(letter);
            }
            arrayList3.add(value);
        }
        final HashMap map13 = new HashMap();
        int size2 = map.size();
        ArrayList arrayList4 = new ArrayList();
        if (map.isEmpty()) {
            arrayList = arrayList2;
            map2 = map12;
            map3 = map11;
            if (z11) {
                int i20 = 0;
                for (Map.Entry<String, Contact> entry : contactsFromPhoneBook.entrySet()) {
                    Contact value2 = entry.getValue();
                    entry.getKey();
                    for (int i21 = 0; i21 < value2.phones.size(); i21++) {
                        if (z13) {
                            TLRPC.TL_inputPhoneContact tL_inputPhoneContact = new TLRPC.TL_inputPhoneContact();
                            tL_inputPhoneContact.client_id = ((long) value2.contact_id) | (((long) i21) << 32);
                            tL_inputPhoneContact.first_name = value2.first_name;
                            tL_inputPhoneContact.last_name = value2.last_name;
                            tL_inputPhoneContact.phone = value2.phones.get(i21);
                            arrayList4.add(tL_inputPhoneContact);
                        } else {
                            String str5 = value2.shortPhones.get(i21);
                            String strSubstring = str5.substring(Math.max(0, str5.length() - 7));
                            TLRPC.TL_contact tL_contact2 = this.contactsByPhone.get(str5);
                            if (tL_contact2 != null) {
                                TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(tL_contact2.user_id));
                                if (user2 != null) {
                                    i20++;
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
                            } else if (this.contactsByShortPhone.containsKey(strSubstring)) {
                                i20++;
                            }
                            TLRPC.TL_inputPhoneContact tL_inputPhoneContact2 = new TLRPC.TL_inputPhoneContact();
                            tL_inputPhoneContact2.client_id = ((long) value2.contact_id) | (((long) i21) << 32);
                            tL_inputPhoneContact2.first_name = value2.first_name;
                            tL_inputPhoneContact2.last_name = value2.last_name;
                            tL_inputPhoneContact2.phone = value2.phones.get(i21);
                            arrayList4.add(tL_inputPhoneContact2);
                        }
                    }
                }
                i11 = i20;
            } else {
                i11 = 0;
            }
            i12 = 0;
        } else {
            Iterator<Map.Entry<String, Contact>> it4 = contactsFromPhoneBook.entrySet().iterator();
            i12 = 0;
            int i22 = 0;
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
                    if (i10 >= value3.shortPhones.size()) {
                        contact = contact3;
                        break;
                    }
                    contact = (Contact) map10.get(value3.shortPhones.get(i10));
                    if (contact != null) {
                        key = contact.key;
                        break;
                    }
                    i10++;
                }
                if (contact != null) {
                    value3.imported = contact.imported;
                }
                if (contact != null) {
                    if (TextUtils.isEmpty(value3.first_name)) {
                        map4 = map10;
                    } else {
                        map4 = map10;
                        if (contact.first_name.equals(value3.first_name)) {
                        }
                        z16 = true;
                        if (contact != null || z16) {
                            i14 = size2;
                            map5 = contactsFromPhoneBook;
                            map6 = map12;
                            it = it4;
                            map7 = map11;
                            for (i15 = 0; i15 < value3.phones.size(); i15++) {
                                str = value3.shortPhones.get(i15);
                                str.substring(Math.max(0, str.length() - 7));
                                map13.put(str, value3);
                                if (contact == null && (iIndexOf = contact.shortPhones.indexOf(str)) != -1) {
                                    Integer num = contact.phoneDeleted.get(iIndexOf);
                                    value3.phoneDeleted.set(i15, num);
                                    if (num.intValue() != 1) {
                                        if (!z11) {
                                            if (z16) {
                                                TLRPC.TL_inputPhoneContact tL_inputPhoneContact3 = new TLRPC.TL_inputPhoneContact();
                                                tL_inputPhoneContact3.client_id = ((long) value3.contact_id) | (((long) i15) << 32);
                                                tL_inputPhoneContact3.first_name = value3.first_name;
                                                tL_inputPhoneContact3.last_name = value3.last_name;
                                                tL_inputPhoneContact3.phone = value3.phones.get(i15);
                                                arrayList4.add(tL_inputPhoneContact3);
                                            } else if (this.contactsByPhone.containsKey(str)) {
                                                i22++;
                                            } else {
                                                i12++;
                                                TLRPC.TL_inputPhoneContact tL_inputPhoneContact4 = new TLRPC.TL_inputPhoneContact();
                                                tL_inputPhoneContact4.client_id = ((long) value3.contact_id) | (((long) i15) << 32);
                                                tL_inputPhoneContact4.first_name = value3.first_name;
                                                tL_inputPhoneContact4.last_name = value3.last_name;
                                                tL_inputPhoneContact4.phone = value3.phones.get(i15);
                                                arrayList4.add(tL_inputPhoneContact4);
                                            }
                                        }
                                    }
                                } else if (!z11) {
                                    if (z16) {
                                        TLRPC.TL_inputPhoneContact tL_inputPhoneContact5 = new TLRPC.TL_inputPhoneContact();
                                        tL_inputPhoneContact5.client_id = ((long) value3.contact_id) | (((long) i15) << 32);
                                        tL_inputPhoneContact5.first_name = value3.first_name;
                                        tL_inputPhoneContact5.last_name = value3.last_name;
                                        tL_inputPhoneContact5.phone = value3.phones.get(i15);
                                        arrayList4.add(tL_inputPhoneContact5);
                                    } else if (this.contactsByPhone.containsKey(str)) {
                                        i22++;
                                    } else {
                                        i12++;
                                        TLRPC.TL_inputPhoneContact tL_inputPhoneContact6 = new TLRPC.TL_inputPhoneContact();
                                        tL_inputPhoneContact6.client_id = ((long) value3.contact_id) | (((long) i15) << 32);
                                        tL_inputPhoneContact6.first_name = value3.first_name;
                                        tL_inputPhoneContact6.last_name = value3.last_name;
                                        tL_inputPhoneContact6.phone = value3.phones.get(i15);
                                        arrayList4.add(tL_inputPhoneContact6);
                                    }
                                }
                            }
                            if (contact != null) {
                                map.remove(key);
                            }
                        } else {
                            int i23 = 0;
                            while (i23 < value3.phones.size()) {
                                String str8 = value3.shortPhones.get(i23);
                                HashMap map14 = map12;
                                Iterator<Map.Entry<String, Contact>> it5 = it4;
                                String strSubstring2 = str8.substring(Math.max(0, str8.length() - 7));
                                map13.put(str8, value3);
                                int iIndexOf2 = contact.shortPhones.indexOf(str8);
                                if (z11) {
                                    i17 = iIndexOf2;
                                    TLRPC.TL_contact tL_contact3 = this.contactsByPhone.get(str8);
                                    if (tL_contact3 != null) {
                                        map9 = map11;
                                        i16 = size2;
                                        map8 = contactsFromPhoneBook;
                                        TLRPC.User user3 = getMessagesController().getUser(Long.valueOf(tL_contact3.user_id));
                                        if (user3 != null) {
                                            i22++;
                                            if (TextUtils.isEmpty(user3.first_name) && TextUtils.isEmpty(user3.last_name) && !(TextUtils.isEmpty(value3.first_name) && TextUtils.isEmpty(value3.last_name))) {
                                                z17 = true;
                                                i17 = -1;
                                            } else {
                                                z17 = false;
                                            }
                                        } else {
                                            z17 = false;
                                        }
                                        i18 = i17;
                                    } else {
                                        i16 = size2;
                                        map8 = contactsFromPhoneBook;
                                        map9 = map11;
                                        if (this.contactsByShortPhone.containsKey(strSubstring2)) {
                                            i22++;
                                        }
                                    }
                                    if (i18 == -1) {
                                        value3.phoneDeleted.set(i23, contact.phoneDeleted.get(i18));
                                        contact.phones.remove(i18);
                                        contact.shortPhones.remove(i18);
                                        contact.phoneDeleted.remove(i18);
                                        contact.phoneTypes.remove(i18);
                                    } else if (!z11) {
                                        if (z17) {
                                            TLRPC.TL_inputPhoneContact tL_inputPhoneContact7 = new TLRPC.TL_inputPhoneContact();
                                            tL_inputPhoneContact7.client_id = ((long) value3.contact_id) | (((long) i23) << 32);
                                            tL_inputPhoneContact7.first_name = value3.first_name;
                                            tL_inputPhoneContact7.last_name = value3.last_name;
                                            tL_inputPhoneContact7.phone = value3.phones.get(i23);
                                            arrayList4.add(tL_inputPhoneContact7);
                                        } else {
                                            tL_contact = this.contactsByPhone.get(str8);
                                            if (tL_contact != null) {
                                                user = getMessagesController().getUser(Long.valueOf(tL_contact.user_id));
                                                if (user != null) {
                                                    i22++;
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
                                                    i12++;
                                                }
                                            } else if (this.contactsByShortPhone.containsKey(strSubstring2)) {
                                                i22++;
                                            }
                                            TLRPC.TL_inputPhoneContact tL_inputPhoneContact8 = new TLRPC.TL_inputPhoneContact();
                                            tL_inputPhoneContact8.client_id = ((long) value3.contact_id) | (((long) i23) << 32);
                                            tL_inputPhoneContact8.first_name = value3.first_name;
                                            tL_inputPhoneContact8.last_name = value3.last_name;
                                            tL_inputPhoneContact8.phone = value3.phones.get(i23);
                                            arrayList4.add(tL_inputPhoneContact8);
                                        }
                                    }
                                    i23++;
                                    it4 = it5;
                                    map12 = map14;
                                    map11 = map9;
                                    contactsFromPhoneBook = map8;
                                    size2 = i16;
                                } else {
                                    i16 = size2;
                                    map8 = contactsFromPhoneBook;
                                    i17 = iIndexOf2;
                                    map9 = map11;
                                }
                                i18 = i17;
                                z17 = false;
                                if (i18 == -1) {
                                    value3.phoneDeleted.set(i23, contact.phoneDeleted.get(i18));
                                    contact.phones.remove(i18);
                                    contact.shortPhones.remove(i18);
                                    contact.phoneDeleted.remove(i18);
                                    contact.phoneTypes.remove(i18);
                                } else if (!z11) {
                                    if (z17) {
                                        TLRPC.TL_inputPhoneContact tL_inputPhoneContact9 = new TLRPC.TL_inputPhoneContact();
                                        tL_inputPhoneContact9.client_id = ((long) value3.contact_id) | (((long) i23) << 32);
                                        tL_inputPhoneContact9.first_name = value3.first_name;
                                        tL_inputPhoneContact9.last_name = value3.last_name;
                                        tL_inputPhoneContact9.phone = value3.phones.get(i23);
                                        arrayList4.add(tL_inputPhoneContact9);
                                    } else {
                                        tL_contact = this.contactsByPhone.get(str8);
                                        if (tL_contact != null) {
                                            user = getMessagesController().getUser(Long.valueOf(tL_contact.user_id));
                                            if (user != null) {
                                                i22++;
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
                                                i12++;
                                            }
                                        } else if (this.contactsByShortPhone.containsKey(strSubstring2)) {
                                            i22++;
                                        }
                                        TLRPC.TL_inputPhoneContact tL_inputPhoneContact10 = new TLRPC.TL_inputPhoneContact();
                                        tL_inputPhoneContact10.client_id = ((long) value3.contact_id) | (((long) i23) << 32);
                                        tL_inputPhoneContact10.first_name = value3.first_name;
                                        tL_inputPhoneContact10.last_name = value3.last_name;
                                        tL_inputPhoneContact10.phone = value3.phones.get(i23);
                                        arrayList4.add(tL_inputPhoneContact10);
                                    }
                                }
                                i23++;
                                it4 = it5;
                                map12 = map14;
                                map11 = map9;
                                contactsFromPhoneBook = map8;
                                size2 = i16;
                            }
                            i14 = size2;
                            map5 = contactsFromPhoneBook;
                            map6 = map12;
                            it = it4;
                            map7 = map11;
                            if (contact.phones.isEmpty()) {
                                map.remove(key);
                            }
                        }
                        map10 = map4;
                        arrayList2 = arrayList5;
                        it4 = it;
                        map12 = map6;
                        map11 = map7;
                        contactsFromPhoneBook = map5;
                        size2 = i14;
                        i10 = 0;
                    }
                    if (!TextUtils.isEmpty(value3.last_name) && !contact.last_name.equals(value3.last_name)) {
                        z16 = true;
                    }
                    if (contact != null) {
                        i14 = size2;
                        map5 = contactsFromPhoneBook;
                        map6 = map12;
                        it = it4;
                        map7 = map11;
                        while (i15 < value3.phones.size()) {
                            str = value3.shortPhones.get(i15);
                            str.substring(Math.max(0, str.length() - 7));
                            map13.put(str, value3);
                            if (contact == null) {
                            }
                            if (!z11) {
                                if (z16) {
                                    TLRPC.TL_inputPhoneContact tL_inputPhoneContact11 = new TLRPC.TL_inputPhoneContact();
                                    tL_inputPhoneContact11.client_id = ((long) value3.contact_id) | (((long) i15) << 32);
                                    tL_inputPhoneContact11.first_name = value3.first_name;
                                    tL_inputPhoneContact11.last_name = value3.last_name;
                                    tL_inputPhoneContact11.phone = value3.phones.get(i15);
                                    arrayList4.add(tL_inputPhoneContact11);
                                } else if (this.contactsByPhone.containsKey(str)) {
                                    i22++;
                                } else {
                                    i12++;
                                    TLRPC.TL_inputPhoneContact tL_inputPhoneContact12 = new TLRPC.TL_inputPhoneContact();
                                    tL_inputPhoneContact12.client_id = ((long) value3.contact_id) | (((long) i15) << 32);
                                    tL_inputPhoneContact12.first_name = value3.first_name;
                                    tL_inputPhoneContact12.last_name = value3.last_name;
                                    tL_inputPhoneContact12.phone = value3.phones.get(i15);
                                    arrayList4.add(tL_inputPhoneContact12);
                                }
                            }
                        }
                        if (contact != null) {
                            map.remove(key);
                        }
                    } else {
                        i14 = size2;
                        map5 = contactsFromPhoneBook;
                        map6 = map12;
                        it = it4;
                        map7 = map11;
                        while (i15 < value3.phones.size()) {
                            str = value3.shortPhones.get(i15);
                            str.substring(Math.max(0, str.length() - 7));
                            map13.put(str, value3);
                            if (contact == null) {
                            }
                            if (!z11) {
                                if (z16) {
                                    TLRPC.TL_inputPhoneContact tL_inputPhoneContact13 = new TLRPC.TL_inputPhoneContact();
                                    tL_inputPhoneContact13.client_id = ((long) value3.contact_id) | (((long) i15) << 32);
                                    tL_inputPhoneContact13.first_name = value3.first_name;
                                    tL_inputPhoneContact13.last_name = value3.last_name;
                                    tL_inputPhoneContact13.phone = value3.phones.get(i15);
                                    arrayList4.add(tL_inputPhoneContact13);
                                } else if (this.contactsByPhone.containsKey(str)) {
                                    i22++;
                                } else {
                                    i12++;
                                    TLRPC.TL_inputPhoneContact tL_inputPhoneContact14 = new TLRPC.TL_inputPhoneContact();
                                    tL_inputPhoneContact14.client_id = ((long) value3.contact_id) | (((long) i15) << 32);
                                    tL_inputPhoneContact14.first_name = value3.first_name;
                                    tL_inputPhoneContact14.last_name = value3.last_name;
                                    tL_inputPhoneContact14.phone = value3.phones.get(i15);
                                    arrayList4.add(tL_inputPhoneContact14);
                                }
                            }
                        }
                        if (contact != null) {
                            map.remove(key);
                        }
                    }
                    map10 = map4;
                    arrayList2 = arrayList5;
                    it4 = it;
                    map12 = map6;
                    map11 = map7;
                    contactsFromPhoneBook = map5;
                    size2 = i14;
                    i10 = 0;
                } else {
                    map4 = map10;
                }
                z16 = false;
                if (contact != null) {
                    i14 = size2;
                    map5 = contactsFromPhoneBook;
                    map6 = map12;
                    it = it4;
                    map7 = map11;
                    while (i15 < value3.phones.size()) {
                        str = value3.shortPhones.get(i15);
                        str.substring(Math.max(0, str.length() - 7));
                        map13.put(str, value3);
                        if (contact == null) {
                        }
                        if (!z11) {
                            if (z16) {
                                TLRPC.TL_inputPhoneContact tL_inputPhoneContact15 = new TLRPC.TL_inputPhoneContact();
                                tL_inputPhoneContact15.client_id = ((long) value3.contact_id) | (((long) i15) << 32);
                                tL_inputPhoneContact15.first_name = value3.first_name;
                                tL_inputPhoneContact15.last_name = value3.last_name;
                                tL_inputPhoneContact15.phone = value3.phones.get(i15);
                                arrayList4.add(tL_inputPhoneContact15);
                            } else if (this.contactsByPhone.containsKey(str)) {
                                i22++;
                            } else {
                                i12++;
                                TLRPC.TL_inputPhoneContact tL_inputPhoneContact16 = new TLRPC.TL_inputPhoneContact();
                                tL_inputPhoneContact16.client_id = ((long) value3.contact_id) | (((long) i15) << 32);
                                tL_inputPhoneContact16.first_name = value3.first_name;
                                tL_inputPhoneContact16.last_name = value3.last_name;
                                tL_inputPhoneContact16.phone = value3.phones.get(i15);
                                arrayList4.add(tL_inputPhoneContact16);
                            }
                        }
                    }
                    if (contact != null) {
                        map.remove(key);
                    }
                } else {
                    i14 = size2;
                    map5 = contactsFromPhoneBook;
                    map6 = map12;
                    it = it4;
                    map7 = map11;
                    while (i15 < value3.phones.size()) {
                        str = value3.shortPhones.get(i15);
                        str.substring(Math.max(0, str.length() - 7));
                        map13.put(str, value3);
                        if (contact == null) {
                        }
                        if (!z11) {
                            if (z16) {
                                TLRPC.TL_inputPhoneContact tL_inputPhoneContact17 = new TLRPC.TL_inputPhoneContact();
                                tL_inputPhoneContact17.client_id = ((long) value3.contact_id) | (((long) i15) << 32);
                                tL_inputPhoneContact17.first_name = value3.first_name;
                                tL_inputPhoneContact17.last_name = value3.last_name;
                                tL_inputPhoneContact17.phone = value3.phones.get(i15);
                                arrayList4.add(tL_inputPhoneContact17);
                            } else if (this.contactsByPhone.containsKey(str)) {
                                i22++;
                            } else {
                                i12++;
                                TLRPC.TL_inputPhoneContact tL_inputPhoneContact18 = new TLRPC.TL_inputPhoneContact();
                                tL_inputPhoneContact18.client_id = ((long) value3.contact_id) | (((long) i15) << 32);
                                tL_inputPhoneContact18.first_name = value3.first_name;
                                tL_inputPhoneContact18.last_name = value3.last_name;
                                tL_inputPhoneContact18.phone = value3.phones.get(i15);
                                arrayList4.add(tL_inputPhoneContact18);
                            }
                        }
                    }
                    if (contact != null) {
                        map.remove(key);
                    }
                }
                map10 = map4;
                arrayList2 = arrayList5;
                it4 = it;
                map12 = map6;
                map11 = map7;
                contactsFromPhoneBook = map5;
                size2 = i14;
                i10 = 0;
            }
            int i24 = size2;
            HashMap<String, Contact> map15 = contactsFromPhoneBook;
            arrayList = arrayList2;
            map2 = map12;
            map3 = map11;
            if (!z12 && map.isEmpty() && arrayList4.isEmpty()) {
                size2 = i24;
                if (size2 == map15.size()) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("contacts not changed!");
                        return;
                    }
                    return;
                }
            } else {
                size2 = i24;
            }
            if (!z11 || map.isEmpty() || map15.isEmpty() || !arrayList4.isEmpty()) {
                contactsFromPhoneBook = map15;
            } else {
                contactsFromPhoneBook = map15;
                getMessagesStorage().putCachedPhoneBook(contactsFromPhoneBook, false, false);
            }
            i11 = i22;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("done processing contacts");
        }
        if (!z11) {
            final HashMap<String, Contact> map16 = contactsFromPhoneBook;
            final ArrayList arrayList6 = arrayList;
            final HashMap map17 = map2;
            final HashMap map18 = map3;
            final int i25 = 2;
            Utilities.stageQueue.postRunnable(new Runnable(this) {

                public final ContactsController f20207b;

                {
                    this.f20207b = this;
                }

                @Override
                public final void run() {
                    switch (i25) {
                        case 0:
                            this.f20207b.lambda$performSyncPhoneBook$16(map13, map16, z12, map18, arrayList6, map17);
                            break;
                        case 1:
                            this.f20207b.lambda$performSyncPhoneBook$22(map13, map16, z12, map18, arrayList6, map17);
                            break;
                        default:
                            this.f20207b.lambda$performSyncPhoneBook$24(map13, map16, z12, map18, arrayList6, map17);
                            break;
                    }
                }
            });
            if (map16.isEmpty()) {
                return;
            }
            getMessagesStorage().putCachedPhoneBook(map16, false, false);
            return;
        }
        if (arrayList4.isEmpty()) {
            final HashMap<String, Contact> map19 = contactsFromPhoneBook;
            final ArrayList arrayList7 = arrayList;
            final HashMap map20 = map2;
            final HashMap map21 = map3;
            final int i26 = 1;
            Utilities.stageQueue.postRunnable(new Runnable(this) {

                public final ContactsController f20207b;

                {
                    this.f20207b = this;
                }

                @Override
                public final void run() {
                    switch (i26) {
                        case 0:
                            this.f20207b.lambda$performSyncPhoneBook$16(map13, map19, z12, map21, arrayList7, map20);
                            break;
                        case 1:
                            this.f20207b.lambda$performSyncPhoneBook$22(map13, map19, z12, map21, arrayList7, map20);
                            break;
                        default:
                            this.f20207b.lambda$performSyncPhoneBook$24(map13, map19, z12, map21, arrayList7, map20);
                            break;
                    }
                }
            });
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.e("start import contacts");
        }
        if (!z14 || i12 == 0) {
            i13 = 0;
        } else if (i12 >= 30) {
            i13 = 1;
        } else if (z12 && size2 == 0 && this.contactsByPhone.size() - i11 > (this.contactsByPhone.size() / 3) * 2) {
            i13 = 2;
        } else {
            i13 = 0;
        }
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sbP = com.google.android.recaptcha.internal.a.p("new phone book contacts ", i12, " serverContactsInPhonebook ", i11, " totalContacts ");
            sbP.append(this.contactsByPhone.size());
            FileLog.d(sbP.toString());
        }
        if (i13 != 0) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f21761a.lambda$performSyncPhoneBook$14(i13, map, z12, z10);
                }
            });
            return;
        }
        if (z15) {
            final int i27 = 0;
            final HashMap<String, Contact> map22 = contactsFromPhoneBook;
            final ArrayList arrayList8 = arrayList;
            final HashMap map23 = map2;
            final HashMap map24 = map3;
            Utilities.stageQueue.postRunnable(new Runnable(this) {

                public final ContactsController f20207b;

                {
                    this.f20207b = this;
                }

                @Override
                public final void run() {
                    switch (i27) {
                        case 0:
                            this.f20207b.lambda$performSyncPhoneBook$16(map13, map22, z12, map24, arrayList8, map23);
                            break;
                        case 1:
                            this.f20207b.lambda$performSyncPhoneBook$22(map13, map22, z12, map24, arrayList8, map23);
                            break;
                        default:
                            this.f20207b.lambda$performSyncPhoneBook$24(map13, map22, z12, map24, arrayList8, map23);
                            break;
                    }
                }
            });
            return;
        }
        ContactsController contactsController = this;
        HashMap<String, Contact> map25 = contactsFromPhoneBook;
        ArrayList arrayList9 = arrayList;
        HashMap map26 = map2;
        HashMap map27 = map3;
        boolean[] zArr = {false};
        HashMap map28 = new HashMap(map25);
        HashMap<String, Contact> map29 = map25;
        SparseArray sparseArray = new SparseArray();
        Iterator it6 = map28.entrySet().iterator();
        while (it6.hasNext()) {
            Contact contact4 = (Contact) ((Map.Entry) it6.next()).getValue();
            sparseArray.put(contact4.contact_id, contact4.key);
        }
        contactsController.completedRequestsCount = 0;
        int iCeil = (int) Math.ceil(((double) arrayList4.size()) / 500.0d);
        int i28 = 0;
        while (i28 < iCeil) {
            ArrayList arrayList10 = arrayList9;
            TLRPC.TL_contacts_importContacts tL_contacts_importContacts = new TLRPC.TL_contacts_importContacts();
            int i29 = i28 * 500;
            tL_contacts_importContacts.contacts = new ArrayList<>(arrayList4.subList(i29, Math.min(i29 + 500, arrayList4.size())));
            ConnectionsManager connectionsManager = contactsController.getConnectionsManager();
            HashMap map30 = map26;
            int i30 = iCeil;
            HashMap map31 = map27;
            HashMap<String, Contact> map32 = map29;
            g1 g1Var = new g1(contactsController, map28, sparseArray, zArr, map32, tL_contacts_importContacts, i30, map13, z12, map31, arrayList10, map30);
            map27 = map31;
            arrayList9 = arrayList10;
            map26 = map30;
            connectionsManager.sendRequest(tL_contacts_importContacts, g1Var, 6);
            i28++;
            map28 = map28;
            iCeil = i30;
            map13 = map13;
            map29 = map32;
            sparseArray = sparseArray;
            contactsController = this;
        }
    }

    public void lambda$processLoadedContacts$29() {
        this.doneLoadingContacts = true;
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsDidLoad, new Object[0]);
    }

    public static int lambda$processLoadedContacts$30(a0.h hVar, Collator collator, TLRPC.TL_contact tL_contact, TLRPC.TL_contact tL_contact2) {
        return collator.compare(UserObject.getFirstName((TLRPC.User) hVar.f(tL_contact.user_id)), UserObject.getFirstName((TLRPC.User) hVar.f(tL_contact2.user_id)));
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

    public void lambda$processLoadedContacts$33(ArrayList arrayList, ConcurrentHashMap concurrentHashMap, HashMap map, HashMap map2, ArrayList arrayList2, ArrayList arrayList3, int i10, boolean z10, boolean z11) {
        this.contacts = arrayList;
        this.contactsDict = concurrentHashMap;
        this.usersSectionsDict = map;
        this.usersMutualSectionsDict = map2;
        this.sortedUsersSectionsArray = arrayList2;
        this.sortedUsersMutualSectionsArray = arrayList3;
        this.doneLoadingContacts = true;
        if (i10 != 2) {
            synchronized (this.loadContactsSync) {
                this.loadingContacts = false;
            }
        }
        performWriteContactsToPhoneBook();
        updateUnregisteredContacts();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsDidLoad, new Object[0]);
        if (i10 == 1 || z10) {
            reloadContactsStatusesMaybe(false);
        } else {
            saveContactsLoadTime();
        }
        if (z11) {
            loadContacts(false, 0L);
        }
    }

    public void lambda$processLoadedContacts$34(HashMap map, HashMap map2) {
        this.contactsByPhone = map;
        this.contactsByShortPhone = map2;
    }

    public void lambda$processLoadedContacts$35(HashMap map, HashMap map2) {
        Utilities.globalQueue.postRunnable(new q1(this, map, map2, 1));
        if (this.contactsSyncInProgress) {
            return;
        }
        this.contactsSyncInProgress = true;
        getMessagesStorage().getCachedPhoneBook(false);
    }

    public void lambda$processLoadedContacts$36(final int i10, final ArrayList arrayList, ArrayList arrayList2, a0.h hVar, final boolean z10) {
        HashMap map;
        HashMap map2;
        int i11;
        ConcurrentHashMap concurrentHashMap;
        int i12;
        ArrayList arrayList3;
        ArrayList arrayList4 = arrayList;
        a0.h hVar2 = hVar;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("done loading contacts");
        }
        if (i10 == 1 && (arrayList4.isEmpty() || Math.abs((System.currentTimeMillis() / 1000) - ((long) getUserConfig().lastContactsSyncTime)) >= 86400)) {
            loadContacts(false, getContactsHash(arrayList4));
            if (arrayList4.isEmpty()) {
                AndroidUtilities.runOnUIThread(new e1(this, 2));
                return;
            }
        }
        if (i10 == 0) {
            getUserConfig().lastContactsSyncTime = (int) (System.currentTimeMillis() / 1000);
            getUserConfig().saveConfig(false);
        }
        int i13 = 0;
        final boolean z11 = false;
        while (i13 < arrayList4.size()) {
            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList4.get(i13);
            if (MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_contact.user_id)) == null && tL_contact.user_id != getUserConfig().getClientUserId()) {
                arrayList4.remove(i13);
                i13--;
                z11 = true;
            }
            i13++;
        }
        if (i10 != 1) {
            getMessagesStorage().putUsersAndChats(arrayList2, null, true, true);
            getMessagesStorage().putContacts(arrayList4, i10 != 2);
        }
        Collator localeCollator = getLocaleCollator();
        Collections.sort(arrayList4, new j1(hVar2, localeCollator, 1));
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap(20, 1.0f, 2);
        final HashMap map3 = new HashMap();
        final HashMap map4 = new HashMap();
        final ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        if (this.contactsBookLoaded) {
            map = null;
            map2 = null;
        } else {
            map = new HashMap();
            map2 = new HashMap();
        }
        int i14 = 0;
        while (i14 < arrayList4.size()) {
            TLRPC.TL_contact tL_contact2 = (TLRPC.TL_contact) arrayList4.get(i14);
            ConcurrentHashMap concurrentHashMap3 = concurrentHashMap2;
            TLRPC.User user = (TLRPC.User) hVar2.f(tL_contact2.user_id);
            if (user == null) {
                i11 = i14;
                arrayList3 = arrayList6;
                concurrentHashMap = concurrentHashMap3;
            } else {
                i11 = i14;
                ArrayList arrayList7 = arrayList6;
                concurrentHashMap = concurrentHashMap3;
                concurrentHashMap.put(Long.valueOf(tL_contact2.user_id), tL_contact2);
                if (map == null || TextUtils.isEmpty(user.phone)) {
                    i12 = 0;
                } else {
                    map.put(user.phone, tL_contact2);
                    String str = user.phone;
                    i12 = 0;
                    map2.put(str.substring(Math.max(0, str.length() - 7)), tL_contact2);
                }
                String firstName = UserObject.getFirstName(user);
                if (firstName.length() > 1) {
                    firstName = firstName.substring(i12, 1);
                }
                String upperCase = firstName.length() == 0 ? "#" : firstName.toUpperCase();
                String str2 = this.sectionsToReplace.get(upperCase);
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
            i14 = i11 + 1;
            ConcurrentHashMap concurrentHashMap4 = concurrentHashMap;
            arrayList6 = arrayList3;
            concurrentHashMap2 = concurrentHashMap4;
            arrayList4 = arrayList;
            hVar2 = hVar;
        }
        final ArrayList arrayList10 = arrayList6;
        final ConcurrentHashMap concurrentHashMap5 = concurrentHashMap2;
        Collections.sort(arrayList5, new k1(localeCollator, 3));
        Collections.sort(arrayList10, new k1(localeCollator, 4));
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f21210a.lambda$processLoadedContacts$33(arrayList, concurrentHashMap5, map3, map4, arrayList5, arrayList10, i10, z10, z11);
            }
        });
        if (!this.delayedContactsUpdate.isEmpty() && this.contactsLoaded && this.contactsBookLoaded) {
            applyContactsUpdates(this.delayedContactsUpdate, null, null, null);
            this.delayedContactsUpdate.clear();
        }
        if (map != null) {
            AndroidUtilities.runOnUIThread(new q1(this, map, map2, 0));
        } else {
            this.contactsLoaded = true;
        }
    }

    public void lambda$processLoadedContacts$37(ArrayList arrayList, int i10, ArrayList arrayList2) {
        getMessagesController().putUsers(arrayList, i10 == 1);
        a0.h hVar = new a0.h();
        boolean zIsEmpty = arrayList2.isEmpty();
        if (i10 == 2 && !this.contacts.isEmpty()) {
            int i11 = 0;
            while (i11 < arrayList2.size()) {
                if (this.contactsDict.get(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i11)).user_id)) != null) {
                    arrayList2.remove(i11);
                    i11--;
                }
                i11++;
            }
            arrayList2.addAll(this.contacts);
        }
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i12)).user_id));
            if (user != null) {
                hVar.k(user, user.f22527id);
            }
        }
        Utilities.stageQueue.postRunnable(new r1(this, i10, arrayList2, arrayList, hVar, zIsEmpty));
    }

    public void lambda$readContacts$11() {
        if (this.contacts.isEmpty() && !this.contactsLoaded) {
            loadContacts(true, 0L);
            return;
        }
        synchronized (this.loadContactsSync) {
            this.loadingContacts = false;
        }
    }

    public void lambda$reloadContactsStatuses$58(SharedPreferences.Editor editor, TLObject tLObject) {
        editor.remove("needGetStatuses").commit();
        Vector vector = (Vector) tLObject;
        if (!vector.objects.isEmpty()) {
            ArrayList<TLRPC.User> arrayList = new ArrayList<>();
            ArrayList<T> arrayList2 = vector.objects;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
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

    public void lambda$reloadContactsStatuses$59(SharedPreferences.Editor editor, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof Vector) {
            AndroidUtilities.runOnUIThread(new f0(this, editor, (Vector) tLObject, 14));
        }
    }

    public void lambda$syncPhoneBookByAlert$7(HashMap map, boolean z10, boolean z11, boolean z12) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("sync contacts by alert");
        }
        performSyncPhoneBook(map, true, z10, z11, false, false, z12);
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

    public void lambda$performSyncPhoneBook$23(HashMap<String, ArrayList<Object>> map, ArrayList<String> arrayList, HashMap<String, Contact> map2) {
        mergePhonebookAndTelegramContacts(map, arrayList, map2, true);
    }

    private void performWriteContactsToPhoneBook() {
        Utilities.phoneBookQueue.postRunnable(new o1(this, new ArrayList(this.contacts), 1));
    }

    public void lambda$performWriteContactsToPhoneBook$45(ArrayList<TLRPC.TL_contact> arrayList) throws Throwable {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Cursor cursor = null;
        try {
            try {
                Account account = this.systemAccount;
                if (hasContactsPermission() && account != null && hasContactsWritePermission()) {
                    SharedPreferences mainSettings = MessagesController.getMainSettings(this.currentAccount);
                    boolean z10 = mainSettings.getBoolean("contacts_updated_v7", false);
                    boolean z11 = !z10;
                    if (!z10) {
                        mainSettings.edit().putBoolean("contacts_updated_v7", true).commit();
                    }
                    ContentResolver contentResolver = ApplicationLoader.applicationContext.getContentResolver();
                    Cursor cursorQuery = contentResolver.query(ContactsContract.RawContacts.CONTENT_URI, new String[]{"_id", "sync2"}, null, null, null);
                    try {
                        a0.h hVar = new a0.h();
                        if (cursorQuery != null) {
                            while (cursorQuery.moveToNext()) {
                                hVar.k(Long.valueOf(cursorQuery.getLong(0)), cursorQuery.getLong(1));
                            }
                            cursorQuery.close();
                            FileLog.d("performWriteContactsToPhoneBookInternal contacts array " + arrayList.size() + " " + z11 + " bookContactsSize=" + hVar.m() + " currentAccount=" + this.currentAccount);
                            ArrayList<ContentProviderOperation> arrayList2 = null;
                            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                TLRPC.TL_contact tL_contact = arrayList.get(i10);
                                if (!z10 || hVar.h(tL_contact.user_id) < 0) {
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
                    } catch (Exception e9) {
                        e = e9;
                        cursor = cursorQuery;
                        FileLog.e(e);
                        if (cursor != null) {
                        }
                        FileLog.d("performWriteContactsToPhoneBookInternal " + (System.currentTimeMillis() - jCurrentTimeMillis));
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
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void reloadContactsStatuses() {
        saveContactsLoadTime();
        getMessagesController().clearFullUsers();
        SharedPreferences.Editor editorEdit = MessagesController.getMainSettings(this.currentAccount).edit();
        editorEdit.putBoolean("needGetStatuses", true).commit();
        getConnectionsManager().sendRequest(new TLRPC.TL_contacts_getStatuses(), new t1(0, this, editorEdit));
    }

    private void saveContactsLoadTime() {
        try {
            MessagesController.getMainSettings(this.currentAccount).edit().putLong("lastReloadStatusTime", System.currentTimeMillis()).commit();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    private void updateUnregisteredContacts() {
        HashMap map = new HashMap();
        int size = this.contacts.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.TL_contact tL_contact = this.contacts.get(i10);
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(tL_contact.user_id));
            if (user != null && !TextUtils.isEmpty(user.phone)) {
                map.put(user.phone, tL_contact);
            }
        }
        ArrayList<Contact> arrayList = new ArrayList<>();
        Iterator<Map.Entry<String, Contact>> it = this.contactsBook.entrySet().iterator();
        while (it.hasNext()) {
            Contact value = it.next().getValue();
            int i11 = 0;
            while (true) {
                if (i11 >= value.phones.size()) {
                    arrayList.add(value);
                    break;
                } else if (map.containsKey(value.shortPhones.get(i11)) || value.phoneDeleted.get(i11).intValue() == 1) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        Collections.sort(arrayList, new k1(getLocaleCollator(), 5));
        this.phoneBookContacts = arrayList;
    }

    public void addContact(TLRPC.User user, boolean z10) {
        addContact(user, null, z10);
    }

    public long addContactToPhoneBook(TLRPC.User user, boolean z10) {
        Uri uri;
        long j10 = -1;
        if (this.systemAccount == null || user == null || !hasContactsWritePermission()) {
            return -1L;
        }
        synchronized (this.observerLock) {
            this.ignoreChanges = true;
        }
        ContentResolver contentResolver = ApplicationLoader.applicationContext.getContentResolver();
        if (z10) {
            try {
                contentResolver.delete(ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", this.systemAccount.name).appendQueryParameter("account_type", this.systemAccount.type).build(), "sync2 = " + user.f22527id, null);
            } catch (Exception unused) {
            }
        }
        ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
        applyContactToPhoneBook(arrayList, user);
        try {
            ContentProviderResult[] contentProviderResultArrApplyBatch = contentResolver.applyBatch("com.android.contacts", arrayList);
            if (contentProviderResultArrApplyBatch != null && contentProviderResultArrApplyBatch.length > 0 && (uri = contentProviderResultArrApplyBatch[0].uri) != null) {
                j10 = Long.parseLong(uri.getLastPathSegment());
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        synchronized (this.observerLock) {
            this.ignoreChanges = false;
        }
        return j10;
    }

    public void checkAppAccount() {
        this.systemAccount = null;
        Utilities.globalQueue.postRunnable(new e1(this, 4));
    }

    public void checkContacts() {
        Utilities.globalQueue.postRunnable(new e1(this, 9));
    }

    public void checkInviteText() {
        SharedPreferences mainSettings = MessagesController.getMainSettings(this.currentAccount);
        this.inviteLink = mainSettings.getString("invitelink", null);
        int i10 = mainSettings.getInt("invitelinktime", 0);
        if (this.updatingInviteLink) {
            return;
        }
        if (this.inviteLink == null || Math.abs((System.currentTimeMillis() / 1000) - ((long) i10)) >= 86400) {
            this.updatingInviteLink = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_help_getInviteText(), new i1(this, 0), 2);
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
        Utilities.globalQueue.postRunnable(new e1(this, 5));
    }

    public void createOrUpdateConnectionServiceContact(long j10, String str, String str2) {
        int i10;
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
            if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("account_type", this.systemAccount.type);
                contentValues.put("account_name", this.systemAccount.name);
                contentValues.put("group_visible", (Integer) 0);
                contentValues.put("group_is_read_only", (Integer) 1);
                contentValues.put("title", "TelegramConnectionService");
                i10 = Integer.parseInt(contentResolver.insert(uriBuild, contentValues).getLastPathSegment());
            } else {
                i10 = cursorQuery.getInt(0);
            }
            if (cursorQuery != 0) {
                cursorQuery.close();
            }
            Uri uri = ContactsContract.Data.CONTENT_URI;
            Cursor cursorQuery2 = contentResolver.query(uri, new String[]{"raw_contact_id"}, "mimetype=? AND data1=?", new String[]{"vnd.android.cursor.item/group_membership", i10 + ""}, null);
            int size = arrayList.size();
            int i11 = i10;
            if (cursorQuery2 != null) {
                try {
                    if (cursorQuery2.moveToFirst()) {
                        int i12 = cursorQuery2.getInt(0);
                        arrayList.add(ContentProviderOperation.newUpdate(uriBuild2).withSelection("_id=?", new String[]{i12 + ""}).withValue("deleted", 0).build());
                        ContentProviderOperation.Builder builderWithSelection = ContentProviderOperation.newUpdate(uri).withSelection("raw_contact_id=? AND mimetype=?", new String[]{i12 + "", "vnd.android.cursor.item/phone_v2"});
                        StringBuilder sb2 = new StringBuilder("+99084");
                        sb2.append(j10);
                        arrayList.add(builderWithSelection.withValue("data1", sb2.toString()).build());
                        arrayList.add(ContentProviderOperation.newUpdate(uri).withSelection("raw_contact_id=? AND mimetype=?", new String[]{i12 + "", "vnd.android.cursor.item/name"}).withValue("data2", str).withValue("data3", str2).build());
                    } else {
                        try {
                            arrayList.add(ContentProviderOperation.newInsert(uriBuild2).withValue("account_type", this.systemAccount.type).withValue("account_name", this.systemAccount.name).withValue("raw_contact_is_read_only", 1).withValue("aggregation_mode", 3).build());
                            arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/name").withValue("data2", str).withValue("data3", str2).build());
                            arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("data1", "+99084" + j10).build());
                            arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/group_membership").withValue("data1", Integer.valueOf(i11)).build());
                        } catch (Exception e9) {
                            e = e9;
                            FileLog.e(e);
                            return;
                        }
                    }
                } catch (Exception e10) {
                    e = e10;
                    FileLog.e(e);
                    return;
                }
            } else {
                arrayList.add(ContentProviderOperation.newInsert(uriBuild2).withValue("account_type", this.systemAccount.type).withValue("account_name", this.systemAccount.name).withValue("raw_contact_is_read_only", 1).withValue("aggregation_mode", 3).build());
                arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/name").withValue("data2", str).withValue("data3", str2).build());
                arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("data1", "+99084" + j10).build());
                arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/group_membership").withValue("data1", Integer.valueOf(i11)).build());
            }
            if (cursorQuery2 != 0) {
                cursorQuery2.close();
            }
            contentResolver.applyBatch("com.android.contacts", arrayList);
        } catch (Exception e11) {
            e = e11;
        }
    }

    public void deleteAllContacts(Runnable runnable) {
        resetImportedContacts();
        TLRPC.TL_contacts_deleteContacts tL_contacts_deleteContacts = new TLRPC.TL_contacts_deleteContacts();
        int size = this.contacts.size();
        for (int i10 = 0; i10 < size; i10++) {
            tL_contacts_deleteContacts.f22424id.add(getMessagesController().getInputUser(this.contacts.get(i10).user_id));
        }
        getConnectionsManager().sendRequest(tL_contacts_deleteContacts, new t1(1, this, runnable));
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
                int i10 = cursorQuery.getInt(0);
                cursorQuery.close();
                Cursor cursorQuery2 = contentResolver.query(ContactsContract.Data.CONTENT_URI, new String[]{"raw_contact_id"}, "mimetype=? AND data1=?", new String[]{"vnd.android.cursor.item/group_membership", i10 + ""}, null);
                if (cursorQuery2 == null || !cursorQuery2.moveToFirst()) {
                    if (cursorQuery2 != null) {
                        cursorQuery2.close();
                        return;
                    }
                    return;
                }
                int i11 = cursorQuery2.getInt(0);
                cursorQuery2.close();
                contentResolver.delete(ContactsContract.RawContacts.CONTENT_URI, "_id=?", new String[]{i11 + ""});
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
    }

    public void deleteContact(ArrayList<TLRPC.User> arrayList, boolean z10) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        TLRPC.TL_contacts_deleteContacts tL_contacts_deleteContacts = new TLRPC.TL_contacts_deleteContacts();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.User user = arrayList.get(i10);
            jh.s6 storiesController = getMessagesController().getStoriesController();
            long j10 = user.f22527id;
            int i11 = storiesController.f13955a;
            ArrayList arrayList3 = storiesController.h;
            ArrayList arrayList4 = storiesController.f13960g;
            for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList4.get(i12)).peer) == j10) {
                    arrayList4.remove(i12);
                    break;
                }
            }
            for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList3.get(i13)).peer) == j10) {
                    arrayList3.remove(i13);
                    break;
                }
            }
            jh.f7 f7Var = storiesController.f13963k;
            f7Var.f13332b.getStorageQueue().postRunnable(new cg.b2(f7Var, j10, 8));
            MessagesController.getInstance(i11).checkArchiveFolder();
            NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
            TLRPC.InputUser inputUser = getMessagesController().getInputUser(user);
            if (inputUser != null) {
                user.contact = false;
                arrayList2.add(Long.valueOf(user.f22527id));
                tL_contacts_deleteContacts.f22424id.add(inputUser);
            }
        }
        getConnectionsManager().sendRequest(tL_contacts_deleteContacts, new fh.g(this, arrayList2, arrayList, z10, arrayList.get(0).first_name));
    }

    public void deleteContactsUndoable(Context context, org.telegram.ui.ActionBar.n2 n2Var, ArrayList<TLRPC.User> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        HashMap map = new HashMap();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.User user = arrayList.get(i10);
            TLRPC.TL_contact tL_contact = this.contactsDict.get(Long.valueOf(user.f22527id));
            user.contact = false;
            this.contacts.remove(tL_contact);
            this.contactsDict.remove(Long.valueOf(user.f22527id));
            map.put(user, tL_contact);
        }
        buildContactsSectionsArrays(false);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsDidLoad, new Object[0]);
        org.telegram.ui.Components.wb wbVar = new org.telegram.ui.Components.wb(context, n2Var.getResourceProvider());
        wbVar.setTimer();
        wbVar.f34154b.setText(LocaleController.formatPluralString("ContactsDeletedUndo", map.size(), new Object[0]));
        org.telegram.ui.Components.cc ccVar = new org.telegram.ui.Components.cc(context, n2Var.getResourceProvider(), true, true);
        ccVar.f27402a = new e3(27, this, map);
        ccVar.f27403b = new o1(this, arrayList, 2);
        wbVar.setButton(ccVar);
        org.telegram.ui.Components.ec.g(n2Var, wbVar, 5000).j();
    }

    public void deleteUnknownAppAccounts() {
        try {
            this.systemAccount = null;
            AccountManager accountManager = AccountManager.get(ApplicationLoader.applicationContext);
            Account[] accountsByType = accountManager.getAccountsByType("org.telegram.messenger");
            for (int i10 = 0; i10 < accountsByType.length; i10++) {
                Account account = accountsByType[i10];
                int i11 = 0;
                while (true) {
                    if (i11 < 4) {
                        TLRPC.User currentUser = UserConfig.getInstance(i11).getCurrentUser();
                        if (currentUser != null) {
                            if (account.name.equals("" + currentUser.f22527id)) {
                                break;
                            }
                        }
                        i11++;
                    } else {
                        try {
                            accountManager.removeAccount(accountsByType[i10], null, null);
                            break;
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public void forceImportContacts() {
        Utilities.globalQueue.postRunnable(new e1(this, 7));
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

    public int getDeleteAccountTTL() {
        return this.deleteAccountTTL;
    }

    public TLRPC.GlobalPrivacySettings getGlobalPrivacySettings() {
        return this.globalPrivacySettings;
    }

    public String getInviteText(int i10) {
        String str = this.inviteLink;
        if (str == null) {
            str = "https://telegram.org/dl";
        }
        if (i10 <= 1) {
            return LocaleController.formatString(R.string.InviteText2, str);
        }
        try {
            return String.format(LocaleController.getPluralString("InviteTextNum", i10), Integer.valueOf(i10), str);
        } catch (Exception unused) {
            return LocaleController.formatString(R.string.InviteText2, str);
        }
    }

    public boolean getLoadingDeleteInfo() {
        return this.loadingDeleteInfo != 2;
    }

    public boolean getLoadingGlobalSettings() {
        return this.loadingGlobalSettings != 2;
    }

    public boolean getLoadingPrivacyInfo(int i10) {
        return this.loadingPrivacyInfo[i10] != 2;
    }

    public ArrayList<TLRPC.PrivacyRule> getPrivacyRules(int i10) {
        switch (i10) {
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

    public boolean isContact(long j10) {
        return this.contactsDict.get(Long.valueOf(j10)) != null;
    }

    public boolean isLoadingContacts() {
        boolean z10;
        synchronized (this.loadContactsSync) {
            z10 = this.loadingContacts;
        }
        return z10;
    }

    public void loadContacts(boolean z10, long j10) {
        synchronized (this.loadContactsSync) {
            this.loadingContacts = true;
        }
        if (z10) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("load contacts from cache");
            }
            getMessagesStorage().getContacts();
        } else {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("load contacts from server");
            }
            TLRPC.TL_contacts_getContacts tL_contacts_getContacts = new TLRPC.TL_contacts_getContacts();
            tL_contacts_getContacts.hash = j10;
            getConnectionsManager().sendRequest(tL_contacts_getContacts, new jh.r5(this, j10, 1));
        }
    }

    public void loadGlobalPrivacySetting() {
        if (this.loadingGlobalSettings == 0) {
            this.loadingGlobalSettings = 1;
            getConnectionsManager().sendRequest(new TL_account.getGlobalPrivacySettings(), new i1(this, 1));
        }
    }

    public void loadPrivacySettings() {
        loadPrivacySettings(false);
    }

    public void markAsContacted(String str) {
        if (str == null) {
            return;
        }
        Utilities.phoneBookQueue.postRunnable(new u1(str, 0));
    }

    public void migratePhoneBookToV7(SparseArray<Contact> sparseArray) {
        Utilities.globalQueue.postRunnable(new e3(26, this, sparseArray));
    }

    public void performSyncPhoneBook(final HashMap<String, Contact> map, final boolean z10, final boolean z11, final boolean z12, final boolean z13, final boolean z14, final boolean z15) {
        if (z11 || this.contactsBookLoaded) {
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() throws Throwable {
                    this.f20431a.lambda$performSyncPhoneBook$25(map, z12, z10, z11, z13, z14, z15);
                }
            });
        }
    }

    public void processContactsUpdates(ArrayList<Long> arrayList, ConcurrentHashMap<Long, TLRPC.User> concurrentHashMap) {
        int iIndexOf;
        int iIndexOf2;
        ArrayList<TLRPC.TL_contact> arrayList2 = new ArrayList<>();
        ArrayList<Long> arrayList3 = new ArrayList<>();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Long l10 = arrayList.get(i10);
            i10++;
            Long l11 = l10;
            if (l11.longValue() > 0) {
                TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                tL_contact.user_id = l11.longValue();
                arrayList2.add(tL_contact);
                if (!this.delayedContactsUpdate.isEmpty() && (iIndexOf = this.delayedContactsUpdate.indexOf(Long.valueOf(-l11.longValue()))) != -1) {
                    this.delayedContactsUpdate.remove(iIndexOf);
                }
            } else if (l11.longValue() < 0) {
                arrayList3.add(Long.valueOf(-l11.longValue()));
                if (!this.delayedContactsUpdate.isEmpty() && (iIndexOf2 = this.delayedContactsUpdate.indexOf(Long.valueOf(-l11.longValue()))) != -1) {
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
        if (this.contactsLoaded && this.contactsBookLoaded) {
            applyContactsUpdates(arrayList, concurrentHashMap, arrayList2, arrayList3);
            return;
        }
        this.delayedContactsUpdate.addAll(arrayList);
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("delay update - contacts add = " + arrayList2.size() + " delete = " + arrayList3.size());
        }
    }

    public void processLoadedContacts(ArrayList<TLRPC.TL_contact> arrayList, ArrayList<TLRPC.User> arrayList2, int i10) {
        AndroidUtilities.runOnUIThread(new h0(this, arrayList2, i10, arrayList, 3));
    }

    public void readContacts() {
        synchronized (this.loadContactsSync) {
            try {
                if (this.loadingContacts) {
                    return;
                }
                this.loadingContacts = true;
                Utilities.stageQueue.postRunnable(new e1(this, 8));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public HashMap<String, Contact> readContactsFromPhoneBook() {
        HashMap<String, Contact> map;
        Cursor cursorQuery;
        HashMap<String, Contact> map2;
        HashMap<String, Contact> map3;
        int i10;
        ContentResolver contentResolver;
        ArrayList arrayList;
        long j10;
        String str;
        int i11;
        int i12;
        Cursor cursorQuery2;
        ContentResolver contentResolver2;
        String strSubstring;
        long j11;
        String str2;
        ArrayList arrayList2;
        String str3;
        ContactsController contactsController = this;
        if (!contactsController.getUserConfig().syncContacts) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("contacts sync disabled");
            }
            return new HashMap<>();
        }
        if (!hasContactsPermission()) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("app has no contacts permissions");
            }
            return new HashMap<>();
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            ContentResolver contentResolver3 = ApplicationLoader.applicationContext.getContentResolver();
            HashMap map4 = new HashMap();
            ArrayList arrayList3 = new ArrayList();
            cursorQuery = contentResolver3.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, projectionPhones, null, null, null);
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                String str4 = "+";
                int i13 = 1;
                if (cursorQuery != null) {
                    try {
                        int count = cursorQuery.getCount();
                        if (count > 0) {
                            map3 = new HashMap<>(count);
                            i10 = 1;
                            while (cursorQuery.moveToNext()) {
                                try {
                                    String string = cursorQuery.getString(i13);
                                    String string2 = cursorQuery.getString(5);
                                    if (string2 == null) {
                                        string2 = "";
                                    }
                                    boolean z10 = string2.indexOf(".sim") != 0;
                                    if (TextUtils.isEmpty(string)) {
                                        contentResolver2 = contentResolver3;
                                    } else {
                                        contentResolver2 = contentResolver3;
                                        String strD = oe.b.d(string, true);
                                        if (!TextUtils.isEmpty(strD)) {
                                            if (strD.startsWith(str4)) {
                                                try {
                                                    strSubstring = strD.substring(1);
                                                } catch (Throwable th) {
                                                    th = th;
                                                    map = map3;
                                                    try {
                                                        FileLog.e(th);
                                                        if (map != null) {
                                                            map.clear();
                                                        }
                                                        if (cursorQuery != null) {
                                                            try {
                                                                cursorQuery.close();
                                                            } catch (Exception e9) {
                                                                FileLog.e(e9);
                                                            }
                                                        }
                                                        map2 = map;
                                                        if (map2 != null) {
                                                            return map2;
                                                        }
                                                        return new HashMap<>();
                                                    } catch (Throwable th2) {
                                                        if (cursorQuery == null) {
                                                            throw th2;
                                                        }
                                                        try {
                                                            cursorQuery.close();
                                                            throw th2;
                                                        } catch (Exception e10) {
                                                            FileLog.e(e10);
                                                            throw th2;
                                                        }
                                                    }
                                                }
                                            } else {
                                                strSubstring = strD;
                                            }
                                            j11 = jCurrentTimeMillis;
                                            String string3 = cursorQuery.getString(0);
                                            sb2.setLength(0);
                                            DatabaseUtils.appendEscapedSQLString(sb2, string3);
                                            String string4 = sb2.toString();
                                            str2 = str4;
                                            Contact contact = (Contact) map4.get(strSubstring);
                                            if (contact != null) {
                                                if (!contact.isGoodProvider && !string2.equals(contact.provider)) {
                                                    sb2.setLength(0);
                                                    DatabaseUtils.appendEscapedSQLString(sb2, contact.key);
                                                    arrayList3.remove(sb2.toString());
                                                    arrayList3.add(string4);
                                                    contact.key = string3;
                                                    contact.isGoodProvider = z10;
                                                    contact.provider = string2;
                                                }
                                                contentResolver3 = contentResolver2;
                                                jCurrentTimeMillis = j11;
                                            } else {
                                                if (!arrayList3.contains(string4)) {
                                                    arrayList3.add(string4);
                                                }
                                                int i14 = cursorQuery.getInt(2);
                                                Contact contact2 = map3.get(string3);
                                                if (contact2 == null) {
                                                    contact2 = new Contact();
                                                    String string5 = cursorQuery.getString(4);
                                                    String strTrim = string5 == null ? "" : string5.trim();
                                                    if (contactsController.isNotValidNameString(strTrim)) {
                                                        contact2.first_name = strTrim;
                                                        contact2.last_name = "";
                                                        arrayList2 = arrayList3;
                                                    } else {
                                                        int iLastIndexOf = strTrim.lastIndexOf(32);
                                                        arrayList2 = arrayList3;
                                                        if (iLastIndexOf != -1) {
                                                            contact2.first_name = strTrim.substring(0, iLastIndexOf).trim();
                                                            contact2.last_name = strTrim.substring(iLastIndexOf + 1).trim();
                                                        } else {
                                                            contact2.first_name = strTrim;
                                                            contact2.last_name = "";
                                                        }
                                                    }
                                                    contact2.provider = string2;
                                                    contact2.isGoodProvider = z10;
                                                    contact2.key = string3;
                                                    contact2.contact_id = i10;
                                                    map3.put(string3, contact2);
                                                    i10++;
                                                } else {
                                                    arrayList2 = arrayList3;
                                                }
                                                contact2.shortPhones.add(strSubstring);
                                                contact2.phones.add(strD);
                                                contact2.phoneDeleted.add(0);
                                                if (i14 == 0) {
                                                    String string6 = cursorQuery.getString(3);
                                                    ArrayList<String> arrayList4 = contact2.phoneTypes;
                                                    if (string6 == null) {
                                                        string6 = LocaleController.getString(R.string.PhoneMobile);
                                                    }
                                                    arrayList4.add(string6);
                                                } else {
                                                    if (i14 == 1) {
                                                        contact2.phoneTypes.add(LocaleController.getString(R.string.PhoneHome));
                                                    } else if (i14 == 2) {
                                                        contact2.phoneTypes.add(LocaleController.getString(R.string.PhoneMobile));
                                                    } else if (i14 == 3) {
                                                        contact2.phoneTypes.add(LocaleController.getString(R.string.PhoneWork));
                                                    } else if (i14 == 12) {
                                                        contact2.phoneTypes.add(LocaleController.getString(R.string.PhoneMain));
                                                    } else {
                                                        contact2.phoneTypes.add(LocaleController.getString(R.string.PhoneOther));
                                                    }
                                                    map4.put(strSubstring, contact2);
                                                    contactsController = this;
                                                    arrayList3 = arrayList2;
                                                    contentResolver3 = contentResolver2;
                                                    jCurrentTimeMillis = j11;
                                                    sb2 = sb2;
                                                }
                                                map4.put(strSubstring, contact2);
                                                contactsController = this;
                                                arrayList3 = arrayList2;
                                                contentResolver3 = contentResolver2;
                                                jCurrentTimeMillis = j11;
                                                sb2 = sb2;
                                            }
                                        }
                                        str4 = str2;
                                        i13 = 1;
                                    }
                                    j11 = jCurrentTimeMillis;
                                    str2 = str4;
                                    contentResolver3 = contentResolver2;
                                    jCurrentTimeMillis = j11;
                                    str4 = str2;
                                    i13 = 1;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                        } else {
                            map3 = null;
                            i10 = 1;
                        }
                        contentResolver = contentResolver3;
                        arrayList = arrayList3;
                        j10 = jCurrentTimeMillis;
                        str = str4;
                        i11 = 3;
                        try {
                            cursorQuery.close();
                        } catch (Exception unused) {
                        }
                        map2 = map3;
                        i12 = i10;
                        cursorQuery2 = null;
                    } catch (Throwable th4) {
                        th = th4;
                        map = null;
                    }
                } else {
                    contentResolver = contentResolver3;
                    arrayList = arrayList3;
                    j10 = jCurrentTimeMillis;
                    str = "+";
                    i11 = 3;
                    cursorQuery2 = cursorQuery;
                    map2 = null;
                    i12 = 1;
                }
                try {
                    String strJoin = TextUtils.join(",", arrayList);
                    ContentResolver contentResolver4 = contentResolver;
                    cursorQuery2 = contentResolver4.query(ContactsContract.Data.CONTENT_URI, projectionNames, "lookup IN (" + strJoin + ") AND mimetype = 'vnd.android.cursor.item/name'", null, null);
                    if (cursorQuery2 != null) {
                        while (cursorQuery2.moveToNext()) {
                            String string7 = cursorQuery2.getString(0);
                            String string8 = cursorQuery2.getString(1);
                            String string9 = cursorQuery2.getString(2);
                            String string10 = cursorQuery2.getString(i11);
                            Contact contact3 = map2 != null ? map2.get(string7) : null;
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
                                        if (TextUtils.isEmpty(contact3.first_name)) {
                                            contact3.first_name = string10;
                                        } else {
                                            contact3.first_name += " " + string10;
                                        }
                                    }
                                } else if (!isNotValidNameString(string8) && (contact3.first_name.contains(string8) || string8.contains(contact3.first_name))) {
                                    if (string8 != null) {
                                        contact3.first_name = string8;
                                    } else {
                                        contact3.first_name = "";
                                    }
                                    if (!TextUtils.isEmpty(string10)) {
                                        if (TextUtils.isEmpty(contact3.first_name)) {
                                            contact3.first_name = string10;
                                        } else {
                                            contact3.first_name += " " + string10;
                                        }
                                    }
                                    if (string9 != null) {
                                        contact3.last_name = string9;
                                    } else {
                                        contact3.last_name = "";
                                    }
                                } else if (!isNotValidNameString(string9) && (contact3.last_name.contains(string9) || string8.contains(contact3.last_name))) {
                                    if (string8 != null) {
                                        contact3.first_name = string8;
                                    } else {
                                        contact3.first_name = "";
                                    }
                                    if (!TextUtils.isEmpty(string10)) {
                                        if (TextUtils.isEmpty(contact3.first_name)) {
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
                                    cursorQuery = cursorQuery2;
                                    map = map2;
                                    FileLog.e(th);
                                    if (map != null) {
                                        map.clear();
                                    }
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    map2 = map;
                                    if (map2 != null) {
                                        return map2;
                                    }
                                    return new HashMap<>();
                                }
                            }
                        }
                        try {
                            cursorQuery2.close();
                        } catch (Exception unused2) {
                        }
                        cursorQuery2 = null;
                    }
                    try {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("loading contacts 1 query time = ");
                        sb3.append(System.currentTimeMillis() - j10);
                        sb3.append(" contactsSize = ");
                        sb3.append(map2 == null ? 0 : map2.size());
                        FileLog.d(sb3.toString());
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        HashMap map5 = new HashMap();
                        ArrayList arrayList5 = new ArrayList();
                        Cursor cursorQuery3 = contentResolver4.query(ContactsContract.Contacts.CONTENT_URI, new String[]{"_id", "lookup", "display_name"}, "has_phone_number = ?", new String[]{"0"}, null);
                        if (cursorQuery3 != null) {
                            while (cursorQuery3.moveToNext()) {
                                PhoneBookContact phoneBookContact = new PhoneBookContact();
                                phoneBookContact.f19609id = cursorQuery3.getString(0);
                                phoneBookContact.lookup_key = cursorQuery3.getString(1);
                                phoneBookContact.name = cursorQuery3.getString(2);
                                if (map2 == null || map2.get(phoneBookContact.lookup_key) == null) {
                                    if (!TextUtils.isEmpty(phoneBookContact.name)) {
                                        map5.put(phoneBookContact.f19609id, phoneBookContact);
                                        arrayList5.add(phoneBookContact.f19609id);
                                    }
                                }
                            }
                            cursorQuery3.close();
                        }
                        FileLog.d("loading contacts 2 query time = " + (System.currentTimeMillis() - jCurrentTimeMillis2) + " phoneBookConacts size = " + arrayList5.size());
                        long jCurrentTimeMillis3 = System.currentTimeMillis();
                        if (!arrayList5.isEmpty()) {
                            Pattern patternCompile = Pattern.compile(".*(\\+[0-9 \\-]+).*");
                            try {
                                cursorQuery2 = contentResolver4.query(ContactsContract.Data.CONTENT_URI, new String[]{"contact_id", "data1", "data2", "data3", "data4"}, "contact_id IN (" + TextUtils.join(", ", arrayList5) + ")", null, null);
                                if (cursorQuery2 != null) {
                                    while (cursorQuery2.moveToNext()) {
                                        PhoneBookContact phoneBookContact2 = (PhoneBookContact) map5.get(cursorQuery2.getString(0));
                                        if (phoneBookContact2 != null) {
                                            int i15 = 4;
                                            String[] strArr = {cursorQuery2.getString(1), cursorQuery2.getString(2), cursorQuery2.getString(3), cursorQuery2.getString(4)};
                                            int i16 = 0;
                                            while (true) {
                                                if (i16 < i15) {
                                                    String str5 = strArr[i16];
                                                    if (str5 != null) {
                                                        Matcher matcher = patternCompile.matcher(str5);
                                                        if (matcher.matches()) {
                                                            phoneBookContact2.phone = matcher.group(1).replace(" ", "").replace("-", "");
                                                        }
                                                        String strSubstring2 = phoneBookContact2.phone;
                                                        if (strSubstring2 != null) {
                                                            str3 = str;
                                                            if (strSubstring2.startsWith(str3)) {
                                                                strSubstring2 = phoneBookContact2.phone.substring(1);
                                                            }
                                                            Contact contact4 = new Contact();
                                                            contact4.first_name = phoneBookContact2.name;
                                                            contact4.last_name = "";
                                                            int i17 = i12 + 1;
                                                            contact4.contact_id = i12;
                                                            contact4.key = phoneBookContact2.lookup_key;
                                                            contact4.phones.add(phoneBookContact2.phone);
                                                            contact4.shortPhones.add(strSubstring2);
                                                            contact4.phoneDeleted.add(0);
                                                            contact4.phoneTypes.add(LocaleController.getString(R.string.PhoneOther));
                                                            if (map2 == null) {
                                                                map2 = new HashMap<>();
                                                            }
                                                            map2.put(phoneBookContact2.lookup_key, contact4);
                                                            i12 = i17;
                                                            break;
                                                        }
                                                    }
                                                    i16++;
                                                    str = str;
                                                    i15 = 4;
                                                }
                                            }
                                            str = str3;
                                        }
                                        str3 = str;
                                        str = str3;
                                    }
                                    cursorQuery2.close();
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                map = map2;
                                cursorQuery = cursorQuery2;
                                FileLog.e(th);
                                if (map != null) {
                                    map.clear();
                                }
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                map2 = map;
                            }
                        }
                        FileLog.d("loading contacts 3 query time = " + (System.currentTimeMillis() - jCurrentTimeMillis3));
                        if (cursorQuery2 != null) {
                            try {
                                cursorQuery2.close();
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                        }
                    } catch (Throwable th7) {
                        th = th7;
                    }
                } catch (Throwable th8) {
                    th = th8;
                }
            } catch (Throwable th9) {
                th = th9;
                map = null;
            }
        } catch (Throwable th10) {
            th = th10;
            map = null;
            cursorQuery = null;
        }
        if (map2 != null) {
            return map2;
        }
        return new HashMap<>();
    }

    public void reloadContactsStatusesMaybe(boolean z10) {
        try {
            if (MessagesController.getMainSettings(this.currentAccount).getLong("lastReloadStatusTime", 0L) >= System.currentTimeMillis() - 10800000 && !z10) {
                return;
            }
            reloadContactsStatuses();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public void resetImportedContacts() {
        getConnectionsManager().sendRequest(new TLRPC.TL_contacts_resetSaved(), new e5(2));
    }

    public void setDeleteAccountTTL(int i10) {
        this.deleteAccountTTL = i10;
    }

    public void setPrivacyRules(ArrayList<TLRPC.PrivacyRule> arrayList, int i10) {
        switch (i10) {
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

    public void syncPhoneBookByAlert(HashMap<String, Contact> map, boolean z10, boolean z11, boolean z12) {
        Utilities.globalQueue.postRunnable(new m1(this, map, z10, z11, z12));
    }

    private void mergePhonebookAndTelegramContacts(HashMap<String, ArrayList<Object>> map, ArrayList<String> arrayList, HashMap<String, Contact> map2, boolean z10) {
        Utilities.globalQueue.postRunnable(new h3.p1(this, z10, new ArrayList(this.contacts), map2, map, arrayList));
    }

    public void addContact(TLRPC.User user, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10) {
        if (user == null) {
            return;
        }
        TLRPC.TL_contacts_addContact tL_contacts_addContact = new TLRPC.TL_contacts_addContact();
        tL_contacts_addContact.f22422id = getMessagesController().getInputUser(user);
        tL_contacts_addContact.first_name = user.first_name;
        tL_contacts_addContact.last_name = user.last_name;
        String str = user.phone;
        tL_contacts_addContact.phone = str;
        tL_contacts_addContact.add_phone_privacy_exception = z10;
        if (str == null) {
            tL_contacts_addContact.phone = "";
        } else if (str.length() > 0 && !tL_contacts_addContact.phone.startsWith("+")) {
            tL_contacts_addContact.phone = "+" + tL_contacts_addContact.phone;
        }
        if (tL_textWithEntities != null) {
            tL_contacts_addContact.flags |= 2;
            tL_contacts_addContact.note = tL_textWithEntities;
        }
        getConnectionsManager().sendRequest(tL_contacts_addContact, new t1(2, this, user), 6);
    }

    public void loadPrivacySettings(boolean z10) {
        TL_account.getPrivacy getprivacy;
        if (this.loadingDeleteInfo == 0) {
            this.loadingDeleteInfo = 1;
            getConnectionsManager().sendRequest(new TL_account.getAccountTTL(), new i1(this, 2));
        }
        loadGlobalPrivacySetting();
        int i10 = 0;
        while (true) {
            int[] iArr = this.loadingPrivacyInfo;
            if (i10 >= iArr.length) {
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.privacyRulesUpdated, new Object[0]);
                return;
            }
            if (z10) {
                if (iArr[i10] != 1) {
                    iArr[i10] = 1;
                    getprivacy = new TL_account.getPrivacy();
                    switch (i10) {
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
                    getConnectionsManager().sendRequest(getprivacy, new ga(this, i10, 3));
                }
            } else if (iArr[i10] == 0) {
                iArr[i10] = 1;
                getprivacy = new TL_account.getPrivacy();
                switch (i10) {
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
                getConnectionsManager().sendRequest(getprivacy, new ga(this, i10, 3));
            }
            i10++;
        }
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

    public static String formatName(String str, String str2, int i10) {
        if (str != null) {
            str = str.trim();
        }
        if (str != null && str2 == null && i10 > 0 && str.contains(" ")) {
            int iIndexOf = str.indexOf(" ");
            String strSubstring = str.substring(iIndexOf + 1);
            str = str.substring(0, iIndexOf);
            str2 = strSubstring;
        }
        if (str2 != null) {
            str2 = str2.trim();
        }
        StringBuilder sb2 = new StringBuilder((str != null ? str.length() : 0) + (str2 != null ? str2.length() : 0) + 1);
        if (LocaleController.nameDisplayOrder == 1) {
            if (str != null && str.length() > 0) {
                if (i10 > 0 && str.length() > i10 + 2) {
                    return str.substring(0, i10) + "…";
                }
                sb2.append(str);
                if (str2 != null && str2.length() > 0) {
                    sb2.append(" ");
                    if (i10 > 0) {
                        if (str2.length() + sb2.length() > i10) {
                            sb2.append(str2.charAt(0));
                        } else {
                            sb2.append(str2);
                        }
                    } else {
                        sb2.append(str2);
                    }
                }
            } else if (str2 != null && str2.length() > 0) {
                if (i10 > 0 && str2.length() > i10 + 2) {
                    return str2.substring(0, i10) + "…";
                }
                sb2.append(str2);
            }
        } else if (str2 != null && str2.length() > 0) {
            if (i10 > 0 && str2.length() > i10 + 2) {
                return str2.substring(0, i10) + "…";
            }
            sb2.append(str2);
            if (str != null && str.length() > 0) {
                sb2.append(" ");
                if (i10 > 0) {
                    if (str.length() + sb2.length() > i10) {
                        sb2.append(str.charAt(0));
                    } else {
                        sb2.append(str);
                    }
                } else {
                    sb2.append(str);
                }
            }
        } else if (str != null && str.length() > 0) {
            if (i10 > 0 && str.length() > i10 + 2) {
                return str.substring(0, i10) + "…";
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    public static void lambda$resetImportedContacts$10(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
