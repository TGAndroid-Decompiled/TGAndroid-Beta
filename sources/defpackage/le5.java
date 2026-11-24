package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class le5 extends b4 {
    public static final Parcelable.Creator<le5> CREATOR = new jid((byte) 3);
    public final String a;
    public final byte[] b;
    public final int c;

    public le5(int i, String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
        this.c = i;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a);
        mve.c(parcel, 3, this.b);
        mve.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        mve.s(parcel, r);
    }
}
