package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new c(3);
    public final int f3016a;

    public g(int i7) {
        this.f3016a = i7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f3016a);
        bc.s(parcel, r10);
    }
}
