package j6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import f7.t0;
import java.util.Arrays;
public final class y extends r6.a {
    public static final Parcelable.Creator<y> CREATOR = new t0(27);
    public final int f17289a;
    public final boolean f17290b;
    public final boolean f17291c;

    public y(int i7, boolean z10, boolean z11) {
        this.f17289a = i7;
        this.f17290b = z10;
        this.f17291c = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (this.f17289a == yVar.f17289a && this.f17290b == yVar.f17290b && this.f17291c == yVar.f17291c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f17289a), Boolean.valueOf(this.f17290b), Boolean.valueOf(this.f17291c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f17289a);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f17290b ? 1 : 0);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.f17291c ? 1 : 0);
        bc.s(parcel, r10);
    }
}
