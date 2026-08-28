package m6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
public final class p0 extends y5.a {
    public static final Parcelable.Creator<p0> CREATOR = new h5.h(22);
    public final x6.s0 f17554a;
    public final x6.s0 f17555b;
    public final x6.s0 f17556c;
    public final int d;

    public p0(x6.s0 s0Var, x6.s0 s0Var2, x6.s0 s0Var3, int i9) {
        this.f17554a = s0Var;
        this.f17555b = s0Var2;
        this.f17556c = s0Var3;
        this.d = i9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        if (!x5.l.l(this.f17554a, p0Var.f17554a) || !x5.l.l(this.f17555b, p0Var.f17555b) || !x5.l.l(this.f17556c, p0Var.f17556c) || this.d != p0Var.d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17554a, this.f17555b, this.f17556c, Integer.valueOf(this.d)});
    }

    public final String toString() {
        byte[] u10;
        byte[] u11;
        byte[] bArr = null;
        x6.s0 s0Var = this.f17554a;
        if (s0Var == null) {
            u10 = null;
        } else {
            u10 = s0Var.u();
        }
        String c10 = e6.b.c(u10);
        x6.s0 s0Var2 = this.f17555b;
        if (s0Var2 == null) {
            u11 = null;
        } else {
            u11 = s0Var2.u();
        }
        String c11 = e6.b.c(u11);
        x6.s0 s0Var3 = this.f17556c;
        if (s0Var3 != null) {
            bArr = s0Var3.u();
        }
        String c12 = e6.b.c(bArr);
        StringBuilder q10 = j3.r0.q("HmacSecretExtension{coseKeyAgreement=", c10, ", saltEnc=", c11, ", saltAuth=");
        q10.append(c12);
        q10.append(", getPinUvAuthProtocol=");
        return aa.d.l(this.d, "}", q10);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        byte[] u10;
        byte[] u11;
        int q10 = p8.q(parcel, 20293);
        byte[] bArr = null;
        x6.s0 s0Var = this.f17554a;
        if (s0Var == null) {
            u10 = null;
        } else {
            u10 = s0Var.u();
        }
        p8.c(parcel, 1, u10);
        x6.s0 s0Var2 = this.f17555b;
        if (s0Var2 == null) {
            u11 = null;
        } else {
            u11 = s0Var2.u();
        }
        p8.c(parcel, 2, u11);
        x6.s0 s0Var3 = this.f17556c;
        if (s0Var3 != null) {
            bArr = s0Var3.u();
        }
        p8.c(parcel, 3, bArr);
        p8.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        p8.r(parcel, q10);
    }
}
