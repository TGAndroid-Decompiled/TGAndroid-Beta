package b9;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import c8.yb;
public final class p extends r6.a {
    public static final Parcelable.Creator<p> CREATOR = new c(13);
    public final int f3042a;
    public final ParcelFileDescriptor f3043b;

    public p(int i7, ParcelFileDescriptor parcelFileDescriptor) {
        this.f3042a = i7;
        this.f3043b = parcelFileDescriptor;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f3042a);
        yb.k(parcel, 3, this.f3043b, i7);
        yb.s(parcel, r10);
    }
}
