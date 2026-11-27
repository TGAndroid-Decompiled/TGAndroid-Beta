package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class lhf extends c4 {
    public static final Parcelable.Creator<lhf> CREATOR = new nkf((byte) 1);
    public int a;
    public int b;
    public int c;
    public long d;
    public int e;

    public static lhf b(pm3 pm3Var) {
        ?? obj = new Object();
        rc0 rc0Var = (rc0) pm3Var.b;
        obj.a = rc0Var.a;
        obj.b = rc0Var.b;
        obj.e = rc0Var.c;
        obj.c = 0;
        obj.d = 0L;
        return obj;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        int i2 = this.a;
        bye.q(parcel, 2, 4);
        parcel.writeInt(i2);
        int i3 = this.b;
        bye.q(parcel, 3, 4);
        parcel.writeInt(i3);
        int i4 = this.c;
        bye.q(parcel, 4, 4);
        parcel.writeInt(i4);
        long j = this.d;
        bye.q(parcel, 5, 8);
        parcel.writeLong(j);
        int i5 = this.e;
        bye.q(parcel, 6, 4);
        parcel.writeInt(i5);
        bye.s(parcel, r);
    }
}
