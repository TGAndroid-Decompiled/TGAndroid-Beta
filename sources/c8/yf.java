package c8;

import android.os.Parcel;
import android.os.Parcelable;
public final class yf extends r6.a {
    public static final Parcelable.Creator<yf> CREATOR = new ag(0);
    public final int f5982a;
    public final int f5983b;
    public final int f5984c;
    public final int d;
    public final long f5985e;

    public yf(int i7, int i10, int i11, long j3, int i12) {
        this.f5982a = i7;
        this.f5983b = i10;
        this.f5984c = i11;
        this.d = i12;
        this.f5985e = j3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.f5982a);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f5983b);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.f5984c);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        xb.q(parcel, 5, 8);
        parcel.writeLong(this.f5985e);
        xb.s(parcel, r10);
    }
}
