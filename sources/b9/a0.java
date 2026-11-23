package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class a0 extends r6.a {
    public static final Parcelable.Creator<a0> CREATOR = new c(24);
    public final int f2934a;
    public final l0 f2935b;

    public a0(int i7, l0 l0Var) {
        this.f2934a = i7;
        this.f2935b = l0Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f2934a);
        cc.k(parcel, 3, this.f2935b, i7);
        cc.s(parcel, r10);
    }
}
