package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class u0 extends o6.a {
    public static final Parcelable.Creator<u0> CREATOR = new r0(13);
    public final n7.s0 f4677a;
    public final n7.s0 f4678b;

    public u0(n7.s0 s0Var, n7.s0 s0Var2) {
        this.f4677a = s0Var;
        this.f4678b = s0Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        if (!n6.l.l(this.f4677a, u0Var.f4677a) || !n6.l.l(this.f4678b, u0Var.f4678b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4677a, this.f4678b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        byte[] u10;
        int q6 = w7.e0.q(parcel, 20293);
        byte[] bArr = null;
        n7.s0 s0Var = this.f4677a;
        if (s0Var == null) {
            u10 = null;
        } else {
            u10 = s0Var.u();
        }
        w7.e0.c(parcel, 1, u10);
        n7.s0 s0Var2 = this.f4678b;
        if (s0Var2 != null) {
            bArr = s0Var2.u();
        }
        w7.e0.c(parcel, 2, bArr);
        w7.e0.r(parcel, q6);
    }
}
