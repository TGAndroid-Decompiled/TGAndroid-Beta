package a6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import q6.m;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new w.a(2);
    public final PendingIntent f291a;

    public f(PendingIntent pendingIntent) {
        m.h(pendingIntent);
        this.f291a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 1, this.f291a, i7);
        bc.s(parcel, r10);
    }
}
