package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class b0 extends r6.a {
    public static final Parcelable.Creator<b0> CREATOR = new c(25);
    public final int f2940a;
    public final String f2941b;

    public b0(int i7, String str) {
        this.f2940a = i7;
        this.f2941b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f2940a);
        cc.l(parcel, 3, this.f2941b);
        cc.s(parcel, r10);
    }
}
