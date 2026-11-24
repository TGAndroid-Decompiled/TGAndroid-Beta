package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class fff extends b4 {
    public static final Parcelable.Creator<fff> CREATOR = new c0f((byte) 27);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;

    public fff(int i, int i2, int i3, long j, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = j;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        jte.q(parcel, 3, 4);
        parcel.writeInt(this.c);
        jte.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        jte.q(parcel, 5, 8);
        parcel.writeLong(this.e);
        jte.s(parcel, r);
    }
}
