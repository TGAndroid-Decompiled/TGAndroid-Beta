package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
public final class kyd extends b4 {
    public static final Parcelable.Creator<kyd> CREATOR = new urd((byte) 26);
    public final int a;
    public final ParcelFileDescriptor b;

    public kyd(int i, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = i;
        this.b = parcelFileDescriptor;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        mve.k(parcel, 3, this.b, i | 1);
        mve.s(parcel, r);
    }
}
