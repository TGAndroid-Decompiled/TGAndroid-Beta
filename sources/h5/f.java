package h5;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import x5.l;
public final class f extends y5.a {
    public static final Parcelable.Creator<f> CREATOR = new h(1);
    public final PendingIntent f9849a;

    public f(PendingIntent pendingIntent) {
        l.h(pendingIntent);
        this.f9849a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.k(parcel, 1, this.f9849a, i9);
        p8.r(parcel, q10);
    }
}
