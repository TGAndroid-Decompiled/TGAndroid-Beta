package g6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import f7.t0;
public final class a0 extends r6.a {
    public static final Parcelable.Creator<a0> CREATOR = new t0(14);
    public final boolean f13227a;

    public a0(boolean z10) {
        this.f13227a = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f13227a ? 1 : 0);
        bc.s(parcel, r10);
    }
}
