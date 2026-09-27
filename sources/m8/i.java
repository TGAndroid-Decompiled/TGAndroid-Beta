package m8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class i extends o6.a {
    public static final Parcelable.Creator<i> CREATOR = new h(1);
    public final int f15002a;
    public final boolean f15003b;

    public i(int i10, boolean z10) {
        this.f15002a = i10;
        this.f15003b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 2, 4);
        parcel.writeInt(this.f15002a);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f15003b ? 1 : 0);
        f0.r(parcel, q6);
    }
}
