package e6;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new i(2);
    public final String f7984a;
    public final int f7985b;
    public final String f7986c;

    public d(String str, int i10, String str2) {
        this.f7984a = str;
        this.f7985b = i10;
        this.f7986c = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f7984a);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f7985b);
        f0.l(parcel, 4, this.f7986c);
        f0.r(parcel, q6);
    }
}
