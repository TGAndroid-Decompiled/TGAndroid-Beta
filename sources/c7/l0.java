package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class l0 extends o6.a {
    public static final Parcelable.Creator<l0> CREATOR = new r0(9);
    public final int f4445a;
    public final short f4446b;
    public final short f4447c;

    public l0(int i10, short s10, short s11) {
        this.f4445a = i10;
        this.f4446b = s10;
        this.f4447c = s11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (this.f4445a != l0Var.f4445a || this.f4446b != l0Var.f4446b || this.f4447c != l0Var.f4447c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4445a), Short.valueOf(this.f4446b), Short.valueOf(this.f4447c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 1, 4);
        parcel.writeInt(this.f4445a);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f4446b);
        w7.g0.s(parcel, 3, 4);
        parcel.writeInt(this.f4447c);
        w7.g0.r(parcel, q6);
    }
}
