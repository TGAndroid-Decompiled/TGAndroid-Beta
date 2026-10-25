package f6;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class d extends p6.a {
    public static final Parcelable.Creator<d> CREATOR = new i(2);
    public final String f10200a;
    public final int f10201b;
    public final String f10202c;

    public d(String str, int i10, String str2) {
        this.f10200a = str;
        this.f10201b = i10;
        this.f10202c = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.f10200a);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.f10201b);
        df.l(parcel, 4, this.f10202c);
        df.r(parcel, q5);
    }
}
