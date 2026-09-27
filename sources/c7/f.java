package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new r0(11);
    public final s f4082a;
    public final x0 f4083b;
    public final i0 f4084c;
    public final z0 d;
    public final m0 e;
    public final n0 f4085f;
    public final y0 h;
    public final o0 f4086n;
    public final t f4087r;
    public final q0 f4088s;
    public final s0 v;
    public final p0 f4089w;

    public f(s sVar, x0 x0Var, i0 i0Var, z0 z0Var, m0 m0Var, n0 n0Var, y0 y0Var, o0 o0Var, t tVar, q0 q0Var, s0 s0Var, p0 p0Var) {
        this.f4082a = sVar;
        this.f4084c = i0Var;
        this.f4083b = x0Var;
        this.d = z0Var;
        this.e = m0Var;
        this.f4085f = n0Var;
        this.h = y0Var;
        this.f4086n = o0Var;
        this.f4087r = tVar;
        this.f4088s = q0Var;
        this.v = s0Var;
        this.f4089w = p0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!n6.l.l(this.f4082a, fVar.f4082a) || !n6.l.l(this.f4083b, fVar.f4083b) || !n6.l.l(this.f4084c, fVar.f4084c) || !n6.l.l(this.d, fVar.d) || !n6.l.l(this.e, fVar.e) || !n6.l.l(this.f4085f, fVar.f4085f) || !n6.l.l(this.h, fVar.h) || !n6.l.l(this.f4086n, fVar.f4086n) || !n6.l.l(this.f4087r, fVar.f4087r) || !n6.l.l(this.f4088s, fVar.f4088s) || !n6.l.l(this.v, fVar.v) || !n6.l.l(this.f4089w, fVar.f4089w)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4082a, this.f4083b, this.f4084c, this.d, this.e, this.f4085f, this.h, this.f4086n, this.f4087r, this.f4088s, this.v, this.f4089w});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4082a);
        String valueOf2 = String.valueOf(this.f4083b);
        String valueOf3 = String.valueOf(this.f4084c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f4085f);
        String valueOf7 = String.valueOf(this.h);
        String valueOf8 = String.valueOf(this.f4086n);
        String valueOf9 = String.valueOf(this.f4087r);
        String valueOf10 = String.valueOf(this.f4088s);
        String valueOf11 = String.valueOf(this.v);
        StringBuilder w10 = a4.a.w("AuthenticationExtensions{\n fidoAppIdExtension=", valueOf, ", \n cableAuthenticationExtension=", valueOf2, ", \n userVerificationMethodExtension=");
        a4.a.z(w10, valueOf3, ", \n googleMultiAssertionExtension=", valueOf4, ", \n googleSessionIdExtension=");
        a4.a.z(w10, valueOf5, ", \n googleSilentVerificationExtension=", valueOf6, ", \n devicePublicKeyExtension=");
        a4.a.z(w10, valueOf7, ", \n googleTunnelServerIdExtension=", valueOf8, ", \n googleThirdPartyPaymentExtension=");
        a4.a.z(w10, valueOf9, ", \n prfExtension=", valueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return a4.a.s(w10, valueOf11, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.k(parcel, 2, this.f4082a, i10);
        w7.f0.k(parcel, 3, this.f4083b, i10);
        w7.f0.k(parcel, 4, this.f4084c, i10);
        w7.f0.k(parcel, 5, this.d, i10);
        w7.f0.k(parcel, 6, this.e, i10);
        w7.f0.k(parcel, 7, this.f4085f, i10);
        w7.f0.k(parcel, 8, this.h, i10);
        w7.f0.k(parcel, 9, this.f4086n, i10);
        w7.f0.k(parcel, 10, this.f4087r, i10);
        w7.f0.k(parcel, 11, this.f4088s, i10);
        w7.f0.k(parcel, 12, this.v, i10);
        w7.f0.k(parcel, 13, this.f4089w, i10);
        w7.f0.r(parcel, q6);
    }
}
