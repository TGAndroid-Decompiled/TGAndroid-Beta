package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class xme extends b4 {
    public static final Parcelable.Creator<xme> CREATOR = new rhe((byte) 17);
    public Bundle a;
    public f84[] b;
    public int c;
    public fs2 d;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.b(parcel, 1, this.a);
        jte.o(parcel, 2, this.b, i);
        int i2 = this.c;
        jte.q(parcel, 3, 4);
        parcel.writeInt(i2);
        jte.k(parcel, 4, this.d, i);
        jte.s(parcel, r);
    }
}
