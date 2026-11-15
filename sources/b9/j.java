package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class j extends r6.a {
    public static final Parcelable.Creator<j> CREATOR = new c(6);
    public final int f3019a;
    public final boolean f3020b;
    public final boolean f3021c;
    public final boolean d;
    public final boolean f3022e;

    public j(int i7, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f3019a = i7;
        this.f3020b = z10;
        this.f3021c = z11;
        this.d = z12;
        this.f3022e = z13;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 4);
        parcel.writeInt(this.f3019a);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f3020b ? 1 : 0);
        yb.q(parcel, 3, 4);
        parcel.writeInt(this.f3021c ? 1 : 0);
        yb.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        yb.q(parcel, 5, 4);
        parcel.writeInt(this.f3022e ? 1 : 0);
        yb.s(parcel, r10);
    }
}
