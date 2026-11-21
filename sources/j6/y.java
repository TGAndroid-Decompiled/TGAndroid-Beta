package j6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import f7.t0;
import java.util.Arrays;
public final class y extends r6.a {
    public static final Parcelable.Creator<y> CREATOR = new t0(27);
    public final int f17314a;
    public final boolean f17315b;
    public final boolean f17316c;

    public y(int i7, boolean z10, boolean z11) {
        this.f17314a = i7;
        this.f17315b = z10;
        this.f17316c = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (this.f17314a == yVar.f17314a && this.f17315b == yVar.f17315b && this.f17316c == yVar.f17316c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f17314a), Boolean.valueOf(this.f17315b), Boolean.valueOf(this.f17316c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f17314a);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f17315b ? 1 : 0);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.f17316c ? 1 : 0);
        bc.s(parcel, r10);
    }
}
