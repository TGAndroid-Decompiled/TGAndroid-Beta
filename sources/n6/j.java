package n6;

import android.os.Parcel;
import android.os.Parcelable;
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new m8.i(11);
    public final int f13603a;
    public final int f13604b;
    public final int f13605c;
    public final long d;
    public final long e;
    public final String f13606f;
    public final String h;
    public final int f13607n;
    public final int f13608r;

    public j(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f13603a = i10;
        this.f13604b = i11;
        this.f13605c = i12;
        this.d = j10;
        this.e = j11;
        this.f13606f = str;
        this.h = str2;
        this.f13607n = i13;
        this.f13608r = i14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 1, 4);
        parcel.writeInt(this.f13603a);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.f13604b);
        w7.h0.s(parcel, 3, 4);
        parcel.writeInt(this.f13605c);
        w7.h0.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        w7.h0.s(parcel, 5, 8);
        parcel.writeLong(this.e);
        w7.h0.l(parcel, 6, this.f13606f);
        w7.h0.l(parcel, 7, this.h);
        w7.h0.s(parcel, 8, 4);
        parcel.writeInt(this.f13607n);
        w7.h0.s(parcel, 9, 4);
        parcel.writeInt(this.f13608r);
        w7.h0.r(parcel, q6);
    }
}
