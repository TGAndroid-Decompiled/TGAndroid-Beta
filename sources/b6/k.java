package b6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class k extends c6.a {
    public static final Parcelable.Creator<k> CREATOR = new w.a(21);
    public final int f1611a;
    public final int f1612b;
    public final int f1613c;
    public final long d;
    public final long e;
    public final String f1614f;
    public final String h;
    public final int f1615n;
    public final int f1616r;

    public k(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f1611a = i10;
        this.f1612b = i11;
        this.f1613c = i12;
        this.d = j10;
        this.e = j11;
        this.f1614f = str;
        this.h = str2;
        this.f1615n = i13;
        this.f1616r = i14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.f1611a);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f1612b);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.f1613c);
        f5.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        f5.s(parcel, 5, 8);
        parcel.writeLong(this.e);
        f5.l(parcel, 6, this.f1614f);
        f5.l(parcel, 7, this.h);
        f5.s(parcel, 8, 4);
        parcel.writeInt(this.f1615n);
        f5.s(parcel, 9, 4);
        parcel.writeInt(this.f1616r);
        f5.r(parcel, q10);
    }
}
