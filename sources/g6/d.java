package g6;

import android.os.Parcel;
import android.os.Parcelable;
import f6.c0;
public final class d extends q6.a {
    public static final Parcelable.Creator<d> CREATOR = new c0(5);
    public final String f11991a;
    public final int f11992b;
    public final String f11993c;

    public d(String str, int i3, String str2) {
        this.f11991a = str;
        this.f11992b = i3;
        this.f11993c = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.f11991a);
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(this.f11992b);
        j8.a.m(parcel, 4, this.f11993c);
        j8.a.t(parcel, s6);
    }
}
