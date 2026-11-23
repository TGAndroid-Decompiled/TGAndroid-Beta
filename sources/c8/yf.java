package c8;

import android.os.Parcel;
import android.os.Parcelable;
public final class yf extends r6.a {
    public static final Parcelable.Creator<yf> CREATOR = new ag(0);
    public final int f5080a;
    public final int f5081b;
    public final int f5082c;
    public final int d;
    public final long f5083e;

    public yf(int i7, int i10, int i11, long j3, int i12) {
        this.f5080a = i7;
        this.f5081b = i10;
        this.f5082c = i11;
        this.d = i12;
        this.f5083e = j3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.f5080a);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f5081b);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.f5082c);
        cc.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        cc.q(parcel, 5, 8);
        parcel.writeLong(this.f5083e);
        cc.s(parcel, r10);
    }
}
