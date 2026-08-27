package h8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class d extends z5.a {
    public static final Parcelable.Creator<d> CREATOR = new h5.h(9);

    public int f8602a;

    public String f8603b;

    public double f8604c;
    public String d;

    public long f8605e;

    public int f8606f;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        int i11 = this.f8602a;
        r8.s(parcel, 2, 4);
        parcel.writeInt(i11);
        r8.l(parcel, 3, this.f8603b);
        double d = this.f8604c;
        r8.s(parcel, 4, 8);
        parcel.writeDouble(d);
        r8.l(parcel, 5, this.d);
        long j10 = this.f8605e;
        r8.s(parcel, 6, 8);
        parcel.writeLong(j10);
        int i12 = this.f8606f;
        r8.s(parcel, 7, 4);
        parcel.writeInt(i12);
        r8.r(parcel, iQ);
    }
}
