package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class ar5 extends b4 {
    public static final Parcelable.Creator<ar5> CREATOR = new e2f((byte) 8);
    public String a;
    public String b;
    public int c;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a);
        mve.l(parcel, 3, this.b);
        int i2 = this.c;
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            i2 = 0;
        }
        mve.q(parcel, 4, 4);
        parcel.writeInt(i2);
        mve.s(parcel, r);
    }
}
