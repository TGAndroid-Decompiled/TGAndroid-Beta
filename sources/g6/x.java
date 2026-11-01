package g6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.h0;
public final class x extends o6.a {
    public static final Parcelable.Creator<x> CREATOR = new e6.p(8);
    public final int f7424a;
    public final boolean f7425b;
    public final boolean f7426c;

    public x(int i10, boolean z10, boolean z11) {
        this.f7424a = i10;
        this.f7425b = z10;
        this.f7426c = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f7424a == xVar.f7424a && this.f7425b == xVar.f7425b && this.f7426c == xVar.f7426c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7424a), Boolean.valueOf(this.f7425b), Boolean.valueOf(this.f7426c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.s(parcel, 2, 4);
        parcel.writeInt(this.f7424a);
        h0.s(parcel, 3, 4);
        parcel.writeInt(this.f7425b ? 1 : 0);
        h0.s(parcel, 4, 4);
        parcel.writeInt(this.f7426c ? 1 : 0);
        h0.r(parcel, q6);
    }
}
