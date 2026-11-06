package a8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class y6 extends r6.a {
    public static final Parcelable.Creator<y6> CREATOR = new z5(1);
    public final int f717a;
    public final float f718b;
    public final int f719c;

    public y6(int i7, int i10, float f10, int i11) {
        if (i7 == 1) {
            this.f717a = i10;
            this.f718b = f10;
            this.f719c = i11;
            return;
        }
        throw new IllegalArgumentException("Unknown language.");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 2, 4);
        parcel.writeInt(1);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.f717a);
        xb.q(parcel, 4, 4);
        parcel.writeFloat(this.f718b);
        xb.q(parcel, 5, 4);
        parcel.writeInt(this.f719c);
        xb.s(parcel, r10);
    }
}
