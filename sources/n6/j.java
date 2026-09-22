package n6;

import android.os.Parcel;
import android.os.Parcelable;
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new m8.h(14);
    public final int f15049a;
    public final int f15050b;
    public final int f15051c;
    public final long d;
    public final long e;
    public final String f15052f;
    public final String h;
    public final int f15053n;
    public final int f15054r;

    public j(int i10, int i11, int i12, long j3, long j10, String str, String str2, int i13, int i14) {
        this.f15049a = i10;
        this.f15050b = i11;
        this.f15051c = i12;
        this.d = j3;
        this.e = j10;
        this.f15052f = str;
        this.h = str2;
        this.f15053n = i13;
        this.f15054r = i14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 1, 4);
        parcel.writeInt(this.f15049a);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f15050b);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.f15051c);
        w7.e0.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        w7.e0.s(parcel, 5, 8);
        parcel.writeLong(this.e);
        w7.e0.l(parcel, 6, this.f15052f);
        w7.e0.l(parcel, 7, this.h);
        w7.e0.s(parcel, 8, 4);
        parcel.writeInt(this.f15053n);
        w7.e0.s(parcel, 9, 4);
        parcel.writeInt(this.f15054r);
        w7.e0.r(parcel, q6);
    }
}
