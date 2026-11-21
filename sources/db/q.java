package db;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.List;
public final class q extends r6.a {
    public static final Parcelable.Creator<q> CREATOR = new k(4);
    public final List f8290a;

    public q(List simSlots) {
        kotlin.jvm.internal.j.e(simSlots, "simSlots");
        this.f8290a = simSlots;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = bc.r(dest, 20293);
        bc.h(dest, 1, this.f8290a);
        bc.s(dest, r10);
    }
}
