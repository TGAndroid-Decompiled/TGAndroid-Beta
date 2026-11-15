package c8;

import android.os.Parcel;
import android.os.Parcelable;
public final class yf extends r6.a {
    public static final Parcelable.Creator<yf> CREATOR = new ag(0);
    public final int f4804a;
    public final int f4805b;
    public final int f4806c;
    public final int d;
    public final long f4807e;

    public yf(int i7, int i10, int i11, long j3, int i12) {
        this.f4804a = i7;
        this.f4805b = i10;
        this.f4806c = i11;
        this.d = i12;
        this.f4807e = j3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 4);
        parcel.writeInt(this.f4804a);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f4805b);
        yb.q(parcel, 3, 4);
        parcel.writeInt(this.f4806c);
        yb.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        yb.q(parcel, 5, 8);
        parcel.writeLong(this.f4807e);
        yb.s(parcel, r10);
    }
}
