package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class n extends r6.a {
    public static final Parcelable.Creator<n> CREATOR = new c(11);
    public final int f3079a;
    public final b f3080b;

    public n(int i7, b bVar) {
        this.f3079a = i7;
        this.f3080b = bVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 2, 4);
        parcel.writeInt(this.f3079a);
        wb.k(parcel, 3, this.f3080b, i7);
        wb.s(parcel, r10);
    }
}
