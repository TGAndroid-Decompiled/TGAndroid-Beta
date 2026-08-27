package j8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import h7.r8;

public final class q extends z5.a {
    public static final Parcelable.Creator<q> CREATOR = new c(12);

    public final int f12822a;

    public final ParcelFileDescriptor f12823b;

    public q(int i10, ParcelFileDescriptor parcelFileDescriptor) {
        this.f12822a = i10;
        this.f12823b = parcelFileDescriptor;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f12822a);
        r8.k(parcel, 3, this.f12823b, i10);
        r8.r(parcel, iQ);
    }
}
