package g8;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import f6.c0;
public final class h extends q6.a {
    public static final Parcelable.Creator<h> CREATOR = new c0(10);
    public String[] f12040a;
    public int[] f12041b;
    public RemoteViews f12042c;
    public byte[] d;

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.n(parcel, 1, this.f12040a);
        j8.a.h(parcel, 2, this.f12041b);
        j8.a.l(parcel, 3, this.f12042c, i3);
        j8.a.d(parcel, 4, this.d);
        j8.a.t(parcel, s6);
    }
}
