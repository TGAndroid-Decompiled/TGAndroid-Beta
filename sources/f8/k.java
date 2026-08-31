package f8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class k extends c6.a {
    public static final Parcelable.Creator<k> CREATOR = new o(2);
    public String f6204a;
    public String f6205b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.f6204a);
        g5.l(parcel, 3, this.f6205b);
        g5.r(parcel, q10);
    }
}
