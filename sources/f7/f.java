package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.internal.vision.e2;
import java.util.Arrays;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new t0(0);
    public final s f11493a;
    public final x0 f11494b;
    public final i0 f11495c;
    public final z0 d;
    public final m0 f11496e;
    public final n0 f11497f;
    public final y0 h;
    public final o0 f11498n;
    public final t f11499r;
    public final q0 f11500s;
    public final r0 f11501w;
    public final p0 f11502x;

    public f(s sVar, x0 x0Var, i0 i0Var, z0 z0Var, m0 m0Var, n0 n0Var, y0 y0Var, o0 o0Var, t tVar, q0 q0Var, r0 r0Var, p0 p0Var) {
        this.f11493a = sVar;
        this.f11495c = i0Var;
        this.f11494b = x0Var;
        this.d = z0Var;
        this.f11496e = m0Var;
        this.f11497f = n0Var;
        this.h = y0Var;
        this.f11498n = o0Var;
        this.f11499r = tVar;
        this.f11500s = q0Var;
        this.f11501w = r0Var;
        this.f11502x = p0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!q6.m.l(this.f11493a, fVar.f11493a) || !q6.m.l(this.f11494b, fVar.f11494b) || !q6.m.l(this.f11495c, fVar.f11495c) || !q6.m.l(this.d, fVar.d) || !q6.m.l(this.f11496e, fVar.f11496e) || !q6.m.l(this.f11497f, fVar.f11497f) || !q6.m.l(this.h, fVar.h) || !q6.m.l(this.f11498n, fVar.f11498n) || !q6.m.l(this.f11499r, fVar.f11499r) || !q6.m.l(this.f11500s, fVar.f11500s) || !q6.m.l(this.f11501w, fVar.f11501w) || !q6.m.l(this.f11502x, fVar.f11502x)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11493a, this.f11494b, this.f11495c, this.d, this.f11496e, this.f11497f, this.h, this.f11498n, this.f11499r, this.f11500s, this.f11501w, this.f11502x});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11493a);
        String valueOf2 = String.valueOf(this.f11494b);
        String valueOf3 = String.valueOf(this.f11495c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.f11496e);
        String valueOf6 = String.valueOf(this.f11497f);
        String valueOf7 = String.valueOf(this.h);
        String valueOf8 = String.valueOf(this.f11498n);
        String valueOf9 = String.valueOf(this.f11499r);
        String valueOf10 = String.valueOf(this.f11500s);
        String valueOf11 = String.valueOf(this.f11501w);
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
        cc.k(parcel, 2, this.f11493a, i7);
        cc.k(parcel, 3, this.f11494b, i7);
        cc.k(parcel, 4, this.f11495c, i7);
        cc.k(parcel, 5, this.d, i7);
        cc.k(parcel, 6, this.f11496e, i7);
        cc.k(parcel, 7, this.f11497f, i7);
        cc.k(parcel, 8, this.h, i7);
        cc.k(parcel, 9, this.f11498n, i7);
        cc.k(parcel, 10, this.f11499r, i7);
        cc.k(parcel, 11, this.f11500s, i7);
        cc.k(parcel, 12, this.f11501w, i7);
        cc.k(parcel, 13, this.f11502x, i7);
        cc.s(parcel, r10);
    }
}
