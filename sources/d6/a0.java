package d6;

import android.os.Parcel;
import android.os.Parcelable;
import c7.r0;
import w7.f0;
public final class a0 extends o6.a {
    public static final Parcelable.Creator<a0> CREATOR = new r0(26);
    public final boolean f7518a;

    public a0(boolean z10) {
        this.f7518a = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 2, 4);
        parcel.writeInt(this.f7518a ? 1 : 0);
        f0.r(parcel, q6);
    }
}
