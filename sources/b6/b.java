package b6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class b extends y5.a {
    public static final Parcelable.Creator<b> CREATOR = new w.a(15);
    public final PendingIntent f1545a;

    public b(PendingIntent pendingIntent) {
        this.f1545a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.k(parcel, 1, this.f1545a, i9);
        p8.r(parcel, q10);
    }
}
