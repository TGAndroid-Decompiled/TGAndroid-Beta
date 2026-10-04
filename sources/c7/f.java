package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new r0(11);
    public final s f4414a;
    public final x0 f4415b;
    public final i0 f4416c;
    public final z0 d;
    public final m0 f4417e;
    public final n0 f4418f;
    public final y0 h;
    public final o0 f4419n;
    public final t f4420r;
    public final q0 f4421s;
    public final s0 v;
    public final p0 f4422w;

    public f(s sVar, x0 x0Var, i0 i0Var, z0 z0Var, m0 m0Var, n0 n0Var, y0 y0Var, o0 o0Var, t tVar, q0 q0Var, s0 s0Var, p0 p0Var) {
        this.f4414a = sVar;
        this.f4416c = i0Var;
        this.f4415b = x0Var;
        this.d = z0Var;
        this.f4417e = m0Var;
        this.f4418f = n0Var;
        this.h = y0Var;
        this.f4419n = o0Var;
        this.f4420r = tVar;
        this.f4421s = q0Var;
        this.v = s0Var;
        this.f4422w = p0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!n6.l.l(this.f4414a, fVar.f4414a) || !n6.l.l(this.f4415b, fVar.f4415b) || !n6.l.l(this.f4416c, fVar.f4416c) || !n6.l.l(this.d, fVar.d) || !n6.l.l(this.f4417e, fVar.f4417e) || !n6.l.l(this.f4418f, fVar.f4418f) || !n6.l.l(this.h, fVar.h) || !n6.l.l(this.f4419n, fVar.f4419n) || !n6.l.l(this.f4420r, fVar.f4420r) || !n6.l.l(this.f4421s, fVar.f4421s) || !n6.l.l(this.v, fVar.v) || !n6.l.l(this.f4422w, fVar.f4422w)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4414a, this.f4415b, this.f4416c, this.d, this.f4417e, this.f4418f, this.h, this.f4419n, this.f4420r, this.f4421s, this.v, this.f4422w});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4414a);
        String valueOf2 = String.valueOf(this.f4415b);
        String valueOf3 = String.valueOf(this.f4416c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.f4417e);
        String valueOf6 = String.valueOf(this.f4418f);
        String valueOf7 = String.valueOf(this.h);
        String valueOf8 = String.valueOf(this.f4419n);
        String valueOf9 = String.valueOf(this.f4420r);
        String valueOf10 = String.valueOf(this.f4421s);
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
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.k(parcel, 2, this.f4414a, i10);
        w7.g0.k(parcel, 3, this.f4415b, i10);
        w7.g0.k(parcel, 4, this.f4416c, i10);
        w7.g0.k(parcel, 5, this.d, i10);
        w7.g0.k(parcel, 6, this.f4417e, i10);
        w7.g0.k(parcel, 7, this.f4418f, i10);
        w7.g0.k(parcel, 8, this.h, i10);
        w7.g0.k(parcel, 9, this.f4419n, i10);
        w7.g0.k(parcel, 10, this.f4420r, i10);
        w7.g0.k(parcel, 11, this.f4421s, i10);
        w7.g0.k(parcel, 12, this.v, i10);
        w7.g0.k(parcel, 13, this.f4422w, i10);
        w7.g0.r(parcel, q6);
    }
}
