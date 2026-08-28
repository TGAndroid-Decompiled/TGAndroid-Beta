package b8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class j extends y5.a {
    public static final Parcelable.Creator<j> CREATOR = new w.a(26);
    public String f1636a;
    public String f1637b;

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.f1636a);
        p8.l(parcel, 3, this.f1637b);
        p8.r(parcel, q10);
    }
}
