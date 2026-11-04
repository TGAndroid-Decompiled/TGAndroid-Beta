package a9;

import android.os.Parcel;
import android.os.Parcelable;
public final class r extends q6.a {
    public static final Parcelable.Creator<r> CREATOR = new c(15);
    public final int f242a;
    public final boolean f243b;
    public final boolean f244c;

    public r(int i3, boolean z10, boolean z11) {
        this.f242a = i3;
        this.f243b = z10;
        this.f244c = z11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f242a);
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(this.f243b ? 1 : 0);
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(this.f244c ? 1 : 0);
        j8.a.t(parcel, s6);
    }
}
