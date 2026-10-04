package n6;

import android.os.Parcel;
import android.os.Parcelable;
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new m8.h(14);
    public final int f16700a;
    public final int f16701b;
    public final int f16702c;
    public final long d;
    public final long f16703e;
    public final String f16704f;
    public final String h;
    public final int f16705n;
    public final int f16706r;

    public j(int i10, int i11, int i12, long j3, long j10, String str, String str2, int i13, int i14) {
        this.f16700a = i10;
        this.f16701b = i11;
        this.f16702c = i12;
        this.d = j3;
        this.f16703e = j10;
        this.f16704f = str;
        this.h = str2;
        this.f16705n = i13;
        this.f16706r = i14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 1, 4);
        parcel.writeInt(this.f16700a);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f16701b);
        w7.g0.s(parcel, 3, 4);
        parcel.writeInt(this.f16702c);
        w7.g0.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        w7.g0.s(parcel, 5, 8);
        parcel.writeLong(this.f16703e);
        w7.g0.l(parcel, 6, this.f16704f);
        w7.g0.l(parcel, 7, this.h);
        w7.g0.s(parcel, 8, 4);
        parcel.writeInt(this.f16705n);
        w7.g0.s(parcel, 9, 4);
        parcel.writeInt(this.f16706r);
        w7.g0.r(parcel, q6);
    }
}
