package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
public final class lrd extends b4 {
    public static final Parcelable.Creator<lrd> CREATOR = new rpd((byte) 5);
    public final int a;
    public final ParcelFileDescriptor b;

    public lrd(int i, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = i;
        this.b = parcelFileDescriptor;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        jte.k(parcel, 3, this.b, i);
        jte.s(parcel, r);
    }
}
