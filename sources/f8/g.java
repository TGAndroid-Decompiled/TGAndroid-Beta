package f8;

import a8.df;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
public final class g extends p6.a {
    public static final Parcelable.Creator<g> CREATOR = new f6.i(6);
    public final PendingIntent f10245a;

    public g(PendingIntent pendingIntent) {
        this.f10245a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.k(parcel, 1, this.f10245a, i10);
        df.r(parcel, q5);
    }
}
