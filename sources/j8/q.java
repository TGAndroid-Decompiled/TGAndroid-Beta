package j8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class q extends c6.a {
    public static final Parcelable.Creator<q> CREATOR = new t(1);
    public String f9925a;
    public String f9926b;
    public String f9927c;
    public String d;
    public String f9928e;
    public String f9929f;
    public String h;
    public String f9930n;
    public String f9931r;
    public boolean f9932s;
    public String v;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.f9925a);
        g5.l(parcel, 3, this.f9926b);
        g5.l(parcel, 4, this.f9927c);
        g5.l(parcel, 5, this.d);
        g5.l(parcel, 6, this.f9928e);
        g5.l(parcel, 7, this.f9929f);
        g5.l(parcel, 8, this.h);
        g5.l(parcel, 9, this.f9930n);
        g5.l(parcel, 10, this.f9931r);
        boolean z4 = this.f9932s;
        g5.s(parcel, 11, 4);
        parcel.writeInt(z4 ? 1 : 0);
        g5.l(parcel, 12, this.v);
        g5.r(parcel, q10);
    }
}
