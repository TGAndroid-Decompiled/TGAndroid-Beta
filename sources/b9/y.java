package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class y extends r6.a {
    public static final Parcelable.Creator<y> CREATOR = new c(22);
    public final int f3083a;
    public final String f3084b;

    public y(int i7, String str) {
        this.f3083a = i7;
        this.f3084b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f3083a);
        yb.l(parcel, 3, this.f3084b);
        yb.s(parcel, r10);
    }
}
