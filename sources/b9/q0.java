package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class q0 extends r6.a {
    public static final Parcelable.Creator<q0> CREATOR = new o0(2);
    public final int f3052a;
    public final String f3053b;

    public q0(int i7, String str) {
        this.f3052a = i7;
        this.f3053b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f3052a);
        yb.l(parcel, 3, this.f3053b);
        yb.s(parcel, r10);
    }
}
