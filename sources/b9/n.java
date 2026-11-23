package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class n extends r6.a {
    public static final Parcelable.Creator<n> CREATOR = new c(11);
    public final int f3052a;
    public final b f3053b;

    public n(int i7, b bVar) {
        this.f3052a = i7;
        this.f3053b = bVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f3052a);
        bc.k(parcel, 3, this.f3053b, i7);
        bc.s(parcel, r10);
    }
}
