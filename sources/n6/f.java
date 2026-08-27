package n6;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;

public final class f extends z5.a {
    public static final Parcelable.Creator<f> CREATOR = new o0(22);

    public final s f18346a;

    public final y0 f18347b;

    public final i0 f18348c;
    public final a1 d;

    public final m0 f18349e;

    public final n0 f18350f;
    public final z0 h;

    public final p0 f18351n;

    public final t f18352r;

    public final r0 f18353s;
    public final s0 v;

    public final q0 f18354w;

    public f(s sVar, y0 y0Var, i0 i0Var, a1 a1Var, m0 m0Var, n0 n0Var, z0 z0Var, p0 p0Var, t tVar, r0 r0Var, s0 s0Var, q0 q0Var) {
        this.f18346a = sVar;
        this.f18348c = i0Var;
        this.f18347b = y0Var;
        this.d = a1Var;
        this.f18349e = m0Var;
        this.f18350f = n0Var;
        this.h = z0Var;
        this.f18351n = p0Var;
        this.f18352r = tVar;
        this.f18353s = r0Var;
        this.v = s0Var;
        this.f18354w = q0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return y5.l.l(this.f18346a, fVar.f18346a) && y5.l.l(this.f18347b, fVar.f18347b) && y5.l.l(this.f18348c, fVar.f18348c) && y5.l.l(this.d, fVar.d) && y5.l.l(this.f18349e, fVar.f18349e) && y5.l.l(this.f18350f, fVar.f18350f) && y5.l.l(this.h, fVar.h) && y5.l.l(this.f18351n, fVar.f18351n) && y5.l.l(this.f18352r, fVar.f18352r) && y5.l.l(this.f18353s, fVar.f18353s) && y5.l.l(this.v, fVar.v) && y5.l.l(this.f18354w, fVar.f18354w);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18346a, this.f18347b, this.f18348c, this.d, this.f18349e, this.f18350f, this.h, this.f18351n, this.f18352r, this.f18353s, this.v, this.f18354w});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f18346a);
        String strValueOf2 = String.valueOf(this.f18347b);
        String strValueOf3 = String.valueOf(this.f18348c);
        String strValueOf4 = String.valueOf(this.d);
        String strValueOf5 = String.valueOf(this.f18349e);
        String strValueOf6 = String.valueOf(this.f18350f);
        String strValueOf7 = String.valueOf(this.h);
        String strValueOf8 = String.valueOf(this.f18351n);
        String strValueOf9 = String.valueOf(this.f18352r);
        String strValueOf10 = String.valueOf(this.f18353s);
        String strValueOf11 = String.valueOf(this.v);
        StringBuilder sbP = i0.a.p("AuthenticationExtensions{\n fidoAppIdExtension=", strValueOf, ", \n cableAuthenticationExtension=", strValueOf2, ", \n userVerificationMethodExtension=");
        i0.a.z(sbP, strValueOf3, ", \n googleMultiAssertionExtension=", strValueOf4, ", \n googleSessionIdExtension=");
        i0.a.z(sbP, strValueOf5, ", \n googleSilentVerificationExtension=", strValueOf6, ", \n devicePublicKeyExtension=");
        i0.a.z(sbP, strValueOf7, ", \n googleTunnelServerIdExtension=", strValueOf8, ", \n googleThirdPartyPaymentExtension=");
        i0.a.z(sbP, strValueOf9, ", \n prfExtension=", strValueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return a9.p.p(sbP, strValueOf11, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.k(parcel, 2, this.f18346a, i10);
        r8.k(parcel, 3, this.f18347b, i10);
        r8.k(parcel, 4, this.f18348c, i10);
        r8.k(parcel, 5, this.d, i10);
        r8.k(parcel, 6, this.f18349e, i10);
        r8.k(parcel, 7, this.f18350f, i10);
        r8.k(parcel, 8, this.h, i10);
        r8.k(parcel, 9, this.f18351n, i10);
        r8.k(parcel, 10, this.f18352r, i10);
        r8.k(parcel, 11, this.f18353s, i10);
        r8.k(parcel, 12, this.v, i10);
        r8.k(parcel, 13, this.f18354w, i10);
        r8.r(parcel, iQ);
    }
}
