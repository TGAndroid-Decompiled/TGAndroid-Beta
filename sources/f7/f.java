package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.internal.vision.e2;
import java.util.Arrays;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new t0(0);
    public final s f11181a;
    public final x0 f11182b;
    public final i0 f11183c;
    public final z0 d;
    public final m0 f11184e;
    public final n0 f11185f;
    public final y0 h;
    public final o0 f11186n;
    public final t f11187r;
    public final q0 f11188s;
    public final r0 f11189w;
    public final p0 f11190x;

    public f(s sVar, x0 x0Var, i0 i0Var, z0 z0Var, m0 m0Var, n0 n0Var, y0 y0Var, o0 o0Var, t tVar, q0 q0Var, r0 r0Var, p0 p0Var) {
        this.f11181a = sVar;
        this.f11183c = i0Var;
        this.f11182b = x0Var;
        this.d = z0Var;
        this.f11184e = m0Var;
        this.f11185f = n0Var;
        this.h = y0Var;
        this.f11186n = o0Var;
        this.f11187r = tVar;
        this.f11188s = q0Var;
        this.f11189w = r0Var;
        this.f11190x = p0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!q6.m.k(this.f11181a, fVar.f11181a) || !q6.m.k(this.f11182b, fVar.f11182b) || !q6.m.k(this.f11183c, fVar.f11183c) || !q6.m.k(this.d, fVar.d) || !q6.m.k(this.f11184e, fVar.f11184e) || !q6.m.k(this.f11185f, fVar.f11185f) || !q6.m.k(this.h, fVar.h) || !q6.m.k(this.f11186n, fVar.f11186n) || !q6.m.k(this.f11187r, fVar.f11187r) || !q6.m.k(this.f11188s, fVar.f11188s) || !q6.m.k(this.f11189w, fVar.f11189w) || !q6.m.k(this.f11190x, fVar.f11190x)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11181a, this.f11182b, this.f11183c, this.d, this.f11184e, this.f11185f, this.h, this.f11186n, this.f11187r, this.f11188s, this.f11189w, this.f11190x});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11181a);
        String valueOf2 = String.valueOf(this.f11182b);
        String valueOf3 = String.valueOf(this.f11183c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.f11184e);
        String valueOf6 = String.valueOf(this.f11185f);
        String valueOf7 = String.valueOf(this.h);
        String valueOf8 = String.valueOf(this.f11186n);
        String valueOf9 = String.valueOf(this.f11187r);
        String valueOf10 = String.valueOf(this.f11188s);
        String valueOf11 = String.valueOf(this.f11189w);
        StringBuilder n10 = e2.n("AuthenticationExtensions{\n fidoAppIdExtension=", valueOf, ", \n cableAuthenticationExtension=", valueOf2, ", \n userVerificationMethodExtension=");
        e2.r(n10, valueOf3, ", \n googleMultiAssertionExtension=", valueOf4, ", \n googleSessionIdExtension=");
        e2.r(n10, valueOf5, ", \n googleSilentVerificationExtension=", valueOf6, ", \n devicePublicKeyExtension=");
        e2.r(n10, valueOf7, ", \n googleTunnelServerIdExtension=", valueOf8, ", \n googleThirdPartyPaymentExtension=");
        e2.r(n10, valueOf9, ", \n prfExtension=", valueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return a8.p0.s(n10, valueOf11, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.k(parcel, 2, this.f11181a, i7);
        yb.k(parcel, 3, this.f11182b, i7);
        yb.k(parcel, 4, this.f11183c, i7);
        yb.k(parcel, 5, this.d, i7);
        yb.k(parcel, 6, this.f11184e, i7);
        yb.k(parcel, 7, this.f11185f, i7);
        yb.k(parcel, 8, this.h, i7);
        yb.k(parcel, 9, this.f11186n, i7);
        yb.k(parcel, 10, this.f11187r, i7);
        yb.k(parcel, 11, this.f11188s, i7);
        yb.k(parcel, 12, this.f11189w, i7);
        yb.k(parcel, 13, this.f11190x, i7);
        yb.s(parcel, r10);
    }
}
