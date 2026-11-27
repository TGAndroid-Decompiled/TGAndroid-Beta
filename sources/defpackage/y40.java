package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class y40 extends c4 {
    public static final Parcelable.Creator<y40> CREATOR = new zkd((byte) 26);
    public final ra4 a;
    public final ohf b;
    public final tbc c;
    public final mmf d;
    public final gad e;
    public final sad f;
    public final xjf h;
    public final lbd n;
    public final h15 r;
    public final pcd s;
    public final afd w;
    public final wbd x;

    public y40(ra4 ra4Var, ohf ohfVar, tbc tbcVar, mmf mmfVar, gad gadVar, sad sadVar, xjf xjfVar, lbd lbdVar, h15 h15Var, pcd pcdVar, afd afdVar, wbd wbdVar) {
        this.a = ra4Var;
        this.c = tbcVar;
        this.b = ohfVar;
        this.d = mmfVar;
        this.e = gadVar;
        this.f = sadVar;
        this.h = xjfVar;
        this.n = lbdVar;
        this.r = h15Var;
        this.s = pcdVar;
        this.w = afdVar;
        this.x = wbdVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y40)) {
            return false;
        }
        y40 y40Var = (y40) obj;
        if (!vue.a(this.a, y40Var.a) || !vue.a(this.b, y40Var.b) || !vue.a(this.c, y40Var.c) || !vue.a(this.d, y40Var.d) || !vue.a(this.e, y40Var.e) || !vue.a(this.f, y40Var.f) || !vue.a(this.h, y40Var.h) || !vue.a(this.n, y40Var.n) || !vue.a(this.r, y40Var.r) || !vue.a(this.s, y40Var.s) || !vue.a(this.w, y40Var.w) || !vue.a(this.x, y40Var.x)) {
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
        StringBuilder l = xnb.l("AuthenticationExtensions{\n fidoAppIdExtension=", valueOf, ", \n cableAuthenticationExtension=", valueOf2, ", \n userVerificationMethodExtension=");
        qu6.u(l, valueOf3, ", \n googleMultiAssertionExtension=", valueOf4, ", \n googleSessionIdExtension=");
        qu6.u(l, valueOf5, ", \n googleSilentVerificationExtension=", valueOf6, ", \n devicePublicKeyExtension=");
        qu6.u(l, valueOf7, ", \n googleTunnelServerIdExtension=", valueOf8, ", \n googleThirdPartyPaymentExtension=");
        qu6.u(l, valueOf9, ", \n prfExtension=", valueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return c00.k(l, valueOf11, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.k(parcel, 2, this.a, i);
        bye.k(parcel, 3, this.b, i);
        bye.k(parcel, 4, this.c, i);
        bye.k(parcel, 5, this.d, i);
        bye.k(parcel, 6, this.e, i);
        bye.k(parcel, 7, this.f, i);
        bye.k(parcel, 8, this.h, i);
        bye.k(parcel, 9, this.n, i);
        bye.k(parcel, 10, this.r, i);
        bye.k(parcel, 11, this.s, i);
        bye.k(parcel, 12, this.w, i);
        bye.k(parcel, 13, this.x, i);
        bye.s(parcel, r);
    }
}
