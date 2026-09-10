package n6;

import android.os.Parcel;
import android.os.Parcelable;
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new m8.h(14);
    public final int f13881a;
    public final int f13882b;
    public final int f13883c;
    public final long d;
    public final long e;
    public final String f13884f;
    public final String h;
    public final int f13885n;
    public final int f13886r;

    public j(int i10, int i11, int i12, long j3, long j10, String str, String str2, int i13, int i14) {
        this.f13881a = i10;
        this.f13882b = i11;
        this.f13883c = i12;
        this.d = j3;
        this.e = j10;
        this.f13884f = str;
        this.h = str2;
        this.f13885n = i13;
        this.f13886r = i14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 1, 4);
        parcel.writeInt(this.f13881a);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f13882b);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.f13883c);
        w7.e0.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        w7.e0.s(parcel, 5, 8);
        parcel.writeLong(this.e);
        w7.e0.l(parcel, 6, this.f13884f);
        w7.e0.l(parcel, 7, this.h);
        w7.e0.s(parcel, 8, 4);
        parcel.writeInt(this.f13885n);
        w7.e0.s(parcel, 9, 4);
        parcel.writeInt(this.f13886r);
        w7.e0.r(parcel, q6);
    }
}
