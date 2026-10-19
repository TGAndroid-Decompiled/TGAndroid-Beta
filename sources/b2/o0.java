package b2;

import android.net.Uri;
import android.os.Bundle;
import e9.c2;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import v7.u6;
public final class o0 {
    public static final o0 f3882g;
    public static final String h;
    public static final String f3883i;
    public static final String f3884j;
    public static final String f3885k;
    public static final String f3886l;
    public static final String f3887m;
    public final String f3888a;
    public final j0 f3889b;
    public final i0 f3890c;
    public final r0 d;
    public final e0 e;
    public final k0 f3891f;

    static {
        c0 c0Var = new c0();
        e9.l0 l0Var = e9.n0.f8476b;
        e9.x1 x1Var = e9.x1.e;
        List list = Collections.EMPTY_LIST;
        e9.x1 x1Var2 = e9.x1.e;
        h0 h0Var = new h0();
        f3882g = new o0("", new d0(c0Var), null, new i0(h0Var), r0.L, k0.d);
        h = Integer.toString(0, 36);
        f3883i = Integer.toString(1, 36);
        f3884j = Integer.toString(2, 36);
        f3885k = Integer.toString(3, 36);
        f3886l = Integer.toString(4, 36);
        f3887m = Integer.toString(5, 36);
    }

    public o0(String str, e0 e0Var, j0 j0Var, i0 i0Var, r0 r0Var, k0 k0Var) {
        this.f3888a = str;
        this.f3889b = j0Var;
        this.f3890c = i0Var;
        this.d = r0Var;
        this.e = e0Var;
        this.f3891f = k0Var;
    }

    public static o0 a(int i10, Bundle bundle) {
        i0 i0Var;
        r0 b10;
        boolean z10;
        boolean z11;
        boolean z12;
        e0 e0Var;
        k0 k0Var;
        Map a2;
        byte[] bArr;
        g0 g0Var;
        b0 b0Var;
        e9.x1 f7;
        e9.x1 b11;
        j0 j0Var;
        String string = bundle.getString(h, "");
        string.getClass();
        Bundle bundle2 = bundle.getBundle(f3883i);
        if (bundle2 == null) {
            i0Var = i0.f3778f;
        } else {
            h0 h0Var = new h0();
            String str = i0.f3779g;
            i0 i0Var2 = i0.f3778f;
            h0Var.f3772a = bundle2.getLong(str, i0Var2.f3783a);
            h0Var.f3773b = bundle2.getLong(i0.h, i0Var2.f3784b);
            h0Var.f3774c = bundle2.getLong(i0.f3780i, i0Var2.f3785c);
            h0Var.d = bundle2.getFloat(i0.f3781j, i0Var2.d);
            h0Var.e = bundle2.getFloat(i0.f3782k, i0Var2.e);
            i0Var = new i0(h0Var);
        }
        i0 i0Var3 = i0Var;
        Bundle bundle3 = bundle.getBundle(f3884j);
        if (bundle3 == null) {
            b10 = r0.L;
        } else {
            b10 = r0.b(i10, bundle3);
        }
        r0 r0Var = b10;
        Bundle bundle4 = bundle.getBundle(f3885k);
        if (bundle4 == null) {
            e0Var = e0.f3725r;
        } else {
            c0 c0Var = new c0();
            String str2 = d0.f3712j;
            d0 d0Var = d0.f3711i;
            long j10 = d0Var.f3720a;
            long j11 = d0Var.d;
            long j12 = d0Var.f3721b;
            long S = e2.m0.S(bundle4.getLong(str2, j10));
            boolean z13 = true;
            if (S >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            u6.g(z10);
            c0Var.f3706a = S;
            long S2 = e2.m0.S(bundle4.getLong(d0.f3713k, d0Var.f3722c));
            if (S2 != Long.MIN_VALUE && S2 < 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            u6.g(z11);
            c0Var.f3707b = S2;
            c0Var.f3708c = bundle4.getBoolean(d0.f3714l, d0Var.e);
            c0Var.d = bundle4.getBoolean(d0.f3715m, d0Var.f3723f);
            c0Var.e = bundle4.getBoolean(d0.f3716n, d0Var.f3724g);
            c0Var.f3709f = bundle4.getBoolean(d0.f3719q, d0Var.h);
            long j13 = bundle4.getLong(d0.f3717o, j12);
            if (j13 != j12) {
                if (j13 >= 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                u6.g(z12);
                c0Var.f3706a = j13;
            }
            long j14 = bundle4.getLong(d0.f3718p, j11);
            if (j14 != j11) {
                if (j14 != Long.MIN_VALUE && j14 < 0) {
                    z13 = false;
                }
                u6.g(z13);
                c0Var.f3707b = j14;
            }
            e0Var = new d0(c0Var);
        }
        e0 e0Var2 = e0Var;
        Bundle bundle5 = bundle.getBundle(f3886l);
        if (bundle5 == null) {
            k0Var = k0.d;
        } else {
            androidx.biometric.e eVar = new androidx.biometric.e(3);
            eVar.f2817b = (Uri) bundle5.getParcelable(k0.e);
            eVar.f2818c = bundle5.getString(k0.f3808f);
            eVar.d = e2.m0.o(bundle5.getBundle(k0.f3809g));
            k0Var = new k0(eVar);
        }
        k0 k0Var2 = k0Var;
        Bundle bundle6 = bundle.getBundle(f3887m);
        if (bundle6 == null) {
            j0Var = null;
        } else {
            Bundle bundle7 = bundle6.getBundle(j0.f3793k);
            if (bundle7 == null) {
                g0Var = null;
            } else {
                String string2 = bundle7.getString(g0.f3757i);
                string2.getClass();
                UUID fromString = UUID.fromString(string2);
                Uri uri = (Uri) bundle7.getParcelable(g0.f3758j);
                String str3 = g0.f3759k;
                Bundle bundle8 = Bundle.EMPTY;
                Bundle bundle9 = bundle7.getBundle(str3);
                if (bundle9 == null) {
                    bundle9 = bundle8;
                }
                if (bundle9 == bundle8) {
                    a2 = c2.h;
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
                    a2 = e9.q0.a(hashMap);
                }
                boolean z14 = bundle7.getBoolean(g0.f3760l, false);
                boolean z15 = bundle7.getBoolean(g0.f3761m, false);
                boolean z16 = bundle7.getBoolean(g0.f3762n, false);
                String str5 = g0.f3763o;
                ArrayList<Integer> arrayList = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle7.getIntegerArrayList(str5);
                if (integerArrayList != null) {
                    arrayList = integerArrayList;
                }
                e9.n0 u10 = e9.n0.u(arrayList);
                byte[] byteArray = bundle7.getByteArray(g0.f3764p);
                f0 f0Var = new f0();
                f0Var.f3752a = fromString;
                f0Var.f3753b = uri;
                f0Var.f3754c = e9.q0.a(a2);
                f0Var.d = z14;
                f0Var.f3755f = z16;
                f0Var.e = z15;
                f0Var.f3756g = e9.n0.u(u10);
                if (byteArray != null) {
                    bArr = Arrays.copyOf(byteArray, byteArray.length);
                } else {
                    bArr = null;
                }
                f0Var.h = bArr;
                g0Var = new g0(f0Var);
            }
            Bundle bundle10 = bundle6.getBundle(j0.f3794l);
            if (bundle10 == null) {
                b0Var = null;
            } else {
                Uri uri2 = (Uri) bundle10.getParcelable(b0.f3698b);
                uri2.getClass();
                ?? obj = new Object();
                obj.f3692a = uri2;
                b0Var = new b0(obj);
            }
            ArrayList parcelableArrayList = bundle6.getParcelableArrayList(j0.f3795m);
            if (parcelableArrayList == null) {
                e9.l0 l0Var = e9.n0.f8476b;
                f7 = e9.x1.e;
            } else {
                e9.k0 t10 = e9.n0.t();
                int i11 = 0;
                while (i11 < parcelableArrayList.size()) {
                    Bundle bundle11 = (Bundle) parcelableArrayList.get(i11);
                    bundle11.getClass();
                    t10.c(new i1(bundle11.getInt(i1.d, 0), bundle11.getInt(i1.e, 0), bundle11.getInt(i1.f3786f, 0)));
                    i11++;
                    parcelableArrayList = parcelableArrayList;
                }
                f7 = t10.f();
            }
            e9.x1 x1Var = f7;
            ArrayList parcelableArrayList2 = bundle6.getParcelableArrayList(j0.f3797o);
            if (parcelableArrayList2 == null) {
                e9.l0 l0Var2 = e9.n0.f8476b;
                b11 = e9.x1.e;
            } else {
                b11 = e2.e.b(new aa.a(22), parcelableArrayList2);
            }
            e9.x1 x1Var2 = b11;
            long j15 = bundle6.getLong(j0.f3798p, -9223372036854775807L);
            Uri uri3 = (Uri) bundle6.getParcelable(j0.f3791i);
            uri3.getClass();
            j0Var = new j0(uri3, bundle6.getString(j0.f3792j), g0Var, b0Var, x1Var, bundle6.getString(j0.f3796n), x1Var2, j15);
        }
        return new o0(string, e0Var2, j0Var, i0Var3, r0Var, k0Var2);
    }

    public static o0 b(Uri uri) {
        boolean z10;
        j0 j0Var;
        c0 c0Var = new c0();
        f0 f0Var = new f0();
        List list = Collections.EMPTY_LIST;
        e9.x1 x1Var = e9.x1.e;
        h0 h0Var = new h0();
        k0 k0Var = k0.d;
        if (f0Var.f3753b != null && f0Var.f3752a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        u6.p(z10);
        g0 g0Var = null;
        if (uri != null) {
            if (f0Var.f3752a != null) {
                g0Var = new g0(f0Var);
            }
            j0Var = new j0(uri, null, g0Var, null, list, null, x1Var, -9223372036854775807L);
        } else {
            j0Var = null;
        }
        return new o0("", new d0(c0Var), j0Var, new i0(h0Var), r0.L, k0Var);
    }

    public final Bundle c(int i10, boolean z10) {
        j0 j0Var;
        Bundle bundle = new Bundle();
        String str = this.f3888a;
        if (!str.equals("")) {
            bundle.putString(h, str);
        }
        i0 i0Var = i0.f3778f;
        i0 i0Var2 = this.f3890c;
        if (!i0Var2.equals(i0Var)) {
            bundle.putBundle(f3883i, i0Var2.b());
        }
        r0 r0Var = r0.L;
        r0 r0Var2 = this.d;
        if (!r0Var2.equals(r0Var)) {
            bundle.putBundle(f3884j, r0Var2.c(i10));
        }
        d0 d0Var = d0.f3711i;
        e0 e0Var = this.e;
        if (!e0Var.equals(d0Var)) {
            Bundle bundle2 = new Bundle();
            long j10 = e0Var.f3720a;
            if (j10 != d0Var.f3720a) {
                bundle2.putLong(d0.f3712j, j10);
            }
            long j11 = e0Var.f3722c;
            if (j11 != d0Var.f3722c) {
                bundle2.putLong(d0.f3713k, j11);
            }
            long j12 = e0Var.f3721b;
            if (j12 != d0Var.f3721b) {
                bundle2.putLong(d0.f3717o, j12);
            }
            long j13 = e0Var.d;
            if (j13 != d0Var.d) {
                bundle2.putLong(d0.f3718p, j13);
            }
            boolean z11 = e0Var.e;
            if (z11 != d0Var.e) {
                bundle2.putBoolean(d0.f3714l, z11);
            }
            boolean z12 = e0Var.f3723f;
            if (z12 != d0Var.f3723f) {
                bundle2.putBoolean(d0.f3715m, z12);
            }
            boolean z13 = e0Var.f3724g;
            if (z13 != d0Var.f3724g) {
                bundle2.putBoolean(d0.f3716n, z13);
            }
            boolean z14 = e0Var.h;
            if (z14 != d0Var.h) {
                bundle2.putBoolean(d0.f3719q, z14);
            }
            bundle.putBundle(f3885k, bundle2);
        }
        k0 k0Var = k0.d;
        k0 k0Var2 = this.f3891f;
        if (!k0Var2.equals(k0Var)) {
            Bundle bundle3 = new Bundle();
            Uri uri = k0Var2.f3810a;
            if (uri != null) {
                bundle3.putParcelable(k0.e, uri);
            }
            String str2 = k0Var2.f3811b;
            if (str2 != null) {
                bundle3.putString(k0.f3808f, str2);
            }
            Bundle bundle4 = k0Var2.f3812c;
            if (bundle4 != null) {
                bundle3.putBundle(k0.f3809g, bundle4);
            }
            bundle.putBundle(f3886l, bundle3);
        }
        if (z10 && (j0Var = this.f3889b) != null) {
            e9.n0 n0Var = j0Var.f3803g;
            List list = j0Var.e;
            Bundle bundle5 = new Bundle();
            bundle5.putParcelable(j0.f3791i, j0Var.f3799a);
            String str3 = j0Var.f3800b;
            if (str3 != null) {
                bundle5.putString(j0.f3792j, str3);
            }
            g0 g0Var = j0Var.f3801c;
            if (g0Var != null) {
                String str4 = j0.f3793k;
                e9.n0 n0Var2 = g0Var.f3769g;
                e9.q0 q0Var = g0Var.f3767c;
                Bundle bundle6 = new Bundle();
                bundle6.putString(g0.f3757i, g0Var.f3765a.toString());
                Uri uri2 = g0Var.f3766b;
                if (uri2 != null) {
                    bundle6.putParcelable(g0.f3758j, uri2);
                }
                if (!q0Var.isEmpty()) {
                    String str5 = g0.f3759k;
                    Bundle bundle7 = new Bundle();
                    for (Map.Entry entry : q0Var.entrySet()) {
                        bundle7.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                    bundle6.putBundle(str5, bundle7);
                }
                boolean z15 = g0Var.d;
                if (z15) {
                    bundle6.putBoolean(g0.f3760l, z15);
                }
                boolean z16 = g0Var.e;
                if (z16) {
                    bundle6.putBoolean(g0.f3761m, z16);
                }
                boolean z17 = g0Var.f3768f;
                if (z17) {
                    bundle6.putBoolean(g0.f3762n, z17);
                }
                if (!n0Var2.isEmpty()) {
                    bundle6.putIntegerArrayList(g0.f3763o, new ArrayList<>(n0Var2));
                }
                byte[] bArr = g0Var.h;
                if (bArr != null) {
                    bundle6.putByteArray(g0.f3764p, bArr);
                }
                bundle5.putBundle(str4, bundle6);
            }
            b0 b0Var = j0Var.d;
            if (b0Var != null) {
                String str6 = j0.f3794l;
                Bundle bundle8 = new Bundle();
                bundle8.putParcelable(b0.f3698b, b0Var.f3699a);
                bundle5.putBundle(str6, bundle8);
            }
            if (!list.isEmpty()) {
                bundle5.putParcelableArrayList(j0.f3795m, e2.e.h(list, new aa.a(20)));
            }
            String str7 = j0Var.f3802f;
            if (str7 != null) {
                bundle5.putString(j0.f3796n, str7);
            }
            if (!n0Var.isEmpty()) {
                bundle5.putParcelableArrayList(j0.f3797o, e2.e.h(n0Var, new aa.a(21)));
            }
            long j14 = j0Var.h;
            if (j14 != -9223372036854775807L) {
                bundle5.putLong(j0.f3798p, j14);
            }
            bundle.putBundle(f3887m, bundle5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof o0) {
                o0 o0Var = (o0) obj;
                if (Objects.equals(this.f3888a, o0Var.f3888a) && this.e.equals(o0Var.e) && Objects.equals(this.f3889b, o0Var.f3889b) && Objects.equals(this.f3890c, o0Var.f3890c) && Objects.equals(this.d, o0Var.d) && Objects.equals(this.f3891f, o0Var.f3891f)) {
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
        int hashCode = this.f3888a.hashCode() * 31;
        j0 j0Var = this.f3889b;
        if (j0Var != null) {
            i10 = j0Var.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = this.f3890c.hashCode();
        int hashCode3 = this.e.hashCode();
        int hashCode4 = this.d.hashCode();
        return this.f3891f.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + i10) * 31)) * 31)) * 31)) * 31);
    }
}
