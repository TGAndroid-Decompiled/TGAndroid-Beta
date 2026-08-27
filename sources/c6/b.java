package c6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class b extends z5.a {
    public static final Parcelable.Creator<b> CREATOR = new w.a(26);

    public final PendingIntent f2452a;

    public b(PendingIntent pendingIntent) {
        this.f2452a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.k(parcel, 1, this.f2452a, i10);
        r8.r(parcel, iQ);
    }
}
