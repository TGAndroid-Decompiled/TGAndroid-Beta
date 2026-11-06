package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class q0 extends r6.a {
    public static final Parcelable.Creator<q0> CREATOR = new n0(3);
    public final int f3093a;
    public final k f3094b;

    public q0(int i7, k kVar) {
        this.f3093a = i7;
        this.f3094b = kVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 2, 4);
        parcel.writeInt(this.f3093a);
        wb.k(parcel, 3, this.f3094b, i7);
        wb.s(parcel, r10);
    }
}
