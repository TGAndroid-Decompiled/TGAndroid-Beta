package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class w50 extends b4 {
    public static final Parcelable.Creator<w50> CREATOR = new jid((byte) 26);
    public final va4 a;
    public final zef b;
    public final u9c c;
    public final xjf d;
    public final p7d e;
    public final b8d f;
    public final ihf h;
    public final u8d n;
    public final c15 r;
    public final y9d s;
    public final jcd w;
    public final f9d x;

    public w50(va4 va4Var, zef zefVar, u9c u9cVar, xjf xjfVar, p7d p7dVar, b8d b8dVar, ihf ihfVar, u8d u8dVar, c15 c15Var, y9d y9dVar, jcd jcdVar, f9d f9dVar) {
        this.a = va4Var;
        this.c = u9cVar;
        this.b = zefVar;
        this.d = xjfVar;
        this.e = p7dVar;
        this.f = b8dVar;
        this.h = ihfVar;
        this.n = u8dVar;
        this.r = c15Var;
        this.s = y9dVar;
        this.w = jcdVar;
        this.x = f9dVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w50)) {
            return false;
        }
        w50 w50Var = (w50) obj;
        if (!fse.a(this.a, w50Var.a) || !fse.a(this.b, w50Var.b) || !fse.a(this.c, w50Var.c) || !fse.a(this.d, w50Var.d) || !fse.a(this.e, w50Var.e) || !fse.a(this.f, w50Var.f) || !fse.a(this.h, w50Var.h) || !fse.a(this.n, w50Var.n) || !fse.a(this.r, w50Var.r) || !fse.a(this.s, w50Var.s) || !fse.a(this.w, w50Var.w) || !fse.a(this.x, w50Var.x)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, this.w, this.x});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String valueOf7 = String.valueOf(this.h);
        String valueOf8 = String.valueOf(this.n);
        String valueOf9 = String.valueOf(this.r);
        String valueOf10 = String.valueOf(this.s);
        String valueOf11 = String.valueOf(this.w);
        StringBuilder m = mlb.m("AuthenticationExtensions{\n fidoAppIdExtension=", valueOf, ", \n cableAuthenticationExtension=", valueOf2, ", \n userVerificationMethodExtension=");
        kt6.v(m, valueOf3, ", \n googleMultiAssertionExtension=", valueOf4, ", \n googleSessionIdExtension=");
        kt6.v(m, valueOf5, ", \n googleSilentVerificationExtension=", valueOf6, ", \n devicePublicKeyExtension=");
        kt6.v(m, valueOf7, ", \n googleTunnelServerIdExtension=", valueOf8, ", \n googleThirdPartyPaymentExtension=");
        kt6.v(m, valueOf9, ", \n prfExtension=", valueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return b10.j(m, valueOf11, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.k(parcel, 2, this.a, i);
        mve.k(parcel, 3, this.b, i);
        mve.k(parcel, 4, this.c, i);
        mve.k(parcel, 5, this.d, i);
        mve.k(parcel, 6, this.e, i);
        mve.k(parcel, 7, this.f, i);
        mve.k(parcel, 8, this.h, i);
        mve.k(parcel, 9, this.n, i);
        mve.k(parcel, 10, this.r, i);
        mve.k(parcel, 11, this.s, i);
        mve.k(parcel, 12, this.w, i);
        mve.k(parcel, 13, this.x, i);
        mve.s(parcel, r);
    }
}
