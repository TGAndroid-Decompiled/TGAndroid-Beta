package m6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
public final class f extends y5.a {
    public static final Parcelable.Creator<f> CREATOR = new r0(11);
    public final s f17510a;
    public final x0 f17511b;
    public final i0 f17512c;
    public final z0 d;
    public final m0 f17513e;
    public final n0 f17514f;
    public final y0 h;
    public final o0 f17515n;
    public final t f17516r;
    public final q0 f17517s;
    public final s0 v;
    public final p0 f17518w;

    public f(s sVar, x0 x0Var, i0 i0Var, z0 z0Var, m0 m0Var, n0 n0Var, y0 y0Var, o0 o0Var, t tVar, q0 q0Var, s0 s0Var, p0 p0Var) {
        this.f17510a = sVar;
        this.f17512c = i0Var;
        this.f17511b = x0Var;
        this.d = z0Var;
        this.f17513e = m0Var;
        this.f17514f = n0Var;
        this.h = y0Var;
        this.f17515n = o0Var;
        this.f17516r = tVar;
        this.f17517s = q0Var;
        this.v = s0Var;
        this.f17518w = p0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!x5.l.l(this.f17510a, fVar.f17510a) || !x5.l.l(this.f17511b, fVar.f17511b) || !x5.l.l(this.f17512c, fVar.f17512c) || !x5.l.l(this.d, fVar.d) || !x5.l.l(this.f17513e, fVar.f17513e) || !x5.l.l(this.f17514f, fVar.f17514f) || !x5.l.l(this.h, fVar.h) || !x5.l.l(this.f17515n, fVar.f17515n) || !x5.l.l(this.f17516r, fVar.f17516r) || !x5.l.l(this.f17517s, fVar.f17517s) || !x5.l.l(this.v, fVar.v) || !x5.l.l(this.f17518w, fVar.f17518w)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17510a, this.f17511b, this.f17512c, this.d, this.f17513e, this.f17514f, this.h, this.f17515n, this.f17516r, this.f17517s, this.v, this.f17518w});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f17510a);
        String valueOf2 = String.valueOf(this.f17511b);
        String valueOf3 = String.valueOf(this.f17512c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.f17513e);
        String valueOf6 = String.valueOf(this.f17514f);
        String valueOf7 = String.valueOf(this.h);
        String valueOf8 = String.valueOf(this.f17515n);
        String valueOf9 = String.valueOf(this.f17516r);
        String valueOf10 = String.valueOf(this.f17517s);
        String valueOf11 = String.valueOf(this.v);
        StringBuilder q10 = j3.r0.q("AuthenticationExtensions{\n fidoAppIdExtension=", valueOf, ", \n cableAuthenticationExtension=", valueOf2, ", \n userVerificationMethodExtension=");
        j3.r0.A(q10, valueOf3, ", \n googleMultiAssertionExtension=", valueOf4, ", \n googleSessionIdExtension=");
        j3.r0.A(q10, valueOf5, ", \n googleSilentVerificationExtension=", valueOf6, ", \n devicePublicKeyExtension=");
        j3.r0.A(q10, valueOf7, ", \n googleTunnelServerIdExtension=", valueOf8, ", \n googleThirdPartyPaymentExtension=");
        j3.r0.A(q10, valueOf9, ", \n prfExtension=", valueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return aa.d.r(q10, valueOf11, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.k(parcel, 2, this.f17510a, i9);
        p8.k(parcel, 3, this.f17511b, i9);
        p8.k(parcel, 4, this.f17512c, i9);
        p8.k(parcel, 5, this.d, i9);
        p8.k(parcel, 6, this.f17513e, i9);
        p8.k(parcel, 7, this.f17514f, i9);
        p8.k(parcel, 8, this.h, i9);
        p8.k(parcel, 9, this.f17515n, i9);
        p8.k(parcel, 10, this.f17516r, i9);
        p8.k(parcel, 11, this.f17517s, i9);
        p8.k(parcel, 12, this.v, i9);
        p8.k(parcel, 13, this.f17518w, i9);
        p8.r(parcel, q10);
    }
}
