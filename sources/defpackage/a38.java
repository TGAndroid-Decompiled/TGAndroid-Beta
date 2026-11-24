package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
public final class a38 extends b4 {
    public static final Parcelable.Creator<a38> CREATOR = new hv6((byte) 8);
    public final PendingIntent a;

    public a38(PendingIntent pendingIntent) {
        pendingIntent.getClass();
        this.a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int r = jte.r(parcel, 20293);
        jte.k(parcel, 1, this.a, i);
        jte.s(parcel, r);
    }
}
