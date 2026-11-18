package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.internal.vision.e2;
import java.util.Arrays;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new t0(0);
    public final s f11498a;
    public final x0 f11499b;
    public final i0 f11500c;
    public final z0 d;
    public final m0 f11501e;
    public final n0 f11502f;
    public final y0 h;
    public final o0 f11503n;
    public final t f11504r;
    public final q0 f11505s;
    public final r0 f11506w;
    public final p0 f11507x;

    public f(s sVar, x0 x0Var, i0 i0Var, z0 z0Var, m0 m0Var, n0 n0Var, y0 y0Var, o0 o0Var, t tVar, q0 q0Var, r0 r0Var, p0 p0Var) {
        this.f11498a = sVar;
        this.f11500c = i0Var;
        this.f11499b = x0Var;
        this.d = z0Var;
        this.f11501e = m0Var;
        this.f11502f = n0Var;
        this.h = y0Var;
        this.f11503n = o0Var;
        this.f11504r = tVar;
        this.f11505s = q0Var;
        this.f11506w = r0Var;
        this.f11507x = p0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!q6.m.l(this.f11498a, fVar.f11498a) || !q6.m.l(this.f11499b, fVar.f11499b) || !q6.m.l(this.f11500c, fVar.f11500c) || !q6.m.l(this.d, fVar.d) || !q6.m.l(this.f11501e, fVar.f11501e) || !q6.m.l(this.f11502f, fVar.f11502f) || !q6.m.l(this.h, fVar.h) || !q6.m.l(this.f11503n, fVar.f11503n) || !q6.m.l(this.f11504r, fVar.f11504r) || !q6.m.l(this.f11505s, fVar.f11505s) || !q6.m.l(this.f11506w, fVar.f11506w) || !q6.m.l(this.f11507x, fVar.f11507x)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11498a, this.f11499b, this.f11500c, this.d, this.f11501e, this.f11502f, this.h, this.f11503n, this.f11504r, this.f11505s, this.f11506w, this.f11507x});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11498a);
        String valueOf2 = String.valueOf(this.f11499b);
        String valueOf3 = String.valueOf(this.f11500c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.f11501e);
        String valueOf6 = String.valueOf(this.f11502f);
        String valueOf7 = String.valueOf(this.h);
        String valueOf8 = String.valueOf(this.f11503n);
        String valueOf9 = String.valueOf(this.f11504r);
        String valueOf10 = String.valueOf(this.f11505s);
        String valueOf11 = String.valueOf(this.f11506w);
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
        bc.k(parcel, 2, this.f11498a, i7);
        bc.k(parcel, 3, this.f11499b, i7);
        bc.k(parcel, 4, this.f11500c, i7);
        bc.k(parcel, 5, this.d, i7);
        bc.k(parcel, 6, this.f11501e, i7);
        bc.k(parcel, 7, this.f11502f, i7);
        bc.k(parcel, 8, this.h, i7);
        bc.k(parcel, 9, this.f11503n, i7);
        bc.k(parcel, 10, this.f11504r, i7);
        bc.k(parcel, 11, this.f11505s, i7);
        bc.k(parcel, 12, this.f11506w, i7);
        bc.k(parcel, 13, this.f11507x, i7);
        bc.s(parcel, r10);
    }
}
