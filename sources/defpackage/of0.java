package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class of0 extends b4 {
    public static final Parcelable.Creator<of0> CREATOR = new urd((byte) 16);
    public sf0 a;
    public String b;
    public String c;
    public tf0[] d;
    public qf0[] e;
    public String[] f;
    public lf0[] h;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.k(parcel, 2, this.a, i);
        mve.l(parcel, 3, this.b);
        mve.l(parcel, 4, this.c);
        mve.o(parcel, 5, this.d, i);
        mve.o(parcel, 6, this.e, i);
        mve.m(parcel, 7, this.f);
        mve.o(parcel, 8, this.h, i);
        mve.s(parcel, r);
    }
}
