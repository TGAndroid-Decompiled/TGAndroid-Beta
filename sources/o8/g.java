package o8;

import android.os.Parcel;
import android.os.Parcelable;
import n6.u;
import w7.g0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new m8.h(24);
    public final int f17143a;
    public final u f17144b;

    public g(int i10, u uVar) {
        this.f17143a = i10;
        this.f17144b = uVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 1, 4);
        parcel.writeInt(this.f17143a);
        g0.k(parcel, 2, this.f17144b, i10);
        g0.r(parcel, q6);
    }
}
