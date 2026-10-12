package o8;

import android.os.Parcel;
import android.os.Parcelable;
import n6.v;
import w7.g0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new m8.h(22);
    public final int f16616a;
    public final v f16617b;

    public g(int i10, v vVar) {
        this.f16616a = i10;
        this.f16617b = vVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 1, 4);
        parcel.writeInt(this.f16616a);
        g0.k(parcel, 2, this.f16617b, i10);
        g0.r(parcel, q6);
    }
}
