package n6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class f0 extends o6.a {
    public static final Parcelable.Creator<f0> CREATOR = new m8.h(19);
    public Bundle f13857a;
    public k6.c[] f13858b;
    public int f13859c;
    public e d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.b(parcel, 1, this.f13857a);
        w7.e0.o(parcel, 2, this.f13858b, i10);
        int i11 = this.f13859c;
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(i11);
        w7.e0.k(parcel, 4, this.d, i10);
        w7.e0.r(parcel, q6);
    }
}
