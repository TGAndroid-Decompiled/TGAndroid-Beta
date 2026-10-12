package o8;

import android.os.Parcel;
import android.os.Parcelable;
import n6.w;
import w7.c0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new m8.h(25);
    public final int f16851a;
    public final k6.a f16852b;
    public final w f16853c;

    public h(int i10, k6.a aVar, w wVar) {
        this.f16851a = i10;
        this.f16852b = aVar;
        this.f16853c = wVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.s(parcel, 1, 4);
        parcel.writeInt(this.f16851a);
        c0.k(parcel, 2, this.f16852b, i10);
        c0.k(parcel, 3, this.f16853c, i10);
        c0.r(parcel, q6);
    }
}
