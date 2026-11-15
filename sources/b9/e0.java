package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class e0 extends r6.a {
    public static final Parcelable.Creator<e0> CREATOR = new c(28);
    public final int f3000a;

    public e0(int i7) {
        this.f3000a = i7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f3000a);
        yb.s(parcel, r10);
    }
}
