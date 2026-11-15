package j6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import f7.t0;
import java.util.Arrays;
public final class y extends r6.a {
    public static final Parcelable.Creator<y> CREATOR = new t0(27);
    public final int f16907a;
    public final boolean f16908b;
    public final boolean f16909c;

    public y(int i7, boolean z10, boolean z11) {
        this.f16907a = i7;
        this.f16908b = z10;
        this.f16909c = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (this.f16907a == yVar.f16907a && this.f16908b == yVar.f16908b && this.f16909c == yVar.f16909c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f16907a), Boolean.valueOf(this.f16908b), Boolean.valueOf(this.f16909c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f16907a);
        yb.q(parcel, 3, 4);
        parcel.writeInt(this.f16908b ? 1 : 0);
        yb.q(parcel, 4, 4);
        parcel.writeInt(this.f16909c ? 1 : 0);
        yb.s(parcel, r10);
    }
}
