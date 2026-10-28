package f8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
public final class h extends p6.a {
    public static final Parcelable.Creator<h> CREATOR = new f6.i(7);
    public String[] f10246a;
    public int[] f10247b;
    public RemoteViews f10248c;
    public byte[] d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.m(parcel, 1, this.f10246a);
        df.g(parcel, 2, this.f10247b);
        df.k(parcel, 3, this.f10248c, i10);
        df.c(parcel, 4, this.d);
        df.r(parcel, q5);
    }
}
