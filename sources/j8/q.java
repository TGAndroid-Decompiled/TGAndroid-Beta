package j8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class q extends c6.a {
    public static final Parcelable.Creator<q> CREATOR = new t(1);
    public String f9295a;
    public String f9296b;
    public String f9297c;
    public String d;
    public String e;
    public String f9298f;
    public String h;
    public String f9299n;
    public String f9300r;
    public boolean f9301s;
    public String v;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.f9295a);
        f5.l(parcel, 3, this.f9296b);
        f5.l(parcel, 4, this.f9297c);
        f5.l(parcel, 5, this.d);
        f5.l(parcel, 6, this.e);
        f5.l(parcel, 7, this.f9298f);
        f5.l(parcel, 8, this.h);
        f5.l(parcel, 9, this.f9299n);
        f5.l(parcel, 10, this.f9300r);
        boolean z4 = this.f9301s;
        f5.s(parcel, 11, 4);
        parcel.writeInt(z4 ? 1 : 0);
        f5.l(parcel, 12, this.v);
        f5.r(parcel, q10);
    }
}
