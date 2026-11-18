package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.internal.vision.e2;
import java.util.Arrays;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new t0(0);
    public final s f11501a;
    public final x0 f11502b;
    public final i0 f11503c;
    public final z0 d;
    public final m0 f11504e;
    public final n0 f11505f;
    public final y0 h;
    public final o0 f11506n;
    public final t f11507r;
    public final q0 f11508s;
    public final r0 f11509w;
    public final p0 f11510x;

    public f(s sVar, x0 x0Var, i0 i0Var, z0 z0Var, m0 m0Var, n0 n0Var, y0 y0Var, o0 o0Var, t tVar, q0 q0Var, r0 r0Var, p0 p0Var) {
        this.f11501a = sVar;
        this.f11503c = i0Var;
        this.f11502b = x0Var;
        this.d = z0Var;
        this.f11504e = m0Var;
        this.f11505f = n0Var;
        this.h = y0Var;
        this.f11506n = o0Var;
        this.f11507r = tVar;
        this.f11508s = q0Var;
        this.f11509w = r0Var;
        this.f11510x = p0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!q6.m.l(this.f11501a, fVar.f11501a) || !q6.m.l(this.f11502b, fVar.f11502b) || !q6.m.l(this.f11503c, fVar.f11503c) || !q6.m.l(this.d, fVar.d) || !q6.m.l(this.f11504e, fVar.f11504e) || !q6.m.l(this.f11505f, fVar.f11505f) || !q6.m.l(this.h, fVar.h) || !q6.m.l(this.f11506n, fVar.f11506n) || !q6.m.l(this.f11507r, fVar.f11507r) || !q6.m.l(this.f11508s, fVar.f11508s) || !q6.m.l(this.f11509w, fVar.f11509w) || !q6.m.l(this.f11510x, fVar.f11510x)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11501a, this.f11502b, this.f11503c, this.d, this.f11504e, this.f11505f, this.h, this.f11506n, this.f11507r, this.f11508s, this.f11509w, this.f11510x});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11501a);
        String valueOf2 = String.valueOf(this.f11502b);
        String valueOf3 = String.valueOf(this.f11503c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.f11504e);
        String valueOf6 = String.valueOf(this.f11505f);
        String valueOf7 = String.valueOf(this.h);
        String valueOf8 = String.valueOf(this.f11506n);
        String valueOf9 = String.valueOf(this.f11507r);
        String valueOf10 = String.valueOf(this.f11508s);
        String valueOf11 = String.valueOf(this.f11509w);
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
        bc.k(parcel, 2, this.f11501a, i7);
        bc.k(parcel, 3, this.f11502b, i7);
        bc.k(parcel, 4, this.f11503c, i7);
        bc.k(parcel, 5, this.d, i7);
        bc.k(parcel, 6, this.f11504e, i7);
        bc.k(parcel, 7, this.f11505f, i7);
        bc.k(parcel, 8, this.h, i7);
        bc.k(parcel, 9, this.f11506n, i7);
        bc.k(parcel, 10, this.f11507r, i7);
        bc.k(parcel, 11, this.f11508s, i7);
        bc.k(parcel, 12, this.f11509w, i7);
        bc.k(parcel, 13, this.f11510x, i7);
        bc.s(parcel, r10);
    }
}
