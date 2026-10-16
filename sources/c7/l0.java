package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class l0 extends o6.a {
    public static final Parcelable.Creator<l0> CREATOR = new r0(9);
    public final int f4605a;
    public final short f4606b;
    public final short f4607c;

    public l0(int i10, short s10, short s11) {
        this.f4605a = i10;
        this.f4606b = s10;
        this.f4607c = s11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (this.f4605a != l0Var.f4605a || this.f4606b != l0Var.f4606b || this.f4607c != l0Var.f4607c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4605a), Short.valueOf(this.f4606b), Short.valueOf(this.f4607c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 1, 4);
        parcel.writeInt(this.f4605a);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f4606b);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f4607c);
        w7.f0.r(parcel, q6);
    }
}
