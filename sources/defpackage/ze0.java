package defpackage;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
public final class ze0 extends c4 {
    public static final Parcelable.Creator<ze0> CREATOR = new ced((byte) 14);
    public re0 E;
    public byte[] F;
    public boolean G;
    public int a;
    public String b;
    public String c;
    public int d;
    public Point[] e;
    public se0 f;
    public ve0 h;
    public we0 n;
    public ye0 r;
    public xe0 s;
    public te0 w;
    public pe0 x;
    public qe0 y;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        int i2 = this.a;
        bye.q(parcel, 2, 4);
        parcel.writeInt(i2);
        bye.l(parcel, 3, this.b);
        bye.l(parcel, 4, this.c);
        int i3 = this.d;
        bye.q(parcel, 5, 4);
        parcel.writeInt(i3);
        bye.o(parcel, 6, this.e, i);
        bye.k(parcel, 7, this.f, i);
        bye.k(parcel, 8, this.h, i);
        bye.k(parcel, 9, this.n, i);
        bye.k(parcel, 10, this.r, i);
        bye.k(parcel, 11, this.s, i);
        bye.k(parcel, 12, this.w, i);
        bye.k(parcel, 13, this.x, i);
        bye.k(parcel, 14, this.y, i);
        bye.k(parcel, 15, this.E, i);
        bye.c(parcel, 16, this.F);
        boolean z = this.G;
        bye.q(parcel, 17, 4);
        parcel.writeInt(z ? 1 : 0);
        bye.s(parcel, r);
    }
}
