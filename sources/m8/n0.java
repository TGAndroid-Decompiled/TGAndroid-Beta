package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class n0 extends c6.a {
    public static final Parcelable.Creator<n0> CREATOR = new o0(0);
    public final int f13819a;
    public final f f13820b;

    public n0(int i10, f fVar) {
        this.f13819a = i10;
        this.f13820b = fVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f13819a);
        f5.k(parcel, 3, this.f13820b, i10);
        f5.r(parcel, q10);
    }
}
