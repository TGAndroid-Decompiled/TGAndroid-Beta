package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class u0 extends o6.a {
    public static final Parcelable.Creator<u0> CREATOR = new r0(13);
    public final n7.t0 f5012a;
    public final n7.t0 f5013b;

    public u0(n7.t0 t0Var, n7.t0 t0Var2) {
        this.f5012a = t0Var;
        this.f5013b = t0Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        if (!n6.l.l(this.f5012a, u0Var.f5012a) || !n6.l.l(this.f5013b, u0Var.f5013b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5012a, this.f5013b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        byte[] t10;
        int q6 = w7.f0.q(parcel, 20293);
        byte[] bArr = null;
        n7.t0 t0Var = this.f5012a;
        if (t0Var == null) {
            t10 = null;
        } else {
            t10 = t0Var.t();
        }
        w7.f0.c(parcel, 1, t10);
        n7.t0 t0Var2 = this.f5013b;
        if (t0Var2 != null) {
            bArr = t0Var2.t();
        }
        w7.f0.c(parcel, 2, bArr);
        w7.f0.r(parcel, q6);
    }
}
