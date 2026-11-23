package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class q0 extends r6.a {
    public static final Parcelable.Creator<q0> CREATOR = new o0(2);
    public final int f3017a;
    public final String f3018b;

    public q0(int i7, String str) {
        this.f3017a = i7;
        this.f3018b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f3017a);
        cc.l(parcel, 3, this.f3018b);
        cc.s(parcel, r10);
    }
}
