package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class m0 extends r6.a {
    public static final Parcelable.Creator<m0> CREATOR = new n0(0);
    public final int f3077a;
    public final f f3078b;

    public m0(int i7, f fVar) {
        this.f3077a = i7;
        this.f3078b = fVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 2, 4);
        parcel.writeInt(this.f3077a);
        wb.k(parcel, 3, this.f3078b, i7);
        wb.s(parcel, r10);
    }
}
