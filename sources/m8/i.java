package m8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class i extends o6.a {
    public static final Parcelable.Creator<i> CREATOR = new h(1);
    public final int f16338a;
    public final boolean f16339b;

    public i(int i10, boolean z10) {
        this.f16338a = i10;
        this.f16339b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 2, 4);
        parcel.writeInt(this.f16338a);
        g0.s(parcel, 3, 4);
        parcel.writeInt(this.f16339b ? 1 : 0);
        g0.r(parcel, q6);
    }
}
