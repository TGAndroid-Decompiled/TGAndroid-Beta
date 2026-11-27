package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class ii6 extends c4 {
    public static final Parcelable.Creator<ii6> CREATOR = new t4f((byte) 20);
    public ArrayList E;
    public String F;
    public String G;
    public ArrayList H;
    public boolean I;
    public ArrayList J;
    public ArrayList K;
    public ArrayList L;
    public gi6 M;
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
    public prb y;

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
        int i2 = this.w;
        bye.q(parcel, 12, 4);
        parcel.writeInt(i2);
        bye.p(parcel, 13, this.x);
        bye.k(parcel, 14, this.y, i);
        bye.p(parcel, 15, this.E);
        bye.l(parcel, 16, this.F);
        bye.l(parcel, 17, this.G);
        bye.p(parcel, 18, this.H);
        boolean z = this.I;
        bye.q(parcel, 19, 4);
        parcel.writeInt(z ? 1 : 0);
        bye.p(parcel, 20, this.J);
        bye.p(parcel, 21, this.K);
        bye.p(parcel, 22, this.L);
        bye.k(parcel, 23, this.M, i);
        bye.s(parcel, r);
    }
}
