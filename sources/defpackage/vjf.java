package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class vjf extends c4 {
    public static final Parcelable.Creator<vjf> CREATOR = new t4f((byte) 27);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;

    public vjf(int i, int i2, int i3, long j, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = j;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        bye.q(parcel, 3, 4);
        parcel.writeInt(this.c);
        bye.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        bye.q(parcel, 5, 8);
        parcel.writeLong(this.e);
        bye.s(parcel, r);
    }
}
