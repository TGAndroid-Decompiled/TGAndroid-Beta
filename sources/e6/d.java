package e6;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new i(2);
    public final String f8861a;
    public final int f8862b;
    public final String f8863c;

    public d(String str, int i10, String str2) {
        this.f8861a = str;
        this.f8862b = i10;
        this.f8863c = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 2, this.f8861a);
        e0.s(parcel, 3, 4);
        parcel.writeInt(this.f8862b);
        e0.l(parcel, 4, this.f8863c);
        e0.r(parcel, q6);
    }
}
