package m8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;
public final class i extends o6.a {
    public static final Parcelable.Creator<i> CREATOR = new h(1);
    public final int f16282a;
    public final boolean f16283b;

    public i(int i10, boolean z10) {
        this.f16282a = i10;
        this.f16283b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.s(parcel, 2, 4);
        parcel.writeInt(this.f16282a);
        d0.s(parcel, 3, 4);
        parcel.writeInt(this.f16283b ? 1 : 0);
        d0.r(parcel, q6);
    }
}
