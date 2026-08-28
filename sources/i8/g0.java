package i8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class g0 extends y5.a {
    public static final Parcelable.Creator<g0> CREATOR = new c(28);
    public final int f10986a;

    public g0(int i9) {
        this.f10986a = i9;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f10986a);
        p8.r(parcel, q10);
    }
}
