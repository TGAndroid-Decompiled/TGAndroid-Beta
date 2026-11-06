package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class l extends r6.a {
    public static final Parcelable.Creator<l> CREATOR = new c(9);
    public final int f3070a;
    public final int f3071b;

    public l(int i7, int i10) {
        this.f3070a = i7;
        this.f3071b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f3070a);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.f3071b);
        xb.s(parcel, r10);
    }
}
