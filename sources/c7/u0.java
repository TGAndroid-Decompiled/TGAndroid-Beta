package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class u0 extends o6.a {
    public static final Parcelable.Creator<u0> CREATOR = new r0(13);
    public final n7.s0 f5009a;
    public final n7.s0 f5010b;

    public u0(n7.s0 s0Var, n7.s0 s0Var2) {
        this.f5009a = s0Var;
        this.f5010b = s0Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        if (!n6.l.l(this.f5009a, u0Var.f5009a) || !n6.l.l(this.f5010b, u0Var.f5010b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5009a, this.f5010b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        byte[] t10;
        int q6 = w7.f0.q(parcel, 20293);
        byte[] bArr = null;
        n7.s0 s0Var = this.f5009a;
        if (s0Var == null) {
            t10 = null;
        } else {
            t10 = s0Var.t();
        }
        w7.f0.c(parcel, 1, t10);
        n7.s0 s0Var2 = this.f5010b;
        if (s0Var2 != null) {
            bArr = s0Var2.t();
        }
        w7.f0.c(parcel, 2, bArr);
        w7.f0.r(parcel, q6);
    }
}
