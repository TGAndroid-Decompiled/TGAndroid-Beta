package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class a0 extends r6.a {
    public static final Parcelable.Creator<a0> CREATOR = new c(24);
    public final int f3011a;
    public final l0 f3012b;

    public a0(int i7, l0 l0Var) {
        this.f3011a = i7;
        this.f3012b = l0Var;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 2, 4);
        parcel.writeInt(this.f3011a);
        wb.k(parcel, 3, this.f3012b, i7);
        wb.s(parcel, r10);
    }
}
