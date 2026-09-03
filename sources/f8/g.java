package f8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class g extends c6.a {
    public static final Parcelable.Creator<g> CREATOR = new b9.e(28);
    public double f6065a;
    public double f6066b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        double d = this.f6065a;
        f5.s(parcel, 2, 8);
        parcel.writeDouble(d);
        double d10 = this.f6066b;
        f5.s(parcel, 3, 8);
        parcel.writeDouble(d10);
        f5.r(parcel, q10);
    }
}
