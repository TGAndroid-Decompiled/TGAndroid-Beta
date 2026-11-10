package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new t0(0);
    public final s f11372a;
    public final x0 f11373b;
    public final i0 f11374c;
    public final z0 d;
    public final m0 f11375e;
    public final n0 f11376f;
    public final y0 h;
    public final o0 f11377n;
    public final t f11378r;
    public final q0 f11379s;
    public final r0 f11380w;
    public final p0 f11381x;

    public f(s sVar, x0 x0Var, i0 i0Var, z0 z0Var, m0 m0Var, n0 n0Var, y0 y0Var, o0 o0Var, t tVar, q0 q0Var, r0 r0Var, p0 p0Var) {
        this.f11372a = sVar;
        this.f11374c = i0Var;
        this.f11373b = x0Var;
        this.d = z0Var;
        this.f11375e = m0Var;
        this.f11376f = n0Var;
        this.h = y0Var;
        this.f11377n = o0Var;
        this.f11378r = tVar;
        this.f11379s = q0Var;
        this.f11380w = r0Var;
        this.f11381x = p0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!q6.m.k(this.f11372a, fVar.f11372a) || !q6.m.k(this.f11373b, fVar.f11373b) || !q6.m.k(this.f11374c, fVar.f11374c) || !q6.m.k(this.d, fVar.d) || !q6.m.k(this.f11375e, fVar.f11375e) || !q6.m.k(this.f11376f, fVar.f11376f) || !q6.m.k(this.h, fVar.h) || !q6.m.k(this.f11377n, fVar.f11377n) || !q6.m.k(this.f11378r, fVar.f11378r) || !q6.m.k(this.f11379s, fVar.f11379s) || !q6.m.k(this.f11380w, fVar.f11380w) || !q6.m.k(this.f11381x, fVar.f11381x)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11372a, this.f11373b, this.f11374c, this.d, this.f11375e, this.f11376f, this.h, this.f11377n, this.f11378r, this.f11379s, this.f11380w, this.f11381x});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11372a);
        String valueOf2 = String.valueOf(this.f11373b);
        String valueOf3 = String.valueOf(this.f11374c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.f11375e);
        String valueOf6 = String.valueOf(this.f11376f);
        String valueOf7 = String.valueOf(this.h);
        String valueOf8 = String.valueOf(this.f11377n);
        String valueOf9 = String.valueOf(this.f11378r);
        String valueOf10 = String.valueOf(this.f11379s);
        String valueOf11 = String.valueOf(this.f11380w);
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
        xb.k(parcel, 2, this.f11372a, i7);
        xb.k(parcel, 3, this.f11373b, i7);
        xb.k(parcel, 4, this.f11374c, i7);
        xb.k(parcel, 5, this.d, i7);
        xb.k(parcel, 6, this.f11375e, i7);
        xb.k(parcel, 7, this.f11376f, i7);
        xb.k(parcel, 8, this.h, i7);
        xb.k(parcel, 9, this.f11377n, i7);
        xb.k(parcel, 10, this.f11378r, i7);
        xb.k(parcel, 11, this.f11379s, i7);
        xb.k(parcel, 12, this.f11380w, i7);
        xb.k(parcel, 13, this.f11381x, i7);
        xb.s(parcel, r10);
    }
}
