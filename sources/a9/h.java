package a9;

import android.os.Parcel;
import android.os.Parcelable;
public final class h extends q6.a {
    public static final Parcelable.Creator<h> CREATOR = new c(4);
    public final int f201a;

    public h(int i3) {
        this.f201a = i3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f201a);
        j8.a.t(parcel, s6);
    }
}
