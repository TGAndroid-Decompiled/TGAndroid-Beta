package f6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import b9.e;
import j7.g5;
public final class b extends c6.a {
    public static final Parcelable.Creator<b> CREATOR = new e(18);
    public final PendingIntent f6113a;

    public b(PendingIntent pendingIntent) {
        this.f6113a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.k(parcel, 1, this.f6113a, i10);
        g5.r(parcel, q10);
    }
}
