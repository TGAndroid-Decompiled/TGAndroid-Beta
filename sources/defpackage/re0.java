package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class re0 extends b4 {
    public static final Parcelable.Creator<re0> CREATOR = new rhe((byte) 9);
    public double a;
    public double b;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        double d = this.a;
        jte.q(parcel, 2, 8);
        parcel.writeDouble(d);
        double d2 = this.b;
        jte.q(parcel, 3, 8);
        parcel.writeDouble(d2);
        jte.s(parcel, r);
    }
}
