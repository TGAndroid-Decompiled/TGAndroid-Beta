package n6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class f0 extends o6.a {
    public static final Parcelable.Creator<f0> CREATOR = new m8.h(17);
    public Bundle f17179a;
    public k6.c[] f17180b;
    public int f17181c;
    public e d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.b(parcel, 1, this.f17179a);
        w7.f0.o(parcel, 2, this.f17180b, i10);
        int i11 = this.f17181c;
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(i11);
        w7.f0.k(parcel, 4, this.d, i10);
        w7.f0.r(parcel, q6);
    }
}
