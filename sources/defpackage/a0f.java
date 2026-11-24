package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class a0f extends b4 {
    public static final Parcelable.Creator<a0f> CREATOR = new c0f((byte) 4);
    public final byte[] a;

    public a0f(byte[] bArr) {
        this.a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.c(parcel, 1, this.a);
        jte.s(parcel, r);
    }
}
