package b8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class m extends y5.a {
    public static final Parcelable.Creator<m> CREATOR = new w.a(18);
    public byte[] A;
    public boolean B;
    public int f1643a;
    public String f1644b;
    public String f1645c;
    public int d;
    public Point[] f1646e;
    public f f1647f;
    public i h;
    public j f1648n;
    public l f1649r;
    public k f1650s;
    public g v;
    public c f1651w;
    public d f1652x;
    public e f1653y;

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        int i10 = this.f1643a;
        p8.s(parcel, 2, 4);
        parcel.writeInt(i10);
        p8.l(parcel, 3, this.f1644b);
        p8.l(parcel, 4, this.f1645c);
        int i11 = this.d;
        p8.s(parcel, 5, 4);
        parcel.writeInt(i11);
        p8.o(parcel, 6, this.f1646e, i9);
        p8.k(parcel, 7, this.f1647f, i9);
        p8.k(parcel, 8, this.h, i9);
        p8.k(parcel, 9, this.f1648n, i9);
        p8.k(parcel, 10, this.f1649r, i9);
        p8.k(parcel, 11, this.f1650s, i9);
        p8.k(parcel, 12, this.v, i9);
        p8.k(parcel, 13, this.f1651w, i9);
        p8.k(parcel, 14, this.f1652x, i9);
        p8.k(parcel, 15, this.f1653y, i9);
        p8.c(parcel, 16, this.A);
        boolean z10 = this.B;
        p8.s(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        p8.r(parcel, q10);
    }
}
