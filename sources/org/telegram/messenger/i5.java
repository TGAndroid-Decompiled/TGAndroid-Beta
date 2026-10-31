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
public final class i5 extends f1 {
    public static Locale f16053n0;
    public static Collator f16054o0;
    public static final String[] f16055p0 = {"lookup", "data1", "data2", "data3", "display_name", "account_type"};
    public static final String[] f16056q0 = {"lookup", "data2", "data3", "data5"};
    public static volatile i5[] f16057r0 = new i5[4];
    public boolean D;
    public final HashMap E;
    public int F;
    public int G;
    public int H;
    public final int[] I;
    public ArrayList J;
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
    public TLRPC.GlobalPrivacySettings X;
    public HashMap Y;
    public HashMap Z;
    public Account f16058a;
    public ArrayList f16059a0;
    public boolean f16060b;
    public HashMap f16061b0;
    public final Object f16062c;
    public ArrayList f16063c0;
    public boolean d;
    public HashMap f16064d0;
    public boolean e;
    public ArrayList f16065e0;
    public final Object f16066f;
    public ConcurrentHashMap f16067f0;
    public HashMap f16068g0;
    public boolean h;
    public ArrayList f16069h0;
    public HashMap f16070i0;
    public ArrayList f16071j0;
    public HashMap f16072k0;
    public HashMap f16073l0;
    public int m0;
    public boolean f16074n;
    public boolean f16075r;
    public boolean f16076s;
    public String f16077w;
    public final ArrayList f16078x;
    public String f16079y;

    public i5(int i10) {
        super(i10);
        this.f16062c = new Object();
        this.f16066f = new Object();
        this.f16077w = "";
        this.f16078x = new ArrayList();
        HashMap hashMap = new HashMap();
        this.E = hashMap;
        this.I = new int[15];
        this.Y = new HashMap();
        this.Z = new HashMap();
        this.f16059a0 = new ArrayList();
        this.f16061b0 = new HashMap();
        this.f16063c0 = new ArrayList();
        this.f16064d0 = new HashMap();
        this.f16065e0 = new ArrayList();
        this.f16067f0 = new ConcurrentHashMap(20, 1.0f, 2);
        this.f16068g0 = new HashMap();
        this.f16069h0 = new ArrayList();
        this.f16070i0 = new HashMap();
        this.f16071j0 = new ArrayList();
        this.f16072k0 = new HashMap();
        this.f16073l0 = new HashMap();
        if (vp.r1(this.currentAccount).f7.getBoolean("needGetStatuses", false)) {
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
        if (i10 == 0) {
            Utilities.e.c(new a5(this, 9));
        }
    }

    public static String m(int i10, String str, String str2) {
        int i11;
        int i12;
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
        if (str != null) {
            i11 = str.length();
        } else {
            i11 = 0;
        }
        if (str2 != null) {
            i12 = str2.length();
        } else {
            i12 = 0;
        }
        StringBuilder sb2 = new StringBuilder(i11 + i12 + 1);
        if (cd.Y == 1) {
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
                        }
                    }
                    sb2.append(str2);
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
                    }
                }
                sb2.append(str);
            }
        } else if (str != null && str.length() > 0) {
            if (i10 > 0 && str.length() > i10 + 2) {
                return str.substring(0, i10) + "…";
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
        return cd.L0(2131749337, null);
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
            f5Var.e.addAll(f5Var2.e);
            f5Var.f15511f.addAll(f5Var2.f15511f);
            f5Var.f15512g.addAll(f5Var2.f15512g);
            f5Var.f15513i = f5Var2.f15513i;
            f5Var.f15514j = f5Var2.f15514j;
            f5Var.f15508a = f5Var2.f15508a;
            String str = f5Var2.f15509b;
            f5Var.f15509b = str;
            hashMap2.put(str, f5Var);
        }
        return hashMap2;
    }

    public static i5 r(int i10) {
        i5 i5Var;
        i5 i5Var2 = f16057r0[i10];
        if (i5Var2 == null) {
            synchronized (i5.class) {
                try {
                    i5Var = f16057r0[i10];
                    if (i5Var == null) {
                        i5[] i5VarArr = f16057r0;
                        i5 i5Var3 = new i5(i10);
                        i5VarArr[i10] = i5Var3;
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
        if (f16054o0 == null || f16053n0 != Locale.getDefault()) {
            try {
                Locale locale = Locale.getDefault();
                f16053n0 = locale;
                Collator collator = Collator.getInstance(locale);
                f16054o0 = collator;
                collator.setStrength(1);
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
        if (f16054o0 == null) {
            try {
                Collator collator2 = Collator.getInstance();
                f16054o0 = collator2;
                collator2.setStrength(1);
            } catch (Exception e7) {
                f8.g(e7, true);
            }
        }
        if (f16054o0 == null) {
            f16054o0 = new e5();
        }
        return f16054o0;
    }

    public static boolean w() {
        if (w0.f19025b.checkSelfPermission("android.permission.READ_CONTACTS") == 0) {
            return true;
        }
        return false;
    }

    public static boolean z(String str) {
        if (!TextUtils.isEmpty(str)) {
            int length = str.length();
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                char charAt = str.charAt(i11);
                if (charAt >= '0' && charAt <= '9') {
                    i10++;
                }
            }
            if (i10 <= 3) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void A(long j10, boolean z10) {
        synchronized (this.f16062c) {
            this.f16060b = true;
        }
        if (z10) {
            if (v2.f18448a) {
                f8.b("load contacts from cache");
            }
            hs messagesStorage = getMessagesStorage();
            messagesStorage.f15938a.c(new br(messagesStorage, 13));
            return;
        }
        if (v2.f18448a) {
            f8.b("load contacts from server");
        }
        TLRPC.TL_contacts_getContacts tL_contacts_getContacts = new TLRPC.TL_contacts_getContacts();
        tL_contacts_getContacts.hash = j10;
        getConnectionsManager().sendRequest(tL_contacts_getContacts, new s4(this, j10, 0));
    }

    public final void B() {
        if (this.F == 0) {
            this.F = 1;
            getConnectionsManager().sendRequest(new TL_account.getGlobalPrivacySettings(), new u4(this, 1));
        }
    }

    public final void C() {
        D(false);
    }

    public final void D(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.i5.D(boolean):void");
    }

    public final void E(HashMap hashMap, ArrayList arrayList, HashMap hashMap2, boolean z10) {
        Utilities.e.c(new sy(this, z10, new ArrayList(this.f16065e0), hashMap2, hashMap, arrayList));
    }

    public final void F(final HashMap hashMap, final boolean z10, final boolean z11, final boolean z12, final boolean z13, final boolean z14, final boolean z15) {
        if (!z11 && !this.f16075r) {
            return;
        }
        Utilities.e.c(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.l4.run():void");
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
        int i10 = 0;
        while (true) {
            arrayList2 = this.f16078x;
            if (i10 >= size) {
                break;
            }
            Object obj = arrayList.get(i10);
            i10++;
            Long l4 = (Long) obj;
            if (l4.longValue() > 0) {
                TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                tL_contact.user_id = l4.longValue();
                arrayList3.add(tL_contact);
                if (!arrayList2.isEmpty() && (indexOf = arrayList2.indexOf(Long.valueOf(-l4.longValue()))) != -1) {
                    arrayList2.remove(indexOf);
                }
            } else if (l4.longValue() < 0) {
                arrayList4.add(Long.valueOf(-l4.longValue()));
                if (!arrayList2.isEmpty() && (indexOf2 = arrayList2.indexOf(Long.valueOf(-l4.longValue()))) != -1) {
                    arrayList2.remove(indexOf2);
                }
            }
        }
        if (!arrayList4.isEmpty()) {
            hs messagesStorage = getMessagesStorage();
            messagesStorage.getClass();
            if (!arrayList4.isEmpty()) {
                messagesStorage.f15938a.c(new xp(messagesStorage, arrayList4, 0));
            }
        }
        if (!arrayList3.isEmpty()) {
            getMessagesStorage().c1(arrayList3, false);
        }
        if (this.h && this.f16075r) {
            c(arrayList, concurrentHashMap, arrayList3, arrayList4);
            return;
        }
        arrayList2.addAll(arrayList);
        if (v2.f18448a) {
            f8.b("delay update - contacts add = " + arrayList3.size() + " delete = " + arrayList4.size());
        }
    }

    public final java.util.HashMap H() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.i5.H():java.util.HashMap");
    }

    public final void I() {
        L();
        vp messagesController = getMessagesController();
        messagesController.f18885r1.clear();
        messagesController.f18932w1.clear();
        SharedPreferences.Editor edit = vp.r1(this.currentAccount).f7.edit();
        edit.putBoolean("needGetStatuses", true).commit();
        getConnectionsManager().sendRequest(new TLRPC.TL_contacts_getStatuses(), new v4(2, this, edit));
    }

    public final void J(boolean z10) {
        try {
            if (vp.r1(this.currentAccount).f7.getLong("lastReloadStatusTime", 0L) >= System.currentTimeMillis() - 10800000 && !z10) {
                return;
            }
            I();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    public final void K() {
        getConnectionsManager().sendRequest(new TLRPC.TL_contacts_resetSaved(), new ag.c3(4));
    }

    public final void L() {
        try {
            vp.r1(this.currentAccount).f7.edit().putLong("lastReloadStatusTime", System.currentTimeMillis()).commit();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    public final void M(int i10, ArrayList arrayList) {
        switch (i10) {
            case 0:
                this.J = arrayList;
                break;
            case 1:
                this.K = arrayList;
                break;
            case 2:
                this.L = arrayList;
                break;
            case 3:
                this.M = arrayList;
                break;
            case 4:
                this.N = arrayList;
                break;
            case 5:
                this.Q = arrayList;
                break;
            case 6:
                this.R = arrayList;
                break;
            case 7:
                this.S = arrayList;
                break;
            case 8:
                this.T = arrayList;
                break;
            case 9:
                this.O = arrayList;
                break;
            case 11:
                this.U = arrayList;
                break;
            case 12:
                this.V = arrayList;
                break;
            case 13:
                this.W = arrayList;
                break;
            case 14:
                this.P = arrayList;
                break;
        }
        getNotificationCenter().k(zs.f19638k0, new Object[0]);
        I();
    }

    public final void N() {
        HashMap hashMap = new HashMap();
        int size = this.f16065e0.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) this.f16065e0.get(i10);
            TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(tL_contact.user_id));
            if (Z1 != null && !TextUtils.isEmpty(Z1.phone)) {
                hashMap.put(Z1.phone, tL_contact);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.Y.entrySet()) {
            f5 f5Var = (f5) entry.getValue();
            int i11 = 0;
            while (true) {
                if (i11 < f5Var.e.size()) {
                    if (!hashMap.containsKey((String) f5Var.f15512g.get(i11)) && ((Integer) f5Var.h.get(i11)).intValue() != 1) {
                        i11++;
                    }
                } else {
                    arrayList.add(f5Var);
                    break;
                }
            }
        }
        Collections.sort(arrayList, new x4(u(), 1));
        this.f16059a0 = arrayList;
    }

    public final void a(TLRPC.User user) {
        Uri uri;
        if (this.f16058a != null && w0.f19025b.checkSelfPermission("android.permission.WRITE_CONTACTS") == 0) {
            synchronized (this.f16066f) {
                this.d = true;
            }
            ContentResolver contentResolver = w0.f19025b.getContentResolver();
            try {
                Uri build = ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", this.f16058a.name).appendQueryParameter("account_type", this.f16058a.type).build();
                contentResolver.delete(build, "sync2 = " + user.f19942id, null);
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
                f8.g(e, true);
            }
            synchronized (this.f16066f) {
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
        newInsert.withValue("account_name", this.f16058a.name);
        newInsert.withValue("account_type", this.f16058a.type);
        if (TextUtils.isEmpty(user.phone)) {
            str = "";
        } else {
            str = user.phone;
        }
        newInsert.withValue("sync1", str);
        newInsert.withValue("sync2", Long.valueOf(user.f19942id));
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
        newInsert3.withValue("data1", Long.valueOf(user.f19942id));
        newInsert3.withValue("data2", "Telegram Profile");
        newInsert3.withValue("data3", cd.a0("ContactShortcutMessage", null, 2131751786, str2));
        newInsert3.withValue("data4", Long.valueOf(user.f19942id));
        arrayList.add(newInsert3.build());
        ContentProviderOperation.Builder newInsert4 = ContentProviderOperation.newInsert(uri);
        newInsert4.withValueBackReference("raw_contact_id", size);
        newInsert4.withValue("mimetype", "vnd.android.cursor.item/vnd.org.telegram.messenger.android.call");
        newInsert4.withValue("data1", Long.valueOf(user.f19942id));
        newInsert4.withValue("data2", "Telegram Voice Call");
        newInsert4.withValue("data3", cd.a0("ContactShortcutVoiceCall", null, 2131751784, str2));
        newInsert4.withValue("data4", Long.valueOf(user.f19942id));
        arrayList.add(newInsert4.build());
        ContentProviderOperation.Builder newInsert5 = ContentProviderOperation.newInsert(uri);
        newInsert5.withValueBackReference("raw_contact_id", size);
        newInsert5.withValue("mimetype", "vnd.android.cursor.item/vnd.org.telegram.messenger.android.call.video");
        newInsert5.withValue("data1", Long.valueOf(user.f19942id));
        newInsert5.withValue("data2", "Telegram Video Call");
        newInsert5.withValue("data3", cd.a0("ContactShortcutVideoCall", null, 2131751785, str2));
        newInsert5.withValue("data4", Long.valueOf(user.f19942id));
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
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Long l4 = (Long) arrayList.get(i10);
                if (l4.longValue() > 0) {
                    TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                    tL_contact.user_id = l4.longValue();
                    arrayList4.add(tL_contact);
                } else if (l4.longValue() < 0) {
                    arrayList5.add(Long.valueOf(-l4.longValue()));
                }
            }
        }
        if (v2.f18448a) {
            f8.b("process update - contacts add = " + arrayList4.size() + " delete = " + arrayList5.size());
        }
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        boolean z10 = false;
        for (int i11 = 0; i11 < arrayList4.size(); i11++) {
            TLRPC.TL_contact tL_contact2 = (TLRPC.TL_contact) arrayList4.get(i11);
            if (concurrentHashMap != null) {
                user2 = (TLRPC.User) concurrentHashMap.get(Long.valueOf(tL_contact2.user_id));
            } else {
                user2 = null;
            }
            if (user2 == null) {
                user2 = getMessagesController().Z1(Long.valueOf(tL_contact2.user_id));
            } else {
                getMessagesController().U3(user2, true, false);
            }
            if (user2 != null && !TextUtils.isEmpty(user2.phone)) {
                f5 f5Var = (f5) this.Z.get(user2.phone);
                if (f5Var != null && (indexOf2 = f5Var.f15512g.indexOf(user2.phone)) != -1) {
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
        for (int i12 = 0; i12 < arrayList5.size(); i12++) {
            Long l10 = (Long) arrayList5.get(i12);
            Utilities.h.c(new e4(24, this, l10));
            if (concurrentHashMap != null) {
                user = (TLRPC.User) concurrentHashMap.get(l10);
            } else {
                user = null;
            }
            if (user == null) {
                user = getMessagesController().Z1(l10);
            } else {
                getMessagesController().U3(user, true, false);
            }
            if (user == null) {
                z10 = true;
            } else if (!TextUtils.isEmpty(user.phone)) {
                f5 f5Var2 = (f5) this.Z.get(user.phone);
                if (f5Var2 != null && (indexOf = f5Var2.f15512g.indexOf(user.phone)) != -1) {
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
            Utilities.d.c(new a5(this, 3));
        } else {
            i0.g3(new mg(this, arrayList4, arrayList5, 15));
        }
    }

    public final void d(boolean z10) {
        String upperCase;
        Collator u10 = u();
        if (z10) {
            Collections.sort(this.f16065e0, new w4(this, u10, 0));
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.f16065e0.size(); i10++) {
            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) this.f16065e0.get(i10);
            TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(tL_contact.user_id));
            if (Z1 != null) {
                String j10 = h20.j(Z1, true);
                if (j10.length() > 1) {
                    j10 = j10.substring(0, 1);
                }
                if (j10.length() == 0) {
                    upperCase = "#";
                } else {
                    upperCase = j10.toUpperCase();
                }
                String str = (String) this.E.get(upperCase);
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
        Collections.sort(arrayList, new x4(u10, 0));
        this.f16068g0 = hashMap;
        this.f16069h0 = arrayList;
    }

    public final boolean e() {
        boolean z10 = false;
        try {
        } catch (Exception e) {
            f8.g(e, true);
        }
        if (!w()) {
            return false;
        }
        try {
            Cursor query = w0.f19025b.getContentResolver().query(ContactsContract.RawContacts.CONTENT_URI, new String[]{"version"}, null, null, null);
            if (query != null) {
                try {
                    StringBuilder sb2 = new StringBuilder();
                    while (query.moveToNext()) {
                        sb2.append(query.getString(query.getColumnIndex("version")));
                    }
                    String sb3 = sb2.toString();
                    if (this.f16077w.length() != 0 && !this.f16077w.equals(sb3)) {
                        z10 = true;
                    }
                    this.f16077w = sb3;
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
        } catch (Exception e7) {
            f8.g(e7, true);
        }
        return z10;
    }

    public final void f() {
        SharedPreferences sharedPreferences = vp.r1(this.currentAccount).f7;
        this.f16079y = sharedPreferences.getString("invitelink", null);
        int i10 = sharedPreferences.getInt("invitelinktime", 0);
        if (!this.D) {
            if (this.f16079y == null || Math.abs((System.currentTimeMillis() / 1000) - i10) >= 86400) {
                this.D = true;
                getConnectionsManager().sendRequest(new TLRPC.TL_help_getInviteText(), new u4(this, 0), 2);
            }
        }
    }

    public final void g(long r28, java.lang.String r30, java.lang.String r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.i5.g(long, java.lang.String, java.lang.String):void");
    }

    public final void h() {
        if (w()) {
            try {
                ContentResolver contentResolver = w0.f19025b.getContentResolver();
                Account account = this.f16058a;
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
                f8.g(e, true);
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
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.User user = (TLRPC.User) arrayList.get(i10);
            th.e5 O1 = getMessagesController().O1();
            long j10 = user.f19942id;
            int i11 = O1.f48904a;
            ArrayList arrayList3 = O1.h;
            ArrayList arrayList4 = O1.f48908g;
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList4.size()) {
                    break;
                } else if (o5.o(((TL_stories.PeerStories) arrayList4.get(i12)).peer) == j10) {
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
                } else if (o5.o(((TL_stories.PeerStories) arrayList3.get(i13)).peer) == j10) {
                    arrayList3.remove(i13);
                    break;
                } else {
                    i13++;
                }
            }
            th.r5 r5Var = O1.f48911k;
            r5Var.f49412b.f15938a.c(new bi.e(r5Var, j10, 27));
            vp.r1(i11).D();
            zs.f(i11).k(zs.f19709v5, new Object[0]);
            TLRPC.InputUser p12 = getMessagesController().p1(user);
            user.contact = false;
            arrayList2.add(Long.valueOf(user.f19942id));
            tL_contacts_deleteContacts.f19837id.add(p12);
        }
        getConnectionsManager().sendRequest(tL_contacts_deleteContacts, new t4(this, arrayList2, arrayList, z10, ((TLRPC.User) arrayList.get(0)).first_name));
    }

    public final void j(long j10) {
        if (w()) {
            synchronized (this.f16066f) {
                this.d = true;
            }
            try {
                ContentResolver contentResolver = w0.f19025b.getContentResolver();
                Uri build = ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", this.f16058a.name).appendQueryParameter("account_type", this.f16058a.type).build();
                contentResolver.delete(build, "sync2 = " + j10, null);
            } catch (Exception e) {
                f8.g(e, false);
            }
            synchronized (this.f16066f) {
                this.d = false;
            }
        }
    }

    public final void k(ContentResolver contentResolver, Account account, ArrayList arrayList, a0.h hVar, a0.h hVar2) {
        synchronized (this.f16066f) {
            this.d = true;
        }
        try {
            Uri build = ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").build();
            if (arrayList.size() > (hVar.m() * 2) + 500) {
                contentResolver.delete(build, "account_type=? AND account_name=? AND sync2 IS NOT NULL", new String[]{account.type, account.name});
                for (int i10 = 0; i10 < hVar.m(); i10++) {
                    long j10 = hVar.j(i10);
                    if (((Long) hVar.n(i10)).equals(hVar2.f(j10))) {
                        hVar2.l(j10);
                    }
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    if (sb2.length() != 0) {
                        sb2.append(',');
                    }
                    sb2.append(arrayList.get(i11));
                    int i12 = i11 + 1;
                    if (i12 % 500 == 0 || i11 == arrayList.size() - 1) {
                        contentResolver.delete(build, "_id IN (" + ((Object) sb2) + ")", null);
                        sb2.setLength(0);
                    }
                    i11 = i12;
                }
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
        synchronized (this.f16066f) {
            this.d = false;
        }
    }

    public final void l() {
        Utilities.e.c(new a5(this, 1));
    }

    public final String s(int i10) {
        String str = this.f16079y;
        if (str == null) {
            str = "https://telegram.org/dl";
        }
        if (i10 <= 1) {
            return cd.a0(null, null, 2131749126, str);
        }
        try {
            return String.format(cd.J0(i10, "InviteTextNum"), Integer.valueOf(i10), str);
        } catch (Exception unused) {
            return cd.a0(null, null, 2131749126, str);
        }
    }

    public final boolean t(int i10) {
        if (this.I[i10] != 2) {
            return true;
        }
        return false;
    }

    public final ArrayList v(int i10) {
        switch (i10) {
            case 0:
                return this.J;
            case 1:
                return this.K;
            case 2:
                return this.L;
            case 3:
                return this.M;
            case 4:
                return this.N;
            case 5:
                return this.Q;
            case 6:
                return this.R;
            case 7:
                return this.S;
            case 8:
                return this.T;
            case 9:
                return this.O;
            case 10:
            default:
                return null;
            case 11:
                return this.U;
            case 12:
                return this.V;
            case 13:
                return this.W;
            case 14:
                return this.P;
        }
    }

    public final boolean x(long j10) {
        if (this.f16067f0.get(Long.valueOf(j10)) != null) {
            return true;
        }
        return false;
    }

    public final boolean y() {
        boolean z10;
        synchronized (this.f16062c) {
            z10 = this.f16060b;
        }
        return z10;
    }
}
