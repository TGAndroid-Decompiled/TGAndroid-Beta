package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class vcf extends b4 {
    public static final Parcelable.Creator<vcf> CREATOR = new xff((byte) 1);
    public int a;
    public int b;
    public int c;
    public long d;
    public int e;

    public static vcf b(xl3 xl3Var) {
        ?? obj = new Object();
        pc0 pc0Var = (pc0) xl3Var.b;
        obj.a = pc0Var.a;
        obj.b = pc0Var.b;
        obj.e = pc0Var.c;
        obj.c = 0;
        obj.d = 0L;
        return obj;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        int i2 = this.a;
        jte.q(parcel, 2, 4);
        parcel.writeInt(i2);
        int i3 = this.b;
        jte.q(parcel, 3, 4);
        parcel.writeInt(i3);
        int i4 = this.c;
        jte.q(parcel, 4, 4);
        parcel.writeInt(i4);
        long j = this.d;
        jte.q(parcel, 5, 8);
        parcel.writeLong(j);
        int i5 = this.e;
        jte.q(parcel, 6, 4);
        parcel.writeInt(i5);
        jte.s(parcel, r);
    }
}
