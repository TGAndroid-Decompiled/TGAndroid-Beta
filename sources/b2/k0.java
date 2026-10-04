package b2;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
public final class k0 {
    public static final k0 f3314g;
    public static final String h;
    public static final String f3315i;
    public static final String f3316j;
    public static final String f3317k;
    public static final String f3318l;
    public static final String f3319m;
    public final String f3320a;
    public final f0 f3321b;
    public final e0 f3322c;
    public final n0 d;
    public final a0 f3323e;
    public final g0 f3324f;

    static {
        y yVar = new y();
        e9.g0 g0Var = e9.i0.f8758b;
        e9.a1 a1Var = e9.a1.f8721e;
        List list = Collections.EMPTY_LIST;
        e9.a1 a1Var2 = e9.a1.f8721e;
        d0 d0Var = new d0();
        f3314g = new k0("", new z(yVar), null, new e0(d0Var), n0.K, g0.d);
        h = Integer.toString(0, 36);
        f3315i = Integer.toString(1, 36);
        f3316j = Integer.toString(2, 36);
        f3317k = Integer.toString(3, 36);
        f3318l = Integer.toString(4, 36);
        f3319m = Integer.toString(5, 36);
    }

    public k0(String str, a0 a0Var, f0 f0Var, e0 e0Var, n0 n0Var, g0 g0Var) {
        this.f3320a = str;
        this.f3321b = f0Var;
        this.f3322c = e0Var;
        this.d = n0Var;
        this.f3323e = a0Var;
        this.f3324f = g0Var;
    }

    public static k0 a(Bundle bundle) {
        e0 e0Var;
        n0 b10;
        boolean z10;
        boolean z11;
        boolean z12;
        a0 a0Var;
        g0 g0Var;
        Map a2;
        byte[] bArr;
        c0 c0Var;
        x xVar;
        e9.a1 i10;
        e9.a1 j3;
        f0 f0Var;
        String string = bundle.getString(h, "");
        string.getClass();
        Bundle bundle2 = bundle.getBundle(f3315i);
        if (bundle2 == null) {
            e0Var = e0.f3204f;
        } else {
            d0 d0Var = new d0();
            String str = e0.f3205g;
            e0 e0Var2 = e0.f3204f;
            d0Var.f3185a = bundle2.getLong(str, e0Var2.f3209a);
            d0Var.f3186b = bundle2.getLong(e0.h, e0Var2.f3210b);
            d0Var.f3187c = bundle2.getLong(e0.f3206i, e0Var2.f3211c);
            d0Var.d = bundle2.getFloat(e0.f3207j, e0Var2.d);
            d0Var.f3188e = bundle2.getFloat(e0.f3208k, e0Var2.f3212e);
            e0Var = new e0(d0Var);
        }
        e0 e0Var3 = e0Var;
        Bundle bundle3 = bundle.getBundle(f3316j);
        if (bundle3 == null) {
            b10 = n0.K;
        } else {
            b10 = n0.b(bundle3);
        }
        n0 n0Var = b10;
        Bundle bundle4 = bundle.getBundle(f3317k);
        if (bundle4 == null) {
            a0Var = a0.f3145r;
        } else {
            y yVar = new y();
            String str2 = z.f3621j;
            z zVar = z.f3620i;
            long j10 = zVar.f3629a;
            long j11 = zVar.d;
            long j12 = zVar.f3630b;
            long Q = e2.d0.Q(bundle4.getLong(str2, j10));
            boolean z13 = true;
            if (Q >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.b(z10);
            yVar.f3614a = Q;
            long Q2 = e2.d0.Q(bundle4.getLong(z.f3622k, zVar.f3631c));
            if (Q2 != Long.MIN_VALUE && Q2 < 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            e2.d.b(z11);
            yVar.f3615b = Q2;
            yVar.f3616c = bundle4.getBoolean(z.f3623l, zVar.f3632e);
            yVar.d = bundle4.getBoolean(z.f3624m, zVar.f3633f);
            yVar.f3617e = bundle4.getBoolean(z.f3625n, zVar.f3634g);
            yVar.f3618f = bundle4.getBoolean(z.f3628q, zVar.h);
            long j13 = bundle4.getLong(z.f3626o, j12);
            if (j13 != j12) {
                if (j13 >= 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                e2.d.b(z12);
                yVar.f3614a = j13;
            }
            long j14 = bundle4.getLong(z.f3627p, j11);
            if (j14 != j11) {
                if (j14 != Long.MIN_VALUE && j14 < 0) {
                    z13 = false;
                }
                e2.d.b(z13);
                yVar.f3615b = j14;
            }
            a0Var = new z(yVar);
        }
        a0 a0Var2 = a0Var;
        Bundle bundle5 = bundle.getBundle(f3318l);
        if (bundle5 == null) {
            g0Var = g0.d;
        } else {
            aa.a aVar = new aa.a(4);
            aVar.f387c = (Uri) bundle5.getParcelable(g0.f3236e);
            aVar.f386b = bundle5.getString(g0.f3237f);
            aVar.d = bundle5.getBundle(g0.f3238g);
            g0Var = new g0(aVar);
        }
        g0 g0Var2 = g0Var;
        Bundle bundle6 = bundle.getBundle(f3319m);
        if (bundle6 == null) {
            f0Var = null;
        } else {
            Bundle bundle7 = bundle6.getBundle(f0.f3220k);
            if (bundle7 == null) {
                c0Var = null;
            } else {
                String string2 = bundle7.getString(c0.f3170i);
                string2.getClass();
                UUID fromString = UUID.fromString(string2);
                Uri uri = (Uri) bundle7.getParcelable(c0.f3171j);
                String str3 = c0.f3172k;
                Bundle bundle8 = Bundle.EMPTY;
                Bundle bundle9 = bundle7.getBundle(str3);
                if (bundle9 == null) {
                    bundle9 = bundle8;
                }
                if (bundle9 == bundle8) {
                    a2 = e9.f1.h;
                } else {
                    HashMap hashMap = new HashMap();
                    if (bundle9 != bundle8) {
                        for (String str4 : bundle9.keySet()) {
                            String string3 = bundle9.getString(str4);
                            if (string3 != null) {
                                hashMap.put(str4, string3);
                            }
                        }
                    }
                    a2 = e9.k0.a(hashMap);
                }
                boolean z14 = bundle7.getBoolean(c0.f3173l, false);
                boolean z15 = bundle7.getBoolean(c0.f3174m, false);
                boolean z16 = bundle7.getBoolean(c0.f3175n, false);
                String str5 = c0.f3176o;
                ArrayList<Integer> arrayList = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle7.getIntegerArrayList(str5);
                if (integerArrayList != null) {
                    arrayList = integerArrayList;
                }
                e9.i0 v = e9.i0.v(arrayList);
                byte[] byteArray = bundle7.getByteArray(c0.f3177p);
                b0 b0Var = new b0();
                b0Var.f3164a = fromString;
                b0Var.f3165b = uri;
                b0Var.f3166c = e9.k0.a(a2);
                b0Var.d = z14;
                b0Var.f3168f = z16;
                b0Var.f3167e = z15;
                b0Var.f3169g = e9.i0.v(v);
                if (byteArray != null) {
                    bArr = Arrays.copyOf(byteArray, byteArray.length);
                } else {
                    bArr = null;
                }
                b0Var.h = bArr;
                c0Var = new c0(b0Var);
            }
            Bundle bundle10 = bundle6.getBundle(f0.f3221l);
            if (bundle10 == null) {
                xVar = null;
            } else {
                Uri uri2 = (Uri) bundle10.getParcelable(x.f3603b);
                uri2.getClass();
                ?? obj = new Object();
                obj.f3602a = uri2;
                xVar = new x(obj);
            }
            ArrayList parcelableArrayList = bundle6.getParcelableArrayList(f0.f3222m);
            if (parcelableArrayList == null) {
                e9.g0 g0Var3 = e9.i0.f8758b;
                i10 = e9.a1.f8721e;
            } else {
                e9.f0 u10 = e9.i0.u();
                int i11 = 0;
                while (i11 < parcelableArrayList.size()) {
                    Bundle bundle11 = (Bundle) parcelableArrayList.get(i11);
                    bundle11.getClass();
                    u10.b(new e1(bundle11.getInt(e1.d, 0), bundle11.getInt(e1.f3213e, 0), bundle11.getInt(e1.f3214f, 0)));
                    i11++;
                    parcelableArrayList = parcelableArrayList;
                }
                i10 = u10.i();
            }
            e9.a1 a1Var = i10;
            ArrayList parcelableArrayList2 = bundle6.getParcelableArrayList(f0.f3224o);
            if (parcelableArrayList2 == null) {
                e9.g0 g0Var4 = e9.i0.f8758b;
                j3 = e9.a1.f8721e;
            } else {
                j3 = e2.d.j(new ai.w1(13), parcelableArrayList2);
            }
            e9.a1 a1Var2 = j3;
            long j15 = bundle6.getLong(f0.f3225p, -9223372036854775807L);
            Uri uri3 = (Uri) bundle6.getParcelable(f0.f3218i);
            uri3.getClass();
            f0Var = new f0(uri3, bundle6.getString(f0.f3219j), c0Var, xVar, a1Var, bundle6.getString(f0.f3223n), a1Var2, j15);
        }
        return new k0(string, a0Var2, f0Var, e0Var3, n0Var, g0Var2);
    }

    public final Bundle b(boolean z10) {
        f0 f0Var;
        Bundle bundle = new Bundle();
        String str = this.f3320a;
        if (!str.equals("")) {
            bundle.putString(h, str);
        }
        e0 e0Var = e0.f3204f;
        e0 e0Var2 = this.f3322c;
        if (!e0Var2.equals(e0Var)) {
            bundle.putBundle(f3315i, e0Var2.b());
        }
        n0 n0Var = n0.K;
        n0 n0Var2 = this.d;
        if (!n0Var2.equals(n0Var)) {
            bundle.putBundle(f3316j, n0Var2.c());
        }
        z zVar = z.f3620i;
        a0 a0Var = this.f3323e;
        if (!a0Var.equals(zVar)) {
            Bundle bundle2 = new Bundle();
            long j3 = a0Var.f3629a;
            if (j3 != zVar.f3629a) {
                bundle2.putLong(z.f3621j, j3);
            }
            long j10 = a0Var.f3631c;
            if (j10 != zVar.f3631c) {
                bundle2.putLong(z.f3622k, j10);
            }
            long j11 = a0Var.f3630b;
            if (j11 != zVar.f3630b) {
                bundle2.putLong(z.f3626o, j11);
            }
            long j12 = a0Var.d;
            if (j12 != zVar.d) {
                bundle2.putLong(z.f3627p, j12);
            }
            boolean z11 = a0Var.f3632e;
            if (z11 != zVar.f3632e) {
                bundle2.putBoolean(z.f3623l, z11);
            }
            boolean z12 = a0Var.f3633f;
            if (z12 != zVar.f3633f) {
                bundle2.putBoolean(z.f3624m, z12);
            }
            boolean z13 = a0Var.f3634g;
            if (z13 != zVar.f3634g) {
                bundle2.putBoolean(z.f3625n, z13);
            }
            boolean z14 = a0Var.h;
            if (z14 != zVar.h) {
                bundle2.putBoolean(z.f3628q, z14);
            }
            bundle.putBundle(f3317k, bundle2);
        }
        g0 g0Var = g0.d;
        g0 g0Var2 = this.f3324f;
        if (!g0Var2.equals(g0Var)) {
            Bundle bundle3 = new Bundle();
            Uri uri = g0Var2.f3239a;
            if (uri != null) {
                bundle3.putParcelable(g0.f3236e, uri);
            }
            String str2 = g0Var2.f3240b;
            if (str2 != null) {
                bundle3.putString(g0.f3237f, str2);
            }
            Bundle bundle4 = g0Var2.f3241c;
            if (bundle4 != null) {
                bundle3.putBundle(g0.f3238g, bundle4);
            }
            bundle.putBundle(f3318l, bundle3);
        }
        if (z10 && (f0Var = this.f3321b) != null) {
            e9.i0 i0Var = f0Var.f3231g;
            List list = f0Var.f3229e;
            Bundle bundle5 = new Bundle();
            bundle5.putParcelable(f0.f3218i, f0Var.f3226a);
            String str3 = f0Var.f3227b;
            if (str3 != null) {
                bundle5.putString(f0.f3219j, str3);
            }
            c0 c0Var = f0Var.f3228c;
            if (c0Var != null) {
                String str4 = f0.f3220k;
                e9.i0 i0Var2 = c0Var.f3183g;
                e9.k0 k0Var = c0Var.f3180c;
                Bundle bundle6 = new Bundle();
                bundle6.putString(c0.f3170i, c0Var.f3178a.toString());
                Uri uri2 = c0Var.f3179b;
                if (uri2 != null) {
                    bundle6.putParcelable(c0.f3171j, uri2);
                }
                if (!k0Var.isEmpty()) {
                    String str5 = c0.f3172k;
                    Bundle bundle7 = new Bundle();
                    for (Map.Entry entry : k0Var.entrySet()) {
                        bundle7.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                    bundle6.putBundle(str5, bundle7);
                }
                boolean z15 = c0Var.d;
                if (z15) {
                    bundle6.putBoolean(c0.f3173l, z15);
                }
                boolean z16 = c0Var.f3181e;
                if (z16) {
                    bundle6.putBoolean(c0.f3174m, z16);
                }
                boolean z17 = c0Var.f3182f;
                if (z17) {
                    bundle6.putBoolean(c0.f3175n, z17);
                }
                if (!i0Var2.isEmpty()) {
                    bundle6.putIntegerArrayList(c0.f3176o, new ArrayList<>(i0Var2));
                }
                byte[] bArr = c0Var.h;
                if (bArr != null) {
                    bundle6.putByteArray(c0.f3177p, bArr);
                }
                bundle5.putBundle(str4, bundle6);
            }
            x xVar = f0Var.d;
            if (xVar != null) {
                String str6 = f0.f3221l;
                Bundle bundle8 = new Bundle();
                bundle8.putParcelable(x.f3603b, xVar.f3604a);
                bundle5.putBundle(str6, bundle8);
            }
            if (!list.isEmpty()) {
                bundle5.putParcelableArrayList(f0.f3222m, e2.d.p(list, new ai.w1(11)));
            }
            String str7 = f0Var.f3230f;
            if (str7 != null) {
                bundle5.putString(f0.f3223n, str7);
            }
            if (!i0Var.isEmpty()) {
                bundle5.putParcelableArrayList(f0.f3224o, e2.d.p(i0Var, new ai.w1(12)));
            }
            long j13 = f0Var.h;
            if (j13 != -9223372036854775807L) {
                bundle5.putLong(f0.f3225p, j13);
            }
            bundle.putBundle(f3319m, bundle5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k0) {
                k0 k0Var = (k0) obj;
                if (Objects.equals(this.f3320a, k0Var.f3320a) && this.f3323e.equals(k0Var.f3323e) && Objects.equals(this.f3321b, k0Var.f3321b) && Objects.equals(this.f3322c, k0Var.f3322c) && Objects.equals(this.d, k0Var.d) && Objects.equals(this.f3324f, k0Var.f3324f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f3320a.hashCode() * 31;
        f0 f0Var = this.f3321b;
        if (f0Var != null) {
            i10 = f0Var.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = this.f3322c.hashCode();
        int hashCode3 = this.f3323e.hashCode();
        int hashCode4 = this.d.hashCode();
        return this.f3324f.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + i10) * 31)) * 31)) * 31)) * 31);
    }
}
