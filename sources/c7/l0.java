package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class l0 extends o6.a {
    public static final Parcelable.Creator<l0> CREATOR = new r0(9);
    public final int f4109a;
    public final short f4110b;
    public final short f4111c;

    public l0(int i10, short s10, short s11) {
        this.f4109a = i10;
        this.f4110b = s10;
        this.f4111c = s11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (this.f4109a != l0Var.f4109a || this.f4110b != l0Var.f4110b || this.f4111c != l0Var.f4111c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4109a), Short.valueOf(this.f4110b), Short.valueOf(this.f4111c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 1, 4);
        parcel.writeInt(this.f4109a);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f4110b);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.f4111c);
        w7.e0.r(parcel, q6);
    }
}
