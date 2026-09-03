package m8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import j7.f5;
public final class q extends c6.a {
    public static final Parcelable.Creator<q> CREATOR = new c(12);
    public final int f13829a;
    public final ParcelFileDescriptor f13830b;

    public q(int i10, ParcelFileDescriptor parcelFileDescriptor) {
        this.f13829a = i10;
        this.f13830b = parcelFileDescriptor;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f13829a);
        f5.k(parcel, 3, this.f13830b, i10);
        f5.r(parcel, q10);
    }
}
