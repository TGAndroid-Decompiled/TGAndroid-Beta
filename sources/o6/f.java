package o6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.telegram.ui.th;
public final class f extends a6.a {
    public static final Parcelable.Creator<f> CREATOR = new n0(23);
    public final s f19370a;
    public final y0 f19371b;
    public final i0 f19372c;
    public final a1 d;
    public final m0 f19373e;
    public final o0 f19374f;
    public final z0 h;
    public final p0 f19375n;
    public final t f19376r;
    public final r0 f19377s;
    public final s0 v;
    public final q0 f19378w;

    public f(s sVar, y0 y0Var, i0 i0Var, a1 a1Var, m0 m0Var, o0 o0Var, z0 z0Var, p0 p0Var, t tVar, r0 r0Var, s0 s0Var, q0 q0Var) {
        this.f19370a = sVar;
        this.f19372c = i0Var;
        this.f19371b = y0Var;
        this.d = a1Var;
        this.f19373e = m0Var;
        this.f19374f = o0Var;
        this.h = z0Var;
        this.f19375n = p0Var;
        this.f19376r = tVar;
        this.f19377s = r0Var;
        this.v = s0Var;
        this.f19378w = q0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!z5.l.l(this.f19370a, fVar.f19370a) || !z5.l.l(this.f19371b, fVar.f19371b) || !z5.l.l(this.f19372c, fVar.f19372c) || !z5.l.l(this.d, fVar.d) || !z5.l.l(this.f19373e, fVar.f19373e) || !z5.l.l(this.f19374f, fVar.f19374f) || !z5.l.l(this.h, fVar.h) || !z5.l.l(this.f19375n, fVar.f19375n) || !z5.l.l(this.f19376r, fVar.f19376r) || !z5.l.l(this.f19377s, fVar.f19377s) || !z5.l.l(this.v, fVar.v) || !z5.l.l(this.f19378w, fVar.f19378w)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19370a, this.f19371b, this.f19372c, this.d, this.f19373e, this.f19374f, this.h, this.f19375n, this.f19376r, this.f19377s, this.v, this.f19378w});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f19370a);
        String valueOf2 = String.valueOf(this.f19371b);
        String valueOf3 = String.valueOf(this.f19372c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.f19373e);
        String valueOf6 = String.valueOf(this.f19374f);
        String valueOf7 = String.valueOf(this.h);
        String valueOf8 = String.valueOf(this.f19375n);
        String valueOf9 = String.valueOf(this.f19376r);
        String valueOf10 = String.valueOf(this.f19377s);
        String valueOf11 = String.valueOf(this.v);
        StringBuilder k9 = th.k("AuthenticationExtensions{\n fidoAppIdExtension=", valueOf, ", \n cableAuthenticationExtension=", valueOf2, ", \n userVerificationMethodExtension=");
        th.w(k9, valueOf3, ", \n googleMultiAssertionExtension=", valueOf4, ", \n googleSessionIdExtension=");
        th.w(k9, valueOf5, ", \n googleSilentVerificationExtension=", valueOf6, ", \n devicePublicKeyExtension=");
        th.w(k9, valueOf7, ", \n googleTunnelServerIdExtension=", valueOf8, ", \n googleThirdPartyPaymentExtension=");
        th.w(k9, valueOf9, ", \n prfExtension=", valueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return a4.w.q(k9, valueOf11, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.k(parcel, 2, this.f19370a, i10);
        com.google.android.gms.internal.cast.o.k(parcel, 3, this.f19371b, i10);
        com.google.android.gms.internal.cast.o.k(parcel, 4, this.f19372c, i10);
        com.google.android.gms.internal.cast.o.k(parcel, 5, this.d, i10);
        com.google.android.gms.internal.cast.o.k(parcel, 6, this.f19373e, i10);
        com.google.android.gms.internal.cast.o.k(parcel, 7, this.f19374f, i10);
        com.google.android.gms.internal.cast.o.k(parcel, 8, this.h, i10);
        com.google.android.gms.internal.cast.o.k(parcel, 9, this.f19375n, i10);
        com.google.android.gms.internal.cast.o.k(parcel, 10, this.f19376r, i10);
        com.google.android.gms.internal.cast.o.k(parcel, 11, this.f19377s, i10);
        com.google.android.gms.internal.cast.o.k(parcel, 12, this.v, i10);
        com.google.android.gms.internal.cast.o.k(parcel, 13, this.f19378w, i10);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
