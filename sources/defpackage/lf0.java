package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class lf0 extends b4 {
    public static final Parcelable.Creator<lf0> CREATOR = new v6d((byte) 0);
    public int a;
    public String[] b;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        int i2 = this.a;
        mve.q(parcel, 2, 4);
        parcel.writeInt(i2);
        mve.m(parcel, 3, this.b);
        mve.s(parcel, r);
    }
}
