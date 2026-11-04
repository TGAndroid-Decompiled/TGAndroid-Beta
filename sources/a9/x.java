package a9;

import android.os.Parcel;
import android.os.Parcelable;
public final class x extends q6.a {
    public static final Parcelable.Creator<x> CREATOR = new c(21);
    public final int f267a;
    public final k f268b;

    public x(int i3, k kVar) {
        this.f267a = i3;
        this.f268b = kVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f267a);
        j8.a.l(parcel, 3, this.f268b, i3);
        j8.a.t(parcel, s6);
    }
}
