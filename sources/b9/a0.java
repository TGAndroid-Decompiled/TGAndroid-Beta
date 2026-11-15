package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class a0 extends r6.a {
    public static final Parcelable.Creator<a0> CREATOR = new c(24);
    public final int f2965a;
    public final m0 f2966b;

    public a0(int i7, m0 m0Var) {
        this.f2965a = i7;
        this.f2966b = m0Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f2965a);
        yb.k(parcel, 3, this.f2966b, i7);
        yb.s(parcel, r10);
    }
}
