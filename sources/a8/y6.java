package a8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class y6 extends r6.a {
    public static final Parcelable.Creator<y6> CREATOR = new z5(1);
    public final int f722a;
    public final float f723b;
    public final int f724c;

    public y6(int i7, int i10, float f10, int i11) {
        if (i7 == 1) {
            this.f722a = i10;
            this.f723b = f10;
            this.f724c = i11;
            return;
        }
        throw new IllegalArgumentException("Unknown language.");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(1);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f722a);
        bc.q(parcel, 4, 4);
        parcel.writeFloat(this.f723b);
        bc.q(parcel, 5, 4);
        parcel.writeInt(this.f724c);
        bc.s(parcel, r10);
    }
}
