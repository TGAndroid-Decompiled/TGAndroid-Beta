package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class x extends r6.a {
    public static final Parcelable.Creator<x> CREATOR = new c(21);
    public final int f3046a;
    public final k f3047b;

    public x(int i7, k kVar) {
        this.f3046a = i7;
        this.f3047b = kVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f3046a);
        cc.k(parcel, 3, this.f3047b, i7);
        cc.s(parcel, r10);
    }
}
