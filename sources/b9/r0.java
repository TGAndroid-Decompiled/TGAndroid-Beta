package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class r0 extends r6.a {
    public static final Parcelable.Creator<r0> CREATOR = new n0(4);
    public final int f3021a;

    public r0(int i7) {
        this.f3021a = i7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f3021a);
        cc.s(parcel, r10);
    }
}
