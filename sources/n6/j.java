package n6;

import android.os.Parcel;
import android.os.Parcelable;
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new m8.h(14);
    public final int f16584a;
    public final int f16585b;
    public final int f16586c;
    public final long d;
    public final long f16587e;
    public final String f16588f;
    public final String h;
    public final int f16589n;
    public final int f16590r;

    public j(int i10, int i11, int i12, long j3, long j10, String str, String str2, int i13, int i14) {
        this.f16584a = i10;
        this.f16585b = i11;
        this.f16586c = i12;
        this.d = j3;
        this.f16587e = j10;
        this.f16588f = str;
        this.h = str2;
        this.f16589n = i13;
        this.f16590r = i14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 1, 4);
        parcel.writeInt(this.f16584a);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f16585b);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.f16586c);
        w7.e0.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        w7.e0.s(parcel, 5, 8);
        parcel.writeLong(this.f16587e);
        w7.e0.l(parcel, 6, this.f16588f);
        w7.e0.l(parcel, 7, this.h);
        w7.e0.s(parcel, 8, 4);
        parcel.writeInt(this.f16589n);
        w7.e0.s(parcel, 9, 4);
        parcel.writeInt(this.f16590r);
        w7.e0.r(parcel, q6);
    }
}
