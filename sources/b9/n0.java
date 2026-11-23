package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class n0 extends r6.a {
    public static final Parcelable.Creator<n0> CREATOR = new o0(0);
    public final int f3054a;
    public final f f3055b;

    public n0(int i7, f fVar) {
        this.f3054a = i7;
        this.f3055b = fVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f3054a);
        bc.k(parcel, 3, this.f3055b, i7);
        bc.s(parcel, r10);
    }
}
