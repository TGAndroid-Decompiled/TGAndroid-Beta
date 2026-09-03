package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class g0 extends c6.a {
    public static final Parcelable.Creator<g0> CREATOR = new c(28);
    public final int f13527a;

    public g0(int i10) {
        this.f13527a = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f13527a);
        g5.r(parcel, q10);
    }
}
