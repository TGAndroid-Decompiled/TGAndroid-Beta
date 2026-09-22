package o8;

import android.os.Parcel;
import android.os.Parcelable;
import n6.u;
import w7.f0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new m8.h(24);
    public final int f15683a;
    public final u f15684b;

    public g(int i10, u uVar) {
        this.f15683a = i10;
        this.f15684b = uVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f15683a);
        f0.k(parcel, 2, this.f15684b, i10);
        f0.r(parcel, q6);
    }
}
