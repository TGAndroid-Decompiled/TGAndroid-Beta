package f8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class j extends c6.a {
    public static final Parcelable.Creator<j> CREATOR = new b9.e(29);
    public String f6202a;
    public String f6203b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.f6202a);
        g5.l(parcel, 3, this.f6203b);
        g5.r(parcel, q10);
    }
}
