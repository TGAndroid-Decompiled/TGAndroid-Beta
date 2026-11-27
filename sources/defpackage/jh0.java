package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
public final class jh0 extends c4 {
    public static final Parcelable.Creator<jh0> CREATOR = new s5d((byte) 18);
    public final PendingIntent a;

    public jh0(PendingIntent pendingIntent) {
        xve.h(pendingIntent);
        this.a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.k(parcel, 1, this.a, i);
        bye.s(parcel, r);
    }
}
