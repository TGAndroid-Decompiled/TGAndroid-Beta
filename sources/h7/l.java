package h7;

import a8.df;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
public final class l extends p6.a {
    public static final Parcelable.Creator<l> CREATOR = new f6.i(24);
    public final PendingIntent f12698a;

    public l(PendingIntent pendingIntent) {
        kotlin.jvm.internal.i.e(pendingIntent, "pendingIntent");
        this.f12698a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q5 = df.q(dest, 20293);
        df.k(dest, 1, this.f12698a, i10);
        df.r(dest, q5);
    }
}
