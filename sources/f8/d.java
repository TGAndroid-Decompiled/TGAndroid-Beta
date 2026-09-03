package f8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class d extends c6.a {
    public static final Parcelable.Creator<d> CREATOR = new b9.e(23);
    public h f6048a;
    public String f6049b;
    public String f6050c;
    public i[] d;
    public f[] e;
    public String[] f6051f;
    public a[] h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.k(parcel, 2, this.f6048a, i10);
        f5.l(parcel, 3, this.f6049b);
        f5.l(parcel, 4, this.f6050c);
        f5.o(parcel, 5, this.d, i10);
        f5.o(parcel, 6, this.e, i10);
        f5.m(parcel, 7, this.f6051f);
        f5.o(parcel, 8, this.h, i10);
        f5.r(parcel, q10);
    }
}
