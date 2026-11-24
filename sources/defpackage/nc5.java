package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class nc5 extends b4 {
    public static final Parcelable.Creator<nc5> CREATOR = new igd((byte) 3);
    public final String a;
    public final byte[] b;
    public final int c;

    public nc5(int i, String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
        this.c = i;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 2, this.a);
        jte.c(parcel, 3, this.b);
        jte.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        jte.s(parcel, r);
    }
}
