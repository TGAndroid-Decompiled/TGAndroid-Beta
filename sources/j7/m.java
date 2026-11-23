package j7;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class m extends r6.a {
    public static final Parcelable.Creator<m> CREATOR = new b(12);
    public final PendingIntent f17407a;

    public m(PendingIntent pendingIntent) {
        kotlin.jvm.internal.j.e(pendingIntent, "pendingIntent");
        this.f17407a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = cc.r(dest, 20293);
        cc.k(dest, 1, this.f17407a, i7);
        cc.s(dest, r10);
    }
}
