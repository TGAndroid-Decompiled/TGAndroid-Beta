package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
public final class wdf extends c4 {
    public static final Parcelable.Creator<wdf> CREATOR = new t4f((byte) 17);
    public String[] a;
    public int[] b;
    public RemoteViews c;
    public byte[] d;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.m(parcel, 1, this.a);
        bye.g(parcel, 2, this.b);
        bye.k(parcel, 3, this.c, i);
        bye.c(parcel, 4, this.d);
        bye.s(parcel, r);
    }
}
