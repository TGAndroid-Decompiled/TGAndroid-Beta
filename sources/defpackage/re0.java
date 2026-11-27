package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class re0 extends c4 {
    public static final Parcelable.Creator<re0> CREATOR = new g3e((byte) 24);
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
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 2, this.a);
        bye.l(parcel, 3, this.b);
        bye.l(parcel, 4, this.c);
        bye.l(parcel, 5, this.d);
        bye.l(parcel, 6, this.e);
        bye.l(parcel, 7, this.f);
        bye.l(parcel, 8, this.h);
        bye.l(parcel, 9, this.n);
        bye.l(parcel, 10, this.r);
        bye.l(parcel, 11, this.s);
        bye.l(parcel, 12, this.w);
        bye.l(parcel, 13, this.x);
        bye.l(parcel, 14, this.y);
        bye.l(parcel, 15, this.E);
        bye.s(parcel, r);
    }
}
