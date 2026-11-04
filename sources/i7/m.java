package i7;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import f6.c0;
public final class m extends q6.a {
    public static final Parcelable.Creator<m> CREATOR = new c0(28);
    public final PendingIntent f14690a;

    public m(PendingIntent pendingIntent) {
        kotlin.jvm.internal.j.e(pendingIntent, "pendingIntent");
        this.f14690a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i3) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int s6 = j8.a.s(dest, 20293);
        j8.a.l(dest, 1, this.f14690a, i3);
        j8.a.t(dest, s6);
    }
}
