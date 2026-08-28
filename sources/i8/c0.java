package i8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class c0 extends y5.a {
    public static final Parcelable.Creator<c0> CREATOR = new c(24);
    public final int f10954a;
    public final n0 f10955b;

    public c0(int i9, n0 n0Var) {
        this.f10954a = i9;
        this.f10955b = n0Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f10954a);
        p8.k(parcel, 3, this.f10955b, i9);
        p8.r(parcel, q10);
    }
}
