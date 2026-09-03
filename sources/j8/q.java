package j8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class q extends c6.a {
    public static final Parcelable.Creator<q> CREATOR = new t(1);
    public String f9277a;
    public String f9278b;
    public String f9279c;
    public String d;
    public String e;
    public String f9280f;
    public String h;
    public String f9281n;
    public String f9282r;
    public boolean f9283s;
    public String v;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.f9277a);
        f5.l(parcel, 3, this.f9278b);
        f5.l(parcel, 4, this.f9279c);
        f5.l(parcel, 5, this.d);
        f5.l(parcel, 6, this.e);
        f5.l(parcel, 7, this.f9280f);
        f5.l(parcel, 8, this.h);
        f5.l(parcel, 9, this.f9281n);
        f5.l(parcel, 10, this.f9282r);
        boolean z4 = this.f9283s;
        f5.s(parcel, 11, 4);
        parcel.writeInt(z4 ? 1 : 0);
        f5.l(parcel, 12, this.v);
        f5.r(parcel, q10);
    }
}
