package j7;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new b(4);
    public final PendingIntent f17299a;
    public final h f17300b;

    public f(PendingIntent pendingIntent, h hVar) {
        this.f17299a = pendingIntent;
        this.f17300b = hVar;
        if (pendingIntent == null && hVar == null) {
            throw new IllegalArgumentException("pendingIntent or createCredentialResponse must be specified.");
        }
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = bc.r(dest, 20293);
        bc.k(dest, 1, this.f17299a, i7);
        bc.k(dest, 2, this.f17300b, i7);
        bc.s(dest, r10);
    }
}
