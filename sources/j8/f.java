package j8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
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
    public String f9239a;
    public String f9240b;
    public String f9241c;
    public String d;
    public String e;
    public String f9242f;
    public String h;
    public String f9243n;
    public String f9244r;
    public String f9245s;
    public int v;
    public ArrayList f9246w;
    public k8.f f9247x;
    public ArrayList f9248y;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.f9239a);
        f5.l(parcel, 3, this.f9240b);
        f5.l(parcel, 4, this.f9241c);
        f5.l(parcel, 5, this.d);
        f5.l(parcel, 6, this.e);
        f5.l(parcel, 7, this.f9242f);
        f5.l(parcel, 8, this.h);
        f5.l(parcel, 9, this.f9243n);
        f5.l(parcel, 10, this.f9244r);
        f5.l(parcel, 11, this.f9245s);
        int i11 = this.v;
        f5.s(parcel, 12, 4);
        parcel.writeInt(i11);
        f5.p(parcel, 13, this.f9246w);
        f5.k(parcel, 14, this.f9247x, i10);
        f5.p(parcel, 15, this.f9248y);
        f5.l(parcel, 16, this.B);
        f5.l(parcel, 17, this.C);
        f5.p(parcel, 18, this.D);
        boolean z4 = this.E;
        f5.s(parcel, 19, 4);
        parcel.writeInt(z4 ? 1 : 0);
        f5.p(parcel, 20, this.F);
        f5.p(parcel, 21, this.G);
        f5.p(parcel, 22, this.H);
        f5.k(parcel, 23, this.I, i10);
        f5.r(parcel, q10);
    }
}
