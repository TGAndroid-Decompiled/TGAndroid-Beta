package c8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class m extends z5.a {
    public static final Parcelable.Creator<m> CREATOR = new w.a(29);
    public byte[] A;
    public boolean B;

    public int f2549a;

    public String f2550b;

    public String f2551c;
    public int d;

    public Point[] f2552e;

    public f f2553f;
    public i h;

    public j f2554n;

    public l f2555r;

    public k f2556s;
    public g v;

    public c f2557w;

    public d f2558x;

    public e f2559y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        int i11 = this.f2549a;
        r8.s(parcel, 2, 4);
        parcel.writeInt(i11);
        r8.l(parcel, 3, this.f2550b);
        r8.l(parcel, 4, this.f2551c);
        int i12 = this.d;
        r8.s(parcel, 5, 4);
        parcel.writeInt(i12);
        r8.o(parcel, 6, this.f2552e, i10);
        r8.k(parcel, 7, this.f2553f, i10);
        r8.k(parcel, 8, this.h, i10);
        r8.k(parcel, 9, this.f2554n, i10);
        r8.k(parcel, 10, this.f2555r, i10);
        r8.k(parcel, 11, this.f2556s, i10);
        r8.k(parcel, 12, this.v, i10);
        r8.k(parcel, 13, this.f2557w, i10);
        r8.k(parcel, 14, this.f2558x, i10);
        r8.k(parcel, 15, this.f2559y, i10);
        r8.c(parcel, 16, this.A);
        boolean z10 = this.B;
        r8.s(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        r8.r(parcel, iQ);
    }
}
