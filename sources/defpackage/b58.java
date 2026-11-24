package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
public final class b58 extends b4 {
    public static final Parcelable.Creator<b58> CREATOR = new hx6((byte) 7);
    public final PendingIntent a;

    public b58(PendingIntent pendingIntent) {
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
