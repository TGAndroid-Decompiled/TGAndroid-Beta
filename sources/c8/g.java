package c8;

import android.os.Parcel;
import android.os.Parcelable;
import b6.v;
import j7.g5;
public final class g extends c6.a {
    public static final Parcelable.Creator<g> CREATOR = new b9.e(4);
    public final int f2325a;
    public final v f2326b;

    public g(int i10, v vVar) {
        this.f2325a = i10;
        this.f2326b = vVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 4);
        parcel.writeInt(this.f2325a);
        g5.k(parcel, 2, this.f2326b, i10);
        g5.r(parcel, q10);
    }
}
