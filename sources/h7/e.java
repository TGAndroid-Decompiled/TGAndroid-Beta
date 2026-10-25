package h7;

import a8.df;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
public final class e extends p6.a {
    public static final Parcelable.Creator<e> CREATOR = new f6.i(16);
    public final PendingIntent f12683a;
    public final g f12684b;

    public e(PendingIntent pendingIntent, g gVar) {
        this.f12683a = pendingIntent;
        this.f12684b = gVar;
        if (pendingIntent == null && gVar == null) {
            throw new IllegalArgumentException("pendingIntent or createCredentialResponse must be specified.");
        }
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q5 = df.q(dest, 20293);
        df.k(dest, 1, this.f12683a, i10);
        df.k(dest, 2, this.f12684b, i10);
        df.r(dest, q5);
    }
}
