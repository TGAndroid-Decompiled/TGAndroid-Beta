package o8;

import android.os.Parcel;
import android.os.Parcelable;
import n6.v;
import w7.g0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new m8.h(25);
    public final int f17154a;
    public final k6.a f17155b;
    public final v f17156c;

    public h(int i10, k6.a aVar, v vVar) {
        this.f17154a = i10;
        this.f17155b = aVar;
        this.f17156c = vVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 1, 4);
        parcel.writeInt(this.f17154a);
        g0.k(parcel, 2, this.f17155b, i10);
        g0.k(parcel, 3, this.f17156c, i10);
        g0.r(parcel, q6);
    }
}
