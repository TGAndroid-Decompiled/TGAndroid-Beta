package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class u0 extends o6.a {
    public static final Parcelable.Creator<u0> CREATOR = new r0(13);
    public final n7.s0 f4042a;
    public final n7.s0 f4043b;

    public u0(n7.s0 s0Var, n7.s0 s0Var2) {
        this.f4042a = s0Var;
        this.f4043b = s0Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        if (!n6.l.k(this.f4042a, u0Var.f4042a) || !n6.l.k(this.f4043b, u0Var.f4043b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4042a, this.f4043b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        byte[] t10;
        int q6 = w7.h0.q(parcel, 20293);
        byte[] bArr = null;
        n7.s0 s0Var = this.f4042a;
        if (s0Var == null) {
            t10 = null;
        } else {
            t10 = s0Var.t();
        }
        w7.h0.c(parcel, 1, t10);
        n7.s0 s0Var2 = this.f4043b;
        if (s0Var2 != null) {
            bArr = s0Var2.t();
        }
        w7.h0.c(parcel, 2, bArr);
        w7.h0.r(parcel, q6);
    }
}
