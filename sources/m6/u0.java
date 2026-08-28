package m6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
public final class u0 extends y5.a {
    public static final Parcelable.Creator<u0> CREATOR = new r0(13);
    public final x6.s0 f17580a;
    public final x6.s0 f17581b;

    public u0(x6.s0 s0Var, x6.s0 s0Var2) {
        this.f17580a = s0Var;
        this.f17581b = s0Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        if (!x5.l.l(this.f17580a, u0Var.f17580a) || !x5.l.l(this.f17581b, u0Var.f17581b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17580a, this.f17581b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        byte[] u10;
        int q10 = p8.q(parcel, 20293);
        byte[] bArr = null;
        x6.s0 s0Var = this.f17580a;
        if (s0Var == null) {
            u10 = null;
        } else {
            u10 = s0Var.u();
        }
        p8.c(parcel, 1, u10);
        x6.s0 s0Var2 = this.f17581b;
        if (s0Var2 != null) {
            bArr = s0Var2.u();
        }
        p8.c(parcel, 2, bArr);
        p8.r(parcel, q10);
    }
}
