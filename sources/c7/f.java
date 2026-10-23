package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new r0(11);
    public final s f4949a;
    public final x0 f4950b;
    public final i0 f4951c;
    public final z0 d;
    public final m0 e;
    public final n0 f4952f;
    public final y0 h;
    public final o0 f4953n;
    public final t f4954r;
    public final q0 f4955s;
    public final s0 v;
    public final p0 f4956w;

    public f(s sVar, x0 x0Var, i0 i0Var, z0 z0Var, m0 m0Var, n0 n0Var, y0 y0Var, o0 o0Var, t tVar, q0 q0Var, s0 s0Var, p0 p0Var) {
        this.f4949a = sVar;
        this.f4951c = i0Var;
        this.f4950b = x0Var;
        this.d = z0Var;
        this.e = m0Var;
        this.f4952f = n0Var;
        this.h = y0Var;
        this.f4953n = o0Var;
        this.f4954r = tVar;
        this.f4955s = q0Var;
        this.v = s0Var;
        this.f4956w = p0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!n6.l.l(this.f4949a, fVar.f4949a) || !n6.l.l(this.f4950b, fVar.f4950b) || !n6.l.l(this.f4951c, fVar.f4951c) || !n6.l.l(this.d, fVar.d) || !n6.l.l(this.e, fVar.e) || !n6.l.l(this.f4952f, fVar.f4952f) || !n6.l.l(this.h, fVar.h) || !n6.l.l(this.f4953n, fVar.f4953n) || !n6.l.l(this.f4954r, fVar.f4954r) || !n6.l.l(this.f4955s, fVar.f4955s) || !n6.l.l(this.v, fVar.v) || !n6.l.l(this.f4956w, fVar.f4956w)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4949a, this.f4950b, this.f4951c, this.d, this.e, this.f4952f, this.h, this.f4953n, this.f4954r, this.f4955s, this.v, this.f4956w});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4949a);
        String valueOf2 = String.valueOf(this.f4950b);
        String valueOf3 = String.valueOf(this.f4951c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f4952f);
        String valueOf7 = String.valueOf(this.h);
        String valueOf8 = String.valueOf(this.f4953n);
        String valueOf9 = String.valueOf(this.f4954r);
        String valueOf10 = String.valueOf(this.f4955s);
        String valueOf11 = String.valueOf(this.v);
        StringBuilder w9 = a1.g.w("AuthenticationExtensions{\n fidoAppIdExtension=", valueOf, ", \n cableAuthenticationExtension=", valueOf2, ", \n userVerificationMethodExtension=");
        a1.g.A(w9, valueOf3, ", \n googleMultiAssertionExtension=", valueOf4, ", \n googleSessionIdExtension=");
        a1.g.A(w9, valueOf5, ", \n googleSilentVerificationExtension=", valueOf6, ", \n devicePublicKeyExtension=");
        a1.g.A(w9, valueOf7, ", \n googleTunnelServerIdExtension=", valueOf8, ", \n googleThirdPartyPaymentExtension=");
        a1.g.A(w9, valueOf9, ", \n prfExtension=", valueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return a1.g.s(w9, valueOf11, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.k(parcel, 2, this.f4949a, i10);
        w7.f0.k(parcel, 3, this.f4950b, i10);
        w7.f0.k(parcel, 4, this.f4951c, i10);
        w7.f0.k(parcel, 5, this.d, i10);
        w7.f0.k(parcel, 6, this.e, i10);
        w7.f0.k(parcel, 7, this.f4952f, i10);
        w7.f0.k(parcel, 8, this.h, i10);
        w7.f0.k(parcel, 9, this.f4953n, i10);
        w7.f0.k(parcel, 10, this.f4954r, i10);
        w7.f0.k(parcel, 11, this.f4955s, i10);
        w7.f0.k(parcel, 12, this.v, i10);
        w7.f0.k(parcel, 13, this.f4956w, i10);
        w7.f0.r(parcel, q6);
    }
}
