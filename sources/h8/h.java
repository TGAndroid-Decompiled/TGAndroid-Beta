package h8;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
public final class h extends a6.a {
    public static final Parcelable.Creator<h> CREATOR = new g8.b(26);
    public PendingIntent f7891a;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.k(parcel, 1, this.f7891a, i10);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
