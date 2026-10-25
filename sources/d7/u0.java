package d7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class u0 extends p6.a {
    public static final Parcelable.Creator<u0> CREATOR = new r0(14);
    public final o7.s0 f8237a;
    public final o7.s0 f8238b;

    public u0(o7.s0 s0Var, o7.s0 s0Var2) {
        this.f8237a = s0Var;
        this.f8238b = s0Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        if (!o6.l.l(this.f8237a, u0Var.f8237a) || !o6.l.l(this.f8238b, u0Var.f8238b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8237a, this.f8238b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        byte[] t10;
        int q5 = df.q(parcel, 20293);
        byte[] bArr = null;
        o7.s0 s0Var = this.f8237a;
        if (s0Var == null) {
            t10 = null;
        } else {
            t10 = s0Var.t();
        }
        df.c(parcel, 1, t10);
        o7.s0 s0Var2 = this.f8238b;
        if (s0Var2 != null) {
            bArr = s0Var2.t();
        }
        df.c(parcel, 2, bArr);
        df.r(parcel, q5);
    }
}
