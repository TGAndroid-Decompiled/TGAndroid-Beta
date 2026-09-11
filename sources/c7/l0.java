package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class l0 extends o6.a {
    public static final Parcelable.Creator<l0> CREATOR = new r0(9);
    public final int f4639a;
    public final short f4640b;
    public final short f4641c;

    public l0(int i10, short s10, short s11) {
        this.f4639a = i10;
        this.f4640b = s10;
        this.f4641c = s11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (this.f4639a != l0Var.f4639a || this.f4640b != l0Var.f4640b || this.f4641c != l0Var.f4641c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4639a), Short.valueOf(this.f4640b), Short.valueOf(this.f4641c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 1, 4);
        parcel.writeInt(this.f4639a);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f4640b);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.f4641c);
        w7.e0.r(parcel, q6);
    }
}
