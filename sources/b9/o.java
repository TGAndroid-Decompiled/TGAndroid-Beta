package b9;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import c8.cc;
public final class o extends r6.a {
    public static final Parcelable.Creator<o> CREATOR = new c(12);
    public final int f3007a;
    public final ParcelFileDescriptor f3008b;

    public o(int i7, ParcelFileDescriptor parcelFileDescriptor) {
        this.f3007a = i7;
        this.f3008b = parcelFileDescriptor;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f3007a);
        cc.k(parcel, 3, this.f3008b, i7);
        cc.s(parcel, r10);
    }
}
