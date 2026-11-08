package j7;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new b(4);
    public final PendingIntent f16561a;
    public final h f16562b;

    public f(PendingIntent pendingIntent, h hVar) {
        this.f16561a = pendingIntent;
        this.f16562b = hVar;
        if (pendingIntent == null && hVar == null) {
            throw new IllegalArgumentException("pendingIntent or createCredentialResponse must be specified.");
        }
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = xb.r(dest, 20293);
        xb.k(dest, 1, this.f16561a, i7);
        xb.k(dest, 2, this.f16562b, i7);
        xb.s(dest, r10);
    }
}
