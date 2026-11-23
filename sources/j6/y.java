package j6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import f7.t0;
import java.util.Arrays;
public final class y extends r6.a {
    public static final Parcelable.Creator<y> CREATOR = new t0(27);
    public final int f17317a;
    public final boolean f17318b;
    public final boolean f17319c;

    public y(int i7, boolean z10, boolean z11) {
        this.f17317a = i7;
        this.f17318b = z10;
        this.f17319c = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (this.f17317a == yVar.f17317a && this.f17318b == yVar.f17318b && this.f17319c == yVar.f17319c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f17317a), Boolean.valueOf(this.f17318b), Boolean.valueOf(this.f17319c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f17317a);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f17318b ? 1 : 0);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.f17319c ? 1 : 0);
        bc.s(parcel, r10);
    }
}
