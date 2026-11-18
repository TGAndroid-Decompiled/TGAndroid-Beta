package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class s0 extends r6.a {
    public static final Parcelable.Creator<s0> CREATOR = new o0(4);
    public final int f3056a;

    public s0(int i7) {
        this.f3056a = i7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f3056a);
        bc.s(parcel, r10);
    }
}
