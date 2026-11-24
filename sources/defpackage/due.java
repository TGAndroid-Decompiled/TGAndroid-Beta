package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class due extends b4 {
    public static final Parcelable.Creator<due> CREATOR = new sje((byte) 20);
    public final byte[] a;

    public due(byte[] bArr) {
        this.a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.c(parcel, 2, this.a);
        mve.s(parcel, r);
    }
}
