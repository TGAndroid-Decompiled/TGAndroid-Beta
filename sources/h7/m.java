package h7;

import a8.df;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
public final class m extends p6.a {
    public static final Parcelable.Creator<m> CREATOR = new f6.i(25);
    public final PendingIntent f12699a;

    public m(PendingIntent pendingIntent) {
        kotlin.jvm.internal.i.e(pendingIntent, "pendingIntent");
        this.f12699a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q5 = df.q(dest, 20293);
        df.k(dest, 1, this.f12699a, i10);
        df.r(dest, q5);
    }
}
