package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class j extends r6.a {
    public static final Parcelable.Creator<j> CREATOR = new c(6);
    public final int f3016a;
    public final boolean f3017b;
    public final boolean f3018c;
    public final boolean d;
    public final boolean f3019e;

    public j(int i7, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f3016a = i7;
        this.f3017b = z10;
        this.f3018c = z11;
        this.d = z12;
        this.f3019e = z13;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 4);
        parcel.writeInt(this.f3016a);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f3017b ? 1 : 0);
        yb.q(parcel, 3, 4);
        parcel.writeInt(this.f3018c ? 1 : 0);
        yb.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        yb.q(parcel, 5, 4);
        parcel.writeInt(this.f3019e ? 1 : 0);
        yb.s(parcel, r10);
    }
}
