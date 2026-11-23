package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new c(3);
    public final int f2974a;

    public g(int i7) {
        this.f2974a = i7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f2974a);
        cc.s(parcel, r10);
    }
}
