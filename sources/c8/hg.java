package c8;

import android.os.Parcel;
import android.os.Parcelable;
public final class hg extends r6.a {
    public static final Parcelable.Creator<hg> CREATOR = new ag(3);
    public final boolean f4534a;
    public final boolean f4535b;
    public final boolean f4536c;
    public final boolean d;
    public final boolean f4537e;

    public hg(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f4534a = z10;
        this.f4535b = z11;
        this.f4536c = z12;
        this.d = z13;
        this.f4537e = z14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 4);
        parcel.writeInt(this.f4534a ? 1 : 0);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f4535b ? 1 : 0);
        yb.q(parcel, 3, 4);
        parcel.writeInt(this.f4536c ? 1 : 0);
        yb.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        yb.q(parcel, 5, 4);
        parcel.writeInt(this.f4537e ? 1 : 0);
        yb.s(parcel, r10);
    }
}
