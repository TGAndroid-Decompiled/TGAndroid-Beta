package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class m0 extends r6.a {
    public static final Parcelable.Creator<m0> CREATOR = new n0(0);
    public final int f3000a;
    public final f f3001b;

    public m0(int i7, f fVar) {
        this.f3000a = i7;
        this.f3001b = fVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f3000a);
        cc.k(parcel, 3, this.f3001b, i7);
        cc.s(parcel, r10);
    }
}
