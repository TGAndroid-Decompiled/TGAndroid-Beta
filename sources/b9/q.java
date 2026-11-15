package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class q extends r6.a {
    public static final Parcelable.Creator<q> CREATOR = new c(14);
    public final int f3050a;
    public final boolean f3051b;

    public q(int i7, boolean z10) {
        this.f3050a = i7;
        this.f3051b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f3050a);
        yb.q(parcel, 3, 4);
        parcel.writeInt(this.f3051b ? 1 : 0);
        yb.s(parcel, r10);
    }
}
