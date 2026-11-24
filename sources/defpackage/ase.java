package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class ase extends b4 {
    public static final Parcelable.Creator<ase> CREATOR = new rhe((byte) 20);
    public final byte[] a;

    public ase(byte[] bArr) {
        this.a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.c(parcel, 2, this.a);
        jte.s(parcel, r);
    }
}
