package h8;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import f7.t0;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new t0(24);
    public final PendingIntent f13951a;

    public g(PendingIntent pendingIntent) {
        this.f13951a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.k(parcel, 1, this.f13951a, i7);
        cc.s(parcel, r10);
    }
}
