package h8;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import c8.cc;
import f7.t0;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new t0(25);
    public String[] f13952a;
    public int[] f13953b;
    public RemoteViews f13954c;
    public byte[] d;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.m(parcel, 1, this.f13952a);
        cc.g(parcel, 2, this.f13953b);
        cc.k(parcel, 3, this.f13954c, i7);
        cc.c(parcel, 4, this.d);
        cc.s(parcel, r10);
    }
}
