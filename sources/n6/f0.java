package n6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class f0 extends o6.a {
    public static final Parcelable.Creator<f0> CREATOR = new m8.i(16);
    public Bundle f13579a;
    public k6.c[] f13580b;
    public int f13581c;
    public e d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.b(parcel, 1, this.f13579a);
        w7.h0.o(parcel, 2, this.f13580b, i10);
        int i11 = this.f13581c;
        w7.h0.s(parcel, 3, 4);
        parcel.writeInt(i11);
        w7.h0.k(parcel, 4, this.d, i10);
        w7.h0.r(parcel, q6);
    }
}
