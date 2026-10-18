package g7;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new e6.i(16);
    public final PendingIntent f10907a;
    public final g f10908b;

    public e(PendingIntent pendingIntent, g gVar) {
        this.f10907a = pendingIntent;
        this.f10908b = gVar;
        if (pendingIntent == null && gVar == null) {
            throw new IllegalArgumentException("pendingIntent or createCredentialResponse must be specified.");
        }
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q6 = f0.q(dest, 20293);
        f0.k(dest, 1, this.f10907a, i10);
        f0.k(dest, 2, this.f10908b, i10);
        f0.r(dest, q6);
    }
}
