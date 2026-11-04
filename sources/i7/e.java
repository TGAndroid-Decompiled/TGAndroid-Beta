package i7;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import f6.c0;
public final class e extends q6.a {
    public static final Parcelable.Creator<e> CREATOR = new c0(19);
    public final PendingIntent f14672a;
    public final g f14673b;

    public e(PendingIntent pendingIntent, g gVar) {
        this.f14672a = pendingIntent;
        this.f14673b = gVar;
        if (pendingIntent == null && gVar == null) {
            throw new IllegalArgumentException("pendingIntent or createCredentialResponse must be specified.");
        }
    }

    @Override
    public final void writeToParcel(Parcel dest, int i3) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int s6 = j8.a.s(dest, 20293);
        j8.a.l(dest, 1, this.f14672a, i3);
        j8.a.l(dest, 2, this.f14673b, i3);
        j8.a.t(dest, s6);
    }
}
