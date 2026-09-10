package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class p0 extends o6.a {
    public static final Parcelable.Creator<p0> CREATOR = new w.a(22);
    public final n7.t0 f4543a;
    public final n7.t0 f4544b;
    public final n7.t0 f4545c;
    public final int d;

    public p0(n7.t0 t0Var, n7.t0 t0Var2, n7.t0 t0Var3, int i10) {
        this.f4543a = t0Var;
        this.f4544b = t0Var2;
        this.f4545c = t0Var3;
        this.d = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        if (!n6.l.l(this.f4543a, p0Var.f4543a) || !n6.l.l(this.f4544b, p0Var.f4544b) || !n6.l.l(this.f4545c, p0Var.f4545c) || this.d != p0Var.d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4543a, this.f4544b, this.f4545c, Integer.valueOf(this.d)});
    }

    public final String toString() {
        byte[] u10;
        byte[] u11;
        byte[] bArr = null;
        n7.t0 t0Var = this.f4543a;
        if (t0Var == null) {
            u10 = null;
        } else {
            u10 = t0Var.u();
        }
        String c10 = u6.b.c(u10);
        n7.t0 t0Var2 = this.f4544b;
        if (t0Var2 == null) {
            u11 = null;
        } else {
            u11 = t0Var2.u();
        }
        String c11 = u6.b.c(u11);
        n7.t0 t0Var3 = this.f4545c;
        if (t0Var3 != null) {
            bArr = t0Var3.u();
        }
        String c12 = u6.b.c(bArr);
        StringBuilder w10 = a4.a.w("HmacSecretExtension{coseKeyAgreement=", c10, ", saltEnc=", c11, ", saltAuth=");
        w10.append(c12);
        w10.append(", getPinUvAuthProtocol=");
        return a4.a.n(this.d, "}", w10);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        byte[] u10;
        byte[] u11;
        int q6 = w7.e0.q(parcel, 20293);
        byte[] bArr = null;
        n7.t0 t0Var = this.f4543a;
        if (t0Var == null) {
            u10 = null;
        } else {
            u10 = t0Var.u();
        }
        w7.e0.c(parcel, 1, u10);
        n7.t0 t0Var2 = this.f4544b;
        if (t0Var2 == null) {
            u11 = null;
        } else {
            u11 = t0Var2.u();
        }
        w7.e0.c(parcel, 2, u11);
        n7.t0 t0Var3 = this.f4545c;
        if (t0Var3 != null) {
            bArr = t0Var3.u();
        }
        w7.e0.c(parcel, 3, bArr);
        w7.e0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.e0.r(parcel, q6);
    }
}
