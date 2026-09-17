package d6;

import android.os.Parcel;
import android.os.Parcelable;
import c7.r0;
import w7.e0;
public final class b0 extends o6.a {
    public static final Parcelable.Creator<b0> CREATOR = new r0(27);
    public final int f6597a;

    public b0(int i10) {
        this.f6597a = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 2, 4);
        parcel.writeInt(this.f6597a);
        e0.r(parcel, q6);
    }
}
