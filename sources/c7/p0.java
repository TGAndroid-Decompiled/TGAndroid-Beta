package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class p0 extends o6.a {
    public static final Parcelable.Creator<p0> CREATOR = new w.a(22);
    public final n7.s0 f4128a;
    public final n7.s0 f4129b;
    public final n7.s0 f4130c;
    public final int d;

    public p0(n7.s0 s0Var, n7.s0 s0Var2, n7.s0 s0Var3, int i10) {
        this.f4128a = s0Var;
        this.f4129b = s0Var2;
        this.f4130c = s0Var3;
        this.d = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        if (!n6.l.l(this.f4128a, p0Var.f4128a) || !n6.l.l(this.f4129b, p0Var.f4129b) || !n6.l.l(this.f4130c, p0Var.f4130c) || this.d != p0Var.d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4128a, this.f4129b, this.f4130c, Integer.valueOf(this.d)});
    }

    public final String toString() {
        byte[] u10;
        byte[] u11;
        byte[] bArr = null;
        n7.s0 s0Var = this.f4128a;
        if (s0Var == null) {
            u10 = null;
        } else {
            u10 = s0Var.u();
        }
        String c10 = u6.b.c(u10);
        n7.s0 s0Var2 = this.f4129b;
        if (s0Var2 == null) {
            u11 = null;
        } else {
            u11 = s0Var2.u();
        }
        String c11 = u6.b.c(u11);
        n7.s0 s0Var3 = this.f4130c;
        if (s0Var3 != null) {
            bArr = s0Var3.u();
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
        int q6 = w7.f0.q(parcel, 20293);
        byte[] bArr = null;
        n7.s0 s0Var = this.f4128a;
        if (s0Var == null) {
            u10 = null;
        } else {
            u10 = s0Var.u();
        }
        w7.f0.c(parcel, 1, u10);
        n7.s0 s0Var2 = this.f4129b;
        if (s0Var2 == null) {
            u11 = null;
        } else {
            u11 = s0Var2.u();
        }
        w7.f0.c(parcel, 2, u11);
        n7.s0 s0Var3 = this.f4130c;
        if (s0Var3 != null) {
            bArr = s0Var3.u();
        }
        w7.f0.c(parcel, 3, bArr);
        w7.f0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.f0.r(parcel, q6);
    }
}
