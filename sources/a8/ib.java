package a8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class ib extends r6.a {
    public static final Parcelable.Creator<ib> CREATOR = new z5(3);
    public final float f493a;
    public final int f494b;

    public ib(float f10, int i7) {
        this.f493a = f10;
        this.f494b = i7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeFloat(this.f493a);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f494b);
        cc.s(parcel, r10);
    }
}
