package g6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import f7.t0;
public final class b0 extends r6.a {
    public static final Parcelable.Creator<b0> CREATOR = new t0(15);
    public final int f12893a;

    public b0(int i7) {
        this.f12893a = i7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f12893a);
        yb.s(parcel, r10);
    }
}
