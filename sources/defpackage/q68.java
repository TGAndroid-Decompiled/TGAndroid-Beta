package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
public final class q68 extends c4 {
    public static final Parcelable.Creator<q68> CREATOR = new mx6((byte) 8);
    public final PendingIntent a;

    public q68(PendingIntent pendingIntent) {
        pendingIntent.getClass();
        this.a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int r = bye.r(parcel, 20293);
        bye.k(parcel, 1, this.a, i);
        bye.s(parcel, r);
    }
}
