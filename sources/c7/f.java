package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new r0(11);
    public final s f3976a;
    public final x0 f3977b;
    public final i0 f3978c;
    public final z0 d;
    public final m0 e;
    public final n0 f3979f;
    public final y0 h;
    public final o0 f3980n;
    public final t f3981r;
    public final q0 f3982s;
    public final s0 f3983w;
    public final p0 f3984x;

    public f(s sVar, x0 x0Var, i0 i0Var, z0 z0Var, m0 m0Var, n0 n0Var, y0 y0Var, o0 o0Var, t tVar, q0 q0Var, s0 s0Var, p0 p0Var) {
        this.f3976a = sVar;
        this.f3978c = i0Var;
        this.f3977b = x0Var;
        this.d = z0Var;
        this.e = m0Var;
        this.f3979f = n0Var;
        this.h = y0Var;
        this.f3980n = o0Var;
        this.f3981r = tVar;
        this.f3982s = q0Var;
        this.f3983w = s0Var;
        this.f3984x = p0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!n6.l.k(this.f3976a, fVar.f3976a) || !n6.l.k(this.f3977b, fVar.f3977b) || !n6.l.k(this.f3978c, fVar.f3978c) || !n6.l.k(this.d, fVar.d) || !n6.l.k(this.e, fVar.e) || !n6.l.k(this.f3979f, fVar.f3979f) || !n6.l.k(this.h, fVar.h) || !n6.l.k(this.f3980n, fVar.f3980n) || !n6.l.k(this.f3981r, fVar.f3981r) || !n6.l.k(this.f3982s, fVar.f3982s) || !n6.l.k(this.f3983w, fVar.f3983w) || !n6.l.k(this.f3984x, fVar.f3984x)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3976a, this.f3977b, this.f3978c, this.d, this.e, this.f3979f, this.h, this.f3980n, this.f3981r, this.f3982s, this.f3983w, this.f3984x});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f3976a);
        String valueOf2 = String.valueOf(this.f3977b);
        String valueOf3 = String.valueOf(this.f3978c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f3979f);
        String valueOf7 = String.valueOf(this.h);
        String valueOf8 = String.valueOf(this.f3980n);
        String valueOf9 = String.valueOf(this.f3981r);
        String valueOf10 = String.valueOf(this.f3982s);
        String valueOf11 = String.valueOf(this.f3983w);
        StringBuilder v = a1.g.v("AuthenticationExtensions{\n fidoAppIdExtension=", valueOf, ", \n cableAuthenticationExtension=", valueOf2, ", \n userVerificationMethodExtension=");
        c3.i0.r(v, valueOf3, ", \n googleMultiAssertionExtension=", valueOf4, ", \n googleSessionIdExtension=");
        c3.i0.r(v, valueOf5, ", \n googleSilentVerificationExtension=", valueOf6, ", \n devicePublicKeyExtension=");
        c3.i0.r(v, valueOf7, ", \n googleTunnelServerIdExtension=", valueOf8, ", \n googleThirdPartyPaymentExtension=");
        c3.i0.r(v, valueOf9, ", \n prfExtension=", valueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return a1.g.r(v, valueOf11, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.k(parcel, 2, this.f3976a, i10);
        w7.h0.k(parcel, 3, this.f3977b, i10);
        w7.h0.k(parcel, 4, this.f3978c, i10);
        w7.h0.k(parcel, 5, this.d, i10);
        w7.h0.k(parcel, 6, this.e, i10);
        w7.h0.k(parcel, 7, this.f3979f, i10);
        w7.h0.k(parcel, 8, this.h, i10);
        w7.h0.k(parcel, 9, this.f3980n, i10);
        w7.h0.k(parcel, 10, this.f3981r, i10);
        w7.h0.k(parcel, 11, this.f3982s, i10);
        w7.h0.k(parcel, 12, this.f3983w, i10);
        w7.h0.k(parcel, 13, this.f3984x, i10);
        w7.h0.r(parcel, q6);
    }
}
