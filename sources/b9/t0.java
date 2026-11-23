package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class t0 extends r6.a {
    public static final Parcelable.Creator<t0> CREATOR = new n0(6);
    public final int f3029a;
    public final int f3030b;

    public t0(int i7, int i10) {
        this.f3029a = i7;
        this.f3030b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f3029a);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.f3030b);
        cc.s(parcel, r10);
    }
}
