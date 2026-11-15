package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class b0 extends r6.a {
    public static final Parcelable.Creator<b0> CREATOR = new c(25);
    public final int f2972a;
    public final String f2973b;

    public b0(int i7, String str) {
        this.f2972a = i7;
        this.f2973b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f2972a);
        yb.l(parcel, 3, this.f2973b);
        yb.s(parcel, r10);
    }
}
