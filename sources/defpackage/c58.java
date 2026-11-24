package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
public final class c58 extends b4 {
    public static final Parcelable.Creator<c58> CREATOR = new hx6((byte) 8);
    public final PendingIntent a;

    public c58(PendingIntent pendingIntent) {
        pendingIntent.getClass();
        this.a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int r = mve.r(parcel, 20293);
        mve.k(parcel, 1, this.a, i);
        mve.s(parcel, r);
    }
}
