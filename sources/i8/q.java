package i8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import g7.p8;
public final class q extends y5.a {
    public static final Parcelable.Creator<q> CREATOR = new c(12);
    public final int f11022a;
    public final ParcelFileDescriptor f11023b;

    public q(int i9, ParcelFileDescriptor parcelFileDescriptor) {
        this.f11022a = i9;
        this.f11023b = parcelFileDescriptor;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f11022a);
        p8.k(parcel, 3, this.f11023b, i9);
        p8.r(parcel, q10);
    }
}
