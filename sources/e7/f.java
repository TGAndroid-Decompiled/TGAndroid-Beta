package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class f extends q6.a {
    public static final Parcelable.Creator<f> CREATOR = new r0(15);
    public final s f9810a;
    public final x0 f9811b;
    public final i0 f9812c;
    public final z0 d;
    public final m0 f9813e;
    public final n0 f9814f;
    public final y0 h;
    public final o0 f9815n;
    public final t f9816r;
    public final q0 f9817s;
    public final s0 f9818w;
    public final p0 f9819x;

    public f(s sVar, x0 x0Var, i0 i0Var, z0 z0Var, m0 m0Var, n0 n0Var, y0 y0Var, o0 o0Var, t tVar, q0 q0Var, s0 s0Var, p0 p0Var) {
        this.f9810a = sVar;
        this.f9812c = i0Var;
        this.f9811b = x0Var;
        this.d = z0Var;
        this.f9813e = m0Var;
        this.f9814f = n0Var;
        this.h = y0Var;
        this.f9815n = o0Var;
        this.f9816r = tVar;
        this.f9817s = q0Var;
        this.f9818w = s0Var;
        this.f9819x = p0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!p6.m.k(this.f9810a, fVar.f9810a) || !p6.m.k(this.f9811b, fVar.f9811b) || !p6.m.k(this.f9812c, fVar.f9812c) || !p6.m.k(this.d, fVar.d) || !p6.m.k(this.f9813e, fVar.f9813e) || !p6.m.k(this.f9814f, fVar.f9814f) || !p6.m.k(this.h, fVar.h) || !p6.m.k(this.f9815n, fVar.f9815n) || !p6.m.k(this.f9816r, fVar.f9816r) || !p6.m.k(this.f9817s, fVar.f9817s) || !p6.m.k(this.f9818w, fVar.f9818w) || !p6.m.k(this.f9819x, fVar.f9819x)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9810a, this.f9811b, this.f9812c, this.d, this.f9813e, this.f9814f, this.h, this.f9815n, this.f9816r, this.f9817s, this.f9818w, this.f9819x});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f9810a);
        String valueOf2 = String.valueOf(this.f9811b);
        String valueOf3 = String.valueOf(this.f9812c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.f9813e);
        String valueOf6 = String.valueOf(this.f9814f);
        String valueOf7 = String.valueOf(this.h);
        String valueOf8 = String.valueOf(this.f9815n);
        String valueOf9 = String.valueOf(this.f9816r);
        String valueOf10 = String.valueOf(this.f9817s);
        String valueOf11 = String.valueOf(this.f9818w);
        StringBuilder n4 = com.google.android.recaptcha.internal.a.n("AuthenticationExtensions{\n fidoAppIdExtension=", valueOf, ", \n cableAuthenticationExtension=", valueOf2, ", \n userVerificationMethodExtension=");
        com.google.android.recaptcha.internal.a.s(n4, valueOf3, ", \n googleMultiAssertionExtension=", valueOf4, ", \n googleSessionIdExtension=");
        com.google.android.recaptcha.internal.a.s(n4, valueOf5, ", \n googleSilentVerificationExtension=", valueOf6, ", \n devicePublicKeyExtension=");
        com.google.android.recaptcha.internal.a.s(n4, valueOf7, ", \n googleTunnelServerIdExtension=", valueOf8, ", \n googleThirdPartyPaymentExtension=");
        com.google.android.recaptcha.internal.a.s(n4, valueOf9, ", \n prfExtension=", valueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return a1.g.s(n4, valueOf11, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.l(parcel, 2, this.f9810a, i3);
        j8.a.l(parcel, 3, this.f9811b, i3);
        j8.a.l(parcel, 4, this.f9812c, i3);
        j8.a.l(parcel, 5, this.d, i3);
        j8.a.l(parcel, 6, this.f9813e, i3);
        j8.a.l(parcel, 7, this.f9814f, i3);
        j8.a.l(parcel, 8, this.h, i3);
        j8.a.l(parcel, 9, this.f9815n, i3);
        j8.a.l(parcel, 10, this.f9816r, i3);
        j8.a.l(parcel, 11, this.f9817s, i3);
        j8.a.l(parcel, 12, this.f9818w, i3);
        j8.a.l(parcel, 13, this.f9819x, i3);
        j8.a.t(parcel, s6);
    }
}
