package n6;

import android.os.Parcel;
import android.os.Parcelable;
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new m8.h(14);
    public final int f16424a;
    public final int f16425b;
    public final int f16426c;
    public final long d;
    public final long f16427e;
    public final String f16428f;
    public final String h;
    public final int f16429n;
    public final int f16430r;

    public j(int i10, int i11, int i12, long j3, long j10, String str, String str2, int i13, int i14) {
        this.f16424a = i10;
        this.f16425b = i11;
        this.f16426c = i12;
        this.d = j3;
        this.f16427e = j10;
        this.f16428f = str;
        this.h = str2;
        this.f16429n = i13;
        this.f16430r = i14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.s(parcel, 1, 4);
        parcel.writeInt(this.f16424a);
        w7.c0.s(parcel, 2, 4);
        parcel.writeInt(this.f16425b);
        w7.c0.s(parcel, 3, 4);
        parcel.writeInt(this.f16426c);
        w7.c0.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        w7.c0.s(parcel, 5, 8);
        parcel.writeLong(this.f16427e);
        w7.c0.l(parcel, 6, this.f16428f);
        w7.c0.l(parcel, 7, this.h);
        w7.c0.s(parcel, 8, 4);
        parcel.writeInt(this.f16429n);
        w7.c0.s(parcel, 9, 4);
        parcel.writeInt(this.f16430r);
        w7.c0.r(parcel, q6);
    }
}
