package d2;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import b8.zb;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
public final class q0 {
    public static final q0 L = new q0(new p0());
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
    public static final String f8287a0;
    public static final String f8288b0;
    public static final String f8289c0;
    public static final String f8290d0;
    public static final String f8291e0;
    public static final String f8292f0;
    public static final String f8293g0;
    public static final String f8294h0;
    public static final String f8295i0;
    public static final String f8296j0;
    public static final String f8297k0;
    public static final String f8298l0;
    public static final String m0;
    public static final String f8299n0;
    public static final String f8300o0;
    public static final String f8301p0;
    public static final String f8302q0;
    public static final String f8303r0;
    public static final String f8304s0;
    public static final String f8305t0;
    public static final String f8306u0;
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
    public final g9.i0 K;
    public final CharSequence f8307a;
    public final CharSequence f8308b;
    public final CharSequence f8309c;
    public final CharSequence d;
    public final CharSequence f8310e;
    public final CharSequence f8311f;
    public final CharSequence f8312g;
    public final Long h;
    public final f1 f8313i;
    public final f1 f8314j;
    public final byte[] f8315k;
    public l f8316l;
    public final Integer f8317m;
    public final Uri f8318n;
    public final Integer f8319o;
    public final Integer f8320p;
    public final Integer f8321q;
    public final Boolean f8322r;
    public final Boolean f8323s;
    public final Integer f8324t;
    public final Integer f8325u;
    public final Integer v;
    public final Integer f8326w;
    public final Integer f8327x;
    public final Integer f8328y;
    public final Integer f8329z;

    static {
        String str = g2.n0.f11873a;
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
        f8287a0 = Integer.toString(15, 36);
        f8288b0 = Integer.toString(16, 36);
        f8289c0 = Integer.toString(17, 36);
        f8290d0 = Integer.toString(18, 36);
        f8291e0 = Integer.toString(19, 36);
        f8292f0 = Integer.toString(20, 36);
        f8293g0 = Integer.toString(21, 36);
        f8294h0 = Integer.toString(22, 36);
        f8295i0 = Integer.toString(23, 36);
        f8296j0 = Integer.toString(24, 36);
        f8297k0 = Integer.toString(25, 36);
        f8298l0 = Integer.toString(26, 36);
        m0 = Integer.toString(27, 36);
        f8299n0 = Integer.toString(28, 36);
        f8300o0 = Integer.toString(29, 36);
        f8301p0 = Integer.toString(30, 36);
        f8302q0 = Integer.toString(31, 36);
        f8303r0 = Integer.toString(32, 36);
        f8304s0 = Integer.toString(33, 36);
        f8305t0 = Integer.toString(34, 36);
        f8306u0 = Integer.toString(1000, 36);
    }

    public q0(p0 p0Var) {
        Boolean bool = p0Var.f8275r;
        Integer num = p0Var.f8274q;
        Integer num2 = p0Var.H;
        int i3 = 1;
        int i10 = 0;
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
                            i3 = 0;
                            break;
                        case 21:
                            i3 = 2;
                            break;
                        case 22:
                            i3 = 3;
                            break;
                        case 23:
                            i3 = 4;
                            break;
                        case 24:
                            i3 = 5;
                            break;
                        case 25:
                            i3 = 6;
                            break;
                    }
                    i10 = i3;
                }
                num = Integer.valueOf(i10);
            }
        } else if (num != null) {
            boolean z10 = num.intValue() != -1;
            bool = Boolean.valueOf(z10);
            if (z10 && num2 == null) {
                switch (num.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i10 = 21;
                        break;
                    case 3:
                        i10 = 22;
                        break;
                    case 4:
                        i10 = 23;
                        break;
                    case 5:
                        i10 = 24;
                        break;
                    case 6:
                        i10 = 25;
                        break;
                    default:
                        i10 = 20;
                        break;
                }
                num2 = Integer.valueOf(i10);
            }
        }
        this.f8307a = p0Var.f8260a;
        this.f8308b = p0Var.f8261b;
        this.f8309c = p0Var.f8262c;
        this.d = p0Var.d;
        this.f8310e = p0Var.f8263e;
        this.f8311f = p0Var.f8264f;
        this.f8312g = p0Var.f8265g;
        this.h = p0Var.h;
        this.f8313i = p0Var.f8266i;
        this.f8314j = p0Var.f8267j;
        this.f8315k = p0Var.f8268k;
        this.f8316l = p0Var.f8269l;
        this.f8317m = p0Var.f8270m;
        this.f8318n = p0Var.f8271n;
        this.f8319o = p0Var.f8272o;
        this.f8320p = p0Var.f8273p;
        this.f8321q = num;
        this.f8322r = bool;
        this.f8323s = p0Var.f8276s;
        Integer num3 = p0Var.f8277t;
        this.f8324t = num3;
        this.f8325u = num3;
        this.v = p0Var.f8278u;
        this.f8326w = p0Var.v;
        this.f8327x = p0Var.f8279w;
        this.f8328y = p0Var.f8280x;
        this.f8329z = p0Var.f8281y;
        this.A = p0Var.f8282z;
        this.B = p0Var.A;
        this.C = p0Var.B;
        this.D = p0Var.C;
        this.E = p0Var.D;
        this.F = p0Var.E;
        this.G = p0Var.F;
        this.H = p0Var.G;
        this.I = num2;
        this.K = p0Var.J;
        this.J = p0Var.I;
    }

    public static q0 b(int i3, Bundle bundle) {
        boolean z10;
        Bundle bundle2;
        Bundle bundle3;
        Integer num;
        p0 p0Var = new p0();
        p0Var.f8260a = bundle.getCharSequence(M);
        p0Var.f8261b = bundle.getCharSequence(N);
        p0Var.f8262c = bundle.getCharSequence(O);
        p0Var.d = bundle.getCharSequence(P);
        p0Var.f8263e = bundle.getCharSequence(Q);
        p0Var.f8264f = bundle.getCharSequence(R);
        p0Var.f8265g = bundle.getCharSequence(S);
        p0Var.f8271n = (Uri) bundle.getParcelable(W);
        p0Var.f8282z = bundle.getCharSequence(f8294h0);
        p0Var.A = bundle.getCharSequence(f8295i0);
        p0Var.B = bundle.getCharSequence(f8296j0);
        p0Var.E = bundle.getCharSequence(m0);
        p0Var.F = bundle.getCharSequence(f8299n0);
        p0Var.G = bundle.getCharSequence(f8301p0);
        p0Var.I = g2.n0.o(bundle.getBundle(f8306u0));
        String str = V;
        if (bundle.containsKey(str)) {
            String str2 = f8300o0;
            byte[] bArr = null;
            if (bundle.containsKey(str2)) {
                num = Integer.valueOf(bundle.getInt(str2));
            } else {
                num = null;
            }
            if (i3 >= 9) {
                Bundle bundle4 = bundle.getBundle(str);
                if (bundle4 != null) {
                    IBinder binder = bundle4.getBinder(l.f8167e);
                    if (binder != null) {
                        if (binder instanceof i) {
                            bArr = ((i) binder).f8130a.f8170a;
                        } else if (Build.VERSION.SDK_INT < 27 || (bArr = j.b(bundle4)) == null) {
                            bArr = k.a(bundle4);
                        }
                    }
                    p0Var.b(bArr, num);
                }
            } else {
                p0Var.b(bundle.getByteArray(str), num);
            }
        }
        String str3 = T;
        if (bundle.containsKey(str3) && (bundle3 = bundle.getBundle(str3)) != null) {
            p0Var.f8266i = f1.a(bundle3);
        }
        String str4 = U;
        if (bundle.containsKey(str4) && (bundle2 = bundle.getBundle(str4)) != null) {
            p0Var.f8267j = f1.a(bundle2);
        }
        String str5 = f8304s0;
        if (bundle.containsKey(str5)) {
            long j10 = bundle.getLong(str5);
            Long valueOf = Long.valueOf(j10);
            if (j10 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            zb.f(z10);
            p0Var.h = valueOf;
        }
        String str6 = X;
        if (bundle.containsKey(str6)) {
            p0Var.f8272o = Integer.valueOf(bundle.getInt(str6));
        }
        String str7 = Y;
        if (bundle.containsKey(str7)) {
            p0Var.f8273p = Integer.valueOf(bundle.getInt(str7));
        }
        String str8 = Z;
        if (bundle.containsKey(str8)) {
            p0Var.f8274q = Integer.valueOf(bundle.getInt(str8));
        }
        String str9 = f8303r0;
        if (bundle.containsKey(str9)) {
            p0Var.f8275r = Boolean.valueOf(bundle.getBoolean(str9));
        }
        String str10 = f8287a0;
        if (bundle.containsKey(str10)) {
            p0Var.f8276s = Boolean.valueOf(bundle.getBoolean(str10));
        }
        String str11 = f8288b0;
        if (bundle.containsKey(str11)) {
            p0Var.f8277t = Integer.valueOf(bundle.getInt(str11));
        }
        String str12 = f8289c0;
        if (bundle.containsKey(str12)) {
            p0Var.f8278u = Integer.valueOf(bundle.getInt(str12));
        }
        String str13 = f8290d0;
        if (bundle.containsKey(str13)) {
            p0Var.v = Integer.valueOf(bundle.getInt(str13));
        }
        String str14 = f8291e0;
        if (bundle.containsKey(str14)) {
            p0Var.f8279w = Integer.valueOf(bundle.getInt(str14));
        }
        String str15 = f8292f0;
        if (bundle.containsKey(str15)) {
            p0Var.f8280x = Integer.valueOf(bundle.getInt(str15));
        }
        String str16 = f8293g0;
        if (bundle.containsKey(str16)) {
            p0Var.f8281y = Integer.valueOf(bundle.getInt(str16));
        }
        String str17 = f8297k0;
        if (bundle.containsKey(str17)) {
            p0Var.C = Integer.valueOf(bundle.getInt(str17));
        }
        String str18 = f8298l0;
        if (bundle.containsKey(str18)) {
            p0Var.D = Integer.valueOf(bundle.getInt(str18));
        }
        String str19 = f8302q0;
        if (bundle.containsKey(str19)) {
            p0Var.H = Integer.valueOf(bundle.getInt(str19));
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList(f8305t0);
        if (stringArrayList != null) {
            p0Var.J = g9.i0.q(stringArrayList);
        }
        return new q0(p0Var);
    }

    public final p0 a() {
        ?? obj = new Object();
        obj.f8260a = this.f8307a;
        obj.f8261b = this.f8308b;
        obj.f8262c = this.f8309c;
        obj.d = this.d;
        obj.f8263e = this.f8310e;
        obj.f8264f = this.f8311f;
        obj.f8265g = this.f8312g;
        obj.h = this.h;
        obj.f8266i = this.f8313i;
        obj.f8267j = this.f8314j;
        obj.f8268k = this.f8315k;
        obj.f8269l = this.f8316l;
        obj.f8270m = this.f8317m;
        obj.f8271n = this.f8318n;
        obj.f8272o = this.f8319o;
        obj.f8273p = this.f8320p;
        obj.f8274q = this.f8321q;
        obj.f8275r = this.f8322r;
        obj.f8276s = this.f8323s;
        obj.f8277t = this.f8325u;
        obj.f8278u = this.v;
        obj.v = this.f8326w;
        obj.f8279w = this.f8327x;
        obj.f8280x = this.f8328y;
        obj.f8281y = this.f8329z;
        obj.f8282z = this.A;
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

    public final Bundle c(int i3) {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f8307a;
        if (charSequence != null) {
            bundle.putCharSequence(M, charSequence);
        }
        CharSequence charSequence2 = this.f8308b;
        if (charSequence2 != null) {
            bundle.putCharSequence(N, charSequence2);
        }
        CharSequence charSequence3 = this.f8309c;
        if (charSequence3 != null) {
            bundle.putCharSequence(O, charSequence3);
        }
        CharSequence charSequence4 = this.d;
        if (charSequence4 != null) {
            bundle.putCharSequence(P, charSequence4);
        }
        CharSequence charSequence5 = this.f8310e;
        if (charSequence5 != null) {
            bundle.putCharSequence(Q, charSequence5);
        }
        CharSequence charSequence6 = this.f8311f;
        if (charSequence6 != null) {
            bundle.putCharSequence(R, charSequence6);
        }
        CharSequence charSequence7 = this.f8312g;
        if (charSequence7 != null) {
            bundle.putCharSequence(S, charSequence7);
        }
        Long l10 = this.h;
        if (l10 != null) {
            bundle.putLong(f8304s0, l10.longValue());
        }
        byte[] bArr = this.f8315k;
        if (bArr != null) {
            String str = V;
            if (i3 >= 9) {
                if (this.f8316l == null) {
                    this.f8316l = new l(bArr);
                }
                l lVar = this.f8316l;
                byte[] bArr2 = lVar.f8170a;
                Bundle bundle2 = new Bundle();
                bundle2.putBinder(l.f8167e, lVar.f8171b);
                if (Build.VERSION.SDK_INT >= 27 && bArr2.length > 0) {
                    if (lVar.f8172c == null) {
                        lVar.f8172c = j.a(bArr2);
                    }
                    j jVar = lVar.f8172c;
                    if (jVar != null) {
                        bundle2.putParcelable(l.f8168f, jVar.f8148a);
                        bundle.putBundle(str, bundle2);
                    }
                }
                if (lVar.d == null) {
                    lVar.d = new k(bArr2);
                }
                k kVar = lVar.d;
                int i10 = k.f8155b;
                kVar.getClass();
                bundle2.putBinder(l.f8169g, kVar.f8156a);
                bundle.putBundle(str, bundle2);
            } else if (bArr.length <= 500000) {
                bundle.putByteArray(str, bArr);
            }
        }
        Uri uri = this.f8318n;
        if (uri != null) {
            bundle.putParcelable(W, uri);
        }
        CharSequence charSequence8 = this.A;
        if (charSequence8 != null) {
            bundle.putCharSequence(f8294h0, charSequence8);
        }
        CharSequence charSequence9 = this.B;
        if (charSequence9 != null) {
            bundle.putCharSequence(f8295i0, charSequence9);
        }
        CharSequence charSequence10 = this.C;
        if (charSequence10 != null) {
            bundle.putCharSequence(f8296j0, charSequence10);
        }
        CharSequence charSequence11 = this.F;
        if (charSequence11 != null) {
            bundle.putCharSequence(m0, charSequence11);
        }
        CharSequence charSequence12 = this.G;
        if (charSequence12 != null) {
            bundle.putCharSequence(f8299n0, charSequence12);
        }
        CharSequence charSequence13 = this.H;
        if (charSequence13 != null) {
            bundle.putCharSequence(f8301p0, charSequence13);
        }
        f1 f1Var = this.f8313i;
        if (f1Var != null) {
            bundle.putBundle(T, f1Var.c());
        }
        f1 f1Var2 = this.f8314j;
        if (f1Var2 != null) {
            bundle.putBundle(U, f1Var2.c());
        }
        Integer num = this.f8319o;
        if (num != null) {
            bundle.putInt(X, num.intValue());
        }
        Integer num2 = this.f8320p;
        if (num2 != null) {
            bundle.putInt(Y, num2.intValue());
        }
        Integer num3 = this.f8321q;
        if (num3 != null) {
            bundle.putInt(Z, num3.intValue());
        }
        Boolean bool = this.f8322r;
        if (bool != null) {
            bundle.putBoolean(f8303r0, bool.booleanValue());
        }
        Boolean bool2 = this.f8323s;
        if (bool2 != null) {
            bundle.putBoolean(f8287a0, bool2.booleanValue());
        }
        Integer num4 = this.f8325u;
        if (num4 != null) {
            bundle.putInt(f8288b0, num4.intValue());
        }
        Integer num5 = this.v;
        if (num5 != null) {
            bundle.putInt(f8289c0, num5.intValue());
        }
        Integer num6 = this.f8326w;
        if (num6 != null) {
            bundle.putInt(f8290d0, num6.intValue());
        }
        Integer num7 = this.f8327x;
        if (num7 != null) {
            bundle.putInt(f8291e0, num7.intValue());
        }
        Integer num8 = this.f8328y;
        if (num8 != null) {
            bundle.putInt(f8292f0, num8.intValue());
        }
        Integer num9 = this.f8329z;
        if (num9 != null) {
            bundle.putInt(f8293g0, num9.intValue());
        }
        Integer num10 = this.D;
        if (num10 != null) {
            bundle.putInt(f8297k0, num10.intValue());
        }
        Integer num11 = this.E;
        if (num11 != null) {
            bundle.putInt(f8298l0, num11.intValue());
        }
        Integer num12 = this.f8317m;
        if (num12 != null) {
            bundle.putInt(f8300o0, num12.intValue());
        }
        Integer num13 = this.I;
        if (num13 != null) {
            bundle.putInt(f8302q0, num13.intValue());
        }
        g9.i0 i0Var = this.K;
        if (!i0Var.isEmpty()) {
            bundle.putStringArrayList(f8305t0, new ArrayList<>(i0Var));
        }
        Bundle bundle3 = this.J;
        if (bundle3 != null) {
            bundle.putBundle(f8306u0, bundle3);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (obj != null && q0.class == obj.getClass()) {
            q0 q0Var = (q0) obj;
            if (TextUtils.equals(this.f8307a, q0Var.f8307a) && TextUtils.equals(this.f8308b, q0Var.f8308b) && TextUtils.equals(this.f8309c, q0Var.f8309c) && TextUtils.equals(this.d, q0Var.d) && TextUtils.equals(this.f8310e, q0Var.f8310e) && TextUtils.equals(this.f8311f, q0Var.f8311f) && TextUtils.equals(this.f8312g, q0Var.f8312g) && Objects.equals(this.h, q0Var.h) && Objects.equals(this.f8313i, q0Var.f8313i) && Objects.equals(this.f8314j, q0Var.f8314j) && Arrays.equals(this.f8315k, q0Var.f8315k) && Objects.equals(this.f8317m, q0Var.f8317m) && Objects.equals(this.f8318n, q0Var.f8318n) && Objects.equals(this.f8319o, q0Var.f8319o) && Objects.equals(this.f8320p, q0Var.f8320p) && Objects.equals(this.f8321q, q0Var.f8321q) && Objects.equals(this.f8322r, q0Var.f8322r) && Objects.equals(this.f8323s, q0Var.f8323s) && Objects.equals(this.f8325u, q0Var.f8325u) && Objects.equals(this.v, q0Var.v) && Objects.equals(this.f8326w, q0Var.f8326w) && Objects.equals(this.f8327x, q0Var.f8327x) && Objects.equals(this.f8328y, q0Var.f8328y) && Objects.equals(this.f8329z, q0Var.f8329z) && TextUtils.equals(this.A, q0Var.A) && TextUtils.equals(this.B, q0Var.B) && TextUtils.equals(this.C, q0Var.C) && Objects.equals(this.D, q0Var.D) && Objects.equals(this.E, q0Var.E) && TextUtils.equals(this.F, q0Var.F) && TextUtils.equals(this.G, q0Var.G) && TextUtils.equals(this.H, q0Var.H) && Objects.equals(this.I, q0Var.I) && Objects.equals(this.K, q0Var.K)) {
                if (this.J == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (q0Var.J == null) {
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
        Integer valueOf = Integer.valueOf(Arrays.hashCode(this.f8315k));
        if (this.J == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Objects.hash(this.f8307a, this.f8308b, this.f8309c, this.d, this.f8310e, this.f8311f, this.f8312g, this.h, this.f8313i, this.f8314j, valueOf, this.f8317m, this.f8318n, this.f8319o, this.f8320p, this.f8321q, this.f8322r, this.f8323s, this.f8325u, this.v, this.f8326w, this.f8327x, this.f8328y, this.f8329z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, Boolean.valueOf(z10), this.K);
    }
}
