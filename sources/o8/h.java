package o8;

import android.os.Parcel;
import android.os.Parcelable;
import m8.i;
import n6.v;
import w7.h0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new i(22);
    public final int f14110a;
    public final k6.a f14111b;
    public final v f14112c;

    public h(int i10, k6.a aVar, v vVar) {
        this.f14110a = i10;
        this.f14111b = aVar;
        this.f14112c = vVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.s(parcel, 1, 4);
        parcel.writeInt(this.f14110a);
        h0.k(parcel, 2, this.f14111b, i10);
        h0.k(parcel, 3, this.f14112c, i10);
        h0.r(parcel, q6);
    }
}
