package b8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class g extends y5.a {
    public static final Parcelable.Creator<g> CREATOR = new w.a(25);
    public double f1627a;
    public double f1628b;

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        double d = this.f1627a;
        p8.s(parcel, 2, 8);
        parcel.writeDouble(d);
        double d9 = this.f1628b;
        p8.s(parcel, 3, 8);
        parcel.writeDouble(d9);
        p8.r(parcel, q10);
    }
}
