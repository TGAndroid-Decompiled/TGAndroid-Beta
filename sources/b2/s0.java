package b2;

import a8.yb;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
public final class s0 {
    public static final s0 L = new s0(new r0());
    public static final String M;
    public static final String N;
    public static final String O;
    public static final String P;
    public static final String Q;
    public static final String R;
    public static final String S;
    public static final String T;
    public static final String U;
    public static final String V;
    public static final String W;
    public static final String X;
    public static final String Y;
    public static final String Z;
    public static final String f3390a0;
    public static final String f3391b0;
    public static final String f3392c0;
    public static final String f3393d0;
    public static final String f3394e0;
    public static final String f3395f0;
    public static final String f3396g0;
    public static final String f3397h0;
    public static final String f3398i0;
    public static final String f3399j0;
    public static final String f3400k0;
    public static final String f3401l0;
    public static final String m0;
    public static final String f3402n0;
    public static final String f3403o0;
    public static final String f3404p0;
    public static final String f3405q0;
    public static final String f3406r0;
    public static final String f3407s0;
    public static final String f3408t0;
    public static final String f3409u0;
    public final CharSequence A;
    public final CharSequence B;
    public final CharSequence C;
    public final Integer D;
    public final Integer E;
    public final CharSequence F;
    public final CharSequence G;
    public final CharSequence H;
    public final Integer I;
    public final Bundle J;
    public final f9.i0 K;
    public final CharSequence f3410a;
    public final CharSequence f3411b;
    public final CharSequence f3412c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f3413f;
    public final CharSequence f3414g;
    public final Long h;
    public final h1 f3415i;
    public final h1 f3416j;
    public final byte[] f3417k;
    public m f3418l;
    public final Integer f3419m;
    public final Uri f3420n;
    public final Integer f3421o;
    public final Integer f3422p;
    public final Integer f3423q;
    public final Boolean f3424r;
    public final Boolean f3425s;
    public final Integer f3426t;
    public final Integer f3427u;
    public final Integer v;
    public final Integer f3428w;
    public final Integer f3429x;
    public final Integer f3430y;
    public final Integer f3431z;

    static {
        String str = e2.n0.f9691a;
        M = Integer.toString(0, 36);
        N = Integer.toString(1, 36);
        O = Integer.toString(2, 36);
        P = Integer.toString(3, 36);
        Q = Integer.toString(4, 36);
        R = Integer.toString(5, 36);
        S = Integer.toString(6, 36);
        T = Integer.toString(8, 36);
        U = Integer.toString(9, 36);
        V = Integer.toString(10, 36);
        W = Integer.toString(11, 36);
        X = Integer.toString(12, 36);
        Y = Integer.toString(13, 36);
        Z = Integer.toString(14, 36);
        f3390a0 = Integer.toString(15, 36);
        f3391b0 = Integer.toString(16, 36);
        f3392c0 = Integer.toString(17, 36);
        f3393d0 = Integer.toString(18, 36);
        f3394e0 = Integer.toString(19, 36);
        f3395f0 = Integer.toString(20, 36);
        f3396g0 = Integer.toString(21, 36);
        f3397h0 = Integer.toString(22, 36);
        f3398i0 = Integer.toString(23, 36);
        f3399j0 = Integer.toString(24, 36);
        f3400k0 = Integer.toString(25, 36);
        f3401l0 = Integer.toString(26, 36);
        m0 = Integer.toString(27, 36);
        f3402n0 = Integer.toString(28, 36);
        f3403o0 = Integer.toString(29, 36);
        f3404p0 = Integer.toString(30, 36);
        f3405q0 = Integer.toString(31, 36);
        f3406r0 = Integer.toString(32, 36);
        f3407s0 = Integer.toString(33, 36);
        f3408t0 = Integer.toString(34, 36);
        f3409u0 = Integer.toString(1000, 36);
    }

    public s0(r0 r0Var) {
        Boolean bool = r0Var.f3376r;
        Integer num = r0Var.f3375q;
        Integer num2 = r0Var.H;
        int i10 = 1;
        int i11 = 0;
        if (bool != null) {
            if (!bool.booleanValue()) {
                num = -1;
            } else if (num == null || num.intValue() == -1) {
                if (num2 != null) {
                    switch (num2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                            break;
                        case 20:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        default:
                            i10 = 0;
                            break;
                        case 21:
                            i10 = 2;
                            break;
                        case 22:
                            i10 = 3;
                            break;
                        case 23:
                            i10 = 4;
                            break;
                        case 24:
                            i10 = 5;
                            break;
                        case 25:
                            i10 = 6;
                            break;
                    }
                    i11 = i10;
                }
                num = Integer.valueOf(i11);
            }
        } else if (num != null) {
            boolean z10 = num.intValue() != -1;
            bool = Boolean.valueOf(z10);
            if (z10 && num2 == null) {
                switch (num.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i11 = 21;
                        break;
                    case 3:
                        i11 = 22;
                        break;
                    case 4:
                        i11 = 23;
                        break;
                    case 5:
                        i11 = 24;
                        break;
                    case 6:
                        i11 = 25;
                        break;
                    default:
                        i11 = 20;
                        break;
                }
                num2 = Integer.valueOf(i11);
            }
        }
        this.f3410a = r0Var.f3362a;
        this.f3411b = r0Var.f3363b;
        this.f3412c = r0Var.f3364c;
        this.d = r0Var.d;
        this.e = r0Var.e;
        this.f3413f = r0Var.f3365f;
        this.f3414g = r0Var.f3366g;
        this.h = r0Var.h;
        this.f3415i = r0Var.f3367i;
        this.f3416j = r0Var.f3368j;
        this.f3417k = r0Var.f3369k;
        this.f3418l = r0Var.f3370l;
        this.f3419m = r0Var.f3371m;
        this.f3420n = r0Var.f3372n;
        this.f3421o = r0Var.f3373o;
        this.f3422p = r0Var.f3374p;
        this.f3423q = num;
        this.f3424r = bool;
        this.f3425s = r0Var.f3377s;
        Integer num3 = r0Var.f3378t;
        this.f3426t = num3;
        this.f3427u = num3;
        this.v = r0Var.f3379u;
        this.f3428w = r0Var.v;
        this.f3429x = r0Var.f3380w;
        this.f3430y = r0Var.f3381x;
        this.f3431z = r0Var.f3382y;
        this.A = r0Var.f3383z;
        this.B = r0Var.A;
        this.C = r0Var.B;
        this.D = r0Var.C;
        this.E = r0Var.D;
        this.F = r0Var.E;
        this.G = r0Var.F;
        this.H = r0Var.G;
        this.I = num2;
        this.K = r0Var.J;
        this.J = r0Var.I;
    }

    public static s0 b(int i10, Bundle bundle) {
        boolean z10;
        Bundle bundle2;
        Bundle bundle3;
        Integer num;
        r0 r0Var = new r0();
        r0Var.f3362a = bundle.getCharSequence(M);
        r0Var.f3363b = bundle.getCharSequence(N);
        r0Var.f3364c = bundle.getCharSequence(O);
        r0Var.d = bundle.getCharSequence(P);
        r0Var.e = bundle.getCharSequence(Q);
        r0Var.f3365f = bundle.getCharSequence(R);
        r0Var.f3366g = bundle.getCharSequence(S);
        r0Var.f3372n = (Uri) bundle.getParcelable(W);
        r0Var.f3383z = bundle.getCharSequence(f3397h0);
        r0Var.A = bundle.getCharSequence(f3398i0);
        r0Var.B = bundle.getCharSequence(f3399j0);
        r0Var.E = bundle.getCharSequence(m0);
        r0Var.F = bundle.getCharSequence(f3402n0);
        r0Var.G = bundle.getCharSequence(f3404p0);
        r0Var.I = e2.n0.o(bundle.getBundle(f3409u0));
        String str = V;
        if (bundle.containsKey(str)) {
            String str2 = f3403o0;
            byte[] bArr = null;
            if (bundle.containsKey(str2)) {
                num = Integer.valueOf(bundle.getInt(str2));
            } else {
                num = null;
            }
            if (i10 >= 9) {
                Bundle bundle4 = bundle.getBundle(str);
                if (bundle4 != null) {
                    IBinder binder = bundle4.getBinder(m.e);
                    if (binder != null) {
                        if (binder instanceof j) {
                            bArr = ((j) binder).f3233a.f3271a;
                        } else if (Build.VERSION.SDK_INT < 27 || (bArr = k.b(bundle4)) == null) {
                            bArr = l.a(bundle4);
                        }
                    }
                    r0Var.b(bArr, num);
                }
            } else {
                r0Var.b(bundle.getByteArray(str), num);
            }
        }
        String str3 = T;
        if (bundle.containsKey(str3) && (bundle3 = bundle.getBundle(str3)) != null) {
            r0Var.f3367i = h1.a(bundle3);
        }
        String str4 = U;
        if (bundle.containsKey(str4) && (bundle2 = bundle.getBundle(str4)) != null) {
            r0Var.f3368j = h1.a(bundle2);
        }
        String str5 = f3407s0;
        if (bundle.containsKey(str5)) {
            long j10 = bundle.getLong(str5);
            Long valueOf = Long.valueOf(j10);
            if (j10 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            yb.g(z10);
            r0Var.h = valueOf;
        }
        String str6 = X;
        if (bundle.containsKey(str6)) {
            r0Var.f3373o = Integer.valueOf(bundle.getInt(str6));
        }
        String str7 = Y;
        if (bundle.containsKey(str7)) {
            r0Var.f3374p = Integer.valueOf(bundle.getInt(str7));
        }
        String str8 = Z;
        if (bundle.containsKey(str8)) {
            r0Var.f3375q = Integer.valueOf(bundle.getInt(str8));
        }
        String str9 = f3406r0;
        if (bundle.containsKey(str9)) {
            r0Var.f3376r = Boolean.valueOf(bundle.getBoolean(str9));
        }
        String str10 = f3390a0;
        if (bundle.containsKey(str10)) {
            r0Var.f3377s = Boolean.valueOf(bundle.getBoolean(str10));
        }
        String str11 = f3391b0;
        if (bundle.containsKey(str11)) {
            r0Var.f3378t = Integer.valueOf(bundle.getInt(str11));
        }
        String str12 = f3392c0;
        if (bundle.containsKey(str12)) {
            r0Var.f3379u = Integer.valueOf(bundle.getInt(str12));
        }
        String str13 = f3393d0;
        if (bundle.containsKey(str13)) {
            r0Var.v = Integer.valueOf(bundle.getInt(str13));
        }
        String str14 = f3394e0;
        if (bundle.containsKey(str14)) {
            r0Var.f3380w = Integer.valueOf(bundle.getInt(str14));
        }
        String str15 = f3395f0;
        if (bundle.containsKey(str15)) {
            r0Var.f3381x = Integer.valueOf(bundle.getInt(str15));
        }
        String str16 = f3396g0;
        if (bundle.containsKey(str16)) {
            r0Var.f3382y = Integer.valueOf(bundle.getInt(str16));
        }
        String str17 = f3400k0;
        if (bundle.containsKey(str17)) {
            r0Var.C = Integer.valueOf(bundle.getInt(str17));
        }
        String str18 = f3401l0;
        if (bundle.containsKey(str18)) {
            r0Var.D = Integer.valueOf(bundle.getInt(str18));
        }
        String str19 = f3405q0;
        if (bundle.containsKey(str19)) {
            r0Var.H = Integer.valueOf(bundle.getInt(str19));
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList(f3408t0);
        if (stringArrayList != null) {
            r0Var.J = f9.i0.u(stringArrayList);
        }
        return new s0(r0Var);
    }

    public final r0 a() {
        ?? obj = new Object();
        obj.f3362a = this.f3410a;
        obj.f3363b = this.f3411b;
        obj.f3364c = this.f3412c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f3365f = this.f3413f;
        obj.f3366g = this.f3414g;
        obj.h = this.h;
        obj.f3367i = this.f3415i;
        obj.f3368j = this.f3416j;
        obj.f3369k = this.f3417k;
        obj.f3370l = this.f3418l;
        obj.f3371m = this.f3419m;
        obj.f3372n = this.f3420n;
        obj.f3373o = this.f3421o;
        obj.f3374p = this.f3422p;
        obj.f3375q = this.f3423q;
        obj.f3376r = this.f3424r;
        obj.f3377s = this.f3425s;
        obj.f3378t = this.f3427u;
        obj.f3379u = this.v;
        obj.v = this.f3428w;
        obj.f3380w = this.f3429x;
        obj.f3381x = this.f3430y;
        obj.f3382y = this.f3431z;
        obj.f3383z = this.A;
        obj.A = this.B;
        obj.B = this.C;
        obj.C = this.D;
        obj.D = this.E;
        obj.E = this.F;
        obj.F = this.G;
        obj.G = this.H;
        obj.H = this.I;
        obj.J = this.K;
        obj.I = this.J;
        return obj;
    }

    public final Bundle c(int i10) {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f3410a;
        if (charSequence != null) {
            bundle.putCharSequence(M, charSequence);
        }
        CharSequence charSequence2 = this.f3411b;
        if (charSequence2 != null) {
            bundle.putCharSequence(N, charSequence2);
        }
        CharSequence charSequence3 = this.f3412c;
        if (charSequence3 != null) {
            bundle.putCharSequence(O, charSequence3);
        }
        CharSequence charSequence4 = this.d;
        if (charSequence4 != null) {
            bundle.putCharSequence(P, charSequence4);
        }
        CharSequence charSequence5 = this.e;
        if (charSequence5 != null) {
            bundle.putCharSequence(Q, charSequence5);
        }
        CharSequence charSequence6 = this.f3413f;
        if (charSequence6 != null) {
            bundle.putCharSequence(R, charSequence6);
        }
        CharSequence charSequence7 = this.f3414g;
        if (charSequence7 != null) {
            bundle.putCharSequence(S, charSequence7);
        }
        Long l4 = this.h;
        if (l4 != null) {
            bundle.putLong(f3407s0, l4.longValue());
        }
        byte[] bArr = this.f3417k;
        if (bArr != null) {
            String str = V;
            if (i10 >= 9) {
                if (this.f3418l == null) {
                    this.f3418l = new m(bArr);
                }
                m mVar = this.f3418l;
                byte[] bArr2 = mVar.f3271a;
                Bundle bundle2 = new Bundle();
                bundle2.putBinder(m.e, mVar.f3272b);
                if (Build.VERSION.SDK_INT >= 27 && bArr2.length > 0) {
                    if (mVar.f3273c == null) {
                        mVar.f3273c = k.a(bArr2);
                    }
                    k kVar = mVar.f3273c;
                    if (kVar != null) {
                        bundle2.putParcelable(m.f3269f, kVar.f3246a);
                        bundle.putBundle(str, bundle2);
                    }
                }
                if (mVar.d == null) {
                    mVar.d = new l(bArr2);
                }
                l lVar = mVar.d;
                int i11 = l.f3262b;
                lVar.getClass();
                bundle2.putBinder(m.f3270g, lVar.f3263a);
                bundle.putBundle(str, bundle2);
            } else if (bArr.length <= 500000) {
                bundle.putByteArray(str, bArr);
            }
        }
        Uri uri = this.f3420n;
        if (uri != null) {
            bundle.putParcelable(W, uri);
        }
        CharSequence charSequence8 = this.A;
        if (charSequence8 != null) {
            bundle.putCharSequence(f3397h0, charSequence8);
        }
        CharSequence charSequence9 = this.B;
        if (charSequence9 != null) {
            bundle.putCharSequence(f3398i0, charSequence9);
        }
        CharSequence charSequence10 = this.C;
        if (charSequence10 != null) {
            bundle.putCharSequence(f3399j0, charSequence10);
        }
        CharSequence charSequence11 = this.F;
        if (charSequence11 != null) {
            bundle.putCharSequence(m0, charSequence11);
        }
        CharSequence charSequence12 = this.G;
        if (charSequence12 != null) {
            bundle.putCharSequence(f3402n0, charSequence12);
        }
        CharSequence charSequence13 = this.H;
        if (charSequence13 != null) {
            bundle.putCharSequence(f3404p0, charSequence13);
        }
        h1 h1Var = this.f3415i;
        if (h1Var != null) {
            bundle.putBundle(T, h1Var.c());
        }
        h1 h1Var2 = this.f3416j;
        if (h1Var2 != null) {
            bundle.putBundle(U, h1Var2.c());
        }
        Integer num = this.f3421o;
        if (num != null) {
            bundle.putInt(X, num.intValue());
        }
        Integer num2 = this.f3422p;
        if (num2 != null) {
            bundle.putInt(Y, num2.intValue());
        }
        Integer num3 = this.f3423q;
        if (num3 != null) {
            bundle.putInt(Z, num3.intValue());
        }
        Boolean bool = this.f3424r;
        if (bool != null) {
            bundle.putBoolean(f3406r0, bool.booleanValue());
        }
        Boolean bool2 = this.f3425s;
        if (bool2 != null) {
            bundle.putBoolean(f3390a0, bool2.booleanValue());
        }
        Integer num4 = this.f3427u;
        if (num4 != null) {
            bundle.putInt(f3391b0, num4.intValue());
        }
        Integer num5 = this.v;
        if (num5 != null) {
            bundle.putInt(f3392c0, num5.intValue());
        }
        Integer num6 = this.f3428w;
        if (num6 != null) {
            bundle.putInt(f3393d0, num6.intValue());
        }
        Integer num7 = this.f3429x;
        if (num7 != null) {
            bundle.putInt(f3394e0, num7.intValue());
        }
        Integer num8 = this.f3430y;
        if (num8 != null) {
            bundle.putInt(f3395f0, num8.intValue());
        }
        Integer num9 = this.f3431z;
        if (num9 != null) {
            bundle.putInt(f3396g0, num9.intValue());
        }
        Integer num10 = this.D;
        if (num10 != null) {
            bundle.putInt(f3400k0, num10.intValue());
        }
        Integer num11 = this.E;
        if (num11 != null) {
            bundle.putInt(f3401l0, num11.intValue());
        }
        Integer num12 = this.f3419m;
        if (num12 != null) {
            bundle.putInt(f3403o0, num12.intValue());
        }
        Integer num13 = this.I;
        if (num13 != null) {
            bundle.putInt(f3405q0, num13.intValue());
        }
        f9.i0 i0Var = this.K;
        if (!i0Var.isEmpty()) {
            bundle.putStringArrayList(f3408t0, new ArrayList<>(i0Var));
        }
        Bundle bundle3 = this.J;
        if (bundle3 != null) {
            bundle.putBundle(f3409u0, bundle3);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (obj != null && s0.class == obj.getClass()) {
            s0 s0Var = (s0) obj;
            if (TextUtils.equals(this.f3410a, s0Var.f3410a) && TextUtils.equals(this.f3411b, s0Var.f3411b) && TextUtils.equals(this.f3412c, s0Var.f3412c) && TextUtils.equals(this.d, s0Var.d) && TextUtils.equals(this.e, s0Var.e) && TextUtils.equals(this.f3413f, s0Var.f3413f) && TextUtils.equals(this.f3414g, s0Var.f3414g) && Objects.equals(this.h, s0Var.h) && Objects.equals(this.f3415i, s0Var.f3415i) && Objects.equals(this.f3416j, s0Var.f3416j) && Arrays.equals(this.f3417k, s0Var.f3417k) && Objects.equals(this.f3419m, s0Var.f3419m) && Objects.equals(this.f3420n, s0Var.f3420n) && Objects.equals(this.f3421o, s0Var.f3421o) && Objects.equals(this.f3422p, s0Var.f3422p) && Objects.equals(this.f3423q, s0Var.f3423q) && Objects.equals(this.f3424r, s0Var.f3424r) && Objects.equals(this.f3425s, s0Var.f3425s) && Objects.equals(this.f3427u, s0Var.f3427u) && Objects.equals(this.v, s0Var.v) && Objects.equals(this.f3428w, s0Var.f3428w) && Objects.equals(this.f3429x, s0Var.f3429x) && Objects.equals(this.f3430y, s0Var.f3430y) && Objects.equals(this.f3431z, s0Var.f3431z) && TextUtils.equals(this.A, s0Var.A) && TextUtils.equals(this.B, s0Var.B) && TextUtils.equals(this.C, s0Var.C) && Objects.equals(this.D, s0Var.D) && Objects.equals(this.E, s0Var.E) && TextUtils.equals(this.F, s0Var.F) && TextUtils.equals(this.G, s0Var.G) && TextUtils.equals(this.H, s0Var.H) && Objects.equals(this.I, s0Var.I) && Objects.equals(this.K, s0Var.K)) {
                if (this.J == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (s0Var.J == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 == z11) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z10;
        Integer valueOf = Integer.valueOf(Arrays.hashCode(this.f3417k));
        if (this.J == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Objects.hash(this.f3410a, this.f3411b, this.f3412c, this.d, this.e, this.f3413f, this.f3414g, this.h, this.f3415i, this.f3416j, valueOf, this.f3419m, this.f3420n, this.f3421o, this.f3422p, this.f3423q, this.f3424r, this.f3425s, this.f3427u, this.v, this.f3428w, this.f3429x, this.f3430y, this.f3431z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, Boolean.valueOf(z10), this.K);
    }
}
