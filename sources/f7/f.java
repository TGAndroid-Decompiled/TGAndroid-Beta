package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new t0(0);
    public final s f11367a;
    public final x0 f11368b;
    public final i0 f11369c;
    public final z0 d;
    public final m0 f11370e;
    public final n0 f11371f;
    public final y0 h;
    public final o0 f11372n;
    public final t f11373r;
    public final q0 f11374s;
    public final r0 f11375w;
    public final p0 f11376x;

    public f(s sVar, x0 x0Var, i0 i0Var, z0 z0Var, m0 m0Var, n0 n0Var, y0 y0Var, o0 o0Var, t tVar, q0 q0Var, r0 r0Var, p0 p0Var) {
        this.f11367a = sVar;
        this.f11369c = i0Var;
        this.f11368b = x0Var;
        this.d = z0Var;
        this.f11370e = m0Var;
        this.f11371f = n0Var;
        this.h = y0Var;
        this.f11372n = o0Var;
        this.f11373r = tVar;
        this.f11374s = q0Var;
        this.f11375w = r0Var;
        this.f11376x = p0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!q6.m.k(this.f11367a, fVar.f11367a) || !q6.m.k(this.f11368b, fVar.f11368b) || !q6.m.k(this.f11369c, fVar.f11369c) || !q6.m.k(this.d, fVar.d) || !q6.m.k(this.f11370e, fVar.f11370e) || !q6.m.k(this.f11371f, fVar.f11371f) || !q6.m.k(this.h, fVar.h) || !q6.m.k(this.f11372n, fVar.f11372n) || !q6.m.k(this.f11373r, fVar.f11373r) || !q6.m.k(this.f11374s, fVar.f11374s) || !q6.m.k(this.f11375w, fVar.f11375w) || !q6.m.k(this.f11376x, fVar.f11376x)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11367a, this.f11368b, this.f11369c, this.d, this.f11370e, this.f11371f, this.h, this.f11372n, this.f11373r, this.f11374s, this.f11375w, this.f11376x});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11367a);
        String valueOf2 = String.valueOf(this.f11368b);
        String valueOf3 = String.valueOf(this.f11369c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.f11370e);
        String valueOf6 = String.valueOf(this.f11371f);
        String valueOf7 = String.valueOf(this.h);
        String valueOf8 = String.valueOf(this.f11372n);
        String valueOf9 = String.valueOf(this.f11373r);
        String valueOf10 = String.valueOf(this.f11374s);
        String valueOf11 = String.valueOf(this.f11375w);
        StringBuilder n10 = com.google.android.recaptcha.internal.a.n("AuthenticationExtensions{\n fidoAppIdExtension=", valueOf, ", \n cableAuthenticationExtension=", valueOf2, ", \n userVerificationMethodExtension=");
        com.google.android.recaptcha.internal.a.s(n10, valueOf3, ", \n googleMultiAssertionExtension=", valueOf4, ", \n googleSessionIdExtension=");
        com.google.android.recaptcha.internal.a.s(n10, valueOf5, ", \n googleSilentVerificationExtension=", valueOf6, ", \n devicePublicKeyExtension=");
        com.google.android.recaptcha.internal.a.s(n10, valueOf7, ", \n googleTunnelServerIdExtension=", valueOf8, ", \n googleThirdPartyPaymentExtension=");
        com.google.android.recaptcha.internal.a.s(n10, valueOf9, ", \n prfExtension=", valueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return a8.p0.s(n10, valueOf11, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.k(parcel, 2, this.f11367a, i7);
        xb.k(parcel, 3, this.f11368b, i7);
        xb.k(parcel, 4, this.f11369c, i7);
        xb.k(parcel, 5, this.d, i7);
        xb.k(parcel, 6, this.f11370e, i7);
        xb.k(parcel, 7, this.f11371f, i7);
        xb.k(parcel, 8, this.h, i7);
        xb.k(parcel, 9, this.f11372n, i7);
        xb.k(parcel, 10, this.f11373r, i7);
        xb.k(parcel, 11, this.f11374s, i7);
        xb.k(parcel, 12, this.f11375w, i7);
        xb.k(parcel, 13, this.f11376x, i7);
        xb.s(parcel, r10);
    }
}
