package e6;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new i(2);
    public final String f8000a;
    public final int f8001b;
    public final String f8002c;

    public d(String str, int i10, String str2) {
        this.f8000a = str;
        this.f8001b = i10;
        this.f8002c = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f8000a);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f8001b);
        f0.l(parcel, 4, this.f8002c);
        f0.r(parcel, q6);
    }
}
