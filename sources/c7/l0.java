package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class l0 extends o6.a {
    public static final Parcelable.Creator<l0> CREATOR = new r0(9);
    public final int f4006a;
    public final short f4007b;
    public final short f4008c;

    public l0(int i10, short s10, short s11) {
        this.f4006a = i10;
        this.f4007b = s10;
        this.f4008c = s11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (this.f4006a != l0Var.f4006a || this.f4007b != l0Var.f4007b || this.f4008c != l0Var.f4008c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4006a), Short.valueOf(this.f4007b), Short.valueOf(this.f4008c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 1, 4);
        parcel.writeInt(this.f4006a);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.f4007b);
        w7.h0.s(parcel, 3, 4);
        parcel.writeInt(this.f4008c);
        w7.h0.r(parcel, q6);
    }
}
