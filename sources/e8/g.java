package e8;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import e6.p;
import w7.h0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new p(5);
    public final PendingIntent f6317a;

    public g(PendingIntent pendingIntent) {
        this.f6317a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.k(parcel, 1, this.f6317a, i10);
        h0.r(parcel, q6);
    }
}
