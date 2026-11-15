package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class n0 extends r6.a {
    public static final Parcelable.Creator<n0> CREATOR = new o0(0);
    public final int f3040a;
    public final f f3041b;

    public n0(int i7, f fVar) {
        this.f3040a = i7;
        this.f3041b = fVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f3040a);
        yb.k(parcel, 3, this.f3041b, i7);
        yb.s(parcel, r10);
    }
}
