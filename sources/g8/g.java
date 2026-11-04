package g8;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import f6.c0;
public final class g extends q6.a {
    public static final Parcelable.Creator<g> CREATOR = new c0(9);
    public final PendingIntent f12039a;

    public g(PendingIntent pendingIntent) {
        this.f12039a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.l(parcel, 1, this.f12039a, i3);
        j8.a.t(parcel, s6);
    }
}
