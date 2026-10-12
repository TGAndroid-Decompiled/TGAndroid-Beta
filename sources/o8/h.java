package o8;

import android.os.Parcel;
import android.os.Parcelable;
import n6.w;
import w7.g0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new m8.h(23);
    public final int f16618a;
    public final k6.a f16619b;
    public final w f16620c;

    public h(int i10, k6.a aVar, w wVar) {
        this.f16618a = i10;
        this.f16619b = aVar;
        this.f16620c = wVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 1, 4);
        parcel.writeInt(this.f16618a);
        g0.k(parcel, 2, this.f16619b, i10);
        g0.k(parcel, 3, this.f16620c, i10);
        g0.r(parcel, q6);
    }
}
