package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class te0 extends c4 {
    public static final Parcelable.Creator<te0> CREATOR = new ime((byte) 9);
    public double a;
    public double b;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        double d = this.a;
        bye.q(parcel, 2, 8);
        parcel.writeDouble(d);
        double d2 = this.b;
        bye.q(parcel, 3, 8);
        parcel.writeDouble(d2);
        bye.s(parcel, r);
    }
}
