package e6;

import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new i(2);
    public final String f8656a;
    public final int f8657b;
    public final String f8658c;

    public d(String str, int i10, String str2) {
        this.f8656a = str;
        this.f8657b = i10;
        this.f8658c = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 2, this.f8656a);
        d0.s(parcel, 3, 4);
        parcel.writeInt(this.f8657b);
        d0.l(parcel, 4, this.f8658c);
        d0.r(parcel, q6);
    }
}
