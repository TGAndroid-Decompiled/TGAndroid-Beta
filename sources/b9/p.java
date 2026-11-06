package b9;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import c8.xb;
public final class p extends r6.a {
    public static final Parcelable.Creator<p> CREATOR = new c(13);
    public final int f3087a;
    public final ParcelFileDescriptor f3088b;

    public p(int i7, ParcelFileDescriptor parcelFileDescriptor) {
        this.f3087a = i7;
        this.f3088b = parcelFileDescriptor;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f3087a);
        xb.k(parcel, 3, this.f3088b, i7);
        xb.s(parcel, r10);
    }
}
