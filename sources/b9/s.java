package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class s extends r6.a {
    public static final Parcelable.Creator<s> CREATOR = new c(16);
    public final int f3054a;
    public final boolean f3055b;

    public s(int i7, boolean z10) {
        this.f3054a = i7;
        this.f3055b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f3054a);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f3055b ? 1 : 0);
        bc.s(parcel, r10);
    }
}
