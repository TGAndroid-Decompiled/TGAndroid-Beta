package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new r0(11);
    public final s f4607a;
    public final x0 f4608b;
    public final i0 f4609c;
    public final z0 d;
    public final m0 f4610e;
    public final n0 f4611f;
    public final y0 h;
    public final o0 f4612n;
    public final t f4613r;
    public final q0 f4614s;
    public final s0 v;
    public final p0 f4615w;

    public f(s sVar, x0 x0Var, i0 i0Var, z0 z0Var, m0 m0Var, n0 n0Var, y0 y0Var, o0 o0Var, t tVar, q0 q0Var, s0 s0Var, p0 p0Var) {
        this.f4607a = sVar;
        this.f4609c = i0Var;
        this.f4608b = x0Var;
        this.d = z0Var;
        this.f4610e = m0Var;
        this.f4611f = n0Var;
        this.h = y0Var;
        this.f4612n = o0Var;
        this.f4613r = tVar;
        this.f4614s = q0Var;
        this.v = s0Var;
        this.f4615w = p0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!n6.l.l(this.f4607a, fVar.f4607a) || !n6.l.l(this.f4608b, fVar.f4608b) || !n6.l.l(this.f4609c, fVar.f4609c) || !n6.l.l(this.d, fVar.d) || !n6.l.l(this.f4610e, fVar.f4610e) || !n6.l.l(this.f4611f, fVar.f4611f) || !n6.l.l(this.h, fVar.h) || !n6.l.l(this.f4612n, fVar.f4612n) || !n6.l.l(this.f4613r, fVar.f4613r) || !n6.l.l(this.f4614s, fVar.f4614s) || !n6.l.l(this.v, fVar.v) || !n6.l.l(this.f4615w, fVar.f4615w)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4607a, this.f4608b, this.f4609c, this.d, this.f4610e, this.f4611f, this.h, this.f4612n, this.f4613r, this.f4614s, this.v, this.f4615w});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4607a);
        String valueOf2 = String.valueOf(this.f4608b);
        String valueOf3 = String.valueOf(this.f4609c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.f4610e);
        String valueOf6 = String.valueOf(this.f4611f);
        String valueOf7 = String.valueOf(this.h);
        String valueOf8 = String.valueOf(this.f4612n);
        String valueOf9 = String.valueOf(this.f4613r);
        String valueOf10 = String.valueOf(this.f4614s);
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
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.k(parcel, 2, this.f4607a, i10);
        w7.e0.k(parcel, 3, this.f4608b, i10);
        w7.e0.k(parcel, 4, this.f4609c, i10);
        w7.e0.k(parcel, 5, this.d, i10);
        w7.e0.k(parcel, 6, this.f4610e, i10);
        w7.e0.k(parcel, 7, this.f4611f, i10);
        w7.e0.k(parcel, 8, this.h, i10);
        w7.e0.k(parcel, 9, this.f4612n, i10);
        w7.e0.k(parcel, 10, this.f4613r, i10);
        w7.e0.k(parcel, 11, this.f4614s, i10);
        w7.e0.k(parcel, 12, this.v, i10);
        w7.e0.k(parcel, 13, this.f4615w, i10);
        w7.e0.r(parcel, q6);
    }
}
