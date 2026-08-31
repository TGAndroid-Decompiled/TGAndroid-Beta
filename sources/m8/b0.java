package m8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import j7.g5;
public final class b0 extends c6.a {
    public static final Parcelable.Creator<b0> CREATOR = new c(23);
    public final int f13488a;
    public final ParcelFileDescriptor f13489b;

    public b0(int i10, ParcelFileDescriptor parcelFileDescriptor) {
        this.f13488a = i10;
        this.f13489b = parcelFileDescriptor;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f13488a);
        g5.k(parcel, 3, this.f13489b, i10 | 1);
        g5.r(parcel, q10);
    }
}
