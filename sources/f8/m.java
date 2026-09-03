package f8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class m extends c6.a {
    public static final Parcelable.Creator<m> CREATOR = new b9.e(21);
    public byte[] B;
    public boolean C;
    public int f6080a;
    public String f6081b;
    public String f6082c;
    public int d;
    public Point[] e;
    public f f6083f;
    public i h;
    public j f6084n;
    public l f6085r;
    public k f6086s;
    public g v;
    public c f6087w;
    public d f6088x;
    public e f6089y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        int i11 = this.f6080a;
        f5.s(parcel, 2, 4);
        parcel.writeInt(i11);
        f5.l(parcel, 3, this.f6081b);
        f5.l(parcel, 4, this.f6082c);
        int i12 = this.d;
        f5.s(parcel, 5, 4);
        parcel.writeInt(i12);
        f5.o(parcel, 6, this.e, i10);
        f5.k(parcel, 7, this.f6083f, i10);
        f5.k(parcel, 8, this.h, i10);
        f5.k(parcel, 9, this.f6084n, i10);
        f5.k(parcel, 10, this.f6085r, i10);
        f5.k(parcel, 11, this.f6086s, i10);
        f5.k(parcel, 12, this.v, i10);
        f5.k(parcel, 13, this.f6087w, i10);
        f5.k(parcel, 14, this.f6088x, i10);
        f5.k(parcel, 15, this.f6089y, i10);
        f5.c(parcel, 16, this.B);
        boolean z4 = this.C;
        f5.s(parcel, 17, 4);
        parcel.writeInt(z4 ? 1 : 0);
        f5.r(parcel, q10);
    }
}
