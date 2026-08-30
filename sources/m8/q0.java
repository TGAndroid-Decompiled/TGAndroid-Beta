package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class q0 extends c6.a {
    public static final Parcelable.Creator<q0> CREATOR = new o0(2);
    public final int f13847a;
    public final String f13848b;

    public q0(int i10, String str) {
        this.f13847a = i10;
        this.f13848b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f13847a);
        f5.l(parcel, 3, this.f13848b);
        f5.r(parcel, q10);
    }
}
