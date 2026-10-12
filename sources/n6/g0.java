package n6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class g0 extends o6.a {
    public static final Parcelable.Creator<g0> CREATOR = new m8.h(19);
    public Bundle f16409a;
    public k6.c[] f16410b;
    public int f16411c;
    public e d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.b(parcel, 1, this.f16409a);
        w7.c0.o(parcel, 2, this.f16410b, i10);
        int i11 = this.f16411c;
        w7.c0.s(parcel, 3, 4);
        parcel.writeInt(i11);
        w7.c0.k(parcel, 4, this.d, i10);
        w7.c0.r(parcel, q6);
    }
}
