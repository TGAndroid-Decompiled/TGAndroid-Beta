package defpackage;

import android.accounts.Account;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
public final class lv2 extends rf0 {
    public static Locale o0;
    public static Collator p0;
    public static final String[] q0 = {"lookup", "data1", "data2", "data3", "display_name", "account_type"};
    public static final String[] r0 = {"lookup", "data2", "data3", "data5"};
    public static volatile lv2[] s0 = new lv2[4];
    public boolean E;
    public final HashMap F;
    public byte G;
    public byte H;
    public int I;
    public final int[] J;
    public ArrayList K;
    public ArrayList L;
    public ArrayList M;
    public ArrayList N;
    public ArrayList O;
    public ArrayList P;
    public ArrayList Q;
    public ArrayList R;
    public ArrayList S;
    public ArrayList T;
    public ArrayList U;
    public ArrayList V;
    public ArrayList W;
    public ArrayList X;
    public TLRPC.GlobalPrivacySettings Y;
    public HashMap Z;
    public Account a;
    public HashMap a0;
    public boolean b;
    public ArrayList b0;
    public final Object c;
    public HashMap c0;
    public boolean d;
    public ArrayList d0;
    public boolean e;
    public HashMap e0;
    public final Object f;
    public ArrayList f0;
    public ConcurrentHashMap g0;
    public boolean h;
    public HashMap h0;
    public ArrayList i0;
    public HashMap j0;
    public ArrayList k0;
    public HashMap l0;
    public HashMap m0;
    public boolean n;
    public int n0;
    public boolean r;
    public boolean s;
    public String w;
    public final ArrayList x;
    public String y;

    public lv2(int i) {
        super(i);
        this.c = new Object();
        this.f = new Object();
        this.w = "";
        this.x = new ArrayList();
        HashMap hashMap = new HashMap();
        this.F = hashMap;
        this.J = new int[15];
        this.Z = new HashMap();
        this.a0 = new HashMap();
        this.b0 = new ArrayList();
        this.c0 = new HashMap();
        this.d0 = new ArrayList();
        this.e0 = new HashMap();
        this.f0 = new ArrayList();
        this.g0 = new ConcurrentHashMap(20, 1.0f, 2);
        this.h0 = new HashMap();
        this.i0 = new ArrayList();
        this.j0 = new HashMap();
        this.k0 = new ArrayList();
        this.l0 = new HashMap();
        this.m0 = new HashMap();
        if (uc7.s1(this.currentAccount).Y3.getBoolean("needGetStatuses", false)) {
            I();
        }
        hashMap.put("À", "A");
        hashMap.put("Á", "A");
        hashMap.put("Ä", "A");
        hashMap.put("Ù", "U");
        hashMap.put("Ú", "U");
        hashMap.put("Ü", "U");
        hashMap.put("Ì", "I");
        hashMap.put("Í", "I");
        hashMap.put("Ï", "I");
        hashMap.put("È", "E");
        hashMap.put("É", "E");
        hashMap.put("Ê", "E");
        hashMap.put("Ë", "E");
        hashMap.put("Ò", "O");
        hashMap.put("Ó", "O");
        hashMap.put("Ö", "O");
        hashMap.put("Ç", "C");
        hashMap.put("Ñ", "N");
        hashMap.put("Ÿ", "Y");
        hashMap.put("Ý", "Y");
        hashMap.put("Ţ", "Y");
        if (i == 0) {
            Utilities.e.c(new pu2(this, (byte) 6));
        }
    }

    public static String m(int i, String str, String str2) {
        int i2;
        int i3;
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
        if (str != null) {
            i2 = str.length();
        } else {
            i2 = 0;
        }
        if (str2 != null) {
            i3 = str2.length();
        } else {
            i3 = 0;
        }
        StringBuilder sb = new StringBuilder(i2 + i3 + 1);
        if (ob6.b0 == 1) {
            if (str != null && str.length() > 0) {
                if (i > 0 && str.length() > i + 2) {
                    return str.substring(0, i).concat("…");
                }
                sb.append(str);
                if (str2 != null && str2.length() > 0) {
                    sb.append(" ");
                    if (i > 0) {
                        if (str2.length() + sb.length() > i) {
                            sb.append(str2.charAt(0));
                        }
                    }
                    sb.append(str2);
                }
            } else if (str2 != null && str2.length() > 0) {
                if (i > 0 && str2.length() > i + 2) {
                    return str2.substring(0, i).concat("…");
                }
                sb.append(str2);
            }
        } else if (str2 != null && str2.length() > 0) {
            if (i > 0 && str2.length() > i + 2) {
                return str2.substring(0, i).concat("…");
            }
            sb.append(str2);
            if (str != null && str.length() > 0) {
                sb.append(" ");
                if (i > 0) {
                    if (str.length() + sb.length() > i) {
                        sb.append(str.charAt(0));
                    }
                }
                sb.append(str);
            }
        } else if (str != null && str.length() > 0) {
            if (i > 0 && str.length() > i + 2) {
                return str.substring(0, i).concat("…");
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static String n(String str, String str2) {
        return m(0, str, str2);
    }

    public static String o(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return p((TLRPC.User) tLObject);
        }
        if (tLObject instanceof TLRPC.Chat) {
            return ((TLRPC.Chat) tLObject).title;
        }
        return ob6.M0(2131749082, null);
    }

    public static String p(TLRPC.User user) {
        if (user == null) {
            return "";
        }
        return m(0, user.first_name, user.last_name);
    }

    public static HashMap q(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            iv2 iv2Var = new iv2();
            iv2 iv2Var2 = (iv2) entry.getValue();
            iv2Var.h.addAll(iv2Var2.h);
            iv2Var.e.addAll(iv2Var2.e);
            iv2Var.f.addAll(iv2Var2.f);
            iv2Var.g.addAll(iv2Var2.g);
            iv2Var.i = iv2Var2.i;
            iv2Var.j = iv2Var2.j;
            iv2Var.a = iv2Var2.a;
            String str = iv2Var2.b;
            iv2Var.b = str;
            hashMap2.put(str, iv2Var);
        }
        return hashMap2;
    }

    public static lv2 r(int i) {
        lv2 lv2Var;
        lv2 lv2Var2 = s0[i];
        if (lv2Var2 == null) {
            synchronized (lv2.class) {
                lv2Var = s0[i];
                if (lv2Var == null) {
                    lv2[] lv2VarArr = s0;
                    lv2 lv2Var3 = new lv2(i);
                    lv2VarArr[i] = lv2Var3;
                    lv2Var = lv2Var3;
                }
            }
            return lv2Var;
        }
        return lv2Var2;
    }

    public static Collator u() {
        if (p0 == null || o0 != Locale.getDefault()) {
            try {
                Locale locale = Locale.getDefault();
                o0 = locale;
                Collator collator = Collator.getInstance(locale);
                p0 = collator;
                collator.setStrength(1);
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        if (p0 == null) {
            try {
                Collator collator2 = Collator.getInstance();
                p0 = collator2;
                collator2.setStrength(1);
            } catch (Exception e2) {
                cc4.g(e2, true);
            }
        }
        if (p0 == null) {
            p0 = new hv2();
        }
        return p0;
    }

    public static boolean w() {
        if (a.b.checkSelfPermission("android.permission.READ_CONTACTS") == 0) {
            return true;
        }
        return false;
    }

    public static boolean z(String str) {
        if (!TextUtils.isEmpty(str)) {
            int length = str.length();
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                if (charAt >= '0' && charAt <= '9') {
                    i++;
                }
            }
            if (i <= 3) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void A(long j, boolean z) {
        synchronized (this.c) {
            this.b = true;
        }
        if (z) {
            if (f11.a) {
                cc4.b("load contacts from cache");
            }
            kf7 messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new hd7(messagesStorage, (byte) 18));
            return;
        }
        if (f11.a) {
            cc4.b("load contacts from server");
        }
        TLRPC.TL_contacts_getContacts tL_contacts_getContacts = new TLRPC.TL_contacts_getContacts();
        tL_contacts_getContacts.hash = j;
        getConnectionsManager().sendRequest(tL_contacts_getContacts, new yu2(this, j, (byte) 0));
    }

    public final void B() {
        if (this.G == 0) {
            this.G = (byte) 1;
            getConnectionsManager().sendRequest(new TL_account.getGlobalPrivacySettings(), new ou2(this, (byte) 0));
        }
    }

    public final void C() {
        D(false);
    }

    public final void D(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lv2.D(boolean):void");
    }

    public final void E(HashMap hashMap, ArrayList arrayList, HashMap hashMap2, boolean z) {
        Utilities.e.c(new y6a(this, z, new ArrayList(this.f0), hashMap2, hashMap, arrayList));
    }

    public final void F(final HashMap hashMap, final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final boolean z6) {
        if (!z2 && !this.r) {
            return;
        }
        Utilities.e.c(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: defpackage.gv2.run():void");
            }
        });
    }

    public final void G(ArrayList arrayList, ConcurrentHashMap concurrentHashMap) {
        ArrayList arrayList2;
        int indexOf;
        int indexOf2;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (true) {
            arrayList2 = this.x;
            if (i >= size) {
                break;
            }
            Object obj = arrayList.get(i);
            i++;
            Long l = (Long) obj;
            if (l.longValue() > 0) {
                TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                tL_contact.user_id = l.longValue();
                arrayList3.add(tL_contact);
                if (!arrayList2.isEmpty() && (indexOf = arrayList2.indexOf(Long.valueOf(-l.longValue()))) != -1) {
                    arrayList2.remove(indexOf);
                }
            } else if (l.longValue() < 0) {
                arrayList4.add(Long.valueOf(-l.longValue()));
                if (!arrayList2.isEmpty() && (indexOf2 = arrayList2.indexOf(Long.valueOf(-l.longValue()))) != -1) {
                    arrayList2.remove(indexOf2);
                }
            }
        }
        if (!arrayList4.isEmpty()) {
            kf7 messagesStorage = getMessagesStorage();
            messagesStorage.getClass();
            if (!arrayList4.isEmpty()) {
                messagesStorage.a.c(new q41(messagesStorage, arrayList4, (byte) 18));
            }
        }
        if (!arrayList3.isEmpty()) {
            getMessagesStorage().d1(arrayList3, false);
        }
        if (this.h && this.r) {
            c(arrayList, concurrentHashMap, arrayList3, arrayList4);
            return;
        }
        arrayList2.addAll(arrayList);
        if (f11.a) {
            cc4.b("delay update - contacts add = " + arrayList3.size() + " delete = " + arrayList4.size());
        }
    }

    public final java.util.HashMap H() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lv2.H():java.util.HashMap");
    }

    public final void I() {
        L();
        uc7 messagesController = getMessagesController();
        messagesController.i1.clear();
        messagesController.p1.clear();
        SharedPreferences.Editor edit = uc7.s1(this.currentAccount).Y3.edit();
        edit.putBoolean("needGetStatuses", true).commit();
        getConnectionsManager().sendRequest(new TLRPC.TL_contacts_getStatuses(), new ql(this, edit, (byte) 28));
    }

    public final void J(boolean z) {
        try {
            if (uc7.s1(this.currentAccount).Y3.getLong("lastReloadStatusTime", 0L) >= System.currentTimeMillis() - 10800000 && !z) {
                return;
            }
            I();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void K() {
        getConnectionsManager().sendRequest(new TLRPC.TL_contacts_resetSaved(), new xe2((byte) 0));
    }

    public final void L() {
        try {
            uc7.s1(this.currentAccount).Y3.edit().putLong("lastReloadStatusTime", System.currentTimeMillis()).commit();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void M(int i, ArrayList arrayList) {
        switch (i) {
            case 0:
                this.K = arrayList;
                break;
            case 1:
                this.L = arrayList;
                break;
            case 2:
                this.M = arrayList;
                break;
            case 3:
                this.N = arrayList;
                break;
            case 4:
                this.O = arrayList;
                break;
            case 5:
                this.R = arrayList;
                break;
            case 6:
                this.S = arrayList;
                break;
            case 7:
                this.T = arrayList;
                break;
            case 8:
                this.U = arrayList;
                break;
            case 9:
                this.P = arrayList;
                break;
            case 11:
                this.V = arrayList;
                break;
            case 12:
                this.W = arrayList;
                break;
            case 13:
                this.X = arrayList;
                break;
            case 14:
                this.Q = arrayList;
                break;
        }
        getNotificationCenter().k(jn7.k0, new Object[0]);
        I();
    }

    public final void N() {
        HashMap hashMap = new HashMap();
        int size = this.f0.size();
        for (int i = 0; i < size; i++) {
            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) this.f0.get(i);
            TLRPC.User X1 = getMessagesController().X1(Long.valueOf(tL_contact.user_id));
            if (X1 != null && !TextUtils.isEmpty(X1.phone)) {
                hashMap.put(X1.phone, tL_contact);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.Z.entrySet()) {
            iv2 iv2Var = (iv2) entry.getValue();
            int i2 = 0;
            while (true) {
                if (i2 < iv2Var.e.size()) {
                    if (!hashMap.containsKey((String) iv2Var.g.get(i2)) && ((Integer) iv2Var.h.get(i2)).intValue() != 1) {
                        i2++;
                    }
                } else {
                    arrayList.add(iv2Var);
                    break;
                }
            }
        }
        Collections.sort(arrayList, new kn0(u(), (byte) 2));
        this.b0 = arrayList;
    }

    public final void a(TLRPC.User user) {
        Uri uri;
        if (this.a != null && a.b.checkSelfPermission("android.permission.WRITE_CONTACTS") == 0) {
            synchronized (this.f) {
                this.d = true;
            }
            ContentResolver contentResolver = a.b.getContentResolver();
            try {
                Uri build = ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", this.a.name).appendQueryParameter("account_type", this.a.type).build();
                contentResolver.delete(build, "sync2 = " + user.id, null);
            } catch (Exception unused) {
            }
            ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
            b(arrayList, user);
            try {
                ContentProviderResult[] applyBatch = contentResolver.applyBatch("com.android.contacts", arrayList);
                if (applyBatch != null && applyBatch.length > 0 && (uri = applyBatch[0].uri) != null) {
                    Long.parseLong(uri.getLastPathSegment());
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
            synchronized (this.f) {
                this.d = false;
            }
        }
    }

    public final void b(ArrayList arrayList, TLRPC.User user) {
        String str;
        String str2;
        if (user == null) {
            return;
        }
        int size = arrayList.size();
        ContentProviderOperation.Builder newInsert = ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI);
        newInsert.withValue("account_name", this.a.name);
        newInsert.withValue("account_type", this.a.type);
        if (TextUtils.isEmpty(user.phone)) {
            str = "";
        } else {
            str = user.phone;
        }
        newInsert.withValue("sync1", str);
        newInsert.withValue("sync2", Long.valueOf(user.id));
        arrayList.add(newInsert.build());
        Uri uri = ContactsContract.Data.CONTENT_URI;
        ContentProviderOperation.Builder newInsert2 = ContentProviderOperation.newInsert(uri);
        newInsert2.withValueBackReference("raw_contact_id", size);
        newInsert2.withValue("mimetype", "vnd.android.cursor.item/name");
        newInsert2.withValue("data2", user.first_name);
        newInsert2.withValue("data3", user.last_name);
        arrayList.add(newInsert2.build());
        if (TextUtils.isEmpty(user.phone)) {
            str2 = m(0, user.first_name, user.last_name);
        } else {
            str2 = "+" + user.phone;
        }
        ContentProviderOperation.Builder newInsert3 = ContentProviderOperation.newInsert(uri);
        newInsert3.withValueBackReference("raw_contact_id", size);
        newInsert3.withValue("mimetype", "vnd.android.cursor.item/vnd.org.telegram.messenger.android.profile");
        newInsert3.withValue("data1", Long.valueOf(user.id));
        newInsert3.withValue("data2", "Telegram Profile");
        newInsert3.withValue("data3", ob6.a0("ContactShortcutMessage", null, 2131751751, str2));
        newInsert3.withValue("data4", Long.valueOf(user.id));
        arrayList.add(newInsert3.build());
        ContentProviderOperation.Builder newInsert4 = ContentProviderOperation.newInsert(uri);
        newInsert4.withValueBackReference("raw_contact_id", size);
        newInsert4.withValue("mimetype", "vnd.android.cursor.item/vnd.org.telegram.messenger.android.call");
        String str3 = str2;
        newInsert4.withValue("data1", Long.valueOf(user.id));
        newInsert4.withValue("data2", "Telegram Voice Call");
        newInsert4.withValue("data3", ob6.a0("ContactShortcutVoiceCall", null, 2131751749, str3));
        newInsert4.withValue("data4", Long.valueOf(user.id));
        arrayList.add(newInsert4.build());
        ContentProviderOperation.Builder newInsert5 = ContentProviderOperation.newInsert(uri);
        newInsert5.withValueBackReference("raw_contact_id", size);
        newInsert5.withValue("mimetype", "vnd.android.cursor.item/vnd.org.telegram.messenger.android.call.video");
        newInsert5.withValue("data1", Long.valueOf(user.id));
        newInsert5.withValue("data2", "Telegram Video Call");
        newInsert5.withValue("data3", ob6.a0("ContactShortcutVideoCall", null, 2131751750, str3));
        newInsert5.withValue("data4", Long.valueOf(user.id));
        arrayList.add(newInsert5.build());
    }

    public final void c(ArrayList arrayList, ConcurrentHashMap concurrentHashMap, ArrayList arrayList2, ArrayList arrayList3) {
        ArrayList arrayList4;
        ArrayList arrayList5;
        TLRPC.User user;
        int indexOf;
        TLRPC.User user2;
        int indexOf2;
        if (arrayList2 != null && arrayList3 != null) {
            arrayList4 = arrayList2;
            arrayList5 = arrayList3;
        } else {
            arrayList4 = new ArrayList();
            arrayList5 = new ArrayList();
            for (int i = 0; i < arrayList.size(); i++) {
                Long l = (Long) arrayList.get(i);
                if (l.longValue() > 0) {
                    TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                    tL_contact.user_id = l.longValue();
                    arrayList4.add(tL_contact);
                } else if (l.longValue() < 0) {
                    arrayList5.add(Long.valueOf(-l.longValue()));
                }
            }
        }
        if (f11.a) {
            cc4.b("process update - contacts add = " + arrayList4.size() + " delete = " + arrayList5.size());
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        for (int i2 = 0; i2 < arrayList4.size(); i2++) {
            TLRPC.TL_contact tL_contact2 = (TLRPC.TL_contact) arrayList4.get(i2);
            if (concurrentHashMap != null) {
                user2 = (TLRPC.User) concurrentHashMap.get(Long.valueOf(tL_contact2.user_id));
            } else {
                user2 = null;
            }
            if (user2 == null) {
                user2 = getMessagesController().X1(Long.valueOf(tL_contact2.user_id));
            } else {
                getMessagesController().i4(user2, true, false);
            }
            if (user2 != null && !TextUtils.isEmpty(user2.phone)) {
                iv2 iv2Var = (iv2) this.a0.get(user2.phone);
                if (iv2Var != null && (indexOf2 = iv2Var.g.indexOf(user2.phone)) != -1) {
                    iv2Var.h.set(indexOf2, 0);
                }
                if (sb.length() != 0) {
                    sb.append(",");
                }
                sb.append(user2.phone);
            } else {
                z = true;
            }
        }
        for (int i3 = 0; i3 < arrayList5.size(); i3++) {
            Long l2 = (Long) arrayList5.get(i3);
            Utilities.h.c(new ea2(this, l2, (byte) 27));
            if (concurrentHashMap != null) {
                user = (TLRPC.User) concurrentHashMap.get(l2);
            } else {
                user = null;
            }
            if (user == null) {
                user = getMessagesController().X1(l2);
            } else {
                getMessagesController().i4(user, true, false);
            }
            if (user == null) {
                z = true;
            } else if (!TextUtils.isEmpty(user.phone)) {
                iv2 iv2Var2 = (iv2) this.a0.get(user.phone);
                if (iv2Var2 != null && (indexOf = iv2Var2.g.indexOf(user.phone)) != -1) {
                    iv2Var2.h.set(indexOf, 1);
                }
                if (sb2.length() != 0) {
                    sb2.append(",");
                }
                sb2.append(user.phone);
            }
        }
        if (sb.length() != 0 || sb2.length() != 0) {
            getMessagesStorage().e(sb.toString(), sb2.toString());
        }
        if (z) {
            Utilities.d.c(new pu2(this, (byte) 2));
        } else {
            hl.c3(new on1(this, arrayList4, arrayList5, (byte) 29));
        }
    }

    public final void d(boolean z) {
        String upperCase;
        Collator u = u();
        if (z) {
            Collections.sort(this.f0, new wu2(this, u, (byte) 0));
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f0.size(); i++) {
            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) this.f0.get(i);
            TLRPC.User X1 = getMessagesController().X1(Long.valueOf(tL_contact.user_id));
            if (X1 != null) {
                String k = lbc.k(X1, true);
                if (k.length() > 1) {
                    k = k.substring(0, 1);
                }
                if (k.length() == 0) {
                    upperCase = "#";
                } else {
                    upperCase = k.toUpperCase();
                }
                String str = (String) this.F.get(upperCase);
                if (str != null) {
                    upperCase = str;
                }
                ArrayList arrayList2 = (ArrayList) hashMap.get(upperCase);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    hashMap.put(upperCase, arrayList2);
                    arrayList.add(upperCase);
                }
                arrayList2.add(tL_contact);
            }
        }
        Collections.sort(arrayList, new kn0(u, (byte) 1));
        this.h0 = hashMap;
        this.i0 = arrayList;
    }

    public final boolean e() {
        boolean z = false;
        try {
        } catch (Exception e) {
            cc4.g(e, true);
        }
        if (!w()) {
            return false;
        }
        try {
            Cursor query = a.b.getContentResolver().query(ContactsContract.RawContacts.CONTENT_URI, new String[]{"version"}, null, null, null);
            if (query != null) {
                StringBuilder sb = new StringBuilder();
                while (query.moveToNext()) {
                    sb.append(query.getString(query.getColumnIndex("version")));
                }
                String sb2 = sb.toString();
                if (this.w.length() != 0 && !this.w.equals(sb2)) {
                    z = true;
                }
                this.w = sb2;
            }
            if (query != null) {
                query.close();
            }
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
        return z;
    }

    public final void f() {
        SharedPreferences sharedPreferences = uc7.s1(this.currentAccount).Y3;
        this.y = sharedPreferences.getString("invitelink", null);
        int i = sharedPreferences.getInt("invitelinktime", 0);
        if (!this.E) {
            if (this.y == null || Math.abs((System.currentTimeMillis() / 1000) - i) >= 86400) {
                this.E = true;
                getConnectionsManager().sendRequest(new TLRPC.TL_help_getInviteText(), new ou2(this, (byte) 1), 2);
            }
        }
    }

    public final void g(long j, String str, String str2) {
        Cursor cursor;
        int parseInt;
        Cursor cursor2;
        if (!w()) {
            return;
        }
        try {
            ContentResolver contentResolver = a.b.getContentResolver();
            ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
            Uri build = ContactsContract.Groups.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").build();
            Uri build2 = ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").build();
            Account account = this.a;
            Cursor query = contentResolver.query(build, new String[]{"_id"}, "title=? AND account_type=? AND account_name=?", new String[]{"TelegramConnectionService", account.type, account.name}, null);
            if (query != null && query.moveToFirst()) {
                parseInt = query.getInt(0);
                cursor = query;
            } else {
                ContentValues contentValues = new ContentValues();
                cursor = query;
                contentValues.put("account_type", this.a.type);
                contentValues.put("account_name", this.a.name);
                contentValues.put("group_visible", (Integer) 0);
                contentValues.put("group_is_read_only", (Integer) 1);
                contentValues.put("title", "TelegramConnectionService");
                parseInt = Integer.parseInt(contentResolver.insert(build, contentValues).getLastPathSegment());
            }
            if (cursor != null) {
                cursor.close();
            }
            Uri uri = ContactsContract.Data.CONTENT_URI;
            Cursor query2 = contentResolver.query(uri, new String[]{"raw_contact_id"}, "mimetype=? AND data1=?", new String[]{"vnd.android.cursor.item/group_membership", parseInt + ""}, null);
            int size = arrayList.size();
            int i = parseInt;
            if (query2 != null && query2.moveToFirst()) {
                int i2 = query2.getInt(0);
                ContentProviderOperation.Builder newUpdate = ContentProviderOperation.newUpdate(build2);
                cursor2 = query2;
                arrayList.add(newUpdate.withSelection("_id=?", new String[]{i2 + ""}).withValue("deleted", 0).build());
                ContentProviderOperation.Builder newUpdate2 = ContentProviderOperation.newUpdate(uri);
                ContentProviderOperation.Builder withSelection = newUpdate2.withSelection("raw_contact_id=? AND mimetype=?", new String[]{i2 + "", "vnd.android.cursor.item/phone_v2"});
                StringBuilder sb = new StringBuilder("+99084");
                sb.append(j);
                arrayList.add(withSelection.withValue("data1", sb.toString()).build());
                ContentProviderOperation.Builder newUpdate3 = ContentProviderOperation.newUpdate(uri);
                arrayList.add(newUpdate3.withSelection("raw_contact_id=? AND mimetype=?", new String[]{i2 + "", "vnd.android.cursor.item/name"}).withValue("data2", str).withValue("data3", str2).build());
            } else {
                cursor2 = query2;
                arrayList.add(ContentProviderOperation.newInsert(build2).withValue("account_type", this.a.type).withValue("account_name", this.a.name).withValue("raw_contact_is_read_only", 1).withValue("aggregation_mode", 3).build());
                arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/name").withValue("data2", str).withValue("data3", str2).build());
                ContentProviderOperation.Builder withValue = ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/phone_v2");
                arrayList.add(withValue.withValue("data1", "+99084" + j).build());
                arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/group_membership").withValue("data1", Integer.valueOf(i)).build());
            }
            if (cursor2 != null) {
                cursor2.close();
            }
            contentResolver.applyBatch("com.android.contacts", arrayList);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void h() {
        if (w()) {
            try {
                ContentResolver contentResolver = a.b.getContentResolver();
                Account account = this.a;
                Cursor query = contentResolver.query(ContactsContract.Groups.CONTENT_URI, new String[]{"_id"}, "title=? AND account_type=? AND account_name=?", new String[]{"TelegramConnectionService", account.type, account.name}, null);
                if (query != null) {
                    if (query.moveToFirst()) {
                        int i = query.getInt(0);
                        query.close();
                        Cursor query2 = contentResolver.query(ContactsContract.Data.CONTENT_URI, new String[]{"raw_contact_id"}, "mimetype=? AND data1=?", new String[]{"vnd.android.cursor.item/group_membership", i + ""}, null);
                        if (query2 != null) {
                            if (query2.moveToFirst()) {
                                int i2 = query2.getInt(0);
                                query2.close();
                                Uri uri = ContactsContract.RawContacts.CONTENT_URI;
                                contentResolver.delete(uri, "_id=?", new String[]{i2 + ""});
                                return;
                            }
                            query2.close();
                            return;
                        }
                        return;
                    }
                    query.close();
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    public final void i(ArrayList arrayList, boolean z) {
        if (arrayList.isEmpty()) {
            return;
        }
        TLRPC.TL_contacts_deleteContacts tL_contacts_deleteContacts = new TLRPC.TL_contacts_deleteContacts();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            TLRPC.User user = (TLRPC.User) arrayList.get(i);
            c6b O1 = getMessagesController().O1();
            long j = user.id;
            int i2 = O1.a;
            ArrayList arrayList3 = O1.h;
            ArrayList arrayList4 = O1.g;
            int i3 = 0;
            while (true) {
                if (i3 >= arrayList4.size()) {
                    break;
                } else if (wf3.n(((TL_stories.PeerStories) arrayList4.get(i3)).peer) == j) {
                    arrayList4.remove(i3);
                    break;
                } else {
                    i3++;
                }
            }
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList3.size()) {
                    break;
                } else if (wf3.n(((TL_stories.PeerStories) arrayList3.get(i4)).peer) == j) {
                    arrayList3.remove(i4);
                    break;
                } else {
                    i4++;
                }
            }
            o6b o6bVar = O1.k;
            o6bVar.b.a.c(new pqa(o6bVar, j, (byte) 4));
            uc7.s1(i2).B();
            jn7.f(i2).k(jn7.y5, new Object[0]);
            TLRPC.InputUser q1 = getMessagesController().q1(user);
            user.contact = false;
            arrayList2.add(Long.valueOf(user.id));
            tL_contacts_deleteContacts.id.add(q1);
        }
        getConnectionsManager().sendRequest(tL_contacts_deleteContacts, new gg2(this, arrayList2, arrayList, z, ((TLRPC.User) arrayList.get(0)).first_name));
    }

    public final void j(long j) {
        if (w()) {
            synchronized (this.f) {
                this.d = true;
            }
            try {
                ContentResolver contentResolver = a.b.getContentResolver();
                Uri build = ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", this.a.name).appendQueryParameter("account_type", this.a.type).build();
                contentResolver.delete(build, "sync2 = " + j, null);
            } catch (Exception e) {
                cc4.g(e, false);
            }
            synchronized (this.f) {
                this.d = false;
            }
        }
    }

    public final void k(ContentResolver contentResolver, Account account, ArrayList arrayList, zh6 zh6Var, zh6 zh6Var2) {
        synchronized (this.f) {
            this.d = true;
        }
        try {
            Uri build = ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").build();
            if (arrayList.size() > (zh6Var.m() << 1) + 500) {
                contentResolver.delete(build, "account_type=? AND account_name=? AND sync2 IS NOT NULL", new String[]{account.type, account.name});
                for (int i = 0; i < zh6Var.m(); i++) {
                    long j = zh6Var.j(i);
                    if (((Long) zh6Var.n(i)).equals(zh6Var2.f(j))) {
                        zh6Var2.l(j);
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder();
                int i2 = 0;
                while (i2 < arrayList.size()) {
                    if (sb.length() != 0) {
                        sb.append(',');
                    }
                    sb.append(arrayList.get(i2));
                    int i3 = i2 + 1;
                    if (i3 % 500 == 0 || i2 == arrayList.size() - 1) {
                        contentResolver.delete(build, "_id IN (" + ((Object) sb) + ")", null);
                        sb.setLength(0);
                    }
                    i2 = i3;
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        synchronized (this.f) {
            this.d = false;
        }
    }

    public final void l() {
        Utilities.e.c(new pu2(this, (byte) 1));
    }

    public final String s(int i) {
        String str = this.y;
        if (str == null) {
            str = "https://telegram.org/dl";
        }
        if (i <= 1) {
            return ob6.a0(null, null, 2131748870, str);
        }
        try {
            return String.format(ob6.J0(i, "InviteTextNum"), Integer.valueOf(i), str);
        } catch (Exception unused) {
            return ob6.a0(null, null, 2131748870, str);
        }
    }

    public final boolean t(int i) {
        if (this.J[i] != 2) {
            return true;
        }
        return false;
    }

    public final ArrayList v(int i) {
        switch (i) {
            case 0:
                return this.K;
            case 1:
                return this.L;
            case 2:
                return this.M;
            case 3:
                return this.N;
            case 4:
                return this.O;
            case 5:
                return this.R;
            case 6:
                return this.S;
            case 7:
                return this.T;
            case 8:
                return this.U;
            case 9:
                return this.P;
            case 10:
            default:
                return null;
            case 11:
                return this.V;
            case 12:
                return this.W;
            case 13:
                return this.X;
            case 14:
                return this.Q;
        }
    }

    public final boolean x(long j) {
        if (this.g0.get(Long.valueOf(j)) != null) {
            return true;
        }
        return false;
    }

    public final boolean y() {
        boolean z;
        synchronized (this.c) {
            z = this.b;
        }
        return z;
    }
}
