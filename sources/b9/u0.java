package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class u0 extends r6.a {
    public static final Parcelable.Creator<u0> CREATOR = new o0(6);
    public final int f3083a;
    public final int f3084b;

    public u0(int i7, int i10) {
        this.f3083a = i7;
        this.f3084b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f3083a);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f3084b);
        bc.s(parcel, r10);
    }
}
