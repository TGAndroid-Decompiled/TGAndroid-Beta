package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class sce extends b4 {
    public static final Parcelable.Creator<sce> CREATOR = new qyd((byte) 26);
    public final int a;
    public final int b;
    public final byte[] c;

    public sce(int i, int i2, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        jte.c(parcel, 3, this.c);
        jte.s(parcel, r);
    }
}
