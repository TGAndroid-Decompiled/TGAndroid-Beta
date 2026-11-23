package b9;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import c8.cc;
public final class z extends r6.a {
    public static final Parcelable.Creator<z> CREATOR = new c(23);
    public final int f3048a;
    public final ParcelFileDescriptor f3049b;

    public z(int i7, ParcelFileDescriptor parcelFileDescriptor) {
        this.f3048a = i7;
        this.f3049b = parcelFileDescriptor;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f3048a);
        cc.k(parcel, 3, this.f3049b, i7 | 1);
        cc.s(parcel, r10);
    }
}
