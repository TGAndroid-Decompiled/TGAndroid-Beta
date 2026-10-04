package d6;

import android.os.Parcel;
import android.os.Parcelable;
import c7.r0;
import w7.g0;
public final class b0 extends o6.a {
    public static final Parcelable.Creator<b0> CREATOR = new r0(27);
    public final int f8128a;

    public b0(int i10) {
        this.f8128a = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 2, 4);
        parcel.writeInt(this.f8128a);
        g0.r(parcel, q6);
    }
}
