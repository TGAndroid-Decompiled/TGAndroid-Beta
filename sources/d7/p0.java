package d7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class p0 extends p6.a {
    public static final Parcelable.Creator<p0> CREATOR = new w.a(23);
    public final o7.s0 f8213a;
    public final o7.s0 f8214b;
    public final o7.s0 f8215c;
    public final int d;

    public p0(o7.s0 s0Var, o7.s0 s0Var2, o7.s0 s0Var3, int i10) {
        this.f8213a = s0Var;
        this.f8214b = s0Var2;
        this.f8215c = s0Var3;
        this.d = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        if (!o6.l.l(this.f8213a, p0Var.f8213a) || !o6.l.l(this.f8214b, p0Var.f8214b) || !o6.l.l(this.f8215c, p0Var.f8215c) || this.d != p0Var.d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8213a, this.f8214b, this.f8215c, Integer.valueOf(this.d)});
    }

    public final String toString() {
        byte[] t10;
        byte[] t11;
        byte[] bArr = null;
        o7.s0 s0Var = this.f8213a;
        if (s0Var == null) {
            t10 = null;
        } else {
            t10 = s0Var.t();
        }
        String c10 = v6.b.c(t10);
        o7.s0 s0Var2 = this.f8214b;
        if (s0Var2 == null) {
            t11 = null;
        } else {
            t11 = s0Var2.t();
        }
        String c11 = v6.b.c(t11);
        o7.s0 s0Var3 = this.f8215c;
        if (s0Var3 != null) {
            bArr = s0Var3.t();
        }
        String c12 = v6.b.c(bArr);
        StringBuilder w10 = a1.g.w("HmacSecretExtension{coseKeyAgreement=", c10, ", saltEnc=", c11, ", saltAuth=");
        w10.append(c12);
        w10.append(", getPinUvAuthProtocol=");
        return a1.g.n(this.d, "}", w10);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        byte[] t10;
        byte[] t11;
        int q5 = df.q(parcel, 20293);
        byte[] bArr = null;
        o7.s0 s0Var = this.f8213a;
        if (s0Var == null) {
            t10 = null;
        } else {
            t10 = s0Var.t();
        }
        df.c(parcel, 1, t10);
        o7.s0 s0Var2 = this.f8214b;
        if (s0Var2 == null) {
            t11 = null;
        } else {
            t11 = s0Var2.t();
        }
        df.c(parcel, 2, t11);
        o7.s0 s0Var3 = this.f8215c;
        if (s0Var3 != null) {
            bArr = s0Var3.t();
        }
        df.c(parcel, 3, bArr);
        df.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        df.r(parcel, q5);
    }
}
