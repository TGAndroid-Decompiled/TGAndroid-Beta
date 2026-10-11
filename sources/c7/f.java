package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new r0(11);
    public final s f4463a;
    public final x0 f4464b;
    public final i0 f4465c;
    public final z0 d;
    public final m0 f4466e;
    public final n0 f4467f;
    public final y0 h;
    public final o0 f4468n;
    public final t f4469r;
    public final q0 f4470s;
    public final s0 v;
    public final p0 f4471w;

    public f(s sVar, x0 x0Var, i0 i0Var, z0 z0Var, m0 m0Var, n0 n0Var, y0 y0Var, o0 o0Var, t tVar, q0 q0Var, s0 s0Var, p0 p0Var) {
        this.f4463a = sVar;
        this.f4465c = i0Var;
        this.f4464b = x0Var;
        this.d = z0Var;
        this.f4466e = m0Var;
        this.f4467f = n0Var;
        this.h = y0Var;
        this.f4468n = o0Var;
        this.f4469r = tVar;
        this.f4470s = q0Var;
        this.v = s0Var;
        this.f4471w = p0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!n6.m.l(this.f4463a, fVar.f4463a) || !n6.m.l(this.f4464b, fVar.f4464b) || !n6.m.l(this.f4465c, fVar.f4465c) || !n6.m.l(this.d, fVar.d) || !n6.m.l(this.f4466e, fVar.f4466e) || !n6.m.l(this.f4467f, fVar.f4467f) || !n6.m.l(this.h, fVar.h) || !n6.m.l(this.f4468n, fVar.f4468n) || !n6.m.l(this.f4469r, fVar.f4469r) || !n6.m.l(this.f4470s, fVar.f4470s) || !n6.m.l(this.v, fVar.v) || !n6.m.l(this.f4471w, fVar.f4471w)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4463a, this.f4464b, this.f4465c, this.d, this.f4466e, this.f4467f, this.h, this.f4468n, this.f4469r, this.f4470s, this.v, this.f4471w});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4463a);
        String valueOf2 = String.valueOf(this.f4464b);
        String valueOf3 = String.valueOf(this.f4465c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.f4466e);
        String valueOf6 = String.valueOf(this.f4467f);
        String valueOf7 = String.valueOf(this.h);
        String valueOf8 = String.valueOf(this.f4468n);
        String valueOf9 = String.valueOf(this.f4469r);
        String valueOf10 = String.valueOf(this.f4470s);
        String valueOf11 = String.valueOf(this.v);
        StringBuilder x10 = a1.g.x("AuthenticationExtensions{\n fidoAppIdExtension=", valueOf, ", \n cableAuthenticationExtension=", valueOf2, ", \n userVerificationMethodExtension=");
        a1.g.A(x10, valueOf3, ", \n googleMultiAssertionExtension=", valueOf4, ", \n googleSessionIdExtension=");
        a1.g.A(x10, valueOf5, ", \n googleSilentVerificationExtension=", valueOf6, ", \n devicePublicKeyExtension=");
        a1.g.A(x10, valueOf7, ", \n googleTunnelServerIdExtension=", valueOf8, ", \n googleThirdPartyPaymentExtension=");
        a1.g.A(x10, valueOf9, ", \n prfExtension=", valueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return a1.g.t(x10, valueOf11, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.k(parcel, 2, this.f4463a, i10);
        w7.d0.k(parcel, 3, this.f4464b, i10);
        w7.d0.k(parcel, 4, this.f4465c, i10);
        w7.d0.k(parcel, 5, this.d, i10);
        w7.d0.k(parcel, 6, this.f4466e, i10);
        w7.d0.k(parcel, 7, this.f4467f, i10);
        w7.d0.k(parcel, 8, this.h, i10);
        w7.d0.k(parcel, 9, this.f4468n, i10);
        w7.d0.k(parcel, 10, this.f4469r, i10);
        w7.d0.k(parcel, 11, this.f4470s, i10);
        w7.d0.k(parcel, 12, this.v, i10);
        w7.d0.k(parcel, 13, this.f4471w, i10);
        w7.d0.r(parcel, q6);
    }
}
