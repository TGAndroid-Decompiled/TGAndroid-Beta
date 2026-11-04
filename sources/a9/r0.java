package a9;

import android.os.Parcel;
import android.os.Parcelable;
public final class r0 extends q6.a {
    public static final Parcelable.Creator<r0> CREATOR = new n0(4);
    public final int f245a;

    public r0(int i3) {
        this.f245a = i3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f245a);
        j8.a.t(parcel, s6);
    }
}
