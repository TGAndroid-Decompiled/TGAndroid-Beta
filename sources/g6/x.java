package g6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.d0;
public final class x extends o6.a {
    public static final Parcelable.Creator<x> CREATOR = new e6.i(9);
    public final int f10382a;
    public final boolean f10383b;
    public final boolean f10384c;

    public x(int i10, boolean z10, boolean z11) {
        this.f10382a = i10;
        this.f10383b = z10;
        this.f10384c = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f10382a == xVar.f10382a && this.f10383b == xVar.f10383b && this.f10384c == xVar.f10384c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10382a), Boolean.valueOf(this.f10383b), Boolean.valueOf(this.f10384c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.s(parcel, 2, 4);
        parcel.writeInt(this.f10382a);
        d0.s(parcel, 3, 4);
        parcel.writeInt(this.f10383b ? 1 : 0);
        d0.s(parcel, 4, 4);
        parcel.writeInt(this.f10384c ? 1 : 0);
        d0.r(parcel, q6);
    }
}
