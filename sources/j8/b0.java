package j8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import h7.r8;

public final class b0 extends z5.a {
    public static final Parcelable.Creator<b0> CREATOR = new c(23);

    public final int f12749a;

    public final ParcelFileDescriptor f12750b;

    public b0(int i10, ParcelFileDescriptor parcelFileDescriptor) {
        this.f12749a = i10;
        this.f12750b = parcelFileDescriptor;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f12749a);
        r8.k(parcel, 3, this.f12750b, i10 | 1);
        r8.r(parcel, iQ);
    }
}
