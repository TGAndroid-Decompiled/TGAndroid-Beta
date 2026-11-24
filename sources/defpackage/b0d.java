package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class b0d extends b4 {
    public static final Parcelable.Creator<b0d> CREATOR = new hv6((byte) 22);
    public final int a;
    public final String b;
    public final int c;

    public b0d(int i, int i2, String str) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = i2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        jte.l(parcel, 2, this.b);
        jte.q(parcel, 3, 4);
        parcel.writeInt(this.c);
        jte.s(parcel, r);
    }
}
