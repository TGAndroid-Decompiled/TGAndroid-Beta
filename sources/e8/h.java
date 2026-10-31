package e8;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import e6.p;
import w7.h0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new p(6);
    public String[] f6318a;
    public int[] f6319b;
    public RemoteViews f6320c;
    public byte[] d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.m(parcel, 1, this.f6318a);
        h0.g(parcel, 2, this.f6319b);
        h0.k(parcel, 3, this.f6320c, i10);
        h0.c(parcel, 4, this.d);
        h0.r(parcel, q6);
    }
}
