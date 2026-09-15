package g6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.e0;
public final class x extends o6.a {
    public static final Parcelable.Creator<x> CREATOR = new e6.i(9);
    public final int f9481a;
    public final boolean f9482b;
    public final boolean f9483c;

    public x(int i10, boolean z10, boolean z11) {
        this.f9481a = i10;
        this.f9482b = z10;
        this.f9483c = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f9481a == xVar.f9481a && this.f9482b == xVar.f9482b && this.f9483c == xVar.f9483c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9481a), Boolean.valueOf(this.f9482b), Boolean.valueOf(this.f9483c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 2, 4);
        parcel.writeInt(this.f9481a);
        e0.s(parcel, 3, 4);
        parcel.writeInt(this.f9482b ? 1 : 0);
        e0.s(parcel, 4, 4);
        parcel.writeInt(this.f9483c ? 1 : 0);
        e0.r(parcel, q6);
    }
}
