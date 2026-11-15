package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class i extends r6.a {
    public static final Parcelable.Creator<i> CREATOR = new c(5);
    public final int f3016a;

    public i(int i7) {
        this.f3016a = i7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f3016a);
        yb.s(parcel, r10);
    }
}
