package h8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class j extends a6.a {
    public static final Parcelable.Creator<j> CREATOR = new g8.b(10);
    public boolean f7898a;
    public boolean f7899b;
    public c f7900c;
    public boolean d;
    public m f7901e;
    public ArrayList f7902f;
    public l h;
    public n f7903n;
    public boolean f7904r;
    public String f7905s;
    public Bundle v;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        boolean z10 = this.f7898a;
        com.google.android.gms.internal.cast.o.s(parcel, 1, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f7899b;
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(z11 ? 1 : 0);
        com.google.android.gms.internal.cast.o.k(parcel, 3, this.f7900c, i10);
        boolean z12 = this.d;
        com.google.android.gms.internal.cast.o.s(parcel, 4, 4);
        parcel.writeInt(z12 ? 1 : 0);
        com.google.android.gms.internal.cast.o.k(parcel, 5, this.f7901e, i10);
        com.google.android.gms.internal.cast.o.h(parcel, 6, this.f7902f);
        com.google.android.gms.internal.cast.o.k(parcel, 7, this.h, i10);
        com.google.android.gms.internal.cast.o.k(parcel, 8, this.f7903n, i10);
        boolean z13 = this.f7904r;
        com.google.android.gms.internal.cast.o.s(parcel, 9, 4);
        parcel.writeInt(z13 ? 1 : 0);
        com.google.android.gms.internal.cast.o.l(parcel, 10, this.f7905s);
        com.google.android.gms.internal.cast.o.b(parcel, 11, this.v);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
