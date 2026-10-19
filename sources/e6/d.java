package e6;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new i(2);
    public final String f8355a;
    public final int f8356b;
    public final String f8357c;

    public d(String str, int i10, String str2) {
        this.f8355a = str;
        this.f8356b = i10;
        this.f8357c = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f8355a);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f8356b);
        f0.l(parcel, 4, this.f8357c);
        f0.r(parcel, q6);
    }
}
