package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class di6 extends b4 {
    public static final Parcelable.Creator<di6> CREATOR = new sje((byte) 3);
    public int a;
    public String b;
    public double c;
    public String d;
    public long e;
    public int f;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        int i2 = this.a;
        mve.q(parcel, 2, 4);
        parcel.writeInt(i2);
        mve.l(parcel, 3, this.b);
        double d = this.c;
        mve.q(parcel, 4, 8);
        parcel.writeDouble(d);
        mve.l(parcel, 5, this.d);
        long j = this.e;
        mve.q(parcel, 6, 8);
        parcel.writeLong(j);
        int i3 = this.f;
        mve.q(parcel, 7, 4);
        parcel.writeInt(i3);
        mve.s(parcel, r);
    }
}
