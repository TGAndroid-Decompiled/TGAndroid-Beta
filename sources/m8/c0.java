package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class c0 extends c6.a {
    public static final Parcelable.Creator<c0> CREATOR = new c(24);
    public final int f13766a;
    public final m0 f13767b;

    public c0(int i10, m0 m0Var) {
        this.f13766a = i10;
        this.f13767b = m0Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f13766a);
        f5.k(parcel, 3, this.f13767b, i10);
        f5.r(parcel, q10);
    }
}
