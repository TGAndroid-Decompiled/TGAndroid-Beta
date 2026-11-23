package j6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import f7.t0;
import java.util.Arrays;
public final class y extends r6.a {
    public static final Parcelable.Creator<y> CREATOR = new t0(27);
    public final int f17283a;
    public final boolean f17284b;
    public final boolean f17285c;

    public y(int i7, boolean z10, boolean z11) {
        this.f17283a = i7;
        this.f17284b = z10;
        this.f17285c = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (this.f17283a == yVar.f17283a && this.f17284b == yVar.f17284b && this.f17285c == yVar.f17285c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f17283a), Boolean.valueOf(this.f17284b), Boolean.valueOf(this.f17285c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f17283a);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.f17284b ? 1 : 0);
        cc.q(parcel, 4, 4);
        parcel.writeInt(this.f17285c ? 1 : 0);
        cc.s(parcel, r10);
    }
}
