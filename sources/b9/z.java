package b9;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import c8.xb;
public final class z extends r6.a {
    public static final Parcelable.Creator<z> CREATOR = new c(23);
    public final int f3125a;
    public final ParcelFileDescriptor f3126b;

    public z(int i7, ParcelFileDescriptor parcelFileDescriptor) {
        this.f3125a = i7;
        this.f3126b = parcelFileDescriptor;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f3125a);
        xb.k(parcel, 3, this.f3126b, i7 | 1);
        xb.s(parcel, r10);
    }
}
