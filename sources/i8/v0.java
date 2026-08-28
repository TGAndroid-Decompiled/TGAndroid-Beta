package i8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class v0 extends y5.a {
    public static final Parcelable.Creator<v0> CREATOR = new p0(6);
    public final int f11046a;
    public final int f11047b;

    public v0(int i9, int i10) {
        this.f11046a = i9;
        this.f11047b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f11046a);
        p8.s(parcel, 3, 4);
        parcel.writeInt(this.f11047b);
        p8.r(parcel, q10);
    }
}
