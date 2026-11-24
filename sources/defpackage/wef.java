package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class wef extends b4 {
    public static final Parcelable.Creator<wef> CREATOR = new yhf((byte) 1);
    public int a;
    public int b;
    public int c;
    public long d;
    public int e;

    public static wef b(in3 in3Var) {
        ?? obj = new Object();
        pd0 pd0Var = (pd0) in3Var.b;
        obj.a = pd0Var.a;
        obj.b = pd0Var.b;
        obj.e = pd0Var.c;
        obj.c = 0;
        obj.d = 0L;
        return obj;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        int i2 = this.a;
        mve.q(parcel, 2, 4);
        parcel.writeInt(i2);
        int i3 = this.b;
        mve.q(parcel, 3, 4);
        parcel.writeInt(i3);
        int i4 = this.c;
        mve.q(parcel, 4, 4);
        parcel.writeInt(i4);
        long j = this.d;
        mve.q(parcel, 5, 8);
        parcel.writeLong(j);
        int i5 = this.e;
        mve.q(parcel, 6, 4);
        parcel.writeInt(i5);
        mve.s(parcel, r);
    }
}
