package h6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import f7.t0;
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new t0(20);
    public final String f13898a;
    public final int f13899b;
    public final String f13900c;

    public d(String str, int i7, String str2) {
        this.f13898a = str;
        this.f13899b = i7;
        this.f13900c = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.f13898a);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.f13899b);
        cc.l(parcel, 4, this.f13900c);
        cc.s(parcel, r10);
    }
}
