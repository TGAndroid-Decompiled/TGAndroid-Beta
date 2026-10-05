package n6;

import android.os.Parcel;
import android.os.Parcelable;
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new m8.h(14);
    public final int f16710a;
    public final int f16711b;
    public final int f16712c;
    public final long d;
    public final long f16713e;
    public final String f16714f;
    public final String h;
    public final int f16715n;
    public final int f16716r;

    public j(int i10, int i11, int i12, long j3, long j10, String str, String str2, int i13, int i14) {
        this.f16710a = i10;
        this.f16711b = i11;
        this.f16712c = i12;
        this.d = j3;
        this.f16713e = j10;
        this.f16714f = str;
        this.h = str2;
        this.f16715n = i13;
        this.f16716r = i14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 1, 4);
        parcel.writeInt(this.f16710a);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.f16711b);
        w7.g0.s(parcel, 3, 4);
        parcel.writeInt(this.f16712c);
        w7.g0.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        w7.g0.s(parcel, 5, 8);
        parcel.writeLong(this.f16713e);
        w7.g0.l(parcel, 6, this.f16714f);
        w7.g0.l(parcel, 7, this.h);
        w7.g0.s(parcel, 8, 4);
        parcel.writeInt(this.f16715n);
        w7.g0.s(parcel, 9, 4);
        parcel.writeInt(this.f16716r);
        w7.g0.r(parcel, q6);
    }
}
