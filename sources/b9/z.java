package b9;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import c8.yb;
public final class z extends r6.a {
    public static final Parcelable.Creator<z> CREATOR = new c(23);
    public final int f3083a;
    public final ParcelFileDescriptor f3084b;

    public z(int i7, ParcelFileDescriptor parcelFileDescriptor) {
        this.f3083a = i7;
        this.f3084b = parcelFileDescriptor;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f3083a);
        yb.k(parcel, 3, this.f3084b, i7 | 1);
        yb.s(parcel, r10);
    }
}
