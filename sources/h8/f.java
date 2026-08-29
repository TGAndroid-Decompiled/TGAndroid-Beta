package h8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class f extends a6.a {
    public static final Parcelable.Creator<f> CREATOR = new g8.b(23);
    public String A;
    public String B;
    public ArrayList C;
    public boolean D;
    public ArrayList E;
    public ArrayList F;
    public ArrayList G;
    public i8.c H;
    public String f7877a;
    public String f7878b;
    public String f7879c;
    public String d;
    public String f7880e;
    public String f7881f;
    public String h;
    public String f7882n;
    public String f7883r;
    public String f7884s;
    public int v;
    public ArrayList f7885w;
    public i8.f f7886x;
    public ArrayList f7887y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.l(parcel, 2, this.f7877a);
        com.google.android.gms.internal.cast.o.l(parcel, 3, this.f7878b);
        com.google.android.gms.internal.cast.o.l(parcel, 4, this.f7879c);
        com.google.android.gms.internal.cast.o.l(parcel, 5, this.d);
        com.google.android.gms.internal.cast.o.l(parcel, 6, this.f7880e);
        com.google.android.gms.internal.cast.o.l(parcel, 7, this.f7881f);
        com.google.android.gms.internal.cast.o.l(parcel, 8, this.h);
        com.google.android.gms.internal.cast.o.l(parcel, 9, this.f7882n);
        com.google.android.gms.internal.cast.o.l(parcel, 10, this.f7883r);
        com.google.android.gms.internal.cast.o.l(parcel, 11, this.f7884s);
        int i11 = this.v;
        com.google.android.gms.internal.cast.o.s(parcel, 12, 4);
        parcel.writeInt(i11);
        com.google.android.gms.internal.cast.o.p(parcel, 13, this.f7885w);
        com.google.android.gms.internal.cast.o.k(parcel, 14, this.f7886x, i10);
        com.google.android.gms.internal.cast.o.p(parcel, 15, this.f7887y);
        com.google.android.gms.internal.cast.o.l(parcel, 16, this.A);
        com.google.android.gms.internal.cast.o.l(parcel, 17, this.B);
        com.google.android.gms.internal.cast.o.p(parcel, 18, this.C);
        boolean z10 = this.D;
        com.google.android.gms.internal.cast.o.s(parcel, 19, 4);
        parcel.writeInt(z10 ? 1 : 0);
        com.google.android.gms.internal.cast.o.p(parcel, 20, this.E);
        com.google.android.gms.internal.cast.o.p(parcel, 21, this.F);
        com.google.android.gms.internal.cast.o.p(parcel, 22, this.G);
        com.google.android.gms.internal.cast.o.k(parcel, 23, this.H, i10);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
