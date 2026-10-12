package g7;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import w7.c0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new e6.i(16);
    public final PendingIntent f10387a;
    public final g f10388b;

    public e(PendingIntent pendingIntent, g gVar) {
        this.f10387a = pendingIntent;
        this.f10388b = gVar;
        if (pendingIntent == null && gVar == null) {
            throw new IllegalArgumentException("pendingIntent or createCredentialResponse must be specified.");
        }
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q6 = c0.q(dest, 20293);
        c0.k(dest, 1, this.f10387a, i10);
        c0.k(dest, 2, this.f10388b, i10);
        c0.r(dest, q6);
    }
}
