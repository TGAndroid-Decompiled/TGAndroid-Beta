package a9;

import android.os.Parcel;
import android.os.Parcelable;
public final class p0 extends q6.a {
    public static final Parcelable.Creator<p0> CREATOR = new n0(2);
    public final int f236a;
    public final String f237b;

    public p0(int i3, String str) {
        this.f236a = i3;
        this.f237b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f236a);
        j8.a.m(parcel, 3, this.f237b);
        j8.a.t(parcel, s6);
    }
}
