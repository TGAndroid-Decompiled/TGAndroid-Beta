package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
public final class hbf extends b4 {
    public static final Parcelable.Creator<hbf> CREATOR = new e2f((byte) 17);
    public String[] a;
    public int[] b;
    public RemoteViews c;
    public byte[] d;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.m(parcel, 1, this.a);
        mve.g(parcel, 2, this.b);
        mve.k(parcel, 3, this.c, i);
        mve.c(parcel, 4, this.d);
        mve.s(parcel, r);
    }
}
