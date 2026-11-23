package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class p0 extends r6.a {
    public static final Parcelable.Creator<p0> CREATOR = new n0(2);
    public final int f3012a;
    public final String f3013b;

    public p0(int i7, String str) {
        this.f3012a = i7;
        this.f3013b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f3012a);
        cc.l(parcel, 3, this.f3013b);
        cc.s(parcel, r10);
    }
}
