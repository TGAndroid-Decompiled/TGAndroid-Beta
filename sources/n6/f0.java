package n6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class f0 extends o6.a {
    public static final Parcelable.Creator<f0> CREATOR = new m8.h(19);
    public Bundle f16679a;
    public k6.c[] f16680b;
    public int f16681c;
    public e d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.b(parcel, 1, this.f16679a);
        w7.g0.o(parcel, 2, this.f16680b, i10);
        int i11 = this.f16681c;
        w7.g0.s(parcel, 3, 4);
        parcel.writeInt(i11);
        w7.g0.k(parcel, 4, this.d, i10);
        w7.g0.r(parcel, q6);
    }
}
