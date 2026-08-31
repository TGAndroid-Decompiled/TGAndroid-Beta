package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class c0 extends c6.a {
    public static final Parcelable.Creator<c0> CREATOR = new c(24);
    public final int f13494a;
    public final m0 f13495b;

    public c0(int i10, m0 m0Var) {
        this.f13494a = i10;
        this.f13495b = m0Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f13494a);
        g5.k(parcel, 3, this.f13495b, i10);
        g5.r(parcel, q10);
    }
}
