package h8;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import c8.xb;
import f7.t0;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new t0(25);
    public String[] f14283a;
    public int[] f14284b;
    public RemoteViews f14285c;
    public byte[] d;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.m(parcel, 1, this.f14283a);
        xb.g(parcel, 2, this.f14284b);
        xb.k(parcel, 3, this.f14285c, i7);
        xb.c(parcel, 4, this.d);
        xb.s(parcel, r10);
    }
}
