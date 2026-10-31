package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class p0 extends o6.a {
    public static final Parcelable.Creator<p0> CREATOR = new w.a(22);
    public final n7.s0 f4018a;
    public final n7.s0 f4019b;
    public final n7.s0 f4020c;
    public final int d;

    public p0(n7.s0 s0Var, n7.s0 s0Var2, n7.s0 s0Var3, int i10) {
        this.f4018a = s0Var;
        this.f4019b = s0Var2;
        this.f4020c = s0Var3;
        this.d = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        if (!n6.l.k(this.f4018a, p0Var.f4018a) || !n6.l.k(this.f4019b, p0Var.f4019b) || !n6.l.k(this.f4020c, p0Var.f4020c) || this.d != p0Var.d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4018a, this.f4019b, this.f4020c, Integer.valueOf(this.d)});
    }

    public final String toString() {
        byte[] t10;
        byte[] t11;
        byte[] bArr = null;
        n7.s0 s0Var = this.f4018a;
        if (s0Var == null) {
            t10 = null;
        } else {
            t10 = s0Var.t();
        }
        String c10 = u6.b.c(t10);
        n7.s0 s0Var2 = this.f4019b;
        if (s0Var2 == null) {
            t11 = null;
        } else {
            t11 = s0Var2.t();
        }
        String c11 = u6.b.c(t11);
        n7.s0 s0Var3 = this.f4020c;
        if (s0Var3 != null) {
            bArr = s0Var3.t();
        }
        String c12 = u6.b.c(bArr);
        StringBuilder v = a1.g.v("HmacSecretExtension{coseKeyAgreement=", c10, ", saltEnc=", c11, ", saltAuth=");
        v.append(c12);
        v.append(", getPinUvAuthProtocol=");
        return a1.g.p(v, this.d, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        byte[] t10;
        byte[] t11;
        int q6 = w7.h0.q(parcel, 20293);
        byte[] bArr = null;
        n7.s0 s0Var = this.f4018a;
        if (s0Var == null) {
            t10 = null;
        } else {
            t10 = s0Var.t();
        }
        w7.h0.c(parcel, 1, t10);
        n7.s0 s0Var2 = this.f4019b;
        if (s0Var2 == null) {
            t11 = null;
        } else {
            t11 = s0Var2.t();
        }
        w7.h0.c(parcel, 2, t11);
        n7.s0 s0Var3 = this.f4020c;
        if (s0Var3 != null) {
            bArr = s0Var3.t();
        }
        w7.h0.c(parcel, 3, bArr);
        w7.h0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.h0.r(parcel, q6);
    }
}
