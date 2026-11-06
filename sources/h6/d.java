package h6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import f7.t0;
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new t0(20);
    public final String f14232a;
    public final int f14233b;
    public final String f14234c;

    public d(String str, int i7, String str2) {
        this.f14232a = str;
        this.f14233b = i7;
        this.f14234c = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f14232a);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.f14233b);
        xb.l(parcel, 4, this.f14234c);
        xb.s(parcel, r10);
    }
}
