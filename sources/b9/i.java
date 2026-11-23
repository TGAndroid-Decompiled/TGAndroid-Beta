package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class i extends r6.a {
    public static final Parcelable.Creator<i> CREATOR = new c(5);
    public final int f2980a;

    public i(int i7) {
        this.f2980a = i7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f2980a);
        cc.s(parcel, r10);
    }
}
