package a9;

import android.os.Parcel;
import android.os.Parcelable;
public final class b0 extends q6.a {
    public static final Parcelable.Creator<b0> CREATOR = new c(25);
    public final int f165a;
    public final String f166b;

    public b0(int i3, String str) {
        this.f165a = i3;
        this.f166b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f165a);
        j8.a.m(parcel, 3, this.f166b);
        j8.a.t(parcel, s6);
    }
}
