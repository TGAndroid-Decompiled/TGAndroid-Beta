package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class nf0 extends b4 {
    public static final Parcelable.Creator<nf0> CREATOR = new t0e((byte) 1);
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public mf0 f;
    public mf0 h;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a);
        mve.l(parcel, 3, this.b);
        mve.l(parcel, 4, this.c);
        mve.l(parcel, 5, this.d);
        mve.l(parcel, 6, this.e);
        mve.k(parcel, 7, this.f, i);
        mve.k(parcel, 8, this.h, i);
        mve.s(parcel, r);
    }
}
