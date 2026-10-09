package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class l0 extends o6.a {
    public static final Parcelable.Creator<l0> CREATOR = new r0(9);
    public final int f4496a;
    public final short f4497b;
    public final short f4498c;

    public l0(int i10, short s10, short s11) {
        this.f4496a = i10;
        this.f4497b = s10;
        this.f4498c = s11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (this.f4496a != l0Var.f4496a || this.f4497b != l0Var.f4497b || this.f4498c != l0Var.f4498c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4496a), Short.valueOf(this.f4497b), Short.valueOf(this.f4498c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 1, 4);
        parcel.writeInt(this.f4496a);
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(this.f4497b);
        w7.d0.s(parcel, 3, 4);
        parcel.writeInt(this.f4498c);
        w7.d0.r(parcel, q6);
    }
}
