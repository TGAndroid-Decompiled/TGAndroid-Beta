package b9;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import c8.bc;
public final class o extends r6.a {
    public static final Parcelable.Creator<o> CREATOR = new c(12);
    public final int f3056a;
    public final ParcelFileDescriptor f3057b;

    public o(int i7, ParcelFileDescriptor parcelFileDescriptor) {
        this.f3056a = i7;
        this.f3057b = parcelFileDescriptor;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f3056a);
        bc.k(parcel, 3, this.f3057b, i7);
        bc.s(parcel, r10);
    }
}
