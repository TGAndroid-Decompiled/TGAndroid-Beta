package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class j extends r6.a {
    public static final Parcelable.Creator<j> CREATOR = new c(6);
    public final int f3059a;
    public final boolean f3060b;
    public final boolean f3061c;
    public final boolean d;
    public final boolean f3062e;

    public j(int i7, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.f3059a = i7;
        this.f3060b = z9;
        this.f3061c = z10;
        this.d = z11;
        this.f3062e = z12;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 1, 4);
        parcel.writeInt(this.f3059a);
        wb.q(parcel, 2, 4);
        parcel.writeInt(this.f3060b ? 1 : 0);
        wb.q(parcel, 3, 4);
        parcel.writeInt(this.f3061c ? 1 : 0);
        wb.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        wb.q(parcel, 5, 4);
        parcel.writeInt(this.f3062e ? 1 : 0);
        wb.s(parcel, r10);
    }
}
