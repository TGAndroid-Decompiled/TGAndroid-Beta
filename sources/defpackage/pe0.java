package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class pe0 extends b4 {
    public static final Parcelable.Creator<pe0> CREATOR = new qyd((byte) 24);
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
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 2, this.a);
        jte.l(parcel, 3, this.b);
        jte.l(parcel, 4, this.c);
        jte.l(parcel, 5, this.d);
        jte.l(parcel, 6, this.e);
        jte.l(parcel, 7, this.f);
        jte.l(parcel, 8, this.h);
        jte.l(parcel, 9, this.n);
        jte.l(parcel, 10, this.r);
        jte.l(parcel, 11, this.s);
        jte.l(parcel, 12, this.w);
        jte.l(parcel, 13, this.x);
        jte.l(parcel, 14, this.y);
        jte.l(parcel, 15, this.E);
        jte.s(parcel, r);
    }
}
