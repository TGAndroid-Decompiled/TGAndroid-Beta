package c8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class g extends z5.a {
    public static final Parcelable.Creator<g> CREATOR = new o(6);

    public double f2533a;

    public double f2534b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        double d = this.f2533a;
        r8.s(parcel, 2, 8);
        parcel.writeDouble(d);
        double d10 = this.f2534b;
        r8.s(parcel, 3, 8);
        parcel.writeDouble(d10);
        r8.r(parcel, iQ);
    }
}
