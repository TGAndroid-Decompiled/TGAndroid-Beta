package e6;

import android.os.Parcel;
import android.os.Parcelable;
import w7.c0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new i(2);
    public final String f8653a;
    public final int f8654b;
    public final String f8655c;

    public d(String str, int i10, String str2) {
        this.f8653a = str;
        this.f8654b = i10;
        this.f8655c = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.l(parcel, 2, this.f8653a);
        c0.s(parcel, 3, 4);
        parcel.writeInt(this.f8654b);
        c0.l(parcel, 4, this.f8655c);
        c0.r(parcel, q6);
    }
}
