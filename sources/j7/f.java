package j7;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new b(4);
    public final PendingIntent f16914a;
    public final h f16915b;

    public f(PendingIntent pendingIntent, h hVar) {
        this.f16914a = pendingIntent;
        this.f16915b = hVar;
        if (pendingIntent == null && hVar == null) {
            throw new IllegalArgumentException("pendingIntent or createCredentialResponse must be specified.");
        }
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = yb.r(dest, 20293);
        yb.k(dest, 1, this.f16914a, i7);
        yb.k(dest, 2, this.f16915b, i7);
        yb.s(dest, r10);
    }
}
