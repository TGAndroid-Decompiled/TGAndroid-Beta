package a9;

import android.os.Parcel;
import android.os.Parcelable;
public final class q extends q6.a {
    public static final Parcelable.Creator<q> CREATOR = new c(14);
    public final int f238a;
    public final boolean f239b;

    public q(int i3, boolean z10) {
        this.f238a = i3;
        this.f239b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f238a);
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(this.f239b ? 1 : 0);
        j8.a.t(parcel, s6);
    }
}
