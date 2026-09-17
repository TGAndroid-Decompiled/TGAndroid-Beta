package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new r0(11);
    public final s f4088a;
    public final x0 f4089b;
    public final i0 f4090c;
    public final z0 d;
    public final m0 e;
    public final n0 f4091f;
    public final y0 h;
    public final o0 f4092n;
    public final t f4093r;
    public final q0 f4094s;
    public final s0 v;
    public final p0 f4095w;

    public f(s sVar, x0 x0Var, i0 i0Var, z0 z0Var, m0 m0Var, n0 n0Var, y0 y0Var, o0 o0Var, t tVar, q0 q0Var, s0 s0Var, p0 p0Var) {
        this.f4088a = sVar;
        this.f4090c = i0Var;
        this.f4089b = x0Var;
        this.d = z0Var;
        this.e = m0Var;
        this.f4091f = n0Var;
        this.h = y0Var;
        this.f4092n = o0Var;
        this.f4093r = tVar;
        this.f4094s = q0Var;
        this.v = s0Var;
        this.f4095w = p0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!n6.l.l(this.f4088a, fVar.f4088a) || !n6.l.l(this.f4089b, fVar.f4089b) || !n6.l.l(this.f4090c, fVar.f4090c) || !n6.l.l(this.d, fVar.d) || !n6.l.l(this.e, fVar.e) || !n6.l.l(this.f4091f, fVar.f4091f) || !n6.l.l(this.h, fVar.h) || !n6.l.l(this.f4092n, fVar.f4092n) || !n6.l.l(this.f4093r, fVar.f4093r) || !n6.l.l(this.f4094s, fVar.f4094s) || !n6.l.l(this.v, fVar.v) || !n6.l.l(this.f4095w, fVar.f4095w)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4088a, this.f4089b, this.f4090c, this.d, this.e, this.f4091f, this.h, this.f4092n, this.f4093r, this.f4094s, this.v, this.f4095w});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4088a);
        String valueOf2 = String.valueOf(this.f4089b);
        String valueOf3 = String.valueOf(this.f4090c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f4091f);
        String valueOf7 = String.valueOf(this.h);
        String valueOf8 = String.valueOf(this.f4092n);
        String valueOf9 = String.valueOf(this.f4093r);
        String valueOf10 = String.valueOf(this.f4094s);
        String valueOf11 = String.valueOf(this.v);
        StringBuilder w10 = a4.a.w("AuthenticationExtensions{\n fidoAppIdExtension=", valueOf, ", \n cableAuthenticationExtension=", valueOf2, ", \n userVerificationMethodExtension=");
        a4.a.z(w10, valueOf3, ", \n googleMultiAssertionExtension=", valueOf4, ", \n googleSessionIdExtension=");
        a4.a.z(w10, valueOf5, ", \n googleSilentVerificationExtension=", valueOf6, ", \n devicePublicKeyExtension=");
        a4.a.z(w10, valueOf7, ", \n googleTunnelServerIdExtension=", valueOf8, ", \n googleThirdPartyPaymentExtension=");
        a4.a.z(w10, valueOf9, ", \n prfExtension=", valueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return a4.a.s(w10, valueOf11, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.k(parcel, 2, this.f4088a, i10);
        w7.e0.k(parcel, 3, this.f4089b, i10);
        w7.e0.k(parcel, 4, this.f4090c, i10);
        w7.e0.k(parcel, 5, this.d, i10);
        w7.e0.k(parcel, 6, this.e, i10);
        w7.e0.k(parcel, 7, this.f4091f, i10);
        w7.e0.k(parcel, 8, this.h, i10);
        w7.e0.k(parcel, 9, this.f4092n, i10);
        w7.e0.k(parcel, 10, this.f4093r, i10);
        w7.e0.k(parcel, 11, this.f4094s, i10);
        w7.e0.k(parcel, 12, this.v, i10);
        w7.e0.k(parcel, 13, this.f4095w, i10);
        w7.e0.r(parcel, q6);
    }
}
