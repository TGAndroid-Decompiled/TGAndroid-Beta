package c8;

import android.os.Parcel;
import android.os.Parcelable;
public final class yf extends r6.a {
    public static final Parcelable.Creator<yf> CREATOR = new ag(0);
    public final int f5089a;
    public final int f5090b;
    public final int f5091c;
    public final int d;
    public final long f5092e;

    public yf(int i7, int i10, int i11, long j3, int i12) {
        this.f5089a = i7;
        this.f5090b = i10;
        this.f5091c = i11;
        this.d = i12;
        this.f5092e = j3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.f5089a);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f5090b);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f5091c);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        bc.q(parcel, 5, 8);
        parcel.writeLong(this.f5092e);
        bc.s(parcel, r10);
    }
}
