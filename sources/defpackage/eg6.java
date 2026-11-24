package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class eg6 extends b4 {
    public static final Parcelable.Creator<eg6> CREATOR = new c0f((byte) 20);
    public ArrayList E;
    public String F;
    public String G;
    public ArrayList H;
    public boolean I;
    public ArrayList J;
    public ArrayList K;
    public ArrayList L;
    public cg6 M;
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
    public int w;
    public ArrayList x;
    public pnb y;

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
        int i2 = this.w;
        jte.q(parcel, 12, 4);
        parcel.writeInt(i2);
        jte.p(parcel, 13, this.x);
        jte.k(parcel, 14, this.y, i);
        jte.p(parcel, 15, this.E);
        jte.l(parcel, 16, this.F);
        jte.l(parcel, 17, this.G);
        jte.p(parcel, 18, this.H);
        boolean z = this.I;
        jte.q(parcel, 19, 4);
        parcel.writeInt(z ? 1 : 0);
        jte.p(parcel, 20, this.J);
        jte.p(parcel, 21, this.K);
        jte.p(parcel, 22, this.L);
        jte.k(parcel, 23, this.M, i);
        jte.s(parcel, r);
    }
}
