package a9;

import android.os.Parcel;
import android.os.Parcelable;
public final class t extends q6.a {
    public static final Parcelable.Creator<t> CREATOR = new c(17);
    public final int f251a;
    public final String f252b;

    public t(int i3, String str) {
        this.f251a = i3;
        this.f252b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f251a);
        j8.a.m(parcel, 3, this.f252b);
        j8.a.t(parcel, s6);
    }
}
