package i8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import g7.p8;
public final class b0 extends y5.a {
    public static final Parcelable.Creator<b0> CREATOR = new c(23);
    public final int f10948a;
    public final ParcelFileDescriptor f10949b;

    public b0(int i9, ParcelFileDescriptor parcelFileDescriptor) {
        this.f10948a = i9;
        this.f10949b = parcelFileDescriptor;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f10948a);
        p8.k(parcel, 3, this.f10949b, i9 | 1);
        p8.r(parcel, q10);
    }
}
