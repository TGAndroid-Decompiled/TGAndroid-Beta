package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class l0 extends q6.a {
    public static final Parcelable.Creator<l0> CREATOR = new r0(13);
    public final int f9843a;
    public final short f9844b;
    public final short f9845c;

    public l0(int i3, short s6, short s10) {
        this.f9843a = i3;
        this.f9844b = s6;
        this.f9845c = s10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (this.f9843a != l0Var.f9843a || this.f9844b != l0Var.f9844b || this.f9845c != l0Var.f9845c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9843a), Short.valueOf(this.f9844b), Short.valueOf(this.f9845c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.f9843a);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f9844b);
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(this.f9845c);
        j8.a.t(parcel, s6);
    }
}
