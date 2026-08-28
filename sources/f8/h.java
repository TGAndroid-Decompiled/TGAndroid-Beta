package f8;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class h extends y5.a {
    public static final Parcelable.Creator<h> CREATOR = new r(14);
    public PendingIntent f5943a;

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.k(parcel, 1, this.f5943a, i9);
        p8.r(parcel, q10);
    }
}
