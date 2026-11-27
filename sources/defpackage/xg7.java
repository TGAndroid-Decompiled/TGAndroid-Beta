package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
public final class xg7 extends c4 {
    public static final Parcelable.Creator<xg7> CREATOR = new s5d((byte) 1);
    public final PendingIntent a;

    public xg7(PendingIntent pendingIntent) {
        this.a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.k(parcel, 1, this.a, i);
        bye.s(parcel, r);
    }
}
