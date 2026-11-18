package j7;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new b(4);
    public final PendingIntent f17296a;
    public final h f17297b;

    public f(PendingIntent pendingIntent, h hVar) {
        this.f17296a = pendingIntent;
        this.f17297b = hVar;
        if (pendingIntent == null && hVar == null) {
            throw new IllegalArgumentException("pendingIntent or createCredentialResponse must be specified.");
        }
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = bc.r(dest, 20293);
        bc.k(dest, 1, this.f17296a, i7);
        bc.k(dest, 2, this.f17297b, i7);
        bc.s(dest, r10);
    }
}
