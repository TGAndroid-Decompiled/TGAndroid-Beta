package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class l extends r6.a {
    public static final Parcelable.Creator<l> CREATOR = new c(9);
    public final int f3035a;
    public final int f3036b;

    public l(int i7, int i10) {
        this.f3035a = i7;
        this.f3036b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f3035a);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f3036b);
        bc.s(parcel, r10);
    }
}
