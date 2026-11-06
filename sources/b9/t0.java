package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class t0 extends r6.a {
    public static final Parcelable.Creator<t0> CREATOR = new n0(6);
    public final int f3106a;
    public final int f3107b;

    public t0(int i7, int i10) {
        this.f3106a = i7;
        this.f3107b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 2, 4);
        parcel.writeInt(this.f3106a);
        wb.q(parcel, 3, 4);
        parcel.writeInt(this.f3107b);
        wb.s(parcel, r10);
    }
}
