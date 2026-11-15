package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class r extends r6.a {
    public static final Parcelable.Creator<r> CREATOR = new c(15);
    public final int f3054a;
    public final boolean f3055b;
    public final boolean f3056c;

    public r(int i7, boolean z10, boolean z11) {
        this.f3054a = i7;
        this.f3055b = z10;
        this.f3056c = z11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f3054a);
        yb.q(parcel, 3, 4);
        parcel.writeInt(this.f3055b ? 1 : 0);
        yb.q(parcel, 4, 4);
        parcel.writeInt(this.f3056c ? 1 : 0);
        yb.s(parcel, r10);
    }
}
