package a8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
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
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(1);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.f722a);
        cc.q(parcel, 4, 4);
        parcel.writeFloat(this.f723b);
        cc.q(parcel, 5, 4);
        parcel.writeInt(this.f724c);
        cc.s(parcel, r10);
    }
}
