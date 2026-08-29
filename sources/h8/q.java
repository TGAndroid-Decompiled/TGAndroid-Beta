package h8;

import android.os.Parcel;
import android.os.Parcelable;
public final class q extends a6.a {
    public static final Parcelable.Creator<q> CREATOR = new g8.b(17);
    public String f7918a;
    public String f7919b;
    public String f7920c;
    public String d;
    public String f7921e;
    public String f7922f;
    public String h;
    public String f7923n;
    public String f7924r;
    public boolean f7925s;
    public String v;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.l(parcel, 2, this.f7918a);
        com.google.android.gms.internal.cast.o.l(parcel, 3, this.f7919b);
        com.google.android.gms.internal.cast.o.l(parcel, 4, this.f7920c);
        com.google.android.gms.internal.cast.o.l(parcel, 5, this.d);
        com.google.android.gms.internal.cast.o.l(parcel, 6, this.f7921e);
        com.google.android.gms.internal.cast.o.l(parcel, 7, this.f7922f);
        com.google.android.gms.internal.cast.o.l(parcel, 8, this.h);
        com.google.android.gms.internal.cast.o.l(parcel, 9, this.f7923n);
        com.google.android.gms.internal.cast.o.l(parcel, 10, this.f7924r);
        boolean z10 = this.f7925s;
        com.google.android.gms.internal.cast.o.s(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        com.google.android.gms.internal.cast.o.l(parcel, 12, this.v);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
