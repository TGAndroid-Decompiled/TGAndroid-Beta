package f6;

import android.os.Parcel;
import android.os.Parcelable;
import e7.r0;
public final class a0 extends q6.a {
    public static final Parcelable.Creator<a0> CREATOR = new r0(29);
    public final boolean f11454a;

    public a0(boolean z10) {
        this.f11454a = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f11454a ? 1 : 0);
        j8.a.t(parcel, s6);
    }
}
