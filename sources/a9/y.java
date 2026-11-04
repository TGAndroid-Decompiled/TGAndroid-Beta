package a9;

import android.os.Parcel;
import android.os.Parcelable;
public final class y extends q6.a {
    public static final Parcelable.Creator<y> CREATOR = new c(22);
    public final int f270a;
    public final String f271b;

    public y(int i3, String str) {
        this.f270a = i3;
        this.f271b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f270a);
        j8.a.m(parcel, 3, this.f271b);
        j8.a.t(parcel, s6);
    }
}
