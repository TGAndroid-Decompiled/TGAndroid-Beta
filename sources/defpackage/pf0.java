package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class pf0 extends b4 {
    public static final Parcelable.Creator<pf0> CREATOR = new t0e((byte) 24);
    public String E;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String h;
    public String n;
    public String r;
    public String s;
    public String w;
    public String x;
    public String y;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a);
        mve.l(parcel, 3, this.b);
        mve.l(parcel, 4, this.c);
        mve.l(parcel, 5, this.d);
        mve.l(parcel, 6, this.e);
        mve.l(parcel, 7, this.f);
        mve.l(parcel, 8, this.h);
        mve.l(parcel, 9, this.n);
        mve.l(parcel, 10, this.r);
        mve.l(parcel, 11, this.s);
        mve.l(parcel, 12, this.w);
        mve.l(parcel, 13, this.x);
        mve.l(parcel, 14, this.y);
        mve.l(parcel, 15, this.E);
        mve.s(parcel, r);
    }
}
