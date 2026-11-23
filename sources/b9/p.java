package b9;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import c8.cc;
public final class p extends r6.a {
    public static final Parcelable.Creator<p> CREATOR = new c(13);
    public final int f3010a;
    public final ParcelFileDescriptor f3011b;

    public p(int i7, ParcelFileDescriptor parcelFileDescriptor) {
        this.f3010a = i7;
        this.f3011b = parcelFileDescriptor;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f3010a);
        cc.k(parcel, 3, this.f3011b, i7);
        cc.s(parcel, r10);
    }
}
