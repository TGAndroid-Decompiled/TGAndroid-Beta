package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class e6d extends c4 {
    public static final Parcelable.Creator<e6d> CREATOR = new s5d((byte) 4);
    public final int a;
    public final String b;
    public final long c;
    public final int d;
    public final boolean e;

    public e6d(int i, int i2, long j, String str, boolean z) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = i2;
        this.e = z;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        bye.l(parcel, 2, this.b);
        bye.q(parcel, 3, 8);
        parcel.writeLong(this.c);
        bye.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        bye.q(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        bye.s(parcel, r);
    }
}
