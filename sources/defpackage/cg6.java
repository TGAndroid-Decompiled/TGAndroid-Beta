package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class cg6 extends b4 {
    public static final Parcelable.Creator<cg6> CREATOR = new rhe((byte) 10);
    public String a;
    public dg6 b;
    public pnb c;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 2, this.a);
        jte.k(parcel, 3, this.b, i);
        jte.k(parcel, 5, this.c, i);
        jte.s(parcel, r);
    }
}
