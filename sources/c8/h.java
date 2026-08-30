package c8;

import android.os.Parcel;
import android.os.Parcelable;
import b6.w;
import j7.f5;
public final class h extends c6.a {
    public static final Parcelable.Creator<h> CREATOR = new b9.e(5);
    public final int f2140a;
    public final y5.a f2141b;
    public final w f2142c;

    public h(int i10, y5.a aVar, w wVar) {
        this.f2140a = i10;
        this.f2141b = aVar;
        this.f2142c = wVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.f2140a);
        f5.k(parcel, 2, this.f2141b, i10);
        f5.k(parcel, 3, this.f2142c, i10);
        f5.r(parcel, q10);
    }
}
