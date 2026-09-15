package n6;

import android.os.Parcel;
import android.os.Parcelable;
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new m8.h(14);
    public final int f15051a;
    public final int f15052b;
    public final int f15053c;
    public final long d;
    public final long e;
    public final String f15054f;
    public final String h;
    public final int f15055n;
    public final int f15056r;

    public j(int i10, int i11, int i12, long j3, long j10, String str, String str2, int i13, int i14) {
        this.f15051a = i10;
        this.f15052b = i11;
        this.f15053c = i12;
        this.d = j3;
        this.e = j10;
        this.f15054f = str;
        this.h = str2;
        this.f15055n = i13;
        this.f15056r = i14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 1, 4);
        parcel.writeInt(this.f15051a);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f15052b);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.f15053c);
        w7.e0.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        w7.e0.s(parcel, 5, 8);
        parcel.writeLong(this.e);
        w7.e0.l(parcel, 6, this.f15054f);
        w7.e0.l(parcel, 7, this.h);
        w7.e0.s(parcel, 8, 4);
        parcel.writeInt(this.f15055n);
        w7.e0.s(parcel, 9, 4);
        parcel.writeInt(this.f15056r);
        w7.e0.r(parcel, q6);
    }
}
