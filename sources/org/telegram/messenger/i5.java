package org.telegram.messenger;

import android.accounts.Account;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
public final class i5 extends c1 {
    public static Locale f24555o0;
    public static Collator f24556p0;
    public static final String[] f24557q0 = {"lookup", "data1", "data2", "data3", "display_name", "account_type"};
    public static final String[] f24558r0 = {"lookup", "data2", "data3", "data5"};
    public static volatile i5[] f24559s0 = new i5[4];
    public boolean E;
    public final HashMap F;
    public int G;
    public int H;
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
    public Account f24560a;
    public HashMap f24561a0;
    public boolean f24562b;
    public ArrayList f24563b0;
    public final Object f24564c;
    public HashMap f24565c0;
    public boolean d;
    public ArrayList f24566d0;
    public boolean f24567e;
    public HashMap f24568e0;
    public final Object f24569f;
    public ArrayList f24570f0;
    public ConcurrentHashMap f24571g0;
    public boolean h;
    public HashMap f24572h0;
    public ArrayList f24573i0;
    public HashMap f24574j0;
    public ArrayList f24575k0;
    public HashMap f24576l0;
    public HashMap m0;
    public boolean f24577n;
    public int f24578n0;
    public boolean f24579r;
    public boolean f24580s;
    public String f24581w;
    public final ArrayList f24582x;
    public String f24583y;

    public i5(int i7) {
        super(i7);
        this.f24564c = new Object();
        this.f24569f = new Object();
        this.f24581w = "";
        this.f24582x = new ArrayList();
        HashMap hashMap = new HashMap();
        this.F = hashMap;
        this.J = new int[15];
        this.Z = new HashMap();
        this.f24561a0 = new HashMap();
        this.f24563b0 = new ArrayList();
        this.f24565c0 = new HashMap();
        this.f24566d0 = new ArrayList();
        this.f24568e0 = new HashMap();
        this.f24570f0 = new ArrayList();
        this.f24571g0 = new ConcurrentHashMap(20, 1.0f, 2);
        this.f24572h0 = new HashMap();
        this.f24573i0 = new ArrayList();
        this.f24574j0 = new HashMap();
        this.f24575k0 = new ArrayList();
        this.f24576l0 = new HashMap();
        this.m0 = new HashMap();
        if (mp.u1(this.currentAccount).h7.getBoolean("needGetStatuses", false)) {
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
        if (i7 == 0) {
            Utilities.f22782e.c(new m4(this, 8));
        }
    }

    public static String m(int i7, String str, String str2) {
        int i10;
        int i11;
        if (str != null) {
            str = str.trim();
        }
        if (str != null && str2 == null && i7 > 0 && str.contains(" ")) {
            int indexOf = str.indexOf(" ");
            String substring = str.substring(indexOf + 1);
            str = str.substring(0, indexOf);
            str2 = substring;
        }
        if (str2 != null) {
            str2 = str2.trim();
        }
        if (str != null) {
            i10 = str.length();
        } else {
            i10 = 0;
        }
        if (str2 != null) {
            i11 = str2.length();
        } else {
            i11 = 0;
        }
        StringBuilder sb2 = new StringBuilder(i10 + i11 + 1);
        if (gd.f24217b0 == 1) {
            if (str != null && str.length() > 0) {
                if (i7 > 0 && str.length() > i7 + 2) {
                    return str.substring(0, i7) + "…";
                }
                sb2.append(str);
                if (str2 != null && str2.length() > 0) {
                    sb2.append(" ");
                    if (i7 > 0) {
                        if (str2.length() + sb2.length() > i7) {
                            sb2.append(str2.charAt(0));
                        }
                    }
                    sb2.append(str2);
                }
            } else if (str2 != null && str2.length() > 0) {
                if (i7 > 0 && str2.length() > i7 + 2) {
                    return str2.substring(0, i7) + "…";
                }
                sb2.append(str2);
            }
        } else if (str2 != null && str2.length() > 0) {
            if (i7 > 0 && str2.length() > i7 + 2) {
                return str2.substring(0, i7) + "…";
            }
            sb2.append(str2);
            if (str != null && str.length() > 0) {
                sb2.append(" ");
                if (i7 > 0) {
                    if (str.length() + sb2.length() > i7) {
                        sb2.append(str.charAt(0));
                    }
                }
                sb2.append(str);
            }
        } else if (str != null && str.length() > 0) {
            if (i7 > 0 && str.length() > i7 + 2) {
                return str.substring(0, i7) + "…";
            }
            sb2.append(str);
        }
        return sb2.toString();
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
        return gd.M0(2131749136, null);
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
            f5 f5Var = new f5();
            f5 f5Var2 = (f5) entry.getValue();
            f5Var.h.addAll(f5Var2.h);
            f5Var.f23843e.addAll(f5Var2.f23843e);
            f5Var.f23844f.addAll(f5Var2.f23844f);
            f5Var.f23845g.addAll(f5Var2.f23845g);
            f5Var.f23846i = f5Var2.f23846i;
            f5Var.f23847j = f5Var2.f23847j;
            f5Var.f23840a = f5Var2.f23840a;
            String str = f5Var2.f23841b;
            f5Var.f23841b = str;
            hashMap2.put(str, f5Var);
        }
        return hashMap2;
    }

    public static i5 r(int i7) {
        i5 i5Var;
        i5 i5Var2 = f24559s0[i7];
        if (i5Var2 == null) {
            synchronized (i5.class) {
                try {
                    i5Var = f24559s0[i7];
                    if (i5Var == null) {
                        i5[] i5VarArr = f24559s0;
                        i5 i5Var3 = new i5(i7);
                        i5VarArr[i7] = i5Var3;
                        i5Var = i5Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return i5Var;
        }
        return i5Var2;
    }

    public static Collator u() {
        if (f24556p0 == null || f24555o0 != Locale.getDefault()) {
            try {
                Locale locale = Locale.getDefault();
                f24555o0 = locale;
                Collator collator = Collator.getInstance(locale);
                f24556p0 = collator;
                collator.setStrength(1);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        if (f24556p0 == null) {
            try {
                Collator collator2 = Collator.getInstance();
                f24556p0 = collator2;
                collator2.setStrength(1);
            } catch (Exception e11) {
                a8.g(e11, true);
            }
        }
        if (f24556p0 == null) {
            f24556p0 = new e5();
        }
        return f24556p0;
    }

    public static boolean w() {
        if (t0.f26915b.checkSelfPermission("android.permission.READ_CONTACTS") == 0) {
            return true;
        }
        return false;
    }

    public static boolean z(String str) {
        if (!TextUtils.isEmpty(str)) {
            int length = str.length();
            int i7 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = str.charAt(i10);
                if (charAt >= '0' && charAt <= '9') {
                    i7++;
                }
            }
            if (i7 <= 3) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void A(long j3, boolean z10) {
        synchronized (this.f24564c) {
            this.f24562b = true;
        }
        if (z10) {
            if (s2.f26723a) {
                a8.b("load contacts from cache");
            }
            tr messagesStorage = getMessagesStorage();
            messagesStorage.f27054a.c(new pq(messagesStorage, 18));
            return;
        }
        if (s2.f26723a) {
            a8.b("load contacts from server");
        }
        TLRPC.TL_contacts_getContacts tL_contacts_getContacts = new TLRPC.TL_contacts_getContacts();
        tL_contacts_getContacts.hash = j3;
        getConnectionsManager().sendRequest(tL_contacts_getContacts, new x4(this, j3, 0));
    }

    public final void B() {
        if (this.G == 0) {
            this.G = 1;
            getConnectionsManager().sendRequest(new TL_account.getGlobalPrivacySettings(), new s4(this, 1));
        }
    }

    public final void C() {
        D(false);
    }

    public final void D(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.i5.D(boolean):void");
    }

    public final void E(HashMap hashMap, ArrayList arrayList, HashMap hashMap2, boolean z10) {
        Utilities.f22782e.c(new yx(this, z10, new ArrayList(this.f24570f0), hashMap2, hashMap, arrayList));
    }

    public final void F(final HashMap hashMap, final boolean z10, final boolean z11, final boolean z12, final boolean z13, final boolean z14, final boolean z15) {
        if (!z11 && !this.f24579r) {
            return;
        }
        Utilities.f22782e.c(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.d5.run():void");
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
        int i7 = 0;
        while (true) {
            arrayList2 = this.f24582x;
            if (i7 >= size) {
                break;
            }
            Object obj = arrayList.get(i7);
            i7++;
            Long l10 = (Long) obj;
            if (l10.longValue() > 0) {
                TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                tL_contact.user_id = l10.longValue();
                arrayList3.add(tL_contact);
                if (!arrayList2.isEmpty() && (indexOf = arrayList2.indexOf(Long.valueOf(-l10.longValue()))) != -1) {
                    arrayList2.remove(indexOf);
                }
            } else if (l10.longValue() < 0) {
                arrayList4.add(Long.valueOf(-l10.longValue()));
                if (!arrayList2.isEmpty() && (indexOf2 = arrayList2.indexOf(Long.valueOf(-l10.longValue()))) != -1) {
                    arrayList2.remove(indexOf2);
                }
            }
        }
        if (!arrayList4.isEmpty()) {
            tr messagesStorage = getMessagesStorage();
            messagesStorage.getClass();
            if (!arrayList4.isEmpty()) {
                messagesStorage.f27054a.c(new qp(messagesStorage, arrayList4, 21));
            }
        }
        if (!arrayList3.isEmpty()) {
            getMessagesStorage().c1(arrayList3, false);
        }
        if (this.h && this.f24579r) {
            c(arrayList, concurrentHashMap, arrayList3, arrayList4);
            return;
        }
        arrayList2.addAll(arrayList);
        if (s2.f26723a) {
            a8.b("delay update - contacts add = " + arrayList3.size() + " delete = " + arrayList4.size());
        }
    }

    public final java.util.HashMap H() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.i5.H():java.util.HashMap");
    }

    public final void I() {
        L();
        mp messagesController = getMessagesController();
        messagesController.f25758s1.clear();
        messagesController.f25822z1.clear();
        SharedPreferences.Editor edit = mp.u1(this.currentAccount).h7.edit();
        edit.putBoolean("needGetStatuses", true).commit();
        getConnectionsManager().sendRequest(new TLRPC.TL_contacts_getStatuses(), new t4(2, this, edit));
    }

    public final void J(boolean z10) {
        try {
            if (mp.u1(this.currentAccount).h7.getLong("lastReloadStatusTime", 0L) >= System.currentTimeMillis() - 10800000 && !z10) {
                return;
            }
            I();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void K() {
        getConnectionsManager().sendRequest(new TLRPC.TL_contacts_resetSaved(), new fi.k5(9));
    }

    public final void L() {
        try {
            mp.u1(this.currentAccount).h7.edit().putLong("lastReloadStatusTime", System.currentTimeMillis()).commit();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void M(int i7, ArrayList arrayList) {
        switch (i7) {
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
        getNotificationCenter().k(ks.f25141k0, new Object[0]);
        I();
    }

    public final void N() {
        HashMap hashMap = new HashMap();
        int size = this.f24570f0.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) this.f24570f0.get(i7);
            TLRPC.User c22 = getMessagesController().c2(Long.valueOf(tL_contact.user_id));
            if (c22 != null && !TextUtils.isEmpty(c22.phone)) {
                hashMap.put(c22.phone, tL_contact);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.Z.entrySet()) {
            f5 f5Var = (f5) entry.getValue();
            int i10 = 0;
            while (true) {
                if (i10 < f5Var.f23843e.size()) {
                    if (!hashMap.containsKey((String) f5Var.f23845g.get(i10)) && ((Integer) f5Var.h.get(i10)).intValue() != 1) {
                        i10++;
                    }
                } else {
                    arrayList.add(f5Var);
                    break;
                }
            }
        }
        Collections.sort(arrayList, new v4(u(), 1));
        this.f24563b0 = arrayList;
    }

    public final void a(TLRPC.User user) {
        Uri uri;
        if (this.f24560a != null && t0.f26915b.checkSelfPermission("android.permission.WRITE_CONTACTS") == 0) {
            synchronized (this.f24569f) {
                this.d = true;
            }
            ContentResolver contentResolver = t0.f26915b.getContentResolver();
            try {
                Uri build = ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", this.f24560a.name).appendQueryParameter("account_type", this.f24560a.type).build();
                contentResolver.delete(build, "sync2 = " + user.f28554id, null);
            } catch (Exception unused) {
            }
            ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
            b(arrayList, user);
            try {
                ContentProviderResult[] applyBatch = contentResolver.applyBatch("com.android.contacts", arrayList);
                if (applyBatch != null && applyBatch.length > 0 && (uri = applyBatch[0].uri) != null) {
                    Long.parseLong(uri.getLastPathSegment());
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            synchronized (this.f24569f) {
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
        newInsert.withValue("account_name", this.f24560a.name);
        newInsert.withValue("account_type", this.f24560a.type);
        if (TextUtils.isEmpty(user.phone)) {
            str = "";
        } else {
            str = user.phone;
        }
        newInsert.withValue("sync1", str);
        newInsert.withValue("sync2", Long.valueOf(user.f28554id));
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
        newInsert3.withValue("data1", Long.valueOf(user.f28554id));
        newInsert3.withValue("data2", "Telegram Profile");
        newInsert3.withValue("data3", gd.a0("ContactShortcutMessage", null, 2131751775, str2));
        newInsert3.withValue("data4", Long.valueOf(user.f28554id));
        arrayList.add(newInsert3.build());
        ContentProviderOperation.Builder newInsert4 = ContentProviderOperation.newInsert(uri);
        newInsert4.withValueBackReference("raw_contact_id", size);
        newInsert4.withValue("mimetype", "vnd.android.cursor.item/vnd.org.telegram.messenger.android.call");
        newInsert4.withValue("data1", Long.valueOf(user.f28554id));
        newInsert4.withValue("data2", "Telegram Voice Call");
        newInsert4.withValue("data3", gd.a0("ContactShortcutVoiceCall", null, 2131751773, str2));
        newInsert4.withValue("data4", Long.valueOf(user.f28554id));
        arrayList.add(newInsert4.build());
        ContentProviderOperation.Builder newInsert5 = ContentProviderOperation.newInsert(uri);
        newInsert5.withValueBackReference("raw_contact_id", size);
        newInsert5.withValue("mimetype", "vnd.android.cursor.item/vnd.org.telegram.messenger.android.call.video");
        newInsert5.withValue("data1", Long.valueOf(user.f28554id));
        newInsert5.withValue("data2", "Telegram Video Call");
        newInsert5.withValue("data3", gd.a0("ContactShortcutVideoCall", null, 2131751774, str2));
        newInsert5.withValue("data4", Long.valueOf(user.f28554id));
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
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                Long l10 = (Long) arrayList.get(i7);
                if (l10.longValue() > 0) {
                    TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                    tL_contact.user_id = l10.longValue();
                    arrayList4.add(tL_contact);
                } else if (l10.longValue() < 0) {
                    arrayList5.add(Long.valueOf(-l10.longValue()));
                }
            }
        }
        if (s2.f26723a) {
            a8.b("process update - contacts add = " + arrayList4.size() + " delete = " + arrayList5.size());
        }
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        boolean z10 = false;
        for (int i10 = 0; i10 < arrayList4.size(); i10++) {
            TLRPC.TL_contact tL_contact2 = (TLRPC.TL_contact) arrayList4.get(i10);
            if (concurrentHashMap != null) {
                user2 = (TLRPC.User) concurrentHashMap.get(Long.valueOf(tL_contact2.user_id));
            } else {
                user2 = null;
            }
            if (user2 == null) {
                user2 = getMessagesController().c2(Long.valueOf(tL_contact2.user_id));
            } else {
                getMessagesController().e4(user2, true, false);
            }
            if (user2 != null && !TextUtils.isEmpty(user2.phone)) {
                f5 f5Var = (f5) this.f24561a0.get(user2.phone);
                if (f5Var != null && (indexOf2 = f5Var.f23845g.indexOf(user2.phone)) != -1) {
                    f5Var.h.set(indexOf2, 0);
                }
                if (sb2.length() != 0) {
                    sb2.append(",");
                }
                sb2.append(user2.phone);
            } else {
                z10 = true;
            }
        }
        for (int i11 = 0; i11 < arrayList5.size(); i11++) {
            Long l11 = (Long) arrayList5.get(i11);
            Utilities.h.c(new w3(26, this, l11));
            if (concurrentHashMap != null) {
                user = (TLRPC.User) concurrentHashMap.get(l11);
            } else {
                user = null;
            }
            if (user == null) {
                user = getMessagesController().c2(l11);
            } else {
                getMessagesController().e4(user, true, false);
            }
            if (user == null) {
                z10 = true;
            } else if (!TextUtils.isEmpty(user.phone)) {
                f5 f5Var2 = (f5) this.f24561a0.get(user.phone);
                if (f5Var2 != null && (indexOf = f5Var2.f23845g.indexOf(user.phone)) != -1) {
                    f5Var2.h.set(indexOf, 1);
                }
                if (sb3.length() != 0) {
                    sb3.append(",");
                }
                sb3.append(user.phone);
            }
        }
        if (sb2.length() != 0 || sb3.length() != 0) {
            getMessagesStorage().f(sb2.toString(), sb3.toString());
        }
        if (z10) {
            Utilities.d.c(new m4(this, 2));
        } else {
            g0.g3(new yf(this, arrayList4, arrayList5, 15));
        }
    }

    public final void d(boolean z10) {
        String upperCase;
        Collator u10 = u();
        if (z10) {
            Collections.sort(this.f24570f0, new u4(this, u10, 0));
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < this.f24570f0.size(); i7++) {
            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) this.f24570f0.get(i7);
            TLRPC.User c22 = getMessagesController().c2(Long.valueOf(tL_contact.user_id));
            if (c22 != null) {
                String k10 = o10.k(c22, true);
                if (k10.length() > 1) {
                    k10 = k10.substring(0, 1);
                }
                if (k10.length() == 0) {
                    upperCase = "#";
                } else {
                    upperCase = k10.toUpperCase();
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
        Collections.sort(arrayList, new v4(u10, 0));
        this.f24572h0 = hashMap;
        this.f24573i0 = arrayList;
    }

    public final boolean e() {
        boolean z10 = false;
        try {
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        if (!w()) {
            return false;
        }
        try {
            Cursor query = t0.f26915b.getContentResolver().query(ContactsContract.RawContacts.CONTENT_URI, new String[]{"version"}, null, null, null);
            if (query != null) {
                try {
                    StringBuilder sb2 = new StringBuilder();
                    while (query.moveToNext()) {
                        sb2.append(query.getString(query.getColumnIndex("version")));
                    }
                    String sb3 = sb2.toString();
                    if (this.f24581w.length() != 0 && !this.f24581w.equals(sb3)) {
                        z10 = true;
                    }
                    this.f24581w = sb3;
                } catch (Throwable th2) {
                    try {
                        query.close();
                        throw th2;
                    }
                }
            }
            if (query != null) {
                query.close();
            }
        } catch (Exception e11) {
            a8.g(e11, true);
        }
        return z10;
    }

    public final void f() {
        SharedPreferences sharedPreferences = mp.u1(this.currentAccount).h7;
        this.f24583y = sharedPreferences.getString("invitelink", null);
        int i7 = sharedPreferences.getInt("invitelinktime", 0);
        if (!this.E) {
            if (this.f24583y == null || Math.abs((System.currentTimeMillis() / 1000) - i7) >= 86400) {
                this.E = true;
                getConnectionsManager().sendRequest(new TLRPC.TL_help_getInviteText(), new s4(this, 0), 2);
            }
        }
    }

    public final void g(long r28, java.lang.String r30, java.lang.String r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.i5.g(long, java.lang.String, java.lang.String):void");
    }

    public final void h() {
        if (w()) {
            try {
                ContentResolver contentResolver = t0.f26915b.getContentResolver();
                Account account = this.f24560a;
                Cursor query = contentResolver.query(ContactsContract.Groups.CONTENT_URI, new String[]{"_id"}, "title=? AND account_type=? AND account_name=?", new String[]{"TelegramConnectionService", account.type, account.name}, null);
                if (query != null && query.moveToFirst()) {
                    int i7 = query.getInt(0);
                    query.close();
                    Cursor query2 = contentResolver.query(ContactsContract.Data.CONTENT_URI, new String[]{"raw_contact_id"}, "mimetype=? AND data1=?", new String[]{"vnd.android.cursor.item/group_membership", i7 + ""}, null);
                    if (query2 != null && query2.moveToFirst()) {
                        int i10 = query2.getInt(0);
                        query2.close();
                        Uri uri = ContactsContract.RawContacts.CONTENT_URI;
                        contentResolver.delete(uri, "_id=?", new String[]{i10 + ""});
                    } else if (query2 != null) {
                        query2.close();
                    }
                } else if (query != null) {
                    query.close();
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    public final void i(ArrayList arrayList, boolean z10) {
        if (arrayList.isEmpty()) {
            return;
        }
        TLRPC.TL_contacts_deleteContacts tL_contacts_deleteContacts = new TLRPC.TL_contacts_deleteContacts();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.User user = (TLRPC.User) arrayList.get(i7);
            fi.p6 R1 = getMessagesController().R1();
            long j3 = user.f28554id;
            int i10 = R1.f12385a;
            ArrayList arrayList3 = R1.h;
            ArrayList arrayList4 = R1.f12390g;
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList4.size()) {
                    break;
                } else if (n5.o(((TL_stories.PeerStories) arrayList4.get(i11)).peer) == j3) {
                    arrayList4.remove(i11);
                    break;
                } else {
                    i11++;
                }
            }
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList3.size()) {
                    break;
                } else if (n5.o(((TL_stories.PeerStories) arrayList3.get(i12)).peer) == j3) {
                    arrayList3.remove(i12);
                    break;
                } else {
                    i12++;
                }
            }
            fi.c7 c7Var = R1.f12393k;
            c7Var.f11818b.f27054a.c(new bi.y3(c7Var, j3, 7));
            mp.u1(i10).D();
            ks.f(i10).k(ks.f25225x5, new Object[0]);
            TLRPC.InputUser s12 = getMessagesController().s1(user);
            user.contact = false;
            arrayList2.add(Long.valueOf(user.f28554id));
            tL_contacts_deleteContacts.f28449id.add(s12);
        }
        getConnectionsManager().sendRequest(tL_contacts_deleteContacts, new r4(this, arrayList2, arrayList, z10, ((TLRPC.User) arrayList.get(0)).first_name));
    }

    public final void j(long j3) {
        if (w()) {
            synchronized (this.f24569f) {
                this.d = true;
            }
            try {
                ContentResolver contentResolver = t0.f26915b.getContentResolver();
                Uri build = ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", this.f24560a.name).appendQueryParameter("account_type", this.f24560a.type).build();
                contentResolver.delete(build, "sync2 = " + j3, null);
            } catch (Exception e10) {
                a8.g(e10, false);
            }
            synchronized (this.f24569f) {
                this.d = false;
            }
        }
    }

    public final void k(ContentResolver contentResolver, Account account, ArrayList arrayList, a0.h hVar, a0.h hVar2) {
        synchronized (this.f24569f) {
            this.d = true;
        }
        try {
            Uri build = ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").build();
            if (arrayList.size() > (hVar.m() * 2) + 500) {
                contentResolver.delete(build, "account_type=? AND account_name=? AND sync2 IS NOT NULL", new String[]{account.type, account.name});
                for (int i7 = 0; i7 < hVar.m(); i7++) {
                    long j3 = hVar.j(i7);
                    if (((Long) hVar.n(i7)).equals(hVar2.f(j3))) {
                        hVar2.l(j3);
                    }
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                int i10 = 0;
                while (i10 < arrayList.size()) {
                    if (sb2.length() != 0) {
                        sb2.append(',');
                    }
                    sb2.append(arrayList.get(i10));
                    int i11 = i10 + 1;
                    if (i11 % 500 == 0 || i10 == arrayList.size() - 1) {
                        contentResolver.delete(build, "_id IN (" + ((Object) sb2) + ")", null);
                        sb2.setLength(0);
                    }
                    i10 = i11;
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        synchronized (this.f24569f) {
            this.d = false;
        }
    }

    public final void l() {
        Utilities.f22782e.c(new m4(this, 1));
    }

    public final String s(int i7) {
        String str = this.f24583y;
        if (str == null) {
            str = "https://telegram.org/dl";
        }
        if (i7 <= 1) {
            return gd.a0(null, null, 2131748924, str);
        }
        try {
            return String.format(gd.K0(i7, "InviteTextNum"), Integer.valueOf(i7), str);
        } catch (Exception unused) {
            return gd.a0(null, null, 2131748924, str);
        }
    }

    public final boolean t(int i7) {
        if (this.J[i7] != 2) {
            return true;
        }
        return false;
    }

    public final ArrayList v(int i7) {
        switch (i7) {
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

    public final boolean x(long j3) {
        if (this.f24571g0.get(Long.valueOf(j3)) != null) {
            return true;
        }
        return false;
    }

    public final boolean y() {
        boolean z10;
        synchronized (this.f24564c) {
            z10 = this.f24562b;
        }
        return z10;
    }
}
