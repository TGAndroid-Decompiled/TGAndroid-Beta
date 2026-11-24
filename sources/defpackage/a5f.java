package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
public final class a5f extends b4 {
    public static final Parcelable.Creator<a5f> CREATOR = new c0f((byte) 13);
    public final PendingIntent a;

    public a5f(PendingIntent pendingIntent) {
        this.a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.k(parcel, 1, this.a, i);
        jte.s(parcel, r);
    }
}
