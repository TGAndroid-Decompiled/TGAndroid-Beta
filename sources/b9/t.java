package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class t extends r6.a {
    public static final Parcelable.Creator<t> CREATOR = new c(17);
    public final int f3059a;
    public final String f3060b;

    public t(int i7, String str) {
        this.f3059a = i7;
        this.f3060b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f3059a);
        yb.l(parcel, 3, this.f3060b);
        yb.s(parcel, r10);
    }
}
