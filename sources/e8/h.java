package e8;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import w7.e0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new e6.i(7);
    public String[] f7348a;
    public int[] f7349b;
    public RemoteViews f7350c;
    public byte[] d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.m(parcel, 1, this.f7348a);
        e0.g(parcel, 2, this.f7349b);
        e0.k(parcel, 3, this.f7350c, i10);
        e0.c(parcel, 4, this.d);
        e0.r(parcel, q6);
    }
}
