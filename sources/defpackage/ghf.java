package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class ghf extends b4 {
    public static final Parcelable.Creator<ghf> CREATOR = new e2f((byte) 27);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;

    public ghf(int i, int i2, int i3, long j, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = j;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        mve.q(parcel, 3, 4);
        parcel.writeInt(this.c);
        mve.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        mve.q(parcel, 5, 8);
        parcel.writeLong(this.e);
        mve.s(parcel, r);
    }
}
