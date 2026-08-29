package d6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
public final class b extends a6.a {
    public static final Parcelable.Creator<b> CREATOR = new w.a(29);
    public final PendingIntent f5423a;

    public b(PendingIntent pendingIntent) {
        this.f5423a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.k(parcel, 1, this.f5423a, i10);
        o.r(parcel, q6);
    }
}
