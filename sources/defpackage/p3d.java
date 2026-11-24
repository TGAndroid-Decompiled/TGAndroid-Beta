package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class p3d extends b4 {
    public static final Parcelable.Creator<p3d> CREATOR = new d3d((byte) 4);
    public final int a;
    public final String b;
    public final long c;
    public final int d;
    public final boolean e;

    public p3d(int i, int i2, long j, String str, boolean z) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = i2;
        this.e = z;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        mve.l(parcel, 2, this.b);
        mve.q(parcel, 3, 8);
        parcel.writeLong(this.c);
        mve.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        mve.q(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        mve.s(parcel, r);
    }
}
