package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
public final class ii0 extends b4 {
    public static final Parcelable.Creator<ii0> CREATOR = new d3d((byte) 18);
    public final PendingIntent a;

    public ii0(PendingIntent pendingIntent) {
        ite.h(pendingIntent);
        this.a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.k(parcel, 1, this.a, i);
        mve.s(parcel, r);
    }
}
