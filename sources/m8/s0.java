package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class s0 extends c6.a {
    public static final Parcelable.Creator<s0> CREATOR = new o0(4);
    public final int f13571a;

    public s0(int i10) {
        this.f13571a = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f13571a);
        g5.r(parcel, q10);
    }
}
