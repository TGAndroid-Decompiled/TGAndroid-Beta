package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new r0(11);
    public final s f4502a;
    public final x0 f4503b;
    public final i0 f4504c;
    public final z0 d;
    public final m0 e;
    public final n0 f4505f;
    public final y0 h;
    public final o0 f4506n;
    public final t f4507r;
    public final q0 f4508s;
    public final s0 v;
    public final p0 f4509w;

    public f(s sVar, x0 x0Var, i0 i0Var, z0 z0Var, m0 m0Var, n0 n0Var, y0 y0Var, o0 o0Var, t tVar, q0 q0Var, s0 s0Var, p0 p0Var) {
        this.f4502a = sVar;
        this.f4504c = i0Var;
        this.f4503b = x0Var;
        this.d = z0Var;
        this.e = m0Var;
        this.f4505f = n0Var;
        this.h = y0Var;
        this.f4506n = o0Var;
        this.f4507r = tVar;
        this.f4508s = q0Var;
        this.v = s0Var;
        this.f4509w = p0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!n6.l.l(this.f4502a, fVar.f4502a) || !n6.l.l(this.f4503b, fVar.f4503b) || !n6.l.l(this.f4504c, fVar.f4504c) || !n6.l.l(this.d, fVar.d) || !n6.l.l(this.e, fVar.e) || !n6.l.l(this.f4505f, fVar.f4505f) || !n6.l.l(this.h, fVar.h) || !n6.l.l(this.f4506n, fVar.f4506n) || !n6.l.l(this.f4507r, fVar.f4507r) || !n6.l.l(this.f4508s, fVar.f4508s) || !n6.l.l(this.v, fVar.v) || !n6.l.l(this.f4509w, fVar.f4509w)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4502a, this.f4503b, this.f4504c, this.d, this.e, this.f4505f, this.h, this.f4506n, this.f4507r, this.f4508s, this.v, this.f4509w});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4502a);
        String valueOf2 = String.valueOf(this.f4503b);
        String valueOf3 = String.valueOf(this.f4504c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f4505f);
        String valueOf7 = String.valueOf(this.h);
        String valueOf8 = String.valueOf(this.f4506n);
        String valueOf9 = String.valueOf(this.f4507r);
        String valueOf10 = String.valueOf(this.f4508s);
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
        w7.e0.k(parcel, 2, this.f4502a, i10);
        w7.e0.k(parcel, 3, this.f4503b, i10);
        w7.e0.k(parcel, 4, this.f4504c, i10);
        w7.e0.k(parcel, 5, this.d, i10);
        w7.e0.k(parcel, 6, this.e, i10);
        w7.e0.k(parcel, 7, this.f4505f, i10);
        w7.e0.k(parcel, 8, this.h, i10);
        w7.e0.k(parcel, 9, this.f4506n, i10);
        w7.e0.k(parcel, 10, this.f4507r, i10);
        w7.e0.k(parcel, 11, this.f4508s, i10);
        w7.e0.k(parcel, 12, this.v, i10);
        w7.e0.k(parcel, 13, this.f4509w, i10);
        w7.e0.r(parcel, q6);
    }
}
