package j7;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class n extends r6.a {
    public static final Parcelable.Creator<n> CREATOR = new b(13);
    public final PendingIntent f16576a;

    public n(PendingIntent pendingIntent) {
        kotlin.jvm.internal.j.e(pendingIntent, "pendingIntent");
        this.f16576a = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = wb.r(dest, 20293);
        wb.k(dest, 1, this.f16576a, i7);
        wb.s(dest, r10);
    }
}
