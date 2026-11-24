package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
public final class c7f extends b4 {
    public static final Parcelable.Creator<c7f> CREATOR = new e2f((byte) 13);
    public final PendingIntent a;

    public c7f(PendingIntent pendingIntent) {
        this.a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.k(parcel, 1, this.a, i);
        mve.s(parcel, r);
    }
}
