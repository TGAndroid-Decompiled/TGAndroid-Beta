package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
public final class mwd extends c4 {
    public static final Parcelable.Creator<mwd> CREATOR = new hud((byte) 8);
    public final int a;
    public final ParcelFileDescriptor b;

    public mwd(int i, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = i;
        this.b = parcelFileDescriptor;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        bye.k(parcel, 3, this.b, i);
        bye.s(parcel, r);
    }
}
