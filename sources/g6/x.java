package g6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.g0;
public final class x extends o6.a {
    public static final Parcelable.Creator<x> CREATOR = new e6.i(9);
    public final int f9990a;
    public final boolean f9991b;
    public final boolean f9992c;

    public x(int i10, boolean z10, boolean z11) {
        this.f9990a = i10;
        this.f9991b = z10;
        this.f9992c = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f9990a == xVar.f9990a && this.f9991b == xVar.f9991b && this.f9992c == xVar.f9992c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9990a), Boolean.valueOf(this.f9991b), Boolean.valueOf(this.f9992c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 2, 4);
        parcel.writeInt(this.f9990a);
        g0.s(parcel, 3, 4);
        parcel.writeInt(this.f9991b ? 1 : 0);
        g0.s(parcel, 4, 4);
        parcel.writeInt(this.f9992c ? 1 : 0);
        g0.r(parcel, q6);
    }
}
