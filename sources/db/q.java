package db;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.List;
public final class q extends r6.a {
    public static final Parcelable.Creator<q> CREATOR = new k(4);
    public final List f8592a;

    public q(List simSlots) {
        kotlin.jvm.internal.j.e(simSlots, "simSlots");
        this.f8592a = simSlots;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = wb.r(dest, 20293);
        wb.h(dest, 1, this.f8592a);
        wb.s(dest, r10);
    }
}
