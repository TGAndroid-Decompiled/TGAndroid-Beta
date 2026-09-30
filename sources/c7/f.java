package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new r0(11);
    public final s f4080a;
    public final x0 f4081b;
    public final i0 f4082c;
    public final z0 d;
    public final m0 e;
    public final n0 f4083f;
    public final y0 h;
    public final o0 f4084n;
    public final t f4085r;
    public final q0 f4086s;
    public final s0 v;
    public final p0 f4087w;

    public f(s sVar, x0 x0Var, i0 i0Var, z0 z0Var, m0 m0Var, n0 n0Var, y0 y0Var, o0 o0Var, t tVar, q0 q0Var, s0 s0Var, p0 p0Var) {
        this.f4080a = sVar;
        this.f4082c = i0Var;
        this.f4081b = x0Var;
        this.d = z0Var;
        this.e = m0Var;
        this.f4083f = n0Var;
        this.h = y0Var;
        this.f4084n = o0Var;
        this.f4085r = tVar;
        this.f4086s = q0Var;
        this.v = s0Var;
        this.f4087w = p0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!n6.l.l(this.f4080a, fVar.f4080a) || !n6.l.l(this.f4081b, fVar.f4081b) || !n6.l.l(this.f4082c, fVar.f4082c) || !n6.l.l(this.d, fVar.d) || !n6.l.l(this.e, fVar.e) || !n6.l.l(this.f4083f, fVar.f4083f) || !n6.l.l(this.h, fVar.h) || !n6.l.l(this.f4084n, fVar.f4084n) || !n6.l.l(this.f4085r, fVar.f4085r) || !n6.l.l(this.f4086s, fVar.f4086s) || !n6.l.l(this.v, fVar.v) || !n6.l.l(this.f4087w, fVar.f4087w)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4080a, this.f4081b, this.f4082c, this.d, this.e, this.f4083f, this.h, this.f4084n, this.f4085r, this.f4086s, this.v, this.f4087w});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4080a);
        String valueOf2 = String.valueOf(this.f4081b);
        String valueOf3 = String.valueOf(this.f4082c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f4083f);
        String valueOf7 = String.valueOf(this.h);
        String valueOf8 = String.valueOf(this.f4084n);
        String valueOf9 = String.valueOf(this.f4085r);
        String valueOf10 = String.valueOf(this.f4086s);
        String valueOf11 = String.valueOf(this.v);
        StringBuilder x10 = a4.a.x("AuthenticationExtensions{\n fidoAppIdExtension=", valueOf, ", \n cableAuthenticationExtension=", valueOf2, ", \n userVerificationMethodExtension=");
        a4.a.A(x10, valueOf3, ", \n googleMultiAssertionExtension=", valueOf4, ", \n googleSessionIdExtension=");
        a4.a.A(x10, valueOf5, ", \n googleSilentVerificationExtension=", valueOf6, ", \n devicePublicKeyExtension=");
        a4.a.A(x10, valueOf7, ", \n googleTunnelServerIdExtension=", valueOf8, ", \n googleThirdPartyPaymentExtension=");
        a4.a.A(x10, valueOf9, ", \n prfExtension=", valueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return a4.a.t(x10, valueOf11, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.k(parcel, 2, this.f4080a, i10);
        w7.f0.k(parcel, 3, this.f4081b, i10);
        w7.f0.k(parcel, 4, this.f4082c, i10);
        w7.f0.k(parcel, 5, this.d, i10);
        w7.f0.k(parcel, 6, this.e, i10);
        w7.f0.k(parcel, 7, this.f4083f, i10);
        w7.f0.k(parcel, 8, this.h, i10);
        w7.f0.k(parcel, 9, this.f4084n, i10);
        w7.f0.k(parcel, 10, this.f4085r, i10);
        w7.f0.k(parcel, 11, this.f4086s, i10);
        w7.f0.k(parcel, 12, this.v, i10);
        w7.f0.k(parcel, 13, this.f4087w, i10);
        w7.f0.r(parcel, q6);
    }
}
