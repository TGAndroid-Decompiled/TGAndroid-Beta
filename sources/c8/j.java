package c8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class j extends z5.a {
    public static final Parcelable.Creator<j> CREATOR = new o(7);

    public String f2542a;

    public String f2543b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.f2542a);
        r8.l(parcel, 3, this.f2543b);
        r8.r(parcel, iQ);
    }
}
