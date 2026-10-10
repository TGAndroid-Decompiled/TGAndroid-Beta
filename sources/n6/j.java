package n6;

import android.os.Parcel;
import android.os.Parcelable;
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new m8.h(14);
    public final int f16678a;
    public final int f16679b;
    public final int f16680c;
    public final long d;
    public final long f16681e;
    public final String f16682f;
    public final String h;
    public final int f16683n;
    public final int f16684r;

    public j(int i10, int i11, int i12, long j3, long j10, String str, String str2, int i13, int i14) {
        this.f16678a = i10;
        this.f16679b = i11;
        this.f16680c = i12;
        this.d = j3;
        this.f16681e = j10;
        this.f16682f = str;
        this.h = str2;
        this.f16683n = i13;
        this.f16684r = i14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 1, 4);
        parcel.writeInt(this.f16678a);
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(this.f16679b);
        w7.d0.s(parcel, 3, 4);
        parcel.writeInt(this.f16680c);
        w7.d0.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        w7.d0.s(parcel, 5, 8);
        parcel.writeLong(this.f16681e);
        w7.d0.l(parcel, 6, this.f16682f);
        w7.d0.l(parcel, 7, this.h);
        w7.d0.s(parcel, 8, 4);
        parcel.writeInt(this.f16683n);
        w7.d0.s(parcel, 9, 4);
        parcel.writeInt(this.f16684r);
        w7.d0.r(parcel, q6);
    }
}
