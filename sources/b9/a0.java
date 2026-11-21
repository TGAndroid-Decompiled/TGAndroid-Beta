package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class a0 extends r6.a {
    public static final Parcelable.Creator<a0> CREATOR = new c(24);
    public final int f2975a;
    public final m0 f2976b;

    public a0(int i7, m0 m0Var) {
        this.f2975a = i7;
        this.f2976b = m0Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f2975a);
        bc.k(parcel, 3, this.f2976b, i7);
        bc.s(parcel, r10);
    }
}
