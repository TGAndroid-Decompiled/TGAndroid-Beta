package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class q0 extends r6.a {
    public static final Parcelable.Creator<q0> CREATOR = new n0(3);
    public final int f3016a;
    public final k f3017b;

    public q0(int i7, k kVar) {
        this.f3016a = i7;
        this.f3017b = kVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f3016a);
        cc.k(parcel, 3, this.f3017b, i7);
        cc.s(parcel, r10);
    }
}
