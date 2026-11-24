package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
public final class pg7 extends b4 {
    public static final Parcelable.Creator<pg7> CREATOR = new d3d((byte) 1);
    public final PendingIntent a;

    public pg7(PendingIntent pendingIntent) {
        this.a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.k(parcel, 1, this.a, i);
        mve.s(parcel, r);
    }
}
