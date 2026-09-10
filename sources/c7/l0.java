package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class l0 extends o6.a {
    public static final Parcelable.Creator<l0> CREATOR = new r0(9);
    public final int f4531a;
    public final short f4532b;
    public final short f4533c;

    public l0(int i10, short s10, short s11) {
        this.f4531a = i10;
        this.f4532b = s10;
        this.f4533c = s11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (this.f4531a != l0Var.f4531a || this.f4532b != l0Var.f4532b || this.f4533c != l0Var.f4533c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4531a), Short.valueOf(this.f4532b), Short.valueOf(this.f4533c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 1, 4);
        parcel.writeInt(this.f4531a);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f4532b);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.f4533c);
        w7.e0.r(parcel, q6);
    }
}
