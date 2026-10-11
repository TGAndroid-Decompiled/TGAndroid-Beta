package n6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class g0 extends o6.a {
    public static final Parcelable.Creator<g0> CREATOR = new m8.h(19);
    public Bundle f16742a;
    public k6.c[] f16743b;
    public int f16744c;
    public e d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.b(parcel, 1, this.f16742a);
        w7.d0.o(parcel, 2, this.f16743b, i10);
        int i11 = this.f16744c;
        w7.d0.s(parcel, 3, 4);
        parcel.writeInt(i11);
        w7.d0.k(parcel, 4, this.d, i10);
        w7.d0.r(parcel, q6);
    }
}
