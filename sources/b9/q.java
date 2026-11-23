package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class q extends r6.a {
    public static final Parcelable.Creator<q> CREATOR = new c(14);
    public final int f3014a;
    public final boolean f3015b;

    public q(int i7, boolean z10) {
        this.f3014a = i7;
        this.f3015b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f3014a);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.f3015b ? 1 : 0);
        cc.s(parcel, r10);
    }
}
