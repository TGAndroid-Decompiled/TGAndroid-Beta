package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class ei6 extends b4 {
    public static final Parcelable.Creator<ei6> CREATOR = new e2f((byte) 20);
    public ArrayList E;
    public String F;
    public String G;
    public ArrayList H;
    public boolean I;
    public ArrayList J;
    public ArrayList K;
    public ArrayList L;
    public ci6 M;
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
    public qpb y;

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
        int i2 = this.w;
        mve.q(parcel, 12, 4);
        parcel.writeInt(i2);
        mve.p(parcel, 13, this.x);
        mve.k(parcel, 14, this.y, i);
        mve.p(parcel, 15, this.E);
        mve.l(parcel, 16, this.F);
        mve.l(parcel, 17, this.G);
        mve.p(parcel, 18, this.H);
        boolean z = this.I;
        mve.q(parcel, 19, 4);
        parcel.writeInt(z ? 1 : 0);
        mve.p(parcel, 20, this.J);
        mve.p(parcel, 21, this.K);
        mve.p(parcel, 22, this.L);
        mve.k(parcel, 23, this.M, i);
        mve.s(parcel, r);
    }
}
