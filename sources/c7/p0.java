package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class p0 extends o6.a {
    public static final Parcelable.Creator<p0> CREATOR = new w.a(22);
    public final n7.t0 f4617a;
    public final n7.t0 f4618b;
    public final n7.t0 f4619c;
    public final int d;

    public p0(n7.t0 t0Var, n7.t0 t0Var2, n7.t0 t0Var3, int i10) {
        this.f4617a = t0Var;
        this.f4618b = t0Var2;
        this.f4619c = t0Var3;
        this.d = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        if (!n6.l.l(this.f4617a, p0Var.f4617a) || !n6.l.l(this.f4618b, p0Var.f4618b) || !n6.l.l(this.f4619c, p0Var.f4619c) || this.d != p0Var.d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4617a, this.f4618b, this.f4619c, Integer.valueOf(this.d)});
    }

    public final String toString() {
        byte[] t10;
        byte[] t11;
        byte[] bArr = null;
        n7.t0 t0Var = this.f4617a;
        if (t0Var == null) {
            t10 = null;
        } else {
            t10 = t0Var.t();
        }
        String c10 = u6.b.c(t10);
        n7.t0 t0Var2 = this.f4618b;
        if (t0Var2 == null) {
            t11 = null;
        } else {
            t11 = t0Var2.t();
        }
        String c11 = u6.b.c(t11);
        n7.t0 t0Var3 = this.f4619c;
        if (t0Var3 != null) {
            bArr = t0Var3.t();
        }
        String c12 = u6.b.c(bArr);
        StringBuilder w9 = a1.g.w("HmacSecretExtension{coseKeyAgreement=", c10, ", saltEnc=", c11, ", saltAuth=");
        w9.append(c12);
        w9.append(", getPinUvAuthProtocol=");
        return a1.g.n(this.d, "}", w9);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        byte[] t10;
        byte[] t11;
        int q6 = w7.f0.q(parcel, 20293);
        byte[] bArr = null;
        n7.t0 t0Var = this.f4617a;
        if (t0Var == null) {
            t10 = null;
        } else {
            t10 = t0Var.t();
        }
        w7.f0.c(parcel, 1, t10);
        n7.t0 t0Var2 = this.f4618b;
        if (t0Var2 == null) {
            t11 = null;
        } else {
            t11 = t0Var2.t();
        }
        w7.f0.c(parcel, 2, t11);
        n7.t0 t0Var3 = this.f4619c;
        if (t0Var3 != null) {
            bArr = t0Var3.t();
        }
        w7.f0.c(parcel, 3, bArr);
        w7.f0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.f0.r(parcel, q6);
    }
}
