package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class em5 extends b4 {
    public static final Parcelable.Creator<em5> CREATOR = new t0e((byte) 21);
    public final int a;
    public final int b;
    public final int c;

    public em5(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        mve.q(parcel, 3, 4);
        parcel.writeInt(this.b);
        mve.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        mve.s(parcel, r);
    }
}
