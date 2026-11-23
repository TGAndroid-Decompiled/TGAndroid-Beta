package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class q0 extends r6.a {
    public static final Parcelable.Creator<q0> CREATOR = new o0(2);
    public final int f3066a;
    public final String f3067b;

    public q0(int i7, String str) {
        this.f3066a = i7;
        this.f3067b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f3066a);
        bc.l(parcel, 3, this.f3067b);
        bc.s(parcel, r10);
    }
}
