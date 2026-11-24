package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class y18 extends b4 {
    public static final Parcelable.Creator<y18> CREATOR = new v6d((byte) 13);
    public int a;
    public String b;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        int i2 = this.a;
        mve.q(parcel, 2, 4);
        parcel.writeInt(i2);
        mve.l(parcel, 3, this.b);
        mve.s(parcel, r);
    }
}
