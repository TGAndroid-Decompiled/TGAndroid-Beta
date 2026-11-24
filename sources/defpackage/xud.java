package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class xud extends b4 {
    public static final Parcelable.Creator<xud> CREATOR = new urd((byte) 11);
    public final int a;
    public final boolean b;
    public final boolean c;

    public xud(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        mve.q(parcel, 3, 4);
        parcel.writeInt(this.b ? 1 : 0);
        mve.q(parcel, 4, 4);
        parcel.writeInt(this.c ? 1 : 0);
        mve.s(parcel, r);
    }
}
