package g6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.g0;
public final class x extends o6.a {
    public static final Parcelable.Creator<x> CREATOR = new e6.i(9);
    public final int f10310a;
    public final boolean f10311b;
    public final boolean f10312c;

    public x(int i10, boolean z10, boolean z11) {
        this.f10310a = i10;
        this.f10311b = z10;
        this.f10312c = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f10310a == xVar.f10310a && this.f10311b == xVar.f10311b && this.f10312c == xVar.f10312c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10310a), Boolean.valueOf(this.f10311b), Boolean.valueOf(this.f10312c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 2, 4);
        parcel.writeInt(this.f10310a);
        g0.s(parcel, 3, 4);
        parcel.writeInt(this.f10311b ? 1 : 0);
        g0.s(parcel, 4, 4);
        parcel.writeInt(this.f10312c ? 1 : 0);
        g0.r(parcel, q6);
    }
}
