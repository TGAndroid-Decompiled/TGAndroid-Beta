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
    public static final k0 f3068g;
    public static final String h;
    public static final String f3069i;
    public static final String f3070j;
    public static final String f3071k;
    public static final String f3072l;
    public static final String f3073m;
    public final String f3074a;
    public final f0 f3075b;
    public final e0 f3076c;
    public final n0 d;
    public final a0 e;
    public final g0 f3077f;

    static {
        y yVar = new y();
        e9.g0 g0Var = e9.i0.f8081b;
        e9.a1 a1Var = e9.a1.e;
        List list = Collections.EMPTY_LIST;
        e9.a1 a1Var2 = e9.a1.e;
        d0 d0Var = new d0();
        f3068g = new k0("", new z(yVar), null, new e0(d0Var), n0.K, g0.d);
        h = Integer.toString(0, 36);
        f3069i = Integer.toString(1, 36);
        f3070j = Integer.toString(2, 36);
        f3071k = Integer.toString(3, 36);
        f3072l = Integer.toString(4, 36);
        f3073m = Integer.toString(5, 36);
    }

    public k0(String str, a0 a0Var, f0 f0Var, e0 e0Var, n0 n0Var, g0 g0Var) {
        this.f3074a = str;
        this.f3075b = f0Var;
        this.f3076c = e0Var;
        this.d = n0Var;
        this.e = a0Var;
        this.f3077f = g0Var;
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
        Bundle bundle2 = bundle.getBundle(f3069i);
        if (bundle2 == null) {
            e0Var = e0.f2970f;
        } else {
            d0 d0Var = new d0();
            String str = e0.f2971g;
            e0 e0Var2 = e0.f2970f;
            d0Var.f2954a = bundle2.getLong(str, e0Var2.f2975a);
            d0Var.f2955b = bundle2.getLong(e0.h, e0Var2.f2976b);
            d0Var.f2956c = bundle2.getLong(e0.f2972i, e0Var2.f2977c);
            d0Var.d = bundle2.getFloat(e0.f2973j, e0Var2.d);
            d0Var.e = bundle2.getFloat(e0.f2974k, e0Var2.e);
            e0Var = new e0(d0Var);
        }
        e0 e0Var3 = e0Var;
        Bundle bundle3 = bundle.getBundle(f3070j);
        if (bundle3 == null) {
            b10 = n0.K;
        } else {
            b10 = n0.b(bundle3);
        }
        n0 n0Var = b10;
        Bundle bundle4 = bundle.getBundle(f3071k);
        if (bundle4 == null) {
            a0Var = a0.f2918r;
        } else {
            y yVar = new y();
            String str2 = z.f3358j;
            z zVar = z.f3357i;
            long j10 = zVar.f3366a;
            long j11 = zVar.d;
            long j12 = zVar.f3367b;
            long Q = e2.d0.Q(bundle4.getLong(str2, j10));
            boolean z13 = true;
            if (Q >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.b(z10);
            yVar.f3352a = Q;
            long Q2 = e2.d0.Q(bundle4.getLong(z.f3359k, zVar.f3368c));
            if (Q2 != Long.MIN_VALUE && Q2 < 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            e2.d.b(z11);
            yVar.f3353b = Q2;
            yVar.f3354c = bundle4.getBoolean(z.f3360l, zVar.e);
            yVar.d = bundle4.getBoolean(z.f3361m, zVar.f3369f);
            yVar.e = bundle4.getBoolean(z.f3362n, zVar.f3370g);
            yVar.f3355f = bundle4.getBoolean(z.f3365q, zVar.h);
            long j13 = bundle4.getLong(z.f3363o, j12);
            if (j13 != j12) {
                if (j13 >= 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                e2.d.b(z12);
                yVar.f3352a = j13;
            }
            long j14 = bundle4.getLong(z.f3364p, j11);
            if (j14 != j11) {
                if (j14 != Long.MIN_VALUE && j14 < 0) {
                    z13 = false;
                }
                e2.d.b(z13);
                yVar.f3353b = j14;
            }
            a0Var = new z(yVar);
        }
        a0 a0Var2 = a0Var;
        Bundle bundle5 = bundle.getBundle(f3072l);
        if (bundle5 == null) {
            g0Var = g0.d;
        } else {
            aa.a aVar = new aa.a(4);
            aVar.f360c = (Uri) bundle5.getParcelable(g0.e);
            aVar.f359b = bundle5.getString(g0.f2998f);
            aVar.d = bundle5.getBundle(g0.f2999g);
            g0Var = new g0(aVar);
        }
        g0 g0Var2 = g0Var;
        Bundle bundle6 = bundle.getBundle(f3073m);
        if (bundle6 == null) {
            f0Var = null;
        } else {
            Bundle bundle7 = bundle6.getBundle(f0.f2984k);
            if (bundle7 == null) {
                c0Var = null;
            } else {
                String string2 = bundle7.getString(c0.f2940i);
                string2.getClass();
                UUID fromString = UUID.fromString(string2);
                Uri uri = (Uri) bundle7.getParcelable(c0.f2941j);
                String str3 = c0.f2942k;
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
                boolean z14 = bundle7.getBoolean(c0.f2943l, false);
                boolean z15 = bundle7.getBoolean(c0.f2944m, false);
                boolean z16 = bundle7.getBoolean(c0.f2945n, false);
                String str5 = c0.f2946o;
                ArrayList<Integer> arrayList = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle7.getIntegerArrayList(str5);
                if (integerArrayList != null) {
                    arrayList = integerArrayList;
                }
                e9.i0 v = e9.i0.v(arrayList);
                byte[] byteArray = bundle7.getByteArray(c0.f2947p);
                b0 b0Var = new b0();
                b0Var.f2935a = fromString;
                b0Var.f2936b = uri;
                b0Var.f2937c = e9.k0.a(a2);
                b0Var.d = z14;
                b0Var.f2938f = z16;
                b0Var.e = z15;
                b0Var.f2939g = e9.i0.v(v);
                if (byteArray != null) {
                    bArr = Arrays.copyOf(byteArray, byteArray.length);
                } else {
                    bArr = null;
                }
                b0Var.h = bArr;
                c0Var = new c0(b0Var);
            }
            Bundle bundle10 = bundle6.getBundle(f0.f2985l);
            if (bundle10 == null) {
                xVar = null;
            } else {
                Uri uri2 = (Uri) bundle10.getParcelable(x.f3342b);
                uri2.getClass();
                ?? obj = new Object();
                obj.f3341a = uri2;
                xVar = new x(obj);
            }
            ArrayList parcelableArrayList = bundle6.getParcelableArrayList(f0.f2986m);
            if (parcelableArrayList == null) {
                e9.g0 g0Var3 = e9.i0.f8081b;
                i10 = e9.a1.e;
            } else {
                e9.f0 u10 = e9.i0.u();
                int i11 = 0;
                while (i11 < parcelableArrayList.size()) {
                    Bundle bundle11 = (Bundle) parcelableArrayList.get(i11);
                    bundle11.getClass();
                    u10.b(new e1(bundle11.getInt(e1.d, 0), bundle11.getInt(e1.e, 0), bundle11.getInt(e1.f2978f, 0)));
                    i11++;
                    parcelableArrayList = parcelableArrayList;
                }
                i10 = u10.i();
            }
            e9.a1 a1Var = i10;
            ArrayList parcelableArrayList2 = bundle6.getParcelableArrayList(f0.f2988o);
            if (parcelableArrayList2 == null) {
                e9.g0 g0Var4 = e9.i0.f8081b;
                j3 = e9.a1.e;
            } else {
                j3 = e2.d.j(new ai.w1(13), parcelableArrayList2);
            }
            e9.a1 a1Var2 = j3;
            long j15 = bundle6.getLong(f0.f2989p, -9223372036854775807L);
            Uri uri3 = (Uri) bundle6.getParcelable(f0.f2982i);
            uri3.getClass();
            f0Var = new f0(uri3, bundle6.getString(f0.f2983j), c0Var, xVar, a1Var, bundle6.getString(f0.f2987n), a1Var2, j15);
        }
        return new k0(string, a0Var2, f0Var, e0Var3, n0Var, g0Var2);
    }

    public final Bundle b(boolean z10) {
        f0 f0Var;
        Bundle bundle = new Bundle();
        String str = this.f3074a;
        if (!str.equals("")) {
            bundle.putString(h, str);
        }
        e0 e0Var = e0.f2970f;
        e0 e0Var2 = this.f3076c;
        if (!e0Var2.equals(e0Var)) {
            bundle.putBundle(f3069i, e0Var2.b());
        }
        n0 n0Var = n0.K;
        n0 n0Var2 = this.d;
        if (!n0Var2.equals(n0Var)) {
            bundle.putBundle(f3070j, n0Var2.c());
        }
        z zVar = z.f3357i;
        a0 a0Var = this.e;
        if (!a0Var.equals(zVar)) {
            Bundle bundle2 = new Bundle();
            long j3 = a0Var.f3366a;
            if (j3 != zVar.f3366a) {
                bundle2.putLong(z.f3358j, j3);
            }
            long j10 = a0Var.f3368c;
            if (j10 != zVar.f3368c) {
                bundle2.putLong(z.f3359k, j10);
            }
            long j11 = a0Var.f3367b;
            if (j11 != zVar.f3367b) {
                bundle2.putLong(z.f3363o, j11);
            }
            long j12 = a0Var.d;
            if (j12 != zVar.d) {
                bundle2.putLong(z.f3364p, j12);
            }
            boolean z11 = a0Var.e;
            if (z11 != zVar.e) {
                bundle2.putBoolean(z.f3360l, z11);
            }
            boolean z12 = a0Var.f3369f;
            if (z12 != zVar.f3369f) {
                bundle2.putBoolean(z.f3361m, z12);
            }
            boolean z13 = a0Var.f3370g;
            if (z13 != zVar.f3370g) {
                bundle2.putBoolean(z.f3362n, z13);
            }
            boolean z14 = a0Var.h;
            if (z14 != zVar.h) {
                bundle2.putBoolean(z.f3365q, z14);
            }
            bundle.putBundle(f3071k, bundle2);
        }
        g0 g0Var = g0.d;
        g0 g0Var2 = this.f3077f;
        if (!g0Var2.equals(g0Var)) {
            Bundle bundle3 = new Bundle();
            Uri uri = g0Var2.f3000a;
            if (uri != null) {
                bundle3.putParcelable(g0.e, uri);
            }
            String str2 = g0Var2.f3001b;
            if (str2 != null) {
                bundle3.putString(g0.f2998f, str2);
            }
            Bundle bundle4 = g0Var2.f3002c;
            if (bundle4 != null) {
                bundle3.putBundle(g0.f2999g, bundle4);
            }
            bundle.putBundle(f3072l, bundle3);
        }
        if (z10 && (f0Var = this.f3075b) != null) {
            e9.i0 i0Var = f0Var.f2994g;
            List list = f0Var.e;
            Bundle bundle5 = new Bundle();
            bundle5.putParcelable(f0.f2982i, f0Var.f2990a);
            String str3 = f0Var.f2991b;
            if (str3 != null) {
                bundle5.putString(f0.f2983j, str3);
            }
            c0 c0Var = f0Var.f2992c;
            if (c0Var != null) {
                String str4 = f0.f2984k;
                e9.i0 i0Var2 = c0Var.f2952g;
                e9.k0 k0Var = c0Var.f2950c;
                Bundle bundle6 = new Bundle();
                bundle6.putString(c0.f2940i, c0Var.f2948a.toString());
                Uri uri2 = c0Var.f2949b;
                if (uri2 != null) {
                    bundle6.putParcelable(c0.f2941j, uri2);
                }
                if (!k0Var.isEmpty()) {
                    String str5 = c0.f2942k;
                    Bundle bundle7 = new Bundle();
                    for (Map.Entry entry : k0Var.entrySet()) {
                        bundle7.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                    bundle6.putBundle(str5, bundle7);
                }
                boolean z15 = c0Var.d;
                if (z15) {
                    bundle6.putBoolean(c0.f2943l, z15);
                }
                boolean z16 = c0Var.e;
                if (z16) {
                    bundle6.putBoolean(c0.f2944m, z16);
                }
                boolean z17 = c0Var.f2951f;
                if (z17) {
                    bundle6.putBoolean(c0.f2945n, z17);
                }
                if (!i0Var2.isEmpty()) {
                    bundle6.putIntegerArrayList(c0.f2946o, new ArrayList<>(i0Var2));
                }
                byte[] bArr = c0Var.h;
                if (bArr != null) {
                    bundle6.putByteArray(c0.f2947p, bArr);
                }
                bundle5.putBundle(str4, bundle6);
            }
            x xVar = f0Var.d;
            if (xVar != null) {
                String str6 = f0.f2985l;
                Bundle bundle8 = new Bundle();
                bundle8.putParcelable(x.f3342b, xVar.f3343a);
                bundle5.putBundle(str6, bundle8);
            }
            if (!list.isEmpty()) {
                bundle5.putParcelableArrayList(f0.f2986m, e2.d.p(list, new ai.w1(11)));
            }
            String str7 = f0Var.f2993f;
            if (str7 != null) {
                bundle5.putString(f0.f2987n, str7);
            }
            if (!i0Var.isEmpty()) {
                bundle5.putParcelableArrayList(f0.f2988o, e2.d.p(i0Var, new ai.w1(12)));
            }
            long j13 = f0Var.h;
            if (j13 != -9223372036854775807L) {
                bundle5.putLong(f0.f2989p, j13);
            }
            bundle.putBundle(f3073m, bundle5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k0) {
                k0 k0Var = (k0) obj;
                if (Objects.equals(this.f3074a, k0Var.f3074a) && this.e.equals(k0Var.e) && Objects.equals(this.f3075b, k0Var.f3075b) && Objects.equals(this.f3076c, k0Var.f3076c) && Objects.equals(this.d, k0Var.d) && Objects.equals(this.f3077f, k0Var.f3077f)) {
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
        int hashCode = this.f3074a.hashCode() * 31;
        f0 f0Var = this.f3075b;
        if (f0Var != null) {
            i10 = f0Var.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = this.f3076c.hashCode();
        int hashCode3 = this.e.hashCode();
        int hashCode4 = this.d.hashCode();
        return this.f3077f.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + i10) * 31)) * 31)) * 31)) * 31);
    }
}
