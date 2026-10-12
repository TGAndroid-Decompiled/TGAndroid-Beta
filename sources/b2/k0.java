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
    public static final k0 f3391g;
    public static final String h;
    public static final String f3392i;
    public static final String f3393j;
    public static final String f3394k;
    public static final String f3395l;
    public static final String f3396m;
    public final String f3397a;
    public final f0 f3398b;
    public final e0 f3399c;
    public final n0 d;
    public final a0 f3400e;
    public final g0 f3401f;

    static {
        y yVar = new y();
        e9.g0 g0Var = e9.i0.f8749b;
        e9.a1 a1Var = e9.a1.f8712e;
        List list = Collections.EMPTY_LIST;
        e9.a1 a1Var2 = e9.a1.f8712e;
        d0 d0Var = new d0();
        f3391g = new k0("", new z(yVar), null, new e0(d0Var), n0.K, g0.d);
        h = Integer.toString(0, 36);
        f3392i = Integer.toString(1, 36);
        f3393j = Integer.toString(2, 36);
        f3394k = Integer.toString(3, 36);
        f3395l = Integer.toString(4, 36);
        f3396m = Integer.toString(5, 36);
    }

    public k0(String str, a0 a0Var, f0 f0Var, e0 e0Var, n0 n0Var, g0 g0Var) {
        this.f3397a = str;
        this.f3398b = f0Var;
        this.f3399c = e0Var;
        this.d = n0Var;
        this.f3400e = a0Var;
        this.f3401f = g0Var;
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
        Bundle bundle2 = bundle.getBundle(f3392i);
        if (bundle2 == null) {
            e0Var = e0.f3281f;
        } else {
            d0 d0Var = new d0();
            String str = e0.f3282g;
            e0 e0Var2 = e0.f3281f;
            d0Var.f3262a = bundle2.getLong(str, e0Var2.f3286a);
            d0Var.f3263b = bundle2.getLong(e0.h, e0Var2.f3287b);
            d0Var.f3264c = bundle2.getLong(e0.f3283i, e0Var2.f3288c);
            d0Var.d = bundle2.getFloat(e0.f3284j, e0Var2.d);
            d0Var.f3265e = bundle2.getFloat(e0.f3285k, e0Var2.f3289e);
            e0Var = new e0(d0Var);
        }
        e0 e0Var3 = e0Var;
        Bundle bundle3 = bundle.getBundle(f3393j);
        if (bundle3 == null) {
            b10 = n0.K;
        } else {
            b10 = n0.b(bundle3);
        }
        n0 n0Var = b10;
        Bundle bundle4 = bundle.getBundle(f3394k);
        if (bundle4 == null) {
            a0Var = a0.f3222r;
        } else {
            y yVar = new y();
            String str2 = z.f3698j;
            z zVar = z.f3697i;
            long j10 = zVar.f3706a;
            long j11 = zVar.d;
            long j12 = zVar.f3707b;
            long P = e2.d0.P(bundle4.getLong(str2, j10));
            boolean z13 = true;
            if (P >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.b(z10);
            yVar.f3691a = P;
            long P2 = e2.d0.P(bundle4.getLong(z.f3699k, zVar.f3708c));
            if (P2 != Long.MIN_VALUE && P2 < 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            e2.d.b(z11);
            yVar.f3692b = P2;
            yVar.f3693c = bundle4.getBoolean(z.f3700l, zVar.f3709e);
            yVar.d = bundle4.getBoolean(z.f3701m, zVar.f3710f);
            yVar.f3694e = bundle4.getBoolean(z.f3702n, zVar.f3711g);
            yVar.f3695f = bundle4.getBoolean(z.f3705q, zVar.h);
            long j13 = bundle4.getLong(z.f3703o, j12);
            if (j13 != j12) {
                if (j13 >= 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                e2.d.b(z12);
                yVar.f3691a = j13;
            }
            long j14 = bundle4.getLong(z.f3704p, j11);
            if (j14 != j11) {
                if (j14 != Long.MIN_VALUE && j14 < 0) {
                    z13 = false;
                }
                e2.d.b(z13);
                yVar.f3692b = j14;
            }
            a0Var = new z(yVar);
        }
        a0 a0Var2 = a0Var;
        Bundle bundle5 = bundle.getBundle(f3395l);
        if (bundle5 == null) {
            g0Var = g0.d;
        } else {
            aa.a aVar = new aa.a(4);
            aVar.f387c = (Uri) bundle5.getParcelable(g0.f3313e);
            aVar.f386b = bundle5.getString(g0.f3314f);
            aVar.d = bundle5.getBundle(g0.f3315g);
            g0Var = new g0(aVar);
        }
        g0 g0Var2 = g0Var;
        Bundle bundle6 = bundle.getBundle(f3396m);
        if (bundle6 == null) {
            f0Var = null;
        } else {
            Bundle bundle7 = bundle6.getBundle(f0.f3297k);
            if (bundle7 == null) {
                c0Var = null;
            } else {
                String string2 = bundle7.getString(c0.f3247i);
                string2.getClass();
                UUID fromString = UUID.fromString(string2);
                Uri uri = (Uri) bundle7.getParcelable(c0.f3248j);
                String str3 = c0.f3249k;
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
                boolean z14 = bundle7.getBoolean(c0.f3250l, false);
                boolean z15 = bundle7.getBoolean(c0.f3251m, false);
                boolean z16 = bundle7.getBoolean(c0.f3252n, false);
                String str5 = c0.f3253o;
                ArrayList<Integer> arrayList = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle7.getIntegerArrayList(str5);
                if (integerArrayList != null) {
                    arrayList = integerArrayList;
                }
                e9.i0 v = e9.i0.v(arrayList);
                byte[] byteArray = bundle7.getByteArray(c0.f3254p);
                b0 b0Var = new b0();
                b0Var.f3241a = fromString;
                b0Var.f3242b = uri;
                b0Var.f3243c = e9.k0.a(a2);
                b0Var.d = z14;
                b0Var.f3245f = z16;
                b0Var.f3244e = z15;
                b0Var.f3246g = e9.i0.v(v);
                if (byteArray != null) {
                    bArr = Arrays.copyOf(byteArray, byteArray.length);
                } else {
                    bArr = null;
                }
                b0Var.h = bArr;
                c0Var = new c0(b0Var);
            }
            Bundle bundle10 = bundle6.getBundle(f0.f3298l);
            if (bundle10 == null) {
                xVar = null;
            } else {
                Uri uri2 = (Uri) bundle10.getParcelable(x.f3680b);
                uri2.getClass();
                ?? obj = new Object();
                obj.f3679a = uri2;
                xVar = new x(obj);
            }
            ArrayList parcelableArrayList = bundle6.getParcelableArrayList(f0.f3299m);
            if (parcelableArrayList == null) {
                e9.g0 g0Var3 = e9.i0.f8749b;
                i10 = e9.a1.f8712e;
            } else {
                e9.f0 u10 = e9.i0.u();
                int i11 = 0;
                while (i11 < parcelableArrayList.size()) {
                    Bundle bundle11 = (Bundle) parcelableArrayList.get(i11);
                    bundle11.getClass();
                    u10.b(new e1(bundle11.getInt(e1.d, 0), bundle11.getInt(e1.f3290e, 0), bundle11.getInt(e1.f3291f, 0)));
                    i11++;
                    parcelableArrayList = parcelableArrayList;
                }
                i10 = u10.i();
            }
            e9.a1 a1Var = i10;
            ArrayList parcelableArrayList2 = bundle6.getParcelableArrayList(f0.f3301o);
            if (parcelableArrayList2 == null) {
                e9.g0 g0Var4 = e9.i0.f8749b;
                j3 = e9.a1.f8712e;
            } else {
                j3 = e2.d.j(new ai.w1(13), parcelableArrayList2);
            }
            e9.a1 a1Var2 = j3;
            long j15 = bundle6.getLong(f0.f3302p, -9223372036854775807L);
            Uri uri3 = (Uri) bundle6.getParcelable(f0.f3295i);
            uri3.getClass();
            f0Var = new f0(uri3, bundle6.getString(f0.f3296j), c0Var, xVar, a1Var, bundle6.getString(f0.f3300n), a1Var2, j15);
        }
        return new k0(string, a0Var2, f0Var, e0Var3, n0Var, g0Var2);
    }

    public static k0 b(Uri uri) {
        boolean z10;
        f0 f0Var;
        y yVar = new y();
        b0 b0Var = new b0();
        List list = Collections.EMPTY_LIST;
        e9.a1 a1Var = e9.a1.f8712e;
        d0 d0Var = new d0();
        g0 g0Var = g0.d;
        if (b0Var.f3242b != null && b0Var.f3241a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        c0 c0Var = null;
        if (uri != null) {
            if (b0Var.f3241a != null) {
                c0Var = new c0(b0Var);
            }
            f0Var = new f0(uri, null, c0Var, null, list, null, a1Var, -9223372036854775807L);
        } else {
            f0Var = null;
        }
        return new k0("", new z(yVar), f0Var, new e0(d0Var), n0.K, g0Var);
    }

    public final Bundle c(boolean z10) {
        f0 f0Var;
        Bundle bundle = new Bundle();
        String str = this.f3397a;
        if (!str.equals("")) {
            bundle.putString(h, str);
        }
        e0 e0Var = e0.f3281f;
        e0 e0Var2 = this.f3399c;
        if (!e0Var2.equals(e0Var)) {
            bundle.putBundle(f3392i, e0Var2.b());
        }
        n0 n0Var = n0.K;
        n0 n0Var2 = this.d;
        if (!n0Var2.equals(n0Var)) {
            bundle.putBundle(f3393j, n0Var2.c());
        }
        z zVar = z.f3697i;
        a0 a0Var = this.f3400e;
        if (!a0Var.equals(zVar)) {
            Bundle bundle2 = new Bundle();
            long j3 = a0Var.f3706a;
            if (j3 != zVar.f3706a) {
                bundle2.putLong(z.f3698j, j3);
            }
            long j10 = a0Var.f3708c;
            if (j10 != zVar.f3708c) {
                bundle2.putLong(z.f3699k, j10);
            }
            long j11 = a0Var.f3707b;
            if (j11 != zVar.f3707b) {
                bundle2.putLong(z.f3703o, j11);
            }
            long j12 = a0Var.d;
            if (j12 != zVar.d) {
                bundle2.putLong(z.f3704p, j12);
            }
            boolean z11 = a0Var.f3709e;
            if (z11 != zVar.f3709e) {
                bundle2.putBoolean(z.f3700l, z11);
            }
            boolean z12 = a0Var.f3710f;
            if (z12 != zVar.f3710f) {
                bundle2.putBoolean(z.f3701m, z12);
            }
            boolean z13 = a0Var.f3711g;
            if (z13 != zVar.f3711g) {
                bundle2.putBoolean(z.f3702n, z13);
            }
            boolean z14 = a0Var.h;
            if (z14 != zVar.h) {
                bundle2.putBoolean(z.f3705q, z14);
            }
            bundle.putBundle(f3394k, bundle2);
        }
        g0 g0Var = g0.d;
        g0 g0Var2 = this.f3401f;
        if (!g0Var2.equals(g0Var)) {
            Bundle bundle3 = new Bundle();
            Uri uri = g0Var2.f3316a;
            if (uri != null) {
                bundle3.putParcelable(g0.f3313e, uri);
            }
            String str2 = g0Var2.f3317b;
            if (str2 != null) {
                bundle3.putString(g0.f3314f, str2);
            }
            Bundle bundle4 = g0Var2.f3318c;
            if (bundle4 != null) {
                bundle3.putBundle(g0.f3315g, bundle4);
            }
            bundle.putBundle(f3395l, bundle3);
        }
        if (z10 && (f0Var = this.f3398b) != null) {
            e9.i0 i0Var = f0Var.f3308g;
            List list = f0Var.f3306e;
            Bundle bundle5 = new Bundle();
            bundle5.putParcelable(f0.f3295i, f0Var.f3303a);
            String str3 = f0Var.f3304b;
            if (str3 != null) {
                bundle5.putString(f0.f3296j, str3);
            }
            c0 c0Var = f0Var.f3305c;
            if (c0Var != null) {
                String str4 = f0.f3297k;
                e9.i0 i0Var2 = c0Var.f3260g;
                e9.k0 k0Var = c0Var.f3257c;
                Bundle bundle6 = new Bundle();
                bundle6.putString(c0.f3247i, c0Var.f3255a.toString());
                Uri uri2 = c0Var.f3256b;
                if (uri2 != null) {
                    bundle6.putParcelable(c0.f3248j, uri2);
                }
                if (!k0Var.isEmpty()) {
                    String str5 = c0.f3249k;
                    Bundle bundle7 = new Bundle();
                    for (Map.Entry entry : k0Var.entrySet()) {
                        bundle7.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                    bundle6.putBundle(str5, bundle7);
                }
                boolean z15 = c0Var.d;
                if (z15) {
                    bundle6.putBoolean(c0.f3250l, z15);
                }
                boolean z16 = c0Var.f3258e;
                if (z16) {
                    bundle6.putBoolean(c0.f3251m, z16);
                }
                boolean z17 = c0Var.f3259f;
                if (z17) {
                    bundle6.putBoolean(c0.f3252n, z17);
                }
                if (!i0Var2.isEmpty()) {
                    bundle6.putIntegerArrayList(c0.f3253o, new ArrayList<>(i0Var2));
                }
                byte[] bArr = c0Var.h;
                if (bArr != null) {
                    bundle6.putByteArray(c0.f3254p, bArr);
                }
                bundle5.putBundle(str4, bundle6);
            }
            x xVar = f0Var.d;
            if (xVar != null) {
                String str6 = f0.f3298l;
                Bundle bundle8 = new Bundle();
                bundle8.putParcelable(x.f3680b, xVar.f3681a);
                bundle5.putBundle(str6, bundle8);
            }
            if (!list.isEmpty()) {
                bundle5.putParcelableArrayList(f0.f3299m, e2.d.p(list, new ai.w1(11)));
            }
            String str7 = f0Var.f3307f;
            if (str7 != null) {
                bundle5.putString(f0.f3300n, str7);
            }
            if (!i0Var.isEmpty()) {
                bundle5.putParcelableArrayList(f0.f3301o, e2.d.p(i0Var, new ai.w1(12)));
            }
            long j13 = f0Var.h;
            if (j13 != -9223372036854775807L) {
                bundle5.putLong(f0.f3302p, j13);
            }
            bundle.putBundle(f3396m, bundle5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k0) {
                k0 k0Var = (k0) obj;
                if (Objects.equals(this.f3397a, k0Var.f3397a) && this.f3400e.equals(k0Var.f3400e) && Objects.equals(this.f3398b, k0Var.f3398b) && Objects.equals(this.f3399c, k0Var.f3399c) && Objects.equals(this.d, k0Var.d) && Objects.equals(this.f3401f, k0Var.f3401f)) {
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
        int hashCode = this.f3397a.hashCode() * 31;
        f0 f0Var = this.f3398b;
        if (f0Var != null) {
            i10 = f0Var.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = this.f3399c.hashCode();
        int hashCode3 = this.f3400e.hashCode();
        int hashCode4 = this.d.hashCode();
        return this.f3401f.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + i10) * 31)) * 31)) * 31)) * 31);
    }
}
