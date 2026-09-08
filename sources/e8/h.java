package e8;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import w7.e0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new e6.i(7);
    public String[] f8939a;
    public int[] f8940b;
    public RemoteViews f8941c;
    public byte[] d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.m(parcel, 1, this.f8939a);
        e0.g(parcel, 2, this.f8940b);
        e0.k(parcel, 3, this.f8941c, i10);
        e0.c(parcel, 4, this.d);
        e0.r(parcel, q6);
    }
}
