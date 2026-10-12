package o8;

import android.os.Parcel;
import android.os.Parcelable;
import n6.v;
import w7.c0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new m8.h(24);
    public final int f16848a;
    public final v f16849b;

    public g(int i10, v vVar) {
        this.f16848a = i10;
        this.f16849b = vVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.s(parcel, 1, 4);
        parcel.writeInt(this.f16848a);
        c0.k(parcel, 2, this.f16849b, i10);
        c0.r(parcel, q6);
    }
}
