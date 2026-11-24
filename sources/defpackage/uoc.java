package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class uoc extends b4 {
    public static final Parcelable.Creator<uoc> CREATOR = new c0f((byte) 9);
    public String a;
    public String b;
    public pnb c;
    public r6c d;
    public r6c e;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 2, this.a);
        jte.l(parcel, 3, this.b);
        jte.k(parcel, 4, this.c, i);
        jte.k(parcel, 5, this.d, i);
        jte.k(parcel, 6, this.e, i);
        jte.s(parcel, r);
    }
}
