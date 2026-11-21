package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class n extends r6.a {
    public static final Parcelable.Creator<n> CREATOR = new c(11);
    public final int f3045a;
    public final b f3046b;

    public n(int i7, b bVar) {
        this.f3045a = i7;
        this.f3046b = bVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f3045a);
        bc.k(parcel, 3, this.f3046b, i7);
        bc.s(parcel, r10);
    }
}
