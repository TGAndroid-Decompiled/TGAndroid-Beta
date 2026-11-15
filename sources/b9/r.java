package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class r extends r6.a {
    public static final Parcelable.Creator<r> CREATOR = new c(15);
    public final int f3051a;
    public final boolean f3052b;
    public final boolean f3053c;

    public r(int i7, boolean z10, boolean z11) {
        this.f3051a = i7;
        this.f3052b = z10;
        this.f3053c = z11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f3051a);
        yb.q(parcel, 3, 4);
        parcel.writeInt(this.f3052b ? 1 : 0);
        yb.q(parcel, 4, 4);
        parcel.writeInt(this.f3053c ? 1 : 0);
        yb.s(parcel, r10);
    }
}
