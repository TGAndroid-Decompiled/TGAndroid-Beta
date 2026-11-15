package g6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import f7.t0;
public final class a0 extends r6.a {
    public static final Parcelable.Creator<a0> CREATOR = new t0(14);
    public final boolean f12881a;

    public a0(boolean z10) {
        this.f12881a = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f12881a ? 1 : 0);
        yb.s(parcel, r10);
    }
}
