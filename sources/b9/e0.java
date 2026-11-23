package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class e0 extends r6.a {
    public static final Parcelable.Creator<e0> CREATOR = new c(28);
    public final int f2966a;

    public e0(int i7) {
        this.f2966a = i7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f2966a);
        cc.s(parcel, r10);
    }
}
