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
    public static final o0 f3887g;
    public static final String h;
    public static final String f3888i;
    public static final String f3889j;
    public static final String f3890k;
    public static final String f3891l;
    public static final String f3892m;
    public final String f3893a;
    public final j0 f3894b;
    public final i0 f3895c;
    public final r0 d;
    public final e0 e;
    public final k0 f3896f;

    static {
        c0 c0Var = new c0();
        e9.l0 l0Var = e9.n0.f8481b;
        e9.x1 x1Var = e9.x1.e;
        List list = Collections.EMPTY_LIST;
        e9.x1 x1Var2 = e9.x1.e;
        h0 h0Var = new h0();
        f3887g = new o0("", new d0(c0Var), null, new i0(h0Var), r0.L, k0.d);
        h = Integer.toString(0, 36);
        f3888i = Integer.toString(1, 36);
        f3889j = Integer.toString(2, 36);
        f3890k = Integer.toString(3, 36);
        f3891l = Integer.toString(4, 36);
        f3892m = Integer.toString(5, 36);
    }

    public o0(String str, e0 e0Var, j0 j0Var, i0 i0Var, r0 r0Var, k0 k0Var) {
        this.f3893a = str;
        this.f3894b = j0Var;
        this.f3895c = i0Var;
        this.d = r0Var;
        this.e = e0Var;
        this.f3896f = k0Var;
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
        Bundle bundle2 = bundle.getBundle(f3888i);
        if (bundle2 == null) {
            i0Var = i0.f3783f;
        } else {
            h0 h0Var = new h0();
            String str = i0.f3784g;
            i0 i0Var2 = i0.f3783f;
            h0Var.f3777a = bundle2.getLong(str, i0Var2.f3788a);
            h0Var.f3778b = bundle2.getLong(i0.h, i0Var2.f3789b);
            h0Var.f3779c = bundle2.getLong(i0.f3785i, i0Var2.f3790c);
            h0Var.d = bundle2.getFloat(i0.f3786j, i0Var2.d);
            h0Var.e = bundle2.getFloat(i0.f3787k, i0Var2.e);
            i0Var = new i0(h0Var);
        }
        i0 i0Var3 = i0Var;
        Bundle bundle3 = bundle.getBundle(f3889j);
        if (bundle3 == null) {
            b10 = r0.L;
        } else {
            b10 = r0.b(i10, bundle3);
        }
        r0 r0Var = b10;
        Bundle bundle4 = bundle.getBundle(f3890k);
        if (bundle4 == null) {
            e0Var = e0.f3730r;
        } else {
            c0 c0Var = new c0();
            String str2 = d0.f3717j;
            d0 d0Var = d0.f3716i;
            long j10 = d0Var.f3725a;
            long j11 = d0Var.d;
            long j12 = d0Var.f3726b;
            long S = e2.m0.S(bundle4.getLong(str2, j10));
            boolean z13 = true;
            if (S >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            u6.g(z10);
            c0Var.f3711a = S;
            long S2 = e2.m0.S(bundle4.getLong(d0.f3718k, d0Var.f3727c));
            if (S2 != Long.MIN_VALUE && S2 < 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            u6.g(z11);
            c0Var.f3712b = S2;
            c0Var.f3713c = bundle4.getBoolean(d0.f3719l, d0Var.e);
            c0Var.d = bundle4.getBoolean(d0.f3720m, d0Var.f3728f);
            c0Var.e = bundle4.getBoolean(d0.f3721n, d0Var.f3729g);
            c0Var.f3714f = bundle4.getBoolean(d0.f3724q, d0Var.h);
            long j13 = bundle4.getLong(d0.f3722o, j12);
            if (j13 != j12) {
                if (j13 >= 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                u6.g(z12);
                c0Var.f3711a = j13;
            }
            long j14 = bundle4.getLong(d0.f3723p, j11);
            if (j14 != j11) {
                if (j14 != Long.MIN_VALUE && j14 < 0) {
                    z13 = false;
                }
                u6.g(z13);
                c0Var.f3712b = j14;
            }
            e0Var = new d0(c0Var);
        }
        e0 e0Var2 = e0Var;
        Bundle bundle5 = bundle.getBundle(f3891l);
        if (bundle5 == null) {
            k0Var = k0.d;
        } else {
            androidx.biometric.e eVar = new androidx.biometric.e(3);
            eVar.f2822b = (Uri) bundle5.getParcelable(k0.e);
            eVar.f2823c = bundle5.getString(k0.f3813f);
            eVar.d = e2.m0.o(bundle5.getBundle(k0.f3814g));
            k0Var = new k0(eVar);
        }
        k0 k0Var2 = k0Var;
        Bundle bundle6 = bundle.getBundle(f3892m);
        if (bundle6 == null) {
            j0Var = null;
        } else {
            Bundle bundle7 = bundle6.getBundle(j0.f3798k);
            if (bundle7 == null) {
                g0Var = null;
            } else {
                String string2 = bundle7.getString(g0.f3762i);
                string2.getClass();
                UUID fromString = UUID.fromString(string2);
                Uri uri = (Uri) bundle7.getParcelable(g0.f3763j);
                String str3 = g0.f3764k;
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
                boolean z14 = bundle7.getBoolean(g0.f3765l, false);
                boolean z15 = bundle7.getBoolean(g0.f3766m, false);
                boolean z16 = bundle7.getBoolean(g0.f3767n, false);
                String str5 = g0.f3768o;
                ArrayList<Integer> arrayList = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle7.getIntegerArrayList(str5);
                if (integerArrayList != null) {
                    arrayList = integerArrayList;
                }
                e9.n0 u10 = e9.n0.u(arrayList);
                byte[] byteArray = bundle7.getByteArray(g0.f3769p);
                f0 f0Var = new f0();
                f0Var.f3757a = fromString;
                f0Var.f3758b = uri;
                f0Var.f3759c = e9.q0.a(a2);
                f0Var.d = z14;
                f0Var.f3760f = z16;
                f0Var.e = z15;
                f0Var.f3761g = e9.n0.u(u10);
                if (byteArray != null) {
                    bArr = Arrays.copyOf(byteArray, byteArray.length);
                } else {
                    bArr = null;
                }
                f0Var.h = bArr;
                g0Var = new g0(f0Var);
            }
            Bundle bundle10 = bundle6.getBundle(j0.f3799l);
            if (bundle10 == null) {
                b0Var = null;
            } else {
                Uri uri2 = (Uri) bundle10.getParcelable(b0.f3703b);
                uri2.getClass();
                ?? obj = new Object();
                obj.f3697a = uri2;
                b0Var = new b0(obj);
            }
            ArrayList parcelableArrayList = bundle6.getParcelableArrayList(j0.f3800m);
            if (parcelableArrayList == null) {
                e9.l0 l0Var = e9.n0.f8481b;
                f7 = e9.x1.e;
            } else {
                e9.k0 t10 = e9.n0.t();
                int i11 = 0;
                while (i11 < parcelableArrayList.size()) {
                    Bundle bundle11 = (Bundle) parcelableArrayList.get(i11);
                    bundle11.getClass();
                    t10.c(new i1(bundle11.getInt(i1.d, 0), bundle11.getInt(i1.e, 0), bundle11.getInt(i1.f3791f, 0)));
                    i11++;
                    parcelableArrayList = parcelableArrayList;
                }
                f7 = t10.f();
            }
            e9.x1 x1Var = f7;
            ArrayList parcelableArrayList2 = bundle6.getParcelableArrayList(j0.f3802o);
            if (parcelableArrayList2 == null) {
                e9.l0 l0Var2 = e9.n0.f8481b;
                b11 = e9.x1.e;
            } else {
                b11 = e2.e.b(new aa.a(24), parcelableArrayList2);
            }
            e9.x1 x1Var2 = b11;
            long j15 = bundle6.getLong(j0.f3803p, -9223372036854775807L);
            Uri uri3 = (Uri) bundle6.getParcelable(j0.f3796i);
            uri3.getClass();
            j0Var = new j0(uri3, bundle6.getString(j0.f3797j), g0Var, b0Var, x1Var, bundle6.getString(j0.f3801n), x1Var2, j15);
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
        if (f0Var.f3758b != null && f0Var.f3757a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        u6.p(z10);
        g0 g0Var = null;
        if (uri != null) {
            if (f0Var.f3757a != null) {
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
        String str = this.f3893a;
        if (!str.equals("")) {
            bundle.putString(h, str);
        }
        i0 i0Var = i0.f3783f;
        i0 i0Var2 = this.f3895c;
        if (!i0Var2.equals(i0Var)) {
            bundle.putBundle(f3888i, i0Var2.b());
        }
        r0 r0Var = r0.L;
        r0 r0Var2 = this.d;
        if (!r0Var2.equals(r0Var)) {
            bundle.putBundle(f3889j, r0Var2.c(i10));
        }
        d0 d0Var = d0.f3716i;
        e0 e0Var = this.e;
        if (!e0Var.equals(d0Var)) {
            Bundle bundle2 = new Bundle();
            long j10 = e0Var.f3725a;
            if (j10 != d0Var.f3725a) {
                bundle2.putLong(d0.f3717j, j10);
            }
            long j11 = e0Var.f3727c;
            if (j11 != d0Var.f3727c) {
                bundle2.putLong(d0.f3718k, j11);
            }
            long j12 = e0Var.f3726b;
            if (j12 != d0Var.f3726b) {
                bundle2.putLong(d0.f3722o, j12);
            }
            long j13 = e0Var.d;
            if (j13 != d0Var.d) {
                bundle2.putLong(d0.f3723p, j13);
            }
            boolean z11 = e0Var.e;
            if (z11 != d0Var.e) {
                bundle2.putBoolean(d0.f3719l, z11);
            }
            boolean z12 = e0Var.f3728f;
            if (z12 != d0Var.f3728f) {
                bundle2.putBoolean(d0.f3720m, z12);
            }
            boolean z13 = e0Var.f3729g;
            if (z13 != d0Var.f3729g) {
                bundle2.putBoolean(d0.f3721n, z13);
            }
            boolean z14 = e0Var.h;
            if (z14 != d0Var.h) {
                bundle2.putBoolean(d0.f3724q, z14);
            }
            bundle.putBundle(f3890k, bundle2);
        }
        k0 k0Var = k0.d;
        k0 k0Var2 = this.f3896f;
        if (!k0Var2.equals(k0Var)) {
            Bundle bundle3 = new Bundle();
            Uri uri = k0Var2.f3815a;
            if (uri != null) {
                bundle3.putParcelable(k0.e, uri);
            }
            String str2 = k0Var2.f3816b;
            if (str2 != null) {
                bundle3.putString(k0.f3813f, str2);
            }
            Bundle bundle4 = k0Var2.f3817c;
            if (bundle4 != null) {
                bundle3.putBundle(k0.f3814g, bundle4);
            }
            bundle.putBundle(f3891l, bundle3);
        }
        if (z10 && (j0Var = this.f3894b) != null) {
            e9.n0 n0Var = j0Var.f3808g;
            List list = j0Var.e;
            Bundle bundle5 = new Bundle();
            bundle5.putParcelable(j0.f3796i, j0Var.f3804a);
            String str3 = j0Var.f3805b;
            if (str3 != null) {
                bundle5.putString(j0.f3797j, str3);
            }
            g0 g0Var = j0Var.f3806c;
            if (g0Var != null) {
                String str4 = j0.f3798k;
                e9.n0 n0Var2 = g0Var.f3774g;
                e9.q0 q0Var = g0Var.f3772c;
                Bundle bundle6 = new Bundle();
                bundle6.putString(g0.f3762i, g0Var.f3770a.toString());
                Uri uri2 = g0Var.f3771b;
                if (uri2 != null) {
                    bundle6.putParcelable(g0.f3763j, uri2);
                }
                if (!q0Var.isEmpty()) {
                    String str5 = g0.f3764k;
                    Bundle bundle7 = new Bundle();
                    for (Map.Entry entry : q0Var.entrySet()) {
                        bundle7.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                    bundle6.putBundle(str5, bundle7);
                }
                boolean z15 = g0Var.d;
                if (z15) {
                    bundle6.putBoolean(g0.f3765l, z15);
                }
                boolean z16 = g0Var.e;
                if (z16) {
                    bundle6.putBoolean(g0.f3766m, z16);
                }
                boolean z17 = g0Var.f3773f;
                if (z17) {
                    bundle6.putBoolean(g0.f3767n, z17);
                }
                if (!n0Var2.isEmpty()) {
                    bundle6.putIntegerArrayList(g0.f3768o, new ArrayList<>(n0Var2));
                }
                byte[] bArr = g0Var.h;
                if (bArr != null) {
                    bundle6.putByteArray(g0.f3769p, bArr);
                }
                bundle5.putBundle(str4, bundle6);
            }
            b0 b0Var = j0Var.d;
            if (b0Var != null) {
                String str6 = j0.f3799l;
                Bundle bundle8 = new Bundle();
                bundle8.putParcelable(b0.f3703b, b0Var.f3704a);
                bundle5.putBundle(str6, bundle8);
            }
            if (!list.isEmpty()) {
                bundle5.putParcelableArrayList(j0.f3800m, e2.e.h(list, new aa.a(22)));
            }
            String str7 = j0Var.f3807f;
            if (str7 != null) {
                bundle5.putString(j0.f3801n, str7);
            }
            if (!n0Var.isEmpty()) {
                bundle5.putParcelableArrayList(j0.f3802o, e2.e.h(n0Var, new aa.a(23)));
            }
            long j14 = j0Var.h;
            if (j14 != -9223372036854775807L) {
                bundle5.putLong(j0.f3803p, j14);
            }
            bundle.putBundle(f3892m, bundle5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof o0) {
                o0 o0Var = (o0) obj;
                if (Objects.equals(this.f3893a, o0Var.f3893a) && this.e.equals(o0Var.e) && Objects.equals(this.f3894b, o0Var.f3894b) && Objects.equals(this.f3895c, o0Var.f3895c) && Objects.equals(this.d, o0Var.d) && Objects.equals(this.f3896f, o0Var.f3896f)) {
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
        int hashCode = this.f3893a.hashCode() * 31;
        j0 j0Var = this.f3894b;
        if (j0Var != null) {
            i10 = j0Var.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = this.f3895c.hashCode();
        int hashCode3 = this.e.hashCode();
        int hashCode4 = this.d.hashCode();
        return this.f3896f.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + i10) * 31)) * 31)) * 31)) * 31);
    }
}
