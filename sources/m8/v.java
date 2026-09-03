package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class v extends c6.a {
    public static final Parcelable.Creator<v> CREATOR = new c(17);
    public final int f13584a;
    public final String f13585b;

    public v(int i10, String str) {
        this.f13584a = i10;
        this.f13585b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f13584a);
        g5.l(parcel, 3, this.f13585b);
        g5.r(parcel, q10);
    }
}
