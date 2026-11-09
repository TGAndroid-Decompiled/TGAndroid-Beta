package c8;

import android.os.Parcel;
import android.os.Parcelable;
public final class yf extends r6.a {
    public static final Parcelable.Creator<yf> CREATOR = new ag(0);
    public final int f5977a;
    public final int f5978b;
    public final int f5979c;
    public final int d;
    public final long f5980e;

    public yf(int i7, int i10, int i11, long j3, int i12) {
        this.f5977a = i7;
        this.f5978b = i10;
        this.f5979c = i11;
        this.d = i12;
        this.f5980e = j3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.f5977a);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f5978b);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.f5979c);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        xb.q(parcel, 5, 8);
        parcel.writeLong(this.f5980e);
        xb.s(parcel, r10);
    }
}
