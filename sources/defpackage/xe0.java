package defpackage;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
public final class xe0 extends b4 {
    public static final Parcelable.Creator<xe0> CREATOR = new j9d((byte) 14);
    public pe0 E;
    public byte[] F;
    public boolean G;
    public int a;
    public String b;
    public String c;
    public int d;
    public Point[] e;
    public qe0 f;
    public te0 h;
    public ue0 n;
    public we0 r;
    public ve0 s;
    public re0 w;
    public ne0 x;
    public oe0 y;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        int i2 = this.a;
        jte.q(parcel, 2, 4);
        parcel.writeInt(i2);
        jte.l(parcel, 3, this.b);
        jte.l(parcel, 4, this.c);
        int i3 = this.d;
        jte.q(parcel, 5, 4);
        parcel.writeInt(i3);
        jte.o(parcel, 6, this.e, i);
        jte.k(parcel, 7, this.f, i);
        jte.k(parcel, 8, this.h, i);
        jte.k(parcel, 9, this.n, i);
        jte.k(parcel, 10, this.r, i);
        jte.k(parcel, 11, this.s, i);
        jte.k(parcel, 12, this.w, i);
        jte.k(parcel, 13, this.x, i);
        jte.k(parcel, 14, this.y, i);
        jte.k(parcel, 15, this.E, i);
        jte.c(parcel, 16, this.F);
        boolean z = this.G;
        jte.q(parcel, 17, 4);
        parcel.writeInt(z ? 1 : 0);
        jte.s(parcel, r);
    }
}
