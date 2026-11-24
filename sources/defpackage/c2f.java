package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class c2f extends b4 {
    public static final Parcelable.Creator<c2f> CREATOR = new e2f((byte) 4);
    public final byte[] a;

    public c2f(byte[] bArr) {
        this.a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.c(parcel, 1, this.a);
        mve.s(parcel, r);
    }
}
