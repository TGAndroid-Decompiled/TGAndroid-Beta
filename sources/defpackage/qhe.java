package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class qhe extends b4 {
    public static final Parcelable.Creator<qhe> CREATOR = new rhe((byte) 6);
    public final byte[] a;

    public qhe(byte[] bArr) {
        this.a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.c(parcel, 2, this.a);
        jte.s(parcel, r);
    }
}
