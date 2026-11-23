package b9;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import c8.cc;
public final class o extends r6.a {
    public static final Parcelable.Creator<o> CREATOR = new c(12);
    public final int f3005a;
    public final ParcelFileDescriptor f3006b;

    public o(int i7, ParcelFileDescriptor parcelFileDescriptor) {
        this.f3005a = i7;
        this.f3006b = parcelFileDescriptor;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f3005a);
        cc.k(parcel, 3, this.f3006b, i7);
        cc.s(parcel, r10);
    }
}
