package o8;

import android.os.Parcel;
import android.os.Parcelable;
import n6.w;
import w7.d0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new m8.h(25);
    public final int f17102a;
    public final k6.a f17103b;
    public final w f17104c;

    public h(int i10, k6.a aVar, w wVar) {
        this.f17102a = i10;
        this.f17103b = aVar;
        this.f17104c = wVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.s(parcel, 1, 4);
        parcel.writeInt(this.f17102a);
        d0.k(parcel, 2, this.f17103b, i10);
        d0.k(parcel, 3, this.f17104c, i10);
        d0.r(parcel, q6);
    }
}
