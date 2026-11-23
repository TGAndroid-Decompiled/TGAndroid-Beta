package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.internal.vision.e2;
import java.util.Arrays;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new t0(0);
    public final s f11530a;
    public final x0 f11531b;
    public final i0 f11532c;
    public final z0 d;
    public final m0 f11533e;
    public final n0 f11534f;
    public final y0 h;
    public final o0 f11535n;
    public final t f11536r;
    public final q0 f11537s;
    public final r0 f11538w;
    public final p0 f11539x;

    public f(s sVar, x0 x0Var, i0 i0Var, z0 z0Var, m0 m0Var, n0 n0Var, y0 y0Var, o0 o0Var, t tVar, q0 q0Var, r0 r0Var, p0 p0Var) {
        this.f11530a = sVar;
        this.f11532c = i0Var;
        this.f11531b = x0Var;
        this.d = z0Var;
        this.f11533e = m0Var;
        this.f11534f = n0Var;
        this.h = y0Var;
        this.f11535n = o0Var;
        this.f11536r = tVar;
        this.f11537s = q0Var;
        this.f11538w = r0Var;
        this.f11539x = p0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!q6.m.l(this.f11530a, fVar.f11530a) || !q6.m.l(this.f11531b, fVar.f11531b) || !q6.m.l(this.f11532c, fVar.f11532c) || !q6.m.l(this.d, fVar.d) || !q6.m.l(this.f11533e, fVar.f11533e) || !q6.m.l(this.f11534f, fVar.f11534f) || !q6.m.l(this.h, fVar.h) || !q6.m.l(this.f11535n, fVar.f11535n) || !q6.m.l(this.f11536r, fVar.f11536r) || !q6.m.l(this.f11537s, fVar.f11537s) || !q6.m.l(this.f11538w, fVar.f11538w) || !q6.m.l(this.f11539x, fVar.f11539x)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11530a, this.f11531b, this.f11532c, this.d, this.f11533e, this.f11534f, this.h, this.f11535n, this.f11536r, this.f11537s, this.f11538w, this.f11539x});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11530a);
        String valueOf2 = String.valueOf(this.f11531b);
        String valueOf3 = String.valueOf(this.f11532c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.f11533e);
        String valueOf6 = String.valueOf(this.f11534f);
        String valueOf7 = String.valueOf(this.h);
        String valueOf8 = String.valueOf(this.f11535n);
        String valueOf9 = String.valueOf(this.f11536r);
        String valueOf10 = String.valueOf(this.f11537s);
        String valueOf11 = String.valueOf(this.f11538w);
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
        bc.k(parcel, 2, this.f11530a, i7);
        bc.k(parcel, 3, this.f11531b, i7);
        bc.k(parcel, 4, this.f11532c, i7);
        bc.k(parcel, 5, this.d, i7);
        bc.k(parcel, 6, this.f11533e, i7);
        bc.k(parcel, 7, this.f11534f, i7);
        bc.k(parcel, 8, this.h, i7);
        bc.k(parcel, 9, this.f11535n, i7);
        bc.k(parcel, 10, this.f11536r, i7);
        bc.k(parcel, 11, this.f11537s, i7);
        bc.k(parcel, 12, this.f11538w, i7);
        bc.k(parcel, 13, this.f11539x, i7);
        bc.s(parcel, r10);
    }
}
