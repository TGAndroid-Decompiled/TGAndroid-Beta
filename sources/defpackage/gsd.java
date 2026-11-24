package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class gsd extends b4 {
    public static final Parcelable.Creator<gsd> CREATOR = new urd((byte) 1);
    public final int a;
    public final int b;

    public gsd(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        mve.q(parcel, 3, 4);
        parcel.writeInt(this.b);
        mve.s(parcel, r);
    }
}
