package d6;

import android.os.Parcel;
import android.os.Parcelable;
import c7.r0;
import w7.f0;
public final class b0 extends o6.a {
    public static final Parcelable.Creator<b0> CREATOR = new r0(27);
    public final int f7513a;

    public b0(int i10) {
        this.f7513a = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 2, 4);
        parcel.writeInt(this.f7513a);
        f0.r(parcel, q6);
    }
}
