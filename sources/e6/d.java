package e6;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new i(2);
    public final String f8475a;
    public final int f8476b;
    public final String f8477c;

    public d(String str, int i10, String str2) {
        this.f8475a = str;
        this.f8476b = i10;
        this.f8477c = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.f8475a);
        g0.s(parcel, 3, 4);
        parcel.writeInt(this.f8476b);
        g0.l(parcel, 4, this.f8477c);
        g0.r(parcel, q6);
    }
}
