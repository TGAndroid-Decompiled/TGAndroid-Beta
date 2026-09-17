package m8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class i extends o6.a {
    public static final Parcelable.Creator<i> CREATOR = new h(1);
    public final int f16169a;
    public final boolean f16170b;

    public i(int i10, boolean z10) {
        this.f16169a = i10;
        this.f16170b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 2, 4);
        parcel.writeInt(this.f16169a);
        e0.s(parcel, 3, 4);
        parcel.writeInt(this.f16170b ? 1 : 0);
        e0.r(parcel, q6);
    }
}
