package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.internal.vision.e2;
import java.util.Arrays;
public final class p0 extends r6.a {
    public static final Parcelable.Creator<p0> CREATOR = new db.k(11);
    public final q7.s0 f11546a;
    public final q7.s0 f11547b;
    public final q7.s0 f11548c;
    public final int d;

    public p0(q7.s0 s0Var, q7.s0 s0Var2, q7.s0 s0Var3, int i7) {
        this.f11546a = s0Var;
        this.f11547b = s0Var2;
        this.f11548c = s0Var3;
        this.d = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        if (!q6.m.l(this.f11546a, p0Var.f11546a) || !q6.m.l(this.f11547b, p0Var.f11547b) || !q6.m.l(this.f11548c, p0Var.f11548c) || this.d != p0Var.d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11546a, this.f11547b, this.f11548c, Integer.valueOf(this.d)});
    }

    public final String toString() {
        byte[] p10;
        byte[] p11;
        byte[] bArr = null;
        q7.s0 s0Var = this.f11546a;
        if (s0Var == null) {
            p10 = null;
        } else {
            p10 = s0Var.p();
        }
        String c10 = x6.b.c(p10);
        q7.s0 s0Var2 = this.f11547b;
        if (s0Var2 == null) {
            p11 = null;
        } else {
            p11 = s0Var2.p();
        }
        String c11 = x6.b.c(p11);
        q7.s0 s0Var3 = this.f11548c;
        if (s0Var3 != null) {
            bArr = s0Var3.p();
        }
        String c12 = x6.b.c(bArr);
        StringBuilder n10 = e2.n("HmacSecretExtension{coseKeyAgreement=", c10, ", saltEnc=", c11, ", saltAuth=");
        n10.append(c12);
        n10.append(", getPinUvAuthProtocol=");
        return a8.p0.n(this.d, "}", n10);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        byte[] p10;
        byte[] p11;
        int r10 = bc.r(parcel, 20293);
        byte[] bArr = null;
        q7.s0 s0Var = this.f11546a;
        if (s0Var == null) {
            p10 = null;
        } else {
            p10 = s0Var.p();
        }
        bc.c(parcel, 1, p10);
        q7.s0 s0Var2 = this.f11547b;
        if (s0Var2 == null) {
            p11 = null;
        } else {
            p11 = s0Var2.p();
        }
        bc.c(parcel, 2, p11);
        q7.s0 s0Var3 = this.f11548c;
        if (s0Var3 != null) {
            bArr = s0Var3.p();
        }
        bc.c(parcel, 3, bArr);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        bc.s(parcel, r10);
    }
}
