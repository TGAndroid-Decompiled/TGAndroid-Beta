package j7;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class m extends r6.a {
    public static final Parcelable.Creator<m> CREATOR = new b(12);
    public final PendingIntent f16575a;

    public m(PendingIntent pendingIntent) {
        kotlin.jvm.internal.j.e(pendingIntent, "pendingIntent");
        this.f16575a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = wb.r(dest, 20293);
        wb.k(dest, 1, this.f16575a, i7);
        wb.s(dest, r10);
    }
}
