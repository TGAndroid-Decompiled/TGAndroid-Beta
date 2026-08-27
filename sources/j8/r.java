package j8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import h7.r8;

public final class r extends z5.a {
    public static final Parcelable.Creator<r> CREATOR = new c(13);

    public final int f12826a;

    public final ParcelFileDescriptor f12827b;

    public r(int i10, ParcelFileDescriptor parcelFileDescriptor) {
        this.f12826a = i10;
        this.f12827b = parcelFileDescriptor;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f12826a);
        r8.k(parcel, 3, this.f12827b, i10);
        r8.r(parcel, iQ);
    }
}
