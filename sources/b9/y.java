package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class y extends r6.a {
    public static final Parcelable.Creator<y> CREATOR = new c(22);
    public final int f3123a;
    public final String f3124b;

    public y(int i7, String str) {
        this.f3123a = i7;
        this.f3124b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 2, 4);
        parcel.writeInt(this.f3123a);
        wb.l(parcel, 3, this.f3124b);
        wb.s(parcel, r10);
    }
}
