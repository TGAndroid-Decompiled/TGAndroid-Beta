package c8;

import android.os.Parcel;
import android.os.Parcelable;
import b6.w;
import j7.g5;
public final class h extends c6.a {
    public static final Parcelable.Creator<h> CREATOR = new b9.e(5);
    public final int f2327a;
    public final y5.a f2328b;
    public final w f2329c;

    public h(int i10, y5.a aVar, w wVar) {
        this.f2327a = i10;
        this.f2328b = aVar;
        this.f2329c = wVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 4);
        parcel.writeInt(this.f2327a);
        g5.k(parcel, 2, this.f2328b, i10);
        g5.k(parcel, 3, this.f2329c, i10);
        g5.r(parcel, q10);
    }
}
