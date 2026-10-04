package e8;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import w7.g0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new e6.i(7);
    public String[] f8711a;
    public int[] f8712b;
    public RemoteViews f8713c;
    public byte[] d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.m(parcel, 1, this.f8711a);
        g0.g(parcel, 2, this.f8712b);
        g0.k(parcel, 3, this.f8713c, i10);
        g0.c(parcel, 4, this.d);
        g0.r(parcel, q6);
    }
}
