package g7;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new e6.i(16);
    public final PendingIntent f9489a;
    public final g f9490b;

    public e(PendingIntent pendingIntent, g gVar) {
        this.f9489a = pendingIntent;
        this.f9490b = gVar;
        if (pendingIntent == null && gVar == null) {
            throw new IllegalArgumentException("pendingIntent or createCredentialResponse must be specified.");
        }
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q6 = e0.q(dest, 20293);
        e0.k(dest, 1, this.f9489a, i10);
        e0.k(dest, 2, this.f9490b, i10);
        e0.r(dest, q6);
    }
}
