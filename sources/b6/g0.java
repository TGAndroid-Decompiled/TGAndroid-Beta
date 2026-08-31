package b6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class g0 extends c6.a {
    public static final Parcelable.Creator<g0> CREATOR = new w.a(26);
    public Bundle f1724a;
    public y5.c[] f1725b;
    public int f1726c;
    public e d;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.b(parcel, 1, this.f1724a);
        g5.o(parcel, 2, this.f1725b, i10);
        int i11 = this.f1726c;
        g5.s(parcel, 3, 4);
        parcel.writeInt(i11);
        g5.k(parcel, 4, this.d, i10);
        g5.r(parcel, q10);
    }
}
