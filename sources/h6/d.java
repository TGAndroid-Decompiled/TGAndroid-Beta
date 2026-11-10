package h6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import f7.t0;
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new t0(20);
    public final String f14234a;
    public final int f14235b;
    public final String f14236c;

    public d(String str, int i7, String str2) {
        this.f14234a = str;
        this.f14235b = i7;
        this.f14236c = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f14234a);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.f14235b);
        xb.l(parcel, 4, this.f14236c);
        xb.s(parcel, r10);
    }
}
