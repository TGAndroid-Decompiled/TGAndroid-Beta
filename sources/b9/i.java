package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class i extends r6.a {
    public static final Parcelable.Creator<i> CREATOR = new c(5);
    public final int f3057a;

    public i(int i7) {
        this.f3057a = i7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f3057a);
        xb.s(parcel, r10);
    }
}
