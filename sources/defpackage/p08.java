package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
public final class p08 extends b4 {
    public static final Parcelable.Creator<p08> CREATOR = new yhf((byte) 16);
    public PendingIntent a;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.k(parcel, 1, this.a, i);
        mve.s(parcel, r);
    }
}
