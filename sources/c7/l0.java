package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class l0 extends o6.a {
    public static final Parcelable.Creator<l0> CREATOR = new r0(9);
    public final int f4494a;
    public final short f4495b;
    public final short f4496c;

    public l0(int i10, short s10, short s11) {
        this.f4494a = i10;
        this.f4495b = s10;
        this.f4496c = s11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (this.f4494a != l0Var.f4494a || this.f4495b != l0Var.f4495b || this.f4496c != l0Var.f4496c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4494a), Short.valueOf(this.f4495b), Short.valueOf(this.f4496c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.s(parcel, 1, 4);
        parcel.writeInt(this.f4494a);
        w7.c0.s(parcel, 2, 4);
        parcel.writeInt(this.f4495b);
        w7.c0.s(parcel, 3, 4);
        parcel.writeInt(this.f4496c);
        w7.c0.r(parcel, q6);
    }
}
