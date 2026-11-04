package a9;

import android.os.Parcel;
import android.os.Parcelable;
public final class t0 extends q6.a {
    public static final Parcelable.Creator<t0> CREATOR = new n0(6);
    public final int f253a;
    public final int f254b;

    public t0(int i3, int i10) {
        this.f253a = i3;
        this.f254b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f253a);
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(this.f254b);
        j8.a.t(parcel, s6);
    }
}
