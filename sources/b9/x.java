package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class x extends r6.a {
    public static final Parcelable.Creator<x> CREATOR = new c(21);
    public final int f3120a;
    public final k f3121b;

    public x(int i7, k kVar) {
        this.f3120a = i7;
        this.f3121b = kVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 2, 4);
        parcel.writeInt(this.f3120a);
        wb.k(parcel, 3, this.f3121b, i7);
        wb.s(parcel, r10);
    }
}
