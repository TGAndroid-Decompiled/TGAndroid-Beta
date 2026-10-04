package e6;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new i(2);
    public final String f8662a;
    public final int f8663b;
    public final String f8664c;

    public d(String str, int i10, String str2) {
        this.f8662a = str;
        this.f8663b = i10;
        this.f8664c = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.f8662a);
        g0.s(parcel, 3, 4);
        parcel.writeInt(this.f8663b);
        g0.l(parcel, 4, this.f8664c);
        g0.r(parcel, q6);
    }
}
