package d7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class f extends p6.a {
    public static final Parcelable.Creator<f> CREATOR = new r0(12);
    public final s f8172a;
    public final x0 f8173b;
    public final i0 f8174c;
    public final z0 d;
    public final m0 e;
    public final n0 f8175f;
    public final y0 h;
    public final o0 f8176n;
    public final t f8177r;
    public final q0 f8178s;
    public final s0 v;
    public final p0 f8179w;

    public f(s sVar, x0 x0Var, i0 i0Var, z0 z0Var, m0 m0Var, n0 n0Var, y0 y0Var, o0 o0Var, t tVar, q0 q0Var, s0 s0Var, p0 p0Var) {
        this.f8172a = sVar;
        this.f8174c = i0Var;
        this.f8173b = x0Var;
        this.d = z0Var;
        this.e = m0Var;
        this.f8175f = n0Var;
        this.h = y0Var;
        this.f8176n = o0Var;
        this.f8177r = tVar;
        this.f8178s = q0Var;
        this.v = s0Var;
        this.f8179w = p0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!o6.l.l(this.f8172a, fVar.f8172a) || !o6.l.l(this.f8173b, fVar.f8173b) || !o6.l.l(this.f8174c, fVar.f8174c) || !o6.l.l(this.d, fVar.d) || !o6.l.l(this.e, fVar.e) || !o6.l.l(this.f8175f, fVar.f8175f) || !o6.l.l(this.h, fVar.h) || !o6.l.l(this.f8176n, fVar.f8176n) || !o6.l.l(this.f8177r, fVar.f8177r) || !o6.l.l(this.f8178s, fVar.f8178s) || !o6.l.l(this.v, fVar.v) || !o6.l.l(this.f8179w, fVar.f8179w)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8172a, this.f8173b, this.f8174c, this.d, this.e, this.f8175f, this.h, this.f8176n, this.f8177r, this.f8178s, this.v, this.f8179w});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f8172a);
        String valueOf2 = String.valueOf(this.f8173b);
        String valueOf3 = String.valueOf(this.f8174c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f8175f);
        String valueOf7 = String.valueOf(this.h);
        String valueOf8 = String.valueOf(this.f8176n);
        String valueOf9 = String.valueOf(this.f8177r);
        String valueOf10 = String.valueOf(this.f8178s);
        String valueOf11 = String.valueOf(this.v);
        StringBuilder w10 = a1.g.w("AuthenticationExtensions{\n fidoAppIdExtension=", valueOf, ", \n cableAuthenticationExtension=", valueOf2, ", \n userVerificationMethodExtension=");
        c3.h0.r(w10, valueOf3, ", \n googleMultiAssertionExtension=", valueOf4, ", \n googleSessionIdExtension=");
        c3.h0.r(w10, valueOf5, ", \n googleSilentVerificationExtension=", valueOf6, ", \n devicePublicKeyExtension=");
        c3.h0.r(w10, valueOf7, ", \n googleTunnelServerIdExtension=", valueOf8, ", \n googleThirdPartyPaymentExtension=");
        c3.h0.r(w10, valueOf9, ", \n prfExtension=", valueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return a1.g.s(w10, valueOf11, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.k(parcel, 2, this.f8172a, i10);
        df.k(parcel, 3, this.f8173b, i10);
        df.k(parcel, 4, this.f8174c, i10);
        df.k(parcel, 5, this.d, i10);
        df.k(parcel, 6, this.e, i10);
        df.k(parcel, 7, this.f8175f, i10);
        df.k(parcel, 8, this.h, i10);
        df.k(parcel, 9, this.f8176n, i10);
        df.k(parcel, 10, this.f8177r, i10);
        df.k(parcel, 11, this.f8178s, i10);
        df.k(parcel, 12, this.v, i10);
        df.k(parcel, 13, this.f8179w, i10);
        df.r(parcel, q5);
    }
}
