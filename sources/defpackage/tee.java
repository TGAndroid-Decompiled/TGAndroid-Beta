package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class tee extends b4 {
    public static final Parcelable.Creator<tee> CREATOR = new t0e((byte) 26);
    public final int a;
    public final int b;
    public final byte[] c;

    public tee(int i, int i2, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        mve.c(parcel, 3, this.c);
        mve.s(parcel, r);
    }
}
