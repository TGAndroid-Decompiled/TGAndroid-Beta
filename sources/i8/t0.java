package i8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class t0 extends y5.a {
    public static final Parcelable.Creator<t0> CREATOR = new p0(4);
    public final int f11038a;

    public t0(int i9) {
        this.f11038a = i9;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f11038a);
        p8.r(parcel, q10);
    }
}
