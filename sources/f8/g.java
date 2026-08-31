package f8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class g extends c6.a {
    public static final Parcelable.Creator<g> CREATOR = new b9.e(28);
    public double f6193a;
    public double f6194b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        double d = this.f6193a;
        g5.s(parcel, 2, 8);
        parcel.writeDouble(d);
        double d10 = this.f6194b;
        g5.s(parcel, 3, 8);
        parcel.writeDouble(d10);
        g5.r(parcel, q10);
    }
}
