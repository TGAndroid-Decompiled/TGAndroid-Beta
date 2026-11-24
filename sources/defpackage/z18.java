package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class z18 extends b4 {
    public static final Parcelable.Creator<z18> CREATOR = new v6d((byte) 15);
    public int a;
    public Bundle b;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        int i2 = this.a;
        mve.q(parcel, 2, 4);
        parcel.writeInt(i2);
        mve.b(parcel, 3, this.b);
        mve.s(parcel, r);
    }
}
