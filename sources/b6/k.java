package b6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class k extends c6.a {
    public static final Parcelable.Creator<k> CREATOR = new w.a(21);
    public final int f1742a;
    public final int f1743b;
    public final int f1744c;
    public final long d;
    public final long f1745e;
    public final String f1746f;
    public final String h;
    public final int f1747n;
    public final int f1748r;

    public k(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f1742a = i10;
        this.f1743b = i11;
        this.f1744c = i12;
        this.d = j10;
        this.f1745e = j11;
        this.f1746f = str;
        this.h = str2;
        this.f1747n = i13;
        this.f1748r = i14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 4);
        parcel.writeInt(this.f1742a);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f1743b);
        g5.s(parcel, 3, 4);
        parcel.writeInt(this.f1744c);
        g5.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        g5.s(parcel, 5, 8);
        parcel.writeLong(this.f1745e);
        g5.l(parcel, 6, this.f1746f);
        g5.l(parcel, 7, this.h);
        g5.s(parcel, 8, 4);
        parcel.writeInt(this.f1747n);
        g5.s(parcel, 9, 4);
        parcel.writeInt(this.f1748r);
        g5.r(parcel, q10);
    }
}
