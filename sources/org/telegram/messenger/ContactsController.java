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
            if (!TextUtils.isEmpty(str)) {
                return str.substring(0, 1);
            }
            if (!TextUtils.isEmpty(str2)) {
                return str2.substring(0, 1);
            }
            return "#";
        }
    }

    public class MyContentObserver extends ContentObserver {
        private Runnable checkRunnable;

        public MyContentObserver() {
            super(null);
            ContactsController.this = r2;
            this.checkRunnable = new x1(0);
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
        public void onChange(boolean z4) {
            super.onChange(z4);
            synchronized (ContactsController.this.observerLock) {
                try {
                    if (ContactsController.this.ignoreChanges) {
                        return;
                    }
                    Utilities.globalQueue.cancelRunnable(this.checkRunnable);
                    Utilities.globalQueue.postRunnable(this.checkRunnable, 500L);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public class PhoneBookContact {
        String f16656id;
        String lookup_key;
        String name;
        String phone;

        private PhoneBookContact() {
            ContactsController.this = r1;
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
            Utilities.globalQueue.postRunnable(new f1(this, 6));
        }
    }

    private void applyContactToPhoneBook(ArrayList<ContentProviderOperation> arrayList, TLRPC.User user) {
        String str;
        String str2;
        if (user == null) {
            return;
        }
        int size = arrayList.size();
        ContentProviderOperation.Builder newInsert = ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI);
        newInsert.withValue("account_name", this.systemAccount.name);
        newInsert.withValue("account_type", this.systemAccount.type);
        if (TextUtils.isEmpty(user.phone)) {
            str = "";
        } else {
            str = user.phone;
        }
        newInsert.withValue("sync1", str);
        newInsert.withValue("sync2", Long.valueOf(user.f19331id));
        arrayList.add(newInsert.build());
        Uri uri = ContactsContract.Data.CONTENT_URI;
        ContentProviderOperation.Builder newInsert2 = ContentProviderOperation.newInsert(uri);
        newInsert2.withValueBackReference("raw_contact_id", size);
        newInsert2.withValue("mimetype", "vnd.android.cursor.item/name");
        newInsert2.withValue("data2", user.first_name);
        newInsert2.withValue("data3", user.last_name);
        arrayList.add(newInsert2.build());
        if (TextUtils.isEmpty(user.phone)) {
            str2 = formatName(user.first_name, user.last_name);
        } else {
            str2 = "+" + user.phone;
        }
        ContentProviderOperation.Builder newInsert3 = ContentProviderOperation.newInsert(uri);
        newInsert3.withValueBackReference("raw_contact_id", size);
        newInsert3.withValue("mimetype", "vnd.android.cursor.item/vnd.org.telegram.messenger.android.profile");
        newInsert3.withValue("data1", Long.valueOf(user.f19331id));
        newInsert3.withValue("data2", "Telegram Profile");
        newInsert3.withValue("data3", LocaleController.formatString("ContactShortcutMessage", R.string.ContactShortcutMessage, str2));
        newInsert3.withValue("data4", Long.valueOf(user.f19331id));
        arrayList.add(newInsert3.build());
        ContentProviderOperation.Builder newInsert4 = ContentProviderOperation.newInsert(uri);
        newInsert4.withValueBackReference("raw_contact_id", size);
        newInsert4.withValue("mimetype", "vnd.android.cursor.item/vnd.org.telegram.messenger.android.call");
        newInsert4.withValue("data1", Long.valueOf(user.f19331id));
        newInsert4.withValue("data2", "Telegram Voice Call");
        newInsert4.withValue("data3", LocaleController.formatString("ContactShortcutVoiceCall", R.string.ContactShortcutVoiceCall, str2));
        newInsert4.withValue("data4", Long.valueOf(user.f19331id));
        arrayList.add(newInsert4.build());
        ContentProviderOperation.Builder newInsert5 = ContentProviderOperation.newInsert(uri);
        newInsert5.withValueBackReference("raw_contact_id", size);
        newInsert5.withValue("mimetype", "vnd.android.cursor.item/vnd.org.telegram.messenger.android.call.video");
        newInsert5.withValue("data1", Long.valueOf(user.f19331id));
        newInsert5.withValue("data2", "Telegram Video Call");
        newInsert5.withValue("data3", LocaleController.formatString("ContactShortcutVideoCall", R.string.ContactShortcutVideoCall, str2));
        newInsert5.withValue("data4", Long.valueOf(user.f19331id));
        arrayList.add(newInsert5.build());
    }

    private void applyContactsUpdates(ArrayList<Long> arrayList, ConcurrentHashMap<Long, TLRPC.User> concurrentHashMap, ArrayList<TLRPC.TL_contact> arrayList2, ArrayList<Long> arrayList3) {
        TLRPC.User user;
        int indexOf;
        int indexOf2;
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
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        boolean z4 = false;
        while (true) {
            TLRPC.User user2 = null;
            if (i11 >= arrayList2.size()) {
                break;
            }
            TLRPC.TL_contact tL_contact2 = arrayList2.get(i11);
            if (concurrentHashMap != null) {
                user2 = concurrentHashMap.get(Long.valueOf(tL_contact2.user_id));
            }
            if (user2 == null) {
                user2 = getMessagesController().getUser(Long.valueOf(tL_contact2.user_id));
            } else {
                getMessagesController().putUser(user2, true);
            }
            if (user2 != null && !TextUtils.isEmpty(user2.phone)) {
                Contact contact = this.contactsBookSPhones.get(user2.phone);
                if (contact != null && (indexOf2 = contact.shortPhones.indexOf(user2.phone)) != -1) {
                    contact.phoneDeleted.set(indexOf2, 0);
                }
                if (sb.length() != 0) {
                    sb.append(",");
                }
                sb.append(user2.phone);
            } else {
                z4 = true;
            }
            i11++;
        }
        for (int i12 = 0; i12 < arrayList3.size(); i12++) {
            Long l11 = arrayList3.get(i12);
            Utilities.phoneBookQueue.postRunnable(new e3(26, this, l11));
            if (concurrentHashMap != null) {
                user = concurrentHashMap.get(l11);
            } else {
                user = null;
            }
            if (user == null) {
                user = getMessagesController().getUser(l11);
            } else {
                getMessagesController().putUser(user, true);
            }
            if (user == null) {
                z4 = true;
            } else if (!TextUtils.isEmpty(user.phone)) {
                Contact contact2 = this.contactsBookSPhones.get(user.phone);
                if (contact2 != null && (indexOf = contact2.shortPhones.indexOf(user.phone)) != -1) {
                    contact2.phoneDeleted.set(indexOf, 1);
                }
                if (sb2.length() != 0) {
                    sb2.append(",");
                }
                sb2.append(user.phone);
            }
        }
        if (sb.length() != 0 || sb2.length() != 0) {
            getMessagesStorage().applyPhoneBookUpdates(sb.toString(), sb2.toString());
        }
        if (z4) {
            Utilities.stageQueue.postRunnable(new f1(this, 3));
        } else {
            AndroidUtilities.runOnUIThread(new g0((BaseController) this, (ArrayList) arrayList2, (Object) arrayList3, 15));
        }
    }

    private void buildContactsSectionsArrays(boolean z4) {
        String upperCase;
        Collator localeCollator = getLocaleCollator();
        if (z4) {
            Collections.sort(this.contacts, new k1(this, localeCollator, 0));
        }
        HashMap<String, ArrayList<TLRPC.TL_contact>> hashMap = new HashMap<>();
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < this.contacts.size(); i10++) {
            TLRPC.TL_contact tL_contact = this.contacts.get(i10);
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
                ArrayList<TLRPC.TL_contact> arrayList2 = hashMap.get(upperCase);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                    hashMap.put(upperCase, arrayList2);
                    arrayList.add(upperCase);
                }
                arrayList2.add(tL_contact);
            }
        }
        Collections.sort(arrayList, new l1(localeCollator, 0));
        this.usersSectionsDict = hashMap;
        this.sortedUsersSectionsArray = arrayList;
    }

    private boolean checkContactsInternal() {
        Throwable th2;
        boolean z4 = false;
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
                    if (this.lastContactsVersions.length() != 0) {
                        if (!this.lastContactsVersions.equals(sb2)) {
                            z4 = true;
                        }
                    }
                    try {
                        this.lastContactsVersions = sb2;
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                            query.close();
                            throw th2;
                        }
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                }
            }
            if (query != null) {
                query.close();
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        return z4;
    }

    private void deleteContactFromPhoneBook(long j10) {
        if (hasContactsPermission()) {
            synchronized (this.observerLock) {
                this.ignoreChanges = true;
            }
            try {
                ContentResolver contentResolver = ApplicationLoader.applicationContext.getContentResolver();
                Uri build = ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", this.systemAccount.name).appendQueryParameter("account_type", this.systemAccount.type).build();
                contentResolver.delete(build, "sync2 = " + j10, null);
            } catch (Exception e) {
                FileLog.e((Throwable) e, false);
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
        if (tLObject instanceof TLRPC.Chat) {
            return ((TLRPC.Chat) tLObject).title;
        }
        return LocaleController.getString(R.string.HiddenName);
    }

    private long getContactsHash(ArrayList<TLRPC.TL_contact> arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        Collections.sort(arrayList2, new s(3));
        int size = arrayList2.size();
        long j10 = 0;
        for (int i10 = -1; i10 < size; i10++) {
            if (i10 == -1) {
                j10 = MediaDataController.calcHash(j10, getUserConfig().contactsSavedCount);
            } else {
                j10 = MediaDataController.calcHash(j10, ((TLRPC.TL_contact) arrayList2.get(i10)).user_id);
            }
        }
        return j10;
    }

    public static ContactsController getInstance(int i10) {
        ContactsController contactsController;
        ContactsController contactsController2 = Instance[i10];
        if (contactsController2 == null) {
            synchronized (ContactsController.class) {
                try {
                    contactsController = Instance[i10];
                    if (contactsController == null) {
                        ContactsController[] contactsControllerArr = Instance;
                        ContactsController contactsController3 = new ContactsController(i10);
                        contactsControllerArr[i10] = contactsController3;
                        contactsController = contactsController3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return contactsController;
        }
        return contactsController2;
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
            } catch (Exception e6) {
                FileLog.e((Throwable) e6, true);
            }
        }
        if (cachedCollator == null) {
            cachedCollator = new Collator() {
                @Override
                public int compare(String str, String str2) {
                    if (str != null && str2 != null) {
                        return str.compareTo(str2);
                    }
                    return 0;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ContactsController.hasContactsPermission():boolean");
    }

    public static boolean hasContactsWritePermission() {
        if (Build.VERSION.SDK_INT < 23 || ApplicationLoader.applicationContext.checkSelfPermission("android.permission.WRITE_CONTACTS") == 0) {
            return true;
        }
        return false;
    }

    private boolean isNotValidNameString(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (charAt >= '0' && charAt <= '9') {
                i10++;
            }
        }
        if (i10 > 3) {
            return true;
        }
        return false;
    }

    public void lambda$addContact$50(TLRPC.User user) {
        addContactToPhoneBook(user, true);
    }

    public void lambda$addContact$51(TLRPC.Updates updates, TLRPC.User user) {
        Contact contact;
        boolean z4 = false;
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
                            while (true) {
                                if (i11 >= size) {
                                    break;
                                }
                                Object obj = arrayList2.get(i11);
                                i11++;
                                if (obj instanceof Contact) {
                                    Contact contact2 = (Contact) obj;
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
                    z4 = true;
                }
            }
            if (user2.contact && this.contactsDict.get(Long.valueOf(user2.f19331id)) == null) {
                TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                tL_contact.user_id = user2.f19331id;
                this.contacts.add(tL_contact);
                this.contactsDict.put(Long.valueOf(tL_contact.user_id), tL_contact);
            }
        }
        buildContactsSectionsArrays(true);
        if (z4) {
            mergePhonebookAndTelegramContacts(this.phoneBookSectionsDict, this.phoneBookSectionsArray, this.phoneBookByShortPhones, false);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsDidLoad, new Object[0]);
    }

    public void lambda$addContact$52(TLRPC.User user, TLObject tLObject, TLRPC.TL_error tL_error) {
        int indexOf;
        if (tL_error != null) {
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null && userProfilePhoto.personal) {
            for (int i10 = 0; i10 < updates.users.size(); i10++) {
                if (updates.users.get(i10).f19331id == user.f19331id) {
                    updates.users.get(i10).photo = user.photo;
                }
            }
        }
        getMessagesController().processUpdates(updates, false);
        for (int i11 = 0; i11 < updates.users.size(); i11++) {
            TLRPC.User user2 = updates.users.get(i11);
            if (user2.f19331id == user.f19331id) {
                Utilities.phoneBookQueue.postRunnable(new e3(23, this, user2));
                TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                tL_contact.user_id = user2.f19331id;
                ArrayList<TLRPC.TL_contact> arrayList = new ArrayList<>();
                arrayList.add(tL_contact);
                getMessagesStorage().putContacts(arrayList, false);
                if (!TextUtils.isEmpty(user2.phone)) {
                    formatName(user2.first_name, user2.last_name);
                    getMessagesStorage().applyPhoneBookUpdates(user2.phone, "");
                    Contact contact = this.contactsBookSPhones.get(user2.phone);
                    if (contact != null && (indexOf = contact.shortPhones.indexOf(user2.phone)) != -1) {
                        contact.phoneDeleted.set(indexOf, 0);
                    }
                }
            }
        }
        AndroidUtilities.runOnUIThread(new g0(this, updates, user, 13));
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
                            String str = account.name;
                            if (str.equals("" + currentUser.f19331id)) {
                                if (i11 == this.currentAccount) {
                                    this.systemAccount = account;
                                }
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
        SharedPreferences.Editor edit = MessagesController.getMainSettings(this.currentAccount).edit();
        String str = tL_help_inviteText.message;
        this.inviteLink = str;
        edit.putString("invitelink", str);
        edit.putInt("invitelinktime", (int) (System.currentTimeMillis() / 1000));
        edit.commit();
    }

    public void lambda$checkInviteText$3(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            TLRPC.TL_help_inviteText tL_help_inviteText = (TLRPC.TL_help_inviteText) tLObject;
            if (tL_help_inviteText.message.length() != 0) {
                AndroidUtilities.runOnUIThread(new e3(25, this, tL_help_inviteText));
            }
        }
    }

    public void lambda$cleanup$1() {
        this.migratingContacts = false;
        this.completedRequestsCount = 0;
    }

    public void lambda$deleteAllContacts$8(Runnable runnable) {
        TLRPC.User currentUser;
        AccountManager accountManager = AccountManager.get(ApplicationLoader.applicationContext);
        try {
            Account[] accountsByType = accountManager.getAccountsByType("org.telegram.messenger");
            this.systemAccount = null;
            for (Account account : accountsByType) {
                int i10 = 0;
                while (true) {
                    if (i10 >= 4) {
                        break;
                    }
                    if (UserConfig.getInstance(i10).getCurrentUser() != null) {
                        if (account.name.equals("" + currentUser.f19331id)) {
                            accountManager.removeAccount(account, null, null);
                            break;
                        }
                    }
                    i10++;
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
            AndroidUtilities.runOnUIThread(new e3(24, this, runnable));
            return;
        }
        AndroidUtilities.runOnUIThread(runnable);
    }

    public void lambda$deleteContact$55(ArrayList arrayList) {
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            deleteContactFromPhoneBook(((TLRPC.User) obj).f19331id);
        }
    }

    public void lambda$deleteContact$56(ArrayList arrayList, boolean z4, String str) {
        int size = arrayList.size();
        boolean z10 = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TLRPC.User user = (TLRPC.User) obj;
            TLRPC.TL_contact tL_contact = this.contactsDict.get(Long.valueOf(user.f19331id));
            if (tL_contact != null) {
                this.contacts.remove(tL_contact);
                this.contactsDict.remove(Long.valueOf(user.f19331id));
                z10 = true;
            }
        }
        if (z10) {
            buildContactsSectionsArrays(false);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsDidLoad, new Object[0]);
        if (z4) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.formatString("DeletedFromYourContacts", R.string.DeletedFromYourContacts, str));
        }
    }

    public void lambda$deleteContact$57(ArrayList arrayList, ArrayList arrayList2, boolean z4, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        int indexOf;
        if (tL_error != null) {
            return;
        }
        getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
        getMessagesStorage().deleteContacts(arrayList);
        Utilities.phoneBookQueue.postRunnable(new p1(this, arrayList2, 0));
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            TLRPC.User user = (TLRPC.User) arrayList2.get(i10);
            if (!TextUtils.isEmpty(user.phone)) {
                getMessagesStorage().applyPhoneBookUpdates(user.phone, "");
                Contact contact = this.contactsBookSPhones.get(user.phone);
                if (contact != null && (indexOf = contact.shortPhones.indexOf(user.phone)) != -1) {
                    contact.phoneDeleted.set(indexOf, 1);
                }
            }
        }
        AndroidUtilities.runOnUIThread(new xj(this, arrayList2, z4, str, 4));
    }

    public void lambda$deleteContactsUndoable$53(HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            TLRPC.User user = (TLRPC.User) entry.getKey();
            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) entry.getValue();
            user.contact = true;
            this.contacts.add(tL_contact);
            this.contactsDict.put(Long.valueOf(user.f19331id), tL_contact);
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
        if (j10 < j11) {
            return -1;
        }
        return 0;
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
            if (j10 != 0 && (contacts_contacts instanceof TLRPC.TL_contacts_contactsNotModified)) {
                this.contactsLoaded = true;
                if (!this.delayedContactsUpdate.isEmpty() && this.contactsBookLoaded) {
                    applyContactsUpdates(this.delayedContactsUpdate, null, null, null);
                    this.delayedContactsUpdate.clear();
                }
                getUserConfig().lastContactsSyncTime = (int) (System.currentTimeMillis() / 1000);
                getUserConfig().saveConfig(false);
                AndroidUtilities.runOnUIThread(new f1(this, 0));
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
        AndroidUtilities.runOnUIThread(new o1(0, this, tLObject, tL_error));
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
        AndroidUtilities.runOnUIThread(new o1(1, this, tLObject, tL_error));
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
        AndroidUtilities.runOnUIThread(new i0(this, tL_error, tLObject, i10, 2));
    }

    public static void lambda$markAsContacted$49(String str) {
        Uri parse = Uri.parse(str);
        ContentValues contentValues = new ContentValues();
        contentValues.put("last_time_contacted", Long.valueOf(System.currentTimeMillis()));
        ApplicationLoader.applicationContext.getContentResolver().update(parse, contentValues, null, null);
    }

    public static int lambda$mergePhonebookAndTelegramContacts$38(Collator collator, Object obj, Object obj2) {
        String str;
        String formatName;
        String str2 = "";
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            str = formatName(user.first_name, user.last_name);
        } else if (!(obj instanceof Contact)) {
            str = "";
        } else {
            Contact contact = (Contact) obj;
            TLRPC.User user2 = contact.user;
            if (user2 != null) {
                str = formatName(user2.first_name, user2.last_name);
            } else {
                str = formatName(contact.first_name, contact.last_name);
            }
        }
        if (obj2 instanceof TLRPC.User) {
            TLRPC.User user3 = (TLRPC.User) obj2;
            str2 = formatName(user3.first_name, user3.last_name);
        } else if (obj2 instanceof Contact) {
            Contact contact2 = (Contact) obj2;
            TLRPC.User user4 = contact2.user;
            if (user4 != null) {
                formatName = formatName(user4.first_name, user4.last_name);
            } else {
                formatName = formatName(contact2.first_name, contact2.last_name);
            }
            str2 = formatName;
        }
        return collator.compare(str, str2);
    }

    public static int lambda$mergePhonebookAndTelegramContacts$39(Collator collator, String str, String str2) {
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

    public void lambda$mergePhonebookAndTelegramContacts$40(ArrayList arrayList, HashMap hashMap, HashMap hashMap2) {
        this.phoneBookSectionsArray = arrayList;
        this.phoneBookByShortPhones = hashMap;
        this.phoneBookSectionsDict = hashMap2;
    }

    public void lambda$mergePhonebookAndTelegramContacts$41(boolean z4, ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ArrayList arrayList2) {
        if (z4) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(((TLRPC.TL_contact) arrayList.get(i10)).user_id));
                if (user != null && !TextUtils.isEmpty(user.phone)) {
                    String str = user.phone;
                    Contact contact = (Contact) hashMap.get(str.substring(Math.max(0, str.length() - 7)));
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
        Collator localeCollator = getLocaleCollator();
        for (ArrayList arrayList4 : hashMap2.values()) {
            Collections.sort(arrayList4, new l1(localeCollator, 1));
        }
        Collections.sort(arrayList2, new l1(localeCollator, 2));
        AndroidUtilities.runOnUIThread(new m1(arrayList2, hashMap, hashMap2, this));
    }

    public void lambda$migratePhoneBookToV7$12(SparseArray sparseArray) {
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
            for (int i10 = 0; i10 < value.shortPhones.size(); i10++) {
                hashMap2.put(value.shortPhones.get(i10), value.key);
            }
        }
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            Contact contact = (Contact) sparseArray.valueAt(i11);
            int i12 = 0;
            while (true) {
                if (i12 >= contact.shortPhones.size()) {
                    break;
                }
                String str = (String) hashMap2.get(contact.shortPhones.get(i12));
                if (str != null) {
                    contact.key = str;
                    hashMap.put(str, contact);
                    break;
                }
                i12++;
            }
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("migrated contacts " + hashMap.size() + " of " + sparseArray.size());
        }
        getMessagesStorage().putCachedPhoneBook(hashMap, true, false);
    }

    public void lambda$new$0() {
        try {
            if (hasContactsPermission()) {
                ApplicationLoader.applicationContext.getContentResolver().registerContentObserver(ContactsContract.Contacts.CONTENT_URI, true, new MyContentObserver());
            }
        } catch (Throwable unused) {
        }
    }

    private void lambda$performSyncPhoneBook$13(HashMap hashMap) {
        ArrayList<TLRPC.User> arrayList = new ArrayList<>();
        if (hashMap != null && !hashMap.isEmpty()) {
            try {
                HashMap hashMap2 = new HashMap();
                for (int i10 = 0; i10 < this.contacts.size(); i10++) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.contacts.get(i10).user_id));
                    if (user != null && !TextUtils.isEmpty(user.phone)) {
                        hashMap2.put(user.phone, user);
                    }
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    Contact contact = (Contact) entry.getValue();
                    int i11 = 0;
                    boolean z4 = false;
                    while (i11 < contact.shortPhones.size()) {
                        TLRPC.User user2 = (TLRPC.User) hashMap2.get(contact.shortPhones.get(i11));
                        if (user2 != null) {
                            arrayList.add(user2);
                            contact.shortPhones.remove(i11);
                            i11--;
                            z4 = true;
                        }
                        i11++;
                    }
                    if (z4) {
                        contact.shortPhones.size();
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        if (!arrayList.isEmpty()) {
            deleteContact(arrayList, false);
        }
    }

    public void lambda$performSyncPhoneBook$14(int i10, HashMap hashMap, boolean z4, boolean z10) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.hasNewContactsToImport, Integer.valueOf(i10), hashMap, Boolean.valueOf(z4), Boolean.valueOf(z10));
    }

    public void lambda$performSyncPhoneBook$15(HashMap hashMap, ArrayList arrayList, HashMap hashMap2) {
        lambda$performSyncPhoneBook$23(hashMap, arrayList, hashMap2);
        updateUnregisteredContacts();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsDidLoad, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsImported, new Object[0]);
    }

    public void lambda$performSyncPhoneBook$16(HashMap hashMap, HashMap hashMap2, boolean z4, HashMap hashMap3, ArrayList arrayList, HashMap hashMap4) {
        this.contactsBookSPhones = hashMap;
        this.contactsBook = hashMap2;
        this.contactsSyncInProgress = false;
        this.contactsBookLoaded = true;
        if (z4) {
            this.contactsLoaded = true;
        }
        if (!this.delayedContactsUpdate.isEmpty() && this.contactsLoaded) {
            applyContactsUpdates(this.delayedContactsUpdate, null, null, null);
            this.delayedContactsUpdate.clear();
        }
        getMessagesStorage().putCachedPhoneBook(hashMap2, false, false);
        AndroidUtilities.runOnUIThread(new m1(this, hashMap3, arrayList, hashMap4, 0));
    }

    public void lambda$performSyncPhoneBook$17(HashMap hashMap, ArrayList arrayList, HashMap hashMap2) {
        lambda$performSyncPhoneBook$23(hashMap, arrayList, hashMap2);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsImported, new Object[0]);
    }

    public void lambda$performSyncPhoneBook$18() {
        getMessagesStorage().getCachedPhoneBook(true);
    }

    public void lambda$performSyncPhoneBook$19(HashMap hashMap, HashMap hashMap2, boolean z4, HashMap hashMap3, ArrayList arrayList, HashMap hashMap4, boolean[] zArr) {
        this.contactsBookSPhones = hashMap;
        this.contactsBook = hashMap2;
        this.contactsSyncInProgress = false;
        this.contactsBookLoaded = true;
        if (z4) {
            this.contactsLoaded = true;
        }
        if (!this.delayedContactsUpdate.isEmpty() && this.contactsLoaded) {
            applyContactsUpdates(this.delayedContactsUpdate, null, null, null);
            this.delayedContactsUpdate.clear();
        }
        AndroidUtilities.runOnUIThread(new m1(this, hashMap3, arrayList, hashMap4, 3));
        if (zArr[0]) {
            Utilities.globalQueue.postRunnable(new f1(this, 1), 300000L);
        }
    }

    public void lambda$performSyncPhoneBook$20(HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i10, HashMap hashMap3, boolean z4, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5, TLObject tLObject, TLRPC.TL_error tL_error) {
        HashMap hashMap6;
        this.completedRequestsCount++;
        if (tL_error == null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("contacts imported");
            }
            TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts = (TLRPC.TL_contacts_importedContacts) tLObject;
            if (!tL_contacts_importedContacts.retry_contacts.isEmpty()) {
                for (int i11 = 0; i11 < tL_contacts_importedContacts.retry_contacts.size(); i11++) {
                    hashMap.remove(sparseArray.get((int) tL_contacts_importedContacts.retry_contacts.get(i11).longValue()));
                }
                zArr[0] = true;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("result has retry contacts");
                }
            }
            for (int i12 = 0; i12 < tL_contacts_importedContacts.popular_invites.size(); i12++) {
                TLRPC.TL_popularContact tL_popularContact = tL_contacts_importedContacts.popular_invites.get(i12);
                Contact contact = (Contact) hashMap2.get(sparseArray.get((int) tL_popularContact.client_id));
                if (contact != null) {
                    contact.imported = tL_popularContact.importers;
                }
            }
            hashMap6 = hashMap2;
            getMessagesStorage().putUsersAndChats(tL_contacts_importedContacts.users, null, true, true);
            ArrayList<TLRPC.TL_contact> arrayList2 = new ArrayList<>();
            for (int i13 = 0; i13 < tL_contacts_importedContacts.imported.size(); i13++) {
                TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                tL_contact.user_id = tL_contacts_importedContacts.imported.get(i13).user_id;
                arrayList2.add(tL_contact);
            }
            processLoadedContacts(arrayList2, tL_contacts_importedContacts.users, 2);
        } else {
            hashMap6 = hashMap2;
            for (int i14 = 0; i14 < tL_contacts_importContacts.contacts.size(); i14++) {
                hashMap.remove(sparseArray.get((int) tL_contacts_importContacts.contacts.get(i14).client_id));
            }
            zArr[0] = true;
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.ui.yh.w(tL_error.text, new StringBuilder("import contacts error "));
            }
        }
        if (this.completedRequestsCount == i10) {
            if (!hashMap.isEmpty()) {
                getMessagesStorage().putCachedPhoneBook(hashMap, false, false);
            }
            Utilities.stageQueue.postRunnable(new t1(this, hashMap3, hashMap6, z4, hashMap4, arrayList, hashMap5, zArr));
        }
    }

    public void lambda$performSyncPhoneBook$21(HashMap hashMap, ArrayList arrayList, HashMap hashMap2) {
        lambda$performSyncPhoneBook$23(hashMap, arrayList, hashMap2);
        updateUnregisteredContacts();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsDidLoad, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsImported, new Object[0]);
    }

    public void lambda$performSyncPhoneBook$22(HashMap hashMap, HashMap hashMap2, boolean z4, HashMap hashMap3, ArrayList arrayList, HashMap hashMap4) {
        this.contactsBookSPhones = hashMap;
        this.contactsBook = hashMap2;
        this.contactsSyncInProgress = false;
        this.contactsBookLoaded = true;
        if (z4) {
            this.contactsLoaded = true;
        }
        if (!this.delayedContactsUpdate.isEmpty() && this.contactsLoaded) {
            applyContactsUpdates(this.delayedContactsUpdate, null, null, null);
            this.delayedContactsUpdate.clear();
        }
        AndroidUtilities.runOnUIThread(new m1(this, hashMap3, arrayList, hashMap4, 2));
    }

    public void lambda$performSyncPhoneBook$24(HashMap hashMap, HashMap hashMap2, boolean z4, HashMap hashMap3, ArrayList arrayList, HashMap hashMap4) {
        this.contactsBookSPhones = hashMap;
        this.contactsBook = hashMap2;
        this.contactsSyncInProgress = false;
        this.contactsBookLoaded = true;
        if (z4) {
            this.contactsLoaded = true;
        }
        if (!this.delayedContactsUpdate.isEmpty() && this.contactsLoaded) {
            applyContactsUpdates(this.delayedContactsUpdate, null, null, null);
            this.delayedContactsUpdate.clear();
        }
        AndroidUtilities.runOnUIThread(new m1(this, hashMap3, arrayList, hashMap4, 4));
    }

    public void lambda$performSyncPhoneBook$25(final java.util.HashMap r31, final boolean r32, boolean r33, final boolean r34, boolean r35, boolean r36, boolean r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ContactsController.lambda$performSyncPhoneBook$25(java.util.HashMap, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    public void lambda$processLoadedContacts$29() {
        this.doneLoadingContacts = true;
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsDidLoad, new Object[0]);
    }

    public static int lambda$processLoadedContacts$30(a0.h hVar, Collator collator, TLRPC.TL_contact tL_contact, TLRPC.TL_contact tL_contact2) {
        return collator.compare(UserObject.getFirstName((TLRPC.User) hVar.f(tL_contact.user_id)), UserObject.getFirstName((TLRPC.User) hVar.f(tL_contact2.user_id)));
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

    public static int lambda$processLoadedContacts$32(Collator collator, String str, String str2) {
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

    public void lambda$processLoadedContacts$33(ArrayList arrayList, ConcurrentHashMap concurrentHashMap, HashMap hashMap, HashMap hashMap2, ArrayList arrayList2, ArrayList arrayList3, int i10, boolean z4, boolean z10) {
        this.contacts = arrayList;
        this.contactsDict = concurrentHashMap;
        this.usersSectionsDict = hashMap;
        this.usersMutualSectionsDict = hashMap2;
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
        if (i10 != 1 && !z4) {
            saveContactsLoadTime();
        } else {
            reloadContactsStatusesMaybe(false);
        }
        if (z10) {
            loadContacts(false, 0L);
        }
    }

    public void lambda$processLoadedContacts$34(HashMap hashMap, HashMap hashMap2) {
        this.contactsByPhone = hashMap;
        this.contactsByShortPhone = hashMap2;
    }

    public void lambda$processLoadedContacts$35(HashMap hashMap, HashMap hashMap2) {
        Utilities.globalQueue.postRunnable(new r1(this, hashMap, hashMap2, 1));
        if (this.contactsSyncInProgress) {
            return;
        }
        this.contactsSyncInProgress = true;
        getMessagesStorage().getCachedPhoneBook(false);
    }

    public void lambda$processLoadedContacts$36(final int i10, final ArrayList arrayList, ArrayList arrayList2, a0.h hVar, final boolean z4) {
        HashMap hashMap;
        HashMap hashMap2;
        int i11;
        ConcurrentHashMap concurrentHashMap;
        int i12;
        String upperCase;
        ArrayList arrayList3;
        String str;
        boolean z10;
        ArrayList arrayList4 = arrayList;
        a0.h hVar2 = hVar;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("done loading contacts");
        }
        if (i10 == 1 && (arrayList4.isEmpty() || Math.abs((System.currentTimeMillis() / 1000) - getUserConfig().lastContactsSyncTime) >= 86400)) {
            loadContacts(false, getContactsHash(arrayList4));
            if (arrayList4.isEmpty()) {
                AndroidUtilities.runOnUIThread(new f1(this, 2));
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
            TLRPC.TL_contact tL_contact = arrayList4.get(i13);
            if (MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_contact.user_id)) == null && tL_contact.user_id != getUserConfig().getClientUserId()) {
                arrayList4.remove(i13);
                i13--;
                z11 = true;
            }
            i13++;
        }
        if (i10 != 1) {
            getMessagesStorage().putUsersAndChats(arrayList2, null, true, true);
            MessagesStorage messagesStorage = getMessagesStorage();
            if (i10 != 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            messagesStorage.putContacts(arrayList4, z10);
        }
        Collator localeCollator = getLocaleCollator();
        Collections.sort(arrayList4, new k1(hVar2, localeCollator, 1));
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap(20, 1.0f, 2);
        final HashMap hashMap3 = new HashMap();
        final HashMap hashMap4 = new HashMap();
        final ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        if (!this.contactsBookLoaded) {
            hashMap = new HashMap();
            hashMap2 = new HashMap();
        } else {
            hashMap = null;
            hashMap2 = null;
        }
        int i14 = 0;
        while (i14 < arrayList4.size()) {
            TLRPC.TL_contact tL_contact2 = arrayList4.get(i14);
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
                if (hashMap != null && !TextUtils.isEmpty(user.phone)) {
                    hashMap.put(user.phone, tL_contact2);
                    i12 = 0;
                    hashMap2.put(user.phone.substring(Math.max(0, str.length() - 7)), tL_contact2);
                } else {
                    i12 = 0;
                }
                String firstName = UserObject.getFirstName(user);
                if (firstName.length() > 1) {
                    firstName = firstName.substring(i12, 1);
                }
                if (firstName.length() == 0) {
                    upperCase = "#";
                } else {
                    upperCase = firstName.toUpperCase();
                }
                String str2 = this.sectionsToReplace.get(upperCase);
                if (str2 != null) {
                    upperCase = str2;
                }
                ArrayList arrayList8 = (ArrayList) hashMap3.get(upperCase);
                if (arrayList8 == null) {
                    arrayList8 = new ArrayList();
                    hashMap3.put(upperCase, arrayList8);
                    arrayList5.add(upperCase);
                }
                arrayList8.add(tL_contact2);
                if (user.mutual_contact) {
                    ArrayList arrayList9 = (ArrayList) hashMap4.get(upperCase);
                    if (arrayList9 == null) {
                        arrayList9 = new ArrayList();
                        hashMap4.put(upperCase, arrayList9);
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
        Collections.sort(arrayList5, new l1(localeCollator, 3));
        Collections.sort(arrayList10, new l1(localeCollator, 4));
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ContactsController.this.lambda$processLoadedContacts$33(arrayList, concurrentHashMap5, hashMap3, hashMap4, arrayList5, arrayList10, i10, z4, z11);
            }
        });
        if (!this.delayedContactsUpdate.isEmpty() && this.contactsLoaded && this.contactsBookLoaded) {
            applyContactsUpdates(this.delayedContactsUpdate, null, null, null);
            this.delayedContactsUpdate.clear();
        }
        if (hashMap != null) {
            AndroidUtilities.runOnUIThread(new r1(this, hashMap, hashMap2, 0));
        } else {
            this.contactsLoaded = true;
        }
    }

    public void lambda$processLoadedContacts$37(ArrayList arrayList, int i10, ArrayList arrayList2) {
        boolean z4;
        MessagesController messagesController = getMessagesController();
        if (i10 == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        messagesController.putUsers(arrayList, z4);
        a0.h hVar = new a0.h();
        boolean isEmpty = arrayList2.isEmpty();
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
                hVar.k(user, user.f19331id);
            }
        }
        Utilities.stageQueue.postRunnable(new s1(this, i10, arrayList2, arrayList, hVar, isEmpty));
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
        int i10;
        int i11;
        int i12;
        editor.remove("needGetStatuses").commit();
        Vector vector = (Vector) tLObject;
        if (!vector.objects.isEmpty()) {
            ArrayList<TLRPC.User> arrayList = new ArrayList<>();
            ArrayList<T> arrayList2 = vector.objects;
            int size = arrayList2.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList2.get(i13);
                i13++;
                TLRPC.TL_user tL_user = new TLRPC.TL_user();
                TLRPC.TL_contactStatus tL_contactStatus = (TLRPC.TL_contactStatus) obj;
                if (tL_contactStatus != null) {
                    TLRPC.UserStatus userStatus = tL_contactStatus.status;
                    if (userStatus instanceof TLRPC.TL_userStatusRecently) {
                        if (userStatus.by_me) {
                            i12 = -1000;
                        } else {
                            i12 = -100;
                        }
                        userStatus.expires = i12;
                    } else if (userStatus instanceof TLRPC.TL_userStatusLastWeek) {
                        if (userStatus.by_me) {
                            i11 = -1001;
                        } else {
                            i11 = -101;
                        }
                        userStatus.expires = i11;
                    } else if (userStatus instanceof TLRPC.TL_userStatusLastMonth) {
                        if (userStatus.by_me) {
                            i10 = -1002;
                        } else {
                            i10 = -102;
                        }
                        userStatus.expires = i10;
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
            AndroidUtilities.runOnUIThread(new g0(this, editor, (Vector) tLObject, 14));
        }
    }

    public void lambda$syncPhoneBookByAlert$7(HashMap hashMap, boolean z4, boolean z10, boolean z11) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("sync contacts by alert");
        }
        performSyncPhoneBook(hashMap, true, z4, z10, false, false, z11);
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

    public void lambda$performSyncPhoneBook$23(HashMap<String, ArrayList<Object>> hashMap, ArrayList<String> arrayList, HashMap<String, Contact> hashMap2) {
        mergePhonebookAndTelegramContacts(hashMap, arrayList, hashMap2, true);
    }

    private void performWriteContactsToPhoneBook() {
        Utilities.phoneBookQueue.postRunnable(new p1(this, new ArrayList(this.contacts), 1));
    }

    public void lambda$performWriteContactsToPhoneBook$45(java.util.ArrayList<org.telegram.tgnet.TLRPC.TL_contact> r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ContactsController.lambda$performWriteContactsToPhoneBook$45(java.util.ArrayList):void");
    }

    private void reloadContactsStatuses() {
        saveContactsLoadTime();
        getMessagesController().clearFullUsers();
        SharedPreferences.Editor edit = MessagesController.getMainSettings(this.currentAccount).edit();
        edit.putBoolean("needGetStatuses", true).commit();
        getConnectionsManager().sendRequest(new TLRPC.TL_contacts_getStatuses(), new u1(0, this, edit));
    }

    private void saveContactsLoadTime() {
        try {
            MessagesController.getMainSettings(this.currentAccount).edit().putLong("lastReloadStatusTime", System.currentTimeMillis()).commit();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private void updateUnregisteredContacts() {
        HashMap hashMap = new HashMap();
        int size = this.contacts.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.TL_contact tL_contact = this.contacts.get(i10);
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(tL_contact.user_id));
            if (user != null && !TextUtils.isEmpty(user.phone)) {
                hashMap.put(user.phone, tL_contact);
            }
        }
        ArrayList<Contact> arrayList = new ArrayList<>();
        for (Map.Entry<String, Contact> entry : this.contactsBook.entrySet()) {
            Contact value = entry.getValue();
            int i11 = 0;
            while (true) {
                if (i11 < value.phones.size()) {
                    if (!hashMap.containsKey(value.shortPhones.get(i11)) && value.phoneDeleted.get(i11).intValue() != 1) {
                        i11++;
                    }
                } else {
                    arrayList.add(value);
                    break;
                }
            }
        }
        Collections.sort(arrayList, new l1(getLocaleCollator(), 5));
        this.phoneBookContacts = arrayList;
    }

    public void addContact(TLRPC.User user, boolean z4) {
        addContact(user, null, z4);
    }

    public long addContactToPhoneBook(TLRPC.User user, boolean z4) {
        Uri uri;
        long j10 = -1;
        if (this.systemAccount == null || user == null || !hasContactsWritePermission()) {
            return -1L;
        }
        synchronized (this.observerLock) {
            this.ignoreChanges = true;
        }
        ContentResolver contentResolver = ApplicationLoader.applicationContext.getContentResolver();
        if (z4) {
            try {
                Uri build = ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", this.systemAccount.name).appendQueryParameter("account_type", this.systemAccount.type).build();
                contentResolver.delete(build, "sync2 = " + user.f19331id, null);
            } catch (Exception unused) {
            }
        }
        ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
        applyContactToPhoneBook(arrayList, user);
        try {
            ContentProviderResult[] applyBatch = contentResolver.applyBatch("com.android.contacts", arrayList);
            if (applyBatch != null && applyBatch.length > 0 && (uri = applyBatch[0].uri) != null) {
                j10 = Long.parseLong(uri.getLastPathSegment());
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        synchronized (this.observerLock) {
            this.ignoreChanges = false;
        }
        return j10;
    }

    public void checkAppAccount() {
        this.systemAccount = null;
        Utilities.globalQueue.postRunnable(new f1(this, 4));
    }

    public void checkContacts() {
        Utilities.globalQueue.postRunnable(new f1(this, 9));
    }

    public void checkInviteText() {
        SharedPreferences mainSettings = MessagesController.getMainSettings(this.currentAccount);
        this.inviteLink = mainSettings.getString("invitelink", null);
        int i10 = mainSettings.getInt("invitelinktime", 0);
        if (!this.updatingInviteLink) {
            if (this.inviteLink == null || Math.abs((System.currentTimeMillis() / 1000) - i10) >= 86400) {
                this.updatingInviteLink = true;
                getConnectionsManager().sendRequest(new TLRPC.TL_help_getInviteText(), new j1(this, 0), 2);
            }
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
        Utilities.globalQueue.postRunnable(new f1(this, 5));
    }

    public void createOrUpdateConnectionServiceContact(long r28, java.lang.String r30, java.lang.String r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ContactsController.createOrUpdateConnectionServiceContact(long, java.lang.String, java.lang.String):void");
    }

    public void deleteAllContacts(Runnable runnable) {
        resetImportedContacts();
        TLRPC.TL_contacts_deleteContacts tL_contacts_deleteContacts = new TLRPC.TL_contacts_deleteContacts();
        int size = this.contacts.size();
        for (int i10 = 0; i10 < size; i10++) {
            tL_contacts_deleteContacts.f19228id.add(getMessagesController().getInputUser(this.contacts.get(i10).user_id));
        }
        getConnectionsManager().sendRequest(tL_contacts_deleteContacts, new u1(1, this, runnable));
    }

    public void deleteConnectionServiceContact() {
        if (hasContactsPermission()) {
            try {
                ContentResolver contentResolver = ApplicationLoader.applicationContext.getContentResolver();
                Account account = this.systemAccount;
                Cursor query = contentResolver.query(ContactsContract.Groups.CONTENT_URI, new String[]{"_id"}, "title=? AND account_type=? AND account_name=?", new String[]{"TelegramConnectionService", account.type, account.name}, null);
                if (query != null && query.moveToFirst()) {
                    int i10 = query.getInt(0);
                    query.close();
                    Cursor query2 = contentResolver.query(ContactsContract.Data.CONTENT_URI, new String[]{"raw_contact_id"}, "mimetype=? AND data1=?", new String[]{"vnd.android.cursor.item/group_membership", i10 + ""}, null);
                    if (query2 != null && query2.moveToFirst()) {
                        int i11 = query2.getInt(0);
                        query2.close();
                        Uri uri = ContactsContract.RawContacts.CONTENT_URI;
                        contentResolver.delete(uri, "_id=?", new String[]{i11 + ""});
                    } else if (query2 != null) {
                        query2.close();
                    }
                } else if (query != null) {
                    query.close();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public void deleteContact(ArrayList<TLRPC.User> arrayList, boolean z4) {
        if (arrayList != null && !arrayList.isEmpty()) {
            TLRPC.TL_contacts_deleteContacts tL_contacts_deleteContacts = new TLRPC.TL_contacts_deleteContacts();
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.User user = arrayList.get(i10);
                nh.t6 storiesController = getMessagesController().getStoriesController();
                long j10 = user.f19331id;
                int i11 = storiesController.f15917a;
                ArrayList arrayList3 = storiesController.h;
                ArrayList arrayList4 = storiesController.f15921g;
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList4.size()) {
                        break;
                    } else if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList4.get(i12)).peer) == j10) {
                        arrayList4.remove(i12);
                        break;
                    } else {
                        i12++;
                    }
                }
                int i13 = 0;
                while (true) {
                    if (i13 >= arrayList3.size()) {
                        break;
                    } else if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList3.get(i13)).peer) == j10) {
                        arrayList3.remove(i13);
                        break;
                    } else {
                        i13++;
                    }
                }
                nh.g7 g7Var = storiesController.f15924k;
                g7Var.f15366b.getStorageQueue().postRunnable(new gg.y1(g7Var, j10, 8));
                MessagesController.getInstance(i11).checkArchiveFolder();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                TLRPC.InputUser inputUser = getMessagesController().getInputUser(user);
                if (inputUser != null) {
                    user.contact = false;
                    arrayList2.add(Long.valueOf(user.f19331id));
                    tL_contacts_deleteContacts.f19228id.add(inputUser);
                }
            }
            getConnectionsManager().sendRequest(tL_contacts_deleteContacts, new jh.g(this, arrayList2, arrayList, z4, arrayList.get(0).first_name));
        }
    }

    public void deleteContactsUndoable(Context context, org.telegram.ui.ActionBar.p2 p2Var, ArrayList<TLRPC.User> arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            HashMap hashMap = new HashMap();
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.User user = arrayList.get(i10);
                TLRPC.TL_contact tL_contact = this.contactsDict.get(Long.valueOf(user.f19331id));
                user.contact = false;
                this.contacts.remove(tL_contact);
                this.contactsDict.remove(Long.valueOf(user.f19331id));
                hashMap.put(user, tL_contact);
            }
            buildContactsSectionsArrays(false);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsDidLoad, new Object[0]);
            org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(context, p2Var.getResourceProvider());
            acVar.setTimer();
            acVar.f23342b.setText(LocaleController.formatPluralString("ContactsDeletedUndo", hashMap.size(), new Object[0]));
            org.telegram.ui.Components.gc gcVar = new org.telegram.ui.Components.gc(context, p2Var.getResourceProvider(), true, true);
            gcVar.f25097a = new e3(28, this, hashMap);
            gcVar.f25098b = new p1(this, arrayList, 2);
            acVar.setButton(gcVar);
            org.telegram.ui.Components.ic.g(p2Var, acVar, 5000).j();
        }
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
                            String str = account.name;
                            if (str.equals("" + currentUser.f19331id)) {
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void forceImportContacts() {
        Utilities.globalQueue.postRunnable(new f1(this, 7));
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
        if (this.loadingDeleteInfo != 2) {
            return true;
        }
        return false;
    }

    public boolean getLoadingGlobalSettings() {
        if (this.loadingGlobalSettings != 2) {
            return true;
        }
        return false;
    }

    public boolean getLoadingPrivacyInfo(int i10) {
        if (this.loadingPrivacyInfo[i10] != 2) {
            return true;
        }
        return false;
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
        if (this.contactsDict.get(Long.valueOf(j10)) != null) {
            return true;
        }
        return false;
    }

    public boolean isLoadingContacts() {
        boolean z4;
        synchronized (this.loadContactsSync) {
            z4 = this.loadingContacts;
        }
        return z4;
    }

    public void loadContacts(boolean z4, long j10) {
        synchronized (this.loadContactsSync) {
            this.loadingContacts = true;
        }
        if (z4) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("load contacts from cache");
            }
            getMessagesStorage().getContacts();
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("load contacts from server");
        }
        TLRPC.TL_contacts_getContacts tL_contacts_getContacts = new TLRPC.TL_contacts_getContacts();
        tL_contacts_getContacts.hash = j10;
        getConnectionsManager().sendRequest(tL_contacts_getContacts, new nh.t5(this, j10, 1));
    }

    public void loadGlobalPrivacySetting() {
        if (this.loadingGlobalSettings == 0) {
            this.loadingGlobalSettings = 1;
            getConnectionsManager().sendRequest(new TL_account.getGlobalPrivacySettings(), new j1(this, 1));
        }
    }

    public void loadPrivacySettings() {
        loadPrivacySettings(false);
    }

    public void markAsContacted(String str) {
        if (str == null) {
            return;
        }
        Utilities.phoneBookQueue.postRunnable(new v1(str, 0));
    }

    public void migratePhoneBookToV7(SparseArray<Contact> sparseArray) {
        Utilities.globalQueue.postRunnable(new e3(27, this, sparseArray));
    }

    public void performSyncPhoneBook(final HashMap<String, Contact> hashMap, final boolean z4, final boolean z10, final boolean z11, final boolean z12, final boolean z13, final boolean z14) {
        if (!z10 && !this.contactsBookLoaded) {
            return;
        }
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                ContactsController.this.lambda$performSyncPhoneBook$25(hashMap, z11, z4, z10, z12, z13, z14);
            }
        });
    }

    public void processContactsUpdates(ArrayList<Long> arrayList, ConcurrentHashMap<Long, TLRPC.User> concurrentHashMap) {
        int indexOf;
        int indexOf2;
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
                if (!this.delayedContactsUpdate.isEmpty() && (indexOf = this.delayedContactsUpdate.indexOf(Long.valueOf(-l11.longValue()))) != -1) {
                    this.delayedContactsUpdate.remove(indexOf);
                }
            } else if (l11.longValue() < 0) {
                arrayList3.add(Long.valueOf(-l11.longValue()));
                if (!this.delayedContactsUpdate.isEmpty() && (indexOf2 = this.delayedContactsUpdate.indexOf(Long.valueOf(-l11.longValue()))) != -1) {
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
        AndroidUtilities.runOnUIThread(new i0(this, arrayList2, i10, arrayList, 3));
    }

    public void readContacts() {
        synchronized (this.loadContactsSync) {
            try {
                if (this.loadingContacts) {
                    return;
                }
                this.loadingContacts = true;
                Utilities.stageQueue.postRunnable(new f1(this, 8));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public java.util.HashMap<java.lang.String, org.telegram.messenger.ContactsController.Contact> readContactsFromPhoneBook() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ContactsController.readContactsFromPhoneBook():java.util.HashMap");
    }

    public void reloadContactsStatusesMaybe(boolean z4) {
        try {
            if (MessagesController.getMainSettings(this.currentAccount).getLong("lastReloadStatusTime", 0L) >= System.currentTimeMillis() - 10800000 && !z4) {
                return;
            }
            reloadContactsStatuses();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void resetImportedContacts() {
        getConnectionsManager().sendRequest(new TLRPC.TL_contacts_resetSaved(), new f5(2));
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

    public void syncPhoneBookByAlert(HashMap<String, Contact> hashMap, boolean z4, boolean z10, boolean z11) {
        Utilities.globalQueue.postRunnable(new n1(this, hashMap, z4, z10, z11));
    }

    private void mergePhonebookAndTelegramContacts(HashMap<String, ArrayList<Object>> hashMap, ArrayList<String> arrayList, HashMap<String, Contact> hashMap2, boolean z4) {
        Utilities.globalQueue.postRunnable(new j3.n1(this, z4, new ArrayList(this.contacts), hashMap2, hashMap, arrayList));
    }

    public void addContact(TLRPC.User user, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z4) {
        if (user == null) {
            return;
        }
        TLRPC.TL_contacts_addContact tL_contacts_addContact = new TLRPC.TL_contacts_addContact();
        tL_contacts_addContact.f19226id = getMessagesController().getInputUser(user);
        tL_contacts_addContact.first_name = user.first_name;
        tL_contacts_addContact.last_name = user.last_name;
        String str = user.phone;
        tL_contacts_addContact.phone = str;
        tL_contacts_addContact.add_phone_privacy_exception = z4;
        if (str == null) {
            tL_contacts_addContact.phone = "";
        } else if (str.length() > 0 && !tL_contacts_addContact.phone.startsWith("+")) {
            tL_contacts_addContact.phone = "+" + tL_contacts_addContact.phone;
        }
        if (tL_textWithEntities != null) {
            tL_contacts_addContact.flags |= 2;
            tL_contacts_addContact.note = tL_textWithEntities;
        }
        getConnectionsManager().sendRequest(tL_contacts_addContact, new u1(2, this, user), 6);
    }

    public void loadPrivacySettings(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ContactsController.loadPrivacySettings(boolean):void");
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
                if (i10 > 0 && str.length() > i10 + 2) {
                    return str.substring(0, i10) + "…";
                }
                sb.append(str);
                if (str2 != null && str2.length() > 0) {
                    sb.append(" ");
                    if (i10 > 0) {
                        if (str2.length() + sb.length() > i10) {
                            sb.append(str2.charAt(0));
                        }
                    }
                    sb.append(str2);
                }
            } else if (str2 != null && str2.length() > 0) {
                if (i10 > 0 && str2.length() > i10 + 2) {
                    return str2.substring(0, i10) + "…";
                }
                sb.append(str2);
            }
        } else if (str2 != null && str2.length() > 0) {
            if (i10 > 0 && str2.length() > i10 + 2) {
                return str2.substring(0, i10) + "…";
            }
            sb.append(str2);
            if (str != null && str.length() > 0) {
                sb.append(" ");
                if (i10 > 0) {
                    if (str.length() + sb.length() > i10) {
                        sb.append(str.charAt(0));
                    }
                }
                sb.append(str);
            }
        } else if (str != null && str.length() > 0) {
            if (i10 > 0 && str.length() > i10 + 2) {
                return str.substring(0, i10) + "…";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static void lambda$resetImportedContacts$10(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
