package f8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class m extends c6.a {
    public static final Parcelable.Creator<m> CREATOR = new b9.e(21);
    public byte[] B;
    public boolean C;
    public int f6209a;
    public String f6210b;
    public String f6211c;
    public int d;
    public Point[] f6212e;
    public f f6213f;
    public i h;
    public j f6214n;
    public l f6215r;
    public k f6216s;
    public g v;
    public c f6217w;
    public d f6218x;
    public e f6219y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        int i11 = this.f6209a;
        g5.s(parcel, 2, 4);
        parcel.writeInt(i11);
        g5.l(parcel, 3, this.f6210b);
        g5.l(parcel, 4, this.f6211c);
        int i12 = this.d;
        g5.s(parcel, 5, 4);
        parcel.writeInt(i12);
        g5.o(parcel, 6, this.f6212e, i10);
        g5.k(parcel, 7, this.f6213f, i10);
        g5.k(parcel, 8, this.h, i10);
        g5.k(parcel, 9, this.f6214n, i10);
        g5.k(parcel, 10, this.f6215r, i10);
        g5.k(parcel, 11, this.f6216s, i10);
        g5.k(parcel, 12, this.v, i10);
        g5.k(parcel, 13, this.f6217w, i10);
        g5.k(parcel, 14, this.f6218x, i10);
        g5.k(parcel, 15, this.f6219y, i10);
        g5.c(parcel, 16, this.B);
        boolean z4 = this.C;
        g5.s(parcel, 17, 4);
        parcel.writeInt(z4 ? 1 : 0);
        g5.r(parcel, q10);
    }
}
