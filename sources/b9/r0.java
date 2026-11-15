package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class r0 extends r6.a {
    public static final Parcelable.Creator<r0> CREATOR = new o0(3);
    public final int f3057a;
    public final k f3058b;

    public r0(int i7, k kVar) {
        this.f3057a = i7;
        this.f3058b = kVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f3057a);
        yb.k(parcel, 3, this.f3058b, i7);
        yb.s(parcel, r10);
    }
}
