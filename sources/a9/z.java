package a9;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
public final class z extends q6.a {
    public static final Parcelable.Creator<z> CREATOR = new c(23);
    public final int f272a;
    public final ParcelFileDescriptor f273b;

    public z(int i3, ParcelFileDescriptor parcelFileDescriptor) {
        this.f272a = i3;
        this.f273b = parcelFileDescriptor;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f272a);
        j8.a.l(parcel, 3, this.f273b, i3 | 1);
        j8.a.t(parcel, s6);
    }
}
