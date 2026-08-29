package d8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
public final class m extends a6.a {
    public static final Parcelable.Creator<m> CREATOR = new d6.d(2);
    public byte[] A;
    public boolean B;
    public int f5517a;
    public String f5518b;
    public String f5519c;
    public int d;
    public Point[] f5520e;
    public f f5521f;
    public i h;
    public j f5522n;
    public l f5523r;
    public k f5524s;
    public g v;
    public c f5525w;
    public d f5526x;
    public e f5527y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        int i11 = this.f5517a;
        o.s(parcel, 2, 4);
        parcel.writeInt(i11);
        o.l(parcel, 3, this.f5518b);
        o.l(parcel, 4, this.f5519c);
        int i12 = this.d;
        o.s(parcel, 5, 4);
        parcel.writeInt(i12);
        o.o(parcel, 6, this.f5520e, i10);
        o.k(parcel, 7, this.f5521f, i10);
        o.k(parcel, 8, this.h, i10);
        o.k(parcel, 9, this.f5522n, i10);
        o.k(parcel, 10, this.f5523r, i10);
        o.k(parcel, 11, this.f5524s, i10);
        o.k(parcel, 12, this.v, i10);
        o.k(parcel, 13, this.f5525w, i10);
        o.k(parcel, 14, this.f5526x, i10);
        o.k(parcel, 15, this.f5527y, i10);
        o.c(parcel, 16, this.A);
        boolean z10 = this.B;
        o.s(parcel, 17, 4);
        parcel.writeInt(z10 ? 1 : 0);
        o.r(parcel, q6);
    }
}
