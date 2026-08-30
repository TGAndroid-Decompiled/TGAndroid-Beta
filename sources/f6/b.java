package f6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import b9.e;
import j7.f5;
public final class b extends c6.a {
    public static final Parcelable.Creator<b> CREATOR = new e(18);
    public final PendingIntent f6005a;

    public b(PendingIntent pendingIntent) {
        this.f6005a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.k(parcel, 1, this.f6005a, i10);
        f5.r(parcel, q10);
    }
}
