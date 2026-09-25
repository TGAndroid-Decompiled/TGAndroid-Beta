package n6;

import android.os.Parcel;
import android.os.Parcelable;
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new m8.h(14);
    public final int f15279a;
    public final int f15280b;
    public final int f15281c;
    public final long d;
    public final long e;
    public final String f15282f;
    public final String h;
    public final int f15283n;
    public final int f15284r;

    public j(int i10, int i11, int i12, long j3, long j10, String str, String str2, int i13, int i14) {
        this.f15279a = i10;
        this.f15280b = i11;
        this.f15281c = i12;
        this.d = j3;
        this.e = j10;
        this.f15282f = str;
        this.h = str2;
        this.f15283n = i13;
        this.f15284r = i14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 1, 4);
        parcel.writeInt(this.f15279a);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f15280b);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.f15281c);
        w7.f0.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        w7.f0.s(parcel, 5, 8);
        parcel.writeLong(this.e);
        w7.f0.l(parcel, 6, this.f15282f);
        w7.f0.l(parcel, 7, this.h);
        w7.f0.s(parcel, 8, 4);
        parcel.writeInt(this.f15283n);
        w7.f0.s(parcel, 9, 4);
        parcel.writeInt(this.f15284r);
        w7.f0.r(parcel, q6);
    }
}
