package n6;

import android.os.Parcel;
import android.os.Parcelable;
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new m8.h(12);
    public final int f17196a;
    public final int f17197b;
    public final int f17198c;
    public final long d;
    public final long e;
    public final String f17199f;
    public final String h;
    public final int f17200n;
    public final int f17201r;

    public j(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f17196a = i10;
        this.f17197b = i11;
        this.f17198c = i12;
        this.d = j10;
        this.e = j11;
        this.f17199f = str;
        this.h = str2;
        this.f17200n = i13;
        this.f17201r = i14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 1, 4);
        parcel.writeInt(this.f17196a);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f17197b);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f17198c);
        w7.f0.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        w7.f0.s(parcel, 5, 8);
        parcel.writeLong(this.e);
        w7.f0.l(parcel, 6, this.f17199f);
        w7.f0.l(parcel, 7, this.h);
        w7.f0.s(parcel, 8, 4);
        parcel.writeInt(this.f17200n);
        w7.f0.s(parcel, 9, 4);
        parcel.writeInt(this.f17201r);
        w7.f0.r(parcel, q6);
    }
}
