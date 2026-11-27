package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class wrd extends c4 {
    public static final Parcelable.Creator<wrd> CREATOR = new hud((byte) 15);
    public final long a;
    public final oe5[] b;
    public final int c;
    public final boolean d;

    public wrd(long j, oe5[] oe5VarArr, int i, boolean z) {
        this.a = j;
        this.b = oe5VarArr;
        this.d = z;
        if (z) {
            this.c = i;
        } else {
            this.c = -1;
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 2, 8);
        parcel.writeLong(this.a);
        bye.o(parcel, 3, this.b, i);
        bye.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        bye.q(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        bye.s(parcel, r);
    }
}
