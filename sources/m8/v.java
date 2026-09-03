package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class v extends c6.a {
    public static final Parcelable.Creator<v> CREATOR = new c(17);
    public final int f13850a;
    public final String f13851b;

    public v(int i10, String str) {
        this.f13850a = i10;
        this.f13851b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f13850a);
        f5.l(parcel, 3, this.f13851b);
        f5.r(parcel, q10);
    }
}
