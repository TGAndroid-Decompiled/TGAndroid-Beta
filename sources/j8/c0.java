package j8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class c0 extends z5.a {
    public static final Parcelable.Creator<c0> CREATOR = new c(24);

    public final int f12755a;

    public final m0 f12756b;

    public c0(int i10, m0 m0Var) {
        this.f12755a = i10;
        this.f12756b = m0Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f12755a);
        r8.k(parcel, 3, this.f12756b, i10);
        r8.r(parcel, iQ);
    }
}
