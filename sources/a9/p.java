package a9;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
public final class p extends q6.a {
    public static final Parcelable.Creator<p> CREATOR = new c(13);
    public final int f234a;
    public final ParcelFileDescriptor f235b;

    public p(int i3, ParcelFileDescriptor parcelFileDescriptor) {
        this.f234a = i3;
        this.f235b = parcelFileDescriptor;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f234a);
        j8.a.l(parcel, 3, this.f235b, i3);
        j8.a.t(parcel, s6);
    }
}
