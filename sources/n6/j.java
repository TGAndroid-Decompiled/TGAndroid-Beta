package n6;

import android.os.Parcel;
import android.os.Parcelable;
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new m8.h(14);
    public final int f16705a;
    public final int f16706b;
    public final int f16707c;
    public final long d;
    public final long f16708e;
    public final String f16709f;
    public final String h;
    public final int f16710n;
    public final int f16711r;

    public j(int i10, int i11, int i12, long j3, long j10, String str, String str2, int i13, int i14) {
        this.f16705a = i10;
        this.f16706b = i11;
        this.f16707c = i12;
        this.d = j3;
        this.f16708e = j10;
        this.f16709f = str;
        this.h = str2;
        this.f16710n = i13;
        this.f16711r = i14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 1, 4);
        parcel.writeInt(this.f16705a);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f16706b);
        w7.g0.s(parcel, 3, 4);
        parcel.writeInt(this.f16707c);
        w7.g0.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        w7.g0.s(parcel, 5, 8);
        parcel.writeLong(this.f16708e);
        w7.g0.l(parcel, 6, this.f16709f);
        w7.g0.l(parcel, 7, this.h);
        w7.g0.s(parcel, 8, 4);
        parcel.writeInt(this.f16710n);
        w7.g0.s(parcel, 9, 4);
        parcel.writeInt(this.f16711r);
        w7.g0.r(parcel, q6);
    }
}
