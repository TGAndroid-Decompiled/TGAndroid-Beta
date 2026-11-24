package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class rje extends b4 {
    public static final Parcelable.Creator<rje> CREATOR = new sje((byte) 6);
    public final byte[] a;

    public rje(byte[] bArr) {
        this.a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.c(parcel, 2, this.a);
        mve.s(parcel, r);
    }
}
