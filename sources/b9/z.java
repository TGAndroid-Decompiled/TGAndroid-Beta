package b9;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import c8.bc;
public final class z extends r6.a {
    public static final Parcelable.Creator<z> CREATOR = new c(23);
    public final int f3081a;
    public final ParcelFileDescriptor f3082b;

    public z(int i7, ParcelFileDescriptor parcelFileDescriptor) {
        this.f3081a = i7;
        this.f3082b = parcelFileDescriptor;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f3081a);
        bc.k(parcel, 3, this.f3082b, i7 | 1);
        bc.s(parcel, r10);
    }
}
