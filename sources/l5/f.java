package l5;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import b6.m;
import j7.f5;
import l4.j;
public final class f extends c6.a {
    public static final Parcelable.Creator<f> CREATOR = new j(2);
    public final PendingIntent f11350a;

    public f(PendingIntent pendingIntent) {
        m.h(pendingIntent);
        this.f11350a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.k(parcel, 1, this.f11350a, i10);
        f5.r(parcel, q10);
    }
}
