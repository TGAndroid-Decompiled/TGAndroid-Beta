package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class qd6 extends c4 {
    public static final Parcelable.Creator<qd6> CREATOR = new m9d((byte) 8);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public qd6(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        bye.q(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        bye.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        bye.q(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        bye.q(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        bye.s(parcel, r);
    }
}
