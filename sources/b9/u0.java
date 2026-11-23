package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class u0 extends r6.a {
    public static final Parcelable.Creator<u0> CREATOR = new o0(6);
    public final int f3034a;
    public final int f3035b;

    public u0(int i7, int i10) {
        this.f3034a = i7;
        this.f3035b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f3034a);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.f3035b);
        cc.s(parcel, r10);
    }
}
