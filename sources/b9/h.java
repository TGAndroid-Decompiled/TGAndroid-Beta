package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new c(4);
    public final int f3054a;

    public h(int i7) {
        this.f3054a = i7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 2, 4);
        parcel.writeInt(this.f3054a);
        wb.s(parcel, r10);
    }
}
