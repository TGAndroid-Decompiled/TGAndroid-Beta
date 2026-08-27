package n5;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class b0 extends z5.a {
    public static final Parcelable.Creator<b0> CREATOR = new h5.h(24);

    public final boolean f18301a;

    public b0(boolean z10) {
        this.f18301a = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f18301a ? 1 : 0);
        r8.r(parcel, iQ);
    }
}
