package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class q extends r6.a {
    public static final Parcelable.Creator<q> CREATOR = new c(14);
    public final int f3044a;
    public final boolean f3045b;

    public q(int i7, boolean z10) {
        this.f3044a = i7;
        this.f3045b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f3044a);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f3045b ? 1 : 0);
        bc.s(parcel, r10);
    }
}
