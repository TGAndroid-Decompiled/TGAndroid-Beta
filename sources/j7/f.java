package j7;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new b(4);
    public final PendingIntent f17290a;
    public final h f17291b;

    public f(PendingIntent pendingIntent, h hVar) {
        this.f17290a = pendingIntent;
        this.f17291b = hVar;
        if (pendingIntent == null && hVar == null) {
            throw new IllegalArgumentException("pendingIntent or createCredentialResponse must be specified.");
        }
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = cc.r(dest, 20293);
        cc.k(dest, 1, this.f17290a, i7);
        cc.k(dest, 2, this.f17291b, i7);
        cc.s(dest, r10);
    }
}
