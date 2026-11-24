package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class qf0 extends b4 {
    public static final Parcelable.Creator<qf0> CREATOR = new t0e((byte) 9);
    public int a;
    public String b;
    public String c;
    public String d;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        int i2 = this.a;
        mve.q(parcel, 2, 4);
        parcel.writeInt(i2);
        mve.l(parcel, 3, this.b);
        mve.l(parcel, 4, this.c);
        mve.l(parcel, 5, this.d);
        mve.s(parcel, r);
    }
}
