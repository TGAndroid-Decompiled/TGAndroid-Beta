package o8;

import android.os.Parcel;
import android.os.Parcelable;
import n6.v;
import w7.c0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new m8.h(24);
    public final int f16849a;
    public final v f16850b;

    public g(int i10, v vVar) {
        this.f16849a = i10;
        this.f16850b = vVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.s(parcel, 1, 4);
        parcel.writeInt(this.f16849a);
        c0.k(parcel, 2, this.f16850b, i10);
        c0.r(parcel, q6);
    }
}
