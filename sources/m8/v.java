package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class v extends c6.a {
    public static final Parcelable.Creator<v> CREATOR = new c(17);
    public final int f13582a;
    public final String f13583b;

    public v(int i10, String str) {
        this.f13582a = i10;
        this.f13583b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f13582a);
        g5.l(parcel, 3, this.f13583b);
        g5.r(parcel, q10);
    }
}
