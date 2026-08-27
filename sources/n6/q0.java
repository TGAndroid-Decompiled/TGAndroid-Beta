package n6;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;

public final class q0 extends z5.a {
    public static final Parcelable.Creator<q0> CREATOR = new o0(3);

    public final y6.s0 f18391a;

    public final y6.s0 f18392b;

    public final y6.s0 f18393c;
    public final int d;

    public q0(y6.s0 s0Var, y6.s0 s0Var2, y6.s0 s0Var3, int i10) {
        this.f18391a = s0Var;
        this.f18392b = s0Var2;
        this.f18393c = s0Var3;
        this.d = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return y5.l.l(this.f18391a, q0Var.f18391a) && y5.l.l(this.f18392b, q0Var.f18392b) && y5.l.l(this.f18393c, q0Var.f18393c) && this.d == q0Var.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18391a, this.f18392b, this.f18393c, Integer.valueOf(this.d)});
    }

    public final String toString() {
        y6.s0 s0Var = this.f18391a;
        String strC = f6.b.c(s0Var == null ? null : s0Var.u());
        y6.s0 s0Var2 = this.f18392b;
        String strC2 = f6.b.c(s0Var2 == null ? null : s0Var2.u());
        y6.s0 s0Var3 = this.f18393c;
        String strC3 = f6.b.c(s0Var3 != null ? s0Var3.u() : null);
        StringBuilder sbP = i0.a.p("HmacSecretExtension{coseKeyAgreement=", strC, ", saltEnc=", strC2, ", saltAuth=");
        sbP.append(strC3);
        sbP.append(", getPinUvAuthProtocol=");
        return a9.p.k(this.d, "}", sbP);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        y6.s0 s0Var = this.f18391a;
        r8.c(parcel, 1, s0Var == null ? null : s0Var.u());
        y6.s0 s0Var2 = this.f18392b;
        r8.c(parcel, 2, s0Var2 == null ? null : s0Var2.u());
        y6.s0 s0Var3 = this.f18393c;
        r8.c(parcel, 3, s0Var3 != null ? s0Var3.u() : null);
        r8.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        r8.r(parcel, iQ);
    }
}
