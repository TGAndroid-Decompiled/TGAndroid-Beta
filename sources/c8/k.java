package c8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class k extends z5.a {
    public static final Parcelable.Creator<k> CREATOR = new o(10);

    public String f2544a;

    public String f2545b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.f2544a);
        r8.l(parcel, 3, this.f2545b);
        r8.r(parcel, iQ);
    }
}
