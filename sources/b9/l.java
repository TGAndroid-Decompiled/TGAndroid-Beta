package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class l extends r6.a {
    public static final Parcelable.Creator<l> CREATOR = new c(9);
    public final int f3022a;
    public final int f3023b;

    public l(int i7, int i10) {
        this.f3022a = i7;
        this.f3023b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f3022a);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f3023b);
        bc.s(parcel, r10);
    }
}
