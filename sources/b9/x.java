package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class x extends r6.a {
    public static final Parcelable.Creator<x> CREATOR = new c(21);
    public final int f3081a;
    public final k f3082b;

    public x(int i7, k kVar) {
        this.f3081a = i7;
        this.f3082b = kVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f3081a);
        yb.k(parcel, 3, this.f3082b, i7);
        yb.s(parcel, r10);
    }
}
