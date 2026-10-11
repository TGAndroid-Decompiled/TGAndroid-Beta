package o8;

import android.os.Parcel;
import android.os.Parcelable;
import n6.v;
import w7.d0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new m8.h(24);
    public final int f17182a;
    public final v f17183b;

    public g(int i10, v vVar) {
        this.f17182a = i10;
        this.f17183b = vVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.s(parcel, 1, 4);
        parcel.writeInt(this.f17182a);
        d0.k(parcel, 2, this.f17183b, i10);
        d0.r(parcel, q6);
    }
}
