package k8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
public final class b0 extends a6.a {
    public static final Parcelable.Creator<b0> CREATOR = new c(23);
    public final int f13471a;
    public final ParcelFileDescriptor f13472b;

    public b0(int i10, ParcelFileDescriptor parcelFileDescriptor) {
        this.f13471a = i10;
        this.f13472b = parcelFileDescriptor;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f13471a);
        com.google.android.gms.internal.cast.o.k(parcel, 3, this.f13472b, i10 | 1);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
