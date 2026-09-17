package o8;

import android.os.Parcel;
import android.os.Parcelable;
import n6.u;
import w7.e0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new m8.h(24);
    public final int f16983a;
    public final u f16984b;

    public g(int i10, u uVar) {
        this.f16983a = i10;
        this.f16984b = uVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.f16983a);
        e0.k(parcel, 2, this.f16984b, i10);
        e0.r(parcel, q6);
    }
}
