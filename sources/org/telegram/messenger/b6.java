package org.telegram.messenger;

import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Pair;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
public final class b6 extends f1 implements us {
    public static volatile b6[] T = new b6[4];
    public int D;
    public boolean E;
    public final a0.h F;
    public final ArrayList G;
    public final ArrayList H;
    public final SparseArray I;
    public final a6 J;
    public final a6 K;
    public final a6 L;
    public final a6 M;
    public final a6 N;
    public final a6 O;
    public int P;
    public int Q;
    public int R;
    public final mg.c2 S;
    public int f14727a;
    public final ArrayList f14728b;
    public final ArrayList f14729c;
    public final ArrayList d;
    public final ArrayList e;
    public final HashMap f14730f;
    public final HashMap h;
    public final HashMap f14731n;
    public final HashMap f14732r;
    public final SparseArray f14733s;
    public boolean f14734w;
    public final HashMap f14735x;
    public final ArrayList f14736y;

    public b6(int i10) {
        super(i10);
        Integer num;
        Integer valueOf;
        Integer valueOf2;
        this.f14727a = 0;
        this.f14728b = new ArrayList();
        this.f14729c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f14730f = new HashMap();
        this.h = new HashMap();
        this.f14731n = new HashMap();
        this.f14732r = new HashMap();
        this.f14733s = new SparseArray();
        this.f14734w = false;
        this.f14735x = new HashMap();
        this.f14736y = new ArrayList();
        this.D = 0;
        this.F = new a0.h();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new SparseArray();
        this.S = new mg.c2(this, 3);
        SharedPreferences sharedPreferences = vp.r1(this.currentAccount).f7;
        a6 a6Var = new a6(sharedPreferences.getString("preset0", "1_1_1_1_1048576_512000_512000_524288_0_0_1_1_50_0"), "1_1_1_1_1048576_512000_512000_524288_0_0_1_1_50_0");
        this.J = a6Var;
        a6Var.e = false;
        this.K = new a6(sharedPreferences.getString("preset1", "13_13_13_13_1048576_10485760_1048576_524288_1_1_1_0_100_1"), "13_13_13_13_1048576_10485760_1048576_524288_1_1_1_0_100_1");
        this.L = new a6(sharedPreferences.getString("preset2", "13_13_13_13_1048576_15728640_3145728_524288_1_1_1_0_100_1"), "13_13_13_13_1048576_15728640_3145728_524288_1_1_1_0_100_1");
        boolean contains = sharedPreferences.contains("newConfig");
        if (!contains && getUserConfig().p()) {
            int[] iArr = new int[4];
            int[] iArr2 = new int[4];
            int[] iArr3 = new int[4];
            long[] jArr = new long[7];
            long[] jArr2 = new long[7];
            long[] jArr3 = new long[7];
            int i11 = 0;
            for (int i12 = 4; i11 < i12; i12 = 4) {
                int i13 = i11;
                StringBuilder sb2 = new StringBuilder("mobileDataDownloadMask");
                Object obj = "";
                if (i13 == 0) {
                    num = "";
                } else {
                    num = "";
                    obj = Integer.valueOf(i13);
                }
                sb2.append(obj);
                String sb3 = sb2.toString();
                if (i13 != 0 && !sharedPreferences.contains(sb3)) {
                    iArr[i13] = iArr[0];
                    iArr2[i13] = iArr2[0];
                    iArr3[i13] = iArr3[0];
                } else {
                    iArr[i13] = sharedPreferences.getInt(sb3, 13);
                    StringBuilder sb4 = new StringBuilder("wifiDownloadMask");
                    if (i13 == 0) {
                        valueOf = num;
                    } else {
                        valueOf = Integer.valueOf(i13);
                    }
                    sb4.append(valueOf);
                    iArr2[i13] = sharedPreferences.getInt(sb4.toString(), 13);
                    StringBuilder sb5 = new StringBuilder("roamingDownloadMask");
                    if (i13 == 0) {
                        valueOf2 = num;
                    } else {
                        valueOf2 = Integer.valueOf(i13);
                    }
                    sb5.append(valueOf2);
                    iArr3[i13] = sharedPreferences.getInt(sb5.toString(), 1);
                }
                i11 = i13 + 1;
            }
            jArr[2] = sharedPreferences.getLong("mobileMaxDownloadSize2", this.K.f14579b[1]);
            jArr[3] = sharedPreferences.getLong("mobileMaxDownloadSize3", this.K.f14579b[2]);
            jArr2[2] = sharedPreferences.getLong("wifiMaxDownloadSize2", this.L.f14579b[1]);
            jArr2[3] = sharedPreferences.getLong("wifiMaxDownloadSize3", this.L.f14579b[2]);
            jArr3[2] = sharedPreferences.getLong("roamingMaxDownloadSize2", this.J.f14579b[1]);
            jArr3[3] = sharedPreferences.getLong("roamingMaxDownloadSize3", this.J.f14579b[2]);
            boolean z10 = sharedPreferences.getBoolean("globalAutodownloadEnabled", true);
            a6 a6Var2 = new a6(iArr, this.K.f14579b[0], jArr[2], jArr[3], true, true, z10, false, 100, false);
            this.M = a6Var2;
            a6 a6Var3 = new a6(iArr2, this.L.f14579b[0], jArr2[2], jArr2[3], true, true, z10, false, 100, true);
            this.N = a6Var3;
            a6 a6Var4 = new a6(iArr3, this.J.f14579b[0], jArr3[2], jArr3[3], false, false, z10, true, 50, true);
            this.O = a6Var4;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean("newConfig", true);
            edit.putString("mobilePreset", a6Var2.toString());
            edit.putString("wifiPreset", a6Var3.toString());
            edit.putString("roamingPreset", a6Var4.toString());
            this.P = 3;
            edit.putInt("currentMobilePreset", 3);
            this.Q = 3;
            edit.putInt("currentWifiPreset", 3);
            this.R = 3;
            edit.putInt("currentRoamingPreset", 3);
            edit.commit();
        } else {
            this.M = new a6(sharedPreferences.getString("mobilePreset", "13_13_13_13_1048576_10485760_1048576_524288_1_1_1_0_100_1"), "13_13_13_13_1048576_10485760_1048576_524288_1_1_1_0_100_1");
            this.N = new a6(sharedPreferences.getString("wifiPreset", "13_13_13_13_1048576_15728640_3145728_524288_1_1_1_0_100_1"), "13_13_13_13_1048576_15728640_3145728_524288_1_1_1_0_100_1");
            this.O = new a6(sharedPreferences.getString("roamingPreset", "1_1_1_1_1048576_512000_512000_524288_0_0_1_1_50_0"), "1_1_1_1_1048576_512000_512000_524288_0_0_1_1_50_0");
            this.P = sharedPreferences.getInt("currentMobilePreset", 3);
            this.Q = sharedPreferences.getInt("currentWifiPreset", 3);
            this.R = sharedPreferences.getInt("currentRoamingPreset", 3);
            if (!contains) {
                sharedPreferences.edit().putBoolean("newConfig", true).commit();
            }
        }
        i0.g3(new y5(this, 1));
        androidx.mediarouter.app.f fVar = new androidx.mediarouter.app.f(this, 8);
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        if (Build.VERSION.SDK_INT >= 33) {
            w0.f19025b.registerReceiver(fVar, intentFilter, 4);
        } else {
            w0.f19025b.registerReceiver(fVar, intentFilter);
        }
        if (getUserConfig().p()) {
            g();
        }
    }

    public static b6 q(int i10) {
        b6 b6Var;
        b6 b6Var2 = T[i10];
        if (b6Var2 == null) {
            synchronized (b6.class) {
                try {
                    b6Var = T[i10];
                    if (b6Var == null) {
                        b6[] b6VarArr = T;
                        b6 b6Var3 = new b6(i10);
                        b6VarArr[i10] = b6Var3;
                        b6Var = b6Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return b6Var;
        }
        return b6Var2;
    }

    public static float r(long[] jArr) {
        if (jArr.length >= 2) {
            long j10 = jArr[1];
            if (j10 != 0) {
                return Math.min(1.0f, ((float) jArr[0]) / ((float) j10));
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public static int x(int i10) {
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 2;
        }
        if (i10 == 4) {
            return 1;
        }
        if (i10 != 8) {
            return 0;
        }
        return 2;
    }

    public final void a(String str, jj jjVar, z5 z5Var) {
        if (this.f14734w) {
            this.f14735x.put(str, z5Var);
            return;
        }
        v(z5Var);
        HashMap hashMap = this.f14731n;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(str, arrayList);
        }
        arrayList.add(new WeakReference(z5Var));
        if (jjVar != null) {
            HashMap hashMap2 = this.f14732r;
            ArrayList arrayList2 = (ArrayList) hashMap2.get(str);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                hashMap2.put(str, arrayList2);
            }
            arrayList2.add(jjVar);
        }
        this.f14733s.put(z5Var.getObserverTag(), str);
    }

    public final int b(org.telegram.tgnet.TLRPC.Message r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.b6.b(org.telegram.tgnet.TLRPC$Message):int");
    }

    public final boolean c(int i10, long j10) {
        a6 n10;
        int e = w0.e();
        if (e == 1) {
            if (this.N.f14582g) {
                n10 = p();
            } else {
                return false;
            }
        } else if (e == 2) {
            if (this.O.f14582g) {
                n10 = o();
            } else {
                return false;
            }
        } else if (this.M.f14582g) {
            n10 = n();
        } else {
            return false;
        }
        int i11 = n10.f14578a[1];
        long j11 = n10.f14579b[x(i10)];
        if (i10 == 1 || (j10 != 0 && j10 <= j11)) {
            if (i10 == 2 || (i10 & i11) != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean d(jj jjVar) {
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        if (jjVar.D == 23) {
            int i10 = tz.f18131a;
            if (sc.e(1024) && (storyItem = ((TLRPC.TL_messageMediaStory) jj.n1(jjVar)).storyItem) != null && (messageMedia = storyItem.media) != null && messageMedia.document != null && storyItem.isPublic) {
                return true;
            }
            return false;
        } else if (jjVar.Y0 != null) {
            return true;
        } else {
            if (!jjVar.x3() && e(jjVar) == 1) {
                return true;
            }
            return false;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean z10;
        a0.h hVar = this.F;
        int i12 = zs.Z1;
        SparseArray sparseArray = this.f14733s;
        HashMap hashMap = this.f14731n;
        if (i10 != i12 && i10 != zs.S1) {
            if (i10 != zs.Y1 && i10 != zs.R1) {
                if (i10 == zs.X1) {
                    this.f14734w = true;
                    ArrayList arrayList = (ArrayList) hashMap.get((String) objArr[0]);
                    if (arrayList != null) {
                        Long l4 = (Long) objArr[1];
                        Long l10 = (Long) objArr[2];
                        int size = arrayList.size();
                        for (int i13 = 0; i13 < size; i13++) {
                            WeakReference weakReference = (WeakReference) arrayList.get(i13);
                            if (weakReference.get() != null) {
                                ((z5) weakReference.get()).i(l4.longValue(), l10.longValue());
                            }
                        }
                    }
                    this.f14734w = false;
                    u();
                    return;
                } else if (i10 == zs.W1) {
                    this.f14734w = true;
                    String str = (String) objArr[0];
                    ArrayList arrayList2 = (ArrayList) hashMap.get(str);
                    if (arrayList2 != null) {
                        Long l11 = (Long) objArr[1];
                        Long l12 = (Long) objArr[2];
                        Boolean bool = (Boolean) objArr[3];
                        int size2 = arrayList2.size();
                        for (int i14 = 0; i14 < size2; i14++) {
                            WeakReference weakReference2 = (WeakReference) arrayList2.get(i14);
                            if (weakReference2.get() != null) {
                                long longValue = l11.longValue();
                                long longValue2 = l12.longValue();
                                bool.getClass();
                                ((z5) weakReference2.get()).n(longValue, longValue2);
                            }
                        }
                    }
                    this.f14734w = false;
                    u();
                    try {
                        ArrayList arrayList3 = (ArrayList) getSendMessagesHelper().f17658a.get(str);
                        if (arrayList3 != null) {
                            for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                                cz czVar = (cz) arrayList3.get(i15);
                                if (czVar.f15117n == null) {
                                    long j10 = czVar.f15107a;
                                    Long l13 = (Long) hVar.f(j10);
                                    if (czVar.e == 4) {
                                        if (l13 != null && l13.longValue() + 4000 >= System.currentTimeMillis()) {
                                        }
                                        jj jjVar = (jj) czVar.E.get(str + "_i");
                                        if (jjVar != null && jj.L4(jjVar.f16337k)) {
                                            getMessagesController().z4(5, 0, j10, 0, null);
                                        } else if (jjVar != null && jjVar.F0() != null) {
                                            getMessagesController().z4(3, 0, j10, 0, null);
                                        } else {
                                            getMessagesController().z4(4, 0, j10, 0, null);
                                        }
                                        hVar.k(Long.valueOf(System.currentTimeMillis()), j10);
                                    } else {
                                        czVar.f15116m.F0();
                                        if (l13 == null || l13.longValue() + 4000 < System.currentTimeMillis()) {
                                            if (czVar.f15116m.h4()) {
                                                getMessagesController().z4(8, 0, j10, 0, null);
                                            } else if (jj.L4(czVar.f15116m.f16337k)) {
                                                getMessagesController().z4(5, 0, j10, 0, null);
                                            } else if (jj.R4(czVar.f15116m.f16337k)) {
                                                getMessagesController().z4(9, 0, j10, 0, null);
                                            } else if (czVar.f15116m.F0() != null) {
                                                getMessagesController().z4(3, 0, j10, 0, null);
                                            } else if (czVar.f15111g != null) {
                                                getMessagesController().z4(4, 0, j10, 0, null);
                                            }
                                            hVar.k(Long.valueOf(System.currentTimeMillis()), j10);
                                        }
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    } catch (Exception e) {
                        f8.g(e, true);
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f14734w = true;
            String str2 = (String) objArr[0];
            HashMap hashMap2 = this.f14732r;
            ArrayList arrayList4 = (ArrayList) hashMap2.get(str2);
            if (arrayList4 != null) {
                int size3 = arrayList4.size();
                for (int i16 = 0; i16 < size3; i16++) {
                    ((jj) arrayList4.get(i16)).f16387x0 = true;
                }
                hashMap2.remove(str2);
            }
            ArrayList arrayList5 = (ArrayList) hashMap.get(str2);
            if (arrayList5 != null) {
                int size4 = arrayList5.size();
                for (int i17 = 0; i17 < size4; i17++) {
                    WeakReference weakReference3 = (WeakReference) arrayList5.get(i17);
                    if (weakReference3.get() != null) {
                        ((z5) weakReference3.get()).M(str2);
                        sparseArray.remove(((z5) weakReference3.get()).getObserverTag());
                    }
                }
                hashMap.remove(str2);
            }
            this.f14734w = false;
            u();
            h(0, str2);
            return;
        }
        String str3 = (String) objArr[0];
        Integer num = (Integer) objArr[1];
        this.f14734w = true;
        ArrayList arrayList6 = (ArrayList) hashMap.get(str3);
        if (arrayList6 != null) {
            int size5 = arrayList6.size();
            for (int i18 = 0; i18 < size5; i18++) {
                WeakReference weakReference4 = (WeakReference) arrayList6.get(i18);
                if (weakReference4.get() != null) {
                    z5 z5Var = (z5) weakReference4.get();
                    if (num.intValue() == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z5Var.C(z10);
                    if (num.intValue() != 1) {
                        sparseArray.remove(((z5) weakReference4.get()).getObserverTag());
                    }
                }
            }
            if (num.intValue() != 1) {
                hashMap.remove(str3);
            }
        }
        this.f14734w = false;
        u();
        h(num.intValue(), str3);
    }

    public final int e(org.telegram.messenger.jj r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.b6.e(org.telegram.messenger.jj):int");
    }

    public final boolean f() {
        a6 n10;
        int e = w0.e();
        if (e == 1) {
            if (!this.N.f14582g) {
                return false;
            }
            n10 = p();
        } else if (e == 2) {
            if (!this.O.f14582g) {
                return false;
            }
            n10 = o();
        } else if (!this.M.f14582g) {
            return false;
        } else {
            n10 = n();
        }
        return n10.e;
    }

    public final void g() {
        boolean z10;
        int m10 = m();
        if (m10 != this.f14727a) {
            this.f14727a = m10;
            int i10 = m10 & 1;
            ArrayList arrayList = this.f14728b;
            if (i10 != 0) {
                if (arrayList.isEmpty()) {
                    t(1);
                }
            } else {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    c6 c6Var = (c6) arrayList.get(i11);
                    TLObject tLObject = c6Var.f14913a;
                    if (tLObject instanceof TLRPC.Photo) {
                        TLRPC.PhotoSize w9 = b8.w(((TLRPC.Photo) tLObject).sizes, i0.Z0(false), false, null, false);
                        b8 fileLoader = getFileLoader();
                        fileLoader.getClass();
                        fileLoader.e(null, null, null, w9.location, null, null);
                    } else if (tLObject instanceof TLRPC.Document) {
                        getFileLoader().f((TLRPC.Document) c6Var.f14913a);
                    }
                }
                arrayList.clear();
            }
            int i12 = m10 & 2;
            ArrayList arrayList2 = this.f14729c;
            if (i12 != 0) {
                if (arrayList2.isEmpty()) {
                    t(2);
                }
            } else {
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    getFileLoader().f((TLRPC.Document) ((c6) arrayList2.get(i13)).f14913a);
                }
                arrayList2.clear();
            }
            int i14 = m10 & 8;
            ArrayList arrayList3 = this.d;
            if (i14 != 0) {
                if (arrayList3.isEmpty()) {
                    t(8);
                }
            } else {
                for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                    getFileLoader().f((TLRPC.Document) ((c6) arrayList3.get(i15)).f14913a);
                }
                arrayList3.clear();
            }
            int i16 = m10 & 4;
            ArrayList arrayList4 = this.e;
            if (i16 != 0) {
                if (arrayList4.isEmpty()) {
                    t(4);
                }
            } else {
                for (int i17 = 0; i17 < arrayList4.size(); i17++) {
                    getFileLoader().f((TLRPC.Document) ((c6) arrayList4.get(i17)).f14913a);
                }
                arrayList4.clear();
            }
            if (!this.M.f14582g && !this.O.f14582g && !this.N.f14582g) {
                z10 = false;
            } else {
                z10 = false;
                for (int i18 = 0; i18 < 4; i18++) {
                    if ((n().f14578a[i18] & 1) != 0 || (p().f14578a[i18] & 1) != 0 || (o().f14578a[i18] & 1) != 0) {
                        z10 |= true;
                    }
                    if ((n().f14578a[i18] & 2) != 0 || (p().f14578a[i18] & 2) != 0 || (o().f14578a[i18] & 2) != 0) {
                        z10 |= true;
                    }
                    if ((n().f14578a[i18] & 4) != 0 || (p().f14578a[i18] & 4) != 0 || (o().f14578a[i18] & 4) != 0) {
                        z10 |= true;
                    }
                    if ((n().f14578a[i18] & 8) != 0 || (p().f14578a[i18] & 8) != 0 || (o().f14578a[i18] & 8) != 0) {
                        z10 |= true;
                    }
                }
            }
            if (!z10) {
                getMessagesStorage().r(0);
                return;
            }
            if (!(z10 & true)) {
                getMessagesStorage().r(1);
            }
            if (!(z10 & true)) {
                getMessagesStorage().r(2);
            }
            if (!(z10 & true)) {
                getMessagesStorage().r(4);
            }
            if (!(z10 & true)) {
                getMessagesStorage().r(8);
            }
        }
    }

    public final void h(int i10, String str) {
        HashMap hashMap = this.f14730f;
        c6 c6Var = (c6) hashMap.get(str);
        if (c6Var != null) {
            hashMap.remove(str);
            this.h.remove(new Pair(Long.valueOf(c6Var.f14915c), Integer.valueOf(c6Var.f14914b)));
            if (i10 == 0 || i10 == 2) {
                hs messagesStorage = getMessagesStorage();
                long j10 = c6Var.f14915c;
                messagesStorage.f15938a.c(new gq(messagesStorage, c6Var.f14914b, j10, 6));
            }
            int i11 = c6Var.f14914b;
            if (i11 == 1) {
                ArrayList arrayList = this.f14728b;
                arrayList.remove(c6Var);
                if (arrayList.isEmpty()) {
                    t(1);
                }
            } else if (i11 == 2) {
                ArrayList arrayList2 = this.f14729c;
                arrayList2.remove(c6Var);
                if (arrayList2.isEmpty()) {
                    t(2);
                }
            } else if (i11 == 4) {
                ArrayList arrayList3 = this.e;
                arrayList3.remove(c6Var);
                if (arrayList3.isEmpty()) {
                    t(4);
                }
            } else if (i11 == 8) {
                ArrayList arrayList4 = this.d;
                arrayList4.remove(c6Var);
                if (arrayList4.isEmpty()) {
                    t(8);
                }
            }
        }
    }

    public final void i(int i10, long j10) {
        SparseArray sparseArray = this.I;
        jj jjVar = (jj) sparseArray.get(i10);
        if (jjVar != null && jj.B0(jjVar.f16337k) == j10) {
            sparseArray.remove(i10);
            if (sparseArray.size() == 0) {
                getNotificationCenter().k(zs.f19589b5, new Object[0]);
            }
        }
    }

    public final void j(ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            int i11 = 0;
            while (true) {
                ArrayList arrayList2 = this.H;
                if (i11 < arrayList2.size()) {
                    if (((jj) arrayList.get(i10)).f1() == ((jj) arrayList2.get(i11)).f1() && jj.B0(((jj) arrayList2.get(i11)).f16337k) == jj.B0(((jj) arrayList.get(i10)).f16337k)) {
                        arrayList2.remove(i11);
                        break;
                    }
                    i11++;
                } else {
                    int i12 = 0;
                    while (true) {
                        ArrayList arrayList3 = this.G;
                        if (i12 >= arrayList3.size()) {
                            break;
                        }
                        if (((jj) arrayList.get(i10)).f1() == ((jj) arrayList3.get(i12)).f1() && jj.B0(((jj) arrayList3.get(i12)).f16337k) == jj.B0(((jj) arrayList.get(i10)).f16337k)) {
                            arrayList3.remove(i12);
                            break;
                        }
                        i12++;
                    }
                }
            }
            ((jj) arrayList.get(i10)).P = false;
            b8.G(this.currentAccount).X(((jj) arrayList.get(i10)).F0(), arrayList.get(i10), 0, 0);
            b8.G(this.currentAccount).f(((jj) arrayList.get(i10)).F0());
        }
        getNotificationCenter().k(zs.f19589b5, new Object[0]);
        getMessagesStorage().f15938a.c(new e4(3, this, arrayList));
    }

    public final int k() {
        int i10 = this.D;
        this.D = i10 + 1;
        return i10;
    }

    public final int l() {
        int[] iArr;
        int i10;
        int e = w0.e();
        if (e == 1) {
            if (!this.N.f14582g) {
                return 0;
            }
            iArr = p().f14578a;
        } else if (e == 2) {
            if (!this.O.f14582g) {
                return 0;
            }
            iArr = o().f14578a;
        } else if (!this.M.f14582g) {
            return 0;
        } else {
            iArr = n().f14578a;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            int i13 = iArr[i12];
            if ((i13 & 1) != 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if ((i13 & 2) != 0) {
                i10 |= 2;
            }
            if ((i13 & 4) != 0) {
                i10 |= 4;
            }
            if ((i13 & 8) != 0) {
                i10 |= 8;
            }
            i11 |= i10 << (i12 * 8);
        }
        return i11;
    }

    public final int m() {
        int e = w0.e();
        int i10 = 0;
        if (e == 1) {
            if (!this.N.f14582g) {
                return 0;
            }
            int i11 = 0;
            while (i10 < 4) {
                i11 |= p().f14578a[i10];
                i10++;
            }
            return i11;
        } else if (e == 2) {
            if (!this.O.f14582g) {
                return 0;
            }
            int i12 = 0;
            while (i10 < 4) {
                i12 |= o().f14578a[i10];
                i10++;
            }
            return i12;
        } else if (!this.M.f14582g) {
            return 0;
        } else {
            int i13 = 0;
            while (i10 < 4) {
                i13 |= n().f14578a[i10];
                i10++;
            }
            return i13;
        }
    }

    public final a6 n() {
        int i10 = this.P;
        if (i10 == 0) {
            return this.J;
        }
        if (i10 == 1) {
            return this.K;
        }
        if (i10 == 2) {
            return this.L;
        }
        return this.M;
    }

    public final a6 o() {
        int i10 = this.R;
        if (i10 == 0) {
            return this.J;
        }
        if (i10 == 1) {
            return this.K;
        }
        if (i10 == 2) {
            return this.L;
        }
        return this.O;
    }

    public final a6 p() {
        int i10 = this.Q;
        if (i10 == 0) {
            return this.J;
        }
        if (i10 == 1) {
            return this.K;
        }
        if (i10 == 2) {
            return this.L;
        }
        return this.N;
    }

    public final void s(boolean z10) {
        if (!this.E) {
            if (z10 || Math.abs(System.currentTimeMillis() - getUserConfig().f15150a0) >= 86400000) {
                this.E = true;
                getConnectionsManager().sendRequest(new TL_account.getAutoDownloadSettings(), new v1(this, 1));
            }
        }
    }

    public final void t(int i10) {
        int m10 = m();
        if ((m10 & 1) != 0 && (i10 & 1) != 0 && this.f14728b.isEmpty()) {
            hs messagesStorage = getMessagesStorage();
            messagesStorage.f15938a.c(new yp(messagesStorage, 1, 6));
        }
        if ((m10 & 2) != 0 && (i10 & 2) != 0 && this.f14729c.isEmpty()) {
            hs messagesStorage2 = getMessagesStorage();
            messagesStorage2.f15938a.c(new yp(messagesStorage2, 2, 6));
        }
        if ((m10 & 4) != 0 && (i10 & 4) != 0 && this.e.isEmpty()) {
            hs messagesStorage3 = getMessagesStorage();
            messagesStorage3.f15938a.c(new yp(messagesStorage3, 4, 6));
        }
        if ((m10 & 8) != 0 && (i10 & 8) != 0 && this.d.isEmpty()) {
            hs messagesStorage4 = getMessagesStorage();
            messagesStorage4.f15938a.c(new yp(messagesStorage4, 8, 6));
        }
    }

    public final void u() {
        HashMap hashMap = this.f14735x;
        for (Map.Entry entry : hashMap.entrySet()) {
            a((String) entry.getKey(), null, (z5) entry.getValue());
        }
        hashMap.clear();
        ArrayList arrayList = this.f14736y;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            v((z5) obj);
        }
        arrayList.clear();
    }

    public final void v(z5 z5Var) {
        if (this.f14734w) {
            this.f14736y.add(z5Var);
            return;
        }
        int observerTag = z5Var.getObserverTag();
        SparseArray sparseArray = this.f14733s;
        String str = (String) sparseArray.get(observerTag);
        if (str != null) {
            HashMap hashMap = this.f14731n;
            ArrayList arrayList = (ArrayList) hashMap.get(str);
            if (arrayList != null) {
                int i10 = 0;
                while (i10 < arrayList.size()) {
                    WeakReference weakReference = (WeakReference) arrayList.get(i10);
                    if (weakReference.get() == null || weakReference.get() == z5Var) {
                        arrayList.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                if (arrayList.isEmpty()) {
                    hashMap.remove(str);
                }
            }
            sparseArray.remove(z5Var.getObserverTag());
        }
    }

    public final void w(int i10) {
        a6 o10;
        boolean z10;
        long j10;
        TL_account.saveAutoDownloadSettings saveautodownloadsettings = new TL_account.saveAutoDownloadSettings();
        if (i10 == 0) {
            o10 = n();
            z10 = this.M.f14582g;
        } else if (i10 == 1) {
            o10 = p();
            z10 = this.N.f14582g;
        } else {
            o10 = o();
            z10 = this.O.f14582g;
        }
        TLRPC.TL_autoDownloadSettings tL_autoDownloadSettings = new TLRPC.TL_autoDownloadSettings();
        saveautodownloadsettings.settings = tL_autoDownloadSettings;
        boolean z11 = o10.d;
        long[] jArr = o10.f14579b;
        tL_autoDownloadSettings.audio_preload_next = z11;
        tL_autoDownloadSettings.video_preload_large = o10.f14580c;
        tL_autoDownloadSettings.phonecalls_less_data = o10.f14581f;
        tL_autoDownloadSettings.video_upload_maxbitrate = o10.h;
        tL_autoDownloadSettings.disabled = !z10;
        int i11 = 0;
        int i12 = 0;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        while (true) {
            int[] iArr = o10.f14578a;
            if (i12 >= iArr.length) {
                break;
            }
            int i13 = iArr[i12];
            if ((i13 & 1) != 0) {
                z12 = true;
            }
            if ((i13 & 4) != 0) {
                z13 = true;
            }
            if ((i13 & 8) != 0) {
                z14 = true;
            }
            if (z12 && z13 && z14) {
                break;
            }
            i12++;
        }
        TLRPC.TL_autoDownloadSettings tL_autoDownloadSettings2 = saveautodownloadsettings.settings;
        if (z12) {
            i11 = (int) jArr[0];
        }
        tL_autoDownloadSettings2.photo_size_max = i11;
        long j11 = 0;
        if (z13) {
            j10 = jArr[1];
        } else {
            j10 = 0;
        }
        tL_autoDownloadSettings2.video_size_max = j10;
        if (z14) {
            j11 = jArr[2];
        }
        tL_autoDownloadSettings2.file_size_max = j11;
        getConnectionsManager().sendRequest(saveautodownloadsettings, new ag.c3(4));
    }

    public final void y() {
        ArrayList arrayList = this.G;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (getFileLoader().T(((jj) arrayList.get(size)).S0())) {
                getFileLoader().X(((jj) arrayList.get(size)).F0(), arrayList.get(size), 2, 0);
            }
        }
    }
}
