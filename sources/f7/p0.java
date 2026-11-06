package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.Arrays;
public final class p0 extends r6.a {
    public static final Parcelable.Creator<p0> CREATOR = new db.k(11);
    public final q7.s0 f11412a;
    public final q7.s0 f11413b;
    public final q7.s0 f11414c;
    public final int d;

    public p0(q7.s0 s0Var, q7.s0 s0Var2, q7.s0 s0Var3, int i7) {
        this.f11412a = s0Var;
        this.f11413b = s0Var2;
        this.f11414c = s0Var3;
        this.d = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        if (!q6.m.k(this.f11412a, p0Var.f11412a) || !q6.m.k(this.f11413b, p0Var.f11413b) || !q6.m.k(this.f11414c, p0Var.f11414c) || this.d != p0Var.d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11412a, this.f11413b, this.f11414c, Integer.valueOf(this.d)});
    }

    public final String toString() {
        byte[] p10;
        byte[] p11;
        byte[] bArr = null;
        q7.s0 s0Var = this.f11412a;
        if (s0Var == null) {
            p10 = null;
        } else {
            p10 = s0Var.p();
        }
        String c10 = x6.b.c(p10);
        q7.s0 s0Var2 = this.f11413b;
        if (s0Var2 == null) {
            p11 = null;
        } else {
            p11 = s0Var2.p();
        }
        String c11 = x6.b.c(p11);
        q7.s0 s0Var3 = this.f11414c;
        if (s0Var3 != null) {
            bArr = s0Var3.p();
        }
        String c12 = x6.b.c(bArr);
        StringBuilder n10 = com.google.android.recaptcha.internal.a.n("HmacSecretExtension{coseKeyAgreement=", c10, ", saltEnc=", c11, ", saltAuth=");
        n10.append(c12);
        n10.append(", getPinUvAuthProtocol=");
        return a8.p0.n(this.d, "}", n10);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        byte[] p10;
        byte[] p11;
        int r10 = wb.r(parcel, 20293);
        byte[] bArr = null;
        q7.s0 s0Var = this.f11412a;
        if (s0Var == null) {
            p10 = null;
        } else {
            p10 = s0Var.p();
        }
        wb.c(parcel, 1, p10);
        q7.s0 s0Var2 = this.f11413b;
        if (s0Var2 == null) {
            p11 = null;
        } else {
            p11 = s0Var2.p();
        }
        wb.c(parcel, 2, p11);
        q7.s0 s0Var3 = this.f11414c;
        if (s0Var3 != null) {
            bArr = s0Var3.p();
        }
        wb.c(parcel, 3, bArr);
        wb.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        wb.s(parcel, r10);
    }
}
