package a9;

import android.os.Parcel;
import android.os.Parcelable;
public final class g extends q6.a {
    public static final Parcelable.Creator<g> CREATOR = new c(3);
    public final int f196a;

    public g(int i3) {
        this.f196a = i3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f196a);
        j8.a.t(parcel, s6);
    }
}
