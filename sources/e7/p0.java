package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class p0 extends q6.a {
    public static final Parcelable.Creator<p0> CREATOR = new w.a(26);
    public final p7.t0 f9855a;
    public final p7.t0 f9856b;
    public final p7.t0 f9857c;
    public final int d;

    public p0(p7.t0 t0Var, p7.t0 t0Var2, p7.t0 t0Var3, int i3) {
        this.f9855a = t0Var;
        this.f9856b = t0Var2;
        this.f9857c = t0Var3;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        if (!p6.m.k(this.f9855a, p0Var.f9855a) || !p6.m.k(this.f9856b, p0Var.f9856b) || !p6.m.k(this.f9857c, p0Var.f9857c) || this.d != p0Var.d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9855a, this.f9856b, this.f9857c, Integer.valueOf(this.d)});
    }

    public final String toString() {
        byte[] p10;
        byte[] p11;
        byte[] bArr = null;
        p7.t0 t0Var = this.f9855a;
        if (t0Var == null) {
            p10 = null;
        } else {
            p10 = t0Var.p();
        }
        String c2 = w6.b.c(p10);
        p7.t0 t0Var2 = this.f9856b;
        if (t0Var2 == null) {
            p11 = null;
        } else {
            p11 = t0Var2.p();
        }
        String c10 = w6.b.c(p11);
        p7.t0 t0Var3 = this.f9857c;
        if (t0Var3 != null) {
            bArr = t0Var3.p();
        }
        String c11 = w6.b.c(bArr);
        StringBuilder n4 = com.google.android.recaptcha.internal.a.n("HmacSecretExtension{coseKeyAgreement=", c2, ", saltEnc=", c10, ", saltAuth=");
        n4.append(c11);
        n4.append(", getPinUvAuthProtocol=");
        return a1.g.o(this.d, "}", n4);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        byte[] p10;
        byte[] p11;
        int s6 = j8.a.s(parcel, 20293);
        byte[] bArr = null;
        p7.t0 t0Var = this.f9855a;
        if (t0Var == null) {
            p10 = null;
        } else {
            p10 = t0Var.p();
        }
        j8.a.d(parcel, 1, p10);
        p7.t0 t0Var2 = this.f9856b;
        if (t0Var2 == null) {
            p11 = null;
        } else {
            p11 = t0Var2.p();
        }
        j8.a.d(parcel, 2, p11);
        p7.t0 t0Var3 = this.f9857c;
        if (t0Var3 != null) {
            bArr = t0Var3.p();
        }
        j8.a.d(parcel, 3, bArr);
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(this.d);
        j8.a.t(parcel, s6);
    }
}
