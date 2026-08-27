package g8;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class h extends z5.a {
    public static final Parcelable.Creator<h> CREATOR = new f4.e(27);

    public PendingIntent f6744a;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.k(parcel, 1, this.f6744a, i10);
        r8.r(parcel, iQ);
    }
}
