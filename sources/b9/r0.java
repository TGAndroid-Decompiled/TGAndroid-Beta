package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class r0 extends r6.a {
    public static final Parcelable.Creator<r0> CREATOR = new o0(3);
    public final int f3064a;
    public final k f3065b;

    public r0(int i7, k kVar) {
        this.f3064a = i7;
        this.f3065b = kVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f3064a);
        bc.k(parcel, 3, this.f3065b, i7);
        bc.s(parcel, r10);
    }
}
