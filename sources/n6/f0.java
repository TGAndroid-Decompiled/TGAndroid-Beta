package n6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class f0 extends o6.a {
    public static final Parcelable.Creator<f0> CREATOR = new m8.h(17);
    public Bundle f17172a;
    public k6.c[] f17173b;
    public int f17174c;
    public e d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.b(parcel, 1, this.f17172a);
        w7.f0.o(parcel, 2, this.f17173b, i10);
        int i11 = this.f17174c;
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(i11);
        w7.f0.k(parcel, 4, this.d, i10);
        w7.f0.r(parcel, q6);
    }
}
