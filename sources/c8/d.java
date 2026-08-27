package c8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class d extends z5.a {
    public static final Parcelable.Creator<d> CREATOR = new o(1);

    public h f2514a;

    public String f2515b;

    public String f2516c;
    public i[] d;

    public f[] f2517e;

    public String[] f2518f;
    public a[] h;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.k(parcel, 2, this.f2514a, i10);
        r8.l(parcel, 3, this.f2515b);
        r8.l(parcel, 4, this.f2516c);
        r8.o(parcel, 5, this.d, i10);
        r8.o(parcel, 6, this.f2517e, i10);
        r8.m(parcel, 7, this.f2518f);
        r8.o(parcel, 8, this.h, i10);
        r8.r(parcel, iQ);
    }
}
