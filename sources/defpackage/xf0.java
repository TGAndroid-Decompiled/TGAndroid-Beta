package defpackage;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
public final class xf0 extends b4 {
    public static final Parcelable.Creator<xf0> CREATOR = new lbd((byte) 14);
    public pf0 E;
    public byte[] F;
    public boolean G;
    public int a;
    public String b;
    public String c;
    public int d;
    public Point[] e;
    public qf0 f;
    public tf0 h;
    public uf0 n;
    public wf0 r;
    public vf0 s;
    public rf0 w;
    public nf0 x;
    public of0 y;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        int i2 = this.a;
        mve.q(parcel, 2, 4);
        parcel.writeInt(i2);
        mve.l(parcel, 3, this.b);
        mve.l(parcel, 4, this.c);
        int i3 = this.d;
        mve.q(parcel, 5, 4);
        parcel.writeInt(i3);
        mve.o(parcel, 6, this.e, i);
        mve.k(parcel, 7, this.f, i);
        mve.k(parcel, 8, this.h, i);
        mve.k(parcel, 9, this.n, i);
        mve.k(parcel, 10, this.r, i);
        mve.k(parcel, 11, this.s, i);
        mve.k(parcel, 12, this.w, i);
        mve.k(parcel, 13, this.x, i);
        mve.k(parcel, 14, this.y, i);
        mve.k(parcel, 15, this.E, i);
        mve.c(parcel, 16, this.F);
        boolean z = this.G;
        mve.q(parcel, 17, 4);
        parcel.writeInt(z ? 1 : 0);
        mve.s(parcel, r);
    }
}
