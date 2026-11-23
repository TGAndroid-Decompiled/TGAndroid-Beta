package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class n0 extends r6.a {
    public static final Parcelable.Creator<n0> CREATOR = new o0(0);
    public final int f3005a;
    public final f f3006b;

    public n0(int i7, f fVar) {
        this.f3005a = i7;
        this.f3006b = fVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f3005a);
        cc.k(parcel, 3, this.f3006b, i7);
        cc.s(parcel, r10);
    }
}
