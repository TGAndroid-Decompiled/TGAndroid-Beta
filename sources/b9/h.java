package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new c(4);
    public final int f2976a;

    public h(int i7) {
        this.f2976a = i7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f2976a);
        cc.s(parcel, r10);
    }
}
