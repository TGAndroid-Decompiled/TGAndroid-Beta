package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.internal.vision.e2;
import java.util.Arrays;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new t0(0);
    public final s f11527a;
    public final x0 f11528b;
    public final i0 f11529c;
    public final z0 d;
    public final m0 f11530e;
    public final n0 f11531f;
    public final y0 h;
    public final o0 f11532n;
    public final t f11533r;
    public final q0 f11534s;
    public final r0 f11535w;
    public final p0 f11536x;

    public f(s sVar, x0 x0Var, i0 i0Var, z0 z0Var, m0 m0Var, n0 n0Var, y0 y0Var, o0 o0Var, t tVar, q0 q0Var, r0 r0Var, p0 p0Var) {
        this.f11527a = sVar;
        this.f11529c = i0Var;
        this.f11528b = x0Var;
        this.d = z0Var;
        this.f11530e = m0Var;
        this.f11531f = n0Var;
        this.h = y0Var;
        this.f11532n = o0Var;
        this.f11533r = tVar;
        this.f11534s = q0Var;
        this.f11535w = r0Var;
        this.f11536x = p0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!q6.m.l(this.f11527a, fVar.f11527a) || !q6.m.l(this.f11528b, fVar.f11528b) || !q6.m.l(this.f11529c, fVar.f11529c) || !q6.m.l(this.d, fVar.d) || !q6.m.l(this.f11530e, fVar.f11530e) || !q6.m.l(this.f11531f, fVar.f11531f) || !q6.m.l(this.h, fVar.h) || !q6.m.l(this.f11532n, fVar.f11532n) || !q6.m.l(this.f11533r, fVar.f11533r) || !q6.m.l(this.f11534s, fVar.f11534s) || !q6.m.l(this.f11535w, fVar.f11535w) || !q6.m.l(this.f11536x, fVar.f11536x)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11527a, this.f11528b, this.f11529c, this.d, this.f11530e, this.f11531f, this.h, this.f11532n, this.f11533r, this.f11534s, this.f11535w, this.f11536x});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11527a);
        String valueOf2 = String.valueOf(this.f11528b);
        String valueOf3 = String.valueOf(this.f11529c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.f11530e);
        String valueOf6 = String.valueOf(this.f11531f);
        String valueOf7 = String.valueOf(this.h);
        String valueOf8 = String.valueOf(this.f11532n);
        String valueOf9 = String.valueOf(this.f11533r);
        String valueOf10 = String.valueOf(this.f11534s);
        String valueOf11 = String.valueOf(this.f11535w);
        StringBuilder n10 = e2.n("AuthenticationExtensions{\n fidoAppIdExtension=", valueOf, ", \n cableAuthenticationExtension=", valueOf2, ", \n userVerificationMethodExtension=");
        e2.r(n10, valueOf3, ", \n googleMultiAssertionExtension=", valueOf4, ", \n googleSessionIdExtension=");
        e2.r(n10, valueOf5, ", \n googleSilentVerificationExtension=", valueOf6, ", \n devicePublicKeyExtension=");
        e2.r(n10, valueOf7, ", \n googleTunnelServerIdExtension=", valueOf8, ", \n googleThirdPartyPaymentExtension=");
        e2.r(n10, valueOf9, ", \n prfExtension=", valueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return a8.p0.s(n10, valueOf11, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 2, this.f11527a, i7);
        bc.k(parcel, 3, this.f11528b, i7);
        bc.k(parcel, 4, this.f11529c, i7);
        bc.k(parcel, 5, this.d, i7);
        bc.k(parcel, 6, this.f11530e, i7);
        bc.k(parcel, 7, this.f11531f, i7);
        bc.k(parcel, 8, this.h, i7);
        bc.k(parcel, 9, this.f11532n, i7);
        bc.k(parcel, 10, this.f11533r, i7);
        bc.k(parcel, 11, this.f11534s, i7);
        bc.k(parcel, 12, this.f11535w, i7);
        bc.k(parcel, 13, this.f11536x, i7);
        bc.s(parcel, r10);
    }
}
