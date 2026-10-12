package e8;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import w7.c0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new e6.i(7);
    public String[] f8703a;
    public int[] f8704b;
    public RemoteViews f8705c;
    public byte[] d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.m(parcel, 1, this.f8703a);
        c0.g(parcel, 2, this.f8704b);
        c0.k(parcel, 3, this.f8705c, i10);
        c0.c(parcel, 4, this.d);
        c0.r(parcel, q6);
    }
}
