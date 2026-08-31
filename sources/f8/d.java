package f8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class d extends c6.a {
    public static final Parcelable.Creator<d> CREATOR = new b9.e(23);
    public h f6174a;
    public String f6175b;
    public String f6176c;
    public i[] d;
    public f[] f6177e;
    public String[] f6178f;
    public a[] h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.k(parcel, 2, this.f6174a, i10);
        g5.l(parcel, 3, this.f6175b);
        g5.l(parcel, 4, this.f6176c);
        g5.o(parcel, 5, this.d, i10);
        g5.o(parcel, 6, this.f6177e, i10);
        g5.m(parcel, 7, this.f6178f);
        g5.o(parcel, 8, this.h, i10);
        g5.r(parcel, q10);
    }
}
