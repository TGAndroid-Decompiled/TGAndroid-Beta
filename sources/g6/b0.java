package g6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import f7.t0;
public final class b0 extends r6.a {
    public static final Parcelable.Creator<b0> CREATOR = new t0(15);
    public final int f13202a;

    public b0(int i7) {
        this.f13202a = i7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f13202a);
        cc.s(parcel, r10);
    }
}
