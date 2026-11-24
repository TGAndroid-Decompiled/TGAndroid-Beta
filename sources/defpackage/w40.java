package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class w40 extends b4 {
    public static final Parcelable.Creator<w40> CREATOR = new igd((byte) 26);
    public final v84 a;
    public final ycf b;
    public final t7c c;
    public final whf d;
    public final n5d e;
    public final z5d f;
    public final hff h;
    public final s6d n;
    public final dz4 r;
    public final w7d s;
    public final had w;
    public final d7d x;

    public w40(v84 v84Var, ycf ycfVar, t7c t7cVar, whf whfVar, n5d n5dVar, z5d z5dVar, hff hffVar, s6d s6dVar, dz4 dz4Var, w7d w7dVar, had hadVar, d7d d7dVar) {
        this.a = v84Var;
        this.c = t7cVar;
        this.b = ycfVar;
        this.d = whfVar;
        this.e = n5dVar;
        this.f = z5dVar;
        this.h = hffVar;
        this.n = s6dVar;
        this.r = dz4Var;
        this.s = w7dVar;
        this.w = hadVar;
        this.x = d7dVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w40)) {
            return false;
        }
        w40 w40Var = (w40) obj;
        if (!cqe.a(this.a, w40Var.a) || !cqe.a(this.b, w40Var.b) || !cqe.a(this.c, w40Var.c) || !cqe.a(this.d, w40Var.d) || !cqe.a(this.e, w40Var.e) || !cqe.a(this.f, w40Var.f) || !cqe.a(this.h, w40Var.h) || !cqe.a(this.n, w40Var.n) || !cqe.a(this.r, w40Var.r) || !cqe.a(this.s, w40Var.s) || !cqe.a(this.w, w40Var.w) || !cqe.a(this.x, w40Var.x)) {
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
        StringBuilder l = yjb.l("AuthenticationExtensions{\n fidoAppIdExtension=", valueOf, ", \n cableAuthenticationExtension=", valueOf2, ", \n userVerificationMethodExtension=");
        ls6.u(l, valueOf3, ", \n googleMultiAssertionExtension=", valueOf4, ", \n googleSessionIdExtension=");
        ls6.u(l, valueOf5, ", \n googleSilentVerificationExtension=", valueOf6, ", \n devicePublicKeyExtension=");
        ls6.u(l, valueOf7, ", \n googleTunnelServerIdExtension=", valueOf8, ", \n googleThirdPartyPaymentExtension=");
        ls6.u(l, valueOf9, ", \n prfExtension=", valueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return b00.j(l, valueOf11, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.k(parcel, 2, this.a, i);
        jte.k(parcel, 3, this.b, i);
        jte.k(parcel, 4, this.c, i);
        jte.k(parcel, 5, this.d, i);
        jte.k(parcel, 6, this.e, i);
        jte.k(parcel, 7, this.f, i);
        jte.k(parcel, 8, this.h, i);
        jte.k(parcel, 9, this.n, i);
        jte.k(parcel, 10, this.r, i);
        jte.k(parcel, 11, this.s, i);
        jte.k(parcel, 12, this.w, i);
        jte.k(parcel, 13, this.x, i);
        jte.s(parcel, r);
    }
}
