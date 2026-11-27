package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class jhe extends c4 {
    public static final Parcelable.Creator<jhe> CREATOR = new g3e((byte) 26);
    public final int a;
    public final int b;
    public final byte[] c;

    public jhe(int i, int i2, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        bye.c(parcel, 3, this.c);
        bye.s(parcel, r);
    }
}
