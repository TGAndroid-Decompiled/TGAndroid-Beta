package g6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import f7.t0;
public final class a0 extends r6.a {
    public static final Parcelable.Creator<a0> CREATOR = new t0(14);
    public final boolean f13532a;

    public a0(boolean z9) {
        this.f13532a = z9;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f13532a ? 1 : 0);
        xb.s(parcel, r10);
    }
}
