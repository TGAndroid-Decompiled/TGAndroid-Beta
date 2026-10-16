package o8;

import android.os.Parcel;
import android.os.Parcelable;
import n6.v;
import w7.f0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new m8.h(23);
    public final int f16311a;
    public final k6.a f16312b;
    public final v f16313c;

    public h(int i10, k6.a aVar, v vVar) {
        this.f16311a = i10;
        this.f16312b = aVar;
        this.f16313c = vVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f16311a);
        f0.k(parcel, 2, this.f16312b, i10);
        f0.k(parcel, 3, this.f16313c, i10);
        f0.r(parcel, q6);
    }
}
