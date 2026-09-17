package n6;

import android.os.Parcel;
import android.os.Parcelable;
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new m8.h(14);
    public final int f15061a;
    public final int f15062b;
    public final int f15063c;
    public final long d;
    public final long e;
    public final String f15064f;
    public final String h;
    public final int f15065n;
    public final int f15066r;

    public j(int i10, int i11, int i12, long j3, long j10, String str, String str2, int i13, int i14) {
        this.f15061a = i10;
        this.f15062b = i11;
        this.f15063c = i12;
        this.d = j3;
        this.e = j10;
        this.f15064f = str;
        this.h = str2;
        this.f15065n = i13;
        this.f15066r = i14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 1, 4);
        parcel.writeInt(this.f15061a);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f15062b);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.f15063c);
        w7.e0.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        w7.e0.s(parcel, 5, 8);
        parcel.writeLong(this.e);
        w7.e0.l(parcel, 6, this.f15064f);
        w7.e0.l(parcel, 7, this.h);
        w7.e0.s(parcel, 8, 4);
        parcel.writeInt(this.f15065n);
        w7.e0.s(parcel, 9, 4);
        parcel.writeInt(this.f15066r);
        w7.e0.r(parcel, q6);
    }
}
