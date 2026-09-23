package g6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.e0;
public final class x extends o6.a {
    public static final Parcelable.Creator<x> CREATOR = new e6.i(9);
    public final int f9469a;
    public final boolean f9470b;
    public final boolean f9471c;

    public x(int i10, boolean z10, boolean z11) {
        this.f9469a = i10;
        this.f9470b = z10;
        this.f9471c = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f9469a == xVar.f9469a && this.f9470b == xVar.f9470b && this.f9471c == xVar.f9471c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9469a), Boolean.valueOf(this.f9470b), Boolean.valueOf(this.f9471c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 2, 4);
        parcel.writeInt(this.f9469a);
        e0.s(parcel, 3, 4);
        parcel.writeInt(this.f9470b ? 1 : 0);
        e0.s(parcel, 4, 4);
        parcel.writeInt(this.f9471c ? 1 : 0);
        e0.r(parcel, q6);
    }
}
