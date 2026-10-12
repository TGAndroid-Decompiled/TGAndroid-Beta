package m8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class i extends o6.a {
    public static final Parcelable.Creator<i> CREATOR = new h(1);
    public final int f15716a;
    public final boolean f15717b;

    public i(int i10, boolean z10) {
        this.f15716a = i10;
        this.f15717b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 2, 4);
        parcel.writeInt(this.f15716a);
        g0.s(parcel, 3, 4);
        parcel.writeInt(this.f15717b ? 1 : 0);
        g0.r(parcel, q6);
    }
}
