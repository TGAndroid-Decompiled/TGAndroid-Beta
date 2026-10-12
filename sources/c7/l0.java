package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class l0 extends o6.a {
    public static final Parcelable.Creator<l0> CREATOR = new r0(9);
    public final int f4602a;
    public final short f4603b;
    public final short f4604c;

    public l0(int i10, short s10, short s11) {
        this.f4602a = i10;
        this.f4603b = s10;
        this.f4604c = s11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (this.f4602a != l0Var.f4602a || this.f4603b != l0Var.f4603b || this.f4604c != l0Var.f4604c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4602a), Short.valueOf(this.f4603b), Short.valueOf(this.f4604c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 1, 4);
        parcel.writeInt(this.f4602a);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f4603b);
        w7.g0.s(parcel, 3, 4);
        parcel.writeInt(this.f4604c);
        w7.g0.r(parcel, q6);
    }
}
