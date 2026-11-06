package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class t extends r6.a {
    public static final Parcelable.Creator<t> CREATOR = new c(17);
    public final int f3104a;
    public final String f3105b;

    public t(int i7, String str) {
        this.f3104a = i7;
        this.f3105b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 2, 4);
        parcel.writeInt(this.f3104a);
        wb.l(parcel, 3, this.f3105b);
        wb.s(parcel, r10);
    }
}
