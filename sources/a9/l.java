package a9;

import android.os.Parcel;
import android.os.Parcelable;
public final class l extends q6.a {
    public static final Parcelable.Creator<l> CREATOR = new c(9);
    public final int f217a;
    public final int f218b;

    public l(int i3, int i10) {
        this.f217a = i3;
        this.f218b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f217a);
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(this.f218b);
        j8.a.t(parcel, s6);
    }
}
