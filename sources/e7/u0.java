package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class u0 extends q6.a {
    public static final Parcelable.Creator<u0> CREATOR = new r0(17);
    public final p7.t0 f9881a;
    public final p7.t0 f9882b;

    public u0(p7.t0 t0Var, p7.t0 t0Var2) {
        this.f9881a = t0Var;
        this.f9882b = t0Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        if (!p6.m.k(this.f9881a, u0Var.f9881a) || !p6.m.k(this.f9882b, u0Var.f9882b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9881a, this.f9882b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        byte[] p10;
        int s6 = j8.a.s(parcel, 20293);
        byte[] bArr = null;
        p7.t0 t0Var = this.f9881a;
        if (t0Var == null) {
            p10 = null;
        } else {
            p10 = t0Var.p();
        }
        j8.a.d(parcel, 1, p10);
        p7.t0 t0Var2 = this.f9882b;
        if (t0Var2 != null) {
            bArr = t0Var2.p();
        }
        j8.a.d(parcel, 2, bArr);
        j8.a.t(parcel, s6);
    }
}
