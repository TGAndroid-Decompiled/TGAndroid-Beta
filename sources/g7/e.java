package g7;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new e6.p(15);
    public final PendingIntent f7429a;
    public final g f7430b;

    public e(PendingIntent pendingIntent, g gVar) {
        this.f7429a = pendingIntent;
        this.f7430b = gVar;
        if (pendingIntent == null && gVar == null) {
            throw new IllegalArgumentException("pendingIntent or createCredentialResponse must be specified.");
        }
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q6 = h0.q(dest, 20293);
        h0.k(dest, 1, this.f7429a, i10);
        h0.k(dest, 2, this.f7430b, i10);
        h0.r(dest, q6);
    }
}
