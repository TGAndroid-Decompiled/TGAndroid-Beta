package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
public final class ih0 extends b4 {
    public static final Parcelable.Creator<ih0> CREATOR = new b1d((byte) 18);
    public final PendingIntent a;

    public ih0(PendingIntent pendingIntent) {
        fre.h(pendingIntent);
        this.a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.k(parcel, 1, this.a, i);
        jte.s(parcel, r);
    }
}
