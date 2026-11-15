package h8;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import c8.yb;
import f7.t0;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new t0(25);
    public String[] f13643a;
    public int[] f13644b;
    public RemoteViews f13645c;
    public byte[] d;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.m(parcel, 1, this.f13643a);
        yb.g(parcel, 2, this.f13644b);
        yb.k(parcel, 3, this.f13645c, i7);
        yb.c(parcel, 4, this.d);
        yb.s(parcel, r10);
    }
}
