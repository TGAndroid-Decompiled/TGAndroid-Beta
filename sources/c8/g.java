package c8;

import android.os.Parcel;
import android.os.Parcelable;
import b6.v;
import j7.f5;
public final class g extends c6.a {
    public static final Parcelable.Creator<g> CREATOR = new b9.e(4);
    public final int f2161a;
    public final v f2162b;

    public g(int i10, v vVar) {
        this.f2161a = i10;
        this.f2162b = vVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.f2161a);
        f5.k(parcel, 2, this.f2162b, i10);
        f5.r(parcel, q10);
    }
}
