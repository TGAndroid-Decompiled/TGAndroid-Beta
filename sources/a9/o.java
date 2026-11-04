package a9;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
public final class o extends q6.a {
    public static final Parcelable.Creator<o> CREATOR = new c(12);
    public final int f229a;
    public final ParcelFileDescriptor f230b;

    public o(int i3, ParcelFileDescriptor parcelFileDescriptor) {
        this.f229a = i3;
        this.f230b = parcelFileDescriptor;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f229a);
        j8.a.l(parcel, 3, this.f230b, i3);
        j8.a.t(parcel, s6);
    }
}
