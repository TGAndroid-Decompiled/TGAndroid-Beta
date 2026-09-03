package b6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class g0 extends c6.a {
    public static final Parcelable.Creator<g0> CREATOR = new w.a(26);
    public Bundle f1605a;
    public y5.c[] f1606b;
    public int f1607c;
    public e d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.b(parcel, 1, this.f1605a);
        f5.o(parcel, 2, this.f1606b, i10);
        int i11 = this.f1607c;
        f5.s(parcel, 3, 4);
        parcel.writeInt(i11);
        f5.k(parcel, 4, this.d, i10);
        f5.r(parcel, q10);
    }
}
