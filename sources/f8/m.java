package f8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class m extends c6.a {
    public static final Parcelable.Creator<m> CREATOR = new b9.e(21);
    public byte[] B;
    public boolean C;
    public int f6091a;
    public String f6092b;
    public String f6093c;
    public int d;
    public Point[] e;
    public f f6094f;
    public i h;
    public j f6095n;
    public l f6096r;
    public k f6097s;
    public g v;
    public c f6098w;
    public d f6099x;
    public e f6100y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        int i11 = this.f6091a;
        f5.s(parcel, 2, 4);
        parcel.writeInt(i11);
        f5.l(parcel, 3, this.f6092b);
        f5.l(parcel, 4, this.f6093c);
        int i12 = this.d;
        f5.s(parcel, 5, 4);
        parcel.writeInt(i12);
        f5.o(parcel, 6, this.e, i10);
        f5.k(parcel, 7, this.f6094f, i10);
        f5.k(parcel, 8, this.h, i10);
        f5.k(parcel, 9, this.f6095n, i10);
        f5.k(parcel, 10, this.f6096r, i10);
        f5.k(parcel, 11, this.f6097s, i10);
        f5.k(parcel, 12, this.v, i10);
        f5.k(parcel, 13, this.f6098w, i10);
        f5.k(parcel, 14, this.f6099x, i10);
        f5.k(parcel, 15, this.f6100y, i10);
        f5.c(parcel, 16, this.B);
        boolean z4 = this.C;
        f5.s(parcel, 17, 4);
        parcel.writeInt(z4 ? 1 : 0);
        f5.r(parcel, q10);
    }
}
