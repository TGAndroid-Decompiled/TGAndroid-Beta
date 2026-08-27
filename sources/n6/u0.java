package n6;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;

public final class u0 extends z5.a {
    public static final Parcelable.Creator<u0> CREATOR = new o0(24);

    public final y6.s0 f18416a;

    public final y6.s0 f18417b;

    public u0(y6.s0 s0Var, y6.s0 s0Var2) {
        this.f18416a = s0Var;
        this.f18417b = s0Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return y5.l.l(this.f18416a, u0Var.f18416a) && y5.l.l(this.f18417b, u0Var.f18417b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18416a, this.f18417b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        y6.s0 s0Var = this.f18416a;
        r8.c(parcel, 1, s0Var == null ? null : s0Var.u());
        y6.s0 s0Var2 = this.f18417b;
        r8.c(parcel, 2, s0Var2 != null ? s0Var2.u() : null);
        r8.r(parcel, iQ);
    }
}
