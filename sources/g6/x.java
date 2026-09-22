package g6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.e0;
public final class x extends o6.a {
    public static final Parcelable.Creator<x> CREATOR = new e6.i(9);
    public final int f9483a;
    public final boolean f9484b;
    public final boolean f9485c;

    public x(int i10, boolean z10, boolean z11) {
        this.f9483a = i10;
        this.f9484b = z10;
        this.f9485c = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f9483a == xVar.f9483a && this.f9484b == xVar.f9484b && this.f9485c == xVar.f9485c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9483a), Boolean.valueOf(this.f9484b), Boolean.valueOf(this.f9485c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 2, 4);
        parcel.writeInt(this.f9483a);
        e0.s(parcel, 3, 4);
        parcel.writeInt(this.f9484b ? 1 : 0);
        e0.s(parcel, 4, 4);
        parcel.writeInt(this.f9485c ? 1 : 0);
        e0.r(parcel, q6);
    }
}
