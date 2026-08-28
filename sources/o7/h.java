package o7;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import g7.p8;
import o5.p;
public final class h extends y5.a {
    public static final Parcelable.Creator<h> CREATOR = new p(6);
    public String[] f19016a;
    public int[] f19017b;
    public RemoteViews f19018c;
    public byte[] d;

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.m(parcel, 1, this.f19016a);
        p8.g(parcel, 2, this.f19017b);
        p8.k(parcel, 3, this.f19018c, i9);
        p8.c(parcel, 4, this.d);
        p8.r(parcel, q10);
    }
}
