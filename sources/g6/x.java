package g6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.e0;
public final class x extends o6.a {
    public static final Parcelable.Creator<x> CREATOR = new e6.i(9);
    public final int f10474a;
    public final boolean f10475b;
    public final boolean f10476c;

    public x(int i10, boolean z10, boolean z11) {
        this.f10474a = i10;
        this.f10475b = z10;
        this.f10476c = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f10474a == xVar.f10474a && this.f10475b == xVar.f10475b && this.f10476c == xVar.f10476c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10474a), Boolean.valueOf(this.f10475b), Boolean.valueOf(this.f10476c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 2, 4);
        parcel.writeInt(this.f10474a);
        e0.s(parcel, 3, 4);
        parcel.writeInt(this.f10475b ? 1 : 0);
        e0.s(parcel, 4, 4);
        parcel.writeInt(this.f10476c ? 1 : 0);
        e0.r(parcel, q6);
    }
}
