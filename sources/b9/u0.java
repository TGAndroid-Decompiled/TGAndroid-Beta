package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class u0 extends r6.a {
    public static final Parcelable.Creator<u0> CREATOR = new o0(6);
    public final int f3069a;
    public final int f3070b;

    public u0(int i7, int i10) {
        this.f3069a = i7;
        this.f3070b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f3069a);
        yb.q(parcel, 3, 4);
        parcel.writeInt(this.f3070b);
        yb.s(parcel, r10);
    }
}
