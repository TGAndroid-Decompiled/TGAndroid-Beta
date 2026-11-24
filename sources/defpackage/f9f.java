package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
public final class f9f extends b4 {
    public static final Parcelable.Creator<f9f> CREATOR = new c0f((byte) 17);
    public String[] a;
    public int[] b;
    public RemoteViews c;
    public byte[] d;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.m(parcel, 1, this.a);
        jte.g(parcel, 2, this.b);
        jte.k(parcel, 3, this.c, i);
        jte.c(parcel, 4, this.d);
        jte.s(parcel, r);
    }
}
