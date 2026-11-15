package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class l extends r6.a {
    public static final Parcelable.Creator<l> CREATOR = new c(9);
    public final int f3025a;
    public final int f3026b;

    public l(int i7, int i10) {
        this.f3025a = i7;
        this.f3026b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f3025a);
        yb.q(parcel, 3, 4);
        parcel.writeInt(this.f3026b);
        yb.s(parcel, r10);
    }
}
