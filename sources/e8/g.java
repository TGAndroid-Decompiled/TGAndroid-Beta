package e8;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new e6.i(6);
    public final PendingIntent f8705a;

    public g(PendingIntent pendingIntent) {
        this.f8705a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.k(parcel, 1, this.f8705a, i10);
        d0.r(parcel, q6);
    }
}
