package o7;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import o5.p;
public final class g extends y5.a {
    public static final Parcelable.Creator<g> CREATOR = new p(5);
    public final PendingIntent f19015a;

    public g(PendingIntent pendingIntent) {
        this.f19015a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.k(parcel, 1, this.f19015a, i9);
        p8.r(parcel, q10);
    }
}
