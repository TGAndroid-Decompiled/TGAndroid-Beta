package j7;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new b(4);
    public final PendingIntent f16558a;
    public final h f16559b;

    public f(PendingIntent pendingIntent, h hVar) {
        this.f16558a = pendingIntent;
        this.f16559b = hVar;
        if (pendingIntent == null && hVar == null) {
            throw new IllegalArgumentException("pendingIntent or createCredentialResponse must be specified.");
        }
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = wb.r(dest, 20293);
        wb.k(dest, 1, this.f16558a, i7);
        wb.k(dest, 2, this.f16559b, i7);
        wb.s(dest, r10);
    }
}
