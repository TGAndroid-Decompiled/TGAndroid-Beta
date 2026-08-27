package h5;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import y5.l;

public final class f extends z5.a {
    public static final Parcelable.Creator<f> CREATOR = new h(0);

    public final PendingIntent f8279a;

    public f(PendingIntent pendingIntent) {
        l.h(pendingIntent);
        this.f8279a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.k(parcel, 1, this.f8279a, i10);
        r8.r(parcel, iQ);
    }
}
