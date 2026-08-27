package j8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class g0 extends z5.a {
    public static final Parcelable.Creator<g0> CREATOR = new c(28);

    public final int f12786a;

    public g0(int i10) {
        this.f12786a = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f12786a);
        r8.r(parcel, iQ);
    }
}
