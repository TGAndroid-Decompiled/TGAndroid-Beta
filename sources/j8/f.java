package j8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.ArrayList;
public final class f extends c6.a {
    public static final Parcelable.Creator<f> CREATOR = new t(7);
    public String B;
    public String C;
    public ArrayList D;
    public boolean E;
    public ArrayList F;
    public ArrayList G;
    public ArrayList H;
    public k8.c I;
    public String f9884a;
    public String f9885b;
    public String f9886c;
    public String d;
    public String f9887e;
    public String f9888f;
    public String h;
    public String f9889n;
    public String f9890r;
    public String f9891s;
    public int v;
    public ArrayList f9892w;
    public k8.f f9893x;
    public ArrayList f9894y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.f9884a);
        g5.l(parcel, 3, this.f9885b);
        g5.l(parcel, 4, this.f9886c);
        g5.l(parcel, 5, this.d);
        g5.l(parcel, 6, this.f9887e);
        g5.l(parcel, 7, this.f9888f);
        g5.l(parcel, 8, this.h);
        g5.l(parcel, 9, this.f9889n);
        g5.l(parcel, 10, this.f9890r);
        g5.l(parcel, 11, this.f9891s);
        int i11 = this.v;
        g5.s(parcel, 12, 4);
        parcel.writeInt(i11);
        g5.p(parcel, 13, this.f9892w);
        g5.k(parcel, 14, this.f9893x, i10);
        g5.p(parcel, 15, this.f9894y);
        g5.l(parcel, 16, this.B);
        g5.l(parcel, 17, this.C);
        g5.p(parcel, 18, this.D);
        boolean z4 = this.E;
        g5.s(parcel, 19, 4);
        parcel.writeInt(z4 ? 1 : 0);
        g5.p(parcel, 20, this.F);
        g5.p(parcel, 21, this.G);
        g5.p(parcel, 22, this.H);
        g5.k(parcel, 23, this.I, i10);
        g5.r(parcel, q10);
    }
}
