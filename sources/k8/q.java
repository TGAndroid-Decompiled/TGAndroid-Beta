package k8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
public final class q extends a6.a {
    public static final Parcelable.Creator<q> CREATOR = new c(12);
    public final int f13545a;
    public final ParcelFileDescriptor f13546b;

    public q(int i10, ParcelFileDescriptor parcelFileDescriptor) {
        this.f13545a = i10;
        this.f13546b = parcelFileDescriptor;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f13545a);
        com.google.android.gms.internal.cast.o.k(parcel, 3, this.f13546b, i10);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
