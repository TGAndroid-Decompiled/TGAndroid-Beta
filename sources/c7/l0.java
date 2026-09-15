package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class l0 extends o6.a {
    public static final Parcelable.Creator<l0> CREATOR = new r0(9);
    public final int f4112a;
    public final short f4113b;
    public final short f4114c;

    public l0(int i10, short s10, short s11) {
        this.f4112a = i10;
        this.f4113b = s10;
        this.f4114c = s11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (this.f4112a != l0Var.f4112a || this.f4113b != l0Var.f4113b || this.f4114c != l0Var.f4114c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4112a), Short.valueOf(this.f4113b), Short.valueOf(this.f4114c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 1, 4);
        parcel.writeInt(this.f4112a);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f4113b);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.f4114c);
        w7.e0.r(parcel, q6);
    }
}
