package a9;

import android.os.Parcel;
import android.os.Parcelable;
public final class q0 extends q6.a {
    public static final Parcelable.Creator<q0> CREATOR = new n0(3);
    public final int f240a;
    public final k f241b;

    public q0(int i3, k kVar) {
        this.f240a = i3;
        this.f241b = kVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f240a);
        j8.a.l(parcel, 3, this.f241b, i3);
        j8.a.t(parcel, s6);
    }
}
