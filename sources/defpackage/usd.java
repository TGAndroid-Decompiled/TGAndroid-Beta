package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class usd extends b4 {
    public static final Parcelable.Creator<usd> CREATOR = new rpd((byte) 11);
    public final int a;
    public final boolean b;
    public final boolean c;

    public usd(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        jte.q(parcel, 3, 4);
        parcel.writeInt(this.b ? 1 : 0);
        jte.q(parcel, 4, 4);
        parcel.writeInt(this.c ? 1 : 0);
        jte.s(parcel, r);
    }
}
