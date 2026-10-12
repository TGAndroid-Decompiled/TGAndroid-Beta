package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class p0 extends o6.a {
    public static final Parcelable.Creator<p0> CREATOR = new w.a(22);
    public final n7.s0 f4506a;
    public final n7.s0 f4507b;
    public final n7.s0 f4508c;
    public final int d;

    public p0(n7.s0 s0Var, n7.s0 s0Var2, n7.s0 s0Var3, int i10) {
        this.f4506a = s0Var;
        this.f4507b = s0Var2;
        this.f4508c = s0Var3;
        this.d = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        if (!n6.m.l(this.f4506a, p0Var.f4506a) || !n6.m.l(this.f4507b, p0Var.f4507b) || !n6.m.l(this.f4508c, p0Var.f4508c) || this.d != p0Var.d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4506a, this.f4507b, this.f4508c, Integer.valueOf(this.d)});
    }

    public final String toString() {
        byte[] u10;
        byte[] u11;
        byte[] bArr = null;
        n7.s0 s0Var = this.f4506a;
        if (s0Var == null) {
            u10 = null;
        } else {
            u10 = s0Var.u();
        }
        String c10 = u6.b.c(u10);
        n7.s0 s0Var2 = this.f4507b;
        if (s0Var2 == null) {
            u11 = null;
        } else {
            u11 = s0Var2.u();
        }
        String c11 = u6.b.c(u11);
        n7.s0 s0Var3 = this.f4508c;
        if (s0Var3 != null) {
            bArr = s0Var3.u();
        }
        String c12 = u6.b.c(bArr);
        StringBuilder x10 = a1.g.x("HmacSecretExtension{coseKeyAgreement=", c10, ", saltEnc=", c11, ", saltAuth=");
        x10.append(c12);
        x10.append(", getPinUvAuthProtocol=");
        return a1.g.o(this.d, "}", x10);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        byte[] u10;
        byte[] u11;
        int q6 = w7.c0.q(parcel, 20293);
        byte[] bArr = null;
        n7.s0 s0Var = this.f4506a;
        if (s0Var == null) {
            u10 = null;
        } else {
            u10 = s0Var.u();
        }
        w7.c0.c(parcel, 1, u10);
        n7.s0 s0Var2 = this.f4507b;
        if (s0Var2 == null) {
            u11 = null;
        } else {
            u11 = s0Var2.u();
        }
        w7.c0.c(parcel, 2, u11);
        n7.s0 s0Var3 = this.f4508c;
        if (s0Var3 != null) {
            bArr = s0Var3.u();
        }
        w7.c0.c(parcel, 3, bArr);
        w7.c0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.c0.r(parcel, q6);
    }
}
