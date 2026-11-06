package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class i extends r6.a {
    public static final Parcelable.Creator<i> CREATOR = new c(5);
    public final int f3057a;

    public i(int i7) {
        this.f3057a = i7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 2, 4);
        parcel.writeInt(this.f3057a);
        wb.s(parcel, r10);
    }
}
