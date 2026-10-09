package n6;

import android.os.Parcel;
import android.os.Parcelable;
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new m8.h(14);
    public final int f16674a;
    public final int f16675b;
    public final int f16676c;
    public final long d;
    public final long f16677e;
    public final String f16678f;
    public final String h;
    public final int f16679n;
    public final int f16680r;

    public j(int i10, int i11, int i12, long j3, long j10, String str, String str2, int i13, int i14) {
        this.f16674a = i10;
        this.f16675b = i11;
        this.f16676c = i12;
        this.d = j3;
        this.f16677e = j10;
        this.f16678f = str;
        this.h = str2;
        this.f16679n = i13;
        this.f16680r = i14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 1, 4);
        parcel.writeInt(this.f16674a);
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(this.f16675b);
        w7.d0.s(parcel, 3, 4);
        parcel.writeInt(this.f16676c);
        w7.d0.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        w7.d0.s(parcel, 5, 8);
        parcel.writeLong(this.f16677e);
        w7.d0.l(parcel, 6, this.f16678f);
        w7.d0.l(parcel, 7, this.h);
        w7.d0.s(parcel, 8, 4);
        parcel.writeInt(this.f16679n);
        w7.d0.s(parcel, 9, 4);
        parcel.writeInt(this.f16680r);
        w7.d0.r(parcel, q6);
    }
}
