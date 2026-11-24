package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class ape extends b4 {
    public static final Parcelable.Creator<ape> CREATOR = new sje((byte) 17);
    public Bundle a;
    public o94[] b;
    public int c;
    public qt2 d;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.b(parcel, 1, this.a);
        mve.o(parcel, 2, this.b, i);
        int i2 = this.c;
        mve.q(parcel, 3, 4);
        parcel.writeInt(i2);
        mve.k(parcel, 4, this.d, i);
        mve.s(parcel, r);
    }
}
