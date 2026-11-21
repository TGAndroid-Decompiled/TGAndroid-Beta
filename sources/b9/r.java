package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class r extends r6.a {
    public static final Parcelable.Creator<r> CREATOR = new c(15);
    public final int f3061a;
    public final boolean f3062b;
    public final boolean f3063c;

    public r(int i7, boolean z10, boolean z11) {
        this.f3061a = i7;
        this.f3062b = z10;
        this.f3063c = z11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f3061a);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f3062b ? 1 : 0);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.f3063c ? 1 : 0);
        bc.s(parcel, r10);
    }
}
