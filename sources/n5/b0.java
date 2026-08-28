package n5;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import m6.r0;
public final class b0 extends y5.a {
    public static final Parcelable.Creator<b0> CREATOR = new r0(25);
    public final boolean f18474a;

    public b0(boolean z10) {
        this.f18474a = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f18474a ? 1 : 0);
        p8.r(parcel, q10);
    }
}
