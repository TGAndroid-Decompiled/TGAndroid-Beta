package j8;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class h extends c6.a {
    public static final Parcelable.Creator<h> CREATOR = new t(10);
    public PendingIntent f9898a;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.k(parcel, 1, this.f9898a, i10);
        g5.r(parcel, q10);
    }
}
