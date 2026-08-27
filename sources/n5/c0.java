package n5;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class c0 extends z5.a {
    public static final Parcelable.Creator<c0> CREATOR = new h5.h(25);

    public final int f18311a;

    public c0(int i10) {
        this.f18311a = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f18311a);
        r8.r(parcel, iQ);
    }
}
