package b2;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import v7.u6;
public final class r0 {
    public static final r0 L = new r0(new q0());
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
    public static final String f3935a0;
    public static final String f3936b0;
    public static final String f3937c0;
    public static final String f3938d0;
    public static final String f3939e0;
    public static final String f3940f0;
    public static final String f3941g0;
    public static final String f3942h0;
    public static final String f3943i0;
    public static final String f3944j0;
    public static final String f3945k0;
    public static final String f3946l0;
    public static final String m0;
    public static final String f3947n0;
    public static final String f3948o0;
    public static final String f3949p0;
    public static final String f3950q0;
    public static final String f3951r0;
    public static final String f3952s0;
    public static final String f3953t0;
    public static final String f3954u0;
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
    public final e9.n0 K;
    public final CharSequence f3955a;
    public final CharSequence f3956b;
    public final CharSequence f3957c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f3958f;
    public final CharSequence f3959g;
    public final Long h;
    public final g1 f3960i;
    public final g1 f3961j;
    public final byte[] f3962k;
    public l f3963l;
    public final Integer f3964m;
    public final Uri f3965n;
    public final Integer f3966o;
    public final Integer f3967p;
    public final Integer f3968q;
    public final Boolean f3969r;
    public final Boolean f3970s;
    public final Integer f3971t;
    public final Integer f3972u;
    public final Integer v;
    public final Integer f3973w;
    public final Integer f3974x;
    public final Integer f3975y;
    public final Integer f3976z;

    static {
        String str = e2.m0.f8254a;
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
        f3935a0 = Integer.toString(15, 36);
        f3936b0 = Integer.toString(16, 36);
        f3937c0 = Integer.toString(17, 36);
        f3938d0 = Integer.toString(18, 36);
        f3939e0 = Integer.toString(19, 36);
        f3940f0 = Integer.toString(20, 36);
        f3941g0 = Integer.toString(21, 36);
        f3942h0 = Integer.toString(22, 36);
        f3943i0 = Integer.toString(23, 36);
        f3944j0 = Integer.toString(24, 36);
        f3945k0 = Integer.toString(25, 36);
        f3946l0 = Integer.toString(26, 36);
        m0 = Integer.toString(27, 36);
        f3947n0 = Integer.toString(28, 36);
        f3948o0 = Integer.toString(29, 36);
        f3949p0 = Integer.toString(30, 36);
        f3950q0 = Integer.toString(31, 36);
        f3951r0 = Integer.toString(32, 36);
        f3952s0 = Integer.toString(33, 36);
        f3953t0 = Integer.toString(34, 36);
        f3954u0 = Integer.toString(1000, 36);
    }

    public r0(q0 q0Var) {
        Boolean bool = q0Var.f3921r;
        Integer num = q0Var.f3920q;
        Integer num2 = q0Var.H;
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
        this.f3955a = q0Var.f3907a;
        this.f3956b = q0Var.f3908b;
        this.f3957c = q0Var.f3909c;
        this.d = q0Var.d;
        this.e = q0Var.e;
        this.f3958f = q0Var.f3910f;
        this.f3959g = q0Var.f3911g;
        this.h = q0Var.h;
        this.f3960i = q0Var.f3912i;
        this.f3961j = q0Var.f3913j;
        this.f3962k = q0Var.f3914k;
        this.f3963l = q0Var.f3915l;
        this.f3964m = q0Var.f3916m;
        this.f3965n = q0Var.f3917n;
        this.f3966o = q0Var.f3918o;
        this.f3967p = q0Var.f3919p;
        this.f3968q = num;
        this.f3969r = bool;
        this.f3970s = q0Var.f3922s;
        Integer num3 = q0Var.f3923t;
        this.f3971t = num3;
        this.f3972u = num3;
        this.v = q0Var.f3924u;
        this.f3973w = q0Var.v;
        this.f3974x = q0Var.f3925w;
        this.f3975y = q0Var.f3926x;
        this.f3976z = q0Var.f3927y;
        this.A = q0Var.f3928z;
        this.B = q0Var.A;
        this.C = q0Var.B;
        this.D = q0Var.C;
        this.E = q0Var.D;
        this.F = q0Var.E;
        this.G = q0Var.F;
        this.H = q0Var.G;
        this.I = num2;
        this.K = q0Var.J;
        this.J = q0Var.I;
    }

    public static r0 b(int i10, Bundle bundle) {
        boolean z10;
        Bundle bundle2;
        Bundle bundle3;
        Integer num;
        q0 q0Var = new q0();
        q0Var.f3907a = bundle.getCharSequence(M);
        q0Var.f3908b = bundle.getCharSequence(N);
        q0Var.f3909c = bundle.getCharSequence(O);
        q0Var.d = bundle.getCharSequence(P);
        q0Var.e = bundle.getCharSequence(Q);
        q0Var.f3910f = bundle.getCharSequence(R);
        q0Var.f3911g = bundle.getCharSequence(S);
        q0Var.f3917n = (Uri) bundle.getParcelable(W);
        q0Var.f3928z = bundle.getCharSequence(f3942h0);
        q0Var.A = bundle.getCharSequence(f3943i0);
        q0Var.B = bundle.getCharSequence(f3944j0);
        q0Var.E = bundle.getCharSequence(m0);
        q0Var.F = bundle.getCharSequence(f3947n0);
        q0Var.G = bundle.getCharSequence(f3949p0);
        q0Var.I = e2.m0.o(bundle.getBundle(f3954u0));
        String str = V;
        if (bundle.containsKey(str)) {
            String str2 = f3948o0;
            byte[] bArr = null;
            if (bundle.containsKey(str2)) {
                num = Integer.valueOf(bundle.getInt(str2));
            } else {
                num = null;
            }
            if (i10 >= 9) {
                Bundle bundle4 = bundle.getBundle(str);
                if (bundle4 != null) {
                    IBinder binder = bundle4.getBinder(l.e);
                    if (binder != null) {
                        if (binder instanceof i) {
                            bArr = ((i) binder).f3778a.f3816a;
                        } else if (Build.VERSION.SDK_INT < 27 || (bArr = j.b(bundle4)) == null) {
                            bArr = k.a(bundle4);
                        }
                    }
                    q0Var.b(bArr, num);
                }
            } else {
                q0Var.b(bundle.getByteArray(str), num);
            }
        }
        String str3 = T;
        if (bundle.containsKey(str3) && (bundle3 = bundle.getBundle(str3)) != null) {
            q0Var.f3912i = g1.a(bundle3);
        }
        String str4 = U;
        if (bundle.containsKey(str4) && (bundle2 = bundle.getBundle(str4)) != null) {
            q0Var.f3913j = g1.a(bundle2);
        }
        String str5 = f3952s0;
        if (bundle.containsKey(str5)) {
            long j10 = bundle.getLong(str5);
            Long valueOf = Long.valueOf(j10);
            if (j10 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            u6.g(z10);
            q0Var.h = valueOf;
        }
        String str6 = X;
        if (bundle.containsKey(str6)) {
            q0Var.f3918o = Integer.valueOf(bundle.getInt(str6));
        }
        String str7 = Y;
        if (bundle.containsKey(str7)) {
            q0Var.f3919p = Integer.valueOf(bundle.getInt(str7));
        }
        String str8 = Z;
        if (bundle.containsKey(str8)) {
            q0Var.f3920q = Integer.valueOf(bundle.getInt(str8));
        }
        String str9 = f3951r0;
        if (bundle.containsKey(str9)) {
            q0Var.f3921r = Boolean.valueOf(bundle.getBoolean(str9));
        }
        String str10 = f3935a0;
        if (bundle.containsKey(str10)) {
            q0Var.f3922s = Boolean.valueOf(bundle.getBoolean(str10));
        }
        String str11 = f3936b0;
        if (bundle.containsKey(str11)) {
            q0Var.f3923t = Integer.valueOf(bundle.getInt(str11));
        }
        String str12 = f3937c0;
        if (bundle.containsKey(str12)) {
            q0Var.f3924u = Integer.valueOf(bundle.getInt(str12));
        }
        String str13 = f3938d0;
        if (bundle.containsKey(str13)) {
            q0Var.v = Integer.valueOf(bundle.getInt(str13));
        }
        String str14 = f3939e0;
        if (bundle.containsKey(str14)) {
            q0Var.f3925w = Integer.valueOf(bundle.getInt(str14));
        }
        String str15 = f3940f0;
        if (bundle.containsKey(str15)) {
            q0Var.f3926x = Integer.valueOf(bundle.getInt(str15));
        }
        String str16 = f3941g0;
        if (bundle.containsKey(str16)) {
            q0Var.f3927y = Integer.valueOf(bundle.getInt(str16));
        }
        String str17 = f3945k0;
        if (bundle.containsKey(str17)) {
            q0Var.C = Integer.valueOf(bundle.getInt(str17));
        }
        String str18 = f3946l0;
        if (bundle.containsKey(str18)) {
            q0Var.D = Integer.valueOf(bundle.getInt(str18));
        }
        String str19 = f3950q0;
        if (bundle.containsKey(str19)) {
            q0Var.H = Integer.valueOf(bundle.getInt(str19));
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList(f3953t0);
        if (stringArrayList != null) {
            q0Var.J = e9.n0.u(stringArrayList);
        }
        return new r0(q0Var);
    }

    public final q0 a() {
        ?? obj = new Object();
        obj.f3907a = this.f3955a;
        obj.f3908b = this.f3956b;
        obj.f3909c = this.f3957c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f3910f = this.f3958f;
        obj.f3911g = this.f3959g;
        obj.h = this.h;
        obj.f3912i = this.f3960i;
        obj.f3913j = this.f3961j;
        obj.f3914k = this.f3962k;
        obj.f3915l = this.f3963l;
        obj.f3916m = this.f3964m;
        obj.f3917n = this.f3965n;
        obj.f3918o = this.f3966o;
        obj.f3919p = this.f3967p;
        obj.f3920q = this.f3968q;
        obj.f3921r = this.f3969r;
        obj.f3922s = this.f3970s;
        obj.f3923t = this.f3972u;
        obj.f3924u = this.v;
        obj.v = this.f3973w;
        obj.f3925w = this.f3974x;
        obj.f3926x = this.f3975y;
        obj.f3927y = this.f3976z;
        obj.f3928z = this.A;
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
        CharSequence charSequence = this.f3955a;
        if (charSequence != null) {
            bundle.putCharSequence(M, charSequence);
        }
        CharSequence charSequence2 = this.f3956b;
        if (charSequence2 != null) {
            bundle.putCharSequence(N, charSequence2);
        }
        CharSequence charSequence3 = this.f3957c;
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
        CharSequence charSequence6 = this.f3958f;
        if (charSequence6 != null) {
            bundle.putCharSequence(R, charSequence6);
        }
        CharSequence charSequence7 = this.f3959g;
        if (charSequence7 != null) {
            bundle.putCharSequence(S, charSequence7);
        }
        Long l4 = this.h;
        if (l4 != null) {
            bundle.putLong(f3952s0, l4.longValue());
        }
        byte[] bArr = this.f3962k;
        if (bArr != null) {
            String str = V;
            if (i10 >= 9) {
                if (this.f3963l == null) {
                    this.f3963l = new l(bArr);
                }
                l lVar = this.f3963l;
                byte[] bArr2 = lVar.f3816a;
                Bundle bundle2 = new Bundle();
                bundle2.putBinder(l.e, lVar.f3817b);
                if (Build.VERSION.SDK_INT >= 27 && bArr2.length > 0) {
                    if (lVar.f3818c == null) {
                        lVar.f3818c = j.a(bArr2);
                    }
                    j jVar = lVar.f3818c;
                    if (jVar != null) {
                        bundle2.putParcelable(l.f3814f, jVar.f3791a);
                        bundle.putBundle(str, bundle2);
                    }
                }
                if (lVar.d == null) {
                    lVar.d = new k(bArr2);
                }
                k kVar = lVar.d;
                int i11 = k.f3807b;
                kVar.getClass();
                bundle2.putBinder(l.f3815g, kVar.f3808a);
                bundle.putBundle(str, bundle2);
            } else if (bArr.length <= 500000) {
                bundle.putByteArray(str, bArr);
            }
        }
        Uri uri = this.f3965n;
        if (uri != null) {
            bundle.putParcelable(W, uri);
        }
        CharSequence charSequence8 = this.A;
        if (charSequence8 != null) {
            bundle.putCharSequence(f3942h0, charSequence8);
        }
        CharSequence charSequence9 = this.B;
        if (charSequence9 != null) {
            bundle.putCharSequence(f3943i0, charSequence9);
        }
        CharSequence charSequence10 = this.C;
        if (charSequence10 != null) {
            bundle.putCharSequence(f3944j0, charSequence10);
        }
        CharSequence charSequence11 = this.F;
        if (charSequence11 != null) {
            bundle.putCharSequence(m0, charSequence11);
        }
        CharSequence charSequence12 = this.G;
        if (charSequence12 != null) {
            bundle.putCharSequence(f3947n0, charSequence12);
        }
        CharSequence charSequence13 = this.H;
        if (charSequence13 != null) {
            bundle.putCharSequence(f3949p0, charSequence13);
        }
        g1 g1Var = this.f3960i;
        if (g1Var != null) {
            bundle.putBundle(T, g1Var.c());
        }
        g1 g1Var2 = this.f3961j;
        if (g1Var2 != null) {
            bundle.putBundle(U, g1Var2.c());
        }
        Integer num = this.f3966o;
        if (num != null) {
            bundle.putInt(X, num.intValue());
        }
        Integer num2 = this.f3967p;
        if (num2 != null) {
            bundle.putInt(Y, num2.intValue());
        }
        Integer num3 = this.f3968q;
        if (num3 != null) {
            bundle.putInt(Z, num3.intValue());
        }
        Boolean bool = this.f3969r;
        if (bool != null) {
            bundle.putBoolean(f3951r0, bool.booleanValue());
        }
        Boolean bool2 = this.f3970s;
        if (bool2 != null) {
            bundle.putBoolean(f3935a0, bool2.booleanValue());
        }
        Integer num4 = this.f3972u;
        if (num4 != null) {
            bundle.putInt(f3936b0, num4.intValue());
        }
        Integer num5 = this.v;
        if (num5 != null) {
            bundle.putInt(f3937c0, num5.intValue());
        }
        Integer num6 = this.f3973w;
        if (num6 != null) {
            bundle.putInt(f3938d0, num6.intValue());
        }
        Integer num7 = this.f3974x;
        if (num7 != null) {
            bundle.putInt(f3939e0, num7.intValue());
        }
        Integer num8 = this.f3975y;
        if (num8 != null) {
            bundle.putInt(f3940f0, num8.intValue());
        }
        Integer num9 = this.f3976z;
        if (num9 != null) {
            bundle.putInt(f3941g0, num9.intValue());
        }
        Integer num10 = this.D;
        if (num10 != null) {
            bundle.putInt(f3945k0, num10.intValue());
        }
        Integer num11 = this.E;
        if (num11 != null) {
            bundle.putInt(f3946l0, num11.intValue());
        }
        Integer num12 = this.f3964m;
        if (num12 != null) {
            bundle.putInt(f3948o0, num12.intValue());
        }
        Integer num13 = this.I;
        if (num13 != null) {
            bundle.putInt(f3950q0, num13.intValue());
        }
        e9.n0 n0Var = this.K;
        if (!n0Var.isEmpty()) {
            bundle.putStringArrayList(f3953t0, new ArrayList<>(n0Var));
        }
        Bundle bundle3 = this.J;
        if (bundle3 != null) {
            bundle.putBundle(f3954u0, bundle3);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (obj != null && r0.class == obj.getClass()) {
            r0 r0Var = (r0) obj;
            if (TextUtils.equals(this.f3955a, r0Var.f3955a) && TextUtils.equals(this.f3956b, r0Var.f3956b) && TextUtils.equals(this.f3957c, r0Var.f3957c) && TextUtils.equals(this.d, r0Var.d) && TextUtils.equals(this.e, r0Var.e) && TextUtils.equals(this.f3958f, r0Var.f3958f) && TextUtils.equals(this.f3959g, r0Var.f3959g) && Objects.equals(this.h, r0Var.h) && Objects.equals(this.f3960i, r0Var.f3960i) && Objects.equals(this.f3961j, r0Var.f3961j) && Arrays.equals(this.f3962k, r0Var.f3962k) && Objects.equals(this.f3964m, r0Var.f3964m) && Objects.equals(this.f3965n, r0Var.f3965n) && Objects.equals(this.f3966o, r0Var.f3966o) && Objects.equals(this.f3967p, r0Var.f3967p) && Objects.equals(this.f3968q, r0Var.f3968q) && Objects.equals(this.f3969r, r0Var.f3969r) && Objects.equals(this.f3970s, r0Var.f3970s) && Objects.equals(this.f3972u, r0Var.f3972u) && Objects.equals(this.v, r0Var.v) && Objects.equals(this.f3973w, r0Var.f3973w) && Objects.equals(this.f3974x, r0Var.f3974x) && Objects.equals(this.f3975y, r0Var.f3975y) && Objects.equals(this.f3976z, r0Var.f3976z) && TextUtils.equals(this.A, r0Var.A) && TextUtils.equals(this.B, r0Var.B) && TextUtils.equals(this.C, r0Var.C) && Objects.equals(this.D, r0Var.D) && Objects.equals(this.E, r0Var.E) && TextUtils.equals(this.F, r0Var.F) && TextUtils.equals(this.G, r0Var.G) && TextUtils.equals(this.H, r0Var.H) && Objects.equals(this.I, r0Var.I) && Objects.equals(this.K, r0Var.K)) {
                if (this.J == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (r0Var.J == null) {
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
        Integer valueOf = Integer.valueOf(Arrays.hashCode(this.f3962k));
        if (this.J == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Objects.hash(this.f3955a, this.f3956b, this.f3957c, this.d, this.e, this.f3958f, this.f3959g, this.h, this.f3960i, this.f3961j, valueOf, this.f3964m, this.f3965n, this.f3966o, this.f3967p, this.f3968q, this.f3969r, this.f3970s, this.f3972u, this.v, this.f3973w, this.f3974x, this.f3975y, this.f3976z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, Boolean.valueOf(z10), this.K);
    }
}
