package h8;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import f7.t0;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new t0(24);
    public final PendingIntent f13954a;

    public g(PendingIntent pendingIntent) {
        this.f13954a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 1, this.f13954a, i7);
        bc.s(parcel, r10);
    }
}
