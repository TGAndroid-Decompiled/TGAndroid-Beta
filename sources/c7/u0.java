package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class u0 extends o6.a {
    public static final Parcelable.Creator<u0> CREATOR = new r0(13);
    public final n7.s0 f4145a;
    public final n7.s0 f4146b;

    public u0(n7.s0 s0Var, n7.s0 s0Var2) {
        this.f4145a = s0Var;
        this.f4146b = s0Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        if (!n6.l.l(this.f4145a, u0Var.f4145a) || !n6.l.l(this.f4146b, u0Var.f4146b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4145a, this.f4146b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        byte[] u10;
        int q6 = w7.f0.q(parcel, 20293);
        byte[] bArr = null;
        n7.s0 s0Var = this.f4145a;
        if (s0Var == null) {
            u10 = null;
        } else {
            u10 = s0Var.u();
        }
        w7.f0.c(parcel, 1, u10);
        n7.s0 s0Var2 = this.f4146b;
        if (s0Var2 != null) {
            bArr = s0Var2.u();
        }
        w7.f0.c(parcel, 2, bArr);
        w7.f0.r(parcel, q6);
    }
}
