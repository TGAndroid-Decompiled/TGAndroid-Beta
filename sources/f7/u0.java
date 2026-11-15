package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.Arrays;
public final class u0 extends r6.a {
    public static final Parcelable.Creator<u0> CREATOR = new t0(2);
    public final q7.s0 f11252a;
    public final q7.s0 f11253b;

    public u0(q7.s0 s0Var, q7.s0 s0Var2) {
        this.f11252a = s0Var;
        this.f11253b = s0Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        if (!q6.m.k(this.f11252a, u0Var.f11252a) || !q6.m.k(this.f11253b, u0Var.f11253b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11252a, this.f11253b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        byte[] p10;
        int r10 = yb.r(parcel, 20293);
        byte[] bArr = null;
        q7.s0 s0Var = this.f11252a;
        if (s0Var == null) {
            p10 = null;
        } else {
            p10 = s0Var.p();
        }
        yb.c(parcel, 1, p10);
        q7.s0 s0Var2 = this.f11253b;
        if (s0Var2 != null) {
            bArr = s0Var2.p();
        }
        yb.c(parcel, 2, bArr);
        yb.s(parcel, r10);
    }
}
