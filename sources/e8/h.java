package e8;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import w7.d0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new e6.i(7);
    public String[] f8705a;
    public int[] f8706b;
    public RemoteViews f8707c;
    public byte[] d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.m(parcel, 1, this.f8705a);
        d0.g(parcel, 2, this.f8706b);
        d0.k(parcel, 3, this.f8707c, i10);
        d0.c(parcel, 4, this.d);
        d0.r(parcel, q6);
    }
}
