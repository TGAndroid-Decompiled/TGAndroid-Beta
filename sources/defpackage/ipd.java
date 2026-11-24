package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class ipd extends b4 {
    public static final Parcelable.Creator<ipd> CREATOR = new urd((byte) 15);
    public final long a;
    public final le5[] b;
    public final int c;
    public final boolean d;

    public ipd(long j, le5[] le5VarArr, int i, boolean z) {
        this.a = j;
        this.b = le5VarArr;
        this.d = z;
        if (z) {
            this.c = i;
        } else {
            this.c = -1;
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 2, 8);
        parcel.writeLong(this.a);
        mve.o(parcel, 3, this.b, i);
        mve.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        mve.q(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        mve.s(parcel, r);
    }
}
