package n6;

import android.os.Parcel;
import android.os.Parcelable;
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new m8.h(14);
    public final int f16557a;
    public final int f16558b;
    public final int f16559c;
    public final long d;
    public final long f16560e;
    public final String f16561f;
    public final String h;
    public final int f16562n;
    public final int f16563r;

    public j(int i10, int i11, int i12, long j3, long j10, String str, String str2, int i13, int i14) {
        this.f16557a = i10;
        this.f16558b = i11;
        this.f16559c = i12;
        this.d = j3;
        this.f16560e = j10;
        this.f16561f = str;
        this.h = str2;
        this.f16562n = i13;
        this.f16563r = i14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 1, 4);
        parcel.writeInt(this.f16557a);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f16558b);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.f16559c);
        w7.e0.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        w7.e0.s(parcel, 5, 8);
        parcel.writeLong(this.f16560e);
        w7.e0.l(parcel, 6, this.f16561f);
        w7.e0.l(parcel, 7, this.h);
        w7.e0.s(parcel, 8, 4);
        parcel.writeInt(this.f16562n);
        w7.e0.s(parcel, 9, 4);
        parcel.writeInt(this.f16563r);
        w7.e0.r(parcel, q6);
    }
}
