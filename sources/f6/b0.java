package f6;

import android.os.Parcel;
import android.os.Parcelable;
public final class b0 extends q6.a {
    public static final Parcelable.Creator<b0> CREATOR = new c0(0);
    public final int f11466a;

    public b0(int i3) {
        this.f11466a = i3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f11466a);
        j8.a.t(parcel, s6);
    }
}
