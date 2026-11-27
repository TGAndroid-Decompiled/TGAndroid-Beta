package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class hi6 extends c4 {
    public static final Parcelable.Creator<hi6> CREATOR = new ime((byte) 3);
    public int a;
    public String b;
    public double c;
    public String d;
    public long e;
    public int f;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        int i2 = this.a;
        bye.q(parcel, 2, 4);
        parcel.writeInt(i2);
        bye.l(parcel, 3, this.b);
        double d = this.c;
        bye.q(parcel, 4, 8);
        parcel.writeDouble(d);
        bye.l(parcel, 5, this.d);
        long j = this.e;
        bye.q(parcel, 6, 8);
        parcel.writeLong(j);
        int i3 = this.f;
        bye.q(parcel, 7, 4);
        parcel.writeInt(i3);
        bye.s(parcel, r);
    }
}
