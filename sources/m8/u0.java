package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class u0 extends c6.a {
    public static final Parcelable.Creator<u0> CREATOR = new o0(6);
    public final int f13582a;
    public final int f13583b;

    public u0(int i10, int i11) {
        this.f13582a = i10;
        this.f13583b = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f13582a);
        g5.s(parcel, 3, 4);
        parcel.writeInt(this.f13583b);
        g5.r(parcel, q10);
    }
}
