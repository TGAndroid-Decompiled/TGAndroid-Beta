package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class rwe extends c4 {
    public static final Parcelable.Creator<rwe> CREATOR = new ime((byte) 20);
    public final byte[] a;

    public rwe(byte[] bArr) {
        this.a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.c(parcel, 2, this.a);
        bye.s(parcel, r);
    }
}
