package a8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class hb extends r6.a {
    public static final Parcelable.Creator<hb> CREATOR = new z5(3);
    public final float f480a;
    public final int f481b;

    public hb(float f10, int i7) {
        this.f480a = f10;
        this.f481b = i7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeFloat(this.f480a);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f481b);
        xb.s(parcel, r10);
    }
}
