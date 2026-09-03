package m8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import j7.f5;
public final class b0 extends c6.a {
    public static final Parcelable.Creator<b0> CREATOR = new c(23);
    public final int f13760a;
    public final ParcelFileDescriptor f13761b;

    public b0(int i10, ParcelFileDescriptor parcelFileDescriptor) {
        this.f13760a = i10;
        this.f13761b = parcelFileDescriptor;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f13760a);
        f5.k(parcel, 3, this.f13761b, i10 | 1);
        f5.r(parcel, q10);
    }
}
