package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class fnd extends b4 {
    public static final Parcelable.Creator<fnd> CREATOR = new rpd((byte) 15);
    public final long a;
    public final nc5[] b;
    public final int c;
    public final boolean d;

    public fnd(long j, nc5[] nc5VarArr, int i, boolean z) {
        this.a = j;
        this.b = nc5VarArr;
        this.d = z;
        if (z) {
            this.c = i;
        } else {
            this.c = -1;
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 2, 8);
        parcel.writeLong(this.a);
        jte.o(parcel, 3, this.b, i);
        jte.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        jte.q(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        jte.s(parcel, r);
    }
}
