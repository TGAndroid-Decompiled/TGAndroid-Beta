package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.internal.vision.e2;
import java.util.Arrays;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new t0(0);
    public final s f11492a;
    public final x0 f11493b;
    public final i0 f11494c;
    public final z0 d;
    public final m0 f11495e;
    public final n0 f11496f;
    public final y0 h;
    public final o0 f11497n;
    public final t f11498r;
    public final q0 f11499s;
    public final r0 f11500w;
    public final p0 f11501x;

    public f(s sVar, x0 x0Var, i0 i0Var, z0 z0Var, m0 m0Var, n0 n0Var, y0 y0Var, o0 o0Var, t tVar, q0 q0Var, r0 r0Var, p0 p0Var) {
        this.f11492a = sVar;
        this.f11494c = i0Var;
        this.f11493b = x0Var;
        this.d = z0Var;
        this.f11495e = m0Var;
        this.f11496f = n0Var;
        this.h = y0Var;
        this.f11497n = o0Var;
        this.f11498r = tVar;
        this.f11499s = q0Var;
        this.f11500w = r0Var;
        this.f11501x = p0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!q6.m.l(this.f11492a, fVar.f11492a) || !q6.m.l(this.f11493b, fVar.f11493b) || !q6.m.l(this.f11494c, fVar.f11494c) || !q6.m.l(this.d, fVar.d) || !q6.m.l(this.f11495e, fVar.f11495e) || !q6.m.l(this.f11496f, fVar.f11496f) || !q6.m.l(this.h, fVar.h) || !q6.m.l(this.f11497n, fVar.f11497n) || !q6.m.l(this.f11498r, fVar.f11498r) || !q6.m.l(this.f11499s, fVar.f11499s) || !q6.m.l(this.f11500w, fVar.f11500w) || !q6.m.l(this.f11501x, fVar.f11501x)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11492a, this.f11493b, this.f11494c, this.d, this.f11495e, this.f11496f, this.h, this.f11497n, this.f11498r, this.f11499s, this.f11500w, this.f11501x});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11492a);
        String valueOf2 = String.valueOf(this.f11493b);
        String valueOf3 = String.valueOf(this.f11494c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.f11495e);
        String valueOf6 = String.valueOf(this.f11496f);
        String valueOf7 = String.valueOf(this.h);
        String valueOf8 = String.valueOf(this.f11497n);
        String valueOf9 = String.valueOf(this.f11498r);
        String valueOf10 = String.valueOf(this.f11499s);
        String valueOf11 = String.valueOf(this.f11500w);
        StringBuilder n10 = e2.n("AuthenticationExtensions{\n fidoAppIdExtension=", valueOf, ", \n cableAuthenticationExtension=", valueOf2, ", \n userVerificationMethodExtension=");
        e2.r(n10, valueOf3, ", \n googleMultiAssertionExtension=", valueOf4, ", \n googleSessionIdExtension=");
        e2.r(n10, valueOf5, ", \n googleSilentVerificationExtension=", valueOf6, ", \n devicePublicKeyExtension=");
        e2.r(n10, valueOf7, ", \n googleTunnelServerIdExtension=", valueOf8, ", \n googleThirdPartyPaymentExtension=");
        e2.r(n10, valueOf9, ", \n prfExtension=", valueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return a8.p0.s(n10, valueOf11, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.k(parcel, 2, this.f11492a, i7);
        cc.k(parcel, 3, this.f11493b, i7);
        cc.k(parcel, 4, this.f11494c, i7);
        cc.k(parcel, 5, this.d, i7);
        cc.k(parcel, 6, this.f11495e, i7);
        cc.k(parcel, 7, this.f11496f, i7);
        cc.k(parcel, 8, this.h, i7);
        cc.k(parcel, 9, this.f11497n, i7);
        cc.k(parcel, 10, this.f11498r, i7);
        cc.k(parcel, 11, this.f11499s, i7);
        cc.k(parcel, 12, this.f11500w, i7);
        cc.k(parcel, 13, this.f11501x, i7);
        cc.s(parcel, r10);
    }
}
