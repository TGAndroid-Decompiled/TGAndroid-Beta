package b8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class d extends y5.a {
    public static final Parcelable.Creator<d> CREATOR = new w.a(20);
    public h f1608a;
    public String f1609b;
    public String f1610c;
    public i[] d;
    public f[] f1611e;
    public String[] f1612f;
    public a[] h;

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.k(parcel, 2, this.f1608a, i9);
        p8.l(parcel, 3, this.f1609b);
        p8.l(parcel, 4, this.f1610c);
        p8.o(parcel, 5, this.d, i9);
        p8.o(parcel, 6, this.f1611e, i9);
        p8.m(parcel, 7, this.f1612f);
        p8.o(parcel, 8, this.h, i9);
        p8.r(parcel, q10);
    }
}
