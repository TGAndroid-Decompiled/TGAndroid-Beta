package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new r0(11);
    public final s f4413a;
    public final x0 f4414b;
    public final i0 f4415c;
    public final z0 d;
    public final m0 f4416e;
    public final n0 f4417f;
    public final y0 h;
    public final o0 f4418n;
    public final t f4419r;
    public final q0 f4420s;
    public final s0 v;
    public final p0 f4421w;

    public f(s sVar, x0 x0Var, i0 i0Var, z0 z0Var, m0 m0Var, n0 n0Var, y0 y0Var, o0 o0Var, t tVar, q0 q0Var, s0 s0Var, p0 p0Var) {
        this.f4413a = sVar;
        this.f4415c = i0Var;
        this.f4414b = x0Var;
        this.d = z0Var;
        this.f4416e = m0Var;
        this.f4417f = n0Var;
        this.h = y0Var;
        this.f4418n = o0Var;
        this.f4419r = tVar;
        this.f4420s = q0Var;
        this.v = s0Var;
        this.f4421w = p0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!n6.l.l(this.f4413a, fVar.f4413a) || !n6.l.l(this.f4414b, fVar.f4414b) || !n6.l.l(this.f4415c, fVar.f4415c) || !n6.l.l(this.d, fVar.d) || !n6.l.l(this.f4416e, fVar.f4416e) || !n6.l.l(this.f4417f, fVar.f4417f) || !n6.l.l(this.h, fVar.h) || !n6.l.l(this.f4418n, fVar.f4418n) || !n6.l.l(this.f4419r, fVar.f4419r) || !n6.l.l(this.f4420s, fVar.f4420s) || !n6.l.l(this.v, fVar.v) || !n6.l.l(this.f4421w, fVar.f4421w)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4413a, this.f4414b, this.f4415c, this.d, this.f4416e, this.f4417f, this.h, this.f4418n, this.f4419r, this.f4420s, this.v, this.f4421w});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4413a);
        String valueOf2 = String.valueOf(this.f4414b);
        String valueOf3 = String.valueOf(this.f4415c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.f4416e);
        String valueOf6 = String.valueOf(this.f4417f);
        String valueOf7 = String.valueOf(this.h);
        String valueOf8 = String.valueOf(this.f4418n);
        String valueOf9 = String.valueOf(this.f4419r);
        String valueOf10 = String.valueOf(this.f4420s);
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
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.k(parcel, 2, this.f4413a, i10);
        w7.g0.k(parcel, 3, this.f4414b, i10);
        w7.g0.k(parcel, 4, this.f4415c, i10);
        w7.g0.k(parcel, 5, this.d, i10);
        w7.g0.k(parcel, 6, this.f4416e, i10);
        w7.g0.k(parcel, 7, this.f4417f, i10);
        w7.g0.k(parcel, 8, this.h, i10);
        w7.g0.k(parcel, 9, this.f4418n, i10);
        w7.g0.k(parcel, 10, this.f4419r, i10);
        w7.g0.k(parcel, 11, this.f4420s, i10);
        w7.g0.k(parcel, 12, this.v, i10);
        w7.g0.k(parcel, 13, this.f4421w, i10);
        w7.g0.r(parcel, q6);
    }
}
