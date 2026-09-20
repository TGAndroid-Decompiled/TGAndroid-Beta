package e8;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new e6.i(6);
    public final PendingIntent f8047a;

    public g(PendingIntent pendingIntent) {
        this.f8047a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.k(parcel, 1, this.f8047a, i10);
        f0.r(parcel, q6);
    }
}
