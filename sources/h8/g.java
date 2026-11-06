package h8;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import f7.t0;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new t0(24);
    public final PendingIntent f14280a;

    public g(PendingIntent pendingIntent) {
        this.f14280a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.k(parcel, 1, this.f14280a, i7);
        xb.s(parcel, r10);
    }
}
