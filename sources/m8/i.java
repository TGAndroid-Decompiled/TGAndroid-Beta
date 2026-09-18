package m8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class i extends o6.a {
    public static final Parcelable.Creator<i> CREATOR = new h(1);
    public final int f14932a;
    public final boolean f14933b;

    public i(int i10, boolean z10) {
        this.f14932a = i10;
        this.f14933b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 2, 4);
        parcel.writeInt(this.f14932a);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f14933b ? 1 : 0);
        f0.r(parcel, q6);
    }
}
