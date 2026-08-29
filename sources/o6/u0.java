package o6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class u0 extends a6.a {
    public static final Parcelable.Creator<u0> CREATOR = new n0(25);
    public final z6.s0 f19440a;
    public final z6.s0 f19441b;

    public u0(z6.s0 s0Var, z6.s0 s0Var2) {
        this.f19440a = s0Var;
        this.f19441b = s0Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        if (!z5.l.l(this.f19440a, u0Var.f19440a) || !z5.l.l(this.f19441b, u0Var.f19441b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19440a, this.f19441b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        byte[] u10;
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        byte[] bArr = null;
        z6.s0 s0Var = this.f19440a;
        if (s0Var == null) {
            u10 = null;
        } else {
            u10 = s0Var.u();
        }
        com.google.android.gms.internal.cast.o.c(parcel, 1, u10);
        z6.s0 s0Var2 = this.f19441b;
        if (s0Var2 != null) {
            bArr = s0Var2.u();
        }
        com.google.android.gms.internal.cast.o.c(parcel, 2, bArr);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
