package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class t7d extends c4 {
    public static final Parcelable.Creator<t7d> CREATOR = new s5d((byte) 12);
    public final int a;
    public final ws2 b;
    public final c8d c;

    public t7d(int i, ws2 ws2Var, c8d c8dVar) {
        this.a = i;
        this.b = ws2Var;
        this.c = c8dVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        bye.k(parcel, 2, this.b, i);
        bye.k(parcel, 3, this.c, i);
        bye.s(parcel, r);
    }
}
