package d6;

import android.os.Parcel;
import android.os.Parcelable;
import c7.r0;
import w7.h0;
public final class a0 extends o6.a {
    public static final Parcelable.Creator<a0> CREATOR = new r0(25);
    public final boolean f5751a;

    public a0(boolean z10) {
        this.f5751a = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.s(parcel, 2, 4);
        parcel.writeInt(this.f5751a ? 1 : 0);
        h0.r(parcel, q6);
    }
}
