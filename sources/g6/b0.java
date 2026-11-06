package g6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import f7.t0;
public final class b0 extends r6.a {
    public static final Parcelable.Creator<b0> CREATOR = new t0(15);
    public final int f13542a;

    public b0(int i7) {
        this.f13542a = i7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f13542a);
        xb.s(parcel, r10);
    }
}
