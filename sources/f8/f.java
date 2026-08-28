package f8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.ArrayList;
public final class f extends y5.a {
    public static final Parcelable.Creator<f> CREATOR = new r(11);
    public String A;
    public String B;
    public ArrayList C;
    public boolean D;
    public ArrayList E;
    public ArrayList F;
    public ArrayList G;
    public g8.c H;
    public String f5929a;
    public String f5930b;
    public String f5931c;
    public String d;
    public String f5932e;
    public String f5933f;
    public String h;
    public String f5934n;
    public String f5935r;
    public String f5936s;
    public int v;
    public ArrayList f5937w;
    public g8.f f5938x;
    public ArrayList f5939y;

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.f5929a);
        p8.l(parcel, 3, this.f5930b);
        p8.l(parcel, 4, this.f5931c);
        p8.l(parcel, 5, this.d);
        p8.l(parcel, 6, this.f5932e);
        p8.l(parcel, 7, this.f5933f);
        p8.l(parcel, 8, this.h);
        p8.l(parcel, 9, this.f5934n);
        p8.l(parcel, 10, this.f5935r);
        p8.l(parcel, 11, this.f5936s);
        int i10 = this.v;
        p8.s(parcel, 12, 4);
        parcel.writeInt(i10);
        p8.p(parcel, 13, this.f5937w);
        p8.k(parcel, 14, this.f5938x, i9);
        p8.p(parcel, 15, this.f5939y);
        p8.l(parcel, 16, this.A);
        p8.l(parcel, 17, this.B);
        p8.p(parcel, 18, this.C);
        boolean z10 = this.D;
        p8.s(parcel, 19, 4);
        parcel.writeInt(z10 ? 1 : 0);
        p8.p(parcel, 20, this.E);
        p8.p(parcel, 21, this.F);
        p8.p(parcel, 22, this.G);
        p8.k(parcel, 23, this.H, i9);
        p8.r(parcel, q10);
    }
}
