package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class y extends r6.a {
    public static final Parcelable.Creator<y> CREATOR = new c(22);
    public final int f3080a;
    public final String f3081b;

    public y(int i7, String str) {
        this.f3080a = i7;
        this.f3081b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f3080a);
        yb.l(parcel, 3, this.f3081b);
        yb.s(parcel, r10);
    }
}
