package g7;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new e6.i(24);
    public final PendingIntent f8635a;

    public l(PendingIntent pendingIntent) {
        kotlin.jvm.internal.i.e(pendingIntent, "pendingIntent");
        this.f8635a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q6 = e0.q(dest, 20293);
        e0.k(dest, 1, this.f8635a, i10);
        e0.r(dest, q6);
    }
}
