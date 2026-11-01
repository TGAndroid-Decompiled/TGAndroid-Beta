package g7;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;
public final class m extends o6.a {
    public static final Parcelable.Creator<m> CREATOR = new e6.p(24);
    public final PendingIntent f7446a;

    public m(PendingIntent pendingIntent) {
        kotlin.jvm.internal.i.e(pendingIntent, "pendingIntent");
        this.f7446a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q6 = h0.q(dest, 20293);
        h0.k(dest, 1, this.f7446a, i10);
        h0.r(dest, q6);
    }
}
