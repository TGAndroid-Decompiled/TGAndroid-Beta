package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class x extends r6.a {
    public static final Parcelable.Creator<x> CREATOR = new c(21);
    public final int f3095a;
    public final k f3096b;

    public x(int i7, k kVar) {
        this.f3095a = i7;
        this.f3096b = kVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f3095a);
        bc.k(parcel, 3, this.f3096b, i7);
        bc.s(parcel, r10);
    }
}
