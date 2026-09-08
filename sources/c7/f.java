package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new r0(11);
    public final s f4634a;
    public final x0 f4635b;
    public final i0 f4636c;
    public final z0 d;
    public final m0 f4637e;
    public final n0 f4638f;
    public final y0 h;
    public final o0 f4639n;
    public final t f4640r;
    public final q0 f4641s;
    public final s0 v;
    public final p0 f4642w;

    public f(s sVar, x0 x0Var, i0 i0Var, z0 z0Var, m0 m0Var, n0 n0Var, y0 y0Var, o0 o0Var, t tVar, q0 q0Var, s0 s0Var, p0 p0Var) {
        this.f4634a = sVar;
        this.f4636c = i0Var;
        this.f4635b = x0Var;
        this.d = z0Var;
        this.f4637e = m0Var;
        this.f4638f = n0Var;
        this.h = y0Var;
        this.f4639n = o0Var;
        this.f4640r = tVar;
        this.f4641s = q0Var;
        this.v = s0Var;
        this.f4642w = p0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!n6.l.l(this.f4634a, fVar.f4634a) || !n6.l.l(this.f4635b, fVar.f4635b) || !n6.l.l(this.f4636c, fVar.f4636c) || !n6.l.l(this.d, fVar.d) || !n6.l.l(this.f4637e, fVar.f4637e) || !n6.l.l(this.f4638f, fVar.f4638f) || !n6.l.l(this.h, fVar.h) || !n6.l.l(this.f4639n, fVar.f4639n) || !n6.l.l(this.f4640r, fVar.f4640r) || !n6.l.l(this.f4641s, fVar.f4641s) || !n6.l.l(this.v, fVar.v) || !n6.l.l(this.f4642w, fVar.f4642w)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4634a, this.f4635b, this.f4636c, this.d, this.f4637e, this.f4638f, this.h, this.f4639n, this.f4640r, this.f4641s, this.v, this.f4642w});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4634a);
        String valueOf2 = String.valueOf(this.f4635b);
        String valueOf3 = String.valueOf(this.f4636c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.f4637e);
        String valueOf6 = String.valueOf(this.f4638f);
        String valueOf7 = String.valueOf(this.h);
        String valueOf8 = String.valueOf(this.f4639n);
        String valueOf9 = String.valueOf(this.f4640r);
        String valueOf10 = String.valueOf(this.f4641s);
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
        w7.e0.k(parcel, 2, this.f4634a, i10);
        w7.e0.k(parcel, 3, this.f4635b, i10);
        w7.e0.k(parcel, 4, this.f4636c, i10);
        w7.e0.k(parcel, 5, this.d, i10);
        w7.e0.k(parcel, 6, this.f4637e, i10);
        w7.e0.k(parcel, 7, this.f4638f, i10);
        w7.e0.k(parcel, 8, this.h, i10);
        w7.e0.k(parcel, 9, this.f4639n, i10);
        w7.e0.k(parcel, 10, this.f4640r, i10);
        w7.e0.k(parcel, 11, this.f4641s, i10);
        w7.e0.k(parcel, 12, this.v, i10);
        w7.e0.k(parcel, 13, this.f4642w, i10);
        w7.e0.r(parcel, q6);
    }
}
