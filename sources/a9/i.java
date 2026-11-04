package a9;

import android.os.Parcel;
import android.os.Parcelable;
public final class i extends q6.a {
    public static final Parcelable.Creator<i> CREATOR = new c(5);
    public final int f204a;

    public i(int i3) {
        this.f204a = i3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f204a);
        j8.a.t(parcel, s6);
    }
}
