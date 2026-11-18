package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class b0 extends r6.a {
    public static final Parcelable.Creator<b0> CREATOR = new c(25);
    public final int f2970a;
    public final String f2971b;

    public b0(int i7, String str) {
        this.f2970a = i7;
        this.f2971b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f2970a);
        bc.l(parcel, 3, this.f2971b);
        bc.s(parcel, r10);
    }
}
