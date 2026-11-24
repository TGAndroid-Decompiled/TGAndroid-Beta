package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class n0c extends b4 {
    public static final Parcelable.Creator<n0c> CREATOR = new v6d((byte) 25);
    public int a;
    public String b;
    public String c;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        int i2 = this.a;
        mve.q(parcel, 1, 4);
        parcel.writeInt(i2);
        mve.l(parcel, 2, this.b);
        mve.l(parcel, 3, this.c);
        mve.s(parcel, r);
    }
}
