package a9;

import android.os.Parcel;
import android.os.Parcelable;
public final class e0 extends q6.a {
    public static final Parcelable.Creator<e0> CREATOR = new c(28);
    public final int f190a;

    public e0(int i3) {
        this.f190a = i3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f190a);
        j8.a.t(parcel, s6);
    }
}
