package j5;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
import z5.l;
public final class f extends a6.a {
    public static final Parcelable.Creator<f> CREATOR = new i4.g(13);
    public final PendingIntent f10886a;

    public f(PendingIntent pendingIntent) {
        l.h(pendingIntent);
        this.f10886a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.k(parcel, 1, this.f10886a, i10);
        o.r(parcel, q6);
    }
}
