package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class l extends r6.a {
    public static final Parcelable.Creator<l> CREATOR = new c(9);
    public final int f2993a;
    public final int f2994b;

    public l(int i7, int i10) {
        this.f2993a = i7;
        this.f2994b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f2993a);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.f2994b);
        cc.s(parcel, r10);
    }
}
