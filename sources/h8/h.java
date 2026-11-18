package h8;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import c8.bc;
import f7.t0;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new t0(25);
    public String[] f13958a;
    public int[] f13959b;
    public RemoteViews f13960c;
    public byte[] d;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.m(parcel, 1, this.f13958a);
        bc.g(parcel, 2, this.f13959b);
        bc.k(parcel, 3, this.f13960c, i7);
        bc.c(parcel, 4, this.d);
        bc.s(parcel, r10);
    }
}
