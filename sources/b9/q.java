package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class q extends r6.a {
    public static final Parcelable.Creator<q> CREATOR = new c(14);
    public final int f3091a;
    public final boolean f3092b;

    public q(int i7, boolean z9) {
        this.f3091a = i7;
        this.f3092b = z9;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f3091a);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.f3092b ? 1 : 0);
        xb.s(parcel, r10);
    }
}
