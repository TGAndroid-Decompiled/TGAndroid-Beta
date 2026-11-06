package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class p0 extends r6.a {
    public static final Parcelable.Creator<p0> CREATOR = new n0(2);
    public final int f3089a;
    public final String f3090b;

    public p0(int i7, String str) {
        this.f3089a = i7;
        this.f3090b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 2, 4);
        parcel.writeInt(this.f3089a);
        wb.l(parcel, 3, this.f3090b);
        wb.s(parcel, r10);
    }
}
