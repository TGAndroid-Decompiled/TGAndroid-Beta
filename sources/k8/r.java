package k8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
public final class r extends a6.a {
    public static final Parcelable.Creator<r> CREATOR = new c(13);
    public final int f13550a;
    public final ParcelFileDescriptor f13551b;

    public r(int i10, ParcelFileDescriptor parcelFileDescriptor) {
        this.f13550a = i10;
        this.f13551b = parcelFileDescriptor;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f13550a);
        com.google.android.gms.internal.cast.o.k(parcel, 3, this.f13551b, i10);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
