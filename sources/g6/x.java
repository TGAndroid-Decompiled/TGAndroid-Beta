package g6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.f0;
public final class x extends o6.a {
    public static final Parcelable.Creator<x> CREATOR = new e6.i(9);
    public final int f9485a;
    public final boolean f9486b;
    public final boolean f9487c;

    public x(int i10, boolean z10, boolean z11) {
        this.f9485a = i10;
        this.f9486b = z10;
        this.f9487c = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f9485a == xVar.f9485a && this.f9486b == xVar.f9486b && this.f9487c == xVar.f9487c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9485a), Boolean.valueOf(this.f9486b), Boolean.valueOf(this.f9487c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 2, 4);
        parcel.writeInt(this.f9485a);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f9486b ? 1 : 0);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.f9487c ? 1 : 0);
        f0.r(parcel, q6);
    }
}
