package b9;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import c8.bc;
public final class p extends r6.a {
    public static final Parcelable.Creator<p> CREATOR = new c(13);
    public final int f3040a;
    public final ParcelFileDescriptor f3041b;

    public p(int i7, ParcelFileDescriptor parcelFileDescriptor) {
        this.f3040a = i7;
        this.f3041b = parcelFileDescriptor;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f3040a);
        bc.k(parcel, 3, this.f3041b, i7);
        bc.s(parcel, r10);
    }
}
