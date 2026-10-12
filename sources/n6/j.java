package n6;

import android.os.Parcel;
import android.os.Parcelable;
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new m8.h(12);
    public final int f16107a;
    public final int f16108b;
    public final int f16109c;
    public final long d;
    public final long e;
    public final String f16110f;
    public final String h;
    public final int f16111n;
    public final int f16112r;

    public j(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f16107a = i10;
        this.f16108b = i11;
        this.f16109c = i12;
        this.d = j10;
        this.e = j11;
        this.f16110f = str;
        this.h = str2;
        this.f16111n = i13;
        this.f16112r = i14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 1, 4);
        parcel.writeInt(this.f16107a);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f16108b);
        w7.g0.s(parcel, 3, 4);
        parcel.writeInt(this.f16109c);
        w7.g0.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        w7.g0.s(parcel, 5, 8);
        parcel.writeLong(this.e);
        w7.g0.l(parcel, 6, this.f16110f);
        w7.g0.l(parcel, 7, this.h);
        w7.g0.s(parcel, 8, 4);
        parcel.writeInt(this.f16111n);
        w7.g0.s(parcel, 9, 4);
        parcel.writeInt(this.f16112r);
        w7.g0.r(parcel, q6);
    }
}
