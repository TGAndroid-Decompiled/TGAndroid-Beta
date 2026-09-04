package o8;

import android.os.Parcel;
import android.os.Parcelable;
import n6.v;
import w7.e0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new m8.h(25);
    public final int f16985a;
    public final k6.a f16986b;
    public final v f16987c;

    public h(int i10, k6.a aVar, v vVar) {
        this.f16985a = i10;
        this.f16986b = aVar;
        this.f16987c = vVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.f16985a);
        e0.k(parcel, 2, this.f16986b, i10);
        e0.k(parcel, 3, this.f16987c, i10);
        e0.r(parcel, q6);
    }
}
