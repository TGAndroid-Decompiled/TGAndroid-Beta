package db;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.List;
public final class q extends r6.a {
    public static final Parcelable.Creator<q> CREATOR = new k(4);
    public final List f8590a;

    public q(List simSlots) {
        kotlin.jvm.internal.j.e(simSlots, "simSlots");
        this.f8590a = simSlots;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = xb.r(dest, 20293);
        xb.h(dest, 1, this.f8590a);
        xb.s(dest, r10);
    }
}
