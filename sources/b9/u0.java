package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class u0 extends r6.a {
    public static final Parcelable.Creator<u0> CREATOR = new o0(6);
    public final int f3076a;
    public final int f3077b;

    public u0(int i7, int i10) {
        this.f3076a = i7;
        this.f3077b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f3076a);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f3077b);
        bc.s(parcel, r10);
    }
}
