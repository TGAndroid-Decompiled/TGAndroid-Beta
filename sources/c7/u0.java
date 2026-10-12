package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class u0 extends o6.a {
    public static final Parcelable.Creator<u0> CREATOR = new r0(13);
    public final n7.s0 f4638a;
    public final n7.s0 f4639b;

    public u0(n7.s0 s0Var, n7.s0 s0Var2) {
        this.f4638a = s0Var;
        this.f4639b = s0Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        if (!n6.l.l(this.f4638a, u0Var.f4638a) || !n6.l.l(this.f4639b, u0Var.f4639b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4638a, this.f4639b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        byte[] t10;
        int q6 = w7.g0.q(parcel, 20293);
        byte[] bArr = null;
        n7.s0 s0Var = this.f4638a;
        if (s0Var == null) {
            t10 = null;
        } else {
            t10 = s0Var.t();
        }
        w7.g0.c(parcel, 1, t10);
        n7.s0 s0Var2 = this.f4639b;
        if (s0Var2 != null) {
            bArr = s0Var2.t();
        }
        w7.g0.c(parcel, 2, bArr);
        w7.g0.r(parcel, q6);
    }
}
