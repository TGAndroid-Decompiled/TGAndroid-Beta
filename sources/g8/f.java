package g8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.ArrayList;

public final class f extends z5.a {
    public static final Parcelable.Creator<f> CREATOR = new f4.e(24);
    public String A;
    public String B;
    public ArrayList C;
    public boolean D;
    public ArrayList E;
    public ArrayList F;
    public ArrayList G;
    public h8.c H;

    public String f6730a;

    public String f6731b;

    public String f6732c;
    public String d;

    public String f6733e;

    public String f6734f;
    public String h;

    public String f6735n;

    public String f6736r;

    public String f6737s;
    public int v;

    public ArrayList f6738w;

    public h8.f f6739x;

    public ArrayList f6740y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.f6730a);
        r8.l(parcel, 3, this.f6731b);
        r8.l(parcel, 4, this.f6732c);
        r8.l(parcel, 5, this.d);
        r8.l(parcel, 6, this.f6733e);
        r8.l(parcel, 7, this.f6734f);
        r8.l(parcel, 8, this.h);
        r8.l(parcel, 9, this.f6735n);
        r8.l(parcel, 10, this.f6736r);
        r8.l(parcel, 11, this.f6737s);
        int i11 = this.v;
        r8.s(parcel, 12, 4);
        parcel.writeInt(i11);
        r8.p(parcel, 13, this.f6738w);
        r8.k(parcel, 14, this.f6739x, i10);
        r8.p(parcel, 15, this.f6740y);
        r8.l(parcel, 16, this.A);
        r8.l(parcel, 17, this.B);
        r8.p(parcel, 18, this.C);
        boolean z10 = this.D;
        r8.s(parcel, 19, 4);
        parcel.writeInt(z10 ? 1 : 0);
        r8.p(parcel, 20, this.E);
        r8.p(parcel, 21, this.F);
        r8.p(parcel, 22, this.G);
        r8.k(parcel, 23, this.H, i10);
        r8.r(parcel, iQ);
    }
}
