package h8;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import c8.wb;
import f7.t0;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new t0(25);
    public String[] f14281a;
    public int[] f14282b;
    public RemoteViews f14283c;
    public byte[] d;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.m(parcel, 1, this.f14281a);
        wb.g(parcel, 2, this.f14282b);
        wb.k(parcel, 3, this.f14283c, i7);
        wb.c(parcel, 4, this.d);
        wb.s(parcel, r10);
    }
}
