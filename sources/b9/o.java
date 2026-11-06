package b9;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import c8.wb;
public final class o extends r6.a {
    public static final Parcelable.Creator<o> CREATOR = new c(12);
    public final int f3082a;
    public final ParcelFileDescriptor f3083b;

    public o(int i7, ParcelFileDescriptor parcelFileDescriptor) {
        this.f3082a = i7;
        this.f3083b = parcelFileDescriptor;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 2, 4);
        parcel.writeInt(this.f3082a);
        wb.k(parcel, 3, this.f3083b, i7);
        wb.s(parcel, r10);
    }
}
