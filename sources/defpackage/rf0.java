package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class rf0 extends b4 {
    public static final Parcelable.Creator<rf0> CREATOR = new sje((byte) 9);
    public double a;
    public double b;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        double d = this.a;
        mve.q(parcel, 2, 8);
        parcel.writeDouble(d);
        double d2 = this.b;
        mve.q(parcel, 3, 8);
        parcel.writeDouble(d2);
        mve.s(parcel, r);
    }
}
