package e8;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import w7.f0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new e6.i(7);
    public String[] f8030a;
    public int[] f8031b;
    public RemoteViews f8032c;
    public byte[] d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.m(parcel, 1, this.f8030a);
        f0.g(parcel, 2, this.f8031b);
        f0.k(parcel, 3, this.f8032c, i10);
        f0.c(parcel, 4, this.d);
        f0.r(parcel, q6);
    }
}
