package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
public final class hwd extends b4 {
    public static final Parcelable.Creator<hwd> CREATOR = new rpd((byte) 26);
    public final int a;
    public final ParcelFileDescriptor b;

    public hwd(int i, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = i;
        this.b = parcelFileDescriptor;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        jte.k(parcel, 3, this.b, i | 1);
        jte.s(parcel, r);
    }
}
