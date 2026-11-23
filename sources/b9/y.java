package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class y extends r6.a {
    public static final Parcelable.Creator<y> CREATOR = new c(22);
    public final int f3046a;
    public final String f3047b;

    public y(int i7, String str) {
        this.f3046a = i7;
        this.f3047b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f3046a);
        cc.l(parcel, 3, this.f3047b);
        cc.s(parcel, r10);
    }
}
