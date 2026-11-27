package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class r4f extends c4 {
    public static final Parcelable.Creator<r4f> CREATOR = new t4f((byte) 4);
    public final byte[] a;

    public r4f(byte[] bArr) {
        this.a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.c(parcel, 1, this.a);
        bye.s(parcel, r);
    }
}
