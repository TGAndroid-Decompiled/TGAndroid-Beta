package d8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
public final class g extends a6.a {
    public static final Parcelable.Creator<g> CREATOR = new d6.d(9);
    public double f5501a;
    public double f5502b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        double d = this.f5501a;
        o.s(parcel, 2, 8);
        parcel.writeDouble(d);
        double d10 = this.f5502b;
        o.s(parcel, 3, 8);
        parcel.writeDouble(d10);
        o.r(parcel, q6);
    }
}
