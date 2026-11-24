package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class tkd extends b4 {
    public static final Parcelable.Creator<tkd> CREATOR = new jid((byte) 13);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public tkd(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        mve.q(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        mve.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        mve.q(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        mve.s(parcel, r);
    }
}
