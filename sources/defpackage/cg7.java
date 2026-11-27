package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class cg7 extends c4 {
    public static final Parcelable.Creator<cg7> CREATOR = new s5d((byte) 13);
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final String f;
    public final String h;
    public final int n;
    public final int r;

    public cg7(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = j2;
        this.f = str;
        this.h = str2;
        this.n = i4;
        this.r = i5;
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
        bye.q(parcel, 4, 8);
        parcel.writeLong(this.d);
        bye.q(parcel, 5, 8);
        parcel.writeLong(this.e);
        bye.l(parcel, 6, this.f);
        bye.l(parcel, 7, this.h);
        bye.q(parcel, 8, 4);
        parcel.writeInt(this.n);
        bye.q(parcel, 9, 4);
        parcel.writeInt(this.r);
        bye.s(parcel, r);
    }
}
