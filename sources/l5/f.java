package l5;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import b6.m;
import j7.g5;
import l4.j;
public final class f extends c6.a {
    public static final Parcelable.Creator<f> CREATOR = new j(2);
    public final PendingIntent f11727a;

    public f(PendingIntent pendingIntent) {
        m.h(pendingIntent);
        this.f11727a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.k(parcel, 1, this.f11727a, i10);
        g5.r(parcel, q10);
    }
}
